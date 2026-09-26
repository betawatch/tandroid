package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jv0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ kr0(jv0 jv0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.a = i12;
        this.b = jv0Var;
        this.c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jv0 jv0Var = this.b;
                NotificationCenter.getInstance(jv0Var.v1.getCurrentAccount()).doOnIdle(new kr0(jv0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                jv0 jv0Var2 = this.b;
                yu0[] yu0VarArr = jv0Var2.t1;
                if (this.c == null) {
                    int i10 = this.e;
                    yu0 yu0Var = yu0VarArr[i10];
                    if (this.d == yu0Var.p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f;
                        yu0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                hu0 hu0Var = new hu0();
                                hu0Var.c = i13;
                                hu0Var.d = tL_searchResultPosition.msg_id;
                                hu0Var.b = tL_searchResultPosition.offset;
                                hu0Var.a = LocaleController.formatYearMont(i13, true);
                                yu0VarArr[i10].e.add(hu0Var);
                            }
                        }
                        Collections.sort(yu0VarArr[i10].e, new org.telegram.ui.cf(17));
                        yu0 yu0Var2 = yu0VarArr[i10];
                        yu0Var2.f[0] = tL_messages_searchResultsPositions.count;
                        yu0Var2.h = true;
                        if (!yu0Var2.e.isEmpty()) {
                            while (true) {
                                cu0[] cu0VarArr = jv0Var2.k0;
                                if (i11 < cu0VarArr.length) {
                                    cu0 cu0Var = cu0VarArr[i11];
                                    if (cu0Var.F == i10) {
                                        cu0Var.b = true;
                                        jv0Var2.o1(cu0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        jv0Var2.H.l();
                        break;
                    }
                }
                break;
        }
    }
}
