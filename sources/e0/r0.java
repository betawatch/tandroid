package e0;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.NotificationsController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r0 {
    public final CharSequence a;
    public final Bundle b;
    public final HashSet c;

    public r0(String str, Bundle bundle, HashSet hashSet) {
        this.a = str;
        this.b = bundle;
        this.c = hashSet;
    }

    public static RemoteInput[] a(r0[] r0VarArr) {
        if (r0VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[r0VarArr.length];
        for (int i9 = 0; i9 < r0VarArr.length; i9++) {
            r0 r0Var = r0VarArr[i9];
            r0Var.getClass();
            RemoteInput.Builder addExtras = new RemoteInput.Builder(NotificationsController.EXTRA_VOICE_REPLY).setLabel(r0Var.a).setChoices(null).setAllowFreeFormInput(true).addExtras(r0Var.b);
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator it = r0Var.c.iterator();
                while (it.hasNext()) {
                    g6.a.f(addExtras, (String) it.next());
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                com.google.firebase.messaging.q.h(addExtras);
            }
            remoteInputArr[i9] = addExtras.build();
        }
        return remoteInputArr;
    }
}
