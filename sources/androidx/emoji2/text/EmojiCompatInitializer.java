package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements pn5 {
    @Override // pn5
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // pn5
    public final Object b(Context context) {
        rl4 rl4Var = new rl4(new p13(context, (byte) 2));
        rl4Var.b = true;
        if (lw3.j == null) {
            synchronized (lw3.i) {
                if (lw3.j == null) {
                    lw3.j = new lw3(rl4Var);
                }
            }
        }
        c(context);
        return Boolean.TRUE;
    }

    public final void c(Context context) {
        Object obj;
        mv6 N = mv6.N(context);
        N.getClass();
        synchronized (mv6.h) {
            obj = ((HashMap) N.b).get(ProcessLifecycleInitializer.class);
            if (obj == null) {
                obj = N.z(ProcessLifecycleInitializer.class, new HashSet());
            }
        }
        g16 m = ((e16) obj).m();
        m.a(new mw3(this, m));
    }
}
