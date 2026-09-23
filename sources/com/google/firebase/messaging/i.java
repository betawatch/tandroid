package com.google.firebase.messaging;

import ai.w1;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import androidx.car.app.hardware.common.CarResultStub;
import ci.t3;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import e9.i0;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;
import m4.k0;
import m4.l0;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.voip.f2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c10;
import org.telegram.ui.dp;
import org.telegram.ui.fa;
import org.telegram.ui.fp;
import org.telegram.ui.in0;
import org.telegram.ui.k9;
import org.telegram.ui.rl0;
import org.telegram.ui.t00;
import org.telegram.ui.ul0;
import org.telegram.ui.zs;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Continuation, a2, k0, bl0, zs, androidx.car.app.utils.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
    }

    @Override // androidx.car.app.utils.a
    public Object a() {
        Object lambda$onCarHardwareResult$0;
        lambda$onCarHardwareResult$0 = ((CarResultStub) this.c).lambda$onCarHardwareResult$0(this.b, (w.b) this.d);
        return lambda$onCarHardwareResult$0;
    }

    @Override // org.telegram.ui.zs
    public void b(TLRPC.User user) {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        int[] iArr = (int[]) this.d;
        Pattern pattern = LaunchActivity.B1;
        TLRPC.UserFull userFull = MessagesController.getInstance(launchActivity.O).getUserFull(user.id);
        f2.m(user, this.b, userFull != null && userFull.video_calls_available, launchActivity, userFull, AccountInstance.getInstance(iArr[0]));
    }

    @Override // org.telegram.ui.Components.bl0
    public void c(float f7, float f10, int i10, View view) {
        ChatAttachAlertPhotoLayout.K((ChatAttachAlertPhotoLayout) this.c, this.b, (d6) this.d, view, i10);
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                hg.c0 c0Var = (hg.c0) this.c;
                (!this.b ? c0Var.k : c0Var.j).remove(Long.valueOf(((h51) this.d).x));
                c0Var.e.run();
                break;
            case 2:
            case 7:
            case 9:
            default:
                in0 in0Var = (in0) this.c;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) this.d;
                boolean z10 = this.b;
                in0Var.y1();
                in0Var.j1(tL_secureRequiredType, null, null, true, new rl0(in0Var, 4), new ul0(in0Var, 6), z10);
                break;
            case 3:
                k9 k9Var = (k9) this.c;
                boolean z11 = this.b;
                boolean[] zArr = (boolean[]) this.d;
                if (z11) {
                    boolean z12 = zArr[0];
                    TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                    tL_messages_deletePhoneCallHistory.revoke = z12;
                    k9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new t3(3, k9Var, z12));
                    k9Var.G.clear();
                    k9Var.H = false;
                    k9Var.J = true;
                    k9Var.F.setVisibility(8);
                    k9Var.d.Y2.N(true);
                } else {
                    k9Var.getMessagesController().deleteMessages(new ArrayList<>(k9Var.L), null, null, 0L, 0, zArr[0], 0);
                }
                k9Var.k0(false);
                break;
            case 4:
                ((fa) this.c).a.j0((TLRPC.TL_username) this.d, this.b, true);
                break;
            case 5:
                dp dpVar = (dp) this.c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
                boolean z13 = this.b;
                fp fpVar = dpVar.a;
                fpVar.w1(tL_username, z13, true);
                fpVar.a3.V();
                break;
            case 6:
                n2 n2Var = (n2) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                boolean z14 = this.b;
                TLRPC.UserFull userFull = n2Var.getMessagesController().getUserFull(user.id);
                f2.m(user, z14, userFull != null && userFull.video_calls_available, n2Var.getParentActivity(), userFull, n2Var.getAccountInstance());
                break;
            case 8:
                c10 c10Var = (c10) this.c;
                t00 t00Var = (t00) this.d;
                boolean z15 = this.b;
                int i11 = t00Var.j;
                if (i11 > 0) {
                    c10Var.y &= ~i11;
                } else {
                    (z15 ? c10Var.F : c10Var.G).remove(Long.valueOf(t00Var.h));
                }
                c10Var.j0();
                c10Var.w0();
                c10Var.i0(true);
                if (z15) {
                    c10Var.n0(1, false);
                    break;
                }
                break;
            case 10:
                boolean z16 = this.b;
                String str = (String) this.c;
                n2 n2Var2 = (n2) this.d;
                try {
                    PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                    Locale locale = Locale.US;
                    String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                    Intent intent = new Intent("android.intent.action.SENDTO");
                    intent.setData(Uri.parse("mailto:"));
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{z16 ? "recover@telegram.org" : "login@stel.com"});
                    if (z16) {
                        intent.putExtra("android.intent.extra.SUBJECT", "Banned phone number: " + str);
                        intent.putExtra("android.intent.extra.TEXT", "I'm trying to use my mobile phone number: " + str + "\nBut Telegram says it's banned. Please help.\n\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault());
                    } else {
                        intent.putExtra("android.intent.extra.SUBJECT", "Invalid phone number: " + str);
                        intent.putExtra("android.intent.extra.TEXT", "I'm trying to use my mobile phone number: " + str + "\nBut Telegram says it's invalid. Please help.\n\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault());
                    }
                    n2Var2.getParentActivity().startActivity(Intent.createChooser(intent, "Send email..."));
                    break;
                } catch (Exception unused) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var2.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.a.T = LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled);
                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
                    n2Var2.showDialog(alertDialog$Builder.a);
                    return;
                }
        }
    }

    @Override // m4.k0
    public void g(m4.r rVar) {
        l0 l0Var = (l0) this.c;
        i9.c0 q6 = l0Var.g.q(rVar, i0.z((b2.k0) this.d), -1, -9223372036854775807L);
        q6.a(new i9.s(0, q6, new androidx.activity.n(l0Var, rVar, this.b, 3)), i9.q.a);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return (u6.b.d() && ((Integer) task.getResult()).intValue() == 402) ? j.a((Context) this.c, (Intent) this.d, this.b).continueWith(new a3.b(2), new w1(25)) : task;
    }

    public /* synthetic */ i(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }

    public /* synthetic */ i(String str, n2 n2Var, boolean z10) {
        this.a = 10;
        this.b = z10;
        this.c = str;
        this.d = n2Var;
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
