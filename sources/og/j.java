package og;

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
import org.telegram.messenger.a8;
import org.telegram.messenger.f0;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.messenger.t0;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.w7;
import org.telegram.messenger.xs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.v4;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.ap0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.a81;
import org.telegram.ui.aj0;
import org.telegram.ui.bn;
import org.telegram.ui.c00;
import org.telegram.ui.cx;
import org.telegram.ui.db;
import org.telegram.ui.f40;
import org.telegram.ui.g4;
import org.telegram.ui.g61;
import org.telegram.ui.hk0;
import org.telegram.ui.ii;
import org.telegram.ui.k30;
import org.telegram.ui.l4;
import org.telegram.ui.m60;
import org.telegram.ui.n21;
import org.telegram.ui.t3;
import org.telegram.ui.wu0;
import org.telegram.ui.yz;
import org.telegram.ui.zy0;
import sg.a1;
import sg.b1;
import sg.z0;
import zi.o0;
import zi.p0;
import zi.s0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022f A[Catch: Exception -> 0x026e, TRY_LEAVE, TryCatch #2 {Exception -> 0x026e, blocks: (B:71:0x0227, B:75:0x022f, B:79:0x0277, B:78:0x0270, B:85:0x0266, B:83:0x0241), top: B:70:0x0227, inners: #10 }] */
    @Override // android.content.DialogInterface.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(DialogInterface dialogInterface, int i7) {
        String str;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        r4 r4Var;
        r4 r4Var2;
        File q02;
        String str2;
        File file;
        Throwable th2;
        FileOutputStream fileOutputStream;
        String sb2;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3 = null;
        r10 = null;
        r10 = null;
        r10 = null;
        FileOutputStream fileOutputStream2 = null;
        switch (this.a) {
            case 0:
                o.a((o) this.b, (Integer[][]) this.c, i7);
                return;
            case 1:
                g4 g4Var = (g4) this.b;
                String str3 = (String) this.c;
                t3 t3Var = g4Var.L;
                if (g4Var.M == null || g4Var.v0[0].c.F == null) {
                    return;
                }
                if (i7 != 0) {
                    if (i7 != 1 || str3 == null) {
                        return;
                    }
                    if (str3.startsWith("mailto:")) {
                        str3 = str3.substring(7);
                    } else if (str3.startsWith("tel:")) {
                        str3 = str3.substring(4);
                    }
                    g0.g(str3);
                    return;
                }
                int lastIndexOf = str3.lastIndexOf(35);
                if (lastIndexOf != -1) {
                    String lowerCase = !TextUtils.isEmpty(g4Var.v0[0].c.F.cached_page.url) ? g4Var.v0[0].c.F.cached_page.url.toLowerCase() : g4Var.v0[0].c.F.url.toLowerCase();
                    try {
                        str = URLDecoder.decode(str3.substring(lastIndexOf + 1), "UTF-8");
                    } catch (Exception unused) {
                        str = "";
                    }
                    if (str3.toLowerCase().contains(lowerCase)) {
                        if (!TextUtils.isEmpty(str)) {
                            g4Var.T(str, true);
                            return;
                        } else {
                            g4Var.v0[0].d.h1(t3Var == null ? 0 : 1, t3Var != null ? g0.L(32.0f) : 0);
                            g4Var.k(null);
                            return;
                        }
                    }
                }
                vf.c.t(g4Var.M, str3);
                return;
            case 2:
                db dbVar = (db) this.b;
                String str4 = (String) this.c;
                if (i7 == 0) {
                    vf.c.p(dbVar.a.n.getParentActivity(), str4, true);
                    return;
                }
                if (i7 == 1) {
                    if (str4.startsWith("mailto:")) {
                        str4 = str4.substring(7);
                    } else if (str4.startsWith("tel:")) {
                        str4 = str4.substring(4);
                    }
                    g0.g(str4);
                    return;
                }
                return;
            case 3:
                bn bnVar = (bn) this.b;
                String str5 = (String) this.c;
                g0.g(str5);
                lc.b0(bnVar).i(gd.a0(null, null, 2131750872, str5)).j();
                return;
            case 4:
                ArrayList arrayList = (ArrayList) this.b;
                cx cxVar = (cx) this.c;
                int i10 = i7 == 0 ? 0 : i7 == 1 ? 1 : i7 == 2 ? 2 : 3;
                if (arrayList != null) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        xs.t(j10.t0).T(((Long) arrayList.get(i11)).longValue(), i10, 0);
                    }
                }
                if (lc.a(cxVar)) {
                    lc.z(cxVar, i10, 0, null).j();
                    return;
                }
                return;
            case 5:
                md0 md0Var = (md0) this.b;
                f0 f0Var = (f0) this.c;
                if (i7 == 0) {
                    try {
                        ((ClipboardManager) t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", f0Var.c(false)));
                        if (g0.G3()) {
                            Toast.makeText(md0Var.t1.getParentActivity(), gd.N0(2131743953, null), 0).show();
                            return;
                        }
                        return;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        return;
                    }
                }
                return;
            case 6:
                mr0 mr0Var = (mr0) this.b;
                String str6 = (String) this.c;
                if (i7 == 0) {
                    mr0Var.a.d1(str6);
                    return;
                }
                mr0Var.getClass();
                if (i7 == 1) {
                    if (str6.startsWith("mailto:")) {
                        str6 = str6.substring(7);
                    } else if (str6.startsWith("tel:")) {
                        str6 = str6.substring(4);
                    }
                    g0.g(str6);
                    return;
                }
                return;
            case 7:
                yz yzVar = (yz) this.b;
                String str7 = (String) this.c;
                if (i7 == 0) {
                    c00 c00Var = yzVar.a.w;
                    SpannableStringBuilder[] spannableStringBuilderArr = c00.t0;
                    c00Var.g(str7);
                    return;
                }
                yzVar.getClass();
                if (i7 == 1) {
                    if (str7.startsWith("mailto:")) {
                        str7 = str7.substring(7);
                    } else if (str7.startsWith("tel:")) {
                        str7 = str7.substring(4);
                    }
                    g0.g(str7);
                    return;
                }
                return;
            case 8:
                k30 k30Var = (k30) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                f40 f40Var = k30Var.b;
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                Integer num = (Integer) arrayList2.get(i7);
                int intValue = num.intValue();
                f40Var.x5 = num;
                f40Var.W1(true, true);
                f40Var.x5 = null;
                g0.g3(new ii(k30Var, intValue, 20));
                return;
            case 9:
                hk0 hk0Var = (hk0) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                try {
                    tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                    try {
                        tL_secureRequiredType.type = (TLRPC.SecureValueType) ((Class) arrayList3.get(i7)).newInstance();
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    tL_secureRequiredType = null;
                }
                if (!hk0.z1(tL_secureRequiredType.type)) {
                    if (hk0.x1(tL_secureRequiredType.type)) {
                        tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                        tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypeAddress();
                    }
                    hk0Var.I1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                    return;
                }
                tL_secureRequiredType.selfie_required = true;
                tL_secureRequiredType.translation_required = true;
                tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypePersonalDetails();
                tL_secureRequiredType3 = tL_secureRequiredType;
                tL_secureRequiredType = tL_secureRequiredType2;
                hk0Var.I1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                return;
            case 10:
                wu0.a((wu0) this.b, (Context) this.c, i7);
                return;
            case 11:
                zy0 zy0Var = (zy0) this.b;
                switch (((m60) this.c).a) {
                    case 13:
                        aj.e.e.b(i7 == 0 ? s0.b : s0.c);
                        break;
                    case 14:
                        aj.e.f.b(o0.values()[i7]);
                        break;
                    case 15:
                        aj.e.g.b(i7 == 0 ? p0.b : p0.c);
                        break;
                    default:
                        aj.c cVar = aj.e.h;
                        int i12 = zy0.d[i7];
                        synchronized (cVar) {
                            cVar.b = i12;
                            cVar.a = true;
                            aj.d.a.edit().putInt("round_video_video_bitrate", i12).apply();
                            break;
                        }
                }
                ((l4) zy0Var.c).f();
                return;
            case 12:
                n21 n21Var = (n21) this.b;
                ((ClipboardManager) t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.c));
                n10.t(null, 2131743953, new lc(n21Var.c, null));
                return;
            case 13:
                g61 g61Var = (g61) this.b;
                l6 l6Var = (l6) this.c;
                ThemeActivity themeActivity = g61Var.e;
                if (themeActivity.getParentActivity() == null) {
                    return;
                }
                if (i7 == 0) {
                    if (l6Var.G == null) {
                        themeActivity.getMessagesController().H4(l6Var, null);
                        ks.e().k(ks.v4, l6Var, null);
                        return;
                    }
                    String str8 = "https://" + themeActivity.getMessagesController().X2 + "/addtheme/" + l6Var.G.slug;
                    themeActivity.showDialog(new ap0(themeActivity.getParentActivity(), null, str8, false, str8, false, null));
                    return;
                }
                if (i7 != 1) {
                    if (i7 == 2) {
                        r4Var = ((g2) themeActivity).parentLayout;
                        if (r4Var != null) {
                            m6.u(l6Var, true, false);
                            r4Var2 = ((g2) themeActivity).parentLayout;
                            ((ActionBarLayout) r4Var2).X(true, true);
                            new ThemeEditorView().d(themeActivity.getParentActivity(), l6Var);
                            return;
                        }
                        return;
                    }
                    if (i7 == 3) {
                        themeActivity.presentFragment(new a81(l6Var, null, false));
                        return;
                    }
                    if (themeActivity.getParentActivity() == null) {
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder.a.S = gd.N0(2131751472, "DeleteThemeTitle");
                    alertDialog$Builder.a.U = gd.N0(2131751473, "DeleteThemeAlert");
                    alertDialog$Builder.k(gd.N0(2131751586, "Delete"), new aj0(21, g61Var, l6Var));
                    alertDialog$Builder.h(gd.N0(2131752577, "Cancel"), null);
                    t1 t1Var = alertDialog$Builder.a;
                    themeActivity.showDialog(t1Var);
                    TextView textView = (TextView) t1Var.d(-1);
                    if (textView != null) {
                        t6.U(textView, m6.q7, null);
                        return;
                    }
                    return;
                }
                if (l6Var.b == null && l6Var.d == null) {
                    StringBuilder sb3 = new StringBuilder();
                    int[] iArr = m6.hm;
                    for (int i13 = 0; i13 < iArr.length; i13++) {
                        sb3.append(v4.c(i13));
                        sb3.append("=");
                        sb3.append(iArr[i13]);
                        sb3.append("\n");
                    }
                    q02 = new File(t0.h(), "default_theme.attheme");
                    try {
                        try {
                            try {
                                fileOutputStream = new FileOutputStream(q02);
                            } catch (Exception e11) {
                                a8.g(e11, true);
                            }
                        } catch (Exception e12) {
                            e = e12;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                    try {
                        fileOutputStream.write(g0.h1(sb3.toString()));
                        fileOutputStream.close();
                    } catch (Exception e13) {
                        e = e13;
                        fileOutputStream2 = fileOutputStream;
                        a8.g(e, true);
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        str2 = l6Var.a;
                        if (!str2.endsWith(".attheme")) {
                        }
                        file = new File(w7.z(4), w7.q(str2));
                        if (g0.E(q02, file)) {
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        fileOutputStream2 = fileOutputStream;
                        if (fileOutputStream2 == null) {
                            throw th2;
                        }
                        try {
                            fileOutputStream2.close();
                            throw th2;
                        } catch (Exception e14) {
                            a8.g(e14, true);
                            throw th2;
                        }
                    }
                } else {
                    String str9 = l6Var.d;
                    q02 = str9 != null ? m6.q0(str9) : new File(l6Var.b);
                }
                str2 = l6Var.a;
                if (!str2.endsWith(".attheme")) {
                    str2 = str2.concat(".attheme");
                }
                file = new File(w7.z(4), w7.q(str2));
                try {
                    if (g0.E(q02, file)) {
                        return;
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/xml");
                    if (Build.VERSION.SDK_INT >= 24) {
                        try {
                            Activity parentActivity = themeActivity.getParentActivity();
                            StringBuilder sb4 = new StringBuilder();
                            t0.d();
                            sb4.append("org.telegram.messenger.beta");
                            sb4.append(".provider");
                            intent.putExtra("android.intent.extra.STREAM", FileProvider.d(parentActivity, sb4.toString(), file));
                            intent.setFlags(1);
                        } catch (Exception unused4) {
                            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                        }
                    } else {
                        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                    }
                    themeActivity.startActivityForResult(Intent.createChooser(intent, gd.N0(2131745263, "ShareFile")), 500);
                    return;
                } catch (Exception e15) {
                    a8.g(e15, true);
                    return;
                }
            default:
                b1 b1Var = (b1) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                SharedPreferences sharedPreferences = b1Var.g;
                ArrayList arrayList5 = b1Var.c;
                if (i7 != 0) {
                    a1 a1Var = new a1();
                    a1Var.a = i7 - 1;
                    a1Var.b = arrayList4;
                    arrayList5.add(a1Var);
                    String string = sharedPreferences.getString("moretemplates", null);
                    if (string == null) {
                        sb2 = "" + a1Var.a;
                    } else {
                        StringBuilder n10 = p5.c.n(string, "|");
                        n10.append(a1Var.a);
                        sb2 = n10.toString();
                    }
                    for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                        StringBuilder n11 = p5.c.n(sb2, ",");
                        n11.append(Math.round(((z0) arrayList4.get(i14)).a));
                        n11.append(",");
                        n11.append(Math.round(((z0) arrayList4.get(i14)).b));
                        sb2 = n11.toString();
                    }
                    sharedPreferences.edit().putString("moretemplates", sb2).apply();
                    return;
                }
                StringBuilder sb5 = new StringBuilder("[");
                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                    a1 a1Var2 = (a1) arrayList5.get(i15);
                    if (i15 > 0) {
                        sb5.append(",\n");
                    }
                    sb5.append("\t{\n\t\t\"shape\": ");
                    sb5.append(a1Var2.a);
                    sb5.append(",\n\t\t\"points\": [");
                    for (int i16 = 0; i16 < a1Var2.b.size(); i16++) {
                        if (i16 > 0) {
                            sb5.append(",");
                        }
                        z0 z0Var = (z0) a1Var2.b.get(i16);
                        sb5.append("[");
                        sb5.append(Math.round(z0Var.a));
                        sb5.append(",");
                        sb5.append(Math.round(z0Var.b));
                        sb5.append("]");
                    }
                    sb5.append("],\n\t\t\"freq\": ");
                    sb5.append(Math.round(((a1Var2.c / b1Var.a) * 100.0f) * 100.0f) / 100.0f);
                    sb5.append("\n\t}");
                }
                sb5.append("\n]");
                Log.i("shapedetector", sb5.toString());
                return;
        }
    }
}
