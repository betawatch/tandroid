package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ew extends pq0 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ yw b;

    public ew(yw ywVar, boolean[] zArr) {
        this.b = ywVar;
        this.a = zArr;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final CharSequence C(int i7) {
        yw ywVar = this.b;
        if (i7 < 0 || i7 >= ywVar.E2.size() || !((org.telegram.messenger.gf) ywVar.E2.get(i7)).b) {
            return yw.w2(ywVar);
        }
        return null;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final void D() {
        int i7;
        yw ywVar = this.b;
        org.telegram.ui.Components.qo0 qo0Var = ywVar.H2;
        if (qo0Var != null) {
            i7 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
            qo0Var.i(i7, ywVar.E2);
        }
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final yq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        yw ywVar = this.b;
        org.telegram.ui.Components.qo0 qo0Var = ywVar.H2;
        org.telegram.ui.Components.l9 f10 = qo0Var != null ? qo0Var.f(i7) : null;
        if (f10 == null) {
            return null;
        }
        int[] iArr = new int[2];
        f10.getLocationInWindow(iArr);
        yq0 yq0Var = new yq0();
        yq0Var.b = iArr[0];
        yq0Var.c = iArr[1];
        yq0Var.d = ywVar.H2;
        ImageReceiver imageReceiver = f10.getImageReceiver();
        yq0Var.a = imageReceiver;
        yq0Var.e = imageReceiver.p();
        yq0Var.k = f10.getScaleX();
        yq0Var.h = new int[]{org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f)};
        return yq0Var;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final int H() {
        ArrayList arrayList = this.b.E2;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final boolean I() {
        return this.b.x3();
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final long a() {
        yw ywVar = this.b;
        if (ywVar.J2.isEmpty()) {
            return 0L;
        }
        return ((Long) ywVar.J2.get(0)).longValue();
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final boolean b() {
        yw ywVar = this.b;
        if (ywVar.J2.isEmpty()) {
            return false;
        }
        ArrayList arrayList = ywVar.J2;
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

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final CharSequence c0(int i7) {
        yw ywVar = this.b;
        ArrayList arrayList = ywVar.E2;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = ywVar.E2.size();
        if (size == 1) {
            return org.telegram.messenger.id.M0(((org.telegram.messenger.gf) ywVar.E2.get(0)).b ? 2131753933 : 2131753948, null);
        }
        ArrayList arrayList2 = ywVar.E2;
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

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final void e(CharSequence charSequence) {
        yw ywVar = this.b;
        lv lvVar = ywVar.C1;
        if (lvVar != null) {
            lvVar.setFieldText(charSequence);
        }
        ArrayList arrayList = ywVar.E2;
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

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final boolean h() {
        TLRPC.User a22;
        yw ywVar = this.b;
        if (ywVar.J2.isEmpty()) {
            return false;
        }
        org.telegram.messenger.qp messagesController = ywVar.getMessagesController();
        ArrayList arrayList = ywVar.J2;
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

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final org.telegram.messenger.jc j(int i7) {
        org.telegram.ui.Components.qo0 qo0Var = this.b.H2;
        org.telegram.ui.Components.l9 f10 = qo0Var != null ? qo0Var.f(i7) : null;
        if (f10 != null) {
            return f10.getImageReceiver().p();
        }
        return null;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        int i12;
        ArrayList arrayList;
        yw ywVar = this.b;
        ArrayList arrayList2 = ywVar.J2;
        if (ywVar.C1 != null && (arrayList = ywVar.E2) != null && !arrayList.isEmpty()) {
            org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) ywVar.E2.get(0);
            lv lvVar = ywVar.C1;
            CharSequence charSequence = gfVar.a;
            if (charSequence == null) {
                charSequence = "";
            }
            lvVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.qo0 qo0Var = ywVar.H2;
        if (qo0Var != null) {
            i12 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
            qo0Var.i(i12, ywVar.E2);
        }
        if ((z9 && i10 == 0 && !z10) || ywVar.D2 == null || arrayList2.isEmpty()) {
            PhotoViewer.p1().z0(true, false);
            return;
        }
        ywVar.K2 = z9;
        ywVar.L2 = i10;
        ywVar.N2 = z10;
        ArrayList arrayList3 = new ArrayList();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            arrayList3.add(org.telegram.messenger.xr.a(((Long) arrayList2.get(i13)).longValue(), 0L));
        }
        PhotoViewer.p1().z0(true, false);
        ywVar.D2.y(ywVar, arrayList3, ywVar.C1.getFieldText(), false, z9, i10, i11, null);
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final void s() {
        lv lvVar;
        org.telegram.ui.Components.uc a12;
        PhotoViewer p12 = PhotoViewer.p1();
        CharSequence charSequence = null;
        if (p12.P1() && (a12 = p12.a1()) != null) {
            charSequence = a12.getText();
        }
        yw ywVar = this.b;
        if (charSequence != null && (lvVar = ywVar.C1) != null) {
            lvVar.setFieldText(charSequence);
        }
        ArrayList arrayList = ywVar.E2;
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

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final boolean x(int i7) {
        return this.a[i7];
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final int k(int i7, org.telegram.messenger.j20 j20Var) {
        return i7;
    }
}
