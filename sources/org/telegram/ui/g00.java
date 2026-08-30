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
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g00(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i10 = this.a;
        int i11 = 6;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                b10 b10Var = (b10) obj2;
                b10Var.getClass();
                b10Var.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                break;
            case 1:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.x = true;
                    break;
                }
                break;
            case 2:
                FiltersSetupActivity filtersSetupActivity2 = ((z10) obj2).e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                break;
            case 3:
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = ((c60) obj2).V1;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    if (((org.telegram.ui.Components.voip.t) arrayList2.get(i13)).w != null) {
                        arrayList.remove(((org.telegram.ui.Components.voip.t) arrayList2.get(i13)).w);
                    }
                }
                while (i12 < arrayList.size()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i12);
                    if (videoParticipant.participant.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, videoParticipant.presentation);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
                    }
                    i12++;
                }
                break;
            case 4:
                c60 c60Var = (c60) obj2;
                c60Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                c60Var.dismiss();
                break;
            case 5:
                z5 z5Var = (z5) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.s2) obj).e.getBitmap(100, 100);
                    if (bitmap == null) {
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new g00(i11, z5Var, ph.g0.b(bitmap, true)));
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 6:
                ((c60) ((z5) obj2).b).R0.setNewColors((int[]) obj);
                break;
            case 7:
                m70.V((m70) obj2, (TLRPC.TL_error) obj);
                break;
            case 8:
                i70 i70Var = (i70) obj2;
                String str = (String) obj;
                j70 j70Var = i70Var.a;
                j70Var.e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                j70Var.c = j70Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new lo(24, i70Var, str), 66);
                break;
            case 9:
                TLObject tLObject = (TLObject) obj;
                j70 j70Var2 = ((i70) obj2).a;
                if (tLObject != null) {
                    m70.a0(j70Var2.h, (TLRPC.TL_messages_stickerSet) tLObject);
                    break;
                } else {
                    m70.a0(j70Var2.h, null);
                    break;
                }
            case 10:
                l70 l70Var = (l70) obj2;
                String str2 = (String) obj;
                l70Var.h = str2;
                m70 m70Var = l70Var.r;
                if (m70Var.K) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                l70Var.n = m70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new ba(l70Var, str2, str2, 14), 66);
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.b(20, (d80) obj2, (CacheByChatsController.KeepMediaException) obj), 150L);
                break;
            case 12:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                languageSelectActivity.e = (ArrayList) obj;
                languageSelectActivity.c.l();
                break;
            case 13:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) obj2;
                String str3 = (String) obj;
                int i14 = 12;
                if (str3.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new g00(i14, languageSelectActivity2, new ArrayList()));
                    break;
                } else {
                    System.currentTimeMillis();
                    ArrayList arrayList3 = new ArrayList();
                    int size = languageSelectActivity2.h.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) languageSelectActivity2.h.get(i15);
                        if (localeInfo.name.toLowerCase().startsWith(str3) || localeInfo.nameEnglish.toLowerCase().startsWith(str3)) {
                            arrayList3.add(localeInfo);
                        }
                    }
                    int size2 = languageSelectActivity2.f.size();
                    while (i12 < size2) {
                        LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity2.f.get(i12);
                        if (localeInfo2.name.toLowerCase().startsWith(str3) || localeInfo2.nameEnglish.toLowerCase().startsWith(str3)) {
                            arrayList3.add(localeInfo2);
                        }
                        i12++;
                    }
                    AndroidUtilities.runOnUIThread(new g00(i14, languageSelectActivity2, arrayList3));
                    break;
                }
                break;
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLObject tLObject2 = (TLObject) obj;
                Pattern pattern = LaunchActivity.y1;
                if (tLObject2 instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject2;
                    MessagesController.getInstance(launchActivity.L).putUsers(resolvedbusinesschatlinks.users, false);
                    MessagesController.getInstance(launchActivity.L).putChats(resolvedbusinesschatlinks.chats, false);
                    MessagesStorage.getInstance(launchActivity.L).putUsersAndChats(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
                    Bundle bundle = new Bundle();
                    TLRPC.Peer peer = resolvedbusinesschatlinks.peer;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        bundle.putLong("user_id", peer.user_id);
                    } else if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                        bundle.putLong("chat_id", peer.channel_id);
                    }
                    xn xnVar = new xn(bundle);
                    xnVar.fa = resolvedbusinesschatlinks;
                    launchActivity.q0(xnVar, false, true);
                    break;
                } else {
                    launchActivity.B0(org.telegram.ui.Components.z4.N(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                    break;
                }
                break;
            case 15:
                LaunchActivity launchActivity2 = (LaunchActivity) obj2;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) obj;
                Pattern pattern2 = LaunchActivity.y1;
                MessagesController.getInstance(launchActivity2.L).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity2.L);
                long j10 = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j10, j10, tL_chatInviteJoinResultWebView.query_id);
                break;
            case 16:
                Pattern pattern3 = LaunchActivity.y1;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb = new StringBuilder();
                b.i(R.string.ErrorOccurred, "\n", sb);
                sb.append(((TLRPC.TL_error) obj).text);
                org.telegram.ui.Components.z4.u0((i) obj2, string, sb.toString(), null);
                break;
            case 17:
                LaunchActivity launchActivity3 = (LaunchActivity) obj2;
                String str4 = (String) obj;
                if (!launchActivity3.n0.getFragmentStack().isEmpty()) {
                    launchActivity3.n0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str4).getQueryParameter("ref")));
                    break;
                }
                break;
            case 18:
                Pattern pattern4 = LaunchActivity.y1;
                ((LaunchActivity) obj2).j0((TL_account.Password) obj);
                break;
            case 19:
                LaunchActivity launchActivity4 = (LaunchActivity) obj2;
                Runnable runnable = (Runnable) obj;
                launchActivity4.n0.getView().setVisibility(4);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout = launchActivity4.o0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity4.o0.getView().getVisibility() == 0) {
                        launchActivity4.o0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity4.p0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity4.p0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.ic icVar = (org.telegram.ui.Components.ic) obj;
                if (!((LaunchActivity) obj2).N && LaunchActivity.B1) {
                    icVar.j();
                    break;
                }
                break;
            case 21:
                Pattern pattern5 = LaunchActivity.y1;
                ((LaunchActivity) obj2).p0((cd1) obj);
                break;
            case 22:
                LaunchActivity launchActivity5 = (LaunchActivity) obj2;
                af.f fVar = (af.f) obj;
                launchActivity5.M0 = null;
                launchActivity5.N0 = null;
                launchActivity5.O0 = null;
                launchActivity5.P0 = null;
                launchActivity5.S0 = null;
                launchActivity5.Q0 = null;
                if (fVar != null) {
                    fVar.b();
                    break;
                }
                break;
            case 23:
                af.f fVar2 = (af.f) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                Pattern pattern6 = LaunchActivity.y1;
                if (fVar2 != null) {
                    fVar2.b();
                }
                if (d2Var != null) {
                    d2Var.dismiss();
                    break;
                }
                break;
            case 24:
                wb0 wb0Var = (wb0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                wb0Var.a();
                if (tLObject3 != null) {
                    wb0Var.a.j0((TL_account.Password) tLObject3);
                    break;
                }
                break;
            case 25:
                ((FiltersSetupActivity) obj).X(((wb0) obj2).a.O());
                break;
            case 26:
                ad0 ad0Var = (ad0) obj2;
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
                    AndroidUtilities.runOnUIThread(new rq(ad0Var, createBitmap2, gLSurfaceView, 21));
                    break;
                }
                break;
            case 27:
                ad0 ad0Var2 = (ad0) obj2;
                ad0Var2.c.setImageResource(R.drawable.msg_location_alert2);
                ad0Var2.e0(((LocationController.SharingLocationInfo) obj).proximityMeters);
                ad0Var2.D = false;
                break;
            case 28:
                ((EditText) obj2).removeTextChangedListener((cg.b0) obj);
                break;
            default:
                Runnable runnable2 = (Runnable) obj;
                vd0 vd0Var = ((yd0) obj2).a;
                int i16 = 0;
                while (true) {
                    bs[] bsVarArr = vd0Var.f;
                    if (i16 >= bsVarArr.length) {
                        runnable2.run();
                        vd0Var.e = false;
                        break;
                    } else {
                        bsVarArr[i16].l(0.0f);
                        i16++;
                    }
                }
        }
    }
}
