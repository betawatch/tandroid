package mi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b8.oe;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.g9;
import org.telegram.ui.Cells.h9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class w0 extends y implements org.telegram.ui.ActionBar.z5, g9 {
    public final org.telegram.ui.ActionBar.e6 n;
    public final Paint r;
    public final Paint s;
    public r2 w;
    public boolean x;

    public w0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.r = new Paint(1);
        this.s = new Paint(1);
        this.n = e6Var;
        setWillNotDraw(false);
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.jl));
        hashSet.add(Integer.valueOf(k6.ig));
    }

    @Override // mi.y
    public final void e(int i3) {
        invalidate();
    }

    public final int g() {
        return getMeasuredWidth() - (this.x ? this.c : 0);
    }

    public a getRow() {
        return this.a;
    }

    @Override // org.telegram.ui.Cells.g9
    public final void k(ArrayList arrayList) {
        int i3 = this.x ? 0 : this.c;
        int g7 = (g() - i3) / 4;
        arrayList.add(oe.a((i3 + g7) - org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f) + (g() - g7), org.telegram.messenger.g0.L(12.0f)));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        h9 textSelectionHelper;
        int i3 = this.x ? 0 : this.c;
        int g7 = (g() - i3) / 4;
        int i10 = i3 + g7;
        int g10 = g() - g7;
        r2 r2Var = this.w;
        if (r2Var != null && (textSelectionHelper = r2Var.a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.p0 && R <= textSelectionHelper.s0) {
                canvas2 = canvas;
                canvas2.drawRoundRect(i10 - org.telegram.messenger.g0.L(12.0f), 0.0f, org.telegram.messenger.g0.L(12.0f) + g10, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), this.s);
                float L = (org.telegram.messenger.g0.L(12.0f) - org.telegram.messenger.g0.L(1.0f)) / 2.0f;
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(i10, L, g10, org.telegram.messenger.g0.L(1.0f) + L);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(0.5f), org.telegram.messenger.g0.L(0.5f), this.r);
            }
        }
        canvas2 = canvas;
        float L2 = (org.telegram.messenger.g0.L(12.0f) - org.telegram.messenger.g0.L(1.0f)) / 2.0f;
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(i10, L2, g10, org.telegram.messenger.g0.L(1.0f) + L2);
        canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(0.5f), org.telegram.messenger.g0.L(0.5f), this.r);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(12.0f));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int i3 = k6.jl;
        org.telegram.ui.ActionBar.e6 e6Var = this.n;
        this.r.setColor(k6.w0(i3, e6Var));
        this.s.setColor(k6.w0(k6.ig, e6Var));
    }
}
