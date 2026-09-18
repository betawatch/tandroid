package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oa0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oa0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12 = 0;
        switch (this.a) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                TL_account.Password password = (TL_account.Password) this.c;
                Pattern pattern = LaunchActivity.B1;
                launchActivity.j0(password);
                break;
            case 1:
                LaunchActivity launchActivity2 = (LaunchActivity) this.b;
                Runnable runnable = (Runnable) this.c;
                launchActivity2.q0.getView().setVisibility(4);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout = launchActivity2.r0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity2.r0.getView().getVisibility() == 0) {
                        launchActivity2.r0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity2.s0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity2.s0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 2:
                LaunchActivity launchActivity3 = (LaunchActivity) this.b;
                org.telegram.ui.Components.oc ocVar = (org.telegram.ui.Components.oc) this.c;
                if (!launchActivity3.Q && LaunchActivity.E1) {
                    ocVar.j();
                    break;
                }
                break;
            case 3:
                LaunchActivity launchActivity4 = (LaunchActivity) this.b;
                xd1 xd1Var = (xd1) this.c;
                Pattern pattern2 = LaunchActivity.B1;
                launchActivity4.p0(xd1Var);
                break;
            case 4:
                LaunchActivity launchActivity5 = (LaunchActivity) this.b;
                nf.e eVar = (nf.e) this.c;
                launchActivity5.P0 = null;
                launchActivity5.Q0 = null;
                launchActivity5.R0 = null;
                launchActivity5.S0 = null;
                launchActivity5.V0 = null;
                launchActivity5.T0 = null;
                if (eVar != null) {
                    eVar.b();
                    break;
                }
                break;
            case 5:
                nf.e eVar2 = (nf.e) this.b;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.c;
                Pattern pattern3 = LaunchActivity.B1;
                if (eVar2 != null) {
                    eVar2.b();
                }
                if (c2Var != null) {
                    c2Var.dismiss();
                    break;
                }
                break;
            case 6:
                hc0 hc0Var = (hc0) this.b;
                TLObject tLObject = (TLObject) this.c;
                hc0Var.a();
                if (tLObject != null) {
                    hc0Var.a.j0((TL_account.Password) tLObject);
                    break;
                }
                break;
            case 7:
                ((FiltersSetupActivity) this.c).X(((hc0) this.b).a.O());
                break;
            case 8:
                kd0 kd0Var = (kd0) this.b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.c;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    AndroidUtilities.runOnUIThread(new xq(kd0Var, createBitmap2, gLSurfaceView, 21));
                    break;
                }
                break;
            case 9:
                kd0 kd0Var2 = (kd0) this.b;
                LocationController.SharingLocationInfo sharingLocationInfo = (LocationController.SharingLocationInfo) this.c;
                kd0Var2.c.setImageResource(R.drawable.msg_location_alert2);
                kd0Var2.e0(sharingLocationInfo.proximityMeters);
                kd0Var2.G = false;
                break;
            case 10:
                ((EditText) this.b).removeTextChangedListener((org.telegram.ui.Components.qn) this.c);
                break;
            case 11:
                ie0 ie0Var = (ie0) this.b;
                Runnable runnable2 = (Runnable) this.c;
                fe0 fe0Var = ie0Var.a;
                int i13 = 0;
                while (true) {
                    is[] isVarArr = fe0Var.f;
                    if (i13 >= isVarArr.length) {
                        runnable2.run();
                        fe0Var.e = false;
                        break;
                    } else {
                        isVarArr[i13].l(0.0f);
                        i13++;
                    }
                }
            case 12:
                re0 re0Var = (re0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                yg0 yg0Var = re0Var.y;
                yg0Var.k1(false, false);
                AndroidUtilities.hideKeyboard(re0Var.a);
                yg0Var.o1((TLRPC.TL_auth_authorization) tLObject2, false);
                break;
            case 13:
                re0 re0Var2 = (re0) this.b;
                String str = (String) this.c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = re0Var2.n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                byte[] x10 = z10 ? SRPHelper.getX(AndroidUtilities.getStringBytes(str), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
                pe0 pe0Var = new pe0(re0Var2, 2);
                if (z10) {
                    TL_account.Password password2 = re0Var2.n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(x10, password2.srp_id, password2.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck != null) {
                        TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                        tL_auth_checkPassword.password = startCheck;
                        i10 = ((org.telegram.ui.ActionBar.o2) re0Var2.y).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, pe0Var, 10);
                        break;
                    } else {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        pe0Var.run(null, tL_error);
                        break;
                    }
                }
                break;
            case 14:
                jf0 jf0Var = (jf0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                jf0Var.O.k1(false, false);
                AndroidUtilities.hideKeyboard(jf0Var.O.fragmentView.findFocus());
                jf0Var.O.o1((TLRPC.TL_auth_authorization) tLObject3, true);
                TLRPC.FileLocation fileLocation = jf0Var.N;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new oa0(15, jf0Var, fileLocation));
                    break;
                }
                break;
            case 15:
                jf0 jf0Var2 = (jf0) this.b;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.c;
                i11 = ((org.telegram.ui.ActionBar.o2) jf0Var2.O).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar(fileLocation2);
                break;
            case 16:
                kf0 kf0Var = (kf0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                yg0 yg0Var2 = kf0Var.E;
                yg0Var2.k1(false, true);
                if (tL_error2 != null) {
                    if (!tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                        yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                        break;
                    } else {
                        yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                        break;
                    }
                } else if (kf0Var.r != null && kf0Var.s != null && kf0Var.v != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("phoneFormated", kf0Var.r);
                    bundle.putString("phoneHash", kf0Var.s);
                    bundle.putString("code", kf0Var.v);
                    yg0Var2.u1(5, true, bundle, false);
                    break;
                } else {
                    yg0Var2.u1(0, true, null, true);
                    break;
                }
            case 17:
                bg0 bg0Var = (bg0) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.c);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.a.T = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.w1.j(new StringBuilder("+"), bg0Var.b, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.a.setOnDismissListener(new xf0(bg0Var, i12));
                alertDialog$Builder.o();
                break;
            case 18:
                bg0 bg0Var2 = (bg0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                bg0Var2.getClass();
                bg0Var2.e0 = tL_error3.text;
                break;
            case 19:
                ((bg0) this.b).s0.o1((TLRPC.TL_auth_authorization) ((TLObject) this.c), false);
                break;
            case 20:
                bg0 bg0Var3 = (bg0) this.b;
                Runnable runnable3 = (Runnable) this.c;
                fs fsVar = bg0Var3.f;
                int i14 = 0;
                while (true) {
                    is[] isVarArr2 = fsVar.f;
                    if (i14 >= isVarArr2.length) {
                        runnable3.run();
                        fsVar.e = false;
                        break;
                    } else {
                        isVarArr2[i14].l(0.0f);
                        i14++;
                    }
                }
            case 21:
                ((s3) this.b).run((String) this.c);
                break;
            case 22:
                ai0 ai0Var = (ai0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                ai0Var.c0 = false;
                if (tL_error4 == null) {
                    rh0 f02 = ai0Var.f0();
                    ai0Var.j0.clear();
                    ai0Var.h0(f02);
                    break;
                }
                break;
            case 23:
                qh0 qh0Var = (qh0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                ai0 ai0Var2 = qh0Var.a;
                rh0 f03 = ai0Var2.f0();
                ai0Var2.i0.add(0, (TLRPC.TL_chatInviteExported) tLObject4);
                TLRPC.ChatFull chatFull = ai0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    ai0Var2.getMessagesStorage().saveChatLinksCount(ai0Var2.n, ai0Var2.d.invitesCount);
                }
                ai0Var2.h0(f03);
                break;
            case 24:
                lj0 lj0Var = (lj0) this.b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.c;
                if (lj0Var.getParentActivity() != null) {
                    Toast.makeText(lj0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    break;
                }
                break;
            case 25:
                ek0 ek0Var = (ek0) this.b;
                String str2 = (String) this.c;
                ek0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + str2));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                ek0Var.getContext().startActivity(intent);
                break;
            case 26:
                ek0 ek0Var2 = (ek0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                ek0Var2.dismiss();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(user.id));
                    break;
                }
                break;
            case 27:
                ((oj0) this.b).run((TLRPC.User) this.c);
                break;
            case 28:
                NotificationsCustomSettingsActivity.W((NotificationsCustomSettingsActivity) this.b, (ArrayList) this.c);
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                Runnable runnable4 = (Runnable) this.c;
                is[] isVarArr3 = passcodeActivity.n.f;
                int length = isVarArr3.length;
                while (i12 < length) {
                    isVarArr3[i12].l(0.0f);
                    i12++;
                }
                runnable4.run();
                break;
        }
    }
}
