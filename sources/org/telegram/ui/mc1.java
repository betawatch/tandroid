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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class mc1 implements org.telegram.ui.ActionBar.q1, vw {
    public final /* synthetic */ nc1 a;

    public /* synthetic */ mc1(nc1 nc1Var) {
        this.a = nc1Var;
    }

    @Override // org.telegram.ui.vw
    public /* synthetic */ boolean F() {
        return false;
    }

    @Override // org.telegram.ui.vw
    public /* synthetic */ boolean O(bx bxVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        ?? r17;
        int i10;
        nc1 nc1Var = this.a;
        WallpapersListActivity wallpapersListActivity = nc1Var.a;
        Activity parentActivity = wallpapersListActivity.getParentActivity();
        LongSparseArray longSparseArray = wallpapersListActivity.f0;
        org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, parentActivity, null);
        wallpapersListActivity.M = t1Var2;
        boolean z10 = false;
        t1Var2.j0 = false;
        t1Var2.show();
        new ArrayList();
        int[] iArr = new int[1];
        iArr[0] = 0;
        int i11 = 0;
        while (i11 < longSparseArray.size()) {
            Object valueAt = longSparseArray.valueAt(i11);
            if (valueAt instanceof pc1) {
                pc1 pc1Var = (pc1) valueAt;
                TLRPC.WallPaper wallPaper = pc1Var.l;
                if (wallPaper == null || wallPaper.id >= 0) {
                    r17 = z10;
                    valueAt = wallPaper;
                } else {
                    org.telegram.messenger.tr messagesStorage = wallpapersListActivity.getMessagesStorage();
                    r17 = z10;
                    messagesStorage.a.c(new org.telegram.messenger.pp(messagesStorage, pc1Var.l.id, 1));
                    wallpapersListActivity.c0.remove(pc1Var);
                    wallpapersListActivity.a0.remove(pc1Var.a());
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
                if (str != null && str.equals(wallpapersListActivity.P)) {
                    wallpapersListActivity.P = org.telegram.ui.ActionBar.n6.g1() ? "t" : "d";
                    org.telegram.ui.ActionBar.n6.I.v(null);
                    org.telegram.ui.ActionBar.n6.u1(true);
                }
                i10 = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(savewallpaper, new d31(8, nc1Var, iArr));
            }
            i11++;
            z10 = r17;
        }
        if (iArr[z10 ? 1 : 0] == 0) {
            wallpapersListActivity.G0(true);
        }
        longSparseArray.clear();
        z4Var = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).simpleActionBar;
        z4Var.w();
        z4Var2 = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).simpleActionBar;
        z4Var2.o(true);
    }

    @Override // org.telegram.ui.vw
    public boolean z(bx bxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, w91 w91Var) {
        LongSparseArray longSparseArray;
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        String b10;
        WallpapersListActivity wallpapersListActivity = this.a.a;
        StringBuilder sb2 = new StringBuilder();
        int i17 = 0;
        while (true) {
            longSparseArray = wallpapersListActivity.f0;
            if (i17 >= longSparseArray.size()) {
                break;
            }
            Object valueAt = longSparseArray.valueAt(i17);
            if (valueAt instanceof TLRPC.TL_wallPaper) {
                Typeface typeface = org.telegram.messenger.g0.a;
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) valueAt;
                b10 = "https://" + org.telegram.messenger.mp.u1(org.telegram.messenger.i10.t0).X2 + "/bg/" + tL_wallPaper.slug;
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
                    StringBuilder n10 = p5.c.n(b10, "?mode=");
                    n10.append(sb3.toString());
                    b10 = n10.toString();
                }
            } else if (valueAt instanceof pc1) {
                b10 = ((pc1) valueAt).b();
            } else {
                i17++;
            }
            if (!TextUtils.isEmpty(b10)) {
                if (sb2.length() > 0) {
                    sb2.append('\n');
                }
                sb2.append(b10);
            }
            i17++;
        }
        longSparseArray.clear();
        z4Var = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).simpleActionBar;
        z4Var.w();
        z4Var2 = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).simpleActionBar;
        z4Var2.o(true);
        if (arrayList.size() <= 1) {
            long j3 = ((org.telegram.messenger.sr) arrayList.get(0)).a;
            i13 = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).currentAccount;
            if (j3 != org.telegram.messenger.i10.i(i13).e() && charSequence == null) {
                long j10 = ((org.telegram.messenger.sr) arrayList.get(0)).a;
                Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                if (org.telegram.messenger.n5.C(j10)) {
                    k10.putInt("enc_id", (int) (4294967295L & j10));
                } else {
                    if (org.telegram.messenger.n5.E(j10)) {
                        k10.putLong("user_id", j10);
                    } else if (org.telegram.messenger.n5.z(j10)) {
                        k10.putLong("chat_id", -j10);
                    }
                    i14 = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).currentAccount;
                    if (!org.telegram.messenger.mp.u1(i14).E(k10, bxVar, null, null)) {
                        return true;
                    }
                }
                i15 = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).currentAccount;
                org.telegram.messenger.ks.f(i15).k(org.telegram.messenger.ks.t, new Object[0]);
                wallpapersListActivity.presentFragment(new bn(k10), true);
                i16 = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).currentAccount;
                org.telegram.messenger.zy.C(i16).r0(org.telegram.messenger.xy.b(sb2.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                return true;
            }
        }
        wallpapersListActivity.I0();
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            long j11 = ((org.telegram.messenger.sr) arrayList.get(i18)).a;
            if (charSequence != null) {
                i12 = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).currentAccount;
                org.telegram.messenger.zy.C(i12).r0(org.telegram.messenger.xy.b(charSequence.toString(), j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            if (!TextUtils.isEmpty(sb2)) {
                i11 = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).currentAccount;
                org.telegram.messenger.zy.C(i11).r0(org.telegram.messenger.xy.b(sb2.toString(), j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
        }
        bxVar.finishFragment();
        return true;
    }
}
