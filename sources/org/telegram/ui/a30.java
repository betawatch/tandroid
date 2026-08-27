package org.telegram.ui;

import android.app.Activity;
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
import org.telegram.messenger.CacheByChatsController;
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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a30(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i10;
        int i11;
        int i12 = 14;
        int i13 = 0;
        switch (this.a) {
            case 0:
                ((s50) ((w5) this.b).b).Q0.setNewColors((int[]) this.c);
                break;
            case 1:
                c70.V((c70) this.b, (TLRPC.TL_error) this.c);
                break;
            case 2:
                y60 y60Var = (y60) this.b;
                String str = (String) this.c;
                z60 z60Var = y60Var.a;
                z60Var.e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                z60Var.c = z60Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new gg(28, y60Var, str), 66);
                break;
            case 3:
                y60 y60Var2 = (y60) this.b;
                TLObject tLObject = (TLObject) this.c;
                z60 z60Var2 = y60Var2.a;
                if (tLObject != null) {
                    c70.a0(z60Var2.h, (TLRPC.TL_messages_stickerSet) tLObject);
                    break;
                } else {
                    c70.a0(z60Var2.h, null);
                    break;
                }
            case 4:
                b70 b70Var = (b70) this.b;
                String str2 = (String) this.c;
                b70Var.h = str2;
                c70 c70Var = b70Var.r;
                if (c70Var.J) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                b70Var.n = c70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new z9(b70Var, str2, str2, i12), 66);
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(i12, (v70) this.b, (CacheByChatsController.KeepMediaException) this.c), 150L);
                break;
            case 6:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.b;
                languageSelectActivity.e = (ArrayList) this.c;
                languageSelectActivity.c.l();
                break;
            case 7:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) this.b;
                String str3 = (String) this.c;
                int i14 = 6;
                if (str3.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new a30(i14, languageSelectActivity2, new ArrayList()));
                    break;
                } else {
                    System.currentTimeMillis();
                    ArrayList arrayList = new ArrayList();
                    int size = languageSelectActivity2.h.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) languageSelectActivity2.h.get(i15);
                        if (localeInfo.name.toLowerCase().startsWith(str3) || localeInfo.nameEnglish.toLowerCase().startsWith(str3)) {
                            arrayList.add(localeInfo);
                        }
                    }
                    int size2 = languageSelectActivity2.f.size();
                    while (i13 < size2) {
                        LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity2.f.get(i13);
                        if (localeInfo2.name.toLowerCase().startsWith(str3) || localeInfo2.nameEnglish.toLowerCase().startsWith(str3)) {
                            arrayList.add(localeInfo2);
                        }
                        i13++;
                    }
                    AndroidUtilities.runOnUIThread(new a30(i14, languageSelectActivity2, arrayList));
                    break;
                }
                break;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                Pattern pattern = LaunchActivity.x1;
                if (tLObject2 instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject2;
                    MessagesController.getInstance(launchActivity.K).putUsers(resolvedbusinesschatlinks.users, false);
                    MessagesController.getInstance(launchActivity.K).putChats(resolvedbusinesschatlinks.chats, false);
                    MessagesStorage.getInstance(launchActivity.K).putUsersAndChats(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
                    Bundle bundle = new Bundle();
                    TLRPC.Peer peer = resolvedbusinesschatlinks.peer;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        bundle.putLong("user_id", peer.user_id);
                    } else if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                        bundle.putLong("chat_id", peer.channel_id);
                    }
                    rn rnVar = new rn(bundle);
                    rnVar.ea = resolvedbusinesschatlinks;
                    launchActivity.q0(rnVar, false, true);
                    break;
                } else {
                    launchActivity.B0(org.telegram.ui.Components.y4.N(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                    break;
                }
            case 9:
                LaunchActivity launchActivity2 = (LaunchActivity) this.b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.c;
                Pattern pattern2 = LaunchActivity.x1;
                MessagesController.getInstance(launchActivity2.K).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity2.K);
                long j10 = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j10, j10, tL_chatInviteJoinResultWebView.query_id);
                break;
            case 10:
                h hVar = (h) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                Pattern pattern3 = LaunchActivity.x1;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.rl.j(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(tL_error.text);
                org.telegram.ui.Components.y4.u0(hVar, string, sb2.toString(), null);
                break;
            case 11:
                LaunchActivity launchActivity3 = (LaunchActivity) this.b;
                String str4 = (String) this.c;
                if (!launchActivity3.m0.getFragmentStack().isEmpty()) {
                    launchActivity3.m0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str4).getQueryParameter("ref")));
                    break;
                }
                break;
            case 12:
                LaunchActivity launchActivity4 = (LaunchActivity) this.b;
                TL_account.Password password = (TL_account.Password) this.c;
                Pattern pattern4 = LaunchActivity.x1;
                launchActivity4.j0(password);
                break;
            case 13:
                LaunchActivity launchActivity5 = (LaunchActivity) this.b;
                Runnable runnable = (Runnable) this.c;
                launchActivity5.m0.getView().setVisibility(4);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout = launchActivity5.n0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity5.n0.getView().getVisibility() == 0) {
                        launchActivity5.n0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity5.o0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity5.o0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 14:
                LaunchActivity launchActivity6 = (LaunchActivity) this.b;
                org.telegram.ui.Components.ec ecVar = (org.telegram.ui.Components.ec) this.c;
                if (!launchActivity6.M && LaunchActivity.A1) {
                    ecVar.j();
                    break;
                }
                break;
            case 15:
                LaunchActivity launchActivity7 = (LaunchActivity) this.b;
                nc1 nc1Var = (nc1) this.c;
                Pattern pattern5 = LaunchActivity.x1;
                launchActivity7.p0(nc1Var);
                break;
            case 16:
                LaunchActivity launchActivity8 = (LaunchActivity) this.b;
                we.d dVar = (we.d) this.c;
                launchActivity8.L0 = null;
                launchActivity8.M0 = null;
                launchActivity8.N0 = null;
                launchActivity8.O0 = null;
                launchActivity8.R0 = null;
                launchActivity8.P0 = null;
                if (dVar != null) {
                    dVar.b();
                    break;
                }
                break;
            case 17:
                we.d dVar2 = (we.d) this.b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.c;
                Pattern pattern6 = LaunchActivity.x1;
                if (dVar2 != null) {
                    dVar2.b();
                }
                if (b2Var != null) {
                    b2Var.dismiss();
                    break;
                }
                break;
            case 18:
                ob0 ob0Var = (ob0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                ob0Var.a();
                if (tLObject3 != null) {
                    ob0Var.a.j0((TL_account.Password) tLObject3);
                    break;
                }
                break;
            case 19:
                ((FiltersSetupActivity) this.c).X(((ob0) this.b).a.O());
                break;
            case 20:
                tc0 tc0Var = (tc0) this.b;
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
                    AndroidUtilities.runOnUIThread(new lq(tc0Var, createBitmap2, gLSurfaceView, 21));
                    break;
                }
                break;
            case 21:
                tc0 tc0Var2 = (tc0) this.b;
                LocationController.SharingLocationInfo sharingLocationInfo = (LocationController.SharingLocationInfo) this.c;
                tc0Var2.c.setImageResource(R.drawable.msg_location_alert2);
                tc0Var2.e0(sharingLocationInfo.proximityMeters);
                tc0Var2.C = false;
                break;
            case 22:
                ((EditText) this.b).removeTextChangedListener((gh.n4) this.c);
                break;
            case 23:
                sd0 sd0Var = (sd0) this.b;
                Runnable runnable2 = (Runnable) this.c;
                od0 od0Var = sd0Var.a;
                int i16 = 0;
                while (true) {
                    wr[] wrVarArr = od0Var.f;
                    if (i16 >= wrVarArr.length) {
                        runnable2.run();
                        od0Var.e = false;
                        break;
                    } else {
                        wrVarArr[i16].l(0.0f);
                        i16++;
                    }
                }
            case 24:
                be0 be0Var = (be0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                ig0 ig0Var = be0Var.y;
                ig0Var.k1(false, false);
                AndroidUtilities.hideKeyboard(be0Var.a);
                ig0Var.o1((TLRPC.TL_auth_authorization) tLObject4, false);
                break;
            case 25:
                be0 be0Var2 = (be0) this.b;
                String str5 = (String) this.c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = be0Var2.n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                byte[] x8 = z10 ? SRPHelper.getX(AndroidUtilities.getStringBytes(str5), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
                zd0 zd0Var = new zd0(be0Var2, 2);
                if (z10) {
                    TL_account.Password password2 = be0Var2.n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(x8, password2.srp_id, password2.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck == null) {
                        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                        tL_error2.text = "PASSWORD_HASH_INVALID";
                        zd0Var.run(null, tL_error2);
                        break;
                    } else {
                        TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                        tL_auth_checkPassword.password = startCheck;
                        i10 = ((org.telegram.ui.ActionBar.n2) be0Var2.y).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, zd0Var, 10);
                        break;
                    }
                }
                break;
            case 26:
                te0 te0Var = (te0) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                te0Var.K.k1(false, false);
                AndroidUtilities.hideKeyboard(te0Var.K.fragmentView.findFocus());
                te0Var.K.o1((TLRPC.TL_auth_authorization) tLObject5, true);
                TLRPC.FileLocation fileLocation = te0Var.J;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new a30(27, te0Var, fileLocation));
                    break;
                }
                break;
            case 27:
                te0 te0Var2 = (te0) this.b;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.c;
                i11 = ((org.telegram.ui.ActionBar.n2) te0Var2.K).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar(fileLocation2);
                break;
            case 28:
                ue0 ue0Var = (ue0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                ig0 ig0Var2 = ue0Var.A;
                ig0Var2.k1(false, true);
                if (tL_error3 == null) {
                    if (ue0Var.r != null && ue0Var.s != null && ue0Var.v != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("phoneFormated", ue0Var.r);
                        bundle2.putString("phoneHash", ue0Var.s);
                        bundle2.putString("code", ue0Var.v);
                        ig0Var2.u1(5, true, bundle2, false);
                        break;
                    } else {
                        ig0Var2.u1(0, true, null, true);
                        break;
                    }
                } else if (tL_error3.text.equals("2FA_RECENT_CONFIRM")) {
                    ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                    break;
                } else {
                    ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                    break;
                }
            default:
                mf0 mf0Var = (mf0) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.c);
                alertDialog$Builder.a.N = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.a.P = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.y1.k(new StringBuilder("+"), mf0Var.b, oe.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.a.setOnDismissListener(new if0(mf0Var, i13));
                alertDialog$Builder.o();
                break;
        }
    }
}
