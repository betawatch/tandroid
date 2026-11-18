package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nf0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                org.telegram.messenger.g0.g3(new bi.e0((e0) this.d, (d0) this.e, this.b, tLObject, this.c, 3));
                break;
            case 1:
                hi.d dVar = (hi.d) this.d;
                org.telegram.ui.ActionBar.x2[] x2VarArr = (org.telegram.ui.ActionBar.x2[]) this.e;
                org.telegram.messenger.g0.g3(new bi.q3(this.b, 2, this.c, dVar, x2VarArr));
                break;
            case 2:
                org.telegram.messenger.g0.g3(new bi.e0((fi.p6) this.d, tLObject, this.b, (String) this.e, this.c, 5));
                break;
            case 3:
                org.telegram.messenger.g0.g3(new bi.l4(tLObject, this.b, (hi.d) this.d, (org.telegram.ui.ActionBar.x2) this.e, this.c, tL_error));
                break;
            default:
                org.telegram.messenger.g0.g3(new bi.l4((nf0) this.d, tL_error, tLObject, this.c, this.b, (TLRPC.Chat) this.e, 7));
                break;
        }
    }

    public /* synthetic */ v(int i7, hi.d dVar, org.telegram.ui.ActionBar.x2 x2Var, long j3) {
        this.a = 3;
        this.b = i7;
        this.d = dVar;
        this.e = x2Var;
        this.c = j3;
    }

    public /* synthetic */ v(fi.p6 p6Var, int i7, String str, long j3) {
        this.a = 2;
        this.d = p6Var;
        this.b = i7;
        this.e = str;
        this.c = j3;
    }

    public /* synthetic */ v(nf0 nf0Var, long j3, int i7, TLRPC.Chat chat) {
        this.a = 4;
        this.d = nf0Var;
        this.c = j3;
        this.b = i7;
        this.e = chat;
    }
}
