package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.Random;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r10 extends FrameLayout implements org.telegram.messenger.cs, VoIPService.StateListener {
    public float E;
    public final int F;
    public final fh0 G;
    public final ch0 H;
    public long I;
    public final boolean J;
    public final Random K;
    public boolean L;
    public final q10[] M;
    public boolean N;
    public float O;
    public float P;
    public final OvershootInterpolator Q;
    public float R;
    public final Paint a;
    public final q9 b;
    public final q9 c;
    public float d;
    public float e;
    public float f;
    public q10 h;
    public q10 n;
    public float r;
    public boolean s;
    public float w;
    public final LinearGradient x;
    public final Matrix y;

    public r10(int i3, Context context, boolean z10) {
        super(context);
        this.a = new Paint(1);
        this.b = new q9(8);
        this.c = new q9(9);
        this.r = 1.0f;
        this.y = new Matrix();
        this.E = 0.0f;
        this.K = new Random();
        this.M = new q10[4];
        this.Q = new OvershootInterpolator();
        this.J = z10;
        this.F = i3;
        for (int i10 = 0; i10 < 4; i10++) {
            this.M[i10] = new q10(i10);
        }
        this.b.b = org.telegram.messenger.g0.L(37.0f);
        this.b.a = org.telegram.messenger.g0.L(32.0f);
        this.c.b = org.telegram.messenger.g0.L(37.0f);
        this.c.a = org.telegram.messenger.g0.L(32.0f);
        this.b.b();
        this.c.b();
        ch0 ch0Var = new ch0(R.raw.voice_outlined, org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(30.0f), true, null);
        this.H = ch0Var;
        setWillNotDraw(false);
        fh0 fh0Var = new fh0(context);
        this.G = fh0Var;
        fh0Var.setAnimation(ch0Var);
        fh0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(fh0Var);
        this.x = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(350.0f), 0.0f, new int[]{-2801343, -561538, 0}, new float[]{0.0f, 0.4f, 1.0f}, Shader.TileMode.CLAMP);
        if (z10) {
            setState(0);
        }
    }

    private void setAmplitude(double d) {
        float min = (float) (Math.min(8500.0d, d) / 8500.0d);
        this.e = min;
        this.f = (min - this.d) / 265.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.groupCall == null) {
            return;
        }
        int callState = sharedInstance.getCallState();
        if (callState == 1 || callState == 2 || callState == 6 || callState == 5) {
            setState(2);
            return;
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId());
        if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || org.telegram.messenger.t3.w(14, sharedInstance.getChat())) {
            setState(sharedInstance.isMicMute() ? 1 : 0);
            return;
        }
        if (!sharedInstance.isMicMute()) {
            sharedInstance.setMicMute(true, false, false);
        }
        setState(3);
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        if (getParent() != null) {
            ((View) getParent()).dispatchTouchEvent(obtain);
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.N4) {
            setAmplitude(((Float) objArr[0]).floatValue() * 4000.0f);
        } else if (i3 == org.telegram.messenger.hs.w2) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.J) {
            return;
        }
        setAmplitude(0.0d);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.N4);
        org.telegram.messenger.hs.f(this.F).c(this, org.telegram.messenger.hs.w2);
        boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        int i3 = z10 ? 13 : 24;
        ch0 ch0Var = this.H;
        ch0Var.P(i3);
        ch0Var.N(ch0Var.f - 1, false, true);
        a();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        int i3 = z10 ? 13 : 24;
        ch0 ch0Var = this.H;
        if (ch0Var.P(i3)) {
            if (z10) {
                ch0Var.M(0);
            } else {
                ch0Var.M(12);
            }
        }
        this.G.d();
        a();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.s0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraSwitch(boolean z10) {
        org.telegram.messenger.voip.s0.c(this, z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.J) {
            return;
        }
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.N4);
        org.telegram.messenger.hs.f(this.F).n(this, org.telegram.messenger.hs.w2);
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0166  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [android.graphics.Shader, boolean[]] */
    /* JADX WARN: Type inference failed for: r12v37 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        boolean z10;
        float f10;
        float f11;
        boolean z11;
        int i3;
        boolean z12;
        int i10;
        float f12;
        float f13;
        int i11;
        float f14;
        super.onDraw(canvas);
        if (getAlpha() == 0.0f) {
            return;
        }
        int i12 = 1;
        float measuredWidth = getMeasuredWidth() >> 1;
        float measuredHeight = getMeasuredHeight() >> 1;
        boolean z13 = this.N;
        if (z13) {
            float f15 = this.O;
            if (f15 != 1.0f) {
                float f16 = f15 + 0.10666667f;
                this.O = f16;
                if (f16 > 1.0f) {
                    this.O = 1.0f;
                }
                float interpolation = xq.f.getInterpolation(this.O) * 0.1f;
                float f17 = interpolation + 1.0f;
                fh0 fh0Var = this.G;
                fh0Var.setScaleY(f17);
                fh0Var.setScaleX(f17);
                z10 = this.J;
                if (z10) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - this.I > 1000) {
                        this.I = currentTimeMillis;
                        float e10 = a1.g.e(Math.abs(this.K.nextInt() % 100), 0.5f, 100.0f, 0.5f);
                        this.e = e10;
                        this.f = (e10 - this.d) / 595.0f;
                    }
                }
                f10 = this.e;
                f11 = this.d;
                if (f10 != f11) {
                    float f18 = this.f;
                    float f19 = (16.0f * f18) + f11;
                    this.d = f19;
                    if (f18 > 0.0f) {
                        if (f19 > f10) {
                            this.d = f10;
                        }
                    } else if (f19 < f10) {
                        this.d = f10;
                    }
                }
                ?? r12 = 0;
                if (this.n != null) {
                    float f20 = this.r + 0.064f;
                    this.r = f20;
                    if (f20 > 1.0f) {
                        this.r = 1.0f;
                        this.n = null;
                    }
                }
                z11 = this.s;
                if (z11) {
                    float f21 = this.w;
                    if (f21 != 1.0f) {
                        float f22 = f21 + 0.045714285f;
                        this.w = f22;
                        if (f22 > 1.0f) {
                            this.w = 1.0f;
                        }
                        if (this.L) {
                            invalidate();
                        }
                        int i13 = this.h.i;
                        i3 = 3;
                        int i14 = 2;
                        z12 = i13 == 3 && i13 != 2;
                        if (z12) {
                            float f23 = this.E;
                            if (f23 != 1.0f) {
                                float f24 = f23 + 0.045714285f;
                                this.E = f24;
                                if (f24 > 1.0f) {
                                    this.E = 1.0f;
                                }
                                float interpolation2 = (this.Q.getInterpolation(this.E) * 0.35f) + 0.65f;
                                float f25 = this.d;
                                float f26 = 1.0f;
                                float f27 = !z10 ? 0.1f : 0.8f;
                                float f28 = 0.0f;
                                q9 q9Var = this.b;
                                q9Var.e(f25, f27);
                                float f29 = this.d;
                                float f30 = !z10 ? 0.1f : 0.8f;
                                q9 q9Var2 = this.c;
                                q9Var2.e(f29, f30);
                                i10 = 0;
                                while (i10 < i3) {
                                    if (i10 != 0 || this.n != null) {
                                        Paint paint = this.a;
                                        if (i10 != 0) {
                                            if (i10 == i12) {
                                                q10 q10Var = this.h;
                                                if (q10Var == null) {
                                                    return;
                                                }
                                                if (this.w != f26) {
                                                    f12 = this.n != null ? this.r : f26;
                                                    q10Var.a(this.d);
                                                    q10 q10Var2 = this.h;
                                                    if (q10Var2.i == i14) {
                                                        paint.setShader(r12);
                                                        paint.setColor(org.telegram.ui.ActionBar.k6.x0(r12, org.telegram.ui.ActionBar.k6.Ph, false));
                                                    } else {
                                                        paint.setShader(q10Var2.g);
                                                    }
                                                }
                                                f13 = f26;
                                                i11 = 1;
                                            } else {
                                                if (this.w != f28) {
                                                    paint.setColor(-65536);
                                                    Matrix matrix = this.y;
                                                    matrix.reset();
                                                    matrix.postTranslate((f26 - this.w) * (-org.telegram.messenger.g0.L(250.0f)), f28);
                                                    matrix.postRotate(this.R, measuredWidth, measuredHeight);
                                                    LinearGradient linearGradient = this.x;
                                                    linearGradient.setLocalMatrix(matrix);
                                                    paint.setShader(linearGradient);
                                                    f12 = f26;
                                                }
                                                f13 = f26;
                                                i11 = 1;
                                            }
                                            i10++;
                                            i12 = i11;
                                            f26 = f13;
                                            r12 = 0;
                                            i3 = 3;
                                            f28 = 0.0f;
                                        } else if (this.w != f26) {
                                            f12 = f26 - this.r;
                                            this.n.a(this.d);
                                            q10 q10Var3 = this.n;
                                            if (q10Var3.i == i14) {
                                                paint.setShader(r12);
                                                paint.setColor(org.telegram.ui.ActionBar.k6.x0(r12, org.telegram.ui.ActionBar.k6.Ph, false));
                                            } else {
                                                paint.setShader(q10Var3.g);
                                            }
                                        }
                                        q9Var.b = org.telegram.messenger.g0.L(40.0f);
                                        q9Var.a = org.telegram.messenger.g0.L(32.0f);
                                        q9Var2.b = org.telegram.messenger.g0.L(38.0f);
                                        q9Var2.a = org.telegram.messenger.g0.L(33.0f);
                                        if (i10 != i14) {
                                            f14 = 32.0f;
                                            paint.setAlpha((int) ((f26 - this.w) * 76.0f * f12));
                                        } else {
                                            f14 = 32.0f;
                                            paint.setAlpha((int) (76.0f * f12 * this.w));
                                        }
                                        if (this.E != 0.0f) {
                                            f13 = f26;
                                            float min = Math.min((f13 - this.P) * t4.c.c(this.d, 0.3f, f13, interpolation), 1.3f) * interpolation2;
                                            canvas.save();
                                            canvas.scale(min, min, measuredWidth, measuredHeight);
                                            q9Var.a(measuredWidth, measuredHeight, canvas, paint);
                                            canvas.restore();
                                            float min2 = Math.min((f13 - this.P) * t4.c.c(this.d, 0.26f, f13, interpolation), 1.3f) * interpolation2;
                                            canvas.save();
                                            canvas.scale(min2, min2, measuredWidth, measuredHeight);
                                            q9Var2.a(measuredWidth, measuredHeight, canvas, paint);
                                            canvas.restore();
                                        } else {
                                            f13 = f26;
                                        }
                                        i14 = 2;
                                        if (i10 == 2) {
                                            paint.setAlpha((int) (this.w * 255.0f));
                                            i11 = 1;
                                        } else {
                                            i11 = 1;
                                            if (i10 == 1) {
                                                paint.setAlpha((int) (f12 * 255.0f));
                                            } else {
                                                paint.setAlpha(org.telegram.messenger.hs.e4);
                                            }
                                        }
                                        canvas.save();
                                        canvas.scale(f17, f17, measuredWidth, measuredHeight);
                                        canvas.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(f14), paint);
                                        canvas.restore();
                                        i10++;
                                        i12 = i11;
                                        f26 = f13;
                                        r12 = 0;
                                        i3 = 3;
                                        f28 = 0.0f;
                                    }
                                    i11 = i12;
                                    f13 = f26;
                                    i10++;
                                    i12 = i11;
                                    f26 = f13;
                                    r12 = 0;
                                    i3 = 3;
                                    f28 = 0.0f;
                                }
                                if (!this.L || this.E <= 0.0f) {
                                    return;
                                }
                                invalidate();
                                return;
                            }
                        }
                        if (!z12) {
                            float f31 = this.E;
                            if (f31 != 0.0f) {
                                float f32 = f31 - 0.045714285f;
                                this.E = f32;
                                if (f32 < 0.0f) {
                                    this.E = 0.0f;
                                }
                            }
                        }
                        float interpolation22 = (this.Q.getInterpolation(this.E) * 0.35f) + 0.65f;
                        float f252 = this.d;
                        float f262 = 1.0f;
                        if (!z10) {
                        }
                        float f282 = 0.0f;
                        q9 q9Var3 = this.b;
                        q9Var3.e(f252, f27);
                        float f292 = this.d;
                        if (!z10) {
                        }
                        q9 q9Var22 = this.c;
                        q9Var22.e(f292, f30);
                        i10 = 0;
                        while (i10 < i3) {
                        }
                        if (this.L) {
                            return;
                        } else {
                            return;
                        }
                    }
                }
                if (!z11) {
                    float f33 = this.w;
                    if (f33 != 0.0f) {
                        float f34 = f33 - 0.045714285f;
                        this.w = f34;
                        if (f34 < 0.0f) {
                            this.w = 0.0f;
                        }
                    }
                }
                int i132 = this.h.i;
                i3 = 3;
                int i142 = 2;
                if (i132 == 3) {
                }
                if (z12) {
                }
                if (!z12) {
                }
                float interpolation222 = (this.Q.getInterpolation(this.E) * 0.35f) + 0.65f;
                float f2522 = this.d;
                float f2622 = 1.0f;
                if (!z10) {
                }
                float f2822 = 0.0f;
                q9 q9Var32 = this.b;
                q9Var32.e(f2522, f27);
                float f2922 = this.d;
                if (!z10) {
                }
                q9 q9Var222 = this.c;
                q9Var222.e(f2922, f30);
                i10 = 0;
                while (i10 < i3) {
                }
                if (this.L) {
                }
            }
        }
        if (!z13) {
            float f35 = this.O;
            if (f35 != 0.0f) {
                float f36 = f35 - 0.10666667f;
                this.O = f36;
                if (f36 < 0.0f) {
                    this.O = 0.0f;
                }
            }
        }
        float interpolation3 = xq.f.getInterpolation(this.O) * 0.1f;
        float f172 = interpolation3 + 1.0f;
        fh0 fh0Var2 = this.G;
        fh0Var2.setScaleY(f172);
        fh0Var2.setScaleX(f172);
        z10 = this.J;
        if (z10) {
        }
        f10 = this.e;
        f11 = this.d;
        if (f10 != f11) {
        }
        ?? r122 = 0;
        if (this.n != null) {
        }
        z11 = this.s;
        if (z11) {
        }
        if (!z11) {
        }
        int i1322 = this.h.i;
        i3 = 3;
        int i1422 = 2;
        if (i1322 == 3) {
        }
        if (z12) {
        }
        if (!z12) {
        }
        float interpolation2222 = (this.Q.getInterpolation(this.E) * 0.35f) + 0.65f;
        float f25222 = this.d;
        float f26222 = 1.0f;
        if (!z10) {
        }
        float f28222 = 0.0f;
        q9 q9Var322 = this.b;
        q9Var322.e(f25222, f27);
        float f29222 = this.d;
        if (!z10) {
        }
        q9 q9Var2222 = this.c;
        q9Var2222.e(f29222, f30);
        i10 = 0;
        while (i10 < i3) {
        }
        if (this.L) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        l10 l10Var = l10.e0;
        if (l10Var != null) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.bd.M0(l10Var.x ? 2131754901 : 2131754816, null)));
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i3, int i10) {
        org.telegram.messenger.voip.s0.d(this, i3, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.s0.e(this, z10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i3) {
        org.telegram.messenger.voip.s0.f(this, i3);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i3) {
        a();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.s0.h(this, z10);
    }

    public void setPinnedProgress(float f10) {
        this.P = f10;
    }

    public void setPressedState(boolean z10) {
        this.N = z10;
    }

    public void setRemoveAngle(double d) {
        this.R = (float) d;
    }

    public void setState(int i3) {
        q10 q10Var = this.h;
        if (q10Var == null || q10Var.i != i3) {
            this.n = q10Var;
            q10 q10Var2 = this.M[i3];
            this.h = q10Var2;
            float f10 = 0.0f;
            if (q10Var != null) {
                this.r = 0.0f;
            } else {
                this.r = 1.0f;
                int i10 = q10Var2.i;
                if (i10 != 3 && i10 != 2) {
                    f10 = 1.0f;
                }
                this.E = f10;
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            String M0 = (sharedInstance == null || !org.telegram.messenger.t3.W(sharedInstance.getChat())) ? org.telegram.messenger.bd.M0(2131743316, null) : org.telegram.messenger.bd.M0(2131743457, null);
            if (i3 == 0) {
                M0 = k2.p1.k(2131743243, null, t4.c.h(M0, ", "));
            } else if (i3 == 2) {
                M0 = k2.p1.k(2131751809, null, t4.c.h(M0, ", "));
            } else if (i3 == 3) {
                M0 = k2.p1.k(2131743302, null, t4.c.h(M0, ", "));
            }
            setContentDescription(M0);
            invalidate();
        }
    }
}
