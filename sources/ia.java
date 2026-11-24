// default package

import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ia extends age {
    public final /* synthetic */ byte a = 0;
    public ArrayList b;
    public ArrayList c;

    public ia(ArrayList arrayList, ArrayList arrayList2) {
        this.b = arrayList;
        this.c = arrayList2;
    }

    @Override // age
    public final boolean a(int i, int i2) {
        switch (this.a) {
            case 0:
                ja jaVar = (ja) this.b.get(i);
                ja jaVar2 = (ja) this.c.get(i2);
                if (jaVar.a != jaVar2.a) {
                    return false;
                }
                return jaVar.a(jaVar2);
            default:
                return true;
        }
    }

    @Override // age
    public final boolean b(int i, int i2) {
        switch (this.a) {
            case 0:
                ja jaVar = (ja) this.b.get(i);
                ja jaVar2 = (ja) this.c.get(i2);
                if (jaVar.a == jaVar2.a) {
                    return jaVar.equals(jaVar2);
                }
                return false;
            default:
                lyb lybVar = (lyb) this.b.get(i);
                lyb lybVar2 = (lyb) this.c.get(i2);
                return lybVar.a == lybVar2.a && Objects.equals(lybVar.b, lybVar2.b);
        }
    }

    @Override // age
    public final int c() {
        switch (this.a) {
        }
        return this.c.size();
    }

    @Override // age
    public final int d() {
        switch (this.a) {
        }
        return this.b.size();
    }

    public /* synthetic */ ia() {
    }
}
