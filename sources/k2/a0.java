package k2;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((Handler) this.b).post(runnable);
                break;
            case 1:
                e2.d0.U(((m4.a0) this.b).l, runnable);
                break;
            default:
                ((p4.b) this.b).post(runnable);
                break;
        }
    }
}
