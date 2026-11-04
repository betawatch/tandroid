package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hs;
import org.telegram.messenger.li;
import org.telegram.messenger.tq;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.uo;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ int c;

    public /* synthetic */ m5(int i3, int i10, TLObject tLObject) {
        this.a = i10;
        this.b = tLObject;
        this.c = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x020f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        TL_account.TL_themes tL_themes;
        TL_account.TL_themes tL_themes2;
        String r02;
        j6 j6Var;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i3 = 0;
        switch (this.a) {
            case 0:
                int i10 = this.c;
                TLObject tLObject = this.b;
                k6.C[i10] = false;
                if (tLObject instanceof TL_account.TL_themes) {
                    TL_account.TL_themes tL_themes3 = (TL_account.TL_themes) tLObject;
                    k6.E[i10] = tL_themes3.hash;
                    k6.D[i10] = (int) (System.currentTimeMillis() / 1000);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int size = k6.F.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        j6 j6Var2 = (j6) k6.F.get(i11);
                        if (j6Var2.G != null && j6Var2.F == i10) {
                            arrayList2.add(j6Var2);
                        } else if (j6Var2.c0 != null) {
                            for (int i12 = 0; i12 < j6Var2.c0.size(); i12++) {
                                g6 g6Var = (g6) j6Var2.c0.get(i12);
                                if (g6Var.r != null && g6Var.t == i10) {
                                    arrayList2.add(g6Var);
                                }
                            }
                        }
                    }
                    int size2 = tL_themes3.themes.size();
                    int i13 = 0;
                    boolean z11 = false;
                    boolean z12 = false;
                    while (i13 < size2) {
                        TLRPC.TL_theme tL_theme = tL_themes3.themes.get(i13);
                        if (tL_theme != null) {
                            if (tL_theme.isDefault) {
                                arrayList.add(tL_theme);
                            }
                            ArrayList<TLRPC.ThemeSettings> arrayList3 = tL_theme.settings;
                            if (arrayList3 == null || arrayList3.size() <= 0) {
                                tL_themes = tL_themes3;
                                String str = "remote" + tL_theme.id;
                                HashMap hashMap = k6.H;
                                j6 j6Var3 = (j6) hashMap.get(str);
                                if (j6Var3 == null) {
                                    j6Var3 = new j6();
                                    j6Var3.F = i10;
                                    j6Var3.b = new File(org.telegram.messenger.t0.h(), t4.c.q(str, ".attheme")).getAbsolutePath();
                                    k6.F.add(j6Var3);
                                    k6.G.add(j6Var3);
                                    z12 = true;
                                } else {
                                    arrayList2.remove(j6Var3);
                                }
                                j6Var3.a = tL_theme.title;
                                j6Var3.G = tL_theme;
                                hashMap.put(j6Var3.m(), j6Var3);
                                i13++;
                                tL_themes3 = tL_themes;
                                i3 = 0;
                            } else {
                                int i14 = i3;
                                while (i14 < tL_theme.settings.size()) {
                                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.get(i14);
                                    if (themeSettings == null || (r02 = k6.r0(themeSettings)) == null || (j6Var = (j6) k6.H.get(r02)) == null || j6Var.c0 == null) {
                                        tL_themes2 = tL_themes3;
                                    } else {
                                        tL_themes2 = tL_themes3;
                                        g6 g6Var2 = (g6) j6Var.d0.get(tL_theme.id);
                                        if (g6Var2 != null) {
                                            if (!j6.a(g6Var2, themeSettings)) {
                                                File e10 = g6Var2.e();
                                                if (e10 != null) {
                                                    e10.delete();
                                                }
                                                j6.i(g6Var2, themeSettings);
                                                j6 j6Var4 = k6.I;
                                                if (j6Var4 == j6Var && j6Var4.Z == g6Var2.a) {
                                                    k6.t1(false, false);
                                                    j6 j6Var5 = k6.I;
                                                    k6.K1(j6Var5, k6.J == j6Var5, -1, null);
                                                }
                                                z11 = true;
                                                z12 = true;
                                            }
                                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                                            g6Var2.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                                            arrayList2.remove(g6Var2);
                                        } else {
                                            g6Var2 = j6Var.f(tL_theme, i10, i14);
                                            if (!TextUtils.isEmpty(g6Var2.o)) {
                                                z11 = true;
                                            }
                                        }
                                        g6Var2.z = tL_theme.isDefault;
                                    }
                                    i14++;
                                    tL_themes3 = tL_themes2;
                                }
                            }
                        }
                        tL_themes = tL_themes3;
                        i13++;
                        tL_themes3 = tL_themes;
                        i3 = 0;
                    }
                    int size3 = arrayList2.size();
                    for (int i15 = 0; i15 < size3; i15++) {
                        Object obj = arrayList2.get(i15);
                        if (obj instanceof j6) {
                            j6 j6Var6 = (j6) obj;
                            j6Var6.t();
                            k6.G.remove(j6Var6);
                            HashMap hashMap2 = k6.H;
                            hashMap2.remove(j6Var6.a);
                            b6 b6Var = j6Var6.j0;
                            if (b6Var != null) {
                                b6.a(b6Var);
                            }
                            k6.F.remove(j6Var6);
                            new File(j6Var6.b).delete();
                            if (k6.K == j6Var6) {
                                k6.K = k6.L;
                            } else if (k6.J == j6Var6) {
                                k6.J = (j6) hashMap2.get("Dark Blue");
                                z10 = true;
                                if (k6.I == j6Var6) {
                                    k6.u(z10 ? k6.J : k6.K, true, z10);
                                }
                            }
                            z10 = false;
                            if (k6.I == j6Var6) {
                            }
                        } else if (obj instanceof g6) {
                            g6 g6Var3 = (g6) obj;
                            if (k6.l0(g6Var3.b, g6Var3, false) && k6.I == g6Var3.b) {
                                k6.t1(false, false);
                                j6 j6Var7 = k6.I;
                                k6.K1(j6Var7, k6.J == j6Var7, -1, null);
                            }
                        }
                    }
                    k6.y1(true, false);
                    Collections.sort(k6.F, new tq(15));
                    if (z12) {
                        hs.e().k(hs.o4, new Object[0]);
                    }
                    if (z11) {
                        d6.a(true);
                    }
                    li b02 = li.b0(i10);
                    SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("emojithemes_config_" + i10, 0).edit();
                    edit.putInt("count", arrayList.size());
                    for (int i16 = 0; i16 < arrayList.size(); i16++) {
                        TLRPC.TL_theme tL_theme2 = (TLRPC.TL_theme) arrayList.get(i16);
                        SerializedData serializedData = new SerializedData(tL_theme2.getObjectSize());
                        tL_theme2.serializeToStream(serializedData);
                        edit.putString("theme_" + i16, Utilities.f(serializedData.toByteArray()));
                    }
                    edit.apply();
                    if (arrayList.isEmpty()) {
                        b02.B0.clear();
                        hs.e().k(hs.U4, new Object[0]);
                        break;
                    } else {
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(new uo(p3.b(i10)));
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            p3 c2 = p3.c(i10, (TLRPC.TL_theme) arrayList.get(i17));
                            uo uoVar = new uo(c2);
                            if (c2.f.size() >= 4) {
                                arrayList4.add(uoVar);
                            }
                        }
                        org.telegram.messenger.d4.s.c(new androidx.activity.g(b02, arrayList4, i10));
                        break;
                    }
                }
                break;
            case 1:
                TLObject tLObject2 = this.b;
                int i18 = this.c;
                String str2 = LaunchActivity.E1;
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    li.b0(i18).E0(false, true, null);
                    break;
                }
                break;
            default:
                TLObject tLObject3 = this.b;
                int i19 = this.c;
                String str3 = LaunchActivity.E1;
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    li.b0(i19).E0(false, true, null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ m5(int i3, TLObject tLObject) {
        this.a = 0;
        this.c = i3;
        this.b = tLObject;
    }
}
