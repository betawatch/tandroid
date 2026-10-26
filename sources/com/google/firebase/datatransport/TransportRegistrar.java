package com.google.firebase.datatransport;

import android.content.Context;
import b2.n0;
import com.google.firebase.components.ComponentRegistrar;
import j5.f;
import java.util.Arrays;
import java.util.List;
import k5.a;
import m5.t;
import s9.b;
import s9.j;
import w7.o5;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$0(b bVar) {
        t.b((Context) bVar.a(Context.class));
        return t.a().c(a.f);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<s9.a> getComponents() {
        n0 a2 = s9.a.a(f.class);
        a2.d = LIBRARY_NAME;
        a2.a(j.a(Context.class));
        a2.f = new gh.a(28);
        return Arrays.asList(a2.b(), o5.a(LIBRARY_NAME, "18.1.8"));
    }
}
