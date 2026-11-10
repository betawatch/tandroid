package a8;

import java.io.Serializable;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class ka {
    public static g9.u a(g9.u uVar) {
        return !(uVar instanceof g9.w) ? uVar instanceof g9.v ? uVar : uVar instanceof Serializable ? new g9.v(uVar) : new g9.w(uVar) : uVar;
    }
}
