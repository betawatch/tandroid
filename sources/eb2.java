// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class eb2 extends iw5 {
    public final /* synthetic */ TLRPC.Chat x;
    public final /* synthetic */ fb2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb2(fb2 fb2Var, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.y = fb2Var;
        this.x = chat2;
    }

    @Override // iw5
    public final boolean a(boolean z, gw5 gw5Var) {
        ib2 ib2Var = this.y.d;
        if (ib2Var.Q) {
            return false;
        }
        ib2Var.Q = true;
        e(new ra2(this, gw5Var, (byte) 5), new rh(this, this.x, z, (Runnable) gw5Var, (byte) 11));
        return true;
    }

    @Override // iw5
    public final boolean b(boolean z, hw5 hw5Var) {
        ib2 ib2Var = this.y.d;
        if (ib2Var.P) {
            return false;
        }
        ib2Var.P = true;
        e(new ra2(this, hw5Var, (byte) 5), new rh(this, this.x, z, (Runnable) hw5Var, (byte) 10));
        return true;
    }

    public final void e(ra2 ra2Var, Runnable runnable) {
        ib2 ib2Var = this.y.d;
        if (sd2.T(ib2Var.f)) {
            runnable.run();
        } else {
            ib2Var.getMessagesController().P(ib2Var.getParentActivity(), this.x.id, ib2Var, new x92((Object) this, (Object) runnable, (byte) 3), ra2Var);
        }
    }
}
