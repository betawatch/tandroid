package o1;

import android.content.SharedPreferences;
import java.util.Set;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
