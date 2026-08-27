package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class x5 extends View {
    public final /* synthetic */ va a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(va vaVar, Context context) {
        super(context);
        this.a = vaVar;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        v5 v5Var = this.a.K0;
        if (v5Var != null) {
            v5Var.d(canvas);
        }
    }
}
