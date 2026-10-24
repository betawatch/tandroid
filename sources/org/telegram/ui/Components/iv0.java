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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class iv0 extends lm0 {
    public int E;
    public final /* synthetic */ xv0 G;
    public final Context c;
    public final int d;
    public boolean r;
    public String w;
    public ah.i1 x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public boolean s = false;
    public int v = 0;
    public int y = -1;
    public final kr0 F = new kr0(this, 7);

    public iv0(xv0 xv0Var, Context context) {
        this.G = xv0Var;
        this.c = context;
        this.d = xv0Var.v1.getCurrentAccount();
        C(true);
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    public final void E(ah.i1 i1Var, String str) {
        if (TextUtils.equals(str, this.w)) {
            ah.i1 i1Var2 = this.x;
            if (i1Var2 == null && i1Var == null) {
                return;
            }
            if (i1Var2 != null && i1Var2.equals(i1Var)) {
                return;
            }
        }
        this.w = str;
        this.x = i1Var;
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
            qu0[] qu0VarArr = this.G.k0;
            if (i12 >= qu0VarArr.length) {
                break;
            }
            qu0 qu0Var = qu0VarArr[i12];
            if (qu0Var.F == 11) {
                qu0Var.w.e(true, true);
            }
            i12++;
        }
        if (this.x == null) {
            l();
        }
        kr0 kr0Var = this.F;
        AndroidUtilities.cancelRunOnUIThread(kr0Var);
        AndroidUtilities.runOnUIThread(kr0Var, this.x != null ? 60L : 600L);
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
        ah.i1 i1Var = this.x;
        if (i1Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(i1Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((MessageObject) i2.o1.i(1, arrayList)).getId();
        }
        tL_messages_search.limit = 10;
        this.s = false;
        int i11 = this.E + 1;
        this.E = i11;
        org.telegram.ui.h4 h4Var = new org.telegram.ui.h4(this, i11, tL_messages_search, 21);
        if (this.x != null) {
            MessagesStorage.getInstance(i10).searchSavedByTag(this.x.g(), 0L, this.w, 100, this.n.size(), new ci.h2(1, this, h4Var), false);
        } else {
            h4Var.run();
        }
    }

    public final void G(boolean z10) {
        ArrayList arrayList;
        CharSequence formatString;
        CharSequence charSequence;
        qu0[] qu0VarArr = this.G.k0;
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
            for (int i12 = 0; i12 < qu0VarArr.length; i12++) {
                if (qu0VarArr[i12].F == 11 && arrayList2.isEmpty() && this.e.isEmpty()) {
                    wh.n nVar = qu0VarArr[i12].w.d;
                    if (this.x == null || !TextUtils.isEmpty(this.w)) {
                        formatString = LocaleController.formatString(R.string.NoResultFoundFor, this.w);
                    } else {
                        String string = LocaleController.getString(R.string.NoResultFoundForTag);
                        ah.i1 i1Var = this.x;
                        Paint.FontMetricsInt fontMetricsInt = qu0VarArr[i12].w.d.getPaint().getFontMetricsInt();
                        if (TextUtils.isEmpty(i1Var.f)) {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new a6(i1Var.g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        } else {
                            charSequence = i1Var.f;
                        }
                        formatString = AndroidUtilities.replaceCharSequence("%s", string, charSequence);
                    }
                    nVar.setText(formatString);
                    qu0VarArr[i12].w.f.setVisibility(8);
                    qu0VarArr[i12].w.e(false, true);
                }
            }
        }
        l();
    }

    @Override // s4.g0
    public final int h() {
        return this.f.size() + this.e.size();
    }

    @Override // s4.g0
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

    @Override // s4.g0
    public final int j(int i10) {
        return 23;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        if (i10 < 0) {
            return;
        }
        View view = b1Var.a;
        if (view instanceof org.telegram.ui.Cells.q2) {
            org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view;
            q2Var.s2 = i10 + 1 < h();
            ArrayList arrayList = this.e;
            if (i10 < arrayList.size()) {
                SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
                q2Var.V(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                return;
            }
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f;
            if (size < arrayList2.size()) {
                MessageObject messageObject = (MessageObject) arrayList2.get(size);
                q2Var.V(messageObject.getSavedDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            }
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        hg.z zVar = new hg.z(1, this.c, true);
        xv0 xv0Var = this.G;
        zVar.setDialogCellDelegate(xv0Var);
        zVar.r0 = true;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, zVar, xv0Var.F1);
        return new wl0(zVar);
    }
}
