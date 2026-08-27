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
import lh.n3;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.voip.e2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ca;
import org.telegram.ui.h00;
import org.telegram.ui.hl0;
import org.telegram.ui.j9;
import org.telegram.ui.kb0;
import org.telegram.ui.kl0;
import org.telegram.ui.q00;
import org.telegram.ui.uo;
import org.telegram.ui.us;
import org.telegram.ui.wo;
import org.telegram.ui.xm0;
import p8.l0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements n, Continuation, a2, qk0, us, androidx.car.app.utils.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
    }

    @Override // org.telegram.ui.us
    public void a(TLRPC.User user) {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        int[] iArr = (int[]) this.d;
        Pattern pattern = LaunchActivity.x1;
        TLRPC.UserFull userFull = MessagesController.getInstance(launchActivity.K).getUserFull(user.id);
        e2.n(user, this.b, userFull != null && userFull.video_calls_available, launchActivity, userFull, AccountInstance.getInstance(iArr[0]));
    }

    @Override // androidx.car.app.utils.c
    public Object b() {
        Object lambda$onCarHardwareResult$0;
        lambda$onCarHardwareResult$0 = ((CarResultStub) this.c).lambda$onCarHardwareResult$0(this.b, (w.b) this.d);
        return lambda$onCarHardwareResult$0;
    }

    @Override // org.telegram.ui.Components.qk0
    public void c(float f10, float f11, int i10, View view) {
        ChatAttachAlertPhotoLayout.K((ChatAttachAlertPhotoLayout) this.c, this.b, (c6) this.d, view, i10);
    }

    @Override // b5.n
    public l0 d(int i10, i1 i1Var, int[] iArr) {
        q qVar = (q) this.c;
        i iVar = (i) this.d;
        qVar.getClass();
        e eVar = new e(qVar);
        p8.x xVar = p8.z.b;
        p8.l.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i11 = 0;
        int i12 = 0;
        while (i12 < i1Var.a) {
            int i13 = i10;
            i1 i1Var2 = i1Var;
            f fVar = new f(i13, i1Var2, i12, iVar, iArr[i12], this.b, eVar);
            int i14 = i11 + 1;
            if (objArr.length < i14) {
                objArr = Arrays.copyOf(objArr, p8.w.d(objArr.length, i14));
            }
            objArr[i11] = fVar;
            i12++;
            i11 = i14;
            i10 = i13;
            i1Var = i1Var2;
        }
        return p8.z.s(i11, objArr);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(b2 b2Var, int i10) {
        switch (this.a) {
            case 2:
                j9 j9Var = (j9) this.c;
                boolean z10 = this.b;
                boolean[] zArr = (boolean[]) this.d;
                if (z10) {
                    boolean z11 = zArr[0];
                    TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                    tL_messages_deletePhoneCallHistory.revoke = z11;
                    j9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new n3(3, j9Var, z11));
                    j9Var.C.clear();
                    j9Var.D = false;
                    j9Var.F = true;
                    j9Var.B.setVisibility(8);
                    j9Var.d.U2.N(true);
                } else {
                    j9Var.getMessagesController().deleteMessages(new ArrayList<>(j9Var.H), null, null, 0L, 0, zArr[0], 0);
                }
                j9Var.k0(false);
                break;
            case 3:
                ((ca) this.c).a.j0((TLRPC.TL_username) this.d, this.b, true);
                break;
            case 4:
                uo uoVar = (uo) this.c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
                boolean z12 = this.b;
                wo woVar = uoVar.a;
                woVar.w1(tL_username, z12, true);
                woVar.W2.V();
                break;
            case 5:
                n2 n2Var = (n2) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                boolean z13 = this.b;
                TLRPC.UserFull userFull = n2Var.getMessagesController().getUserFull(user.id);
                e2.n(user, z13, userFull != null && userFull.video_calls_available, n2Var.getParentActivity(), userFull, n2Var.getAccountInstance());
                break;
            case 6:
            case 8:
            default:
                qf.x xVar = (qf.x) this.c;
                (!this.b ? xVar.k : xVar.j).remove(Long.valueOf(((n41) this.d).x));
                xVar.e.run();
                break;
            case 7:
                q00 q00Var = (q00) this.c;
                h00 h00Var = (h00) this.d;
                boolean z14 = this.b;
                int i11 = h00Var.j;
                if (i11 > 0) {
                    q00Var.y &= ~i11;
                } else {
                    (z14 ? q00Var.B : q00Var.C).remove(Long.valueOf(h00Var.h));
                }
                q00Var.j0();
                q00Var.w0();
                q00Var.i0(true);
                if (z14) {
                    q00Var.n0(1, false);
                    break;
                }
                break;
            case 9:
                boolean z15 = this.b;
                String str = (String) this.c;
                n2 n2Var2 = (n2) this.d;
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
                    n2Var2.getParentActivity().startActivity(Intent.createChooser(intent, "Send email..."));
                    break;
                } catch (Exception unused) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var2.getParentActivity());
                    alertDialog$Builder.a.N = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.a.P = LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled);
                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
                    n2Var2.showDialog(alertDialog$Builder.a);
                    return;
                }
            case 10:
                xm0 xm0Var = (xm0) this.c;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) this.d;
                boolean z16 = this.b;
                xm0Var.y1();
                xm0Var.j1(tL_secureRequiredType, null, null, true, new hl0(xm0Var, 4), new kl0(xm0Var, 6), z16);
                break;
        }
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return (f6.b.d() && ((Integer) task.getResult()).intValue() == 402) ? com.google.firebase.messaging.i.a((Context) this.c, (Intent) this.d, this.b).continueWith(new kb0(1), new a9.m(20)) : task;
    }

    public /* synthetic */ d(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }

    public /* synthetic */ d(String str, n2 n2Var, boolean z10) {
        this.a = 9;
        this.b = z10;
        this.c = str;
        this.d = n2Var;
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ void c0(View view, float f10, float f11) {
    }
}
