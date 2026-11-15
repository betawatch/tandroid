package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
