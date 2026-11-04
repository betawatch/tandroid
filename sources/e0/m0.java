package e0;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m0 {
    public final CharSequence a;
    public final Bundle b;
    public final HashSet c;

    public m0(String str, Bundle bundle, HashSet hashSet) {
        this.a = str;
        this.b = bundle;
        this.c = hashSet;
    }

    public static RemoteInput[] a(m0[] m0VarArr) {
        if (m0VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[m0VarArr.length];
        for (int i3 = 0; i3 < m0VarArr.length; i3++) {
            m0 m0Var = m0VarArr[i3];
            m0Var.getClass();
            RemoteInput.Builder addExtras = new RemoteInput.Builder("extra_voice_reply").setLabel(m0Var.a).setChoices(null).setAllowFreeFormInput(true).addExtras(m0Var.b);
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator it = m0Var.c.iterator();
                while (it.hasNext()) {
                    y6.a.f(addExtras, (String) it.next());
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                d2.d.n(addExtras);
            }
            remoteInputArr[i3] = addExtras.build();
        }
        return remoteInputArr;
    }
}
