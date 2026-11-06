package ii;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t3;
import org.telegram.messenger.uo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class i0 extends w31 {
    static {
        w31.h(new i0());
    }

    public static x31 i(uo uoVar, p2 p2Var) {
        TLRPC.User user = uoVar.c;
        if (user != null) {
            x31 K = x31.K(i0.class);
            long j3 = user.id;
            K.B = j3;
            K.d = (int) (j3 ^ (j3 >>> 32));
            K.G = user;
            K.H = p2Var;
            return K;
        }
        TLRPC.Chat chat = uoVar.b;
        x31 K2 = x31.K(i0.class);
        long j10 = chat != null ? -chat.id : 0L;
        K2.B = j10;
        K2.d = (int) (j10 ^ (j10 >>> 32));
        K2.G = chat;
        K2.H = p2Var;
        return K2;
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        t2 t2Var = (t2) view;
        t2Var.setDialogCellDelegate((p2) x31Var.H);
        Object obj = x31Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            t2Var.Q0 = t3.e0(p10.s0, chat);
            TLRPC.Dialog S0 = qp.s1(p10.s0).S0(-chat.id);
            t2Var.P0 = S0 == null;
            if (S0 != null) {
                t2Var.setCustomMessageWithoutRebuild(null);
                t2Var.e0(S0, 0, 0);
                return;
            } else {
                t2Var.setCustomMessageWithoutRebuild(hd.G(chat.participants_count, "Members", new Object[0]));
                t2Var.d0(-chat.id, null, 0, false, false);
                return;
            }
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            t2Var.Q0 = t3.f0(p10.s0, user);
            TLRPC.Dialog S02 = qp.s1(p10.s0).S0(user.id);
            t2Var.P0 = S02 == null;
            if (S02 != null) {
                t2Var.setCustomMessageWithoutRebuild(null);
                t2Var.e0(S02, 0, 0);
            } else {
                t2Var.setCustomMessageWithoutRebuild(hd.M0(2131753156, null));
                t2Var.d0(user.id, null, 0, false, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean c(x31 x31Var, x31 x31Var2) {
        return x31Var.d == x31Var2.d;
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        t2 t2Var = new t2(null, context, false, i7, f6Var);
        t2Var.O0 = true;
        return t2Var;
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean e(x31 x31Var, x31 x31Var2) {
        return x31Var.d == x31Var2.d;
    }
}
