// default package

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class fy3 extends iw3 {
    public final WeakReference a;

    public fy3(EditText editText) {
        this.a = new WeakReference(editText);
    }

    @Override // iw3
    public final void a() {
        gy3.a((EditText) this.a.get(), 1);
    }
}
