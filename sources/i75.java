// default package

import android.view.View;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class i75 extends View {
    public final /* synthetic */ g95 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i75(g95 g95Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = g95Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        if (getAlpha() != f) {
            super.setAlpha(f);
            this.a.I0();
        }
    }
}
