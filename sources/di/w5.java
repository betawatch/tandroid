package di;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.bc;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class w5 extends FrameLayout {
    public final /* synthetic */ float a;
    public final /* synthetic */ x5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(x5 x5Var, Context context, float f10) {
        super(context);
        this.b = x5Var;
        this.a = f10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bc.a(this.b.c, new ch.v(this, 3));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bc.h(this.b.c);
    }
}
