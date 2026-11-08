package o1;

import android.content.SharedPreferences;
import java.util.Set;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class f {
    public final SharedPreferences a;
    public final Set b;

    public f(SharedPreferences prefs, Set set) {
        j.e(prefs, "prefs");
        this.a = prefs;
        this.b = set;
    }
}
