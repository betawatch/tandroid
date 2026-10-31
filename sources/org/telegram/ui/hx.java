package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hx extends yr0 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ ay b;

    public hx(ay ayVar, boolean[] zArr) {
        this.b = ayVar;
        this.a = zArr;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final CharSequence C(int i10) {
        ay ayVar = this.b;
        if (i10 < 0 || i10 >= ayVar.D2.size() || !((org.telegram.messenger.ef) ayVar.D2.get(i10)).b) {
            return ay.v2(ayVar);
        }
        return null;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void D() {
        int i10;
        ay ayVar = this.b;
        org.telegram.ui.Components.sp0 sp0Var = ayVar.G2;
        if (sp0Var != null) {
            i10 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
            sp0Var.i(i10, ayVar.D2);
        }
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final gs0 E(org.telegram.messenger.jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ay ayVar = this.b;
        org.telegram.ui.Components.sp0 sp0Var = ayVar.G2;
        org.telegram.ui.Components.g9 f7 = sp0Var != null ? sp0Var.f(i10) : null;
        if (f7 == null) {
            return null;
        }
        int[] iArr = new int[2];
        f7.getLocationInWindow(iArr);
        gs0 gs0Var = new gs0();
        gs0Var.b = iArr[0];
        gs0Var.c = iArr[1];
        gs0Var.d = ayVar.G2;
        ImageReceiver imageReceiver = f7.getImageReceiver();
        gs0Var.a = imageReceiver;
        gs0Var.e = imageReceiver.p();
        gs0Var.k = f7.getScaleX();
        gs0Var.h = new int[]{org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f)};
        return gs0Var;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final int H() {
        ArrayList arrayList = this.b.D2;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean I() {
        return this.b.w3();
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final long a() {
        ay ayVar = this.b;
        if (ayVar.I2.isEmpty()) {
            return 0L;
        }
        return ((Long) ayVar.I2.get(0)).longValue();
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean b() {
        ay ayVar = this.b;
        if (ayVar.I2.isEmpty()) {
            return false;
        }
        ArrayList arrayList = ayVar.I2;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            long longValue = ((Long) obj).longValue();
            if (org.telegram.messenger.o5.C(longValue) || ayVar.getMessagesController().M1(longValue) > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final CharSequence c0(int i10) {
        ay ayVar = this.b;
        ArrayList arrayList = ayVar.D2;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = ayVar.D2.size();
        if (size == 1) {
            return org.telegram.messenger.cd.L0(((org.telegram.messenger.ef) ayVar.D2.get(0)).b ? 2131753933 : 2131753948, null);
        }
        ArrayList arrayList2 = ayVar.D2;
        int size2 = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i13 < size2) {
            Object obj = arrayList2.get(i13);
            i13++;
            if (((org.telegram.messenger.ef) obj).b) {
                i11++;
            } else {
                i12++;
            }
        }
        return i11 == 0 ? org.telegram.messenger.cd.G(size, "ShareSendPhotos", new Object[0]) : i12 == 0 ? org.telegram.messenger.cd.G(size, "ShareSendVideos", new Object[0]) : org.telegram.messenger.cd.G(size, "ShareSendItems", new Object[0]);
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void e(CharSequence charSequence) {
        ay ayVar = this.b;
        ow owVar = ayVar.B1;
        if (owVar != null) {
            owVar.setFieldText(charSequence);
        }
        ArrayList arrayList = ayVar.D2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((org.telegram.messenger.ef) obj).a = charSequence;
            }
        }
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean h() {
        TLRPC.User Z1;
        ay ayVar = this.b;
        if (ayVar.I2.isEmpty()) {
            return false;
        }
        org.telegram.messenger.vp messagesController = ayVar.getMessagesController();
        ArrayList arrayList = ayVar.I2;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Long l4 = (Long) obj;
            if (!org.telegram.messenger.o5.E(l4.longValue()) || (Z1 = messagesController.Z1(l4)) == null || Z1.bot || org.telegram.messenger.h20.B(Z1)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final org.telegram.messenger.kc j(int i10) {
        org.telegram.ui.Components.sp0 sp0Var = this.b.G2;
        org.telegram.ui.Components.g9 f7 = sp0Var != null ? sp0Var.f(i10) : null;
        if (f7 != null) {
            return f7.getImageReceiver().p();
        }
        return null;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void o(int i10, org.telegram.messenger.x20 x20Var, boolean z10, int i11, int i12, boolean z11) {
        int i13;
        ArrayList arrayList;
        ay ayVar = this.b;
        ArrayList arrayList2 = ayVar.I2;
        if (ayVar.B1 != null && (arrayList = ayVar.D2) != null && !arrayList.isEmpty()) {
            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) ayVar.D2.get(0);
            ow owVar = ayVar.B1;
            CharSequence charSequence = efVar.a;
            if (charSequence == null) {
                charSequence = "";
            }
            owVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.sp0 sp0Var = ayVar.G2;
        if (sp0Var != null) {
            i13 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
            sp0Var.i(i13, ayVar.D2);
        }
        if ((z10 && i11 == 0 && !z11) || ayVar.C2 == null || arrayList2.isEmpty()) {
            PhotoViewer.v1().H0(true, false);
            return;
        }
        ayVar.J2 = z10;
        ayVar.K2 = i11;
        ayVar.M2 = z11;
        ArrayList arrayList3 = new ArrayList();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            arrayList3.add(org.telegram.messenger.gs.a(((Long) arrayList2.get(i14)).longValue(), 0L));
        }
        PhotoViewer.v1().H0(true, false);
        ayVar.C2.y(ayVar, arrayList3, ayVar.B1.getFieldText(), false, z10, i11, i12, null);
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void s() {
        ow owVar;
        org.telegram.ui.Components.nc h12;
        PhotoViewer v12 = PhotoViewer.v1();
        CharSequence charSequence = null;
        if (v12.U1() && (h12 = v12.h1()) != null) {
            charSequence = h12.getText();
        }
        ay ayVar = this.b;
        if (charSequence != null && (owVar = ayVar.B1) != null) {
            owVar.setFieldText(charSequence);
        }
        ArrayList arrayList = ayVar.D2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((org.telegram.messenger.ef) obj).a = charSequence;
            }
        }
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean x(int i10) {
        return this.a[i10];
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final int k(int i10, org.telegram.messenger.x20 x20Var) {
        return i10;
    }
}
