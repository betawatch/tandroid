package cg;

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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.lq0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.se0;
import org.telegram.ui.Components.us0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.c60;
import org.telegram.ui.dn0;
import org.telegram.ui.g50;
import org.telegram.ui.hd1;
import org.telegram.ui.jb;
import org.telegram.ui.l4;
import org.telegram.ui.lb1;
import org.telegram.ui.o71;
import org.telegram.ui.oy;
import org.telegram.ui.p10;
import org.telegram.ui.sy0;
import org.telegram.ui.t10;
import org.telegram.ui.tl0;
import org.telegram.ui.xn;
import org.telegram.ui.y3;
import vh.v2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012d A[Catch: Exception -> 0x016d, TRY_LEAVE, TryCatch #3 {Exception -> 0x016d, blocks: (B:41:0x0125, B:45:0x012d, B:49:0x0176, B:48:0x016f, B:55:0x0165, B:53:0x0141), top: B:40:0x0125, inners: #8 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x00d7 -> B:30:0x010a). Please report as a decompilation issue!!! */
    @Override // android.content.DialogInterface.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(DialogInterface dialogInterface, int i10) {
        String sb;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        e5 e5Var;
        e5 e5Var2;
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
                z1 z1Var = (z1) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                SharedPreferences sharedPreferences = z1Var.g;
                ArrayList arrayList2 = z1Var.c;
                if (i10 != 0) {
                    y1 y1Var = new y1();
                    y1Var.a = i10 - 1;
                    y1Var.b = arrayList;
                    arrayList2.add(y1Var);
                    String string = sharedPreferences.getString("moretemplates", null);
                    if (string == null) {
                        sb = "" + y1Var.a;
                    } else {
                        StringBuilder f10 = v2.f(string, "|");
                        f10.append(y1Var.a);
                        sb = f10.toString();
                    }
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        StringBuilder f11 = v2.f(sb, ",");
                        f11.append(Math.round(((w1) arrayList.get(i11)).a));
                        f11.append(",");
                        f11.append(Math.round(((w1) arrayList.get(i11)).b));
                        sb = f11.toString();
                    }
                    sharedPreferences.edit().putString("moretemplates", sb).apply();
                    return;
                }
                StringBuilder sb2 = new StringBuilder("[");
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    y1 y1Var2 = (y1) arrayList2.get(i12);
                    if (i12 > 0) {
                        sb2.append(",\n");
                    }
                    sb2.append("\t{\n\t\t\"shape\": ");
                    sb2.append(y1Var2.a);
                    sb2.append(",\n\t\t\"points\": [");
                    for (int i13 = 0; i13 < y1Var2.b.size(); i13++) {
                        if (i13 > 0) {
                            sb2.append(",");
                        }
                        w1 w1Var = (w1) y1Var2.b.get(i13);
                        sb2.append("[");
                        sb2.append(Math.round(w1Var.a));
                        sb2.append(",");
                        sb2.append(Math.round(w1Var.b));
                        sb2.append("]");
                    }
                    sb2.append("],\n\t\t\"freq\": ");
                    sb2.append(Math.round(((y1Var2.c / z1Var.a) * 100.0f) * 100.0f) / 100.0f);
                    sb2.append("\n\t}");
                }
                sb2.append("\n]");
                Log.i("shapedetector", sb2.toString());
                return;
            case 1:
                l4 l4Var = (l4) this.b;
                String str3 = (String) this.c;
                y3 y3Var = l4Var.H;
                if (l4Var.I == null || l4Var.r0[0].c.B == null) {
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
                    String lowerCase = !TextUtils.isEmpty(l4Var.r0[0].c.B.cached_page.url) ? l4Var.r0[0].c.B.cached_page.url.toLowerCase() : l4Var.r0[0].c.B.url.toLowerCase();
                    try {
                        str2 = URLDecoder.decode(str3.substring(lastIndexOf + 1), "UTF-8");
                    } catch (Exception unused) {
                    }
                    if (str3.toLowerCase().contains(lowerCase)) {
                        if (!TextUtils.isEmpty(str2)) {
                            l4Var.V(str2, true);
                            return;
                        } else {
                            l4Var.r0[0].d.h1(y3Var == null ? 0 : 1, y3Var != null ? AndroidUtilities.dp(32.0f) : 0);
                            l4Var.m(null);
                            return;
                        }
                    }
                }
                af.g.s(l4Var.I, str3);
                return;
            case 2:
                jb jbVar = (jb) this.b;
                String str4 = (String) this.c;
                if (i10 == 0) {
                    af.g.o(jbVar.a.n.getParentActivity(), str4, true);
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
                qc.a0(xnVar).i(LocaleController.formatString(R.string.ExactTextCopied, str5)).j();
                return;
            case 4:
                ArrayList arrayList3 = (ArrayList) this.c;
                oy oyVar = (oy) this.b;
                int i14 = i10 == 0 ? 0 : i10 == 1 ? 1 : i10 == 2 ? 2 : 3;
                if (arrayList3 != null) {
                    for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                        NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(((Long) arrayList3.get(i15)).longValue(), 0, i14);
                    }
                }
                int i16 = i14;
                if (qc.a(oyVar)) {
                    qc.z(oyVar, i16, 0, null).j();
                    return;
                }
                return;
            case 5:
                se0 se0Var = (se0) this.b;
                AndroidUtilities.VcardItem vcardItem = (AndroidUtilities.VcardItem) this.c;
                se0Var.getClass();
                if (i10 == 0) {
                    try {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vcardItem.getValue(false)));
                        if (AndroidUtilities.shouldShowClipboardToast()) {
                            Toast.makeText(se0Var.r.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
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
                us0 us0Var = (us0) this.b;
                String str6 = (String) this.c;
                if (i10 == 0) {
                    us0Var.a.R0(str6);
                    return;
                }
                us0Var.getClass();
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
                    SpannableStringBuilder[] spannableStringBuilderArr = t10.p0;
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
                ArrayList arrayList4 = (ArrayList) this.c;
                c60 c60Var = g50Var.b;
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                Integer num = (Integer) arrayList4.get(i10);
                int intValue = num.intValue();
                c60Var.v3 = num;
                c60Var.N1(true, true);
                c60Var.v3 = null;
                AndroidUtilities.runOnUIThread(new hm(g50Var, intValue, 13));
                return;
            case 9:
                dn0 dn0Var = (dn0) this.b;
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
                if (!dn0.v1(tL_secureRequiredType.type)) {
                    if (dn0.t1(tL_secureRequiredType.type)) {
                        tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                        tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypeAddress();
                    }
                    dn0Var.E1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                    return;
                }
                tL_secureRequiredType.selfie_required = true;
                tL_secureRequiredType.translation_required = true;
                tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypePersonalDetails();
                tL_secureRequiredType3 = tL_secureRequiredType;
                tL_secureRequiredType = tL_secureRequiredType2;
                dn0Var.E1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                return;
            case 10:
                sy0.a((sy0) this.b, (Context) this.c, i10);
                return;
            case 11:
                o71 o71Var = (o71) this.b;
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.c));
                org.telegram.ui.b.m(R.string.TextCopied, new qc(o71Var.getContainer(), null));
                return;
            case 12:
                lb1 lb1Var = (lb1) this.b;
                i6 i6Var = (i6) this.c;
                ThemeActivity themeActivity = lb1Var.e;
                if (themeActivity.getParentActivity() == null) {
                    return;
                }
                if (i10 == 0) {
                    if (i6Var.C == null) {
                        themeActivity.getMessagesController().saveThemeToServer(i6Var, null);
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, i6Var, null);
                        return;
                    }
                    String str8 = "https://" + themeActivity.getMessagesController().linkPrefix + "/addtheme/" + i6Var.C.slug;
                    themeActivity.showDialog(new lq0(themeActivity.getParentActivity(), null, str8, false, str8, false, null));
                    return;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        e5Var = ((p2) themeActivity).parentLayout;
                        if (e5Var != null) {
                            j6.t(i6Var, true, false);
                            e5Var2 = ((p2) themeActivity).parentLayout;
                            ((ActionBarLayout) e5Var2).U(true, true);
                            new ThemeEditorView().c(themeActivity.getParentActivity(), i6Var);
                            return;
                        }
                        return;
                    }
                    if (i10 == 3) {
                        themeActivity.presentFragment(new hd1(i6Var, null, false));
                        return;
                    }
                    if (themeActivity.getParentActivity() == null) {
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder.a.O = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                    alertDialog$Builder.a.Q = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                    alertDialog$Builder.k(LocaleController.getString("Delete", R.string.Delete), new tl0(22, lb1Var, i6Var));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                    themeActivity.showDialog(d2Var);
                    TextView textView = (TextView) d2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(j6.w0(null, j6.q7, false));
                        return;
                    }
                    return;
                }
                if (i6Var.b == null && i6Var.d == null) {
                    StringBuilder sb3 = new StringBuilder();
                    int[] iArr = j6.nl;
                    for (int i17 = 0; i17 < iArr.length; i17++) {
                        sb3.append(h5.i(i17));
                        sb3.append("=");
                        sb3.append(iArr[i17]);
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
                        } catch (Exception e6) {
                            e = e6;
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
            default:
                yf.n.a((yf.n) this.b, (Integer[][]) this.c, i10);
                return;
        }
    }

    public /* synthetic */ u1(ArrayList arrayList, oy oyVar) {
        this.a = 4;
        this.c = arrayList;
        this.b = oyVar;
    }
}
