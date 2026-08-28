package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import f7.c7;
import java.util.Arrays;
import java.util.List;
import t2.f;
import u2.a;
import w2.q;
import y8.b;
import y8.j;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$0(b bVar) {
        q.b((Context) bVar.a(Context.class));
        return q.a().c(a.f);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<y8.a> getComponents() {
        tg.b a2 = y8.a.a(f.class);
        a2.c = LIBRARY_NAME;
        a2.a(j.a(Context.class));
        a2.f = new mg.b(14);
        return Arrays.asList(a2.b(), c7.a(LIBRARY_NAME, "18.1.8"));
    }
}
