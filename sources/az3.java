// default package

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class az3 extends dx3 {
    public final WeakReference a;

    public az3(EditText editText) {
        this.a = new WeakReference(editText);
    }

    @Override // dx3
    public final void a() {
        bz3.a((EditText) this.a.get(), 1);
    }
}
