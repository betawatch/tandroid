package com.google.android.gms.internal.cast;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class q extends h {
    public static final s5.b j = new s5.b("MediaRouterProxy", null);
    public final c2.d0 c;
    public final p5.b d;
    public final HashMap e;
    public final t f;
    public final boolean i;

    public q(Context context, c2.d0 d0Var, p5.b bVar, s5.s sVar) {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter", 0);
        this.e = new HashMap();
        this.c = d0Var;
        this.d = bVar;
        int i10 = Build.VERSION.SDK_INT;
        s5.b bVar2 = j;
        if (i10 <= 32) {
            Log.i(bVar2.a, bVar2.d("Don't need to set MediaRouterParams for Android S v2 or below", new Object[0]));
            return;
        }
        bVar2.b("Set up MediaRouterParams based on module flag and CastOptions for Android T or above", new Object[0]);
        this.f = new t(bVar);
        Intent intent = new Intent(context, (Class<?>) c2.l0.class);
        intent.setPackage(context.getPackageName());
        boolean isEmpty = context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty();
        this.i = !isEmpty;
        if (!isEmpty) {
            e2.a(e1.W);
        }
        sVar.f(new String[]{"com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED"}).addOnCompleteListener(new ze.b(this, bVar));
    }

    public final void J0(android.support.v4.media.session.d0 d0Var) {
        this.c.getClass();
        c2.d0.b();
        c2.e c3 = c2.d0.c();
        c3.D = d0Var;
        androidx.biometric.e eVar = d0Var != null ? new androidx.biometric.e(c3, d0Var) : null;
        androidx.biometric.e eVar2 = c3.C;
        if (eVar2 != null) {
            eVar2.g();
        }
        c3.C = eVar;
        if (eVar != null) {
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
