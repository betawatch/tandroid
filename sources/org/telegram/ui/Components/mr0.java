package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class mr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lv0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ mr0(lv0 lv0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.a = i12;
        this.b = lv0Var;
        this.c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lv0 lv0Var = this.b;
                NotificationCenter.getInstance(lv0Var.v1.getCurrentAccount()).doOnIdle(new mr0(lv0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                lv0 lv0Var2 = this.b;
                av0[] av0VarArr = lv0Var2.t1;
                if (this.c == null) {
                    int i10 = this.e;
                    av0 av0Var = av0VarArr[i10];
                    if (this.d == av0Var.p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f;
                        av0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ju0 ju0Var = new ju0();
                                ju0Var.c = i13;
                                ju0Var.d = tL_searchResultPosition.msg_id;
                                ju0Var.b = tL_searchResultPosition.offset;
                                ju0Var.a = LocaleController.formatYearMont(i13, true);
                                av0VarArr[i10].e.add(ju0Var);
                            }
                        }
                        Collections.sort(av0VarArr[i10].e, new org.telegram.ui.df(17));
                        av0 av0Var2 = av0VarArr[i10];
                        av0Var2.f[0] = tL_messages_searchResultsPositions.count;
                        av0Var2.h = true;
                        if (!av0Var2.e.isEmpty()) {
                            while (true) {
                                eu0[] eu0VarArr = lv0Var2.k0;
                                if (i11 < eu0VarArr.length) {
                                    eu0 eu0Var = eu0VarArr[i11];
                                    if (eu0Var.F == i10) {
                                        eu0Var.b = true;
                                        lv0Var2.o1(eu0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        lv0Var2.H.l();
                        break;
                    }
                }
                break;
        }
    }
}
