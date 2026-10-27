package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e7 implements org.telegram.ui.Components.dm0, org.telegram.ui.Components.ok0, org.telegram.ui.Components.e5, LanguageDetector.StringCallback, y4, org.telegram.ui.ActionBar.b2, MessagesStorage.LongCallback, org.telegram.ui.Components.bm0, MessagesController.NewMessageCallback, xx, sf1, org.telegram.ui.Components.voip.j3, OnSuccessListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e7(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean C() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.e5
    public void G(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 2:
                wn wnVar = (wn) this.b;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.c;
                Long l4 = (Long) this.d;
                wnVar.getClass();
                wnVar.qb(botInlineResult, z10, i10, l4.longValue());
                break;
            case 3:
            default:
                wn wnVar2 = (wn) this.b;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.c;
                MessageObject messageObject = (MessageObject) this.d;
                wnVar2.getClass();
                if (z10) {
                    TLRPC.SuggestedPost tl = MessageSuggestionParams.of(bg.a.l(suggestedPost != null ? suggestedPost.price : null), i10).toTl();
                    if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                        wnVar2.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                        break;
                    }
                }
                break;
            case 4:
                wn.a1((wn) this.b, (MessageObject.GroupedMessages) this.c, (MessageObject) this.d, i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean K(ey eyVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public void a(org.telegram.ui.Components.qk0 qk0Var, int i10) {
        int i11;
        View view = (View) this.b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
        int[] iArr = (int[]) this.d;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            view.measure(View.MeasureSpec.makeMeasureSpec(qk0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
            i11 = view.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
            view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_30));
        } else {
            i11 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], org.telegram.messenger.t.D(52.0f, i11, i10), true);
    }

    @Override // org.telegram.ui.y4
    public void b(g5 g5Var) {
        switch (this.a) {
            case 6:
                hn hnVar = (hn) this.b;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                int ordinal = g5Var.ordinal();
                if (ordinal == 0) {
                    hnVar.y(user, false);
                    break;
                } else if (ordinal == 3) {
                    hnVar.t(s1Var, user);
                    break;
                } else if (ordinal == 4) {
                    hnVar.b(user);
                    break;
                } else if (ordinal == 5) {
                    hnVar.a.za(user);
                    break;
                }
                break;
            default:
                hn hnVar2 = (hn) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) this.d;
                int ordinal2 = g5Var.ordinal();
                if (ordinal2 == 0) {
                    hnVar2.w(chat);
                    break;
                } else if (ordinal2 != 1 && ordinal2 != 2) {
                    if (ordinal2 == 4) {
                        hnVar2.a(chat);
                        break;
                    } else if (ordinal2 == 5) {
                        hnVar2.a.xa(chat);
                        break;
                    }
                } else {
                    hnVar2.o(s1Var2, chat, 0, false);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.voip.j3
    public void d(org.telegram.ui.Components.voip.k3 k3Var) {
        rh1 rh1Var = (rh1) this.b;
        VoIPService voIPService = (VoIPService) this.c;
        org.telegram.ui.Components.voip.l3 l3Var = (org.telegram.ui.Components.voip.l3) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            AndroidUtilities.cancelRunOnUIThread(rh1Var.S0);
            rh1Var.R0 = false;
            if (rh1Var.w0.isTouchExplorationEnabled()) {
                k3Var.announceForAccessibility(voIPService.isFrontFaceCamera() ? LocaleController.getString(R.string.AccDescrVoipCamSwitchedToBack) : LocaleController.getString(R.string.AccDescrVoipCamSwitchedToFront));
            }
            l3Var.d(2, !voIPService.isFrontFaceCamera(), false);
            sharedInstance.switchCamera();
        }
    }

    @Override // org.telegram.ui.Components.bm0
    public void e(float f7, float f10, int i10, View view) {
        x50.n((x50) this.b, (Activity) this.c, (ChatObject.Call) this.d, view, i10);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        String str;
        int i11;
        switch (this.a) {
            case 8:
                zo zoVar = (zo) this.b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.c;
                View view = (View) this.d;
                cp cpVar = zoVar.a.i3;
                if (tL_username.editable) {
                    if (cpVar.r0 == null) {
                        cpVar.r0 = Boolean.valueOf(tL_username.active);
                    }
                    tL_username.active = !tL_username.active;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    TLRPC.Chat chat = cpVar.X;
                    tL_inputChannel.channel_id = chat.id;
                    tL_inputChannel.access_hash = chat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z10 = tL_username.active;
                    tL_channels_toggleUsername.active = !z10;
                    cpVar.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new bi.d4(zoVar, tL_channels_toggleUsername, tL_username, z10, 4));
                    cpVar.P.add(tL_username.username);
                    ((qa) view).setLoading(true);
                }
                cpVar.X();
                break;
            case 9:
                pp ppVar = (pp) this.b;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                ppVar.getClass();
                if (chatFull.hidden_prehistory) {
                    ppVar.getMessagesController().toggleChannelInvitesHistory(chat2.id, false);
                }
                ppVar.Z(chat2, null);
                break;
            case 10:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                db1 db1Var = (db1) this.b;
                if (org.telegram.ui.ActionBar.y6.k0(((fb1) this.c).d, (org.telegram.ui.ActionBar.w6) this.d, true)) {
                    org.telegram.ui.ActionBar.y6.q1(false, false);
                    org.telegram.ui.ActionBar.y6.H1(org.telegram.ui.ActionBar.y6.I, db1Var.e.f == 1, -1, null);
                    break;
                }
                break;
            case 11:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                EditText editText = (EditText) this.d;
                if (editText != null) {
                    contactsActivity.getClass();
                    str = editText.getText().toString();
                } else {
                    str = "0";
                }
                contactsActivity.h0(user, false, str);
                break;
            case 12:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.b;
                String str2 = (String) this.c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                SharedConfig.storageCacheDir = str2;
                SharedConfig.saveConfig();
                SharedConfig.readOnlyStorageDirAlertShowed = false;
                dataSettingsActivity.o0(dataSettingsActivity.n);
                ImageLoader.getInstance().checkMediaPaths(new yt(dataSettingsActivity, 2));
                alertDialog$Builder.a.N0.run();
                break;
            case 13:
                mz mzVar = (mz) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                alertDialog$Builder2.a.N0.run();
                oz ozVar = mzVar.E.c;
                ozVar.d.title = editTextBoldCursor.getText().toString();
                ozVar.e0(true);
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = ozVar.d;
                if (ozVar.E != 0) {
                    ozVar.getConnectionsManager().cancelRequest(ozVar.E, true);
                    ozVar.E = 0;
                }
                TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = ozVar.c.id;
                tL_chatlists_editExportedInvite.slug = ozVar.c0();
                tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
                tL_chatlists_editExportedInvite.flags |= 2;
                tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
                ozVar.E = ozVar.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new cz(ozVar, 1));
                Utilities.Callback callback = ozVar.x;
                if (callback != null) {
                    callback.run(tL_exportedChatlistInvite);
                    break;
                }
                break;
            case 15:
                a50 a50Var = (a50) this.b;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.c;
                AlertDialog$Builder alertDialog$Builder3 = (AlertDialog$Builder) this.d;
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                a50Var.b.a1.setTitle(editTextBoldCursor2.getText().toString());
                alertDialog$Builder3.a.N0.run();
                break;
            case 16:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                notificationsSettingsActivity.getClass();
                notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(-1, arrayList, arrayList2, false));
                break;
            case 21:
                a71 a71Var = (a71) this.b;
                l71 l71Var = (l71) this.c;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.d;
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                i11 = ((org.telegram.ui.ActionBar.r2) l71Var.a).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(resetauthorization, new l10(29, l71Var, tL_authorization));
                a71Var.d.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.sf1
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((p61) this.b).T((TLRPC.User) this.c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override // org.telegram.messenger.MessagesController.NewMessageCallback
    public boolean onMessageReceived(TLRPC.Message message) {
        ro0 ro0Var = (ro0) this.b;
        org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) this.c;
        Activity activity = (Activity) this.d;
        if (MessageObject.getPeerId(message.peer_id) != ro0Var.l0.id || !(message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            return false;
        }
        AndroidUtilities.runOnUIThread(new cg0(ro0Var, j5Var, activity, message, 3));
        return true;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        a8.me meVar = (a8.me) this.b;
        fi.d dVar = (fi.d) this.c;
        int[] iArr = (int[]) this.d;
        FileLog.d("wear-auth: /answer delivered to " + ((String) meVar.c));
        int i10 = 0;
        dVar.setLoading(false);
        int i11 = iArr[0];
        ArrayList arrayList = (ArrayList) meVar.e;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Context context = LaunchActivity.I1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        org.telegram.ui.ActionBar.u6 resourceProvider = U != null ? U.getResourceProvider() : null;
        org.telegram.ui.ActionBar.k3 k3Var = ki1.c;
        if (k3Var != null) {
            k3Var.dismiss();
            ki1.c = null;
        }
        org.telegram.ui.ActionBar.k3 i12 = org.telegram.messenger.wh.i(1, context, resourceProvider, false);
        ji1 ji1Var = new ji1(context);
        i12.customView = ji1Var;
        LinearLayout d = org.telegram.messenger.wh.d(context, 1);
        ji1Var.addView(d, org.telegram.ui.Components.kb1.i(-1, -1, 119));
        TextView L = org.telegram.ui.Components.kb1.L(context, 20.0f, org.telegram.ui.ActionBar.y6.j5, true, resourceProvider);
        L.setGravity(17);
        L.setText(LocaleController.getString(R.string.WearAuthEmojis));
        d.addView(L, org.telegram.ui.Components.kb1.v(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        while (i10 < arrayList.size()) {
            Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable((String) arrayList.get(i10));
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(emojiBigDrawable);
            NotificationCenter.listenEmojiLoading(imageView);
            int dp = AndroidUtilities.dp(80.0f);
            int i13 = org.telegram.ui.ActionBar.y6.Oh;
            ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(dp, org.telegram.ui.ActionBar.y6.o1(0.15f, org.telegram.ui.ActionBar.y6.w0(i13, resourceProvider)));
            org.telegram.ui.ActionBar.b7 L2 = org.telegram.ui.ActionBar.f7.L(0.15f, i13);
            imageView.setBackground(K);
            org.telegram.ui.ActionBar.f7.k(imageView, K, L2, null, resourceProvider);
            linearLayout.addView(imageView, org.telegram.ui.Components.kb1.o(i10 == 0 ? 0.0f : 5.0f, 0.0f, 0.0f, 0.0f, 80, 80));
            i10++;
        }
        d.addView(linearLayout, org.telegram.ui.Components.kb1.x(-2, -2, 49, 32, 12, 32, 12));
        fi.d f7 = org.telegram.messenger.wh.f(24, context, resourceProvider, true);
        f7.setText(LocaleController.getString(R.string.WearAuthEmojisLogIn));
        d.addView(f7, org.telegram.ui.Components.kb1.x(-1, 48, 7, 12, 12, 12, 8));
        int i14 = org.telegram.ui.ActionBar.y6.a7;
        i12.setBackgroundColorKey(i14);
        i12.fixNavigationBarKey(i14);
        ki1.c = i12;
        i12.show();
        f7.setOnClickListener(new bi.pa(f7, i11, i12, 20));
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        iq.b0((iq) this.b, (TLRPC.InputCheckPasswordSRP) this.c, (TwoStepVerificationActivity) this.d, j10);
    }

    @Override // org.telegram.ui.xx
    public boolean v(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, cf1 cf1Var) {
        long j10;
        int i12;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i13 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i13) {
            case 18:
                ArrayList<MessageObject> arrayList2 = (ArrayList) obj2;
                wn wnVar = (wn) obj;
                PhotoViewer photoViewer = ((hs0) obj3).b;
                if (arrayList.size() > 1 || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId == UserConfig.getInstance(photoViewer.T).getClientUserId() || charSequence != null) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        long j11 = ((MessagesStorage.TopicKey) arrayList.get(i14)).dialogId;
                        if (charSequence != null) {
                            j10 = j11;
                            SendMessagesHelper.getInstance(photoViewer.T).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j10 = j11;
                        }
                        SendMessagesHelper.getInstance(photoViewer.T).sendMessage(arrayList2, j10, false, false, true, 0, 0L);
                    }
                    eyVar.finishFragment();
                    if (wnVar != null) {
                        wnVar.Z7();
                        UndoView undoView = wnVar.K3;
                        if (undoView != null) {
                            if (arrayList.size() == 1) {
                                undoView.m(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId, Integer.valueOf(arrayList2.size()), 53);
                                break;
                            } else {
                                undoView.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
                                break;
                            }
                        }
                    }
                } else {
                    MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) arrayList.get(0);
                    long j12 = topicKey.dialogId;
                    Bundle i15 = a1.g.i("scrollToTopOnResume", true);
                    if (DialogObject.isEncryptedDialog(j12)) {
                        i15.putInt("enc_id", DialogObject.getEncryptedChatId(j12));
                    } else if (DialogObject.isUserDialog(j12)) {
                        i15.putLong("user_id", j12);
                    } else {
                        i15.putLong("chat_id", -j12);
                    }
                    wn wnVar2 = new wn(i15);
                    if (topicKey.topicId != 0) {
                        pg.d.a(wnVar2, topicKey);
                    }
                    if (((LaunchActivity) photoViewer.y).v0(wnVar2, true, false)) {
                        wnVar2.Qb(arrayList2);
                        break;
                    } else {
                        eyVar.finishFragment();
                        break;
                    }
                }
                break;
            default:
                tz0 tz0Var = (tz0) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                ey eyVar2 = (ey) obj;
                long j13 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                ProfileActivity profileActivity = tz0Var.b;
                i12 = ((org.telegram.ui.ActionBar.r2) profileActivity).currentAccount;
                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j13));
                if (chat == null || (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.add_admins))) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.z0);
                    String string = LocaleController.getString(R.string.AddBot);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                    e2Var.R = string;
                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), chat == null ? "" : chat.title));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new ag.j0(tz0Var, j13, eyVar, user, 5));
                    profileActivity.showDialog(e2Var);
                    break;
                } else {
                    profileActivity.getMessagesController().checkIsInChat(false, chat, user, new bi.i(tz0Var, j13, eyVar2, 8));
                    break;
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.dm0
    public boolean e(float f7, float f10, int i10, final View view) {
        final h7 h7Var = (h7) this.b;
        org.telegram.ui.Components.nm0 nm0Var = (org.telegram.ui.Components.nm0) this.c;
        c7 c7Var = (c7) this.d;
        x7 x7Var = h7Var.f;
        j7 j7Var = (j7) nm0Var.getAdapter();
        final q7 q7Var = (q7) j7Var.e.get(i10);
        if (!(view instanceof o7) && !(view instanceof org.telegram.ui.Cells.w7)) {
            m7 m7Var = x7Var.F;
            if (m7Var != null) {
                m7Var.q(q7Var.c, q7Var.d, true);
            }
            return true;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(x7Var.getContext(), null);
        if (view instanceof org.telegram.ui.Cells.w7) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new di.e0(h7Var, q7Var, j7Var, nm0Var, view, 5));
        } else if (((o7) view).b.getChildAt(0) instanceof org.telegram.ui.Cells.n7) {
            final int i11 = 0;
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_played, LocaleController.getString(R.string.PlayFile), false, null).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.f7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i11) {
                        case 0:
                            h7 h7Var2 = h7Var;
                            x7.b(h7Var2.f, q7Var.d, (o7) view);
                            org.telegram.ui.ActionBar.o1 o1Var = h7Var2.a;
                            if (o1Var != null) {
                                o1Var.d(true);
                                break;
                            }
                            break;
                        default:
                            h7 h7Var3 = h7Var;
                            x7.b(h7Var3.f, q7Var.d, (o7) view);
                            org.telegram.ui.ActionBar.o1 o1Var2 = h7Var3.a;
                            if (o1Var2 != null) {
                                o1Var2.d(true);
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            final int i12 = 1;
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.f7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i12) {
                        case 0:
                            h7 h7Var2 = h7Var;
                            x7.b(h7Var2.f, q7Var.d, (o7) view);
                            org.telegram.ui.ActionBar.o1 o1Var = h7Var2.a;
                            if (o1Var != null) {
                                o1Var.d(true);
                                break;
                            }
                            break;
                        default:
                            h7 h7Var3 = h7Var;
                            x7.b(h7Var3.f, q7Var.d, (o7) view);
                            org.telegram.ui.ActionBar.o1 o1Var2 = h7Var3.a;
                            if (o1Var2 != null) {
                                o1Var2.d(true);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        ci.a aVar = q7Var.d;
        if (aVar.b != 0 && aVar.g != 0) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_viewintopic, LocaleController.getString(R.string.ViewInChat), false, null).setOnClickListener(new z(h7Var, q7Var, c7Var, 1));
        }
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(!x7Var.h.j.contains(q7Var.d) ? R.string.Select : R.string.Deselect), false, null).setOnClickListener(new org.telegram.ui.ActionBar.u1(6, h7Var, q7Var));
        h7Var.a = org.telegram.ui.Components.g5.P(c7Var, actionBarPopupWindow$ActionBarPopupWindowLayout, view, (int) f7, (int) f10);
        x7Var.getRootView().dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        return true;
    }

    @Override // org.telegram.messenger.LanguageDetector.StringCallback
    public void run(String str) {
        wn wnVar = (wn) this.b;
        org.telegram.ui.Cells.g0 g0Var = (org.telegram.ui.Cells.g0) this.c;
        CharSequence charSequence = (CharSequence) this.d;
        String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
        if (str == null || ((str.equals(language) && !str.equals(TranslateController.UNKNOWN_LANGUAGE)) || a31.Z().contains(str))) {
            g0Var.setClickable(false);
        } else {
            g0Var.setOnClickListener(new di.e0(wnVar, str, language, charSequence, g0Var, 7));
        }
    }

    @Override // org.telegram.ui.Components.dm0
    public /* synthetic */ void g() {
    }

    @Override // org.telegram.ui.Components.dm0
    public /* synthetic */ void o(float f7) {
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void l0(View view, float f7, float f10) {
    }
}
