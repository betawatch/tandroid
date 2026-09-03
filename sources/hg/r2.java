package hg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        canvas.drawColor(this.a.getThemedColor(k6.e7));
    }
}
