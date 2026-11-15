package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class bp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ys0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ bp0(ys0 ys0Var, TLRPC.TL_error tL_error, int i7, int i10, TLObject tLObject, int i11) {
        this.a = i11;
        this.b = ys0Var;
        this.c = tL_error;
        this.d = i7;
        this.e = i10;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ys0 ys0Var = this.b;
                org.telegram.messenger.ns.f(ys0Var.y1.getCurrentAccount()).d(new bp0(ys0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                ys0 ys0Var2 = this.b;
                ns0[] ns0VarArr = ys0Var2.w1;
                if (this.c == null) {
                    int i7 = this.e;
                    ns0 ns0Var = ns0VarArr[i7];
                    if (this.d == ns0Var.p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f;
                        ns0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i10 = 0;
                        for (int i11 = 0; i11 < size; i11++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i11);
                            int i12 = tL_searchResultPosition.date;
                            if (i12 != 0) {
                                yr0 yr0Var = new yr0();
                                yr0Var.c = i12;
                                yr0Var.d = tL_searchResultPosition.msg_id;
                                yr0Var.b = tL_searchResultPosition.offset;
                                yr0Var.a = org.telegram.messenger.hd.e0(i12, true);
                                ns0VarArr[i7].e.add(yr0Var);
                            }
                        }
                        Collections.sort(ns0VarArr[i7].e, new org.telegram.ui.me(16));
                        ns0 ns0Var2 = ns0VarArr[i7];
                        ns0Var2.f[0] = tL_messages_searchResultsPositions.count;
                        ns0Var2.h = true;
                        if (!ns0Var2.e.isEmpty()) {
                            while (true) {
                                tr0[] tr0VarArr = ys0Var2.n0;
                                if (i10 < tr0VarArr.length) {
                                    tr0 tr0Var = tr0VarArr[i10];
                                    if (tr0Var.F == i7) {
                                        tr0Var.b = true;
                                        ys0Var2.F1(tr0Var, true);
                                    }
                                    i10++;
                                }
                            }
                        }
                        ys0Var2.K.f();
                        break;
                    }
                }
                break;
        }
    }
}
