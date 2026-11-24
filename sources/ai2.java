// default package

import android.app.Activity;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ai2 extends LinearLayout {
    public final /* synthetic */ di2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai2(di2 di2Var, Activity activity) {
        super(activity);
        this.a = di2Var;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.a.D0();
    }
}
