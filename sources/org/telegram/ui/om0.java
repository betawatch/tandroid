package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class om0 extends su0 {
    public final /* synthetic */ pn0 a;

    public om0(pn0 pn0Var) {
        this.a = pn0Var;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void B(int i10) {
        pn0 pn0Var = this.a;
        int i11 = pn0Var.S0;
        SecureDocument secureDocument = i11 == 1 ? pn0Var.j1 : i11 == 4 ? (SecureDocument) pn0Var.k1.get(i10) : i11 == 2 ? pn0Var.l1 : i11 == 3 ? pn0Var.m1 : (SecureDocument) pn0Var.i1.get(i10);
        nn0 nn0Var = (nn0) pn0Var.n1.remove(secureDocument);
        if (nn0Var == null) {
            return;
        }
        String n12 = pn0.n1(secureDocument);
        int i12 = pn0Var.S0;
        String str = null;
        if (i12 == 1) {
            pn0Var.j1 = null;
            str = org.telegram.ui.Cells.p6.i("selfie", n12);
        } else if (i12 == 4) {
            str = org.telegram.ui.Cells.p6.i("translation", n12);
        } else if (i12 == 2) {
            pn0Var.l1 = null;
            str = org.telegram.ui.Cells.p6.i("front", n12);
        } else if (i12 == 3) {
            pn0Var.m1 = null;
            str = org.telegram.ui.Cells.p6.i("reverse", n12);
        } else if (i12 == 0) {
            str = org.telegram.ui.Cells.p6.i("files", n12);
        }
        if (str != null) {
            HashMap hashMap = pn0Var.x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = pn0Var.y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        pn0Var.S1(pn0Var.S0);
        pn0Var.i0.removeView(nn0Var);
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 < 0) {
            return null;
        }
        pn0 pn0Var = this.a;
        if (i10 >= pn0Var.i0.getChildCount()) {
            return null;
        }
        nn0 nn0Var = (nn0) pn0Var.i0.getChildAt(i10);
        int[] iArr = new int[2];
        nn0Var.c.getLocationInWindow(iArr);
        cv0 cv0Var = new cv0();
        cv0Var.b = iArr[0];
        cv0Var.c = iArr[1];
        cv0Var.d = pn0Var.i0;
        ImageReceiver imageReceiver = nn0Var.c.getImageReceiver();
        cv0Var.a = imageReceiver;
        cv0Var.e = imageReceiver.getBitmapSafe();
        return cv0Var;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final String a0() {
        return this.a.S0 == 1 ? LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]) : LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
