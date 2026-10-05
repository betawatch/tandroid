package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class m extends v7.x {
    public final /* synthetic */ v7.x a;
    public final /* synthetic */ ThreadPoolExecutor b;

    public m(v7.x xVar, ThreadPoolExecutor threadPoolExecutor) {
        this.a = xVar;
        this.b = threadPoolExecutor;
    }

    @Override // v7.x
    public final void a(Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.a(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // v7.x
    public final void b(com.google.firebase.messaging.s sVar) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.b(sVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
