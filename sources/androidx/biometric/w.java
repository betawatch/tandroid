package androidx.biometric;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class w extends d {
    public final WeakReference a;

    public w(y yVar) {
        this.a = new WeakReference(yVar);
    }

    @Override // androidx.biometric.d
    public final void a(int i10, CharSequence charSequence) {
        WeakReference weakReference = this.a;
        if (weakReference.get() == null || ((y) weakReference.get()).o || !((y) weakReference.get()).n) {
            return;
        }
        ((y) weakReference.get()).d(new e(i10, charSequence));
    }

    @Override // androidx.biometric.d
    public final void b(t tVar) {
        WeakReference weakReference = this.a;
        if (weakReference.get() == null || !((y) weakReference.get()).n) {
            return;
        }
        int i10 = -1;
        if (tVar.b == -1) {
            u uVar = tVar.a;
            int c10 = ((y) weakReference.get()).c();
            if ((c10 & 32767) != 0 && !v7.m.a(c10)) {
                i10 = 2;
            }
            tVar = new t(uVar, i10);
        }
        y yVar = (y) weakReference.get();
        if (yVar.r == null) {
            yVar.r = new androidx.lifecycle.z();
        }
        y.h(yVar.r, tVar);
    }
}
