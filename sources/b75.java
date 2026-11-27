// default package

import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class b75 extends UndoView {
    public final /* synthetic */ j95 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b75(j95 j95Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.k0 = j95Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j, int i, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.k0.t2 != null) {
            return;
        }
        super.k(j, i, obj, obj2, runnable, runnable2);
    }
}
