package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
