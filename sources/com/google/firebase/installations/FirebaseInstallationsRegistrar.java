package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static rg4 lambda$getComponents$0(xp2 xp2Var) {
        return new qg4((jg4) xp2Var.a(jg4.class), xp2Var.d(qd5.class), (ExecutorService) xp2Var.i(new xw8(md0.class, ExecutorService.class)), new v4a((Executor) xp2Var.i(new xw8(nk0.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<mp2> getComponents() {
        lp2 b = mp2.b(rg4.class);
        b.a = LIBRARY_NAME;
        b.a(wd3.b(jg4.class));
        b.a(new wd3(0, 1, qd5.class));
        b.a(new wd3(new xw8(md0.class, ExecutorService.class), 1, 0));
        b.a(new wd3(new xw8(nk0.class, Executor.class), 1, 0));
        b.f = new w44((byte) 17);
        mp2 b2 = b.b();
        pd5 pd5Var = new pd5((byte) 0);
        lp2 b3 = mp2.b(pd5.class);
        b3.e = true;
        b3.f = new kp2(pd5Var, (byte) 1);
        return Arrays.asList(b2, b3.b(), one.a(LIBRARY_NAME, "19.1.2"));
    }
}
