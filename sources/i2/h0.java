package i2;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((e2.i0) this.b).d(runnable);
                break;
            case 1:
                ((Handler) this.b).post(runnable);
                break;
            case 2:
                e2.n0.W(((m4.f0) this.b).l, runnable);
                break;
            default:
                ((p4.b) this.b).post(runnable);
                break;
        }
    }
}
