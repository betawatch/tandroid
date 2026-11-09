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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class pc1 implements org.telegram.ui.ActionBar.r1, sw {
    public final /* synthetic */ qc1 a;

    public /* synthetic */ pc1(qc1 qc1Var) {
        this.a = qc1Var;
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean N(yw ywVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        org.telegram.ui.ActionBar.y4 y4Var;
        org.telegram.ui.ActionBar.y4 y4Var2;
        ?? r17;
        int i10;
        qc1 qc1Var = this.a;
        WallpapersListActivity wallpapersListActivity = qc1Var.a;
        Activity parentActivity = wallpapersListActivity.getParentActivity();
        LongSparseArray longSparseArray = wallpapersListActivity.e0;
        org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, parentActivity, null);
        wallpapersListActivity.L = u1Var2;
        boolean z9 = false;
        u1Var2.i0 = false;
        u1Var2.show();
        new ArrayList();
        int[] iArr = new int[1];
        iArr[0] = 0;
        int i11 = 0;
        while (i11 < longSparseArray.size()) {
            Object valueAt = longSparseArray.valueAt(i11);
            if (valueAt instanceof sc1) {
                sc1 sc1Var = (sc1) valueAt;
                TLRPC.WallPaper wallPaper = sc1Var.l;
                if (wallPaper == null || wallPaper.id >= 0) {
                    r17 = z9;
                    valueAt = wallPaper;
                } else {
                    org.telegram.messenger.yr messagesStorage = wallpapersListActivity.getMessagesStorage();
                    r17 = z9;
                    messagesStorage.a.c(new org.telegram.messenger.xp(messagesStorage, sc1Var.l.id, 1));
                    wallpapersListActivity.b0.remove(sc1Var);
                    wallpapersListActivity.Z.remove(sc1Var.a());
                }
            } else {
                r17 = z9;
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
                    wallpapersListActivity.O = org.telegram.ui.ActionBar.l6.g1() ? "t" : "d";
                    org.telegram.ui.ActionBar.l6.I.v(null);
                    org.telegram.ui.ActionBar.l6.u1(true);
                }
                i10 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(savewallpaper, new o41(6, qc1Var, iArr));
            }
            i11++;
            z9 = r17;
        }
        if (iArr[z9 ? 1 : 0] == 0) {
            wallpapersListActivity.G0(true);
        }
        longSparseArray.clear();
        y4Var = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).simpleActionBar;
        y4Var.s();
        y4Var2 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).simpleActionBar;
        y4Var2.k(true);
    }

    @Override // org.telegram.ui.sw
    public boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, y91 y91Var) {
        LongSparseArray longSparseArray;
        org.telegram.ui.ActionBar.y4 y4Var;
        org.telegram.ui.ActionBar.y4 y4Var2;
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
            longSparseArray = wallpapersListActivity.e0;
            if (i17 >= longSparseArray.size()) {
                break;
            }
            Object valueAt = longSparseArray.valueAt(i17);
            if (valueAt instanceof TLRPC.TL_wallPaper) {
                Typeface typeface = org.telegram.messenger.g0.a;
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) valueAt;
                b10 = "https://" + org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).U2 + "/bg/" + tL_wallPaper.slug;
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
                    StringBuilder j3 = rf.b.j(b10, "?mode=");
                    j3.append(sb3.toString());
                    b10 = j3.toString();
                }
            } else if (valueAt instanceof sc1) {
                b10 = ((sc1) valueAt).b();
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
        y4Var = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).simpleActionBar;
        y4Var.s();
        y4Var2 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).simpleActionBar;
        y4Var2.k(true);
        if (arrayList.size() <= 1) {
            long j10 = ((org.telegram.messenger.xr) arrayList.get(0)).a;
            i13 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).currentAccount;
            if (j10 != org.telegram.messenger.p10.i(i13).e() && charSequence == null) {
                long j11 = ((org.telegram.messenger.xr) arrayList.get(0)).a;
                Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                if (org.telegram.messenger.m5.C(j11)) {
                    k10.putInt("enc_id", (int) (4294967295L & j11));
                } else {
                    if (org.telegram.messenger.m5.E(j11)) {
                        k10.putLong("user_id", j11);
                    } else if (org.telegram.messenger.m5.z(j11)) {
                        k10.putLong("chat_id", -j11);
                    }
                    i14 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).currentAccount;
                    if (!org.telegram.messenger.qp.s1(i14).E(k10, ywVar, null, null)) {
                        return true;
                    }
                }
                i15 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).currentAccount;
                org.telegram.messenger.qs.f(i15).k(org.telegram.messenger.qs.t, new Object[0]);
                wallpapersListActivity.presentFragment(new cn(k10), true);
                i16 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).currentAccount;
                org.telegram.messenger.gz.C(i16).r0(org.telegram.messenger.ez.b(sb2.toString(), j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
                return true;
            }
        }
        wallpapersListActivity.I0();
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            long j12 = ((org.telegram.messenger.xr) arrayList.get(i18)).a;
            if (charSequence != null) {
                i12 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).currentAccount;
                org.telegram.messenger.gz.C(i12).r0(org.telegram.messenger.ez.b(charSequence.toString(), j12, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            if (!TextUtils.isEmpty(sb2)) {
                i11 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).currentAccount;
                org.telegram.messenger.gz.C(i11).r0(org.telegram.messenger.ez.b(sb2.toString(), j12, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
        }
        ywVar.finishFragment();
        return true;
    }
}
