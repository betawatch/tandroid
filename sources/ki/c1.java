package ki;

import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class c1 implements is {
    public final /* synthetic */ long a;
    public final /* synthetic */ is[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ a1 d;

    public c1(long j3, is[] isVarArr, int i7, a1 a1Var) {
        this.a = j3;
        this.b = isVarArr;
        this.c = i7;
        this.d = a1Var;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        a0.h hVar;
        int i11 = ns.w0;
        if (i7 != i11 || (hVar = (a0.h) objArr[0]) == null) {
            return;
        }
        long j3 = this.a;
        if (hVar.d(j3)) {
            TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.f(j3);
            is[] isVarArr = this.b;
            if (isVarArr[0] != null) {
                ns.f(this.c).n(isVarArr[0], i11);
                isVarArr[0] = null;
            }
            if (!(webPage instanceof TLRPC.TL_webPage)) {
                webPage = null;
            }
            this.d.a(webPage);
        }
    }
}
