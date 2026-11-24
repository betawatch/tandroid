// default package

import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class fk5 {
    public final String a;
    public final float b;
    public final int c;
    public final String d;

    public fk5(float f, int i, String str, String str2) {
        int i2 = ece.a;
        this.a = str == null ? "" : str;
        this.b = f;
        this.c = i;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fk5)) {
            return false;
        }
        fk5 fk5Var = (fk5) obj;
        return cqe.a(this.a, fk5Var.a) && Float.compare(this.b, fk5Var.b) == 0 && this.c == fk5Var.c && cqe.a(this.d, fk5Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b), Integer.valueOf(this.c), this.d});
    }

    public final String toString() {
        vk9 vk9Var = new vk9(fk5.class.getSimpleName(), (byte) 29);
        byte b = 26;
        boolean z = false;
        vk9 vk9Var2 = new vk9(b, z);
        ((vk9) vk9Var.d).d = vk9Var2;
        vk9Var.d = vk9Var2;
        vk9Var2.c = this.a;
        vk9Var2.b = "text";
        String valueOf = String.valueOf(this.b);
        ebd ebdVar = new ebd(b, z);
        ((vk9) vk9Var.d).d = ebdVar;
        vk9Var.d = ebdVar;
        ebdVar.c = valueOf;
        ebdVar.b = "confidence";
        String valueOf2 = String.valueOf(this.c);
        ebd ebdVar2 = new ebd(b, z);
        ((vk9) vk9Var.d).d = ebdVar2;
        ebdVar2.c = valueOf2;
        ebdVar2.b = "index";
        vk9 vk9Var3 = new vk9(b, z);
        ebdVar2.d = vk9Var3;
        vk9Var.d = vk9Var3;
        vk9Var3.c = this.d;
        vk9Var3.b = "mid";
        return vk9Var.toString();
    }
}
