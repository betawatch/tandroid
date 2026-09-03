package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.api.internal.a1;
import com.google.android.gms.common.api.internal.b1;
import com.google.android.gms.common.api.internal.d1;
import com.google.android.gms.common.api.internal.h1;
import com.google.android.gms.common.api.internal.i1;
import com.google.android.gms.common.api.internal.j1;
import com.google.android.gms.common.api.internal.k1;
import com.google.android.gms.common.api.internal.t0;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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

    public final androidx.biometric.e a() {
        androidx.biometric.e eVar = new androidx.biometric.e(5, false);
        Set set = Collections.EMPTY_SET;
        if (((a0.g) eVar.b) == null) {
            eVar.b = new a0.g(0);
        }
        ((a0.g) eVar.b).addAll(set);
        Context context = this.a;
        eVar.d = context.getClass().getName();
        eVar.c = context.getPackageName();
        return eVar;
    }

    public final Task b(h1 h1Var) {
        b6.m.i(((com.google.android.gms.common.api.internal.p) ((d1) h1Var.a).c).c, "Listener has already been released.");
        b6.m.i((com.google.android.gms.common.api.internal.n) ((h1) h1Var.b).a, "Listener has already been released.");
        d1 d1Var = (d1) h1Var.a;
        h1 h1Var2 = (h1) h1Var.b;
        com.google.android.gms.common.api.internal.h hVar = this.j;
        hVar.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        hVar.f(taskCompletionSource, d1Var.a, this);
        a1 a1Var = new a1(new j1(new b1(d1Var, h1Var2), taskCompletionSource), hVar.r.get(), this);
        a7.e eVar = hVar.x;
        eVar.sendMessage(eVar.obtainMessage(8, a1Var));
        return taskCompletionSource.getTask();
    }

    public final Task c(com.google.android.gms.common.api.internal.n nVar, int i10) {
        b6.m.i(nVar, "Listener key cannot be null.");
        com.google.android.gms.common.api.internal.h hVar = this.j;
        hVar.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        hVar.f(taskCompletionSource, i10, this);
        a1 a1Var = new a1(new j1(nVar, taskCompletionSource), hVar.r.get(), this);
        a7.e eVar = hVar.x;
        eVar.sendMessage(eVar.obtainMessage(13, a1Var));
        return taskCompletionSource.getTask();
    }

    public final void d(int i10, com.google.android.gms.common.api.internal.e eVar) {
        eVar.l();
        com.google.android.gms.common.api.internal.h hVar = this.j;
        hVar.getClass();
        a1 a1Var = new a1(new i1(i10, eVar), hVar.r.get(), this);
        a7.e eVar2 = hVar.x;
        eVar2.sendMessage(eVar2.obtainMessage(4, a1Var));
    }

    public final Task e(int i10, w wVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        com.google.android.gms.common.api.internal.h hVar = this.j;
        hVar.getClass();
        hVar.f(taskCompletionSource, wVar.a, this);
        a1 a1Var = new a1(new k1(i10, wVar, taskCompletionSource, this.i), hVar.r.get(), this);
        a7.e eVar = hVar.x;
        eVar.sendMessage(eVar.obtainMessage(4, a1Var));
        return taskCompletionSource.getTask();
    }

    public j(Context context, e eVar, b bVar, i iVar) {
        b6.m.i(context, "Null context is not permitted.");
        b6.m.i(eVar, "Api must not be null.");
        b6.m.i(iVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        b6.m.i(applicationContext, "The provided context did not have an application context.");
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
        a7.e eVar2 = g10.x;
        eVar2.sendMessage(eVar2.obtainMessage(7, this));
    }
}
