package a8;

import java.io.Serializable;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class ac {
    public static e9.t a(e9.t tVar) {
        return !(tVar instanceof e9.v) ? tVar instanceof e9.u ? tVar : tVar instanceof Serializable ? new e9.u(tVar) : new e9.v(tVar) : tVar;
    }
}
