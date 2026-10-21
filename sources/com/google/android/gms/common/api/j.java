package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.api.internal.a1;
import com.google.android.gms.common.api.internal.f1;
import com.google.android.gms.common.api.internal.g1;
import com.google.android.gms.common.api.internal.h1;
import com.google.android.gms.common.api.internal.i1;
import com.google.android.gms.common.api.internal.s0;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.z0;
import com.google.android.gms.internal.cast.a0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.w;
import java.util.Collections;
import java.util.Set;
import m.g3;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public abstract class j {
    public final Context a;
    public final String b;
    public final e c;
    public final b d;
    public final com.google.android.gms.common.api.internal.b e;
    public final Looper f;
    public final int g;
    public final s0 h;
    public final com.google.android.gms.common.api.internal.s i;
    public final com.google.android.gms.common.api.internal.h j;

    public j(Context context, e eVar, a aVar, com.google.android.gms.common.api.internal.s sVar) {
        this(context, eVar, aVar, new i(sVar, Looper.getMainLooper()));
    }

    public final g3 a() {
        g3 g3Var = new g3(6, false);
        Set set = Collections.EMPTY_SET;
        if (((a0.g) g3Var.b) == null) {
            g3Var.b = new a0.g(0);
        }
        ((a0.g) g3Var.b).addAll(set);
        Context context = this.a;
        g3Var.d = context.getClass().getName();
        g3Var.c = context.getPackageName();
        return g3Var;
    }

    public final Task b(f1 f1Var) {
        n6.l.i(((com.google.android.gms.common.api.internal.p) ((w) f1Var.a).c).c, "Listener has already been released.");
        n6.l.i((com.google.android.gms.common.api.internal.n) ((f1) f1Var.b).a, "Listener has already been released.");
        w wVar = (w) f1Var.a;
        f1 f1Var2 = (f1) f1Var.b;
        com.google.android.gms.common.api.internal.h hVar = this.j;
        hVar.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        hVar.f(taskCompletionSource, wVar.b, this);
        z0 z0Var = new z0(new h1(new a1(wVar, f1Var2), taskCompletionSource), hVar.r.get(), this);
        a0 a0Var = hVar.x;
        a0Var.sendMessage(a0Var.obtainMessage(8, z0Var));
        return taskCompletionSource.getTask();
    }

    public final Task c(com.google.android.gms.common.api.internal.n nVar, int i10) {
        n6.l.i(nVar, "Listener key cannot be null.");
        com.google.android.gms.common.api.internal.h hVar = this.j;
        hVar.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        hVar.f(taskCompletionSource, i10, this);
        z0 z0Var = new z0(new h1(nVar, taskCompletionSource), hVar.r.get(), this);
        a0 a0Var = hVar.x;
        a0Var.sendMessage(a0Var.obtainMessage(13, z0Var));
        return taskCompletionSource.getTask();
    }

    public final void d(int i10, com.google.android.gms.common.api.internal.e eVar) {
        eVar.l();
        com.google.android.gms.common.api.internal.h hVar = this.j;
        hVar.getClass();
        z0 z0Var = new z0(new g1(i10, eVar), hVar.r.get(), this);
        a0 a0Var = hVar.x;
        a0Var.sendMessage(a0Var.obtainMessage(4, z0Var));
    }

    public final Task e(int i10, v vVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        com.google.android.gms.common.api.internal.h hVar = this.j;
        hVar.getClass();
        hVar.f(taskCompletionSource, vVar.c, this);
        z0 z0Var = new z0(new i1(i10, vVar, taskCompletionSource, this.i), hVar.r.get(), this);
        a0 a0Var = hVar.x;
        a0Var.sendMessage(a0Var.obtainMessage(4, z0Var));
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
        this.h = new s0(this);
        com.google.android.gms.common.api.internal.h g10 = com.google.android.gms.common.api.internal.h.g(applicationContext);
        this.j = g10;
        this.g = g10.n.getAndIncrement();
        this.i = iVar.a;
        a0 a0Var = g10.x;
        a0Var.sendMessage(a0Var.obtainMessage(7, this));
    }
}
