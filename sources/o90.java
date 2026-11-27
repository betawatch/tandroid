// default package

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class o90 extends a23 {
    public final Context a;
    public final pj2 b;
    public final pj2 c;
    public final String d;

    public o90(Context context, pj2 pj2Var, pj2 pj2Var2, String str) {
        if (context == null) {
            p3d.h("Null applicationContext");
            throw null;
        }
        this.a = context;
        if (pj2Var == null) {
            p3d.h("Null wallClock");
            throw null;
        }
        this.b = pj2Var;
        if (pj2Var2 == null) {
            p3d.h("Null monotonicClock");
            throw null;
        }
        this.c = pj2Var2;
        if (str != null) {
            this.d = str;
        } else {
            p3d.h("Null backendName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a23) {
            o90 o90Var = (o90) ((a23) obj);
            if (this.a.equals(o90Var.a) && this.b.equals(o90Var.b) && this.c.equals(o90Var.c) && this.d.equals(o90Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return c00.k(sb, this.d, "}");
    }
}
