// default package

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gg3 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ cj3 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ HashSet f;

    public /* synthetic */ gg3(cj3 cj3Var, int i, ArrayList arrayList, boolean z, HashSet hashSet) {
        this.b = cj3Var;
        this.c = i;
        this.d = arrayList;
        this.e = z;
        this.f = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.G4(this.d, this.c, false, this.e, this.f);
                break;
            default:
                this.b.V3(this.c, this.d, this.e, this.f);
                break;
        }
    }

    public /* synthetic */ gg3(cj3 cj3Var, ArrayList arrayList, int i, boolean z, HashSet hashSet) {
        this.b = cj3Var;
        this.d = arrayList;
        this.c = i;
        this.e = z;
        this.f = hashSet;
    }
}
