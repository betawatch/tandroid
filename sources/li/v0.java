package li;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class v0 extends y implements org.telegram.ui.ActionBar.a6, h9 {
    public final f6 n;
    public final Paint r;
    public final Paint s;
    public q2 w;
    public boolean x;

    public v0(Context context, f6 f6Var) {
        super(context);
        this.r = new Paint(1);
        this.s = new Paint(1);
        this.n = f6Var;
        setWillNotDraw(false);
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.jl));
        hashSet.add(Integer.valueOf(k6.ig));
    }

    @Override // li.y
    public final void e(int i7) {
        invalidate();
    }

    public final int g() {
        return getMeasuredWidth() - (this.x ? this.c : 0);
    }

    public a getRow() {
        return this.a;
    }

    @Override // org.telegram.ui.Cells.h9
    public final void k(ArrayList arrayList) {
        int i7 = this.x ? 0 : this.c;
        int g10 = (g() - i7) / 4;
        arrayList.add(c8.m1.a((i7 + g10) - org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f) + (g() - g10), org.telegram.messenger.g0.L(12.0f)));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        i9 textSelectionHelper;
        int i7 = this.x ? 0 : this.c;
        int g10 = (g() - i7) / 4;
        int i10 = i7 + g10;
        int g11 = g() - g10;
        q2 q2Var = this.w;
        if (q2Var != null && (textSelectionHelper = q2Var.a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
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

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        int i7 = k6.jl;
        f6 f6Var = this.n;
        this.r.setColor(k6.w0(i7, f6Var));
        this.s.setColor(k6.w0(k6.ig, f6Var));
    }
}
