package bi;

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
import di.kc;
import di.pc;
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
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.gd;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.pr;
import org.telegram.ui.lx;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public abstract class v extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, le.d {
    public boolean A0;
    public final float B0;
    public ValueAnimator C0;
    public ValueAnimator D0;
    public final q E;
    public float E0;
    public final q F;
    public ValueAnimator F0;
    public final Paint G;
    public float G0;
    public final Paint H;
    public ValueAnimator H0;
    public final gd I;
    public float I0;
    public di.f4 J;
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
    public final org.telegram.ui.Components.q6 T;
    public final n U;
    public final ImageView V;
    public final ImageView W;
    public final le.b a;
    public final org.telegram.ui.Components.o5 a0;
    public final int b;
    public final ArrayList b0;
    public final Drawable c;
    public float c0;
    public final p d;
    public float d0;
    public int e;
    public final uy e0;
    public final int f;
    public CharSequence f0;
    public boolean g0;
    public final m h;
    public int h0;
    public SpannableStringBuilder i0;
    public ValueAnimator j0;
    public s k0;
    public boolean l0;
    public boolean m0;
    public bj0 n;
    public float n0;
    public int o0;
    public u p0;
    public org.telegram.ui.ActionBar.k q0;
    public final m r;
    public k9 r0;
    public final u8 s;
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

    public v(Context context, uy uyVar, int i10, int i11) {
        super(context);
        this.a = new le.b(1, this, pr.h, 380L, false);
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new ArrayList();
        lx lxVar = (lx) this;
        q qVar = new q(lxVar, false);
        this.E = qVar;
        q qVar2 = new q(lxVar, true);
        this.F = qVar2;
        Paint paint = new Paint();
        this.G = new Paint(1);
        this.H = new Paint(1);
        gd gdVar = new gd(this);
        this.I = gdVar;
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
        this.w0 = new a4.e(5);
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
        m mVar2 = new m(lxVar, context, 0);
        this.h = mVar2;
        mVar2.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        mVar2.setClipToPadding(false);
        mVar2.setClipChildren(false);
        gdVar.h = new a3.c(lxVar, 12);
        ah.j jVar = new ah.j(lxVar, 1);
        gdVar.l = true;
        gdVar.j = jVar;
        mVar2.j(new ah.e0(lxVar, 1));
        s4.j jVar2 = new s4.j();
        this.R = jVar2;
        jVar2.C = false;
        jVar2.n(150L);
        jVar2.m = false;
        mVar2.setItemAnimator(jVar2);
        s4.c0 c0Var = new s4.c0(0, false);
        this.S = c0Var;
        mVar2.setLayoutManager(c0Var);
        mVar2.setOnItemClickListener(new d(lxVar, 0));
        mVar2.setOnItemLongClickListener(new a1.c(lxVar, 2));
        mVar2.setAdapter(qVar);
        addView(mVar2, w7.x5.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(getContext(), true, true, false);
        this.T = q6Var;
        q6Var.setGravity(3);
        q6Var.setTextColor(getTextLogoColor());
        q6Var.setTypeface(AndroidUtilities.bold());
        q6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        q6Var.setTextSize(AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        q6Var.setImportantForAccessibility(1);
        q6Var.setFocusableInTouchMode(true);
        addView(q6Var, w7.x5.c(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.V = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AppName));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.telegram_logo_2);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, w7.x5.c(22.0f, 90));
        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(AndroidUtilities.dp(26.0f), null);
        this.a0 = o5Var;
        o5Var.a = true;
        o5Var.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.W = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(o5Var);
        addView(imageView2, w7.x5.c(40.0f, 40));
        n nVar = new n(lxVar, context, mVar);
        this.U = nVar;
        addView(nVar, w7.x5.c(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.c = getContext().getDrawable(R.drawable.msg_mini_addstory);
        m mVar3 = new m(lxVar, getContext(), 1);
        this.r = mVar3;
        getContext();
        mVar3.setLayoutManager(new s4.c0(0, false));
        mVar3.i(new o(0));
        p pVar = new p();
        this.d = pVar;
        pVar.C = false;
        pVar.m = false;
        mVar3.setItemAnimator(pVar);
        mVar3.setAdapter(qVar2);
        mVar3.setClipChildren(false);
        addView(mVar3, w7.x5.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
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
    public final void E(int i10, float f7, float f10, le.e eVar) {
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
                AndroidUtilities.runOnUIThread(new e(this, 0));
            }
            int i11 = this.O;
            m mVar = this.r;
            m mVar2 = this.h;
            if (i11 == 0) {
                AndroidUtilities.forEachViews((RecyclerView) mVar2, (e2.h) new f(0));
                mVar.setVisibility(4);
                mVar2.setVisibility(0);
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
                        if (((r) arrayList2.get(i13)).c != UserConfig.getInstance(i12).getClientUserId() || m()) {
                            arrayList.add(Long.valueOf(((r) arrayList2.get(i13)).c));
                            if (arrayList.size() == 3) {
                                break;
                            }
                        }
                        i13++;
                    }
                    mVar.setVisibility(4);
                    mVar2.setVisibility(0);
                } else if (i11 == 2) {
                    mVar.setVisibility(0);
                    mVar2.setVisibility(4);
                    this.S.h1(0, 0);
                    ah.g gVar = MessagesController.getInstance(i12).getStoriesController().K;
                    AndroidUtilities.cancelRunOnUIThread(gVar);
                    gVar.run();
                    k9 k9Var = this.r0;
                    if (k9Var != null) {
                        k9Var.a();
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
        u8 u8Var = this.s;
        if (N02 > size || ((N0 = c0Var.N0() + 9) < arrayList.size() && u8Var.D(0, ((r) arrayList.get(N0)).c) == 0)) {
            boolean z10 = this.b == 1;
            if (z10) {
                if (!u8Var.z) {
                    return;
                }
            } else if (!u8Var.p) {
                return;
            }
            u8Var.Q(z10);
        }
    }

    public final void d() {
        float a2 = w7.p.a(Math.min(this.N, this.d0), 0.0f, 1.0f);
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
        n nVar = this.U;
        if (nVar != null) {
            nVar.setAlpha(a2);
            nVar.setVisibility(a2 > 0.0f ? 0 : 8);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesUpdated && this.l0) {
            p(getVisibility() == 0, false);
            AndroidUtilities.runOnUIThread(new e(this, 2));
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
        m mVar;
        float f11;
        float f12;
        m mVar2;
        int i11;
        Canvas canvas2;
        boolean z10;
        float f13;
        double d;
        boolean z11;
        float f14;
        float f15;
        m mVar3;
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
        int R;
        canvas.save();
        int i13 = this.L;
        if (i13 > 0) {
            canvas.clipRect(0, i13, getMeasuredWidth(), getMeasuredHeight());
        }
        float measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(4.0f);
        float f23 = 0.0f;
        float lerp4 = AndroidUtilities.lerp(0.0f, measuredHeight, this.c0);
        m mVar4 = this.h;
        mVar4.setTranslationY(lerp4);
        m mVar5 = this.r;
        mVar5.setTranslationY(lerp4);
        mVar5.setTranslationX(this.s0);
        int i14 = 0;
        while (true) {
            arrayList = this.P;
            if (i14 >= arrayList.size()) {
                break;
            }
            ((u) arrayList.get(i14)).a = false;
            i14++;
        }
        arrayList.clear();
        int i15 = this.O;
        int i16 = -1;
        ArrayList arrayList2 = this.Q;
        if ((i15 == 1 || i15 == 0) && !arrayList2.isEmpty()) {
            i10 = -1;
            f7 = 4.0f;
            for (int i17 = 0; i17 < mVar4.getChildCount(); i17++) {
                u uVar = (u) mVar4.getChildAt(i17);
                i10 = uVar.E == ((Long) arrayList2.get(0)).longValue() ? RecyclerView.R(uVar) : i10;
            }
        } else {
            f7 = 4.0f;
            i10 = this.O == 2 ? 0 : -1;
        }
        int i18 = this.O;
        if (i18 < 0 || i18 == 2) {
            f10 = lerp4;
            mVar = mVar4;
            f11 = 2.0f;
            float f24 = 0.0f;
            for (int i19 = 0; i19 < mVar5.getChildCount(); i19++) {
                float x10 = ((u) mVar5.getChildAt(i19)).getX() + mVar5.getX() + r4.getMeasuredWidth();
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
            mVar4.setAlpha(1.0f - Utilities.clamp(this.N / this.B0, 1.0f, 0.0f));
            this.o0 = -1;
            if (this.n0 != 0.0f) {
                int i20 = 0;
                int i21 = -1;
                f11 = 2.0f;
                while (i20 < mVar4.getChildCount()) {
                    View childAt = mVar4.getChildAt(i20);
                    if (childAt.getX() < f23 || childAt.getX() + childAt.getMeasuredWidth() > getMeasuredWidth() || (R = RecyclerView.R(childAt)) < 0 || (i21 != i16 && R >= i21)) {
                        f22 = lerp4;
                    } else {
                        f22 = lerp4;
                        if (((r) this.x.get(R)).c != UserConfig.getInstance(this.f).clientUserId) {
                            this.p0 = (u) childAt;
                            i21 = R;
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
            while (i22 < mVar4.getChildCount()) {
                u uVar2 = (u) mVar4.getChildAt(i22);
                uVar2.setClipInParent(false);
                j9 j9Var = uVar2.O;
                int R2 = RecyclerView.R(uVar2);
                float f26 = this.N;
                if (R2 >= i10 && R2 < arrayList2.size() + i10) {
                    int i23 = R2 - i10;
                    if (i23 == i10 + 2) {
                        f26 = this.N;
                    } else if (i23 == i10 + 1) {
                        f13 = measuredHeight;
                        f26 = (float) Math.pow(this.N, 0.5d);
                        d = 0.25d;
                        if (R2 < i10) {
                            f26 = (float) Math.pow(this.N, d);
                        }
                        uVar2.d(f26, this.d0, this.n0, this.o0 == uVar2.b);
                        if (R2 > i10 || R2 >= arrayList2.size() + i10) {
                            z11 = z10;
                            f14 = f25;
                            f15 = f26;
                            mVar3 = mVar4;
                            f16 = 0.0f;
                            j9Var.g = 0.0f;
                            j9Var.h = 0.0f;
                            j9Var.i = 0.0f;
                            j9Var.j = 0.0f;
                            j9Var.k = false;
                        } else {
                            u uVar3 = (u) mVar4.getChildAt(i22 - 1);
                            if (uVar3 != null) {
                                j9 j9Var2 = uVar3.O;
                                float dp2 = AndroidUtilities.dp(48.0f);
                                float dp3 = AndroidUtilities.dp(26.33f);
                                z11 = z10;
                                float lerp5 = (AndroidUtilities.lerp(dp2, dp3, uVar3.J) + AndroidUtilities.dp(8.0f)) / f11;
                                float lerp6 = (AndroidUtilities.lerp(dp2, dp3, uVar2.J) + AndroidUtilities.dp(8.0f)) / f11;
                                float x11 = uVar3.getX() + j9Var2.F.centerX();
                                float y3 = uVar3.getY() + j9Var2.F.centerY();
                                float x12 = (uVar2.getX() + j9Var.F.centerX()) - x11;
                                float y10 = (uVar2.getY() + j9Var.F.centerY()) - y3;
                                f14 = f25;
                                if (((float) Math.sqrt((y10 * y10) + (x12 * x12))) < lerp5 + lerp6) {
                                    float degrees = (float) Math.toDegrees(Math.acos(r1 / r3) * 2.0d);
                                    f15 = f26;
                                    mVar3 = mVar4;
                                    float degrees2 = (float) Math.toDegrees(Math.atan2(y10, x12));
                                    float f27 = degrees / f11;
                                    j9Var2.g = degrees2 - f27;
                                    j9Var2.h = degrees2 + f27;
                                    float degrees3 = (float) Math.toDegrees(Math.atan2(-y10, -x12));
                                    float f28 = -Math.abs(degrees3 - f27);
                                    float abs = Math.abs(degrees3 + f27);
                                    j9Var.i = f28;
                                    j9Var.j = abs;
                                    f16 = 0.0f;
                                } else {
                                    f15 = f26;
                                    mVar3 = mVar4;
                                    f16 = 0.0f;
                                    j9Var2.g = 0.0f;
                                    j9Var2.h = 0.0f;
                                    j9Var.i = 0.0f;
                                    j9Var.j = 0.0f;
                                }
                                j9Var2.k = false;
                                j9Var.k = false;
                            } else {
                                z11 = z10;
                                f14 = f25;
                                f15 = f26;
                                mVar3 = mVar4;
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
                            lerp2 = AndroidUtilities.lerp(0.0f, f30 - uVar2.getLeft(), this.J0.getInterpolation(this.E0));
                        } else {
                            if (this.n0 > f17) {
                                int i24 = uVar2.b;
                                int i25 = this.o0;
                                if (i24 < i25) {
                                    f21 = -dp;
                                } else if (i24 > i25) {
                                    f21 = dp;
                                }
                                lerp2 = AndroidUtilities.lerp(f30 - uVar2.getLeft(), f21, 1.0f - this.I0);
                                f18 = 0.0f;
                            }
                            f21 = 0.0f;
                            lerp2 = AndroidUtilities.lerp(f30 - uVar2.getLeft(), f21, 1.0f - this.I0);
                            f18 = 0.0f;
                        }
                        float a2 = w7.p.a((this.c0 - 0.2f) / 0.1f, f18, 1.0f);
                        i12 = R2 - i10;
                        if (i12 == 0) {
                            f19 = 0.65f;
                            lerp3 = AndroidUtilities.lerp(f18, f10 - f13, pr.h.getInterpolation(this.N));
                        } else {
                            f19 = 0.65f;
                            if (i12 == 1) {
                                lerp3 = AndroidUtilities.lerp(f18, (f10 - f13) * 0.65f, pr.h.getInterpolation(this.N));
                            } else {
                                f20 = 0.0f;
                                float f31 = (uVar2.b == this.o0 || this.n0 <= f18) ? 0.0f : (-dp) / f11;
                                float lerp7 = AndroidUtilities.lerp(i12 != 0 ? AndroidUtilities.lerp(f31, f10 - f13, this.G0) : i12 == 1 ? AndroidUtilities.lerp(f31, (f10 - f13) * f19, this.G0) : 0.0f, f20, a2);
                                if (this.N <= 0.0f) {
                                    boolean z12 = R2 >= i10 && R2 <= i10 + 2;
                                    if (!z11) {
                                        uVar2.setCrossfadeTo(-1L);
                                    } else if (i12 < 0 || i12 >= arrayList2.size()) {
                                        uVar2.setCrossfadeTo(-1L);
                                    } else {
                                        uVar2.setCrossfadeTo(((Long) arrayList2.get(i12)).longValue());
                                    }
                                    uVar2.a = z12;
                                    uVar2.d = R2 == i10;
                                    uVar2.c = R2 >= (arrayList2.size() + i10) + (-1);
                                    uVar2.setTranslationX(lerp2);
                                    uVar2.setTranslationY(lerp7);
                                    if (z12) {
                                        arrayList.add(uVar2);
                                    }
                                } else if (mVar3.getItemAnimator() == null || !mVar3.getItemAnimator().k()) {
                                    if (this.n0 > 0.0f) {
                                        int i26 = uVar2.b;
                                        int i27 = this.o0;
                                        if (i26 < i27) {
                                            uVar2.setAlpha(f29);
                                        } else if (i26 > i27) {
                                            uVar2.setAlpha(f29);
                                        } else {
                                            uVar2.setAlpha(1.0f);
                                        }
                                    } else {
                                        uVar2.setAlpha(1.0f);
                                    }
                                    uVar2.setTranslationX(lerp2);
                                    uVar2.setTranslationY(lerp7);
                                }
                                if (uVar2.a) {
                                    float dp4 = (AndroidUtilities.dp(70.0f) / f11) + (uVar2.getMeasuredWidth() / f11) + uVar2.getX() + mVar3.getX();
                                    if (f14 == 0.0f || dp4 > f14) {
                                        f25 = dp4;
                                        i22++;
                                        measuredHeight = f13;
                                        z10 = z11;
                                        mVar4 = mVar3;
                                    }
                                }
                                f25 = f14;
                                i22++;
                                measuredHeight = f13;
                                z10 = z11;
                                mVar4 = mVar3;
                            }
                        }
                        f20 = lerp3;
                        if (uVar2.b == this.o0) {
                        }
                        float lerp72 = AndroidUtilities.lerp(i12 != 0 ? AndroidUtilities.lerp(f31, f10 - f13, this.G0) : i12 == 1 ? AndroidUtilities.lerp(f31, (f10 - f13) * f19, this.G0) : 0.0f, f20, a2);
                        if (this.N <= 0.0f) {
                        }
                        if (uVar2.a) {
                        }
                        f25 = f14;
                        i22++;
                        measuredHeight = f13;
                        z10 = z11;
                        mVar4 = mVar3;
                    } else {
                        f13 = measuredHeight;
                        d = 0.25d;
                        f26 = (float) Math.pow(this.N, 0.25d);
                        if (R2 < i10) {
                        }
                        uVar2.d(f26, this.d0, this.n0, this.o0 == uVar2.b);
                        if (R2 > i10) {
                        }
                        z11 = z10;
                        f14 = f25;
                        f15 = f26;
                        mVar3 = mVar4;
                        f16 = 0.0f;
                        j9Var.g = 0.0f;
                        j9Var.h = 0.0f;
                        j9Var.i = 0.0f;
                        j9Var.j = 0.0f;
                        j9Var.k = false;
                        dp = AndroidUtilities.dp(16.0f) * Utilities.clamp((this.n0 - 0.5f) / 0.5f, 1.0f, f16);
                        float f292 = (float) (((1.0f - r2) * 0.5f) + 0.5d);
                        if (R2 <= i10) {
                        }
                        float f302 = lerp + this.s0;
                        if (this.A0) {
                        }
                        float a22 = w7.p.a((this.c0 - 0.2f) / 0.1f, f18, 1.0f);
                        i12 = R2 - i10;
                        if (i12 == 0) {
                        }
                        f20 = lerp3;
                        if (uVar2.b == this.o0) {
                        }
                        float lerp722 = AndroidUtilities.lerp(i12 != 0 ? AndroidUtilities.lerp(f31, f10 - f13, this.G0) : i12 == 1 ? AndroidUtilities.lerp(f31, (f10 - f13) * f19, this.G0) : 0.0f, f20, a22);
                        if (this.N <= 0.0f) {
                        }
                        if (uVar2.a) {
                        }
                        f25 = f14;
                        i22++;
                        measuredHeight = f13;
                        z10 = z11;
                        mVar4 = mVar3;
                    }
                }
                f13 = measuredHeight;
                d = 0.25d;
                if (R2 < i10) {
                }
                uVar2.d(f26, this.d0, this.n0, this.o0 == uVar2.b);
                if (R2 > i10) {
                }
                z11 = z10;
                f14 = f25;
                f15 = f26;
                mVar3 = mVar4;
                f16 = 0.0f;
                j9Var.g = 0.0f;
                j9Var.h = 0.0f;
                j9Var.i = 0.0f;
                j9Var.j = 0.0f;
                j9Var.k = false;
                dp = AndroidUtilities.dp(16.0f) * Utilities.clamp((this.n0 - 0.5f) / 0.5f, 1.0f, f16);
                float f2922 = (float) (((1.0f - r2) * 0.5f) + 0.5d);
                if (R2 <= i10) {
                }
                float f3022 = lerp + this.s0;
                if (this.A0) {
                }
                float a222 = w7.p.a((this.c0 - 0.2f) / 0.1f, f18, 1.0f);
                i12 = R2 - i10;
                if (i12 == 0) {
                }
                f20 = lerp3;
                if (uVar2.b == this.o0) {
                }
                float lerp7222 = AndroidUtilities.lerp(i12 != 0 ? AndroidUtilities.lerp(f31, f10 - f13, this.G0) : i12 == 1 ? AndroidUtilities.lerp(f31, (f10 - f13) * f19, this.G0) : 0.0f, f20, a222);
                if (this.N <= 0.0f) {
                }
                if (uVar2.a) {
                }
                f25 = f14;
                i22++;
                measuredHeight = f13;
                z10 = z11;
                mVar4 = mVar3;
            }
            f12 = f25;
            mVar = mVar4;
        }
        if (this.J != null) {
            float lerp8 = AndroidUtilities.lerp(29, 74, pr.g.getInterpolation(this.N));
            mVar2 = mVar;
            i11 = 0;
            if (mVar.getChildCount() > 0) {
                lerp8 += mVar2.getChildAt(0).getLeft();
            }
            this.J.l(0.0f, lerp8);
        } else {
            mVar2 = mVar;
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
            n nVar = this.U;
            float totalVisibility = nVar.getTotalVisibility() * (-AndroidUtilities.dp(10.0f));
            org.telegram.ui.Components.q6 q6Var = this.T;
            q6Var.setPivotX(0.0f);
            q6Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, nVar.getTotalVisibility()));
            q6Var.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, nVar.getTotalVisibility()));
            q6Var.setTranslationY((((f10 + AndroidUtilities.dp(14.0f)) - ((q6Var.getMeasuredHeight() - q6Var.getTextHeight()) / f11)) + AndroidUtilities.dp(f7)) - (nVar.getTotalVisibility() * AndroidUtilities.dp(6.0f)));
            int dp5 = AndroidUtilities.dp(72.0f);
            float f32 = this.N;
            float lerp9 = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f), AndroidUtilities.dp(26.33f), f32) / f11;
            float a10 = org.telegram.ui.Cells.p6.a(lerp9, 2.0f, AndroidUtilities.lerp((dp5 / f11) - lerp9, 0.0f, f32), -dp5) + AndroidUtilities.dp(12.0f) + f12;
            q6Var.setTranslationX(a10);
            org.telegram.ui.Components.p6 drawable = q6Var.getDrawable();
            drawable.H = (this.q0.E.getVisibleItemsMeasuredWidthWithAlpha() * min) + (a10 - AndroidUtilities.dp(12.0f));
            drawable.invalidateSelf();
            float translationX = q6Var.getTranslationX() + AndroidUtilities.dp(1.0f);
            ImageView imageView = this.V;
            imageView.setTranslationX(translationX);
            imageView.setTranslationY(f10 + AndroidUtilities.dp(22.333f) + totalVisibility);
            float translationX2 = (q6Var.getTranslationX() - AndroidUtilities.dpf2(3.33f)) + imageView.getMeasuredWidth();
            ImageView imageView2 = this.W;
            imageView2.setTranslationX(translationX2);
            imageView2.setTranslationY(f10 + AndroidUtilities.dp(11.333f) + totalVisibility);
            nVar.setTranslationX(q6Var.getTranslationX());
            nVar.setTranslationY(f10 + AndroidUtilities.dp(31.333f));
        }
        super.dispatchDraw(canvas);
        int i28 = this.O;
        if (i28 >= 0 && i28 != 2) {
            Collections.sort(arrayList, this.w0);
            while (i11 < arrayList.size()) {
                u uVar4 = (u) arrayList.get(i11);
                canvas2.save();
                canvas2.translate(uVar4.getX() + mVar2.getX(), uVar4.getY() + mVar2.getY());
                uVar4.draw(canvas2);
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

    public final u e(long j3) {
        m mVar = this.O == 2 ? this.r : this.h;
        for (int i10 = 0; i10 < mVar.getChildCount(); i10++) {
            View childAt = mVar.getChildAt(i10);
            if (childAt instanceof u) {
                u uVar = (u) childAt;
                if (uVar.E == j3) {
                    return uVar;
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

    public di.f4 getPremiumHint() {
        return this.J;
    }

    public final void h() {
        if (this.s.H()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(UserConfig.getInstance(this.f).clientUserId));
            this.e0.getOrCreateStoryViewer().G(getContext(), null, arrayList, 0, null, null, d9.a(this.r), false);
        }
    }

    public final void i(u uVar, boolean z10) {
        ValueAnimator valueAnimator;
        if ((!z10 || (valueAnimator = this.H0) == null || !valueAnimator.isRunning()) && uVar != null) {
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            boolean z11 = uVar.F;
            u8 u8Var = this.s;
            if (!z11 || u8Var.H()) {
                if (u8Var.I(uVar.E) || u8Var.K(uVar.E)) {
                    TL_stories.PeerStories y3 = u8Var.y(uVar.E);
                    long j3 = uVar.E;
                    k9 k9Var = this.r0;
                    if (k9Var != null) {
                        k9Var.a();
                        this.r0 = null;
                    }
                    a3.g0 g0Var = new a3.g0(this, uVar, j3, 1);
                    if (z10) {
                        g0Var.run();
                        return;
                    }
                    k9 n10 = p9.n(y3, g0Var);
                    uVar.e = n10;
                    this.r0 = n10;
                    if (n10 != null) {
                        u8Var.e0(uVar.E, true);
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
        u uVar;
        n8 o9;
        uy uyVar = this.e0;
        int i10 = this.f;
        if (j3 == 0 && (o9 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o9.a(i10, 1)) {
            uyVar.showDialog(new sg.k0(o9.b(), this.f, getContext(), this.e0, null));
            return;
        }
        int i11 = 0;
        while (true) {
            m mVar = this.h;
            if (i11 >= mVar.getChildCount()) {
                uVar = null;
                break;
            }
            uVar = (u) mVar.getChildAt(i11);
            if (j3 == 0) {
                if (uVar.F) {
                    break;
                } else {
                    i11++;
                }
            } else if (uVar.E == j3) {
                break;
            } else {
                i11++;
            }
        }
        if (uVar == null) {
            return;
        }
        if (j3 == 0) {
            pc.E(uyVar.getParentActivity(), i10).R(kc.c(uVar));
            return;
        }
        org.telegram.ui.ActionBar.f6 resourceProvider = uyVar != null ? uyVar.getResourceProvider() : null;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getContext(), 3, resourceProvider);
        b2Var.q(500L);
        MessagesController.getInstance(i10).getStoriesController().k(j3, new i(this, b2Var, j3, uVar, 0), true, resourceProvider);
    }

    public final boolean k(long j3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.x;
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            }
            if (((r) arrayList.get(i10)).c == j3) {
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
                AndroidUtilities.forEachViews((RecyclerView) this.h, (e2.h) new f(i11));
                return;
            }
            final int i12 = 2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d0, z11 ? 1.0f : 0.0f);
            this.C0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: bi.c
                public final /* synthetic */ v b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i10) {
                        case 0:
                            v vVar = this.b;
                            vVar.getClass();
                            vVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            vVar.b();
                            break;
                        case 1:
                            v vVar2 = this.b;
                            vVar2.getClass();
                            vVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        case 2:
                            v vVar3 = this.b;
                            vVar3.getClass();
                            vVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        default:
                            v vVar4 = this.b;
                            vVar4.getClass();
                            vVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            vVar4.invalidate();
                            break;
                    }
                }
            });
            this.C0.setInterpolator(pr.h);
            float f10 = this.c0;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, z11 ? f10 : 0.0f);
            this.F0 = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: bi.c
                public final /* synthetic */ v b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i11) {
                        case 0:
                            v vVar = this.b;
                            vVar.getClass();
                            vVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            vVar.b();
                            break;
                        case 1:
                            v vVar2 = this.b;
                            vVar2.getClass();
                            vVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        case 2:
                            v vVar3 = this.b;
                            vVar3.getClass();
                            vVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        default:
                            v vVar4 = this.b;
                            vVar4.getClass();
                            vVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            vVar4.invalidate();
                            break;
                    }
                }
            });
            this.F0.setDuration(100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.K0 = animatorSet2;
            animatorSet2.addListener(new ah.q0(i11, this, z11));
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.C0);
            arrayList.add(this.F0);
            if (this.A0) {
                this.K0.setDuration(1000L);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(this.d0, z11 ? 1.0f : 0.0f);
                this.D0 = ofFloat3;
                ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: bi.c
                    public final /* synthetic */ v b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i12) {
                            case 0:
                                v vVar = this.b;
                                vVar.getClass();
                                vVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                vVar.b();
                                break;
                            case 1:
                                v vVar2 = this.b;
                                vVar2.getClass();
                                vVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            case 2:
                                v vVar3 = this.b;
                                vVar3.getClass();
                                vVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            default:
                                v vVar4 = this.b;
                                vVar4.getClass();
                                vVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                vVar4.invalidate();
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
                this.H0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: bi.c
                    public final /* synthetic */ v b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i13) {
                            case 0:
                                v vVar = this.b;
                                vVar.getClass();
                                vVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                vVar.b();
                                break;
                            case 1:
                                v vVar2 = this.b;
                                vVar2.getClass();
                                vVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            case 2:
                                v vVar3 = this.b;
                                vVar3.getClass();
                                vVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            default:
                                v vVar4 = this.b;
                                vVar4.getClass();
                                vVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                vVar4.invalidate();
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
        u8 u8Var = this.s;
        if (u8Var.J(j3)) {
            return true;
        }
        return u8Var.H() && u8Var.g.size() <= 3;
    }

    public final void n() {
        if (this.J == null) {
            di.f4 f4Var = new di.f4(getContext(), 1);
            f4Var.h(f(org.telegram.ui.ActionBar.j6.Fi));
            f4Var.p(true);
            f4Var.K = Layout.Alignment.ALIGN_CENTER;
            f4Var.l(0.0f, 29.0f);
            this.J = f4Var;
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.j6.Gi, 0, new e(this, 1));
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) replaceSingleTag.getSpans(0, replaceSingleTag.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
                replaceSingleTag.setSpan(new e51(AndroidUtilities.bold()), replaceSingleTag.getSpanStart(clickableSpanArr[0]), replaceSingleTag.getSpanEnd(clickableSpanArr[0]), 33);
            }
            di.f4 f4Var2 = this.J;
            f4Var2.h = di.f4.a(replaceSingleTag, f4Var2.getTextPaint());
            this.J.s(replaceSingleTag);
            this.J.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), 0);
            if (getParent() instanceof FrameLayout) {
                ((FrameLayout) getParent()).addView(this.J, w7.x5.e(-1, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 51));
            }
        }
        di.f4 f4Var3 = this.J;
        if (f4Var3 != null) {
            if (f4Var3.V) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
            this.J.u();
        }
    }

    public final void o() {
        o20 o20Var = p9.b;
        if (o20Var != null) {
            o20Var.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.lk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.mk, false), 0, 0);
        }
        o20 o20Var2 = p9.c;
        if (o20Var2 != null) {
            o20Var2.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.nk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ok, false), 0, 0);
        }
        o20[] o20VarArr = p9.a;
        o20 o20Var3 = o20VarArr[0];
        if (o20Var3 != null) {
            o20Var3.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.jk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kk, false), 0, 0);
        }
        o20 o20Var4 = o20VarArr[1];
        if (o20Var4 != null) {
            o20Var4.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ik, false), 0, 0);
        }
        if (p9.d != null) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.xj, false);
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false);
            p9.d.d(i0.a.d(0.25f, w02, w03), w03, 0, 0);
        }
        int textColor = getTextColor();
        this.T.setTextColor(getTextLogoColor());
        n nVar = this.U;
        if (nVar != null) {
            nVar.b();
        }
        this.V.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        AndroidUtilities.forEachViews((RecyclerView) this.h, (e2.h) new j(textColor, 0));
        AndroidUtilities.forEachViews((RecyclerView) this.r, (e2.h) new f(2));
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
        k9 k9Var = this.r0;
        if (k9Var != null) {
            k9Var.a();
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
            m mVar = this.r;
            int x10 = (int) mVar.getX();
            int y3 = (int) mVar.getY();
            int x11 = (int) (mVar.getX() + dp);
            int y10 = (int) (mVar.getY() + mVar.getHeight());
            gd gdVar = this.I;
            gdVar.getClass();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(x10, y3, x11, y10);
            gdVar.i = false;
            gdVar.c = 0;
            gdVar.a(rectF);
            if (gdVar.b(motionEvent)) {
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
            arrayList3.add(new r(UserConfig.getInstance(i11).getClientUserId()));
        }
        u8 u8Var = this.s;
        ArrayList arrayList6 = i10 == 1 ? u8Var.h : u8Var.g;
        for (int i12 = 0; i12 < arrayList6.size(); i12++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList6.get(i12)).peer);
            if (peerDialogId != UserConfig.getInstance(i11).getClientUserId()) {
                arrayList3.add(new r(peerDialogId));
            }
        }
        int size = arrayList3.size();
        if (!u8Var.H()) {
            size--;
        }
        int max = Math.max(1, Math.max(u8Var.C(i10 == 1), size));
        this.f0 = null;
        boolean G = u8Var.G();
        org.telegram.ui.Components.q6 q6Var = this.T;
        if (G) {
            arrayList = arrayList3;
            if (u8Var.K(UserConfig.getInstance(i11).getClientUserId())) {
                String string = LocaleController.getString(R.string.UploadingStory);
                if (string.indexOf("…") > 0) {
                    if (this.i0 == null) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
                        vb vbVar = new vb();
                        valueOf.setSpan(vbVar, valueOf.length() - 1, valueOf.length(), 0);
                        vbVar.a = q6Var;
                        vbVar.n = true;
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
            q6Var.c(this.f0, z10 && !LocaleController.isRTL, true);
        }
        this.a.a(!TextUtils.isEmpty(this.f0) || this.g0, z10);
        arrayList5.clear();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (((r) arrayList.get(i13)).c != UserConfig.getInstance(i11).clientUserId || m()) {
                arrayList5.add((r) arrayList.get(i13));
                if (arrayList5.size() >= 3) {
                    break;
                }
            }
        }
        m mVar = this.h;
        m mVar2 = this.r;
        if (!z10) {
            mVar.setItemAnimator(null);
            mVar2.setItemAnimator(null);
        } else if (this.O == 2) {
            mVar2.setItemAnimator(this.d);
            mVar.setItemAnimator(null);
        } else {
            mVar.setItemAnimator(this.R);
            mVar2.setItemAnimator(null);
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
        di.f4 f4Var = this.J;
        if (f4Var != null) {
            f4Var.setTranslationY(f7);
        }
    }

    @Override // le.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}
