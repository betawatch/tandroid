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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class es0 extends org.telegram.ui.ActionBar.e2 {
    public final long a;
    public org.telegram.ui.Cells.s7 b;
    public org.telegram.ui.Components.t70 c;
    public org.telegram.ui.Components.u41 d;
    public org.telegram.ui.ActionBar.z4 e;
    public final boolean f;
    public final long h;
    public boolean n;
    public long r;
    public kn s;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es0(long j3) {
        super(null);
        TLRPC.Chat chat = null;
        this.w = true;
        this.a = j3;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j3));
        if (M0 != null && M0.linked_monoforum_id != 0) {
            chat = getMessagesController().M0(Long.valueOf(M0.linked_monoforum_id));
        }
        long j10 = chat != null ? chat.send_paid_messages_stars : 0L;
        boolean z10 = M0 != null && M0.broadcast_messages_allowed;
        this.f = z10;
        long k10 = Utilities.k(z10 ? j10 : ((org.telegram.messenger.j0) getMessagesController().y7.b.b).c, getMessagesController().J6, 0L);
        this.h = k10;
        this.n = z10;
        this.r = k10;
    }

    public static /* synthetic */ void Z(es0 es0Var, TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
        if (tL_error != null) {
            es0Var.e.b(false);
            org.telegram.ui.Components.cc.d0(tL_error);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        es0Var.getMessagesController().S3(updates.chats, false);
        es0Var.getMessagesController().O3(updates, false);
        if (es0Var.isFinished || es0Var.finishing) {
            return;
        }
        kn knVar = es0Var.s;
        if (knVar != null) {
            knVar.run(updatepaidmessagesprice.suggestions_allowed ? updatepaidmessagesprice.send_paid_messages_stars : -1L);
        }
        es0Var.finishFragment();
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
        return org.telegram.messenger.hd.a0(null, null, 2131747073, ki.k.J0(getMessagesController().K6), String.valueOf(((int) (((this.r * (r0 / 1000.0f)) / 1000.0d) * getMessagesController().d6)) / 100.0d));
    }

    public final boolean c0() {
        return (this.r == this.h && this.n == this.f) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131747096, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new lx(this, 28));
        this.e = this.simpleActionBar.q(org.telegram.messenger.hd.M0(2131745946, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.a7, frameLayout, null);
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7(context, this.resourceProvider);
        this.b = s7Var;
        int i7 = org.telegram.ui.ActionBar.j6.d6;
        org.telegram.ui.ActionBar.q6.h(i7, s7Var, getResourceProvider());
        org.telegram.ui.Components.t70 t70Var = new org.telegram.ui.Components.t70(context, this, null, true, true);
        this.c = t70Var;
        t70Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), 0);
        org.telegram.ui.ActionBar.q6.h(i7, this.c, getResourceProvider());
        this.c.b(true);
        this.c.d(0, null, false);
        org.telegram.ui.Components.u41 u41Var = new org.telegram.ui.Components.u41(context, this.currentAccount, this.classGuid, false, new a5(this, 17), new ds0(this, 2), null, this.resourceProvider);
        this.d = u41Var;
        u41Var.r1();
        frameLayout2.addView(this.d, c8.ja.e(-1, -1, 51));
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
        updatepaidmessagesprice.channel = messagesController.h1(j3);
        boolean z10 = this.n;
        updatepaidmessagesprice.send_paid_messages_stars = z10 ? this.r : 0L;
        updatepaidmessagesprice.suggestions_allowed = z10;
        getConnectionsManager().sendRequest(updatepaidmessagesprice, new b00(20, this, updatepaidmessagesprice));
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j3));
        if (M0 != null) {
            if (this.n) {
                M0.flags2 |= 65536;
                M0.broadcast_messages_allowed = true;
            } else {
                M0.flags2 &= -65537;
                M0.broadcast_messages_allowed = false;
            }
            getMessagesController().Q3(M0, true);
            TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(M0.linked_monoforum_id));
            if (M02 != null) {
                if (this.n) {
                    M02.flags2 |= TLObject.FLAG_14;
                    M02.send_paid_messages_stars = this.r;
                } else {
                    M02.flags2 &= -16385;
                    M02.send_paid_messages_stars = 0L;
                }
                getMessagesController().Q3(M02, true);
            }
        }
        kn knVar = this.s;
        if (knVar != null) {
            knVar.run(this.n ? this.r : -1L);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !c0();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onBackPressed(boolean z10) {
        if (!c0()) {
            return super.onBackPressed(z10);
        }
        int i7 = 0;
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = org.telegram.messenger.hd.M0(2131743835, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = M0;
            t1Var.U = org.telegram.messenger.hd.M0(2131748470, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131754216, null), new ds0(this, i7));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751406, null), new ds0(this, 1));
            showDialog(t1Var);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        org.telegram.ui.Components.p41 p41Var;
        super.onFragmentCreate();
        org.telegram.ui.Components.u41 u41Var = this.d;
        if (u41Var == null || (p41Var = u41Var.g3) == null) {
            return true;
        }
        p41Var.O(false);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
