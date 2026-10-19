package hi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class p0 extends f61 {
    static {
        f61.setup(new p0());
    }

    public static g61 a(MessagesController.CommunityPeerDialog communityPeerDialog, k0 k0Var) {
        TLRPC.User user = communityPeerDialog.user;
        if (user != null) {
            g61 J = g61.J(p0.class);
            long j10 = user.id;
            J.B = j10;
            J.d = (int) (j10 ^ (j10 >>> 32));
            J.G = user;
            J.H = k0Var;
            return J;
        }
        TLRPC.Chat chat = communityPeerDialog.chat;
        g61 J2 = g61.J(p0.class);
        long j11 = chat != null ? -chat.id : 0L;
        J2.B = j11;
        J2.d = (int) (j11 ^ (j11 >>> 32));
        J2.G = chat;
        J2.H = k0Var;
        return J2;
    }

    @Override // org.telegram.ui.Components.f61
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        r2 r2Var = (r2) view;
        r2Var.setDialogCellDelegate((n2) g61Var.H);
        Object obj = g61Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            r2Var.Q0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, chat);
            TLRPC.Dialog dialog = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(-chat.id);
            r2Var.P0 = dialog == null;
            if (dialog != null) {
                r2Var.setCustomMessageWithoutRebuild(null);
                r2Var.X(dialog, 0, 0);
                return;
            } else {
                r2Var.setCustomMessageWithoutRebuild(LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]));
                r2Var.W(-chat.id, null, 0, false, false);
                return;
            }
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            r2Var.Q0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, user);
            TLRPC.Dialog dialog2 = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(user.id);
            r2Var.P0 = dialog2 == null;
            if (dialog2 != null) {
                r2Var.setCustomMessageWithoutRebuild(null);
                r2Var.X(dialog2, 0, 0);
            } else {
                r2Var.setCustomMessageWithoutRebuild(LocaleController.getString(R.string.Bot));
                r2Var.W(user.id, null, 0, false, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean contentsEquals(g61 g61Var, g61 g61Var2) {
        return g61Var.d == g61Var2.d;
    }

    @Override // org.telegram.ui.Components.f61
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        r2 r2Var = new r2(null, context, false, i10, d6Var);
        r2Var.O0 = true;
        return r2Var;
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean equals(g61 g61Var, g61 g61Var2) {
        return g61Var.d == g61Var2.d;
    }
}
