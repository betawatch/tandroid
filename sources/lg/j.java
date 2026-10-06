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
import org.telegram.messenger.bi;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.bf0;
import org.telegram.ui.Components.br0;
import org.telegram.ui.Components.ld;
import org.telegram.ui.Components.nt0;
import org.telegram.ui.Components.voip.e1;
import org.telegram.ui.Components.yc;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.ez0;
import org.telegram.ui.f41;
import org.telegram.ui.fs0;
import org.telegram.ui.h60;
import org.telegram.ui.i4;
import org.telegram.ui.kn0;
import org.telegram.ui.l50;
import org.telegram.ui.nb;
import org.telegram.ui.t10;
import org.telegram.ui.ud1;
import org.telegram.ui.uy;
import org.telegram.ui.v3;
import org.telegram.ui.x10;
import org.telegram.ui.x71;
import org.telegram.ui.yn;
import org.telegram.ui.zb1;
import pg.k1;
import pg.m1;
import pg.n1;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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

    /* JADX WARN: Removed duplicated region for block: B:175:0x03f9  */
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
        c5 c5Var;
        c5 c5Var2;
        File p02;
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
            case 3:
                yn ynVar = (yn) this.b;
                String str5 = (String) this.c;
                AndroidUtilities.addToClipboard(str5);
                yc.a0(ynVar).i(LocaleController.formatString(R.string.ExactTextCopied, str5)).j();
                return;
            case 4:
                ArrayList arrayList = (ArrayList) this.b;
                uy uyVar = (uy) this.c;
                int i11 = i10 == 0 ? 0 : i10 == 1 ? 1 : i10 == 2 ? 2 : 3;
                if (arrayList != null) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(((Long) arrayList.get(i12)).longValue(), 0, i11);
                    }
                }
                int i13 = i11;
                if (yc.a(uyVar)) {
                    yc.z(uyVar, i13, 0, null).j();
                    return;
                }
                return;
            case 5:
                bf0 bf0Var = (bf0) this.b;
                AndroidUtilities.VcardItem vcardItem = (AndroidUtilities.VcardItem) this.c;
                bf0Var.getClass();
                if (i10 == 0) {
                    try {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vcardItem.getValue(false)));
                        if (AndroidUtilities.shouldShowClipboardToast()) {
                            Toast.makeText(bf0Var.r.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
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
                nt0 nt0Var = (nt0) this.b;
                String str6 = (String) this.c;
                if (i10 == 0) {
                    nt0Var.a.R0(str6);
                    return;
                }
                nt0Var.getClass();
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
                t10 t10Var = (t10) this.b;
                String str7 = (String) this.c;
                if (i10 == 0) {
                    x10 x10Var = t10Var.a.v;
                    SpannableStringBuilder[] spannableStringBuilderArr = x10.s0;
                    x10Var.g(str7);
                    return;
                }
                t10Var.getClass();
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
                l50 l50Var = (l50) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                h60 h60Var = l50Var.b;
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                Integer num = (Integer) arrayList2.get(i10);
                int intValue = num.intValue();
                h60Var.y3 = num;
                h60Var.N1(true, true);
                h60Var.y3 = null;
                AndroidUtilities.runOnUIThread(new ld(l50Var, intValue, 14));
                return;
            case 9:
                kn0 kn0Var = (kn0) this.b;
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
                if (!kn0.v1(tL_secureRequiredType.type)) {
                    if (kn0.t1(tL_secureRequiredType.type)) {
                        tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                        tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypeAddress();
                    }
                    kn0Var.E1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                    return;
                }
                tL_secureRequiredType.selfie_required = true;
                tL_secureRequiredType.translation_required = true;
                tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypePersonalDetails();
                tL_secureRequiredType3 = tL_secureRequiredType;
                tL_secureRequiredType = tL_secureRequiredType2;
                kn0Var.E1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                return;
            case 10:
                ez0.a((ez0) this.b, (Context) this.c, i10);
                return;
            case 11:
                f41 f41Var = (f41) this.b;
                switch (((e1) this.c).a) {
                    case 24:
                        ri.e.c.b(i10 == 0 ? q0.b : q0.c);
                        break;
                    case 25:
                        ri.e.d.b(m0.values()[i10]);
                        break;
                    case 26:
                        ri.e.e.b(i10 == 0 ? n0.b : n0.c);
                        break;
                    default:
                        ri.c cVar = ri.e.f;
                        int i14 = f41.c[i10];
                        synchronized (cVar) {
                            cVar.b = i14;
                            cVar.a = true;
                            ri.d.a.edit().putInt("round_video_video_bitrate", i14).apply();
                            break;
                        }
                }
                f41Var.b.l();
                return;
            case 12:
                x71 x71Var = (x71) this.b;
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.c));
                bi.n(R.string.TextCopied, new yc(x71Var.getContainer(), null));
                return;
            case 13:
                zb1 zb1Var = (zb1) this.b;
                h6 h6Var = (h6) this.c;
                ThemeActivity themeActivity = zb1Var.e;
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
                    themeActivity.showDialog(new br0(themeActivity.getParentActivity(), null, str8, false, str8, false, null));
                    return;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        c5Var = ((n2) themeActivity).parentLayout;
                        if (c5Var != null) {
                            i6.t(h6Var, true, false);
                            c5Var2 = ((n2) themeActivity).parentLayout;
                            ((ActionBarLayout) c5Var2).U(true, true);
                            new ThemeEditorView().c(themeActivity.getParentActivity(), h6Var);
                            return;
                        }
                        return;
                    }
                    if (i10 == 3) {
                        themeActivity.presentFragment(new ud1(h6Var, null, false));
                        return;
                    }
                    if (themeActivity.getParentActivity() == null) {
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                    alertDialog$Builder.a.T = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                    alertDialog$Builder.k(LocaleController.getString("Delete", R.string.Delete), new fs0(16, zb1Var, h6Var));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    b2 b2Var = alertDialog$Builder.a;
                    themeActivity.showDialog(b2Var);
                    TextView textView = (TextView) b2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(i6.w0(null, i6.q7, false));
                        return;
                    }
                    return;
                }
                if (h6Var.b == null && h6Var.d == null) {
                    StringBuilder sb3 = new StringBuilder();
                    int[] iArr = i6.nl;
                    for (int i15 = 0; i15 < iArr.length; i15++) {
                        sb3.append(f5.i(i15));
                        sb3.append("=");
                        sb3.append(iArr[i15]);
                        sb3.append("\n");
                    }
                    p02 = new File(ApplicationLoader.getFilesDirFixed(), "default_theme.attheme");
                    try {
                        try {
                            try {
                                fileOutputStream = new FileOutputStream(p02);
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
                        } catch (Exception e13) {
                            FileLog.e(e13);
                            throw th2;
                        }
                    }
                } else {
                    String str9 = h6Var.d;
                    p02 = str9 != null ? i6.p0(str9) : new File(h6Var.b);
                }
                str2 = h6Var.a;
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
                } catch (Exception e14) {
                    FileLog.e(e14);
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
                        StringBuilder j3 = sa.e.j(string, "|");
                        j3.append(m1Var.a);
                        sb2 = j3.toString();
                    }
                    for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                        StringBuilder j10 = sa.e.j(sb2, ",");
                        j10.append(Math.round(((k1) arrayList4.get(i16)).a));
                        j10.append(",");
                        j10.append(Math.round(((k1) arrayList4.get(i16)).b));
                        sb2 = j10.toString();
                    }
                    sharedPreferences.edit().putString("moretemplates", sb2).apply();
                    return;
                }
                StringBuilder sb4 = new StringBuilder("[");
                for (int i17 = 0; i17 < arrayList5.size(); i17++) {
                    m1 m1Var2 = (m1) arrayList5.get(i17);
                    if (i17 > 0) {
                        sb4.append(",\n");
                    }
                    sb4.append("\t{\n\t\t\"shape\": ");
                    sb4.append(m1Var2.a);
                    sb4.append(",\n\t\t\"points\": [");
                    for (int i18 = 0; i18 < m1Var2.b.size(); i18++) {
                        if (i18 > 0) {
                            sb4.append(",");
                        }
                        k1 k1Var = (k1) m1Var2.b.get(i18);
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
