// default package

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ix3 extends rje {
    public final /* synthetic */ rje a;
    public final /* synthetic */ ThreadPoolExecutor b;

    public ix3(rje rjeVar, ThreadPoolExecutor threadPoolExecutor) {
        this.a = rjeVar;
        this.b = threadPoolExecutor;
    }

    @Override // rje
    public final void a(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.a(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // rje
    public final void b(u8a u8aVar) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.b(u8aVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
