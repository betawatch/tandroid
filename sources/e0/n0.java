package e0;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.NotificationsController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class n0 {
    public final CharSequence a;
    public final Bundle b;
    public final HashSet c;

    public n0(String str, Bundle bundle, HashSet hashSet) {
        this.a = str;
        this.b = bundle;
        this.c = hashSet;
    }

    public static RemoteInput[] a(n0[] n0VarArr) {
        if (n0VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[n0VarArr.length];
        for (int i10 = 0; i10 < n0VarArr.length; i10++) {
            n0 n0Var = n0VarArr[i10];
            n0Var.getClass();
            RemoteInput.Builder addExtras = new RemoteInput.Builder(NotificationsController.EXTRA_VOICE_REPLY).setLabel(n0Var.a).setChoices(null).setAllowFreeFormInput(true).addExtras(n0Var.b);
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator it = n0Var.c.iterator();
                while (it.hasNext()) {
                    x6.a.c(addExtras, (String) it.next());
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
