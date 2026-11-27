// default package

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class lj0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a = 1;
    public final Object b;

    public lj0(mj0 mj0Var) {
        this.b = new WeakReference(mj0Var);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference.get() != null) {
                    ((mj0) weakReference.get()).e(true);
                    break;
                }
                break;
            default:
                ((ai4) obj).D0.e(true);
                break;
        }
    }

    public lj0(ai4 ai4Var) {
        this.b = ai4Var;
    }
}
