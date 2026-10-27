package com.google.android.gms.common.api.internal;

import a8.ng;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class r1 extends androidx.fragment.app.r implements m {
    public static final WeakHashMap l0 = new WeakHashMap();
    public final ng k0 = new ng(3, (byte) 0);

    @Override // androidx.fragment.app.r
    public final void A() {
        this.U = true;
        ng ngVar = this.k0;
        ngVar.b = 5;
        Iterator it = ((Map) ngVar.c).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).onDestroy();
        }
    }

    @Override // androidx.fragment.app.r
    public final void F() {
        this.U = true;
        ng ngVar = this.k0;
        ngVar.b = 3;
        Iterator it = ((Map) ngVar.c).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).onResume();
        }
    }

    @Override // androidx.fragment.app.r
    public final void G(Bundle bundle) {
        this.k0.H(bundle);
    }

    @Override // androidx.fragment.app.r
    public final void H() {
        this.U = true;
        ng ngVar = this.k0;
        ngVar.b = 2;
        Iterator it = ((Map) ngVar.c).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.r
    public final void I() {
        this.U = true;
        ng ngVar = this.k0;
        ngVar.b = 4;
        Iterator it = ((Map) ngVar.c).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).onStop();
        }
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final void a(String str, l lVar) {
        this.k0.E(str, lVar);
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final l b(Class cls, String str) {
        return (l) cls.cast(((Map) this.k0.c).get(str));
    }

    @Override // androidx.fragment.app.r
    public final void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.i(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.k0.c).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.r
    public final void x(int i10, int i11, Intent intent) {
        super.x(i10, i11, intent);
        Iterator it = ((Map) this.k0.c).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).onActivityResult(i10, i11, intent);
        }
    }

    @Override // androidx.fragment.app.r
    public final void z(Bundle bundle) {
        super.z(bundle);
        this.k0.G(bundle);
    }
}
