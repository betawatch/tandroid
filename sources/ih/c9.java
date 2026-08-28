package ih;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class c9 extends w {
    public final /* synthetic */ m9 M0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(m9 m9Var, int i9, Context context, m9 m9Var2, b bVar) {
        super(context);
        this.M0 = m9Var;
        this.w0 = new ArrayList();
        this.z0 = true;
        this.I0 = new androidx.activity.i(this, 25);
        this.K0 = -1;
        this.u0 = i9;
        this.D0 = new f4(context);
        this.J0 = m9Var2;
        r7 r7Var = new r7(this, context, m9Var2, bVar);
        this.v0 = r7Var;
        setAdapter(r7Var);
        gh.i3 i3Var = new gh.i3(this, 24);
        boolean z10 = this.i0 == null;
        this.i0 = i3Var;
        setChildrenDrawingOrderEnabled(true);
        this.k0 = 1;
        this.j0 = 2;
        if (z10) {
            s();
        }
        setOffscreenPageLimit(0);
        b(new s7(this, m9Var2));
        setOverScrollMode(2);
    }
}
