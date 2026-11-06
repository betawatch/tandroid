package c8;

import android.content.SharedPreferences;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.z20;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class ga {
    public static void a() {
        SharedPreferences.Editor edit = qp.e1().edit();
        for (z20 z20Var : z20.values()) {
            edit.remove(z20Var.a);
        }
        edit.apply();
    }
}
