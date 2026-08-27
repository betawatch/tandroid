package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class t11 extends k51 {
    public final org.telegram.ui.v10 b3;
    public final y5 c3;
    public Drawable d3;
    public int e3;
    public final Paint f3;

    public t11(Context context, int i10, q11 q11Var, k11 k11Var, k11 k11Var2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, 0, false, q11Var, k11Var, k11Var2, c6Var);
        this.b3 = new org.telegram.ui.v10();
        this.c3 = new y5(this, 320L, er.h);
        this.f3 = new Paint(1);
    }

    @Override // org.telegram.ui.Components.k51, org.telegram.ui.Components.zk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e9 = this.c3.e(canScrollVertically(-1));
        if (e9 > 0.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
        }
        float height = getHeight();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof c21) {
                c21 c21Var = (c21) childAt;
                if (c21Var.y) {
                    if (height > c21Var.getY()) {
                        height = c21Var.getY();
                        RecyclerView.R(c21Var);
                    }
                    if (f10 < c21Var.getY() + c21Var.getHeight()) {
                        f10 = c21Var.getY() + c21Var.getHeight();
                        RecyclerView.R(c21Var);
                    }
                }
            }
        }
        if (f10 > height) {
            int i11 = org.telegram.ui.ActionBar.g6.s9;
            org.telegram.ui.ActionBar.c6 c6Var = this.l2;
            int v02 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
            Paint paint = this.f3;
            paint.setColor(v02);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getWidth() - AndroidUtilities.dp(56.0f)) / 2.0f, height, (AndroidUtilities.dp(56.0f) + getWidth()) / 2.0f, f10);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            if (this.d3 == null) {
                this.d3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.b9, c6Var);
            if (this.e3 != v03) {
                Drawable drawable = this.d3;
                this.e3 = v03;
                drawable.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
            }
            this.d3.setBounds((int) (rectF.left + AndroidUtilities.dp(4.0f)), (int) (rectF.top + AndroidUtilities.dp(2.66f)), (int) (rectF.left + AndroidUtilities.dp(13.66f)), (int) (rectF.top + AndroidUtilities.dp(12.32f)));
            this.d3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (e9 > 0.0f) {
            canvas2.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f));
            this.b3.b(canvas2, rectF2, 1, e9);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
