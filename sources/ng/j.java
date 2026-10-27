package ng;

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
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.x6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.h2;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.voip.c1;
import org.telegram.ui.Components.wc;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.a50;
import org.telegram.ui.ad1;
import org.telegram.ui.c71;
import org.telegram.ui.cf0;
import org.telegram.ui.db1;
import org.telegram.ui.ey;
import org.telegram.ui.f10;
import org.telegram.ui.i31;
import org.telegram.ui.j10;
import org.telegram.ui.j4;
import org.telegram.ui.kn0;
import org.telegram.ui.nb;
import org.telegram.ui.v3;
import org.telegram.ui.wn;
import org.telegram.ui.x50;
import org.telegram.ui.xy0;
import rg.h1;
import rg.j1;
import rg.k1;
import vi.o0;
import vi.p0;
import vi.s0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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

    /* JADX WARN: Removed duplicated region for block: B:174:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022c A[Catch: Exception -> 0x026a, TRY_LEAVE, TryCatch #4 {Exception -> 0x026a, blocks: (B:71:0x0224, B:75:0x022c, B:79:0x0273, B:78:0x026c, B:85:0x0262, B:83:0x023e), top: B:70:0x0224, inners: #12 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x01d8 -> B:53:0x020b). Please report as a decompilation issue!!! */
    @Override // android.content.DialogInterface.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(DialogInterface dialogInterface, int i10) {
        String str;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        j5 j5Var;
        j5 j5Var2;
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
                j4 j4Var = (j4) this.b;
                String str3 = (String) this.c;
                v3 v3Var = j4Var.K;
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
                        str = URLDecoder.decode(str3.substring(lastIndexOf + 1), "UTF-8");
                    } catch (Exception unused) {
                        str = "";
                    }
                    if (str3.toLowerCase().contains(lowerCase)) {
                        if (!TextUtils.isEmpty(str)) {
                            j4Var.V(str, true);
                            return;
                        } else {
                            j4Var.u0[0].d.h1(v3Var == null ? 0 : 1, v3Var != null ? AndroidUtilities.dp(32.0f) : 0);
                            j4Var.m(null);
                            return;
                        }
                    }
                }
                qf.d.r(j4Var.L, str3);
                return;
            case 2:
                nb nbVar = (nb) this.b;
                String str4 = (String) this.c;
                if (i10 == 0) {
                    qf.d.n(nbVar.a.n.getParentActivity(), str4, true);
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
                wc.b0(wnVar).i(LocaleController.formatString(R.string.ExactTextCopied, str5)).j();
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
                if (wc.a(eyVar)) {
                    wc.z(eyVar, i13, 0, null).j();
                    return;
                }
                return;
            case 5:
                kf0 kf0Var = (kf0) this.b;
                AndroidUtilities.VcardItem vcardItem = (AndroidUtilities.VcardItem) this.c;
                kf0Var.getClass();
                if (i10 == 0) {
                    try {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vcardItem.getValue(false)));
                        if (AndroidUtilities.shouldShowClipboardToast()) {
                            Toast.makeText(kf0Var.r.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
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
                cu0 cu0Var = (cu0) this.b;
                String str6 = (String) this.c;
                if (i10 == 0) {
                    cu0Var.a.X0(str6);
                    return;
                }
                cu0Var.getClass();
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
                f10 f10Var = (f10) this.b;
                String str7 = (String) this.c;
                if (i10 == 0) {
                    j10 j10Var = f10Var.a.v;
                    SpannableStringBuilder[] spannableStringBuilderArr = j10.s0;
                    j10Var.g(str7);
                    return;
                }
                f10Var.getClass();
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
                a50 a50Var = (a50) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                x50 x50Var = a50Var.b;
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                Integer num = (Integer) arrayList2.get(i10);
                int intValue = num.intValue();
                x50Var.y3 = num;
                x50Var.O1(true, true);
                x50Var.y3 = null;
                AndroidUtilities.runOnUIThread(new h2(a50Var, intValue, 16));
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
                xy0.a((xy0) this.b, (Context) this.c, i10);
                return;
            case 11:
                i31 i31Var = (i31) this.b;
                switch (((c1) this.c).a) {
                    case 22:
                        wi.e.e.b(i10 == 0 ? s0.b : s0.c);
                        break;
                    case 23:
                        wi.e.f.b(o0.values()[i10]);
                        break;
                    case 24:
                        wi.e.g.b(i10 == 0 ? p0.b : p0.c);
                        break;
                    default:
                        wi.c cVar = wi.e.h;
                        int i14 = i31.c[i10];
                        synchronized (cVar) {
                            cVar.b = i14;
                            cVar.a = true;
                            wi.d.a.edit().putInt("round_video_video_bitrate", i14).apply();
                            break;
                        }
                }
                i31Var.b.l();
                return;
            case 12:
                c71 c71Var = (c71) this.b;
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.c));
                wh.m(R.string.TextCopied, new wc(c71Var.getContainer(), null));
                return;
            case 13:
                db1 db1Var = (db1) this.b;
                x6 x6Var = (x6) this.c;
                ThemeActivity themeActivity = db1Var.e;
                if (themeActivity.getParentActivity() == null) {
                    return;
                }
                if (i10 == 0) {
                    if (x6Var.F == null) {
                        themeActivity.getMessagesController().saveThemeToServer(x6Var, null);
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, x6Var, null);
                        return;
                    }
                    String str8 = "https://" + themeActivity.getMessagesController().linkPrefix + "/addtheme/" + x6Var.F.slug;
                    themeActivity.showDialog(new nr0(themeActivity.getParentActivity(), null, str8, false, str8, false, null));
                    return;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        j5Var = ((r2) themeActivity).parentLayout;
                        if (j5Var != null) {
                            y6.t(x6Var, true, false);
                            j5Var2 = ((r2) themeActivity).parentLayout;
                            ((ActionBarLayout) j5Var2).W(true, true);
                            new ThemeEditorView().d(themeActivity.getParentActivity(), x6Var);
                            return;
                        }
                        return;
                    }
                    if (i10 == 3) {
                        themeActivity.presentFragment(new ad1(x6Var, null, false));
                        return;
                    }
                    if (themeActivity.getParentActivity() == null) {
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                    alertDialog$Builder.a.T = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                    alertDialog$Builder.k(LocaleController.getString("Delete", R.string.Delete), new cf0(25, db1Var, x6Var));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    e2 e2Var = alertDialog$Builder.a;
                    themeActivity.showDialog(e2Var);
                    TextView textView = (TextView) e2Var.d(-1);
                    if (textView != null) {
                        f7.V(textView, y6.q7, null);
                        return;
                    }
                    return;
                }
                if (x6Var.b == null && x6Var.d == null) {
                    StringBuilder sb3 = new StringBuilder();
                    int[] iArr = y6.ql;
                    for (int i15 = 0; i15 < iArr.length; i15++) {
                        sb3.append(m5.c(i15));
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
                        str2 = x6Var.a;
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
                    String str9 = x6Var.d;
                    q02 = str9 != null ? y6.q0(str9) : new File(x6Var.b);
                }
                str2 = x6Var.a;
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
                k1 k1Var = (k1) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                SharedPreferences sharedPreferences = k1Var.g;
                ArrayList arrayList5 = k1Var.c;
                if (i10 != 0) {
                    j1 j1Var = new j1();
                    j1Var.a = i10 - 1;
                    j1Var.b = arrayList4;
                    arrayList5.add(j1Var);
                    String string = sharedPreferences.getString("moretemplates", null);
                    if (string == null) {
                        sb2 = "" + j1Var.a;
                    } else {
                        StringBuilder l4 = b10.l(string, "|");
                        l4.append(j1Var.a);
                        sb2 = l4.toString();
                    }
                    for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                        StringBuilder l10 = b10.l(sb2, ",");
                        l10.append(Math.round(((h1) arrayList4.get(i16)).a));
                        l10.append(",");
                        l10.append(Math.round(((h1) arrayList4.get(i16)).b));
                        sb2 = l10.toString();
                    }
                    sharedPreferences.edit().putString("moretemplates", sb2).apply();
                    return;
                }
                StringBuilder sb4 = new StringBuilder("[");
                for (int i17 = 0; i17 < arrayList5.size(); i17++) {
                    j1 j1Var2 = (j1) arrayList5.get(i17);
                    if (i17 > 0) {
                        sb4.append(",\n");
                    }
                    sb4.append("\t{\n\t\t\"shape\": ");
                    sb4.append(j1Var2.a);
                    sb4.append(",\n\t\t\"points\": [");
                    for (int i18 = 0; i18 < j1Var2.b.size(); i18++) {
                        if (i18 > 0) {
                            sb4.append(",");
                        }
                        h1 h1Var = (h1) j1Var2.b.get(i18);
                        sb4.append("[");
                        sb4.append(Math.round(h1Var.a));
                        sb4.append(",");
                        sb4.append(Math.round(h1Var.b));
                        sb4.append("]");
                    }
                    sb4.append("],\n\t\t\"freq\": ");
                    sb4.append(Math.round(((j1Var2.c / k1Var.a) * 100.0f) * 100.0f) / 100.0f);
                    sb4.append("\n\t}");
                }
                sb4.append("\n]");
                Log.i("shapedetector", sb4.toString());
                return;
        }
    }
}
