package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p1 extends Fragment implements m {
    public static final WeakHashMap b = new WeakHashMap();
    public final a6.a a = new a6.a(2, (byte) 0);

    @Override // com.google.android.gms.common.api.internal.m
    public final void a(String str, l lVar) {
        this.a.o(str, lVar);
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final l b(Class cls, String str) {
        return (l) cls.cast(((Map) this.a.b).get(str));
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.a.b).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final Activity e() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i9, int i10, Intent intent) {
        super.onActivityResult(i9, i10, intent);
        Iterator it = ((Map) this.a.b).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).onActivityResult(i9, i10, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.q(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a6.a aVar = this.a;
        aVar.c = 5;
        Iterator it = ((Map) aVar.b).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).onDestroy();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        a6.a aVar = this.a;
        aVar.c = 3;
        Iterator it = ((Map) aVar.b).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).onResume();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.a.r(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        a6.a aVar = this.a;
        aVar.c = 2;
        Iterator it = ((Map) aVar.b).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a6.a aVar = this.a;
        aVar.c = 4;
        Iterator it = ((Map) aVar.b).values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).onStop();
        }
    }
}
