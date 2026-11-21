package l2;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d0(Object obj, int i7) {
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
                h2.l0.W(((p4.e0) this.b).l, runnable);
                break;
            default:
                ((s4.b) this.b).post(runnable);
                break;
        }
    }
}
