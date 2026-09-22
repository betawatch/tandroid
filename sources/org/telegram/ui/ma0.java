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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ma0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ma0(int i10, Object obj, Object obj2) {
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
                wd1 wd1Var = (wd1) this.c;
                Pattern pattern2 = LaunchActivity.B1;
                launchActivity4.p0(wd1Var);
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
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.c;
                Pattern pattern3 = LaunchActivity.B1;
                if (eVar2 != null) {
                    eVar2.b();
                }
                if (b2Var != null) {
                    b2Var.dismiss();
                    break;
                }
                break;
            case 6:
                fc0 fc0Var = (fc0) this.b;
                TLObject tLObject = (TLObject) this.c;
                fc0Var.a();
                if (tLObject != null) {
                    fc0Var.a.j0((TL_account.Password) tLObject);
                    break;
                }
                break;
            case 7:
                ((FiltersSetupActivity) this.c).X(((fc0) this.b).a.O());
                break;
            case 8:
                id0 id0Var = (id0) this.b;
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
                    AndroidUtilities.runOnUIThread(new xq(id0Var, createBitmap2, gLSurfaceView, 21));
                    break;
                }
                break;
            case 9:
                id0 id0Var2 = (id0) this.b;
                LocationController.SharingLocationInfo sharingLocationInfo = (LocationController.SharingLocationInfo) this.c;
                id0Var2.c.setImageResource(R.drawable.msg_location_alert2);
                id0Var2.e0(sharingLocationInfo.proximityMeters);
                id0Var2.G = false;
                break;
            case 10:
                ((EditText) this.b).removeTextChangedListener((org.telegram.ui.Components.qn) this.c);
                break;
            case 11:
                ge0 ge0Var = (ge0) this.b;
                Runnable runnable2 = (Runnable) this.c;
                de0 de0Var = ge0Var.a;
                int i13 = 0;
                while (true) {
                    gs[] gsVarArr = de0Var.f;
                    if (i13 >= gsVarArr.length) {
                        runnable2.run();
                        de0Var.e = false;
                        break;
                    } else {
                        gsVarArr[i13].l(0.0f);
                        i13++;
                    }
                }
            case 12:
                pe0 pe0Var = (pe0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                wg0 wg0Var = pe0Var.y;
                wg0Var.k1(false, false);
                AndroidUtilities.hideKeyboard(pe0Var.a);
                wg0Var.o1((TLRPC.TL_auth_authorization) tLObject2, false);
                break;
            case 13:
                pe0 pe0Var2 = (pe0) this.b;
                String str = (String) this.c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = pe0Var2.n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                byte[] x10 = z10 ? SRPHelper.getX(AndroidUtilities.getStringBytes(str), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
                ne0 ne0Var = new ne0(pe0Var2, 2);
                if (z10) {
                    TL_account.Password password2 = pe0Var2.n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(x10, password2.srp_id, password2.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck != null) {
                        TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                        tL_auth_checkPassword.password = startCheck;
                        i10 = ((org.telegram.ui.ActionBar.n2) pe0Var2.y).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, ne0Var, 10);
                        break;
                    } else {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        ne0Var.run(null, tL_error);
                        break;
                    }
                }
                break;
            case 14:
                hf0 hf0Var = (hf0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                hf0Var.O.k1(false, false);
                AndroidUtilities.hideKeyboard(hf0Var.O.fragmentView.findFocus());
                hf0Var.O.o1((TLRPC.TL_auth_authorization) tLObject3, true);
                TLRPC.FileLocation fileLocation = hf0Var.N;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new ma0(15, hf0Var, fileLocation));
                    break;
                }
                break;
            case 15:
                hf0 hf0Var2 = (hf0) this.b;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.c;
                i11 = ((org.telegram.ui.ActionBar.n2) hf0Var2.O).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar(fileLocation2);
                break;
            case 16:
                if0 if0Var = (if0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                wg0 wg0Var2 = if0Var.E;
                wg0Var2.k1(false, true);
                if (tL_error2 != null) {
                    if (!tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                        wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                        break;
                    } else {
                        wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                        break;
                    }
                } else if (if0Var.r != null && if0Var.s != null && if0Var.v != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("phoneFormated", if0Var.r);
                    bundle.putString("phoneHash", if0Var.s);
                    bundle.putString("code", if0Var.v);
                    wg0Var2.u1(5, true, bundle, false);
                    break;
                } else {
                    wg0Var2.u1(0, true, null, true);
                    break;
                }
            case 17:
                zf0 zf0Var = (zf0) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.c);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.a.T = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.vl.h(new StringBuilder("+"), zf0Var.b, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.a.setOnDismissListener(new vf0(zf0Var, i12));
                alertDialog$Builder.o();
                break;
            case 18:
                zf0 zf0Var2 = (zf0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                zf0Var2.getClass();
                zf0Var2.e0 = tL_error3.text;
                break;
            case 19:
                ((zf0) this.b).s0.o1((TLRPC.TL_auth_authorization) ((TLObject) this.c), false);
                break;
            case 20:
                zf0 zf0Var3 = (zf0) this.b;
                Runnable runnable3 = (Runnable) this.c;
                ds dsVar = zf0Var3.f;
                int i14 = 0;
                while (true) {
                    gs[] gsVarArr2 = dsVar.f;
                    if (i14 >= gsVarArr2.length) {
                        runnable3.run();
                        dsVar.e = false;
                        break;
                    } else {
                        gsVarArr2[i14].l(0.0f);
                        i14++;
                    }
                }
            case 21:
                ((s3) this.b).run((String) this.c);
                break;
            case 22:
                yh0 yh0Var = (yh0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                yh0Var.c0 = false;
                if (tL_error4 == null) {
                    ph0 f02 = yh0Var.f0();
                    yh0Var.j0.clear();
                    yh0Var.h0(f02);
                    break;
                }
                break;
            case 23:
                oh0 oh0Var = (oh0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                yh0 yh0Var2 = oh0Var.a;
                ph0 f03 = yh0Var2.f0();
                yh0Var2.i0.add(0, (TLRPC.TL_chatInviteExported) tLObject4);
                TLRPC.ChatFull chatFull = yh0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    yh0Var2.getMessagesStorage().saveChatLinksCount(yh0Var2.n, yh0Var2.d.invitesCount);
                }
                yh0Var2.h0(f03);
                break;
            case 24:
                jj0 jj0Var = (jj0) this.b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.c;
                if (jj0Var.getParentActivity() != null) {
                    Toast.makeText(jj0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    break;
                }
                break;
            case 25:
                ck0 ck0Var = (ck0) this.b;
                String str2 = (String) this.c;
                ck0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + str2));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                ck0Var.getContext().startActivity(intent);
                break;
            case 26:
                ck0 ck0Var2 = (ck0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                ck0Var2.dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(user.id));
                    break;
                }
                break;
            case 27:
                ((mj0) this.b).run((TLRPC.User) this.c);
                break;
            case 28:
                NotificationsCustomSettingsActivity.W((NotificationsCustomSettingsActivity) this.b, (ArrayList) this.c);
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                Runnable runnable4 = (Runnable) this.c;
                gs[] gsVarArr3 = passcodeActivity.n.f;
                int length = gsVarArr3.length;
                while (i12 < length) {
                    gsVarArr3[i12].l(0.0f);
                    i12++;
                }
                runnable4.run();
                break;
        }
    }
}
