package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class mp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ it0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ mp0(it0 it0Var, TLRPC.TL_error tL_error, int i7, int i10, TLObject tLObject, int i11) {
        this.a = i11;
        this.b = it0Var;
        this.c = tL_error;
        this.d = i7;
        this.e = i10;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                it0 it0Var = this.b;
                org.telegram.messenger.ks.f(it0Var.y1.getCurrentAccount()).d(new mp0(it0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                it0 it0Var2 = this.b;
                xs0[] xs0VarArr = it0Var2.w1;
                if (this.c == null) {
                    int i7 = this.e;
                    xs0 xs0Var = xs0VarArr[i7];
                    if (this.d == xs0Var.p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f;
                        xs0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i10 = 0;
                        for (int i11 = 0; i11 < size; i11++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i11);
                            int i12 = tL_searchResultPosition.date;
                            if (i12 != 0) {
                                is0 is0Var = new is0();
                                is0Var.c = i12;
                                is0Var.d = tL_searchResultPosition.msg_id;
                                is0Var.b = tL_searchResultPosition.offset;
                                is0Var.a = org.telegram.messenger.gd.e0(i12, true);
                                xs0VarArr[i7].e.add(is0Var);
                            }
                        }
                        Collections.sort(xs0VarArr[i7].e, new org.telegram.ui.pe(16));
                        xs0 xs0Var2 = xs0VarArr[i7];
                        xs0Var2.f[0] = tL_messages_searchResultsPositions.count;
                        xs0Var2.h = true;
                        if (!xs0Var2.e.isEmpty()) {
                            while (true) {
                                ds0[] ds0VarArr = it0Var2.n0;
                                if (i10 < ds0VarArr.length) {
                                    ds0 ds0Var = ds0VarArr[i10];
                                    if (ds0Var.F == i7) {
                                        ds0Var.b = true;
                                        it0Var2.F1(ds0Var, true);
                                    }
                                    i10++;
                                }
                            }
                        }
                        it0Var2.K.f();
                        break;
                    }
                }
                break;
        }
    }
}
