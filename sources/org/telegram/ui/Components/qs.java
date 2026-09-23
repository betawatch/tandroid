package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class qs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rs b;

    public /* synthetic */ qs(rs rsVar, int i10) {
        this.a = i10;
        this.b = rsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rs rsVar = this.b;
                rsVar.c = false;
                rsVar.b.run();
                ArrayList arrayList = rsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - rsVar.f > 3600000) {
                    arrayList.clear();
                    rsVar.e = false;
                    rsVar.g = null;
                    rsVar.a();
                    break;
                }
                break;
            default:
                this.b.i = false;
                break;
        }
    }
}
