package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class m extends v7.t {
    public final /* synthetic */ v7.t a;
    public final /* synthetic */ ThreadPoolExecutor b;

    public m(v7.t tVar, ThreadPoolExecutor threadPoolExecutor) {
        this.a = tVar;
        this.b = threadPoolExecutor;
    }

    @Override // v7.t
    public final void a(Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.a(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // v7.t
    public final void b(qi.e eVar) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.b(eVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
