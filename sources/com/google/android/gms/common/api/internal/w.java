package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class w {
    public int a;
    public boolean b;
    public Object[] c;

    public w(y5.c[] cVarArr, boolean z4, int i10) {
        this.c = cVarArr;
        boolean z10 = false;
        if (cVarArr != null && z4) {
            z10 = true;
        }
        this.b = z10;
        this.a = i10;
    }

    public static v e() {
        v vVar = new v();
        vVar.b = true;
        vVar.a = 0;
        return vVar;
    }

    public static int g(int i10, int i11) {
        if (i11 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i12 = i10 + (i10 >> 1) + 1;
        if (i12 < i11) {
            i12 = Integer.highestOneBit(i11 - 1) << 1;
        }
        return i12 < 0 ? ConnectionsManager.DEFAULT_DATACENTER_ID : i12;
    }

    public void b(Object obj) {
        obj.getClass();
        h(this.a + 1);
        Object[] objArr = this.c;
        int i10 = this.a;
        this.a = i10 + 1;
        objArr[i10] = obj;
    }

    public abstract w c(Object obj);

    public void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            h(collection.size() + this.a);
            if (collection instanceof s8.q) {
                this.a = ((s8.q) collection).n(this.a, this.c);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public abstract void f(com.google.android.gms.common.api.c cVar, TaskCompletionSource taskCompletionSource);

    public void h(int i10) {
        Object[] objArr = this.c;
        if (objArr.length < i10) {
            this.c = Arrays.copyOf(objArr, g(objArr.length, i10));
            this.b = false;
        } else if (this.b) {
            this.c = (Object[]) objArr.clone();
            this.b = false;
        }
    }

    public w() {
        s8.l.c(4, "initialCapacity");
        this.c = new Object[4];
        this.a = 0;
    }
}
