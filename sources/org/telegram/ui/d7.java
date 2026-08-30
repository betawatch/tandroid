package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d7 implements org.telegram.ui.Components.ll0, org.telegram.ui.Components.wj0, org.telegram.ui.Components.y4, LanguageDetector.StringCallback, x4, org.telegram.ui.ActionBar.c2, MessagesStorage.LongCallback, org.telegram.ui.Components.jl0, MessagesController.NewMessageCallback, iy, ag1, org.telegram.ui.Components.voip.i3, OnSuccessListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d7(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.iy
    public /* synthetic */ boolean C() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.y4
    public void J(int i10, int i11, boolean z4) {
        switch (this.a) {
            case 2:
                xn xnVar = (xn) this.b;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.c;
                Long l10 = (Long) this.d;
                xnVar.getClass();
                xnVar.cb(botInlineResult, z4, i10, l10.longValue());
                break;
            case 3:
            default:
                xn xnVar2 = (xn) this.b;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.c;
                MessageObject messageObject = (MessageObject) this.d;
                xnVar2.getClass();
                if (z4) {
                    TLRPC.SuggestedPost tl = MessageSuggestionParams.of(mf.a.l(suggestedPost != null ? suggestedPost.price : null), i10).toTl();
                    if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                        xnVar2.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                        break;
                    }
                }
                break;
            case 4:
                xn.a0((xn) this.b, (MessageObject.GroupedMessages) this.c, (MessageObject) this.d, i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.iy
    public /* synthetic */ boolean K(oy oyVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.wj0
    public void a(org.telegram.ui.Components.yj0 yj0Var, int i10) {
        int i11;
        View view = (View) this.b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
        int[] iArr = (int[]) this.d;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            view.measure(View.MeasureSpec.makeMeasureSpec(yj0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
            i11 = view.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
            view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_30));
        } else {
            i11 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], org.telegram.messenger.y3.C(52.0f, i11, i10), true);
    }

    @Override // org.telegram.ui.x4
    public void b(f5 f5Var) {
        switch (this.a) {
            case 6:
                jn jnVar = (jn) this.b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                int ordinal = f5Var.ordinal();
                if (ordinal == 0) {
                    jnVar.x(user, false);
                    break;
                } else if (ordinal == 3) {
                    jnVar.r(t1Var, user);
                    break;
                } else if (ordinal == 4) {
                    jnVar.c(user);
                    break;
                } else if (ordinal == 5) {
                    jnVar.a.ma(user);
                    break;
                }
                break;
            default:
                jn jnVar2 = (jn) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) this.d;
                int ordinal2 = f5Var.ordinal();
                if (ordinal2 == 0) {
                    jnVar2.v(chat);
                    break;
                } else if (ordinal2 != 1 && ordinal2 != 2) {
                    if (ordinal2 == 4) {
                        jnVar2.b(chat);
                        break;
                    } else if (ordinal2 == 5) {
                        jnVar2.a.ka(chat);
                        break;
                    }
                } else {
                    jnVar2.p(t1Var2, chat, 0, false);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public void c(float f10, float f11, int i10, View view) {
        c60.n((c60) this.b, (Activity) this.c, (ChatObject.Call) this.d, view, i10);
    }

    @Override // org.telegram.ui.Components.voip.i3
    public void d(org.telegram.ui.Components.voip.j3 j3Var) {
        ai1 ai1Var = (ai1) this.b;
        VoIPService voIPService = (VoIPService) this.c;
        org.telegram.ui.Components.voip.k3 k3Var = (org.telegram.ui.Components.voip.k3) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            AndroidUtilities.cancelRunOnUIThread(ai1Var.P0);
            ai1Var.O0 = false;
            if (ai1Var.t0.isTouchExplorationEnabled()) {
                j3Var.announceForAccessibility(voIPService.isFrontFaceCamera() ? LocaleController.getString(R.string.AccDescrVoipCamSwitchedToBack) : LocaleController.getString(R.string.AccDescrVoipCamSwitchedToFront));
            }
            k3Var.d(2, !voIPService.isFrontFaceCamera(), false);
            sharedInstance.switchCamera();
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ boolean e1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        String str;
        int i11;
        int i12 = this.a;
        int i13 = 2;
        int i14 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i12) {
            case 8:
                ap apVar = (ap) obj3;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                dp dpVar = apVar.a.X2;
                if (tL_username.editable) {
                    if (dpVar.p0 == null) {
                        dpVar.p0 = Boolean.valueOf(tL_username.active);
                    }
                    tL_username.active = !tL_username.active;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    TLRPC.Chat chat = dpVar.U;
                    tL_inputChannel.channel_id = chat.id;
                    tL_inputChannel.access_hash = chat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z4 = tL_username.active;
                    tL_channels_toggleUsername.active = !z4;
                    dpVar.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new wd(apVar, tL_channels_toggleUsername, tL_username, z4, 2));
                    dpVar.M.add(tL_username.username);
                    ((ma) view).setLoading(true);
                }
                dpVar.V();
                break;
            case 9:
                qp qpVar = (qp) obj3;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                qpVar.getClass();
                if (((TLRPC.ChatFull) obj2).hidden_prehistory) {
                    qpVar.getMessagesController().toggleChannelInvitesHistory(chat2.id, false);
                }
                qpVar.Y(chat2, null);
                break;
            case 10:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                lb1 lb1Var = (lb1) obj3;
                if (org.telegram.ui.ActionBar.j6.j0(((nb1) obj2).d, (org.telegram.ui.ActionBar.h6) obj, true)) {
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, org.telegram.ui.ActionBar.j6.I, Boolean.valueOf(lb1Var.e.f == 1), null, -1);
                    break;
                }
                break;
            case 11:
                ContactsActivity contactsActivity = (ContactsActivity) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                EditText editText = (EditText) obj;
                if (editText != null) {
                    contactsActivity.getClass();
                    str = editText.getText().toString();
                } else {
                    str = "0";
                }
                contactsActivity.n0(user, false, str);
                break;
            case 12:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj3;
                SharedConfig.storageCacheDir = (String) obj2;
                SharedConfig.saveConfig();
                SharedConfig.readOnlyStorageDirAlertShowed = false;
                dataSettingsActivity.n0(dataSettingsActivity.n);
                ImageLoader.getInstance().checkMediaPaths(new hu(dataSettingsActivity, i13));
                ((AlertDialog$Builder) obj).a.I0.run();
                break;
            case 13:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj2;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                ((AlertDialog$Builder) obj).a.I0.run();
                yz yzVar = ((wz) obj3).B.c;
                yzVar.d.title = editTextBoldCursor.getText().toString();
                yzVar.d0(true);
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = yzVar.d;
                if (yzVar.C != 0) {
                    yzVar.getConnectionsManager().cancelRequest(yzVar.C, true);
                    yzVar.C = 0;
                }
                TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = yzVar.c.id;
                tL_chatlists_editExportedInvite.slug = yzVar.b0();
                tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
                tL_chatlists_editExportedInvite.flags = 2 | tL_chatlists_editExportedInvite.flags;
                tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
                yzVar.C = yzVar.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new mz(yzVar, i14));
                Utilities.Callback callback = yzVar.y;
                if (callback != null) {
                    callback.run(tL_exportedChatlistInvite);
                    break;
                }
                break;
            case 15:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj2;
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                ((g50) obj3).b.X0.setTitle(editTextBoldCursor2.getText().toString());
                ((AlertDialog$Builder) obj).a.I0.run();
                break;
            case 16:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj3;
                notificationsSettingsActivity.getClass();
                notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(-1, (ArrayList) obj2, (ArrayList) obj, false));
                break;
            case 21:
                x71 x71Var = (x71) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                i11 = ((org.telegram.ui.ActionBar.p2) x71Var.a).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(resetauthorization, new sb0(20, x71Var, tL_authorization));
                ((m71) obj3).d.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.ag1
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((b71) this.b).T((TLRPC.User) this.c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override // org.telegram.messenger.MessagesController.NewMessageCallback
    public boolean onMessageReceived(TLRPC.Message message) {
        jo0 jo0Var = (jo0) this.b;
        org.telegram.ui.ActionBar.e5 e5Var = (org.telegram.ui.ActionBar.e5) this.c;
        Activity activity = (Activity) this.d;
        if (MessageObject.getPeerId(message.peer_id) != jo0Var.i0.id || !(message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            return false;
        }
        AndroidUtilities.runOnUIThread(new a30(jo0Var, e5Var, activity, message, 17));
        return true;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        c5.j jVar = (c5.j) this.b;
        ph.d dVar = (ph.d) this.c;
        int[] iArr = (int[]) this.d;
        FileLog.d("wear-auth: /answer delivered to " + ((String) jVar.c));
        int i10 = 0;
        dVar.setLoading(false);
        int i11 = iArr[0];
        ArrayList arrayList = (ArrayList) jVar.e;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Context context = LaunchActivity.D1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        org.telegram.ui.ActionBar.f6 resourceProvider = U != null ? U.getResourceProvider() : null;
        org.telegram.ui.ActionBar.g3 g3Var = ri1.c;
        if (g3Var != null) {
            g3Var.dismiss();
            ri1.c = null;
        }
        org.telegram.ui.ActionBar.g3 o10 = org.telegram.messenger.y3.o(context, resourceProvider, false, false);
        FrameLayout frameLayout = new FrameLayout(context);
        o10.customView = frameLayout;
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        frameLayout.addView(f10, k7.b6.e(-1, -1, 119));
        TextView b10 = k7.f6.b(context, 20.0f, org.telegram.ui.ActionBar.j6.j5, true, resourceProvider);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.WearAuthEmojis));
        f10.addView(b10, k7.b6.r(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        while (i10 < arrayList.size()) {
            Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable((String) arrayList.get(i10));
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(emojiBigDrawable);
            NotificationCenter.listenEmojiLoading(imageView);
            imageView.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, resourceProvider))));
            linearLayout.addView(imageView, k7.b6.k(i10 == 0 ? 0.0f : 5.0f, 0.0f, 0.0f, 0.0f, 80, 80));
            i10++;
        }
        f10.addView(linearLayout, k7.b6.t(-2, -2, 49, 32, 12, 32, 12));
        ph.d p10 = org.telegram.messenger.y3.p(24, context, resourceProvider, true);
        p10.setText(LocaleController.getString(R.string.WearAuthEmojisLogIn));
        f10.addView(p10, k7.b6.t(-1, 48, 7, 12, 12, 12, 8));
        int i12 = org.telegram.ui.ActionBar.j6.a7;
        o10.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, resourceProvider));
        o10.fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(i12, resourceProvider));
        ri1.c = o10;
        o10.show();
        p10.setOnClickListener(new dg.m2(p10, i11, o10, 20));
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        jq.a0((jq) this.b, (TLRPC.InputCheckPasswordSRP) this.c, (TwoStepVerificationActivity) this.d, j10);
    }

    @Override // org.telegram.ui.iy
    public boolean w(oy oyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, kf1 kf1Var) {
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
                xn xnVar = (xn) obj;
                PhotoViewer photoViewer = ((wr0) obj3).b;
                if (arrayList.size() > 1 || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId == UserConfig.getInstance(photoViewer.Q).getClientUserId() || charSequence != null) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        long j11 = ((MessagesStorage.TopicKey) arrayList.get(i14)).dialogId;
                        if (charSequence != null) {
                            j10 = j11;
                            SendMessagesHelper.getInstance(photoViewer.Q).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j10 = j11;
                        }
                        SendMessagesHelper.getInstance(photoViewer.Q).sendMessage(arrayList2, j10, false, false, true, 0, 0L);
                    }
                    oyVar.finishFragment();
                    if (xnVar != null) {
                        xnVar.Q7();
                        UndoView undoView = xnVar.v3;
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
                    Bundle i15 = android.support.v4.media.a.i("scrollToTopOnResume", true);
                    if (DialogObject.isEncryptedDialog(j12)) {
                        i15.putInt("enc_id", DialogObject.getEncryptedChatId(j12));
                    } else if (DialogObject.isUserDialog(j12)) {
                        i15.putLong("user_id", j12);
                    } else {
                        i15.putLong("chat_id", -j12);
                    }
                    xn xnVar2 = new xn(i15);
                    if (topicKey.topicId != 0) {
                        ag.f.a(xnVar2, topicKey);
                    }
                    if (((LaunchActivity) photoViewer.y).q0(xnVar2, true, false)) {
                        xnVar2.Ab(arrayList2);
                        break;
                    } else {
                        oyVar.finishFragment();
                        break;
                    }
                }
                break;
            default:
                oz0 oz0Var = (oz0) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                oy oyVar2 = (oy) obj;
                long j13 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                ProfileActivity profileActivity = oz0Var.b;
                i12 = ((org.telegram.ui.ActionBar.p2) profileActivity).currentAccount;
                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j13));
                if (chat == null || (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.add_admins))) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.w0);
                    String string = LocaleController.getString(R.string.AddBot);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                    d2Var.O = string;
                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), chat == null ? "" : chat.title));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new d9.c(oz0Var, j13, oyVar, user));
                    profileActivity.showDialog(d2Var);
                    break;
                } else {
                    profileActivity.getMessagesController().checkIsInChat(false, chat, user, new e3.f(oz0Var, j13, oyVar2, 9));
                    break;
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean c(float f10, float f11, int i10, final View view) {
        final g7 g7Var = (g7) this.b;
        org.telegram.ui.Components.sl0 sl0Var = (org.telegram.ui.Components.sl0) this.c;
        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
        u7 u7Var = g7Var.d;
        h7 h7Var = (h7) sl0Var.getAdapter();
        final o7 o7Var = (o7) h7Var.e.get(i10);
        if (!(view instanceof m7) && !(view instanceof org.telegram.ui.Cells.r7)) {
            k7 k7Var = u7Var.v;
            if (k7Var != null) {
                k7Var.r(o7Var.c, o7Var.d, true);
            }
            return true;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(u7Var.getContext(), null);
        if (view instanceof org.telegram.ui.Cells.r7) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new nh.c0(g7Var, o7Var, h7Var, sl0Var, view, 4));
        } else if (((m7) view).b.getChildAt(0) instanceof org.telegram.ui.Cells.h7) {
            final int i11 = 0;
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_played, LocaleController.getString(R.string.PlayFile), false, null).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.e7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i11) {
                        case 0:
                            g7 g7Var2 = g7Var;
                            u7.b(g7Var2.d, o7Var.d, (m7) view);
                            org.telegram.ui.ActionBar.p1 p1Var = g7Var2.a;
                            if (p1Var != null) {
                                p1Var.d(true);
                                break;
                            }
                            break;
                        default:
                            g7 g7Var3 = g7Var;
                            u7.b(g7Var3.d, o7Var.d, (m7) view);
                            org.telegram.ui.ActionBar.p1 p1Var2 = g7Var3.a;
                            if (p1Var2 != null) {
                                p1Var2.d(true);
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            final int i12 = 1;
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.e7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i12) {
                        case 0:
                            g7 g7Var2 = g7Var;
                            u7.b(g7Var2.d, o7Var.d, (m7) view);
                            org.telegram.ui.ActionBar.p1 p1Var = g7Var2.a;
                            if (p1Var != null) {
                                p1Var.d(true);
                                break;
                            }
                            break;
                        default:
                            g7 g7Var3 = g7Var;
                            u7.b(g7Var3.d, o7Var.d, (m7) view);
                            org.telegram.ui.ActionBar.p1 p1Var2 = g7Var3.a;
                            if (p1Var2 != null) {
                                p1Var2.d(true);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        mh.a aVar = o7Var.d;
        if (aVar.b != 0 && aVar.g != 0) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_viewintopic, LocaleController.getString(R.string.ViewInChat), false, null).setOnClickListener(new b0(g7Var, o7Var, p2Var, 1));
        }
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(!u7Var.f.j.contains(o7Var.d) ? R.string.Select : R.string.Deselect), false, null).setOnClickListener(new org.telegram.messenger.video.g(11, g7Var, o7Var));
        g7Var.a = org.telegram.ui.Components.z4.Q(p2Var, actionBarPopupWindow$ActionBarPopupWindowLayout, view, (int) f10, (int) f11);
        u7Var.getRootView().dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        return true;
    }

    @Override // org.telegram.messenger.LanguageDetector.StringCallback
    public void run(String str) {
        xn xnVar = (xn) this.b;
        org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) this.c;
        CharSequence charSequence = (CharSequence) this.d;
        String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
        if (str == null || ((str.equals(language) && !str.equals(TranslateController.UNKNOWN_LANGUAGE)) || n31.Y().contains(str))) {
            h0Var.setClickable(false);
        } else {
            h0Var.setOnClickListener(new nh.c0(xnVar, str, language, charSequence, h0Var, 6));
        }
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ void p(float f10) {
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ void o0(View view, float f10, float f11) {
    }
}
