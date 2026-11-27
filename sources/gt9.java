// default package

import j$.util.Objects;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class gt9 extends ka {
    public final it9 c;
    public final String d;

    public gt9(int i, String str) {
        super(i, false);
        this.d = str;
        this.c = null;
    }

    public final boolean equals(Object obj) {
        it9 it9Var;
        if (this == obj) {
            return true;
        }
        if (obj == null || gt9.class != obj.getClass()) {
            return false;
        }
        gt9 gt9Var = (gt9) obj;
        if (this.a != gt9Var.a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, gt9Var.d);
        }
        it9 it9Var2 = this.c;
        return it9Var2 == null || (it9Var = gt9Var.c) == null || it9Var2.d == it9Var.d;
    }

    public gt9(it9 it9Var) {
        super(2, false);
        this.c = it9Var;
    }

    public gt9(int i) {
        super(i, false);
        this.c = null;
    }
}
