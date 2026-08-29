package e0;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.NotificationsController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        for (int i10 = 0; i10 < r0VarArr.length; i10++) {
            r0 r0Var = r0VarArr[i10];
            r0Var.getClass();
            RemoteInput.Builder addExtras = new RemoteInput.Builder(NotificationsController.EXTRA_VOICE_REPLY).setLabel(r0Var.a).setChoices(null).setAllowFreeFormInput(true).addExtras(r0Var.b);
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator it = r0Var.c.iterator();
                while (it.hasNext()) {
                    i6.a.g(addExtras, (String) it.next());
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                com.google.firebase.messaging.p.h(addExtras);
            }
            remoteInputArr[i10] = addExtras.build();
        }
        return remoteInputArr;
    }
}
