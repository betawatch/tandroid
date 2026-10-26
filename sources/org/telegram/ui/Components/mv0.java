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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class mv0 extends lm0 {
    public int E;
    public final /* synthetic */ aw0 G;
    public final Context c;
    public final int d;
    public boolean r;
    public String w;
    public bh.x0 x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public boolean s = false;
    public int v = 0;
    public int y = -1;
    public final mp0 F = new mp0(this, 10);

    public mv0(aw0 aw0Var, Context context) {
        this.G = aw0Var;
        this.c = context;
        this.d = aw0Var.x1.getCurrentAccount();
        C(true);
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    public final void E(bh.x0 x0Var, String str) {
        if (TextUtils.equals(str, this.w)) {
            bh.x0 x0Var2 = this.x;
            if (x0Var2 == null && x0Var == null) {
                return;
            }
            if (x0Var2 != null && x0Var2.equals(x0Var)) {
                return;
            }
        }
        this.w = str;
        this.x = x0Var;
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
            tu0[] tu0VarArr = this.G.m0;
            if (i12 >= tu0VarArr.length) {
                break;
            }
            tu0 tu0Var = tu0VarArr[i12];
            if (tu0Var.E == 11) {
                tu0Var.v.e(true, true);
            }
            i12++;
        }
        if (this.x == null) {
            l();
        }
        mp0 mp0Var = this.F;
        AndroidUtilities.cancelRunOnUIThread(mp0Var);
        AndroidUtilities.runOnUIThread(mp0Var, this.x != null ? 60L : 600L);
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
        bh.x0 x0Var = this.x;
        if (x0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(x0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((MessageObject) ic.a.g(1, arrayList)).getId();
        }
        tL_messages_search.limit = 10;
        this.s = false;
        int i11 = this.E + 1;
        this.E = i11;
        org.telegram.ui.g4 g4Var = new org.telegram.ui.g4(this, i11, tL_messages_search, 19);
        if (this.x != null) {
            MessagesStorage.getInstance(i10).searchSavedByTag(this.x.g(), 0L, this.w, 100, this.n.size(), new di.h2(1, this, g4Var), false);
        } else {
            g4Var.run();
        }
    }

    public final void G(boolean z10) {
        ArrayList arrayList;
        CharSequence formatString;
        CharSequence charSequence;
        tu0[] tu0VarArr = this.G.m0;
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
            for (int i12 = 0; i12 < tu0VarArr.length; i12++) {
                if (tu0VarArr[i12].E == 11 && arrayList2.isEmpty() && this.e.isEmpty()) {
                    xh.n nVar = tu0VarArr[i12].v.d;
                    if (this.x == null || !TextUtils.isEmpty(this.w)) {
                        formatString = LocaleController.formatString(R.string.NoResultFoundFor, this.w);
                    } else {
                        String string = LocaleController.getString(R.string.NoResultFoundForTag);
                        bh.x0 x0Var = this.x;
                        Paint.FontMetricsInt fontMetricsInt = tu0VarArr[i12].v.d.getPaint().getFontMetricsInt();
                        if (TextUtils.isEmpty(x0Var.f)) {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new c6(x0Var.g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        } else {
                            charSequence = x0Var.f;
                        }
                        formatString = AndroidUtilities.replaceCharSequence("%s", string, charSequence);
                    }
                    nVar.setText(formatString);
                    tu0VarArr[i12].v.f.setVisibility(8);
                    tu0VarArr[i12].v.e(false, true);
                }
            }
        }
        l();
    }

    @Override // s4.h0
    public final int h() {
        return this.f.size() + this.e.size();
    }

    @Override // s4.h0
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

    @Override // s4.h0
    public final int j(int i10) {
        return 23;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        if (i10 < 0) {
            return;
        }
        View view = e1Var.a;
        if (view instanceof org.telegram.ui.Cells.p2) {
            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
            p2Var.s2 = i10 + 1 < h();
            ArrayList arrayList = this.e;
            if (i10 < arrayList.size()) {
                SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
                p2Var.V(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                return;
            }
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f;
            if (size < arrayList2.size()) {
                MessageObject messageObject = (MessageObject) arrayList2.get(size);
                p2Var.V(messageObject.getSavedDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            }
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        ig.z zVar = new ig.z(1, this.c, true);
        aw0 aw0Var = this.G;
        zVar.setDialogCellDelegate(aw0Var);
        zVar.r0 = true;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, zVar, aw0Var.H1);
        return new vl0(zVar);
    }
}
