package k2;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b0(Object obj, int i10) {
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
                e2.d0.U(((m4.b0) this.b).l, runnable);
                break;
            default:
                ((p4.b) this.b).post(runnable);
                break;
        }
    }
}
