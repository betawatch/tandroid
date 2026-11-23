package c8;

import android.content.SharedPreferences;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.k30;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class ma {
    public static void a() {
        SharedPreferences.Editor edit = mp.g1().edit();
        for (k30 k30Var : k30.values()) {
            edit.remove(k30Var.a);
        }
        edit.apply();
    }
}
