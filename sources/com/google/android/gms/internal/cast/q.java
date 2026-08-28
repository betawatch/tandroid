package com.google.android.gms.internal.cast;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q extends h {
    public static final q5.b j = new q5.b("MediaRouterProxy", null);
    public final c2.c0 c;
    public final n5.b d;
    public final HashMap e;
    public final t f;
    public final boolean i;

    public q(Context context, c2.c0 c0Var, n5.b bVar, q5.s sVar) {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter", 0);
        this.e = new HashMap();
        this.c = c0Var;
        this.d = bVar;
        int i9 = Build.VERSION.SDK_INT;
        q5.b bVar2 = j;
        if (i9 <= 32) {
            Log.i(bVar2.a, bVar2.d("Don't need to set MediaRouterParams for Android S v2 or below", new Object[0]));
            return;
        }
        bVar2.b("Set up MediaRouterParams based on module flag and CastOptions for Android T or above", new Object[0]);
        this.f = new t(bVar);
        Intent intent = new Intent(context, (Class<?>) c2.k0.class);
        intent.setPackage(context.getPackageName());
        boolean isEmpty = context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty();
        this.i = !isEmpty;
        if (!isEmpty) {
            d2.a(d1.W);
        }
        sVar.f(new String[]{"com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED"}).addOnCompleteListener(new we.b(this, bVar, false, 14));
    }

    public final void J0(android.support.v4.media.session.d0 d0Var) {
        this.c.getClass();
        c2.c0.b();
        c2.e c10 = c2.c0.c();
        c10.D = d0Var;
        a5.m mVar = d0Var != null ? new a5.m(c10, d0Var) : null;
        a5.m mVar2 = c10.C;
        if (mVar2 != null) {
            mVar2.g();
        }
        c10.C = mVar;
        if (mVar != null) {
            c10.l();
        }
    }

    public final void K0(c2.v vVar, int i9) {
        Set set = (Set) this.e.get(vVar);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.c.a(vVar, (c2.w) it.next(), i9);
        }
    }

    public final void L0(c2.v vVar) {
        Set set = (Set) this.e.get(vVar);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.c.h((c2.w) it.next());
        }
    }
}
