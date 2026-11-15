package androidx.biometric;

import a8.l1;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
            if ((c10 & 32767) != 0 && !l1.a(c10)) {
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
