package li;

import org.telegram.messenger.gs;
import org.telegram.messenger.mr;
import org.telegram.messenger.np;
import org.telegram.messenger.pr;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.cx;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class f0 implements pr, mr {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ gs d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f0(t1 t1Var, g2 g2Var, int i7, long j3, boolean z10) {
        this.d = t1Var;
        this.e = g2Var;
        this.a = i7;
        this.b = j3;
        this.c = z10;
    }

    @Override // org.telegram.messenger.mr
    public void d(boolean z10) {
        cx cxVar = (cx) this.d;
        TLRPC.Chat chat = (TLRPC.Chat) this.e;
        cx.j0(this.a, this.b, chat, cxVar, this.c, z10);
    }

    @Override // org.telegram.messenger.pr
    public void run(long j3) {
        t1 t1Var = (t1) this.d;
        g2 g2Var = (g2) this.e;
        t1Var.dismiss();
        if (j3 == 0) {
            return;
        }
        np.u1(this.a).W2(-j3, this.b, false, this.c, new bi.n(g2Var, j3, 1));
    }

    public /* synthetic */ f0(cx cxVar, int i7, TLRPC.Chat chat, long j3, boolean z10) {
        this.d = cxVar;
        this.a = i7;
        this.e = chat;
        this.b = j3;
        this.c = z10;
    }
}
