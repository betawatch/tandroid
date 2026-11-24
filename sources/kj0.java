// default package

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class kj0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a = 1;
    public final Object b;

    public kj0(lj0 lj0Var) {
        this.b = new WeakReference(lj0Var);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference.get() != null) {
                    ((lj0) weakReference.get()).e(true);
                    break;
                }
                break;
            default:
                ((bg4) obj).D0.e(true);
                break;
        }
    }

    public kj0(bg4 bg4Var) {
        this.b = bg4Var;
    }
}
