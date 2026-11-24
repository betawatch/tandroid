// default package

import android.graphics.Bitmap;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class gs1 extends i98 {
    public final /* synthetic */ Bitmap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ mu1 c;

    public gs1(mu1 mu1Var, Bitmap bitmap, ArrayList arrayList) {
        this.c = mu1Var;
        this.a = bitmap;
        this.b = arrayList;
    }

    @Override // i98, o98
    public final void L(int i, oac oacVar, boolean z, int i2, int i3, boolean z2) {
        this.c.G((jm6) this.b.get(0), oacVar, z, i2, z2, 0L);
    }

    @Override // i98, o98
    public final jl5 k(int i) {
        return new jl5(this.a, null, 0);
    }
}
