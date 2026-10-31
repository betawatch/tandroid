package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class je1 implements org.telegram.ui.ActionBar.u1, ux {
    public final /* synthetic */ ke1 a;

    public /* synthetic */ je1(ke1 ke1Var) {
        this.a = ke1Var;
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean N(ay ayVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        org.telegram.ui.ActionBar.i5 i5Var;
        org.telegram.ui.ActionBar.i5 i5Var2;
        ?? r17;
        int i11;
        ke1 ke1Var = this.a;
        WallpapersListActivity wallpapersListActivity = ke1Var.a;
        Activity parentActivity = wallpapersListActivity.getParentActivity();
        LongSparseArray longSparseArray = wallpapersListActivity.e0;
        org.telegram.ui.ActionBar.x1 x1Var2 = new org.telegram.ui.ActionBar.x1(3, parentActivity, null);
        wallpapersListActivity.L = x1Var2;
        boolean z10 = false;
        x1Var2.i0 = false;
        x1Var2.show();
        new ArrayList();
        int[] iArr = new int[1];
        iArr[0] = 0;
        int i12 = 0;
        while (i12 < longSparseArray.size()) {
            Object valueAt = longSparseArray.valueAt(i12);
            if (valueAt instanceof me1) {
                me1 me1Var = (me1) valueAt;
                TLRPC.WallPaper wallPaper = me1Var.l;
                if (wallPaper == null || wallPaper.id >= 0) {
                    r17 = z10;
                    valueAt = wallPaper;
                } else {
                    org.telegram.messenger.hs messagesStorage = wallpapersListActivity.getMessagesStorage();
                    r17 = z10;
                    messagesStorage.a.c(new org.telegram.messenger.cq(messagesStorage, me1Var.l.id, 1));
                    wallpapersListActivity.b0.remove(me1Var);
                    wallpapersListActivity.Z.remove(me1Var.a());
                }
            } else {
                r17 = z10;
            }
            if (valueAt instanceof TLRPC.WallPaper) {
                iArr[r17] = iArr[r17] + 1;
                TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) valueAt;
                TL_account.saveWallPaper savewallpaper = new TL_account.saveWallPaper();
                savewallpaper.settings = new TLRPC.TL_wallPaperSettings();
                savewallpaper.unsave = true;
                if (valueAt instanceof TLRPC.TL_wallPaperNoFile) {
                    TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile = new TLRPC.TL_inputWallPaperNoFile();
                    tL_inputWallPaperNoFile.id = wallPaper2.id;
                    savewallpaper.wallpaper = tL_inputWallPaperNoFile;
                } else {
                    TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
                    tL_inputWallPaper.id = wallPaper2.id;
                    tL_inputWallPaper.access_hash = wallPaper2.access_hash;
                    savewallpaper.wallpaper = tL_inputWallPaper;
                }
                String str = wallPaper2.slug;
                if (str != null && str.equals(wallpapersListActivity.O)) {
                    wallpapersListActivity.O = org.telegram.ui.ActionBar.t6.g1() ? "t" : "d";
                    org.telegram.ui.ActionBar.t6.I.v(null);
                    org.telegram.ui.ActionBar.t6.u1(true);
                }
                i11 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(savewallpaper, new ul0(20, ke1Var, iArr));
            }
            i12++;
            z10 = r17;
        }
        if (iArr[z10 ? 1 : 0] == 0) {
            wallpapersListActivity.F0(true);
        }
        longSparseArray.clear();
        i5Var = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).simpleActionBar;
        i5Var.r();
        i5Var2 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).simpleActionBar;
        i5Var2.j(true);
    }

    @Override // org.telegram.ui.ux
    public boolean y(ay ayVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, pb1 pb1Var) {
        LongSparseArray longSparseArray;
        org.telegram.ui.ActionBar.i5 i5Var;
        org.telegram.ui.ActionBar.i5 i5Var2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        String b10;
        WallpapersListActivity wallpapersListActivity = this.a.a;
        StringBuilder sb2 = new StringBuilder();
        int i18 = 0;
        while (true) {
            longSparseArray = wallpapersListActivity.e0;
            if (i18 >= longSparseArray.size()) {
                break;
            }
            Object valueAt = longSparseArray.valueAt(i18);
            if (valueAt instanceof TLRPC.TL_wallPaper) {
                Typeface typeface = org.telegram.messenger.i0.a;
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) valueAt;
                b10 = "https://" + org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).U2 + "/bg/" + tL_wallPaper.slug;
                StringBuilder sb3 = new StringBuilder();
                TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
                if (wallPaperSettings != null) {
                    if (wallPaperSettings.blur) {
                        sb3.append("blur");
                    }
                    if (tL_wallPaper.settings.motion) {
                        if (sb3.length() > 0) {
                            sb3.append("+");
                        }
                        sb3.append("motion");
                    }
                }
                if (sb3.length() > 0) {
                    StringBuilder i19 = sc.e.i(b10, "?mode=");
                    i19.append(sb3.toString());
                    b10 = i19.toString();
                }
            } else if (valueAt instanceof me1) {
                b10 = ((me1) valueAt).b();
            } else {
                i18++;
            }
            if (!TextUtils.isEmpty(b10)) {
                if (sb2.length() > 0) {
                    sb2.append('\n');
                }
                sb2.append(b10);
            }
            i18++;
        }
        longSparseArray.clear();
        i5Var = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).simpleActionBar;
        i5Var.r();
        i5Var2 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).simpleActionBar;
        i5Var2.j(true);
        if (arrayList.size() <= 1) {
            long j10 = ((org.telegram.messenger.gs) arrayList.get(0)).a;
            i14 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
            if (j10 != org.telegram.messenger.d20.i(i14).e() && charSequence == null) {
                long j11 = ((org.telegram.messenger.gs) arrayList.get(0)).a;
                Bundle g10 = a1.g.g("scrollToTopOnResume", true);
                if (org.telegram.messenger.o5.C(j11)) {
                    g10.putInt("enc_id", (int) (4294967295L & j11));
                } else {
                    if (org.telegram.messenger.o5.E(j11)) {
                        g10.putLong("user_id", j11);
                    } else if (org.telegram.messenger.o5.z(j11)) {
                        g10.putLong("chat_id", -j11);
                    }
                    i15 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
                    if (!org.telegram.messenger.vp.r1(i15).E(g10, ayVar, null, null)) {
                        return true;
                    }
                }
                i16 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
                org.telegram.messenger.zs.f(i16).k(org.telegram.messenger.zs.t, new Object[0]);
                wallpapersListActivity.presentFragment(new un(g10), true);
                i17 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
                org.telegram.messenger.qz.C(i17).r0(org.telegram.messenger.oz.b(sb2.toString(), j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
                return true;
            }
        }
        wallpapersListActivity.H0();
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            long j12 = ((org.telegram.messenger.gs) arrayList.get(i20)).a;
            if (charSequence != null) {
                i13 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
                org.telegram.messenger.qz.C(i13).r0(org.telegram.messenger.oz.b(charSequence.toString(), j12, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            if (!TextUtils.isEmpty(sb2)) {
                i12 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
                org.telegram.messenger.qz.C(i12).r0(org.telegram.messenger.oz.b(sb2.toString(), j12, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
        }
        ayVar.finishFragment();
        return true;
    }
}
