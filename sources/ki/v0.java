package ki;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class v0 extends View implements org.telegram.ui.ActionBar.y5 {
    public final org.telegram.ui.ActionBar.d6 a;
    public final Paint b;
    public a c;

    public v0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.b = new Paint();
        this.a = d6Var;
        d();
    }

    @Override // org.telegram.ui.ActionBar.y5
    public final void d() {
        this.b.setColor(h6.w0(h6.Fk, this.a));
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
