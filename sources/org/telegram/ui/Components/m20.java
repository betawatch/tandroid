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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m20 extends FrameLayout implements org.telegram.messenger.us, VoIPService.StateListener {
    public float D;
    public final int E;
    public final ei0 F;
    public final bi0 G;
    public long H;
    public final boolean I;
    public final Random J;
    public boolean K;
    public final l20[] L;
    public boolean M;
    public float N;
    public float O;
    public final OvershootInterpolator P;
    public float Q;
    public final Paint a;
    public final m9 b;
    public final m9 c;
    public float d;
    public float e;
    public float f;
    public l20 h;
    public l20 n;
    public float r;
    public boolean s;
    public float w;
    public final LinearGradient x;
    public final Matrix y;

    public m20(int i10, Context context, boolean z10) {
        super(context);
        this.a = new Paint(1);
        this.b = new m9(8);
        this.c = new m9(9);
        this.r = 1.0f;
        this.y = new Matrix();
        this.D = 0.0f;
        this.J = new Random();
        this.L = new l20[4];
        this.P = new OvershootInterpolator();
        this.I = z10;
        this.E = i10;
        for (int i11 = 0; i11 < 4; i11++) {
            this.L[i11] = new l20(i11);
        }
        this.b.b = org.telegram.messenger.i0.L(37.0f);
        this.b.a = org.telegram.messenger.i0.L(32.0f);
        this.c.b = org.telegram.messenger.i0.L(37.0f);
        this.c.a = org.telegram.messenger.i0.L(32.0f);
        this.b.b();
        this.c.b();
        bi0 bi0Var = new bi0(R.raw.voice_outlined, org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(30.0f), true, null);
        this.G = bi0Var;
        setWillNotDraw(false);
        ei0 ei0Var = new ei0(context);
        this.F = ei0Var;
        ei0Var.setAnimation(bi0Var);
        ei0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(ei0Var);
        this.x = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(350.0f), 0.0f, new int[]{-2801343, -561538, 0}, new float[]{0.0f, 0.4f, 1.0f}, Shader.TileMode.CLAMP);
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
        if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || org.telegram.messenger.w3.w(14, sharedInstance.getChat())) {
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

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.N4) {
            setAmplitude(((Float) objArr[0]).floatValue() * 4000.0f);
        } else if (i10 == org.telegram.messenger.zs.w2) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.I) {
            return;
        }
        setAmplitude(0.0d);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.N4);
        org.telegram.messenger.zs.f(this.E).c(this, org.telegram.messenger.zs.w2);
        boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        int i10 = z10 ? 13 : 24;
        bi0 bi0Var = this.G;
        bi0Var.P(i10);
        bi0Var.N(bi0Var.f - 1, false, true);
        a();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        int i10 = z10 ? 13 : 24;
        bi0 bi0Var = this.G;
        if (bi0Var.P(i10)) {
            if (z10) {
                bi0Var.M(0);
            } else {
                bi0Var.M(12);
            }
        }
        this.F.d();
        a();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.y0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraSwitch(boolean z10) {
        org.telegram.messenger.voip.y0.c(this, z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.I) {
            return;
        }
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.N4);
        org.telegram.messenger.zs.f(this.E).n(this, org.telegram.messenger.zs.w2);
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
        float f7;
        float f10;
        boolean z11;
        int i10;
        boolean z12;
        int i11;
        float f11;
        float f12;
        int i12;
        float f13;
        super.onDraw(canvas);
        if (getAlpha() == 0.0f) {
            return;
        }
        int i13 = 1;
        float measuredWidth = getMeasuredWidth() >> 1;
        float measuredHeight = getMeasuredHeight() >> 1;
        boolean z13 = this.M;
        if (z13) {
            float f14 = this.N;
            if (f14 != 1.0f) {
                float f15 = f14 + 0.10666667f;
                this.N = f15;
                if (f15 > 1.0f) {
                    this.N = 1.0f;
                }
                float interpolation = gr.f.getInterpolation(this.N) * 0.1f;
                float f16 = interpolation + 1.0f;
                ei0 ei0Var = this.F;
                ei0Var.setScaleY(f16);
                ei0Var.setScaleX(f16);
                z10 = this.I;
                if (z10) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - this.H > 1000) {
                        this.H = currentTimeMillis;
                        float A = a1.g.A(Math.abs(this.J.nextInt() % 100), 0.5f, 100.0f, 0.5f);
                        this.e = A;
                        this.f = (A - this.d) / 595.0f;
                    }
                }
                f7 = this.e;
                f10 = this.d;
                if (f7 != f10) {
                    float f17 = this.f;
                    float f18 = (16.0f * f17) + f10;
                    this.d = f18;
                    if (f17 > 0.0f) {
                        if (f18 > f7) {
                            this.d = f7;
                        }
                    } else if (f18 < f7) {
                        this.d = f7;
                    }
                }
                ?? r12 = 0;
                if (this.n != null) {
                    float f19 = this.r + 0.064f;
                    this.r = f19;
                    if (f19 > 1.0f) {
                        this.r = 1.0f;
                        this.n = null;
                    }
                }
                z11 = this.s;
                if (z11) {
                    float f20 = this.w;
                    if (f20 != 1.0f) {
                        float f21 = f20 + 0.045714285f;
                        this.w = f21;
                        if (f21 > 1.0f) {
                            this.w = 1.0f;
                        }
                        if (this.K) {
                            invalidate();
                        }
                        int i14 = this.h.i;
                        i10 = 3;
                        int i15 = 2;
                        z12 = i14 == 3 && i14 != 2;
                        if (z12) {
                            float f22 = this.D;
                            if (f22 != 1.0f) {
                                float f23 = f22 + 0.045714285f;
                                this.D = f23;
                                if (f23 > 1.0f) {
                                    this.D = 1.0f;
                                }
                                float interpolation2 = (this.P.getInterpolation(this.D) * 0.35f) + 0.65f;
                                float f24 = this.d;
                                float f25 = 1.0f;
                                float f26 = !z10 ? 0.1f : 0.8f;
                                float f27 = 0.0f;
                                m9 m9Var = this.b;
                                m9Var.e(f24, f26);
                                float f28 = this.d;
                                float f29 = !z10 ? 0.1f : 0.8f;
                                m9 m9Var2 = this.c;
                                m9Var2.e(f28, f29);
                                i11 = 0;
                                while (i11 < i10) {
                                    if (i11 != 0 || this.n != null) {
                                        Paint paint = this.a;
                                        if (i11 != 0) {
                                            if (i11 == i13) {
                                                l20 l20Var = this.h;
                                                if (l20Var == null) {
                                                    return;
                                                }
                                                if (this.w != f25) {
                                                    f11 = this.n != null ? this.r : f25;
                                                    l20Var.a(this.d);
                                                    l20 l20Var2 = this.h;
                                                    if (l20Var2.i == i15) {
                                                        paint.setShader(r12);
                                                        paint.setColor(org.telegram.ui.ActionBar.t6.x0(r12, org.telegram.ui.ActionBar.t6.Ph, false));
                                                    } else {
                                                        paint.setShader(l20Var2.g);
                                                    }
                                                }
                                                f12 = f25;
                                                i12 = 1;
                                            } else {
                                                if (this.w != f27) {
                                                    paint.setColor(-65536);
                                                    Matrix matrix = this.y;
                                                    matrix.reset();
                                                    matrix.postTranslate((f25 - this.w) * (-org.telegram.messenger.i0.L(250.0f)), f27);
                                                    matrix.postRotate(this.Q, measuredWidth, measuredHeight);
                                                    LinearGradient linearGradient = this.x;
                                                    linearGradient.setLocalMatrix(matrix);
                                                    paint.setShader(linearGradient);
                                                    f11 = f25;
                                                }
                                                f12 = f25;
                                                i12 = 1;
                                            }
                                            i11++;
                                            i13 = i12;
                                            f25 = f12;
                                            r12 = 0;
                                            i10 = 3;
                                            f27 = 0.0f;
                                        } else if (this.w != f25) {
                                            f11 = f25 - this.r;
                                            this.n.a(this.d);
                                            l20 l20Var3 = this.n;
                                            if (l20Var3.i == i15) {
                                                paint.setShader(r12);
                                                paint.setColor(org.telegram.ui.ActionBar.t6.x0(r12, org.telegram.ui.ActionBar.t6.Ph, false));
                                            } else {
                                                paint.setShader(l20Var3.g);
                                            }
                                        }
                                        m9Var.b = org.telegram.messenger.i0.L(40.0f);
                                        m9Var.a = org.telegram.messenger.i0.L(32.0f);
                                        m9Var2.b = org.telegram.messenger.i0.L(38.0f);
                                        m9Var2.a = org.telegram.messenger.i0.L(33.0f);
                                        if (i11 != i15) {
                                            f13 = 32.0f;
                                            paint.setAlpha((int) ((f25 - this.w) * 76.0f * f11));
                                        } else {
                                            f13 = 32.0f;
                                            paint.setAlpha((int) (76.0f * f11 * this.w));
                                        }
                                        if (this.D != 0.0f) {
                                            f12 = f25;
                                            float min = Math.min((f12 - this.O) * sc.e.d(this.d, 0.3f, f12, interpolation), 1.3f) * interpolation2;
                                            canvas.save();
                                            canvas.scale(min, min, measuredWidth, measuredHeight);
                                            m9Var.a(measuredWidth, measuredHeight, canvas, paint);
                                            canvas.restore();
                                            float min2 = Math.min((f12 - this.O) * sc.e.d(this.d, 0.26f, f12, interpolation), 1.3f) * interpolation2;
                                            canvas.save();
                                            canvas.scale(min2, min2, measuredWidth, measuredHeight);
                                            m9Var2.a(measuredWidth, measuredHeight, canvas, paint);
                                            canvas.restore();
                                        } else {
                                            f12 = f25;
                                        }
                                        i15 = 2;
                                        if (i11 == 2) {
                                            paint.setAlpha((int) (this.w * 255.0f));
                                            i12 = 1;
                                        } else {
                                            i12 = 1;
                                            if (i11 == 1) {
                                                paint.setAlpha((int) (f11 * 255.0f));
                                            } else {
                                                paint.setAlpha(org.telegram.messenger.zs.e4);
                                            }
                                        }
                                        canvas.save();
                                        canvas.scale(f16, f16, measuredWidth, measuredHeight);
                                        canvas.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.i0.L(f13), paint);
                                        canvas.restore();
                                        i11++;
                                        i13 = i12;
                                        f25 = f12;
                                        r12 = 0;
                                        i10 = 3;
                                        f27 = 0.0f;
                                    }
                                    i12 = i13;
                                    f12 = f25;
                                    i11++;
                                    i13 = i12;
                                    f25 = f12;
                                    r12 = 0;
                                    i10 = 3;
                                    f27 = 0.0f;
                                }
                                if (!this.K || this.D <= 0.0f) {
                                    return;
                                }
                                invalidate();
                                return;
                            }
                        }
                        if (!z12) {
                            float f30 = this.D;
                            if (f30 != 0.0f) {
                                float f31 = f30 - 0.045714285f;
                                this.D = f31;
                                if (f31 < 0.0f) {
                                    this.D = 0.0f;
                                }
                            }
                        }
                        float interpolation22 = (this.P.getInterpolation(this.D) * 0.35f) + 0.65f;
                        float f242 = this.d;
                        float f252 = 1.0f;
                        if (!z10) {
                        }
                        float f272 = 0.0f;
                        m9 m9Var3 = this.b;
                        m9Var3.e(f242, f26);
                        float f282 = this.d;
                        if (!z10) {
                        }
                        m9 m9Var22 = this.c;
                        m9Var22.e(f282, f29);
                        i11 = 0;
                        while (i11 < i10) {
                        }
                        if (this.K) {
                            return;
                        } else {
                            return;
                        }
                    }
                }
                if (!z11) {
                    float f32 = this.w;
                    if (f32 != 0.0f) {
                        float f33 = f32 - 0.045714285f;
                        this.w = f33;
                        if (f33 < 0.0f) {
                            this.w = 0.0f;
                        }
                    }
                }
                int i142 = this.h.i;
                i10 = 3;
                int i152 = 2;
                if (i142 == 3) {
                }
                if (z12) {
                }
                if (!z12) {
                }
                float interpolation222 = (this.P.getInterpolation(this.D) * 0.35f) + 0.65f;
                float f2422 = this.d;
                float f2522 = 1.0f;
                if (!z10) {
                }
                float f2722 = 0.0f;
                m9 m9Var32 = this.b;
                m9Var32.e(f2422, f26);
                float f2822 = this.d;
                if (!z10) {
                }
                m9 m9Var222 = this.c;
                m9Var222.e(f2822, f29);
                i11 = 0;
                while (i11 < i10) {
                }
                if (this.K) {
                }
            }
        }
        if (!z13) {
            float f34 = this.N;
            if (f34 != 0.0f) {
                float f35 = f34 - 0.10666667f;
                this.N = f35;
                if (f35 < 0.0f) {
                    this.N = 0.0f;
                }
            }
        }
        float interpolation3 = gr.f.getInterpolation(this.N) * 0.1f;
        float f162 = interpolation3 + 1.0f;
        ei0 ei0Var2 = this.F;
        ei0Var2.setScaleY(f162);
        ei0Var2.setScaleX(f162);
        z10 = this.I;
        if (z10) {
        }
        f7 = this.e;
        f10 = this.d;
        if (f7 != f10) {
        }
        ?? r122 = 0;
        if (this.n != null) {
        }
        z11 = this.s;
        if (z11) {
        }
        if (!z11) {
        }
        int i1422 = this.h.i;
        i10 = 3;
        int i1522 = 2;
        if (i1422 == 3) {
        }
        if (z12) {
        }
        if (!z12) {
        }
        float interpolation2222 = (this.P.getInterpolation(this.D) * 0.35f) + 0.65f;
        float f24222 = this.d;
        float f25222 = 1.0f;
        if (!z10) {
        }
        float f27222 = 0.0f;
        m9 m9Var322 = this.b;
        m9Var322.e(f24222, f26);
        float f28222 = this.d;
        if (!z10) {
        }
        m9 m9Var2222 = this.c;
        m9Var2222.e(f28222, f29);
        i11 = 0;
        while (i11 < i10) {
        }
        if (this.K) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        g20 g20Var = g20.d0;
        if (g20Var != null) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.cd.L0(g20Var.x ? 2131754901 : 2131754816, null)));
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.y0.d(this, i10, i11);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.y0.e(this, z10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.y0.f(this, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i10) {
        a();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.y0.h(this, z10);
    }

    public void setPinnedProgress(float f7) {
        this.O = f7;
    }

    public void setPressedState(boolean z10) {
        this.M = z10;
    }

    public void setRemoveAngle(double d) {
        this.Q = (float) d;
    }

    public void setState(int i10) {
        l20 l20Var = this.h;
        if (l20Var == null || l20Var.i != i10) {
            this.n = l20Var;
            l20 l20Var2 = this.L[i10];
            this.h = l20Var2;
            float f7 = 0.0f;
            if (l20Var != null) {
                this.r = 0.0f;
            } else {
                this.r = 1.0f;
                int i11 = l20Var2.i;
                if (i11 != 3 && i11 != 2) {
                    f7 = 1.0f;
                }
                this.D = f7;
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            String L0 = (sharedInstance == null || !org.telegram.messenger.w3.W(sharedInstance.getChat())) ? org.telegram.messenger.cd.L0(2131743332, null) : org.telegram.messenger.cd.L0(2131743473, null);
            if (i10 == 0) {
                L0 = a1.g.m(null, 2131743259, sc.e.i(L0, ", "));
            } else if (i10 == 2) {
                L0 = a1.g.m(null, 2131751809, sc.e.i(L0, ", "));
            } else if (i10 == 3) {
                L0 = a1.g.m(null, 2131743318, sc.e.i(L0, ", "));
            }
            setContentDescription(L0);
            invalidate();
        }
    }
}
