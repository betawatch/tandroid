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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class he extends LinearLayout {
    public final int a;
    public final org.telegram.ui.Components.v81 b;
    public final ge c;
    public final long d;
    public final pd e;
    public String f;
    public final ArrayList h;
    public final ArrayList n;
    public String r;
    public final boolean[] s;
    public final /* synthetic */ le v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he(le leVar, Context context, int i10, long j3, int i11, pd pdVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.v = leVar;
        this.f = "";
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = "";
        this.s = new boolean[]{false, false};
        this.a = i10;
        this.d = j3;
        this.e = pdVar;
        setOrientation(1);
        org.telegram.ui.Components.v81 v81Var = new org.telegram.ui.Components.v81(context, null);
        this.b = v81Var;
        ge geVar = new ge(this, context, i10, j3, i11, f6Var);
        this.c = geVar;
        v81Var.setAdapter(geVar);
        View n10 = v81Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d7, f6Var));
        addView(n10, w7.a6.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.a6.z(-1.0f), w7.a6.z(1.0f / AndroidUtilities.density)));
        addView(v81Var, w7.a6.n(-1, -1));
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
        le leVar = this.v;
        int i11 = this.a;
        if (i10 == 1) {
            if (this.f == null || !leVar.f1) {
                return;
            }
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i11).getInputPeer(j3);
            tL_payments_getStarsTransactions.offset = this.f;
            tL_payments_getStarsTransactions.limit = this.h.isEmpty() ? 5 : 20;
            final int i12 = 0;
            ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) { // from class: org.telegram.ui.de
                public final /* synthetic */ he b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i12) {
                        case 0:
                            final int i13 = 1;
                            final he heVar = this.b;
                            final int i14 = i10;
                            final boolean z10 = a2;
                            final boolean z11 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ee
                                @Override // java.lang.Runnable
                                public final void run() {
                                    pd pdVar;
                                    pd pdVar2;
                                    switch (i13) {
                                        case 0:
                                            he heVar2 = heVar;
                                            int i15 = heVar2.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z12 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i16 = i14;
                                            if (z12) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i15).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i15).putChats(starsStatus.chats, false);
                                                heVar2.n.addAll(starsStatus.history);
                                                heVar2.r = starsStatus.next_offset;
                                                heVar2.s[i16] = false;
                                                heVar2.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.wc.b0(tL_error2);
                                                }
                                            }
                                            if (heVar2.a() != z10 && (pdVar = heVar2.e) != null) {
                                                pdVar.run();
                                            }
                                            if (heVar2.b(i16) != z11) {
                                                heVar2.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            he heVar3 = heVar;
                                            int i17 = heVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z13 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i18 = i14;
                                            if (z13) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i17).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i17).putChats(starsStatus2.chats, false);
                                                heVar3.h.addAll(starsStatus2.history);
                                                heVar3.f = starsStatus2.next_offset;
                                                heVar3.s[i18] = false;
                                                heVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.wc.b0(tL_error3);
                                                }
                                            }
                                            if (heVar3.a() != z10 && (pdVar2 = heVar3.e) != null) {
                                                pdVar2.run();
                                            }
                                            if (heVar3.b(i18) != z11) {
                                                heVar3.e();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i15 = 0;
                            final he heVar2 = this.b;
                            final int i16 = i10;
                            final boolean z12 = a2;
                            final boolean z13 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ee
                                @Override // java.lang.Runnable
                                public final void run() {
                                    pd pdVar;
                                    pd pdVar2;
                                    switch (i15) {
                                        case 0:
                                            he heVar22 = heVar2;
                                            int i152 = heVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i162 = i16;
                                            if (z122) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i152).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i152).putChats(starsStatus.chats, false);
                                                heVar22.n.addAll(starsStatus.history);
                                                heVar22.r = starsStatus.next_offset;
                                                heVar22.s[i162] = false;
                                                heVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.wc.b0(tL_error2);
                                                }
                                            }
                                            if (heVar22.a() != z12 && (pdVar = heVar22.e) != null) {
                                                pdVar.run();
                                            }
                                            if (heVar22.b(i162) != z13) {
                                                heVar22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            he heVar3 = heVar2;
                                            int i17 = heVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i18 = i16;
                                            if (z132) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i17).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i17).putChats(starsStatus2.chats, false);
                                                heVar3.h.addAll(starsStatus2.history);
                                                heVar3.f = starsStatus2.next_offset;
                                                heVar3.s[i18] = false;
                                                heVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.wc.b0(tL_error3);
                                                }
                                            }
                                            if (heVar3.a() != z12 && (pdVar2 = heVar3.e) != null) {
                                                pdVar2.run();
                                            }
                                            if (heVar3.b(i18) != z13) {
                                                heVar3.e();
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
        if (i10 == 0 && this.r != null && leVar.g1) {
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions2.ton = false;
            tL_payments_getStarsTransactions2.peer = MessagesController.getInstance(i11).getInputPeer(j3);
            tL_payments_getStarsTransactions2.offset = this.r;
            tL_payments_getStarsTransactions2.limit = this.n.isEmpty() ? 5 : 20;
            final int i13 = 1;
            ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) { // from class: org.telegram.ui.de
                public final /* synthetic */ he b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i13) {
                        case 0:
                            final int i132 = 1;
                            final he heVar = this.b;
                            final int i14 = i10;
                            final boolean z10 = a2;
                            final boolean z11 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ee
                                @Override // java.lang.Runnable
                                public final void run() {
                                    pd pdVar;
                                    pd pdVar2;
                                    switch (i132) {
                                        case 0:
                                            he heVar22 = heVar;
                                            int i152 = heVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i162 = i14;
                                            if (z122) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i152).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i152).putChats(starsStatus.chats, false);
                                                heVar22.n.addAll(starsStatus.history);
                                                heVar22.r = starsStatus.next_offset;
                                                heVar22.s[i162] = false;
                                                heVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.wc.b0(tL_error2);
                                                }
                                            }
                                            if (heVar22.a() != z10 && (pdVar = heVar22.e) != null) {
                                                pdVar.run();
                                            }
                                            if (heVar22.b(i162) != z11) {
                                                heVar22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            he heVar3 = heVar;
                                            int i17 = heVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i18 = i14;
                                            if (z132) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i17).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i17).putChats(starsStatus2.chats, false);
                                                heVar3.h.addAll(starsStatus2.history);
                                                heVar3.f = starsStatus2.next_offset;
                                                heVar3.s[i18] = false;
                                                heVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.wc.b0(tL_error3);
                                                }
                                            }
                                            if (heVar3.a() != z10 && (pdVar2 = heVar3.e) != null) {
                                                pdVar2.run();
                                            }
                                            if (heVar3.b(i18) != z11) {
                                                heVar3.e();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i15 = 0;
                            final he heVar2 = this.b;
                            final int i16 = i10;
                            final boolean z12 = a2;
                            final boolean z13 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ee
                                @Override // java.lang.Runnable
                                public final void run() {
                                    pd pdVar;
                                    pd pdVar2;
                                    switch (i15) {
                                        case 0:
                                            he heVar22 = heVar2;
                                            int i152 = heVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i162 = i16;
                                            if (z122) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i152).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i152).putChats(starsStatus.chats, false);
                                                heVar22.n.addAll(starsStatus.history);
                                                heVar22.r = starsStatus.next_offset;
                                                heVar22.s[i162] = false;
                                                heVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.wc.b0(tL_error2);
                                                }
                                            }
                                            if (heVar22.a() != z12 && (pdVar = heVar22.e) != null) {
                                                pdVar.run();
                                            }
                                            if (heVar22.b(i162) != z13) {
                                                heVar22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            he heVar3 = heVar2;
                                            int i17 = heVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i18 = i16;
                                            if (z132) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i17).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i17).putChats(starsStatus2.chats, false);
                                                heVar3.h.addAll(starsStatus2.history);
                                                heVar3.f = starsStatus2.next_offset;
                                                heVar3.s[i18] = false;
                                                heVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.wc.b0(tL_error3);
                                                }
                                            }
                                            if (heVar3.a() != z12 && (pdVar2 = heVar3.e) != null) {
                                                pdVar2.run();
                                            }
                                            if (heVar3.b(i18) != z13) {
                                                heVar3.e();
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
            org.telegram.ui.Components.v81 v81Var = this.b;
            if (i10 >= v81Var.getViewPages().length) {
                return;
            }
            View view = v81Var.getViewPages()[i10];
            if (view instanceof fe) {
                fe feVar = (fe) view;
                org.telegram.ui.Components.r61 r61Var = feVar.a;
                r61Var.Y2.N(true);
                if (r61Var.canScrollVertically(1)) {
                    for (int i11 = 0; i11 < r61Var.getChildCount(); i11++) {
                        if (!(r61Var.getChildAt(i11) instanceof org.telegram.ui.Components.a10)) {
                        }
                    }
                }
                feVar.e.run();
                break;
            }
            i10++;
        }
    }

    public final void e() {
        this.c.i();
        org.telegram.ui.Components.v81 v81Var = this.b;
        v81Var.o(false);
        View[] viewArr = v81Var.e;
        int[] iArr = v81Var.f;
        if (iArr[0] != v81Var.L.h(v81Var.b)) {
            v81Var.I(0);
            View view = viewArr[1];
            if (view != null) {
                v81Var.h.put(iArr[1], view);
                v81Var.removeView(viewArr[1]);
                viewArr[1] = null;
            }
            viewArr[0].setTranslationX(0.0f);
        }
    }

    public org.telegram.ui.Components.vl0 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof fe) {
            return ((fe) currentView).a;
        }
        return null;
    }
}
