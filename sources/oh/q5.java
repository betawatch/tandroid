package oh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ic;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class q5 extends FrameLayout {
    public final /* synthetic */ float a;
    public final /* synthetic */ r5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(r5 r5Var, Context context, float f10) {
        super(context);
        this.b = r5Var;
        this.a = f10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ic.a(this.b.container, new lh.t0(this, 4));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ic.h(this.b.container);
    }
}
