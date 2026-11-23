package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.dl;
import org.telegram.messenger.ks;
import org.telegram.messenger.ri;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.jp;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class p5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ int c;

    public /* synthetic */ p5(int i7, int i10, TLObject tLObject) {
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
        m6 m6Var;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i7 = 0;
        switch (this.a) {
            case 0:
                int i10 = this.c;
                TLObject tLObject = this.b;
                n6.C[i10] = false;
                if (tLObject instanceof TL_account.TL_themes) {
                    TL_account.TL_themes tL_themes3 = (TL_account.TL_themes) tLObject;
                    n6.E[i10] = tL_themes3.hash;
                    n6.D[i10] = (int) (System.currentTimeMillis() / 1000);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int size = n6.F.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        m6 m6Var2 = (m6) n6.F.get(i11);
                        if (m6Var2.G != null && m6Var2.F == i10) {
                            arrayList2.add(m6Var2);
                        } else if (m6Var2.c0 != null) {
                            for (int i12 = 0; i12 < m6Var2.c0.size(); i12++) {
                                k6 k6Var = (k6) m6Var2.c0.get(i12);
                                if (k6Var.r != null && k6Var.t == i10) {
                                    arrayList2.add(k6Var);
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
                                HashMap hashMap = n6.H;
                                m6 m6Var3 = (m6) hashMap.get(str);
                                if (m6Var3 == null) {
                                    m6Var3 = new m6();
                                    m6Var3.F = i10;
                                    m6Var3.b = new File(org.telegram.messenger.t0.h(), p5.c.v(str, ".attheme")).getAbsolutePath();
                                    n6.F.add(m6Var3);
                                    n6.G.add(m6Var3);
                                    z12 = true;
                                } else {
                                    arrayList2.remove(m6Var3);
                                }
                                m6Var3.a = tL_theme.title;
                                m6Var3.G = tL_theme;
                                hashMap.put(m6Var3.m(), m6Var3);
                                i13++;
                                tL_themes3 = tL_themes;
                                i7 = 0;
                            } else {
                                int i14 = i7;
                                while (i14 < tL_theme.settings.size()) {
                                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.get(i14);
                                    if (themeSettings == null || (r02 = n6.r0(themeSettings)) == null || (m6Var = (m6) n6.H.get(r02)) == null || m6Var.c0 == null) {
                                        tL_themes2 = tL_themes3;
                                    } else {
                                        tL_themes2 = tL_themes3;
                                        k6 k6Var2 = (k6) m6Var.d0.get(tL_theme.id);
                                        if (k6Var2 != null) {
                                            if (!m6.a(k6Var2, themeSettings)) {
                                                File e10 = k6Var2.e();
                                                if (e10 != null) {
                                                    e10.delete();
                                                }
                                                m6.i(k6Var2, themeSettings);
                                                m6 m6Var4 = n6.I;
                                                if (m6Var4 == m6Var && m6Var4.Z == k6Var2.a) {
                                                    n6.t1(false, false);
                                                    m6 m6Var5 = n6.I;
                                                    n6.K1(m6Var5, n6.J == m6Var5, -1, null);
                                                }
                                                z11 = true;
                                                z12 = true;
                                            }
                                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                                            k6Var2.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                                            arrayList2.remove(k6Var2);
                                        } else {
                                            k6Var2 = m6Var.f(tL_theme, i10, i14);
                                            if (!TextUtils.isEmpty(k6Var2.o)) {
                                                z11 = true;
                                            }
                                        }
                                        k6Var2.z = tL_theme.isDefault;
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
                        if (obj instanceof m6) {
                            m6 m6Var6 = (m6) obj;
                            m6Var6.t();
                            n6.G.remove(m6Var6);
                            HashMap hashMap2 = n6.H;
                            hashMap2.remove(m6Var6.a);
                            e6 e6Var = m6Var6.j0;
                            if (e6Var != null) {
                                e6.a(e6Var);
                            }
                            n6.F.remove(m6Var6);
                            new File(m6Var6.b).delete();
                            if (n6.K == m6Var6) {
                                n6.K = n6.L;
                            } else if (n6.J == m6Var6) {
                                n6.J = (m6) hashMap2.get("Dark Blue");
                                z10 = true;
                                if (n6.I == m6Var6) {
                                    n6.u(z10 ? n6.J : n6.K, true, z10);
                                }
                            }
                            z10 = false;
                            if (n6.I == m6Var6) {
                            }
                        } else if (obj instanceof k6) {
                            k6 k6Var3 = (k6) obj;
                            if (n6.l0(k6Var3.b, k6Var3, false) && n6.I == k6Var3.b) {
                                n6.t1(false, false);
                                m6 m6Var7 = n6.I;
                                n6.K1(m6Var7, n6.J == m6Var7, -1, null);
                            }
                        }
                    }
                    n6.y1(true, false);
                    Collections.sort(n6.F, new dl(24));
                    if (z12) {
                        ks.e().k(ks.r4, new Object[0]);
                    }
                    if (z11) {
                        h6.a(true);
                    }
                    ri d02 = ri.d0(i10);
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
                        d02.B0.clear();
                        ks.e().k(ks.X4, new Object[0]);
                        break;
                    } else {
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(new jp(s3.b(i10)));
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            s3 c10 = s3.c(i10, (TLRPC.TL_theme) arrayList.get(i17));
                            jp jpVar = new jp(c10);
                            if (c10.f.size() >= 4) {
                                arrayList4.add(jpVar);
                            }
                        }
                        org.telegram.messenger.f4.s.c(new androidx.activity.g(d02, arrayList4, i10));
                        break;
                    }
                }
                break;
            case 1:
                TLObject tLObject2 = this.b;
                int i18 = this.c;
                String str2 = LaunchActivity.C1;
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    ri.d0(i18).H0(false, true, null);
                    break;
                }
                break;
            default:
                TLObject tLObject3 = this.b;
                int i19 = this.c;
                String str3 = LaunchActivity.C1;
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    ri.d0(i19).H0(false, true, null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ p5(int i7, TLObject tLObject) {
        this.a = 0;
        this.c = i7;
        this.b = tLObject;
    }
}
