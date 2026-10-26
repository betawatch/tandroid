package org.telegram.ui.Components;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.af1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wr0 implements g20, MessagesStorage.StringCallback, org.telegram.ui.ux {
    public final /* synthetic */ aw0 a;

    public /* synthetic */ wr0(aw0 aw0Var) {
        this.a = aw0Var;
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean K(org.telegram.ui.cy cyVar) {
        return false;
    }

    public void a(boolean z10) {
        aw0 aw0Var = this.a;
        if (!z10) {
            aw0Var.requestLayout();
        }
        aw0Var.setVisibleHeight(aw0Var.P1);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        r0.getStoriesController().r(r0.l1, str, new rs0(this.a, 0));
    }

    @Override // org.telegram.ui.ux
    public boolean v(org.telegram.ui.cy cyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, af1 af1Var) {
        int i12;
        aw0 aw0Var = this.a;
        SparseArray[] sparseArrayArr = aw0Var.b1;
        org.telegram.ui.ActionBar.r2 r2Var = aw0Var.x1;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        boolean z12 = true;
        int i13 = 1;
        while (true) {
            i12 = 0;
            if (i13 < 0) {
                break;
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i14 = 0; i14 < sparseArrayArr[i13].size(); i14++) {
                arrayList3.add(Integer.valueOf(sparseArrayArr[i13].keyAt(i14)));
            }
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            while (i12 < size) {
                Object obj = arrayList3.get(i12);
                i12++;
                Integer num = (Integer) obj;
                if (num.intValue() > 0) {
                    arrayList2.add((MessageObject) sparseArrayArr[i13].get(num.intValue()));
                }
            }
            sparseArrayArr[i13].clear();
            i13--;
        }
        aw0Var.c1 = 0;
        aw0Var.k1(false);
        lv0 lv0Var = aw0Var.T;
        if (lv0Var != null) {
            lv0Var.w.clear();
        }
        if (arrayList.size() <= 1 && ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId != r2Var.getUserConfig().getClientUserId() && charSequence == null) {
            long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            Bundle i15 = a1.g.i("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j10)) {
                i15.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
            } else {
                if (DialogObject.isUserDialog(j10)) {
                    i15.putLong("user_id", j10);
                } else {
                    i15.putLong("chat_id", -j10);
                }
                if (!r2Var.getMessagesController().checkCanOpenChat(i15, cyVar)) {
                    return true;
                }
            }
            r2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            org.telegram.ui.un unVar = new org.telegram.ui.un(i15);
            pg.d.a(unVar, (MessagesStorage.TopicKey) arrayList.get(0));
            cyVar.presentFragment(unVar, true);
            unVar.Mb(arrayList2);
            return true;
        }
        aw0Var.F1(true);
        int i16 = 0;
        while (i16 < arrayList.size()) {
            long j11 = ((MessagesStorage.TopicKey) arrayList.get(i16)).dialogId;
            if (charSequence != null) {
                r2Var.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            r2Var.getSendMessagesHelper().sendMessage(arrayList2, j11, false, false, true, 0, 0L);
            i16++;
            z12 = z12;
            i12 = 0;
        }
        boolean z13 = z12;
        cyVar.finishFragment();
        UndoView undoView = r2Var instanceof ProfileActivity ? ((ProfileActivity) r2Var).L : null;
        if (undoView == null) {
            return z13;
        }
        if (arrayList.size() == z13) {
            undoView.m(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId, Integer.valueOf(arrayList2.size()), 53);
            return z13;
        }
        undoView.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
        return z13;
    }
}
