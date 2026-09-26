package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import v7.q8;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class y0 extends a0 implements org.telegram.ui.ActionBar.x5, p9 {
    public final org.telegram.ui.ActionBar.d6 n;
    public final Paint r;
    public final Paint s;
    public t2 v;
    public boolean w;

    public y0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.r = new Paint(1);
        this.s = new Paint(1);
        this.n = d6Var;
        setWillNotDraw(false);
        e();
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.h6.vk;
        org.telegram.ui.ActionBar.d6 d6Var = this.n;
        this.r.setColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        this.s.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.uf, d6Var));
    }

    @Override // ii.a0
    public final void f(int i10) {
        invalidate();
    }

    @Override // org.telegram.ui.Cells.p9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        int i10 = this.w ? 0 : this.c;
        int h = (h() - i10) / 4;
        arrayList.add(q8.a((i10 + h) - AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f) + (h() - h), AndroidUtilities.dp(12.0f)));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.a;
    }

    public final int h() {
        return getMeasuredWidth() - (this.w ? this.c : 0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        q9 textSelectionHelper;
        int i10 = this.w ? 0 : this.c;
        int h = (h() - i10) / 4;
        int i11 = i10 + h;
        int h10 = h() - h;
        t2 t2Var = this.v;
        if (t2Var != null && (textSelectionHelper = t2Var.a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.u0 && R <= textSelectionHelper.x0) {
                canvas2 = canvas;
                canvas2.drawRoundRect(i11 - AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(12.0f) + h10, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.s);
                float dp = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(i11, dp, h10, AndroidUtilities.dp(1.0f) + dp);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.r);
            }
        }
        canvas2 = canvas;
        float dp2 = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(i11, dp2, h10, AndroidUtilities.dp(1.0f) + dp2);
        canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.r);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
    }
}
