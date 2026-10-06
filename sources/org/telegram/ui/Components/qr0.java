package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class qr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qv0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ qr0(qv0 qv0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.a = i12;
        this.b = qv0Var;
        this.c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qv0 qv0Var = this.b;
                NotificationCenter.getInstance(qv0Var.v1.getCurrentAccount()).doOnIdle(new qr0(qv0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                qv0 qv0Var2 = this.b;
                fv0[] fv0VarArr = qv0Var2.t1;
                if (this.c == null) {
                    int i10 = this.e;
                    fv0 fv0Var = fv0VarArr[i10];
                    if (this.d == fv0Var.p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f;
                        fv0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ou0 ou0Var = new ou0();
                                ou0Var.c = i13;
                                ou0Var.d = tL_searchResultPosition.msg_id;
                                ou0Var.b = tL_searchResultPosition.offset;
                                ou0Var.a = LocaleController.formatYearMont(i13, true);
                                fv0VarArr[i10].e.add(ou0Var);
                            }
                        }
                        Collections.sort(fv0VarArr[i10].e, new org.telegram.ui.ff(17));
                        fv0 fv0Var2 = fv0VarArr[i10];
                        fv0Var2.f[0] = tL_messages_searchResultsPositions.count;
                        fv0Var2.h = true;
                        if (!fv0Var2.e.isEmpty()) {
                            while (true) {
                                ju0[] ju0VarArr = qv0Var2.k0;
                                if (i11 < ju0VarArr.length) {
                                    ju0 ju0Var = ju0VarArr[i11];
                                    if (ju0Var.F == i10) {
                                        ju0Var.b = true;
                                        qv0Var2.o1(ju0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        qv0Var2.H.l();
                        break;
                    }
                }
                break;
        }
    }
}
