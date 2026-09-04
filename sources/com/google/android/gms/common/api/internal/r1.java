package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class r1 extends androidx.fragment.app.r implements m {
    public static final WeakHashMap l0 = new WeakHashMap();
    public final a5.a k0 = new a5.a(1, (byte) 0);

    @Override // androidx.fragment.app.r
    public final void A() {
        this.U = true;
        a5.a aVar = this.k0;
        aVar.b = 5;
        Iterator it = ((Map) aVar.c).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).onDestroy();
        }
    }

    @Override // androidx.fragment.app.r
    public final void F() {
        this.U = true;
        a5.a aVar = this.k0;
        aVar.b = 3;
        Iterator it = ((Map) aVar.c).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).onResume();
        }
    }

    @Override // androidx.fragment.app.r
    public final void G(Bundle bundle) {
        this.k0.D(bundle);
    }

    @Override // androidx.fragment.app.r
    public final void H() {
        this.U = true;
        a5.a aVar = this.k0;
        aVar.b = 2;
        Iterator it = ((Map) aVar.c).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.r
    public final void I() {
        this.U = true;
        a5.a aVar = this.k0;
        aVar.b = 4;
        Iterator it = ((Map) aVar.c).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).onStop();
        }
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final void a(String str, l lVar) {
        this.k0.A(str, lVar);
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
        this.k0.C(bundle);
    }
}
