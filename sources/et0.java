// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class et0 implements jm7 {
    public final /* synthetic */ long a;
    public final /* synthetic */ jm7[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ bt0 d;

    public et0(long j, jm7[] jm7VarArr, int i, bt0 bt0Var) {
        this.a = j;
        this.b = jm7VarArr;
        this.c = i;
        this.d = bt0Var;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        vh6 vh6Var;
        int i3 = nm7.w0;
        if (i != i3 || (vh6Var = (vh6) objArr[0]) == null) {
            return;
        }
        long j = this.a;
        if (vh6Var.d(j)) {
            TLRPC.WebPage webPage = (TLRPC.WebPage) vh6Var.f(j);
            jm7[] jm7VarArr = this.b;
            if (jm7VarArr[0] != null) {
                nm7.f(this.c).n(jm7VarArr[0], i3);
                jm7VarArr[0] = null;
            }
            if (!(webPage instanceof TLRPC.TL_webPage)) {
                webPage = null;
            }
            this.d.a(webPage);
        }
    }
}
