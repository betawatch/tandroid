package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ds implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ es b;

    public /* synthetic */ ds(es esVar, int i10) {
        this.a = i10;
        this.b = esVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                es esVar = this.b;
                esVar.c = false;
                esVar.b.run();
                ArrayList arrayList = esVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - esVar.f > 3600000) {
                    arrayList.clear();
                    esVar.e = false;
                    esVar.g = null;
                    esVar.a();
                    break;
                }
                break;
            default:
                this.b.i = false;
                break;
        }
    }
}
