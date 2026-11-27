// default package

import java.util.Iterator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ms9 extends ns9 implements Iterator {
    public ls9 a;
    public boolean b = true;
    public final /* synthetic */ os9 c;

    public ms9(os9 os9Var) {
        this.c = os9Var;
    }

    @Override // ns9
    public final void a(ls9 ls9Var) {
        ls9 ls9Var2 = this.a;
        if (ls9Var == ls9Var2) {
            ls9 ls9Var3 = ls9Var2.d;
            this.a = ls9Var3;
            this.b = ls9Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b) {
            return this.c.a != null;
        }
        ls9 ls9Var = this.a;
        return (ls9Var == null || ls9Var.c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b) {
            this.b = false;
            ls9 ls9Var = this.c.a;
            this.a = ls9Var;
            return ls9Var;
        }
        ls9 ls9Var2 = this.a;
        ls9 ls9Var3 = ls9Var2 != null ? ls9Var2.c : null;
        this.a = ls9Var3;
        return ls9Var3;
    }
}
