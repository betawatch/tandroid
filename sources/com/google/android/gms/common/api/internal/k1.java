package com.google.android.gms.common.api.internal;

import a8.xa;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class k1 extends androidx.fragment.app.s implements l {
    public static final WeakHashMap m0 = new WeakHashMap();
    public final xa l0 = new xa(3, (byte) 0);

    @Override // androidx.fragment.app.s
    public final void A() {
        this.V = true;
        xa xaVar = this.l0;
        xaVar.b = 5;
        Iterator it = ((Map) xaVar.c).values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).onDestroy();
        }
    }

    @Override // androidx.fragment.app.s
    public final void F() {
        this.V = true;
        xa xaVar = this.l0;
        xaVar.b = 3;
        Iterator it = ((Map) xaVar.c).values().iterator();
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
        xa xaVar = this.l0;
        xaVar.b = 2;
        Iterator it = ((Map) xaVar.c).values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.s
    public final void I() {
        this.V = true;
        xa xaVar = this.l0;
        xaVar.b = 4;
        Iterator it = ((Map) xaVar.c).values().iterator();
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
    public final void x(int i7, int i10, Intent intent) {
        super.x(i7, i10, intent);
        Iterator it = ((Map) this.l0.c).values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).onActivityResult(i7, i10, intent);
        }
    }

    @Override // androidx.fragment.app.s
    public final void z(Bundle bundle) {
        super.z(bundle);
        this.l0.E(bundle);
    }
}
