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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class bg1 extends org.telegram.ui.Components.j81 implements y10 {
    public final FrameLayout U;
    public final org.telegram.ui.Components.ml0 V;
    public final s4.c0 W;
    public final yf1 a0;
    public qb1 b0;
    public String c0;
    public final ArrayList d0;
    public final ArrayList e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public boolean m0;
    public boolean n0;
    public final org.telegram.ui.Components.zw0 o0;
    public final org.telegram.ui.Components.rk0 p0;
    public boolean q0;
    public final ag1 r0;
    public final lw0 s0;
    public final ArrayList t0;
    public final /* synthetic */ fg1 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg1(fg1 fg1Var, Context context) {
        super(context, null);
        this.u0 = fg1Var;
        this.c0 = "empty";
        this.d0 = new ArrayList();
        this.e0 = new ArrayList();
        this.t0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        this.s0 = new lw0(this, 7);
        org.telegram.ui.Components.ml0 ml0Var = new org.telegram.ui.Components.ml0(context, null);
        this.V = ml0Var;
        yf1 yf1Var = new yf1(this);
        this.a0 = yf1Var;
        ml0Var.setAdapter(yf1Var);
        s4.c0 c0Var = new s4.c0();
        this.W = c0Var;
        ml0Var.setLayoutManager(c0Var);
        ml0Var.setOnItemClickListener(new b31(this, 10));
        ml0Var.setOnScrollListener(new pe1(this, 1));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
        t00Var.setViewType(7);
        t00Var.w = false;
        t00Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.zw0 zw0Var = new org.telegram.ui.Components.zw0(context, t00Var, 1, null);
        this.o0 = zw0Var;
        zw0Var.d.setText(LocaleController.getString(R.string.NoResult));
        zw0Var.e.setVisibility(8);
        zw0Var.setVisibility(8);
        zw0Var.addView(t00Var, 0);
        zw0Var.setAnimateLayoutChange(true);
        ml0Var.setEmptyView(zw0Var);
        ml0Var.Y1 = true;
        ml0Var.Z1 = 0;
        frameLayout.addView(zw0Var);
        frameLayout.addView(ml0Var);
        M();
        org.telegram.ui.Components.rk0 rk0Var = new org.telegram.ui.Components.rk0(ml0Var, true);
        this.p0 = rk0Var;
        ml0Var.setItemsEnterAnimator(rk0Var);
        ag1 ag1Var = new ag1(this);
        this.r0 = ag1Var;
        setAdapter(ag1Var);
    }

    public final void K(String str) {
        int i10;
        if (this.q0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        fg1 fg1Var = this.u0;
        tL_messages_search.peer = fg1Var.getMessagesController().getInputPeer(-fg1Var.a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.q = str;
        ArrayList arrayList = this.e0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) hg.k0.h(1, arrayList)).getId();
        }
        this.q0 = true;
        i10 = ((org.telegram.ui.ActionBar.o2) fg1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new dc0(27, this, str));
    }

    public final void L(View view, int i10, String str, boolean z10) {
        this.c0 = str;
        FrameLayout frameLayout = this.U;
        fg1 fg1Var = this.u0;
        int i11 = 0;
        if (view != frameLayout) {
            if (view instanceof z10) {
                z10 z10Var = (z10) view;
                z10Var.c.b(0, false);
                z10Var.h(-fg1Var.a, 0L, 0L, 0L, gg.s0.c3[((xf1) this.r0.a.get(i10)).b], false, str, z10);
                return;
            }
            if (view instanceof org.telegram.ui.Components.wm0) {
                org.telegram.ui.Components.wm0 wm0Var = (org.telegram.ui.Components.wm0) view;
                wm0Var.a.b(0, false);
                wm0Var.K = str;
                wm0Var.d(false);
                return;
            }
            return;
        }
        qb1 qb1Var = this.b0;
        if (qb1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(qb1Var);
            this.b0 = null;
        }
        this.q0 = false;
        this.n0 = false;
        ArrayList arrayList = this.d0;
        arrayList.clear();
        this.e0.clear();
        M();
        if (!TextUtils.isEmpty(str)) {
            M();
            this.m0 = true;
            this.o0.e(true, true);
            qb1 qb1Var2 = new qb1(7, this, str);
            this.b0 = qb1Var2;
            AndroidUtilities.runOnUIThread(qb1Var2, 200L);
            return;
        }
        this.m0 = false;
        arrayList.clear();
        while (true) {
            ArrayList arrayList2 = fg1Var.b;
            if (i11 >= arrayList2.size()) {
                M();
                return;
            }
            if (((wf1) arrayList2.get(i11)).c != null) {
                arrayList.add(((wf1) arrayList2.get(i11)).c);
                ((wf1) arrayList2.get(i11)).c.searchQuery = null;
            }
            i11++;
        }
    }

    public final void M() {
        this.f0 = -1;
        this.g0 = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.l0 = 0;
        ArrayList arrayList = this.d0;
        if (!arrayList.isEmpty()) {
            int i10 = this.l0;
            int i11 = i10 + 1;
            this.l0 = i11;
            this.f0 = i10;
            this.g0 = i11;
            int size = arrayList.size() + i11;
            this.l0 = size;
            this.h0 = size;
        }
        ArrayList arrayList2 = this.e0;
        if (!arrayList2.isEmpty()) {
            int i12 = this.l0;
            int i13 = i12 + 1;
            this.l0 = i13;
            this.i0 = i12;
            this.j0 = i13;
            int size2 = arrayList2.size() + i13;
            this.l0 = size2;
            this.k0 = size2;
        }
        this.a0.l();
    }

    @Override // org.telegram.ui.y10
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.o2) this.u0).actionBar;
        kVar.O(null, null);
    }

    @Override // org.telegram.ui.y10
    public final boolean c(r10 r10Var) {
        if (r10Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.t0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == r10Var.b && messageObject.getDialogId() == r10Var.a) {
                return true;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.y10
    public final void d(MessageObject messageObject) {
        int i10;
        Bundle bundle = new Bundle();
        long dialogId = messageObject.getDialogId();
        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(dialogId);
        fg1 fg1Var = this.u0;
        if (isEncryptedDialog) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (DialogObject.isUserDialog(dialogId)) {
            bundle.putLong("user_id", dialogId);
        } else {
            i10 = ((org.telegram.ui.ActionBar.o2) fg1Var).currentAccount;
            TLRPC.Chat chat = AccountInstance.getInstance(i10).getMessagesController().getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        fg1Var.presentFragment(new bo(bundle));
    }

    @Override // org.telegram.ui.y10
    public final void e(MessageObject messageObject, View view, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.t0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.o2) this.u0).actionBar;
            kVar.r();
        }
    }

    @Override // org.telegram.ui.y10
    public final boolean g() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.o2) this.u0).actionBar;
        return kVar.s();
    }
}
