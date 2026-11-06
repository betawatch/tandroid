package androidx.biometric;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
