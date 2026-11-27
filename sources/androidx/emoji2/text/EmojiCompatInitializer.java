package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements sp5 {
    @Override // sp5
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // sp5
    public final Object b(Context context) {
        wn4 wn4Var = new wn4(new vj0(context, (byte) 3));
        wn4Var.b = true;
        if (gx3.j == null) {
            synchronized (gx3.i) {
                if (gx3.j == null) {
                    gx3.j = new gx3(wn4Var);
                }
            }
        }
        c(context);
        return Boolean.TRUE;
    }

    public final void c(Context context) {
        Object obj;
        rx6 O = rx6.O(context);
        O.getClass();
        synchronized (rx6.h) {
            obj = ((HashMap) O.b).get(ProcessLifecycleInitializer.class);
            if (obj == null) {
                obj = O.B(ProcessLifecycleInitializer.class, new HashSet());
            }
        }
        k36 m = ((i36) obj).m();
        m.a(new hx3(this, m));
    }
}
