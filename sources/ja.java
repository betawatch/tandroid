// default package

import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ja extends qie {
    public final /* synthetic */ byte a = 0;
    public ArrayList b;
    public ArrayList c;

    public ja(ArrayList arrayList, ArrayList arrayList2) {
        this.b = arrayList;
        this.c = arrayList2;
    }

    @Override // qie
    public final boolean a(int i, int i2) {
        switch (this.a) {
            case 0:
                ka kaVar = (ka) this.b.get(i);
                ka kaVar2 = (ka) this.c.get(i2);
                if (kaVar.a != kaVar2.a) {
                    return false;
                }
                return kaVar.a(kaVar2);
            default:
                return true;
        }
    }

    @Override // qie
    public final boolean b(int i, int i2) {
        switch (this.a) {
            case 0:
                ka kaVar = (ka) this.b.get(i);
                ka kaVar2 = (ka) this.c.get(i2);
                if (kaVar.a == kaVar2.a) {
                    return kaVar.equals(kaVar2);
                }
                return false;
            default:
                k0c k0cVar = (k0c) this.b.get(i);
                k0c k0cVar2 = (k0c) this.c.get(i2);
                return k0cVar.a == k0cVar2.a && Objects.equals(k0cVar.b, k0cVar2.b);
        }
    }

    @Override // qie
    public final int c() {
        switch (this.a) {
        }
        return this.c.size();
    }

    @Override // qie
    public final int d() {
        switch (this.a) {
        }
        return this.b.size();
    }

    public /* synthetic */ ja() {
    }
}
