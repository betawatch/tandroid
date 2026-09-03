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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class of1 extends org.telegram.ui.Components.l81 implements s10 {
    public final FrameLayout Q;
    public final org.telegram.ui.Components.sl0 R;
    public final f2.j0 S;
    public final lf1 T;
    public h21 U;
    public String V;
    public final ArrayList W;
    public final ArrayList a0;
    public int b0;
    public int c0;
    public int d0;
    public int e0;
    public int f0;
    public int g0;
    public int h0;
    public boolean i0;
    public boolean j0;
    public final org.telegram.ui.Components.zw0 k0;
    public final org.telegram.ui.Components.zk0 l0;
    public boolean m0;
    public final nf1 n0;
    public final vv0 o0;
    public final ArrayList p0;
    public final /* synthetic */ sf1 q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of1(sf1 sf1Var, Context context) {
        super(context, null);
        this.q0 = sf1Var;
        this.V = "empty";
        this.W = new ArrayList();
        this.a0 = new ArrayList();
        this.p0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.Q = frameLayout;
        this.o0 = new vv0(this, 7);
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.R = sl0Var;
        lf1 lf1Var = new lf1(this);
        this.T = lf1Var;
        sl0Var.setAdapter(lf1Var);
        f2.j0 j0Var = new f2.j0();
        this.S = j0Var;
        sl0Var.setLayoutManager(j0Var);
        sl0Var.setOnItemClickListener(new p21(this, 10));
        sl0Var.setOnScrollListener(new ce1(this, 1));
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
        u00Var.setViewType(7);
        u00Var.w = false;
        u00Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.zw0 zw0Var = new org.telegram.ui.Components.zw0(context, u00Var, 1, null);
        this.k0 = zw0Var;
        zw0Var.d.setText(LocaleController.getString(R.string.NoResult));
        zw0Var.e.setVisibility(8);
        zw0Var.setVisibility(8);
        zw0Var.addView(u00Var, 0);
        zw0Var.setAnimateLayoutChange(true);
        sl0Var.setEmptyView(zw0Var);
        sl0Var.V1 = true;
        sl0Var.W1 = 0;
        frameLayout.addView(zw0Var);
        frameLayout.addView(sl0Var);
        L();
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(sl0Var, true);
        this.l0 = zk0Var;
        sl0Var.setItemsEnterAnimator(zk0Var);
        nf1 nf1Var = new nf1(this);
        this.n0 = nf1Var;
        setAdapter(nf1Var);
    }

    public final void J(String str) {
        int i10;
        if (this.m0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        sf1 sf1Var = this.q0;
        tL_messages_search.peer = sf1Var.getMessagesController().getInputPeer(-sf1Var.a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.q = str;
        ArrayList arrayList = this.a0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) l.d.i(1, arrayList)).getId();
        }
        this.m0 = true;
        i10 = ((org.telegram.ui.ActionBar.p2) sf1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new tb0(27, this, str));
    }

    public final void K(View view, int i10, String str, boolean z4) {
        this.V = str;
        FrameLayout frameLayout = this.Q;
        sf1 sf1Var = this.q0;
        int i11 = 0;
        if (view != frameLayout) {
            if (view instanceof t10) {
                t10 t10Var = (t10) view;
                t10Var.c.b(0, false);
                t10Var.h(-sf1Var.a, 0L, 0L, 0L, uf.g0.Z2[((kf1) this.n0.a.get(i10)).b], false, str, z4);
                return;
            }
            if (view instanceof org.telegram.ui.Components.dn0) {
                org.telegram.ui.Components.dn0 dn0Var = (org.telegram.ui.Components.dn0) view;
                dn0Var.a.b(0, false);
                dn0Var.H = str;
                dn0Var.d(false);
                return;
            }
            return;
        }
        h21 h21Var = this.U;
        if (h21Var != null) {
            AndroidUtilities.cancelRunOnUIThread(h21Var);
            this.U = null;
        }
        this.m0 = false;
        this.j0 = false;
        ArrayList arrayList = this.W;
        arrayList.clear();
        this.a0.clear();
        L();
        if (!TextUtils.isEmpty(str)) {
            L();
            this.i0 = true;
            this.k0.e(true, true);
            h21 h21Var2 = new h21(23, this, str);
            this.U = h21Var2;
            AndroidUtilities.runOnUIThread(h21Var2, 200L);
            return;
        }
        this.i0 = false;
        arrayList.clear();
        while (true) {
            ArrayList arrayList2 = sf1Var.b;
            if (i11 >= arrayList2.size()) {
                L();
                return;
            }
            if (((jf1) arrayList2.get(i11)).c != null) {
                arrayList.add(((jf1) arrayList2.get(i11)).c);
                ((jf1) arrayList2.get(i11)).c.searchQuery = null;
            }
            i11++;
        }
    }

    public final void L() {
        this.b0 = -1;
        this.c0 = -1;
        this.d0 = -1;
        this.e0 = -1;
        this.f0 = -1;
        this.g0 = -1;
        this.h0 = 0;
        ArrayList arrayList = this.W;
        if (!arrayList.isEmpty()) {
            int i10 = this.h0;
            int i11 = i10 + 1;
            this.h0 = i11;
            this.b0 = i10;
            this.c0 = i11;
            int size = arrayList.size() + i11;
            this.h0 = size;
            this.d0 = size;
        }
        ArrayList arrayList2 = this.a0;
        if (!arrayList2.isEmpty()) {
            int i12 = this.h0;
            int i13 = i12 + 1;
            this.h0 = i13;
            this.e0 = i12;
            this.f0 = i13;
            int size2 = arrayList2.size() + i13;
            this.h0 = size2;
            this.g0 = size2;
        }
        this.T.l();
    }

    @Override // org.telegram.ui.s10
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.p2) this.q0).actionBar;
        kVar.O(null, null);
    }

    @Override // org.telegram.ui.s10
    public final boolean b(l10 l10Var) {
        if (l10Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.p0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == l10Var.b && messageObject.getDialogId() == l10Var.a) {
                return true;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.s10
    public final void c(MessageObject messageObject) {
        int i10;
        Bundle bundle = new Bundle();
        long dialogId = messageObject.getDialogId();
        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(dialogId);
        sf1 sf1Var = this.q0;
        if (isEncryptedDialog) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (DialogObject.isUserDialog(dialogId)) {
            bundle.putLong("user_id", dialogId);
        } else {
            i10 = ((org.telegram.ui.ActionBar.p2) sf1Var).currentAccount;
            TLRPC.Chat chat = AccountInstance.getInstance(i10).getMessagesController().getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        sf1Var.presentFragment(new xn(bundle));
    }

    @Override // org.telegram.ui.s10
    public final void d(MessageObject messageObject, View view, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.p0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.p2) this.q0).actionBar;
            kVar.r();
        }
    }

    @Override // org.telegram.ui.s10
    public final boolean f() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.p2) this.q0).actionBar;
        return kVar.s();
    }
}
