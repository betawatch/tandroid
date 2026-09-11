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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ge extends LinearLayout {
    public final int a;
    public final org.telegram.ui.Components.i81 b;
    public final fe c;
    public final long d;
    public final od e;
    public String f;
    public final ArrayList h;
    public final ArrayList n;
    public String r;
    public final boolean[] s;
    public final /* synthetic */ ke v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge(ke keVar, Context context, int i10, long j3, int i11, od odVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.v = keVar;
        this.f = "";
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = "";
        this.s = new boolean[]{false, false};
        this.a = i10;
        this.d = j3;
        this.e = odVar;
        setOrientation(1);
        org.telegram.ui.Components.i81 i81Var = new org.telegram.ui.Components.i81(context, null);
        this.b = i81Var;
        fe feVar = new fe(this, context, i10, j3, i11, f6Var);
        this.c = feVar;
        i81Var.setAdapter(feVar);
        View n10 = i81Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d7, f6Var));
        addView(n10, w7.x5.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.x5.z(-1.0f), w7.x5.z(1.0f / AndroidUtilities.density)));
        addView(i81Var, w7.x5.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
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
        long j3 = this.d;
        ke keVar = this.v;
        int i11 = this.a;
        if (i10 == 1) {
            if (this.f == null || !keVar.f1) {
                return;
            }
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i11).getInputPeer(j3);
            tL_payments_getStarsTransactions.offset = this.f;
            tL_payments_getStarsTransactions.limit = this.h.isEmpty() ? 5 : 20;
            final int i12 = 0;
            ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) { // from class: org.telegram.ui.ce
                public final /* synthetic */ ge b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i12) {
                        case 0:
                            final int i13 = 1;
                            final ge geVar = this.b;
                            final int i14 = i10;
                            final boolean z10 = a2;
                            final boolean z11 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.de
                                @Override // java.lang.Runnable
                                public final void run() {
                                    od odVar;
                                    od odVar2;
                                    switch (i13) {
                                        case 0:
                                            ge geVar2 = geVar;
                                            int i15 = geVar2.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z12 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i16 = i14;
                                            if (z12) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i15).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i15).putChats(starsStatus.chats, false);
                                                geVar2.n.addAll(starsStatus.history);
                                                geVar2.r = starsStatus.next_offset;
                                                geVar2.s[i16] = false;
                                                geVar2.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.yc.b0(tL_error2);
                                                }
                                            }
                                            if (geVar2.a() != z10 && (odVar = geVar2.e) != null) {
                                                odVar.run();
                                            }
                                            if (geVar2.b(i16) != z11) {
                                                geVar2.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            ge geVar3 = geVar;
                                            int i17 = geVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z13 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i18 = i14;
                                            if (z13) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i17).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i17).putChats(starsStatus2.chats, false);
                                                geVar3.h.addAll(starsStatus2.history);
                                                geVar3.f = starsStatus2.next_offset;
                                                geVar3.s[i18] = false;
                                                geVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.yc.b0(tL_error3);
                                                }
                                            }
                                            if (geVar3.a() != z10 && (odVar2 = geVar3.e) != null) {
                                                odVar2.run();
                                            }
                                            if (geVar3.b(i18) != z11) {
                                                geVar3.e();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i15 = 0;
                            final ge geVar2 = this.b;
                            final int i16 = i10;
                            final boolean z12 = a2;
                            final boolean z13 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.de
                                @Override // java.lang.Runnable
                                public final void run() {
                                    od odVar;
                                    od odVar2;
                                    switch (i15) {
                                        case 0:
                                            ge geVar22 = geVar2;
                                            int i152 = geVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i162 = i16;
                                            if (z122) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i152).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i152).putChats(starsStatus.chats, false);
                                                geVar22.n.addAll(starsStatus.history);
                                                geVar22.r = starsStatus.next_offset;
                                                geVar22.s[i162] = false;
                                                geVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.yc.b0(tL_error2);
                                                }
                                            }
                                            if (geVar22.a() != z12 && (odVar = geVar22.e) != null) {
                                                odVar.run();
                                            }
                                            if (geVar22.b(i162) != z13) {
                                                geVar22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            ge geVar3 = geVar2;
                                            int i17 = geVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i18 = i16;
                                            if (z132) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i17).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i17).putChats(starsStatus2.chats, false);
                                                geVar3.h.addAll(starsStatus2.history);
                                                geVar3.f = starsStatus2.next_offset;
                                                geVar3.s[i18] = false;
                                                geVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.yc.b0(tL_error3);
                                                }
                                            }
                                            if (geVar3.a() != z12 && (odVar2 = geVar3.e) != null) {
                                                odVar2.run();
                                            }
                                            if (geVar3.b(i18) != z13) {
                                                geVar3.e();
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
        if (i10 == 0 && this.r != null && keVar.g1) {
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions2.ton = false;
            tL_payments_getStarsTransactions2.peer = MessagesController.getInstance(i11).getInputPeer(j3);
            tL_payments_getStarsTransactions2.offset = this.r;
            tL_payments_getStarsTransactions2.limit = this.n.isEmpty() ? 5 : 20;
            final int i13 = 1;
            ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) { // from class: org.telegram.ui.ce
                public final /* synthetic */ ge b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i13) {
                        case 0:
                            final int i132 = 1;
                            final ge geVar = this.b;
                            final int i14 = i10;
                            final boolean z10 = a2;
                            final boolean z11 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.de
                                @Override // java.lang.Runnable
                                public final void run() {
                                    od odVar;
                                    od odVar2;
                                    switch (i132) {
                                        case 0:
                                            ge geVar22 = geVar;
                                            int i152 = geVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i162 = i14;
                                            if (z122) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i152).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i152).putChats(starsStatus.chats, false);
                                                geVar22.n.addAll(starsStatus.history);
                                                geVar22.r = starsStatus.next_offset;
                                                geVar22.s[i162] = false;
                                                geVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.yc.b0(tL_error2);
                                                }
                                            }
                                            if (geVar22.a() != z10 && (odVar = geVar22.e) != null) {
                                                odVar.run();
                                            }
                                            if (geVar22.b(i162) != z11) {
                                                geVar22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            ge geVar3 = geVar;
                                            int i17 = geVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i18 = i14;
                                            if (z132) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i17).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i17).putChats(starsStatus2.chats, false);
                                                geVar3.h.addAll(starsStatus2.history);
                                                geVar3.f = starsStatus2.next_offset;
                                                geVar3.s[i18] = false;
                                                geVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.yc.b0(tL_error3);
                                                }
                                            }
                                            if (geVar3.a() != z10 && (odVar2 = geVar3.e) != null) {
                                                odVar2.run();
                                            }
                                            if (geVar3.b(i18) != z11) {
                                                geVar3.e();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i15 = 0;
                            final ge geVar2 = this.b;
                            final int i16 = i10;
                            final boolean z12 = a2;
                            final boolean z13 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.de
                                @Override // java.lang.Runnable
                                public final void run() {
                                    od odVar;
                                    od odVar2;
                                    switch (i15) {
                                        case 0:
                                            ge geVar22 = geVar2;
                                            int i152 = geVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i162 = i16;
                                            if (z122) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i152).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i152).putChats(starsStatus.chats, false);
                                                geVar22.n.addAll(starsStatus.history);
                                                geVar22.r = starsStatus.next_offset;
                                                geVar22.s[i162] = false;
                                                geVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.yc.b0(tL_error2);
                                                }
                                            }
                                            if (geVar22.a() != z12 && (odVar = geVar22.e) != null) {
                                                odVar.run();
                                            }
                                            if (geVar22.b(i162) != z13) {
                                                geVar22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            ge geVar3 = geVar2;
                                            int i17 = geVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i18 = i16;
                                            if (z132) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i17).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i17).putChats(starsStatus2.chats, false);
                                                geVar3.h.addAll(starsStatus2.history);
                                                geVar3.f = starsStatus2.next_offset;
                                                geVar3.s[i18] = false;
                                                geVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.yc.b0(tL_error3);
                                                }
                                            }
                                            if (geVar3.a() != z12 && (odVar2 = geVar3.e) != null) {
                                                odVar2.run();
                                            }
                                            if (geVar3.b(i18) != z13) {
                                                geVar3.e();
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
            org.telegram.ui.Components.i81 i81Var = this.b;
            if (i10 >= i81Var.getViewPages().length) {
                return;
            }
            View view = i81Var.getViewPages()[i10];
            if (view instanceof ee) {
                ee eeVar = (ee) view;
                org.telegram.ui.Components.d61 d61Var = eeVar.a;
                d61Var.Y2.N(true);
                if (d61Var.canScrollVertically(1)) {
                    for (int i11 = 0; i11 < d61Var.getChildCount(); i11++) {
                        if (!(d61Var.getChildAt(i11) instanceof org.telegram.ui.Components.t00)) {
                        }
                    }
                }
                eeVar.e.run();
                break;
            }
            i10++;
        }
    }

    public final void e() {
        this.c.i();
        org.telegram.ui.Components.i81 i81Var = this.b;
        i81Var.o(false);
        View[] viewArr = i81Var.e;
        int[] iArr = i81Var.f;
        if (iArr[0] != i81Var.L.h(i81Var.b)) {
            i81Var.I(0);
            View view = viewArr[1];
            if (view != null) {
                i81Var.h.put(iArr[1], view);
                i81Var.removeView(viewArr[1]);
                viewArr[1] = null;
            }
            viewArr[0].setTranslationX(0.0f);
        }
    }

    public org.telegram.ui.Components.ll0 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof ee) {
            return ((ee) currentView).a;
        }
        return null;
    }
}
