// default package

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
