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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ int c;

    public /* synthetic */ k5(int i9, TLObject tLObject) {
        this.a = 0;
        this.c = i9;
        this.b = tLObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0255  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        int i9;
        TL_account.TL_themes tL_themes;
        int i10;
        Integer num;
        int i11;
        TL_account.TL_themes tL_themes2;
        int i12;
        Integer num2;
        String q02;
        e6 e6Var;
        TLRPC.WallPaperSettings wallPaperSettings;
        Object obj;
        int i13 = this.a;
        Object obj2 = null;
        int i14 = this.c;
        TLObject tLObject = this.b;
        switch (i13) {
            case 0:
                ArrayList arrayList = f6.G;
                Integer num3 = -1;
                HashMap hashMap = f6.H;
                ArrayList arrayList2 = f6.F;
                f6.C[i14] = false;
                if (tLObject instanceof TL_account.TL_themes) {
                    TL_account.TL_themes tL_themes3 = (TL_account.TL_themes) tLObject;
                    f6.E[i14] = tL_themes3.hash;
                    f6.D[i14] = (int) (System.currentTimeMillis() / 1000);
                    ArrayList<TLRPC.TL_theme> arrayList3 = new ArrayList<>();
                    ArrayList arrayList4 = new ArrayList();
                    int size = arrayList2.size();
                    int i15 = 0;
                    while (i15 < size) {
                        e6 e6Var2 = (e6) arrayList2.get(i15);
                        if (e6Var2.B == null || e6Var2.A != i14) {
                            obj = obj2;
                            if (e6Var2.X != null) {
                                for (int i16 = 0; i16 < e6Var2.X.size(); i16++) {
                                    d6 d6Var = (d6) e6Var2.X.get(i16);
                                    if (d6Var.r != null && d6Var.t == i14) {
                                        arrayList4.add(d6Var);
                                    }
                                }
                            }
                        } else {
                            arrayList4.add(e6Var2);
                            obj = obj2;
                        }
                        i15++;
                        obj2 = obj;
                    }
                    Object obj3 = obj2;
                    int size2 = tL_themes3.themes.size();
                    int i17 = 0;
                    boolean z11 = false;
                    boolean z12 = false;
                    while (i17 < size2) {
                        TLRPC.TL_theme tL_theme = tL_themes3.themes.get(i17);
                        if (tL_theme != null) {
                            if (tL_theme.isDefault) {
                                arrayList3.add(tL_theme);
                            }
                            ArrayList<TLRPC.ThemeSettings> arrayList5 = tL_theme.settings;
                            if (arrayList5 == null || arrayList5.size() <= 0) {
                                i9 = size2;
                                tL_themes = tL_themes3;
                                i10 = i17;
                                num = num3;
                                String str = "remote" + tL_theme.id;
                                e6 e6Var3 = (e6) hashMap.get(str);
                                if (e6Var3 == null) {
                                    e6Var3 = new e6();
                                    e6Var3.A = i14;
                                    e6Var3.b = new File(ApplicationLoader.getFilesDirFixed(), ta.b.j(str, ".attheme")).getAbsolutePath();
                                    arrayList2.add(e6Var3);
                                    arrayList.add(e6Var3);
                                    z12 = true;
                                } else {
                                    arrayList4.remove(e6Var3);
                                }
                                e6Var3.a = tL_theme.title;
                                e6Var3.B = tL_theme;
                                hashMap.put(e6Var3.m(), e6Var3);
                                i17 = i10 + 1;
                                size2 = i9;
                                tL_themes3 = tL_themes;
                                num3 = num;
                            } else {
                                int i18 = 0;
                                while (i18 < tL_theme.settings.size()) {
                                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.get(i18);
                                    if (themeSettings == null || (q02 = f6.q0(themeSettings)) == null || (e6Var = (e6) hashMap.get(q02)) == null) {
                                        i11 = size2;
                                    } else {
                                        i11 = size2;
                                        if (e6Var.X != null) {
                                            tL_themes2 = tL_themes3;
                                            i12 = i17;
                                            d6 d6Var2 = (d6) e6Var.Y.get(tL_theme.id);
                                            if (d6Var2 != null) {
                                                if (e6.a(d6Var2, themeSettings)) {
                                                    num2 = num3;
                                                } else {
                                                    File d = d6Var2.d();
                                                    if (d != null) {
                                                        d.delete();
                                                    }
                                                    e6.i(d6Var2, themeSettings);
                                                    e6 e6Var4 = f6.I;
                                                    if (e6Var4 == e6Var && e6Var4.U == d6Var2.a) {
                                                        f6.n1(false, false);
                                                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                                                        int i19 = NotificationCenter.needSetDayNightTheme;
                                                        e6 e6Var5 = f6.I;
                                                        num2 = num3;
                                                        globalInstance.lambda$postNotificationNameOnUIThread$1(i19, e6Var5, Boolean.valueOf(f6.J == e6Var5), obj3, num2);
                                                    } else {
                                                        num2 = num3;
                                                    }
                                                    z11 = true;
                                                    z12 = true;
                                                }
                                                TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                                                d6Var2.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                                                arrayList4.remove(d6Var2);
                                            } else {
                                                num2 = num3;
                                                d6Var2 = e6Var.f(tL_theme, i14, i18);
                                                if (!TextUtils.isEmpty(d6Var2.o)) {
                                                    z11 = true;
                                                }
                                            }
                                            d6Var2.z = tL_theme.isDefault;
                                            i18++;
                                            size2 = i11;
                                            tL_themes3 = tL_themes2;
                                            i17 = i12;
                                            num3 = num2;
                                        }
                                    }
                                    tL_themes2 = tL_themes3;
                                    i12 = i17;
                                    num2 = num3;
                                    i18++;
                                    size2 = i11;
                                    tL_themes3 = tL_themes2;
                                    i17 = i12;
                                    num3 = num2;
                                }
                            }
                        }
                        i9 = size2;
                        tL_themes = tL_themes3;
                        i10 = i17;
                        num = num3;
                        i17 = i10 + 1;
                        size2 = i9;
                        tL_themes3 = tL_themes;
                        num3 = num;
                    }
                    Integer num4 = num3;
                    int size3 = arrayList4.size();
                    for (int i20 = 0; i20 < size3; i20++) {
                        Object obj4 = arrayList4.get(i20);
                        if (obj4 instanceof e6) {
                            e6 e6Var6 = (e6) obj4;
                            e6Var6.t();
                            arrayList.remove(e6Var6);
                            hashMap.remove(e6Var6.a);
                            y5 y5Var = e6Var6.e0;
                            if (y5Var != null) {
                                y5.a(y5Var);
                            }
                            arrayList2.remove(e6Var6);
                            new File(e6Var6.b).delete();
                            if (f6.K == e6Var6) {
                                f6.K = f6.L;
                            } else if (f6.J == e6Var6) {
                                f6.J = (e6) hashMap.get("Dark Blue");
                                z10 = true;
                                if (f6.I == e6Var6) {
                                    f6.t(z10 ? f6.J : f6.K, true, z10);
                                }
                            }
                            z10 = false;
                            if (f6.I == e6Var6) {
                            }
                        } else if (obj4 instanceof d6) {
                            d6 d6Var3 = (d6) obj4;
                            if (f6.j0(d6Var3.b, d6Var3, false) && f6.I == d6Var3.b) {
                                f6.n1(false, false);
                                NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                                int i21 = NotificationCenter.needSetDayNightTheme;
                                e6 e6Var7 = f6.I;
                                globalInstance2.lambda$postNotificationNameOnUIThread$1(i21, e6Var7, Boolean.valueOf(f6.J == e6Var7), obj3, num4);
                            }
                        }
                    }
                    f6.s1(true, false);
                    Collections.sort(f6.F, new j9.a(11));
                    if (z12) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                    }
                    if (z11) {
                        a6.a(true);
                    }
                    MediaDataController.getInstance(i14).generateEmojiPreviewThemes(arrayList3, i14);
                    break;
                }
                break;
            case 1:
                Pattern pattern = LaunchActivity.x1;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MediaDataController.getInstance(i14).loadAttachMenuBots(false, true, null);
                    break;
                }
                break;
            default:
                Pattern pattern2 = LaunchActivity.x1;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MediaDataController.getInstance(i14).loadAttachMenuBots(false, true, null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ k5(int i9, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = tLObject;
        this.c = i9;
    }
}
