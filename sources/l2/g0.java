package l2;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((h2.i0) this.b).d(runnable);
                break;
            case 1:
                ((Handler) this.b).post(runnable);
                break;
            case 2:
                h2.m0.W(((p4.d0) this.b).l, runnable);
                break;
            default:
                ((s4.b) this.b).post(runnable);
                break;
        }
    }
}
