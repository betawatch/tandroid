package androidx.biometric;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class z implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public z(a0 a0Var) {
        this.b = new WeakReference(a0Var);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.a) {
            case 0:
                WeakReference weakReference = (WeakReference) this.b;
                if (weakReference.get() != null) {
                    ((a0) weakReference.get()).g(true);
                    break;
                }
                break;
            default:
                ((i0) this.b).z0.g(true);
                break;
        }
    }

    public z(i0 i0Var) {
        this.b = i0Var;
    }
}
