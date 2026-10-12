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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class hg1 extends org.telegram.ui.Components.k91 implements b20 {
    public final FrameLayout T;
    public final org.telegram.ui.Components.mm0 U;
    public final s4.b0 V;
    public final eg1 W;
    public je1 a0;
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
    public final org.telegram.ui.Components.wx0 n0;
    public final org.telegram.ui.Components.rl0 o0;
    public boolean p0;
    public final gg1 q0;
    public final pw0 r0;
    public final ArrayList s0;
    public final /* synthetic */ lg1 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg1(lg1 lg1Var, Context context) {
        super(context, null);
        this.t0 = lg1Var;
        this.b0 = "empty";
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        this.s0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        this.r0 = new pw0(this, 7);
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.U = mm0Var;
        eg1 eg1Var = new eg1(this);
        this.W = eg1Var;
        mm0Var.setAdapter(eg1Var);
        s4.b0 b0Var = new s4.b0();
        this.V = b0Var;
        mm0Var.setLayoutManager(b0Var);
        mm0Var.setOnItemClickListener(new i21(this, 12));
        mm0Var.setOnScrollListener(new ve1(this, 1));
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, null);
        f10Var.setViewType(7);
        f10Var.w = false;
        f10Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.wx0 wx0Var = new org.telegram.ui.Components.wx0(context, f10Var, 1, null);
        this.n0 = wx0Var;
        wx0Var.d.setText(LocaleController.getString(R.string.NoResult));
        wx0Var.e.setVisibility(8);
        wx0Var.setVisibility(8);
        wx0Var.addView(f10Var, 0);
        wx0Var.setAnimateLayoutChange(true);
        mm0Var.setEmptyView(wx0Var);
        mm0Var.W1 = true;
        mm0Var.X1 = 0;
        frameLayout.addView(wx0Var);
        frameLayout.addView(mm0Var);
        L();
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(mm0Var, true);
        this.o0 = rl0Var;
        mm0Var.setItemsEnterAnimator(rl0Var);
        gg1 gg1Var = new gg1(this);
        this.q0 = gg1Var;
        setAdapter(gg1Var);
    }

    public final void J(String str) {
        int i10;
        if (this.p0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        lg1 lg1Var = this.t0;
        tL_messages_search.peer = lg1Var.getMessagesController().getInputPeer(-lg1Var.a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.q = str;
        ArrayList arrayList = this.d0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) i2.d.g(1, arrayList)).getId();
        }
        this.p0 = true;
        i10 = ((org.telegram.ui.ActionBar.m2) lg1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new fc0(27, this, str));
    }

    public final void K(View view, int i10, String str, boolean z10) {
        this.b0 = str;
        FrameLayout frameLayout = this.T;
        lg1 lg1Var = this.t0;
        int i11 = 0;
        if (view != frameLayout) {
            if (view instanceof c20) {
                c20 c20Var = (c20) view;
                c20Var.c.b(0, false);
                c20Var.h(-lg1Var.a, 0L, 0L, 0L, hg.r0.a3[((dg1) this.q0.a.get(i10)).b], false, str, z10);
                return;
            }
            if (view instanceof org.telegram.ui.Components.yn0) {
                org.telegram.ui.Components.yn0 yn0Var = (org.telegram.ui.Components.yn0) view;
                yn0Var.a.b(0, false);
                yn0Var.K = str;
                yn0Var.d(false);
                return;
            }
            return;
        }
        je1 je1Var = this.a0;
        if (je1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(je1Var);
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
            je1 je1Var2 = new je1(2, this, str);
            this.a0 = je1Var2;
            AndroidUtilities.runOnUIThread(je1Var2, 200L);
            return;
        }
        this.l0 = false;
        arrayList.clear();
        while (true) {
            ArrayList arrayList2 = lg1Var.b;
            if (i11 >= arrayList2.size()) {
                L();
                return;
            }
            if (((cg1) arrayList2.get(i11)).c != null) {
                arrayList.add(((cg1) arrayList2.get(i11)).c);
                ((cg1) arrayList2.get(i11)).c.searchQuery = null;
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

    @Override // org.telegram.ui.b20
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.m2) this.t0).actionBar;
        kVar.O(null, null);
    }

    @Override // org.telegram.ui.b20
    public final boolean b(u10 u10Var) {
        if (u10Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.s0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == u10Var.b && messageObject.getDialogId() == u10Var.a) {
                return true;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.b20
    public final void c(MessageObject messageObject) {
        int i10;
        Bundle bundle = new Bundle();
        long dialogId = messageObject.getDialogId();
        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(dialogId);
        lg1 lg1Var = this.t0;
        if (isEncryptedDialog) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (DialogObject.isUserDialog(dialogId)) {
            bundle.putLong("user_id", dialogId);
        } else {
            i10 = ((org.telegram.ui.ActionBar.m2) lg1Var).currentAccount;
            TLRPC.Chat chat = AccountInstance.getInstance(i10).getMessagesController().getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        lg1Var.presentFragment(new fo(bundle));
    }

    @Override // org.telegram.ui.b20
    public final void d(MessageObject messageObject, View view, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.s0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.m2) this.t0).actionBar;
            kVar.s();
        }
    }

    @Override // org.telegram.ui.b20
    public final boolean g() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.m2) this.t0).actionBar;
        return kVar.t();
    }
}
