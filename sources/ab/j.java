package ab;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import androidx.car.app.hardware.common.CarResultStub;
import bi.p3;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import di.f6;
import di.l3;
import hi.c3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.ef;
import org.telegram.messenger.gd;
import org.telegram.messenger.hf;
import org.telegram.messenger.mp;
import org.telegram.messenger.t0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.voip.b2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bn;
import org.telegram.ui.ca;
import org.telegram.ui.cz;
import org.telegram.ui.go;
import org.telegram.ui.hk0;
import org.telegram.ui.i9;
import org.telegram.ui.io;
import org.telegram.ui.kz;
import org.telegram.ui.oa1;
import org.telegram.ui.ui0;
import org.telegram.ui.xi0;
import org.telegram.ui.yr;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Continuation, oa1, r1, pj0, yr, androidx.car.app.utils.a {
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

    @Override // androidx.car.app.utils.a
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
        TLRPC.UserFull d2 = mp.u1(launchActivity.P).d2(user.id);
        b2.m(user, this.b, d2 != null && d2.video_calls_available, launchActivity, d2, org.telegram.messenger.c.a(iArr[0]));
    }

    @Override // org.telegram.ui.Components.pj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x016f, code lost:
    
        if (r7.R1 != false) goto L96;
     */
    @Override // org.telegram.ui.Components.pj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(float f10, float f11, int i7, View view) {
        int i10 = i7;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
        i6 i6Var = (i6) this.d;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.u1;
        HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
        si siVar = chatAttachAlertPhotoLayout.b;
        if (chatAttachAlertPhotoLayout.w0) {
            boolean z10 = siVar.Q1;
            h2 h2Var = siVar.a2;
            if (z10) {
                return;
            }
            h2 Q = h2Var == null ? LaunchActivity.Q() : h2Var;
            if (Q == null || (view instanceof h10)) {
                return;
            }
            int i11 = Build.VERSION.SDK_INT;
            hm hmVar = chatAttachAlertPhotoLayout.H;
            try {
                if (hmVar.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0 && i10 == 0 && chatAttachAlertPhotoLayout.P0) {
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
                boolean z11 = hmVar.f;
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
                bn bnVar = null;
                if (chatAttachAlertPhotoLayout.h1) {
                    if (i10 == 0) {
                        if (!(view instanceof a9)) {
                            return;
                        }
                        chatAttachAlertPhotoLayout.u0((a9) view, null, 0L);
                        siVar.dismiss();
                    }
                    i10--;
                }
                ArrayList<Object> allPhotosArray = chatAttachAlertPhotoLayout.getAllPhotosArray();
                if (i10 < 0 || i10 >= allPhotosArray.size()) {
                    return;
                }
                if (!(allPhotosArray.get(i10) instanceof ef) || ((ef) allPhotosArray.get(i10)).k(null)) {
                    qi qiVar = siVar.X3;
                    if (qiVar != null && qiVar.V1() && (allPhotosArray.get(i10) instanceof ef)) {
                        ef efVar = (ef) allPhotosArray.get(i10);
                        hashMap.clear();
                        if (efVar != null) {
                            chatAttachAlertPhotoLayout.T(efVar, -1);
                        }
                        siVar.N0();
                        siVar.X3.y1(7, true, true, 0, 0, 0L, siVar.g1(), false, 0L);
                        hashMap.clear();
                        ChatAttachAlertPhotoLayout.s1.clear();
                        arrayList.clear();
                        hashMap.clear();
                        return;
                    }
                    PhotoViewer.p1().I2(null, Q, i6Var);
                    PhotoViewer.p1().J2(siVar);
                    PhotoViewer p12 = PhotoViewer.p1();
                    int i13 = siVar.Q3;
                    boolean z13 = siVar.R3;
                    p12.h = i13;
                    p12.n = z13;
                    if (siVar.A1 && siVar.B1) {
                        i12 = 11;
                        if (h2Var instanceof bn) {
                            bnVar = (bn) h2Var;
                        }
                    } else if (siVar.O2 != 0) {
                        i12 = 1;
                    } else {
                        if (h2Var instanceof bn) {
                            bnVar = (bn) h2Var;
                        }
                        i12 = 0;
                    }
                    if (!siVar.X3.g0()) {
                        org.telegram.messenger.g0.v1(Q.getFragmentView().findFocus());
                        org.telegram.messenger.g0.v1(siVar.c.findFocus());
                    }
                    if (hashMap.size() > 0 && arrayList.size() > 0) {
                        Object obj = hashMap.get(arrayList.get(0));
                        if (obj instanceof ef) {
                            ((ef) obj).a = siVar.b1().getText();
                        }
                        if (obj instanceof hf) {
                            ((hf) obj).I = siVar.b1().getText();
                        }
                    }
                    if (siVar.L1 != null) {
                        siVar.L1.e = allPhotosArray.get(i10) instanceof ef ? ((ef) allPhotosArray.get(i10)).b : false;
                    }
                    boolean z14 = (allPhotosArray.get(i10) instanceof ef) && ((ef) allPhotosArray.get(i10)).M;
                    Object obj2 = allPhotosArray.get(i10);
                    if ((obj2 instanceof ef) && chatAttachAlertPhotoLayout.a0((ef) obj2)) {
                        return;
                    }
                    if (z14) {
                        chatAttachAlertPhotoLayout.s0(i10, false);
                    }
                    org.telegram.messenger.g0.h3(new p3(chatAttachAlertPhotoLayout, i12, Q, allPhotosArray, i10, bnVar), z14 ? 250L : 0L);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(u1 u1Var, int i7) {
        switch (this.a) {
            case 2:
                kg.a0 a0Var = (kg.a0) this.c;
                (!this.b ? a0Var.k : a0Var.j).remove(Long.valueOf(((l41) this.d).y));
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
                    i9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new c3(2, i9Var, z11));
                    i9Var.x.clear();
                    i9Var.y = false;
                    i9Var.F = true;
                    i9Var.w.setVisibility(8);
                    i9Var.c.g3.O(true);
                } else {
                    i9Var.getMessagesController().Z(new ArrayList(i9Var.H), null, null, 0L, 0, zArr[0], 0);
                }
                i9Var.j0(false);
                break;
            case 4:
                ((ca) this.c).a.o0((TLRPC.TL_username) this.d, this.b, true);
                break;
            case 5:
                go goVar = (go) this.c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
                boolean z12 = this.b;
                io ioVar = goVar.a;
                ioVar.z1(tL_username, z12, true);
                ioVar.i3.b0();
                break;
            case 6:
                h2 h2Var = (h2) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                boolean z13 = this.b;
                TLRPC.UserFull d2 = h2Var.getMessagesController().d2(user.id);
                b2.m(user, z13, d2 != null && d2.video_calls_available, h2Var.getParentActivity(), d2, h2Var.getAccountInstance());
                break;
            case 7:
            case 9:
            default:
                hk0 hk0Var = (hk0) this.c;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) this.d;
                boolean z14 = this.b;
                hk0Var.C1();
                hk0Var.n1(tL_secureRequiredType, null, null, true, new ui0(hk0Var, 4), new xi0(hk0Var, 6), z14);
                break;
            case 8:
                kz kzVar = (kz) this.c;
                cz czVar = (cz) this.d;
                boolean z15 = this.b;
                int i10 = czVar.j;
                if (i10 > 0) {
                    kzVar.E &= ~i10;
                } else {
                    (z15 ? kzVar.G : kzVar.H).remove(Long.valueOf(czVar.h));
                }
                kzVar.p0();
                kzVar.C0();
                kzVar.o0(true);
                if (z15) {
                    kzVar.t0(1, false);
                    break;
                }
                break;
            case 10:
                boolean z16 = this.b;
                String str = (String) this.c;
                h2 h2Var2 = (h2) this.d;
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
                    h2Var2.getParentActivity().startActivity(Intent.createChooser(intent, "Send email..."));
                    break;
                } catch (Exception unused) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h2Var2.getParentActivity());
                    alertDialog$Builder.a.S = gd.M0(2131745876, null);
                    alertDialog$Builder.a.U = gd.M0(2131748007, "NoMailInstalled");
                    alertDialog$Builder.k(gd.M0(2131747638, "OK"), null);
                    h2Var2.showDialog(alertDialog$Builder.a);
                    return;
                }
        }
    }

    @Override // org.telegram.ui.oa1
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        f6 f6Var = (f6) this.c;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.d;
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.password = tL_inputCheckPasswordSRP;
        gettmppassword.period = 600;
        ConnectionsManager.getInstance(f6Var.a).sendRequest(gettmppassword, new l3(f6Var, twoStepVerificationActivity, this.b, 0));
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

    public /* synthetic */ j(String str, h2 h2Var, boolean z10) {
        this.a = 10;
        this.b = z10;
        this.c = str;
        this.d = h2Var;
    }

    @Override // org.telegram.ui.Components.pj0
    public /* synthetic */ void s0(View view, float f10, float f11) {
    }
}
