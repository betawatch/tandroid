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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class j00 extends FrameLayout {
    public static final /* synthetic */ int x0 = 0;
    public boolean B;
    public final lh.e1 C;
    public final int D;
    public final org.telegram.ui.br E;
    public final f00 F;
    public e00 G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public float M;
    public int N;
    public int O;
    public int P;
    public final GradientDrawable Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public final org.telegram.ui.ActionBar.f6 a;
    public int a0;
    public final TextPaint b;
    public int b0;
    public final TextPaint c;
    public int c0;
    public final TextPaint d;
    public int d0;
    public final Paint e;
    public boolean e0;
    public PorterDuffColorFilter f;
    public final nr f0;
    public final SparseIntArray g0;
    public final ArrayList h;
    public final SparseIntArray h0;
    public final SparseIntArray i0;
    public final SparseIntArray j0;
    public final SparseIntArray k0;
    public final SparseIntArray l0;
    public float m0;
    public boolean n;
    public int n0;
    public int o0;
    public final c00 p0;
    public Drawable q0;
    public long r;
    public int r0;
    public boolean s;
    public final m2.b s0;
    public float t0;
    public final org.telegram.ui.Cells.c2 u0;
    public float v;
    public pg.b v0;
    public float w;
    public final Path w0;
    public AnimatorSet x;
    public boolean y;

    public j00(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
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
        this.I = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.R = org.telegram.ui.ActionBar.j6.K8;
        this.S = org.telegram.ui.ActionBar.j6.I8;
        this.T = org.telegram.ui.ActionBar.j6.J8;
        this.U = org.telegram.ui.ActionBar.j6.L8;
        this.V = org.telegram.ui.ActionBar.j6.s8;
        this.W = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.c0 = -1;
        this.f0 = nr.h;
        this.g0 = new SparseIntArray(5);
        this.h0 = new SparseIntArray(5);
        this.i0 = new SparseIntArray(5);
        this.j0 = new SparseIntArray(5);
        this.k0 = new SparseIntArray(5);
        this.l0 = new SparseIntArray(5);
        this.s0 = new m2.b(this, 21);
        this.u0 = new org.telegram.ui.Cells.c2(3, this);
        this.w0 = new Path();
        this.a = f6Var;
        textPaint2.setTextSize(AndroidUtilities.dpf2(11.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dpf2(14.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint3.setStyle(Paint.Style.STROKE);
        textPaint3.setStrokeCap(Paint.Cap.ROUND);
        textPaint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.Q = gradientDrawable;
        float dpf2 = AndroidUtilities.dpf2(14.0f);
        gradientDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2});
        gradientDrawable.setColor(org.telegram.ui.ActionBar.j6.v0(this.R, f6Var));
        setHorizontalScrollBarEnabled(false);
        lh.e1 e1Var = new lh.e1(this, context, 14);
        this.C = e1Var;
        e1Var.setClipChildren(false);
        c00 c00Var = new c00(this);
        this.p0 = c00Var;
        c00Var.C = false;
        e1Var.setItemAnimator(c00Var);
        e1Var.setSelectorType(9);
        e1Var.setSelectorRadius(6);
        e1Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(this.U, f6Var));
        org.telegram.ui.br brVar = new org.telegram.ui.br((ViewGroup) this, 1);
        this.E = brVar;
        e1Var.setLayoutManager(brVar);
        new f2.e0(new i00(this)).d(e1Var);
        int max = Math.max(0, AndroidUtilities.dp(11.5f));
        this.D = max;
        e1Var.setPadding(max, 0, max, 0);
        e1Var.setClipToPadding(false);
        e1Var.setDrawSelectorBehind(true);
        f00 f00Var = new f00(this, context);
        this.F = f00Var;
        f00Var.C(true);
        e1Var.setAdapter(f00Var);
        e1Var.setOnItemClickListener(new a00(this));
        e1Var.setOnItemLongClickListener(new a00(this));
        e1Var.setOnScrollListener(new eg.f2(this, 27));
        e1Var.w2 = true;
        e1Var.setOverScrollMode(2);
        addView(e1Var, k7.b6.c(-1.0f, -1));
    }

    public final void a(int i10, int i11, String str, ArrayList arrayList, boolean z4, boolean z10, boolean z11) {
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        if (size == 0 && this.I == -1) {
            this.I = i10;
        }
        this.g0.put(size, i10);
        this.h0.put(size, i11);
        this.i0.put(i10, size);
        int i12 = this.I;
        if (i12 != -1 && i12 == i10) {
            this.H = size;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        TextPaint textPaint = this.b;
        g00 g00Var = new g00(this, i10, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false), arrayList, textPaint.getFontMetricsInt()), z4);
        g00Var.e = z10;
        g00Var.f = z11;
        this.J = org.telegram.messenger.y3.C(24.0f, g00Var.a(true), this.J);
        arrayList2.add(g00Var);
    }

    public final void b(int i10, int i11, int i12, int i13, int i14) {
        AnimatorSet animatorSet = this.x;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.W = i10;
        this.a0 = i11;
        this.b0 = i12;
        this.c0 = i14;
        this.U = i13;
        this.C.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(i13, this.a));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.x = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.u0, 0.0f, 1.0f));
        this.x.setDuration(320L);
        this.x.addListener(new a9(this, 21));
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
        boolean z4 = false;
        for (int i10 = 0; i10 < size; i10++) {
            g00 g00Var = (g00) arrayList.get(i10);
            if (g00Var.d != ((org.telegram.ui.ow) this.G).a(g00Var.a)) {
                if (((org.telegram.ui.ow) this.G).a(g00Var.a) < 0) {
                    continue;
                } else {
                    if (this.j0.get(i10) != g00Var.a(true) || this.e0) {
                        this.e0 = true;
                        requestLayout();
                        this.J = 0;
                        g00 d = d();
                        if (d != null) {
                            d.b(LocaleController.getString(R.string.FilterAllChats));
                        }
                        for (int i11 = 0; i11 < size; i11++) {
                            this.J = org.telegram.messenger.y3.C(24.0f, ((g00) arrayList.get(i11)).a(true), this.J);
                        }
                        z4 = true;
                        if (z4) {
                            return;
                        }
                        this.C.setItemAnimator(this.p0);
                        this.F.l();
                        return;
                    }
                    z4 = true;
                }
            }
        }
        if (z4) {
        }
    }

    public final g00 d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return null;
            }
            if (((g00) arrayList.get(i10)).e) {
                return (g00) arrayList.get(i10);
            }
            i10++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.w0);
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
        f2.l1 K;
        int i10;
        int i11;
        float f10;
        float f11;
        float dp;
        float f12;
        boolean drawChild = super.drawChild(canvas, view, j10);
        lh.e1 e1Var = this.C;
        if (view == e1Var) {
            int measuredHeight = getMeasuredHeight();
            int alpha = (int) (e1Var.getAlpha() * 255.0f);
            GradientDrawable gradientDrawable = this.Q;
            gradientDrawable.setAlpha(alpha);
            if (this.L || this.N != -1) {
                int L0 = this.E.L0();
                if (L0 != -1 && (K = e1Var.K(L0)) != null) {
                    if (this.L) {
                        i10 = this.n0;
                        i11 = this.H;
                    } else {
                        i10 = this.H;
                        i11 = this.N;
                    }
                    SparseIntArray sparseIntArray = this.l0;
                    int i12 = sparseIntArray.get(i10);
                    int i13 = sparseIntArray.get(i11);
                    f10 = 2.0f;
                    SparseIntArray sparseIntArray2 = this.j0;
                    int i14 = sparseIntArray2.get(i10);
                    int i15 = sparseIntArray2.get(i11);
                    f11 = 0.0f;
                    SparseIntArray sparseIntArray3 = this.k0;
                    float f13 = sparseIntArray3.get(i10) != 0 ? 1.0f : 0.0f;
                    float f14 = sparseIntArray3.get(i11) != 0 ? 1.0f : 0.0f;
                    dp = this.K != 0 ? AndroidUtilities.dp(12.0f) + AndroidUtilities.lerp(i12, i13, this.M) : AndroidUtilities.dp(12.0f) + (AndroidUtilities.lerp(i12, i13, this.M) - (sparseIntArray.get(L0) - K.a.getLeft()));
                    float lerp = AndroidUtilities.lerp(i14, i15, this.M);
                    AndroidUtilities.lerp(f13, f14, this.M);
                    f12 = lerp;
                    if (f12 != f11) {
                        canvas.save();
                        canvas.translate(e1Var.getTranslationX(), 0.0f);
                        canvas.scale(e1Var.getScaleX(), 1.0f, e1Var.getX() + e1Var.getPivotX(), e1Var.getPivotY());
                        float f15 = this.K / f10;
                        int dp2 = (measuredHeight / 2) - AndroidUtilities.dp(14.0f);
                        gradientDrawable.setBounds((int) ((dp - AndroidUtilities.dp(12.5f)) - f15), dp2, (int) (dp + f12 + AndroidUtilities.dp(12.5f) + f15), AndroidUtilities.dp(28.0f) + dp2);
                        gradientDrawable.setAlpha(31);
                        gradientDrawable.draw(canvas);
                        canvas.restore();
                    }
                }
                f10 = 2.0f;
                f11 = 0.0f;
                dp = 0.0f;
                f12 = 0.0f;
                if (f12 != f11) {
                }
            } else {
                f2.l1 K2 = e1Var.K(this.H);
                if (K2 != null) {
                    h00 h00Var = (h00) K2.a;
                    f12 = Math.max(AndroidUtilities.dp(16.0f), h00Var.T ? AndroidUtilities.lerp(h00Var.f0, h00Var.d, h00Var.x) : h00Var.d);
                    dp = (int) e2.c.x(h00Var.T ? AndroidUtilities.lerp(h00Var.f0 + AndroidUtilities.dp(20.0f), h00Var.getMeasuredWidth(), h00Var.x) : h00Var.getMeasuredWidth(), f12, 2.0f, h00Var.getX());
                    f10 = 2.0f;
                    f11 = 0.0f;
                    if (f12 != f11) {
                    }
                }
                f10 = 2.0f;
                f11 = 0.0f;
                dp = 0.0f;
                f12 = 0.0f;
                if (f12 != f11) {
                }
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(17L, elapsedRealtime - this.r);
        this.r = elapsedRealtime;
        boolean z4 = this.n;
        boolean z10 = true;
        float f16 = !z4 ? 0.0f : 0.0f;
        if (this.s) {
            float f17 = this.v;
            boolean z11 = f17 <= f16;
            float f18 = (min / 420.0f) + f17;
            this.v = f18;
            if (!z4 && z11 && f18 >= f16) {
                this.v = f16;
            }
            if (this.v >= 1.0f) {
                this.v = 1.0f;
                this.s = false;
            }
        } else {
            float f19 = this.v;
            r3 = f19 >= 0.0f;
            float f20 = f19 - (min / 420.0f);
            this.v = f20;
            if (!z4 && r3 && f20 <= 0.0f) {
                this.v = 0.0f;
            }
            if (this.v <= -1.0f) {
                this.v = -1.0f;
                this.s = true;
            }
        }
        r3 = true;
        if (z4) {
            float f21 = this.w;
            if (f21 < 1.0f) {
                float f22 = (min / 180.0f) + f21;
                this.w = f22;
                if (f22 > 1.0f) {
                    this.w = 1.0f;
                }
            }
            z10 = r3;
        } else {
            if (!z4) {
                float f23 = this.w;
                if (f23 > 0.0f) {
                    float f24 = f23 - (min / 180.0f);
                    this.w = f24;
                    if (f24 < 0.0f) {
                        this.w = 0.0f;
                    }
                }
            }
            z10 = r3;
        }
        if (z10) {
            e1Var.f1();
            e1Var.invalidate();
            invalidate();
        }
        return drawChild;
    }

    public final void e(int i10) {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty() || this.P == i10 || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        this.P = i10;
        this.C.x0(i10);
    }

    public final void f(g00 g00Var, int i10) {
        if (g00Var.f) {
            e00 e00Var = this.G;
            if (e00Var != null) {
                ((org.telegram.ui.ow) e00Var).c(g00Var, false);
                return;
            }
            return;
        }
        int i11 = this.H;
        boolean z4 = i11 < i10;
        this.P = -1;
        this.n0 = i11;
        this.o0 = this.I;
        this.H = i10;
        this.I = g00Var.a;
        boolean z10 = this.L;
        m2.b bVar = this.s0;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(bVar);
            this.L = false;
        }
        this.m0 = 0.0f;
        this.M = 0.0f;
        this.L = true;
        setEnabled(false);
        AndroidUtilities.runOnUIThread(bVar, 16L);
        e00 e00Var2 = this.G;
        if (e00Var2 != null) {
            ((org.telegram.ui.ow) e00Var2).c(g00Var, z4);
        }
        e(i10);
    }

    public final void g(float f10, int i10) {
        int i11 = this.i0.get(i10, -1);
        if (i11 < 0) {
            return;
        }
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f10 > 0.0f) {
            this.N = i11;
            this.O = i10;
        } else {
            this.N = -1;
            this.O = -1;
        }
        this.M = f10;
        lh.e1 e1Var = this.C;
        e1Var.f1();
        e1Var.invalidate();
        invalidate();
        e(i11);
        if (f10 >= 1.0f) {
            this.N = -1;
            this.O = -1;
            this.H = i11;
            this.I = i10;
        }
    }

    public int getCurrentTabId() {
        return this.I;
    }

    public int getCurrentTabStableId() {
        return this.h0.get(this.H, -1);
    }

    public int getDefaultTabId() {
        g00 d = d();
        if (d == null) {
            return -1;
        }
        return d.a;
    }

    public int getFirstTabId() {
        return this.g0.get(0, 0);
    }

    public int getLastTabId() {
        return this.g0.get(getTabsCount() - 1, 0);
    }

    public sl0 getListView() {
        return this.C;
    }

    public int getSelectorColorKey() {
        return this.U;
    }

    public Drawable getSelectorDrawable() {
        return this.Q;
    }

    public sl0 getTabsContainer() {
        return this.C;
    }

    public int getTabsCount() {
        return this.h.size();
    }

    public final boolean h(int i10) {
        for (int i11 = 0; i11 < this.h.size(); i11++) {
            if (this.h0.get(i11, -1) == i10) {
                this.H = i11;
                this.I = this.g0.get(i11);
                return true;
            }
        }
        return false;
    }

    public final void i(int i10) {
        int i11 = 0;
        while (true) {
            lh.e1 e1Var = this.C;
            if (i11 >= e1Var.getChildCount()) {
                return;
            }
            if (e1Var.getChildAt(i11) instanceof h00) {
                h00 h00Var = (h00) e1Var.getChildAt(i11);
                if (h00Var.b.a == i10) {
                    h00Var.b(1.0f, 0);
                    try {
                        h00Var.performHapticFeedback(3);
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
        SparseIntArray sparseIntArray = this.l0;
        sparseIntArray.clear();
        SparseIntArray sparseIntArray2 = this.j0;
        sparseIntArray2.clear();
        SparseIntArray sparseIntArray3 = this.k0;
        sparseIntArray3.clear();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = this.D;
        for (int i11 = 0; i11 < size; i11++) {
            int a2 = ((g00) arrayList.get(i11)).a(false);
            sparseIntArray2.put(i11, a2);
            sparseIntArray3.put(i11, ((g00) arrayList.get(i11)).d);
            sparseIntArray.put(i11, (this.K / 2) + i10);
            i10 += AndroidUtilities.dp(24.0f) + a2 + this.K;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        int i14 = i12 - i10;
        if (this.d0 != i14) {
            this.d0 = i14;
            this.P = -1;
            if (this.L) {
                AndroidUtilities.cancelRunOnUIThread(this.s0);
                this.L = false;
                setEnabled(true);
                e00 e00Var = this.G;
                if (e00Var != null) {
                    ((org.telegram.ui.ow) e00Var).b(1.0f);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int size = View.MeasureSpec.getSize(i10) - (this.D * 2);
            g00 d = d();
            if (d != null) {
                d.b(LocaleController.getString(R.string.FilterAllChats));
                int a2 = d.a(false);
                d.b(LocaleController.getString(this.J > size ? R.string.FilterAllChatsShort : R.string.FilterAllChats));
                int a10 = d.a(false) + (this.J - a2);
                int i12 = this.K;
                int size2 = a10 < size ? (size - a10) / arrayList.size() : 0;
                this.K = size2;
                if (i12 != size2) {
                    this.B = true;
                    lh.e1 e1Var = this.C;
                    f2.t0 itemAnimator = e1Var.getItemAnimator();
                    e1Var.setItemAnimator(null);
                    this.F.l();
                    e1Var.setItemAnimator(itemAnimator);
                    this.B = false;
                }
                j();
                this.e0 = false;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Path path = this.w0;
        path.rewind();
        path.addRoundRect(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), i10 - AndroidUtilities.dp(9.0f), i11 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.B) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f10) {
        this.M = f10;
        lh.e1 e1Var = this.C;
        e1Var.f1();
        e1Var.invalidate();
        invalidate();
        e00 e00Var = this.G;
        if (e00Var != null) {
            ((org.telegram.ui.ow) e00Var).b(f10);
        }
    }

    public void setBlurredBackground(pg.b bVar) {
        this.v0 = bVar;
        setBackground(bVar);
    }

    public void setDelegate(e00 e00Var) {
        this.G = e00Var;
    }

    public void setIsEditing(boolean z4) {
        this.n = z4;
        this.s = true;
        lh.e1 e1Var = this.C;
        e1Var.f1();
        e1Var.invalidate();
        this.F.l();
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
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_updateDialogFiltersOrder, new nh.p5(10));
        this.y = false;
    }
}
