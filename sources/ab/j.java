package ab;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import androidx.car.app.hardware.common.CarResultStub;
import bi.v3;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import di.f6;
import di.l3;
import hi.k3;
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
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.i10;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.voip.c2;
import org.telegram.ui.Components.z8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bn;
import org.telegram.ui.bz;
import org.telegram.ui.ca;
import org.telegram.ui.fk0;
import org.telegram.ui.fo;
import org.telegram.ui.ho;
import org.telegram.ui.j9;
import org.telegram.ui.jz;
import org.telegram.ui.ma1;
import org.telegram.ui.si0;
import org.telegram.ui.vi0;
import org.telegram.ui.yr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Continuation, ma1, q1, rj0, yr, androidx.car.app.utils.a {
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

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ boolean U0(View view) {
        return false;
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
        c2.m(user, this.b, d2 != null && d2.video_calls_available, launchActivity, d2, org.telegram.messenger.c.a(iArr[0]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x016f, code lost:
    
        if (r7.R1 != false) goto L96;
     */
    @Override // org.telegram.ui.Components.rj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(float f10, float f11, int i7, View view) {
        int i10 = i7;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
        i6 i6Var = (i6) this.d;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.u1;
        HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
        ti tiVar = chatAttachAlertPhotoLayout.b;
        if (chatAttachAlertPhotoLayout.w0) {
            boolean z10 = tiVar.Q1;
            g2 g2Var = tiVar.a2;
            if (z10) {
                return;
            }
            g2 Q = g2Var == null ? LaunchActivity.Q() : g2Var;
            if (Q == null || (view instanceof i10)) {
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
                        if (!(view instanceof z8)) {
                            return;
                        }
                        chatAttachAlertPhotoLayout.u0((z8) view, null, 0L);
                        tiVar.dismiss();
                    }
                    i10--;
                }
                ArrayList<Object> allPhotosArray = chatAttachAlertPhotoLayout.getAllPhotosArray();
                if (i10 < 0 || i10 >= allPhotosArray.size()) {
                    return;
                }
                if (!(allPhotosArray.get(i10) instanceof ef) || ((ef) allPhotosArray.get(i10)).k(null)) {
                    ri riVar = tiVar.X3;
                    if (riVar != null && riVar.V1() && (allPhotosArray.get(i10) instanceof ef)) {
                        ef efVar = (ef) allPhotosArray.get(i10);
                        hashMap.clear();
                        if (efVar != null) {
                            chatAttachAlertPhotoLayout.T(efVar, -1);
                        }
                        tiVar.N0();
                        tiVar.X3.y1(7, true, true, 0, 0, 0L, tiVar.g1(), false, 0L);
                        hashMap.clear();
                        ChatAttachAlertPhotoLayout.s1.clear();
                        arrayList.clear();
                        hashMap.clear();
                        return;
                    }
                    PhotoViewer.p1().J2(null, Q, i6Var);
                    PhotoViewer.p1().K2(tiVar);
                    PhotoViewer p12 = PhotoViewer.p1();
                    int i13 = tiVar.Q3;
                    boolean z13 = tiVar.R3;
                    p12.h = i13;
                    p12.n = z13;
                    if (tiVar.A1 && tiVar.B1) {
                        i12 = 11;
                        if (g2Var instanceof bn) {
                            bnVar = (bn) g2Var;
                        }
                    } else if (tiVar.O2 != 0) {
                        i12 = 1;
                    } else {
                        if (g2Var instanceof bn) {
                            bnVar = (bn) g2Var;
                        }
                        i12 = 0;
                    }
                    if (!tiVar.X3.T()) {
                        org.telegram.messenger.g0.v1(Q.getFragmentView().findFocus());
                        org.telegram.messenger.g0.v1(tiVar.c.findFocus());
                    }
                    if (hashMap.size() > 0 && arrayList.size() > 0) {
                        Object obj = hashMap.get(arrayList.get(0));
                        if (obj instanceof ef) {
                            ((ef) obj).a = tiVar.b1().getText();
                        }
                        if (obj instanceof hf) {
                            ((hf) obj).I = tiVar.b1().getText();
                        }
                    }
                    if (tiVar.L1 != null) {
                        tiVar.L1.e = allPhotosArray.get(i10) instanceof ef ? ((ef) allPhotosArray.get(i10)).b : false;
                    }
                    boolean z14 = (allPhotosArray.get(i10) instanceof ef) && ((ef) allPhotosArray.get(i10)).M;
                    Object obj2 = allPhotosArray.get(i10);
                    if ((obj2 instanceof ef) && chatAttachAlertPhotoLayout.a0((ef) obj2)) {
                        return;
                    }
                    if (z14) {
                        chatAttachAlertPhotoLayout.s0(i10, false);
                    }
                    org.telegram.messenger.g0.h3(new v3(chatAttachAlertPhotoLayout, i12, Q, allPhotosArray, i10, bnVar), z14 ? 250L : 0L);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(t1 t1Var, int i7) {
        switch (this.a) {
            case 2:
                kg.b0 b0Var = (kg.b0) this.c;
                (!this.b ? b0Var.k : b0Var.j).remove(Long.valueOf(((n41) this.d).y));
                b0Var.e.run();
                break;
            case 3:
                j9 j9Var = (j9) this.c;
                boolean z10 = this.b;
                boolean[] zArr = (boolean[]) this.d;
                if (z10) {
                    boolean z11 = zArr[0];
                    TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                    tL_messages_deletePhoneCallHistory.revoke = z11;
                    j9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new k3(2, j9Var, z11));
                    j9Var.x.clear();
                    j9Var.y = false;
                    j9Var.F = true;
                    j9Var.w.setVisibility(8);
                    j9Var.c.g3.O(true);
                } else {
                    j9Var.getMessagesController().Z(new ArrayList(j9Var.H), null, null, 0L, 0, zArr[0], 0);
                }
                j9Var.j0(false);
                break;
            case 4:
                ((ca) this.c).a.o0((TLRPC.TL_username) this.d, this.b, true);
                break;
            case 5:
                fo foVar = (fo) this.c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
                boolean z12 = this.b;
                ho hoVar = foVar.a;
                hoVar.z1(tL_username, z12, true);
                hoVar.i3.b0();
                break;
            case 6:
                g2 g2Var = (g2) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                boolean z13 = this.b;
                TLRPC.UserFull d2 = g2Var.getMessagesController().d2(user.id);
                c2.m(user, z13, d2 != null && d2.video_calls_available, g2Var.getParentActivity(), d2, g2Var.getAccountInstance());
                break;
            case 7:
            case 9:
            default:
                fk0 fk0Var = (fk0) this.c;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) this.d;
                boolean z14 = this.b;
                fk0Var.C1();
                fk0Var.n1(tL_secureRequiredType, null, null, true, new si0(fk0Var, 4), new vi0(fk0Var, 6), z14);
                break;
            case 8:
                jz jzVar = (jz) this.c;
                bz bzVar = (bz) this.d;
                boolean z15 = this.b;
                int i10 = bzVar.j;
                if (i10 > 0) {
                    jzVar.E &= ~i10;
                } else {
                    (z15 ? jzVar.G : jzVar.H).remove(Long.valueOf(bzVar.h));
                }
                jzVar.p0();
                jzVar.C0();
                jzVar.o0(true);
                if (z15) {
                    jzVar.t0(1, false);
                    break;
                }
                break;
            case 10:
                boolean z16 = this.b;
                String str = (String) this.c;
                g2 g2Var2 = (g2) this.d;
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
                    g2Var2.getParentActivity().startActivity(Intent.createChooser(intent, "Send email..."));
                    break;
                } catch (Exception unused) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g2Var2.getParentActivity());
                    alertDialog$Builder.a.S = gd.N0(2131745875, null);
                    alertDialog$Builder.a.U = gd.N0(2131748006, "NoMailInstalled");
                    alertDialog$Builder.k(gd.N0(2131747637, "OK"), null);
                    g2Var2.showDialog(alertDialog$Builder.a);
                    return;
                }
        }
    }

    @Override // org.telegram.ui.ma1
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
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

    public /* synthetic */ j(String str, g2 g2Var, boolean z10) {
        this.a = 10;
        this.b = z10;
        this.c = str;
        this.d = g2Var;
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void f0(View view, float f10, float f11) {
    }
}
