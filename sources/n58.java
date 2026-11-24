// default package

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class n58 {
    public CharSequence a;
    public IconCompat b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;

    public static n58 a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        CharSequence charSequence = bundle.getCharSequence("name");
        IconCompat a = bundle2 != null ? IconCompat.a(bundle2) : null;
        String string = bundle.getString("uri");
        String string2 = bundle.getString("key");
        boolean z = bundle.getBoolean("isBot");
        boolean z2 = bundle.getBoolean("isImportant");
        n58 n58Var = new n58();
        n58Var.a = charSequence;
        n58Var.b = a;
        n58Var.c = string;
        n58Var.d = string2;
        n58Var.e = z;
        n58Var.f = z2;
        return n58Var;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.a);
        IconCompat iconCompat = this.b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.l() : null);
        bundle.putString("uri", this.c);
        bundle.putString("key", this.d);
        bundle.putBoolean("isBot", this.e);
        bundle.putBoolean("isImportant", this.f);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof n58)) {
            return false;
        }
        n58 n58Var = (n58) obj;
        String str = this.d;
        String str2 = n58Var.d;
        return (str == null && str2 == null) ? Objects.equals(Objects.toString(this.a), Objects.toString(n58Var.a)) && Objects.equals(this.c, n58Var.c) && Boolean.valueOf(this.e).equals(Boolean.valueOf(n58Var.e)) && Boolean.valueOf(this.f).equals(Boolean.valueOf(n58Var.f)) : Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.d;
        return str != null ? str.hashCode() : Objects.hash(this.a, this.c, Boolean.valueOf(this.e), Boolean.valueOf(this.f));
    }
}
