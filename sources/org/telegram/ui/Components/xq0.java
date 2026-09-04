package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class xq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xu0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ xq0(xu0 xu0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.a = i12;
        this.b = xu0Var;
        this.c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xu0 xu0Var = this.b;
                NotificationCenter.getInstance(xu0Var.v1.getCurrentAccount()).doOnIdle(new xq0(xu0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                xu0 xu0Var2 = this.b;
                mu0[] mu0VarArr = xu0Var2.t1;
                if (this.c == null) {
                    int i10 = this.e;
                    mu0 mu0Var = mu0VarArr[i10];
                    if (this.d == mu0Var.p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f;
                        mu0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                vt0 vt0Var = new vt0();
                                vt0Var.c = i13;
                                vt0Var.d = tL_searchResultPosition.msg_id;
                                vt0Var.b = tL_searchResultPosition.offset;
                                vt0Var.a = LocaleController.formatYearMont(i13, true);
                                mu0VarArr[i10].e.add(vt0Var);
                            }
                        }
                        Collections.sort(mu0VarArr[i10].e, new org.telegram.ui.f6(19));
                        mu0 mu0Var2 = mu0VarArr[i10];
                        mu0Var2.f[0] = tL_messages_searchResultsPositions.count;
                        mu0Var2.h = true;
                        if (!mu0Var2.e.isEmpty()) {
                            while (true) {
                                qt0[] qt0VarArr = xu0Var2.k0;
                                if (i11 < qt0VarArr.length) {
                                    qt0 qt0Var = qt0VarArr[i11];
                                    if (qt0Var.F == i10) {
                                        qt0Var.b = true;
                                        xu0Var2.o1(qt0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        xu0Var2.H.l();
                        break;
                    }
                }
                break;
        }
    }
}
