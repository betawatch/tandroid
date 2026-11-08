package com.google.android.gms.common.api;

import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.api.internal.a1;
import com.google.android.gms.common.api.internal.b1;
import com.google.android.gms.common.api.internal.n0;
import com.google.android.gms.common.api.internal.t0;
import com.google.android.gms.common.api.internal.u0;
import com.google.android.gms.common.api.internal.y0;
import com.google.android.gms.common.api.internal.z0;
import com.google.android.gms.internal.cast.y;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import h2.w;
import java.util.Collections;
import java.util.Set;
import org.telegram.ui.hy0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public abstract class j {
    public final Context a;
    public final String b;
    public final z2.d c;
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

    public final hy0 a() {
        hy0 hy0Var = new hy0(7, false);
        Set set = Collections.EMPTY_SET;
        if (((a0.g) hy0Var.b) == null) {
            hy0Var.b = new a0.g(0);
        }
        ((a0.g) hy0Var.b).addAll(set);
        Context context = this.a;
        hy0Var.d = context.getClass().getName();
        hy0Var.c = context.getPackageName();
        return hy0Var;
    }

    public final Task b(y0 y0Var) {
        q6.m.h(((com.google.android.gms.common.api.internal.o) ((w) y0Var.a).c).b, "Listener has already been released.");
        y0 y0Var2 = (y0) y0Var.b;
        q6.m.h((com.google.android.gms.common.api.internal.m) y0Var2.a, "Listener has already been released.");
        w wVar = (w) y0Var.a;
        com.google.android.gms.common.api.internal.g gVar = this.k;
        gVar.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        gVar.c(taskCompletionSource, wVar.b, this);
        t0 t0Var = new t0(new a1(new u0(wVar, y0Var2), taskCompletionSource), gVar.r.get(), this);
        y yVar = gVar.y;
        yVar.sendMessage(yVar.obtainMessage(8, t0Var));
        return taskCompletionSource.getTask();
    }

    public final Task c(com.google.android.gms.common.api.internal.m mVar, int i7) {
        q6.m.h(mVar, "Listener key cannot be null.");
        com.google.android.gms.common.api.internal.g gVar = this.k;
        gVar.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        gVar.c(taskCompletionSource, i7, this);
        t0 t0Var = new t0(new a1(mVar, taskCompletionSource), gVar.r.get(), this);
        y yVar = gVar.y;
        yVar.sendMessage(yVar.obtainMessage(13, t0Var));
        return taskCompletionSource.getTask();
    }

    public final void d(int i7, com.google.android.gms.common.api.internal.d dVar) {
        dVar.l();
        com.google.android.gms.common.api.internal.g gVar = this.k;
        gVar.getClass();
        t0 t0Var = new t0(new z0(i7, dVar), gVar.r.get(), this);
        y yVar = gVar.y;
        yVar.sendMessage(yVar.obtainMessage(4, t0Var));
    }

    public final Task e(int i7, com.google.android.gms.common.api.internal.t tVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        com.google.android.gms.common.api.internal.g gVar = this.k;
        gVar.getClass();
        gVar.c(taskCompletionSource, tVar.c, this);
        t0 t0Var = new t0(new b1(i7, tVar, taskCompletionSource, this.j), gVar.r.get(), this);
        y yVar = gVar.y;
        yVar.sendMessage(yVar.obtainMessage(4, t0Var));
        return taskCompletionSource.getTask();
    }

    public j(Context context, e eVar, b bVar, i iVar) {
        q6.m.h(context, "Null context is not permitted.");
        q6.m.h(eVar, "Api must not be null.");
        q6.m.h(iVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        q6.m.h(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        int i7 = Build.VERSION.SDK_INT;
        z2.d dVar = null;
        String attributionTag = (i7 < 30 || i7 < 30) ? null : context.getAttributionTag();
        this.b = attributionTag;
        if (i7 >= 31) {
            AttributionSource attributionSource = context.getAttributionSource();
            dVar = new z2.d();
            dVar.b = attributionSource;
        }
        this.c = dVar;
        this.d = eVar;
        this.e = bVar;
        this.g = iVar.b;
        this.f = new com.google.android.gms.common.api.internal.a(eVar, bVar, attributionTag);
        this.i = new n0(this);
        com.google.android.gms.common.api.internal.g e10 = com.google.android.gms.common.api.internal.g.e(applicationContext);
        this.k = e10;
        this.h = e10.n.getAndIncrement();
        this.j = iVar.a;
        y yVar = e10.y;
        yVar.sendMessage(yVar.obtainMessage(7, this));
    }
}
