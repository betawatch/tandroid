package di;

import android.text.Spannable;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class k {
    public final WeakReference a;
    public final HashMap b = new HashMap();

    public k(Spannable spannable) {
        this.a = new WeakReference(spannable);
    }
}
