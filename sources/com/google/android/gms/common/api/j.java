package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.api.internal.a1;
import com.google.android.gms.common.api.internal.b1;
import com.google.android.gms.common.api.internal.g1;
import com.google.android.gms.common.api.internal.h1;
import com.google.android.gms.common.api.internal.i1;
import com.google.android.gms.common.api.internal.j1;
import com.google.android.gms.common.api.internal.t0;
import com.google.android.gms.internal.cast.a0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.w;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public abstract class j {
    public final Context a;
    public final String b;
    public final e c;
    public final b d;
    public final com.google.android.gms.common.api.internal.b e;
    public final Looper f;
    public final int g;
    public final t0 h;
    public final com.google.android.gms.common.api.internal.t i;
    public final com.google.android.gms.common.api.internal.h j;

    public j(Context context, e eVar, a aVar, com.google.android.gms.common.api.internal.t tVar) {
        this(context, eVar, aVar, new i(tVar, Looper.getMainLooper()));
    }

    public final li.k a() {
        li.k kVar = new li.k(7, false);
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

    public final Task b(g1 g1Var) {
        n6.l.i(((com.google.android.gms.common.api.internal.p) ((w) g1Var.a).c).c, "Listener has already been released.");
        n6.l.i((com.google.android.gms.common.api.internal.n) ((g1) g1Var.b).a, "Listener has already been released.");
        w wVar = (w) g1Var.a;
        g1 g1Var2 = (g1) g1Var.b;
        com.google.android.gms.common.api.internal.h hVar = this.j;
        hVar.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        hVar.f(taskCompletionSource, wVar.b, this);
        a1 a1Var = new a1(new i1(new b1(wVar, g1Var2), taskCompletionSource), hVar.r.get(), this);
        a0 a0Var = hVar.x;
        a0Var.sendMessage(a0Var.obtainMessage(8, a1Var));
        return taskCompletionSource.getTask();
    }

    public final Task c(com.google.android.gms.common.api.internal.n nVar, int i10) {
        n6.l.i(nVar, "Listener key cannot be null.");
        com.google.android.gms.common.api.internal.h hVar = this.j;
        hVar.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        hVar.f(taskCompletionSource, i10, this);
        a1 a1Var = new a1(new i1(nVar, taskCompletionSource), hVar.r.get(), this);
        a0 a0Var = hVar.x;
        a0Var.sendMessage(a0Var.obtainMessage(13, a1Var));
        return taskCompletionSource.getTask();
    }

    public final void d(int i10, com.google.android.gms.common.api.internal.e eVar) {
        eVar.l();
        com.google.android.gms.common.api.internal.h hVar = this.j;
        hVar.getClass();
        a1 a1Var = new a1(new h1(i10, eVar), hVar.r.get(), this);
        a0 a0Var = hVar.x;
        a0Var.sendMessage(a0Var.obtainMessage(4, a1Var));
    }

    public final Task e(int i10, com.google.android.gms.common.api.internal.w wVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        com.google.android.gms.common.api.internal.h hVar = this.j;
        hVar.getClass();
        hVar.f(taskCompletionSource, wVar.c, this);
        a1 a1Var = new a1(new j1(i10, wVar, taskCompletionSource, this.i), hVar.r.get(), this);
        a0 a0Var = hVar.x;
        a0Var.sendMessage(a0Var.obtainMessage(4, a1Var));
        return taskCompletionSource.getTask();
    }

    public j(Context context, e eVar, b bVar, i iVar) {
        n6.l.i(context, "Null context is not permitted.");
        n6.l.i(eVar, "Api must not be null.");
        n6.l.i(iVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        n6.l.i(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.b = attributionTag;
        this.c = eVar;
        this.d = bVar;
        this.f = iVar.b;
        this.e = new com.google.android.gms.common.api.internal.b(eVar, bVar, attributionTag);
        this.h = new t0(this);
        com.google.android.gms.common.api.internal.h g10 = com.google.android.gms.common.api.internal.h.g(applicationContext);
        this.j = g10;
        this.g = g10.n.getAndIncrement();
        this.i = iVar.a;
        a0 a0Var = g10.x;
        a0Var.sendMessage(a0Var.obtainMessage(7, this));
    }
}
