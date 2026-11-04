package org.telegram.messenger;

import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class gs implements ds, cs {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ gs(cs csVar, Object obj, int i3) {
        this.a = i3;
        this.c = csVar;
        this.b = obj;
    }

    @Override // org.telegram.messenger.ds
    public void a() {
        ((za.p) this.b).a();
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        switch (this.a) {
            case 0:
                cs csVar = (cs) ((WeakReference) this.c).get();
                if (csVar == null) {
                    a8.d("MEMORY_LEAK observer " + i3 + " with destroyed WeakReference");
                    a();
                    break;
                } else {
                    csVar.didReceivedNotification(i3, i10, objArr);
                    break;
                }
            case 1:
                if (i3 == 274) {
                    ((org.telegram.ui.ActionBar.s1) this.b).dismiss();
                    hs.e().n(this, i3);
                    g0.i3(new org.telegram.ui.fz(this, 12), 100L);
                    break;
                }
                break;
            default:
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) this.c;
                if (i3 == 306) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    int[] iArr = (int[]) objArr[2];
                    if (intValue == 5000) {
                        hs.e().n(this, hs.d5);
                        if (iArr[0] != 0) {
                            w0Var.x((ei.p7) this.b, "scan_qr_popup_closed", new JSONObject());
                            break;
                        } else {
                            Activity activity = w0Var.a0;
                            if (activity != null) {
                                w0Var.h0 = org.telegram.ui.s9.j0(activity, 3, new org.telegram.ui.Components.y00(w0Var));
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    public gs(hs hsVar, cs csVar) {
        this.a = 0;
        this.b = new za.p(hsVar, this);
        this.c = new WeakReference(csVar);
    }
}
