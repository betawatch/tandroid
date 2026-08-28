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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pt0 extends vk0 {
    public int A;
    public final /* synthetic */ eu0 C;
    public final Context c;
    public final int d;
    public boolean r;
    public String w;
    public hg.r0 x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public boolean s = false;
    public int v = 0;
    public int y = -1;
    public final tp0 B = new tp0(this, 6);

    public pt0(eu0 eu0Var, Context context) {
        this.C = eu0Var;
        this.c = context;
        this.d = eu0Var.r1.getCurrentAccount();
        C(true);
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    public final void E(hg.r0 r0Var, String str) {
        if (TextUtils.equals(str, this.w)) {
            hg.r0 r0Var2 = this.x;
            if (r0Var2 == null && r0Var == null) {
                return;
            }
            if (r0Var2 != null && r0Var2.equals(r0Var)) {
                return;
            }
        }
        this.w = str;
        this.x = r0Var;
        int i9 = this.y;
        int i10 = this.d;
        if (i9 >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.y, true);
            this.y = -1;
        }
        this.n.clear();
        this.h.clear();
        this.f.clear();
        int i11 = 0;
        this.v = 0;
        this.s = false;
        this.r = true;
        ArrayList arrayList = this.e;
        arrayList.clear();
        if (this.x == null) {
            arrayList.addAll(MessagesController.getInstance(i10).getSavedMessagesController().searchDialogs(str));
        }
        while (true) {
            xs0[] xs0VarArr = this.C.g0;
            if (i11 >= xs0VarArr.length) {
                break;
            }
            xs0 xs0Var = xs0VarArr[i11];
            if (xs0Var.B == 11) {
                xs0Var.w.e(true, true);
            }
            i11++;
        }
        if (this.x == null) {
            l();
        }
        tp0 tp0Var = this.B;
        AndroidUtilities.cancelRunOnUIThread(tp0Var);
        AndroidUtilities.runOnUIThread(tp0Var, this.x != null ? 60L : 600L);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.w) && this.x == null) {
            this.r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i9 = this.d;
        tL_messages_search.peer = MessagesController.getInstance(i9).getInputPeer(UserConfig.getInstance(i9).getClientUserId());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.q = this.w;
        hg.r0 r0Var = this.x;
        if (r0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(r0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((MessageObject) j3.r0.j(1, arrayList)).getId();
        }
        tL_messages_search.limit = 10;
        this.s = false;
        int i10 = this.A + 1;
        this.A = i10;
        org.telegram.ui.rl rlVar = new org.telegram.ui.rl(this, i10, tL_messages_search, 16);
        if (this.x != null) {
            MessagesStorage.getInstance(i9).searchSavedByTag(this.x.g(), 0L, this.w, 100, this.n.size(), new ih.c2(1, this, rlVar), false);
        } else {
            rlVar.run();
        }
    }

    public final void G(boolean z10) {
        ArrayList arrayList;
        CharSequence formatString;
        CharSequence charSequence;
        xs0[] xs0VarArr = this.C.g0;
        ArrayList arrayList2 = this.f;
        arrayList2.clear();
        HashSet hashSet = new HashSet();
        int i9 = 0;
        while (true) {
            ArrayList arrayList3 = this.h;
            if (i9 >= arrayList3.size()) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList3.get(i9);
            if (messageObject != null && !hashSet.contains(Integer.valueOf(messageObject.getId()))) {
                hashSet.add(Integer.valueOf(messageObject.getId()));
                arrayList2.add(messageObject);
            }
            i9++;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.n;
            if (i10 >= arrayList.size()) {
                break;
            }
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10);
            if (messageObject2 != null && !hashSet.contains(Integer.valueOf(messageObject2.getId()))) {
                hashSet.add(Integer.valueOf(messageObject2.getId()));
                arrayList2.add(messageObject2);
            }
            i10++;
        }
        if (!z10 || !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < xs0VarArr.length; i11++) {
                if (xs0VarArr[i11].B == 11 && arrayList2.isEmpty() && this.e.isEmpty()) {
                    dh.u uVar = xs0VarArr[i11].w.d;
                    if (this.x == null || !TextUtils.isEmpty(this.w)) {
                        formatString = LocaleController.formatString(R.string.NoResultFoundFor, this.w);
                    } else {
                        String string = LocaleController.getString(R.string.NoResultFoundForTag);
                        hg.r0 r0Var = this.x;
                        Paint.FontMetricsInt fontMetricsInt = xs0VarArr[i11].w.d.getPaint().getFontMetricsInt();
                        if (TextUtils.isEmpty(r0Var.f)) {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new t5(r0Var.g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        } else {
                            charSequence = r0Var.f;
                        }
                        formatString = AndroidUtilities.replaceCharSequence("%s", string, charSequence);
                    }
                    uVar.setText(formatString);
                    xs0VarArr[i11].w.f.setVisibility(8);
                    xs0VarArr[i11].w.e(false, true);
                }
            }
        }
        l();
    }

    @Override // f2.r0
    public final int h() {
        return this.f.size() + this.e.size();
    }

    @Override // f2.r0
    public final long i(int i9) {
        int hash;
        if (i9 < 0) {
            return i9;
        }
        ArrayList arrayList = this.e;
        if (i9 < arrayList.size()) {
            hash = Objects.hash(1, Long.valueOf(((SavedMessagesController.SavedDialog) arrayList.get(i9)).dialogId));
        } else {
            int size = i9 - arrayList.size();
            ArrayList arrayList2 = this.f;
            if (size >= arrayList2.size()) {
                return size;
            }
            hash = Objects.hash(2, Long.valueOf(((MessageObject) arrayList2.get(size)).getSavedDialogId()), Integer.valueOf(((MessageObject) arrayList2.get(size)).getId()));
        }
        return hash;
    }

    @Override // f2.r0
    public final int j(int i9) {
        return 23;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        if (i9 < 0) {
            return;
        }
        View view = q1Var.a;
        if (view instanceof org.telegram.ui.Cells.r2) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
            r2Var.o2 = i9 + 1 < h();
            ArrayList arrayList = this.e;
            if (i9 < arrayList.size()) {
                SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i9);
                r2Var.V(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                return;
            }
            int size = i9 - arrayList.size();
            ArrayList arrayList2 = this.f;
            if (size < arrayList2.size()) {
                MessageObject messageObject = (MessageObject) arrayList2.get(size);
                r2Var.V(messageObject.getSavedDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            }
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        of.x xVar = new of.x(1, this.c, true);
        eu0 eu0Var = this.C;
        xVar.setDialogCellDelegate(eu0Var);
        xVar.n0 = true;
        xVar.setBackgroundColor(eu0Var.h0(org.telegram.ui.ActionBar.f6.d6));
        return new ik0(xVar);
    }
}
