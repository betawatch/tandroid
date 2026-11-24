// default package

import android.view.View;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class k55 extends View {
    public final /* synthetic */ h75 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k55(h75 h75Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = h75Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        if (getAlpha() != f) {
            super.setAlpha(f);
            this.a.I0();
        }
    }
}
