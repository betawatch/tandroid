// default package

import java.util.Iterator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ks9 extends ns9 implements Iterator {
    public ls9 a;
    public ls9 b;
    public final /* synthetic */ byte c;

    public ks9(ls9 ls9Var, ls9 ls9Var2, byte b) {
        this.c = b;
        this.a = ls9Var2;
        this.b = ls9Var;
    }

    @Override // ns9
    public final void a(ls9 ls9Var) {
        ls9 ls9Var2;
        ls9 ls9Var3 = this.a;
        ls9 ls9Var4 = null;
        if (ls9Var3 == ls9Var && ls9Var == this.b) {
            this.b = null;
            this.a = null;
            ls9Var3 = null;
        }
        ls9 ls9Var5 = ls9Var3;
        if (ls9Var3 == ls9Var) {
            switch (this.c) {
                case 0:
                    ls9Var2 = ls9Var3.d;
                    break;
                default:
                    ls9Var2 = ls9Var3.c;
                    break;
            }
            ls9Var5 = ls9Var2;
            this.a = ls9Var5;
        }
        ls9 ls9Var6 = this.b;
        if (ls9Var6 == ls9Var) {
            if (ls9Var6 != ls9Var5 && ls9Var5 != null) {
                ls9Var4 = b(ls9Var6);
            }
            this.b = ls9Var4;
        }
    }

    public final ls9 b(ls9 ls9Var) {
        switch (this.c) {
            case 0:
                return ls9Var.c;
            default:
                return ls9Var.d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ls9 ls9Var = this.b;
        ls9 ls9Var2 = this.a;
        this.b = (ls9Var == ls9Var2 || ls9Var2 == null) ? null : b(ls9Var);
        return ls9Var;
    }
}
