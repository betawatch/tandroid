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
import org.telegram.messenger.camera.q;
import org.telegram.messenger.dt;
import org.telegram.messenger.f0;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.t0;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.v4;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.ad0;
import org.telegram.ui.Components.br0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.q2;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.a81;
import org.telegram.ui.b00;
import org.telegram.ui.bz0;
import org.telegram.ui.cn;
import org.telegram.ui.eb;
import org.telegram.ui.ek0;
import org.telegram.ui.f40;
import org.telegram.ui.g4;
import org.telegram.ui.h61;
import org.telegram.ui.jo0;
import org.telegram.ui.k30;
import org.telegram.ui.l4;
import org.telegram.ui.o21;
import org.telegram.ui.ok0;
import org.telegram.ui.t3;
import org.telegram.ui.xz;
import org.telegram.ui.zu0;
import org.telegram.ui.zw;
import sg.a1;
import sg.b1;
import sg.c1;
import wi.n0;
import wi.o0;
import wi.r0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                t3 t3Var = g4Var.K;
                if (g4Var.L == null || g4Var.u0[0].c.E == null) {
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
                    String lowerCase = !TextUtils.isEmpty(g4Var.u0[0].c.E.cached_page.url) ? g4Var.u0[0].c.E.cached_page.url.toLowerCase() : g4Var.u0[0].c.E.url.toLowerCase();
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
                            g4Var.u0[0].d.h1(t3Var == null ? 0 : 1, t3Var != null ? g0.L(32.0f) : 0);
                            g4Var.k(null);
                            return;
                        }
                    }
                }
                vf.c.t(g4Var.L, str3);
                return;
            case 2:
                eb ebVar = (eb) this.b;
                String str4 = (String) this.c;
                if (i7 == 0) {
                    vf.c.p(ebVar.a.n.getParentActivity(), str4, true);
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
                cn cnVar = (cn) this.b;
                String str5 = (String) this.c;
                g0.g(str5);
                gc.a0(cnVar).i(id.a0(null, null, 2131750884, str5)).j();
                return;
            case 4:
                ArrayList arrayList = (ArrayList) this.b;
                zw zwVar = (zw) this.c;
                int i10 = i7 == 0 ? 0 : i7 == 1 ? 1 : i7 == 2 ? 2 : 3;
                if (arrayList != null) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        dt.t(p10.s0).T(((Long) arrayList.get(i11)).longValue(), i10, 0);
                    }
                }
                if (gc.a(zwVar)) {
                    gc.z(zwVar, i10, 0, null).j();
                    return;
                }
                return;
            case 5:
                ad0 ad0Var = (ad0) this.b;
                f0 f0Var = (f0) this.c;
                if (i7 == 0) {
                    try {
                        ((ClipboardManager) t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", f0Var.c(false)));
                        if (g0.I3()) {
                            Toast.makeText(ad0Var.s1.getParentActivity(), id.M0(2131744194, null), 0).show();
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
                br0 br0Var = (br0) this.b;
                String str6 = (String) this.c;
                if (i7 == 0) {
                    br0Var.a.d1(str6);
                    return;
                }
                br0Var.getClass();
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
                xz xzVar = (xz) this.b;
                String str7 = (String) this.c;
                if (i7 == 0) {
                    b00 b00Var = xzVar.a.w;
                    SpannableStringBuilder[] spannableStringBuilderArr = b00.s0;
                    b00Var.g(str7);
                    return;
                }
                xzVar.getClass();
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
                f40Var.s5 = num;
                f40Var.T1(true, true);
                f40Var.s5 = null;
                g0.h3(new q2(k30Var, intValue, 14));
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
                zu0.a((zu0) this.b, (Context) this.c, i7);
                return;
            case 11:
                bz0 bz0Var = (bz0) this.b;
                switch (((jo0) this.c).a) {
                    case 6:
                        xi.e.e.b(i7 == 0 ? r0.b : r0.c);
                        break;
                    case 7:
                        xi.e.f.b(n0.values()[i7]);
                        break;
                    case 8:
                        xi.e.g.b(i7 == 0 ? o0.b : o0.c);
                        break;
                    default:
                        xi.c cVar = xi.e.h;
                        int i12 = bz0.d[i7];
                        synchronized (cVar) {
                            cVar.b = i12;
                            cVar.a = true;
                            xi.d.a.edit().putInt("round_video_video_bitrate", i12).apply();
                            break;
                        }
                }
                ((l4) bz0Var.c).f();
                return;
            case 12:
                o21 o21Var = (o21) this.b;
                ((ClipboardManager) t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.c));
                q.r(null, 2131744194, new gc(o21Var.c, null));
                return;
            case 13:
                h61 h61Var = (h61) this.b;
                l6 l6Var = (l6) this.c;
                ThemeActivity themeActivity = h61Var.e;
                if (themeActivity.getParentActivity() == null) {
                    return;
                }
                if (i7 == 0) {
                    if (l6Var.F == null) {
                        themeActivity.getMessagesController().y4(l6Var, null);
                        qs.e().k(qs.s4, l6Var, null);
                        return;
                    }
                    String str8 = "https://" + themeActivity.getMessagesController().U2 + "/addtheme/" + l6Var.F.slug;
                    themeActivity.showDialog(new mo0(themeActivity.getParentActivity(), null, str8, false, str8, false, null));
                    return;
                }
                if (i7 != 1) {
                    if (i7 == 2) {
                        r4Var = ((f2) themeActivity).parentLayout;
                        if (r4Var != null) {
                            m6.u(l6Var, true, false);
                            r4Var2 = ((f2) themeActivity).parentLayout;
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
                    alertDialog$Builder.a.R = id.M0(2131751484, "DeleteThemeTitle");
                    alertDialog$Builder.a.T = id.M0(2131751485, "DeleteThemeAlert");
                    alertDialog$Builder.k(id.M0(2131751598, "Delete"), new ok0(18, h61Var, l6Var));
                    alertDialog$Builder.h(id.M0(2131752589, "Cancel"), null);
                    u1 u1Var = alertDialog$Builder.a;
                    themeActivity.showDialog(u1Var);
                    TextView textView = (TextView) u1Var.d(-1);
                    if (textView != null) {
                        t6.U(textView, m6.q7, null);
                        return;
                    }
                    return;
                }
                if (l6Var.b == null && l6Var.d == null) {
                    StringBuilder sb3 = new StringBuilder();
                    int[] iArr = m6.em;
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
                    themeActivity.startActivityForResult(Intent.createChooser(intent, id.M0(2131745459, "ShareFile")), 500);
                    return;
                } catch (Exception e15) {
                    a8.g(e15, true);
                    return;
                }
            default:
                c1 c1Var = (c1) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                SharedPreferences sharedPreferences = c1Var.g;
                ArrayList arrayList5 = c1Var.c;
                if (i7 != 0) {
                    b1 b1Var = new b1();
                    b1Var.a = i7 - 1;
                    b1Var.b = arrayList4;
                    arrayList5.add(b1Var);
                    String string = sharedPreferences.getString("moretemplates", null);
                    if (string == null) {
                        sb2 = "" + b1Var.a;
                    } else {
                        StringBuilder j3 = rf.b.j(string, "|");
                        j3.append(b1Var.a);
                        sb2 = j3.toString();
                    }
                    for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                        StringBuilder j10 = rf.b.j(sb2, ",");
                        j10.append(Math.round(((a1) arrayList4.get(i14)).a));
                        j10.append(",");
                        j10.append(Math.round(((a1) arrayList4.get(i14)).b));
                        sb2 = j10.toString();
                    }
                    sharedPreferences.edit().putString("moretemplates", sb2).apply();
                    return;
                }
                StringBuilder sb5 = new StringBuilder("[");
                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                    b1 b1Var2 = (b1) arrayList5.get(i15);
                    if (i15 > 0) {
                        sb5.append(",\n");
                    }
                    sb5.append("\t{\n\t\t\"shape\": ");
                    sb5.append(b1Var2.a);
                    sb5.append(",\n\t\t\"points\": [");
                    for (int i16 = 0; i16 < b1Var2.b.size(); i16++) {
                        if (i16 > 0) {
                            sb5.append(",");
                        }
                        a1 a1Var = (a1) b1Var2.b.get(i16);
                        sb5.append("[");
                        sb5.append(Math.round(a1Var.a));
                        sb5.append(",");
                        sb5.append(Math.round(a1Var.b));
                        sb5.append("]");
                    }
                    sb5.append("],\n\t\t\"freq\": ");
                    sb5.append(Math.round(((b1Var2.c / c1Var.a) * 100.0f) * 100.0f) / 100.0f);
                    sb5.append("\n\t}");
                }
                sb5.append("\n]");
                Log.i("shapedetector", sb5.toString());
                return;
        }
    }
}
