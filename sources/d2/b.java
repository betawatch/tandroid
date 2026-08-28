package d2;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b {
    public final int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final /* synthetic */ c j;

    public b(c cVar, int i9, int i10) {
        this.j = cVar;
        this.a = i9;
        this.b = i10;
        a();
    }

    public final void a() {
        c cVar = this.j;
        int[] iArr = (int[]) cVar.a;
        int[] iArr2 = (int[]) cVar.b;
        int i9 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i12 = TLObject.FLAG_31;
        int i13 = TLObject.FLAG_31;
        int i14 = TLObject.FLAG_31;
        int i15 = 0;
        for (int i16 = this.a; i16 <= this.b; i16++) {
            int i17 = iArr[i16];
            i15 += iArr2[i17];
            int i18 = (i17 >> 10) & 31;
            int i19 = (i17 >> 5) & 31;
            int i20 = i17 & 31;
            if (i18 > i12) {
                i12 = i18;
            }
            if (i18 < i9) {
                i9 = i18;
            }
            if (i19 > i13) {
                i13 = i19;
            }
            if (i19 < i10) {
                i10 = i19;
            }
            if (i20 > i14) {
                i14 = i20;
            }
            if (i20 < i11) {
                i11 = i20;
            }
        }
        this.d = i9;
        this.e = i12;
        this.f = i10;
        this.g = i13;
        this.h = i11;
        this.i = i14;
        this.c = i15;
    }

    public final int b() {
        return ((this.i - this.h) + 1) * ((this.g - this.f) + 1) * ((this.e - this.d) + 1);
    }
}
