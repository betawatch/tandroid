package com.google.firebase.datatransport;

import a8.i8;
import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import e2.j0;
import hi.e9;
import java.util.Arrays;
import java.util.List;
import l5.f;
import m5.a;
import o5.s;
import u9.b;
import u9.i;
import u9.q;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$0(b bVar) {
        s.b((Context) bVar.a(Context.class));
        return s.a().c(a.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$1(b bVar) {
        s.b((Context) bVar.a(Context.class));
        return s.a().c(a.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$2(b bVar) {
        s.b((Context) bVar.a(Context.class));
        return s.a().c(a.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<u9.a> getComponents() {
        j0 a10 = u9.a.a(f.class);
        a10.d = LIBRARY_NAME;
        a10.a(i.a(Context.class));
        a10.f = new e9(27);
        u9.a b10 = a10.b();
        j0 b11 = u9.a.b(new q(la.a.class, f.class));
        b11.a(i.a(Context.class));
        b11.f = new e9(28);
        u9.a b12 = b11.b();
        j0 b13 = u9.a.b(new q(la.b.class, f.class));
        b13.a(i.a(Context.class));
        b13.f = new e9(29);
        return Arrays.asList(b10, b12, b13.b(), i8.a(LIBRARY_NAME, "19.0.0"));
    }
}
