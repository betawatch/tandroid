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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class li0 extends FrameLayout implements org.telegram.messenger.cs, org.telegram.ui.ActionBar.z5 {
    public static final org.telegram.ui.Cells.g1 m1 = new org.telegram.ui.Cells.g1(Float.class, "transitionProgress", 2);
    public final ji0 A0;
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
    public org.telegram.messenger.zi I;
    public final Paint I0;
    public boolean J;
    public final Paint J0;
    public int K;
    public ao K0;
    public long L;
    public boolean L0;
    public boolean M;
    public final g2.g M0;
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
    public s70 S0;
    public ai.c0 T;
    public int T0;
    public final ArrayList U;
    public int U0;
    public final ArrayList V;
    public float V0;
    public final ArrayList W;
    public float W0;
    public gh.g X0;
    public gh.g Y0;
    public gh.g Z0;
    public boolean a;
    public final kg.f0 a0;
    public eh.c a1;
    public final ci.j1 b;
    public final bi0 b0;
    public hh.e b1;
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
    public ao f1;
    public final int[] g0;
    public boolean g1;
    public final Paint h;
    public ki0 h0;
    public boolean h1;
    public final Rect i0;
    public boolean i1;
    public final Drawable j0;
    public Paint j1;
    public final boolean k0;
    public Matrix k1;
    public final org.telegram.ui.ActionBar.e6 l0;
    public LinearGradient l1;
    public dh.n0 m0;
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
    public org.telegram.ui.ActionBar.d2 u0;
    public vg.y0 v0;
    public float w;
    public zq w0;
    public final RectF x;
    public float x0;
    public final Path y;
    public dh.a0 y0;
    public ValueAnimator z0;

    public li0(int i3, int i10, Context context, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.e6 e6Var) {
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
        this.M0 = new g2.g((int[]) null);
        this.P0 = true;
        this.h1 = false;
        this.N0 = i3;
        this.c = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        paint2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, e6Var));
        paint3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.xk, e6Var));
        this.l0 = e6Var;
        this.K = i10;
        this.u0 = d2Var;
        ji0 ji0Var = new ji0(this, context);
        this.A0 = ji0Var;
        ji0Var.setVisibility(8);
        ji0Var.P = false;
        ji0Var.c.setVisibility(8);
        addView(ji0Var);
        this.k0 = org.telegram.messenger.az.c() && org.telegram.messenger.az.o() != 0;
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.j0 = mutate;
        int L2 = org.telegram.messenger.g0.L(7.0f);
        rect.bottom = L2;
        rect.right = L2;
        rect.top = L2;
        rect.left = L2;
        org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.He, null, PorterDuff.Mode.MULTIPLY);
        ci.j1 j1Var = new ci.j1(22, context, this);
        this.b = j1Var;
        j1Var.setClipChildren(false);
        j1Var.setClipToPadding(false);
        kg.f0 f0Var = new kg.f0((ViewGroup) this, 4);
        this.a0 = f0Var;
        j1Var.i(new xh0(this, i11));
        j1Var.setLayoutManager(f0Var);
        j1Var.setOverScrollMode(2);
        bi0 bi0Var = new bi0(this, i11);
        this.b0 = bi0Var;
        j1Var.setAdapter(bi0Var);
        j1Var.j(new fi0(this));
        j1Var.j(new ji(this, 14));
        j1Var.i(new xh0(this, i12));
        j1Var.setOnItemClickListener(new k(this, 11));
        j1Var.setOnItemLongClickListener((hj0) new k2.q(this, i3, 9));
        addView(j1Var, b8.mf.c(-1.0f, -1));
        setClipChildren(false);
        setClipToPadding(false);
        k();
        int paddingTop = (j1Var.getLayoutParams().height - j1Var.getPaddingTop()) - j1Var.getPaddingBottom();
        ji0Var.getLayoutParams().width = paddingTop - org.telegram.messenger.g0.L(12.0f);
        ji0Var.getLayoutParams().height = paddingTop;
        if (i3 == 2 || i3 == 4) {
            paint.setColor(i0.a.f(0.13f, -16777216, -1));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, e6Var));
        }
        org.telegram.messenger.li.b0(i10).k1();
    }

    public static void a(li0 li0Var) {
        if (li0Var.y0 != null) {
            return;
        }
        dh.a0 a0Var = new dh.a0(li0Var.N0, li0Var.u0, li0Var.W, li0Var.e0, li0Var, li0Var.l0, li0Var.a);
        li0Var.y0 = a0Var;
        eh.c cVar = li0Var.a1;
        boolean z10 = true;
        if (cVar != null) {
            hh.e eVar = li0Var.b1;
            org.telegram.ui.yz0 yz0Var = a0Var.m.g0;
            yz0Var.y = true;
            yz0Var.setBackground(null);
            yz0Var.updateColors();
            yz0Var.invalidate();
            gh.g c2 = cVar.c(a0Var.a, null, true);
            c2.p(eVar);
            org.telegram.messenger.camera.q.p(c2, org.telegram.messenger.g0.L(12.0f), 8.0f);
            a0Var.z = c2;
        }
        dh.a0 a0Var2 = li0Var.y0;
        ki0 ki0Var = li0Var.h0;
        if (ki0Var != null && !ki0Var.r()) {
            z10 = false;
        }
        a0Var2.m.setLongPressEnabled(z10);
        li0Var.j();
        li0Var.y0.p = new jb0(li0Var, 13);
        li0Var.m();
    }

    public static void b(li0 li0Var, View view, float f10) {
        if (view instanceof ji0) {
            ((ji0) view).h = f10;
        } else {
            view.setScaleX(f10);
            view.setScaleY(f10);
        }
    }

    public static boolean c() {
        return org.telegram.messenger.az.j();
    }

    public static HashSet i(ArrayList arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        LongSparseArray longSparseArray = new LongSparseArray();
        HashSet hashSet = new HashSet();
        boolean z10 = true;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i3);
            hashSet.clear();
            if (ziVar != null && (tL_messageReactions = ziVar.k.reactions) != null && tL_messageReactions.results != null) {
                for (int i10 = 0; i10 < ziVar.k.reactions.results.size(); i10++) {
                    if (ziVar.k.reactions.results.get(i10).chosen) {
                        dh.n0 d = dh.n0.d(ziVar.k.reactions.results.get(i10).reaction);
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
            i3++;
            z10 = false;
        }
        HashSet hashSet2 = new HashSet();
        for (int i12 = 0; i12 < longSparseArray.size(); i12++) {
            if (longSparseArray.valueAt(i12) != null) {
                hashSet2.add((dh.n0) longSparseArray.valueAt(i12));
            }
        }
        return hashSet2;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.F8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.h5));
    }

    public final void d(boolean z10) {
        dh.a0 a0Var = this.y0;
        if (a0Var != null) {
            if (!a0Var.q || !z10) {
                a0Var.q = true;
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    int i3 = 0;
                    ofFloat.addUpdateListener(new dh.t(a0Var, i3));
                    ofFloat.addListener(new dh.y(a0Var, i3));
                    ofFloat.setDuration(150L);
                    ofFloat.start();
                } else {
                    a0Var.f();
                }
            }
            this.y0 = null;
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id != this.L || getVisibility() == 0 || (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) {
                return;
            }
            p(this.I, null, true);
            setVisibility(0);
            r(false);
            return;
        }
        if (i3 != org.telegram.messenger.hs.i4) {
            if (i3 == org.telegram.messenger.hs.u3) {
                p(this.I, null, true);
            }
        } else {
            if (this.N0 != 4) {
                return;
            }
            invalidate();
            ci.j1 j1Var = this.b;
            j1Var.invalidate();
            j1Var.g1();
            for (int i11 = 0; i11 < j1Var.getChildCount(); i11++) {
                View childAt = j1Var.getChildAt(i11);
                if (childAt instanceof ji0) {
                    ji0 ji0Var = (ji0) childAt;
                    ji0Var.a.invalidate();
                    ji0Var.b.invalidate();
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
        s70 s70Var;
        dh.n0 n0Var;
        int i3;
        dh.n0 n0Var2;
        float width;
        float f10;
        float f11;
        float max;
        float f12;
        ao aoVar;
        float f13;
        int i10;
        float f14;
        RectF rectF;
        int i11;
        float f15;
        float f16;
        int i12;
        RectF rectF2;
        ci.j1 j1Var;
        int i13;
        float f17;
        boolean q10;
        RectF rectF3;
        int i14;
        RectF rectF4;
        int i15;
        ci.j1 j1Var2;
        float f18;
        int R;
        float f19;
        float f20;
        float x10;
        float scaleX;
        float f21;
        float f22;
        g5 g5Var;
        ei.c3 c3Var;
        int i16;
        ki0 ki0Var;
        float f23;
        Canvas canvas2 = canvas;
        long min = Math.min(16L, System.currentTimeMillis() - this.Q);
        this.Q = System.currentTimeMillis();
        boolean z10 = this.O;
        if (z10) {
            float f24 = this.P;
            if (f24 != 1.0f) {
                this.P = org.telegram.ui.Cells.f1.h(min, 220.0f, f24, 1.0f);
                invalidate();
                s70Var = this.S0;
                if (s70Var != null) {
                    s70Var.setTranslationY(-g());
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
                n0Var = this.m0;
                i3 = this.N0;
                if (n0Var != null && i3 != 5 && ((ki0Var = this.h0) == null || ki0Var.r())) {
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
                n0Var2 = this.m0;
                if (n0Var2 == null && n0Var2.a) {
                    this.q0 = 1.0f;
                    this.r0 = 1.0f;
                } else {
                    float f27 = this.o0;
                    this.q0 = (f27 * 2.0f) + 1.0f;
                    this.r0 = 1.0f - (f27 * 0.15f);
                }
                int save = canvas2.save();
                if (!org.telegram.messenger.bd.a0 || this.N) {
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
                if (!org.telegram.messenger.bd.a0 || this.N) {
                    max = Math.max(0.25f, this.w);
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f - Math.max(0.25f, this.w);
                    max = 1.0f;
                }
                float pullingLeftProgress = getPullingLeftProgress();
                float g7 = g();
                aoVar = this.f1;
                if (aoVar != null) {
                    aoVar.setExpandSize(g7);
                }
                float width2 = (getWidth() - getPaddingRight()) * Math.min(1.0f, f12);
                float topOffset = getTopOffset();
                float paddingTop = getPaddingTop();
                ci.j1 j1Var3 = this.b;
                float f29 = f12;
                float f30 = max;
                RectF rectF5 = this.x;
                rectF5.set(getPaddingLeft() + width2, (((1.0f - this.r0) * j1Var3.getMeasuredHeight()) + paddingTop) - g7, (getWidth() - getPaddingRight()) * max, (getHeight() - getPaddingBottom()) + g7);
                this.E = com.google.android.recaptcha.internal.a.c(g7, 2.0f, rectF5.height() - topOffset, 2.0f);
                if (i3 == 1) {
                    f13 = 255.0f;
                    int i17 = (int) (Utilities.i(1.0f - (this.x0 / 0.05f), 1.0f, 0.0f) * 255.0f);
                    Drawable drawable = this.j0;
                    drawable.setAlpha(i17);
                    float paddingLeft = getPaddingLeft();
                    int width3 = getWidth() - getPaddingRight();
                    Rect rect = this.i0;
                    int i18 = (int) g7;
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
                    if (i3 == 1 || this.h0.O()) {
                        i16 = save2;
                        i10 = i3;
                        rectF = rectF5;
                        f14 = f28;
                        i11 = 1;
                        this.h0.E(canvas, rectF, this.E, getX(), getY(), org.telegram.messenger.hs.e4, false);
                        canvas2 = canvas;
                    } else {
                        gh.g gVar = this.X0;
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
                        i10 = i3;
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
                                    int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.xk, this.l0);
                                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(64.0f), 0.0f, new int[]{w02, org.telegram.ui.ActionBar.k6.r1(0.0f, w02)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                                    this.l1 = linearGradient;
                                    this.j1.setShader(linearGradient);
                                }
                                this.k1.reset();
                                this.k1.postTranslate(rectF.left, rectF.top);
                                this.l1.setLocalMatrix(this.k1);
                                this.j1.setAlpha((int) (l10 * f13));
                                canvas2.drawRoundRect(rectF, f33, f33, this.j1);
                            } else if (((dh.n0) it.next()).a) {
                                break;
                            }
                        }
                    }
                    canvas2.restoreToCount(i16);
                } else {
                    i10 = i3;
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
                        while (i20 < j1Var3.getChildCount()) {
                            View childAt = j1Var3.getChildAt(i20);
                            boolean z11 = i11;
                            int abs = (this.w == 1.0f || !org.telegram.messenger.az.j()) ? i22 : (int) (Math.abs((((childAt.getMeasuredWidth() / f15) + childAt.getLeft()) / j1Var3.getMeasuredWidth()) - 0.8f) * 200.0f);
                            float f35 = f26;
                            if (childAt instanceof ji0) {
                                ji0 ji0Var = (ji0) j1Var3.getChildAt(i20);
                                i15 = i20;
                                if (this.C0 != 0.0f) {
                                    i14 = save3;
                                    f20 = org.telegram.messenger.g0.L(46.0f) * Utilities.i(ji0Var.getLeft() / (getMeasuredWidth() - org.telegram.messenger.g0.L(34.0f)), 1.0f, 0.0f) * getPullingLeftProgress();
                                } else {
                                    i14 = save3;
                                    f20 = 0.0f;
                                }
                                dh.n0 n0Var3 = ji0Var.e;
                                ii0 ii0Var = ji0Var.a;
                                float f36 = f20;
                                ii0 ii0Var2 = ji0Var.b;
                                ii0 ii0Var3 = ji0Var.c;
                                rectF4 = rectF;
                                if (n0Var3.equals(this.m0)) {
                                    ii0 ii0Var4 = ii0Var2.getVisibility() == 0 ? ii0Var2 : ii0Var;
                                    ji0Var.setPivotX(ji0Var.getMeasuredWidth() >> 1);
                                    ji0Var.setPivotY(ii0Var4.getY() + ii0Var4.getMeasuredHeight());
                                    ji0Var.setScaleX(this.q0);
                                    ji0Var.setScaleY(this.q0);
                                    if (!this.s0) {
                                        if (this.R == null) {
                                            ii0Var3.setVisibility(0);
                                            ii0Var3.setAlpha(1.0f);
                                            if (ii0Var3.getImageReceiver().I() || ((g5Var = ii0Var3.e) != null && (c3Var = g5Var.k) != null && c3Var.I())) {
                                                ii0Var4.setAlpha(0.0f);
                                            }
                                            f22 = 1.0f;
                                        } else {
                                            f22 = 1.0f;
                                            ii0Var3.setAlpha(1.0f - this.p0);
                                            ii0Var4.setAlpha(this.p0);
                                        }
                                        if (this.o0 == f22) {
                                            this.s0 = z11;
                                            if (System.currentTimeMillis() - this.t0 > 300) {
                                                this.t0 = System.currentTimeMillis();
                                                j1Var2 = j1Var3;
                                                this.h0.z(ji0Var, ji0Var.e, true, false);
                                                canvas2.save();
                                                x10 = ji0Var.getX() + j1Var2.getX();
                                                scaleX = ((ji0Var.getScaleX() * ji0Var.getMeasuredWidth()) - ji0Var.getMeasuredWidth()) / f15;
                                                f21 = x10 - scaleX;
                                                if (f21 >= 0.0f && ji0Var.getTranslationX() >= 0.0f) {
                                                    ji0Var.setTranslationX((-f21) - f36);
                                                } else if (ji0Var.getMeasuredWidth() + x10 + scaleX > getMeasuredWidth() || ji0Var.getTranslationX() > 0.0f) {
                                                    ji0Var.setTranslationX(0.0f - f36);
                                                } else {
                                                    ji0Var.setTranslationX((((getMeasuredWidth() - x10) - ji0Var.getMeasuredWidth()) - scaleX) - f36);
                                                }
                                                canvas2.translate(ji0Var.getX() + j1Var2.getX(), ji0Var.getY() + j1Var2.getY());
                                                canvas2.scale(ji0Var.getScaleX(), ji0Var.getScaleY(), ji0Var.getPivotX(), ji0Var.getPivotY());
                                                ji0Var.draw(canvas2);
                                                canvas2.restore();
                                            }
                                        }
                                    }
                                    j1Var2 = j1Var3;
                                    canvas2.save();
                                    x10 = ji0Var.getX() + j1Var2.getX();
                                    scaleX = ((ji0Var.getScaleX() * ji0Var.getMeasuredWidth()) - ji0Var.getMeasuredWidth()) / f15;
                                    f21 = x10 - scaleX;
                                    if (f21 >= 0.0f) {
                                    }
                                    if (ji0Var.getMeasuredWidth() + x10 + scaleX > getMeasuredWidth()) {
                                    }
                                    ji0Var.setTranslationX(0.0f - f36);
                                    canvas2.translate(ji0Var.getX() + j1Var2.getX(), ji0Var.getY() + j1Var2.getY());
                                    canvas2.scale(ji0Var.getScaleX(), ji0Var.getScaleY(), ji0Var.getPivotX(), ji0Var.getPivotY());
                                    ji0Var.draw(canvas2);
                                    canvas2.restore();
                                } else {
                                    j1Var2 = j1Var3;
                                    int R2 = RecyclerView.R(ji0Var);
                                    float measuredWidth = (((this.q0 - 1.0f) * ji0Var.getMeasuredWidth()) / 3.0f) - (((1.0f - this.r0) * ji0Var.getMeasuredWidth()) * (Math.abs(this.n0 - R2) - 1));
                                    if (R2 < this.n0) {
                                        ji0Var.setPivotX(0.0f);
                                        ji0Var.setTranslationX(-measuredWidth);
                                    } else {
                                        ji0Var.setPivotX(ji0Var.getMeasuredWidth() - f36);
                                        ji0Var.setTranslationX(measuredWidth - f36);
                                    }
                                    ji0Var.setPivotY(ii0Var.getY() + ii0Var.getMeasuredHeight());
                                    ji0Var.setScaleX(this.r0);
                                    ji0Var.setScaleY(this.r0);
                                    ii0Var3.setVisibility(4);
                                    ii0Var.setAlpha(1.0f);
                                }
                                if (childAt.getLeft() > i21) {
                                    i21 = childAt.getLeft();
                                }
                                if (!this.O0 && (!ji0Var.r || ii0Var.getImageReceiver().B() != null)) {
                                    if ((ji0Var.getMeasuredWidth() / f15) + ji0Var.getX() > 0.0f && (ji0Var.getMeasuredWidth() / f15) + ji0Var.getX() < j1Var2.getWidth()) {
                                        if (!hashSet.contains(ji0Var)) {
                                            ji0Var.c(abs);
                                            abs += 30;
                                        }
                                        hashSet2.add(ji0Var);
                                    } else if (!ji0Var.n) {
                                        ji0Var.d();
                                    }
                                }
                            } else {
                                i14 = save3;
                                rectF4 = rectF;
                                i15 = i20;
                                j1Var2 = j1Var3;
                                if (childAt == this.S) {
                                    if ((childAt.getMeasuredWidth() / f15) + childAt.getX() <= 0.0f || (childAt.getMeasuredWidth() / f15) + childAt.getX() >= j1Var2.getWidth()) {
                                        vg.y0 y0Var = this.v0;
                                        f18 = 0.0f;
                                        y0Var.setScaleX(0.0f);
                                        y0Var.setScaleY(0.0f);
                                        if (childAt == this.T) {
                                            if ((childAt.getMeasuredWidth() / f15) + childAt.getX() <= f18 || (childAt.getMeasuredWidth() / f15) + childAt.getX() >= j1Var2.getWidth()) {
                                                zq zqVar = this.w0;
                                                zqVar.setScaleX(0.0f);
                                                zqVar.setScaleY(0.0f);
                                                ((li0) zqVar.c).T.invalidate();
                                                ValueAnimator valueAnimator = (ValueAnimator) zqVar.b;
                                                if (valueAnimator != null) {
                                                    valueAnimator.cancel();
                                                }
                                            } else {
                                                if (!hashSet.contains(childAt)) {
                                                    if (this.w != 1.0f) {
                                                        zq zqVar2 = this.w0;
                                                        zqVar2.setScaleX(0.0f);
                                                        zqVar2.setScaleY(0.0f);
                                                        ((li0) zqVar2.c).T.invalidate();
                                                        ValueAnimator valueAnimator2 = (ValueAnimator) zqVar2.b;
                                                        if (valueAnimator2 != null) {
                                                            valueAnimator2.cancel();
                                                        }
                                                    }
                                                    zq zqVar3 = this.w0;
                                                    boolean z12 = org.telegram.messenger.lc.e(8200) || org.telegram.messenger.az.o() >= 1;
                                                    zqVar3.invalidate();
                                                    ValueAnimator valueAnimator3 = (ValueAnimator) zqVar3.b;
                                                    if (valueAnimator3 != null) {
                                                        valueAnimator3.removeAllListeners();
                                                        ((ValueAnimator) zqVar3.b).cancel();
                                                    }
                                                    if (z12) {
                                                        ValueAnimator ofFloat = ValueAnimator.ofFloat(zqVar3.getScaleX(), 1.0f);
                                                        zqVar3.b = ofFloat;
                                                        ofFloat.setInterpolator(org.telegram.messenger.g0.H);
                                                        ((ValueAnimator) zqVar3.b).addUpdateListener(new y50(zqVar3, 7));
                                                        ((ValueAnimator) zqVar3.b).setStartDelay((long) (abs * ((li0) zqVar3.c).c));
                                                        ((ValueAnimator) zqVar3.b).setDuration(300L);
                                                        ((ValueAnimator) zqVar3.b).start();
                                                    } else {
                                                        zqVar3.setScaleX(1.0f);
                                                        zqVar3.setScaleY(1.0f);
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
                                                vg.y0 y0Var2 = this.v0;
                                                f19 = 0.0f;
                                                y0Var2.setScaleX(0.0f);
                                                y0Var2.setScaleY(0.0f);
                                            } else {
                                                f19 = 0.0f;
                                            }
                                            vg.y0 y0Var3 = this.v0;
                                            org.telegram.ui.Components.voip.g gVar2 = y0Var3.K;
                                            if (gVar2 != null) {
                                                gVar2.g = f19;
                                                gVar2.j = false;
                                            }
                                            y0Var3.invalidate();
                                            y0Var3.animate().scaleX(1.1f).scaleY(1.1f).setStartDelay(abs).setInterpolator(org.telegram.messenger.g0.H).setDuration(300L);
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
                            j1Var3 = j1Var2;
                            rectF = rectF4;
                            i11 = 1;
                        }
                        i12 = save3;
                        rectF2 = rectF;
                        j1Var = j1Var3;
                        f17 = f26;
                        ji0 ji0Var2 = this.A0;
                        if (pullingLeftProgress > 0.0f) {
                            float pullingLeftProgress2 = getPullingLeftProgress();
                            int measuredWidth3 = ji0Var2.getMeasuredWidth() - org.telegram.messenger.g0.L(f15);
                            float f37 = i21 + measuredWidth3;
                            float i23 = Utilities.i(f37 / (getMeasuredWidth() - ji0Var2.getMeasuredWidth()), 1.0f, 0.0f) * pullingLeftProgress2 * measuredWidth3;
                            if (ji0Var2.getTag() == null) {
                                ji0Var2.setTag(Float.valueOf(1.0f));
                                ji0Var2.d();
                                ji0Var2.c(0);
                            }
                            float i24 = Utilities.i(pullingLeftProgress2, 1.0f, 0.0f);
                            ji0Var2.setScaleX(i24);
                            ji0Var2.setScaleY(i24);
                            i13 = 1;
                            ji0Var2.setTranslationX(((j1Var.getX() + f37) - i23) + (-((i19 == 1 || i19 == 2) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(20.0f))));
                            if (ji0Var2.getVisibility() != 0) {
                                ji0Var2.setVisibility(0);
                            }
                        } else {
                            i13 = 1;
                            if (ji0Var2.getVisibility() != 8 && this.P0) {
                                ji0Var2.setVisibility(8);
                            }
                            if (ji0Var2.getTag() != null) {
                                ji0Var2.setTag(null);
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
                        if (!org.telegram.messenger.bd.a0 || this.N) {
                            i13 = -1;
                        }
                        canvas.translate((1.0f - this.w) * getWidth() * i13, 0.0f);
                        j1Var.setTranslationX(-width2);
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
                        f(f25, max2, f38, org.telegram.messenger.hs.e4, canvas);
                        invalidate();
                    }
                }
                i12 = save3;
                rectF2 = rectF;
                j1Var = j1Var3;
                i13 = i11;
                f17 = f26;
                if (!this.e1) {
                }
                float f382 = f17;
                q10 = q();
                if (!q10) {
                }
                if (!org.telegram.messenger.bd.a0) {
                }
                i13 = -1;
                canvas.translate((1.0f - this.w) * getWidth() * i13, 0.0f);
                j1Var.setTranslationX(-width2);
                super.dispatchDraw(canvas);
                if (!q10) {
                }
                canvas.restoreToCount(i12);
                f(f25, max2, f382, org.telegram.messenger.hs.e4, canvas);
                invalidate();
            }
        }
        if (!z10) {
            float f39 = this.P;
            if (f39 != 0.0f) {
                this.P = org.telegram.ui.Cells.f1.y(min, 220.0f, f39, 0.0f);
                invalidate();
            }
        }
        s70Var = this.S0;
        if (s70Var != null) {
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
        n0Var = this.m0;
        i3 = this.N0;
        if (n0Var != null) {
            f23 = this.o0;
            if (f23 != 1.0f) {
            }
        }
        n0Var2 = this.m0;
        if (n0Var2 == null) {
        }
        float f272 = this.o0;
        this.q0 = (f272 * 2.0f) + 1.0f;
        this.r0 = 1.0f - (f272 * 0.15f);
        int save4 = canvas2.save();
        if (org.telegram.messenger.bd.a0) {
        }
        width = getWidth();
        f10 = 0.125f;
        float f282 = width * f10;
        f11 = this.w;
        if (f11 != 1.0f) {
        }
        if (org.telegram.messenger.bd.a0) {
        }
        max = Math.max(0.25f, this.w);
        f12 = 0.0f;
        float pullingLeftProgress3 = getPullingLeftProgress();
        float g72 = g();
        aoVar = this.f1;
        if (aoVar != null) {
        }
        float width22 = (getWidth() - getPaddingRight()) * Math.min(1.0f, f12);
        float topOffset2 = getTopOffset();
        float paddingTop2 = getPaddingTop();
        ci.j1 j1Var32 = this.b;
        float f292 = f12;
        float f302 = max;
        RectF rectF52 = this.x;
        rectF52.set(getPaddingLeft() + width22, (((1.0f - this.r0) * j1Var32.getMeasuredHeight()) + paddingTop2) - g72, (getWidth() - getPaddingRight()) * max, (getHeight() - getPaddingBottom()) + g72);
        this.E = com.google.android.recaptcha.internal.a.c(g72, 2.0f, rectF52.height() - topOffset2, 2.0f);
        if (i3 == 1) {
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
        j1Var = j1Var32;
        i13 = i11;
        f17 = f262;
        if (!this.e1) {
        }
        float f3822 = f17;
        q10 = q();
        if (!q10) {
        }
        if (!org.telegram.messenger.bd.a0) {
        }
        i13 = -1;
        canvas.translate((1.0f - this.w) * getWidth() * i13, 0.0f);
        j1Var.setTranslationX(-width22);
        super.dispatchDraw(canvas);
        if (!q10) {
        }
        canvas.restoreToCount(i12);
        f(f252, max22, f3822, org.telegram.messenger.hs.e4, canvas);
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
        dh.a0 a0Var = this.y0;
        if (a0Var != null) {
            a0Var.d();
        }
    }

    public final void f(float f10, float f11, float f12, int i3, Canvas canvas) {
        float f13;
        if (this.N0 == 1) {
            return;
        }
        canvas.save();
        boolean z10 = this.M;
        RectF rectF = this.x;
        if (z10) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), (org.telegram.messenger.g0.T1(rectF.top, getMeasuredHeight(), xq.f.getInterpolation(this.P)) - ((int) Math.ceil((1.0f - this.w) * (rectF.height() / 2.0f)))) + 1.0f);
        } else {
            float f14 = rectF.bottom;
            xq xqVar = xq.f;
            canvas.clipRect(0.0f, (org.telegram.messenger.g0.T1(f14, 0.0f, xqVar.getInterpolation(this.P)) - ((int) Math.ceil((1.0f - this.w) * (rectF.height() / 2.0f)))) - 1.0f, getMeasuredWidth(), org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(8.0f) + getMeasuredHeight(), getPaddingTop() - g(), xqVar.getInterpolation(this.P)));
        }
        float width = ((org.telegram.messenger.bd.a0 || this.N) ? this.H : getWidth() - this.H) + this.V0;
        float paddingTop = this.M ? getPaddingTop() - g() : (getHeight() - getPaddingBottom()) + g();
        int L = org.telegram.messenger.g0.L(3.0f);
        Drawable drawable = this.j0;
        drawable.setAlpha(i3);
        Paint paint = this.f;
        paint.setAlpha(i3);
        float f15 = width - f10;
        float f16 = L;
        float f17 = f16 * f11;
        float f18 = paddingTop - f10;
        float f19 = width + f10;
        float f20 = paddingTop + f10;
        drawable.setBounds((int) (f15 - f17), (int) (f18 - f17), (int) (f19 + f17), (int) (f17 + f20));
        drawable.draw(canvas);
        boolean O = this.h0.O();
        float f21 = paddingTop;
        RectF rectF2 = this.c0;
        if (O) {
            rectF2.set(f15, f18, f19, f20);
            f13 = f10;
            this.h0.E(canvas, rectF2, f13, getX(), getY(), i3, false);
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
        boolean z11 = org.telegram.messenger.bd.a0;
        float f22 = this.F;
        float width2 = this.V0 + this.W0 + ((z11 || this.N) ? this.H - f22 : (getWidth() - this.H) + f22);
        boolean z12 = this.M;
        float f23 = this.G;
        float T1 = org.telegram.messenger.g0.T1(z12 ? (getPaddingTop() - g()) - org.telegram.messenger.g0.L(16.0f) : ((getHeight() - f23) - f16) + g(), (f23 + f16) - g(), xq.f.getInterpolation(this.P));
        float f24 = (-org.telegram.messenger.g0.L(1.0f)) * f11;
        drawable.setBounds((int) ((width2 - f13) - f24), (int) ((T1 - f13) - f24), (int) (width2 + f13 + f24), (int) (f13 + T1 + f24));
        drawable.draw(canvas);
        if (this.h0.O()) {
            rectF2.set(width2 - f12, T1 - f12, width2 + f12, T1 + f12);
            this.h0.E(canvas, rectF2, f12, getX(), getY(), i3, false);
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
        drawable.setAlpha(org.telegram.messenger.hs.e4);
        paint.setAlpha(org.telegram.messenger.hs.e4);
    }

    public final float g() {
        return (int) (getPullingLeftProgress() * org.telegram.messenger.g0.L(6.0f));
    }

    public ki0 getDelegate() {
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

    public dh.a0 getReactionsWindow() {
        return this.y0;
    }

    public String getSelectedEmoji() {
        TLRPC.Document e10;
        HashSet hashSet = this.e0;
        if (hashSet.isEmpty()) {
            return "";
        }
        dh.n0 n0Var = (dh.n0) hashSet.iterator().next();
        long j10 = n0Var.g;
        String str = null;
        if (j10 != 0 && (e10 = g5.e(this.K, j10)) != null) {
            str = org.telegram.messenger.zi.V(e10, null, null);
        }
        if (TextUtils.isEmpty(str)) {
            str = n0Var.f;
        }
        return TextUtils.isEmpty(str) ? "👍" : str;
    }

    public HashSet<dh.n0> getSelectedReactions() {
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
        return org.telegram.messenger.g0.L(16.0f) + com.google.android.recaptcha.internal.a.e(itemsCount, 1, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(36.0f) * itemsCount);
    }

    public List<dh.n0> getVisibleReactionsList() {
        return this.U;
    }

    public int getWindowType() {
        int i3 = this.N0;
        if (i3 == 4) {
            return 13;
        }
        if (i3 == 3) {
            return 11;
        }
        if (i3 == 5) {
            return 14;
        }
        return this.G0 ? 8 : 1;
    }

    public View getWindowView() {
        dh.a0 a0Var = this.y0;
        if (a0Var == null) {
            return null;
        }
        return a0Var.c;
    }

    public final void h(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        int i3 = 0;
        int i10 = this.N0;
        if (i10 == 4) {
            Iterator it = this.e0.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                dh.n0 n0Var = (dh.n0) it.next();
                if (!hashSet.contains(n0Var)) {
                    hashSet.add(n0Var);
                    arrayList.add(n0Var);
                    i11++;
                    if (i11 >= 8) {
                        return;
                    }
                }
            }
            ArrayList arrayList2 = org.telegram.messenger.li.b0(this.K).n;
            while (i3 < arrayList2.size()) {
                dh.n0 c2 = dh.n0.c((TLRPC.TL_availableReaction) arrayList2.get(i3));
                if (!hashSet.contains(c2)) {
                    hashSet.add(c2);
                    arrayList.add(c2);
                    i11++;
                    if (i11 >= 8) {
                        return;
                    }
                }
                i3++;
            }
            return;
        }
        if (!this.F0 || i10 == 4) {
            if (i10 != 3) {
                ArrayList arrayList3 = org.telegram.messenger.li.b0(this.K).n;
                while (i3 < arrayList3.size()) {
                    arrayList.add(dh.n0.c((TLRPC.TL_availableReaction) arrayList3.get(i3)));
                    i3++;
                }
                return;
            }
            ArrayList arrayList4 = org.telegram.messenger.li.b0(this.K).F1;
            int i12 = 0;
            while (i3 < arrayList4.size()) {
                dh.n0 d = dh.n0.d((TLRPC.Reaction) arrayList4.get(i3));
                if (!hashSet.contains(d)) {
                    hashSet.add(d);
                    arrayList.add(d);
                    i12++;
                }
                if (i12 == 16) {
                    return;
                } else {
                    i3++;
                }
            }
            return;
        }
        if (i10 == 5) {
            TLRPC.messages_AvailableEffects E0 = org.telegram.messenger.hp.s1(this.K).E0();
            if (E0 != null) {
                while (i3 < E0.effects.size()) {
                    dh.n0 e10 = dh.n0.e(E0.effects.get(i3));
                    if (!hashSet.contains(e10)) {
                        hashSet.add(e10);
                        arrayList.add(e10);
                    }
                    i3++;
                }
                return;
            }
            return;
        }
        ArrayList arrayList5 = i10 == 3 ? org.telegram.messenger.li.b0(this.K).F1 : org.telegram.messenger.li.b0(this.K).E1;
        if (i10 == 3) {
            TLRPC.TL_messages_savedReactionsTags I1 = org.telegram.messenger.hp.s1(this.K).I1(0L, false);
            if (I1 != null) {
                for (int i13 = 0; i13 < I1.tags.size(); i13++) {
                    dh.n0 d10 = dh.n0.d(I1.tags.get(i13).reaction);
                    if (!hashSet.contains(d10)) {
                        hashSet.add(d10);
                        arrayList.add(d10);
                    }
                }
            }
            for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                dh.n0 d11 = dh.n0.d((TLRPC.Reaction) arrayList5.get(i14));
                if (!hashSet.contains(d11)) {
                    hashSet.add(d11);
                    arrayList.add(d11);
                }
            }
        } else {
            for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                dh.n0 d12 = dh.n0.d((TLRPC.Reaction) arrayList5.get(i15));
                if (!hashSet.contains(d12) && (i10 == 3 || org.telegram.messenger.h10.i(this.K).q() || d12.g == 0)) {
                    hashSet.add(d12);
                    arrayList.add(d12);
                }
            }
        }
        if (i10 != 3 || org.telegram.messenger.h10.i(this.K).q()) {
            ArrayList arrayList6 = org.telegram.messenger.li.b0(this.K).D1;
            for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                dh.n0 d13 = dh.n0.d((TLRPC.Reaction) arrayList6.get(i16));
                if (!hashSet.contains(d13)) {
                    hashSet.add(d13);
                    arrayList.add(d13);
                }
            }
            ArrayList arrayList7 = org.telegram.messenger.li.b0(this.K).n;
            while (i3 < arrayList7.size()) {
                dh.n0 c10 = dh.n0.c((TLRPC.TL_availableReaction) arrayList7.get(i3));
                if (!hashSet.contains(c10)) {
                    hashSet.add(c10);
                    arrayList.add(c10);
                }
                i3++;
            }
        }
    }

    public void j() {
        int i3 = 0;
        while (true) {
            ci.j1 j1Var = this.b;
            if (i3 >= j1Var.getChildCount()) {
                return;
            }
            View childAt = j1Var.getChildAt(i3);
            if (childAt instanceof ji0) {
                ((ji0) childAt).b.invalidate();
            }
            i3++;
        }
    }

    public final void k() {
        int L = org.telegram.messenger.g0.L(24.0f);
        float height = getHeight() / 2.0f;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false);
        this.c1 = x02;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.h.setShader(new LinearGradient(0.0f, height, L, height, x02, 0, tileMode));
        this.n.setShader(new LinearGradient(getWidth(), height, getWidth() - L, height, x02, 0, tileMode));
        invalidate();
    }

    public final void l(View view, dh.n0 n0Var, boolean z10) {
        ki0 ki0Var = this.h0;
        if (ki0Var != null) {
            ki0Var.z(view, n0Var, z10, true);
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
        wh0 wh0Var = new wh0(this, 1);
        ci.j1 j1Var = this.b;
        org.telegram.messenger.g0.d0(j1Var, wh0Var);
        this.D0.clear();
        j1Var.invalidate();
        ai.c0 c0Var = this.T;
        if (c0Var != null) {
            c0Var.invalidate();
        }
        invalidate();
    }

    public final void o(eh.c cVar, hh.e eVar) {
        this.a1 = cVar;
        this.b1 = eVar;
        gh.g c2 = cVar.c(this, null, true);
        c2.p(eVar);
        org.telegram.messenger.camera.q.p(c2, org.telegram.messenger.g0.L(24.0f), 8.0f);
        this.X0 = c2;
        gh.g c10 = cVar.c(this, null, true);
        c10.p(eVar);
        org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(8.0f), 8.0f);
        this.Y0 = c10;
        gh.g c11 = cVar.c(this, null, true);
        c11.p(eVar);
        org.telegram.messenger.camera.q.p(c11, org.telegram.messenger.g0.L(4.0f), 8.0f);
        this.Z0 = c11;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.i4);
        org.telegram.messenger.hs.f(this.K).c(this, org.telegram.messenger.hs.T);
        if (this.N0 == 5) {
            org.telegram.messenger.hs.f(this.K).c(this, org.telegram.messenger.hs.u3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.i4);
        org.telegram.messenger.hs.f(this.K).n(this, org.telegram.messenger.hs.T);
        if (this.N0 == 5) {
            org.telegram.messenger.hs.f(this.K).n(this, org.telegram.messenger.hs.u3);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        k();
    }

    public final void p(org.telegram.messenger.zi ziVar, TLRPC.ChatFull chatFull, boolean z10) {
        int i3;
        TLRPC.ChatFull chatFull2;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions2;
        this.I = ziVar;
        if (ziVar == null || (message = ziVar.k) == null || (tL_messageReactions2 = message.reactions) == null) {
            i3 = 0;
        } else {
            ArrayList<TLRPC.ReactionCount> arrayList = tL_messageReactions2.results;
            int size = arrayList.size();
            i3 = 0;
            int i10 = 0;
            while (i10 < size) {
                TLRPC.ReactionCount reactionCount = arrayList.get(i10);
                i10++;
                if (!(reactionCount.reaction instanceof TLRPC.TL_reactionPaid)) {
                    i3++;
                }
            }
        }
        int i11 = this.N0;
        this.J = i11 == 0 && this.I != null && i3 >= org.telegram.messenger.hp.s1(this.K).O0(org.telegram.messenger.zi.B0(this.I.k));
        this.B0 = i11 == 0 && this.I != null && org.telegram.messenger.t3.V(org.telegram.messenger.hp.s1(this.K).M0(Long.valueOf(-org.telegram.messenger.zi.B0(this.I.k))));
        ArrayList arrayList2 = new ArrayList();
        if (ziVar == null || !ziVar.l3()) {
            chatFull2 = chatFull;
        } else {
            chatFull2 = org.telegram.messenger.hp.s1(this.K).N0(-ziVar.Z0());
            if (chatFull2 == null) {
                this.L = -ziVar.Z0();
                org.telegram.messenger.hp.s1(this.K).V2(0, -ziVar.Z0(), true);
                setVisibility(4);
                return;
            }
        }
        this.d0 = false;
        if (i11 == 3) {
            this.F0 = org.telegram.messenger.h10.i(this.K).q();
            h(arrayList2);
        } else if (i11 == 5) {
            this.F0 = true;
            h(arrayList2);
        } else if (this.J) {
            this.F0 = false;
            if (chatFull2 != null && chatFull2.paid_reactions_available) {
                this.d0 = true;
                dh.n0 n0Var = new dh.n0();
                n0Var.a = true;
                arrayList2.add(n0Var);
            }
            ArrayList<TLRPC.ReactionCount> arrayList3 = this.I.k.reactions.results;
            int size2 = arrayList3.size();
            int i12 = 0;
            while (i12 < size2) {
                TLRPC.ReactionCount reactionCount2 = arrayList3.get(i12);
                i12++;
                arrayList2.add(dh.n0.d(reactionCount2.reaction));
            }
        } else if (chatFull2 != null) {
            if (chatFull2.paid_reactions_available) {
                this.d0 = true;
                dh.n0 n0Var2 = new dh.n0();
                n0Var2.a = true;
                arrayList2.add(n0Var2);
            }
            TLRPC.ChatReactions chatReactions = chatFull2.available_reactions;
            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                TLRPC.Chat M0 = org.telegram.messenger.hp.s1(this.K).M0(Long.valueOf(chatFull2.id));
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
                    ArrayList arrayList5 = org.telegram.messenger.li.b0(this.K).n;
                    int size4 = arrayList5.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 < size4) {
                            Object obj = arrayList5.get(i14);
                            i14++;
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj;
                            if (!(reaction2 instanceof TLRPC.TL_reactionEmoji) || !tL_availableReaction.reaction.equals(((TLRPC.TL_reactionEmoji) reaction2).emoticon)) {
                                if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                    arrayList2.add(dh.n0.d(reaction2));
                                    break;
                                }
                            } else {
                                arrayList2.add(dh.n0.d(reaction2));
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
                hashSet.add((dh.n0) arrayList2.get(i15));
            }
            i15++;
        }
        this.G0 = !this.J && ((!this.F0 && arrayList2.size() > 16) || (this.F0 && !org.telegram.messenger.h10.i(this.K).q() && org.telegram.messenger.hp.s1(this.K).D3()));
        if (i11 == 3 && !org.telegram.messenger.h10.i(this.K).q()) {
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
                arrayList6.add((dh.n0) arrayList2.get(i16));
                i16++;
            }
            if (i16 < arrayList2.size()) {
                ji0.a(this.A0, (dh.n0) arrayList2.get(i16), -1);
            }
        } else {
            arrayList6.addAll(arrayList2);
        }
        this.H0 = true;
        for (int i17 = 0; i17 < arrayList6.size(); i17++) {
            if (((dh.n0) arrayList6.get(i17)).g != 0) {
                this.H0 = false;
            }
        }
        ArrayList arrayList7 = this.W;
        arrayList7.clear();
        arrayList7.addAll(arrayList2);
        if (arrayList2.size() * (((getLayoutParams().height - ((int) getTopOffset())) - getPaddingTop()) - getPaddingBottom()) < org.telegram.messenger.g0.L(200.0f)) {
            getLayoutParams().width = -2;
        }
        bi0 bi0Var = this.b0;
        li0 li0Var = (li0) bi0Var.e;
        ArrayList arrayList8 = li0Var.e;
        ArrayList arrayList9 = li0Var.U;
        ArrayList arrayList10 = li0Var.d;
        arrayList8.clear();
        arrayList8.addAll(arrayList10);
        arrayList10.clear();
        for (int i18 = 0; i18 < arrayList9.size(); i18++) {
            dh.n0 n0Var3 = (dh.n0) arrayList9.get(i18);
            arrayList10.add(new ci0(n0Var3.f == null ? 3 : 0, n0Var3));
        }
        if (!li0Var.V.isEmpty() && !org.telegram.messenger.hp.s1(li0Var.K).D3()) {
            arrayList10.add(new ci0(1, null));
        }
        if (li0Var.q()) {
            arrayList10.add(new ci0(2, null));
        }
        if (z10) {
            bi0Var.E(arrayList8, arrayList10);
        } else {
            bi0Var.f();
        }
        if (ziVar == null || (tL_messageReactions = ziVar.k.reactions) == null || tL_messageReactions.results == null) {
            return;
        }
        for (int i19 = 0; i19 < ziVar.k.reactions.results.size(); i19++) {
            if (ziVar.k.reactions.results.get(i19).chosen) {
                this.e0.add(dh.n0.d(ziVar.k.reactions.results.get(i19).reaction));
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
        boolean j10 = org.telegram.messenger.az.j();
        org.telegram.ui.Cells.g1 g1Var = m1;
        if (j10) {
            duration = ObjectAnimator.ofFloat(this, g1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            duration = ObjectAnimator.ofFloat(this, g1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        }
        duration.addListener(new yh0(this, 0));
        duration.start();
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        if (getAlpha() != f10 && f10 == 0.0f) {
            this.D0.clear();
            int i3 = 0;
            while (true) {
                ci.j1 j1Var = this.b;
                if (i3 >= j1Var.getChildCount()) {
                    break;
                }
                if (j1Var.getChildAt(i3) instanceof ji0) {
                    ((ji0) j1Var.getChildAt(i3)).d();
                }
                i3++;
            }
        }
        super.setAlpha(f10);
    }

    public void setBubbleOffset(float f10) {
        this.V0 = f10;
    }

    public void setChatScrimView(ao aoVar) {
        this.f1 = aoVar;
    }

    public void setCurrentAccount(int i3) {
        this.K = i3;
    }

    public void setCustomEmojiEnterProgress(float f10) {
        this.x0 = f10;
        ao aoVar = this.f1;
        if (aoVar != null) {
            aoVar.setPopupAlpha(1.0f - f10);
        }
        invalidate();
    }

    public void setCustomEmojiReactionsBackground(boolean z10) {
        if (!z10) {
            this.w0.setBackground(null);
            return;
        }
        zq zqVar = this.w0;
        int L = org.telegram.messenger.g0.L(28.0f);
        int i3 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.ActionBar.r6.R(zqVar, org.telegram.ui.ActionBar.k6.j0(L, 0, i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i3, false), 40)), null, org.telegram.ui.ActionBar.r6.h(i3, 40), null);
    }

    public void setDelegate(ki0 ki0Var) {
        this.h0 = ki0Var;
    }

    public void setFlippedVertically(boolean z10) {
        this.O = z10;
        invalidate();
    }

    public void setFragment(org.telegram.ui.ActionBar.d2 d2Var) {
        this.u0 = d2Var;
    }

    public void setHint(CharSequence charSequence) {
        this.R0 = true;
        if (this.S0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.e6 e6Var = this.l0;
            s70 s70Var = new s70(context, e6Var);
            this.S0 = s70Var;
            s70Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
            this.S0.setClickable(true);
            this.S0.setTextSize(1, 12.0f);
            int i3 = this.N0;
            if (i3 == 1 || i3 == 2 || i3 == 4) {
                org.telegram.ui.ActionBar.r6.V(this.S0, org.telegram.ui.ActionBar.k6.G6, e6Var);
                this.S0.setAlpha(0.5f);
            } else {
                org.telegram.ui.ActionBar.r6.V(this.S0, org.telegram.ui.ActionBar.k6.z6, e6Var);
            }
            this.S0.setGravity(1);
            addView(this.S0, b8.mf.d(-1, -2.0f, 0, 0.0f, 6.0f, 0.0f, 0.0f));
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

    public void setParentLayout(ao aoVar) {
        this.K0 = aoVar;
    }

    public void setSelectedEmojis(ArrayList<String> arrayList) {
        HashSet hashSet = this.e0;
        hashSet.clear();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            String str = arrayList.get(i3);
            i3++;
            dh.n0 b10 = dh.n0.b(str);
            hashSet.add(b10);
            this.f0.add(b10);
        }
        org.telegram.messenger.g0.d0(this.b, new wh0(this, 0));
    }

    public void setSelectedReaction(dh.n0 n0Var) {
        HashSet hashSet = this.e0;
        hashSet.clear();
        if (n0Var != null) {
            hashSet.add(n0Var);
        }
        this.b0.f();
    }

    public void setSelectedReactionAnimated(dh.n0 n0Var) {
        HashSet hashSet = this.e0;
        hashSet.clear();
        if (n0Var != null) {
            hashSet.add(n0Var);
        }
        org.telegram.messenger.g0.d0(this.b, new wh0(this, 0));
    }

    public void setSelectedReactionInclusive(dh.n0 n0Var) {
        HashSet hashSet = this.e0;
        hashSet.clear();
        if (n0Var != null) {
            hashSet.add(n0Var);
        }
        org.telegram.messenger.g0.d0(this.b, new wh0(this, 0));
    }

    public void setSelectedReactions(ArrayList<org.telegram.messenger.zi> arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        HashSet hashSet = this.e0;
        hashSet.clear();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            org.telegram.messenger.zi ziVar = arrayList.get(i3);
            if (ziVar != null && (tL_messageReactions = ziVar.k.reactions) != null && tL_messageReactions.results != null) {
                for (int i10 = 0; i10 < ziVar.k.reactions.results.size(); i10++) {
                    if (ziVar.k.reactions.results.get(i10).chosen) {
                        hashSet.add(dh.n0.d(ziVar.k.reactions.results.get(i10).reaction));
                    }
                }
            }
        }
        this.b0.f();
    }

    public void setSelectedReactionsInclusive(ArrayList<org.telegram.messenger.zi> arrayList) {
        HashSet hashSet = this.e0;
        hashSet.clear();
        hashSet.addAll(i(arrayList));
        org.telegram.messenger.g0.d0(this.b, new wh0(this, 0));
    }

    public void setSkipDraw(boolean z10) {
        if (this.e1 != z10) {
            this.e1 = z10;
            if (!z10) {
                int i3 = 0;
                while (true) {
                    ci.j1 j1Var = this.b;
                    if (i3 >= j1Var.getChildCount()) {
                        break;
                    }
                    if (j1Var.getChildAt(i3) instanceof ji0) {
                        ji0 ji0Var = (ji0) j1Var.getChildAt(i3);
                        boolean z11 = ji0Var.r;
                        ii0 ii0Var = ji0Var.b;
                        if (z11 && (ii0Var.getImageReceiver().B() != null || ii0Var.getImageReceiver().m() != null)) {
                            ii0Var.setVisibility(0);
                            ji0Var.a.setVisibility(4);
                            if (ji0Var.s) {
                                ji0Var.w = true;
                            }
                        }
                        ji0Var.invalidate();
                    }
                    i3++;
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
            hashSet.add(dh.n0.d(reaction));
        }
        this.b0.f();
    }

    public void setTop(boolean z10) {
        this.M = z10;
    }

    public void setTransitionProgress(float f10) {
        this.w = f10;
        ao aoVar = this.K0;
        if (aoVar != null) {
            if (!this.L0 || !org.telegram.messenger.az.j()) {
                f10 = 1.0f;
            }
            aoVar.setReactionsTransitionProgress(f10);
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
                int i3 = this.N0;
                if (i3 != 2 && i3 != 4 && paint.getColor() != (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, this.l0))) {
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
        vg.y0 y0Var = this.v0;
        if (y0Var != null) {
            y0Var.setColor(i0.a.f(0.7f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.F8, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false)));
        }
        if (getWidth() <= 0 || getHeight() <= 0 || this.c1 == org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false)) {
            return;
        }
        k();
    }

    public void m() {
    }
}
