package e0;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class l0 {
    public final CharSequence a;
    public final Bundle b;
    public final HashSet c;

    public l0(String str, Bundle bundle, HashSet hashSet) {
        this.a = str;
        this.b = bundle;
        this.c = hashSet;
    }

    public static RemoteInput[] a(l0[] l0VarArr) {
        if (l0VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[l0VarArr.length];
        for (int i7 = 0; i7 < l0VarArr.length; i7++) {
            l0 l0Var = l0VarArr[i7];
            l0Var.getClass();
            RemoteInput.Builder addExtras = new RemoteInput.Builder("extra_voice_reply").setLabel(l0Var.a).setChoices(null).setAllowFreeFormInput(true).addExtras(l0Var.b);
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator it = l0Var.c.iterator();
                while (it.hasNext()) {
                    f2.i.f(addExtras, (String) it.next());
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ab.x.n(addExtras);
            }
            remoteInputArr[i7] = addExtras.build();
        }
        return remoteInputArr;
    }
}
