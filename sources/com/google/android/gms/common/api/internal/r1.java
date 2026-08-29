package com.google.android.gms.common.api.internal;

import ag.j2;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class r1 extends androidx.fragment.app.s implements m {
    public static final WeakHashMap h0 = new WeakHashMap();
    public final j2 g0 = new j2(3, (byte) 0);

    @Override // androidx.fragment.app.s
    public final void A() {
        this.Q = true;
        j2 j2Var = this.g0;
        j2Var.b = 5;
        Iterator it = ((Map) j2Var.c).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).onDestroy();
        }
    }

    @Override // androidx.fragment.app.s
    public final void F() {
        this.Q = true;
        j2 j2Var = this.g0;
        j2Var.b = 3;
        Iterator it = ((Map) j2Var.c).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).onResume();
        }
    }

    @Override // androidx.fragment.app.s
    public final void G(Bundle bundle) {
        this.g0.t(bundle);
    }

    @Override // androidx.fragment.app.s
    public final void H() {
        this.Q = true;
        j2 j2Var = this.g0;
        j2Var.b = 2;
        Iterator it = ((Map) j2Var.c).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.s
    public final void I() {
        this.Q = true;
        j2 j2Var = this.g0;
        j2Var.b = 4;
        Iterator it = ((Map) j2Var.c).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).onStop();
        }
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final void a(String str, l lVar) {
        this.g0.q(str, lVar);
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final l b(Class cls, String str) {
        return (l) cls.cast(((Map) this.g0.c).get(str));
    }

    @Override // androidx.fragment.app.s
    public final void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.i(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.g0.c).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.s
    public final void x(int i10, int i11, Intent intent) {
        super.x(i10, i11, intent);
        Iterator it = ((Map) this.g0.c).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).onActivityResult(i10, i11, intent);
        }
    }

    @Override // androidx.fragment.app.s
    public final void z(Bundle bundle) {
        super.z(bundle);
        this.g0.s(bundle);
    }
}
