package androidx.biometric;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class w extends d {
    public final WeakReference a;

    public w(y yVar) {
        this.a = new WeakReference(yVar);
    }

    @Override // androidx.biometric.d
    public final void a(int i9, CharSequence charSequence) {
        WeakReference weakReference = this.a;
        if (weakReference.get() == null || ((y) weakReference.get()).o || !((y) weakReference.get()).n) {
            return;
        }
        ((y) weakReference.get()).d(new e(i9, charSequence));
    }

    @Override // androidx.biometric.d
    public final void b(t tVar) {
        WeakReference weakReference = this.a;
        if (weakReference.get() == null || !((y) weakReference.get()).n) {
            return;
        }
        int i9 = -1;
        if (tVar.b == -1) {
            u uVar = tVar.a;
            int c10 = ((y) weakReference.get()).c();
            if ((c10 & 32767) != 0 && !f7.m.a(c10)) {
                i9 = 2;
            }
            tVar = new t(uVar, i9);
        }
        y yVar = (y) weakReference.get();
        if (yVar.r == null) {
            yVar.r = new androidx.lifecycle.z();
        }
        y.h(yVar.r, tVar);
    }
}
