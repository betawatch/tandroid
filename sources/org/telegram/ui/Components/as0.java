package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class as0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ as0(aw0 aw0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.a = i12;
        this.b = aw0Var;
        this.c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                aw0 aw0Var = this.b;
                NotificationCenter.getInstance(aw0Var.x1.getCurrentAccount()).doOnIdle(new as0(aw0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                aw0 aw0Var2 = this.b;
                pv0[] pv0VarArr = aw0Var2.v1;
                if (this.c == null) {
                    int i10 = this.e;
                    pv0 pv0Var = pv0VarArr[i10];
                    if (this.d == pv0Var.p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f;
                        pv0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                zu0 zu0Var = new zu0();
                                zu0Var.c = i13;
                                zu0Var.d = tL_searchResultPosition.msg_id;
                                zu0Var.b = tL_searchResultPosition.offset;
                                zu0Var.a = LocaleController.formatYearMont(i13, true);
                                pv0VarArr[i10].e.add(zu0Var);
                            }
                        }
                        Collections.sort(pv0VarArr[i10].e, new org.telegram.ui.ActionBar.n4(24));
                        pv0 pv0Var2 = pv0VarArr[i10];
                        pv0Var2.f[0] = tL_messages_searchResultsPositions.count;
                        pv0Var2.h = true;
                        if (!pv0Var2.e.isEmpty()) {
                            while (true) {
                                tu0[] tu0VarArr = aw0Var2.m0;
                                if (i11 < tu0VarArr.length) {
                                    tu0 tu0Var = tu0VarArr[i11];
                                    if (tu0Var.E == i10) {
                                        tu0Var.b = true;
                                        aw0Var2.z1(tu0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        aw0Var2.J.l();
                        break;
                    }
                }
                break;
        }
    }
}
