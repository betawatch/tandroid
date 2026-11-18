package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class lp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gt0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ lp0(gt0 gt0Var, TLRPC.TL_error tL_error, int i7, int i10, TLObject tLObject, int i11) {
        this.a = i11;
        this.b = gt0Var;
        this.c = tL_error;
        this.d = i7;
        this.e = i10;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gt0 gt0Var = this.b;
                org.telegram.messenger.ks.f(gt0Var.y1.getCurrentAccount()).d(new lp0(gt0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                gt0 gt0Var2 = this.b;
                vs0[] vs0VarArr = gt0Var2.w1;
                if (this.c == null) {
                    int i7 = this.e;
                    vs0 vs0Var = vs0VarArr[i7];
                    if (this.d == vs0Var.p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f;
                        vs0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i10 = 0;
                        for (int i11 = 0; i11 < size; i11++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i11);
                            int i12 = tL_searchResultPosition.date;
                            if (i12 != 0) {
                                gs0 gs0Var = new gs0();
                                gs0Var.c = i12;
                                gs0Var.d = tL_searchResultPosition.msg_id;
                                gs0Var.b = tL_searchResultPosition.offset;
                                gs0Var.a = org.telegram.messenger.gd.e0(i12, true);
                                vs0VarArr[i7].e.add(gs0Var);
                            }
                        }
                        Collections.sort(vs0VarArr[i7].e, new org.telegram.ui.pe(16));
                        vs0 vs0Var2 = vs0VarArr[i7];
                        vs0Var2.f[0] = tL_messages_searchResultsPositions.count;
                        vs0Var2.h = true;
                        if (!vs0Var2.e.isEmpty()) {
                            while (true) {
                                bs0[] bs0VarArr = gt0Var2.n0;
                                if (i10 < bs0VarArr.length) {
                                    bs0 bs0Var = bs0VarArr[i10];
                                    if (bs0Var.F == i7) {
                                        bs0Var.b = true;
                                        gt0Var2.F1(bs0Var, true);
                                    }
                                    i10++;
                                }
                            }
                        }
                        gt0Var2.K.f();
                        break;
                    }
                }
                break;
        }
    }
}
