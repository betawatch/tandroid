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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class w10 extends FrameLayout implements org.telegram.messenger.ls, VoIPService.StateListener {
    public float D;
    public final int E;
    public final dh0 F;
    public final ah0 G;
    public boolean H;
    public final v10[] I;
    public boolean J;
    public float K;
    public float L;
    public final OvershootInterpolator M;
    public float N;
    public final Paint a;
    public final r9 b;
    public final r9 c;
    public float d;
    public float e;
    public float f;
    public v10 h;
    public v10 n;
    public float r;
    public boolean s;
    public float w;
    public final LinearGradient x;
    public final Matrix y;

    public w10(Context context, int i7) {
        super(context);
        this.a = new Paint(1);
        this.b = new r9(8);
        this.c = new r9(9);
        this.r = 1.0f;
        this.y = new Matrix();
        this.D = 0.0f;
        new Random();
        this.I = new v10[4];
        this.M = new OvershootInterpolator();
        this.E = i7;
        for (int i10 = 0; i10 < 4; i10++) {
            this.I[i10] = new v10(i10);
        }
        this.b.b = org.telegram.messenger.g0.L(37.0f);
        this.b.a = org.telegram.messenger.g0.L(32.0f);
        this.c.b = org.telegram.messenger.g0.L(37.0f);
        this.c.a = org.telegram.messenger.g0.L(32.0f);
        this.b.b();
        this.c.b();
        ah0 ah0Var = new ah0(R.raw.voice_outlined, org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(30.0f), true, null);
        this.G = ah0Var;
        setWillNotDraw(false);
        dh0 dh0Var = new dh0(context);
        this.F = dh0Var;
        dh0Var.setAnimation(ah0Var);
        dh0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(dh0Var);
        this.x = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(350.0f), 0.0f, new int[]{-2801343, -561538, 0}, new float[]{0.0f, 0.4f, 1.0f}, Shader.TileMode.CLAMP);
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

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.N4) {
            setAmplitude(((Float) objArr[0]).floatValue() * 4000.0f);
        } else if (i7 == org.telegram.messenger.qs.w2) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setAmplitude(0.0d);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.N4);
        org.telegram.messenger.qs.f(this.E).c(this, org.telegram.messenger.qs.w2);
        boolean z9 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        int i7 = z9 ? 13 : 24;
        ah0 ah0Var = this.G;
        ah0Var.P(i7);
        ah0Var.N(ah0Var.f - 1, false, true);
        a();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        boolean z9 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        int i7 = z9 ? 13 : 24;
        ah0 ah0Var = this.G;
        if (ah0Var.P(i7)) {
            if (z9) {
                ah0Var.M(0);
            } else {
                ah0Var.M(12);
            }
        }
        this.F.d();
        a();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.s0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraSwitch(boolean z9) {
        org.telegram.messenger.voip.s0.c(this, z9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.N4);
        org.telegram.messenger.qs.f(this.E).n(this, org.telegram.messenger.qs.w2);
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011d  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.graphics.Shader, boolean[]] */
    /* JADX WARN: Type inference failed for: r10v31 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        boolean z9;
        int i7;
        boolean z10;
        int i10;
        float f12;
        int i11;
        float f13;
        int i12;
        float f14;
        super.onDraw(canvas);
        if (getAlpha() == 0.0f) {
            return;
        }
        int i13 = 1;
        float measuredWidth = getMeasuredWidth() >> 1;
        float measuredHeight = getMeasuredHeight() >> 1;
        boolean z11 = this.J;
        if (z11) {
            float f15 = this.K;
            if (f15 != 1.0f) {
                float f16 = f15 + 0.10666667f;
                this.K = f16;
                if (f16 > 1.0f) {
                    this.K = 1.0f;
                }
                float interpolation = xq.f.getInterpolation(this.K) * 0.1f;
                float f17 = interpolation + 1.0f;
                dh0 dh0Var = this.F;
                dh0Var.setScaleY(f17);
                dh0Var.setScaleX(f17);
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
                ?? r10 = 0;
                if (this.n != null) {
                    float f20 = this.r + 0.064f;
                    this.r = f20;
                    if (f20 > 1.0f) {
                        this.r = 1.0f;
                        this.n = null;
                    }
                }
                z9 = this.s;
                if (z9) {
                    float f21 = this.w;
                    if (f21 != 1.0f) {
                        float f22 = f21 + 0.045714285f;
                        this.w = f22;
                        if (f22 > 1.0f) {
                            this.w = 1.0f;
                        }
                        if (this.H) {
                            invalidate();
                        }
                        int i14 = this.h.i;
                        i7 = 3;
                        int i15 = 2;
                        z10 = i14 == 3 && i14 != 2;
                        if (z10) {
                            float f23 = this.D;
                            if (f23 != 1.0f) {
                                float f24 = f23 + 0.045714285f;
                                this.D = f24;
                                if (f24 > 1.0f) {
                                    this.D = 1.0f;
                                }
                                float interpolation2 = (this.M.getInterpolation(this.D) * 0.35f) + 0.65f;
                                float f25 = this.d;
                                r9 r9Var = this.b;
                                float f26 = 1.0f;
                                r9Var.e(f25, 0.8f);
                                float f27 = this.d;
                                float f28 = 0.0f;
                                r9 r9Var2 = this.c;
                                r9Var2.e(f27, 0.8f);
                                i10 = 0;
                                while (i10 < i7) {
                                    if (i10 != 0 || this.n != null) {
                                        Paint paint = this.a;
                                        if (i10 != 0) {
                                            if (i10 == i13) {
                                                v10 v10Var = this.h;
                                                if (v10Var == null) {
                                                    return;
                                                }
                                                if (this.w != f26) {
                                                    f12 = this.n != null ? this.r : f26;
                                                    v10Var.a(this.d);
                                                    v10 v10Var2 = this.h;
                                                    if (v10Var2.i == i15) {
                                                        paint.setShader(r10);
                                                        paint.setColor(org.telegram.ui.ActionBar.l6.x0(r10, org.telegram.ui.ActionBar.l6.Ph, false));
                                                    } else {
                                                        paint.setShader(v10Var2.g);
                                                    }
                                                }
                                                i11 = i15;
                                                f13 = f26;
                                                i12 = 1;
                                            } else {
                                                if (this.w != f28) {
                                                    paint.setColor(-65536);
                                                    Matrix matrix = this.y;
                                                    matrix.reset();
                                                    matrix.postTranslate((f26 - this.w) * (-org.telegram.messenger.g0.L(250.0f)), f28);
                                                    matrix.postRotate(this.N, measuredWidth, measuredHeight);
                                                    LinearGradient linearGradient = this.x;
                                                    linearGradient.setLocalMatrix(matrix);
                                                    paint.setShader(linearGradient);
                                                    f12 = f26;
                                                }
                                                i11 = i15;
                                                f13 = f26;
                                                i12 = 1;
                                            }
                                            i10++;
                                            f26 = f13;
                                            i13 = i12;
                                            i7 = 3;
                                            f28 = 0.0f;
                                            i15 = i11;
                                            r10 = 0;
                                        } else if (this.w != f26) {
                                            f12 = f26 - this.r;
                                            this.n.a(this.d);
                                            v10 v10Var3 = this.n;
                                            if (v10Var3.i == i15) {
                                                paint.setShader(r10);
                                                paint.setColor(org.telegram.ui.ActionBar.l6.x0(r10, org.telegram.ui.ActionBar.l6.Ph, false));
                                            } else {
                                                paint.setShader(v10Var3.g);
                                            }
                                        }
                                        r9Var.b = org.telegram.messenger.g0.L(40.0f);
                                        r9Var.a = org.telegram.messenger.g0.L(32.0f);
                                        r9Var2.b = org.telegram.messenger.g0.L(38.0f);
                                        r9Var2.a = org.telegram.messenger.g0.L(33.0f);
                                        if (i10 != i15) {
                                            f14 = 32.0f;
                                            paint.setAlpha((int) ((f26 - this.w) * 76.0f * f12));
                                        } else {
                                            f14 = 32.0f;
                                            paint.setAlpha((int) (76.0f * f12 * this.w));
                                        }
                                        if (this.D != 0.0f) {
                                            f13 = f26;
                                            float min = Math.min((f13 - this.L) * rf.b.d(this.d, 0.3f, f13, interpolation), 1.3f) * interpolation2;
                                            canvas.save();
                                            canvas.scale(min, min, measuredWidth, measuredHeight);
                                            r9Var.a(measuredWidth, measuredHeight, canvas, paint);
                                            canvas.restore();
                                            float min2 = Math.min((f13 - this.L) * rf.b.d(this.d, 0.26f, f13, interpolation), 1.3f) * interpolation2;
                                            canvas.save();
                                            canvas.scale(min2, min2, measuredWidth, measuredHeight);
                                            r9Var2.a(measuredWidth, measuredHeight, canvas, paint);
                                            canvas.restore();
                                        } else {
                                            f13 = f26;
                                        }
                                        i11 = 2;
                                        if (i10 == 2) {
                                            paint.setAlpha((int) (this.w * 255.0f));
                                            i12 = 1;
                                        } else {
                                            i12 = 1;
                                            if (i10 == 1) {
                                                paint.setAlpha((int) (f12 * 255.0f));
                                            } else {
                                                paint.setAlpha(org.telegram.messenger.qs.e4);
                                            }
                                        }
                                        canvas.save();
                                        canvas.scale(f17, f17, measuredWidth, measuredHeight);
                                        canvas.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(f14), paint);
                                        canvas.restore();
                                        i10++;
                                        f26 = f13;
                                        i13 = i12;
                                        i7 = 3;
                                        f28 = 0.0f;
                                        i15 = i11;
                                        r10 = 0;
                                    }
                                    i11 = i15;
                                    f13 = f26;
                                    i12 = i13;
                                    i10++;
                                    f26 = f13;
                                    i13 = i12;
                                    i7 = 3;
                                    f28 = 0.0f;
                                    i15 = i11;
                                    r10 = 0;
                                }
                                if (!this.H || this.D <= 0.0f) {
                                    return;
                                }
                                invalidate();
                                return;
                            }
                        }
                        if (!z10) {
                            float f29 = this.D;
                            if (f29 != 0.0f) {
                                float f30 = f29 - 0.045714285f;
                                this.D = f30;
                                if (f30 < 0.0f) {
                                    this.D = 0.0f;
                                }
                            }
                        }
                        float interpolation22 = (this.M.getInterpolation(this.D) * 0.35f) + 0.65f;
                        float f252 = this.d;
                        r9 r9Var3 = this.b;
                        float f262 = 1.0f;
                        r9Var3.e(f252, 0.8f);
                        float f272 = this.d;
                        float f282 = 0.0f;
                        r9 r9Var22 = this.c;
                        r9Var22.e(f272, 0.8f);
                        i10 = 0;
                        while (i10 < i7) {
                        }
                        if (this.H) {
                            return;
                        } else {
                            return;
                        }
                    }
                }
                if (!z9) {
                    float f31 = this.w;
                    if (f31 != 0.0f) {
                        float f32 = f31 - 0.045714285f;
                        this.w = f32;
                        if (f32 < 0.0f) {
                            this.w = 0.0f;
                        }
                    }
                }
                int i142 = this.h.i;
                i7 = 3;
                int i152 = 2;
                if (i142 == 3) {
                }
                if (z10) {
                }
                if (!z10) {
                }
                float interpolation222 = (this.M.getInterpolation(this.D) * 0.35f) + 0.65f;
                float f2522 = this.d;
                r9 r9Var32 = this.b;
                float f2622 = 1.0f;
                r9Var32.e(f2522, 0.8f);
                float f2722 = this.d;
                float f2822 = 0.0f;
                r9 r9Var222 = this.c;
                r9Var222.e(f2722, 0.8f);
                i10 = 0;
                while (i10 < i7) {
                }
                if (this.H) {
                }
            }
        }
        if (!z11) {
            float f33 = this.K;
            if (f33 != 0.0f) {
                float f34 = f33 - 0.10666667f;
                this.K = f34;
                if (f34 < 0.0f) {
                    this.K = 0.0f;
                }
            }
        }
        float interpolation3 = xq.f.getInterpolation(this.K) * 0.1f;
        float f172 = interpolation3 + 1.0f;
        dh0 dh0Var2 = this.F;
        dh0Var2.setScaleY(f172);
        dh0Var2.setScaleX(f172);
        f10 = this.e;
        f11 = this.d;
        if (f10 != f11) {
        }
        ?? r102 = 0;
        if (this.n != null) {
        }
        z9 = this.s;
        if (z9) {
        }
        if (!z9) {
        }
        int i1422 = this.h.i;
        i7 = 3;
        int i1522 = 2;
        if (i1422 == 3) {
        }
        if (z10) {
        }
        if (!z10) {
        }
        float interpolation2222 = (this.M.getInterpolation(this.D) * 0.35f) + 0.65f;
        float f25222 = this.d;
        r9 r9Var322 = this.b;
        float f26222 = 1.0f;
        r9Var322.e(f25222, 0.8f);
        float f27222 = this.d;
        float f28222 = 0.0f;
        r9 r9Var2222 = this.c;
        r9Var2222.e(f27222, 0.8f);
        i10 = 0;
        while (i10 < i7) {
        }
        if (this.H) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        q10 q10Var = q10.e0;
        if (q10Var != null) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.id.M0(q10Var.y ? 2131754901 : 2131754816, null)));
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i7, int i10) {
        org.telegram.messenger.voip.s0.d(this, i7, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z9) {
        org.telegram.messenger.voip.s0.e(this, z9);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i7) {
        org.telegram.messenger.voip.s0.f(this, i7);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i7) {
        a();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z9) {
        org.telegram.messenger.voip.s0.h(this, z9);
    }

    public void setPinnedProgress(float f10) {
        this.L = f10;
    }

    public void setPressedState(boolean z9) {
        this.J = z9;
    }

    public void setRemoveAngle(double d) {
        this.N = (float) d;
    }

    public void setState(int i7) {
        v10 v10Var = this.h;
        if (v10Var == null || v10Var.i != i7) {
            this.n = v10Var;
            v10 v10Var2 = this.I[i7];
            this.h = v10Var2;
            float f10 = 0.0f;
            if (v10Var != null) {
                this.r = 0.0f;
            } else {
                this.r = 1.0f;
                int i10 = v10Var2.i;
                if (i10 != 3 && i10 != 2) {
                    f10 = 1.0f;
                }
                this.D = f10;
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            String M0 = (sharedInstance == null || !org.telegram.messenger.t3.W(sharedInstance.getChat())) ? org.telegram.messenger.id.M0(2131743306, null) : org.telegram.messenger.id.M0(2131743447, null);
            if (i7 == 0) {
                M0 = jg.g.l(2131743233, null, rf.b.j(M0, ", "));
            } else if (i7 == 2) {
                M0 = jg.g.l(2131751809, null, rf.b.j(M0, ", "));
            } else if (i7 == 3) {
                M0 = jg.g.l(2131743292, null, rf.b.j(M0, ", "));
            }
            setContentDescription(M0);
            invalidate();
        }
    }
}
