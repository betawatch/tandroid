// default package

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URLDecoder;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.d0;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ff implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ff(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:198:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0118 A[Catch: Exception -> 0x0172, TRY_LEAVE, TryCatch #12 {Exception -> 0x0172, blocks: (B:37:0x0112, B:39:0x0118, B:43:0x015e, B:42:0x0157, B:49:0x014f, B:47:0x012a), top: B:36:0x0112, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    @Override // android.content.DialogInterface.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        String sb;
        tk5 tk5Var;
        tk5 tk5Var2;
        File p0;
        String str2;
        File file;
        Throwable th;
        FileOutputStream fileOutputStream;
        int i2 = 0;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3 = null;
        r10 = null;
        FileOutputStream fileOutputStream2 = null;
        int i3 = 1;
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.b;
                nk3 nk3Var = (nk3) this.c;
                int i4 = i == 0 ? 0 : i == 1 ? 1 : i == 2 ? 2 : 3;
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    lo7.n(z8c.t0).T(((Long) arrayList.get(i5)).longValue(), i4, 0L);
                }
                if (c41.a(nk3Var)) {
                    c41.z(nk3Var, i4, 0, null).j();
                    return;
                }
                return;
            case 1:
                o oVar = (o) this.b;
                String str3 = (String) this.c;
                sx sxVar = oVar.L;
                if (oVar.M == null || oVar.v0[0].c.F == null) {
                    return;
                }
                if (i != 0) {
                    if (i != 1 || str3 == null) {
                        return;
                    }
                    if (str3.startsWith("mailto:")) {
                        str3 = str3.substring(7);
                    } else if (str3.startsWith("tel:")) {
                        str3 = str3.substring(4);
                    }
                    gm.g(str3);
                    return;
                }
                int lastIndexOf = str3.lastIndexOf(35);
                if (lastIndexOf != -1) {
                    boolean isEmpty = TextUtils.isEmpty(oVar.v0[0].c.F.cached_page.url);
                    m[] mVarArr = oVar.v0;
                    String lowerCase = !isEmpty ? mVarArr[0].c.F.cached_page.url.toLowerCase() : mVarArr[0].c.F.url.toLowerCase();
                    try {
                        str = URLDecoder.decode(str3.substring(lastIndexOf + 1), "UTF-8");
                    } catch (Exception unused) {
                        str = "";
                    }
                    if (str3.toLowerCase().contains(lowerCase)) {
                        if (!TextUtils.isEmpty(str)) {
                            oVar.T(str, true);
                            return;
                        }
                        u46 u46Var = oVar.v0[0].d;
                        if (sxVar != null) {
                            i2 = gm.L(32.0f);
                        } else {
                            i3 = 0;
                        }
                        u46Var.g1(i3, i2);
                        oVar.j(null);
                        return;
                    }
                }
                l11.u(oVar.M, str3);
                return;
            case 2:
                ng1 ng1Var = (ng1) this.b;
                String str4 = (String) this.c;
                if (i == 0) {
                    l11.q(ng1Var.a.n.getParentActivity(), str4, true);
                    return;
                }
                if (i == 1) {
                    if (str4.startsWith("mailto:")) {
                        str4 = str4.substring(7);
                    } else if (str4.startsWith("tel:")) {
                        str4 = str4.substring(4);
                    }
                    gm.g(str4);
                    return;
                }
                return;
            case 3:
                yv1 yv1Var = (yv1) this.b;
                String str5 = (String) this.c;
                gm.g(str5);
                c41.b0(yv1Var).i(jb6.a0(null, null, 2131750821, str5)).j();
                return;
            case 4:
                ((u43) this.b).h((Integer[][]) this.c, i);
                return;
            case 5:
                yg4 yg4Var = (yg4) this.b;
                String str6 = (String) this.c;
                if (i == 0) {
                    ch4 ch4Var = yg4Var.a.w;
                    SpannableStringBuilder[] spannableStringBuilderArr = ch4.t0;
                    ch4Var.g(str6);
                    return;
                } else {
                    if (i == 1) {
                        if (str6.startsWith("mailto:")) {
                            str6 = str6.substring(7);
                        } else if (str6.startsWith("tel:")) {
                            str6 = str6.substring(4);
                        }
                        gm.g(str6);
                        return;
                    }
                    return;
                }
            case 6:
                i85 i85Var = (i85) this.c;
                ArrayList arrayList2 = (ArrayList) this.b;
                g95 g95Var = i85Var.b;
                if (VoIPService.getSharedInstance() != null) {
                    Integer num = (Integer) arrayList2.get(i);
                    int intValue = num.intValue();
                    g95Var.n5 = num;
                    g95Var.L1(true, true);
                    g95Var.n5 = null;
                    gm.c3(new bm3((Object) i85Var, intValue, (byte) 14));
                    return;
                }
                return;
            case 7:
                xz7 xz7Var = (xz7) this.c;
                ArrayList arrayList3 = (ArrayList) this.b;
                xz7Var.getClass();
                try {
                    tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                    try {
                        tL_secureRequiredType.type = (TLRPC.SecureValueType) ((Class) arrayList3.get(i)).newInstance();
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    tL_secureRequiredType = null;
                }
                if (!xz7.o1(tL_secureRequiredType.type)) {
                    if (xz7.n1(tL_secureRequiredType.type)) {
                        tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                        tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypeAddress();
                    }
                    xz7Var.H1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                    return;
                }
                tL_secureRequiredType.selfie_required = true;
                tL_secureRequiredType.translation_required = true;
                tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypePersonalDetails();
                tL_secureRequiredType3 = tL_secureRequiredType;
                tL_secureRequiredType = tL_secureRequiredType2;
                xz7Var.H1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                return;
            case 8:
                d68 d68Var = (d68) this.b;
                fm fmVar = (fm) this.c;
                if (i == 0) {
                    try {
                        ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", fmVar.c(false)));
                        if (gm.C3()) {
                            Toast.makeText(d68Var.s1.getParentActivity(), jb6.M0(2131743879, null), 0).show();
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        fc4.g(e, true);
                        return;
                    }
                }
                return;
            case 9:
                ((uo8) this.b).a((Context) this.c, i);
                return;
            case 10:
                vn9 vn9Var = (vn9) this.b;
                switch (((i98) this.c).a) {
                    case 24:
                        yed.d.b(i == 0 ? sn9.b : sn9.c);
                        break;
                    case 25:
                        yed.e.b(on9.values()[i]);
                        break;
                    case 26:
                        yed.f.b(i == 0 ? pn9.b : pn9.c);
                        break;
                    default:
                        hr5 hr5Var = yed.g;
                        int i6 = vn9.d[i];
                        synchronized (hr5Var) {
                            hr5Var.b = i6;
                            hr5Var.a = true;
                            jaa.a.edit().putInt("round_video_video_bitrate", i6).apply();
                            break;
                        }
                }
                ((ny0) vn9Var.c).f();
                return;
            case 11:
                p7a p7aVar = (p7a) this.b;
                ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.c));
                new c41(p7aVar.c, null).i(jb6.M0(2131743879, null)).j();
                return;
            case 12:
                hba hbaVar = (hba) this.c;
                ArrayList arrayList4 = (ArrayList) this.b;
                SharedPreferences sharedPreferences = hbaVar.g;
                ArrayList arrayList5 = hbaVar.c;
                if (i != 0) {
                    gba gbaVar = new gba();
                    gbaVar.a = i - 1;
                    gbaVar.b = arrayList4;
                    arrayList5.add(gbaVar);
                    String string = sharedPreferences.getString("moretemplates", null);
                    if (string == null) {
                        sb = String.valueOf(gbaVar.a);
                    } else {
                        StringBuilder k = b10.k(string, "|");
                        k.append(gbaVar.a);
                        sb = k.toString();
                    }
                    for (int i7 = 0; i7 < arrayList4.size(); i7++) {
                        StringBuilder k2 = b10.k(sb, ",");
                        k2.append(Math.round(((fba) arrayList4.get(i7)).a));
                        k2.append(",");
                        k2.append(Math.round(((fba) arrayList4.get(i7)).b));
                        sb = k2.toString();
                    }
                    sharedPreferences.edit().putString("moretemplates", sb).apply();
                    return;
                }
                StringBuilder sb2 = new StringBuilder("[");
                for (int i8 = 0; i8 < arrayList5.size(); i8++) {
                    gba gbaVar2 = (gba) arrayList5.get(i8);
                    if (i8 > 0) {
                        sb2.append(",\n");
                    }
                    sb2.append("\t{\n\t\t\"shape\": ");
                    sb2.append(gbaVar2.a);
                    sb2.append(",\n\t\t\"points\": [");
                    for (int i9 = 0; i9 < gbaVar2.b.size(); i9++) {
                        if (i9 > 0) {
                            sb2.append(",");
                        }
                        fba fbaVar = (fba) gbaVar2.b.get(i9);
                        sb2.append("[");
                        sb2.append(Math.round(fbaVar.a));
                        sb2.append(",");
                        sb2.append(Math.round(fbaVar.b));
                        sb2.append("]");
                    }
                    sb2.append("],\n\t\t\"freq\": ");
                    sb2.append(Math.round(((gbaVar2.c / hbaVar.a) * 100.0f) * 100.0f) / 100.0f);
                    sb2.append("\n\t}");
                }
                sb2.append("\n]");
                Log.i("shapedetector", sb2.toString());
                return;
            case 13:
                rfa rfaVar = (rfa) this.b;
                String str7 = (String) this.c;
                if (i == 0) {
                    rfaVar.a.Y0(str7);
                    return;
                }
                if (i == 1) {
                    if (str7.startsWith("mailto:")) {
                        str7 = str7.substring(7);
                    } else if (str7.startsWith("tel:")) {
                        str7 = str7.substring(4);
                    }
                    gm.g(str7);
                    return;
                }
                return;
            default:
                d0 d0Var = (d0) this.b;
                bmb bmbVar = (bmb) this.c;
                ThemeActivity themeActivity = d0Var.e;
                if (themeActivity.getParentActivity() != null) {
                    if (i == 0) {
                        if (bmbVar.G == null) {
                            themeActivity.getMessagesController().D4(bmbVar, null);
                            nm7.e().k(nm7.w4, bmbVar, null);
                            return;
                        }
                        String str8 = "https://" + themeActivity.getMessagesController().N2 + "/addtheme/" + bmbVar.G.slug;
                        themeActivity.showDialog(new tca(themeActivity.getParentActivity(), null, str8, false, str8, false, null));
                        return;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            tk5Var = ((d) themeActivity).parentLayout;
                            if (tk5Var != null) {
                                cmb.t(bmbVar, true, false);
                                tk5Var2 = ((d) themeActivity).parentLayout;
                                ((ActionBarLayout) tk5Var2).W(true, true);
                                new ThemeEditorView().d(themeActivity.getParentActivity(), bmbVar);
                                return;
                            }
                            return;
                        }
                        if (i == 3) {
                            themeActivity.presentFragment(new zob(bmbVar, null, false));
                            return;
                        }
                        if (themeActivity.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                            alertDialog$Builder.a.S = jb6.M0(2131751421, "DeleteThemeTitle");
                            alertDialog$Builder.a.U = jb6.M0(2131751422, "DeleteThemeAlert");
                            alertDialog$Builder.j(jb6.M0(2131751535, "Delete"), new xr8(d0Var, bmbVar, (byte) 27));
                            alertDialog$Builder.g(jb6.M0(2131752542, "Cancel"), null);
                            he heVar = alertDialog$Builder.a;
                            themeActivity.showDialog(heVar);
                            TextView textView = (TextView) heVar.c(-1);
                            if (textView != null) {
                                anb.X(textView, cmb.p7, null);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (bmbVar.b == null && bmbVar.d == null) {
                        StringBuilder sb3 = new StringBuilder();
                        int[] iArr = cmb.gm;
                        for (int i10 = 0; i10 < iArr.length; i10++) {
                            sb3.append(nxe.c(i10));
                            sb3.append("=");
                            sb3.append(iArr[i10]);
                            sb3.append("\n");
                        }
                        p0 = new File(a.h(), "default_theme.attheme");
                        try {
                            try {
                                try {
                                    fileOutputStream = new FileOutputStream(p0);
                                } catch (Exception e2) {
                                    e = e2;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (Exception e3) {
                            fc4.g(e3, true);
                        }
                        try {
                            fileOutputStream.write(gm.g1(sb3.toString()));
                            fileOutputStream.close();
                        } catch (Exception e4) {
                            e = e4;
                            fileOutputStream2 = fileOutputStream;
                            fc4.g(e, true);
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                            str2 = bmbVar.a;
                            if (!str2.endsWith(".attheme")) {
                            }
                            file = new File(bc4.z(4), bc4.q(str2));
                            if (gm.E(p0, file)) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileOutputStream2 = fileOutputStream;
                            if (fileOutputStream2 == null) {
                                throw th;
                            }
                            try {
                                fileOutputStream2.close();
                                throw th;
                            } catch (Exception e5) {
                                fc4.g(e5, true);
                                throw th;
                            }
                        }
                    } else {
                        String str9 = bmbVar.d;
                        p0 = str9 != null ? cmb.p0(str9) : new File(bmbVar.b);
                    }
                    str2 = bmbVar.a;
                    if (!str2.endsWith(".attheme")) {
                        str2 = str2.concat(".attheme");
                    }
                    file = new File(bc4.z(4), bc4.q(str2));
                    try {
                        if (gm.E(p0, file)) {
                            return;
                        }
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/xml");
                        if (Build.VERSION.SDK_INT >= 24) {
                            try {
                                Activity parentActivity = themeActivity.getParentActivity();
                                StringBuilder sb4 = new StringBuilder();
                                a.d();
                                sb4.append("org.telegram.messenger.beta");
                                sb4.append(".provider");
                                intent.putExtra("android.intent.extra.STREAM", FileProvider.c(parentActivity, sb4.toString(), file));
                                intent.setFlags(1);
                            } catch (Exception unused4) {
                                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                            }
                        } else {
                            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                        }
                        themeActivity.startActivityForResult(Intent.createChooser(intent, jb6.M0(2131745193, "ShareFile")), 500);
                        return;
                    } catch (Exception e6) {
                        fc4.g(e6, true);
                        return;
                    }
                }
                return;
        }
    }

    public /* synthetic */ ff(Object obj, ArrayList arrayList, byte b) {
        this.a = b;
        this.c = obj;
        this.b = arrayList;
    }
}
