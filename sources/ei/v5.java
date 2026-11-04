package ei;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ac;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v5 extends FrameLayout {
    public final /* synthetic */ float a;
    public final /* synthetic */ w5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(w5 w5Var, Context context, float f10) {
        super(context);
        this.b = w5Var;
        this.a = f10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ac.a(this.b.c, new ai.h1(this, 4));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ac.h(this.b.c);
    }
}
