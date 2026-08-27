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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

    /* JADX WARN: Removed duplicated region for block: B:125:0x0255  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        int i10;
        TL_account.TL_themes tL_themes;
        int i11;
        Integer num;
        int i12;
        TL_account.TL_themes tL_themes2;
        int i13;
        Integer num2;
        String q02;
        f6 f6Var;
        TLRPC.WallPaperSettings wallPaperSettings;
        Object obj;
        int i14 = this.a;
        Object obj2 = null;
        int i15 = this.c;
        TLObject tLObject = this.b;
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
                    int i16 = 0;
                    while (i16 < size) {
                        f6 f6Var2 = (f6) arrayList2.get(i16);
                        if (f6Var2.B == null || f6Var2.A != i15) {
                            obj = obj2;
                            if (f6Var2.X != null) {
                                for (int i17 = 0; i17 < f6Var2.X.size(); i17++) {
                                    e6 e6Var = (e6) f6Var2.X.get(i17);
                                    if (e6Var.r != null && e6Var.t == i15) {
                                        arrayList4.add(e6Var);
                                    }
                                }
                            }
                        } else {
                            arrayList4.add(f6Var2);
                            obj = obj2;
                        }
                        i16++;
                        obj2 = obj;
                    }
                    Object obj3 = obj2;
                    int size2 = tL_themes3.themes.size();
                    int i18 = 0;
                    boolean z11 = false;
                    boolean z12 = false;
                    while (i18 < size2) {
                        TLRPC.TL_theme tL_theme = tL_themes3.themes.get(i18);
                        if (tL_theme != null) {
                            if (tL_theme.isDefault) {
                                arrayList3.add(tL_theme);
                            }
                            ArrayList<TLRPC.ThemeSettings> arrayList5 = tL_theme.settings;
                            if (arrayList5 == null || arrayList5.size() <= 0) {
                                i10 = size2;
                                tL_themes = tL_themes3;
                                i11 = i18;
                                num = num3;
                                String str = "remote" + tL_theme.id;
                                f6 f6Var3 = (f6) hashMap.get(str);
                                if (f6Var3 == null) {
                                    f6Var3 = new f6();
                                    f6Var3.A = i15;
                                    f6Var3.b = new File(ApplicationLoader.getFilesDirFixed(), s3.c.l(str, ".attheme")).getAbsolutePath();
                                    arrayList2.add(f6Var3);
                                    arrayList.add(f6Var3);
                                    z12 = true;
                                } else {
                                    arrayList4.remove(f6Var3);
                                }
                                f6Var3.a = tL_theme.title;
                                f6Var3.B = tL_theme;
                                hashMap.put(f6Var3.m(), f6Var3);
                                i18 = i11 + 1;
                                size2 = i10;
                                tL_themes3 = tL_themes;
                                num3 = num;
                            } else {
                                int i19 = 0;
                                while (i19 < tL_theme.settings.size()) {
                                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.get(i19);
                                    if (themeSettings == null || (q02 = g6.q0(themeSettings)) == null || (f6Var = (f6) hashMap.get(q02)) == null) {
                                        i12 = size2;
                                    } else {
                                        i12 = size2;
                                        if (f6Var.X != null) {
                                            tL_themes2 = tL_themes3;
                                            i13 = i18;
                                            e6 e6Var2 = (e6) f6Var.Y.get(tL_theme.id);
                                            if (e6Var2 != null) {
                                                if (f6.a(e6Var2, themeSettings)) {
                                                    num2 = num3;
                                                } else {
                                                    File d = e6Var2.d();
                                                    if (d != null) {
                                                        d.delete();
                                                    }
                                                    f6.i(e6Var2, themeSettings);
                                                    f6 f6Var4 = g6.I;
                                                    if (f6Var4 == f6Var && f6Var4.U == e6Var2.a) {
                                                        g6.n1(false, false);
                                                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                                                        int i20 = NotificationCenter.needSetDayNightTheme;
                                                        f6 f6Var5 = g6.I;
                                                        num2 = num3;
                                                        globalInstance.lambda$postNotificationNameOnUIThread$1(i20, f6Var5, Boolean.valueOf(g6.J == f6Var5), obj3, num2);
                                                    } else {
                                                        num2 = num3;
                                                    }
                                                    z11 = true;
                                                    z12 = true;
                                                }
                                                TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                                                e6Var2.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                                                arrayList4.remove(e6Var2);
                                            } else {
                                                num2 = num3;
                                                e6Var2 = f6Var.f(tL_theme, i15, i19);
                                                if (!TextUtils.isEmpty(e6Var2.o)) {
                                                    z11 = true;
                                                }
                                            }
                                            e6Var2.z = tL_theme.isDefault;
                                            i19++;
                                            size2 = i12;
                                            tL_themes3 = tL_themes2;
                                            i18 = i13;
                                            num3 = num2;
                                        }
                                    }
                                    tL_themes2 = tL_themes3;
                                    i13 = i18;
                                    num2 = num3;
                                    i19++;
                                    size2 = i12;
                                    tL_themes3 = tL_themes2;
                                    i18 = i13;
                                    num3 = num2;
                                }
                            }
                        }
                        i10 = size2;
                        tL_themes = tL_themes3;
                        i11 = i18;
                        num = num3;
                        i18 = i11 + 1;
                        size2 = i10;
                        tL_themes3 = tL_themes;
                        num3 = num;
                    }
                    Integer num4 = num3;
                    int size3 = arrayList4.size();
                    for (int i21 = 0; i21 < size3; i21++) {
                        Object obj4 = arrayList4.get(i21);
                        if (obj4 instanceof f6) {
                            f6 f6Var6 = (f6) obj4;
                            f6Var6.t();
                            arrayList.remove(f6Var6);
                            hashMap.remove(f6Var6.a);
                            z5 z5Var = f6Var6.e0;
                            if (z5Var != null) {
                                z5.a(z5Var);
                            }
                            arrayList2.remove(f6Var6);
                            new File(f6Var6.b).delete();
                            if (g6.K == f6Var6) {
                                g6.K = g6.L;
                            } else if (g6.J == f6Var6) {
                                g6.J = (f6) hashMap.get("Dark Blue");
                                z10 = true;
                                if (g6.I == f6Var6) {
                                    g6.t(z10 ? g6.J : g6.K, true, z10);
                                }
                            }
                            z10 = false;
                            if (g6.I == f6Var6) {
                            }
                        } else if (obj4 instanceof e6) {
                            e6 e6Var3 = (e6) obj4;
                            if (g6.j0(e6Var3.b, e6Var3, false) && g6.I == e6Var3.b) {
                                g6.n1(false, false);
                                NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                                int i22 = NotificationCenter.needSetDayNightTheme;
                                f6 f6Var7 = g6.I;
                                globalInstance2.lambda$postNotificationNameOnUIThread$1(i22, f6Var7, Boolean.valueOf(g6.J == f6Var7), obj3, num4);
                            }
                        }
                    }
                    g6.s1(true, false);
                    Collections.sort(g6.F, new k9.a(9));
                    if (z12) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                    }
                    if (z11) {
                        b6.a(true);
                    }
                    MediaDataController.getInstance(i15).generateEmojiPreviewThemes(arrayList3, i15);
                    break;
                }
                break;
            case 1:
                Pattern pattern = LaunchActivity.x1;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MediaDataController.getInstance(i15).loadAttachMenuBots(false, true, null);
                    break;
                }
                break;
            default:
                Pattern pattern2 = LaunchActivity.x1;
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
