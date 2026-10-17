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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ int c;

    public /* synthetic */ m5(int i10, TLObject tLObject) {
        this.a = 0;
        this.c = i10;
        this.b = tLObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x025d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        boolean z11;
        int i10;
        TL_account.TL_themes tL_themes;
        int i11;
        Integer num;
        int i12;
        TL_account.TL_themes tL_themes2;
        int i13;
        Integer num2;
        String r02;
        g6 g6Var;
        boolean z12;
        boolean z13;
        TLRPC.WallPaperSettings wallPaperSettings;
        Object obj;
        int i14 = this.a;
        Object obj2 = null;
        int i15 = this.c;
        TLObject tLObject = this.b;
        boolean z14 = true;
        int i16 = 0;
        switch (i14) {
            case 0:
                ArrayList arrayList = h6.G;
                Integer num3 = -1;
                HashMap hashMap = h6.H;
                ArrayList arrayList2 = h6.F;
                h6.C[i15] = false;
                if (tLObject instanceof TL_account.TL_themes) {
                    TL_account.TL_themes tL_themes3 = (TL_account.TL_themes) tLObject;
                    h6.E[i15] = tL_themes3.hash;
                    h6.D[i15] = (int) (System.currentTimeMillis() / 1000);
                    ArrayList<TLRPC.TL_theme> arrayList3 = new ArrayList<>();
                    ArrayList arrayList4 = new ArrayList();
                    int size = arrayList2.size();
                    int i17 = 0;
                    while (i17 < size) {
                        g6 g6Var2 = (g6) arrayList2.get(i17);
                        if (g6Var2.F == null || g6Var2.E != i15) {
                            obj = obj2;
                            if (g6Var2.b0 != null) {
                                int i18 = 0;
                                while (i18 < g6Var2.b0.size()) {
                                    f6 f6Var = (f6) g6Var2.b0.get(i18);
                                    boolean z15 = z14;
                                    if (f6Var.r != null && f6Var.t == i15) {
                                        arrayList4.add(f6Var);
                                    }
                                    i18++;
                                    z14 = z15;
                                }
                            }
                        } else {
                            arrayList4.add(g6Var2);
                            obj = obj2;
                        }
                        i17++;
                        obj2 = obj;
                        z14 = z14;
                    }
                    Object obj3 = obj2;
                    boolean z16 = z14;
                    int size2 = tL_themes3.themes.size();
                    int i19 = 0;
                    boolean z17 = false;
                    boolean z18 = false;
                    while (i19 < size2) {
                        TLRPC.TL_theme tL_theme = tL_themes3.themes.get(i19);
                        if (tL_theme != null) {
                            if (tL_theme.isDefault) {
                                arrayList3.add(tL_theme);
                            }
                            ArrayList<TLRPC.ThemeSettings> arrayList5 = tL_theme.settings;
                            if (arrayList5 == null || arrayList5.size() <= 0) {
                                i10 = size2;
                                tL_themes = tL_themes3;
                                i11 = i19;
                                num = num3;
                                String str = "remote" + tL_theme.id;
                                g6 g6Var3 = (g6) hashMap.get(str);
                                if (g6Var3 == null) {
                                    g6Var3 = new g6();
                                    g6Var3.E = i15;
                                    g6Var3.b = new File(ApplicationLoader.getFilesDirFixed(), r.c.u(str, ".attheme")).getAbsolutePath();
                                    arrayList2.add(g6Var3);
                                    arrayList.add(g6Var3);
                                    z18 = z16 ? 1 : 0;
                                } else {
                                    arrayList4.remove(g6Var3);
                                    z18 = z18;
                                }
                                g6Var3.a = tL_theme.title;
                                g6Var3.F = tL_theme;
                                hashMap.put(g6Var3.m(), g6Var3);
                                i19 = i11 + 1;
                                size2 = i10;
                                tL_themes3 = tL_themes;
                                num3 = num;
                                i16 = 0;
                                z17 = z17;
                                z18 = z18;
                            } else {
                                int i20 = i16;
                                z17 = z17;
                                z18 = z18;
                                while (i20 < tL_theme.settings.size()) {
                                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.get(i20);
                                    if (themeSettings == null || (r02 = h6.r0(themeSettings)) == null || (g6Var = (g6) hashMap.get(r02)) == null) {
                                        i12 = size2;
                                    } else {
                                        i12 = size2;
                                        if (g6Var.b0 != null) {
                                            tL_themes2 = tL_themes3;
                                            i13 = i19;
                                            f6 f6Var2 = (f6) g6Var.c0.get(tL_theme.id);
                                            if (f6Var2 != null) {
                                                if (g6.a(f6Var2, themeSettings)) {
                                                    num2 = num3;
                                                    z13 = z17;
                                                    z12 = z18;
                                                } else {
                                                    File d = f6Var2.d();
                                                    if (d != null) {
                                                        d.delete();
                                                    }
                                                    g6.i(f6Var2, themeSettings);
                                                    g6 g6Var4 = h6.I;
                                                    if (g6Var4 == g6Var && g6Var4.Y == f6Var2.a) {
                                                        h6.o1(false, false);
                                                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                                                        int i21 = NotificationCenter.needSetDayNightTheme;
                                                        g6 g6Var5 = h6.I;
                                                        Boolean valueOf = Boolean.valueOf(h6.J == g6Var5 ? z16 ? 1 : 0 : false);
                                                        num2 = num3;
                                                        Object[] objArr = new Object[4];
                                                        objArr[0] = g6Var5;
                                                        objArr[z16 ? 1 : 0] = valueOf;
                                                        objArr[2] = obj3;
                                                        objArr[3] = num2;
                                                        globalInstance.lambda$postNotificationNameOnUIThread$1(i21, objArr);
                                                    } else {
                                                        num2 = num3;
                                                    }
                                                    boolean z19 = z16 ? 1 : 0;
                                                    z12 = z19;
                                                    z13 = z19;
                                                }
                                                TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                                                f6Var2.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : z16 ? 1 : 0;
                                                arrayList4.remove(f6Var2);
                                                z17 = z13;
                                                z18 = z12;
                                            } else {
                                                num2 = num3;
                                                f6Var2 = g6Var.f(tL_theme, i15, i20);
                                                z17 = z17;
                                                z18 = z18;
                                                if (!TextUtils.isEmpty(f6Var2.o)) {
                                                    z17 = z16 ? 1 : 0;
                                                    z18 = z18;
                                                }
                                            }
                                            f6Var2.z = tL_theme.isDefault;
                                            i20++;
                                            size2 = i12;
                                            tL_themes3 = tL_themes2;
                                            i19 = i13;
                                            num3 = num2;
                                            z17 = z17;
                                            z18 = z18;
                                        }
                                    }
                                    tL_themes2 = tL_themes3;
                                    i13 = i19;
                                    num2 = num3;
                                    i20++;
                                    size2 = i12;
                                    tL_themes3 = tL_themes2;
                                    i19 = i13;
                                    num3 = num2;
                                    z17 = z17;
                                    z18 = z18;
                                }
                            }
                        }
                        i10 = size2;
                        tL_themes = tL_themes3;
                        i11 = i19;
                        num = num3;
                        i19 = i11 + 1;
                        size2 = i10;
                        tL_themes3 = tL_themes;
                        num3 = num;
                        i16 = 0;
                        z17 = z17;
                        z18 = z18;
                    }
                    Integer num4 = num3;
                    int size3 = arrayList4.size();
                    int i22 = 0;
                    while (i22 < size3) {
                        Object obj4 = arrayList4.get(i22);
                        if (obj4 instanceof g6) {
                            g6 g6Var6 = (g6) obj4;
                            g6Var6.t();
                            arrayList.remove(g6Var6);
                            hashMap.remove(g6Var6.a);
                            a6 a6Var = g6Var6.i0;
                            if (a6Var != null) {
                                a6.a(a6Var);
                            }
                            arrayList2.remove(g6Var6);
                            new File(g6Var6.b).delete();
                            if (h6.K == g6Var6) {
                                h6.K = h6.L;
                            } else if (h6.J == g6Var6) {
                                h6.J = (g6) hashMap.get("Dark Blue");
                                z11 = z16;
                                if (h6.I == g6Var6) {
                                    h6.t(z11 ? h6.J : h6.K, z16, z11);
                                }
                            }
                            z11 = false;
                            if (h6.I == g6Var6) {
                            }
                        } else if (obj4 instanceof f6) {
                            f6 f6Var3 = (f6) obj4;
                            if (h6.k0(f6Var3.b, f6Var3, false) && h6.I == f6Var3.b) {
                                h6.o1(false, false);
                                NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                                int i23 = NotificationCenter.needSetDayNightTheme;
                                g6 g6Var7 = h6.I;
                                boolean z20 = h6.J == g6Var7;
                                z10 = true;
                                globalInstance2.lambda$postNotificationNameOnUIThread$1(i23, g6Var7, Boolean.valueOf(z20), obj3, num4);
                                i22++;
                                z16 = z10;
                            }
                        }
                        z10 = true;
                        i22++;
                        z16 = z10;
                    }
                    h6.t1(z16, false);
                    Collections.sort(h6.F, new i4(2));
                    if (z18) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                    }
                    if (z17) {
                        c6.a(true);
                    }
                    MediaDataController.getInstance(i15).generateEmojiPreviewThemes(arrayList3, i15);
                    break;
                }
                break;
            case 1:
                Pattern pattern = LaunchActivity.C1;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MediaDataController.getInstance(i15).loadAttachMenuBots(false, true, null);
                    break;
                }
                break;
            default:
                Pattern pattern2 = LaunchActivity.C1;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MediaDataController.getInstance(i15).loadAttachMenuBots(false, true, null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ m5(int i10, TLObject tLObject, int i11) {
        this.a = i11;
        this.b = tLObject;
        this.c = i10;
    }
}
