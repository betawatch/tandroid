// default package

import android.view.View;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
