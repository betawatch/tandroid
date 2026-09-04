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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class f30 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener {
    public final int E;
    public final aj0 F;
    public final xi0 G;
    public long H;
    public final boolean I;
    public final Random J;
    public boolean K;
    public final e30[] L;
    public boolean M;
    public float N;
    public float O;
    public final OvershootInterpolator P;
    public float Q;
    public final Paint a;
    public final ca b;
    public final ca c;
    public float d;
    public float e;
    public float f;
    public e30 h;
    public e30 n;
    public float r;
    public boolean s;
    public float v;
    public final LinearGradient w;
    public final Matrix x;
    public float y;

    public f30(int i10, Context context, boolean z10) {
        super(context);
        this.a = new Paint(1);
        this.b = new ca(8);
        this.c = new ca(9);
        this.r = 1.0f;
        this.x = new Matrix();
        this.y = 0.0f;
        this.J = new Random();
        this.L = new e30[4];
        this.P = new OvershootInterpolator();
        this.I = z10;
        this.E = i10;
        for (int i11 = 0; i11 < 4; i11++) {
            this.L[i11] = new e30(i11);
        }
        this.b.b = AndroidUtilities.dp(37.0f);
        this.b.a = AndroidUtilities.dp(32.0f);
        this.c.b = AndroidUtilities.dp(37.0f);
        this.c.a = AndroidUtilities.dp(32.0f);
        this.b.b();
        this.c.b();
        xi0 xi0Var = new xi0(R.raw.voice_outlined, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(30.0f), true, null);
        this.G = xi0Var;
        setWillNotDraw(false);
        aj0 aj0Var = new aj0(context);
        this.F = aj0Var;
        aj0Var.setAnimation(xi0Var);
        aj0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(aj0Var);
        this.w = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(350.0f), 0.0f, new int[]{-2801343, -561538, 0}, new float[]{0.0f, 0.4f, 1.0f}, Shader.TileMode.CLAMP);
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
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.f(sharedInstance.getSelfId());
        if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) {
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

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.webRtcMicAmplitudeEvent) {
            setAmplitude(((Float) objArr[0]).floatValue() * 4000.0f);
        } else if (i10 == NotificationCenter.groupCallUpdated) {
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
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
        NotificationCenter.getInstance(this.E).addObserver(this, NotificationCenter.groupCallUpdated);
        boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        int i10 = z10 ? 13 : 24;
        xi0 xi0Var = this.G;
        xi0Var.N(i10);
        xi0Var.L(xi0Var.f - 1, false, true);
        a();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        int i10 = z10 ? 13 : 24;
        xi0 xi0Var = this.G;
        if (xi0Var.N(i10)) {
            if (z10) {
                xi0Var.K(0);
            } else {
                xi0Var.K(12);
            }
        }
        this.F.d();
        a();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.u0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraSwitch(boolean z10) {
        org.telegram.messenger.voip.u0.c(this, z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.I) {
            return;
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
        NotificationCenter.getInstance(this.E).removeObserver(this, NotificationCenter.groupCallUpdated);
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0248  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [android.graphics.Shader, boolean[]] */
    /* JADX WARN: Type inference failed for: r12v34 */
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
        super.onDraw(canvas);
        if (getAlpha() == 0.0f) {
            return;
        }
        int i12 = 1;
        float measuredWidth = getMeasuredWidth() >> 1;
        float measuredHeight = getMeasuredHeight() >> 1;
        boolean z13 = this.M;
        if (z13) {
            float f13 = this.N;
            if (f13 != 1.0f) {
                float f14 = f13 + 0.10666667f;
                this.N = f14;
                if (f14 > 1.0f) {
                    this.N = 1.0f;
                }
                float interpolation = pr.f.getInterpolation(this.N) * 0.1f;
                float f15 = interpolation + 1.0f;
                aj0 aj0Var = this.F;
                aj0Var.setScaleY(f15);
                aj0Var.setScaleX(f15);
                z10 = this.I;
                if (z10) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - this.H > 1000) {
                        this.H = currentTimeMillis;
                        float A = a4.a.A(org.telegram.ui.Cells.p6.c(this.J, 100), 0.5f, 100.0f, 0.5f);
                        this.e = A;
                        this.f = (A - this.d) / 595.0f;
                    }
                }
                f7 = this.e;
                f10 = this.d;
                if (f7 != f10) {
                    float f16 = this.f;
                    float f17 = (16.0f * f16) + f10;
                    this.d = f17;
                    if (f16 > 0.0f) {
                        if (f17 > f7) {
                            this.d = f7;
                        }
                    } else if (f17 < f7) {
                        this.d = f7;
                    }
                }
                ?? r12 = 0;
                if (this.n != null) {
                    float f18 = this.r + 0.064f;
                    this.r = f18;
                    if (f18 > 1.0f) {
                        this.r = 1.0f;
                        this.n = null;
                    }
                }
                z11 = this.s;
                if (z11) {
                    float f19 = this.v;
                    if (f19 != 1.0f) {
                        float f20 = f19 + 0.045714285f;
                        this.v = f20;
                        if (f20 > 1.0f) {
                            this.v = 1.0f;
                        }
                        if (this.K) {
                            invalidate();
                        }
                        int i13 = this.h.i;
                        i10 = 3;
                        int i14 = 2;
                        z12 = i13 == 3 && i13 != 2;
                        if (z12) {
                            float f21 = this.y;
                            if (f21 != 1.0f) {
                                float f22 = f21 + 0.045714285f;
                                this.y = f22;
                                if (f22 > 1.0f) {
                                    this.y = 1.0f;
                                }
                                float interpolation2 = (this.P.getInterpolation(this.y) * 0.35f) + 0.65f;
                                float f23 = this.d;
                                float f24 = !z10 ? 0.1f : 0.8f;
                                float f25 = 1.0f;
                                float f26 = 0.0f;
                                ca caVar = this.b;
                                caVar.e(f23, f24);
                                float f27 = this.d;
                                float f28 = !z10 ? 0.1f : 0.8f;
                                ca caVar2 = this.c;
                                caVar2.e(f27, f28);
                                i11 = 0;
                                while (i11 < i10) {
                                    if (i11 != 0 || this.n != null) {
                                        Paint paint = this.a;
                                        if (i11 == 0) {
                                            if (this.v != f25) {
                                                f11 = f25 - this.r;
                                                this.n.a(this.d);
                                                e30 e30Var = this.n;
                                                if (e30Var.i == i14) {
                                                    paint.setShader(r12);
                                                    paint.setColor(org.telegram.ui.ActionBar.j6.w0(r12, org.telegram.ui.ActionBar.j6.bh, false));
                                                } else {
                                                    paint.setShader(e30Var.g);
                                                }
                                                caVar.b = AndroidUtilities.dp(40.0f);
                                                caVar.a = AndroidUtilities.dp(32.0f);
                                                caVar2.b = AndroidUtilities.dp(38.0f);
                                                caVar2.a = AndroidUtilities.dp(33.0f);
                                                if (i11 != i14) {
                                                    f12 = 32.0f;
                                                    paint.setAlpha((int) ((f25 - this.v) * 76.0f * f11));
                                                } else {
                                                    f12 = 32.0f;
                                                    paint.setAlpha((int) (76.0f * f11 * this.v));
                                                }
                                                if (this.y != 0.0f) {
                                                    float min = Math.min((1.0f - this.O) * org.telegram.ui.Cells.p6.a(this.d, 0.3f, 1.0f, interpolation), 1.3f) * interpolation2;
                                                    canvas.save();
                                                    canvas.scale(min, min, measuredWidth, measuredHeight);
                                                    caVar.a(measuredWidth, measuredHeight, canvas, paint);
                                                    canvas.restore();
                                                    float min2 = Math.min((1.0f - this.O) * org.telegram.ui.Cells.p6.a(this.d, 0.26f, 1.0f, interpolation), 1.3f) * interpolation2;
                                                    canvas.save();
                                                    canvas.scale(min2, min2, measuredWidth, measuredHeight);
                                                    caVar2.a(measuredWidth, measuredHeight, canvas, paint);
                                                    canvas.restore();
                                                }
                                                i14 = 2;
                                                if (i11 == 2) {
                                                    paint.setAlpha((int) (this.v * 255.0f));
                                                } else if (i11 == 1) {
                                                    paint.setAlpha((int) (f11 * 255.0f));
                                                } else {
                                                    paint.setAlpha(255);
                                                }
                                                canvas.save();
                                                canvas.scale(f15, f15, measuredWidth, measuredHeight);
                                                canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(f12), paint);
                                                canvas.restore();
                                            }
                                        } else if (i11 == i12) {
                                            e30 e30Var2 = this.h;
                                            if (e30Var2 == null) {
                                                return;
                                            }
                                            if (this.v != f25) {
                                                f11 = this.n != null ? this.r : 1.0f;
                                                e30Var2.a(this.d);
                                                e30 e30Var3 = this.h;
                                                if (e30Var3.i == i14) {
                                                    paint.setShader(r12);
                                                    paint.setColor(org.telegram.ui.ActionBar.j6.w0(r12, org.telegram.ui.ActionBar.j6.bh, false));
                                                } else {
                                                    paint.setShader(e30Var3.g);
                                                }
                                                caVar.b = AndroidUtilities.dp(40.0f);
                                                caVar.a = AndroidUtilities.dp(32.0f);
                                                caVar2.b = AndroidUtilities.dp(38.0f);
                                                caVar2.a = AndroidUtilities.dp(33.0f);
                                                if (i11 != i14) {
                                                }
                                                if (this.y != 0.0f) {
                                                }
                                                i14 = 2;
                                                if (i11 == 2) {
                                                }
                                                canvas.save();
                                                canvas.scale(f15, f15, measuredWidth, measuredHeight);
                                                canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(f12), paint);
                                                canvas.restore();
                                            }
                                        } else if (this.v != f26) {
                                            paint.setColor(-65536);
                                            Matrix matrix = this.x;
                                            matrix.reset();
                                            matrix.postTranslate((f25 - this.v) * (-AndroidUtilities.dp(250.0f)), 0.0f);
                                            matrix.postRotate(this.Q, measuredWidth, measuredHeight);
                                            LinearGradient linearGradient = this.w;
                                            linearGradient.setLocalMatrix(matrix);
                                            paint.setShader(linearGradient);
                                            f11 = 1.0f;
                                            caVar.b = AndroidUtilities.dp(40.0f);
                                            caVar.a = AndroidUtilities.dp(32.0f);
                                            caVar2.b = AndroidUtilities.dp(38.0f);
                                            caVar2.a = AndroidUtilities.dp(33.0f);
                                            if (i11 != i14) {
                                            }
                                            if (this.y != 0.0f) {
                                            }
                                            i14 = 2;
                                            if (i11 == 2) {
                                            }
                                            canvas.save();
                                            canvas.scale(f15, f15, measuredWidth, measuredHeight);
                                            canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(f12), paint);
                                            canvas.restore();
                                        }
                                        i11++;
                                        i12 = 1;
                                        r12 = 0;
                                        i10 = 3;
                                        f25 = 1.0f;
                                        f26 = 0.0f;
                                    }
                                    i11++;
                                    i12 = 1;
                                    r12 = 0;
                                    i10 = 3;
                                    f25 = 1.0f;
                                    f26 = 0.0f;
                                }
                                if (!this.K || this.y <= 0.0f) {
                                    return;
                                }
                                invalidate();
                                return;
                            }
                        }
                        if (!z12) {
                            float f29 = this.y;
                            if (f29 != 0.0f) {
                                float f30 = f29 - 0.045714285f;
                                this.y = f30;
                                if (f30 < 0.0f) {
                                    this.y = 0.0f;
                                }
                            }
                        }
                        float interpolation22 = (this.P.getInterpolation(this.y) * 0.35f) + 0.65f;
                        float f232 = this.d;
                        if (!z10) {
                        }
                        float f252 = 1.0f;
                        float f262 = 0.0f;
                        ca caVar3 = this.b;
                        caVar3.e(f232, f24);
                        float f272 = this.d;
                        if (!z10) {
                        }
                        ca caVar22 = this.c;
                        caVar22.e(f272, f28);
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
                    float f31 = this.v;
                    if (f31 != 0.0f) {
                        float f32 = f31 - 0.045714285f;
                        this.v = f32;
                        if (f32 < 0.0f) {
                            this.v = 0.0f;
                        }
                    }
                }
                int i132 = this.h.i;
                i10 = 3;
                int i142 = 2;
                if (i132 == 3) {
                }
                if (z12) {
                }
                if (!z12) {
                }
                float interpolation222 = (this.P.getInterpolation(this.y) * 0.35f) + 0.65f;
                float f2322 = this.d;
                if (!z10) {
                }
                float f2522 = 1.0f;
                float f2622 = 0.0f;
                ca caVar32 = this.b;
                caVar32.e(f2322, f24);
                float f2722 = this.d;
                if (!z10) {
                }
                ca caVar222 = this.c;
                caVar222.e(f2722, f28);
                i11 = 0;
                while (i11 < i10) {
                }
                if (this.K) {
                }
            }
        }
        if (!z13) {
            float f33 = this.N;
            if (f33 != 0.0f) {
                float f34 = f33 - 0.10666667f;
                this.N = f34;
                if (f34 < 0.0f) {
                    this.N = 0.0f;
                }
            }
        }
        float interpolation3 = pr.f.getInterpolation(this.N) * 0.1f;
        float f152 = interpolation3 + 1.0f;
        aj0 aj0Var2 = this.F;
        aj0Var2.setScaleY(f152);
        aj0Var2.setScaleX(f152);
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
        int i1322 = this.h.i;
        i10 = 3;
        int i1422 = 2;
        if (i1322 == 3) {
        }
        if (z12) {
        }
        if (!z12) {
        }
        float interpolation2222 = (this.P.getInterpolation(this.y) * 0.35f) + 0.65f;
        float f23222 = this.d;
        if (!z10) {
        }
        float f25222 = 1.0f;
        float f26222 = 0.0f;
        ca caVar322 = this.b;
        caVar322.e(f23222, f24);
        float f27222 = this.d;
        if (!z10) {
        }
        ca caVar2222 = this.c;
        caVar2222.e(f27222, f28);
        i11 = 0;
        while (i11 < i10) {
        }
        if (this.K) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        z20 z20Var = z20.d0;
        if (z20Var != null) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(z20Var.w ? R.string.AccDescrCloseMenu : R.string.AccDescrOpenMenu2)));
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.u0.d(this, i10, i11);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.u0.e(this, z10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.u0.f(this, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i10) {
        a();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.u0.h(this, z10);
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
        e30 e30Var = this.h;
        if (e30Var == null || e30Var.i != i10) {
            this.n = e30Var;
            e30 e30Var2 = this.L[i10];
            this.h = e30Var2;
            float f7 = 0.0f;
            if (e30Var != null) {
                this.r = 0.0f;
            } else {
                this.r = 1.0f;
                int i11 = e30Var2.i;
                if (i11 != 3 && i11 != 2) {
                    f7 = 1.0f;
                }
                this.y = f7;
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            String string = (sharedInstance == null || !ChatObject.isChannelOrGiga(sharedInstance.getChat())) ? LocaleController.getString(R.string.VoipGroupVoiceChat) : LocaleController.getString(R.string.VoipChannelVoiceChat);
            if (i10 == 0) {
                string = org.telegram.messenger.w1.h(R.string.VoipTapToMute, w.f.g(string, ", "));
            } else if (i10 == 2) {
                string = org.telegram.messenger.w1.h(R.string.Connecting, w.f.g(string, ", "));
            } else if (i10 == 3) {
                string = org.telegram.messenger.w1.h(R.string.VoipMutedByAdmin, w.f.g(string, ", "));
            }
            setContentDescription(string);
            invalidate();
        }
    }
}
