package androidx.biometric;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
            if ((c10 & 32767) != 0 && !v7.m.a(c10)) {
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
