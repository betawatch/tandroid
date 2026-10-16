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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f7 implements org.telegram.ui.Components.dm0, org.telegram.ui.Components.ok0, org.telegram.ui.Components.f5, LanguageDetector.StringCallback, z4, org.telegram.ui.ActionBar.z1, MessagesStorage.LongCallback, org.telegram.ui.Components.bm0, MessagesController.NewMessageCallback, sy, bh1, org.telegram.ui.Components.voip.h3, OnSuccessListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f7(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.sy
    public /* synthetic */ boolean D() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.f5
    public void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 2:
                fo foVar = (fo) this.b;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.c;
                Long l4 = (Long) this.d;
                foVar.getClass();
                foVar.gb(botInlineResult, z10, i10, l4.longValue());
                break;
            case 3:
            default:
                fo foVar2 = (fo) this.b;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.c;
                MessageObject messageObject = (MessageObject) this.d;
                foVar2.getClass();
                if (z10) {
                    TLRPC.SuggestedPost tl = MessageSuggestionParams.of(ag.a.l(suggestedPost != null ? suggestedPost.price : null), i10).toTl();
                    if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                        foVar2.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                        break;
                    }
                }
                break;
            case 4:
                fo.M0((fo) this.b, (MessageObject.GroupedMessages) this.c, (MessageObject) this.d, i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.sy
    public /* synthetic */ boolean L(yy yyVar) {
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
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], org.telegram.messenger.g0.C(52.0f, i11, i10), true);
    }

    @Override // org.telegram.ui.z4
    public void b(h5 h5Var) {
        switch (this.a) {
            case 6:
                qn qnVar = (qn) this.b;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                int ordinal = h5Var.ordinal();
                if (ordinal == 0) {
                    qnVar.v(user, false);
                    break;
                } else if (ordinal == 3) {
                    qnVar.p(u1Var, user);
                    break;
                } else if (ordinal == 4) {
                    qnVar.b(user);
                    break;
                } else if (ordinal == 5) {
                    qnVar.a.ra(user);
                    break;
                }
                break;
            default:
                qn qnVar2 = (qn) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) this.d;
                int ordinal2 = h5Var.ordinal();
                if (ordinal2 == 0) {
                    qnVar2.q(chat);
                    break;
                } else if (ordinal2 != 1 && ordinal2 != 2) {
                    if (ordinal2 == 4) {
                        qnVar2.a(chat);
                        break;
                    } else if (ordinal2 == 5) {
                        qnVar2.a.pa(chat);
                        break;
                    }
                } else {
                    qnVar2.l(u1Var2, chat, 0, false);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.voip.h3
    public void c(org.telegram.ui.Components.voip.i3 i3Var) {
        cj1 cj1Var = (cj1) this.b;
        VoIPService voIPService = (VoIPService) this.c;
        org.telegram.ui.Components.voip.j3 j3Var = (org.telegram.ui.Components.voip.j3) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            AndroidUtilities.cancelRunOnUIThread(cj1Var.S0);
            cj1Var.R0 = false;
            if (cj1Var.w0.isTouchExplorationEnabled()) {
                i3Var.announceForAccessibility(voIPService.isFrontFaceCamera() ? LocaleController.getString(R.string.AccDescrVoipCamSwitchedToBack) : LocaleController.getString(R.string.AccDescrVoipCamSwitchedToFront));
            }
            j3Var.d(2, !voIPService.isFrontFaceCamera(), false);
            sharedInstance.switchCamera();
        }
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public void d(float f7, float f10, int i10, View view) {
        n60.o((n60) this.b, (Activity) this.c, (ChatObject.Call) this.d, view, i10);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
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
                kp kpVar = (kp) obj3;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                np npVar = kpVar.a.Y2;
                if (tL_username.editable) {
                    if (npVar.s0 == null) {
                        npVar.s0 = Boolean.valueOf(tL_username.active);
                    }
                    tL_username.active = !tL_username.active;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    TLRPC.Chat chat = npVar.X;
                    tL_inputChannel.channel_id = chat.id;
                    tL_inputChannel.access_hash = chat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z10 = tL_username.active;
                    tL_channels_toggleUsername.active = !z10;
                    npVar.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new di.s1(kpVar, tL_channels_toggleUsername, tL_username, z10, 3));
                    npVar.P.add(tL_username.username);
                    ((sa) view).setLoading(true);
                }
                npVar.V();
                break;
            case 9:
                aq aqVar = (aq) obj3;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                aqVar.getClass();
                if (((TLRPC.ChatFull) obj2).hidden_prehistory) {
                    aqVar.getMessagesController().toggleChannelInvitesHistory(chat2.id, false);
                }
                aqVar.Y(chat2, null);
                break;
            case 10:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                mc1 mc1Var = (mc1) obj3;
                if (org.telegram.ui.ActionBar.g6.k0(((oc1) obj2).d, (org.telegram.ui.ActionBar.e6) obj, true)) {
                    org.telegram.ui.ActionBar.g6.o1(false, false);
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, org.telegram.ui.ActionBar.g6.I, Boolean.valueOf(mc1Var.e.f == 1), null, -1);
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
                ImageLoader.getInstance().checkMediaPaths(new ou(dataSettingsActivity, i13));
                ((AlertDialog$Builder) obj).a.L0.run();
                break;
            case 13:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj2;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                ((AlertDialog$Builder) obj).a.L0.run();
                h00 h00Var = ((f00) obj3).E.c;
                h00Var.d.title = editTextBoldCursor.getText().toString();
                h00Var.d0(true);
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = h00Var.d;
                if (h00Var.F != 0) {
                    h00Var.getConnectionsManager().cancelRequest(h00Var.F, true);
                    h00Var.F = 0;
                }
                TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = h00Var.c.id;
                tL_chatlists_editExportedInvite.slug = h00Var.b0();
                tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
                tL_chatlists_editExportedInvite.flags = 2 | tL_chatlists_editExportedInvite.flags;
                tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
                h00Var.F = h00Var.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new vz(h00Var, i14));
                Utilities.Callback callback = h00Var.y;
                if (callback != null) {
                    callback.run(tL_exportedChatlistInvite);
                    break;
                }
                break;
            case 15:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj2;
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                ((q50) obj3).b.a1.setTitle(editTextBoldCursor2.getText().toString());
                ((AlertDialog$Builder) obj).a.L0.run();
                break;
            case 16:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj3;
                notificationsSettingsActivity.getClass();
                notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(-1, (ArrayList) obj2, (ArrayList) obj, false));
                break;
            case 21:
                x81 x81Var = (x81) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                i11 = ((org.telegram.ui.ActionBar.m2) x81Var.a).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(resetauthorization, new ec0(20, x81Var, tL_authorization));
                ((m81) obj3).d.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.bh1
    public void i(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((b81) this.b).U((TLRPC.User) this.c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override // org.telegram.messenger.MessagesController.NewMessageCallback
    public boolean onMessageReceived(TLRPC.Message message) {
        ap0 ap0Var = (ap0) this.b;
        org.telegram.ui.ActionBar.b5 b5Var = (org.telegram.ui.ActionBar.b5) this.c;
        Activity activity = (Activity) this.d;
        if (MessageObject.getPeerId(message.peer_id) != ap0Var.l0.id || !(message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            return false;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ey0(ap0Var, b5Var, activity, message, 24));
        return true;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        com.google.android.gms.internal.cast.z5 z5Var = (com.google.android.gms.internal.cast.z5) this.b;
        di.d dVar = (di.d) this.c;
        int[] iArr = (int[]) this.d;
        FileLog.d("wear-auth: /answer delivered to " + ((String) z5Var.a));
        int i10 = 0;
        dVar.setLoading(false);
        int i11 = iArr[0];
        ArrayList arrayList = (ArrayList) z5Var.e;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        org.telegram.ui.ActionBar.c6 resourceProvider = U != null ? U.getResourceProvider() : null;
        org.telegram.ui.ActionBar.e3 e3Var = tj1.c;
        if (e3Var != null) {
            e3Var.dismiss();
            tj1.c = null;
        }
        org.telegram.ui.ActionBar.e3 i12 = org.telegram.messenger.sk.i(1, context, resourceProvider, false);
        FrameLayout frameLayout = new FrameLayout(context);
        i12.customView = frameLayout;
        LinearLayout e = org.telegram.messenger.sk.e(context, 1);
        frameLayout.addView(e, w7.z5.e(-1, -1, 119));
        TextView b10 = w7.d6.b(context, 20.0f, org.telegram.ui.ActionBar.g6.j5, true, resourceProvider);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.WearAuthEmojis));
        e.addView(b10, w7.z5.r(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        while (i10 < arrayList.size()) {
            Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable((String) arrayList.get(i10));
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(emojiBigDrawable);
            NotificationCenter.listenEmojiLoading(imageView);
            imageView.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.m1(0.15f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, resourceProvider))));
            linearLayout.addView(imageView, w7.z5.k(i10 == 0 ? 0.0f : 5.0f, 0.0f, 0.0f, 0.0f, 80, 80));
            i10++;
        }
        e.addView(linearLayout, w7.z5.t(-2, -2, 49, 32, 12, 32, 12));
        di.d f7 = org.telegram.messenger.sk.f(24, context, resourceProvider, true);
        f7.setText(LocaleController.getString(R.string.WearAuthEmojisLogIn));
        e.addView(f7, w7.z5.t(-1, 48, 7, 12, 12, 12, 8));
        int i13 = org.telegram.ui.ActionBar.g6.a7;
        i12.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(i13, resourceProvider));
        i12.fixNavigationBar(org.telegram.ui.ActionBar.g6.w0(i13, resourceProvider));
        tj1.c = i12;
        i12.show();
        f7.setOnClickListener(new org.telegram.ui.Cells.sa(f7, i11, i12, 18));
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        tq.a0((tq) this.b, (TLRPC.InputCheckPasswordSRP) this.c, (TwoStepVerificationActivity) this.d, j10);
    }

    @Override // org.telegram.ui.sy
    public boolean w(yy yyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, kg1 kg1Var) {
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
                fo foVar = (fo) obj;
                PhotoViewer photoViewer = ((ys0) obj3).b;
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
                    yyVar.finishFragment();
                    if (foVar != null) {
                        foVar.T7();
                        UndoView undoView = foVar.y3;
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
                    Bundle h = a1.g.h("scrollToTopOnResume", true);
                    if (DialogObject.isEncryptedDialog(j12)) {
                        h.putInt("enc_id", DialogObject.getEncryptedChatId(j12));
                    } else if (DialogObject.isUserDialog(j12)) {
                        h.putLong("user_id", j12);
                    } else {
                        h.putLong("chat_id", -j12);
                    }
                    fo foVar2 = new fo(h);
                    if (topicKey.topicId != 0) {
                        og.d.a(foVar2, topicKey);
                    }
                    if (((LaunchActivity) photoViewer.y).q0(foVar2, true, false)) {
                        foVar2.Eb(arrayList2);
                        break;
                    } else {
                        yyVar.finishFragment();
                        break;
                    }
                }
                break;
            default:
                m01 m01Var = (m01) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                yy yyVar2 = (yy) obj;
                long j13 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                ProfileActivity profileActivity = m01Var.b;
                i12 = ((org.telegram.ui.ActionBar.m2) profileActivity).currentAccount;
                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j13));
                if (chat == null || (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.add_admins))) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.z0);
                    String string = LocaleController.getString(R.string.AddBot);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                    a2Var.R = string;
                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), chat == null ? "" : chat.title));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new di.w6(m01Var, j13, yyVar, user));
                    profileActivity.showDialog(a2Var);
                    break;
                } else {
                    profileActivity.getMessagesController().checkIsInChat(false, chat, user, new di.p9(m01Var, j13, yyVar2, 6));
                    break;
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.dm0
    public boolean d(float f7, float f10, int i10, final View view) {
        final i7 i7Var = (i7) this.b;
        org.telegram.ui.Components.mm0 mm0Var = (org.telegram.ui.Components.mm0) this.c;
        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.d;
        w7 w7Var = i7Var.d;
        j7 j7Var = (j7) mm0Var.getAdapter();
        final q7 q7Var = (q7) j7Var.e.get(i10);
        if (!(view instanceof o7) && !(view instanceof org.telegram.ui.Cells.t7)) {
            m7 m7Var = w7Var.v;
            if (m7Var != null) {
                m7Var.j1(q7Var.c, q7Var.d, true);
            }
            return true;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(w7Var.getContext(), null);
        if (view instanceof org.telegram.ui.Cells.t7) {
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new bi.l0(i7Var, q7Var, j7Var, mm0Var, view, 5));
        } else if (((o7) view).b.getChildAt(0) instanceof org.telegram.ui.Cells.i7) {
            final int i11 = 0;
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_played, LocaleController.getString(R.string.PlayFile), false, null).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.g7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i11) {
                        case 0:
                            i7 i7Var2 = i7Var;
                            w7.b(i7Var2.d, q7Var.d, (o7) view);
                            org.telegram.ui.ActionBar.m1 m1Var = i7Var2.a;
                            if (m1Var != null) {
                                m1Var.d(true);
                                break;
                            }
                            break;
                        default:
                            i7 i7Var3 = i7Var;
                            w7.b(i7Var3.d, q7Var.d, (o7) view);
                            org.telegram.ui.ActionBar.m1 m1Var2 = i7Var3.a;
                            if (m1Var2 != null) {
                                m1Var2.d(true);
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            final int i12 = 1;
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.g7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i12) {
                        case 0:
                            i7 i7Var2 = i7Var;
                            w7.b(i7Var2.d, q7Var.d, (o7) view);
                            org.telegram.ui.ActionBar.m1 m1Var = i7Var2.a;
                            if (m1Var != null) {
                                m1Var.d(true);
                                break;
                            }
                            break;
                        default:
                            i7 i7Var3 = i7Var;
                            w7.b(i7Var3.d, q7Var.d, (o7) view);
                            org.telegram.ui.ActionBar.m1 m1Var2 = i7Var3.a;
                            if (m1Var2 != null) {
                                m1Var2.d(true);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        ai.b bVar = q7Var.d;
        if (bVar.b != 0 && bVar.g != 0) {
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_viewintopic, LocaleController.getString(R.string.ViewInChat), false, null).setOnClickListener(new a0(i7Var, q7Var, m2Var, 1));
        }
        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(!w7Var.f.j.contains(q7Var.d) ? R.string.Select : R.string.Deselect), false, null).setOnClickListener(new bi.u1(26, i7Var, q7Var));
        i7Var.a = org.telegram.ui.Components.g5.P(m2Var, actionBarPopupWindow$ActionBarPopupWindowLayout, view, (int) f7, (int) f10);
        w7Var.getRootView().dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        return true;
    }

    @Override // org.telegram.messenger.LanguageDetector.StringCallback
    public void run(String str) {
        fo foVar = (fo) this.b;
        org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) this.c;
        CharSequence charSequence = (CharSequence) this.d;
        String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
        if (str == null || ((str.equals(language) && !str.equals(TranslateController.UNKNOWN_LANGUAGE)) || l41.Y().contains(str))) {
            h0Var.setClickable(false);
        } else {
            h0Var.setOnClickListener(new bi.l0(foVar, str, language, charSequence, h0Var, 7));
        }
    }

    @Override // org.telegram.ui.Components.dm0
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.dm0
    public /* synthetic */ void q(float f7) {
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void p0(View view, float f7, float f10) {
    }
}
