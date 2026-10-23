package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xv0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ yr0(xv0 xv0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.a = i12;
        this.b = xv0Var;
        this.c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xv0 xv0Var = this.b;
                NotificationCenter.getInstance(xv0Var.v1.getCurrentAccount()).doOnIdle(new yr0(xv0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                xv0 xv0Var2 = this.b;
                mv0[] mv0VarArr = xv0Var2.t1;
                if (this.c == null) {
                    int i10 = this.e;
                    mv0 mv0Var = mv0VarArr[i10];
                    if (this.d == mv0Var.p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f;
                        mv0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                vu0 vu0Var = new vu0();
                                vu0Var.c = i13;
                                vu0Var.d = tL_searchResultPosition.msg_id;
                                vu0Var.b = tL_searchResultPosition.offset;
                                vu0Var.a = LocaleController.formatYearMont(i13, true);
                                mv0VarArr[i10].e.add(vu0Var);
                            }
                        }
                        Collections.sort(mv0VarArr[i10].e, new org.telegram.ui.ActionBar.l4(24));
                        mv0 mv0Var2 = mv0VarArr[i10];
                        mv0Var2.f[0] = tL_messages_searchResultsPositions.count;
                        mv0Var2.h = true;
                        if (!mv0Var2.e.isEmpty()) {
                            while (true) {
                                qu0[] qu0VarArr = xv0Var2.k0;
                                if (i11 < qu0VarArr.length) {
                                    qu0 qu0Var = qu0VarArr[i11];
                                    if (qu0Var.F == i10) {
                                        qu0Var.b = true;
                                        xv0Var2.s1(qu0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        xv0Var2.H.l();
                        break;
                    }
                }
                break;
        }
    }
}
