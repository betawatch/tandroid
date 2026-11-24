// default package

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class d12 extends FragmentContextView {
    public final /* synthetic */ FrameLayout X0;
    public final /* synthetic */ h12 Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d12(h12 h12Var, Context context, d dVar, FrameLayout frameLayout, wjb wjbVar, FrameLayout frameLayout2) {
        super(context, dVar, frameLayout, false, wjbVar);
        this.Y0 = h12Var;
        this.X0 = frameLayout2;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i) {
        this.Y0.y.j(this.X0, i == 0, true);
    }
}
