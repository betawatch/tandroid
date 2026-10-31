package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class dn implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ f1 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ dn(vp vpVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.k2 k2Var, TLRPC.TL_channels_editAdmin tL_channels_editAdmin, boolean z10, boolean z11) {
        this.d = vpVar;
        this.e = tL_error;
        this.f = k2Var;
        this.h = tL_channels_editAdmin;
        this.b = z10;
        this.c = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        f1 f1Var = this.d;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.s4.e0(((vp) f1Var).currentAccount, (TLRPC.TL_error) obj3, (org.telegram.ui.ActionBar.k2) obj2, (TLRPC.TL_channels_editAdmin) obj, Boolean.valueOf(this.b), Boolean.valueOf(this.c));
                break;
            default:
                ot.e((ot) f1Var, (ArrayList) obj3, (ArrayList) obj2, this.b, this.c, (CountDownLatch) obj);
                break;
        }
    }

    public /* synthetic */ dn(ot otVar, ArrayList arrayList, ArrayList arrayList2, boolean z10, boolean z11, CountDownLatch countDownLatch) {
        this.d = otVar;
        this.e = arrayList;
        this.f = arrayList2;
        this.b = z10;
        this.c = z11;
        this.h = countDownLatch;
    }
}
