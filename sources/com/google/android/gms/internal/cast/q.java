package com.google.android.gms.internal.cast;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class q extends g {
    public static final g6.b j = new g6.b("MediaRouterProxy", null);
    public final p4.y c;
    public final d6.b d;
    public final HashMap e;
    public final t f;
    public final boolean i;

    public q(Context context, p4.y yVar, d6.b bVar, g6.r rVar) {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter", 0);
        this.e = new HashMap();
        this.c = yVar;
        this.d = bVar;
        int i10 = Build.VERSION.SDK_INT;
        g6.b bVar2 = j;
        if (i10 <= 32) {
            Log.i(bVar2.a, bVar2.d("Don't need to set MediaRouterParams for Android S v2 or below", new Object[0]));
            return;
        }
        bVar2.b("Set up MediaRouterParams based on module flag and CastOptions for Android T or above", new Object[0]);
        this.f = new t(bVar);
        Intent intent = new Intent(context, (Class<?>) p4.f0.class);
        intent.setPackage(context.getPackageName());
        boolean isEmpty = context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty();
        this.i = !isEmpty;
        if (!isEmpty) {
            c2.a(c1.a0);
        }
        rVar.f(new String[]{"com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED"}).addOnCompleteListener(new hf.b(12, this, bVar));
    }

    public final void M0(android.support.v4.media.session.a0 a0Var) {
        this.c.getClass();
        p4.y.b();
        p4.e c10 = p4.y.c();
        c10.D = a0Var;
        li.k kVar = a0Var != null ? new li.k(c10, a0Var) : null;
        li.k kVar2 = c10.C;
        if (kVar2 != null) {
            kVar2.k();
        }
        c10.C = kVar;
        if (kVar != null) {
            c10.l();
        }
    }

    public final void N0(p4.s sVar, int i10) {
        Set set = (Set) this.e.get(sVar);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.c.a(sVar, (p4.t) it.next(), i10);
        }
    }

    public final void O0(p4.s sVar) {
        Set set = (Set) this.e.get(sVar);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.c.h((p4.t) it.next());
        }
    }
}
