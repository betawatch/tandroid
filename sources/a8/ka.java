package a8;

import java.io.Serializable;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public abstract class ka {
    public static g9.u a(g9.u uVar) {
        return !(uVar instanceof g9.w) ? uVar instanceof g9.v ? uVar : uVar instanceof Serializable ? new g9.v(uVar) : new g9.w(uVar) : uVar;
    }
}
