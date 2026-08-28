package ih;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.gc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class r5 extends FrameLayout {
    public final /* synthetic */ float a;
    public final /* synthetic */ s5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(s5 s5Var, Context context, float f10) {
        super(context);
        this.b = s5Var;
        this.a = f10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gc.a(this.b.container, new fh.y0(this, 4));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gc.h(this.b.container);
    }
}
