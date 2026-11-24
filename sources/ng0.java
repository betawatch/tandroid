// default package

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class ng0 extends ka {
    public final boolean d;
    public final boolean e;
    public final ArrayList f = new ArrayList();
    public String h;
    public mg0 n;
    public lg0 r;
    public int s;
    public boolean w;

    public ng0(boolean z, boolean z2) {
        this.d = z;
        this.e = z2;
    }

    public final void F() {
        if (this.r != null) {
            Utilities.g.a(this.r);
            this.r = null;
        }
        this.s++;
    }

    public final void G(String str) {
        F();
        if (TextUtils.isEmpty(str)) {
            this.f.clear();
            this.w = false;
            f();
        } else {
            this.w = true;
            co3 co3Var = Utilities.g;
            lg0 lg0Var = new lg0((sa6) this, str, (byte) 0);
            this.r = lg0Var;
            co3Var.d(lg0Var, 400L);
        }
    }
}
