// default package

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fm5 {
    public final String a;
    public final float b;
    public final int c;
    public final String d;

    public fm5(float f, int i, String str, String str2) {
        int i2 = fee.a;
        this.a = str == null ? "" : str;
        this.b = f;
        this.c = i;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fm5)) {
            return false;
        }
        fm5 fm5Var = (fm5) obj;
        return fse.a(this.a, fm5Var.a) && Float.compare(this.b, fm5Var.b) == 0 && this.c == fm5Var.c && fse.a(this.d, fm5Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b), Integer.valueOf(this.c), this.d});
    }

    public final String toString() {
        wm9 wm9Var = new wm9(fm5.class.getSimpleName(), (byte) 29);
        byte b = 26;
        boolean z = false;
        wm9 wm9Var2 = new wm9(b, z);
        ((wm9) wm9Var.d).d = wm9Var2;
        wm9Var.d = wm9Var2;
        wm9Var2.c = this.a;
        wm9Var2.b = "text";
        String valueOf = String.valueOf(this.b);
        gdd gddVar = new gdd(b, z);
        ((wm9) wm9Var.d).d = gddVar;
        wm9Var.d = gddVar;
        gddVar.c = valueOf;
        gddVar.b = "confidence";
        String valueOf2 = String.valueOf(this.c);
        gdd gddVar2 = new gdd(b, z);
        ((wm9) wm9Var.d).d = gddVar2;
        gddVar2.c = valueOf2;
        gddVar2.b = "index";
        wm9 wm9Var3 = new wm9(b, z);
        gddVar2.d = wm9Var3;
        wm9Var.d = wm9Var3;
        wm9Var3.c = this.d;
        wm9Var3.b = "mid";
        return wm9Var.toString();
    }
}
