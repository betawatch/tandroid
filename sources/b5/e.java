package b5;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import androidx.car.app.hardware.common.CarResultStub;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import j4.i1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import kh.o3;
import o8.l0;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.voip.e2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ba;
import org.telegram.ui.e00;
import org.telegram.ui.gb0;
import org.telegram.ui.hl0;
import org.telegram.ui.i9;
import org.telegram.ui.kl0;
import org.telegram.ui.n00;
import org.telegram.ui.so;
import org.telegram.ui.ts;
import org.telegram.ui.uo;
import org.telegram.ui.wm0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements o, Continuation, b2, nk0, ts, androidx.car.app.utils.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e(Object obj, Object obj2, boolean z10, int i9) {
        this.a = i9;
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

    @Override // org.telegram.ui.ts
    public void b(TLRPC.User user) {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        int[] iArr = (int[]) this.d;
        Pattern pattern = LaunchActivity.x1;
        TLRPC.UserFull userFull = MessagesController.getInstance(launchActivity.K).getUserFull(user.id);
        e2.n(user, this.b, userFull != null && userFull.video_calls_available, launchActivity, userFull, AccountInstance.getInstance(iArr[0]));
    }

    @Override // org.telegram.ui.Components.nk0
    public void c(float f10, float f11, int i9, View view) {
        ChatAttachAlertPhotoLayout.J((ChatAttachAlertPhotoLayout) this.c, this.b, (b6) this.d, view, i9);
    }

    @Override // b5.o
    public l0 e(int i9, i1 i1Var, int[] iArr) {
        r rVar = (r) this.c;
        j jVar = (j) this.d;
        rVar.getClass();
        f fVar = new f(rVar);
        o8.x xVar = o8.z.b;
        o8.l.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i10 = 0;
        int i11 = 0;
        while (i11 < i1Var.a) {
            int i12 = i9;
            i1 i1Var2 = i1Var;
            g gVar = new g(i12, i1Var2, i11, jVar, iArr[i11], this.b, fVar);
            int i13 = i10 + 1;
            if (objArr.length < i13) {
                objArr = Arrays.copyOf(objArr, o8.w.d(objArr.length, i13));
            }
            objArr[i10] = gVar;
            i11++;
            i10 = i13;
            i9 = i12;
            i1Var = i1Var2;
        }
        return o8.z.s(i10, objArr);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(c2 c2Var, int i9) {
        switch (this.a) {
            case 2:
                i9 i9Var = (i9) this.c;
                boolean z10 = this.b;
                boolean[] zArr = (boolean[]) this.d;
                if (z10) {
                    boolean z11 = zArr[0];
                    TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                    tL_messages_deletePhoneCallHistory.revoke = z11;
                    i9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new o3(3, i9Var, z11));
                    i9Var.C.clear();
                    i9Var.D = false;
                    i9Var.F = true;
                    i9Var.B.setVisibility(8);
                    i9Var.d.U2.N(true);
                } else {
                    i9Var.getMessagesController().deleteMessages(new ArrayList<>(i9Var.H), null, null, 0L, 0, zArr[0], 0);
                }
                i9Var.j0(false);
                break;
            case 3:
                ((ba) this.c).a.i0((TLRPC.TL_username) this.d, this.b, true);
                break;
            case 4:
                so soVar = (so) this.c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
                boolean z12 = this.b;
                uo uoVar = soVar.a;
                uoVar.w1(tL_username, z12, true);
                uoVar.W2.U();
                break;
            case 5:
                o2 o2Var = (o2) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                boolean z13 = this.b;
                TLRPC.UserFull userFull = o2Var.getMessagesController().getUserFull(user.id);
                e2.n(user, z13, userFull != null && userFull.video_calls_available, o2Var.getParentActivity(), userFull, o2Var.getAccountInstance());
                break;
            case 6:
            case 8:
            default:
                pf.x xVar = (pf.x) this.c;
                (!this.b ? xVar.k : xVar.j).remove(Long.valueOf(((l41) this.d).x));
                xVar.e.run();
                break;
            case 7:
                n00 n00Var = (n00) this.c;
                e00 e00Var = (e00) this.d;
                boolean z14 = this.b;
                int i10 = e00Var.j;
                if (i10 > 0) {
                    n00Var.y &= ~i10;
                } else {
                    (z14 ? n00Var.B : n00Var.C).remove(Long.valueOf(e00Var.h));
                }
                n00Var.i0();
                n00Var.v0();
                n00Var.h0(true);
                if (z14) {
                    n00Var.m0(1, false);
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
                wm0 wm0Var = (wm0) this.c;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) this.d;
                boolean z16 = this.b;
                wm0Var.y1();
                wm0Var.j1(tL_secureRequiredType, null, null, true, new hl0(wm0Var, 4), new kl0(wm0Var, 6), z16);
                break;
        }
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return (e6.b.d() && ((Integer) task.getResult()).intValue() == 402) ? com.google.firebase.messaging.i.a((Context) this.c, (Intent) this.d, this.b).continueWith(new gb0(1), new a9.b(14)) : task;
    }

    public /* synthetic */ e(Object obj, boolean z10, Object obj2, int i9) {
        this.a = i9;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }

    public /* synthetic */ e(String str, o2 o2Var, boolean z10) {
        this.a = 9;
        this.b = z10;
        this.c = str;
        this.d = o2Var;
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ void g0(View view, float f10, float f11) {
    }
}
