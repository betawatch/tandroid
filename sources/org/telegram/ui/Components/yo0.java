package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class yo0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zs0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ yo0(zs0 zs0Var, TLRPC.TL_error tL_error, int i7, int i10, TLObject tLObject, int i11) {
        this.a = i11;
        this.b = zs0Var;
        this.c = tL_error;
        this.d = i7;
        this.e = i10;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zs0 zs0Var = this.b;
                org.telegram.messenger.qs.f(zs0Var.x1.getCurrentAccount()).d(new yo0(zs0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                zs0 zs0Var2 = this.b;
                os0[] os0VarArr = zs0Var2.v1;
                if (this.c == null) {
                    int i7 = this.e;
                    os0 os0Var = os0VarArr[i7];
                    if (this.d == os0Var.p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f;
                        os0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i10 = 0;
                        for (int i11 = 0; i11 < size; i11++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i11);
                            int i12 = tL_searchResultPosition.date;
                            if (i12 != 0) {
                                zr0 zr0Var = new zr0();
                                zr0Var.c = i12;
                                zr0Var.d = tL_searchResultPosition.msg_id;
                                zr0Var.b = tL_searchResultPosition.offset;
                                zr0Var.a = org.telegram.messenger.id.e0(i12, true);
                                os0VarArr[i7].e.add(zr0Var);
                            }
                        }
                        Collections.sort(os0VarArr[i7].e, new org.telegram.ui.oe(17));
                        os0 os0Var2 = os0VarArr[i7];
                        os0Var2.f[0] = tL_messages_searchResultsPositions.count;
                        os0Var2.h = true;
                        if (!os0Var2.e.isEmpty()) {
                            while (true) {
                                ur0[] ur0VarArr = zs0Var2.m0;
                                if (i10 < ur0VarArr.length) {
                                    ur0 ur0Var = ur0VarArr[i10];
                                    if (ur0Var.E == i7) {
                                        ur0Var.b = true;
                                        zs0Var2.F1(ur0Var, true);
                                    }
                                    i10++;
                                }
                            }
                        }
                        zs0Var2.J.f();
                        break;
                    }
                }
                break;
        }
    }
}
