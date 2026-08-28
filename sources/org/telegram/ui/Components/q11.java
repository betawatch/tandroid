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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q11 extends i51 {
    public final org.telegram.ui.s10 b3;
    public final y5 c3;
    public Drawable d3;
    public int e3;
    public final Paint f3;

    public q11(Context context, int i9, n11 n11Var, i11 i11Var, i11 i11Var2, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, i9, 0, false, n11Var, i11Var, i11Var2, b6Var);
        this.b3 = new org.telegram.ui.s10();
        this.c3 = new y5(this, 320L, gr.h);
        this.f3 = new Paint(1);
    }

    @Override // org.telegram.ui.Components.i51, org.telegram.ui.Components.wk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e10 = this.c3.e(canScrollVertically(-1));
        if (e10 > 0.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
        }
        float height = getHeight();
        float f10 = 0.0f;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof a21) {
                a21 a21Var = (a21) childAt;
                if (a21Var.y) {
                    if (height > a21Var.getY()) {
                        height = a21Var.getY();
                        RecyclerView.R(a21Var);
                    }
                    if (f10 < a21Var.getY() + a21Var.getHeight()) {
                        f10 = a21Var.getY() + a21Var.getHeight();
                        RecyclerView.R(a21Var);
                    }
                }
            }
        }
        if (f10 > height) {
            int i10 = org.telegram.ui.ActionBar.f6.s9;
            org.telegram.ui.ActionBar.b6 b6Var = this.l2;
            int v02 = org.telegram.ui.ActionBar.f6.v0(i10, b6Var);
            Paint paint = this.f3;
            paint.setColor(v02);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getWidth() - AndroidUtilities.dp(56.0f)) / 2.0f, height, (AndroidUtilities.dp(56.0f) + getWidth()) / 2.0f, f10);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            if (this.d3 == null) {
                this.d3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.b9, b6Var);
            if (this.e3 != v03) {
                Drawable drawable = this.d3;
                this.e3 = v03;
                drawable.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
            }
            this.d3.setBounds((int) (rectF.left + AndroidUtilities.dp(4.0f)), (int) (rectF.top + AndroidUtilities.dp(2.66f)), (int) (rectF.left + AndroidUtilities.dp(13.66f)), (int) (rectF.top + AndroidUtilities.dp(12.32f)));
            this.d3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (e10 > 0.0f) {
            canvas2.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f));
            this.b3.b(canvas2, rectF2, 1, e10);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
