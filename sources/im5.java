// default package

import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class im5 {
    public final String a;
    public final float b;
    public final int c;
    public final String d;

    public im5(float f, int i, String str, String str2) {
        int i2 = uge.a;
        this.a = str == null ? "" : str;
        this.b = f;
        this.c = i;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof im5)) {
            return false;
        }
        im5 im5Var = (im5) obj;
        return vue.a(this.a, im5Var.a) && Float.compare(this.b, im5Var.b) == 0 && this.c == im5Var.c && vue.a(this.d, im5Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b), Integer.valueOf(this.c), this.d});
    }

    public final String toString() {
        ko9 ko9Var = new ko9(im5.class.getSimpleName(), (byte) 29);
        byte b = 26;
        boolean z = false;
        ko9 ko9Var2 = new ko9(b, z);
        ((ko9) ko9Var.d).d = ko9Var2;
        ko9Var.d = ko9Var2;
        ko9Var2.c = this.a;
        ko9Var2.b = "text";
        String valueOf = String.valueOf(this.b);
        xfd xfdVar = new xfd(b, z);
        ((ko9) ko9Var.d).d = xfdVar;
        ko9Var.d = xfdVar;
        xfdVar.c = valueOf;
        xfdVar.b = "confidence";
        String valueOf2 = String.valueOf(this.c);
        xfd xfdVar2 = new xfd(b, z);
        ((ko9) ko9Var.d).d = xfdVar2;
        xfdVar2.c = valueOf2;
        xfdVar2.b = "index";
        ko9 ko9Var3 = new ko9(b, z);
        xfdVar2.d = ko9Var3;
        ko9Var.d = ko9Var3;
        ko9Var3.c = this.d;
        ko9Var3.b = "mid";
        return ko9Var.toString();
    }
}
