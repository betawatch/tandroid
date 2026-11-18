package o1;

import android.content.SharedPreferences;
import java.util.Set;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
