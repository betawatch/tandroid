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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ch implements ed, q69, d39, Continuation, rt2, b3c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ch(String str, d dVar, boolean z) {
        this.a = (byte) 10;
        this.b = z;
        this.d = str;
        this.c = dVar;
    }

    @Override // q69
    public final Object a() {
        Object lambda$onCarHardwareResult$0;
        lambda$onCarHardwareResult$0 = ((CarResultStub) this.c).lambda$onCarHardwareResult$0(this.b, (y21) this.d);
        return lambda$onCarHardwareResult$0;
    }

    @Override // rt2
    public final void b(TLRPC.User user) {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        int[] iArr = (int[]) this.d;
        String str = LaunchActivity.C1;
        TLRPC.UserFull W1 = na7.q1(launchActivity.P).W1(user.id);
        rgc.m(user, this.b, W1 != null && W1.video_calls_available, launchActivity, W1, j5.a(iArr[0]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0165, code lost:
    
        if (r7.Q1 == false) goto L93;
     */
    @Override // d39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f, float f2, int i, View view) {
        int i2 = i;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
        wjb wjbVar = (wjb) this.d;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.u1;
        HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
        x02 x02Var = chatAttachAlertPhotoLayout.b;
        if (chatAttachAlertPhotoLayout.w0) {
            boolean z = x02Var.P1;
            d dVar = x02Var.Z1;
            if (z) {
                return;
            }
            d Q = dVar == null ? LaunchActivity.Q() : dVar;
            if (Q == null || (view instanceof fr4)) {
                return;
            }
            e52 e52Var = chatAttachAlertPhotoLayout.H;
            try {
                if (e52Var.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0 && i2 == 0 && chatAttachAlertPhotoLayout.P0) {
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
                boolean z2 = e52Var.f;
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
                mu1 mu1Var = null;
                if (chatAttachAlertPhotoLayout.h1) {
                    if (i2 == 0) {
                        if (!(view instanceof ob0)) {
                            return;
                        }
                        chatAttachAlertPhotoLayout.u0((ob0) view, null, 0L);
                        x02Var.dismiss();
                    }
                    i2--;
                }
                ArrayList<Object> allPhotosArray = chatAttachAlertPhotoLayout.getAllPhotosArray();
                if (i2 < 0 || i2 >= allPhotosArray.size()) {
                    return;
                }
                if (!(allPhotosArray.get(i2) instanceof jm6) || ((jm6) allPhotosArray.get(i2)).k(null)) {
                    v02 v02Var = x02Var.W3;
                    if (v02Var != null && v02Var.V1() && (allPhotosArray.get(i2) instanceof jm6)) {
                        jm6 jm6Var = (jm6) allPhotosArray.get(i2);
                        hashMap.clear();
                        if (jm6Var != null) {
                            chatAttachAlertPhotoLayout.R(jm6Var, -1);
                        }
                        x02Var.E0();
                        x02Var.W3.B1(7, true, true, 0, 0, 0L, x02Var.a1(), false, 0L);
                        hashMap.clear();
                        ChatAttachAlertPhotoLayout.s1.clear();
                        arrayList.clear();
                        hashMap.clear();
                        return;
                    }
                    PhotoViewer.r0().S1(null, Q, wjbVar);
                    PhotoViewer.r0().T1(x02Var);
                    PhotoViewer r0 = PhotoViewer.r0();
                    int i4 = x02Var.P3;
                    boolean z4 = x02Var.Q3;
                    r0.h = i4;
                    r0.n = z4;
                    if (x02Var.z1 && x02Var.A1) {
                        i3 = 11;
                        if (dVar instanceof mu1) {
                            mu1Var = (mu1) dVar;
                        }
                    } else if (x02Var.N2 != 0) {
                        i3 = 1;
                    } else {
                        if (dVar instanceof mu1) {
                            mu1Var = (mu1) dVar;
                        }
                        i3 = 0;
                    }
                    if (!x02Var.W3.f0()) {
                        gl.t1(Q.getFragmentView().findFocus());
                        gl.t1(x02Var.c.findFocus());
                    }
                    if (hashMap.size() > 0 && arrayList.size() > 0) {
                        Object obj = hashMap.get(arrayList.get(0));
                        if (obj instanceof jm6) {
                            ((jm6) obj).a = x02Var.U0().getText();
                        }
                        if (obj instanceof nm6) {
                            ((nm6) obj).I = x02Var.U0().getText();
                        }
                    }
                    if (x02Var.K1 != null) {
                        x02Var.K1.e = allPhotosArray.get(i2) instanceof jm6 ? ((jm6) allPhotosArray.get(i2)).b : false;
                    }
                    boolean z5 = (allPhotosArray.get(i2) instanceof jm6) && ((jm6) allPhotosArray.get(i2)).M;
                    Object obj2 = allPhotosArray.get(i2);
                    if ((obj2 instanceof jm6) && chatAttachAlertPhotoLayout.Y((jm6) obj2)) {
                        return;
                    }
                    if (z5) {
                        chatAttachAlertPhotoLayout.s0(i2, false);
                    }
                    gl.e3(new k42(chatAttachAlertPhotoLayout, i3, Q, allPhotosArray, i2, mu1Var), z5 ? 250L : 0L);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // b3c
    public final void g(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        vqa vqaVar = (vqa) this.c;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.d;
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.password = tL_inputCheckPasswordSRP;
        gettmppassword.period = 600;
        ConnectionsManager.getInstance(vqaVar.a).sendRequest(gettmppassword, new poa(vqaVar, twoStepVerificationActivity, this.b, (byte) 0));
    }

    @Override // d39
    public final boolean q(View view) {
        return false;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return (xqe.a() && ((Integer) task.getResult()).intValue() == 402) ? lv6.c((Context) this.c, (Intent) this.d, this.b).continueWith(new hc((byte) 1), new w44((byte) 8)) : task;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = 0;
        switch (this.a) {
            case 0:
                d dVar = (d) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                boolean z = this.b;
                TLRPC.UserFull W1 = dVar.getMessagesController().W1(user.id);
                rgc.m(user, z, W1 != null && W1.video_calls_available, dVar.getParentActivity(), W1, dVar.getAccountInstance());
                break;
            case 1:
                m41 m41Var = (m41) this.c;
                (!this.b ? m41Var.k : m41Var.j).remove(Long.valueOf(((c4c) this.d).y));
                m41Var.e.run();
                break;
            case 2:
                z81 z81Var = (z81) this.c;
                boolean z2 = this.b;
                boolean[] zArr = (boolean[]) this.d;
                if (z2) {
                    z81Var.getClass();
                    boolean z3 = zArr[0];
                    TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                    tL_messages_deletePhoneCallHistory.revoke = z3;
                    z81Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new i81(b, z81Var, z3));
                    z81Var.x.clear();
                    z81Var.y = false;
                    z81Var.F = true;
                    z81Var.w.setVisibility(8);
                    z81Var.c.g3.O(true);
                } else {
                    z81Var.getMessagesController().V(new ArrayList(z81Var.H), null, null, 0L, 0, zArr[0], 0);
                }
                z81Var.d0(false);
                break;
            case 3:
            case 5:
            case 7:
            case 9:
            default:
                vx7 vx7Var = (vx7) this.c;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) this.d;
                boolean z4 = this.b;
                vx7Var.A1();
                vx7Var.b1(tL_secureRequiredType, null, null, true, new kw7(vx7Var, (byte) 4), new nw7(vx7Var, (byte) 6), z4);
                break;
            case 4:
                ((de1) this.c).a.n0((TLRPC.TL_username) this.d, this.b, true);
                break;
            case 6:
                c92 c92Var = (c92) this.c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
                boolean z5 = this.b;
                e92 e92Var = c92Var.a;
                e92Var.z1(tL_username, z5, true);
                e92Var.i3.a0();
                break;
            case 8:
                pd4 pd4Var = (pd4) this.c;
                gd4 gd4Var = (gd4) this.d;
                boolean z6 = this.b;
                short s = gd4Var.j;
                if (s > 0) {
                    pd4Var.E &= ~s;
                } else {
                    (z6 ? pd4Var.G : pd4Var.H).remove(Long.valueOf(gd4Var.h));
                }
                pd4Var.l0();
                pd4Var.B0();
                pd4Var.k0(true);
                if (z6) {
                    pd4Var.s0(1, false);
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
                    alertDialog$Builder.a.S = k96.M0(2131745878, null);
                    alertDialog$Builder.a.U = k96.M0(2131748007, "NoMailInstalled");
                    alertDialog$Builder.j(k96.M0(2131747638, "OK"), null);
                    dVar2.showDialog(alertDialog$Builder.a);
                    return;
                }
        }
    }

    public /* synthetic */ ch(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    public /* synthetic */ ch(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    @Override // d39
    public final void l(View view, float f, float f2) {
    }
}
