package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class f00 extends FrameLayout {
    public static final /* synthetic */ int w0 = 0;
    public boolean A;
    public final jh.e1 B;
    public final int C;
    public final org.telegram.ui.vq D;
    public final b00 E;
    public a00 F;
    public int G;
    public int H;
    public int I;
    public int J;
    public boolean K;
    public float L;
    public int M;
    public int N;
    public int O;
    public final GradientDrawable P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public final org.telegram.ui.ActionBar.c6 a;
    public int a0;
    public final TextPaint b;
    public int b0;
    public final TextPaint c;
    public int c0;
    public final TextPaint d;
    public boolean d0;
    public final Paint e;
    public final jr e0;
    public PorterDuffColorFilter f;
    public final SparseIntArray f0;
    public final SparseIntArray g0;
    public final ArrayList h;
    public final SparseIntArray h0;
    public final SparseIntArray i0;
    public final SparseIntArray j0;
    public final SparseIntArray k0;
    public float l0;
    public int m0;
    public boolean n;
    public int n0;
    public final xz o0;
    public Drawable p0;
    public int q0;
    public long r;
    public final lh.m7 r0;
    public boolean s;
    public float s0;
    public final org.telegram.ui.Cells.b2 t0;
    public ng.d u0;
    public float v;
    public final Path v0;
    public float w;
    public AnimatorSet x;
    public boolean y;

    public f00(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.c = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.d = textPaint3;
        this.e = new Paint(1);
        this.f = new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN);
        this.h = new ArrayList();
        this.H = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.Q = org.telegram.ui.ActionBar.g6.K8;
        this.R = org.telegram.ui.ActionBar.g6.I8;
        this.S = org.telegram.ui.ActionBar.g6.J8;
        this.T = org.telegram.ui.ActionBar.g6.L8;
        this.U = org.telegram.ui.ActionBar.g6.s8;
        this.V = -1;
        this.W = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.e0 = jr.h;
        this.f0 = new SparseIntArray(5);
        this.g0 = new SparseIntArray(5);
        this.h0 = new SparseIntArray(5);
        this.i0 = new SparseIntArray(5);
        this.j0 = new SparseIntArray(5);
        this.k0 = new SparseIntArray(5);
        this.r0 = new lh.m7(this, 22);
        this.t0 = new org.telegram.ui.Cells.b2(3, this);
        this.v0 = new Path();
        this.a = c6Var;
        textPaint2.setTextSize(AndroidUtilities.dpf2(11.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dpf2(14.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint3.setStyle(Paint.Style.STROKE);
        textPaint3.setStrokeCap(Paint.Cap.ROUND);
        textPaint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.P = gradientDrawable;
        float dpf2 = AndroidUtilities.dpf2(14.0f);
        gradientDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2});
        gradientDrawable.setColor(org.telegram.ui.ActionBar.g6.v0(this.Q, c6Var));
        setHorizontalScrollBarEnabled(false);
        jh.e1 e1Var = new jh.e1(this, context, 15);
        this.B = e1Var;
        e1Var.setClipChildren(false);
        xz xzVar = new xz(this);
        this.o0 = xzVar;
        xzVar.C = false;
        e1Var.setItemAnimator(xzVar);
        e1Var.setSelectorType(9);
        e1Var.setSelectorRadius(6);
        e1Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(this.T, c6Var));
        org.telegram.ui.vq vqVar = new org.telegram.ui.vq((ViewGroup) this, 1);
        this.D = vqVar;
        e1Var.setLayoutManager(vqVar);
        new f2.e0(new e00(this)).d(e1Var);
        int max = Math.max(0, AndroidUtilities.dp(11.5f));
        this.C = max;
        e1Var.setPadding(max, 0, max, 0);
        e1Var.setClipToPadding(false);
        e1Var.setDrawSelectorBehind(true);
        b00 b00Var = new b00(this, context);
        this.E = b00Var;
        b00Var.C(true);
        e1Var.setAdapter(b00Var);
        e1Var.setOnItemClickListener(new vz(this));
        e1Var.setOnItemLongClickListener(new vz(this));
        e1Var.setOnScrollListener(new cg.g2(this, 29));
        e1Var.v2 = true;
        e1Var.setOverScrollMode(2);
        addView(e1Var, i7.f6.c(-1.0f, -1));
    }

    public final void a(int i10, int i11, String str, ArrayList arrayList, boolean z10, boolean z11, boolean z12) {
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        if (size == 0 && this.H == -1) {
            this.H = i10;
        }
        this.f0.put(size, i10);
        this.g0.put(size, i11);
        this.h0.put(i10, size);
        int i12 = this.H;
        if (i12 != -1 && i12 == i10) {
            this.G = size;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        TextPaint textPaint = this.b;
        c00 c00Var = new c00(this, i10, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false), arrayList, textPaint.getFontMetricsInt()), z10);
        c00Var.e = z11;
        c00Var.f = z12;
        this.I = org.telegram.messenger.x3.C(24.0f, c00Var.a(true), this.I);
        arrayList2.add(c00Var);
    }

    public final void b(int i10, int i11, int i12, int i13, int i14) {
        AnimatorSet animatorSet = this.x;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.V = i10;
        this.W = i11;
        this.a0 = i12;
        this.b0 = i14;
        this.T = i13;
        this.B.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(i13, this.a));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.x = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.t0, 0.0f, 1.0f));
        this.x.setDuration(320L);
        this.x.addListener(new zz(this, 0));
        this.x.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            c00 c00Var = (c00) arrayList.get(i10);
            if (c00Var.d != ((org.telegram.ui.fw) this.F).a(c00Var.a)) {
                if (((org.telegram.ui.fw) this.F).a(c00Var.a) < 0) {
                    continue;
                } else {
                    if (this.i0.get(i10) != c00Var.a(true) || this.d0) {
                        this.d0 = true;
                        requestLayout();
                        this.I = 0;
                        c00 d = d();
                        if (d != null) {
                            d.b(LocaleController.getString(R.string.FilterAllChats));
                        }
                        for (int i11 = 0; i11 < size; i11++) {
                            this.I = org.telegram.messenger.x3.C(24.0f, ((c00) arrayList.get(i11)).a(true), this.I);
                        }
                        z10 = true;
                        if (z10) {
                            return;
                        }
                        this.B.setItemAnimator(this.o0);
                        this.E.l();
                        return;
                    }
                    z10 = true;
                }
            }
        }
        if (z10) {
        }
    }

    public final c00 d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return null;
            }
            if (((c00) arrayList.get(i10)).e) {
                return (c00) arrayList.get(i10);
            }
            i10++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.v0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0185, code lost:
    
        if (r17.v != 0.0f) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0112  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        f2.n1 K;
        int i10;
        int i11;
        float f9;
        float f10;
        float dp;
        float f11;
        boolean drawChild = super.drawChild(canvas, view, j10);
        jh.e1 e1Var = this.B;
        if (view == e1Var) {
            int measuredHeight = getMeasuredHeight();
            int alpha = (int) (e1Var.getAlpha() * 255.0f);
            GradientDrawable gradientDrawable = this.P;
            gradientDrawable.setAlpha(alpha);
            if (this.K || this.M != -1) {
                int L0 = this.D.L0();
                if (L0 != -1 && (K = e1Var.K(L0)) != null) {
                    if (this.K) {
                        i10 = this.m0;
                        i11 = this.G;
                    } else {
                        i10 = this.G;
                        i11 = this.M;
                    }
                    SparseIntArray sparseIntArray = this.k0;
                    int i12 = sparseIntArray.get(i10);
                    int i13 = sparseIntArray.get(i11);
                    f9 = 2.0f;
                    SparseIntArray sparseIntArray2 = this.i0;
                    int i14 = sparseIntArray2.get(i10);
                    int i15 = sparseIntArray2.get(i11);
                    f10 = 0.0f;
                    SparseIntArray sparseIntArray3 = this.j0;
                    float f12 = sparseIntArray3.get(i10) != 0 ? 1.0f : 0.0f;
                    float f13 = sparseIntArray3.get(i11) != 0 ? 1.0f : 0.0f;
                    dp = this.J != 0 ? AndroidUtilities.dp(12.0f) + AndroidUtilities.lerp(i12, i13, this.L) : AndroidUtilities.dp(12.0f) + (AndroidUtilities.lerp(i12, i13, this.L) - (sparseIntArray.get(L0) - K.a.getLeft()));
                    float lerp = AndroidUtilities.lerp(i14, i15, this.L);
                    AndroidUtilities.lerp(f12, f13, this.L);
                    f11 = lerp;
                    if (f11 != f10) {
                        canvas.save();
                        canvas.translate(e1Var.getTranslationX(), 0.0f);
                        canvas.scale(e1Var.getScaleX(), 1.0f, e1Var.getX() + e1Var.getPivotX(), e1Var.getPivotY());
                        float f14 = this.J / f9;
                        int dp2 = (measuredHeight / 2) - AndroidUtilities.dp(14.0f);
                        gradientDrawable.setBounds((int) ((dp - AndroidUtilities.dp(12.5f)) - f14), dp2, (int) (dp + f11 + AndroidUtilities.dp(12.5f) + f14), AndroidUtilities.dp(28.0f) + dp2);
                        gradientDrawable.setAlpha(31);
                        gradientDrawable.draw(canvas);
                        canvas.restore();
                    }
                }
                f9 = 2.0f;
                f10 = 0.0f;
                dp = 0.0f;
                f11 = 0.0f;
                if (f11 != f10) {
                }
            } else {
                f2.n1 K2 = e1Var.K(this.G);
                if (K2 != null) {
                    d00 d00Var = (d00) K2.a;
                    f11 = Math.max(AndroidUtilities.dp(16.0f), d00Var.S ? AndroidUtilities.lerp(d00Var.e0, d00Var.d, d00Var.x) : d00Var.d);
                    dp = (int) com.google.android.recaptcha.internal.a.A(d00Var.S ? AndroidUtilities.lerp(d00Var.e0 + AndroidUtilities.dp(20.0f), d00Var.getMeasuredWidth(), d00Var.x) : d00Var.getMeasuredWidth(), f11, 2.0f, d00Var.getX());
                    f9 = 2.0f;
                    f10 = 0.0f;
                    if (f11 != f10) {
                    }
                }
                f9 = 2.0f;
                f10 = 0.0f;
                dp = 0.0f;
                f11 = 0.0f;
                if (f11 != f10) {
                }
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(17L, elapsedRealtime - this.r);
        this.r = elapsedRealtime;
        boolean z10 = this.n;
        boolean z11 = true;
        float f15 = !z10 ? 0.0f : 0.0f;
        if (this.s) {
            float f16 = this.v;
            boolean z12 = f16 <= f15;
            float f17 = (min / 420.0f) + f16;
            this.v = f17;
            if (!z10 && z12 && f17 >= f15) {
                this.v = f15;
            }
            if (this.v >= 1.0f) {
                this.v = 1.0f;
                this.s = false;
            }
        } else {
            float f18 = this.v;
            r3 = f18 >= 0.0f;
            float f19 = f18 - (min / 420.0f);
            this.v = f19;
            if (!z10 && r3 && f19 <= 0.0f) {
                this.v = 0.0f;
            }
            if (this.v <= -1.0f) {
                this.v = -1.0f;
                this.s = true;
            }
        }
        r3 = true;
        if (z10) {
            float f20 = this.w;
            if (f20 < 1.0f) {
                float f21 = (min / 180.0f) + f20;
                this.w = f21;
                if (f21 > 1.0f) {
                    this.w = 1.0f;
                }
            }
            z11 = r3;
        } else {
            if (!z10) {
                float f22 = this.w;
                if (f22 > 0.0f) {
                    float f23 = f22 - (min / 180.0f);
                    this.w = f23;
                    if (f23 < 0.0f) {
                        this.w = 0.0f;
                    }
                }
            }
            z11 = r3;
        }
        if (z11) {
            e1Var.f1();
            e1Var.invalidate();
            invalidate();
        }
        return drawChild;
    }

    public final void e(int i10) {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty() || this.O == i10 || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        this.O = i10;
        this.B.x0(i10);
    }

    public final void f(c00 c00Var, int i10) {
        if (c00Var.f) {
            a00 a00Var = this.F;
            if (a00Var != null) {
                ((org.telegram.ui.fw) a00Var).c(c00Var, false);
                return;
            }
            return;
        }
        int i11 = this.G;
        boolean z10 = i11 < i10;
        this.O = -1;
        this.m0 = i11;
        this.n0 = this.H;
        this.G = i10;
        this.H = c00Var.a;
        boolean z11 = this.K;
        lh.m7 m7Var = this.r0;
        if (z11) {
            AndroidUtilities.cancelRunOnUIThread(m7Var);
            this.K = false;
        }
        this.l0 = 0.0f;
        this.L = 0.0f;
        this.K = true;
        setEnabled(false);
        AndroidUtilities.runOnUIThread(m7Var, 16L);
        a00 a00Var2 = this.F;
        if (a00Var2 != null) {
            ((org.telegram.ui.fw) a00Var2).c(c00Var, z10);
        }
        e(i10);
    }

    public final void g(float f9, int i10) {
        int i11 = this.h0.get(i10, -1);
        if (i11 < 0) {
            return;
        }
        if (f9 < 0.0f) {
            f9 = 0.0f;
        } else if (f9 > 1.0f) {
            f9 = 1.0f;
        }
        if (f9 > 0.0f) {
            this.M = i11;
            this.N = i10;
        } else {
            this.M = -1;
            this.N = -1;
        }
        this.L = f9;
        jh.e1 e1Var = this.B;
        e1Var.f1();
        e1Var.invalidate();
        invalidate();
        e(i11);
        if (f9 >= 1.0f) {
            this.M = -1;
            this.N = -1;
            this.G = i11;
            this.H = i10;
        }
    }

    public int getCurrentTabId() {
        return this.H;
    }

    public int getCurrentTabStableId() {
        return this.g0.get(this.G, -1);
    }

    public int getDefaultTabId() {
        c00 d = d();
        if (d == null) {
            return -1;
        }
        return d.a;
    }

    public int getFirstTabId() {
        return this.f0.get(0, 0);
    }

    public int getLastTabId() {
        return this.f0.get(getTabsCount() - 1, 0);
    }

    public jl0 getListView() {
        return this.B;
    }

    public int getSelectorColorKey() {
        return this.T;
    }

    public Drawable getSelectorDrawable() {
        return this.P;
    }

    public jl0 getTabsContainer() {
        return this.B;
    }

    public int getTabsCount() {
        return this.h.size();
    }

    public final boolean h(int i10) {
        for (int i11 = 0; i11 < this.h.size(); i11++) {
            if (this.g0.get(i11, -1) == i10) {
                this.G = i11;
                this.H = this.f0.get(i11);
                return true;
            }
        }
        return false;
    }

    public final void i(int i10) {
        int i11 = 0;
        while (true) {
            jh.e1 e1Var = this.B;
            if (i11 >= e1Var.getChildCount()) {
                return;
            }
            if (e1Var.getChildAt(i11) instanceof d00) {
                d00 d00Var = (d00) e1Var.getChildAt(i11);
                if (d00Var.b.a == i10) {
                    d00Var.b(1.0f, 0);
                    try {
                        d00Var.performHapticFeedback(3);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
            }
            i11++;
        }
    }

    public final void j() {
        SparseIntArray sparseIntArray = this.k0;
        sparseIntArray.clear();
        SparseIntArray sparseIntArray2 = this.i0;
        sparseIntArray2.clear();
        SparseIntArray sparseIntArray3 = this.j0;
        sparseIntArray3.clear();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = this.C;
        for (int i11 = 0; i11 < size; i11++) {
            int a2 = ((c00) arrayList.get(i11)).a(false);
            sparseIntArray2.put(i11, a2);
            sparseIntArray3.put(i11, ((c00) arrayList.get(i11)).d);
            sparseIntArray.put(i11, (this.J / 2) + i10);
            i10 += AndroidUtilities.dp(24.0f) + a2 + this.J;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        if (this.c0 != i14) {
            this.c0 = i14;
            this.O = -1;
            if (this.K) {
                AndroidUtilities.cancelRunOnUIThread(this.r0);
                this.K = false;
                setEnabled(true);
                a00 a00Var = this.F;
                if (a00Var != null) {
                    ((org.telegram.ui.fw) a00Var).b(1.0f);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int size = View.MeasureSpec.getSize(i10) - (this.C * 2);
            c00 d = d();
            if (d != null) {
                d.b(LocaleController.getString(R.string.FilterAllChats));
                int a2 = d.a(false);
                d.b(LocaleController.getString(this.I > size ? R.string.FilterAllChatsShort : R.string.FilterAllChats));
                int a10 = d.a(false) + (this.I - a2);
                int i12 = this.J;
                int size2 = a10 < size ? (size - a10) / arrayList.size() : 0;
                this.J = size2;
                if (i12 != size2) {
                    this.A = true;
                    jh.e1 e1Var = this.B;
                    f2.u0 itemAnimator = e1Var.getItemAnimator();
                    e1Var.setItemAnimator(null);
                    this.E.l();
                    e1Var.setItemAnimator(itemAnimator);
                    this.A = false;
                }
                j();
                this.d0 = false;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Path path = this.v0;
        path.rewind();
        path.addRoundRect(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), i10 - AndroidUtilities.dp(9.0f), i11 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.A) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f9) {
        this.L = f9;
        jh.e1 e1Var = this.B;
        e1Var.f1();
        e1Var.invalidate();
        invalidate();
        a00 a00Var = this.F;
        if (a00Var != null) {
            ((org.telegram.ui.fw) a00Var).b(f9);
        }
    }

    public void setBlurredBackground(ng.d dVar) {
        this.u0 = dVar;
        setBackground(dVar);
    }

    public void setDelegate(a00 a00Var) {
        this.F = a00Var;
    }

    public void setIsEditing(boolean z10) {
        this.n = z10;
        this.s = true;
        jh.e1 e1Var = this.B;
        e1Var.f1();
        e1Var.invalidate();
        this.E.l();
        invalidate();
        if (this.n || !this.y) {
            return;
        }
        MessagesStorage.getInstance(UserConfig.selectedAccount).saveDialogFiltersOrder();
        TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
        ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
        int size = dialogFilters.size();
        for (int i10 = 0; i10 < size; i10++) {
            MessagesController.DialogFilter dialogFilter = dialogFilters.get(i10);
            if (dialogFilter.isDefault()) {
                tL_messages_updateDialogFiltersOrder.order.add(0);
            } else {
                tL_messages_updateDialogFiltersOrder.order.add(Integer.valueOf(dialogFilter.id));
            }
        }
        MessagesController.getInstance(UserConfig.selectedAccount).lockFiltersInternal();
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_updateDialogFiltersOrder, new lh.o5(11));
        this.y = false;
    }
}
