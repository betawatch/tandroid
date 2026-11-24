// default package

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class nm5 extends hg0 implements Serializable {
    public final transient b69 e;
    public final transient int f;

    public nm5(b69 b69Var, int i) {
        this.e = b69Var;
        this.f = i;
    }

    @Override // q3
    public final boolean c(Object obj) {
        return obj != null && super.c(obj);
    }

    @Override // q3
    public final Collection e() {
        return new sm5(this);
    }

    @Override // q3
    public final Collection g() {
        return (gm5) super.g();
    }

    @Override // q3
    public final Iterator h() {
        return new rm5(this);
    }

    @Override // q3
    public final Collection i(Object obj) {
        mm5 mm5Var = (mm5) this.e.get(obj);
        if (mm5Var != null) {
            return mm5Var;
        }
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override // q3
    public final Set j() {
        b69 b69Var = this.e;
        ym5 ym5Var = b69Var.b;
        if (ym5Var != null) {
            return ym5Var;
        }
        z59 d = b69Var.d();
        b69Var.b = d;
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
    public qm5 a() {
        return this.e;
    }
}
