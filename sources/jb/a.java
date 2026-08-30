package jb;

import b6.m;
import java.util.Arrays;
import l7.w0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class a {
    public final String a;
    public final float b;
    public final int c;
    public final String d;

    public a(float f10, int i10, String str, String str2) {
        int i11 = m7.b.a;
        this.a = str == null ? "" : str;
        this.b = f10;
        this.c = i10;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.l(this.a, aVar.a) && Float.compare(this.b, aVar.b) == 0 && this.c == aVar.c && m.l(this.d, aVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b), Integer.valueOf(this.c), this.d});
    }

    public final String toString() {
        w0 w0Var = new w0(a.class.getSimpleName());
        w0 w0Var2 = new w0(4, false);
        ((w0) w0Var.d).d = w0Var2;
        w0Var.d = w0Var2;
        w0Var2.c = this.a;
        w0Var2.b = "text";
        String valueOf = String.valueOf(this.b);
        boolean z4 = false;
        m7.a aVar = new m7.a(4, z4);
        ((w0) w0Var.d).d = aVar;
        w0Var.d = aVar;
        aVar.c = valueOf;
        aVar.b = "confidence";
        String valueOf2 = String.valueOf(this.c);
        m7.a aVar2 = new m7.a(4, z4);
        ((w0) w0Var.d).d = aVar2;
        aVar2.c = valueOf2;
        aVar2.b = "index";
        w0 w0Var3 = new w0(4, z4);
        aVar2.d = w0Var3;
        w0Var.d = w0Var3;
        w0Var3.c = this.d;
        w0Var3.b = "mid";
        return w0Var.toString();
    }
}
