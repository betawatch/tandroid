package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import androidx.car.app.hardware.common.CarResultStub;
import bi.w2;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import di.s3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Pattern;
import ji.h0;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.t20;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.um;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.voip.d2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.b10;
import org.telegram.ui.cm0;
import org.telegram.ui.fm0;
import org.telegram.ui.fo;
import org.telegram.ui.ht;
import org.telegram.ui.k10;
import org.telegram.ui.ka;
import org.telegram.ui.kp;
import org.telegram.ui.mp;
import org.telegram.ui.n9;
import org.telegram.ui.sn0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Continuation, z1, bm0, ht, androidx.car.app.utils.c {
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

    @Override // androidx.car.app.utils.c
    public Object a() {
        Object lambda$onCarHardwareResult$0;
        lambda$onCarHardwareResult$0 = ((CarResultStub) this.c).lambda$onCarHardwareResult$0(this.b, (w.b) this.d);
        return lambda$onCarHardwareResult$0;
    }

    @Override // org.telegram.ui.ht
    public void b(TLRPC.User user) {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        int[] iArr = (int[]) this.d;
        Pattern pattern = LaunchActivity.B1;
        TLRPC.UserFull userFull = MessagesController.getInstance(launchActivity.O).getUserFull(user.id);
        d2.m(user, this.b, userFull != null && userFull.video_calls_available, launchActivity, userFull, AccountInstance.getInstance(iArr[0]));
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0159, code lost:
    
        if (r7.W != false) goto L91;
     */
    @Override // org.telegram.ui.Components.bm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(float f7, float f10, int i10, View view) {
        int i11 = i10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
        c6 c6Var = (c6) this.d;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.t1;
        HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
        vi viVar = chatAttachAlertPhotoLayout.b;
        if (chatAttachAlertPhotoLayout.v0) {
            boolean z10 = viVar.V;
            m2 m2Var = viVar.f0;
            if (z10) {
                return;
            }
            m2 R = m2Var == null ? LaunchActivity.R() : m2Var;
            if (R == null || (view instanceof t20)) {
                return;
            }
            int i12 = Build.VERSION.SDK_INT;
            um umVar = chatAttachAlertPhotoLayout.G;
            try {
                if (umVar.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0 && i11 == 0 && chatAttachAlertPhotoLayout.O0) {
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
                boolean z11 = umVar.f;
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
                fo foVar = null;
                if (chatAttachAlertPhotoLayout.g1) {
                    if (i11 == 0) {
                        if (!(view instanceof j9)) {
                            return;
                        }
                        chatAttachAlertPhotoLayout.r0((j9) view, null, 0L);
                        viVar.dismiss();
                    }
                    i11--;
                }
                ArrayList<Object> allPhotosArray = chatAttachAlertPhotoLayout.getAllPhotosArray();
                if (i11 < 0 || i11 >= allPhotosArray.size()) {
                    return;
                }
                ti tiVar = viVar.c2;
                if (tiVar != null && tiVar.r0() && (allPhotosArray.get(i11) instanceof MediaController.PhotoEntry)) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) allPhotosArray.get(i11);
                    hashMap.clear();
                    if (photoEntry != null) {
                        chatAttachAlertPhotoLayout.Q(photoEntry, -1);
                    }
                    viVar.a1();
                    viVar.c2.b0(7, true, true, 0, 0, 0L, viVar.u1(), false, 0L);
                    hashMap.clear();
                    ChatAttachAlertPhotoLayout.r1.clear();
                    arrayList.clear();
                    hashMap.clear();
                    return;
                }
                PhotoViewer.t1().K2(null, R, c6Var);
                PhotoViewer.t1().L2(viVar);
                PhotoViewer t12 = PhotoViewer.t1();
                int i14 = viVar.V1;
                boolean z13 = viVar.W1;
                t12.h = i14;
                t12.n = z13;
                if (viVar.F && viVar.G) {
                    i13 = 11;
                    if (m2Var instanceof fo) {
                        foVar = (fo) m2Var;
                    }
                } else if (viVar.T0 != 0) {
                    i13 = 1;
                } else {
                    if (m2Var instanceof fo) {
                        foVar = (fo) m2Var;
                    }
                    i13 = 0;
                }
                if (!viVar.c2.w()) {
                    AndroidUtilities.hideKeyboard(R.getFragmentView().findFocus());
                    AndroidUtilities.hideKeyboard(viVar.getContainer().findFocus());
                }
                if (hashMap.size() > 0 && arrayList.size() > 0) {
                    Object obj = hashMap.get(arrayList.get(0));
                    if (obj instanceof MediaController.PhotoEntry) {
                        ((MediaController.PhotoEntry) obj).caption = viVar.o1().getText();
                    }
                    if (obj instanceof MediaController.SearchImage) {
                        ((MediaController.SearchImage) obj).caption = viVar.o1().getText();
                    }
                }
                if (viVar.Q != null) {
                    viVar.Q.e = allPhotosArray.get(i11) instanceof MediaController.PhotoEntry ? ((MediaController.PhotoEntry) allPhotosArray.get(i11)).isVideo : false;
                }
                boolean z14 = (allPhotosArray.get(i11) instanceof MediaController.PhotoEntry) && ((MediaController.PhotoEntry) allPhotosArray.get(i11)).hasSpoiler;
                Object obj2 = allPhotosArray.get(i11);
                if ((obj2 instanceof MediaController.PhotoEntry) && chatAttachAlertPhotoLayout.X((MediaController.PhotoEntry) obj2)) {
                    return;
                }
                if (z14) {
                    chatAttachAlertPhotoLayout.p0(i11, false);
                }
                AndroidUtilities.runOnUIThread(new h0(chatAttachAlertPhotoLayout, i13, R, allPhotosArray, i11, foVar), z14 ? 250L : 0L);
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(a2 a2Var, int i10) {
        switch (this.a) {
            case 1:
                ig.a0 a0Var = (ig.a0) this.c;
                (!this.b ? a0Var.k : a0Var.j).remove(Long.valueOf(((m61) this.d).x));
                a0Var.e.run();
                break;
            case 2:
                n9 n9Var = (n9) this.c;
                boolean z10 = this.b;
                boolean[] zArr = (boolean[]) this.d;
                if (z10) {
                    boolean z11 = zArr[0];
                    TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                    tL_messages_deletePhoneCallHistory.revoke = z11;
                    n9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new s3(3, n9Var, z11));
                    n9Var.G.clear();
                    n9Var.H = false;
                    n9Var.J = true;
                    n9Var.F.setVisibility(8);
                    n9Var.d.W2.N(true);
                } else {
                    n9Var.getMessagesController().deleteMessages(new ArrayList<>(n9Var.L), null, null, 0L, 0, zArr[0], 0);
                }
                n9Var.k0(false);
                break;
            case 3:
                ((ka) this.c).a.j0((TLRPC.TL_username) this.d, this.b, true);
                break;
            case 4:
                kp kpVar = (kp) this.c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
                boolean z12 = this.b;
                mp mpVar = kpVar.a;
                mpVar.x1(tL_username, z12, true);
                mpVar.Y2.V();
                break;
            case 5:
                m2 m2Var = (m2) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                boolean z13 = this.b;
                TLRPC.UserFull userFull = m2Var.getMessagesController().getUserFull(user.id);
                d2.m(user, z13, userFull != null && userFull.video_calls_available, m2Var.getParentActivity(), userFull, m2Var.getAccountInstance());
                break;
            case 6:
            case 8:
            default:
                sn0 sn0Var = (sn0) this.c;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) this.d;
                boolean z14 = this.b;
                sn0Var.x1();
                sn0Var.i1(tL_secureRequiredType, null, null, true, new cm0(sn0Var, 4), new fm0(sn0Var, 6), z14);
                break;
            case 7:
                k10 k10Var = (k10) this.c;
                b10 b10Var = (b10) this.d;
                boolean z15 = this.b;
                int i11 = b10Var.j;
                if (i11 > 0) {
                    k10Var.y &= ~i11;
                } else {
                    (z15 ? k10Var.F : k10Var.G).remove(Long.valueOf(b10Var.h));
                }
                k10Var.j0();
                k10Var.w0();
                k10Var.i0(true);
                if (z15) {
                    k10Var.n0(1, false);
                    break;
                }
                break;
            case 9:
                boolean z16 = this.b;
                String str = (String) this.c;
                m2 m2Var2 = (m2) this.d;
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
                    m2Var2.getParentActivity().startActivity(Intent.createChooser(intent, "Send email..."));
                    break;
                } catch (Exception unused) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var2.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.a.T = LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled);
                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
                    m2Var2.showDialog(alertDialog$Builder.a);
                    return;
                }
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return (u6.b.d() && ((Integer) task.getResult()).intValue() == 402) ? j.a((Context) this.c, (Intent) this.d, this.b).continueWith(new a3.b(2), new w2(5)) : task;
    }

    public /* synthetic */ i(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }

    public /* synthetic */ i(String str, m2 m2Var, boolean z10) {
        this.a = 9;
        this.b = z10;
        this.c = str;
        this.d = m2Var;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void p0(View view, float f7, float f10) {
    }
}
