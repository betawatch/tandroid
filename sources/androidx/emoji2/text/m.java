package androidx.emoji2.text;

import a8.u6;
import ab.c0;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class m extends u6 {
    public final /* synthetic */ u6 a;
    public final /* synthetic */ ThreadPoolExecutor b;

    public m(u6 u6Var, ThreadPoolExecutor threadPoolExecutor) {
        this.a = u6Var;
        this.b = threadPoolExecutor;
    }

    @Override // a8.u6
    public final void a(Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.a(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // a8.u6
    public final void b(c0 c0Var) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.b(c0Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
