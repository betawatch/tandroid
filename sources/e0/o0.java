package e0;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.NotificationsController;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class o0 {
    public final CharSequence a;
    public final Bundle b;
    public final HashSet c;

    public o0(String str, Bundle bundle, HashSet hashSet) {
        this.a = str;
        this.b = bundle;
        this.c = hashSet;
    }

    public static RemoteInput[] a(o0[] o0VarArr) {
        if (o0VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[o0VarArr.length];
        for (int i10 = 0; i10 < o0VarArr.length; i10++) {
            o0 o0Var = o0VarArr[i10];
            o0Var.getClass();
            RemoteInput.Builder addExtras = new RemoteInput.Builder(NotificationsController.EXTRA_VOICE_REPLY).setLabel(o0Var.a).setChoices(null).setAllowFreeFormInput(true).addExtras(o0Var.b);
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator it = o0Var.c.iterator();
                while (it.hasNext()) {
                    w6.a.c(addExtras, (String) it.next());
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                b2.d.m(addExtras);
            }
            remoteInputArr[i10] = addExtras.build();
        }
        return remoteInputArr;
    }
}
