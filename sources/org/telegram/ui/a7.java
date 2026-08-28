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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a7 implements org.telegram.ui.Components.pk0, org.telegram.ui.Components.cj0, org.telegram.ui.Components.x4, LanguageDetector.StringCallback, u4, org.telegram.ui.ActionBar.b2, MessagesStorage.LongCallback, org.telegram.ui.Components.nk0, MessagesController.NewMessageCallback, wx, nf1, org.telegram.ui.Components.voip.h3, OnSuccessListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a7(Object obj, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.Components.x4
    public void B(int i9, int i10, boolean z10) {
        switch (this.a) {
            case 2:
                qn qnVar = (qn) this.b;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.c;
                Long l10 = (Long) this.d;
                qnVar.getClass();
                qnVar.cb(botInlineResult, z10, i9, l10.longValue());
                break;
            case 3:
            default:
                qn qnVar2 = (qn) this.b;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.c;
                MessageObject messageObject = (MessageObject) this.d;
                qnVar2.getClass();
                if (z10) {
                    TLRPC.SuggestedPost tl = MessageSuggestionParams.of(gf.a.l(suggestedPost != null ? suggestedPost.price : null), i9).toTl();
                    if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                        qnVar2.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                        break;
                    }
                }
                break;
            case 4:
                qn.Z((qn) this.b, (MessageObject.GroupedMessages) this.c, (MessageObject) this.d, i9, i10);
                break;
        }
    }

    @Override // org.telegram.ui.wx
    public /* synthetic */ boolean C() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.wx
    public /* synthetic */ boolean I(dy dyVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.cj0
    public void a(org.telegram.ui.Components.ej0 ej0Var, int i9) {
        int i10;
        View view = (View) this.b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
        int[] iArr = (int[]) this.d;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            view.measure(View.MeasureSpec.makeMeasureSpec(ej0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
            i10 = view.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
            view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_30));
        } else {
            i10 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], org.telegram.messenger.l0.C(52.0f, i10, i9), true);
    }

    @Override // org.telegram.ui.u4
    public void b(c5 c5Var) {
        switch (this.a) {
            case 6:
                cn cnVar = (cn) this.b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                int ordinal = c5Var.ordinal();
                if (ordinal == 0) {
                    cnVar.p(user, false);
                    break;
                } else if (ordinal == 3) {
                    cnVar.n(t1Var, user);
                    break;
                } else if (ordinal == 4) {
                    cnVar.c(user);
                    break;
                } else if (ordinal == 5) {
                    cnVar.a.ma(user);
                    break;
                }
                break;
            default:
                cn cnVar2 = (cn) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) this.d;
                int ordinal2 = c5Var.ordinal();
                if (ordinal2 == 0) {
                    cnVar2.o(chat);
                    break;
                } else if (ordinal2 != 1 && ordinal2 != 2) {
                    if (ordinal2 == 4) {
                        cnVar2.b(chat);
                        break;
                    } else if (ordinal2 == 5) {
                        cnVar2.a.ka(chat);
                        break;
                    }
                } else {
                    cnVar2.k(t1Var2, chat, 0, false);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.nk0
    public void c(float f10, float f11, int i9, View view) {
        o50.n((o50) this.b, (Activity) this.c, (ChatObject.Call) this.d, view, i9);
    }

    @Override // org.telegram.ui.Components.voip.h3
    public void d(org.telegram.ui.Components.voip.i3 i3Var) {
        mh1 mh1Var = (mh1) this.b;
        VoIPService voIPService = (VoIPService) this.c;
        org.telegram.ui.Components.voip.j3 j3Var = (org.telegram.ui.Components.voip.j3) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            AndroidUtilities.cancelRunOnUIThread(mh1Var.O0);
            mh1Var.N0 = false;
            if (mh1Var.s0.isTouchExplorationEnabled()) {
                i3Var.announceForAccessibility(voIPService.isFrontFaceCamera() ? LocaleController.getString(R.string.AccDescrVoipCamSwitchedToBack) : LocaleController.getString(R.string.AccDescrVoipCamSwitchedToFront));
            }
            j3Var.d(2, !voIPService.isFrontFaceCamera(), false);
            sharedInstance.switchCamera();
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        String str;
        int i10;
        int i11 = this.a;
        int i12 = 2;
        int i13 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i11) {
            case 8:
                so soVar = (so) obj3;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                vo voVar = soVar.a.W2;
                if (tL_username.editable) {
                    if (voVar.o0 == null) {
                        voVar.o0 = Boolean.valueOf(tL_username.active);
                    }
                    tL_username.active = !tL_username.active;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    TLRPC.Chat chat = voVar.T;
                    tL_inputChannel.channel_id = chat.id;
                    tL_inputChannel.access_hash = chat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z10 = tL_username.active;
                    tL_channels_toggleUsername.active = !z10;
                    voVar.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new kh.t1(soVar, tL_channels_toggleUsername, tL_username, z10, 3));
                    voVar.L.add(tL_username.username);
                    ((ja) view).setLoading(true);
                }
                voVar.U();
                break;
            case 9:
                hp hpVar = (hp) obj3;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                hpVar.getClass();
                if (((TLRPC.ChatFull) obj2).hidden_prehistory) {
                    hpVar.getMessagesController().toggleChannelInvitesHistory(chat2.id, false);
                }
                hpVar.X(chat2, null);
                break;
            case 10:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                xa1 xa1Var = (xa1) obj3;
                if (org.telegram.ui.ActionBar.f6.j0(((za1) obj2).d, (org.telegram.ui.ActionBar.d6) obj, true)) {
                    org.telegram.ui.ActionBar.f6.n1(false, false);
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, org.telegram.ui.ActionBar.f6.I, Boolean.valueOf(xa1Var.e.f == 1), null, -1);
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
                contactsActivity.m0(user, false, str);
                break;
            case 12:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj3;
                SharedConfig.storageCacheDir = (String) obj2;
                SharedConfig.saveConfig();
                SharedConfig.readOnlyStorageDirAlertShowed = false;
                dataSettingsActivity.m0(dataSettingsActivity.n);
                ImageLoader.getInstance().checkMediaPaths(new yt(dataSettingsActivity, i12));
                ((AlertDialog$Builder) obj).a.H0.run();
                break;
            case 13:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj2;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                ((AlertDialog$Builder) obj).a.H0.run();
                lz lzVar = ((jz) obj3).A.c;
                lzVar.d.title = editTextBoldCursor.getText().toString();
                lzVar.c0(true);
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = lzVar.d;
                if (lzVar.B != 0) {
                    lzVar.getConnectionsManager().cancelRequest(lzVar.B, true);
                    lzVar.B = 0;
                }
                TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = lzVar.c.id;
                tL_chatlists_editExportedInvite.slug = lzVar.a0();
                tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
                tL_chatlists_editExportedInvite.flags = 2 | tL_chatlists_editExportedInvite.flags;
                tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
                lzVar.B = lzVar.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new az(lzVar, i13));
                Utilities.Callback callback = lzVar.y;
                if (callback != null) {
                    callback.run(tL_exportedChatlistInvite);
                    break;
                }
                break;
            case 15:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj2;
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                ((r40) obj3).b.W0.setTitle(editTextBoldCursor2.getText().toString());
                ((AlertDialog$Builder) obj).a.H0.run();
                break;
            case 16:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj3;
                notificationsSettingsActivity.getClass();
                notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(-1, (ArrayList) obj2, (ArrayList) obj, false));
                break;
            case 21:
                h71 h71Var = (h71) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                i10 = ((org.telegram.ui.ActionBar.o2) h71Var.a).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(resetauthorization, new v40(27, h71Var, tL_authorization));
                ((w61) obj3).d.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.nf1
    public void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((l61) this.b).S((TLRPC.User) this.c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override // org.telegram.messenger.MessagesController.NewMessageCallback
    public boolean onMessageReceived(TLRPC.Message message) {
        co0 co0Var = (co0) this.b;
        org.telegram.ui.ActionBar.b5 b5Var = (org.telegram.ui.ActionBar.b5) this.c;
        Activity activity = (Activity) this.d;
        if (MessageObject.getPeerId(message.peer_id) != co0Var.h0.id || !(message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            return false;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0(co0Var, b5Var, activity, message, 25));
        return true;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        b3.b bVar = (b3.b) this.b;
        kh.d dVar = (kh.d) this.c;
        int[] iArr = (int[]) this.d;
        FileLog.d("wear-auth: /answer delivered to " + ((String) bVar.c));
        int i9 = 0;
        dVar.setLoading(false);
        int i10 = iArr[0];
        ArrayList arrayList = (ArrayList) bVar.e;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Context context = LaunchActivity.C1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        org.telegram.ui.ActionBar.b6 resourceProvider = U != null ? U.getResourceProvider() : null;
        org.telegram.ui.ActionBar.f3 f3Var = di1.c;
        if (f3Var != null) {
            f3Var.dismiss();
            di1.c = null;
        }
        org.telegram.ui.ActionBar.f3 j10 = org.telegram.messenger.ll.j(context, resourceProvider, false, false);
        FrameLayout frameLayout = new FrameLayout(context);
        j10.customView = frameLayout;
        LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
        frameLayout.addView(f10, g7.e6.e(-1, -1, 119));
        TextView b10 = g7.i6.b(context, 20.0f, org.telegram.ui.ActionBar.f6.j5, true, resourceProvider);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.WearAuthEmojis));
        f10.addView(b10, g7.e6.r(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        while (i9 < arrayList.size()) {
            Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable((String) arrayList.get(i9));
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(emojiBigDrawable);
            NotificationCenter.listenEmojiLoading(imageView);
            imageView.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.f6.l1(0.15f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, resourceProvider))));
            linearLayout.addView(imageView, g7.e6.k(i9 == 0 ? 0.0f : 5.0f, 0.0f, 0.0f, 0.0f, 80, 80));
            i9++;
        }
        f10.addView(linearLayout, g7.e6.t(-2, -2, 49, 32, 12, 32, 12));
        kh.d i11 = org.telegram.messenger.ll.i(24, context, resourceProvider, true);
        i11.setText(LocaleController.getString(R.string.WearAuthEmojisLogIn));
        f10.addView(i11, g7.e6.t(-1, 48, 7, 12, 12, 12, 8));
        int i12 = org.telegram.ui.ActionBar.f6.a7;
        j10.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i12, resourceProvider));
        j10.fixNavigationBar(org.telegram.ui.ActionBar.f6.v0(i12, resourceProvider));
        di1.c = j10;
        j10.show();
        i11.setOnClickListener(new fh.a3(i11, i10, j10, 19));
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        bq.Z((bq) this.b, (TLRPC.InputCheckPasswordSRP) this.c, (TwoStepVerificationActivity) this.d, j10);
    }

    @Override // org.telegram.ui.wx
    public boolean v(dy dyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i9, int i10, we1 we1Var) {
        long j10;
        int i11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i12 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i12) {
            case 18:
                ArrayList<MessageObject> arrayList2 = (ArrayList) obj2;
                qn qnVar = (qn) obj;
                PhotoViewer photoViewer = ((pr0) obj3).b;
                if (arrayList.size() > 1 || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId == UserConfig.getInstance(photoViewer.P).getClientUserId() || charSequence != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        long j11 = ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId;
                        if (charSequence != null) {
                            j10 = j11;
                            SendMessagesHelper.getInstance(photoViewer.P).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j10 = j11;
                        }
                        SendMessagesHelper.getInstance(photoViewer.P).sendMessage(arrayList2, j10, false, false, true, 0, 0L);
                    }
                    dyVar.finishFragment();
                    if (qnVar != null) {
                        qnVar.Q7();
                        UndoView undoView = qnVar.u3;
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
                    Bundle i14 = aa.d.i("scrollToTopOnResume", true);
                    if (DialogObject.isEncryptedDialog(j12)) {
                        i14.putInt("enc_id", DialogObject.getEncryptedChatId(j12));
                    } else if (DialogObject.isUserDialog(j12)) {
                        i14.putLong("user_id", j12);
                    } else {
                        i14.putLong("chat_id", -j12);
                    }
                    qn qnVar2 = new qn(i14);
                    if (topicKey.topicId != 0) {
                        vf.c.a(qnVar2, topicKey);
                    }
                    if (((LaunchActivity) photoViewer.y).q0(qnVar2, true, false)) {
                        qnVar2.Ab(arrayList2);
                        break;
                    } else {
                        dyVar.finishFragment();
                        break;
                    }
                }
                break;
            default:
                dz0 dz0Var = (dz0) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                dy dyVar2 = (dy) obj;
                long j13 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                ProfileActivity profileActivity = dz0Var.b;
                i11 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j13));
                if (chat == null || (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.add_admins))) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.v0);
                    String string = LocaleController.getString(R.string.AddBot);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                    c2Var.N = string;
                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), chat == null ? "" : chat.title));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new c3.g(dz0Var, j13, dyVar, user));
                    profileActivity.showDialog(c2Var);
                    break;
                } else {
                    profileActivity.getMessagesController().checkIsInChat(false, chat, user, new b9.a(dz0Var, j13, dyVar2, 10));
                    break;
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.pk0
    public boolean c(float f10, float f11, int i9, final View view) {
        final d7 d7Var = (d7) this.b;
        org.telegram.ui.Components.wk0 wk0Var = (org.telegram.ui.Components.wk0) this.c;
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
        r7 r7Var = d7Var.d;
        e7 e7Var = (e7) wk0Var.getAdapter();
        final l7 l7Var = (l7) e7Var.e.get(i9);
        if (!(view instanceof j7) && !(view instanceof org.telegram.ui.Cells.r7)) {
            h7 h7Var = r7Var.v;
            if (h7Var != null) {
                h7Var.o1(l7Var.c, l7Var.d, true);
            }
            return true;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(r7Var.getContext(), null);
        if (view instanceof org.telegram.ui.Cells.r7) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new ih.d0(d7Var, l7Var, e7Var, wk0Var, view, 4));
        } else if (((j7) view).b.getChildAt(0) instanceof org.telegram.ui.Cells.h7) {
            final int i10 = 0;
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_played, LocaleController.getString(R.string.PlayFile), false, null).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.b7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i10) {
                        case 0:
                            d7 d7Var2 = d7Var;
                            r7.b(d7Var2.d, l7Var.d, (j7) view);
                            org.telegram.ui.ActionBar.o1 o1Var = d7Var2.a;
                            if (o1Var != null) {
                                o1Var.d(true);
                                break;
                            }
                            break;
                        default:
                            d7 d7Var3 = d7Var;
                            r7.b(d7Var3.d, l7Var.d, (j7) view);
                            org.telegram.ui.ActionBar.o1 o1Var2 = d7Var3.a;
                            if (o1Var2 != null) {
                                o1Var2.d(true);
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            final int i11 = 1;
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.b7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i11) {
                        case 0:
                            d7 d7Var2 = d7Var;
                            r7.b(d7Var2.d, l7Var.d, (j7) view);
                            org.telegram.ui.ActionBar.o1 o1Var = d7Var2.a;
                            if (o1Var != null) {
                                o1Var.d(true);
                                break;
                            }
                            break;
                        default:
                            d7 d7Var3 = d7Var;
                            r7.b(d7Var3.d, l7Var.d, (j7) view);
                            org.telegram.ui.ActionBar.o1 o1Var2 = d7Var3.a;
                            if (o1Var2 != null) {
                                o1Var2.d(true);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        hh.a aVar = l7Var.d;
        if (aVar.b != 0 && aVar.g != 0) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_viewintopic, LocaleController.getString(R.string.ViewInChat), false, null).setOnClickListener(new b0(d7Var, l7Var, o2Var, 1));
        }
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(!r7Var.f.j.contains(l7Var.d) ? R.string.Select : R.string.Deselect), false, null).setOnClickListener(new mh.k3(13, d7Var, l7Var));
        d7Var.a = org.telegram.ui.Components.y4.Q(o2Var, actionBarPopupWindow$ActionBarPopupWindowLayout, view, (int) f10, (int) f11);
        r7Var.getRootView().dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        return true;
    }

    @Override // org.telegram.messenger.LanguageDetector.StringCallback
    public void run(String str) {
        qn qnVar = (qn) this.b;
        org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) this.c;
        CharSequence charSequence = (CharSequence) this.d;
        String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
        if (str == null || ((str.equals(language) && !str.equals(TranslateController.UNKNOWN_LANGUAGE)) || b31.X().contains(str))) {
            h0Var.setClickable(false);
        } else {
            h0Var.setOnClickListener(new ih.d0(qnVar, str, language, charSequence, h0Var, 6));
        }
    }

    @Override // org.telegram.ui.Components.pk0
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Components.pk0
    public /* synthetic */ void u(float f10) {
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ void g0(View view, float f10, float f11) {
    }
}
