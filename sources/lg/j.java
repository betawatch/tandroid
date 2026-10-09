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
import ki.n0;
import ki.o0;
import ki.r0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.bi;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.nd;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.yt0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.a80;
import org.telegram.ui.ce1;
import org.telegram.ui.g60;
import org.telegram.ui.h81;
import org.telegram.ui.hc1;
import org.telegram.ui.i4;
import org.telegram.ui.j50;
import org.telegram.ui.kz0;
import org.telegram.ui.ls0;
import org.telegram.ui.mb;
import org.telegram.ui.n41;
import org.telegram.ui.nn0;
import org.telegram.ui.s10;
import org.telegram.ui.ty;
import org.telegram.ui.v3;
import org.telegram.ui.w10;
import org.telegram.ui.zn;
import pg.j1;
import pg.l1;
import pg.m1;
import sc.v;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
    /* JADX WARN: Removed duplicated region for block: B:68:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022e A[Catch: Exception -> 0x026c, TRY_LEAVE, TryCatch #2 {Exception -> 0x026c, blocks: (B:71:0x0226, B:75:0x022e, B:79:0x0275, B:78:0x026e, B:85:0x0264, B:83:0x0240), top: B:70:0x0226, inners: #9 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x01da -> B:53:0x020d). Please report as a decompilation issue!!! */
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
        int i11 = 15;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3 = null;
        r9 = null;
        r9 = null;
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
                of.f.s(i4Var.L, str3);
                return;
            case 2:
                mb mbVar = (mb) this.b;
                String str4 = (String) this.c;
                if (i10 == 0) {
                    of.f.o(mbVar.a.n.getParentActivity(), str4, true);
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
                zn znVar = (zn) this.b;
                String str5 = (String) this.c;
                AndroidUtilities.addToClipboard(str5);
                ad.a0(znVar).i(LocaleController.formatString(R.string.ExactTextCopied, str5)).j();
                return;
            case 4:
                ArrayList arrayList = (ArrayList) this.b;
                ty tyVar = (ty) this.c;
                int i12 = i10 == 0 ? 0 : i10 == 1 ? 1 : i10 == 2 ? 2 : 3;
                if (arrayList != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(((Long) arrayList.get(i13)).longValue(), 0, i12);
                    }
                }
                int i14 = i12;
                if (ad.a(tyVar)) {
                    ad.z(tyVar, i14, 0, null).j();
                    return;
                }
                return;
            case 5:
                qf0 qf0Var = (qf0) this.b;
                AndroidUtilities.VcardItem vcardItem = (AndroidUtilities.VcardItem) this.c;
                qf0Var.getClass();
                if (i10 == 0) {
                    try {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vcardItem.getValue(false)));
                        if (AndroidUtilities.shouldShowClipboardToast()) {
                            Toast.makeText(qf0Var.r.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
                            return;
                        }
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                return;
            case 6:
                yt0 yt0Var = (yt0) this.b;
                String str6 = (String) this.c;
                if (i10 == 0) {
                    yt0Var.a.R0(str6);
                    return;
                }
                yt0Var.getClass();
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
                s10 s10Var = (s10) this.b;
                String str7 = (String) this.c;
                if (i10 == 0) {
                    w10 w10Var = s10Var.a.v;
                    SpannableStringBuilder[] spannableStringBuilderArr = w10.s0;
                    w10Var.g(str7);
                    return;
                }
                s10Var.getClass();
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
                j50 j50Var = (j50) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                g60 g60Var = j50Var.b;
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                Integer num = (Integer) arrayList2.get(i10);
                int intValue = num.intValue();
                g60Var.y3 = num;
                g60Var.O1(true, true);
                g60Var.y3 = null;
                AndroidUtilities.runOnUIThread(new nd(j50Var, intValue, i11));
                return;
            case 9:
                nn0 nn0Var = (nn0) this.b;
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
                if (!nn0.u1(tL_secureRequiredType.type)) {
                    if (nn0.s1(tL_secureRequiredType.type)) {
                        tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                        tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypeAddress();
                    }
                    nn0Var.D1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                    return;
                }
                tL_secureRequiredType.selfie_required = true;
                tL_secureRequiredType.translation_required = true;
                tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypePersonalDetails();
                tL_secureRequiredType3 = tL_secureRequiredType;
                tL_secureRequiredType = tL_secureRequiredType2;
                nn0Var.D1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                return;
            case 10:
                kz0.a((kz0) this.b, (Context) this.c, i10);
                return;
            case 11:
                n41 n41Var = (n41) this.b;
                switch (((a80) this.c).a) {
                    case 13:
                        pi.e.c.b(i10 == 0 ? r0.b : r0.c);
                        break;
                    case 14:
                        pi.e.d.b(n0.values()[i10]);
                        break;
                    case 15:
                        pi.e.e.b(i10 == 0 ? o0.b : o0.c);
                        break;
                    default:
                        pi.c cVar = pi.e.f;
                        int i15 = n41.c[i10];
                        synchronized (cVar) {
                            cVar.b = i15;
                            cVar.a = true;
                            pi.d.a.edit().putInt("round_video_video_bitrate", i15).apply();
                            break;
                        }
                }
                n41Var.b.l();
                return;
            case 12:
                h81 h81Var = (h81) this.b;
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.c));
                bi.p(R.string.TextCopied, new ad(h81Var.getContainer(), null));
                return;
            case 13:
                hc1 hc1Var = (hc1) this.b;
                h6 h6Var = (h6) this.c;
                ThemeActivity themeActivity = hc1Var.e;
                if (themeActivity.getParentActivity() == null) {
                    return;
                }
                if (i10 == 0) {
                    if (h6Var.F == null) {
                        themeActivity.getMessagesController().saveThemeToServer(h6Var, null);
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, h6Var, null);
                        return;
                    }
                    String str8 = "https://" + themeActivity.getMessagesController().linkPrefix + "/addtheme/" + h6Var.F.slug;
                    themeActivity.showDialog(new mr0(themeActivity.getParentActivity(), null, str8, false, str8, false, null));
                    return;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        d5Var = ((n2) themeActivity).parentLayout;
                        if (d5Var != null) {
                            i6.t(h6Var, true, false);
                            d5Var2 = ((n2) themeActivity).parentLayout;
                            ((ActionBarLayout) d5Var2).U(true, true);
                            new ThemeEditorView().c(themeActivity.getParentActivity(), h6Var);
                            return;
                        }
                        return;
                    }
                    if (i10 == 3) {
                        themeActivity.presentFragment(new ce1(h6Var, null, false));
                        return;
                    }
                    if (themeActivity.getParentActivity() == null) {
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                    alertDialog$Builder.a.T = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                    alertDialog$Builder.k(LocaleController.getString("Delete", R.string.Delete), new ls0(i11, hc1Var, h6Var));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    b2 b2Var = alertDialog$Builder.a;
                    themeActivity.showDialog(b2Var);
                    TextView textView = (TextView) b2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(i6.x0(null, i6.q7, false));
                        return;
                    }
                    return;
                }
                if (h6Var.b == null && h6Var.d == null) {
                    StringBuilder sb3 = new StringBuilder();
                    int[] iArr = i6.ql;
                    for (int i16 = 0; i16 < iArr.length; i16++) {
                        sb3.append(g5.i(i16));
                        sb3.append("=");
                        sb3.append(iArr[i16]);
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
                        } catch (Exception e10) {
                            e = e10;
                        }
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                    try {
                        fileOutputStream.write(AndroidUtilities.getStringBytes(sb3.toString()));
                        fileOutputStream.close();
                    } catch (Exception e12) {
                        e = e12;
                        fileOutputStream2 = fileOutputStream;
                        FileLog.e(e);
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        str2 = h6Var.a;
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
                        } catch (Exception e13) {
                            FileLog.e(e13);
                            throw th2;
                        }
                    }
                } else {
                    String str9 = h6Var.d;
                    q02 = str9 != null ? i6.q0(str9) : new File(h6Var.b);
                }
                str2 = h6Var.a;
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
                } catch (Exception e14) {
                    FileLog.e(e14);
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
                        StringBuilder j3 = v.j(string, "|");
                        j3.append(l1Var.a);
                        sb2 = j3.toString();
                    }
                    for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                        StringBuilder j10 = v.j(sb2, ",");
                        j10.append(Math.round(((j1) arrayList4.get(i17)).a));
                        j10.append(",");
                        j10.append(Math.round(((j1) arrayList4.get(i17)).b));
                        sb2 = j10.toString();
                    }
                    sharedPreferences.edit().putString("moretemplates", sb2).apply();
                    return;
                }
                StringBuilder sb4 = new StringBuilder("[");
                for (int i18 = 0; i18 < arrayList5.size(); i18++) {
                    l1 l1Var2 = (l1) arrayList5.get(i18);
                    if (i18 > 0) {
                        sb4.append(",\n");
                    }
                    sb4.append("\t{\n\t\t\"shape\": ");
                    sb4.append(l1Var2.a);
                    sb4.append(",\n\t\t\"points\": [");
                    for (int i19 = 0; i19 < l1Var2.b.size(); i19++) {
                        if (i19 > 0) {
                            sb4.append(",");
                        }
                        j1 j1Var = (j1) l1Var2.b.get(i19);
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
