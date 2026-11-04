package ii;

import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c1 implements cs {
    public final /* synthetic */ long a;
    public final /* synthetic */ cs[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ a1 d;

    public c1(long j10, cs[] csVarArr, int i3, a1 a1Var) {
        this.a = j10;
        this.b = csVarArr;
        this.c = i3;
        this.d = a1Var;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        a0.h hVar;
        int i11 = hs.w0;
        if (i3 != i11 || (hVar = (a0.h) objArr[0]) == null) {
            return;
        }
        long j10 = this.a;
        if (hVar.d(j10)) {
            TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.f(j10);
            cs[] csVarArr = this.b;
            if (csVarArr[0] != null) {
                hs.f(this.c).n(csVarArr[0], i11);
                csVarArr[0] = null;
            }
            if (!(webPage instanceof TLRPC.TL_webPage)) {
                webPage = null;
            }
            this.d.a(webPage);
        }
    }
}
