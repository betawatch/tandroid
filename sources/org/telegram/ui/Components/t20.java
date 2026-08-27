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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class t20 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener {
    public final int A;
    public final ri0 B;
    public final oi0 C;
    public long D;
    public final boolean E;
    public final Random F;
    public boolean G;
    public final s20[] H;
    public boolean I;
    public float J;
    public float K;
    public final OvershootInterpolator L;
    public float M;
    public final Paint a;
    public final s9 b;
    public final s9 c;
    public float d;
    public float e;
    public float f;
    public s20 h;
    public s20 n;
    public float r;
    public boolean s;
    public float v;
    public final LinearGradient w;
    public final Matrix x;
    public float y;

    public t20(int i10, Context context, boolean z10) {
        super(context);
        this.a = new Paint(1);
        this.b = new s9(8);
        this.c = new s9(9);
        this.r = 1.0f;
        this.x = new Matrix();
        this.y = 0.0f;
        this.F = new Random();
        this.H = new s20[4];
        this.L = new OvershootInterpolator();
        this.E = z10;
        this.A = i10;
        for (int i11 = 0; i11 < 4; i11++) {
            this.H[i11] = new s20(i11);
        }
        this.b.b = AndroidUtilities.dp(37.0f);
        this.b.a = AndroidUtilities.dp(32.0f);
        this.c.b = AndroidUtilities.dp(37.0f);
        this.c.a = AndroidUtilities.dp(32.0f);
        this.b.b();
        this.c.b();
        oi0 oi0Var = new oi0(R.raw.voice_outlined, "" + R.raw.voice_outlined, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(30.0f), true, null);
        this.C = oi0Var;
        setWillNotDraw(false);
        ri0 ri0Var = new ri0(context);
        this.B = ri0Var;
        ri0Var.setAnimation(oi0Var);
        ri0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(ri0Var);
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
        if (this.E) {
            return;
        }
        setAmplitude(0.0d);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
        NotificationCenter.getInstance(this.A).addObserver(this, NotificationCenter.groupCallUpdated);
        boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        int i10 = z10 ? 13 : 24;
        oi0 oi0Var = this.C;
        oi0Var.N(i10);
        oi0Var.L(oi0Var.f - 1, false, true);
        a();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        int i10 = z10 ? 13 : 24;
        oi0 oi0Var = this.C;
        if (oi0Var.N(i10)) {
            if (z10) {
                oi0Var.K(0);
            } else {
                oi0Var.K(12);
            }
        }
        this.B.d();
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
        if (this.E) {
            return;
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
        NotificationCenter.getInstance(this.A).removeObserver(this, NotificationCenter.groupCallUpdated);
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
        float f10;
        float f11;
        boolean z11;
        int i10;
        boolean z12;
        int i11;
        float f12;
        float f13;
        super.onDraw(canvas);
        if (getAlpha() == 0.0f) {
            return;
        }
        int i12 = 1;
        float measuredWidth = getMeasuredWidth() >> 1;
        float measuredHeight = getMeasuredHeight() >> 1;
        boolean z13 = this.I;
        if (z13) {
            float f14 = this.J;
            if (f14 != 1.0f) {
                float f15 = f14 + 0.10666667f;
                this.J = f15;
                if (f15 > 1.0f) {
                    this.J = 1.0f;
                }
                float interpolation = er.f.getInterpolation(this.J) * 0.1f;
                float f16 = interpolation + 1.0f;
                ri0 ri0Var = this.B;
                ri0Var.setScaleY(f16);
                ri0Var.setScaleX(f16);
                z10 = this.E;
                if (z10) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - this.D > 1000) {
                        this.D = currentTimeMillis;
                        float d = a9.p.d(org.telegram.ui.Cells.pa.f(this.F, 100), 0.5f, 100.0f, 0.5f);
                        this.e = d;
                        this.f = (d - this.d) / 595.0f;
                    }
                }
                f10 = this.e;
                f11 = this.d;
                if (f10 != f11) {
                    float f17 = this.f;
                    float f18 = (16.0f * f17) + f11;
                    this.d = f18;
                    if (f17 > 0.0f) {
                        if (f18 > f10) {
                            this.d = f10;
                        }
                    } else if (f18 < f10) {
                        this.d = f10;
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
                    float f20 = this.v;
                    if (f20 != 1.0f) {
                        float f21 = f20 + 0.045714285f;
                        this.v = f21;
                        if (f21 > 1.0f) {
                            this.v = 1.0f;
                        }
                        if (this.G) {
                            invalidate();
                        }
                        int i13 = this.h.i;
                        i10 = 3;
                        int i14 = 2;
                        z12 = i13 == 3 && i13 != 2;
                        if (z12) {
                            float f22 = this.y;
                            if (f22 != 1.0f) {
                                float f23 = f22 + 0.045714285f;
                                this.y = f23;
                                if (f23 > 1.0f) {
                                    this.y = 1.0f;
                                }
                                float interpolation2 = (this.L.getInterpolation(this.y) * 0.35f) + 0.65f;
                                float f24 = this.d;
                                float f25 = !z10 ? 0.1f : 0.8f;
                                float f26 = 1.0f;
                                float f27 = 0.0f;
                                s9 s9Var = this.b;
                                s9Var.e(f24, f25);
                                float f28 = this.d;
                                float f29 = !z10 ? 0.1f : 0.8f;
                                s9 s9Var2 = this.c;
                                s9Var2.e(f28, f29);
                                i11 = 0;
                                while (i11 < i10) {
                                    if (i11 != 0 || this.n != null) {
                                        Paint paint = this.a;
                                        if (i11 == 0) {
                                            if (this.v != f26) {
                                                f12 = f26 - this.r;
                                                this.n.a(this.d);
                                                s20 s20Var = this.n;
                                                if (s20Var.i == i14) {
                                                    paint.setShader(r12);
                                                    paint.setColor(org.telegram.ui.ActionBar.g6.w0(r12, org.telegram.ui.ActionBar.g6.bh, false));
                                                } else {
                                                    paint.setShader(s20Var.g);
                                                }
                                                s9Var.b = AndroidUtilities.dp(40.0f);
                                                s9Var.a = AndroidUtilities.dp(32.0f);
                                                s9Var2.b = AndroidUtilities.dp(38.0f);
                                                s9Var2.a = AndroidUtilities.dp(33.0f);
                                                if (i11 != i14) {
                                                    f13 = 32.0f;
                                                    paint.setAlpha((int) ((f26 - this.v) * 76.0f * f12));
                                                } else {
                                                    f13 = 32.0f;
                                                    paint.setAlpha((int) (76.0f * f12 * this.v));
                                                }
                                                if (this.y != 0.0f) {
                                                    float min = Math.min((1.0f - this.K) * com.google.android.recaptcha.internal.a.d(this.d, 0.3f, 1.0f, interpolation), 1.3f) * interpolation2;
                                                    canvas.save();
                                                    canvas.scale(min, min, measuredWidth, measuredHeight);
                                                    s9Var.a(measuredWidth, measuredHeight, canvas, paint);
                                                    canvas.restore();
                                                    float min2 = Math.min((1.0f - this.K) * com.google.android.recaptcha.internal.a.d(this.d, 0.26f, 1.0f, interpolation), 1.3f) * interpolation2;
                                                    canvas.save();
                                                    canvas.scale(min2, min2, measuredWidth, measuredHeight);
                                                    s9Var2.a(measuredWidth, measuredHeight, canvas, paint);
                                                    canvas.restore();
                                                }
                                                i14 = 2;
                                                if (i11 == 2) {
                                                    paint.setAlpha((int) (this.v * 255.0f));
                                                } else if (i11 == 1) {
                                                    paint.setAlpha((int) (f12 * 255.0f));
                                                } else {
                                                    paint.setAlpha(255);
                                                }
                                                canvas.save();
                                                canvas.scale(f16, f16, measuredWidth, measuredHeight);
                                                canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(f13), paint);
                                                canvas.restore();
                                            }
                                        } else if (i11 == i12) {
                                            s20 s20Var2 = this.h;
                                            if (s20Var2 == null) {
                                                return;
                                            }
                                            if (this.v != f26) {
                                                f12 = this.n != null ? this.r : 1.0f;
                                                s20Var2.a(this.d);
                                                s20 s20Var3 = this.h;
                                                if (s20Var3.i == i14) {
                                                    paint.setShader(r12);
                                                    paint.setColor(org.telegram.ui.ActionBar.g6.w0(r12, org.telegram.ui.ActionBar.g6.bh, false));
                                                } else {
                                                    paint.setShader(s20Var3.g);
                                                }
                                                s9Var.b = AndroidUtilities.dp(40.0f);
                                                s9Var.a = AndroidUtilities.dp(32.0f);
                                                s9Var2.b = AndroidUtilities.dp(38.0f);
                                                s9Var2.a = AndroidUtilities.dp(33.0f);
                                                if (i11 != i14) {
                                                }
                                                if (this.y != 0.0f) {
                                                }
                                                i14 = 2;
                                                if (i11 == 2) {
                                                }
                                                canvas.save();
                                                canvas.scale(f16, f16, measuredWidth, measuredHeight);
                                                canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(f13), paint);
                                                canvas.restore();
                                            }
                                        } else if (this.v != f27) {
                                            paint.setColor(-65536);
                                            Matrix matrix = this.x;
                                            matrix.reset();
                                            matrix.postTranslate((f26 - this.v) * (-AndroidUtilities.dp(250.0f)), 0.0f);
                                            matrix.postRotate(this.M, measuredWidth, measuredHeight);
                                            LinearGradient linearGradient = this.w;
                                            linearGradient.setLocalMatrix(matrix);
                                            paint.setShader(linearGradient);
                                            f12 = 1.0f;
                                            s9Var.b = AndroidUtilities.dp(40.0f);
                                            s9Var.a = AndroidUtilities.dp(32.0f);
                                            s9Var2.b = AndroidUtilities.dp(38.0f);
                                            s9Var2.a = AndroidUtilities.dp(33.0f);
                                            if (i11 != i14) {
                                            }
                                            if (this.y != 0.0f) {
                                            }
                                            i14 = 2;
                                            if (i11 == 2) {
                                            }
                                            canvas.save();
                                            canvas.scale(f16, f16, measuredWidth, measuredHeight);
                                            canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(f13), paint);
                                            canvas.restore();
                                        }
                                        i11++;
                                        i12 = 1;
                                        r12 = 0;
                                        i10 = 3;
                                        f26 = 1.0f;
                                        f27 = 0.0f;
                                    }
                                    i11++;
                                    i12 = 1;
                                    r12 = 0;
                                    i10 = 3;
                                    f26 = 1.0f;
                                    f27 = 0.0f;
                                }
                                if (!this.G || this.y <= 0.0f) {
                                    return;
                                }
                                invalidate();
                                return;
                            }
                        }
                        if (!z12) {
                            float f30 = this.y;
                            if (f30 != 0.0f) {
                                float f31 = f30 - 0.045714285f;
                                this.y = f31;
                                if (f31 < 0.0f) {
                                    this.y = 0.0f;
                                }
                            }
                        }
                        float interpolation22 = (this.L.getInterpolation(this.y) * 0.35f) + 0.65f;
                        float f242 = this.d;
                        if (!z10) {
                        }
                        float f262 = 1.0f;
                        float f272 = 0.0f;
                        s9 s9Var3 = this.b;
                        s9Var3.e(f242, f25);
                        float f282 = this.d;
                        if (!z10) {
                        }
                        s9 s9Var22 = this.c;
                        s9Var22.e(f282, f29);
                        i11 = 0;
                        while (i11 < i10) {
                        }
                        if (this.G) {
                            return;
                        } else {
                            return;
                        }
                    }
                }
                if (!z11) {
                    float f32 = this.v;
                    if (f32 != 0.0f) {
                        float f33 = f32 - 0.045714285f;
                        this.v = f33;
                        if (f33 < 0.0f) {
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
                float interpolation222 = (this.L.getInterpolation(this.y) * 0.35f) + 0.65f;
                float f2422 = this.d;
                if (!z10) {
                }
                float f2622 = 1.0f;
                float f2722 = 0.0f;
                s9 s9Var32 = this.b;
                s9Var32.e(f2422, f25);
                float f2822 = this.d;
                if (!z10) {
                }
                s9 s9Var222 = this.c;
                s9Var222.e(f2822, f29);
                i11 = 0;
                while (i11 < i10) {
                }
                if (this.G) {
                }
            }
        }
        if (!z13) {
            float f34 = this.J;
            if (f34 != 0.0f) {
                float f35 = f34 - 0.10666667f;
                this.J = f35;
                if (f35 < 0.0f) {
                    this.J = 0.0f;
                }
            }
        }
        float interpolation3 = er.f.getInterpolation(this.J) * 0.1f;
        float f162 = interpolation3 + 1.0f;
        ri0 ri0Var2 = this.B;
        ri0Var2.setScaleY(f162);
        ri0Var2.setScaleX(f162);
        z10 = this.E;
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
        i10 = 3;
        int i1422 = 2;
        if (i1322 == 3) {
        }
        if (z12) {
        }
        if (!z12) {
        }
        float interpolation2222 = (this.L.getInterpolation(this.y) * 0.35f) + 0.65f;
        float f24222 = this.d;
        if (!z10) {
        }
        float f26222 = 1.0f;
        float f27222 = 0.0f;
        s9 s9Var322 = this.b;
        s9Var322.e(f24222, f25);
        float f28222 = this.d;
        if (!z10) {
        }
        s9 s9Var2222 = this.c;
        s9Var2222.e(f28222, f29);
        i11 = 0;
        while (i11 < i10) {
        }
        if (this.G) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        n20 n20Var = n20.Z;
        if (n20Var != null) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(n20Var.w ? R.string.AccDescrCloseMenu : R.string.AccDescrOpenMenu2)));
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

    public void setPinnedProgress(float f10) {
        this.K = f10;
    }

    public void setPressedState(boolean z10) {
        this.I = z10;
    }

    public void setRemoveAngle(double d) {
        this.M = (float) d;
    }

    public void setState(int i10) {
        s20 s20Var = this.h;
        if (s20Var == null || s20Var.i != i10) {
            this.n = s20Var;
            s20 s20Var2 = this.H[i10];
            this.h = s20Var2;
            float f10 = 0.0f;
            if (s20Var != null) {
                this.r = 0.0f;
            } else {
                this.r = 1.0f;
                int i11 = s20Var2.i;
                if (i11 != 3 && i11 != 2) {
                    f10 = 1.0f;
                }
                this.y = f10;
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            String string = (sharedInstance == null || !ChatObject.isChannelOrGiga(sharedInstance.getChat())) ? LocaleController.getString(R.string.VoipGroupVoiceChat) : LocaleController.getString(R.string.VoipChannelVoiceChat);
            if (i10 == 0) {
                string = org.telegram.messenger.y1.i(R.string.VoipTapToMute, s3.c.f(string, ", "));
            } else if (i10 == 2) {
                string = org.telegram.messenger.y1.i(R.string.Connecting, s3.c.f(string, ", "));
            } else if (i10 == 3) {
                string = org.telegram.messenger.y1.i(R.string.VoipMutedByAdmin, s3.c.f(string, ", "));
            }
            setContentDescription(string);
            invalidate();
        }
    }
}
