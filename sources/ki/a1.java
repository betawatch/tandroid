package ki;

import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
