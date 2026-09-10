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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class p30 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener {
    public final int E;
    public final kj0 F;
    public final hj0 G;
    public long H;
    public final boolean I;
    public final Random J;
    public boolean K;
    public final o30[] L;
    public boolean M;
    public float N;
    public float O;
    public final OvershootInterpolator P;
    public float Q;
    public final Paint a;
    public final ba b;
    public final ba c;
    public float d;
    public float e;
    public float f;
    public o30 h;
    public o30 n;
    public float r;
    public boolean s;
    public float v;
    public final LinearGradient w;
    public final Matrix x;
    public float y;

    public p30(int i10, Context context, boolean z10) {
        super(context);
        this.a = new Paint(1);
        this.b = new ba(8);
        this.c = new ba(9);
        this.r = 1.0f;
        this.x = new Matrix();
        this.y = 0.0f;
        this.J = new Random();
        this.L = new o30[4];
        this.P = new OvershootInterpolator();
        this.I = z10;
        this.E = i10;
        for (int i11 = 0; i11 < 4; i11++) {
            this.L[i11] = new o30(i11);
        }
        this.b.b = AndroidUtilities.dp(37.0f);
        this.b.a = AndroidUtilities.dp(32.0f);
        this.c.b = AndroidUtilities.dp(37.0f);
        this.c.a = AndroidUtilities.dp(32.0f);
        this.b.b();
        this.c.b();
        hj0 hj0Var = new hj0(R.raw.voice_outlined, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(30.0f), true, null);
        this.G = hj0Var;
        setWillNotDraw(false);
        kj0 kj0Var = new kj0(context);
        this.F = kj0Var;
        kj0Var.setAnimation(hj0Var);
        kj0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(kj0Var);
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
        hj0 hj0Var = this.G;
        hj0Var.P(i10);
        hj0Var.N(hj0Var.f - 1, false, true);
        a();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        int i10 = z10 ? 13 : 24;
        hj0 hj0Var = this.G;
        if (hj0Var.P(i10)) {
            if (z10) {
                hj0Var.M(0);
            } else {
                hj0Var.M(12);
            }
        }
        this.F.d();
        a();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.x0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraSwitch(boolean z10) {
        org.telegram.messenger.voip.x0.c(this, z10);
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
                float interpolation = wr.f.getInterpolation(this.N) * 0.1f;
                float f15 = interpolation + 1.0f;
                kj0 kj0Var = this.F;
                kj0Var.setScaleY(f15);
                kj0Var.setScaleX(f15);
                z10 = this.I;
                if (z10) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - this.H > 1000) {
                        this.H = currentTimeMillis;
                        float A = a4.a.A(org.telegram.ui.Cells.r6.c(this.J, 100), 0.5f, 100.0f, 0.5f);
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
                                ba baVar = this.b;
                                baVar.e(f23, f24);
                                float f27 = this.d;
                                float f28 = !z10 ? 0.1f : 0.8f;
                                ba baVar2 = this.c;
                                baVar2.e(f27, f28);
                                i11 = 0;
                                while (i11 < i10) {
                                    if (i11 != 0 || this.n != null) {
                                        Paint paint = this.a;
                                        if (i11 == 0) {
                                            if (this.v != f25) {
                                                f11 = f25 - this.r;
                                                this.n.a(this.d);
                                                o30 o30Var = this.n;
                                                if (o30Var.i == i14) {
                                                    paint.setShader(r12);
                                                    paint.setColor(org.telegram.ui.ActionBar.j6.w0(r12, org.telegram.ui.ActionBar.j6.bh, false));
                                                } else {
                                                    paint.setShader(o30Var.g);
                                                }
                                                baVar.b = AndroidUtilities.dp(40.0f);
                                                baVar.a = AndroidUtilities.dp(32.0f);
                                                baVar2.b = AndroidUtilities.dp(38.0f);
                                                baVar2.a = AndroidUtilities.dp(33.0f);
                                                if (i11 != i14) {
                                                    f12 = 32.0f;
                                                    paint.setAlpha((int) ((f25 - this.v) * 76.0f * f11));
                                                } else {
                                                    f12 = 32.0f;
                                                    paint.setAlpha((int) (76.0f * f11 * this.v));
                                                }
                                                if (this.y != 0.0f) {
                                                    float min = Math.min((1.0f - this.O) * org.telegram.ui.Cells.r6.a(this.d, 0.3f, 1.0f, interpolation), 1.3f) * interpolation2;
                                                    canvas.save();
                                                    canvas.scale(min, min, measuredWidth, measuredHeight);
                                                    baVar.a(measuredWidth, measuredHeight, canvas, paint);
                                                    canvas.restore();
                                                    float min2 = Math.min((1.0f - this.O) * org.telegram.ui.Cells.r6.a(this.d, 0.26f, 1.0f, interpolation), 1.3f) * interpolation2;
                                                    canvas.save();
                                                    canvas.scale(min2, min2, measuredWidth, measuredHeight);
                                                    baVar2.a(measuredWidth, measuredHeight, canvas, paint);
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
                                            o30 o30Var2 = this.h;
                                            if (o30Var2 == null) {
                                                return;
                                            }
                                            if (this.v != f25) {
                                                f11 = this.n != null ? this.r : 1.0f;
                                                o30Var2.a(this.d);
                                                o30 o30Var3 = this.h;
                                                if (o30Var3.i == i14) {
                                                    paint.setShader(r12);
                                                    paint.setColor(org.telegram.ui.ActionBar.j6.w0(r12, org.telegram.ui.ActionBar.j6.bh, false));
                                                } else {
                                                    paint.setShader(o30Var3.g);
                                                }
                                                baVar.b = AndroidUtilities.dp(40.0f);
                                                baVar.a = AndroidUtilities.dp(32.0f);
                                                baVar2.b = AndroidUtilities.dp(38.0f);
                                                baVar2.a = AndroidUtilities.dp(33.0f);
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
                                            baVar.b = AndroidUtilities.dp(40.0f);
                                            baVar.a = AndroidUtilities.dp(32.0f);
                                            baVar2.b = AndroidUtilities.dp(38.0f);
                                            baVar2.a = AndroidUtilities.dp(33.0f);
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
                        ba baVar3 = this.b;
                        baVar3.e(f232, f24);
                        float f272 = this.d;
                        if (!z10) {
                        }
                        ba baVar22 = this.c;
                        baVar22.e(f272, f28);
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
                ba baVar32 = this.b;
                baVar32.e(f2322, f24);
                float f2722 = this.d;
                if (!z10) {
                }
                ba baVar222 = this.c;
                baVar222.e(f2722, f28);
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
        float interpolation3 = wr.f.getInterpolation(this.N) * 0.1f;
        float f152 = interpolation3 + 1.0f;
        kj0 kj0Var2 = this.F;
        kj0Var2.setScaleY(f152);
        kj0Var2.setScaleX(f152);
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
        ba baVar322 = this.b;
        baVar322.e(f23222, f24);
        float f27222 = this.d;
        if (!z10) {
        }
        ba baVar2222 = this.c;
        baVar2222.e(f27222, f28);
        i11 = 0;
        while (i11 < i10) {
        }
        if (this.K) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        j30 j30Var = j30.d0;
        if (j30Var != null) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(j30Var.w ? R.string.AccDescrCloseMenu : R.string.AccDescrOpenMenu2)));
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.x0.d(this, i10, i11);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.x0.e(this, z10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.x0.f(this, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i10) {
        a();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.x0.h(this, z10);
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
        o30 o30Var = this.h;
        if (o30Var == null || o30Var.i != i10) {
            this.n = o30Var;
            o30 o30Var2 = this.L[i10];
            this.h = o30Var2;
            float f7 = 0.0f;
            if (o30Var != null) {
                this.r = 0.0f;
            } else {
                this.r = 1.0f;
                int i11 = o30Var2.i;
                if (i11 != 3 && i11 != 2) {
                    f7 = 1.0f;
                }
                this.y = f7;
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            String string = (sharedInstance == null || !ChatObject.isChannelOrGiga(sharedInstance.getChat())) ? LocaleController.getString(R.string.VoipGroupVoiceChat) : LocaleController.getString(R.string.VoipChannelVoiceChat);
            if (i10 == 0) {
                string = org.telegram.messenger.a2.h(R.string.VoipTapToMute, w.f.g(string, ", "));
            } else if (i10 == 2) {
                string = org.telegram.messenger.a2.h(R.string.Connecting, w.f.g(string, ", "));
            } else if (i10 == 3) {
                string = org.telegram.messenger.a2.h(R.string.VoipMutedByAdmin, w.f.g(string, ", "));
            }
            setContentDescription(string);
            invalidate();
        }
    }
}
