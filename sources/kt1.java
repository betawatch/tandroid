// default package

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kt1 extends UndoView {
    public final /* synthetic */ byte k0 = 1;
    public final /* synthetic */ Object l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt1(yv1 yv1Var, Activity activity, yv1 yv1Var2, ylb ylbVar) {
        super(activity, yv1Var2, true, ylbVar);
        this.l0 = yv1Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void b(CharacterStyle characterStyle) {
        switch (this.k0) {
            case 0:
                ((yv1) this.l0).m6(characterStyle, false, null, null);
                break;
        }
    }

    @Override // org.telegram.ui.Components.UndoView, android.view.View
    public final void invalidate() {
        switch (this.k0) {
            case 1:
                super.invalidate();
                ((c75) this.l0).invalidate();
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
                gs1 gs1Var = ((yv1) this.l0).m2;
                setAdditionalTranslationY((gs1Var == null || !(((i2 = gs1Var.U) == 1 || i2 == 3) && gs1Var.T)) ? 0.0f : gm.L(gs1Var.getStyleHeight()));
                super.k(j, i, obj, obj2, runnable, runnable2);
                break;
            default:
                super.k(j, i, obj, obj2, runnable, runnable2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt1(c75 c75Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.l0 = c75Var;
    }
}
