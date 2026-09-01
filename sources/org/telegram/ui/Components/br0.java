package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class br0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zu0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ br0(zu0 zu0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.a = i12;
        this.b = zu0Var;
        this.c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zu0 zu0Var = this.b;
                NotificationCenter.getInstance(zu0Var.s1.getCurrentAccount()).doOnIdle(new br0(zu0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                zu0 zu0Var2 = this.b;
                ou0[] ou0VarArr = zu0Var2.q1;
                if (this.c == null) {
                    int i10 = this.e;
                    ou0 ou0Var = ou0VarArr[i10];
                    if (this.d == ou0Var.p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f;
                        ou0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                wt0 wt0Var = new wt0();
                                wt0Var.c = i13;
                                wt0Var.d = tL_searchResultPosition.msg_id;
                                wt0Var.b = tL_searchResultPosition.offset;
                                wt0Var.a = LocaleController.formatYearMont(i13, true);
                                ou0VarArr[i10].e.add(wt0Var);
                            }
                        }
                        Collections.sort(ou0VarArr[i10].e, new oh.k0(28));
                        ou0 ou0Var2 = ou0VarArr[i10];
                        ou0Var2.f[0] = tL_messages_searchResultsPositions.count;
                        ou0Var2.h = true;
                        if (!ou0Var2.e.isEmpty()) {
                            while (true) {
                                rt0[] rt0VarArr = zu0Var2.h0;
                                if (i11 < rt0VarArr.length) {
                                    rt0 rt0Var = rt0VarArr[i11];
                                    if (rt0Var.C == i10) {
                                        rt0Var.b = true;
                                        zu0Var2.o1(rt0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        zu0Var2.E.l();
                        break;
                    }
                }
                break;
        }
    }
}
