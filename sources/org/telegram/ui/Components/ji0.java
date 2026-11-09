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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class ji0 extends FrameLayout implements org.telegram.messenger.ls, org.telegram.ui.ActionBar.b6 {
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
    public org.telegram.messenger.ij H;
    public final Paint H0;
    public boolean I;
    public final Paint I0;
    public int J;
    public bo J0;
    public long K;
    public boolean K0;
    public boolean L;
    public final h2.f L0;
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
    public x70 R0;
    public bi.x5 S;
    public int S0;
    public final ArrayList T;
    public int T0;
    public final ArrayList U;
    public float U0;
    public final ArrayList V;
    public float V0;
    public final jg.i0 W;
    public fh.g W0;
    public fh.g X0;
    public fh.g Y0;
    public dh.c Z0;
    public boolean a;
    public final zh0 a0;
    public gh.e a1;
    public final bi.q1 b;
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
    public bo e1;
    public final Paint f;
    public final int[] f0;
    public boolean f1;
    public ii0 g0;
    public boolean g1;
    public final Paint h;
    public final Rect h0;
    public boolean h1;
    public final Drawable i0;
    public Paint i1;
    public final boolean j0;
    public Matrix j1;
    public final org.telegram.ui.ActionBar.g6 k0;
    public LinearGradient k1;
    public ch.o0 l0;
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
    public org.telegram.ui.ActionBar.f2 t0;
    public ug.z0 u0;
    public zq v0;
    public float w;
    public float w0;
    public final RectF x;
    public ch.b0 x0;
    public final Path y;
    public ValueAnimator y0;
    public final hi0 z0;

    public ji0(int i7, int i10, Context context, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.g6 g6Var) {
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
        this.D = org.telegram.messenger.g0.L(72.0f);
        float L = org.telegram.messenger.g0.L(8.0f);
        this.E = L;
        this.F = L / 2.0f;
        this.G = org.telegram.messenger.g0.L(36.0f);
        this.T = new ArrayList(20);
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
        this.L0 = new h2.f((int[]) null);
        this.O0 = true;
        this.g1 = false;
        this.M0 = i7;
        this.c = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        paint2.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.i6, g6Var));
        paint3.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.xk, g6Var));
        this.k0 = g6Var;
        this.J = i10;
        this.t0 = f2Var;
        hi0 hi0Var = new hi0(this, context);
        this.z0 = hi0Var;
        int i13 = 8;
        hi0Var.setVisibility(8);
        hi0Var.O = false;
        hi0Var.c.setVisibility(8);
        addView(hi0Var);
        this.j0 = org.telegram.messenger.iz.c() && org.telegram.messenger.iz.o() != 0;
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.i0 = mutate;
        int L2 = org.telegram.messenger.g0.L(7.0f);
        rect.bottom = L2;
        rect.right = L2;
        rect.top = L2;
        rect.left = L2;
        org.telegram.ui.ActionBar.s6.x(this, mutate, org.telegram.ui.ActionBar.l6.He, null, PorterDuff.Mode.MULTIPLY);
        bi.q1 q1Var = new bi.q1(22, context, this);
        this.b = q1Var;
        q1Var.setClipChildren(false);
        q1Var.setClipToPadding(false);
        jg.i0 i0Var = new jg.i0((ViewGroup) this, 4);
        this.W = i0Var;
        q1Var.i(new vh0(this, i11));
        q1Var.setLayoutManager(i0Var);
        q1Var.setOverScrollMode(2);
        zh0 zh0Var = new zh0(this, i11);
        this.a0 = zh0Var;
        q1Var.setAdapter(zh0Var);
        q1Var.j(new di0(this));
        q1Var.j(new ui(this, 12));
        q1Var.i(new vh0(this, i12));
        q1Var.setOnItemClickListener(new k(this, 11));
        q1Var.setOnItemLongClickListener((ej0) new l2.q(this, i7, i13));
        addView(q1Var, c8.ha.c(-1.0f, -1));
        setClipChildren(false);
        setClipToPadding(false);
        k();
        int paddingTop = (q1Var.getLayoutParams().height - q1Var.getPaddingTop()) - q1Var.getPaddingBottom();
        hi0Var.getLayoutParams().width = paddingTop - org.telegram.messenger.g0.L(12.0f);
        hi0Var.getLayoutParams().height = paddingTop;
        if (i7 == 2 || i7 == 4) {
            paint.setColor(i0.a.f(0.13f, -16777216, -1));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.G8, g6Var));
        }
        org.telegram.messenger.ui.b0(i10).k1();
    }

    public static void a(ji0 ji0Var) {
        if (ji0Var.x0 != null) {
            return;
        }
        ch.b0 b0Var = new ch.b0(ji0Var.M0, ji0Var.t0, ji0Var.V, ji0Var.d0, ji0Var, ji0Var.k0, ji0Var.a);
        ji0Var.x0 = b0Var;
        dh.c cVar = ji0Var.Z0;
        boolean z9 = true;
        if (cVar != null) {
            gh.e eVar = ji0Var.a1;
            org.telegram.ui.k01 k01Var = b0Var.m.f0;
            k01Var.y = true;
            k01Var.setBackground(null);
            k01Var.updateColors();
            k01Var.invalidate();
            fh.g c10 = cVar.c(b0Var.a, null, true);
            c10.p(eVar);
            org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(12.0f), 8.0f);
            b0Var.z = c10;
        }
        ch.b0 b0Var2 = ji0Var.x0;
        ii0 ii0Var = ji0Var.g0;
        if (ii0Var != null && !ii0Var.v()) {
            z9 = false;
        }
        b0Var2.m.setLongPressEnabled(z9);
        ji0Var.j();
        ji0Var.x0.p = new pb0(ji0Var, 11);
        ji0Var.m();
    }

    public static void b(ji0 ji0Var, View view, float f10) {
        if (view instanceof hi0) {
            ((hi0) view).h = f10;
        } else {
            view.setScaleX(f10);
            view.setScaleY(f10);
        }
    }

    public static boolean c() {
        return org.telegram.messenger.iz.j();
    }

    public static HashSet i(ArrayList arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        LongSparseArray longSparseArray = new LongSparseArray();
        HashSet hashSet = new HashSet();
        boolean z9 = true;
        int i7 = 0;
        while (i7 < arrayList.size()) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i7);
            hashSet.clear();
            if (ijVar != null && (tL_messageReactions = ijVar.k.reactions) != null && tL_messageReactions.results != null) {
                for (int i10 = 0; i10 < ijVar.k.reactions.results.size(); i10++) {
                    if (ijVar.k.reactions.results.get(i10).chosen) {
                        ch.o0 d = ch.o0.d(ijVar.k.reactions.results.get(i10).reaction);
                        if (z9 || longSparseArray.indexOfKey(d.h) >= 0) {
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
            z9 = false;
        }
        HashSet hashSet2 = new HashSet();
        for (int i12 = 0; i12 < longSparseArray.size(); i12++) {
            if (longSparseArray.valueAt(i12) != null) {
                hashSet2.add((ch.o0) longSparseArray.valueAt(i12));
            }
        }
        return hashSet2;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.F8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.h5));
    }

    public final void d(boolean z9) {
        ch.b0 b0Var = this.x0;
        if (b0Var != null) {
            if (!b0Var.q || !z9) {
                b0Var.q = true;
                if (z9) {
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
            this.x0 = null;
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id != this.K || getVisibility() == 0 || (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) {
                return;
            }
            p(this.H, null, true);
            setVisibility(0);
            r(false);
            return;
        }
        if (i7 != org.telegram.messenger.qs.i4) {
            if (i7 == org.telegram.messenger.qs.u3) {
                p(this.H, null, true);
            }
        } else {
            if (this.M0 != 4) {
                return;
            }
            invalidate();
            bi.q1 q1Var = this.b;
            q1Var.invalidate();
            q1Var.g1();
            for (int i11 = 0; i11 < q1Var.getChildCount(); i11++) {
                View childAt = q1Var.getChildAt(i11);
                if (childAt instanceof hi0) {
                    hi0 hi0Var = (hi0) childAt;
                    hi0Var.a.invalidate();
                    hi0Var.b.invalidate();
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
        x70 x70Var;
        ch.o0 o0Var;
        int i7;
        ch.o0 o0Var2;
        float width;
        float f10;
        float f11;
        float max;
        float f12;
        bo boVar;
        float f13;
        int i10;
        float f14;
        RectF rectF;
        int i11;
        float f15;
        float f16;
        int i12;
        RectF rectF2;
        bi.q1 q1Var;
        int i13;
        float f17;
        boolean q10;
        RectF rectF3;
        int i14;
        RectF rectF4;
        int i15;
        bi.q1 q1Var2;
        float f18;
        int R;
        float f19;
        float f20;
        float x10;
        float scaleX;
        float f21;
        float f22;
        i5 i5Var;
        di.z2 z2Var;
        int i16;
        ii0 ii0Var;
        float f23;
        Canvas canvas2 = canvas;
        long min = Math.min(16L, System.currentTimeMillis() - this.P);
        this.P = System.currentTimeMillis();
        boolean z9 = this.N;
        if (z9) {
            float f24 = this.O;
            if (f24 != 1.0f) {
                this.O = org.telegram.ui.Cells.f1.e(min, 220.0f, f24, 1.0f);
                invalidate();
                x70Var = this.R0;
                if (x70Var != null) {
                    x70Var.setTranslationY(-g());
                }
                float max2 = (Math.max(0.25f, Math.min(this.w, 1.0f)) - 0.25f) / 0.75f;
                float f25 = this.E * max2;
                float f26 = this.F * max2;
                HashSet hashSet = this.D0;
                hashSet.clear();
                HashSet hashSet2 = this.C0;
                hashSet.addAll(hashSet2);
                hashSet2.clear();
                if (this.c1) {
                    invalidate();
                }
                o0Var = this.l0;
                i7 = this.M0;
                if (o0Var != null && i7 != 5 && ((ii0Var = this.g0) == null || ii0Var.v())) {
                    f23 = this.n0;
                    if (f23 != 1.0f) {
                        float longPressTimeout = (16.0f / (this.l0.a ? ViewConfiguration.getLongPressTimeout() : 1500.0f)) + f23;
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
                    float f27 = this.n0;
                    this.p0 = (f27 * 2.0f) + 1.0f;
                    this.q0 = 1.0f - (f27 * 0.15f);
                }
                int save = canvas2.save();
                if (!org.telegram.messenger.id.a0 || this.M) {
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
                if (!org.telegram.messenger.id.a0 || this.M) {
                    max = Math.max(0.25f, this.w);
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f - Math.max(0.25f, this.w);
                    max = 1.0f;
                }
                float pullingLeftProgress = getPullingLeftProgress();
                float g10 = g();
                boVar = this.e1;
                if (boVar != null) {
                    boVar.setExpandSize(g10);
                }
                float width2 = (getWidth() - getPaddingRight()) * Math.min(1.0f, f12);
                float topOffset = getTopOffset();
                float paddingTop = getPaddingTop();
                bi.q1 q1Var3 = this.b;
                float f29 = f12;
                float f30 = max;
                RectF rectF5 = this.x;
                rectF5.set(getPaddingLeft() + width2, (((1.0f - this.q0) * q1Var3.getMeasuredHeight()) + paddingTop) - g10, (getWidth() - getPaddingRight()) * max, (getHeight() - getPaddingBottom()) + g10);
                this.D = com.google.android.recaptcha.internal.a.w(g10, 2.0f, rectF5.height() - topOffset, 2.0f);
                if (i7 == 1) {
                    f13 = 255.0f;
                    int i17 = (int) (Utilities.i(1.0f - (this.w0 / 0.05f), 1.0f, 0.0f) * 255.0f);
                    Drawable drawable = this.i0;
                    drawable.setAlpha(i17);
                    float paddingLeft = getPaddingLeft();
                    int width3 = getWidth() - getPaddingRight();
                    Rect rect = this.h0;
                    int i18 = (int) g10;
                    drawable.setBounds((int) ((((width3 + rect.right) * f29) + paddingLeft) - rect.left), (getPaddingTop() - rect.top) - i18, (int) (((getWidth() - getPaddingRight()) + rect.right) * f30), (getHeight() - getPaddingBottom()) + rect.bottom + i18);
                    if (this.W0 == null) {
                        drawable.draw(canvas2);
                    }
                } else {
                    f13 = 255.0f;
                }
                canvas2.restoreToCount(save);
                if (this.d1) {
                    int save2 = canvas2.save();
                    float f31 = this.w;
                    if (f31 != 1.0f) {
                        f15 = 2.0f;
                        canvas2.scale(f31, f31, f28, getHeight() / 2.0f);
                    } else {
                        f15 = 2.0f;
                    }
                    if (i7 == 1 || this.g0.U()) {
                        i16 = save2;
                        i10 = i7;
                        rectF = rectF5;
                        f14 = f28;
                        i11 = 1;
                        this.g0.L(canvas, rectF, this.D, getX(), getY(), org.telegram.messenger.qs.e4, false);
                        canvas2 = canvas;
                    } else {
                        fh.g gVar = this.W0;
                        Paint paint = this.f;
                        if (gVar != null) {
                            Rect rect2 = org.telegram.messenger.g0.Q;
                            rectF5.round(rect2);
                            rect2.inset(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
                            this.W0.setBounds(rect2);
                            this.W0.setAlpha(paint.getAlpha());
                            this.W0.draw(canvas2);
                        } else {
                            float f32 = this.D;
                            canvas2.drawRoundRect(rectF5, f32, f32, paint);
                        }
                        i16 = save2;
                        i10 = i7;
                        f14 = f28;
                        rectF = rectF5;
                        i11 = 1;
                    }
                    if (this.c0) {
                        Iterator it = this.d0.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                float f33 = this.D;
                                float l10 = Utilities.l(1.0f - getPullingLeftProgress());
                                if (this.i1 == null) {
                                    this.i1 = new Paint(i11);
                                }
                                if (this.j1 == null) {
                                    this.j1 = new Matrix();
                                }
                                if (this.k1 == null) {
                                    int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.xk, this.k0);
                                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(64.0f), 0.0f, new int[]{w02, org.telegram.ui.ActionBar.l6.r1(0.0f, w02)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                                    this.k1 = linearGradient;
                                    this.i1.setShader(linearGradient);
                                }
                                this.j1.reset();
                                this.j1.postTranslate(rectF.left, rectF.top);
                                this.k1.setLocalMatrix(this.j1);
                                this.i1.setAlpha((int) (l10 * f13));
                                canvas2.drawRoundRect(rectF, f33, f33, this.i1);
                            } else if (((ch.o0) it.next()).a) {
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
                float f34 = this.D;
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
                        while (i20 < q1Var3.getChildCount()) {
                            View childAt = q1Var3.getChildAt(i20);
                            boolean z10 = i11;
                            int abs = (this.w == 1.0f || !org.telegram.messenger.iz.j()) ? i22 : (int) (Math.abs((((childAt.getMeasuredWidth() / f15) + childAt.getLeft()) / q1Var3.getMeasuredWidth()) - 0.8f) * 200.0f);
                            float f35 = f26;
                            if (childAt instanceof hi0) {
                                hi0 hi0Var = (hi0) q1Var3.getChildAt(i20);
                                i15 = i20;
                                if (this.B0 != 0.0f) {
                                    i14 = save3;
                                    f20 = org.telegram.messenger.g0.L(46.0f) * Utilities.i(hi0Var.getLeft() / (getMeasuredWidth() - org.telegram.messenger.g0.L(34.0f)), 1.0f, 0.0f) * getPullingLeftProgress();
                                } else {
                                    i14 = save3;
                                    f20 = 0.0f;
                                }
                                ch.o0 o0Var3 = hi0Var.e;
                                gi0 gi0Var = hi0Var.a;
                                float f36 = f20;
                                gi0 gi0Var2 = hi0Var.b;
                                gi0 gi0Var3 = hi0Var.c;
                                rectF4 = rectF;
                                if (o0Var3.equals(this.l0)) {
                                    gi0 gi0Var4 = gi0Var2.getVisibility() == 0 ? gi0Var2 : gi0Var;
                                    hi0Var.setPivotX(hi0Var.getMeasuredWidth() >> 1);
                                    hi0Var.setPivotY(gi0Var4.getY() + gi0Var4.getMeasuredHeight());
                                    hi0Var.setScaleX(this.p0);
                                    hi0Var.setScaleY(this.p0);
                                    if (!this.r0) {
                                        if (this.Q == null) {
                                            gi0Var3.setVisibility(0);
                                            gi0Var3.setAlpha(1.0f);
                                            if (gi0Var3.getImageReceiver().I() || ((i5Var = gi0Var3.e) != null && (z2Var = i5Var.k) != null && z2Var.I())) {
                                                gi0Var4.setAlpha(0.0f);
                                            }
                                            f22 = 1.0f;
                                        } else {
                                            f22 = 1.0f;
                                            gi0Var3.setAlpha(1.0f - this.o0);
                                            gi0Var4.setAlpha(this.o0);
                                        }
                                        if (this.n0 == f22) {
                                            this.r0 = z10;
                                            if (System.currentTimeMillis() - this.s0 > 300) {
                                                this.s0 = System.currentTimeMillis();
                                                q1Var2 = q1Var3;
                                                this.g0.i(hi0Var, hi0Var.e, true, false);
                                                canvas2.save();
                                                x10 = hi0Var.getX() + q1Var2.getX();
                                                scaleX = ((hi0Var.getScaleX() * hi0Var.getMeasuredWidth()) - hi0Var.getMeasuredWidth()) / f15;
                                                f21 = x10 - scaleX;
                                                if (f21 >= 0.0f && hi0Var.getTranslationX() >= 0.0f) {
                                                    hi0Var.setTranslationX((-f21) - f36);
                                                } else if (hi0Var.getMeasuredWidth() + x10 + scaleX > getMeasuredWidth() || hi0Var.getTranslationX() > 0.0f) {
                                                    hi0Var.setTranslationX(0.0f - f36);
                                                } else {
                                                    hi0Var.setTranslationX((((getMeasuredWidth() - x10) - hi0Var.getMeasuredWidth()) - scaleX) - f36);
                                                }
                                                canvas2.translate(hi0Var.getX() + q1Var2.getX(), hi0Var.getY() + q1Var2.getY());
                                                canvas2.scale(hi0Var.getScaleX(), hi0Var.getScaleY(), hi0Var.getPivotX(), hi0Var.getPivotY());
                                                hi0Var.draw(canvas2);
                                                canvas2.restore();
                                            }
                                        }
                                    }
                                    q1Var2 = q1Var3;
                                    canvas2.save();
                                    x10 = hi0Var.getX() + q1Var2.getX();
                                    scaleX = ((hi0Var.getScaleX() * hi0Var.getMeasuredWidth()) - hi0Var.getMeasuredWidth()) / f15;
                                    f21 = x10 - scaleX;
                                    if (f21 >= 0.0f) {
                                    }
                                    if (hi0Var.getMeasuredWidth() + x10 + scaleX > getMeasuredWidth()) {
                                    }
                                    hi0Var.setTranslationX(0.0f - f36);
                                    canvas2.translate(hi0Var.getX() + q1Var2.getX(), hi0Var.getY() + q1Var2.getY());
                                    canvas2.scale(hi0Var.getScaleX(), hi0Var.getScaleY(), hi0Var.getPivotX(), hi0Var.getPivotY());
                                    hi0Var.draw(canvas2);
                                    canvas2.restore();
                                } else {
                                    q1Var2 = q1Var3;
                                    int R2 = RecyclerView.R(hi0Var);
                                    float measuredWidth = (((this.p0 - 1.0f) * hi0Var.getMeasuredWidth()) / 3.0f) - (((1.0f - this.q0) * hi0Var.getMeasuredWidth()) * (Math.abs(this.m0 - R2) - 1));
                                    if (R2 < this.m0) {
                                        hi0Var.setPivotX(0.0f);
                                        hi0Var.setTranslationX(-measuredWidth);
                                    } else {
                                        hi0Var.setPivotX(hi0Var.getMeasuredWidth() - f36);
                                        hi0Var.setTranslationX(measuredWidth - f36);
                                    }
                                    hi0Var.setPivotY(gi0Var.getY() + gi0Var.getMeasuredHeight());
                                    hi0Var.setScaleX(this.q0);
                                    hi0Var.setScaleY(this.q0);
                                    gi0Var3.setVisibility(4);
                                    gi0Var.setAlpha(1.0f);
                                }
                                if (childAt.getLeft() > i21) {
                                    i21 = childAt.getLeft();
                                }
                                if (!this.N0 && (!hi0Var.r || gi0Var.getImageReceiver().B() != null)) {
                                    if ((hi0Var.getMeasuredWidth() / f15) + hi0Var.getX() > 0.0f && (hi0Var.getMeasuredWidth() / f15) + hi0Var.getX() < q1Var2.getWidth()) {
                                        if (!hashSet.contains(hi0Var)) {
                                            hi0Var.c(abs);
                                            abs += 30;
                                        }
                                        hashSet2.add(hi0Var);
                                    } else if (!hi0Var.n) {
                                        hi0Var.d();
                                    }
                                }
                            } else {
                                i14 = save3;
                                rectF4 = rectF;
                                i15 = i20;
                                q1Var2 = q1Var3;
                                if (childAt == this.R) {
                                    if ((childAt.getMeasuredWidth() / f15) + childAt.getX() <= 0.0f || (childAt.getMeasuredWidth() / f15) + childAt.getX() >= q1Var2.getWidth()) {
                                        ug.z0 z0Var = this.u0;
                                        f18 = 0.0f;
                                        z0Var.setScaleX(0.0f);
                                        z0Var.setScaleY(0.0f);
                                        if (childAt == this.S) {
                                            if ((childAt.getMeasuredWidth() / f15) + childAt.getX() <= f18 || (childAt.getMeasuredWidth() / f15) + childAt.getX() >= q1Var2.getWidth()) {
                                                zq zqVar = this.v0;
                                                zqVar.setScaleX(0.0f);
                                                zqVar.setScaleY(0.0f);
                                                ((ji0) zqVar.c).S.invalidate();
                                                ValueAnimator valueAnimator = (ValueAnimator) zqVar.b;
                                                if (valueAnimator != null) {
                                                    valueAnimator.cancel();
                                                }
                                            } else {
                                                if (!hashSet.contains(childAt)) {
                                                    if (this.w != 1.0f) {
                                                        zq zqVar2 = this.v0;
                                                        zqVar2.setScaleX(0.0f);
                                                        zqVar2.setScaleY(0.0f);
                                                        ((ji0) zqVar2.c).S.invalidate();
                                                        ValueAnimator valueAnimator2 = (ValueAnimator) zqVar2.b;
                                                        if (valueAnimator2 != null) {
                                                            valueAnimator2.cancel();
                                                        }
                                                    }
                                                    zq zqVar3 = this.v0;
                                                    boolean z11 = org.telegram.messenger.sc.e(8200) || org.telegram.messenger.iz.o() >= 1;
                                                    zqVar3.invalidate();
                                                    ValueAnimator valueAnimator3 = (ValueAnimator) zqVar3.b;
                                                    if (valueAnimator3 != null) {
                                                        valueAnimator3.removeAllListeners();
                                                        ((ValueAnimator) zqVar3.b).cancel();
                                                    }
                                                    if (z11) {
                                                        ValueAnimator ofFloat = ValueAnimator.ofFloat(zqVar3.getScaleX(), 1.0f);
                                                        zqVar3.b = ofFloat;
                                                        ofFloat.setInterpolator(org.telegram.messenger.g0.H);
                                                        ((ValueAnimator) zqVar3.b).addUpdateListener(new d60(zqVar3, 6));
                                                        ((ValueAnimator) zqVar3.b).setStartDelay((long) (abs * ((ji0) zqVar3.c).c));
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
                                                ug.z0 z0Var2 = this.u0;
                                                f19 = 0.0f;
                                                z0Var2.setScaleX(0.0f);
                                                z0Var2.setScaleY(0.0f);
                                            } else {
                                                f19 = 0.0f;
                                            }
                                            ug.z0 z0Var3 = this.u0;
                                            org.telegram.ui.Components.voip.n nVar = z0Var3.J;
                                            if (nVar != null) {
                                                nVar.g = f19;
                                                nVar.j = false;
                                            }
                                            z0Var3.invalidate();
                                            z0Var3.animate().scaleX(1.1f).scaleY(1.1f).setStartDelay(abs).setInterpolator(org.telegram.messenger.g0.H).setDuration(300L);
                                            abs += 30;
                                        }
                                        hashSet2.add(childAt);
                                    }
                                }
                                f18 = 0.0f;
                                if (childAt == this.S) {
                                }
                                R = RecyclerView.R(childAt);
                                float measuredWidth22 = (((this.p0 - 1.0f) * childAt.getMeasuredWidth()) / 3.0f) - (((1.0f - this.q0) * childAt.getMeasuredWidth()) * (Math.abs(this.m0 - R) - 1));
                                if (R >= this.m0) {
                                }
                                childAt.setScaleX(this.q0);
                                childAt.setScaleY(this.q0);
                            }
                            i22 = abs;
                            i20 = i15 + 1;
                            canvas2 = canvas;
                            f26 = f35;
                            save3 = i14;
                            q1Var3 = q1Var2;
                            rectF = rectF4;
                            i11 = 1;
                        }
                        i12 = save3;
                        rectF2 = rectF;
                        q1Var = q1Var3;
                        f17 = f26;
                        hi0 hi0Var2 = this.z0;
                        if (pullingLeftProgress > 0.0f) {
                            float pullingLeftProgress2 = getPullingLeftProgress();
                            int measuredWidth3 = hi0Var2.getMeasuredWidth() - org.telegram.messenger.g0.L(f15);
                            float f37 = i21 + measuredWidth3;
                            float i23 = Utilities.i(f37 / (getMeasuredWidth() - hi0Var2.getMeasuredWidth()), 1.0f, 0.0f) * pullingLeftProgress2 * measuredWidth3;
                            if (hi0Var2.getTag() == null) {
                                hi0Var2.setTag(Float.valueOf(1.0f));
                                hi0Var2.d();
                                hi0Var2.c(0);
                            }
                            float i24 = Utilities.i(pullingLeftProgress2, 1.0f, 0.0f);
                            hi0Var2.setScaleX(i24);
                            hi0Var2.setScaleY(i24);
                            i13 = 1;
                            hi0Var2.setTranslationX(((q1Var.getX() + f37) - i23) + (-((i19 == 1 || i19 == 2) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(20.0f))));
                            if (hi0Var2.getVisibility() != 0) {
                                hi0Var2.setVisibility(0);
                            }
                        } else {
                            i13 = 1;
                            if (hi0Var2.getVisibility() != 8 && this.O0) {
                                hi0Var2.setVisibility(8);
                            }
                            if (hi0Var2.getTag() != null) {
                                hi0Var2.setTag(null);
                            }
                        }
                        if (!this.d1 && this.x0 != null) {
                            int A = (int) org.telegram.messenger.k5.A(1.0f, this.w0, Utilities.i(1.0f - (this.w0 / 0.2f), 1.0f, 0.0f), f13);
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
                        if (!org.telegram.messenger.id.a0 || this.M) {
                            i13 = -1;
                        }
                        canvas.translate((1.0f - this.w) * getWidth() * i13, 0.0f);
                        q1Var.setTranslationX(-width2);
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
                        f(f25, max2, f38, org.telegram.messenger.qs.e4, canvas);
                        invalidate();
                    }
                }
                i12 = save3;
                rectF2 = rectF;
                q1Var = q1Var3;
                i13 = i11;
                f17 = f26;
                if (!this.d1) {
                }
                float f382 = f17;
                q10 = q();
                if (!q10) {
                }
                if (!org.telegram.messenger.id.a0) {
                }
                i13 = -1;
                canvas.translate((1.0f - this.w) * getWidth() * i13, 0.0f);
                q1Var.setTranslationX(-width2);
                super.dispatchDraw(canvas);
                if (!q10) {
                }
                canvas.restoreToCount(i12);
                f(f25, max2, f382, org.telegram.messenger.qs.e4, canvas);
                invalidate();
            }
        }
        if (!z9) {
            float f39 = this.O;
            if (f39 != 0.0f) {
                this.O = org.telegram.ui.Cells.f1.v(min, 220.0f, f39, 0.0f);
                invalidate();
            }
        }
        x70Var = this.R0;
        if (x70Var != null) {
        }
        float max22 = (Math.max(0.25f, Math.min(this.w, 1.0f)) - 0.25f) / 0.75f;
        float f252 = this.E * max22;
        float f262 = this.F * max22;
        HashSet hashSet3 = this.D0;
        hashSet3.clear();
        HashSet hashSet22 = this.C0;
        hashSet3.addAll(hashSet22);
        hashSet22.clear();
        if (this.c1) {
        }
        o0Var = this.l0;
        i7 = this.M0;
        if (o0Var != null) {
            f23 = this.n0;
            if (f23 != 1.0f) {
            }
        }
        o0Var2 = this.l0;
        if (o0Var2 == null) {
        }
        float f272 = this.n0;
        this.p0 = (f272 * 2.0f) + 1.0f;
        this.q0 = 1.0f - (f272 * 0.15f);
        int save4 = canvas2.save();
        if (org.telegram.messenger.id.a0) {
        }
        width = getWidth();
        f10 = 0.125f;
        float f282 = width * f10;
        f11 = this.w;
        if (f11 != 1.0f) {
        }
        if (org.telegram.messenger.id.a0) {
        }
        max = Math.max(0.25f, this.w);
        f12 = 0.0f;
        float pullingLeftProgress3 = getPullingLeftProgress();
        float g102 = g();
        boVar = this.e1;
        if (boVar != null) {
        }
        float width22 = (getWidth() - getPaddingRight()) * Math.min(1.0f, f12);
        float topOffset2 = getTopOffset();
        float paddingTop2 = getPaddingTop();
        bi.q1 q1Var32 = this.b;
        float f292 = f12;
        float f302 = max;
        RectF rectF52 = this.x;
        rectF52.set(getPaddingLeft() + width22, (((1.0f - this.q0) * q1Var32.getMeasuredHeight()) + paddingTop2) - g102, (getWidth() - getPaddingRight()) * max, (getHeight() - getPaddingBottom()) + g102);
        this.D = com.google.android.recaptcha.internal.a.w(g102, 2.0f, rectF52.height() - topOffset2, 2.0f);
        if (i7 == 1) {
        }
        canvas2.restoreToCount(save4);
        if (this.d1) {
        }
        Path path2 = this.y;
        path2.rewind();
        float f342 = this.D;
        path2.addRoundRect(rectF, f342, f342, Path.Direction.CW);
        int save32 = canvas2.save();
        f16 = this.w;
        if (f16 != 1.0f) {
        }
        if (this.w != 0.0f) {
        }
        i12 = save32;
        rectF2 = rectF;
        q1Var = q1Var32;
        i13 = i11;
        f17 = f262;
        if (!this.d1) {
        }
        float f3822 = f17;
        q10 = q();
        if (!q10) {
        }
        if (!org.telegram.messenger.id.a0) {
        }
        i13 = -1;
        canvas.translate((1.0f - this.w) * getWidth() * i13, 0.0f);
        q1Var.setTranslationX(-width22);
        super.dispatchDraw(canvas);
        if (!q10) {
        }
        canvas.restoreToCount(i12);
        f(f252, max22, f3822, org.telegram.messenger.qs.e4, canvas);
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
        ch.b0 b0Var = this.x0;
        if (b0Var != null) {
            b0Var.d();
        }
    }

    public final void f(float f10, float f11, float f12, int i7, Canvas canvas) {
        float f13;
        if (this.M0 == 1) {
            return;
        }
        canvas.save();
        boolean z9 = this.L;
        RectF rectF = this.x;
        if (z9) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), (org.telegram.messenger.g0.T1(rectF.top, getMeasuredHeight(), xq.f.getInterpolation(this.O)) - ((int) Math.ceil((1.0f - this.w) * (rectF.height() / 2.0f)))) + 1.0f);
        } else {
            float f14 = rectF.bottom;
            xq xqVar = xq.f;
            canvas.clipRect(0.0f, (org.telegram.messenger.g0.T1(f14, 0.0f, xqVar.getInterpolation(this.O)) - ((int) Math.ceil((1.0f - this.w) * (rectF.height() / 2.0f)))) - 1.0f, getMeasuredWidth(), org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(8.0f) + getMeasuredHeight(), getPaddingTop() - g(), xqVar.getInterpolation(this.O)));
        }
        float width = ((org.telegram.messenger.id.a0 || this.M) ? this.G : getWidth() - this.G) + this.U0;
        float paddingTop = this.L ? getPaddingTop() - g() : (getHeight() - getPaddingBottom()) + g();
        int L = org.telegram.messenger.g0.L(3.0f);
        Drawable drawable = this.i0;
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
        boolean U = this.g0.U();
        float f21 = paddingTop;
        RectF rectF2 = this.b0;
        if (U) {
            rectF2.set(f15, f18, f19, f20);
            f13 = f10;
            this.g0.L(canvas, rectF2, f13, getX(), getY(), i7, false);
        } else {
            f13 = f10;
            if (this.X0 != null) {
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(f15, f18, f19, f20);
                Rect rect = org.telegram.messenger.g0.Q;
                rectF3.round(rect);
                rect.inset(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
                this.X0.setBounds(rect);
                this.X0.setAlpha(paint.getAlpha());
                this.X0.draw(canvas);
            } else {
                canvas.drawCircle(width, f21, f13, paint);
            }
        }
        boolean z10 = org.telegram.messenger.id.a0;
        float f22 = this.E;
        float width2 = this.U0 + this.V0 + ((z10 || this.M) ? this.G - f22 : (getWidth() - this.G) + f22);
        boolean z11 = this.L;
        float f23 = this.F;
        float T1 = org.telegram.messenger.g0.T1(z11 ? (getPaddingTop() - g()) - org.telegram.messenger.g0.L(16.0f) : ((getHeight() - f23) - f16) + g(), (f23 + f16) - g(), xq.f.getInterpolation(this.O));
        float f24 = (-org.telegram.messenger.g0.L(1.0f)) * f11;
        drawable.setBounds((int) ((width2 - f13) - f24), (int) ((T1 - f13) - f24), (int) (width2 + f13 + f24), (int) (f13 + T1 + f24));
        drawable.draw(canvas);
        if (this.g0.U()) {
            rectF2.set(width2 - f12, T1 - f12, width2 + f12, T1 + f12);
            this.g0.L(canvas, rectF2, f12, getX(), getY(), i7, false);
        } else if (this.Y0 != null) {
            RectF rectF4 = org.telegram.messenger.g0.P;
            rectF4.set(width2 - f12, T1 - f12, width2 + f12, T1 + f12);
            Rect rect2 = org.telegram.messenger.g0.Q;
            rectF4.round(rect2);
            rect2.inset(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
            this.Y0.setBounds(rect2);
            this.Y0.setAlpha(paint.getAlpha());
            this.Y0.draw(canvas);
        } else {
            canvas.drawCircle(width2, T1, f12, paint);
        }
        canvas.restore();
        drawable.setAlpha(org.telegram.messenger.qs.e4);
        paint.setAlpha(org.telegram.messenger.qs.e4);
    }

    public final float g() {
        return (int) (getPullingLeftProgress() * org.telegram.messenger.g0.L(6.0f));
    }

    public ii0 getDelegate() {
        return this.g0;
    }

    public int getHintTextWidth() {
        return this.S0;
    }

    public int getItemsCount() {
        return (q() ? 1 : 0) + this.T.size() + 1;
    }

    public float getPullingLeftProgress() {
        return Utilities.i(this.B0 / org.telegram.messenger.g0.L(42.0f), 2.0f, 0.0f);
    }

    public ch.b0 getReactionsWindow() {
        return this.x0;
    }

    public String getSelectedEmoji() {
        TLRPC.Document e10;
        HashSet hashSet = this.d0;
        if (hashSet.isEmpty()) {
            return "";
        }
        ch.o0 o0Var = (ch.o0) hashSet.iterator().next();
        long j3 = o0Var.g;
        String str = null;
        if (j3 != 0 && (e10 = i5.e(this.J, j3)) != null) {
            str = org.telegram.messenger.ij.V(e10, null, null);
        }
        if (TextUtils.isEmpty(str)) {
            str = o0Var.f;
        }
        return TextUtils.isEmpty(str) ? "👍" : str;
    }

    public HashSet<ch.o0> getSelectedReactions() {
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
            return (org.telegram.messenger.g0.L(36.0f) * itemsCount) - org.telegram.messenger.g0.L(4.0f);
        }
        return org.telegram.messenger.g0.L(16.0f) + com.google.android.recaptcha.internal.a.e(itemsCount, 1, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(36.0f) * itemsCount);
    }

    public List<ch.o0> getVisibleReactionsList() {
        return this.T;
    }

    public int getWindowType() {
        int i7 = this.M0;
        if (i7 == 4) {
            return 13;
        }
        if (i7 == 3) {
            return 11;
        }
        if (i7 == 5) {
            return 14;
        }
        return this.F0 ? 8 : 1;
    }

    public View getWindowView() {
        ch.b0 b0Var = this.x0;
        if (b0Var == null) {
            return null;
        }
        return b0Var.c;
    }

    public final void h(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        int i7 = 0;
        int i10 = this.M0;
        if (i10 == 4) {
            Iterator it = this.d0.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                ch.o0 o0Var = (ch.o0) it.next();
                if (!hashSet.contains(o0Var)) {
                    hashSet.add(o0Var);
                    arrayList.add(o0Var);
                    i11++;
                    if (i11 >= 8) {
                        return;
                    }
                }
            }
            ArrayList arrayList2 = org.telegram.messenger.ui.b0(this.J).n;
            while (i7 < arrayList2.size()) {
                ch.o0 c10 = ch.o0.c((TLRPC.TL_availableReaction) arrayList2.get(i7));
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
        if (!this.E0 || i10 == 4) {
            if (i10 != 3) {
                ArrayList arrayList3 = org.telegram.messenger.ui.b0(this.J).n;
                while (i7 < arrayList3.size()) {
                    arrayList.add(ch.o0.c((TLRPC.TL_availableReaction) arrayList3.get(i7)));
                    i7++;
                }
                return;
            }
            ArrayList arrayList4 = org.telegram.messenger.ui.b0(this.J).E1;
            int i12 = 0;
            while (i7 < arrayList4.size()) {
                ch.o0 d = ch.o0.d((TLRPC.Reaction) arrayList4.get(i7));
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
            TLRPC.messages_AvailableEffects E0 = org.telegram.messenger.qp.s1(this.J).E0();
            if (E0 != null) {
                while (i7 < E0.effects.size()) {
                    ch.o0 e10 = ch.o0.e(E0.effects.get(i7));
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
        ArrayList arrayList5 = i10 == 3 ? org.telegram.messenger.ui.b0(this.J).E1 : org.telegram.messenger.ui.b0(this.J).D1;
        if (i10 == 3) {
            TLRPC.TL_messages_savedReactionsTags I1 = org.telegram.messenger.qp.s1(this.J).I1(0L, false);
            if (I1 != null) {
                for (int i13 = 0; i13 < I1.tags.size(); i13++) {
                    ch.o0 d2 = ch.o0.d(I1.tags.get(i13).reaction);
                    if (!hashSet.contains(d2)) {
                        hashSet.add(d2);
                        arrayList.add(d2);
                    }
                }
            }
            for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                ch.o0 d10 = ch.o0.d((TLRPC.Reaction) arrayList5.get(i14));
                if (!hashSet.contains(d10)) {
                    hashSet.add(d10);
                    arrayList.add(d10);
                }
            }
        } else {
            for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                ch.o0 d11 = ch.o0.d((TLRPC.Reaction) arrayList5.get(i15));
                if (!hashSet.contains(d11) && (i10 == 3 || org.telegram.messenger.p10.i(this.J).q() || d11.g == 0)) {
                    hashSet.add(d11);
                    arrayList.add(d11);
                }
            }
        }
        if (i10 != 3 || org.telegram.messenger.p10.i(this.J).q()) {
            ArrayList arrayList6 = org.telegram.messenger.ui.b0(this.J).C1;
            for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                ch.o0 d12 = ch.o0.d((TLRPC.Reaction) arrayList6.get(i16));
                if (!hashSet.contains(d12)) {
                    hashSet.add(d12);
                    arrayList.add(d12);
                }
            }
            ArrayList arrayList7 = org.telegram.messenger.ui.b0(this.J).n;
            while (i7 < arrayList7.size()) {
                ch.o0 c11 = ch.o0.c((TLRPC.TL_availableReaction) arrayList7.get(i7));
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
            bi.q1 q1Var = this.b;
            if (i7 >= q1Var.getChildCount()) {
                return;
            }
            View childAt = q1Var.getChildAt(i7);
            if (childAt instanceof hi0) {
                ((hi0) childAt).b.invalidate();
            }
            i7++;
        }
    }

    public final void k() {
        int L = org.telegram.messenger.g0.L(24.0f);
        float height = getHeight() / 2.0f;
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.G8, false);
        this.b1 = x02;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.h.setShader(new LinearGradient(0.0f, height, L, height, x02, 0, tileMode));
        this.n.setShader(new LinearGradient(getWidth(), height, getWidth() - L, height, x02, 0, tileMode));
        invalidate();
    }

    public final void l(View view, ch.o0 o0Var, boolean z9) {
        ii0 ii0Var = this.g0;
        if (ii0Var != null) {
            ii0Var.i(view, o0Var, z9, true);
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
        uh0 uh0Var = new uh0(this, 1);
        bi.q1 q1Var = this.b;
        org.telegram.messenger.g0.d0(q1Var, uh0Var);
        this.C0.clear();
        q1Var.invalidate();
        bi.x5 x5Var = this.S;
        if (x5Var != null) {
            x5Var.invalidate();
        }
        invalidate();
    }

    public final void o(dh.c cVar, gh.e eVar) {
        this.Z0 = cVar;
        this.a1 = eVar;
        fh.g c10 = cVar.c(this, null, true);
        c10.p(eVar);
        org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(24.0f), 8.0f);
        this.W0 = c10;
        fh.g c11 = cVar.c(this, null, true);
        c11.p(eVar);
        org.telegram.messenger.camera.q.p(c11, org.telegram.messenger.g0.L(8.0f), 8.0f);
        this.X0 = c11;
        fh.g c12 = cVar.c(this, null, true);
        c12.p(eVar);
        org.telegram.messenger.camera.q.p(c12, org.telegram.messenger.g0.L(4.0f), 8.0f);
        this.Y0 = c12;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.i4);
        org.telegram.messenger.qs.f(this.J).c(this, org.telegram.messenger.qs.T);
        if (this.M0 == 5) {
            org.telegram.messenger.qs.f(this.J).c(this, org.telegram.messenger.qs.u3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.i4);
        org.telegram.messenger.qs.f(this.J).n(this, org.telegram.messenger.qs.T);
        if (this.M0 == 5) {
            org.telegram.messenger.qs.f(this.J).n(this, org.telegram.messenger.qs.u3);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        k();
    }

    public final void p(org.telegram.messenger.ij ijVar, TLRPC.ChatFull chatFull, boolean z9) {
        int i7;
        TLRPC.ChatFull chatFull2;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions2;
        this.H = ijVar;
        if (ijVar == null || (message = ijVar.k) == null || (tL_messageReactions2 = message.reactions) == null) {
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
        int i11 = this.M0;
        this.I = i11 == 0 && this.H != null && i7 >= org.telegram.messenger.qp.s1(this.J).O0(org.telegram.messenger.ij.B0(this.H.k));
        this.A0 = i11 == 0 && this.H != null && org.telegram.messenger.t3.V(org.telegram.messenger.qp.s1(this.J).M0(Long.valueOf(-org.telegram.messenger.ij.B0(this.H.k))));
        ArrayList arrayList2 = new ArrayList();
        if (ijVar == null || !ijVar.k3()) {
            chatFull2 = chatFull;
        } else {
            chatFull2 = org.telegram.messenger.qp.s1(this.J).N0(-ijVar.Z0());
            if (chatFull2 == null) {
                this.K = -ijVar.Z0();
                org.telegram.messenger.qp.s1(this.J).V2(0, -ijVar.Z0(), true);
                setVisibility(4);
                return;
            }
        }
        this.c0 = false;
        if (i11 == 3) {
            this.E0 = org.telegram.messenger.p10.i(this.J).q();
            h(arrayList2);
        } else if (i11 == 5) {
            this.E0 = true;
            h(arrayList2);
        } else if (this.I) {
            this.E0 = false;
            if (chatFull2 != null && chatFull2.paid_reactions_available) {
                this.c0 = true;
                ch.o0 o0Var = new ch.o0();
                o0Var.a = true;
                arrayList2.add(o0Var);
            }
            ArrayList<TLRPC.ReactionCount> arrayList3 = this.H.k.reactions.results;
            int size2 = arrayList3.size();
            int i12 = 0;
            while (i12 < size2) {
                TLRPC.ReactionCount reactionCount2 = arrayList3.get(i12);
                i12++;
                arrayList2.add(ch.o0.d(reactionCount2.reaction));
            }
        } else if (chatFull2 != null) {
            if (chatFull2.paid_reactions_available) {
                this.c0 = true;
                ch.o0 o0Var2 = new ch.o0();
                o0Var2.a = true;
                arrayList2.add(o0Var2);
            }
            TLRPC.ChatReactions chatReactions = chatFull2.available_reactions;
            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.J).M0(Long.valueOf(chatFull2.id));
                if (M0 == null || org.telegram.messenger.t3.V(M0)) {
                    this.E0 = false;
                } else {
                    this.E0 = true;
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
                    ArrayList arrayList5 = org.telegram.messenger.ui.b0(this.J).n;
                    int size4 = arrayList5.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 < size4) {
                            Object obj = arrayList5.get(i14);
                            i14++;
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj;
                            if (!(reaction2 instanceof TLRPC.TL_reactionEmoji) || !tL_availableReaction.reaction.equals(((TLRPC.TL_reactionEmoji) reaction2).emoticon)) {
                                if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                    arrayList2.add(ch.o0.d(reaction2));
                                    break;
                                }
                            } else {
                                arrayList2.add(ch.o0.d(reaction2));
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
        int i15 = 0;
        while (i15 < arrayList2.size()) {
            if (hashSet.contains(arrayList2.get(i15))) {
                i15--;
                arrayList2.remove(i15);
            } else {
                hashSet.add((ch.o0) arrayList2.get(i15));
            }
            i15++;
        }
        this.F0 = !this.I && ((!this.E0 && arrayList2.size() > 16) || (this.E0 && !org.telegram.messenger.p10.i(this.J).q() && org.telegram.messenger.qp.s1(this.J).D3()));
        if (i11 == 3 && !org.telegram.messenger.p10.i(this.J).q()) {
            this.F0 = false;
        }
        if (i11 == 4) {
            this.F0 = true;
        }
        ArrayList arrayList6 = this.T;
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
                arrayList6.add((ch.o0) arrayList2.get(i16));
                i16++;
            }
            if (i16 < arrayList2.size()) {
                hi0.a(this.z0, (ch.o0) arrayList2.get(i16), -1);
            }
        } else {
            arrayList6.addAll(arrayList2);
        }
        this.G0 = true;
        for (int i17 = 0; i17 < arrayList6.size(); i17++) {
            if (((ch.o0) arrayList6.get(i17)).g != 0) {
                this.G0 = false;
            }
        }
        ArrayList arrayList7 = this.V;
        arrayList7.clear();
        arrayList7.addAll(arrayList2);
        if (arrayList2.size() * (((getLayoutParams().height - ((int) getTopOffset())) - getPaddingTop()) - getPaddingBottom()) < org.telegram.messenger.g0.L(200.0f)) {
            getLayoutParams().width = -2;
        }
        zh0 zh0Var = this.a0;
        ji0 ji0Var = (ji0) zh0Var.e;
        ArrayList arrayList8 = ji0Var.e;
        ArrayList arrayList9 = ji0Var.T;
        ArrayList arrayList10 = ji0Var.d;
        arrayList8.clear();
        arrayList8.addAll(arrayList10);
        arrayList10.clear();
        for (int i18 = 0; i18 < arrayList9.size(); i18++) {
            ch.o0 o0Var3 = (ch.o0) arrayList9.get(i18);
            arrayList10.add(new ai0(o0Var3.f == null ? 3 : 0, o0Var3));
        }
        if (!ji0Var.U.isEmpty() && !org.telegram.messenger.qp.s1(ji0Var.J).D3()) {
            arrayList10.add(new ai0(1, null));
        }
        if (ji0Var.q()) {
            arrayList10.add(new ai0(2, null));
        }
        if (z9) {
            zh0Var.E(arrayList8, arrayList10);
        } else {
            zh0Var.f();
        }
        if (ijVar == null || (tL_messageReactions = ijVar.k.reactions) == null || tL_messageReactions.results == null) {
            return;
        }
        for (int i19 = 0; i19 < ijVar.k.reactions.results.size(); i19++) {
            if (ijVar.k.reactions.results.get(i19).chosen) {
                this.d0.add(ch.o0.d(ijVar.k.reactions.results.get(i19).reaction));
            }
        }
    }

    public final boolean q() {
        return this.E0 || this.F0;
    }

    public final void r(boolean z9) {
        ObjectAnimator duration;
        this.K0 = z9;
        setTransitionProgress(0.0f);
        setAlpha(1.0f);
        this.L0.d();
        boolean j3 = org.telegram.messenger.iz.j();
        org.telegram.ui.Cells.g1 g1Var = l1;
        if (j3) {
            duration = ObjectAnimator.ofFloat(this, g1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            duration = ObjectAnimator.ofFloat(this, g1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        }
        duration.addListener(new wh0(this, 0));
        duration.start();
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        if (getAlpha() != f10 && f10 == 0.0f) {
            this.C0.clear();
            int i7 = 0;
            while (true) {
                bi.q1 q1Var = this.b;
                if (i7 >= q1Var.getChildCount()) {
                    break;
                }
                if (q1Var.getChildAt(i7) instanceof hi0) {
                    ((hi0) q1Var.getChildAt(i7)).d();
                }
                i7++;
            }
        }
        super.setAlpha(f10);
    }

    public void setBubbleOffset(float f10) {
        this.U0 = f10;
    }

    public void setChatScrimView(bo boVar) {
        this.e1 = boVar;
    }

    public void setCurrentAccount(int i7) {
        this.J = i7;
    }

    public void setCustomEmojiEnterProgress(float f10) {
        this.w0 = f10;
        bo boVar = this.e1;
        if (boVar != null) {
            boVar.setPopupAlpha(1.0f - f10);
        }
        invalidate();
    }

    public void setCustomEmojiReactionsBackground(boolean z9) {
        if (!z9) {
            this.v0.setBackground(null);
            return;
        }
        zq zqVar = this.v0;
        int L = org.telegram.messenger.g0.L(28.0f);
        int i7 = org.telegram.ui.ActionBar.l6.i6;
        org.telegram.ui.ActionBar.s6.Q(zqVar, org.telegram.ui.ActionBar.l6.j0(L, 0, i0.a.o(org.telegram.ui.ActionBar.l6.x0(null, i7, false), 40)), null, org.telegram.ui.ActionBar.s6.g(i7, 40), null);
    }

    public void setDelegate(ii0 ii0Var) {
        this.g0 = ii0Var;
    }

    public void setFlippedVertically(boolean z9) {
        this.N = z9;
        invalidate();
    }

    public void setFragment(org.telegram.ui.ActionBar.f2 f2Var) {
        this.t0 = f2Var;
    }

    public void setHint(CharSequence charSequence) {
        this.Q0 = true;
        if (this.R0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.g6 g6Var = this.k0;
            x70 x70Var = new x70(context, g6Var);
            this.R0 = x70Var;
            x70Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
            this.R0.setClickable(true);
            this.R0.setTextSize(1, 12.0f);
            int i7 = this.M0;
            if (i7 == 1 || i7 == 2 || i7 == 4) {
                org.telegram.ui.ActionBar.s6.U(this.R0, org.telegram.ui.ActionBar.l6.G6, g6Var);
                this.R0.setAlpha(0.5f);
            } else {
                org.telegram.ui.ActionBar.s6.U(this.R0, org.telegram.ui.ActionBar.l6.z6, g6Var);
            }
            this.R0.setGravity(1);
            addView(this.R0, c8.ha.d(-1, -2.0f, 0, 0.0f, 6.0f, 0.0f, 0.0f));
        }
        this.R0.setText(charSequence);
        this.f1 = false;
        ((FrameLayout.LayoutParams) this.z0.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(20.0f);
        ((FrameLayout.LayoutParams) this.b.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(20.0f);
    }

    public void setMiniBubblesOffset(float f10) {
        this.V0 = f10;
    }

    public void setMirrorX(boolean z9) {
        this.M = z9;
        invalidate();
    }

    public void setOnSwitchedToLoopView(Runnable runnable) {
        this.P0 = runnable;
    }

    public void setParentLayout(bo boVar) {
        this.J0 = boVar;
    }

    public void setSelectedEmojis(ArrayList<String> arrayList) {
        HashSet hashSet = this.d0;
        hashSet.clear();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            String str = arrayList.get(i7);
            i7++;
            ch.o0 b10 = ch.o0.b(str);
            hashSet.add(b10);
            this.e0.add(b10);
        }
        org.telegram.messenger.g0.d0(this.b, new uh0(this, 0));
    }

    public void setSelectedReaction(ch.o0 o0Var) {
        HashSet hashSet = this.d0;
        hashSet.clear();
        if (o0Var != null) {
            hashSet.add(o0Var);
        }
        this.a0.f();
    }

    public void setSelectedReactionAnimated(ch.o0 o0Var) {
        HashSet hashSet = this.d0;
        hashSet.clear();
        if (o0Var != null) {
            hashSet.add(o0Var);
        }
        org.telegram.messenger.g0.d0(this.b, new uh0(this, 0));
    }

    public void setSelectedReactionInclusive(ch.o0 o0Var) {
        HashSet hashSet = this.d0;
        hashSet.clear();
        if (o0Var != null) {
            hashSet.add(o0Var);
        }
        org.telegram.messenger.g0.d0(this.b, new uh0(this, 0));
    }

    public void setSelectedReactions(ArrayList<org.telegram.messenger.ij> arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        HashSet hashSet = this.d0;
        hashSet.clear();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            org.telegram.messenger.ij ijVar = arrayList.get(i7);
            if (ijVar != null && (tL_messageReactions = ijVar.k.reactions) != null && tL_messageReactions.results != null) {
                for (int i10 = 0; i10 < ijVar.k.reactions.results.size(); i10++) {
                    if (ijVar.k.reactions.results.get(i10).chosen) {
                        hashSet.add(ch.o0.d(ijVar.k.reactions.results.get(i10).reaction));
                    }
                }
            }
        }
        this.a0.f();
    }

    public void setSelectedReactionsInclusive(ArrayList<org.telegram.messenger.ij> arrayList) {
        HashSet hashSet = this.d0;
        hashSet.clear();
        hashSet.addAll(i(arrayList));
        org.telegram.messenger.g0.d0(this.b, new uh0(this, 0));
    }

    public void setSkipDraw(boolean z9) {
        if (this.d1 != z9) {
            this.d1 = z9;
            if (!z9) {
                int i7 = 0;
                while (true) {
                    bi.q1 q1Var = this.b;
                    if (i7 >= q1Var.getChildCount()) {
                        break;
                    }
                    if (q1Var.getChildAt(i7) instanceof hi0) {
                        hi0 hi0Var = (hi0) q1Var.getChildAt(i7);
                        boolean z10 = hi0Var.r;
                        gi0 gi0Var = hi0Var.b;
                        if (z10 && (gi0Var.getImageReceiver().B() != null || gi0Var.getImageReceiver().m() != null)) {
                            gi0Var.setVisibility(0);
                            hi0Var.a.setVisibility(4);
                            if (hi0Var.s) {
                                hi0Var.w = true;
                            }
                        }
                        hi0Var.invalidate();
                    }
                    i7++;
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
            hashSet.add(ch.o0.d(reaction));
        }
        this.a0.f();
    }

    public void setTop(boolean z9) {
        this.L = z9;
    }

    public void setTransitionProgress(float f10) {
        this.w = f10;
        bo boVar = this.J0;
        if (boVar != null) {
            if (!this.K0 || !org.telegram.messenger.iz.j()) {
                f10 = 1.0f;
            }
            boVar.setReactionsTransitionProgress(f10);
        }
        invalidate();
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        if (f10 != getTranslationX()) {
            super.setTranslationX(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int w02;
        Paint paint = this.f;
        if (paint != null) {
            try {
                int i7 = this.M0;
                if (i7 != 2 && i7 != 4 && paint.getColor() != (w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.G8, this.k0))) {
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
        ug.z0 z0Var = this.u0;
        if (z0Var != null) {
            z0Var.setColor(i0.a.f(0.7f, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.F8, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.h5, false)));
        }
        if (getWidth() <= 0 || getHeight() <= 0 || this.b1 == org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.G8, false)) {
            return;
        }
        k();
    }

    public void m() {
    }
}
