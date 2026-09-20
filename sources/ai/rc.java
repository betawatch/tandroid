package ai;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class rc {
    public static final rc[] f = new rc[4];
    public final int a;
    public final LongSparseLongArray b = new LongSparseLongArray();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final qc e;

    public rc(int i10) {
        new ArrayList();
        this.e = new qc(this);
        this.a = i10;
    }

    public final void a(org.telegram.ui.Components.ha haVar) {
        TLRPC.UserStatus userStatus;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = this.c;
        arrayList.clear();
        for (int i10 = 0; i10 < haVar.getChildCount(); i10++) {
            View childAt = haVar.getChildAt(i10);
            long dialogId = childAt instanceof org.telegram.ui.Cells.s2 ? ((org.telegram.ui.Cells.s2) childAt).getDialogId() : childAt instanceof org.telegram.ui.Cells.ab ? ((org.telegram.ui.Cells.ab) childAt).getDialogId() : 0L;
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
        qc qcVar = this.e;
        AndroidUtilities.cancelRunOnUIThread(qcVar);
        AndroidUtilities.runOnUIThread(qcVar, 300L);
    }
}
