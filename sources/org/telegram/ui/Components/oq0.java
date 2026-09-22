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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class oq0 extends xl0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public final a0.i e = new a0.i();
    public final /* synthetic */ wq0 f;

    public oq0(wq0 wq0Var, Context context) {
        this.f = wq0Var;
        this.c = context;
        E();
    }

    @Override // org.telegram.ui.Components.xl0
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
        wq0 wq0Var = this.f;
        i10 = ((org.telegram.ui.ActionBar.f3) wq0Var).currentAccount;
        long j3 = UserConfig.getInstance(i10).clientUserId;
        if (wq0Var.Z) {
            nq0 nq0Var = new nq0();
            nq0Var.id = Long.MAX_VALUE;
            arrayList.add(nq0Var);
            iVar.k(nq0Var, nq0Var.id);
        }
        i11 = ((org.telegram.ui.ActionBar.f3) wq0Var).currentAccount;
        if (!MessagesController.getInstance(i11).dialogsForward.isEmpty()) {
            i14 = ((org.telegram.ui.ActionBar.f3) wq0Var).currentAccount;
            TLRPC.Dialog dialog = MessagesController.getInstance(i14).dialogsForward.get(0);
            arrayList.add(dialog);
            iVar.k(dialog, dialog.id);
        }
        ArrayList arrayList2 = new ArrayList();
        i12 = ((org.telegram.ui.ActionBar.f3) wq0Var).currentAccount;
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
                        i13 = ((org.telegram.ui.ActionBar.f3) wq0Var).currentAccount;
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
        org.telegram.ui.zn znVar = wq0Var.f0;
        if (znVar != null) {
            int i16 = znVar.a;
            if (i16 == 1) {
                ArrayList arrayList3 = new ArrayList(arrayList.subList(0, Math.min(4, arrayList.size())));
                arrayList.clear();
                arrayList.addAll(arrayList3);
            } else if (i16 == 2) {
                while (!arrayList.isEmpty() && arrayList.size() < 80) {
                    arrayList.add((TLRPC.Dialog) hg.k0.g(1, arrayList));
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
        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) c1Var.a;
        int i12 = i10 - 1;
        if (i12 >= 0) {
            ArrayList arrayList = this.d;
            if (i12 < arrayList.size()) {
                dialog = (TLRPC.Dialog) arrayList.get(i12);
                if (dialog != null) {
                    return;
                }
                wq0 wq0Var = this.f;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) wq0Var.V.get(dialog);
                i11 = ((org.telegram.ui.ActionBar.f3) wq0Var).currentAccount;
                h7Var.d(tL_forumTopic, MessagesController.getInstance(i11).isMonoForum(dialog.id), false);
                long j3 = dialog.id;
                h7Var.c(j3, wq0Var.U.h(j3) >= 0, null);
                return;
            }
        }
        dialog = null;
        if (dialog != null) {
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View mq0Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        wq0 wq0Var = this.f;
        Context context = this.c;
        if (i10 != 0) {
            mq0Var = new View(context);
            mq0Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp((!wq0Var.h0 || wq0Var.o0[1] == null) ? 56.0f : 109.0f)));
        } else {
            f6Var = ((org.telegram.ui.ActionBar.f3) wq0Var).resourcesProvider;
            mq0Var = new mq0(this, context, f6Var);
            mq0Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(100.0f)));
        }
        return new il0(mq0Var);
    }
}
