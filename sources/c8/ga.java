package c8;

import android.content.SharedPreferences;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.z20;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
