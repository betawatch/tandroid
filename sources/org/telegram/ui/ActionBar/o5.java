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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ int c;

    public /* synthetic */ o5(int i7, int i10, TLObject tLObject) {
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
        l6 l6Var;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i7 = 0;
        switch (this.a) {
            case 0:
                int i10 = this.c;
                TLObject tLObject = this.b;
                m6.C[i10] = false;
                if (tLObject instanceof TL_account.TL_themes) {
                    TL_account.TL_themes tL_themes3 = (TL_account.TL_themes) tLObject;
                    m6.E[i10] = tL_themes3.hash;
                    m6.D[i10] = (int) (System.currentTimeMillis() / 1000);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int size = m6.F.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        l6 l6Var2 = (l6) m6.F.get(i11);
                        if (l6Var2.F != null && l6Var2.E == i10) {
                            arrayList2.add(l6Var2);
                        } else if (l6Var2.b0 != null) {
                            for (int i12 = 0; i12 < l6Var2.b0.size(); i12++) {
                                j6 j6Var = (j6) l6Var2.b0.get(i12);
                                if (j6Var.r != null && j6Var.t == i10) {
                                    arrayList2.add(j6Var);
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
                                HashMap hashMap = m6.H;
                                l6 l6Var3 = (l6) hashMap.get(str);
                                if (l6Var3 == null) {
                                    l6Var3 = new l6();
                                    l6Var3.E = i10;
                                    l6Var3.b = new File(org.telegram.messenger.t0.h(), rf.b.r(str, ".attheme")).getAbsolutePath();
                                    m6.F.add(l6Var3);
                                    m6.G.add(l6Var3);
                                    z11 = true;
                                } else {
                                    arrayList2.remove(l6Var3);
                                }
                                l6Var3.a = tL_theme.title;
                                l6Var3.F = tL_theme;
                                hashMap.put(l6Var3.m(), l6Var3);
                                i13++;
                                tL_themes3 = tL_themes;
                                i7 = 0;
                            } else {
                                int i14 = i7;
                                while (i14 < tL_theme.settings.size()) {
                                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.get(i14);
                                    if (themeSettings == null || (r02 = m6.r0(themeSettings)) == null || (l6Var = (l6) m6.H.get(r02)) == null || l6Var.b0 == null) {
                                        tL_themes2 = tL_themes3;
                                    } else {
                                        tL_themes2 = tL_themes3;
                                        j6 j6Var2 = (j6) l6Var.c0.get(tL_theme.id);
                                        if (j6Var2 != null) {
                                            if (!l6.a(j6Var2, themeSettings)) {
                                                File e10 = j6Var2.e();
                                                if (e10 != null) {
                                                    e10.delete();
                                                }
                                                l6.i(j6Var2, themeSettings);
                                                l6 l6Var4 = m6.I;
                                                if (l6Var4 == l6Var && l6Var4.Y == j6Var2.a) {
                                                    m6.t1(false, false);
                                                    l6 l6Var5 = m6.I;
                                                    m6.K1(l6Var5, m6.J == l6Var5, -1, null);
                                                }
                                                z10 = true;
                                                z11 = true;
                                            }
                                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                                            j6Var2.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                                            arrayList2.remove(j6Var2);
                                        } else {
                                            j6Var2 = l6Var.f(tL_theme, i10, i14);
                                            if (!TextUtils.isEmpty(j6Var2.o)) {
                                                z10 = true;
                                            }
                                        }
                                        j6Var2.z = tL_theme.isDefault;
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
                        if (obj instanceof l6) {
                            l6 l6Var6 = (l6) obj;
                            l6Var6.t();
                            m6.G.remove(l6Var6);
                            HashMap hashMap2 = m6.H;
                            hashMap2.remove(l6Var6.a);
                            e6 e6Var = l6Var6.i0;
                            if (e6Var != null) {
                                e6.a(e6Var);
                            }
                            m6.F.remove(l6Var6);
                            new File(l6Var6.b).delete();
                            if (m6.K == l6Var6) {
                                m6.K = m6.L;
                            } else if (m6.J == l6Var6) {
                                m6.J = (l6) hashMap2.get("Dark Blue");
                                z9 = true;
                                if (m6.I == l6Var6) {
                                    m6.u(z9 ? m6.J : m6.K, true, z9);
                                }
                            }
                            z9 = false;
                            if (m6.I == l6Var6) {
                            }
                        } else if (obj instanceof j6) {
                            j6 j6Var3 = (j6) obj;
                            if (m6.l0(j6Var3.b, j6Var3, false) && m6.I == j6Var3.b) {
                                m6.t1(false, false);
                                l6 l6Var7 = m6.I;
                                m6.K1(l6Var7, m6.J == l6Var7, -1, null);
                            }
                        }
                    }
                    m6.y1(true, false);
                    Collections.sort(m6.F, new jl(25));
                    if (z11) {
                        qs.e().k(qs.o4, new Object[0]);
                    }
                    if (z10) {
                        g6.a(true);
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
                        arrayList4.add(new uo(s3.b(i10)));
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            s3 c10 = s3.c(i10, (TLRPC.TL_theme) arrayList.get(i17));
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

    public /* synthetic */ o5(int i7, TLObject tLObject) {
        this.a = 0;
        this.c = i7;
        this.b = tLObject;
    }
}
