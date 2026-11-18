package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class nv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pv b;

    public /* synthetic */ nv(pv pvVar, int i7) {
        this.a = i7;
        this.b = pvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.g(false);
                break;
            case 1:
                this.b.o = false;
                break;
            case 2:
                pv pvVar = this.b;
                pvVar.o = false;
                pvVar.l = false;
                break;
            case 3:
                this.b.l();
                break;
            default:
                pv pvVar2 = this.b;
                if (!pvVar2.o) {
                    pvVar2.o = true;
                    ArrayList arrayList = new ArrayList(pvVar2.j);
                    tr a02 = tr.a0(pvVar2.a);
                    a02.a.c(new kg(pvVar2, a02, arrayList, 24));
                    break;
                }
                break;
        }
    }
}
