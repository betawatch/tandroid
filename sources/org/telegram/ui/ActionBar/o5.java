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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        boolean z4;
        int i10;
        TL_account.TL_themes tL_themes;
        int i11;
        Integer num;
        int i12;
        TL_account.TL_themes tL_themes2;
        int i13;
        Integer num2;
        String q02;
        j6 j6Var;
        TLRPC.WallPaperSettings wallPaperSettings;
        Object obj;
        int i14 = this.a;
        Object obj2 = null;
        int i15 = this.c;
        TLObject tLObject = this.b;
        switch (i14) {
            case 0:
                ArrayList arrayList = k6.G;
                Integer num3 = -1;
                HashMap hashMap = k6.H;
                ArrayList arrayList2 = k6.F;
                k6.C[i15] = false;
                if (tLObject instanceof TL_account.TL_themes) {
                    TL_account.TL_themes tL_themes3 = (TL_account.TL_themes) tLObject;
                    k6.E[i15] = tL_themes3.hash;
                    k6.D[i15] = (int) (System.currentTimeMillis() / 1000);
                    ArrayList<TLRPC.TL_theme> arrayList3 = new ArrayList<>();
                    ArrayList arrayList4 = new ArrayList();
                    int size = arrayList2.size();
                    int i16 = 0;
                    while (i16 < size) {
                        j6 j6Var2 = (j6) arrayList2.get(i16);
                        if (j6Var2.C == null || j6Var2.B != i15) {
                            obj = obj2;
                            if (j6Var2.Y != null) {
                                for (int i17 = 0; i17 < j6Var2.Y.size(); i17++) {
                                    i6 i6Var = (i6) j6Var2.Y.get(i17);
                                    if (i6Var.r != null && i6Var.t == i15) {
                                        arrayList4.add(i6Var);
                                    }
                                }
                            }
                        } else {
                            arrayList4.add(j6Var2);
                            obj = obj2;
                        }
                        i16++;
                        obj2 = obj;
                    }
                    Object obj3 = obj2;
                    int size2 = tL_themes3.themes.size();
                    int i18 = 0;
                    boolean z10 = false;
                    boolean z11 = false;
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
                                j6 j6Var3 = (j6) hashMap.get(str);
                                if (j6Var3 == null) {
                                    j6Var3 = new j6();
                                    j6Var3.B = i15;
                                    j6Var3.b = new File(ApplicationLoader.getFilesDirFixed(), w.c.e(str, ".attheme")).getAbsolutePath();
                                    arrayList2.add(j6Var3);
                                    arrayList.add(j6Var3);
                                    z11 = true;
                                } else {
                                    arrayList4.remove(j6Var3);
                                }
                                j6Var3.a = tL_theme.title;
                                j6Var3.C = tL_theme;
                                hashMap.put(j6Var3.m(), j6Var3);
                                i18 = i11 + 1;
                                size2 = i10;
                                tL_themes3 = tL_themes;
                                num3 = num;
                            } else {
                                int i19 = 0;
                                while (i19 < tL_theme.settings.size()) {
                                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.get(i19);
                                    if (themeSettings == null || (q02 = k6.q0(themeSettings)) == null || (j6Var = (j6) hashMap.get(q02)) == null) {
                                        i12 = size2;
                                    } else {
                                        i12 = size2;
                                        if (j6Var.Y != null) {
                                            tL_themes2 = tL_themes3;
                                            i13 = i18;
                                            i6 i6Var2 = (i6) j6Var.Z.get(tL_theme.id);
                                            if (i6Var2 != null) {
                                                if (j6.a(i6Var2, themeSettings)) {
                                                    num2 = num3;
                                                } else {
                                                    File d = i6Var2.d();
                                                    if (d != null) {
                                                        d.delete();
                                                    }
                                                    j6.i(i6Var2, themeSettings);
                                                    j6 j6Var4 = k6.I;
                                                    if (j6Var4 == j6Var && j6Var4.V == i6Var2.a) {
                                                        k6.n1(false, false);
                                                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                                                        int i20 = NotificationCenter.needSetDayNightTheme;
                                                        j6 j6Var5 = k6.I;
                                                        num2 = num3;
                                                        globalInstance.lambda$postNotificationNameOnUIThread$1(i20, j6Var5, Boolean.valueOf(k6.J == j6Var5), obj3, num2);
                                                    } else {
                                                        num2 = num3;
                                                    }
                                                    z10 = true;
                                                    z11 = true;
                                                }
                                                TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                                                i6Var2.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                                                arrayList4.remove(i6Var2);
                                            } else {
                                                num2 = num3;
                                                i6Var2 = j6Var.f(tL_theme, i15, i19);
                                                if (!TextUtils.isEmpty(i6Var2.o)) {
                                                    z10 = true;
                                                }
                                            }
                                            i6Var2.z = tL_theme.isDefault;
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
                        if (obj4 instanceof j6) {
                            j6 j6Var6 = (j6) obj4;
                            j6Var6.t();
                            arrayList.remove(j6Var6);
                            hashMap.remove(j6Var6.a);
                            d6 d6Var = j6Var6.f0;
                            if (d6Var != null) {
                                d6.a(d6Var);
                            }
                            arrayList2.remove(j6Var6);
                            new File(j6Var6.b).delete();
                            if (k6.K == j6Var6) {
                                k6.K = k6.L;
                            } else if (k6.J == j6Var6) {
                                k6.J = (j6) hashMap.get("Dark Blue");
                                z4 = true;
                                if (k6.I == j6Var6) {
                                    k6.t(z4 ? k6.J : k6.K, true, z4);
                                }
                            }
                            z4 = false;
                            if (k6.I == j6Var6) {
                            }
                        } else if (obj4 instanceof i6) {
                            i6 i6Var3 = (i6) obj4;
                            if (k6.j0(i6Var3.b, i6Var3, false) && k6.I == i6Var3.b) {
                                k6.n1(false, false);
                                NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                                int i22 = NotificationCenter.needSetDayNightTheme;
                                j6 j6Var7 = k6.I;
                                globalInstance2.lambda$postNotificationNameOnUIThread$1(i22, j6Var7, Boolean.valueOf(k6.J == j6Var7), obj3, num4);
                            }
                        }
                    }
                    k6.s1(true, false);
                    Collections.sort(k6.F, new oh.k0(6));
                    if (z11) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                    }
                    if (z10) {
                        f6.a(true);
                    }
                    MediaDataController.getInstance(i15).generateEmojiPreviewThemes(arrayList3, i15);
                    break;
                }
                break;
            case 1:
                Pattern pattern = LaunchActivity.y1;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MediaDataController.getInstance(i15).loadAttachMenuBots(false, true, null);
                    break;
                }
                break;
            default:
                Pattern pattern2 = LaunchActivity.y1;
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
