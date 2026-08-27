package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import g7.i7;
import java.util.Arrays;
import java.util.List;
import org.telegram.ui.j70;
import t2.f;
import u2.a;
import w2.q;
import z8.b;
import z8.i;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$0(b bVar) {
        q.b((Context) bVar.a(Context.class));
        return q.a().c(a.f);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<z8.a> getComponents() {
        ug.b a2 = z8.a.a(f.class);
        a2.c = LIBRARY_NAME;
        a2.a(i.a(Context.class));
        a2.f = new j70(20);
        return Arrays.asList(a2.b(), i7.a(LIBRARY_NAME, "18.1.8"));
    }
}
