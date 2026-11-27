// default package

import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
