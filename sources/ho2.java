// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ho2 implements vc7, sc7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ gk7 d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ho2(hd hdVar, d dVar, int i, long j, boolean z) {
        this.d = hdVar;
        this.e = dVar;
        this.a = i;
        this.b = j;
        this.c = z;
    }

    @Override // sc7
    public final void k(boolean z) {
        cj3 cj3Var = (cj3) this.d;
        TLRPC.Chat chat = (TLRPC.Chat) this.e;
        cj3Var.W3(this.a, this.b, chat, this.c, z);
    }

    @Override // vc7
    public final void run(long j) {
        hd hdVar = (hd) this.d;
        d dVar = (d) this.e;
        hdVar.dismiss();
        if (j == 0) {
            return;
        }
        na7.q1(this.a).T2(-j, this.b, false, this.c, new jy((Object) dVar, j, (byte) 1));
    }

    public /* synthetic */ ho2(cj3 cj3Var, int i, TLRPC.Chat chat, long j, boolean z) {
        this.d = cj3Var;
        this.a = i;
        this.e = chat;
        this.b = j;
        this.c = z;
    }
}
