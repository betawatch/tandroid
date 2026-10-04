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
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotGuardHelper;
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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class h90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h90(int i10, Object obj, Object obj2) {
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
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.c;
                Pattern pattern = LaunchActivity.B1;
                MessagesController.getInstance(launchActivity.O).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity.O);
                long j3 = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j3, j3, tL_chatInviteJoinResultWebView.query_id);
                break;
            case 1:
                h hVar = (h) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                Pattern pattern2 = LaunchActivity.B1;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c1.n(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(tL_error.text);
                org.telegram.ui.Components.e5.u0(hVar, string, sb2.toString(), null);
                break;
            case 2:
                LaunchActivity launchActivity2 = (LaunchActivity) this.b;
                String str = (String) this.c;
                if (!launchActivity2.q0.getFragmentStack().isEmpty()) {
                    launchActivity2.q0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str).getQueryParameter("ref")));
                    break;
                }
                break;
            case 3:
                LaunchActivity launchActivity3 = (LaunchActivity) this.b;
                TL_account.Password password = (TL_account.Password) this.c;
                Pattern pattern3 = LaunchActivity.B1;
                launchActivity3.j0(password);
                break;
            case 4:
                LaunchActivity launchActivity4 = (LaunchActivity) this.b;
                Runnable runnable = (Runnable) this.c;
                launchActivity4.q0.getView().setVisibility(4);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout = launchActivity4.r0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity4.r0.getView().getVisibility() == 0) {
                        launchActivity4.r0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity4.s0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity4.s0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 5:
                LaunchActivity launchActivity5 = (LaunchActivity) this.b;
                org.telegram.ui.Components.rc rcVar = (org.telegram.ui.Components.rc) this.c;
                if (!launchActivity5.Q && LaunchActivity.E1) {
                    rcVar.j();
                    break;
                }
                break;
            case 6:
                LaunchActivity launchActivity6 = (LaunchActivity) this.b;
                rd1 rd1Var = (rd1) this.c;
                Pattern pattern4 = LaunchActivity.B1;
                launchActivity6.p0(rd1Var);
                break;
            case 7:
                LaunchActivity launchActivity7 = (LaunchActivity) this.b;
                nf.e eVar = (nf.e) this.c;
                launchActivity7.P0 = null;
                launchActivity7.Q0 = null;
                launchActivity7.R0 = null;
                launchActivity7.S0 = null;
                launchActivity7.V0 = null;
                launchActivity7.T0 = null;
                if (eVar != null) {
                    eVar.b();
                    break;
                }
                break;
            case 8:
                nf.e eVar2 = (nf.e) this.b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.c;
                Pattern pattern5 = LaunchActivity.B1;
                if (eVar2 != null) {
                    eVar2.b();
                }
                if (b2Var != null) {
                    b2Var.dismiss();
                    break;
                }
                break;
            case 9:
                dc0 dc0Var = (dc0) this.b;
                TLObject tLObject = (TLObject) this.c;
                dc0Var.a();
                if (tLObject != null) {
                    dc0Var.a.j0((TL_account.Password) tLObject);
                    break;
                }
                break;
            case 10:
                ((FiltersSetupActivity) this.c).W(((dc0) this.b).a.O());
                break;
            case 11:
                gd0 gd0Var = (gd0) this.b;
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
                    AndroidUtilities.runOnUIThread(new uq(gd0Var, createBitmap2, gLSurfaceView, 21));
                    break;
                }
                break;
            case 12:
                gd0 gd0Var2 = (gd0) this.b;
                LocationController.SharingLocationInfo sharingLocationInfo = (LocationController.SharingLocationInfo) this.c;
                gd0Var2.c.setImageResource(R.drawable.msg_location_alert2);
                gd0Var2.e0(sharingLocationInfo.proximityMeters);
                gd0Var2.G = false;
                break;
            case 13:
                ((EditText) this.b).removeTextChangedListener((org.telegram.ui.Components.tn) this.c);
                break;
            case 14:
                ee0 ee0Var = (ee0) this.b;
                Runnable runnable2 = (Runnable) this.c;
                be0 be0Var = ee0Var.a;
                int i13 = 0;
                while (true) {
                    es[] esVarArr = be0Var.f;
                    if (i13 >= esVarArr.length) {
                        runnable2.run();
                        be0Var.e = false;
                        break;
                    } else {
                        esVarArr[i13].l(0.0f);
                        i13++;
                    }
                }
            case 15:
                ne0 ne0Var = (ne0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ug0 ug0Var = ne0Var.y;
                ug0Var.k1(false, false);
                AndroidUtilities.hideKeyboard(ne0Var.a);
                ug0Var.o1((TLRPC.TL_auth_authorization) tLObject2, false);
                break;
            case 16:
                ne0 ne0Var2 = (ne0) this.b;
                String str2 = (String) this.c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = ne0Var2.n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                byte[] x10 = z10 ? SRPHelper.getX(AndroidUtilities.getStringBytes(str2), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
                le0 le0Var = new le0(ne0Var2, 2);
                if (z10) {
                    TL_account.Password password2 = ne0Var2.n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(x10, password2.srp_id, password2.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck != null) {
                        TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                        tL_auth_checkPassword.password = startCheck;
                        i10 = ((org.telegram.ui.ActionBar.n2) ne0Var2.y).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, le0Var, 10);
                        break;
                    } else {
                        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                        tL_error2.text = "PASSWORD_HASH_INVALID";
                        le0Var.run(null, tL_error2);
                        break;
                    }
                }
                break;
            case 17:
                ff0 ff0Var = (ff0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                ff0Var.O.k1(false, false);
                AndroidUtilities.hideKeyboard(ff0Var.O.fragmentView.findFocus());
                ff0Var.O.o1((TLRPC.TL_auth_authorization) tLObject3, true);
                TLRPC.FileLocation fileLocation = ff0Var.N;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new h90(18, ff0Var, fileLocation));
                    break;
                }
                break;
            case 18:
                ff0 ff0Var2 = (ff0) this.b;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.c;
                i11 = ((org.telegram.ui.ActionBar.n2) ff0Var2.O).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar(fileLocation2);
                break;
            case 19:
                gf0 gf0Var = (gf0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                ug0 ug0Var2 = gf0Var.E;
                ug0Var2.k1(false, true);
                if (tL_error3 != null) {
                    if (!tL_error3.text.equals("2FA_RECENT_CONFIRM")) {
                        ug0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                        break;
                    } else {
                        ug0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                        break;
                    }
                } else if (gf0Var.r != null && gf0Var.s != null && gf0Var.v != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("phoneFormated", gf0Var.r);
                    bundle.putString("phoneHash", gf0Var.s);
                    bundle.putString("code", gf0Var.v);
                    ug0Var2.u1(5, true, bundle, false);
                    break;
                } else {
                    ug0Var2.u1(0, true, null, true);
                    break;
                }
                break;
            case 20:
                xf0 xf0Var = (xf0) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.c);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.a.T = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.ok.h(new StringBuilder("+"), xf0Var.b, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.a.setOnDismissListener(new tf0(xf0Var, i12));
                alertDialog$Builder.o();
                break;
            case 21:
                xf0 xf0Var2 = (xf0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                xf0Var2.getClass();
                xf0Var2.e0 = tL_error4.text;
                break;
            case 22:
                ((xf0) this.b).s0.o1((TLRPC.TL_auth_authorization) ((TLObject) this.c), false);
                break;
            case 23:
                xf0 xf0Var3 = (xf0) this.b;
                Runnable runnable3 = (Runnable) this.c;
                cs csVar = xf0Var3.f;
                int i14 = 0;
                while (true) {
                    es[] esVarArr2 = csVar.f;
                    if (i14 >= esVarArr2.length) {
                        runnable3.run();
                        csVar.e = false;
                        break;
                    } else {
                        esVarArr2[i14].l(0.0f);
                        i14++;
                    }
                }
            case 24:
                ((t3) this.b).run((String) this.c);
                break;
            case 25:
                wh0 wh0Var = (wh0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                wh0Var.c0 = false;
                if (tL_error5 == null) {
                    nh0 f02 = wh0Var.f0();
                    wh0Var.j0.clear();
                    wh0Var.h0(f02);
                    break;
                }
                break;
            case 26:
                mh0 mh0Var = (mh0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                wh0 wh0Var2 = mh0Var.a;
                nh0 f03 = wh0Var2.f0();
                wh0Var2.i0.add(0, (TLRPC.TL_chatInviteExported) tLObject4);
                TLRPC.ChatFull chatFull = wh0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    wh0Var2.getMessagesStorage().saveChatLinksCount(wh0Var2.n, wh0Var2.d.invitesCount);
                }
                wh0Var2.h0(f03);
                break;
            case 27:
                hj0 hj0Var = (hj0) this.b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.c;
                if (hj0Var.getParentActivity() != null) {
                    Toast.makeText(hj0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    break;
                }
                break;
            case 28:
                ak0 ak0Var = (ak0) this.b;
                String str3 = (String) this.c;
                ak0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + str3));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                ak0Var.getContext().startActivity(intent);
                break;
            default:
                ak0 ak0Var2 = (ak0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                ak0Var2.dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(user.id));
                    break;
                }
                break;
        }
    }
}
