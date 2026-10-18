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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public abstract class s00 extends FrameLayout {
    public static final /* synthetic */ int A0 = 0;
    public boolean E;
    public final ai.u1 F;
    public final int G;
    public final hg.i0 H;
    public final o00 I;
    public n00 J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public float P;
    public int Q;
    public int R;
    public int S;
    public final GradientDrawable T;
    public int U;
    public int V;
    public int W;
    public final org.telegram.ui.ActionBar.d6 a;
    public int a0;
    public final TextPaint b;
    public int b0;
    public final TextPaint c;
    public int c0;
    public final TextPaint d;
    public int d0;
    public final Paint e;
    public int e0;
    public PorterDuffColorFilter f;
    public int f0;
    public int g0;
    public final ArrayList h;
    public boolean h0;
    public final bs i0;
    public final SparseIntArray j0;
    public final SparseIntArray k0;
    public final SparseIntArray l0;
    public final SparseIntArray m0;
    public boolean n;
    public final SparseIntArray n0;
    public final SparseIntArray o0;
    public float p0;
    public int q0;
    public long r;
    public int r0;
    public boolean s;
    public final l00 s0;
    public Drawable t0;
    public int u0;
    public float v;
    public final org.telegram.ui.Cells.k7 v0;
    public float w;
    public float w0;
    public AnimatorSet x;
    public final org.telegram.ui.Cells.d2 x0;
    public boolean y;
    public dh.d y0;
    public final Path z0;

    public s00(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
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
        this.L = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.U = org.telegram.ui.ActionBar.h6.K8;
        this.V = org.telegram.ui.ActionBar.h6.I8;
        this.W = org.telegram.ui.ActionBar.h6.J8;
        this.a0 = org.telegram.ui.ActionBar.h6.L8;
        this.b0 = org.telegram.ui.ActionBar.h6.s8;
        this.c0 = -1;
        this.d0 = -1;
        this.e0 = -1;
        this.f0 = -1;
        this.i0 = bs.h;
        this.j0 = new SparseIntArray(5);
        this.k0 = new SparseIntArray(5);
        this.l0 = new SparseIntArray(5);
        this.m0 = new SparseIntArray(5);
        this.n0 = new SparseIntArray(5);
        this.o0 = new SparseIntArray(5);
        this.v0 = new org.telegram.ui.Cells.k7(this, 11);
        this.x0 = new org.telegram.ui.Cells.d2(3, this);
        this.z0 = new Path();
        this.a = d6Var;
        textPaint2.setTextSize(AndroidUtilities.dpf2(11.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dpf2(14.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint3.setStyle(Paint.Style.STROKE);
        textPaint3.setStrokeCap(Paint.Cap.ROUND);
        textPaint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.T = gradientDrawable;
        float dpf2 = AndroidUtilities.dpf2(14.0f);
        gradientDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2});
        gradientDrawable.setColor(org.telegram.ui.ActionBar.h6.w0(this.U, d6Var));
        setHorizontalScrollBarEnabled(false);
        ai.u1 u1Var = new ai.u1(this, context, 17);
        this.F = u1Var;
        u1Var.setClipChildren(false);
        l00 l00Var = new l00(this);
        this.s0 = l00Var;
        l00Var.C = false;
        u1Var.setItemAnimator(l00Var);
        u1Var.setSelectorType(9);
        u1Var.setSelectorRadius(6);
        u1Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.w0(this.a0, d6Var));
        hg.i0 i0Var = new hg.i0((ViewGroup) this, 2);
        this.H = i0Var;
        u1Var.setLayoutManager(i0Var);
        new s4.y(new r00(this)).d(u1Var);
        int max = Math.max(0, AndroidUtilities.dp(11.5f));
        this.G = max;
        u1Var.setPadding(max, 0, max, 0);
        u1Var.setClipToPadding(false);
        u1Var.setDrawSelectorBehind(true);
        o00 o00Var = new o00(this, context);
        this.I = o00Var;
        o00Var.C(true);
        u1Var.setAdapter(o00Var);
        u1Var.setOnItemClickListener(new j00(this));
        u1Var.setOnItemLongClickListener(new j00(this));
        u1Var.setOnScrollListener(new kv(this, 1));
        u1Var.x2 = true;
        u1Var.setOverScrollMode(2);
        addView(u1Var, w7.z5.c(-1.0f, -1));
    }

    public final void a(int i10, int i11, String str, ArrayList arrayList, boolean z10, boolean z11, boolean z12) {
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        if (size == 0 && this.L == -1) {
            this.L = i10;
        }
        this.j0.put(size, i10);
        this.k0.put(size, i11);
        this.l0.put(i10, size);
        int i12 = this.L;
        if (i12 != -1 && i12 == i10) {
            this.K = size;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        TextPaint textPaint = this.b;
        p00 p00Var = new p00(this, i10, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false), arrayList, textPaint.getFontMetricsInt()), z10);
        p00Var.e = z11;
        p00Var.f = z12;
        this.M = org.telegram.messenger.g0.C(24.0f, p00Var.a(true), this.M);
        arrayList2.add(p00Var);
    }

    public final void b(int i10, int i11, int i12, int i13, int i14) {
        AnimatorSet animatorSet = this.x;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.c0 = i10;
        this.d0 = i11;
        this.e0 = i12;
        this.f0 = i14;
        this.a0 = i13;
        this.F.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.w0(i13, this.a));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.x = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.x0, 0.0f, 1.0f));
        this.x.setDuration(320L);
        this.x.addListener(new org.telegram.ui.pq(this, 27));
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
            p00 p00Var = (p00) arrayList.get(i10);
            if (p00Var.d != ((org.telegram.ui.dw) this.J).a(p00Var.a)) {
                if (((org.telegram.ui.dw) this.J).a(p00Var.a) < 0) {
                    continue;
                } else {
                    if (this.m0.get(i10) != p00Var.a(true) || this.h0) {
                        this.h0 = true;
                        requestLayout();
                        this.M = 0;
                        p00 d = d();
                        if (d != null) {
                            d.b(LocaleController.getString(R.string.FilterAllChats));
                        }
                        for (int i11 = 0; i11 < size; i11++) {
                            this.M = org.telegram.messenger.g0.C(24.0f, ((p00) arrayList.get(i11)).a(true), this.M);
                        }
                        z10 = true;
                        if (z10) {
                            return;
                        }
                        this.F.setItemAnimator(this.s0);
                        this.I.l();
                        return;
                    }
                    z10 = true;
                }
            }
        }
        if (z10) {
        }
    }

    public final p00 d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return null;
            }
            if (((p00) arrayList.get(i10)).e) {
                return (p00) arrayList.get(i10);
            }
            i10++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.z0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x018f, code lost:
    
        if (r17.v != 0.0f) goto L52;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float f7;
        float f10;
        float f11;
        float f12;
        s4.b1 K;
        int i10;
        int i11;
        boolean drawChild = super.drawChild(canvas, view, j10);
        ai.u1 u1Var = this.F;
        if (view == u1Var) {
            int measuredHeight = getMeasuredHeight();
            int alpha = (int) (u1Var.getAlpha() * 255.0f);
            GradientDrawable gradientDrawable = this.T;
            gradientDrawable.setAlpha(alpha);
            if (this.O || this.Q != -1) {
                int L0 = this.H.L0();
                if (L0 == -1 || (K = u1Var.K(L0)) == null) {
                    f7 = 2.0f;
                    f10 = 0.0f;
                    f11 = 0.0f;
                    f12 = 0.0f;
                } else {
                    if (this.O) {
                        i10 = this.q0;
                        i11 = this.K;
                    } else {
                        i10 = this.K;
                        i11 = this.Q;
                    }
                    SparseIntArray sparseIntArray = this.o0;
                    int i12 = sparseIntArray.get(i10);
                    int i13 = sparseIntArray.get(i11);
                    f7 = 2.0f;
                    SparseIntArray sparseIntArray2 = this.m0;
                    int i14 = sparseIntArray2.get(i10);
                    int i15 = sparseIntArray2.get(i11);
                    f10 = 0.0f;
                    SparseIntArray sparseIntArray3 = this.n0;
                    float f13 = sparseIntArray3.get(i10) != 0 ? 1.0f : 0.0f;
                    float f14 = sparseIntArray3.get(i11) != 0 ? 1.0f : 0.0f;
                    f11 = this.N != 0 ? AndroidUtilities.dp(12.0f) + AndroidUtilities.lerp(i12, i13, this.P) : AndroidUtilities.dp(12.0f) + (AndroidUtilities.lerp(i12, i13, this.P) - (sparseIntArray.get(L0) - K.a.getLeft()));
                    float lerp = AndroidUtilities.lerp(i14, i15, this.P);
                    AndroidUtilities.lerp(f13, f14, this.P);
                    f12 = lerp;
                }
            } else {
                s4.b1 K2 = u1Var.K(this.K);
                if (K2 != null) {
                    q00 q00Var = (q00) K2.a;
                    f12 = Math.max(AndroidUtilities.dp(16.0f), q00Var.W ? AndroidUtilities.lerp(q00Var.i0, q00Var.d, q00Var.x) : q00Var.d);
                    f11 = (int) com.google.android.gms.internal.play_billing.k3.z(q00Var.W ? AndroidUtilities.lerp(q00Var.i0 + AndroidUtilities.dp(20.0f), q00Var.getMeasuredWidth(), q00Var.x) : q00Var.getMeasuredWidth(), f12, 2.0f, q00Var.getX());
                    f7 = 2.0f;
                    f10 = 0.0f;
                } else {
                    f7 = 2.0f;
                    f10 = 0.0f;
                    f11 = 0.0f;
                    f12 = 0.0f;
                }
            }
            if (f12 != f10) {
                canvas.save();
                canvas.translate(u1Var.getTranslationX(), f10);
                canvas.scale(u1Var.getScaleX(), 1.0f, u1Var.getX() + u1Var.getPivotX(), u1Var.getPivotY());
                float f15 = this.N / f7;
                int dp = (measuredHeight / 2) - AndroidUtilities.dp(14.0f);
                gradientDrawable.setBounds((int) ((f11 - AndroidUtilities.dp(12.5f)) - f15), dp, (int) (f11 + f12 + AndroidUtilities.dp(12.5f) + f15), AndroidUtilities.dp(28.0f) + dp);
                gradientDrawable.setAlpha(31);
                gradientDrawable.draw(canvas);
                canvas.restore();
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(17L, elapsedRealtime - this.r);
        this.r = elapsedRealtime;
        boolean z10 = this.n;
        boolean z11 = true;
        float f16 = !z10 ? 0.0f : 0.0f;
        if (this.s) {
            float f17 = this.v;
            boolean z12 = f17 <= f16;
            float f18 = (min / 420.0f) + f17;
            this.v = f18;
            if (!z10 && z12 && f18 >= f16) {
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
            if (!z10 && r3 && f20 <= 0.0f) {
                this.v = 0.0f;
            }
            if (this.v <= -1.0f) {
                this.v = -1.0f;
                this.s = true;
            }
        }
        r3 = true;
        if (z10) {
            float f21 = this.w;
            if (f21 < 1.0f) {
                float f22 = (min / 180.0f) + f21;
                this.w = f22;
                if (f22 > 1.0f) {
                    this.w = 1.0f;
                }
            }
            z11 = r3;
        } else {
            if (!z10) {
                float f23 = this.w;
                if (f23 > 0.0f) {
                    float f24 = f23 - (min / 180.0f);
                    this.w = f24;
                    if (f24 < 0.0f) {
                        this.w = 0.0f;
                    }
                }
            }
            z11 = r3;
        }
        if (z11) {
            u1Var.f1();
            u1Var.invalidate();
            invalidate();
        }
        return drawChild;
    }

    public final void e(int i10) {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty() || this.S == i10 || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        this.S = i10;
        this.F.x0(i10);
    }

    public final void f(p00 p00Var, int i10) {
        if (p00Var.f) {
            n00 n00Var = this.J;
            if (n00Var != null) {
                ((org.telegram.ui.dw) n00Var).c(p00Var, false);
                return;
            }
            return;
        }
        int i11 = this.K;
        boolean z10 = i11 < i10;
        this.S = -1;
        this.q0 = i11;
        this.r0 = this.L;
        this.K = i10;
        this.L = p00Var.a;
        boolean z11 = this.O;
        org.telegram.ui.Cells.k7 k7Var = this.v0;
        if (z11) {
            AndroidUtilities.cancelRunOnUIThread(k7Var);
            this.O = false;
        }
        this.p0 = 0.0f;
        this.P = 0.0f;
        this.O = true;
        setEnabled(false);
        AndroidUtilities.runOnUIThread(k7Var, 16L);
        n00 n00Var2 = this.J;
        if (n00Var2 != null) {
            ((org.telegram.ui.dw) n00Var2).c(p00Var, z10);
        }
        e(i10);
    }

    public final void g(float f7, int i10) {
        int i11 = this.l0.get(i10, -1);
        if (i11 < 0) {
            return;
        }
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        if (f7 > 0.0f) {
            this.Q = i11;
            this.R = i10;
        } else {
            this.Q = -1;
            this.R = -1;
        }
        this.P = f7;
        ai.u1 u1Var = this.F;
        u1Var.f1();
        u1Var.invalidate();
        invalidate();
        e(i11);
        if (f7 >= 1.0f) {
            this.Q = -1;
            this.R = -1;
            this.K = i11;
            this.L = i10;
        }
    }

    public int getCurrentTabId() {
        return this.L;
    }

    public int getCurrentTabStableId() {
        return this.k0.get(this.K, -1);
    }

    public int getDefaultTabId() {
        p00 d = d();
        if (d == null) {
            return -1;
        }
        return d.a;
    }

    public int getFirstTabId() {
        return this.j0.get(0, 0);
    }

    public int getLastTabId() {
        return this.j0.get(getTabsCount() - 1, 0);
    }

    public im0 getListView() {
        return this.F;
    }

    public int getSelectorColorKey() {
        return this.a0;
    }

    public Drawable getSelectorDrawable() {
        return this.T;
    }

    public im0 getTabsContainer() {
        return this.F;
    }

    public int getTabsCount() {
        return this.h.size();
    }

    public final boolean h(int i10) {
        for (int i11 = 0; i11 < this.h.size(); i11++) {
            if (this.k0.get(i11, -1) == i10) {
                this.K = i11;
                this.L = this.j0.get(i11);
                return true;
            }
        }
        return false;
    }

    public final void i(int i10) {
        int i11 = 0;
        while (true) {
            ai.u1 u1Var = this.F;
            if (i11 >= u1Var.getChildCount()) {
                return;
            }
            if (u1Var.getChildAt(i11) instanceof q00) {
                q00 q00Var = (q00) u1Var.getChildAt(i11);
                if (q00Var.b.a == i10) {
                    q00Var.b(1.0f, 0);
                    try {
                        q00Var.performHapticFeedback(3);
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
        SparseIntArray sparseIntArray = this.o0;
        sparseIntArray.clear();
        SparseIntArray sparseIntArray2 = this.m0;
        sparseIntArray2.clear();
        SparseIntArray sparseIntArray3 = this.n0;
        sparseIntArray3.clear();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = this.G;
        for (int i11 = 0; i11 < size; i11++) {
            int a2 = ((p00) arrayList.get(i11)).a(false);
            sparseIntArray2.put(i11, a2);
            sparseIntArray3.put(i11, ((p00) arrayList.get(i11)).d);
            sparseIntArray.put(i11, (this.N / 2) + i10);
            i10 += AndroidUtilities.dp(24.0f) + a2 + this.N;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        if (this.g0 != i14) {
            this.g0 = i14;
            this.S = -1;
            if (this.O) {
                AndroidUtilities.cancelRunOnUIThread(this.v0);
                this.O = false;
                setEnabled(true);
                n00 n00Var = this.J;
                if (n00Var != null) {
                    ((org.telegram.ui.dw) n00Var).b(1.0f);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int size = View.MeasureSpec.getSize(i10) - (this.G * 2);
            p00 d = d();
            if (d != null) {
                d.b(LocaleController.getString(R.string.FilterAllChats));
                int a2 = d.a(false);
                d.b(LocaleController.getString(this.M > size ? R.string.FilterAllChatsShort : R.string.FilterAllChats));
                int a10 = d.a(false) + (this.M - a2);
                int i12 = this.N;
                int size2 = a10 < size ? (size - a10) / arrayList.size() : 0;
                this.N = size2;
                if (i12 != size2) {
                    this.E = true;
                    ai.u1 u1Var = this.F;
                    s4.l0 itemAnimator = u1Var.getItemAnimator();
                    u1Var.setItemAnimator(null);
                    this.I.l();
                    u1Var.setItemAnimator(itemAnimator);
                    this.E = false;
                }
                j();
                this.h0 = false;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Path path = this.z0;
        path.rewind();
        path.addRoundRect(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), i10 - AndroidUtilities.dp(9.0f), i11 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.E) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f7) {
        this.P = f7;
        ai.u1 u1Var = this.F;
        u1Var.f1();
        u1Var.invalidate();
        invalidate();
        n00 n00Var = this.J;
        if (n00Var != null) {
            ((org.telegram.ui.dw) n00Var).b(f7);
        }
    }

    public void setBlurredBackground(dh.d dVar) {
        this.y0 = dVar;
        setBackground(dVar);
    }

    public void setDelegate(n00 n00Var) {
        this.J = n00Var;
    }

    public void setIsEditing(boolean z10) {
        this.n = z10;
        this.s = true;
        ai.u1 u1Var = this.F;
        u1Var.f1();
        u1Var.invalidate();
        this.I.l();
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
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_updateDialogFiltersOrder, new ci.d6(14));
        this.y = false;
    }
}
