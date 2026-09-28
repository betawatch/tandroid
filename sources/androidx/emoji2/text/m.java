package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;
import v7.y;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final class m extends y {
    public final /* synthetic */ y a;
    public final /* synthetic */ ThreadPoolExecutor b;

    public m(y yVar, ThreadPoolExecutor threadPoolExecutor) {
        this.a = yVar;
        this.b = threadPoolExecutor;
    }

    @Override // v7.y
    public final void a(Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.a(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // v7.y
    public final void b(com.google.firebase.messaging.t tVar) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.b(tVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
