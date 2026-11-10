package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class nn implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ c1 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ nn(qp qpVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_channels_editAdmin tL_channels_editAdmin, boolean z9, boolean z10) {
        this.d = qpVar;
        this.e = tL_error;
        this.f = f2Var;
        this.h = tL_channels_editAdmin;
        this.b = z9;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        c1 c1Var = this.d;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.u4.c0(((qp) c1Var).currentAccount, (TLRPC.TL_error) obj3, (org.telegram.ui.ActionBar.f2) obj2, (TLRPC.TL_channels_editAdmin) obj, Boolean.valueOf(this.b), Boolean.valueOf(this.c));
                break;
            default:
                dt.e((dt) c1Var, (ArrayList) obj3, (ArrayList) obj2, this.b, this.c, (CountDownLatch) obj);
                break;
        }
    }

    public /* synthetic */ nn(dt dtVar, ArrayList arrayList, ArrayList arrayList2, boolean z9, boolean z10, CountDownLatch countDownLatch) {
        this.d = dtVar;
        this.e = arrayList;
        this.f = arrayList2;
        this.b = z9;
        this.c = z10;
        this.h = countDownLatch;
    }
}
