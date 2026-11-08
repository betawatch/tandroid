package a8;

import java.io.Serializable;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public abstract class ka {
    public static g9.u a(g9.u uVar) {
        return !(uVar instanceof g9.w) ? uVar instanceof g9.v ? uVar : uVar instanceof Serializable ? new g9.v(uVar) : new g9.w(uVar) : uVar;
    }
}
