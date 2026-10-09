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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class w30 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener {
    public final int E;
    public final fk0 F;
    public final ck0 G;
    public long H;
    public final boolean I;
    public final Random J;
    public boolean K;
    public final v30[] L;
    public boolean M;
    public float N;
    public float O;
    public final OvershootInterpolator P;
    public float Q;
    public final Paint a;
    public final da b;
    public final da c;
    public float d;
    public float e;
    public float f;
    public v30 h;
    public v30 n;
    public float r;
    public boolean s;
    public float v;
    public final LinearGradient w;
    public final Matrix x;
    public float y;

    public w30(int i10, Context context, boolean z10) {
        super(context);
        this.a = new Paint(1);
        this.b = new da(8);
        this.c = new da(9);
        this.r = 1.0f;
        this.x = new Matrix();
        this.y = 0.0f;
        this.J = new Random();
        this.L = new v30[4];
        this.P = new OvershootInterpolator();
        this.I = z10;
        this.E = i10;
        for (int i11 = 0; i11 < 4; i11++) {
            this.L[i11] = new v30(i11);
        }
        this.b.b = AndroidUtilities.dp(37.0f);
        this.b.a = AndroidUtilities.dp(32.0f);
        this.c.b = AndroidUtilities.dp(37.0f);
        this.c.a = AndroidUtilities.dp(32.0f);
        this.b.b();
        this.c.b();
        ck0 ck0Var = new ck0(R.raw.voice_outlined, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(30.0f), true, null);
        this.G = ck0Var;
        setWillNotDraw(false);
        fk0 fk0Var = new fk0(context);
        this.F = fk0Var;
        fk0Var.setAnimation(ck0Var);
        fk0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(fk0Var);
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
        ck0 ck0Var = this.G;
        ck0Var.P(i10);
        ck0Var.N(ck0Var.f - 1, false, true);
        a();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        int i10 = z10 ? 13 : 24;
        ck0 ck0Var = this.G;
        if (ck0Var.P(i10)) {
            if (z10) {
                ck0Var.M(0);
            } else {
                ck0Var.M(12);
            }
        }
        this.F.d();
        a();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.w0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraSwitch(boolean z10) {
        org.telegram.messenger.voip.w0.c(this, z10);
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
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0162  */
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
                float interpolation = hs.f.getInterpolation(this.N) * 0.1f;
                float f16 = interpolation + 1.0f;
                fk0 fk0Var = this.F;
                fk0Var.setScaleY(f16);
                fk0Var.setScaleX(f16);
                z10 = this.I;
                if (z10) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - this.H > 1000) {
                        this.H = currentTimeMillis;
                        float B = a1.g.B(org.telegram.ui.Cells.c1.d(this.J, 100), 0.5f, 100.0f, 0.5f);
                        this.e = B;
                        this.f = (B - this.d) / 595.0f;
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
                    float f20 = this.v;
                    if (f20 != 1.0f) {
                        float f21 = f20 + 0.045714285f;
                        this.v = f21;
                        if (f21 > 1.0f) {
                            this.v = 1.0f;
                        }
                        if (this.K) {
                            invalidate();
                        }
                        int i14 = this.h.i;
                        i10 = 3;
                        int i15 = 2;
                        z12 = i14 == 3 && i14 != 2;
                        if (z12) {
                            float f22 = this.y;
                            if (f22 != 1.0f) {
                                float f23 = f22 + 0.045714285f;
                                this.y = f23;
                                if (f23 > 1.0f) {
                                    this.y = 1.0f;
                                }
                                float interpolation2 = (this.P.getInterpolation(this.y) * 0.35f) + 0.65f;
                                float f24 = this.d;
                                float f25 = 1.0f;
                                float f26 = !z10 ? 0.1f : 0.8f;
                                float f27 = 0.0f;
                                da daVar = this.b;
                                daVar.e(f24, f26);
                                float f28 = this.d;
                                float f29 = !z10 ? 0.1f : 0.8f;
                                da daVar2 = this.c;
                                daVar2.e(f28, f29);
                                i11 = 0;
                                while (i11 < i10) {
                                    if (i11 != 0 || this.n != null) {
                                        Paint paint = this.a;
                                        if (i11 != 0) {
                                            if (i11 == i13) {
                                                v30 v30Var = this.h;
                                                if (v30Var == null) {
                                                    return;
                                                }
                                                if (this.v != f25) {
                                                    f11 = this.n != null ? this.r : f25;
                                                    v30Var.a(this.d);
                                                    v30 v30Var2 = this.h;
                                                    if (v30Var2.i == i15) {
                                                        paint.setShader(r12);
                                                        paint.setColor(org.telegram.ui.ActionBar.i6.x0(r12, org.telegram.ui.ActionBar.i6.bh, false));
                                                    } else {
                                                        paint.setShader(v30Var2.g);
                                                    }
                                                }
                                                f12 = f25;
                                                i12 = 1;
                                            } else {
                                                if (this.v != f27) {
                                                    paint.setColor(-65536);
                                                    Matrix matrix = this.x;
                                                    matrix.reset();
                                                    matrix.postTranslate((f25 - this.v) * (-AndroidUtilities.dp(250.0f)), f27);
                                                    matrix.postRotate(this.Q, measuredWidth, measuredHeight);
                                                    LinearGradient linearGradient = this.w;
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
                                        } else if (this.v != f25) {
                                            f11 = f25 - this.r;
                                            this.n.a(this.d);
                                            v30 v30Var3 = this.n;
                                            if (v30Var3.i == i15) {
                                                paint.setShader(r12);
                                                paint.setColor(org.telegram.ui.ActionBar.i6.x0(r12, org.telegram.ui.ActionBar.i6.bh, false));
                                            } else {
                                                paint.setShader(v30Var3.g);
                                            }
                                        }
                                        daVar.b = AndroidUtilities.dp(40.0f);
                                        daVar.a = AndroidUtilities.dp(32.0f);
                                        daVar2.b = AndroidUtilities.dp(38.0f);
                                        daVar2.a = AndroidUtilities.dp(33.0f);
                                        if (i11 != i15) {
                                            f13 = 32.0f;
                                            paint.setAlpha((int) ((f25 - this.v) * 76.0f * f11));
                                        } else {
                                            f13 = 32.0f;
                                            paint.setAlpha((int) (76.0f * f11 * this.v));
                                        }
                                        if (this.y != 0.0f) {
                                            f12 = f25;
                                            float min = Math.min((f12 - this.O) * sc.v.d(this.d, 0.3f, f12, interpolation), 1.3f) * interpolation2;
                                            canvas.save();
                                            canvas.scale(min, min, measuredWidth, measuredHeight);
                                            daVar.a(measuredWidth, measuredHeight, canvas, paint);
                                            canvas.restore();
                                            float min2 = Math.min((f12 - this.O) * sc.v.d(this.d, 0.26f, f12, interpolation), 1.3f) * interpolation2;
                                            canvas.save();
                                            canvas.scale(min2, min2, measuredWidth, measuredHeight);
                                            daVar2.a(measuredWidth, measuredHeight, canvas, paint);
                                            canvas.restore();
                                        } else {
                                            f12 = f25;
                                        }
                                        i15 = 2;
                                        if (i11 == 2) {
                                            paint.setAlpha((int) (this.v * 255.0f));
                                            i12 = 1;
                                        } else {
                                            i12 = 1;
                                            if (i11 == 1) {
                                                paint.setAlpha((int) (f11 * 255.0f));
                                            } else {
                                                paint.setAlpha(255);
                                            }
                                        }
                                        canvas.save();
                                        canvas.scale(f16, f16, measuredWidth, measuredHeight);
                                        canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(f13), paint);
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
                                if (!this.K || this.y <= 0.0f) {
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
                        float interpolation22 = (this.P.getInterpolation(this.y) * 0.35f) + 0.65f;
                        float f242 = this.d;
                        float f252 = 1.0f;
                        if (!z10) {
                        }
                        float f272 = 0.0f;
                        da daVar3 = this.b;
                        daVar3.e(f242, f26);
                        float f282 = this.d;
                        if (!z10) {
                        }
                        da daVar22 = this.c;
                        daVar22.e(f282, f29);
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
                    float f32 = this.v;
                    if (f32 != 0.0f) {
                        float f33 = f32 - 0.045714285f;
                        this.v = f33;
                        if (f33 < 0.0f) {
                            this.v = 0.0f;
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
                float interpolation222 = (this.P.getInterpolation(this.y) * 0.35f) + 0.65f;
                float f2422 = this.d;
                float f2522 = 1.0f;
                if (!z10) {
                }
                float f2722 = 0.0f;
                da daVar32 = this.b;
                daVar32.e(f2422, f26);
                float f2822 = this.d;
                if (!z10) {
                }
                da daVar222 = this.c;
                daVar222.e(f2822, f29);
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
        float interpolation3 = hs.f.getInterpolation(this.N) * 0.1f;
        float f162 = interpolation3 + 1.0f;
        fk0 fk0Var2 = this.F;
        fk0Var2.setScaleY(f162);
        fk0Var2.setScaleX(f162);
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
        float interpolation2222 = (this.P.getInterpolation(this.y) * 0.35f) + 0.65f;
        float f24222 = this.d;
        float f25222 = 1.0f;
        if (!z10) {
        }
        float f27222 = 0.0f;
        da daVar322 = this.b;
        daVar322.e(f24222, f26);
        float f28222 = this.d;
        if (!z10) {
        }
        da daVar2222 = this.c;
        daVar2222.e(f28222, f29);
        i11 = 0;
        while (i11 < i10) {
        }
        if (this.K) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        q30 q30Var = q30.d0;
        if (q30Var != null) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(q30Var.w ? R.string.AccDescrCloseMenu : R.string.AccDescrOpenMenu2)));
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.w0.d(this, i10, i11);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.w0.e(this, z10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.w0.f(this, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i10) {
        a();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.w0.h(this, z10);
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
        v30 v30Var = this.h;
        if (v30Var == null || v30Var.i != i10) {
            this.n = v30Var;
            v30 v30Var2 = this.L[i10];
            this.h = v30Var2;
            float f7 = 0.0f;
            if (v30Var != null) {
                this.r = 0.0f;
            } else {
                this.r = 1.0f;
                int i11 = v30Var2.i;
                if (i11 != 3 && i11 != 2) {
                    f7 = 1.0f;
                }
                this.y = f7;
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            String string = (sharedInstance == null || !ChatObject.isChannelOrGiga(sharedInstance.getChat())) ? LocaleController.getString(R.string.VoipGroupVoiceChat) : LocaleController.getString(R.string.VoipChannelVoiceChat);
            if (i10 == 0) {
                string = org.telegram.messenger.q.g(R.string.VoipTapToMute, sc.v.j(string, ", "));
            } else if (i10 == 2) {
                string = org.telegram.messenger.q.g(R.string.Connecting, sc.v.j(string, ", "));
            } else if (i10 == 3) {
                string = org.telegram.messenger.q.g(R.string.VoipMutedByAdmin, sc.v.j(string, ", "));
            }
            setContentDescription(string);
            invalidate();
        }
    }
}
