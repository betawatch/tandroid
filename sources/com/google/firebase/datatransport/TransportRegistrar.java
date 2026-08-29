package com.google.firebase.datatransport;

import a9.b;
import a9.c;
import a9.m;
import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import h7.v7;
import java.util.Arrays;
import java.util.List;
import org.telegram.ui.xx0;
import v2.f;
import w2.a;
import y2.q;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$0(c cVar) {
        q.b((Context) cVar.a(Context.class));
        return q.a().c(a.f);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        a9.a b10 = b.b(f.class);
        b10.c = LIBRARY_NAME;
        b10.a(m.b(Context.class));
        b10.g = new xx0(29);
        return Arrays.asList(b10.b(), v7.a(LIBRARY_NAME, "18.1.8"));
    }
}
