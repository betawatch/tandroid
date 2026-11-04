package androidx.emoji2.text;

import b8.w0;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m extends w0 {
    public final /* synthetic */ w0 a;
    public final /* synthetic */ ThreadPoolExecutor b;

    public m(w0 w0Var, ThreadPoolExecutor threadPoolExecutor) {
        this.a = w0Var;
        this.b = threadPoolExecutor;
    }

    @Override // b8.w0
    public final void a(Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.a(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // b8.w0
    public final void b(ui.f fVar) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.b(fVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
