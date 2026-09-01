package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class h1 implements OnCompleteListener {
    public static final Status c = new Status(8, "The connection to Google Play services was lost", null, null);
    public final Object a;
    public final Object b;

    public /* synthetic */ h1(d1 d1Var, h1 h1Var) {
        this.a = d1Var;
        this.b = h1Var;
    }

    public void a() {
        boolean f10;
        for (BasePendingResult basePendingResult : (BasePendingResult[]) ((Set) this.a).toArray(new BasePendingResult[0])) {
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
                ((Set) this.a).remove(basePendingResult);
            }
        }
    }

    public void b(Status status, boolean z4) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.a)) {
            hashMap = new HashMap((Map) this.a);
        }
        synchronized (((Map) this.b)) {
            hashMap2 = new HashMap((Map) this.b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z4 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).e(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z4 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new com.google.android.gms.common.api.f(status));
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((Map) ((h1) this.b).b).remove((TaskCompletionSource) this.a);
    }

    public /* synthetic */ h1(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public h1(int i10) {
        switch (i10) {
            case 3:
                this.a = DesugarCollections.synchronizedMap(new WeakHashMap());
                this.b = DesugarCollections.synchronizedMap(new WeakHashMap());
                break;
            default:
                this.a = DesugarCollections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
                this.b = new g1(this);
                break;
        }
    }
}
