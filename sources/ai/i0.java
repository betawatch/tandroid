package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class i0 implements n0 {
    public final /* synthetic */ Utilities.Callback a;
    public final /* synthetic */ Runnable b;

    public i0(Utilities.Callback callback, Runnable runnable) {
        this.a = callback;
        this.b = runnable;
    }

    @Override // ai.n0
    public final void a(o0 o0Var) {
        AndroidUtilities.removeFromParent(o0Var);
        this.b.run();
    }

    @Override // ai.n0
    public final void f(String str) {
        this.a.run(str);
    }
}
