package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class ur0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tv0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ ur0(tv0 tv0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.a = i12;
        this.b = tv0Var;
        this.c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tv0 tv0Var = this.b;
                NotificationCenter.getInstance(tv0Var.v1.getCurrentAccount()).doOnIdle(new ur0(tv0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                tv0 tv0Var2 = this.b;
                iv0[] iv0VarArr = tv0Var2.t1;
                if (this.c == null) {
                    int i10 = this.e;
                    iv0 iv0Var = iv0VarArr[i10];
                    if (this.d == iv0Var.p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f;
                        iv0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ru0 ru0Var = new ru0();
                                ru0Var.c = i13;
                                ru0Var.d = tL_searchResultPosition.msg_id;
                                ru0Var.b = tL_searchResultPosition.offset;
                                ru0Var.a = LocaleController.formatYearMont(i13, true);
                                iv0VarArr[i10].e.add(ru0Var);
                            }
                        }
                        Collections.sort(iv0VarArr[i10].e, new org.telegram.ui.ActionBar.i4(24));
                        iv0 iv0Var2 = iv0VarArr[i10];
                        iv0Var2.f[0] = tL_messages_searchResultsPositions.count;
                        iv0Var2.h = true;
                        if (!iv0Var2.e.isEmpty()) {
                            while (true) {
                                mu0[] mu0VarArr = tv0Var2.k0;
                                if (i11 < mu0VarArr.length) {
                                    mu0 mu0Var = mu0VarArr[i11];
                                    if (mu0Var.F == i10) {
                                        mu0Var.b = true;
                                        tv0Var2.q1(mu0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        tv0Var2.H.l();
                        break;
                    }
                }
                break;
        }
    }
}
