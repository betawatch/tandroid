package a8;

import java.io.Serializable;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class la {
    public static g9.t a(g9.t tVar) {
        return !(tVar instanceof g9.v) ? tVar instanceof g9.u ? tVar : tVar instanceof Serializable ? new g9.u(tVar) : new g9.v(tVar) : tVar;
    }
}
