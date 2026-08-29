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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class up0 extends il0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public final a0.h e = new a0.h();
    public final /* synthetic */ dq0 f;

    public up0(dq0 dq0Var, Context context) {
        this.f = dq0Var;
        this.c = context;
        E();
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return n1Var.f != 1;
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
        dq0 dq0Var = this.f;
        i10 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
        long j10 = UserConfig.getInstance(i10).clientUserId;
        if (dq0Var.V) {
            tp0 tp0Var = new tp0();
            tp0Var.id = Long.MAX_VALUE;
            arrayList.add(tp0Var);
            hVar.k(tp0Var, tp0Var.id);
        }
        i11 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
        if (!MessagesController.getInstance(i11).dialogsForward.isEmpty()) {
            i14 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
            TLRPC.Dialog dialog = MessagesController.getInstance(i14).dialogsForward.get(0);
            arrayList.add(dialog);
            hVar.k(dialog, dialog.id);
        }
        ArrayList arrayList2 = new ArrayList();
        i12 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
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
                        i13 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
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
        org.telegram.ui.tn tnVar = dq0Var.b0;
        if (tnVar != null) {
            int i16 = tnVar.a;
            if (i16 == 1) {
                ArrayList arrayList3 = new ArrayList(arrayList.subList(0, Math.min(4, arrayList.size())));
                arrayList.clear();
                arrayList.addAll(arrayList3);
            } else if (i16 == 2) {
                while (!arrayList.isEmpty() && arrayList.size() < 80) {
                    arrayList.add((TLRPC.Dialog) j7.l1.i(1, arrayList));
                }
            }
        }
        l();
    }

    @Override // f2.p0
    public final int h() {
        int size = this.d.size();
        return size != 0 ? size + 1 : size;
    }

    @Override // f2.p0
    public final int j(int i10) {
        return i10 == 0 ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.n1 n1Var, int i10) {
        TLRPC.Dialog dialog;
        int i11;
        if (n1Var.f != 0) {
            return;
        }
        org.telegram.ui.Cells.c7 c7Var = (org.telegram.ui.Cells.c7) n1Var.a;
        int i12 = i10 - 1;
        if (i12 >= 0) {
            ArrayList arrayList = this.d;
            if (i12 < arrayList.size()) {
                dialog = (TLRPC.Dialog) arrayList.get(i12);
                if (dialog != null) {
                    return;
                }
                dq0 dq0Var = this.f;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) dq0Var.R.get(dialog);
                i11 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
                c7Var.d(tL_forumTopic, MessagesController.getInstance(i11).isMonoForum(dialog.id), false);
                long j10 = dialog.id;
                c7Var.c(j10, dq0Var.Q.h(j10) >= 0, null);
                return;
            }
        }
        dialog = null;
        if (dialog != null) {
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View sp0Var;
        org.telegram.ui.ActionBar.c6 c6Var;
        dq0 dq0Var = this.f;
        Context context = this.c;
        if (i10 != 0) {
            sp0Var = new View(context);
            sp0Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp((!dq0Var.d0 || dq0Var.k0[1] == null) ? 56.0f : 109.0f)));
        } else {
            c6Var = ((org.telegram.ui.ActionBar.f3) dq0Var).resourcesProvider;
            sp0Var = new sp0(this, context, c6Var);
            sp0Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(100.0f)));
        }
        return new vk0(sp0Var);
    }
}
