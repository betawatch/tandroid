package com.google.android.gms.internal.cast;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class p extends h {
    public static final r5.b j = new r5.b("MediaRouterProxy", null);
    public final c2.b0 c;
    public final n5.b d;
    public final HashMap e;
    public final s f;
    public final boolean i;

    public p(Context context, c2.b0 b0Var, n5.b bVar, r5.s sVar) {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter", 0);
        this.e = new HashMap();
        this.c = b0Var;
        this.d = bVar;
        int i10 = Build.VERSION.SDK_INT;
        r5.b bVar2 = j;
        if (i10 <= 32) {
            Log.i(bVar2.a, bVar2.d("Don't need to set MediaRouterParams for Android S v2 or below", new Object[0]));
            return;
        }
        bVar2.b("Set up MediaRouterParams based on module flag and CastOptions for Android T or above", new Object[0]);
        this.f = new s(bVar);
        Intent intent = new Intent(context, (Class<?>) c2.j0.class);
        intent.setPackage(context.getPackageName());
        boolean isEmpty = context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty();
        this.i = !isEmpty;
        if (!isEmpty) {
            c2.a(c1.W);
        }
        sVar.f(new String[]{"com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED"}).addOnCompleteListener(new xe.b(this, bVar, false, 13));
    }

    public final void J0(android.support.v4.media.session.d0 d0Var) {
        this.c.getClass();
        c2.b0.b();
        c2.e c10 = c2.b0.c();
        c10.D = d0Var;
        a5.n nVar = d0Var != null ? new a5.n(c10, d0Var) : null;
        a5.n nVar2 = c10.C;
        if (nVar2 != null) {
            nVar2.j();
        }
        c10.C = nVar;
        if (nVar != null) {
            c10.l();
        }
    }

    public final void K0(c2.u uVar, int i10) {
        Set set = (Set) this.e.get(uVar);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.c.a(uVar, (c2.v) it.next(), i10);
        }
    }

    public final void L0(c2.u uVar) {
        Set set = (Set) this.e.get(uVar);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.c.h((c2.v) it.next());
        }
    }
}
