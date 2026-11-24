// default package

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class o22 extends FragmentContextView {
    public final /* synthetic */ FrameLayout X0;
    public final /* synthetic */ s22 Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o22(s22 s22Var, Context context, d dVar, FrameLayout frameLayout, ylb ylbVar, FrameLayout frameLayout2) {
        super(context, dVar, frameLayout, false, ylbVar);
        this.Y0 = s22Var;
        this.X0 = frameLayout2;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i) {
        this.Y0.y.j(this.X0, i == 0, true);
    }
}
