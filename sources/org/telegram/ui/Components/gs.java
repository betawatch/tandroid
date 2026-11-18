package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class gs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hs b;

    public /* synthetic */ gs(hs hsVar, int i7) {
        this.a = i7;
        this.b = hsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hs hsVar = this.b;
                hsVar.c = false;
                hsVar.b.run();
                ArrayList arrayList = hsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - hsVar.f > 3600000) {
                    arrayList.clear();
                    hsVar.e = false;
                    hsVar.g = null;
                    hsVar.a();
                    break;
                }
                break;
            default:
                this.b.i = false;
                break;
        }
    }
}
