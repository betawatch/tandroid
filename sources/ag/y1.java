package ag;

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
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.i8;
import org.telegram.ui.Components.ke0;
import org.telegram.ui.Components.ms0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.a71;
import org.telegram.ui.d10;
import org.telegram.ui.fb;
import org.telegram.ui.fy;
import org.telegram.ui.h10;
import org.telegram.ui.hy0;
import org.telegram.ui.kl0;
import org.telegram.ui.m4;
import org.telegram.ui.r50;
import org.telegram.ui.tn;
import org.telegram.ui.u40;
import org.telegram.ui.vc1;
import org.telegram.ui.vm0;
import org.telegram.ui.ya1;
import org.telegram.ui.z3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y1(int i10, Object obj, Object obj2) {
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
        String sb2;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        b5 b5Var;
        b5 b5Var2;
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
                d2 d2Var = (d2) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                SharedPreferences sharedPreferences = d2Var.g;
                ArrayList arrayList2 = d2Var.c;
                if (i10 != 0) {
                    c2 c2Var = new c2();
                    c2Var.a = i10 - 1;
                    c2Var.b = arrayList;
                    arrayList2.add(c2Var);
                    String string = sharedPreferences.getString("moretemplates", null);
                    if (string == null) {
                        sb2 = "" + c2Var.a;
                    } else {
                        StringBuilder f9 = u3.c.f(string, "|");
                        f9.append(c2Var.a);
                        sb2 = f9.toString();
                    }
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        StringBuilder f10 = u3.c.f(sb2, ",");
                        f10.append(Math.round(((a2) arrayList.get(i11)).a));
                        f10.append(",");
                        f10.append(Math.round(((a2) arrayList.get(i11)).b));
                        sb2 = f10.toString();
                    }
                    sharedPreferences.edit().putString("moretemplates", sb2).apply();
                    return;
                }
                StringBuilder sb3 = new StringBuilder("[");
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    c2 c2Var2 = (c2) arrayList2.get(i12);
                    if (i12 > 0) {
                        sb3.append(",\n");
                    }
                    sb3.append("\t{\n\t\t\"shape\": ");
                    sb3.append(c2Var2.a);
                    sb3.append(",\n\t\t\"points\": [");
                    for (int i13 = 0; i13 < c2Var2.b.size(); i13++) {
                        if (i13 > 0) {
                            sb3.append(",");
                        }
                        a2 a2Var = (a2) c2Var2.b.get(i13);
                        sb3.append("[");
                        sb3.append(Math.round(a2Var.a));
                        sb3.append(",");
                        sb3.append(Math.round(a2Var.b));
                        sb3.append("]");
                    }
                    sb3.append("],\n\t\t\"freq\": ");
                    sb3.append(Math.round(((c2Var2.c / d2Var.a) * 100.0f) * 100.0f) / 100.0f);
                    sb3.append("\n\t}");
                }
                sb3.append("\n]");
                Log.i("shapedetector", sb3.toString());
                return;
            case 1:
                m4 m4Var = (m4) this.b;
                String str3 = (String) this.c;
                z3 z3Var = m4Var.G;
                if (m4Var.H == null || m4Var.q0[0].c.A == null) {
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
                    String lowerCase = !TextUtils.isEmpty(m4Var.q0[0].c.A.cached_page.url) ? m4Var.q0[0].c.A.cached_page.url.toLowerCase() : m4Var.q0[0].c.A.url.toLowerCase();
                    try {
                        str2 = URLDecoder.decode(str3.substring(lastIndexOf + 1), "UTF-8");
                    } catch (Exception unused) {
                    }
                    if (str3.toLowerCase().contains(lowerCase)) {
                        if (!TextUtils.isEmpty(str2)) {
                            m4Var.V(str2, true);
                            return;
                        } else {
                            m4Var.q0[0].d.h1(z3Var == null ? 0 : 1, z3Var != null ? AndroidUtilities.dp(32.0f) : 0);
                            m4Var.m(null);
                            return;
                        }
                    }
                }
                ye.d.s(m4Var.H, str3);
                return;
            case 2:
                fb fbVar = (fb) this.b;
                String str4 = (String) this.c;
                if (i10 == 0) {
                    ye.d.o(fbVar.a.n.getParentActivity(), str4, true);
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
                tn tnVar = (tn) this.b;
                String str5 = (String) this.c;
                AndroidUtilities.addToClipboard(str5);
                tc.a0(tnVar).i(LocaleController.formatString(R.string.ExactTextCopied, str5)).j();
                return;
            case 4:
                ArrayList arrayList3 = (ArrayList) this.c;
                fy fyVar = (fy) this.b;
                int i14 = i10 == 0 ? 0 : i10 == 1 ? 1 : i10 == 2 ? 2 : 3;
                if (arrayList3 != null) {
                    for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                        NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(((Long) arrayList3.get(i15)).longValue(), 0, i14);
                    }
                }
                int i16 = i14;
                if (tc.a(fyVar)) {
                    tc.z(fyVar, i16, 0, null).j();
                    return;
                }
                return;
            case 5:
                ke0 ke0Var = (ke0) this.b;
                AndroidUtilities.VcardItem vcardItem = (AndroidUtilities.VcardItem) this.c;
                ke0Var.getClass();
                if (i10 == 0) {
                    try {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vcardItem.getValue(false)));
                        if (AndroidUtilities.shouldShowClipboardToast()) {
                            Toast.makeText(ke0Var.r.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
                            return;
                        }
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                return;
            case 6:
                ms0 ms0Var = (ms0) this.b;
                String str6 = (String) this.c;
                if (i10 == 0) {
                    ms0Var.a.R0(str6);
                    return;
                }
                ms0Var.getClass();
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
                d10 d10Var = (d10) this.b;
                String str7 = (String) this.c;
                if (i10 == 0) {
                    h10 h10Var = d10Var.a.v;
                    SpannableStringBuilder[] spannableStringBuilderArr = h10.o0;
                    h10Var.g(str7);
                    return;
                }
                d10Var.getClass();
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
                u40 u40Var = (u40) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                r50 r50Var = u40Var.b;
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                Integer num = (Integer) arrayList4.get(i10);
                int intValue = num.intValue();
                r50Var.u3 = num;
                r50Var.N1(true, true);
                r50Var.u3 = null;
                AndroidUtilities.runOnUIThread(new i8(u40Var, intValue, 16));
                return;
            case 9:
                vm0 vm0Var = (vm0) this.b;
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
                if (!vm0.v1(tL_secureRequiredType.type)) {
                    if (vm0.t1(tL_secureRequiredType.type)) {
                        tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                        tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypeAddress();
                    }
                    vm0Var.E1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                    return;
                }
                tL_secureRequiredType.selfie_required = true;
                tL_secureRequiredType.translation_required = true;
                tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypePersonalDetails();
                tL_secureRequiredType3 = tL_secureRequiredType;
                tL_secureRequiredType = tL_secureRequiredType2;
                vm0Var.E1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                return;
            case 10:
                hy0.a((hy0) this.b, (Context) this.c, i10);
                return;
            case 11:
                a71 a71Var = (a71) this.b;
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.c));
                org.telegram.ui.b.n(R.string.TextCopied, new tc(a71Var.getContainer(), null));
                return;
            case 12:
                ya1 ya1Var = (ya1) this.b;
                f6 f6Var = (f6) this.c;
                ThemeActivity themeActivity = ya1Var.e;
                if (themeActivity.getParentActivity() == null) {
                    return;
                }
                if (i10 == 0) {
                    if (f6Var.B == null) {
                        themeActivity.getMessagesController().saveThemeToServer(f6Var, null);
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, f6Var, null);
                        return;
                    }
                    String str8 = "https://" + themeActivity.getMessagesController().linkPrefix + "/addtheme/" + f6Var.B.slug;
                    themeActivity.showDialog(new dq0(themeActivity.getParentActivity(), null, str8, false, str8, false, null));
                    return;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        b5Var = ((o2) themeActivity).parentLayout;
                        if (b5Var != null) {
                            g6.t(f6Var, true, false);
                            b5Var2 = ((o2) themeActivity).parentLayout;
                            ((ActionBarLayout) b5Var2).U(true, true);
                            new ThemeEditorView().c(themeActivity.getParentActivity(), f6Var);
                            return;
                        }
                        return;
                    }
                    if (i10 == 3) {
                        themeActivity.presentFragment(new vc1(f6Var, null, false));
                        return;
                    }
                    if (themeActivity.getParentActivity() == null) {
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder.a.N = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                    alertDialog$Builder.a.P = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                    alertDialog$Builder.k(LocaleController.getString("Delete", R.string.Delete), new kl0(23, ya1Var, f6Var));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder.a;
                    themeActivity.showDialog(c2Var3);
                    TextView textView = (TextView) c2Var3.d(-1);
                    if (textView != null) {
                        textView.setTextColor(g6.w0(null, g6.q7, false));
                        return;
                    }
                    return;
                }
                if (f6Var.b == null && f6Var.d == null) {
                    StringBuilder sb4 = new StringBuilder();
                    int[] iArr = g6.nl;
                    for (int i17 = 0; i17 < iArr.length; i17++) {
                        sb4.append(e5.i(i17));
                        sb4.append("=");
                        sb4.append(iArr[i17]);
                        sb4.append("\n");
                    }
                    p02 = new File(ApplicationLoader.getFilesDirFixed(), "default_theme.attheme");
                    try {
                        try {
                            try {
                                fileOutputStream = new FileOutputStream(p02);
                            } catch (Throwable th3) {
                                th2 = th3;
                            }
                        } catch (Exception e11) {
                            e = e11;
                        }
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                    try {
                        fileOutputStream.write(AndroidUtilities.getStringBytes(sb4.toString()));
                        fileOutputStream.close();
                    } catch (Exception e13) {
                        e = e13;
                        fileOutputStream2 = fileOutputStream;
                        FileLog.e(e);
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        str = f6Var.a;
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
                        } catch (Exception e14) {
                            FileLog.e(e14);
                            throw th2;
                        }
                    }
                } else {
                    String str9 = f6Var.d;
                    p02 = str9 != null ? g6.p0(str9) : new File(f6Var.b);
                }
                str = f6Var.a;
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
                } catch (Exception e15) {
                    FileLog.e(e15);
                    return;
                }
            default:
                wf.n.a((wf.n) this.b, (Integer[][]) this.c, i10);
                return;
        }
    }

    public /* synthetic */ y1(ArrayList arrayList, fy fyVar) {
        this.a = 4;
        this.c = arrayList;
        this.b = fyVar;
    }
}
