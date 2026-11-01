package di;

import android.text.Spannable;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final class k {
    public final WeakReference a;
    public final HashMap b = new HashMap();

    public k(Spannable spannable) {
        this.a = new WeakReference(spannable);
    }
}
