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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.webrtc.MediaStreamTrack;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.RtpSender;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bh implements fd, da9, s69, Continuation, lu2, NativeLifecycleLock.NativePointerCallable, b7c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bh(String str, e eVar, boolean z) {
        this.a = (byte) 10;
        this.b = z;
        this.d = str;
        this.c = eVar;
    }

    @Override // s69
    public final boolean C(View view) {
        return false;
    }

    @Override // da9
    public final Object a() {
        Object lambda$onCarHardwareResult$0;
        lambda$onCarHardwareResult$0 = ((CarResultStub) this.c).lambda$onCarHardwareResult$0(this.b, (h31) this.d);
        return lambda$onCarHardwareResult$0;
    }

    @Override // lu2
    public final void b(TLRPC.User user) {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        int[] iArr = (int[]) this.d;
        String str = LaunchActivity.C1;
        TLRPC.UserFull Y1 = uc7.s1(launchActivity.P).Y1(user.id);
        xkc.m(user, this.b, Y1 != null && Y1.video_calls_available, launchActivity, Y1, k5.a(iArr[0]));
    }

    @Override // org.webrtc.NativeLifecycleLock.NativePointerCallable
    public final Object call(long j) {
        Boolean lambda$setTrack$1;
        lambda$setTrack$1 = ((RtpSender) this.c).lambda$setTrack$1((MediaStreamTrack) this.d, this.b, j);
        return lambda$setTrack$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0165, code lost:
    
        if (r7.Q1 == false) goto L93;
     */
    @Override // s69
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(float f, float f2, int i, View view) {
        int i2 = i;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
        vnb vnbVar = (vnb) this.d;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.u1;
        HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
        n12 n12Var = chatAttachAlertPhotoLayout.b;
        if (chatAttachAlertPhotoLayout.w0) {
            boolean z = n12Var.P1;
            e eVar = n12Var.Z1;
            if (z) {
                return;
            }
            e Q = eVar == null ? LaunchActivity.Q() : eVar;
            if (Q == null || (view instanceof jt4)) {
                return;
            }
            u52 u52Var = chatAttachAlertPhotoLayout.H;
            try {
                if (u52Var.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0 && i2 == 0 && chatAttachAlertPhotoLayout.P0) {
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
                boolean z2 = u52Var.f;
                if (z2 && i2 == chatAttachAlertPhotoLayout.N0) {
                    chatAttachAlertPhotoLayout.k0();
                    return;
                }
                boolean z3 = this.b;
                if (i2 == 0 && z3 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                    chatAttachAlertPhotoLayout.k0();
                    return;
                }
                if (z2 && i2 > chatAttachAlertPhotoLayout.N0) {
                    i2--;
                }
                if (chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0 && z3) {
                    i2--;
                }
                zu1 zu1Var = null;
                if (chatAttachAlertPhotoLayout.h1) {
                    if (i2 == 0) {
                        if (!(view instanceof qb0)) {
                            return;
                        }
                        chatAttachAlertPhotoLayout.t0((qb0) view, null, 0L);
                        n12Var.dismiss();
                    }
                    i2--;
                }
                ArrayList<Object> allPhotosArray = chatAttachAlertPhotoLayout.getAllPhotosArray();
                if (i2 < 0 || i2 >= allPhotosArray.size()) {
                    return;
                }
                if (!(allPhotosArray.get(i2) instanceof no6) || ((no6) allPhotosArray.get(i2)).k(null)) {
                    l12 l12Var = n12Var.W3;
                    if (l12Var != null && l12Var.E0() && (allPhotosArray.get(i2) instanceof no6)) {
                        no6 no6Var = (no6) allPhotosArray.get(i2);
                        hashMap.clear();
                        if (no6Var != null) {
                            chatAttachAlertPhotoLayout.Q(no6Var, -1);
                        }
                        n12Var.F0();
                        n12Var.W3.z0(7, true, true, 0, 0, 0L, n12Var.b1(), false, 0L);
                        hashMap.clear();
                        ChatAttachAlertPhotoLayout.s1.clear();
                        arrayList.clear();
                        hashMap.clear();
                        return;
                    }
                    PhotoViewer.q0().T1(null, Q, vnbVar);
                    PhotoViewer.q0().U1(n12Var);
                    PhotoViewer q0 = PhotoViewer.q0();
                    int i4 = n12Var.P3;
                    boolean z4 = n12Var.Q3;
                    q0.h = i4;
                    q0.n = z4;
                    if (n12Var.z1 && n12Var.A1) {
                        i3 = 11;
                        if (eVar instanceof zu1) {
                            zu1Var = (zu1) eVar;
                        }
                    } else if (n12Var.N2 != 0) {
                        i3 = 1;
                    } else {
                        if (eVar instanceof zu1) {
                            zu1Var = (zu1) eVar;
                        }
                        i3 = 0;
                    }
                    if (!n12Var.W3.o()) {
                        hl.t1(Q.getFragmentView().findFocus());
                        hl.t1(n12Var.c.findFocus());
                    }
                    if (hashMap.size() > 0 && arrayList.size() > 0) {
                        Object obj = hashMap.get(arrayList.get(0));
                        if (obj instanceof no6) {
                            ((no6) obj).a = n12Var.V0().getText();
                        }
                        if (obj instanceof ro6) {
                            ((ro6) obj).I = n12Var.V0().getText();
                        }
                    }
                    if (n12Var.K1 != null) {
                        n12Var.K1.e = allPhotosArray.get(i2) instanceof no6 ? ((no6) allPhotosArray.get(i2)).b : false;
                    }
                    boolean z5 = (allPhotosArray.get(i2) instanceof no6) && ((no6) allPhotosArray.get(i2)).M;
                    Object obj2 = allPhotosArray.get(i2);
                    if ((obj2 instanceof no6) && chatAttachAlertPhotoLayout.X((no6) obj2)) {
                        return;
                    }
                    if (z5) {
                        chatAttachAlertPhotoLayout.r0(i2, false);
                    }
                    hl.d3(new a52(chatAttachAlertPhotoLayout, i3, Q, allPhotosArray, i2, zu1Var), z5 ? 250L : 0L);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // b7c
    public final void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        wua wuaVar = (wua) this.c;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.d;
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.password = tL_inputCheckPasswordSRP;
        gettmppassword.period = 600;
        ConnectionsManager.getInstance(wuaVar.a).sendRequest(gettmppassword, new qsa(wuaVar, twoStepVerificationActivity, this.b, (byte) 0));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return (rve.a() && ((Integer) task.getResult()).intValue() == 402) ? qx6.e((Context) this.c, (Intent) this.d, this.b).continueWith(new ic((byte) 1), new su3((byte) 19)) : task;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = 0;
        switch (this.a) {
            case 0:
                e eVar = (e) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                boolean z = this.b;
                TLRPC.UserFull Y1 = eVar.getMessagesController().Y1(user.id);
                xkc.m(user, z, Y1 != null && Y1.video_calls_available, eVar.getParentActivity(), Y1, eVar.getAccountInstance());
                break;
            case 1:
                u41 u41Var = (u41) this.c;
                (!this.b ? u41Var.k : u41Var.j).remove(Long.valueOf(((b8c) this.d).y));
                u41Var.e.run();
                break;
            case 2:
                i91 i91Var = (i91) this.c;
                boolean z2 = this.b;
                boolean[] zArr = (boolean[]) this.d;
                if (z2) {
                    i91Var.getClass();
                    boolean z3 = zArr[0];
                    TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                    tL_messages_deletePhoneCallHistory.revoke = z3;
                    i91Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new q81(b, i91Var, z3));
                    i91Var.x.clear();
                    i91Var.y = false;
                    i91Var.F = true;
                    i91Var.w.setVisibility(8);
                    i91Var.c.g3.O(true);
                } else {
                    i91Var.getMessagesController().X(new ArrayList(i91Var.H), null, null, 0L, 0, zArr[0], 0);
                }
                i91Var.d0(false);
                break;
            case 3:
            case 5:
            case 7:
            case 9:
            default:
                b18 b18Var = (b18) this.c;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) this.d;
                boolean z4 = this.b;
                b18Var.B1();
                b18Var.c1(tL_secureRequiredType, null, null, true, new sz7(b18Var, (byte) 4), new vz7(b18Var, (byte) 6), z4);
                break;
            case 4:
                ((me1) this.c).a.n0((TLRPC.TL_username) this.d, this.b, true);
                break;
            case 6:
                s92 s92Var = (s92) this.c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
                boolean z5 = this.b;
                u92 u92Var = s92Var.a;
                u92Var.A1(tL_username, z5, true);
                u92Var.i3.a0();
                break;
            case 8:
                nf4 nf4Var = (nf4) this.c;
                ef4 ef4Var = (ef4) this.d;
                boolean z6 = this.b;
                short s = ef4Var.j;
                if (s > 0) {
                    nf4Var.E &= ~s;
                } else {
                    (z6 ? nf4Var.G : nf4Var.H).remove(Long.valueOf(ef4Var.h));
                }
                nf4Var.l0();
                nf4Var.C0();
                nf4Var.k0(true);
                if (z6) {
                    nf4Var.s0(1, false);
                    break;
                }
                break;
            case 10:
                boolean z7 = this.b;
                String str = (String) this.d;
                e eVar2 = (e) this.c;
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
                    eVar2.getParentActivity().startActivity(Intent.createChooser(intent, "Send email..."));
                    break;
                } catch (Exception unused) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eVar2.getParentActivity());
                    alertDialog$Builder.a.S = ob6.M0(2131745798, null);
                    alertDialog$Builder.a.U = ob6.M0(2131747930, "NoMailInstalled");
                    alertDialog$Builder.j(ob6.M0(2131747558, "OK"), null);
                    eVar2.showDialog(alertDialog$Builder.a);
                    return;
                }
        }
    }

    public /* synthetic */ bh(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    public /* synthetic */ bh(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    @Override // s69
    public final void u(View view, float f, float f2) {
    }
}
