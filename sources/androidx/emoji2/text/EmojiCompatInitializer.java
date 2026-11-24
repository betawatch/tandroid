package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements pp5 {
    @Override // pp5
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // pp5
    public final Object b(Context context) {
        sn4 sn4Var = new sn4(new uk0(context, (byte) 3));
        sn4Var.b = true;
        if (wx3.j == null) {
            synchronized (wx3.i) {
                if (wx3.j == null) {
                    wx3.j = new wx3(sn4Var);
                }
            }
        }
        c(context);
        return Boolean.TRUE;
    }

    public final void c(Context context) {
        Object obj;
        mx6 P = mx6.P(context);
        P.getClass();
        synchronized (mx6.h) {
            obj = ((HashMap) P.b).get(ProcessLifecycleInitializer.class);
            if (obj == null) {
                obj = P.C(ProcessLifecycleInitializer.class, new HashSet());
            }
        }
        g36 m = ((e36) obj).m();
        m.a(new xx3(this, m));
    }
}
