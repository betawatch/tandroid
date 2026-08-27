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
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

    public final u2.b a() {
        u2.b bVar = new u2.b(10);
        Set set = Collections.EMPTY_SET;
        if (((a0.g) bVar.c) == null) {
            bVar.c = new a0.g(0);
        }
        ((a0.g) bVar.c).addAll(set);
        Context context = this.a;
        bVar.d = context.getClass().getName();
        bVar.b = context.getPackageName();
        return bVar;
    }

    public final Task b(g1 g1Var) {
        y5.l.i(((com.google.android.gms.common.api.internal.p) ((com.google.android.exoplayer2.upstream.t) g1Var.a).c).c, "Listener has already been released.");
        y5.l.i((com.google.android.gms.common.api.internal.n) ((g1) g1Var.b).a, "Listener has already been released.");
        com.google.android.exoplayer2.upstream.t tVar = (com.google.android.exoplayer2.upstream.t) g1Var.a;
        g1 g1Var2 = (g1) g1Var.b;
        com.google.android.gms.common.api.internal.h hVar = this.j;
        hVar.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        hVar.f(taskCompletionSource, tVar.b, this);
        a1 a1Var = new a1(new i1(new b1(tVar, g1Var2), taskCompletionSource), hVar.r.get(), this);
        c2.t0 t0Var = hVar.x;
        t0Var.sendMessage(t0Var.obtainMessage(8, a1Var));
        return taskCompletionSource.getTask();
    }

    public final Task c(com.google.android.gms.common.api.internal.n nVar, int i10) {
        y5.l.i(nVar, "Listener key cannot be null.");
        com.google.android.gms.common.api.internal.h hVar = this.j;
        hVar.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        hVar.f(taskCompletionSource, i10, this);
        a1 a1Var = new a1(new i1(nVar, taskCompletionSource), hVar.r.get(), this);
        c2.t0 t0Var = hVar.x;
        t0Var.sendMessage(t0Var.obtainMessage(13, a1Var));
        return taskCompletionSource.getTask();
    }

    public final void d(int i10, com.google.android.gms.common.api.internal.e eVar) {
        eVar.l();
        com.google.android.gms.common.api.internal.h hVar = this.j;
        hVar.getClass();
        a1 a1Var = new a1(new h1(i10, eVar), hVar.r.get(), this);
        c2.t0 t0Var = hVar.x;
        t0Var.sendMessage(t0Var.obtainMessage(4, a1Var));
    }

    public final Task e(int i10, w wVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        com.google.android.gms.common.api.internal.h hVar = this.j;
        hVar.getClass();
        hVar.f(taskCompletionSource, wVar.c, this);
        a1 a1Var = new a1(new j1(i10, wVar, taskCompletionSource, this.i), hVar.r.get(), this);
        c2.t0 t0Var = hVar.x;
        t0Var.sendMessage(t0Var.obtainMessage(4, a1Var));
        return taskCompletionSource.getTask();
    }

    public j(Context context, e eVar, b bVar, i iVar) {
        y5.l.i(context, "Null context is not permitted.");
        y5.l.i(eVar, "Api must not be null.");
        y5.l.i(iVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        y5.l.i(applicationContext, "The provided context did not have an application context.");
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
        c2.t0 t0Var = g10.x;
        t0Var.sendMessage(t0Var.obtainMessage(7, this));
    }
}
