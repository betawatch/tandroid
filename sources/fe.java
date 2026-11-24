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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class fe implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fe(Object obj, Object obj2, byte b) {
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
        ui5 ui5Var;
        ui5 ui5Var2;
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
                cj3 cj3Var = (cj3) this.c;
                int i4 = i == 0 ? 0 : i == 1 ? 1 : i == 2 ? 2 : 3;
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    im7.n(y6c.t0).T(((Long) arrayList.get(i5)).longValue(), i4, 0L);
                }
                if (u21.a(cj3Var)) {
                    u21.z(cj3Var, i4, 0, null).j();
                    return;
                }
                return;
            case 1:
                o oVar = (o) this.b;
                String str3 = (String) this.c;
                sw swVar = oVar.L;
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
                    gl.g(str3);
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
                        t26 t26Var = oVar.v0[0].d;
                        if (swVar != null) {
                            i2 = gl.L(32.0f);
                        } else {
                            i3 = 0;
                        }
                        t26Var.g1(i3, i2);
                        oVar.j(null);
                        return;
                    }
                }
                d01.t(oVar.M, str3);
                return;
            case 2:
                ff1 ff1Var = (ff1) this.b;
                String str4 = (String) this.c;
                if (i == 0) {
                    d01.p(ff1Var.a.n.getParentActivity(), str4, true);
                    return;
                }
                if (i == 1) {
                    if (str4.startsWith("mailto:")) {
                        str4 = str4.substring(7);
                    } else if (str4.startsWith("tel:")) {
                        str4 = str4.substring(4);
                    }
                    gl.g(str4);
                    return;
                }
                return;
            case 3:
                mu1 mu1Var = (mu1) this.b;
                String str5 = (String) this.c;
                gl.g(str5);
                u21.b0(mu1Var).i(k96.a0(null, null, 2131750872, str5)).j();
                return;
            case 4:
                ((j33) this.b).h((Integer[][]) this.c, i);
                return;
            case 5:
                we4 we4Var = (we4) this.b;
                String str6 = (String) this.c;
                if (i == 0) {
                    af4 af4Var = we4Var.a.w;
                    SpannableStringBuilder[] spannableStringBuilderArr = af4.t0;
                    af4Var.g(str6);
                    return;
                } else {
                    if (i == 1) {
                        if (str6.startsWith("mailto:")) {
                            str6 = str6.substring(7);
                        } else if (str6.startsWith("tel:")) {
                            str6 = str6.substring(4);
                        }
                        gl.g(str6);
                        return;
                    }
                    return;
                }
            case 6:
                k65 k65Var = (k65) this.c;
                ArrayList arrayList2 = (ArrayList) this.b;
                h75 h75Var = k65Var.b;
                if (VoIPService.getSharedInstance() != null) {
                    Integer num = (Integer) arrayList2.get(i);
                    int intValue = num.intValue();
                    h75Var.n5 = num;
                    h75Var.L1(true, true);
                    h75Var.n5 = null;
                    gl.c3(new sm3((Object) k65Var, intValue, (byte) 12));
                    return;
                }
                return;
            case 7:
                vx7 vx7Var = (vx7) this.c;
                ArrayList arrayList3 = (ArrayList) this.b;
                vx7Var.getClass();
                try {
                    tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                    try {
                        tL_secureRequiredType.type = (TLRPC.SecureValueType) ((Class) arrayList3.get(i)).newInstance();
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    tL_secureRequiredType = null;
                }
                if (!vx7.n1(tL_secureRequiredType.type)) {
                    if (vx7.m1(tL_secureRequiredType.type)) {
                        tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                        tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypeAddress();
                    }
                    vx7Var.G1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                    return;
                }
                tL_secureRequiredType.selfie_required = true;
                tL_secureRequiredType.translation_required = true;
                tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypePersonalDetails();
                tL_secureRequiredType3 = tL_secureRequiredType;
                tL_secureRequiredType = tL_secureRequiredType2;
                vx7Var.G1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                return;
            case 8:
                b48 b48Var = (b48) this.b;
                fl flVar = (fl) this.c;
                if (i == 0) {
                    try {
                        ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", flVar.c(false)));
                        if (gl.C3()) {
                            Toast.makeText(b48Var.s1.getParentActivity(), k96.M0(2131743953, null), 0).show();
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        fa4.g(e, true);
                        return;
                    }
                }
                return;
            case 9:
                ((tm8) this.b).a((Context) this.c, i);
                return;
            case 10:
                vl9 vl9Var = (vl9) this.b;
                switch (((sc8) this.c).a) {
                    case 23:
                        wcd.d.b(i == 0 ? sl9.b : sl9.c);
                        break;
                    case 24:
                        wcd.e.b(ol9.values()[i]);
                        break;
                    case 25:
                        wcd.f.b(i == 0 ? pl9.b : pl9.c);
                        break;
                    default:
                        hp5 hp5Var = wcd.g;
                        int i6 = vl9.d[i];
                        synchronized (hp5Var) {
                            hp5Var.b = i6;
                            hp5Var.a = true;
                            j8a.a.edit().putInt("round_video_video_bitrate", i6).apply();
                            break;
                        }
                }
                ((gx0) vl9Var.c).f();
                return;
            case 11:
                n5a n5aVar = (n5a) this.b;
                ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.c));
                new u21(n5aVar.c, null).i(k96.M0(2131743953, null)).j();
                return;
            case 12:
                h9a h9aVar = (h9a) this.c;
                ArrayList arrayList4 = (ArrayList) this.b;
                SharedPreferences sharedPreferences = h9aVar.g;
                ArrayList arrayList5 = h9aVar.c;
                if (i != 0) {
                    g9a g9aVar = new g9a();
                    g9aVar.a = i - 1;
                    g9aVar.b = arrayList4;
                    arrayList5.add(g9aVar);
                    String string = sharedPreferences.getString("moretemplates", null);
                    if (string == null) {
                        sb = String.valueOf(g9aVar.a);
                    } else {
                        StringBuilder k = b00.k(string, "|");
                        k.append(g9aVar.a);
                        sb = k.toString();
                    }
                    for (int i7 = 0; i7 < arrayList4.size(); i7++) {
                        StringBuilder k2 = b00.k(sb, ",");
                        k2.append(Math.round(((f9a) arrayList4.get(i7)).a));
                        k2.append(",");
                        k2.append(Math.round(((f9a) arrayList4.get(i7)).b));
                        sb = k2.toString();
                    }
                    sharedPreferences.edit().putString("moretemplates", sb).apply();
                    return;
                }
                StringBuilder sb2 = new StringBuilder("[");
                for (int i8 = 0; i8 < arrayList5.size(); i8++) {
                    g9a g9aVar2 = (g9a) arrayList5.get(i8);
                    if (i8 > 0) {
                        sb2.append(",\n");
                    }
                    sb2.append("\t{\n\t\t\"shape\": ");
                    sb2.append(g9aVar2.a);
                    sb2.append(",\n\t\t\"points\": [");
                    for (int i9 = 0; i9 < g9aVar2.b.size(); i9++) {
                        if (i9 > 0) {
                            sb2.append(",");
                        }
                        f9a f9aVar = (f9a) g9aVar2.b.get(i9);
                        sb2.append("[");
                        sb2.append(Math.round(f9aVar.a));
                        sb2.append(",");
                        sb2.append(Math.round(f9aVar.b));
                        sb2.append("]");
                    }
                    sb2.append("],\n\t\t\"freq\": ");
                    sb2.append(Math.round(((g9aVar2.c / h9aVar.a) * 100.0f) * 100.0f) / 100.0f);
                    sb2.append("\n\t}");
                }
                sb2.append("\n]");
                Log.i("shapedetector", sb2.toString());
                return;
            case 13:
                rda rdaVar = (rda) this.b;
                String str7 = (String) this.c;
                if (i == 0) {
                    rdaVar.a.Y0(str7);
                    return;
                }
                if (i == 1) {
                    if (str7.startsWith("mailto:")) {
                        str7 = str7.substring(7);
                    } else if (str7.startsWith("tel:")) {
                        str7 = str7.substring(4);
                    }
                    gl.g(str7);
                    return;
                }
                return;
            default:
                d0 d0Var = (d0) this.b;
                akb akbVar = (akb) this.c;
                ThemeActivity themeActivity = d0Var.e;
                if (themeActivity.getParentActivity() != null) {
                    if (i == 0) {
                        if (akbVar.G == null) {
                            themeActivity.getMessagesController().B4(akbVar, null);
                            kk7.e().k(kk7.u4, akbVar, null);
                            return;
                        }
                        String str8 = "https://" + themeActivity.getMessagesController().N2 + "/addtheme/" + akbVar.G.slug;
                        themeActivity.showDialog(new taa(themeActivity.getParentActivity(), null, str8, false, str8, false, null));
                        return;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            ui5Var = ((d) themeActivity).parentLayout;
                            if (ui5Var != null) {
                                bkb.t(akbVar, true, false);
                                ui5Var2 = ((d) themeActivity).parentLayout;
                                ((ActionBarLayout) ui5Var2).W(true, true);
                                new ThemeEditorView().d(themeActivity.getParentActivity(), akbVar);
                                return;
                            }
                            return;
                        }
                        if (i == 3) {
                            themeActivity.presentFragment(new ymb(akbVar, null, false));
                            return;
                        }
                        if (themeActivity.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                            alertDialog$Builder.a.S = k96.M0(2131751472, "DeleteThemeTitle");
                            alertDialog$Builder.a.U = k96.M0(2131751473, "DeleteThemeAlert");
                            alertDialog$Builder.j(k96.M0(2131751586, "Delete"), new kq8(d0Var, akbVar, (byte) 26));
                            alertDialog$Builder.g(k96.M0(2131752577, "Cancel"), null);
                            hd hdVar = alertDialog$Builder.a;
                            themeActivity.showDialog(hdVar);
                            TextView textView = (TextView) hdVar.c(-1);
                            if (textView != null) {
                                zkb.X(textView, bkb.p7, null);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (akbVar.b == null && akbVar.d == null) {
                        StringBuilder sb3 = new StringBuilder();
                        int[] iArr = bkb.gm;
                        for (int i10 = 0; i10 < iArr.length; i10++) {
                            sb3.append(lve.c(i10));
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
                            fa4.g(e3, true);
                        }
                        try {
                            fileOutputStream.write(gl.g1(sb3.toString()));
                            fileOutputStream.close();
                        } catch (Exception e4) {
                            e = e4;
                            fileOutputStream2 = fileOutputStream;
                            fa4.g(e, true);
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                            str2 = akbVar.a;
                            if (!str2.endsWith(".attheme")) {
                            }
                            file = new File(ba4.z(4), ba4.q(str2));
                            if (gl.E(p0, file)) {
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
                                fa4.g(e5, true);
                                throw th;
                            }
                        }
                    } else {
                        String str9 = akbVar.d;
                        p0 = str9 != null ? bkb.p0(str9) : new File(akbVar.b);
                    }
                    str2 = akbVar.a;
                    if (!str2.endsWith(".attheme")) {
                        str2 = str2.concat(".attheme");
                    }
                    file = new File(ba4.z(4), ba4.q(str2));
                    try {
                        if (gl.E(p0, file)) {
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
                        themeActivity.startActivityForResult(Intent.createChooser(intent, k96.M0(2131745267, "ShareFile")), 500);
                        return;
                    } catch (Exception e6) {
                        fa4.g(e6, true);
                        return;
                    }
                }
                return;
        }
    }

    public /* synthetic */ fe(Object obj, ArrayList arrayList, byte b) {
        this.a = b;
        this.c = obj;
        this.b = arrayList;
    }
}
