package ai;

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
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.g00;
import org.telegram.ui.jf1;
import org.telegram.ui.jl0;
import org.telegram.ui.ml0;
import org.telegram.ui.p00;
import org.telegram.ui.sn;
import org.telegram.ui.ss;
import org.telegram.ui.vo;
import org.telegram.ui.xm0;
import org.telegram.ui.xo;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d4 implements jf1, Continuation, org.telegram.ui.ActionBar.a2, xl0, ss, androidx.car.app.utils.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d4(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ boolean P0(View view) {
        return false;
    }

    @Override // androidx.car.app.utils.a
    public Object a() {
        Object lambda$onCarHardwareResult$0;
        lambda$onCarHardwareResult$0 = ((CarResultStub) this.c).lambda$onCarHardwareResult$0(this.b, (w.b) this.d);
        return lambda$onCarHardwareResult$0;
    }

    @Override // org.telegram.ui.ss
    public void b(TLRPC.User user) {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        int[] iArr = (int[]) this.d;
        Pattern pattern = LaunchActivity.C1;
        TLRPC.UserFull userFull = MessagesController.getInstance(launchActivity.O).getUserFull(user.id);
        org.telegram.ui.Components.voip.d2.m(user, this.b, userFull != null && userFull.video_calls_available, launchActivity, userFull, AccountInstance.getInstance(iArr[0]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0159, code lost:
    
        if (r7.W != false) goto L91;
     */
    @Override // org.telegram.ui.Components.xl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(float f7, float f10, int i10, View view) {
        int i11 = i10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
        org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.d;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.t1;
        HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
        ti tiVar = chatAttachAlertPhotoLayout.b;
        if (chatAttachAlertPhotoLayout.v0) {
            boolean z10 = tiVar.V;
            org.telegram.ui.ActionBar.n2 n2Var = tiVar.f0;
            if (z10) {
                return;
            }
            org.telegram.ui.ActionBar.n2 R = n2Var == null ? LaunchActivity.R() : n2Var;
            if (R == null || (view instanceof p20)) {
                return;
            }
            int i12 = Build.VERSION.SDK_INT;
            sm smVar = chatAttachAlertPhotoLayout.G;
            try {
                if (smVar.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0 && i11 == 0 && chatAttachAlertPhotoLayout.O0) {
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
                boolean z11 = smVar.f;
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
                sn snVar = null;
                if (chatAttachAlertPhotoLayout.g1) {
                    if (i11 == 0) {
                        if (!(view instanceof org.telegram.ui.Components.g9)) {
                            return;
                        }
                        chatAttachAlertPhotoLayout.r0((org.telegram.ui.Components.g9) view, null, 0L);
                        tiVar.dismiss();
                    }
                    i11--;
                }
                ArrayList<Object> allPhotosArray = chatAttachAlertPhotoLayout.getAllPhotosArray();
                if (i11 < 0 || i11 >= allPhotosArray.size()) {
                    return;
                }
                ri riVar = tiVar.c2;
                if (riVar != null && riVar.p0() && (allPhotosArray.get(i11) instanceof MediaController.PhotoEntry)) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) allPhotosArray.get(i11);
                    hashMap.clear();
                    if (photoEntry != null) {
                        chatAttachAlertPhotoLayout.Q(photoEntry, -1);
                    }
                    tiVar.a1();
                    tiVar.c2.b0(7, true, true, 0, 0, 0L, tiVar.u1(), false, 0L);
                    hashMap.clear();
                    ChatAttachAlertPhotoLayout.r1.clear();
                    arrayList.clear();
                    hashMap.clear();
                    return;
                }
                PhotoViewer.t1().K2(null, R, d6Var);
                PhotoViewer.t1().L2(tiVar);
                PhotoViewer t12 = PhotoViewer.t1();
                int i14 = tiVar.V1;
                boolean z13 = tiVar.W1;
                t12.h = i14;
                t12.n = z13;
                if (tiVar.F && tiVar.G) {
                    i13 = 11;
                    if (n2Var instanceof sn) {
                        snVar = (sn) n2Var;
                    }
                } else if (tiVar.T0 != 0) {
                    i13 = 1;
                } else {
                    if (n2Var instanceof sn) {
                        snVar = (sn) n2Var;
                    }
                    i13 = 0;
                }
                if (!tiVar.c2.v()) {
                    AndroidUtilities.hideKeyboard(R.getFragmentView().findFocus());
                    AndroidUtilities.hideKeyboard(tiVar.getContainer().findFocus());
                }
                if (hashMap.size() > 0 && arrayList.size() > 0) {
                    Object obj = hashMap.get(arrayList.get(0));
                    if (obj instanceof MediaController.PhotoEntry) {
                        ((MediaController.PhotoEntry) obj).caption = tiVar.o1().getText();
                    }
                    if (obj instanceof MediaController.SearchImage) {
                        ((MediaController.SearchImage) obj).caption = tiVar.o1().getText();
                    }
                }
                if (tiVar.Q != null) {
                    tiVar.Q.e = allPhotosArray.get(i11) instanceof MediaController.PhotoEntry ? ((MediaController.PhotoEntry) allPhotosArray.get(i11)).isVideo : false;
                }
                boolean z14 = (allPhotosArray.get(i11) instanceof MediaController.PhotoEntry) && ((MediaController.PhotoEntry) allPhotosArray.get(i11)).hasSpoiler;
                Object obj2 = allPhotosArray.get(i11);
                if ((obj2 instanceof MediaController.PhotoEntry) && chatAttachAlertPhotoLayout.X((MediaController.PhotoEntry) obj2)) {
                    return;
                }
                if (z14) {
                    chatAttachAlertPhotoLayout.p0(i11, false);
                }
                AndroidUtilities.runOnUIThread(new ki.h0(chatAttachAlertPhotoLayout, i13, R, allPhotosArray, i11, snVar), z14 ? 250L : 0L);
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 2:
                ig.a0 a0Var = (ig.a0) this.c;
                (!this.b ? a0Var.k : a0Var.j).remove(Long.valueOf(((f61) this.d).x));
                a0Var.e.run();
                break;
            case 3:
                org.telegram.ui.m9 m9Var = (org.telegram.ui.m9) this.c;
                boolean z10 = this.b;
                boolean[] zArr = (boolean[]) this.d;
                if (z10) {
                    boolean z11 = zArr[0];
                    TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                    tL_messages_deletePhoneCallHistory.revoke = z11;
                    m9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new ei.o3(3, m9Var, z11));
                    m9Var.G.clear();
                    m9Var.H = false;
                    m9Var.J = true;
                    m9Var.F.setVisibility(8);
                    m9Var.d.W2.N(true);
                } else {
                    m9Var.getMessagesController().deleteMessages(new ArrayList<>(m9Var.L), null, null, 0L, 0, zArr[0], 0);
                }
                m9Var.k0(false);
                break;
            case 4:
                ((org.telegram.ui.ja) this.c).a.j0((TLRPC.TL_username) this.d, this.b, true);
                break;
            case 5:
                vo voVar = (vo) this.c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
                boolean z12 = this.b;
                xo xoVar = voVar.a;
                xoVar.x1(tL_username, z12, true);
                xoVar.Y2.V();
                break;
            case 6:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                boolean z13 = this.b;
                TLRPC.UserFull userFull = n2Var.getMessagesController().getUserFull(user.id);
                org.telegram.ui.Components.voip.d2.m(user, z13, userFull != null && userFull.video_calls_available, n2Var.getParentActivity(), userFull, n2Var.getAccountInstance());
                break;
            case 7:
            case 9:
            default:
                xm0 xm0Var = (xm0) this.c;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) this.d;
                boolean z14 = this.b;
                xm0Var.x1();
                xm0Var.i1(tL_secureRequiredType, null, null, true, new jl0(xm0Var, 4), new ml0(xm0Var, 6), z14);
                break;
            case 8:
                p00 p00Var = (p00) this.c;
                g00 g00Var = (g00) this.d;
                boolean z15 = this.b;
                int i11 = g00Var.j;
                if (i11 > 0) {
                    p00Var.y &= ~i11;
                } else {
                    (z15 ? p00Var.F : p00Var.G).remove(Long.valueOf(g00Var.h));
                }
                p00Var.j0();
                p00Var.w0();
                p00Var.i0(true);
                if (z15) {
                    p00Var.n0(1, false);
                    break;
                }
                break;
            case 10:
                boolean z16 = this.b;
                String str = (String) this.c;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.d;
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

    @Override // org.telegram.ui.jf1
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((k7) this.c).C2(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d, this.b);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return (u6.b.d() && ((Integer) task.getResult()).intValue() == 402) ? com.google.firebase.messaging.i.a((Context) this.c, (Intent) this.d, this.b).continueWith(new a3.b(2), new ci.i1(7)) : task;
    }

    public /* synthetic */ d4(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }

    public /* synthetic */ d4(String str, org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        this.a = 10;
        this.b = z10;
        this.c = str;
        this.d = n2Var;
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ void a0(View view, float f7, float f10) {
    }
}
