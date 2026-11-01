package org.telegram.messenger;

import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class zs implements ws, vs {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ zs(vs vsVar, Object obj, int i10) {
        this.a = i10;
        this.c = vsVar;
        this.b = obj;
    }

    @Override // org.telegram.messenger.ws
    public void a() {
        ((xa.n) this.b).a();
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        switch (this.a) {
            case 0:
                vs vsVar = (vs) ((WeakReference) this.c).get();
                if (vsVar == null) {
                    f8.d("MEMORY_LEAK observer " + i10 + " with destroyed WeakReference");
                    a();
                    break;
                } else {
                    vsVar.didReceivedNotification(i10, i11, objArr);
                    break;
                }
            case 1:
                if (i10 == 274) {
                    ((org.telegram.ui.ActionBar.x1) this.b).dismiss();
                    at.e().n(this, i10);
                    i0.h3(new org.telegram.ui.yy(this, 13), 100L);
                    break;
                }
                break;
            default:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.c;
                if (i10 == 306) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    int[] iArr = (int[]) objArr[2];
                    if (intValue == 5000) {
                        at.e().n(this, at.d5);
                        if (iArr[0] != 0) {
                            z0Var.y((org.telegram.ui.web.x0) this.b, "scan_qr_popup_closed", new JSONObject());
                            break;
                        } else {
                            Activity activity = z0Var.W;
                            if (activity != null) {
                                z0Var.g0 = org.telegram.ui.u9.j0(activity, 3, new l2.f(z0Var, 21));
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    public zs(at atVar, vs vsVar) {
        this.a = 0;
        this.b = new xa.n(atVar, this);
        this.c = new WeakReference(vsVar);
    }
}
