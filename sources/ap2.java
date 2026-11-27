// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ap2 implements ef7, bf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ fn7 d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ap2(id idVar, e eVar, int i, long j, boolean z) {
        this.d = idVar;
        this.e = eVar;
        this.a = i;
        this.b = j;
        this.c = z;
    }

    @Override // bf7
    public final void A(boolean z) {
        uj3 uj3Var = (uj3) this.d;
        TLRPC.Chat chat = (TLRPC.Chat) this.e;
        uj3Var.Z3(this.a, this.b, chat, this.c, z);
    }

    @Override // ef7
    public final void run(long j) {
        id idVar = (id) this.d;
        e eVar = (e) this.e;
        idVar.dismiss();
        if (j == 0) {
            return;
        }
        uc7.s1(this.a).Z2(-j, this.b, false, this.c, new ky((Object) eVar, j, (byte) 1));
    }

    public /* synthetic */ ap2(uj3 uj3Var, int i, TLRPC.Chat chat, long j, boolean z) {
        this.d = uj3Var;
        this.a = i;
        this.e = chat;
        this.b = j;
        this.c = z;
    }
}
