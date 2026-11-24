package com.google.firebase;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<mp2> getComponents() {
        lp2 a = mp2.a(new xw8(md0.class, vw2.class));
        a.a(new wd3(new xw8(md0.class, Executor.class), 1, 0));
        a.f = ize.c;
        mp2 b = a.b();
        lp2 a2 = mp2.a(new xw8(i16.class, vw2.class));
        a2.a(new wd3(new xw8(i16.class, Executor.class), 1, 0));
        a2.f = i2f.c;
        mp2 b2 = a2.b();
        lp2 a3 = mp2.a(new xw8(nk0.class, vw2.class));
        a3.a(new wd3(new xw8(nk0.class, Executor.class), 1, 0));
        a3.f = o5f.c;
        mp2 b3 = a3.b();
        lp2 a4 = mp2.a(new xw8(n4c.class, vw2.class));
        a4.a(new wd3(new xw8(n4c.class, Executor.class), 1, 0));
        a4.f = eef.c;
        return zk2.b(b, b2, b3, a4.b());
    }
}
