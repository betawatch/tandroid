package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l extends f7.w {
    public final /* synthetic */ f7.w a;
    public final /* synthetic */ ThreadPoolExecutor b;

    public l(f7.w wVar, ThreadPoolExecutor threadPoolExecutor) {
        this.a = wVar;
        this.b = threadPoolExecutor;
    }

    @Override // f7.w
    public final void a(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.a(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // f7.w
    public final void b(com.google.firebase.messaging.t tVar) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.b(tVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
