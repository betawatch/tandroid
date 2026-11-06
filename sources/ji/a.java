package ji;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class a extends View {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final RectF d;
    public final /* synthetic */ f6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, f6 f6Var) {
        super(context);
        this.e = f6Var;
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        Paint paint3 = new Paint(1);
        this.c = paint3;
        this.d = new RectF();
        paint2.setColor(-1);
        paint.setColor(k6.w0(k6.d6, f6Var));
        paint3.setColor(k6.w0(k6.kk, f6Var));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i7 = k6.d6;
        f6 f6Var = this.e;
        int w02 = k6.w0(i7, f6Var);
        Paint paint = this.a;
        paint.setColor(w02);
        int w03 = k6.w0(k6.kk, f6Var);
        Paint paint2 = this.c;
        paint2.setColor(w03);
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.d;
        rectF.set(0.0f, 0.0f, width, height);
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, paint);
        rectF.inset(g0.L(1.33f), g0.L(1.33f));
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, paint2);
        rectF.inset(g0.N(4.67f), g0.N(9.066f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.b);
    }
}
