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
import di.fc;
import di.kc;
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
import org.telegram.ui.Components.b30;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.hd;
import org.telegram.ui.Components.j61;
import org.telegram.ui.px;
import org.telegram.ui.yy;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public abstract class v extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, ne.d {
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
    public final hd I;
    public float I0;
    public di.d4 J;
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
    public final org.telegram.ui.Components.s6 T;
    public final n U;
    public final ImageView V;
    public final ImageView W;
    public final ne.b a;
    public final org.telegram.ui.Components.q5 a0;
    public final int b;
    public final ArrayList b0;
    public final Drawable c;
    public float c0;
    public final p d;
    public float d0;
    public int e;
    public final yy e0;
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
    public ck0 n;
    public float n0;
    public int o0;
    public u p0;
    public org.telegram.ui.ActionBar.k q0;
    public final m r;
    public n9 r0;
    public final x8 s;
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

    public v(Context context, yy yyVar, int i10, int i11) {
        super(context);
        this.a = new ne.b(1, this, es.h, 380L, false);
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new ArrayList();
        px pxVar = (px) this;
        q qVar = new q(pxVar, false);
        this.E = qVar;
        q qVar2 = new q(pxVar, true);
        this.F = qVar2;
        Paint paint = new Paint();
        this.G = new Paint(1);
        this.H = new Paint(1);
        hd hdVar = new hd(this);
        this.I = hdVar;
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
        this.w0 = new a4.d(4);
        this.B0 = 0.3f;
        this.E0 = 1.0f;
        new OvershootInterpolator(0.9f);
        this.J0 = new OvershootInterpolator(0.95f);
        c2.b bVar = new c2.b(this);
        this.L0 = bVar;
        this.b = i11;
        this.f = i10;
        this.e0 = yyVar;
        this.s0 = AndroidUtilities.dp(68.0f);
        this.s = MessagesController.getInstance(i10).getStoriesController();
        m mVar = new m(pxVar, context, 0);
        this.h = mVar;
        mVar.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        mVar.setClipToPadding(false);
        mVar.setClipChildren(false);
        hdVar.h = new a3.d(pxVar, 13);
        ah.j jVar = new ah.j(pxVar, 1);
        hdVar.l = true;
        hdVar.j = jVar;
        mVar.j(new ah.d0(pxVar, 1));
        s4.k kVar = new s4.k();
        this.R = kVar;
        kVar.C = false;
        kVar.n(150L);
        kVar.m = false;
        mVar.setItemAnimator(kVar);
        s4.b0 b0Var = new s4.b0(0, false);
        this.S = b0Var;
        mVar.setLayoutManager(b0Var);
        mVar.setOnItemClickListener(new d(pxVar, 0));
        mVar.setOnItemLongClickListener(new a1.c(pxVar, 3));
        mVar.setAdapter(qVar);
        addView(mVar, w7.z5.a(-2.0f, 0.0f, 4.0f, 0.0f, 0.0f, -1, 0));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(getContext(), true, true, false);
        this.T = s6Var;
        s6Var.setGravity(3);
        s6Var.setTextColor(getTextLogoColor());
        s6Var.setTypeface(AndroidUtilities.bold());
        s6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        s6Var.setTextSize(AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        s6Var.setImportantForAccessibility(1);
        s6Var.setFocusableInTouchMode(true);
        addView(s6Var, w7.z5.d(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.V = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AppName));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.telegram_logo_2);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, w7.z5.d(22.0f, 90));
        org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(AndroidUtilities.dp(26.0f), null);
        this.a0 = q5Var;
        q5Var.a = true;
        q5Var.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.W = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(q5Var);
        addView(imageView2, w7.z5.d(40.0f, 40));
        n nVar = new n(pxVar, context, bVar);
        this.U = nVar;
        addView(nVar, w7.z5.d(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.c = getContext().getDrawable(R.drawable.msg_mini_addstory);
        m mVar2 = new m(pxVar, getContext(), 1);
        this.r = mVar2;
        getContext();
        mVar2.setLayoutManager(new s4.b0(0, false));
        mVar2.i(new o(0));
        p pVar = new p();
        this.d = pVar;
        pVar.C = false;
        pVar.m = false;
        mVar2.setItemAnimator(pVar);
        mVar2.setAdapter(qVar2);
        mVar2.setClipChildren(false);
        addView(mVar2, w7.z5.a(-2.0f, 0.0f, 4.0f, 0.0f, 0.0f, -1, 0));
        setClipChildren(false);
        setClipToPadding(false);
        d();
        q(false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTextColor() {
        return this.b == 0 ? f(org.telegram.ui.ActionBar.g6.A8) : f(org.telegram.ui.ActionBar.g6.P8);
    }

    private int getTextLogoColor() {
        return f(org.telegram.ui.ActionBar.g6.gl);
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
                AndroidUtilities.forEachViews((RecyclerView) mVar2, (Utilities.Callback<View>) new f(0));
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
                    n9 n9Var = this.r0;
                    if (n9Var != null) {
                        n9Var.a();
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
        x8 x8Var = this.s;
        if (N02 > size || ((N0 = b0Var.N0() + 9) < arrayList.size() && x8Var.D(0, ((r) arrayList.get(N0)).c) == 0)) {
            boolean z10 = this.b == 1;
            if (z10) {
                if (!x8Var.z) {
                    return;
                }
            } else if (!x8Var.p) {
                return;
            }
            x8Var.Q(z10);
        }
    }

    public final void d() {
        float a2 = w7.r.a(Math.min(this.N, this.d0), 0.0f, 1.0f);
        float f7 = this.a.e;
        float f10 = 1.0f - f7;
        float f11 = f7 * a2;
        float f12 = f10 * a2;
        org.telegram.ui.Components.s6 s6Var = this.T;
        if (s6Var != null) {
            s6Var.setAlpha(f11);
            s6Var.setVisibility(f11 > 0.0f ? 0 : 8);
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
            q(getVisibility() == 0, false);
            AndroidUtilities.runOnUIThread(new e(this, 2));
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
                s4.b0 b0Var = this.S;
                i10 = b0Var.I0();
                if (i10 == -1) {
                    i10 = b0Var.L0();
                }
                z10 = true;
            } else {
                z10 = false;
            }
            mVar4.setAlpha(1.0f - Utilities.clamp(this.N / this.B0, 1.0f, 0.0f));
            this.o0 = -1;
            if (this.n0 != 0.0f) {
                int i20 = -1;
                int i21 = 0;
                f11 = 2.0f;
                while (i21 < mVar4.getChildCount()) {
                    View childAt = mVar4.getChildAt(i21);
                    if (childAt.getX() < f23 || childAt.getX() + childAt.getMeasuredWidth() > getMeasuredWidth() || (R = RecyclerView.R(childAt)) < 0 || (i20 != i16 && R >= i20)) {
                        f22 = lerp4;
                    } else {
                        f22 = lerp4;
                        if (((r) this.x.get(R)).c != UserConfig.getInstance(this.f).clientUserId) {
                            this.p0 = (u) childAt;
                            i20 = R;
                        }
                    }
                    i21++;
                    lerp4 = f22;
                    i16 = -1;
                    f23 = 0.0f;
                }
                f10 = lerp4;
                this.o0 = i20;
            } else {
                f10 = lerp4;
                f11 = 2.0f;
            }
            float f25 = 0.0f;
            int i22 = 0;
            while (i22 < mVar4.getChildCount()) {
                u uVar2 = (u) mVar4.getChildAt(i22);
                uVar2.setClipInParent(false);
                m9 m9Var = uVar2.O;
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
                            m9Var.g = 0.0f;
                            m9Var.h = 0.0f;
                            m9Var.i = 0.0f;
                            m9Var.j = 0.0f;
                            m9Var.k = false;
                        } else {
                            u uVar3 = (u) mVar4.getChildAt(i22 - 1);
                            if (uVar3 != null) {
                                m9 m9Var2 = uVar3.O;
                                float dp2 = AndroidUtilities.dp(48.0f);
                                float dp3 = AndroidUtilities.dp(26.33f);
                                z11 = z10;
                                float lerp5 = (AndroidUtilities.lerp(dp2, dp3, uVar3.J) + AndroidUtilities.dp(8.0f)) / f11;
                                float lerp6 = (AndroidUtilities.lerp(dp2, dp3, uVar2.J) + AndroidUtilities.dp(8.0f)) / f11;
                                float x11 = uVar3.getX() + m9Var2.F.centerX();
                                float y3 = uVar3.getY() + m9Var2.F.centerY();
                                float x12 = (uVar2.getX() + m9Var.F.centerX()) - x11;
                                float y10 = (uVar2.getY() + m9Var.F.centerY()) - y3;
                                f14 = f25;
                                if (((float) Math.sqrt((y10 * y10) + (x12 * x12))) < lerp5 + lerp6) {
                                    float degrees = (float) Math.toDegrees(Math.acos(r1 / r3) * 2.0d);
                                    f15 = f26;
                                    mVar3 = mVar4;
                                    float degrees2 = (float) Math.toDegrees(Math.atan2(y10, x12));
                                    float f27 = degrees / f11;
                                    m9Var2.g = degrees2 - f27;
                                    m9Var2.h = degrees2 + f27;
                                    float degrees3 = (float) Math.toDegrees(Math.atan2(-y10, -x12));
                                    float f28 = -Math.abs(degrees3 - f27);
                                    float abs = Math.abs(degrees3 + f27);
                                    m9Var.i = f28;
                                    m9Var.j = abs;
                                    f16 = 0.0f;
                                } else {
                                    f15 = f26;
                                    mVar3 = mVar4;
                                    f16 = 0.0f;
                                    m9Var2.g = 0.0f;
                                    m9Var2.h = 0.0f;
                                    m9Var.i = 0.0f;
                                    m9Var.j = 0.0f;
                                }
                                m9Var2.k = false;
                                m9Var.k = false;
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
                        float a2 = w7.r.a((this.c0 - 0.2f) / 0.1f, f18, 1.0f);
                        i12 = R2 - i10;
                        if (i12 == 0) {
                            f19 = 0.65f;
                            lerp3 = AndroidUtilities.lerp(f18, f10 - f13, es.h.getInterpolation(this.N));
                        } else {
                            f19 = 0.65f;
                            if (i12 == 1) {
                                lerp3 = AndroidUtilities.lerp(f18, (f10 - f13) * 0.65f, es.h.getInterpolation(this.N));
                            } else {
                                f20 = f18;
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
                        m9Var.g = 0.0f;
                        m9Var.h = 0.0f;
                        m9Var.i = 0.0f;
                        m9Var.j = 0.0f;
                        m9Var.k = false;
                        dp = AndroidUtilities.dp(16.0f) * Utilities.clamp((this.n0 - 0.5f) / 0.5f, 1.0f, f16);
                        float f292 = (float) (((1.0f - r2) * 0.5f) + 0.5d);
                        if (R2 <= i10) {
                        }
                        float f302 = lerp + this.s0;
                        if (this.A0) {
                        }
                        float a22 = w7.r.a((this.c0 - 0.2f) / 0.1f, f18, 1.0f);
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
                m9Var.g = 0.0f;
                m9Var.h = 0.0f;
                m9Var.i = 0.0f;
                m9Var.j = 0.0f;
                m9Var.k = false;
                dp = AndroidUtilities.dp(16.0f) * Utilities.clamp((this.n0 - 0.5f) / 0.5f, 1.0f, f16);
                float f2922 = (float) (((1.0f - r2) * 0.5f) + 0.5d);
                if (R2 <= i10) {
                }
                float f3022 = lerp + this.s0;
                if (this.A0) {
                }
                float a222 = w7.r.a((this.c0 - 0.2f) / 0.1f, f18, 1.0f);
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
            float lerp8 = AndroidUtilities.lerp(29, 74, es.g.getInterpolation(this.N));
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
        int i28 = (min == 0.0f || visibleItemsMeasuredWidthWithAlpha <= 0.0f) ? i11 : 1;
        if (i28 != 0) {
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
            org.telegram.ui.Components.s6 s6Var = this.T;
            s6Var.setPivotX(0.0f);
            s6Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, nVar.getTotalVisibility()));
            s6Var.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, nVar.getTotalVisibility()));
            s6Var.setTranslationY((((f10 + AndroidUtilities.dp(14.0f)) - ((s6Var.getMeasuredHeight() - s6Var.getTextHeight()) / f11)) + AndroidUtilities.dp(f7)) - (nVar.getTotalVisibility() * AndroidUtilities.dp(6.0f)));
            int dp5 = AndroidUtilities.dp(72.0f);
            float f32 = this.N;
            float lerp9 = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f), AndroidUtilities.dp(26.33f), f32) / f11;
            float c10 = t8.b.c(lerp9, f11, AndroidUtilities.lerp((dp5 / f11) - lerp9, 0.0f, f32), -dp5) + AndroidUtilities.dp(12.0f) + f12;
            s6Var.setTranslationX(c10);
            org.telegram.ui.Components.r6 drawable = s6Var.getDrawable();
            drawable.N = (this.q0.E.getVisibleItemsMeasuredWidthWithAlpha() * min) + (c10 - AndroidUtilities.dp(12.0f));
            drawable.invalidateSelf();
            float translationX = s6Var.getTranslationX() + AndroidUtilities.dp(1.0f);
            ImageView imageView = this.V;
            imageView.setTranslationX(translationX);
            imageView.setTranslationY(f10 + AndroidUtilities.dp(22.333f) + totalVisibility);
            float translationX2 = (s6Var.getTranslationX() - AndroidUtilities.dpf2(3.33f)) + imageView.getMeasuredWidth();
            ImageView imageView2 = this.W;
            imageView2.setTranslationX(translationX2);
            imageView2.setTranslationY(f10 + AndroidUtilities.dp(11.333f) + totalVisibility);
            nVar.setTranslationX(s6Var.getTranslationX());
            nVar.setTranslationY(f10 + AndroidUtilities.dp(31.333f));
        }
        super.dispatchDraw(canvas);
        int i29 = this.O;
        if (i29 >= 0 && i29 != 2) {
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
        if (i28 != 0) {
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

    public final u e(long j10) {
        m mVar = this.O == 2 ? this.r : this.h;
        for (int i10 = 0; i10 < mVar.getChildCount(); i10++) {
            View childAt = mVar.getChildAt(i10);
            if (childAt instanceof u) {
                u uVar = (u) childAt;
                if (uVar.E == j10) {
                    return uVar;
                }
            }
        }
        return null;
    }

    public final int f(int i10) {
        yy yyVar = this.e0;
        return (yyVar == null || yyVar.getResourceProvider() == null) ? org.telegram.ui.ActionBar.g6.x0(null, i10, false) : yyVar.getThemedColor(i10);
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

    public di.d4 getPremiumHint() {
        return this.J;
    }

    public final void h() {
        if (this.s.H()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(UserConfig.getInstance(this.f).clientUserId));
            this.e0.getOrCreateStoryViewer().G(getContext(), null, arrayList, 0, null, null, g9.a(this.r), false);
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
            x8 x8Var = this.s;
            if (!z11 || x8Var.H()) {
                if (x8Var.I(uVar.E) || x8Var.K(uVar.E)) {
                    TL_stories.PeerStories y3 = x8Var.y(uVar.E);
                    long j10 = uVar.E;
                    n9 n9Var = this.r0;
                    if (n9Var != null) {
                        n9Var.a();
                        this.r0 = null;
                    }
                    a3.i0 i0Var = new a3.i0(this, uVar, j10, 1);
                    if (z10) {
                        i0Var.run();
                        return;
                    }
                    n9 n10 = s9.n(y3, i0Var);
                    uVar.e = n10;
                    this.r0 = n10;
                    if (n10 != null) {
                        x8Var.e0(uVar.E, true);
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
        u uVar;
        q8 o10;
        yy yyVar = this.e0;
        int i10 = this.f;
        if (j10 == 0 && (o10 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o10.a(i10, 1)) {
            yyVar.showDialog(new sg.j0(o10.b(), this.f, getContext(), this.e0, null));
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
            if (j10 == 0) {
                if (uVar.F) {
                    break;
                } else {
                    i11++;
                }
            } else if (uVar.E == j10) {
                break;
            } else {
                i11++;
            }
        }
        if (uVar == null) {
            return;
        }
        if (j10 == 0) {
            kc.D(yyVar.getParentActivity(), i10).Q(fc.c(uVar));
            return;
        }
        org.telegram.ui.ActionBar.c6 resourceProvider = yyVar != null ? yyVar.getResourceProvider() : null;
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(getContext(), 3, resourceProvider);
        a2Var.q(500L);
        MessagesController.getInstance(i10).getStoriesController().k(j10, new i(this, a2Var, j10, uVar, 0), true, resourceProvider);
    }

    public final boolean k(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.x;
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            }
            if (((r) arrayList.get(i10)).c == j10) {
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
                AndroidUtilities.forEachViews((RecyclerView) this.h, (Utilities.Callback<View>) new f(i11));
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
            this.C0.setInterpolator(es.h);
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
            animatorSet2.addListener(new ah.p0(i11, this, z11));
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
        long j10 = UserConfig.getInstance(this.f).clientUserId;
        x8 x8Var = this.s;
        if (x8Var.J(j10)) {
            return true;
        }
        return x8Var.H() && x8Var.g.size() <= 3;
    }

    public final void n() {
        if (this.J == null) {
            di.d4 d4Var = new di.d4(getContext(), 1);
            d4Var.h(f(org.telegram.ui.ActionBar.g6.Fi));
            d4Var.p(true);
            d4Var.K = Layout.Alignment.ALIGN_CENTER;
            d4Var.l(0.0f, 29.0f);
            this.J = d4Var;
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.g6.Gi, 0, new e(this, 1));
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) replaceSingleTag.getSpans(0, replaceSingleTag.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
                replaceSingleTag.setSpan(new j61(AndroidUtilities.bold()), replaceSingleTag.getSpanStart(clickableSpanArr[0]), replaceSingleTag.getSpanEnd(clickableSpanArr[0]), 33);
            }
            di.d4 d4Var2 = this.J;
            d4Var2.h = di.d4.a(replaceSingleTag, d4Var2.getTextPaint());
            this.J.s(replaceSingleTag);
            this.J.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), 0);
            if (getParent() instanceof FrameLayout) {
                ((FrameLayout) getParent()).addView(this.J, w7.z5.e(-1, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 51));
            }
        }
        di.d4 d4Var3 = this.J;
        if (d4Var3 != null) {
            if (d4Var3.V) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
            this.J.u();
        }
    }

    public final void o() {
        b30 b30Var = s9.b;
        if (b30Var != null) {
            b30Var.d(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.lk, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.mk, false), 0, 0);
        }
        b30 b30Var2 = s9.c;
        if (b30Var2 != null) {
            b30Var2.d(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.nk, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.ok, false), 0, 0);
        }
        b30[] b30VarArr = s9.a;
        b30 b30Var3 = b30VarArr[0];
        if (b30Var3 != null) {
            b30Var3.d(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.jk, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.kk, false), 0, 0);
        }
        b30 b30Var4 = b30VarArr[1];
        if (b30Var4 != null) {
            b30Var4.d(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.hk, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.ik, false), 0, 0);
        }
        if (s9.d != null) {
            int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.xj, false);
            int x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q7, false);
            s9.d.d(i0.a.d(0.25f, x02, x03), x03, 0, 0);
        }
        int textColor = getTextColor();
        this.T.setTextColor(getTextLogoColor());
        n nVar = this.U;
        if (nVar != null) {
            nVar.b();
        }
        this.V.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        AndroidUtilities.forEachViews((RecyclerView) this.h, (Utilities.Callback<View>) new j(textColor, 0));
        AndroidUtilities.forEachViews((RecyclerView) this.r, (Utilities.Callback<View>) new f(2));
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
        n9 n9Var = this.r0;
        if (n9Var != null) {
            n9Var.a();
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
            hd hdVar = this.I;
            hdVar.getClass();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(x10, y3, x11, y10);
            hdVar.i = false;
            hdVar.c = 0;
            hdVar.a(rectF);
            if (hdVar.b(motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // ne.d
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 1) {
            d();
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
            arrayList3.add(new r(UserConfig.getInstance(i11).getClientUserId()));
        }
        x8 x8Var = this.s;
        ArrayList arrayList6 = i10 == 1 ? x8Var.h : x8Var.g;
        for (int i12 = 0; i12 < arrayList6.size(); i12++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList6.get(i12)).peer);
            if (peerDialogId != UserConfig.getInstance(i11).getClientUserId()) {
                arrayList3.add(new r(peerDialogId));
            }
        }
        int size = arrayList3.size();
        if (!x8Var.H()) {
            size--;
        }
        int max = Math.max(1, Math.max(x8Var.C(i10 == 1), size));
        this.f0 = null;
        boolean G = x8Var.G();
        org.telegram.ui.Components.s6 s6Var = this.T;
        if (G) {
            arrayList = arrayList3;
            if (x8Var.K(UserConfig.getInstance(i11).getClientUserId())) {
                String string = LocaleController.getString(R.string.UploadingStory);
                if (string.indexOf("…") > 0) {
                    if (this.i0 == null) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
                        yb ybVar = new yb();
                        valueOf.setSpan(ybVar, valueOf.length() - 1, valueOf.length(), 0);
                        ybVar.a = s6Var;
                        ybVar.n = true;
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
            s6Var.c(this.f0, z10 && !LocaleController.isRTL, true);
        }
        this.a.a((!TextUtils.isEmpty(this.f0) || this.g0) ? z12 : false, z10);
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
        di.d4 d4Var = this.J;
        if (d4Var != null) {
            d4Var.setTranslationY(f7);
        }
    }

    @Override // ne.d
    public final /* synthetic */ void A(float f7, int i10) {
    }
}
