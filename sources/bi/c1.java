package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class c1 extends c0 implements org.telegram.ui.ActionBar.k6, j9 {
    public final org.telegram.ui.ActionBar.p6 n;
    public final Paint r;
    public final Paint s;
    public z2 w;
    public boolean x;

    public c1(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.r = new Paint(1);
        this.s = new Paint(1);
        this.n = p6Var;
        setWillNotDraw(false);
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.jl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ig));
    }

    @Override // bi.c0
    public final void e(int i10) {
        invalidate();
    }

    public final int g() {
        return getMeasuredWidth() - (this.x ? this.c : 0);
    }

    public a getRow() {
        return this.a;
    }

    @Override // org.telegram.ui.Cells.j9
    public final void h(ArrayList arrayList) {
        int i10 = this.x ? 0 : this.c;
        int g10 = (g() - i10) / 4;
        arrayList.add(v7.b5.a((i10 + g10) - org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f) + (g() - g10), org.telegram.messenger.i0.L(12.0f)));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        k9 textSelectionHelper;
        int i10 = this.x ? 0 : this.c;
        int g10 = (g() - i10) / 4;
        int i11 = i10 + g10;
        int g11 = g() - g10;
        z2 z2Var = this.w;
        if (z2Var != null && (textSelectionHelper = z2Var.a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.p0 && R <= textSelectionHelper.s0) {
                canvas2 = canvas;
                canvas2.drawRoundRect(i11 - org.telegram.messenger.i0.L(12.0f), 0.0f, org.telegram.messenger.i0.L(12.0f) + g11, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), this.s);
                float L = (org.telegram.messenger.i0.L(12.0f) - org.telegram.messenger.i0.L(1.0f)) / 2.0f;
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(i11, L, g11, org.telegram.messenger.i0.L(1.0f) + L);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(0.5f), org.telegram.messenger.i0.L(0.5f), this.r);
            }
        }
        canvas2 = canvas;
        float L2 = (org.telegram.messenger.i0.L(12.0f) - org.telegram.messenger.i0.L(1.0f)) / 2.0f;
        RectF rectF2 = org.telegram.messenger.i0.P;
        rectF2.set(i11, L2, g11, org.telegram.messenger.i0.L(1.0f) + L2);
        canvas2.drawRoundRect(rectF2, org.telegram.messenger.i0.L(0.5f), org.telegram.messenger.i0.L(0.5f), this.r);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(12.0f));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.t6.jl;
        org.telegram.ui.ActionBar.p6 p6Var = this.n;
        this.r.setColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        this.s.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ig, p6Var));
    }
}
