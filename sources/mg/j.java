package mg;

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
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.dr0;
import org.telegram.ui.Components.e2;
import org.telegram.ui.Components.if0;
import org.telegram.ui.Components.pt0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.c10;
import org.telegram.ui.c31;
import org.telegram.ui.ey;
import org.telegram.ui.fr0;
import org.telegram.ui.g10;
import org.telegram.ui.hk0;
import org.telegram.ui.l4;
import org.telegram.ui.ob;
import org.telegram.ui.py0;
import org.telegram.ui.qc1;
import org.telegram.ui.s50;
import org.telegram.ui.sn;
import org.telegram.ui.v40;
import org.telegram.ui.w61;
import org.telegram.ui.wa1;
import org.telegram.ui.x3;
import org.telegram.ui.xm0;
import qg.j1;
import qg.l1;
import qg.m1;
import si.n0;
import si.o0;
import si.r0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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

    /* JADX WARN: Removed duplicated region for block: B:174:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022c A[Catch: Exception -> 0x026a, TRY_LEAVE, TryCatch #6 {Exception -> 0x026a, blocks: (B:71:0x0224, B:75:0x022c, B:79:0x0273, B:78:0x026c, B:85:0x0262, B:83:0x023e), top: B:70:0x0224, inners: #12 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x01d8 -> B:53:0x020b). Please report as a decompilation issue!!! */
    @Override // android.content.DialogInterface.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(DialogInterface dialogInterface, int i10) {
        String str;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        d5 d5Var;
        d5 d5Var2;
        File q02;
        String str2;
        File file;
        Throwable th2;
        FileOutputStream fileOutputStream;
        String sb2;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3 = null;
        r8 = null;
        r8 = null;
        r8 = null;
        FileOutputStream fileOutputStream2 = null;
        switch (this.a) {
            case 0:
                p.a((p) this.b, (Integer[][]) this.c, i10);
                return;
            case 1:
                l4 l4Var = (l4) this.b;
                String str3 = (String) this.c;
                x3 x3Var = l4Var.K;
                if (l4Var.L == null || l4Var.u0[0].c.E == null) {
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
                    String lowerCase = !TextUtils.isEmpty(l4Var.u0[0].c.E.cached_page.url) ? l4Var.u0[0].c.E.cached_page.url.toLowerCase() : l4Var.u0[0].c.E.url.toLowerCase();
                    try {
                        str = URLDecoder.decode(str3.substring(lastIndexOf + 1), "UTF-8");
                    } catch (Exception unused) {
                        str = "";
                    }
                    if (str3.toLowerCase().contains(lowerCase)) {
                        if (!TextUtils.isEmpty(str)) {
                            l4Var.V(str, true);
                            return;
                        } else {
                            l4Var.u0[0].d.h1(x3Var == null ? 0 : 1, x3Var != null ? AndroidUtilities.dp(32.0f) : 0);
                            l4Var.m(null);
                            return;
                        }
                    }
                }
                pf.d.r(l4Var.L, str3);
                return;
            case 2:
                ob obVar = (ob) this.b;
                String str4 = (String) this.c;
                if (i10 == 0) {
                    pf.d.n(obVar.a.n.getParentActivity(), str4, true);
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
                sn snVar = (sn) this.b;
                String str5 = (String) this.c;
                AndroidUtilities.addToClipboard(str5);
                xc.a0(snVar).i(LocaleController.formatString(R.string.ExactTextCopied, str5)).j();
                return;
            case 4:
                ArrayList arrayList = (ArrayList) this.b;
                ey eyVar = (ey) this.c;
                int i11 = i10 == 0 ? 0 : i10 == 1 ? 1 : i10 == 2 ? 2 : 3;
                if (arrayList != null) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(((Long) arrayList.get(i12)).longValue(), 0, i11);
                    }
                }
                int i13 = i11;
                if (xc.a(eyVar)) {
                    xc.z(eyVar, i13, 0, null).j();
                    return;
                }
                return;
            case 5:
                if0 if0Var = (if0) this.b;
                AndroidUtilities.VcardItem vcardItem = (AndroidUtilities.VcardItem) this.c;
                if0Var.getClass();
                if (i10 == 0) {
                    try {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vcardItem.getValue(false)));
                        if (AndroidUtilities.shouldShowClipboardToast()) {
                            Toast.makeText(if0Var.r.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
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
                pt0 pt0Var = (pt0) this.b;
                String str6 = (String) this.c;
                if (i10 == 0) {
                    pt0Var.a.T0(str6);
                    return;
                }
                pt0Var.getClass();
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
                c10 c10Var = (c10) this.b;
                String str7 = (String) this.c;
                if (i10 == 0) {
                    g10 g10Var = c10Var.a.v;
                    SpannableStringBuilder[] spannableStringBuilderArr = g10.s0;
                    g10Var.g(str7);
                    return;
                }
                c10Var.getClass();
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
                v40 v40Var = (v40) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                s50 s50Var = v40Var.b;
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                Integer num = (Integer) arrayList2.get(i10);
                int intValue = num.intValue();
                s50Var.y3 = num;
                s50Var.O1(true, true);
                s50Var.y3 = null;
                AndroidUtilities.runOnUIThread(new e2(v40Var, intValue, 17));
                return;
            case 9:
                xm0 xm0Var = (xm0) this.b;
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
                if (!xm0.u1(tL_secureRequiredType.type)) {
                    if (xm0.s1(tL_secureRequiredType.type)) {
                        tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                        tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypeAddress();
                    }
                    xm0Var.D1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                    return;
                }
                tL_secureRequiredType.selfie_required = true;
                tL_secureRequiredType.translation_required = true;
                tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypePersonalDetails();
                tL_secureRequiredType3 = tL_secureRequiredType;
                tL_secureRequiredType = tL_secureRequiredType2;
                xm0Var.D1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                return;
            case 10:
                py0.b((py0) this.b, (Context) this.c, i10);
                return;
            case 11:
                c31 c31Var = (c31) this.b;
                switch (((hk0) this.c).a) {
                    case 9:
                        ti.e.e.b(i10 == 0 ? r0.b : r0.c);
                        break;
                    case 10:
                        ti.e.f.b(n0.values()[i10]);
                        break;
                    case 11:
                        ti.e.g.b(i10 == 0 ? o0.b : o0.c);
                        break;
                    default:
                        ti.c cVar = ti.e.h;
                        int i14 = c31.c[i10];
                        synchronized (cVar) {
                            cVar.b = i14;
                            cVar.a = true;
                            ti.d.a.edit().putInt("round_video_video_bitrate", i14).apply();
                            break;
                        }
                }
                c31Var.b.l();
                return;
            case 12:
                w61 w61Var = (w61) this.b;
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.c));
                wh.p(R.string.TextCopied, new xc(w61Var.getContainer(), null));
                return;
            case 13:
                wa1 wa1Var = (wa1) this.b;
                g6 g6Var = (g6) this.c;
                ThemeActivity themeActivity = wa1Var.e;
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
                    themeActivity.showDialog(new dr0(themeActivity.getParentActivity(), null, str8, false, str8, false, null));
                    return;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        d5Var = ((n2) themeActivity).parentLayout;
                        if (d5Var != null) {
                            h6.t(g6Var, true, false);
                            d5Var2 = ((n2) themeActivity).parentLayout;
                            ((ActionBarLayout) d5Var2).U(true, true);
                            new ThemeEditorView().c(themeActivity.getParentActivity(), g6Var);
                            return;
                        }
                        return;
                    }
                    if (i10 == 3) {
                        themeActivity.presentFragment(new qc1(g6Var, null, false));
                        return;
                    }
                    if (themeActivity.getParentActivity() == null) {
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                    alertDialog$Builder.a.T = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                    alertDialog$Builder.k(LocaleController.getString("Delete", R.string.Delete), new fr0(18, wa1Var, g6Var));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    b2 b2Var = alertDialog$Builder.a;
                    themeActivity.showDialog(b2Var);
                    TextView textView = (TextView) b2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(h6.x0(null, h6.q7, false));
                        return;
                    }
                    return;
                }
                if (g6Var.b == null && g6Var.d == null) {
                    StringBuilder sb3 = new StringBuilder();
                    int[] iArr = h6.ql;
                    for (int i15 = 0; i15 < iArr.length; i15++) {
                        sb3.append(g5.i(i15));
                        sb3.append("=");
                        sb3.append(iArr[i15]);
                        sb3.append("\n");
                    }
                    q02 = new File(ApplicationLoader.getFilesDirFixed(), "default_theme.attheme");
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
                        FileLog.e(e10);
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
                        if (AndroidUtilities.copyFile(q02, file)) {
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
                    q02 = str9 != null ? h6.q0(str9) : new File(g6Var.b);
                }
                str2 = g6Var.a;
                if (!str2.endsWith(".attheme")) {
                    str2 = str2.concat(".attheme");
                }
                file = new File(FileLoader.getDirectory(4), FileLoader.fixFileName(str2));
                try {
                    if (AndroidUtilities.copyFile(q02, file)) {
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
                m1 m1Var = (m1) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                SharedPreferences sharedPreferences = m1Var.g;
                ArrayList arrayList5 = m1Var.c;
                if (i10 != 0) {
                    l1 l1Var = new l1();
                    l1Var.a = i10 - 1;
                    l1Var.b = arrayList4;
                    arrayList5.add(l1Var);
                    String string = sharedPreferences.getString("moretemplates", null);
                    if (string == null) {
                        sb2 = "" + l1Var.a;
                    } else {
                        StringBuilder i16 = r.c.i(string, "|");
                        i16.append(l1Var.a);
                        sb2 = i16.toString();
                    }
                    for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                        StringBuilder i18 = r.c.i(sb2, ",");
                        i18.append(Math.round(((j1) arrayList4.get(i17)).a));
                        i18.append(",");
                        i18.append(Math.round(((j1) arrayList4.get(i17)).b));
                        sb2 = i18.toString();
                    }
                    sharedPreferences.edit().putString("moretemplates", sb2).apply();
                    return;
                }
                StringBuilder sb4 = new StringBuilder("[");
                for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                    l1 l1Var2 = (l1) arrayList5.get(i19);
                    if (i19 > 0) {
                        sb4.append(",\n");
                    }
                    sb4.append("\t{\n\t\t\"shape\": ");
                    sb4.append(l1Var2.a);
                    sb4.append(",\n\t\t\"points\": [");
                    for (int i20 = 0; i20 < l1Var2.b.size(); i20++) {
                        if (i20 > 0) {
                            sb4.append(",");
                        }
                        j1 j1Var = (j1) l1Var2.b.get(i20);
                        sb4.append("[");
                        sb4.append(Math.round(j1Var.a));
                        sb4.append(",");
                        sb4.append(Math.round(j1Var.b));
                        sb4.append("]");
                    }
                    sb4.append("],\n\t\t\"freq\": ");
                    sb4.append(Math.round(((l1Var2.c / m1Var.a) * 100.0f) * 100.0f) / 100.0f);
                    sb4.append("\n\t}");
                }
                sb4.append("\n]");
                Log.i("shapedetector", sb4.toString());
                return;
        }
    }
}
