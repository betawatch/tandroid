package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.jf0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v(int i7, int i10, long j3, Object obj, Object obj2) {
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
                org.telegram.messenger.g0.h3(new bi.e0((e0) this.d, (d0) this.e, this.b, tLObject, this.c, 1));
                break;
            case 1:
                hi.d dVar = (hi.d) this.d;
                org.telegram.ui.ActionBar.u2[] u2VarArr = (org.telegram.ui.ActionBar.u2[]) this.e;
                org.telegram.messenger.g0.h3(new x7(this.b, 1, this.c, dVar, u2VarArr));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new bi.e0((fi.s6) this.d, tLObject, this.b, (String) this.e, this.c, 3));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new v7(tLObject, this.b, (hi.d) this.d, (org.telegram.ui.ActionBar.u2) this.e, this.c, tL_error));
                break;
            default:
                org.telegram.messenger.g0.h3(new v7((jf0) this.d, tL_error, tLObject, this.c, this.b, (TLRPC.Chat) this.e));
                break;
        }
    }

    public /* synthetic */ v(int i7, hi.d dVar, org.telegram.ui.ActionBar.u2 u2Var, long j3) {
        this.a = 3;
        this.b = i7;
        this.d = dVar;
        this.e = u2Var;
        this.c = j3;
    }

    public /* synthetic */ v(fi.s6 s6Var, int i7, String str, long j3) {
        this.a = 2;
        this.d = s6Var;
        this.b = i7;
        this.e = str;
        this.c = j3;
    }

    public /* synthetic */ v(jf0 jf0Var, long j3, int i7, TLRPC.Chat chat) {
        this.a = 4;
        this.d = jf0Var;
        this.c = j3;
        this.b = i7;
        this.e = chat;
    }
}
