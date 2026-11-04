package d2;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class t0 {
    public int a;
    public int b;

    public /* synthetic */ t0(int i3, int i10) {
        this.a = i3;
        this.b = i10;
    }

    public int a() {
        int i3 = this.b;
        if (i3 == 2) {
            return 10;
        }
        if (i3 == 5) {
            return 11;
        }
        if (i3 == 29) {
            return 12;
        }
        if (i3 != 42) {
            return i3 != 22 ? i3 != 23 ? 0 : 15 : TLObject.FLAG_30;
        }
        return 16;
    }

    public int b() {
        return this.a | this.b;
    }
}
