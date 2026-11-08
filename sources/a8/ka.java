package a8;

import java.io.Serializable;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class ka {
    public static g9.u a(g9.u uVar) {
        return !(uVar instanceof g9.w) ? uVar instanceof g9.v ? uVar : uVar instanceof Serializable ? new g9.v(uVar) : new g9.w(uVar) : uVar;
    }
}
