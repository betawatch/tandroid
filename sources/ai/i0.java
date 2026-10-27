package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
