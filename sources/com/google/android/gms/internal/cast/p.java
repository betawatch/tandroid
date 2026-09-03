package com.google.android.gms.internal.cast;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class p extends g {
    public static final u5.b j = new u5.b("MediaRouterProxy", null);
    public final c2.d0 c;
    public final r5.b d;
    public final HashMap e;
    public final s f;
    public final boolean i;

    public p(Context context, c2.d0 d0Var, r5.b bVar, u5.s sVar) {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter", 0);
        this.e = new HashMap();
        this.c = d0Var;
        this.d = bVar;
        int i10 = Build.VERSION.SDK_INT;
        u5.b bVar2 = j;
        if (i10 <= 32) {
            Log.i(bVar2.a, bVar2.d("Don't need to set MediaRouterParams for Android S v2 or below", new Object[0]));
            return;
        }
        bVar2.b("Set up MediaRouterParams based on module flag and CastOptions for Android T or above", new Object[0]);
        this.f = new s(bVar);
        Intent intent = new Intent(context, (Class<?>) c2.l0.class);
        intent.setPackage(context.getPackageName());
        boolean isEmpty = context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty();
        this.i = !isEmpty;
        if (!isEmpty) {
            d2.a(d1.X);
        }
        sVar.f(new String[]{"com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED"}).addOnCompleteListener(new af.c(21, this, bVar));
    }

    public final void J0(android.support.v4.media.session.c0 c0Var) {
        this.c.getClass();
        c2.d0.b();
        c2.e c3 = c2.d0.c();
        c3.D = c0Var;
        af.d dVar = c0Var != null ? new af.d(c3, c0Var) : null;
        af.d dVar2 = c3.C;
        if (dVar2 != null) {
            dVar2.k();
        }
        c3.C = dVar;
        if (dVar != null) {
            c3.l();
        }
    }

    public final void K0(c2.w wVar, int i10) {
        Set set = (Set) this.e.get(wVar);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.c.a(wVar, (c2.x) it.next(), i10);
        }
    }

    public final void L0(c2.w wVar) {
        Set set = (Set) this.e.get(wVar);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.c.h((c2.x) it.next());
        }
    }
}
