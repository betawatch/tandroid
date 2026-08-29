package lh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.mc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class p5 extends FrameLayout {
    public final /* synthetic */ float a;
    public final /* synthetic */ q5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(q5 q5Var, Context context, float f9) {
        super(context);
        this.b = q5Var;
        this.a = f9;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mc.a(this.b.container, new ih.u0(this, 4));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mc.h(this.b.container);
    }
}
