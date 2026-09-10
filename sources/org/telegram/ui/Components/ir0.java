package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ir0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ iv0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ ir0(iv0 iv0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.a = i12;
        this.b = iv0Var;
        this.c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                iv0 iv0Var = this.b;
                NotificationCenter.getInstance(iv0Var.v1.getCurrentAccount()).doOnIdle(new ir0(iv0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                iv0 iv0Var2 = this.b;
                xu0[] xu0VarArr = iv0Var2.t1;
                if (this.c == null) {
                    int i10 = this.e;
                    xu0 xu0Var = xu0VarArr[i10];
                    if (this.d == xu0Var.p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f;
                        xu0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                fu0 fu0Var = new fu0();
                                fu0Var.c = i13;
                                fu0Var.d = tL_searchResultPosition.msg_id;
                                fu0Var.b = tL_searchResultPosition.offset;
                                fu0Var.a = LocaleController.formatYearMont(i13, true);
                                xu0VarArr[i10].e.add(fu0Var);
                            }
                        }
                        Collections.sort(xu0VarArr[i10].e, new m9(10));
                        xu0 xu0Var2 = xu0VarArr[i10];
                        xu0Var2.f[0] = tL_messages_searchResultsPositions.count;
                        xu0Var2.h = true;
                        if (!xu0Var2.e.isEmpty()) {
                            while (true) {
                                au0[] au0VarArr = iv0Var2.k0;
                                if (i11 < au0VarArr.length) {
                                    au0 au0Var = au0VarArr[i11];
                                    if (au0Var.F == i10) {
                                        au0Var.b = true;
                                        iv0Var2.o1(au0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        iv0Var2.H.l();
                        break;
                    }
                }
                break;
        }
    }
}
