package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class lr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kv0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ lr0(kv0 kv0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.a = i12;
        this.b = kv0Var;
        this.c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kv0 kv0Var = this.b;
                NotificationCenter.getInstance(kv0Var.v1.getCurrentAccount()).doOnIdle(new lr0(kv0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                kv0 kv0Var2 = this.b;
                zu0[] zu0VarArr = kv0Var2.t1;
                if (this.c == null) {
                    int i10 = this.e;
                    zu0 zu0Var = zu0VarArr[i10];
                    if (this.d == zu0Var.p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f;
                        zu0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                iu0 iu0Var = new iu0();
                                iu0Var.c = i13;
                                iu0Var.d = tL_searchResultPosition.msg_id;
                                iu0Var.b = tL_searchResultPosition.offset;
                                iu0Var.a = LocaleController.formatYearMont(i13, true);
                                zu0VarArr[i10].e.add(iu0Var);
                            }
                        }
                        Collections.sort(zu0VarArr[i10].e, new org.telegram.ui.df(17));
                        zu0 zu0Var2 = zu0VarArr[i10];
                        zu0Var2.f[0] = tL_messages_searchResultsPositions.count;
                        zu0Var2.h = true;
                        if (!zu0Var2.e.isEmpty()) {
                            while (true) {
                                du0[] du0VarArr = kv0Var2.k0;
                                if (i11 < du0VarArr.length) {
                                    du0 du0Var = du0VarArr[i11];
                                    if (du0Var.F == i10) {
                                        du0Var.b = true;
                                        kv0Var2.o1(du0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        kv0Var2.H.l();
                        break;
                    }
                }
                break;
        }
    }
}
