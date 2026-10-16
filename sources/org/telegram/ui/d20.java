package org.telegram.ui;

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
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d20(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i10 = this.a;
        int i11 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.x = true;
                    break;
                }
                break;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = ((i20) obj2).e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                break;
            case 2:
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = ((n60) obj2).Y1;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    if (((org.telegram.ui.Components.voip.t) arrayList2.get(i12)).w != null) {
                        arrayList.remove(((org.telegram.ui.Components.voip.t) arrayList2.get(i12)).w);
                    }
                }
                while (i11 < arrayList.size()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i11);
                    if (videoParticipant.participant.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, videoParticipant.presentation);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
                    }
                    i11++;
                }
                break;
            case 3:
                n60 n60Var = (n60) obj2;
                n60Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                n60Var.dismiss();
                break;
            case 4:
                a6 a6Var = (a6) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.q2) obj).e.getBitmap(100, 100);
                    if (bitmap == null) {
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new d20(5, a6Var, di.m0.b(bitmap, true)));
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 5:
                ((n60) ((a6) obj2).b).U0.setNewColors((int[]) obj);
                break;
            case 6:
                y70.V((y70) obj2, (TLRPC.TL_error) obj);
                break;
            case 7:
                u70 u70Var = (u70) obj2;
                String str = (String) obj;
                v70 v70Var = u70Var.a;
                v70Var.e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                v70Var.c = v70Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new to(24, u70Var, str), 66);
                break;
            case 8:
                TLObject tLObject = (TLObject) obj;
                v70 v70Var2 = ((u70) obj2).a;
                if (tLObject != null) {
                    y70.a0(v70Var2.h, (TLRPC.TL_messages_stickerSet) tLObject);
                    break;
                } else {
                    y70.a0(v70Var2.h, null);
                    break;
                }
            case 9:
                x70 x70Var = (x70) obj2;
                String str2 = (String) obj;
                x70Var.h = str2;
                y70 y70Var = x70Var.r;
                if (y70Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                x70Var.n = y70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new fa(x70Var, str2, str2, 14), 66);
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.p0(15, (q80) obj2, (CacheByChatsController.KeepMediaException) obj), 150L);
                break;
            case 11:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                languageSelectActivity.e = (ArrayList) obj;
                languageSelectActivity.c.l();
                break;
            case 12:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) obj2;
                String str3 = (String) obj;
                int i13 = 11;
                if (str3.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new d20(i13, languageSelectActivity2, new ArrayList()));
                    break;
                } else {
                    System.currentTimeMillis();
                    ArrayList arrayList3 = new ArrayList();
                    int size = languageSelectActivity2.h.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) languageSelectActivity2.h.get(i14);
                        if (localeInfo.name.toLowerCase().startsWith(str3) || localeInfo.nameEnglish.toLowerCase().startsWith(str3)) {
                            arrayList3.add(localeInfo);
                        }
                    }
                    int size2 = languageSelectActivity2.f.size();
                    while (i11 < size2) {
                        LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity2.f.get(i11);
                        if (localeInfo2.name.toLowerCase().startsWith(str3) || localeInfo2.nameEnglish.toLowerCase().startsWith(str3)) {
                            arrayList3.add(localeInfo2);
                        }
                        i11++;
                    }
                    AndroidUtilities.runOnUIThread(new d20(i13, languageSelectActivity2, arrayList3));
                    break;
                }
                break;
            case 13:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLObject tLObject2 = (TLObject) obj;
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
                    fo foVar = new fo(bundle);
                    foVar.ia = resolvedbusinesschatlinks;
                    launchActivity.q0(foVar, false, true);
                    break;
                } else {
                    launchActivity.B0(org.telegram.ui.Components.g5.M(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                    break;
                }
            case 14:
                LaunchActivity launchActivity2 = (LaunchActivity) obj2;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) obj;
                Pattern pattern2 = LaunchActivity.B1;
                MessagesController.getInstance(launchActivity2.O).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity2.O);
                long j10 = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j10, j10, tL_chatInviteJoinResultWebView.query_id);
                break;
            case 15:
                Pattern pattern3 = LaunchActivity.B1;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c1.l(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(((TLRPC.TL_error) obj).text);
                org.telegram.ui.Components.g5.t0((h) obj2, string, sb2.toString(), null);
                break;
            case 16:
                LaunchActivity launchActivity3 = (LaunchActivity) obj2;
                String str4 = (String) obj;
                if (!launchActivity3.q0.getFragmentStack().isEmpty()) {
                    launchActivity3.q0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str4).getQueryParameter("ref")));
                    break;
                }
                break;
            case 17:
                Pattern pattern4 = LaunchActivity.B1;
                ((LaunchActivity) obj2).j0((TL_account.Password) obj);
                break;
            case 18:
                LaunchActivity launchActivity4 = (LaunchActivity) obj2;
                Runnable runnable = (Runnable) obj;
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
            case 19:
                org.telegram.ui.Components.sc scVar = (org.telegram.ui.Components.sc) obj;
                if (!((LaunchActivity) obj2).Q && LaunchActivity.E1) {
                    scVar.j();
                    break;
                }
                break;
            case 20:
                Pattern pattern5 = LaunchActivity.B1;
                ((LaunchActivity) obj2).p0((ce1) obj);
                break;
            case 21:
                LaunchActivity launchActivity5 = (LaunchActivity) obj2;
                pf.c cVar = (pf.c) obj;
                launchActivity5.P0 = null;
                launchActivity5.Q0 = null;
                launchActivity5.R0 = null;
                launchActivity5.S0 = null;
                launchActivity5.V0 = null;
                launchActivity5.T0 = null;
                if (cVar != null) {
                    cVar.b();
                    break;
                }
                break;
            case 22:
                pf.c cVar2 = (pf.c) obj2;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj;
                Pattern pattern6 = LaunchActivity.B1;
                if (cVar2 != null) {
                    cVar2.b();
                }
                if (a2Var != null) {
                    a2Var.dismiss();
                    break;
                }
                break;
            case 23:
                ic0 ic0Var = (ic0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                ic0Var.c();
                if (tLObject3 != null) {
                    ic0Var.a.j0((TL_account.Password) tLObject3);
                    break;
                }
                break;
            case 24:
                ((FiltersSetupActivity) obj2).X(((ic0) obj).a.O());
                break;
            case 25:
                ld0 ld0Var = (ld0) obj2;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) obj;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    AndroidUtilities.runOnUIThread(new br(ld0Var, createBitmap2, gLSurfaceView, 21));
                    break;
                }
                break;
            case 26:
                ld0 ld0Var2 = (ld0) obj2;
                ld0Var2.c.setImageResource(R.drawable.msg_location_alert2);
                ld0Var2.d0(((LocationController.SharingLocationInfo) obj).proximityMeters);
                ld0Var2.G = false;
                break;
            case 27:
                ((EditText) obj2).removeTextChangedListener((org.telegram.ui.Components.eo) obj);
                break;
            case 28:
                Runnable runnable2 = (Runnable) obj;
                ge0 ge0Var = ((je0) obj2).a;
                int i15 = 0;
                while (true) {
                    ks[] ksVarArr = ge0Var.f;
                    if (i15 >= ksVarArr.length) {
                        runnable2.run();
                        ge0Var.e = false;
                        break;
                    } else {
                        ksVarArr[i15].l(0.0f);
                        i15++;
                    }
                }
            default:
                te0 te0Var = (te0) obj2;
                ah0 ah0Var = te0Var.y;
                ah0Var.k1(false, false);
                AndroidUtilities.hideKeyboard(te0Var.a);
                ah0Var.o1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                break;
        }
    }

    public /* synthetic */ d20(ic0 ic0Var, FiltersSetupActivity filtersSetupActivity) {
        this.a = 24;
        this.c = ic0Var;
        this.b = filtersSetupActivity;
    }
}
