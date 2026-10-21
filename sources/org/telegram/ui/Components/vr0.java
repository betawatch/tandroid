package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uv0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ vr0(uv0 uv0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.a = i12;
        this.b = uv0Var;
        this.c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                uv0 uv0Var = this.b;
                NotificationCenter.getInstance(uv0Var.v1.getCurrentAccount()).doOnIdle(new vr0(uv0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                uv0 uv0Var2 = this.b;
                jv0[] jv0VarArr = uv0Var2.t1;
                if (this.c == null) {
                    int i10 = this.e;
                    jv0 jv0Var = jv0VarArr[i10];
                    if (this.d == jv0Var.p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f;
                        jv0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                su0 su0Var = new su0();
                                su0Var.c = i13;
                                su0Var.d = tL_searchResultPosition.msg_id;
                                su0Var.b = tL_searchResultPosition.offset;
                                su0Var.a = LocaleController.formatYearMont(i13, true);
                                jv0VarArr[i10].e.add(su0Var);
                            }
                        }
                        Collections.sort(jv0VarArr[i10].e, new org.telegram.ui.ActionBar.i4(24));
                        jv0 jv0Var2 = jv0VarArr[i10];
                        jv0Var2.f[0] = tL_messages_searchResultsPositions.count;
                        jv0Var2.h = true;
                        if (!jv0Var2.e.isEmpty()) {
                            while (true) {
                                nu0[] nu0VarArr = uv0Var2.k0;
                                if (i11 < nu0VarArr.length) {
                                    nu0 nu0Var = nu0VarArr[i11];
                                    if (nu0Var.F == i10) {
                                        nu0Var.b = true;
                                        uv0Var2.q1(nu0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        uv0Var2.H.l();
                        break;
                    }
                }
                break;
        }
    }
}
