// default package

import android.text.InputFilter;
import android.widget.TextView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ey3 extends efe {
    public final dy3 a;

    public ey3(TextView textView) {
        this.a = new dy3(textView);
    }

    @Override // efe
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return !(lw3.j != null) ? inputFilterArr : this.a.a(inputFilterArr);
    }

    @Override // efe
    public final void b(boolean z) {
        if (lw3.j != null) {
            this.a.b(z);
        }
    }

    @Override // efe
    public final void c(boolean z) {
        boolean z2 = lw3.j != null;
        dy3 dy3Var = this.a;
        if (z2) {
            dy3Var.c(z);
        } else {
            dy3Var.c = z;
        }
    }
}
