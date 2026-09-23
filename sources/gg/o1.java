package gg;

import ai.v8;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class o1 extends ll0 implements NotificationCenter.NotificationCenterDelegate {
    public final Context c;
    public final xn f;
    public int h;
    public int n;
    public final d6 s;
    public final int v;
    public final boolean w;
    public String x;
    public v8 y;
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final int r = UserConfig.selectedAccount;
    public final rc E = new rc(this, 16);

    public o1(Context context, xn xnVar, d6 d6Var, int i10, boolean z10) {
        this.s = d6Var;
        this.c = context;
        this.f = xnVar;
        this.v = i10;
        this.w = z10;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
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

    @Override // s4.h0
    public final int h() {
        return this.e.size() + this.n;
    }

    @Override // s4.h0
    public final int j(int i10) {
        return i10 < this.e.size() ? 0 : 1;
    }

    @Override // s4.h0
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

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13 = c1Var.f;
        View view = c1Var.a;
        if (i13 != 0) {
            if (i13 == 2) {
                ((n1) view).a(this.y);
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
            } else if (i11 == 0) {
                i12 = messageFwdHeader.saved_date;
            } else {
                dialogId = savedDialogId;
                z10 = false;
            }
            dialogId = savedDialogId;
            i11 = i12;
            z10 = false;
        } else {
            if (messageObject.isOutOwner() || ChatObject.isMonoForum(this.r, dialogId)) {
                dialogId = messageObject.getFromChatId();
            }
            i11 = i14;
            z10 = true;
        }
        r2Var.W(dialogId, messageObject, i11, z10, false);
        r2Var.setDialogCellDelegate(new l1(this));
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View r2Var;
        View view;
        if (i10 != 0) {
            d6 d6Var = this.s;
            Context context = this.c;
            if (i10 == 1) {
                u00 u00Var = new u00(context, d6Var);
                u00Var.setIsSingleCell(true);
                u00Var.setViewType(7);
                view = u00Var;
            } else if (i10 != 2) {
                r2Var = null;
            } else {
                view = new n1(context, d6Var);
            }
            r2Var = view;
        } else {
            r2Var = new r2(null, this.c, true, this.r, this.s);
        }
        return com.google.android.gms.internal.vision.e2.k(r2Var, r2Var, -1, -2);
    }
}
