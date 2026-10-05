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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class m31 extends e71 {
    public final org.telegram.ui.k20 m3;
    public final e6 n3;
    public Drawable o3;
    public int p3;
    public final Paint q3;

    public m31(Context context, int i10, j31 j31Var, b31 b31Var, b31 b31Var2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, 0, false, j31Var, b31Var, b31Var2, d6Var);
        this.m3 = new org.telegram.ui.k20();
        this.n3 = new e6(this, 320L, tr.h);
        this.q3 = new Paint(1);
    }

    @Override // org.telegram.ui.Components.e71, org.telegram.ui.Components.zl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e7 = this.n3.e(canScrollVertically(-1));
        if (e7 > 0.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
        }
        float height = getHeight();
        float f7 = 0.0f;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof v31) {
                v31 v31Var = (v31) childAt;
                if (v31Var.y) {
                    if (height > v31Var.getY()) {
                        height = v31Var.getY();
                        RecyclerView.R(v31Var);
                    }
                    if (f7 < v31Var.getY() + v31Var.getHeight()) {
                        f7 = v31Var.getY() + v31Var.getHeight();
                        RecyclerView.R(v31Var);
                    }
                }
            }
        }
        if (f7 > height) {
            int i11 = org.telegram.ui.ActionBar.i6.s9;
            org.telegram.ui.ActionBar.d6 d6Var = this.p2;
            int v02 = org.telegram.ui.ActionBar.i6.v0(i11, d6Var);
            Paint paint = this.q3;
            paint.setColor(v02);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getWidth() - AndroidUtilities.dp(56.0f)) / 2.0f, height, (AndroidUtilities.dp(56.0f) + getWidth()) / 2.0f, f7);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            if (this.o3 == null) {
                this.o3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int v03 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.b9, d6Var);
            if (this.p3 != v03) {
                Drawable drawable = this.o3;
                this.p3 = v03;
                drawable.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
            }
            this.o3.setBounds((int) (rectF.left + AndroidUtilities.dp(4.0f)), (int) (rectF.top + AndroidUtilities.dp(2.66f)), (int) (rectF.left + AndroidUtilities.dp(13.66f)), (int) (rectF.top + AndroidUtilities.dp(12.32f)));
            this.o3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (e7 > 0.0f) {
            canvas2.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f));
            this.m3.b(canvas2, rectF2, 1, e7);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
