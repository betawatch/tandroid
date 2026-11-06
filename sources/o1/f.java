package o1;

import android.content.SharedPreferences;
import java.util.Set;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
