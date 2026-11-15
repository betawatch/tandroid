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
import org.telegram.messenger.at;
import org.telegram.messenger.f0;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.messenger.t0;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.o4;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.s4;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.a2;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cr0;
import org.telegram.ui.Components.po0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.an;
import org.telegram.ui.c40;
import org.telegram.ui.c61;
import org.telegram.ui.db;
import org.telegram.ui.ek0;
import org.telegram.ui.g4;
import org.telegram.ui.h30;
import org.telegram.ui.i21;
import org.telegram.ui.l4;
import org.telegram.ui.t3;
import org.telegram.ui.t70;
import org.telegram.ui.uu0;
import org.telegram.ui.vy0;
import org.telegram.ui.vz;
import org.telegram.ui.w71;
import org.telegram.ui.xi0;
import org.telegram.ui.yw;
import org.telegram.ui.zz;
import sg.a1;
import sg.b1;
import sg.z0;
import zi.o0;
import zi.q0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        o4 o4Var;
        o4 o4Var2;
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
                an anVar = (an) this.b;
                String str5 = (String) this.c;
                g0.g(str5);
                cc.a0(anVar).i(hd.a0(null, null, 2131750884, str5)).j();
                return;
            case 4:
                ArrayList arrayList = (ArrayList) this.b;
                yw ywVar = (yw) this.c;
                int i10 = i7 == 0 ? 0 : i7 == 1 ? 1 : i7 == 2 ? 2 : 3;
                if (arrayList != null) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        at.t(m10.t0).T(((Long) arrayList.get(i11)).longValue(), i10, 0);
                    }
                }
                if (cc.a(ywVar)) {
                    cc.z(ywVar, i10, 0, null).j();
                    return;
                }
                return;
            case 5:
                bd0 bd0Var = (bd0) this.b;
                f0 f0Var = (f0) this.c;
                if (i7 == 0) {
                    try {
                        ((ClipboardManager) t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", f0Var.c(false)));
                        if (g0.H3()) {
                            Toast.makeText(bd0Var.t1.getParentActivity(), hd.M0(2131744194, null), 0).show();
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
                cr0 cr0Var = (cr0) this.b;
                String str6 = (String) this.c;
                if (i7 == 0) {
                    cr0Var.a.d1(str6);
                    return;
                }
                cr0Var.getClass();
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
                vz vzVar = (vz) this.b;
                String str7 = (String) this.c;
                if (i7 == 0) {
                    zz zzVar = vzVar.a.w;
                    SpannableStringBuilder[] spannableStringBuilderArr = zz.t0;
                    zzVar.g(str7);
                    return;
                }
                vzVar.getClass();
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
                h30 h30Var = (h30) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                c40 c40Var = h30Var.b;
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                Integer num = (Integer) arrayList2.get(i7);
                int intValue = num.intValue();
                c40Var.x5 = num;
                c40Var.V1(true, true);
                c40Var.x5 = null;
                g0.h3(new a2(h30Var, intValue, 17));
                return;
            case 9:
                ek0 ek0Var = (ek0) this.b;
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
                if (!ek0.z1(tL_secureRequiredType.type)) {
                    if (ek0.x1(tL_secureRequiredType.type)) {
                        tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                        tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypeAddress();
                    }
                    ek0Var.I1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                    return;
                }
                tL_secureRequiredType.selfie_required = true;
                tL_secureRequiredType.translation_required = true;
                tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypePersonalDetails();
                tL_secureRequiredType3 = tL_secureRequiredType;
                tL_secureRequiredType = tL_secureRequiredType2;
                ek0Var.I1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                return;
            case 10:
                uu0.a((uu0) this.b, (Context) this.c, i7);
                return;
            case 11:
                vy0 vy0Var = (vy0) this.b;
                switch (((t70) this.c).a) {
                    case 12:
                        aj.e.e.b(i7 == 0 ? zi.t0.b : zi.t0.c);
                        break;
                    case 13:
                        aj.e.f.b(o0.values()[i7]);
                        break;
                    case 14:
                        aj.e.g.b(i7 == 0 ? q0.b : q0.c);
                        break;
                    default:
                        aj.c cVar = aj.e.h;
                        int i12 = vy0.d[i7];
                        synchronized (cVar) {
                            cVar.b = i12;
                            cVar.a = true;
                            aj.d.a.edit().putInt("round_video_video_bitrate", i12).apply();
                            break;
                        }
                }
                ((l4) vy0Var.c).f();
                return;
            case 12:
                i21 i21Var = (i21) this.b;
                ((ClipboardManager) t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.c));
                i20.s(null, 2131744194, new cc(i21Var.c, null));
                return;
            case 13:
                c61 c61Var = (c61) this.b;
                i6 i6Var = (i6) this.c;
                ThemeActivity themeActivity = c61Var.e;
                if (themeActivity.getParentActivity() == null) {
                    return;
                }
                if (i7 == 0) {
                    if (i6Var.G == null) {
                        themeActivity.getMessagesController().y4(i6Var, null);
                        ns.e().k(ns.s4, i6Var, null);
                        return;
                    }
                    String str8 = "https://" + themeActivity.getMessagesController().V2 + "/addtheme/" + i6Var.G.slug;
                    themeActivity.showDialog(new po0(themeActivity.getParentActivity(), null, str8, false, str8, false, null));
                    return;
                }
                if (i7 != 1) {
                    if (i7 == 2) {
                        o4Var = ((e2) themeActivity).parentLayout;
                        if (o4Var != null) {
                            j6.u(i6Var, true, false);
                            o4Var2 = ((e2) themeActivity).parentLayout;
                            ((ActionBarLayout) o4Var2).X(true, true);
                            new ThemeEditorView().d(themeActivity.getParentActivity(), i6Var);
                            return;
                        }
                        return;
                    }
                    if (i7 == 3) {
                        themeActivity.presentFragment(new w71(i6Var, null, false));
                        return;
                    }
                    if (themeActivity.getParentActivity() == null) {
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder.a.S = hd.M0(2131751484, "DeleteThemeTitle");
                    alertDialog$Builder.a.U = hd.M0(2131751485, "DeleteThemeAlert");
                    alertDialog$Builder.k(hd.M0(2131751598, "Delete"), new xi0(22, c61Var, i6Var));
                    alertDialog$Builder.h(hd.M0(2131752589, "Cancel"), null);
                    t1 t1Var = alertDialog$Builder.a;
                    themeActivity.showDialog(t1Var);
                    TextView textView = (TextView) t1Var.d(-1);
                    if (textView != null) {
                        q6.U(textView, j6.q7, null);
                        return;
                    }
                    return;
                }
                if (i6Var.b == null && i6Var.d == null) {
                    StringBuilder sb3 = new StringBuilder();
                    int[] iArr = j6.hm;
                    for (int i13 = 0; i13 < iArr.length; i13++) {
                        sb3.append(s4.c(i13));
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
                        str2 = i6Var.a;
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
                    String str9 = i6Var.d;
                    q02 = str9 != null ? j6.q0(str9) : new File(i6Var.b);
                }
                str2 = i6Var.a;
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
                    themeActivity.startActivityForResult(Intent.createChooser(intent, hd.M0(2131745459, "ShareFile")), 500);
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
                        StringBuilder m10 = r.b.m(string, "|");
                        m10.append(a1Var.a);
                        sb2 = m10.toString();
                    }
                    for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                        StringBuilder m11 = r.b.m(sb2, ",");
                        m11.append(Math.round(((z0) arrayList4.get(i14)).a));
                        m11.append(",");
                        m11.append(Math.round(((z0) arrayList4.get(i14)).b));
                        sb2 = m11.toString();
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
