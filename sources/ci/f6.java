package ci;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class f6 extends FrameLayout {
    public final /* synthetic */ float a;
    public final /* synthetic */ g6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(g6 g6Var, Context context, float f7) {
        super(context);
        this.b = g6Var;
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
