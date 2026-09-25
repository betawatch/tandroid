package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class w0 extends View implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.d6 a;
    public final Paint b;
    public a c;

    public w0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.b = new Paint();
        this.a = d6Var;
        e();
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void e() {
        this.b.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Fk, this.a));
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
