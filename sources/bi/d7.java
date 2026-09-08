package bi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
