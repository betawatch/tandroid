package li;

import org.telegram.messenger.fs;
import org.telegram.messenger.lr;
import org.telegram.messenger.mp;
import org.telegram.messenger.or;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.bx;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class e0 implements or, lr {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ fs d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e0(t1 t1Var, g2 g2Var, int i7, long j3, boolean z10) {
        this.d = t1Var;
        this.e = g2Var;
        this.a = i7;
        this.b = j3;
        this.c = z10;
    }

    @Override // org.telegram.messenger.lr
    public void q(boolean z10) {
        bx bxVar = (bx) this.d;
        TLRPC.Chat chat = (TLRPC.Chat) this.e;
        bx.j0(this.a, this.b, chat, bxVar, this.c, z10);
    }

    @Override // org.telegram.messenger.or
    public void run(long j3) {
        t1 t1Var = (t1) this.d;
        g2 g2Var = (g2) this.e;
        t1Var.dismiss();
        if (j3 == 0) {
            return;
        }
        mp.u1(this.a).W2(-j3, this.b, false, this.c, new bi.n(g2Var, j3, 1));
    }

    public /* synthetic */ e0(bx bxVar, int i7, TLRPC.Chat chat, long j3, boolean z10) {
        this.d = bxVar;
        this.a = i7;
        this.e = chat;
        this.b = j3;
        this.c = z10;
    }
}
