package ih;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Components.aa;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class u9 {
    public static final u9[] f = new u9[4];
    public final int a;
    public final LongSparseLongArray b = new LongSparseLongArray();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final t9 e;

    public u9(int i9) {
        new ArrayList();
        this.e = new t9(this);
        this.a = i9;
    }

    public final void a(aa aaVar) {
        TLRPC.UserStatus userStatus;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = this.c;
        arrayList.clear();
        for (int i9 = 0; i9 < aaVar.getChildCount(); i9++) {
            View childAt = aaVar.getChildAt(i9);
            long dialogId = childAt instanceof org.telegram.ui.Cells.r2 ? ((org.telegram.ui.Cells.r2) childAt).getDialogId() : childAt instanceof va ? ((va) childAt).getDialogId() : 0L;
            int i10 = this.a;
            LongSparseLongArray longSparseLongArray = this.b;
            if (dialogId > 0) {
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(dialogId));
                if (user != null && !user.bot && !user.self && !user.contact && (userStatus = user.status) != null && !(userStatus instanceof TLRPC.TL_userStatusEmpty) && currentTimeMillis - longSparseLongArray.get(dialogId, 0L) > 3600000) {
                    longSparseLongArray.put(dialogId, currentTimeMillis);
                    arrayList.add(Long.valueOf(dialogId));
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-dialogId));
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
        t9 t9Var = this.e;
        AndroidUtilities.cancelRunOnUIThread(t9Var);
        AndroidUtilities.runOnUIThread(t9Var, 300L);
    }
}
