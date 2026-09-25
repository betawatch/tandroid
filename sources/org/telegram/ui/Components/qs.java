package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
