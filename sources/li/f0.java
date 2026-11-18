package li;

import org.telegram.messenger.fs;
import org.telegram.messenger.lr;
import org.telegram.messenger.mp;
import org.telegram.messenger.or;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.cx;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class f0 implements or, lr {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ fs d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f0(u1 u1Var, h2 h2Var, int i7, long j3, boolean z10) {
        this.d = u1Var;
        this.e = h2Var;
        this.a = i7;
        this.b = j3;
        this.c = z10;
    }

    @Override // org.telegram.messenger.lr
    public void d(boolean z10) {
        cx cxVar = (cx) this.d;
        TLRPC.Chat chat = (TLRPC.Chat) this.e;
        cx.j0(this.a, this.b, chat, cxVar, this.c, z10);
    }

    @Override // org.telegram.messenger.or
    public void run(long j3) {
        u1 u1Var = (u1) this.d;
        h2 h2Var = (h2) this.e;
        u1Var.dismiss();
        if (j3 == 0) {
            return;
        }
        mp.u1(this.a).W2(-j3, this.b, false, this.c, new bi.n(h2Var, j3, 1));
    }

    public /* synthetic */ f0(cx cxVar, int i7, TLRPC.Chat chat, long j3, boolean z10) {
        this.d = cxVar;
        this.a = i7;
        this.e = chat;
        this.b = j3;
        this.c = z10;
    }
}
