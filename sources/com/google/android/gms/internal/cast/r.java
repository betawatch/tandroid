package com.google.android.gms.internal.cast;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class r extends h {
    public static final g6.b j = new g6.b("MediaRouterProxy", null);
    public final p4.x c;
    public final d6.b d;
    public final HashMap e;
    public final u f;
    public final boolean i;

    public r(Context context, p4.x xVar, d6.b bVar, g6.r rVar) {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter", 0);
        this.e = new HashMap();
        this.c = xVar;
        this.d = bVar;
        int i10 = Build.VERSION.SDK_INT;
        g6.b bVar2 = j;
        if (i10 <= 32) {
            Log.i(bVar2.a, bVar2.d("Don't need to set MediaRouterParams for Android S v2 or below", new Object[0]));
            return;
        }
        bVar2.b("Set up MediaRouterParams based on module flag and CastOptions for Android T or above", new Object[0]);
        this.f = new u(bVar);
        Intent intent = new Intent(context, (Class<?>) p4.e0.class);
        intent.setPackage(context.getPackageName());
        boolean isEmpty = context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty();
        this.i = !isEmpty;
        if (!isEmpty) {
            f2.a(f1.a0);
        }
        rVar.f(new String[]{"com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED"}).addOnCompleteListener(new n4.y(11, this, bVar));
    }

    public final void L0(android.support.v4.media.session.b0 b0Var) {
        this.c.getClass();
        p4.x.b();
        p4.e c10 = p4.x.c();
        c10.D = b0Var;
        m.e3 e3Var = b0Var != null ? new m.e3(c10, b0Var) : null;
        m.e3 e3Var2 = c10.C;
        if (e3Var2 != null) {
            e3Var2.v();
        }
        c10.C = e3Var;
        if (e3Var != null) {
            c10.l();
        }
    }

    public final void M0(p4.r rVar, int i10) {
        Set set = (Set) this.e.get(rVar);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.c.a(rVar, (p4.s) it.next(), i10);
        }
    }

    public final void N0(p4.r rVar) {
        Set set = (Set) this.e.get(rVar);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.c.h((p4.s) it.next());
        }
    }
}
