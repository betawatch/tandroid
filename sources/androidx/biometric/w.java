package androidx.biometric;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
        ((y) weakReference.get()).d(new f(i10, charSequence));
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
            if ((c10 & 32767) != 0 && !v7.k.a(c10)) {
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
