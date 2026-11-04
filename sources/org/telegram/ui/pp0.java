package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class pp0 extends eq0 {
    public final org.telegram.messenger.cc a;
    public final /* synthetic */ kq0 b;
    public final /* synthetic */ org.telegram.messenger.zi c;
    public final /* synthetic */ org.telegram.messenger.ye d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ PhotoViewer g;

    public pp0(PhotoViewer photoViewer, kq0 kq0Var, org.telegram.messenger.zi ziVar, org.telegram.messenger.ye yeVar, boolean z10, boolean z11) {
        this.g = photoViewer;
        this.b = kq0Var;
        this.c = ziVar;
        this.d = yeVar;
        this.e = z10;
        this.f = z11;
        this.a = photoViewer.D4.p();
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final mq0 E(org.telegram.messenger.zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        kq0 kq0Var = this.b;
        if (kq0Var != null) {
            return kq0Var.E(this.c, null, 0, z10, false);
        }
        return null;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void M(org.telegram.messenger.b20 b20Var) {
        org.telegram.messenger.ye yeVar = this.d;
        if (yeVar.w || yeVar.v || yeVar.u || b20Var != null || !TextUtils.isEmpty(yeVar.a)) {
            d0(b20Var, false, 0, true, false);
        }
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final org.telegram.messenger.zi V() {
        return this.c;
    }

    public final void d0(org.telegram.messenger.b20 b20Var, boolean z10, int i3, boolean z11, boolean z12) {
        PhotoViewer photoViewer = this.g;
        if (photoViewer.m4 != null) {
            mm mmVar = null;
            org.telegram.messenger.zi ziVar = this.c;
            org.telegram.messenger.zi ziVar2 = z11 ? ziVar : null;
            org.telegram.messenger.ye yeVar = this.d;
            if (ziVar2 != null && !TextUtils.isEmpty(yeVar.a)) {
                ziVar2.w1 = yeVar.a;
                ziVar2.x1 = yeVar.n;
            }
            if (z11 || ziVar == null) {
                wm wmVar = photoViewer.m4;
                ziVar = wmVar.E5;
                mmVar = wmVar.C5;
            }
            mm mmVar2 = mmVar;
            org.telegram.messenger.zi ziVar3 = ziVar;
            if (!yeVar.b) {
                org.telegram.messenger.zi ziVar4 = ziVar2;
                if (yeVar.h != null) {
                    org.telegram.messenger.c accountInstance = photoViewer.m4.getAccountInstance();
                    String str = yeVar.h;
                    String str2 = yeVar.c;
                    long a10 = photoViewer.m4.a();
                    wm wmVar2 = photoViewer.m4;
                    org.telegram.messenger.yy.Z(accountInstance, str, str2, null, a10, ziVar3, wmVar2.m4, mmVar2, yeVar.n, yeVar.r, null, yeVar.x, ziVar4, b20Var, z10, i3, z12, yeVar.a, wmVar2.W8(), 0L, 0L, photoViewer.m4.h9(), photoViewer.m4.x5);
                    return;
                }
                if (yeVar.I != null) {
                    org.telegram.messenger.c accountInstance2 = photoViewer.m4.getAccountInstance();
                    String str3 = yeVar.I;
                    String str4 = yeVar.c;
                    long a11 = photoViewer.m4.a();
                    wm wmVar3 = photoViewer.m4;
                    org.telegram.messenger.yy.Z(accountInstance2, str3, str4, null, a11, ziVar3, wmVar3.m4, mmVar2, yeVar.n, yeVar.r, null, yeVar.x, ziVar4, b20Var, z10, i3, z12, yeVar.a, wmVar3.W8(), 0L, 0L, photoViewer.m4.h9(), photoViewer.m4.x5);
                    return;
                }
                return;
            }
            if (b20Var != null) {
                org.telegram.messenger.c accountInstance3 = photoViewer.m4.getAccountInstance();
                String str5 = yeVar.I;
                long a12 = photoViewer.m4.a();
                wm wmVar4 = photoViewer.m4;
                org.telegram.messenger.zi ziVar5 = wmVar4.m4;
                ArrayList arrayList = yeVar.n;
                org.telegram.messenger.zi ziVar6 = ziVar2;
                org.telegram.messenger.yy.b0(yeVar.x, i3, 0, a12, 0L, 0L, photoViewer.m4.h9(), yeVar.a, str5, null, arrayList, accountInstance3, ziVar3, ziVar5, ziVar6, photoViewer.m4.x5, wmVar4.W8(), b20Var, null, null, mmVar2, z10, z12, yeVar.M);
                return;
            }
            org.telegram.messenger.zi ziVar7 = ziVar2;
            org.telegram.messenger.c accountInstance4 = photoViewer.m4.getAccountInstance();
            String str6 = yeVar.I;
            long a13 = photoViewer.m4.a();
            wm wmVar5 = photoViewer.m4;
            org.telegram.messenger.zi ziVar8 = wmVar5.m4;
            ArrayList arrayList2 = yeVar.n;
            org.telegram.messenger.yy.b0(yeVar.x, i3, 0, a13, 0L, 0L, photoViewer.m4.h9(), yeVar.a, str6, null, arrayList2, accountInstance4, ziVar3, ziVar8, ziVar7, photoViewer.m4.x5, wmVar5.W8(), null, null, null, mmVar2, z10, z12, yeVar.M);
        }
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final org.telegram.messenger.cc j(int i3) {
        return this.a;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void o(int i3, org.telegram.messenger.b20 b20Var, boolean z10, int i10, int i11, boolean z11) {
        d0(b20Var, z10, i10, false, z11);
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean p() {
        return this.b != null && this.e;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean r() {
        return this.b != null && this.f;
    }
}
