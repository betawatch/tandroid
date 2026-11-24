// default package

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class nw3 extends afe {
    public final /* synthetic */ afe a;
    public final /* synthetic */ ThreadPoolExecutor b;

    public nw3(afe afeVar, ThreadPoolExecutor threadPoolExecutor) {
        this.a = afeVar;
        this.b = threadPoolExecutor;
    }

    @Override // afe
    public final void a(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.a(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // afe
    public final void b(wtc wtcVar) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.b(wtcVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
