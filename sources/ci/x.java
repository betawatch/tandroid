package ci;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.df0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x(int i3, int i10, long j10, Object obj, Object obj2) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = i3;
        this.c = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new ai.k0((i0) this.d, (h0) this.e, this.b, tLObject, this.c, 1));
                break;
            case 1:
                gi.d dVar = (gi.d) this.d;
                org.telegram.ui.ActionBar.t2[] t2VarArr = (org.telegram.ui.ActionBar.t2[]) this.e;
                org.telegram.messenger.g0.h3(new f8(this.b, 1, this.c, dVar, t2VarArr));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new ai.k0((ei.z6) this.d, tLObject, this.b, (String) this.e, this.c, 3));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new d8(tLObject, this.b, (gi.d) this.d, (org.telegram.ui.ActionBar.t2) this.e, this.c, tL_error));
                break;
            default:
                org.telegram.messenger.g0.h3(new d8((df0) this.d, tL_error, tLObject, this.c, this.b, (TLRPC.Chat) this.e));
                break;
        }
    }

    public /* synthetic */ x(int i3, gi.d dVar, org.telegram.ui.ActionBar.t2 t2Var, long j10) {
        this.a = 3;
        this.b = i3;
        this.d = dVar;
        this.e = t2Var;
        this.c = j10;
    }

    public /* synthetic */ x(ei.z6 z6Var, int i3, String str, long j10) {
        this.a = 2;
        this.d = z6Var;
        this.b = i3;
        this.e = str;
        this.c = j10;
    }

    public /* synthetic */ x(df0 df0Var, long j10, int i3, TLRPC.Chat chat) {
        this.a = 4;
        this.d = df0Var;
        this.c = j10;
        this.b = i3;
        this.e = chat;
    }
}
