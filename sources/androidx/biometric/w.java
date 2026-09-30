package androidx.biometric;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class w implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public w(x xVar) {
        this.b = new WeakReference(xVar);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.a) {
            case 0:
                WeakReference weakReference = (WeakReference) this.b;
                if (weakReference.get() != null) {
                    ((x) weakReference.get()).g(true);
                    break;
                }
                break;
            default:
                ((e0) this.b).C0.g(true);
                break;
        }
    }

    public w(e0 e0Var) {
        this.b = e0Var;
    }
}
