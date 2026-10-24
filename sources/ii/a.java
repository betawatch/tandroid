package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class a extends View {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final RectF d;
    public final /* synthetic */ g6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, g6 g6Var) {
        super(context);
        this.e = g6Var;
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        Paint paint3 = new Paint(1);
        this.c = paint3;
        this.d = new RectF();
        paint2.setColor(-1);
        paint.setColor(k6.w0(k6.d6, g6Var));
        paint3.setColor(k6.w0(k6.wj, g6Var));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i10 = k6.d6;
        g6 g6Var = this.e;
        int w02 = k6.w0(i10, g6Var);
        Paint paint = this.a;
        paint.setColor(w02);
        int w03 = k6.w0(k6.wj, g6Var);
        Paint paint2 = this.c;
        paint2.setColor(w03);
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.d;
        rectF.set(0.0f, 0.0f, width, height);
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, paint);
        rectF.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, paint2);
        rectF.inset(AndroidUtilities.dpf2(4.67f), AndroidUtilities.dpf2(9.066f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.b);
    }
}
