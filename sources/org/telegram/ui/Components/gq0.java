package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eu0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ gq0(eu0 eu0Var, TLRPC.TL_error tL_error, int i9, int i10, TLObject tLObject, int i11) {
        this.a = i11;
        this.b = eu0Var;
        this.c = tL_error;
        this.d = i9;
        this.e = i10;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                eu0 eu0Var = this.b;
                NotificationCenter.getInstance(eu0Var.r1.getCurrentAccount()).doOnIdle(new gq0(eu0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                eu0 eu0Var2 = this.b;
                tt0[] tt0VarArr = eu0Var2.p1;
                if (this.c == null) {
                    int i9 = this.e;
                    tt0 tt0Var = tt0VarArr[i9];
                    if (this.d == tt0Var.p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f;
                        tt0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i10 = 0;
                        for (int i11 = 0; i11 < size; i11++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i11);
                            int i12 = tL_searchResultPosition.date;
                            if (i12 != 0) {
                                ct0 ct0Var = new ct0();
                                ct0Var.c = i12;
                                ct0Var.d = tL_searchResultPosition.msg_id;
                                ct0Var.b = tL_searchResultPosition.offset;
                                ct0Var.a = LocaleController.formatYearMont(i12, true);
                                tt0VarArr[i9].e.add(ct0Var);
                            }
                        }
                        Collections.sort(tt0VarArr[i9].e, new jn0(3));
                        tt0 tt0Var2 = tt0VarArr[i9];
                        tt0Var2.f[0] = tL_messages_searchResultsPositions.count;
                        tt0Var2.h = true;
                        if (!tt0Var2.e.isEmpty()) {
                            while (true) {
                                xs0[] xs0VarArr = eu0Var2.g0;
                                if (i10 < xs0VarArr.length) {
                                    xs0 xs0Var = xs0VarArr[i10];
                                    if (xs0Var.B == i9) {
                                        xs0Var.b = true;
                                        eu0Var2.o1(xs0Var, true);
                                    }
                                    i10++;
                                }
                            }
                        }
                        eu0Var2.D.l();
                        break;
                    }
                }
                break;
        }
    }
}
