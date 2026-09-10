package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class w {
    public int a;
    public boolean b;
    public Object[] c;

    public w(k6.c[] cVarArr, boolean z10, int i10) {
        this.c = cVarArr;
        boolean z11 = false;
        if (cVarArr != null && z10) {
            z11 = true;
        }
        this.b = z11;
        this.a = i10;
    }

    public static v e() {
        v vVar = new v();
        vVar.b = true;
        vVar.a = 0;
        return vVar;
    }

    public static int h(int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i11 <= i10) {
            return i10;
        }
        int i12 = i10 + (i10 >> 1) + 1;
        if (i12 < i11) {
            i12 = Integer.highestOneBit(i11 - 1) << 1;
        }
        return i12 < 0 ? ConnectionsManager.DEFAULT_DATACENTER_ID : i12;
    }

    public void b(Object obj) {
        obj.getClass();
        g(1);
        Object[] objArr = this.c;
        int i10 = this.a;
        this.a = i10 + 1;
        objArr[i10] = obj;
    }

    public abstract w c(Object obj);

    public void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            g(collection.size());
            if (collection instanceof e9.d0) {
                this.a = ((e9.d0) collection).n(this.a, this.c);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public abstract void f(com.google.android.gms.common.api.c cVar, TaskCompletionSource taskCompletionSource);

    public void g(int i10) {
        Object[] objArr = this.c;
        int h = h(objArr.length, this.a + i10);
        if (h > objArr.length || this.b) {
            this.c = Arrays.copyOf(this.c, h);
            this.b = false;
        }
    }

    public w(int i10) {
        e9.q.e(i10, "initialCapacity");
        this.c = new Object[i10];
        this.a = 0;
    }
}
