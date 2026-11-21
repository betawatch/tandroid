package org.telegram.ui.Components;

import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class b11 extends v4.o {
    public final /* synthetic */ int b = 1;
    public ArrayList c;
    public ArrayList d;

    public /* synthetic */ b11() {
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
                e11 e11Var = (e11) this.c.get(i7);
                e11 e11Var2 = (e11) this.d.get(i10);
                return e11Var.a == e11Var2.a && Objects.equals(e11Var.b, e11Var2.b);
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

    public b11(ArrayList arrayList, ArrayList arrayList2) {
        this.c = arrayList;
        this.d = arrayList2;
    }
}
