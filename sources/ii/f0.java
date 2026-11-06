package ii;

import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qr;
import org.telegram.messenger.tr;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ww;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f0 implements tr, qr {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ls d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f0(u1 u1Var, f2 f2Var, int i7, long j3, boolean z9) {
        this.d = u1Var;
        this.e = f2Var;
        this.a = i7;
        this.b = j3;
        this.c = z9;
    }

    @Override // org.telegram.messenger.qr
    public void k(boolean z9) {
        ww wwVar = (ww) this.d;
        TLRPC.Chat chat = (TLRPC.Chat) this.e;
        ww.x0(this.a, this.b, chat, wwVar, this.c, z9);
    }

    @Override // org.telegram.messenger.tr
    public void run(long j3) {
        u1 u1Var = (u1) this.d;
        f2 f2Var = (f2) this.e;
        u1Var.dismiss();
        if (j3 == 0) {
            return;
        }
        qp.s1(this.a).Q2(-j3, this.b, false, this.c, new g0(f2Var, j3, 0));
    }

    public /* synthetic */ f0(ww wwVar, int i7, TLRPC.Chat chat, long j3, boolean z9) {
        this.d = wwVar;
        this.a = i7;
        this.e = chat;
        this.b = j3;
        this.c = z9;
    }
}
