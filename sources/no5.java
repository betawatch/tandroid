// default package

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class no5 extends ih0 implements Serializable {
    public final transient d89 e;
    public final transient int f;

    public no5(d89 d89Var, int i) {
        this.e = d89Var;
        this.f = i;
    }

    @Override // q3
    public final boolean c(Object obj) {
        return obj != null && super.c(obj);
    }

    @Override // q3
    public final Collection e() {
        return new so5(this);
    }

    @Override // q3
    public final Collection g() {
        return (go5) super.g();
    }

    @Override // q3
    public final Iterator h() {
        return new ro5(this);
    }

    @Override // q3
    public final Collection i(Object obj) {
        mo5 mo5Var = (mo5) this.e.get(obj);
        if (mo5Var != null) {
            return mo5Var;
        }
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override // q3
    public final Set j() {
        d89 d89Var = this.e;
        yo5 yo5Var = d89Var.b;
        if (yo5Var != null) {
            return yo5Var;
        }
        b89 d = d89Var.d();
        d89Var.b = d;
        return d;
    }

    @Override // q3
    public final boolean k(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // q3
    public final int l() {
        return this.f;
    }

    @Override // q3
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public qo5 a() {
        return this.e;
    }
}
