package com.google.android.gms.internal.cast;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class o extends g {
    public static final u5.b j = new u5.b("MediaRouterProxy", null);
    public final c2.c0 c;
    public final r5.b d;
    public final HashMap e;
    public final r f;
    public final boolean i;

    public o(Context context, c2.c0 c0Var, r5.b bVar, u5.s sVar) {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter", 0);
        this.e = new HashMap();
        this.c = c0Var;
        this.d = bVar;
        int i10 = Build.VERSION.SDK_INT;
        u5.b bVar2 = j;
        if (i10 <= 32) {
            Log.i(bVar2.a, bVar2.d("Don't need to set MediaRouterParams for Android S v2 or below", new Object[0]));
            return;
        }
        bVar2.b("Set up MediaRouterParams based on module flag and CastOptions for Android T or above", new Object[0]);
        this.f = new r(bVar);
        Intent intent = new Intent(context, (Class<?>) c2.k0.class);
        intent.setPackage(context.getPackageName());
        boolean isEmpty = context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty();
        this.i = !isEmpty;
        if (!isEmpty) {
            c2.a(c1.X);
        }
        sVar.f(new String[]{"com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED"}).addOnCompleteListener(new bf.b(18, this, bVar));
    }

    public final void J0(android.support.v4.media.session.c0 c0Var) {
        this.c.getClass();
        c2.c0.b();
        c2.e c3 = c2.c0.c();
        c3.D = c0Var;
        androidx.biometric.e eVar = c0Var != null ? new androidx.biometric.e(c3, c0Var) : null;
        androidx.biometric.e eVar2 = c3.C;
        if (eVar2 != null) {
            eVar2.j();
        }
        c3.C = eVar;
        if (eVar != null) {
            c3.l();
        }
    }

    public final void K0(c2.v vVar, int i10) {
        Set set = (Set) this.e.get(vVar);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.c.a(vVar, (c2.w) it.next(), i10);
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
