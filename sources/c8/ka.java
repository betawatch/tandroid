package c8;

import android.content.SharedPreferences;
import org.telegram.messenger.np;
import org.telegram.ui.Components.n30;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public abstract class ka {
    public static void a() {
        SharedPreferences.Editor edit = np.g1().edit();
        for (n30 n30Var : n30.values()) {
            edit.remove(n30Var.a);
        }
        edit.apply();
    }
}
