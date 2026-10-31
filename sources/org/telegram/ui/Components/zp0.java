package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class zp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zt0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ zp0(zt0 zt0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.a = i12;
        this.b = zt0Var;
        this.c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zt0 zt0Var = this.b;
                org.telegram.messenger.zs.f(zt0Var.x1.getCurrentAccount()).d(new zp0(zt0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                zt0 zt0Var2 = this.b;
                ot0[] ot0VarArr = zt0Var2.v1;
                if (this.c == null) {
                    int i10 = this.e;
                    ot0 ot0Var = ot0VarArr[i10];
                    if (this.d == ot0Var.p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f;
                        ot0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                xs0 xs0Var = new xs0();
                                xs0Var.c = i13;
                                xs0Var.d = tL_searchResultPosition.msg_id;
                                xs0Var.b = tL_searchResultPosition.offset;
                                xs0Var.a = org.telegram.messenger.cd.e0(i13, true);
                                ot0VarArr[i10].e.add(xs0Var);
                            }
                        }
                        Collections.sort(ot0VarArr[i10].e, new org.telegram.ui.f6(19));
                        ot0 ot0Var2 = ot0VarArr[i10];
                        ot0Var2.f[0] = tL_messages_searchResultsPositions.count;
                        ot0Var2.h = true;
                        if (!ot0Var2.e.isEmpty()) {
                            while (true) {
                                ss0[] ss0VarArr = zt0Var2.m0;
                                if (i11 < ss0VarArr.length) {
                                    ss0 ss0Var = ss0VarArr[i11];
                                    if (ss0Var.E == i10) {
                                        ss0Var.b = true;
                                        zt0Var2.A1(ss0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        zt0Var2.J.f();
                        break;
                    }
                }
                break;
        }
    }
}
