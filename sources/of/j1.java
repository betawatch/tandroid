package of;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ih.h6;
import java.util.ArrayList;
import java.util.HashSet;
import mh.m2;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j1 extends vk0 implements NotificationCenter.NotificationCenterDelegate {
    public final Context c;
    public final qn f;
    public int h;
    public int n;
    public final b6 s;
    public final int v;
    public final boolean w;
    public String x;
    public h6 y;
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final int r = UserConfig.selectedAccount;
    public final m2 A = new m2(this, 3);

    public j1(Context context, qn qnVar, b6 b6Var, int i9, boolean z10) {
        this.s = b6Var;
        this.c = context;
        this.f = qnVar;
        this.v = i9;
        this.w = z10;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        return i9 == 0 || i9 == 2;
    }

    public final Object E(int i9) {
        if (i9 < 0) {
            return null;
        }
        ArrayList arrayList = this.e;
        if (i9 >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i9);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.storiesListUpdated && objArr[0] == this.y) {
            l();
        }
    }

    @Override // f2.r0
    public final int h() {
        return this.e.size() + this.n;
    }

    @Override // f2.r0
    public final int j(int i9) {
        return i9 < this.e.size() ? 0 : 1;
    }

    @Override // f2.r0
    public final void l() {
        int h = h();
        ArrayList arrayList = this.e;
        arrayList.clear();
        HashSet hashSet = this.d;
        hashSet.clear();
        int i9 = this.r;
        int i10 = this.v;
        ArrayList<MessageObject> foundMessageObjects = i10 == 0 ? MediaDataController.getInstance(i9).getFoundMessageObjects() : HashtagSearchController.getInstance(i9).getMessages(i10);
        int i11 = 0;
        for (int i12 = 0; i12 < foundMessageObjects.size(); i12++) {
            MessageObject messageObject = foundMessageObjects.get(i12);
            if ((!messageObject.hasValidGroupId() || messageObject.isPrimaryGroupMessage) && !hashSet.contains(Integer.valueOf(messageObject.getId()))) {
                arrayList.add(messageObject);
                hashSet.add(Integer.valueOf(messageObject.getId()));
            }
        }
        int i13 = this.n;
        this.h = arrayList.size();
        if (i10 != 0) {
            if (!HashtagSearchController.getInstance(i9).isEndReached(i10) && this.h != 0) {
                i11 = Utilities.clamp(HashtagSearchController.getInstance(i9).getCount(i10) - this.h, 3, 0);
            }
            this.n = i11;
        } else {
            if (!MediaDataController.getInstance(i9).searchEndReached() && this.h != 0) {
                i11 = Utilities.clamp(MediaDataController.getInstance(i9).getSearchCount() - this.h, 3, 0);
            }
            this.n = i11;
        }
        int h10 = h();
        if (h >= h10) {
            super.l();
            return;
        }
        if (i13 > 0) {
            q(h - i13, i13);
        }
        s(h, h10 - h);
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        boolean z10;
        int i11;
        int i12 = q1Var.f;
        View view = q1Var.a;
        if (i12 != 0) {
            if (i12 == 2) {
                ((i1) view).a(this.y);
                return;
            }
            return;
        }
        r2 r2Var = (r2) view;
        r2Var.o2 = true;
        MessageObject messageObject = (MessageObject) E(i9);
        long dialogId = messageObject.getDialogId();
        int i13 = messageObject.messageOwner.date;
        if (this.w) {
            r2Var.n0 = true;
            long savedDialogId = messageObject.getSavedDialogId();
            TLRPC.Message message = messageObject.messageOwner;
            TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
            if (messageFwdHeader == null || ((i10 = messageFwdHeader.date) == 0 && messageFwdHeader.saved_date == 0)) {
                i11 = message.date;
            } else if (i10 == 0) {
                i11 = messageFwdHeader.saved_date;
            } else {
                dialogId = savedDialogId;
                z10 = false;
            }
            dialogId = savedDialogId;
            i10 = i11;
            z10 = false;
        } else {
            if (messageObject.isOutOwner() || ChatObject.isMonoForum(this.r, dialogId)) {
                dialogId = messageObject.getFromChatId();
            }
            i10 = i13;
            z10 = true;
        }
        r2Var.V(dialogId, messageObject, i10, z10, false);
        r2Var.setDialogCellDelegate(new g1(this));
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View r2Var;
        View view;
        if (i9 != 0) {
            b6 b6Var = this.s;
            Context context = this.c;
            if (i9 == 1) {
                e00 e00Var = new e00(context, b6Var);
                e00Var.setIsSingleCell(true);
                e00Var.setViewType(7);
                view = e00Var;
            } else if (i9 != 2) {
                r2Var = null;
            } else {
                view = new i1(context, b6Var);
            }
            r2Var = view;
        } else {
            r2Var = new r2(null, this.c, true, this.r, this.s);
        }
        return j3.r0.s(r2Var, r2Var, -1, -2);
    }
}
