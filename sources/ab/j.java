package ab;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import androidx.car.app.hardware.common.CarResultStub;
import bi.i4;
import bi.k7;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import fi.d3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.gf;
import org.telegram.messenger.hd;
import org.telegram.messenger.kf;
import org.telegram.messenger.qp;
import org.telegram.messenger.t0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.tl;
import org.telegram.ui.Components.v8;
import org.telegram.ui.Components.voip.y1;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.x31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.an;
import org.telegram.ui.bk0;
import org.telegram.ui.ca;
import org.telegram.ui.co;
import org.telegram.ui.fo;
import org.telegram.ui.gz;
import org.telegram.ui.i9;
import org.telegram.ui.la1;
import org.telegram.ui.pi0;
import org.telegram.ui.si0;
import org.telegram.ui.vr;
import org.telegram.ui.yy;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Continuation, la1, r1, cj0, vr, androidx.car.app.utils.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j(Object obj, Object obj2, boolean z9, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = z9;
    }

    @Override // androidx.car.app.utils.a
    public Object a() {
        Object lambda$onCarHardwareResult$0;
        lambda$onCarHardwareResult$0 = ((CarResultStub) this.c).lambda$onCarHardwareResult$0(this.b, (w.b) this.d);
        return lambda$onCarHardwareResult$0;
    }

    @Override // org.telegram.ui.vr
    public void b(TLRPC.User user) {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        int[] iArr = (int[]) this.d;
        String str = LaunchActivity.B1;
        TLRPC.UserFull b22 = qp.s1(launchActivity.O).b2(user.id);
        y1.m(user, this.b, b22 != null && b22.video_calls_available, launchActivity, b22, org.telegram.messenger.c.a(iArr[0]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x016f, code lost:
    
        if (r7.N1 != false) goto L96;
     */
    @Override // org.telegram.ui.Components.cj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(float f10, float f11, int i7, View view) {
        int i10 = i7;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
        f6 f6Var = (f6) this.d;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.t1;
        HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
        di diVar = chatAttachAlertPhotoLayout.b;
        if (chatAttachAlertPhotoLayout.v0) {
            boolean z9 = diVar.M1;
            f2 f2Var = diVar.W1;
            if (z9) {
                return;
            }
            f2 Q = f2Var == null ? LaunchActivity.Q() : f2Var;
            if (Q == null || (view instanceof w00)) {
                return;
            }
            int i11 = Build.VERSION.SDK_INT;
            tl tlVar = chatAttachAlertPhotoLayout.G;
            try {
                if (tlVar.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0 && i10 == 0 && chatAttachAlertPhotoLayout.O0) {
                    Q.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                    return;
                }
                int i12 = 4;
                if (chatAttachAlertPhotoLayout.P0) {
                    if (i11 >= 33) {
                        Q.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                        return;
                    } else {
                        Q.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                        return;
                    }
                }
                boolean z10 = tlVar.f;
                if (z10 && i10 == chatAttachAlertPhotoLayout.M0) {
                    chatAttachAlertPhotoLayout.l0();
                    return;
                }
                boolean z11 = this.b;
                if (i10 == 0 && z11 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                    chatAttachAlertPhotoLayout.l0();
                    return;
                }
                if (z10 && i10 > chatAttachAlertPhotoLayout.M0) {
                    i10--;
                }
                if (chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0 && z11) {
                    i10--;
                }
                an anVar = null;
                if (chatAttachAlertPhotoLayout.g1) {
                    if (i10 == 0) {
                        if (!(view instanceof v8)) {
                            return;
                        }
                        chatAttachAlertPhotoLayout.u0((v8) view, null, 0L);
                        diVar.dismiss();
                    }
                    i10--;
                }
                ArrayList<Object> allPhotosArray = chatAttachAlertPhotoLayout.getAllPhotosArray();
                if (i10 < 0 || i10 >= allPhotosArray.size()) {
                    return;
                }
                if (!(allPhotosArray.get(i10) instanceof gf) || ((gf) allPhotosArray.get(i10)).k(null)) {
                    bi biVar = diVar.T3;
                    if (biVar != null && biVar.G1() && (allPhotosArray.get(i10) instanceof gf)) {
                        gf gfVar = (gf) allPhotosArray.get(i10);
                        hashMap.clear();
                        if (gfVar != null) {
                            chatAttachAlertPhotoLayout.S(gfVar, -1);
                        }
                        diVar.M0();
                        diVar.T3.o1(7, true, true, 0, 0, 0L, diVar.f1(), false, 0L);
                        hashMap.clear();
                        ChatAttachAlertPhotoLayout.r1.clear();
                        arrayList.clear();
                        hashMap.clear();
                        return;
                    }
                    PhotoViewer.p1().H2(null, Q, f6Var);
                    PhotoViewer.p1().I2(diVar);
                    PhotoViewer p12 = PhotoViewer.p1();
                    int i13 = diVar.M3;
                    boolean z12 = diVar.N3;
                    p12.h = i13;
                    p12.n = z12;
                    if (diVar.w1 && diVar.x1) {
                        i12 = 11;
                        if (f2Var instanceof an) {
                            anVar = (an) f2Var;
                        }
                    } else if (diVar.K2 != 0) {
                        i12 = 1;
                    } else {
                        if (f2Var instanceof an) {
                            anVar = (an) f2Var;
                        }
                        i12 = 0;
                    }
                    if (!diVar.T3.f0()) {
                        org.telegram.messenger.g0.v1(Q.getFragmentView().findFocus());
                        org.telegram.messenger.g0.v1(diVar.c.findFocus());
                    }
                    if (hashMap.size() > 0 && arrayList.size() > 0) {
                        Object obj = hashMap.get(arrayList.get(0));
                        if (obj instanceof gf) {
                            ((gf) obj).a = diVar.a1().getText();
                        }
                        if (obj instanceof kf) {
                            ((kf) obj).I = diVar.a1().getText();
                        }
                    }
                    if (diVar.H1 != null) {
                        diVar.H1.e = allPhotosArray.get(i10) instanceof gf ? ((gf) allPhotosArray.get(i10)).b : false;
                    }
                    boolean z13 = (allPhotosArray.get(i10) instanceof gf) && ((gf) allPhotosArray.get(i10)).M;
                    Object obj2 = allPhotosArray.get(i10);
                    if ((obj2 instanceof gf) && chatAttachAlertPhotoLayout.a0((gf) obj2)) {
                        return;
                    }
                    if (z13) {
                        chatAttachAlertPhotoLayout.s0(i10, false);
                    }
                    org.telegram.messenger.g0.i3(new li.g0(chatAttachAlertPhotoLayout, i12, Q, allPhotosArray, i10, anVar), z13 ? 250L : 0L);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(u1 u1Var, int i7) {
        switch (this.a) {
            case 2:
                kg.a0 a0Var = (kg.a0) this.c;
                (!this.b ? a0Var.k : a0Var.j).remove(Long.valueOf(((x31) this.d).x));
                a0Var.e.run();
                break;
            case 3:
                i9 i9Var = (i9) this.c;
                boolean z9 = this.b;
                boolean[] zArr = (boolean[]) this.d;
                if (z9) {
                    boolean z10 = zArr[0];
                    TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                    tL_messages_deletePhoneCallHistory.revoke = z10;
                    i9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new d3(2, i9Var, z10));
                    i9Var.y.clear();
                    i9Var.D = false;
                    i9Var.F = true;
                    i9Var.x.setVisibility(8);
                    i9Var.c.f3.O(true);
                } else {
                    i9Var.getMessagesController().Z(new ArrayList(i9Var.H), null, null, 0L, 0, zArr[0], 0);
                }
                i9Var.j0(false);
                break;
            case 4:
                ((ca) this.c).a.o0((TLRPC.TL_username) this.d, this.b, true);
                break;
            case 5:
                co coVar = (co) this.c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
                boolean z11 = this.b;
                fo foVar = coVar.a;
                foVar.z1(tL_username, z11, true);
                foVar.h3.b0();
                break;
            case 6:
                f2 f2Var = (f2) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                boolean z12 = this.b;
                TLRPC.UserFull b22 = f2Var.getMessagesController().b2(user.id);
                y1.m(user, z12, b22 != null && b22.video_calls_available, f2Var.getParentActivity(), b22, f2Var.getAccountInstance());
                break;
            case 7:
            case 9:
            default:
                bk0 bk0Var = (bk0) this.c;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) this.d;
                boolean z13 = this.b;
                bk0Var.C1();
                bk0Var.n1(tL_secureRequiredType, null, null, true, new pi0(bk0Var, 4), new si0(bk0Var, 6), z13);
                break;
            case 8:
                gz gzVar = (gz) this.c;
                yy yyVar = (yy) this.d;
                boolean z14 = this.b;
                int i10 = yyVar.j;
                if (i10 > 0) {
                    gzVar.D &= ~i10;
                } else {
                    (z14 ? gzVar.F : gzVar.G).remove(Long.valueOf(yyVar.h));
                }
                gzVar.p0();
                gzVar.C0();
                gzVar.o0(true);
                if (z14) {
                    gzVar.t0(1, false);
                    break;
                }
                break;
            case 10:
                boolean z15 = this.b;
                String str = (String) this.c;
                f2 f2Var2 = (f2) this.d;
                try {
                    PackageInfo packageInfo = t0.b.getPackageManager().getPackageInfo(t0.b.getPackageName(), 0);
                    Locale locale = Locale.US;
                    String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                    Intent intent = new Intent("android.intent.action.SENDTO");
                    intent.setData(Uri.parse("mailto:"));
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{z15 ? "recover@telegram.org" : "login@stel.com"});
                    if (z15) {
                        intent.putExtra("android.intent.extra.SUBJECT", "Banned phone number: " + str);
                        intent.putExtra("android.intent.extra.TEXT", "I'm trying to use my mobile phone number: " + str + "\nBut Telegram says it's banned. Please help.\n\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault());
                    } else {
                        intent.putExtra("android.intent.extra.SUBJECT", "Invalid phone number: " + str);
                        intent.putExtra("android.intent.extra.TEXT", "I'm trying to use my mobile phone number: " + str + "\nBut Telegram says it's invalid. Please help.\n\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault());
                    }
                    f2Var2.getParentActivity().startActivity(Intent.createChooser(intent, "Send email..."));
                    break;
                } catch (Exception unused) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f2Var2.getParentActivity());
                    alertDialog$Builder.a.R = hd.M0(2131746072, null);
                    alertDialog$Builder.a.T = hd.M0(2131748198, "NoMailInstalled");
                    alertDialog$Builder.k(hd.M0(2131747830, "OK"), null);
                    f2Var2.showDialog(alertDialog$Builder.a);
                    return;
                }
        }
    }

    @Override // org.telegram.ui.la1
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        k7 k7Var = (k7) this.c;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.d;
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.password = tL_inputCheckPasswordSRP;
        gettmppassword.period = 600;
        ConnectionsManager.getInstance(k7Var.a).sendRequest(gettmppassword, new i4(k7Var, twoStepVerificationActivity, this.b, 0));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return (x6.b.d() && ((Integer) task.getResult()).intValue() == 402) ? k.a((Context) this.c, (Intent) this.d, this.b).continueWith(new d3.b(3), new a3.l(7)) : task;
    }

    public /* synthetic */ j(Object obj, boolean z9, Object obj2, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = z9;
        this.d = obj2;
    }

    public /* synthetic */ j(String str, f2 f2Var, boolean z9) {
        this.a = 10;
        this.b = z9;
        this.c = str;
        this.d = f2Var;
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
