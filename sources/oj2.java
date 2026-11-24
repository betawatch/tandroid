// default package

import android.app.Activity;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class oj2 extends LinearLayout {
    public final /* synthetic */ rj2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj2(rj2 rj2Var, Activity activity) {
        super(activity);
        this.a = rj2Var;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.a.D0();
    }
}
