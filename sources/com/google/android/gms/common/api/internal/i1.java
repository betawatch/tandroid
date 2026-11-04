package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
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
public final class i1 extends Fragment implements l {
    public static final WeakHashMap b = new WeakHashMap();
    public final kg a = new kg(3, (byte) 0);

    @Override // com.google.android.gms.common.api.internal.l
    public final void a(String str, k kVar) {
        this.a.D(str, kVar);
    }

    @Override // com.google.android.gms.common.api.internal.l
    public final k b(Class cls, String str) {
        return (k) cls.cast(((Map) this.a.c).get(str));
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.a.c).values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.l
    public final Activity e() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i3, int i10, Intent intent) {
        super.onActivityResult(i3, i10, intent);
        Iterator it = ((Map) this.a.c).values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).onActivityResult(i3, i10, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.E(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        kg kgVar = this.a;
        kgVar.b = 5;
        Iterator it = ((Map) kgVar.c).values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).onDestroy();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        kg kgVar = this.a;
        kgVar.b = 3;
        Iterator it = ((Map) kgVar.c).values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).onResume();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.a.G(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        kg kgVar = this.a;
        kgVar.b = 2;
        Iterator it = ((Map) kgVar.c).values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        kg kgVar = this.a;
        kgVar.b = 4;
        Iterator it = ((Map) kgVar.c).values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).onStop();
        }
    }
}
