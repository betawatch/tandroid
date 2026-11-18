package com.google.android.gms.internal.cast;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.telegram.ui.md0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class p extends g {
    public static final j6.b j = new j6.b("MediaRouterProxy", null);
    public final s4.x c;
    public final g6.b d;
    public final HashMap e;
    public final s f;
    public final boolean i;

    public p(Context context, s4.x xVar, g6.b bVar, j6.s sVar) {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter", 0);
        this.e = new HashMap();
        this.c = xVar;
        this.d = bVar;
        int i7 = Build.VERSION.SDK_INT;
        j6.b bVar2 = j;
        if (i7 <= 32) {
            Log.i(bVar2.a, bVar2.d("Don't need to set MediaRouterParams for Android S v2 or below", new Object[0]));
            return;
        }
        bVar2.b("Set up MediaRouterParams based on module flag and CastOptions for Android T or above", new Object[0]);
        this.f = new s(bVar);
        Intent intent = new Intent(context, (Class<?>) s4.e0.class);
        intent.setPackage(context.getPackageName());
        boolean isEmpty = context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty();
        this.i = !isEmpty;
        if (!isEmpty) {
            a2.a(a1.b0);
        }
        sVar.f(new String[]{"com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED"}).addOnCompleteListener(new wf.b(11, this, bVar));
    }

    public final void m1(android.support.v4.media.session.a0 a0Var) {
        this.c.getClass();
        s4.x.b();
        s4.e c10 = s4.x.c();
        c10.D = a0Var;
        md0 md0Var = a0Var != null ? new md0(c10, a0Var) : null;
        md0 md0Var2 = c10.C;
        if (md0Var2 != null) {
            md0Var2.n();
        }
        c10.C = md0Var;
        if (md0Var != null) {
            c10.l();
        }
    }

    public final void n1(s4.r rVar, int i7) {
        Set set = (Set) this.e.get(rVar);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.c.a(rVar, (s4.s) it.next(), i7);
        }
    }

    public final void o1(s4.r rVar) {
        Set set = (Set) this.e.get(rVar);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.c.h((s4.s) it.next());
        }
    }
}
