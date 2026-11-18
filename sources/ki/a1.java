package ki;

import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class a1 implements fs {
    public final /* synthetic */ long a;
    public final /* synthetic */ fs[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ y0 d;

    public a1(long j3, fs[] fsVarArr, int i7, y0 y0Var) {
        this.a = j3;
        this.b = fsVarArr;
        this.c = i7;
        this.d = y0Var;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        a0.h hVar;
        int i11 = ks.w0;
        if (i7 != i11 || (hVar = (a0.h) objArr[0]) == null) {
            return;
        }
        long j3 = this.a;
        if (hVar.d(j3)) {
            TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.f(j3);
            fs[] fsVarArr = this.b;
            if (fsVarArr[0] != null) {
                ks.f(this.c).n(fsVarArr[0], i11);
                fsVarArr[0] = null;
            }
            if (!(webPage instanceof TLRPC.TL_webPage)) {
                webPage = null;
            }
            this.d.a(webPage);
        }
    }
}
