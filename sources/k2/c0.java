package k2;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c0(Object obj, int i10) {
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
