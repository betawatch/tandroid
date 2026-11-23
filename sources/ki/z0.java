package ki;

import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class z0 implements fs {
    public final /* synthetic */ long a;
    public final /* synthetic */ fs[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ x0 d;

    public z0(long j3, fs[] fsVarArr, int i7, x0 x0Var) {
        this.a = j3;
        this.b = fsVarArr;
        this.c = i7;
        this.d = x0Var;
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
