package com.google.android.gms.internal.cast;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class p extends g {
    public static final h6.b j = new h6.b("MediaRouterProxy", null);
    public final p4.x c;
    public final e6.b d;
    public final HashMap e;
    public final s f;
    public final boolean i;

    public p(Context context, p4.x xVar, e6.b bVar, h6.r rVar) {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter", 0);
        this.e = new HashMap();
        this.c = xVar;
        this.d = bVar;
        int i10 = Build.VERSION.SDK_INT;
        h6.b bVar2 = j;
        if (i10 <= 32) {
            Log.i(bVar2.a, bVar2.d("Don't need to set MediaRouterParams for Android S v2 or below", new Object[0]));
            return;
        }
        bVar2.b("Set up MediaRouterParams based on module flag and CastOptions for Android T or above", new Object[0]);
        this.f = new s(bVar);
        Intent intent = new Intent(context, (Class<?>) p4.e0.class);
        intent.setPackage(context.getPackageName());
        boolean isEmpty = context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty();
        this.i = !isEmpty;
        if (!isEmpty) {
            a2.a(a1.a0);
        }
        rVar.f(new String[]{"com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED"}).addOnCompleteListener(new n4.s(10, this, bVar));
    }

    public final void K0(android.support.v4.media.session.b0 b0Var) {
        this.c.getClass();
        p4.x.b();
        p4.e c10 = p4.x.c();
        c10.D = b0Var;
        k6.c cVar = b0Var != null ? new k6.c(24, c10, b0Var) : null;
        k6.c cVar2 = c10.C;
        if (cVar2 != null) {
            cVar2.n();
        }
        c10.C = cVar;
        if (cVar != null) {
            c10.l();
        }
    }

    public final void L0(p4.r rVar, int i10) {
        Set set = (Set) this.e.get(rVar);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.c.a(rVar, (p4.s) it.next(), i10);
        }
    }

    public final void M0(p4.r rVar) {
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
