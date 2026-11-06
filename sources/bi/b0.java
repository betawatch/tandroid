package bi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.jf0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b0(int i7, int i10, long j3, Object obj, Object obj2) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = i7;
        this.c = j3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new d0((n0) this.d, (m0) this.e, this.b, tLObject, this.c, 0));
                break;
            case 1:
                fi.d dVar = (fi.d) this.d;
                org.telegram.ui.ActionBar.v2[] v2VarArr = (org.telegram.ui.ActionBar.v2[]) this.e;
                org.telegram.messenger.g0.h3(new f9(this.b, 1, this.c, dVar, v2VarArr));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new d0((di.y6) this.d, tLObject, this.b, (String) this.e, this.c));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new d9(tLObject, this.b, (fi.d) this.d, (org.telegram.ui.ActionBar.v2) this.e, this.c, tL_error));
                break;
            default:
                org.telegram.messenger.g0.h3(new d9((jf0) this.d, tL_error, tLObject, this.c, this.b, (TLRPC.Chat) this.e));
                break;
        }
    }

    public /* synthetic */ b0(int i7, fi.d dVar, org.telegram.ui.ActionBar.v2 v2Var, long j3) {
        this.a = 3;
        this.b = i7;
        this.d = dVar;
        this.e = v2Var;
        this.c = j3;
    }

    public /* synthetic */ b0(di.y6 y6Var, int i7, String str, long j3) {
        this.a = 2;
        this.d = y6Var;
        this.b = i7;
        this.e = str;
        this.c = j3;
    }

    public /* synthetic */ b0(jf0 jf0Var, long j3, int i7, TLRPC.Chat chat) {
        this.a = 4;
        this.d = jf0Var;
        this.c = j3;
        this.b = i7;
        this.e = chat;
    }
}
