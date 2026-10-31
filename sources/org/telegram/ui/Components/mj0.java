package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class mj0 extends FrameLayout implements org.telegram.messenger.us, org.telegram.ui.ActionBar.k6 {
    public static final org.telegram.ui.Cells.g1 l1 = new org.telegram.ui.Cells.g1(Float.class, "transitionProgress", 2);
    public boolean A0;
    public float B0;
    public final HashSet C0;
    public float D;
    public final HashSet D0;
    public final float E;
    public boolean E0;
    public final float F;
    public boolean F0;
    public int G;
    public boolean G0;
    public org.telegram.messenger.jj H;
    public final Paint H0;
    public boolean I;
    public final Paint I0;
    public int J;
    public ko J0;
    public long K;
    public boolean K0;
    public boolean L;
    public final e2.f L0;
    public boolean M;
    public final int M0;
    public boolean N;
    public boolean N0;
    public float O;
    public boolean O0;
    public long P;
    public Runnable P0;
    public ValueAnimator Q;
    public boolean Q0;
    public FrameLayout R;
    public p80 R0;
    public fg.i S;
    public int S0;
    public final ArrayList T;
    public int T0;
    public final ArrayList U;
    public float U0;
    public final ArrayList V;
    public float V0;
    public final org.telegram.ui.br W;
    public vg.f W0;
    public vg.f X0;
    public vg.f Y0;
    public tg.b Z0;
    public boolean a;
    public final cj0 a0;
    public wg.d a1;
    public final ag.b1 b;
    public final RectF b0;
    public int b1;
    public final float c;
    public boolean c0;
    public boolean c1;
    public final ArrayList d;
    public final HashSet d0;
    public boolean d1;
    public final ArrayList e;
    public final HashSet e0;
    public ko e1;
    public final Paint f;
    public final int[] f0;
    public boolean f1;
    public lj0 g0;
    public boolean g1;
    public final Paint h;
    public final Rect h0;
    public boolean h1;
    public final Drawable i0;
    public Paint i1;
    public final boolean j0;
    public Matrix j1;
    public final org.telegram.ui.ActionBar.p6 k0;
    public LinearGradient k1;
    public sg.o0 l0;
    public int m0;
    public final Paint n;
    public float n0;
    public float o0;
    public float p0;
    public float q0;
    public float r;
    public boolean r0;
    public float s;
    public long s0;
    public org.telegram.ui.ActionBar.k2 t0;
    public kg.l1 u0;
    public ir v0;
    public float w;
    public float w0;
    public final RectF x;
    public sg.b0 x0;
    public final Path y;
    public ValueAnimator y0;
    public final kj0 z0;

    public mj0(int i10, int i11, Context context, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i12 = 0;
        this.a = false;
        this.d = new ArrayList();
        this.e = new ArrayList();
        int i13 = 1;
        Paint paint = new Paint(1);
        this.f = paint;
        this.h = new Paint(1);
        this.n = new Paint(1);
        this.w = 1.0f;
        this.x = new RectF();
        this.y = new Path();
        this.D = org.telegram.messenger.i0.L(72.0f);
        float L = org.telegram.messenger.i0.L(8.0f);
        this.E = L;
        this.F = L / 2.0f;
        this.G = org.telegram.messenger.i0.L(36.0f);
        this.T = new ArrayList(20);
        int i14 = 10;
        this.U = new ArrayList(10);
        this.V = new ArrayList(20);
        this.b0 = new RectF();
        this.c0 = false;
        this.d0 = new HashSet();
        this.e0 = new HashSet();
        this.f0 = new int[2];
        Rect rect = new Rect();
        this.h0 = rect;
        new ArrayList();
        this.C0 = new HashSet();
        this.D0 = new HashSet();
        Paint paint2 = new Paint(1);
        this.H0 = paint2;
        Paint paint3 = new Paint(1);
        this.I0 = paint3;
        this.L0 = new e2.f(null);
        this.O0 = true;
        this.g1 = false;
        this.M0 = i10;
        this.c = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        paint2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i6, p6Var));
        paint3.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.xk, p6Var));
        this.k0 = p6Var;
        this.J = i11;
        this.t0 = k2Var;
        kj0 kj0Var = new kj0(this, context);
        this.z0 = kj0Var;
        kj0Var.setVisibility(8);
        kj0Var.O = false;
        kj0Var.c.setVisibility(8);
        addView(kj0Var);
        this.j0 = org.telegram.messenger.tz.c() && org.telegram.messenger.tz.o() != 0;
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.i0 = mutate;
        int L2 = org.telegram.messenger.i0.L(7.0f);
        rect.bottom = L2;
        rect.right = L2;
        rect.top = L2;
        rect.left = L2;
        org.telegram.ui.ActionBar.a7.y(this, mutate, org.telegram.ui.ActionBar.t6.He, null, PorterDuff.Mode.MULTIPLY);
        ag.b1 b1Var = new ag.b1(this, context, 17);
        this.b = b1Var;
        b1Var.setClipChildren(false);
        b1Var.setClipToPadding(false);
        org.telegram.ui.br brVar = new org.telegram.ui.br((ViewGroup) this, 3);
        this.W = brVar;
        b1Var.i(new yi0(this, i12));
        b1Var.setLayoutManager(brVar);
        b1Var.setOverScrollMode(2);
        cj0 cj0Var = new cj0(this, i12);
        this.a0 = cj0Var;
        b1Var.setAdapter(cj0Var);
        b1Var.j(new gj0(this));
        b1Var.j(new ag.u(this, 27));
        b1Var.i(new yi0(this, i13));
        b1Var.setOnItemClickListener(new k(this, 11));
        b1Var.setOnItemLongClickListener((ik0) new i2.q(this, i10, i14));
        addView(b1Var, w7.b6.c(-1.0f, -1));
        setClipChildren(false);
        setClipToPadding(false);
        k();
        int paddingTop = (b1Var.getLayoutParams().height - b1Var.getPaddingTop()) - b1Var.getPaddingBottom();
        kj0Var.getLayoutParams().width = paddingTop - org.telegram.messenger.i0.L(12.0f);
        kj0Var.getLayoutParams().height = paddingTop;
        if (i10 == 2 || i10 == 4) {
            paint.setColor(i0.b.f(0.13f, -16777216, -1));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G8, p6Var));
        }
        org.telegram.messenger.ui.b0(i11).k1();
    }

    public static void a(mj0 mj0Var) {
        if (mj0Var.x0 != null) {
            return;
        }
        sg.b0 b0Var = new sg.b0(mj0Var.M0, mj0Var.t0, mj0Var.V, mj0Var.d0, mj0Var, mj0Var.k0, mj0Var.a);
        mj0Var.x0 = b0Var;
        tg.b bVar = mj0Var.Z0;
        boolean z10 = true;
        if (bVar != null) {
            wg.d dVar = mj0Var.a1;
            org.telegram.ui.a21 a21Var = b0Var.m.f0;
            a21Var.y = true;
            a21Var.setBackground(null);
            a21Var.updateColors();
            a21Var.invalidate();
            vg.f c10 = bVar.c(b0Var.a, null, true);
            c10.o(dVar);
            org.telegram.messenger.z20.u(c10, org.telegram.messenger.i0.L(12.0f), 8.0f);
            b0Var.z = c10;
        }
        sg.b0 b0Var2 = mj0Var.x0;
        lj0 lj0Var = mj0Var.g0;
        if (lj0Var != null && !lj0Var.f()) {
            z10 = false;
        }
        b0Var2.m.setLongPressEnabled(z10);
        mj0Var.j();
        mj0Var.x0.p = new eb0(mj0Var, 16);
        mj0Var.m();
    }

    public static void b(mj0 mj0Var, View view, float f7) {
        if (view instanceof kj0) {
            ((kj0) view).h = f7;
        } else {
            view.setScaleX(f7);
            view.setScaleY(f7);
        }
    }

    public static boolean c() {
        return org.telegram.messenger.tz.j();
    }

    public static HashSet i(ArrayList arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        LongSparseArray longSparseArray = new LongSparseArray();
        HashSet hashSet = new HashSet();
        boolean z10 = true;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get(i10);
            hashSet.clear();
            if (jjVar != null && (tL_messageReactions = jjVar.k.reactions) != null && tL_messageReactions.results != null) {
                for (int i11 = 0; i11 < jjVar.k.reactions.results.size(); i11++) {
                    if (jjVar.k.reactions.results.get(i11).chosen) {
                        sg.o0 d = sg.o0.d(jjVar.k.reactions.results.get(i11).reaction);
                        if (z10 || longSparseArray.indexOfKey(d.h) >= 0) {
                            hashSet.add(Long.valueOf(d.h));
                            longSparseArray.put(d.h, d);
                        }
                    }
                }
            }
            int i12 = 0;
            while (i12 < longSparseArray.size()) {
                if (!hashSet.contains(Long.valueOf(longSparseArray.keyAt(i12)))) {
                    longSparseArray.removeAt(i12);
                    i12--;
                }
                i12++;
            }
            i10++;
            z10 = false;
        }
        HashSet hashSet2 = new HashSet();
        for (int i13 = 0; i13 < longSparseArray.size(); i13++) {
            if (longSparseArray.valueAt(i13) != null) {
                hashSet2.add((sg.o0) longSparseArray.valueAt(i13));
            }
        }
        return hashSet2;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.F8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.h5));
    }

    public final void d(boolean z10) {
        sg.b0 b0Var = this.x0;
        if (b0Var != null) {
            if (!b0Var.q || !z10) {
                b0Var.q = true;
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new sg.u(b0Var, 0));
                    ofFloat.addListener(new sg.z(b0Var, 0));
                    ofFloat.setDuration(150L);
                    ofFloat.start();
                } else {
                    b0Var.f();
                }
            }
            this.x0 = null;
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id != this.K || getVisibility() == 0 || (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) {
                return;
            }
            p(this.H, null, true);
            setVisibility(0);
            r(false);
            return;
        }
        if (i10 != org.telegram.messenger.zs.i4) {
            if (i10 == org.telegram.messenger.zs.u3) {
                p(this.H, null, true);
            }
        } else {
            if (this.M0 != 4) {
                return;
            }
            invalidate();
            ag.b1 b1Var = this.b;
            b1Var.invalidate();
            b1Var.g1();
            for (int i12 = 0; i12 < b1Var.getChildCount(); i12++) {
                View childAt = b1Var.getChildAt(i12);
                if (childAt instanceof kj0) {
                    kj0 kj0Var = (kj0) childAt;
                    kj0Var.a.invalidate();
                    kj0Var.b.invalidate();
                } else {
                    childAt.invalidate();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x08d6  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x08f7  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x036e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        p80 p80Var;
        sg.o0 o0Var;
        int i10;
        sg.o0 o0Var2;
        float width;
        float f7;
        float f10;
        float max;
        float f11;
        ko koVar;
        float f12;
        int i11;
        float f13;
        RectF rectF;
        int i12;
        float f14;
        float f15;
        int i13;
        RectF rectF2;
        ag.b1 b1Var;
        int i14;
        float f16;
        boolean q6;
        RectF rectF3;
        int i15;
        RectF rectF4;
        int i16;
        ag.b1 b1Var2;
        float f17;
        int R;
        float f18;
        float f19;
        float x10;
        float scaleX;
        float f20;
        float f21;
        f5 f5Var;
        ag.c2 c2Var;
        int i17;
        lj0 lj0Var;
        float f22;
        Canvas canvas2 = canvas;
        long min = Math.min(16L, System.currentTimeMillis() - this.P);
        this.P = System.currentTimeMillis();
        boolean z10 = this.N;
        if (z10) {
            float f23 = this.O;
            if (f23 != 1.0f) {
                this.O = org.telegram.ui.Cells.f1.e(min, 220.0f, f23, 1.0f);
                invalidate();
                p80Var = this.R0;
                if (p80Var != null) {
                    p80Var.setTranslationY(-g());
                }
                float max2 = (Math.max(0.25f, Math.min(this.w, 1.0f)) - 0.25f) / 0.75f;
                float f24 = this.E * max2;
                float f25 = this.F * max2;
                HashSet hashSet = this.D0;
                hashSet.clear();
                HashSet hashSet2 = this.C0;
                hashSet.addAll(hashSet2);
                hashSet2.clear();
                if (this.c1) {
                    invalidate();
                }
                o0Var = this.l0;
                i10 = this.M0;
                if (o0Var != null && i10 != 5 && ((lj0Var = this.g0) == null || lj0Var.f())) {
                    f22 = this.n0;
                    if (f22 != 1.0f) {
                        float longPressTimeout = (16.0f / (this.l0.a ? ViewConfiguration.getLongPressTimeout() : 1500.0f)) + f22;
                        this.n0 = longPressTimeout;
                        if (longPressTimeout >= 1.0f) {
                            this.n0 = 1.0f;
                        }
                        invalidate();
                    }
                }
                o0Var2 = this.l0;
                if (o0Var2 == null && o0Var2.a) {
                    this.p0 = 1.0f;
                    this.q0 = 1.0f;
                } else {
                    float f26 = this.n0;
                    this.p0 = (f26 * 2.0f) + 1.0f;
                    this.q0 = 1.0f - (f26 * 0.15f);
                }
                int save = canvas2.save();
                if (!org.telegram.messenger.cd.X || this.M) {
                    width = getWidth();
                    f7 = 0.125f;
                } else {
                    width = getWidth();
                    f7 = 0.875f;
                }
                float f27 = width * f7;
                f10 = this.w;
                if (f10 != 1.0f) {
                    canvas2.scale(f10, f10, f27, getHeight() / 2.0f);
                }
                if (!org.telegram.messenger.cd.X || this.M) {
                    max = Math.max(0.25f, this.w);
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f - Math.max(0.25f, this.w);
                    max = 1.0f;
                }
                float pullingLeftProgress = getPullingLeftProgress();
                float g10 = g();
                koVar = this.e1;
                if (koVar != null) {
                    koVar.setExpandSize(g10);
                }
                float width2 = (getWidth() - getPaddingRight()) * Math.min(1.0f, f11);
                float topOffset = getTopOffset();
                float paddingTop = getPaddingTop();
                ag.b1 b1Var3 = this.b;
                float f28 = f11;
                float f29 = max;
                RectF rectF5 = this.x;
                rectF5.set(getPaddingLeft() + width2, (((1.0f - this.q0) * b1Var3.getMeasuredHeight()) + paddingTop) - g10, (getWidth() - getPaddingRight()) * max, (getHeight() - getPaddingBottom()) + g10);
                this.D = c3.i0.g(g10, 2.0f, rectF5.height() - topOffset, 2.0f);
                if (i10 == 1) {
                    f12 = 255.0f;
                    int i18 = (int) (Utilities.i(1.0f - (this.w0 / 0.05f), 1.0f, 0.0f) * 255.0f);
                    Drawable drawable = this.i0;
                    drawable.setAlpha(i18);
                    float paddingLeft = getPaddingLeft();
                    int width3 = getWidth() - getPaddingRight();
                    Rect rect = this.h0;
                    int i19 = (int) g10;
                    drawable.setBounds((int) ((((width3 + rect.right) * f28) + paddingLeft) - rect.left), (getPaddingTop() - rect.top) - i19, (int) (((getWidth() - getPaddingRight()) + rect.right) * f29), (getHeight() - getPaddingBottom()) + rect.bottom + i19);
                    if (this.W0 == null) {
                        drawable.draw(canvas2);
                    }
                } else {
                    f12 = 255.0f;
                }
                canvas2.restoreToCount(save);
                if (this.d1) {
                    int save2 = canvas2.save();
                    float f30 = this.w;
                    if (f30 != 1.0f) {
                        f14 = 2.0f;
                        canvas2.scale(f30, f30, f27, getHeight() / 2.0f);
                    } else {
                        f14 = 2.0f;
                    }
                    if (i10 == 1 || this.g0.A()) {
                        i17 = save2;
                        i11 = i10;
                        rectF = rectF5;
                        f13 = f27;
                        i12 = 1;
                        this.g0.r(canvas, rectF, this.D, getX(), getY(), org.telegram.messenger.zs.e4, false);
                        canvas2 = canvas;
                    } else {
                        vg.f fVar = this.W0;
                        Paint paint = this.f;
                        if (fVar != null) {
                            Rect rect2 = org.telegram.messenger.i0.Q;
                            rectF5.round(rect2);
                            rect2.inset(-org.telegram.messenger.i0.L(8.0f), -org.telegram.messenger.i0.L(8.0f));
                            this.W0.setBounds(rect2);
                            this.W0.setAlpha(paint.getAlpha());
                            this.W0.draw(canvas2);
                        } else {
                            float f31 = this.D;
                            canvas2.drawRoundRect(rectF5, f31, f31, paint);
                        }
                        i17 = save2;
                        i11 = i10;
                        f13 = f27;
                        rectF = rectF5;
                        i12 = 1;
                    }
                    if (this.c0) {
                        Iterator it = this.d0.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                float f32 = this.D;
                                float l4 = Utilities.l(1.0f - getPullingLeftProgress());
                                if (this.i1 == null) {
                                    this.i1 = new Paint(i12);
                                }
                                if (this.j1 == null) {
                                    this.j1 = new Matrix();
                                }
                                if (this.k1 == null) {
                                    int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.xk, this.k0);
                                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(64.0f), 0.0f, new int[]{w02, org.telegram.ui.ActionBar.t6.r1(0.0f, w02)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                                    this.k1 = linearGradient;
                                    this.i1.setShader(linearGradient);
                                }
                                this.j1.reset();
                                this.j1.postTranslate(rectF.left, rectF.top);
                                this.k1.setLocalMatrix(this.j1);
                                this.i1.setAlpha((int) (l4 * f12));
                                canvas2.drawRoundRect(rectF, f32, f32, this.i1);
                            } else if (((sg.o0) it.next()).a) {
                                break;
                            }
                        }
                    }
                    canvas2.restoreToCount(i17);
                } else {
                    i11 = i10;
                    f13 = f27;
                    rectF = rectF5;
                    i12 = 1;
                    f14 = 2.0f;
                }
                Path path = this.y;
                path.rewind();
                float f33 = this.D;
                path.addRoundRect(rectF, f33, f33, Path.Direction.CW);
                int save3 = canvas2.save();
                f15 = this.w;
                if (f15 != 1.0f) {
                    canvas2.scale(f15, f15, f13, getHeight() / f14);
                }
                if (this.w != 0.0f) {
                    int i20 = i11;
                    if (getAlpha() == 1.0f || i20 == 5) {
                        int i21 = 0;
                        int i22 = 0;
                        int i23 = 0;
                        while (i21 < b1Var3.getChildCount()) {
                            View childAt = b1Var3.getChildAt(i21);
                            boolean z11 = i12;
                            int abs = (this.w == 1.0f || !org.telegram.messenger.tz.j()) ? i23 : (int) (Math.abs((((childAt.getMeasuredWidth() / f14) + childAt.getLeft()) / b1Var3.getMeasuredWidth()) - 0.8f) * 200.0f);
                            float f34 = f25;
                            if (childAt instanceof kj0) {
                                kj0 kj0Var = (kj0) b1Var3.getChildAt(i21);
                                i16 = i21;
                                if (this.B0 != 0.0f) {
                                    i15 = save3;
                                    f19 = org.telegram.messenger.i0.L(46.0f) * Utilities.i(kj0Var.getLeft() / (getMeasuredWidth() - org.telegram.messenger.i0.L(34.0f)), 1.0f, 0.0f) * getPullingLeftProgress();
                                } else {
                                    i15 = save3;
                                    f19 = 0.0f;
                                }
                                sg.o0 o0Var3 = kj0Var.e;
                                jj0 jj0Var = kj0Var.a;
                                float f35 = f19;
                                jj0 jj0Var2 = kj0Var.b;
                                jj0 jj0Var3 = kj0Var.c;
                                rectF4 = rectF;
                                if (o0Var3.equals(this.l0)) {
                                    jj0 jj0Var4 = jj0Var2.getVisibility() == 0 ? jj0Var2 : jj0Var;
                                    kj0Var.setPivotX(kj0Var.getMeasuredWidth() >> 1);
                                    kj0Var.setPivotY(jj0Var4.getY() + jj0Var4.getMeasuredHeight());
                                    kj0Var.setScaleX(this.p0);
                                    kj0Var.setScaleY(this.p0);
                                    if (!this.r0) {
                                        if (this.Q == null) {
                                            jj0Var3.setVisibility(0);
                                            jj0Var3.setAlpha(1.0f);
                                            if (jj0Var3.getImageReceiver().I() || ((f5Var = jj0Var3.e) != null && (c2Var = f5Var.k) != null && c2Var.I())) {
                                                jj0Var4.setAlpha(0.0f);
                                            }
                                            f21 = 1.0f;
                                        } else {
                                            f21 = 1.0f;
                                            jj0Var3.setAlpha(1.0f - this.o0);
                                            jj0Var4.setAlpha(this.o0);
                                        }
                                        if (this.n0 == f21) {
                                            this.r0 = z11;
                                            if (System.currentTimeMillis() - this.s0 > 300) {
                                                this.s0 = System.currentTimeMillis();
                                                b1Var2 = b1Var3;
                                                this.g0.x(kj0Var, kj0Var.e, true, false);
                                                canvas2.save();
                                                x10 = kj0Var.getX() + b1Var2.getX();
                                                scaleX = ((kj0Var.getScaleX() * kj0Var.getMeasuredWidth()) - kj0Var.getMeasuredWidth()) / f14;
                                                f20 = x10 - scaleX;
                                                if (f20 >= 0.0f && kj0Var.getTranslationX() >= 0.0f) {
                                                    kj0Var.setTranslationX((-f20) - f35);
                                                } else if (kj0Var.getMeasuredWidth() + x10 + scaleX > getMeasuredWidth() || kj0Var.getTranslationX() > 0.0f) {
                                                    kj0Var.setTranslationX(0.0f - f35);
                                                } else {
                                                    kj0Var.setTranslationX((((getMeasuredWidth() - x10) - kj0Var.getMeasuredWidth()) - scaleX) - f35);
                                                }
                                                canvas2.translate(kj0Var.getX() + b1Var2.getX(), kj0Var.getY() + b1Var2.getY());
                                                canvas2.scale(kj0Var.getScaleX(), kj0Var.getScaleY(), kj0Var.getPivotX(), kj0Var.getPivotY());
                                                kj0Var.draw(canvas2);
                                                canvas2.restore();
                                            }
                                        }
                                    }
                                    b1Var2 = b1Var3;
                                    canvas2.save();
                                    x10 = kj0Var.getX() + b1Var2.getX();
                                    scaleX = ((kj0Var.getScaleX() * kj0Var.getMeasuredWidth()) - kj0Var.getMeasuredWidth()) / f14;
                                    f20 = x10 - scaleX;
                                    if (f20 >= 0.0f) {
                                    }
                                    if (kj0Var.getMeasuredWidth() + x10 + scaleX > getMeasuredWidth()) {
                                    }
                                    kj0Var.setTranslationX(0.0f - f35);
                                    canvas2.translate(kj0Var.getX() + b1Var2.getX(), kj0Var.getY() + b1Var2.getY());
                                    canvas2.scale(kj0Var.getScaleX(), kj0Var.getScaleY(), kj0Var.getPivotX(), kj0Var.getPivotY());
                                    kj0Var.draw(canvas2);
                                    canvas2.restore();
                                } else {
                                    b1Var2 = b1Var3;
                                    int R2 = RecyclerView.R(kj0Var);
                                    float measuredWidth = (((this.p0 - 1.0f) * kj0Var.getMeasuredWidth()) / 3.0f) - (((1.0f - this.q0) * kj0Var.getMeasuredWidth()) * (Math.abs(this.m0 - R2) - 1));
                                    if (R2 < this.m0) {
                                        kj0Var.setPivotX(0.0f);
                                        kj0Var.setTranslationX(-measuredWidth);
                                    } else {
                                        kj0Var.setPivotX(kj0Var.getMeasuredWidth() - f35);
                                        kj0Var.setTranslationX(measuredWidth - f35);
                                    }
                                    kj0Var.setPivotY(jj0Var.getY() + jj0Var.getMeasuredHeight());
                                    kj0Var.setScaleX(this.q0);
                                    kj0Var.setScaleY(this.q0);
                                    jj0Var3.setVisibility(4);
                                    jj0Var.setAlpha(1.0f);
                                }
                                if (childAt.getLeft() > i22) {
                                    i22 = childAt.getLeft();
                                }
                                if (!this.N0 && (!kj0Var.r || jj0Var.getImageReceiver().B() != null)) {
                                    if ((kj0Var.getMeasuredWidth() / f14) + kj0Var.getX() > 0.0f && (kj0Var.getMeasuredWidth() / f14) + kj0Var.getX() < b1Var2.getWidth()) {
                                        if (!hashSet.contains(kj0Var)) {
                                            kj0Var.c(abs);
                                            abs += 30;
                                        }
                                        hashSet2.add(kj0Var);
                                    } else if (!kj0Var.n) {
                                        kj0Var.d();
                                    }
                                }
                            } else {
                                i15 = save3;
                                rectF4 = rectF;
                                i16 = i21;
                                b1Var2 = b1Var3;
                                if (childAt == this.R) {
                                    if ((childAt.getMeasuredWidth() / f14) + childAt.getX() <= 0.0f || (childAt.getMeasuredWidth() / f14) + childAt.getX() >= b1Var2.getWidth()) {
                                        kg.l1 l1Var = this.u0;
                                        f17 = 0.0f;
                                        l1Var.setScaleX(0.0f);
                                        l1Var.setScaleY(0.0f);
                                        if (childAt == this.S) {
                                            if ((childAt.getMeasuredWidth() / f14) + childAt.getX() <= f17 || (childAt.getMeasuredWidth() / f14) + childAt.getX() >= b1Var2.getWidth()) {
                                                ir irVar = this.v0;
                                                irVar.setScaleX(0.0f);
                                                irVar.setScaleY(0.0f);
                                                ((mj0) irVar.c).S.invalidate();
                                                ValueAnimator valueAnimator = (ValueAnimator) irVar.b;
                                                if (valueAnimator != null) {
                                                    valueAnimator.cancel();
                                                }
                                            } else {
                                                if (!hashSet.contains(childAt)) {
                                                    if (this.w != 1.0f) {
                                                        ir irVar2 = this.v0;
                                                        irVar2.setScaleX(0.0f);
                                                        irVar2.setScaleY(0.0f);
                                                        ((mj0) irVar2.c).S.invalidate();
                                                        ValueAnimator valueAnimator2 = (ValueAnimator) irVar2.b;
                                                        if (valueAnimator2 != null) {
                                                            valueAnimator2.cancel();
                                                        }
                                                    }
                                                    ir irVar3 = this.v0;
                                                    boolean z12 = org.telegram.messenger.sc.e(8200) || org.telegram.messenger.tz.o() >= 1;
                                                    irVar3.invalidate();
                                                    ValueAnimator valueAnimator3 = (ValueAnimator) irVar3.b;
                                                    if (valueAnimator3 != null) {
                                                        valueAnimator3.removeAllListeners();
                                                        ((ValueAnimator) irVar3.b).cancel();
                                                    }
                                                    if (z12) {
                                                        ValueAnimator ofFloat = ValueAnimator.ofFloat(irVar3.getScaleX(), 1.0f);
                                                        irVar3.b = ofFloat;
                                                        ofFloat.setInterpolator(org.telegram.messenger.i0.H);
                                                        ((ValueAnimator) irVar3.b).addUpdateListener(new r60(irVar3, 7));
                                                        ((ValueAnimator) irVar3.b).setStartDelay((long) (abs * ((mj0) irVar3.c).c));
                                                        ((ValueAnimator) irVar3.b).setDuration(300L);
                                                        ((ValueAnimator) irVar3.b).start();
                                                    } else {
                                                        irVar3.setScaleX(1.0f);
                                                        irVar3.setScaleY(1.0f);
                                                    }
                                                    abs += 30;
                                                }
                                                hashSet2.add(childAt);
                                            }
                                        }
                                        R = RecyclerView.R(childAt);
                                        float measuredWidth2 = (((this.p0 - 1.0f) * childAt.getMeasuredWidth()) / 3.0f) - (((1.0f - this.q0) * childAt.getMeasuredWidth()) * (Math.abs(this.m0 - R) - 1));
                                        if (R >= this.m0) {
                                            childAt.setPivotX(0.0f);
                                            childAt.setTranslationX(-measuredWidth2);
                                        } else {
                                            childAt.setPivotX(childAt.getMeasuredWidth());
                                            childAt.setTranslationX(measuredWidth2);
                                        }
                                        childAt.setScaleX(this.q0);
                                        childAt.setScaleY(this.q0);
                                    } else {
                                        if (!hashSet.contains(childAt)) {
                                            if (this.w != 1.0f) {
                                                kg.l1 l1Var2 = this.u0;
                                                f18 = 0.0f;
                                                l1Var2.setScaleX(0.0f);
                                                l1Var2.setScaleY(0.0f);
                                            } else {
                                                f18 = 0.0f;
                                            }
                                            kg.l1 l1Var3 = this.u0;
                                            org.telegram.ui.Components.voip.g gVar = l1Var3.J;
                                            if (gVar != null) {
                                                gVar.g = f18;
                                                gVar.j = false;
                                            }
                                            l1Var3.invalidate();
                                            l1Var3.animate().scaleX(1.1f).scaleY(1.1f).setStartDelay(abs).setInterpolator(org.telegram.messenger.i0.H).setDuration(300L);
                                            abs += 30;
                                        }
                                        hashSet2.add(childAt);
                                    }
                                }
                                f17 = 0.0f;
                                if (childAt == this.S) {
                                }
                                R = RecyclerView.R(childAt);
                                float measuredWidth22 = (((this.p0 - 1.0f) * childAt.getMeasuredWidth()) / 3.0f) - (((1.0f - this.q0) * childAt.getMeasuredWidth()) * (Math.abs(this.m0 - R) - 1));
                                if (R >= this.m0) {
                                }
                                childAt.setScaleX(this.q0);
                                childAt.setScaleY(this.q0);
                            }
                            i23 = abs;
                            i21 = i16 + 1;
                            canvas2 = canvas;
                            f25 = f34;
                            save3 = i15;
                            b1Var3 = b1Var2;
                            rectF = rectF4;
                            i12 = 1;
                        }
                        i13 = save3;
                        rectF2 = rectF;
                        b1Var = b1Var3;
                        f16 = f25;
                        kj0 kj0Var2 = this.z0;
                        if (pullingLeftProgress > 0.0f) {
                            float pullingLeftProgress2 = getPullingLeftProgress();
                            int measuredWidth3 = kj0Var2.getMeasuredWidth() - org.telegram.messenger.i0.L(f14);
                            float f36 = i22 + measuredWidth3;
                            float i24 = Utilities.i(f36 / (getMeasuredWidth() - kj0Var2.getMeasuredWidth()), 1.0f, 0.0f) * pullingLeftProgress2 * measuredWidth3;
                            if (kj0Var2.getTag() == null) {
                                kj0Var2.setTag(Float.valueOf(1.0f));
                                kj0Var2.d();
                                kj0Var2.c(0);
                            }
                            float i25 = Utilities.i(pullingLeftProgress2, 1.0f, 0.0f);
                            kj0Var2.setScaleX(i25);
                            kj0Var2.setScaleY(i25);
                            i14 = 1;
                            kj0Var2.setTranslationX(((b1Var.getX() + f36) - i24) + (-((i20 == 1 || i20 == 2) ? org.telegram.messenger.i0.L(8.0f) : org.telegram.messenger.i0.L(20.0f))));
                            if (kj0Var2.getVisibility() != 0) {
                                kj0Var2.setVisibility(0);
                            }
                        } else {
                            i14 = 1;
                            if (kj0Var2.getVisibility() != 8 && this.O0) {
                                kj0Var2.setVisibility(8);
                            }
                            if (kj0Var2.getTag() != null) {
                                kj0Var2.setTag(null);
                            }
                        }
                        if (!this.d1 && this.x0 != null) {
                            int A = (int) org.telegram.messenger.m5.A(1.0f, this.w0, Utilities.i(1.0f - (this.w0 / 0.2f), 1.0f, 0.0f), f12);
                            canvas.save();
                            f(f24, max2, f16, A, canvas);
                            canvas.restore();
                            return;
                        }
                        float f37 = f16;
                        q6 = q();
                        if (!q6) {
                            canvas.clipPath(path);
                        }
                        if (!org.telegram.messenger.cd.X || this.M) {
                            i14 = -1;
                        }
                        canvas.translate((1.0f - this.w) * getWidth() * i14, 0.0f);
                        b1Var.setTranslationX(-width2);
                        super.dispatchDraw(canvas);
                        if (!q6) {
                            Paint paint2 = this.h;
                            if (paint2 != null) {
                                paint2.setAlpha((int) (Utilities.i(this.r * this.w, 1.0f, 0.0f) * 255.0f));
                                rectF3 = rectF2;
                                canvas.drawRect(rectF3, paint2);
                            } else {
                                rectF3 = rectF2;
                            }
                            Paint paint3 = this.n;
                            if (paint3 != null) {
                                paint3.setAlpha((int) (Utilities.i(this.s * this.w, 1.0f, 0.0f) * 255.0f));
                                canvas.drawRect(rectF3, paint3);
                            }
                        }
                        canvas.restoreToCount(i13);
                        f(f24, max2, f37, org.telegram.messenger.zs.e4, canvas);
                        invalidate();
                    }
                }
                i13 = save3;
                rectF2 = rectF;
                b1Var = b1Var3;
                i14 = i12;
                f16 = f25;
                if (!this.d1) {
                }
                float f372 = f16;
                q6 = q();
                if (!q6) {
                }
                if (!org.telegram.messenger.cd.X) {
                }
                i14 = -1;
                canvas.translate((1.0f - this.w) * getWidth() * i14, 0.0f);
                b1Var.setTranslationX(-width2);
                super.dispatchDraw(canvas);
                if (!q6) {
                }
                canvas.restoreToCount(i13);
                f(f24, max2, f372, org.telegram.messenger.zs.e4, canvas);
                invalidate();
            }
        }
        if (!z10) {
            float f38 = this.O;
            if (f38 != 0.0f) {
                this.O = org.telegram.ui.Cells.f1.v(min, 220.0f, f38, 0.0f);
                invalidate();
            }
        }
        p80Var = this.R0;
        if (p80Var != null) {
        }
        float max22 = (Math.max(0.25f, Math.min(this.w, 1.0f)) - 0.25f) / 0.75f;
        float f242 = this.E * max22;
        float f252 = this.F * max22;
        HashSet hashSet3 = this.D0;
        hashSet3.clear();
        HashSet hashSet22 = this.C0;
        hashSet3.addAll(hashSet22);
        hashSet22.clear();
        if (this.c1) {
        }
        o0Var = this.l0;
        i10 = this.M0;
        if (o0Var != null) {
            f22 = this.n0;
            if (f22 != 1.0f) {
            }
        }
        o0Var2 = this.l0;
        if (o0Var2 == null) {
        }
        float f262 = this.n0;
        this.p0 = (f262 * 2.0f) + 1.0f;
        this.q0 = 1.0f - (f262 * 0.15f);
        int save4 = canvas2.save();
        if (org.telegram.messenger.cd.X) {
        }
        width = getWidth();
        f7 = 0.125f;
        float f272 = width * f7;
        f10 = this.w;
        if (f10 != 1.0f) {
        }
        if (org.telegram.messenger.cd.X) {
        }
        max = Math.max(0.25f, this.w);
        f11 = 0.0f;
        float pullingLeftProgress3 = getPullingLeftProgress();
        float g102 = g();
        koVar = this.e1;
        if (koVar != null) {
        }
        float width22 = (getWidth() - getPaddingRight()) * Math.min(1.0f, f11);
        float topOffset2 = getTopOffset();
        float paddingTop2 = getPaddingTop();
        ag.b1 b1Var32 = this.b;
        float f282 = f11;
        float f292 = max;
        RectF rectF52 = this.x;
        rectF52.set(getPaddingLeft() + width22, (((1.0f - this.q0) * b1Var32.getMeasuredHeight()) + paddingTop2) - g102, (getWidth() - getPaddingRight()) * max, (getHeight() - getPaddingBottom()) + g102);
        this.D = c3.i0.g(g102, 2.0f, rectF52.height() - topOffset2, 2.0f);
        if (i10 == 1) {
        }
        canvas2.restoreToCount(save4);
        if (this.d1) {
        }
        Path path2 = this.y;
        path2.rewind();
        float f332 = this.D;
        path2.addRoundRect(rectF, f332, f332, Path.Direction.CW);
        int save32 = canvas2.save();
        f15 = this.w;
        if (f15 != 1.0f) {
        }
        if (this.w != 0.0f) {
        }
        i13 = save32;
        rectF2 = rectF;
        b1Var = b1Var32;
        i14 = i12;
        f16 = f252;
        if (!this.d1) {
        }
        float f3722 = f16;
        q6 = q();
        if (!q6) {
        }
        if (!org.telegram.messenger.cd.X) {
        }
        i14 = -1;
        canvas.translate((1.0f - this.w) * getWidth() * i14, 0.0f);
        b1Var.setTranslationX(-width22);
        super.dispatchDraw(canvas);
        if (!q6) {
        }
        canvas.restoreToCount(i13);
        f(f242, max22, f3722, org.telegram.messenger.zs.e4, canvas);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        sg.b0 b0Var = this.x0;
        if (b0Var != null) {
            b0Var.d();
        }
    }

    public final void f(float f7, float f10, float f11, int i10, Canvas canvas) {
        float f12;
        if (this.M0 == 1) {
            return;
        }
        canvas.save();
        boolean z10 = this.L;
        RectF rectF = this.x;
        if (z10) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), (org.telegram.messenger.i0.T1(rectF.top, getMeasuredHeight(), gr.f.getInterpolation(this.O)) - ((int) Math.ceil((1.0f - this.w) * (rectF.height() / 2.0f)))) + 1.0f);
        } else {
            float f13 = rectF.bottom;
            gr grVar = gr.f;
            canvas.clipRect(0.0f, (org.telegram.messenger.i0.T1(f13, 0.0f, grVar.getInterpolation(this.O)) - ((int) Math.ceil((1.0f - this.w) * (rectF.height() / 2.0f)))) - 1.0f, getMeasuredWidth(), org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(8.0f) + getMeasuredHeight(), getPaddingTop() - g(), grVar.getInterpolation(this.O)));
        }
        float width = ((org.telegram.messenger.cd.X || this.M) ? this.G : getWidth() - this.G) + this.U0;
        float paddingTop = this.L ? getPaddingTop() - g() : (getHeight() - getPaddingBottom()) + g();
        int L = org.telegram.messenger.i0.L(3.0f);
        Drawable drawable = this.i0;
        drawable.setAlpha(i10);
        Paint paint = this.f;
        paint.setAlpha(i10);
        float f14 = width - f7;
        float f15 = L;
        float f16 = f15 * f10;
        float f17 = paddingTop - f7;
        float f18 = width + f7;
        float f19 = paddingTop + f7;
        drawable.setBounds((int) (f14 - f16), (int) (f17 - f16), (int) (f18 + f16), (int) (f16 + f19));
        drawable.draw(canvas);
        boolean A = this.g0.A();
        float f20 = paddingTop;
        RectF rectF2 = this.b0;
        if (A) {
            rectF2.set(f14, f17, f18, f19);
            f12 = f7;
            this.g0.r(canvas, rectF2, f12, getX(), getY(), i10, false);
        } else {
            f12 = f7;
            if (this.X0 != null) {
                RectF rectF3 = org.telegram.messenger.i0.P;
                rectF3.set(f14, f17, f18, f19);
                Rect rect = org.telegram.messenger.i0.Q;
                rectF3.round(rect);
                rect.inset(-org.telegram.messenger.i0.L(8.0f), -org.telegram.messenger.i0.L(8.0f));
                this.X0.setBounds(rect);
                this.X0.setAlpha(paint.getAlpha());
                this.X0.draw(canvas);
            } else {
                canvas.drawCircle(width, f20, f12, paint);
            }
        }
        boolean z11 = org.telegram.messenger.cd.X;
        float f21 = this.E;
        float width2 = this.U0 + this.V0 + ((z11 || this.M) ? this.G - f21 : (getWidth() - this.G) + f21);
        boolean z12 = this.L;
        float f22 = this.F;
        float T1 = org.telegram.messenger.i0.T1(z12 ? (getPaddingTop() - g()) - org.telegram.messenger.i0.L(16.0f) : ((getHeight() - f22) - f15) + g(), (f22 + f15) - g(), gr.f.getInterpolation(this.O));
        float f23 = (-org.telegram.messenger.i0.L(1.0f)) * f10;
        drawable.setBounds((int) ((width2 - f12) - f23), (int) ((T1 - f12) - f23), (int) (width2 + f12 + f23), (int) (f12 + T1 + f23));
        drawable.draw(canvas);
        if (this.g0.A()) {
            rectF2.set(width2 - f11, T1 - f11, width2 + f11, T1 + f11);
            this.g0.r(canvas, rectF2, f11, getX(), getY(), i10, false);
        } else if (this.Y0 != null) {
            RectF rectF4 = org.telegram.messenger.i0.P;
            rectF4.set(width2 - f11, T1 - f11, width2 + f11, T1 + f11);
            Rect rect2 = org.telegram.messenger.i0.Q;
            rectF4.round(rect2);
            rect2.inset(-org.telegram.messenger.i0.L(8.0f), -org.telegram.messenger.i0.L(8.0f));
            this.Y0.setBounds(rect2);
            this.Y0.setAlpha(paint.getAlpha());
            this.Y0.draw(canvas);
        } else {
            canvas.drawCircle(width2, T1, f11, paint);
        }
        canvas.restore();
        drawable.setAlpha(org.telegram.messenger.zs.e4);
        paint.setAlpha(org.telegram.messenger.zs.e4);
    }

    public final float g() {
        return (int) (getPullingLeftProgress() * org.telegram.messenger.i0.L(6.0f));
    }

    public lj0 getDelegate() {
        return this.g0;
    }

    public int getHintTextWidth() {
        return this.S0;
    }

    public int getItemsCount() {
        return (q() ? 1 : 0) + this.T.size() + 1;
    }

    public float getPullingLeftProgress() {
        return Utilities.i(this.B0 / org.telegram.messenger.i0.L(42.0f), 2.0f, 0.0f);
    }

    public sg.b0 getReactionsWindow() {
        return this.x0;
    }

    public String getSelectedEmoji() {
        TLRPC.Document e;
        HashSet hashSet = this.d0;
        if (hashSet.isEmpty()) {
            return "";
        }
        sg.o0 o0Var = (sg.o0) hashSet.iterator().next();
        long j10 = o0Var.g;
        String str = null;
        if (j10 != 0 && (e = f5.e(this.J, j10)) != null) {
            str = org.telegram.messenger.jj.V(e, null, null);
        }
        if (TextUtils.isEmpty(str)) {
            str = o0Var.f;
        }
        return TextUtils.isEmpty(str) ? "👍" : str;
    }

    public HashSet<sg.o0> getSelectedReactions() {
        return this.d0;
    }

    public float getTopOffset() {
        if (this.Q0) {
            return ((FrameLayout.LayoutParams) this.b.getLayoutParams()).topMargin;
        }
        return 0.0f;
    }

    public int getTotalWidth() {
        int itemsCount = getItemsCount();
        if (q()) {
            return (org.telegram.messenger.i0.L(36.0f) * itemsCount) - org.telegram.messenger.i0.L(4.0f);
        }
        return org.telegram.messenger.i0.L(16.0f) + i0.a.e(itemsCount, 1, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(36.0f) * itemsCount);
    }

    public List<sg.o0> getVisibleReactionsList() {
        return this.T;
    }

    public int getWindowType() {
        int i10 = this.M0;
        if (i10 == 4) {
            return 13;
        }
        if (i10 == 3) {
            return 11;
        }
        if (i10 == 5) {
            return 14;
        }
        return this.F0 ? 8 : 1;
    }

    public View getWindowView() {
        sg.b0 b0Var = this.x0;
        if (b0Var == null) {
            return null;
        }
        return b0Var.c;
    }

    public final void h(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        int i10 = 0;
        int i11 = this.M0;
        if (i11 == 4) {
            Iterator it = this.d0.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                sg.o0 o0Var = (sg.o0) it.next();
                if (!hashSet.contains(o0Var)) {
                    hashSet.add(o0Var);
                    arrayList.add(o0Var);
                    i12++;
                    if (i12 >= 8) {
                        return;
                    }
                }
            }
            ArrayList arrayList2 = org.telegram.messenger.ui.b0(this.J).n;
            while (i10 < arrayList2.size()) {
                sg.o0 c10 = sg.o0.c((TLRPC.TL_availableReaction) arrayList2.get(i10));
                if (!hashSet.contains(c10)) {
                    hashSet.add(c10);
                    arrayList.add(c10);
                    i12++;
                    if (i12 >= 8) {
                        return;
                    }
                }
                i10++;
            }
            return;
        }
        if (!this.E0 || i11 == 4) {
            if (i11 != 3) {
                ArrayList arrayList3 = org.telegram.messenger.ui.b0(this.J).n;
                while (i10 < arrayList3.size()) {
                    arrayList.add(sg.o0.c((TLRPC.TL_availableReaction) arrayList3.get(i10)));
                    i10++;
                }
                return;
            }
            ArrayList arrayList4 = org.telegram.messenger.ui.b0(this.J).E1;
            int i13 = 0;
            while (i10 < arrayList4.size()) {
                sg.o0 d = sg.o0.d((TLRPC.Reaction) arrayList4.get(i10));
                if (!hashSet.contains(d)) {
                    hashSet.add(d);
                    arrayList.add(d);
                    i13++;
                }
                if (i13 == 16) {
                    return;
                } else {
                    i10++;
                }
            }
            return;
        }
        if (i11 == 5) {
            TLRPC.messages_AvailableEffects E0 = org.telegram.messenger.vp.r1(this.J).E0();
            if (E0 != null) {
                while (i10 < E0.effects.size()) {
                    sg.o0 e = sg.o0.e(E0.effects.get(i10));
                    if (!hashSet.contains(e)) {
                        hashSet.add(e);
                        arrayList.add(e);
                    }
                    i10++;
                }
                return;
            }
            return;
        }
        ArrayList arrayList5 = i11 == 3 ? org.telegram.messenger.ui.b0(this.J).E1 : org.telegram.messenger.ui.b0(this.J).D1;
        if (i11 == 3) {
            TLRPC.TL_messages_savedReactionsTags H1 = org.telegram.messenger.vp.r1(this.J).H1(0L, false);
            if (H1 != null) {
                for (int i14 = 0; i14 < H1.tags.size(); i14++) {
                    sg.o0 d10 = sg.o0.d(H1.tags.get(i14).reaction);
                    if (!hashSet.contains(d10)) {
                        hashSet.add(d10);
                        arrayList.add(d10);
                    }
                }
            }
            for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                sg.o0 d11 = sg.o0.d((TLRPC.Reaction) arrayList5.get(i15));
                if (!hashSet.contains(d11)) {
                    hashSet.add(d11);
                    arrayList.add(d11);
                }
            }
        } else {
            for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                sg.o0 d12 = sg.o0.d((TLRPC.Reaction) arrayList5.get(i16));
                if (!hashSet.contains(d12) && (i11 == 3 || org.telegram.messenger.d20.i(this.J).q() || d12.g == 0)) {
                    hashSet.add(d12);
                    arrayList.add(d12);
                }
            }
        }
        if (i11 != 3 || org.telegram.messenger.d20.i(this.J).q()) {
            ArrayList arrayList6 = org.telegram.messenger.ui.b0(this.J).C1;
            for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                sg.o0 d13 = sg.o0.d((TLRPC.Reaction) arrayList6.get(i17));
                if (!hashSet.contains(d13)) {
                    hashSet.add(d13);
                    arrayList.add(d13);
                }
            }
            ArrayList arrayList7 = org.telegram.messenger.ui.b0(this.J).n;
            while (i10 < arrayList7.size()) {
                sg.o0 c11 = sg.o0.c((TLRPC.TL_availableReaction) arrayList7.get(i10));
                if (!hashSet.contains(c11)) {
                    hashSet.add(c11);
                    arrayList.add(c11);
                }
                i10++;
            }
        }
    }

    public void j() {
        int i10 = 0;
        while (true) {
            ag.b1 b1Var = this.b;
            if (i10 >= b1Var.getChildCount()) {
                return;
            }
            View childAt = b1Var.getChildAt(i10);
            if (childAt instanceof kj0) {
                ((kj0) childAt).b.invalidate();
            }
            i10++;
        }
    }

    public final void k() {
        int L = org.telegram.messenger.i0.L(24.0f);
        float height = getHeight() / 2.0f;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G8, false);
        this.b1 = x02;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.h.setShader(new LinearGradient(0.0f, height, L, height, x02, 0, tileMode));
        this.n.setShader(new LinearGradient(getWidth(), height, getWidth() - L, height, x02, 0, tileMode));
        invalidate();
    }

    public final void l(View view, sg.o0 o0Var, boolean z10) {
        lj0 lj0Var = this.g0;
        if (lj0Var != null) {
            lj0Var.x(view, o0Var, z10, true);
        }
        if (this.M0 == 5) {
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    public final void n() {
        this.O0 = true;
        this.m0 = 0;
        this.n0 = 0.0f;
        this.B0 = 0.0f;
        this.l0 = null;
        this.r0 = false;
        xi0 xi0Var = new xi0(this, 1);
        ag.b1 b1Var = this.b;
        org.telegram.messenger.i0.d0(b1Var, xi0Var);
        this.C0.clear();
        b1Var.invalidate();
        fg.i iVar = this.S;
        if (iVar != null) {
            iVar.invalidate();
        }
        invalidate();
    }

    public final void o(tg.b bVar, wg.d dVar) {
        this.Z0 = bVar;
        this.a1 = dVar;
        vg.f c10 = bVar.c(this, null, true);
        c10.o(dVar);
        org.telegram.messenger.z20.u(c10, org.telegram.messenger.i0.L(24.0f), 8.0f);
        this.W0 = c10;
        vg.f c11 = bVar.c(this, null, true);
        c11.o(dVar);
        org.telegram.messenger.z20.u(c11, org.telegram.messenger.i0.L(8.0f), 8.0f);
        this.X0 = c11;
        vg.f c12 = bVar.c(this, null, true);
        c12.o(dVar);
        org.telegram.messenger.z20.u(c12, org.telegram.messenger.i0.L(4.0f), 8.0f);
        this.Y0 = c12;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.i4);
        org.telegram.messenger.zs.f(this.J).c(this, org.telegram.messenger.zs.T);
        if (this.M0 == 5) {
            org.telegram.messenger.zs.f(this.J).c(this, org.telegram.messenger.zs.u3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.i4);
        org.telegram.messenger.zs.f(this.J).n(this, org.telegram.messenger.zs.T);
        if (this.M0 == 5) {
            org.telegram.messenger.zs.f(this.J).n(this, org.telegram.messenger.zs.u3);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        k();
    }

    public final void p(org.telegram.messenger.jj jjVar, TLRPC.ChatFull chatFull, boolean z10) {
        int i10;
        TLRPC.ChatFull chatFull2;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions2;
        this.H = jjVar;
        if (jjVar == null || (message = jjVar.k) == null || (tL_messageReactions2 = message.reactions) == null) {
            i10 = 0;
        } else {
            ArrayList<TLRPC.ReactionCount> arrayList = tL_messageReactions2.results;
            int size = arrayList.size();
            i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                TLRPC.ReactionCount reactionCount = arrayList.get(i11);
                i11++;
                if (!(reactionCount.reaction instanceof TLRPC.TL_reactionPaid)) {
                    i10++;
                }
            }
        }
        int i12 = this.M0;
        this.I = i12 == 0 && this.H != null && i10 >= org.telegram.messenger.vp.r1(this.J).N0(org.telegram.messenger.jj.B0(this.H.k));
        this.A0 = i12 == 0 && this.H != null && org.telegram.messenger.w3.V(org.telegram.messenger.vp.r1(this.J).L0(Long.valueOf(-org.telegram.messenger.jj.B0(this.H.k))));
        ArrayList arrayList2 = new ArrayList();
        if (jjVar == null || !jjVar.k3()) {
            chatFull2 = chatFull;
        } else {
            chatFull2 = org.telegram.messenger.vp.r1(this.J).M0(-jjVar.Z0());
            if (chatFull2 == null) {
                this.K = -jjVar.Z0();
                org.telegram.messenger.vp.r1(this.J).T2(0, -jjVar.Z0(), true);
                setVisibility(4);
                return;
            }
        }
        this.c0 = false;
        if (i12 == 3) {
            this.E0 = org.telegram.messenger.d20.i(this.J).q();
            h(arrayList2);
        } else if (i12 == 5) {
            this.E0 = true;
            h(arrayList2);
        } else if (this.I) {
            this.E0 = false;
            if (chatFull2 != null && chatFull2.paid_reactions_available) {
                this.c0 = true;
                sg.o0 o0Var = new sg.o0();
                o0Var.a = true;
                arrayList2.add(o0Var);
            }
            ArrayList<TLRPC.ReactionCount> arrayList3 = this.H.k.reactions.results;
            int size2 = arrayList3.size();
            int i13 = 0;
            while (i13 < size2) {
                TLRPC.ReactionCount reactionCount2 = arrayList3.get(i13);
                i13++;
                arrayList2.add(sg.o0.d(reactionCount2.reaction));
            }
        } else if (chatFull2 != null) {
            if (chatFull2.paid_reactions_available) {
                this.c0 = true;
                sg.o0 o0Var2 = new sg.o0();
                o0Var2.a = true;
                arrayList2.add(o0Var2);
            }
            TLRPC.ChatReactions chatReactions = chatFull2.available_reactions;
            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                TLRPC.Chat L0 = org.telegram.messenger.vp.r1(this.J).L0(Long.valueOf(chatFull2.id));
                if (L0 == null || org.telegram.messenger.w3.V(L0)) {
                    this.E0 = false;
                } else {
                    this.E0 = true;
                }
                h(arrayList2);
            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                ArrayList<TLRPC.Reaction> arrayList4 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                int size3 = arrayList4.size();
                int i14 = 0;
                while (i14 < size3) {
                    TLRPC.Reaction reaction = arrayList4.get(i14);
                    i14++;
                    TLRPC.Reaction reaction2 = reaction;
                    ArrayList arrayList5 = org.telegram.messenger.ui.b0(this.J).n;
                    int size4 = arrayList5.size();
                    int i15 = 0;
                    while (true) {
                        if (i15 < size4) {
                            Object obj = arrayList5.get(i15);
                            i15++;
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj;
                            if (!(reaction2 instanceof TLRPC.TL_reactionEmoji) || !tL_availableReaction.reaction.equals(((TLRPC.TL_reactionEmoji) reaction2).emoticon)) {
                                if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                    arrayList2.add(sg.o0.d(reaction2));
                                    break;
                                }
                            } else {
                                arrayList2.add(sg.o0.d(reaction2));
                                break;
                            }
                        }
                    }
                }
            }
        } else {
            this.E0 = true;
            h(arrayList2);
        }
        HashSet hashSet = new HashSet();
        int i16 = 0;
        while (i16 < arrayList2.size()) {
            if (hashSet.contains(arrayList2.get(i16))) {
                i16--;
                arrayList2.remove(i16);
            } else {
                hashSet.add((sg.o0) arrayList2.get(i16));
            }
            i16++;
        }
        this.F0 = !this.I && ((!this.E0 && arrayList2.size() > 16) || (this.E0 && !org.telegram.messenger.d20.i(this.J).q() && org.telegram.messenger.vp.r1(this.J).A3()));
        if (i12 == 3 && !org.telegram.messenger.d20.i(this.J).q()) {
            this.F0 = false;
        }
        if (i12 == 4) {
            this.F0 = true;
        }
        ArrayList arrayList6 = this.T;
        arrayList6.clear();
        if (q()) {
            int L = (org.telegram.messenger.i0.q.x - org.telegram.messenger.i0.L(36.0f)) / org.telegram.messenger.i0.L(34.0f);
            if (L > 7) {
                L = 7;
            }
            int i17 = 0;
            if (L < 1) {
                L = 1;
            }
            while (i17 < Math.min(arrayList2.size(), L)) {
                arrayList6.add((sg.o0) arrayList2.get(i17));
                i17++;
            }
            if (i17 < arrayList2.size()) {
                kj0.a(this.z0, (sg.o0) arrayList2.get(i17), -1);
            }
        } else {
            arrayList6.addAll(arrayList2);
        }
        this.G0 = true;
        for (int i18 = 0; i18 < arrayList6.size(); i18++) {
            if (((sg.o0) arrayList6.get(i18)).g != 0) {
                this.G0 = false;
            }
        }
        ArrayList arrayList7 = this.V;
        arrayList7.clear();
        arrayList7.addAll(arrayList2);
        if (arrayList2.size() * (((getLayoutParams().height - ((int) getTopOffset())) - getPaddingTop()) - getPaddingBottom()) < org.telegram.messenger.i0.L(200.0f)) {
            getLayoutParams().width = -2;
        }
        cj0 cj0Var = this.a0;
        mj0 mj0Var = (mj0) cj0Var.e;
        ArrayList arrayList8 = mj0Var.e;
        ArrayList arrayList9 = mj0Var.T;
        ArrayList arrayList10 = mj0Var.d;
        arrayList8.clear();
        arrayList8.addAll(arrayList10);
        arrayList10.clear();
        for (int i19 = 0; i19 < arrayList9.size(); i19++) {
            sg.o0 o0Var3 = (sg.o0) arrayList9.get(i19);
            arrayList10.add(new dj0(o0Var3.f == null ? 3 : 0, o0Var3));
        }
        if (!mj0Var.U.isEmpty() && !org.telegram.messenger.vp.r1(mj0Var.J).A3()) {
            arrayList10.add(new dj0(1, null));
        }
        if (mj0Var.q()) {
            arrayList10.add(new dj0(2, null));
        }
        if (z10) {
            cj0Var.E(arrayList8, arrayList10);
        } else {
            cj0Var.f();
        }
        if (jjVar == null || (tL_messageReactions = jjVar.k.reactions) == null || tL_messageReactions.results == null) {
            return;
        }
        for (int i20 = 0; i20 < jjVar.k.reactions.results.size(); i20++) {
            if (jjVar.k.reactions.results.get(i20).chosen) {
                this.d0.add(sg.o0.d(jjVar.k.reactions.results.get(i20).reaction));
            }
        }
    }

    public final boolean q() {
        return this.E0 || this.F0;
    }

    public final void r(boolean z10) {
        ObjectAnimator duration;
        this.K0 = z10;
        setTransitionProgress(0.0f);
        setAlpha(1.0f);
        this.L0.d();
        boolean j10 = org.telegram.messenger.tz.j();
        org.telegram.ui.Cells.g1 g1Var = l1;
        if (j10) {
            duration = ObjectAnimator.ofFloat(this, g1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            duration = ObjectAnimator.ofFloat(this, g1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        }
        duration.addListener(new zi0(this, 0));
        duration.start();
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        if (getAlpha() != f7 && f7 == 0.0f) {
            this.C0.clear();
            int i10 = 0;
            while (true) {
                ag.b1 b1Var = this.b;
                if (i10 >= b1Var.getChildCount()) {
                    break;
                }
                if (b1Var.getChildAt(i10) instanceof kj0) {
                    ((kj0) b1Var.getChildAt(i10)).d();
                }
                i10++;
            }
        }
        super.setAlpha(f7);
    }

    public void setBubbleOffset(float f7) {
        this.U0 = f7;
    }

    public void setChatScrimView(ko koVar) {
        this.e1 = koVar;
    }

    public void setCurrentAccount(int i10) {
        this.J = i10;
    }

    public void setCustomEmojiEnterProgress(float f7) {
        this.w0 = f7;
        ko koVar = this.e1;
        if (koVar != null) {
            koVar.setPopupAlpha(1.0f - f7);
        }
        invalidate();
    }

    public void setCustomEmojiReactionsBackground(boolean z10) {
        if (!z10) {
            this.v0.setBackground(null);
            return;
        }
        ir irVar = this.v0;
        int L = org.telegram.messenger.i0.L(28.0f);
        int i10 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.ActionBar.a7.R(irVar, org.telegram.ui.ActionBar.t6.j0(L, 0, i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i10, false), 40)), null, org.telegram.ui.ActionBar.a7.h(i10, 40), null);
    }

    public void setDelegate(lj0 lj0Var) {
        this.g0 = lj0Var;
    }

    public void setFlippedVertically(boolean z10) {
        this.N = z10;
        invalidate();
    }

    public void setFragment(org.telegram.ui.ActionBar.k2 k2Var) {
        this.t0 = k2Var;
    }

    public void setHint(CharSequence charSequence) {
        this.Q0 = true;
        if (this.R0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.p6 p6Var = this.k0;
            p80 p80Var = new p80(context, p6Var);
            this.R0 = p80Var;
            p80Var.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
            this.R0.setClickable(true);
            this.R0.setTextSize(1, 12.0f);
            int i10 = this.M0;
            if (i10 == 1 || i10 == 2 || i10 == 4) {
                org.telegram.ui.ActionBar.a7.V(this.R0, org.telegram.ui.ActionBar.t6.G6, p6Var);
                this.R0.setAlpha(0.5f);
            } else {
                org.telegram.ui.ActionBar.a7.V(this.R0, org.telegram.ui.ActionBar.t6.z6, p6Var);
            }
            this.R0.setGravity(1);
            addView(this.R0, w7.b6.d(-1, -2.0f, 0, 0.0f, 6.0f, 0.0f, 0.0f));
        }
        this.R0.setText(charSequence);
        this.f1 = false;
        ((FrameLayout.LayoutParams) this.z0.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(20.0f);
        ((FrameLayout.LayoutParams) this.b.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(20.0f);
    }

    public void setMiniBubblesOffset(float f7) {
        this.V0 = f7;
    }

    public void setMirrorX(boolean z10) {
        this.M = z10;
        invalidate();
    }

    public void setOnSwitchedToLoopView(Runnable runnable) {
        this.P0 = runnable;
    }

    public void setParentLayout(ko koVar) {
        this.J0 = koVar;
    }

    public void setSelectedEmojis(ArrayList<String> arrayList) {
        HashSet hashSet = this.d0;
        hashSet.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            sg.o0 b10 = sg.o0.b(str);
            hashSet.add(b10);
            this.e0.add(b10);
        }
        org.telegram.messenger.i0.d0(this.b, new xi0(this, 0));
    }

    public void setSelectedReaction(sg.o0 o0Var) {
        HashSet hashSet = this.d0;
        hashSet.clear();
        if (o0Var != null) {
            hashSet.add(o0Var);
        }
        this.a0.f();
    }

    public void setSelectedReactionAnimated(sg.o0 o0Var) {
        HashSet hashSet = this.d0;
        hashSet.clear();
        if (o0Var != null) {
            hashSet.add(o0Var);
        }
        org.telegram.messenger.i0.d0(this.b, new xi0(this, 0));
    }

    public void setSelectedReactionInclusive(sg.o0 o0Var) {
        HashSet hashSet = this.d0;
        hashSet.clear();
        if (o0Var != null) {
            hashSet.add(o0Var);
        }
        org.telegram.messenger.i0.d0(this.b, new xi0(this, 0));
    }

    public void setSelectedReactions(ArrayList<org.telegram.messenger.jj> arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        HashSet hashSet = this.d0;
        hashSet.clear();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            org.telegram.messenger.jj jjVar = arrayList.get(i10);
            if (jjVar != null && (tL_messageReactions = jjVar.k.reactions) != null && tL_messageReactions.results != null) {
                for (int i11 = 0; i11 < jjVar.k.reactions.results.size(); i11++) {
                    if (jjVar.k.reactions.results.get(i11).chosen) {
                        hashSet.add(sg.o0.d(jjVar.k.reactions.results.get(i11).reaction));
                    }
                }
            }
        }
        this.a0.f();
    }

    public void setSelectedReactionsInclusive(ArrayList<org.telegram.messenger.jj> arrayList) {
        HashSet hashSet = this.d0;
        hashSet.clear();
        hashSet.addAll(i(arrayList));
        org.telegram.messenger.i0.d0(this.b, new xi0(this, 0));
    }

    public void setSkipDraw(boolean z10) {
        if (this.d1 != z10) {
            this.d1 = z10;
            if (!z10) {
                int i10 = 0;
                while (true) {
                    ag.b1 b1Var = this.b;
                    if (i10 >= b1Var.getChildCount()) {
                        break;
                    }
                    if (b1Var.getChildAt(i10) instanceof kj0) {
                        kj0 kj0Var = (kj0) b1Var.getChildAt(i10);
                        boolean z11 = kj0Var.r;
                        jj0 jj0Var = kj0Var.b;
                        if (z11 && (jj0Var.getImageReceiver().B() != null || jj0Var.getImageReceiver().m() != null)) {
                            jj0Var.setVisibility(0);
                            kj0Var.a.setVisibility(4);
                            if (kj0Var.s) {
                                kj0Var.w = true;
                            }
                        }
                        kj0Var.invalidate();
                    }
                    i10++;
                }
            }
            invalidate();
        }
    }

    public void setStoryItem(TL_stories.StoryItem storyItem) {
        TLRPC.Reaction reaction;
        HashSet hashSet = this.d0;
        hashSet.clear();
        if (storyItem != null && (reaction = storyItem.sent_reaction) != null) {
            hashSet.add(sg.o0.d(reaction));
        }
        this.a0.f();
    }

    public void setTop(boolean z10) {
        this.L = z10;
    }

    public void setTransitionProgress(float f7) {
        this.w = f7;
        ko koVar = this.J0;
        if (koVar != null) {
            if (!this.K0 || !org.telegram.messenger.tz.j()) {
                f7 = 1.0f;
            }
            koVar.setReactionsTransitionProgress(f7);
        }
        invalidate();
    }

    @Override // android.view.View
    public void setTranslationX(float f7) {
        if (f7 != getTranslationX()) {
            super.setTranslationX(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int w02;
        Paint paint = this.f;
        if (paint != null) {
            try {
                int i10 = this.M0;
                if (i10 != 2 && i10 != 4 && paint.getColor() != (w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G8, this.k0))) {
                    int alpha = paint.getAlpha();
                    paint.setColor(w02);
                    paint.setAlpha(alpha);
                    invalidate();
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return;
            }
        }
        kg.l1 l1Var = this.u0;
        if (l1Var != null) {
            l1Var.setColor(i0.b.f(0.7f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.F8, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h5, false)));
        }
        if (getWidth() <= 0 || getHeight() <= 0 || this.b1 == org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G8, false)) {
            return;
        }
        k();
    }

    public void m() {
    }
}
