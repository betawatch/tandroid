package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class zr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ as b;

    public /* synthetic */ zr(as asVar, int i7) {
        this.a = i7;
        this.b = asVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                as asVar = this.b;
                asVar.c = false;
                asVar.b.run();
                ArrayList arrayList = asVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - asVar.f > 3600000) {
                    arrayList.clear();
                    asVar.e = false;
                    asVar.g = null;
                    asVar.a();
                    break;
                }
                break;
            default:
                this.b.i = false;
                break;
        }
    }
}
