package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class gr0 extends xr0 {
    public final org.telegram.messenger.lc a;
    public final /* synthetic */ ds0 b;
    public final /* synthetic */ org.telegram.messenger.kj c;
    public final /* synthetic */ org.telegram.messenger.ff d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ PhotoViewer g;

    public gr0(PhotoViewer photoViewer, ds0 ds0Var, org.telegram.messenger.kj kjVar, org.telegram.messenger.ff ffVar, boolean z10, boolean z11) {
        this.g = photoViewer;
        this.b = ds0Var;
        this.c = kjVar;
        this.d = ffVar;
        this.e = z10;
        this.f = z11;
        this.a = photoViewer.C4.p();
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final fs0 E(org.telegram.messenger.kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ds0 ds0Var = this.b;
        if (ds0Var != null) {
            return ds0Var.E(this.c, null, 0, z10, false);
        }
        return null;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final void M(org.telegram.messenger.y20 y20Var) {
        org.telegram.messenger.ff ffVar = this.d;
        if (ffVar.w || ffVar.v || ffVar.u || y20Var != null || !TextUtils.isEmpty(ffVar.a)) {
            d0(y20Var, false, 0, true, false);
        }
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final org.telegram.messenger.kj V() {
        return this.c;
    }

    public final void d0(org.telegram.messenger.y20 y20Var, boolean z10, int i10, boolean z11, boolean z12) {
        PhotoViewer photoViewer = this.g;
        if (photoViewer.l4 != null) {
            kn knVar = null;
            org.telegram.messenger.kj kjVar = this.c;
            org.telegram.messenger.kj kjVar2 = z11 ? kjVar : null;
            org.telegram.messenger.ff ffVar = this.d;
            if (kjVar2 != null && !TextUtils.isEmpty(ffVar.a)) {
                kjVar2.w1 = ffVar.a;
                kjVar2.x1 = ffVar.n;
            }
            if (z11 || kjVar == null) {
                un unVar = photoViewer.l4;
                kjVar = unVar.D5;
                knVar = unVar.B5;
            }
            kn knVar2 = knVar;
            org.telegram.messenger.kj kjVar3 = kjVar;
            if (!ffVar.b) {
                org.telegram.messenger.kj kjVar4 = kjVar2;
                if (ffVar.h != null) {
                    org.telegram.messenger.c accountInstance = photoViewer.l4.getAccountInstance();
                    String str = ffVar.h;
                    String str2 = ffVar.c;
                    long a2 = photoViewer.l4.a();
                    un unVar2 = photoViewer.l4;
                    org.telegram.messenger.rz.Z(accountInstance, str, str2, null, a2, kjVar3, unVar2.l4, knVar2, ffVar.n, ffVar.r, null, ffVar.x, kjVar4, y20Var, z10, i10, z12, ffVar.a, unVar2.T8(), 0L, 0L, photoViewer.l4.e9(), photoViewer.l4.w5);
                    return;
                }
                if (ffVar.I != null) {
                    org.telegram.messenger.c accountInstance2 = photoViewer.l4.getAccountInstance();
                    String str3 = ffVar.I;
                    String str4 = ffVar.c;
                    long a10 = photoViewer.l4.a();
                    un unVar3 = photoViewer.l4;
                    org.telegram.messenger.rz.Z(accountInstance2, str3, str4, null, a10, kjVar3, unVar3.l4, knVar2, ffVar.n, ffVar.r, null, ffVar.x, kjVar4, y20Var, z10, i10, z12, ffVar.a, unVar3.T8(), 0L, 0L, photoViewer.l4.e9(), photoViewer.l4.w5);
                    return;
                }
                return;
            }
            if (y20Var != null) {
                org.telegram.messenger.c accountInstance3 = photoViewer.l4.getAccountInstance();
                String str5 = ffVar.I;
                long a11 = photoViewer.l4.a();
                un unVar4 = photoViewer.l4;
                org.telegram.messenger.kj kjVar5 = unVar4.l4;
                ArrayList arrayList = ffVar.n;
                org.telegram.messenger.kj kjVar6 = kjVar2;
                org.telegram.messenger.rz.b0(ffVar.x, i10, 0, a11, 0L, 0L, photoViewer.l4.e9(), ffVar.a, str5, null, arrayList, accountInstance3, kjVar3, kjVar5, kjVar6, photoViewer.l4.w5, unVar4.T8(), y20Var, null, null, knVar2, z10, z12, ffVar.M);
                return;
            }
            org.telegram.messenger.kj kjVar7 = kjVar2;
            org.telegram.messenger.c accountInstance4 = photoViewer.l4.getAccountInstance();
            String str6 = ffVar.I;
            long a12 = photoViewer.l4.a();
            un unVar5 = photoViewer.l4;
            org.telegram.messenger.kj kjVar8 = unVar5.l4;
            ArrayList arrayList2 = ffVar.n;
            org.telegram.messenger.rz.b0(ffVar.x, i10, 0, a12, 0L, 0L, photoViewer.l4.e9(), ffVar.a, str6, null, arrayList2, accountInstance4, kjVar3, kjVar8, kjVar7, photoViewer.l4.w5, unVar5.T8(), null, null, null, knVar2, z10, z12, ffVar.M);
        }
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final org.telegram.messenger.lc j(int i10) {
        return this.a;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final void o(int i10, org.telegram.messenger.y20 y20Var, boolean z10, int i11, int i12, boolean z11) {
        d0(y20Var, z10, i11, false, z11);
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final boolean p() {
        return this.b != null && this.e;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final boolean r() {
        return this.b != null && this.f;
    }
}
