package org.telegram.ui.Components;

import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class a11 extends v4.o {
    public final /* synthetic */ int b = 1;
    public ArrayList c;
    public ArrayList d;

    public /* synthetic */ a11() {
    }

    @Override // v4.o
    public final boolean a(int i7, int i10) {
        switch (this.b) {
            case 0:
                return true;
            default:
                rg.a aVar = (rg.a) this.c.get(i7);
                rg.a aVar2 = (rg.a) this.d.get(i10);
                if (aVar.a != aVar2.a) {
                    return false;
                }
                return aVar.a(aVar2);
        }
    }

    @Override // v4.o
    public final boolean b(int i7, int i10) {
        switch (this.b) {
            case 0:
                d11 d11Var = (d11) this.c.get(i7);
                d11 d11Var2 = (d11) this.d.get(i10);
                return d11Var.a == d11Var2.a && Objects.equals(d11Var.b, d11Var2.b);
            default:
                rg.a aVar = (rg.a) this.c.get(i7);
                rg.a aVar2 = (rg.a) this.d.get(i10);
                if (aVar.a != aVar2.a) {
                    return false;
                }
                return aVar.equals(aVar2);
        }
    }

    @Override // v4.o
    public final int d() {
        switch (this.b) {
        }
        return this.d.size();
    }

    @Override // v4.o
    public final int e() {
        switch (this.b) {
        }
        return this.c.size();
    }

    public a11(ArrayList arrayList, ArrayList arrayList2) {
        this.c = arrayList;
        this.d = arrayList2;
    }
}
