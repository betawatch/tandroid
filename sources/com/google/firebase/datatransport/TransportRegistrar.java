package com.google.firebase.datatransport;

import android.content.Context;
import b2.m0;
import com.google.firebase.components.ComponentRegistrar;
import i5.f;
import j5.a;
import java.util.Arrays;
import java.util.List;
import l5.t;
import r9.b;
import r9.j;
import w7.w8;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$0(b bVar) {
        t.b((Context) bVar.a(Context.class));
        return t.a().c(a.f);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<r9.a> getComponents() {
        m0 a2 = r9.a.a(f.class);
        a2.d = LIBRARY_NAME;
        a2.a(j.a(Context.class));
        a2.f = new fh.b(18);
        return Arrays.asList(a2.b(), w8.a(LIBRARY_NAME, "18.1.8"));
    }
}
