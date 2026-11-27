// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ja2 extends nw5 {
    public final /* synthetic */ TLRPC.Chat x;
    public final /* synthetic */ ka2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja2(ka2 ka2Var, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.y = ka2Var;
        this.x = chat2;
    }

    @Override // nw5
    public final boolean a(boolean z, lw5 lw5Var) {
        na2 na2Var = this.y.d;
        if (na2Var.Q) {
            return false;
        }
        na2Var.Q = true;
        e(new ea2(this, lw5Var, (byte) 3), new lg(this, this.x, z, (Runnable) lw5Var, (byte) 11));
        return true;
    }

    @Override // nw5
    public final boolean b(boolean z, mw5 mw5Var) {
        na2 na2Var = this.y.d;
        if (na2Var.P) {
            return false;
        }
        na2Var.P = true;
        e(new ea2(this, mw5Var, (byte) 3), new lg(this, this.x, z, (Runnable) mw5Var, (byte) 10));
        return true;
    }

    public final void e(ea2 ea2Var, Runnable runnable) {
        na2 na2Var = this.y.d;
        if (xc2.T(na2Var.f)) {
            runnable.run();
        } else {
            na2Var.getMessagesController().R(na2Var.getParentActivity(), this.x.id, na2Var, new q72((Object) this, (Object) runnable, (byte) 4), ea2Var);
        }
    }
}
