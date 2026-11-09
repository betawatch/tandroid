package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.jl;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.uo;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ int c;

    public /* synthetic */ n5(int i7, int i10, TLObject tLObject) {
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
        boolean z9;
        TL_account.TL_themes tL_themes;
        TL_account.TL_themes tL_themes2;
        String r02;
        k6 k6Var;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i7 = 0;
        switch (this.a) {
            case 0:
                int i10 = this.c;
                TLObject tLObject = this.b;
                l6.C[i10] = false;
                if (tLObject instanceof TL_account.TL_themes) {
                    TL_account.TL_themes tL_themes3 = (TL_account.TL_themes) tLObject;
                    l6.E[i10] = tL_themes3.hash;
                    l6.D[i10] = (int) (System.currentTimeMillis() / 1000);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int size = l6.F.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        k6 k6Var2 = (k6) l6.F.get(i11);
                        if (k6Var2.F != null && k6Var2.E == i10) {
                            arrayList2.add(k6Var2);
                        } else if (k6Var2.b0 != null) {
                            for (int i12 = 0; i12 < k6Var2.b0.size(); i12++) {
                                i6 i6Var = (i6) k6Var2.b0.get(i12);
                                if (i6Var.r != null && i6Var.t == i10) {
                                    arrayList2.add(i6Var);
                                }
                            }
                        }
                    }
                    int size2 = tL_themes3.themes.size();
                    int i13 = 0;
                    boolean z10 = false;
                    boolean z11 = false;
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
                                HashMap hashMap = l6.H;
                                k6 k6Var3 = (k6) hashMap.get(str);
                                if (k6Var3 == null) {
                                    k6Var3 = new k6();
                                    k6Var3.E = i10;
                                    k6Var3.b = new File(org.telegram.messenger.t0.h(), rf.b.r(str, ".attheme")).getAbsolutePath();
                                    l6.F.add(k6Var3);
                                    l6.G.add(k6Var3);
                                    z11 = true;
                                } else {
                                    arrayList2.remove(k6Var3);
                                }
                                k6Var3.a = tL_theme.title;
                                k6Var3.F = tL_theme;
                                hashMap.put(k6Var3.m(), k6Var3);
                                i13++;
                                tL_themes3 = tL_themes;
                                i7 = 0;
                            } else {
                                int i14 = i7;
                                while (i14 < tL_theme.settings.size()) {
                                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.get(i14);
                                    if (themeSettings == null || (r02 = l6.r0(themeSettings)) == null || (k6Var = (k6) l6.H.get(r02)) == null || k6Var.b0 == null) {
                                        tL_themes2 = tL_themes3;
                                    } else {
                                        tL_themes2 = tL_themes3;
                                        i6 i6Var2 = (i6) k6Var.c0.get(tL_theme.id);
                                        if (i6Var2 != null) {
                                            if (!k6.a(i6Var2, themeSettings)) {
                                                File e10 = i6Var2.e();
                                                if (e10 != null) {
                                                    e10.delete();
                                                }
                                                k6.i(i6Var2, themeSettings);
                                                k6 k6Var4 = l6.I;
                                                if (k6Var4 == k6Var && k6Var4.Y == i6Var2.a) {
                                                    l6.t1(false, false);
                                                    k6 k6Var5 = l6.I;
                                                    l6.K1(k6Var5, l6.J == k6Var5, -1, null);
                                                }
                                                z10 = true;
                                                z11 = true;
                                            }
                                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                                            i6Var2.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                                            arrayList2.remove(i6Var2);
                                        } else {
                                            i6Var2 = k6Var.f(tL_theme, i10, i14);
                                            if (!TextUtils.isEmpty(i6Var2.o)) {
                                                z10 = true;
                                            }
                                        }
                                        i6Var2.z = tL_theme.isDefault;
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
                        if (obj instanceof k6) {
                            k6 k6Var6 = (k6) obj;
                            k6Var6.t();
                            l6.G.remove(k6Var6);
                            HashMap hashMap2 = l6.H;
                            hashMap2.remove(k6Var6.a);
                            d6 d6Var = k6Var6.i0;
                            if (d6Var != null) {
                                d6.a(d6Var);
                            }
                            l6.F.remove(k6Var6);
                            new File(k6Var6.b).delete();
                            if (l6.K == k6Var6) {
                                l6.K = l6.L;
                            } else if (l6.J == k6Var6) {
                                l6.J = (k6) hashMap2.get("Dark Blue");
                                z9 = true;
                                if (l6.I == k6Var6) {
                                    l6.u(z9 ? l6.J : l6.K, true, z9);
                                }
                            }
                            z9 = false;
                            if (l6.I == k6Var6) {
                            }
                        } else if (obj instanceof i6) {
                            i6 i6Var3 = (i6) obj;
                            if (l6.l0(i6Var3.b, i6Var3, false) && l6.I == i6Var3.b) {
                                l6.t1(false, false);
                                k6 k6Var7 = l6.I;
                                l6.K1(k6Var7, l6.J == k6Var7, -1, null);
                            }
                        }
                    }
                    l6.y1(true, false);
                    Collections.sort(l6.F, new jl(25));
                    if (z11) {
                        qs.e().k(qs.o4, new Object[0]);
                    }
                    if (z10) {
                        f6.a(true);
                    }
                    ui b02 = ui.b0(i10);
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
                        b02.A0.clear();
                        qs.e().k(qs.U4, new Object[0]);
                        break;
                    } else {
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(new uo(r3.b(i10)));
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            r3 c10 = r3.c(i10, (TLRPC.TL_theme) arrayList.get(i17));
                            uo uoVar = new uo(c10);
                            if (c10.f.size() >= 4) {
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
                String str2 = LaunchActivity.B1;
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    ui.b0(i18).E0(false, true, null);
                    break;
                }
                break;
            default:
                TLObject tLObject3 = this.b;
                int i19 = this.c;
                String str3 = LaunchActivity.B1;
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    ui.b0(i19).E0(false, true, null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ n5(int i7, TLObject tLObject) {
        this.a = 0;
        this.c = i7;
        this.b = tLObject;
    }
}
