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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class o31 extends h71 {
    public final org.telegram.ui.p20 d3;
    public final g6 e3;
    public Drawable f3;
    public int g3;
    public final Paint h3;

    public o31(Context context, int i10, l31 l31Var, d31 d31Var, d31 d31Var2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, 0, false, l31Var, d31Var, d31Var2, c6Var);
        this.d3 = new org.telegram.ui.p20();
        this.e3 = new g6(this, 320L, es.h);
        this.h3 = new Paint(1);
    }

    @Override // org.telegram.ui.Components.h71, org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e = this.e3.e(canScrollVertically(-1));
        if (e > 0.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
        }
        float height = getHeight();
        float f7 = 0.0f;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof x31) {
                x31 x31Var = (x31) childAt;
                if (x31Var.y) {
                    if (height > x31Var.getY()) {
                        height = x31Var.getY();
                        RecyclerView.R(x31Var);
                    }
                    if (f7 < x31Var.getY() + x31Var.getHeight()) {
                        f7 = x31Var.getY() + x31Var.getHeight();
                        RecyclerView.R(x31Var);
                    }
                }
            }
        }
        if (f7 > height) {
            int i11 = org.telegram.ui.ActionBar.g6.s9;
            org.telegram.ui.ActionBar.c6 c6Var = this.n2;
            int w02 = org.telegram.ui.ActionBar.g6.w0(i11, c6Var);
            Paint paint = this.h3;
            paint.setColor(w02);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getWidth() - AndroidUtilities.dp(56.0f)) / 2.0f, height, (AndroidUtilities.dp(56.0f) + getWidth()) / 2.0f, f7);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            if (this.f3 == null) {
                this.f3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int w03 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.b9, c6Var);
            if (this.g3 != w03) {
                Drawable drawable = this.f3;
                this.g3 = w03;
                drawable.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            }
            this.f3.setBounds((int) (rectF.left + AndroidUtilities.dp(4.0f)), (int) (rectF.top + AndroidUtilities.dp(2.66f)), (int) (rectF.left + AndroidUtilities.dp(13.66f)), (int) (rectF.top + AndroidUtilities.dp(12.32f)));
            this.f3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (e > 0.0f) {
            canvas2.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f));
            this.d3.b(canvas2, rectF2, 1, e);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
