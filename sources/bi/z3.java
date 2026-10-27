package bi;

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
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.r20;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tm;
import org.telegram.ui.Components.u61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bp;
import org.telegram.ui.h00;
import org.telegram.ui.kn0;
import org.telegram.ui.q00;
import org.telegram.ui.sf1;
import org.telegram.ui.ts;
import org.telegram.ui.ul0;
import org.telegram.ui.wn;
import org.telegram.ui.xl0;
import org.telegram.ui.zo;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z3 implements sf1, Continuation, org.telegram.ui.ActionBar.b2, bm0, ts, androidx.car.app.utils.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z3(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
    }

    @Override // androidx.car.app.utils.b
    public Object a() {
        Object lambda$onCarHardwareResult$0;
        lambda$onCarHardwareResult$0 = ((CarResultStub) this.c).lambda$onCarHardwareResult$0(this.b, (w.b) this.d);
        return lambda$onCarHardwareResult$0;
    }

    @Override // org.telegram.ui.ts
    public void b(TLRPC.User user) {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        int[] iArr = (int[]) this.d;
        Pattern pattern = LaunchActivity.D1;
        TLRPC.UserFull userFull = MessagesController.getInstance(launchActivity.O).getUserFull(user.id);
        org.telegram.ui.Components.voip.g2.m(user, this.b, userFull != null && userFull.video_calls_available, launchActivity, userFull, AccountInstance.getInstance(iArr[0]));
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
    public void e(float f7, float f10, int i10, View view) {
        int i11 = i10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
        org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.d;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.t1;
        HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
        ti tiVar = chatAttachAlertPhotoLayout.b;
        if (chatAttachAlertPhotoLayout.v0) {
            boolean z10 = tiVar.V;
            org.telegram.ui.ActionBar.r2 r2Var = tiVar.f0;
            if (z10) {
                return;
            }
            org.telegram.ui.ActionBar.r2 R = r2Var == null ? LaunchActivity.R() : r2Var;
            if (R == null || (view instanceof r20)) {
                return;
            }
            int i12 = Build.VERSION.SDK_INT;
            tm tmVar = chatAttachAlertPhotoLayout.G;
            try {
                if (tmVar.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0 && i11 == 0 && chatAttachAlertPhotoLayout.O0) {
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
                boolean z11 = tmVar.f;
                if (z11 && i11 == chatAttachAlertPhotoLayout.M0) {
                    chatAttachAlertPhotoLayout.j0();
                    return;
                }
                boolean z12 = this.b;
                if (i11 == 0 && z12 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                    chatAttachAlertPhotoLayout.j0();
                    return;
                }
                if (z11 && i11 > chatAttachAlertPhotoLayout.M0) {
                    i11--;
                }
                if (chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0 && z12) {
                    i11--;
                }
                wn wnVar = null;
                if (chatAttachAlertPhotoLayout.g1) {
                    if (i11 == 0) {
                        if (!(view instanceof org.telegram.ui.Components.i9)) {
                            return;
                        }
                        chatAttachAlertPhotoLayout.s0((org.telegram.ui.Components.i9) view, null, 0L);
                        tiVar.dismiss();
                    }
                    i11--;
                }
                ArrayList<Object> allPhotosArray = chatAttachAlertPhotoLayout.getAllPhotosArray();
                if (i11 < 0 || i11 >= allPhotosArray.size()) {
                    return;
                }
                ri riVar = tiVar.c2;
                if (riVar != null && riVar.x0() && (allPhotosArray.get(i11) instanceof MediaController.PhotoEntry)) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) allPhotosArray.get(i11);
                    hashMap.clear();
                    if (photoEntry != null) {
                        chatAttachAlertPhotoLayout.R(photoEntry, -1);
                    }
                    tiVar.e1();
                    tiVar.c2.p0(7, true, true, 0, 0, 0L, tiVar.x1(), false, 0L);
                    hashMap.clear();
                    ChatAttachAlertPhotoLayout.r1.clear();
                    arrayList.clear();
                    hashMap.clear();
                    return;
                }
                PhotoViewer.v1().N2(null, R, u6Var);
                PhotoViewer.v1().O2(tiVar);
                PhotoViewer v12 = PhotoViewer.v1();
                int i14 = tiVar.V1;
                boolean z13 = tiVar.W1;
                v12.h = i14;
                v12.n = z13;
                if (tiVar.F && tiVar.G) {
                    i13 = 11;
                    if (r2Var instanceof wn) {
                        wnVar = (wn) r2Var;
                    }
                } else if (tiVar.T0 != 0) {
                    i13 = 1;
                } else {
                    if (r2Var instanceof wn) {
                        wnVar = (wn) r2Var;
                    }
                    i13 = 0;
                }
                if (!tiVar.c2.E()) {
                    AndroidUtilities.hideKeyboard(R.getFragmentView().findFocus());
                    AndroidUtilities.hideKeyboard(tiVar.getContainer().findFocus());
                }
                if (hashMap.size() > 0 && arrayList.size() > 0) {
                    Object obj = hashMap.get(arrayList.get(0));
                    if (obj instanceof MediaController.PhotoEntry) {
                        ((MediaController.PhotoEntry) obj).caption = tiVar.s1().getText();
                    }
                    if (obj instanceof MediaController.SearchImage) {
                        ((MediaController.SearchImage) obj).caption = tiVar.s1().getText();
                    }
                }
                if (tiVar.Q != null) {
                    tiVar.Q.e = allPhotosArray.get(i11) instanceof MediaController.PhotoEntry ? ((MediaController.PhotoEntry) allPhotosArray.get(i11)).isVideo : false;
                }
                boolean z14 = (allPhotosArray.get(i11) instanceof MediaController.PhotoEntry) && ((MediaController.PhotoEntry) allPhotosArray.get(i11)).hasSpoiler;
                Object obj2 = allPhotosArray.get(i11);
                if ((obj2 instanceof MediaController.PhotoEntry) && chatAttachAlertPhotoLayout.Y((MediaController.PhotoEntry) obj2)) {
                    return;
                }
                if (z14) {
                    chatAttachAlertPhotoLayout.q0(i11, false);
                }
                AndroidUtilities.runOnUIThread(new li.g0(chatAttachAlertPhotoLayout, i13, R, allPhotosArray, i11, wnVar), z14 ? 250L : 0L);
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 2:
                jg.b0 b0Var = (jg.b0) this.c;
                (!this.b ? b0Var.k : b0Var.j).remove(Long.valueOf(((u61) this.d).x));
                b0Var.e.run();
                break;
            case 3:
                org.telegram.ui.o9 o9Var = (org.telegram.ui.o9) this.c;
                boolean z10 = this.b;
                boolean[] zArr = (boolean[]) this.d;
                if (z10) {
                    boolean z11 = zArr[0];
                    TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                    tL_messages_deletePhoneCallHistory.revoke = z11;
                    o9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new fi.m3(3, o9Var, z11));
                    o9Var.w.clear();
                    o9Var.x = false;
                    o9Var.E = true;
                    o9Var.v.setVisibility(8);
                    o9Var.c.g3.O(true);
                } else {
                    o9Var.getMessagesController().deleteMessages(new ArrayList<>(o9Var.G), null, null, 0L, 0, zArr[0], 0);
                }
                o9Var.f0(false);
                break;
            case 4:
                ((org.telegram.ui.ia) this.c).a.k0((TLRPC.TL_username) this.d, this.b, true);
                break;
            case 5:
                zo zoVar = (zo) this.c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
                boolean z12 = this.b;
                bp bpVar = zoVar.a;
                bpVar.C1(tL_username, z12, true);
                bpVar.i3.X();
                break;
            case 6:
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                boolean z13 = this.b;
                TLRPC.UserFull userFull = r2Var.getMessagesController().getUserFull(user.id);
                org.telegram.ui.Components.voip.g2.m(user, z13, userFull != null && userFull.video_calls_available, r2Var.getParentActivity(), userFull, r2Var.getAccountInstance());
                break;
            case 7:
            case 9:
            default:
                kn0 kn0Var = (kn0) this.c;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) this.d;
                boolean z14 = this.b;
                kn0Var.y1();
                kn0Var.j1(tL_secureRequiredType, null, null, true, new ul0(kn0Var, 4), new xl0(kn0Var, 6), z14);
                break;
            case 8:
                q00 q00Var = (q00) this.c;
                h00 h00Var = (h00) this.d;
                boolean z15 = this.b;
                int i11 = h00Var.j;
                if (i11 > 0) {
                    q00Var.y &= ~i11;
                } else {
                    (z15 ? q00Var.F : q00Var.G).remove(Long.valueOf(h00Var.h));
                }
                q00Var.l0();
                q00Var.y0();
                q00Var.k0(true);
                if (z15) {
                    q00Var.p0(1, false);
                    break;
                }
                break;
            case 10:
                boolean z16 = this.b;
                String str = (String) this.c;
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) this.d;
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
                    r2Var2.getParentActivity().startActivity(Intent.createChooser(intent, "Send email..."));
                    break;
                } catch (Exception unused) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r2Var2.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.a.T = LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled);
                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
                    r2Var2.showDialog(alertDialog$Builder.a);
                    return;
                }
        }
    }

    @Override // org.telegram.ui.sf1
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((h7) this.c).I2(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d, this.b);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return (v6.b.d() && ((Integer) task.getResult()).intValue() == 402) ? com.google.firebase.messaging.i.a((Context) this.c, (Intent) this.d, this.b).continueWith(new a3.b(2), new c2.i(4)) : task;
    }

    public /* synthetic */ z3(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }

    public /* synthetic */ z3(String str, org.telegram.ui.ActionBar.r2 r2Var, boolean z10) {
        this.a = 10;
        this.b = z10;
        this.c = str;
        this.d = r2Var;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void l0(View view, float f7, float f10) {
    }
}
