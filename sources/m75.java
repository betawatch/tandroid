// default package

import android.view.View;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class m75 extends View {
    public final /* synthetic */ j95 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m75(j95 j95Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = j95Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        if (getAlpha() != f) {
            super.setAlpha(f);
            this.a.J0();
        }
    }
}
