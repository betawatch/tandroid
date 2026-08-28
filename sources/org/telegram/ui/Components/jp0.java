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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class jp0 extends vk0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public final a0.h e = new a0.h();
    public final /* synthetic */ rp0 f;

    public jp0(rp0 rp0Var, Context context) {
        this.f = rp0Var;
        this.c = context;
        E();
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return q1Var.f != 1;
    }

    public final void E() {
        int i9;
        int i10;
        int i11;
        int i12;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i13;
        ArrayList arrayList = this.d;
        arrayList.clear();
        a0.h hVar = this.e;
        hVar.b();
        rp0 rp0Var = this.f;
        i9 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
        long j10 = UserConfig.getInstance(i9).clientUserId;
        if (rp0Var.V) {
            ip0 ip0Var = new ip0();
            ip0Var.id = Long.MAX_VALUE;
            arrayList.add(ip0Var);
            hVar.k(ip0Var, ip0Var.id);
        }
        i10 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
        if (!MessagesController.getInstance(i10).dialogsForward.isEmpty()) {
            i13 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
            TLRPC.Dialog dialog = MessagesController.getInstance(i13).dialogsForward.get(0);
            arrayList.add(dialog);
            hVar.k(dialog, dialog.id);
        }
        ArrayList arrayList2 = new ArrayList();
        i11 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
        ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(i11).getAllDialogs();
        for (int i14 = 0; i14 < allDialogs.size(); i14++) {
            TLRPC.Dialog dialog2 = allDialogs.get(i14);
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
                        i12 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
                        TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-dialog2.id));
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
        org.telegram.ui.qn qnVar = rp0Var.b0;
        if (qnVar != null) {
            int i15 = qnVar.a;
            if (i15 == 1) {
                ArrayList arrayList3 = new ArrayList(arrayList.subList(0, Math.min(4, arrayList.size())));
                arrayList.clear();
                arrayList.addAll(arrayList3);
            } else if (i15 == 2) {
                while (!arrayList.isEmpty() && arrayList.size() < 80) {
                    arrayList.add((TLRPC.Dialog) j3.r0.j(1, arrayList));
                }
            }
        }
        l();
    }

    @Override // f2.r0
    public final int h() {
        int size = this.d.size();
        return size != 0 ? size + 1 : size;
    }

    @Override // f2.r0
    public final int j(int i9) {
        return i9 == 0 ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        TLRPC.Dialog dialog;
        int i10;
        if (q1Var.f != 0) {
            return;
        }
        org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) q1Var.a;
        int i11 = i9 - 1;
        if (i11 >= 0) {
            ArrayList arrayList = this.d;
            if (i11 < arrayList.size()) {
                dialog = (TLRPC.Dialog) arrayList.get(i11);
                if (dialog != null) {
                    return;
                }
                rp0 rp0Var = this.f;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) rp0Var.R.get(dialog);
                i10 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
                e7Var.d(tL_forumTopic, MessagesController.getInstance(i10).isMonoForum(dialog.id), false);
                long j10 = dialog.id;
                e7Var.c(j10, rp0Var.Q.h(j10) >= 0, null);
                return;
            }
        }
        dialog = null;
        if (dialog != null) {
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View hp0Var;
        org.telegram.ui.ActionBar.b6 b6Var;
        rp0 rp0Var = this.f;
        Context context = this.c;
        if (i9 != 0) {
            hp0Var = new View(context);
            hp0Var.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp((!rp0Var.d0 || rp0Var.k0[1] == null) ? 56.0f : 109.0f)));
        } else {
            b6Var = ((org.telegram.ui.ActionBar.f3) rp0Var).resourcesProvider;
            hp0Var = new hp0(this, context, b6Var);
            hp0Var.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(100.0f)));
        }
        return new ik0(hp0Var);
    }
}
