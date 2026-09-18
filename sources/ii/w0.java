package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class w0 extends View implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 a;
    public final Paint b;
    public a c;

    public w0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.b = new Paint();
        this.a = f6Var;
        e();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void e() {
        this.b.setColor(j6.v0(j6.Fk, this.a));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, AndroidUtilities.dp(6.0f), getMeasuredWidth(), AndroidUtilities.dp(6.0f) + 1, this.b);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(6.0f) + 1);
    }
}
