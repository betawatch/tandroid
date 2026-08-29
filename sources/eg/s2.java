package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class s2 extends View {
    public final /* synthetic */ w2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(w2 w2Var, Context context) {
        super(context);
        this.a = w2Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawColor(this.a.getThemedColor(g6.e7));
    }
}
