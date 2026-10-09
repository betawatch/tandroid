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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m70(int i10, Object obj, Object obj2) {
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
        int i12 = 5;
        int i13 = 0;
        switch (this.a) {
            case 0:
                s70.V((s70) this.b, (TLRPC.TL_error) this.c);
                break;
            case 1:
                o70 o70Var = (o70) this.b;
                String str = (String) this.c;
                p70 p70Var = o70Var.a;
                p70Var.e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                p70Var.c = p70Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new oo(24, o70Var, str), 66);
                break;
            case 2:
                o70 o70Var2 = (o70) this.b;
                TLObject tLObject = (TLObject) this.c;
                p70 p70Var2 = o70Var2.a;
                if (tLObject != null) {
                    s70.a0(p70Var2.h, (TLRPC.TL_messages_stickerSet) tLObject);
                    break;
                } else {
                    s70.a0(p70Var2.h, null);
                    break;
                }
            case 3:
                r70 r70Var = (r70) this.b;
                String str2 = (String) this.c;
                r70Var.h = str2;
                s70 s70Var = r70Var.r;
                if (s70Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                r70Var.n = s70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new ba(r70Var, str2, str2, 14), 66);
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(9, (m80) this.b, (CacheByChatsController.KeepMediaException) this.c), 150L);
                break;
            case 5:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.b;
                languageSelectActivity.e = (ArrayList) this.c;
                languageSelectActivity.c.l();
                break;
            case 6:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) this.b;
                String str3 = (String) this.c;
                if (str3.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new m70(i12, languageSelectActivity2, new ArrayList()));
                    break;
                } else {
                    System.currentTimeMillis();
                    ArrayList arrayList = new ArrayList();
                    int size = languageSelectActivity2.h.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) languageSelectActivity2.h.get(i14);
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
                    AndroidUtilities.runOnUIThread(new m70(i12, languageSelectActivity2, arrayList));
                    break;
                }
                break;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                Pattern pattern = LaunchActivity.B1;
                if (tLObject2 instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject2;
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
                    zn znVar = new zn(bundle);
                    znVar.ia = resolvedbusinesschatlinks;
                    launchActivity.q0(znVar, false, true);
                    break;
                } else {
                    launchActivity.B0(org.telegram.ui.Components.g5.M(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                    break;
                }
            case 8:
                LaunchActivity launchActivity2 = (LaunchActivity) this.b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.c;
                Pattern pattern2 = LaunchActivity.B1;
                MessagesController.getInstance(launchActivity2.O).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity2.O);
                long j3 = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j3, j3, tL_chatInviteJoinResultWebView.query_id);
                break;
            case 9:
                h hVar = (h) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                Pattern pattern3 = LaunchActivity.B1;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c1.l(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(tL_error.text);
                org.telegram.ui.Components.g5.t0(hVar, string, sb2.toString(), null);
                break;
            case 10:
                LaunchActivity launchActivity3 = (LaunchActivity) this.b;
                String str4 = (String) this.c;
                if (!launchActivity3.q0.getFragmentStack().isEmpty()) {
                    launchActivity3.q0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str4).getQueryParameter("ref")));
                    break;
                }
                break;
            case 11:
                LaunchActivity launchActivity4 = (LaunchActivity) this.b;
                TL_account.Password password = (TL_account.Password) this.c;
                Pattern pattern4 = LaunchActivity.B1;
                launchActivity4.j0(password);
                break;
            case 12:
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
            case 13:
                LaunchActivity launchActivity6 = (LaunchActivity) this.b;
                org.telegram.ui.Components.tc tcVar = (org.telegram.ui.Components.tc) this.c;
                if (!launchActivity6.Q && LaunchActivity.E1) {
                    tcVar.j();
                    break;
                }
                break;
            case 14:
                LaunchActivity launchActivity7 = (LaunchActivity) this.b;
                xd1 xd1Var = (xd1) this.c;
                Pattern pattern5 = LaunchActivity.B1;
                launchActivity7.p0(xd1Var);
                break;
            case 15:
                LaunchActivity launchActivity8 = (LaunchActivity) this.b;
                of.e eVar = (of.e) this.c;
                launchActivity8.P0 = null;
                launchActivity8.Q0 = null;
                launchActivity8.R0 = null;
                launchActivity8.S0 = null;
                launchActivity8.V0 = null;
                launchActivity8.T0 = null;
                if (eVar != null) {
                    eVar.b();
                    break;
                }
                break;
            case 16:
                of.e eVar2 = (of.e) this.b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.c;
                Pattern pattern6 = LaunchActivity.B1;
                if (eVar2 != null) {
                    eVar2.b();
                }
                if (b2Var != null) {
                    b2Var.dismiss();
                    break;
                }
                break;
            case 17:
                ec0 ec0Var = (ec0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                ec0Var.c();
                if (tLObject3 != null) {
                    ec0Var.a.j0((TL_account.Password) tLObject3);
                    break;
                }
                break;
            case 18:
                ((FiltersSetupActivity) this.c).X(((ec0) this.b).a.O());
                break;
            case 19:
                hd0 hd0Var = (hd0) this.b;
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
                    AndroidUtilities.runOnUIThread(new vq(hd0Var, createBitmap2, gLSurfaceView, 21));
                    break;
                }
                break;
            case 20:
                hd0 hd0Var2 = (hd0) this.b;
                LocationController.SharingLocationInfo sharingLocationInfo = (LocationController.SharingLocationInfo) this.c;
                hd0Var2.c.setImageResource(R.drawable.msg_location_alert2);
                hd0Var2.d0(sharingLocationInfo.proximityMeters);
                hd0Var2.G = false;
                break;
            case 21:
                ((EditText) this.b).removeTextChangedListener((org.telegram.ui.Components.ho) this.c);
                break;
            case 22:
                fe0 fe0Var = (fe0) this.b;
                Runnable runnable2 = (Runnable) this.c;
                ce0 ce0Var = fe0Var.a;
                int i15 = 0;
                while (true) {
                    es[] esVarArr = ce0Var.f;
                    if (i15 >= esVarArr.length) {
                        runnable2.run();
                        ce0Var.e = false;
                        break;
                    } else {
                        esVarArr[i15].l(0.0f);
                        i15++;
                    }
                }
            case 23:
                oe0 oe0Var = (oe0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                wg0 wg0Var = oe0Var.y;
                wg0Var.k1(false, false);
                AndroidUtilities.hideKeyboard(oe0Var.a);
                wg0Var.o1((TLRPC.TL_auth_authorization) tLObject4, false);
                break;
            case 24:
                oe0 oe0Var2 = (oe0) this.b;
                String str5 = (String) this.c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = oe0Var2.n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                byte[] x10 = z10 ? SRPHelper.getX(AndroidUtilities.getStringBytes(str5), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
                me0 me0Var = new me0(oe0Var2, 2);
                if (z10) {
                    TL_account.Password password2 = oe0Var2.n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(x10, password2.srp_id, password2.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck == null) {
                        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                        tL_error2.text = "PASSWORD_HASH_INVALID";
                        me0Var.run(null, tL_error2);
                        break;
                    } else {
                        TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                        tL_auth_checkPassword.password = startCheck;
                        i10 = ((org.telegram.ui.ActionBar.n2) oe0Var2.y).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, me0Var, 10);
                        break;
                    }
                }
                break;
            case 25:
                gf0 gf0Var = (gf0) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                gf0Var.O.k1(false, false);
                AndroidUtilities.hideKeyboard(gf0Var.O.fragmentView.findFocus());
                gf0Var.O.o1((TLRPC.TL_auth_authorization) tLObject5, true);
                TLRPC.FileLocation fileLocation = gf0Var.N;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new m70(26, gf0Var, fileLocation));
                    break;
                }
                break;
            case 26:
                gf0 gf0Var2 = (gf0) this.b;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.c;
                i11 = ((org.telegram.ui.ActionBar.n2) gf0Var2.O).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar(fileLocation2);
                break;
            case 27:
                hf0 hf0Var = (hf0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                wg0 wg0Var2 = hf0Var.E;
                wg0Var2.k1(false, true);
                if (tL_error3 == null) {
                    if (hf0Var.r != null && hf0Var.s != null && hf0Var.v != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("phoneFormated", hf0Var.r);
                        bundle2.putString("phoneHash", hf0Var.s);
                        bundle2.putString("code", hf0Var.v);
                        wg0Var2.u1(5, true, bundle2, false);
                        break;
                    } else {
                        wg0Var2.u1(0, true, null, true);
                        break;
                    }
                } else if (tL_error3.text.equals("2FA_RECENT_CONFIRM")) {
                    wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                    break;
                } else {
                    wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                    break;
                }
            case 28:
                zf0 zf0Var = (zf0) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.c);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.a.T = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.bi.g(new StringBuilder("+"), zf0Var.b, hf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.a.setOnDismissListener(new vf0(zf0Var, i13));
                alertDialog$Builder.o();
                break;
            default:
                zf0 zf0Var2 = (zf0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                zf0Var2.getClass();
                zf0Var2.e0 = tL_error4.text;
                break;
        }
    }
}
