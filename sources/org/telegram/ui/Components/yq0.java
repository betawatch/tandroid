package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zu0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ yq0(zu0 zu0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
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
                NotificationCenter.getInstance(zu0Var.v1.getCurrentAccount()).doOnIdle(new yq0(zu0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                zu0 zu0Var2 = this.b;
                ou0[] ou0VarArr = zu0Var2.t1;
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
                                xt0 xt0Var = new xt0();
                                xt0Var.c = i13;
                                xt0Var.d = tL_searchResultPosition.msg_id;
                                xt0Var.b = tL_searchResultPosition.offset;
                                xt0Var.a = LocaleController.formatYearMont(i13, true);
                                ou0VarArr[i10].e.add(xt0Var);
                            }
                        }
                        Collections.sort(ou0VarArr[i10].e, new org.telegram.ui.ff(17));
                        ou0 ou0Var2 = ou0VarArr[i10];
                        ou0Var2.f[0] = tL_messages_searchResultsPositions.count;
                        ou0Var2.h = true;
                        if (!ou0Var2.e.isEmpty()) {
                            while (true) {
                                st0[] st0VarArr = zu0Var2.k0;
                                if (i11 < st0VarArr.length) {
                                    st0 st0Var = st0VarArr[i11];
                                    if (st0Var.F == i10) {
                                        st0Var.b = true;
                                        zu0Var2.o1(st0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        zu0Var2.H.l();
                        break;
                    }
                }
                break;
        }
    }
}
