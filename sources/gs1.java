// default package

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gs1 extends FragmentContextView {
    public final /* synthetic */ byte X0;
    public final /* synthetic */ yv1 Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs1(yv1 yv1Var, Context context, yv1 yv1Var2, ylb ylbVar, byte b) {
        super(context, yv1Var2, null, true, ylbVar);
        this.X0 = b;
        switch (b) {
            case 1:
                this.Y0 = yv1Var;
                super(context, yv1Var2, null, false, ylbVar);
                break;
            default:
                this.Y0 = yv1Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i) {
        byte b = this.X0;
        yv1 yv1Var = this.Y0;
        switch (b) {
            case 0:
                yv1Var.b1.j(yv1Var.p2, i == 0, true);
                break;
            default:
                yv1Var.b1.j(yv1Var.n2, i == 0, true);
                break;
        }
    }
}
