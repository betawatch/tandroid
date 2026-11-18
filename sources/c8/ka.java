package c8;

import android.content.SharedPreferences;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.k30;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class ka {
    public static void a() {
        SharedPreferences.Editor edit = mp.g1().edit();
        for (k30 k30Var : k30.values()) {
            edit.remove(k30Var.a);
        }
        edit.apply();
    }
}
