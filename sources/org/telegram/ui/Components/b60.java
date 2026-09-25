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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class b60 extends h60 {
    public boolean A0;
    public final yp B0;
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
    public o01 T;
    public VideoEditedInfo U;
    public a60 V;
    public AnimatorSet W;
    public ValueAnimator a0;
    public final ij0 b0;
    public ij0 c0;
    public ij0 d0;
    public boolean e0;
    public final o50 f;
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
    public final z50 v;
    public boolean v0;
    public final im0 w;
    public float w0;
    public final FrameLayout x;
    public int x0;
    public final y50 y;
    public long y0;
    public boolean z0;

    public b60(Activity activity, o50 o50Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.h = UserConfig.selectedAccount;
        this.K = new int[2];
        this.L = new Matrix();
        this.M = new float[9];
        this.N = new Paint(3);
        this.s0 = -1;
        this.t0 = -1;
        this.w0 = Float.NaN;
        this.B0 = new yp(this, 25);
        this.C0 = new l.d(this);
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
                ki.r0 r0Var;
                ki.k0 k0Var;
                boolean z10;
                ki.r0 r0Var2;
                int i12;
                switch (i11) {
                    case 0:
                        b60 b60Var = this.b;
                        ki.s0 s0Var = b60Var.P;
                        if (s0Var != null && (r0Var = b60Var.R) != null && (k0Var = b60Var.S) != null && r0Var.a == 3 && !r0Var.e) {
                            ki.l0 l0Var = k0Var.a;
                            ki.l0 l0Var2 = ki.l0.a;
                            if (l0Var == l0Var2) {
                                l0Var2 = ki.l0.b;
                            }
                            s0Var.getClass();
                            ki.s0.s();
                            int i13 = s0Var.V;
                            if (i13 != 7 && i13 != 8 && i13 != 9 && i13 != 10) {
                                if (s0Var.o != l0Var2) {
                                    s0Var.l.b("camera facing requested: " + s0Var.o + " -> " + l0Var2 + ", state=" + hg.c.C(s0Var.V));
                                    s0Var.o = l0Var2;
                                    int i14 = s0Var.V;
                                    if (i14 == 3 || i14 == 2) {
                                        s0Var.d();
                                        ki.i iVar = s0Var.k;
                                        iVar.C = l0Var2;
                                        Handler handler = iVar.n;
                                        if (!iVar.S || handler == null) {
                                            z10 = false;
                                        } else {
                                            handler.post(new gg.x1(27, iVar, l0Var2));
                                            z10 = true;
                                        }
                                        s0Var.v = z10;
                                    }
                                    s0Var.m();
                                    s0Var.n();
                                }
                                b60Var.b0.M(0);
                                b60Var.b0.start();
                                break;
                            }
                        }
                        break;
                    default:
                        b60 b60Var2 = this.b;
                        ki.s0 s0Var2 = b60Var2.P;
                        if (s0Var2 != null && (r0Var2 = b60Var2.R) != null && b60Var2.S != null) {
                            boolean z11 = !r0Var2.f;
                            ki.i iVar2 = s0Var2.k;
                            ki.s0.s();
                            if (s0Var2.V == 3 && !s0Var2.v && (i12 = s0Var2.W) != 1) {
                                s0Var2.t = z11;
                                if (i12 == 3) {
                                    s0Var2.t(z11);
                                    iVar2.y(false);
                                } else {
                                    s0Var2.t(false);
                                    iVar2.y(z11);
                                }
                                s0Var2.n();
                                b60Var2.v();
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
                ki.r0 r0Var;
                ki.k0 k0Var;
                boolean z10;
                ki.r0 r0Var2;
                int i122;
                switch (i12) {
                    case 0:
                        b60 b60Var = this.b;
                        ki.s0 s0Var = b60Var.P;
                        if (s0Var != null && (r0Var = b60Var.R) != null && (k0Var = b60Var.S) != null && r0Var.a == 3 && !r0Var.e) {
                            ki.l0 l0Var = k0Var.a;
                            ki.l0 l0Var2 = ki.l0.a;
                            if (l0Var == l0Var2) {
                                l0Var2 = ki.l0.b;
                            }
                            s0Var.getClass();
                            ki.s0.s();
                            int i13 = s0Var.V;
                            if (i13 != 7 && i13 != 8 && i13 != 9 && i13 != 10) {
                                if (s0Var.o != l0Var2) {
                                    s0Var.l.b("camera facing requested: " + s0Var.o + " -> " + l0Var2 + ", state=" + hg.c.C(s0Var.V));
                                    s0Var.o = l0Var2;
                                    int i14 = s0Var.V;
                                    if (i14 == 3 || i14 == 2) {
                                        s0Var.d();
                                        ki.i iVar = s0Var.k;
                                        iVar.C = l0Var2;
                                        Handler handler = iVar.n;
                                        if (!iVar.S || handler == null) {
                                            z10 = false;
                                        } else {
                                            handler.post(new gg.x1(27, iVar, l0Var2));
                                            z10 = true;
                                        }
                                        s0Var.v = z10;
                                    }
                                    s0Var.m();
                                    s0Var.n();
                                }
                                b60Var.b0.M(0);
                                b60Var.b0.start();
                                break;
                            }
                        }
                        break;
                    default:
                        b60 b60Var2 = this.b;
                        ki.s0 s0Var2 = b60Var2.P;
                        if (s0Var2 != null && (r0Var2 = b60Var2.R) != null && b60Var2.S != null) {
                            boolean z11 = !r0Var2.f;
                            ki.i iVar2 = s0Var2.k;
                            ki.s0.s();
                            if (s0Var2.V == 3 && !s0Var2.v && (i122 = s0Var2.W) != 1) {
                                s0Var2.t = z11;
                                if (i122 == 3) {
                                    s0Var2.t(z11);
                                    iVar2.y(false);
                                } else {
                                    s0Var2.t(false);
                                    iVar2.y(z11);
                                }
                                s0Var2.n();
                                b60Var2.v();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        int dp = AndroidUtilities.dp(24.0f);
        this.O = dp;
        ij0 ij0Var = new ij0(R.raw.roundcamera_flip, dp, dp);
        this.b0 = ij0Var;
        ij0Var.setCallback(v2Var);
        ij0Var.M(ij0Var.e[0] - 1);
        v2Var.setImageDrawable(ij0Var);
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
        y50Var.setOnTouchListener(new wr(this, 1));
        super.setVisibility(4);
    }

    private long getCurrentDurationMs() {
        ki.r0 r0Var;
        ki.s0 s0Var = this.P;
        if (s0Var == null || (r0Var = this.R) == null) {
            return 0L;
        }
        return r0Var.a == 3 ? s0Var.i() : r0Var.b;
    }

    public static void k(b60 b60Var) {
        ki.k0 k0Var;
        ki.r0 r0Var = b60Var.R;
        boolean z10 = false;
        boolean z11 = (r0Var == null || r0Var.a != 3 || r0Var.e) ? false : true;
        b60Var.G.setEnabled(z11);
        ci.v2 v2Var = b60Var.H;
        if (z11 && (k0Var = b60Var.S) != null && k0Var.b != 1) {
            z10 = true;
        }
        v2Var.setEnabled(z10);
        b60Var.v();
    }

    public static void l(b60 b60Var) {
        org.telegram.ui.il ilVar = b60Var.E;
        if (b60Var.k0) {
            b60Var.k0 = false;
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
        yp ypVar = this.B0;
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

    @Override // org.telegram.ui.Components.h60
    public final void a(boolean z10) {
        if (this.P == null) {
            return;
        }
        r(z10 ? 0 : 6);
        this.P.a();
        o01 o01Var = this.T;
        if (o01Var != null) {
            o01Var.d(true);
        }
        this.T = null;
        MediaController.getInstance().requestRecordAudioFocus(false);
        t(false, false);
    }

    @Override // org.telegram.ui.Components.h60
    public final void b(float f7, int i10) {
        ki.r0 r0Var;
        i2.f0 f0Var;
        if (this.P == null || (r0Var = this.R) == null || r0Var.a != 5) {
            return;
        }
        n();
        if (i10 == 0) {
            this.P.p();
            return;
        }
        if (i10 == 1) {
            ki.s0 s0Var = this.P;
            s0Var.getClass();
            ki.s0.s();
            if (s0Var.V != 5 || (f0Var = s0Var.R) == null) {
                return;
            }
            f0Var.e();
            s0Var.w(false);
            l.d dVar = s0Var.c;
            s0Var.R.J0();
            dVar.getClass();
            return;
        }
        if (i10 == 2) {
            ki.s0 s0Var2 = this.P;
            long j3 = (long) (f7 * this.R.b);
            s0Var2.getClass();
            ki.s0.s();
            if (s0Var2.V != 5 || s0Var2.R == null) {
                return;
            }
            long j10 = s0Var2.F;
            s0Var2.R.W0(5, Math.max(j10, Math.min(Math.max(j10, s0Var2.G - 1), j3)));
            s0Var2.c.getClass();
        }
    }

    @Override // org.telegram.ui.Components.h60
    public final void c(boolean z10) {
        setRecordingUiFrameClockActive(false);
        ValueAnimator valueAnimator = this.a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ki.s0 s0Var = this.P;
        if (s0Var != null) {
            ki.s0.s();
            int i10 = s0Var.V;
            if (i10 == 10) {
                if (!s0Var.B) {
                    s0Var.h();
                }
            } else if (i10 != 8) {
                s0Var.a();
            } else {
                s0Var.d();
                s0Var.q();
                s0Var.k.s();
                s0Var.B = true;
                s0Var.u(10);
                s0Var.l("released");
                s0Var.h.removeCallbacksAndMessages(null);
                s0Var.i.shutdown();
                s0Var.j.shutdown();
            }
            this.P = null;
        }
        o01 o01Var = this.T;
        if (o01Var != null) {
            o01Var.d(true ^ this.i0);
            this.T = null;
        }
        setScreenFlashEnabled(false);
        MediaController.getInstance().requestRecordAudioFocus(false);
        u();
        z50 z50Var = this.v;
        z50Var.setTranslationX(0.0f);
        this.p0 = 0.0f;
        z50Var.setTranslationY(0.0f + this.o0);
        z50Var.setImageReceiver(null);
        MediaController.getInstance().resumeByRewind();
    }

    @Override // org.telegram.ui.Components.h60
    public final boolean d() {
        ki.r0 r0Var = this.R;
        if (r0Var == null) {
            return false;
        }
        int i10 = r0Var.a;
        return i10 == 4 || i10 == 5 || i10 == 6;
    }

    @Override // org.telegram.ui.Components.h60
    public final void e(float f7) {
        float f10 = f7 * 0.5f;
        this.o0 = f10;
        this.v.setTranslationY(this.p0 + f10);
    }

    @Override // org.telegram.ui.Components.h60
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
            this.P.o();
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
            this.V = new a60(j3, i11, i12, z10, j10);
            ki.s0 s0Var2 = this.P;
            boolean z11 = this.h0;
            boolean z12 = !z11;
            s0Var2.getClass();
            ki.s0.s();
            int i13 = s0Var2.V;
            if (i13 == 3 || i13 == 5) {
                s0Var2.l.b("finish requested: state=" + hg.c.C(s0Var2.V) + ", includeAudio=" + z12 + ", durationMs=" + s0Var2.i() + ", trim=" + s0Var2.F + ".." + s0Var2.G);
                s0Var2.y = z12;
                if (s0Var2.V != 3) {
                    s0Var2.q();
                    s0Var2.u(7);
                    s0Var2.i.execute(new ki.g0(s0Var2, s0Var2.P, s0Var2.k() || z11, s0Var2.Q, z12, s0Var2.k() ? 1 : 2, s0Var2.O));
                    return;
                }
                s0Var2.D = s0Var2.i();
                s0Var2.x = true;
                s0Var2.d();
                s0Var2.h.removeCallbacks(s0Var2.S);
                s0Var2.u(7);
                boolean D = s0Var2.k.D();
                s0Var2.A = D;
                if (D) {
                    return;
                }
                s0Var2.g(new IllegalStateException("Unable to stop the camera segment"));
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
        this.T = new o01(this.h, this.r);
        this.Q = (ki.q0) pi.e.c.a();
        ki.j0 j0Var = new ki.j0(getContext(), this.y);
        j0Var.c = (ki.l0) pi.e.h.a();
        j0Var.d = this.Q;
        j0Var.g = pi.e.f.a();
        j0Var.e = (ki.m0) pi.e.d.a();
        j0Var.f = (ki.n0) pi.e.e.a();
        j0Var.h = pi.e.g.a();
        l.d dVar = this.C0;
        j0Var.i = dVar;
        o01 o01Var = this.T;
        j0Var.j = o01Var;
        j0Var.k = new mv(this, 6);
        if (j0Var.c == null) {
            throw new IllegalStateException("Initial camera is required");
        }
        if (j0Var.d == null) {
            throw new IllegalStateException("Output resolution is required");
        }
        if (j0Var.g <= 0) {
            throw new IllegalStateException("Video bitrate is required");
        }
        if (j0Var.e == null) {
            throw new IllegalStateException("Camera resolution is required");
        }
        if (j0Var.f == null) {
            throw new IllegalStateException("Frame rate is required");
        }
        if (dVar == null) {
            throw new IllegalStateException("Session listener is required");
        }
        if (o01Var == null) {
            throw new IllegalStateException("Output listener is required");
        }
        this.P = new ki.s0(j0Var);
        MediaController.getInstance().requestRecordAudioFocus(true);
        ki.s0 s0Var = this.P;
        s0Var.getClass();
        ki.s0.s();
        if (s0Var.V == 1) {
            try {
                s0Var.l.b("start requested");
                s0Var.c(true);
                s0Var.u(2);
                s0Var.k.C(s0Var.P, 0L, s0Var.o);
            } catch (Exception e) {
                s0Var.g(e);
            }
        }
        t(true, false);
    }

    @Override // org.telegram.ui.Components.h60
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
            this.P.o();
            return;
        }
        if (i10 == 5) {
            this.U = null;
            this.f0 = true;
            this.g0 = false;
            ki.s0.s();
            if (s0Var.V != 5 || s0Var.G - s0Var.F >= s0Var.n) {
                return;
            }
            s0Var.L++;
            s0Var.l.b("resume requested: trim=" + s0Var.F + ".." + s0Var.G + ", sourceDurationMs=" + s0Var.D);
            s0Var.q();
            s0Var.u(6);
            s0Var.i.execute(new ci.u1(s0Var, s0Var.k(), s0Var.P, s0Var.O, s0Var.Q));
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
        ki.s0.s();
        if (s0Var.V != 5) {
            return;
        }
        long max2 = Math.max(0L, Math.min(s0Var.D, max));
        long max3 = Math.max(max2, Math.min(s0Var.D, j3));
        if (max3 - max2 < Math.min(800L, s0Var.D)) {
            return;
        }
        s0Var.F = max2;
        s0Var.G = max3;
        i2.f0 f0Var = s0Var.R;
        if (f0Var != null) {
            f0Var.W0(5, max2);
        }
        s0Var.c.getClass();
        s0Var.n();
    }

    public final Bitmap o(Bitmap bitmap) {
        y50 y50Var = this.y;
        if (y50Var.getWidth() > 0 && y50Var.getHeight() > 0) {
            Matrix matrix = this.L;
            y50Var.getTransform(matrix);
            if (!matrix.isIdentity()) {
                float[] fArr = this.M;
                matrix.getValues(fArr);
                float width = bitmap.getWidth() / y50Var.getWidth();
                float height = bitmap.getHeight() / y50Var.getHeight();
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

    public final VideoEditedInfo p(File file, long j3, n01 n01Var) {
        ki.n0 n0Var;
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.startTime = -1L;
        videoEditedInfo.endTime = -1L;
        videoEditedInfo.estimatedDuration = j3;
        videoEditedInfo.estimatedSize = Math.max(1L, n01Var == null ? file.length() : n01Var.a);
        videoEditedInfo.roundVideo = true;
        ki.s0 s0Var = this.P;
        videoEditedInfo.framerate = (s0Var == null || (n0Var = s0Var.r) == null) ? 30 : n0Var.a;
        ki.q0 q0Var = this.Q;
        int i10 = q0Var == null ? 480 : q0Var.a;
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
            this.a0.addUpdateListener(new w50(this, 1));
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
        y50 y50Var = this.y;
        if (y50Var.isAvailable() && (bitmap = y50Var.getBitmap(180, 180)) != null) {
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

    public final void t(boolean z10, boolean z11) {
        d60 d60Var = this.a;
        if (d60Var != null) {
            ((org.telegram.ui.pe) d60Var).b.uc.a(z10, true);
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
        z50 z50Var = this.v;
        if (z10 && !this.j0) {
            z50Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.p0 = measuredHeight;
            z50Var.setTranslationY(measuredHeight + this.o0);
        }
        this.j0 = z10;
        View view = this.s;
        if (view != null) {
            view.invalidate();
        }
        float dp = (z10 || Math.max(getCurrentDurationMs(), this.n0) <= 300) ? 0.0f : AndroidUtilities.dp(24.0f) - (getMeasuredWidth() * 0.5f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 1.0f : 0.0f, z10 ? 0.0f : 1.0f);
        ofFloat.addUpdateListener(new w50(this, 0));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.W = animatorSet2;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        LinearLayout linearLayout = this.F;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, fArr), ObjectAnimator.ofFloat(z50Var, (Property<z50, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(z50Var, (Property<z50, Float>) View.SCALE_X, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(z50Var, (Property<z50, Float>) View.SCALE_Y, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(z50Var, (Property<z50, Float>) View.TRANSLATION_X, dp), ObjectAnimator.ofFloat(this.I, (Property<ImageView, Float>) property, (this.h0 && z10) ? 1.0f : 0.0f), ofFloat);
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
                ij0 ij0Var = new ij0(R.raw.roundcamera_flash_on, i10, i10);
                this.c0 = ij0Var;
                ij0Var.setCallback(v2Var);
            }
            v2Var.setImageDrawable(this.c0);
            return;
        }
        if (this.d0 == null) {
            ij0 ij0Var2 = new ij0(R.raw.roundcamera_flash_off, i10, i10);
            this.d0 = ij0Var2;
            ij0Var2.setCallback(v2Var);
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
