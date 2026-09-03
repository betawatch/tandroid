package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ lg(xn xnVar, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = xnVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xn xnVar = this.b;
                xnVar.getClass();
                xnVar.presentFragment(xn.R9(this.c.id));
                break;
            default:
                this.b.ma(this.c);
                break;
        }
    }
}
