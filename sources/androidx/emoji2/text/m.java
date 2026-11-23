package androidx.emoji2.text;

import a8.v6;
import ab.c0;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class m extends v6 {
    public final /* synthetic */ v6 a;
    public final /* synthetic */ ThreadPoolExecutor b;

    public m(v6 v6Var, ThreadPoolExecutor threadPoolExecutor) {
        this.a = v6Var;
        this.b = threadPoolExecutor;
    }

    @Override // a8.v6
    public final void a(Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.a(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // a8.v6
    public final void b(c0 c0Var) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.b(c0Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
