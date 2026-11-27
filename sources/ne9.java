// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ne9 extends iv5 {
    public final jv5 e;

    public ne9(jv5 jv5Var) {
        this.e = jv5Var;
    }

    @Override // iv5
    public final boolean k() {
        return false;
    }

    @Override // iv5
    public final void l(Throwable th) {
        Object v = j().v();
        boolean z = v instanceof yp2;
        jv5 jv5Var = this.e;
        if (z) {
            jv5Var.resumeWith(ixe.a(((yp2) v).a));
        } else {
            jv5Var.resumeWith(yed.a(v));
        }
    }
}
