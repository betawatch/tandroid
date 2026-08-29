package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import c2.v0;
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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    public final v5.c a() {
        v5.c cVar = new v5.c(9);
        Set set = Collections.EMPTY_SET;
        if (((a0.g) cVar.b) == null) {
            cVar.b = new a0.g(0);
        }
        ((a0.g) cVar.b).addAll(set);
        Context context = this.a;
        cVar.d = context.getClass().getName();
        cVar.c = context.getPackageName();
        return cVar;
    }

    public final Task b(g1 g1Var) {
        z5.l.i(((com.google.android.gms.common.api.internal.p) ((com.google.android.exoplayer2.upstream.t) g1Var.a).c).c, "Listener has already been released.");
        z5.l.i((com.google.android.gms.common.api.internal.n) ((g1) g1Var.b).a, "Listener has already been released.");
        com.google.android.exoplayer2.upstream.t tVar = (com.google.android.exoplayer2.upstream.t) g1Var.a;
        g1 g1Var2 = (g1) g1Var.b;
        com.google.android.gms.common.api.internal.h hVar = this.j;
        hVar.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        hVar.f(taskCompletionSource, tVar.b, this);
        a1 a1Var = new a1(new i1(new b1(tVar, g1Var2), taskCompletionSource), hVar.r.get(), this);
        v0 v0Var = hVar.x;
        v0Var.sendMessage(v0Var.obtainMessage(8, a1Var));
        return taskCompletionSource.getTask();
    }

    public final Task c(com.google.android.gms.common.api.internal.n nVar, int i10) {
        z5.l.i(nVar, "Listener key cannot be null.");
        com.google.android.gms.common.api.internal.h hVar = this.j;
        hVar.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        hVar.f(taskCompletionSource, i10, this);
        a1 a1Var = new a1(new i1(nVar, taskCompletionSource), hVar.r.get(), this);
        v0 v0Var = hVar.x;
        v0Var.sendMessage(v0Var.obtainMessage(13, a1Var));
        return taskCompletionSource.getTask();
    }

    public final void d(int i10, com.google.android.gms.common.api.internal.e eVar) {
        eVar.l();
        com.google.android.gms.common.api.internal.h hVar = this.j;
        hVar.getClass();
        a1 a1Var = new a1(new h1(i10, eVar), hVar.r.get(), this);
        v0 v0Var = hVar.x;
        v0Var.sendMessage(v0Var.obtainMessage(4, a1Var));
    }

    public final Task e(int i10, w wVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        com.google.android.gms.common.api.internal.h hVar = this.j;
        hVar.getClass();
        hVar.f(taskCompletionSource, wVar.c, this);
        a1 a1Var = new a1(new j1(i10, wVar, taskCompletionSource, this.i), hVar.r.get(), this);
        v0 v0Var = hVar.x;
        v0Var.sendMessage(v0Var.obtainMessage(4, a1Var));
        return taskCompletionSource.getTask();
    }

    public j(Context context, e eVar, b bVar, i iVar) {
        z5.l.i(context, "Null context is not permitted.");
        z5.l.i(eVar, "Api must not be null.");
        z5.l.i(iVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        z5.l.i(applicationContext, "The provided context did not have an application context.");
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
        v0 v0Var = g10.x;
        v0Var.sendMessage(v0Var.obtainMessage(7, this));
    }
}
