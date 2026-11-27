// default package

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ls1 extends UndoView {
    public final /* synthetic */ byte k0 = 1;
    public final /* synthetic */ Object l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls1(zu1 zu1Var, Activity activity, zu1 zu1Var2, vnb vnbVar) {
        super(activity, zu1Var2, true, vnbVar);
        this.l0 = zu1Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void b(CharacterStyle characterStyle) {
        switch (this.k0) {
            case 0:
                ((zu1) this.l0).m6(characterStyle, false, null, null);
                break;
        }
    }

    @Override // org.telegram.ui.Components.UndoView, android.view.View
    public final void invalidate() {
        switch (this.k0) {
            case 1:
                super.invalidate();
                ((g75) this.l0).invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j, int i, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        int i2;
        switch (this.k0) {
            case 0:
                hr1 hr1Var = ((zu1) this.l0).m2;
                setAdditionalTranslationY((hr1Var == null || !(((i2 = hr1Var.U) == 1 || i2 == 3) && hr1Var.T)) ? 0.0f : hl.L(hr1Var.getStyleHeight()));
                super.k(j, i, obj, obj2, runnable, runnable2);
                break;
            default:
                super.k(j, i, obj, obj2, runnable, runnable2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls1(g75 g75Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.l0 = g75Var;
    }
}
