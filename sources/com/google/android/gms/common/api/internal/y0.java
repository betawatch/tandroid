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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class y0 implements OnCompleteListener {
    public static final Status c = new Status(8, "The connection to Google Play services was lost", null, null);
    public final Object a;
    public final Object b;

    public y0(bi.a aVar, m mVar) {
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

    public void b(Status status, boolean z9) {
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
            if (z9 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).e(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z9 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new com.google.android.gms.common.api.f(status));
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((Map) ((y0) this.b).b).remove((TaskCompletionSource) this.a);
    }

    public /* synthetic */ y0(h2.w wVar, y0 y0Var) {
        this.a = wVar;
        this.b = y0Var;
    }

    public y0(int i7) {
        switch (i7) {
            case 2:
                this.a = DesugarCollections.synchronizedMap(new WeakHashMap());
                this.b = DesugarCollections.synchronizedMap(new WeakHashMap());
                break;
            default:
                this.a = DesugarCollections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
                this.b = new x0(this);
                break;
        }
    }

    public y0(y0 y0Var, TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
        Objects.requireNonNull(y0Var);
        this.b = y0Var;
    }
}
