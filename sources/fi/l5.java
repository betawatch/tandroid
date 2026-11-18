package fi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.gc;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class l5 extends FrameLayout {
    public final /* synthetic */ float a;
    public final /* synthetic */ m5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(m5 m5Var, Context context, float f10) {
        super(context);
        this.b = m5Var;
        this.a = f10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gc.a(this.b.c, new bi.e1(this, 4));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gc.h(this.b.c);
    }
}
