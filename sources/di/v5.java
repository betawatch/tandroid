package di;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
        cc.a(this.b.c, new ch.v(this, 3));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cc.h(this.b.c);
    }
}
