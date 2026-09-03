package androidx.biometric;

import com.google.android.gms.internal.play_billing.s1;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
            if ((c3 & 32767) != 0 && !s1.a(c3)) {
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
