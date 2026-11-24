// default package

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class az5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ int c;

    public /* synthetic */ az5(int i, TLObject tLObject) {
        this.a = (byte) 2;
        this.c = i;
        this.b = tLObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f4 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        String q0;
        akb akbVar;
        TLRPC.WallPaperSettings wallPaperSettings;
        switch (this.a) {
            case 0:
                TLObject tLObject = this.b;
                int i = this.c;
                String str = LaunchActivity.C1;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    hq6.d0(i).G0(false, true, null);
                    break;
                }
                break;
            case 1:
                TLObject tLObject2 = this.b;
                int i2 = this.c;
                String str2 = LaunchActivity.C1;
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    hq6.d0(i2).G0(false, true, null);
                    break;
                }
                break;
            default:
                int i3 = this.c;
                TLObject tLObject3 = this.b;
                bkb.C[i3] = false;
                if (tLObject3 instanceof TL_account.TL_themes) {
                    TL_account.TL_themes tL_themes = (TL_account.TL_themes) tLObject3;
                    bkb.E[i3] = tL_themes.hash;
                    bkb.D[i3] = (int) (System.currentTimeMillis() / 1000);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int size = bkb.F.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        akb akbVar2 = (akb) bkb.F.get(i4);
                        if (akbVar2.G != null && akbVar2.F == i3) {
                            arrayList2.add(akbVar2);
                        } else if (akbVar2.c0 != null) {
                            for (int i5 = 0; i5 < akbVar2.c0.size(); i5++) {
                                zjb zjbVar = (zjb) akbVar2.c0.get(i5);
                                if (zjbVar.r != null && zjbVar.t == i3) {
                                    arrayList2.add(zjbVar);
                                }
                            }
                        }
                    }
                    int size2 = tL_themes.themes.size();
                    boolean z2 = false;
                    for (int i6 = 0; i6 < size2; i6++) {
                        TLRPC.TL_theme tL_theme = tL_themes.themes.get(i6);
                        if (tL_theme != null) {
                            if (tL_theme.isDefault) {
                                arrayList.add(tL_theme);
                            }
                            ArrayList<TLRPC.ThemeSettings> arrayList3 = tL_theme.settings;
                            if (arrayList3 == null || arrayList3.size() <= 0) {
                                String str3 = "remote" + tL_theme.id;
                                HashMap hashMap = bkb.H;
                                akb akbVar3 = (akb) hashMap.get(str3);
                                if (akbVar3 == null) {
                                    akbVar3 = new akb();
                                    akbVar3.F = i3;
                                    akbVar3.b = new File(a.h(), str3.concat(".attheme")).getAbsolutePath();
                                    bkb.F.add(akbVar3);
                                    bkb.G.add(akbVar3);
                                    z2 = true;
                                } else {
                                    arrayList2.remove(akbVar3);
                                }
                                akbVar3.a = tL_theme.title;
                                akbVar3.G = tL_theme;
                                hashMap.put(akbVar3.k(), akbVar3);
                            } else {
                                for (int i7 = 0; i7 < tL_theme.settings.size(); i7++) {
                                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.get(i7);
                                    if (themeSettings != null && (q0 = bkb.q0(themeSettings)) != null && (akbVar = (akb) bkb.H.get(q0)) != null && akbVar.c0 != null) {
                                        zjb zjbVar2 = (zjb) akbVar.d0.get(tL_theme.id);
                                        if (zjbVar2 != null) {
                                            if (!akb.a(zjbVar2, themeSettings)) {
                                                akb.g(zjbVar2, themeSettings);
                                                akb akbVar4 = bkb.I;
                                                if (akbVar4 == akbVar && akbVar4.Z == zjbVar2.a) {
                                                    bkb.r1(false, false);
                                                    akb akbVar5 = bkb.I;
                                                    bkb.I1(akbVar5, bkb.J == akbVar5, -1, null);
                                                }
                                                z2 = true;
                                            }
                                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                                            zjbVar2.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                                            arrayList2.remove(zjbVar2);
                                        } else {
                                            zjbVar2 = akbVar.d(tL_theme, i3, i7);
                                            TextUtils.isEmpty(zjbVar2.o);
                                        }
                                        zjbVar2.z = tL_theme.isDefault;
                                    }
                                }
                            }
                        }
                    }
                    int size3 = arrayList2.size();
                    for (int i8 = 0; i8 < size3; i8++) {
                        Object obj = arrayList2.get(i8);
                        if (obj instanceof akb) {
                            akb akbVar6 = (akb) obj;
                            akbVar6.s();
                            bkb.G.remove(akbVar6);
                            HashMap hashMap2 = bkb.H;
                            hashMap2.remove(akbVar6.a);
                            vjb vjbVar = akbVar6.j0;
                            if (vjbVar != null) {
                                vjbVar.a();
                            }
                            bkb.F.remove(akbVar6);
                            new File(akbVar6.b).delete();
                            if (bkb.K == akbVar6) {
                                bkb.K = bkb.L;
                            } else if (bkb.J == akbVar6) {
                                bkb.J = (akb) hashMap2.get("Dark Blue");
                                z = true;
                                if (bkb.I == akbVar6) {
                                    bkb.t(z ? bkb.J : bkb.K, true, z);
                                }
                            }
                            z = false;
                            if (bkb.I == akbVar6) {
                            }
                        } else if (obj instanceof zjb) {
                            zjb zjbVar3 = (zjb) obj;
                            if (bkb.j0(zjbVar3.b, zjbVar3, false) && bkb.I == zjbVar3.b) {
                                bkb.r1(false, false);
                                akb akbVar7 = bkb.I;
                                bkb.I1(akbVar7, bkb.J == akbVar7, -1, null);
                            }
                        }
                    }
                    bkb.w1(true, false);
                    Collections.sort(bkb.F, new pva((byte) 2));
                    if (z2) {
                        kk7.e().k(kk7.q4, new Object[0]);
                    }
                    hq6 d0 = hq6.d0(i3);
                    SharedPreferences.Editor edit = a.b.getSharedPreferences("emojithemes_config_" + i3, 0).edit();
                    edit.putInt("count", arrayList.size());
                    for (int i9 = 0; i9 < arrayList.size(); i9++) {
                        TLRPC.TL_theme tL_theme2 = (TLRPC.TL_theme) arrayList.get(i9);
                        SerializedData serializedData = new SerializedData(tL_theme2.getObjectSize());
                        tL_theme2.serializeToStream(serializedData);
                        edit.putString("theme_" + i9, Utilities.f(serializedData.toByteArray()));
                    }
                    edit.apply();
                    if (arrayList.isEmpty()) {
                        d0.B0.clear();
                        kk7.e().k(kk7.W4, new Object[0]);
                        break;
                    } else {
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(new wd2(jy3.b(i3)));
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            jy3 c = jy3.c(i3, (TLRPC.TL_theme) arrayList.get(i10));
                            wd2 wd2Var = new wd2(c);
                            if (c.f.size() >= 4) {
                                arrayList4.add(wd2Var);
                            }
                        }
                        je2.s.c(new jq(d0, arrayList4, i3));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ az5(TLObject tLObject, int i, byte b) {
        this.a = b;
        this.b = tLObject;
        this.c = i;
    }
}
