package kg;

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
import og.m1;
import og.o1;
import og.p1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.em;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.et0;
import org.telegram.ui.Components.sq0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.ye0;
import org.telegram.ui.Components.zd;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.eo;
import org.telegram.ui.fe1;
import org.telegram.ui.fz0;
import org.telegram.ui.j4;
import org.telegram.ui.j60;
import org.telegram.ui.j81;
import org.telegram.ui.kc1;
import org.telegram.ui.m50;
import org.telegram.ui.nb;
import org.telegram.ui.on0;
import org.telegram.ui.pz0;
import org.telegram.ui.v10;
import org.telegram.ui.w3;
import org.telegram.ui.wy;
import org.telegram.ui.z10;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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

    /* JADX WARN: Removed duplicated region for block: B:119:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0121 A[Catch: Exception -> 0x0161, TRY_LEAVE, TryCatch #10 {Exception -> 0x0161, blocks: (B:39:0x0119, B:43:0x0121, B:47:0x016a, B:46:0x0163, B:53:0x0159, B:51:0x0135), top: B:38:0x0119, inners: #5 }] */
    @Override // android.content.DialogInterface.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(DialogInterface dialogInterface, int i10) {
        String sb2;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        f5 f5Var;
        f5 f5Var2;
        File p02;
        String str;
        File file;
        Throwable th2;
        FileOutputStream fileOutputStream;
        String str2 = "";
        TLRPC.TL_secureRequiredType tL_secureRequiredType3 = null;
        r13 = null;
        r13 = null;
        r13 = null;
        FileOutputStream fileOutputStream2 = null;
        switch (this.a) {
            case 0:
                p.a((p) this.b, (Integer[][]) this.c, i10);
                return;
            case 1:
                p1 p1Var = (p1) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                SharedPreferences sharedPreferences = p1Var.g;
                ArrayList arrayList2 = p1Var.c;
                if (i10 != 0) {
                    o1 o1Var = new o1();
                    o1Var.a = i10 - 1;
                    o1Var.b = arrayList;
                    arrayList2.add(o1Var);
                    String string = sharedPreferences.getString("moretemplates", null);
                    if (string == null) {
                        sb2 = "" + o1Var.a;
                    } else {
                        StringBuilder g10 = w.f.g(string, "|");
                        g10.append(o1Var.a);
                        sb2 = g10.toString();
                    }
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        StringBuilder g11 = w.f.g(sb2, ",");
                        g11.append(Math.round(((m1) arrayList.get(i11)).a));
                        g11.append(",");
                        g11.append(Math.round(((m1) arrayList.get(i11)).b));
                        sb2 = g11.toString();
                    }
                    sharedPreferences.edit().putString("moretemplates", sb2).apply();
                    return;
                }
                StringBuilder sb3 = new StringBuilder("[");
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    o1 o1Var2 = (o1) arrayList2.get(i12);
                    if (i12 > 0) {
                        sb3.append(",\n");
                    }
                    sb3.append("\t{\n\t\t\"shape\": ");
                    sb3.append(o1Var2.a);
                    sb3.append(",\n\t\t\"points\": [");
                    for (int i13 = 0; i13 < o1Var2.b.size(); i13++) {
                        if (i13 > 0) {
                            sb3.append(",");
                        }
                        m1 m1Var = (m1) o1Var2.b.get(i13);
                        sb3.append("[");
                        sb3.append(Math.round(m1Var.a));
                        sb3.append(",");
                        sb3.append(Math.round(m1Var.b));
                        sb3.append("]");
                    }
                    sb3.append("],\n\t\t\"freq\": ");
                    sb3.append(Math.round(((o1Var2.c / p1Var.a) * 100.0f) * 100.0f) / 100.0f);
                    sb3.append("\n\t}");
                }
                sb3.append("\n]");
                Log.i("shapedetector", sb3.toString());
                return;
            case 2:
                j4 j4Var = (j4) this.b;
                String str3 = (String) this.c;
                w3 w3Var = j4Var.K;
                if (j4Var.L == null || j4Var.u0[0].c.E == null) {
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
                    String lowerCase = !TextUtils.isEmpty(j4Var.u0[0].c.E.cached_page.url) ? j4Var.u0[0].c.E.cached_page.url.toLowerCase() : j4Var.u0[0].c.E.url.toLowerCase();
                    try {
                        str2 = URLDecoder.decode(str3.substring(lastIndexOf + 1), "UTF-8");
                    } catch (Exception unused) {
                    }
                    if (str3.toLowerCase().contains(lowerCase)) {
                        if (!TextUtils.isEmpty(str2)) {
                            j4Var.V(str2, true);
                            return;
                        } else {
                            j4Var.u0[0].d.h1(w3Var == null ? 0 : 1, w3Var != null ? AndroidUtilities.dp(32.0f) : 0);
                            j4Var.m(null);
                            return;
                        }
                    }
                }
                nf.f.s(j4Var.L, str3);
                return;
            case 3:
                nb nbVar = (nb) this.b;
                String str4 = (String) this.c;
                if (i10 == 0) {
                    nf.f.o(nbVar.a.n.getParentActivity(), str4, true);
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
            case 4:
                eo eoVar = (eo) this.b;
                String str5 = (String) this.c;
                AndroidUtilities.addToClipboard(str5);
                wc.a0(eoVar).i(LocaleController.formatString(R.string.ExactTextCopied, str5)).j();
                return;
            case 5:
                ArrayList arrayList3 = (ArrayList) this.b;
                wy wyVar = (wy) this.c;
                int i14 = i10 == 0 ? 0 : i10 == 1 ? 1 : i10 == 2 ? 2 : 3;
                if (arrayList3 != null) {
                    for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                        NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(((Long) arrayList3.get(i15)).longValue(), 0, i14);
                    }
                }
                int i16 = i14;
                if (wc.a(wyVar)) {
                    wc.z(wyVar, i16, 0, null).j();
                    return;
                }
                return;
            case 6:
                ye0 ye0Var = (ye0) this.b;
                AndroidUtilities.VcardItem vcardItem = (AndroidUtilities.VcardItem) this.c;
                ye0Var.getClass();
                if (i10 == 0) {
                    try {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vcardItem.getValue(false)));
                        if (AndroidUtilities.shouldShowClipboardToast()) {
                            Toast.makeText(ye0Var.r.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 7:
                et0 et0Var = (et0) this.b;
                String str6 = (String) this.c;
                if (i10 == 0) {
                    et0Var.a.R0(str6);
                    return;
                }
                et0Var.getClass();
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
            case 8:
                v10 v10Var = (v10) this.b;
                String str7 = (String) this.c;
                if (i10 == 0) {
                    z10 z10Var = v10Var.a.v;
                    SpannableStringBuilder[] spannableStringBuilderArr = z10.s0;
                    z10Var.g(str7);
                    return;
                }
                v10Var.getClass();
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
            case 9:
                m50 m50Var = (m50) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                j60 j60Var = m50Var.b;
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                Integer num = (Integer) arrayList4.get(i10);
                int intValue = num.intValue();
                j60Var.y3 = num;
                j60Var.N1(true, true);
                j60Var.y3 = null;
                AndroidUtilities.runOnUIThread(new zd(m50Var, intValue, 14));
                return;
            case 10:
                on0 on0Var = (on0) this.b;
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
                if (!on0.v1(tL_secureRequiredType.type)) {
                    if (on0.t1(tL_secureRequiredType.type)) {
                        tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                        tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypeAddress();
                    }
                    on0Var.E1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                    return;
                }
                tL_secureRequiredType.selfie_required = true;
                tL_secureRequiredType.translation_required = true;
                tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypePersonalDetails();
                tL_secureRequiredType3 = tL_secureRequiredType;
                tL_secureRequiredType = tL_secureRequiredType2;
                on0Var.E1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                return;
            case 11:
                pz0.a((pz0) this.b, (Context) this.c, i10);
                return;
            case 12:
                j81 j81Var = (j81) this.b;
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.c));
                em.o(R.string.TextCopied, new wc(j81Var.getContainer(), null));
                return;
            default:
                kc1 kc1Var = (kc1) this.b;
                i6 i6Var = (i6) this.c;
                ThemeActivity themeActivity = kc1Var.e;
                if (themeActivity.getParentActivity() == null) {
                    return;
                }
                if (i10 == 0) {
                    if (i6Var.F == null) {
                        themeActivity.getMessagesController().saveThemeToServer(i6Var, null);
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, i6Var, null);
                        return;
                    }
                    String str8 = "https://" + themeActivity.getMessagesController().linkPrefix + "/addtheme/" + i6Var.F.slug;
                    themeActivity.showDialog(new sq0(themeActivity.getParentActivity(), null, str8, false, str8, false, null));
                    return;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        f5Var = ((p2) themeActivity).parentLayout;
                        if (f5Var != null) {
                            j6.t(i6Var, true, false);
                            f5Var2 = ((p2) themeActivity).parentLayout;
                            ((ActionBarLayout) f5Var2).U(true, true);
                            new ThemeEditorView().c(themeActivity.getParentActivity(), i6Var);
                            return;
                        }
                        return;
                    }
                    if (i10 == 3) {
                        themeActivity.presentFragment(new fe1(i6Var, null, false));
                        return;
                    }
                    if (themeActivity.getParentActivity() == null) {
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                    alertDialog$Builder.a.T = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                    alertDialog$Builder.k(LocaleController.getString("Delete", R.string.Delete), new fz0(9, kc1Var, i6Var));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    d2 d2Var = alertDialog$Builder.a;
                    themeActivity.showDialog(d2Var);
                    TextView textView = (TextView) d2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(j6.w0(null, j6.q7, false));
                        return;
                    }
                    return;
                }
                if (i6Var.b == null && i6Var.d == null) {
                    StringBuilder sb4 = new StringBuilder();
                    int[] iArr = j6.nl;
                    for (int i17 = 0; i17 < iArr.length; i17++) {
                        sb4.append(i5.i(i17));
                        sb4.append("=");
                        sb4.append(iArr[i17]);
                        sb4.append("\n");
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
                        fileOutputStream.write(AndroidUtilities.getStringBytes(sb4.toString()));
                        fileOutputStream.close();
                    } catch (Exception e11) {
                        e = e11;
                        fileOutputStream2 = fileOutputStream;
                        FileLog.e(e);
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        str = i6Var.a;
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
                    String str9 = i6Var.d;
                    p02 = str9 != null ? j6.p0(str9) : new File(i6Var.b);
                }
                str = i6Var.a;
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
        }
    }
}
