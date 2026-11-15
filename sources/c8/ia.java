package c8;

import android.content.SharedPreferences;
import org.telegram.messenger.np;
import org.telegram.ui.Components.c30;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
