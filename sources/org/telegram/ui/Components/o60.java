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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class o60 extends u60 {
    public static final /* synthetic */ int K0 = 0;
    public int A0;
    public boolean B0;
    public boolean C0;
    public float D0;
    public final LinearLayout E;
    public int E0;
    public final fi.o2 F;
    public long F0;
    public final fi.o2 G;
    public boolean G0;
    public final ImageView H;
    public boolean H0;
    public final fi.q2 I;
    public final j60 I0;
    public final int[] J;
    public final li.e3 J0;
    public final Matrix K;
    public final float[] L;
    public final Paint M;
    public final int N;
    public vi.u0 O;
    public vi.s0 P;
    public vi.t0 Q;
    public vi.m0 R;
    public m11 S;
    public VideoEditedInfo T;
    public n60 U;
    public boolean V;
    public AnimatorSet W;
    public ValueAnimator a0;
    public ValueAnimator b0;
    public final yj0 c0;
    public yj0 d0;
    public final a60 e;
    public yj0 e0;
    public final int f;
    public boolean f0;
    public boolean g0;
    public final int h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public final boolean n;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public final View r;
    public long r0;
    public final m60 s;
    public int s0;
    public Bitmap t0;
    public long u0;
    public final en0 v;
    public float v0;
    public final FrameLayout w;
    public float w0;
    public final l60 x;
    public float x0;
    public final org.telegram.ui.il y;
    public float y0;
    public int z0;

    public o60(Activity activity, a60 a60Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity);
        this.f = UserConfig.selectedAccount;
        this.J = new int[2];
        this.K = new Matrix();
        this.L = new float[9];
        this.M = new Paint(3);
        this.z0 = -1;
        this.A0 = -1;
        this.D0 = Float.NaN;
        this.I0 = new j60(this, 0);
        this.J0 = new li.e3(this, 9);
        this.e = a60Var;
        this.h = a60Var.getClassGuid();
        this.n = a60Var.w();
        this.r = a60Var.getFragmentView();
        setWillNotDraw(false);
        fi.q2 q2Var = new fi.q2(activity, null, this, null);
        this.I = q2Var;
        q2Var.o = 0.5f;
        q2Var.n = fi.q2.f(0.5f);
        q2Var.g();
        addView(q2Var.b, kb1.i(-1, -1, 119));
        m60 m60Var = new m60(this, activity);
        this.s = m60Var;
        en0 en0Var = new en0(activity);
        this.v = en0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.w = frameLayout;
        l60 l60Var = new l60(this, activity, 0);
        l60Var.setOpaque(true);
        l60Var.setClickable(true);
        l60Var.setCameraDistance(AndroidUtilities.dp(8000.0f));
        l60Var.setOutlineProvider(new ag.v0(15));
        l60Var.setClipToOutline(true);
        this.x = l60Var;
        frameLayout.addView(l60Var, kb1.i(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.il ilVar = new org.telegram.ui.il(this, activity, paint);
        this.y = ilVar;
        ilVar.setOutlineProvider(new ag.v0(14));
        ilVar.setClipToOutline(true);
        frameLayout.addView(ilVar, kb1.i(-1, -1, 119));
        en0Var.addView(frameLayout, kb1.h(-1, -1.0f, 119, 14.0f, 14.0f, 14.0f, 14.0f));
        m60Var.addView(en0Var, kb1.i(-1, -1, 119));
        int i10 = AndroidUtilities.roundPlayingMessageSize;
        addView(m60Var, new FrameLayout.LayoutParams(i10, i10, 17));
        addView(q2Var.c, kb1.i(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.E = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        addView(linearLayout, kb1.h(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        fi.o2 o2Var = new fi.o2(activity);
        this.F = o2Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        o2Var.setScaleType(scaleType);
        o2Var.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        linearLayout.addView(o2Var, kb1.r(44, 44));
        final int i11 = 0;
        o2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.k60
            public final /* synthetic */ o60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vi.t0 t0Var;
                vi.m0 m0Var;
                boolean z10;
                vi.t0 t0Var2;
                int i12;
                switch (i11) {
                    case 0:
                        o60 o60Var = this.b;
                        vi.u0 u0Var = o60Var.O;
                        if (u0Var != null && (t0Var = o60Var.Q) != null && (m0Var = o60Var.R) != null && t0Var.a == 3 && !t0Var.f && !o60Var.n0) {
                            vi.n0 n0Var = m0Var.a;
                            vi.n0 n0Var2 = vi.n0.a;
                            if (n0Var == n0Var2) {
                                n0Var2 = vi.n0.b;
                            }
                            u0Var.getClass();
                            vi.u0.u();
                            int i13 = u0Var.Z;
                            if (i13 != 7 && i13 != 8 && i13 != 9 && i13 != 10) {
                                if (u0Var.r != n0Var2) {
                                    u0Var.m.b("camera facing requested: " + u0Var.r + " -> " + n0Var2 + ", state=" + b10.x(u0Var.Z));
                                    u0Var.r = n0Var2;
                                    int i14 = u0Var.Z;
                                    if (i14 == 3 || i14 == 2) {
                                        u0Var.e();
                                        vi.j jVar = u0Var.l;
                                        jVar.F = n0Var2;
                                        Handler handler = jVar.n;
                                        if (!jVar.V || handler == null) {
                                            z10 = false;
                                        } else {
                                            handler.post(new s9.g(27, jVar, n0Var2));
                                            z10 = true;
                                        }
                                        u0Var.y = z10;
                                    }
                                    u0Var.n();
                                    u0Var.o();
                                }
                                o60Var.c0.M(0);
                                o60Var.c0.start();
                                break;
                            }
                        }
                        break;
                    default:
                        o60 o60Var2 = this.b;
                        vi.u0 u0Var2 = o60Var2.O;
                        if (u0Var2 != null && (t0Var2 = o60Var2.Q) != null && o60Var2.R != null) {
                            boolean z11 = !t0Var2.g;
                            vi.j jVar2 = u0Var2.l;
                            vi.u0.u();
                            if (u0Var2.Z == 3 && !u0Var2.y && (i12 = u0Var2.a0) != 1) {
                                u0Var2.w = z11;
                                if (i12 == 3) {
                                    u0Var2.v(z11);
                                    jVar2.T(false);
                                } else {
                                    u0Var2.v(false);
                                    jVar2.T(z11);
                                }
                                u0Var2.o();
                                o60Var2.C();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        fi.o2 o2Var2 = new fi.o2(activity);
        this.G = o2Var2;
        o2Var2.setScaleType(scaleType);
        linearLayout.addView(o2Var2, kb1.r(44, 44));
        final int i12 = 1;
        o2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.k60
            public final /* synthetic */ o60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vi.t0 t0Var;
                vi.m0 m0Var;
                boolean z10;
                vi.t0 t0Var2;
                int i122;
                switch (i12) {
                    case 0:
                        o60 o60Var = this.b;
                        vi.u0 u0Var = o60Var.O;
                        if (u0Var != null && (t0Var = o60Var.Q) != null && (m0Var = o60Var.R) != null && t0Var.a == 3 && !t0Var.f && !o60Var.n0) {
                            vi.n0 n0Var = m0Var.a;
                            vi.n0 n0Var2 = vi.n0.a;
                            if (n0Var == n0Var2) {
                                n0Var2 = vi.n0.b;
                            }
                            u0Var.getClass();
                            vi.u0.u();
                            int i13 = u0Var.Z;
                            if (i13 != 7 && i13 != 8 && i13 != 9 && i13 != 10) {
                                if (u0Var.r != n0Var2) {
                                    u0Var.m.b("camera facing requested: " + u0Var.r + " -> " + n0Var2 + ", state=" + b10.x(u0Var.Z));
                                    u0Var.r = n0Var2;
                                    int i14 = u0Var.Z;
                                    if (i14 == 3 || i14 == 2) {
                                        u0Var.e();
                                        vi.j jVar = u0Var.l;
                                        jVar.F = n0Var2;
                                        Handler handler = jVar.n;
                                        if (!jVar.V || handler == null) {
                                            z10 = false;
                                        } else {
                                            handler.post(new s9.g(27, jVar, n0Var2));
                                            z10 = true;
                                        }
                                        u0Var.y = z10;
                                    }
                                    u0Var.n();
                                    u0Var.o();
                                }
                                o60Var.c0.M(0);
                                o60Var.c0.start();
                                break;
                            }
                        }
                        break;
                    default:
                        o60 o60Var2 = this.b;
                        vi.u0 u0Var2 = o60Var2.O;
                        if (u0Var2 != null && (t0Var2 = o60Var2.Q) != null && o60Var2.R != null) {
                            boolean z11 = !t0Var2.g;
                            vi.j jVar2 = u0Var2.l;
                            vi.u0.u();
                            if (u0Var2.Z == 3 && !u0Var2.y && (i122 = u0Var2.a0) != 1) {
                                u0Var2.w = z11;
                                if (i122 == 3) {
                                    u0Var2.v(z11);
                                    jVar2.T(false);
                                } else {
                                    u0Var2.v(false);
                                    jVar2.T(z11);
                                }
                                u0Var2.o();
                                o60Var2.C();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        int dp = AndroidUtilities.dp(24.0f);
        this.N = dp;
        yj0 yj0Var = new yj0(R.raw.roundcamera_flip, dp, dp);
        this.c0 = yj0Var;
        yj0Var.setCallback(o2Var);
        yj0Var.M(yj0Var.e[0] - 1);
        o2Var.setImageDrawable(yj0Var);
        C();
        if (u6Var != null && !u6Var.a()) {
            o2Var.setInvert(0.6f);
            o2Var2.setInvert(0.6f);
        }
        ImageView imageView = new ImageView(activity);
        this.H = imageView;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.video_mute);
        imageView.setAlpha(0.0f);
        addView(imageView, kb1.i(48, 48, 17));
        l60Var.setOnTouchListener(new rk(this, 2));
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
        vi.t0 t0Var;
        vi.u0 u0Var = this.O;
        if (u0Var == null || (t0Var = this.Q) == null) {
            return 0L;
        }
        return t0Var.a == 3 ? u0Var.j() : t0Var.b;
    }

    public static void m(o60 o60Var) {
        if (o60Var.n0 && o60Var.q0 && o60Var.o0 && o60Var.p0) {
            o60Var.n0 = false;
            FileLog.d("RoundVideo camera flip completed: elapsedMs=" + o60Var.getCameraFlipElapsedMs());
            o60Var.B();
        }
    }

    public static void n(o60 o60Var) {
        org.telegram.ui.il ilVar = o60Var.y;
        if (o60Var.l0) {
            o60Var.l0 = false;
            ilVar.invalidate();
            ilVar.animate().cancel();
            ilVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecordingUiFrameClockActive(boolean z10) {
        org.telegram.ui.jk jkVar;
        if (z10 == this.G0) {
            return;
        }
        this.G0 = z10;
        this.F0 = 0L;
        j60 j60Var = this.I0;
        if (z10) {
            ag.n.d().a(30, j60Var);
        } else {
            ag.n.d().g(j60Var);
        }
        if (this.d == z10) {
            return;
        }
        this.d = z10;
        s60 s60Var = this.c;
        if (s60Var == null || (jkVar = ((org.telegram.ui.nj) s60Var).a.Y) == null) {
            return;
        }
        jkVar.setRoundVideoUiFrameClockActive(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenFlashEnabled(boolean z10) {
        Activity parentActivity = this.e.getParentActivity();
        if (parentActivity == null) {
            parentActivity = AndroidUtilities.findActivity(getContext());
        }
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        fi.q2 q2Var = this.I;
        if (z10) {
            if (Float.isNaN(this.D0)) {
                this.D0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            q2Var.c(null);
        } else {
            if (!Float.isNaN(this.D0)) {
                attributes.screenBrightness = this.D0;
                this.D0 = Float.NaN;
            }
            q2Var.d();
        }
        parentActivity.getWindow().setAttributes(attributes);
    }

    public final void A() {
        if (this.C0) {
            this.C0 = false;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
        }
    }

    public final void B() {
        vi.m0 m0Var;
        vi.t0 t0Var = this.Q;
        boolean z10 = false;
        boolean z11 = (t0Var == null || t0Var.a != 3 || t0Var.f || this.n0) ? false : true;
        this.F.setEnabled(z11);
        if (z11 && (m0Var = this.R) != null && m0Var.b != 1) {
            z10 = true;
        }
        this.G.setEnabled(z10);
        C();
    }

    public final void C() {
        vi.t0 t0Var = this.Q;
        int i10 = this.N;
        fi.o2 o2Var = this.G;
        if (t0Var == null || !t0Var.g) {
            if (this.d0 == null) {
                yj0 yj0Var = new yj0(R.raw.roundcamera_flash_on, i10, i10);
                this.d0 = yj0Var;
                yj0Var.setCallback(o2Var);
            }
            o2Var.setImageDrawable(this.d0);
            return;
        }
        if (this.e0 == null) {
            yj0 yj0Var2 = new yj0(R.raw.roundcamera_flash_off, i10, i10);
            this.e0 = yj0Var2;
            yj0Var2.setCallback(o2Var);
        }
        o2Var.setImageDrawable(this.e0);
    }

    public final void D() {
        org.telegram.ui.jk jkVar;
        vi.t0 t0Var = this.Q;
        if (t0Var != null) {
            long j10 = t0Var.d;
            if (t0Var.a != 3) {
                return;
            }
            long min = Math.min(j10, (SystemClock.elapsedRealtime() + t0Var.b) - t0Var.c);
            this.u0 = min;
            this.v.setProgress(min / j10);
            s60 s60Var = this.c;
            if (s60Var == null || (jkVar = ((org.telegram.ui.nj) s60Var).a.Y) == null || !jkVar.j1) {
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
            ChatActivityEnterView.SlideTextView slideTextView = jkVar.k1;
            if (slideTextView == null || !slideTextView.J || slideTextView.n == 1.0f) {
                return;
            }
            slideTextView.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.u60
    public final void a(boolean z10) {
        vi.u0 u0Var = this.O;
        if (u0Var == null || !u0Var.a()) {
            return;
        }
        this.U = null;
        x(z10 ? 0 : 6);
        m11 m11Var = this.S;
        if (m11Var != null) {
            m11Var.d(true);
        }
        this.S = null;
        MediaController.getInstance().requestRecordAudioFocus(false);
        z(false, false);
    }

    @Override // org.telegram.ui.Components.u60
    public final void b(float f7, int i10) {
        vi.t0 t0Var;
        if (this.O == null || (t0Var = this.Q) == null || t0Var.a != 5) {
            return;
        }
        p();
        if (i10 == 0) {
            this.O.r();
            return;
        }
        if (i10 == 1) {
            this.O.p();
            return;
        }
        if (i10 == 2) {
            vi.u0 u0Var = this.O;
            long j10 = (long) (f7 * this.Q.b);
            u0Var.getClass();
            vi.u0.u();
            if (u0Var.Z != 5 || u0Var.V == null) {
                return;
            }
            long j11 = u0Var.J;
            u0Var.V.Z0(5, Math.max(j11, Math.min(Math.max(j11, u0Var.K - 1), j10)));
            u0Var.d.getClass();
        }
    }

    @Override // org.telegram.ui.Components.u60
    public final void c(boolean z10) {
        setRecordingUiFrameClockActive(false);
        r();
        ValueAnimator valueAnimator = this.a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        vi.u0 u0Var = this.O;
        if (u0Var != null) {
            vi.u0.u();
            int i10 = u0Var.Z;
            if (i10 == 10) {
                if (!u0Var.F) {
                    u0Var.i();
                }
            } else if (i10 != 8) {
                u0Var.a();
            } else {
                u0Var.e();
                u0Var.s();
                u0Var.l.M();
                u0Var.F = true;
                u0Var.w(10);
                u0Var.m("released");
                u0Var.i.removeCallbacksAndMessages(null);
                u0Var.j.shutdown();
                u0Var.k.shutdown();
            }
            this.O = null;
        }
        m11 m11Var = this.S;
        if (m11Var != null) {
            m11Var.d(true ^ this.j0);
            this.S = null;
        }
        setScreenFlashEnabled(false);
        MediaController.getInstance().requestRecordAudioFocus(false);
        A();
        m60 m60Var = this.s;
        m60Var.setTranslationX(0.0f);
        this.w0 = 0.0f;
        m60Var.setTranslationY(0.0f + this.v0);
        m60Var.setImageReceiver(null);
        MediaController.getInstance().resumeByRewind();
    }

    @Override // org.telegram.ui.Components.u60
    public final boolean e() {
        vi.t0 t0Var = this.Q;
        if (t0Var == null) {
            return false;
        }
        int i10 = t0Var.a;
        return i10 == 4 || i10 == 5 || i10 == 6;
    }

    @Override // org.telegram.ui.Components.u60
    public final void f(float f7) {
        float f10 = f7 * 0.5f;
        this.v0 = f10;
        this.s.setTranslationY(this.w0 + f10);
    }

    @Override // org.telegram.ui.Components.u60
    public final void g(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        if (this.O == null || this.Q == null) {
            return;
        }
        if (i10 == 3) {
            w();
            return;
        }
        if ((i10 == 1 || i10 == 4) && this.U == null) {
            long currentDurationMs = getCurrentDurationMs();
            if (currentDurationMs < 800) {
                NotificationCenter.getInstance(this.f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.h), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                a(false);
                return;
            }
            if (this.Q.a == 3) {
                x(5);
            }
            this.g0 = false;
            this.U = new n60(j10, i11, i12, z10, j11);
            t();
        }
    }

    @Override // org.telegram.ui.Components.u60
    public View getButtonsLayout() {
        return this.E;
    }

    @Override // org.telegram.ui.Components.u60
    public r60 getCameraContainer() {
        return this.s;
    }

    @Override // org.telegram.ui.Components.u60
    public RectF getCameraRect() {
        l60 l60Var = this.x;
        int[] iArr = this.J;
        l60Var.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], l60Var.getWidth() + r3, l60Var.getHeight() + iArr[1]);
    }

    @Override // org.telegram.ui.Components.u60
    public View getMuteImageView() {
        return this.H;
    }

    @Override // org.telegram.ui.Components.u60
    public Paint getPaint() {
        return this.v.getPaint();
    }

    @Override // org.telegram.ui.Components.u60
    public TextureView getTextureView() {
        return this.x;
    }

    @Override // org.telegram.ui.Components.u60
    public final void h(ch.b bVar, org.telegram.ui.fj fjVar) {
        LinearLayout linearLayout = this.E;
        eh.d c10 = bVar.c(linearLayout, fjVar, false);
        c10.w(AndroidUtilities.dp(6.0f));
        c10.x(AndroidUtilities.dp(21.0f));
        linearLayout.setBackground(c10);
    }

    @Override // org.telegram.ui.Components.u60
    public final void i(boolean z10) {
        if (this.O != null) {
            return;
        }
        setVisibility(0);
        this.v.getPaint().setAlpha(255);
        this.j0 = false;
        this.i0 = false;
        this.U = null;
        this.V = false;
        this.f0 = false;
        this.h0 = false;
        this.u0 = 0L;
        this.v.setProgress(0.0f);
        org.telegram.ui.il ilVar = this.y;
        if (!this.l0) {
            if (this.t0 == null) {
                try {
                    this.t0 = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.t0;
            if (bitmap != null) {
                ilVar.setImageBitmap(bitmap);
            } else {
                ilVar.setImageResource(R.drawable.icplaceholder);
            }
            this.l0 = true;
            ilVar.animate().cancel();
            ilVar.setAlpha(1.0f);
            ilVar.invalidate();
        }
        this.S = new m11(this.f, this.n);
        this.P = (vi.s0) wi.e.e.a();
        vi.l0 l0Var = new vi.l0(getContext(), this.x);
        l0Var.c = new File(ApplicationLoader.getFilesDirFixed(), "cache");
        l0Var.d = (vi.n0) wi.e.j.a();
        l0Var.e = this.P;
        l0Var.h = wi.e.h.a();
        l0Var.f = (vi.o0) wi.e.f.a();
        l0Var.g = (vi.p0) wi.e.g.a();
        wi.a aVar = wi.e.i;
        aVar.a();
        l0Var.i = aVar.d;
        li.e3 e3Var = this.J0;
        l0Var.j = e3Var;
        m11 m11Var = this.S;
        l0Var.k = m11Var;
        l0Var.l = new tv(this, 6);
        if (l0Var.d == null) {
            throw new IllegalStateException("Initial camera is required");
        }
        if (l0Var.e == null) {
            throw new IllegalStateException("Output resolution is required");
        }
        if (l0Var.h <= 0) {
            throw new IllegalStateException("Video bitrate is required");
        }
        if (l0Var.f == null) {
            throw new IllegalStateException("Camera resolution is required");
        }
        if (l0Var.g == null) {
            throw new IllegalStateException("Frame rate is required");
        }
        if (e3Var == null) {
            throw new IllegalStateException("Session listener is required");
        }
        if (m11Var == null) {
            throw new IllegalStateException("Output listener is required");
        }
        this.O = new vi.u0(l0Var);
        MediaController.getInstance().requestRecordAudioFocus(true);
        vi.u0 u0Var = this.O;
        u0Var.getClass();
        vi.u0.u();
        if (u0Var.Z == 1) {
            try {
                u0Var.m.b("start requested");
                u0Var.c(true);
                u0Var.w(2);
                u0Var.l.X(u0Var.T, 0L, u0Var.r);
            } catch (Exception e) {
                u0Var.h(e);
            }
        }
        z(true, false);
    }

    @Override // org.telegram.ui.Components.u60
    public final void j() {
        vi.t0 t0Var;
        vi.u0 u0Var = this.O;
        if (u0Var == null || (t0Var = this.Q) == null) {
            return;
        }
        int i10 = t0Var.a;
        if (i10 == 3) {
            w();
            return;
        }
        if (i10 == 5) {
            vi.u0.u();
            if (u0Var.Z != 5 || u0Var.K - u0Var.J >= u0Var.q) {
                return;
            }
            u0Var.P++;
            u0Var.D = false;
            u0Var.m.b("resume requested: trim=" + u0Var.J + ".." + u0Var.K + ", sourceDurationMs=" + u0Var.H);
            u0Var.s();
            u0Var.w(6);
            u0Var.j.execute(new fi.r1(u0Var, u0Var.l(), u0Var.T, u0Var.S, u0Var.U));
            this.T = null;
            this.g0 = true;
            this.h0 = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setScreenFlashEnabled(false);
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
            m60 m60Var = this.s;
            m60Var.getLayoutParams().width = AndroidUtilities.dp(28.0f) + i12;
            m60Var.getLayoutParams().height = AndroidUtilities.dp(28.0f) + i12;
            ((FrameLayout.LayoutParams) this.H.getLayoutParams()).topMargin = (i12 / 2) - AndroidUtilities.dp(24.0f);
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30);
        fi.q2 q2Var = this.I;
        q2Var.b.measure(makeMeasureSpec, makeMeasureSpec2);
        q2Var.c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return motionEvent.getAction() != 0 || motionEvent.getY() <= ((float) (getMeasuredHeight() - getPaddingBottom()));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        vi.u0 u0Var;
        vi.t0 t0Var;
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0 || (u0Var = this.O) == null || (t0Var = this.Q) == null) {
            return;
        }
        if (t0Var.a == 3) {
            w();
        } else if (t0Var.e) {
            u0Var.p();
        }
    }

    public final void p() {
        vi.t0 t0Var;
        VideoEditedInfo videoEditedInfo;
        if (this.O == null || (t0Var = this.Q) == null || (videoEditedInfo = this.T) == null) {
            return;
        }
        long j10 = t0Var.b;
        long max = Math.max(0L, videoEditedInfo.startTime);
        long j11 = this.T.endTime;
        if (j11 >= 0) {
            j10 = Math.min(j10, j11);
        }
        vi.u0 u0Var = this.O;
        u0Var.getClass();
        vi.u0.u();
        if (u0Var.Z != 5) {
            return;
        }
        long max2 = Math.max(0L, Math.min(u0Var.H, max));
        long max3 = Math.max(max2, Math.min(u0Var.H, j10));
        if (max3 - max2 < Math.min(800L, u0Var.H)) {
            return;
        }
        u0Var.J = max2;
        u0Var.K = max3;
        i2.j0 j0Var = u0Var.V;
        if (j0Var != null) {
            j0Var.Z0(5, max2);
        }
        u0Var.d.getClass();
        u0Var.o();
    }

    public final Bitmap q(Bitmap bitmap) {
        l60 l60Var = this.x;
        if (l60Var.getWidth() > 0 && l60Var.getHeight() > 0) {
            Matrix matrix = this.K;
            l60Var.getTransform(matrix);
            if (!matrix.isIdentity()) {
                float[] fArr = this.L;
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
                new Canvas(createBitmap).drawBitmap(bitmap, matrix, this.M);
                bitmap.recycle();
                return createBitmap;
            }
        }
        return bitmap;
    }

    public final void r() {
        if (this.n0 || this.b0 != null) {
            this.s0++;
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.b0.cancel();
                this.b0 = null;
            }
            FrameLayout frameLayout = this.w;
            frameLayout.animate().cancel();
            frameLayout.animate().setListener(null);
            frameLayout.setRotationY(0.0f);
            this.n0 = false;
            this.o0 = false;
            this.p0 = false;
            this.q0 = false;
            v(false);
        }
    }

    public final VideoEditedInfo s(File file, long j10, l11 l11Var) {
        vi.p0 p0Var;
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.startTime = -1L;
        videoEditedInfo.endTime = -1L;
        videoEditedInfo.estimatedDuration = j10;
        videoEditedInfo.estimatedSize = Math.max(1L, l11Var == null ? file.length() : l11Var.a);
        videoEditedInfo.roundVideo = true;
        vi.u0 u0Var = this.O;
        videoEditedInfo.framerate = (u0Var == null || (p0Var = u0Var.u) == null) ? 30 : p0Var.a;
        vi.s0 s0Var = this.P;
        int i10 = s0Var == null ? 480 : s0Var.a;
        videoEditedInfo.originalWidth = i10;
        videoEditedInfo.resultWidth = i10;
        videoEditedInfo.originalHeight = i10;
        videoEditedInfo.resultHeight = i10;
        videoEditedInfo.originalPath = file.getAbsolutePath();
        if (l11Var != null) {
            videoEditedInfo.file = l11Var.b;
            videoEditedInfo.encryptedFile = l11Var.c;
            videoEditedInfo.key = l11Var.d;
            videoEditedInfo.iv = l11Var.e;
        }
        return videoEditedInfo;
    }

    @Override // org.telegram.ui.Components.u60
    public void setInternalPadding(int i10) {
        setPadding(0, 0, 0, i10);
    }

    @Override // org.telegram.ui.Components.u60
    public void setIsMessageTransition(boolean z10) {
        this.s.getClass();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.E.setAlpha(0.0f);
        m60 m60Var = this.s;
        m60Var.setAlpha(0.0f);
        m60Var.setScaleX(0.1f);
        m60Var.setScaleY(0.1f);
        m60Var.setTranslationX(0.0f);
        ImageView imageView = this.H;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        this.v.getPaint().setAlpha(0);
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
        vi.t0 t0Var;
        if (this.U == null || this.V || this.O == null || (t0Var = this.Q) == null) {
            return;
        }
        int i10 = t0Var.a;
        if (i10 == 5) {
            p();
        } else if (i10 != 3) {
            return;
        }
        vi.u0 u0Var = this.O;
        boolean z10 = this.i0;
        boolean z11 = !z10;
        u0Var.getClass();
        vi.u0.u();
        int i11 = u0Var.Z;
        boolean z12 = false;
        if (i11 == 3 || i11 == 5) {
            u0Var.m.b("finish requested: state=" + b10.x(u0Var.Z) + ", includeAudio=" + z11 + ", durationMs=" + u0Var.j() + ", trim=" + u0Var.J + ".." + u0Var.K);
            u0Var.B = z11;
            if (u0Var.Z == 3) {
                u0Var.H = u0Var.j();
                u0Var.A = true;
                u0Var.e();
                u0Var.i.removeCallbacks(u0Var.W);
                u0Var.w(7);
                boolean Y = u0Var.l.Y();
                u0Var.E = Y;
                if (!Y) {
                    u0Var.h(new IllegalStateException("Unable to stop the camera segment"));
                }
            } else {
                u0Var.s();
                u0Var.w(7);
                u0Var.j.execute(new bi.rb(u0Var, u0Var.T, u0Var.l() || z10, u0Var.U, z11, u0Var.l() ? 1 : 2, u0Var.S));
            }
            z12 = true;
        }
        this.V = z12;
    }

    public final void u() {
        if (this.B0) {
            this.B0 = false;
            this.z0 = -1;
            this.A0 = -1;
            if (this.O == null) {
                return;
            }
            ValueAnimator valueAnimator = this.a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y0, 0.0f);
            this.a0 = ofFloat;
            ofFloat.setDuration(350L);
            this.a0.addUpdateListener(new i60(this, 1));
            this.a0.start();
        }
    }

    public final void v(boolean z10) {
        if (this.m0) {
            this.m0 = false;
            org.telegram.ui.il ilVar = this.y;
            ilVar.animate().cancel();
            if (z10) {
                ilVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
            } else {
                ilVar.setAlpha(0.0f);
            }
        }
    }

    public final void w() {
        vi.t0 t0Var;
        if (this.O == null || (t0Var = this.Q) == null || t0Var.a != 3) {
            return;
        }
        x(2);
        this.O.q();
    }

    public final void x(int i10) {
        if (this.h0 && i10 == 2) {
            return;
        }
        this.h0 = true;
        NotificationCenter.getInstance(this.f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.h), Integer.valueOf(i10));
    }

    public final void y(boolean z10) {
        Bitmap bitmap;
        l60 l60Var = this.x;
        if (l60Var.isAvailable() && (bitmap = l60Var.getBitmap(180, 180)) != null) {
            try {
                if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2) != 0) {
                    bitmap = q(bitmap);
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

    public final void z(boolean z10, boolean z11) {
        q60 q60Var = this.a;
        int i10 = 1;
        if (q60Var != null) {
            ((org.telegram.ui.qe) q60Var).b.Wc.a(z10, true);
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
        m60 m60Var = this.s;
        if (z10 && !this.k0) {
            m60Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.w0 = measuredHeight;
            m60Var.setTranslationY(measuredHeight + this.v0);
        }
        this.k0 = z10;
        View view = this.r;
        if (view != null) {
            view.invalidate();
        }
        float dp = (z10 || Math.max(getCurrentDurationMs(), this.u0) <= 300) ? 0.0f : AndroidUtilities.dp(24.0f) - (getMeasuredWidth() * 0.5f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 1.0f : 0.0f, z10 ? 0.0f : 1.0f);
        ofFloat.addUpdateListener(new i60(this, 0));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.W = animatorSet2;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        LinearLayout linearLayout = this.E;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, fArr), ObjectAnimator.ofFloat(m60Var, (Property<m60, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(m60Var, (Property<m60, Float>) View.SCALE_X, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(m60Var, (Property<m60, Float>) View.SCALE_Y, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(m60Var, (Property<m60, Float>) View.TRANSLATION_X, dp), ObjectAnimator.ofFloat(this.H, (Property<ImageView, Float>) property, (this.i0 && z10) ? 1.0f : 0.0f), ofFloat);
        this.W.setDuration(180L);
        this.W.setInterpolator(new DecelerateInterpolator());
        if (z10) {
            setTranslationX(0.0f);
        } else {
            this.W.addListener(new i10(this, i10));
        }
        this.W.start();
    }
}
