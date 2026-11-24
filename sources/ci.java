// default package

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
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ci implements ee, s89, g59, Continuation, cv2, c5c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ci(String str, d dVar, boolean z) {
        this.a = (byte) 10;
        this.b = z;
        this.d = str;
        this.c = dVar;
    }

    @Override // s89
    public final Object a() {
        Object lambda$onCarHardwareResult$0;
        lambda$onCarHardwareResult$0 = ((CarResultStub) this.c).lambda$onCarHardwareResult$0(this.b, (g41) this.d);
        return lambda$onCarHardwareResult$0;
    }

    @Override // cv2
    public final void b(TLRPC.User user) {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        int[] iArr = (int[]) this.d;
        String str = LaunchActivity.C1;
        TLRPC.UserFull X1 = oc7.r1(launchActivity.P).X1(user.id);
        sic.m(user, this.b, X1 != null && X1.video_calls_available, launchActivity, X1, j5.a(iArr[0]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0165, code lost:
    
        if (r7.Q1 == false) goto L93;
     */
    @Override // g59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(float f, float f2, int i, View view) {
        int i2 = i;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
        ylb ylbVar = (ylb) this.d;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.u1;
        HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
        i22 i22Var = chatAttachAlertPhotoLayout.b;
        if (chatAttachAlertPhotoLayout.w0) {
            boolean z = i22Var.P1;
            d dVar = i22Var.Z1;
            if (z) {
                return;
            }
            d Q = dVar == null ? LaunchActivity.Q() : dVar;
            if (Q == null || (view instanceof gt4)) {
                return;
            }
            p62 p62Var = chatAttachAlertPhotoLayout.H;
            try {
                if (p62Var.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0 && i2 == 0 && chatAttachAlertPhotoLayout.P0) {
                    Q.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                    return;
                }
                int i3 = 4;
                if (chatAttachAlertPhotoLayout.Q0) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        Q.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                        return;
                    } else {
                        Q.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                        return;
                    }
                }
                boolean z2 = p62Var.f;
                if (z2 && i2 == chatAttachAlertPhotoLayout.N0) {
                    chatAttachAlertPhotoLayout.l0();
                    return;
                }
                boolean z3 = this.b;
                if (i2 == 0 && z3 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                    chatAttachAlertPhotoLayout.l0();
                    return;
                }
                if (z2 && i2 > chatAttachAlertPhotoLayout.N0) {
                    i2--;
                }
                if (chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0 && z3) {
                    i2--;
                }
                yv1 yv1Var = null;
                if (chatAttachAlertPhotoLayout.h1) {
                    if (i2 == 0) {
                        if (!(view instanceof oc0)) {
                            return;
                        }
                        chatAttachAlertPhotoLayout.u0((oc0) view, null, 0L);
                        i22Var.dismiss();
                    }
                    i2--;
                }
                ArrayList<Object> allPhotosArray = chatAttachAlertPhotoLayout.getAllPhotosArray();
                if (i2 < 0 || i2 >= allPhotosArray.size()) {
                    return;
                }
                if (!(allPhotosArray.get(i2) instanceof jo6) || ((jo6) allPhotosArray.get(i2)).k(null)) {
                    g22 g22Var = i22Var.W3;
                    if (g22Var != null && g22Var.K0() && (allPhotosArray.get(i2) instanceof jo6)) {
                        jo6 jo6Var = (jo6) allPhotosArray.get(i2);
                        hashMap.clear();
                        if (jo6Var != null) {
                            chatAttachAlertPhotoLayout.Q(jo6Var, -1);
                        }
                        i22Var.E0();
                        i22Var.W3.E0(7, true, true, 0, 0, 0L, i22Var.a1(), false, 0L);
                        hashMap.clear();
                        ChatAttachAlertPhotoLayout.s1.clear();
                        arrayList.clear();
                        hashMap.clear();
                        return;
                    }
                    PhotoViewer.r0().T1(null, Q, ylbVar);
                    PhotoViewer.r0().U1(i22Var);
                    PhotoViewer r0 = PhotoViewer.r0();
                    int i4 = i22Var.P3;
                    boolean z4 = i22Var.Q3;
                    r0.h = i4;
                    r0.n = z4;
                    if (i22Var.z1 && i22Var.A1) {
                        i3 = 11;
                        if (dVar instanceof yv1) {
                            yv1Var = (yv1) dVar;
                        }
                    } else if (i22Var.N2 != 0) {
                        i3 = 1;
                    } else {
                        if (dVar instanceof yv1) {
                            yv1Var = (yv1) dVar;
                        }
                        i3 = 0;
                    }
                    if (!i22Var.W3.B()) {
                        gm.t1(Q.getFragmentView().findFocus());
                        gm.t1(i22Var.c.findFocus());
                    }
                    if (hashMap.size() > 0 && arrayList.size() > 0) {
                        Object obj = hashMap.get(arrayList.get(0));
                        if (obj instanceof jo6) {
                            ((jo6) obj).a = i22Var.U0().getText();
                        }
                        if (obj instanceof no6) {
                            ((no6) obj).I = i22Var.U0().getText();
                        }
                    }
                    if (i22Var.K1 != null) {
                        i22Var.K1.e = allPhotosArray.get(i2) instanceof jo6 ? ((jo6) allPhotosArray.get(i2)).b : false;
                    }
                    boolean z5 = (allPhotosArray.get(i2) instanceof jo6) && ((jo6) allPhotosArray.get(i2)).M;
                    Object obj2 = allPhotosArray.get(i2);
                    if ((obj2 instanceof jo6) && chatAttachAlertPhotoLayout.Y((jo6) obj2)) {
                        return;
                    }
                    if (z5) {
                        chatAttachAlertPhotoLayout.s0(i2, false);
                    }
                    gm.d3(new v52(chatAttachAlertPhotoLayout, i3, Q, allPhotosArray, i2, yv1Var), z5 ? 250L : 0L);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // c5c
    public final void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        wsa wsaVar = (wsa) this.c;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.d;
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.password = tL_inputCheckPasswordSRP;
        gettmppassword.period = 600;
        ConnectionsManager.getInstance(wsaVar.a).sendRequest(gettmppassword, new pqa(wsaVar, twoStepVerificationActivity, this.b, (byte) 0));
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = 0;
        switch (this.a) {
            case 0:
                d dVar = (d) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                boolean z = this.b;
                TLRPC.UserFull X1 = dVar.getMessagesController().X1(user.id);
                sic.m(user, z, X1 != null && X1.video_calls_available, dVar.getParentActivity(), X1, dVar.getAccountInstance());
                break;
            case 1:
                t51 t51Var = (t51) this.c;
                (!this.b ? t51Var.k : t51Var.j).remove(Long.valueOf(((c6c) this.d).y));
                t51Var.e.run();
                break;
            case 2:
                ia1 ia1Var = (ia1) this.c;
                boolean z2 = this.b;
                boolean[] zArr = (boolean[]) this.d;
                if (z2) {
                    ia1Var.getClass();
                    boolean z3 = zArr[0];
                    TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                    tL_messages_deletePhoneCallHistory.revoke = z3;
                    ia1Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new r91(b, ia1Var, z3));
                    ia1Var.x.clear();
                    ia1Var.y = false;
                    ia1Var.F = true;
                    ia1Var.w.setVisibility(8);
                    ia1Var.c.g3.O(true);
                } else {
                    ia1Var.getMessagesController().V(new ArrayList(ia1Var.H), null, null, 0L, 0, zArr[0], 0);
                }
                ia1Var.e0(false);
                break;
            case 3:
            case 5:
            case 7:
            case 9:
            default:
                xz7 xz7Var = (xz7) this.c;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) this.d;
                boolean z4 = this.b;
                xz7Var.B1();
                xz7Var.c1(tL_secureRequiredType, null, null, true, new ny7(xz7Var, (byte) 4), new qy7(xz7Var, (byte) 6), z4);
                break;
            case 4:
                ((lf1) this.c).a.o0((TLRPC.TL_username) this.d, this.b, true);
                break;
            case 6:
                na2 na2Var = (na2) this.c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
                boolean z5 = this.b;
                pa2 pa2Var = na2Var.a;
                pa2Var.z1(tL_username, z5, true);
                pa2Var.i3.b0();
                break;
            case 8:
                qf4 qf4Var = (qf4) this.c;
                gf4 gf4Var = (gf4) this.d;
                boolean z6 = this.b;
                short s = gf4Var.j;
                if (s > 0) {
                    qf4Var.E &= ~s;
                } else {
                    (z6 ? qf4Var.G : qf4Var.H).remove(Long.valueOf(gf4Var.h));
                }
                qf4Var.m0();
                qf4Var.C0();
                qf4Var.l0(true);
                if (z6) {
                    qf4Var.t0(1, false);
                    break;
                }
                break;
            case 10:
                boolean z7 = this.b;
                String str = (String) this.d;
                d dVar2 = (d) this.c;
                try {
                    PackageInfo packageInfo = a.b.getPackageManager().getPackageInfo(a.b.getPackageName(), 0);
                    Locale locale = Locale.US;
                    String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                    Intent intent = new Intent("android.intent.action.SENDTO");
                    intent.setData(Uri.parse("mailto:"));
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{z7 ? "recover@telegram.org" : "login@stel.com"});
                    if (z7) {
                        intent.putExtra("android.intent.extra.SUBJECT", "Banned phone number: " + str);
                        intent.putExtra("android.intent.extra.TEXT", "I'm trying to use my mobile phone number: " + str + "\nBut Telegram says it's banned. Please help.\n\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault());
                    } else {
                        intent.putExtra("android.intent.extra.SUBJECT", "Invalid phone number: " + str);
                        intent.putExtra("android.intent.extra.TEXT", "I'm trying to use my mobile phone number: " + str + "\nBut Telegram says it's invalid. Please help.\n\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault());
                    }
                    dVar2.getParentActivity().startActivity(Intent.createChooser(intent, "Send email..."));
                    break;
                } catch (Exception unused) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dVar2.getParentActivity());
                    alertDialog$Builder.a.S = jb6.M0(2131745804, null);
                    alertDialog$Builder.a.U = jb6.M0(2131747933, "NoMailInstalled");
                    alertDialog$Builder.j(jb6.M0(2131747564, "OK"), null);
                    dVar2.showDialog(alertDialog$Builder.a);
                    return;
                }
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return (ate.a() && ((Integer) task.getResult()).intValue() == 402) ? lx6.i((Context) this.c, (Intent) this.d, this.b).continueWith(new kc((byte) 1), new h64((byte) 9)) : task;
    }

    @Override // g59
    public final boolean u(View view) {
        return false;
    }

    public /* synthetic */ ci(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    public /* synthetic */ ci(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    @Override // g59
    public final void p(View view, float f, float f2) {
    }
}
