package fi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.o2;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class q0 extends v51 {
    static {
        v51.setup(new q0());
    }

    public static w51 a(MessagesController.CommunityPeerDialog communityPeerDialog, k0 k0Var) {
        TLRPC.User user = communityPeerDialog.user;
        if (user != null) {
            w51 J = w51.J(q0.class);
            long j3 = user.id;
            J.B = j3;
            J.d = (int) (j3 ^ (j3 >>> 32));
            J.G = user;
            J.H = k0Var;
            return J;
        }
        TLRPC.Chat chat = communityPeerDialog.chat;
        w51 J2 = w51.J(q0.class);
        long j10 = chat != null ? -chat.id : 0L;
        J2.B = j10;
        J2.d = (int) (j10 ^ (j10 >>> 32));
        J2.G = chat;
        J2.H = k0Var;
        return J2;
    }

    @Override // org.telegram.ui.Components.v51
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        s2 s2Var = (s2) view;
        s2Var.setDialogCellDelegate((o2) w51Var.H);
        Object obj = w51Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            s2Var.Q0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, chat);
            TLRPC.Dialog dialog = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(-chat.id);
            s2Var.P0 = dialog == null;
            if (dialog != null) {
                s2Var.setCustomMessageWithoutRebuild(null);
                s2Var.X(dialog, 0, 0);
                return;
            } else {
                s2Var.setCustomMessageWithoutRebuild(LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]));
                s2Var.W(-chat.id, null, 0, false, false);
                return;
            }
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            s2Var.Q0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, user);
            TLRPC.Dialog dialog2 = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(user.id);
            s2Var.P0 = dialog2 == null;
            if (dialog2 != null) {
                s2Var.setCustomMessageWithoutRebuild(null);
                s2Var.X(dialog2, 0, 0);
            } else {
                s2Var.setCustomMessageWithoutRebuild(LocaleController.getString(R.string.Bot));
                s2Var.W(user.id, null, 0, false, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.v51
    public final boolean contentsEquals(w51 w51Var, w51 w51Var2) {
        return w51Var.d == w51Var2.d;
    }

    @Override // org.telegram.ui.Components.v51
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        s2 s2Var = new s2(null, context, false, i10, f6Var);
        s2Var.O0 = true;
        return s2Var;
    }

    @Override // org.telegram.ui.Components.v51
    public final boolean equals(w51 w51Var, w51 w51Var2) {
        return w51Var.d == w51Var2.d;
    }
}
