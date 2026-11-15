package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class kn implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ c1 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ kn(np npVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.TL_channels_editAdmin tL_channels_editAdmin, boolean z10, boolean z11) {
        this.d = npVar;
        this.e = tL_error;
        this.f = e2Var;
        this.h = tL_channels_editAdmin;
        this.b = z10;
        this.c = z11;
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
                org.telegram.ui.Components.t4.c0(((np) c1Var).currentAccount, (TLRPC.TL_error) obj3, (org.telegram.ui.ActionBar.e2) obj2, (TLRPC.TL_channels_editAdmin) obj, Boolean.valueOf(this.b), Boolean.valueOf(this.c));
                break;
            default:
                at.e((at) c1Var, (ArrayList) obj3, (ArrayList) obj2, this.b, this.c, (CountDownLatch) obj);
                break;
        }
    }

    public /* synthetic */ kn(at atVar, ArrayList arrayList, ArrayList arrayList2, boolean z10, boolean z11, CountDownLatch countDownLatch) {
        this.d = atVar;
        this.e = arrayList;
        this.f = arrayList2;
        this.b = z10;
        this.c = z11;
        this.h = countDownLatch;
    }
}
