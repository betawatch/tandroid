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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class yz extends FrameLayout {
    public static final /* synthetic */ int w0 = 0;
    public boolean A;
    public final hh.f1 B;
    public final int C;
    public final org.telegram.ui.vq D;
    public final uz E;
    public tz F;
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
    public final er e0;
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
    public final qz o0;
    public Drawable p0;
    public int q0;
    public long r;
    public final m.i3 r0;
    public boolean s;
    public float s0;
    public final org.telegram.ui.Cells.b2 t0;
    public lg.d u0;
    public float v;
    public final Path v0;
    public float w;
    public AnimatorSet x;
    public boolean y;

    public yz(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
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
        this.e0 = er.h;
        this.f0 = new SparseIntArray(5);
        this.g0 = new SparseIntArray(5);
        this.h0 = new SparseIntArray(5);
        this.i0 = new SparseIntArray(5);
        this.j0 = new SparseIntArray(5);
        this.k0 = new SparseIntArray(5);
        this.r0 = new m.i3(this, 19);
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
        hh.f1 f1Var = new hh.f1(this, context, 16);
        this.B = f1Var;
        f1Var.setClipChildren(false);
        qz qzVar = new qz(this);
        this.o0 = qzVar;
        qzVar.C = false;
        f1Var.setItemAnimator(qzVar);
        f1Var.setSelectorType(9);
        f1Var.setSelectorRadius(6);
        f1Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(this.T, c6Var));
        org.telegram.ui.vq vqVar = new org.telegram.ui.vq((ViewGroup) this, 1);
        this.D = vqVar;
        f1Var.setLayoutManager(vqVar);
        new f2.f0(new xz(this)).d(f1Var);
        int max = Math.max(0, AndroidUtilities.dp(11.5f));
        this.C = max;
        f1Var.setPadding(max, 0, max, 0);
        f1Var.setClipToPadding(false);
        f1Var.setDrawSelectorBehind(true);
        uz uzVar = new uz(this, context);
        this.E = uzVar;
        uzVar.C(true);
        f1Var.setAdapter(uzVar);
        f1Var.setOnItemClickListener(new oz(this));
        f1Var.setOnItemLongClickListener(new oz(this));
        f1Var.setOnScrollListener(new xm(this, 4));
        f1Var.v2 = true;
        f1Var.setOverScrollMode(2);
        addView(f1Var, h7.z5.c(-1.0f, -1));
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
        vz vzVar = new vz(this, i10, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false), arrayList, textPaint.getFontMetricsInt()), z10);
        vzVar.e = z11;
        vzVar.f = z12;
        this.I = org.telegram.messenger.y1.C(24.0f, vzVar.a(true), this.I);
        arrayList2.add(vzVar);
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
        this.x.addListener(new sz(this, 0));
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
            vz vzVar = (vz) arrayList.get(i10);
            if (vzVar.d != ((org.telegram.ui.gw) this.F).a(vzVar.a)) {
                if (((org.telegram.ui.gw) this.F).a(vzVar.a) < 0) {
                    continue;
                } else {
                    if (this.i0.get(i10) != vzVar.a(true) || this.d0) {
                        this.d0 = true;
                        requestLayout();
                        this.I = 0;
                        vz d = d();
                        if (d != null) {
                            d.b(LocaleController.getString(R.string.FilterAllChats));
                        }
                        for (int i11 = 0; i11 < size; i11++) {
                            this.I = org.telegram.messenger.y1.C(24.0f, ((vz) arrayList.get(i11)).a(true), this.I);
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

    public final vz d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return null;
            }
            if (((vz) arrayList.get(i10)).e) {
                return (vz) arrayList.get(i10);
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
        f2.o1 K;
        int i10;
        int i11;
        float f10;
        float f11;
        float dp;
        float f12;
        boolean drawChild = super.drawChild(canvas, view, j10);
        hh.f1 f1Var = this.B;
        if (view == f1Var) {
            int measuredHeight = getMeasuredHeight();
            int alpha = (int) (f1Var.getAlpha() * 255.0f);
            GradientDrawable gradientDrawable = this.P;
            gradientDrawable.setAlpha(alpha);
            if (this.K || this.M != -1) {
                int L0 = this.D.L0();
                if (L0 != -1 && (K = f1Var.K(L0)) != null) {
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
                    f10 = 2.0f;
                    SparseIntArray sparseIntArray2 = this.i0;
                    int i14 = sparseIntArray2.get(i10);
                    int i15 = sparseIntArray2.get(i11);
                    f11 = 0.0f;
                    SparseIntArray sparseIntArray3 = this.j0;
                    float f13 = sparseIntArray3.get(i10) != 0 ? 1.0f : 0.0f;
                    float f14 = sparseIntArray3.get(i11) != 0 ? 1.0f : 0.0f;
                    dp = this.J != 0 ? AndroidUtilities.dp(12.0f) + AndroidUtilities.lerp(i12, i13, this.L) : AndroidUtilities.dp(12.0f) + (AndroidUtilities.lerp(i12, i13, this.L) - (sparseIntArray.get(L0) - K.a.getLeft()));
                    float lerp = AndroidUtilities.lerp(i14, i15, this.L);
                    AndroidUtilities.lerp(f13, f14, this.L);
                    f12 = lerp;
                    if (f12 != f11) {
                        canvas.save();
                        canvas.translate(f1Var.getTranslationX(), 0.0f);
                        canvas.scale(f1Var.getScaleX(), 1.0f, f1Var.getX() + f1Var.getPivotX(), f1Var.getPivotY());
                        float f15 = this.J / f10;
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
                f2.o1 K2 = f1Var.K(this.G);
                if (K2 != null) {
                    wz wzVar = (wz) K2.a;
                    f12 = Math.max(AndroidUtilities.dp(16.0f), wzVar.S ? AndroidUtilities.lerp(wzVar.e0, wzVar.d, wzVar.x) : wzVar.d);
                    dp = (int) com.google.android.recaptcha.internal.a.A(wzVar.S ? AndroidUtilities.lerp(wzVar.e0 + AndroidUtilities.dp(20.0f), wzVar.getMeasuredWidth(), wzVar.x) : wzVar.getMeasuredWidth(), f12, 2.0f, wzVar.getX());
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
            f1Var.f1();
            f1Var.invalidate();
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

    public final void f(vz vzVar, int i10) {
        if (vzVar.f) {
            tz tzVar = this.F;
            if (tzVar != null) {
                ((org.telegram.ui.gw) tzVar).c(vzVar, false);
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
        this.H = vzVar.a;
        boolean z11 = this.K;
        m.i3 i3Var = this.r0;
        if (z11) {
            AndroidUtilities.cancelRunOnUIThread(i3Var);
            this.K = false;
        }
        this.l0 = 0.0f;
        this.L = 0.0f;
        this.K = true;
        setEnabled(false);
        AndroidUtilities.runOnUIThread(i3Var, 16L);
        tz tzVar2 = this.F;
        if (tzVar2 != null) {
            ((org.telegram.ui.gw) tzVar2).c(vzVar, z10);
        }
        e(i10);
    }

    public final void g(float f10, int i10) {
        int i11 = this.h0.get(i10, -1);
        if (i11 < 0) {
            return;
        }
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f10 > 0.0f) {
            this.M = i11;
            this.N = i10;
        } else {
            this.M = -1;
            this.N = -1;
        }
        this.L = f10;
        hh.f1 f1Var = this.B;
        f1Var.f1();
        f1Var.invalidate();
        invalidate();
        e(i11);
        if (f10 >= 1.0f) {
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
        vz d = d();
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

    public zk0 getListView() {
        return this.B;
    }

    public int getSelectorColorKey() {
        return this.T;
    }

    public Drawable getSelectorDrawable() {
        return this.P;
    }

    public zk0 getTabsContainer() {
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
            hh.f1 f1Var = this.B;
            if (i11 >= f1Var.getChildCount()) {
                return;
            }
            if (f1Var.getChildAt(i11) instanceof wz) {
                wz wzVar = (wz) f1Var.getChildAt(i11);
                if (wzVar.b.a == i10) {
                    wzVar.b(1.0f, 0);
                    try {
                        wzVar.performHapticFeedback(3);
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
            int a2 = ((vz) arrayList.get(i11)).a(false);
            sparseIntArray2.put(i11, a2);
            sparseIntArray3.put(i11, ((vz) arrayList.get(i11)).d);
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
                tz tzVar = this.F;
                if (tzVar != null) {
                    ((org.telegram.ui.gw) tzVar).b(1.0f);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int size = View.MeasureSpec.getSize(i10) - (this.C * 2);
            vz d = d();
            if (d != null) {
                d.b(LocaleController.getString(R.string.FilterAllChats));
                int a2 = d.a(false);
                d.b(LocaleController.getString(this.I > size ? R.string.FilterAllChatsShort : R.string.FilterAllChats));
                int a3 = d.a(false) + (this.I - a2);
                int i12 = this.J;
                int size2 = a3 < size ? (size - a3) / arrayList.size() : 0;
                this.J = size2;
                if (i12 != size2) {
                    this.A = true;
                    hh.f1 f1Var = this.B;
                    f2.v0 itemAnimator = f1Var.getItemAnimator();
                    f1Var.setItemAnimator(null);
                    this.E.l();
                    f1Var.setItemAnimator(itemAnimator);
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

    public void setAnimationIdicatorProgress(float f10) {
        this.L = f10;
        hh.f1 f1Var = this.B;
        f1Var.f1();
        f1Var.invalidate();
        invalidate();
        tz tzVar = this.F;
        if (tzVar != null) {
            ((org.telegram.ui.gw) tzVar).b(f10);
        }
    }

    public void setBlurredBackground(lg.d dVar) {
        this.u0 = dVar;
        setBackground(dVar);
    }

    public void setDelegate(tz tzVar) {
        this.F = tzVar;
    }

    public void setIsEditing(boolean z10) {
        this.n = z10;
        this.s = true;
        hh.f1 f1Var = this.B;
        f1Var.f1();
        f1Var.invalidate();
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
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_updateDialogFiltersOrder, new jh.m5(11));
        this.y = false;
    }
}
