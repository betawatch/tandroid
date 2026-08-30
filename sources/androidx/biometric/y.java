package androidx.biometric;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class y extends d {
    public final WeakReference a;

    public y(a0 a0Var) {
        this.a = new WeakReference(a0Var);
    }

    @Override // androidx.biometric.d
    public final void a(int i10, CharSequence charSequence) {
        WeakReference weakReference = this.a;
        if (weakReference.get() == null || ((a0) weakReference.get()).o || !((a0) weakReference.get()).n) {
            return;
        }
        ((a0) weakReference.get()).d(new f(i10, charSequence));
    }

    @Override // androidx.biometric.d
    public final void b(v vVar) {
        WeakReference weakReference = this.a;
        if (weakReference.get() == null || !((a0) weakReference.get()).n) {
            return;
        }
        int i10 = -1;
        if (vVar.b == -1) {
            w wVar = vVar.a;
            int c3 = ((a0) weakReference.get()).c();
            if ((c3 & 32767) != 0 && !com.google.android.gms.internal.cast.n.a(c3)) {
                i10 = 2;
            }
            vVar = new v(wVar, i10);
        }
        a0 a0Var = (a0) weakReference.get();
        if (a0Var.r == null) {
            a0Var.r = new androidx.lifecycle.z();
        }
        a0.h(a0Var.r, vVar);
    }
}
