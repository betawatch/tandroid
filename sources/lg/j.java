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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.ul;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.kd;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.ez0;
import org.telegram.ui.f60;
import org.telegram.ui.i4;
import org.telegram.ui.i50;
import org.telegram.ui.in0;
import org.telegram.ui.kv0;
import org.telegram.ui.lb;
import org.telegram.ui.q10;
import org.telegram.ui.ry;
import org.telegram.ui.td1;
import org.telegram.ui.u10;
import org.telegram.ui.v3;
import org.telegram.ui.w71;
import org.telegram.ui.xn;
import org.telegram.ui.yb1;
import pg.i1;
import pg.k1;
import pg.l1;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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

    /* JADX WARN: Removed duplicated region for block: B:149:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0234 A[Catch: Exception -> 0x0274, TRY_LEAVE, TryCatch #10 {Exception -> 0x0274, blocks: (B:68:0x022c, B:72:0x0234, B:76:0x027d, B:75:0x0276, B:82:0x026c, B:80:0x0248), top: B:67:0x022c, inners: #4 }] */
    @Override // android.content.DialogInterface.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(DialogInterface dialogInterface, int i10) {
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        c5 c5Var;
        c5 c5Var2;
        File p02;
        String str;
        File file;
        Throwable th2;
        FileOutputStream fileOutputStream;
        String sb2;
        String str2 = "";
        TLRPC.TL_secureRequiredType tL_secureRequiredType3 = null;
        r13 = null;
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
                        str2 = URLDecoder.decode(str3.substring(lastIndexOf + 1), "UTF-8");
                    } catch (Exception unused) {
                    }
                    if (str3.toLowerCase().contains(lowerCase)) {
                        if (!TextUtils.isEmpty(str2)) {
                            i4Var.V(str2, true);
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
                xn xnVar = (xn) this.b;
                String str5 = (String) this.c;
                AndroidUtilities.addToClipboard(str5);
                xc.a0(xnVar).i(LocaleController.formatString(R.string.ExactTextCopied, str5)).j();
                return;
            case 4:
                ArrayList arrayList = (ArrayList) this.b;
                ry ryVar = (ry) this.c;
                int i11 = i10 == 0 ? 0 : i10 == 1 ? 1 : i10 == 2 ? 2 : 3;
                if (arrayList != null) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(((Long) arrayList.get(i12)).longValue(), 0, i11);
                    }
                }
                int i13 = i11;
                if (xc.a(ryVar)) {
                    xc.z(ryVar, i13, 0, null).j();
                    return;
                }
                return;
            case 5:
                pe0 pe0Var = (pe0) this.b;
                AndroidUtilities.VcardItem vcardItem = (AndroidUtilities.VcardItem) this.c;
                pe0Var.getClass();
                if (i10 == 0) {
                    try {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vcardItem.getValue(false)));
                        if (AndroidUtilities.shouldShowClipboardToast()) {
                            Toast.makeText(pe0Var.r.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
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
                vs0 vs0Var = (vs0) this.b;
                String str6 = (String) this.c;
                if (i10 == 0) {
                    vs0Var.a.R0(str6);
                    return;
                }
                vs0Var.getClass();
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
                q10 q10Var = (q10) this.b;
                String str7 = (String) this.c;
                if (i10 == 0) {
                    u10 u10Var = q10Var.a.v;
                    SpannableStringBuilder[] spannableStringBuilderArr = u10.s0;
                    u10Var.g(str7);
                    return;
                }
                q10Var.getClass();
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
                i50 i50Var = (i50) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                f60 f60Var = i50Var.b;
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                Integer num = (Integer) arrayList2.get(i10);
                int intValue = num.intValue();
                f60Var.y3 = num;
                f60Var.N1(true, true);
                f60Var.y3 = null;
                AndroidUtilities.runOnUIThread(new kd(i50Var, intValue, 15));
                return;
            case 9:
                in0 in0Var = (in0) this.b;
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
                if (!in0.v1(tL_secureRequiredType.type)) {
                    if (in0.t1(tL_secureRequiredType.type)) {
                        tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                        tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypeAddress();
                    }
                    in0Var.E1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                    return;
                }
                tL_secureRequiredType.selfie_required = true;
                tL_secureRequiredType.translation_required = true;
                tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypePersonalDetails();
                tL_secureRequiredType3 = tL_secureRequiredType;
                tL_secureRequiredType = tL_secureRequiredType2;
                in0Var.E1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                return;
            case 10:
                ez0.a((ez0) this.b, (Context) this.c, i10);
                return;
            case 11:
                w71 w71Var = (w71) this.b;
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.c));
                ul.p(R.string.TextCopied, new xc(w71Var.getContainer(), null));
                return;
            case 12:
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
                    themeActivity.showDialog(new hq0(themeActivity.getParentActivity(), null, str8, false, str8, false, null));
                    return;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        c5Var = ((n2) themeActivity).parentLayout;
                        if (c5Var != null) {
                            h6.t(g6Var, true, false);
                            c5Var2 = ((n2) themeActivity).parentLayout;
                            ((ActionBarLayout) c5Var2).U(true, true);
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
                    alertDialog$Builder.k(LocaleController.getString("Delete", R.string.Delete), new kv0(14, yb1Var, g6Var));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    b2 b2Var = alertDialog$Builder.a;
                    themeActivity.showDialog(b2Var);
                    TextView textView = (TextView) b2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(h6.w0(null, h6.q7, false));
                        return;
                    }
                    return;
                }
                if (g6Var.b == null && g6Var.d == null) {
                    StringBuilder sb3 = new StringBuilder();
                    int[] iArr = h6.nl;
                    for (int i14 = 0; i14 < iArr.length; i14++) {
                        sb3.append(f5.i(i14));
                        sb3.append("=");
                        sb3.append(iArr[i14]);
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
                        str = g6Var.a;
                        if (!str.endsWith(".attheme")) {
                        }
                        file = new File(FileLoader.getDirectory(4), FileLoader.fixFileName(str));
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
                str = g6Var.a;
                if (!str.endsWith(".attheme")) {
                    str = str.concat(".attheme");
                }
                file = new File(FileLoader.getDirectory(4), FileLoader.fixFileName(str));
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
                l1 l1Var = (l1) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                SharedPreferences sharedPreferences = l1Var.g;
                ArrayList arrayList5 = l1Var.c;
                if (i10 != 0) {
                    k1 k1Var = new k1();
                    k1Var.a = i10 - 1;
                    k1Var.b = arrayList4;
                    arrayList5.add(k1Var);
                    String string = sharedPreferences.getString("moretemplates", null);
                    if (string == null) {
                        sb2 = "" + k1Var.a;
                    } else {
                        StringBuilder h = w.c.h(string, "|");
                        h.append(k1Var.a);
                        sb2 = h.toString();
                    }
                    for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                        StringBuilder h10 = w.c.h(sb2, ",");
                        h10.append(Math.round(((i1) arrayList4.get(i15)).a));
                        h10.append(",");
                        h10.append(Math.round(((i1) arrayList4.get(i15)).b));
                        sb2 = h10.toString();
                    }
                    sharedPreferences.edit().putString("moretemplates", sb2).apply();
                    return;
                }
                StringBuilder sb4 = new StringBuilder("[");
                for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                    k1 k1Var2 = (k1) arrayList5.get(i16);
                    if (i16 > 0) {
                        sb4.append(",\n");
                    }
                    sb4.append("\t{\n\t\t\"shape\": ");
                    sb4.append(k1Var2.a);
                    sb4.append(",\n\t\t\"points\": [");
                    for (int i17 = 0; i17 < k1Var2.b.size(); i17++) {
                        if (i17 > 0) {
                            sb4.append(",");
                        }
                        i1 i1Var = (i1) k1Var2.b.get(i17);
                        sb4.append("[");
                        sb4.append(Math.round(i1Var.a));
                        sb4.append(",");
                        sb4.append(Math.round(i1Var.b));
                        sb4.append("]");
                    }
                    sb4.append("],\n\t\t\"freq\": ");
                    sb4.append(Math.round(((k1Var2.c / l1Var.a) * 100.0f) * 100.0f) / 100.0f);
                    sb4.append("\n\t}");
                }
                sb4.append("\n]");
                Log.i("shapedetector", sb4.toString());
                return;
        }
    }
}
