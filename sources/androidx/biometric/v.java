package androidx.biometric;

import a8.z0;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
            if ((c10 & 32767) != 0 && !z0.a(c10)) {
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
