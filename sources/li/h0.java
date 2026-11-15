package li;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ro;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class h0 extends a41 {
    static {
        a41.h(new h0());
    }

    public static b41 i(ro roVar, p2 p2Var) {
        TLRPC.User user = roVar.c;
        if (user != null) {
            b41 K = b41.K(h0.class);
            long j3 = user.id;
            K.B = j3;
            K.d = (int) (j3 ^ (j3 >>> 32));
            K.G = user;
            K.H = p2Var;
            return K;
        }
        TLRPC.Chat chat = roVar.b;
        b41 K2 = b41.K(h0.class);
        long j10 = chat != null ? -chat.id : 0L;
        K2.B = j10;
        K2.d = (int) (j10 ^ (j10 >>> 32));
        K2.G = chat;
        K2.H = p2Var;
        return K2;
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        t2 t2Var = (t2) view;
        t2Var.setDialogCellDelegate((p2) b41Var.H);
        Object obj = b41Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            t2Var.R0 = t3.e0(m10.t0, chat);
            TLRPC.Dialog S0 = np.s1(m10.t0).S0(-chat.id);
            t2Var.Q0 = S0 == null;
            if (S0 != null) {
                t2Var.setCustomMessageWithoutRebuild(null);
                t2Var.g0(S0, 0, 0);
                return;
            } else {
                t2Var.setCustomMessageWithoutRebuild(hd.G(chat.participants_count, "Members", new Object[0]));
                t2Var.f0(-chat.id, null, 0, false, false);
                return;
            }
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            t2Var.R0 = t3.f0(m10.t0, user);
            TLRPC.Dialog S02 = np.s1(m10.t0).S0(user.id);
            t2Var.Q0 = S02 == null;
            if (S02 != null) {
                t2Var.setCustomMessageWithoutRebuild(null);
                t2Var.g0(S02, 0, 0);
            } else {
                t2Var.setCustomMessageWithoutRebuild(hd.M0(2131753156, null));
                t2Var.f0(user.id, null, 0, false, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.a41
    public final boolean c(b41 b41Var, b41 b41Var2) {
        return b41Var.d == b41Var2.d;
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        t2 t2Var = new t2(null, context, false, i7, e6Var);
        t2Var.P0 = true;
        return t2Var;
    }

    @Override // org.telegram.ui.Components.a41
    public final boolean e(b41 b41Var, b41 b41Var2) {
        return b41Var.d == b41Var2.d;
    }
}
