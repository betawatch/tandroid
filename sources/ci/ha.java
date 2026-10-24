package ci;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.wa;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class ha {
    public static final ha[] f = new ha[4];
    public final int a;
    public final LongSparseLongArray b = new LongSparseLongArray();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ga e;

    public ha(int i10) {
        new ArrayList();
        this.e = new ga(this);
        this.a = i10;
    }

    public final void a(org.telegram.ui.Components.ia iaVar) {
        TLRPC.UserStatus userStatus;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = this.c;
        arrayList.clear();
        for (int i10 = 0; i10 < iaVar.getChildCount(); i10++) {
            View childAt = iaVar.getChildAt(i10);
            long dialogId = childAt instanceof org.telegram.ui.Cells.q2 ? ((org.telegram.ui.Cells.q2) childAt).getDialogId() : childAt instanceof wa ? ((wa) childAt).getDialogId() : 0L;
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
        ga gaVar = this.e;
        AndroidUtilities.cancelRunOnUIThread(gaVar);
        AndroidUtilities.runOnUIThread(gaVar, 300L);
    }
}
