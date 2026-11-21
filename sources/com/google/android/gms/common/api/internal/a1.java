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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class a1 implements OnCompleteListener {
    public static final Status c = new Status(8, "The connection to Google Play services was lost", null, null);
    public final Object a;
    public final Object b;

    public a1(p pVar, m mVar) {
        this.b = pVar;
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
        ((Map) ((a1) this.b).b).remove((TaskCompletionSource) this.a);
    }

    public /* synthetic */ a1(h2.w wVar, a1 a1Var) {
        this.a = wVar;
        this.b = a1Var;
    }

    public a1(int i7) {
        switch (i7) {
            case 2:
                this.a = DesugarCollections.synchronizedMap(new WeakHashMap());
                this.b = DesugarCollections.synchronizedMap(new WeakHashMap());
                break;
            default:
                this.a = DesugarCollections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
                this.b = new z0(this);
                break;
        }
    }

    public a1(a1 a1Var, TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
        Objects.requireNonNull(a1Var);
        this.b = a1Var;
    }
}
