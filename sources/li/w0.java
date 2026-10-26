package li;

import a8.ae;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s9;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class w0 extends z implements p6, r9 {
    public final u6 n;
    public final Paint r;
    public final Paint s;
    public q2 v;
    public boolean w;

    public w0(Context context, u6 u6Var) {
        super(context);
        this.r = new Paint(1);
        this.s = new Paint(1);
        this.n = u6Var;
        setWillNotDraw(false);
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.vk));
        hashSet.add(Integer.valueOf(y6.uf));
    }

    @Override // li.z
    public final void e(int i10) {
        invalidate();
    }

    @Override // org.telegram.ui.Cells.r9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        int i10 = this.w ? 0 : this.c;
        int g7 = (g() - i10) / 4;
        arrayList.add(ae.a((i10 + g7) - AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f) + (g() - g7), AndroidUtilities.dp(12.0f)));
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
        s9 textSelectionHelper;
        int i10 = this.w ? 0 : this.c;
        int g7 = (g() - i10) / 4;
        int i11 = i10 + g7;
        int g10 = g() - g7;
        q2 q2Var = this.v;
        if (q2Var != null && (textSelectionHelper = q2Var.a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.p0 && R <= textSelectionHelper.s0) {
                canvas2 = canvas;
                canvas2.drawRoundRect(i11 - AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(12.0f) + g10, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.s);
                float dp = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(i11, dp, g10, AndroidUtilities.dp(1.0f) + dp);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.r);
            }
        }
        canvas2 = canvas;
        float dp2 = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(i11, dp2, g10, AndroidUtilities.dp(1.0f) + dp2);
        canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.r);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        int i10 = y6.vk;
        u6 u6Var = this.n;
        this.r.setColor(y6.w0(i10, u6Var));
        this.s.setColor(y6.w0(y6.uf, u6Var));
    }
}
