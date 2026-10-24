package ki;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class x0 extends a0 implements org.telegram.ui.ActionBar.b6, n9 {
    public final org.telegram.ui.ActionBar.g6 n;
    public final Paint r;
    public final Paint s;
    public s2 v;
    public boolean w;

    public x0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.r = new Paint(1);
        this.s = new Paint(1);
        this.n = g6Var;
        setWillNotDraw(false);
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.vk));
        hashSet.add(Integer.valueOf(k6.uf));
    }

    @Override // ki.a0
    public final void e(int i10) {
        invalidate();
    }

    @Override // org.telegram.ui.Cells.n9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        int i10 = this.w ? 0 : this.c;
        int g10 = (g() - i10) / 4;
        arrayList.add(w7.j.a((i10 + g10) - AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f) + (g() - g10), AndroidUtilities.dp(12.0f)));
    }

    public final int g() {
        return getMeasuredWidth() - (this.w ? this.c : 0);
    }

    public a getRow() {
        return this.a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        o9 textSelectionHelper;
        int i10 = this.w ? 0 : this.c;
        int g10 = (g() - i10) / 4;
        int i11 = i10 + g10;
        int g11 = g() - g10;
        s2 s2Var = this.v;
        if (s2Var != null && (textSelectionHelper = s2Var.a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.p0 && R <= textSelectionHelper.s0) {
                canvas2 = canvas;
                canvas2.drawRoundRect(i11 - AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(12.0f) + g11, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.s);
                float dp = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(i11, dp, g11, AndroidUtilities.dp(1.0f) + dp);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.r);
            }
        }
        canvas2 = canvas;
        float dp2 = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(i11, dp2, g11, AndroidUtilities.dp(1.0f) + dp2);
        canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.r);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int i10 = k6.vk;
        org.telegram.ui.ActionBar.g6 g6Var = this.n;
        this.r.setColor(k6.w0(i10, g6Var));
        this.s.setColor(k6.w0(k6.uf, g6Var));
    }
}
