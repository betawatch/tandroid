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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        h6 h6Var;
        TLRPC.WallPaperSettings wallPaperSettings;
        Object obj;
        int i14 = this.a;
        Object obj2 = null;
        int i15 = this.c;
        TLObject tLObject = this.b;
        switch (i14) {
            case 0:
                ArrayList arrayList = i6.G;
                Integer num3 = -1;
                HashMap hashMap = i6.H;
                ArrayList arrayList2 = i6.F;
                i6.C[i15] = false;
                if (tLObject instanceof TL_account.TL_themes) {
                    TL_account.TL_themes tL_themes3 = (TL_account.TL_themes) tLObject;
                    i6.E[i15] = tL_themes3.hash;
                    i6.D[i15] = (int) (System.currentTimeMillis() / 1000);
                    ArrayList<TLRPC.TL_theme> arrayList3 = new ArrayList<>();
                    ArrayList arrayList4 = new ArrayList();
                    int size = arrayList2.size();
                    int i16 = 0;
                    while (i16 < size) {
                        h6 h6Var2 = (h6) arrayList2.get(i16);
                        if (h6Var2.F == null || h6Var2.E != i15) {
                            obj = obj2;
                            if (h6Var2.b0 != null) {
                                for (int i17 = 0; i17 < h6Var2.b0.size(); i17++) {
                                    g6 g6Var = (g6) h6Var2.b0.get(i17);
                                    if (g6Var.r != null && g6Var.t == i15) {
                                        arrayList4.add(g6Var);
                                    }
                                }
                            }
                        } else {
                            arrayList4.add(h6Var2);
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
                                h6 h6Var3 = (h6) hashMap.get(str);
                                if (h6Var3 == null) {
                                    h6Var3 = new h6();
                                    h6Var3.E = i15;
                                    h6Var3.b = new File(ApplicationLoader.getFilesDirFixed(), w.c.g(str, ".attheme")).getAbsolutePath();
                                    arrayList2.add(h6Var3);
                                    arrayList.add(h6Var3);
                                    z12 = true;
                                } else {
                                    arrayList4.remove(h6Var3);
                                }
                                h6Var3.a = tL_theme.title;
                                h6Var3.F = tL_theme;
                                hashMap.put(h6Var3.m(), h6Var3);
                                i18 = i11 + 1;
                                size2 = i10;
                                tL_themes3 = tL_themes;
                                num3 = num;
                            } else {
                                int i19 = 0;
                                while (i19 < tL_theme.settings.size()) {
                                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.get(i19);
                                    if (themeSettings == null || (q02 = i6.q0(themeSettings)) == null || (h6Var = (h6) hashMap.get(q02)) == null) {
                                        i12 = size2;
                                    } else {
                                        i12 = size2;
                                        if (h6Var.b0 != null) {
                                            tL_themes2 = tL_themes3;
                                            i13 = i18;
                                            g6 g6Var2 = (g6) h6Var.c0.get(tL_theme.id);
                                            if (g6Var2 != null) {
                                                if (h6.a(g6Var2, themeSettings)) {
                                                    num2 = num3;
                                                } else {
                                                    File d = g6Var2.d();
                                                    if (d != null) {
                                                        d.delete();
                                                    }
                                                    h6.i(g6Var2, themeSettings);
                                                    h6 h6Var4 = i6.I;
                                                    if (h6Var4 == h6Var && h6Var4.Y == g6Var2.a) {
                                                        i6.n1(false, false);
                                                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                                                        int i20 = NotificationCenter.needSetDayNightTheme;
                                                        h6 h6Var5 = i6.I;
                                                        num2 = num3;
                                                        globalInstance.lambda$postNotificationNameOnUIThread$1(i20, h6Var5, Boolean.valueOf(i6.J == h6Var5), obj3, num2);
                                                    } else {
                                                        num2 = num3;
                                                    }
                                                    z11 = true;
                                                    z12 = true;
                                                }
                                                TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                                                g6Var2.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                                                arrayList4.remove(g6Var2);
                                            } else {
                                                num2 = num3;
                                                g6Var2 = h6Var.f(tL_theme, i15, i19);
                                                if (!TextUtils.isEmpty(g6Var2.o)) {
                                                    z11 = true;
                                                }
                                            }
                                            g6Var2.z = tL_theme.isDefault;
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
                        if (obj4 instanceof h6) {
                            h6 h6Var6 = (h6) obj4;
                            h6Var6.t();
                            arrayList.remove(h6Var6);
                            hashMap.remove(h6Var6.a);
                            b6 b6Var = h6Var6.i0;
                            if (b6Var != null) {
                                b6.a(b6Var);
                            }
                            arrayList2.remove(h6Var6);
                            new File(h6Var6.b).delete();
                            if (i6.K == h6Var6) {
                                i6.K = i6.L;
                            } else if (i6.J == h6Var6) {
                                i6.J = (h6) hashMap.get("Dark Blue");
                                z10 = true;
                                if (i6.I == h6Var6) {
                                    i6.t(z10 ? i6.J : i6.K, true, z10);
                                }
                            }
                            z10 = false;
                            if (i6.I == h6Var6) {
                            }
                        } else if (obj4 instanceof g6) {
                            g6 g6Var3 = (g6) obj4;
                            if (i6.j0(g6Var3.b, g6Var3, false) && i6.I == g6Var3.b) {
                                i6.n1(false, false);
                                NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                                int i22 = NotificationCenter.needSetDayNightTheme;
                                h6 h6Var7 = i6.I;
                                globalInstance2.lambda$postNotificationNameOnUIThread$1(i22, h6Var7, Boolean.valueOf(i6.J == h6Var7), obj3, num4);
                            }
                        }
                    }
                    i6.s1(true, false);
                    Collections.sort(i6.F, new a4.e(25));
                    if (z12) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                    }
                    if (z11) {
                        d6.a(true);
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

    public /* synthetic */ m5(int i10, TLObject tLObject, int i11) {
        this.a = i11;
        this.b = tLObject;
        this.c = i10;
    }
}
