package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
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
import org.telegram.messenger.SharedSettings;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class b60 extends h60 {
    public final org.telegram.ui.kl E;
    public final LinearLayout F;
    public final ci.w2 G;
    public final ci.w2 H;
    public final ImageView I;
    public final ci.y2 J;
    public final int[] K;
    public final int L;
    public ki.q0 M;
    public ki.o0 N;
    public ki.p0 O;
    public ki.h0 P;
    public r01 Q;
    public VideoEditedInfo R;
    public a60 S;
    public AnimatorSet T;
    public ValueAnimator U;
    public final kj0 V;
    public kj0 W;
    public kj0 a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;
    public boolean e0;
    public final n50 f;
    public boolean f0;
    public boolean g0;
    public final int h;
    public boolean h0;
    public boolean i0;
    public Bitmap j0;
    public long k0;
    public float l0;
    public float m0;
    public final int n;
    public float n0;
    public float o0;
    public int p0;
    public int q0;
    public final boolean r;
    public boolean r0;
    public final View s;
    public boolean s0;
    public float t0;
    public int u0;
    public final z50 v;
    public long v0;
    public final km0 w;
    public boolean w0;
    public final FrameLayout x;
    public boolean x0;
    public final y50 y;
    public final xp y0;
    public final x50 z0;

    public b60(Activity activity, n50 n50Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.h = UserConfig.selectedAccount;
        this.K = new int[2];
        this.p0 = -1;
        this.q0 = -1;
        this.t0 = Float.NaN;
        this.y0 = new xp(this, 25);
        this.z0 = new x50(this);
        this.f = n50Var;
        this.n = n50Var.getClassGuid();
        this.r = n50Var.v();
        this.s = n50Var.getFragmentView();
        setWillNotDraw(false);
        ci.y2 y2Var = new ci.y2(activity, null, this, null);
        this.J = y2Var;
        y2Var.o = 0.5f;
        y2Var.n = ci.y2.f(0.5f);
        y2Var.g();
        addView(y2Var.b, w7.y5.e(-1, -1, 119));
        z50 z50Var = new z50(this, activity);
        this.v = z50Var;
        km0 km0Var = new km0(activity);
        this.w = km0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.x = frameLayout;
        y50 y50Var = new y50(this, activity, 0);
        y50Var.setOpaque(true);
        y50Var.setClickable(true);
        y50Var.setCameraDistance(AndroidUtilities.dp(8000.0f));
        y50Var.setOutlineProvider(new ai.k2(13));
        y50Var.setClipToOutline(true);
        this.y = y50Var;
        frameLayout.addView(y50Var, w7.y5.e(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.kl klVar = new org.telegram.ui.kl(this, activity, paint);
        this.E = klVar;
        klVar.setOutlineProvider(new ai.k2(12));
        klVar.setClipToOutline(true);
        frameLayout.addView(klVar, w7.y5.e(-1, -1, 119));
        km0Var.addView(frameLayout, w7.y5.d(-1, -1.0f, 119, 14.0f, 14.0f, 14.0f, 14.0f));
        z50Var.addView(km0Var, w7.y5.e(-1, -1, 119));
        int i10 = AndroidUtilities.roundPlayingMessageSize;
        addView(z50Var, new FrameLayout.LayoutParams(i10, i10, 17));
        addView(y2Var.c, w7.y5.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.F = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        addView(linearLayout, w7.y5.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ci.w2 w2Var = new ci.w2(activity);
        this.G = w2Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        w2Var.setScaleType(scaleType);
        w2Var.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        linearLayout.addView(w2Var, w7.y5.n(44, 44));
        final int i11 = 0;
        w2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.w50
            public final /* synthetic */ b60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.p0 p0Var;
                ki.h0 h0Var;
                boolean z10;
                ki.p0 p0Var2;
                int i12;
                switch (i11) {
                    case 0:
                        b60 b60Var = this.b;
                        kj0 kj0Var = b60Var.V;
                        ki.q0 q0Var = b60Var.M;
                        if (q0Var != null && (p0Var = b60Var.O) != null && (h0Var = b60Var.P) != null && p0Var.a == 3 && !p0Var.e) {
                            ki.i0 i0Var = h0Var.a;
                            ki.i0 i0Var2 = ki.i0.a;
                            if (i0Var == i0Var2) {
                                i0Var2 = ki.i0.b;
                            }
                            q0Var.getClass();
                            ki.q0.s();
                            int i13 = q0Var.U;
                            if (i13 != 7 && i13 != 8 && i13 != 9 && i13 != 10) {
                                if (q0Var.o != i0Var2) {
                                    q0Var.l.b("camera facing requested: " + q0Var.o + " -> " + i0Var2 + ", state=" + hg.k0.C(q0Var.U));
                                    q0Var.o = i0Var2;
                                    int i14 = q0Var.U;
                                    if (i14 == 3 || i14 == 2) {
                                        q0Var.d();
                                        ki.h hVar = q0Var.k;
                                        hVar.B = i0Var2;
                                        Handler handler = hVar.n;
                                        if (!hVar.R || handler == null) {
                                            z10 = false;
                                        } else {
                                            handler.post(new gg.x1(27, hVar, i0Var2));
                                            z10 = true;
                                        }
                                        q0Var.v = z10;
                                    }
                                    q0Var.m();
                                    q0Var.n();
                                }
                                kj0Var.M(0);
                                kj0Var.start();
                                break;
                            }
                        }
                        break;
                    default:
                        b60 b60Var2 = this.b;
                        ki.q0 q0Var2 = b60Var2.M;
                        if (q0Var2 != null && (p0Var2 = b60Var2.O) != null && b60Var2.P != null) {
                            boolean z11 = !p0Var2.f;
                            ki.h hVar2 = q0Var2.k;
                            ki.q0.s();
                            if (q0Var2.U == 3 && !q0Var2.v && (i12 = q0Var2.V) != 1) {
                                q0Var2.t = z11;
                                if (i12 == 3) {
                                    q0Var2.t(z11);
                                    hVar2.z(false);
                                } else {
                                    q0Var2.t(false);
                                    hVar2.z(z11);
                                }
                                q0Var2.n();
                                b60Var2.u();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        ci.w2 w2Var2 = new ci.w2(activity);
        this.H = w2Var2;
        w2Var2.setScaleType(scaleType);
        linearLayout.addView(w2Var2, w7.y5.n(44, 44));
        final int i12 = 1;
        w2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.w50
            public final /* synthetic */ b60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.p0 p0Var;
                ki.h0 h0Var;
                boolean z10;
                ki.p0 p0Var2;
                int i122;
                switch (i12) {
                    case 0:
                        b60 b60Var = this.b;
                        kj0 kj0Var = b60Var.V;
                        ki.q0 q0Var = b60Var.M;
                        if (q0Var != null && (p0Var = b60Var.O) != null && (h0Var = b60Var.P) != null && p0Var.a == 3 && !p0Var.e) {
                            ki.i0 i0Var = h0Var.a;
                            ki.i0 i0Var2 = ki.i0.a;
                            if (i0Var == i0Var2) {
                                i0Var2 = ki.i0.b;
                            }
                            q0Var.getClass();
                            ki.q0.s();
                            int i13 = q0Var.U;
                            if (i13 != 7 && i13 != 8 && i13 != 9 && i13 != 10) {
                                if (q0Var.o != i0Var2) {
                                    q0Var.l.b("camera facing requested: " + q0Var.o + " -> " + i0Var2 + ", state=" + hg.k0.C(q0Var.U));
                                    q0Var.o = i0Var2;
                                    int i14 = q0Var.U;
                                    if (i14 == 3 || i14 == 2) {
                                        q0Var.d();
                                        ki.h hVar = q0Var.k;
                                        hVar.B = i0Var2;
                                        Handler handler = hVar.n;
                                        if (!hVar.R || handler == null) {
                                            z10 = false;
                                        } else {
                                            handler.post(new gg.x1(27, hVar, i0Var2));
                                            z10 = true;
                                        }
                                        q0Var.v = z10;
                                    }
                                    q0Var.m();
                                    q0Var.n();
                                }
                                kj0Var.M(0);
                                kj0Var.start();
                                break;
                            }
                        }
                        break;
                    default:
                        b60 b60Var2 = this.b;
                        ki.q0 q0Var2 = b60Var2.M;
                        if (q0Var2 != null && (p0Var2 = b60Var2.O) != null && b60Var2.P != null) {
                            boolean z11 = !p0Var2.f;
                            ki.h hVar2 = q0Var2.k;
                            ki.q0.s();
                            if (q0Var2.U == 3 && !q0Var2.v && (i122 = q0Var2.V) != 1) {
                                q0Var2.t = z11;
                                if (i122 == 3) {
                                    q0Var2.t(z11);
                                    hVar2.z(false);
                                } else {
                                    q0Var2.t(false);
                                    hVar2.z(z11);
                                }
                                q0Var2.n();
                                b60Var2.u();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        int dp = AndroidUtilities.dp(24.0f);
        this.L = dp;
        kj0 kj0Var = new kj0(R.raw.roundcamera_flip, dp, dp);
        this.V = kj0Var;
        kj0Var.setCallback(w2Var);
        kj0Var.M(kj0Var.e[0] - 1);
        w2Var.setImageDrawable(kj0Var);
        u();
        if (f6Var != null && !f6Var.a()) {
            w2Var.setInvert(0.6f);
            w2Var2.setInvert(0.6f);
        }
        ImageView imageView = new ImageView(activity);
        this.I = imageView;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.video_mute);
        imageView.setAlpha(0.0f);
        addView(imageView, w7.y5.e(48, 48, 17));
        y50Var.setOnTouchListener(new vr(this, 1));
        super.setVisibility(4);
    }

    private long getCurrentDurationMs() {
        ki.p0 p0Var;
        ki.q0 q0Var = this.M;
        if (q0Var == null || (p0Var = this.O) == null) {
            return 0L;
        }
        return p0Var.a == 3 ? q0Var.i() : p0Var.b;
    }

    public static void k(b60 b60Var) {
        ki.h0 h0Var;
        ki.p0 p0Var = b60Var.O;
        boolean z10 = false;
        boolean z11 = (p0Var == null || p0Var.a != 3 || p0Var.e) ? false : true;
        b60Var.G.setEnabled(z11);
        ci.w2 w2Var = b60Var.H;
        if (z11 && (h0Var = b60Var.P) != null && h0Var.b != 1) {
            z10 = true;
        }
        w2Var.setEnabled(z10);
        b60Var.u();
    }

    public static void l(b60 b60Var) {
        org.telegram.ui.kl klVar = b60Var.E;
        if (b60Var.h0) {
            b60Var.h0 = false;
            klVar.invalidate();
            klVar.animate().cancel();
            klVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecordingUiFrameClockActive(boolean z10) {
        org.telegram.ui.mk mkVar;
        if (z10 == this.w0) {
            return;
        }
        this.w0 = z10;
        this.v0 = 0L;
        xp xpVar = this.y0;
        if (z10) {
            yf.h.d().a(30, xpVar);
        } else {
            yf.h.d().f(xpVar);
        }
        if (this.d == z10) {
            return;
        }
        this.d = z10;
        f60 f60Var = this.c;
        if (f60Var == null || (mkVar = ((org.telegram.ui.qj) f60Var).a.Y) == null) {
            return;
        }
        mkVar.setRoundVideoUiFrameClockActive(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenFlashEnabled(boolean z10) {
        Activity parentActivity = this.f.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        ci.y2 y2Var = this.J;
        if (z10) {
            if (Float.isNaN(this.t0)) {
                this.t0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            y2Var.c(null);
        } else {
            if (!Float.isNaN(this.t0)) {
                attributes.screenBrightness = this.t0;
                this.t0 = Float.NaN;
            }
            y2Var.d();
        }
        parentActivity.getWindow().setAttributes(attributes);
    }

    @Override // org.telegram.ui.Components.h60
    public final void a(boolean z10) {
        if (this.M == null) {
            return;
        }
        q(z10 ? 0 : 6);
        this.M.a();
        r01 r01Var = this.Q;
        if (r01Var != null) {
            r01Var.b(true);
        }
        this.Q = null;
        MediaController.getInstance().requestRecordAudioFocus(false);
        s(false, false);
    }

    @Override // org.telegram.ui.Components.h60
    public final void b(float f7, int i10) {
        ki.p0 p0Var;
        i2.e0 e0Var;
        if (this.M == null || (p0Var = this.O) == null || p0Var.a != 5) {
            return;
        }
        n();
        if (i10 == 0) {
            this.M.p();
            return;
        }
        if (i10 == 1) {
            ki.q0 q0Var = this.M;
            q0Var.getClass();
            ki.q0.s();
            if (q0Var.U != 5 || (e0Var = q0Var.Q) == null) {
                return;
            }
            e0Var.e();
            q0Var.w(false);
            x50 x50Var = q0Var.c;
            q0Var.Q.J0();
            x50Var.getClass();
            return;
        }
        if (i10 == 2) {
            ki.q0 q0Var2 = this.M;
            long j3 = (long) (f7 * this.O.b);
            q0Var2.getClass();
            ki.q0.s();
            if (q0Var2.U != 5 || q0Var2.Q == null) {
                return;
            }
            long j10 = q0Var2.F;
            q0Var2.Q.W0(5, Math.max(j10, Math.min(Math.max(j10, q0Var2.G - 1), j3)));
            q0Var2.c.getClass();
        }
    }

    @Override // org.telegram.ui.Components.h60
    public final void c(boolean z10) {
        setRecordingUiFrameClockActive(false);
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ki.q0 q0Var = this.M;
        if (q0Var != null) {
            ki.q0.s();
            int i10 = q0Var.U;
            if (i10 == 10) {
                if (!q0Var.B) {
                    q0Var.h();
                }
            } else if (i10 != 8) {
                q0Var.a();
            } else {
                q0Var.d();
                q0Var.q();
                q0Var.k.t();
                q0Var.B = true;
                q0Var.u(10);
                q0Var.l("released");
                q0Var.h.removeCallbacksAndMessages(null);
                q0Var.i.shutdown();
                q0Var.j.shutdown();
            }
            this.M = null;
        }
        r01 r01Var = this.Q;
        if (r01Var != null) {
            r01Var.b(true ^ this.f0);
            this.Q = null;
        }
        setScreenFlashEnabled(false);
        MediaController.getInstance().requestRecordAudioFocus(false);
        t();
        z50 z50Var = this.v;
        z50Var.setTranslationX(0.0f);
        this.m0 = 0.0f;
        z50Var.setTranslationY(0.0f + this.l0);
        z50Var.setImageReceiver(null);
        MediaController.getInstance().resumeByRewind();
    }

    @Override // org.telegram.ui.Components.h60
    public final boolean d() {
        ki.p0 p0Var = this.O;
        if (p0Var == null) {
            return false;
        }
        int i10 = p0Var.a;
        return i10 == 4 || i10 == 5 || i10 == 6;
    }

    @Override // org.telegram.ui.Components.h60
    public final void e(float f7) {
        float f10 = f7 * 0.5f;
        this.l0 = f10;
        this.v.setTranslationY(this.m0 + f10);
    }

    @Override // org.telegram.ui.Components.h60
    public final void f(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        ki.p0 p0Var;
        ki.q0 q0Var = this.M;
        if (q0Var == null || (p0Var = this.O) == null) {
            return;
        }
        if (i10 == 3) {
            if (q0Var == null || p0Var == null || p0Var.a != 3) {
                return;
            }
            q(2);
            this.M.o();
            return;
        }
        if (i10 == 1 || i10 == 4) {
            long currentDurationMs = getCurrentDurationMs();
            if (currentDurationMs < 800) {
                NotificationCenter.getInstance(this.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.n), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                a(false);
                return;
            }
            if (this.O.a == 3) {
                q(5);
            } else {
                n();
            }
            this.S = new a60(j3, i11, i12, z10, j10);
            ki.q0 q0Var2 = this.M;
            boolean z11 = this.e0;
            boolean z12 = !z11;
            q0Var2.getClass();
            ki.q0.s();
            int i13 = q0Var2.U;
            if (i13 == 3 || i13 == 5) {
                q0Var2.l.b("finish requested: state=" + hg.k0.C(q0Var2.U) + ", includeAudio=" + z12 + ", durationMs=" + q0Var2.i() + ", trim=" + q0Var2.F + ".." + q0Var2.G);
                q0Var2.y = z12;
                if (q0Var2.U != 3) {
                    q0Var2.q();
                    q0Var2.u(7);
                    q0Var2.i.execute(new ki.d0(q0Var2, q0Var2.O, q0Var2.k() || z11, q0Var2.P, z12, q0Var2.k() ? 1 : 2, q0Var2.N));
                    return;
                }
                q0Var2.D = q0Var2.i();
                q0Var2.x = true;
                q0Var2.d();
                q0Var2.h.removeCallbacks(q0Var2.R);
                q0Var2.u(7);
                boolean E = q0Var2.k.E();
                q0Var2.A = E;
                if (E) {
                    return;
                }
                q0Var2.g(new IllegalStateException("Unable to stop the camera segment"));
            }
        }
    }

    @Override // org.telegram.ui.Components.h60
    public final void g(ah.c cVar, org.telegram.ui.jj jjVar) {
        LinearLayout linearLayout = this.F;
        ch.d c10 = cVar.c(linearLayout, jjVar, false);
        c10.p(AndroidUtilities.dp(6.0f));
        c10.q(AndroidUtilities.dp(21.0f));
        linearLayout.setBackground(c10);
    }

    @Override // org.telegram.ui.Components.h60
    public View getButtonsLayout() {
        return this.F;
    }

    @Override // org.telegram.ui.Components.h60
    public e60 getCameraContainer() {
        return this.v;
    }

    @Override // org.telegram.ui.Components.h60
    public RectF getCameraRect() {
        y50 y50Var = this.y;
        int[] iArr = this.K;
        y50Var.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], y50Var.getWidth() + r3, y50Var.getHeight() + iArr[1]);
    }

    @Override // org.telegram.ui.Components.h60
    public View getMuteImageView() {
        return this.I;
    }

    @Override // org.telegram.ui.Components.h60
    public Paint getPaint() {
        return this.w.getPaint();
    }

    @Override // org.telegram.ui.Components.h60
    public TextureView getTextureView() {
        return this.y;
    }

    @Override // org.telegram.ui.Components.h60
    public final void h(boolean z10) {
        if (this.M != null) {
            return;
        }
        setVisibility(0);
        this.w.getPaint().setAlpha(255);
        this.f0 = false;
        this.e0 = false;
        this.b0 = false;
        this.d0 = false;
        this.k0 = 0L;
        this.w.setProgress(0.0f);
        org.telegram.ui.kl klVar = this.E;
        if (!this.h0) {
            if (this.j0 == null) {
                try {
                    this.j0 = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.j0;
            if (bitmap != null) {
                klVar.setImageBitmap(bitmap);
            } else {
                klVar.setImageResource(R.drawable.icplaceholder);
            }
            this.h0 = true;
            klVar.animate().cancel();
            klVar.setAlpha(1.0f);
            klVar.invalidate();
        }
        this.Q = new r01(this.h, this.r);
        this.N = SharedSettings.roundVideoOutputResolution.get();
        ki.g0 g0Var = new ki.g0(getContext(), this.y);
        g0Var.c = SharedSettings.roundVideoLastCamera.get();
        g0Var.d = this.N;
        g0Var.g = SharedSettings.roundVideoVideoBitrate.get();
        g0Var.e = SharedSettings.roundVideoCameraResolution.get();
        g0Var.f = SharedSettings.roundVideoFrameRate.get();
        g0Var.h = SharedSettings.roundVideoComposition.get();
        x50 x50Var = this.z0;
        g0Var.i = x50Var;
        r01 r01Var = this.Q;
        g0Var.j = r01Var;
        g0Var.k = new mv(this, 6);
        if (g0Var.c == null) {
            throw new IllegalStateException("Initial camera is required");
        }
        if (g0Var.d == null) {
            throw new IllegalStateException("Output resolution is required");
        }
        if (g0Var.g <= 0) {
            throw new IllegalStateException("Video bitrate is required");
        }
        if (g0Var.e == null) {
            throw new IllegalStateException("Camera resolution is required");
        }
        if (g0Var.f == null) {
            throw new IllegalStateException("Frame rate is required");
        }
        if (x50Var == null) {
            throw new IllegalStateException("Session listener is required");
        }
        if (r01Var == null) {
            throw new IllegalStateException("Output listener is required");
        }
        this.M = new ki.q0(g0Var);
        MediaController.getInstance().requestRecordAudioFocus(true);
        ki.q0 q0Var = this.M;
        q0Var.getClass();
        ki.q0.s();
        if (q0Var.U == 1) {
            try {
                q0Var.l.b("start requested");
                q0Var.c(true);
                q0Var.u(2);
                q0Var.k.D(q0Var.O, 0L, q0Var.o);
            } catch (Exception e) {
                q0Var.g(e);
            }
        }
        s(true, false);
    }

    @Override // org.telegram.ui.Components.h60
    public final void i() {
        ki.p0 p0Var;
        ki.q0 q0Var = this.M;
        if (q0Var == null || (p0Var = this.O) == null) {
            return;
        }
        int i10 = p0Var.a;
        if (i10 == 3) {
            if (q0Var == null || p0Var == null || i10 != 3) {
                return;
            }
            q(2);
            this.M.o();
            return;
        }
        if (i10 == 5) {
            this.R = null;
            this.c0 = true;
            this.d0 = false;
            ki.q0.s();
            if (q0Var.U != 5 || q0Var.G - q0Var.F >= q0Var.n) {
                return;
            }
            q0Var.K++;
            q0Var.l.b("resume requested: trim=" + q0Var.F + ".." + q0Var.G + ", sourceDurationMs=" + q0Var.D);
            q0Var.q();
            q0Var.u(6);
            q0Var.i.execute(new ci.u1(q0Var, q0Var.k(), q0Var.O, q0Var.N, q0Var.P));
        }
    }

    public final void n() {
        ki.p0 p0Var;
        VideoEditedInfo videoEditedInfo;
        if (this.M == null || (p0Var = this.O) == null || (videoEditedInfo = this.R) == null) {
            return;
        }
        long j3 = p0Var.b;
        long max = Math.max(0L, videoEditedInfo.startTime);
        long j10 = this.R.endTime;
        if (j10 >= 0) {
            j3 = Math.min(j3, j10);
        }
        ki.q0 q0Var = this.M;
        q0Var.getClass();
        ki.q0.s();
        if (q0Var.U != 5) {
            return;
        }
        long max2 = Math.max(0L, Math.min(q0Var.D, max));
        long max3 = Math.max(max2, Math.min(q0Var.D, j3));
        if (max3 - max2 < Math.min(800L, q0Var.D)) {
            return;
        }
        q0Var.F = max2;
        q0Var.G = max3;
        i2.e0 e0Var = q0Var.Q;
        if (e0Var != null) {
            e0Var.W0(5, max2);
        }
        q0Var.c.getClass();
        q0Var.n();
    }

    public final VideoEditedInfo o(File file, long j3, q01 q01Var) {
        ki.k0 k0Var;
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.startTime = -1L;
        videoEditedInfo.endTime = -1L;
        videoEditedInfo.estimatedDuration = j3;
        videoEditedInfo.estimatedSize = Math.max(1L, q01Var == null ? file.length() : q01Var.a);
        videoEditedInfo.roundVideo = true;
        ki.q0 q0Var = this.M;
        videoEditedInfo.framerate = (q0Var == null || (k0Var = q0Var.r) == null) ? 30 : k0Var.a;
        ki.o0 o0Var = this.N;
        int i10 = o0Var == null ? 480 : o0Var.a;
        videoEditedInfo.originalWidth = i10;
        videoEditedInfo.resultWidth = i10;
        videoEditedInfo.originalHeight = i10;
        videoEditedInfo.resultHeight = i10;
        videoEditedInfo.originalPath = file.getAbsolutePath();
        if (q01Var != null) {
            videoEditedInfo.file = q01Var.b;
            videoEditedInfo.encryptedFile = q01Var.c;
            videoEditedInfo.key = q01Var.d;
            videoEditedInfo.iv = q01Var.e;
        }
        return videoEditedInfo;
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
        if (this.u0 != i12) {
            this.u0 = i12;
            z50 z50Var = this.v;
            z50Var.getLayoutParams().width = AndroidUtilities.dp(28.0f) + i12;
            z50Var.getLayoutParams().height = AndroidUtilities.dp(28.0f) + i12;
            ((FrameLayout.LayoutParams) this.I.getLayoutParams()).topMargin = (i12 / 2) - AndroidUtilities.dp(24.0f);
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30);
        ci.y2 y2Var = this.J;
        y2Var.b.measure(makeMeasureSpec, makeMeasureSpec2);
        y2Var.c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return motionEvent.getAction() != 0 || motionEvent.getY() <= ((float) (getMeasuredHeight() - getPaddingBottom()));
    }

    public final void p() {
        if (this.r0) {
            this.r0 = false;
            this.p0 = -1;
            this.q0 = -1;
            if (this.M == null) {
                return;
            }
            ValueAnimator valueAnimator = this.U;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.o0, 0.0f);
            this.U = ofFloat;
            ofFloat.setDuration(350L);
            this.U.addUpdateListener(new v50(this, 1));
            this.U.start();
        }
    }

    public final void q(int i10) {
        if (this.d0 && i10 == 2) {
            return;
        }
        this.d0 = true;
        NotificationCenter.getInstance(this.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.n), Integer.valueOf(i10));
    }

    public final void r(boolean z10) {
        Bitmap bitmap;
        y50 y50Var = this.y;
        if (y50Var.isAvailable() && (bitmap = y50Var.getBitmap()) != null) {
            try {
                if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2) != 0) {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 180, 180, true);
                    if (bitmap != createScaledBitmap) {
                    }
                    if (createScaledBitmap == null) {
                        return;
                    }
                    try {
                        Utilities.stackBlurBitmap(createScaledBitmap, 15);
                        Bitmap bitmap2 = this.j0;
                        this.j0 = createScaledBitmap;
                        if (bitmap2 != null && bitmap2 != createScaledBitmap && !bitmap2.isRecycled()) {
                            bitmap2.recycle();
                        }
                        if (z10) {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg"));
                                try {
                                    createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                                    fileOutputStream.close();
                                } finally {
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    } finally {
                        if (createScaledBitmap != this.j0) {
                            createScaledBitmap.recycle();
                        }
                    }
                }
            } finally {
                bitmap.recycle();
            }
        }
    }

    public final void s(boolean z10, boolean z11) {
        d60 d60Var = this.a;
        if (d60Var != null) {
            ((org.telegram.ui.qe) d60Var).b.uc.a(z10, true);
        }
        AnimatorSet animatorSet = this.T;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.T.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z10);
        }
        z50 z50Var = this.v;
        if (z10 && !this.g0) {
            z50Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.m0 = measuredHeight;
            z50Var.setTranslationY(measuredHeight + this.l0);
        }
        this.g0 = z10;
        View view = this.s;
        if (view != null) {
            view.invalidate();
        }
        float dp = (z10 || Math.max(getCurrentDurationMs(), this.k0) <= 300) ? 0.0f : AndroidUtilities.dp(24.0f) - (getMeasuredWidth() * 0.5f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 1.0f : 0.0f, z10 ? 0.0f : 1.0f);
        ofFloat.addUpdateListener(new v50(this, 0));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.T = animatorSet2;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        LinearLayout linearLayout = this.F;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, fArr), ObjectAnimator.ofFloat(z50Var, (Property<z50, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(z50Var, (Property<z50, Float>) View.SCALE_X, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(z50Var, (Property<z50, Float>) View.SCALE_Y, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(z50Var, (Property<z50, Float>) View.TRANSLATION_X, dp), ObjectAnimator.ofFloat(this.I, (Property<ImageView, Float>) property, (this.e0 && z10) ? 1.0f : 0.0f), ofFloat);
        this.T.setDuration(180L);
        this.T.setInterpolator(new DecelerateInterpolator());
        if (z10) {
            setTranslationX(0.0f);
        } else {
            this.T.addListener(new q8(this, 24));
        }
        this.T.start();
    }

    @Override // org.telegram.ui.Components.h60
    public void setInternalPadding(int i10) {
        setPadding(0, 0, 0, i10);
    }

    @Override // org.telegram.ui.Components.h60
    public void setIsMessageTransition(boolean z10) {
        this.v.getClass();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.F.setAlpha(0.0f);
        z50 z50Var = this.v;
        z50Var.setAlpha(0.0f);
        z50Var.setScaleX(0.1f);
        z50Var.setScaleY(0.1f);
        z50Var.setTranslationX(0.0f);
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

    public final void t() {
        if (this.s0) {
            this.s0 = false;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
        }
    }

    public final void u() {
        ki.p0 p0Var = this.O;
        int i10 = this.L;
        ci.w2 w2Var = this.H;
        if (p0Var == null || !p0Var.f) {
            if (this.W == null) {
                kj0 kj0Var = new kj0(R.raw.roundcamera_flash_on, i10, i10);
                this.W = kj0Var;
                kj0Var.setCallback(w2Var);
            }
            w2Var.setImageDrawable(this.W);
            return;
        }
        if (this.a0 == null) {
            kj0 kj0Var2 = new kj0(R.raw.roundcamera_flash_off, i10, i10);
            this.a0 = kj0Var2;
            kj0Var2.setCallback(w2Var);
        }
        w2Var.setImageDrawable(this.a0);
    }

    public final void v() {
        org.telegram.ui.mk mkVar;
        ki.p0 p0Var = this.O;
        if (p0Var != null) {
            long j3 = p0Var.d;
            if (p0Var.a != 3) {
                return;
            }
            long min = Math.min(j3, (SystemClock.elapsedRealtime() + p0Var.b) - p0Var.c);
            this.k0 = min;
            this.w.setProgress(min / j3);
            f60 f60Var = this.c;
            if (f60Var == null || (mkVar = ((org.telegram.ui.qj) f60Var).a.Y) == null || !mkVar.j1) {
                return;
            }
            mkVar.i1 = min;
            wg wgVar = mkVar.Y0;
            if (wgVar != null && wgVar.r) {
                wgVar.h = min;
                wgVar.invalidate();
            }
            tg tgVar = mkVar.l1;
            if (tgVar != null && tgVar.n) {
                if (!tgVar.h) {
                    long j10 = tgVar.r;
                    if (j10 >= 0) {
                        if (!tgVar.e) {
                            long max = Math.max(0L, min - j10) % 1200;
                            tgVar.a = max < 600 ? 1.0f - (max / 600.0f) : (max - 600) / 600.0f;
                        }
                        tgVar.invalidate();
                    }
                }
                tgVar.r = min;
                tgVar.a = 1.0f;
                tgVar.invalidate();
            }
            ChatActivityEnterView.SlideTextView slideTextView = mkVar.k1;
            if (slideTextView == null || !slideTextView.J || slideTextView.n == 1.0f) {
                return;
            }
            slideTextView.invalidate();
        }
    }
}
