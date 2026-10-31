package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ir0 extends yr0 {
    public final org.telegram.messenger.kc a;
    public final /* synthetic */ es0 b;
    public final /* synthetic */ org.telegram.messenger.jj c;
    public final /* synthetic */ org.telegram.messenger.ef d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ PhotoViewer g;

    public ir0(PhotoViewer photoViewer, es0 es0Var, org.telegram.messenger.jj jjVar, org.telegram.messenger.ef efVar, boolean z10, boolean z11) {
        this.g = photoViewer;
        this.b = es0Var;
        this.c = jjVar;
        this.d = efVar;
        this.e = z10;
        this.f = z11;
        this.a = photoViewer.C4.p();
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final gs0 E(org.telegram.messenger.jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        es0 es0Var = this.b;
        if (es0Var != null) {
            return es0Var.E(this.c, null, 0, z10, false);
        }
        return null;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void M(org.telegram.messenger.x20 x20Var) {
        org.telegram.messenger.ef efVar = this.d;
        if (efVar.w || efVar.v || efVar.u || x20Var != null || !TextUtils.isEmpty(efVar.a)) {
            d0(x20Var, false, 0, true, false);
        }
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final org.telegram.messenger.jj V() {
        return this.c;
    }

    public final void d0(org.telegram.messenger.x20 x20Var, boolean z10, int i10, boolean z11, boolean z12) {
        PhotoViewer photoViewer = this.g;
        if (photoViewer.l4 != null) {
            kn knVar = null;
            org.telegram.messenger.jj jjVar = this.c;
            org.telegram.messenger.jj jjVar2 = z11 ? jjVar : null;
            org.telegram.messenger.ef efVar = this.d;
            if (jjVar2 != null && !TextUtils.isEmpty(efVar.a)) {
                jjVar2.w1 = efVar.a;
                jjVar2.x1 = efVar.n;
            }
            if (z11 || jjVar == null) {
                un unVar = photoViewer.l4;
                jjVar = unVar.D5;
                knVar = unVar.B5;
            }
            kn knVar2 = knVar;
            org.telegram.messenger.jj jjVar3 = jjVar;
            if (!efVar.b) {
                org.telegram.messenger.jj jjVar4 = jjVar2;
                if (efVar.h != null) {
                    org.telegram.messenger.c accountInstance = photoViewer.l4.getAccountInstance();
                    String str = efVar.h;
                    String str2 = efVar.c;
                    long a2 = photoViewer.l4.a();
                    un unVar2 = photoViewer.l4;
                    org.telegram.messenger.qz.Z(accountInstance, str, str2, null, a2, jjVar3, unVar2.l4, knVar2, efVar.n, efVar.r, null, efVar.x, jjVar4, x20Var, z10, i10, z12, efVar.a, unVar2.P8(), 0L, 0L, photoViewer.l4.a9(), photoViewer.l4.w5);
                    return;
                }
                if (efVar.I != null) {
                    org.telegram.messenger.c accountInstance2 = photoViewer.l4.getAccountInstance();
                    String str3 = efVar.I;
                    String str4 = efVar.c;
                    long a10 = photoViewer.l4.a();
                    un unVar3 = photoViewer.l4;
                    org.telegram.messenger.qz.Z(accountInstance2, str3, str4, null, a10, jjVar3, unVar3.l4, knVar2, efVar.n, efVar.r, null, efVar.x, jjVar4, x20Var, z10, i10, z12, efVar.a, unVar3.P8(), 0L, 0L, photoViewer.l4.a9(), photoViewer.l4.w5);
                    return;
                }
                return;
            }
            if (x20Var != null) {
                org.telegram.messenger.c accountInstance3 = photoViewer.l4.getAccountInstance();
                String str5 = efVar.I;
                long a11 = photoViewer.l4.a();
                un unVar4 = photoViewer.l4;
                org.telegram.messenger.jj jjVar5 = unVar4.l4;
                ArrayList arrayList = efVar.n;
                org.telegram.messenger.jj jjVar6 = jjVar2;
                org.telegram.messenger.qz.b0(efVar.x, i10, 0, a11, 0L, 0L, photoViewer.l4.a9(), efVar.a, str5, null, arrayList, accountInstance3, jjVar3, jjVar5, jjVar6, photoViewer.l4.w5, unVar4.P8(), x20Var, null, null, knVar2, z10, z12, efVar.M);
                return;
            }
            org.telegram.messenger.jj jjVar7 = jjVar2;
            org.telegram.messenger.c accountInstance4 = photoViewer.l4.getAccountInstance();
            String str6 = efVar.I;
            long a12 = photoViewer.l4.a();
            un unVar5 = photoViewer.l4;
            org.telegram.messenger.jj jjVar8 = unVar5.l4;
            ArrayList arrayList2 = efVar.n;
            org.telegram.messenger.qz.b0(efVar.x, i10, 0, a12, 0L, 0L, photoViewer.l4.a9(), efVar.a, str6, null, arrayList2, accountInstance4, jjVar3, jjVar8, jjVar7, photoViewer.l4.w5, unVar5.P8(), null, null, null, knVar2, z10, z12, efVar.M);
        }
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final org.telegram.messenger.kc j(int i10) {
        return this.a;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void o(int i10, org.telegram.messenger.x20 x20Var, boolean z10, int i11, int i12, boolean z11) {
        d0(x20Var, z10, i11, false, z11);
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean p() {
        return this.b != null && this.e;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean r() {
        return this.b != null && this.f;
    }
}
