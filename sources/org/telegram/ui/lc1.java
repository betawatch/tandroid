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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class lc1 implements org.telegram.ui.ActionBar.q1, sw {
    public final /* synthetic */ mc1 a;

    public /* synthetic */ lc1(mc1 mc1Var) {
        this.a = mc1Var;
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean P(yw ywVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        org.telegram.ui.ActionBar.w4 w4Var;
        org.telegram.ui.ActionBar.w4 w4Var2;
        ?? r17;
        int i10;
        mc1 mc1Var = this.a;
        WallpapersListActivity wallpapersListActivity = mc1Var.a;
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
            if (valueAt instanceof oc1) {
                oc1 oc1Var = (oc1) valueAt;
                TLRPC.WallPaper wallPaper = oc1Var.l;
                if (wallPaper == null || wallPaper.id >= 0) {
                    r17 = z10;
                    valueAt = wallPaper;
                } else {
                    org.telegram.messenger.vr messagesStorage = wallpapersListActivity.getMessagesStorage();
                    r17 = z10;
                    messagesStorage.a.c(new org.telegram.messenger.rp(messagesStorage, oc1Var.l.id, 1));
                    wallpapersListActivity.c0.remove(oc1Var);
                    wallpapersListActivity.a0.remove(oc1Var.a());
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
                    wallpapersListActivity.P = org.telegram.ui.ActionBar.j6.g1() ? "t" : "d";
                    org.telegram.ui.ActionBar.j6.I.v(null);
                    org.telegram.ui.ActionBar.j6.u1(true);
                }
                i10 = ((org.telegram.ui.ActionBar.e2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(savewallpaper, new a31(8, mc1Var, iArr));
            }
            i11++;
            z10 = r17;
        }
        if (iArr[z10 ? 1 : 0] == 0) {
            wallpapersListActivity.G0(true);
        }
        longSparseArray.clear();
        w4Var = ((org.telegram.ui.ActionBar.e2) wallpapersListActivity).simpleActionBar;
        w4Var.u();
        w4Var2 = ((org.telegram.ui.ActionBar.e2) wallpapersListActivity).simpleActionBar;
        w4Var2.m(true);
    }

    @Override // org.telegram.ui.sw
    public boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, u91 u91Var) {
        LongSparseArray longSparseArray;
        org.telegram.ui.ActionBar.w4 w4Var;
        org.telegram.ui.ActionBar.w4 w4Var2;
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
                b10 = "https://" + org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).V2 + "/bg/" + tL_wallPaper.slug;
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
                    StringBuilder m10 = r.b.m(b10, "?mode=");
                    m10.append(sb3.toString());
                    b10 = m10.toString();
                }
            } else if (valueAt instanceof oc1) {
                b10 = ((oc1) valueAt).b();
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
        w4Var = ((org.telegram.ui.ActionBar.e2) wallpapersListActivity).simpleActionBar;
        w4Var.u();
        w4Var2 = ((org.telegram.ui.ActionBar.e2) wallpapersListActivity).simpleActionBar;
        w4Var2.m(true);
        if (arrayList.size() <= 1) {
            long j3 = ((org.telegram.messenger.ur) arrayList.get(0)).a;
            i13 = ((org.telegram.ui.ActionBar.e2) wallpapersListActivity).currentAccount;
            if (j3 != org.telegram.messenger.m10.i(i13).e() && charSequence == null) {
                long j10 = ((org.telegram.messenger.ur) arrayList.get(0)).a;
                Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                if (org.telegram.messenger.m5.C(j10)) {
                    k10.putInt("enc_id", (int) (4294967295L & j10));
                } else {
                    if (org.telegram.messenger.m5.E(j10)) {
                        k10.putLong("user_id", j10);
                    } else if (org.telegram.messenger.m5.z(j10)) {
                        k10.putLong("chat_id", -j10);
                    }
                    i14 = ((org.telegram.ui.ActionBar.e2) wallpapersListActivity).currentAccount;
                    if (!org.telegram.messenger.np.s1(i14).E(k10, ywVar, null, null)) {
                        return true;
                    }
                }
                i15 = ((org.telegram.ui.ActionBar.e2) wallpapersListActivity).currentAccount;
                org.telegram.messenger.ns.f(i15).k(org.telegram.messenger.ns.t, new Object[0]);
                wallpapersListActivity.presentFragment(new an(k10), true);
                i16 = ((org.telegram.ui.ActionBar.e2) wallpapersListActivity).currentAccount;
                org.telegram.messenger.ez.C(i16).r0(org.telegram.messenger.cz.b(sb2.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                return true;
            }
        }
        wallpapersListActivity.I0();
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            long j11 = ((org.telegram.messenger.ur) arrayList.get(i18)).a;
            if (charSequence != null) {
                i12 = ((org.telegram.ui.ActionBar.e2) wallpapersListActivity).currentAccount;
                org.telegram.messenger.ez.C(i12).r0(org.telegram.messenger.cz.b(charSequence.toString(), j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            if (!TextUtils.isEmpty(sb2)) {
                i11 = ((org.telegram.ui.ActionBar.e2) wallpapersListActivity).currentAccount;
                org.telegram.messenger.ez.C(i11).r0(org.telegram.messenger.cz.b(sb2.toString(), j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
        }
        ywVar.finishFragment();
        return true;
    }
}
