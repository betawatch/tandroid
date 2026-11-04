package b8;

import android.content.SharedPreferences;
import org.telegram.messenger.hp;
import org.telegram.ui.Components.v20;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class lf {
    public static void a() {
        SharedPreferences.Editor edit = hp.e1().edit();
        for (v20 v20Var : v20.values()) {
            edit.remove(v20Var.a);
        }
        edit.apply();
    }
}
