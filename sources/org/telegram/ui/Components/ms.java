package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ms implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ns b;

    public /* synthetic */ ms(ns nsVar, int i10) {
        this.a = i10;
        this.b = nsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ns nsVar = this.b;
                nsVar.c = false;
                nsVar.b.run();
                ArrayList arrayList = nsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - nsVar.f > 3600000) {
                    arrayList.clear();
                    nsVar.e = false;
                    nsVar.g = null;
                    nsVar.a();
                    break;
                }
                break;
            default:
                this.b.i = false;
                break;
        }
    }
}
