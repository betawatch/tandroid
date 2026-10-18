package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Property;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class l60 extends r60 {
    public int A0;
    public boolean B0;
    public boolean C0;
    public float D0;
    public final org.telegram.ui.gl E;
    public int E0;
    public final LinearLayout F;
    public long F0;
    public final ei.q2 G;
    public boolean G0;
    public final ei.q2 H;
    public boolean H0;
    public final ImageView I;
    public final hq I0;
    public final ei.s2 J;
    public final l2.f J0;
    public final int[] K;
    public final Matrix L;
    public final float[] M;
    public final Paint N;
    public final int O;
    public si.s0 P;
    public si.q0 Q;
    public si.r0 R;
    public si.k0 S;
    public y01 T;
    public VideoEditedInfo U;
    public k60 V;
    public AnimatorSet W;
    public ValueAnimator a0;
    public ValueAnimator b0;
    public final uj0 c0;
    public uj0 d0;
    public uj0 e0;
    public final y50 f;
    public boolean f0;
    public boolean g0;
    public final int h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public final int n;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public final boolean r;
    public long r0;
    public final View s;
    public int s0;
    public Bitmap t0;
    public long u0;
    public final j60 v;
    public float v0;
    public final um0 w;
    public float w0;
    public final FrameLayout x;
    public float x0;
    public final i60 y;
    public float y0;
    public int z0;

    public l60(Activity activity, y50 y50Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.h = UserConfig.selectedAccount;
        this.K = new int[2];
        this.L = new Matrix();
        this.M = new float[9];
        this.N = new Paint(3);
        this.z0 = -1;
        this.A0 = -1;
        this.D0 = Float.NaN;
        this.I0 = new hq(this, 25);
        this.J0 = new l2.f(this, 9);
        this.f = y50Var;
        this.n = y50Var.getClassGuid();
        this.r = y50Var.x();
        this.s = y50Var.getFragmentView();
        setWillNotDraw(false);
        ei.s2 s2Var = new ei.s2(activity, null, this, null);
        this.J = s2Var;
        s2Var.o = 0.5f;
        s2Var.n = ei.s2.f(0.5f);
        s2Var.g();
        addView(s2Var.b, w7.z5.e(-1, -1, 119));
        j60 j60Var = new j60(this, activity);
        this.v = j60Var;
        um0 um0Var = new um0(activity);
        this.w = um0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.x = frameLayout;
        i60 i60Var = new i60(this, activity, 0);
        i60Var.setOpaque(true);
        i60Var.setClickable(true);
        i60Var.setCameraDistance(AndroidUtilities.dp(8000.0f));
        i60Var.setOutlineProvider(new ci.n1(13));
        i60Var.setClipToOutline(true);
        this.y = i60Var;
        frameLayout.addView(i60Var, w7.z5.e(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.gl glVar = new org.telegram.ui.gl(this, activity, paint);
        this.E = glVar;
        glVar.setOutlineProvider(new ci.n1(12));
        glVar.setClipToOutline(true);
        frameLayout.addView(glVar, w7.z5.e(-1, -1, 119));
        um0Var.addView(frameLayout, w7.z5.d(-1, -1.0f, 119, 14.0f, 14.0f, 14.0f, 14.0f));
        j60Var.addView(um0Var, w7.z5.e(-1, -1, 119));
        int i10 = AndroidUtilities.roundPlayingMessageSize;
        addView(j60Var, new FrameLayout.LayoutParams(i10, i10, 17));
        addView(s2Var.c, w7.z5.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.F = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        addView(linearLayout, w7.z5.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ei.q2 q2Var = new ei.q2(activity);
        this.G = q2Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        q2Var.setScaleType(scaleType);
        q2Var.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        linearLayout.addView(q2Var, w7.z5.n(44, 44));
        final int i11 = 0;
        q2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.h60
            public final /* synthetic */ l60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                si.r0 r0Var;
                si.k0 k0Var;
                boolean z10;
                si.r0 r0Var2;
                int i12;
                switch (i11) {
                    case 0:
                        l60 l60Var = this.b;
                        si.s0 s0Var = l60Var.P;
                        if (s0Var != null && (r0Var = l60Var.R) != null && (k0Var = l60Var.S) != null && r0Var.a == 3 && !r0Var.e && !l60Var.n0) {
                            si.l0 l0Var = k0Var.a;
                            si.l0 l0Var2 = si.l0.a;
                            if (l0Var == l0Var2) {
                                l0Var2 = si.l0.b;
                            }
                            s0Var.getClass();
                            si.s0.t();
                            int i13 = s0Var.W;
                            if (i13 != 7 && i13 != 8 && i13 != 9 && i13 != 10) {
                                if (s0Var.p != l0Var2) {
                                    s0Var.m.b("camera facing requested: " + s0Var.p + " -> " + l0Var2 + ", state=" + r4.c.w(s0Var.W));
                                    s0Var.p = l0Var2;
                                    int i14 = s0Var.W;
                                    if (i14 == 3 || i14 == 2) {
                                        s0Var.e();
                                        si.j jVar = s0Var.l;
                                        jVar.F = l0Var2;
                                        Handler handler = jVar.n;
                                        if (!jVar.V || handler == null) {
                                            z10 = false;
                                        } else {
                                            handler.post(new org.telegram.ui.web.g2(22, jVar, l0Var2));
                                            z10 = true;
                                        }
                                        s0Var.w = z10;
                                    }
                                    s0Var.n();
                                    s0Var.o();
                                }
                                l60Var.c0.M(0);
                                l60Var.c0.start();
                                break;
                            }
                        }
                        break;
                    default:
                        l60 l60Var2 = this.b;
                        si.s0 s0Var2 = l60Var2.P;
                        if (s0Var2 != null && (r0Var2 = l60Var2.R) != null && l60Var2.S != null) {
                            boolean z11 = !r0Var2.f;
                            si.j jVar2 = s0Var2.l;
                            si.s0.t();
                            if (s0Var2.W == 3 && !s0Var2.w && (i12 = s0Var2.X) != 1) {
                                s0Var2.u = z11;
                                if (i12 == 3) {
                                    s0Var2.u(z11);
                                    jVar2.T(false);
                                } else {
                                    s0Var2.u(false);
                                    jVar2.T(z11);
                                }
                                s0Var2.o();
                                l60Var2.z();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        ei.q2 q2Var2 = new ei.q2(activity);
        this.H = q2Var2;
        q2Var2.setScaleType(scaleType);
        linearLayout.addView(q2Var2, w7.z5.n(44, 44));
        final int i12 = 1;
        q2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.h60
            public final /* synthetic */ l60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                si.r0 r0Var;
                si.k0 k0Var;
                boolean z10;
                si.r0 r0Var2;
                int i122;
                switch (i12) {
                    case 0:
                        l60 l60Var = this.b;
                        si.s0 s0Var = l60Var.P;
                        if (s0Var != null && (r0Var = l60Var.R) != null && (k0Var = l60Var.S) != null && r0Var.a == 3 && !r0Var.e && !l60Var.n0) {
                            si.l0 l0Var = k0Var.a;
                            si.l0 l0Var2 = si.l0.a;
                            if (l0Var == l0Var2) {
                                l0Var2 = si.l0.b;
                            }
                            s0Var.getClass();
                            si.s0.t();
                            int i13 = s0Var.W;
                            if (i13 != 7 && i13 != 8 && i13 != 9 && i13 != 10) {
                                if (s0Var.p != l0Var2) {
                                    s0Var.m.b("camera facing requested: " + s0Var.p + " -> " + l0Var2 + ", state=" + r4.c.w(s0Var.W));
                                    s0Var.p = l0Var2;
                                    int i14 = s0Var.W;
                                    if (i14 == 3 || i14 == 2) {
                                        s0Var.e();
                                        si.j jVar = s0Var.l;
                                        jVar.F = l0Var2;
                                        Handler handler = jVar.n;
                                        if (!jVar.V || handler == null) {
                                            z10 = false;
                                        } else {
                                            handler.post(new org.telegram.ui.web.g2(22, jVar, l0Var2));
                                            z10 = true;
                                        }
                                        s0Var.w = z10;
                                    }
                                    s0Var.n();
                                    s0Var.o();
                                }
                                l60Var.c0.M(0);
                                l60Var.c0.start();
                                break;
                            }
                        }
                        break;
                    default:
                        l60 l60Var2 = this.b;
                        si.s0 s0Var2 = l60Var2.P;
                        if (s0Var2 != null && (r0Var2 = l60Var2.R) != null && l60Var2.S != null) {
                            boolean z11 = !r0Var2.f;
                            si.j jVar2 = s0Var2.l;
                            si.s0.t();
                            if (s0Var2.W == 3 && !s0Var2.w && (i122 = s0Var2.X) != 1) {
                                s0Var2.u = z11;
                                if (i122 == 3) {
                                    s0Var2.u(z11);
                                    jVar2.T(false);
                                } else {
                                    s0Var2.u(false);
                                    jVar2.T(z11);
                                }
                                s0Var2.o();
                                l60Var2.z();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        int dp = AndroidUtilities.dp(24.0f);
        this.O = dp;
        uj0 uj0Var = new uj0(R.raw.roundcamera_flip, dp, dp);
        this.c0 = uj0Var;
        uj0Var.setCallback(q2Var);
        uj0Var.M(uj0Var.e[0] - 1);
        q2Var.setImageDrawable(uj0Var);
        z();
        if (d6Var != null && !d6Var.a()) {
            q2Var.setInvert(0.6f);
            q2Var2.setInvert(0.6f);
        }
        ImageView imageView = new ImageView(activity);
        this.I = imageView;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.video_mute);
        imageView.setAlpha(0.0f);
        addView(imageView, w7.z5.e(48, 48, 17));
        i60Var.setOnTouchListener(new rk(this, 2));
        super.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getCameraFlipElapsedMs() {
        if (this.r0 == 0) {
            return 0L;
        }
        return Math.max(0L, SystemClock.elapsedRealtime() - this.r0);
    }

    private long getCurrentDurationMs() {
        si.r0 r0Var;
        si.s0 s0Var = this.P;
        if (s0Var == null || (r0Var = this.R) == null) {
            return 0L;
        }
        return r0Var.a == 3 ? s0Var.j() : r0Var.b;
    }

    public static void l(l60 l60Var) {
        if (l60Var.n0 && l60Var.q0 && l60Var.o0 && l60Var.p0) {
            l60Var.n0 = false;
            FileLog.d("RoundVideo camera flip completed: elapsedMs=" + l60Var.getCameraFlipElapsedMs());
            l60Var.y();
        }
    }

    public static void m(l60 l60Var) {
        org.telegram.ui.gl glVar = l60Var.E;
        if (l60Var.l0) {
            l60Var.l0 = false;
            glVar.invalidate();
            glVar.animate().cancel();
            glVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecordingUiFrameClockActive(boolean z10) {
        org.telegram.ui.hk hkVar;
        if (z10 == this.G0) {
            return;
        }
        this.G0 = z10;
        this.F0 = 0L;
        hq hqVar = this.I0;
        if (z10) {
            zf.h.d().a(30, hqVar);
        } else {
            zf.h.d().f(hqVar);
        }
        if (this.d == z10) {
            return;
        }
        this.d = z10;
        p60 p60Var = this.c;
        if (p60Var == null || (hkVar = ((org.telegram.ui.lj) p60Var).a.Y) == null) {
            return;
        }
        hkVar.setRoundVideoUiFrameClockActive(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenFlashEnabled(boolean z10) {
        Activity parentActivity = this.f.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        ei.s2 s2Var = this.J;
        if (z10) {
            if (Float.isNaN(this.D0)) {
                this.D0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            s2Var.c(null);
        } else {
            if (!Float.isNaN(this.D0)) {
                attributes.screenBrightness = this.D0;
                this.D0 = Float.NaN;
            }
            s2Var.d();
        }
        parentActivity.getWindow().setAttributes(attributes);
    }

    public final void A() {
        org.telegram.ui.hk hkVar;
        si.r0 r0Var = this.R;
        if (r0Var != null) {
            long j10 = r0Var.d;
            if (r0Var.a != 3) {
                return;
            }
            long min = Math.min(j10, (SystemClock.elapsedRealtime() + r0Var.b) - r0Var.c);
            this.u0 = min;
            this.w.setProgress(min / j10);
            p60 p60Var = this.c;
            if (p60Var == null || (hkVar = ((org.telegram.ui.lj) p60Var).a.Y) == null || !hkVar.j1) {
                return;
            }
            hkVar.i1 = min;
            xg xgVar = hkVar.Y0;
            if (xgVar != null && xgVar.r) {
                xgVar.h = min;
                xgVar.invalidate();
            }
            ug ugVar = hkVar.l1;
            if (ugVar != null && ugVar.n) {
                if (!ugVar.h) {
                    long j11 = ugVar.r;
                    if (j11 >= 0) {
                        if (!ugVar.e) {
                            long max = Math.max(0L, min - j11) % 1200;
                            ugVar.a = max < 600 ? 1.0f - (max / 600.0f) : (max - 600) / 600.0f;
                        }
                        ugVar.invalidate();
                    }
                }
                ugVar.r = min;
                ugVar.a = 1.0f;
                ugVar.invalidate();
            }
            ChatActivityEnterView.SlideTextView slideTextView = hkVar.k1;
            if (slideTextView == null || !slideTextView.J || slideTextView.n == 1.0f) {
                return;
            }
            slideTextView.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.r60
    public final void a(boolean z10) {
        if (this.P == null) {
            return;
        }
        u(z10 ? 0 : 6);
        this.P.a();
        y01 y01Var = this.T;
        if (y01Var != null) {
            y01Var.d(true);
        }
        this.T = null;
        MediaController.getInstance().requestRecordAudioFocus(false);
        w(false, false);
    }

    @Override // org.telegram.ui.Components.r60
    public final void b(float f7, int i10) {
        si.r0 r0Var;
        i2.h0 h0Var;
        if (this.P == null || (r0Var = this.R) == null || r0Var.a != 5) {
            return;
        }
        o();
        if (i10 == 0) {
            this.P.q();
            return;
        }
        if (i10 == 1) {
            si.s0 s0Var = this.P;
            s0Var.getClass();
            si.s0.t();
            if (s0Var.W != 5 || (h0Var = s0Var.S) == null) {
                return;
            }
            h0Var.e();
            s0Var.x(false);
            l2.f fVar = s0Var.d;
            s0Var.S.M0();
            fVar.getClass();
            return;
        }
        if (i10 == 2) {
            si.s0 s0Var2 = this.P;
            long j10 = (long) (f7 * this.R.b);
            s0Var2.getClass();
            si.s0.t();
            if (s0Var2.W != 5 || s0Var2.S == null) {
                return;
            }
            long j11 = s0Var2.G;
            s0Var2.S.Z0(5, Math.max(j11, Math.min(Math.max(j11, s0Var2.H - 1), j10)));
            s0Var2.d.getClass();
        }
    }

    @Override // org.telegram.ui.Components.r60
    public final void c(boolean z10) {
        setRecordingUiFrameClockActive(false);
        q();
        ValueAnimator valueAnimator = this.a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        si.s0 s0Var = this.P;
        if (s0Var != null) {
            si.s0.t();
            int i10 = s0Var.W;
            if (i10 == 10) {
                if (!s0Var.C) {
                    s0Var.i();
                }
            } else if (i10 != 8) {
                s0Var.a();
            } else {
                s0Var.e();
                s0Var.r();
                s0Var.l.M();
                s0Var.C = true;
                s0Var.v(10);
                s0Var.m("released");
                s0Var.i.removeCallbacksAndMessages(null);
                s0Var.j.shutdown();
                s0Var.k.shutdown();
            }
            this.P = null;
        }
        y01 y01Var = this.T;
        if (y01Var != null) {
            y01Var.d(true ^ this.j0);
            this.T = null;
        }
        setScreenFlashEnabled(false);
        MediaController.getInstance().requestRecordAudioFocus(false);
        x();
        j60 j60Var = this.v;
        j60Var.setTranslationX(0.0f);
        this.w0 = 0.0f;
        j60Var.setTranslationY(0.0f + this.v0);
        j60Var.setImageReceiver(null);
        MediaController.getInstance().resumeByRewind();
    }

    @Override // org.telegram.ui.Components.r60
    public final boolean d() {
        si.r0 r0Var = this.R;
        if (r0Var == null) {
            return false;
        }
        int i10 = r0Var.a;
        return i10 == 4 || i10 == 5 || i10 == 6;
    }

    @Override // org.telegram.ui.Components.r60
    public final void e(float f7) {
        float f10 = f7 * 0.5f;
        this.v0 = f10;
        this.v.setTranslationY(this.w0 + f10);
    }

    @Override // org.telegram.ui.Components.r60
    public final void f(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        si.r0 r0Var;
        si.s0 s0Var = this.P;
        if (s0Var == null || (r0Var = this.R) == null) {
            return;
        }
        if (i10 == 3) {
            if (s0Var == null || r0Var == null || r0Var.a != 3) {
                return;
            }
            u(2);
            this.P.p();
            return;
        }
        if (i10 == 1 || i10 == 4) {
            long currentDurationMs = getCurrentDurationMs();
            if (currentDurationMs < 800) {
                NotificationCenter.getInstance(this.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.n), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                a(false);
                return;
            }
            if (this.R.a == 3) {
                u(5);
            } else {
                o();
            }
            this.V = new k60(j10, i11, i12, z10, j11);
            si.s0 s0Var2 = this.P;
            boolean z11 = this.i0;
            boolean z12 = !z11;
            s0Var2.getClass();
            si.s0.t();
            int i13 = s0Var2.W;
            if (i13 == 3 || i13 == 5) {
                s0Var2.m.b("finish requested: state=" + r4.c.w(s0Var2.W) + ", includeAudio=" + z12 + ", durationMs=" + s0Var2.j() + ", trim=" + s0Var2.G + ".." + s0Var2.H);
                s0Var2.z = z12;
                if (s0Var2.W != 3) {
                    s0Var2.r();
                    s0Var2.v(7);
                    s0Var2.j.execute(new ai.wb(s0Var2, s0Var2.Q, s0Var2.l() || z11, s0Var2.R, z12, s0Var2.l() ? 1 : 2, s0Var2.P));
                    return;
                }
                s0Var2.E = s0Var2.j();
                s0Var2.y = true;
                s0Var2.e();
                s0Var2.i.removeCallbacks(s0Var2.T);
                s0Var2.v(7);
                boolean Y = s0Var2.l.Y();
                s0Var2.B = Y;
                if (Y) {
                    return;
                }
                s0Var2.h(new IllegalStateException("Unable to stop the camera segment"));
            }
        }
    }

    @Override // org.telegram.ui.Components.r60
    public final void g(bh.b bVar, org.telegram.ui.dj djVar) {
        LinearLayout linearLayout = this.F;
        dh.d c10 = bVar.c(linearLayout, djVar, false);
        c10.p(AndroidUtilities.dp(6.0f));
        c10.q(AndroidUtilities.dp(21.0f));
        linearLayout.setBackground(c10);
    }

    @Override // org.telegram.ui.Components.r60
    public View getButtonsLayout() {
        return this.F;
    }

    @Override // org.telegram.ui.Components.r60
    public o60 getCameraContainer() {
        return this.v;
    }

    @Override // org.telegram.ui.Components.r60
    public RectF getCameraRect() {
        i60 i60Var = this.y;
        int[] iArr = this.K;
        i60Var.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], i60Var.getWidth() + r3, i60Var.getHeight() + iArr[1]);
    }

    @Override // org.telegram.ui.Components.r60
    public View getMuteImageView() {
        return this.I;
    }

    @Override // org.telegram.ui.Components.r60
    public Paint getPaint() {
        return this.w.getPaint();
    }

    @Override // org.telegram.ui.Components.r60
    public TextureView getTextureView() {
        return this.y;
    }

    @Override // org.telegram.ui.Components.r60
    public final void h(boolean z10) {
        if (this.P != null) {
            return;
        }
        setVisibility(0);
        this.w.getPaint().setAlpha(255);
        this.j0 = false;
        this.i0 = false;
        this.f0 = false;
        this.h0 = false;
        this.u0 = 0L;
        this.w.setProgress(0.0f);
        org.telegram.ui.gl glVar = this.E;
        if (!this.l0) {
            if (this.t0 == null) {
                try {
                    this.t0 = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.t0;
            if (bitmap != null) {
                glVar.setImageBitmap(bitmap);
            } else {
                glVar.setImageResource(R.drawable.icplaceholder);
            }
            this.l0 = true;
            glVar.animate().cancel();
            glVar.setAlpha(1.0f);
            glVar.invalidate();
        }
        this.T = new y01(this.h, this.r);
        this.Q = (si.q0) ti.e.e.a();
        si.j0 j0Var = new si.j0(getContext(), this.y);
        j0Var.c = new File(ApplicationLoader.getFilesDirFixed(), "cache");
        j0Var.d = (si.l0) ti.e.j.a();
        j0Var.e = this.Q;
        j0Var.h = ti.e.h.a();
        j0Var.f = (si.m0) ti.e.f.a();
        j0Var.g = (si.n0) ti.e.g.a();
        ti.a aVar = ti.e.i;
        aVar.a();
        j0Var.i = aVar.d;
        l2.f fVar = this.J0;
        j0Var.j = fVar;
        y01 y01Var = this.T;
        j0Var.k = y01Var;
        j0Var.l = new tv(this, 6);
        if (j0Var.d == null) {
            throw new IllegalStateException("Initial camera is required");
        }
        if (j0Var.e == null) {
            throw new IllegalStateException("Output resolution is required");
        }
        if (j0Var.h <= 0) {
            throw new IllegalStateException("Video bitrate is required");
        }
        if (j0Var.f == null) {
            throw new IllegalStateException("Camera resolution is required");
        }
        if (j0Var.g == null) {
            throw new IllegalStateException("Frame rate is required");
        }
        if (fVar == null) {
            throw new IllegalStateException("Session listener is required");
        }
        if (y01Var == null) {
            throw new IllegalStateException("Output listener is required");
        }
        this.P = new si.s0(j0Var);
        MediaController.getInstance().requestRecordAudioFocus(true);
        si.s0 s0Var = this.P;
        s0Var.getClass();
        si.s0.t();
        if (s0Var.W == 1) {
            try {
                s0Var.m.b("start requested");
                s0Var.c(true);
                s0Var.v(2);
                s0Var.l.X(s0Var.Q, 0L, s0Var.p);
            } catch (Exception e) {
                s0Var.h(e);
            }
        }
        w(true, false);
    }

    @Override // org.telegram.ui.Components.r60
    public final void i() {
        si.r0 r0Var;
        si.s0 s0Var = this.P;
        if (s0Var == null || (r0Var = this.R) == null) {
            return;
        }
        int i10 = r0Var.a;
        if (i10 == 3) {
            if (s0Var == null || r0Var == null || i10 != 3) {
                return;
            }
            u(2);
            this.P.p();
            return;
        }
        if (i10 == 5) {
            this.U = null;
            this.g0 = true;
            this.h0 = false;
            si.s0.t();
            if (s0Var.W != 5 || s0Var.H - s0Var.G >= s0Var.o) {
                return;
            }
            s0Var.M++;
            s0Var.m.b("resume requested: trim=" + s0Var.G + ".." + s0Var.H + ", sourceDurationMs=" + s0Var.E);
            s0Var.r();
            s0Var.v(6);
            s0Var.j.execute(new ei.s1(s0Var, s0Var.l(), s0Var.Q, s0Var.P, s0Var.R));
        }
    }

    public final void o() {
        si.r0 r0Var;
        VideoEditedInfo videoEditedInfo;
        if (this.P == null || (r0Var = this.R) == null || (videoEditedInfo = this.U) == null) {
            return;
        }
        long j10 = r0Var.b;
        long max = Math.max(0L, videoEditedInfo.startTime);
        long j11 = this.U.endTime;
        if (j11 >= 0) {
            j10 = Math.min(j10, j11);
        }
        si.s0 s0Var = this.P;
        s0Var.getClass();
        si.s0.t();
        if (s0Var.W != 5) {
            return;
        }
        long max2 = Math.max(0L, Math.min(s0Var.E, max));
        long max3 = Math.max(max2, Math.min(s0Var.E, j10));
        if (max3 - max2 < Math.min(800L, s0Var.E)) {
            return;
        }
        s0Var.G = max2;
        s0Var.H = max3;
        i2.h0 h0Var = s0Var.S;
        if (h0Var != null) {
            h0Var.Z0(5, max2);
        }
        s0Var.d.getClass();
        s0Var.o();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = ((float) (View.MeasureSpec.getSize(i11) - getPaddingBottom())) > ((float) View.MeasureSpec.getSize(i10)) * 1.3f ? AndroidUtilities.roundPlayingMessageSize : AndroidUtilities.roundMessageSize;
        if (this.E0 != i12) {
            this.E0 = i12;
            j60 j60Var = this.v;
            j60Var.getLayoutParams().width = AndroidUtilities.dp(28.0f) + i12;
            j60Var.getLayoutParams().height = AndroidUtilities.dp(28.0f) + i12;
            ((FrameLayout.LayoutParams) this.I.getLayoutParams()).topMargin = (i12 / 2) - AndroidUtilities.dp(24.0f);
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30);
        ei.s2 s2Var = this.J;
        s2Var.b.measure(makeMeasureSpec, makeMeasureSpec2);
        s2Var.c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return motionEvent.getAction() != 0 || motionEvent.getY() <= ((float) (getMeasuredHeight() - getPaddingBottom()));
    }

    public final Bitmap p(Bitmap bitmap) {
        i60 i60Var = this.y;
        if (i60Var.getWidth() > 0 && i60Var.getHeight() > 0) {
            Matrix matrix = this.L;
            i60Var.getTransform(matrix);
            if (!matrix.isIdentity()) {
                float[] fArr = this.M;
                matrix.getValues(fArr);
                float width = bitmap.getWidth() / i60Var.getWidth();
                float height = bitmap.getHeight() / i60Var.getHeight();
                fArr[1] = (width / height) * fArr[1];
                fArr[2] = fArr[2] * width;
                fArr[3] = (height / width) * fArr[3];
                fArr[5] = fArr[5] * height;
                fArr[6] = fArr[6] / width;
                fArr[7] = fArr[7] / height;
                matrix.setValues(fArr);
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap).drawBitmap(bitmap, matrix, this.N);
                bitmap.recycle();
                return createBitmap;
            }
        }
        return bitmap;
    }

    public final void q() {
        if (this.n0 || this.b0 != null) {
            this.s0++;
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.b0.cancel();
                this.b0 = null;
            }
            FrameLayout frameLayout = this.x;
            frameLayout.animate().cancel();
            frameLayout.animate().setListener(null);
            frameLayout.setRotationY(0.0f);
            this.n0 = false;
            this.o0 = false;
            this.p0 = false;
            this.q0 = false;
            t(false);
        }
    }

    public final VideoEditedInfo r(File file, long j10, x01 x01Var) {
        si.n0 n0Var;
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.startTime = -1L;
        videoEditedInfo.endTime = -1L;
        videoEditedInfo.estimatedDuration = j10;
        videoEditedInfo.estimatedSize = Math.max(1L, x01Var == null ? file.length() : x01Var.a);
        videoEditedInfo.roundVideo = true;
        si.s0 s0Var = this.P;
        videoEditedInfo.framerate = (s0Var == null || (n0Var = s0Var.s) == null) ? 30 : n0Var.a;
        si.q0 q0Var = this.Q;
        int i10 = q0Var == null ? 480 : q0Var.a;
        videoEditedInfo.originalWidth = i10;
        videoEditedInfo.resultWidth = i10;
        videoEditedInfo.originalHeight = i10;
        videoEditedInfo.resultHeight = i10;
        videoEditedInfo.originalPath = file.getAbsolutePath();
        if (x01Var != null) {
            videoEditedInfo.file = x01Var.b;
            videoEditedInfo.encryptedFile = x01Var.c;
            videoEditedInfo.key = x01Var.d;
            videoEditedInfo.iv = x01Var.e;
        }
        return videoEditedInfo;
    }

    public final void s() {
        if (this.B0) {
            this.B0 = false;
            this.z0 = -1;
            this.A0 = -1;
            if (this.P == null) {
                return;
            }
            ValueAnimator valueAnimator = this.a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y0, 0.0f);
            this.a0 = ofFloat;
            ofFloat.setDuration(350L);
            this.a0.addUpdateListener(new g60(this, 1));
            this.a0.start();
        }
    }

    @Override // org.telegram.ui.Components.r60
    public void setInternalPadding(int i10) {
        setPadding(0, 0, 0, i10);
    }

    @Override // org.telegram.ui.Components.r60
    public void setIsMessageTransition(boolean z10) {
        this.v.getClass();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.F.setAlpha(0.0f);
        j60 j60Var = this.v;
        j60Var.setAlpha(0.0f);
        j60Var.setScaleX(0.1f);
        j60Var.setScaleY(0.1f);
        j60Var.setTranslationX(0.0f);
        ImageView imageView = this.I;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        this.w.getPaint().setAlpha(0);
        try {
            Activity activity = (Activity) getContext();
            if (i10 == 0) {
                activity.getWindow().addFlags(128);
            } else {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void t(boolean z10) {
        if (this.m0) {
            this.m0 = false;
            org.telegram.ui.gl glVar = this.E;
            glVar.animate().cancel();
            if (z10) {
                glVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
            } else {
                glVar.setAlpha(0.0f);
            }
        }
    }

    public final void u(int i10) {
        if (this.h0 && i10 == 2) {
            return;
        }
        this.h0 = true;
        NotificationCenter.getInstance(this.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.n), Integer.valueOf(i10));
    }

    public final void v(boolean z10) {
        Bitmap bitmap;
        i60 i60Var = this.y;
        if (i60Var.isAvailable() && (bitmap = i60Var.getBitmap(180, 180)) != null) {
            try {
                if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2) != 0) {
                    bitmap = p(bitmap);
                    Utilities.stackBlurBitmap(bitmap, 15);
                    Bitmap bitmap2 = this.t0;
                    this.t0 = bitmap;
                    if (bitmap2 != null && bitmap2 != bitmap && !bitmap2.isRecycled()) {
                        bitmap2.recycle();
                    }
                    if (z10) {
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg"));
                            try {
                                bitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                                fileOutputStream.close();
                            } finally {
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    if (bitmap != this.t0) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                }
            } finally {
                if (bitmap != this.t0) {
                    bitmap.recycle();
                }
            }
        }
    }

    public final void w(boolean z10, boolean z11) {
        n60 n60Var = this.a;
        if (n60Var != null) {
            ((org.telegram.ui.re) n60Var).b.wc.a(z10, true);
        }
        AnimatorSet animatorSet = this.W;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.W.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z10);
        }
        j60 j60Var = this.v;
        if (z10 && !this.k0) {
            j60Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.w0 = measuredHeight;
            j60Var.setTranslationY(measuredHeight + this.v0);
        }
        this.k0 = z10;
        View view = this.s;
        if (view != null) {
            view.invalidate();
        }
        float dp = (z10 || Math.max(getCurrentDurationMs(), this.u0) <= 300) ? 0.0f : AndroidUtilities.dp(24.0f) - (getMeasuredWidth() * 0.5f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 1.0f : 0.0f, z10 ? 0.0f : 1.0f);
        ofFloat.addUpdateListener(new g60(this, 0));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.W = animatorSet2;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        LinearLayout linearLayout = this.F;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, fArr), ObjectAnimator.ofFloat(j60Var, (Property<j60, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(j60Var, (Property<j60, Float>) View.SCALE_X, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(j60Var, (Property<j60, Float>) View.SCALE_Y, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(j60Var, (Property<j60, Float>) View.TRANSLATION_X, dp), ObjectAnimator.ofFloat(this.I, (Property<ImageView, Float>) property, (this.i0 && z10) ? 1.0f : 0.0f), ofFloat);
        this.W.setDuration(180L);
        this.W.setInterpolator(new DecelerateInterpolator());
        if (z10) {
            setTranslationX(0.0f);
        } else {
            this.W.addListener(new org.telegram.ui.pq(this, 29));
        }
        this.W.start();
    }

    public final void x() {
        if (this.C0) {
            this.C0 = false;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
        }
    }

    public final void y() {
        si.k0 k0Var;
        si.r0 r0Var = this.R;
        boolean z10 = false;
        boolean z11 = (r0Var == null || r0Var.a != 3 || r0Var.e || this.n0) ? false : true;
        this.G.setEnabled(z11);
        if (z11 && (k0Var = this.S) != null && k0Var.b != 1) {
            z10 = true;
        }
        this.H.setEnabled(z10);
        z();
    }

    public final void z() {
        si.r0 r0Var = this.R;
        int i10 = this.O;
        ei.q2 q2Var = this.H;
        if (r0Var == null || !r0Var.f) {
            if (this.d0 == null) {
                uj0 uj0Var = new uj0(R.raw.roundcamera_flash_on, i10, i10);
                this.d0 = uj0Var;
                uj0Var.setCallback(q2Var);
            }
            q2Var.setImageDrawable(this.d0);
            return;
        }
        if (this.e0 == null) {
            uj0 uj0Var2 = new uj0(R.raw.roundcamera_flash_off, i10, i10);
            this.e0 = uj0Var2;
            uj0Var2.setCallback(q2Var);
        }
        q2Var.setImageDrawable(this.e0);
    }
}
