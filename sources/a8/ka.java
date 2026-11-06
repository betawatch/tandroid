package a8;

import java.io.Serializable;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class ka {
    public static g9.u a(g9.u uVar) {
        return !(uVar instanceof g9.w) ? uVar instanceof g9.v ? uVar : uVar instanceof Serializable ? new g9.v(uVar) : new g9.w(uVar) : uVar;
    }
}
