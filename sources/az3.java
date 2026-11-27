// default package

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
