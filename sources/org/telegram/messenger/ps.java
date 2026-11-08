package org.telegram.messenger;

import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class ps implements ms, ls {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ ps(ls lsVar, Object obj, int i7) {
        this.a = i7;
        this.c = lsVar;
        this.b = obj;
    }

    @Override // org.telegram.messenger.ms
    public void b() {
        ((ab.b0) this.b).b();
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        switch (this.a) {
            case 0:
                ls lsVar = (ls) ((WeakReference) this.c).get();
                if (lsVar == null) {
                    a8.d("MEMORY_LEAK observer " + i7 + " with destroyed WeakReference");
                    b();
                    break;
                } else {
                    lsVar.didReceivedNotification(i7, i10, objArr);
                    break;
                }
            case 1:
                if (i7 == 274) {
                    ((org.telegram.ui.ActionBar.u1) this.b).dismiss();
                    qs.e().n(this, i7);
                    g0.i3(new org.telegram.ui.hz(this, 13), 100L);
                    break;
                }
                break;
            default:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.c;
                if (i7 == 306) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    int[] iArr = (int[]) objArr[2];
                    if (intValue == 5000) {
                        qs.e().n(this, qs.d5);
                        if (iArr[0] != 0) {
                            x0Var.x((di.o7) this.b, "scan_qr_popup_closed", new JSONObject());
                            break;
                        } else {
                            Activity activity = x0Var.W;
                            if (activity != null) {
                                x0Var.g0 = org.telegram.ui.s9.j0(activity, 3, new org.telegram.ui.Components.n(x0Var));
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    public ps(qs qsVar, ls lsVar) {
        this.a = 0;
        this.b = new ab.b0(qsVar, this);
        this.c = new WeakReference(lsVar);
    }
}
