// default package

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ah3 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ uj3 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ HashSet f;

    public /* synthetic */ ah3(uj3 uj3Var, int i, ArrayList arrayList, boolean z, HashSet hashSet) {
        this.b = uj3Var;
        this.d = i;
        this.c = arrayList;
        this.e = z;
        this.f = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.Y3(this.d, this.c, this.e, this.f);
                break;
            default:
                this.b.K4(this.c, this.d, false, this.e, this.f);
                break;
        }
    }

    public /* synthetic */ ah3(uj3 uj3Var, ArrayList arrayList, int i, boolean z, HashSet hashSet) {
        this.b = uj3Var;
        this.c = arrayList;
        this.d = i;
        this.e = z;
        this.f = hashSet;
    }
}
