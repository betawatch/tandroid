package org.telegram.ui.Components;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.HashMap;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public abstract class k41 {
    public final int a;

    public k41() {
        int i7 = l41.K;
        l41.K = i7 + 1;
        this.a = i7;
    }

    public static void h(k41 k41Var) {
        if (l41.M == null) {
            l41.M = new HashMap();
        }
        if (l41.L == null) {
            l41.L = new LongSparseArray();
        }
        Class<?> cls = k41Var.getClass();
        if (l41.M.containsKey(cls)) {
            return;
        }
        l41.M.put(cls, k41Var);
        l41.L.put(k41Var.a, k41Var);
    }

    public boolean c(l41 l41Var, l41 l41Var2) {
        return l41Var.I(l41Var2);
    }

    public abstract View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var);

    public boolean e(l41 l41Var, l41 l41Var2) {
        return l41Var.J(l41Var2);
    }

    public boolean f() {
        return !(this instanceof org.telegram.messenger.tt);
    }

    public boolean g() {
        return this instanceof aj;
    }

    public void a(ck0 ck0Var, View view, l41 l41Var) {
    }

    public void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
    }
}
