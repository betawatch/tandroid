package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e10(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String formatString;
        int i16;
        int i17;
        int i18;
        int i19 = this.a;
        int i20 = 10;
        int i21 = 13;
        int i22 = 3;
        int i23 = 1;
        boolean z11 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i19) {
            case 0:
                ((org.telegram.ui.ey) obj4).E4(((Integer) obj3).intValue());
                AndroidUtilities.runOnUIThread(new so(22, (oy) obj2, (org.telegram.ui.ActionBar.r2) obj), 200L);
                break;
            case 1:
                c40.N((c40) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TLRPC.TL_channels_getParticipants) obj);
                break;
            case 2:
                d90.n((d90) obj4, (TLRPC.TL_error) obj3, (TLRPC.Updates) obj2, (TLRPC.TL_messages_importChatInvite) obj);
                break;
            case 3:
                s90 s90Var = (s90) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject = (TLObject) obj;
                s90Var.y = false;
                s90Var.L = tL_chatInviteExported.link;
                if (tL_error == null) {
                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
                    if (tL_chatInviteExported.importers == null) {
                        tL_chatInviteExported.importers = new ArrayList<>(3);
                    }
                    tL_chatInviteExported.importers.clear();
                    for (int i24 = 0; i24 < tL_messages_chatInviteImporters.users.size(); i24++) {
                        tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
                    }
                    s90Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
                    break;
                }
                break;
            case 4:
                ua0 ua0Var = (ua0) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                boolean[] zArr = (boolean[]) obj;
                ((boolean[]) obj3)[0] = true;
                AndroidUtilities.cancelRunOnUIThread(ua0Var.Q);
                for (int i25 = 0; i25 < arrayList.size(); i25++) {
                    ((TL_stories.StoryItem) arrayList.get(i25)).pinned = zArr[i25];
                }
                ua0Var.getMessagesController().getStoriesController().q0(ua0Var.e, arrayList, false);
                break;
            case 5:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj4;
                fi.d dVar = (fi.d) obj3;
                org.telegram.ui.s6 s6Var = (org.telegram.ui.s6) obj2;
                Runnable runnable = (Runnable) obj;
                if (tL_error2 != null) {
                    wc.Y().g0(tL_error2, false);
                    break;
                } else {
                    dVar.setLoading(false);
                    s6Var.dismiss();
                    wc.Y().R(R.raw.chats_infotip, 36, LocaleController.getString(R.string.PremiumLastSeenSet)).j();
                    runnable.run();
                    break;
                }
            case 6:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) obj4;
                eyVar.showDialog(new org.telegram.ui.o31((Context) obj2, eyVar.getResourceProvider(), new u90(11, (xo0) obj3, eyVar)));
                ((l80) obj).u();
                break;
            case 7:
                org.telegram.ui.ey eyVar2 = (org.telegram.ui.ey) obj4;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                l80 l80Var = (l80) obj;
                byte[] bArr = tL_sponsoredPeer.random_id;
                org.telegram.ui.ActionBar.u6 resourceProvider = eyVar2.getResourceProvider();
                u90 u90Var = new u90(i20, (xo0) obj3, tL_sponsoredPeer);
                int i26 = org.telegram.ui.x21.w;
                int currentAccount = eyVar2.getCurrentAccount();
                Activity parentActivity = eyVar2.getParentActivity();
                if (parentActivity != null) {
                    TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
                    tL_messages_reportSponsoredMessage.random_id = bArr;
                    tL_messages_reportSponsoredMessage.option = new byte[0];
                    ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new org.telegram.messenger.mi(parentActivity, resourceProvider, bArr, eyVar2, u90Var, currentAccount));
                }
                l80Var.u();
                break;
            case 8:
                nr0.r((nr0) obj4, (AtomicReference) obj3, (uq0) obj2, (TLRPC.Dialog) obj);
                break;
            case 9:
                dz0.H((dz0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (MediaDataController) obj);
                break;
            case 10:
                dz0.p((org.telegram.ui.gs0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TLRPC.TL_messages_getAttachedStickers) obj);
                break;
            case 11:
                q11 q11Var = (q11) obj4;
                TLObject tLObject2 = (TLObject) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                try {
                    ((org.telegram.ui.ActionBar.e2) obj3).dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    MessagesController.getInstance(q11Var.d).performLogout(0);
                    break;
                } else if (tL_error3 == null || tL_error3.code != -1000) {
                    String string = LocaleController.getString(R.string.ErrorOccurred);
                    if (tL_error3 != null) {
                        StringBuilder l4 = b10.l(string, "\n");
                        l4.append(tL_error3.text);
                        string = l4.toString();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q11Var.getContext());
                    String string2 = LocaleController.getString(R.string.AppName);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                    e2Var.R = string2;
                    e2Var.T = string;
                    org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
                    break;
                }
                break;
            case 12:
                f41 f41Var = (f41) obj4;
                ((l80) obj3).u();
                ((MessagesController) obj2).getTopicsController().pinTopic(-f41Var.c, ((TLRPC.TL_forumTopic) obj).id, !r11.pinned, f41Var.h);
                break;
            case 13:
                g51.n((g51) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TLRPC.TL_textWithEntities) obj);
                break;
            case 14:
                org.telegram.ui.x50 x50Var = (org.telegram.ui.x50) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                TL_update.TL_updateGroupCall tL_updateGroupCall = (TL_update.TL_updateGroupCall) obj;
                AccountInstance accountInstance = x50Var.d;
                ChatObject.Call call = new ChatObject.Call();
                x50Var.a1 = call;
                call.call = new TLRPC.TL_groupCall();
                ChatObject.Call call2 = x50Var.a1;
                TLRPC.GroupCall groupCall = call2.call;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                call2.chatId = chat == null ? 0L : chat.id;
                groupCall.schedule_date = x50Var.k2;
                groupCall.flags |= 128;
                call2.currentAccount = accountInstance;
                call2.setSelfPeer(inputPeer);
                ChatObject.Call call3 = x50Var.a1;
                TLRPC.GroupCall groupCall2 = call3.call;
                TLRPC.GroupCall groupCall3 = tL_updateGroupCall.call;
                groupCall2.access_hash = groupCall3.access_hash;
                groupCall2.id = groupCall3.id;
                call3.createNoVideoParticipant();
                c30 c30Var = x50Var.p2;
                ChatObject.Call call4 = x50Var.a1;
                c30Var.c = call4;
                x50Var.a2.setGroupCall(call4);
                x50Var.o2.c = x50Var.a1;
                x50Var.c0.D0(accountInstance.getCurrentAccount(), x50Var.a1.getInputGroupCall(false));
                MessagesController messagesController = accountInstance.getMessagesController();
                ChatObject.Call call5 = x50Var.a1;
                messagesController.putGroupCall(call5.chatId, call5);
                break;
            case 15:
                org.telegram.ui.x50.w((org.telegram.ui.x50) obj4, (HashSet) obj3, (ChatObject.Call) obj2, (String) obj);
                break;
            case 16:
                TLObject tLObject3 = (TLObject) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                i30 i30Var = (i30) obj;
                if (tLObject3 instanceof Vector) {
                    Vector vector = (Vector) tLObject3;
                    for (int i27 = 0; i27 < Math.min(arrayList2.size(), vector.objects.size()); i27++) {
                        if (vector.objects.get(i27) instanceof TL_account.requirementToContactPremium) {
                            arrayList3.add(Long.valueOf(((TLRPC.User) arrayList2.get(i27)).id));
                        }
                    }
                }
                i30Var.run();
                break;
            case 17:
                org.telegram.ui.e50 e50Var = (org.telegram.ui.e50) obj4;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                String str = (String) obj;
                org.telegram.ui.x50 x50Var2 = e50Var.f;
                AccountInstance accountInstance2 = x50Var2.d;
                org.telegram.ui.q30 q30Var = x50Var2.b;
                ImageLocation imageLocation = e50Var.d;
                if (imageLocation != null) {
                    q30Var.K0 = imageLocation;
                    q30Var.q1 = null;
                    q30Var.r1 = null;
                    e50Var.d = null;
                }
                if (tL_error4 == null) {
                    TLRPC.User user = accountInstance2.getMessagesController().getUser(Long.valueOf(accountInstance2.getUserConfig().getClientUserId()));
                    if (user == null) {
                        user = accountInstance2.getUserConfig().getCurrentUser();
                        if (user != null) {
                            accountInstance2.getMessagesController().putUser(user, false);
                        }
                    } else {
                        accountInstance2.getUserConfig().setCurrentUser(user);
                    }
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject4;
                    ArrayList<TLRPC.PhotoSize> arrayList4 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList4, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList4, 800);
                    TLRPC.VideoSize videoSize = tL_photos_photo.photo.video_sizes.isEmpty() ? null : tL_photos_photo.photo.video_sizes.get(0);
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    user.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize == null || e50Var.c == null) {
                        z10 = true;
                    } else {
                        i13 = ((org.telegram.ui.ActionBar.k3) x50Var2).currentAccount;
                        File pathToAttach = FileLoader.getInstance(i13).getPathToAttach(closestPhotoSizeWithSize, true);
                        i14 = ((org.telegram.ui.ActionBar.k3) x50Var2).currentAccount;
                        FileLoader.getInstance(i14).getPathToAttach(e50Var.c, true).renameTo(pathToAttach);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(e50Var.c.volume_id);
                        sb2.append("_");
                        String n10 = a1.g.n(e50Var.c.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        String n11 = a1.g.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3);
                        ImageLoader imageLoader = ImageLoader.getInstance();
                        i15 = ((org.telegram.ui.ActionBar.k3) x50Var2).currentAccount;
                        z10 = true;
                        imageLoader.replaceImageInCache(n10, n11, ImageLocation.getForUser(i15, user, 1), false);
                    }
                    if (closestPhotoSizeWithSize2 != null && e50Var.b != null) {
                        i11 = ((org.telegram.ui.ActionBar.k3) x50Var2).currentAccount;
                        File pathToAttach2 = FileLoader.getInstance(i11).getPathToAttach(closestPhotoSizeWithSize2, z10);
                        i12 = ((org.telegram.ui.ActionBar.k3) x50Var2).currentAccount;
                        FileLoader.getInstance(i12).getPathToAttach(e50Var.b, z10).renameTo(pathToAttach2);
                    }
                    if (videoSize != null && str != null) {
                        i10 = ((org.telegram.ui.ActionBar.k3) x50Var2).currentAccount;
                        new File(str).renameTo(FileLoader.getInstance(i10).getPathToAttach(videoSize, "mp4", z10));
                    }
                    accountInstance2.getMessagesController().getDialogPhotos(user.id).reset();
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(user);
                    accountInstance2.getMessagesStorage().putUsersAndChats(arrayList5, null, false, true);
                    TLRPC.User user2 = accountInstance2.getMessagesController().getUser(Long.valueOf(e50Var.e));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance2.getCurrentAccount(), user2, 0);
                    ImageLocation forUser2 = ImageLocation.getForUser(accountInstance2.getCurrentAccount(), user2, 1);
                    if (ImageLocation.getForLocal(e50Var.b) == null) {
                        forUser2 = ImageLocation.getForLocal(e50Var.c);
                    }
                    q30Var.setCreateThumbFromParent(false);
                    q30Var.H(null, forUser, forUser2, true);
                    e50Var.c = null;
                    e50Var.b = null;
                    AndroidUtilities.updateVisibleRows(x50Var2.Q);
                    e50Var.a(1.0f);
                }
                accountInstance2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
                accountInstance2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                accountInstance2.getUserConfig().saveConfig(true);
                break;
            case 18:
                org.telegram.ui.z60.V((org.telegram.ui.z60) obj4, (ArrayList) obj3, (ArrayList) obj2, (CountDownLatch) obj);
                break;
            case 19:
                org.telegram.ui.g70 g70Var = (org.telegram.ui.g70) obj4;
                g70Var.d = (ArrayList) obj3;
                g70Var.e = (ArrayList) obj2;
                g70Var.l();
                org.telegram.ui.h70 h70Var = g70Var.r;
                h70Var.b.d.setVisibility(8);
                h70Var.b.e.setText(LocaleController.formatString(R.string.ChooseStickerNoResultsFound, (String) obj));
                h70Var.b.e(false, true);
                break;
            case 20:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                org.telegram.ui.kz kzVar = (org.telegram.ui.kz) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj;
                Pattern pattern = LaunchActivity.D1;
                try {
                    kzVar.run();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tLObject5 instanceof TLRPC.TL_langPackLanguage) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) tLObject5;
                    Pattern pattern2 = g5.a;
                    tL_langPackLanguage.lang_code = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    tL_langPackLanguage.plural_code = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    String str2 = tL_langPackLanguage.base_lang_code;
                    if (str2 != null) {
                        tL_langPackLanguage.base_lang_code = str2.replace('-', '_').toLowerCase();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(launchActivity);
                    boolean equals = LocaleController.getInstance().getCurrentLocaleInfo().shortName.equals(tL_langPackLanguage.lang_code);
                    org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.a;
                    if (equals) {
                        e2Var2.R = LocaleController.getString(R.string.Language);
                        formatString = LocaleController.formatString("LanguageSame", R.string.LanguageSame, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder2.i(LocaleController.getString(R.string.SETTINGS), new g1(launchActivity, objArr == true ? 1 : 0));
                    } else if (tL_langPackLanguage.strings_count == 0) {
                        e2Var2.R = LocaleController.getString(R.string.LanguageUnknownTitle);
                        formatString = LocaleController.formatString("LanguageUnknownCustomAlert", R.string.LanguageUnknownCustomAlert, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                    } else {
                        e2Var2.R = LocaleController.getString(R.string.LanguageTitle);
                        formatString = tL_langPackLanguage.official ? LocaleController.formatString("LanguageAlert", R.string.LanguageAlert, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f))) : LocaleController.formatString("LanguageCustomAlert", R.string.LanguageCustomAlert, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Change), new m4.s0(29, tL_langPackLanguage, launchActivity));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(formatString));
                    int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '[');
                    if (indexOf != -1) {
                        int i28 = indexOf + 1;
                        i16 = TextUtils.indexOf((CharSequence) spannableStringBuilder, ']', i28);
                        if (i16 != -1) {
                            spannableStringBuilder.delete(i16, i16 + 1);
                            spannableStringBuilder.delete(indexOf, i28);
                        }
                    } else {
                        i16 = -1;
                    }
                    if (indexOf != -1 && i16 != -1) {
                        spannableStringBuilder.setSpan(new r3(tL_langPackLanguage.translations_url, alertDialog$Builder2), indexOf, i16 - 1, 33);
                    }
                    TextView textView = new TextView(launchActivity);
                    textView.setText(spannableStringBuilder);
                    textView.setTextSize(1, 16.0f);
                    org.telegram.ui.ActionBar.f7.H(textView, org.telegram.ui.ActionBar.y6.k5, null);
                    org.telegram.ui.ActionBar.f7.D(textView, org.telegram.ui.ActionBar.y6.l5, null);
                    textView.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
                    textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.j5, null);
                    alertDialog$Builder2.o(textView);
                    launchActivity.G0(alertDialog$Builder2);
                    break;
                } else if (tL_error5 != null) {
                    if ("LANG_CODE_NOT_SUPPORTED".equals(tL_error5.text)) {
                        launchActivity.G0(g5.M(launchActivity, null, LocaleController.getString(R.string.LanguageUnsupportedError)));
                        break;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        org.telegram.ui.d3.p(R.string.ErrorOccurred, "\n", sb4);
                        sb4.append(tL_error5.text);
                        launchActivity.G0(g5.M(launchActivity, null, sb4.toString()));
                        break;
                    }
                }
                break;
            case 21:
                org.telegram.ui.ActionBar.e2 e2Var3 = (org.telegram.ui.ActionBar.e2) obj4;
                TLObject tLObject6 = (TLObject) obj3;
                org.telegram.ui.g gVar = (org.telegram.ui.g) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                Pattern pattern3 = LaunchActivity.D1;
                try {
                    e2Var3.dismiss();
                } catch (Exception unused) {
                }
                if (!(tLObject6 instanceof TLRPC.TL_authorization)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.kz(21, gVar, tL_error6));
                    break;
                }
                break;
            case 22:
                org.telegram.ui.ob0 ob0Var = (org.telegram.ui.ob0) obj4;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj;
                TLRPC.User[] userArr = (TLRPC.User[]) obj3;
                pr.e(r2Var.getContext(), ob0Var.b, userArr[0], (TLRPC.TL_requestPeerTypeCreateBot) obj2, true, new oy(i21, ob0Var, userArr), r2Var.getResourceProvider(), org.telegram.ui.ob0.d());
                break;
            case 23:
                org.telegram.ui.lb0.v0((org.telegram.ui.lb0) obj4, (TLObject) obj3, (HashSet) obj2, (TLRPC.TL_error) obj);
                break;
            case 24:
                EditText editText = (EditText) obj2;
                bo boVar = (bo) obj;
                ((sd0) obj4).a(0.0f);
                ((View) obj3).setTag(R.id.timeout_callback, null);
                if (editText != null) {
                    editText.post(new org.telegram.ui.kb0(i22, editText, boVar));
                    break;
                }
                break;
            case 25:
                org.telegram.ui.wd0 wd0Var = (org.telegram.ui.wd0) obj4;
                String str3 = (String) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = (TLRPC.TL_auth_recoverPassword) obj;
                byte[] stringBytes = str3 != null ? AndroidUtilities.getStringBytes(str3) : null;
                org.telegram.ui.ud0 ud0Var = new org.telegram.ui.ud0(wd0Var, str3, str4, objArr2 == true ? 1 : 0);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = wd0Var.s.new_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    if (str3 != null) {
                        tL_auth_recoverPassword.new_settings.new_password_hash = SRPHelper.getVBytes(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                            TLRPC.TL_error tL_error7 = new TLRPC.TL_error();
                            tL_error7.text = "ALGO_INVALID";
                            ud0Var.run(null, tL_error7);
                        }
                    }
                    i17 = ((org.telegram.ui.ActionBar.r2) wd0Var.G).currentAccount;
                    ConnectionsManager.getInstance(i17).sendRequest(tL_auth_recoverPassword, ud0Var, 10);
                    break;
                } else {
                    TLRPC.TL_error tL_error8 = new TLRPC.TL_error();
                    tL_error8.text = "PASSWORD_HASH_INVALID";
                    ud0Var.run(null, tL_error8);
                    break;
                }
            case 26:
                org.telegram.ui.le0 le0Var = (org.telegram.ui.le0) obj4;
                String str5 = (String) obj2;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj;
                org.telegram.ui.ig0 ig0Var = le0Var.y;
                ig0Var.p1(false, true);
                le0Var.n = false;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    Bundle bundle = new Bundle();
                    bundle.putString("emailCode", str5);
                    bundle.putString("password", le0Var.h);
                    ig0Var.z1(9, true, bundle, false);
                    break;
                } else if (tL_error9 != null && !tL_error9.text.startsWith("CODE_INVALID")) {
                    if (tL_error9.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error9.text).intValue();
                        ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                        break;
                    } else {
                        ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error9.text);
                        break;
                    }
                } else {
                    le0Var.n(true);
                    break;
                }
                break;
            case 27:
                org.telegram.ui.lf0 lf0Var = (org.telegram.ui.lf0) obj4;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj3;
                Bundle bundle2 = (Bundle) obj2;
                TLObject tLObject7 = (TLObject) obj;
                org.telegram.ui.ig0 ig0Var2 = lf0Var.u0;
                lf0Var.f0 = false;
                if (tL_error10 == null) {
                    lf0Var.q0 = bundle2;
                    if (tLObject7 instanceof TLRPC.TL_auth_sentCode) {
                        TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject7;
                        lf0Var.r0 = tL_auth_sentCode;
                        TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                        if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                            lf0Var.i0 = 17;
                        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                            lf0Var.i0 = 16;
                        }
                        ig0Var2.l1(bundle2, tL_auth_sentCode, true);
                    } else if (tLObject7 instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
                        TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) tLObject7;
                        bundle2.putString("product", tL_auth_sentCodePaymentRequired.store_product);
                        bundle2.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
                        bundle2.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
                        bundle2.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
                        bundle2.putString("currency", tL_auth_sentCodePaymentRequired.currency);
                        bundle2.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
                        bundle2.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
                        ig0Var2.z1(18, true, bundle2, true);
                    }
                } else {
                    String str6 = tL_error10.text;
                    if (str6 != null) {
                        if (str6.contains("PHONE_NUMBER_INVALID")) {
                            ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (tL_error10.text.contains("PHONE_CODE_EMPTY") || tL_error10.text.contains("PHONE_CODE_INVALID")) {
                            ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        } else if (tL_error10.text.contains("PHONE_CODE_EXPIRED")) {
                            lf0Var.c(true);
                            ig0Var2.z1(0, true, null, true);
                            ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                        } else if (tL_error10.text.startsWith("FLOOD_WAIT")) {
                            ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                        } else if (tL_error10.code != -1000) {
                            String string3 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            StringBuilder sb5 = new StringBuilder();
                            org.telegram.ui.d3.p(R.string.ErrorOccurred, "\n", sb5);
                            sb5.append(tL_error10.text);
                            ig0Var2.q1(string3, sb5.toString());
                        }
                    }
                }
                lf0Var.y(false);
                break;
            case 28:
                org.telegram.ui.qf0.n((org.telegram.ui.qf0) obj4, (String) obj3, (String) obj2, (String) obj);
                break;
            default:
                d5.o oVar = (d5.o) obj3;
                org.telegram.ui.t3 t3Var = (org.telegram.ui.t3) obj2;
                org.telegram.ui.ig0 ig0Var3 = ((org.telegram.ui.qf0) obj4).v;
                ig0Var3.e = true;
                BillingController.getInstance().addResultListener(oVar.c, new org.telegram.ui.h3(t3Var, i22));
                BillingController.getInstance().setOnCanceled(new org.telegram.ui.pf0(t3Var, i23));
                BillingController billingController = BillingController.getInstance();
                Activity parentActivity2 = ig0Var3.getParentActivity();
                i18 = ((org.telegram.ui.ActionBar.r2) ig0Var3).currentAccount;
                AccountInstance accountInstance3 = AccountInstance.getInstance(i18);
                rf.b bVar = new rf.b(i21, z11);
                bVar.R(oVar);
                billingController.launchBillingFlow(parentActivity2, accountInstance3, (TLRPC.TL_inputStorePaymentAuthCode) obj, Collections.singletonList(bVar.E()));
                break;
        }
    }

    public /* synthetic */ e10(xo0 xo0Var, org.telegram.ui.ey eyVar, Object obj, l80 l80Var, int i10) {
        this.a = i10;
        this.c = xo0Var;
        this.b = eyVar;
        this.d = obj;
        this.e = l80Var;
    }

    public /* synthetic */ e10(org.telegram.ui.ob0 ob0Var, org.telegram.ui.ActionBar.r2 r2Var, TLRPC.User[] userArr, TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot) {
        this.a = 22;
        this.b = ob0Var;
        this.e = r2Var;
        this.c = userArr;
        this.d = tL_requestPeerTypeCreateBot;
    }
}
