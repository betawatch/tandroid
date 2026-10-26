package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class hm0 extends gu0 {
    public final /* synthetic */ in0 a;

    public hm0(in0 in0Var) {
        this.a = in0Var;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
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
            str = org.telegram.ui.Components.b10.j("selfie", n12);
        } else if (i12 == 4) {
            str = org.telegram.ui.Components.b10.j("translation", n12);
        } else if (i12 == 2) {
            in0Var.l1 = null;
            str = org.telegram.ui.Components.b10.j("front", n12);
        } else if (i12 == 3) {
            in0Var.m1 = null;
            str = org.telegram.ui.Components.b10.j("reverse", n12);
        } else if (i12 == 0) {
            str = org.telegram.ui.Components.b10.j("files", n12);
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
        in0Var.T1(in0Var.S0);
        in0Var.i0.removeView(gn0Var);
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
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
        qu0 qu0Var = new qu0();
        qu0Var.b = iArr[0];
        qu0Var.c = iArr[1];
        qu0Var.d = in0Var.i0;
        ImageReceiver imageReceiver = gn0Var.c.getImageReceiver();
        qu0Var.a = imageReceiver;
        qu0Var.e = imageReceiver.getBitmapSafe();
        return qu0Var;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final String b0() {
        return this.a.S0 == 1 ? LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]) : LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
