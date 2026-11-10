package o1;

import android.content.SharedPreferences;
import java.util.Set;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
