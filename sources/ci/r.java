package ci;

import ai.xa;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import ei.qb;
import ei.vb;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.x20;
import org.telegram.ui.ey;
import org.telegram.ui.vw;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public abstract class r extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, ne.d {
    public boolean A0;
    public final float B0;
    public ValueAnimator C0;
    public ValueAnimator D0;
    public final n E;
    public float E0;
    public final n F;
    public ValueAnimator F0;
    public final Paint G;
    public float G0;
    public final Paint H;
    public ValueAnimator H0;
    public final fd I;
    public float I0;
    public ei.x3 J;
    public OvershootInterpolator J0;
    public boolean K;
    public AnimatorSet K0;
    public int L;
    public final c2.b L0;
    public int M;
    public long M0;
    public float N;
    public Drawable N0;
    public int O;
    public final ArrayList P;
    public final ArrayList Q;
    public final s4.k R;
    public final s4.b0 S;
    public final org.telegram.ui.Components.q6 T;
    public final k U;
    public final ImageView V;
    public final ImageView W;
    public final ne.b a;
    public final org.telegram.ui.Components.p5 a0;
    public final int b;
    public final ArrayList b0;
    public final Drawable c;
    public float c0;
    public final m d;
    public float d0;
    public int e;
    public final ey e0;
    public final int f;
    public CharSequence f0;
    public boolean g0;
    public final j h;
    public int h0;
    public SpannableStringBuilder i0;
    public ValueAnimator j0;
    public p k0;
    public boolean l0;
    public boolean m0;
    public ck0 n;
    public float n0;
    public int o0;
    public q p0;
    public org.telegram.ui.ActionBar.k q0;
    public final j r;
    public y7 r0;
    public final h7 s;
    public float s0;
    public final float t0;
    public final float u0;
    public final ArrayList v;
    public final float v0;
    public final ArrayList w;
    public final a4.d w0;
    public final ArrayList x;
    public LinearGradient x0;
    public final ArrayList y;
    public Matrix y0;
    public Paint z0;

    public r(Context context, ey eyVar, int i10, int i11) {
        super(context);
        this.a = new ne.b(1, this, bs.h, 380L, false);
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new ArrayList();
        vw vwVar = (vw) this;
        n nVar = new n(vwVar, false);
        this.E = nVar;
        n nVar2 = new n(vwVar, true);
        this.F = nVar2;
        Paint paint = new Paint();
        this.G = new Paint(1);
        this.H = new Paint(1);
        fd fdVar = new fd(this);
        this.I = fdVar;
        this.N = -1.0f;
        this.O = -1;
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.b0 = new ArrayList();
        this.c0 = -1.0f;
        this.l0 = true;
        this.t0 = 1.0f;
        this.u0 = 0.95f;
        this.v0 = 0.9f;
        this.w0 = new a4.d(9);
        this.B0 = 0.3f;
        this.E0 = 1.0f;
        new OvershootInterpolator(0.9f);
        this.J0 = new OvershootInterpolator(0.95f);
        c2.b bVar = new c2.b(this);
        this.L0 = bVar;
        this.b = i11;
        this.f = i10;
        this.e0 = eyVar;
        this.s0 = AndroidUtilities.dp(68.0f);
        this.s = MessagesController.getInstance(i10).getStoriesController();
        j jVar = new j(vwVar, context, 0);
        this.h = jVar;
        jVar.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        jVar.setClipToPadding(false);
        jVar.setClipChildren(false);
        fdVar.h = new androidx.fragment.app.d(vwVar, 6);
        ah.j jVar2 = new ah.j(vwVar, 5);
        fdVar.l = true;
        fdVar.j = jVar2;
        jVar.j(new ah.d0(vwVar, 5));
        s4.k kVar = new s4.k();
        this.R = kVar;
        kVar.C = false;
        kVar.n(150L);
        kVar.m = false;
        jVar.setItemAnimator(kVar);
        s4.b0 b0Var = new s4.b0(0, false);
        this.S = b0Var;
        jVar.setLayoutManager(b0Var);
        jVar.setOnItemClickListener(new xa(vwVar, 4));
        jVar.setOnItemLongClickListener(new a1.c(vwVar, 13));
        jVar.setAdapter(nVar);
        addView(jVar, w7.z5.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(getContext(), true, true, false);
        this.T = q6Var;
        q6Var.setGravity(3);
        q6Var.setTextColor(getTextLogoColor());
        q6Var.setTypeface(AndroidUtilities.bold());
        q6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        q6Var.setTextSize(AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        q6Var.setImportantForAccessibility(1);
        q6Var.setFocusableInTouchMode(true);
        addView(q6Var, w7.z5.c(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.V = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AppName));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.telegram_logo_2);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, w7.z5.c(22.0f, 90));
        org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(AndroidUtilities.dp(26.0f), null);
        this.a0 = p5Var;
        p5Var.a = true;
        p5Var.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.W = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(p5Var);
        addView(imageView2, w7.z5.c(40.0f, 40));
        k kVar2 = new k(vwVar, context, bVar);
        this.U = kVar2;
        addView(kVar2, w7.z5.c(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.c = getContext().getDrawable(R.drawable.msg_mini_addstory);
        j jVar3 = new j(vwVar, getContext(), 1);
        this.r = jVar3;
        getContext();
        jVar3.setLayoutManager(new s4.b0(0, false));
        jVar3.i(new l(0));
        m mVar = new m();
        this.d = mVar;
        mVar.C = false;
        mVar.m = false;
        jVar3.setItemAnimator(mVar);
        jVar3.setAdapter(nVar2);
        jVar3.setClipChildren(false);
        addView(jVar3, w7.z5.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        setClipChildren(false);
        setClipToPadding(false);
        d();
        q(false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTextColor() {
        return this.b == 0 ? f(org.telegram.ui.ActionBar.k6.A8) : f(org.telegram.ui.ActionBar.k6.P8);
    }

    private int getTextLogoColor() {
        return f(org.telegram.ui.ActionBar.k6.gl);
    }

    public final void b() {
        this.N = 1.0f - AndroidUtilities.lerp(1.0f - this.c0, 1.0f, 1.0f - this.d0);
        d();
        float f7 = this.N;
        int i10 = f7 == 1.0f ? 2 : f7 != 0.0f ? 1 : 0;
        if (this.O != i10) {
            this.O = i10;
            if (i10 != 1 && this.K) {
                AndroidUtilities.runOnUIThread(new d(this, 0));
            }
            int i11 = this.O;
            j jVar = this.r;
            j jVar2 = this.h;
            if (i11 == 0) {
                AndroidUtilities.forEachViews((RecyclerView) jVar2, (Utilities.Callback<View>) new e(0));
                jVar.setVisibility(4);
                jVar2.setVisibility(0);
                if (System.currentTimeMillis() >= this.M0) {
                    this.M0 = System.currentTimeMillis() + 60000;
                }
            } else {
                int i12 = this.f;
                if (i11 == 1) {
                    ArrayList arrayList = this.Q;
                    arrayList.clear();
                    int i13 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.x;
                        if (i13 >= arrayList2.size()) {
                            break;
                        }
                        if (((o) arrayList2.get(i13)).c != UserConfig.getInstance(i12).getClientUserId() || m()) {
                            arrayList.add(Long.valueOf(((o) arrayList2.get(i13)).c));
                            if (arrayList.size() == 3) {
                                break;
                            }
                        }
                        i13++;
                    }
                    jVar.setVisibility(4);
                    jVar2.setVisibility(0);
                } else if (i11 == 2) {
                    jVar.setVisibility(0);
                    jVar2.setVisibility(4);
                    this.S.h1(0, 0);
                    ah.g gVar = MessagesController.getInstance(i12).getStoriesController().K;
                    AndroidUtilities.cancelRunOnUIThread(gVar);
                    gVar.run();
                    y7 y7Var = this.r0;
                    if (y7Var != null) {
                        y7Var.a();
                        this.r0 = null;
                    }
                }
            }
            invalidate();
        }
        invalidate();
    }

    public final void c() {
        int N0;
        s4.b0 b0Var = this.S;
        int N02 = b0Var.N0() + 10;
        ArrayList arrayList = this.x;
        int size = arrayList.size();
        h7 h7Var = this.s;
        if (N02 > size || ((N0 = b0Var.N0() + 9) < arrayList.size() && h7Var.D(0, ((o) arrayList.get(N0)).c) == 0)) {
            boolean z10 = this.b == 1;
            if (z10) {
                if (!h7Var.z) {
                    return;
                }
            } else if (!h7Var.p) {
                return;
            }
            h7Var.Q(z10);
        }
    }

    public final void d() {
        float a2 = w7.r.a(Math.min(this.N, this.d0), 0.0f, 1.0f);
        float f7 = this.a.e;
        float f10 = 1.0f - f7;
        float f11 = f7 * a2;
        float f12 = f10 * a2;
        org.telegram.ui.Components.q6 q6Var = this.T;
        if (q6Var != null) {
            q6Var.setAlpha(f11);
            q6Var.setVisibility(f11 > 0.0f ? 0 : 8);
        }
        ImageView imageView = this.V;
        if (imageView != null) {
            imageView.setAlpha(f12);
            imageView.setVisibility(f12 > 0.0f ? 0 : 8);
        }
        ImageView imageView2 = this.W;
        if (imageView2 != null) {
            imageView2.setAlpha(f12);
            imageView2.setVisibility(f12 > 0.0f ? 0 : 8);
        }
        k kVar = this.U;
        if (kVar != null) {
            kVar.setAlpha(a2);
            kVar.setVisibility(a2 > 0.0f ? 0 : 8);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesUpdated && this.l0) {
            q(getVisibility() == 0, false);
            AndroidUtilities.runOnUIThread(new d(this, 2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03a6  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i10;
        float f7;
        float f10;
        j jVar;
        float f11;
        float f12;
        j jVar2;
        boolean z10;
        Canvas canvas2;
        boolean z11;
        float f13;
        double d;
        boolean z12;
        float f14;
        float f15;
        j jVar3;
        float f16;
        float dp;
        float f17;
        float lerp;
        float f18;
        float lerp2;
        int i11;
        float f19;
        float f20;
        float lerp3;
        float f21;
        float f22;
        int R;
        canvas.save();
        int i12 = this.L;
        if (i12 > 0) {
            canvas.clipRect(0, i12, getMeasuredWidth(), getMeasuredHeight());
        }
        float measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(4.0f);
        float f23 = 0.0f;
        float lerp4 = AndroidUtilities.lerp(0.0f, measuredHeight, this.c0);
        j jVar4 = this.h;
        jVar4.setTranslationY(lerp4);
        j jVar5 = this.r;
        jVar5.setTranslationY(lerp4);
        jVar5.setTranslationX(this.s0);
        int i13 = 0;
        while (true) {
            arrayList = this.P;
            if (i13 >= arrayList.size()) {
                break;
            }
            ((q) arrayList.get(i13)).a = false;
            i13++;
        }
        arrayList.clear();
        int i14 = this.O;
        int i15 = -1;
        ArrayList arrayList2 = this.Q;
        if ((i14 == 1 || i14 == 0) && !arrayList2.isEmpty()) {
            i10 = -1;
            f7 = 4.0f;
            for (int i16 = 0; i16 < jVar4.getChildCount(); i16++) {
                q qVar = (q) jVar4.getChildAt(i16);
                i10 = qVar.E == ((Long) arrayList2.get(0)).longValue() ? RecyclerView.R(qVar) : i10;
            }
        } else {
            f7 = 4.0f;
            i10 = this.O == 2 ? 0 : -1;
        }
        int i17 = this.O;
        if (i17 < 0 || i17 == 2) {
            f10 = lerp4;
            jVar = jVar4;
            f11 = 2.0f;
            float f24 = 0.0f;
            for (int i18 = 0; i18 < jVar5.getChildCount(); i18++) {
                float x10 = ((q) jVar5.getChildAt(i18)).getX() + jVar5.getX() + r4.getMeasuredWidth();
                if (f24 == 0.0f || x10 > f24) {
                    f24 = x10;
                }
            }
            f12 = f24;
        } else {
            if (i10 == -1) {
                s4.b0 b0Var = this.S;
                i10 = b0Var.I0();
                if (i10 == -1) {
                    i10 = b0Var.L0();
                }
                z11 = true;
            } else {
                z11 = false;
            }
            jVar4.setAlpha(1.0f - Utilities.clamp(this.N / this.B0, 1.0f, 0.0f));
            this.o0 = -1;
            if (this.n0 != 0.0f) {
                int i19 = -1;
                int i20 = 0;
                f11 = 2.0f;
                while (i20 < jVar4.getChildCount()) {
                    View childAt = jVar4.getChildAt(i20);
                    if (childAt.getX() < f23 || childAt.getX() + childAt.getMeasuredWidth() > getMeasuredWidth() || (R = RecyclerView.R(childAt)) < 0 || (i19 != i15 && R >= i19)) {
                        f22 = lerp4;
                    } else {
                        f22 = lerp4;
                        if (((o) this.x.get(R)).c != UserConfig.getInstance(this.f).clientUserId) {
                            this.p0 = (q) childAt;
                            i19 = R;
                        }
                    }
                    i20++;
                    lerp4 = f22;
                    i15 = -1;
                    f23 = 0.0f;
                }
                f10 = lerp4;
                this.o0 = i19;
            } else {
                f10 = lerp4;
                f11 = 2.0f;
            }
            float f25 = 0.0f;
            int i21 = 0;
            while (i21 < jVar4.getChildCount()) {
                q qVar2 = (q) jVar4.getChildAt(i21);
                qVar2.setClipInParent(false);
                x7 x7Var = qVar2.O;
                int R2 = RecyclerView.R(qVar2);
                float f26 = this.N;
                if (R2 >= i10 && R2 < arrayList2.size() + i10) {
                    int i22 = R2 - i10;
                    if (i22 == i10 + 2) {
                        f26 = this.N;
                    } else if (i22 == i10 + 1) {
                        f13 = measuredHeight;
                        f26 = (float) Math.pow(this.N, 0.5d);
                        d = 0.25d;
                        if (R2 < i10) {
                            f26 = (float) Math.pow(this.N, d);
                        }
                        qVar2.d(f26, this.d0, this.n0, this.o0 == qVar2.b);
                        if (R2 > i10 || R2 >= arrayList2.size() + i10) {
                            z12 = z11;
                            f14 = f25;
                            f15 = f26;
                            jVar3 = jVar4;
                            f16 = 0.0f;
                            x7Var.g = 0.0f;
                            x7Var.h = 0.0f;
                            x7Var.i = 0.0f;
                            x7Var.j = 0.0f;
                            x7Var.k = false;
                        } else {
                            q qVar3 = (q) jVar4.getChildAt(i21 - 1);
                            if (qVar3 != null) {
                                x7 x7Var2 = qVar3.O;
                                float dp2 = AndroidUtilities.dp(48.0f);
                                float dp3 = AndroidUtilities.dp(26.33f);
                                z12 = z11;
                                float lerp5 = (AndroidUtilities.lerp(dp2, dp3, qVar3.J) + AndroidUtilities.dp(8.0f)) / f11;
                                float lerp6 = (AndroidUtilities.lerp(dp2, dp3, qVar2.J) + AndroidUtilities.dp(8.0f)) / f11;
                                float x11 = qVar3.getX() + x7Var2.F.centerX();
                                float y3 = qVar3.getY() + x7Var2.F.centerY();
                                float x12 = (qVar2.getX() + x7Var.F.centerX()) - x11;
                                float y10 = (qVar2.getY() + x7Var.F.centerY()) - y3;
                                f14 = f25;
                                if (((float) Math.sqrt((y10 * y10) + (x12 * x12))) < lerp5 + lerp6) {
                                    float degrees = (float) Math.toDegrees(Math.acos(r1 / r3) * 2.0d);
                                    f15 = f26;
                                    jVar3 = jVar4;
                                    float degrees2 = (float) Math.toDegrees(Math.atan2(y10, x12));
                                    float f27 = degrees / f11;
                                    x7Var2.g = degrees2 - f27;
                                    x7Var2.h = degrees2 + f27;
                                    float degrees3 = (float) Math.toDegrees(Math.atan2(-y10, -x12));
                                    float f28 = -Math.abs(degrees3 - f27);
                                    float abs = Math.abs(degrees3 + f27);
                                    x7Var.i = f28;
                                    x7Var.j = abs;
                                    f16 = 0.0f;
                                } else {
                                    f15 = f26;
                                    jVar3 = jVar4;
                                    f16 = 0.0f;
                                    x7Var2.g = 0.0f;
                                    x7Var2.h = 0.0f;
                                    x7Var.i = 0.0f;
                                    x7Var.j = 0.0f;
                                }
                                x7Var2.k = false;
                                x7Var.k = false;
                            } else {
                                z12 = z11;
                                f14 = f25;
                                f15 = f26;
                                jVar3 = jVar4;
                                f16 = 0.0f;
                            }
                        }
                        dp = AndroidUtilities.dp(16.0f) * Utilities.clamp((this.n0 - 0.5f) / 0.5f, 1.0f, f16);
                        float f29 = (float) (((1.0f - r2) * 0.5f) + 0.5d);
                        if (R2 <= i10) {
                            f17 = 0.0f;
                            lerp = 0.0f;
                        } else if (R2 == i10 + 1) {
                            lerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), 0.0f, this.N) + ((AndroidUtilities.dp(16.0f) * f15) - AndroidUtilities.dpf2(0.5f));
                            f17 = 0.0f;
                        } else {
                            f17 = 0.0f;
                            lerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), 0.0f, this.N) + (((AndroidUtilities.dp(16.0f) * f15) + AndroidUtilities.dp(16.0f)) - AndroidUtilities.dpf2(0.5f));
                        }
                        float f30 = lerp + this.s0;
                        if (this.A0) {
                            f18 = 0.0f;
                            lerp2 = AndroidUtilities.lerp(0.0f, f30 - qVar2.getLeft(), this.J0.getInterpolation(this.E0));
                        } else {
                            if (this.n0 > f17) {
                                int i23 = qVar2.b;
                                int i24 = this.o0;
                                if (i23 < i24) {
                                    f21 = -dp;
                                } else if (i23 > i24) {
                                    f21 = dp;
                                }
                                lerp2 = AndroidUtilities.lerp(f30 - qVar2.getLeft(), f21, 1.0f - this.I0);
                                f18 = 0.0f;
                            }
                            f21 = 0.0f;
                            lerp2 = AndroidUtilities.lerp(f30 - qVar2.getLeft(), f21, 1.0f - this.I0);
                            f18 = 0.0f;
                        }
                        float a2 = w7.r.a((this.c0 - 0.2f) / 0.1f, f18, 1.0f);
                        i11 = R2 - i10;
                        if (i11 == 0) {
                            f19 = 0.65f;
                            lerp3 = AndroidUtilities.lerp(f18, f10 - f13, bs.h.getInterpolation(this.N));
                        } else {
                            f19 = 0.65f;
                            if (i11 == 1) {
                                lerp3 = AndroidUtilities.lerp(f18, (f10 - f13) * 0.65f, bs.h.getInterpolation(this.N));
                            } else {
                                f20 = f18;
                                float f31 = (qVar2.b == this.o0 || this.n0 <= f18) ? 0.0f : (-dp) / f11;
                                float lerp7 = AndroidUtilities.lerp(i11 != 0 ? AndroidUtilities.lerp(f31, f10 - f13, this.G0) : i11 == 1 ? AndroidUtilities.lerp(f31, (f10 - f13) * f19, this.G0) : 0.0f, f20, a2);
                                if (this.N <= 0.0f) {
                                    boolean z13 = R2 >= i10 && R2 <= i10 + 2;
                                    if (!z12) {
                                        qVar2.setCrossfadeTo(-1L);
                                    } else if (i11 < 0 || i11 >= arrayList2.size()) {
                                        qVar2.setCrossfadeTo(-1L);
                                    } else {
                                        qVar2.setCrossfadeTo(((Long) arrayList2.get(i11)).longValue());
                                    }
                                    qVar2.a = z13;
                                    qVar2.d = R2 == i10;
                                    qVar2.c = R2 >= (arrayList2.size() + i10) + (-1);
                                    qVar2.setTranslationX(lerp2);
                                    qVar2.setTranslationY(lerp7);
                                    if (z13) {
                                        arrayList.add(qVar2);
                                    }
                                } else if (jVar3.getItemAnimator() == null || !jVar3.getItemAnimator().k()) {
                                    if (this.n0 > 0.0f) {
                                        int i25 = qVar2.b;
                                        int i26 = this.o0;
                                        if (i25 < i26) {
                                            qVar2.setAlpha(f29);
                                        } else if (i25 > i26) {
                                            qVar2.setAlpha(f29);
                                        } else {
                                            qVar2.setAlpha(1.0f);
                                        }
                                    } else {
                                        qVar2.setAlpha(1.0f);
                                    }
                                    qVar2.setTranslationX(lerp2);
                                    qVar2.setTranslationY(lerp7);
                                }
                                if (qVar2.a) {
                                    float dp4 = (AndroidUtilities.dp(70.0f) / f11) + (qVar2.getMeasuredWidth() / f11) + qVar2.getX() + jVar3.getX();
                                    if (f14 == 0.0f || dp4 > f14) {
                                        f25 = dp4;
                                        i21++;
                                        measuredHeight = f13;
                                        z11 = z12;
                                        jVar4 = jVar3;
                                    }
                                }
                                f25 = f14;
                                i21++;
                                measuredHeight = f13;
                                z11 = z12;
                                jVar4 = jVar3;
                            }
                        }
                        f20 = lerp3;
                        if (qVar2.b == this.o0) {
                        }
                        float lerp72 = AndroidUtilities.lerp(i11 != 0 ? AndroidUtilities.lerp(f31, f10 - f13, this.G0) : i11 == 1 ? AndroidUtilities.lerp(f31, (f10 - f13) * f19, this.G0) : 0.0f, f20, a2);
                        if (this.N <= 0.0f) {
                        }
                        if (qVar2.a) {
                        }
                        f25 = f14;
                        i21++;
                        measuredHeight = f13;
                        z11 = z12;
                        jVar4 = jVar3;
                    } else {
                        f13 = measuredHeight;
                        d = 0.25d;
                        f26 = (float) Math.pow(this.N, 0.25d);
                        if (R2 < i10) {
                        }
                        qVar2.d(f26, this.d0, this.n0, this.o0 == qVar2.b);
                        if (R2 > i10) {
                        }
                        z12 = z11;
                        f14 = f25;
                        f15 = f26;
                        jVar3 = jVar4;
                        f16 = 0.0f;
                        x7Var.g = 0.0f;
                        x7Var.h = 0.0f;
                        x7Var.i = 0.0f;
                        x7Var.j = 0.0f;
                        x7Var.k = false;
                        dp = AndroidUtilities.dp(16.0f) * Utilities.clamp((this.n0 - 0.5f) / 0.5f, 1.0f, f16);
                        float f292 = (float) (((1.0f - r2) * 0.5f) + 0.5d);
                        if (R2 <= i10) {
                        }
                        float f302 = lerp + this.s0;
                        if (this.A0) {
                        }
                        float a22 = w7.r.a((this.c0 - 0.2f) / 0.1f, f18, 1.0f);
                        i11 = R2 - i10;
                        if (i11 == 0) {
                        }
                        f20 = lerp3;
                        if (qVar2.b == this.o0) {
                        }
                        float lerp722 = AndroidUtilities.lerp(i11 != 0 ? AndroidUtilities.lerp(f31, f10 - f13, this.G0) : i11 == 1 ? AndroidUtilities.lerp(f31, (f10 - f13) * f19, this.G0) : 0.0f, f20, a22);
                        if (this.N <= 0.0f) {
                        }
                        if (qVar2.a) {
                        }
                        f25 = f14;
                        i21++;
                        measuredHeight = f13;
                        z11 = z12;
                        jVar4 = jVar3;
                    }
                }
                f13 = measuredHeight;
                d = 0.25d;
                if (R2 < i10) {
                }
                qVar2.d(f26, this.d0, this.n0, this.o0 == qVar2.b);
                if (R2 > i10) {
                }
                z12 = z11;
                f14 = f25;
                f15 = f26;
                jVar3 = jVar4;
                f16 = 0.0f;
                x7Var.g = 0.0f;
                x7Var.h = 0.0f;
                x7Var.i = 0.0f;
                x7Var.j = 0.0f;
                x7Var.k = false;
                dp = AndroidUtilities.dp(16.0f) * Utilities.clamp((this.n0 - 0.5f) / 0.5f, 1.0f, f16);
                float f2922 = (float) (((1.0f - r2) * 0.5f) + 0.5d);
                if (R2 <= i10) {
                }
                float f3022 = lerp + this.s0;
                if (this.A0) {
                }
                float a222 = w7.r.a((this.c0 - 0.2f) / 0.1f, f18, 1.0f);
                i11 = R2 - i10;
                if (i11 == 0) {
                }
                f20 = lerp3;
                if (qVar2.b == this.o0) {
                }
                float lerp7222 = AndroidUtilities.lerp(i11 != 0 ? AndroidUtilities.lerp(f31, f10 - f13, this.G0) : i11 == 1 ? AndroidUtilities.lerp(f31, (f10 - f13) * f19, this.G0) : 0.0f, f20, a222);
                if (this.N <= 0.0f) {
                }
                if (qVar2.a) {
                }
                f25 = f14;
                i21++;
                measuredHeight = f13;
                z11 = z12;
                jVar4 = jVar3;
            }
            f12 = f25;
            jVar = jVar4;
        }
        if (this.J != null) {
            float lerp8 = AndroidUtilities.lerp(29, 74, bs.g.getInterpolation(this.N));
            jVar2 = jVar;
            z10 = false;
            if (jVar.getChildCount() > 0) {
                lerp8 += jVar2.getChildAt(0).getLeft();
            }
            this.J.l(0.0f, lerp8);
        } else {
            jVar2 = jVar;
            z10 = false;
        }
        float min = Math.min(this.N, this.d0);
        float visibleItemsMeasuredWidthWithAlpha = (this.q0.E.getVisibleItemsMeasuredWidthWithAlpha() * min) - AndroidUtilities.dp(6.0f);
        boolean z14 = (min == 0.0f || visibleItemsMeasuredWidthWithAlpha <= 0.0f) ? z10 : true;
        if (z14) {
            canvas2 = canvas;
            canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, getWidth() - visibleItemsMeasuredWidthWithAlpha, getHeight());
        } else {
            canvas2 = canvas;
        }
        if (min != 0.0f) {
            k kVar = this.U;
            float totalVisibility = kVar.getTotalVisibility() * (-AndroidUtilities.dp(10.0f));
            org.telegram.ui.Components.q6 q6Var = this.T;
            q6Var.setPivotX(0.0f);
            q6Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, kVar.getTotalVisibility()));
            q6Var.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, kVar.getTotalVisibility()));
            float dp5 = f10 - ((AndroidUtilities.dp(56.0f) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) / f11);
            q6Var.setTranslationY((((AndroidUtilities.dp(14.0f) + dp5) - ((q6Var.getMeasuredHeight() - q6Var.getTextHeight()) / f11)) + AndroidUtilities.dp(f7)) - (kVar.getTotalVisibility() * AndroidUtilities.dp(6.0f)));
            int dp6 = AndroidUtilities.dp(72.0f);
            float f32 = this.N;
            float lerp9 = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f), AndroidUtilities.dp(26.33f), f32) / f11;
            float c10 = si.o0.c(lerp9, f11, AndroidUtilities.lerp((dp6 / f11) - lerp9, 0.0f, f32), -dp6) + AndroidUtilities.dp(12.0f) + f12;
            q6Var.setTranslationX(c10);
            org.telegram.ui.Components.p6 drawable = q6Var.getDrawable();
            drawable.N = (this.q0.E.getVisibleItemsMeasuredWidthWithAlpha() * min) + (c10 - AndroidUtilities.dp(12.0f));
            drawable.invalidateSelf();
            float translationX = q6Var.getTranslationX() + AndroidUtilities.dp(1.0f);
            ImageView imageView = this.V;
            imageView.setTranslationX(translationX);
            imageView.setTranslationY(AndroidUtilities.dp(22.333f) + dp5 + totalVisibility);
            float translationX2 = (q6Var.getTranslationX() - AndroidUtilities.dpf2(3.33f)) + imageView.getMeasuredWidth();
            ImageView imageView2 = this.W;
            imageView2.setTranslationX(translationX2);
            imageView2.setTranslationY(AndroidUtilities.dp(11.333f) + dp5 + totalVisibility);
            kVar.setTranslationX(q6Var.getTranslationX());
            kVar.setTranslationY(dp5 + AndroidUtilities.dp(31.333f));
        }
        super.dispatchDraw(canvas);
        int i27 = this.O;
        if (i27 >= 0 && i27 != 2) {
            Collections.sort(arrayList, this.w0);
            for (int i28 = 0; i28 < arrayList.size(); i28++) {
                q qVar4 = (q) arrayList.get(i28);
                canvas2.save();
                canvas2.translate(qVar4.getX() + jVar2.getX(), qVar4.getY() + jVar2.getY());
                qVar4.draw(canvas2);
                canvas2.restore();
            }
        }
        if (z14) {
            float dp7 = AndroidUtilities.dp(16.0f);
            if (this.x0 == null) {
                this.x0 = new LinearGradient(0.0f, 0.0f, dp7, 0.0f, new int[]{16711680, -65536}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.y0 = new Matrix();
                Paint paint = new Paint(1);
                this.z0 = paint;
                paint.setShader(this.x0);
                this.z0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            }
            this.y0.reset();
            this.y0.postTranslate((getWidth() - visibleItemsMeasuredWidthWithAlpha) - dp7, 0.0f);
            this.x0.setLocalMatrix(this.y0);
            canvas2.drawRect((getWidth() - visibleItemsMeasuredWidthWithAlpha) - dp7, 0.0f, AndroidUtilities.dp(1.0f) + (getWidth() - visibleItemsMeasuredWidthWithAlpha), getHeight(), this.z0);
            canvas.restore();
            canvas.restore();
        }
        canvas.restore();
    }

    public final q e(long j10) {
        j jVar = this.O == 2 ? this.r : this.h;
        for (int i10 = 0; i10 < jVar.getChildCount(); i10++) {
            View childAt = jVar.getChildAt(i10);
            if (childAt instanceof q) {
                q qVar = (q) childAt;
                if (qVar.E == j10) {
                    return qVar;
                }
            }
        }
        return null;
    }

    public final int f(int i10) {
        ey eyVar = this.e0;
        return (eyVar == null || eyVar.getResourceProvider() == null) ? org.telegram.ui.ActionBar.k6.x0(null, i10, false) : eyVar.getThemedColor(i10);
    }

    public final boolean g() {
        int i10 = this.O;
        return i10 == 0 || i10 == 1;
    }

    public float getCollapsedProgress() {
        return this.N;
    }

    public float getOverScrollCoef() {
        return this.t0;
    }

    public ei.x3 getPremiumHint() {
        return this.J;
    }

    public final void h() {
        if (this.s.H()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(UserConfig.getInstance(this.f).clientUserId));
            this.e0.getOrCreateStoryViewer().G(getContext(), null, arrayList, 0, null, null, q7.a(this.r), false);
        }
    }

    public final void i(q qVar, boolean z10) {
        ValueAnimator valueAnimator;
        if ((!z10 || (valueAnimator = this.H0) == null || !valueAnimator.isRunning()) && qVar != null) {
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            boolean z11 = qVar.F;
            h7 h7Var = this.s;
            if (!z11 || h7Var.H()) {
                if (h7Var.I(qVar.E) || h7Var.K(qVar.E)) {
                    TL_stories.PeerStories y3 = h7Var.y(qVar.E);
                    long j10 = qVar.E;
                    y7 y7Var = this.r0;
                    if (y7Var != null) {
                        y7Var.a();
                        this.r0 = null;
                    }
                    a3.i0 i0Var = new a3.i0(this, qVar, j10, 4);
                    if (z10) {
                        i0Var.run();
                        return;
                    }
                    y7 n10 = c8.n(y3, i0Var);
                    qVar.e = n10;
                    this.r0 = n10;
                    if (n10 != null) {
                        h7Var.e0(qVar.E, true);
                    }
                }
            } else if (MessagesController.getInstance(this.f).storiesEnabled()) {
                j(0L);
            } else {
                n();
            }
        }
    }

    public final void j(long j10) {
        q qVar;
        b7 o10;
        ey eyVar = this.e0;
        int i10 = this.f;
        if (j10 == 0 && (o10 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o10.a(i10, 1)) {
            eyVar.showDialog(new sg.j0(o10.b(), this.f, getContext(), this.e0, null));
            return;
        }
        int i11 = 0;
        while (true) {
            j jVar = this.h;
            if (i11 >= jVar.getChildCount()) {
                qVar = null;
                break;
            }
            qVar = (q) jVar.getChildAt(i11);
            if (j10 == 0) {
                if (qVar.F) {
                    break;
                } else {
                    i11++;
                }
            } else if (qVar.E == j10) {
                break;
            } else {
                i11++;
            }
        }
        if (qVar == null) {
            return;
        }
        if (j10 == 0) {
            vb.D(eyVar.getParentActivity(), i10).Q(qb.c(qVar));
            return;
        }
        org.telegram.ui.ActionBar.g6 resourceProvider = eyVar != null ? eyVar.getResourceProvider() : null;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getContext(), 3, resourceProvider);
        c2Var.r(500L);
        MessagesController.getInstance(i10).getStoriesController().k(j10, new ai.x2(this, c2Var, j10, qVar, 1), true, resourceProvider);
    }

    public final boolean k(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.x;
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            }
            if (((o) arrayList.get(i10)).c == j10) {
                break;
            }
            i10++;
        }
        if (i10 >= 0) {
            s4.b0 b0Var = this.S;
            if (i10 < b0Var.I0()) {
                b0Var.h1(i10, 0);
                return true;
            }
            if (i10 > b0Var.M0()) {
                b0Var.i1(i10, 0, true);
                return true;
            }
        }
        return false;
    }

    public final void l(float f7, boolean z10) {
        if (this.c0 == f7) {
            return;
        }
        this.c0 = f7;
        b();
        final int i10 = 0;
        final int i11 = 1;
        boolean z11 = f7 > this.B0;
        if (z11 != this.A0) {
            this.A0 = z11;
            AnimatorSet animatorSet = this.K0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.K0.cancel();
                this.K0 = null;
            }
            if (!z10) {
                this.d0 = z11 ? 1.0f : 0.0f;
                b();
                AndroidUtilities.forEachViews((RecyclerView) this.h, (Utilities.Callback<View>) new e(i11));
                return;
            }
            final int i12 = 2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d0, z11 ? 1.0f : 0.0f);
            this.C0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ci.c
                public final /* synthetic */ r b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i10) {
                        case 0:
                            r rVar = this.b;
                            rVar.getClass();
                            rVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            rVar.b();
                            break;
                        case 1:
                            r rVar2 = this.b;
                            rVar2.getClass();
                            rVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        case 2:
                            r rVar3 = this.b;
                            rVar3.getClass();
                            rVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        default:
                            r rVar4 = this.b;
                            rVar4.getClass();
                            rVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            rVar4.invalidate();
                            break;
                    }
                }
            });
            this.C0.setInterpolator(bs.h);
            float f10 = this.c0;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, z11 ? f10 : 0.0f);
            this.F0 = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ci.c
                public final /* synthetic */ r b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i11) {
                        case 0:
                            r rVar = this.b;
                            rVar.getClass();
                            rVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            rVar.b();
                            break;
                        case 1:
                            r rVar2 = this.b;
                            rVar2.getClass();
                            rVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        case 2:
                            r rVar3 = this.b;
                            rVar3.getClass();
                            rVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        default:
                            r rVar4 = this.b;
                            rVar4.getClass();
                            rVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            rVar4.invalidate();
                            break;
                    }
                }
            });
            this.F0.setDuration(100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.K0 = animatorSet2;
            animatorSet2.addListener(new ah.p0(i11, this, z11));
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.C0);
            arrayList.add(this.F0);
            if (this.A0) {
                this.K0.setDuration(1000L);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(this.d0, z11 ? 1.0f : 0.0f);
                this.D0 = ofFloat3;
                ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ci.c
                    public final /* synthetic */ r b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i12) {
                            case 0:
                                r rVar = this.b;
                                rVar.getClass();
                                rVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                rVar.b();
                                break;
                            case 1:
                                r rVar2 = this.b;
                                rVar2.getClass();
                                rVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            case 2:
                                r rVar3 = this.b;
                                rVar3.getClass();
                                rVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            default:
                                r rVar4 = this.b;
                                rVar4.getClass();
                                rVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                rVar4.invalidate();
                                break;
                        }
                    }
                });
                OvershootInterpolator overshootInterpolator = new OvershootInterpolator(this.u0);
                this.J0 = overshootInterpolator;
                this.D0.setInterpolator(overshootInterpolator);
                this.D0.setDuration(750L);
                arrayList.add(this.D0);
            } else {
                this.H0 = ValueAnimator.ofFloat(this.d0, z11 ? 1.0f : 0.0f);
                this.H0.setInterpolator(new OvershootInterpolator(this.v0));
                this.H0.setDuration(350L);
                final int i13 = 3;
                this.H0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ci.c
                    public final /* synthetic */ r b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i13) {
                            case 0:
                                r rVar = this.b;
                                rVar.getClass();
                                rVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                rVar.b();
                                break;
                            case 1:
                                r rVar2 = this.b;
                                rVar2.getClass();
                                rVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            case 2:
                                r rVar3 = this.b;
                                rVar3.getClass();
                                rVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            default:
                                r rVar4 = this.b;
                                rVar4.getClass();
                                rVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                rVar4.invalidate();
                                break;
                        }
                    }
                });
                arrayList.add(this.H0);
            }
            this.K0.playTogether(arrayList);
            this.K0.start();
        }
    }

    public final boolean m() {
        long j10 = UserConfig.getInstance(this.f).clientUserId;
        h7 h7Var = this.s;
        if (h7Var.J(j10)) {
            return true;
        }
        return h7Var.H() && h7Var.g.size() <= 3;
    }

    public final void n() {
        if (this.J == null) {
            ei.x3 x3Var = new ei.x3(getContext(), 1);
            x3Var.h(f(org.telegram.ui.ActionBar.k6.Fi));
            x3Var.p(true);
            x3Var.K = Layout.Alignment.ALIGN_CENTER;
            x3Var.l(0.0f, 29.0f);
            this.J = x3Var;
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.k6.Gi, 0, new d(this, 1));
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) replaceSingleTag.getSpans(0, replaceSingleTag.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
                replaceSingleTag.setSpan(new j61(AndroidUtilities.bold()), replaceSingleTag.getSpanStart(clickableSpanArr[0]), replaceSingleTag.getSpanEnd(clickableSpanArr[0]), 33);
            }
            ei.x3 x3Var2 = this.J;
            x3Var2.h = ei.x3.a(replaceSingleTag, x3Var2.getTextPaint());
            this.J.s(replaceSingleTag);
            this.J.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), 0);
            if (getParent() instanceof FrameLayout) {
                ((FrameLayout) getParent()).addView(this.J, w7.z5.e(-1, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 51));
            }
        }
        ei.x3 x3Var3 = this.J;
        if (x3Var3 != null) {
            if (x3Var3.V) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
            this.J.u();
        }
    }

    @Override // ne.d
    public final void o(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 1) {
            d();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q(false, false);
        NotificationCenter.getInstance(this.f).addObserver(this, NotificationCenter.storiesUpdated);
        c2.b bVar = this.L0;
        bVar.a = true;
        AnimatorSet animatorSet = (AnimatorSet) bVar.c;
        if (!animatorSet.isRunning()) {
            animatorSet.start();
        }
        this.a0.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f).removeObserver(this, NotificationCenter.storiesUpdated);
        c2.b bVar = this.L0;
        bVar.a = false;
        ((AnimatorSet) bVar.c).cancel();
        y7 y7Var = this.r0;
        if (y7Var != null) {
            y7Var.a();
            this.r0 = null;
        }
        this.a0.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.T.setTextSize(AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        this.M = AndroidUtilities.dp(70.0f);
        AndroidUtilities.rectTmp.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(89.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.O == 2) {
            int dp = AndroidUtilities.dp((this.y.size() * 26.33f) - (Math.max(0, r0 - 1) * 16.0f));
            j jVar = this.r;
            int x10 = (int) jVar.getX();
            int y3 = (int) jVar.getY();
            int x11 = (int) (jVar.getX() + dp);
            int y10 = (int) (jVar.getY() + jVar.getHeight());
            fd fdVar = this.I;
            fdVar.getClass();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(x10, y3, x11, y10);
            fdVar.i = false;
            fdVar.c = 0;
            fdVar.a(rectF);
            if (fdVar.b(motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        x20 x20Var = c8.b;
        if (x20Var != null) {
            x20Var.d(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.lk, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.mk, false), 0, 0);
        }
        x20 x20Var2 = c8.c;
        if (x20Var2 != null) {
            x20Var2.d(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.nk, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ok, false), 0, 0);
        }
        x20[] x20VarArr = c8.a;
        x20 x20Var3 = x20VarArr[0];
        if (x20Var3 != null) {
            x20Var3.d(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.jk, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.kk, false), 0, 0);
        }
        x20 x20Var4 = x20VarArr[1];
        if (x20Var4 != null) {
            x20Var4.d(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.hk, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ik, false), 0, 0);
        }
        if (c8.d != null) {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.xj, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q7, false);
            c8.d.d(i0.a.f(0.25f, x02, x03), x03, 0, 0);
        }
        int textColor = getTextColor();
        this.T.setTextColor(getTextLogoColor());
        k kVar = this.U;
        if (kVar != null) {
            kVar.c();
        }
        this.V.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        AndroidUtilities.forEachViews((RecyclerView) this.h, (Utilities.Callback<View>) new g(textColor, 0));
        AndroidUtilities.forEachViews((RecyclerView) this.r, (Utilities.Callback<View>) new e(2));
        try {
            org.telegram.ui.Components.p5 p5Var = this.a0;
            if (p5Var != null) {
                p5Var.k(Integer.valueOf(f(org.telegram.ui.ActionBar.k6.zh)));
            }
            ImageView imageView = this.W;
            if (imageView != null) {
                imageView.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void q(boolean z10, boolean z11) {
        ArrayList arrayList;
        boolean z12;
        if ((this.O == 1 || this.n0 != 0.0f) && !z11) {
            this.K = true;
            return;
        }
        ArrayList arrayList2 = this.v;
        arrayList2.clear();
        ArrayList arrayList3 = this.x;
        arrayList2.addAll(arrayList3);
        ArrayList arrayList4 = this.w;
        arrayList4.clear();
        ArrayList arrayList5 = this.y;
        arrayList4.addAll(arrayList5);
        arrayList3.clear();
        int i10 = this.b;
        int i11 = this.f;
        if (i10 != 1) {
            arrayList3.add(new o(UserConfig.getInstance(i11).getClientUserId()));
        }
        h7 h7Var = this.s;
        ArrayList arrayList6 = i10 == 1 ? h7Var.h : h7Var.g;
        for (int i12 = 0; i12 < arrayList6.size(); i12++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList6.get(i12)).peer);
            if (peerDialogId != UserConfig.getInstance(i11).getClientUserId()) {
                arrayList3.add(new o(peerDialogId));
            }
        }
        int size = arrayList3.size();
        if (!h7Var.H()) {
            size--;
        }
        int max = Math.max(1, Math.max(h7Var.C(i10 == 1), size));
        this.f0 = null;
        boolean G = h7Var.G();
        org.telegram.ui.Components.q6 q6Var = this.T;
        if (G) {
            arrayList = arrayList3;
            if (h7Var.K(UserConfig.getInstance(i11).getClientUserId())) {
                String string = LocaleController.getString(R.string.UploadingStory);
                if (string.indexOf("…") > 0) {
                    if (this.i0 == null) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
                        fa faVar = new fa();
                        valueOf.setSpan(faVar, valueOf.length() - 1, valueOf.length(), 0);
                        faVar.a = q6Var;
                        faVar.n = true;
                        this.i0 = valueOf;
                    }
                    this.f0 = this.i0;
                } else {
                    this.f0 = string;
                }
            } else {
                this.f0 = this.s0 < ((float) AndroidUtilities.dp(50.0f)) ? null : LocaleController.getString(R.string.MyStory);
            }
        } else {
            arrayList = arrayList3;
            this.f0 = this.s0 < ((float) AndroidUtilities.dp(50.0f)) ? null : LocaleController.formatPluralString("Stories", max, new Object[0]);
        }
        if (this.g0) {
            z12 = true;
        } else {
            z12 = true;
            q6Var.c(this.f0, z10 && !LocaleController.isRTL, true);
        }
        this.a.a((!TextUtils.isEmpty(this.f0) || this.g0) ? z12 : false, z10);
        arrayList5.clear();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (((o) arrayList.get(i13)).c != UserConfig.getInstance(i11).clientUserId || m()) {
                arrayList5.add((o) arrayList.get(i13));
                if (arrayList5.size() >= 3) {
                    break;
                }
            }
        }
        j jVar = this.h;
        j jVar2 = this.r;
        if (!z10) {
            jVar.setItemAnimator(null);
            jVar2.setItemAnimator(null);
        } else if (this.O == 2) {
            jVar2.setItemAnimator(this.d);
            jVar.setItemAnimator(null);
        } else {
            jVar.setItemAnimator(this.R);
            jVar2.setItemAnimator(null);
        }
        this.E.E(arrayList2, arrayList);
        this.F.E(arrayList4, arrayList5);
        arrayList2.clear();
        invalidate();
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.q0 = kVar;
    }

    public void setClipTop(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        if (this.L != i10) {
            this.L = i10;
            invalidate();
        }
    }

    public void setMenuItemsOffset(float f7) {
        this.s0 = f7;
    }

    public void setOverscroll(float f7) {
        this.n0 = f7 / AndroidUtilities.dp(90.0f);
        invalidate();
        this.h.invalidate();
    }

    public void setProgressToCollapse(float f7) {
        l(f7, true);
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ei.x3 x3Var = this.J;
        if (x3Var != null) {
            x3Var.setTranslationY(f7);
        }
    }

    @Override // ne.d
    public final /* synthetic */ void H(float f7, int i10) {
    }
}
