package ai;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class w7 extends FrameLayout {
    public final /* synthetic */ float a;
    public final /* synthetic */ y7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(y7 y7Var, Context context, float f7) {
        super(context);
        this.b = y7Var;
        this.a = f7;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.tc.a(this.b.container, new x4(this, 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.tc.h(this.b.container);
    }
}
