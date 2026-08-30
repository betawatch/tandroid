package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class m extends j7.s {
    public final /* synthetic */ j7.s a;
    public final /* synthetic */ ThreadPoolExecutor b;

    public m(j7.s sVar, ThreadPoolExecutor threadPoolExecutor) {
        this.a = sVar;
        this.b = threadPoolExecutor;
    }

    @Override // j7.s
    public final void a(Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.a(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // j7.s
    public final void b(com.google.firebase.messaging.r rVar) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.b(rVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
