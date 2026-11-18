package org.telegram.ui.Components;

import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class z01 extends v4.o {
    public final /* synthetic */ int b = 1;
    public ArrayList c;
    public ArrayList d;

    public /* synthetic */ z01() {
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
                c11 c11Var = (c11) this.c.get(i7);
                c11 c11Var2 = (c11) this.d.get(i10);
                return c11Var.a == c11Var2.a && Objects.equals(c11Var.b, c11Var2.b);
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

    public z01(ArrayList arrayList, ArrayList arrayList2) {
        this.c = arrayList;
        this.d = arrayList2;
    }
}
