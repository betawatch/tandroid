package bg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c3 extends View {
    public final /* synthetic */ g3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(g3 g3Var, Context context) {
        super(context);
        this.a = g3Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawColor(this.a.getThemedColor(f6.e7));
    }
}
