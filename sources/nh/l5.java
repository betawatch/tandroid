package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class l5 extends View {
    public final /* synthetic */ ja a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(ja jaVar, Context context) {
        super(context);
        this.a = jaVar;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        j5 j5Var = this.a.K0;
        if (j5Var != null) {
            j5Var.d(canvas);
        }
    }
}
