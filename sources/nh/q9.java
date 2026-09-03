package nh;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Components.aa;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class q9 {
    public static final q9[] f = new q9[4];
    public final int a;
    public final LongSparseLongArray b = new LongSparseLongArray();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final p9 e;

    public q9(int i10) {
        new ArrayList();
        this.e = new p9(this);
        this.a = i10;
    }

    public final void a(aa aaVar) {
        TLRPC.UserStatus userStatus;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = this.c;
        arrayList.clear();
        for (int i10 = 0; i10 < aaVar.getChildCount(); i10++) {
            View childAt = aaVar.getChildAt(i10);
            long dialogId = childAt instanceof org.telegram.ui.Cells.q2 ? ((org.telegram.ui.Cells.q2) childAt).getDialogId() : childAt instanceof ua ? ((ua) childAt).getDialogId() : 0L;
            int i11 = this.a;
            LongSparseLongArray longSparseLongArray = this.b;
            if (dialogId > 0) {
                TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(dialogId));
                if (user != null && !user.bot && !user.self && !user.contact && (userStatus = user.status) != null && !(userStatus instanceof TLRPC.TL_userStatusEmpty) && currentTimeMillis - longSparseLongArray.get(dialogId, 0L) > 3600000) {
                    longSparseLongArray.put(dialogId, currentTimeMillis);
                    arrayList.add(Long.valueOf(dialogId));
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-dialogId));
                if (ChatObject.isChannel(chat) && !ChatObject.isMonoForum(chat) && currentTimeMillis - longSparseLongArray.get(dialogId, 0L) > 3600000) {
                    longSparseLongArray.put(dialogId, currentTimeMillis);
                    arrayList.add(Long.valueOf(dialogId));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.d.addAll(arrayList);
        p9 p9Var = this.e;
        AndroidUtilities.cancelRunOnUIThread(p9Var);
        AndroidUtilities.runOnUIThread(p9Var, 300L);
    }
}
