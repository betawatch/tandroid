package li;

import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.nr;
import org.telegram.messenger.qr;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class f0 implements qr, nr {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ is d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f0(t1 t1Var, e2 e2Var, int i7, long j3, boolean z10) {
        this.d = t1Var;
        this.e = e2Var;
        this.a = i7;
        this.b = j3;
        this.c = z10;
    }

    @Override // org.telegram.messenger.nr
    public void j(boolean z10) {
        yw ywVar = (yw) this.d;
        TLRPC.Chat chat = (TLRPC.Chat) this.e;
        yw.x0(this.a, this.b, chat, ywVar, this.c, z10);
    }

    @Override // org.telegram.messenger.qr
    public void run(long j3) {
        t1 t1Var = (t1) this.d;
        e2 e2Var = (e2) this.e;
        t1Var.dismiss();
        if (j3 == 0) {
            return;
        }
        np.s1(this.a).Q2(-j3, this.b, false, this.c, new bi.n(e2Var, j3, 1));
    }

    public /* synthetic */ f0(yw ywVar, int i7, TLRPC.Chat chat, long j3, boolean z10) {
        this.d = ywVar;
        this.a = i7;
        this.e = chat;
        this.b = j3;
        this.c = z10;
    }
}
