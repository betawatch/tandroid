package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class fm0 extends lu0 {
    public final /* synthetic */ gn0 a;

    public fm0(gn0 gn0Var) {
        this.a = gn0Var;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final void B(int i10) {
        gn0 gn0Var = this.a;
        int i11 = gn0Var.S0;
        SecureDocument secureDocument = i11 == 1 ? gn0Var.j1 : i11 == 4 ? (SecureDocument) gn0Var.k1.get(i10) : i11 == 2 ? gn0Var.l1 : i11 == 3 ? gn0Var.m1 : (SecureDocument) gn0Var.i1.get(i10);
        en0 en0Var = (en0) gn0Var.n1.remove(secureDocument);
        if (en0Var == null) {
            return;
        }
        String n12 = gn0.n1(secureDocument);
        int i12 = gn0Var.S0;
        String str = null;
        if (i12 == 1) {
            gn0Var.j1 = null;
            str = v7.j.g("selfie", n12);
        } else if (i12 == 4) {
            str = v7.j.g("translation", n12);
        } else if (i12 == 2) {
            gn0Var.l1 = null;
            str = v7.j.g("front", n12);
        } else if (i12 == 3) {
            gn0Var.m1 = null;
            str = v7.j.g("reverse", n12);
        } else if (i12 == 0) {
            str = v7.j.g("files", n12);
        }
        if (str != null) {
            HashMap hashMap = gn0Var.x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = gn0Var.y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        gn0Var.S1(gn0Var.S0);
        gn0Var.i0.removeView(en0Var);
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 < 0) {
            return null;
        }
        gn0 gn0Var = this.a;
        if (i10 >= gn0Var.i0.getChildCount()) {
            return null;
        }
        en0 en0Var = (en0) gn0Var.i0.getChildAt(i10);
        int[] iArr = new int[2];
        en0Var.c.getLocationInWindow(iArr);
        vu0 vu0Var = new vu0();
        vu0Var.b = iArr[0];
        vu0Var.c = iArr[1];
        vu0Var.d = gn0Var.i0;
        ImageReceiver imageReceiver = en0Var.c.getImageReceiver();
        vu0Var.a = imageReceiver;
        vu0Var.e = imageReceiver.getBitmapSafe();
        return vu0Var;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final String a0() {
        return this.a.S0 == 1 ? LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]) : LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
