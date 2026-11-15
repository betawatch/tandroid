package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class p01 extends v4.o {
    public final /* synthetic */ int b = 1;
    public ArrayList c;
    public ArrayList d;

    public /* synthetic */ p01() {
    }

    @Override // v4.o
    public final boolean a(int i7, int i10) {
        switch (this.b) {
            case 0:
                throw null;
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
                throw null;
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

    public p01(ArrayList arrayList, ArrayList arrayList2) {
        this.c = arrayList;
        this.d = arrayList2;
    }
}
