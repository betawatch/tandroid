package gg;

import ai.w8;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ci.rc;
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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Components.j10;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class n1 extends pm0 implements NotificationCenter.NotificationCenterDelegate {
    public final Context c;
    public final zn f;
    public int h;
    public int n;
    public final e6 s;
    public final int v;
    public final boolean w;
    public String x;
    public w8 y;
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final int r = UserConfig.selectedAccount;
    public final rc E = new rc(this, 16);

    public n1(Context context, zn znVar, e6 e6Var, int i10, boolean z10) {
        this.s = e6Var;
        this.c = context;
        this.f = znVar;
        this.v = i10;
        this.w = z10;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f;
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

    @Override // s4.i0
    public final int h() {
        return this.e.size() + this.n;
    }

    @Override // s4.i0
    public final int j(int i10) {
        return i10 < this.e.size() ? 0 : 1;
    }

    @Override // s4.i0
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

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13 = d1Var.f;
        View view = d1Var.a;
        if (i13 != 0) {
            if (i13 == 2) {
                ((m1) view).a(this.y);
                return;
            }
            return;
        }
        s2 s2Var = (s2) view;
        s2Var.s2 = true;
        MessageObject messageObject = (MessageObject) E(i10);
        long dialogId = messageObject.getDialogId();
        int i14 = messageObject.messageOwner.date;
        if (this.w) {
            s2Var.r0 = true;
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
        s2Var.W(dialogId, messageObject, i11, z10, false);
        s2Var.setDialogCellDelegate(new k1(this));
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View s2Var;
        View view;
        if (i10 != 0) {
            e6 e6Var = this.s;
            Context context = this.c;
            if (i10 == 1) {
                j10 j10Var = new j10(context, e6Var);
                j10Var.setIsSingleCell(true);
                j10Var.setViewType(7);
                view = j10Var;
            } else if (i10 != 2) {
                s2Var = null;
            } else {
                view = new m1(context, e6Var);
            }
            s2Var = view;
        } else {
            s2Var = new s2(null, this.c, true, this.r, this.s);
        }
        return com.google.android.gms.internal.vision.e2.k(s2Var, s2Var, -1, -2);
    }
}
