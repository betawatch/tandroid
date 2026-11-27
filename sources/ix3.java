// default package

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
