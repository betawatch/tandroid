package androidx.emoji2.text;

import a8.i1;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class m extends i1 {
    public final /* synthetic */ i1 a;
    public final /* synthetic */ ThreadPoolExecutor b;

    public m(i1 i1Var, ThreadPoolExecutor threadPoolExecutor) {
        this.a = i1Var;
        this.b = threadPoolExecutor;
    }

    @Override // a8.i1
    public final void a(Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.a(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // a8.i1
    public final void b(com.google.firebase.messaging.q qVar) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.b(qVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
