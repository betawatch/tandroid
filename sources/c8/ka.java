package c8;

import android.content.SharedPreferences;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.k30;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
