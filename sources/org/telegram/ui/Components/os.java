package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final /* synthetic */ class os implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ps b;

    public /* synthetic */ os(ps psVar, int i10) {
        this.a = i10;
        this.b = psVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ps psVar = this.b;
                psVar.c = false;
                psVar.b.run();
                ArrayList arrayList = psVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - psVar.f > 3600000) {
                    arrayList.clear();
                    psVar.e = false;
                    psVar.g = null;
                    psVar.a();
                    break;
                }
                break;
            default:
                this.b.i = false;
                break;
        }
    }
}
