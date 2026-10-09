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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class s60 extends y60 {
    public final n60 A0;
    public boolean B0;
    public boolean C0;
    public float D0;
    public final org.telegram.ui.nl E;
    public int E0;
    public final LinearLayout F;
    public long F0;
    public final ci.u2 G;
    public boolean G0;
    public final ci.u2 H;
    public boolean H0;
    public final ImageView I;
    public final n60 I0;
    public final ci.w2 J;
    public final m2.t J0;
    public final int[] K;
    public final Matrix L;
    public final float[] M;
    public final Paint N;
    public final int O;
    public ki.t0 P;
    public ki.r0 Q;
    public ki.s0 R;
    public ki.l0 S;
    public g11 T;
    public VideoEditedInfo U;
    public r60 V;
    public AnimatorSet W;
    public ValueAnimator a0;
    public final ck0 b0;
    public ck0 c0;
    public ck0 d0;
    public boolean e0;
    public final f60 f;
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
    public long q0;
    public final boolean r;
    public int r0;
    public final View s;
    public Bitmap s0;
    public long t0;
    public float u0;
    public final q60 v;
    public float v0;
    public final cn0 w;
    public float w0;
    public final FrameLayout x;
    public float x0;
    public final p60 y;
    public int y0;
    public int z0;

    /* JADX WARN: Type inference failed for: r3v1, types: [org.telegram.ui.Components.n60] */
    /* JADX WARN: Type inference failed for: r3v3, types: [org.telegram.ui.Components.n60] */
    public s60(Activity activity, f60 f60Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.h = UserConfig.selectedAccount;
        this.K = new int[2];
        this.L = new Matrix();
        this.M = new float[9];
        this.N = new Paint(3);
        this.y0 = -1;
        this.z0 = -1;
        final int i10 = 0;
        this.A0 = new Runnable(this) { // from class: org.telegram.ui.Components.n60
            public final /* synthetic */ s60 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.s();
                        break;
                    default:
                        s60 s60Var = this.b;
                        ki.s0 s0Var = s60Var.R;
                        if (s0Var != null && s0Var.a == 3) {
                            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                            long j3 = s60Var.F0;
                            if (j3 == 0 || elapsedRealtimeNanos - j3 >= 70000000) {
                                s60Var.z();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.D0 = Float.NaN;
        final int i11 = 1;
        this.I0 = new Runnable(this) { // from class: org.telegram.ui.Components.n60
            public final /* synthetic */ s60 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.s();
                        break;
                    default:
                        s60 s60Var = this.b;
                        ki.s0 s0Var = s60Var.R;
                        if (s0Var != null && s0Var.a == 3) {
                            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                            long j3 = s60Var.F0;
                            if (j3 == 0 || elapsedRealtimeNanos - j3 >= 70000000) {
                                s60Var.z();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.J0 = new m2.t(this, 8);
        this.f = f60Var;
        this.n = f60Var.getClassGuid();
        this.r = f60Var.v();
        this.s = f60Var.getFragmentView();
        setWillNotDraw(false);
        ci.w2 w2Var = new ci.w2(activity, null, this, null);
        this.J = w2Var;
        w2Var.o = 0.5f;
        w2Var.n = ci.w2.f(0.5f);
        w2Var.g();
        addView(w2Var.b, w7.x5.e(-1, -1, 119));
        q60 q60Var = new q60(this, activity);
        this.v = q60Var;
        cn0 cn0Var = new cn0(activity);
        this.w = cn0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.x = frameLayout;
        p60 p60Var = new p60(this, activity, 0);
        p60Var.setOpaque(true);
        p60Var.setClickable(true);
        p60Var.setCameraDistance(AndroidUtilities.dp(8000.0f));
        p60Var.setOutlineProvider(new ai.l2(13));
        p60Var.setClipToOutline(true);
        this.y = p60Var;
        frameLayout.addView(p60Var, w7.x5.e(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.nl nlVar = new org.telegram.ui.nl(this, activity, paint);
        this.E = nlVar;
        nlVar.setOutlineProvider(new ai.l2(12));
        nlVar.setClipToOutline(true);
        frameLayout.addView(nlVar, w7.x5.e(-1, -1, 119));
        cn0Var.addView(frameLayout, w7.x5.a(-1.0f, 14.0f, 14.0f, 14.0f, 14.0f, -1, 119));
        q60Var.addView(cn0Var, w7.x5.e(-1, -1, 119));
        int i12 = AndroidUtilities.roundPlayingMessageSize;
        addView(q60Var, new FrameLayout.LayoutParams(i12, i12, 17));
        addView(w2Var.c, w7.x5.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.F = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        addView(linearLayout, w7.x5.a(56.0f, 1.0f, 0.0f, 0.0f, 0.0f, -2, 83));
        ci.u2 u2Var = new ci.u2(activity);
        this.G = u2Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        u2Var.setScaleType(scaleType);
        u2Var.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        linearLayout.addView(u2Var, w7.x5.n(44, 44));
        final int i13 = 0;
        u2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.o60
            public final /* synthetic */ s60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.s0 s0Var;
                ki.l0 l0Var;
                boolean z10;
                ki.s0 s0Var2;
                int i14;
                switch (i13) {
                    case 0:
                        s60 s60Var = this.b;
                        ki.t0 t0Var = s60Var.P;
                        if (t0Var != null && (s0Var = s60Var.R) != null && (l0Var = s60Var.S) != null && s0Var.a == 3 && !s0Var.e && !s60Var.m0) {
                            ki.m0 m0Var = l0Var.a;
                            ki.m0 m0Var2 = ki.m0.a;
                            if (m0Var == m0Var2) {
                                m0Var2 = ki.m0.b;
                            }
                            t0Var.getClass();
                            ki.t0.t();
                            int i15 = t0Var.W;
                            if (i15 != 7 && i15 != 8 && i15 != 9 && i15 != 10) {
                                if (t0Var.p != m0Var2) {
                                    t0Var.m.b("camera facing requested: " + t0Var.p + " -> " + m0Var2 + ", state=" + hg.c.C(t0Var.W));
                                    t0Var.p = m0Var2;
                                    int i16 = t0Var.W;
                                    if (i16 == 3 || i16 == 2) {
                                        t0Var.e();
                                        ki.j jVar = t0Var.l;
                                        jVar.C = m0Var2;
                                        Handler handler = jVar.n;
                                        if (!jVar.S || handler == null) {
                                            z10 = false;
                                        } else {
                                            handler.post(new gg.w1(27, jVar, m0Var2));
                                            z10 = true;
                                        }
                                        t0Var.w = z10;
                                    }
                                    t0Var.n();
                                    t0Var.o();
                                }
                                s60Var.b0.M(0);
                                s60Var.b0.start();
                                break;
                            }
                        }
                        break;
                    default:
                        s60 s60Var2 = this.b;
                        ki.t0 t0Var2 = s60Var2.P;
                        if (t0Var2 != null && (s0Var2 = s60Var2.R) != null && s60Var2.S != null) {
                            boolean z11 = !s0Var2.f;
                            ki.j jVar2 = t0Var2.l;
                            ki.t0.t();
                            if (t0Var2.W == 3 && !t0Var2.w && (i14 = t0Var2.X) != 1) {
                                t0Var2.u = z11;
                                if (i14 == 3) {
                                    t0Var2.u(z11);
                                    jVar2.H(false);
                                } else {
                                    t0Var2.u(false);
                                    jVar2.H(z11);
                                }
                                t0Var2.o();
                                s60Var2.y();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        ci.u2 u2Var2 = new ci.u2(activity);
        this.H = u2Var2;
        u2Var2.setScaleType(scaleType);
        linearLayout.addView(u2Var2, w7.x5.n(44, 44));
        final int i14 = 1;
        u2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.o60
            public final /* synthetic */ s60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.s0 s0Var;
                ki.l0 l0Var;
                boolean z10;
                ki.s0 s0Var2;
                int i142;
                switch (i14) {
                    case 0:
                        s60 s60Var = this.b;
                        ki.t0 t0Var = s60Var.P;
                        if (t0Var != null && (s0Var = s60Var.R) != null && (l0Var = s60Var.S) != null && s0Var.a == 3 && !s0Var.e && !s60Var.m0) {
                            ki.m0 m0Var = l0Var.a;
                            ki.m0 m0Var2 = ki.m0.a;
                            if (m0Var == m0Var2) {
                                m0Var2 = ki.m0.b;
                            }
                            t0Var.getClass();
                            ki.t0.t();
                            int i15 = t0Var.W;
                            if (i15 != 7 && i15 != 8 && i15 != 9 && i15 != 10) {
                                if (t0Var.p != m0Var2) {
                                    t0Var.m.b("camera facing requested: " + t0Var.p + " -> " + m0Var2 + ", state=" + hg.c.C(t0Var.W));
                                    t0Var.p = m0Var2;
                                    int i16 = t0Var.W;
                                    if (i16 == 3 || i16 == 2) {
                                        t0Var.e();
                                        ki.j jVar = t0Var.l;
                                        jVar.C = m0Var2;
                                        Handler handler = jVar.n;
                                        if (!jVar.S || handler == null) {
                                            z10 = false;
                                        } else {
                                            handler.post(new gg.w1(27, jVar, m0Var2));
                                            z10 = true;
                                        }
                                        t0Var.w = z10;
                                    }
                                    t0Var.n();
                                    t0Var.o();
                                }
                                s60Var.b0.M(0);
                                s60Var.b0.start();
                                break;
                            }
                        }
                        break;
                    default:
                        s60 s60Var2 = this.b;
                        ki.t0 t0Var2 = s60Var2.P;
                        if (t0Var2 != null && (s0Var2 = s60Var2.R) != null && s60Var2.S != null) {
                            boolean z11 = !s0Var2.f;
                            ki.j jVar2 = t0Var2.l;
                            ki.t0.t();
                            if (t0Var2.W == 3 && !t0Var2.w && (i142 = t0Var2.X) != 1) {
                                t0Var2.u = z11;
                                if (i142 == 3) {
                                    t0Var2.u(z11);
                                    jVar2.H(false);
                                } else {
                                    t0Var2.u(false);
                                    jVar2.H(z11);
                                }
                                t0Var2.o();
                                s60Var2.y();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        int dp = AndroidUtilities.dp(24.0f);
        this.O = dp;
        ck0 ck0Var = new ck0(R.raw.roundcamera_flip, dp, dp);
        this.b0 = ck0Var;
        ck0Var.setCallback(u2Var);
        ck0Var.M(ck0Var.e[0] - 1);
        u2Var.setImageDrawable(ck0Var);
        y();
        if (e6Var != null && !e6Var.a()) {
            u2Var.setInvert(0.6f);
            u2Var2.setInvert(0.6f);
        }
        ImageView imageView = new ImageView(activity);
        this.I = imageView;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.video_mute);
        imageView.setAlpha(0.0f);
        addView(imageView, w7.x5.e(48, 48, 17));
        p60Var.setOnTouchListener(new wk(this, 2));
        super.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getCameraFlipElapsedMs() {
        if (this.q0 == 0) {
            return 0L;
        }
        return Math.max(0L, SystemClock.elapsedRealtime() - this.q0);
    }

    private long getCurrentDurationMs() {
        ki.s0 s0Var;
        ki.t0 t0Var = this.P;
        if (t0Var == null || (s0Var = this.R) == null) {
            return 0L;
        }
        return s0Var.a == 3 ? t0Var.j() : s0Var.b;
    }

    public static void l(s60 s60Var) {
        org.telegram.ui.nl nlVar = s60Var.E;
        if (s60Var.k0) {
            s60Var.k0 = false;
            nlVar.invalidate();
            nlVar.animate().cancel();
            nlVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecordingUiFrameClockActive(boolean z10) {
        org.telegram.ui.ok okVar;
        if (z10 == this.G0) {
            return;
        }
        this.G0 = z10;
        this.F0 = 0L;
        n60 n60Var = this.I0;
        if (z10) {
            yf.h.d().a(30, n60Var);
        } else {
            yf.h.d().f(n60Var);
        }
        if (this.d == z10) {
            return;
        }
        this.d = z10;
        w60 w60Var = this.c;
        if (w60Var == null || (okVar = ((org.telegram.ui.sj) w60Var).a.Y) == null) {
            return;
        }
        okVar.setRoundVideoUiFrameClockActive(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenFlashEnabled(boolean z10) {
        Activity parentActivity = this.f.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        ci.w2 w2Var = this.J;
        if (z10) {
            if (Float.isNaN(this.D0)) {
                this.D0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            w2Var.c(null);
        } else {
            if (!Float.isNaN(this.D0)) {
                attributes.screenBrightness = this.D0;
                this.D0 = Float.NaN;
            }
            w2Var.d();
        }
        parentActivity.getWindow().setAttributes(attributes);
    }

    @Override // org.telegram.ui.Components.y60
    public final void a(boolean z10) {
        if (this.P == null) {
            return;
        }
        t(z10 ? 0 : 6);
        this.P.a();
        g11 g11Var = this.T;
        if (g11Var != null) {
            g11Var.d(true);
        }
        this.T = null;
        MediaController.getInstance().requestRecordAudioFocus(false);
        v(false, false);
    }

    @Override // org.telegram.ui.Components.y60
    public final void b(float f7, int i10) {
        ki.s0 s0Var;
        i2.f0 f0Var;
        if (this.P == null || (s0Var = this.R) == null || s0Var.a != 5) {
            return;
        }
        n();
        if (i10 == 0) {
            this.P.q();
            return;
        }
        if (i10 == 1) {
            ki.t0 t0Var = this.P;
            t0Var.getClass();
            ki.t0.t();
            if (t0Var.W != 5 || (f0Var = t0Var.S) == null) {
                return;
            }
            f0Var.e();
            t0Var.x(false);
            m2.t tVar = t0Var.d;
            t0Var.S.J0();
            tVar.getClass();
            return;
        }
        if (i10 == 2) {
            ki.t0 t0Var2 = this.P;
            long j3 = (long) (f7 * this.R.b);
            t0Var2.getClass();
            ki.t0.t();
            if (t0Var2.W != 5 || t0Var2.S == null) {
                return;
            }
            long j10 = t0Var2.G;
            t0Var2.S.W0(5, Math.max(j10, Math.min(Math.max(j10, t0Var2.H - 1), j3)));
            t0Var2.d.getClass();
        }
    }

    @Override // org.telegram.ui.Components.y60
    public final void c(boolean z10) {
        setRecordingUiFrameClockActive(false);
        p();
        ValueAnimator valueAnimator = this.a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ki.t0 t0Var = this.P;
        if (t0Var != null) {
            ki.t0.t();
            int i10 = t0Var.W;
            if (i10 == 10) {
                if (!t0Var.C) {
                    t0Var.i();
                }
            } else if (i10 != 8) {
                t0Var.a();
            } else {
                t0Var.e();
                t0Var.r();
                t0Var.l.B();
                t0Var.C = true;
                t0Var.v(10);
                t0Var.m("released");
                t0Var.i.removeCallbacksAndMessages(null);
                t0Var.j.shutdown();
                t0Var.k.shutdown();
            }
            this.P = null;
        }
        g11 g11Var = this.T;
        if (g11Var != null) {
            g11Var.d(true ^ this.i0);
            this.T = null;
        }
        setScreenFlashEnabled(false);
        MediaController.getInstance().requestRecordAudioFocus(false);
        w();
        q60 q60Var = this.v;
        q60Var.setTranslationX(0.0f);
        this.v0 = 0.0f;
        q60Var.setTranslationY(0.0f + this.u0);
        q60Var.setImageReceiver(null);
        MediaController.getInstance().resumeByRewind();
    }

    @Override // org.telegram.ui.Components.y60
    public final boolean d() {
        ki.s0 s0Var = this.R;
        if (s0Var == null) {
            return false;
        }
        int i10 = s0Var.a;
        return i10 == 4 || i10 == 5 || i10 == 6;
    }

    @Override // org.telegram.ui.Components.y60
    public final void e(float f7) {
        float f10 = f7 * 0.5f;
        this.u0 = f10;
        this.v.setTranslationY(this.v0 + f10);
    }

    @Override // org.telegram.ui.Components.y60
    public final void f(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        ki.s0 s0Var;
        ki.t0 t0Var = this.P;
        if (t0Var == null || (s0Var = this.R) == null) {
            return;
        }
        if (i10 == 3) {
            if (t0Var == null || s0Var == null || s0Var.a != 3) {
                return;
            }
            t(2);
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
                t(5);
            } else {
                n();
            }
            this.V = new r60(j3, i11, i12, z10, j10);
            ki.t0 t0Var2 = this.P;
            boolean z11 = this.h0;
            boolean z12 = !z11;
            t0Var2.getClass();
            ki.t0.t();
            int i13 = t0Var2.W;
            if (i13 == 3 || i13 == 5) {
                t0Var2.m.b("finish requested: state=" + hg.c.C(t0Var2.W) + ", includeAudio=" + z12 + ", durationMs=" + t0Var2.j() + ", trim=" + t0Var2.G + ".." + t0Var2.H);
                t0Var2.z = z12;
                if (t0Var2.W != 3) {
                    t0Var2.r();
                    t0Var2.v(7);
                    t0Var2.j.execute(new ki.h0(t0Var2, t0Var2.Q, t0Var2.l() || z11, t0Var2.R, z12, t0Var2.l() ? 1 : 2, t0Var2.P));
                    return;
                }
                t0Var2.E = t0Var2.j();
                t0Var2.y = true;
                t0Var2.e();
                t0Var2.i.removeCallbacks(t0Var2.T);
                t0Var2.v(7);
                boolean M = t0Var2.l.M();
                t0Var2.B = M;
                if (M) {
                    return;
                }
                t0Var2.h(new IllegalStateException("Unable to stop the camera segment"));
            }
        }
    }

    @Override // org.telegram.ui.Components.y60
    public final void g(ah.c cVar, org.telegram.ui.kj kjVar) {
        LinearLayout linearLayout = this.F;
        ch.d c10 = cVar.c(linearLayout, kjVar, false);
        c10.p(AndroidUtilities.dp(6.0f));
        c10.q(AndroidUtilities.dp(21.0f));
        linearLayout.setBackground(c10);
    }

    @Override // org.telegram.ui.Components.y60
    public View getButtonsLayout() {
        return this.F;
    }

    @Override // org.telegram.ui.Components.y60
    public v60 getCameraContainer() {
        return this.v;
    }

    @Override // org.telegram.ui.Components.y60
    public RectF getCameraRect() {
        p60 p60Var = this.y;
        int[] iArr = this.K;
        p60Var.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], p60Var.getWidth() + r3, p60Var.getHeight() + iArr[1]);
    }

    @Override // org.telegram.ui.Components.y60
    public View getMuteImageView() {
        return this.I;
    }

    @Override // org.telegram.ui.Components.y60
    public Paint getPaint() {
        return this.w.getPaint();
    }

    @Override // org.telegram.ui.Components.y60
    public TextureView getTextureView() {
        return this.y;
    }

    @Override // org.telegram.ui.Components.y60
    public final void h(boolean z10) {
        if (this.P != null) {
            return;
        }
        setVisibility(0);
        this.w.getPaint().setAlpha(255);
        this.i0 = false;
        this.h0 = false;
        this.e0 = false;
        this.g0 = false;
        this.t0 = 0L;
        this.w.setProgress(0.0f);
        org.telegram.ui.nl nlVar = this.E;
        if (!this.k0) {
            if (this.s0 == null) {
                try {
                    this.s0 = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.s0;
            if (bitmap != null) {
                nlVar.setImageBitmap(bitmap);
            } else {
                nlVar.setImageResource(R.drawable.icplaceholder);
            }
            this.k0 = true;
            nlVar.animate().cancel();
            nlVar.setAlpha(1.0f);
            nlVar.invalidate();
        }
        this.T = new g11(this.h, this.r);
        this.Q = (ki.r0) pi.e.c.a();
        ki.k0 k0Var = new ki.k0(getContext(), this.y);
        k0Var.c = new File(ApplicationLoader.getFilesDirFixed(), "cache");
        k0Var.d = (ki.m0) pi.e.h.a();
        k0Var.e = this.Q;
        k0Var.h = pi.e.f.a();
        k0Var.f = (ki.n0) pi.e.d.a();
        k0Var.g = (ki.o0) pi.e.e.a();
        pi.a aVar = pi.e.g;
        aVar.a();
        k0Var.i = aVar.d;
        m2.t tVar = this.J0;
        k0Var.j = tVar;
        g11 g11Var = this.T;
        k0Var.k = g11Var;
        k0Var.l = new bw(this, 6);
        if (k0Var.d == null) {
            throw new IllegalStateException("Initial camera is required");
        }
        if (k0Var.e == null) {
            throw new IllegalStateException("Output resolution is required");
        }
        if (k0Var.h <= 0) {
            throw new IllegalStateException("Video bitrate is required");
        }
        if (k0Var.f == null) {
            throw new IllegalStateException("Camera resolution is required");
        }
        if (k0Var.g == null) {
            throw new IllegalStateException("Frame rate is required");
        }
        if (tVar == null) {
            throw new IllegalStateException("Session listener is required");
        }
        if (g11Var == null) {
            throw new IllegalStateException("Output listener is required");
        }
        this.P = new ki.t0(k0Var);
        MediaController.getInstance().requestRecordAudioFocus(true);
        ki.t0 t0Var = this.P;
        t0Var.getClass();
        ki.t0.t();
        if (t0Var.W == 1) {
            try {
                t0Var.m.b("start requested");
                t0Var.c(true);
                t0Var.v(2);
                t0Var.l.L(t0Var.Q, 0L, t0Var.p);
            } catch (Exception e7) {
                t0Var.h(e7);
            }
        }
        v(true, false);
    }

    @Override // org.telegram.ui.Components.y60
    public final void i() {
        ki.s0 s0Var;
        ki.t0 t0Var = this.P;
        if (t0Var == null || (s0Var = this.R) == null) {
            return;
        }
        int i10 = s0Var.a;
        if (i10 == 3) {
            if (t0Var == null || s0Var == null || i10 != 3) {
                return;
            }
            t(2);
            this.P.p();
            return;
        }
        if (i10 == 5) {
            this.U = null;
            this.f0 = true;
            this.g0 = false;
            ki.t0.t();
            if (t0Var.W != 5 || t0Var.H - t0Var.G >= t0Var.o) {
                return;
            }
            t0Var.M++;
            t0Var.m.b("resume requested: trim=" + t0Var.G + ".." + t0Var.H + ", sourceDurationMs=" + t0Var.E);
            t0Var.r();
            t0Var.v(6);
            t0Var.j.execute(new ci.t1(t0Var, t0Var.l(), t0Var.Q, t0Var.P, t0Var.R));
        }
    }

    public final void n() {
        ki.s0 s0Var;
        VideoEditedInfo videoEditedInfo;
        if (this.P == null || (s0Var = this.R) == null || (videoEditedInfo = this.U) == null) {
            return;
        }
        long j3 = s0Var.b;
        long max = Math.max(0L, videoEditedInfo.startTime);
        long j10 = this.U.endTime;
        if (j10 >= 0) {
            j3 = Math.min(j3, j10);
        }
        ki.t0 t0Var = this.P;
        t0Var.getClass();
        ki.t0.t();
        if (t0Var.W != 5) {
            return;
        }
        long max2 = Math.max(0L, Math.min(t0Var.E, max));
        long max3 = Math.max(max2, Math.min(t0Var.E, j3));
        if (max3 - max2 < Math.min(800L, t0Var.E)) {
            return;
        }
        t0Var.G = max2;
        t0Var.H = max3;
        i2.f0 f0Var = t0Var.S;
        if (f0Var != null) {
            f0Var.W0(5, max2);
        }
        t0Var.d.getClass();
        t0Var.o();
    }

    public final Bitmap o(Bitmap bitmap) {
        p60 p60Var = this.y;
        if (p60Var.getWidth() > 0 && p60Var.getHeight() > 0) {
            Matrix matrix = this.L;
            p60Var.getTransform(matrix);
            if (!matrix.isIdentity()) {
                float[] fArr = this.M;
                matrix.getValues(fArr);
                float width = bitmap.getWidth() / p60Var.getWidth();
                float height = bitmap.getHeight() / p60Var.getHeight();
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
            q60 q60Var = this.v;
            q60Var.getLayoutParams().width = AndroidUtilities.dp(28.0f) + i12;
            q60Var.getLayoutParams().height = AndroidUtilities.dp(28.0f) + i12;
            ((FrameLayout.LayoutParams) this.I.getLayoutParams()).topMargin = (i12 / 2) - AndroidUtilities.dp(24.0f);
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30);
        ci.w2 w2Var = this.J;
        w2Var.b.measure(makeMeasureSpec, makeMeasureSpec2);
        w2Var.c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return motionEvent.getAction() != 0 || motionEvent.getY() <= ((float) (getMeasuredHeight() - getPaddingBottom()));
    }

    public final void p() {
        if (this.m0 || this.p0) {
            this.r0++;
            removeCallbacks(this.A0);
            FrameLayout frameLayout = this.x;
            frameLayout.animate().cancel();
            frameLayout.animate().setListener(null);
            frameLayout.setRotationY(0.0f);
            this.m0 = false;
            this.n0 = false;
            this.o0 = false;
            this.p0 = false;
            if (this.l0) {
                this.l0 = false;
                org.telegram.ui.nl nlVar = this.E;
                nlVar.animate().cancel();
                nlVar.setAlpha(0.0f);
            }
        }
    }

    public final VideoEditedInfo q(File file, long j3, f11 f11Var) {
        ki.o0 o0Var;
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.startTime = -1L;
        videoEditedInfo.endTime = -1L;
        videoEditedInfo.estimatedDuration = j3;
        videoEditedInfo.estimatedSize = Math.max(1L, f11Var == null ? file.length() : f11Var.a);
        videoEditedInfo.roundVideo = true;
        ki.t0 t0Var = this.P;
        videoEditedInfo.framerate = (t0Var == null || (o0Var = t0Var.s) == null) ? 30 : o0Var.a;
        ki.r0 r0Var = this.Q;
        int i10 = r0Var == null ? 480 : r0Var.a;
        videoEditedInfo.originalWidth = i10;
        videoEditedInfo.resultWidth = i10;
        videoEditedInfo.originalHeight = i10;
        videoEditedInfo.resultHeight = i10;
        videoEditedInfo.originalPath = file.getAbsolutePath();
        if (f11Var != null) {
            videoEditedInfo.file = f11Var.b;
            videoEditedInfo.encryptedFile = f11Var.c;
            videoEditedInfo.key = f11Var.d;
            videoEditedInfo.iv = f11Var.e;
        }
        return videoEditedInfo;
    }

    public final void r() {
        if (this.B0) {
            this.B0 = false;
            this.y0 = -1;
            this.z0 = -1;
            if (this.P == null) {
                return;
            }
            ValueAnimator valueAnimator = this.a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x0, 0.0f);
            this.a0 = ofFloat;
            ofFloat.setDuration(350L);
            this.a0.addUpdateListener(new m60(this, 1));
            this.a0.start();
        }
    }

    public final void s() {
        if (this.m0 && !this.p0 && this.n0 && this.o0) {
            long cameraFlipElapsedMs = getCameraFlipElapsedMs();
            long j3 = 120 - cameraFlipElapsedMs;
            n60 n60Var = this.A0;
            if (j3 > 0) {
                removeCallbacks(n60Var);
                postDelayed(n60Var, j3);
                return;
            }
            this.p0 = true;
            removeCallbacks(n60Var);
            if (this.l0) {
                this.l0 = false;
                org.telegram.ui.nl nlVar = this.E;
                nlVar.animate().cancel();
                nlVar.setAlpha(0.0f);
            }
            FrameLayout frameLayout = this.x;
            frameLayout.animate().cancel();
            frameLayout.setRotationY(-90.0f);
            long max = Math.max(300L, 580 - cameraFlipElapsedMs);
            int i10 = this.r0;
            StringBuilder u10 = a1.g.u(cameraFlipElapsedMs, "RoundVideo camera flip reveal started: elapsedMs=", ", durationMs=");
            u10.append(max);
            FileLog.d(u10.toString());
            frameLayout.animate().rotationY(0.0f).setDuration(max).setInterpolator(hs.h).setListener(new ei.v2(this, i10, 8)).start();
        }
    }

    @Override // org.telegram.ui.Components.y60
    public void setInternalPadding(int i10) {
        setPadding(0, 0, 0, i10);
    }

    @Override // org.telegram.ui.Components.y60
    public void setIsMessageTransition(boolean z10) {
        this.v.getClass();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.F.setAlpha(0.0f);
        q60 q60Var = this.v;
        q60Var.setAlpha(0.0f);
        q60Var.setScaleX(0.1f);
        q60Var.setScaleY(0.1f);
        q60Var.setTranslationX(0.0f);
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
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void t(int i10) {
        if (this.g0 && i10 == 2) {
            return;
        }
        this.g0 = true;
        NotificationCenter.getInstance(this.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.n), Integer.valueOf(i10));
    }

    public final void u(boolean z10) {
        Bitmap bitmap;
        p60 p60Var = this.y;
        if (p60Var.isAvailable() && (bitmap = p60Var.getBitmap(180, 180)) != null) {
            try {
                if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2) != 0) {
                    bitmap = o(bitmap);
                    Utilities.stackBlurBitmap(bitmap, 15);
                    Bitmap bitmap2 = this.s0;
                    this.s0 = bitmap;
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
                    if (bitmap != this.s0) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                }
            } finally {
                if (bitmap != this.s0) {
                    bitmap.recycle();
                }
            }
        }
    }

    public final void v(boolean z10, boolean z11) {
        u60 u60Var = this.a;
        if (u60Var != null) {
            ((org.telegram.ui.re) u60Var).b.vc.a(z10, true);
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
        q60 q60Var = this.v;
        if (z10 && !this.j0) {
            q60Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.v0 = measuredHeight;
            q60Var.setTranslationY(measuredHeight + this.u0);
        }
        this.j0 = z10;
        View view = this.s;
        if (view != null) {
            view.invalidate();
        }
        float dp = (z10 || Math.max(getCurrentDurationMs(), this.t0) <= 300) ? 0.0f : AndroidUtilities.dp(24.0f) - (getMeasuredWidth() * 0.5f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 1.0f : 0.0f, z10 ? 0.0f : 1.0f);
        ofFloat.addUpdateListener(new m60(this, 0));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.W = animatorSet2;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        LinearLayout linearLayout = this.F;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, fArr), ObjectAnimator.ofFloat(q60Var, (Property<q60, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(q60Var, (Property<q60, Float>) View.SCALE_X, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(q60Var, (Property<q60, Float>) View.SCALE_Y, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(q60Var, (Property<q60, Float>) View.TRANSLATION_X, dp), ObjectAnimator.ofFloat(this.I, (Property<ImageView, Float>) property, (this.h0 && z10) ? 1.0f : 0.0f), ofFloat);
        this.W.setDuration(180L);
        this.W.setInterpolator(new DecelerateInterpolator());
        if (z10) {
            setTranslationX(0.0f);
        } else {
            this.W.addListener(new t8(this, 24));
        }
        this.W.start();
    }

    public final void w() {
        if (this.C0) {
            this.C0 = false;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
        }
    }

    public final void x() {
        ki.l0 l0Var;
        ki.s0 s0Var = this.R;
        boolean z10 = false;
        boolean z11 = (s0Var == null || s0Var.a != 3 || s0Var.e || this.m0) ? false : true;
        this.G.setEnabled(z11);
        if (z11 && (l0Var = this.S) != null && l0Var.b != 1) {
            z10 = true;
        }
        this.H.setEnabled(z10);
        y();
    }

    public final void y() {
        ki.s0 s0Var = this.R;
        int i10 = this.O;
        ci.u2 u2Var = this.H;
        if (s0Var == null || !s0Var.f) {
            if (this.c0 == null) {
                ck0 ck0Var = new ck0(R.raw.roundcamera_flash_on, i10, i10);
                this.c0 = ck0Var;
                ck0Var.setCallback(u2Var);
            }
            u2Var.setImageDrawable(this.c0);
            return;
        }
        if (this.d0 == null) {
            ck0 ck0Var2 = new ck0(R.raw.roundcamera_flash_off, i10, i10);
            this.d0 = ck0Var2;
            ck0Var2.setCallback(u2Var);
        }
        u2Var.setImageDrawable(this.d0);
    }

    public final void z() {
        org.telegram.ui.ok okVar;
        ki.s0 s0Var = this.R;
        if (s0Var != null) {
            long j3 = s0Var.d;
            if (s0Var.a != 3) {
                return;
            }
            long min = Math.min(j3, (SystemClock.elapsedRealtime() + s0Var.b) - s0Var.c);
            this.t0 = min;
            this.w.setProgress(min / j3);
            w60 w60Var = this.c;
            if (w60Var == null || (okVar = ((org.telegram.ui.sj) w60Var).a.Y) == null || !okVar.j1) {
                return;
            }
            okVar.i1 = min;
            zg zgVar = okVar.Y0;
            if (zgVar != null && zgVar.r) {
                zgVar.h = min;
                zgVar.invalidate();
            }
            wg wgVar = okVar.l1;
            if (wgVar != null && wgVar.n) {
                if (!wgVar.h) {
                    long j10 = wgVar.r;
                    if (j10 >= 0) {
                        if (!wgVar.e) {
                            long max = Math.max(0L, min - j10) % 1200;
                            wgVar.a = max < 600 ? 1.0f - (max / 600.0f) : (max - 600) / 600.0f;
                        }
                        wgVar.invalidate();
                    }
                }
                wgVar.r = min;
                wgVar.a = 1.0f;
                wgVar.invalidate();
            }
            ChatActivityEnterView.SlideTextView slideTextView = okVar.k1;
            if (slideTextView == null || !slideTextView.J || slideTextView.n == 1.0f) {
                return;
            }
            slideTextView.invalidate();
        }
    }
}
