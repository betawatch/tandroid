package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class he extends LinearLayout {
    public static final /* synthetic */ int y = 0;
    public final int a;
    public final ee b;
    public final ge c;
    public final l0 d;
    public final long e;
    public final md f;
    public String h;
    public final ArrayList n;
    public final ArrayList r;
    public String s;
    public final boolean[] w;
    public final /* synthetic */ le x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he(le leVar, Context context, int i10, long j10, int i11, md mdVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.x = leVar;
        this.h = "";
        this.n = new ArrayList();
        this.r = new ArrayList();
        this.s = "";
        this.w = new boolean[]{false, false};
        this.a = i10;
        this.e = j10;
        this.f = mdVar;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        ee eeVar = new ee(this, context, p6Var, leVar);
        this.b = eeVar;
        ge geVar = new ge(this, context, i10, j10, i11, p6Var);
        this.c = geVar;
        eeVar.setAdapter(geVar);
        org.telegram.ui.Components.v71 n10 = eeVar.n(-2, true);
        ei.r rVar = leVar.d1;
        if (rVar != null) {
            rVar.c(eeVar);
        }
        l0 l0Var = new l0(this, context, 5);
        this.d = l0Var;
        l0Var.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
        l0Var.addView(n10, w7.b6.e(-1, 48, 48));
        addView(eeVar, w7.b6.o(-1, -1));
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
        boolean[] zArr = this.w;
        if (zArr[i10]) {
            return;
        }
        final boolean a2 = a();
        final boolean b10 = b(i10);
        long j10 = this.e;
        le leVar = this.x;
        int i11 = this.a;
        if (i10 == 1) {
            if (this.h == null || !leVar.b1) {
                return;
            }
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            tL_payments_getStarsTransactions.peer = org.telegram.messenger.vp.r1(i11).i1(j10);
            tL_payments_getStarsTransactions.offset = this.h;
            tL_payments_getStarsTransactions.limit = this.n.isEmpty() ? 5 : 20;
            final int i12 = 0;
            ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) { // from class: org.telegram.ui.ce
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
                            org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.de
                                @Override // java.lang.Runnable
                                public final void run() {
                                    md mdVar;
                                    md mdVar2;
                                    switch (i13) {
                                        case 0:
                                            he heVar2 = heVar;
                                            int i15 = heVar2.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z12 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i16 = i14;
                                            if (z12) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                org.telegram.messenger.vp.r1(i15).V3(starsStatus.users, false);
                                                org.telegram.messenger.vp.r1(i15).P3(starsStatus.chats, false);
                                                heVar2.r.addAll(starsStatus.history);
                                                heVar2.s = starsStatus.next_offset;
                                                heVar2.w[i16] = false;
                                                heVar2.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.cc.d0(tL_error2);
                                                }
                                            }
                                            if (heVar2.a() != z10 && (mdVar = heVar2.f) != null) {
                                                mdVar.run();
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
                                                org.telegram.messenger.vp.r1(i17).V3(starsStatus2.users, false);
                                                org.telegram.messenger.vp.r1(i17).P3(starsStatus2.chats, false);
                                                heVar3.n.addAll(starsStatus2.history);
                                                heVar3.h = starsStatus2.next_offset;
                                                heVar3.w[i18] = false;
                                                heVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.cc.d0(tL_error3);
                                                }
                                            }
                                            if (heVar3.a() != z10 && (mdVar2 = heVar3.f) != null) {
                                                mdVar2.run();
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
                            org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.de
                                @Override // java.lang.Runnable
                                public final void run() {
                                    md mdVar;
                                    md mdVar2;
                                    switch (i15) {
                                        case 0:
                                            he heVar22 = heVar2;
                                            int i152 = heVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i162 = i16;
                                            if (z122) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                org.telegram.messenger.vp.r1(i152).V3(starsStatus.users, false);
                                                org.telegram.messenger.vp.r1(i152).P3(starsStatus.chats, false);
                                                heVar22.r.addAll(starsStatus.history);
                                                heVar22.s = starsStatus.next_offset;
                                                heVar22.w[i162] = false;
                                                heVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.cc.d0(tL_error2);
                                                }
                                            }
                                            if (heVar22.a() != z12 && (mdVar = heVar22.f) != null) {
                                                mdVar.run();
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
                                                org.telegram.messenger.vp.r1(i17).V3(starsStatus2.users, false);
                                                org.telegram.messenger.vp.r1(i17).P3(starsStatus2.chats, false);
                                                heVar3.n.addAll(starsStatus2.history);
                                                heVar3.h = starsStatus2.next_offset;
                                                heVar3.w[i18] = false;
                                                heVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.cc.d0(tL_error3);
                                                }
                                            }
                                            if (heVar3.a() != z12 && (mdVar2 = heVar3.f) != null) {
                                                mdVar2.run();
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
        if (i10 == 0 && this.s != null && leVar.c1) {
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions2.ton = false;
            tL_payments_getStarsTransactions2.peer = org.telegram.messenger.vp.r1(i11).i1(j10);
            tL_payments_getStarsTransactions2.offset = this.s;
            tL_payments_getStarsTransactions2.limit = this.r.isEmpty() ? 5 : 20;
            final int i13 = 1;
            ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) { // from class: org.telegram.ui.ce
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
                            org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.de
                                @Override // java.lang.Runnable
                                public final void run() {
                                    md mdVar;
                                    md mdVar2;
                                    switch (i132) {
                                        case 0:
                                            he heVar22 = heVar;
                                            int i152 = heVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i162 = i14;
                                            if (z122) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                org.telegram.messenger.vp.r1(i152).V3(starsStatus.users, false);
                                                org.telegram.messenger.vp.r1(i152).P3(starsStatus.chats, false);
                                                heVar22.r.addAll(starsStatus.history);
                                                heVar22.s = starsStatus.next_offset;
                                                heVar22.w[i162] = false;
                                                heVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.cc.d0(tL_error2);
                                                }
                                            }
                                            if (heVar22.a() != z10 && (mdVar = heVar22.f) != null) {
                                                mdVar.run();
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
                                                org.telegram.messenger.vp.r1(i17).V3(starsStatus2.users, false);
                                                org.telegram.messenger.vp.r1(i17).P3(starsStatus2.chats, false);
                                                heVar3.n.addAll(starsStatus2.history);
                                                heVar3.h = starsStatus2.next_offset;
                                                heVar3.w[i18] = false;
                                                heVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.cc.d0(tL_error3);
                                                }
                                            }
                                            if (heVar3.a() != z10 && (mdVar2 = heVar3.f) != null) {
                                                mdVar2.run();
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
                            org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.de
                                @Override // java.lang.Runnable
                                public final void run() {
                                    md mdVar;
                                    md mdVar2;
                                    switch (i15) {
                                        case 0:
                                            he heVar22 = heVar2;
                                            int i152 = heVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i162 = i16;
                                            if (z122) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                org.telegram.messenger.vp.r1(i152).V3(starsStatus.users, false);
                                                org.telegram.messenger.vp.r1(i152).P3(starsStatus.chats, false);
                                                heVar22.r.addAll(starsStatus.history);
                                                heVar22.s = starsStatus.next_offset;
                                                heVar22.w[i162] = false;
                                                heVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.cc.d0(tL_error2);
                                                }
                                            }
                                            if (heVar22.a() != z12 && (mdVar = heVar22.f) != null) {
                                                mdVar.run();
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
                                                org.telegram.messenger.vp.r1(i17).V3(starsStatus2.users, false);
                                                org.telegram.messenger.vp.r1(i17).P3(starsStatus2.chats, false);
                                                heVar3.n.addAll(starsStatus2.history);
                                                heVar3.h = starsStatus2.next_offset;
                                                heVar3.w[i18] = false;
                                                heVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.cc.d0(tL_error3);
                                                }
                                            }
                                            if (heVar3.a() != z12 && (mdVar2 = heVar3.f) != null) {
                                                mdVar2.run();
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
            ee eeVar = this.b;
            if (i10 >= eeVar.getViewPages().length) {
                return;
            }
            View view = eeVar.getViewPages()[i10];
            if (view instanceof fe) {
                fe feVar = (fe) view;
                org.telegram.ui.Components.u51 u51Var = feVar.a;
                u51Var.f3.O(true);
                if (u51Var.canScrollVertically(1)) {
                    for (int i11 = 0; i11 < u51Var.getChildCount(); i11++) {
                        if (!(u51Var.getChildAt(i11) instanceof org.telegram.ui.Components.zz)) {
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
        ge geVar = this.c;
        ArrayList arrayList = geVar.e;
        ArrayList arrayList2 = geVar.e;
        int size = arrayList.size();
        ee eeVar = this.b;
        int h = size == 0 ? -1 : geVar.h(eeVar.getCurrentPosition());
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            i10 |= 1 << geVar.h(i11);
        }
        geVar.i();
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            int h10 = geVar.h(i14);
            i12 |= 1 << h10;
            if (h10 == h) {
                i13 = i14;
            }
        }
        if (i10 == i12) {
            return;
        }
        eeVar.onTouchEvent(null);
        eeVar.setPosition(i13);
        eeVar.J();
        eeVar.o(false);
        this.x.p();
    }

    public org.telegram.ui.Components.tk0 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof fe) {
            return ((fe) currentView).a;
        }
        return null;
    }
}
