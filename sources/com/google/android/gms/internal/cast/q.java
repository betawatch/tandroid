package com.google.android.gms.internal.cast;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class q extends g {
    public static final i6.b j = new i6.b("MediaRouterProxy", null);
    public final r4.y c;
    public final f6.b d;
    public final HashMap e;
    public final t f;
    public final boolean i;

    public q(Context context, r4.y yVar, f6.b bVar, i6.r rVar) {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter", 0);
        this.e = new HashMap();
        this.c = yVar;
        this.d = bVar;
        int i3 = Build.VERSION.SDK_INT;
        i6.b bVar2 = j;
        if (i3 <= 32) {
            Log.i(bVar2.a, bVar2.d("Don't need to set MediaRouterParams for Android S v2 or below", new Object[0]));
            return;
        }
        bVar2.b("Set up MediaRouterParams based on module flag and CastOptions for Android T or above", new Object[0]);
        this.f = new t(bVar);
        Intent intent = new Intent(context, (Class<?>) r4.f0.class);
        intent.setPackage(context.getPackageName());
        boolean isEmpty = context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty();
        this.i = !isEmpty;
        if (!isEmpty) {
            b2.a(b1.b0);
        }
        rVar.f(new String[]{"com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED"}).addOnCompleteListener(new tf.b(this, bVar));
    }

    public final void M0(android.support.v4.media.session.a0 a0Var) {
        this.c.getClass();
        r4.y.b();
        r4.e c2 = r4.y.c();
        c2.D = a0Var;
        p7.d dVar = a0Var != null ? new p7.d(c2, a0Var) : null;
        p7.d dVar2 = c2.C;
        if (dVar2 != null) {
            dVar2.j();
        }
        c2.C = dVar;
        if (dVar != null) {
            c2.l();
        }
    }

    public final void N0(r4.r rVar, int i3) {
        Set set = (Set) this.e.get(rVar);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.c.a(rVar, (r4.s) it.next(), i3);
        }
    }

    public final void O0(r4.r rVar) {
        Set set = (Set) this.e.get(rVar);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.c.h((r4.s) it.next());
        }
    }
}
