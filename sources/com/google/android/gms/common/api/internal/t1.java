package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class t1 extends androidx.fragment.app.s implements m {
    public static final WeakHashMap i0 = new WeakHashMap();
    public final b4.e0 h0 = new b4.e0(2, (byte) 0);

    @Override // androidx.fragment.app.s
    public final void A() {
        this.R = true;
        b4.e0 e0Var = this.h0;
        e0Var.b = 5;
        Iterator it = ((Map) e0Var.c).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).onDestroy();
        }
    }

    @Override // androidx.fragment.app.s
    public final void F() {
        this.R = true;
        b4.e0 e0Var = this.h0;
        e0Var.b = 3;
        Iterator it = ((Map) e0Var.c).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).onResume();
        }
    }

    @Override // androidx.fragment.app.s
    public final void G(Bundle bundle) {
        this.h0.F(bundle);
    }

    @Override // androidx.fragment.app.s
    public final void H() {
        this.R = true;
        b4.e0 e0Var = this.h0;
        e0Var.b = 2;
        Iterator it = ((Map) e0Var.c).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.s
    public final void I() {
        this.R = true;
        b4.e0 e0Var = this.h0;
        e0Var.b = 4;
        Iterator it = ((Map) e0Var.c).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).onStop();
        }
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final void a(String str, l lVar) {
        this.h0.C(str, lVar);
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final l b(Class cls, String str) {
        return (l) cls.cast(((Map) this.h0.c).get(str));
    }

    @Override // androidx.fragment.app.s
    public final void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.i(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.h0.c).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.s
    public final void x(int i10, int i11, Intent intent) {
        super.x(i10, i11, intent);
        Iterator it = ((Map) this.h0.c).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).onActivityResult(i10, i11, intent);
        }
    }

    @Override // androidx.fragment.app.s
    public final void z(Bundle bundle) {
        super.z(bundle);
        this.h0.E(bundle);
    }
}
