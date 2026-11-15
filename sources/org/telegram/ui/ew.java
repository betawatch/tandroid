package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ew extends mq0 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ yw b;

    public ew(yw ywVar, boolean[] zArr) {
        this.b = ywVar;
        this.a = zArr;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final CharSequence C(int i7) {
        yw ywVar = this.b;
        if (i7 < 0 || i7 >= ywVar.F2.size() || !((org.telegram.messenger.ff) ywVar.F2.get(i7)).b) {
            return yw.w2(ywVar);
        }
        return null;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void D() {
        int i7;
        yw ywVar = this.b;
        org.telegram.ui.Components.to0 to0Var = ywVar.I2;
        if (to0Var != null) {
            i7 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
            to0Var.i(i7, ywVar.F2);
        }
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        yw ywVar = this.b;
        org.telegram.ui.Components.to0 to0Var = ywVar.I2;
        org.telegram.ui.Components.i9 f10 = to0Var != null ? to0Var.f(i7) : null;
        if (f10 == null) {
            return null;
        }
        int[] iArr = new int[2];
        f10.getLocationInWindow(iArr);
        uq0 uq0Var = new uq0();
        uq0Var.b = iArr[0];
        uq0Var.c = iArr[1];
        uq0Var.d = ywVar.I2;
        ImageReceiver imageReceiver = f10.getImageReceiver();
        uq0Var.a = imageReceiver;
        uq0Var.e = imageReceiver.p();
        uq0Var.k = f10.getScaleX();
        uq0Var.h = new int[]{org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f)};
        return uq0Var;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final int H() {
        ArrayList arrayList = this.b.F2;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean I() {
        return this.b.x3();
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final long a() {
        yw ywVar = this.b;
        if (ywVar.K2.isEmpty()) {
            return 0L;
        }
        return ((Long) ywVar.K2.get(0)).longValue();
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean b() {
        yw ywVar = this.b;
        if (ywVar.K2.isEmpty()) {
            return false;
        }
        ArrayList arrayList = ywVar.K2;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            long longValue = ((Long) obj).longValue();
            if (org.telegram.messenger.m5.C(longValue) || ywVar.getMessagesController().N1(longValue) > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final CharSequence c0(int i7) {
        yw ywVar = this.b;
        ArrayList arrayList = ywVar.F2;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = ywVar.F2.size();
        if (size == 1) {
            return org.telegram.messenger.hd.M0(((org.telegram.messenger.ff) ywVar.F2.get(0)).b ? 2131753933 : 2131753948, null);
        }
        ArrayList arrayList2 = ywVar.F2;
        int size2 = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size2) {
            Object obj = arrayList2.get(i12);
            i12++;
            if (((org.telegram.messenger.ff) obj).b) {
                i10++;
            } else {
                i11++;
            }
        }
        return i10 == 0 ? org.telegram.messenger.hd.G(size, "ShareSendPhotos", new Object[0]) : i11 == 0 ? org.telegram.messenger.hd.G(size, "ShareSendVideos", new Object[0]) : org.telegram.messenger.hd.G(size, "ShareSendItems", new Object[0]);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void e(CharSequence charSequence) {
        yw ywVar = this.b;
        kv kvVar = ywVar.D1;
        if (kvVar != null) {
            kvVar.setFieldText(charSequence);
        }
        ArrayList arrayList = ywVar.F2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((org.telegram.messenger.ff) obj).a = charSequence;
            }
        }
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean h() {
        TLRPC.User a22;
        yw ywVar = this.b;
        if (ywVar.K2.isEmpty()) {
            return false;
        }
        org.telegram.messenger.np messagesController = ywVar.getMessagesController();
        ArrayList arrayList = ywVar.K2;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            Long l10 = (Long) obj;
            if (!org.telegram.messenger.m5.E(l10.longValue()) || (a22 = messagesController.a2(l10)) == null || a22.bot || org.telegram.messenger.q10.B(a22)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final org.telegram.messenger.ic j(int i7) {
        org.telegram.ui.Components.to0 to0Var = this.b.I2;
        org.telegram.ui.Components.i9 f10 = to0Var != null ? to0Var.f(i7) : null;
        if (f10 != null) {
            return f10.getImageReceiver().p();
        }
        return null;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void o(int i7, org.telegram.messenger.g20 g20Var, boolean z10, int i10, int i11, boolean z11) {
        int i12;
        ArrayList arrayList;
        yw ywVar = this.b;
        ArrayList arrayList2 = ywVar.K2;
        if (ywVar.D1 != null && (arrayList = ywVar.F2) != null && !arrayList.isEmpty()) {
            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) ywVar.F2.get(0);
            kv kvVar = ywVar.D1;
            CharSequence charSequence = ffVar.a;
            if (charSequence == null) {
                charSequence = "";
            }
            kvVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.to0 to0Var = ywVar.I2;
        if (to0Var != null) {
            i12 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
            to0Var.i(i12, ywVar.F2);
        }
        if ((z10 && i10 == 0 && !z11) || ywVar.E2 == null || arrayList2.isEmpty()) {
            PhotoViewer.p1().z0(true, false);
            return;
        }
        ywVar.L2 = z10;
        ywVar.M2 = i10;
        ywVar.O2 = z11;
        ArrayList arrayList3 = new ArrayList();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            arrayList3.add(org.telegram.messenger.ur.a(((Long) arrayList2.get(i13)).longValue(), 0L));
        }
        PhotoViewer.p1().z0(true, false);
        ywVar.E2.y(ywVar, arrayList3, ywVar.D1.getFieldText(), false, z10, i10, i11, null);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void s() {
        kv kvVar;
        org.telegram.ui.Components.pc b12;
        PhotoViewer p12 = PhotoViewer.p1();
        CharSequence charSequence = null;
        if (p12.P1() && (b12 = p12.b1()) != null) {
            charSequence = b12.getText();
        }
        yw ywVar = this.b;
        if (charSequence != null && (kvVar = ywVar.D1) != null) {
            kvVar.setFieldText(charSequence);
        }
        ArrayList arrayList = ywVar.F2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((org.telegram.messenger.ff) obj).a = charSequence;
            }
        }
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean x(int i7) {
        return this.a[i7];
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final int k(int i7, org.telegram.messenger.g20 g20Var) {
        return i7;
    }
}
