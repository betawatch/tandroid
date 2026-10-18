package hg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ci.u6;
import com.google.android.gms.internal.play_billing.k3;
import ei.bc;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class n1 extends hm0 implements NotificationCenter.NotificationCenterDelegate {
    public final Context c;
    public final sn f;
    public int h;
    public int n;
    public final d6 s;
    public final int v;
    public final boolean w;
    public String x;
    public u6 y;
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final int r = UserConfig.selectedAccount;
    public final bc E = new bc(this, 13);

    public n1(Context context, sn snVar, d6 d6Var, int i10, boolean z10) {
        this.s = d6Var;
        this.c = context;
        this.f = snVar;
        this.v = i10;
        this.w = z10;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 0 || i10 == 2;
    }

    public final Object E(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.e;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i10);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && objArr[0] == this.y) {
            l();
        }
    }

    @Override // s4.g0
    public final int h() {
        return this.e.size() + this.n;
    }

    @Override // s4.g0
    public final int j(int i10) {
        return i10 < this.e.size() ? 0 : 1;
    }

    @Override // s4.g0
    public final void l() {
        int h = h();
        ArrayList arrayList = this.e;
        arrayList.clear();
        HashSet hashSet = this.d;
        hashSet.clear();
        int i10 = this.r;
        int i11 = this.v;
        ArrayList<MessageObject> foundMessageObjects = i11 == 0 ? MediaDataController.getInstance(i10).getFoundMessageObjects() : HashtagSearchController.getInstance(i10).getMessages(i11);
        int i12 = 0;
        for (int i13 = 0; i13 < foundMessageObjects.size(); i13++) {
            MessageObject messageObject = foundMessageObjects.get(i13);
            if ((!messageObject.hasValidGroupId() || messageObject.isPrimaryGroupMessage) && !hashSet.contains(Integer.valueOf(messageObject.getId()))) {
                arrayList.add(messageObject);
                hashSet.add(Integer.valueOf(messageObject.getId()));
            }
        }
        int i14 = this.n;
        this.h = arrayList.size();
        if (i11 != 0) {
            if (!HashtagSearchController.getInstance(i10).isEndReached(i11) && this.h != 0) {
                i12 = Utilities.clamp(HashtagSearchController.getInstance(i10).getCount(i11) - this.h, 3, 0);
            }
            this.n = i12;
        } else {
            if (!MediaDataController.getInstance(i10).searchEndReached() && this.h != 0) {
                i12 = Utilities.clamp(MediaDataController.getInstance(i10).getSearchCount() - this.h, 3, 0);
            }
            this.n = i12;
        }
        int h10 = h();
        if (h >= h10) {
            super.l();
            return;
        }
        if (i14 > 0) {
            q(h - i14, i14);
        }
        s(h, h10 - h);
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13 = b1Var.f;
        View view = b1Var.a;
        if (i13 != 0) {
            if (i13 == 2) {
                ((m1) view).a(this.y);
                return;
            }
            return;
        }
        r2 r2Var = (r2) view;
        r2Var.s2 = true;
        MessageObject messageObject = (MessageObject) E(i10);
        long dialogId = messageObject.getDialogId();
        int i14 = messageObject.messageOwner.date;
        if (this.w) {
            r2Var.r0 = true;
            long savedDialogId = messageObject.getSavedDialogId();
            TLRPC.Message message = messageObject.messageOwner;
            TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
            if (messageFwdHeader == null || ((i11 = messageFwdHeader.date) == 0 && messageFwdHeader.saved_date == 0)) {
                i12 = message.date;
            } else {
                if (i11 == 0) {
                    i12 = messageFwdHeader.saved_date;
                }
                z10 = false;
                dialogId = savedDialogId;
            }
            i11 = i12;
            z10 = false;
            dialogId = savedDialogId;
        } else {
            if (messageObject.isOutOwner() || ChatObject.isMonoForum(this.r, dialogId)) {
                dialogId = messageObject.getFromChatId();
            }
            z10 = true;
            i11 = i14;
        }
        r2Var.W(dialogId, messageObject, i11, z10, false);
        r2Var.setDialogCellDelegate(new k1(this));
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View r2Var;
        View view;
        if (i10 != 0) {
            d6 d6Var = this.s;
            Context context = this.c;
            if (i10 == 1) {
                b10 b10Var = new b10(context, d6Var);
                b10Var.setIsSingleCell(true);
                b10Var.setViewType(7);
                view = b10Var;
            } else if (i10 != 2) {
                r2Var = null;
            } else {
                view = new m1(context, d6Var);
            }
            r2Var = view;
        } else {
            r2Var = new r2(null, this.c, true, this.r, this.s);
        }
        return k3.l(r2Var, r2Var, -1, -2);
    }
}
