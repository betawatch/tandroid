package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class w0 extends View implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 a;
    public final Paint b;
    public a c;

    public w0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.b = new Paint();
        this.a = e6Var;
        e();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void e() {
        this.b.setColor(i6.v0(i6.Fk, this.a));
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
