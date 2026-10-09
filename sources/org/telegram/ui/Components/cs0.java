package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cs0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bw0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ cs0(bw0 bw0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.a = i12;
        this.b = bw0Var;
        this.c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bw0 bw0Var = this.b;
                NotificationCenter.getInstance(bw0Var.v1.getCurrentAccount()).doOnIdle(new cs0(bw0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                bw0 bw0Var2 = this.b;
                qv0[] qv0VarArr = bw0Var2.t1;
                if (this.c == null) {
                    int i10 = this.e;
                    qv0 qv0Var = qv0VarArr[i10];
                    if (this.d == qv0Var.p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f;
                        qv0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                zu0 zu0Var = new zu0();
                                zu0Var.c = i13;
                                zu0Var.d = tL_searchResultPosition.msg_id;
                                zu0Var.b = tL_searchResultPosition.offset;
                                zu0Var.a = LocaleController.formatYearMont(i13, true);
                                qv0VarArr[i10].e.add(zu0Var);
                            }
                        }
                        Collections.sort(qv0VarArr[i10].e, new org.telegram.ui.gf(17));
                        qv0 qv0Var2 = qv0VarArr[i10];
                        qv0Var2.f[0] = tL_messages_searchResultsPositions.count;
                        qv0Var2.h = true;
                        if (!qv0Var2.e.isEmpty()) {
                            while (true) {
                                uu0[] uu0VarArr = bw0Var2.k0;
                                if (i11 < uu0VarArr.length) {
                                    uu0 uu0Var = uu0VarArr[i11];
                                    if (uu0Var.F == i10) {
                                        uu0Var.b = true;
                                        bw0Var2.o1(uu0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        bw0Var2.H.l();
                        break;
                    }
                }
                break;
        }
    }
}
