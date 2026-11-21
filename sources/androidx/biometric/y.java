package androidx.biometric;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                ((g0) this.b).D0.g(true);
                break;
        }
    }

    public y(g0 g0Var) {
        this.b = g0Var;
    }
}
