package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class pr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pv0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ pr0(pv0 pv0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.a = i12;
        this.b = pv0Var;
        this.c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pv0 pv0Var = this.b;
                NotificationCenter.getInstance(pv0Var.v1.getCurrentAccount()).doOnIdle(new pr0(pv0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                pv0 pv0Var2 = this.b;
                ev0[] ev0VarArr = pv0Var2.t1;
                if (this.c == null) {
                    int i10 = this.e;
                    ev0 ev0Var = ev0VarArr[i10];
                    if (this.d == ev0Var.p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f;
                        ev0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                nu0 nu0Var = new nu0();
                                nu0Var.c = i13;
                                nu0Var.d = tL_searchResultPosition.msg_id;
                                nu0Var.b = tL_searchResultPosition.offset;
                                nu0Var.a = LocaleController.formatYearMont(i13, true);
                                ev0VarArr[i10].e.add(nu0Var);
                            }
                        }
                        Collections.sort(ev0VarArr[i10].e, new org.telegram.ui.ff(17));
                        ev0 ev0Var2 = ev0VarArr[i10];
                        ev0Var2.f[0] = tL_messages_searchResultsPositions.count;
                        ev0Var2.h = true;
                        if (!ev0Var2.e.isEmpty()) {
                            while (true) {
                                iu0[] iu0VarArr = pv0Var2.k0;
                                if (i11 < iu0VarArr.length) {
                                    iu0 iu0Var = iu0VarArr[i11];
                                    if (iu0Var.F == i10) {
                                        iu0Var.b = true;
                                        pv0Var2.o1(iu0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        pv0Var2.H.l();
                        break;
                    }
                }
                break;
        }
    }
}
