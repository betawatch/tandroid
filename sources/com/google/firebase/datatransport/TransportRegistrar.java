package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f1c lambda$getComponents$0(xp2 xp2Var) {
        i1c.b((Context) xp2Var.a(Context.class));
        return i1c.a().c(i51.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f1c lambda$getComponents$1(xp2 xp2Var) {
        i1c.b((Context) xp2Var.a(Context.class));
        return i1c.a().c(i51.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f1c lambda$getComponents$2(xp2 xp2Var) {
        i1c.b((Context) xp2Var.a(Context.class));
        return i1c.a().c(i51.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<mp2> getComponents() {
        lp2 b = mp2.b(f1c.class);
        b.a = LIBRARY_NAME;
        b.a(wd3.b(Context.class));
        b.f = new fyb((byte) 4);
        mp2 b2 = b.b();
        lp2 a = mp2.a(new xw8(l06.class, f1c.class));
        a.a(wd3.b(Context.class));
        a.f = new fyb((byte) 5);
        mp2 b3 = a.b();
        lp2 a2 = mp2.a(new xw8(d1c.class, f1c.class));
        a2.a(wd3.b(Context.class));
        a2.f = new fyb((byte) 6);
        return Arrays.asList(b2, b3, a2.b(), one.a(LIBRARY_NAME, "19.0.0"));
    }
}
