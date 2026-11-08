package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class cw extends nq0 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ ww b;

    public cw(ww wwVar, boolean[] zArr) {
        this.b = wwVar;
        this.a = zArr;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final CharSequence C(int i7) {
        ww wwVar = this.b;
        if (i7 < 0 || i7 >= wwVar.D2.size() || !((org.telegram.messenger.gf) wwVar.D2.get(i7)).b) {
            return ww.w2(wwVar);
        }
        return null;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void D() {
        int i7;
        ww wwVar = this.b;
        org.telegram.ui.Components.po0 po0Var = wwVar.G2;
        if (po0Var != null) {
            i7 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
            po0Var.i(i7, wwVar.D2);
        }
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final wq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        ww wwVar = this.b;
        org.telegram.ui.Components.po0 po0Var = wwVar.G2;
        org.telegram.ui.Components.l9 f10 = po0Var != null ? po0Var.f(i7) : null;
        if (f10 == null) {
            return null;
        }
        int[] iArr = new int[2];
        f10.getLocationInWindow(iArr);
        wq0 wq0Var = new wq0();
        wq0Var.b = iArr[0];
        wq0Var.c = iArr[1];
        wq0Var.d = wwVar.G2;
        ImageReceiver imageReceiver = f10.getImageReceiver();
        wq0Var.a = imageReceiver;
        wq0Var.e = imageReceiver.p();
        wq0Var.k = f10.getScaleX();
        wq0Var.h = new int[]{org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f)};
        return wq0Var;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final int H() {
        ArrayList arrayList = this.b.D2;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final boolean I() {
        return this.b.x3();
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final long a() {
        ww wwVar = this.b;
        if (wwVar.I2.isEmpty()) {
            return 0L;
        }
        return ((Long) wwVar.I2.get(0)).longValue();
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final boolean b() {
        ww wwVar = this.b;
        if (wwVar.I2.isEmpty()) {
            return false;
        }
        ArrayList arrayList = wwVar.I2;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            long longValue = ((Long) obj).longValue();
            if (org.telegram.messenger.m5.C(longValue) || wwVar.getMessagesController().N1(longValue) > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final CharSequence c0(int i7) {
        ww wwVar = this.b;
        ArrayList arrayList = wwVar.D2;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = wwVar.D2.size();
        if (size == 1) {
            return org.telegram.messenger.id.M0(((org.telegram.messenger.gf) wwVar.D2.get(0)).b ? 2131753933 : 2131753948, null);
        }
        ArrayList arrayList2 = wwVar.D2;
        int size2 = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size2) {
            Object obj = arrayList2.get(i12);
            i12++;
            if (((org.telegram.messenger.gf) obj).b) {
                i10++;
            } else {
                i11++;
            }
        }
        return i10 == 0 ? org.telegram.messenger.id.G(size, "ShareSendPhotos", new Object[0]) : i11 == 0 ? org.telegram.messenger.id.G(size, "ShareSendVideos", new Object[0]) : org.telegram.messenger.id.G(size, "ShareSendItems", new Object[0]);
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void e(CharSequence charSequence) {
        ww wwVar = this.b;
        jv jvVar = wwVar.B1;
        if (jvVar != null) {
            jvVar.setFieldText(charSequence);
        }
        ArrayList arrayList = wwVar.D2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((org.telegram.messenger.gf) obj).a = charSequence;
            }
        }
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final boolean h() {
        TLRPC.User a22;
        ww wwVar = this.b;
        if (wwVar.I2.isEmpty()) {
            return false;
        }
        org.telegram.messenger.qp messagesController = wwVar.getMessagesController();
        ArrayList arrayList = wwVar.I2;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            Long l10 = (Long) obj;
            if (!org.telegram.messenger.m5.E(l10.longValue()) || (a22 = messagesController.a2(l10)) == null || a22.bot || org.telegram.messenger.t10.B(a22)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final org.telegram.messenger.jc j(int i7) {
        org.telegram.ui.Components.po0 po0Var = this.b.G2;
        org.telegram.ui.Components.l9 f10 = po0Var != null ? po0Var.f(i7) : null;
        if (f10 != null) {
            return f10.getImageReceiver().p();
        }
        return null;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        int i12;
        ArrayList arrayList;
        ww wwVar = this.b;
        ArrayList arrayList2 = wwVar.I2;
        if (wwVar.B1 != null && (arrayList = wwVar.D2) != null && !arrayList.isEmpty()) {
            org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) wwVar.D2.get(0);
            jv jvVar = wwVar.B1;
            CharSequence charSequence = gfVar.a;
            if (charSequence == null) {
                charSequence = "";
            }
            jvVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.po0 po0Var = wwVar.G2;
        if (po0Var != null) {
            i12 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
            po0Var.i(i12, wwVar.D2);
        }
        if ((z9 && i10 == 0 && !z10) || wwVar.C2 == null || arrayList2.isEmpty()) {
            PhotoViewer.p1().z0(true, false);
            return;
        }
        wwVar.J2 = z9;
        wwVar.K2 = i10;
        wwVar.M2 = z10;
        ArrayList arrayList3 = new ArrayList();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            arrayList3.add(org.telegram.messenger.xr.a(((Long) arrayList2.get(i13)).longValue(), 0L));
        }
        PhotoViewer.p1().z0(true, false);
        wwVar.C2.y(wwVar, arrayList3, wwVar.B1.getFieldText(), false, z9, i10, i11, null);
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void s() {
        jv jvVar;
        org.telegram.ui.Components.uc a12;
        PhotoViewer p12 = PhotoViewer.p1();
        CharSequence charSequence = null;
        if (p12.P1() && (a12 = p12.a1()) != null) {
            charSequence = a12.getText();
        }
        ww wwVar = this.b;
        if (charSequence != null && (jvVar = wwVar.B1) != null) {
            jvVar.setFieldText(charSequence);
        }
        ArrayList arrayList = wwVar.D2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((org.telegram.messenger.gf) obj).a = charSequence;
            }
        }
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final boolean x(int i7) {
        return this.a[i7];
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final int k(int i7, org.telegram.messenger.j20 j20Var) {
        return i7;
    }
}
