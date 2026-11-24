// default package

import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ia extends zde {
    public final /* synthetic */ byte a = 0;
    public ArrayList b;
    public ArrayList c;

    public ia(ArrayList arrayList, ArrayList arrayList2) {
        this.b = arrayList;
        this.c = arrayList2;
    }

    @Override // zde
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

    @Override // zde
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
                iwb iwbVar = (iwb) this.b.get(i);
                iwb iwbVar2 = (iwb) this.c.get(i2);
                return iwbVar.a == iwbVar2.a && Objects.equals(iwbVar.b, iwbVar2.b);
        }
    }

    @Override // zde
    public final int c() {
        switch (this.a) {
        }
        return this.c.size();
    }

    @Override // zde
    public final int d() {
        switch (this.a) {
        }
        return this.b.size();
    }

    public /* synthetic */ ia() {
    }
}
