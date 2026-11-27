// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class bp2 extends a8c {
    static {
        a8c.h(new bp2());
    }

    public static b8c i(zb7 zb7Var, kf3 kf3Var) {
        TLRPC.User user = zb7Var.c;
        if (user != null) {
            b8c K = b8c.K(bp2.class);
            long j = user.id;
            K.C = j;
            K.d = (int) (j ^ (j >>> 32));
            K.H = user;
            K.I = kf3Var;
            return K;
        }
        TLRPC.Chat chat = zb7Var.b;
        b8c K2 = b8c.K(bp2.class);
        long j2 = chat != null ? -chat.id : 0L;
        K2.C = j2;
        K2.d = (int) (j2 ^ (j2 >>> 32));
        K2.H = chat;
        K2.I = kf3Var;
        return K2;
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        of3 of3Var = (of3) view;
        of3Var.setDialogCellDelegate((kf3) b8cVar.I);
        Object obj = b8cVar.H;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            of3Var.R0 = xc2.e0(yac.t0, chat);
            TLRPC.Dialog S0 = uc7.s1(yac.t0).S0(-chat.id);
            of3Var.Q0 = S0 == null;
            if (S0 != null) {
                of3Var.setCustomMessageWithoutRebuild(null);
                of3Var.f0(S0, 0, 0);
                return;
            } else {
                of3Var.setCustomMessageWithoutRebuild(ob6.G(chat.participants_count, "Members", new Object[0]));
                of3Var.e0(-chat.id, null, 0, false, false);
                return;
            }
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            of3Var.R0 = xc2.f0(yac.t0, user);
            TLRPC.Dialog S02 = uc7.s1(yac.t0).S0(user.id);
            of3Var.Q0 = S02 == null;
            if (S02 != null) {
                of3Var.setCustomMessageWithoutRebuild(null);
                of3Var.f0(S02, 0, 0);
            } else {
                of3Var.setCustomMessageWithoutRebuild(ob6.M0(2131753149, null));
                of3Var.e0(user.id, null, 0, false, false);
            }
        }
    }

    @Override // a8c
    public final boolean c(b8c b8cVar, b8c b8cVar2) {
        return b8cVar.d == b8cVar2.d;
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        of3 of3Var = new of3(null, context, false, i, vnbVar);
        of3Var.P0 = true;
        return of3Var;
    }

    @Override // a8c
    public final boolean e(b8c b8cVar, b8c b8cVar2) {
        return b8cVar.d == b8cVar2.d;
    }
}
