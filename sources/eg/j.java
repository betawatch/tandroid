package eg;

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
import ig.h1;
import ig.j1;
import ig.k1;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URLDecoder;
import java.util.ArrayList;
import li.r0;
import li.s0;
import li.v0;
import org.telegram.messenger.b8;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.h0;
import org.telegram.messenger.i0;
import org.telegram.messenger.ot;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.w0;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.op0;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.Components.z11;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.ay;
import org.telegram.ui.b50;
import org.telegram.ui.c41;
import org.telegram.ui.ep0;
import org.telegram.ui.f40;
import org.telegram.ui.gw0;
import org.telegram.ui.h4;
import org.telegram.ui.jb;
import org.telegram.ui.l01;
import org.telegram.ui.ll0;
import org.telegram.ui.p91;
import org.telegram.ui.u3;
import org.telegram.ui.un;
import org.telegram.ui.v00;
import org.telegram.ui.x71;
import org.telegram.ui.z00;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011c A[Catch: Exception -> 0x015b, TRY_LEAVE, TryCatch #5 {Exception -> 0x015b, blocks: (B:39:0x0114, B:43:0x011c, B:47:0x0164, B:46:0x015d, B:53:0x0153, B:51:0x012e), top: B:38:0x0114, inners: #12 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x00c8 -> B:27:0x00fb). Please report as a decompilation issue!!! */
    @Override // android.content.DialogInterface.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(DialogInterface dialogInterface, int i10) {
        String sb2;
        String str;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        z4 z4Var;
        z4 z4Var2;
        File q02;
        String str2;
        File file;
        Throwable th2;
        FileOutputStream fileOutputStream;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3 = null;
        r10 = null;
        r10 = null;
        r10 = null;
        FileOutputStream fileOutputStream2 = null;
        switch (this.a) {
            case 0:
                q.a((q) this.b, (Integer[][]) this.c, i10);
                return;
            case 1:
                k1 k1Var = (k1) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                SharedPreferences sharedPreferences = k1Var.g;
                ArrayList arrayList2 = k1Var.c;
                if (i10 != 0) {
                    j1 j1Var = new j1();
                    j1Var.a = i10 - 1;
                    j1Var.b = arrayList;
                    arrayList2.add(j1Var);
                    String string = sharedPreferences.getString("moretemplates", null);
                    if (string == null) {
                        sb2 = "" + j1Var.a;
                    } else {
                        StringBuilder i11 = sc.e.i(string, "|");
                        i11.append(j1Var.a);
                        sb2 = i11.toString();
                    }
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        StringBuilder i13 = sc.e.i(sb2, ",");
                        i13.append(Math.round(((h1) arrayList.get(i12)).a));
                        i13.append(",");
                        i13.append(Math.round(((h1) arrayList.get(i12)).b));
                        sb2 = i13.toString();
                    }
                    sharedPreferences.edit().putString("moretemplates", sb2).apply();
                    return;
                }
                StringBuilder sb3 = new StringBuilder("[");
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    j1 j1Var2 = (j1) arrayList2.get(i14);
                    if (i14 > 0) {
                        sb3.append(",\n");
                    }
                    sb3.append("\t{\n\t\t\"shape\": ");
                    sb3.append(j1Var2.a);
                    sb3.append(",\n\t\t\"points\": [");
                    for (int i15 = 0; i15 < j1Var2.b.size(); i15++) {
                        if (i15 > 0) {
                            sb3.append(",");
                        }
                        h1 h1Var = (h1) j1Var2.b.get(i15);
                        sb3.append("[");
                        sb3.append(Math.round(h1Var.a));
                        sb3.append(",");
                        sb3.append(Math.round(h1Var.b));
                        sb3.append("]");
                    }
                    sb3.append("],\n\t\t\"freq\": ");
                    sb3.append(Math.round(((j1Var2.c / k1Var.a) * 100.0f) * 100.0f) / 100.0f);
                    sb3.append("\n\t}");
                }
                sb3.append("\n]");
                Log.i("shapedetector", sb3.toString());
                return;
            case 2:
                h4 h4Var = (h4) this.b;
                String str3 = (String) this.c;
                u3 u3Var = h4Var.K;
                if (h4Var.L == null || h4Var.u0[0].c.E == null) {
                    return;
                }
                if (i10 != 0) {
                    if (i10 != 1 || str3 == null) {
                        return;
                    }
                    if (str3.startsWith("mailto:")) {
                        str3 = str3.substring(7);
                    } else if (str3.startsWith("tel:")) {
                        str3 = str3.substring(4);
                    }
                    i0.g(str3);
                    return;
                }
                int lastIndexOf = str3.lastIndexOf(35);
                if (lastIndexOf != -1) {
                    String lowerCase = !TextUtils.isEmpty(h4Var.u0[0].c.E.cached_page.url) ? h4Var.u0[0].c.E.cached_page.url.toLowerCase() : h4Var.u0[0].c.E.url.toLowerCase();
                    try {
                        str = URLDecoder.decode(str3.substring(lastIndexOf + 1), "UTF-8");
                    } catch (Exception unused) {
                        str = "";
                    }
                    if (str3.toLowerCase().contains(lowerCase)) {
                        if (!TextUtils.isEmpty(str)) {
                            h4Var.T(str, true);
                            return;
                        } else {
                            h4Var.u0[0].d.h1(u3Var == null ? 0 : 1, u3Var != null ? i0.L(32.0f) : 0);
                            h4Var.k(null);
                            return;
                        }
                    }
                }
                gf.f.r(h4Var.L, str3);
                return;
            case 3:
                jb jbVar = (jb) this.b;
                String str4 = (String) this.c;
                if (i10 == 0) {
                    gf.f.n(jbVar.a.n.getParentActivity(), str4, true);
                    return;
                }
                if (i10 == 1) {
                    if (str4.startsWith("mailto:")) {
                        str4 = str4.substring(7);
                    } else if (str4.startsWith("tel:")) {
                        str4 = str4.substring(4);
                    }
                    i0.g(str4);
                    return;
                }
                return;
            case 4:
                un unVar = (un) this.b;
                String str5 = (String) this.c;
                i0.g(str5);
                cc.a0(unVar).i(cd.a0(null, null, 2131750885, str5)).j();
                return;
            case 5:
                ArrayList arrayList3 = (ArrayList) this.b;
                ay ayVar = (ay) this.c;
                int i16 = i10 == 0 ? 0 : i10 == 1 ? 1 : i10 == 2 ? 2 : 3;
                if (arrayList3 != null) {
                    for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                        ot.t(d20.s0).T(((Long) arrayList3.get(i17)).longValue(), i16, 0);
                    }
                }
                if (cc.a(ayVar)) {
                    cc.z(ayVar, i16, 0, null).j();
                    return;
                }
                return;
            case 6:
                vd0 vd0Var = (vd0) this.b;
                h0 h0Var = (h0) this.c;
                if (i10 == 0) {
                    try {
                        ((ClipboardManager) w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", h0Var.c(false)));
                        if (i0.H3()) {
                            Toast.makeText(vd0Var.p1.getParentActivity(), cd.L0(2131744219, null), 0).show();
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        f8.g(e, true);
                        return;
                    }
                }
                return;
            case 7:
                bs0 bs0Var = (bs0) this.b;
                String str6 = (String) this.c;
                if (i10 == 0) {
                    bs0Var.a.Y0(str6);
                    return;
                }
                bs0Var.getClass();
                if (i10 == 1) {
                    if (str6.startsWith("mailto:")) {
                        str6 = str6.substring(7);
                    } else if (str6.startsWith("tel:")) {
                        str6 = str6.substring(4);
                    }
                    i0.g(str6);
                    return;
                }
                return;
            case 8:
                v00 v00Var = (v00) this.b;
                String str7 = (String) this.c;
                if (i10 == 0) {
                    z00 z00Var = v00Var.a.w;
                    SpannableStringBuilder[] spannableStringBuilderArr = z00.s0;
                    z00Var.g(str7);
                    return;
                }
                v00Var.getClass();
                if (i10 == 1) {
                    if (str7.startsWith("mailto:")) {
                        str7 = str7.substring(7);
                    } else if (str7.startsWith("tel:")) {
                        str7 = str7.substring(4);
                    }
                    i0.g(str7);
                    return;
                }
                return;
            case 9:
                f40 f40Var = (f40) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                b50 b50Var = f40Var.b;
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                Integer num = (Integer) arrayList4.get(i10);
                int intValue = num.intValue();
                b50Var.p5 = num;
                b50Var.Q1(true, true);
                b50Var.p5 = null;
                i0.g3(new qq(f40Var, intValue, 9));
                return;
            case 10:
                ll0 ll0Var = (ll0) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                try {
                    tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                    try {
                        tL_secureRequiredType.type = (TLRPC.SecureValueType) ((Class) arrayList5.get(i10)).newInstance();
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    tL_secureRequiredType = null;
                }
                if (!ll0.y1(tL_secureRequiredType.type)) {
                    if (ll0.w1(tL_secureRequiredType.type)) {
                        tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                        tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypeAddress();
                    }
                    ll0Var.H1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                    return;
                }
                tL_secureRequiredType.selfie_required = true;
                tL_secureRequiredType.translation_required = true;
                tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypePersonalDetails();
                tL_secureRequiredType3 = tL_secureRequiredType;
                tL_secureRequiredType = tL_secureRequiredType2;
                ll0Var.H1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                return;
            case 11:
                gw0.a((gw0) this.b, (Context) this.c, i10);
                return;
            case 12:
                l01 l01Var = (l01) this.b;
                switch (((z11) this.c).a) {
                    case 26:
                        mi.e.e.b(i10 == 0 ? v0.b : v0.c);
                        break;
                    case 27:
                        mi.e.f.b(r0.values()[i10]);
                        break;
                    case 28:
                        mi.e.g.b(i10 == 0 ? s0.b : s0.c);
                        break;
                    default:
                        mi.c cVar = mi.e.h;
                        int i18 = l01.d[i10];
                        synchronized (cVar) {
                            cVar.b = i18;
                            cVar.a = true;
                            mi.d.a.edit().putInt("round_video_video_bitrate", i18).apply();
                            break;
                        }
                }
                ((fg.j) l01Var.c).f();
                return;
            case 13:
                c41 c41Var = (c41) this.b;
                ((ClipboardManager) w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.c));
                z20.r(null, 2131744219, new cc(c41Var.c, null));
                return;
            default:
                x71 x71Var = (x71) this.b;
                s6 s6Var = (s6) this.c;
                ThemeActivity themeActivity = x71Var.e;
                if (themeActivity.getParentActivity() == null) {
                    return;
                }
                if (i10 == 0) {
                    if (s6Var.F == null) {
                        themeActivity.getMessagesController().v4(s6Var, null);
                        zs.e().k(zs.s4, s6Var, null);
                        return;
                    }
                    String str8 = "https://" + themeActivity.getMessagesController().U2 + "/addtheme/" + s6Var.F.slug;
                    themeActivity.showDialog(new op0(themeActivity.getParentActivity(), null, str8, false, str8, false, null));
                    return;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        z4Var = ((k2) themeActivity).parentLayout;
                        if (z4Var != null) {
                            t6.u(s6Var, true, false);
                            z4Var2 = ((k2) themeActivity).parentLayout;
                            ((ActionBarLayout) z4Var2).W(true, true);
                            new ThemeEditorView().d(themeActivity.getParentActivity(), s6Var);
                            return;
                        }
                        return;
                    }
                    if (i10 == 3) {
                        themeActivity.presentFragment(new p91(s6Var, null, false));
                        return;
                    }
                    if (themeActivity.getParentActivity() == null) {
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder.a.R = cd.L0(2131751485, "DeleteThemeTitle");
                    alertDialog$Builder.a.T = cd.L0(2131751486, "DeleteThemeAlert");
                    alertDialog$Builder.k(cd.L0(2131751599, "Delete"), new ep0(17, x71Var, s6Var));
                    alertDialog$Builder.h(cd.L0(2131752589, "Cancel"), null);
                    x1 x1Var = alertDialog$Builder.a;
                    themeActivity.showDialog(x1Var);
                    TextView textView = (TextView) x1Var.d(-1);
                    if (textView != null) {
                        a7.V(textView, t6.q7, null);
                        return;
                    }
                    return;
                }
                if (s6Var.b == null && s6Var.d == null) {
                    StringBuilder sb4 = new StringBuilder();
                    int[] iArr = t6.em;
                    for (int i19 = 0; i19 < iArr.length; i19++) {
                        sb4.append(d5.c(i19));
                        sb4.append("=");
                        sb4.append(iArr[i19]);
                        sb4.append("\n");
                    }
                    q02 = new File(w0.h(), "default_theme.attheme");
                    try {
                        try {
                            try {
                                fileOutputStream = new FileOutputStream(q02);
                            } catch (Throwable th3) {
                                th2 = th3;
                            }
                        } catch (Exception e7) {
                            e = e7;
                        }
                    } catch (Exception e10) {
                        f8.g(e10, true);
                    }
                    try {
                        fileOutputStream.write(i0.h1(sb4.toString()));
                        fileOutputStream.close();
                    } catch (Exception e11) {
                        e = e11;
                        fileOutputStream2 = fileOutputStream;
                        f8.g(e, true);
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        str2 = s6Var.a;
                        if (!str2.endsWith(".attheme")) {
                        }
                        file = new File(b8.z(4), b8.q(str2));
                        if (i0.E(q02, file)) {
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
                        } catch (Exception e12) {
                            f8.g(e12, true);
                            throw th2;
                        }
                    }
                } else {
                    String str9 = s6Var.d;
                    q02 = str9 != null ? t6.q0(str9) : new File(s6Var.b);
                }
                str2 = s6Var.a;
                if (!str2.endsWith(".attheme")) {
                    str2 = str2.concat(".attheme");
                }
                file = new File(b8.z(4), b8.q(str2));
                try {
                    if (i0.E(q02, file)) {
                        return;
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/xml");
                    if (Build.VERSION.SDK_INT >= 24) {
                        try {
                            Activity parentActivity = themeActivity.getParentActivity();
                            StringBuilder sb5 = new StringBuilder();
                            w0.d();
                            sb5.append("org.telegram.messenger.beta");
                            sb5.append(".provider");
                            intent.putExtra("android.intent.extra.STREAM", FileProvider.d(parentActivity, sb5.toString(), file));
                            intent.setFlags(1);
                        } catch (Exception unused4) {
                            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                        }
                    } else {
                        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                    }
                    themeActivity.startActivityForResult(Intent.createChooser(intent, cd.L0(2131745477, "ShareFile")), 500);
                    return;
                } catch (Exception e13) {
                    f8.g(e13, true);
                    return;
                }
        }
    }
}
