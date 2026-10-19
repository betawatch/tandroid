package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
