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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e7 implements org.telegram.ui.Components.dm0, org.telegram.ui.Components.ok0, org.telegram.ui.Components.d5, LanguageDetector.StringCallback, z4, org.telegram.ui.ActionBar.z1, MessagesStorage.LongCallback, org.telegram.ui.Components.bm0, MessagesController.NewMessageCallback, xx, of1, org.telegram.ui.Components.voip.g3, OnSuccessListener {
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

    @Override // org.telegram.ui.Components.d5
    public void C(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 2:
                sn snVar = (sn) this.b;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.c;
                Long l4 = (Long) this.d;
                snVar.getClass();
                snVar.hb(botInlineResult, z10, i10, l4.longValue());
                break;
            case 3:
            default:
                sn snVar2 = (sn) this.b;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.c;
                MessageObject messageObject = (MessageObject) this.d;
                snVar2.getClass();
                if (z10) {
                    TLRPC.SuggestedPost tl = MessageSuggestionParams.of(ag.a.l(suggestedPost != null ? suggestedPost.price : null), i10).toTl();
                    if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                        snVar2.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                        break;
                    }
                }
                break;
            case 4:
                sn.Q0((sn) this.b, (MessageObject.GroupedMessages) this.c, (MessageObject) this.d, i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean D() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean J(ey eyVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean P0(View view) {
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
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], org.telegram.messenger.v0.C(52.0f, i11, i10), true);
    }

    @Override // org.telegram.ui.z4
    public void b(h5 h5Var) {
        switch (this.a) {
            case 6:
                dn dnVar = (dn) this.b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                int ordinal = h5Var.ordinal();
                if (ordinal == 0) {
                    dnVar.v(user, false);
                    break;
                } else if (ordinal == 3) {
                    dnVar.r(t1Var, user);
                    break;
                } else if (ordinal == 4) {
                    dnVar.b(user);
                    break;
                } else if (ordinal == 5) {
                    dnVar.a.ra(user);
                    break;
                }
                break;
            default:
                dn dnVar2 = (dn) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) this.d;
                int ordinal2 = h5Var.ordinal();
                if (ordinal2 == 0) {
                    dnVar2.u(chat);
                    break;
                } else if (ordinal2 != 1 && ordinal2 != 2) {
                    if (ordinal2 == 4) {
                        dnVar2.a(chat);
                        break;
                    } else if (ordinal2 == 5) {
                        dnVar2.a.pa(chat);
                        break;
                    }
                } else {
                    dnVar2.o(t1Var2, chat, 0, false);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.bm0
    public void c(float f7, float f10, int i10, View view) {
        u50.n((u50) this.b, (Activity) this.c, (ChatObject.Call) this.d, view, i10);
    }

    @Override // org.telegram.ui.Components.voip.g3
    public void f(org.telegram.ui.Components.voip.h3 h3Var) {
        oh1 oh1Var = (oh1) this.b;
        VoIPService voIPService = (VoIPService) this.c;
        org.telegram.ui.Components.voip.i3 i3Var = (org.telegram.ui.Components.voip.i3) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            AndroidUtilities.cancelRunOnUIThread(oh1Var.S0);
            oh1Var.R0 = false;
            if (oh1Var.w0.isTouchExplorationEnabled()) {
                h3Var.announceForAccessibility(voIPService.isFrontFaceCamera() ? LocaleController.getString(R.string.AccDescrVoipCamSwitchedToBack) : LocaleController.getString(R.string.AccDescrVoipCamSwitchedToFront));
            }
            i3Var.d(2, !voIPService.isFrontFaceCamera(), false);
            sharedInstance.switchCamera();
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        String str;
        int i11;
        switch (this.a) {
            case 8:
                vo voVar = (vo) this.b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.c;
                View view = (View) this.d;
                yo yoVar = voVar.a.b3;
                if (tL_username.editable) {
                    if (yoVar.t0 == null) {
                        yoVar.t0 = Boolean.valueOf(tL_username.active);
                    }
                    tL_username.active = !tL_username.active;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    TLRPC.Chat chat = yoVar.Y;
                    tL_inputChannel.channel_id = chat.id;
                    tL_inputChannel.access_hash = chat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z10 = tL_username.active;
                    tL_channels_toggleUsername.active = !z10;
                    yoVar.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new ai.i4(voVar, tL_channels_toggleUsername, tL_username, z10, 4));
                    yoVar.Q.add(tL_username.username);
                    ((pa) view).setLoading(true);
                }
                yoVar.W();
                break;
            case 9:
                kp kpVar = (kp) this.b;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                kpVar.getClass();
                if (chatFull.hidden_prehistory) {
                    kpVar.getMessagesController().toggleChannelInvitesHistory(chat2.id, false);
                }
                kpVar.Y(chat2, null);
                break;
            case 10:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                za1 za1Var = (za1) this.b;
                if (org.telegram.ui.ActionBar.k6.k0(((bb1) this.c).d, (org.telegram.ui.ActionBar.i6) this.d, true)) {
                    org.telegram.ui.ActionBar.k6.q1(false, false);
                    org.telegram.ui.ActionBar.k6.H1(org.telegram.ui.ActionBar.k6.I, za1Var.e.f == 1, -1, null);
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
                contactsActivity.n0(user, false, str);
                break;
            case 12:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.b;
                String str2 = (String) this.c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                SharedConfig.storageCacheDir = str2;
                SharedConfig.saveConfig();
                SharedConfig.readOnlyStorageDirAlertShowed = false;
                dataSettingsActivity.n0(dataSettingsActivity.n);
                ImageLoader.getInstance().checkMediaPaths(new zt(dataSettingsActivity, 2));
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
                ozVar.d0(true);
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = ozVar.d;
                if (ozVar.G != 0) {
                    ozVar.getConnectionsManager().cancelRequest(ozVar.G, true);
                    ozVar.G = 0;
                }
                TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = ozVar.c.id;
                tL_chatlists_editExportedInvite.slug = ozVar.b0();
                tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
                tL_chatlists_editExportedInvite.flags |= 2;
                tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
                ozVar.G = ozVar.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new bz(ozVar, 0));
                Utilities.Callback callback = ozVar.E;
                if (callback != null) {
                    callback.run(tL_exportedChatlistInvite);
                    break;
                }
                break;
            case 15:
                w40 w40Var = (w40) this.b;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.c;
                AlertDialog$Builder alertDialog$Builder3 = (AlertDialog$Builder) this.d;
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                w40Var.b.a1.setTitle(editTextBoldCursor2.getText().toString());
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
                w61 w61Var = (w61) this.b;
                i71 i71Var = (i71) this.c;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.d;
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                i11 = ((org.telegram.ui.ActionBar.o2) i71Var.a).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(resetauthorization, new a50(27, i71Var, tL_authorization));
                w61Var.d.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.of1
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((l61) this.b).T((TLRPC.User) this.c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override // org.telegram.messenger.MessagesController.NewMessageCallback
    public boolean onMessageReceived(TLRPC.Message message) {
        io0 io0Var = (io0) this.b;
        org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) this.c;
        Activity activity = (Activity) this.d;
        if (MessageObject.getPeerId(message.peer_id) != io0Var.l0.id || !(message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            return false;
        }
        AndroidUtilities.runOnUIThread(new jn0(io0Var, h5Var, activity, message, 0));
        return true;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        com.google.android.gms.internal.cast.z5 z5Var = (com.google.android.gms.internal.cast.z5) this.b;
        ei.d dVar = (ei.d) this.c;
        int[] iArr = (int[]) this.d;
        FileLog.d("wear-auth: /answer delivered to " + ((String) z5Var.a));
        int i10 = 0;
        dVar.setLoading(false);
        int i11 = iArr[0];
        ArrayList arrayList = (ArrayList) z5Var.e;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Context context = LaunchActivity.J1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        org.telegram.ui.ActionBar.g6 resourceProvider = U != null ? U.getResourceProvider() : null;
        org.telegram.ui.ActionBar.h3 h3Var = gi1.c;
        if (h3Var != null) {
            h3Var.dismiss();
            gi1.c = null;
        }
        org.telegram.ui.ActionBar.h3 j10 = org.telegram.messenger.sl.j(1, context, resourceProvider, false);
        fi1 fi1Var = new fi1(context);
        j10.customView = fi1Var;
        LinearLayout e = org.telegram.messenger.sl.e(context, 1);
        fi1Var.addView(e, w7.z5.e(-1, -1, 119));
        TextView b10 = w7.d6.b(context, 20.0f, org.telegram.ui.ActionBar.k6.j5, true, resourceProvider);
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
            int dp = AndroidUtilities.dp(80.0f);
            int i12 = org.telegram.ui.ActionBar.k6.Oh;
            ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(dp, org.telegram.ui.ActionBar.k6.o1(0.15f, org.telegram.ui.ActionBar.k6.w0(i12, resourceProvider)));
            org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.15f, i12);
            imageView.setBackground(K);
            org.telegram.ui.ActionBar.r6.k(imageView, K, M, null, resourceProvider);
            linearLayout.addView(imageView, w7.z5.k(i10 == 0 ? 0.0f : 5.0f, 0.0f, 0.0f, 0.0f, 80, 80));
            i10++;
        }
        e.addView(linearLayout, w7.z5.t(-2, -2, 49, 32, 12, 32, 12));
        ei.d g10 = org.telegram.messenger.sl.g(24, context, resourceProvider, true);
        g10.setText(LocaleController.getString(R.string.WearAuthEmojisLogIn));
        e.addView(g10, w7.z5.t(-1, 48, 7, 12, 12, 12, 8));
        int i13 = org.telegram.ui.ActionBar.k6.a7;
        j10.setBackgroundColorKey(i13);
        j10.fixNavigationBarKey(i13);
        gi1.c = j10;
        j10.show();
        g10.setOnClickListener(new ai.ia(g10, i11, j10, 19));
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        dq.a0((dq) this.b, (TLRPC.InputCheckPasswordSRP) this.c, (TwoStepVerificationActivity) this.d, j10);
    }

    @Override // org.telegram.ui.xx
    public boolean w(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ye1 ye1Var) {
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
                sn snVar = (sn) obj;
                PhotoViewer photoViewer = ((bs0) obj3).b;
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
                    if (snVar != null) {
                        snVar.T7();
                        UndoView undoView = snVar.K3;
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
                    sn snVar2 = new sn(h);
                    if (topicKey.topicId != 0) {
                        og.d.a(snVar2, topicKey);
                    }
                    if (((LaunchActivity) photoViewer.y).v0(snVar2, true, false)) {
                        snVar2.Gb(arrayList2);
                        break;
                    } else {
                        eyVar.finishFragment();
                        break;
                    }
                }
                break;
            default:
                nz0 nz0Var = (nz0) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                ey eyVar2 = (ey) obj;
                long j13 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                ProfileActivity profileActivity = nz0Var.b;
                i12 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j13));
                if (chat == null || (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.add_admins))) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.A0);
                    String string = LocaleController.getString(R.string.AddBot);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                    c2Var.R = string;
                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), chat == null ? "" : chat.title));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new ai.y3(nz0Var, j13, eyVar, user, 4));
                    profileActivity.showDialog(c2Var);
                    break;
                } else {
                    profileActivity.getMessagesController().checkIsInChat(false, chat, user, new ai.f(nz0Var, j13, eyVar2, 8));
                    break;
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.dm0
    public boolean c(float f7, float f10, int i10, final View view) {
        final h7 h7Var = (h7) this.b;
        org.telegram.ui.Components.mm0 mm0Var = (org.telegram.ui.Components.mm0) this.c;
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
        v7 v7Var = h7Var.d;
        i7 i7Var = (i7) mm0Var.getAdapter();
        final p7 p7Var = (p7) i7Var.e.get(i10);
        if (!(view instanceof n7) && !(view instanceof org.telegram.ui.Cells.s7)) {
            l7 l7Var = v7Var.w;
            if (l7Var != null) {
                l7Var.s0(p7Var.c, p7Var.d, true);
            }
            return true;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(v7Var.getContext(), null);
        if (view instanceof org.telegram.ui.Cells.s7) {
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new ci.e0(h7Var, p7Var, i7Var, mm0Var, view, 5));
        } else if (((n7) view).b.getChildAt(0) instanceof org.telegram.ui.Cells.j7) {
            final int i11 = 0;
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_played, LocaleController.getString(R.string.PlayFile), false, null).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.f7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i11) {
                        case 0:
                            h7 h7Var2 = h7Var;
                            v7.b(h7Var2.d, p7Var.d, (n7) view);
                            org.telegram.ui.ActionBar.m1 m1Var = h7Var2.a;
                            if (m1Var != null) {
                                m1Var.d(true);
                                break;
                            }
                            break;
                        default:
                            h7 h7Var3 = h7Var;
                            v7.b(h7Var3.d, p7Var.d, (n7) view);
                            org.telegram.ui.ActionBar.m1 m1Var2 = h7Var3.a;
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
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.f7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i12) {
                        case 0:
                            h7 h7Var2 = h7Var;
                            v7.b(h7Var2.d, p7Var.d, (n7) view);
                            org.telegram.ui.ActionBar.m1 m1Var = h7Var2.a;
                            if (m1Var != null) {
                                m1Var.d(true);
                                break;
                            }
                            break;
                        default:
                            h7 h7Var3 = h7Var;
                            v7.b(h7Var3.d, p7Var.d, (n7) view);
                            org.telegram.ui.ActionBar.m1 m1Var2 = h7Var3.a;
                            if (m1Var2 != null) {
                                m1Var2.d(true);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        bi.b bVar = p7Var.d;
        if (bVar.b != 0 && bVar.g != 0) {
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_viewintopic, LocaleController.getString(R.string.ViewInChat), false, null).setOnClickListener(new z(h7Var, p7Var, o2Var, 1));
        }
        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(!v7Var.h.j.contains(p7Var.d) ? R.string.Select : R.string.Deselect), false, null).setOnClickListener(new org.telegram.ui.ActionBar.s1(6, h7Var, p7Var));
        h7Var.a = org.telegram.ui.Components.f5.Q(o2Var, actionBarPopupWindow$ActionBarPopupWindowLayout, view, (int) f7, (int) f10);
        v7Var.getRootView().dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        return true;
    }

    @Override // org.telegram.messenger.LanguageDetector.StringCallback
    public void run(String str) {
        sn snVar = (sn) this.b;
        org.telegram.ui.Cells.g0 g0Var = (org.telegram.ui.Cells.g0) this.c;
        CharSequence charSequence = (CharSequence) this.d;
        String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
        if (str == null || ((str.equals(language) && !str.equals(TranslateController.UNKNOWN_LANGUAGE)) || v21.Y().contains(str))) {
            g0Var.setClickable(false);
        } else {
            g0Var.setOnClickListener(new ci.e0(snVar, str, language, charSequence, g0Var, 7));
        }
    }

    @Override // org.telegram.ui.Components.dm0
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.dm0
    public /* synthetic */ void o(float f7) {
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void a0(View view, float f7, float f10) {
    }
}
