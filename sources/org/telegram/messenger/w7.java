package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class w7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b8 b;

    public /* synthetic */ w7(b8 b8Var, int i10) {
        this.a = i10;
        this.b = b8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b8 b8Var = this.b;
                bg.h[] hVarArr = b8Var.c;
                bg.h[] hVarArr2 = b8Var.b;
                for (int i10 = 0; i10 < hVarArr2.length; i10++) {
                    if (((ArrayList) hVarArr2[i10].d).size() > 0 || ((ArrayList) hVarArr[i10].d).size() > 0) {
                        f8.b("download queue: dc" + (i10 + 1) + " account=" + b8Var.currentAccount + " small_operations=" + ((ArrayList) hVarArr2[i10].d).size() + " large_operations=" + ((ArrayList) hVarArr[i10].d).size());
                    }
                }
                if (v2.a) {
                    b8.J.a(b8Var.H);
                    b8.J.d(b8Var.H, 10000L);
                    break;
                }
                break;
            default:
                this.b.getNotificationCenter().k(at.b5, new Object[0]);
                break;
        }
    }
}
