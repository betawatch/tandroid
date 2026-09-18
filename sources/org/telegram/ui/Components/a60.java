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

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class a60 extends f60 {
    public final ci.w2 E;
    public final ImageView F;
    public final ci.y2 G;
    public final int[] H;
    public final int I;
    public ki.h0 J;
    public ki.g0 K;
    public b2.q0 L;
    public q01 M;
    public VideoEditedInfo N;
    public z50 O;
    public AnimatorSet P;
    public ValueAnimator Q;
    public final ij0 R;
    public ij0 S;
    public ij0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public final n50 d;
    public boolean d0;
    public final int e;
    public Bitmap e0;
    public final int f;
    public long f0;
    public float g0;
    public final boolean h;
    public float h0;
    public float i0;
    public float j0;
    public boolean k0;
    public float l0;
    public int m0;
    public final View n;
    public final org.telegram.ui.Cells.t6 n0;
    public final l.d o0;
    public final y50 r;
    public final jm0 s;
    public final TextureView v;
    public final org.telegram.ui.jl w;
    public final LinearLayout x;
    public final ci.w2 y;

    public a60(Activity activity, n50 n50Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.e = UserConfig.selectedAccount;
        this.H = new int[2];
        this.l0 = Float.NaN;
        this.n0 = new org.telegram.ui.Cells.t6(this, 16);
        this.o0 = new l.d(this);
        this.d = n50Var;
        this.f = n50Var.getClassGuid();
        this.h = n50Var.v();
        this.n = n50Var.getFragmentView();
        setWillNotDraw(false);
        ci.y2 y2Var = new ci.y2(activity, null, this, null);
        this.G = y2Var;
        y2Var.o = 0.5f;
        y2Var.n = ci.y2.f(0.5f);
        y2Var.g();
        addView(y2Var.b, w7.y5.e(-1, -1, 119));
        y50 y50Var = new y50(this, activity);
        this.r = y50Var;
        jm0 jm0Var = new jm0(activity);
        this.s = jm0Var;
        TextureView textureView = new TextureView(activity);
        textureView.setOpaque(true);
        textureView.setClickable(true);
        textureView.setCameraDistance(AndroidUtilities.dp(8000.0f));
        textureView.setOutlineProvider(new ai.k2(13));
        textureView.setClipToOutline(true);
        this.v = textureView;
        jm0Var.addView(textureView, w7.y5.d(-1, -1.0f, 119, 14.0f, 14.0f, 14.0f, 14.0f));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.jl jlVar = new org.telegram.ui.jl(this, activity, paint);
        this.w = jlVar;
        jlVar.setOutlineProvider(new ai.k2(12));
        jlVar.setClipToOutline(true);
        jm0Var.addView(jlVar, w7.y5.d(-1, -1.0f, 119, 14.0f, 14.0f, 14.0f, 14.0f));
        y50Var.addView(jm0Var, w7.y5.e(-1, -1, 119));
        int i10 = AndroidUtilities.roundPlayingMessageSize;
        addView(y50Var, new FrameLayout.LayoutParams(i10, i10, 17));
        addView(y2Var.c, w7.y5.e(-1, -1, 119));
        jm0Var.setTrimListener(new w50(this));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.x = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        addView(linearLayout, w7.y5.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ci.w2 w2Var = new ci.w2(activity);
        this.y = w2Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        w2Var.setScaleType(scaleType);
        w2Var.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        linearLayout.addView(w2Var, w7.y5.n(44, 44));
        final int i11 = 0;
        w2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.x50
            public final /* synthetic */ a60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.g0 g0Var;
                b2.q0 q0Var;
                ki.g0 g0Var2;
                int i12;
                switch (i11) {
                    case 0:
                        a60 a60Var = this.b;
                        ij0 ij0Var = a60Var.R;
                        ki.h0 h0Var = a60Var.J;
                        if (h0Var != null && (g0Var = a60Var.K) != null && (q0Var = a60Var.L) != null && g0Var.a == 3 && !g0Var.e) {
                            boolean z10 = true;
                            int i13 = q0Var.a == 1 ? 2 : 1;
                            h0Var.getClass();
                            ki.h0.r();
                            int i14 = h0Var.Q;
                            if (i14 != 7 && i14 != 8 && i14 != 9 && i14 != 10) {
                                if (h0Var.R != i13) {
                                    h0Var.l.b("camera facing requested: " + hg.k0.z(h0Var.R) + " -> " + hg.k0.z(i13) + ", state=" + hg.k0.C(h0Var.Q));
                                    h0Var.R = i13;
                                    int i15 = h0Var.Q;
                                    if (i15 == 3 || i15 == 2) {
                                        h0Var.d();
                                        ki.g gVar = h0Var.k;
                                        gVar.T = i13;
                                        Handler handler = gVar.j;
                                        if (!gVar.B || handler == null) {
                                            z10 = false;
                                        } else {
                                            handler.post(new ai.n8(gVar, i13, 12));
                                        }
                                        h0Var.q = z10;
                                    }
                                    l.d dVar = h0Var.c;
                                    b2.q0 q0Var2 = new b2.q0(h0Var.R, h0Var.U);
                                    a60 a60Var2 = (a60) dVar.a;
                                    a60Var2.L = q0Var2;
                                    a60.l(a60Var2);
                                    h0Var.m();
                                }
                                ij0Var.M(0);
                                ij0Var.start();
                                break;
                            }
                        }
                        break;
                    default:
                        a60 a60Var3 = this.b;
                        ki.h0 h0Var2 = a60Var3.J;
                        if (h0Var2 != null && (g0Var2 = a60Var3.K) != null && a60Var3.L != null) {
                            boolean z11 = !g0Var2.f;
                            ki.g gVar2 = h0Var2.k;
                            ki.h0.r();
                            if (h0Var2.Q == 3 && !h0Var2.q && (i12 = h0Var2.U) != 1) {
                                h0Var2.o = z11;
                                if (i12 == 3) {
                                    h0Var2.t(z11);
                                    gVar2.m(false);
                                } else {
                                    h0Var2.t(false);
                                    gVar2.m(z11);
                                }
                                h0Var2.m();
                                a60Var3.t();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        ci.w2 w2Var2 = new ci.w2(activity);
        this.E = w2Var2;
        w2Var2.setScaleType(scaleType);
        linearLayout.addView(w2Var2, w7.y5.n(44, 44));
        final int i12 = 1;
        w2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.x50
            public final /* synthetic */ a60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ki.g0 g0Var;
                b2.q0 q0Var;
                ki.g0 g0Var2;
                int i122;
                switch (i12) {
                    case 0:
                        a60 a60Var = this.b;
                        ij0 ij0Var = a60Var.R;
                        ki.h0 h0Var = a60Var.J;
                        if (h0Var != null && (g0Var = a60Var.K) != null && (q0Var = a60Var.L) != null && g0Var.a == 3 && !g0Var.e) {
                            boolean z10 = true;
                            int i13 = q0Var.a == 1 ? 2 : 1;
                            h0Var.getClass();
                            ki.h0.r();
                            int i14 = h0Var.Q;
                            if (i14 != 7 && i14 != 8 && i14 != 9 && i14 != 10) {
                                if (h0Var.R != i13) {
                                    h0Var.l.b("camera facing requested: " + hg.k0.z(h0Var.R) + " -> " + hg.k0.z(i13) + ", state=" + hg.k0.C(h0Var.Q));
                                    h0Var.R = i13;
                                    int i15 = h0Var.Q;
                                    if (i15 == 3 || i15 == 2) {
                                        h0Var.d();
                                        ki.g gVar = h0Var.k;
                                        gVar.T = i13;
                                        Handler handler = gVar.j;
                                        if (!gVar.B || handler == null) {
                                            z10 = false;
                                        } else {
                                            handler.post(new ai.n8(gVar, i13, 12));
                                        }
                                        h0Var.q = z10;
                                    }
                                    l.d dVar = h0Var.c;
                                    b2.q0 q0Var2 = new b2.q0(h0Var.R, h0Var.U);
                                    a60 a60Var2 = (a60) dVar.a;
                                    a60Var2.L = q0Var2;
                                    a60.l(a60Var2);
                                    h0Var.m();
                                }
                                ij0Var.M(0);
                                ij0Var.start();
                                break;
                            }
                        }
                        break;
                    default:
                        a60 a60Var3 = this.b;
                        ki.h0 h0Var2 = a60Var3.J;
                        if (h0Var2 != null && (g0Var2 = a60Var3.K) != null && a60Var3.L != null) {
                            boolean z11 = !g0Var2.f;
                            ki.g gVar2 = h0Var2.k;
                            ki.h0.r();
                            if (h0Var2.Q == 3 && !h0Var2.q && (i122 = h0Var2.U) != 1) {
                                h0Var2.o = z11;
                                if (i122 == 3) {
                                    h0Var2.t(z11);
                                    gVar2.m(false);
                                } else {
                                    h0Var2.t(false);
                                    gVar2.m(z11);
                                }
                                h0Var2.m();
                                a60Var3.t();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        int dp = AndroidUtilities.dp(24.0f);
        this.I = dp;
        ij0 ij0Var = new ij0(R.raw.roundcamera_flip, dp, dp);
        this.R = ij0Var;
        ij0Var.setCallback(w2Var);
        ij0Var.M(ij0Var.e[0] - 1);
        w2Var.setImageDrawable(ij0Var);
        t();
        if (e6Var != null && !e6Var.a()) {
            w2Var.setInvert(0.6f);
            w2Var2.setInvert(0.6f);
        }
        ImageView imageView = new ImageView(activity);
        this.F = imageView;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.video_mute);
        imageView.setAlpha(0.0f);
        addView(imageView, w7.y5.e(48, 48, 17));
        textureView.setOnTouchListener(new vr(this, 1));
        super.setVisibility(4);
    }

    private long getCurrentDurationMs() {
        ki.g0 g0Var;
        ki.h0 h0Var = this.J;
        if (h0Var == null || (g0Var = this.K) == null) {
            return 0L;
        }
        return g0Var.a == 3 ? h0Var.i() : g0Var.b;
    }

    public static void l(a60 a60Var) {
        b2.q0 q0Var;
        ki.g0 g0Var = a60Var.K;
        boolean z10 = false;
        boolean z11 = (g0Var == null || g0Var.a != 3 || g0Var.e) ? false : true;
        a60Var.y.setEnabled(z11);
        ci.w2 w2Var = a60Var.E;
        if (z11 && (q0Var = a60Var.L) != null && q0Var.b != 1) {
            z10 = true;
        }
        w2Var.setEnabled(z10);
        a60Var.t();
    }

    public static void m(a60 a60Var) {
        org.telegram.ui.jl jlVar = a60Var.w;
        if (a60Var.d0) {
            a60Var.d0 = false;
            jlVar.invalidate();
            jlVar.animate().cancel();
            jlVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
        }
    }

    public static VideoEditedInfo o(File file, long j3, p01 p01Var) {
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.startTime = -1L;
        videoEditedInfo.endTime = -1L;
        videoEditedInfo.estimatedDuration = j3;
        videoEditedInfo.estimatedSize = Math.max(1L, p01Var == null ? file.length() : p01Var.a);
        videoEditedInfo.roundVideo = true;
        videoEditedInfo.framerate = 30;
        videoEditedInfo.originalWidth = 480;
        videoEditedInfo.resultWidth = 480;
        videoEditedInfo.originalHeight = 480;
        videoEditedInfo.resultHeight = 480;
        videoEditedInfo.originalPath = file.getAbsolutePath();
        if (p01Var != null) {
            videoEditedInfo.file = p01Var.b;
            videoEditedInfo.encryptedFile = p01Var.c;
            videoEditedInfo.key = p01Var.d;
            videoEditedInfo.iv = p01Var.e;
        }
        return videoEditedInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenFlashEnabled(boolean z10) {
        Activity parentActivity = this.d.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        ci.y2 y2Var = this.G;
        if (z10) {
            if (Float.isNaN(this.l0)) {
                this.l0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            y2Var.c(null);
        } else {
            if (!Float.isNaN(this.l0)) {
                attributes.screenBrightness = this.l0;
                this.l0 = Float.NaN;
            }
            y2Var.d();
        }
        parentActivity.getWindow().setAttributes(attributes);
    }

    @Override // org.telegram.ui.Components.f60
    public final void a(boolean z10) {
        if (this.J == null) {
            return;
        }
        q(z10 ? 0 : 6);
        r(true);
        this.J.a();
        q01 q01Var = this.M;
        if (q01Var != null) {
            q01Var.b(true);
        }
        this.M = null;
        MediaController.getInstance().requestRecordAudioFocus(false);
        s(false, false);
    }

    @Override // org.telegram.ui.Components.f60
    public final void b(float f7, int i10) {
        ki.g0 g0Var;
        i2.e0 e0Var;
        VideoEditedInfo videoEditedInfo;
        if (this.J == null || (g0Var = this.K) == null || g0Var.a != 5) {
            return;
        }
        n();
        ki.g0 g0Var2 = this.K;
        if (g0Var2 != null && (videoEditedInfo = this.N) != null) {
            long j3 = g0Var2.b;
            long max = Math.max(0L, videoEditedInfo.startTime);
            long j10 = this.N.endTime;
            if (j10 >= 0) {
                j3 = Math.min(j3, j10);
            }
            this.s.g(max / 60000.0f, j3 / 60000.0f);
        }
        if (i10 == 0) {
            this.J.o();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                this.J.s((long) (f7 * this.K.b));
                return;
            }
            return;
        }
        ki.h0 h0Var = this.J;
        h0Var.getClass();
        ki.h0.r();
        if (h0Var.Q != 5 || (e0Var = h0Var.L) == null) {
            return;
        }
        e0Var.e();
        h0Var.x(false);
        h0Var.c.M(h0Var.L.J0());
    }

    @Override // org.telegram.ui.Components.f60
    public final void d(boolean z10) {
        this.s.removeCallbacks(this.n0);
        ValueAnimator valueAnimator = this.Q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ki.h0 h0Var = this.J;
        if (h0Var != null) {
            ki.h0.r();
            int i10 = h0Var.Q;
            if (i10 == 10) {
                if (!h0Var.w) {
                    h0Var.h();
                }
            } else if (i10 != 8) {
                h0Var.a();
            } else {
                h0Var.d();
                h0Var.p();
                h0Var.k.j();
                h0Var.w = true;
                h0Var.u(10);
                h0Var.l("released");
                h0Var.h.removeCallbacksAndMessages(null);
                h0Var.i.shutdown();
                h0Var.j.shutdown();
            }
            this.J = null;
        }
        q01 q01Var = this.M;
        if (q01Var != null) {
            q01Var.b(true ^ this.b0);
            this.M = null;
        }
        setScreenFlashEnabled(false);
        MediaController.getInstance().requestRecordAudioFocus(false);
        y50 y50Var = this.r;
        y50Var.setTranslationX(0.0f);
        this.h0 = 0.0f;
        y50Var.setTranslationY(0.0f + this.g0);
        y50Var.setImageReceiver(null);
        MediaController.getInstance().resumeByRewind();
    }

    @Override // org.telegram.ui.Components.f60
    public final boolean e() {
        ki.g0 g0Var = this.K;
        if (g0Var == null) {
            return false;
        }
        int i10 = g0Var.a;
        return i10 == 4 || i10 == 5 || i10 == 6;
    }

    @Override // org.telegram.ui.Components.f60
    public final void f(float f7) {
        float f10 = f7 * 0.5f;
        this.g0 = f10;
        this.r.setTranslationY(this.h0 + f10);
    }

    @Override // org.telegram.ui.Components.f60
    public final void g(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        if (this.J == null || this.K == null) {
            return;
        }
        if (i10 == 3) {
            p();
            return;
        }
        if (i10 == 1 || i10 == 4) {
            long currentDurationMs = getCurrentDurationMs();
            if (currentDurationMs < 800) {
                NotificationCenter.getInstance(this.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.f), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                a(false);
                return;
            }
            if (this.K.a == 3) {
                q(5);
            } else {
                n();
            }
            this.O = new z50(j3, i11, i12, z10, j10);
            this.s.setLoading(true);
            r(true);
            ki.h0 h0Var = this.J;
            boolean z11 = this.a0;
            boolean z12 = !z11;
            h0Var.getClass();
            ki.h0.r();
            int i13 = h0Var.Q;
            if (i13 == 3 || i13 == 5) {
                h0Var.l.b("finish requested: state=" + hg.k0.C(h0Var.Q) + ", includeAudio=" + z12 + ", durationMs=" + h0Var.i() + ", trim=" + h0Var.A + ".." + h0Var.B);
                h0Var.t = z12;
                if (h0Var.Q != 3) {
                    h0Var.p();
                    h0Var.u(7);
                    h0Var.i.execute(new ki.b0(h0Var, h0Var.J, h0Var.k() || z11, h0Var.K, z12, h0Var.k() ? 1 : 2, h0Var.I));
                    return;
                }
                h0Var.y = h0Var.i();
                h0Var.s = true;
                h0Var.d();
                h0Var.h.removeCallbacks(h0Var.M);
                h0Var.u(7);
                boolean q6 = h0Var.k.q();
                h0Var.v = q6;
                if (q6) {
                    return;
                }
                h0Var.g(new IllegalStateException("Unable to stop the camera segment"));
            }
        }
    }

    @Override // org.telegram.ui.Components.f60
    public View getButtonsLayout() {
        return this.x;
    }

    @Override // org.telegram.ui.Components.f60
    public d60 getCameraContainer() {
        return this.r;
    }

    @Override // org.telegram.ui.Components.f60
    public RectF getCameraRect() {
        TextureView textureView = this.v;
        int[] iArr = this.H;
        textureView.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], textureView.getWidth() + r3, textureView.getHeight() + iArr[1]);
    }

    @Override // org.telegram.ui.Components.f60
    public View getMuteImageView() {
        return this.F;
    }

    @Override // org.telegram.ui.Components.f60
    public Paint getPaint() {
        return this.s.getPaint();
    }

    @Override // org.telegram.ui.Components.f60
    public TextureView getTextureView() {
        return this.v;
    }

    @Override // org.telegram.ui.Components.f60
    public final void h(ah.c cVar, org.telegram.ui.ij ijVar) {
        LinearLayout linearLayout = this.x;
        ch.d c10 = cVar.c(linearLayout, ijVar, false);
        c10.p(AndroidUtilities.dp(6.0f));
        c10.q(AndroidUtilities.dp(21.0f));
        linearLayout.setBackground(c10);
    }

    @Override // org.telegram.ui.Components.f60
    public final void i(boolean z10) {
        if (this.J != null) {
            return;
        }
        setVisibility(0);
        this.s.getPaint().setAlpha(255);
        this.b0 = false;
        this.a0 = false;
        this.U = false;
        this.W = false;
        this.f0 = 0L;
        this.s.setTrimEnabled(false);
        this.s.setProgress(0.0f);
        this.s.setLoading(false);
        r(false);
        this.M = new q01(this.e, this.h);
        this.J = new ki.h0(getContext(), this.v, this.o0, this.M, new w50(this));
        MediaController.getInstance().requestRecordAudioFocus(true);
        ki.h0 h0Var = this.J;
        h0Var.getClass();
        ki.h0.r();
        if (h0Var.Q == 1) {
            try {
                h0Var.l.b("start requested");
                h0Var.c(true);
                h0Var.u(2);
                h0Var.k.p(h0Var.J, 0L, h0Var.R);
            } catch (Exception e) {
                h0Var.g(e);
            }
        }
        s(true, false);
    }

    @Override // org.telegram.ui.Components.f60
    public final void j() {
        ki.g0 g0Var;
        if (this.J == null || (g0Var = this.K) == null) {
            return;
        }
        int i10 = g0Var.a;
        if (i10 == 3) {
            p();
            return;
        }
        if (i10 == 5) {
            this.s.setTrimEnabled(false);
            this.N = null;
            this.V = true;
            this.W = false;
            r(true);
            ki.h0 h0Var = this.J;
            h0Var.getClass();
            ki.h0.r();
            if (h0Var.Q != 5 || h0Var.B - h0Var.A >= h0Var.m) {
                return;
            }
            h0Var.F++;
            h0Var.l.b("resume requested: trim=" + h0Var.A + ".." + h0Var.B + ", sourceDurationMs=" + h0Var.y);
            h0Var.p();
            h0Var.u(6);
            h0Var.i.execute(new ci.u1(h0Var, h0Var.k(), h0Var.J, h0Var.I, h0Var.K));
        }
    }

    public final void n() {
        ki.g0 g0Var;
        VideoEditedInfo videoEditedInfo;
        if (this.J == null || (g0Var = this.K) == null || (videoEditedInfo = this.N) == null) {
            return;
        }
        long j3 = g0Var.b;
        long max = Math.max(0L, videoEditedInfo.startTime);
        long j10 = this.N.endTime;
        if (j10 >= 0) {
            j3 = Math.min(j3, j10);
        }
        this.J.v(max, j3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = ((float) (View.MeasureSpec.getSize(i11) - getPaddingBottom())) > ((float) View.MeasureSpec.getSize(i10)) * 1.3f ? AndroidUtilities.roundPlayingMessageSize : AndroidUtilities.roundMessageSize;
        if (this.m0 != i12) {
            this.m0 = i12;
            y50 y50Var = this.r;
            y50Var.getLayoutParams().width = AndroidUtilities.dp(28.0f) + i12;
            y50Var.getLayoutParams().height = AndroidUtilities.dp(28.0f) + i12;
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30);
        ci.y2 y2Var = this.G;
        y2Var.b.measure(makeMeasureSpec, makeMeasureSpec2);
        y2Var.c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    public final void p() {
        ki.g0 g0Var;
        if (this.J == null || (g0Var = this.K) == null || g0Var.a != 3) {
            return;
        }
        q(2);
        r(true);
        this.J.n();
    }

    public final void q(int i10) {
        if (this.W && i10 == 2) {
            return;
        }
        this.W = true;
        NotificationCenter.getInstance(this.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.f), Integer.valueOf(i10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x006b, code lost:
    
        if (r7 != r6.e0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(boolean z10) {
        Bitmap bitmap;
        if (this.d0) {
            return;
        }
        if (z10) {
            TextureView textureView = this.v;
            if (textureView.isAvailable() && (bitmap = textureView.getBitmap()) != null) {
                try {
                    if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && bitmap.getPixel(0, 0) != 0) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 50, 50, true);
                        Utilities.blurBitmap(createScaledBitmap, 7);
                        this.e0 = createScaledBitmap;
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
                    if (bitmap != this.e0) {
                        bitmap.recycle();
                    }
                }
            }
        }
        if (this.e0 == null) {
            try {
                this.e0 = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
            } catch (Throwable unused2) {
            }
        }
        Bitmap bitmap2 = this.e0;
        org.telegram.ui.jl jlVar = this.w;
        if (bitmap2 != null) {
            jlVar.setImageBitmap(bitmap2);
        } else {
            jlVar.setImageResource(R.drawable.icplaceholder);
        }
        this.d0 = true;
        jlVar.animate().cancel();
        jlVar.setAlpha(1.0f);
        jlVar.invalidate();
    }

    public final void s(boolean z10, boolean z11) {
        c60 c60Var = this.a;
        if (c60Var != null) {
            ((org.telegram.ui.qe) c60Var).b.uc.a(z10, true);
        }
        AnimatorSet animatorSet = this.P;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.P.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z10);
        }
        y50 y50Var = this.r;
        if (z10 && !this.c0) {
            y50Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.h0 = measuredHeight;
            y50Var.setTranslationY(measuredHeight + this.g0);
        }
        this.c0 = z10;
        View view = this.n;
        if (view != null) {
            view.invalidate();
        }
        float dp = (z10 || Math.max(getCurrentDurationMs(), this.f0) <= 300) ? 0.0f : AndroidUtilities.dp(24.0f) - (getMeasuredWidth() * 0.5f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 1.0f : 0.0f, z10 ? 0.0f : 1.0f);
        ofFloat.addUpdateListener(new v50(this, 0));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.P = animatorSet2;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        LinearLayout linearLayout = this.x;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, fArr), ObjectAnimator.ofFloat(y50Var, (Property<y50, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(y50Var, (Property<y50, Float>) View.SCALE_X, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(y50Var, (Property<y50, Float>) View.SCALE_Y, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(y50Var, (Property<y50, Float>) View.TRANSLATION_X, dp), ObjectAnimator.ofFloat(this.F, (Property<ImageView, Float>) property, (this.a0 && z10) ? 1.0f : 0.0f), ofFloat);
        this.P.setDuration(180L);
        this.P.setInterpolator(new DecelerateInterpolator());
        if (z10) {
            setTranslationX(0.0f);
        } else {
            this.P.addListener(new r8(this, 24));
        }
        this.P.start();
    }

    @Override // org.telegram.ui.Components.f60
    public void setInternalPadding(int i10) {
        setPadding(0, 0, 0, i10);
    }

    @Override // org.telegram.ui.Components.f60
    public void setIsMessageTransition(boolean z10) {
        this.r.getClass();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.x.setAlpha(0.0f);
        y50 y50Var = this.r;
        y50Var.setAlpha(0.0f);
        y50Var.setScaleX(0.1f);
        y50Var.setScaleY(0.1f);
        y50Var.setTranslationX(0.0f);
        ImageView imageView = this.F;
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
        ki.g0 g0Var = this.K;
        int i10 = this.I;
        ci.w2 w2Var = this.E;
        if (g0Var == null || !g0Var.f) {
            if (this.S == null) {
                ij0 ij0Var = new ij0(R.raw.roundcamera_flash_on, i10, i10);
                this.S = ij0Var;
                ij0Var.setCallback(w2Var);
            }
            w2Var.setImageDrawable(this.S);
            return;
        }
        if (this.T == null) {
            ij0 ij0Var2 = new ij0(R.raw.roundcamera_flash_off, i10, i10);
            this.T = ij0Var2;
            ij0Var2.setCallback(w2Var);
        }
        w2Var.setImageDrawable(this.T);
    }
}
