package androidx.biometric;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class x extends d {
    public final WeakReference a;

    public x(z zVar) {
        this.a = new WeakReference(zVar);
    }

    @Override // androidx.biometric.d
    public final void a(int i10, CharSequence charSequence) {
        WeakReference weakReference = this.a;
        if (weakReference.get() == null || ((z) weakReference.get()).o || !((z) weakReference.get()).n) {
            return;
        }
        ((z) weakReference.get()).d(new f(i10, charSequence));
    }

    @Override // androidx.biometric.d
    public final void b(u uVar) {
        WeakReference weakReference = this.a;
        if (weakReference.get() == null || !((z) weakReference.get()).n) {
            return;
        }
        int i10 = -1;
        if (uVar.b == -1) {
            v vVar = uVar.a;
            int c3 = ((z) weakReference.get()).c();
            if ((c3 & 32767) != 0 && !h7.u.a(c3)) {
                i10 = 2;
            }
            uVar = new u(vVar, i10);
        }
        z zVar = (z) weakReference.get();
        if (zVar.r == null) {
            zVar.r = new androidx.lifecycle.z();
        }
        z.h(zVar.r, uVar);
    }
}
