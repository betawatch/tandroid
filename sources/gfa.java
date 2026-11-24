// default package

import android.content.Context;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gfa extends FragmentContextView {
    public final /* synthetic */ nha X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfa(nha nhaVar, Context context, d dVar, nha nhaVar2, ylb ylbVar) {
        super(context, dVar, nhaVar2, false, ylbVar);
        this.X0 = nhaVar;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i) {
        nha nhaVar = this.X0;
        nhaVar.S0.j(nhaVar.T0, i == 0, true);
    }
}
