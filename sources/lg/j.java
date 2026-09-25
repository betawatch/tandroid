package lg;

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
import ki.m0;
import ki.n0;
import ki.q0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.ok;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.ld;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Components.voip.e1;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.cz0;
import org.telegram.ui.d60;
import org.telegram.ui.ds0;
import org.telegram.ui.f41;
import org.telegram.ui.g50;
import org.telegram.ui.gn0;
import org.telegram.ui.i4;
import org.telegram.ui.lb;
import org.telegram.ui.p10;
import org.telegram.ui.qy;
import org.telegram.ui.t10;
import org.telegram.ui.td1;
import org.telegram.ui.v3;
import org.telegram.ui.wn;
import org.telegram.ui.x71;
import org.telegram.ui.yb1;
import pg.k1;
import pg.m1;
import pg.n1;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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

    /* JADX WARN: Removed duplicated region for block: B:173:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0230 A[Catch: Exception -> 0x026e, TRY_LEAVE, TryCatch #4 {Exception -> 0x026e, blocks: (B:68:0x0228, B:72:0x0230, B:76:0x0277, B:75:0x0270, B:82:0x0266, B:80:0x0242), top: B:67:0x0228, inners: #11 }] */
    @Override // android.content.DialogInterface.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(DialogInterface dialogInterface, int i10) {
        String str;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        b5 b5Var;
        b5 b5Var2;
        File p02;
        String str2;
        File file;
        Throwable th2;
        FileOutputStream fileOutputStream;
        String sb2;
        int i11 = 15;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3 = null;
        r9 = null;
        FileOutputStream fileOutputStream2 = null;
        switch (this.a) {
            case 0:
                p.a((p) this.b, (Integer[][]) this.c, i10);
                return;
            case 1:
                i4 i4Var = (i4) this.b;
                String str3 = (String) this.c;
                v3 v3Var = i4Var.K;
                if (i4Var.L == null || i4Var.u0[0].c.E == null) {
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
                    AndroidUtilities.addToClipboard(str3);
                    return;
                }
                int lastIndexOf = str3.lastIndexOf(35);
                if (lastIndexOf != -1) {
                    String lowerCase = !TextUtils.isEmpty(i4Var.u0[0].c.E.cached_page.url) ? i4Var.u0[0].c.E.cached_page.url.toLowerCase() : i4Var.u0[0].c.E.url.toLowerCase();
                    try {
                        str = URLDecoder.decode(str3.substring(lastIndexOf + 1), "UTF-8");
                    } catch (Exception unused) {
                        str = "";
                    }
                    if (str3.toLowerCase().contains(lowerCase)) {
                        if (!TextUtils.isEmpty(str)) {
                            i4Var.V(str, true);
                            return;
                        } else {
                            i4Var.u0[0].d.h1(v3Var == null ? 0 : 1, v3Var != null ? AndroidUtilities.dp(32.0f) : 0);
                            i4Var.m(null);
                            return;
                        }
                    }
                }
                nf.f.s(i4Var.L, str3);
                return;
            case 2:
                lb lbVar = (lb) this.b;
                String str4 = (String) this.c;
                if (i10 == 0) {
                    nf.f.o(lbVar.a.n.getParentActivity(), str4, true);
                    return;
                }
                if (i10 == 1) {
                    if (str4.startsWith("mailto:")) {
                        str4 = str4.substring(7);
                    } else if (str4.startsWith("tel:")) {
                        str4 = str4.substring(4);
                    }
                    AndroidUtilities.addToClipboard(str4);
                    return;
                }
                return;
            case 3:
                wn wnVar = (wn) this.b;
                String str5 = (String) this.c;
                AndroidUtilities.addToClipboard(str5);
                xc.a0(wnVar).i(LocaleController.formatString(R.string.ExactTextCopied, str5)).j();
                return;
            case 4:
                ArrayList arrayList = (ArrayList) this.b;
                qy qyVar = (qy) this.c;
                int i12 = i10 == 0 ? 0 : i10 == 1 ? 1 : i10 == 2 ? 2 : 3;
                if (arrayList != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(((Long) arrayList.get(i13)).longValue(), 0, i12);
                    }
                }
                int i14 = i12;
                if (xc.a(qyVar)) {
                    xc.z(qyVar, i14, 0, null).j();
                    return;
                }
                return;
            case 5:
                ze0 ze0Var = (ze0) this.b;
                AndroidUtilities.VcardItem vcardItem = (AndroidUtilities.VcardItem) this.c;
                ze0Var.getClass();
                if (i10 == 0) {
                    try {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vcardItem.getValue(false)));
                        if (AndroidUtilities.shouldShowClipboardToast()) {
                            Toast.makeText(ze0Var.r.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 6:
                gt0 gt0Var = (gt0) this.b;
                String str6 = (String) this.c;
                if (i10 == 0) {
                    gt0Var.a.R0(str6);
                    return;
                }
                gt0Var.getClass();
                if (i10 == 1) {
                    if (str6.startsWith("mailto:")) {
                        str6 = str6.substring(7);
                    } else if (str6.startsWith("tel:")) {
                        str6 = str6.substring(4);
                    }
                    AndroidUtilities.addToClipboard(str6);
                    return;
                }
                return;
            case 7:
                p10 p10Var = (p10) this.b;
                String str7 = (String) this.c;
                if (i10 == 0) {
                    t10 t10Var = p10Var.a.v;
                    SpannableStringBuilder[] spannableStringBuilderArr = t10.s0;
                    t10Var.g(str7);
                    return;
                }
                p10Var.getClass();
                if (i10 == 1) {
                    if (str7.startsWith("mailto:")) {
                        str7 = str7.substring(7);
                    } else if (str7.startsWith("tel:")) {
                        str7 = str7.substring(4);
                    }
                    AndroidUtilities.addToClipboard(str7);
                    return;
                }
                return;
            case 8:
                g50 g50Var = (g50) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                d60 d60Var = g50Var.b;
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                Integer num = (Integer) arrayList2.get(i10);
                int intValue = num.intValue();
                d60Var.y3 = num;
                d60Var.N1(true, true);
                d60Var.y3 = null;
                AndroidUtilities.runOnUIThread(new ld(g50Var, intValue, i11));
                return;
            case 9:
                gn0 gn0Var = (gn0) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                try {
                    tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                    try {
                        tL_secureRequiredType.type = (TLRPC.SecureValueType) ((Class) arrayList3.get(i10)).newInstance();
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    tL_secureRequiredType = null;
                }
                if (!gn0.v1(tL_secureRequiredType.type)) {
                    if (gn0.t1(tL_secureRequiredType.type)) {
                        tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                        tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypeAddress();
                    }
                    gn0Var.E1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                    return;
                }
                tL_secureRequiredType.selfie_required = true;
                tL_secureRequiredType.translation_required = true;
                tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypePersonalDetails();
                tL_secureRequiredType3 = tL_secureRequiredType;
                tL_secureRequiredType = tL_secureRequiredType2;
                gn0Var.E1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                return;
            case 10:
                cz0.a((cz0) this.b, (Context) this.c, i10);
                return;
            case 11:
                f41 f41Var = (f41) this.b;
                switch (((e1) this.c).a) {
                    case 22:
                        pi.e.c.b(i10 == 0 ? q0.b : q0.c);
                        break;
                    case 23:
                        pi.e.d.b(m0.values()[i10]);
                        break;
                    case 24:
                        pi.e.e.b(i10 == 0 ? n0.b : n0.c);
                        break;
                    default:
                        pi.c cVar = pi.e.f;
                        int i15 = f41.c[i10];
                        synchronized (cVar) {
                            cVar.b = i15;
                            cVar.a = true;
                            pi.d.a.edit().putInt("round_video_video_bitrate", i15).apply();
                            break;
                        }
                }
                f41Var.b.l();
                return;
            case 12:
                x71 x71Var = (x71) this.b;
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.c));
                ok.o(R.string.TextCopied, new xc(x71Var.getContainer(), null));
                return;
            case 13:
                yb1 yb1Var = (yb1) this.b;
                g6 g6Var = (g6) this.c;
                ThemeActivity themeActivity = yb1Var.e;
                if (themeActivity.getParentActivity() == null) {
                    return;
                }
                if (i10 == 0) {
                    if (g6Var.F == null) {
                        themeActivity.getMessagesController().saveThemeToServer(g6Var, null);
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, g6Var, null);
                        return;
                    }
                    String str8 = "https://" + themeActivity.getMessagesController().linkPrefix + "/addtheme/" + g6Var.F.slug;
                    themeActivity.showDialog(new uq0(themeActivity.getParentActivity(), null, str8, false, str8, false, null));
                    return;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        b5Var = ((m2) themeActivity).parentLayout;
                        if (b5Var != null) {
                            h6.t(g6Var, true, false);
                            b5Var2 = ((m2) themeActivity).parentLayout;
                            ((ActionBarLayout) b5Var2).U(true, true);
                            new ThemeEditorView().c(themeActivity.getParentActivity(), g6Var);
                            return;
                        }
                        return;
                    }
                    if (i10 == 3) {
                        themeActivity.presentFragment(new td1(g6Var, null, false));
                        return;
                    }
                    if (themeActivity.getParentActivity() == null) {
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                    alertDialog$Builder.a.T = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                    alertDialog$Builder.k(LocaleController.getString("Delete", R.string.Delete), new ds0(i11, yb1Var, g6Var));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    a2 a2Var = alertDialog$Builder.a;
                    themeActivity.showDialog(a2Var);
                    TextView textView = (TextView) a2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(h6.w0(null, h6.q7, false));
                        return;
                    }
                    return;
                }
                if (g6Var.b == null && g6Var.d == null) {
                    StringBuilder sb3 = new StringBuilder();
                    int[] iArr = h6.nl;
                    for (int i16 = 0; i16 < iArr.length; i16++) {
                        sb3.append(e5.i(i16));
                        sb3.append("=");
                        sb3.append(iArr[i16]);
                        sb3.append("\n");
                    }
                    p02 = new File(ApplicationLoader.getFilesDirFixed(), "default_theme.attheme");
                    try {
                        try {
                            try {
                                fileOutputStream = new FileOutputStream(p02);
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                        } catch (Exception e10) {
                            e = e10;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                    try {
                        fileOutputStream.write(AndroidUtilities.getStringBytes(sb3.toString()));
                        fileOutputStream.close();
                    } catch (Exception e11) {
                        e = e11;
                        fileOutputStream2 = fileOutputStream;
                        FileLog.e(e);
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        str2 = g6Var.a;
                        if (!str2.endsWith(".attheme")) {
                        }
                        file = new File(FileLoader.getDirectory(4), FileLoader.fixFileName(str2));
                        if (AndroidUtilities.copyFile(p02, file)) {
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
                            FileLog.e(e12);
                            throw th2;
                        }
                    }
                } else {
                    String str9 = g6Var.d;
                    p02 = str9 != null ? h6.p0(str9) : new File(g6Var.b);
                }
                str2 = g6Var.a;
                if (!str2.endsWith(".attheme")) {
                    str2 = str2.concat(".attheme");
                }
                file = new File(FileLoader.getDirectory(4), FileLoader.fixFileName(str2));
                try {
                    if (AndroidUtilities.copyFile(p02, file)) {
                        return;
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/xml");
                    if (Build.VERSION.SDK_INT >= 24) {
                        try {
                            intent.putExtra("android.intent.extra.STREAM", FileProvider.d(themeActivity.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", file));
                            intent.setFlags(1);
                        } catch (Exception unused4) {
                            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                        }
                    } else {
                        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                    }
                    themeActivity.startActivityForResult(Intent.createChooser(intent, LocaleController.getString("ShareFile", R.string.ShareFile)), 500);
                    return;
                } catch (Exception e13) {
                    FileLog.e(e13);
                    return;
                }
            default:
                n1 n1Var = (n1) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                SharedPreferences sharedPreferences = n1Var.g;
                ArrayList arrayList5 = n1Var.c;
                if (i10 != 0) {
                    m1 m1Var = new m1();
                    m1Var.a = i10 - 1;
                    m1Var.b = arrayList4;
                    arrayList5.add(m1Var);
                    String string = sharedPreferences.getString("moretemplates", null);
                    if (string == null) {
                        sb2 = "" + m1Var.a;
                    } else {
                        StringBuilder h = v7.j.h(string, "|");
                        h.append(m1Var.a);
                        sb2 = h.toString();
                    }
                    for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                        StringBuilder h10 = v7.j.h(sb2, ",");
                        h10.append(Math.round(((k1) arrayList4.get(i17)).a));
                        h10.append(",");
                        h10.append(Math.round(((k1) arrayList4.get(i17)).b));
                        sb2 = h10.toString();
                    }
                    sharedPreferences.edit().putString("moretemplates", sb2).apply();
                    return;
                }
                StringBuilder sb4 = new StringBuilder("[");
                for (int i18 = 0; i18 < arrayList5.size(); i18++) {
                    m1 m1Var2 = (m1) arrayList5.get(i18);
                    if (i18 > 0) {
                        sb4.append(",\n");
                    }
                    sb4.append("\t{\n\t\t\"shape\": ");
                    sb4.append(m1Var2.a);
                    sb4.append(",\n\t\t\"points\": [");
                    for (int i19 = 0; i19 < m1Var2.b.size(); i19++) {
                        if (i19 > 0) {
                            sb4.append(",");
                        }
                        k1 k1Var = (k1) m1Var2.b.get(i19);
                        sb4.append("[");
                        sb4.append(Math.round(k1Var.a));
                        sb4.append(",");
                        sb4.append(Math.round(k1Var.b));
                        sb4.append("]");
                    }
                    sb4.append("],\n\t\t\"freq\": ");
                    sb4.append(Math.round(((m1Var2.c / n1Var.a) * 100.0f) * 100.0f) / 100.0f);
                    sb4.append("\n\t}");
                }
                sb4.append("\n]");
                Log.i("shapedetector", sb4.toString());
                return;
        }
    }
}
