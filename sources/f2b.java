// default package

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class f2b extends FrameLayout {
    public final /* synthetic */ float a;
    public final /* synthetic */ g2b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2b(g2b g2bVar, Context context, float f) {
        super(context);
        this.b = g2bVar;
        this.a = f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v21.a(this.b.c, new t10(this, (byte) 19));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v21.h(this.b.c);
    }
}
