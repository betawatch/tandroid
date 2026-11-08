package c8;

import android.content.SharedPreferences;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.z20;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
