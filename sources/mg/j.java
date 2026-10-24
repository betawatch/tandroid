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
import org.telegram.messenger.sl;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.d2;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.mf0;
import org.telegram.ui.Components.ut0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.an0;
import org.telegram.ui.e10;
import org.telegram.ui.e31;
import org.telegram.ui.ey;
import org.telegram.ui.i10;
import org.telegram.ui.k4;
import org.telegram.ui.mb;
import org.telegram.ui.ql0;
import org.telegram.ui.sn;
import org.telegram.ui.sy0;
import org.telegram.ui.u50;
import org.telegram.ui.uc1;
import org.telegram.ui.w3;
import org.telegram.ui.w40;
import org.telegram.ui.wv;
import org.telegram.ui.y61;
import org.telegram.ui.za1;
import qg.j1;
import qg.l1;
import qg.m1;
import si.n0;
import si.o0;
import si.p0;
import si.s0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
        h5 h5Var;
        h5 h5Var2;
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
                k4 k4Var = (k4) this.b;
                String str3 = (String) this.c;
                w3 w3Var = k4Var.K;
                if (k4Var.L == null || k4Var.u0[0].c.E == null) {
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
                    String lowerCase = !TextUtils.isEmpty(k4Var.u0[0].c.E.cached_page.url) ? k4Var.u0[0].c.E.cached_page.url.toLowerCase() : k4Var.u0[0].c.E.url.toLowerCase();
                    try {
                        str = URLDecoder.decode(str3.substring(lastIndexOf + 1), "UTF-8");
                    } catch (Exception unused) {
                        str = "";
                    }
                    if (str3.toLowerCase().contains(lowerCase)) {
                        if (!TextUtils.isEmpty(str)) {
                            k4Var.V(str, true);
                            return;
                        } else {
                            k4Var.u0[0].d.h1(w3Var == null ? 0 : 1, w3Var != null ? AndroidUtilities.dp(32.0f) : 0);
                            k4Var.m(null);
                            return;
                        }
                    }
                }
                pf.d.r(k4Var.L, str3);
                return;
            case 2:
                mb mbVar = (mb) this.b;
                String str4 = (String) this.c;
                if (i10 == 0) {
                    pf.d.n(mbVar.a.n.getParentActivity(), str4, true);
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
                mf0 mf0Var = (mf0) this.b;
                AndroidUtilities.VcardItem vcardItem = (AndroidUtilities.VcardItem) this.c;
                mf0Var.getClass();
                if (i10 == 0) {
                    try {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vcardItem.getValue(false)));
                        if (AndroidUtilities.shouldShowClipboardToast()) {
                            Toast.makeText(mf0Var.r.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
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
                ut0 ut0Var = (ut0) this.b;
                String str6 = (String) this.c;
                if (i10 == 0) {
                    ut0Var.a.U0(str6);
                    return;
                }
                ut0Var.getClass();
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
                e10 e10Var = (e10) this.b;
                String str7 = (String) this.c;
                if (i10 == 0) {
                    i10 i10Var = e10Var.a.v;
                    SpannableStringBuilder[] spannableStringBuilderArr = i10.s0;
                    i10Var.g(str7);
                    return;
                }
                e10Var.getClass();
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
                w40 w40Var = (w40) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                u50 u50Var = w40Var.b;
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                Integer num = (Integer) arrayList2.get(i10);
                int intValue = num.intValue();
                u50Var.y3 = num;
                u50Var.O1(true, true);
                u50Var.y3 = null;
                AndroidUtilities.runOnUIThread(new d2(w40Var, intValue, 17));
                return;
            case 9:
                an0 an0Var = (an0) this.b;
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
                if (!an0.u1(tL_secureRequiredType.type)) {
                    if (an0.s1(tL_secureRequiredType.type)) {
                        tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                        tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypeAddress();
                    }
                    an0Var.D1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                    return;
                }
                tL_secureRequiredType.selfie_required = true;
                tL_secureRequiredType.translation_required = true;
                tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypePersonalDetails();
                tL_secureRequiredType3 = tL_secureRequiredType;
                tL_secureRequiredType = tL_secureRequiredType2;
                an0Var.D1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                return;
            case 10:
                sy0.a((sy0) this.b, (Context) this.c, i10);
                return;
            case 11:
                e31 e31Var = (e31) this.b;
                switch (((wv) this.c).a) {
                    case 19:
                        ti.e.e.b(i10 == 0 ? s0.b : s0.c);
                        break;
                    case 20:
                        ti.e.f.b(n0.values()[i10]);
                        break;
                    case 21:
                        ti.e.g.b(i10 == 0 ? p0.b : p0.c);
                        break;
                    default:
                        ti.c cVar = ti.e.h;
                        int i14 = e31.c[i10];
                        synchronized (cVar) {
                            cVar.b = i14;
                            cVar.a = true;
                            ti.d.a.edit().putInt("round_video_video_bitrate", i14).apply();
                            break;
                        }
                }
                e31Var.b.l();
                return;
            case 12:
                y61 y61Var = (y61) this.b;
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.c));
                sl.p(R.string.TextCopied, new xc(y61Var.getContainer(), null));
                return;
            case 13:
                za1 za1Var = (za1) this.b;
                j6 j6Var = (j6) this.c;
                ThemeActivity themeActivity = za1Var.e;
                if (themeActivity.getParentActivity() == null) {
                    return;
                }
                if (i10 == 0) {
                    if (j6Var.F == null) {
                        themeActivity.getMessagesController().saveThemeToServer(j6Var, null);
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, j6Var, null);
                        return;
                    }
                    String str8 = "https://" + themeActivity.getMessagesController().linkPrefix + "/addtheme/" + j6Var.F.slug;
                    themeActivity.showDialog(new ir0(themeActivity.getParentActivity(), null, str8, false, str8, false, null));
                    return;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        h5Var = ((o2) themeActivity).parentLayout;
                        if (h5Var != null) {
                            k6.t(j6Var, true, false);
                            h5Var2 = ((o2) themeActivity).parentLayout;
                            ((ActionBarLayout) h5Var2).V(true, true);
                            new ThemeEditorView().d(themeActivity.getParentActivity(), j6Var);
                            return;
                        }
                        return;
                    }
                    if (i10 == 3) {
                        themeActivity.presentFragment(new uc1(j6Var, null, false));
                        return;
                    }
                    if (themeActivity.getParentActivity() == null) {
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                    alertDialog$Builder.a.T = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                    alertDialog$Builder.k(LocaleController.getString("Delete", R.string.Delete), new ql0(21, za1Var, j6Var));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    c2 c2Var = alertDialog$Builder.a;
                    themeActivity.showDialog(c2Var);
                    TextView textView = (TextView) c2Var.d(-1);
                    if (textView != null) {
                        r6.W(textView, k6.q7, null);
                        return;
                    }
                    return;
                }
                if (j6Var.b == null && j6Var.d == null) {
                    StringBuilder sb3 = new StringBuilder();
                    int[] iArr = k6.ql;
                    for (int i15 = 0; i15 < iArr.length; i15++) {
                        sb3.append(k5.i(i15));
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
                        str2 = j6Var.a;
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
                    String str9 = j6Var.d;
                    q02 = str9 != null ? k6.q0(str9) : new File(j6Var.b);
                }
                str2 = j6Var.a;
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
                        StringBuilder i16 = o0.i(string, "|");
                        i16.append(l1Var.a);
                        sb2 = i16.toString();
                    }
                    for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                        StringBuilder i18 = o0.i(sb2, ",");
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
