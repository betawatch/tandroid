package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class aq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ au0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ aq0(au0 au0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.a = i12;
        this.b = au0Var;
        this.c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                au0 au0Var = this.b;
                org.telegram.messenger.at.f(au0Var.x1.getCurrentAccount()).d(new aq0(au0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                au0 au0Var2 = this.b;
                pt0[] pt0VarArr = au0Var2.v1;
                if (this.c == null) {
                    int i10 = this.e;
                    pt0 pt0Var = pt0VarArr[i10];
                    if (this.d == pt0Var.p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f;
                        pt0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ys0 ys0Var = new ys0();
                                ys0Var.c = i13;
                                ys0Var.d = tL_searchResultPosition.msg_id;
                                ys0Var.b = tL_searchResultPosition.offset;
                                ys0Var.a = org.telegram.messenger.dd.e0(i13, true);
                                pt0VarArr[i10].e.add(ys0Var);
                            }
                        }
                        Collections.sort(pt0VarArr[i10].e, new org.telegram.ui.f6(19));
                        pt0 pt0Var2 = pt0VarArr[i10];
                        pt0Var2.f[0] = tL_messages_searchResultsPositions.count;
                        pt0Var2.h = true;
                        if (!pt0Var2.e.isEmpty()) {
                            while (true) {
                                ts0[] ts0VarArr = au0Var2.m0;
                                if (i11 < ts0VarArr.length) {
                                    ts0 ts0Var = ts0VarArr[i11];
                                    if (ts0Var.E == i10) {
                                        ts0Var.b = true;
                                        au0Var2.B1(ts0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        au0Var2.J.f();
                        break;
                    }
                }
                break;
        }
    }
}
