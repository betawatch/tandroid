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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g1 implements OnCompleteListener {
    public static final Status c = new Status(8, "The connection to Google Play services was lost", null, null);
    public final Object a;
    public final Object b;

    public /* synthetic */ g1(com.google.android.exoplayer2.upstream.t tVar, g1 g1Var) {
        this.a = tVar;
        this.b = g1Var;
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
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (f10) {
                ((Set) this.a).remove(basePendingResult);
            }
        }
    }

    public void b(Status status, boolean z10) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.a)) {
            hashMap = new HashMap((Map) this.a);
        }
        synchronized (((Map) this.b)) {
            hashMap2 = new HashMap((Map) this.b);
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
        ((Map) ((g1) this.b).b).remove((TaskCompletionSource) this.a);
    }

    public /* synthetic */ g1(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public g1(int i9) {
        switch (i9) {
            case 3:
                this.a = DesugarCollections.synchronizedMap(new WeakHashMap());
                this.b = DesugarCollections.synchronizedMap(new WeakHashMap());
                break;
            default:
                this.a = DesugarCollections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
                this.b = new f1(this);
                break;
        }
    }
}
