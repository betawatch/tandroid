package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hu0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ hq0(hu0 hu0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.a = i12;
        this.b = hu0Var;
        this.c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hu0 hu0Var = this.b;
                NotificationCenter.getInstance(hu0Var.r1.getCurrentAccount()).doOnIdle(new hq0(hu0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                hu0 hu0Var2 = this.b;
                wt0[] wt0VarArr = hu0Var2.p1;
                if (this.c == null) {
                    int i10 = this.e;
                    wt0 wt0Var = wt0VarArr[i10];
                    if (this.d == wt0Var.p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f;
                        wt0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                et0 et0Var = new et0();
                                et0Var.c = i13;
                                et0Var.d = tL_searchResultPosition.msg_id;
                                et0Var.b = tL_searchResultPosition.offset;
                                et0Var.a = LocaleController.formatYearMont(i13, true);
                                wt0VarArr[i10].e.add(et0Var);
                            }
                        }
                        Collections.sort(wt0VarArr[i10].e, new lp0(1));
                        wt0 wt0Var2 = wt0VarArr[i10];
                        wt0Var2.f[0] = tL_messages_searchResultsPositions.count;
                        wt0Var2.h = true;
                        if (!wt0Var2.e.isEmpty()) {
                            while (true) {
                                zs0[] zs0VarArr = hu0Var2.g0;
                                if (i11 < zs0VarArr.length) {
                                    zs0 zs0Var = zs0VarArr[i11];
                                    if (zs0Var.B == i10) {
                                        zs0Var.b = true;
                                        hu0Var2.o1(zs0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        hu0Var2.D.l();
                        break;
                    }
                }
                break;
        }
    }
}
