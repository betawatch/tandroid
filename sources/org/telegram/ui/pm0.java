package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class pm0 extends vu0 {
    public final /* synthetic */ qn0 a;

    public pm0(qn0 qn0Var) {
        this.a = qn0Var;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final void B(int i10) {
        qn0 qn0Var = this.a;
        int i11 = qn0Var.S0;
        SecureDocument secureDocument = i11 == 1 ? qn0Var.j1 : i11 == 4 ? (SecureDocument) qn0Var.k1.get(i10) : i11 == 2 ? qn0Var.l1 : i11 == 3 ? qn0Var.m1 : (SecureDocument) qn0Var.i1.get(i10);
        on0 on0Var = (on0) qn0Var.n1.remove(secureDocument);
        if (on0Var == null) {
            return;
        }
        String n12 = qn0.n1(secureDocument);
        int i12 = qn0Var.S0;
        String str = null;
        if (i12 == 1) {
            qn0Var.j1 = null;
            str = org.telegram.ui.Cells.p6.i("selfie", n12);
        } else if (i12 == 4) {
            str = org.telegram.ui.Cells.p6.i("translation", n12);
        } else if (i12 == 2) {
            qn0Var.l1 = null;
            str = org.telegram.ui.Cells.p6.i("front", n12);
        } else if (i12 == 3) {
            qn0Var.m1 = null;
            str = org.telegram.ui.Cells.p6.i("reverse", n12);
        } else if (i12 == 0) {
            str = org.telegram.ui.Cells.p6.i("files", n12);
        }
        if (str != null) {
            HashMap hashMap = qn0Var.x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = qn0Var.y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        qn0Var.S1(qn0Var.S0);
        qn0Var.i0.removeView(on0Var);
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final fv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 < 0) {
            return null;
        }
        qn0 qn0Var = this.a;
        if (i10 >= qn0Var.i0.getChildCount()) {
            return null;
        }
        on0 on0Var = (on0) qn0Var.i0.getChildAt(i10);
        int[] iArr = new int[2];
        on0Var.c.getLocationInWindow(iArr);
        fv0 fv0Var = new fv0();
        fv0Var.b = iArr[0];
        fv0Var.c = iArr[1];
        fv0Var.d = qn0Var.i0;
        ImageReceiver imageReceiver = on0Var.c.getImageReceiver();
        fv0Var.a = imageReceiver;
        fv0Var.e = imageReceiver.getBitmapSafe();
        return fv0Var;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final String a0() {
        return this.a.S0 == 1 ? LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]) : LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
