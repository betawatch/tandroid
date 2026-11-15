package c8;

import android.content.SharedPreferences;
import org.telegram.messenger.np;
import org.telegram.ui.Components.c30;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class ia {
    public static void a() {
        SharedPreferences.Editor edit = np.e1().edit();
        for (c30 c30Var : c30.values()) {
            edit.remove(c30Var.a);
        }
        edit.apply();
    }
}
