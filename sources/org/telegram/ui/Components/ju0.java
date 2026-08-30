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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ju0 extends rl0 {
    public int B;
    public final /* synthetic */ yu0 D;
    public final Context c;
    public final int d;
    public boolean r;
    public String w;
    public mg.q0 x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public boolean s = false;
    public int v = 0;
    public int y = -1;
    public final nq0 C = new nq0(this, 6);

    public ju0(yu0 yu0Var, Context context) {
        this.D = yu0Var;
        this.c = context;
        this.d = yu0Var.s1.getCurrentAccount();
        C(true);
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    public final void E(mg.q0 q0Var, String str) {
        if (TextUtils.equals(str, this.w)) {
            mg.q0 q0Var2 = this.x;
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
            qt0[] qt0VarArr = this.D.h0;
            if (i12 >= qt0VarArr.length) {
                break;
            }
            qt0 qt0Var = qt0VarArr[i12];
            if (qt0Var.C == 11) {
                qt0Var.w.e(true, true);
            }
            i12++;
        }
        if (this.x == null) {
            l();
        }
        nq0 nq0Var = this.C;
        AndroidUtilities.cancelRunOnUIThread(nq0Var);
        AndroidUtilities.runOnUIThread(nq0Var, this.x != null ? 60L : 600L);
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
        mg.q0 q0Var = this.x;
        if (q0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(q0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((MessageObject) kh.a2.i(1, arrayList)).getId();
        }
        tL_messages_search.limit = 10;
        this.s = false;
        int i11 = this.B + 1;
        this.B = i11;
        ey eyVar = new ey(this, i11, tL_messages_search, 13);
        if (this.x != null) {
            MessagesStorage.getInstance(i10).searchSavedByTag(this.x.g(), 0L, this.w, 100, this.n.size(), new nh.b2(1, this, eyVar), false);
        } else {
            eyVar.run();
        }
    }

    public final void G(boolean z4) {
        ArrayList arrayList;
        CharSequence formatString;
        CharSequence charSequence;
        qt0[] qt0VarArr = this.D.h0;
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
        if (!z4 || !arrayList.isEmpty()) {
            for (int i12 = 0; i12 < qt0VarArr.length; i12++) {
                if (qt0VarArr[i12].C == 11 && arrayList2.isEmpty() && this.e.isEmpty()) {
                    ih.s sVar = qt0VarArr[i12].w.d;
                    if (this.x == null || !TextUtils.isEmpty(this.w)) {
                        formatString = LocaleController.formatString(R.string.NoResultFoundFor, this.w);
                    } else {
                        String string = LocaleController.getString(R.string.NoResultFoundForTag);
                        mg.q0 q0Var = this.x;
                        Paint.FontMetricsInt fontMetricsInt = qt0VarArr[i12].w.d.getPaint().getFontMetricsInt();
                        if (TextUtils.isEmpty(q0Var.f)) {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new u5(q0Var.g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        } else {
                            charSequence = q0Var.f;
                        }
                        formatString = AndroidUtilities.replaceCharSequence("%s", string, charSequence);
                    }
                    sVar.setText(formatString);
                    qt0VarArr[i12].w.f.setVisibility(8);
                    qt0VarArr[i12].w.e(false, true);
                }
            }
        }
        l();
    }

    @Override // f2.o0
    public final int h() {
        return this.f.size() + this.e.size();
    }

    @Override // f2.o0
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

    @Override // f2.o0
    public final int j(int i10) {
        return 23;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        if (i10 < 0) {
            return;
        }
        View view = l1Var.a;
        if (view instanceof org.telegram.ui.Cells.r2) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
            r2Var.p2 = i10 + 1 < h();
            ArrayList arrayList = this.e;
            if (i10 < arrayList.size()) {
                SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
                r2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                return;
            }
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f;
            if (size < arrayList2.size()) {
                MessageObject messageObject = (MessageObject) arrayList2.get(size);
                r2Var.W(messageObject.getSavedDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            }
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        iu0 iu0Var = new iu0(0, this.c, true);
        yu0 yu0Var = this.D;
        iu0Var.setDialogCellDelegate(yu0Var);
        iu0Var.o0 = true;
        iu0Var.setBackgroundColor(yu0Var.h0(org.telegram.ui.ActionBar.j6.d6));
        return new el0(iu0Var);
    }
}
