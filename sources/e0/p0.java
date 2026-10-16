package e0;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.NotificationsController;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class p0 {
    public final CharSequence a;
    public final Bundle b;
    public final HashSet c;

    public p0(String str, Bundle bundle, HashSet hashSet) {
        this.a = str;
        this.b = bundle;
        this.c = hashSet;
    }

    public static RemoteInput[] a(p0[] p0VarArr) {
        if (p0VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[p0VarArr.length];
        for (int i10 = 0; i10 < p0VarArr.length; i10++) {
            p0 p0Var = p0VarArr[i10];
            p0Var.getClass();
            RemoteInput.Builder addExtras = new RemoteInput.Builder(NotificationsController.EXTRA_VOICE_REPLY).setLabel(p0Var.a).setChoices(null).setAllowFreeFormInput(true).addExtras(p0Var.b);
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator it = p0Var.c.iterator();
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
