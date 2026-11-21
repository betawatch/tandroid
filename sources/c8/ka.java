package c8;

import android.content.SharedPreferences;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.n30;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public abstract class ka {
    public static void a() {
        SharedPreferences.Editor edit = mp.g1().edit();
        for (n30 n30Var : n30.values()) {
            edit.remove(n30Var.a);
        }
        edit.apply();
    }
}
