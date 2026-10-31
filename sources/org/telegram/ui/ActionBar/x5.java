package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bk;
import org.telegram.messenger.ui;
import org.telegram.messenger.zs;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.cp;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class x5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ int c;

    public /* synthetic */ x5(int i10, int i11, TLObject tLObject) {
        this.a = i11;
        this.b = tLObject;
        this.c = i10;
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
        s6 s6Var;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i10 = 0;
        switch (this.a) {
            case 0:
                int i11 = this.c;
                TLObject tLObject = this.b;
                t6.C[i11] = false;
                if (tLObject instanceof TL_account.TL_themes) {
                    TL_account.TL_themes tL_themes3 = (TL_account.TL_themes) tLObject;
                    t6.E[i11] = tL_themes3.hash;
                    t6.D[i11] = (int) (System.currentTimeMillis() / 1000);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int size = t6.F.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        s6 s6Var2 = (s6) t6.F.get(i12);
                        if (s6Var2.F != null && s6Var2.E == i11) {
                            arrayList2.add(s6Var2);
                        } else if (s6Var2.b0 != null) {
                            for (int i13 = 0; i13 < s6Var2.b0.size(); i13++) {
                                r6 r6Var = (r6) s6Var2.b0.get(i13);
                                if (r6Var.r != null && r6Var.t == i11) {
                                    arrayList2.add(r6Var);
                                }
                            }
                        }
                    }
                    int size2 = tL_themes3.themes.size();
                    int i14 = 0;
                    boolean z11 = false;
                    boolean z12 = false;
                    while (i14 < size2) {
                        TLRPC.TL_theme tL_theme = tL_themes3.themes.get(i14);
                        if (tL_theme != null) {
                            if (tL_theme.isDefault) {
                                arrayList.add(tL_theme);
                            }
                            ArrayList<TLRPC.ThemeSettings> arrayList3 = tL_theme.settings;
                            if (arrayList3 == null || arrayList3.size() <= 0) {
                                tL_themes = tL_themes3;
                                String str = "remote" + tL_theme.id;
                                HashMap hashMap = t6.H;
                                s6 s6Var3 = (s6) hashMap.get(str);
                                if (s6Var3 == null) {
                                    s6Var3 = new s6();
                                    s6Var3.E = i11;
                                    s6Var3.b = new File(org.telegram.messenger.w0.h(), sc.e.A(str, ".attheme")).getAbsolutePath();
                                    t6.F.add(s6Var3);
                                    t6.G.add(s6Var3);
                                    z12 = true;
                                } else {
                                    arrayList2.remove(s6Var3);
                                }
                                s6Var3.a = tL_theme.title;
                                s6Var3.F = tL_theme;
                                hashMap.put(s6Var3.m(), s6Var3);
                                i14++;
                                tL_themes3 = tL_themes;
                                i10 = 0;
                            } else {
                                int i15 = i10;
                                while (i15 < tL_theme.settings.size()) {
                                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.get(i15);
                                    if (themeSettings == null || (r02 = t6.r0(themeSettings)) == null || (s6Var = (s6) t6.H.get(r02)) == null || s6Var.b0 == null) {
                                        tL_themes2 = tL_themes3;
                                    } else {
                                        tL_themes2 = tL_themes3;
                                        r6 r6Var2 = (r6) s6Var.c0.get(tL_theme.id);
                                        if (r6Var2 != null) {
                                            if (!s6.a(r6Var2, themeSettings)) {
                                                File e = r6Var2.e();
                                                if (e != null) {
                                                    e.delete();
                                                }
                                                s6.i(r6Var2, themeSettings);
                                                s6 s6Var4 = t6.I;
                                                if (s6Var4 == s6Var && s6Var4.Y == r6Var2.a) {
                                                    t6.t1(false, false);
                                                    s6 s6Var5 = t6.I;
                                                    t6.K1(s6Var5, t6.J == s6Var5, -1, null);
                                                }
                                                z11 = true;
                                                z12 = true;
                                            }
                                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                                            r6Var2.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                                            arrayList2.remove(r6Var2);
                                        } else {
                                            r6Var2 = s6Var.f(tL_theme, i11, i15);
                                            if (!TextUtils.isEmpty(r6Var2.o)) {
                                                z11 = true;
                                            }
                                        }
                                        r6Var2.z = tL_theme.isDefault;
                                    }
                                    i15++;
                                    tL_themes3 = tL_themes2;
                                }
                            }
                        }
                        tL_themes = tL_themes3;
                        i14++;
                        tL_themes3 = tL_themes;
                        i10 = 0;
                    }
                    int size3 = arrayList2.size();
                    for (int i16 = 0; i16 < size3; i16++) {
                        Object obj = arrayList2.get(i16);
                        if (obj instanceof s6) {
                            s6 s6Var6 = (s6) obj;
                            s6Var6.t();
                            t6.G.remove(s6Var6);
                            HashMap hashMap2 = t6.H;
                            hashMap2.remove(s6Var6.a);
                            m6 m6Var = s6Var6.i0;
                            if (m6Var != null) {
                                m6.a(m6Var);
                            }
                            t6.F.remove(s6Var6);
                            new File(s6Var6.b).delete();
                            if (t6.K == s6Var6) {
                                t6.K = t6.L;
                            } else if (t6.J == s6Var6) {
                                t6.J = (s6) hashMap2.get("Dark Blue");
                                z10 = true;
                                if (t6.I == s6Var6) {
                                    t6.u(z10 ? t6.J : t6.K, true, z10);
                                }
                            }
                            z10 = false;
                            if (t6.I == s6Var6) {
                            }
                        } else if (obj instanceof r6) {
                            r6 r6Var3 = (r6) obj;
                            if (t6.l0(r6Var3.b, r6Var3, false) && t6.I == r6Var3.b) {
                                t6.t1(false, false);
                                s6 s6Var7 = t6.I;
                                t6.K1(s6Var7, t6.J == s6Var7, -1, null);
                            }
                        }
                    }
                    t6.y1(true, false);
                    Collections.sort(t6.F, new bk(27));
                    if (z12) {
                        zs.e().k(zs.o4, new Object[0]);
                    }
                    if (z11) {
                        o6.a(true);
                    }
                    ui b02 = ui.b0(i11);
                    SharedPreferences.Editor edit = org.telegram.messenger.w0.b.getSharedPreferences("emojithemes_config_" + i11, 0).edit();
                    edit.putInt("count", arrayList.size());
                    for (int i17 = 0; i17 < arrayList.size(); i17++) {
                        TLRPC.TL_theme tL_theme2 = (TLRPC.TL_theme) arrayList.get(i17);
                        SerializedData serializedData = new SerializedData(tL_theme2.getObjectSize());
                        tL_theme2.serializeToStream(serializedData);
                        edit.putString("theme_" + i17, Utilities.f(serializedData.toByteArray()));
                    }
                    edit.apply();
                    if (arrayList.isEmpty()) {
                        b02.A0.clear();
                        zs.e().k(zs.U4, new Object[0]);
                        break;
                    } else {
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(new cp(y3.b(i11)));
                        for (int i18 = 0; i18 < arrayList.size(); i18++) {
                            y3 c10 = y3.c(i11, (TLRPC.TL_theme) arrayList.get(i18));
                            cp cpVar = new cp(c10);
                            if (c10.f.size() >= 4) {
                                arrayList4.add(cpVar);
                            }
                        }
                        org.telegram.messenger.g4.s.c(new androidx.activity.g(b02, arrayList4, i11));
                        break;
                    }
                }
                break;
            case 1:
                TLObject tLObject2 = this.b;
                int i19 = this.c;
                Pattern pattern = LaunchActivity.D1;
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    ui.b0(i19).E0(false, true, null);
                    break;
                }
                break;
            default:
                TLObject tLObject3 = this.b;
                int i20 = this.c;
                Pattern pattern2 = LaunchActivity.D1;
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    ui.b0(i20).E0(false, true, null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ x5(int i10, TLObject tLObject) {
        this.a = 0;
        this.c = i10;
        this.b = tLObject;
    }
}
