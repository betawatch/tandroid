package bi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final class d7 extends FrameLayout {
    public final /* synthetic */ float a;
    public final /* synthetic */ f7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(f7 f7Var, Context context, float f7) {
        super(context);
        this.b = f7Var;
        this.a = f7;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qc.a(this.b.container, new ah.n0(this, 3));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc.h(this.b.container);
    }
}
