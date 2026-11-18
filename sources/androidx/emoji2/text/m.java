package androidx.emoji2.text;

import a8.u6;
import ab.c0;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
