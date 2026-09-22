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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class wu0 extends xl0 {
    public int E;
    public final /* synthetic */ lv0 G;
    public final Context c;
    public final int d;
    public boolean r;
    public String w;
    public zg.p0 x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public boolean s = false;
    public int v = 0;
    public int y = -1;
    public final yq0 F = new yq0(this, 7);

    public wu0(lv0 lv0Var, Context context) {
        this.G = lv0Var;
        this.c = context;
        this.d = lv0Var.v1.getCurrentAccount();
        C(true);
    }

    @Override // org.telegram.ui.Components.xl0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final void E(zg.p0 p0Var, String str) {
        if (TextUtils.equals(str, this.w)) {
            zg.p0 p0Var2 = this.x;
            if (p0Var2 == null && p0Var == null) {
                return;
            }
            if (p0Var2 != null && p0Var2.equals(p0Var)) {
                return;
            }
        }
        this.w = str;
        this.x = p0Var;
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
            eu0[] eu0VarArr = this.G.k0;
            if (i12 >= eu0VarArr.length) {
                break;
            }
            eu0 eu0Var = eu0VarArr[i12];
            if (eu0Var.F == 11) {
                eu0Var.w.e(true, true);
            }
            i12++;
        }
        if (this.x == null) {
            l();
        }
        yq0 yq0Var = this.F;
        AndroidUtilities.cancelRunOnUIThread(yq0Var);
        AndroidUtilities.runOnUIThread(yq0Var, this.x != null ? 60L : 600L);
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
        zg.p0 p0Var = this.x;
        if (p0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(p0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((MessageObject) hg.k0.g(1, arrayList)).getId();
        }
        tL_messages_search.limit = 10;
        this.s = false;
        int i11 = this.E + 1;
        this.E = i11;
        wm wmVar = new wm(this, i11, tL_messages_search, 15);
        if (this.x != null) {
            MessagesStorage.getInstance(i10).searchSavedByTag(this.x.g(), 0L, this.w, 100, this.n.size(), new ai.k3(1, this, wmVar), false);
        } else {
            wmVar.run();
        }
    }

    public final void G(boolean z10) {
        ArrayList arrayList;
        CharSequence formatString;
        CharSequence charSequence;
        eu0[] eu0VarArr = this.G.k0;
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
            for (int i12 = 0; i12 < eu0VarArr.length; i12++) {
                if (eu0VarArr[i12].F == 11 && arrayList2.isEmpty() && this.e.isEmpty()) {
                    vh.n nVar = eu0VarArr[i12].w.d;
                    if (this.x == null || !TextUtils.isEmpty(this.w)) {
                        formatString = LocaleController.formatString(R.string.NoResultFoundFor, this.w);
                    } else {
                        String string = LocaleController.getString(R.string.NoResultFoundForTag);
                        zg.p0 p0Var = this.x;
                        Paint.FontMetricsInt fontMetricsInt = eu0VarArr[i12].w.d.getPaint().getFontMetricsInt();
                        if (TextUtils.isEmpty(p0Var.f)) {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new y5(p0Var.g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        } else {
                            charSequence = p0Var.f;
                        }
                        formatString = AndroidUtilities.replaceCharSequence("%s", string, charSequence);
                    }
                    nVar.setText(formatString);
                    eu0VarArr[i12].w.f.setVisibility(8);
                    eu0VarArr[i12].w.e(false, true);
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
    public final void v(s4.c1 c1Var, int i10) {
        if (i10 < 0) {
            return;
        }
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.s2) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
            s2Var.s2 = i10 + 1 < h();
            ArrayList arrayList = this.e;
            if (i10 < arrayList.size()) {
                SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
                s2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                return;
            }
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f;
            if (size < arrayList2.size()) {
                MessageObject messageObject = (MessageObject) arrayList2.get(size);
                s2Var.W(messageObject.getSavedDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        gg.a0 a0Var = new gg.a0(1, this.c, true);
        lv0 lv0Var = this.G;
        a0Var.setDialogCellDelegate(lv0Var);
        a0Var.r0 = true;
        a0Var.setBackgroundColor(lv0Var.h0(org.telegram.ui.ActionBar.j6.d6));
        return new il0(a0Var);
    }
}
