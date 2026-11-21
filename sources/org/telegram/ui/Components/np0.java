package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class np0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jt0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ np0(jt0 jt0Var, TLRPC.TL_error tL_error, int i7, int i10, TLObject tLObject, int i11) {
        this.a = i11;
        this.b = jt0Var;
        this.c = tL_error;
        this.d = i7;
        this.e = i10;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jt0 jt0Var = this.b;
                org.telegram.messenger.ks.f(jt0Var.y1.getCurrentAccount()).d(new np0(jt0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                jt0 jt0Var2 = this.b;
                ys0[] ys0VarArr = jt0Var2.w1;
                if (this.c == null) {
                    int i7 = this.e;
                    ys0 ys0Var = ys0VarArr[i7];
                    if (this.d == ys0Var.p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f;
                        ys0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i10 = 0;
                        for (int i11 = 0; i11 < size; i11++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i11);
                            int i12 = tL_searchResultPosition.date;
                            if (i12 != 0) {
                                js0 js0Var = new js0();
                                js0Var.c = i12;
                                js0Var.d = tL_searchResultPosition.msg_id;
                                js0Var.b = tL_searchResultPosition.offset;
                                js0Var.a = org.telegram.messenger.gd.e0(i12, true);
                                ys0VarArr[i7].e.add(js0Var);
                            }
                        }
                        Collections.sort(ys0VarArr[i7].e, new org.telegram.ui.pe(16));
                        ys0 ys0Var2 = ys0VarArr[i7];
                        ys0Var2.f[0] = tL_messages_searchResultsPositions.count;
                        ys0Var2.h = true;
                        if (!ys0Var2.e.isEmpty()) {
                            while (true) {
                                ds0[] ds0VarArr = jt0Var2.n0;
                                if (i10 < ds0VarArr.length) {
                                    ds0 ds0Var = ds0VarArr[i10];
                                    if (ds0Var.F == i7) {
                                        ds0Var.b = true;
                                        jt0Var2.F1(ds0Var, true);
                                    }
                                    i10++;
                                }
                            }
                        }
                        jt0Var2.K.f();
                        break;
                    }
                }
                break;
        }
    }
}
