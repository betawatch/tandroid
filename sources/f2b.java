// default package

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
