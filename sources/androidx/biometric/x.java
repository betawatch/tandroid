package androidx.biometric;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class x implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public x(y yVar) {
        this.b = new WeakReference(yVar);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.a) {
            case 0:
                WeakReference weakReference = (WeakReference) this.b;
                if (weakReference.get() != null) {
                    ((y) weakReference.get()).g(true);
                    break;
                }
                break;
            default:
                ((f0) this.b).C0.g(true);
                break;
        }
    }

    public x(f0 f0Var) {
        this.b = f0Var;
    }
}
