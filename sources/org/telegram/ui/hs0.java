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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class hs0 extends org.telegram.ui.ActionBar.f2 {
    public final long a;
    public org.telegram.ui.Cells.t7 b;
    public org.telegram.ui.Components.q70 c;
    public org.telegram.ui.Components.q41 d;
    public org.telegram.ui.ActionBar.b5 e;
    public final boolean f;
    public final long h;
    public boolean n;
    public long r;
    public kn s;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs0(long j3) {
        super(null);
        TLRPC.Chat chat = null;
        this.w = true;
        this.a = j3;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j3));
        if (M0 != null && M0.linked_monoforum_id != 0) {
            chat = getMessagesController().M0(Long.valueOf(M0.linked_monoforum_id));
        }
        long j10 = chat != null ? chat.send_paid_messages_stars : 0L;
        boolean z9 = M0 != null && M0.broadcast_messages_allowed;
        this.f = z9;
        long k10 = Utilities.k(z9 ? j10 : ((org.telegram.messenger.j0) getMessagesController().x7.b.b).c, getMessagesController().I6, 0L);
        this.h = k10;
        this.n = z9;
        this.r = k10;
    }

    public static /* synthetic */ void Z(hs0 hs0Var, TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
        if (tL_error != null) {
            hs0Var.e.b(false);
            org.telegram.ui.Components.hc.d0(tL_error);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        hs0Var.getMessagesController().S3(updates.chats, false);
        hs0Var.getMessagesController().O3(updates, false);
        if (hs0Var.isFinished || hs0Var.finishing) {
            return;
        }
        kn knVar = hs0Var.s;
        if (knVar != null) {
            knVar.run(updatepaidmessagesprice.suggestions_allowed ? updatepaidmessagesprice.send_paid_messages_stars : -1L);
        }
        hs0Var.finishFragment();
    }

    public final void a0(boolean z9) {
        boolean c02;
        if (this.e == null || this.w == (c02 = c0())) {
            return;
        }
        this.w = c02;
        this.e.a(c02, z9);
    }

    public final String b0() {
        return org.telegram.messenger.id.a0(null, null, 2131747074, hi.j.J0(getMessagesController().J6), String.valueOf(((int) (((this.r * (r0 / 1000.0f)) / 1000.0d) * getMessagesController().c6)) / 100.0d));
    }

    public final boolean c0() {
        return (this.r == this.h && this.n == this.f) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131747097, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ux(this, 27));
        this.e = this.simpleActionBar.n(org.telegram.messenger.id.M0(2131745949, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, frameLayout, null);
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.resourceProvider);
        this.b = t7Var;
        int i7 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.r6.i(i7, t7Var, getResourceProvider());
        org.telegram.ui.Components.q70 q70Var = new org.telegram.ui.Components.q70(context, this, null, true, true);
        this.c = q70Var;
        q70Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), 0);
        org.telegram.ui.ActionBar.r6.i(i7, this.c, getResourceProvider());
        this.c.b(true);
        this.c.d(0, null, false);
        org.telegram.ui.Components.q41 q41Var = new org.telegram.ui.Components.q41(context, this.currentAccount, this.classGuid, false, new a5(this, 17), new gs0(this, 2), null, this.resourceProvider);
        this.d = q41Var;
        q41Var.r1();
        frameLayout2.addView(this.d, c8.ha.e(-1, -1, 51));
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
        org.telegram.messenger.qp messagesController = getMessagesController();
        long j3 = this.a;
        updatepaidmessagesprice.channel = messagesController.h1(j3);
        boolean z9 = this.n;
        updatepaidmessagesprice.send_paid_messages_stars = z9 ? this.r : 0L;
        updatepaidmessagesprice.suggestions_allowed = z9;
        getConnectionsManager().sendRequest(updatepaidmessagesprice, new h50(18, this, updatepaidmessagesprice));
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

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !c0();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        if (!c0()) {
            return super.onBackPressed(z9);
        }
        int i7 = 0;
        if (z9) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = org.telegram.messenger.id.M0(2131743838, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.M0(2131748471, null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131754216, null), new gs0(this, i7));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131751407, null), new gs0(this, 1));
            showDialog(u1Var);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        org.telegram.ui.Components.l41 l41Var;
        super.onFragmentCreate();
        org.telegram.ui.Components.q41 q41Var = this.d;
        if (q41Var == null || (l41Var = q41Var.f3) == null) {
            return true;
        }
        l41Var.O(false);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
