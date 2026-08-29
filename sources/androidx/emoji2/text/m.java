package androidx.emoji2.text;

import h7.e0;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class m extends e0 {
    public final /* synthetic */ e0 a;
    public final /* synthetic */ ThreadPoolExecutor b;

    public m(e0 e0Var, ThreadPoolExecutor threadPoolExecutor) {
        this.a = e0Var;
        this.b = threadPoolExecutor;
    }

    @Override // h7.e0
    public final void a(Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.a(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // h7.e0
    public final void b(com.google.firebase.messaging.s sVar) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.b(sVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
