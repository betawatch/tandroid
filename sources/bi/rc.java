package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import org.telegram.ui.wy;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class rc extends org.telegram.ui.Components.j6 {
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
                Drawable drawable = (Drawable) this.w;
                if (!((sc) this.x).d) {
                    int measuredWidth = (int) ((getMeasuredWidth() - getDrawable().c()) - org.telegram.messenger.g0.L(20.0f));
                    drawable.setBounds(measuredWidth, org.telegram.messenger.camera.q.y(17.0f, getMeasuredHeight(), 2), org.telegram.messenger.g0.L(17.0f) + measuredWidth, (org.telegram.messenger.g0.L(17.0f) + getMeasuredHeight()) / 2);
                    drawable.draw(canvas);
                }
                super.dispatchDraw(canvas);
                break;
            default:
                wy wyVar = (wy) this.x;
                int a10 = wyVar.x.a(wyVar.w, false);
                setTextColor(a10);
                Paint paint = (Paint) this.w;
                paint.setColor(org.telegram.ui.ActionBar.k6.r1(org.telegram.ui.ActionBar.k6.I.q() ? 0.2f : 0.1f, a10));
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set((getWidth() - getDrawable().c()) - org.telegram.messenger.g0.N(9.32f), (getHeight() - org.telegram.messenger.g0.N(14.66f)) / 2.0f, getWidth(), (org.telegram.messenger.g0.N(14.66f) + getHeight()) / 2.0f);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
                super.dispatchDraw(canvas);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc(wy wyVar, Context context) {
        super(context, false, true, true);
        this.x = wyVar;
        this.w = new Paint(1);
    }
}
