package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.api.internal.a1;
import com.google.android.gms.common.api.internal.b1;
import com.google.android.gms.common.api.internal.c1;
import com.google.android.gms.common.api.internal.o0;
import com.google.android.gms.common.api.internal.u0;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.z0;
import com.google.android.gms.internal.cast.y;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import h2.w;
import java.util.Collections;
import java.util.Set;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.nd0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class j {
    public final Context a;
    public final String b;
    public final nd0 c;
    public final e d;
    public final b e;
    public final com.google.android.gms.common.api.internal.a f;
    public final Looper g;
    public final int h;
    public final o0 i;
    public final com.google.android.gms.common.api.internal.r j;
    public final com.google.android.gms.common.api.internal.g k;

    public j(Context context, e eVar, a aVar, com.google.android.gms.common.api.internal.r rVar) {
        this(context, eVar, aVar, new i(rVar, Looper.getMainLooper()));
    }

    public final i61 a() {
        i61 i61Var = new i61(10, false);
        Set set = Collections.EMPTY_SET;
        if (((a0.g) i61Var.b) == null) {
            i61Var.b = new a0.g(0);
        }
        ((a0.g) i61Var.b).addAll(set);
        Context context = this.a;
        i61Var.d = context.getClass().getName();
        i61Var.c = context.getPackageName();
        return i61Var;
    }

    public final Task b(z0 z0Var) {
        q6.m.i(((com.google.android.gms.common.api.internal.o) ((w) z0Var.a).c).b, "Listener has already been released.");
        z0 z0Var2 = (z0) z0Var.b;
        q6.m.i((com.google.android.gms.common.api.internal.m) z0Var2.a, "Listener has already been released.");
        w wVar = (w) z0Var.a;
        com.google.android.gms.common.api.internal.g gVar = this.k;
        gVar.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        gVar.c(taskCompletionSource, wVar.b, this);
        u0 u0Var = new u0(new b1(new v0(wVar, z0Var2), taskCompletionSource), gVar.r.get(), this);
        y yVar = gVar.y;
        yVar.sendMessage(yVar.obtainMessage(8, u0Var));
        return taskCompletionSource.getTask();
    }

    public final Task c(com.google.android.gms.common.api.internal.m mVar, int i7) {
        q6.m.i(mVar, "Listener key cannot be null.");
        com.google.android.gms.common.api.internal.g gVar = this.k;
        gVar.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        gVar.c(taskCompletionSource, i7, this);
        u0 u0Var = new u0(new b1(mVar, taskCompletionSource), gVar.r.get(), this);
        y yVar = gVar.y;
        yVar.sendMessage(yVar.obtainMessage(13, u0Var));
        return taskCompletionSource.getTask();
    }

    public final void d(int i7, com.google.android.gms.common.api.internal.d dVar) {
        dVar.l();
        com.google.android.gms.common.api.internal.g gVar = this.k;
        gVar.getClass();
        u0 u0Var = new u0(new a1(i7, dVar), gVar.r.get(), this);
        y yVar = gVar.y;
        yVar.sendMessage(yVar.obtainMessage(4, u0Var));
    }

    public final Task e(int i7, com.google.android.gms.common.api.internal.u uVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        com.google.android.gms.common.api.internal.g gVar = this.k;
        gVar.getClass();
        gVar.c(taskCompletionSource, uVar.c, this);
        u0 u0Var = new u0(new c1(i7, uVar, taskCompletionSource, this.j), gVar.r.get(), this);
        y yVar = gVar.y;
        yVar.sendMessage(yVar.obtainMessage(4, u0Var));
        return taskCompletionSource.getTask();
    }

    public j(Context context, e eVar, b bVar, i iVar) {
        q6.m.i(context, "Null context is not permitted.");
        q6.m.i(eVar, "Api must not be null.");
        q6.m.i(iVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        q6.m.i(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        int i7 = Build.VERSION.SDK_INT;
        String attributionTag = (i7 < 30 || i7 < 30) ? null : context.getAttributionTag();
        this.b = attributionTag;
        this.c = i7 >= 31 ? new nd0(context.getAttributionSource(), 29) : null;
        this.d = eVar;
        this.e = bVar;
        this.g = iVar.b;
        this.f = new com.google.android.gms.common.api.internal.a(eVar, bVar, attributionTag);
        this.i = new o0(this);
        com.google.android.gms.common.api.internal.g e10 = com.google.android.gms.common.api.internal.g.e(applicationContext);
        this.k = e10;
        this.h = e10.n.getAndIncrement();
        this.j = iVar.a;
        y yVar = e10.y;
        yVar.sendMessage(yVar.obtainMessage(7, this));
    }
}
