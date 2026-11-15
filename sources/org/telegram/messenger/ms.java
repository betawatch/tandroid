package org.telegram.messenger;

import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class ms implements js, is {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ ms(is isVar, Object obj, int i7) {
        this.a = i7;
        this.c = isVar;
        this.b = obj;
    }

    @Override // org.telegram.messenger.js
    public void b() {
        ((xi.e) this.b).b();
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        switch (this.a) {
            case 0:
                is isVar = (is) ((WeakReference) this.c).get();
                if (isVar == null) {
                    a8.d("MEMORY_LEAK observer " + i7 + " with destroyed WeakReference");
                    b();
                    break;
                } else {
                    isVar.didReceivedNotification(i7, i10, objArr);
                    break;
                }
            case 1:
                if (i7 == 274) {
                    ((org.telegram.ui.ActionBar.t1) this.b).dismiss();
                    ns.e().n(this, i7);
                    g0.i3(new org.telegram.ui.iz(this, 13), 100L);
                    break;
                }
                break;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.c;
                if (i7 == 306) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    int[] iArr = (int[]) objArr[2];
                    if (intValue == 5000) {
                        ns.e().n(this, ns.d5);
                        if (iArr[0] != 0) {
                            v0Var.x((fi.i7) this.b, "scan_qr_popup_closed", new JSONObject());
                            break;
                        } else {
                            Activity activity = v0Var.a0;
                            if (activity != null) {
                                v0Var.h0 = org.telegram.ui.t9.j0(activity, 3, new org.telegram.ui.Components.cf(v0Var));
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    public ms(ns nsVar, is isVar) {
        this.a = 0;
        this.b = new xi.e(nsVar, this);
        this.c = new WeakReference(isVar);
    }
}
