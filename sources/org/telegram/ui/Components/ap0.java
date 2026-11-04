package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ap0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ws0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ ap0(ws0 ws0Var, TLRPC.TL_error tL_error, int i3, int i10, TLObject tLObject, int i11) {
        this.a = i11;
        this.b = ws0Var;
        this.c = tL_error;
        this.d = i3;
        this.e = i10;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ws0 ws0Var = this.b;
                org.telegram.messenger.hs.f(ws0Var.y1.getCurrentAccount()).d(new ap0(ws0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                ws0 ws0Var2 = this.b;
                ls0[] ls0VarArr = ws0Var2.w1;
                if (this.c == null) {
                    int i3 = this.e;
                    ls0 ls0Var = ls0VarArr[i3];
                    if (this.d == ls0Var.p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f;
                        ls0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i10 = 0;
                        for (int i11 = 0; i11 < size; i11++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i11);
                            int i12 = tL_searchResultPosition.date;
                            if (i12 != 0) {
                                wr0 wr0Var = new wr0();
                                wr0Var.c = i12;
                                wr0Var.d = tL_searchResultPosition.msg_id;
                                wr0Var.b = tL_searchResultPosition.offset;
                                wr0Var.a = org.telegram.messenger.bd.e0(i12, true);
                                ls0VarArr[i3].e.add(wr0Var);
                            }
                        }
                        Collections.sort(ls0VarArr[i3].e, new d80(7));
                        ls0 ls0Var2 = ls0VarArr[i3];
                        ls0Var2.f[0] = tL_messages_searchResultsPositions.count;
                        ls0Var2.h = true;
                        if (!ls0Var2.e.isEmpty()) {
                            while (true) {
                                rr0[] rr0VarArr = ws0Var2.n0;
                                if (i10 < rr0VarArr.length) {
                                    rr0 rr0Var = rr0VarArr[i10];
                                    if (rr0Var.F == i3) {
                                        rr0Var.b = true;
                                        ws0Var2.D1(rr0Var, true);
                                    }
                                    i10++;
                                }
                            }
                        }
                        ws0Var2.K.f();
                        break;
                    }
                }
                break;
        }
    }
}
