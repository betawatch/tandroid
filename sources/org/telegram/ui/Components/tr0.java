package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sv0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ tr0(sv0 sv0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.a = i12;
        this.b = sv0Var;
        this.c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sv0 sv0Var = this.b;
                NotificationCenter.getInstance(sv0Var.v1.getCurrentAccount()).doOnIdle(new tr0(sv0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                sv0 sv0Var2 = this.b;
                hv0[] hv0VarArr = sv0Var2.t1;
                if (this.c == null) {
                    int i10 = this.e;
                    hv0 hv0Var = hv0VarArr[i10];
                    if (this.d == hv0Var.p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f;
                        hv0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                qu0 qu0Var = new qu0();
                                qu0Var.c = i13;
                                qu0Var.d = tL_searchResultPosition.msg_id;
                                qu0Var.b = tL_searchResultPosition.offset;
                                qu0Var.a = LocaleController.formatYearMont(i13, true);
                                hv0VarArr[i10].e.add(qu0Var);
                            }
                        }
                        Collections.sort(hv0VarArr[i10].e, new org.telegram.ui.ActionBar.i4(24));
                        hv0 hv0Var2 = hv0VarArr[i10];
                        hv0Var2.f[0] = tL_messages_searchResultsPositions.count;
                        hv0Var2.h = true;
                        if (!hv0Var2.e.isEmpty()) {
                            while (true) {
                                lu0[] lu0VarArr = sv0Var2.k0;
                                if (i11 < lu0VarArr.length) {
                                    lu0 lu0Var = lu0VarArr[i11];
                                    if (lu0Var.F == i10) {
                                        lu0Var.b = true;
                                        sv0Var2.q1(lu0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        sv0Var2.H.l();
                        break;
                    }
                }
                break;
        }
    }
}
