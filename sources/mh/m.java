package mh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.p00;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class m extends p00 {
    public final Paint Q;
    public final /* synthetic */ r R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r rVar, Context context) {
        super(context, null);
        this.R = rVar;
        this.Q = new Paint();
    }

    @Override // org.telegram.ui.Components.p00
    public final int getColumnsCount() {
        return this.R.d;
    }

    @Override // org.telegram.ui.Components.p00
    public final int getViewType() {
        setIsSingleCell(false);
        return 27;
    }

    @Override // org.telegram.ui.Components.p00, android.view.View
    public final void onDraw(Canvas canvas) {
        int v02 = g6.v0(g6.d6, this.R.S.c);
        Paint paint = this.Q;
        paint.setColor(v02);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
