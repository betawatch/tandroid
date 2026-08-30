package gg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class r2 extends View {
    public final /* synthetic */ v2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(v2 v2Var, Context context) {
        super(context);
        this.a = v2Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawColor(this.a.getThemedColor(j6.e7));
    }
}
