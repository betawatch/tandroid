package jh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.d00;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class w9 extends org.telegram.ui.Components.o6 {
    public final /* synthetic */ int s = 0;
    public final Object v;
    public final /* synthetic */ ViewGroup w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(x9 x9Var, Context context, Drawable drawable) {
        super(context, false, false, false);
        this.w = x9Var;
        this.v = drawable;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.s) {
            case 0:
                Drawable drawable = (Drawable) this.v;
                if (!((x9) this.w).d) {
                    int measuredWidth = (int) ((getMeasuredWidth() - getDrawable().d()) - AndroidUtilities.dp(20.0f));
                    drawable.setBounds(measuredWidth, org.telegram.ui.b.x(17.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(17.0f) + measuredWidth, (AndroidUtilities.dp(17.0f) + getMeasuredHeight()) / 2);
                    drawable.draw(canvas);
                }
                super.dispatchDraw(canvas);
                break;
            default:
                d00 d00Var = (d00) this.w;
                int a2 = d00Var.w.a(d00Var.v, false);
                setTextColor(a2);
                Paint paint = (Paint) this.v;
                paint.setColor(org.telegram.ui.ActionBar.g6.l1(org.telegram.ui.ActionBar.g6.I.q() ? 0.2f : 0.1f, a2));
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set((getWidth() - getDrawable().d()) - AndroidUtilities.dpf2(9.32f), (getHeight() - AndroidUtilities.dpf2(14.66f)) / 2.0f, getWidth(), (AndroidUtilities.dpf2(14.66f) + getHeight()) / 2.0f);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                super.dispatchDraw(canvas);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(d00 d00Var, Context context) {
        super(context, false, true, true);
        this.w = d00Var;
        this.v = new Paint(1);
    }
}
