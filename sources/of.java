// default package

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class of implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ he b;
    public final /* synthetic */ Context c;

    public /* synthetic */ of(he heVar, Context context) {
        this.a = (byte) 2;
        this.c = context;
        this.b = heVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        he heVar = this.b;
        Context context = this.c;
        switch (b) {
            case 0:
                if (heVar != null) {
                    heVar.dismiss();
                }
                l11.u(context, jb6.M0(2131752848, null));
                break;
            case 1:
                if (heVar != null) {
                    heVar.dismiss();
                }
                l11.u(context, jb6.M0(2131752848, null));
                break;
            default:
                if (!((Activity) context).isFinishing()) {
                    try {
                        heVar.dismiss();
                        break;
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                }
                break;
        }
    }

    public /* synthetic */ of(he heVar, Context context, byte b) {
        this.a = b;
        this.b = heVar;
        this.c = context;
    }
}
