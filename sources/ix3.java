// default package

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
