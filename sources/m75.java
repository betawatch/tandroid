// default package

import android.view.View;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
