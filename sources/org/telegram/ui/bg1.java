package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class bg1 extends org.telegram.ui.Components.o91 implements v10 {
    public final FrameLayout T;
    public final org.telegram.ui.Components.qm0 U;
    public final s4.d0 V;
    public final yf1 W;
    public n31 a0;
    public String b0;
    public final ArrayList c0;
    public final ArrayList d0;
    public int e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public boolean l0;
    public boolean m0;
    public final org.telegram.ui.Components.ay0 n0;
    public final org.telegram.ui.Components.vl0 o0;
    public boolean p0;
    public final ag1 q0;
    public final jw0 r0;
    public final ArrayList s0;
    public final /* synthetic */ fg1 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg1(fg1 fg1Var, Context context) {
        super(context, null);
        this.t0 = fg1Var;
        this.b0 = "empty";
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        this.s0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        this.r0 = new jw0(this, 7);
        org.telegram.ui.Components.qm0 qm0Var = new org.telegram.ui.Components.qm0(context, null);
        this.U = qm0Var;
        yf1 yf1Var = new yf1(this);
        this.W = yf1Var;
        qm0Var.setAdapter(yf1Var);
        s4.d0 d0Var = new s4.d0();
        this.V = d0Var;
        qm0Var.setLayoutManager(d0Var);
        qm0Var.setOnItemClickListener(new z21(this, 11));
        qm0Var.setOnScrollListener(new pe1(this, 1));
        org.telegram.ui.Components.j10 j10Var = new org.telegram.ui.Components.j10(context, null);
        j10Var.setViewType(7);
        j10Var.w = false;
        j10Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.ay0 ay0Var = new org.telegram.ui.Components.ay0(context, j10Var, 1, null);
        this.n0 = ay0Var;
        ay0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ay0Var.e.setVisibility(8);
        ay0Var.setVisibility(8);
        ay0Var.addView(j10Var, 0);
        ay0Var.setAnimateLayoutChange(true);
        qm0Var.setEmptyView(ay0Var);
        qm0Var.W1 = true;
        qm0Var.X1 = 0;
        frameLayout.addView(ay0Var);
        frameLayout.addView(qm0Var);
        L();
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(qm0Var, true);
        this.o0 = vl0Var;
        qm0Var.setItemsEnterAnimator(vl0Var);
        ag1 ag1Var = new ag1(this);
        this.q0 = ag1Var;
        setAdapter(ag1Var);
    }

    public final void J(String str) {
        int i10;
        if (this.p0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        fg1 fg1Var = this.t0;
        tL_messages_search.peer = fg1Var.getMessagesController().getInputPeer(-fg1Var.a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.q = str;
        ArrayList arrayList = this.d0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) hg.c.g(1, arrayList)).getId();
        }
        this.p0 = true;
        i10 = ((org.telegram.ui.ActionBar.n2) fg1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new ac0(27, this, str));
    }

    public final void K(View view, int i10, String str, boolean z10) {
        this.b0 = str;
        FrameLayout frameLayout = this.T;
        fg1 fg1Var = this.t0;
        int i11 = 0;
        if (view != frameLayout) {
            if (view instanceof w10) {
                w10 w10Var = (w10) view;
                w10Var.c.b(0, false);
                w10Var.h(-fg1Var.a, 0L, 0L, 0L, gg.r0.a3[((xf1) this.q0.a.get(i10)).b], false, str, z10);
                return;
            }
            if (view instanceof org.telegram.ui.Components.bo0) {
                org.telegram.ui.Components.bo0 bo0Var = (org.telegram.ui.Components.bo0) view;
                bo0Var.a.b(0, false);
                bo0Var.K = str;
                bo0Var.d(false);
                return;
            }
            return;
        }
        n31 n31Var = this.a0;
        if (n31Var != null) {
            AndroidUtilities.cancelRunOnUIThread(n31Var);
            this.a0 = null;
        }
        this.p0 = false;
        this.m0 = false;
        ArrayList arrayList = this.c0;
        arrayList.clear();
        this.d0.clear();
        L();
        if (!TextUtils.isEmpty(str)) {
            L();
            this.l0 = true;
            this.n0.e(true, true);
            n31 n31Var2 = new n31(21, this, str);
            this.a0 = n31Var2;
            AndroidUtilities.runOnUIThread(n31Var2, 200L);
            return;
        }
        this.l0 = false;
        arrayList.clear();
        while (true) {
            ArrayList arrayList2 = fg1Var.b;
            if (i11 >= arrayList2.size()) {
                L();
                return;
            }
            if (((wf1) arrayList2.get(i11)).c != null) {
                arrayList.add(((wf1) arrayList2.get(i11)).c);
                ((wf1) arrayList2.get(i11)).c.searchQuery = null;
            }
            i11++;
        }
    }

    public final void L() {
        this.e0 = -1;
        this.f0 = -1;
        this.g0 = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.k0 = 0;
        ArrayList arrayList = this.c0;
        if (!arrayList.isEmpty()) {
            int i10 = this.k0;
            int i11 = i10 + 1;
            this.k0 = i11;
            this.e0 = i10;
            this.f0 = i11;
            int size = arrayList.size() + i11;
            this.k0 = size;
            this.g0 = size;
        }
        ArrayList arrayList2 = this.d0;
        if (!arrayList2.isEmpty()) {
            int i12 = this.k0;
            int i13 = i12 + 1;
            this.k0 = i13;
            this.h0 = i12;
            this.i0 = i13;
            int size2 = arrayList2.size() + i13;
            this.k0 = size2;
            this.j0 = size2;
        }
        this.W.l();
    }

    @Override // org.telegram.ui.v10
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.t0).actionBar;
        kVar.O(null, null);
    }

    @Override // org.telegram.ui.v10
    public final boolean c(o10 o10Var) {
        if (o10Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.s0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == o10Var.b && messageObject.getDialogId() == o10Var.a) {
                return true;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.v10
    public final void d(MessageObject messageObject) {
        int i10;
        Bundle bundle = new Bundle();
        long dialogId = messageObject.getDialogId();
        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(dialogId);
        fg1 fg1Var = this.t0;
        if (isEncryptedDialog) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (DialogObject.isUserDialog(dialogId)) {
            bundle.putLong("user_id", dialogId);
        } else {
            i10 = ((org.telegram.ui.ActionBar.n2) fg1Var).currentAccount;
            TLRPC.Chat chat = AccountInstance.getInstance(i10).getMessagesController().getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        fg1Var.presentFragment(new zn(bundle));
    }

    @Override // org.telegram.ui.v10
    public final void e(MessageObject messageObject, View view, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.s0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.n2) this.t0).actionBar;
            kVar.s();
        }
    }

    @Override // org.telegram.ui.v10
    public final boolean g() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.t0).actionBar;
        return kVar.t();
    }
}
