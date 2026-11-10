package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import org.telegram.ui.zy;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class rc extends org.telegram.ui.Components.i6 {
    public final /* synthetic */ int s = 0;
    public final Object w;
    public final /* synthetic */ ViewGroup x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc(sc scVar, Context context, Drawable drawable) {
        super(context, false, false, false);
        this.x = scVar;
        this.w = drawable;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.s) {
            case 0:
                ((sc) this.x).getClass();
                int measuredWidth = (int) ((getMeasuredWidth() - getDrawable().c()) - org.telegram.messenger.g0.L(20.0f));
                Drawable drawable = (Drawable) this.w;
                drawable.setBounds(measuredWidth, org.telegram.messenger.camera.q.y(17.0f, getMeasuredHeight(), 2), org.telegram.messenger.g0.L(17.0f) + measuredWidth, (org.telegram.messenger.g0.L(17.0f) + getMeasuredHeight()) / 2);
                drawable.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            default:
                zy zyVar = (zy) this.x;
                int a10 = zyVar.x.a(zyVar.w, false);
                setTextColor(a10);
                Paint paint = (Paint) this.w;
                paint.setColor(org.telegram.ui.ActionBar.m6.r1(org.telegram.ui.ActionBar.m6.I.q() ? 0.2f : 0.1f, a10));
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set((getWidth() - getDrawable().c()) - org.telegram.messenger.g0.N(9.32f), (getHeight() - org.telegram.messenger.g0.N(14.66f)) / 2.0f, getWidth(), (org.telegram.messenger.g0.N(14.66f) + getHeight()) / 2.0f);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
                super.dispatchDraw(canvas);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc(zy zyVar, Context context) {
        super(context, false, true, true);
        this.x = zyVar;
        this.w = new Paint(1);
    }
}
