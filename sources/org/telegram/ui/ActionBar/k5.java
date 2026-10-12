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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class k5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ int c;

    public /* synthetic */ k5(int i10, TLObject tLObject) {
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
        f6 f6Var;
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
                ArrayList arrayList = g6.G;
                Integer num3 = -1;
                HashMap hashMap = g6.H;
                ArrayList arrayList2 = g6.F;
                g6.C[i15] = false;
                if (tLObject instanceof TL_account.TL_themes) {
                    TL_account.TL_themes tL_themes3 = (TL_account.TL_themes) tLObject;
                    g6.E[i15] = tL_themes3.hash;
                    g6.D[i15] = (int) (System.currentTimeMillis() / 1000);
                    ArrayList<TLRPC.TL_theme> arrayList3 = new ArrayList<>();
                    ArrayList arrayList4 = new ArrayList();
                    int size = arrayList2.size();
                    int i17 = 0;
                    while (i17 < size) {
                        f6 f6Var2 = (f6) arrayList2.get(i17);
                        if (f6Var2.F == null || f6Var2.E != i15) {
                            obj = obj2;
                            if (f6Var2.b0 != null) {
                                int i18 = 0;
                                while (i18 < f6Var2.b0.size()) {
                                    e6 e6Var = (e6) f6Var2.b0.get(i18);
                                    boolean z15 = z14;
                                    if (e6Var.r != null && e6Var.t == i15) {
                                        arrayList4.add(e6Var);
                                    }
                                    i18++;
                                    z14 = z15;
                                }
                            }
                        } else {
                            arrayList4.add(f6Var2);
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
                                f6 f6Var3 = (f6) hashMap.get(str);
                                if (f6Var3 == null) {
                                    f6Var3 = new f6();
                                    f6Var3.E = i15;
                                    f6Var3.b = new File(ApplicationLoader.getFilesDirFixed(), t8.b.u(str, ".attheme")).getAbsolutePath();
                                    arrayList2.add(f6Var3);
                                    arrayList.add(f6Var3);
                                    z18 = z16 ? 1 : 0;
                                } else {
                                    arrayList4.remove(f6Var3);
                                    z18 = z18;
                                }
                                f6Var3.a = tL_theme.title;
                                f6Var3.F = tL_theme;
                                hashMap.put(f6Var3.m(), f6Var3);
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
                                    if (themeSettings == null || (r02 = g6.r0(themeSettings)) == null || (f6Var = (f6) hashMap.get(r02)) == null) {
                                        i12 = size2;
                                    } else {
                                        i12 = size2;
                                        if (f6Var.b0 != null) {
                                            tL_themes2 = tL_themes3;
                                            i13 = i19;
                                            e6 e6Var2 = (e6) f6Var.c0.get(tL_theme.id);
                                            if (e6Var2 != null) {
                                                if (f6.a(e6Var2, themeSettings)) {
                                                    num2 = num3;
                                                    z13 = z17;
                                                    z12 = z18;
                                                } else {
                                                    File d = e6Var2.d();
                                                    if (d != null) {
                                                        d.delete();
                                                    }
                                                    f6.i(e6Var2, themeSettings);
                                                    f6 f6Var4 = g6.I;
                                                    if (f6Var4 == f6Var && f6Var4.Y == e6Var2.a) {
                                                        g6.o1(false, false);
                                                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                                                        int i21 = NotificationCenter.needSetDayNightTheme;
                                                        f6 f6Var5 = g6.I;
                                                        Boolean valueOf = Boolean.valueOf(g6.J == f6Var5 ? z16 ? 1 : 0 : false);
                                                        num2 = num3;
                                                        Object[] objArr = new Object[4];
                                                        objArr[0] = f6Var5;
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
                                                e6Var2.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : z16 ? 1 : 0;
                                                arrayList4.remove(e6Var2);
                                                z17 = z13;
                                                z18 = z12;
                                            } else {
                                                num2 = num3;
                                                e6Var2 = f6Var.f(tL_theme, i15, i20);
                                                z17 = z17;
                                                z18 = z18;
                                                if (!TextUtils.isEmpty(e6Var2.o)) {
                                                    z17 = z16 ? 1 : 0;
                                                    z18 = z18;
                                                }
                                            }
                                            e6Var2.z = tL_theme.isDefault;
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
                        if (obj4 instanceof f6) {
                            f6 f6Var6 = (f6) obj4;
                            f6Var6.t();
                            arrayList.remove(f6Var6);
                            hashMap.remove(f6Var6.a);
                            z5 z5Var = f6Var6.i0;
                            if (z5Var != null) {
                                z5.a(z5Var);
                            }
                            arrayList2.remove(f6Var6);
                            new File(f6Var6.b).delete();
                            if (g6.K == f6Var6) {
                                g6.K = g6.L;
                            } else if (g6.J == f6Var6) {
                                g6.J = (f6) hashMap.get("Dark Blue");
                                z11 = z16;
                                if (g6.I == f6Var6) {
                                    g6.t(z11 ? g6.J : g6.K, z16, z11);
                                }
                            }
                            z11 = false;
                            if (g6.I == f6Var6) {
                            }
                        } else if (obj4 instanceof e6) {
                            e6 e6Var3 = (e6) obj4;
                            if (g6.k0(e6Var3.b, e6Var3, false) && g6.I == e6Var3.b) {
                                g6.o1(false, false);
                                NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                                int i23 = NotificationCenter.needSetDayNightTheme;
                                f6 f6Var7 = g6.I;
                                boolean z20 = g6.J == f6Var7;
                                z10 = true;
                                globalInstance2.lambda$postNotificationNameOnUIThread$1(i23, f6Var7, Boolean.valueOf(z20), obj3, num4);
                                i22++;
                                z16 = z10;
                            }
                        }
                        z10 = true;
                        i22++;
                        z16 = z10;
                    }
                    g6.t1(z16, false);
                    Collections.sort(g6.F, new a4.d(29));
                    if (z18) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                    }
                    if (z17) {
                        b6.a(true);
                    }
                    MediaDataController.getInstance(i15).generateEmojiPreviewThemes(arrayList3, i15);
                    break;
                }
                break;
            case 1:
                Pattern pattern = LaunchActivity.B1;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MediaDataController.getInstance(i15).loadAttachMenuBots(false, true, null);
                    break;
                }
                break;
            default:
                Pattern pattern2 = LaunchActivity.B1;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MediaDataController.getInstance(i15).loadAttachMenuBots(false, true, null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ k5(int i10, TLObject tLObject, int i11) {
        this.a = i11;
        this.b = tLObject;
        this.c = i10;
    }
}
