package androidx.biometric;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class y implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public y(z zVar) {
        this.b = new WeakReference(zVar);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        switch (this.a) {
            case 0:
                WeakReference weakReference = (WeakReference) this.b;
                if (weakReference.get() != null) {
                    ((z) weakReference.get()).g(true);
                    break;
                }
                break;
            default:
                ((g0) this.b).C0.g(true);
                break;
        }
    }

    public y(g0 g0Var) {
        this.b = g0Var;
    }
}
