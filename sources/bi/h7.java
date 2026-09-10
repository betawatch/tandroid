package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class h7 extends View {
    public final /* synthetic */ ad a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(ad adVar, Context context) {
        super(context);
        this.a = adVar;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        f7 f7Var = this.a.O0;
        if (f7Var != null) {
            f7Var.d(canvas);
        }
    }
}
