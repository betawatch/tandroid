package ci;

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
import org.telegram.messenger.bd;
import org.telegram.messenger.bf;
import org.telegram.messenger.hp;
import org.telegram.messenger.ye;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.sl;
import org.telegram.ui.Components.zh;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ao;
import org.telegram.ui.ca1;
import org.telegram.ui.ez;
import org.telegram.ui.mi0;
import org.telegram.ui.pi0;
import org.telegram.ui.tr;
import org.telegram.ui.vy;
import org.telegram.ui.wm;
import org.telegram.ui.yj0;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l3 implements ca1, org.telegram.ui.ActionBar.p1, gj0, tr, androidx.car.app.utils.a, Continuation {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l3(Object obj, Object obj2, boolean z10, int i3) {
        this.a = i3;
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

    /* JADX WARN: Code restructure failed: missing block: B:132:0x016f, code lost:
    
        if (r7.O1 != false) goto L96;
     */
    @Override // org.telegram.ui.Components.gj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(float f10, float f11, int i3, View view) {
        int i10 = i3;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
        org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.u1;
        HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
        bi biVar = chatAttachAlertPhotoLayout.b;
        if (chatAttachAlertPhotoLayout.w0) {
            boolean z10 = biVar.N1;
            org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
            if (z10) {
                return;
            }
            org.telegram.ui.ActionBar.d2 Q = d2Var == null ? LaunchActivity.Q() : d2Var;
            if (Q == null || (view instanceof s00)) {
                return;
            }
            int i11 = Build.VERSION.SDK_INT;
            sl slVar = chatAttachAlertPhotoLayout.H;
            try {
                if (slVar.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0 && i10 == 0 && chatAttachAlertPhotoLayout.P0) {
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
                boolean z11 = slVar.f;
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
                wm wmVar = null;
                if (chatAttachAlertPhotoLayout.h1) {
                    if (i10 == 0) {
                        if (!(view instanceof org.telegram.ui.Components.t8)) {
                            return;
                        }
                        chatAttachAlertPhotoLayout.u0((org.telegram.ui.Components.t8) view, null, 0L);
                        biVar.dismiss();
                    }
                    i10--;
                }
                ArrayList<Object> allPhotosArray = chatAttachAlertPhotoLayout.getAllPhotosArray();
                if (i10 < 0 || i10 >= allPhotosArray.size()) {
                    return;
                }
                if (!(allPhotosArray.get(i10) instanceof ye) || ((ye) allPhotosArray.get(i10)).k(null)) {
                    zh zhVar = biVar.U3;
                    if (zhVar != null && zhVar.L1() && (allPhotosArray.get(i10) instanceof ye)) {
                        ye yeVar = (ye) allPhotosArray.get(i10);
                        hashMap.clear();
                        if (yeVar != null) {
                            chatAttachAlertPhotoLayout.S(yeVar, -1);
                        }
                        biVar.M0();
                        biVar.U3.o1(7, true, true, 0, 0, 0L, biVar.f1(), false, 0L);
                        hashMap.clear();
                        ChatAttachAlertPhotoLayout.s1.clear();
                        arrayList.clear();
                        hashMap.clear();
                        return;
                    }
                    PhotoViewer.v1().N2(null, Q, e6Var);
                    PhotoViewer.v1().O2(biVar);
                    PhotoViewer v12 = PhotoViewer.v1();
                    int i13 = biVar.N3;
                    boolean z13 = biVar.O3;
                    v12.h = i13;
                    v12.n = z13;
                    if (biVar.x1 && biVar.y1) {
                        i12 = 11;
                        if (d2Var instanceof wm) {
                            wmVar = (wm) d2Var;
                        }
                    } else if (biVar.L2 != 0) {
                        i12 = 1;
                    } else {
                        if (d2Var instanceof wm) {
                            wmVar = (wm) d2Var;
                        }
                        i12 = 0;
                    }
                    if (!biVar.U3.g0()) {
                        org.telegram.messenger.g0.v1(Q.getFragmentView().findFocus());
                        org.telegram.messenger.g0.v1(biVar.c.findFocus());
                    }
                    if (hashMap.size() > 0 && arrayList.size() > 0) {
                        Object obj = hashMap.get(arrayList.get(0));
                        if (obj instanceof ye) {
                            ((ye) obj).a = biVar.a1().getText();
                        }
                        if (obj instanceof bf) {
                            ((bf) obj).I = biVar.a1().getText();
                        }
                    }
                    if (biVar.I1 != null) {
                        biVar.I1.e = allPhotosArray.get(i10) instanceof ye ? ((ye) allPhotosArray.get(i10)).b : false;
                    }
                    boolean z14 = (allPhotosArray.get(i10) instanceof ye) && ((ye) allPhotosArray.get(i10)).M;
                    Object obj2 = allPhotosArray.get(i10);
                    if ((obj2 instanceof ye) && chatAttachAlertPhotoLayout.a0((ye) obj2)) {
                        return;
                    }
                    if (z14) {
                        chatAttachAlertPhotoLayout.s0(i10, false);
                    }
                    org.telegram.messenger.g0.i3(new mi.g0(chatAttachAlertPhotoLayout, i12, Q, allPhotosArray, i10, wmVar), z14 ? 250L : 0L);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.tr
    public void c(TLRPC.User user) {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        int[] iArr = (int[]) this.d;
        String str = LaunchActivity.E1;
        TLRPC.UserFull b22 = hp.s1(launchActivity.P).b2(user.id);
        org.telegram.ui.Components.voip.n1.m(user, this.b, b22 != null && b22.video_calls_available, launchActivity, b22, org.telegram.messenger.c.a(iArr[0]));
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 1:
                lg.b0 b0Var = (lg.b0) this.c;
                (!this.b ? b0Var.k : b0Var.j).remove(Long.valueOf(((r31) this.d).x));
                b0Var.e.run();
                break;
            case 2:
                org.telegram.ui.h9 h9Var = (org.telegram.ui.h9) this.c;
                boolean z10 = this.b;
                boolean[] zArr = (boolean[]) this.d;
                if (z10) {
                    boolean z11 = zArr[0];
                    TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                    tL_messages_deletePhoneCallHistory.revoke = z11;
                    h9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new gi.b3(2, h9Var, z11));
                    h9Var.y.clear();
                    h9Var.E = false;
                    h9Var.G = true;
                    h9Var.x.setVisibility(8);
                    h9Var.c.g3.O(true);
                } else {
                    h9Var.getMessagesController().Z(new ArrayList(h9Var.I), null, null, 0L, 0, zArr[0], 0);
                }
                h9Var.j0(false);
                break;
            case 3:
                ((org.telegram.ui.ba) this.c).a.o0((TLRPC.TL_username) this.d, this.b, true);
                break;
            case 4:
                yn ynVar = (yn) this.c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
                boolean z12 = this.b;
                ao aoVar = ynVar.a;
                aoVar.z1(tL_username, z12, true);
                aoVar.i3.b0();
                break;
            case 5:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                boolean z13 = this.b;
                TLRPC.UserFull b22 = d2Var.getMessagesController().b2(user.id);
                org.telegram.ui.Components.voip.n1.m(user, z13, b22 != null && b22.video_calls_available, d2Var.getParentActivity(), b22, d2Var.getAccountInstance());
                break;
            case 6:
            case 8:
            default:
                yj0 yj0Var = (yj0) this.c;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) this.d;
                boolean z14 = this.b;
                yj0Var.C1();
                yj0Var.n1(tL_secureRequiredType, null, null, true, new mi0(yj0Var, 4), new pi0(yj0Var, 6), z14);
                break;
            case 7:
                ez ezVar = (ez) this.c;
                vy vyVar = (vy) this.d;
                boolean z15 = this.b;
                int i10 = vyVar.j;
                if (i10 > 0) {
                    ezVar.E &= ~i10;
                } else {
                    (z15 ? ezVar.G : ezVar.H).remove(Long.valueOf(vyVar.h));
                }
                ezVar.p0();
                ezVar.C0();
                ezVar.o0(true);
                if (z15) {
                    ezVar.t0(1, false);
                    break;
                }
                break;
            case 9:
                boolean z16 = this.b;
                String str = (String) this.c;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) this.d;
                try {
                    PackageInfo packageInfo = org.telegram.messenger.t0.b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.b.getPackageName(), 0);
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
                    d2Var2.getParentActivity().startActivity(Intent.createChooser(intent, "Send email..."));
                    break;
                } catch (Exception unused) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d2Var2.getParentActivity());
                    alertDialog$Builder.a.S = bd.M0(2131746081, null);
                    alertDialog$Builder.a.U = bd.M0(2131748207, "NoMailInstalled");
                    alertDialog$Builder.k(bd.M0(2131747839, "OK"), null);
                    d2Var2.showDialog(alertDialog$Builder.a);
                    return;
                }
        }
    }

    @Override // org.telegram.ui.ca1
    public void l(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        l6 l6Var = (l6) this.c;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.d;
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.password = tL_inputCheckPasswordSRP;
        gettmppassword.period = 600;
        ConnectionsManager.getInstance(l6Var.a).sendRequest(gettmppassword, new s3(l6Var, twoStepVerificationActivity, this.b, 0));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return (w6.b.d() && ((Integer) task.getResult()).intValue() == 402) ? za.g.a((Context) this.c, (Intent) this.d, this.b).continueWith(new c3.b(3), new z9.j(5)) : task;
    }

    public /* synthetic */ l3(Object obj, boolean z10, Object obj2, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }

    public /* synthetic */ l3(String str, org.telegram.ui.ActionBar.d2 d2Var, boolean z10) {
        this.a = 9;
        this.b = z10;
        this.c = str;
        this.d = d2Var;
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
