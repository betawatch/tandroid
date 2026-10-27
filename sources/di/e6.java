package di;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        qc.a(this.b.container, new bh.c0(this, 3));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc.h(this.b.container);
    }
}
