package androidx.biometric;

import a8.k1;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class x extends d {
    public final WeakReference a;

    public x(z zVar) {
        this.a = new WeakReference(zVar);
    }

    @Override // androidx.biometric.d
    public final void a(int i7, CharSequence charSequence) {
        WeakReference weakReference = this.a;
        if (weakReference.get() == null || ((z) weakReference.get()).o || !((z) weakReference.get()).n) {
            return;
        }
        ((z) weakReference.get()).d(new e(i7, charSequence));
    }

    @Override // androidx.biometric.d
    public final void b(u uVar) {
        WeakReference weakReference = this.a;
        if (weakReference.get() == null || !((z) weakReference.get()).n) {
            return;
        }
        int i7 = -1;
        if (uVar.b == -1) {
            v vVar = uVar.a;
            int c10 = ((z) weakReference.get()).c();
            if ((c10 & 32767) != 0 && !k1.a(c10)) {
                i7 = 2;
            }
            uVar = new u(vVar, i7);
        }
        z zVar = (z) weakReference.get();
        if (zVar.r == null) {
            zVar.r = new androidx.lifecycle.z();
        }
        z.h(zVar.r, uVar);
    }
}
