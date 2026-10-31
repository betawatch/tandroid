package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.api.internal.b1;
import com.google.android.gms.common.api.internal.c1;
import com.google.android.gms.common.api.internal.h1;
import com.google.android.gms.common.api.internal.i1;
import com.google.android.gms.common.api.internal.j1;
import com.google.android.gms.common.api.internal.k1;
import com.google.android.gms.common.api.internal.u0;
import com.google.android.gms.internal.cast.z;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.w;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class j {
    public final Context a;
    public final String b;
    public final e c;
    public final b d;
    public final com.google.android.gms.common.api.internal.b e;
    public final Looper f;
    public final int g;
    public final u0 h;
    public final com.google.android.gms.common.api.internal.t i;
    public final com.google.android.gms.common.api.internal.h j;

    public j(Context context, e eVar, a aVar, com.google.android.gms.common.api.internal.t tVar) {
        this(context, eVar, aVar, new i(tVar, Looper.getMainLooper()));
    }

    public final li.k a() {
        li.k kVar = new li.k(8, false);
        Set set = Collections.EMPTY_SET;
        if (((a0.g) kVar.b) == null) {
            kVar.b = new a0.g(0);
        }
        ((a0.g) kVar.b).addAll(set);
        Context context = this.a;
        kVar.d = context.getClass().getName();
        kVar.c = context.getPackageName();
        return kVar;
    }

    public final Task b(h1 h1Var) {
        n6.l.h(((com.google.android.gms.common.api.internal.p) ((w) h1Var.a).c).c, "Listener has already been released.");
        n6.l.h((com.google.android.gms.common.api.internal.n) ((h1) h1Var.b).a, "Listener has already been released.");
        w wVar = (w) h1Var.a;
        h1 h1Var2 = (h1) h1Var.b;
        com.google.android.gms.common.api.internal.h hVar = this.j;
        hVar.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        hVar.f(taskCompletionSource, wVar.b, this);
        b1 b1Var = new b1(new j1(new c1(wVar, h1Var2), taskCompletionSource), hVar.r.get(), this);
        z zVar = hVar.y;
        zVar.sendMessage(zVar.obtainMessage(8, b1Var));
        return taskCompletionSource.getTask();
    }

    public final Task c(com.google.android.gms.common.api.internal.n nVar, int i10) {
        n6.l.h(nVar, "Listener key cannot be null.");
        com.google.android.gms.common.api.internal.h hVar = this.j;
        hVar.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        hVar.f(taskCompletionSource, i10, this);
        b1 b1Var = new b1(new j1(nVar, taskCompletionSource), hVar.r.get(), this);
        z zVar = hVar.y;
        zVar.sendMessage(zVar.obtainMessage(13, b1Var));
        return taskCompletionSource.getTask();
    }

    public final void d(int i10, com.google.android.gms.common.api.internal.e eVar) {
        eVar.l();
        com.google.android.gms.common.api.internal.h hVar = this.j;
        hVar.getClass();
        b1 b1Var = new b1(new i1(i10, eVar), hVar.r.get(), this);
        z zVar = hVar.y;
        zVar.sendMessage(zVar.obtainMessage(4, b1Var));
    }

    public final Task e(int i10, com.google.android.gms.common.api.internal.w wVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        com.google.android.gms.common.api.internal.h hVar = this.j;
        hVar.getClass();
        hVar.f(taskCompletionSource, wVar.c, this);
        b1 b1Var = new b1(new k1(i10, wVar, taskCompletionSource, this.i), hVar.r.get(), this);
        z zVar = hVar.y;
        zVar.sendMessage(zVar.obtainMessage(4, b1Var));
        return taskCompletionSource.getTask();
    }

    public j(Context context, e eVar, b bVar, i iVar) {
        n6.l.h(context, "Null context is not permitted.");
        n6.l.h(eVar, "Api must not be null.");
        n6.l.h(iVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        n6.l.h(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.b = attributionTag;
        this.c = eVar;
        this.d = bVar;
        this.f = iVar.b;
        this.e = new com.google.android.gms.common.api.internal.b(eVar, bVar, attributionTag);
        this.h = new u0(this);
        com.google.android.gms.common.api.internal.h g10 = com.google.android.gms.common.api.internal.h.g(applicationContext);
        this.j = g10;
        this.g = g10.n.getAndIncrement();
        this.i = iVar.a;
        z zVar = g10.y;
        zVar.sendMessage(zVar.obtainMessage(7, this));
    }
}
