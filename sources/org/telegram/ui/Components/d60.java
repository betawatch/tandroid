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

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class d60 extends j60 {
    public boolean A0;
    public final zp B0;
    public final l.d C0;
    public final org.telegram.ui.il E;
    public final LinearLayout F;
    public final ci.v2 G;
    public final ci.v2 H;
    public final ImageView I;
    public final ci.x2 J;
    public final int[] K;
    public final Matrix L;
    public final float[] M;
    public final Paint N;
    public final int O;
    public ki.s0 P;
    public ki.q0 Q;
    public ki.r0 R;
    public ki.k0 S;
    public q01 T;
    public VideoEditedInfo U;
    public c60 V;
    public AnimatorSet W;
    public ValueAnimator a0;
    public final kj0 b0;
    public kj0 c0;
    public kj0 d0;
    public boolean e0;
    public final q50 f;
    public boolean f0;
    public boolean g0;
    public final int h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public Bitmap m0;
    public final int n;
    public long n0;
    public float o0;
    public float p0;
    public float q0;
    public final boolean r;
    public float r0;
    public final View s;
    public int s0;
    public int t0;
    public boolean u0;
    public final b60 v;
    public boolean v0;
    public final km0 w;
    public float w0;
    public final FrameLayout x;
    public int x0;
    public final a60 y;
    public long y0;
    public boolean z0;

    public d60(Activity activity, q50 q50Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.h = UserConfig.selectedAccount;
        this.K = new int[2];
        this.L = new Matrix();
        this.M = new float[9];
        this.N = new Paint(3);
        this.s0 = -1;
        this.t0 = -1;
        this.w0 = Float.NaN;
        this.B0 = new zp(this, 25);
        this.C0 = new l.d(this);
        this.f = q50Var;
        this.n = q50Var.getClassGuid();
        this.r = q50Var.v();
        this.s = q50Var.getFragmentView();
        setWillNotDraw(false);
        ci.x2 x2Var = new ci.x2(activity, null, this, null);
        this.J = x2Var;
        x2Var.o = 0.5f;
        x2Var.n = ci.x2.f(0.5f);
        x2Var.g();
        addView(x2Var.b, w7.y5.e(-1, -1, 119));
        b60 b60Var = new b60(this, activity);
        this.v = b60Var;
        km0 km0Var = new km0(activity);
        this.w = km0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.x = frameLayout;
        a60 a60Var = new a60(this, activity, 0);
        a60Var.setOpaque(true);
        a60Var.setClickable(true);
        a60Var.setCameraDistance(AndroidUtilities.dp(8000.0f));
        a60Var.setOutlineProvider(new ai.k2(13));
        a60Var.setClipToOutline(true);
        this.y = a60Var;
        frameLayout.addView(a60Var, w7.y5.e(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.il ilVar = new org.telegram.ui.il(this, activity, paint);
        this.E = ilVar;
        ilVar.setOutlineProvider(new ai.k2(12));
        ilVar.setClipToOutline(true);
        frameLayout.addView(ilVar, w7.y5.e(-1, -1, 119));
        km0Var.addView(frameLayout, w7.y5.d(-1, -1.0f, 119, 14.0f, 14.0f, 14.0f, 14.0f));
        b60Var.addView(km0Var, w7.y5.e(-1, -1, 119));
        int i10 = AndroidUtilities.roundPlayingMessageSize;
        addView(b60Var, new FrameLayout.LayoutParams(i10, i10, 17));
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
        v2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.z50
            public final /* synthetic */ d60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.r0 r0Var;
                ki.k0 k0Var;
                boolean z10;
                ki.r0 r0Var2;
                int i12;
                switch (i11) {
                    case 0:
                        d60 d60Var = this.b;
                        ki.s0 s0Var = d60Var.P;
                        if (s0Var != null && (r0Var = d60Var.R) != null && (k0Var = d60Var.S) != null && r0Var.a == 3 && !r0Var.e) {
                            ki.l0 l0Var = k0Var.a;
                            ki.l0 l0Var2 = ki.l0.a;
                            if (l0Var == l0Var2) {
                                l0Var2 = ki.l0.b;
                            }
                            s0Var.getClass();
                            ki.s0.t();
                            int i13 = s0Var.W;
                            if (i13 != 7 && i13 != 8 && i13 != 9 && i13 != 10) {
                                if (s0Var.p != l0Var2) {
                                    s0Var.m.b("camera facing requested: " + s0Var.p + " -> " + l0Var2 + ", state=" + hg.c.C(s0Var.W));
                                    s0Var.p = l0Var2;
                                    int i14 = s0Var.W;
                                    if (i14 == 3 || i14 == 2) {
                                        s0Var.e();
                                        ki.i iVar = s0Var.l;
                                        iVar.C = l0Var2;
                                        Handler handler = iVar.n;
                                        if (!iVar.S || handler == null) {
                                            z10 = false;
                                        } else {
                                            handler.post(new gg.x1(27, iVar, l0Var2));
                                            z10 = true;
                                        }
                                        s0Var.w = z10;
                                    }
                                    s0Var.n();
                                    s0Var.o();
                                }
                                d60Var.b0.M(0);
                                d60Var.b0.start();
                                break;
                            }
                        }
                        break;
                    default:
                        d60 d60Var2 = this.b;
                        ki.s0 s0Var2 = d60Var2.P;
                        if (s0Var2 != null && (r0Var2 = d60Var2.R) != null && d60Var2.S != null) {
                            boolean z11 = !r0Var2.f;
                            ki.i iVar2 = s0Var2.l;
                            ki.s0.t();
                            if (s0Var2.W == 3 && !s0Var2.w && (i12 = s0Var2.X) != 1) {
                                s0Var2.u = z11;
                                if (i12 == 3) {
                                    s0Var2.u(z11);
                                    iVar2.y(false);
                                } else {
                                    s0Var2.u(false);
                                    iVar2.y(z11);
                                }
                                s0Var2.o();
                                d60Var2.v();
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
        v2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.z50
            public final /* synthetic */ d60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.r0 r0Var;
                ki.k0 k0Var;
                boolean z10;
                ki.r0 r0Var2;
                int i122;
                switch (i12) {
                    case 0:
                        d60 d60Var = this.b;
                        ki.s0 s0Var = d60Var.P;
                        if (s0Var != null && (r0Var = d60Var.R) != null && (k0Var = d60Var.S) != null && r0Var.a == 3 && !r0Var.e) {
                            ki.l0 l0Var = k0Var.a;
                            ki.l0 l0Var2 = ki.l0.a;
                            if (l0Var == l0Var2) {
                                l0Var2 = ki.l0.b;
                            }
                            s0Var.getClass();
                            ki.s0.t();
                            int i13 = s0Var.W;
                            if (i13 != 7 && i13 != 8 && i13 != 9 && i13 != 10) {
                                if (s0Var.p != l0Var2) {
                                    s0Var.m.b("camera facing requested: " + s0Var.p + " -> " + l0Var2 + ", state=" + hg.c.C(s0Var.W));
                                    s0Var.p = l0Var2;
                                    int i14 = s0Var.W;
                                    if (i14 == 3 || i14 == 2) {
                                        s0Var.e();
                                        ki.i iVar = s0Var.l;
                                        iVar.C = l0Var2;
                                        Handler handler = iVar.n;
                                        if (!iVar.S || handler == null) {
                                            z10 = false;
                                        } else {
                                            handler.post(new gg.x1(27, iVar, l0Var2));
                                            z10 = true;
                                        }
                                        s0Var.w = z10;
                                    }
                                    s0Var.n();
                                    s0Var.o();
                                }
                                d60Var.b0.M(0);
                                d60Var.b0.start();
                                break;
                            }
                        }
                        break;
                    default:
                        d60 d60Var2 = this.b;
                        ki.s0 s0Var2 = d60Var2.P;
                        if (s0Var2 != null && (r0Var2 = d60Var2.R) != null && d60Var2.S != null) {
                            boolean z11 = !r0Var2.f;
                            ki.i iVar2 = s0Var2.l;
                            ki.s0.t();
                            if (s0Var2.W == 3 && !s0Var2.w && (i122 = s0Var2.X) != 1) {
                                s0Var2.u = z11;
                                if (i122 == 3) {
                                    s0Var2.u(z11);
                                    iVar2.y(false);
                                } else {
                                    s0Var2.u(false);
                                    iVar2.y(z11);
                                }
                                s0Var2.o();
                                d60Var2.v();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        int dp = AndroidUtilities.dp(24.0f);
        this.O = dp;
        kj0 kj0Var = new kj0(R.raw.roundcamera_flip, dp, dp);
        this.b0 = kj0Var;
        kj0Var.setCallback(v2Var);
        kj0Var.M(kj0Var.e[0] - 1);
        v2Var.setImageDrawable(kj0Var);
        v();
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
        a60Var.setOnTouchListener(new xr(this, 1));
        super.setVisibility(4);
    }

    private long getCurrentDurationMs() {
        ki.r0 r0Var;
        ki.s0 s0Var = this.P;
        if (s0Var == null || (r0Var = this.R) == null) {
            return 0L;
        }
        return r0Var.a == 3 ? s0Var.j() : r0Var.b;
    }

    public static void k(d60 d60Var) {
        ki.k0 k0Var;
        ki.r0 r0Var = d60Var.R;
        boolean z10 = false;
        boolean z11 = (r0Var == null || r0Var.a != 3 || r0Var.e) ? false : true;
        d60Var.G.setEnabled(z11);
        ci.v2 v2Var = d60Var.H;
        if (z11 && (k0Var = d60Var.S) != null && k0Var.b != 1) {
            z10 = true;
        }
        v2Var.setEnabled(z10);
        d60Var.v();
    }

    public static void l(d60 d60Var) {
        org.telegram.ui.il ilVar = d60Var.E;
        if (d60Var.k0) {
            d60Var.k0 = false;
            ilVar.invalidate();
            ilVar.animate().cancel();
            ilVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecordingUiFrameClockActive(boolean z10) {
        org.telegram.ui.jk jkVar;
        if (z10 == this.z0) {
            return;
        }
        this.z0 = z10;
        this.y0 = 0L;
        zp zpVar = this.B0;
        if (z10) {
            yf.h.d().a(30, zpVar);
        } else {
            yf.h.d().f(zpVar);
        }
        if (this.d == z10) {
            return;
        }
        this.d = z10;
        h60 h60Var = this.c;
        if (h60Var == null || (jkVar = ((org.telegram.ui.nj) h60Var).a.Y) == null) {
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
            if (Float.isNaN(this.w0)) {
                this.w0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            x2Var.c(null);
        } else {
            if (!Float.isNaN(this.w0)) {
                attributes.screenBrightness = this.w0;
                this.w0 = Float.NaN;
            }
            x2Var.d();
        }
        parentActivity.getWindow().setAttributes(attributes);
    }

    @Override // org.telegram.ui.Components.j60
    public final void a(boolean z10) {
        if (this.P == null) {
            return;
        }
        r(z10 ? 0 : 6);
        this.P.a();
        q01 q01Var = this.T;
        if (q01Var != null) {
            q01Var.d(true);
        }
        this.T = null;
        MediaController.getInstance().requestRecordAudioFocus(false);
        t(false, false);
    }

    @Override // org.telegram.ui.Components.j60
    public final void b(float f7, int i10) {
        ki.r0 r0Var;
        i2.f0 f0Var;
        if (this.P == null || (r0Var = this.R) == null || r0Var.a != 5) {
            return;
        }
        n();
        if (i10 == 0) {
            this.P.q();
            return;
        }
        if (i10 == 1) {
            ki.s0 s0Var = this.P;
            s0Var.getClass();
            ki.s0.t();
            if (s0Var.W != 5 || (f0Var = s0Var.S) == null) {
                return;
            }
            f0Var.e();
            s0Var.x(false);
            l.d dVar = s0Var.d;
            s0Var.S.J0();
            dVar.getClass();
            return;
        }
        if (i10 == 2) {
            ki.s0 s0Var2 = this.P;
            long j3 = (long) (f7 * this.R.b);
            s0Var2.getClass();
            ki.s0.t();
            if (s0Var2.W != 5 || s0Var2.S == null) {
                return;
            }
            long j10 = s0Var2.G;
            s0Var2.S.W0(5, Math.max(j10, Math.min(Math.max(j10, s0Var2.H - 1), j3)));
            s0Var2.d.getClass();
        }
    }

    @Override // org.telegram.ui.Components.j60
    public final void c(boolean z10) {
        setRecordingUiFrameClockActive(false);
        ValueAnimator valueAnimator = this.a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ki.s0 s0Var = this.P;
        if (s0Var != null) {
            ki.s0.t();
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
                s0Var.l.s();
                s0Var.C = true;
                s0Var.v(10);
                s0Var.m("released");
                s0Var.i.removeCallbacksAndMessages(null);
                s0Var.j.shutdown();
                s0Var.k.shutdown();
            }
            this.P = null;
        }
        q01 q01Var = this.T;
        if (q01Var != null) {
            q01Var.d(true ^ this.i0);
            this.T = null;
        }
        setScreenFlashEnabled(false);
        MediaController.getInstance().requestRecordAudioFocus(false);
        u();
        b60 b60Var = this.v;
        b60Var.setTranslationX(0.0f);
        this.p0 = 0.0f;
        b60Var.setTranslationY(0.0f + this.o0);
        b60Var.setImageReceiver(null);
        MediaController.getInstance().resumeByRewind();
    }

    @Override // org.telegram.ui.Components.j60
    public final boolean d() {
        ki.r0 r0Var = this.R;
        if (r0Var == null) {
            return false;
        }
        int i10 = r0Var.a;
        return i10 == 4 || i10 == 5 || i10 == 6;
    }

    @Override // org.telegram.ui.Components.j60
    public final void e(float f7) {
        float f10 = f7 * 0.5f;
        this.o0 = f10;
        this.v.setTranslationY(this.p0 + f10);
    }

    @Override // org.telegram.ui.Components.j60
    public final void f(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        ki.r0 r0Var;
        ki.s0 s0Var = this.P;
        if (s0Var == null || (r0Var = this.R) == null) {
            return;
        }
        if (i10 == 3) {
            if (s0Var == null || r0Var == null || r0Var.a != 3) {
                return;
            }
            r(2);
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
                r(5);
            } else {
                n();
            }
            this.V = new c60(j3, i11, i12, z10, j10);
            ki.s0 s0Var2 = this.P;
            boolean z11 = this.h0;
            boolean z12 = !z11;
            s0Var2.getClass();
            ki.s0.t();
            int i13 = s0Var2.W;
            if (i13 == 3 || i13 == 5) {
                s0Var2.m.b("finish requested: state=" + hg.c.C(s0Var2.W) + ", includeAudio=" + z12 + ", durationMs=" + s0Var2.j() + ", trim=" + s0Var2.G + ".." + s0Var2.H);
                s0Var2.z = z12;
                if (s0Var2.W != 3) {
                    s0Var2.r();
                    s0Var2.v(7);
                    s0Var2.j.execute(new ki.g0(s0Var2, s0Var2.Q, s0Var2.l() || z11, s0Var2.R, z12, s0Var2.l() ? 1 : 2, s0Var2.P));
                    return;
                }
                s0Var2.E = s0Var2.j();
                s0Var2.y = true;
                s0Var2.e();
                s0Var2.i.removeCallbacks(s0Var2.T);
                s0Var2.v(7);
                boolean D = s0Var2.l.D();
                s0Var2.B = D;
                if (D) {
                    return;
                }
                s0Var2.h(new IllegalStateException("Unable to stop the camera segment"));
            }
        }
    }

    @Override // org.telegram.ui.Components.j60
    public final void g(ah.c cVar, org.telegram.ui.gj gjVar) {
        LinearLayout linearLayout = this.F;
        ch.d c10 = cVar.c(linearLayout, gjVar, false);
        c10.p(AndroidUtilities.dp(6.0f));
        c10.q(AndroidUtilities.dp(21.0f));
        linearLayout.setBackground(c10);
    }

    @Override // org.telegram.ui.Components.j60
    public View getButtonsLayout() {
        return this.F;
    }

    @Override // org.telegram.ui.Components.j60
    public g60 getCameraContainer() {
        return this.v;
    }

    @Override // org.telegram.ui.Components.j60
    public RectF getCameraRect() {
        a60 a60Var = this.y;
        int[] iArr = this.K;
        a60Var.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], a60Var.getWidth() + r3, a60Var.getHeight() + iArr[1]);
    }

    @Override // org.telegram.ui.Components.j60
    public View getMuteImageView() {
        return this.I;
    }

    @Override // org.telegram.ui.Components.j60
    public Paint getPaint() {
        return this.w.getPaint();
    }

    @Override // org.telegram.ui.Components.j60
    public TextureView getTextureView() {
        return this.y;
    }

    @Override // org.telegram.ui.Components.j60
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
        this.n0 = 0L;
        this.w.setProgress(0.0f);
        org.telegram.ui.il ilVar = this.E;
        if (!this.k0) {
            if (this.m0 == null) {
                try {
                    this.m0 = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.m0;
            if (bitmap != null) {
                ilVar.setImageBitmap(bitmap);
            } else {
                ilVar.setImageResource(R.drawable.icplaceholder);
            }
            this.k0 = true;
            ilVar.animate().cancel();
            ilVar.setAlpha(1.0f);
            ilVar.invalidate();
        }
        this.T = new q01(this.h, this.r);
        this.Q = (ki.q0) pi.e.c.a();
        ki.j0 j0Var = new ki.j0(getContext(), this.y);
        j0Var.c = new File(ApplicationLoader.getFilesDirFixed(), "cache");
        j0Var.d = (ki.l0) pi.e.h.a();
        j0Var.e = this.Q;
        j0Var.h = pi.e.f.a();
        j0Var.f = (ki.m0) pi.e.d.a();
        j0Var.g = (ki.n0) pi.e.e.a();
        j0Var.i = pi.e.g.a();
        l.d dVar = this.C0;
        j0Var.j = dVar;
        q01 q01Var = this.T;
        j0Var.k = q01Var;
        j0Var.l = new nv(this, 6);
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
        if (dVar == null) {
            throw new IllegalStateException("Session listener is required");
        }
        if (q01Var == null) {
            throw new IllegalStateException("Output listener is required");
        }
        this.P = new ki.s0(j0Var);
        MediaController.getInstance().requestRecordAudioFocus(true);
        ki.s0 s0Var = this.P;
        s0Var.getClass();
        ki.s0.t();
        if (s0Var.W == 1) {
            try {
                s0Var.m.b("start requested");
                s0Var.c(true);
                s0Var.v(2);
                s0Var.l.C(s0Var.Q, 0L, s0Var.p);
            } catch (Exception e) {
                s0Var.h(e);
            }
        }
        t(true, false);
    }

    @Override // org.telegram.ui.Components.j60
    public final void i() {
        ki.r0 r0Var;
        ki.s0 s0Var = this.P;
        if (s0Var == null || (r0Var = this.R) == null) {
            return;
        }
        int i10 = r0Var.a;
        if (i10 == 3) {
            if (s0Var == null || r0Var == null || i10 != 3) {
                return;
            }
            r(2);
            this.P.p();
            return;
        }
        if (i10 == 5) {
            this.U = null;
            this.f0 = true;
            this.g0 = false;
            ki.s0.t();
            if (s0Var.W != 5 || s0Var.H - s0Var.G >= s0Var.o) {
                return;
            }
            s0Var.M++;
            s0Var.m.b("resume requested: trim=" + s0Var.G + ".." + s0Var.H + ", sourceDurationMs=" + s0Var.E);
            s0Var.r();
            s0Var.v(6);
            s0Var.j.execute(new ci.u1(s0Var, s0Var.l(), s0Var.Q, s0Var.P, s0Var.R));
        }
    }

    public final void n() {
        ki.r0 r0Var;
        VideoEditedInfo videoEditedInfo;
        if (this.P == null || (r0Var = this.R) == null || (videoEditedInfo = this.U) == null) {
            return;
        }
        long j3 = r0Var.b;
        long max = Math.max(0L, videoEditedInfo.startTime);
        long j10 = this.U.endTime;
        if (j10 >= 0) {
            j3 = Math.min(j3, j10);
        }
        ki.s0 s0Var = this.P;
        s0Var.getClass();
        ki.s0.t();
        if (s0Var.W != 5) {
            return;
        }
        long max2 = Math.max(0L, Math.min(s0Var.E, max));
        long max3 = Math.max(max2, Math.min(s0Var.E, j3));
        if (max3 - max2 < Math.min(800L, s0Var.E)) {
            return;
        }
        s0Var.G = max2;
        s0Var.H = max3;
        i2.f0 f0Var = s0Var.S;
        if (f0Var != null) {
            f0Var.W0(5, max2);
        }
        s0Var.d.getClass();
        s0Var.o();
    }

    public final Bitmap o(Bitmap bitmap) {
        a60 a60Var = this.y;
        if (a60Var.getWidth() > 0 && a60Var.getHeight() > 0) {
            Matrix matrix = this.L;
            a60Var.getTransform(matrix);
            if (!matrix.isIdentity()) {
                float[] fArr = this.M;
                matrix.getValues(fArr);
                float width = bitmap.getWidth() / a60Var.getWidth();
                float height = bitmap.getHeight() / a60Var.getHeight();
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
        if (this.x0 != i12) {
            this.x0 = i12;
            b60 b60Var = this.v;
            b60Var.getLayoutParams().width = AndroidUtilities.dp(28.0f) + i12;
            b60Var.getLayoutParams().height = AndroidUtilities.dp(28.0f) + i12;
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

    public final VideoEditedInfo p(File file, long j3, p01 p01Var) {
        ki.n0 n0Var;
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.startTime = -1L;
        videoEditedInfo.endTime = -1L;
        videoEditedInfo.estimatedDuration = j3;
        videoEditedInfo.estimatedSize = Math.max(1L, p01Var == null ? file.length() : p01Var.a);
        videoEditedInfo.roundVideo = true;
        ki.s0 s0Var = this.P;
        videoEditedInfo.framerate = (s0Var == null || (n0Var = s0Var.s) == null) ? 30 : n0Var.a;
        ki.q0 q0Var = this.Q;
        int i10 = q0Var == null ? 480 : q0Var.a;
        videoEditedInfo.originalWidth = i10;
        videoEditedInfo.resultWidth = i10;
        videoEditedInfo.originalHeight = i10;
        videoEditedInfo.resultHeight = i10;
        videoEditedInfo.originalPath = file.getAbsolutePath();
        if (p01Var != null) {
            videoEditedInfo.file = p01Var.b;
            videoEditedInfo.encryptedFile = p01Var.c;
            videoEditedInfo.key = p01Var.d;
            videoEditedInfo.iv = p01Var.e;
        }
        return videoEditedInfo;
    }

    public final void q() {
        if (this.u0) {
            this.u0 = false;
            this.s0 = -1;
            this.t0 = -1;
            if (this.P == null) {
                return;
            }
            ValueAnimator valueAnimator = this.a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r0, 0.0f);
            this.a0 = ofFloat;
            ofFloat.setDuration(350L);
            this.a0.addUpdateListener(new y50(this, 1));
            this.a0.start();
        }
    }

    public final void r(int i10) {
        if (this.g0 && i10 == 2) {
            return;
        }
        this.g0 = true;
        NotificationCenter.getInstance(this.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.n), Integer.valueOf(i10));
    }

    public final void s(boolean z10) {
        Bitmap bitmap;
        a60 a60Var = this.y;
        if (a60Var.isAvailable() && (bitmap = a60Var.getBitmap(180, 180)) != null) {
            try {
                if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2) != 0) {
                    bitmap = o(bitmap);
                    Utilities.stackBlurBitmap(bitmap, 15);
                    Bitmap bitmap2 = this.m0;
                    this.m0 = bitmap;
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
                    if (bitmap != this.m0) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                }
            } finally {
                if (bitmap != this.m0) {
                    bitmap.recycle();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.j60
    public void setInternalPadding(int i10) {
        setPadding(0, 0, 0, i10);
    }

    @Override // org.telegram.ui.Components.j60
    public void setIsMessageTransition(boolean z10) {
        this.v.getClass();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.F.setAlpha(0.0f);
        b60 b60Var = this.v;
        b60Var.setAlpha(0.0f);
        b60Var.setScaleX(0.1f);
        b60Var.setScaleY(0.1f);
        b60Var.setTranslationX(0.0f);
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

    public final void t(boolean z10, boolean z11) {
        f60 f60Var = this.a;
        if (f60Var != null) {
            ((org.telegram.ui.pe) f60Var).b.uc.a(z10, true);
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
        b60 b60Var = this.v;
        if (z10 && !this.j0) {
            b60Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.p0 = measuredHeight;
            b60Var.setTranslationY(measuredHeight + this.o0);
        }
        this.j0 = z10;
        View view = this.s;
        if (view != null) {
            view.invalidate();
        }
        float dp = (z10 || Math.max(getCurrentDurationMs(), this.n0) <= 300) ? 0.0f : AndroidUtilities.dp(24.0f) - (getMeasuredWidth() * 0.5f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 1.0f : 0.0f, z10 ? 0.0f : 1.0f);
        ofFloat.addUpdateListener(new y50(this, 0));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.W = animatorSet2;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        LinearLayout linearLayout = this.F;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, fArr), ObjectAnimator.ofFloat(b60Var, (Property<b60, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(b60Var, (Property<b60, Float>) View.SCALE_X, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(b60Var, (Property<b60, Float>) View.SCALE_Y, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(b60Var, (Property<b60, Float>) View.TRANSLATION_X, dp), ObjectAnimator.ofFloat(this.I, (Property<ImageView, Float>) property, (this.h0 && z10) ? 1.0f : 0.0f), ofFloat);
        this.W.setDuration(180L);
        this.W.setInterpolator(new DecelerateInterpolator());
        if (z10) {
            setTranslationX(0.0f);
        } else {
            this.W.addListener(new r8(this, 24));
        }
        this.W.start();
    }

    public final void u() {
        if (this.v0) {
            this.v0 = false;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
        }
    }

    public final void v() {
        ki.r0 r0Var = this.R;
        int i10 = this.O;
        ci.v2 v2Var = this.H;
        if (r0Var == null || !r0Var.f) {
            if (this.c0 == null) {
                kj0 kj0Var = new kj0(R.raw.roundcamera_flash_on, i10, i10);
                this.c0 = kj0Var;
                kj0Var.setCallback(v2Var);
            }
            v2Var.setImageDrawable(this.c0);
            return;
        }
        if (this.d0 == null) {
            kj0 kj0Var2 = new kj0(R.raw.roundcamera_flash_off, i10, i10);
            this.d0 = kj0Var2;
            kj0Var2.setCallback(v2Var);
        }
        v2Var.setImageDrawable(this.d0);
    }

    public final void w() {
        org.telegram.ui.jk jkVar;
        ki.r0 r0Var = this.R;
        if (r0Var != null) {
            long j3 = r0Var.d;
            if (r0Var.a != 3) {
                return;
            }
            long min = Math.min(j3, (SystemClock.elapsedRealtime() + r0Var.b) - r0Var.c);
            this.n0 = min;
            this.w.setProgress(min / j3);
            h60 h60Var = this.c;
            if (h60Var == null || (jkVar = ((org.telegram.ui.nj) h60Var).a.Y) == null || !jkVar.j1) {
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
