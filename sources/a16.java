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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class a16 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ int c;

    public /* synthetic */ a16(int i, TLObject tLObject) {
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
        bmb bmbVar;
        TLRPC.WallPaperSettings wallPaperSettings;
        switch (this.a) {
            case 0:
                TLObject tLObject = this.b;
                int i = this.c;
                String str = LaunchActivity.C1;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    hs6.d0(i).G0(false, true, null);
                    break;
                }
                break;
            case 1:
                TLObject tLObject2 = this.b;
                int i2 = this.c;
                String str2 = LaunchActivity.C1;
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    hs6.d0(i2).G0(false, true, null);
                    break;
                }
                break;
            default:
                int i3 = this.c;
                TLObject tLObject3 = this.b;
                cmb.C[i3] = false;
                if (tLObject3 instanceof TL_account.TL_themes) {
                    TL_account.TL_themes tL_themes = (TL_account.TL_themes) tLObject3;
                    cmb.E[i3] = tL_themes.hash;
                    cmb.D[i3] = (int) (System.currentTimeMillis() / 1000);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int size = cmb.F.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        bmb bmbVar2 = (bmb) cmb.F.get(i4);
                        if (bmbVar2.G != null && bmbVar2.F == i3) {
                            arrayList2.add(bmbVar2);
                        } else if (bmbVar2.c0 != null) {
                            for (int i5 = 0; i5 < bmbVar2.c0.size(); i5++) {
                                amb ambVar = (amb) bmbVar2.c0.get(i5);
                                if (ambVar.r != null && ambVar.t == i3) {
                                    arrayList2.add(ambVar);
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
                                HashMap hashMap = cmb.H;
                                bmb bmbVar3 = (bmb) hashMap.get(str3);
                                if (bmbVar3 == null) {
                                    bmbVar3 = new bmb();
                                    bmbVar3.F = i3;
                                    bmbVar3.b = new File(a.h(), str3.concat(".attheme")).getAbsolutePath();
                                    cmb.F.add(bmbVar3);
                                    cmb.G.add(bmbVar3);
                                    z2 = true;
                                } else {
                                    arrayList2.remove(bmbVar3);
                                }
                                bmbVar3.a = tL_theme.title;
                                bmbVar3.G = tL_theme;
                                hashMap.put(bmbVar3.k(), bmbVar3);
                            } else {
                                for (int i7 = 0; i7 < tL_theme.settings.size(); i7++) {
                                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.get(i7);
                                    if (themeSettings != null && (q0 = cmb.q0(themeSettings)) != null && (bmbVar = (bmb) cmb.H.get(q0)) != null && bmbVar.c0 != null) {
                                        amb ambVar2 = (amb) bmbVar.d0.get(tL_theme.id);
                                        if (ambVar2 != null) {
                                            if (!bmb.a(ambVar2, themeSettings)) {
                                                bmb.g(ambVar2, themeSettings);
                                                bmb bmbVar4 = cmb.I;
                                                if (bmbVar4 == bmbVar && bmbVar4.Z == ambVar2.a) {
                                                    cmb.r1(false, false);
                                                    bmb bmbVar5 = cmb.I;
                                                    cmb.I1(bmbVar5, cmb.J == bmbVar5, -1, null);
                                                }
                                                z2 = true;
                                            }
                                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                                            ambVar2.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                                            arrayList2.remove(ambVar2);
                                        } else {
                                            ambVar2 = bmbVar.d(tL_theme, i3, i7);
                                            TextUtils.isEmpty(ambVar2.o);
                                        }
                                        ambVar2.z = tL_theme.isDefault;
                                    }
                                }
                            }
                        }
                    }
                    int size3 = arrayList2.size();
                    for (int i8 = 0; i8 < size3; i8++) {
                        Object obj = arrayList2.get(i8);
                        if (obj instanceof bmb) {
                            bmb bmbVar6 = (bmb) obj;
                            bmbVar6.s();
                            cmb.G.remove(bmbVar6);
                            HashMap hashMap2 = cmb.H;
                            hashMap2.remove(bmbVar6.a);
                            xlb xlbVar = bmbVar6.j0;
                            if (xlbVar != null) {
                                xlbVar.a();
                            }
                            cmb.F.remove(bmbVar6);
                            new File(bmbVar6.b).delete();
                            if (cmb.K == bmbVar6) {
                                cmb.K = cmb.L;
                            } else if (cmb.J == bmbVar6) {
                                cmb.J = (bmb) hashMap2.get("Dark Blue");
                                z = true;
                                if (cmb.I == bmbVar6) {
                                    cmb.t(z ? cmb.J : cmb.K, true, z);
                                }
                            }
                            z = false;
                            if (cmb.I == bmbVar6) {
                            }
                        } else if (obj instanceof amb) {
                            amb ambVar3 = (amb) obj;
                            if (cmb.j0(ambVar3.b, ambVar3, false) && cmb.I == ambVar3.b) {
                                cmb.r1(false, false);
                                bmb bmbVar7 = cmb.I;
                                cmb.I1(bmbVar7, cmb.J == bmbVar7, -1, null);
                            }
                        }
                    }
                    cmb.w1(true, false);
                    Collections.sort(cmb.F, new zua((byte) 3));
                    if (z2) {
                        nm7.e().k(nm7.s4, new Object[0]);
                    }
                    hs6 d0 = hs6.d0(i3);
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
                        nm7.e().k(nm7.Y4, new Object[0]);
                        break;
                    } else {
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(new hf2(tz3.b(i3)));
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            tz3 c = tz3.c(i3, (TLRPC.TL_theme) arrayList.get(i10));
                            hf2 hf2Var = new hf2(c);
                            if (c.f.size() >= 4) {
                                arrayList4.add(hf2Var);
                            }
                        }
                        uf2.s.c(new jr(d0, arrayList4, i3));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ a16(TLObject tLObject, int i, byte b) {
        this.a = b;
        this.b = tLObject;
        this.c = i;
    }
}
