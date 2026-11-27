package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e5c lambda$getComponents$0(qq2 qq2Var) {
        h5c.b((Context) qq2Var.a(Context.class));
        return h5c.a().c(q51.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e5c lambda$getComponents$1(qq2 qq2Var) {
        h5c.b((Context) qq2Var.a(Context.class));
        return h5c.a().c(q51.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e5c lambda$getComponents$2(qq2 qq2Var) {
        h5c.b((Context) qq2Var.a(Context.class));
        return h5c.a().c(q51.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<fq2> getComponents() {
        eq2 b = fq2.b(e5c.class);
        b.a = LIBRARY_NAME;
        b.a(qe3.b(Context.class));
        b.f = new grb((byte) 11);
        fq2 b2 = b.b();
        eq2 a = fq2.a(new h09(p26.class, e5c.class));
        a.a(qe3.b(Context.class));
        a.f = new grb((byte) 12);
        fq2 b3 = a.b();
        eq2 a2 = fq2.a(new h09(c5c.class, e5c.class));
        a2.a(qe3.b(Context.class));
        a2.f = new grb((byte) 13);
        return Arrays.asList(b2, b3, a2.b(), ise.a(LIBRARY_NAME, "19.0.0"));
    }
}
