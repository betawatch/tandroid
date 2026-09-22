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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class bg1 extends org.telegram.ui.Components.z81 implements w10 {
    public final FrameLayout U;
    public final org.telegram.ui.Components.yl0 V;
    public final s4.c0 W;
    public final yf1 a0;
    public w81 b0;
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
    public final org.telegram.ui.Components.lx0 o0;
    public final org.telegram.ui.Components.dl0 p0;
    public boolean q0;
    public final ag1 r0;
    public final jw0 s0;
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
        this.s0 = new jw0(this, 7);
        org.telegram.ui.Components.yl0 yl0Var = new org.telegram.ui.Components.yl0(context, null);
        this.V = yl0Var;
        yf1 yf1Var = new yf1(this);
        this.a0 = yf1Var;
        yl0Var.setAdapter(yf1Var);
        s4.c0 c0Var = new s4.c0();
        this.W = c0Var;
        yl0Var.setLayoutManager(c0Var);
        yl0Var.setOnItemClickListener(new a31(this, 11));
        yl0Var.setOnScrollListener(new pe1(this, 1));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
        t00Var.setViewType(7);
        t00Var.w = false;
        t00Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.lx0 lx0Var = new org.telegram.ui.Components.lx0(context, t00Var, 1, null);
        this.o0 = lx0Var;
        lx0Var.d.setText(LocaleController.getString(R.string.NoResult));
        lx0Var.e.setVisibility(8);
        lx0Var.setVisibility(8);
        lx0Var.addView(t00Var, 0);
        lx0Var.setAnimateLayoutChange(true);
        yl0Var.setEmptyView(lx0Var);
        yl0Var.Y1 = true;
        yl0Var.Z1 = 0;
        frameLayout.addView(lx0Var);
        frameLayout.addView(yl0Var);
        M();
        org.telegram.ui.Components.dl0 dl0Var = new org.telegram.ui.Components.dl0(yl0Var, true);
        this.p0 = dl0Var;
        yl0Var.setItemsEnterAnimator(dl0Var);
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
            tL_messages_search.offset_id = ((MessageObject) hg.k0.g(1, arrayList)).getId();
        }
        this.q0 = true;
        i10 = ((org.telegram.ui.ActionBar.n2) fg1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new dc0(27, this, str));
    }

    public final void L(View view, int i10, String str, boolean z10) {
        this.c0 = str;
        FrameLayout frameLayout = this.U;
        fg1 fg1Var = this.u0;
        int i11 = 0;
        if (view != frameLayout) {
            if (view instanceof x10) {
                x10 x10Var = (x10) view;
                x10Var.c.b(0, false);
                x10Var.h(-fg1Var.a, 0L, 0L, 0L, gg.s0.c3[((xf1) this.r0.a.get(i10)).b], false, str, z10);
                return;
            }
            if (view instanceof org.telegram.ui.Components.kn0) {
                org.telegram.ui.Components.kn0 kn0Var = (org.telegram.ui.Components.kn0) view;
                kn0Var.a.b(0, false);
                kn0Var.K = str;
                kn0Var.d(false);
                return;
            }
            return;
        }
        w81 w81Var = this.b0;
        if (w81Var != null) {
            AndroidUtilities.cancelRunOnUIThread(w81Var);
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
            w81 w81Var2 = new w81(13, this, str);
            this.b0 = w81Var2;
            AndroidUtilities.runOnUIThread(w81Var2, 200L);
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

    @Override // org.telegram.ui.w10
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.u0).actionBar;
        kVar.O(null, null);
    }

    @Override // org.telegram.ui.w10
    public final boolean c(p10 p10Var) {
        if (p10Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.t0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == p10Var.b && messageObject.getDialogId() == p10Var.a) {
                return true;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.w10
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

    @Override // org.telegram.ui.w10
    public final void e(MessageObject messageObject, View view, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.t0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.n2) this.u0).actionBar;
            kVar.r();
        }
    }

    @Override // org.telegram.ui.w10
    public final boolean g() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.u0).actionBar;
        return kVar.s();
    }
}
