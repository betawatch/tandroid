package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class is0 extends org.telegram.ui.ActionBar.g2 {
    public final long a;
    public org.telegram.ui.Cells.u7 b;
    public org.telegram.ui.Components.g80 c;
    public org.telegram.ui.Components.h51 d;
    public org.telegram.ui.ActionBar.c5 e;
    public final boolean f;
    public final long h;
    public boolean n;
    public long r;
    public ln s;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is0(long j3) {
        super(null);
        TLRPC.Chat chat = null;
        this.w = true;
        this.a = j3;
        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(j3));
        if (O0 != null && O0.linked_monoforum_id != 0) {
            chat = getMessagesController().O0(Long.valueOf(O0.linked_monoforum_id));
        }
        long j10 = chat != null ? chat.send_paid_messages_stars : 0L;
        boolean z10 = O0 != null && O0.broadcast_messages_allowed;
        this.f = z10;
        long k10 = Utilities.k(z10 ? j10 : ((org.telegram.messenger.j0) getMessagesController().A7.b.b).c, getMessagesController().L6, 0L);
        this.h = k10;
        this.n = z10;
        this.r = k10;
    }

    public static /* synthetic */ void Z(is0 is0Var, TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
        if (tL_error != null) {
            is0Var.e.b(false);
            org.telegram.ui.Components.lc.e0(tL_error);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        is0Var.getMessagesController().Z3(updates.chats, false);
        is0Var.getMessagesController().V3(updates, false);
        if (is0Var.isFinished || is0Var.finishing) {
            return;
        }
        ln lnVar = is0Var.s;
        if (lnVar != null) {
            lnVar.run(updatepaidmessagesprice.suggestions_allowed ? updatepaidmessagesprice.send_paid_messages_stars : -1L);
        }
        is0Var.finishFragment();
    }

    public final void a0(boolean z10) {
        boolean c02;
        if (this.e == null || this.w == (c02 = c0())) {
            return;
        }
        this.w = c02;
        this.e.a(c02, z10);
    }

    public final String b0() {
        return org.telegram.messenger.hd.a0(null, null, 2131746879, ki.j.J0(getMessagesController().M6), String.valueOf(((int) (((this.r * (r0 / 1000.0f)) / 1000.0d) * getMessagesController().f6)) / 100.0d));
    }

    public final boolean c0() {
        return (this.r == this.h && this.n == this.f) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131746902, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new hs0(this, 0));
        this.e = this.simpleActionBar.s(org.telegram.messenger.hd.N0(2131745750, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.a7, frameLayout, null);
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Cells.u7 u7Var = new org.telegram.ui.Cells.u7(context, this.resourceProvider);
        this.b = u7Var;
        int i7 = org.telegram.ui.ActionBar.m6.d6;
        org.telegram.ui.ActionBar.t6.h(i7, u7Var, getResourceProvider());
        org.telegram.ui.Components.g80 g80Var = new org.telegram.ui.Components.g80(context, this, null, true, true);
        this.c = g80Var;
        g80Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), 0);
        org.telegram.ui.ActionBar.t6.h(i7, this.c, getResourceProvider());
        this.c.b(true);
        this.c.d(0, null, false);
        org.telegram.ui.Components.h51 h51Var = new org.telegram.ui.Components.h51(context, this.currentAccount, this.classGuid, false, new a5(this, 17), new gs0(this, 2), null, this.resourceProvider);
        this.d = h51Var;
        h51Var.r1();
        frameLayout2.addView(this.d, c8.ma.e(-1, -1, 51));
        return this.fragmentView;
    }

    public final void d0() {
        if (this.e.y.f) {
            return;
        }
        if (!c0()) {
            finishFragment();
            return;
        }
        this.e.b(true);
        TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
        org.telegram.messenger.np messagesController = getMessagesController();
        long j3 = this.a;
        updatepaidmessagesprice.channel = messagesController.j1(j3);
        boolean z10 = this.n;
        updatepaidmessagesprice.send_paid_messages_stars = z10 ? this.r : 0L;
        updatepaidmessagesprice.suggestions_allowed = z10;
        getConnectionsManager().sendRequest(updatepaidmessagesprice, new e00(20, this, updatepaidmessagesprice));
        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(j3));
        if (O0 != null) {
            if (this.n) {
                O0.flags2 |= 65536;
                O0.broadcast_messages_allowed = true;
            } else {
                O0.flags2 &= -65537;
                O0.broadcast_messages_allowed = false;
            }
            getMessagesController().X3(O0, true);
            TLRPC.Chat O02 = getMessagesController().O0(Long.valueOf(O0.linked_monoforum_id));
            if (O02 != null) {
                if (this.n) {
                    O02.flags2 |= TLObject.FLAG_14;
                    O02.send_paid_messages_stars = this.r;
                } else {
                    O02.flags2 &= -16385;
                    O02.send_paid_messages_stars = 0L;
                }
                getMessagesController().X3(O02, true);
            }
        }
        ln lnVar = this.s;
        if (lnVar != null) {
            lnVar.run(this.n ? this.r : -1L);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !c0();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onBackPressed(boolean z10) {
        if (!c0()) {
            return super.onBackPressed(z10);
        }
        int i7 = 0;
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String N0 = org.telegram.messenger.hd.N0(2131743590, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.hd.N0(2131748277, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131754213, null), new gs0(this, i7));
            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131751394, null), new gs0(this, 1));
            showDialog(t1Var);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        org.telegram.ui.Components.c51 c51Var;
        super.onFragmentCreate();
        org.telegram.ui.Components.h51 h51Var = this.d;
        if (h51Var == null || (c51Var = h51Var.g3) == null) {
            return true;
        }
        c51Var.O(false);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
