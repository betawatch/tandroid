package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class w5 extends View {
    public final /* synthetic */ ta a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(ta taVar, Context context) {
        super(context);
        this.a = taVar;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        u5 u5Var = this.a.D0;
        if (u5Var != null) {
            u5Var.d(canvas);
        }
    }
}
