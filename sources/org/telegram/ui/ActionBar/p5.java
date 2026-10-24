package org.telegram.ui.ActionBar;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class p5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ int c;

    public /* synthetic */ p5(int i10, TLObject tLObject) {
        this.a = 0;
        this.c = i10;
        this.b = tLObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x020d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        int i10;
        int i11;
        int i12;
        boolean z11;
        String r02;
        j6 j6Var;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i13 = this.a;
        int i14 = 0;
        int i15 = this.c;
        TLObject tLObject = this.b;
        switch (i13) {
            case 0:
                ArrayList arrayList = k6.G;
                HashMap hashMap = k6.H;
                ArrayList arrayList2 = k6.F;
                k6.C[i15] = false;
                if (tLObject instanceof TL_account.TL_themes) {
                    TL_account.TL_themes tL_themes = (TL_account.TL_themes) tLObject;
                    k6.E[i15] = tL_themes.hash;
                    k6.D[i15] = (int) (System.currentTimeMillis() / 1000);
                    ArrayList<TLRPC.TL_theme> arrayList3 = new ArrayList<>();
                    ArrayList arrayList4 = new ArrayList();
                    int size = arrayList2.size();
                    for (int i16 = 0; i16 < size; i16++) {
                        j6 j6Var2 = (j6) arrayList2.get(i16);
                        if (j6Var2.F != null && j6Var2.E == i15) {
                            arrayList4.add(j6Var2);
                        } else if (j6Var2.b0 != null) {
                            for (int i17 = 0; i17 < j6Var2.b0.size(); i17++) {
                                i6 i6Var = (i6) j6Var2.b0.get(i17);
                                if (i6Var.r != null && i6Var.t == i15) {
                                    arrayList4.add(i6Var);
                                }
                            }
                        }
                    }
                    int size2 = tL_themes.themes.size();
                    int i18 = 0;
                    boolean z12 = false;
                    boolean z13 = false;
                    while (i18 < size2) {
                        TLRPC.TL_theme tL_theme = tL_themes.themes.get(i18);
                        if (tL_theme != null) {
                            if (tL_theme.isDefault) {
                                arrayList3.add(tL_theme);
                            }
                            ArrayList<TLRPC.ThemeSettings> arrayList5 = tL_theme.settings;
                            if (arrayList5 == null || arrayList5.size() <= 0) {
                                i11 = i18;
                                StringBuilder sb2 = new StringBuilder("remote");
                                i10 = size2;
                                sb2.append(tL_theme.id);
                                String sb3 = sb2.toString();
                                j6 j6Var3 = (j6) hashMap.get(sb3);
                                if (j6Var3 == null) {
                                    j6Var3 = new j6();
                                    j6Var3.E = i15;
                                    j6Var3.b = new File(ApplicationLoader.getFilesDirFixed(), si.o0.u(sb3, ".attheme")).getAbsolutePath();
                                    arrayList2.add(j6Var3);
                                    arrayList.add(j6Var3);
                                    z13 = true;
                                } else {
                                    arrayList4.remove(j6Var3);
                                }
                                j6Var3.a = tL_theme.title;
                                j6Var3.F = tL_theme;
                                hashMap.put(j6Var3.m(), j6Var3);
                            } else {
                                int i19 = i14;
                                while (i19 < tL_theme.settings.size()) {
                                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.get(i19);
                                    if (themeSettings == null || (r02 = k6.r0(themeSettings)) == null || (j6Var = (j6) hashMap.get(r02)) == null || j6Var.b0 == null) {
                                        i12 = i18;
                                        z11 = z12;
                                    } else {
                                        i12 = i18;
                                        z11 = z12;
                                        i6 i6Var2 = (i6) j6Var.c0.get(tL_theme.id);
                                        if (i6Var2 != null) {
                                            if (!j6.a(i6Var2, themeSettings)) {
                                                File d = i6Var2.d();
                                                if (d != null) {
                                                    d.delete();
                                                }
                                                j6.i(i6Var2, themeSettings);
                                                j6 j6Var4 = k6.I;
                                                if (j6Var4 == j6Var && j6Var4.Y == i6Var2.a) {
                                                    k6.q1(false, false);
                                                    j6 j6Var5 = k6.I;
                                                    k6.H1(j6Var5, k6.J == j6Var5, -1, null);
                                                }
                                                z13 = true;
                                                z11 = true;
                                            }
                                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                                            i6Var2.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                                            arrayList4.remove(i6Var2);
                                        } else {
                                            i6Var2 = j6Var.f(tL_theme, i15, i19);
                                            if (!TextUtils.isEmpty(i6Var2.o)) {
                                                z11 = true;
                                            }
                                        }
                                        i6Var2.z = tL_theme.isDefault;
                                    }
                                    z12 = z11;
                                    i19++;
                                    i18 = i12;
                                }
                                i11 = i18;
                                i10 = size2;
                            }
                        } else {
                            i10 = size2;
                            i11 = i18;
                        }
                        i18 = i11 + 1;
                        size2 = i10;
                        i14 = 0;
                    }
                    int size3 = arrayList4.size();
                    for (int i20 = 0; i20 < size3; i20++) {
                        Object obj = arrayList4.get(i20);
                        if (obj instanceof j6) {
                            j6 j6Var6 = (j6) obj;
                            j6Var6.t();
                            arrayList.remove(j6Var6);
                            hashMap.remove(j6Var6.a);
                            d6 d6Var = j6Var6.i0;
                            if (d6Var != null) {
                                d6.a(d6Var);
                            }
                            arrayList2.remove(j6Var6);
                            new File(j6Var6.b).delete();
                            if (k6.K == j6Var6) {
                                k6.K = k6.L;
                            } else if (k6.J == j6Var6) {
                                k6.J = (j6) hashMap.get("Dark Blue");
                                z10 = true;
                                if (k6.I == j6Var6) {
                                    k6.t(z10 ? k6.J : k6.K, true, z10);
                                }
                            }
                            z10 = false;
                            if (k6.I == j6Var6) {
                            }
                        } else if (obj instanceof i6) {
                            i6 i6Var3 = (i6) obj;
                            if (k6.k0(i6Var3.b, i6Var3, false) && k6.I == i6Var3.b) {
                                k6.q1(false, false);
                                j6 j6Var7 = k6.I;
                                k6.H1(j6Var7, k6.J == j6Var7, -1, null);
                            }
                        }
                    }
                    k6.v1(true, false);
                    Collections.sort(k6.F, new l4(2));
                    if (z13) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                    }
                    if (z12) {
                        f6.a(true);
                    }
                    MediaDataController.getInstance(i15).generateEmojiPreviewThemes(arrayList3, i15);
                    break;
                }
                break;
            case 1:
                Pattern pattern = LaunchActivity.E1;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MediaDataController.getInstance(i15).loadAttachMenuBots(false, true, null);
                    break;
                }
                break;
            default:
                Pattern pattern2 = LaunchActivity.E1;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MediaDataController.getInstance(i15).loadAttachMenuBots(false, true, null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ p5(int i10, TLObject tLObject, int i11) {
        this.a = i11;
        this.b = tLObject;
        this.c = i10;
    }
}
