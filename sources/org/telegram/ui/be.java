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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class be extends LinearLayout {
    public final int a;
    public final org.telegram.ui.Components.n71 b;
    public final ae c;
    public final long d;
    public final kd e;
    public String f;
    public final ArrayList h;
    public final ArrayList n;
    public String r;
    public final boolean[] s;
    public final /* synthetic */ fe v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(fe feVar, Context context, int i9, long j10, int i10, kd kdVar, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.v = feVar;
        this.f = "";
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = "";
        this.s = new boolean[]{false, false};
        this.a = i9;
        this.d = j10;
        this.e = kdVar;
        setOrientation(1);
        org.telegram.ui.Components.n71 n71Var = new org.telegram.ui.Components.n71(context, null);
        this.b = n71Var;
        ae aeVar = new ae(this, context, i9, j10, i10, b6Var);
        this.c = aeVar;
        n71Var.setAdapter(aeVar);
        View n10 = n71Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d7, b6Var));
        addView(n10, g7.e6.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(g7.e6.z(-1.0f), g7.e6.z(1.0f / AndroidUtilities.density)));
        addView(n71Var, g7.e6.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, b6Var));
        c(1);
        c(0);
    }

    public final boolean a() {
        return (this.h.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    public final boolean b(int i9) {
        boolean isEmpty;
        if (i9 == 1) {
            isEmpty = this.h.isEmpty();
        } else {
            if (i9 != 0) {
                return false;
            }
            isEmpty = this.n.isEmpty();
        }
        return !isEmpty;
    }

    public final void c(final int i9) {
        boolean[] zArr = this.s;
        if (zArr[i9]) {
            return;
        }
        final boolean a2 = a();
        final boolean b10 = b(i9);
        long j10 = this.d;
        fe feVar = this.v;
        int i10 = this.a;
        if (i9 == 1) {
            if (this.f == null || !feVar.b1) {
                return;
            }
            zArr[i9] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i10).getInputPeer(j10);
            tL_payments_getStarsTransactions.offset = this.f;
            tL_payments_getStarsTransactions.limit = this.h.isEmpty() ? 5 : 20;
            final int i11 = 0;
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) { // from class: org.telegram.ui.xd
                public final /* synthetic */ be b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i11) {
                        case 0:
                            final int i12 = 1;
                            final be beVar = this.b;
                            final int i13 = i9;
                            final boolean z10 = a2;
                            final boolean z11 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.yd
                                @Override // java.lang.Runnable
                                public final void run() {
                                    kd kdVar;
                                    kd kdVar2;
                                    switch (i12) {
                                        case 0:
                                            be beVar2 = beVar;
                                            int i14 = beVar2.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z12 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i15 = i13;
                                            if (z12) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i14).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i14).putChats(starsStatus.chats, false);
                                                beVar2.n.addAll(starsStatus.history);
                                                beVar2.r = starsStatus.next_offset;
                                                beVar2.s[i15] = false;
                                                beVar2.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.oc.b0(tL_error2);
                                                }
                                            }
                                            if (beVar2.a() != z10 && (kdVar = beVar2.e) != null) {
                                                kdVar.run();
                                            }
                                            if (beVar2.b(i15) != z11) {
                                                beVar2.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            be beVar3 = beVar;
                                            int i16 = beVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z13 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i17 = i13;
                                            if (z13) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                beVar3.h.addAll(starsStatus2.history);
                                                beVar3.f = starsStatus2.next_offset;
                                                beVar3.s[i17] = false;
                                                beVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.oc.b0(tL_error3);
                                                }
                                            }
                                            if (beVar3.a() != z10 && (kdVar2 = beVar3.e) != null) {
                                                kdVar2.run();
                                            }
                                            if (beVar3.b(i17) != z11) {
                                                beVar3.e();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i14 = 0;
                            final be beVar2 = this.b;
                            final int i15 = i9;
                            final boolean z12 = a2;
                            final boolean z13 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.yd
                                @Override // java.lang.Runnable
                                public final void run() {
                                    kd kdVar;
                                    kd kdVar2;
                                    switch (i14) {
                                        case 0:
                                            be beVar22 = beVar2;
                                            int i142 = beVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i152 = i15;
                                            if (z122) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                beVar22.n.addAll(starsStatus.history);
                                                beVar22.r = starsStatus.next_offset;
                                                beVar22.s[i152] = false;
                                                beVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.oc.b0(tL_error2);
                                                }
                                            }
                                            if (beVar22.a() != z12 && (kdVar = beVar22.e) != null) {
                                                kdVar.run();
                                            }
                                            if (beVar22.b(i152) != z13) {
                                                beVar22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            be beVar3 = beVar2;
                                            int i16 = beVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i17 = i15;
                                            if (z132) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                beVar3.h.addAll(starsStatus2.history);
                                                beVar3.f = starsStatus2.next_offset;
                                                beVar3.s[i17] = false;
                                                beVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.oc.b0(tL_error3);
                                                }
                                            }
                                            if (beVar3.a() != z12 && (kdVar2 = beVar3.e) != null) {
                                                kdVar2.run();
                                            }
                                            if (beVar3.b(i17) != z13) {
                                                beVar3.e();
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
        if (i9 == 0 && this.r != null && feVar.c1) {
            zArr[i9] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions2.ton = false;
            tL_payments_getStarsTransactions2.peer = MessagesController.getInstance(i10).getInputPeer(j10);
            tL_payments_getStarsTransactions2.offset = this.r;
            tL_payments_getStarsTransactions2.limit = this.n.isEmpty() ? 5 : 20;
            final int i12 = 1;
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) { // from class: org.telegram.ui.xd
                public final /* synthetic */ be b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i12) {
                        case 0:
                            final int i122 = 1;
                            final be beVar = this.b;
                            final int i13 = i9;
                            final boolean z10 = a2;
                            final boolean z11 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.yd
                                @Override // java.lang.Runnable
                                public final void run() {
                                    kd kdVar;
                                    kd kdVar2;
                                    switch (i122) {
                                        case 0:
                                            be beVar22 = beVar;
                                            int i142 = beVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i152 = i13;
                                            if (z122) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                beVar22.n.addAll(starsStatus.history);
                                                beVar22.r = starsStatus.next_offset;
                                                beVar22.s[i152] = false;
                                                beVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.oc.b0(tL_error2);
                                                }
                                            }
                                            if (beVar22.a() != z10 && (kdVar = beVar22.e) != null) {
                                                kdVar.run();
                                            }
                                            if (beVar22.b(i152) != z11) {
                                                beVar22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            be beVar3 = beVar;
                                            int i16 = beVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i17 = i13;
                                            if (z132) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                beVar3.h.addAll(starsStatus2.history);
                                                beVar3.f = starsStatus2.next_offset;
                                                beVar3.s[i17] = false;
                                                beVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.oc.b0(tL_error3);
                                                }
                                            }
                                            if (beVar3.a() != z10 && (kdVar2 = beVar3.e) != null) {
                                                kdVar2.run();
                                            }
                                            if (beVar3.b(i17) != z11) {
                                                beVar3.e();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i14 = 0;
                            final be beVar2 = this.b;
                            final int i15 = i9;
                            final boolean z12 = a2;
                            final boolean z13 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.yd
                                @Override // java.lang.Runnable
                                public final void run() {
                                    kd kdVar;
                                    kd kdVar2;
                                    switch (i14) {
                                        case 0:
                                            be beVar22 = beVar2;
                                            int i142 = beVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i152 = i15;
                                            if (z122) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                beVar22.n.addAll(starsStatus.history);
                                                beVar22.r = starsStatus.next_offset;
                                                beVar22.s[i152] = false;
                                                beVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.oc.b0(tL_error2);
                                                }
                                            }
                                            if (beVar22.a() != z12 && (kdVar = beVar22.e) != null) {
                                                kdVar.run();
                                            }
                                            if (beVar22.b(i152) != z13) {
                                                beVar22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            be beVar3 = beVar2;
                                            int i16 = beVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i17 = i15;
                                            if (z132) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                beVar3.h.addAll(starsStatus2.history);
                                                beVar3.f = starsStatus2.next_offset;
                                                beVar3.s[i17] = false;
                                                beVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.oc.b0(tL_error3);
                                                }
                                            }
                                            if (beVar3.a() != z12 && (kdVar2 = beVar3.e) != null) {
                                                kdVar2.run();
                                            }
                                            if (beVar3.b(i17) != z13) {
                                                beVar3.e();
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
        int i9 = 0;
        while (true) {
            org.telegram.ui.Components.n71 n71Var = this.b;
            if (i9 >= n71Var.getViewPages().length) {
                return;
            }
            View view = n71Var.getViewPages()[i9];
            if (view instanceof zd) {
                zd zdVar = (zd) view;
                org.telegram.ui.Components.i51 i51Var = zdVar.a;
                i51Var.U2.N(true);
                if (i51Var.canScrollVertically(1)) {
                    for (int i10 = 0; i10 < i51Var.getChildCount(); i10++) {
                        if (!(i51Var.getChildAt(i10) instanceof org.telegram.ui.Components.e00)) {
                        }
                    }
                }
                zdVar.e.run();
                break;
            }
            i9++;
        }
    }

    public final void e() {
        this.c.i();
        org.telegram.ui.Components.n71 n71Var = this.b;
        n71Var.o(false);
        View[] viewArr = n71Var.e;
        int[] iArr = n71Var.f;
        if (iArr[0] != n71Var.H.h(n71Var.b)) {
            n71Var.I(0);
            View view = viewArr[1];
            if (view != null) {
                n71Var.h.put(iArr[1], view);
                n71Var.removeView(viewArr[1]);
                viewArr[1] = null;
            }
            viewArr[0].setTranslationX(0.0f);
        }
    }

    public org.telegram.ui.Components.wk0 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof zd) {
            return ((zd) currentView).a;
        }
        return null;
    }
}
