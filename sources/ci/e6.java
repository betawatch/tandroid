package ci;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class e6 extends FrameLayout {
    public final /* synthetic */ float a;
    public final /* synthetic */ f6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(f6 f6Var, Context context, float f7) {
        super(context);
        this.b = f6Var;
        this.a = f7;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qc.a(this.b.container, new ah.m0(this, 3));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc.h(this.b.container);
    }
}
