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
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class z50 extends e60 {
    public final ci.w2 E;
    public final ci.w2 F;
    public final ImageView G;
    public final ci.y2 H;
    public final int[] I;
    public final int J;
    public ki.o0 K;
    public ki.m0 L;
    public ki.n0 M;
    public ki.g0 N;
    public p01 O;
    public VideoEditedInfo P;
    public y50 Q;
    public AnimatorSet R;
    public ValueAnimator S;
    public final hj0 T;
    public hj0 U;
    public hj0 V;
    public boolean W;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public final n50 d;
    public boolean d0;
    public final int e;
    public boolean e0;
    public final int f;
    public boolean f0;
    public boolean g0;
    public final boolean h;
    public Bitmap h0;
    public long i0;
    public float j0;
    public float k0;
    public float l0;
    public float m0;
    public final View n;
    public int n0;
    public int o0;
    public boolean p0;
    public boolean q0;
    public final x50 r;
    public float r0;
    public final im0 s;
    public int s0;
    public final org.telegram.ui.Cells.u6 t0;
    public final l.d u0;
    public final FrameLayout v;
    public final TextureView w;
    public final org.telegram.ui.jl x;
    public final LinearLayout y;

    public z50(Activity activity, n50 n50Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.e = UserConfig.selectedAccount;
        this.I = new int[2];
        this.n0 = -1;
        this.o0 = -1;
        this.r0 = Float.NaN;
        this.t0 = new org.telegram.ui.Cells.u6(this, 16);
        this.u0 = new l.d(this);
        this.d = n50Var;
        this.f = n50Var.getClassGuid();
        this.h = n50Var.v();
        this.n = n50Var.getFragmentView();
        setWillNotDraw(false);
        ci.y2 y2Var = new ci.y2(activity, null, this, null);
        this.H = y2Var;
        y2Var.o = 0.5f;
        y2Var.n = ci.y2.f(0.5f);
        y2Var.g();
        addView(y2Var.b, w7.y5.e(-1, -1, 119));
        x50 x50Var = new x50(this, activity);
        this.r = x50Var;
        im0 im0Var = new im0(activity);
        this.s = im0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.v = frameLayout;
        TextureView textureView = new TextureView(activity);
        textureView.setOpaque(true);
        textureView.setClickable(true);
        textureView.setCameraDistance(AndroidUtilities.dp(8000.0f));
        textureView.setOutlineProvider(new ai.k2(13));
        textureView.setClipToOutline(true);
        this.w = textureView;
        frameLayout.addView(textureView, w7.y5.e(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.jl jlVar = new org.telegram.ui.jl(this, activity, paint);
        this.x = jlVar;
        jlVar.setOutlineProvider(new ai.k2(12));
        jlVar.setClipToOutline(true);
        frameLayout.addView(jlVar, w7.y5.e(-1, -1, 119));
        im0Var.addView(frameLayout, w7.y5.d(-1, -1.0f, 119, 14.0f, 14.0f, 14.0f, 14.0f));
        x50Var.addView(im0Var, w7.y5.e(-1, -1, 119));
        int i10 = AndroidUtilities.roundPlayingMessageSize;
        addView(x50Var, new FrameLayout.LayoutParams(i10, i10, 17));
        addView(y2Var.c, w7.y5.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.y = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        addView(linearLayout, w7.y5.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ci.w2 w2Var = new ci.w2(activity);
        this.E = w2Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        w2Var.setScaleType(scaleType);
        w2Var.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        linearLayout.addView(w2Var, w7.y5.n(44, 44));
        final int i11 = 0;
        w2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.w50
            public final /* synthetic */ z50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.n0 n0Var;
                ki.g0 g0Var;
                boolean z10;
                ki.n0 n0Var2;
                int i12;
                switch (i11) {
                    case 0:
                        z50 z50Var = this.b;
                        hj0 hj0Var = z50Var.T;
                        ki.o0 o0Var = z50Var.K;
                        if (o0Var != null && (n0Var = z50Var.M) != null && (g0Var = z50Var.N) != null && n0Var.a == 3 && !n0Var.e) {
                            ki.h0 h0Var = g0Var.a;
                            ki.h0 h0Var2 = ki.h0.a;
                            if (h0Var == h0Var2) {
                                h0Var2 = ki.h0.b;
                            }
                            o0Var.getClass();
                            ki.o0.s();
                            int i13 = o0Var.U;
                            if (i13 != 7 && i13 != 8 && i13 != 9 && i13 != 10) {
                                if (o0Var.o != h0Var2) {
                                    o0Var.l.b("camera facing requested: " + o0Var.o + " -> " + h0Var2 + ", state=" + hg.k0.C(o0Var.U));
                                    o0Var.o = h0Var2;
                                    int i14 = o0Var.U;
                                    if (i14 == 3 || i14 == 2) {
                                        o0Var.d();
                                        ki.h hVar = o0Var.k;
                                        hVar.B = h0Var2;
                                        Handler handler = hVar.n;
                                        if (!hVar.M || handler == null) {
                                            z10 = false;
                                        } else {
                                            handler.post(new gg.x1(27, hVar, h0Var2));
                                            z10 = true;
                                        }
                                        o0Var.v = z10;
                                    }
                                    o0Var.m();
                                    o0Var.n();
                                }
                                hj0Var.M(0);
                                hj0Var.start();
                                break;
                            }
                        }
                        break;
                    default:
                        z50 z50Var2 = this.b;
                        ki.o0 o0Var2 = z50Var2.K;
                        if (o0Var2 != null && (n0Var2 = z50Var2.M) != null && z50Var2.N != null) {
                            boolean z11 = !n0Var2.f;
                            ki.h hVar2 = o0Var2.k;
                            ki.o0.s();
                            if (o0Var2.U == 3 && !o0Var2.v && (i12 = o0Var2.V) != 1) {
                                o0Var2.t = z11;
                                if (i12 == 3) {
                                    o0Var2.t(z11);
                                    hVar2.v(false);
                                } else {
                                    o0Var2.t(false);
                                    hVar2.v(z11);
                                }
                                o0Var2.n();
                                z50Var2.t();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        ci.w2 w2Var2 = new ci.w2(activity);
        this.F = w2Var2;
        w2Var2.setScaleType(scaleType);
        linearLayout.addView(w2Var2, w7.y5.n(44, 44));
        final int i12 = 1;
        w2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.w50
            public final /* synthetic */ z50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.n0 n0Var;
                ki.g0 g0Var;
                boolean z10;
                ki.n0 n0Var2;
                int i122;
                switch (i12) {
                    case 0:
                        z50 z50Var = this.b;
                        hj0 hj0Var = z50Var.T;
                        ki.o0 o0Var = z50Var.K;
                        if (o0Var != null && (n0Var = z50Var.M) != null && (g0Var = z50Var.N) != null && n0Var.a == 3 && !n0Var.e) {
                            ki.h0 h0Var = g0Var.a;
                            ki.h0 h0Var2 = ki.h0.a;
                            if (h0Var == h0Var2) {
                                h0Var2 = ki.h0.b;
                            }
                            o0Var.getClass();
                            ki.o0.s();
                            int i13 = o0Var.U;
                            if (i13 != 7 && i13 != 8 && i13 != 9 && i13 != 10) {
                                if (o0Var.o != h0Var2) {
                                    o0Var.l.b("camera facing requested: " + o0Var.o + " -> " + h0Var2 + ", state=" + hg.k0.C(o0Var.U));
                                    o0Var.o = h0Var2;
                                    int i14 = o0Var.U;
                                    if (i14 == 3 || i14 == 2) {
                                        o0Var.d();
                                        ki.h hVar = o0Var.k;
                                        hVar.B = h0Var2;
                                        Handler handler = hVar.n;
                                        if (!hVar.M || handler == null) {
                                            z10 = false;
                                        } else {
                                            handler.post(new gg.x1(27, hVar, h0Var2));
                                            z10 = true;
                                        }
                                        o0Var.v = z10;
                                    }
                                    o0Var.m();
                                    o0Var.n();
                                }
                                hj0Var.M(0);
                                hj0Var.start();
                                break;
                            }
                        }
                        break;
                    default:
                        z50 z50Var2 = this.b;
                        ki.o0 o0Var2 = z50Var2.K;
                        if (o0Var2 != null && (n0Var2 = z50Var2.M) != null && z50Var2.N != null) {
                            boolean z11 = !n0Var2.f;
                            ki.h hVar2 = o0Var2.k;
                            ki.o0.s();
                            if (o0Var2.U == 3 && !o0Var2.v && (i122 = o0Var2.V) != 1) {
                                o0Var2.t = z11;
                                if (i122 == 3) {
                                    o0Var2.t(z11);
                                    hVar2.v(false);
                                } else {
                                    o0Var2.t(false);
                                    hVar2.v(z11);
                                }
                                o0Var2.n();
                                z50Var2.t();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        int dp = AndroidUtilities.dp(24.0f);
        this.J = dp;
        hj0 hj0Var = new hj0(R.raw.roundcamera_flip, dp, dp);
        this.T = hj0Var;
        hj0Var.setCallback(w2Var);
        hj0Var.M(hj0Var.e[0] - 1);
        w2Var.setImageDrawable(hj0Var);
        t();
        if (f6Var != null && !f6Var.a()) {
            w2Var.setInvert(0.6f);
            w2Var2.setInvert(0.6f);
        }
        ImageView imageView = new ImageView(activity);
        this.G = imageView;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.video_mute);
        imageView.setAlpha(0.0f);
        addView(imageView, w7.y5.e(48, 48, 17));
        textureView.setOnTouchListener(new vr(this, 1));
        super.setVisibility(4);
    }

    private long getCurrentDurationMs() {
        ki.n0 n0Var;
        ki.o0 o0Var = this.K;
        if (o0Var == null || (n0Var = this.M) == null) {
            return 0L;
        }
        return n0Var.a == 3 ? o0Var.i() : n0Var.b;
    }

    public static void k(z50 z50Var) {
        org.telegram.ui.jl jlVar = z50Var.x;
        if (z50Var.f0) {
            z50Var.f0 = false;
            jlVar.invalidate();
            jlVar.animate().cancel();
            jlVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
        }
    }

    public static void l(z50 z50Var) {
        ki.g0 g0Var;
        ki.n0 n0Var = z50Var.M;
        boolean z10 = false;
        boolean z11 = (n0Var == null || n0Var.a != 3 || n0Var.e) ? false : true;
        z50Var.E.setEnabled(z11);
        ci.w2 w2Var = z50Var.F;
        if (z11 && (g0Var = z50Var.N) != null && g0Var.b != 1) {
            z10 = true;
        }
        w2Var.setEnabled(z10);
        z50Var.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenFlashEnabled(boolean z10) {
        Activity parentActivity = this.d.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        ci.y2 y2Var = this.H;
        if (z10) {
            if (Float.isNaN(this.r0)) {
                this.r0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            y2Var.c(null);
        } else {
            if (!Float.isNaN(this.r0)) {
                attributes.screenBrightness = this.r0;
                this.r0 = Float.NaN;
            }
            y2Var.d();
        }
        parentActivity.getWindow().setAttributes(attributes);
    }

    @Override // org.telegram.ui.Components.e60
    public final void a(boolean z10) {
        if (this.K == null) {
            return;
        }
        p(z10 ? 0 : 6);
        this.K.a();
        p01 p01Var = this.O;
        if (p01Var != null) {
            p01Var.b(true);
        }
        this.O = null;
        MediaController.getInstance().requestRecordAudioFocus(false);
        r(false, false);
    }

    @Override // org.telegram.ui.Components.e60
    public final void b(float f7, int i10) {
        ki.n0 n0Var;
        i2.e0 e0Var;
        if (this.K == null || (n0Var = this.M) == null || n0Var.a != 5) {
            return;
        }
        m();
        if (i10 == 0) {
            this.K.p();
            return;
        }
        if (i10 == 1) {
            ki.o0 o0Var = this.K;
            o0Var.getClass();
            ki.o0.s();
            if (o0Var.U != 5 || (e0Var = o0Var.Q) == null) {
                return;
            }
            e0Var.e();
            o0Var.w(false);
            l.d dVar = o0Var.c;
            o0Var.Q.J0();
            dVar.getClass();
            return;
        }
        if (i10 == 2) {
            ki.o0 o0Var2 = this.K;
            long j3 = (long) (f7 * this.M.b);
            o0Var2.getClass();
            ki.o0.s();
            if (o0Var2.U != 5 || o0Var2.Q == null) {
                return;
            }
            long j10 = o0Var2.F;
            o0Var2.Q.W0(5, Math.max(j10, Math.min(Math.max(j10, o0Var2.G - 1), j3)));
            o0Var2.c.getClass();
        }
    }

    @Override // org.telegram.ui.Components.e60
    public final void c(boolean z10) {
        this.s.removeCallbacks(this.t0);
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ki.o0 o0Var = this.K;
        if (o0Var != null) {
            ki.o0.s();
            int i10 = o0Var.U;
            if (i10 == 10) {
                if (!o0Var.B) {
                    o0Var.h();
                }
            } else if (i10 != 8) {
                o0Var.a();
            } else {
                o0Var.d();
                o0Var.q();
                o0Var.k.r();
                o0Var.B = true;
                o0Var.u(10);
                o0Var.l("released");
                o0Var.h.removeCallbacksAndMessages(null);
                o0Var.i.shutdown();
                o0Var.j.shutdown();
            }
            this.K = null;
        }
        p01 p01Var = this.O;
        if (p01Var != null) {
            p01Var.b(true ^ this.d0);
            this.O = null;
        }
        setScreenFlashEnabled(false);
        MediaController.getInstance().requestRecordAudioFocus(false);
        s();
        x50 x50Var = this.r;
        x50Var.setTranslationX(0.0f);
        this.k0 = 0.0f;
        x50Var.setTranslationY(0.0f + this.j0);
        x50Var.setImageReceiver(null);
        MediaController.getInstance().resumeByRewind();
    }

    @Override // org.telegram.ui.Components.e60
    public final boolean d() {
        ki.n0 n0Var = this.M;
        if (n0Var == null) {
            return false;
        }
        int i10 = n0Var.a;
        return i10 == 4 || i10 == 5 || i10 == 6;
    }

    @Override // org.telegram.ui.Components.e60
    public final void e(float f7) {
        float f10 = f7 * 0.5f;
        this.j0 = f10;
        this.r.setTranslationY(this.k0 + f10);
    }

    @Override // org.telegram.ui.Components.e60
    public final void f(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        ki.n0 n0Var;
        ki.o0 o0Var = this.K;
        if (o0Var == null || (n0Var = this.M) == null) {
            return;
        }
        if (i10 == 3) {
            if (o0Var == null || n0Var == null || n0Var.a != 3) {
                return;
            }
            p(2);
            this.K.o();
            return;
        }
        if (i10 == 1 || i10 == 4) {
            long currentDurationMs = getCurrentDurationMs();
            if (currentDurationMs < 800) {
                NotificationCenter.getInstance(this.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.f), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                a(false);
                return;
            }
            if (this.M.a == 3) {
                p(5);
            } else {
                m();
            }
            this.Q = new y50(j3, i11, i12, z10, j10);
            ki.o0 o0Var2 = this.K;
            boolean z11 = this.c0;
            boolean z12 = !z11;
            o0Var2.getClass();
            ki.o0.s();
            int i13 = o0Var2.U;
            if (i13 == 3 || i13 == 5) {
                o0Var2.l.b("finish requested: state=" + hg.k0.C(o0Var2.U) + ", includeAudio=" + z12 + ", durationMs=" + o0Var2.i() + ", trim=" + o0Var2.F + ".." + o0Var2.G);
                o0Var2.y = z12;
                if (o0Var2.U != 3) {
                    o0Var2.q();
                    o0Var2.u(7);
                    o0Var2.i.execute(new ki.d0(o0Var2, o0Var2.O, o0Var2.k() || z11, o0Var2.P, z12, o0Var2.k() ? 1 : 2, o0Var2.N));
                    return;
                }
                o0Var2.D = o0Var2.i();
                o0Var2.x = true;
                o0Var2.d();
                o0Var2.h.removeCallbacks(o0Var2.R);
                o0Var2.u(7);
                boolean z13 = o0Var2.k.z();
                o0Var2.A = z13;
                if (z13) {
                    return;
                }
                o0Var2.g(new IllegalStateException("Unable to stop the camera segment"));
            }
        }
    }

    @Override // org.telegram.ui.Components.e60
    public final void g(ah.c cVar, org.telegram.ui.ij ijVar) {
        LinearLayout linearLayout = this.y;
        ch.d c10 = cVar.c(linearLayout, ijVar, false);
        c10.p(AndroidUtilities.dp(6.0f));
        c10.q(AndroidUtilities.dp(21.0f));
        linearLayout.setBackground(c10);
    }

    @Override // org.telegram.ui.Components.e60
    public View getButtonsLayout() {
        return this.y;
    }

    @Override // org.telegram.ui.Components.e60
    public c60 getCameraContainer() {
        return this.r;
    }

    @Override // org.telegram.ui.Components.e60
    public RectF getCameraRect() {
        TextureView textureView = this.w;
        int[] iArr = this.I;
        textureView.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], textureView.getWidth() + r3, textureView.getHeight() + iArr[1]);
    }

    @Override // org.telegram.ui.Components.e60
    public View getMuteImageView() {
        return this.G;
    }

    @Override // org.telegram.ui.Components.e60
    public Paint getPaint() {
        return this.s.getPaint();
    }

    @Override // org.telegram.ui.Components.e60
    public TextureView getTextureView() {
        return this.w;
    }

    @Override // org.telegram.ui.Components.e60
    public final void h(boolean z10) {
        if (this.K != null) {
            return;
        }
        setVisibility(0);
        this.s.getPaint().setAlpha(255);
        this.d0 = false;
        this.c0 = false;
        this.W = false;
        this.b0 = false;
        this.i0 = 0L;
        this.s.setProgress(0.0f);
        org.telegram.ui.jl jlVar = this.x;
        if (!this.f0) {
            if (this.h0 == null) {
                try {
                    this.h0 = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.h0;
            if (bitmap != null) {
                jlVar.setImageBitmap(bitmap);
            } else {
                jlVar.setImageResource(R.drawable.icplaceholder);
            }
            this.f0 = true;
            jlVar.animate().cancel();
            jlVar.setAlpha(1.0f);
            jlVar.invalidate();
        }
        this.O = new p01(this.e, this.h);
        this.L = (ki.m0) w7.a6.c("round_video_output_resolution", ki.m0.b, ki.m0.class);
        ki.f0 f0Var = new ki.f0(getContext(), this.w);
        f0Var.c = (ki.h0) w7.a6.c("round_video_last_camera", ki.h0.a, ki.h0.class);
        f0Var.d = this.L;
        f0Var.g = Math.max(1, MessagesController.getGlobalMainSettings().getInt("round_video_video_bitrate", MediaController.VIDEO_BITRATE_480));
        f0Var.e = (ki.i0) w7.a6.c("round_video_camera_resolution", ki.i0.a, ki.i0.class);
        f0Var.f = (ki.j0) w7.a6.c("round_video_frame_rate", ki.j0.b, ki.j0.class);
        f0Var.h = w7.a6.a();
        l.d dVar = this.u0;
        f0Var.i = dVar;
        p01 p01Var = this.O;
        f0Var.j = p01Var;
        f0Var.k = new mv(this, 6);
        if (f0Var.c == null) {
            throw new IllegalStateException("Initial camera is required");
        }
        if (f0Var.d == null) {
            throw new IllegalStateException("Output resolution is required");
        }
        if (f0Var.g <= 0) {
            throw new IllegalStateException("Video bitrate is required");
        }
        if (f0Var.e == null) {
            throw new IllegalStateException("Camera resolution is required");
        }
        if (f0Var.f == null) {
            throw new IllegalStateException("Frame rate is required");
        }
        if (dVar == null) {
            throw new IllegalStateException("Session listener is required");
        }
        if (p01Var == null) {
            throw new IllegalStateException("Output listener is required");
        }
        this.K = new ki.o0(f0Var);
        MediaController.getInstance().requestRecordAudioFocus(true);
        ki.o0 o0Var = this.K;
        o0Var.getClass();
        ki.o0.s();
        if (o0Var.U == 1) {
            try {
                o0Var.l.b("start requested");
                o0Var.c(true);
                o0Var.u(2);
                o0Var.k.y(o0Var.O, 0L, o0Var.o);
            } catch (Exception e) {
                o0Var.g(e);
            }
        }
        r(true, false);
    }

    @Override // org.telegram.ui.Components.e60
    public final void i() {
        ki.n0 n0Var;
        ki.o0 o0Var = this.K;
        if (o0Var == null || (n0Var = this.M) == null) {
            return;
        }
        int i10 = n0Var.a;
        if (i10 == 3) {
            if (o0Var == null || n0Var == null || i10 != 3) {
                return;
            }
            p(2);
            this.K.o();
            return;
        }
        if (i10 == 5) {
            this.P = null;
            this.a0 = true;
            this.b0 = false;
            ki.o0.s();
            if (o0Var.U != 5 || o0Var.G - o0Var.F >= o0Var.n) {
                return;
            }
            o0Var.K++;
            o0Var.l.b("resume requested: trim=" + o0Var.F + ".." + o0Var.G + ", sourceDurationMs=" + o0Var.D);
            o0Var.q();
            o0Var.u(6);
            o0Var.i.execute(new ci.u1(o0Var, o0Var.k(), o0Var.O, o0Var.N, o0Var.P));
        }
    }

    public final void m() {
        ki.n0 n0Var;
        VideoEditedInfo videoEditedInfo;
        if (this.K == null || (n0Var = this.M) == null || (videoEditedInfo = this.P) == null) {
            return;
        }
        long j3 = n0Var.b;
        long max = Math.max(0L, videoEditedInfo.startTime);
        long j10 = this.P.endTime;
        if (j10 >= 0) {
            j3 = Math.min(j3, j10);
        }
        ki.o0 o0Var = this.K;
        o0Var.getClass();
        ki.o0.s();
        if (o0Var.U != 5) {
            return;
        }
        long max2 = Math.max(0L, Math.min(o0Var.D, max));
        long max3 = Math.max(max2, Math.min(o0Var.D, j3));
        if (max3 - max2 < Math.min(800L, o0Var.D)) {
            return;
        }
        o0Var.F = max2;
        o0Var.G = max3;
        i2.e0 e0Var = o0Var.Q;
        if (e0Var != null) {
            e0Var.W0(5, max2);
        }
        o0Var.c.getClass();
        o0Var.n();
    }

    public final VideoEditedInfo n(File file, long j3, o01 o01Var) {
        ki.j0 j0Var;
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.startTime = -1L;
        videoEditedInfo.endTime = -1L;
        videoEditedInfo.estimatedDuration = j3;
        videoEditedInfo.estimatedSize = Math.max(1L, o01Var == null ? file.length() : o01Var.a);
        videoEditedInfo.roundVideo = true;
        ki.o0 o0Var = this.K;
        videoEditedInfo.framerate = (o0Var == null || (j0Var = o0Var.r) == null) ? 30 : j0Var.a;
        ki.m0 m0Var = this.L;
        int i10 = m0Var == null ? 480 : m0Var.a;
        videoEditedInfo.originalWidth = i10;
        videoEditedInfo.resultWidth = i10;
        videoEditedInfo.originalHeight = i10;
        videoEditedInfo.resultHeight = i10;
        videoEditedInfo.originalPath = file.getAbsolutePath();
        if (o01Var != null) {
            videoEditedInfo.file = o01Var.b;
            videoEditedInfo.encryptedFile = o01Var.c;
            videoEditedInfo.key = o01Var.d;
            videoEditedInfo.iv = o01Var.e;
        }
        return videoEditedInfo;
    }

    public final void o() {
        if (this.p0) {
            this.p0 = false;
            this.n0 = -1;
            this.o0 = -1;
            if (this.K == null) {
                return;
            }
            ValueAnimator valueAnimator = this.S;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.m0, 0.0f);
            this.S = ofFloat;
            ofFloat.setDuration(350L);
            this.S.addUpdateListener(new v50(this, 1));
            this.S.start();
        }
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
        if (this.s0 != i12) {
            this.s0 = i12;
            x50 x50Var = this.r;
            x50Var.getLayoutParams().width = AndroidUtilities.dp(28.0f) + i12;
            x50Var.getLayoutParams().height = AndroidUtilities.dp(28.0f) + i12;
            ((FrameLayout.LayoutParams) this.G.getLayoutParams()).topMargin = (i12 / 2) - AndroidUtilities.dp(24.0f);
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30);
        ci.y2 y2Var = this.H;
        y2Var.b.measure(makeMeasureSpec, makeMeasureSpec2);
        y2Var.c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return motionEvent.getAction() != 0 || motionEvent.getY() <= ((float) (getMeasuredHeight() - getPaddingBottom()));
    }

    public final void p(int i10) {
        if (this.b0 && i10 == 2) {
            return;
        }
        this.b0 = true;
        NotificationCenter.getInstance(this.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.f), Integer.valueOf(i10));
    }

    public final void q(boolean z10) {
        Bitmap bitmap;
        TextureView textureView = this.w;
        if (textureView.isAvailable() && (bitmap = textureView.getBitmap()) != null) {
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
                        Bitmap bitmap2 = this.h0;
                        this.h0 = createScaledBitmap;
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
                        if (createScaledBitmap != this.h0) {
                            createScaledBitmap.recycle();
                        }
                    }
                }
            } finally {
                bitmap.recycle();
            }
        }
    }

    public final void r(boolean z10, boolean z11) {
        b60 b60Var = this.a;
        if (b60Var != null) {
            ((org.telegram.ui.qe) b60Var).b.uc.a(z10, true);
        }
        AnimatorSet animatorSet = this.R;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.R.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z10);
        }
        x50 x50Var = this.r;
        if (z10 && !this.e0) {
            x50Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.k0 = measuredHeight;
            x50Var.setTranslationY(measuredHeight + this.j0);
        }
        this.e0 = z10;
        View view = this.n;
        if (view != null) {
            view.invalidate();
        }
        float dp = (z10 || Math.max(getCurrentDurationMs(), this.i0) <= 300) ? 0.0f : AndroidUtilities.dp(24.0f) - (getMeasuredWidth() * 0.5f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 1.0f : 0.0f, z10 ? 0.0f : 1.0f);
        ofFloat.addUpdateListener(new v50(this, 0));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.R = animatorSet2;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        LinearLayout linearLayout = this.y;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, fArr), ObjectAnimator.ofFloat(x50Var, (Property<x50, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(x50Var, (Property<x50, Float>) View.SCALE_X, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(x50Var, (Property<x50, Float>) View.SCALE_Y, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(x50Var, (Property<x50, Float>) View.TRANSLATION_X, dp), ObjectAnimator.ofFloat(this.G, (Property<ImageView, Float>) property, (this.c0 && z10) ? 1.0f : 0.0f), ofFloat);
        this.R.setDuration(180L);
        this.R.setInterpolator(new DecelerateInterpolator());
        if (z10) {
            setTranslationX(0.0f);
        } else {
            this.R.addListener(new q8(this, 24));
        }
        this.R.start();
    }

    public final void s() {
        if (this.q0) {
            this.q0 = false;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
        }
    }

    @Override // org.telegram.ui.Components.e60
    public void setInternalPadding(int i10) {
        setPadding(0, 0, 0, i10);
    }

    @Override // org.telegram.ui.Components.e60
    public void setIsMessageTransition(boolean z10) {
        this.r.getClass();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.y.setAlpha(0.0f);
        x50 x50Var = this.r;
        x50Var.setAlpha(0.0f);
        x50Var.setScaleX(0.1f);
        x50Var.setScaleY(0.1f);
        x50Var.setTranslationX(0.0f);
        ImageView imageView = this.G;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        this.s.getPaint().setAlpha(0);
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
        ki.n0 n0Var = this.M;
        int i10 = this.J;
        ci.w2 w2Var = this.F;
        if (n0Var == null || !n0Var.f) {
            if (this.U == null) {
                hj0 hj0Var = new hj0(R.raw.roundcamera_flash_on, i10, i10);
                this.U = hj0Var;
                hj0Var.setCallback(w2Var);
            }
            w2Var.setImageDrawable(this.U);
            return;
        }
        if (this.V == null) {
            hj0 hj0Var2 = new hj0(R.raw.roundcamera_flash_off, i10, i10);
            this.V = hj0Var2;
            hj0Var2.setCallback(w2Var);
        }
        w2Var.setImageDrawable(this.V);
    }
}
