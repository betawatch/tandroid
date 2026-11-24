// default package

import android.content.Context;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class f46 extends LimitPreviewView {
    public final /* synthetic */ g46 q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f46(g46 g46Var, Context context, int i, int i2, int i3, float f, ylb ylbVar) {
        super(context, i, i2, i3, f, ylbVar);
        this.q0 = g46Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.q0.e.a2) {
            return;
        }
        super.invalidate();
    }
}
