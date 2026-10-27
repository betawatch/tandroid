package a8;

import java.io.Serializable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class ac {
    public static e9.t a(e9.t tVar) {
        return !(tVar instanceof e9.v) ? tVar instanceof e9.u ? tVar : tVar instanceof Serializable ? new e9.u(tVar) : new e9.v(tVar) : tVar;
    }
}
