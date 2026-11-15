package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gl;
import org.telegram.messenger.ns;
import org.telegram.messenger.si;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.dp;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class m5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ int c;

    public /* synthetic */ m5(int i7, int i10, TLObject tLObject) {
        this.a = i10;
        this.b = tLObject;
        this.c = i7;
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
        i6 i6Var;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i7 = 0;
        switch (this.a) {
            case 0:
                int i10 = this.c;
                TLObject tLObject = this.b;
                j6.C[i10] = false;
                if (tLObject instanceof TL_account.TL_themes) {
                    TL_account.TL_themes tL_themes3 = (TL_account.TL_themes) tLObject;
                    j6.E[i10] = tL_themes3.hash;
                    j6.D[i10] = (int) (System.currentTimeMillis() / 1000);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int size = j6.F.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        i6 i6Var2 = (i6) j6.F.get(i11);
                        if (i6Var2.G != null && i6Var2.F == i10) {
                            arrayList2.add(i6Var2);
                        } else if (i6Var2.c0 != null) {
                            for (int i12 = 0; i12 < i6Var2.c0.size(); i12++) {
                                g6 g6Var = (g6) i6Var2.c0.get(i12);
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
                                HashMap hashMap = j6.H;
                                i6 i6Var3 = (i6) hashMap.get(str);
                                if (i6Var3 == null) {
                                    i6Var3 = new i6();
                                    i6Var3.F = i10;
                                    i6Var3.b = new File(org.telegram.messenger.t0.h(), r.b.v(str, ".attheme")).getAbsolutePath();
                                    j6.F.add(i6Var3);
                                    j6.G.add(i6Var3);
                                    z12 = true;
                                } else {
                                    arrayList2.remove(i6Var3);
                                }
                                i6Var3.a = tL_theme.title;
                                i6Var3.G = tL_theme;
                                hashMap.put(i6Var3.m(), i6Var3);
                                i13++;
                                tL_themes3 = tL_themes;
                                i7 = 0;
                            } else {
                                int i14 = i7;
                                while (i14 < tL_theme.settings.size()) {
                                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.get(i14);
                                    if (themeSettings == null || (r02 = j6.r0(themeSettings)) == null || (i6Var = (i6) j6.H.get(r02)) == null || i6Var.c0 == null) {
                                        tL_themes2 = tL_themes3;
                                    } else {
                                        tL_themes2 = tL_themes3;
                                        g6 g6Var2 = (g6) i6Var.d0.get(tL_theme.id);
                                        if (g6Var2 != null) {
                                            if (!i6.a(g6Var2, themeSettings)) {
                                                File e10 = g6Var2.e();
                                                if (e10 != null) {
                                                    e10.delete();
                                                }
                                                i6.i(g6Var2, themeSettings);
                                                i6 i6Var4 = j6.I;
                                                if (i6Var4 == i6Var && i6Var4.Z == g6Var2.a) {
                                                    j6.t1(false, false);
                                                    i6 i6Var5 = j6.I;
                                                    j6.K1(i6Var5, j6.J == i6Var5, -1, null);
                                                }
                                                z11 = true;
                                                z12 = true;
                                            }
                                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                                            g6Var2.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                                            arrayList2.remove(g6Var2);
                                        } else {
                                            g6Var2 = i6Var.f(tL_theme, i10, i14);
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
                        i7 = 0;
                    }
                    int size3 = arrayList2.size();
                    for (int i15 = 0; i15 < size3; i15++) {
                        Object obj = arrayList2.get(i15);
                        if (obj instanceof i6) {
                            i6 i6Var6 = (i6) obj;
                            i6Var6.t();
                            j6.G.remove(i6Var6);
                            HashMap hashMap2 = j6.H;
                            hashMap2.remove(i6Var6.a);
                            b6 b6Var = i6Var6.j0;
                            if (b6Var != null) {
                                b6.a(b6Var);
                            }
                            j6.F.remove(i6Var6);
                            new File(i6Var6.b).delete();
                            if (j6.K == i6Var6) {
                                j6.K = j6.L;
                            } else if (j6.J == i6Var6) {
                                j6.J = (i6) hashMap2.get("Dark Blue");
                                z10 = true;
                                if (j6.I == i6Var6) {
                                    j6.u(z10 ? j6.J : j6.K, true, z10);
                                }
                            }
                            z10 = false;
                            if (j6.I == i6Var6) {
                            }
                        } else if (obj instanceof g6) {
                            g6 g6Var3 = (g6) obj;
                            if (j6.l0(g6Var3.b, g6Var3, false) && j6.I == g6Var3.b) {
                                j6.t1(false, false);
                                i6 i6Var7 = j6.I;
                                j6.K1(i6Var7, j6.J == i6Var7, -1, null);
                            }
                        }
                    }
                    j6.y1(true, false);
                    Collections.sort(j6.F, new gl(24));
                    if (z12) {
                        ns.e().k(ns.o4, new Object[0]);
                    }
                    if (z11) {
                        d6.a(true);
                    }
                    si b02 = si.b0(i10);
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
                        ns.e().k(ns.U4, new Object[0]);
                        break;
                    } else {
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(new dp(p3.b(i10)));
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            p3 c10 = p3.c(i10, (TLRPC.TL_theme) arrayList.get(i17));
                            dp dpVar = new dp(c10);
                            if (c10.f.size() >= 4) {
                                arrayList4.add(dpVar);
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
                String str2 = LaunchActivity.C1;
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    si.b0(i18).E0(false, true, null);
                    break;
                }
                break;
            default:
                TLObject tLObject3 = this.b;
                int i19 = this.c;
                String str3 = LaunchActivity.C1;
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    si.b0(i19).E0(false, true, null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ m5(int i7, TLObject tLObject) {
        this.a = 0;
        this.c = i7;
        this.b = tLObject;
    }
}
