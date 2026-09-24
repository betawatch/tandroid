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
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class b60 extends h60 {
    public final org.telegram.ui.il E;
    public final LinearLayout F;
    public final ci.v2 G;
    public final ci.v2 H;
    public final ImageView I;
    public final ci.x2 J;
    public final int[] K;
    public final int L;
    public ki.r0 M;
    public ki.p0 N;
    public ki.q0 O;
    public ki.j0 P;
    public o01 Q;
    public VideoEditedInfo R;
    public a60 S;
    public AnimatorSet T;
    public ValueAnimator U;
    public final ij0 V;
    public ij0 W;
    public ij0 a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;
    public boolean e0;
    public final o50 f;
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
    public final im0 w;
    public boolean w0;
    public final FrameLayout x;
    public boolean x0;
    public final y50 y;
    public final yp y0;
    public final l.d z0;

    public b60(Activity activity, o50 o50Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.h = UserConfig.selectedAccount;
        this.K = new int[2];
        this.p0 = -1;
        this.q0 = -1;
        this.t0 = Float.NaN;
        this.y0 = new yp(this, 25);
        this.z0 = new l.d(this);
        this.f = o50Var;
        this.n = o50Var.getClassGuid();
        this.r = o50Var.v();
        this.s = o50Var.getFragmentView();
        setWillNotDraw(false);
        ci.x2 x2Var = new ci.x2(activity, null, this, null);
        this.J = x2Var;
        x2Var.o = 0.5f;
        x2Var.n = ci.x2.f(0.5f);
        x2Var.g();
        addView(x2Var.b, w7.y5.e(-1, -1, 119));
        z50 z50Var = new z50(this, activity);
        this.v = z50Var;
        im0 im0Var = new im0(activity);
        this.w = im0Var;
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
        org.telegram.ui.il ilVar = new org.telegram.ui.il(this, activity, paint);
        this.E = ilVar;
        ilVar.setOutlineProvider(new ai.k2(12));
        ilVar.setClipToOutline(true);
        frameLayout.addView(ilVar, w7.y5.e(-1, -1, 119));
        im0Var.addView(frameLayout, w7.y5.d(-1, -1.0f, 119, 14.0f, 14.0f, 14.0f, 14.0f));
        z50Var.addView(im0Var, w7.y5.e(-1, -1, 119));
        int i10 = AndroidUtilities.roundPlayingMessageSize;
        addView(z50Var, new FrameLayout.LayoutParams(i10, i10, 17));
        addView(x2Var.c, w7.y5.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.F = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        addView(linearLayout, w7.y5.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ci.v2 v2Var = new ci.v2(activity);
        this.G = v2Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        v2Var.setScaleType(scaleType);
        v2Var.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        linearLayout.addView(v2Var, w7.y5.n(44, 44));
        final int i11 = 0;
        v2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.x50
            public final /* synthetic */ b60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.q0 q0Var;
                ki.j0 j0Var;
                boolean z10;
                ki.q0 q0Var2;
                int i12;
                switch (i11) {
                    case 0:
                        b60 b60Var = this.b;
                        ki.r0 r0Var = b60Var.M;
                        if (r0Var != null && (q0Var = b60Var.O) != null && (j0Var = b60Var.P) != null && q0Var.a == 3 && !q0Var.e) {
                            ki.k0 k0Var = j0Var.a;
                            ki.k0 k0Var2 = ki.k0.a;
                            if (k0Var == k0Var2) {
                                k0Var2 = ki.k0.b;
                            }
                            r0Var.getClass();
                            ki.r0.s();
                            int i13 = r0Var.V;
                            if (i13 != 7 && i13 != 8 && i13 != 9 && i13 != 10) {
                                if (r0Var.o != k0Var2) {
                                    r0Var.l.b("camera facing requested: " + r0Var.o + " -> " + k0Var2 + ", state=" + hg.c.C(r0Var.V));
                                    r0Var.o = k0Var2;
                                    int i14 = r0Var.V;
                                    if (i14 == 3 || i14 == 2) {
                                        r0Var.d();
                                        ki.h hVar = r0Var.k;
                                        hVar.B = k0Var2;
                                        Handler handler = hVar.n;
                                        if (!hVar.R || handler == null) {
                                            z10 = false;
                                        } else {
                                            handler.post(new gg.x1(27, hVar, k0Var2));
                                            z10 = true;
                                        }
                                        r0Var.v = z10;
                                    }
                                    r0Var.m();
                                    r0Var.n();
                                }
                                b60Var.V.M(0);
                                b60Var.V.start();
                                break;
                            }
                        }
                        break;
                    default:
                        b60 b60Var2 = this.b;
                        ki.r0 r0Var2 = b60Var2.M;
                        if (r0Var2 != null && (q0Var2 = b60Var2.O) != null && b60Var2.P != null) {
                            boolean z11 = !q0Var2.f;
                            ki.h hVar2 = r0Var2.k;
                            ki.r0.s();
                            if (r0Var2.V == 3 && !r0Var2.v && (i12 = r0Var2.W) != 1) {
                                r0Var2.t = z11;
                                if (i12 == 3) {
                                    r0Var2.t(z11);
                                    hVar2.x(false);
                                } else {
                                    r0Var2.t(false);
                                    hVar2.x(z11);
                                }
                                r0Var2.n();
                                b60Var2.u();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        ci.v2 v2Var2 = new ci.v2(activity);
        this.H = v2Var2;
        v2Var2.setScaleType(scaleType);
        linearLayout.addView(v2Var2, w7.y5.n(44, 44));
        final int i12 = 1;
        v2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.x50
            public final /* synthetic */ b60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.q0 q0Var;
                ki.j0 j0Var;
                boolean z10;
                ki.q0 q0Var2;
                int i122;
                switch (i12) {
                    case 0:
                        b60 b60Var = this.b;
                        ki.r0 r0Var = b60Var.M;
                        if (r0Var != null && (q0Var = b60Var.O) != null && (j0Var = b60Var.P) != null && q0Var.a == 3 && !q0Var.e) {
                            ki.k0 k0Var = j0Var.a;
                            ki.k0 k0Var2 = ki.k0.a;
                            if (k0Var == k0Var2) {
                                k0Var2 = ki.k0.b;
                            }
                            r0Var.getClass();
                            ki.r0.s();
                            int i13 = r0Var.V;
                            if (i13 != 7 && i13 != 8 && i13 != 9 && i13 != 10) {
                                if (r0Var.o != k0Var2) {
                                    r0Var.l.b("camera facing requested: " + r0Var.o + " -> " + k0Var2 + ", state=" + hg.c.C(r0Var.V));
                                    r0Var.o = k0Var2;
                                    int i14 = r0Var.V;
                                    if (i14 == 3 || i14 == 2) {
                                        r0Var.d();
                                        ki.h hVar = r0Var.k;
                                        hVar.B = k0Var2;
                                        Handler handler = hVar.n;
                                        if (!hVar.R || handler == null) {
                                            z10 = false;
                                        } else {
                                            handler.post(new gg.x1(27, hVar, k0Var2));
                                            z10 = true;
                                        }
                                        r0Var.v = z10;
                                    }
                                    r0Var.m();
                                    r0Var.n();
                                }
                                b60Var.V.M(0);
                                b60Var.V.start();
                                break;
                            }
                        }
                        break;
                    default:
                        b60 b60Var2 = this.b;
                        ki.r0 r0Var2 = b60Var2.M;
                        if (r0Var2 != null && (q0Var2 = b60Var2.O) != null && b60Var2.P != null) {
                            boolean z11 = !q0Var2.f;
                            ki.h hVar2 = r0Var2.k;
                            ki.r0.s();
                            if (r0Var2.V == 3 && !r0Var2.v && (i122 = r0Var2.W) != 1) {
                                r0Var2.t = z11;
                                if (i122 == 3) {
                                    r0Var2.t(z11);
                                    hVar2.x(false);
                                } else {
                                    r0Var2.t(false);
                                    hVar2.x(z11);
                                }
                                r0Var2.n();
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
        ij0 ij0Var = new ij0(R.raw.roundcamera_flip, dp, dp);
        this.V = ij0Var;
        ij0Var.setCallback(v2Var);
        ij0Var.M(ij0Var.e[0] - 1);
        v2Var.setImageDrawable(ij0Var);
        u();
        if (d6Var != null && !d6Var.a()) {
            v2Var.setInvert(0.6f);
            v2Var2.setInvert(0.6f);
        }
        ImageView imageView = new ImageView(activity);
        this.I = imageView;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.video_mute);
        imageView.setAlpha(0.0f);
        addView(imageView, w7.y5.e(48, 48, 17));
        y50Var.setOnTouchListener(new wr(this, 1));
        super.setVisibility(4);
    }

    private long getCurrentDurationMs() {
        ki.q0 q0Var;
        ki.r0 r0Var = this.M;
        if (r0Var == null || (q0Var = this.O) == null) {
            return 0L;
        }
        return q0Var.a == 3 ? r0Var.i() : q0Var.b;
    }

    public static void k(b60 b60Var) {
        ki.j0 j0Var;
        ki.q0 q0Var = b60Var.O;
        boolean z10 = false;
        boolean z11 = (q0Var == null || q0Var.a != 3 || q0Var.e) ? false : true;
        b60Var.G.setEnabled(z11);
        ci.v2 v2Var = b60Var.H;
        if (z11 && (j0Var = b60Var.P) != null && j0Var.b != 1) {
            z10 = true;
        }
        v2Var.setEnabled(z10);
        b60Var.u();
    }

    public static void l(b60 b60Var) {
        org.telegram.ui.il ilVar = b60Var.E;
        if (b60Var.h0) {
            b60Var.h0 = false;
            ilVar.invalidate();
            ilVar.animate().cancel();
            ilVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecordingUiFrameClockActive(boolean z10) {
        org.telegram.ui.jk jkVar;
        if (z10 == this.w0) {
            return;
        }
        this.w0 = z10;
        this.v0 = 0L;
        yp ypVar = this.y0;
        if (z10) {
            yf.h.d().a(30, ypVar);
        } else {
            yf.h.d().f(ypVar);
        }
        if (this.d == z10) {
            return;
        }
        this.d = z10;
        f60 f60Var = this.c;
        if (f60Var == null || (jkVar = ((org.telegram.ui.nj) f60Var).a.Y) == null) {
            return;
        }
        jkVar.setRoundVideoUiFrameClockActive(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenFlashEnabled(boolean z10) {
        Activity parentActivity = this.f.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        ci.x2 x2Var = this.J;
        if (z10) {
            if (Float.isNaN(this.t0)) {
                this.t0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            x2Var.c(null);
        } else {
            if (!Float.isNaN(this.t0)) {
                attributes.screenBrightness = this.t0;
                this.t0 = Float.NaN;
            }
            x2Var.d();
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
        o01 o01Var = this.Q;
        if (o01Var != null) {
            o01Var.d(true);
        }
        this.Q = null;
        MediaController.getInstance().requestRecordAudioFocus(false);
        s(false, false);
    }

    @Override // org.telegram.ui.Components.h60
    public final void b(float f7, int i10) {
        ki.q0 q0Var;
        i2.f0 f0Var;
        if (this.M == null || (q0Var = this.O) == null || q0Var.a != 5) {
            return;
        }
        n();
        if (i10 == 0) {
            this.M.p();
            return;
        }
        if (i10 == 1) {
            ki.r0 r0Var = this.M;
            r0Var.getClass();
            ki.r0.s();
            if (r0Var.V != 5 || (f0Var = r0Var.R) == null) {
                return;
            }
            f0Var.e();
            r0Var.w(false);
            l.d dVar = r0Var.c;
            r0Var.R.J0();
            dVar.getClass();
            return;
        }
        if (i10 == 2) {
            ki.r0 r0Var2 = this.M;
            long j3 = (long) (f7 * this.O.b);
            r0Var2.getClass();
            ki.r0.s();
            if (r0Var2.V != 5 || r0Var2.R == null) {
                return;
            }
            long j10 = r0Var2.F;
            r0Var2.R.W0(5, Math.max(j10, Math.min(Math.max(j10, r0Var2.G - 1), j3)));
            r0Var2.c.getClass();
        }
    }

    @Override // org.telegram.ui.Components.h60
    public final void c(boolean z10) {
        setRecordingUiFrameClockActive(false);
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ki.r0 r0Var = this.M;
        if (r0Var != null) {
            ki.r0.s();
            int i10 = r0Var.V;
            if (i10 == 10) {
                if (!r0Var.B) {
                    r0Var.h();
                }
            } else if (i10 != 8) {
                r0Var.a();
            } else {
                r0Var.d();
                r0Var.q();
                r0Var.k.r();
                r0Var.B = true;
                r0Var.u(10);
                r0Var.l("released");
                r0Var.h.removeCallbacksAndMessages(null);
                r0Var.i.shutdown();
                r0Var.j.shutdown();
            }
            this.M = null;
        }
        o01 o01Var = this.Q;
        if (o01Var != null) {
            o01Var.d(true ^ this.f0);
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
        ki.q0 q0Var = this.O;
        if (q0Var == null) {
            return false;
        }
        int i10 = q0Var.a;
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
        ki.q0 q0Var;
        ki.r0 r0Var = this.M;
        if (r0Var == null || (q0Var = this.O) == null) {
            return;
        }
        if (i10 == 3) {
            if (r0Var == null || q0Var == null || q0Var.a != 3) {
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
            ki.r0 r0Var2 = this.M;
            boolean z11 = this.e0;
            boolean z12 = !z11;
            r0Var2.getClass();
            ki.r0.s();
            int i13 = r0Var2.V;
            if (i13 == 3 || i13 == 5) {
                r0Var2.l.b("finish requested: state=" + hg.c.C(r0Var2.V) + ", includeAudio=" + z12 + ", durationMs=" + r0Var2.i() + ", trim=" + r0Var2.F + ".." + r0Var2.G);
                r0Var2.y = z12;
                if (r0Var2.V != 3) {
                    r0Var2.q();
                    r0Var2.u(7);
                    r0Var2.i.execute(new ki.g0(r0Var2, r0Var2.P, r0Var2.k() || z11, r0Var2.Q, z12, r0Var2.k() ? 1 : 2, r0Var2.O));
                    return;
                }
                r0Var2.D = r0Var2.i();
                r0Var2.x = true;
                r0Var2.d();
                r0Var2.h.removeCallbacks(r0Var2.S);
                r0Var2.u(7);
                boolean C = r0Var2.k.C();
                r0Var2.A = C;
                if (C) {
                    return;
                }
                r0Var2.g(new IllegalStateException("Unable to stop the camera segment"));
            }
        }
    }

    @Override // org.telegram.ui.Components.h60
    public final void g(ah.c cVar, org.telegram.ui.gj gjVar) {
        LinearLayout linearLayout = this.F;
        ch.d c10 = cVar.c(linearLayout, gjVar, false);
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
        org.telegram.ui.il ilVar = this.E;
        if (!this.h0) {
            if (this.j0 == null) {
                try {
                    this.j0 = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.j0;
            if (bitmap != null) {
                ilVar.setImageBitmap(bitmap);
            } else {
                ilVar.setImageResource(R.drawable.icplaceholder);
            }
            this.h0 = true;
            ilVar.animate().cancel();
            ilVar.setAlpha(1.0f);
            ilVar.invalidate();
        }
        this.Q = new o01(this.h, this.r);
        this.N = (ki.p0) pi.e.c.a();
        ki.i0 i0Var = new ki.i0(getContext(), this.y);
        i0Var.c = (ki.k0) pi.e.h.a();
        i0Var.d = this.N;
        i0Var.g = pi.e.f.a();
        i0Var.e = (ki.l0) pi.e.d.a();
        i0Var.f = (ki.m0) pi.e.e.a();
        i0Var.h = pi.e.g.a();
        l.d dVar = this.z0;
        i0Var.i = dVar;
        o01 o01Var = this.Q;
        i0Var.j = o01Var;
        i0Var.k = new nv(this, 6);
        if (i0Var.c == null) {
            throw new IllegalStateException("Initial camera is required");
        }
        if (i0Var.d == null) {
            throw new IllegalStateException("Output resolution is required");
        }
        if (i0Var.g <= 0) {
            throw new IllegalStateException("Video bitrate is required");
        }
        if (i0Var.e == null) {
            throw new IllegalStateException("Camera resolution is required");
        }
        if (i0Var.f == null) {
            throw new IllegalStateException("Frame rate is required");
        }
        if (dVar == null) {
            throw new IllegalStateException("Session listener is required");
        }
        if (o01Var == null) {
            throw new IllegalStateException("Output listener is required");
        }
        this.M = new ki.r0(i0Var);
        MediaController.getInstance().requestRecordAudioFocus(true);
        ki.r0 r0Var = this.M;
        r0Var.getClass();
        ki.r0.s();
        if (r0Var.V == 1) {
            try {
                r0Var.l.b("start requested");
                r0Var.c(true);
                r0Var.u(2);
                r0Var.k.B(r0Var.P, 0L, r0Var.o);
            } catch (Exception e) {
                r0Var.g(e);
            }
        }
        s(true, false);
    }

    @Override // org.telegram.ui.Components.h60
    public final void i() {
        ki.q0 q0Var;
        ki.r0 r0Var = this.M;
        if (r0Var == null || (q0Var = this.O) == null) {
            return;
        }
        int i10 = q0Var.a;
        if (i10 == 3) {
            if (r0Var == null || q0Var == null || i10 != 3) {
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
            ki.r0.s();
            if (r0Var.V != 5 || r0Var.G - r0Var.F >= r0Var.n) {
                return;
            }
            r0Var.L++;
            r0Var.l.b("resume requested: trim=" + r0Var.F + ".." + r0Var.G + ", sourceDurationMs=" + r0Var.D);
            r0Var.q();
            r0Var.u(6);
            r0Var.i.execute(new ci.u1(r0Var, r0Var.k(), r0Var.P, r0Var.O, r0Var.Q));
        }
    }

    public final void n() {
        ki.q0 q0Var;
        VideoEditedInfo videoEditedInfo;
        if (this.M == null || (q0Var = this.O) == null || (videoEditedInfo = this.R) == null) {
            return;
        }
        long j3 = q0Var.b;
        long max = Math.max(0L, videoEditedInfo.startTime);
        long j10 = this.R.endTime;
        if (j10 >= 0) {
            j3 = Math.min(j3, j10);
        }
        ki.r0 r0Var = this.M;
        r0Var.getClass();
        ki.r0.s();
        if (r0Var.V != 5) {
            return;
        }
        long max2 = Math.max(0L, Math.min(r0Var.D, max));
        long max3 = Math.max(max2, Math.min(r0Var.D, j3));
        if (max3 - max2 < Math.min(800L, r0Var.D)) {
            return;
        }
        r0Var.F = max2;
        r0Var.G = max3;
        i2.f0 f0Var = r0Var.R;
        if (f0Var != null) {
            f0Var.W0(5, max2);
        }
        r0Var.c.getClass();
        r0Var.n();
    }

    public final VideoEditedInfo o(File file, long j3, n01 n01Var) {
        ki.m0 m0Var;
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.startTime = -1L;
        videoEditedInfo.endTime = -1L;
        videoEditedInfo.estimatedDuration = j3;
        videoEditedInfo.estimatedSize = Math.max(1L, n01Var == null ? file.length() : n01Var.a);
        videoEditedInfo.roundVideo = true;
        ki.r0 r0Var = this.M;
        videoEditedInfo.framerate = (r0Var == null || (m0Var = r0Var.r) == null) ? 30 : m0Var.a;
        ki.p0 p0Var = this.N;
        int i10 = p0Var == null ? 480 : p0Var.a;
        videoEditedInfo.originalWidth = i10;
        videoEditedInfo.resultWidth = i10;
        videoEditedInfo.originalHeight = i10;
        videoEditedInfo.resultHeight = i10;
        videoEditedInfo.originalPath = file.getAbsolutePath();
        if (n01Var != null) {
            videoEditedInfo.file = n01Var.b;
            videoEditedInfo.encryptedFile = n01Var.c;
            videoEditedInfo.key = n01Var.d;
            videoEditedInfo.iv = n01Var.e;
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
        ci.x2 x2Var = this.J;
        x2Var.b.measure(makeMeasureSpec, makeMeasureSpec2);
        x2Var.c.measure(makeMeasureSpec, makeMeasureSpec2);
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
            this.U.addUpdateListener(new w50(this, 1));
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
            ((org.telegram.ui.pe) d60Var).b.uc.a(z10, true);
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
        ofFloat.addUpdateListener(new w50(this, 0));
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
            this.T.addListener(new r8(this, 24));
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
        ki.q0 q0Var = this.O;
        int i10 = this.L;
        ci.v2 v2Var = this.H;
        if (q0Var == null || !q0Var.f) {
            if (this.W == null) {
                ij0 ij0Var = new ij0(R.raw.roundcamera_flash_on, i10, i10);
                this.W = ij0Var;
                ij0Var.setCallback(v2Var);
            }
            v2Var.setImageDrawable(this.W);
            return;
        }
        if (this.a0 == null) {
            ij0 ij0Var2 = new ij0(R.raw.roundcamera_flash_off, i10, i10);
            this.a0 = ij0Var2;
            ij0Var2.setCallback(v2Var);
        }
        v2Var.setImageDrawable(this.a0);
    }

    public final void v() {
        org.telegram.ui.jk jkVar;
        ki.q0 q0Var = this.O;
        if (q0Var != null) {
            long j3 = q0Var.d;
            if (q0Var.a != 3) {
                return;
            }
            long min = Math.min(j3, (SystemClock.elapsedRealtime() + q0Var.b) - q0Var.c);
            this.k0 = min;
            this.w.setProgress(min / j3);
            f60 f60Var = this.c;
            if (f60Var == null || (jkVar = ((org.telegram.ui.nj) f60Var).a.Y) == null || !jkVar.j1) {
                return;
            }
            jkVar.i1 = min;
            xg xgVar = jkVar.Y0;
            if (xgVar != null && xgVar.r) {
                xgVar.h = min;
                xgVar.invalidate();
            }
            ug ugVar = jkVar.l1;
            if (ugVar != null && ugVar.n) {
                if (!ugVar.h) {
                    long j10 = ugVar.r;
                    if (j10 >= 0) {
                        if (!ugVar.e) {
                            long max = Math.max(0L, min - j10) % 1200;
                            ugVar.a = max < 600 ? 1.0f - (max / 600.0f) : (max - 600) / 600.0f;
                        }
                        ugVar.invalidate();
                    }
                }
                ugVar.r = min;
                ugVar.a = 1.0f;
                ugVar.invalidate();
            }
            ChatActivityEnterView.SlideTextView slideTextView = jkVar.k1;
            if (slideTextView == null || !slideTextView.J || slideTextView.n == 1.0f) {
                return;
            }
            slideTextView.invalidate();
        }
    }
}
