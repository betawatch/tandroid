package androidx.emoji2.text;

import a8.t6;
import ab.b0;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class m extends t6 {
    public final /* synthetic */ t6 a;
    public final /* synthetic */ ThreadPoolExecutor b;

    public m(t6 t6Var, ThreadPoolExecutor threadPoolExecutor) {
        this.a = t6Var;
        this.b = threadPoolExecutor;
    }

    @Override // a8.t6
    public final void a(Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.a(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // a8.t6
    public final void b(b0 b0Var) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.b(b0Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
