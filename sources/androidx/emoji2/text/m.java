package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class m extends j7.t {
    public final /* synthetic */ j7.t a;
    public final /* synthetic */ ThreadPoolExecutor b;

    public m(j7.t tVar, ThreadPoolExecutor threadPoolExecutor) {
        this.a = tVar;
        this.b = threadPoolExecutor;
    }

    @Override // j7.t
    public final void a(Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.a(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // j7.t
    public final void b(com.google.firebase.messaging.s sVar) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.b(sVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
