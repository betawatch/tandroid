package bi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.sc;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class h7 extends FrameLayout {
    public final /* synthetic */ float a;
    public final /* synthetic */ j7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(j7 j7Var, Context context, float f7) {
        super(context);
        this.b = j7Var;
        this.a = f7;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        sc.a(this.b.container, new ah.m0(this, 3));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        sc.h(this.b.container);
    }
}
