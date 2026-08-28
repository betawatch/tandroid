package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r1 extends androidx.fragment.app.s implements m {
    public static final WeakHashMap h0 = new WeakHashMap();
    public final a6.a g0 = new a6.a(2, (byte) 0);

    @Override // androidx.fragment.app.s
    public final void A() {
        this.Q = true;
        a6.a aVar = this.g0;
        aVar.c = 5;
        Iterator it = ((Map) aVar.b).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).onDestroy();
        }
    }

    @Override // androidx.fragment.app.s
    public final void F() {
        this.Q = true;
        a6.a aVar = this.g0;
        aVar.c = 3;
        Iterator it = ((Map) aVar.b).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).onResume();
        }
    }

    @Override // androidx.fragment.app.s
    public final void G(Bundle bundle) {
        this.g0.r(bundle);
    }

    @Override // androidx.fragment.app.s
    public final void H() {
        this.Q = true;
        a6.a aVar = this.g0;
        aVar.c = 2;
        Iterator it = ((Map) aVar.b).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.s
    public final void I() {
        this.Q = true;
        a6.a aVar = this.g0;
        aVar.c = 4;
        Iterator it = ((Map) aVar.b).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).onStop();
        }
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final void a(String str, l lVar) {
        this.g0.o(str, lVar);
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final l b(Class cls, String str) {
        return (l) cls.cast(((Map) this.g0.b).get(str));
    }

    @Override // androidx.fragment.app.s
    public final void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.i(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.g0.b).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.s
    public final void x(int i9, int i10, Intent intent) {
        super.x(i9, i10, intent);
        Iterator it = ((Map) this.g0.b).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).onActivityResult(i9, i10, intent);
        }
    }

    @Override // androidx.fragment.app.s
    public final void z(Bundle bundle) {
        super.z(bundle);
        this.g0.q(bundle);
    }
}
