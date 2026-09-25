package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class mq0 extends vl0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public final a0.i e = new a0.i();
    public final /* synthetic */ uq0 f;

    public mq0(uq0 uq0Var, Context context) {
        this.f = uq0Var;
        this.c = context;
        E();
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f != 1;
    }

    public final void E() {
        int i10;
        int i11;
        int i12;
        int i13;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i14;
        ArrayList arrayList = this.d;
        arrayList.clear();
        a0.i iVar = this.e;
        iVar.b();
        uq0 uq0Var = this.f;
        i10 = ((org.telegram.ui.ActionBar.e3) uq0Var).currentAccount;
        long j3 = UserConfig.getInstance(i10).clientUserId;
        if (uq0Var.Z) {
            lq0 lq0Var = new lq0();
            lq0Var.id = Long.MAX_VALUE;
            arrayList.add(lq0Var);
            iVar.k(lq0Var, lq0Var.id);
        }
        i11 = ((org.telegram.ui.ActionBar.e3) uq0Var).currentAccount;
        if (!MessagesController.getInstance(i11).dialogsForward.isEmpty()) {
            i14 = ((org.telegram.ui.ActionBar.e3) uq0Var).currentAccount;
            TLRPC.Dialog dialog = MessagesController.getInstance(i14).dialogsForward.get(0);
            arrayList.add(dialog);
            iVar.k(dialog, dialog.id);
        }
        ArrayList arrayList2 = new ArrayList();
        i12 = ((org.telegram.ui.ActionBar.e3) uq0Var).currentAccount;
        ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(i12).getAllDialogs();
        for (int i15 = 0; i15 < allDialogs.size(); i15++) {
            TLRPC.Dialog dialog2 = allDialogs.get(i15);
            if (dialog2 instanceof TLRPC.TL_dialog) {
                long j10 = dialog2.id;
                if (j10 != j3 && !DialogObject.isEncryptedDialog(j10)) {
                    if (DialogObject.isUserDialog(dialog2.id)) {
                        if (dialog2.folder_id == 1) {
                            arrayList2.add(dialog2);
                        } else {
                            arrayList.add(dialog2);
                        }
                        iVar.k(dialog2, dialog2.id);
                    } else {
                        i13 = ((org.telegram.ui.ActionBar.e3) uq0Var).currentAccount;
                        TLRPC.Chat chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-dialog2.id));
                        if (chat != null && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                            if (dialog2.folder_id == 1) {
                                arrayList2.add(dialog2);
                            } else {
                                arrayList.add(dialog2);
                            }
                            iVar.k(dialog2, dialog2.id);
                        }
                    }
                }
            }
        }
        arrayList.addAll(arrayList2);
        org.telegram.ui.wn wnVar = uq0Var.f0;
        if (wnVar != null) {
            int i16 = wnVar.a;
            if (i16 == 1) {
                ArrayList arrayList3 = new ArrayList(arrayList.subList(0, Math.min(4, arrayList.size())));
                arrayList.clear();
                arrayList.addAll(arrayList3);
            } else if (i16 == 2) {
                while (!arrayList.isEmpty() && arrayList.size() < 80) {
                    arrayList.add((TLRPC.Dialog) hg.c.g(1, arrayList));
                }
            }
        }
        l();
    }

    @Override // s4.h0
    public final int h() {
        int size = this.d.size();
        return size != 0 ? size + 1 : size;
    }

    @Override // s4.h0
    public final int j(int i10) {
        return i10 == 0 ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.Dialog dialog;
        int i11;
        if (c1Var.f != 0) {
            return;
        }
        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) c1Var.a;
        int i12 = i10 - 1;
        if (i12 >= 0) {
            ArrayList arrayList = this.d;
            if (i12 < arrayList.size()) {
                dialog = (TLRPC.Dialog) arrayList.get(i12);
                if (dialog != null) {
                    return;
                }
                uq0 uq0Var = this.f;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) uq0Var.V.get(dialog);
                i11 = ((org.telegram.ui.ActionBar.e3) uq0Var).currentAccount;
                g7Var.d(tL_forumTopic, MessagesController.getInstance(i11).isMonoForum(dialog.id), false);
                long j3 = dialog.id;
                g7Var.c(j3, uq0Var.U.h(j3) >= 0, null);
                return;
            }
        }
        dialog = null;
        if (dialog != null) {
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View kq0Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        uq0 uq0Var = this.f;
        Context context = this.c;
        if (i10 != 0) {
            kq0Var = new View(context);
            kq0Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp((!uq0Var.h0 || uq0Var.o0[1] == null) ? 56.0f : 109.0f)));
        } else {
            d6Var = ((org.telegram.ui.ActionBar.e3) uq0Var).resourcesProvider;
            kq0Var = new kq0(this, context, d6Var);
            kq0Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(100.0f)));
        }
        return new gl0(kq0Var);
    }
}
