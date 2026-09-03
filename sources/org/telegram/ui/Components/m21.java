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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class m21 extends h61 {
    public final org.telegram.ui.h20 c3;
    public final z5 d3;
    public Drawable e3;
    public int f3;
    public final Paint g3;

    public m21(Context context, int i10, j21 j21Var, e21 e21Var, e21 e21Var2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, 0, false, j21Var, e21Var, e21Var2, g6Var);
        this.c3 = new org.telegram.ui.h20();
        this.d3 = new z5(this, 320L, pr.h);
        this.g3 = new Paint(1);
    }

    @Override // org.telegram.ui.Components.h61, org.telegram.ui.Components.sl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e6 = this.d3.e(canScrollVertically(-1));
        if (e6 > 0.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
        }
        float height = getHeight();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof v21) {
                v21 v21Var = (v21) childAt;
                if (v21Var.y) {
                    if (height > v21Var.getY()) {
                        height = v21Var.getY();
                        RecyclerView.R(v21Var);
                    }
                    if (f10 < v21Var.getY() + v21Var.getHeight()) {
                        f10 = v21Var.getY() + v21Var.getHeight();
                        RecyclerView.R(v21Var);
                    }
                }
            }
        }
        if (f10 > height) {
            int i11 = org.telegram.ui.ActionBar.k6.s9;
            org.telegram.ui.ActionBar.g6 g6Var = this.m2;
            int v02 = org.telegram.ui.ActionBar.k6.v0(i11, g6Var);
            Paint paint = this.g3;
            paint.setColor(v02);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getWidth() - AndroidUtilities.dp(56.0f)) / 2.0f, height, (AndroidUtilities.dp(56.0f) + getWidth()) / 2.0f, f10);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            if (this.e3 == null) {
                this.e3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int v03 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.b9, g6Var);
            if (this.f3 != v03) {
                Drawable drawable = this.e3;
                this.f3 = v03;
                drawable.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
            }
            this.e3.setBounds((int) (rectF.left + AndroidUtilities.dp(4.0f)), (int) (rectF.top + AndroidUtilities.dp(2.66f)), (int) (rectF.left + AndroidUtilities.dp(13.66f)), (int) (rectF.top + AndroidUtilities.dp(12.32f)));
            this.e3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (e6 > 0.0f) {
            canvas2.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f));
            this.c3.b(canvas2, rectF2, 1, e6);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
