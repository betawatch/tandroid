// default package

import android.content.Context;
import android.os.Bundle;
import java.util.Set;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class i2d extends z0d implements ey4, fy4 {
    public static final op5 l = n2d.a;
    public final Context c;
    public final o59 d;
    public final op5 e;
    public final Set f;
    public final ntb i;
    public eha j;
    public w1d k;

    public i2d(Context context, o59 o59Var, ntb ntbVar) {
        super((byte) 1);
        this.c = context;
        this.d = o59Var;
        this.i = ntbVar;
        this.f = (Set) ntbVar.a;
        this.e = l;
    }

    @Override // z0d
    public final void U(c3d c3dVar) {
        this.d.post(new rld((Object) this, (Object) c3dVar, false, (byte) 13));
    }

    @Override // ey4
    public final void onConnected(Bundle bundle) {
        this.j.B(this);
    }

    @Override // fy4
    public final void onConnectionFailed(ds2 ds2Var) {
        this.k.b(ds2Var);
    }

    @Override // ey4
    public final void onConnectionSuspended(int i) {
        w1d w1dVar = this.k;
        u1d u1dVar = (u1d) w1dVar.f.s.get(w1dVar.b);
        if (u1dVar != null) {
            if (u1dVar.k) {
                u1dVar.k(new ds2(17, null, null));
            } else {
                u1dVar.onConnectionSuspended(i);
            }
        }
    }
}
