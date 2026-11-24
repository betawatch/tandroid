// default package

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class oe implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hd b;
    public final /* synthetic */ Context c;

    public /* synthetic */ oe(hd hdVar, Context context) {
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

    public /* synthetic */ oe(hd hdVar, Context context, byte b) {
        this.a = b;
        this.b = hdVar;
        this.c = context;
    }
}
