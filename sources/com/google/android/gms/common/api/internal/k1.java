package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import b8.kg;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k1 extends androidx.fragment.app.s implements l {
    public static final WeakHashMap m0 = new WeakHashMap();
    public final kg l0 = new kg(3, (byte) 0);

    @Override // androidx.fragment.app.s
    public final void A() {
        this.V = true;
        kg kgVar = this.l0;
        kgVar.b = 5;
        Iterator it = ((Map) kgVar.c).values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).onDestroy();
        }
    }

    @Override // androidx.fragment.app.s
    public final void F() {
        this.V = true;
        kg kgVar = this.l0;
        kgVar.b = 3;
        Iterator it = ((Map) kgVar.c).values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).onResume();
        }
    }

    @Override // androidx.fragment.app.s
    public final void G(Bundle bundle) {
        this.l0.G(bundle);
    }

    @Override // androidx.fragment.app.s
    public final void H() {
        this.V = true;
        kg kgVar = this.l0;
        kgVar.b = 2;
        Iterator it = ((Map) kgVar.c).values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.s
    public final void I() {
        this.V = true;
        kg kgVar = this.l0;
        kgVar.b = 4;
        Iterator it = ((Map) kgVar.c).values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).onStop();
        }
    }

    @Override // com.google.android.gms.common.api.internal.l
    public final void a(String str, k kVar) {
        this.l0.D(str, kVar);
    }

    @Override // com.google.android.gms.common.api.internal.l
    public final k b(Class cls, String str) {
        return (k) cls.cast(((Map) this.l0.c).get(str));
    }

    @Override // androidx.fragment.app.s
    public final void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.i(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.l0.c).values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.s
    public final void x(int i3, int i10, Intent intent) {
        super.x(i3, i10, intent);
        Iterator it = ((Map) this.l0.c).values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).onActivityResult(i3, i10, intent);
        }
    }

    @Override // androidx.fragment.app.s
    public final void z(Bundle bundle) {
        super.z(bundle);
        this.l0.E(bundle);
    }
}
