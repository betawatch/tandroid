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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.voip.f2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bt;
import org.telegram.ui.c10;
import org.telegram.ui.cp;
import org.telegram.ui.ep;
import org.telegram.ui.fn0;
import org.telegram.ui.ga;
import org.telegram.ui.n9;
import org.telegram.ui.pl0;
import org.telegram.ui.sl0;
import org.telegram.ui.t00;
import org.telegram.ui.tb0;
import s8.i0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Continuation, f5.m, c2, il0, bt, androidx.car.app.utils.d {
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

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ boolean Z0(View view) {
        return false;
    }

    @Override // androidx.car.app.utils.d
    public Object a() {
        Object lambda$onCarHardwareResult$0;
        lambda$onCarHardwareResult$0 = ((CarResultStub) this.c).lambda$onCarHardwareResult$0(this.b, (w.b) this.d);
        return lambda$onCarHardwareResult$0;
    }

    @Override // org.telegram.ui.bt
    public void b(TLRPC.User user) {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        int[] iArr = (int[]) this.d;
        Pattern pattern = LaunchActivity.y1;
        TLRPC.UserFull userFull = MessagesController.getInstance(launchActivity.L).getUserFull(user.id);
        f2.m(user, this.b, userFull != null && userFull.video_calls_available, launchActivity, userFull, AccountInstance.getInstance(iArr[0]));
    }

    @Override // org.telegram.ui.Components.il0
    public void c(float f10, float f11, int i10, View view) {
        ChatAttachAlertPhotoLayout.J((ChatAttachAlertPhotoLayout) this.c, this.b, (f6) this.d, view, i10);
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
    public void l(d2 d2Var, int i10) {
        switch (this.a) {
            case 2:
                n9 n9Var = (n9) this.c;
                boolean z4 = this.b;
                boolean[] zArr = (boolean[]) this.d;
                if (z4) {
                    boolean z10 = zArr[0];
                    TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                    tL_messages_deletePhoneCallHistory.revoke = z10;
                    n9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new zd(2, n9Var, z10));
                    n9Var.D.clear();
                    n9Var.E = false;
                    n9Var.G = true;
                    n9Var.C.setVisibility(8);
                    n9Var.d.V2.N(true);
                } else {
                    n9Var.getMessagesController().deleteMessages(new ArrayList<>(n9Var.I), null, null, 0L, 0, zArr[0], 0);
                }
                n9Var.k0(false);
                break;
            case 3:
                ((ga) this.c).a.j0((TLRPC.TL_username) this.d, this.b, true);
                break;
            case 4:
                cp cpVar = (cp) this.c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
                boolean z11 = this.b;
                ep epVar = cpVar.a;
                epVar.v1(tL_username, z11, true);
                epVar.X2.V();
                break;
            case 5:
                p2 p2Var = (p2) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                boolean z12 = this.b;
                TLRPC.UserFull userFull = p2Var.getMessagesController().getUserFull(user.id);
                f2.m(user, z12, userFull != null && userFull.video_calls_available, p2Var.getParentActivity(), userFull, p2Var.getAccountInstance());
                break;
            case 6:
            case 8:
            default:
                uf.v vVar = (uf.v) this.c;
                (!this.b ? vVar.k : vVar.j).remove(Long.valueOf(((i51) this.d).x));
                vVar.e.run();
                break;
            case 7:
                c10 c10Var = (c10) this.c;
                t00 t00Var = (t00) this.d;
                boolean z13 = this.b;
                int i11 = t00Var.j;
                if (i11 > 0) {
                    c10Var.y &= ~i11;
                } else {
                    (z13 ? c10Var.C : c10Var.D).remove(Long.valueOf(t00Var.h));
                }
                c10Var.j0();
                c10Var.w0();
                c10Var.i0(true);
                if (z13) {
                    c10Var.n0(1, false);
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
        return (i6.b.d() && ((Integer) task.getResult()).intValue() == 402) ? j.a((Context) this.c, (Intent) this.d, this.b).continueWith(new tb0(1), new af.a(16)) : task;
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

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ void n0(View view, float f10, float f11) {
    }
}
