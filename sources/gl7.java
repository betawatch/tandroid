// default package

import android.os.Bundle;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class gl7 {
    public xk7 a;
    public CharSequence b;
    public CharSequence c;
    public boolean d = false;

    public void a(Bundle bundle) {
        if (this.d) {
            bundle.putCharSequence("android.summaryText", this.c);
        }
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String c = c();
        if (c != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c);
        }
    }

    public abstract void b(h31 h31Var);

    public String c() {
        return null;
    }
}
