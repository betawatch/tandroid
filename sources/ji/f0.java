package ji;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.lo;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f0 extends q31 {
    static {
        q31.h(new f0());
    }

    public static r31 i(lo loVar, p2 p2Var) {
        TLRPC.User user = loVar.c;
        if (user != null) {
            r31 K = r31.K(f0.class);
            long j10 = user.id;
            K.B = j10;
            K.d = (int) (j10 ^ (j10 >>> 32));
            K.G = user;
            K.H = p2Var;
            return K;
        }
        TLRPC.Chat chat = loVar.b;
        r31 K2 = r31.K(f0.class);
        long j11 = chat != null ? -chat.id : 0L;
        K2.B = j11;
        K2.d = (int) (j11 ^ (j11 >>> 32));
        K2.G = chat;
        K2.H = p2Var;
        return K2;
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        t2 t2Var = (t2) view;
        t2Var.setDialogCellDelegate((p2) r31Var.H);
        Object obj = r31Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            t2Var.R0 = t3.e0(h10.t0, chat);
            TLRPC.Dialog S0 = hp.s1(h10.t0).S0(-chat.id);
            t2Var.Q0 = S0 == null;
            if (S0 != null) {
                t2Var.setCustomMessageWithoutRebuild(null);
                t2Var.e0(S0, 0, 0);
                return;
            } else {
                t2Var.setCustomMessageWithoutRebuild(bd.G(chat.participants_count, "Members", new Object[0]));
                t2Var.d0(-chat.id, null, 0, false, false);
                return;
            }
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            t2Var.R0 = t3.f0(h10.t0, user);
            TLRPC.Dialog S02 = hp.s1(h10.t0).S0(user.id);
            t2Var.Q0 = S02 == null;
            if (S02 != null) {
                t2Var.setCustomMessageWithoutRebuild(null);
                t2Var.e0(S02, 0, 0);
            } else {
                t2Var.setCustomMessageWithoutRebuild(bd.M0(2131753156, null));
                t2Var.d0(user.id, null, 0, false, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean c(r31 r31Var, r31 r31Var2) {
        return r31Var.d == r31Var2.d;
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, tj0 tj0Var, int i3, e6 e6Var) {
        t2 t2Var = new t2(null, context, false, i3, e6Var);
        t2Var.P0 = true;
        return t2Var;
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean e(r31 r31Var, r31 r31Var2) {
        return r31Var.d == r31Var2.d;
    }
}
