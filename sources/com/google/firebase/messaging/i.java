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
import l4.j1;
import nh.l3;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.voip.h2;
import org.telegram.ui.Components.w41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.aa;
import org.telegram.ui.el0;
import org.telegram.ui.g00;
import org.telegram.ui.h9;
import org.telegram.ui.hl0;
import org.telegram.ui.ib0;
import org.telegram.ui.p00;
import org.telegram.ui.ss;
import org.telegram.ui.vm0;
import org.telegram.ui.vo;
import org.telegram.ui.xo;
import q8.l0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Continuation, d5.m, b2, al0, ss, androidx.car.app.utils.d {
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

    @Override // androidx.car.app.utils.d
    public Object a() {
        Object lambda$onCarHardwareResult$0;
        lambda$onCarHardwareResult$0 = ((CarResultStub) this.c).lambda$onCarHardwareResult$0(this.b, (w.b) this.d);
        return lambda$onCarHardwareResult$0;
    }

    @Override // org.telegram.ui.Components.al0
    public void b(float f9, float f10, int i10, View view) {
        ChatAttachAlertPhotoLayout.J((ChatAttachAlertPhotoLayout) this.c, this.b, (c6) this.d, view, i10);
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // d5.m
    public l0 c(int i10, j1 j1Var, int[] iArr) {
        d5.p pVar = (d5.p) this.c;
        d5.h hVar = (d5.h) this.d;
        pVar.getClass();
        d5.d dVar = new d5.d(pVar);
        q8.x xVar = q8.z.b;
        q8.l.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i11 = 0;
        int i12 = 0;
        while (i12 < j1Var.a) {
            int i13 = i10;
            j1 j1Var2 = j1Var;
            d5.e eVar = new d5.e(i13, j1Var2, i12, hVar, iArr[i12], this.b, dVar);
            int i14 = i11 + 1;
            if (objArr.length < i14) {
                objArr = Arrays.copyOf(objArr, q8.w.d(objArr.length, i14));
            }
            objArr[i11] = eVar;
            i12++;
            i11 = i14;
            i10 = i13;
            j1Var = j1Var2;
        }
        return q8.z.s(i11, objArr);
    }

    @Override // org.telegram.ui.ss
    public void d(TLRPC.User user) {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        int[] iArr = (int[]) this.d;
        Pattern pattern = LaunchActivity.x1;
        TLRPC.UserFull userFull = MessagesController.getInstance(launchActivity.K).getUserFull(user.id);
        h2.n(user, this.b, userFull != null && userFull.video_calls_available, launchActivity, userFull, AccountInstance.getInstance(iArr[0]));
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(c2 c2Var, int i10) {
        switch (this.a) {
            case 2:
                h9 h9Var = (h9) this.c;
                boolean z10 = this.b;
                boolean[] zArr = (boolean[]) this.d;
                if (z10) {
                    boolean z11 = zArr[0];
                    TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                    tL_messages_deletePhoneCallHistory.revoke = z11;
                    h9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new l3(3, h9Var, z11));
                    h9Var.C.clear();
                    h9Var.D = false;
                    h9Var.F = true;
                    h9Var.B.setVisibility(8);
                    h9Var.d.U2.N(true);
                } else {
                    h9Var.getMessagesController().deleteMessages(new ArrayList<>(h9Var.H), null, null, 0L, 0, zArr[0], 0);
                }
                h9Var.k0(false);
                break;
            case 3:
                ((aa) this.c).a.j0((TLRPC.TL_username) this.d, this.b, true);
                break;
            case 4:
                vo voVar = (vo) this.c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
                boolean z12 = this.b;
                xo xoVar = voVar.a;
                xoVar.w1(tL_username, z12, true);
                xoVar.W2.V();
                break;
            case 5:
                o2 o2Var = (o2) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                boolean z13 = this.b;
                TLRPC.UserFull userFull = o2Var.getMessagesController().getUserFull(user.id);
                h2.n(user, z13, userFull != null && userFull.video_calls_available, o2Var.getParentActivity(), userFull, o2Var.getAccountInstance());
                break;
            case 6:
            case 8:
            default:
                sf.w wVar = (sf.w) this.c;
                (!this.b ? wVar.k : wVar.j).remove(Long.valueOf(((w41) this.d).x));
                wVar.e.run();
                break;
            case 7:
                p00 p00Var = (p00) this.c;
                g00 g00Var = (g00) this.d;
                boolean z14 = this.b;
                int i11 = g00Var.j;
                if (i11 > 0) {
                    p00Var.y &= ~i11;
                } else {
                    (z14 ? p00Var.B : p00Var.C).remove(Long.valueOf(g00Var.h));
                }
                p00Var.j0();
                p00Var.w0();
                p00Var.i0(true);
                if (z14) {
                    p00Var.n0(1, false);
                    break;
                }
                break;
            case 9:
                boolean z15 = this.b;
                String str = (String) this.c;
                o2 o2Var2 = (o2) this.d;
                try {
                    PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                    Locale locale = Locale.US;
                    String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                    Intent intent = new Intent("android.intent.action.SENDTO");
                    intent.setData(Uri.parse("mailto:"));
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{z15 ? "recover@telegram.org" : "login@stel.com"});
                    if (z15) {
                        intent.putExtra("android.intent.extra.SUBJECT", "Banned phone number: " + str);
                        intent.putExtra("android.intent.extra.TEXT", "I'm trying to use my mobile phone number: " + str + "\nBut Telegram says it's banned. Please help.\n\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault());
                    } else {
                        intent.putExtra("android.intent.extra.SUBJECT", "Invalid phone number: " + str);
                        intent.putExtra("android.intent.extra.TEXT", "I'm trying to use my mobile phone number: " + str + "\nBut Telegram says it's invalid. Please help.\n\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault());
                    }
                    o2Var2.getParentActivity().startActivity(Intent.createChooser(intent, "Send email..."));
                    break;
                } catch (Exception unused) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var2.getParentActivity());
                    alertDialog$Builder.a.N = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.a.P = LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled);
                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
                    o2Var2.showDialog(alertDialog$Builder.a);
                    return;
                }
            case 10:
                vm0 vm0Var = (vm0) this.c;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) this.d;
                boolean z16 = this.b;
                vm0Var.y1();
                vm0Var.j1(tL_secureRequiredType, null, null, true, new el0(vm0Var, 4), new hl0(vm0Var, 6), z16);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return (g6.b.d() && ((Integer) task.getResult()).intValue() == 402) ? j.a((Context) this.c, (Intent) this.d, this.b).continueWith(new ib0(1), new a9.f(23)) : task;
    }

    public /* synthetic */ i(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }

    public /* synthetic */ i(String str, o2 o2Var, boolean z10) {
        this.a = 9;
        this.b = z10;
        this.c = str;
        this.d = o2Var;
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void o0(View view, float f9, float f10) {
    }
}
