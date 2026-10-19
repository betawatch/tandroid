package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class pu0 extends org.telegram.ui.Components.im0 {
    public final Drawable V2;
    public final Paint W2;
    public final RectF X2;

    public pu0(Context context) {
        super(context, null);
        Paint paint = new Paint(1);
        this.W2 = paint;
        this.X2 = new RectF();
        setWillNotDraw(false);
        setClipToPadding(false);
        setTranslationY(-AndroidUtilities.dp(10.0f));
        ou0 ou0Var = new ou0(this);
        setItemAnimator(ou0Var);
        ou0Var.C = false;
        ou0Var.m = false;
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
        paint.setColor(2130706432);
        this.V2 = context.getResources().getDrawable(R.drawable.photo_tooltip2).mutate();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int childCount = getChildCount();
        if (childCount > 0) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(87.0f);
            Drawable drawable = this.V2;
            drawable.setBounds(measuredWidth, 0, drawable.getIntrinsicWidth() + measuredWidth, AndroidUtilities.dp(6.0f));
            drawable.draw(canvas);
            int i10 = Integer.MIN_VALUE;
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                i11 = (int) Math.min(i11, Math.floor(childAt.getX()));
                i10 = (int) Math.max(i10, Math.ceil(childAt.getX() + childAt.getMeasuredWidth()));
            }
            if (i11 == Integer.MAX_VALUE || i10 == Integer.MIN_VALUE) {
                return;
            }
            float dp = i11 - AndroidUtilities.dp(6.0f);
            float dp2 = AndroidUtilities.dp(6.0f);
            float dp3 = AndroidUtilities.dp(6.0f) + i10;
            float dp4 = AndroidUtilities.dp(103.0f);
            RectF rectF = this.X2;
            rectF.set(dp, dp2, dp3, dp4);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.W2);
        }
    }
}
