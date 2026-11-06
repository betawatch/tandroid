package com.google.android.gms.common.api.internal;

import a8.wa;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class i1 extends androidx.fragment.app.r implements l {
    public static final WeakHashMap l0 = new WeakHashMap();
    public final wa k0 = new wa(3, (byte) 0);

    @Override // androidx.fragment.app.r
    public final void A() {
        this.U = true;
        wa waVar = this.k0;
        waVar.b = 5;
        Iterator it = ((Map) waVar.c).values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).onDestroy();
        }
    }

    @Override // androidx.fragment.app.r
    public final void F() {
        this.U = true;
        wa waVar = this.k0;
        waVar.b = 3;
        Iterator it = ((Map) waVar.c).values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).onResume();
        }
    }

    @Override // androidx.fragment.app.r
    public final void G(Bundle bundle) {
        this.k0.F(bundle);
    }

    @Override // androidx.fragment.app.r
    public final void H() {
        this.U = true;
        wa waVar = this.k0;
        waVar.b = 2;
        Iterator it = ((Map) waVar.c).values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.r
    public final void I() {
        this.U = true;
        wa waVar = this.k0;
        waVar.b = 4;
        Iterator it = ((Map) waVar.c).values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).onStop();
        }
    }

    @Override // com.google.android.gms.common.api.internal.l
    public final void a(String str, k kVar) {
        this.k0.C(str, kVar);
    }

    @Override // com.google.android.gms.common.api.internal.l
    public final k b(Class cls, String str) {
        return (k) cls.cast(((Map) this.k0.c).get(str));
    }

    @Override // androidx.fragment.app.r
    public final void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.i(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.k0.c).values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.r
    public final void x(int i7, int i10, Intent intent) {
        super.x(i7, i10, intent);
        Iterator it = ((Map) this.k0.c).values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).onActivityResult(i7, i10, intent);
        }
    }

    @Override // androidx.fragment.app.r
    public final void z(Bundle bundle) {
        super.z(bundle);
        this.k0.D(bundle);
    }
}
