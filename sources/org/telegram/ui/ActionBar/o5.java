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
import org.telegram.ui.Cells.r6;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class o5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ int c;

    public /* synthetic */ o5(int i10, TLObject tLObject) {
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
        i6 i6Var;
        TLRPC.WallPaperSettings wallPaperSettings;
        Object obj;
        int i14 = this.a;
        Object obj2 = null;
        int i15 = this.c;
        TLObject tLObject = this.b;
        switch (i14) {
            case 0:
                ArrayList arrayList = j6.G;
                Integer num3 = -1;
                HashMap hashMap = j6.H;
                ArrayList arrayList2 = j6.F;
                j6.C[i15] = false;
                if (tLObject instanceof TL_account.TL_themes) {
                    TL_account.TL_themes tL_themes3 = (TL_account.TL_themes) tLObject;
                    j6.E[i15] = tL_themes3.hash;
                    j6.D[i15] = (int) (System.currentTimeMillis() / 1000);
                    ArrayList<TLRPC.TL_theme> arrayList3 = new ArrayList<>();
                    ArrayList arrayList4 = new ArrayList();
                    int size = arrayList2.size();
                    int i16 = 0;
                    while (i16 < size) {
                        i6 i6Var2 = (i6) arrayList2.get(i16);
                        if (i6Var2.F == null || i6Var2.E != i15) {
                            obj = obj2;
                            if (i6Var2.b0 != null) {
                                for (int i17 = 0; i17 < i6Var2.b0.size(); i17++) {
                                    h6 h6Var = (h6) i6Var2.b0.get(i17);
                                    if (h6Var.r != null && h6Var.t == i15) {
                                        arrayList4.add(h6Var);
                                    }
                                }
                            }
                        } else {
                            arrayList4.add(i6Var2);
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
                                i6 i6Var3 = (i6) hashMap.get(str);
                                if (i6Var3 == null) {
                                    i6Var3 = new i6();
                                    i6Var3.E = i15;
                                    i6Var3.b = new File(ApplicationLoader.getFilesDirFixed(), r6.t(str, ".attheme")).getAbsolutePath();
                                    arrayList2.add(i6Var3);
                                    arrayList.add(i6Var3);
                                    z12 = true;
                                } else {
                                    arrayList4.remove(i6Var3);
                                }
                                i6Var3.a = tL_theme.title;
                                i6Var3.F = tL_theme;
                                hashMap.put(i6Var3.m(), i6Var3);
                                i18 = i11 + 1;
                                size2 = i10;
                                tL_themes3 = tL_themes;
                                num3 = num;
                            } else {
                                int i19 = 0;
                                while (i19 < tL_theme.settings.size()) {
                                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.get(i19);
                                    if (themeSettings == null || (q02 = j6.q0(themeSettings)) == null || (i6Var = (i6) hashMap.get(q02)) == null) {
                                        i12 = size2;
                                    } else {
                                        i12 = size2;
                                        if (i6Var.b0 != null) {
                                            tL_themes2 = tL_themes3;
                                            i13 = i18;
                                            h6 h6Var2 = (h6) i6Var.c0.get(tL_theme.id);
                                            if (h6Var2 != null) {
                                                if (i6.a(h6Var2, themeSettings)) {
                                                    num2 = num3;
                                                } else {
                                                    File d = h6Var2.d();
                                                    if (d != null) {
                                                        d.delete();
                                                    }
                                                    i6.i(h6Var2, themeSettings);
                                                    i6 i6Var4 = j6.I;
                                                    if (i6Var4 == i6Var && i6Var4.Y == h6Var2.a) {
                                                        j6.n1(false, false);
                                                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                                                        int i20 = NotificationCenter.needSetDayNightTheme;
                                                        i6 i6Var5 = j6.I;
                                                        num2 = num3;
                                                        globalInstance.lambda$postNotificationNameOnUIThread$1(i20, i6Var5, Boolean.valueOf(j6.J == i6Var5), obj3, num2);
                                                    } else {
                                                        num2 = num3;
                                                    }
                                                    z11 = true;
                                                    z12 = true;
                                                }
                                                TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                                                h6Var2.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                                                arrayList4.remove(h6Var2);
                                            } else {
                                                num2 = num3;
                                                h6Var2 = i6Var.f(tL_theme, i15, i19);
                                                if (!TextUtils.isEmpty(h6Var2.o)) {
                                                    z11 = true;
                                                }
                                            }
                                            h6Var2.z = tL_theme.isDefault;
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
                        if (obj4 instanceof i6) {
                            i6 i6Var6 = (i6) obj4;
                            i6Var6.t();
                            arrayList.remove(i6Var6);
                            hashMap.remove(i6Var6.a);
                            c6 c6Var = i6Var6.i0;
                            if (c6Var != null) {
                                c6.a(c6Var);
                            }
                            arrayList2.remove(i6Var6);
                            new File(i6Var6.b).delete();
                            if (j6.K == i6Var6) {
                                j6.K = j6.L;
                            } else if (j6.J == i6Var6) {
                                j6.J = (i6) hashMap.get("Dark Blue");
                                z10 = true;
                                if (j6.I == i6Var6) {
                                    j6.t(z10 ? j6.J : j6.K, true, z10);
                                }
                            }
                            z10 = false;
                            if (j6.I == i6Var6) {
                            }
                        } else if (obj4 instanceof h6) {
                            h6 h6Var3 = (h6) obj4;
                            if (j6.j0(h6Var3.b, h6Var3, false) && j6.I == h6Var3.b) {
                                j6.n1(false, false);
                                NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                                int i22 = NotificationCenter.needSetDayNightTheme;
                                i6 i6Var7 = j6.I;
                                globalInstance2.lambda$postNotificationNameOnUIThread$1(i22, i6Var7, Boolean.valueOf(j6.J == i6Var7), obj3, num4);
                            }
                        }
                    }
                    j6.s1(true, false);
                    Collections.sort(j6.F, new a4.e(18));
                    if (z12) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                    }
                    if (z11) {
                        e6.a(true);
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

    public /* synthetic */ o5(int i10, TLObject tLObject, int i11) {
        this.a = i11;
        this.b = tLObject;
        this.c = i10;
    }
}
