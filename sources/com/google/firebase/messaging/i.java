package com.google.firebase.messaging;

import ai.w1;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import androidx.car.app.hardware.common.CarResultStub;
import ci.s3;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import ii.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Pattern;
import m4.k0;
import m4.l0;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.fm0;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.voip.f2;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.x20;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.ym;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bm0;
import org.telegram.ui.bt;
import org.telegram.ui.f10;
import org.telegram.ui.fp;
import org.telegram.ui.ga;
import org.telegram.ui.hp;
import org.telegram.ui.j9;
import org.telegram.ui.nn0;
import org.telegram.ui.w00;
import org.telegram.ui.yl0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Continuation, a2, k0, fm0, bt, androidx.car.app.utils.a {
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

    @Override // org.telegram.ui.Components.fm0
    public /* synthetic */ boolean Y0(View view) {
        return false;
    }

    @Override // androidx.car.app.utils.a
    public Object a() {
        Object lambda$onCarHardwareResult$0;
        lambda$onCarHardwareResult$0 = ((CarResultStub) this.c).lambda$onCarHardwareResult$0(this.b, (w.b) this.d);
        return lambda$onCarHardwareResult$0;
    }

    @Override // org.telegram.ui.bt
    public void b(TLRPC.User user) {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        int[] iArr = (int[]) this.d;
        Pattern pattern = LaunchActivity.B1;
        TLRPC.UserFull userFull = MessagesController.getInstance(launchActivity.O).getUserFull(user.id);
        f2.m(user, this.b, userFull != null && userFull.video_calls_available, launchActivity, userFull, AccountInstance.getInstance(iArr[0]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0159, code lost:
    
        if (r7.W != false) goto L91;
     */
    @Override // org.telegram.ui.Components.fm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(float f7, float f10, int i10, View view) {
        int i11 = i10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
        e6 e6Var = (e6) this.d;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.t1;
        HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
        yi yiVar = chatAttachAlertPhotoLayout.b;
        if (chatAttachAlertPhotoLayout.v0) {
            boolean z10 = yiVar.V;
            n2 n2Var = yiVar.f0;
            if (z10) {
                return;
            }
            n2 R = n2Var == null ? LaunchActivity.R() : n2Var;
            if (R == null || (view instanceof x20)) {
                return;
            }
            int i12 = Build.VERSION.SDK_INT;
            ym ymVar = chatAttachAlertPhotoLayout.G;
            try {
                if (ymVar.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0 && i11 == 0 && chatAttachAlertPhotoLayout.O0) {
                    R.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                    return;
                }
                int i13 = 4;
                if (chatAttachAlertPhotoLayout.P0) {
                    if (i12 >= 33) {
                        R.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                        return;
                    } else {
                        R.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                        return;
                    }
                }
                boolean z11 = ymVar.f;
                if (z11 && i11 == chatAttachAlertPhotoLayout.M0) {
                    chatAttachAlertPhotoLayout.i0();
                    return;
                }
                boolean z12 = this.b;
                if (i11 == 0 && z12 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                    chatAttachAlertPhotoLayout.i0();
                    return;
                }
                if (z11 && i11 > chatAttachAlertPhotoLayout.M0) {
                    i11--;
                }
                if (chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0 && z12) {
                    i11--;
                }
                zn znVar = null;
                if (chatAttachAlertPhotoLayout.g1) {
                    if (i11 == 0) {
                        if (!(view instanceof i9)) {
                            return;
                        }
                        chatAttachAlertPhotoLayout.r0((i9) view, null, 0L);
                        yiVar.dismiss();
                    }
                    i11--;
                }
                ArrayList<Object> allPhotosArray = chatAttachAlertPhotoLayout.getAllPhotosArray();
                if (i11 < 0 || i11 >= allPhotosArray.size()) {
                    return;
                }
                wi wiVar = yiVar.c2;
                if (wiVar != null && wiVar.Y1() && (allPhotosArray.get(i11) instanceof MediaController.PhotoEntry)) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) allPhotosArray.get(i11);
                    hashMap.clear();
                    if (photoEntry != null) {
                        chatAttachAlertPhotoLayout.Q(photoEntry, -1);
                    }
                    yiVar.a1();
                    yiVar.c2.I1(7, true, true, 0, 0, 0L, yiVar.u1(), false, 0L);
                    hashMap.clear();
                    ChatAttachAlertPhotoLayout.r1.clear();
                    arrayList.clear();
                    hashMap.clear();
                    return;
                }
                PhotoViewer.t1().K2(null, R, e6Var);
                PhotoViewer.t1().L2(yiVar);
                PhotoViewer t12 = PhotoViewer.t1();
                int i14 = yiVar.V1;
                boolean z13 = yiVar.W1;
                t12.h = i14;
                t12.n = z13;
                if (yiVar.F && yiVar.G) {
                    i13 = 11;
                    if (n2Var instanceof zn) {
                        znVar = (zn) n2Var;
                    }
                } else if (yiVar.T0 != 0) {
                    i13 = 1;
                } else {
                    if (n2Var instanceof zn) {
                        znVar = (zn) n2Var;
                    }
                    i13 = 0;
                }
                if (!yiVar.c2.i0()) {
                    AndroidUtilities.hideKeyboard(R.getFragmentView().findFocus());
                    AndroidUtilities.hideKeyboard(yiVar.getContainer().findFocus());
                }
                if (hashMap.size() > 0 && arrayList.size() > 0) {
                    Object obj = hashMap.get(arrayList.get(0));
                    if (obj instanceof MediaController.PhotoEntry) {
                        ((MediaController.PhotoEntry) obj).caption = yiVar.o1().getText();
                    }
                    if (obj instanceof MediaController.SearchImage) {
                        ((MediaController.SearchImage) obj).caption = yiVar.o1().getText();
                    }
                }
                if (yiVar.Q != null) {
                    yiVar.Q.e = allPhotosArray.get(i11) instanceof MediaController.PhotoEntry ? ((MediaController.PhotoEntry) allPhotosArray.get(i11)).isVideo : false;
                }
                boolean z14 = (allPhotosArray.get(i11) instanceof MediaController.PhotoEntry) && ((MediaController.PhotoEntry) allPhotosArray.get(i11)).hasSpoiler;
                Object obj2 = allPhotosArray.get(i11);
                if ((obj2 instanceof MediaController.PhotoEntry) && chatAttachAlertPhotoLayout.X((MediaController.PhotoEntry) obj2)) {
                    return;
                }
                if (z14) {
                    chatAttachAlertPhotoLayout.p0(i11, false);
                }
                AndroidUtilities.runOnUIThread(new i0(chatAttachAlertPhotoLayout, i13, R, allPhotosArray, i11, znVar), z14 ? 250L : 0L);
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                hg.b0 b0Var = (hg.b0) this.c;
                (!this.b ? b0Var.k : b0Var.j).remove(Long.valueOf(((p61) this.d).x));
                b0Var.e.run();
                break;
            case 2:
            case 7:
            case 9:
            default:
                nn0 nn0Var = (nn0) this.c;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) this.d;
                boolean z10 = this.b;
                nn0Var.x1();
                nn0Var.i1(tL_secureRequiredType, null, null, true, new yl0(nn0Var, 4), new bm0(nn0Var, 6), z10);
                break;
            case 3:
                j9 j9Var = (j9) this.c;
                boolean z11 = this.b;
                boolean[] zArr = (boolean[]) this.d;
                if (z11) {
                    boolean z12 = zArr[0];
                    TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                    tL_messages_deletePhoneCallHistory.revoke = z12;
                    j9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new s3(3, j9Var, z12));
                    j9Var.G.clear();
                    j9Var.H = false;
                    j9Var.J = true;
                    j9Var.F.setVisibility(8);
                    j9Var.d.W2.N(true);
                } else {
                    j9Var.getMessagesController().deleteMessages(new ArrayList<>(j9Var.L), null, null, 0L, 0, zArr[0], 0);
                }
                j9Var.k0(false);
                break;
            case 4:
                ((ga) this.c).a.j0((TLRPC.TL_username) this.d, this.b, true);
                break;
            case 5:
                fp fpVar = (fp) this.c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
                boolean z13 = this.b;
                hp hpVar = fpVar.a;
                hpVar.x1(tL_username, z13, true);
                hpVar.Y2.V();
                break;
            case 6:
                n2 n2Var = (n2) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                boolean z14 = this.b;
                TLRPC.UserFull userFull = n2Var.getMessagesController().getUserFull(user.id);
                f2.m(user, z14, userFull != null && userFull.video_calls_available, n2Var.getParentActivity(), userFull, n2Var.getAccountInstance());
                break;
            case 8:
                f10 f10Var = (f10) this.c;
                w00 w00Var = (w00) this.d;
                boolean z15 = this.b;
                int i11 = w00Var.j;
                if (i11 > 0) {
                    f10Var.y &= ~i11;
                } else {
                    (z15 ? f10Var.F : f10Var.G).remove(Long.valueOf(w00Var.h));
                }
                f10Var.j0();
                f10Var.w0();
                f10Var.i0(true);
                if (z15) {
                    f10Var.n0(1, false);
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
        i9.c0 q6 = l0Var.g.q(rVar, e9.i0.z((b2.k0) this.d), -1, -9223372036854775807L);
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

    @Override // org.telegram.ui.Components.fm0
    public /* synthetic */ void n0(View view, float f7, float f10) {
    }
}
