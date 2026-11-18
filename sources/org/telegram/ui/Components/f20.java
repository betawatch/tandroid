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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class f20 extends FrameLayout implements org.telegram.messenger.fs, VoIPService.StateListener {
    public float E;
    public final int F;
    public final ph0 G;
    public final mh0 H;
    public boolean I;
    public final e20[] J;
    public boolean K;
    public float L;
    public float M;
    public final OvershootInterpolator N;
    public float O;
    public final Paint a;
    public final w9 b;
    public final w9 c;
    public float d;
    public float e;
    public float f;
    public e20 h;
    public e20 n;
    public float r;
    public boolean s;
    public float w;
    public final LinearGradient x;
    public final Matrix y;

    public f20(Context context, int i7) {
        super(context);
        this.a = new Paint(1);
        this.b = new w9(8);
        this.c = new w9(9);
        this.r = 1.0f;
        this.y = new Matrix();
        this.E = 0.0f;
        new Random();
        this.J = new e20[4];
        this.N = new OvershootInterpolator();
        this.F = i7;
        for (int i10 = 0; i10 < 4; i10++) {
            this.J[i10] = new e20(i10);
        }
        this.b.b = org.telegram.messenger.g0.L(37.0f);
        this.b.a = org.telegram.messenger.g0.L(32.0f);
        this.c.b = org.telegram.messenger.g0.L(37.0f);
        this.c.a = org.telegram.messenger.g0.L(32.0f);
        this.b.b();
        this.c.b();
        mh0 mh0Var = new mh0(R.raw.voice_outlined, org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(30.0f), true, null);
        this.H = mh0Var;
        setWillNotDraw(false);
        ph0 ph0Var = new ph0(context);
        this.G = ph0Var;
        ph0Var.setAnimation(mh0Var);
        ph0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(ph0Var);
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
        if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || org.telegram.messenger.v3.w(14, sharedInstance.getChat())) {
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

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.Q4) {
            setAmplitude(((Float) objArr[0]).floatValue() * 4000.0f);
        } else if (i7 == org.telegram.messenger.ks.w2) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setAmplitude(0.0d);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.Q4);
        org.telegram.messenger.ks.f(this.F).c(this, org.telegram.messenger.ks.w2);
        boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        int i7 = z10 ? 13 : 24;
        mh0 mh0Var = this.H;
        mh0Var.P(i7);
        mh0Var.N(mh0Var.f - 1, false, true);
        a();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        int i7 = z10 ? 13 : 24;
        mh0 mh0Var = this.H;
        if (mh0Var.P(i7)) {
            if (z10) {
                mh0Var.M(0);
            } else {
                mh0Var.M(12);
            }
        }
        this.G.d();
        a();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.t0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraSwitch(boolean z10) {
        org.telegram.messenger.voip.t0.c(this, z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.Q4);
        org.telegram.messenger.ks.f(this.F).n(this, org.telegram.messenger.ks.w2);
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
        boolean z10;
        int i7;
        boolean z11;
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
        boolean z12 = this.K;
        if (z12) {
            float f15 = this.L;
            if (f15 != 1.0f) {
                float f16 = f15 + 0.10666667f;
                this.L = f16;
                if (f16 > 1.0f) {
                    this.L = 1.0f;
                }
                float interpolation = lr.f.getInterpolation(this.L) * 0.1f;
                float f17 = interpolation + 1.0f;
                ph0 ph0Var = this.G;
                ph0Var.setScaleY(f17);
                ph0Var.setScaleX(f17);
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
                z10 = this.s;
                if (z10) {
                    float f21 = this.w;
                    if (f21 != 1.0f) {
                        float f22 = f21 + 0.045714285f;
                        this.w = f22;
                        if (f22 > 1.0f) {
                            this.w = 1.0f;
                        }
                        if (this.I) {
                            invalidate();
                        }
                        int i14 = this.h.i;
                        i7 = 3;
                        int i15 = 2;
                        z11 = i14 == 3 && i14 != 2;
                        if (z11) {
                            float f23 = this.E;
                            if (f23 != 1.0f) {
                                float f24 = f23 + 0.045714285f;
                                this.E = f24;
                                if (f24 > 1.0f) {
                                    this.E = 1.0f;
                                }
                                float interpolation2 = (this.N.getInterpolation(this.E) * 0.35f) + 0.65f;
                                float f25 = this.d;
                                w9 w9Var = this.b;
                                float f26 = 1.0f;
                                w9Var.e(f25, 0.8f);
                                float f27 = this.d;
                                float f28 = 0.0f;
                                w9 w9Var2 = this.c;
                                w9Var2.e(f27, 0.8f);
                                i10 = 0;
                                while (i10 < i7) {
                                    if (i10 != 0 || this.n != null) {
                                        Paint paint = this.a;
                                        if (i10 != 0) {
                                            if (i10 == i13) {
                                                e20 e20Var = this.h;
                                                if (e20Var == null) {
                                                    return;
                                                }
                                                if (this.w != f26) {
                                                    f12 = this.n != null ? this.r : f26;
                                                    e20Var.a(this.d);
                                                    e20 e20Var2 = this.h;
                                                    if (e20Var2.i == i15) {
                                                        paint.setShader(r10);
                                                        paint.setColor(org.telegram.ui.ActionBar.n6.x0(r10, org.telegram.ui.ActionBar.n6.Sh, false));
                                                    } else {
                                                        paint.setShader(e20Var2.g);
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
                                                    matrix.postRotate(this.O, measuredWidth, measuredHeight);
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
                                            e20 e20Var3 = this.n;
                                            if (e20Var3.i == i15) {
                                                paint.setShader(r10);
                                                paint.setColor(org.telegram.ui.ActionBar.n6.x0(r10, org.telegram.ui.ActionBar.n6.Sh, false));
                                            } else {
                                                paint.setShader(e20Var3.g);
                                            }
                                        }
                                        w9Var.b = org.telegram.messenger.g0.L(40.0f);
                                        w9Var.a = org.telegram.messenger.g0.L(32.0f);
                                        w9Var2.b = org.telegram.messenger.g0.L(38.0f);
                                        w9Var2.a = org.telegram.messenger.g0.L(33.0f);
                                        if (i10 != i15) {
                                            f14 = 32.0f;
                                            paint.setAlpha((int) ((f26 - this.w) * 76.0f * f12));
                                        } else {
                                            f14 = 32.0f;
                                            paint.setAlpha((int) (76.0f * f12 * this.w));
                                        }
                                        if (this.E != 0.0f) {
                                            f13 = f26;
                                            float min = Math.min((f13 - this.M) * p5.c.e(this.d, 0.3f, f13, interpolation), 1.3f) * interpolation2;
                                            canvas.save();
                                            canvas.scale(min, min, measuredWidth, measuredHeight);
                                            w9Var.a(measuredWidth, measuredHeight, canvas, paint);
                                            canvas.restore();
                                            float min2 = Math.min((f13 - this.M) * p5.c.e(this.d, 0.26f, f13, interpolation), 1.3f) * interpolation2;
                                            canvas.save();
                                            canvas.scale(min2, min2, measuredWidth, measuredHeight);
                                            w9Var2.a(measuredWidth, measuredHeight, canvas, paint);
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
                                                paint.setAlpha(org.telegram.messenger.ks.e4);
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
                                if (!this.I || this.E <= 0.0f) {
                                    return;
                                }
                                invalidate();
                                return;
                            }
                        }
                        if (!z11) {
                            float f29 = this.E;
                            if (f29 != 0.0f) {
                                float f30 = f29 - 0.045714285f;
                                this.E = f30;
                                if (f30 < 0.0f) {
                                    this.E = 0.0f;
                                }
                            }
                        }
                        float interpolation22 = (this.N.getInterpolation(this.E) * 0.35f) + 0.65f;
                        float f252 = this.d;
                        w9 w9Var3 = this.b;
                        float f262 = 1.0f;
                        w9Var3.e(f252, 0.8f);
                        float f272 = this.d;
                        float f282 = 0.0f;
                        w9 w9Var22 = this.c;
                        w9Var22.e(f272, 0.8f);
                        i10 = 0;
                        while (i10 < i7) {
                        }
                        if (this.I) {
                            return;
                        } else {
                            return;
                        }
                    }
                }
                if (!z10) {
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
                if (z11) {
                }
                if (!z11) {
                }
                float interpolation222 = (this.N.getInterpolation(this.E) * 0.35f) + 0.65f;
                float f2522 = this.d;
                w9 w9Var32 = this.b;
                float f2622 = 1.0f;
                w9Var32.e(f2522, 0.8f);
                float f2722 = this.d;
                float f2822 = 0.0f;
                w9 w9Var222 = this.c;
                w9Var222.e(f2722, 0.8f);
                i10 = 0;
                while (i10 < i7) {
                }
                if (this.I) {
                }
            }
        }
        if (!z12) {
            float f33 = this.L;
            if (f33 != 0.0f) {
                float f34 = f33 - 0.10666667f;
                this.L = f34;
                if (f34 < 0.0f) {
                    this.L = 0.0f;
                }
            }
        }
        float interpolation3 = lr.f.getInterpolation(this.L) * 0.1f;
        float f172 = interpolation3 + 1.0f;
        ph0 ph0Var2 = this.G;
        ph0Var2.setScaleY(f172);
        ph0Var2.setScaleX(f172);
        f10 = this.e;
        f11 = this.d;
        if (f10 != f11) {
        }
        ?? r102 = 0;
        if (this.n != null) {
        }
        z10 = this.s;
        if (z10) {
        }
        if (!z10) {
        }
        int i1422 = this.h.i;
        i7 = 3;
        int i1522 = 2;
        if (i1422 == 3) {
        }
        if (z11) {
        }
        if (!z11) {
        }
        float interpolation2222 = (this.N.getInterpolation(this.E) * 0.35f) + 0.65f;
        float f25222 = this.d;
        w9 w9Var322 = this.b;
        float f26222 = 1.0f;
        w9Var322.e(f25222, 0.8f);
        float f27222 = this.d;
        float f28222 = 0.0f;
        w9 w9Var2222 = this.c;
        w9Var2222.e(f27222, 0.8f);
        i10 = 0;
        while (i10 < i7) {
        }
        if (this.I) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        z10 z10Var = z10.f0;
        if (z10Var != null) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.gd.M0(z10Var.y ? 2131754901 : 2131754816, null)));
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i7, int i10) {
        org.telegram.messenger.voip.t0.d(this, i7, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.t0.e(this, z10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i7) {
        org.telegram.messenger.voip.t0.f(this, i7);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i7) {
        a();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.t0.h(this, z10);
    }

    public void setPinnedProgress(float f10) {
        this.M = f10;
    }

    public void setPressedState(boolean z10) {
        this.K = z10;
    }

    public void setRemoveAngle(double d) {
        this.O = (float) d;
    }

    public void setState(int i7) {
        e20 e20Var = this.h;
        if (e20Var == null || e20Var.i != i7) {
            this.n = e20Var;
            e20 e20Var2 = this.J[i7];
            this.h = e20Var2;
            float f10 = 0.0f;
            if (e20Var != null) {
                this.r = 0.0f;
            } else {
                this.r = 1.0f;
                int i10 = e20Var2.i;
                if (i10 != 3 && i10 != 2) {
                    f10 = 1.0f;
                }
                this.E = f10;
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            String M0 = (sharedInstance == null || !org.telegram.messenger.v3.W(sharedInstance.getChat())) ? org.telegram.messenger.gd.M0(2131743069, null) : org.telegram.messenger.gd.M0(2131743210, null);
            if (i7 == 0) {
                M0 = i5.c.k(2131742996, null, p5.c.n(M0, ", "));
            } else if (i7 == 2) {
                M0 = i5.c.k(2131751798, null, p5.c.n(M0, ", "));
            } else if (i7 == 3) {
                M0 = i5.c.k(2131743055, null, p5.c.n(M0, ", "));
            }
            setContentDescription(M0);
            invalidate();
        }
    }
}
