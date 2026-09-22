package ai;

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
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.v51;
import org.telegram.ui.lx;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public abstract class b0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, le.d {
    public boolean A0;
    public final float B0;
    public ValueAnimator C0;
    public ValueAnimator D0;
    public final v E;
    public float E0;
    public final v F;
    public ValueAnimator F0;
    public final Paint G;
    public float G0;
    public final Paint H;
    public ValueAnimator H0;
    public final fd I;
    public float I0;
    public ci.f4 J;
    public OvershootInterpolator J0;
    public boolean K;
    public AnimatorSet K0;
    public int L;
    public final com.google.firebase.messaging.m L0;
    public int M;
    public long M0;
    public float N;
    public Drawable N0;
    public int O;
    public final ArrayList P;
    public final ArrayList Q;
    public final s4.j R;
    public final s4.c0 S;
    public final org.telegram.ui.Components.o6 T;
    public final s U;
    public final ImageView V;
    public final ImageView W;
    public final le.b a;
    public final org.telegram.ui.Components.n5 a0;
    public final int b;
    public final ArrayList b0;
    public final Drawable c;
    public float c0;
    public final u d;
    public float d0;
    public int e;
    public final uy e0;
    public final int f;
    public CharSequence f0;
    public boolean g0;
    public final q h;
    public int h0;
    public SpannableStringBuilder i0;
    public ValueAnimator j0;
    public y k0;
    public boolean l0;
    public boolean m0;
    public oj0 n;
    public float n0;
    public int o0;
    public a0 p0;
    public org.telegram.ui.ActionBar.k q0;
    public final q r;
    public da r0;
    public final l9 s;
    public float s0;
    public final float t0;
    public final float u0;
    public final ArrayList v;
    public final float v0;
    public final ArrayList w;
    public final a4.e w0;
    public final ArrayList x;
    public LinearGradient x0;
    public final ArrayList y;
    public Matrix y0;
    public Paint z0;

    public b0(Context context, uy uyVar, int i10, int i11) {
        super(context);
        this.a = new le.b(1, this, qr.h, 380L, false);
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new ArrayList();
        lx lxVar = (lx) this;
        v vVar = new v(lxVar, false);
        this.E = vVar;
        v vVar2 = new v(lxVar, true);
        this.F = vVar2;
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
        this.w0 = new a4.e(1);
        this.B0 = 0.3f;
        this.E0 = 1.0f;
        new OvershootInterpolator(0.9f);
        this.J0 = new OvershootInterpolator(0.95f);
        com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m(this);
        this.L0 = mVar;
        this.b = i11;
        this.f = i10;
        this.e0 = uyVar;
        this.s0 = AndroidUtilities.dp(68.0f);
        this.s = MessagesController.getInstance(i10).getStoriesController();
        q qVar = new q(lxVar, context, 0);
        this.h = qVar;
        qVar.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        qVar.setClipToPadding(false);
        qVar.setClipChildren(false);
        fdVar.h = new a3.d(lxVar, 2);
        f fVar = new f(lxVar, 0);
        fdVar.l = true;
        fdVar.j = fVar;
        qVar.j(new r(lxVar, 0));
        s4.j jVar = new s4.j();
        this.R = jVar;
        jVar.C = false;
        jVar.n(150L);
        jVar.m = false;
        qVar.setItemAnimator(jVar);
        s4.c0 c0Var = new s4.c0(0, false);
        this.S = c0Var;
        qVar.setLayoutManager(c0Var);
        qVar.setOnItemClickListener(new g(lxVar, 0));
        qVar.setOnItemLongClickListener(new a1.c(lxVar, 2));
        qVar.setAdapter(vVar);
        addView(qVar, w7.y5.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(getContext(), true, true, false);
        this.T = o6Var;
        o6Var.setGravity(3);
        o6Var.setTextColor(getTextLogoColor());
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        o6Var.setTextSize(AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        o6Var.setImportantForAccessibility(1);
        o6Var.setFocusableInTouchMode(true);
        addView(o6Var, w7.y5.c(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.V = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AppName));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.telegram_logo_2);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, w7.y5.c(22.0f, 90));
        org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(AndroidUtilities.dp(26.0f), null);
        this.a0 = n5Var;
        n5Var.a = true;
        n5Var.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.W = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(n5Var);
        addView(imageView2, w7.y5.c(40.0f, 40));
        s sVar = new s(lxVar, context, mVar);
        this.U = sVar;
        addView(sVar, w7.y5.c(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.c = getContext().getDrawable(R.drawable.msg_mini_addstory);
        q qVar2 = new q(lxVar, getContext(), 1);
        this.r = qVar2;
        getContext();
        qVar2.setLayoutManager(new s4.c0(0, false));
        qVar2.i(new t(0));
        u uVar = new u();
        this.d = uVar;
        uVar.C = false;
        uVar.m = false;
        qVar2.setItemAnimator(uVar);
        qVar2.setAdapter(vVar2);
        qVar2.setClipChildren(false);
        addView(qVar2, w7.y5.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        setClipChildren(false);
        setClipToPadding(false);
        d();
        p(false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTextColor() {
        return this.b == 0 ? f(org.telegram.ui.ActionBar.j6.A8) : f(org.telegram.ui.ActionBar.j6.P8);
    }

    private int getTextLogoColor() {
        return f(org.telegram.ui.ActionBar.j6.gl);
    }

    @Override // le.d
    public final void H(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 1) {
            d();
        }
    }

    public final void b() {
        this.N = 1.0f - AndroidUtilities.lerp(1.0f - this.c0, 1.0f, 1.0f - this.d0);
        d();
        float f7 = this.N;
        int i10 = f7 == 1.0f ? 2 : f7 != 0.0f ? 1 : 0;
        if (this.O != i10) {
            this.O = i10;
            if (i10 != 1 && this.K) {
                AndroidUtilities.runOnUIThread(new h(this, 0));
            }
            int i11 = this.O;
            q qVar = this.r;
            q qVar2 = this.h;
            if (i11 == 0) {
                AndroidUtilities.forEachViews((RecyclerView) qVar2, (e2.h) new i(0));
                qVar.setVisibility(4);
                qVar2.setVisibility(0);
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
                        if (((w) arrayList2.get(i13)).c != UserConfig.getInstance(i12).getClientUserId() || m()) {
                            arrayList.add(Long.valueOf(((w) arrayList2.get(i13)).c));
                            if (arrayList.size() == 3) {
                                break;
                            }
                        }
                        i13++;
                    }
                    qVar.setVisibility(4);
                    qVar2.setVisibility(0);
                } else if (i11 == 2) {
                    qVar.setVisibility(0);
                    qVar2.setVisibility(4);
                    this.S.h1(0, 0);
                    n8 n8Var = MessagesController.getInstance(i12).getStoriesController().K;
                    AndroidUtilities.cancelRunOnUIThread(n8Var);
                    n8Var.run();
                    da daVar = this.r0;
                    if (daVar != null) {
                        daVar.a();
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
        s4.c0 c0Var = this.S;
        int N02 = c0Var.N0() + 10;
        ArrayList arrayList = this.x;
        int size = arrayList.size();
        l9 l9Var = this.s;
        if (N02 > size || ((N0 = c0Var.N0() + 9) < arrayList.size() && l9Var.D(0, ((w) arrayList.get(N0)).c) == 0)) {
            boolean z10 = this.b == 1;
            if (z10) {
                if (!l9Var.z) {
                    return;
                }
            } else if (!l9Var.p) {
                return;
            }
            l9Var.Q(z10);
        }
    }

    public final void d() {
        float a2 = w7.q.a(Math.min(this.N, this.d0), 0.0f, 1.0f);
        float f7 = this.a.e;
        float f10 = 1.0f - f7;
        float f11 = f7 * a2;
        float f12 = f10 * a2;
        org.telegram.ui.Components.o6 o6Var = this.T;
        if (o6Var != null) {
            o6Var.setAlpha(f11);
            o6Var.setVisibility(f11 > 0.0f ? 0 : 8);
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
        s sVar = this.U;
        if (sVar != null) {
            sVar.setAlpha(a2);
            sVar.setVisibility(a2 > 0.0f ? 0 : 8);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesUpdated && this.l0) {
            p(getVisibility() == 0, false);
            AndroidUtilities.runOnUIThread(new h(this, 2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03a8  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i10;
        float f7;
        float f10;
        q qVar;
        float f11;
        float f12;
        q qVar2;
        int i11;
        Canvas canvas2;
        boolean z10;
        float f13;
        double d;
        boolean z11;
        float f14;
        float f15;
        q qVar3;
        float f16;
        float dp;
        float f17;
        float lerp;
        float f18;
        float lerp2;
        int i12;
        float f19;
        float f20;
        float lerp3;
        float f21;
        float f22;
        int S;
        canvas.save();
        int i13 = this.L;
        if (i13 > 0) {
            canvas.clipRect(0, i13, getMeasuredWidth(), getMeasuredHeight());
        }
        float measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(4.0f);
        float f23 = 0.0f;
        float lerp4 = AndroidUtilities.lerp(0.0f, measuredHeight, this.c0);
        q qVar4 = this.h;
        qVar4.setTranslationY(lerp4);
        q qVar5 = this.r;
        qVar5.setTranslationY(lerp4);
        qVar5.setTranslationX(this.s0);
        int i14 = 0;
        while (true) {
            arrayList = this.P;
            if (i14 >= arrayList.size()) {
                break;
            }
            ((a0) arrayList.get(i14)).a = false;
            i14++;
        }
        arrayList.clear();
        int i15 = this.O;
        int i16 = -1;
        ArrayList arrayList2 = this.Q;
        if ((i15 == 1 || i15 == 0) && !arrayList2.isEmpty()) {
            i10 = -1;
            f7 = 4.0f;
            for (int i17 = 0; i17 < qVar4.getChildCount(); i17++) {
                a0 a0Var = (a0) qVar4.getChildAt(i17);
                i10 = a0Var.E == ((Long) arrayList2.get(0)).longValue() ? RecyclerView.S(a0Var) : i10;
            }
        } else {
            f7 = 4.0f;
            i10 = this.O == 2 ? 0 : -1;
        }
        int i18 = this.O;
        if (i18 < 0 || i18 == 2) {
            f10 = lerp4;
            qVar = qVar4;
            f11 = 2.0f;
            float f24 = 0.0f;
            for (int i19 = 0; i19 < qVar5.getChildCount(); i19++) {
                float x10 = ((a0) qVar5.getChildAt(i19)).getX() + qVar5.getX() + r4.getMeasuredWidth();
                if (f24 == 0.0f || x10 > f24) {
                    f24 = x10;
                }
            }
            f12 = f24;
        } else {
            if (i10 == -1) {
                s4.c0 c0Var = this.S;
                i10 = c0Var.I0();
                if (i10 == -1) {
                    i10 = c0Var.L0();
                }
                z10 = true;
            } else {
                z10 = false;
            }
            qVar4.setAlpha(1.0f - Utilities.clamp(this.N / this.B0, 1.0f, 0.0f));
            this.o0 = -1;
            if (this.n0 != 0.0f) {
                int i20 = 0;
                int i21 = -1;
                f11 = 2.0f;
                while (i20 < qVar4.getChildCount()) {
                    View childAt = qVar4.getChildAt(i20);
                    if (childAt.getX() < f23 || childAt.getX() + childAt.getMeasuredWidth() > getMeasuredWidth() || (S = RecyclerView.S(childAt)) < 0 || (i21 != i16 && S >= i21)) {
                        f22 = lerp4;
                    } else {
                        f22 = lerp4;
                        if (((w) this.x.get(S)).c != UserConfig.getInstance(this.f).clientUserId) {
                            this.p0 = (a0) childAt;
                            i21 = S;
                        }
                    }
                    i20++;
                    lerp4 = f22;
                    i16 = -1;
                    f23 = 0.0f;
                }
                f10 = lerp4;
                this.o0 = i21;
            } else {
                f10 = lerp4;
                f11 = 2.0f;
            }
            float f25 = 0.0f;
            int i22 = 0;
            while (i22 < qVar4.getChildCount()) {
                a0 a0Var2 = (a0) qVar4.getChildAt(i22);
                a0Var2.setClipInParent(false);
                ca caVar = a0Var2.O;
                int S2 = RecyclerView.S(a0Var2);
                float f26 = this.N;
                if (S2 >= i10 && S2 < arrayList2.size() + i10) {
                    int i23 = S2 - i10;
                    if (i23 == i10 + 2) {
                        f26 = this.N;
                    } else if (i23 == i10 + 1) {
                        f13 = measuredHeight;
                        f26 = (float) Math.pow(this.N, 0.5d);
                        d = 0.25d;
                        if (S2 < i10) {
                            f26 = (float) Math.pow(this.N, d);
                        }
                        a0Var2.d(f26, this.d0, this.n0, this.o0 == a0Var2.b);
                        if (S2 > i10 || S2 >= arrayList2.size() + i10) {
                            z11 = z10;
                            f14 = f25;
                            f15 = f26;
                            qVar3 = qVar4;
                            f16 = 0.0f;
                            caVar.g = 0.0f;
                            caVar.h = 0.0f;
                            caVar.i = 0.0f;
                            caVar.j = 0.0f;
                            caVar.k = false;
                        } else {
                            a0 a0Var3 = (a0) qVar4.getChildAt(i22 - 1);
                            if (a0Var3 != null) {
                                ca caVar2 = a0Var3.O;
                                float dp2 = AndroidUtilities.dp(48.0f);
                                float dp3 = AndroidUtilities.dp(26.33f);
                                z11 = z10;
                                float lerp5 = (AndroidUtilities.lerp(dp2, dp3, a0Var3.J) + AndroidUtilities.dp(8.0f)) / f11;
                                float lerp6 = (AndroidUtilities.lerp(dp2, dp3, a0Var2.J) + AndroidUtilities.dp(8.0f)) / f11;
                                float x11 = a0Var3.getX() + caVar2.F.centerX();
                                float y3 = a0Var3.getY() + caVar2.F.centerY();
                                float x12 = (a0Var2.getX() + caVar.F.centerX()) - x11;
                                float y10 = (a0Var2.getY() + caVar.F.centerY()) - y3;
                                f14 = f25;
                                if (((float) Math.sqrt((y10 * y10) + (x12 * x12))) < lerp5 + lerp6) {
                                    float degrees = (float) Math.toDegrees(Math.acos(r1 / r3) * 2.0d);
                                    f15 = f26;
                                    qVar3 = qVar4;
                                    float degrees2 = (float) Math.toDegrees(Math.atan2(y10, x12));
                                    float f27 = degrees / f11;
                                    caVar2.g = degrees2 - f27;
                                    caVar2.h = degrees2 + f27;
                                    float degrees3 = (float) Math.toDegrees(Math.atan2(-y10, -x12));
                                    float f28 = -Math.abs(degrees3 - f27);
                                    float abs = Math.abs(degrees3 + f27);
                                    caVar.i = f28;
                                    caVar.j = abs;
                                    f16 = 0.0f;
                                } else {
                                    f15 = f26;
                                    qVar3 = qVar4;
                                    f16 = 0.0f;
                                    caVar2.g = 0.0f;
                                    caVar2.h = 0.0f;
                                    caVar.i = 0.0f;
                                    caVar.j = 0.0f;
                                }
                                caVar2.k = false;
                                caVar.k = false;
                            } else {
                                z11 = z10;
                                f14 = f25;
                                f15 = f26;
                                qVar3 = qVar4;
                                f16 = 0.0f;
                            }
                        }
                        dp = AndroidUtilities.dp(16.0f) * Utilities.clamp((this.n0 - 0.5f) / 0.5f, 1.0f, f16);
                        float f29 = (float) (((1.0f - r2) * 0.5f) + 0.5d);
                        if (S2 <= i10) {
                            f17 = 0.0f;
                            lerp = 0.0f;
                        } else if (S2 == i10 + 1) {
                            lerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), 0.0f, this.N) + ((AndroidUtilities.dp(16.0f) * f15) - AndroidUtilities.dpf2(0.5f));
                            f17 = 0.0f;
                        } else {
                            f17 = 0.0f;
                            lerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), 0.0f, this.N) + (((AndroidUtilities.dp(16.0f) * f15) + AndroidUtilities.dp(16.0f)) - AndroidUtilities.dpf2(0.5f));
                        }
                        float f30 = lerp + this.s0;
                        if (this.A0) {
                            f18 = 0.0f;
                            lerp2 = AndroidUtilities.lerp(0.0f, f30 - a0Var2.getLeft(), this.J0.getInterpolation(this.E0));
                        } else {
                            if (this.n0 > f17) {
                                int i24 = a0Var2.b;
                                int i25 = this.o0;
                                if (i24 < i25) {
                                    f21 = -dp;
                                } else if (i24 > i25) {
                                    f21 = dp;
                                }
                                lerp2 = AndroidUtilities.lerp(f30 - a0Var2.getLeft(), f21, 1.0f - this.I0);
                                f18 = 0.0f;
                            }
                            f21 = 0.0f;
                            lerp2 = AndroidUtilities.lerp(f30 - a0Var2.getLeft(), f21, 1.0f - this.I0);
                            f18 = 0.0f;
                        }
                        float a2 = w7.q.a((this.c0 - 0.2f) / 0.1f, f18, 1.0f);
                        i12 = S2 - i10;
                        if (i12 == 0) {
                            f19 = 0.65f;
                            lerp3 = AndroidUtilities.lerp(f18, f10 - f13, qr.h.getInterpolation(this.N));
                        } else {
                            f19 = 0.65f;
                            if (i12 == 1) {
                                lerp3 = AndroidUtilities.lerp(f18, (f10 - f13) * 0.65f, qr.h.getInterpolation(this.N));
                            } else {
                                f20 = 0.0f;
                                float f31 = (a0Var2.b == this.o0 || this.n0 <= f18) ? 0.0f : (-dp) / f11;
                                float lerp7 = AndroidUtilities.lerp(i12 != 0 ? AndroidUtilities.lerp(f31, f10 - f13, this.G0) : i12 == 1 ? AndroidUtilities.lerp(f31, (f10 - f13) * f19, this.G0) : 0.0f, f20, a2);
                                if (this.N <= 0.0f) {
                                    boolean z12 = S2 >= i10 && S2 <= i10 + 2;
                                    if (!z11) {
                                        a0Var2.setCrossfadeTo(-1L);
                                    } else if (i12 < 0 || i12 >= arrayList2.size()) {
                                        a0Var2.setCrossfadeTo(-1L);
                                    } else {
                                        a0Var2.setCrossfadeTo(((Long) arrayList2.get(i12)).longValue());
                                    }
                                    a0Var2.a = z12;
                                    a0Var2.d = S2 == i10;
                                    a0Var2.c = S2 >= (arrayList2.size() + i10) + (-1);
                                    a0Var2.setTranslationX(lerp2);
                                    a0Var2.setTranslationY(lerp7);
                                    if (z12) {
                                        arrayList.add(a0Var2);
                                    }
                                } else if (qVar3.getItemAnimator() == null || !qVar3.getItemAnimator().k()) {
                                    if (this.n0 > 0.0f) {
                                        int i26 = a0Var2.b;
                                        int i27 = this.o0;
                                        if (i26 < i27) {
                                            a0Var2.setAlpha(f29);
                                        } else if (i26 > i27) {
                                            a0Var2.setAlpha(f29);
                                        } else {
                                            a0Var2.setAlpha(1.0f);
                                        }
                                    } else {
                                        a0Var2.setAlpha(1.0f);
                                    }
                                    a0Var2.setTranslationX(lerp2);
                                    a0Var2.setTranslationY(lerp7);
                                }
                                if (a0Var2.a) {
                                    float dp4 = (AndroidUtilities.dp(70.0f) / f11) + (a0Var2.getMeasuredWidth() / f11) + a0Var2.getX() + qVar3.getX();
                                    if (f14 == 0.0f || dp4 > f14) {
                                        f25 = dp4;
                                        i22++;
                                        measuredHeight = f13;
                                        z10 = z11;
                                        qVar4 = qVar3;
                                    }
                                }
                                f25 = f14;
                                i22++;
                                measuredHeight = f13;
                                z10 = z11;
                                qVar4 = qVar3;
                            }
                        }
                        f20 = lerp3;
                        if (a0Var2.b == this.o0) {
                        }
                        float lerp72 = AndroidUtilities.lerp(i12 != 0 ? AndroidUtilities.lerp(f31, f10 - f13, this.G0) : i12 == 1 ? AndroidUtilities.lerp(f31, (f10 - f13) * f19, this.G0) : 0.0f, f20, a2);
                        if (this.N <= 0.0f) {
                        }
                        if (a0Var2.a) {
                        }
                        f25 = f14;
                        i22++;
                        measuredHeight = f13;
                        z10 = z11;
                        qVar4 = qVar3;
                    } else {
                        f13 = measuredHeight;
                        d = 0.25d;
                        f26 = (float) Math.pow(this.N, 0.25d);
                        if (S2 < i10) {
                        }
                        a0Var2.d(f26, this.d0, this.n0, this.o0 == a0Var2.b);
                        if (S2 > i10) {
                        }
                        z11 = z10;
                        f14 = f25;
                        f15 = f26;
                        qVar3 = qVar4;
                        f16 = 0.0f;
                        caVar.g = 0.0f;
                        caVar.h = 0.0f;
                        caVar.i = 0.0f;
                        caVar.j = 0.0f;
                        caVar.k = false;
                        dp = AndroidUtilities.dp(16.0f) * Utilities.clamp((this.n0 - 0.5f) / 0.5f, 1.0f, f16);
                        float f292 = (float) (((1.0f - r2) * 0.5f) + 0.5d);
                        if (S2 <= i10) {
                        }
                        float f302 = lerp + this.s0;
                        if (this.A0) {
                        }
                        float a22 = w7.q.a((this.c0 - 0.2f) / 0.1f, f18, 1.0f);
                        i12 = S2 - i10;
                        if (i12 == 0) {
                        }
                        f20 = lerp3;
                        if (a0Var2.b == this.o0) {
                        }
                        float lerp722 = AndroidUtilities.lerp(i12 != 0 ? AndroidUtilities.lerp(f31, f10 - f13, this.G0) : i12 == 1 ? AndroidUtilities.lerp(f31, (f10 - f13) * f19, this.G0) : 0.0f, f20, a22);
                        if (this.N <= 0.0f) {
                        }
                        if (a0Var2.a) {
                        }
                        f25 = f14;
                        i22++;
                        measuredHeight = f13;
                        z10 = z11;
                        qVar4 = qVar3;
                    }
                }
                f13 = measuredHeight;
                d = 0.25d;
                if (S2 < i10) {
                }
                a0Var2.d(f26, this.d0, this.n0, this.o0 == a0Var2.b);
                if (S2 > i10) {
                }
                z11 = z10;
                f14 = f25;
                f15 = f26;
                qVar3 = qVar4;
                f16 = 0.0f;
                caVar.g = 0.0f;
                caVar.h = 0.0f;
                caVar.i = 0.0f;
                caVar.j = 0.0f;
                caVar.k = false;
                dp = AndroidUtilities.dp(16.0f) * Utilities.clamp((this.n0 - 0.5f) / 0.5f, 1.0f, f16);
                float f2922 = (float) (((1.0f - r2) * 0.5f) + 0.5d);
                if (S2 <= i10) {
                }
                float f3022 = lerp + this.s0;
                if (this.A0) {
                }
                float a222 = w7.q.a((this.c0 - 0.2f) / 0.1f, f18, 1.0f);
                i12 = S2 - i10;
                if (i12 == 0) {
                }
                f20 = lerp3;
                if (a0Var2.b == this.o0) {
                }
                float lerp7222 = AndroidUtilities.lerp(i12 != 0 ? AndroidUtilities.lerp(f31, f10 - f13, this.G0) : i12 == 1 ? AndroidUtilities.lerp(f31, (f10 - f13) * f19, this.G0) : 0.0f, f20, a222);
                if (this.N <= 0.0f) {
                }
                if (a0Var2.a) {
                }
                f25 = f14;
                i22++;
                measuredHeight = f13;
                z10 = z11;
                qVar4 = qVar3;
            }
            f12 = f25;
            qVar = qVar4;
        }
        if (this.J != null) {
            float lerp8 = AndroidUtilities.lerp(29, 74, qr.g.getInterpolation(this.N));
            qVar2 = qVar;
            i11 = 0;
            if (qVar.getChildCount() > 0) {
                lerp8 += qVar2.getChildAt(0).getLeft();
            }
            this.J.l(0.0f, lerp8);
        } else {
            qVar2 = qVar;
            i11 = 0;
        }
        float min = Math.min(this.N, this.d0);
        float visibleItemsMeasuredWidthWithAlpha = (this.q0.E.getVisibleItemsMeasuredWidthWithAlpha() * min) - AndroidUtilities.dp(6.0f);
        boolean z13 = min != 0.0f && visibleItemsMeasuredWidthWithAlpha > 0.0f;
        if (z13) {
            canvas2 = canvas;
            canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, getWidth() - visibleItemsMeasuredWidthWithAlpha, getHeight());
        } else {
            canvas2 = canvas;
        }
        if (min != 0.0f) {
            s sVar = this.U;
            float totalVisibility = sVar.getTotalVisibility() * (-AndroidUtilities.dp(10.0f));
            org.telegram.ui.Components.o6 o6Var = this.T;
            o6Var.setPivotX(0.0f);
            o6Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, sVar.getTotalVisibility()));
            o6Var.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, sVar.getTotalVisibility()));
            o6Var.setTranslationY((((f10 + AndroidUtilities.dp(14.0f)) - ((o6Var.getMeasuredHeight() - o6Var.getTextHeight()) / f11)) + AndroidUtilities.dp(f7)) - (sVar.getTotalVisibility() * AndroidUtilities.dp(6.0f)));
            int dp5 = AndroidUtilities.dp(72.0f);
            float f32 = this.N;
            float lerp9 = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f), AndroidUtilities.dp(26.33f), f32) / f11;
            float b10 = org.telegram.ui.Cells.c1.b(lerp9, 2.0f, AndroidUtilities.lerp((dp5 / f11) - lerp9, 0.0f, f32), -dp5) + AndroidUtilities.dp(12.0f) + f12;
            o6Var.setTranslationX(b10);
            org.telegram.ui.Components.n6 drawable = o6Var.getDrawable();
            drawable.H = (this.q0.E.getVisibleItemsMeasuredWidthWithAlpha() * min) + (b10 - AndroidUtilities.dp(12.0f));
            drawable.invalidateSelf();
            float translationX = o6Var.getTranslationX() + AndroidUtilities.dp(1.0f);
            ImageView imageView = this.V;
            imageView.setTranslationX(translationX);
            imageView.setTranslationY(f10 + AndroidUtilities.dp(22.333f) + totalVisibility);
            float translationX2 = (o6Var.getTranslationX() - AndroidUtilities.dpf2(3.33f)) + imageView.getMeasuredWidth();
            ImageView imageView2 = this.W;
            imageView2.setTranslationX(translationX2);
            imageView2.setTranslationY(f10 + AndroidUtilities.dp(11.333f) + totalVisibility);
            sVar.setTranslationX(o6Var.getTranslationX());
            sVar.setTranslationY(f10 + AndroidUtilities.dp(31.333f));
        }
        super.dispatchDraw(canvas);
        int i28 = this.O;
        if (i28 >= 0 && i28 != 2) {
            Collections.sort(arrayList, this.w0);
            while (i11 < arrayList.size()) {
                a0 a0Var4 = (a0) arrayList.get(i11);
                canvas2.save();
                canvas2.translate(a0Var4.getX() + qVar2.getX(), a0Var4.getY() + qVar2.getY());
                a0Var4.draw(canvas2);
                canvas2.restore();
                i11++;
            }
        }
        if (z13) {
            float dp6 = AndroidUtilities.dp(16.0f);
            if (this.x0 == null) {
                this.x0 = new LinearGradient(0.0f, 0.0f, dp6, 0.0f, new int[]{16711680, -65536}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.y0 = new Matrix();
                Paint paint = new Paint(1);
                this.z0 = paint;
                paint.setShader(this.x0);
                this.z0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            }
            this.y0.reset();
            this.y0.postTranslate((getWidth() - visibleItemsMeasuredWidthWithAlpha) - dp6, 0.0f);
            this.x0.setLocalMatrix(this.y0);
            canvas2.drawRect((getWidth() - visibleItemsMeasuredWidthWithAlpha) - dp6, 0.0f, AndroidUtilities.dp(1.0f) + (getWidth() - visibleItemsMeasuredWidthWithAlpha), getHeight(), this.z0);
            canvas.restore();
            canvas.restore();
        }
        canvas.restore();
    }

    public final a0 e(long j3) {
        q qVar = this.O == 2 ? this.r : this.h;
        for (int i10 = 0; i10 < qVar.getChildCount(); i10++) {
            View childAt = qVar.getChildAt(i10);
            if (childAt instanceof a0) {
                a0 a0Var = (a0) childAt;
                if (a0Var.E == j3) {
                    return a0Var;
                }
            }
        }
        return null;
    }

    public final int f(int i10) {
        uy uyVar = this.e0;
        return (uyVar == null || uyVar.getResourceProvider() == null) ? org.telegram.ui.ActionBar.j6.w0(null, i10, false) : uyVar.getThemedColor(i10);
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

    public ci.f4 getPremiumHint() {
        return this.J;
    }

    public final void h() {
        if (this.s.H()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(UserConfig.getInstance(this.f).clientUserId));
            this.e0.getOrCreateStoryViewer().G(getContext(), null, arrayList, 0, null, null, u9.a(this.r), false);
        }
    }

    public final void i(a0 a0Var, boolean z10) {
        ValueAnimator valueAnimator;
        if ((!z10 || (valueAnimator = this.H0) == null || !valueAnimator.isRunning()) && a0Var != null) {
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            boolean z11 = a0Var.F;
            l9 l9Var = this.s;
            if (!z11 || l9Var.H()) {
                if (l9Var.I(a0Var.E) || l9Var.K(a0Var.E)) {
                    TL_stories.PeerStories y3 = l9Var.y(a0Var.E);
                    long j3 = a0Var.E;
                    da daVar = this.r0;
                    if (daVar != null) {
                        daVar.a();
                        this.r0 = null;
                    }
                    a3.h0 h0Var = new a3.h0(this, a0Var, j3, 1);
                    if (z10) {
                        h0Var.run();
                        return;
                    }
                    da n10 = ia.n(y3, h0Var);
                    a0Var.e = n10;
                    this.r0 = n10;
                    if (n10 != null) {
                        l9Var.e0(a0Var.E, true);
                    }
                }
            } else if (MessagesController.getInstance(this.f).storiesEnabled()) {
                j(0L);
            } else {
                n();
            }
        }
    }

    public final void j(long j3) {
        a0 a0Var;
        f9 o9;
        uy uyVar = this.e0;
        int i10 = this.f;
        if (j3 == 0 && (o9 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o9.a(i10, 1)) {
            uyVar.showDialog(new rg.j0(o9.b(), this.f, getContext(), this.e0, null));
            return;
        }
        int i11 = 0;
        while (true) {
            q qVar = this.h;
            if (i11 >= qVar.getChildCount()) {
                a0Var = null;
                break;
            }
            a0Var = (a0) qVar.getChildAt(i11);
            if (j3 == 0) {
                if (a0Var.F) {
                    break;
                } else {
                    i11++;
                }
            } else if (a0Var.E == j3) {
                break;
            } else {
                i11++;
            }
        }
        if (a0Var == null) {
            return;
        }
        if (j3 == 0) {
            ci.oc.E(uyVar.getParentActivity(), i10).R(ci.jc.c(a0Var));
            return;
        }
        org.telegram.ui.ActionBar.f6 resourceProvider = uyVar != null ? uyVar.getResourceProvider() : null;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getContext(), 3, resourceProvider);
        b2Var.q(500L);
        MessagesController.getInstance(i10).getStoriesController().k(j3, new l(this, b2Var, j3, a0Var, 0), true, resourceProvider);
    }

    public final boolean k(long j3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.x;
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            }
            if (((w) arrayList.get(i10)).c == j3) {
                break;
            }
            i10++;
        }
        if (i10 >= 0) {
            s4.c0 c0Var = this.S;
            if (i10 < c0Var.I0()) {
                c0Var.h1(i10, 0);
                return true;
            }
            if (i10 > c0Var.M0()) {
                c0Var.i1(i10, 0, true);
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
                AndroidUtilities.forEachViews((RecyclerView) this.h, (e2.h) new i(i11));
                return;
            }
            final int i12 = 2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d0, z11 ? 1.0f : 0.0f);
            this.C0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ai.e
                public final /* synthetic */ b0 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i10) {
                        case 0:
                            b0 b0Var = this.b;
                            b0Var.getClass();
                            b0Var.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            b0Var.b();
                            break;
                        case 1:
                            b0 b0Var2 = this.b;
                            b0Var2.getClass();
                            b0Var2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        case 2:
                            b0 b0Var3 = this.b;
                            b0Var3.getClass();
                            b0Var3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        default:
                            b0 b0Var4 = this.b;
                            b0Var4.getClass();
                            b0Var4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            b0Var4.invalidate();
                            break;
                    }
                }
            });
            this.C0.setInterpolator(qr.h);
            float f10 = this.c0;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, z11 ? f10 : 0.0f);
            this.F0 = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ai.e
                public final /* synthetic */ b0 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i11) {
                        case 0:
                            b0 b0Var = this.b;
                            b0Var.getClass();
                            b0Var.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            b0Var.b();
                            break;
                        case 1:
                            b0 b0Var2 = this.b;
                            b0Var2.getClass();
                            b0Var2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        case 2:
                            b0 b0Var3 = this.b;
                            b0Var3.getClass();
                            b0Var3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        default:
                            b0 b0Var4 = this.b;
                            b0Var4.getClass();
                            b0Var4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            b0Var4.invalidate();
                            break;
                    }
                }
            });
            this.F0.setDuration(100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.K0 = animatorSet2;
            animatorSet2.addListener(new n(i10, this, z11));
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.C0);
            arrayList.add(this.F0);
            if (this.A0) {
                this.K0.setDuration(1000L);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(this.d0, z11 ? 1.0f : 0.0f);
                this.D0 = ofFloat3;
                ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ai.e
                    public final /* synthetic */ b0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i12) {
                            case 0:
                                b0 b0Var = this.b;
                                b0Var.getClass();
                                b0Var.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                b0Var.b();
                                break;
                            case 1:
                                b0 b0Var2 = this.b;
                                b0Var2.getClass();
                                b0Var2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            case 2:
                                b0 b0Var3 = this.b;
                                b0Var3.getClass();
                                b0Var3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            default:
                                b0 b0Var4 = this.b;
                                b0Var4.getClass();
                                b0Var4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                b0Var4.invalidate();
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
                this.H0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ai.e
                    public final /* synthetic */ b0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i13) {
                            case 0:
                                b0 b0Var = this.b;
                                b0Var.getClass();
                                b0Var.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                b0Var.b();
                                break;
                            case 1:
                                b0 b0Var2 = this.b;
                                b0Var2.getClass();
                                b0Var2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            case 2:
                                b0 b0Var3 = this.b;
                                b0Var3.getClass();
                                b0Var3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            default:
                                b0 b0Var4 = this.b;
                                b0Var4.getClass();
                                b0Var4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                b0Var4.invalidate();
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
        long j3 = UserConfig.getInstance(this.f).clientUserId;
        l9 l9Var = this.s;
        if (l9Var.J(j3)) {
            return true;
        }
        return l9Var.H() && l9Var.g.size() <= 3;
    }

    public final void n() {
        if (this.J == null) {
            ci.f4 f4Var = new ci.f4(getContext(), 1);
            f4Var.h(f(org.telegram.ui.ActionBar.j6.Fi));
            f4Var.p(true);
            f4Var.K = Layout.Alignment.ALIGN_CENTER;
            f4Var.l(0.0f, 29.0f);
            this.J = f4Var;
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.j6.Gi, 0, new h(this, 1));
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) replaceSingleTag.getSpans(0, replaceSingleTag.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
                replaceSingleTag.setSpan(new v51(AndroidUtilities.bold()), replaceSingleTag.getSpanStart(clickableSpanArr[0]), replaceSingleTag.getSpanEnd(clickableSpanArr[0]), 33);
            }
            ci.f4 f4Var2 = this.J;
            f4Var2.h = ci.f4.a(replaceSingleTag, f4Var2.getTextPaint());
            this.J.s(replaceSingleTag);
            this.J.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), 0);
            if (getParent() instanceof FrameLayout) {
                ((FrameLayout) getParent()).addView(this.J, w7.y5.e(-1, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 51));
            }
        }
        ci.f4 f4Var3 = this.J;
        if (f4Var3 != null) {
            if (f4Var3.V) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
            this.J.u();
        }
    }

    public final void o() {
        o20 o20Var = ia.b;
        if (o20Var != null) {
            o20Var.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.lk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.mk, false), 0, 0);
        }
        o20 o20Var2 = ia.c;
        if (o20Var2 != null) {
            o20Var2.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.nk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ok, false), 0, 0);
        }
        o20[] o20VarArr = ia.a;
        o20 o20Var3 = o20VarArr[0];
        if (o20Var3 != null) {
            o20Var3.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.jk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kk, false), 0, 0);
        }
        o20 o20Var4 = o20VarArr[1];
        if (o20Var4 != null) {
            o20Var4.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ik, false), 0, 0);
        }
        if (ia.d != null) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.xj, false);
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false);
            ia.d.d(i0.a.d(0.25f, w02, w03), w03, 0, 0);
        }
        int textColor = getTextColor();
        this.T.setTextColor(getTextLogoColor());
        s sVar = this.U;
        if (sVar != null) {
            sVar.d();
        }
        this.V.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        AndroidUtilities.forEachViews((RecyclerView) this.h, (e2.h) new m(textColor, 0));
        AndroidUtilities.forEachViews((RecyclerView) this.r, (e2.h) new i(2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p(false, false);
        NotificationCenter.getInstance(this.f).addObserver(this, NotificationCenter.storiesUpdated);
        com.google.firebase.messaging.m mVar = this.L0;
        mVar.a = true;
        AnimatorSet animatorSet = (AnimatorSet) mVar.c;
        if (!animatorSet.isRunning()) {
            animatorSet.start();
        }
        this.a0.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f).removeObserver(this, NotificationCenter.storiesUpdated);
        com.google.firebase.messaging.m mVar = this.L0;
        mVar.a = false;
        ((AnimatorSet) mVar.c).cancel();
        da daVar = this.r0;
        if (daVar != null) {
            daVar.a();
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
            q qVar = this.r;
            int x10 = (int) qVar.getX();
            int y3 = (int) qVar.getY();
            int x11 = (int) (qVar.getX() + dp);
            int y10 = (int) (qVar.getY() + qVar.getHeight());
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

    public final void p(boolean z10, boolean z11) {
        ArrayList arrayList;
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
            arrayList3.add(new w(UserConfig.getInstance(i11).getClientUserId()));
        }
        l9 l9Var = this.s;
        ArrayList arrayList6 = i10 == 1 ? l9Var.h : l9Var.g;
        for (int i12 = 0; i12 < arrayList6.size(); i12++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList6.get(i12)).peer);
            if (peerDialogId != UserConfig.getInstance(i11).getClientUserId()) {
                arrayList3.add(new w(peerDialogId));
            }
        }
        int size = arrayList3.size();
        if (!l9Var.H()) {
            size--;
        }
        int max = Math.max(1, Math.max(l9Var.C(i10 == 1), size));
        this.f0 = null;
        boolean G = l9Var.G();
        org.telegram.ui.Components.o6 o6Var = this.T;
        if (G) {
            arrayList = arrayList3;
            if (l9Var.K(UserConfig.getInstance(i11).getClientUserId())) {
                String string = LocaleController.getString(R.string.UploadingStory);
                if (string.indexOf("…") > 0) {
                    if (this.i0 == null) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
                        pc pcVar = new pc();
                        valueOf.setSpan(pcVar, valueOf.length() - 1, valueOf.length(), 0);
                        pcVar.a = o6Var;
                        pcVar.n = true;
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
        if (!this.g0) {
            o6Var.c(this.f0, z10 && !LocaleController.isRTL, true);
        }
        this.a.a(!TextUtils.isEmpty(this.f0) || this.g0, z10);
        arrayList5.clear();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (((w) arrayList.get(i13)).c != UserConfig.getInstance(i11).clientUserId || m()) {
                arrayList5.add((w) arrayList.get(i13));
                if (arrayList5.size() >= 3) {
                    break;
                }
            }
        }
        q qVar = this.h;
        q qVar2 = this.r;
        if (!z10) {
            qVar.setItemAnimator(null);
            qVar2.setItemAnimator(null);
        } else if (this.O == 2) {
            qVar2.setItemAnimator(this.d);
            qVar.setItemAnimator(null);
        } else {
            qVar.setItemAnimator(this.R);
            qVar2.setItemAnimator(null);
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
        ci.f4 f4Var = this.J;
        if (f4Var != null) {
            f4Var.setTranslationY(f7);
        }
    }

    @Override // le.d
    public final /* synthetic */ void C(float f7, int i10) {
    }
}
