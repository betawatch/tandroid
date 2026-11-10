package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tr b;

    public /* synthetic */ sr(tr trVar, int i7) {
        this.a = i7;
        this.b = trVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tr trVar = this.b;
                trVar.c = false;
                trVar.b.run();
                ArrayList arrayList = trVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - trVar.f > 3600000) {
                    arrayList.clear();
                    trVar.e = false;
                    trVar.g = null;
                    trVar.a();
                    break;
                }
                break;
            default:
                this.b.i = false;
                break;
        }
    }
}
