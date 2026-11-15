package ab;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import androidx.car.app.hardware.common.CarResultStub;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import di.c6;
import di.j3;
import hi.b3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.ff;
import org.telegram.messenger.hd;
import org.telegram.messenger.jf;
import org.telegram.messenger.np;
import org.telegram.messenger.t0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.am;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.s8;
import org.telegram.ui.Components.voip.c2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.an;
import org.telegram.ui.ca;
import org.telegram.ui.ek0;
import org.telegram.ui.eo;
import org.telegram.ui.go;
import org.telegram.ui.hz;
import org.telegram.ui.i9;
import org.telegram.ui.ka1;
import org.telegram.ui.ri0;
import org.telegram.ui.ui0;
import org.telegram.ui.yr;
import org.telegram.ui.zy;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Continuation, ka1, q1, hj0, yr, androidx.car.app.utils.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j(Object obj, Object obj2, boolean z10, int i7) {
        this.a = i7;
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

    @Override // org.telegram.ui.yr
    public void b(TLRPC.User user) {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        int[] iArr = (int[]) this.d;
        String str = LaunchActivity.C1;
        TLRPC.UserFull b22 = np.s1(launchActivity.P).b2(user.id);
        c2.m(user, this.b, b22 != null && b22.video_calls_available, launchActivity, b22, org.telegram.messenger.c.a(iArr[0]));
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x016f, code lost:
    
        if (r7.R1 != false) goto L96;
     */
    @Override // org.telegram.ui.Components.hj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(float f10, float f11, int i7, View view) {
        int i10 = i7;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
        e6 e6Var = (e6) this.d;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.u1;
        HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
        ki kiVar = chatAttachAlertPhotoLayout.b;
        if (chatAttachAlertPhotoLayout.w0) {
            boolean z10 = kiVar.Q1;
            e2 e2Var = kiVar.a2;
            if (z10) {
                return;
            }
            e2 Q = e2Var == null ? LaunchActivity.Q() : e2Var;
            if (Q == null || (view instanceof a10)) {
                return;
            }
            int i11 = Build.VERSION.SDK_INT;
            am amVar = chatAttachAlertPhotoLayout.H;
            try {
                if (amVar.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0 && i10 == 0 && chatAttachAlertPhotoLayout.P0) {
                    Q.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                    return;
                }
                int i12 = 4;
                if (chatAttachAlertPhotoLayout.Q0) {
                    if (i11 >= 33) {
                        Q.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                        return;
                    } else {
                        Q.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                        return;
                    }
                }
                boolean z11 = amVar.f;
                if (z11 && i10 == chatAttachAlertPhotoLayout.N0) {
                    chatAttachAlertPhotoLayout.l0();
                    return;
                }
                boolean z12 = this.b;
                if (i10 == 0 && z12 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                    chatAttachAlertPhotoLayout.l0();
                    return;
                }
                if (z11 && i10 > chatAttachAlertPhotoLayout.N0) {
                    i10--;
                }
                if (chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0 && z12) {
                    i10--;
                }
                an anVar = null;
                if (chatAttachAlertPhotoLayout.h1) {
                    if (i10 == 0) {
                        if (!(view instanceof s8)) {
                            return;
                        }
                        chatAttachAlertPhotoLayout.u0((s8) view, null, 0L);
                        kiVar.dismiss();
                    }
                    i10--;
                }
                ArrayList<Object> allPhotosArray = chatAttachAlertPhotoLayout.getAllPhotosArray();
                if (i10 < 0 || i10 >= allPhotosArray.size()) {
                    return;
                }
                if (!(allPhotosArray.get(i10) instanceof ff) || ((ff) allPhotosArray.get(i10)).k(null)) {
                    ii iiVar = kiVar.X3;
                    if (iiVar != null && iiVar.V1() && (allPhotosArray.get(i10) instanceof ff)) {
                        ff ffVar = (ff) allPhotosArray.get(i10);
                        hashMap.clear();
                        if (ffVar != null) {
                            chatAttachAlertPhotoLayout.T(ffVar, -1);
                        }
                        kiVar.M0();
                        kiVar.X3.y1(7, true, true, 0, 0, 0L, kiVar.f1(), false, 0L);
                        hashMap.clear();
                        ChatAttachAlertPhotoLayout.s1.clear();
                        arrayList.clear();
                        hashMap.clear();
                        return;
                    }
                    PhotoViewer.p1().I2(null, Q, e6Var);
                    PhotoViewer.p1().J2(kiVar);
                    PhotoViewer p12 = PhotoViewer.p1();
                    int i13 = kiVar.Q3;
                    boolean z13 = kiVar.R3;
                    p12.h = i13;
                    p12.n = z13;
                    if (kiVar.A1 && kiVar.B1) {
                        i12 = 11;
                        if (e2Var instanceof an) {
                            anVar = (an) e2Var;
                        }
                    } else if (kiVar.O2 != 0) {
                        i12 = 1;
                    } else {
                        if (e2Var instanceof an) {
                            anVar = (an) e2Var;
                        }
                        i12 = 0;
                    }
                    if (!kiVar.X3.g0()) {
                        org.telegram.messenger.g0.v1(Q.getFragmentView().findFocus());
                        org.telegram.messenger.g0.v1(kiVar.c.findFocus());
                    }
                    if (hashMap.size() > 0 && arrayList.size() > 0) {
                        Object obj = hashMap.get(arrayList.get(0));
                        if (obj instanceof ff) {
                            ((ff) obj).a = kiVar.a1().getText();
                        }
                        if (obj instanceof jf) {
                            ((jf) obj).I = kiVar.a1().getText();
                        }
                    }
                    if (kiVar.L1 != null) {
                        kiVar.L1.e = allPhotosArray.get(i10) instanceof ff ? ((ff) allPhotosArray.get(i10)).b : false;
                    }
                    boolean z14 = (allPhotosArray.get(i10) instanceof ff) && ((ff) allPhotosArray.get(i10)).M;
                    Object obj2 = allPhotosArray.get(i10);
                    if ((obj2 instanceof ff) && chatAttachAlertPhotoLayout.a0((ff) obj2)) {
                        return;
                    }
                    if (z14) {
                        chatAttachAlertPhotoLayout.s0(i10, false);
                    }
                    org.telegram.messenger.g0.i3(new oi.e0(chatAttachAlertPhotoLayout, i12, Q, allPhotosArray, i10, anVar), z14 ? 250L : 0L);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(t1 t1Var, int i7) {
        switch (this.a) {
            case 2:
                kg.a0 a0Var = (kg.a0) this.c;
                (!this.b ? a0Var.k : a0Var.j).remove(Long.valueOf(((b41) this.d).x));
                a0Var.e.run();
                break;
            case 3:
                i9 i9Var = (i9) this.c;
                boolean z10 = this.b;
                boolean[] zArr = (boolean[]) this.d;
                if (z10) {
                    boolean z11 = zArr[0];
                    TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                    tL_messages_deletePhoneCallHistory.revoke = z11;
                    i9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new b3(2, i9Var, z11));
                    i9Var.y.clear();
                    i9Var.E = false;
                    i9Var.G = true;
                    i9Var.x.setVisibility(8);
                    i9Var.c.g3.O(true);
                } else {
                    i9Var.getMessagesController().Z(new ArrayList(i9Var.I), null, null, 0L, 0, zArr[0], 0);
                }
                i9Var.j0(false);
                break;
            case 4:
                ((ca) this.c).a.o0((TLRPC.TL_username) this.d, this.b, true);
                break;
            case 5:
                eo eoVar = (eo) this.c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
                boolean z12 = this.b;
                go goVar = eoVar.a;
                goVar.z1(tL_username, z12, true);
                goVar.i3.b0();
                break;
            case 6:
                e2 e2Var = (e2) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                boolean z13 = this.b;
                TLRPC.UserFull b22 = e2Var.getMessagesController().b2(user.id);
                c2.m(user, z13, b22 != null && b22.video_calls_available, e2Var.getParentActivity(), b22, e2Var.getAccountInstance());
                break;
            case 7:
            case 9:
            default:
                ek0 ek0Var = (ek0) this.c;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) this.d;
                boolean z14 = this.b;
                ek0Var.C1();
                ek0Var.n1(tL_secureRequiredType, null, null, true, new ri0(ek0Var, 4), new ui0(ek0Var, 6), z14);
                break;
            case 8:
                hz hzVar = (hz) this.c;
                zy zyVar = (zy) this.d;
                boolean z15 = this.b;
                int i10 = zyVar.j;
                if (i10 > 0) {
                    hzVar.E &= ~i10;
                } else {
                    (z15 ? hzVar.G : hzVar.H).remove(Long.valueOf(zyVar.h));
                }
                hzVar.p0();
                hzVar.C0();
                hzVar.o0(true);
                if (z15) {
                    hzVar.t0(1, false);
                    break;
                }
                break;
            case 10:
                boolean z16 = this.b;
                String str = (String) this.c;
                e2 e2Var2 = (e2) this.d;
                try {
                    PackageInfo packageInfo = t0.b.getPackageManager().getPackageInfo(t0.b.getPackageName(), 0);
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
                    e2Var2.getParentActivity().startActivity(Intent.createChooser(intent, "Send email..."));
                    break;
                } catch (Exception unused) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e2Var2.getParentActivity());
                    alertDialog$Builder.a.S = hd.M0(2131746071, null);
                    alertDialog$Builder.a.U = hd.M0(2131748199, "NoMailInstalled");
                    alertDialog$Builder.k(hd.M0(2131747831, "OK"), null);
                    e2Var2.showDialog(alertDialog$Builder.a);
                    return;
                }
        }
    }

    @Override // org.telegram.ui.ka1
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        c6 c6Var = (c6) this.c;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.d;
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.password = tL_inputCheckPasswordSRP;
        gettmppassword.period = 600;
        ConnectionsManager.getInstance(c6Var.a).sendRequest(gettmppassword, new j3(c6Var, twoStepVerificationActivity, this.b, 0));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return (x6.b.d() && ((Integer) task.getResult()).intValue() == 402) ? k.a((Context) this.c, (Intent) this.d, this.b).continueWith(new d3.b(3), new a3.l(7)) : task;
    }

    public /* synthetic */ j(Object obj, boolean z10, Object obj2, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }

    public /* synthetic */ j(String str, e2 e2Var, boolean z10) {
        this.a = 10;
        this.b = z10;
        this.c = str;
        this.d = e2Var;
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
