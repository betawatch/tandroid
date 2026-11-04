package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class z0 implements OnCompleteListener {
    public static final Status c = new Status(8, "The connection to Google Play services was lost", null, null);
    public final Object a;
    public final Object b;

    public z0(ci.a aVar, m mVar) {
        this.b = aVar;
        this.a = mVar;
    }

    public void a() {
        boolean f10;
        Set set = (Set) this.a;
        for (BasePendingResult basePendingResult : (BasePendingResult[]) set.toArray(new BasePendingResult[0])) {
            basePendingResult.g.set(null);
            synchronized (basePendingResult.a) {
                try {
                    if (((com.google.android.gms.common.api.m) basePendingResult.c.get()) != null) {
                        if (!basePendingResult.m) {
                        }
                        f10 = basePendingResult.f();
                    }
                    basePendingResult.c();
                    f10 = basePendingResult.f();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (f10) {
                set.remove(basePendingResult);
            }
        }
    }

    public void b(Status status, boolean z10) {
        HashMap hashMap;
        HashMap hashMap2;
        Map map = (Map) this.a;
        synchronized (map) {
            hashMap = new HashMap(map);
        }
        Map map2 = (Map) this.b;
        synchronized (map2) {
            hashMap2 = new HashMap(map2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).e(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new com.google.android.gms.common.api.f(status));
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((Map) ((z0) this.b).b).remove((TaskCompletionSource) this.a);
    }

    public /* synthetic */ z0(g2.x xVar, z0 z0Var) {
        this.a = xVar;
        this.b = z0Var;
    }

    public z0(int i3) {
        switch (i3) {
            case 2:
                this.a = DesugarCollections.synchronizedMap(new WeakHashMap());
                this.b = DesugarCollections.synchronizedMap(new WeakHashMap());
                break;
            default:
                this.a = DesugarCollections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
                this.b = new y0(this);
                break;
        }
    }

    public z0(z0 z0Var, TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
        Objects.requireNonNull(z0Var);
        this.b = z0Var;
    }
}
