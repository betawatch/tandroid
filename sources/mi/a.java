package mi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class a extends View {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final RectF d;
    public final /* synthetic */ i6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, i6 i6Var) {
        super(context);
        this.e = i6Var;
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        Paint paint3 = new Paint(1);
        this.c = paint3;
        this.d = new RectF();
        paint2.setColor(-1);
        paint.setColor(n6.w0(n6.d6, i6Var));
        paint3.setColor(n6.w0(n6.nk, i6Var));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i7 = n6.d6;
        i6 i6Var = this.e;
        int w02 = n6.w0(i7, i6Var);
        Paint paint = this.a;
        paint.setColor(w02);
        int w03 = n6.w0(n6.nk, i6Var);
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
