// default package

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
