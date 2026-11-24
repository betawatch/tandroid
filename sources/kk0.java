// default package

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class kk0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a = 1;
    public final Object b;

    public kk0(lk0 lk0Var) {
        this.b = new WeakReference(lk0Var);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference.get() != null) {
                    ((lk0) weakReference.get()).e(true);
                    break;
                }
                break;
            default:
                ((di4) obj).D0.e(true);
                break;
        }
    }

    public kk0(di4 di4Var) {
        this.b = di4Var;
    }
}
