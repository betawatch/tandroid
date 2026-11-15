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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class mi0 extends FrameLayout implements org.telegram.messenger.is, org.telegram.ui.ActionBar.z5 {
    public static final org.telegram.ui.Cells.g1 m1 = new org.telegram.ui.Cells.g1(Float.class, "transitionProgress", 2);
    public final ki0 A0;
    public boolean B0;
    public float C0;
    public final HashSet D0;
    public float E;
    public final HashSet E0;
    public final float F;
    public boolean F0;
    public final float G;
    public boolean G0;
    public int H;
    public boolean H0;
    public org.telegram.messenger.gj I;
    public final Paint I0;
    public boolean J;
    public final Paint J0;
    public int K;
    public lo K0;
    public long L;
    public boolean L0;
    public boolean M;
    public final h2.f M0;
    public boolean N;
    public final int N0;
    public boolean O;
    public boolean O0;
    public float P;
    public boolean P0;
    public long Q;
    public Runnable Q0;
    public ValueAnimator R;
    public boolean R0;
    public FrameLayout S;
    public z70 S0;
    public ai.k0 T;
    public int T0;
    public final ArrayList U;
    public int U0;
    public final ArrayList V;
    public float V0;
    public final ArrayList W;
    public float W0;
    public fh.g X0;
    public fh.g Y0;
    public fh.g Z0;
    public boolean a;
    public final jg.i0 a0;
    public dh.c a1;
    public final di.c1 b;
    public final ci0 b0;
    public gh.e b1;
    public final float c;
    public final RectF c0;
    public int c1;
    public final ArrayList d;
    public boolean d0;
    public boolean d1;
    public final ArrayList e;
    public final HashSet e0;
    public boolean e1;
    public final Paint f;
    public final HashSet f0;
    public lo f1;
    public final int[] g0;
    public boolean g1;
    public final Paint h;
    public li0 h0;
    public boolean h1;
    public final Rect i0;
    public boolean i1;
    public final Drawable j0;
    public Paint j1;
    public final boolean k0;
    public Matrix k1;
    public final org.telegram.ui.ActionBar.e6 l0;
    public LinearGradient l1;
    public ch.p0 m0;
    public final Paint n;
    public int n0;
    public float o0;
    public float p0;
    public float q0;
    public float r;
    public float r0;
    public float s;
    public boolean s0;
    public long t0;
    public org.telegram.ui.ActionBar.e2 u0;
    public ug.a1 v0;
    public float w;
    public gr w0;
    public final RectF x;
    public float x0;
    public final Path y;
    public ch.b0 y0;
    public ValueAnimator z0;

    public mi0(int i7, int i10, Context context, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i11 = 0;
        this.a = false;
        this.d = new ArrayList();
        this.e = new ArrayList();
        int i12 = 1;
        Paint paint = new Paint(1);
        this.f = paint;
        this.h = new Paint(1);
        this.n = new Paint(1);
        this.w = 1.0f;
        this.x = new RectF();
        this.y = new Path();
        this.E = org.telegram.messenger.g0.L(72.0f);
        float L = org.telegram.messenger.g0.L(8.0f);
        this.F = L;
        this.G = L / 2.0f;
        this.H = org.telegram.messenger.g0.L(36.0f);
        this.U = new ArrayList(20);
        this.V = new ArrayList(10);
        this.W = new ArrayList(20);
        this.c0 = new RectF();
        this.d0 = false;
        this.e0 = new HashSet();
        this.f0 = new HashSet();
        this.g0 = new int[2];
        Rect rect = new Rect();
        this.i0 = rect;
        new ArrayList();
        this.D0 = new HashSet();
        this.E0 = new HashSet();
        Paint paint2 = new Paint(1);
        this.I0 = paint2;
        Paint paint3 = new Paint(1);
        this.J0 = paint3;
        this.M0 = new h2.f((int[]) null);
        this.P0 = true;
        this.h1 = false;
        this.N0 = i7;
        this.c = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        paint2.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.i6, e6Var));
        paint3.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ak, e6Var));
        this.l0 = e6Var;
        this.K = i10;
        this.u0 = e2Var;
        ki0 ki0Var = new ki0(this, context);
        this.A0 = ki0Var;
        ki0Var.setVisibility(8);
        ki0Var.P = false;
        ki0Var.c.setVisibility(8);
        addView(ki0Var);
        this.k0 = org.telegram.messenger.gz.c() && org.telegram.messenger.gz.o() != 0;
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.j0 = mutate;
        int L2 = org.telegram.messenger.g0.L(7.0f);
        rect.bottom = L2;
        rect.right = L2;
        rect.top = L2;
        rect.left = L2;
        org.telegram.ui.ActionBar.q6.x(this, mutate, org.telegram.ui.ActionBar.j6.Ke, null, PorterDuff.Mode.MULTIPLY);
        di.c1 c1Var = new di.c1(22, context, this);
        this.b = c1Var;
        c1Var.setClipChildren(false);
        c1Var.setClipToPadding(false);
        jg.i0 i0Var = new jg.i0((ViewGroup) this, 4);
        this.a0 = i0Var;
        c1Var.i(new yh0(this, i11));
        c1Var.setLayoutManager(i0Var);
        c1Var.setOverScrollMode(2);
        ci0 ci0Var = new ci0(this, i11);
        this.b0 = ci0Var;
        c1Var.setAdapter(ci0Var);
        c1Var.j(new gi0(this));
        c1Var.j(new ri(this, 14));
        c1Var.i(new yh0(this, i12));
        int i13 = 11;
        c1Var.setOnItemClickListener(new j(this, i13));
        c1Var.setOnItemLongClickListener((ij0) new ai.s1(this, i7, i13));
        addView(c1Var, c8.ja.c(-1.0f, -1));
        setClipChildren(false);
        setClipToPadding(false);
        k();
        int paddingTop = (c1Var.getLayoutParams().height - c1Var.getPaddingTop()) - c1Var.getPaddingBottom();
        ki0Var.getLayoutParams().width = paddingTop - org.telegram.messenger.g0.L(12.0f);
        ki0Var.getLayoutParams().height = paddingTop;
        if (i7 == 2 || i7 == 4) {
            paint.setColor(i0.a.f(0.13f, -16777216, -1));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G8, e6Var));
        }
        org.telegram.messenger.si.b0(i10).k1();
    }

    public static void a(mi0 mi0Var) {
        if (mi0Var.y0 != null) {
            return;
        }
        ch.b0 b0Var = new ch.b0(mi0Var.N0, mi0Var.u0, mi0Var.W, mi0Var.e0, mi0Var, mi0Var.l0, mi0Var.a);
        mi0Var.y0 = b0Var;
        dh.c cVar = mi0Var.a1;
        boolean z10 = true;
        if (cVar != null) {
            gh.e eVar = mi0Var.b1;
            org.telegram.ui.f01 f01Var = b0Var.m.g0;
            f01Var.y = true;
            f01Var.setBackground(null);
            f01Var.updateColors();
            f01Var.invalidate();
            fh.g c10 = cVar.c(b0Var.a, null, true);
            c10.p(eVar);
            org.telegram.messenger.i20.r(c10, org.telegram.messenger.g0.L(12.0f), 8.0f);
            b0Var.z = c10;
        }
        ch.b0 b0Var2 = mi0Var.y0;
        li0 li0Var = mi0Var.h0;
        if (li0Var != null && !li0Var.r()) {
            z10 = false;
        }
        b0Var2.m.setLongPressEnabled(z10);
        mi0Var.j();
        mi0Var.y0.p = new wa0(mi0Var, 13);
        mi0Var.m();
    }

    public static void b(mi0 mi0Var, View view, float f10) {
        if (view instanceof ki0) {
            ((ki0) view).h = f10;
        } else {
            view.setScaleX(f10);
            view.setScaleY(f10);
        }
    }

    public static boolean c() {
        return org.telegram.messenger.gz.j();
    }

    public static HashSet i(ArrayList arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        LongSparseArray longSparseArray = new LongSparseArray();
        HashSet hashSet = new HashSet();
        boolean z10 = true;
        int i7 = 0;
        while (i7 < arrayList.size()) {
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i7);
            hashSet.clear();
            if (gjVar != null && (tL_messageReactions = gjVar.k.reactions) != null && tL_messageReactions.results != null) {
                for (int i10 = 0; i10 < gjVar.k.reactions.results.size(); i10++) {
                    if (gjVar.k.reactions.results.get(i10).chosen) {
                        ch.p0 d = ch.p0.d(gjVar.k.reactions.results.get(i10).reaction);
                        if (z10 || longSparseArray.indexOfKey(d.h) >= 0) {
                            hashSet.add(Long.valueOf(d.h));
                            longSparseArray.put(d.h, d);
                        }
                    }
                }
            }
            int i11 = 0;
            while (i11 < longSparseArray.size()) {
                if (!hashSet.contains(Long.valueOf(longSparseArray.keyAt(i11)))) {
                    longSparseArray.removeAt(i11);
                    i11--;
                }
                i11++;
            }
            i7++;
            z10 = false;
        }
        HashSet hashSet2 = new HashSet();
        for (int i12 = 0; i12 < longSparseArray.size(); i12++) {
            if (longSparseArray.valueAt(i12) != null) {
                hashSet2.add((ch.p0) longSparseArray.valueAt(i12));
            }
        }
        return hashSet2;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.F8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.h5));
    }

    public final void d(boolean z10) {
        ch.b0 b0Var = this.y0;
        if (b0Var != null) {
            if (!b0Var.q || !z10) {
                b0Var.q = true;
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    int i7 = 0;
                    ofFloat.addUpdateListener(new ch.t(b0Var, i7));
                    ofFloat.addListener(new ch.z(b0Var, i7));
                    ofFloat.setDuration(150L);
                    ofFloat.start();
                } else {
                    b0Var.f();
                }
            }
            this.y0 = null;
        }
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id != this.L || getVisibility() == 0 || (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) {
                return;
            }
            p(this.I, null, true);
            setVisibility(0);
            r(false);
            return;
        }
        if (i7 != org.telegram.messenger.ns.i4) {
            if (i7 == org.telegram.messenger.ns.u3) {
                p(this.I, null, true);
            }
        } else {
            if (this.N0 != 4) {
                return;
            }
            invalidate();
            di.c1 c1Var = this.b;
            c1Var.invalidate();
            c1Var.g1();
            for (int i11 = 0; i11 < c1Var.getChildCount(); i11++) {
                View childAt = c1Var.getChildAt(i11);
                if (childAt instanceof ki0) {
                    ki0 ki0Var = (ki0) childAt;
                    ki0Var.a.invalidate();
                    ki0Var.b.invalidate();
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
        z70 z70Var;
        ch.p0 p0Var;
        int i7;
        ch.p0 p0Var2;
        float width;
        float f10;
        float f11;
        float max;
        float f12;
        lo loVar;
        float f13;
        int i10;
        float f14;
        RectF rectF;
        int i11;
        float f15;
        float f16;
        int i12;
        RectF rectF2;
        di.c1 c1Var;
        int i13;
        float f17;
        boolean q10;
        RectF rectF3;
        int i14;
        RectF rectF4;
        int i15;
        di.c1 c1Var2;
        float f18;
        int R;
        float f19;
        float f20;
        float x10;
        float scaleX;
        float f21;
        float f22;
        g5 g5Var;
        fi.u2 u2Var;
        int i16;
        li0 li0Var;
        float f23;
        Canvas canvas2 = canvas;
        long min = Math.min(16L, System.currentTimeMillis() - this.Q);
        this.Q = System.currentTimeMillis();
        boolean z10 = this.O;
        if (z10) {
            float f24 = this.P;
            if (f24 != 1.0f) {
                this.P = org.telegram.ui.Cells.y0.e(min, 220.0f, f24, 1.0f);
                invalidate();
                z70Var = this.S0;
                if (z70Var != null) {
                    z70Var.setTranslationY(-g());
                }
                float max2 = (Math.max(0.25f, Math.min(this.w, 1.0f)) - 0.25f) / 0.75f;
                float f25 = this.F * max2;
                float f26 = this.G * max2;
                HashSet hashSet = this.E0;
                hashSet.clear();
                HashSet hashSet2 = this.D0;
                hashSet.addAll(hashSet2);
                hashSet2.clear();
                if (this.d1) {
                    invalidate();
                }
                p0Var = this.m0;
                i7 = this.N0;
                if (p0Var != null && i7 != 5 && ((li0Var = this.h0) == null || li0Var.r())) {
                    f23 = this.o0;
                    if (f23 != 1.0f) {
                        float longPressTimeout = (16.0f / (this.m0.a ? ViewConfiguration.getLongPressTimeout() : 1500.0f)) + f23;
                        this.o0 = longPressTimeout;
                        if (longPressTimeout >= 1.0f) {
                            this.o0 = 1.0f;
                        }
                        invalidate();
                    }
                }
                p0Var2 = this.m0;
                if (p0Var2 == null && p0Var2.a) {
                    this.q0 = 1.0f;
                    this.r0 = 1.0f;
                } else {
                    float f27 = this.o0;
                    this.q0 = (f27 * 2.0f) + 1.0f;
                    this.r0 = 1.0f - (f27 * 0.15f);
                }
                int save = canvas2.save();
                if (!org.telegram.messenger.hd.a0 || this.N) {
                    width = getWidth();
                    f10 = 0.125f;
                } else {
                    width = getWidth();
                    f10 = 0.875f;
                }
                float f28 = width * f10;
                f11 = this.w;
                if (f11 != 1.0f) {
                    canvas2.scale(f11, f11, f28, getHeight() / 2.0f);
                }
                if (!org.telegram.messenger.hd.a0 || this.N) {
                    max = Math.max(0.25f, this.w);
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f - Math.max(0.25f, this.w);
                    max = 1.0f;
                }
                float pullingLeftProgress = getPullingLeftProgress();
                float g10 = g();
                loVar = this.f1;
                if (loVar != null) {
                    loVar.setExpandSize(g10);
                }
                float width2 = (getWidth() - getPaddingRight()) * Math.min(1.0f, f12);
                float topOffset = getTopOffset();
                float paddingTop = getPaddingTop();
                di.c1 c1Var3 = this.b;
                float f29 = f12;
                float f30 = max;
                RectF rectF5 = this.x;
                rectF5.set(getPaddingLeft() + width2, (((1.0f - this.r0) * c1Var3.getMeasuredHeight()) + paddingTop) - g10, (getWidth() - getPaddingRight()) * max, (getHeight() - getPaddingBottom()) + g10);
                this.E = com.google.android.gms.internal.vision.e2.w(g10, 2.0f, rectF5.height() - topOffset, 2.0f);
                if (i7 == 1) {
                    f13 = 255.0f;
                    int i17 = (int) (Utilities.i(1.0f - (this.x0 / 0.05f), 1.0f, 0.0f) * 255.0f);
                    Drawable drawable = this.j0;
                    drawable.setAlpha(i17);
                    float paddingLeft = getPaddingLeft();
                    int width3 = getWidth() - getPaddingRight();
                    Rect rect = this.i0;
                    int i18 = (int) g10;
                    drawable.setBounds((int) ((((width3 + rect.right) * f29) + paddingLeft) - rect.left), (getPaddingTop() - rect.top) - i18, (int) (((getWidth() - getPaddingRight()) + rect.right) * f30), (getHeight() - getPaddingBottom()) + rect.bottom + i18);
                    if (this.X0 == null) {
                        drawable.draw(canvas2);
                    }
                } else {
                    f13 = 255.0f;
                }
                canvas2.restoreToCount(save);
                if (this.e1) {
                    int save2 = canvas2.save();
                    float f31 = this.w;
                    if (f31 != 1.0f) {
                        f15 = 2.0f;
                        canvas2.scale(f31, f31, f28, getHeight() / 2.0f);
                    } else {
                        f15 = 2.0f;
                    }
                    if (i7 == 1 || this.h0.L()) {
                        i16 = save2;
                        i10 = i7;
                        rectF = rectF5;
                        f14 = f28;
                        i11 = 1;
                        this.h0.J(canvas, rectF, this.E, getX(), getY(), org.telegram.messenger.ns.e4, false);
                        canvas2 = canvas;
                    } else {
                        fh.g gVar = this.X0;
                        Paint paint = this.f;
                        if (gVar != null) {
                            Rect rect2 = org.telegram.messenger.g0.Q;
                            rectF5.round(rect2);
                            rect2.inset(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
                            this.X0.setBounds(rect2);
                            this.X0.setAlpha(paint.getAlpha());
                            this.X0.draw(canvas2);
                        } else {
                            float f32 = this.E;
                            canvas2.drawRoundRect(rectF5, f32, f32, paint);
                        }
                        i16 = save2;
                        i10 = i7;
                        f14 = f28;
                        rectF = rectF5;
                        i11 = 1;
                    }
                    if (this.d0) {
                        Iterator it = this.e0.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                float f33 = this.E;
                                float l10 = Utilities.l(1.0f - getPullingLeftProgress());
                                if (this.j1 == null) {
                                    this.j1 = new Paint(i11);
                                }
                                if (this.k1 == null) {
                                    this.k1 = new Matrix();
                                }
                                if (this.l1 == null) {
                                    int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ak, this.l0);
                                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(64.0f), 0.0f, new int[]{w02, org.telegram.ui.ActionBar.j6.r1(0.0f, w02)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                                    this.l1 = linearGradient;
                                    this.j1.setShader(linearGradient);
                                }
                                this.k1.reset();
                                this.k1.postTranslate(rectF.left, rectF.top);
                                this.l1.setLocalMatrix(this.k1);
                                this.j1.setAlpha((int) (l10 * f13));
                                canvas2.drawRoundRect(rectF, f33, f33, this.j1);
                            } else if (((ch.p0) it.next()).a) {
                                break;
                            }
                        }
                    }
                    canvas2.restoreToCount(i16);
                } else {
                    i10 = i7;
                    f14 = f28;
                    rectF = rectF5;
                    i11 = 1;
                    f15 = 2.0f;
                }
                Path path = this.y;
                path.rewind();
                float f34 = this.E;
                path.addRoundRect(rectF, f34, f34, Path.Direction.CW);
                int save3 = canvas2.save();
                f16 = this.w;
                if (f16 != 1.0f) {
                    canvas2.scale(f16, f16, f14, getHeight() / f15);
                }
                if (this.w != 0.0f) {
                    int i19 = i10;
                    if (getAlpha() == 1.0f || i19 == 5) {
                        int i20 = 0;
                        int i21 = 0;
                        int i22 = 0;
                        while (i20 < c1Var3.getChildCount()) {
                            View childAt = c1Var3.getChildAt(i20);
                            boolean z11 = i11;
                            int abs = (this.w == 1.0f || !org.telegram.messenger.gz.j()) ? i22 : (int) (Math.abs((((childAt.getMeasuredWidth() / f15) + childAt.getLeft()) / c1Var3.getMeasuredWidth()) - 0.8f) * 200.0f);
                            float f35 = f26;
                            if (childAt instanceof ki0) {
                                ki0 ki0Var = (ki0) c1Var3.getChildAt(i20);
                                i15 = i20;
                                if (this.C0 != 0.0f) {
                                    i14 = save3;
                                    f20 = org.telegram.messenger.g0.L(46.0f) * Utilities.i(ki0Var.getLeft() / (getMeasuredWidth() - org.telegram.messenger.g0.L(34.0f)), 1.0f, 0.0f) * getPullingLeftProgress();
                                } else {
                                    i14 = save3;
                                    f20 = 0.0f;
                                }
                                ch.p0 p0Var3 = ki0Var.e;
                                ji0 ji0Var = ki0Var.a;
                                float f36 = f20;
                                ji0 ji0Var2 = ki0Var.b;
                                ji0 ji0Var3 = ki0Var.c;
                                rectF4 = rectF;
                                if (p0Var3.equals(this.m0)) {
                                    ji0 ji0Var4 = ji0Var2.getVisibility() == 0 ? ji0Var2 : ji0Var;
                                    ki0Var.setPivotX(ki0Var.getMeasuredWidth() >> 1);
                                    ki0Var.setPivotY(ji0Var4.getY() + ji0Var4.getMeasuredHeight());
                                    ki0Var.setScaleX(this.q0);
                                    ki0Var.setScaleY(this.q0);
                                    if (!this.s0) {
                                        if (this.R == null) {
                                            ji0Var3.setVisibility(0);
                                            ji0Var3.setAlpha(1.0f);
                                            if (ji0Var3.getImageReceiver().I() || ((g5Var = ji0Var3.e) != null && (u2Var = g5Var.k) != null && u2Var.I())) {
                                                ji0Var4.setAlpha(0.0f);
                                            }
                                            f22 = 1.0f;
                                        } else {
                                            f22 = 1.0f;
                                            ji0Var3.setAlpha(1.0f - this.p0);
                                            ji0Var4.setAlpha(this.p0);
                                        }
                                        if (this.o0 == f22) {
                                            this.s0 = z11;
                                            if (System.currentTimeMillis() - this.t0 > 300) {
                                                this.t0 = System.currentTimeMillis();
                                                c1Var2 = c1Var3;
                                                this.h0.h(ki0Var, ki0Var.e, true, false);
                                                canvas2.save();
                                                x10 = ki0Var.getX() + c1Var2.getX();
                                                scaleX = ((ki0Var.getScaleX() * ki0Var.getMeasuredWidth()) - ki0Var.getMeasuredWidth()) / f15;
                                                f21 = x10 - scaleX;
                                                if (f21 >= 0.0f && ki0Var.getTranslationX() >= 0.0f) {
                                                    ki0Var.setTranslationX((-f21) - f36);
                                                } else if (ki0Var.getMeasuredWidth() + x10 + scaleX > getMeasuredWidth() || ki0Var.getTranslationX() > 0.0f) {
                                                    ki0Var.setTranslationX(0.0f - f36);
                                                } else {
                                                    ki0Var.setTranslationX((((getMeasuredWidth() - x10) - ki0Var.getMeasuredWidth()) - scaleX) - f36);
                                                }
                                                canvas2.translate(ki0Var.getX() + c1Var2.getX(), ki0Var.getY() + c1Var2.getY());
                                                canvas2.scale(ki0Var.getScaleX(), ki0Var.getScaleY(), ki0Var.getPivotX(), ki0Var.getPivotY());
                                                ki0Var.draw(canvas2);
                                                canvas2.restore();
                                            }
                                        }
                                    }
                                    c1Var2 = c1Var3;
                                    canvas2.save();
                                    x10 = ki0Var.getX() + c1Var2.getX();
                                    scaleX = ((ki0Var.getScaleX() * ki0Var.getMeasuredWidth()) - ki0Var.getMeasuredWidth()) / f15;
                                    f21 = x10 - scaleX;
                                    if (f21 >= 0.0f) {
                                    }
                                    if (ki0Var.getMeasuredWidth() + x10 + scaleX > getMeasuredWidth()) {
                                    }
                                    ki0Var.setTranslationX(0.0f - f36);
                                    canvas2.translate(ki0Var.getX() + c1Var2.getX(), ki0Var.getY() + c1Var2.getY());
                                    canvas2.scale(ki0Var.getScaleX(), ki0Var.getScaleY(), ki0Var.getPivotX(), ki0Var.getPivotY());
                                    ki0Var.draw(canvas2);
                                    canvas2.restore();
                                } else {
                                    c1Var2 = c1Var3;
                                    int R2 = RecyclerView.R(ki0Var);
                                    float measuredWidth = (((this.q0 - 1.0f) * ki0Var.getMeasuredWidth()) / 3.0f) - (((1.0f - this.r0) * ki0Var.getMeasuredWidth()) * (Math.abs(this.n0 - R2) - 1));
                                    if (R2 < this.n0) {
                                        ki0Var.setPivotX(0.0f);
                                        ki0Var.setTranslationX(-measuredWidth);
                                    } else {
                                        ki0Var.setPivotX(ki0Var.getMeasuredWidth() - f36);
                                        ki0Var.setTranslationX(measuredWidth - f36);
                                    }
                                    ki0Var.setPivotY(ji0Var.getY() + ji0Var.getMeasuredHeight());
                                    ki0Var.setScaleX(this.r0);
                                    ki0Var.setScaleY(this.r0);
                                    ji0Var3.setVisibility(4);
                                    ji0Var.setAlpha(1.0f);
                                }
                                if (childAt.getLeft() > i21) {
                                    i21 = childAt.getLeft();
                                }
                                if (!this.O0 && (!ki0Var.r || ji0Var.getImageReceiver().B() != null)) {
                                    if ((ki0Var.getMeasuredWidth() / f15) + ki0Var.getX() > 0.0f && (ki0Var.getMeasuredWidth() / f15) + ki0Var.getX() < c1Var2.getWidth()) {
                                        if (!hashSet.contains(ki0Var)) {
                                            ki0Var.c(abs);
                                            abs += 30;
                                        }
                                        hashSet2.add(ki0Var);
                                    } else if (!ki0Var.n) {
                                        ki0Var.d();
                                    }
                                }
                            } else {
                                i14 = save3;
                                rectF4 = rectF;
                                i15 = i20;
                                c1Var2 = c1Var3;
                                if (childAt == this.S) {
                                    if ((childAt.getMeasuredWidth() / f15) + childAt.getX() <= 0.0f || (childAt.getMeasuredWidth() / f15) + childAt.getX() >= c1Var2.getWidth()) {
                                        ug.a1 a1Var = this.v0;
                                        f18 = 0.0f;
                                        a1Var.setScaleX(0.0f);
                                        a1Var.setScaleY(0.0f);
                                        if (childAt == this.T) {
                                            if ((childAt.getMeasuredWidth() / f15) + childAt.getX() <= f18 || (childAt.getMeasuredWidth() / f15) + childAt.getX() >= c1Var2.getWidth()) {
                                                gr grVar = this.w0;
                                                grVar.setScaleX(0.0f);
                                                grVar.setScaleY(0.0f);
                                                ((mi0) grVar.c).T.invalidate();
                                                ValueAnimator valueAnimator = (ValueAnimator) grVar.b;
                                                if (valueAnimator != null) {
                                                    valueAnimator.cancel();
                                                }
                                            } else {
                                                if (!hashSet.contains(childAt)) {
                                                    if (this.w != 1.0f) {
                                                        gr grVar2 = this.w0;
                                                        grVar2.setScaleX(0.0f);
                                                        grVar2.setScaleY(0.0f);
                                                        ((mi0) grVar2.c).T.invalidate();
                                                        ValueAnimator valueAnimator2 = (ValueAnimator) grVar2.b;
                                                        if (valueAnimator2 != null) {
                                                            valueAnimator2.cancel();
                                                        }
                                                    }
                                                    gr grVar3 = this.w0;
                                                    boolean z12 = org.telegram.messenger.qc.e(8200) || org.telegram.messenger.gz.o() >= 1;
                                                    grVar3.invalidate();
                                                    ValueAnimator valueAnimator3 = (ValueAnimator) grVar3.b;
                                                    if (valueAnimator3 != null) {
                                                        valueAnimator3.removeAllListeners();
                                                        ((ValueAnimator) grVar3.b).cancel();
                                                    }
                                                    if (z12) {
                                                        ValueAnimator ofFloat = ValueAnimator.ofFloat(grVar3.getScaleX(), 1.0f);
                                                        grVar3.b = ofFloat;
                                                        ofFloat.setInterpolator(org.telegram.messenger.g0.H);
                                                        ((ValueAnimator) grVar3.b).addUpdateListener(new f60(grVar3, 6));
                                                        ((ValueAnimator) grVar3.b).setStartDelay((long) (abs * ((mi0) grVar3.c).c));
                                                        ((ValueAnimator) grVar3.b).setDuration(300L);
                                                        ((ValueAnimator) grVar3.b).start();
                                                    } else {
                                                        grVar3.setScaleX(1.0f);
                                                        grVar3.setScaleY(1.0f);
                                                    }
                                                    abs += 30;
                                                }
                                                hashSet2.add(childAt);
                                            }
                                        }
                                        R = RecyclerView.R(childAt);
                                        float measuredWidth2 = (((this.q0 - 1.0f) * childAt.getMeasuredWidth()) / 3.0f) - (((1.0f - this.r0) * childAt.getMeasuredWidth()) * (Math.abs(this.n0 - R) - 1));
                                        if (R >= this.n0) {
                                            childAt.setPivotX(0.0f);
                                            childAt.setTranslationX(-measuredWidth2);
                                        } else {
                                            childAt.setPivotX(childAt.getMeasuredWidth());
                                            childAt.setTranslationX(measuredWidth2);
                                        }
                                        childAt.setScaleX(this.r0);
                                        childAt.setScaleY(this.r0);
                                    } else {
                                        if (!hashSet.contains(childAt)) {
                                            if (this.w != 1.0f) {
                                                ug.a1 a1Var2 = this.v0;
                                                f19 = 0.0f;
                                                a1Var2.setScaleX(0.0f);
                                                a1Var2.setScaleY(0.0f);
                                            } else {
                                                f19 = 0.0f;
                                            }
                                            ug.a1 a1Var3 = this.v0;
                                            org.telegram.ui.Components.voip.n nVar = a1Var3.K;
                                            if (nVar != null) {
                                                nVar.g = f19;
                                                nVar.j = false;
                                            }
                                            a1Var3.invalidate();
                                            a1Var3.animate().scaleX(1.1f).scaleY(1.1f).setStartDelay(abs).setInterpolator(org.telegram.messenger.g0.H).setDuration(300L);
                                            abs += 30;
                                        }
                                        hashSet2.add(childAt);
                                    }
                                }
                                f18 = 0.0f;
                                if (childAt == this.T) {
                                }
                                R = RecyclerView.R(childAt);
                                float measuredWidth22 = (((this.q0 - 1.0f) * childAt.getMeasuredWidth()) / 3.0f) - (((1.0f - this.r0) * childAt.getMeasuredWidth()) * (Math.abs(this.n0 - R) - 1));
                                if (R >= this.n0) {
                                }
                                childAt.setScaleX(this.r0);
                                childAt.setScaleY(this.r0);
                            }
                            i22 = abs;
                            i20 = i15 + 1;
                            canvas2 = canvas;
                            f26 = f35;
                            save3 = i14;
                            c1Var3 = c1Var2;
                            rectF = rectF4;
                            i11 = 1;
                        }
                        i12 = save3;
                        rectF2 = rectF;
                        c1Var = c1Var3;
                        f17 = f26;
                        ki0 ki0Var2 = this.A0;
                        if (pullingLeftProgress > 0.0f) {
                            float pullingLeftProgress2 = getPullingLeftProgress();
                            int measuredWidth3 = ki0Var2.getMeasuredWidth() - org.telegram.messenger.g0.L(f15);
                            float f37 = i21 + measuredWidth3;
                            float i23 = Utilities.i(f37 / (getMeasuredWidth() - ki0Var2.getMeasuredWidth()), 1.0f, 0.0f) * pullingLeftProgress2 * measuredWidth3;
                            if (ki0Var2.getTag() == null) {
                                ki0Var2.setTag(Float.valueOf(1.0f));
                                ki0Var2.d();
                                ki0Var2.c(0);
                            }
                            float i24 = Utilities.i(pullingLeftProgress2, 1.0f, 0.0f);
                            ki0Var2.setScaleX(i24);
                            ki0Var2.setScaleY(i24);
                            i13 = 1;
                            ki0Var2.setTranslationX(((c1Var.getX() + f37) - i23) + (-((i19 == 1 || i19 == 2) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(20.0f))));
                            if (ki0Var2.getVisibility() != 0) {
                                ki0Var2.setVisibility(0);
                            }
                        } else {
                            i13 = 1;
                            if (ki0Var2.getVisibility() != 8 && this.P0) {
                                ki0Var2.setVisibility(8);
                            }
                            if (ki0Var2.getTag() != null) {
                                ki0Var2.setTag(null);
                            }
                        }
                        if (!this.e1 && this.y0 != null) {
                            int A = (int) org.telegram.messenger.k5.A(1.0f, this.x0, Utilities.i(1.0f - (this.x0 / 0.2f), 1.0f, 0.0f), f13);
                            canvas.save();
                            f(f25, max2, f17, A, canvas);
                            canvas.restore();
                            return;
                        }
                        float f38 = f17;
                        q10 = q();
                        if (!q10) {
                            canvas.clipPath(path);
                        }
                        if (!org.telegram.messenger.hd.a0 || this.N) {
                            i13 = -1;
                        }
                        canvas.translate((1.0f - this.w) * getWidth() * i13, 0.0f);
                        c1Var.setTranslationX(-width2);
                        super.dispatchDraw(canvas);
                        if (!q10) {
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
                        canvas.restoreToCount(i12);
                        f(f25, max2, f38, org.telegram.messenger.ns.e4, canvas);
                        invalidate();
                    }
                }
                i12 = save3;
                rectF2 = rectF;
                c1Var = c1Var3;
                i13 = i11;
                f17 = f26;
                if (!this.e1) {
                }
                float f382 = f17;
                q10 = q();
                if (!q10) {
                }
                if (!org.telegram.messenger.hd.a0) {
                }
                i13 = -1;
                canvas.translate((1.0f - this.w) * getWidth() * i13, 0.0f);
                c1Var.setTranslationX(-width2);
                super.dispatchDraw(canvas);
                if (!q10) {
                }
                canvas.restoreToCount(i12);
                f(f25, max2, f382, org.telegram.messenger.ns.e4, canvas);
                invalidate();
            }
        }
        if (!z10) {
            float f39 = this.P;
            if (f39 != 0.0f) {
                this.P = org.telegram.ui.Cells.y0.z(min, 220.0f, f39, 0.0f);
                invalidate();
            }
        }
        z70Var = this.S0;
        if (z70Var != null) {
        }
        float max22 = (Math.max(0.25f, Math.min(this.w, 1.0f)) - 0.25f) / 0.75f;
        float f252 = this.F * max22;
        float f262 = this.G * max22;
        HashSet hashSet3 = this.E0;
        hashSet3.clear();
        HashSet hashSet22 = this.D0;
        hashSet3.addAll(hashSet22);
        hashSet22.clear();
        if (this.d1) {
        }
        p0Var = this.m0;
        i7 = this.N0;
        if (p0Var != null) {
            f23 = this.o0;
            if (f23 != 1.0f) {
            }
        }
        p0Var2 = this.m0;
        if (p0Var2 == null) {
        }
        float f272 = this.o0;
        this.q0 = (f272 * 2.0f) + 1.0f;
        this.r0 = 1.0f - (f272 * 0.15f);
        int save4 = canvas2.save();
        if (org.telegram.messenger.hd.a0) {
        }
        width = getWidth();
        f10 = 0.125f;
        float f282 = width * f10;
        f11 = this.w;
        if (f11 != 1.0f) {
        }
        if (org.telegram.messenger.hd.a0) {
        }
        max = Math.max(0.25f, this.w);
        f12 = 0.0f;
        float pullingLeftProgress3 = getPullingLeftProgress();
        float g102 = g();
        loVar = this.f1;
        if (loVar != null) {
        }
        float width22 = (getWidth() - getPaddingRight()) * Math.min(1.0f, f12);
        float topOffset2 = getTopOffset();
        float paddingTop2 = getPaddingTop();
        di.c1 c1Var32 = this.b;
        float f292 = f12;
        float f302 = max;
        RectF rectF52 = this.x;
        rectF52.set(getPaddingLeft() + width22, (((1.0f - this.r0) * c1Var32.getMeasuredHeight()) + paddingTop2) - g102, (getWidth() - getPaddingRight()) * max, (getHeight() - getPaddingBottom()) + g102);
        this.E = com.google.android.gms.internal.vision.e2.w(g102, 2.0f, rectF52.height() - topOffset2, 2.0f);
        if (i7 == 1) {
        }
        canvas2.restoreToCount(save4);
        if (this.e1) {
        }
        Path path2 = this.y;
        path2.rewind();
        float f342 = this.E;
        path2.addRoundRect(rectF, f342, f342, Path.Direction.CW);
        int save32 = canvas2.save();
        f16 = this.w;
        if (f16 != 1.0f) {
        }
        if (this.w != 0.0f) {
        }
        i12 = save32;
        rectF2 = rectF;
        c1Var = c1Var32;
        i13 = i11;
        f17 = f262;
        if (!this.e1) {
        }
        float f3822 = f17;
        q10 = q();
        if (!q10) {
        }
        if (!org.telegram.messenger.hd.a0) {
        }
        i13 = -1;
        canvas.translate((1.0f - this.w) * getWidth() * i13, 0.0f);
        c1Var.setTranslationX(-width22);
        super.dispatchDraw(canvas);
        if (!q10) {
        }
        canvas.restoreToCount(i12);
        f(f252, max22, f3822, org.telegram.messenger.ns.e4, canvas);
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
        ch.b0 b0Var = this.y0;
        if (b0Var != null) {
            b0Var.d();
        }
    }

    public final void f(float f10, float f11, float f12, int i7, Canvas canvas) {
        float f13;
        if (this.N0 == 1) {
            return;
        }
        canvas.save();
        boolean z10 = this.M;
        RectF rectF = this.x;
        if (z10) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), (org.telegram.messenger.g0.T1(rectF.top, getMeasuredHeight(), er.f.getInterpolation(this.P)) - ((int) Math.ceil((1.0f - this.w) * (rectF.height() / 2.0f)))) + 1.0f);
        } else {
            float f14 = rectF.bottom;
            er erVar = er.f;
            canvas.clipRect(0.0f, (org.telegram.messenger.g0.T1(f14, 0.0f, erVar.getInterpolation(this.P)) - ((int) Math.ceil((1.0f - this.w) * (rectF.height() / 2.0f)))) - 1.0f, getMeasuredWidth(), org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(8.0f) + getMeasuredHeight(), getPaddingTop() - g(), erVar.getInterpolation(this.P)));
        }
        float width = ((org.telegram.messenger.hd.a0 || this.N) ? this.H : getWidth() - this.H) + this.V0;
        float paddingTop = this.M ? getPaddingTop() - g() : (getHeight() - getPaddingBottom()) + g();
        int L = org.telegram.messenger.g0.L(3.0f);
        Drawable drawable = this.j0;
        drawable.setAlpha(i7);
        Paint paint = this.f;
        paint.setAlpha(i7);
        float f15 = width - f10;
        float f16 = L;
        float f17 = f16 * f11;
        float f18 = paddingTop - f10;
        float f19 = width + f10;
        float f20 = paddingTop + f10;
        drawable.setBounds((int) (f15 - f17), (int) (f18 - f17), (int) (f19 + f17), (int) (f17 + f20));
        drawable.draw(canvas);
        boolean L2 = this.h0.L();
        float f21 = paddingTop;
        RectF rectF2 = this.c0;
        if (L2) {
            rectF2.set(f15, f18, f19, f20);
            f13 = f10;
            this.h0.J(canvas, rectF2, f13, getX(), getY(), i7, false);
        } else {
            f13 = f10;
            if (this.Y0 != null) {
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(f15, f18, f19, f20);
                Rect rect = org.telegram.messenger.g0.Q;
                rectF3.round(rect);
                rect.inset(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
                this.Y0.setBounds(rect);
                this.Y0.setAlpha(paint.getAlpha());
                this.Y0.draw(canvas);
            } else {
                canvas.drawCircle(width, f21, f13, paint);
            }
        }
        boolean z11 = org.telegram.messenger.hd.a0;
        float f22 = this.F;
        float width2 = this.V0 + this.W0 + ((z11 || this.N) ? this.H - f22 : (getWidth() - this.H) + f22);
        boolean z12 = this.M;
        float f23 = this.G;
        float T1 = org.telegram.messenger.g0.T1(z12 ? (getPaddingTop() - g()) - org.telegram.messenger.g0.L(16.0f) : ((getHeight() - f23) - f16) + g(), (f23 + f16) - g(), er.f.getInterpolation(this.P));
        float f24 = (-org.telegram.messenger.g0.L(1.0f)) * f11;
        drawable.setBounds((int) ((width2 - f13) - f24), (int) ((T1 - f13) - f24), (int) (width2 + f13 + f24), (int) (f13 + T1 + f24));
        drawable.draw(canvas);
        if (this.h0.L()) {
            rectF2.set(width2 - f12, T1 - f12, width2 + f12, T1 + f12);
            this.h0.J(canvas, rectF2, f12, getX(), getY(), i7, false);
        } else if (this.Z0 != null) {
            RectF rectF4 = org.telegram.messenger.g0.P;
            rectF4.set(width2 - f12, T1 - f12, width2 + f12, T1 + f12);
            Rect rect2 = org.telegram.messenger.g0.Q;
            rectF4.round(rect2);
            rect2.inset(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
            this.Z0.setBounds(rect2);
            this.Z0.setAlpha(paint.getAlpha());
            this.Z0.draw(canvas);
        } else {
            canvas.drawCircle(width2, T1, f12, paint);
        }
        canvas.restore();
        drawable.setAlpha(org.telegram.messenger.ns.e4);
        paint.setAlpha(org.telegram.messenger.ns.e4);
    }

    public final float g() {
        return (int) (getPullingLeftProgress() * org.telegram.messenger.g0.L(6.0f));
    }

    public li0 getDelegate() {
        return this.h0;
    }

    public int getHintTextWidth() {
        return this.T0;
    }

    public int getItemsCount() {
        return (q() ? 1 : 0) + this.U.size() + 1;
    }

    public float getPullingLeftProgress() {
        return Utilities.i(this.C0 / org.telegram.messenger.g0.L(42.0f), 2.0f, 0.0f);
    }

    public ch.b0 getReactionsWindow() {
        return this.y0;
    }

    public String getSelectedEmoji() {
        TLRPC.Document e10;
        HashSet hashSet = this.e0;
        if (hashSet.isEmpty()) {
            return "";
        }
        ch.p0 p0Var = (ch.p0) hashSet.iterator().next();
        long j3 = p0Var.g;
        String str = null;
        if (j3 != 0 && (e10 = g5.e(this.K, j3)) != null) {
            str = org.telegram.messenger.gj.V(e10, null, null);
        }
        if (TextUtils.isEmpty(str)) {
            str = p0Var.f;
        }
        return TextUtils.isEmpty(str) ? "👍" : str;
    }

    public HashSet<ch.p0> getSelectedReactions() {
        return this.e0;
    }

    public float getTopOffset() {
        if (this.R0) {
            return ((FrameLayout.LayoutParams) this.b.getLayoutParams()).topMargin;
        }
        return 0.0f;
    }

    public int getTotalWidth() {
        int itemsCount = getItemsCount();
        if (q()) {
            return (org.telegram.messenger.g0.L(36.0f) * itemsCount) - org.telegram.messenger.g0.L(4.0f);
        }
        return org.telegram.messenger.g0.L(16.0f) + com.google.android.gms.internal.vision.e2.v(itemsCount, 1, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(36.0f) * itemsCount);
    }

    public List<ch.p0> getVisibleReactionsList() {
        return this.U;
    }

    public int getWindowType() {
        int i7 = this.N0;
        if (i7 == 4) {
            return 13;
        }
        if (i7 == 3) {
            return 11;
        }
        if (i7 == 5) {
            return 14;
        }
        return this.G0 ? 8 : 1;
    }

    public View getWindowView() {
        ch.b0 b0Var = this.y0;
        if (b0Var == null) {
            return null;
        }
        return b0Var.c;
    }

    public final void h(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        int i7 = 0;
        int i10 = this.N0;
        if (i10 == 4) {
            Iterator it = this.e0.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                ch.p0 p0Var = (ch.p0) it.next();
                if (!hashSet.contains(p0Var)) {
                    hashSet.add(p0Var);
                    arrayList.add(p0Var);
                    i11++;
                    if (i11 >= 8) {
                        return;
                    }
                }
            }
            ArrayList arrayList2 = org.telegram.messenger.si.b0(this.K).n;
            while (i7 < arrayList2.size()) {
                ch.p0 c10 = ch.p0.c((TLRPC.TL_availableReaction) arrayList2.get(i7));
                if (!hashSet.contains(c10)) {
                    hashSet.add(c10);
                    arrayList.add(c10);
                    i11++;
                    if (i11 >= 8) {
                        return;
                    }
                }
                i7++;
            }
            return;
        }
        if (!this.F0 || i10 == 4) {
            if (i10 != 3) {
                ArrayList arrayList3 = org.telegram.messenger.si.b0(this.K).n;
                while (i7 < arrayList3.size()) {
                    arrayList.add(ch.p0.c((TLRPC.TL_availableReaction) arrayList3.get(i7)));
                    i7++;
                }
                return;
            }
            ArrayList arrayList4 = org.telegram.messenger.si.b0(this.K).F1;
            int i12 = 0;
            while (i7 < arrayList4.size()) {
                ch.p0 d = ch.p0.d((TLRPC.Reaction) arrayList4.get(i7));
                if (!hashSet.contains(d)) {
                    hashSet.add(d);
                    arrayList.add(d);
                    i12++;
                }
                if (i12 == 16) {
                    return;
                } else {
                    i7++;
                }
            }
            return;
        }
        if (i10 == 5) {
            TLRPC.messages_AvailableEffects E0 = org.telegram.messenger.np.s1(this.K).E0();
            if (E0 != null) {
                while (i7 < E0.effects.size()) {
                    ch.p0 e10 = ch.p0.e(E0.effects.get(i7));
                    if (!hashSet.contains(e10)) {
                        hashSet.add(e10);
                        arrayList.add(e10);
                    }
                    i7++;
                }
                return;
            }
            return;
        }
        ArrayList arrayList5 = i10 == 3 ? org.telegram.messenger.si.b0(this.K).F1 : org.telegram.messenger.si.b0(this.K).E1;
        if (i10 == 3) {
            TLRPC.TL_messages_savedReactionsTags I1 = org.telegram.messenger.np.s1(this.K).I1(0L, false);
            if (I1 != null) {
                for (int i13 = 0; i13 < I1.tags.size(); i13++) {
                    ch.p0 d2 = ch.p0.d(I1.tags.get(i13).reaction);
                    if (!hashSet.contains(d2)) {
                        hashSet.add(d2);
                        arrayList.add(d2);
                    }
                }
            }
            for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                ch.p0 d10 = ch.p0.d((TLRPC.Reaction) arrayList5.get(i14));
                if (!hashSet.contains(d10)) {
                    hashSet.add(d10);
                    arrayList.add(d10);
                }
            }
        } else {
            for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                ch.p0 d11 = ch.p0.d((TLRPC.Reaction) arrayList5.get(i15));
                if (!hashSet.contains(d11) && (i10 == 3 || org.telegram.messenger.m10.i(this.K).q() || d11.g == 0)) {
                    hashSet.add(d11);
                    arrayList.add(d11);
                }
            }
        }
        if (i10 != 3 || org.telegram.messenger.m10.i(this.K).q()) {
            ArrayList arrayList6 = org.telegram.messenger.si.b0(this.K).D1;
            for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                ch.p0 d12 = ch.p0.d((TLRPC.Reaction) arrayList6.get(i16));
                if (!hashSet.contains(d12)) {
                    hashSet.add(d12);
                    arrayList.add(d12);
                }
            }
            ArrayList arrayList7 = org.telegram.messenger.si.b0(this.K).n;
            while (i7 < arrayList7.size()) {
                ch.p0 c11 = ch.p0.c((TLRPC.TL_availableReaction) arrayList7.get(i7));
                if (!hashSet.contains(c11)) {
                    hashSet.add(c11);
                    arrayList.add(c11);
                }
                i7++;
            }
        }
    }

    public void j() {
        int i7 = 0;
        while (true) {
            di.c1 c1Var = this.b;
            if (i7 >= c1Var.getChildCount()) {
                return;
            }
            View childAt = c1Var.getChildAt(i7);
            if (childAt instanceof ki0) {
                ((ki0) childAt).b.invalidate();
            }
            i7++;
        }
    }

    public final void k() {
        int L = org.telegram.messenger.g0.L(24.0f);
        float height = getHeight() / 2.0f;
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.G8, false);
        this.c1 = x02;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.h.setShader(new LinearGradient(0.0f, height, L, height, x02, 0, tileMode));
        this.n.setShader(new LinearGradient(getWidth(), height, getWidth() - L, height, x02, 0, tileMode));
        invalidate();
    }

    public final void l(View view, ch.p0 p0Var, boolean z10) {
        li0 li0Var = this.h0;
        if (li0Var != null) {
            li0Var.h(view, p0Var, z10, true);
        }
        if (this.N0 == 5) {
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    public final void n() {
        this.P0 = true;
        this.n0 = 0;
        this.o0 = 0.0f;
        this.C0 = 0.0f;
        this.m0 = null;
        this.s0 = false;
        xh0 xh0Var = new xh0(this, 1);
        di.c1 c1Var = this.b;
        org.telegram.messenger.g0.d0(c1Var, xh0Var);
        this.D0.clear();
        c1Var.invalidate();
        ai.k0 k0Var = this.T;
        if (k0Var != null) {
            k0Var.invalidate();
        }
        invalidate();
    }

    public final void o(dh.c cVar, gh.e eVar) {
        this.a1 = cVar;
        this.b1 = eVar;
        fh.g c10 = cVar.c(this, null, true);
        c10.p(eVar);
        org.telegram.messenger.i20.r(c10, org.telegram.messenger.g0.L(24.0f), 8.0f);
        this.X0 = c10;
        fh.g c11 = cVar.c(this, null, true);
        c11.p(eVar);
        org.telegram.messenger.i20.r(c11, org.telegram.messenger.g0.L(8.0f), 8.0f);
        this.Y0 = c11;
        fh.g c12 = cVar.c(this, null, true);
        c12.p(eVar);
        org.telegram.messenger.i20.r(c12, org.telegram.messenger.g0.L(4.0f), 8.0f);
        this.Z0 = c12;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.i4);
        org.telegram.messenger.ns.f(this.K).c(this, org.telegram.messenger.ns.T);
        if (this.N0 == 5) {
            org.telegram.messenger.ns.f(this.K).c(this, org.telegram.messenger.ns.u3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.i4);
        org.telegram.messenger.ns.f(this.K).n(this, org.telegram.messenger.ns.T);
        if (this.N0 == 5) {
            org.telegram.messenger.ns.f(this.K).n(this, org.telegram.messenger.ns.u3);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        k();
    }

    public final void p(org.telegram.messenger.gj gjVar, TLRPC.ChatFull chatFull, boolean z10) {
        int i7;
        TLRPC.ChatFull chatFull2;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions2;
        this.I = gjVar;
        if (gjVar == null || (message = gjVar.k) == null || (tL_messageReactions2 = message.reactions) == null) {
            i7 = 0;
        } else {
            ArrayList<TLRPC.ReactionCount> arrayList = tL_messageReactions2.results;
            int size = arrayList.size();
            i7 = 0;
            int i10 = 0;
            while (i10 < size) {
                TLRPC.ReactionCount reactionCount = arrayList.get(i10);
                i10++;
                if (!(reactionCount.reaction instanceof TLRPC.TL_reactionPaid)) {
                    i7++;
                }
            }
        }
        int i11 = this.N0;
        this.J = i11 == 0 && this.I != null && i7 >= org.telegram.messenger.np.s1(this.K).O0(org.telegram.messenger.gj.B0(this.I.k));
        this.B0 = i11 == 0 && this.I != null && org.telegram.messenger.t3.V(org.telegram.messenger.np.s1(this.K).M0(Long.valueOf(-org.telegram.messenger.gj.B0(this.I.k))));
        ArrayList arrayList2 = new ArrayList();
        if (gjVar == null || !gjVar.k3()) {
            chatFull2 = chatFull;
        } else {
            chatFull2 = org.telegram.messenger.np.s1(this.K).N0(-gjVar.Z0());
            if (chatFull2 == null) {
                this.L = -gjVar.Z0();
                org.telegram.messenger.np.s1(this.K).V2(0, -gjVar.Z0(), true);
                setVisibility(4);
                return;
            }
        }
        this.d0 = false;
        if (i11 == 3) {
            this.F0 = org.telegram.messenger.m10.i(this.K).q();
            h(arrayList2);
        } else if (i11 == 5) {
            this.F0 = true;
            h(arrayList2);
        } else if (this.J) {
            this.F0 = false;
            if (chatFull2 != null && chatFull2.paid_reactions_available) {
                this.d0 = true;
                ch.p0 p0Var = new ch.p0();
                p0Var.a = true;
                arrayList2.add(p0Var);
            }
            ArrayList<TLRPC.ReactionCount> arrayList3 = this.I.k.reactions.results;
            int size2 = arrayList3.size();
            int i12 = 0;
            while (i12 < size2) {
                TLRPC.ReactionCount reactionCount2 = arrayList3.get(i12);
                i12++;
                arrayList2.add(ch.p0.d(reactionCount2.reaction));
            }
        } else if (chatFull2 != null) {
            if (chatFull2.paid_reactions_available) {
                this.d0 = true;
                ch.p0 p0Var2 = new ch.p0();
                p0Var2.a = true;
                arrayList2.add(p0Var2);
            }
            TLRPC.ChatReactions chatReactions = chatFull2.available_reactions;
            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                TLRPC.Chat M0 = org.telegram.messenger.np.s1(this.K).M0(Long.valueOf(chatFull2.id));
                if (M0 == null || org.telegram.messenger.t3.V(M0)) {
                    this.F0 = false;
                } else {
                    this.F0 = true;
                }
                h(arrayList2);
            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                ArrayList<TLRPC.Reaction> arrayList4 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                int size3 = arrayList4.size();
                int i13 = 0;
                while (i13 < size3) {
                    TLRPC.Reaction reaction = arrayList4.get(i13);
                    i13++;
                    TLRPC.Reaction reaction2 = reaction;
                    ArrayList arrayList5 = org.telegram.messenger.si.b0(this.K).n;
                    int size4 = arrayList5.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 < size4) {
                            Object obj = arrayList5.get(i14);
                            i14++;
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj;
                            if (!(reaction2 instanceof TLRPC.TL_reactionEmoji) || !tL_availableReaction.reaction.equals(((TLRPC.TL_reactionEmoji) reaction2).emoticon)) {
                                if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                    arrayList2.add(ch.p0.d(reaction2));
                                    break;
                                }
                            } else {
                                arrayList2.add(ch.p0.d(reaction2));
                                break;
                            }
                        }
                    }
                }
            }
        } else {
            this.F0 = true;
            h(arrayList2);
        }
        HashSet hashSet = new HashSet();
        int i15 = 0;
        while (i15 < arrayList2.size()) {
            if (hashSet.contains(arrayList2.get(i15))) {
                i15--;
                arrayList2.remove(i15);
            } else {
                hashSet.add((ch.p0) arrayList2.get(i15));
            }
            i15++;
        }
        this.G0 = !this.J && ((!this.F0 && arrayList2.size() > 16) || (this.F0 && !org.telegram.messenger.m10.i(this.K).q() && org.telegram.messenger.np.s1(this.K).D3()));
        if (i11 == 3 && !org.telegram.messenger.m10.i(this.K).q()) {
            this.G0 = false;
        }
        if (i11 == 4) {
            this.G0 = true;
        }
        ArrayList arrayList6 = this.U;
        arrayList6.clear();
        if (q()) {
            int L = (org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(36.0f)) / org.telegram.messenger.g0.L(34.0f);
            if (L > 7) {
                L = 7;
            }
            int i16 = 0;
            if (L < 1) {
                L = 1;
            }
            while (i16 < Math.min(arrayList2.size(), L)) {
                arrayList6.add((ch.p0) arrayList2.get(i16));
                i16++;
            }
            if (i16 < arrayList2.size()) {
                ki0.a(this.A0, (ch.p0) arrayList2.get(i16), -1);
            }
        } else {
            arrayList6.addAll(arrayList2);
        }
        this.H0 = true;
        for (int i17 = 0; i17 < arrayList6.size(); i17++) {
            if (((ch.p0) arrayList6.get(i17)).g != 0) {
                this.H0 = false;
            }
        }
        ArrayList arrayList7 = this.W;
        arrayList7.clear();
        arrayList7.addAll(arrayList2);
        if (arrayList2.size() * (((getLayoutParams().height - ((int) getTopOffset())) - getPaddingTop()) - getPaddingBottom()) < org.telegram.messenger.g0.L(200.0f)) {
            getLayoutParams().width = -2;
        }
        ci0 ci0Var = this.b0;
        mi0 mi0Var = (mi0) ci0Var.e;
        ArrayList arrayList8 = mi0Var.e;
        ArrayList arrayList9 = mi0Var.U;
        ArrayList arrayList10 = mi0Var.d;
        arrayList8.clear();
        arrayList8.addAll(arrayList10);
        arrayList10.clear();
        for (int i18 = 0; i18 < arrayList9.size(); i18++) {
            ch.p0 p0Var3 = (ch.p0) arrayList9.get(i18);
            arrayList10.add(new di0(p0Var3.f == null ? 3 : 0, p0Var3));
        }
        if (!mi0Var.V.isEmpty() && !org.telegram.messenger.np.s1(mi0Var.K).D3()) {
            arrayList10.add(new di0(1, null));
        }
        if (mi0Var.q()) {
            arrayList10.add(new di0(2, null));
        }
        if (z10) {
            ci0Var.E(arrayList8, arrayList10);
        } else {
            ci0Var.f();
        }
        if (gjVar == null || (tL_messageReactions = gjVar.k.reactions) == null || tL_messageReactions.results == null) {
            return;
        }
        for (int i19 = 0; i19 < gjVar.k.reactions.results.size(); i19++) {
            if (gjVar.k.reactions.results.get(i19).chosen) {
                this.e0.add(ch.p0.d(gjVar.k.reactions.results.get(i19).reaction));
            }
        }
    }

    public final boolean q() {
        return this.F0 || this.G0;
    }

    public final void r(boolean z10) {
        ObjectAnimator duration;
        this.L0 = z10;
        setTransitionProgress(0.0f);
        setAlpha(1.0f);
        this.M0.d();
        boolean j3 = org.telegram.messenger.gz.j();
        org.telegram.ui.Cells.g1 g1Var = m1;
        if (j3) {
            duration = ObjectAnimator.ofFloat(this, g1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            duration = ObjectAnimator.ofFloat(this, g1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        }
        duration.addListener(new zh0(this, 0));
        duration.start();
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        if (getAlpha() != f10 && f10 == 0.0f) {
            this.D0.clear();
            int i7 = 0;
            while (true) {
                di.c1 c1Var = this.b;
                if (i7 >= c1Var.getChildCount()) {
                    break;
                }
                if (c1Var.getChildAt(i7) instanceof ki0) {
                    ((ki0) c1Var.getChildAt(i7)).d();
                }
                i7++;
            }
        }
        super.setAlpha(f10);
    }

    public void setBubbleOffset(float f10) {
        this.V0 = f10;
    }

    public void setChatScrimView(lo loVar) {
        this.f1 = loVar;
    }

    public void setCurrentAccount(int i7) {
        this.K = i7;
    }

    public void setCustomEmojiEnterProgress(float f10) {
        this.x0 = f10;
        lo loVar = this.f1;
        if (loVar != null) {
            loVar.setPopupAlpha(1.0f - f10);
        }
        invalidate();
    }

    public void setCustomEmojiReactionsBackground(boolean z10) {
        if (!z10) {
            this.w0.setBackground(null);
            return;
        }
        gr grVar = this.w0;
        int L = org.telegram.messenger.g0.L(28.0f);
        int i7 = org.telegram.ui.ActionBar.j6.i6;
        org.telegram.ui.ActionBar.q6.Q(grVar, org.telegram.ui.ActionBar.j6.j0(L, 0, i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, i7, false), 40)), null, org.telegram.ui.ActionBar.q6.g(i7, 40), null);
    }

    public void setDelegate(li0 li0Var) {
        this.h0 = li0Var;
    }

    public void setFlippedVertically(boolean z10) {
        this.O = z10;
        invalidate();
    }

    public void setFragment(org.telegram.ui.ActionBar.e2 e2Var) {
        this.u0 = e2Var;
    }

    public void setHint(CharSequence charSequence) {
        this.R0 = true;
        if (this.S0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.e6 e6Var = this.l0;
            z70 z70Var = new z70(context, e6Var);
            this.S0 = z70Var;
            z70Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
            this.S0.setClickable(true);
            this.S0.setTextSize(1, 12.0f);
            int i7 = this.N0;
            if (i7 == 1 || i7 == 2 || i7 == 4) {
                org.telegram.ui.ActionBar.q6.U(this.S0, org.telegram.ui.ActionBar.j6.G6, e6Var);
                this.S0.setAlpha(0.5f);
            } else {
                org.telegram.ui.ActionBar.q6.U(this.S0, org.telegram.ui.ActionBar.j6.z6, e6Var);
            }
            this.S0.setGravity(1);
            addView(this.S0, c8.ja.d(-1, -2.0f, 0, 0.0f, 6.0f, 0.0f, 0.0f));
        }
        this.S0.setText(charSequence);
        this.g1 = false;
        ((FrameLayout.LayoutParams) this.A0.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(20.0f);
        ((FrameLayout.LayoutParams) this.b.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(20.0f);
    }

    public void setMiniBubblesOffset(float f10) {
        this.W0 = f10;
    }

    public void setMirrorX(boolean z10) {
        this.N = z10;
        invalidate();
    }

    public void setOnSwitchedToLoopView(Runnable runnable) {
        this.Q0 = runnable;
    }

    public void setParentLayout(lo loVar) {
        this.K0 = loVar;
    }

    public void setSelectedEmojis(ArrayList<String> arrayList) {
        HashSet hashSet = this.e0;
        hashSet.clear();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            String str = arrayList.get(i7);
            i7++;
            ch.p0 b10 = ch.p0.b(str);
            hashSet.add(b10);
            this.f0.add(b10);
        }
        org.telegram.messenger.g0.d0(this.b, new xh0(this, 0));
    }

    public void setSelectedReaction(ch.p0 p0Var) {
        HashSet hashSet = this.e0;
        hashSet.clear();
        if (p0Var != null) {
            hashSet.add(p0Var);
        }
        this.b0.f();
    }

    public void setSelectedReactionAnimated(ch.p0 p0Var) {
        HashSet hashSet = this.e0;
        hashSet.clear();
        if (p0Var != null) {
            hashSet.add(p0Var);
        }
        org.telegram.messenger.g0.d0(this.b, new xh0(this, 0));
    }

    public void setSelectedReactionInclusive(ch.p0 p0Var) {
        HashSet hashSet = this.e0;
        hashSet.clear();
        if (p0Var != null) {
            hashSet.add(p0Var);
        }
        org.telegram.messenger.g0.d0(this.b, new xh0(this, 0));
    }

    public void setSelectedReactions(ArrayList<org.telegram.messenger.gj> arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        HashSet hashSet = this.e0;
        hashSet.clear();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            org.telegram.messenger.gj gjVar = arrayList.get(i7);
            if (gjVar != null && (tL_messageReactions = gjVar.k.reactions) != null && tL_messageReactions.results != null) {
                for (int i10 = 0; i10 < gjVar.k.reactions.results.size(); i10++) {
                    if (gjVar.k.reactions.results.get(i10).chosen) {
                        hashSet.add(ch.p0.d(gjVar.k.reactions.results.get(i10).reaction));
                    }
                }
            }
        }
        this.b0.f();
    }

    public void setSelectedReactionsInclusive(ArrayList<org.telegram.messenger.gj> arrayList) {
        HashSet hashSet = this.e0;
        hashSet.clear();
        hashSet.addAll(i(arrayList));
        org.telegram.messenger.g0.d0(this.b, new xh0(this, 0));
    }

    public void setSkipDraw(boolean z10) {
        if (this.e1 != z10) {
            this.e1 = z10;
            if (!z10) {
                int i7 = 0;
                while (true) {
                    di.c1 c1Var = this.b;
                    if (i7 >= c1Var.getChildCount()) {
                        break;
                    }
                    if (c1Var.getChildAt(i7) instanceof ki0) {
                        ki0 ki0Var = (ki0) c1Var.getChildAt(i7);
                        boolean z11 = ki0Var.r;
                        ji0 ji0Var = ki0Var.b;
                        if (z11 && (ji0Var.getImageReceiver().B() != null || ji0Var.getImageReceiver().m() != null)) {
                            ji0Var.setVisibility(0);
                            ki0Var.a.setVisibility(4);
                            if (ki0Var.s) {
                                ki0Var.w = true;
                            }
                        }
                        ki0Var.invalidate();
                    }
                    i7++;
                }
            }
            invalidate();
        }
    }

    public void setStoryItem(TL_stories.StoryItem storyItem) {
        TLRPC.Reaction reaction;
        HashSet hashSet = this.e0;
        hashSet.clear();
        if (storyItem != null && (reaction = storyItem.sent_reaction) != null) {
            hashSet.add(ch.p0.d(reaction));
        }
        this.b0.f();
    }

    public void setTop(boolean z10) {
        this.M = z10;
    }

    public void setTransitionProgress(float f10) {
        this.w = f10;
        lo loVar = this.K0;
        if (loVar != null) {
            if (!this.L0 || !org.telegram.messenger.gz.j()) {
                f10 = 1.0f;
            }
            loVar.setReactionsTransitionProgress(f10);
        }
        invalidate();
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        if (f10 != getTranslationX()) {
            super.setTranslationX(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int w02;
        Paint paint = this.f;
        if (paint != null) {
            try {
                int i7 = this.N0;
                if (i7 != 2 && i7 != 4 && paint.getColor() != (w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G8, this.l0))) {
                    int alpha = paint.getAlpha();
                    paint.setColor(w02);
                    paint.setAlpha(alpha);
                    invalidate();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        ug.a1 a1Var = this.v0;
        if (a1Var != null) {
            a1Var.setColor(i0.a.f(0.7f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.F8, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.h5, false)));
        }
        if (getWidth() <= 0 || getHeight() <= 0 || this.c1 == org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.G8, false)) {
            return;
        }
        k();
    }

    public void m() {
    }
}
