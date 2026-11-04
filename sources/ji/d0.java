package ji;

import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.ir;
import org.telegram.messenger.lr;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.uw;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements lr, ir {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ cs d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d0(s1 s1Var, d2 d2Var, int i3, long j10, boolean z10) {
        this.d = s1Var;
        this.e = d2Var;
        this.a = i3;
        this.b = j10;
        this.c = z10;
    }

    @Override // org.telegram.messenger.ir
    public void o(boolean z10) {
        uw uwVar = (uw) this.d;
        TLRPC.Chat chat = (TLRPC.Chat) this.e;
        uw.x0(this.a, this.b, chat, uwVar, this.c, z10);
    }

    @Override // org.telegram.messenger.lr
    public void run(long j10) {
        s1 s1Var = (s1) this.d;
        d2 d2Var = (d2) this.e;
        s1Var.dismiss();
        if (j10 == 0) {
            return;
        }
        hp.s1(this.a).Q2(-j10, this.b, false, this.c, new ai.r(d2Var, j10, 1));
    }

    public /* synthetic */ d0(uw uwVar, int i3, TLRPC.Chat chat, long j10, boolean z10) {
        this.d = uwVar;
        this.a = i3;
        this.e = chat;
        this.b = j10;
        this.c = z10;
    }
}
