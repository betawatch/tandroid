package com.google.firebase.pnv.internal;

import android.content.Context;
import androidx.emoji2.text.n;
import c8.d0;
import com.google.android.gms.common.api.i;
import com.google.firebase.components.ComponentRegistrar;
import db.a;
import db.d;
import db.f;
import db.h;
import di.o;
import e2.j0;
import java.util.List;
import kotlin.jvm.internal.j;
import o9.g;
import u9.b;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class FirebasePhoneNumberVerificationRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static final a getComponents$lambda$0(b bVar) {
        g gVar = (g) bVar.a(g.class);
        gVar.a();
        Context context = gVar.a;
        j.d(context, "firebaseApp.applicationContext");
        gVar.a();
        Context context2 = gVar.a;
        j.d(context2, "firebaseApp.applicationContext");
        d dVar = new d(context2, f.a, com.google.android.gms.common.api.b.j, i.c);
        gVar.a();
        Context context3 = gVar.a;
        j.d(context3, "firebaseApp.applicationContext");
        n nVar = new n(context3, 3);
        h hVar = new h();
        gVar.a();
        String str = gVar.c.b;
        j.d(str, "firebaseApp.options.applicationId");
        gVar.a();
        String str2 = gVar.c.a;
        j.d(str2, "firebaseApp.options.apiKey");
        return new db.n(context, dVar, nVar, hVar, str, str2);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<u9.a> getComponents() {
        j0 a10 = u9.a.a(a.class);
        a10.a(u9.i.a(g.class));
        a10.f = new o(20);
        return d0.a(a10.b());
    }
}
