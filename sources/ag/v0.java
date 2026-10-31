package ag;

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
import org.telegram.messenger.cd;
import org.telegram.messenger.ef;
import org.telegram.messenger.hf;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.bm;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.m10;
import org.telegram.ui.Components.q8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a00;
import org.telegram.ui.ak0;
import org.telegram.ui.bp;
import org.telegram.ui.ea;
import org.telegram.ui.gc1;
import org.telegram.ui.i00;
import org.telegram.ui.j9;
import org.telegram.ui.ll0;
import org.telegram.ui.un;
import org.telegram.ui.vs;
import org.telegram.ui.xj0;
import org.telegram.ui.zo;
import rh.e4;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements org.telegram.ui.ActionBar.u1, hk0, vs, androidx.car.app.utils.b, gc1, Continuation {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v0(Object obj, Object obj2, boolean z10, int i10) {
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

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0159, code lost:
    
        if (r7.N1 != false) goto L91;
     */
    @Override // org.telegram.ui.Components.hk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(float f7, float f10, int i10, View view) {
        int i11 = i10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
        p6 p6Var = (p6) this.d;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.t1;
        HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
        bi biVar = chatAttachAlertPhotoLayout.b;
        if (chatAttachAlertPhotoLayout.v0) {
            boolean z10 = biVar.M1;
            org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
            if (z10) {
                return;
            }
            org.telegram.ui.ActionBar.k2 Q = k2Var == null ? LaunchActivity.Q() : k2Var;
            if (Q == null || (view instanceof m10)) {
                return;
            }
            int i12 = Build.VERSION.SDK_INT;
            bm bmVar = chatAttachAlertPhotoLayout.G;
            try {
                if (bmVar.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0 && i11 == 0 && chatAttachAlertPhotoLayout.O0) {
                    Q.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                    return;
                }
                int i13 = 4;
                if (chatAttachAlertPhotoLayout.P0) {
                    if (i12 >= 33) {
                        Q.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                        return;
                    } else {
                        Q.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                        return;
                    }
                }
                boolean z11 = bmVar.f;
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
                un unVar = null;
                if (chatAttachAlertPhotoLayout.g1) {
                    if (i11 == 0) {
                        if (!(view instanceof q8)) {
                            return;
                        }
                        chatAttachAlertPhotoLayout.s0((q8) view, null, 0L);
                        biVar.dismiss();
                    }
                    i11--;
                }
                ArrayList<Object> allPhotosArray = chatAttachAlertPhotoLayout.getAllPhotosArray();
                if (i11 < 0 || i11 >= allPhotosArray.size()) {
                    return;
                }
                ai aiVar = biVar.T3;
                if (aiVar != null && aiVar.a1() && (allPhotosArray.get(i11) instanceof ef)) {
                    ef efVar = (ef) allPhotosArray.get(i11);
                    hashMap.clear();
                    if (efVar != null) {
                        chatAttachAlertPhotoLayout.R(efVar, -1);
                    }
                    biVar.M0();
                    biVar.T3.H0(7, true, true, 0, 0, 0L, biVar.e1(), false, 0L);
                    hashMap.clear();
                    ChatAttachAlertPhotoLayout.r1.clear();
                    arrayList.clear();
                    hashMap.clear();
                    return;
                }
                PhotoViewer.v1().N2(null, Q, p6Var);
                PhotoViewer.v1().O2(biVar);
                PhotoViewer v12 = PhotoViewer.v1();
                int i14 = biVar.M3;
                boolean z13 = biVar.N3;
                v12.h = i14;
                v12.n = z13;
                if (biVar.w1 && biVar.x1) {
                    i13 = 11;
                    if (k2Var instanceof un) {
                        unVar = (un) k2Var;
                    }
                } else if (biVar.K2 != 0) {
                    i13 = 1;
                } else {
                    if (k2Var instanceof un) {
                        unVar = (un) k2Var;
                    }
                    i13 = 0;
                }
                if (!biVar.T3.D()) {
                    org.telegram.messenger.i0.v1(Q.getFragmentView().findFocus());
                    org.telegram.messenger.i0.v1(biVar.c.findFocus());
                }
                if (hashMap.size() > 0 && arrayList.size() > 0) {
                    Object obj = hashMap.get(arrayList.get(0));
                    if (obj instanceof ef) {
                        ((ef) obj).a = biVar.Z0().getText();
                    }
                    if (obj instanceof hf) {
                        ((hf) obj).I = biVar.Z0().getText();
                    }
                }
                if (biVar.H1 != null) {
                    biVar.H1.e = allPhotosArray.get(i11) instanceof ef ? ((ef) allPhotosArray.get(i11)).b : false;
                }
                boolean z14 = (allPhotosArray.get(i11) instanceof ef) && ((ef) allPhotosArray.get(i11)).M;
                Object obj2 = allPhotosArray.get(i11);
                if ((obj2 instanceof ef) && chatAttachAlertPhotoLayout.Y((ef) obj2)) {
                    return;
                }
                if (z14) {
                    chatAttachAlertPhotoLayout.q0(i11, false);
                }
                org.telegram.messenger.i0.h3(new bi.k0(chatAttachAlertPhotoLayout, i13, Q, allPhotosArray, i11, unVar), z14 ? 250L : 0L);
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.vs
    public void c(TLRPC.User user) {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        int[] iArr = (int[]) this.d;
        Pattern pattern = LaunchActivity.D1;
        TLRPC.UserFull a2 = vp.r1(launchActivity.O).a2(user.id);
        org.telegram.ui.Components.voip.m1.m(user, this.b, a2 != null && a2.video_calls_available, launchActivity, a2, org.telegram.messenger.c.a(iArr[0]));
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        int i11 = 1;
        switch (this.a) {
            case 0:
                x0 x0Var = (x0) this.c;
                (!this.b ? x0Var.k : x0Var.j).remove(Long.valueOf(((a51) this.d).x));
                x0Var.e.run();
                break;
            case 1:
                j9 j9Var = (j9) this.c;
                boolean z10 = this.b;
                boolean[] zArr = (boolean[]) this.d;
                if (z10) {
                    boolean z11 = zArr[0];
                    TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                    tL_messages_deletePhoneCallHistory.revoke = z11;
                    j9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new org.telegram.messenger.voip.u0(i11, j9Var, z11));
                    j9Var.y.clear();
                    j9Var.D = false;
                    j9Var.F = true;
                    j9Var.x.setVisibility(8);
                    j9Var.c.f3.O(true);
                } else {
                    j9Var.getMessagesController().Z(new ArrayList(j9Var.H), null, null, 0L, 0, zArr[0], 0);
                }
                j9Var.i0(false);
                break;
            case 2:
                ((ea) this.c).a.n0((TLRPC.TL_username) this.d, this.b, true);
                break;
            case 3:
                zo zoVar = (zo) this.c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
                boolean z12 = this.b;
                bp bpVar = zoVar.a;
                bpVar.z1(tL_username, z12, true);
                bpVar.h3.a0();
                break;
            case 4:
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                boolean z13 = this.b;
                TLRPC.UserFull a2 = k2Var.getMessagesController().a2(user.id);
                org.telegram.ui.Components.voip.m1.m(user, z13, a2 != null && a2.video_calls_available, k2Var.getParentActivity(), a2, k2Var.getAccountInstance());
                break;
            case 5:
            case 7:
            default:
                ll0 ll0Var = (ll0) this.c;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) this.d;
                boolean z14 = this.b;
                ll0Var.B1();
                ll0Var.m1(tL_secureRequiredType, null, null, true, new xj0(ll0Var, 4), new ak0(ll0Var, 6), z14);
                break;
            case 6:
                i00 i00Var = (i00) this.c;
                a00 a00Var = (a00) this.d;
                boolean z15 = this.b;
                int i12 = a00Var.j;
                if (i12 > 0) {
                    i00Var.D &= ~i12;
                } else {
                    (z15 ? i00Var.F : i00Var.G).remove(Long.valueOf(a00Var.h));
                }
                i00Var.o0();
                i00Var.B0();
                i00Var.n0(true);
                if (z15) {
                    i00Var.s0(1, false);
                    break;
                }
                break;
            case 8:
                boolean z16 = this.b;
                String str = (String) this.c;
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) this.d;
                try {
                    PackageInfo packageInfo = org.telegram.messenger.w0.b.getPackageManager().getPackageInfo(org.telegram.messenger.w0.b.getPackageName(), 0);
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
                    k2Var2.getParentActivity().startActivity(Intent.createChooser(intent, "Send email..."));
                    break;
                } catch (Exception unused) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k2Var2.getParentActivity());
                    alertDialog$Builder.a.R = cd.L0(2131746088, null);
                    alertDialog$Builder.a.T = cd.L0(2131748216, "NoMailInstalled");
                    alertDialog$Builder.k(cd.L0(2131747847, "OK"), null);
                    k2Var2.showDialog(alertDialog$Builder.a);
                    return;
                }
        }
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ boolean h1(View view) {
        return false;
    }

    @Override // org.telegram.ui.gc1
    public void m(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        e4 e4Var = (e4) this.c;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.d;
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.password = tL_inputCheckPasswordSRP;
        gettmppassword.period = 600;
        ConnectionsManager.getInstance(e4Var.a).sendRequest(gettmppassword, new rh.a2(e4Var, twoStepVerificationActivity, this.b, 0));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return (u6.b.d() && ((Integer) task.getResult()).intValue() == 402) ? xa.g.a((Context) this.c, (Intent) this.d, this.b).continueWith(new a3.b(3), new th.m1(23)) : task;
    }

    public /* synthetic */ v0(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }

    public /* synthetic */ v0(String str, org.telegram.ui.ActionBar.k2 k2Var, boolean z10) {
        this.a = 8;
        this.b = z10;
        this.c = str;
        this.d = k2Var;
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
