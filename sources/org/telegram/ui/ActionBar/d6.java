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
import org.telegram.ui.Components.b10;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ int c;

    public /* synthetic */ d6(int i10, TLObject tLObject) {
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
        x6 x6Var;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i13 = this.a;
        int i14 = 0;
        int i15 = this.c;
        TLObject tLObject = this.b;
        switch (i13) {
            case 0:
                ArrayList arrayList = y6.G;
                HashMap hashMap = y6.H;
                ArrayList arrayList2 = y6.F;
                y6.C[i15] = false;
                if (tLObject instanceof TL_account.TL_themes) {
                    TL_account.TL_themes tL_themes = (TL_account.TL_themes) tLObject;
                    y6.E[i15] = tL_themes.hash;
                    y6.D[i15] = (int) (System.currentTimeMillis() / 1000);
                    ArrayList<TLRPC.TL_theme> arrayList3 = new ArrayList<>();
                    ArrayList arrayList4 = new ArrayList();
                    int size = arrayList2.size();
                    for (int i16 = 0; i16 < size; i16++) {
                        x6 x6Var2 = (x6) arrayList2.get(i16);
                        if (x6Var2.F != null && x6Var2.E == i15) {
                            arrayList4.add(x6Var2);
                        } else if (x6Var2.b0 != null) {
                            for (int i17 = 0; i17 < x6Var2.b0.size(); i17++) {
                                w6 w6Var = (w6) x6Var2.b0.get(i17);
                                if (w6Var.r != null && w6Var.t == i15) {
                                    arrayList4.add(w6Var);
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
                                x6 x6Var3 = (x6) hashMap.get(sb3);
                                if (x6Var3 == null) {
                                    x6Var3 = new x6();
                                    x6Var3.E = i15;
                                    x6Var3.b = new File(ApplicationLoader.getFilesDirFixed(), b10.u(sb3, ".attheme")).getAbsolutePath();
                                    arrayList2.add(x6Var3);
                                    arrayList.add(x6Var3);
                                    z13 = true;
                                } else {
                                    arrayList4.remove(x6Var3);
                                }
                                x6Var3.a = tL_theme.title;
                                x6Var3.F = tL_theme;
                                hashMap.put(x6Var3.m(), x6Var3);
                            } else {
                                int i19 = i14;
                                while (i19 < tL_theme.settings.size()) {
                                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.get(i19);
                                    if (themeSettings == null || (r02 = y6.r0(themeSettings)) == null || (x6Var = (x6) hashMap.get(r02)) == null || x6Var.b0 == null) {
                                        i12 = i18;
                                        z11 = z12;
                                    } else {
                                        i12 = i18;
                                        z11 = z12;
                                        w6 w6Var2 = (w6) x6Var.c0.get(tL_theme.id);
                                        if (w6Var2 != null) {
                                            if (!x6.a(w6Var2, themeSettings)) {
                                                File d = w6Var2.d();
                                                if (d != null) {
                                                    d.delete();
                                                }
                                                x6.i(w6Var2, themeSettings);
                                                x6 x6Var4 = y6.I;
                                                if (x6Var4 == x6Var && x6Var4.Y == w6Var2.a) {
                                                    y6.q1(false, false);
                                                    x6 x6Var5 = y6.I;
                                                    y6.H1(x6Var5, y6.J == x6Var5, -1, null);
                                                }
                                                z13 = true;
                                                z11 = true;
                                            }
                                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                                            w6Var2.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                                            arrayList4.remove(w6Var2);
                                        } else {
                                            w6Var2 = x6Var.f(tL_theme, i15, i19);
                                            if (!TextUtils.isEmpty(w6Var2.o)) {
                                                z11 = true;
                                            }
                                        }
                                        w6Var2.z = tL_theme.isDefault;
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
                        if (obj instanceof x6) {
                            x6 x6Var6 = (x6) obj;
                            x6Var6.t();
                            arrayList.remove(x6Var6);
                            hashMap.remove(x6Var6.a);
                            r6 r6Var = x6Var6.i0;
                            if (r6Var != null) {
                                r6.a(r6Var);
                            }
                            arrayList2.remove(x6Var6);
                            new File(x6Var6.b).delete();
                            if (y6.K == x6Var6) {
                                y6.K = y6.L;
                            } else if (y6.J == x6Var6) {
                                y6.J = (x6) hashMap.get("Dark Blue");
                                z10 = true;
                                if (y6.I == x6Var6) {
                                    y6.t(z10 ? y6.J : y6.K, true, z10);
                                }
                            }
                            z10 = false;
                            if (y6.I == x6Var6) {
                            }
                        } else if (obj instanceof w6) {
                            w6 w6Var3 = (w6) obj;
                            if (y6.k0(w6Var3.b, w6Var3, false) && y6.I == w6Var3.b) {
                                y6.q1(false, false);
                                x6 x6Var7 = y6.I;
                                y6.H1(x6Var7, y6.J == x6Var7, -1, null);
                            }
                        }
                    }
                    y6.v1(true, false);
                    Collections.sort(y6.F, new n4(2));
                    if (z13) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                    }
                    if (z12) {
                        t6.a(true);
                    }
                    MediaDataController.getInstance(i15).generateEmojiPreviewThemes(arrayList3, i15);
                    break;
                }
                break;
            case 1:
                Pattern pattern = LaunchActivity.D1;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MediaDataController.getInstance(i15).loadAttachMenuBots(false, true, null);
                    break;
                }
                break;
            default:
                Pattern pattern2 = LaunchActivity.D1;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MediaDataController.getInstance(i15).loadAttachMenuBots(false, true, null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d6(int i10, TLObject tLObject, int i11) {
        this.a = i11;
        this.b = tLObject;
        this.c = i10;
    }
}
