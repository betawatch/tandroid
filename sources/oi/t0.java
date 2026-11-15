package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c8.da;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.g9;
import org.telegram.ui.Cells.h9;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class t0 extends x implements org.telegram.ui.ActionBar.z5, g9 {
    public final e6 n;
    public final Paint r;
    public final Paint s;
    public o2 w;
    public boolean x;

    public t0(Context context, e6 e6Var) {
        super(context);
        this.r = new Paint(1);
        this.s = new Paint(1);
        this.n = e6Var;
        setWillNotDraw(false);
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(j6.ml));
        hashSet.add(Integer.valueOf(j6.lg));
    }

    @Override // oi.x
    public final void e(int i7) {
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
        int i7 = this.x ? 0 : this.c;
        int g10 = (g() - i7) / 4;
        arrayList.add(da.a((i7 + g10) - org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f) + (g() - g10), org.telegram.messenger.g0.L(12.0f)));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        h9 textSelectionHelper;
        int i7 = this.x ? 0 : this.c;
        int g10 = (g() - i7) / 4;
        int i10 = i7 + g10;
        int g11 = g() - g10;
        o2 o2Var = this.w;
        if (o2Var != null && (textSelectionHelper = o2Var.a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.p0 && R <= textSelectionHelper.s0) {
                canvas2 = canvas;
                canvas2.drawRoundRect(i10 - org.telegram.messenger.g0.L(12.0f), 0.0f, org.telegram.messenger.g0.L(12.0f) + g11, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), this.s);
                float L = (org.telegram.messenger.g0.L(12.0f) - org.telegram.messenger.g0.L(1.0f)) / 2.0f;
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(i10, L, g11, org.telegram.messenger.g0.L(1.0f) + L);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(0.5f), org.telegram.messenger.g0.L(0.5f), this.r);
            }
        }
        canvas2 = canvas;
        float L2 = (org.telegram.messenger.g0.L(12.0f) - org.telegram.messenger.g0.L(1.0f)) / 2.0f;
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(i10, L2, g11, org.telegram.messenger.g0.L(1.0f) + L2);
        canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(0.5f), org.telegram.messenger.g0.L(0.5f), this.r);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(12.0f));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int i7 = j6.ml;
        e6 e6Var = this.n;
        this.r.setColor(j6.w0(i7, e6Var));
        this.s.setColor(j6.w0(j6.lg, e6Var));
    }
}
