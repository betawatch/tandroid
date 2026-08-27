package jh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ec;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class n5 extends FrameLayout {
    public final /* synthetic */ float a;
    public final /* synthetic */ o5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(o5 o5Var, Context context, float f10) {
        super(context);
        this.b = o5Var;
        this.a = f10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ec.a(this.b.container, new gh.w0(this, 4));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ec.h(this.b.container);
    }
}
