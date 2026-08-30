package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class pu0 extends org.telegram.ui.Components.sl0 {
    public final Drawable U2;
    public final Paint V2;
    public final RectF W2;

    public pu0(Context context) {
        super(context, null);
        Paint paint = new Paint(1);
        this.V2 = paint;
        this.W2 = new RectF();
        setWillNotDraw(false);
        setClipToPadding(false);
        setTranslationY(-AndroidUtilities.dp(10.0f));
        ou0 ou0Var = new ou0(this);
        setItemAnimator(ou0Var);
        ou0Var.C = false;
        ou0Var.m = false;
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
        paint.setColor(2130706432);
        this.U2 = context.getResources().getDrawable(R.drawable.photo_tooltip2).mutate();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int childCount = getChildCount();
        if (childCount > 0) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(87.0f);
            Drawable drawable = this.U2;
            drawable.setBounds(measuredWidth, 0, drawable.getIntrinsicWidth() + measuredWidth, AndroidUtilities.dp(6.0f));
            drawable.draw(canvas);
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i11 = TLObject.FLAG_31;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                i10 = (int) Math.min(i10, Math.floor(childAt.getX()));
                i11 = (int) Math.max(i11, Math.ceil(childAt.getX() + childAt.getMeasuredWidth()));
            }
            if (i10 == Integer.MAX_VALUE || i11 == Integer.MIN_VALUE) {
                return;
            }
            float dp = i10 - AndroidUtilities.dp(6.0f);
            float dp2 = AndroidUtilities.dp(6.0f);
            float dp3 = AndroidUtilities.dp(6.0f) + i11;
            float dp4 = AndroidUtilities.dp(103.0f);
            RectF rectF = this.W2;
            rectF.set(dp, dp2, dp3, dp4);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.V2);
        }
    }
}
