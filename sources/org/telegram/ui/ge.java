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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ge extends LinearLayout {
    public final int a;
    public final org.telegram.ui.Components.m81 b;
    public final fe c;
    public final long d;
    public final pd e;
    public String f;
    public final ArrayList h;
    public final ArrayList n;
    public String r;
    public final boolean[] s;
    public final /* synthetic */ ke v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge(ke keVar, Context context, int i10, long j10, int i11, pd pdVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.v = keVar;
        this.f = "";
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = "";
        this.s = new boolean[]{false, false};
        this.a = i10;
        this.d = j10;
        this.e = pdVar;
        setOrientation(1);
        org.telegram.ui.Components.m81 m81Var = new org.telegram.ui.Components.m81(context, null);
        this.b = m81Var;
        fe feVar = new fe(this, context, i10, j10, i11, g6Var);
        this.c = feVar;
        m81Var.setAdapter(feVar);
        View n10 = m81Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d7, g6Var));
        addView(n10, k7.c6.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(k7.c6.z(-1.0f), k7.c6.z(1.0f / AndroidUtilities.density)));
        addView(m81Var, k7.c6.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.h5, g6Var));
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
        ke keVar = this.v;
        int i11 = this.a;
        if (i10 == 1) {
            if (this.f == null || !keVar.c1) {
                return;
            }
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i11).getInputPeer(j10);
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
                            final boolean z4 = a2;
                            final boolean z10 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.de
                                @Override // java.lang.Runnable
                                public final void run() {
                                    pd pdVar;
                                    pd pdVar2;
                                    switch (i13) {
                                        case 0:
                                            ge geVar2 = geVar;
                                            int i15 = geVar2.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z11 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i16 = i14;
                                            if (z11) {
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
                                                    org.telegram.ui.Components.qc.b0(tL_error2);
                                                }
                                            }
                                            if (geVar2.a() != z4 && (pdVar = geVar2.e) != null) {
                                                pdVar.run();
                                            }
                                            if (geVar2.b(i16) != z10) {
                                                geVar2.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            ge geVar3 = geVar;
                                            int i17 = geVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z12 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i18 = i14;
                                            if (z12) {
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
                                                    org.telegram.ui.Components.qc.b0(tL_error3);
                                                }
                                            }
                                            if (geVar3.a() != z4 && (pdVar2 = geVar3.e) != null) {
                                                pdVar2.run();
                                            }
                                            if (geVar3.b(i18) != z10) {
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
                            final boolean z11 = a2;
                            final boolean z12 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.de
                                @Override // java.lang.Runnable
                                public final void run() {
                                    pd pdVar;
                                    pd pdVar2;
                                    switch (i15) {
                                        case 0:
                                            ge geVar22 = geVar2;
                                            int i152 = geVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z112 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i162 = i16;
                                            if (z112) {
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
                                                    org.telegram.ui.Components.qc.b0(tL_error2);
                                                }
                                            }
                                            if (geVar22.a() != z11 && (pdVar = geVar22.e) != null) {
                                                pdVar.run();
                                            }
                                            if (geVar22.b(i162) != z12) {
                                                geVar22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            ge geVar3 = geVar2;
                                            int i17 = geVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z122 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i18 = i16;
                                            if (z122) {
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
                                                    org.telegram.ui.Components.qc.b0(tL_error3);
                                                }
                                            }
                                            if (geVar3.a() != z11 && (pdVar2 = geVar3.e) != null) {
                                                pdVar2.run();
                                            }
                                            if (geVar3.b(i18) != z12) {
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
        if (i10 == 0 && this.r != null && keVar.d1) {
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions2.ton = false;
            tL_payments_getStarsTransactions2.peer = MessagesController.getInstance(i11).getInputPeer(j10);
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
                            final boolean z4 = a2;
                            final boolean z10 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.de
                                @Override // java.lang.Runnable
                                public final void run() {
                                    pd pdVar;
                                    pd pdVar2;
                                    switch (i132) {
                                        case 0:
                                            ge geVar22 = geVar;
                                            int i152 = geVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z112 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i162 = i14;
                                            if (z112) {
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
                                                    org.telegram.ui.Components.qc.b0(tL_error2);
                                                }
                                            }
                                            if (geVar22.a() != z4 && (pdVar = geVar22.e) != null) {
                                                pdVar.run();
                                            }
                                            if (geVar22.b(i162) != z10) {
                                                geVar22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            ge geVar3 = geVar;
                                            int i17 = geVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z122 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i18 = i14;
                                            if (z122) {
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
                                                    org.telegram.ui.Components.qc.b0(tL_error3);
                                                }
                                            }
                                            if (geVar3.a() != z4 && (pdVar2 = geVar3.e) != null) {
                                                pdVar2.run();
                                            }
                                            if (geVar3.b(i18) != z10) {
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
                            final boolean z11 = a2;
                            final boolean z12 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.de
                                @Override // java.lang.Runnable
                                public final void run() {
                                    pd pdVar;
                                    pd pdVar2;
                                    switch (i15) {
                                        case 0:
                                            ge geVar22 = geVar2;
                                            int i152 = geVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z112 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i162 = i16;
                                            if (z112) {
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
                                                    org.telegram.ui.Components.qc.b0(tL_error2);
                                                }
                                            }
                                            if (geVar22.a() != z11 && (pdVar = geVar22.e) != null) {
                                                pdVar.run();
                                            }
                                            if (geVar22.b(i162) != z12) {
                                                geVar22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            ge geVar3 = geVar2;
                                            int i17 = geVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z122 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i18 = i16;
                                            if (z122) {
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
                                                    org.telegram.ui.Components.qc.b0(tL_error3);
                                                }
                                            }
                                            if (geVar3.a() != z11 && (pdVar2 = geVar3.e) != null) {
                                                pdVar2.run();
                                            }
                                            if (geVar3.b(i18) != z12) {
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
            org.telegram.ui.Components.m81 m81Var = this.b;
            if (i10 >= m81Var.getViewPages().length) {
                return;
            }
            View view = m81Var.getViewPages()[i10];
            if (view instanceof ee) {
                ee eeVar = (ee) view;
                org.telegram.ui.Components.i61 i61Var = eeVar.a;
                i61Var.V2.N(true);
                if (i61Var.canScrollVertically(1)) {
                    for (int i11 = 0; i11 < i61Var.getChildCount(); i11++) {
                        if (!(i61Var.getChildAt(i11) instanceof org.telegram.ui.Components.u00)) {
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
        org.telegram.ui.Components.m81 m81Var = this.b;
        m81Var.o(false);
        View[] viewArr = m81Var.e;
        int[] iArr = m81Var.f;
        if (iArr[0] != m81Var.I.h(m81Var.b)) {
            m81Var.I(0);
            View view = viewArr[1];
            if (view != null) {
                m81Var.h.put(iArr[1], view);
                m81Var.removeView(viewArr[1]);
                viewArr[1] = null;
            }
            viewArr[0].setTranslationX(0.0f);
        }
    }

    public org.telegram.ui.Components.tl0 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof ee) {
            return ((ee) currentView).a;
        }
        return null;
    }
}
