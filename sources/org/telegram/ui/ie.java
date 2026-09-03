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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ie extends LinearLayout {
    public final int a;
    public final org.telegram.ui.Components.l81 b;
    public final he c;
    public final long d;
    public final rd e;
    public String f;
    public final ArrayList h;
    public final ArrayList n;
    public String r;
    public final boolean[] s;
    public final /* synthetic */ me v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie(me meVar, Context context, int i10, long j10, int i11, rd rdVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.v = meVar;
        this.f = "";
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = "";
        this.s = new boolean[]{false, false};
        this.a = i10;
        this.d = j10;
        this.e = rdVar;
        setOrientation(1);
        org.telegram.ui.Components.l81 l81Var = new org.telegram.ui.Components.l81(context, null);
        this.b = l81Var;
        he heVar = new he(this, context, i10, j10, i11, f6Var);
        this.c = heVar;
        l81Var.setAdapter(heVar);
        View n10 = l81Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d7, f6Var));
        addView(n10, k7.b6.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(k7.b6.z(-1.0f), k7.b6.z(1.0f / AndroidUtilities.density)));
        addView(l81Var, k7.b6.n(-1, -1));
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
        long j10 = this.d;
        me meVar = this.v;
        int i11 = this.a;
        if (i10 == 1) {
            if (this.f == null || !meVar.c1) {
                return;
            }
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i11).getInputPeer(j10);
            tL_payments_getStarsTransactions.offset = this.f;
            tL_payments_getStarsTransactions.limit = this.h.isEmpty() ? 5 : 20;
            final int i12 = 0;
            ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) { // from class: org.telegram.ui.ee
                public final /* synthetic */ ie b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i12) {
                        case 0:
                            final int i13 = 1;
                            final ie ieVar = this.b;
                            final int i14 = i10;
                            final boolean z4 = a2;
                            final boolean z10 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.fe
                                @Override // java.lang.Runnable
                                public final void run() {
                                    rd rdVar;
                                    rd rdVar2;
                                    switch (i13) {
                                        case 0:
                                            ie ieVar2 = ieVar;
                                            int i15 = ieVar2.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z11 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i16 = i14;
                                            if (z11) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i15).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i15).putChats(starsStatus.chats, false);
                                                ieVar2.n.addAll(starsStatus.history);
                                                ieVar2.r = starsStatus.next_offset;
                                                ieVar2.s[i16] = false;
                                                ieVar2.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.qc.b0(tL_error2);
                                                }
                                            }
                                            if (ieVar2.a() != z4 && (rdVar = ieVar2.e) != null) {
                                                rdVar.run();
                                            }
                                            if (ieVar2.b(i16) != z10) {
                                                ieVar2.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            ie ieVar3 = ieVar;
                                            int i17 = ieVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z12 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i18 = i14;
                                            if (z12) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i17).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i17).putChats(starsStatus2.chats, false);
                                                ieVar3.h.addAll(starsStatus2.history);
                                                ieVar3.f = starsStatus2.next_offset;
                                                ieVar3.s[i18] = false;
                                                ieVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.qc.b0(tL_error3);
                                                }
                                            }
                                            if (ieVar3.a() != z4 && (rdVar2 = ieVar3.e) != null) {
                                                rdVar2.run();
                                            }
                                            if (ieVar3.b(i18) != z10) {
                                                ieVar3.e();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i15 = 0;
                            final ie ieVar2 = this.b;
                            final int i16 = i10;
                            final boolean z11 = a2;
                            final boolean z12 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.fe
                                @Override // java.lang.Runnable
                                public final void run() {
                                    rd rdVar;
                                    rd rdVar2;
                                    switch (i15) {
                                        case 0:
                                            ie ieVar22 = ieVar2;
                                            int i152 = ieVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z112 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i162 = i16;
                                            if (z112) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i152).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i152).putChats(starsStatus.chats, false);
                                                ieVar22.n.addAll(starsStatus.history);
                                                ieVar22.r = starsStatus.next_offset;
                                                ieVar22.s[i162] = false;
                                                ieVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.qc.b0(tL_error2);
                                                }
                                            }
                                            if (ieVar22.a() != z11 && (rdVar = ieVar22.e) != null) {
                                                rdVar.run();
                                            }
                                            if (ieVar22.b(i162) != z12) {
                                                ieVar22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            ie ieVar3 = ieVar2;
                                            int i17 = ieVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z122 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i18 = i16;
                                            if (z122) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i17).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i17).putChats(starsStatus2.chats, false);
                                                ieVar3.h.addAll(starsStatus2.history);
                                                ieVar3.f = starsStatus2.next_offset;
                                                ieVar3.s[i18] = false;
                                                ieVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.qc.b0(tL_error3);
                                                }
                                            }
                                            if (ieVar3.a() != z11 && (rdVar2 = ieVar3.e) != null) {
                                                rdVar2.run();
                                            }
                                            if (ieVar3.b(i18) != z12) {
                                                ieVar3.e();
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
        if (i10 == 0 && this.r != null && meVar.d1) {
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions2.ton = false;
            tL_payments_getStarsTransactions2.peer = MessagesController.getInstance(i11).getInputPeer(j10);
            tL_payments_getStarsTransactions2.offset = this.r;
            tL_payments_getStarsTransactions2.limit = this.n.isEmpty() ? 5 : 20;
            final int i13 = 1;
            ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) { // from class: org.telegram.ui.ee
                public final /* synthetic */ ie b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i13) {
                        case 0:
                            final int i132 = 1;
                            final ie ieVar = this.b;
                            final int i14 = i10;
                            final boolean z4 = a2;
                            final boolean z10 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.fe
                                @Override // java.lang.Runnable
                                public final void run() {
                                    rd rdVar;
                                    rd rdVar2;
                                    switch (i132) {
                                        case 0:
                                            ie ieVar22 = ieVar;
                                            int i152 = ieVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z112 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i162 = i14;
                                            if (z112) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i152).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i152).putChats(starsStatus.chats, false);
                                                ieVar22.n.addAll(starsStatus.history);
                                                ieVar22.r = starsStatus.next_offset;
                                                ieVar22.s[i162] = false;
                                                ieVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.qc.b0(tL_error2);
                                                }
                                            }
                                            if (ieVar22.a() != z4 && (rdVar = ieVar22.e) != null) {
                                                rdVar.run();
                                            }
                                            if (ieVar22.b(i162) != z10) {
                                                ieVar22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            ie ieVar3 = ieVar;
                                            int i17 = ieVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z122 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i18 = i14;
                                            if (z122) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i17).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i17).putChats(starsStatus2.chats, false);
                                                ieVar3.h.addAll(starsStatus2.history);
                                                ieVar3.f = starsStatus2.next_offset;
                                                ieVar3.s[i18] = false;
                                                ieVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.qc.b0(tL_error3);
                                                }
                                            }
                                            if (ieVar3.a() != z4 && (rdVar2 = ieVar3.e) != null) {
                                                rdVar2.run();
                                            }
                                            if (ieVar3.b(i18) != z10) {
                                                ieVar3.e();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i15 = 0;
                            final ie ieVar2 = this.b;
                            final int i16 = i10;
                            final boolean z11 = a2;
                            final boolean z12 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.fe
                                @Override // java.lang.Runnable
                                public final void run() {
                                    rd rdVar;
                                    rd rdVar2;
                                    switch (i15) {
                                        case 0:
                                            ie ieVar22 = ieVar2;
                                            int i152 = ieVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z112 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i162 = i16;
                                            if (z112) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i152).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i152).putChats(starsStatus.chats, false);
                                                ieVar22.n.addAll(starsStatus.history);
                                                ieVar22.r = starsStatus.next_offset;
                                                ieVar22.s[i162] = false;
                                                ieVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.qc.b0(tL_error2);
                                                }
                                            }
                                            if (ieVar22.a() != z11 && (rdVar = ieVar22.e) != null) {
                                                rdVar.run();
                                            }
                                            if (ieVar22.b(i162) != z12) {
                                                ieVar22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            ie ieVar3 = ieVar2;
                                            int i17 = ieVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z122 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i18 = i16;
                                            if (z122) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i17).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i17).putChats(starsStatus2.chats, false);
                                                ieVar3.h.addAll(starsStatus2.history);
                                                ieVar3.f = starsStatus2.next_offset;
                                                ieVar3.s[i18] = false;
                                                ieVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.qc.b0(tL_error3);
                                                }
                                            }
                                            if (ieVar3.a() != z11 && (rdVar2 = ieVar3.e) != null) {
                                                rdVar2.run();
                                            }
                                            if (ieVar3.b(i18) != z12) {
                                                ieVar3.e();
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
            org.telegram.ui.Components.l81 l81Var = this.b;
            if (i10 >= l81Var.getViewPages().length) {
                return;
            }
            View view = l81Var.getViewPages()[i10];
            if (view instanceof ge) {
                ge geVar = (ge) view;
                org.telegram.ui.Components.g61 g61Var = geVar.a;
                g61Var.V2.N(true);
                if (g61Var.canScrollVertically(1)) {
                    for (int i11 = 0; i11 < g61Var.getChildCount(); i11++) {
                        if (!(g61Var.getChildAt(i11) instanceof org.telegram.ui.Components.u00)) {
                        }
                    }
                }
                geVar.e.run();
                break;
            }
            i10++;
        }
    }

    public final void e() {
        this.c.i();
        org.telegram.ui.Components.l81 l81Var = this.b;
        l81Var.o(false);
        View[] viewArr = l81Var.e;
        int[] iArr = l81Var.f;
        if (iArr[0] != l81Var.I.h(l81Var.b)) {
            l81Var.I(0);
            View view = viewArr[1];
            if (view != null) {
                l81Var.h.put(iArr[1], view);
                l81Var.removeView(viewArr[1]);
                viewArr[1] = null;
            }
            viewArr[0].setTranslationX(0.0f);
        }
    }

    public org.telegram.ui.Components.rl0 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof ge) {
            return ((ge) currentView).a;
        }
        return null;
    }
}
