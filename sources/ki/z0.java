package ki;

import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class z0 implements gs {
    public final /* synthetic */ long a;
    public final /* synthetic */ gs[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ x0 d;

    public z0(long j3, gs[] gsVarArr, int i7, x0 x0Var) {
        this.a = j3;
        this.b = gsVarArr;
        this.c = i7;
        this.d = x0Var;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        a0.h hVar;
        int i11 = ls.w0;
        if (i7 != i11 || (hVar = (a0.h) objArr[0]) == null) {
            return;
        }
        long j3 = this.a;
        if (hVar.d(j3)) {
            TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.f(j3);
            gs[] gsVarArr = this.b;
            if (gsVarArr[0] != null) {
                ls.f(this.c).n(gsVarArr[0], i11);
                gsVarArr[0] = null;
            }
            if (!(webPage instanceof TLRPC.TL_webPage)) {
                webPage = null;
            }
            this.d.a(webPage);
        }
    }
}
