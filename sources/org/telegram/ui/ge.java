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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ge extends LinearLayout {
    public static final /* synthetic */ int x = 0;
    public final int a;
    public final de b;
    public final fe c;
    public final k0 d;
    public final long e;
    public final pd f;
    public String h;
    public final ArrayList n;
    public final ArrayList r;
    public String s;
    public final boolean[] v;
    public final /* synthetic */ ke w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge(ke keVar, Context context, int i10, long j10, int i11, pd pdVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.w = keVar;
        this.h = "";
        this.n = new ArrayList();
        this.r = new ArrayList();
        this.s = "";
        this.v = new boolean[]{false, false};
        this.a = i10;
        this.e = j10;
        this.f = pdVar;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        de deVar = new de(this, context, u6Var, keVar);
        this.b = deVar;
        fe feVar = new fe(this, context, i10, j10, i11, u6Var);
        this.c = feVar;
        deVar.setAdapter(feVar);
        org.telegram.ui.Components.t91 n10 = deVar.n(-2, true);
        oi.q qVar = keVar.d1;
        if (qVar != null) {
            qVar.c(deVar);
        }
        k0 k0Var = new k0(this, context, 5);
        this.d = k0Var;
        k0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        k0Var.addView(n10, org.telegram.ui.Components.gb1.i(-1, 48, 48));
        addView(deVar, org.telegram.ui.Components.gb1.r(-1, -1));
        c(1);
        c(0);
    }

    public final boolean a() {
        return (this.n.isEmpty() && this.r.isEmpty()) ? false : true;
    }

    public final boolean b(int i10) {
        boolean isEmpty;
        if (i10 == 1) {
            isEmpty = this.n.isEmpty();
        } else {
            if (i10 != 0) {
                return false;
            }
            isEmpty = this.r.isEmpty();
        }
        return !isEmpty;
    }

    public final void c(final int i10) {
        boolean[] zArr = this.v;
        if (zArr[i10]) {
            return;
        }
        final boolean a2 = a();
        final boolean b10 = b(i10);
        long j10 = this.e;
        ke keVar = this.w;
        int i11 = this.a;
        if (i10 == 1) {
            if (this.h == null || !keVar.b1) {
                return;
            }
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i11).getInputPeer(j10);
            tL_payments_getStarsTransactions.offset = this.h;
            tL_payments_getStarsTransactions.limit = this.n.isEmpty() ? 5 : 20;
            final int i12 = 0;
            ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) { // from class: org.telegram.ui.be
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
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ce
                                @Override // java.lang.Runnable
                                public final void run() {
                                    pd pdVar;
                                    pd pdVar2;
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
                                                geVar2.r.addAll(starsStatus.history);
                                                geVar2.s = starsStatus.next_offset;
                                                geVar2.v[i16] = false;
                                                geVar2.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                                }
                                            }
                                            if (geVar2.a() != z10 && (pdVar = geVar2.f) != null) {
                                                pdVar.run();
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
                                                geVar3.n.addAll(starsStatus2.history);
                                                geVar3.h = starsStatus2.next_offset;
                                                geVar3.v[i18] = false;
                                                geVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.wc.e0(tL_error3);
                                                }
                                            }
                                            if (geVar3.a() != z10 && (pdVar2 = geVar3.f) != null) {
                                                pdVar2.run();
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
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ce
                                @Override // java.lang.Runnable
                                public final void run() {
                                    pd pdVar;
                                    pd pdVar2;
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
                                                geVar22.r.addAll(starsStatus.history);
                                                geVar22.s = starsStatus.next_offset;
                                                geVar22.v[i162] = false;
                                                geVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                                }
                                            }
                                            if (geVar22.a() != z12 && (pdVar = geVar22.f) != null) {
                                                pdVar.run();
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
                                                geVar3.n.addAll(starsStatus2.history);
                                                geVar3.h = starsStatus2.next_offset;
                                                geVar3.v[i18] = false;
                                                geVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.wc.e0(tL_error3);
                                                }
                                            }
                                            if (geVar3.a() != z12 && (pdVar2 = geVar3.f) != null) {
                                                pdVar2.run();
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
        if (i10 == 0 && this.s != null && keVar.c1) {
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions2.ton = false;
            tL_payments_getStarsTransactions2.peer = MessagesController.getInstance(i11).getInputPeer(j10);
            tL_payments_getStarsTransactions2.offset = this.s;
            tL_payments_getStarsTransactions2.limit = this.r.isEmpty() ? 5 : 20;
            final int i13 = 1;
            ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) { // from class: org.telegram.ui.be
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
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ce
                                @Override // java.lang.Runnable
                                public final void run() {
                                    pd pdVar;
                                    pd pdVar2;
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
                                                geVar22.r.addAll(starsStatus.history);
                                                geVar22.s = starsStatus.next_offset;
                                                geVar22.v[i162] = false;
                                                geVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                                }
                                            }
                                            if (geVar22.a() != z10 && (pdVar = geVar22.f) != null) {
                                                pdVar.run();
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
                                                geVar3.n.addAll(starsStatus2.history);
                                                geVar3.h = starsStatus2.next_offset;
                                                geVar3.v[i18] = false;
                                                geVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.wc.e0(tL_error3);
                                                }
                                            }
                                            if (geVar3.a() != z10 && (pdVar2 = geVar3.f) != null) {
                                                pdVar2.run();
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
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ce
                                @Override // java.lang.Runnable
                                public final void run() {
                                    pd pdVar;
                                    pd pdVar2;
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
                                                geVar22.r.addAll(starsStatus.history);
                                                geVar22.s = starsStatus.next_offset;
                                                geVar22.v[i162] = false;
                                                geVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                                }
                                            }
                                            if (geVar22.a() != z12 && (pdVar = geVar22.f) != null) {
                                                pdVar.run();
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
                                                geVar3.n.addAll(starsStatus2.history);
                                                geVar3.h = starsStatus2.next_offset;
                                                geVar3.v[i18] = false;
                                                geVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.wc.e0(tL_error3);
                                                }
                                            }
                                            if (geVar3.a() != z12 && (pdVar2 = geVar3.f) != null) {
                                                pdVar2.run();
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
            de deVar = this.b;
            if (i10 >= deVar.getViewPages().length) {
                return;
            }
            View view = deVar.getViewPages()[i10];
            if (view instanceof ee) {
                ee eeVar = (ee) view;
                org.telegram.ui.Components.r71 r71Var = eeVar.a;
                r71Var.g3.O(true);
                if (r71Var.canScrollVertically(1)) {
                    for (int i11 = 0; i11 < r71Var.getChildCount(); i11++) {
                        if (!(r71Var.getChildAt(i11) instanceof org.telegram.ui.Components.c10)) {
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
        fe feVar = this.c;
        ArrayList arrayList = feVar.e;
        ArrayList arrayList2 = feVar.e;
        int size = arrayList.size();
        de deVar = this.b;
        int h = size == 0 ? -1 : feVar.h(deVar.getCurrentPosition());
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            i10 |= 1 << feVar.h(i11);
        }
        feVar.i();
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            int h10 = feVar.h(i14);
            i12 |= 1 << h10;
            if (h10 == h) {
                i13 = i14;
            }
        }
        if (i10 == i12) {
            return;
        }
        deVar.onTouchEvent(null);
        deVar.setPosition(i13);
        deVar.J();
        deVar.o(false);
        this.w.l();
    }

    public org.telegram.ui.Components.mm0 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof ee) {
            return ((ee) currentView).a;
        }
        return null;
    }
}
