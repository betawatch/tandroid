package com.google.firebase.datatransport;

import android.content.Context;
import c9.b;
import c9.c;
import c9.l;
import com.google.firebase.components.ComponentRegistrar;
import j7.m8;
import java.util.Arrays;
import java.util.List;
import v2.f;
import w2.a;
import y2.q;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        c9.a b10 = b.b(f.class);
        b10.a = LIBRARY_NAME;
        b10.a(l.b(Context.class));
        b10.g = new s0.b(17);
        return Arrays.asList(b10.b(), m8.a(LIBRARY_NAME, "18.1.8"));
    }
}
