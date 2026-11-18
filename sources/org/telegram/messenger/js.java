package org.telegram.messenger;

import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class js implements gs, fs {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ js(fs fsVar, Object obj, int i7) {
        this.a = i7;
        this.c = fsVar;
        this.b = obj;
    }

    @Override // org.telegram.messenger.gs
    public void b() {
        ((xi.e) this.b).b();
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        switch (this.a) {
            case 0:
                fs fsVar = (fs) ((WeakReference) this.c).get();
                if (fsVar == null) {
                    a8.d("MEMORY_LEAK observer " + i7 + " with destroyed WeakReference");
                    b();
                    break;
                } else {
                    fsVar.didReceivedNotification(i7, i10, objArr);
                    break;
                }
            case 1:
                if (i7 == 276) {
                    ((org.telegram.ui.ActionBar.u1) this.b).dismiss();
                    ks.e().n(this, i7);
                    g0.h3(new org.telegram.ui.lz(this, 13), 100L);
                    break;
                }
                break;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.c;
                if (i7 == 308) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    int[] iArr = (int[]) objArr[2];
                    if (intValue == 5000) {
                        ks.e().n(this, ks.f5);
                        if (iArr[0] != 0) {
                            v0Var.x((fi.f7) this.b, "scan_qr_popup_closed", new JSONObject());
                            break;
                        } else {
                            Activity activity = v0Var.a0;
                            if (activity != null) {
                                v0Var.h0 = org.telegram.ui.t9.j0(activity, 3, new org.telegram.ui.Cells.b5(v0Var));
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    public js(ks ksVar, fs fsVar) {
        this.a = 0;
        this.b = new xi.e(ksVar, this);
        this.c = new WeakReference(fsVar);
    }
}
