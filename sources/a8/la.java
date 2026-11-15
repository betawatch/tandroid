package a8;

import java.io.Serializable;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public abstract class la {
    public static g9.t a(g9.t tVar) {
        return !(tVar instanceof g9.v) ? tVar instanceof g9.u ? tVar : tVar instanceof Serializable ? new g9.u(tVar) : new g9.v(tVar) : tVar;
    }
}
