package com.google.android.gms.common.api.internal;

import a8.xa;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class j1 extends Fragment implements l {
    public static final WeakHashMap b = new WeakHashMap();
    public final xa a = new xa(3, (byte) 0);

    @Override // com.google.android.gms.common.api.internal.l
    public final void a(String str, k kVar) {
        this.a.D(str, kVar);
    }

    @Override // com.google.android.gms.common.api.internal.l
    public final k b(Class cls, String str) {
        return (k) cls.cast(((Map) this.a.c).get(str));
    }

    @Override // com.google.android.gms.common.api.internal.l
    public final Activity c() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.a.c).values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        Iterator it = ((Map) this.a.c).values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).onActivityResult(i7, i10, intent);
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
        xa xaVar = this.a;
        xaVar.b = 5;
        Iterator it = ((Map) xaVar.c).values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).onDestroy();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        xa xaVar = this.a;
        xaVar.b = 3;
        Iterator it = ((Map) xaVar.c).values().iterator();
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
        xa xaVar = this.a;
        xaVar.b = 2;
        Iterator it = ((Map) xaVar.c).values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        xa xaVar = this.a;
        xaVar.b = 4;
        Iterator it = ((Map) xaVar.c).values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).onStop();
        }
    }
}
