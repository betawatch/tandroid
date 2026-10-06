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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class ie extends LinearLayout {
    public static final /* synthetic */ int x = 0;
    public final int a;
    public final fe b;
    public final he c;
    public final k0 d;
    public final long e;
    public final pd f;
    public String h;
    public final ArrayList n;
    public final ArrayList r;
    public String s;
    public final boolean[] v;
    public final /* synthetic */ me w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie(me meVar, Context context, int i10, long j3, int i11, pd pdVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.w = meVar;
        this.h = "";
        this.n = new ArrayList();
        this.r = new ArrayList();
        this.s = "";
        this.v = new boolean[]{false, false};
        this.a = i10;
        this.e = j3;
        this.f = pdVar;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        fe feVar = new fe(this, context, d6Var, meVar);
        this.b = feVar;
        he heVar = new he(this, context, i10, j3, i11, d6Var);
        this.c = heVar;
        feVar.setAdapter(heVar);
        org.telegram.ui.Components.g91 n10 = feVar.n(-2, true);
        li.p pVar = meVar.d1;
        if (pVar != null) {
            pVar.c(feVar);
        }
        k0 k0Var = new k0(this, context, 5);
        this.d = k0Var;
        k0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        k0Var.addView(n10, w7.z5.e(-1, 48, 48));
        addView(feVar, w7.z5.n(-1, -1));
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
        long j3 = this.e;
        me meVar = this.w;
        int i11 = this.a;
        if (i10 == 1) {
            if (this.h == null || !meVar.b1) {
                return;
            }
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i11).getInputPeer(j3);
            tL_payments_getStarsTransactions.offset = this.h;
            tL_payments_getStarsTransactions.limit = this.n.isEmpty() ? 5 : 20;
            final int i12 = 0;
            ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) { // from class: org.telegram.ui.de
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
                            final boolean z10 = a2;
                            final boolean z11 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ee
                                @Override // java.lang.Runnable
                                public final void run() {
                                    pd pdVar;
                                    pd pdVar2;
                                    switch (i13) {
                                        case 0:
                                            ie ieVar2 = ieVar;
                                            int i15 = ieVar2.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z12 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i16 = i14;
                                            if (z12) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i15).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i15).putChats(starsStatus.chats, false);
                                                ieVar2.r.addAll(starsStatus.history);
                                                ieVar2.s = starsStatus.next_offset;
                                                ieVar2.v[i16] = false;
                                                ieVar2.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.yc.b0(tL_error2);
                                                }
                                            }
                                            if (ieVar2.a() != z10 && (pdVar = ieVar2.f) != null) {
                                                pdVar.run();
                                            }
                                            if (ieVar2.b(i16) != z11) {
                                                ieVar2.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            ie ieVar3 = ieVar;
                                            int i17 = ieVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z13 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i18 = i14;
                                            if (z13) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i17).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i17).putChats(starsStatus2.chats, false);
                                                ieVar3.n.addAll(starsStatus2.history);
                                                ieVar3.h = starsStatus2.next_offset;
                                                ieVar3.v[i18] = false;
                                                ieVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.yc.b0(tL_error3);
                                                }
                                            }
                                            if (ieVar3.a() != z10 && (pdVar2 = ieVar3.f) != null) {
                                                pdVar2.run();
                                            }
                                            if (ieVar3.b(i18) != z11) {
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
                            final boolean z12 = a2;
                            final boolean z13 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ee
                                @Override // java.lang.Runnable
                                public final void run() {
                                    pd pdVar;
                                    pd pdVar2;
                                    switch (i15) {
                                        case 0:
                                            ie ieVar22 = ieVar2;
                                            int i152 = ieVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i162 = i16;
                                            if (z122) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i152).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i152).putChats(starsStatus.chats, false);
                                                ieVar22.r.addAll(starsStatus.history);
                                                ieVar22.s = starsStatus.next_offset;
                                                ieVar22.v[i162] = false;
                                                ieVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.yc.b0(tL_error2);
                                                }
                                            }
                                            if (ieVar22.a() != z12 && (pdVar = ieVar22.f) != null) {
                                                pdVar.run();
                                            }
                                            if (ieVar22.b(i162) != z13) {
                                                ieVar22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            ie ieVar3 = ieVar2;
                                            int i17 = ieVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i18 = i16;
                                            if (z132) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i17).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i17).putChats(starsStatus2.chats, false);
                                                ieVar3.n.addAll(starsStatus2.history);
                                                ieVar3.h = starsStatus2.next_offset;
                                                ieVar3.v[i18] = false;
                                                ieVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.yc.b0(tL_error3);
                                                }
                                            }
                                            if (ieVar3.a() != z12 && (pdVar2 = ieVar3.f) != null) {
                                                pdVar2.run();
                                            }
                                            if (ieVar3.b(i18) != z13) {
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
        if (i10 == 0 && this.s != null && meVar.c1) {
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions2.ton = false;
            tL_payments_getStarsTransactions2.peer = MessagesController.getInstance(i11).getInputPeer(j3);
            tL_payments_getStarsTransactions2.offset = this.s;
            tL_payments_getStarsTransactions2.limit = this.r.isEmpty() ? 5 : 20;
            final int i13 = 1;
            ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) { // from class: org.telegram.ui.de
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
                            final boolean z10 = a2;
                            final boolean z11 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ee
                                @Override // java.lang.Runnable
                                public final void run() {
                                    pd pdVar;
                                    pd pdVar2;
                                    switch (i132) {
                                        case 0:
                                            ie ieVar22 = ieVar;
                                            int i152 = ieVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i162 = i14;
                                            if (z122) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i152).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i152).putChats(starsStatus.chats, false);
                                                ieVar22.r.addAll(starsStatus.history);
                                                ieVar22.s = starsStatus.next_offset;
                                                ieVar22.v[i162] = false;
                                                ieVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.yc.b0(tL_error2);
                                                }
                                            }
                                            if (ieVar22.a() != z10 && (pdVar = ieVar22.f) != null) {
                                                pdVar.run();
                                            }
                                            if (ieVar22.b(i162) != z11) {
                                                ieVar22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            ie ieVar3 = ieVar;
                                            int i17 = ieVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i18 = i14;
                                            if (z132) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i17).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i17).putChats(starsStatus2.chats, false);
                                                ieVar3.n.addAll(starsStatus2.history);
                                                ieVar3.h = starsStatus2.next_offset;
                                                ieVar3.v[i18] = false;
                                                ieVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.yc.b0(tL_error3);
                                                }
                                            }
                                            if (ieVar3.a() != z10 && (pdVar2 = ieVar3.f) != null) {
                                                pdVar2.run();
                                            }
                                            if (ieVar3.b(i18) != z11) {
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
                            final boolean z12 = a2;
                            final boolean z13 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ee
                                @Override // java.lang.Runnable
                                public final void run() {
                                    pd pdVar;
                                    pd pdVar2;
                                    switch (i15) {
                                        case 0:
                                            ie ieVar22 = ieVar2;
                                            int i152 = ieVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i162 = i16;
                                            if (z122) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i152).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i152).putChats(starsStatus.chats, false);
                                                ieVar22.r.addAll(starsStatus.history);
                                                ieVar22.s = starsStatus.next_offset;
                                                ieVar22.v[i162] = false;
                                                ieVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.yc.b0(tL_error2);
                                                }
                                            }
                                            if (ieVar22.a() != z12 && (pdVar = ieVar22.f) != null) {
                                                pdVar.run();
                                            }
                                            if (ieVar22.b(i162) != z13) {
                                                ieVar22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            ie ieVar3 = ieVar2;
                                            int i17 = ieVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i18 = i16;
                                            if (z132) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i17).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i17).putChats(starsStatus2.chats, false);
                                                ieVar3.n.addAll(starsStatus2.history);
                                                ieVar3.h = starsStatus2.next_offset;
                                                ieVar3.v[i18] = false;
                                                ieVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.yc.b0(tL_error3);
                                                }
                                            }
                                            if (ieVar3.a() != z12 && (pdVar2 = ieVar3.f) != null) {
                                                pdVar2.run();
                                            }
                                            if (ieVar3.b(i18) != z13) {
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
            fe feVar = this.b;
            if (i10 >= feVar.getViewPages().length) {
                return;
            }
            View view = feVar.getViewPages()[i10];
            if (view instanceof ge) {
                ge geVar = (ge) view;
                org.telegram.ui.Components.e71 e71Var = geVar.a;
                e71Var.f3.N(true);
                if (e71Var.canScrollVertically(1)) {
                    for (int i11 = 0; i11 < e71Var.getChildCount(); i11++) {
                        if (!(e71Var.getChildAt(i11) instanceof org.telegram.ui.Components.w00)) {
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
        he heVar = this.c;
        ArrayList arrayList = heVar.e;
        ArrayList arrayList2 = heVar.e;
        int size = arrayList.size();
        fe feVar = this.b;
        int h = size == 0 ? -1 : heVar.h(feVar.getCurrentPosition());
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            i10 |= 1 << heVar.h(i11);
        }
        heVar.i();
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            int h10 = heVar.h(i14);
            i12 |= 1 << h10;
            if (h10 == h) {
                i13 = i14;
            }
        }
        if (i10 == i12) {
            return;
        }
        feVar.onTouchEvent(null);
        feVar.setPosition(i13);
        feVar.J();
        feVar.o(false);
        this.w.l();
    }

    public org.telegram.ui.Components.zl0 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof ge) {
            return ((ge) currentView).a;
        }
        return null;
    }
}
