// default package

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ne implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hd b;
    public final /* synthetic */ Context c;

    public /* synthetic */ ne(hd hdVar, Context context) {
        this.a = (byte) 2;
        this.c = context;
        this.b = hdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hd hdVar = this.b;
        Context context = this.c;
        switch (b) {
            case 0:
                if (hdVar != null) {
                    hdVar.dismiss();
                }
                d01.t(context, k96.M0(2131752883, null));
                break;
            case 1:
                if (hdVar != null) {
                    hdVar.dismiss();
                }
                d01.t(context, k96.M0(2131752883, null));
                break;
            default:
                if (!((Activity) context).isFinishing()) {
                    try {
                        hdVar.dismiss();
                        break;
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                }
                break;
        }
    }

    public /* synthetic */ ne(hd hdVar, Context context, byte b) {
        this.a = b;
        this.b = hdVar;
        this.c = context;
    }
}
