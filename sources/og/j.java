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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.u4;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.ad0;
import org.telegram.ui.Components.ar0;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.r2;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.an;
import org.telegram.ui.bk0;
import org.telegram.ui.c40;
import org.telegram.ui.eb;
import org.telegram.ui.f61;
import org.telegram.ui.g4;
import org.telegram.ui.go0;
import org.telegram.ui.h30;
import org.telegram.ui.l21;
import org.telegram.ui.l4;
import org.telegram.ui.lk0;
import org.telegram.ui.t3;
import org.telegram.ui.uz;
import org.telegram.ui.wu0;
import org.telegram.ui.ww;
import org.telegram.ui.xy0;
import org.telegram.ui.y71;
import org.telegram.ui.yz;
import sg.b1;
import sg.c1;
import sg.d1;
import wi.n0;
import wi.o0;
import wi.r0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
        q4 q4Var;
        q4 q4Var2;
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
                an anVar = (an) this.b;
                String str5 = (String) this.c;
                g0.g(str5);
                hc.a0(anVar).i(id.a0(null, null, 2131750885, str5)).j();
                return;
            case 4:
                ArrayList arrayList = (ArrayList) this.b;
                ww wwVar = (ww) this.c;
                int i10 = i7 == 0 ? 0 : i7 == 1 ? 1 : i7 == 2 ? 2 : 3;
                if (arrayList != null) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        dt.t(p10.s0).T(((Long) arrayList.get(i11)).longValue(), i10, 0);
                    }
                }
                if (hc.a(wwVar)) {
                    hc.z(wwVar, i10, 0, null).j();
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
                            Toast.makeText(ad0Var.p1.getParentActivity(), id.M0(2131744197, null), 0).show();
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
                ar0 ar0Var = (ar0) this.b;
                String str6 = (String) this.c;
                if (i7 == 0) {
                    ar0Var.a.b1(str6);
                    return;
                }
                ar0Var.getClass();
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
                uz uzVar = (uz) this.b;
                String str7 = (String) this.c;
                if (i7 == 0) {
                    yz yzVar = uzVar.a.w;
                    SpannableStringBuilder[] spannableStringBuilderArr = yz.s0;
                    yzVar.g(str7);
                    return;
                }
                uzVar.getClass();
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
                c40Var.p5 = num;
                c40Var.T1(true, true);
                c40Var.p5 = null;
                g0.h3(new r2(h30Var, intValue, 14));
                return;
            case 9:
                bk0 bk0Var = (bk0) this.b;
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
                if (!bk0.z1(tL_secureRequiredType.type)) {
                    if (bk0.x1(tL_secureRequiredType.type)) {
                        tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                        tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypeAddress();
                    }
                    bk0Var.I1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                    return;
                }
                tL_secureRequiredType.selfie_required = true;
                tL_secureRequiredType.translation_required = true;
                tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypePersonalDetails();
                tL_secureRequiredType3 = tL_secureRequiredType;
                tL_secureRequiredType = tL_secureRequiredType2;
                bk0Var.I1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                return;
            case 10:
                wu0.a((wu0) this.b, (Context) this.c, i7);
                return;
            case 11:
                xy0 xy0Var = (xy0) this.b;
                switch (((go0) this.c).a) {
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
                        int i12 = xy0.d[i7];
                        synchronized (cVar) {
                            cVar.b = i12;
                            cVar.a = true;
                            xi.d.a.edit().putInt("round_video_video_bitrate", i12).apply();
                            break;
                        }
                }
                ((l4) xy0Var.c).f();
                return;
            case 12:
                l21 l21Var = (l21) this.b;
                ((ClipboardManager) t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.c));
                q.r(null, 2131744197, new hc(l21Var.c, null));
                return;
            case 13:
                f61 f61Var = (f61) this.b;
                j6 j6Var = (j6) this.c;
                ThemeActivity themeActivity = f61Var.e;
                if (themeActivity.getParentActivity() == null) {
                    return;
                }
                if (i7 == 0) {
                    if (j6Var.F == null) {
                        themeActivity.getMessagesController().y4(j6Var, null);
                        qs.e().k(qs.s4, j6Var, null);
                        return;
                    }
                    String str8 = "https://" + themeActivity.getMessagesController().U2 + "/addtheme/" + j6Var.F.slug;
                    themeActivity.showDialog(new mo0(themeActivity.getParentActivity(), null, str8, false, str8, false, null));
                    return;
                }
                if (i7 != 1) {
                    if (i7 == 2) {
                        q4Var = ((f2) themeActivity).parentLayout;
                        if (q4Var != null) {
                            k6.u(j6Var, true, false);
                            q4Var2 = ((f2) themeActivity).parentLayout;
                            ((ActionBarLayout) q4Var2).X(true, true);
                            new ThemeEditorView().d(themeActivity.getParentActivity(), j6Var);
                            return;
                        }
                        return;
                    }
                    if (i7 == 3) {
                        themeActivity.presentFragment(new y71(j6Var, null, false));
                        return;
                    }
                    if (themeActivity.getParentActivity() == null) {
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder.a.R = id.M0(2131751485, "DeleteThemeTitle");
                    alertDialog$Builder.a.T = id.M0(2131751486, "DeleteThemeAlert");
                    alertDialog$Builder.k(id.M0(2131751599, "Delete"), new lk0(18, f61Var, j6Var));
                    alertDialog$Builder.h(id.M0(2131752589, "Cancel"), null);
                    u1 u1Var = alertDialog$Builder.a;
                    themeActivity.showDialog(u1Var);
                    TextView textView = (TextView) u1Var.d(-1);
                    if (textView != null) {
                        r6.V(textView, k6.q7, null);
                        return;
                    }
                    return;
                }
                if (j6Var.b == null && j6Var.d == null) {
                    StringBuilder sb3 = new StringBuilder();
                    int[] iArr = k6.em;
                    for (int i13 = 0; i13 < iArr.length; i13++) {
                        sb3.append(u4.c(i13));
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
                        str2 = j6Var.a;
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
                    String str9 = j6Var.d;
                    q02 = str9 != null ? k6.q0(str9) : new File(j6Var.b);
                }
                str2 = j6Var.a;
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
                    themeActivity.startActivityForResult(Intent.createChooser(intent, id.M0(2131745462, "ShareFile")), 500);
                    return;
                } catch (Exception e15) {
                    a8.g(e15, true);
                    return;
                }
            default:
                d1 d1Var = (d1) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                SharedPreferences sharedPreferences = d1Var.g;
                ArrayList arrayList5 = d1Var.c;
                if (i7 != 0) {
                    c1 c1Var = new c1();
                    c1Var.a = i7 - 1;
                    c1Var.b = arrayList4;
                    arrayList5.add(c1Var);
                    String string = sharedPreferences.getString("moretemplates", null);
                    if (string == null) {
                        sb2 = "" + c1Var.a;
                    } else {
                        StringBuilder j3 = rf.b.j(string, "|");
                        j3.append(c1Var.a);
                        sb2 = j3.toString();
                    }
                    for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                        StringBuilder j10 = rf.b.j(sb2, ",");
                        j10.append(Math.round(((b1) arrayList4.get(i14)).a));
                        j10.append(",");
                        j10.append(Math.round(((b1) arrayList4.get(i14)).b));
                        sb2 = j10.toString();
                    }
                    sharedPreferences.edit().putString("moretemplates", sb2).apply();
                    return;
                }
                StringBuilder sb5 = new StringBuilder("[");
                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                    c1 c1Var2 = (c1) arrayList5.get(i15);
                    if (i15 > 0) {
                        sb5.append(",\n");
                    }
                    sb5.append("\t{\n\t\t\"shape\": ");
                    sb5.append(c1Var2.a);
                    sb5.append(",\n\t\t\"points\": [");
                    for (int i16 = 0; i16 < c1Var2.b.size(); i16++) {
                        if (i16 > 0) {
                            sb5.append(",");
                        }
                        b1 b1Var = (b1) c1Var2.b.get(i16);
                        sb5.append("[");
                        sb5.append(Math.round(b1Var.a));
                        sb5.append(",");
                        sb5.append(Math.round(b1Var.b));
                        sb5.append("]");
                    }
                    sb5.append("],\n\t\t\"freq\": ");
                    sb5.append(Math.round(((c1Var2.c / d1Var.a) * 100.0f) * 100.0f) / 100.0f);
                    sb5.append("\n\t}");
                }
                sb5.append("\n]");
                Log.i("shapedetector", sb5.toString());
                return;
        }
    }
}
