package androidx.emoji2.text;

import a8.i1;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
