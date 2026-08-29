package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bu0 extends il0 {
    public int A;
    public final /* synthetic */ qu0 C;
    public final Context c;
    public final int d;
    public boolean r;
    public String w;
    public kg.q0 x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public boolean s = false;
    public int v = 0;
    public int y = -1;
    public final fq0 B = new fq0(this, 6);

    public bu0(qu0 qu0Var, Context context) {
        this.C = qu0Var;
        this.c = context;
        this.d = qu0Var.r1.getCurrentAccount();
        C(true);
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    public final void E(kg.q0 q0Var, String str) {
        if (TextUtils.equals(str, this.w)) {
            kg.q0 q0Var2 = this.x;
            if (q0Var2 == null && q0Var == null) {
                return;
            }
            if (q0Var2 != null && q0Var2.equals(q0Var)) {
                return;
            }
        }
        this.w = str;
        this.x = q0Var;
        int i10 = this.y;
        int i11 = this.d;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.y, true);
            this.y = -1;
        }
        this.n.clear();
        this.h.clear();
        this.f.clear();
        int i12 = 0;
        this.v = 0;
        this.s = false;
        this.r = true;
        ArrayList arrayList = this.e;
        arrayList.clear();
        if (this.x == null) {
            arrayList.addAll(MessagesController.getInstance(i11).getSavedMessagesController().searchDialogs(str));
        }
        while (true) {
            it0[] it0VarArr = this.C.g0;
            if (i12 >= it0VarArr.length) {
                break;
            }
            it0 it0Var = it0VarArr[i12];
            if (it0Var.B == 11) {
                it0Var.w.e(true, true);
            }
            i12++;
        }
        if (this.x == null) {
            l();
        }
        fq0 fq0Var = this.B;
        AndroidUtilities.cancelRunOnUIThread(fq0Var);
        AndroidUtilities.runOnUIThread(fq0Var, this.x != null ? 60L : 600L);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.w) && this.x == null) {
            this.r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i10 = this.d;
        tL_messages_search.peer = MessagesController.getInstance(i10).getInputPeer(UserConfig.getInstance(i10).getClientUserId());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.q = this.w;
        kg.q0 q0Var = this.x;
        if (q0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(q0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((MessageObject) j7.l1.i(1, arrayList)).getId();
        }
        tL_messages_search.limit = 10;
        this.s = false;
        int i11 = this.A + 1;
        this.A = i11;
        rm rmVar = new rm(this, i11, tL_messages_search, 15);
        if (this.x != null) {
            MessagesStorage.getInstance(i10).searchSavedByTag(this.x.g(), 0L, this.w, 100, this.n.size(), new lh.a2(1, this, rmVar), false);
        } else {
            rmVar.run();
        }
    }

    public final void G(boolean z10) {
        ArrayList arrayList;
        CharSequence formatString;
        CharSequence charSequence;
        it0[] it0VarArr = this.C.g0;
        ArrayList arrayList2 = this.f;
        arrayList2.clear();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList3 = this.h;
            if (i10 >= arrayList3.size()) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList3.get(i10);
            if (messageObject != null && !hashSet.contains(Integer.valueOf(messageObject.getId()))) {
                hashSet.add(Integer.valueOf(messageObject.getId()));
                arrayList2.add(messageObject);
            }
            i10++;
        }
        int i11 = 0;
        while (true) {
            arrayList = this.n;
            if (i11 >= arrayList.size()) {
                break;
            }
            MessageObject messageObject2 = (MessageObject) arrayList.get(i11);
            if (messageObject2 != null && !hashSet.contains(Integer.valueOf(messageObject2.getId()))) {
                hashSet.add(Integer.valueOf(messageObject2.getId()));
                arrayList2.add(messageObject2);
            }
            i11++;
        }
        if (!z10 || !arrayList.isEmpty()) {
            for (int i12 = 0; i12 < it0VarArr.length; i12++) {
                if (it0VarArr[i12].B == 11 && arrayList2.isEmpty() && this.e.isEmpty()) {
                    gh.s sVar = it0VarArr[i12].w.d;
                    if (this.x == null || !TextUtils.isEmpty(this.w)) {
                        formatString = LocaleController.formatString(R.string.NoResultFoundFor, this.w);
                    } else {
                        String string = LocaleController.getString(R.string.NoResultFoundForTag);
                        kg.q0 q0Var = this.x;
                        Paint.FontMetricsInt fontMetricsInt = it0VarArr[i12].w.d.getPaint().getFontMetricsInt();
                        if (TextUtils.isEmpty(q0Var.f)) {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new y5(q0Var.g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        } else {
                            charSequence = q0Var.f;
                        }
                        formatString = AndroidUtilities.replaceCharSequence("%s", string, charSequence);
                    }
                    sVar.setText(formatString);
                    it0VarArr[i12].w.f.setVisibility(8);
                    it0VarArr[i12].w.e(false, true);
                }
            }
        }
        l();
    }

    @Override // f2.p0
    public final int h() {
        return this.f.size() + this.e.size();
    }

    @Override // f2.p0
    public final long i(int i10) {
        int hash;
        if (i10 < 0) {
            return i10;
        }
        ArrayList arrayList = this.e;
        if (i10 < arrayList.size()) {
            hash = Objects.hash(1, Long.valueOf(((SavedMessagesController.SavedDialog) arrayList.get(i10)).dialogId));
        } else {
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f;
            if (size >= arrayList2.size()) {
                return size;
            }
            hash = Objects.hash(2, Long.valueOf(((MessageObject) arrayList2.get(size)).getSavedDialogId()), Integer.valueOf(((MessageObject) arrayList2.get(size)).getId()));
        }
        return hash;
    }

    @Override // f2.p0
    public final int j(int i10) {
        return 23;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        if (i10 < 0) {
            return;
        }
        View view = n1Var.a;
        if (view instanceof org.telegram.ui.Cells.p2) {
            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
            p2Var.o2 = i10 + 1 < h();
            ArrayList arrayList = this.e;
            if (i10 < arrayList.size()) {
                SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
                p2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                return;
            }
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f;
            if (size < arrayList2.size()) {
                MessageObject messageObject = (MessageObject) arrayList2.get(size);
                p2Var.W(messageObject.getSavedDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            }
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        au0 au0Var = new au0(0, this.c, true);
        qu0 qu0Var = this.C;
        au0Var.setDialogCellDelegate(qu0Var);
        au0Var.n0 = true;
        au0Var.setBackgroundColor(qu0Var.h0(org.telegram.ui.ActionBar.g6.d6));
        return new vk0(au0Var);
    }
}
