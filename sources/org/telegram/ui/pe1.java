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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class pe1 extends org.telegram.ui.Components.c91 implements f10 {
    public final FrameLayout T;
    public final org.telegram.ui.Components.im0 U;
    public final s4.b0 V;
    public final me1 W;
    public m71 a0;
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
    public final org.telegram.ui.Components.rx0 n0;
    public final org.telegram.ui.Components.nl0 o0;
    public boolean p0;
    public final oe1 q0;
    public final mo0 r0;
    public final ArrayList s0;
    public final /* synthetic */ te1 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe1(te1 te1Var, Context context) {
        super(context, null);
        this.t0 = te1Var;
        this.b0 = "empty";
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        this.s0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        this.r0 = new mo0(this, 8);
        org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0(context, null);
        this.U = im0Var;
        me1 me1Var = new me1(this);
        this.W = me1Var;
        im0Var.setAdapter(me1Var);
        s4.b0 b0Var = new s4.b0();
        this.V = b0Var;
        im0Var.setLayoutManager(b0Var);
        im0Var.setOnItemClickListener(new h11(this, 11));
        im0Var.setOnScrollListener(new dd1(this, 1));
        org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context, null);
        b10Var.setViewType(7);
        b10Var.w = false;
        b10Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.rx0 rx0Var = new org.telegram.ui.Components.rx0(context, b10Var, 1, null);
        this.n0 = rx0Var;
        rx0Var.d.setText(LocaleController.getString(R.string.NoResult));
        rx0Var.e.setVisibility(8);
        rx0Var.setVisibility(8);
        rx0Var.addView(b10Var, 0);
        rx0Var.setAnimateLayoutChange(true);
        im0Var.setEmptyView(rx0Var);
        im0Var.W1 = true;
        im0Var.X1 = 0;
        frameLayout.addView(rx0Var);
        frameLayout.addView(im0Var);
        L();
        org.telegram.ui.Components.nl0 nl0Var = new org.telegram.ui.Components.nl0(im0Var, true);
        this.o0 = nl0Var;
        im0Var.setItemsEnterAnimator(nl0Var);
        oe1 oe1Var = new oe1(this);
        this.q0 = oe1Var;
        setAdapter(oe1Var);
    }

    public final void J(String str) {
        int i10;
        if (this.p0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        te1 te1Var = this.t0;
        tL_messages_search.peer = te1Var.getMessagesController().getInputPeer(-te1Var.a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.q = str;
        ArrayList arrayList = this.d0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) i2.d.h(1, arrayList)).getId();
        }
        this.p0 = true;
        i10 = ((org.telegram.ui.ActionBar.n2) te1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new o71(4, this, str));
    }

    public final void K(View view, int i10, String str, boolean z10) {
        this.b0 = str;
        FrameLayout frameLayout = this.T;
        te1 te1Var = this.t0;
        int i11 = 0;
        if (view != frameLayout) {
            if (view instanceof g10) {
                g10 g10Var = (g10) view;
                g10Var.c.b(0, false);
                g10Var.h(-te1Var.a, 0L, 0L, 0L, hg.q0.a3[((le1) this.q0.a.get(i10)).b], false, str, z10);
                return;
            }
            if (view instanceof org.telegram.ui.Components.tn0) {
                org.telegram.ui.Components.tn0 tn0Var = (org.telegram.ui.Components.tn0) view;
                tn0Var.a.b(0, false);
                tn0Var.K = str;
                tn0Var.d(false);
                return;
            }
            return;
        }
        m71 m71Var = this.a0;
        if (m71Var != null) {
            AndroidUtilities.cancelRunOnUIThread(m71Var);
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
            m71 m71Var2 = new m71(13, this, str);
            this.a0 = m71Var2;
            AndroidUtilities.runOnUIThread(m71Var2, 200L);
            return;
        }
        this.l0 = false;
        arrayList.clear();
        while (true) {
            ArrayList arrayList2 = te1Var.b;
            if (i11 >= arrayList2.size()) {
                L();
                return;
            }
            if (((ke1) arrayList2.get(i11)).c != null) {
                arrayList.add(((ke1) arrayList2.get(i11)).c);
                ((ke1) arrayList2.get(i11)).c.searchQuery = null;
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

    @Override // org.telegram.ui.f10
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.t0).actionBar;
        kVar.O(null, null);
    }

    @Override // org.telegram.ui.f10
    public final boolean b(y00 y00Var) {
        if (y00Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.s0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == y00Var.b && messageObject.getDialogId() == y00Var.a) {
                return true;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.f10
    public final void c(MessageObject messageObject) {
        int i10;
        Bundle bundle = new Bundle();
        long dialogId = messageObject.getDialogId();
        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(dialogId);
        te1 te1Var = this.t0;
        if (isEncryptedDialog) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (DialogObject.isUserDialog(dialogId)) {
            bundle.putLong("user_id", dialogId);
        } else {
            i10 = ((org.telegram.ui.ActionBar.n2) te1Var).currentAccount;
            TLRPC.Chat chat = AccountInstance.getInstance(i10).getMessagesController().getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        te1Var.presentFragment(new sn(bundle));
    }

    @Override // org.telegram.ui.f10
    public final void d(MessageObject messageObject, View view, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.s0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.n2) this.t0).actionBar;
            kVar.r();
        }
    }

    @Override // org.telegram.ui.f10
    public final boolean g() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.t0).actionBar;
        return kVar.s();
    }
}
