package e0;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.NotificationsController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class q0 {
    public final CharSequence a;
    public final Bundle b;
    public final HashSet c;

    public q0(String str, Bundle bundle, HashSet hashSet) {
        this.a = str;
        this.b = bundle;
        this.c = hashSet;
    }

    public static RemoteInput[] a(q0[] q0VarArr) {
        if (q0VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[q0VarArr.length];
        for (int i10 = 0; i10 < q0VarArr.length; i10++) {
            q0 q0Var = q0VarArr[i10];
            q0Var.getClass();
            RemoteInput.Builder addExtras = new RemoteInput.Builder(NotificationsController.EXTRA_VOICE_REPLY).setLabel(q0Var.a).setChoices(null).setAllowFreeFormInput(true).addExtras(q0Var.b);
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator it = q0Var.c.iterator();
                while (it.hasNext()) {
                    k6.a.g(addExtras, (String) it.next());
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                com.google.firebase.messaging.q.h(addExtras);
            }
            remoteInputArr[i10] = addExtras.build();
        }
        return remoteInputArr;
    }
}
