package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f3c lambda$getComponents$0(ir2 ir2Var) {
        i3c.b((Context) ir2Var.a(Context.class));
        return i3c.a().c(p61.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f3c lambda$getComponents$1(ir2 ir2Var) {
        i3c.b((Context) ir2Var.a(Context.class));
        return i3c.a().c(p61.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f3c lambda$getComponents$2(ir2 ir2Var) {
        i3c.b((Context) ir2Var.a(Context.class));
        return i3c.a().c(p61.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<xq2> getComponents() {
        wq2 b = xq2.b(f3c.class);
        b.a = LIBRARY_NAME;
        b.a(if3.b(Context.class));
        b.f = new rjb((byte) 10);
        xq2 b2 = b.b();
        wq2 a = xq2.a(new yy8(l26.class, f3c.class));
        a.a(if3.b(Context.class));
        a.f = new rjb((byte) 11);
        xq2 b3 = a.b();
        wq2 a2 = xq2.a(new yy8(d3c.class, f3c.class));
        a2.a(if3.b(Context.class));
        a2.f = new rjb((byte) 12);
        return Arrays.asList(b2, b3, a2.b(), rpe.a(LIBRARY_NAME, "19.0.0"));
    }
}
