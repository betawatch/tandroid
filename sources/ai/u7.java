package ai;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class u7 extends FrameLayout {
    public final /* synthetic */ float a;
    public final /* synthetic */ w7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(w7 w7Var, Context context, float f7) {
        super(context);
        this.b = w7Var;
        this.a = f7;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.oc.a(this.b.container, new w4(this, 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.oc.h(this.b.container);
    }
}
