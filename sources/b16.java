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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b16 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ int c;

    public /* synthetic */ b16(int i, TLObject tLObject) {
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
        znb znbVar;
        TLRPC.WallPaperSettings wallPaperSettings;
        switch (this.a) {
            case 0:
                TLObject tLObject = this.b;
                int i = this.c;
                String str = LaunchActivity.C1;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    ls6.d0(i).G0(false, true, null);
                    break;
                }
                break;
            case 1:
                TLObject tLObject2 = this.b;
                int i2 = this.c;
                String str2 = LaunchActivity.C1;
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    ls6.d0(i2).G0(false, true, null);
                    break;
                }
                break;
            default:
                int i3 = this.c;
                TLObject tLObject3 = this.b;
                aob.C[i3] = false;
                if (tLObject3 instanceof TL_account.TL_themes) {
                    TL_account.TL_themes tL_themes = (TL_account.TL_themes) tLObject3;
                    aob.E[i3] = tL_themes.hash;
                    aob.D[i3] = (int) (System.currentTimeMillis() / 1000);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int size = aob.F.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        znb znbVar2 = (znb) aob.F.get(i4);
                        if (znbVar2.G != null && znbVar2.F == i3) {
                            arrayList2.add(znbVar2);
                        } else if (znbVar2.c0 != null) {
                            for (int i5 = 0; i5 < znbVar2.c0.size(); i5++) {
                                ynb ynbVar = (ynb) znbVar2.c0.get(i5);
                                if (ynbVar.r != null && ynbVar.t == i3) {
                                    arrayList2.add(ynbVar);
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
                                HashMap hashMap = aob.H;
                                znb znbVar3 = (znb) hashMap.get(str3);
                                if (znbVar3 == null) {
                                    znbVar3 = new znb();
                                    znbVar3.F = i3;
                                    znbVar3.b = new File(a.h(), str3.concat(".attheme")).getAbsolutePath();
                                    aob.F.add(znbVar3);
                                    aob.G.add(znbVar3);
                                    z2 = true;
                                } else {
                                    arrayList2.remove(znbVar3);
                                }
                                znbVar3.a = tL_theme.title;
                                znbVar3.G = tL_theme;
                                hashMap.put(znbVar3.k(), znbVar3);
                            } else {
                                for (int i7 = 0; i7 < tL_theme.settings.size(); i7++) {
                                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.get(i7);
                                    if (themeSettings != null && (q0 = aob.q0(themeSettings)) != null && (znbVar = (znb) aob.H.get(q0)) != null && znbVar.c0 != null) {
                                        ynb ynbVar2 = (ynb) znbVar.d0.get(tL_theme.id);
                                        if (ynbVar2 != null) {
                                            if (!znb.a(ynbVar2, themeSettings)) {
                                                znb.g(ynbVar2, themeSettings);
                                                znb znbVar4 = aob.I;
                                                if (znbVar4 == znbVar && znbVar4.Z == ynbVar2.a) {
                                                    aob.r1(false, false);
                                                    znb znbVar5 = aob.I;
                                                    aob.I1(znbVar5, aob.J == znbVar5, -1, null);
                                                }
                                                z2 = true;
                                            }
                                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                                            ynbVar2.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                                            arrayList2.remove(ynbVar2);
                                        } else {
                                            ynbVar2 = znbVar.d(tL_theme, i3, i7);
                                            TextUtils.isEmpty(ynbVar2.o);
                                        }
                                        ynbVar2.z = tL_theme.isDefault;
                                    }
                                }
                            }
                        }
                    }
                    int size3 = arrayList2.size();
                    for (int i8 = 0; i8 < size3; i8++) {
                        Object obj = arrayList2.get(i8);
                        if (obj instanceof znb) {
                            znb znbVar6 = (znb) obj;
                            znbVar6.s();
                            aob.G.remove(znbVar6);
                            HashMap hashMap2 = aob.H;
                            hashMap2.remove(znbVar6.a);
                            unb unbVar = znbVar6.j0;
                            if (unbVar != null) {
                                unbVar.a();
                            }
                            aob.F.remove(znbVar6);
                            new File(znbVar6.b).delete();
                            if (aob.K == znbVar6) {
                                aob.K = aob.L;
                            } else if (aob.J == znbVar6) {
                                aob.J = (znb) hashMap2.get("Dark Blue");
                                z = true;
                                if (aob.I == znbVar6) {
                                    aob.t(z ? aob.J : aob.K, true, z);
                                }
                            }
                            z = false;
                            if (aob.I == znbVar6) {
                            }
                        } else if (obj instanceof ynb) {
                            ynb ynbVar3 = (ynb) obj;
                            if (aob.j0(ynbVar3.b, ynbVar3, false) && aob.I == ynbVar3.b) {
                                aob.r1(false, false);
                                znb znbVar7 = aob.I;
                                aob.I1(znbVar7, aob.J == znbVar7, -1, null);
                            }
                        }
                    }
                    aob.w1(true, false);
                    Collections.sort(aob.F, new fna((byte) 6));
                    if (z2) {
                        jn7.e().k(jn7.r4, new Object[0]);
                    }
                    ls6 d0 = ls6.d0(i3);
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
                        jn7.e().k(jn7.X4, new Object[0]);
                        break;
                    } else {
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(new ne2(ez3.b(i3)));
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ez3 c = ez3.c(i3, (TLRPC.TL_theme) arrayList.get(i10));
                            ne2 ne2Var = new ne2(c);
                            if (c.f.size() >= 4) {
                                arrayList4.add(ne2Var);
                            }
                        }
                        af2.s.c(new kq(d0, arrayList4, i3));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ b16(TLObject tLObject, int i, byte b) {
        this.a = b;
        this.b = tLObject;
        this.c = i;
    }
}
