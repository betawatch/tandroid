package b8;

import java.io.Serializable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class bc {
    public static f9.t a(f9.t tVar) {
        return !(tVar instanceof f9.v) ? tVar instanceof f9.u ? tVar : tVar instanceof Serializable ? new f9.u(tVar) : new f9.v(tVar) : tVar;
    }
}
