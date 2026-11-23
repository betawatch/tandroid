package li;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.qo;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Cells.u2;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class g0 extends m41 {
    static {
        m41.h(new g0());
    }

    public static n41 i(qo qoVar, q2 q2Var) {
        TLRPC.User user = qoVar.c;
        if (user != null) {
            n41 K = n41.K(g0.class);
            long j3 = user.id;
            K.C = j3;
            K.d = (int) (j3 ^ (j3 >>> 32));
            K.H = user;
            K.I = q2Var;
            return K;
        }
        TLRPC.Chat chat = qoVar.b;
        n41 K2 = n41.K(g0.class);
        long j10 = chat != null ? -chat.id : 0L;
        K2.C = j10;
        K2.d = (int) (j10 ^ (j10 >>> 32));
        K2.H = chat;
        K2.I = q2Var;
        return K2;
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        u2 u2Var = (u2) view;
        u2Var.setDialogCellDelegate((q2) n41Var.I);
        Object obj = n41Var.H;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            u2Var.R0 = v3.e0(i10.t0, chat);
            TLRPC.Dialog U0 = mp.u1(i10.t0).U0(-chat.id);
            u2Var.Q0 = U0 == null;
            if (U0 != null) {
                u2Var.setCustomMessageWithoutRebuild(null);
                u2Var.g0(U0, 0, 0);
                return;
            } else {
                u2Var.setCustomMessageWithoutRebuild(gd.G(chat.participants_count, "Members", new Object[0]));
                u2Var.f0(-chat.id, null, 0, false, false);
                return;
            }
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            u2Var.R0 = v3.f0(i10.t0, user);
            TLRPC.Dialog U02 = mp.u1(i10.t0).U0(user.id);
            u2Var.Q0 = U02 == null;
            if (U02 != null) {
                u2Var.setCustomMessageWithoutRebuild(null);
                u2Var.g0(U02, 0, 0);
            } else {
                u2Var.setCustomMessageWithoutRebuild(gd.N0(2131753153, null));
                u2Var.f0(user.id, null, 0, false, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean c(n41 n41Var, n41 n41Var2) {
        return n41Var.d == n41Var2.d;
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, ek0 ek0Var, int i7, i6 i6Var) {
        u2 u2Var = new u2(null, context, false, i7, i6Var);
        u2Var.P0 = true;
        return u2Var;
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean e(n41 n41Var, n41 n41Var2) {
        return n41Var.d == n41Var2.d;
    }
}
