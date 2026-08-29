package com.google.android.gms.common.api.internal;

import ag.j2;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class p1 extends Fragment implements m {
    public static final WeakHashMap b = new WeakHashMap();
    public final j2 a = new j2(3, (byte) 0);

    @Override // com.google.android.gms.common.api.internal.m
    public final void a(String str, l lVar) {
        this.a.q(str, lVar);
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final l b(Class cls, String str) {
        return (l) cls.cast(((Map) this.a.c).get(str));
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.a.c).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final Activity e() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Iterator it = ((Map) this.a.c).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).onActivityResult(i10, i11, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.s(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        j2 j2Var = this.a;
        j2Var.b = 5;
        Iterator it = ((Map) j2Var.c).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).onDestroy();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        j2 j2Var = this.a;
        j2Var.b = 3;
        Iterator it = ((Map) j2Var.c).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).onResume();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.a.t(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        j2 j2Var = this.a;
        j2Var.b = 2;
        Iterator it = ((Map) j2Var.c).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        j2 j2Var = this.a;
        j2Var.b = 4;
        Iterator it = ((Map) j2Var.c).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).onStop();
        }
    }
}
