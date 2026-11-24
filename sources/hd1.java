// default package

import android.database.ContentObserver;
import android.os.Handler;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class hd1 extends ContentObserver {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hd1(Handler handler, byte b) {
        super(handler);
        this.a = b;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        byte b = 1;
        switch (this.a) {
            case 0:
                fo.C(fo.g());
                break;
            case 1:
                super.onChange(z);
                Runnable runnable = MediaController.Z1;
                if (runnable != null) {
                    gl.r(runnable);
                }
                am6 am6Var = new am6((byte) 0);
                MediaController.Z1 = am6Var;
                gl.d3(am6Var, 2000L);
                break;
            case 2:
                super.onChange(z);
                Runnable runnable2 = MediaController.Z1;
                if (runnable2 != null) {
                    gl.r(runnable2);
                }
                vl6 vl6Var = new vl6(this, b);
                MediaController.Z1 = vl6Var;
                gl.d3(vl6Var, 2000L);
                break;
            default:
                qhf.e.set(true);
                break;
        }
    }
}
