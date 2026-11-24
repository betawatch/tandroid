// default package

import android.content.Context;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class e26 extends LimitPreviewView {
    public final /* synthetic */ f26 q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e26(f26 f26Var, Context context, int i, int i2, int i3, float f, wjb wjbVar) {
        super(context, i, i2, i3, f, wjbVar);
        this.q0 = f26Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.q0.e.a2) {
            return;
        }
        super.invalidate();
    }
}
