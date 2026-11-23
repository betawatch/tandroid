package li;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.ro;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Cells.u2;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class h0 extends n41 {
    static {
        n41.h(new h0());
    }

    public static o41 i(ro roVar, q2 q2Var) {
        TLRPC.User user = roVar.c;
        if (user != null) {
            o41 K = o41.K(h0.class);
            long j3 = user.id;
            K.C = j3;
            K.d = (int) (j3 ^ (j3 >>> 32));
            K.H = user;
            K.I = q2Var;
            return K;
        }
        TLRPC.Chat chat = roVar.b;
        o41 K2 = o41.K(h0.class);
        long j10 = chat != null ? -chat.id : 0L;
        K2.C = j10;
        K2.d = (int) (j10 ^ (j10 >>> 32));
        K2.H = chat;
        K2.I = q2Var;
        return K2;
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        u2 u2Var = (u2) view;
        u2Var.setDialogCellDelegate((q2) o41Var.I);
        Object obj = o41Var.H;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            u2Var.R0 = v3.e0(k10.t0, chat);
            TLRPC.Dialog U0 = np.u1(k10.t0).U0(-chat.id);
            u2Var.Q0 = U0 == null;
            if (U0 != null) {
                u2Var.setCustomMessageWithoutRebuild(null);
                u2Var.e0(U0, 0, 0);
                return;
            } else {
                u2Var.setCustomMessageWithoutRebuild(hd.G(chat.participants_count, "Members", new Object[0]));
                u2Var.d0(-chat.id, null, 0, false, false);
                return;
            }
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            u2Var.R0 = v3.f0(k10.t0, user);
            TLRPC.Dialog U02 = np.u1(k10.t0).U0(user.id);
            u2Var.Q0 = U02 == null;
            if (U02 != null) {
                u2Var.setCustomMessageWithoutRebuild(null);
                u2Var.e0(U02, 0, 0);
            } else {
                u2Var.setCustomMessageWithoutRebuild(hd.N0(2131753153, null));
                u2Var.d0(user.id, null, 0, false, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean c(o41 o41Var, o41 o41Var2) {
        return o41Var.d == o41Var2.d;
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        u2 u2Var = new u2(null, context, false, i7, h6Var);
        u2Var.P0 = true;
        return u2Var;
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean e(o41 o41Var, o41 o41Var2) {
        return o41Var.d == o41Var2.d;
    }
}
