package ai;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class v7 extends FrameLayout {
    public final /* synthetic */ float a;
    public final /* synthetic */ x7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(x7 x7Var, Context context, float f7) {
        super(context);
        this.b = x7Var;
        this.a = f7;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.qc.a(this.b.container, new w4(this, 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.qc.h(this.b.container);
    }
}
