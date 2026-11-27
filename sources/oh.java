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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.d0;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class oh implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oh(Object obj, Object obj2, byte b) {
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
        wk5 wk5Var;
        wk5 wk5Var2;
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
                uj3 uj3Var = (uj3) this.c;
                int i4 = i == 0 ? 0 : i == 1 ? 1 : i == 2 ? 2 : 3;
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    ip7.n(yac.t0).T(((Long) arrayList.get(i5)).longValue(), i4, 0L);
                }
                if (d31.a(uj3Var)) {
                    d31.z(uj3Var, i4, 0, null).j();
                    return;
                }
                return;
            case 1:
                o oVar = (o) this.b;
                String str3 = (String) this.c;
                tw twVar = oVar.L;
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
                    hl.g(str3);
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
                        x46 x46Var = oVar.v0[0].d;
                        if (twVar != null) {
                            i2 = hl.L(32.0f);
                        } else {
                            i3 = 0;
                        }
                        x46Var.g1(i3, i2);
                        oVar.j(null);
                        return;
                    }
                }
                m01.u(oVar.M, str3);
                return;
            case 2:
                of1 of1Var = (of1) this.b;
                String str4 = (String) this.c;
                if (i == 0) {
                    m01.q(of1Var.a.n.getParentActivity(), str4, true);
                    return;
                }
                if (i == 1) {
                    if (str4.startsWith("mailto:")) {
                        str4 = str4.substring(7);
                    } else if (str4.startsWith("tel:")) {
                        str4 = str4.substring(4);
                    }
                    hl.g(str4);
                    return;
                }
                return;
            case 3:
                zu1 zu1Var = (zu1) this.b;
                String str5 = (String) this.c;
                hl.g(str5);
                d31.b0(zu1Var).i(ob6.a0(null, null, 2131750849, str5)).j();
                return;
            case 4:
                ((b43) this.b).h((Integer[][]) this.c, i);
                return;
            case 5:
                ug4 ug4Var = (ug4) this.b;
                String str6 = (String) this.c;
                if (i == 0) {
                    yg4 yg4Var = ug4Var.a.w;
                    SpannableStringBuilder[] spannableStringBuilderArr = yg4.t0;
                    yg4Var.g(str6);
                    return;
                } else {
                    if (i == 1) {
                        if (str6.startsWith("mailto:")) {
                            str6 = str6.substring(7);
                        } else if (str6.startsWith("tel:")) {
                            str6 = str6.substring(4);
                        }
                        hl.g(str6);
                        return;
                    }
                    return;
                }
            case 6:
                m85 m85Var = (m85) this.c;
                ArrayList arrayList2 = (ArrayList) this.b;
                j95 j95Var = m85Var.b;
                if (VoIPService.getSharedInstance() != null) {
                    Integer num = (Integer) arrayList2.get(i);
                    int intValue = num.intValue();
                    j95Var.n5 = num;
                    j95Var.M1(true, true);
                    j95Var.n5 = null;
                    hl.c3(new hl3((Object) m85Var, intValue, (byte) 14));
                    return;
                }
                return;
            case 7:
                b18 b18Var = (b18) this.c;
                ArrayList arrayList3 = (ArrayList) this.b;
                b18Var.getClass();
                try {
                    tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                    try {
                        tL_secureRequiredType.type = (TLRPC.SecureValueType) ((Class) arrayList3.get(i)).newInstance();
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    tL_secureRequiredType = null;
                }
                if (!b18.o1(tL_secureRequiredType.type)) {
                    if (b18.n1(tL_secureRequiredType.type)) {
                        tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                        tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypeAddress();
                    }
                    b18Var.H1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                    return;
                }
                tL_secureRequiredType.selfie_required = true;
                tL_secureRequiredType.translation_required = true;
                tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypePersonalDetails();
                tL_secureRequiredType3 = tL_secureRequiredType;
                tL_secureRequiredType = tL_secureRequiredType2;
                b18Var.H1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                return;
            case 8:
                r78 r78Var = (r78) this.b;
                gl glVar = (gl) this.c;
                if (i == 0) {
                    try {
                        ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", glVar.c(false)));
                        if (hl.C3()) {
                            Toast.makeText(r78Var.s1.getParentActivity(), ob6.M0(2131743847, null), 0).show();
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        return;
                    }
                }
                return;
            case 9:
                ((eq8) this.b).a((Context) this.c, i);
                return;
            case 10:
                kp9 kp9Var = (kp9) this.b;
                switch (((iy8) this.c).a) {
                    case 14:
                        phd.d.b(i == 0 ? hp9.b : hp9.c);
                        break;
                    case 15:
                        phd.e.b(dp9.values()[i]);
                        break;
                    case 16:
                        phd.f.b(i == 0 ? ep9.b : ep9.c);
                        break;
                    default:
                        kr5 kr5Var = phd.g;
                        int i6 = kp9.d[i];
                        synchronized (kr5Var) {
                            kr5Var.b = i6;
                            kr5Var.a = true;
                            zba.a.edit().putInt("round_video_video_bitrate", i6).apply();
                            break;
                        }
                }
                ((ox0) kp9Var.c).f();
                return;
            case 11:
                f9a f9aVar = (f9a) this.b;
                ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.c));
                new d31(f9aVar.c, null).i(ob6.M0(2131743847, null)).j();
                return;
            case 12:
                xca xcaVar = (xca) this.c;
                ArrayList arrayList4 = (ArrayList) this.b;
                SharedPreferences sharedPreferences = xcaVar.g;
                ArrayList arrayList5 = xcaVar.c;
                if (i != 0) {
                    wca wcaVar = new wca();
                    wcaVar.a = i - 1;
                    wcaVar.b = arrayList4;
                    arrayList5.add(wcaVar);
                    String string = sharedPreferences.getString("moretemplates", null);
                    if (string == null) {
                        sb = String.valueOf(wcaVar.a);
                    } else {
                        StringBuilder l = c00.l(string, "|");
                        l.append(wcaVar.a);
                        sb = l.toString();
                    }
                    for (int i7 = 0; i7 < arrayList4.size(); i7++) {
                        StringBuilder l2 = c00.l(sb, ",");
                        l2.append(Math.round(((vca) arrayList4.get(i7)).a));
                        l2.append(",");
                        l2.append(Math.round(((vca) arrayList4.get(i7)).b));
                        sb = l2.toString();
                    }
                    sharedPreferences.edit().putString("moretemplates", sb).apply();
                    return;
                }
                StringBuilder sb2 = new StringBuilder("[");
                for (int i8 = 0; i8 < arrayList5.size(); i8++) {
                    wca wcaVar2 = (wca) arrayList5.get(i8);
                    if (i8 > 0) {
                        sb2.append(",\n");
                    }
                    sb2.append("\t{\n\t\t\"shape\": ");
                    sb2.append(wcaVar2.a);
                    sb2.append(",\n\t\t\"points\": [");
                    for (int i9 = 0; i9 < wcaVar2.b.size(); i9++) {
                        if (i9 > 0) {
                            sb2.append(",");
                        }
                        vca vcaVar = (vca) wcaVar2.b.get(i9);
                        sb2.append("[");
                        sb2.append(Math.round(vcaVar.a));
                        sb2.append(",");
                        sb2.append(Math.round(vcaVar.b));
                        sb2.append("]");
                    }
                    sb2.append("],\n\t\t\"freq\": ");
                    sb2.append(Math.round(((wcaVar2.c / xcaVar.a) * 100.0f) * 100.0f) / 100.0f);
                    sb2.append("\n\t}");
                }
                sb2.append("\n]");
                Log.i("shapedetector", sb2.toString());
                return;
            case 13:
                iha ihaVar = (iha) this.b;
                String str7 = (String) this.c;
                if (i == 0) {
                    ihaVar.a.Y0(str7);
                    return;
                }
                if (i == 1) {
                    if (str7.startsWith("mailto:")) {
                        str7 = str7.substring(7);
                    } else if (str7.startsWith("tel:")) {
                        str7 = str7.substring(4);
                    }
                    hl.g(str7);
                    return;
                }
                return;
            default:
                d0 d0Var = (d0) this.b;
                znb znbVar = (znb) this.c;
                ThemeActivity themeActivity = d0Var.e;
                if (themeActivity.getParentActivity() != null) {
                    if (i == 0) {
                        if (znbVar.G == null) {
                            themeActivity.getMessagesController().J4(znbVar, null);
                            jn7.e().k(jn7.v4, znbVar, null);
                            return;
                        }
                        String str8 = "https://" + themeActivity.getMessagesController().N2 + "/addtheme/" + znbVar.G.slug;
                        themeActivity.showDialog(new kea(themeActivity.getParentActivity(), null, str8, false, str8, false, null));
                        return;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            wk5Var = ((e) themeActivity).parentLayout;
                            if (wk5Var != null) {
                                aob.t(znbVar, true, false);
                                wk5Var2 = ((e) themeActivity).parentLayout;
                                ((ActionBarLayout) wk5Var2).W(true, true);
                                new ThemeEditorView().d(themeActivity.getParentActivity(), znbVar);
                                return;
                            }
                            return;
                        }
                        if (i == 3) {
                            themeActivity.presentFragment(new xqb(znbVar, null, false));
                            return;
                        }
                        if (themeActivity.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                            alertDialog$Builder.a.S = ob6.M0(2131751449, "DeleteThemeTitle");
                            alertDialog$Builder.a.U = ob6.M0(2131751450, "DeleteThemeAlert");
                            alertDialog$Builder.j(ob6.M0(2131751563, "Delete"), new yw9(d0Var, znbVar, (byte) 12));
                            alertDialog$Builder.g(ob6.M0(2131752570, "Cancel"), null);
                            id idVar = alertDialog$Builder.a;
                            themeActivity.showDialog(idVar);
                            TextView textView = (TextView) idVar.c(-1);
                            if (textView != null) {
                                yob.X(textView, aob.q7, null);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (znbVar.b == null && znbVar.d == null) {
                        StringBuilder sb3 = new StringBuilder();
                        int[] iArr = aob.hm;
                        for (int i10 = 0; i10 < iArr.length; i10++) {
                            sb3.append(d0f.c(i10));
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
                            cc4.g(e3, true);
                        }
                        try {
                            fileOutputStream.write(hl.g1(sb3.toString()));
                            fileOutputStream.close();
                        } catch (Exception e4) {
                            e = e4;
                            fileOutputStream2 = fileOutputStream;
                            cc4.g(e, true);
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                            str2 = znbVar.a;
                            if (!str2.endsWith(".attheme")) {
                            }
                            file = new File(xb4.z(4), xb4.q(str2));
                            if (hl.E(p0, file)) {
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
                                cc4.g(e5, true);
                                throw th;
                            }
                        }
                    } else {
                        String str9 = znbVar.d;
                        p0 = str9 != null ? aob.p0(str9) : new File(znbVar.b);
                    }
                    str2 = znbVar.a;
                    if (!str2.endsWith(".attheme")) {
                        str2 = str2.concat(".attheme");
                    }
                    file = new File(xb4.z(4), xb4.q(str2));
                    try {
                        if (hl.E(p0, file)) {
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
                        themeActivity.startActivityForResult(Intent.createChooser(intent, ob6.M0(2131745187, "ShareFile")), 500);
                        return;
                    } catch (Exception e6) {
                        cc4.g(e6, true);
                        return;
                    }
                }
                return;
        }
    }

    public /* synthetic */ oh(Object obj, ArrayList arrayList, byte b) {
        this.a = b;
        this.c = obj;
        this.b = arrayList;
    }
}
