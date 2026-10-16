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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class o60 extends u60 {
    public int A0;
    public boolean B0;
    public boolean C0;
    public float D0;
    public final org.telegram.ui.rl E;
    public int E0;
    public final LinearLayout F;
    public long F0;
    public final di.u2 G;
    public boolean G0;
    public final di.u2 H;
    public boolean H0;
    public final ImageView I;
    public final kq I0;
    public final di.w2 J;
    public final m.h J0;
    public final int[] K;
    public final Matrix L;
    public final float[] M;
    public final Paint N;
    public final int O;
    public ri.r0 P;
    public ri.p0 Q;
    public ri.q0 R;
    public ri.j0 S;
    public d11 T;
    public VideoEditedInfo U;
    public n60 V;
    public AnimatorSet W;
    public ValueAnimator a0;
    public ValueAnimator b0;
    public final yj0 c0;
    public yj0 d0;
    public yj0 e0;
    public final c60 f;
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
    public final m60 v;
    public float v0;
    public final ym0 w;
    public float w0;
    public final FrameLayout x;
    public float x0;
    public final l60 y;
    public float y0;
    public int z0;

    public o60(Activity activity, c60 c60Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        this.h = UserConfig.selectedAccount;
        this.K = new int[2];
        this.L = new Matrix();
        this.M = new float[9];
        this.N = new Paint(3);
        this.z0 = -1;
        this.A0 = -1;
        this.D0 = Float.NaN;
        this.I0 = new kq(this, 25);
        this.J0 = new m.h(this, 8);
        this.f = c60Var;
        this.n = c60Var.getClassGuid();
        this.r = c60Var.x();
        this.s = c60Var.getFragmentView();
        setWillNotDraw(false);
        di.w2 w2Var = new di.w2(activity, null, this, null);
        this.J = w2Var;
        w2Var.o = 0.5f;
        w2Var.n = di.w2.f(0.5f);
        w2Var.g();
        addView(w2Var.b, w7.z5.e(-1, -1, 119));
        m60 m60Var = new m60(this, activity);
        this.v = m60Var;
        ym0 ym0Var = new ym0(activity);
        this.w = ym0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.x = frameLayout;
        l60 l60Var = new l60(this, activity, 0);
        l60Var.setOpaque(true);
        l60Var.setClickable(true);
        l60Var.setCameraDistance(AndroidUtilities.dp(8000.0f));
        l60Var.setOutlineProvider(new bi.a2(13));
        l60Var.setClipToOutline(true);
        this.y = l60Var;
        frameLayout.addView(l60Var, w7.z5.e(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.rl rlVar = new org.telegram.ui.rl(this, activity, paint);
        this.E = rlVar;
        rlVar.setOutlineProvider(new bi.a2(12));
        rlVar.setClipToOutline(true);
        frameLayout.addView(rlVar, w7.z5.e(-1, -1, 119));
        ym0Var.addView(frameLayout, w7.z5.a(-1.0f, 14.0f, 14.0f, 14.0f, 14.0f, -1, 119));
        m60Var.addView(ym0Var, w7.z5.e(-1, -1, 119));
        int i10 = AndroidUtilities.roundPlayingMessageSize;
        addView(m60Var, new FrameLayout.LayoutParams(i10, i10, 17));
        addView(w2Var.c, w7.z5.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.F = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        addView(linearLayout, w7.z5.a(56.0f, 1.0f, 0.0f, 0.0f, 0.0f, -2, 83));
        di.u2 u2Var = new di.u2(activity);
        this.G = u2Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        u2Var.setScaleType(scaleType);
        u2Var.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        linearLayout.addView(u2Var, w7.z5.n(44, 44));
        final int i11 = 0;
        u2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.k60
            public final /* synthetic */ o60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ri.q0 q0Var;
                ri.j0 j0Var;
                boolean z10;
                ri.q0 q0Var2;
                int i12;
                switch (i11) {
                    case 0:
                        o60 o60Var = this.b;
                        ri.r0 r0Var = o60Var.P;
                        if (r0Var != null && (q0Var = o60Var.R) != null && (j0Var = o60Var.S) != null && q0Var.a == 3 && !q0Var.e && !o60Var.n0) {
                            ri.k0 k0Var = j0Var.a;
                            ri.k0 k0Var2 = ri.k0.a;
                            if (k0Var == k0Var2) {
                                k0Var2 = ri.k0.b;
                            }
                            r0Var.getClass();
                            ri.r0.t();
                            int i13 = r0Var.W;
                            if (i13 != 7 && i13 != 8 && i13 != 9 && i13 != 10) {
                                if (r0Var.p != k0Var2) {
                                    r0Var.m.b("camera facing requested: " + r0Var.p + " -> " + k0Var2 + ", state=" + org.telegram.ui.Cells.c1.y(r0Var.W));
                                    r0Var.p = k0Var2;
                                    int i14 = r0Var.W;
                                    if (i14 == 3 || i14 == 2) {
                                        r0Var.e();
                                        ri.j jVar = r0Var.l;
                                        jVar.F = k0Var2;
                                        Handler handler = jVar.n;
                                        if (!jVar.V || handler == null) {
                                            z10 = false;
                                        } else {
                                            handler.post(new org.telegram.ui.web.v(24, jVar, k0Var2));
                                            z10 = true;
                                        }
                                        r0Var.w = z10;
                                    }
                                    r0Var.n();
                                    r0Var.o();
                                }
                                o60Var.c0.M(0);
                                o60Var.c0.start();
                                break;
                            }
                        }
                        break;
                    default:
                        o60 o60Var2 = this.b;
                        ri.r0 r0Var2 = o60Var2.P;
                        if (r0Var2 != null && (q0Var2 = o60Var2.R) != null && o60Var2.S != null) {
                            boolean z11 = !q0Var2.f;
                            ri.j jVar2 = r0Var2.l;
                            ri.r0.t();
                            if (r0Var2.W == 3 && !r0Var2.w && (i12 = r0Var2.X) != 1) {
                                r0Var2.u = z11;
                                if (i12 == 3) {
                                    r0Var2.u(z11);
                                    jVar2.T(false);
                                } else {
                                    r0Var2.u(false);
                                    jVar2.T(z11);
                                }
                                r0Var2.o();
                                o60Var2.z();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        di.u2 u2Var2 = new di.u2(activity);
        this.H = u2Var2;
        u2Var2.setScaleType(scaleType);
        linearLayout.addView(u2Var2, w7.z5.n(44, 44));
        final int i12 = 1;
        u2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.k60
            public final /* synthetic */ o60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ri.q0 q0Var;
                ri.j0 j0Var;
                boolean z10;
                ri.q0 q0Var2;
                int i122;
                switch (i12) {
                    case 0:
                        o60 o60Var = this.b;
                        ri.r0 r0Var = o60Var.P;
                        if (r0Var != null && (q0Var = o60Var.R) != null && (j0Var = o60Var.S) != null && q0Var.a == 3 && !q0Var.e && !o60Var.n0) {
                            ri.k0 k0Var = j0Var.a;
                            ri.k0 k0Var2 = ri.k0.a;
                            if (k0Var == k0Var2) {
                                k0Var2 = ri.k0.b;
                            }
                            r0Var.getClass();
                            ri.r0.t();
                            int i13 = r0Var.W;
                            if (i13 != 7 && i13 != 8 && i13 != 9 && i13 != 10) {
                                if (r0Var.p != k0Var2) {
                                    r0Var.m.b("camera facing requested: " + r0Var.p + " -> " + k0Var2 + ", state=" + org.telegram.ui.Cells.c1.y(r0Var.W));
                                    r0Var.p = k0Var2;
                                    int i14 = r0Var.W;
                                    if (i14 == 3 || i14 == 2) {
                                        r0Var.e();
                                        ri.j jVar = r0Var.l;
                                        jVar.F = k0Var2;
                                        Handler handler = jVar.n;
                                        if (!jVar.V || handler == null) {
                                            z10 = false;
                                        } else {
                                            handler.post(new org.telegram.ui.web.v(24, jVar, k0Var2));
                                            z10 = true;
                                        }
                                        r0Var.w = z10;
                                    }
                                    r0Var.n();
                                    r0Var.o();
                                }
                                o60Var.c0.M(0);
                                o60Var.c0.start();
                                break;
                            }
                        }
                        break;
                    default:
                        o60 o60Var2 = this.b;
                        ri.r0 r0Var2 = o60Var2.P;
                        if (r0Var2 != null && (q0Var2 = o60Var2.R) != null && o60Var2.S != null) {
                            boolean z11 = !q0Var2.f;
                            ri.j jVar2 = r0Var2.l;
                            ri.r0.t();
                            if (r0Var2.W == 3 && !r0Var2.w && (i122 = r0Var2.X) != 1) {
                                r0Var2.u = z11;
                                if (i122 == 3) {
                                    r0Var2.u(z11);
                                    jVar2.T(false);
                                } else {
                                    r0Var2.u(false);
                                    jVar2.T(z11);
                                }
                                r0Var2.o();
                                o60Var2.z();
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
        yj0Var.setCallback(u2Var);
        yj0Var.M(yj0Var.e[0] - 1);
        u2Var.setImageDrawable(yj0Var);
        z();
        if (c6Var != null && !c6Var.a()) {
            u2Var.setInvert(0.6f);
            u2Var2.setInvert(0.6f);
        }
        ImageView imageView = new ImageView(activity);
        this.I = imageView;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.video_mute);
        imageView.setAlpha(0.0f);
        addView(imageView, w7.z5.e(48, 48, 17));
        l60Var.setOnTouchListener(new tk(this, 2));
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
        ri.q0 q0Var;
        ri.r0 r0Var = this.P;
        if (r0Var == null || (q0Var = this.R) == null) {
            return 0L;
        }
        return q0Var.a == 3 ? r0Var.j() : q0Var.b;
    }

    public static void l(o60 o60Var) {
        if (o60Var.n0 && o60Var.q0 && o60Var.o0 && o60Var.p0) {
            o60Var.n0 = false;
            FileLog.d("RoundVideo camera flip completed: elapsedMs=" + o60Var.getCameraFlipElapsedMs());
            o60Var.y();
        }
    }

    public static void m(o60 o60Var) {
        org.telegram.ui.rl rlVar = o60Var.E;
        if (o60Var.l0) {
            o60Var.l0 = false;
            rlVar.invalidate();
            rlVar.animate().cancel();
            rlVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecordingUiFrameClockActive(boolean z10) {
        org.telegram.ui.sk skVar;
        if (z10 == this.G0) {
            return;
        }
        this.G0 = z10;
        this.F0 = 0L;
        kq kqVar = this.I0;
        if (z10) {
            zf.i.d().a(30, kqVar);
        } else {
            zf.i.d().f(kqVar);
        }
        if (this.d == z10) {
            return;
        }
        this.d = z10;
        s60 s60Var = this.c;
        if (s60Var == null || (skVar = ((org.telegram.ui.wj) s60Var).a.Y) == null) {
            return;
        }
        skVar.setRoundVideoUiFrameClockActive(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenFlashEnabled(boolean z10) {
        Activity parentActivity = this.f.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        di.w2 w2Var = this.J;
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

    public final void A() {
        org.telegram.ui.sk skVar;
        ri.q0 q0Var = this.R;
        if (q0Var != null) {
            long j10 = q0Var.d;
            if (q0Var.a != 3) {
                return;
            }
            long min = Math.min(j10, (SystemClock.elapsedRealtime() + q0Var.b) - q0Var.c);
            this.u0 = min;
            this.w.setProgress(min / j10);
            s60 s60Var = this.c;
            if (s60Var == null || (skVar = ((org.telegram.ui.wj) s60Var).a.Y) == null || !skVar.j1) {
                return;
            }
            skVar.i1 = min;
            yg ygVar = skVar.Y0;
            if (ygVar != null && ygVar.r) {
                ygVar.h = min;
                ygVar.invalidate();
            }
            vg vgVar = skVar.l1;
            if (vgVar != null && vgVar.n) {
                if (!vgVar.h) {
                    long j11 = vgVar.r;
                    if (j11 >= 0) {
                        if (!vgVar.e) {
                            long max = Math.max(0L, min - j11) % 1200;
                            vgVar.a = max < 600 ? 1.0f - (max / 600.0f) : (max - 600) / 600.0f;
                        }
                        vgVar.invalidate();
                    }
                }
                vgVar.r = min;
                vgVar.a = 1.0f;
                vgVar.invalidate();
            }
            ChatActivityEnterView.SlideTextView slideTextView = skVar.k1;
            if (slideTextView == null || !slideTextView.J || slideTextView.n == 1.0f) {
                return;
            }
            slideTextView.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.u60
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

    @Override // org.telegram.ui.Components.u60
    public final void b(float f7, int i10) {
        ri.q0 q0Var;
        i2.h0 h0Var;
        if (this.P == null || (q0Var = this.R) == null || q0Var.a != 5) {
            return;
        }
        o();
        if (i10 == 0) {
            this.P.q();
            return;
        }
        if (i10 == 1) {
            ri.r0 r0Var = this.P;
            r0Var.getClass();
            ri.r0.t();
            if (r0Var.W != 5 || (h0Var = r0Var.S) == null) {
                return;
            }
            h0Var.e();
            r0Var.x(false);
            m.h hVar = r0Var.d;
            r0Var.S.M0();
            hVar.getClass();
            return;
        }
        if (i10 == 2) {
            ri.r0 r0Var2 = this.P;
            long j10 = (long) (f7 * this.R.b);
            r0Var2.getClass();
            ri.r0.t();
            if (r0Var2.W != 5 || r0Var2.S == null) {
                return;
            }
            long j11 = r0Var2.G;
            r0Var2.S.Z0(5, Math.max(j11, Math.min(Math.max(j11, r0Var2.H - 1), j10)));
            r0Var2.d.getClass();
        }
    }

    @Override // org.telegram.ui.Components.u60
    public final void c(boolean z10) {
        setRecordingUiFrameClockActive(false);
        q();
        ValueAnimator valueAnimator = this.a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ri.r0 r0Var = this.P;
        if (r0Var != null) {
            ri.r0.t();
            int i10 = r0Var.W;
            if (i10 == 10) {
                if (!r0Var.C) {
                    r0Var.i();
                }
            } else if (i10 != 8) {
                r0Var.a();
            } else {
                r0Var.e();
                r0Var.r();
                r0Var.l.M();
                r0Var.C = true;
                r0Var.v(10);
                r0Var.m("released");
                r0Var.i.removeCallbacksAndMessages(null);
                r0Var.j.shutdown();
                r0Var.k.shutdown();
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
        m60 m60Var = this.v;
        m60Var.setTranslationX(0.0f);
        this.w0 = 0.0f;
        m60Var.setTranslationY(0.0f + this.v0);
        m60Var.setImageReceiver(null);
        MediaController.getInstance().resumeByRewind();
    }

    @Override // org.telegram.ui.Components.u60
    public final boolean d() {
        ri.q0 q0Var = this.R;
        if (q0Var == null) {
            return false;
        }
        int i10 = q0Var.a;
        return i10 == 4 || i10 == 5 || i10 == 6;
    }

    @Override // org.telegram.ui.Components.u60
    public final void e(float f7) {
        float f10 = f7 * 0.5f;
        this.v0 = f10;
        this.v.setTranslationY(this.w0 + f10);
    }

    @Override // org.telegram.ui.Components.u60
    public final void f(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        ri.q0 q0Var;
        ri.r0 r0Var = this.P;
        if (r0Var == null || (q0Var = this.R) == null) {
            return;
        }
        if (i10 == 3) {
            if (r0Var == null || q0Var == null || q0Var.a != 3) {
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
            this.V = new n60(j10, i11, i12, z10, j11);
            ri.r0 r0Var2 = this.P;
            boolean z11 = this.i0;
            boolean z12 = !z11;
            r0Var2.getClass();
            ri.r0.t();
            int i13 = r0Var2.W;
            if (i13 == 3 || i13 == 5) {
                r0Var2.m.b("finish requested: state=" + org.telegram.ui.Cells.c1.y(r0Var2.W) + ", includeAudio=" + z12 + ", durationMs=" + r0Var2.j() + ", trim=" + r0Var2.G + ".." + r0Var2.H);
                r0Var2.z = z12;
                if (r0Var2.W != 3) {
                    r0Var2.r();
                    r0Var2.v(7);
                    r0Var2.j.execute(new org.telegram.messenger.bj(r0Var2, r0Var2.Q, r0Var2.l() || z11, r0Var2.R, z12, r0Var2.l() ? 1 : 2, r0Var2.P));
                    return;
                }
                r0Var2.E = r0Var2.j();
                r0Var2.y = true;
                r0Var2.e();
                r0Var2.i.removeCallbacks(r0Var2.T);
                r0Var2.v(7);
                boolean Y = r0Var2.l.Y();
                r0Var2.B = Y;
                if (Y) {
                    return;
                }
                r0Var2.h(new IllegalStateException("Unable to stop the camera segment"));
            }
        }
    }

    @Override // org.telegram.ui.Components.u60
    public final void g(bh.b bVar, org.telegram.ui.oj ojVar) {
        LinearLayout linearLayout = this.F;
        dh.d c10 = bVar.c(linearLayout, ojVar, false);
        c10.p(AndroidUtilities.dp(6.0f));
        c10.q(AndroidUtilities.dp(21.0f));
        linearLayout.setBackground(c10);
    }

    @Override // org.telegram.ui.Components.u60
    public View getButtonsLayout() {
        return this.F;
    }

    @Override // org.telegram.ui.Components.u60
    public r60 getCameraContainer() {
        return this.v;
    }

    @Override // org.telegram.ui.Components.u60
    public RectF getCameraRect() {
        l60 l60Var = this.y;
        int[] iArr = this.K;
        l60Var.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], l60Var.getWidth() + r3, l60Var.getHeight() + iArr[1]);
    }

    @Override // org.telegram.ui.Components.u60
    public View getMuteImageView() {
        return this.I;
    }

    @Override // org.telegram.ui.Components.u60
    public Paint getPaint() {
        return this.w.getPaint();
    }

    @Override // org.telegram.ui.Components.u60
    public TextureView getTextureView() {
        return this.y;
    }

    @Override // org.telegram.ui.Components.u60
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
        org.telegram.ui.rl rlVar = this.E;
        if (!this.l0) {
            if (this.t0 == null) {
                try {
                    this.t0 = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.t0;
            if (bitmap != null) {
                rlVar.setImageBitmap(bitmap);
            } else {
                rlVar.setImageResource(R.drawable.icplaceholder);
            }
            this.l0 = true;
            rlVar.animate().cancel();
            rlVar.setAlpha(1.0f);
            rlVar.invalidate();
        }
        this.T = new d11(this.h, this.r);
        this.Q = (ri.p0) si.e.e.a();
        ri.i0 i0Var = new ri.i0(getContext(), this.y);
        i0Var.c = new File(ApplicationLoader.getFilesDirFixed(), "cache");
        i0Var.d = (ri.k0) si.e.j.a();
        i0Var.e = this.Q;
        i0Var.h = si.e.h.a();
        i0Var.f = (ri.l0) si.e.f.a();
        i0Var.g = (ri.m0) si.e.g.a();
        si.a aVar = si.e.i;
        aVar.a();
        i0Var.i = aVar.d;
        m.h hVar = this.J0;
        i0Var.j = hVar;
        d11 d11Var = this.T;
        i0Var.k = d11Var;
        i0Var.l = new xv(this, 6);
        if (i0Var.d == null) {
            throw new IllegalStateException("Initial camera is required");
        }
        if (i0Var.e == null) {
            throw new IllegalStateException("Output resolution is required");
        }
        if (i0Var.h <= 0) {
            throw new IllegalStateException("Video bitrate is required");
        }
        if (i0Var.f == null) {
            throw new IllegalStateException("Camera resolution is required");
        }
        if (i0Var.g == null) {
            throw new IllegalStateException("Frame rate is required");
        }
        if (hVar == null) {
            throw new IllegalStateException("Session listener is required");
        }
        if (d11Var == null) {
            throw new IllegalStateException("Output listener is required");
        }
        this.P = new ri.r0(i0Var);
        MediaController.getInstance().requestRecordAudioFocus(true);
        ri.r0 r0Var = this.P;
        r0Var.getClass();
        ri.r0.t();
        if (r0Var.W == 1) {
            try {
                r0Var.m.b("start requested");
                r0Var.c(true);
                r0Var.v(2);
                r0Var.l.X(r0Var.Q, 0L, r0Var.p);
            } catch (Exception e) {
                r0Var.h(e);
            }
        }
        w(true, false);
    }

    @Override // org.telegram.ui.Components.u60
    public final void i() {
        ri.q0 q0Var;
        ri.r0 r0Var = this.P;
        if (r0Var == null || (q0Var = this.R) == null) {
            return;
        }
        int i10 = q0Var.a;
        if (i10 == 3) {
            if (r0Var == null || q0Var == null || i10 != 3) {
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
            ri.r0.t();
            if (r0Var.W != 5 || r0Var.H - r0Var.G >= r0Var.o) {
                return;
            }
            r0Var.M++;
            r0Var.m.b("resume requested: trim=" + r0Var.G + ".." + r0Var.H + ", sourceDurationMs=" + r0Var.E);
            r0Var.r();
            r0Var.v(6);
            r0Var.j.execute(new di.t1(r0Var, r0Var.l(), r0Var.Q, r0Var.P, r0Var.R));
        }
    }

    public final void o() {
        ri.q0 q0Var;
        VideoEditedInfo videoEditedInfo;
        if (this.P == null || (q0Var = this.R) == null || (videoEditedInfo = this.U) == null) {
            return;
        }
        long j10 = q0Var.b;
        long max = Math.max(0L, videoEditedInfo.startTime);
        long j11 = this.U.endTime;
        if (j11 >= 0) {
            j10 = Math.min(j10, j11);
        }
        ri.r0 r0Var = this.P;
        r0Var.getClass();
        ri.r0.t();
        if (r0Var.W != 5) {
            return;
        }
        long max2 = Math.max(0L, Math.min(r0Var.E, max));
        long max3 = Math.max(max2, Math.min(r0Var.E, j10));
        if (max3 - max2 < Math.min(800L, r0Var.E)) {
            return;
        }
        r0Var.G = max2;
        r0Var.H = max3;
        i2.h0 h0Var = r0Var.S;
        if (h0Var != null) {
            h0Var.Z0(5, max2);
        }
        r0Var.d.getClass();
        r0Var.o();
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
            m60 m60Var = this.v;
            m60Var.getLayoutParams().width = AndroidUtilities.dp(28.0f) + i12;
            m60Var.getLayoutParams().height = AndroidUtilities.dp(28.0f) + i12;
            ((FrameLayout.LayoutParams) this.I.getLayoutParams()).topMargin = (i12 / 2) - AndroidUtilities.dp(24.0f);
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30);
        di.w2 w2Var = this.J;
        w2Var.b.measure(makeMeasureSpec, makeMeasureSpec2);
        w2Var.c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return motionEvent.getAction() != 0 || motionEvent.getY() <= ((float) (getMeasuredHeight() - getPaddingBottom()));
    }

    public final Bitmap p(Bitmap bitmap) {
        l60 l60Var = this.y;
        if (l60Var.getWidth() > 0 && l60Var.getHeight() > 0) {
            Matrix matrix = this.L;
            l60Var.getTransform(matrix);
            if (!matrix.isIdentity()) {
                float[] fArr = this.M;
                matrix.getValues(fArr);
                float width = bitmap.getWidth() / l60Var.getWidth();
                float height = bitmap.getHeight() / l60Var.getHeight();
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
        ri.m0 m0Var;
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.startTime = -1L;
        videoEditedInfo.endTime = -1L;
        videoEditedInfo.estimatedDuration = j10;
        videoEditedInfo.estimatedSize = Math.max(1L, c11Var == null ? file.length() : c11Var.a);
        videoEditedInfo.roundVideo = true;
        ri.r0 r0Var = this.P;
        videoEditedInfo.framerate = (r0Var == null || (m0Var = r0Var.s) == null) ? 30 : m0Var.a;
        ri.p0 p0Var = this.Q;
        int i10 = p0Var == null ? 480 : p0Var.a;
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
            this.a0.addUpdateListener(new j60(this, 1));
            this.a0.start();
        }
    }

    @Override // org.telegram.ui.Components.u60
    public void setInternalPadding(int i10) {
        setPadding(0, 0, 0, i10);
    }

    @Override // org.telegram.ui.Components.u60
    public void setIsMessageTransition(boolean z10) {
        this.v.getClass();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.F.setAlpha(0.0f);
        m60 m60Var = this.v;
        m60Var.setAlpha(0.0f);
        m60Var.setScaleX(0.1f);
        m60Var.setScaleY(0.1f);
        m60Var.setTranslationX(0.0f);
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
            org.telegram.ui.rl rlVar = this.E;
            rlVar.animate().cancel();
            if (z10) {
                rlVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
            } else {
                rlVar.setAlpha(0.0f);
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
        l60 l60Var = this.y;
        if (l60Var.isAvailable() && (bitmap = l60Var.getBitmap(180, 180)) != null) {
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
        q60 q60Var = this.a;
        if (q60Var != null) {
            ((org.telegram.ui.xe) q60Var).b.vc.a(z10, true);
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
        m60 m60Var = this.v;
        if (z10 && !this.k0) {
            m60Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.w0 = measuredHeight;
            m60Var.setTranslationY(measuredHeight + this.v0);
        }
        this.k0 = z10;
        View view = this.s;
        if (view != null) {
            view.invalidate();
        }
        float dp = (z10 || Math.max(getCurrentDurationMs(), this.u0) <= 300) ? 0.0f : AndroidUtilities.dp(24.0f) - (getMeasuredWidth() * 0.5f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 1.0f : 0.0f, z10 ? 0.0f : 1.0f);
        ofFloat.addUpdateListener(new j60(this, 0));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.W = animatorSet2;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        LinearLayout linearLayout = this.F;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, fArr), ObjectAnimator.ofFloat(m60Var, (Property<m60, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(m60Var, (Property<m60, Float>) View.SCALE_X, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(m60Var, (Property<m60, Float>) View.SCALE_Y, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(m60Var, (Property<m60, Float>) View.TRANSLATION_X, dp), ObjectAnimator.ofFloat(this.I, (Property<ImageView, Float>) property, (this.i0 && z10) ? 1.0f : 0.0f), ofFloat);
        this.W.setDuration(180L);
        this.W.setInterpolator(new DecelerateInterpolator());
        if (z10) {
            setTranslationX(0.0f);
        } else {
            this.W.addListener(new l6(this, 27));
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
        ri.j0 j0Var;
        ri.q0 q0Var = this.R;
        boolean z10 = false;
        boolean z11 = (q0Var == null || q0Var.a != 3 || q0Var.e || this.n0) ? false : true;
        this.G.setEnabled(z11);
        if (z11 && (j0Var = this.S) != null && j0Var.b != 1) {
            z10 = true;
        }
        this.H.setEnabled(z10);
        z();
    }

    public final void z() {
        ri.q0 q0Var = this.R;
        int i10 = this.O;
        di.u2 u2Var = this.H;
        if (q0Var == null || !q0Var.f) {
            if (this.d0 == null) {
                yj0 yj0Var = new yj0(R.raw.roundcamera_flash_on, i10, i10);
                this.d0 = yj0Var;
                yj0Var.setCallback(u2Var);
            }
            u2Var.setImageDrawable(this.d0);
            return;
        }
        if (this.e0 == null) {
            yj0 yj0Var2 = new yj0(R.raw.roundcamera_flash_off, i10, i10);
            this.e0 = yj0Var2;
            yj0Var2.setCallback(u2Var);
        }
        u2Var.setImageDrawable(this.e0);
    }
}
