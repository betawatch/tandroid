package hi;

import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class b1 implements ls {
    public final /* synthetic */ long a;
    public final /* synthetic */ ls[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ z0 d;

    public b1(long j3, ls[] lsVarArr, int i7, z0 z0Var) {
        this.a = j3;
        this.b = lsVarArr;
        this.c = i7;
        this.d = z0Var;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        a0.h hVar;
        int i11 = qs.w0;
        if (i7 != i11 || (hVar = (a0.h) objArr[0]) == null) {
            return;
        }
        long j3 = this.a;
        if (hVar.d(j3)) {
            TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.f(j3);
            ls[] lsVarArr = this.b;
            if (lsVarArr[0] != null) {
                qs.f(this.c).n(lsVarArr[0], i11);
                lsVarArr[0] = null;
            }
            if (!(webPage instanceof TLRPC.TL_webPage)) {
                webPage = null;
            }
            this.d.a(webPage);
        }
    }
}
