package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;
import v7.y;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
