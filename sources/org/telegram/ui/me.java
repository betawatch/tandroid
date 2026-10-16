package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class me extends LinearLayout {
    public final int a;
    public final org.telegram.ui.Components.l91 b;
    public final le c;
    public final long d;
    public final ud e;
    public String f;
    public final ArrayList h;
    public final ArrayList n;
    public String r;
    public final boolean[] s;
    public final /* synthetic */ qe v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me(qe qeVar, Context context, int i10, long j10, int i11, ud udVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.v = qeVar;
        this.f = "";
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = "";
        this.s = new boolean[]{false, false};
        this.a = i10;
        this.d = j10;
        this.e = udVar;
        setOrientation(1);
        org.telegram.ui.Components.l91 l91Var = new org.telegram.ui.Components.l91(context, null);
        this.b = l91Var;
        le leVar = new le(this, context, i10, j10, i11, c6Var);
        this.c = leVar;
        l91Var.setAdapter(leVar);
        View n10 = l91Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d7, c6Var));
        addView(n10, w7.z5.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.z5.z(-1.0f), w7.z5.z(1.0f / AndroidUtilities.density)));
        addView(l91Var, w7.z5.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.h5, c6Var));
        c(1);
        c(0);
    }

    public final boolean a() {
        return (this.h.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    public final boolean b(int i10) {
        boolean isEmpty;
        if (i10 == 1) {
            isEmpty = this.h.isEmpty();
        } else {
            if (i10 != 0) {
                return false;
            }
            isEmpty = this.n.isEmpty();
        }
        return !isEmpty;
    }

    public final void c(final int i10) {
        boolean[] zArr = this.s;
        if (zArr[i10]) {
            return;
        }
        final boolean a2 = a();
        final boolean b10 = b(i10);
        long j10 = this.d;
        qe qeVar = this.v;
        int i11 = this.a;
        if (i10 == 1) {
            if (this.f == null || !qeVar.f1) {
                return;
            }
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i11).getInputPeer(j10);
            tL_payments_getStarsTransactions.offset = this.f;
            tL_payments_getStarsTransactions.limit = this.h.isEmpty() ? 5 : 20;
            final int i12 = 0;
            ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) { // from class: org.telegram.ui.ie
                public final /* synthetic */ me b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i12) {
                        case 0:
                            final int i13 = 1;
                            final me meVar = this.b;
                            final int i14 = i10;
                            final boolean z10 = a2;
                            final boolean z11 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.je
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ud udVar;
                                    ud udVar2;
                                    switch (i13) {
                                        case 0:
                                            me meVar2 = meVar;
                                            int i15 = meVar2.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z12 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i16 = i14;
                                            if (z12) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i15).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i15).putChats(starsStatus.chats, false);
                                                meVar2.n.addAll(starsStatus.history);
                                                meVar2.r = starsStatus.next_offset;
                                                meVar2.s[i16] = false;
                                                meVar2.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.zc.d0(tL_error2);
                                                }
                                            }
                                            if (meVar2.a() != z10 && (udVar = meVar2.e) != null) {
                                                udVar.run();
                                            }
                                            if (meVar2.b(i16) != z11) {
                                                meVar2.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            me meVar3 = meVar;
                                            int i17 = meVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z13 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i18 = i14;
                                            if (z13) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i17).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i17).putChats(starsStatus2.chats, false);
                                                meVar3.h.addAll(starsStatus2.history);
                                                meVar3.f = starsStatus2.next_offset;
                                                meVar3.s[i18] = false;
                                                meVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.zc.d0(tL_error3);
                                                }
                                            }
                                            if (meVar3.a() != z10 && (udVar2 = meVar3.e) != null) {
                                                udVar2.run();
                                            }
                                            if (meVar3.b(i18) != z11) {
                                                meVar3.e();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i15 = 0;
                            final me meVar2 = this.b;
                            final int i16 = i10;
                            final boolean z12 = a2;
                            final boolean z13 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.je
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ud udVar;
                                    ud udVar2;
                                    switch (i15) {
                                        case 0:
                                            me meVar22 = meVar2;
                                            int i152 = meVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i162 = i16;
                                            if (z122) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i152).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i152).putChats(starsStatus.chats, false);
                                                meVar22.n.addAll(starsStatus.history);
                                                meVar22.r = starsStatus.next_offset;
                                                meVar22.s[i162] = false;
                                                meVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.zc.d0(tL_error2);
                                                }
                                            }
                                            if (meVar22.a() != z12 && (udVar = meVar22.e) != null) {
                                                udVar.run();
                                            }
                                            if (meVar22.b(i162) != z13) {
                                                meVar22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            me meVar3 = meVar2;
                                            int i17 = meVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i18 = i16;
                                            if (z132) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i17).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i17).putChats(starsStatus2.chats, false);
                                                meVar3.h.addAll(starsStatus2.history);
                                                meVar3.f = starsStatus2.next_offset;
                                                meVar3.s[i18] = false;
                                                meVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.zc.d0(tL_error3);
                                                }
                                            }
                                            if (meVar3.a() != z12 && (udVar2 = meVar3.e) != null) {
                                                udVar2.run();
                                            }
                                            if (meVar3.b(i18) != z13) {
                                                meVar3.e();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
            return;
        }
        if (i10 == 0 && this.r != null && qeVar.g1) {
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions2.ton = false;
            tL_payments_getStarsTransactions2.peer = MessagesController.getInstance(i11).getInputPeer(j10);
            tL_payments_getStarsTransactions2.offset = this.r;
            tL_payments_getStarsTransactions2.limit = this.n.isEmpty() ? 5 : 20;
            final int i13 = 1;
            ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) { // from class: org.telegram.ui.ie
                public final /* synthetic */ me b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i13) {
                        case 0:
                            final int i132 = 1;
                            final me meVar = this.b;
                            final int i14 = i10;
                            final boolean z10 = a2;
                            final boolean z11 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.je
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ud udVar;
                                    ud udVar2;
                                    switch (i132) {
                                        case 0:
                                            me meVar22 = meVar;
                                            int i152 = meVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i162 = i14;
                                            if (z122) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i152).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i152).putChats(starsStatus.chats, false);
                                                meVar22.n.addAll(starsStatus.history);
                                                meVar22.r = starsStatus.next_offset;
                                                meVar22.s[i162] = false;
                                                meVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.zc.d0(tL_error2);
                                                }
                                            }
                                            if (meVar22.a() != z10 && (udVar = meVar22.e) != null) {
                                                udVar.run();
                                            }
                                            if (meVar22.b(i162) != z11) {
                                                meVar22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            me meVar3 = meVar;
                                            int i17 = meVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i18 = i14;
                                            if (z132) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i17).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i17).putChats(starsStatus2.chats, false);
                                                meVar3.h.addAll(starsStatus2.history);
                                                meVar3.f = starsStatus2.next_offset;
                                                meVar3.s[i18] = false;
                                                meVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.zc.d0(tL_error3);
                                                }
                                            }
                                            if (meVar3.a() != z10 && (udVar2 = meVar3.e) != null) {
                                                udVar2.run();
                                            }
                                            if (meVar3.b(i18) != z11) {
                                                meVar3.e();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i15 = 0;
                            final me meVar2 = this.b;
                            final int i16 = i10;
                            final boolean z12 = a2;
                            final boolean z13 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.je
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ud udVar;
                                    ud udVar2;
                                    switch (i15) {
                                        case 0:
                                            me meVar22 = meVar2;
                                            int i152 = meVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i162 = i16;
                                            if (z122) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i152).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i152).putChats(starsStatus.chats, false);
                                                meVar22.n.addAll(starsStatus.history);
                                                meVar22.r = starsStatus.next_offset;
                                                meVar22.s[i162] = false;
                                                meVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.zc.d0(tL_error2);
                                                }
                                            }
                                            if (meVar22.a() != z12 && (udVar = meVar22.e) != null) {
                                                udVar.run();
                                            }
                                            if (meVar22.b(i162) != z13) {
                                                meVar22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            me meVar3 = meVar2;
                                            int i17 = meVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i18 = i16;
                                            if (z132) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i17).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i17).putChats(starsStatus2.chats, false);
                                                meVar3.h.addAll(starsStatus2.history);
                                                meVar3.f = starsStatus2.next_offset;
                                                meVar3.s[i18] = false;
                                                meVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.zc.d0(tL_error3);
                                                }
                                            }
                                            if (meVar3.a() != z12 && (udVar2 = meVar3.e) != null) {
                                                udVar2.run();
                                            }
                                            if (meVar3.b(i18) != z13) {
                                                meVar3.e();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
        }
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.l91 l91Var = this.b;
            if (i10 >= l91Var.getViewPages().length) {
                return;
            }
            View view = l91Var.getViewPages()[i10];
            if (view instanceof ke) {
                ke keVar = (ke) view;
                org.telegram.ui.Components.i71 i71Var = keVar.a;
                i71Var.W2.N(true);
                if (i71Var.canScrollVertically(1)) {
                    for (int i11 = 0; i11 < i71Var.getChildCount(); i11++) {
                        if (!(i71Var.getChildAt(i11) instanceof org.telegram.ui.Components.f10)) {
                        }
                    }
                }
                keVar.e.run();
                break;
            }
            i10++;
        }
    }

    public final void e() {
        this.c.i();
        org.telegram.ui.Components.l91 l91Var = this.b;
        l91Var.o(false);
        View[] viewArr = l91Var.e;
        int[] iArr = l91Var.f;
        if (iArr[0] != l91Var.L.h(l91Var.b)) {
            l91Var.I(0);
            View view = viewArr[1];
            if (view != null) {
                l91Var.h.put(iArr[1], view);
                l91Var.removeView(viewArr[1]);
                viewArr[1] = null;
            }
            viewArr[0].setTranslationX(0.0f);
        }
    }

    public org.telegram.ui.Components.mm0 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof ke) {
            return ((ke) currentView).a;
        }
        return null;
    }
}
