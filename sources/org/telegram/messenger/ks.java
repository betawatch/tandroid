package org.telegram.messenger;

import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class ks implements hs, gs {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ ks(gs gsVar, Object obj, int i7) {
        this.a = i7;
        this.c = gsVar;
        this.b = obj;
    }

    @Override // org.telegram.messenger.hs
    public void b() {
        ((xi.e) this.b).b();
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        switch (this.a) {
            case 0:
                gs gsVar = (gs) ((WeakReference) this.c).get();
                if (gsVar == null) {
                    a8.d("MEMORY_LEAK observer " + i7 + " with destroyed WeakReference");
                    b();
                    break;
                } else {
                    gsVar.didReceivedNotification(i7, i10, objArr);
                    break;
                }
            case 1:
                if (i7 == 277) {
                    ((org.telegram.ui.ActionBar.t1) this.b).dismiss();
                    ls.e().n(this, i7);
                    g0.h3(new org.telegram.ui.lz(this, 13), 100L);
                    break;
                }
                break;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.c;
                if (i7 == 309) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    int[] iArr = (int[]) objArr[2];
                    if (intValue == 5000) {
                        ls.e().n(this, ls.g5);
                        if (iArr[0] != 0) {
                            v0Var.x((fi.f7) this.b, "scan_qr_popup_closed", new JSONObject());
                            break;
                        } else {
                            Activity activity = v0Var.a0;
                            if (activity != null) {
                                v0Var.h0 = org.telegram.ui.t9.j0(activity, 3, new org.telegram.ui.Cells.c5(v0Var));
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    public ks(ls lsVar, gs gsVar) {
        this.a = 0;
        this.b = new xi.e(lsVar, this);
        this.c = new WeakReference(gsVar);
    }
}
