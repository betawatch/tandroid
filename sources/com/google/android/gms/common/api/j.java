package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.api.internal.a1;
import com.google.android.gms.common.api.internal.b1;
import com.google.android.gms.common.api.internal.c1;
import com.google.android.gms.common.api.internal.d1;
import com.google.android.gms.common.api.internal.p0;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.w0;
import com.google.android.gms.internal.cast.y;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import h2.w;
import java.util.Collections;
import java.util.Set;
import org.telegram.ui.md0;
import v4.f0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public abstract class j {
    public final Context a;
    public final String b;
    public final f0 c;
    public final e d;
    public final b e;
    public final com.google.android.gms.common.api.internal.a f;
    public final Looper g;
    public final int h;
    public final p0 i;
    public final com.google.android.gms.common.api.internal.r j;
    public final com.google.android.gms.common.api.internal.g k;

    public j(Context context, e eVar, a aVar, com.google.android.gms.common.api.internal.r rVar) {
        this(context, eVar, aVar, new i(rVar, Looper.getMainLooper()));
    }

    public final md0 a() {
        md0 md0Var = new md0(8, false);
        Set set = Collections.EMPTY_SET;
        if (((a0.g) md0Var.b) == null) {
            md0Var.b = new a0.g(0);
        }
        ((a0.g) md0Var.b).addAll(set);
        Context context = this.a;
        md0Var.c = context.getClass().getName();
        md0Var.d = context.getPackageName();
        return md0Var;
    }

    public final Task b(a1 a1Var) {
        q6.m.i(((com.google.android.gms.common.api.internal.o) ((w) a1Var.a).c).b, "Listener has already been released.");
        a1 a1Var2 = (a1) a1Var.b;
        q6.m.i((com.google.android.gms.common.api.internal.m) a1Var2.a, "Listener has already been released.");
        w wVar = (w) a1Var.a;
        com.google.android.gms.common.api.internal.g gVar = this.k;
        gVar.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        gVar.c(taskCompletionSource, wVar.b, this);
        v0 v0Var = new v0(new c1(new w0(wVar, a1Var2), taskCompletionSource), gVar.r.get(), this);
        y yVar = gVar.y;
        yVar.sendMessage(yVar.obtainMessage(8, v0Var));
        return taskCompletionSource.getTask();
    }

    public final Task c(com.google.android.gms.common.api.internal.m mVar, int i7) {
        q6.m.i(mVar, "Listener key cannot be null.");
        com.google.android.gms.common.api.internal.g gVar = this.k;
        gVar.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        gVar.c(taskCompletionSource, i7, this);
        v0 v0Var = new v0(new c1(mVar, taskCompletionSource), gVar.r.get(), this);
        y yVar = gVar.y;
        yVar.sendMessage(yVar.obtainMessage(13, v0Var));
        return taskCompletionSource.getTask();
    }

    public final void d(int i7, com.google.android.gms.common.api.internal.d dVar) {
        dVar.l();
        com.google.android.gms.common.api.internal.g gVar = this.k;
        gVar.getClass();
        v0 v0Var = new v0(new b1(i7, dVar), gVar.r.get(), this);
        y yVar = gVar.y;
        yVar.sendMessage(yVar.obtainMessage(4, v0Var));
    }

    public final Task e(int i7, com.google.android.gms.common.api.internal.u uVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        com.google.android.gms.common.api.internal.g gVar = this.k;
        gVar.getClass();
        gVar.c(taskCompletionSource, uVar.c, this);
        v0 v0Var = new v0(new d1(i7, uVar, taskCompletionSource, this.j), gVar.r.get(), this);
        y yVar = gVar.y;
        yVar.sendMessage(yVar.obtainMessage(4, v0Var));
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
        this.c = i7 >= 31 ? new f0(context.getAttributionSource()) : null;
        this.d = eVar;
        this.e = bVar;
        this.g = iVar.b;
        this.f = new com.google.android.gms.common.api.internal.a(eVar, bVar, attributionTag);
        this.i = new p0(this);
        com.google.android.gms.common.api.internal.g e10 = com.google.android.gms.common.api.internal.g.e(applicationContext);
        this.k = e10;
        this.h = e10.n.getAndIncrement();
        this.j = iVar.a;
        y yVar = e10.y;
        yVar.sendMessage(yVar.obtainMessage(7, this));
    }
}
