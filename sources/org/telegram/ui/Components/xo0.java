package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xo0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xs0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ xo0(xs0 xs0Var, TLRPC.TL_error tL_error, int i7, int i10, TLObject tLObject, int i11) {
        this.a = i11;
        this.b = xs0Var;
        this.c = tL_error;
        this.d = i7;
        this.e = i10;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xs0 xs0Var = this.b;
                org.telegram.messenger.qs.f(xs0Var.x1.getCurrentAccount()).d(new xo0(xs0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                xs0 xs0Var2 = this.b;
                ms0[] ms0VarArr = xs0Var2.v1;
                if (this.c == null) {
                    int i7 = this.e;
                    ms0 ms0Var = ms0VarArr[i7];
                    if (this.d == ms0Var.p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f;
                        ms0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i10 = 0;
                        for (int i11 = 0; i11 < size; i11++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i11);
                            int i12 = tL_searchResultPosition.date;
                            if (i12 != 0) {
                                xr0 xr0Var = new xr0();
                                xr0Var.c = i12;
                                xr0Var.d = tL_searchResultPosition.msg_id;
                                xr0Var.b = tL_searchResultPosition.offset;
                                xr0Var.a = org.telegram.messenger.id.e0(i12, true);
                                ms0VarArr[i7].e.add(xr0Var);
                            }
                        }
                        Collections.sort(ms0VarArr[i7].e, new org.telegram.ui.oe(17));
                        ms0 ms0Var2 = ms0VarArr[i7];
                        ms0Var2.f[0] = tL_messages_searchResultsPositions.count;
                        ms0Var2.h = true;
                        if (!ms0Var2.e.isEmpty()) {
                            while (true) {
                                sr0[] sr0VarArr = xs0Var2.m0;
                                if (i10 < sr0VarArr.length) {
                                    sr0 sr0Var = sr0VarArr[i10];
                                    if (sr0Var.E == i7) {
                                        sr0Var.b = true;
                                        xs0Var2.D1(sr0Var, true);
                                    }
                                    i10++;
                                }
                            }
                        }
                        xs0Var2.J.f();
                        break;
                    }
                }
                break;
        }
    }
}
