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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class m60 extends s60 {
    public int A0;
    public boolean B0;
    public boolean C0;
    public float D0;
    public final org.telegram.ui.fl E;
    public int E0;
    public final LinearLayout F;
    public long F0;
    public final ei.q2 G;
    public boolean G0;
    public final ei.q2 H;
    public boolean H0;
    public final ImageView I;
    public final zp I0;
    public final ei.s2 J;
    public final l2.f J0;
    public final int[] K;
    public final Matrix L;
    public final float[] M;
    public final Paint N;
    public final int O;
    public si.u0 P;
    public si.s0 Q;
    public si.t0 R;
    public si.l0 S;
    public d11 T;
    public VideoEditedInfo U;
    public l60 V;
    public AnimatorSet W;
    public ValueAnimator a0;
    public ValueAnimator b0;
    public final yj0 c0;
    public yj0 d0;
    public yj0 e0;
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
    public final k60 v;
    public float v0;
    public final ym0 w;
    public float w0;
    public final FrameLayout x;
    public float x0;
    public final j60 y;
    public float y0;
    public int z0;

    public m60(Activity activity, y50 y50Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        this.h = UserConfig.selectedAccount;
        this.K = new int[2];
        this.L = new Matrix();
        this.M = new float[9];
        this.N = new Paint(3);
        this.z0 = -1;
        this.A0 = -1;
        this.D0 = Float.NaN;
        this.I0 = new zp(this, 26);
        this.J0 = new l2.f(this, 10);
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
        k60 k60Var = new k60(this, activity);
        this.v = k60Var;
        ym0 ym0Var = new ym0(activity);
        this.w = ym0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.x = frameLayout;
        j60 j60Var = new j60(this, activity, 0);
        j60Var.setOpaque(true);
        j60Var.setClickable(true);
        j60Var.setCameraDistance(AndroidUtilities.dp(8000.0f));
        j60Var.setOutlineProvider(new ci.n1(13));
        j60Var.setClipToOutline(true);
        this.y = j60Var;
        frameLayout.addView(j60Var, w7.z5.e(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.fl flVar = new org.telegram.ui.fl(this, activity, paint);
        this.E = flVar;
        flVar.setOutlineProvider(new ci.n1(12));
        flVar.setClipToOutline(true);
        frameLayout.addView(flVar, w7.z5.e(-1, -1, 119));
        ym0Var.addView(frameLayout, w7.z5.d(-1, -1.0f, 119, 14.0f, 14.0f, 14.0f, 14.0f));
        k60Var.addView(ym0Var, w7.z5.e(-1, -1, 119));
        int i10 = AndroidUtilities.roundPlayingMessageSize;
        addView(k60Var, new FrameLayout.LayoutParams(i10, i10, 17));
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
            public final /* synthetic */ m60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                si.t0 t0Var;
                si.l0 l0Var;
                boolean z10;
                si.t0 t0Var2;
                int i12;
                switch (i11) {
                    case 0:
                        m60 m60Var = this.b;
                        si.u0 u0Var = m60Var.P;
                        if (u0Var != null && (t0Var = m60Var.R) != null && (l0Var = m60Var.S) != null && t0Var.a == 3 && !t0Var.e && !m60Var.n0) {
                            si.m0 m0Var = l0Var.a;
                            si.m0 m0Var2 = si.m0.a;
                            if (m0Var == m0Var2) {
                                m0Var2 = si.m0.b;
                            }
                            u0Var.getClass();
                            si.u0.t();
                            int i13 = u0Var.W;
                            if (i13 != 7 && i13 != 8 && i13 != 9 && i13 != 10) {
                                if (u0Var.p != m0Var2) {
                                    u0Var.m.b("camera facing requested: " + u0Var.p + " -> " + m0Var2 + ", state=" + si.o0.w(u0Var.W));
                                    u0Var.p = m0Var2;
                                    int i14 = u0Var.W;
                                    if (i14 == 3 || i14 == 2) {
                                        u0Var.e();
                                        si.j jVar = u0Var.l;
                                        jVar.F = m0Var2;
                                        Handler handler = jVar.n;
                                        if (!jVar.V || handler == null) {
                                            z10 = false;
                                        } else {
                                            handler.post(new p2.b(23, jVar, m0Var2));
                                            z10 = true;
                                        }
                                        u0Var.w = z10;
                                    }
                                    u0Var.n();
                                    u0Var.o();
                                }
                                m60Var.c0.M(0);
                                m60Var.c0.start();
                                break;
                            }
                        }
                        break;
                    default:
                        m60 m60Var2 = this.b;
                        si.u0 u0Var2 = m60Var2.P;
                        if (u0Var2 != null && (t0Var2 = m60Var2.R) != null && m60Var2.S != null) {
                            boolean z11 = !t0Var2.f;
                            si.j jVar2 = u0Var2.l;
                            si.u0.t();
                            if (u0Var2.W == 3 && !u0Var2.w && (i12 = u0Var2.X) != 1) {
                                u0Var2.u = z11;
                                if (i12 == 3) {
                                    u0Var2.u(z11);
                                    jVar2.T(false);
                                } else {
                                    u0Var2.u(false);
                                    jVar2.T(z11);
                                }
                                u0Var2.o();
                                m60Var2.z();
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
            public final /* synthetic */ m60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                si.t0 t0Var;
                si.l0 l0Var;
                boolean z10;
                si.t0 t0Var2;
                int i122;
                switch (i12) {
                    case 0:
                        m60 m60Var = this.b;
                        si.u0 u0Var = m60Var.P;
                        if (u0Var != null && (t0Var = m60Var.R) != null && (l0Var = m60Var.S) != null && t0Var.a == 3 && !t0Var.e && !m60Var.n0) {
                            si.m0 m0Var = l0Var.a;
                            si.m0 m0Var2 = si.m0.a;
                            if (m0Var == m0Var2) {
                                m0Var2 = si.m0.b;
                            }
                            u0Var.getClass();
                            si.u0.t();
                            int i13 = u0Var.W;
                            if (i13 != 7 && i13 != 8 && i13 != 9 && i13 != 10) {
                                if (u0Var.p != m0Var2) {
                                    u0Var.m.b("camera facing requested: " + u0Var.p + " -> " + m0Var2 + ", state=" + si.o0.w(u0Var.W));
                                    u0Var.p = m0Var2;
                                    int i14 = u0Var.W;
                                    if (i14 == 3 || i14 == 2) {
                                        u0Var.e();
                                        si.j jVar = u0Var.l;
                                        jVar.F = m0Var2;
                                        Handler handler = jVar.n;
                                        if (!jVar.V || handler == null) {
                                            z10 = false;
                                        } else {
                                            handler.post(new p2.b(23, jVar, m0Var2));
                                            z10 = true;
                                        }
                                        u0Var.w = z10;
                                    }
                                    u0Var.n();
                                    u0Var.o();
                                }
                                m60Var.c0.M(0);
                                m60Var.c0.start();
                                break;
                            }
                        }
                        break;
                    default:
                        m60 m60Var2 = this.b;
                        si.u0 u0Var2 = m60Var2.P;
                        if (u0Var2 != null && (t0Var2 = m60Var2.R) != null && m60Var2.S != null) {
                            boolean z11 = !t0Var2.f;
                            si.j jVar2 = u0Var2.l;
                            si.u0.t();
                            if (u0Var2.W == 3 && !u0Var2.w && (i122 = u0Var2.X) != 1) {
                                u0Var2.u = z11;
                                if (i122 == 3) {
                                    u0Var2.u(z11);
                                    jVar2.T(false);
                                } else {
                                    u0Var2.u(false);
                                    jVar2.T(z11);
                                }
                                u0Var2.o();
                                m60Var2.z();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        int dp = AndroidUtilities.dp(24.0f);
        this.O = dp;
        yj0 yj0Var = new yj0(R.raw.roundcamera_flip, dp, dp);
        this.c0 = yj0Var;
        yj0Var.setCallback(q2Var);
        yj0Var.M(yj0Var.e[0] - 1);
        q2Var.setImageDrawable(yj0Var);
        z();
        if (g6Var != null && !g6Var.a()) {
            q2Var.setInvert(0.6f);
            q2Var2.setInvert(0.6f);
        }
        ImageView imageView = new ImageView(activity);
        this.I = imageView;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.video_mute);
        imageView.setAlpha(0.0f);
        addView(imageView, w7.z5.e(48, 48, 17));
        j60Var.setOnTouchListener(new rk(this, 2));
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
        si.t0 t0Var;
        si.u0 u0Var = this.P;
        if (u0Var == null || (t0Var = this.R) == null) {
            return 0L;
        }
        return t0Var.a == 3 ? u0Var.j() : t0Var.b;
    }

    public static void l(m60 m60Var) {
        if (m60Var.n0 && m60Var.q0 && m60Var.o0 && m60Var.p0) {
            m60Var.n0 = false;
            FileLog.d("RoundVideo camera flip completed: elapsedMs=" + m60Var.getCameraFlipElapsedMs());
            m60Var.y();
        }
    }

    public static void m(m60 m60Var) {
        org.telegram.ui.fl flVar = m60Var.E;
        if (m60Var.l0) {
            m60Var.l0 = false;
            flVar.invalidate();
            flVar.animate().cancel();
            flVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecordingUiFrameClockActive(boolean z10) {
        org.telegram.ui.gk gkVar;
        if (z10 == this.G0) {
            return;
        }
        this.G0 = z10;
        this.F0 = 0L;
        zp zpVar = this.I0;
        if (z10) {
            zf.h.d().a(30, zpVar);
        } else {
            zf.h.d().f(zpVar);
        }
        if (this.d == z10) {
            return;
        }
        this.d = z10;
        q60 q60Var = this.c;
        if (q60Var == null || (gkVar = ((org.telegram.ui.jj) q60Var).a.Y) == null) {
            return;
        }
        gkVar.setRoundVideoUiFrameClockActive(z10);
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
        org.telegram.ui.gk gkVar;
        si.t0 t0Var = this.R;
        if (t0Var != null) {
            long j10 = t0Var.d;
            if (t0Var.a != 3) {
                return;
            }
            long min = Math.min(j10, (SystemClock.elapsedRealtime() + t0Var.b) - t0Var.c);
            this.u0 = min;
            this.w.setProgress(min / j10);
            q60 q60Var = this.c;
            if (q60Var == null || (gkVar = ((org.telegram.ui.jj) q60Var).a.Y) == null || !gkVar.j1) {
                return;
            }
            gkVar.i1 = min;
            xg xgVar = gkVar.Y0;
            if (xgVar != null && xgVar.r) {
                xgVar.h = min;
                xgVar.invalidate();
            }
            ug ugVar = gkVar.l1;
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
            ChatActivityEnterView.SlideTextView slideTextView = gkVar.k1;
            if (slideTextView == null || !slideTextView.J || slideTextView.n == 1.0f) {
                return;
            }
            slideTextView.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.s60
    public final void a(boolean z10) {
        if (this.P == null) {
            return;
        }
        u(z10 ? 0 : 6);
        this.P.a();
        d11 d11Var = this.T;
        if (d11Var != null) {
            d11Var.d(true);
        }
        this.T = null;
        MediaController.getInstance().requestRecordAudioFocus(false);
        w(false, false);
    }

    @Override // org.telegram.ui.Components.s60
    public final void b(float f7, int i10) {
        si.t0 t0Var;
        i2.h0 h0Var;
        if (this.P == null || (t0Var = this.R) == null || t0Var.a != 5) {
            return;
        }
        o();
        if (i10 == 0) {
            this.P.q();
            return;
        }
        if (i10 == 1) {
            si.u0 u0Var = this.P;
            u0Var.getClass();
            si.u0.t();
            if (u0Var.W != 5 || (h0Var = u0Var.S) == null) {
                return;
            }
            h0Var.e();
            u0Var.x(false);
            l2.f fVar = u0Var.d;
            u0Var.S.M0();
            fVar.getClass();
            return;
        }
        if (i10 == 2) {
            si.u0 u0Var2 = this.P;
            long j10 = (long) (f7 * this.R.b);
            u0Var2.getClass();
            si.u0.t();
            if (u0Var2.W != 5 || u0Var2.S == null) {
                return;
            }
            long j11 = u0Var2.G;
            u0Var2.S.Z0(5, Math.max(j11, Math.min(Math.max(j11, u0Var2.H - 1), j10)));
            u0Var2.d.getClass();
        }
    }

    @Override // org.telegram.ui.Components.s60
    public final void c(boolean z10) {
        setRecordingUiFrameClockActive(false);
        q();
        ValueAnimator valueAnimator = this.a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        si.u0 u0Var = this.P;
        if (u0Var != null) {
            si.u0.t();
            int i10 = u0Var.W;
            if (i10 == 10) {
                if (!u0Var.C) {
                    u0Var.i();
                }
            } else if (i10 != 8) {
                u0Var.a();
            } else {
                u0Var.e();
                u0Var.r();
                u0Var.l.M();
                u0Var.C = true;
                u0Var.v(10);
                u0Var.m("released");
                u0Var.i.removeCallbacksAndMessages(null);
                u0Var.j.shutdown();
                u0Var.k.shutdown();
            }
            this.P = null;
        }
        d11 d11Var = this.T;
        if (d11Var != null) {
            d11Var.d(true ^ this.j0);
            this.T = null;
        }
        setScreenFlashEnabled(false);
        MediaController.getInstance().requestRecordAudioFocus(false);
        x();
        k60 k60Var = this.v;
        k60Var.setTranslationX(0.0f);
        this.w0 = 0.0f;
        k60Var.setTranslationY(0.0f + this.v0);
        k60Var.setImageReceiver(null);
        MediaController.getInstance().resumeByRewind();
    }

    @Override // org.telegram.ui.Components.s60
    public final boolean d() {
        si.t0 t0Var = this.R;
        if (t0Var == null) {
            return false;
        }
        int i10 = t0Var.a;
        return i10 == 4 || i10 == 5 || i10 == 6;
    }

    @Override // org.telegram.ui.Components.s60
    public final void e(float f7) {
        float f10 = f7 * 0.5f;
        this.v0 = f10;
        this.v.setTranslationY(this.w0 + f10);
    }

    @Override // org.telegram.ui.Components.s60
    public final void f(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        si.t0 t0Var;
        si.u0 u0Var = this.P;
        if (u0Var == null || (t0Var = this.R) == null) {
            return;
        }
        if (i10 == 3) {
            if (u0Var == null || t0Var == null || t0Var.a != 3) {
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
            this.V = new l60(j10, i11, i12, z10, j11);
            si.u0 u0Var2 = this.P;
            boolean z11 = this.i0;
            boolean z12 = !z11;
            u0Var2.getClass();
            si.u0.t();
            int i13 = u0Var2.W;
            if (i13 == 3 || i13 == 5) {
                u0Var2.m.b("finish requested: state=" + si.o0.w(u0Var2.W) + ", includeAudio=" + z12 + ", durationMs=" + u0Var2.j() + ", trim=" + u0Var2.G + ".." + u0Var2.H);
                u0Var2.z = z12;
                if (u0Var2.W != 3) {
                    u0Var2.r();
                    u0Var2.v(7);
                    u0Var2.j.execute(new ai.xb(u0Var2, u0Var2.Q, u0Var2.l() || z11, u0Var2.R, z12, u0Var2.l() ? 1 : 2, u0Var2.P));
                    return;
                }
                u0Var2.E = u0Var2.j();
                u0Var2.y = true;
                u0Var2.e();
                u0Var2.i.removeCallbacks(u0Var2.T);
                u0Var2.v(7);
                boolean Y = u0Var2.l.Y();
                u0Var2.B = Y;
                if (Y) {
                    return;
                }
                u0Var2.h(new IllegalStateException("Unable to stop the camera segment"));
            }
        }
    }

    @Override // org.telegram.ui.Components.s60
    public final void g(bh.b bVar, org.telegram.ui.bj bjVar) {
        LinearLayout linearLayout = this.F;
        dh.d c10 = bVar.c(linearLayout, bjVar, false);
        c10.p(AndroidUtilities.dp(6.0f));
        c10.q(AndroidUtilities.dp(21.0f));
        linearLayout.setBackground(c10);
    }

    @Override // org.telegram.ui.Components.s60
    public View getButtonsLayout() {
        return this.F;
    }

    @Override // org.telegram.ui.Components.s60
    public p60 getCameraContainer() {
        return this.v;
    }

    @Override // org.telegram.ui.Components.s60
    public RectF getCameraRect() {
        j60 j60Var = this.y;
        int[] iArr = this.K;
        j60Var.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], j60Var.getWidth() + r3, j60Var.getHeight() + iArr[1]);
    }

    @Override // org.telegram.ui.Components.s60
    public View getMuteImageView() {
        return this.I;
    }

    @Override // org.telegram.ui.Components.s60
    public Paint getPaint() {
        return this.w.getPaint();
    }

    @Override // org.telegram.ui.Components.s60
    public TextureView getTextureView() {
        return this.y;
    }

    @Override // org.telegram.ui.Components.s60
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
        org.telegram.ui.fl flVar = this.E;
        if (!this.l0) {
            if (this.t0 == null) {
                try {
                    this.t0 = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.t0;
            if (bitmap != null) {
                flVar.setImageBitmap(bitmap);
            } else {
                flVar.setImageResource(R.drawable.icplaceholder);
            }
            this.l0 = true;
            flVar.animate().cancel();
            flVar.setAlpha(1.0f);
            flVar.invalidate();
        }
        this.T = new d11(this.h, this.r);
        this.Q = (si.s0) ti.e.e.a();
        si.k0 k0Var = new si.k0(getContext(), this.y);
        k0Var.c = new File(ApplicationLoader.getFilesDirFixed(), "cache");
        k0Var.d = (si.m0) ti.e.j.a();
        k0Var.e = this.Q;
        k0Var.h = ti.e.h.a();
        k0Var.f = (si.n0) ti.e.f.a();
        k0Var.g = (si.p0) ti.e.g.a();
        ti.a aVar = ti.e.i;
        aVar.a();
        k0Var.i = aVar.d;
        l2.f fVar = this.J0;
        k0Var.j = fVar;
        d11 d11Var = this.T;
        k0Var.k = d11Var;
        k0Var.l = new tv(this, 6);
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
        if (fVar == null) {
            throw new IllegalStateException("Session listener is required");
        }
        if (d11Var == null) {
            throw new IllegalStateException("Output listener is required");
        }
        this.P = new si.u0(k0Var);
        MediaController.getInstance().requestRecordAudioFocus(true);
        si.u0 u0Var = this.P;
        u0Var.getClass();
        si.u0.t();
        if (u0Var.W == 1) {
            try {
                u0Var.m.b("start requested");
                u0Var.c(true);
                u0Var.v(2);
                u0Var.l.X(u0Var.Q, 0L, u0Var.p);
            } catch (Exception e) {
                u0Var.h(e);
            }
        }
        w(true, false);
    }

    @Override // org.telegram.ui.Components.s60
    public final void i() {
        si.t0 t0Var;
        si.u0 u0Var = this.P;
        if (u0Var == null || (t0Var = this.R) == null) {
            return;
        }
        int i10 = t0Var.a;
        if (i10 == 3) {
            if (u0Var == null || t0Var == null || i10 != 3) {
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
            si.u0.t();
            if (u0Var.W != 5 || u0Var.H - u0Var.G >= u0Var.o) {
                return;
            }
            u0Var.M++;
            u0Var.m.b("resume requested: trim=" + u0Var.G + ".." + u0Var.H + ", sourceDurationMs=" + u0Var.E);
            u0Var.r();
            u0Var.v(6);
            u0Var.j.execute(new ei.s1(u0Var, u0Var.l(), u0Var.Q, u0Var.P, u0Var.R));
        }
    }

    public final void o() {
        si.t0 t0Var;
        VideoEditedInfo videoEditedInfo;
        if (this.P == null || (t0Var = this.R) == null || (videoEditedInfo = this.U) == null) {
            return;
        }
        long j10 = t0Var.b;
        long max = Math.max(0L, videoEditedInfo.startTime);
        long j11 = this.U.endTime;
        if (j11 >= 0) {
            j10 = Math.min(j10, j11);
        }
        si.u0 u0Var = this.P;
        u0Var.getClass();
        si.u0.t();
        if (u0Var.W != 5) {
            return;
        }
        long max2 = Math.max(0L, Math.min(u0Var.E, max));
        long max3 = Math.max(max2, Math.min(u0Var.E, j10));
        if (max3 - max2 < Math.min(800L, u0Var.E)) {
            return;
        }
        u0Var.G = max2;
        u0Var.H = max3;
        i2.h0 h0Var = u0Var.S;
        if (h0Var != null) {
            h0Var.Z0(5, max2);
        }
        u0Var.d.getClass();
        u0Var.o();
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
            k60 k60Var = this.v;
            k60Var.getLayoutParams().width = AndroidUtilities.dp(28.0f) + i12;
            k60Var.getLayoutParams().height = AndroidUtilities.dp(28.0f) + i12;
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
        j60 j60Var = this.y;
        if (j60Var.getWidth() > 0 && j60Var.getHeight() > 0) {
            Matrix matrix = this.L;
            j60Var.getTransform(matrix);
            if (!matrix.isIdentity()) {
                float[] fArr = this.M;
                matrix.getValues(fArr);
                float width = bitmap.getWidth() / j60Var.getWidth();
                float height = bitmap.getHeight() / j60Var.getHeight();
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

    public final VideoEditedInfo r(File file, long j10, c11 c11Var) {
        si.p0 p0Var;
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.startTime = -1L;
        videoEditedInfo.endTime = -1L;
        videoEditedInfo.estimatedDuration = j10;
        videoEditedInfo.estimatedSize = Math.max(1L, c11Var == null ? file.length() : c11Var.a);
        videoEditedInfo.roundVideo = true;
        si.u0 u0Var = this.P;
        videoEditedInfo.framerate = (u0Var == null || (p0Var = u0Var.s) == null) ? 30 : p0Var.a;
        si.s0 s0Var = this.Q;
        int i10 = s0Var == null ? 480 : s0Var.a;
        videoEditedInfo.originalWidth = i10;
        videoEditedInfo.resultWidth = i10;
        videoEditedInfo.originalHeight = i10;
        videoEditedInfo.resultHeight = i10;
        videoEditedInfo.originalPath = file.getAbsolutePath();
        if (c11Var != null) {
            videoEditedInfo.file = c11Var.b;
            videoEditedInfo.encryptedFile = c11Var.c;
            videoEditedInfo.key = c11Var.d;
            videoEditedInfo.iv = c11Var.e;
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

    @Override // org.telegram.ui.Components.s60
    public void setInternalPadding(int i10) {
        setPadding(0, 0, 0, i10);
    }

    @Override // org.telegram.ui.Components.s60
    public void setIsMessageTransition(boolean z10) {
        this.v.getClass();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.F.setAlpha(0.0f);
        k60 k60Var = this.v;
        k60Var.setAlpha(0.0f);
        k60Var.setScaleX(0.1f);
        k60Var.setScaleY(0.1f);
        k60Var.setTranslationX(0.0f);
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
            org.telegram.ui.fl flVar = this.E;
            flVar.animate().cancel();
            if (z10) {
                flVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
            } else {
                flVar.setAlpha(0.0f);
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
        j60 j60Var = this.y;
        if (j60Var.isAvailable() && (bitmap = j60Var.getBitmap(180, 180)) != null) {
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
        o60 o60Var = this.a;
        if (o60Var != null) {
            ((org.telegram.ui.pe) o60Var).b.Jc.a(z10, true);
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
        k60 k60Var = this.v;
        if (z10 && !this.k0) {
            k60Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.w0 = measuredHeight;
            k60Var.setTranslationY(measuredHeight + this.v0);
        }
        this.k0 = z10;
        View view = this.s;
        if (view != null) {
            view.invalidate();
        }
        float dp = (z10 || Math.max(getCurrentDurationMs(), this.u0) <= 300) ? 0.0f : AndroidUtilities.dp(24.0f) - (getMeasuredWidth() * 0.5f);
        int i10 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 1.0f : 0.0f, z10 ? 0.0f : 1.0f);
        ofFloat.addUpdateListener(new g60(this, i10));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.W = animatorSet2;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        LinearLayout linearLayout = this.F;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, fArr), ObjectAnimator.ofFloat(k60Var, (Property<k60, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(k60Var, (Property<k60, Float>) View.SCALE_X, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(k60Var, (Property<k60, Float>) View.SCALE_Y, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(k60Var, (Property<k60, Float>) View.TRANSLATION_X, dp), ObjectAnimator.ofFloat(this.I, (Property<ImageView, Float>) property, (this.i0 && z10) ? 1.0f : 0.0f), ofFloat);
        this.W.setDuration(180L);
        this.W.setInterpolator(new DecelerateInterpolator());
        if (z10) {
            setTranslationX(0.0f);
        } else {
            this.W.addListener(new i60(this, i10));
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
        si.l0 l0Var;
        si.t0 t0Var = this.R;
        boolean z10 = false;
        boolean z11 = (t0Var == null || t0Var.a != 3 || t0Var.e || this.n0) ? false : true;
        this.G.setEnabled(z11);
        if (z11 && (l0Var = this.S) != null && l0Var.b != 1) {
            z10 = true;
        }
        this.H.setEnabled(z10);
        z();
    }

    public final void z() {
        si.t0 t0Var = this.R;
        int i10 = this.O;
        ei.q2 q2Var = this.H;
        if (t0Var == null || !t0Var.f) {
            if (this.d0 == null) {
                yj0 yj0Var = new yj0(R.raw.roundcamera_flash_on, i10, i10);
                this.d0 = yj0Var;
                yj0Var.setCallback(q2Var);
            }
            q2Var.setImageDrawable(this.d0);
            return;
        }
        if (this.e0 == null) {
            yj0 yj0Var2 = new yj0(R.raw.roundcamera_flash_off, i10, i10);
            this.e0 = yj0Var2;
            yj0Var2.setCallback(q2Var);
        }
        q2Var.setImageDrawable(this.e0);
    }
}
