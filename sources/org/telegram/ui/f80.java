package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.widget.EditText;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotGuardHelper;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class f80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f80(int i10, Object obj, Object obj2) {
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
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.b;
                String str = (String) this.c;
                int i13 = 29;
                if (str.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new ot(i13, languageSelectActivity, new ArrayList()));
                    break;
                } else {
                    System.currentTimeMillis();
                    ArrayList arrayList = new ArrayList();
                    int size = languageSelectActivity.h.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.h.get(i14);
                        if (localeInfo.name.toLowerCase().startsWith(str) || localeInfo.nameEnglish.toLowerCase().startsWith(str)) {
                            arrayList.add(localeInfo);
                        }
                    }
                    int size2 = languageSelectActivity.f.size();
                    while (i12 < size2) {
                        LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity.f.get(i12);
                        if (localeInfo2.name.toLowerCase().startsWith(str) || localeInfo2.nameEnglish.toLowerCase().startsWith(str)) {
                            arrayList.add(localeInfo2);
                        }
                        i12++;
                    }
                    AndroidUtilities.runOnUIThread(new ot(i13, languageSelectActivity, arrayList));
                    break;
                }
                break;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                TLObject tLObject = (TLObject) this.c;
                Pattern pattern = LaunchActivity.E1;
                if (tLObject instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject;
                    MessagesController.getInstance(launchActivity.O).putUsers(resolvedbusinesschatlinks.users, false);
                    MessagesController.getInstance(launchActivity.O).putChats(resolvedbusinesschatlinks.chats, false);
                    MessagesStorage.getInstance(launchActivity.O).putUsersAndChats(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
                    Bundle bundle = new Bundle();
                    TLRPC.Peer peer = resolvedbusinesschatlinks.peer;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        bundle.putLong("user_id", peer.user_id);
                    } else if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                        bundle.putLong("chat_id", peer.channel_id);
                    }
                    sn snVar = new sn(bundle);
                    snVar.ua = resolvedbusinesschatlinks;
                    launchActivity.v0(snVar, false, true);
                    break;
                } else {
                    launchActivity.G0(org.telegram.ui.Components.f5.N(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                    break;
                }
            case 2:
                LaunchActivity launchActivity2 = (LaunchActivity) this.b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.c;
                Pattern pattern2 = LaunchActivity.E1;
                MessagesController.getInstance(launchActivity2.O).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity2.O);
                long j10 = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j10, j10, tL_chatInviteJoinResultWebView.query_id);
                break;
            case 3:
                g gVar = (g) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                Pattern pattern3 = LaunchActivity.E1;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.b1.o(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(tL_error.text);
                org.telegram.ui.Components.f5.u0(gVar, string, sb2.toString(), null);
                break;
            case 4:
                LaunchActivity launchActivity3 = (LaunchActivity) this.b;
                String str2 = (String) this.c;
                if (!launchActivity3.q0.getFragmentStack().isEmpty()) {
                    launchActivity3.q0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str2).getQueryParameter("ref")));
                    break;
                }
                break;
            case 5:
                LaunchActivity launchActivity4 = (LaunchActivity) this.b;
                TL_account.Password password = (TL_account.Password) this.c;
                Pattern pattern4 = LaunchActivity.E1;
                launchActivity4.l0(password);
                break;
            case 6:
                LaunchActivity launchActivity5 = (LaunchActivity) this.b;
                Runnable runnable = (Runnable) this.c;
                launchActivity5.q0.getView().setVisibility(4);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout = launchActivity5.r0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity5.r0.getView().getVisibility() == 0) {
                        launchActivity5.r0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity5.s0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity5.s0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 7:
                LaunchActivity launchActivity6 = (LaunchActivity) this.b;
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) this.c;
                if (!launchActivity6.Q && LaunchActivity.H1) {
                    qcVar.j();
                    break;
                }
                break;
            case 8:
                LaunchActivity launchActivity7 = (LaunchActivity) this.b;
                qc1 qc1Var = (qc1) this.c;
                Pattern pattern5 = LaunchActivity.E1;
                launchActivity7.u0(qc1Var);
                break;
            case 9:
                LaunchActivity launchActivity8 = (LaunchActivity) this.b;
                pf.c cVar = (pf.c) this.c;
                launchActivity8.Q0 = null;
                launchActivity8.R0 = null;
                launchActivity8.S0 = null;
                launchActivity8.T0 = null;
                launchActivity8.W0 = null;
                launchActivity8.U0 = null;
                if (cVar != null) {
                    cVar.b();
                    break;
                }
                break;
            case 10:
                pf.c cVar2 = (pf.c) this.b;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.c;
                Pattern pattern6 = LaunchActivity.E1;
                if (cVar2 != null) {
                    cVar2.b();
                }
                if (c2Var != null) {
                    c2Var.dismiss();
                    break;
                }
                break;
            case 11:
                ob0 ob0Var = (ob0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ob0Var.c();
                if (tLObject2 != null) {
                    ob0Var.a.l0((TL_account.Password) tLObject2);
                    break;
                }
                break;
            case 12:
                ((FiltersSetupActivity) this.c).Y(((ob0) this.b).a.O());
                break;
            case 13:
                sc0 sc0Var = (sc0) this.b;
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
                    AndroidUtilities.runOnUIThread(new lq(sc0Var, createBitmap2, gLSurfaceView, 23));
                    break;
                }
                break;
            case 14:
                sc0 sc0Var2 = (sc0) this.b;
                LocationController.SharingLocationInfo sharingLocationInfo = (LocationController.SharingLocationInfo) this.c;
                sc0Var2.c.setImageResource(R.drawable.msg_location_alert2);
                sc0Var2.e0(sharingLocationInfo.proximityMeters);
                sc0Var2.G = false;
                break;
            case 15:
                ((EditText) this.b).removeTextChangedListener((org.telegram.ui.Components.ao) this.c);
                break;
            case 16:
                rd0 rd0Var = (rd0) this.b;
                Runnable runnable2 = (Runnable) this.c;
                od0 od0Var = rd0Var.a;
                int i15 = 0;
                while (true) {
                    vr[] vrVarArr = od0Var.f;
                    if (i15 >= vrVarArr.length) {
                        runnable2.run();
                        od0Var.e = false;
                        break;
                    } else {
                        vrVarArr[i15].l(0.0f);
                        i15++;
                    }
                }
            case 17:
                be0 be0Var = (be0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                ig0 ig0Var = be0Var.y;
                ig0Var.o1(false, false);
                AndroidUtilities.hideKeyboard(be0Var.a);
                ig0Var.s1((TLRPC.TL_auth_authorization) tLObject3, false);
                break;
            case 18:
                be0 be0Var2 = (be0) this.b;
                String str3 = (String) this.c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = be0Var2.n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                byte[] x10 = z10 ? SRPHelper.getX(AndroidUtilities.getStringBytes(str3), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
                yd0 yd0Var = new yd0(be0Var2, 2);
                if (z10) {
                    TL_account.Password password2 = be0Var2.n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(x10, password2.srp_id, password2.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck == null) {
                        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                        tL_error2.text = "PASSWORD_HASH_INVALID";
                        yd0Var.run(null, tL_error2);
                        break;
                    } else {
                        TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                        tL_auth_checkPassword.password = startCheck;
                        i10 = ((org.telegram.ui.ActionBar.o2) be0Var2.y).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, yd0Var, 10);
                        break;
                    }
                }
                break;
            case 19:
                ue0 ue0Var = (ue0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                ue0Var.O.o1(false, false);
                AndroidUtilities.hideKeyboard(ue0Var.O.fragmentView.findFocus());
                ue0Var.O.s1((TLRPC.TL_auth_authorization) tLObject4, true);
                TLRPC.FileLocation fileLocation = ue0Var.N;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new f80(20, ue0Var, fileLocation));
                    break;
                }
                break;
            case 20:
                ue0 ue0Var2 = (ue0) this.b;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.c;
                i11 = ((org.telegram.ui.ActionBar.o2) ue0Var2.O).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar(fileLocation2);
                break;
            case 21:
                ve0 ve0Var = (ve0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                ig0 ig0Var2 = ve0Var.G;
                ig0Var2.o1(false, true);
                if (tL_error3 == null) {
                    if (ve0Var.r != null && ve0Var.s != null && ve0Var.v != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("phoneFormated", ve0Var.r);
                        bundle2.putString("phoneHash", ve0Var.s);
                        bundle2.putString("code", ve0Var.v);
                        ig0Var2.y1(5, true, bundle2, false);
                        break;
                    } else {
                        ig0Var2.y1(0, true, null, true);
                        break;
                    }
                } else if (tL_error3.text.equals("2FA_RECENT_CONFIRM")) {
                    ig0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                    break;
                } else {
                    ig0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                    break;
                }
                break;
            case 22:
                mf0 mf0Var = (mf0) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.c);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.a.T = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.sl.h(new StringBuilder("+"), mf0Var.b, jf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.a.setOnDismissListener(new hf0(mf0Var, i12));
                alertDialog$Builder.p();
                break;
            case 23:
                mf0 mf0Var2 = (mf0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                mf0Var2.getClass();
                mf0Var2.g0 = tL_error4.text;
                break;
            case 24:
                ((mf0) this.b).u0.s1((TLRPC.TL_auth_authorization) ((TLObject) this.c), false);
                break;
            case 25:
                mf0 mf0Var3 = (mf0) this.b;
                Runnable runnable3 = (Runnable) this.c;
                sr srVar = mf0Var3.f;
                int i16 = 0;
                while (true) {
                    vr[] vrVarArr2 = srVar.f;
                    if (i16 >= vrVarArr2.length) {
                        runnable3.run();
                        srVar.e = false;
                        break;
                    } else {
                        vrVarArr2[i16].l(0.0f);
                        i16++;
                    }
                }
            case 26:
                ((u3) this.b).run((String) this.c);
                break;
            case 27:
                hg0 hg0Var = (hg0) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                ig0 ig0Var3 = hg0Var.a0;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (!globalMainSettings.getBoolean("firstloginshow", true) && !ig0Var3.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                    ig0Var3.getParentActivity().requestPermissions((String[]) arrayList2.toArray(new String[0]), 7);
                    break;
                } else {
                    globalMainSettings.edit().putBoolean("firstloginshow", false).commit();
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ig0Var3.getParentActivity());
                    int i17 = R.raw.incoming_calls;
                    int i18 = org.telegram.ui.ActionBar.k6.L5;
                    alertDialog$Builder2.m(i17, 46, org.telegram.ui.ActionBar.k6.x0(null, i18, false), null);
                    alertDialog$Builder2.n(i18, null);
                    alertDialog$Builder2.k(LocaleController.getString("Continue", R.string.Continue), null);
                    String string2 = LocaleController.getString("AllowFillNumber", R.string.AllowFillNumber);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                    c2Var2.T = string2;
                    ig0Var3.n = ig0Var3.showDialog(c2Var2, true, null);
                    ig0Var3.c0 = true;
                    break;
                }
                break;
            case 28:
                lg0.V((lg0) this.b, (org.telegram.ui.ActionBar.c2) this.c);
                break;
            default:
                mh0 mh0Var = (mh0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                mh0Var.c0 = false;
                if (tL_error5 == null) {
                    dh0 g02 = mh0Var.g0();
                    mh0Var.j0.clear();
                    mh0Var.i0(g02);
                    break;
                }
                break;
        }
    }
}
