package androidx.biometric;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class v extends d {
    public final WeakReference a;

    public v(x xVar) {
        this.a = new WeakReference(xVar);
    }

    @Override // androidx.biometric.d
    public final void a(int i10, CharSequence charSequence) {
        WeakReference weakReference = this.a;
        if (weakReference.get() == null || ((x) weakReference.get()).o || !((x) weakReference.get()).n) {
            return;
        }
        ((x) weakReference.get()).d(new e(i10, charSequence));
    }

    @Override // androidx.biometric.d
    public final void b(s sVar) {
        WeakReference weakReference = this.a;
        if (weakReference.get() == null || !((x) weakReference.get()).n) {
            return;
        }
        int i10 = -1;
        if (sVar.b == -1) {
            t tVar = sVar.a;
            int c10 = ((x) weakReference.get()).c();
            if ((c10 & 32767) != 0 && !v7.o.a(c10)) {
                i10 = 2;
            }
            sVar = new s(tVar, i10);
        }
        x xVar = (x) weakReference.get();
        if (xVar.r == null) {
            xVar.r = new androidx.lifecycle.z();
        }
        x.h(xVar.r, sVar);
    }
}
