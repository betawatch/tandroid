// default package

import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class fu0 implements gk7, hk7 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public fu0(kk7 kk7Var, gk7 gk7Var) {
        this.a = (byte) 2;
        this.b = new wtc(kk7Var, this);
        this.c = new WeakReference(gk7Var);
    }

    @Override // hk7
    public final void a() {
        ((wtc) this.b).a();
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                if (i == 309) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    int[] iArr = (int[]) objArr[2];
                    if (intValue == 5000) {
                        kk7.e().n(this, kk7.f5);
                        hv0 hv0Var = (hv0) obj2;
                        if (iArr[0] != 0) {
                            hv0Var.u((ev0) obj, "scan_qr_popup_closed", new JSONObject());
                            break;
                        } else {
                            Activity activity = hv0Var.a0;
                            if (activity != null) {
                                hv0Var.h0 = da1.i0(activity, 3, new l69(hv0Var, (byte) 12));
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                if (i == 277) {
                    ((hd) obj).dismiss();
                    kk7.e().n(this, i);
                    gl.e3(new tp5(this, (byte) 1), 100L);
                    break;
                }
                break;
            default:
                gk7 gk7Var = (gk7) ((WeakReference) obj2).get();
                if (gk7Var == null) {
                    fa4.d("MEMORY_LEAK observer " + i + " with destroyed WeakReference");
                    a();
                    break;
                } else {
                    gk7Var.didReceivedNotification(i, i2, objArr);
                    break;
                }
        }
    }

    public /* synthetic */ fu0(gk7 gk7Var, Object obj, byte b) {
        this.a = b;
        this.c = gk7Var;
        this.b = obj;
    }
}
