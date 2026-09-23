package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class xq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yu0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ xq0(yu0 yu0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.a = i12;
        this.b = yu0Var;
        this.c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yu0 yu0Var = this.b;
                NotificationCenter.getInstance(yu0Var.v1.getCurrentAccount()).doOnIdle(new xq0(yu0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                yu0 yu0Var2 = this.b;
                nu0[] nu0VarArr = yu0Var2.t1;
                if (this.c == null) {
                    int i10 = this.e;
                    nu0 nu0Var = nu0VarArr[i10];
                    if (this.d == nu0Var.p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f;
                        nu0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                wt0 wt0Var = new wt0();
                                wt0Var.c = i13;
                                wt0Var.d = tL_searchResultPosition.msg_id;
                                wt0Var.b = tL_searchResultPosition.offset;
                                wt0Var.a = LocaleController.formatYearMont(i13, true);
                                nu0VarArr[i10].e.add(wt0Var);
                            }
                        }
                        Collections.sort(nu0VarArr[i10].e, new org.telegram.ui.df(17));
                        nu0 nu0Var2 = nu0VarArr[i10];
                        nu0Var2.f[0] = tL_messages_searchResultsPositions.count;
                        nu0Var2.h = true;
                        if (!nu0Var2.e.isEmpty()) {
                            while (true) {
                                rt0[] rt0VarArr = yu0Var2.k0;
                                if (i11 < rt0VarArr.length) {
                                    rt0 rt0Var = rt0VarArr[i11];
                                    if (rt0Var.F == i10) {
                                        rt0Var.b = true;
                                        yu0Var2.o1(rt0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        yu0Var2.H.l();
                        break;
                    }
                }
                break;
        }
    }
}
