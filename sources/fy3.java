// default package

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
