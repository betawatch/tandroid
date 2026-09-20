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
import ki.i0;
import ki.j0;
import ki.m0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.rk;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.kd;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.ce1;
import org.telegram.ui.g81;
import org.telegram.ui.h4;
import org.telegram.ui.hc1;
import org.telegram.ui.i60;
import org.telegram.ui.ja0;
import org.telegram.ui.l50;
import org.telegram.ui.lz0;
import org.telegram.ui.mb;
import org.telegram.ui.o41;
import org.telegram.ui.pn0;
import org.telegram.ui.rv0;
import org.telegram.ui.t10;
import org.telegram.ui.u3;
import org.telegram.ui.uy;
import org.telegram.ui.x10;
import org.telegram.ui.zn;
import pg.j1;
import pg.l1;
import pg.m1;
import w7.a6;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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

    /* JADX WARN: Removed duplicated region for block: B:167:0x03fe  */
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
        d5 d5Var;
        d5 d5Var2;
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
                h4 h4Var = (h4) this.b;
                String str3 = (String) this.c;
                u3 u3Var = h4Var.K;
                if (h4Var.L == null || h4Var.u0[0].c.E == null) {
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
                    String lowerCase = !TextUtils.isEmpty(h4Var.u0[0].c.E.cached_page.url) ? h4Var.u0[0].c.E.cached_page.url.toLowerCase() : h4Var.u0[0].c.E.url.toLowerCase();
                    try {
                        str2 = URLDecoder.decode(str3.substring(lastIndexOf + 1), "UTF-8");
                    } catch (Exception unused) {
                    }
                    if (str3.toLowerCase().contains(lowerCase)) {
                        if (!TextUtils.isEmpty(str2)) {
                            h4Var.V(str2, true);
                            return;
                        } else {
                            h4Var.u0[0].d.h1(u3Var == null ? 0 : 1, u3Var != null ? AndroidUtilities.dp(32.0f) : 0);
                            h4Var.m(null);
                            return;
                        }
                    }
                }
                nf.f.s(h4Var.L, str3);
                return;
            case 2:
                mb mbVar = (mb) this.b;
                String str4 = (String) this.c;
                if (i10 == 0) {
                    nf.f.o(mbVar.a.n.getParentActivity(), str4, true);
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
                xc.a0(znVar).i(LocaleController.formatString(R.string.ExactTextCopied, str5)).j();
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
                if (xc.a(uyVar)) {
                    xc.z(uyVar, i13, 0, null).j();
                    return;
                }
                return;
            case 5:
                xe0 xe0Var = (xe0) this.b;
                AndroidUtilities.VcardItem vcardItem = (AndroidUtilities.VcardItem) this.c;
                xe0Var.getClass();
                if (i10 == 0) {
                    try {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vcardItem.getValue(false)));
                        if (AndroidUtilities.shouldShowClipboardToast()) {
                            Toast.makeText(xe0Var.r.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
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
                i60 i60Var = l50Var.b;
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                Integer num = (Integer) arrayList2.get(i10);
                int intValue = num.intValue();
                i60Var.y3 = num;
                i60Var.N1(true, true);
                i60Var.y3 = null;
                AndroidUtilities.runOnUIThread(new kd(l50Var, intValue, 15));
                return;
            case 9:
                pn0 pn0Var = (pn0) this.b;
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
                if (!pn0.v1(tL_secureRequiredType.type)) {
                    if (pn0.t1(tL_secureRequiredType.type)) {
                        tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                        tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypeAddress();
                    }
                    pn0Var.E1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                    return;
                }
                tL_secureRequiredType.selfie_required = true;
                tL_secureRequiredType.translation_required = true;
                tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypePersonalDetails();
                tL_secureRequiredType3 = tL_secureRequiredType;
                tL_secureRequiredType = tL_secureRequiredType2;
                pn0Var.E1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                return;
            case 10:
                lz0.a((lz0) this.b, (Context) this.c, i10);
                return;
            case 11:
                o41 o41Var = (o41) this.b;
                switch (((ja0) this.c).a) {
                    case 11:
                        a6.b("round_video_output_resolution", i10 == 0 ? m0.b : m0.c);
                        break;
                    case 12:
                        a6.b("round_video_camera_resolution", i0.values()[i10]);
                        break;
                    case 13:
                        a6.b("round_video_frame_rate", i10 == 0 ? j0.b : j0.c);
                        break;
                    default:
                        int i14 = o41.c[i10];
                        if (i14 <= 0) {
                            throw new IllegalArgumentException("Invalid video bitrate");
                        }
                        MessagesController.getGlobalMainSettings().edit().putInt("round_video_video_bitrate", i14).apply();
                        break;
                }
                o41Var.b.l();
                return;
            case 12:
                g81 g81Var = (g81) this.b;
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.c));
                rk.o(R.string.TextCopied, new xc(g81Var.getContainer(), null));
                return;
            case 13:
                hc1 hc1Var = (hc1) this.b;
                i6 i6Var = (i6) this.c;
                ThemeActivity themeActivity = hc1Var.e;
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
                    themeActivity.showDialog(new uq0(themeActivity.getParentActivity(), null, str8, false, str8, false, null));
                    return;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        d5Var = ((n2) themeActivity).parentLayout;
                        if (d5Var != null) {
                            j6.t(i6Var, true, false);
                            d5Var2 = ((n2) themeActivity).parentLayout;
                            ((ActionBarLayout) d5Var2).U(true, true);
                            new ThemeEditorView().c(themeActivity.getParentActivity(), i6Var);
                            return;
                        }
                        return;
                    }
                    if (i10 == 3) {
                        themeActivity.presentFragment(new ce1(i6Var, null, false));
                        return;
                    }
                    if (themeActivity.getParentActivity() == null) {
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                    alertDialog$Builder.a.T = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                    alertDialog$Builder.k(LocaleController.getString("Delete", R.string.Delete), new rv0(14, hc1Var, i6Var));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    b2 b2Var = alertDialog$Builder.a;
                    themeActivity.showDialog(b2Var);
                    TextView textView = (TextView) b2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(j6.w0(null, j6.q7, false));
                        return;
                    }
                    return;
                }
                if (i6Var.b == null && i6Var.d == null) {
                    StringBuilder sb3 = new StringBuilder();
                    int[] iArr = j6.nl;
                    for (int i15 = 0; i15 < iArr.length; i15++) {
                        sb3.append(g5.i(i15));
                        sb3.append("=");
                        sb3.append(iArr[i15]);
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
                        StringBuilder h = v7.j0.h(string, "|");
                        h.append(l1Var.a);
                        sb2 = h.toString();
                    }
                    for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                        StringBuilder h10 = v7.j0.h(sb2, ",");
                        h10.append(Math.round(((j1) arrayList4.get(i16)).a));
                        h10.append(",");
                        h10.append(Math.round(((j1) arrayList4.get(i16)).b));
                        sb2 = h10.toString();
                    }
                    sharedPreferences.edit().putString("moretemplates", sb2).apply();
                    return;
                }
                StringBuilder sb4 = new StringBuilder("[");
                for (int i17 = 0; i17 < arrayList5.size(); i17++) {
                    l1 l1Var2 = (l1) arrayList5.get(i17);
                    if (i17 > 0) {
                        sb4.append(",\n");
                    }
                    sb4.append("\t{\n\t\t\"shape\": ");
                    sb4.append(l1Var2.a);
                    sb4.append(",\n\t\t\"points\": [");
                    for (int i18 = 0; i18 < l1Var2.b.size(); i18++) {
                        if (i18 > 0) {
                            sb4.append(",");
                        }
                        j1 j1Var = (j1) l1Var2.b.get(i18);
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
