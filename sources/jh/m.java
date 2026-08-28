package jh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.e00;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class m extends e00 {
    public final Paint Q;
    public final /* synthetic */ q R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q qVar, Context context) {
        super(context, null);
        this.R = qVar;
        this.Q = new Paint();
    }

    @Override // org.telegram.ui.Components.e00
    public final int getColumnsCount() {
        return this.R.d;
    }

    @Override // org.telegram.ui.Components.e00
    public final int getViewType() {
        setIsSingleCell(false);
        return 27;
    }

    @Override // org.telegram.ui.Components.e00, android.view.View
    public final void onDraw(Canvas canvas) {
        int v02 = f6.v0(f6.d6, this.R.S.c);
        Paint paint = this.Q;
        paint.setColor(v02);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
