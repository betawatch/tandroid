package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.api.internal.a1;
import com.google.android.gms.common.api.internal.b1;
import com.google.android.gms.common.api.internal.c1;
import com.google.android.gms.common.api.internal.n0;
import com.google.android.gms.common.api.internal.u0;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.z0;
import com.google.android.gms.internal.cast.z;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import g2.x;
import java.util.Collections;
import java.util.Set;
import org.telegram.ui.Components.y00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class j {
    public final Context a;
    public final String b;
    public final y00 c;
    public final e d;
    public final b e;
    public final com.google.android.gms.common.api.internal.a f;
    public final Looper g;
    public final int h;
    public final n0 i;
    public final com.google.android.gms.common.api.internal.q j;
    public final com.google.android.gms.common.api.internal.g k;

    public j(Context context, e eVar, a aVar, com.google.android.gms.common.api.internal.q qVar) {
        this(context, eVar, aVar, new i(qVar, Looper.getMainLooper()));
    }

    public final k4.j a() {
        k4.j jVar = new k4.j();
        Set set = Collections.EMPTY_SET;
        if (((a0.g) jVar.a) == null) {
            jVar.a = new a0.g(0);
        }
        ((a0.g) jVar.a).addAll(set);
        Context context = this.a;
        jVar.c = context.getClass().getName();
        jVar.b = context.getPackageName();
        return jVar;
    }

    public final Task b(z0 z0Var) {
        p6.m.h(((com.google.android.gms.common.api.internal.o) ((x) z0Var.a).c).b, "Listener has already been released.");
        z0 z0Var2 = (z0) z0Var.b;
        p6.m.h((com.google.android.gms.common.api.internal.m) z0Var2.a, "Listener has already been released.");
        x xVar = (x) z0Var.a;
        com.google.android.gms.common.api.internal.g gVar = this.k;
        gVar.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        gVar.c(taskCompletionSource, xVar.b, this);
        u0 u0Var = new u0(new b1(new v0(xVar, z0Var2), taskCompletionSource), gVar.r.get(), this);
        z zVar = gVar.y;
        zVar.sendMessage(zVar.obtainMessage(8, u0Var));
        return taskCompletionSource.getTask();
    }

    public final Task c(com.google.android.gms.common.api.internal.m mVar, int i3) {
        p6.m.h(mVar, "Listener key cannot be null.");
        com.google.android.gms.common.api.internal.g gVar = this.k;
        gVar.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        gVar.c(taskCompletionSource, i3, this);
        u0 u0Var = new u0(new b1(mVar, taskCompletionSource), gVar.r.get(), this);
        z zVar = gVar.y;
        zVar.sendMessage(zVar.obtainMessage(13, u0Var));
        return taskCompletionSource.getTask();
    }

    public final void d(int i3, com.google.android.gms.common.api.internal.d dVar) {
        dVar.l();
        com.google.android.gms.common.api.internal.g gVar = this.k;
        gVar.getClass();
        u0 u0Var = new u0(new a1(i3, dVar), gVar.r.get(), this);
        z zVar = gVar.y;
        zVar.sendMessage(zVar.obtainMessage(4, u0Var));
    }

    public final Task e(int i3, com.google.android.gms.common.api.internal.t tVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        com.google.android.gms.common.api.internal.g gVar = this.k;
        gVar.getClass();
        gVar.c(taskCompletionSource, tVar.c, this);
        u0 u0Var = new u0(new c1(i3, tVar, taskCompletionSource, this.j), gVar.r.get(), this);
        z zVar = gVar.y;
        zVar.sendMessage(zVar.obtainMessage(4, u0Var));
        return taskCompletionSource.getTask();
    }

    public j(Context context, e eVar, b bVar, i iVar) {
        p6.m.h(context, "Null context is not permitted.");
        p6.m.h(eVar, "Api must not be null.");
        p6.m.h(iVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        p6.m.h(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        int i3 = Build.VERSION.SDK_INT;
        String attributionTag = (i3 < 30 || i3 < 30) ? null : context.getAttributionTag();
        this.b = attributionTag;
        this.c = i3 >= 31 ? new y00(context.getAttributionSource()) : null;
        this.d = eVar;
        this.e = bVar;
        this.g = iVar.b;
        this.f = new com.google.android.gms.common.api.internal.a(eVar, bVar, attributionTag);
        this.i = new n0(this);
        com.google.android.gms.common.api.internal.g e10 = com.google.android.gms.common.api.internal.g.e(applicationContext);
        this.k = e10;
        this.h = e10.n.getAndIncrement();
        this.j = iVar.a;
        z zVar = e10.y;
        zVar.sendMessage(zVar.obtainMessage(7, this));
    }
}
