// default package

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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class i49 extends FrameLayout implements fn7, snb {
    public static final px1 m1 = new px1(Float.class, "transitionProgress", (byte) 3);
    public final g49 A0;
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
    public r47 I;
    public final Paint I0;
    public boolean J;
    public final Paint J0;
    public int K;
    public rd2 K0;
    public long L;
    public boolean L0;
    public boolean M;
    public final pn M0;
    public boolean N;
    public final byte N0;
    public boolean O;
    public boolean O0;
    public float P;
    public boolean P0;
    public long Q;
    public Runnable Q0;
    public ValueAnimator R;
    public boolean R0;
    public FrameLayout S;
    public p66 S0;
    public tt T;
    public int T0;
    public final ArrayList U;
    public int U0;
    public final ArrayList V;
    public float V0;
    public final ArrayList W;
    public float W0;
    public jl0 X0;
    public jl0 Y0;
    public jl0 Z0;
    public boolean a;
    public final of2 a0;
    public ll0 a1;
    public final gu b;
    public final v83 b0;
    public ol0 b1;
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
    public rd2 f1;
    public final int[] g0;
    public boolean g1;
    public final Paint h;
    public h49 h0;
    public boolean h1;
    public final Rect i0;
    public boolean i1;
    public final Drawable j0;
    public Paint j1;
    public final boolean k0;
    public Matrix k1;
    public final vnb l0;
    public LinearGradient l1;
    public w49 m0;
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
    public e u0;
    public cl8 v0;
    public float w;
    public i53 w0;
    public final RectF x;
    public float x0;
    public final Path y;
    public e53 y0;
    public ValueAnimator z0;

    /* JADX WARN: Multi-variable type inference failed */
    public i49(int i, int i2, vnb vnbVar, Context context, e eVar) {
        super(context);
        byte b = 0;
        this.a = false;
        this.d = new ArrayList();
        this.e = new ArrayList();
        byte b2 = 1;
        Paint paint = new Paint(1);
        this.f = paint;
        this.h = new Paint(1);
        this.n = new Paint(1);
        this.w = 1.0f;
        this.x = new RectF();
        this.y = new Path();
        this.E = hl.L(72.0f);
        float L = hl.L(8.0f);
        this.F = L;
        this.G = L / 2.0f;
        this.H = hl.L(36.0f);
        this.U = new ArrayList(20);
        this.V = new ArrayList(10);
        this.W = new ArrayList(20);
        this.c0 = new RectF();
        this.d0 = false;
        this.e0 = new HashSet();
        this.f0 = new HashSet();
        byte b3 = 2;
        this.g0 = new int[2];
        Rect rect = new Rect();
        this.i0 = rect;
        this.D0 = new HashSet();
        this.E0 = new HashSet();
        Paint paint2 = new Paint(1);
        this.I0 = paint2;
        Paint paint3 = new Paint(1);
        this.J0 = paint3;
        this.M0 = new pn(null);
        this.P0 = true;
        this.h1 = false;
        this.N0 = i;
        this.c = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        paint2.setColor(aob.v0(aob.i6, vnbVar));
        paint3.setColor(aob.v0(aob.Ak, vnbVar));
        this.l0 = vnbVar;
        this.K = i2;
        this.u0 = eVar;
        g49 g49Var = new g49(this, context);
        this.A0 = g49Var;
        byte b4 = 8;
        g49Var.setVisibility(8);
        g49Var.P = false;
        g49Var.c.setVisibility(8);
        addView(g49Var);
        this.k0 = xea.c() && xea.o() != 0;
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.j0 = mutate;
        int L2 = hl.L(7.0f);
        rect.bottom = L2;
        rect.right = L2;
        rect.top = L2;
        rect.left = L2;
        yob.x(this, mutate, aob.Ke, null, PorterDuff.Mode.MULTIPLY);
        gu guVar = new gu((byte) 28, context, (Object) this);
        this.b = guVar;
        guVar.setClipChildren(false);
        guVar.setClipToPadding(false);
        of2 of2Var = new of2((ViewGroup) this, (byte) 4);
        this.a0 = of2Var;
        guVar.i(new v39(this, b));
        guVar.setLayoutManager(of2Var);
        guVar.setOverScrollMode(2);
        v83 v83Var = new v83(this, b3);
        this.b0 = v83Var;
        guVar.setAdapter(v83Var);
        guVar.j(new c49(this));
        guVar.j(new e98(this, b4));
        guVar.i(new v39(this, b2));
        guVar.setOnItemClickListener(new t39(this, b));
        guVar.setOnItemLongClickListener(new ba3(this, i));
        addView(guVar, tre.c(-1.0f, -1));
        setClipChildren(false);
        setClipToPadding(false);
        h();
        int paddingTop = (guVar.getLayoutParams().height - guVar.getPaddingTop()) - guVar.getPaddingBottom();
        g49Var.getLayoutParams().width = paddingTop - hl.L(12.0f);
        g49Var.getLayoutParams().height = paddingTop;
        if (i == 2 || i == 4) {
            paint.setColor(vm2.f(0.13f, -16777216, -1));
        } else {
            paint.setColor(aob.v0(aob.G8, vnbVar));
        }
        ls6.d0(i2).l1();
    }

    public static HashSet f(ArrayList arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        LongSparseArray longSparseArray = new LongSparseArray();
        HashSet hashSet = new HashSet();
        boolean z = true;
        int i = 0;
        while (i < arrayList.size()) {
            r47 r47Var = (r47) arrayList.get(i);
            hashSet.clear();
            if (r47Var != null && (tL_messageReactions = r47Var.k.reactions) != null && tL_messageReactions.results != null) {
                for (int i2 = 0; i2 < r47Var.k.reactions.results.size(); i2++) {
                    if (r47Var.k.reactions.results.get(i2).chosen) {
                        w49 d = w49.d(r47Var.k.reactions.results.get(i2).reaction);
                        if (z || longSparseArray.indexOfKey(d.h) >= 0) {
                            hashSet.add(Long.valueOf(d.h));
                            longSparseArray.put(d.h, d);
                        }
                    }
                }
            }
            int i3 = 0;
            while (i3 < longSparseArray.size()) {
                if (!hashSet.contains(Long.valueOf(longSparseArray.keyAt(i3)))) {
                    longSparseArray.removeAt(i3);
                    i3--;
                }
                i3++;
            }
            i++;
            z = false;
        }
        HashSet hashSet2 = new HashSet();
        for (int i4 = 0; i4 < longSparseArray.size(); i4++) {
            if (longSparseArray.valueAt(i4) != null) {
                hashSet2.add((w49) longSparseArray.valueAt(i4));
            }
        }
        return hashSet2;
    }

    public final void a(boolean z) {
        e53 e53Var = this.y0;
        if (e53Var != null) {
            if (!e53Var.q || !z) {
                e53Var.q = true;
                if (z) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    byte b = 0;
                    ofFloat.addUpdateListener(new z43(e53Var, b));
                    ofFloat.addListener(new c53(e53Var, b));
                    ofFloat.setDuration(150L);
                    ofFloat.start();
                } else {
                    e53Var.f();
                }
            }
            this.y0 = null;
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.G8));
        hashSet.add(Integer.valueOf(aob.F8));
        hashSet.add(Integer.valueOf(aob.h5));
    }

    public final void b() {
        e53 e53Var = this.y0;
        if (e53Var != null) {
            e53Var.d();
        }
    }

    public final void c(float f, float f2, float f3, int i, Canvas canvas) {
        k43 k43Var;
        RectF rectF;
        Canvas canvas2;
        float f4;
        if (this.N0 == 1) {
            return;
        }
        canvas.save();
        boolean z = this.M;
        RectF rectF2 = this.x;
        if (z) {
            float measuredWidth = getMeasuredWidth();
            float f5 = rectF2.top;
            float measuredHeight = getMeasuredHeight();
            k43Var = k43.f;
            canvas.clipRect(0.0f, 0.0f, measuredWidth, (hl.R1(f5, measuredHeight, k43Var.getInterpolation(this.P)) - ((int) Math.ceil((1.0f - this.w) * (rectF2.height() / 2.0f)))) + 1.0f);
        } else {
            float f6 = rectF2.bottom;
            k43Var = k43.f;
            canvas.clipRect(0.0f, (hl.R1(f6, 0.0f, k43Var.getInterpolation(this.P)) - ((int) Math.ceil((1.0f - this.w) * (rectF2.height() / 2.0f)))) - 1.0f, getMeasuredWidth(), hl.R1(hl.L(8.0f) + getMeasuredHeight(), getPaddingTop() - d(), k43Var.getInterpolation(this.P)));
        }
        float width = ((ob6.a0 || this.N) ? this.H : getWidth() - this.H) + this.V0;
        float paddingTop = this.M ? getPaddingTop() - d() : (getHeight() - getPaddingBottom()) + d();
        int L = hl.L(3.0f);
        Drawable drawable = this.j0;
        drawable.setAlpha(i);
        Paint paint = this.f;
        paint.setAlpha(i);
        float f7 = width - f;
        float f8 = L;
        float f9 = f8 * f2;
        int i2 = (int) (f7 - f9);
        float f10 = paddingTop - f;
        int i3 = (int) (f10 - f9);
        float f11 = width + f;
        int i4 = (int) (f11 + f9);
        float f12 = paddingTop + f;
        drawable.setBounds(i2, i3, i4, (int) (f12 + f9));
        drawable.draw(canvas);
        boolean p = this.h0.p();
        float f13 = paddingTop;
        RectF rectF3 = this.c0;
        if (p) {
            rectF3.set(f7, f10, f11, f12);
            this.h0.m(canvas, rectF3, f, getX(), getY(), i, false);
            rectF = rectF3;
            f4 = f;
            canvas2 = canvas;
        } else {
            rectF = rectF3;
            canvas2 = canvas;
            f4 = f;
            if (this.Y0 != null) {
                RectF rectF4 = hl.P;
                rectF4.set(f7, f10, f11, f12);
                Rect rect = hl.Q;
                rectF4.round(rect);
                rect.inset(-hl.L(8.0f), -hl.L(8.0f));
                this.Y0.setBounds(rect);
                this.Y0.setAlpha(paint.getAlpha());
                this.Y0.draw(canvas2);
            } else {
                canvas2.drawCircle(width, f13, f4, paint);
            }
        }
        boolean z2 = ob6.a0;
        float f14 = this.F;
        float width2 = this.V0 + this.W0 + ((z2 || this.N) ? this.H - f14 : (getWidth() - this.H) + f14);
        boolean z3 = this.M;
        float f15 = this.G;
        float R1 = hl.R1(z3 ? (getPaddingTop() - d()) - hl.L(16.0f) : ((getHeight() - f15) - f8) + d(), (f15 + f8) - d(), k43Var.getInterpolation(this.P));
        float f16 = (-hl.L(1.0f)) * f2;
        drawable.setBounds((int) ((width2 - f4) - f16), (int) ((R1 - f4) - f16), (int) (width2 + f4 + f16), (int) (f4 + R1 + f16));
        drawable.draw(canvas2);
        if (this.h0.p()) {
            rectF.set(width2 - f3, R1 - f3, width2 + f3, R1 + f3);
            Canvas canvas3 = canvas2;
            this.h0.m(canvas3, rectF, f3, getX(), getY(), i, false);
            canvas2 = canvas3;
        } else if (this.Z0 != null) {
            RectF rectF5 = hl.P;
            rectF5.set(width2 - f3, R1 - f3, width2 + f3, R1 + f3);
            Rect rect2 = hl.Q;
            rectF5.round(rect2);
            rect2.inset(-hl.L(8.0f), -hl.L(8.0f));
            this.Z0.setBounds(rect2);
            this.Z0.setAlpha(paint.getAlpha());
            this.Z0.draw(canvas2);
        } else {
            canvas2.drawCircle(width2, R1, f3, paint);
        }
        canvas2.restore();
        drawable.setAlpha(jn7.d4);
        paint.setAlpha(jn7.d4);
    }

    public final float d() {
        return (int) (getPullingLeftProgress() * hl.L(6.0f));
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id != this.L || getVisibility() == 0 || (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) {
                return;
            }
            m(this.I, null, true);
            setVisibility(0);
            p(false);
            return;
        }
        if (i != jn7.l4) {
            if (i == jn7.w3) {
                m(this.I, null, true);
            }
        } else if (this.N0 == 4) {
            invalidate();
            gu guVar = this.b;
            guVar.invalidate();
            guVar.i1();
            for (int i3 = 0; i3 < guVar.getChildCount(); i3++) {
                View childAt = guVar.getChildAt(i3);
                if (childAt instanceof g49) {
                    g49 g49Var = (g49) childAt;
                    g49Var.a.invalidate();
                    g49Var.b.invalidate();
                } else {
                    childAt.invalidate();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:199:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x08ea  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float width;
        float f;
        float max;
        float f2;
        float f3;
        byte b;
        float f4;
        RectF rectF;
        int i;
        float f5;
        int i2;
        RectF rectF2;
        gu guVar;
        int i3;
        float f6;
        boolean n;
        RectF rectF3;
        int i4;
        RectF rectF4;
        int i5;
        gu guVar2;
        float f7;
        int S;
        float f8;
        float f9;
        float x;
        float scaleX;
        float f10;
        float f11;
        wl wlVar;
        nl nlVar;
        int i6;
        h49 h49Var;
        Canvas canvas2 = canvas;
        long min = Math.min(16L, System.currentTimeMillis() - this.Q);
        this.Q = System.currentTimeMillis();
        boolean z = this.O;
        float f12 = this.P;
        if (z) {
            if (f12 != 1.0f) {
                this.P = qu6.z(min, 220.0f, f12, 1.0f);
                invalidate();
            }
        } else if (f12 != 0.0f) {
            this.P = bp1.x(min, 220.0f, f12, 0.0f);
            invalidate();
        }
        p66 p66Var = this.S0;
        if (p66Var != null) {
            p66Var.setTranslationY(-d());
        }
        float max2 = (Math.max(0.25f, Math.min(this.w, 1.0f)) - 0.25f) / 0.75f;
        float f13 = this.F * max2;
        float f14 = this.G * max2;
        HashSet hashSet = this.E0;
        hashSet.clear();
        HashSet hashSet2 = this.D0;
        hashSet.addAll(hashSet2);
        hashSet2.clear();
        if (this.d1) {
            invalidate();
        }
        w49 w49Var = this.m0;
        byte b2 = this.N0;
        if (w49Var != null && b2 != 5 && ((h49Var = this.h0) == null || h49Var.j())) {
            float f15 = this.o0;
            if (f15 != 1.0f) {
                float longPressTimeout = (16.0f / (this.m0.a ? ViewConfiguration.getLongPressTimeout() : 1500.0f)) + f15;
                this.o0 = longPressTimeout;
                if (longPressTimeout >= 1.0f) {
                    this.o0 = 1.0f;
                }
                invalidate();
            }
        }
        w49 w49Var2 = this.m0;
        if (w49Var2 == null || !w49Var2.a) {
            float f16 = this.o0;
            this.q0 = (f16 * 2.0f) + 1.0f;
            this.r0 = 1.0f - (f16 * 0.15f);
        } else {
            this.q0 = 1.0f;
            this.r0 = 1.0f;
        }
        int save = canvas2.save();
        if (ob6.a0 || this.N) {
            width = getWidth();
            f = 0.125f;
        } else {
            width = getWidth();
            f = 0.875f;
        }
        float f17 = width * f;
        float f18 = this.w;
        if (f18 != 1.0f) {
            canvas2.scale(f18, f18, f17, getHeight() / 2.0f);
        }
        if (ob6.a0 || this.N) {
            max = Math.max(0.25f, this.w);
            f2 = 0.0f;
        } else {
            f2 = 1.0f - Math.max(0.25f, this.w);
            max = 1.0f;
        }
        float pullingLeftProgress = getPullingLeftProgress();
        float d = d();
        rd2 rd2Var = this.f1;
        if (rd2Var != null) {
            rd2Var.setExpandSize(d);
        }
        float width2 = (getWidth() - getPaddingRight()) * Math.min(1.0f, f2);
        float topOffset = getTopOffset();
        float paddingTop = getPaddingTop();
        gu guVar3 = this.b;
        float f19 = f2;
        float f20 = max;
        RectF rectF5 = this.x;
        rectF5.set(getPaddingLeft() + width2, (((1.0f - this.r0) * guVar3.getMeasuredHeight()) + paddingTop) - d, (getWidth() - getPaddingRight()) * max, (getHeight() - getPaddingBottom()) + d);
        this.E = c00.c(d, 2.0f, rectF5.height() - topOffset, 2.0f);
        if (b2 != 1) {
            f3 = 255.0f;
            int i7 = (int) (Utilities.i(1.0f - (this.x0 / 0.05f), 1.0f, 0.0f) * 255.0f);
            Drawable drawable = this.j0;
            drawable.setAlpha(i7);
            float paddingLeft = getPaddingLeft();
            int width3 = getWidth() - getPaddingRight();
            Rect rect = this.i0;
            int i8 = (int) d;
            drawable.setBounds((int) ((((width3 + rect.right) * f19) + paddingLeft) - rect.left), (getPaddingTop() - rect.top) - i8, (int) (((getWidth() - getPaddingRight()) + rect.right) * f20), (getHeight() - getPaddingBottom()) + rect.bottom + i8);
            if (this.X0 == null) {
                drawable.draw(canvas2);
            }
        } else {
            f3 = 255.0f;
        }
        canvas2.restoreToCount(save);
        if (this.e1) {
            b = b2;
            f4 = f17;
            rectF = rectF5;
            i = 1;
            f5 = 2.0f;
        } else {
            int save2 = canvas2.save();
            float f21 = this.w;
            if (f21 != 1.0f) {
                f5 = 2.0f;
                canvas2.scale(f21, f21, f17, getHeight() / 2.0f);
            } else {
                f5 = 2.0f;
            }
            if (b2 == 1 || this.h0.p()) {
                i6 = save2;
                b = b2;
                rectF = rectF5;
                f4 = f17;
                i = 1;
                this.h0.m(canvas, rectF, this.E, getX(), getY(), jn7.d4, false);
                canvas2 = canvas;
            } else {
                jl0 jl0Var = this.X0;
                Paint paint = this.f;
                if (jl0Var != null) {
                    Rect rect2 = hl.Q;
                    rectF5.round(rect2);
                    rect2.inset(-hl.L(8.0f), -hl.L(8.0f));
                    this.X0.setBounds(rect2);
                    this.X0.setAlpha(paint.getAlpha());
                    this.X0.draw(canvas2);
                } else {
                    float f22 = this.E;
                    canvas2.drawRoundRect(rectF5, f22, f22, paint);
                }
                i6 = save2;
                b = b2;
                f4 = f17;
                rectF = rectF5;
                i = 1;
            }
            if (this.d0) {
                Iterator it = this.e0.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        float f23 = this.E;
                        float l = Utilities.l(1.0f - getPullingLeftProgress());
                        if (this.j1 == null) {
                            this.j1 = new Paint(i);
                        }
                        if (this.k1 == null) {
                            this.k1 = new Matrix();
                        }
                        if (this.l1 == null) {
                            int v0 = aob.v0(aob.Ak, this.l0);
                            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, hl.L(64.0f), 0.0f, new int[]{v0, aob.p1(0.0f, v0)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                            this.l1 = linearGradient;
                            this.j1.setShader(linearGradient);
                        }
                        this.k1.reset();
                        this.k1.postTranslate(rectF.left, rectF.top);
                        this.l1.setLocalMatrix(this.k1);
                        this.j1.setAlpha((int) (l * f3));
                        canvas2.drawRoundRect(rectF, f23, f23, this.j1);
                    } else if (((w49) it.next()).a) {
                        break;
                    }
                }
            }
            canvas2.restoreToCount(i6);
        }
        Path path = this.y;
        path.rewind();
        float f24 = this.E;
        path.addRoundRect(rectF, f24, f24, Path.Direction.CW);
        int save3 = canvas2.save();
        float f25 = this.w;
        if (f25 != 1.0f) {
            canvas2.scale(f25, f25, f4, getHeight() / f5);
        }
        if (this.w != 0.0f) {
            byte b3 = b;
            if (getAlpha() == 1.0f || b3 == 5) {
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                while (i9 < guVar3.getChildCount()) {
                    View childAt = guVar3.getChildAt(i9);
                    boolean z2 = i;
                    int abs = (this.w == 1.0f || !xea.j()) ? i11 : (int) (Math.abs((((childAt.getMeasuredWidth() / f5) + childAt.getLeft()) / guVar3.getMeasuredWidth()) - 0.8f) * 200.0f);
                    float f26 = f14;
                    if (childAt instanceof g49) {
                        g49 g49Var = (g49) guVar3.getChildAt(i9);
                        i5 = i9;
                        if (this.C0 != 0.0f) {
                            i4 = save3;
                            f9 = hl.L(46.0f) * Utilities.i(g49Var.getLeft() / (getMeasuredWidth() - hl.L(34.0f)), 1.0f, 0.0f) * getPullingLeftProgress();
                        } else {
                            i4 = save3;
                            f9 = 0.0f;
                        }
                        w49 w49Var3 = g49Var.e;
                        f49 f49Var = g49Var.a;
                        float f27 = f9;
                        f49 f49Var2 = g49Var.b;
                        f49 f49Var3 = g49Var.c;
                        rectF4 = rectF;
                        if (w49Var3.equals(this.m0)) {
                            f49 f49Var4 = f49Var2.getVisibility() == 0 ? f49Var2 : f49Var;
                            g49Var.setPivotX(g49Var.getMeasuredWidth() >> 1);
                            g49Var.setPivotY(f49Var4.getY() + f49Var4.getMeasuredHeight());
                            g49Var.setScaleX(this.q0);
                            g49Var.setScaleY(this.q0);
                            if (!this.s0) {
                                if (this.R == null) {
                                    f49Var3.setVisibility(0);
                                    f49Var3.setAlpha(1.0f);
                                    if (f49Var3.getImageReceiver().B() || ((wlVar = f49Var3.e) != null && (nlVar = wlVar.k) != null && nlVar.B())) {
                                        f49Var4.setAlpha(0.0f);
                                    }
                                    f11 = 1.0f;
                                } else {
                                    f11 = 1.0f;
                                    f49Var3.setAlpha(1.0f - this.p0);
                                    f49Var4.setAlpha(this.p0);
                                }
                                if (this.o0 == f11) {
                                    this.s0 = z2;
                                    if (System.currentTimeMillis() - this.t0 > 300) {
                                        this.t0 = System.currentTimeMillis();
                                        guVar2 = guVar3;
                                        this.h0.e(g49Var, g49Var.e, true, false);
                                        canvas2.save();
                                        x = g49Var.getX() + guVar2.getX();
                                        scaleX = ((g49Var.getScaleX() * g49Var.getMeasuredWidth()) - g49Var.getMeasuredWidth()) / f5;
                                        f10 = x - scaleX;
                                        if (f10 >= 0.0f && g49Var.getTranslationX() >= 0.0f) {
                                            g49Var.setTranslationX((-f10) - f27);
                                        } else if (g49Var.getMeasuredWidth() + x + scaleX > getMeasuredWidth() || g49Var.getTranslationX() > 0.0f) {
                                            g49Var.setTranslationX(0.0f - f27);
                                        } else {
                                            g49Var.setTranslationX((((getMeasuredWidth() - x) - g49Var.getMeasuredWidth()) - scaleX) - f27);
                                        }
                                        canvas2.translate(g49Var.getX() + guVar2.getX(), g49Var.getY() + guVar2.getY());
                                        canvas2.scale(g49Var.getScaleX(), g49Var.getScaleY(), g49Var.getPivotX(), g49Var.getPivotY());
                                        g49Var.draw(canvas2);
                                        canvas2.restore();
                                    }
                                }
                            }
                            guVar2 = guVar3;
                            canvas2.save();
                            x = g49Var.getX() + guVar2.getX();
                            scaleX = ((g49Var.getScaleX() * g49Var.getMeasuredWidth()) - g49Var.getMeasuredWidth()) / f5;
                            f10 = x - scaleX;
                            if (f10 >= 0.0f) {
                            }
                            if (g49Var.getMeasuredWidth() + x + scaleX > getMeasuredWidth()) {
                            }
                            g49Var.setTranslationX(0.0f - f27);
                            canvas2.translate(g49Var.getX() + guVar2.getX(), g49Var.getY() + guVar2.getY());
                            canvas2.scale(g49Var.getScaleX(), g49Var.getScaleY(), g49Var.getPivotX(), g49Var.getPivotY());
                            g49Var.draw(canvas2);
                            canvas2.restore();
                        } else {
                            guVar2 = guVar3;
                            int S2 = RecyclerView.S(g49Var);
                            float measuredWidth = (((this.q0 - 1.0f) * g49Var.getMeasuredWidth()) / 3.0f) - (((1.0f - this.r0) * g49Var.getMeasuredWidth()) * (Math.abs(this.n0 - S2) - 1));
                            if (S2 < this.n0) {
                                g49Var.setPivotX(0.0f);
                                g49Var.setTranslationX(-measuredWidth);
                            } else {
                                g49Var.setPivotX(g49Var.getMeasuredWidth() - f27);
                                g49Var.setTranslationX(measuredWidth - f27);
                            }
                            g49Var.setPivotY(f49Var.getY() + f49Var.getMeasuredHeight());
                            g49Var.setScaleX(this.r0);
                            g49Var.setScaleY(this.r0);
                            f49Var3.setVisibility(4);
                            f49Var.setAlpha(1.0f);
                        }
                        if (childAt.getLeft() > i10) {
                            i10 = childAt.getLeft();
                        }
                        if (!this.O0 && (!g49Var.r || f49Var.getImageReceiver().y() != null)) {
                            if ((g49Var.getMeasuredWidth() / f5) + g49Var.getX() > 0.0f && (g49Var.getMeasuredWidth() / f5) + g49Var.getX() < guVar2.getWidth()) {
                                if (!hashSet.contains(g49Var)) {
                                    g49Var.b(abs);
                                    abs += 30;
                                }
                                hashSet2.add(g49Var);
                            } else if (!g49Var.n) {
                                g49Var.c();
                            }
                        }
                    } else {
                        i4 = save3;
                        rectF4 = rectF;
                        i5 = i9;
                        guVar2 = guVar3;
                        if (childAt == this.S) {
                            if ((childAt.getMeasuredWidth() / f5) + childAt.getX() <= 0.0f || (childAt.getMeasuredWidth() / f5) + childAt.getX() >= guVar2.getWidth()) {
                                cl8 cl8Var = this.v0;
                                f7 = 0.0f;
                                cl8Var.setScaleX(0.0f);
                                cl8Var.setScaleY(0.0f);
                                if (childAt == this.T) {
                                    if ((childAt.getMeasuredWidth() / f5) + childAt.getX() <= f7 || (childAt.getMeasuredWidth() / f5) + childAt.getX() >= guVar2.getWidth()) {
                                        i53 i53Var = this.w0;
                                        i53Var.setScaleX(0.0f);
                                        i53Var.setScaleY(0.0f);
                                        ((i49) i53Var.c).T.invalidate();
                                        ValueAnimator valueAnimator = (ValueAnimator) i53Var.b;
                                        if (valueAnimator != null) {
                                            valueAnimator.cancel();
                                        }
                                    } else {
                                        if (!hashSet.contains(childAt)) {
                                            if (this.w != 1.0f) {
                                                i53 i53Var2 = this.w0;
                                                i53Var2.setScaleX(0.0f);
                                                i53Var2.setScaleY(0.0f);
                                                ((i49) i53Var2.c).T.invalidate();
                                                ValueAnimator valueAnimator2 = (ValueAnimator) i53Var2.b;
                                                if (valueAnimator2 != null) {
                                                    valueAnimator2.cancel();
                                                }
                                            }
                                            i53 i53Var3 = this.w0;
                                            boolean z3 = i86.e(8200) || xea.o() >= 1;
                                            i53Var3.invalidate();
                                            ValueAnimator valueAnimator3 = (ValueAnimator) i53Var3.b;
                                            if (valueAnimator3 != null) {
                                                valueAnimator3.removeAllListeners();
                                                ((ValueAnimator) i53Var3.b).cancel();
                                            }
                                            if (z3) {
                                                ValueAnimator ofFloat = ValueAnimator.ofFloat(i53Var3.getScaleX(), 1.0f);
                                                i53Var3.b = ofFloat;
                                                ofFloat.setInterpolator(hl.H);
                                                ((ValueAnimator) i53Var3.b).addUpdateListener(new pv7(i53Var3, (byte) 29));
                                                ((ValueAnimator) i53Var3.b).setStartDelay((long) (abs * ((i49) i53Var3.c).c));
                                                ((ValueAnimator) i53Var3.b).setDuration(300L);
                                                ((ValueAnimator) i53Var3.b).start();
                                            } else {
                                                i53Var3.setScaleX(1.0f);
                                                i53Var3.setScaleY(1.0f);
                                            }
                                            abs += 30;
                                        }
                                        hashSet2.add(childAt);
                                    }
                                }
                                S = RecyclerView.S(childAt);
                                float measuredWidth2 = (((this.q0 - 1.0f) * childAt.getMeasuredWidth()) / 3.0f) - (((1.0f - this.r0) * childAt.getMeasuredWidth()) * (Math.abs(this.n0 - S) - 1));
                                if (S >= this.n0) {
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
                                        cl8 cl8Var2 = this.v0;
                                        f8 = 0.0f;
                                        cl8Var2.setScaleX(0.0f);
                                        cl8Var2.setScaleY(0.0f);
                                    } else {
                                        f8 = 0.0f;
                                    }
                                    cl8 cl8Var3 = this.v0;
                                    fe1 fe1Var = cl8Var3.K;
                                    if (fe1Var != null) {
                                        fe1Var.g = f8;
                                        fe1Var.j = false;
                                    }
                                    cl8Var3.invalidate();
                                    cl8Var3.animate().scaleX(1.1f).scaleY(1.1f).setStartDelay(abs).setInterpolator(hl.H).setDuration(300L);
                                    abs += 30;
                                }
                                hashSet2.add(childAt);
                            }
                        }
                        f7 = 0.0f;
                        if (childAt == this.T) {
                        }
                        S = RecyclerView.S(childAt);
                        float measuredWidth22 = (((this.q0 - 1.0f) * childAt.getMeasuredWidth()) / 3.0f) - (((1.0f - this.r0) * childAt.getMeasuredWidth()) * (Math.abs(this.n0 - S) - 1));
                        if (S >= this.n0) {
                        }
                        childAt.setScaleX(this.r0);
                        childAt.setScaleY(this.r0);
                    }
                    i11 = abs;
                    i9 = i5 + 1;
                    canvas2 = canvas;
                    f14 = f26;
                    save3 = i4;
                    guVar3 = guVar2;
                    rectF = rectF4;
                    i = 1;
                }
                i2 = save3;
                rectF2 = rectF;
                guVar = guVar3;
                f6 = f14;
                g49 g49Var2 = this.A0;
                if (pullingLeftProgress > 0.0f) {
                    float pullingLeftProgress2 = getPullingLeftProgress();
                    int measuredWidth3 = g49Var2.getMeasuredWidth() - hl.L(f5);
                    float f28 = i10 + measuredWidth3;
                    float i12 = Utilities.i(f28 / (getMeasuredWidth() - g49Var2.getMeasuredWidth()), 1.0f, 0.0f) * pullingLeftProgress2 * measuredWidth3;
                    if (g49Var2.getTag() == null) {
                        g49Var2.setTag(Float.valueOf(1.0f));
                        g49Var2.c();
                        g49Var2.b(0);
                    }
                    float i13 = Utilities.i(pullingLeftProgress2, 1.0f, 0.0f);
                    g49Var2.setScaleX(i13);
                    g49Var2.setScaleY(i13);
                    i3 = 1;
                    g49Var2.setTranslationX(((guVar.getX() + f28) - i12) + (-((b3 == 1 || b3 == 2) ? hl.L(8.0f) : hl.L(20.0f))));
                    if (g49Var2.getVisibility() != 0) {
                        g49Var2.setVisibility(0);
                    }
                } else {
                    i3 = 1;
                    if (g49Var2.getVisibility() != 8 && this.P0) {
                        g49Var2.setVisibility(8);
                    }
                    if (g49Var2.getTag() != null) {
                        g49Var2.setTag(null);
                    }
                }
                if (!this.e1 && this.y0 != null) {
                    int z4 = (int) qd4.z(1.0f, this.x0, Utilities.i(1.0f - (this.x0 / 0.2f), 1.0f, 0.0f), f3);
                    canvas.save();
                    c(f13, max2, f6, z4, canvas);
                    canvas.restore();
                    return;
                }
                float f29 = f6;
                n = n();
                if (!n) {
                    canvas.clipPath(path);
                }
                if (!ob6.a0 || this.N) {
                    i3 = -1;
                }
                canvas.translate((1.0f - this.w) * getWidth() * i3, 0.0f);
                guVar.setTranslationX(-width2);
                super.dispatchDraw(canvas);
                if (!n) {
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
                canvas.restoreToCount(i2);
                c(f13, max2, f29, jn7.d4, canvas);
                invalidate();
            }
        }
        i2 = save3;
        rectF2 = rectF;
        guVar = guVar3;
        i3 = i;
        f6 = f14;
        if (!this.e1) {
        }
        float f292 = f6;
        n = n();
        if (!n) {
        }
        if (!ob6.a0) {
        }
        i3 = -1;
        canvas.translate((1.0f - this.w) * getWidth() * i3, 0.0f);
        guVar.setTranslationX(-width2);
        super.dispatchDraw(canvas);
        if (!n) {
        }
        canvas.restoreToCount(i2);
        c(f13, max2, f292, jn7.d4, canvas);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        int i = 0;
        byte b = this.N0;
        if (b == 4) {
            Iterator it = this.e0.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                w49 w49Var = (w49) it.next();
                if (!hashSet.contains(w49Var)) {
                    hashSet.add(w49Var);
                    arrayList.add(w49Var);
                    i2++;
                    if (i2 >= 8) {
                        return;
                    }
                }
            }
            ArrayList arrayList2 = ls6.d0(this.K).n;
            while (i < arrayList2.size()) {
                w49 c = w49.c((TLRPC.TL_availableReaction) arrayList2.get(i));
                if (!hashSet.contains(c)) {
                    hashSet.add(c);
                    arrayList.add(c);
                    i2++;
                    if (i2 >= 8) {
                        return;
                    }
                }
                i++;
            }
            return;
        }
        if (!this.F0 || b == 4) {
            int i3 = this.K;
            if (b != 3) {
                ArrayList arrayList3 = ls6.d0(i3).n;
                while (i < arrayList3.size()) {
                    arrayList.add(w49.c((TLRPC.TL_availableReaction) arrayList3.get(i)));
                    i++;
                }
                return;
            }
            ArrayList arrayList4 = ls6.d0(i3).H1;
            int i4 = 0;
            while (i < arrayList4.size()) {
                w49 d = w49.d((TLRPC.Reaction) arrayList4.get(i));
                if (!hashSet.contains(d)) {
                    hashSet.add(d);
                    arrayList.add(d);
                    i4++;
                }
                if (i4 == 16) {
                    return;
                } else {
                    i++;
                }
            }
            return;
        }
        int i5 = this.K;
        if (b == 5) {
            TLRPC.messages_AvailableEffects E0 = uc7.s1(i5).E0();
            if (E0 != null) {
                while (i < E0.effects.size()) {
                    w49 e = w49.e(E0.effects.get(i));
                    if (!hashSet.contains(e)) {
                        hashSet.add(e);
                        arrayList.add(e);
                    }
                    i++;
                }
                return;
            }
            return;
        }
        ArrayList arrayList5 = b == 3 ? ls6.d0(i5).H1 : ls6.d0(i5).G1;
        if (b == 3) {
            TLRPC.TL_messages_savedReactionsTags H1 = uc7.s1(this.K).H1(0L, false);
            if (H1 != null) {
                for (int i6 = 0; i6 < H1.tags.size(); i6++) {
                    w49 d2 = w49.d(H1.tags.get(i6).reaction);
                    if (!hashSet.contains(d2)) {
                        hashSet.add(d2);
                        arrayList.add(d2);
                    }
                }
            }
            for (int i7 = 0; i7 < arrayList5.size(); i7++) {
                w49 d3 = w49.d((TLRPC.Reaction) arrayList5.get(i7));
                if (!hashSet.contains(d3)) {
                    hashSet.add(d3);
                    arrayList.add(d3);
                }
            }
        } else {
            for (int i8 = 0; i8 < arrayList5.size(); i8++) {
                w49 d4 = w49.d((TLRPC.Reaction) arrayList5.get(i8));
                if (!hashSet.contains(d4) && (b == 3 || yac.h(this.K).p() || d4.g == 0)) {
                    hashSet.add(d4);
                    arrayList.add(d4);
                }
            }
        }
        if (b != 3 || yac.h(this.K).p()) {
            ArrayList arrayList6 = ls6.d0(this.K).F1;
            for (int i9 = 0; i9 < arrayList6.size(); i9++) {
                w49 d5 = w49.d((TLRPC.Reaction) arrayList6.get(i9));
                if (!hashSet.contains(d5)) {
                    hashSet.add(d5);
                    arrayList.add(d5);
                }
            }
            ArrayList arrayList7 = ls6.d0(this.K).n;
            while (i < arrayList7.size()) {
                w49 c2 = w49.c((TLRPC.TL_availableReaction) arrayList7.get(i));
                if (!hashSet.contains(c2)) {
                    hashSet.add(c2);
                    arrayList.add(c2);
                }
                i++;
            }
        }
    }

    public void g() {
        int i = 0;
        while (true) {
            gu guVar = this.b;
            if (i >= guVar.getChildCount()) {
                return;
            }
            View childAt = guVar.getChildAt(i);
            if (childAt instanceof g49) {
                ((g49) childAt).b.invalidate();
            }
            i++;
        }
    }

    public h49 getDelegate() {
        return this.h0;
    }

    public int getHintTextWidth() {
        return this.T0;
    }

    public int getItemsCount() {
        return (n() ? 1 : 0) + this.U.size() + 1;
    }

    public float getPullingLeftProgress() {
        return Utilities.i(this.C0 / hl.L(42.0f), 2.0f, 0.0f);
    }

    public e53 getReactionsWindow() {
        return this.y0;
    }

    public String getSelectedEmoji() {
        TLRPC.Document e;
        HashSet hashSet = this.e0;
        if (hashSet.isEmpty()) {
            return "";
        }
        w49 w49Var = (w49) hashSet.iterator().next();
        long j = w49Var.g;
        String str = null;
        if (j != 0 && (e = wl.e(this.K, j)) != null) {
            str = r47.V(e, null, null);
        }
        if (TextUtils.isEmpty(str)) {
            str = w49Var.f;
        }
        return TextUtils.isEmpty(str) ? "👍" : str;
    }

    public HashSet<w49> getSelectedReactions() {
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
        if (n()) {
            return (hl.L(36.0f) * itemsCount) - hl.L(4.0f);
        }
        return hl.L(16.0f) + bp1.h(itemsCount, 1, hl.L(2.0f), hl.L(36.0f) * itemsCount);
    }

    public List<w49> getVisibleReactionsList() {
        return this.U;
    }

    public int getWindowType() {
        byte b = this.N0;
        if (b == 4) {
            return 13;
        }
        if (b == 3) {
            return 11;
        }
        if (b == 5) {
            return 14;
        }
        return this.G0 ? 8 : 1;
    }

    public View getWindowView() {
        e53 e53Var = this.y0;
        if (e53Var == null) {
            return null;
        }
        return e53Var.c;
    }

    public final void h() {
        int L = hl.L(24.0f);
        float height = getHeight() / 2.0f;
        int w0 = aob.w0(null, aob.G8, false);
        this.c1 = w0;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.h.setShader(new LinearGradient(0.0f, height, L, height, w0, 0, tileMode));
        this.n.setShader(new LinearGradient(getWidth(), height, getWidth() - L, height, w0, 0, tileMode));
        invalidate();
    }

    public final void i(View view, w49 w49Var, boolean z) {
        h49 h49Var = this.h0;
        if (h49Var != null) {
            h49Var.e(view, w49Var, z, true);
        }
        if (this.N0 == 5) {
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    public final void k() {
        this.P0 = true;
        this.n0 = 0;
        this.o0 = 0.0f;
        this.C0 = 0.0f;
        this.m0 = null;
        this.s0 = false;
        u39 u39Var = new u39(this, (byte) 1);
        gu guVar = this.b;
        hl.d0(guVar, u39Var);
        this.D0.clear();
        guVar.invalidate();
        tt ttVar = this.T;
        if (ttVar != null) {
            ttVar.invalidate();
        }
        invalidate();
    }

    public final void l(ll0 ll0Var, ol0 ol0Var) {
        this.a1 = ll0Var;
        this.b1 = ol0Var;
        jl0 c = ll0Var.c(this, null, true);
        c.p(ol0Var);
        ik8.r(c, hl.L(24.0f), 8.0f);
        this.X0 = c;
        jl0 c2 = ll0Var.c(this, null, true);
        c2.p(ol0Var);
        ik8.r(c2, hl.L(8.0f), 8.0f);
        this.Y0 = c2;
        jl0 c3 = ll0Var.c(this, null, true);
        c3.p(ol0Var);
        ik8.r(c3, hl.L(4.0f), 8.0f);
        this.Z0 = c3;
    }

    public final void m(r47 r47Var, TLRPC.ChatFull chatFull, boolean z) {
        int i;
        TLRPC.ChatFull chatFull2;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions2;
        this.I = r47Var;
        if (r47Var == null || (message = r47Var.k) == null || (tL_messageReactions2 = message.reactions) == null) {
            i = 0;
        } else {
            ArrayList<TLRPC.ReactionCount> arrayList = tL_messageReactions2.results;
            int size = arrayList.size();
            i = 0;
            int i2 = 0;
            while (i2 < size) {
                TLRPC.ReactionCount reactionCount = arrayList.get(i2);
                i2++;
                if (!(reactionCount.reaction instanceof TLRPC.TL_reactionPaid)) {
                    i++;
                }
            }
        }
        byte b = this.N0;
        this.J = b == 0 && this.I != null && i >= uc7.s1(this.K).O0(r47.B0(this.I.k));
        this.B0 = b == 0 && this.I != null && xc2.V(uc7.s1(this.K).M0(Long.valueOf(-r47.B0(this.I.k))));
        ArrayList arrayList2 = new ArrayList();
        if (r47Var == null || !r47Var.k3()) {
            chatFull2 = chatFull;
        } else {
            chatFull2 = uc7.s1(this.K).N0(-r47Var.Z0());
            if (chatFull2 == null) {
                this.L = -r47Var.Z0();
                uc7.s1(this.K).e3(0, -r47Var.Z0(), true);
                setVisibility(4);
                return;
            }
        }
        this.d0 = false;
        if (b == 3) {
            this.F0 = yac.h(this.K).p();
            e(arrayList2);
        } else if (b == 5) {
            this.F0 = true;
            e(arrayList2);
        } else if (this.J) {
            this.F0 = false;
            if (chatFull2 != null && chatFull2.paid_reactions_available) {
                this.d0 = true;
                w49 w49Var = new w49();
                w49Var.a = true;
                arrayList2.add(w49Var);
            }
            ArrayList<TLRPC.ReactionCount> arrayList3 = this.I.k.reactions.results;
            int size2 = arrayList3.size();
            int i3 = 0;
            while (i3 < size2) {
                TLRPC.ReactionCount reactionCount2 = arrayList3.get(i3);
                i3++;
                arrayList2.add(w49.d(reactionCount2.reaction));
            }
        } else if (chatFull2 != null) {
            if (chatFull2.paid_reactions_available) {
                this.d0 = true;
                w49 w49Var2 = new w49();
                w49Var2.a = true;
                arrayList2.add(w49Var2);
            }
            TLRPC.ChatReactions chatReactions = chatFull2.available_reactions;
            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                TLRPC.Chat M0 = uc7.s1(this.K).M0(Long.valueOf(chatFull2.id));
                if (M0 == null || xc2.V(M0)) {
                    this.F0 = false;
                } else {
                    this.F0 = true;
                }
                e(arrayList2);
            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                ArrayList<TLRPC.Reaction> arrayList4 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                int size3 = arrayList4.size();
                int i4 = 0;
                while (i4 < size3) {
                    TLRPC.Reaction reaction = arrayList4.get(i4);
                    i4++;
                    TLRPC.Reaction reaction2 = reaction;
                    ArrayList arrayList5 = ls6.d0(this.K).n;
                    int size4 = arrayList5.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 < size4) {
                            Object obj = arrayList5.get(i5);
                            i5++;
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj;
                            if (!(reaction2 instanceof TLRPC.TL_reactionEmoji) || !tL_availableReaction.reaction.equals(((TLRPC.TL_reactionEmoji) reaction2).emoticon)) {
                                if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                    arrayList2.add(w49.d(reaction2));
                                    break;
                                }
                            } else {
                                arrayList2.add(w49.d(reaction2));
                                break;
                            }
                        }
                    }
                }
            }
        } else {
            this.F0 = true;
            e(arrayList2);
        }
        HashSet hashSet = new HashSet();
        int i6 = 0;
        while (i6 < arrayList2.size()) {
            if (hashSet.contains(arrayList2.get(i6))) {
                i6--;
                arrayList2.remove(i6);
            } else {
                hashSet.add((w49) arrayList2.get(i6));
            }
            i6++;
        }
        this.G0 = !this.J && ((!this.F0 && arrayList2.size() > 16) || (this.F0 && !yac.h(this.K).p() && uc7.s1(this.K).M3()));
        if (b == 3 && !yac.h(this.K).p()) {
            this.G0 = false;
        }
        if (b == 4) {
            this.G0 = true;
        }
        ArrayList arrayList6 = this.U;
        arrayList6.clear();
        if (n()) {
            int L = (hl.q.x - hl.L(36.0f)) / hl.L(34.0f);
            if (L > 7) {
                L = 7;
            }
            int i7 = 0;
            if (L < 1) {
                L = 1;
            }
            while (i7 < Math.min(arrayList2.size(), L)) {
                arrayList6.add((w49) arrayList2.get(i7));
                i7++;
            }
            if (i7 < arrayList2.size()) {
                this.A0.d(-1, (w49) arrayList2.get(i7));
            }
        } else {
            arrayList6.addAll(arrayList2);
        }
        this.H0 = true;
        for (int i8 = 0; i8 < arrayList6.size(); i8++) {
            if (((w49) arrayList6.get(i8)).g != 0) {
                this.H0 = false;
            }
        }
        ArrayList arrayList7 = this.W;
        arrayList7.clear();
        arrayList7.addAll(arrayList2);
        if (arrayList2.size() * (((getLayoutParams().height - ((int) getTopOffset())) - getPaddingTop()) - getPaddingBottom()) < hl.L(200.0f)) {
            getLayoutParams().width = -2;
        }
        v83 v83Var = this.b0;
        i49 i49Var = (i49) v83Var.e;
        ArrayList arrayList8 = i49Var.e;
        ArrayList arrayList9 = i49Var.U;
        ArrayList arrayList10 = i49Var.d;
        arrayList8.clear();
        arrayList8.addAll(arrayList10);
        arrayList10.clear();
        for (int i9 = 0; i9 < arrayList9.size(); i9++) {
            w49 w49Var3 = (w49) arrayList9.get(i9);
            arrayList10.add(new y39(w49Var3.f == null ? 3 : 0, w49Var3));
        }
        if (!i49Var.V.isEmpty() && !uc7.s1(i49Var.K).M3()) {
            arrayList10.add(new y39(1, null));
        }
        if (i49Var.n()) {
            arrayList10.add(new y39(2, null));
        }
        if (z) {
            v83Var.E(arrayList8, arrayList10);
        } else {
            v83Var.f();
        }
        if (r47Var == null || (tL_messageReactions = r47Var.k.reactions) == null || tL_messageReactions.results == null) {
            return;
        }
        for (int i10 = 0; i10 < r47Var.k.reactions.results.size(); i10++) {
            if (r47Var.k.reactions.results.get(i10).chosen) {
                this.e0.add(w49.d(r47Var.k.reactions.results.get(i10).reaction));
            }
        }
    }

    public final boolean n() {
        return this.F0 || this.G0;
    }

    public final void o() {
        if (this.y0 != null) {
            return;
        }
        e53 e53Var = new e53(this.N0, this.u0, this.W, this.e0, this, this.l0, this.a);
        this.y0 = e53Var;
        ll0 ll0Var = this.a1;
        boolean z = true;
        if (ll0Var != null) {
            ol0 ol0Var = this.b1;
            e0a e0aVar = e53Var.m.g0;
            e0aVar.y = true;
            e0aVar.setBackground(null);
            e0aVar.updateColors();
            e0aVar.invalidate();
            jl0 c = ll0Var.c(e53Var.a, null, true);
            c.p(ol0Var);
            ik8.r(c, hl.L(12.0f), 8.0f);
            e53Var.z = c;
        }
        e53 e53Var2 = this.y0;
        h49 h49Var = this.h0;
        if (h49Var != null && !h49Var.j()) {
            z = false;
        }
        e53Var2.m.setLongPressEnabled(z);
        g();
        this.y0.p = new uk8(this, (byte) 24);
        j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.e().b(this, jn7.l4);
        jn7.f(this.K).b(this, jn7.T);
        if (this.N0 == 5) {
            jn7.f(this.K).b(this, jn7.w3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.e().n(this, jn7.l4);
        jn7.f(this.K).n(this, jn7.T);
        if (this.N0 == 5) {
            jn7.f(this.K).n(this, jn7.w3);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        h();
    }

    public final void p(boolean z) {
        ObjectAnimator duration;
        this.L0 = z;
        setTransitionProgress(0.0f);
        setAlpha(1.0f);
        this.M0.d();
        boolean j = xea.j();
        px1 px1Var = m1;
        if (j) {
            duration = ObjectAnimator.ofFloat(this, px1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            duration = ObjectAnimator.ofFloat(this, px1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        }
        duration.addListener(new rw7(this, (byte) 1));
        duration.start();
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        if (getAlpha() != f && f == 0.0f) {
            this.D0.clear();
            int i = 0;
            while (true) {
                gu guVar = this.b;
                if (i >= guVar.getChildCount()) {
                    break;
                }
                if (guVar.getChildAt(i) instanceof g49) {
                    ((g49) guVar.getChildAt(i)).c();
                }
                i++;
            }
        }
        super.setAlpha(f);
    }

    public void setBubbleOffset(float f) {
        this.V0 = f;
    }

    public void setChatScrimView(rd2 rd2Var) {
        this.f1 = rd2Var;
    }

    public void setCurrentAccount(int i) {
        this.K = i;
    }

    public void setCustomEmojiEnterProgress(float f) {
        this.x0 = f;
        rd2 rd2Var = this.f1;
        if (rd2Var != null) {
            rd2Var.setPopupAlpha(1.0f - f);
        }
        invalidate();
    }

    public void setCustomEmojiReactionsBackground(boolean z) {
        i53 i53Var = this.w0;
        if (!z) {
            i53Var.setBackground(null);
            return;
        }
        int L = hl.L(28.0f);
        int i = aob.i6;
        yob.R(i53Var, aob.h0(L, 0, vm2.o(aob.w0(null, i, false), 40)), null, yob.g(i, 40), null);
    }

    public void setDelegate(h49 h49Var) {
        this.h0 = h49Var;
    }

    public void setFlippedVertically(boolean z) {
        this.O = z;
        invalidate();
    }

    public void setFragment(e eVar) {
        this.u0 = eVar;
    }

    public void setHint(CharSequence charSequence) {
        this.R0 = true;
        if (this.S0 == null) {
            Context context = getContext();
            vnb vnbVar = this.l0;
            p66 p66Var = new p66(context, vnbVar);
            this.S0 = p66Var;
            p66Var.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
            this.S0.setClickable(true);
            this.S0.setTextSize(1, 12.0f);
            byte b = this.N0;
            if (b == 1 || b == 2 || b == 4) {
                yob.X(this.S0, aob.G6, vnbVar);
                this.S0.setAlpha(0.5f);
            } else {
                yob.X(this.S0, aob.z6, vnbVar);
            }
            this.S0.setGravity(1);
            addView(this.S0, tre.d(-1, -2.0f, 0, 0.0f, 6.0f, 0.0f, 0.0f));
        }
        this.S0.setText(charSequence);
        this.g1 = false;
        ((FrameLayout.LayoutParams) this.A0.getLayoutParams()).topMargin = hl.L(20.0f);
        ((FrameLayout.LayoutParams) this.b.getLayoutParams()).topMargin = hl.L(20.0f);
    }

    public void setMiniBubblesOffset(float f) {
        this.W0 = f;
    }

    public void setMirrorX(boolean z) {
        this.N = z;
        invalidate();
    }

    public void setOnSwitchedToLoopView(Runnable runnable) {
        this.Q0 = runnable;
    }

    public void setParentLayout(rd2 rd2Var) {
        this.K0 = rd2Var;
    }

    public void setSelectedEmojis(ArrayList<String> arrayList) {
        HashSet hashSet = this.e0;
        hashSet.clear();
        int size = arrayList.size();
        byte b = 0;
        int i = 0;
        while (i < size) {
            String str = arrayList.get(i);
            i++;
            w49 b2 = w49.b(str);
            hashSet.add(b2);
            this.f0.add(b2);
        }
        hl.d0(this.b, new u39(this, b));
    }

    public void setSelectedReaction(w49 w49Var) {
        HashSet hashSet = this.e0;
        hashSet.clear();
        if (w49Var != null) {
            hashSet.add(w49Var);
        }
        this.b0.f();
    }

    public void setSelectedReactionAnimated(w49 w49Var) {
        HashSet hashSet = this.e0;
        hashSet.clear();
        if (w49Var != null) {
            hashSet.add(w49Var);
        }
        hl.d0(this.b, new u39(this, (byte) 0));
    }

    public void setSelectedReactionInclusive(w49 w49Var) {
        HashSet hashSet = this.e0;
        hashSet.clear();
        if (w49Var != null) {
            hashSet.add(w49Var);
        }
        hl.d0(this.b, new u39(this, (byte) 0));
    }

    public void setSelectedReactions(ArrayList<r47> arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        HashSet hashSet = this.e0;
        hashSet.clear();
        for (int i = 0; i < arrayList.size(); i++) {
            r47 r47Var = arrayList.get(i);
            if (r47Var != null && (tL_messageReactions = r47Var.k.reactions) != null && tL_messageReactions.results != null) {
                for (int i2 = 0; i2 < r47Var.k.reactions.results.size(); i2++) {
                    if (r47Var.k.reactions.results.get(i2).chosen) {
                        hashSet.add(w49.d(r47Var.k.reactions.results.get(i2).reaction));
                    }
                }
            }
        }
        this.b0.f();
    }

    public void setSelectedReactionsInclusive(ArrayList<r47> arrayList) {
        HashSet hashSet = this.e0;
        hashSet.clear();
        hashSet.addAll(f(arrayList));
        hl.d0(this.b, new u39(this, (byte) 0));
    }

    public void setSkipDraw(boolean z) {
        if (this.e1 != z) {
            this.e1 = z;
            if (!z) {
                int i = 0;
                while (true) {
                    gu guVar = this.b;
                    if (i >= guVar.getChildCount()) {
                        break;
                    }
                    if (guVar.getChildAt(i) instanceof g49) {
                        g49 g49Var = (g49) guVar.getChildAt(i);
                        boolean z2 = g49Var.r;
                        f49 f49Var = g49Var.b;
                        if (z2 && (f49Var.getImageReceiver().y() != null || f49Var.getImageReceiver().m() != null)) {
                            f49Var.setVisibility(0);
                            g49Var.a.setVisibility(4);
                            if (g49Var.s) {
                                g49Var.w = true;
                            }
                        }
                        g49Var.invalidate();
                    }
                    i++;
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
            hashSet.add(w49.d(reaction));
        }
        this.b0.f();
    }

    public void setTop(boolean z) {
        this.M = z;
    }

    public void setTransitionProgress(float f) {
        this.w = f;
        rd2 rd2Var = this.K0;
        if (rd2Var != null) {
            if (!this.L0 || !xea.j()) {
                f = 1.0f;
            }
            rd2Var.setReactionsTransitionProgress(f);
        }
        invalidate();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        if (f != getTranslationX()) {
            super.setTranslationX(f);
        }
    }

    @Override // snb
    public final void updateColors() {
        int v0;
        Paint paint = this.f;
        if (paint != null) {
            try {
                byte b = this.N0;
                if (b != 2 && b != 4 && paint.getColor() != (v0 = aob.v0(aob.G8, this.l0))) {
                    int alpha = paint.getAlpha();
                    paint.setColor(v0);
                    paint.setAlpha(alpha);
                    invalidate();
                }
            } catch (Exception e) {
                cc4.g(e, true);
                return;
            }
        }
        cl8 cl8Var = this.v0;
        if (cl8Var != null) {
            cl8Var.setColor(vm2.f(0.7f, aob.w0(null, aob.F8, false), aob.w0(null, aob.h5, false)));
        }
        if (getWidth() <= 0 || getHeight() <= 0 || this.c1 == aob.w0(null, aob.G8, false)) {
            return;
        }
        h();
    }

    public void j() {
    }
}
