package org.telegram.messenger;

import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class ys implements vs, us {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ ys(us usVar, Object obj, int i10) {
        this.a = i10;
        this.c = usVar;
        this.b = obj;
    }

    @Override // org.telegram.messenger.vs
    public void a() {
        ((xa.n) this.b).a();
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        switch (this.a) {
            case 0:
                us usVar = (us) ((WeakReference) this.c).get();
                if (usVar == null) {
                    f8.d("MEMORY_LEAK observer " + i10 + " with destroyed WeakReference");
                    a();
                    break;
                } else {
                    usVar.didReceivedNotification(i10, i11, objArr);
                    break;
                }
            case 1:
                if (i10 == 274) {
                    ((org.telegram.ui.ActionBar.x1) this.b).dismiss();
                    zs.e().n(this, i10);
                    i0.h3(new org.telegram.ui.zy(this, 13), 100L);
                    break;
                }
                break;
            default:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.c;
                if (i10 == 306) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    int[] iArr = (int[]) objArr[2];
                    if (intValue == 5000) {
                        zs.e().n(this, zs.d5);
                        if (iArr[0] != 0) {
                            z0Var.y((org.telegram.ui.web.x0) this.b, "scan_qr_popup_closed", new JSONObject());
                            break;
                        } else {
                            Activity activity = z0Var.W;
                            if (activity != null) {
                                z0Var.g0 = org.telegram.ui.u9.i0(activity, 3, new l2.f(z0Var, 21));
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    public ys(zs zsVar, us usVar) {
        this.a = 0;
        this.b = new xa.n(zsVar, this);
        this.c = new WeakReference(usVar);
    }
}
