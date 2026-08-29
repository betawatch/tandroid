package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qu0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ sq0(qu0 qu0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.a = i12;
        this.b = qu0Var;
        this.c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qu0 qu0Var = this.b;
                NotificationCenter.getInstance(qu0Var.r1.getCurrentAccount()).doOnIdle(new sq0(qu0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                qu0 qu0Var2 = this.b;
                fu0[] fu0VarArr = qu0Var2.p1;
                if (this.c == null) {
                    int i10 = this.e;
                    fu0 fu0Var = fu0VarArr[i10];
                    if (this.d == fu0Var.p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f;
                        fu0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                nt0 nt0Var = new nt0();
                                nt0Var.c = i13;
                                nt0Var.d = tL_searchResultPosition.msg_id;
                                nt0Var.b = tL_searchResultPosition.offset;
                                nt0Var.a = LocaleController.formatYearMont(i13, true);
                                fu0VarArr[i10].e.add(nt0Var);
                            }
                        }
                        Collections.sort(fu0VarArr[i10].e, new wp0(1));
                        fu0 fu0Var2 = fu0VarArr[i10];
                        fu0Var2.f[0] = tL_messages_searchResultsPositions.count;
                        fu0Var2.h = true;
                        if (!fu0Var2.e.isEmpty()) {
                            while (true) {
                                it0[] it0VarArr = qu0Var2.g0;
                                if (i11 < it0VarArr.length) {
                                    it0 it0Var = it0VarArr[i11];
                                    if (it0Var.B == i10) {
                                        it0Var.b = true;
                                        qu0Var2.o1(it0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        qu0Var2.D.l();
                        break;
                    }
                }
                break;
        }
    }
}
