package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
    public final void b(com.google.firebase.messaging.t tVar) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.b(tVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
