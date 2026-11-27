// default package

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class krb extends s29 {
    public static final String d;
    public static final String e;
    public final boolean b;
    public final boolean c;

    static {
        String str = gcc.a;
        d = "1";
        e = "2";
    }

    public krb() {
        this.b = false;
        this.c = false;
    }

    @Override // s29
    public final boolean b() {
        return this.b;
    }

    @Override // s29
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(s29.a, 3);
        bundle.putBoolean(d, this.b);
        bundle.putBoolean(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof krb)) {
            return false;
        }
        krb krbVar = (krb) obj;
        return this.c == krbVar.c && this.b == krbVar.b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }

    public krb(boolean z) {
        this.b = true;
        this.c = z;
    }
}
