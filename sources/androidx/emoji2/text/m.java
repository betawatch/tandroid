package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class m extends v7.w {
    public final /* synthetic */ v7.w a;
    public final /* synthetic */ ThreadPoolExecutor b;

    public m(v7.w wVar, ThreadPoolExecutor threadPoolExecutor) {
        this.a = wVar;
        this.b = threadPoolExecutor;
    }

    @Override // v7.w
    public final void a(Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.a(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // v7.w
    public final void b(com.google.firebase.messaging.s sVar) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.b(sVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
