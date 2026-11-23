package c8;

import android.content.SharedPreferences;
import org.telegram.messenger.np;
import org.telegram.ui.Components.n30;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
