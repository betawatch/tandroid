package fi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.xb;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
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
        xb.a(this.b.c, new bi.e1(this, 4));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xb.h(this.b.c);
    }
}
