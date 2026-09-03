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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class dq0 extends ql0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public final a0.h e = new a0.h();
    public final /* synthetic */ lq0 f;

    public dq0(lq0 lq0Var, Context context) {
        this.f = lq0Var;
        this.c = context;
        E();
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return l1Var.f != 1;
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
        a0.h hVar = this.e;
        hVar.b();
        lq0 lq0Var = this.f;
        i10 = ((org.telegram.ui.ActionBar.g3) lq0Var).currentAccount;
        long j10 = UserConfig.getInstance(i10).clientUserId;
        if (lq0Var.W) {
            cq0 cq0Var = new cq0();
            cq0Var.id = Long.MAX_VALUE;
            arrayList.add(cq0Var);
            hVar.k(cq0Var, cq0Var.id);
        }
        i11 = ((org.telegram.ui.ActionBar.g3) lq0Var).currentAccount;
        if (!MessagesController.getInstance(i11).dialogsForward.isEmpty()) {
            i14 = ((org.telegram.ui.ActionBar.g3) lq0Var).currentAccount;
            TLRPC.Dialog dialog = MessagesController.getInstance(i14).dialogsForward.get(0);
            arrayList.add(dialog);
            hVar.k(dialog, dialog.id);
        }
        ArrayList arrayList2 = new ArrayList();
        i12 = ((org.telegram.ui.ActionBar.g3) lq0Var).currentAccount;
        ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(i12).getAllDialogs();
        for (int i15 = 0; i15 < allDialogs.size(); i15++) {
            TLRPC.Dialog dialog2 = allDialogs.get(i15);
            if (dialog2 instanceof TLRPC.TL_dialog) {
                long j11 = dialog2.id;
                if (j11 != j10 && !DialogObject.isEncryptedDialog(j11)) {
                    if (DialogObject.isUserDialog(dialog2.id)) {
                        if (dialog2.folder_id == 1) {
                            arrayList2.add(dialog2);
                        } else {
                            arrayList.add(dialog2);
                        }
                        hVar.k(dialog2, dialog2.id);
                    } else {
                        i13 = ((org.telegram.ui.ActionBar.g3) lq0Var).currentAccount;
                        TLRPC.Chat chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-dialog2.id));
                        if (chat != null && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                            if (dialog2.folder_id == 1) {
                                arrayList2.add(dialog2);
                            } else {
                                arrayList.add(dialog2);
                            }
                            hVar.k(dialog2, dialog2.id);
                        }
                    }
                }
            }
        }
        arrayList.addAll(arrayList2);
        org.telegram.ui.zn znVar = lq0Var.c0;
        if (znVar != null) {
            int i16 = znVar.a;
            if (i16 == 1) {
                ArrayList arrayList3 = new ArrayList(arrayList.subList(0, Math.min(4, arrayList.size())));
                arrayList.clear();
                arrayList.addAll(arrayList3);
            } else if (i16 == 2) {
                while (!arrayList.isEmpty() && arrayList.size() < 80) {
                    arrayList.add((TLRPC.Dialog) kf.k0.i(1, arrayList));
                }
            }
        }
        l();
    }

    @Override // f2.o0
    public final int h() {
        int size = this.d.size();
        return size != 0 ? size + 1 : size;
    }

    @Override // f2.o0
    public final int j(int i10) {
        return i10 == 0 ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // f2.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.l1 l1Var, int i10) {
        TLRPC.Dialog dialog;
        int i11;
        if (l1Var.f != 0) {
            return;
        }
        org.telegram.ui.Cells.d7 d7Var = (org.telegram.ui.Cells.d7) l1Var.a;
        int i12 = i10 - 1;
        if (i12 >= 0) {
            ArrayList arrayList = this.d;
            if (i12 < arrayList.size()) {
                dialog = (TLRPC.Dialog) arrayList.get(i12);
                if (dialog != null) {
                    return;
                }
                lq0 lq0Var = this.f;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) lq0Var.S.get(dialog);
                i11 = ((org.telegram.ui.ActionBar.g3) lq0Var).currentAccount;
                d7Var.d(tL_forumTopic, MessagesController.getInstance(i11).isMonoForum(dialog.id), false);
                long j10 = dialog.id;
                d7Var.c(j10, lq0Var.R.h(j10) >= 0, null);
                return;
            }
        }
        dialog = null;
        if (dialog != null) {
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View bq0Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        lq0 lq0Var = this.f;
        Context context = this.c;
        if (i10 != 0) {
            bq0Var = new View(context);
            bq0Var.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp((!lq0Var.e0 || lq0Var.l0[1] == null) ? 56.0f : 109.0f)));
        } else {
            f6Var = ((org.telegram.ui.ActionBar.g3) lq0Var).resourcesProvider;
            bq0Var = new bq0(this, context, f6Var);
            bq0Var.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(100.0f)));
        }
        return new dl0(bq0Var);
    }
}
