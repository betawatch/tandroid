// default package

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
