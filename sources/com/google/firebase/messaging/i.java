package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import androidx.car.app.hardware.common.CarResultStub;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import o4.s0;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.zd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.voip.g2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ap;
import org.telegram.ui.at;
import org.telegram.ui.b10;
import org.telegram.ui.dp;
import org.telegram.ui.ea;
import org.telegram.ui.fn0;
import org.telegram.ui.l9;
import org.telegram.ui.pl0;
import org.telegram.ui.s00;
import org.telegram.ui.sb0;
import org.telegram.ui.sl0;
import s8.i0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Continuation, f5.m, c2, jl0, at, androidx.car.app.utils.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i(Object obj, Object obj2, boolean z4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z4;
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ boolean Y0(View view) {
        return false;
    }

    @Override // androidx.car.app.utils.d
    public Object a() {
        Object lambda$onCarHardwareResult$0;
        lambda$onCarHardwareResult$0 = ((CarResultStub) this.c).lambda$onCarHardwareResult$0(this.b, (w.b) this.d);
        return lambda$onCarHardwareResult$0;
    }

    @Override // org.telegram.ui.at
    public void b(TLRPC.User user) {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        int[] iArr = (int[]) this.d;
        Pattern pattern = LaunchActivity.y1;
        TLRPC.UserFull userFull = MessagesController.getInstance(launchActivity.L).getUserFull(user.id);
        g2.m(user, this.b, userFull != null && userFull.video_calls_available, launchActivity, userFull, AccountInstance.getInstance(iArr[0]));
    }

    @Override // org.telegram.ui.Components.jl0
    public void c(float f10, float f11, int i10, View view) {
        ChatAttachAlertPhotoLayout.J((ChatAttachAlertPhotoLayout) this.c, this.b, (g6) this.d, view, i10);
    }

    @Override // f5.m
    public i0 e(int i10, s0 s0Var, int[] iArr) {
        Object[] objArr;
        f5.p pVar = (f5.p) this.c;
        f5.h hVar = (f5.h) this.d;
        pVar.getClass();
        f5.d dVar = new f5.d(pVar);
        s8.t tVar = s8.v.b;
        s8.l.c(4, "initialCapacity");
        Object[] objArr2 = new Object[4];
        int i11 = 0;
        int i12 = 0;
        boolean z4 = false;
        while (i11 < s0Var.a) {
            int i13 = i10;
            s0 s0Var2 = s0Var;
            f5.e eVar = new f5.e(i13, s0Var2, i11, hVar, iArr[i11], this.b, dVar);
            int i14 = i12 + 1;
            if (objArr2.length < i14) {
                objArr = Arrays.copyOf(objArr2, com.google.android.gms.common.api.internal.w.g(objArr2.length, i14));
            } else if (z4) {
                objArr = (Object[]) objArr2.clone();
            } else {
                objArr2[i12] = eVar;
                i11++;
                i12++;
                i10 = i13;
                s0Var = s0Var2;
            }
            objArr2 = objArr;
            z4 = false;
            objArr2[i12] = eVar;
            i11++;
            i12++;
            i10 = i13;
            s0Var = s0Var2;
        }
        return s8.v.s(i12, objArr2);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(d2 d2Var, int i10) {
        switch (this.a) {
            case 2:
                l9 l9Var = (l9) this.c;
                boolean z4 = this.b;
                boolean[] zArr = (boolean[]) this.d;
                if (z4) {
                    boolean z10 = zArr[0];
                    TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                    tL_messages_deletePhoneCallHistory.revoke = z10;
                    l9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new zd(2, l9Var, z10));
                    l9Var.D.clear();
                    l9Var.E = false;
                    l9Var.G = true;
                    l9Var.C.setVisibility(8);
                    l9Var.d.V2.N(true);
                } else {
                    l9Var.getMessagesController().deleteMessages(new ArrayList<>(l9Var.I), null, null, 0L, 0, zArr[0], 0);
                }
                l9Var.k0(false);
                break;
            case 3:
                ((ea) this.c).a.j0((TLRPC.TL_username) this.d, this.b, true);
                break;
            case 4:
                ap apVar = (ap) this.c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
                boolean z11 = this.b;
                dp dpVar = apVar.a;
                dpVar.v1(tL_username, z11, true);
                dpVar.X2.V();
                break;
            case 5:
                p2 p2Var = (p2) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                boolean z12 = this.b;
                TLRPC.UserFull userFull = p2Var.getMessagesController().getUserFull(user.id);
                g2.m(user, z12, userFull != null && userFull.video_calls_available, p2Var.getParentActivity(), userFull, p2Var.getAccountInstance());
                break;
            case 6:
            case 8:
            default:
                vf.v vVar = (vf.v) this.c;
                (!this.b ? vVar.k : vVar.j).remove(Long.valueOf(((h51) this.d).x));
                vVar.e.run();
                break;
            case 7:
                b10 b10Var = (b10) this.c;
                s00 s00Var = (s00) this.d;
                boolean z13 = this.b;
                int i11 = s00Var.j;
                if (i11 > 0) {
                    b10Var.y &= ~i11;
                } else {
                    (z13 ? b10Var.C : b10Var.D).remove(Long.valueOf(s00Var.h));
                }
                b10Var.j0();
                b10Var.w0();
                b10Var.i0(true);
                if (z13) {
                    b10Var.n0(1, false);
                    break;
                }
                break;
            case 9:
                boolean z14 = this.b;
                String str = (String) this.c;
                p2 p2Var2 = (p2) this.d;
                try {
                    PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                    Locale locale = Locale.US;
                    String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                    Intent intent = new Intent("android.intent.action.SENDTO");
                    intent.setData(Uri.parse("mailto:"));
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{z14 ? "recover@telegram.org" : "login@stel.com"});
                    if (z14) {
                        intent.putExtra("android.intent.extra.SUBJECT", "Banned phone number: " + str);
                        intent.putExtra("android.intent.extra.TEXT", "I'm trying to use my mobile phone number: " + str + "\nBut Telegram says it's banned. Please help.\n\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault());
                    } else {
                        intent.putExtra("android.intent.extra.SUBJECT", "Invalid phone number: " + str);
                        intent.putExtra("android.intent.extra.TEXT", "I'm trying to use my mobile phone number: " + str + "\nBut Telegram says it's invalid. Please help.\n\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault());
                    }
                    p2Var2.getParentActivity().startActivity(Intent.createChooser(intent, "Send email..."));
                    break;
                } catch (Exception unused) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var2.getParentActivity());
                    alertDialog$Builder.a.O = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.a.Q = LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled);
                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
                    p2Var2.showDialog(alertDialog$Builder.a);
                    return;
                }
            case 10:
                fn0 fn0Var = (fn0) this.c;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) this.d;
                boolean z15 = this.b;
                fn0Var.y1();
                fn0Var.j1(tL_secureRequiredType, null, null, true, new pl0(fn0Var, 4), new sl0(fn0Var, 6), z15);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return (i6.b.d() && ((Integer) task.getResult()).intValue() == 402) ? j.a((Context) this.c, (Intent) this.d, this.b).continueWith(new sb0(1), new androidx.emoji2.text.w(10)) : task;
    }

    public /* synthetic */ i(Object obj, boolean z4, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z4;
        this.d = obj2;
    }

    public /* synthetic */ i(String str, p2 p2Var, boolean z4) {
        this.a = 9;
        this.b = z4;
        this.c = str;
        this.d = p2Var;
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
