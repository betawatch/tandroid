// default package

import android.app.Activity;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class oi5 extends ActionBarLayout {
    public final /* synthetic */ l0 z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi5(Activity activity, l0 l0Var) {
        super(activity, false);
        this.z1 = l0Var;
    }

    @Override // org.telegram.ui.ActionBar.ActionBarLayout, ui5
    public final fx0 getBottomSheet() {
        return ((fx0[]) this.z1.b)[0];
    }
}
