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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ee extends LinearLayout {
    public final int a;
    public final org.telegram.ui.Components.l91 b;
    public final de c;
    public final long d;
    public final od e;
    public String f;
    public final ArrayList h;
    public final ArrayList n;
    public String r;
    public final boolean[] s;
    public final /* synthetic */ ie v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee(ie ieVar, Context context, int i10, long j10, int i11, od odVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.v = ieVar;
        this.f = "";
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = "";
        this.s = new boolean[]{false, false};
        this.a = i10;
        this.d = j10;
        this.e = odVar;
        setOrientation(1);
        org.telegram.ui.Components.l91 l91Var = new org.telegram.ui.Components.l91(context, null);
        this.b = l91Var;
        de deVar = new de(this, context, i10, j10, i11, g6Var);
        this.c = deVar;
        l91Var.setAdapter(deVar);
        View n10 = l91Var.n(3, true);
        View view = new View(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view, g6Var);
        addView(n10, w7.z5.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.z5.z(-1.0f), w7.z5.z(1.0f / AndroidUtilities.density)));
        addView(l91Var, w7.z5.n(-1, -1));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, this, g6Var);
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
        ie ieVar = this.v;
        int i11 = this.a;
        if (i10 == 1) {
            if (this.f == null || !ieVar.f1) {
                return;
            }
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i11).getInputPeer(j10);
            tL_payments_getStarsTransactions.offset = this.f;
            tL_payments_getStarsTransactions.limit = this.h.isEmpty() ? 5 : 20;
            final int i12 = 0;
            ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) { // from class: org.telegram.ui.ae
                public final /* synthetic */ ee b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i12) {
                        case 0:
                            final int i13 = 1;
                            final ee eeVar = this.b;
                            final int i14 = i10;
                            final boolean z10 = a2;
                            final boolean z11 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.be
                                @Override // java.lang.Runnable
                                public final void run() {
                                    od odVar;
                                    od odVar2;
                                    switch (i13) {
                                        case 0:
                                            ee eeVar2 = eeVar;
                                            int i15 = eeVar2.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z12 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i16 = i14;
                                            if (z12) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i15).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i15).putChats(starsStatus.chats, false);
                                                eeVar2.n.addAll(starsStatus.history);
                                                eeVar2.r = starsStatus.next_offset;
                                                eeVar2.s[i16] = false;
                                                eeVar2.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.xc.d0(tL_error2);
                                                }
                                            }
                                            if (eeVar2.a() != z10 && (odVar = eeVar2.e) != null) {
                                                odVar.run();
                                            }
                                            if (eeVar2.b(i16) != z11) {
                                                eeVar2.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            ee eeVar3 = eeVar;
                                            int i17 = eeVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z13 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i18 = i14;
                                            if (z13) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i17).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i17).putChats(starsStatus2.chats, false);
                                                eeVar3.h.addAll(starsStatus2.history);
                                                eeVar3.f = starsStatus2.next_offset;
                                                eeVar3.s[i18] = false;
                                                eeVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.xc.d0(tL_error3);
                                                }
                                            }
                                            if (eeVar3.a() != z10 && (odVar2 = eeVar3.e) != null) {
                                                odVar2.run();
                                            }
                                            if (eeVar3.b(i18) != z11) {
                                                eeVar3.e();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i15 = 0;
                            final ee eeVar2 = this.b;
                            final int i16 = i10;
                            final boolean z12 = a2;
                            final boolean z13 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.be
                                @Override // java.lang.Runnable
                                public final void run() {
                                    od odVar;
                                    od odVar2;
                                    switch (i15) {
                                        case 0:
                                            ee eeVar22 = eeVar2;
                                            int i152 = eeVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i162 = i16;
                                            if (z122) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i152).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i152).putChats(starsStatus.chats, false);
                                                eeVar22.n.addAll(starsStatus.history);
                                                eeVar22.r = starsStatus.next_offset;
                                                eeVar22.s[i162] = false;
                                                eeVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.xc.d0(tL_error2);
                                                }
                                            }
                                            if (eeVar22.a() != z12 && (odVar = eeVar22.e) != null) {
                                                odVar.run();
                                            }
                                            if (eeVar22.b(i162) != z13) {
                                                eeVar22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            ee eeVar3 = eeVar2;
                                            int i17 = eeVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i18 = i16;
                                            if (z132) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i17).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i17).putChats(starsStatus2.chats, false);
                                                eeVar3.h.addAll(starsStatus2.history);
                                                eeVar3.f = starsStatus2.next_offset;
                                                eeVar3.s[i18] = false;
                                                eeVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.xc.d0(tL_error3);
                                                }
                                            }
                                            if (eeVar3.a() != z12 && (odVar2 = eeVar3.e) != null) {
                                                odVar2.run();
                                            }
                                            if (eeVar3.b(i18) != z13) {
                                                eeVar3.e();
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
        if (i10 == 0 && this.r != null && ieVar.g1) {
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions2.ton = false;
            tL_payments_getStarsTransactions2.peer = MessagesController.getInstance(i11).getInputPeer(j10);
            tL_payments_getStarsTransactions2.offset = this.r;
            tL_payments_getStarsTransactions2.limit = this.n.isEmpty() ? 5 : 20;
            final int i13 = 1;
            ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) { // from class: org.telegram.ui.ae
                public final /* synthetic */ ee b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i13) {
                        case 0:
                            final int i132 = 1;
                            final ee eeVar = this.b;
                            final int i14 = i10;
                            final boolean z10 = a2;
                            final boolean z11 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.be
                                @Override // java.lang.Runnable
                                public final void run() {
                                    od odVar;
                                    od odVar2;
                                    switch (i132) {
                                        case 0:
                                            ee eeVar22 = eeVar;
                                            int i152 = eeVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i162 = i14;
                                            if (z122) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i152).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i152).putChats(starsStatus.chats, false);
                                                eeVar22.n.addAll(starsStatus.history);
                                                eeVar22.r = starsStatus.next_offset;
                                                eeVar22.s[i162] = false;
                                                eeVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.xc.d0(tL_error2);
                                                }
                                            }
                                            if (eeVar22.a() != z10 && (odVar = eeVar22.e) != null) {
                                                odVar.run();
                                            }
                                            if (eeVar22.b(i162) != z11) {
                                                eeVar22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            ee eeVar3 = eeVar;
                                            int i17 = eeVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i18 = i14;
                                            if (z132) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i17).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i17).putChats(starsStatus2.chats, false);
                                                eeVar3.h.addAll(starsStatus2.history);
                                                eeVar3.f = starsStatus2.next_offset;
                                                eeVar3.s[i18] = false;
                                                eeVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.xc.d0(tL_error3);
                                                }
                                            }
                                            if (eeVar3.a() != z10 && (odVar2 = eeVar3.e) != null) {
                                                odVar2.run();
                                            }
                                            if (eeVar3.b(i18) != z11) {
                                                eeVar3.e();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i15 = 0;
                            final ee eeVar2 = this.b;
                            final int i16 = i10;
                            final boolean z12 = a2;
                            final boolean z13 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.be
                                @Override // java.lang.Runnable
                                public final void run() {
                                    od odVar;
                                    od odVar2;
                                    switch (i15) {
                                        case 0:
                                            ee eeVar22 = eeVar2;
                                            int i152 = eeVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i162 = i16;
                                            if (z122) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i152).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i152).putChats(starsStatus.chats, false);
                                                eeVar22.n.addAll(starsStatus.history);
                                                eeVar22.r = starsStatus.next_offset;
                                                eeVar22.s[i162] = false;
                                                eeVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.xc.d0(tL_error2);
                                                }
                                            }
                                            if (eeVar22.a() != z12 && (odVar = eeVar22.e) != null) {
                                                odVar.run();
                                            }
                                            if (eeVar22.b(i162) != z13) {
                                                eeVar22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            ee eeVar3 = eeVar2;
                                            int i17 = eeVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i18 = i16;
                                            if (z132) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i17).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i17).putChats(starsStatus2.chats, false);
                                                eeVar3.h.addAll(starsStatus2.history);
                                                eeVar3.f = starsStatus2.next_offset;
                                                eeVar3.s[i18] = false;
                                                eeVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.xc.d0(tL_error3);
                                                }
                                            }
                                            if (eeVar3.a() != z12 && (odVar2 = eeVar3.e) != null) {
                                                odVar2.run();
                                            }
                                            if (eeVar3.b(i18) != z13) {
                                                eeVar3.e();
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
            if (view instanceof ce) {
                ce ceVar = (ce) view;
                org.telegram.ui.Components.j71 j71Var = ceVar.a;
                j71Var.Z2.N(true);
                if (j71Var.canScrollVertically(1)) {
                    for (int i11 = 0; i11 < j71Var.getChildCount(); i11++) {
                        if (!(j71Var.getChildAt(i11) instanceof org.telegram.ui.Components.b10)) {
                        }
                    }
                }
                ceVar.e.run();
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
        if (currentView instanceof ce) {
            return ((ce) currentView).a;
        }
        return null;
    }
}
