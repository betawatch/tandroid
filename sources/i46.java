// default package

import android.content.Context;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class i46 extends LimitPreviewView {
    public final /* synthetic */ j46 q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i46(j46 j46Var, Context context, int i, int i2, int i3, float f, vnb vnbVar) {
        super(context, i, i2, i3, f, vnbVar);
        this.q0 = j46Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.q0.e.a2) {
            return;
        }
        super.invalidate();
    }
}
