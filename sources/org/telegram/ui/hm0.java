package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class hm0 extends mu0 {
    public final /* synthetic */ in0 a;

    public hm0(in0 in0Var) {
        this.a = in0Var;
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final void B(int i10) {
        in0 in0Var = this.a;
        int i11 = in0Var.S0;
        SecureDocument secureDocument = i11 == 1 ? in0Var.j1 : i11 == 4 ? (SecureDocument) in0Var.k1.get(i10) : i11 == 2 ? in0Var.l1 : i11 == 3 ? in0Var.m1 : (SecureDocument) in0Var.i1.get(i10);
        gn0 gn0Var = (gn0) in0Var.n1.remove(secureDocument);
        if (gn0Var == null) {
            return;
        }
        String n12 = in0.n1(secureDocument);
        int i12 = in0Var.S0;
        String str = null;
        if (i12 == 1) {
            in0Var.j1 = null;
            str = org.telegram.ui.Cells.q3.i("selfie", n12);
        } else if (i12 == 4) {
            str = org.telegram.ui.Cells.q3.i("translation", n12);
        } else if (i12 == 2) {
            in0Var.l1 = null;
            str = org.telegram.ui.Cells.q3.i("front", n12);
        } else if (i12 == 3) {
            in0Var.m1 = null;
            str = org.telegram.ui.Cells.q3.i("reverse", n12);
        } else if (i12 == 0) {
            str = org.telegram.ui.Cells.q3.i("files", n12);
        }
        if (str != null) {
            HashMap hashMap = in0Var.x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = in0Var.y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        in0Var.S1(in0Var.S0);
        in0Var.i0.removeView(gn0Var);
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final wu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 < 0) {
            return null;
        }
        in0 in0Var = this.a;
        if (i10 >= in0Var.i0.getChildCount()) {
            return null;
        }
        gn0 gn0Var = (gn0) in0Var.i0.getChildAt(i10);
        int[] iArr = new int[2];
        gn0Var.c.getLocationInWindow(iArr);
        wu0 wu0Var = new wu0();
        wu0Var.b = iArr[0];
        wu0Var.c = iArr[1];
        wu0Var.d = in0Var.i0;
        ImageReceiver imageReceiver = gn0Var.c.getImageReceiver();
        wu0Var.a = imageReceiver;
        wu0Var.e = imageReceiver.getBitmapSafe();
        return wu0Var;
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final String a0() {
        return this.a.S0 == 1 ? LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]) : LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
