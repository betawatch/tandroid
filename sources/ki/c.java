package ki;

import android.os.Handler;
import java.io.File;
import java.util.HashMap;
import org.telegram.messenger.me;
import org.telegram.messenger.x0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;
    public final /* synthetic */ j c;

    public /* synthetic */ c(k kVar, j jVar, int i10) {
        this.a = 4;
        this.b = kVar;
        this.c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File file;
        switch (this.a) {
            case 0:
                k kVar = this.b;
                j jVar = this.c;
                kVar.g.V(jVar.a, jVar.b);
                return;
            case 1:
                k kVar2 = this.b;
                j jVar2 = this.c;
                m4.c cVar = kVar2.g;
                long j10 = jVar2.a;
                cVar.getClass();
                return;
            case 2:
                k kVar3 = this.b;
                j jVar3 = this.c;
                kVar3.g.V(jVar3.a, jVar3.b);
                return;
            case 3:
                k kVar4 = this.b;
                j jVar4 = this.c;
                m4.c cVar2 = kVar4.g;
                long j11 = jVar4.a;
                cVar2.getClass();
                return;
            default:
                k kVar5 = this.b;
                j jVar5 = this.c;
                m4.c cVar3 = kVar5.g;
                long j12 = jVar5.a;
                synchronized (((e0.h) cVar3.c).f) {
                    file = (File) ((HashMap) ((e0.h) cVar3.c).g).remove(Long.valueOf(j12));
                }
                if (file != null) {
                    ((Handler) ((e0.h) cVar3.c).d).post(new x0(cVar3, j12, (me) cVar3.b, file, 0));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ c(k kVar, j jVar, long j10, long j11, int i10) {
        this.a = i10;
        this.b = kVar;
        this.c = jVar;
    }

    public /* synthetic */ c(k kVar, j jVar, Exception exc) {
        this.a = 3;
        this.b = kVar;
        this.c = jVar;
    }
}
