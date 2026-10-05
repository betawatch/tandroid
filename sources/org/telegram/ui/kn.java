package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Property;
import android.view.GestureDetector;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.SecretMediaViewer;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class kn implements org.telegram.ui.Cells.l1 {
    public final /* synthetic */ yn a;

    public kn(yn ynVar) {
        this.a = ynVar;
    }

    public static void a(kn knVar, org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
        int i10;
        yn ynVar = knVar.a;
        if (ynVar.getParentActivity() == null || document == null) {
            return;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23 && ((i11 <= 28 || BuildVars.NO_SCOPED_STORAGE) && ynVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
            ynVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
            return;
        }
        MessageObject messageObject = u1Var == null ? null : u1Var.getMessageObject();
        if (messageObject == null || messageObject.messageOwner == null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.out = messageObject.isOutOwner();
        tL_message.id = messageObject.getId();
        tL_message.realId = messageObject.getRealId();
        tL_message.dialog_id = messageObject.getDialogId();
        TLRPC.Message message = messageObject.messageOwner;
        tL_message.peer_id = message.peer_id;
        tL_message.from_id = message.from_id;
        tL_message.date = message.date;
        tL_message.message = "";
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
        tL_message.media = tL_messageMediaDocument;
        tL_messageMediaDocument.flags |= 3;
        tL_messageMediaDocument.document = document;
        int i12 = tL_message.flags;
        tL_message.flags = i12 | 512;
        if (tL_message.from_id != null) {
            tL_message.flags = i12 | 768;
        }
        ArrayList arrayList = new ArrayList();
        i10 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
        arrayList.add(new MessageObject(i10, tL_message, false, true));
        MediaController.saveFilesFromMessages(ynVar.getParentActivity(), ynVar.getAccountInstance(), arrayList, new wa(knVar, 1));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void A(org.telegram.ui.Cells.u1 u1Var) {
        yn ynVar = this.a;
        if (!ynVar.getMessagesController().showSensitiveContent()) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ynVar.getParentActivity(), 3, null);
            b2Var.q(200L);
            ynVar.getMessagesController().getContentSettings(new z(this, b2Var, u1Var, 6));
        } else {
            if (u1Var.getMessageObject() != null) {
                u1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
            }
            u1Var.h4();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void A0(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject, boolean z10) {
        org.telegram.ui.ActionBar.c5 c5Var;
        org.telegram.ui.ActionBar.c5 c5Var2;
        yn ynVar = this.a;
        if (ynVar.getParentActivity() == null || tLObject == null) {
            return;
        }
        c5Var = ((org.telegram.ui.ActionBar.n2) ynVar).parentLayout;
        if (c5Var != null) {
            c5Var2 = ((org.telegram.ui.ActionBar.n2) ynVar).parentLayout;
            if (((ActionBarLayout) c5Var2).y()) {
                return;
            }
        }
        Bundle bundle = new Bundle();
        boolean z11 = tLObject instanceof TLRPC.Chat;
        if (z11) {
            bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
        } else if (!(tLObject instanceof TLRPC.User)) {
            return;
        } else {
            bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
        }
        if (!z10 || !z11) {
            ynVar.presentFragment(new yn(bundle));
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, ynVar.getParentActivity(), ynVar.getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(ynVar.getThemedColor(org.telegram.ui.ActionBar.i6.G8));
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(ynVar.getParentActivity(), false, false);
        f1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
        f1Var.setMinimumWidth(160);
        f1Var.setOnClickListener(new a(this, 14));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
        org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(ynVar.getParentActivity(), false, false);
        f1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
        f1Var2.setMinimumWidth(160);
        f1Var2.setOnClickListener(new a0(this, (TLRPC.Chat) tLObject, u1Var, 7));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var2);
        yn ynVar2 = new yn(bundle);
        ynVar2.H9 = true;
        ynVar.presentFragmentAsPreviewWithMenu(ynVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
        ynVar.d7();
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean A1() {
        yn ynVar = this.a;
        return ynVar.V0.getMeasuredWidth() > ynVar.V0.getMeasuredHeight();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void B0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        MessageObject messageObject = u1Var.getMessageObject();
        int i10 = messageObject.type;
        yn ynVar = this.a;
        if (i10 != 16) {
            ynVar.I7(u1Var, true, false, f7, f10, messageObject.isMusic(), false, false);
            return;
        }
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        int i11 = 0;
        if (!(messageAction instanceof TLRPC.TL_messageActionConferenceCall)) {
            TLRPC.User user = ynVar.f;
            if (user != null) {
                boolean isVideoCall = messageObject.isVideoCall();
                TLRPC.UserFull userFull = ynVar.Y7;
                org.telegram.ui.Components.voip.g2.m(user, isVideoCall, userFull != null && userFull.video_calls_available, ynVar.getParentActivity(), ynVar.getMessagesController().getUserFull(ynVar.f.id), ynVar.getAccountInstance());
                return;
            }
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(Long.valueOf(ynVar.a()));
        ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
        int size = arrayList.size();
        while (i11 < size) {
            TLRPC.Peer peer = arrayList.get(i11);
            i11++;
            hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(peer)));
        }
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = messageObject.getId();
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ynVar.getParentActivity(), 3, null);
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = ynVar.getMessagesController().conferenceCallSizeLimit;
        b2Var.setOnCancelListener(new da(this, ynVar.getConnectionsManager().sendRequest(getgroupcall, new ci.gd(this, b2Var, hashSet, tL_inputGroupCallInviteMessage, messageObject, 4)), 1));
        b2Var.q(600L);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void C1(org.telegram.ui.Cells.u1 u1Var) {
        yn.T4(this.a, u1Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void D0(org.telegram.ui.Cells.u1 u1Var) {
        i(u1Var, true, false, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void D1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        i(u1Var, z10, false, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void F(org.telegram.ui.Cells.u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        TLRPC.Message message;
        int i10;
        int i11;
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        int i12 = buttonCustom.id;
        yn ynVar = this.a;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    ynVar.I7(u1Var, true, false, u1Var.getLastTouchX(), u1Var.getLastTouchY(), true, false, true);
                    return;
                } else {
                    if (i12 == 4) {
                        ynVar.P1.m(messageObject.getTopicId(), true);
                        return;
                    }
                    return;
                }
            }
            if (message.suggested_post != null) {
                i10 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, ynVar.e);
                if (canManageMonoForum) {
                    i11 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                    ChatObject.canUserDoChannelDirectAdminAction(i11, ynVar.e, 5);
                }
                ai.s4 s4Var = new ai.s4(this, message, canManageMonoForum, messageObject, 12);
                TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                ynVar.g7(s4Var, zf.a.l(suggestedPost != null ? suggestedPost.price : null), !canManageMonoForum);
                return;
            }
            return;
        }
        long peerDialogId = DialogObject.getPeerDialogId(message.from_id);
        qc qcVar = new qc(13, this, message);
        Pattern pattern = org.telegram.ui.Components.e5.a;
        Activity parentActivity = ynVar.getParentActivity();
        int i13 = 0;
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(parentActivity, 0, null);
        String string = LocaleController.getString(R.string.SuggestedMessageDecline);
        org.telegram.ui.ActionBar.b2 b2Var = e2Var.a;
        b2Var.R = string;
        b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageDeclineInfo, MessagesController.getInstance(UserConfig.selectedAccount).getPeerName(peerDialogId)));
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        frameLayout.setClipChildren(false);
        EditText editText = new EditText(parentActivity);
        editText.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false));
        editText.setHint(LocaleController.getString(R.string.SuggestedMessageDeclineReasonHint));
        editText.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.H6, false));
        editText.setTextSize(1, 16.0f);
        editText.setBackground(org.telegram.ui.ActionBar.i6.S(parentActivity));
        editText.setMaxLines(4);
        editText.setRawInputType(147457);
        editText.setImeOptions(6);
        editText.setFilters(new InputFilter[]{new org.telegram.ui.Components.t4(parentActivity)});
        editText.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0, AndroidUtilities.dp(8.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f));
        editText.setSelection(editText.getText().toString().length());
        e2Var.n(frameLayout);
        e2Var.k(LocaleController.getString(R.string.Decline), new o(25, qcVar, editText));
        e2Var.h(LocaleController.getString(R.string.Cancel), null);
        b2Var.N = new org.telegram.ui.Components.p1(editText, i13);
        frameLayout.addView(editText, w7.z5.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
        editText.requestFocus();
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.qg(editText, 3), 100L);
        ynVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q7, false));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void F0(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject;
        if (u1Var == null || (messageObject = u1Var.getMessageObject()) == null || messageObject.messageOwner == null) {
            return;
        }
        int id2 = messageObject.getId();
        yn ynVar = this.a;
        if (ynVar.tb == id2 && ynVar.ub == 7) {
            return;
        }
        TLRPC.InputPeer inputPeer = ynVar.getMessagesController().getInputPeer(messageObject.getDialogId());
        if (inputPeer == null) {
            return;
        }
        TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
        getrichmessage.peer = inputPeer;
        getrichmessage.id = id2;
        nf.e eVar = ynVar.xb;
        if (eVar != null) {
            eVar.a(true);
            ynVar.xb = null;
        }
        int[] iArr = new int[1];
        yi yiVar = new yi(ynVar, id2, u1Var, 2);
        yiVar.b = new org.telegram.ui.ActionBar.g6(28, ynVar, iArr);
        ynVar.xb = yiVar;
        yiVar.d();
        iArr[0] = ynVar.getConnectionsManager().sendRequestTyped(getrichmessage, new org.telegram.messenger.a(), new lg(ynVar, yiVar, iArr, u1Var, messageObject));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void G(org.telegram.ui.Cells.u1 u1Var) {
        yn ynVar = this.a;
        ynVar.va.l(u1Var, ynVar, true);
        ynVar.v0.J0(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.l1
    public final boolean G1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        y4 y4Var;
        ok okVar;
        nk nkVar;
        if (!m()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(ChatObject.getPublicUsername(chat));
        yn ynVar = this.a;
        int i14 = (isEmpty || ynVar.e == null || ((okVar = ynVar.M0) != null && okVar.getVisibility() == 0) || ((nkVar = ynVar.P) != null && nkVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat2 = ynVar.e;
        int i15 = (chat2 == null || !(ynVar.b4 == 0 || ynVar.f4) || (ChatObject.isChannel(chat2) && !ynVar.e.megagroup)) ? 0 : 1;
        TLRPC.Chat chat3 = ynVar.e;
        int i16 = (chat3 == null || chat3.id != chat.id || ynVar.E9()) ? 1 : 0;
        e5[] e5VarArr = new e5[i16 + 1 + i14 + i15];
        e5VarArr[0] = e5.d;
        if (i16 != 0) {
            e5VarArr[1] = chat.broadcast ? e5.e : e5.f;
            i10 = 2;
        } else {
            i10 = 1;
        }
        if (i14 != 0) {
            e5VarArr[i10] = e5.n;
            i10++;
        }
        if (i15 != 0) {
            e5VarArr[i10] = e5.r;
        }
        TLRPC.ChatFull chatFull = ynVar.getMessagesController().getChatFull(chat.id);
        if (chatFull != null) {
            y4Var = y4.a(chat, chatFull, e5VarArr);
            z11 = i14;
            i13 = i15;
            i12 = i16;
            z10 = true;
        } else {
            i11 = ((org.telegram.ui.ActionBar.n2) ynVar).classGuid;
            int i17 = i15;
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(chat, 0);
            int i18 = i16;
            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(chat, 1);
            String str = (forUserOrChat2 == null || !(forUserOrChat2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            z10 = true;
            i12 = i18;
            z11 = i14;
            i13 = i17;
            y4Var = new y4(forUserOrChat, forUserOrChat2, null, str, null, null, chatPhoto != null ? chatPhoto.strippedBitmap : null, chat, e5VarArr, new x4(i11, chat, NotificationCenter.chatInfoDidLoad));
        }
        if (com.google.firebase.messaging.m.e(y4Var)) {
            com.google.firebase.messaging.m.k().v((ViewGroup) ynVar.fragmentView, ynVar.ca, y4Var, new c7(this, chat, u1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.b80 H = org.telegram.ui.Components.b80.H(ynVar, u1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new xm(this, chat, 0), false);
        boolean z12 = chat.broadcast;
        H.l(z12 ? R.drawable.msg_channel : R.drawable.msg_discussion, LocaleController.getString(z12 ? R.string.OpenChannel2 : R.string.OpenGroup2), new r1(this, u1Var, chat, 26), i12);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new xm(this, chat, 1), z11);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new xm(this, chat, 2), i13);
        H.t = false;
        H.i = 3;
        H.W = true;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void H1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        yn ynVar = this.a;
        if (ynVar.y9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
        if (ynVar.getParentActivity() != null) {
            if (ynVar.M0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                if (tL_inlineButtonTypeCopy == null) {
                    if (tL_inlineButtonTypeUrl != null) {
                        ynVar.Y9(null, tL_inlineButtonTypeUrl.url, true, u1Var, u1Var.getMessageObject());
                        try {
                            u1Var.performHapticFeedback(0, 1);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                String str = tL_inlineButtonTypeCopy.copy_text;
                org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) ynVar.getParentActivity(), (org.telegram.ui.ActionBar.d6) ynVar.ca, false);
                f3Var.fixNavigationBar();
                f3Var.title = str;
                f3Var.bigTitle = false;
                f3Var.multipleLinesTitle = true;
                CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Copy)};
                lg.j jVar = new lg.j(3, ynVar, str);
                f3Var.items = charSequenceArr;
                f3Var.onClickListener = jVar;
                ynVar.showDialog(f3Var);
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void I0(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        messageObject.messageOwner.summarizedOpen = !r1.summarizedOpen;
        messageObject.updateTranslation(true);
        yn ynVar = this.a;
        ynVar.getMessagesStorage().updateMessageCustomParams(messageObject.getDialogId(), messageObject.messageOwner);
        ynVar.getMessagesController().getTranslateController().checkTranslation(messageObject, true);
        i(u1Var, true, false, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean I1() {
        yn ynVar = this.a;
        return ynVar.V0.getKeyboardHeight() + ynVar.ma >= AndroidUtilities.dp(20.0f);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void J(MessageObject.TextLayoutBlock textLayoutBlock) {
        StaticLayout staticLayout = textLayoutBlock.textLayout;
        if (staticLayout == null || staticLayout.getText() == null) {
            return;
        }
        String charSequence = textLayoutBlock.textLayout.getText().toString();
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new CodeHighlighting.Span(false, 0, null, textLayoutBlock.language, charSequence), 0, spannableString.length(), 33);
        AndroidUtilities.addToClipboard(spannableString);
        org.telegram.messenger.bi.n(R.string.CodeCopied, org.telegram.ui.Components.yc.a0(this.a));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void K1(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        yn ynVar = this.a;
        ynVar.b5 = messageObject;
        ynVar.e9();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void M(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject.messageOwner.send_state != 0) {
            this.a.getSendMessagesHelper().cancelSendingMessage(messageObject);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean M0(long j3) {
        yn ynVar = this.a;
        TLRPC.Chat chat = ynVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return false;
        }
        return ynVar.getMessagesController().isOwner(ynVar.e.id, j3);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void M1(MessageObject messageObject) {
        this.a.s.put(messageObject, Boolean.TRUE);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void N(int i10, org.telegram.ui.Cells.u1 u1Var) {
        boolean z10 = u1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveaway;
        yn ynVar = this.a;
        if (z10) {
            long j3 = -((TLRPC.TL_messageMediaGiveaway) u1Var.getMessageObject().messageOwner.media).channels.get(i10).longValue();
            if (ynVar.R5 != j3) {
                ynVar.presentFragment(yn.Q9(j3));
            } else {
                ynVar.Y0.e(false, false);
            }
        }
        if (u1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            ynVar.presentFragment(ProfileActivity.m4(((TLRPC.TL_messageMediaGiveawayResults) u1Var.getMessageObject().messageOwner.media).winners.get(i10).longValue()));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void N0(org.telegram.ui.Cells.u1 u1Var) {
        int i10;
        a3.h0 h0Var;
        MessageObject.GroupedMessages groupedMessages;
        int i11;
        yn ynVar = this.a;
        uh.i iVar = ynVar.V9;
        if (iVar == null) {
            return;
        }
        HashMap hashMap = iVar.a;
        uh.h hVar = (uh.h) hashMap.get(uh.i.b(u1Var));
        org.telegram.ui.Components.rc rcVar = null;
        MessageObject messageObject = hVar != null ? hVar.E : null;
        uh.h hVar2 = (uh.h) ynVar.V9.a.get(uh.i.b(u1Var));
        long j3 = (hVar2 == null || (i11 = hVar2.R) == -1) ? 0L : hVar2.w[i11].d;
        if (messageObject != null && j3 != 0) {
            Activity parentActivity = ynVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
            if (!org.telegram.ui.Components.e5.h(parentActivity, i10, j3, false)) {
                ArrayList<MessageObject> arrayList = (messageObject.getGroupId() == 0 || (groupedMessages = (MessageObject.GroupedMessages) ynVar.v6.f(messageObject.getGroupId())) == null) ? null : groupedMessages.messages;
                if (arrayList == null) {
                    arrayList = org.telegram.messenger.q.k(messageObject);
                }
                boolean z10 = j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                long j10 = j3;
                a3.h0 h0Var2 = new a3.h0(this, arrayList, j10, 14);
                if (z10) {
                    h0Var2.run();
                    h0Var = null;
                } else {
                    h0Var = h0Var2;
                }
                rcVar = org.telegram.ui.Components.yc.v(ynVar.getParentActivity(), ynVar, null, 1, j10, 1, ynVar.getThemedColor(org.telegram.ui.ActionBar.i6.Fi), ynVar.getThemedColor(org.telegram.ui.ActionBar.i6.Hi), 5000, false, h0Var);
                rcVar.k = true;
                rcVar.k(rcVar.e instanceof org.telegram.ui.Components.cc);
            }
        }
        uh.h hVar3 = (uh.h) hashMap.get(uh.i.b(u1Var));
        if (hVar3 != null) {
            if (rcVar == null) {
                hVar3.R = -1;
                hVar3.c();
                return;
            }
            org.telegram.ui.Components.vb vbVar = rcVar.e;
            if (!(vbVar instanceof org.telegram.ui.Components.zb)) {
                hVar3.c();
                return;
            }
            org.telegram.ui.Components.zb zbVar = (org.telegram.ui.Components.zb) vbVar;
            hVar3.W = zbVar;
            zbVar.a.setVisibility(4);
            ViewTreeObserver viewTreeObserver = hVar3.W.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new dm(2, hVar3, viewTreeObserver));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void N1(org.telegram.ui.Cells.u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        Uri parse;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        boolean z11 = (z10 || !nf.f.h(str, false, false)) ? z10 : true;
        yn ynVar = this.a;
        nf.e eVar = ynVar.xb;
        if (eVar != null) {
            eVar.a(true);
        }
        ynVar.xb = u1Var.getMessageObject() == null ? null : new gn(this, u1Var);
        if (z11 || nf.f.f(parse, false, null)) {
            nf.f.r(ynVar.getParentActivity(), parse, true, true, false, ynVar.xb, null, false, true, false);
        } else {
            org.telegram.ui.Components.e5.r0(ynVar, str, true, true, true, !z11, ynVar.xb, webPage, ynVar.ca);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void O(MessageObject messageObject) {
        if (messageObject.isVideo()) {
            this.a.eb(messageObject, true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final CharacterStyle O1(org.telegram.ui.Cells.u1 u1Var) {
        yn ynVar;
        int i10;
        if (u1Var.getMessageObject() == null || (i10 = (ynVar = this.a).tb) == 0 || i10 != u1Var.getMessageObject().getId() || ynVar.ub != 1) {
            return null;
        }
        return ynVar.vb;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean P(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        int i10;
        int i11;
        boolean isForwarded = u1Var.getMessageObject().isForwarded();
        yn ynVar = this.a;
        if (isForwarded) {
            long peerDialogId = DialogObject.getPeerDialogId(u1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(ynVar);
            int i12 = R.raw.passcode_lock_close;
            int i13 = R.string.TodoCompleteForbiddenForward;
            i11 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
            a02.Q(i12, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i13, DialogObject.getName(i11, peerDialogId)))).k(true);
            return false;
        }
        if (u1Var.getMessageObject().canCompleteTodo()) {
            if (ynVar.getUserConfig().isPremium()) {
                ynVar.getSendMessagesHelper().toggleTodo(ChatObject.getSendAsPeerId(ynVar.e, ynVar.X7, true), u1Var.getMessageObject(), todoItem, z10, null);
                return true;
            }
            org.telegram.ui.Components.yc.a0(ynVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.TodoPremiumRequired), new um(this, 9))).k(true);
            return false;
        }
        long peerDialogId2 = DialogObject.getPeerDialogId(u1Var.getMessageObject().getFromPeer());
        org.telegram.ui.Components.yc a03 = org.telegram.ui.Components.yc.a0(ynVar);
        int i14 = R.raw.passcode_lock_close;
        int i15 = R.string.TodoCompleteForbidden;
        i10 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
        a03.Q(i14, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i15, DialogObject.getName(i10, peerDialogId2)))).k(true);
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void P0(int i10, org.telegram.ui.Cells.u1 u1Var) {
        int i11;
        int i12;
        TLRPC.MessageMedia messageMedia;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        TL_stories.StoryItem storyItem;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia2;
        String b10;
        int i13;
        TLRPC.User user;
        int i14;
        TLRPC.WebPage webPage;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        MessageObject messageObject = u1Var.getMessageObject();
        File file = null;
        TLRPC.User user2 = null;
        yn ynVar = this.a;
        if (i10 == 19) {
            nf.e eVar = ynVar.xb;
            if (eVar != null) {
                eVar.a(true);
            }
            final cn cnVar = u1Var.getMessageObject() != null ? new cn(this, u1Var, 2) : null;
            ynVar.xb = cnVar;
            final Activity parentActivity = ynVar.getParentActivity();
            final org.telegram.ui.ActionBar.d6 resourceProvider = ynVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            cnVar.d();
            cnVar.b = new tg.d(atomicBoolean, 0);
            TLRPC.MessageMedia messageMedia3 = messageObject.messageOwner.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageMedia3;
                tL_messageMediaGiveaway = new TLRPC.TL_messageMediaGiveaway();
                tL_messageMediaGiveaway.prize_description = tL_messageMediaGiveawayResults.prize_description;
                tL_messageMediaGiveaway.months = tL_messageMediaGiveawayResults.months;
                tL_messageMediaGiveaway.quantity = tL_messageMediaGiveawayResults.winners_count + tL_messageMediaGiveawayResults.unclaimed_count;
                tL_messageMediaGiveaway.only_new_subscribers = tL_messageMediaGiveawayResults.only_new_subscribers;
                tL_messageMediaGiveaway.until_date = tL_messageMediaGiveawayResults.until_date;
                tL_messageMediaGiveaway.stars = tL_messageMediaGiveawayResults.stars;
                tL_messageMediaGiveaway.flags = tL_messageMediaGiveawayResults.flags;
            } else {
                tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageMedia3;
            }
            final TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = tL_messageMediaGiveaway;
            final String b11 = tg.i.b(messageObject);
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
            final boolean z10 = chat != null && ChatObject.isChannelAndNotMegaGroup(chat);
            final long j3 = messageObject.messageOwner.date * 1000;
            tg.s.d(messageObject, new Utilities.Callback(atomicBoolean, cnVar, z10, b11, j3, tL_messageMediaGiveaway2, parentActivity, resourceProvider) { // from class: tg.e
                public final /* synthetic */ AtomicBoolean a;
                public final /* synthetic */ nf.e b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ String d;
                public final /* synthetic */ TLRPC.TL_messageMediaGiveaway e;
                public final /* synthetic */ Context f;
                public final /* synthetic */ d6 g;

                {
                    this.e = tL_messageMediaGiveaway2;
                    this.f = parentActivity;
                    this.g = resourceProvider;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                    if (this.a.get()) {
                        return;
                    }
                    this.b.b();
                    boolean z11 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                    boolean z12 = this.c;
                    String str = this.d;
                    TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = this.e;
                    Context context = this.f;
                    d6 d6Var = this.g;
                    if (z11) {
                        i.d(z12, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, d6Var);
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        i.e(z12, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, d6Var);
                    }
                }
            }, new tg.f(atomicBoolean, cnVar, 0));
            return;
        }
        if (i10 == 21) {
            f();
            return;
        }
        if (i10 == 84) {
            ynVar.ta(u1Var);
            return;
        }
        if (i10 == 80) {
            org.telegram.ui.Cells.t8 t8Var = org.telegram.ui.Components.ch0.O;
            if (ynVar.getParentActivity() == null) {
                return;
            }
            ynVar.showDialog(new org.telegram.ui.Components.ch0(ynVar.getContext(), ynVar.getCurrentAccount(), messageObject, ynVar.getResourceProvider()));
            return;
        }
        if (i10 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
            if (messageMedia4 == null || (webPage = messageMedia4.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                ynVar.createArticleViewer(false).N(messageObject, null, null, null);
                return;
            }
            return;
        }
        int i15 = 5;
        if (i10 == 5) {
            long j10 = messageObject.messageOwner.media.user_id;
            if (j10 != 0) {
                i14 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                user = MessagesController.getInstance(i14).getUser(Long.valueOf(j10));
            } else {
                user = null;
            }
            TLRPC.MessageMedia messageMedia5 = messageObject.messageOwner.media;
            String str = messageMedia5.phone_number;
            String str2 = messageMedia5.vcard;
            String str3 = messageMedia5.first_name;
            String str4 = messageMedia5.last_name;
            if (user != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                bundle.putBoolean("show_add_to_contacts", true);
                bundle.putString("vcard", str2);
                bundle.putString("vcard_phone", str);
                bundle.putString("vcard_first_name", str3);
                bundle.putString("vcard_last_name", str4);
                ynVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            }
            try {
                if (!TextUtils.isEmpty(str2)) {
                    File sharingDirectory = AndroidUtilities.getSharingDirectory();
                    sharingDirectory.mkdirs();
                    file = new File(sharingDirectory, "vcard.vcf");
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                    bufferedWriter.write(str2);
                    bufferedWriter.close();
                }
                ynVar.showDialog(new org.telegram.ui.Components.bf0(ynVar, null, user, null, file, gf.b.d(str, false), str3, str4, ynVar.ca));
                return;
            } catch (Exception e7) {
                FileLog.e(e7);
                return;
            }
        }
        if (i10 == 30) {
            ynVar.presentFragment(new yn(sa.e.f(messageObject.messageOwner.media.user_id, "user_id")));
            return;
        }
        if (i10 == 31) {
            long j11 = messageObject.messageOwner.media.user_id;
            if (j11 != 0) {
                i13 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(j11));
            }
            if (user2 != null) {
                if (!TextUtils.isEmpty(messageObject.vCardData)) {
                    b10 = messageObject.vCardData.toString();
                } else if (TextUtils.isEmpty(user2.phone)) {
                    String str5 = MessageObject.getMedia(messageObject.messageOwner).phone_number;
                    b10 = !TextUtils.isEmpty(str5) ? gf.b.c().b(str5) : LocaleController.getString(R.string.NumberUnknown);
                } else {
                    b10 = org.telegram.messenger.bi.g(new StringBuilder("+"), user2.phone, gf.b.c());
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user2.id);
                bundle2.putString("phone", b10);
                bundle2.putBoolean("addContact", true);
                ynVar.presentFragment(new qs(bundle2));
                return;
            }
            return;
        }
        int i16 = 4;
        if (i10 == 23 || i10 == 24) {
            boolean z11 = i10 == 24;
            TLRPC.Message message2 = messageObject.messageOwner;
            TLRPC.WebPage webPage2 = (message2 == null || (messageMedia = message2.media) == null) ? null : messageMedia.webpage;
            if (webPage2 == null || webPage2.url == null) {
                return;
            }
            Matcher matcher = Pattern.compile("^https?\\:\\/\\/t\\.me\\/add(?:emoji|stickers)\\/(.+)$").matcher(webPage2.url);
            nf.e eVar2 = ynVar.xb;
            if (eVar2 != null) {
                eVar2.a(true);
            }
            ynVar.xb = u1Var.getMessageObject() != null ? new cn(this, u1Var, 3) : null;
            if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                String group = matcher.group(1);
                i11 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                if (MediaDataController.getInstance(i11).getStickerSetByName(group) == null) {
                    ynVar.xb.d();
                    TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_inputStickerSetShortName.short_name = group;
                    tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                    i12 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                    ynVar.xb.b = new ai.o8(this, ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickerSet, new ci.t3(i16, this, z11)), 26);
                    return;
                }
            }
            nf.f.r(ynVar.getParentActivity(), Uri.parse(webPage2.url), true, true, false, ynVar.xb, null, false, true, false);
            return;
        }
        if (messageObject.isSponsored()) {
            ynVar.I9(messageObject, false, false);
            if (messageObject.sponsoredUrl != null) {
                nf.e eVar3 = ynVar.xb;
                if (eVar3 != null) {
                    eVar3.a(true);
                }
                ynVar.xb = u1Var.getMessageObject() != null ? new cn(this, u1Var, i16) : null;
                nf.f.r(ynVar.getParentActivity(), Uri.parse(messageObject.sponsoredUrl), true, false, false, ynVar.xb, null, false, ynVar.getMessagesController().sponsoredLinksInappAllow, false);
                return;
            }
            return;
        }
        TLRPC.WebPage storyMentionWebpage = messageObject.getStoryMentionWebpage();
        if (storyMentionWebpage == null && (message = messageObject.messageOwner) != null && (messageMedia2 = message.media) != null) {
            storyMentionWebpage = messageMedia2.webpage;
        }
        if (storyMentionWebpage == null) {
            return;
        }
        if (storyMentionWebpage.attributes != null) {
            for (int i17 = 0; i17 < storyMentionWebpage.attributes.size(); i17++) {
                if ((storyMentionWebpage.attributes.get(i17) instanceof TLRPC.TL_webPageAttributeStory) && (storyItem = (tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) storyMentionWebpage.attributes.get(i17)).storyItem) != null) {
                    storyItem.dialogId = DialogObject.getPeerDialogId(tL_webPageAttributeStory.peer);
                    tL_webPageAttributeStory.storyItem.messageId = messageObject.getId();
                    tL_webPageAttributeStory.storyItem.messageType = 1;
                    ynVar.getOrCreateStoryViewer().F(ynVar.getParentActivity(), tL_webPageAttributeStory.storyItem, ai.u9.a(ynVar.v0));
                    return;
                }
            }
        }
        if (ynVar.da(storyMentionWebpage.url, u1Var, null, messageObject.getId(), 2)) {
            return;
        }
        nf.e eVar4 = ynVar.xb;
        if (eVar4 != null) {
            eVar4.a(true);
        }
        ynVar.xb = u1Var.getMessageObject() != null ? new cn(this, u1Var, i15) : null;
        nf.f.r(ynVar.getParentActivity(), Uri.parse(storyMentionWebpage.url), true, true, false, ynVar.xb, null, false, true, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        try {
            yn ynVar = this.a;
            org.telegram.ui.Components.zu.H(ynVar, messageObject, ynVar.Da, str2, str3, str4, str, i10, i11, -1, ynVar.w9());
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean Q() {
        yn ynVar = this.a;
        return ynVar.U5[1].size() + ynVar.U5[0].size() > 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean Q1(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        ViewGroup viewGroup;
        int i10;
        a51 a51Var;
        if (messageObject.isVoiceOnce() || messageObject.isRoundOnce()) {
            int i11 = 1;
            c51 c51Var = this.a.X9;
            if (c51Var == null || c51Var.b0) {
                try {
                    AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!messageObject.isOutOwner()) {
                            org.telegram.ui.Components.yc.a0(this.a).w(R.drawable.tooltip_sound, LocaleController.getString(R.string.VoiceOnceTurnOnSound)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.a.X9 = new c51(this.a.getParentActivity());
                c51 c51Var2 = this.a.X9;
                ve eb2 = !messageObject.isOutOwner() ? this.a.eb(messageObject, true) : null;
                a3.h0 N4 = !messageObject.isOutOwner() ? yn.N4(this.a, messageObject) : null;
                Context context = c51Var2.a;
                ci.m6 m6Var = c51Var2.c;
                c51Var2.X = eb2;
                c51Var2.Y = N4;
                a51 a51Var2 = c51Var2.N;
                if (a51Var2 != null) {
                    m6Var.removeView(a51Var2);
                    c51Var2.N = null;
                }
                c51Var2.O = u1Var;
                MessageObject messageObject2 = u1Var.getMessageObject();
                c51Var2.M = messageObject2;
                c51Var2.S = messageObject2 != null && messageObject2.isRoundVideo();
                org.telegram.ui.Cells.u1 u1Var2 = c51Var2.O;
                c51Var2.L = u1Var2 != null ? u1Var2.getResourcesProvider() : null;
                if (c51Var2.O != null) {
                    c51Var2.T = 0.0f;
                    c51Var2.U = u1Var.n;
                    if (u1Var.getParent() instanceof View) {
                        View view = (View) u1Var.getParent();
                        c51Var2.T = view.getY() + c51Var2.T;
                        c51Var2.U = view.getY() + c51Var2.U;
                    }
                    int width = c51Var2.O.getWidth();
                    int height = c51Var2.O.getHeight();
                    if (c51Var2.S) {
                        height = Math.min(AndroidUtilities.dp(360.0f), Math.min(width, AndroidUtilities.displaySize.y));
                    }
                    int i12 = height;
                    c51Var2.K = i12 - c51Var2.O.getHeight();
                    i10 = (int) Math.ceil((Math.min(width, i12) * 0.92f) / AndroidUtilities.density);
                    viewGroup = m6Var;
                    a51 a51Var3 = new a51(c51Var2, c51Var2.getContext(), UserConfig.selectedAccount, c51Var2.O.getResourcesProvider(), width, i12);
                    c51Var2.N = a51Var3;
                    c51Var2.O.j1(a51Var3);
                    c51Var2.N.i1(c51Var2.O);
                    c51Var2.N.setDelegate(new t7.u());
                    a51 a51Var4 = c51Var2.N;
                    MessageObject messageObject3 = c51Var2.M;
                    MessageObject.GroupedMessages currentMessagesGroup = c51Var2.O.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.u1 u1Var3 = c51Var2.O;
                    a51Var4.X3(messageObject3, currentMessagesGroup, u1Var3.F, u1Var3.E, false, false);
                    if (!c51Var2.S) {
                        org.telegram.ui.Components.k8 k8Var = new org.telegram.ui.Components.k8();
                        c51Var2.V = k8Var;
                        a51 a51Var5 = c51Var2.N;
                        k8Var.i = a51Var5;
                        a51Var5.ee = k8Var;
                        if (a51Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.cp0 seekBarWaveform = c51Var2.N.getSeekBarWaveform();
                            seekBarWaveform.L = c51Var2.s;
                            org.telegram.ui.Cells.u1 u1Var4 = seekBarWaveform.n;
                            if (u1Var4 != null) {
                                u1Var4.invalidate();
                            }
                        }
                    }
                    c51Var2.H = false;
                    viewGroup.addView(c51Var2.N, new FrameLayout.LayoutParams(c51Var2.O.getWidth(), i12, 17));
                } else {
                    viewGroup = m6Var;
                    i10 = 360;
                }
                TextureView textureView = c51Var2.P;
                if (textureView != null) {
                    viewGroup.removeView(textureView);
                    c51Var2.P = null;
                }
                if (c51Var2.S) {
                    c51Var2.Q = false;
                    TextureView textureView2 = new TextureView(context);
                    c51Var2.P = textureView2;
                    viewGroup.addView(textureView2, 0, w7.z5.c(i10, i10));
                }
                MediaController.getInstance().pauseByRewind();
                org.telegram.ui.Components.e81 e81Var = c51Var2.w;
                if (e81Var != null) {
                    e81Var.B();
                    c51Var2.w.H();
                    c51Var2.w = null;
                }
                org.telegram.ui.Cells.u1 u1Var5 = c51Var2.O;
                if (u1Var5 != null && u1Var5.getMessageObject() != null) {
                    File pathToAttach = FileLoader.getInstance(c51Var2.O.getMessageObject().currentAccount).getPathToAttach(c51Var2.O.getMessageObject().getDocument());
                    if (pathToAttach != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && (pathToAttach = FileLoader.getInstance(c51Var2.O.getMessageObject().currentAccount).getPathToMessage(c51Var2.O.getMessageObject().messageOwner)) != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && c51Var2.O.getMessageObject().messageOwner.attachPath != null) {
                        pathToAttach = new File(c51Var2.O.getMessageObject().messageOwner.attachPath);
                    }
                    if (pathToAttach != null && pathToAttach.exists()) {
                        org.telegram.ui.Components.e81 e81Var2 = new org.telegram.ui.Components.e81();
                        c51Var2.w = e81Var2;
                        e81Var2.J = new b51(c51Var2);
                        if (c51Var2.V != null) {
                            e81Var2.K = new b51(c51Var2);
                        }
                        if (c51Var2.S) {
                            e81Var2.V(c51Var2.P);
                        }
                        c51Var2.w.D(Uri.fromFile(pathToAttach), "other");
                        c51Var2.w.C();
                        org.telegram.ui.Components.mt mtVar = c51Var2.E;
                        if (mtVar != null) {
                            mtVar.s = c51Var2.w;
                            mtVar.a();
                        }
                    }
                    yn ynVar = this.a;
                    ynVar.showDialog(ynVar.X9);
                    return false;
                }
                ci.e4 e4Var = c51Var2.x;
                if (e4Var != null) {
                    viewGroup.removeView(e4Var);
                    c51Var2.x = null;
                }
                MessageObject messageObject4 = c51Var2.M;
                boolean z10 = messageObject4 != null && messageObject4.isOutOwner();
                MessageObject messageObject5 = c51Var2.M;
                if (messageObject5 != null && messageObject5.getDialogId() != UserConfig.getInstance(c51Var2.M.currentAccount).getClientUserId()) {
                    ci.e4 e4Var2 = new ci.e4(context, 3);
                    c51Var2.x = e4Var2;
                    e4Var2.p(true);
                    if (z10) {
                        long dialogId = c51Var2.M.getDialogId();
                        String str = "";
                        if (dialogId > 0) {
                            TLRPC.User user = MessagesController.getInstance(c51Var2.M.currentAccount).getUser(Long.valueOf(dialogId));
                            if (user != null) {
                                str = UserObject.getFirstName(user);
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(c51Var2.M.currentAccount).getChat(Long.valueOf(-dialogId));
                            if (chat != null) {
                                str = chat.title;
                            }
                        }
                        c51Var2.x.s(AndroidUtilities.replaceTags(LocaleController.formatString(c51Var2.S ? R.string.VideoOnceOutHint : R.string.VoiceOnceOutHint, str)));
                    } else {
                        c51Var2.x.s(AndroidUtilities.replaceTags(LocaleController.getString(c51Var2.S ? R.string.VideoOnceHint : R.string.VoiceOnceHint)));
                    }
                    c51Var2.x.q(12.0f);
                    c51Var2.x.setPadding(AndroidUtilities.dp((z10 || c51Var2.O.F) ? 0.0f : 6.0f), 0, 0, 0);
                    if (c51Var2.S) {
                        c51Var2.x.m(0.5f, 0.0f);
                        c51Var2.x.K = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        c51Var2.x.m(0.0f, AndroidUtilities.dp(34.0f));
                        c51Var2.x.K = Layout.Alignment.ALIGN_NORMAL;
                    }
                    c51Var2.x.t(14.0f);
                    ci.e4 e4Var3 = c51Var2.x;
                    e4Var3.h = ci.e4.a(e4Var3.getText(), c51Var2.x.getTextPaint());
                    if (c51Var2.S) {
                        viewGroup.addView(c51Var2.x, w7.z5.d((int) ((c51Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((c51Var2.O.getHeight() + c51Var2.K) / AndroidUtilities.density) / 2.0f), 0.0f, 0.0f));
                    } else {
                        viewGroup.addView(c51Var2.x, w7.z5.d((int) ((c51Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, ((((c51Var2.O.getWidth() * (-0.39999998f)) / 2.0f) + c51Var2.O.getBoundsLeft()) / AndroidUtilities.density) + 1.0f, ((-75.0f) - ((c51Var2.O.getHeight() / AndroidUtilities.density) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    c51Var2.x.u();
                }
                TextView textView = c51Var2.y;
                if (textView != null) {
                    viewGroup.removeView(textView);
                    c51Var2.y = null;
                }
                TextView textView2 = new TextView(context);
                c51Var2.y = textView2;
                textView2.setTextColor(-1);
                c51Var2.y.setTypeface(AndroidUtilities.bold());
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    c51Var2.y.setBackground(org.telegram.ui.ActionBar.i6.i0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    c51Var2.y.setBackground(org.telegram.ui.ActionBar.i6.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                c51Var2.y.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
                w7.b6.a(c51Var2.y);
                c51Var2.y.setText(LocaleController.getString(z10 ? R.string.VoiceOnceClose : R.string.VoiceOnceDeleteClose));
                c51Var2.y.setOnClickListener(new y41(c51Var2, i11));
                viewGroup.addView(c51Var2.y, w7.z5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z10 && (a51Var = c51Var2.N) != null && a51Var.getMessageObject() != null && c51Var2.N.getMessageObject().messageOwner != null) {
                    c51Var2.N.getMessageObject().messageOwner.media_unread = false;
                    c51Var2.N.invalidate();
                }
                yn ynVar2 = this.a;
                ynVar2.showDialog(ynVar2.X9);
                return false;
            }
        } else {
            if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                boolean playMessage = MediaController.getInstance().playMessage(messageObject, false);
                MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? this.a.R7(messageObject, false) : null, false);
                return playMessage;
            }
            if (messageObject.isMusic()) {
                MediaController mediaController = MediaController.getInstance();
                ArrayList L = this.a.y0.L();
                yn ynVar3 = this.a;
                return mediaController.setPlaylist(L, messageObject, ynVar3.J6, true ^ ynVar3.y0.N, null);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean R(org.telegram.ui.Cells.u1 u1Var) {
        int i10;
        MessageObject messageObject;
        TLRPC.Message message;
        if (u1Var == null) {
            return false;
        }
        yn ynVar = this.a;
        if (ynVar.getParentActivity() == null) {
            return false;
        }
        i10 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
        if (!MessagesController.getInstance(i10).richEditorAllowed() || (messageObject = u1Var.getMessageObject()) == null || (message = messageObject.messageOwner) == null || message.rich_message == null) {
            return false;
        }
        if (!messageObject.translated || message.translatedRichMessage == null) {
            return messageObject.canEditMessage(ynVar.e);
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void R0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        yn ynVar = this.a;
        ynVar.getSendMessagesHelper().sendCallback(true, u1Var.getMessageObject(), keyboardInlineButton, ynVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void R1() {
        org.telegram.ui.ActionBar.d6 d6Var;
        yn ynVar = this.a;
        if (ynVar.V0 == null || ynVar.getParentActivity() == null) {
            return;
        }
        Context context = ynVar.V0.getContext();
        d6Var = ((org.telegram.ui.ActionBar.n2) ynVar).resourceProvider;
        z31.R(context, ynVar, false, d6Var, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean S() {
        yn ynVar = this.a;
        return UserObject.isReplyUser(ynVar.f) || UserObject.isUserSelf(ynVar.f);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void T(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        MessageObject messageObject;
        if (chat == null) {
            return;
        }
        yn ynVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
        if (kVar.s() || ynVar.z9()) {
            yn.b2(ynVar, u1Var, true, f7, f10);
            return;
        }
        if (z10 || !chat.signature_profiles || (messageObject = u1Var.getMessageObject()) == null || messageObject.getDialogId() == UserObject.REPLY_BOT) {
            q(u1Var, chat, i10, z10);
        } else {
            ynVar.ma(DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void T1(org.telegram.ui.Cells.u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        yi yiVar;
        int i10;
        MessageObject messageObject = u1Var.getMessageObject();
        qg.f2 f2Var = null;
        if (!(messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview)) {
            TLRPC.Message message = messageObject.messageOwner;
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
                ArrayList arrayList = new ArrayList();
                int i11 = -1;
                for (int i12 = 0; i12 < tL_messageMediaPaidMedia.extended_media.size(); i12++) {
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia.extended_media.get(i12);
                    if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia = (TLRPC.TL_messageExtendedMedia) messageExtendedMedia2;
                        if (tL_messageExtendedMedia == messageExtendedMedia) {
                            i11 = arrayList.size();
                        }
                        TLRPC.TL_message C7 = yn.C7(message);
                        if (!TextUtils.isEmpty(tL_messageExtendedMedia.attachPath)) {
                            C7.attachPath = tL_messageExtendedMedia.attachPath;
                        } else if (tL_messageMediaPaidMedia.extended_media.size() == 1) {
                            C7.attachPath = message.attachPath;
                        }
                        C7.media = tL_messageExtendedMedia.media;
                        C7.noforwards = true;
                        arrayList.add(new MessageObject(messageObject.currentAccount, C7, false, true));
                    }
                }
                if (i11 <= -1 || arrayList.isEmpty()) {
                    return;
                }
                PhotoViewer t12 = PhotoViewer.t1();
                yn ynVar = this.a;
                t12.K2(null, ynVar, ynVar.ca);
                PhotoViewer.t1().b2(arrayList, i11, this.a.a(), 0L, 0L, this.a.Ea);
                return;
            }
            return;
        }
        yn ynVar2 = this.a;
        nf.e eVar = ynVar2.xb;
        if (eVar != null) {
            eVar.a(true);
            ynVar2.xb = null;
        }
        if (u1Var.getMessageObject() == null) {
            ynVar2.xb = null;
            yiVar = null;
        } else {
            yiVar = new yi(ynVar2, u1Var.getMessageObject().getId(), u1Var, 1);
            ynVar2.xb = yiVar;
        }
        i10 = ((org.telegram.ui.ActionBar.n2) this.a).currentAccount;
        yh.u5 y3 = yh.u5.y(i10, false);
        Objects.requireNonNull(yiVar);
        bj bjVar = new bj(yiVar, 7);
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        org.telegram.ui.ActionBar.d6 I = yh.u5.I();
        if (messageObject != null && context != null) {
            long dialogId = messageObject.getDialogId();
            int id2 = messageObject.getId();
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = MessagesController.getInstance(y3.a).getInputPeer(dialogId);
            tL_inputInvoiceMessage.msg_id = id2;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject p5 = ei.l3.p(I, false);
            if (p5 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p5.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
            f2Var = new qg.f2(y3, ConnectionsManager.getInstance(y3.a).sendRequest(tL_payments_getPaymentForm, new ai.p3(y3, messageObject, tL_inputInvoiceMessage, bjVar, 19)), 4);
        }
        if (f2Var != null) {
            yiVar.b = f2Var;
            yiVar.d();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void U(org.telegram.ui.Cells.u1 u1Var) {
        i(u1Var, true, true, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void U1(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10;
        int i11;
        ImageLocation forDocument;
        String str2;
        boolean isEmpty = TextUtils.isEmpty(str);
        yn ynVar = this.a;
        if (!isEmpty) {
            nf.f.s(ynVar.getParentActivity(), "https://" + ynVar.getMessagesController().linkPrefix + "/nft/" + str);
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
        rg.m1 m1Var = new rg.m1(ynVar, i10, user, null, null, ynVar.ca);
        u1Var.getLocationOnScreen(new int[2]);
        m1Var.v0 = u1Var.getNameStatusX();
        m1Var.w0 = u1Var.getNameStatusY();
        m1Var.z0 = u1Var.getScaleX();
        m1Var.x0 = u1Var.getLeft();
        m1Var.y0 = u1Var.getTop();
        m1Var.A0 = u1Var;
        int colorId = UserObject.getColorId(user);
        if (colorId < 7) {
            m1Var.u0 = Integer.valueOf(ynVar.getThemedColor(org.telegram.ui.ActionBar.i6.r8[colorId]));
        } else {
            i11 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
            MessagesController.PeerColors peerColors = MessagesController.getInstance(i11).peerColors;
            MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(colorId) : null;
            m1Var.u0 = color != null ? Integer.valueOf(color.getColor1()) : null;
        }
        org.telegram.ui.Components.o5 o5Var = u1Var.fc;
        if (o5Var != null && (o5Var.f[0] instanceof org.telegram.ui.Components.q5)) {
            m1Var.z0 *= 0.95f;
            if (document != null) {
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(ynVar.getParentActivity());
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.i6.m6, 0.2f);
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                if ("video/webm".equals(document.mime_type)) {
                    forDocument = ImageLocation.getForDocument(document);
                    if (svgThumb != null) {
                        svgThumb.overrideWidthAndHeight(512, 512);
                    }
                    str2 = "160_160_g";
                } else {
                    if (svgThumb != null && MessageObject.isAnimatedStickerDocument(document, false)) {
                        svgThumb.overrideWidthAndHeight(512, 512);
                    }
                    forDocument = ImageLocation.getForDocument(document);
                    str2 = "160_160";
                }
                ImageLocation imageLocation = forDocument;
                String str3 = str2;
                w9Var.setLayerNum(7);
                w9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                w9Var.l(imageLocation, str3, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "140_140", svgThumb, document);
                if (MessageObject.isTextColorEmoji(document)) {
                    Integer num = m1Var.u0;
                    w9Var.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : ynVar.getThemedColor(org.telegram.ui.ActionBar.i6.v6), PorterDuff.Mode.SRC_IN));
                    m1Var.C0 = MessageObject.getInputStickerSet(document);
                } else {
                    m1Var.C0 = MessageObject.getInputStickerSet(document);
                }
                m1Var.B0 = w9Var;
                m1Var.E0 = true;
            }
        }
        ynVar.showDialog(m1Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void V0(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        this.a.U7(characterStyle, z10, u1Var.getMessageObject(), u1Var);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v21 org.telegram.ui.Components.sk0, still in use, count: 2, list:
          (r2v21 org.telegram.ui.Components.sk0) from 0x0a3a: MOVE (r0v22 org.telegram.ui.Components.sk0) = (r2v21 org.telegram.ui.Components.sk0) (LINE:2619)
          (r2v21 org.telegram.ui.Components.sk0) from 0x0a37: MOVE (r0v25 org.telegram.ui.Components.sk0) = (r2v21 org.telegram.ui.Components.sk0) (LINE:2616)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // org.telegram.ui.Cells.l1
    public final boolean V1(org.telegram.ui.Cells.u1 r50, org.telegram.tgnet.TLRPC.PollAnswer r51) {
        /*
            Method dump skipped, instructions count: 2746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kn.V1(org.telegram.ui.Cells.u1, org.telegram.tgnet.TLRPC$PollAnswer):boolean");
    }

    @Override // org.telegram.ui.Cells.l1
    public final int W() {
        return this.a.P3;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean W0(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
        MessageObject messageObject = (currentMessagesGroup == null || currentMessagesGroup.messages.isEmpty()) ? u1Var.getMessageObject() : currentMessagesGroup.messages.get(0);
        if (messageObject != null) {
            yn ynVar = this.a;
            boolean z11 = !ynVar.gc && messageObject.getId() == ynVar.fc;
            if (!z10) {
                return z11;
            }
            if (z11 && System.currentTimeMillis() - ynVar.hc > 1000) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void X0(org.telegram.ui.Cells.u1 u1Var) {
        yn ynVar = this.a;
        ynVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(ynVar.R5), u1Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final kv0 Y1() {
        return this.a.ua;
    }

    @Override // org.telegram.ui.Cells.l1
    public final hh.a Z() {
        return this.a.Nb;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void Z0(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
        if (messageFwdHeader == null || TextUtils.isEmpty(messageFwdHeader.psa_type)) {
            return;
        }
        String string = LocaleController.getString("PsaMessageInfo_" + messageObject.messageOwner.fwd_from.psa_type);
        if (TextUtils.isEmpty(string)) {
            string = LocaleController.getString(R.string.PsaMessageInfoDefault);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        MessageObject.addLinks(false, spannableStringBuilder);
        MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
        yn ynVar = this.a;
        if (currentMessagesGroup != null) {
            int size = currentMessagesGroup.posArray.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                if ((currentMessagesGroup.posArray.get(i10).flags & 1) != 0) {
                    MessageObject messageObject2 = currentMessagesGroup.messages.get(i10);
                    if (messageObject2 != messageObject) {
                        int childCount = ynVar.v0.getChildCount();
                        for (int i11 = 0; i11 < childCount; i11++) {
                            View childAt = ynVar.v0.getChildAt(i11);
                            if (childAt instanceof org.telegram.ui.Cells.u1) {
                                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                                if (messageObject2.equals(u1Var2.getMessageObject())) {
                                    u1Var = u1Var2;
                                }
                            }
                        }
                        messageObject = messageObject2;
                    }
                } else {
                    i10++;
                }
            }
        }
        ynVar.Ib(messageObject, spannableStringBuilder, 1);
        u1Var.g4(1, false, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean a2(long j3) {
        yn ynVar = this.a;
        TLRPC.Chat chat = ynVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return false;
        }
        return ynVar.getMessagesController().isAdmin(ynVar.e.id, j3);
    }

    public final void b(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        yn ynVar = this.a;
        jk jkVar = ynVar.W;
        if (jkVar != null) {
            CharSequence fieldText = jkVar.getFieldText();
            if (fieldText != null) {
                spannableStringBuilder = new SpannableStringBuilder(fieldText);
                if (fieldText.charAt(fieldText.length() - 1) != ' ') {
                    spannableStringBuilder.append((CharSequence) " ");
                }
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != ' ') {
                spannableStringBuilder.append(' ');
            }
            String publicUsername = ChatObject.getPublicUsername(chat);
            if (publicUsername != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) publicUsername).append((CharSequence) " ");
                ynVar.W.setFieldText(spannableStringBuilder);
                AndroidUtilities.runOnUIThread(new um(this, 6), 200L);
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean b0(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var == null ? null : u1Var.getMessageObject();
        if (messageObject == null || messageObject.messageOwner == null) {
            return false;
        }
        yn ynVar = this.a;
        return (ynVar.P3 == 1 || ynVar.x9() || messageObject.messageOwner.noforwards || messageObject.type == 29) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x00fe, code lost:
    
        if (org.telegram.messenger.DialogObject.getPeerDialogId(r5) != r8.R5) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013d  */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b2(org.telegram.ui.Cells.u1 u1Var, int i10, float f7, float f10, boolean z10) {
        Integer num;
        TLRPC.MessageReplyHeader messageReplyHeader;
        String str;
        byte[] bArr;
        TLRPC.MessageReplyHeader messageReplyHeader2;
        TLRPC.Message message;
        String str2;
        long j3;
        boolean z11;
        TLRPC.Chat chat;
        TLRPC.Message message2;
        TLRPC.MessageReplyHeader messageReplyHeader3;
        TLRPC.MessageReplyHeader messageReplyHeader4;
        org.telegram.ui.ActionBar.n2 n2Var;
        TLRPC.Chat chat2;
        TLRPC.MessageReplyHeader messageReplyHeader5;
        MessageObject messageObject;
        TLRPC.MessageReplyHeader messageReplyHeader6;
        TLRPC.MessageReplyHeader messageReplyHeader7;
        TLRPC.Message message3;
        TL_stories.StoryItem storyItem;
        org.telegram.ui.ActionBar.k kVar;
        boolean e7 = e();
        yn ynVar = this.a;
        if (!e7 && !z10) {
            kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
            if ((kVar.s() || ynVar.z9()) && !ynVar.a9.A(u1Var.getMessageObject())) {
                yn.b2(ynVar, u1Var, !u1Var.i3(f7), f7, f10);
                return;
            }
            return;
        }
        if (UserObject.isReplyUser(ynVar.f)) {
            r(u1Var);
            return;
        }
        MessageObject messageObject2 = u1Var.getMessageObject();
        if (messageObject2 == null) {
            return;
        }
        if (messageObject2.isReplyToStory() && (storyItem = (message3 = messageObject2.messageOwner).replyStory) != null) {
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                org.telegram.messenger.q.p(R.string.StoryNotFound, org.telegram.ui.Components.yc.a0(ynVar), R.raw.story_bomb1, 36);
                return;
            }
            storyItem.dialogId = DialogObject.getPeerDialogId(message3.reply_to.peer);
            storyItem.messageId = messageObject2.getId();
            storyItem.messageType = 3;
            ai.ia.b(storyItem, ynVar.f);
            ynVar.getOrCreateStoryViewer().F(ynVar.getParentActivity(), storyItem, ai.u9.a(ynVar.v0));
            return;
        }
        TLRPC.Message message4 = messageObject2.messageOwner;
        if (message4 != null && (messageReplyHeader7 = message4.reply_to) != null && (messageReplyHeader7.flags & 2048) != 0) {
            num = Integer.valueOf(messageReplyHeader7.todo_item_id);
        } else {
            if (message4 != null && (messageReplyHeader2 = message4.reply_to) != null && (bArr = messageReplyHeader2.poll_option) != null) {
                num = null;
                str = null;
                long j10 = ynVar.R5;
                message = messageObject2.messageOwner;
                if (message == null) {
                }
                str2 = str;
                j3 = j10;
                z11 = false;
                if (j3 < 0) {
                }
                if (j3 != Long.MAX_VALUE) {
                }
                message2 = messageObject2.messageOwner;
                if (message2 != null) {
                }
                TLRPC.Message message5 = messageObject2.messageOwner;
                org.telegram.ui.Components.yc.a0(ynVar).Q(R.raw.error, 36, LocaleController.getString((message5 == null && (messageReplyHeader3 = message5.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
            }
            if (message4 != null && (messageReplyHeader = message4.reply_to) != null && messageReplyHeader.quote) {
                String str3 = messageReplyHeader.quote_text;
                r9 = (messageReplyHeader.flags & 1024) != 0 ? messageReplyHeader.quote_offset : -1;
                str = str3;
                num = null;
                bArr = null;
                long j102 = ynVar.R5;
                message = messageObject2.messageOwner;
                if (message == null && (messageReplyHeader6 = message.reply_to) != null) {
                    TLRPC.Peer peer = messageReplyHeader6.reply_to_peer_id;
                    if (peer == null) {
                        str2 = str;
                        TLRPC.MessageFwdHeader messageFwdHeader = messageReplyHeader6.reply_from;
                        if (messageFwdHeader != null) {
                            TLRPC.Peer peer2 = messageFwdHeader.from_id;
                            if (peer2 != null) {
                                if (!(peer2 instanceof TLRPC.TL_peerUser)) {
                                    j102 = DialogObject.getPeerDialogId(peer2);
                                }
                                j3 = Long.MAX_VALUE;
                            } else {
                                TLRPC.Peer peer3 = messageFwdHeader.saved_from_peer;
                                if (peer3 != null) {
                                    j102 = DialogObject.getPeerDialogId(peer3);
                                }
                                j3 = Long.MAX_VALUE;
                            }
                        }
                    } else {
                        if (!(peer instanceof TLRPC.TL_peerUser)) {
                            j3 = DialogObject.getPeerDialogId(peer);
                            str2 = str;
                            z11 = true;
                            chat = j3 < 0 ? ynVar.getMessagesController().getChat(Long.valueOf(-j3)) : null;
                            if (j3 != Long.MAX_VALUE) {
                                boolean z12 = z11;
                                if (j3 == ynVar.R5 || chat == null || ChatObject.isPublic(chat) || (!chat.left && !chat.kicked)) {
                                    if (((j3 == ynVar.R5 && (!ChatObject.isForum(ynVar.e) || !z12)) || j3 == Long.MAX_VALUE) && (ynVar.P3 != 3 || ((messageObject = messageObject2.replyMessageObject) != null && messageObject.getSavedDialogId() == ynVar.d()))) {
                                        int i11 = ynVar.P3;
                                        if (i11 == 2 || i11 == 1) {
                                            ynVar.T8.S0(i10);
                                            ynVar.finishFragment();
                                            return;
                                        }
                                        if (bArr != null) {
                                            ynVar.P7 = bArr;
                                        } else if (num != null) {
                                            ynVar.O7 = num;
                                        } else {
                                            TLRPC.Message message6 = messageObject2.messageOwner;
                                            if (message6 != null && (messageReplyHeader5 = message6.reply_to) != null && messageReplyHeader5.quote) {
                                                ynVar.L7 = true;
                                                ynVar.N7 = messageReplyHeader5.quote_text;
                                                ynVar.Q7 = r9;
                                                ynVar.K7 = true;
                                            }
                                        }
                                        ei.m3 m3Var = new ei.m3(this, i10, messageObject2, num, bArr, 18);
                                        if (!ynVar.y0.N) {
                                            m3Var.run();
                                            return;
                                        }
                                        ynVar.p3 = false;
                                        ynVar.kb(false, true, false);
                                        ynVar.Ec(ynVar.getMediaDataController().getMask(), ynVar.getMediaDataController().getSearchPosition(), ynVar.getMediaDataController().getSearchCount());
                                        AndroidUtilities.runOnUIThread(m3Var, 80L);
                                        return;
                                    }
                                    Integer num2 = num;
                                    byte[] bArr2 = bArr;
                                    if (LaunchActivity.G1 != null) {
                                        nf.e eVar = ynVar.xb;
                                        if (eVar != null) {
                                            eVar.a(false);
                                            n2Var = null;
                                            ynVar.xb = null;
                                        } else {
                                            n2Var = null;
                                        }
                                        LaunchActivity launchActivity = LaunchActivity.G1;
                                        final j0 j0Var = new j0(this, messageObject2, u1Var);
                                        ynVar.xb = j0Var;
                                        int id2 = messageObject2.getId();
                                        ArrayList arrayList = launchActivity.d0;
                                        if (j3 < 0 && (chat2 = MessagesController.getInstance(launchActivity.O).getChat(Long.valueOf(-j3))) != null && ChatObject.isForum(chat2)) {
                                            j0Var.d();
                                            final int i12 = 0;
                                            launchActivity.k0(j3, Integer.valueOf(i10), str2, num2, bArr2, new Runnable() { // from class: org.telegram.ui.l90
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i13 = i12;
                                                    j0 j0Var2 = j0Var;
                                                    switch (i13) {
                                                        case 0:
                                                            Pattern pattern = LaunchActivity.B1;
                                                            j0Var2.c(false);
                                                            break;
                                                        default:
                                                            Pattern pattern2 = LaunchActivity.B1;
                                                            j0Var2.c(false);
                                                            break;
                                                    }
                                                }
                                            }, id2, r9);
                                            return;
                                        }
                                        String str4 = str2;
                                        int i13 = r9;
                                        j0Var.d();
                                        Bundle bundle = new Bundle();
                                        if (j3 >= 0) {
                                            bundle.putLong("user_id", j3);
                                        } else {
                                            long j11 = -j3;
                                            TLRPC.Chat chat3 = MessagesController.getInstance(launchActivity.O).getChat(Long.valueOf(j11));
                                            if (chat3 != null && chat3.forum) {
                                                final int i14 = 1;
                                                launchActivity.k0(j3, Integer.valueOf(i10), str4, num2, bArr2, new Runnable() { // from class: org.telegram.ui.l90
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i132 = i14;
                                                        j0 j0Var2 = j0Var;
                                                        switch (i132) {
                                                            case 0:
                                                                Pattern pattern = LaunchActivity.B1;
                                                                j0Var2.c(false);
                                                                break;
                                                            default:
                                                                Pattern pattern2 = LaunchActivity.B1;
                                                                j0Var2.c(false);
                                                                break;
                                                        }
                                                    }
                                                }, id2, i13);
                                                return;
                                            }
                                            bundle.putLong("chat_id", j11);
                                        }
                                        bundle.putInt("message_id", i10);
                                        org.telegram.ui.ActionBar.n2 n2Var2 = !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.n2) hg.c.g(1, arrayList) : n2Var;
                                        if (n2Var2 == null || MessagesController.getInstance(launchActivity.O).checkCanOpenChat(bundle, n2Var2)) {
                                            AndroidUtilities.runOnUIThread(new k90(launchActivity, bundle, bArr2, i10, num2, str4, i13, j3, j0Var, n2Var2));
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            }
                            message2 = messageObject2.messageOwner;
                            if (message2 != null || (messageReplyHeader4 = message2.reply_to) == null || TextUtils.isEmpty(messageReplyHeader4.quote_text) || !messageObject2.replyTextEllipsized || messageObject2.replyTextRevealed || messageObject2.shouldDrawWithoutBackground()) {
                                TLRPC.Message message52 = messageObject2.messageOwner;
                                org.telegram.ui.Components.yc.a0(ynVar).Q(R.raw.error, 36, LocaleController.getString((message52 == null && (messageReplyHeader3 = message52.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
                            } else {
                                messageObject2.replyTextRevealed = true;
                                ynVar.pc(messageObject2, true);
                                return;
                            }
                        }
                        str2 = str;
                    }
                    z11 = false;
                    if (j3 < 0) {
                    }
                    if (j3 != Long.MAX_VALUE) {
                    }
                    message2 = messageObject2.messageOwner;
                    if (message2 != null) {
                    }
                    TLRPC.Message message522 = messageObject2.messageOwner;
                    org.telegram.ui.Components.yc.a0(ynVar).Q(R.raw.error, 36, LocaleController.getString((message522 == null && (messageReplyHeader3 = message522.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
                }
                str2 = str;
                j3 = j102;
                z11 = false;
                if (j3 < 0) {
                }
                if (j3 != Long.MAX_VALUE) {
                }
                message2 = messageObject2.messageOwner;
                if (message2 != null) {
                }
                TLRPC.Message message5222 = messageObject2.messageOwner;
                org.telegram.ui.Components.yc.a0(ynVar).Q(R.raw.error, 36, LocaleController.getString((message5222 == null && (messageReplyHeader3 = message5222.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
            }
            num = null;
        }
        bArr = null;
        str = null;
        long j1022 = ynVar.R5;
        message = messageObject2.messageOwner;
        if (message == null) {
        }
        str2 = str;
        j3 = j1022;
        z11 = false;
        if (j3 < 0) {
        }
        if (j3 != Long.MAX_VALUE) {
        }
        message2 = messageObject2.messageOwner;
        if (message2 != null) {
        }
        TLRPC.Message message52222 = messageObject2.messageOwner;
        org.telegram.ui.Components.yc.a0(ynVar).Q(R.raw.error, 36, LocaleController.getString((message52222 == null && (messageReplyHeader3 = message52222.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
    }

    public final void c(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        yn ynVar = this.a;
        jk jkVar = ynVar.W;
        if (jkVar != null) {
            CharSequence fieldText = jkVar.getFieldText();
            if (fieldText != null) {
                spannableStringBuilder = new SpannableStringBuilder(fieldText);
                if (fieldText.charAt(fieldText.length() - 1) != ' ') {
                    spannableStringBuilder.append((CharSequence) " ");
                }
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != ' ') {
                spannableStringBuilder.append(' ');
            }
            String publicUsername = UserObject.getPublicUsername(user);
            if (publicUsername != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) publicUsername).append((CharSequence) " ");
            } else {
                SpannableString spannableString = new SpannableString(sa.e.v(UserObject.getFirstName(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.o61("" + user.id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            ynVar.W.setFieldText(spannableStringBuilder);
            AndroidUtilities.runOnUIThread(new um(this, 7), 200L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // org.telegram.ui.Cells.l1
    public final boolean c0(org.telegram.ui.Cells.u1 u1Var, final TLRPC.User user) {
        int i10;
        y4 b10;
        int i11;
        ok okVar;
        nk nkVar;
        if (!m()) {
            return false;
        }
        yn ynVar = this.a;
        ?? r22 = (ynVar.e == null || ((okVar = ynVar.M0) != null && okVar.getVisibility() == 0) || ((nkVar = ynVar.P) != null && nkVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat = ynVar.e;
        ?? r42 = (chat == null || !(ynVar.b4 == 0 || ynVar.f4) || (ChatObject.isChannel(chat) && !ynVar.e.megagroup)) ? 0 : 1;
        e5[] e5VarArr = new e5[r22 + 2 + r42];
        e5VarArr[0] = e5.d;
        e5VarArr[1] = e5.h;
        char c10 = 2;
        if (r22 != 0) {
            e5VarArr[2] = e5.n;
            c10 = 3;
        }
        if (r42 != 0) {
            e5VarArr[c10] = e5.r;
        }
        TLRPC.UserFull userFull = ynVar.getMessagesController().getUserFull(user.id);
        if (userFull != null) {
            b10 = y4.c(user, userFull, e5VarArr);
            if (!com.google.firebase.messaging.m.e(b10)) {
                i11 = ((org.telegram.ui.ActionBar.n2) ynVar).classGuid;
                b10 = y4.b(user, i11, e5VarArr);
            }
        } else {
            i10 = ((org.telegram.ui.ActionBar.n2) ynVar).classGuid;
            b10 = y4.b(user, i10, e5VarArr);
        }
        if (com.google.firebase.messaging.m.e(b10)) {
            com.google.firebase.messaging.m.k().v((ViewGroup) ynVar.fragmentView, ynVar.ca, b10, new c7(this, u1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.b80 H = org.telegram.ui.Components.b80.H(ynVar, u1Var);
        final int i12 = 0;
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(this) { // from class: org.telegram.ui.wm
            public final /* synthetic */ kn b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.y(user, false);
                        break;
                    case 1:
                        this.b.c(user);
                        break;
                    default:
                        this.b.a.la(user);
                        break;
                }
            }
        }, false);
        H.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new r1(this, u1Var, user, 25), false);
        final int i13 = 1;
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new Runnable(this) { // from class: org.telegram.ui.wm
            public final /* synthetic */ kn b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.b.y(user, false);
                        break;
                    case 1:
                        this.b.c(user);
                        break;
                    default:
                        this.b.a.la(user);
                        break;
                }
            }
        }, r22);
        final int i14 = 2;
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new Runnable(this) { // from class: org.telegram.ui.wm
            public final /* synthetic */ kn b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        this.b.y(user, false);
                        break;
                    case 1:
                        this.b.c(user);
                        break;
                    default:
                        this.b.a.la(user);
                        break;
                }
            }
        }, r42);
        H.t = false;
        H.i = 3;
        H.W = true;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean c1(int i10, org.telegram.ui.Cells.u1 u1Var) {
        yn ynVar = this.a;
        return ynVar.tb != 0 && u1Var.getMessageObject() != null && ynVar.tb == u1Var.getMessageObject().getId() && ynVar.ub == i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:259:0x03f5, code lost:
    
        if (r9.paid_reactions_available != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x03fb, code lost:
    
        if (r8.isEmpty() == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x042b, code lost:
    
        if (r9.paid_reactions_available != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0447, code lost:
    
        if (r8.isEmpty() != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0435, code lost:
    
        if (org.telegram.messenger.ChatObject.isChannel(r5.e) == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0441, code lost:
    
        if (org.telegram.messenger.ChatObject.isMonoForum(r5.e) != false) goto L142;
     */
    /* JADX WARN: Removed duplicated region for block: B:182:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x05b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0719 A[LOOP:2: B:204:0x0717->B:205:0x0719, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0787  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03c4  */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c2(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem) {
        be1 be1Var;
        TLRPC.TodoItem todoItem2;
        TLRPC.TodoCompletion todoCompletion;
        be1 be1Var2;
        MessageObject messageObject;
        be1 be1Var3;
        int i10;
        MessageObject messageObject2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        xe xeVar;
        MessageObject messageObject3;
        boolean z14;
        ArrayList arrayList;
        ArrayList arrayList2;
        ee1 ee1Var;
        ArrayList arrayList3;
        yn ynVar;
        MessageObject messageObject4;
        int size;
        int i11;
        ViewGroup viewGroup;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        final yn ynVar2 = this.a;
        if (ynVar2.getParentActivity() == null || ynVar2.getParentActivity() == null) {
            return false;
        }
        ci.e4 e4Var = ynVar2.v1;
        if (e4Var != null && e4Var.V) {
            e4Var.e(true);
        }
        ul ulVar = ynVar2.z1;
        if (ulVar != null && ulVar.V) {
            ulVar.e(true);
        }
        MessageObject primaryMessageObject = u1Var.getPrimaryMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(primaryMessageObject);
        if (primaryMessageObject == null || !(media instanceof TLRPC.TL_messageMediaToDo)) {
            return false;
        }
        ynVar2.b5 = primaryMessageObject;
        ynVar2.c5 = null;
        final ee1 ee1Var2 = new ee1(ynVar2.getParentActivity(), ynVar2.getResourceProvider());
        final int i12 = todoItem.id;
        ee1Var2.K = u1Var;
        ee1Var2.O = i12;
        MessageObject messageObject5 = u1Var.getMessageObject();
        ee1Var2.G = messageObject5;
        ee1Var2.H = messageObject5 != null && messageObject5.isOutOwner();
        org.telegram.ui.Cells.u1 u1Var2 = ee1Var2.K;
        be1 be1Var4 = ee1Var2.c;
        if (u1Var2 != null) {
            ee1Var2.L = ynVar2.q9 - AndroidUtilities.dp(4.0f);
            ee1Var2.M = u1Var.n;
            if (u1Var.getParent() instanceof View) {
                View view = (View) u1Var.getParent();
                ee1Var2.L = view.getY() + ee1Var2.L;
                ee1Var2.M = view.getY() + ee1Var2.M;
            }
            int width = ee1Var2.K.getWidth();
            int height = ee1Var2.K.getHeight();
            ee1Var2.K.getHeight();
            be1Var = be1Var4;
            ce1 ce1Var = new ce1(ee1Var2, ee1Var2.getContext(), UserConfig.selectedAccount, ee1Var2.K.getResourcesProvider(), i12, width, height);
            ee1Var2.I = ce1Var;
            ee1Var2.K.h1(ce1Var);
            ee1Var2.I.i1(ee1Var2.K);
            ee1Var2.I.setDelegate(new de1(ee1Var2));
            ce1 ce1Var2 = ee1Var2.I;
            MessageObject messageObject6 = ee1Var2.G;
            MessageObject.GroupedMessages currentMessagesGroup = ee1Var2.K.getCurrentMessagesGroup();
            org.telegram.ui.Cells.u1 u1Var3 = ee1Var2.K;
            ce1Var2.X3(messageObject6, currentMessagesGroup, u1Var3.F, u1Var3.E, u1Var3.G, false);
            be1Var.addView(ee1Var2.I, new FrameLayout.LayoutParams(ee1Var2.K.getWidth(), height, 51));
            fw0 fw0Var = new fw0(ee1Var2.getContext(), UserConfig.selectedAccount, ee1Var2.K.getResourcesProvider(), width, height, 1);
            ee1Var2.J = fw0Var;
            ee1Var2.K.j1(fw0Var);
            ee1Var2.K.h1(ee1Var2.J);
            ee1Var2.J.i1(ee1Var2.K);
            ee1Var2.J.setDelegate(new qb.b(18));
            fw0 fw0Var2 = ee1Var2.J;
            MessageObject messageObject7 = ee1Var2.G;
            MessageObject.GroupedMessages currentMessagesGroup2 = ee1Var2.K.getCurrentMessagesGroup();
            org.telegram.ui.Cells.u1 u1Var4 = ee1Var2.K;
            fw0Var2.X3(messageObject7, currentMessagesGroup2, u1Var4.F, u1Var4.E, u1Var4.G, false);
            be1Var.addView(ee1Var2.J, new FrameLayout.LayoutParams(ee1Var2.K.getWidth(), height, 51));
        } else {
            be1Var = be1Var4;
        }
        ci.i1 i1Var = ee1Var2.e;
        i1Var.bringToFront();
        be1 be1Var5 = ee1Var2.d;
        be1Var5.bringToFront();
        ee1Var2.h.bringToFront();
        i1Var.w(false);
        org.telegram.ui.ActionBar.d6 d6Var = ee1Var2.a;
        org.telegram.ui.Components.b80 F = org.telegram.ui.Components.b80.F(be1Var, d6Var, null);
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) MessageObject.getMedia(ee1Var2.G);
        final int i13 = 0;
        while (true) {
            if (i13 >= tL_messageMediaToDo.todo.list.size()) {
                todoItem2 = null;
                i13 = -1;
                break;
            }
            if (tL_messageMediaToDo.todo.list.get(i13).id == i12) {
                todoItem2 = tL_messageMediaToDo.todo.list.get(i13);
                break;
            }
            i13++;
        }
        int i14 = 0;
        while (true) {
            if (i14 >= tL_messageMediaToDo.completions.size()) {
                todoCompletion = null;
                break;
            }
            if (tL_messageMediaToDo.completions.get(i14).id == i12) {
                todoCompletion = tL_messageMediaToDo.completions.get(i14);
                break;
            }
            i14++;
        }
        if (!ee1Var2.G.canCompleteTodo()) {
            be1Var2 = be1Var5;
        } else if (todoCompletion != null) {
            be1Var2 = be1Var5;
            F.p(14, -1, LocaleController.formatTodoCompletedDate(todoCompletion.date));
            F.k();
            final int i15 = 1;
            F.c(R.drawable.msg_cancel, LocaleController.getString(R.string.TodoUncheck), new Runnable() { // from class: org.telegram.ui.wd1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            yn ynVar3 = ynVar2;
                            uv0 uv0Var = new uv0(ynVar3);
                            ee1 ee1Var3 = ee1Var2;
                            uv0Var.p0(MessageObject.getMedia(ee1Var3.G), false, i12);
                            uv0Var.e0 = new fs0(17, ee1Var3, ynVar3);
                            ynVar3.presentFragment(uv0Var);
                            ee1Var3.c(false);
                            break;
                        case 1:
                            boolean c10 = ynVar2.c();
                            ee1 ee1Var4 = ee1Var2;
                            if (c10) {
                                Toast.makeText(ee1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                ce1 ce1Var3 = ee1Var4.I;
                                ce1Var3.k4(ce1Var3.O2(i12), false);
                            }
                            ee1Var4.c(true);
                            break;
                        default:
                            boolean c11 = ynVar2.c();
                            ee1 ee1Var5 = ee1Var2;
                            if (c11) {
                                Toast.makeText(ee1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                ce1 ce1Var4 = ee1Var5.I;
                                ce1Var4.k4(ce1Var4.O2(i12), false);
                            }
                            ee1Var5.c(true);
                            break;
                    }
                }
            }, false);
        } else {
            be1Var2 = be1Var5;
            final int i16 = 2;
            F.c(R.drawable.msg_select, LocaleController.getString(R.string.TodoCheck), new Runnable() { // from class: org.telegram.ui.wd1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i16) {
                        case 0:
                            yn ynVar3 = ynVar2;
                            uv0 uv0Var = new uv0(ynVar3);
                            ee1 ee1Var3 = ee1Var2;
                            uv0Var.p0(MessageObject.getMedia(ee1Var3.G), false, i12);
                            uv0Var.e0 = new fs0(17, ee1Var3, ynVar3);
                            ynVar3.presentFragment(uv0Var);
                            ee1Var3.c(false);
                            break;
                        case 1:
                            boolean c10 = ynVar2.c();
                            ee1 ee1Var4 = ee1Var2;
                            if (c10) {
                                Toast.makeText(ee1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                ce1 ce1Var3 = ee1Var4.I;
                                ce1Var3.k4(ce1Var3.O2(i12), false);
                            }
                            ee1Var4.c(true);
                            break;
                        default:
                            boolean c11 = ynVar2.c();
                            ee1 ee1Var5 = ee1Var2;
                            if (c11) {
                                Toast.makeText(ee1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                ce1 ce1Var4 = ee1Var5.I;
                                ce1Var4.k4(ce1Var4.O2(i12), false);
                            }
                            ee1Var5.c(true);
                            break;
                    }
                }
            }, false);
        }
        if (todoItem2 != null) {
            F.c(R.drawable.menu_reply, LocaleController.getString(R.string.TodoItemQuote), new rd1(ee1Var2, ynVar2, todoItem2, 2), false);
            if (ee1Var2.G.getDialogId() < 0) {
                MessagesController messagesController = MessagesController.getInstance(ee1Var2.G.currentAccount);
                String publicUsername = DialogObject.getPublicUsername(messagesController.getUserOrChat(ee1Var2.G.getDialogId()));
                StringBuilder sb2 = new StringBuilder("https://");
                sb2.append(messagesController.linkPrefix);
                sb2.append("/");
                if (TextUtils.isEmpty(publicUsername)) {
                    StringBuilder sb3 = new StringBuilder("c/");
                    messageObject = primaryMessageObject;
                    be1Var3 = be1Var2;
                    sb3.append(-ee1Var2.G.getDialogId());
                    publicUsername = sb3.toString();
                } else {
                    messageObject = primaryMessageObject;
                    be1Var3 = be1Var2;
                }
                sb2.append(publicUsername);
                sb2.append("/");
                sb2.append(ee1Var2.G.getId());
                sb2.append("?task=");
                sb2.append(todoItem2.id);
                F.c(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new e91(7, ee1Var2, sb2.toString()), false);
            } else {
                messageObject = primaryMessageObject;
                be1Var3 = be1Var2;
            }
            F.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new e91(8, ee1Var2, todoItem2), false);
        } else {
            messageObject = primaryMessageObject;
            be1Var3 = be1Var2;
        }
        if (ee1Var2.G.canEditMessage(ynVar2.e)) {
            final int i17 = 0;
            F.c(R.drawable.msg_edit, LocaleController.getString(R.string.TodoEditItem), new Runnable() { // from class: org.telegram.ui.wd1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i17) {
                        case 0:
                            yn ynVar3 = ynVar2;
                            uv0 uv0Var = new uv0(ynVar3);
                            ee1 ee1Var3 = ee1Var2;
                            uv0Var.p0(MessageObject.getMedia(ee1Var3.G), false, i13);
                            uv0Var.e0 = new fs0(17, ee1Var3, ynVar3);
                            ynVar3.presentFragment(uv0Var);
                            ee1Var3.c(false);
                            break;
                        case 1:
                            boolean c10 = ynVar2.c();
                            ee1 ee1Var4 = ee1Var2;
                            if (c10) {
                                Toast.makeText(ee1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                ce1 ce1Var3 = ee1Var4.I;
                                ce1Var3.k4(ce1Var3.O2(i13), false);
                            }
                            ee1Var4.c(true);
                            break;
                        default:
                            boolean c11 = ynVar2.c();
                            ee1 ee1Var5 = ee1Var2;
                            if (c11) {
                                Toast.makeText(ee1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                ce1 ce1Var4 = ee1Var5.I;
                                ce1Var4.k4(ce1Var4.O2(i13), false);
                            }
                            ee1Var5.c(true);
                            break;
                    }
                }
            }, false);
            if (tL_messageMediaToDo.todo.list.size() > 1) {
                i10 = 51;
                F.c(R.drawable.msg_delete, LocaleController.getString(R.string.TodoDeleteItem), new org.telegram.ui.Components.r21(ee1Var2, tL_messageMediaToDo, i12, ynVar2, 11), false);
                F.T(org.telegram.ui.ActionBar.i6.l1(0.06f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, d6Var)));
                dh.e k10 = eh.b.k(d6Var);
                ah.c cVar = ee1Var2.F;
                F.Q(cVar, k10, false);
                F.Y();
                ViewGroup viewGroup2 = F.A;
                ee1Var2.Q = viewGroup2;
                viewGroup2.setPivotX(0.0f);
                ee1Var2.Q.setPivotY(0.0f);
                be1Var3.addView(ee1Var2.Q, w7.z5.e(-2, -2, i10));
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ynVar2.n8(messageObject, arrayList4, arrayList5, arrayList6);
                xe xeVar2 = new xe(ynVar2, 10);
                messageObject2 = ee1Var2.G;
                List<TLRPC.TL_availableReaction> enabledReactionsList = ynVar2.getMediaDataController().getEnabledReactionsList();
                boolean z15 = ynVar2.v() && !ynVar2.c() && ynVar2.f == null && messageObject2.hasReactions() && !((ChatObject.isChannel(ynVar2.e) && !ynVar2.e.megagroup) || ChatObject.isMonoForum(ynVar2.e) || enabledReactionsList.isEmpty() || !messageObject2.messageOwner.reactions.can_see_list || messageObject2.isSecretMedia());
                if (messageObject2.isForwardedChannelPost()) {
                    z10 = z15;
                    if (!messageObject2.isSecretMedia()) {
                        if (ynVar2.P3 != 5) {
                            if (!ynVar2.v()) {
                                if (!ynVar2.c()) {
                                    if (messageObject2.isReactionsAvailable()) {
                                        TLRPC.ChatFull chatFull2 = ynVar2.X7;
                                        if (chatFull2 != null) {
                                            if (chatFull2.available_reactions instanceof TLRPC.TL_chatReactionsNone) {
                                            }
                                        }
                                        if (chatFull2 == null) {
                                        }
                                        if (ynVar2.f == null) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z11 = false;
                } else {
                    z10 = z15;
                    TLRPC.ChatFull chatFull3 = ynVar2.getMessagesController().getChatFull(-messageObject2.getFromChatId());
                    if (chatFull3 != null) {
                        if (!ynVar2.v()) {
                            if (ynVar2.P3 != 5) {
                                if (!ynVar2.c()) {
                                    if (messageObject2.isReactionsAvailable()) {
                                        if (chatFull3.available_reactions instanceof TLRPC.TL_chatReactionsNone) {
                                        }
                                    }
                                }
                            }
                        }
                        z11 = false;
                    }
                    z11 = true;
                }
                boolean z16 = z11;
                z12 = (!z10 || ynVar2.c() || ynVar2.e == null || !messageObject2.isOutOwner() || !messageObject2.isSent() || messageObject2.isEditing() || messageObject2.isSending() || messageObject2.isSendError() || messageObject2.isContentUnread() || messageObject2.isUnread() || ConnectionsManager.getInstance(ynVar2.getCurrentAccount()).getCurrentTime() - messageObject2.messageOwner.date >= ynVar2.getMessagesController().chatReadMarkExpirePeriod || (!ChatObject.isMegagroup(ynVar2.e) && ChatObject.isChannel(ynVar2.e)) || (chatFull = ynVar2.X7) == null || chatFull.participants_count > ynVar2.getMessagesController().chatReadMarkSizeThreshold || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || ynVar2.P3 == 3 || !messageObject2.canSetReaction() || ChatObject.isMonoForum(ynVar2.e)) ? false : true;
                if (ynVar2.e != null && !messageObject2.isOut() && ChatObject.isMonoForum(ynVar2.e) && ChatObject.canManageMonoForum(ynVar2.getCurrentAccount(), ynVar2.e)) {
                    int i18 = ((-ynVar2.e.linked_monoforum_id) > messageObject2.getFromChatId() ? 1 : ((-ynVar2.e.linked_monoforum_id) == messageObject2.getFromChatId() ? 0 : -1));
                }
                if (!z10 && ynVar2.e == null && ynVar2.h == null && (user = ynVar2.f) != null && !UserObject.isUserSelf(user) && !UserObject.isReplyUser(ynVar2.f) && !UserObject.isAnonymous(ynVar2.f)) {
                    user2 = ynVar2.f;
                    if (!user2.bot && !UserObject.isService(user2.id) && (((userFull = ynVar2.Y7) == null || !userFull.read_dates_private) && !ynVar2.c() && messageObject2.isOutOwner() && messageObject2.isSent() && !messageObject2.isEditing() && !messageObject2.isSending() && !messageObject2.isSendError() && !messageObject2.isContentUnread() && !messageObject2.isUnread() && ynVar2.getConnectionsManager().getCurrentTime() - messageObject2.messageOwner.date < ynVar2.getMessagesController().pmReadDateExpirePeriod && !(messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                        z13 = true;
                        TLRPC.User user3 = ynVar2.f;
                        boolean z17 = ((user3 == null && (UserObject.isReplyUser(user3) || UserObject.isAnonymous(ynVar2.f))) || ynVar2.c() || !messageObject2.isEdited() || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                        org.telegram.ui.Components.b80 G = org.telegram.ui.Components.b80.G(ee1Var2.c, ynVar2.getResourceProvider(), null, !z10 || z12);
                        if (z12) {
                            xeVar = xeVar2;
                            messageObject3 = messageObject2;
                            z14 = z16;
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            ee1Var = ee1Var2;
                            arrayList3 = arrayList6;
                            ynVar = ynVar2;
                            if (z13) {
                                G.r(new org.telegram.ui.Components.nc0(ee1Var.getContext(), 0, messageObject3, new vd1(ee1Var, 0), ee1Var.a), w7.z5.n(-1, 36));
                                G.k();
                            } else if (z17) {
                                messageObject4 = messageObject3;
                                G.r(new org.telegram.ui.Components.nc0(ee1Var.getContext(), 1, messageObject3, new vd1(ee1Var, 2), ee1Var.a), w7.z5.n(-1, 36));
                                G.k();
                                i11 = 0;
                                for (size = arrayList.size(); i11 < size; size = size) {
                                    G.c(((Integer) arrayList.get(i11)).intValue(), (CharSequence) arrayList2.get(i11), new am0(ee1Var, xeVar, ((Integer) arrayList3.get(i11)).intValue(), 9), false);
                                    i11++;
                                    arrayList3 = arrayList3;
                                }
                                G.T(org.telegram.ui.ActionBar.i6.l1(0.06f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, d6Var)));
                                G.Q(cVar, eh.b.k(d6Var), false);
                                G.Y();
                                ViewGroup viewGroup3 = G.A;
                                ee1Var.S = viewGroup3;
                                viewGroup3.setPivotX(0.0f);
                                ee1Var.S.setPivotY(0.0f);
                                ViewGroup viewGroup4 = ee1Var.S;
                                FrameLayout.LayoutParams e7 = w7.z5.e(-2, -2, 51);
                                be1 be1Var6 = ee1Var.d;
                                be1Var6.addView(viewGroup4, e7);
                                viewGroup = ee1Var.S;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new jl0(ee1Var, 22));
                                    ee1Var.S.setOnTouchListener(new e0(ee1Var, 7));
                                }
                                if (z14) {
                                    yn ynVar3 = ynVar;
                                    org.telegram.ui.Components.sk0 sk0Var = new org.telegram.ui.Components.sk0((ynVar.getUserConfig().getClientUserId() > ynVar.a() ? 1 : (ynVar.getUserConfig().getClientUserId() == ynVar.a() ? 0 : -1)) == 0 ? 3 : 0, ynVar3.getCurrentAccount(), ee1Var.getContext(), ynVar3, ee1Var.a);
                                    sk0Var.a = true;
                                    float f7 = 22;
                                    sk0Var.setPadding(AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : 24), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 24 : 0), AndroidUtilities.dp(f7));
                                    sk0Var.setDelegate(new ae1(ee1Var, ynVar3, messageObject4, sk0Var));
                                    ee1Var.P = sk0Var;
                                    be1Var6.addView(sk0Var, w7.z5.e(-2, (int) ((sk0Var.getTopOffset() / AndroidUtilities.density) + 52.0f + f7), 51));
                                    sk0Var.p(messageObject4, ynVar3.X7, true);
                                    ee1Var.P.setTransitionProgress(1.0f);
                                }
                                ee1Var.e();
                                ee1Var.c0 = new um(this, 5);
                                ee1Var.show();
                                return true;
                            }
                        } else {
                            di0 di0Var = new di0(ee1Var2.getContext(), ynVar2.getCurrentAccount(), messageObject2, ynVar2.e);
                            FrameLayout frameLayout = new FrameLayout(ee1Var2.getContext());
                            frameLayout.addView(di0Var, w7.z5.c(36.0f, -1));
                            org.telegram.ui.Components.b80 J = G.J();
                            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, ee1Var2.getContext(), ee1Var2.a, true, false);
                            f1Var.setItemHeight(44);
                            f1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                            f1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                            FrameLayout frameLayout2 = new FrameLayout(ee1Var2.getContext());
                            LinearLayout linearLayout = new LinearLayout(ee1Var2.getContext());
                            linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, d6Var));
                            linearLayout.setOrientation(1);
                            ynVar = ynVar2;
                            org.telegram.ui.Components.zl0 a2 = di0Var.a();
                            frameLayout2.addView(f1Var);
                            linearLayout.addView(frameLayout2);
                            z14 = z16;
                            linearLayout.addView(new org.telegram.ui.ActionBar.k1(ee1Var2.getContext(), d6Var), w7.z5.n(-1, 8));
                            frameLayout2.setOnClickListener(new yd1(G));
                            messageObject3 = messageObject2;
                            xeVar = xeVar2;
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            zd1 zd1Var = new zd1(ee1Var2, di0Var, ynVar, a2, linearLayout, G, J);
                            G = G;
                            ee1Var = ee1Var2;
                            di0Var.setOnClickListener(zd1Var);
                            linearLayout.addView(a2, w7.z5.n(-1, -2));
                            J.q(linearLayout);
                            G.q(frameLayout);
                            G.k();
                            arrayList3 = arrayList6;
                        }
                        messageObject4 = messageObject3;
                        i11 = 0;
                        while (i11 < size) {
                        }
                        G.T(org.telegram.ui.ActionBar.i6.l1(0.06f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, d6Var)));
                        G.Q(cVar, eh.b.k(d6Var), false);
                        G.Y();
                        ViewGroup viewGroup32 = G.A;
                        ee1Var.S = viewGroup32;
                        viewGroup32.setPivotX(0.0f);
                        ee1Var.S.setPivotY(0.0f);
                        ViewGroup viewGroup42 = ee1Var.S;
                        FrameLayout.LayoutParams e72 = w7.z5.e(-2, -2, 51);
                        be1 be1Var62 = ee1Var.d;
                        be1Var62.addView(viewGroup42, e72);
                        viewGroup = ee1Var.S;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z14) {
                        }
                        ee1Var.e();
                        ee1Var.c0 = new um(this, 5);
                        ee1Var.show();
                        return true;
                    }
                }
                z13 = false;
                TLRPC.User user32 = ynVar2.f;
                if (user32 == null) {
                }
                org.telegram.ui.Components.b80 G2 = org.telegram.ui.Components.b80.G(ee1Var2.c, ynVar2.getResourceProvider(), null, !z10 || z12);
                if (z12) {
                }
                messageObject4 = messageObject3;
                i11 = 0;
                while (i11 < size) {
                }
                G2.T(org.telegram.ui.ActionBar.i6.l1(0.06f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, d6Var)));
                G2.Q(cVar, eh.b.k(d6Var), false);
                G2.Y();
                ViewGroup viewGroup322 = G2.A;
                ee1Var.S = viewGroup322;
                viewGroup322.setPivotX(0.0f);
                ee1Var.S.setPivotY(0.0f);
                ViewGroup viewGroup422 = ee1Var.S;
                FrameLayout.LayoutParams e722 = w7.z5.e(-2, -2, 51);
                be1 be1Var622 = ee1Var.d;
                be1Var622.addView(viewGroup422, e722);
                viewGroup = ee1Var.S;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z14) {
                }
                ee1Var.e();
                ee1Var.c0 = new um(this, 5);
                ee1Var.show();
                return true;
            }
        }
        i10 = 51;
        F.T(org.telegram.ui.ActionBar.i6.l1(0.06f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, d6Var)));
        dh.e k102 = eh.b.k(d6Var);
        ah.c cVar2 = ee1Var2.F;
        F.Q(cVar2, k102, false);
        F.Y();
        ViewGroup viewGroup22 = F.A;
        ee1Var2.Q = viewGroup22;
        viewGroup22.setPivotX(0.0f);
        ee1Var2.Q.setPivotY(0.0f);
        be1Var3.addView(ee1Var2.Q, w7.z5.e(-2, -2, i10));
        ArrayList arrayList42 = new ArrayList();
        ArrayList arrayList52 = new ArrayList();
        ArrayList arrayList62 = new ArrayList();
        ynVar2.n8(messageObject, arrayList42, arrayList52, arrayList62);
        xe xeVar22 = new xe(ynVar2, 10);
        messageObject2 = ee1Var2.G;
        List<TLRPC.TL_availableReaction> enabledReactionsList2 = ynVar2.getMediaDataController().getEnabledReactionsList();
        if (ynVar2.v()) {
        }
        if (messageObject2.isForwardedChannelPost()) {
        }
        boolean z162 = z11;
        if (!z10) {
        }
        if (ynVar2.e != null) {
            int i182 = ((-ynVar2.e.linked_monoforum_id) > messageObject2.getFromChatId() ? 1 : ((-ynVar2.e.linked_monoforum_id) == messageObject2.getFromChatId() ? 0 : -1));
        }
        if (!z10) {
            user2 = ynVar2.f;
            if (!user2.bot) {
                z13 = true;
                TLRPC.User user322 = ynVar2.f;
                if (user322 == null) {
                }
                org.telegram.ui.Components.b80 G22 = org.telegram.ui.Components.b80.G(ee1Var2.c, ynVar2.getResourceProvider(), null, !z10 || z12);
                if (z12) {
                }
                messageObject4 = messageObject3;
                i11 = 0;
                while (i11 < size) {
                }
                G22.T(org.telegram.ui.ActionBar.i6.l1(0.06f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, d6Var)));
                G22.Q(cVar2, eh.b.k(d6Var), false);
                G22.Y();
                ViewGroup viewGroup3222 = G22.A;
                ee1Var.S = viewGroup3222;
                viewGroup3222.setPivotX(0.0f);
                ee1Var.S.setPivotY(0.0f);
                ViewGroup viewGroup4222 = ee1Var.S;
                FrameLayout.LayoutParams e7222 = w7.z5.e(-2, -2, 51);
                be1 be1Var6222 = ee1Var.d;
                be1Var6222.addView(viewGroup4222, e7222);
                viewGroup = ee1Var.S;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z14) {
                }
                ee1Var.e();
                ee1Var.c0 = new um(this, 5);
                ee1Var.show();
                return true;
            }
        }
        z13 = false;
        TLRPC.User user3222 = ynVar2.f;
        if (user3222 == null) {
        }
        org.telegram.ui.Components.b80 G222 = org.telegram.ui.Components.b80.G(ee1Var2.c, ynVar2.getResourceProvider(), null, !z10 || z12);
        if (z12) {
        }
        messageObject4 = messageObject3;
        i11 = 0;
        while (i11 < size) {
        }
        G222.T(org.telegram.ui.ActionBar.i6.l1(0.06f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, d6Var)));
        G222.Q(cVar2, eh.b.k(d6Var), false);
        G222.Y();
        ViewGroup viewGroup32222 = G222.A;
        ee1Var.S = viewGroup32222;
        viewGroup32222.setPivotX(0.0f);
        ee1Var.S.setPivotY(0.0f);
        ViewGroup viewGroup42222 = ee1Var.S;
        FrameLayout.LayoutParams e72222 = w7.z5.e(-2, -2, 51);
        be1 be1Var62222 = ee1Var.d;
        be1Var62222.addView(viewGroup42222, e72222);
        viewGroup = ee1Var.S;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
        }
        if (z14) {
        }
        ee1Var.e();
        ee1Var.c0 = new um(this, 5);
        ee1Var.show();
        return true;
    }

    public final void d(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var;
        TLRPC.User currentUser = u1Var.getCurrentUser();
        yn ynVar = this.a;
        ynVar.getUserConfig().getCurrentUser();
        if (!AndroidUtilities.isContextSafe(ynVar.getParentActivity()) || (chat = ynVar.e) == null || currentUser == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return;
        }
        boolean z13 = true;
        boolean z14 = false;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                z10 = false;
                z14 = true;
            } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                z10 = channelParticipant.promoted_by == ynVar.getUserConfig().getClientUserId();
            } else {
                z10 = false;
                z13 = false;
            }
            str = channelParticipant.rank;
        } else {
            if (tLObject instanceof TLRPC.TL_chatChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = ((TLRPC.TL_chatChannelParticipant) tLObject).channelParticipant;
                if (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator) {
                    z11 = false;
                    z14 = true;
                } else if (channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) {
                    z11 = channelParticipant2.promoted_by == ynVar.getUserConfig().getClientUserId();
                } else {
                    z11 = false;
                    z13 = false;
                }
                str2 = channelParticipant2.rank;
                z12 = z11;
                boolean z15 = z13;
                boolean z16 = z14;
                Activity parentActivity = ynVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                long j3 = -ynVar.e.id;
                d6Var = ((org.telegram.ui.ActionBar.n2) ynVar).resourceProvider;
                org.telegram.ui.Components.x01.b(parentActivity, i10, j3, currentUser, str2, z15, z16, z12, d6Var);
            }
            if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                if (ChatObject.isChannel(ynVar.e)) {
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                    ynVar.getMessagesController();
                    tL_channels_getParticipant.channel = MessagesController.getInputChannel(ynVar.e);
                    tL_channels_getParticipant.participant = ynVar.getMessagesController().getInputPeer(currentUser.id);
                    ynVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new org.telegram.messenger.a(), new ai.m0(7, this, u1Var));
                    return;
                }
                return;
            }
            if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                z10 = false;
                z14 = true;
            } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                z10 = ((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == ynVar.getUserConfig().getClientUserId();
            } else {
                z10 = false;
                z13 = false;
            }
            str = ((TLRPC.ChatParticipant) tLObject).rank;
        }
        z12 = z10;
        str2 = str;
        boolean z152 = z13;
        boolean z162 = z14;
        Activity parentActivity2 = ynVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
        long j32 = -ynVar.e.id;
        d6Var = ((org.telegram.ui.ActionBar.n2) ynVar).resourceProvider;
        org.telegram.ui.Components.x01.b(parentActivity2, i10, j32, currentUser, str2, z152, z162, z12, d6Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean e() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z10;
        yn ynVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
        if (kVar == null) {
            return false;
        }
        kVar2 = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
        if (kVar2.s() || ynVar.z9()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.n2) ynVar).inPreviewMode;
        return !z10;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void e0(int i10) {
        int i11;
        SpannableStringBuilder replaceTags;
        int i12;
        int i13 = 3;
        int i14 = 2;
        int i15 = 1;
        yn ynVar = this.a;
        try {
            if (i10 == 0) {
                ynVar.h7();
                fl flVar = ynVar.x3;
                if (flVar == null) {
                    return;
                }
                flVar.l(0L, 84, null, new um(this, i15));
                ynVar.x3.performHapticFeedback(3, 2);
                return;
            }
            if (i10 == 1) {
                String formatDateTime = LocaleController.formatDateTime(ynVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                if (ynVar.getMessagesController().transcribeAudioTrialCooldownUntil > 0) {
                    i12 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeftUntil", org.telegram.ui.Components.d41.h(i12), formatDateTime));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeft", org.telegram.ui.Components.d41.h(i11), new Object[0]));
                }
                org.telegram.ui.Components.yc.a0(ynVar).G(R.raw.transcribe, 6, replaceTags).k(true);
                ynVar.fragmentView.performHapticFeedback(3, 2);
                return;
            }
            if (i10 == 2 || i10 == 3) {
                String formatDateTime2 = LocaleController.formatDateTime(ynVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(ynVar);
                int i16 = R.raw.transcribe;
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialEnd", ynVar.getMessagesController().transcribeAudioTrialWeeklyNumber, new Object[0]))).append((CharSequence) " ").append(i10 == 2 ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TranscriptionTrialEndBuy), new um(this, i14)) : ynVar.getMessagesController().transcribeAudioTrialCooldownUntil <= 0 ? "" : AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TranscriptionTrialEndWaitOrBuy, formatDateTime2), new um(this, i13)));
                a02.getClass();
                org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(a02.W(), a02.c);
                zbVar.c(i16, 36, 36, new String[0]);
                if (append != null) {
                    String charSequence = append.toString();
                    int i17 = 0;
                    for (int indexOf = charSequence.indexOf(10); indexOf >= 0 && indexOf < append.length(); indexOf = charSequence.indexOf(10, indexOf + 1)) {
                        if (i17 >= 6) {
                            append.replace(indexOf, indexOf + 1, (CharSequence) " ");
                        }
                        i17++;
                    }
                }
                zbVar.b.setText(append);
                zbVar.b.setSingleLine(false);
                zbVar.b.setMaxLines(6);
                a02.b(zbVar, 7000).k(true);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void e2(org.telegram.ui.Cells.u1 u1Var) {
        TLRPC.Chat chat;
        TLRPC.User currentUser = u1Var.getCurrentUser();
        yn ynVar = this.a;
        if (!AndroidUtilities.isContextSafe(ynVar.getParentActivity()) || (chat = ynVar.e) == null || currentUser == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return;
        }
        d(u1Var, ynVar.getMessagesController().getParticipant(ynVar.e.id, currentUser.id));
    }

    public final void f() {
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        boolean isHuaweiStoreApp = BuildVars.isHuaweiStoreApp();
        yn ynVar = this.a;
        if (isHuaweiStoreApp) {
            nf.f.s(ynVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            nf.f.s(ynVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean f0() {
        return this.a.P3 == 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void g0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        this.a.I7(u1Var, true, false, f7, f10, false, false, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void g2(org.telegram.ui.Cells.u1 u1Var, long j3) {
        Bundle f7 = sa.e.f(j3, "user_id");
        org.telegram.ui.ActionBar.n2 n2Var = this.a;
        if (n2Var.getMessagesController().checkCanOpenChat(f7, n2Var, u1Var.getMessageObject())) {
            n2Var.presentFragment(new yn(f7));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final String h(org.telegram.ui.Cells.u1 u1Var) {
        yn ynVar;
        int i10;
        if (u1Var.getMessageObject() == null || (i10 = (ynVar = this.a).tb) == 0 || i10 != u1Var.getMessageObject().getId() || ynVar.ub != 3) {
            return null;
        }
        return ynVar.wb;
    }

    @Override // org.telegram.ui.Cells.l1
    public final int h0(org.telegram.ui.Cells.u1 u1Var) {
        qh.c cVar;
        yn ynVar = this.a;
        if (!ynVar.tc.f || (cVar = ynVar.zc) == null || cVar.n != u1Var || cVar.a.getWidth() <= 0) {
            return 0;
        }
        return ynVar.zc.a.getHeight();
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean h1(MessageObject messageObject) {
        jm jmVar;
        long dialogId = messageObject.getDialogId();
        yn ynVar = this.a;
        return (dialogId == UserObject.REPLY_BOT || ((jmVar = ynVar.y0) != null && jmVar.N)) && ynVar.P3 != 7;
    }

    public final void i(org.telegram.ui.Cells.u1 u1Var, boolean z10, boolean z11, boolean z12) {
        MessageObject primaryMessageObject;
        int i10;
        int i11;
        vj vjVar;
        if (u1Var == null || (primaryMessageObject = u1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.forceUpdate = true;
        yn ynVar = this.a;
        sj sjVar = ynVar.v0;
        if (sjVar != null && (vjVar = ynVar.x0) != null && vjVar.y < 0) {
            for (int childCount = sjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = ynVar.v0.getChildAt(childCount);
                ynVar.v0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.u1)) {
                        if (childAt instanceof org.telegram.ui.Cells.w0) {
                            i11 = ynVar.M8(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = ynVar.M8(childAt);
                            break;
                        }
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        if (z10 && i10 >= 0 && u1Var.getCurrentMessagesGroup() == null) {
            if (z12) {
                vj vjVar2 = ynVar.x0;
                ynVar.v0.getClass();
                vjVar2.i1(RecyclerView.R(u1Var), u1Var.getTop() - ((int) ynVar.q9), false);
            } else {
                ynVar.x0.h1(i10, i11);
            }
        }
        ynVar.L0 = z11;
        ynVar.qc(primaryMessageObject, false);
        ynVar.L0 = false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void i0(org.telegram.ui.Cells.u1 u1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        yn ynVar = this.a;
        if (ynVar.getParentActivity() == null) {
            return;
        }
        if (ynVar.V9 == null) {
            uh.i iVar = new uh.i(ynVar.getParentActivity());
            ynVar.V9 = iVar;
            ynVar.V0.addView(iVar, w7.z5.e(-1, -1, 48));
        }
        uh.i iVar2 = ynVar.V9;
        HashMap hashMap = iVar2.a;
        ArrayList arrayList = iVar2.c;
        arrayList.clear();
        int i10 = iVar2.d;
        UserConfig userConfig = UserConfig.getInstance(i10);
        long j3 = userConfig.clientUserId;
        arrayList.add(Long.valueOf(j3));
        if (userConfig.suggestContacts) {
            ArrayList<TLRPC.TL_topPeer> arrayList2 = MediaDataController.getInstance(i10).hints;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                TLRPC.TL_topPeer tL_topPeer = arrayList2.get(i11);
                i11++;
                TLRPC.TL_topPeer tL_topPeer2 = tL_topPeer;
                long j10 = tL_topPeer2.peer.user_id;
                if (j10 != 0) {
                    int i12 = size;
                    if (MessagesController.getInstance(i10).getUser(Long.valueOf(tL_topPeer2.peer.user_id)) != null) {
                        arrayList.add(Long.valueOf(j10));
                    }
                    size = i12;
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(i10).getAllDialogs();
        for (int i13 = 0; i13 < allDialogs.size(); i13++) {
            TLRPC.Dialog dialog = allDialogs.get(i13);
            if (dialog instanceof TLRPC.TL_dialog) {
                long j11 = dialog.id;
                if (j11 != j3 && !DialogObject.isEncryptedDialog(j11)) {
                    if (DialogObject.isUserDialog(dialog.id)) {
                        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(dialog.id));
                        if (user != null && !UserObject.isBot(user) && !UserObject.isDeleted(user) && !UserObject.isService(user.id)) {
                            if (dialog.folder_id == 1) {
                                arrayList3.add(Long.valueOf(dialog.id));
                            } else {
                                arrayList.add(Long.valueOf(dialog.id));
                            }
                        }
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-dialog.id));
                        if (chat != null && !chat.forum && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                            if (dialog.folder_id == 1) {
                                arrayList3.add(Long.valueOf(dialog.id));
                            } else {
                                arrayList.add(Long.valueOf(dialog.id));
                            }
                        }
                    }
                }
            }
        }
        arrayList.addAll(arrayList3);
        String b10 = uh.i.b(u1Var);
        if (b10 == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj = arrayList.get(i14);
            i14++;
            Long l4 = (Long) obj;
            if (hashSet.add(l4) && DialogObject.isUserDialog(l4.longValue())) {
                arrayList4.add(l4);
            }
        }
        uh.h hVar = new uh.h(iVar2, u1Var, arrayList4, new u2.i0(6, iVar2, b10));
        hVar.setBounds(0, 0, iVar2.getMeasuredWidth(), iVar2.getMeasuredHeight());
        hVar.setCallback(iVar2);
        if (hashMap.containsKey(b10)) {
            return;
        }
        hashMap.put(b10, hVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void j(org.telegram.ui.Cells.u1 u1Var, bi.f fVar) {
        TLRPC.Message message;
        if (u1Var == null) {
            fVar.run();
            return;
        }
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject == null || ((messageObject.isSending() && !messageObject.isEditing()) || (message = messageObject.messageOwner) == null || message.rich_message == null)) {
            fVar.run();
        } else {
            org.telegram.ui.ActionBar.n2 n2Var = this.a;
            n2Var.getSendMessagesHelper().editRichMessage(messageObject, messageObject.messageOwner.rich_message, null, n2Var, true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void k(org.telegram.ui.Cells.u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        int a2 = qh.i.a(messageObject);
        boolean a10 = w7.e0.a(a2, 7);
        yn ynVar = this.a;
        if (a10) {
            org.telegram.ui.Components.yc.a0(ynVar).Q(R.raw.e_hand_2, 36, qh.i.b(messageObject, a2)).j();
            return;
        }
        if (i10 < 0 && !arrayList.isEmpty()) {
            ynVar.getSendMessagesHelper().sendVote(messageObject, arrayList, null);
            u1Var.S0(true);
            return;
        }
        if (ynVar.getParentActivity() == null) {
            return;
        }
        if (ynVar.l2 == null) {
            org.telegram.ui.Components.m40 m40Var = new org.telegram.ui.Components.m40(5, ynVar.getParentActivity(), ynVar.ca, false);
            ynVar.l2 = m40Var;
            m40Var.setAlpha(0.0f);
            ynVar.l2.setVisibility(4);
            int indexOfChild = ynVar.V0.indexOfChild(ynVar.Q);
            if (indexOfChild == -1) {
                return;
            } else {
                ynVar.V0.addView(ynVar.l2, indexOfChild + 1, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            }
        }
        if (!arrayList.isEmpty() || i10 >= 0) {
            i13 = i12;
            i14 = i11;
        } else {
            ArrayList<org.telegram.ui.Cells.s1> pollButtons = u1Var.getPollButtons();
            int size = pollButtons.size();
            int i16 = 0;
            float f7 = 0.0f;
            while (true) {
                if (i16 >= size) {
                    i13 = i12;
                    i15 = i11;
                    break;
                }
                org.telegram.ui.Cells.s1 s1Var = pollButtons.get(i16);
                float y3 = ((u1Var.getY() + s1Var.b) - AndroidUtilities.dp(4.0f)) - ynVar.q9;
                ynVar.o2 = AndroidUtilities.dp(13.3f) + s1Var.a;
                int D = org.telegram.messenger.bi.D(6.0f, s1Var.b, i12);
                ynVar.p2 = D;
                if (y3 > 0.0f) {
                    i15 = ynVar.o2;
                    i13 = D;
                    f7 = 0.0f;
                    break;
                }
                i16++;
                f7 = y3;
            }
            if (f7 != 0.0f) {
                ynVar.v0.w0(0, (int) f7, null);
                ynVar.n2 = u1Var;
                return;
            }
            i14 = i15;
        }
        ynVar.l2.e(u1Var, Integer.valueOf(i10), i14, i13, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void k1() {
        yn ynVar = this.a;
        ynVar.Q7();
        UndoView undoView = ynVar.w3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, ynVar.R5, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void l() {
        f();
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean l0() {
        boolean z10;
        yn ynVar = this.a;
        if (ynVar.z9()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.n2) ynVar).inPreviewMode;
        return !z10;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean l2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
        MessageObject messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (u1Var == null || pageBlock == null) {
            return false;
        }
        yn ynVar = this.a;
        if (ynVar.getParentActivity() == null || (messageObject = u1Var.getMessageObject()) == null || (message = messageObject.messageOwner) == null || messageObject.richLayout == null || (richMessage = message.rich_message) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        messageObject.richLayout.collectMediaBlocks(arrayList);
        int indexOf = arrayList.indexOf(pageBlock);
        if (indexOf < 0) {
            return false;
        }
        PhotoViewer t12 = PhotoViewer.t1();
        t12.K2(null, ynVar, null);
        return t12.f2(null, null, null, null, null, null, null, indexOf, new tm(ynVar, arrayList), null, 0L, 0L, 0L, true, new sm(richMessage, arrayList, messageObject), null);
    }

    public final boolean m() {
        yn ynVar = this.a;
        if (UserObject.isUserSelf(ynVar.f)) {
            return true;
        }
        TLRPC.Chat chat = ynVar.e;
        if (chat != null) {
            return !ChatObject.isChannel(chat) || ynVar.e.megagroup;
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void m1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        yn ynVar = this.a;
        if (ynVar.y9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        if (ynVar.getParentActivity() != null) {
            if (ynVar.M0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                jk jkVar = ynVar.W;
                MessageObject messageObject = u1Var.getMessageObject();
                MessageObject messageObject2 = u1Var.getMessageObject();
                xi xiVar = null;
                String str = tL_inlineButtonTypeUrl != null ? tL_inlineButtonTypeUrl.url : null;
                nf.e eVar = ynVar.xb;
                if (eVar != null) {
                    eVar.a(true);
                    ynVar.xb = null;
                }
                if (str == null || u1Var.getMessageObject() == null) {
                    ynVar.xb = null;
                } else {
                    xi xiVar2 = new xi(ynVar, u1Var.getMessageObject().getId(), str, u1Var, 1);
                    ynVar.xb = xiVar2;
                    xiVar = xiVar2;
                }
                jkVar.c0(keyboardButtonProto, messageObject, messageObject2, xiVar);
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void m2(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject primaryMessageObject = u1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.a.qc(primaryMessageObject, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void n(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11;
        TLRPC.Document document;
        int i12;
        TLRPC.PollResults pollResults;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document2;
        int i13;
        TLRPC.Document document3;
        int i14;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        MessageObject messageObject = u1Var.getMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if (messageMedia == null || messageObject == null || !(media instanceof TLRPC.TL_messageMediaPoll)) {
            return;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media;
        TLRPC.WebPage webPage = messageMedia.webpage;
        if (webPage != null) {
            N1(u1Var, webPage, webPage.url, messageMedia.safe);
            return;
        }
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        yn ynVar = this.a;
        if (geoPoint != null) {
            if (AndroidUtilities.isMapsInstalled(ynVar)) {
                hn hnVar = new hn(3);
                d6Var2 = ((org.telegram.ui.ActionBar.n2) ynVar).resourceProvider;
                hnVar.setResourceProvider(d6Var2);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = ynVar.getMessagesController().getPeer(ynVar.a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                tL_messageMediaGeo.geo = messageMedia.geo;
                String str = messageMedia.address;
                if (str == null) {
                    str = (pollAnswer == null || (tL_textWithEntities = pollAnswer.text) == null) ? "" : tL_textWithEntities.text;
                }
                tL_messageMediaGeo.address = str;
                tL_message.media = tL_messageMediaGeo;
                hnVar.O0 = false;
                hnVar.u0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                ynVar.presentFragment(hnVar);
                return;
            }
            return;
        }
        if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
            rt.q().w(ynVar.getParentActivity());
            rt.q().v(new in(this, tL_messageMediaPoll, pollAnswer, u1Var));
            rt q6 = rt.q();
            TLRPC.Document document4 = messageMedia.document;
            int i18 = MessageObject.isAnimatedEmoji(document4) ? 2 : 0;
            MessageObject messageObject2 = u1Var.getMessageObject();
            d6Var = ((org.telegram.ui.ActionBar.n2) ynVar).resourceProvider;
            q6.t(document4, null, "", null, null, i18, false, messageObject2, d6Var, 200);
            return;
        }
        if (MessageObject.isMusicDocument(messageMedia.document)) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (MediaController.getInstance().isPlayingMessage(messageObject) && playingMessageObject != null) {
                if (playingMessageObject.isPlayingExplanationObject == (i10 == -3)) {
                    if (MediaController.getInstance().isMessagePaused()) {
                        MediaController.getInstance().playMessage(playingMessageObject);
                        return;
                    } else {
                        MediaController.getInstance().lambda$startAudioAgain$7(playingMessageObject);
                        return;
                    }
                }
            }
            TLRPC.Message message = messageObject.messageOwner;
            TLRPC.TL_message C7 = yn.C7(message);
            C7.media = messageMedia;
            C7.attachPath = qh.f.c(message, i10);
            ArrayList<MessageObject> arrayList = new ArrayList<>();
            i17 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
            MessageObject messageObject3 = new MessageObject(i17, C7, false, true);
            messageObject3.isPlayingExplanationObject = i10 == -3;
            arrayList.add(messageObject3);
            if (MediaController.getInstance().isPlayingMessage(messageObject)) {
                MediaController.getInstance().cleanupPlayer(false, true);
            }
            MediaController.getInstance().setPlaylist(arrayList, messageObject3, 0L);
            return;
        }
        TLRPC.Document document5 = messageMedia.document;
        if (document5 != null && !MessageObject.isVideoDocument(document5)) {
            i15 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
            TLRPC.Document document6 = messageMedia.document;
            qh.a aVar = new qh.a(i15, messageObject, document6, qh.f.c(messageObject.messageOwner, i10));
            if (aVar.g) {
                FileLoader.getInstance(i15).cancelLoadFile(document6);
                aVar.a();
                MessageObject messageObject4 = u1Var.y7;
                if (messageObject4 == null || !messageObject4.isPoll()) {
                    return;
                }
                qh.g gVar = u1Var.c6;
                if (gVar != null) {
                    gVar.e();
                }
                qh.g gVar2 = u1Var.b6;
                if (gVar2 != null) {
                    gVar2.e();
                    return;
                }
                return;
            }
            if (!aVar.f) {
                FileLoader.getInstance(i15).loadFile(document6, messageObject, 2, 0);
                aVar.a();
                MessageObject messageObject5 = u1Var.y7;
                if (messageObject5 == null || !messageObject5.isPoll()) {
                    return;
                }
                qh.g gVar3 = u1Var.c6;
                if (gVar3 != null) {
                    gVar3.e();
                }
                qh.g gVar4 = u1Var.b6;
                if (gVar4 != null) {
                    gVar4.e();
                    return;
                }
                return;
            }
            TLRPC.Message message2 = messageObject.messageOwner;
            TLRPC.TL_message C72 = yn.C7(message2);
            C72.media = messageMedia;
            C72.attachPath = qh.f.c(message2, i10);
            i16 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
            jn jnVar = new jn(i16, C72, false, true);
            if (MessageObject.canPreviewDocument(messageMedia.document)) {
                PhotoViewer.t1().K2(null, ynVar, ynVar.ca);
                PhotoViewer t12 = PhotoViewer.t1();
                int i19 = jnVar.type;
                t12.d2(jnVar, ynVar, i19 != 0 ? ynVar.R5 : 0L, i19 != 0 ? ynVar.J6 : 0L, i19 != 0 ? ynVar.d() : 0L, ynVar.Da);
                return;
            }
            try {
                AndroidUtilities.openForView(jnVar, ynVar.getParentActivity(), ynVar.ca, false);
                return;
            } catch (Exception e7) {
                FileLog.e(e7);
                ynVar.z6(jnVar);
                return;
            }
        }
        TLRPC.Message message3 = messageObject.messageOwner;
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
        if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || MessageObject.isVideoDocument(document3))) {
            i11 = messageMedia3 == messageMedia ? arrayList3.size() : -1;
            TLRPC.TL_message C73 = yn.C7(message3);
            C73.media = messageMedia3;
            C73.attachPath = qh.f.c(message3, -2);
            i14 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
            arrayList3.add(new zm(i14, C73, false, true));
            arrayList2.add(-2);
        } else {
            i11 = -1;
        }
        if (messageObject.expandedExplanation && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || MessageObject.isVideoDocument(document2))) {
            if (messageMedia2 == messageMedia) {
                i11 = arrayList3.size();
            }
            TLRPC.TL_message C74 = yn.C7(message3);
            C74.media = messageMedia2;
            C74.attachPath = qh.f.c(message3, -3);
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            C74.message = pollResults2.solution;
            C74.entities = pollResults2.solution_entities;
            i13 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
            arrayList3.add(new an(i13, C74, false, true));
            arrayList2.add(-3);
        }
        zf.d.b(tL_messageMediaPoll.poll, ynVar.getUserConfig().getClientUserId());
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        ArrayList<TLRPC.PollAnswer> arrayList4 = poll.shuffled_answers;
        if (arrayList4 == null) {
            arrayList4 = poll.answers;
        }
        for (int i20 = 0; i20 < arrayList4.size(); i20++) {
            TLRPC.PollAnswer pollAnswer2 = arrayList4.get(i20);
            TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
            if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || MessageObject.isVideoDocument(document))) {
                if (pollAnswer2.unshuffled_index == i10) {
                    i11 = arrayList3.size();
                }
                TLRPC.TL_message C75 = yn.C7(message3);
                C75.media = messageMedia4;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                C75.message = tL_textWithEntities2.text;
                C75.entities = tL_textWithEntities2.entities;
                C75.attachPath = qh.f.c(message3, pollAnswer2.unshuffled_index);
                i12 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                arrayList3.add(new bn(i12, C75, false, true));
                arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
            }
        }
        if (i11 <= -1 || arrayList3.isEmpty()) {
            return;
        }
        messageObject.pollMediaMapping = arrayList2;
        PhotoViewer.t1().K2(null, ynVar, ynVar.ca);
        PhotoViewer.t1().b2(arrayList3, i11, ynVar.a(), 0L, 0L, ynVar.Ea);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void n0(String str) {
        yn ynVar = this.a;
        ok okVar = ynVar.M0;
        if (okVar == null || okVar.getVisibility() != 0) {
            nk nkVar = ynVar.P;
            if ((nkVar == null || nkVar.getVisibility() != 0) && ynVar.W != null && str != null && str.length() > 0) {
                ynVar.W.setFieldText("@" + str + " ");
                ynVar.W.H0();
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void o(org.telegram.ui.Cells.u1 u1Var) {
        if (u1Var.getMessageObject().isImportedForward()) {
            k1();
            return;
        }
        yn ynVar = this.a;
        if (ynVar.j3 || ynVar.v0 == null || ynVar.getParentActivity() == null || ynVar.fragmentView == null) {
            return;
        }
        if (ynVar.s2 == null) {
            qm qmVar = ynVar.V0;
            int indexOfChild = qmVar.indexOfChild(ynVar.Q);
            if (indexOfChild == -1) {
                return;
            }
            org.telegram.ui.Components.m40 m40Var = new org.telegram.ui.Components.m40(1, ynVar.getParentActivity(), ynVar.ca, false);
            ynVar.s2 = m40Var;
            qmVar.addView(m40Var, indexOfChild + 1, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            ynVar.s2.setAlpha(0.0f);
            ynVar.s2.setVisibility(4);
        }
        ynVar.s2.e(u1Var, null, 0, 0, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean o0(org.telegram.ui.Components.z5 z5Var) {
        TLRPC.InputStickerSet inputStickerSet;
        int i10;
        yn ynVar = this.a;
        if (ynVar.getMessagesController().premiumFeaturesBlocked() || z5Var == null || z5Var.standard) {
            return false;
        }
        long documentId = z5Var.getDocumentId();
        TLRPC.Document document = z5Var.document;
        if (document == null) {
            i10 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
            document = org.telegram.ui.Components.q5.f(i10, documentId);
        }
        if (document == null || (inputStickerSet = MessageObject.getInputStickerSet(document)) == null) {
            return false;
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, true);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(inputStickerSet);
        org.telegram.ui.Components.wv wvVar = new org.telegram.ui.Components.wv(ynVar, ynVar.getParentActivity(), ynVar.ca, arrayList);
        org.telegram.ui.Components.mv mvVar = wvVar.f;
        mvVar.getClass();
        ImageReceiver imageReceiver = new ImageReceiver(mvVar);
        mvVar.v = imageReceiver;
        if (mvVar.d) {
            imageReceiver.onAttachedToWindow();
        }
        mvVar.w = true;
        mvVar.x.d(1.0f, true);
        mvVar.v.setImage(ImageLocation.getForDocument(document), "140_140", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "140_140", DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.i6.m6, 0.2f, true), 0L, null, null, 0);
        mvVar.v.setLayerNum(7);
        mvVar.v.setAllowStartLottieAnimation(true);
        mvVar.v.setAllowStartAnimation(true);
        mvVar.v.setAutoRepeat(1);
        mvVar.v.setAllowDecodeSingleFrame(true);
        mvVar.v.setParentView(mvVar);
        wvVar.setCalcMandatoryInsets(ynVar.w9());
        ynVar.showDialog(wvVar);
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void p() {
        this.a.V0.getClass();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void p1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
        if (u1Var == null || document == null) {
            return;
        }
        yn ynVar = this.a;
        if (ynVar.getParentLayout() == null || !b0(u1Var)) {
            return;
        }
        org.telegram.ui.Components.b80 H = org.telegram.ui.Components.b80.H(ynVar, u1Var);
        H.c(R.drawable.msg_download, LocaleController.getString(R.string.SaveToDownloads), new r1(this, u1Var, document, 24), false);
        H.t = false;
        H.Z();
    }

    public final void q(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, boolean z10) {
        yn ynVar = this.a;
        TLRPC.Chat chat2 = ynVar.e;
        if (chat2 != null && chat.id == chat2.id) {
            nj njVar = ynVar.Y0;
            if (njVar != null && i10 == 0) {
                njVar.e(false, false);
                return;
            } else {
                if (u1Var.getMessageObject() != null) {
                    ynVar.D(i10, u1Var.getMessageObject().getId(), 0, 0, true, false);
                    return;
                }
                return;
            }
        }
        if (chat2 == null || chat.id != chat2.id || ynVar.E9()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            yi yiVar = null;
            if (z10) {
                nf.e eVar = ynVar.xb;
                if (eVar != null) {
                    eVar.a(true);
                    ynVar.xb = null;
                }
                if (u1Var.getMessageObject() == null) {
                    ynVar.xb = null;
                } else {
                    yi yiVar2 = new yi(ynVar, u1Var.getMessageObject().getId(), u1Var, 0);
                    ynVar.xb = yiVar2;
                    yiVar = yiVar2;
                }
            }
            if (ynVar.getMessagesController().checkCanOpenChat(bundle, ynVar, u1Var.getMessageObject(), yiVar)) {
                yn ynVar2 = new yn(bundle);
                if (yiVar == null || i10 == 0) {
                    ynVar.presentFragment(ynVar2);
                } else {
                    AndroidUtilities.runOnUIThread(new ei.m3(this, yiVar, chat, i10, ynVar2, 17), 5000L);
                    yiVar.d();
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void q0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        yn ynVar = this.a;
        ynVar.I7(u1Var, false, false, f7, f10, true, false, false);
        ynVar.v0.getClass();
        yn.c2(ynVar, RecyclerView.R(u1Var));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void q2() {
        this.a.q9();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0118, code lost:
    
        if (r1.noforwards == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0124, code lost:
    
        if (org.telegram.messenger.ChatObject.isPublic(r1) != false) goto L90;
     */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(org.telegram.ui.Cells.u1 u1Var) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        int i10;
        TLRPC.MessageFwdHeader messageFwdHeader;
        boolean z10;
        int i11;
        TLRPC.Message message2;
        int i12;
        TLRPC.Peer peer;
        MessageObject.GroupedMessages groupedMessages;
        int i13;
        yn ynVar = this.a;
        if (ynVar.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.w31 w31Var = ynVar.P1;
        if (w31Var != null && ynVar.b4 == 0 && (u1Var.T7 || u1Var.U7)) {
            w31Var.m(u1Var.getMessageObject().getTopicId(), true);
            return;
        }
        if (ynVar.getMessagesController().isFrozen()) {
            i13 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
            b.b(i13);
            return;
        }
        jk jkVar = ynVar.W;
        if (jkVar != null) {
            jkVar.N();
        }
        MessageObject messageObject = u1Var.getMessageObject();
        int i14 = ynVar.P3;
        if (i14 == 2) {
            ynVar.T8.S0(messageObject.getId());
            ynVar.finishFragment();
            return;
        }
        if (i14 == 3 || ((i14 == 7 && ynVar.M3 == 2) || !((!UserObject.isReplyUser(ynVar.f) && !UserObject.isUserSelf(ynVar.f)) || (messageFwdHeader = messageObject.messageOwner.fwd_from) == null || messageFwdHeader.saved_from_peer == null))) {
            if (UserObject.isReplyUser(ynVar.f) && (messageReplyHeader = (message = messageObject.messageOwner).reply_to) != null && (i10 = messageReplyHeader.reply_to_top_id) != 0) {
                ynVar.Z9(messageReplyHeader.reply_to_peer_id.channel_id, null, i10, 0L, -1, message.fwd_from.saved_from_msg_id, messageObject);
                return;
            } else if (ynVar.P3 == 7 && ynVar.M3 == 2) {
                ynVar.ea(messageObject);
                return;
            } else {
                ynVar.fa(messageObject);
                return;
            }
        }
        ArrayList<MessageObject> arrayList = (messageObject.getGroupId() == 0 || (groupedMessages = (MessageObject.GroupedMessages) ynVar.v6.f(messageObject.getGroupId())) == null) ? null : groupedMessages.messages;
        if (arrayList == null) {
            arrayList = org.telegram.messenger.q.k(messageObject);
        }
        if (ynVar.getMessagesController().storiesEnabled() && !messageObject.isSponsored() && (((message2 = messageObject.messageOwner) == null || !message2.noforwards) && (i12 = messageObject.type) != 17 && i12 != 12)) {
            long dialogId = messageObject.getDialogId();
            TLRPC.Chat chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-dialogId));
            if (chat == null || !chat.noforwards) {
                if (dialogId >= 0 || !ChatObject.isChannelAndNotMegaGroup(chat)) {
                    TLRPC.MessageFwdHeader messageFwdHeader2 = messageObject.messageOwner.fwd_from;
                    if (messageFwdHeader2 != null && (peer = messageFwdHeader2.from_id) != null && (messageFwdHeader2.flags & 4) != 0) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        TLRPC.Chat chat2 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-peerDialogId));
                        if (peerDialogId < 0) {
                            if (chat2 != null) {
                            }
                            if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            }
                        }
                    }
                }
                z10 = true;
                ynVar.showDialog(new en(this, ynVar.getParentActivity(), ynVar, arrayList, ChatObject.isChannel(ynVar.e), z10, ynVar.ca, z10, messageObject));
                Activity parentActivity = ynVar.getParentActivity();
                i11 = ((org.telegram.ui.ActionBar.n2) ynVar).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
                ynVar.fragmentView.requestLayout();
            }
        }
        z10 = false;
        ynVar.showDialog(new en(this, ynVar.getParentActivity(), ynVar, arrayList, ChatObject.isChannel(ynVar.e), z10, ynVar.ca, z10, messageObject));
        Activity parentActivity2 = ynVar.getParentActivity();
        i11 = ((org.telegram.ui.ActionBar.n2) ynVar).classGuid;
        AndroidUtilities.setAdjustResizeToNothing(parentActivity2, i11);
        ynVar.fragmentView.requestLayout();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void s() {
        this.a.Xb();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void t(org.telegram.ui.Cells.u1 u1Var) {
        int i10;
        int i11;
        vj vjVar;
        MessageObject primaryMessageObject = u1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        primaryMessageObject.factCheckExpanded = !primaryMessageObject.factCheckExpanded;
        primaryMessageObject.forceUpdate = true;
        yn ynVar = this.a;
        sj sjVar = ynVar.v0;
        if (sjVar != null && (vjVar = ynVar.x0) != null && vjVar.y < 0) {
            for (int childCount = sjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = ynVar.v0.getChildAt(childCount);
                ynVar.v0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.u1)) {
                        if (childAt instanceof org.telegram.ui.Cells.w0) {
                            i11 = ynVar.M8(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = ynVar.M8(childAt);
                            break;
                        }
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        ynVar.qc(primaryMessageObject, false);
        ci.e4 e4Var = ynVar.y1;
        if (e4Var != null) {
            e4Var.e(true);
        }
        if (i10 < 0 || u1Var.getCurrentMessagesGroup() != null) {
            return;
        }
        ynVar.x0.h1(i10, i11);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void t0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
        org.telegram.ui.ActionBar.k kVar;
        yn ynVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
        boolean z10 = true;
        if (kVar.s() || ynVar.z9()) {
            yn.b2(ynVar, u1Var, true, f7, f10);
            return;
        }
        if (u1Var.getMessageObject() != null && u1Var.getMessageObject().isSponsored()) {
            P0(10, u1Var);
            return;
        }
        if (!ChatObject.isForum(ynVar.e) && !ynVar.E9()) {
            z10 = false;
        }
        y(user, z10);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void t2(org.telegram.ui.Cells.u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.a.W7(u1Var, reactionCount, z10, f7, f10);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void u(org.telegram.ui.Cells.u1 u1Var) {
        long j3;
        int i10;
        MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
        MessageObject messageObject = (currentMessagesGroup == null || currentMessagesGroup.messages.isEmpty()) ? u1Var.getMessageObject() : currentMessagesGroup.messages.get(0);
        TLRPC.MessageReplies messageReplies = messageObject.messageOwner.replies;
        if (messageReplies != null) {
            int i11 = messageReplies.read_max_id;
            j3 = messageReplies.channel_id;
            i10 = i11;
        } else {
            j3 = 0;
            i10 = -1;
        }
        long j10 = j3;
        yn ynVar = this.a;
        ynVar.Z9(ynVar.e.id, messageObject, messageObject.getId(), j10, i10, 0, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void u1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        uh.h hVar;
        uh.i iVar = this.a.V9;
        if (iVar == null || (hVar = (uh.h) iVar.a.get(uh.i.b(u1Var))) == null) {
            return;
        }
        uh.d[] dVarArr = hVar.w;
        RectF rectF = hVar.r;
        if (hVar.M) {
            float f11 = (f7 - rectF.left) + hVar.U;
            float f12 = (f10 - rectF.top) + hVar.V;
            int i10 = uh.g.a;
            int b10 = (((float) (-AndroidUtilities.dp((float) 37))) >= f12 || f12 >= rectF.height()) ? -1 : w7.q.b((int) Math.floor((f11 - (AndroidUtilities.dp(9) - (AndroidUtilities.dp(11) / 2.0f))) / AndroidUtilities.dp(uh.g.a + 11)), 0, dVarArr.length - 1);
            if (hVar.R == b10) {
                return;
            }
            hVar.a.performHapticFeedback(3, 1);
            hVar.R = b10;
            int i11 = 0;
            while (i11 < dVarArr.length) {
                uh.d dVar = dVarArr[i11];
                boolean z10 = b10 == i11;
                if (dVar.p != z10) {
                    ValueAnimator valueAnimator = dVar.n;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    dVar.p = z10;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(dVar.o, z10 ? 1.0f : 0.0f);
                    dVar.n = ofFloat;
                    ofFloat.setDuration(180L);
                    dVar.n.addUpdateListener(dVar);
                    dVar.n.setInterpolator(uh.f.a);
                    dVar.n.start();
                }
                uh.d dVar2 = dVarArr[i11];
                boolean z11 = b10 == i11 || b10 == -1;
                if (dVar2.m != z11) {
                    ValueAnimator valueAnimator2 = dVar2.k;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    dVar2.m = z11;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(dVar2.l, z11 ? 1.0f : 0.0f);
                    dVar2.k = ofFloat2;
                    ofFloat2.setDuration(180L);
                    dVar2.k.addUpdateListener(dVar2);
                    dVar2.k.setInterpolator(uh.f.a);
                    dVar2.k.start();
                }
                i11++;
            }
        }
    }

    public final void v(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            org.telegram.ui.ActionBar.n2 n2Var = this.a;
            if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var, u1Var.getMessageObject())) {
                n2Var.presentFragment(new yn(bundle));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:271:0x0b1a, code lost:
    
        if (r0.exists() != false) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0bde, code lost:
    
        if (r1.startsWith("text/x-web-markdown") == false) goto L322;
     */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0c2a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10, boolean z10) {
        int i10;
        MessageObject messageObject;
        boolean z11;
        MessageObject messageObject2;
        yn ynVar;
        boolean z12;
        long j3;
        long j10;
        File file;
        TLRPC.Chat chat;
        yu0 E;
        yu0 yu0Var;
        float f11;
        float f12;
        char c10;
        MessageObject messageObject3;
        MessageObject messageObject4;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        int i11;
        MessageObject messageObject5 = u1Var.getMessageObject();
        int i12 = messageObject5.type;
        yn ynVar2 = this.a;
        if (i12 == 23) {
            TLRPC.MessageMedia messageMedia2 = messageObject5.messageOwner.media;
            TL_stories.StoryItem storyItem = messageMedia2.storyItem;
            if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia2.peer);
                storyItem.messageId = messageObject5.getId();
                storyItem.messageType = 2;
                ai.ia.b(storyItem, ynVar2.f);
                ynVar2.getOrCreateStoryViewer().F(ynVar2.getParentActivity(), messageObject5.messageOwner.media.storyItem, ai.u9.a(ynVar2.v0));
            }
        } else {
            int i13 = 1;
            if (messageObject5.isVideo()) {
                i11 = ((org.telegram.ui.ActionBar.n2) ynVar2).currentAccount;
                if (DownloadController.getInstance(i11).canDownloadMedia(messageObject5.messageOwner) == 1) {
                    messageObject5.putInDownloadsStore = true;
                }
            } else {
                messageObject5.putInDownloadsStore = true;
            }
            if (messageObject5.isSendError()) {
                ynVar2.I7(u1Var, false, false, f7, f10, true, false, false);
                return;
            }
            if (!messageObject5.isSending()) {
                int i14 = 0;
                if (!z10 || (message = messageObject5.messageOwner) == null || (messageMedia = message.media) == null || (webPage = messageMedia.webpage) == null || TextUtils.isEmpty(webPage.url)) {
                    int i15 = 5;
                    if (messageObject5.isDice()) {
                        vm vmVar = new vm(this, messageObject5, i14);
                        if (messageObject5.isStakeableDice()) {
                            ynVar2.getMessagesController().loadStakeDiceInfo(new z(this, messageObject5, vmVar, i15));
                            return;
                        } else {
                            vmVar.run();
                            return;
                        }
                    }
                    if ((messageObject5.isAnimatedEmoji() && (!messageObject5.isAnimatedAnimatedEmoji() || (ynVar2.va.e.containsKey(gz.q(MessageObject.findAnimatedEmojiEmoticon(messageObject5.getDocument()))) && ynVar2.f != null))) || messageObject5.isPremiumSticker()) {
                        ynVar2.Ma(u1Var);
                        ynVar2.va.l(u1Var, ynVar2, true);
                        ynVar2.v0.J0(false);
                        return;
                    }
                    int i16 = 6;
                    if (messageObject5.needDrawBluredPreview()) {
                        ve eb2 = ynVar2.eb(messageObject5, false);
                        a3.h0 N4 = yn.N4(ynVar2, messageObject5);
                        u1Var.invalidate();
                        final SecretMediaViewer f13 = SecretMediaViewer.f();
                        final Activity parentActivity = ynVar2.getParentActivity();
                        int i17 = UserConfig.selectedAccount;
                        f13.a = i17;
                        ImageReceiver imageReceiver = f13.h;
                        imageReceiver.setCurrentAccount(i17);
                        if (f13.b != parentActivity) {
                            f13.b = parentActivity;
                            f13.g1 = new org.telegram.ui.Components.fn0(parentActivity, null);
                            k0 k0Var = new k0(f13, parentActivity, 21);
                            f13.d = k0Var;
                            k0Var.setBackgroundDrawable(f13.l0);
                            f13.d.setFocusable(true);
                            f13.d.setFocusableInTouchMode(true);
                            f13.d.setClipChildren(false);
                            f13.d.setClipToPadding(false);
                            f13.e = new ci.m6(f13, parentActivity);
                            View view = new View(parentActivity);
                            f13.f = view;
                            view.setBackgroundColor(2130706432);
                            f13.e.addView(f13.f, w7.z5.e(-1, -2, 80));
                            f13.e.setFocusable(false);
                            f13.d.addView(f13.e);
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f13.e.getLayoutParams();
                            layoutParams.width = -1;
                            layoutParams.height = -1;
                            layoutParams.gravity = 51;
                            f13.e.setLayoutParams(layoutParams);
                            f13.e.setFitsSystemWindows(true);
                            f13.e.setOnApplyWindowInsetsListener(new p41(f13, 0));
                            f13.e.setSystemUiVisibility(1792);
                            GestureDetector gestureDetector = new GestureDetector(f13.e.getContext(), f13);
                            f13.L0 = gestureDetector;
                            gestureDetector.setOnDoubleTapListener(f13);
                            org.telegram.ui.Components.y7 y7Var = new org.telegram.ui.Components.y7(f13, parentActivity, i16);
                            f13.F = y7Var;
                            y7Var.setTitleColor(-1);
                            f13.F.setSubtitleColor(-1);
                            f13.F.setBackgroundColor(2130706432);
                            f13.F.setOccupyStatusBar(true);
                            f13.F.z(1090519039, false);
                            f13.F.A(-1, false);
                            f13.F.setBackButtonImage(R.drawable.ic_ab_back);
                            f13.F.setTitleRightMargin(AndroidUtilities.dp(70.0f));
                            f13.e.addView(f13.F, w7.z5.c(-2.0f, -1));
                            f13.F.setActionBarMenuOnItemClick(new u70(f13, 28));
                            ci.e4 e4Var = new ci.e4(parentActivity, 1);
                            f13.r = e4Var;
                            e4Var.l(1.0f, -26.0f);
                            f13.r.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                            f13.e.addView(f13.r, w7.z5.d(-1, 80.0f, 53, 0.0f, 48.0f, 0.0f, 0.0f));
                            v41 v41Var = new v41(f13, parentActivity);
                            f13.n = v41Var;
                            f13.e.addView(v41Var, w7.z5.d(119, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
                            dw0 dw0Var = new dw0(f13, i13);
                            f13.U = new w41(f13, parentActivity);
                            View view2 = new View(parentActivity);
                            f13.T = view2;
                            view2.setBackgroundColor(2130706432);
                            f13.U.addView(f13.T, w7.z5.e(-1, -1, 119));
                            org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(f13.e.getContext());
                            f13.S = i5Var;
                            i5Var.setTextColor(-1);
                            f13.S.setGravity(53);
                            f13.S.setTextSize(14);
                            f13.S.setImportantForAccessibility(2);
                            f13.U.addView(f13.S, w7.z5.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
                            n20 n20Var = new n20(f13, parentActivity, 9);
                            f13.R = n20Var;
                            org.telegram.ui.Components.g81 g81Var = new org.telegram.ui.Components.g81(n20Var);
                            f13.Q = g81Var;
                            g81Var.z = AndroidUtilities.dp(2.0f);
                            org.telegram.ui.Components.g81 g81Var2 = f13.Q;
                            g81Var2.k = 872415231;
                            g81Var2.l = 872415231;
                            g81Var2.m = -1;
                            g81Var2.n = -1;
                            g81Var2.A = 1509949439;
                            g81Var2.j = dw0Var;
                            f13.U.addView(f13.R);
                            f13.e.addView(f13.U, w7.z5.e(-1, 48, 80));
                            rs0 rs0Var = new rs0(null, new ai.d());
                            f13.Y = rs0Var;
                            rs0Var.k0 = true;
                            rs0Var.i0 = false;
                            mu0 mu0Var = new mu0(f13.e.getContext());
                            f13.Z = mu0Var;
                            mu0Var.setFactory(new ViewSwitcher.ViewFactory() { // from class: org.telegram.ui.q41
                                @Override // android.widget.ViewSwitcher.ViewFactory
                                public final View makeView() {
                                    SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
                                    return new lu0(parentActivity, secretMediaViewer.a0, secretMediaViewer.Y, new c5(secretMediaViewer, 22), new mg0(secretMediaViewer, 2));
                                }
                            });
                            f13.Z.setVisibility(4);
                            if (!f13.w1) {
                                f13.w1 = true;
                                f13.Z.setLayerType(2, null);
                                f13.Z.getCurrentView().setLayerType(2, null);
                                f13.Z.getNextView().setLayerType(2, null);
                            }
                            ImageView imageView = new ImageView(parentActivity);
                            f13.V = imageView;
                            imageView.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(64.0f), 1711276032));
                            org.telegram.ui.Components.sg0 sg0Var = new org.telegram.ui.Components.sg0(28);
                            f13.W = sg0Var;
                            sg0Var.setCallback(f13.V);
                            f13.V.setImageDrawable(f13.W);
                            f13.V.setScaleType(ImageView.ScaleType.CENTER);
                            f13.V.setScaleX(0.6f);
                            f13.V.setScaleY(0.6f);
                            f13.V.setAlpha(0.0f);
                            f13.V.setPivotX(AndroidUtilities.dp(32.0f));
                            f13.V.setPivotY(AndroidUtilities.dp(32.0f));
                            f13.e.addView(f13.V, w7.z5.e(64, 64, 17));
                            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
                            f13.c = layoutParams2;
                            layoutParams2.height = -1;
                            layoutParams2.format = -3;
                            layoutParams2.width = -1;
                            layoutParams2.gravity = 48;
                            layoutParams2.type = 99;
                            layoutParams2.flags = -2147409656;
                            AndroidUtilities.logFlagSecure();
                            imageReceiver.setParentView(f13.e);
                            imageReceiver.setForceCrossfade(true);
                            org.telegram.ui.Cells.ca o9 = f13.Y.o(f13.d.getContext());
                            if (o9 != null) {
                                AndroidUtilities.removeFromParent(o9);
                                f13.e.addView(o9);
                            }
                            f13.Y.T(f13.e);
                            f13.Y.j0 = true;
                        }
                        SecretMediaViewer f14 = SecretMediaViewer.f();
                        ml mlVar = ynVar2.Da;
                        SecretMediaViewer.PhotoBackgroundDrawable photoBackgroundDrawable = f14.l0;
                        ImageReceiver imageReceiver2 = f14.h;
                        if (f14.b != null && messageObject5.needDrawBluredPreview()) {
                            if (mlVar != null && (E = mlVar.E(messageObject5, null, 0, true, false)) != null) {
                                f14.q1 = messageObject5.messageOwner.ttl == Integer.MAX_VALUE;
                                f14.p1 = N4;
                                f14.N = mlVar;
                                f14.K = System.currentTimeMillis();
                                f14.L = 0L;
                                f14.k0 = true;
                                f14.j0 = true;
                                f14.p0 = false;
                                l4 l4Var = f14.w;
                                if (l4Var != null) {
                                    l4Var.setVisibility(4);
                                }
                                f14.i();
                                f14.N0 = 0.0f;
                                f14.O0 = 1.0f;
                                f14.P0 = 0.0f;
                                f14.Q0 = 0.0f;
                                f14.R0 = 0.0f;
                                f14.S0 = 0.0f;
                                f14.T0 = 0.0f;
                                f14.U0 = 0.0f;
                                f14.Z0 = false;
                                f14.a1 = false;
                                f14.b1 = false;
                                f14.c1 = false;
                                f14.d1 = true;
                                f14.n(f14.y0);
                                photoBackgroundDrawable.setAlpha(0);
                                f14.e.setAlpha(1.0f);
                                f14.e.setVisibility(0);
                                f14.n.setAlpha(1.0f);
                                f14.J = false;
                                f14.H = false;
                                f14.I = false;
                                f14.M = true;
                                imageReceiver2.setManualAlphaAnimator(false);
                                f14.O = 0;
                                f14.P = 0;
                                RectF rectF = new RectF(E.a.getDrawRegion());
                                rectF.left = Math.max(rectF.left, E.a.getImageX());
                                rectF.top = Math.max(rectF.top, E.a.getImageY());
                                rectF.right = Math.min(rectF.right, E.a.getImageX2());
                                rectF.bottom = Math.min(rectF.bottom, E.a.getImageY2());
                                float width = rectF.width();
                                float height = rectF.height();
                                Point point = AndroidUtilities.displaySize;
                                f14.y0 = Math.max(width / point.x, height / (point.y + AndroidUtilities.statusBarHeight));
                                int[] iArr = E.h;
                                if (iArr != null) {
                                    f14.H0 = new int[iArr.length];
                                    int i18 = 0;
                                    while (true) {
                                        int[] iArr2 = E.h;
                                        if (i18 >= iArr2.length) {
                                            break;
                                        }
                                        f14.H0[i18] = iArr2[i18];
                                        i18++;
                                    }
                                } else {
                                    f14.H0 = null;
                                }
                                float f15 = E.b;
                                float f16 = rectF.left;
                                f14.w0 = ((width / 2.0f) + (f15 + f16)) - (r9 / 2);
                                f14.x0 = ((height / 2.0f) + (E.c + rectF.top)) - (r8 / 2);
                                f14.v0 = Math.abs(f16 - E.a.getImageX());
                                int abs = (int) Math.abs(rectF.top - E.a.getImageY());
                                E.d.getLocationInWindow(new int[2]);
                                float f17 = (r6[1] - (E.c + rectF.top)) + E.j;
                                f14.r0 = f17;
                                float f18 = abs;
                                f14.r0 = Math.max(0.0f, Math.max(f17, f18));
                                float height2 = (((E.c + rectF.top) + ((int) height)) - (E.d.getHeight() + r6[1])) + E.i;
                                f14.s0 = height2;
                                f14.s0 = Math.max(0.0f, Math.max(height2, f18));
                                f14.t0 = 0.0f;
                                f14.t0 = Math.max(0.0f, Math.max(0.0f, f18));
                                f14.u0 = 0.0f;
                                f14.u0 = Math.max(0.0f, Math.max(0.0f, f18));
                                f14.J0 = System.currentTimeMillis();
                                f14.z0 = 0.0f;
                                f14.A0 = 0.0f;
                                f14.D0 = 0.0f;
                                f14.F0 = 0.0f;
                                f14.G0 = 0.0f;
                                f14.C0 = 0.0f;
                                f14.E0 = 0.0f;
                                f14.B0 = 1.0f;
                                f14.I0 = true;
                                f14.e1 = true;
                                ib0 ib0Var = f14.l1;
                                if (ib0Var != null) {
                                    ib0Var.destroy();
                                    f14.l1 = null;
                                }
                                LaunchActivity launchActivity = LaunchActivity.G1;
                                f14.l1 = launchActivity != null ? new ib0(launchActivity, true) : null;
                                NotificationCenter.getInstance(f14.a).addObserver(f14, NotificationCenter.messagesDeleted);
                                NotificationCenter.getInstance(f14.a).addObserver(f14, NotificationCenter.updateMessageMedia);
                                NotificationCenter.getInstance(f14.a).addObserver(f14, NotificationCenter.didCreatedNewDeleteTask);
                                f14.v = MessageObject.getPeerId(messageObject5.messageOwner.peer_id);
                                f14.h0 = messageObject5;
                                TLRPC.Document document = messageObject5.getDocument();
                                ImageReceiver.BitmapHolder bitmapHolder = f14.i0;
                                if (bitmapHolder != null) {
                                    bitmapHolder.release();
                                    f14.i0 = null;
                                }
                                f14.i0 = E.a.getThumbBitmapSafe();
                                f14.U.setVisibility(8);
                                if (document != null) {
                                    int i19 = 0;
                                    while (true) {
                                        if (i19 >= document.attributes.size()) {
                                            break;
                                        }
                                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i19);
                                        if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) documentAttribute;
                                            f14.O = tL_documentAttributeVideo.w;
                                            f14.P = tL_documentAttributeVideo.h;
                                            break;
                                        }
                                        i19++;
                                    }
                                    if (MessageObject.isGifDocument(document)) {
                                        f14.F.setTitle(LocaleController.getString(R.string.DisappearingGif));
                                        String str = messageObject5.messageOwner.attachPath;
                                        ImageLocation forDocument = (str == null || !messageObject5.attachPathExists) ? ImageLocation.getForDocument(document) : ImageLocation.getForPath(str);
                                        f12 = 1.0f;
                                        yu0Var = E;
                                        f11 = 0.0f;
                                        c10 = 6;
                                        messageObject4 = messageObject5;
                                        imageReceiver2.setImage(forDocument, (String) null, f14.i0 != null ? new BitmapDrawable(f14.i0.bitmap) : null, -1L, (String) null, messageObject4, 1);
                                    } else {
                                        yu0Var = E;
                                        f11 = 0.0f;
                                        f12 = 1.0f;
                                        c10 = 6;
                                        f14.b0 = 1;
                                        f14.F.setTitle(LocaleController.getString(R.string.DisappearingVideo));
                                        File file2 = new File(messageObject5.messageOwner.attachPath);
                                        if (file2.exists()) {
                                            f14.h(file2);
                                        } else {
                                            File pathToMessage = FileLoader.getInstance(f14.a).getPathToMessage(messageObject5.messageOwner);
                                            File file3 = new File(pathToMessage.getAbsolutePath() + ".enc");
                                            if (file3.exists()) {
                                                pathToMessage = file3;
                                            }
                                            f14.h(pathToMessage);
                                        }
                                        f14.J = true;
                                        f14.U.setVisibility(0);
                                        messageObject4 = messageObject5;
                                        imageReceiver2.setImage((ImageLocation) null, (String) null, f14.i0 != null ? new BitmapDrawable(f14.i0.bitmap) : null, -1L, (String) null, messageObject4, 2);
                                    }
                                    messageObject3 = messageObject4;
                                } else {
                                    yu0Var = E;
                                    f11 = 0.0f;
                                    f12 = 1.0f;
                                    c10 = 6;
                                    f14.F.setTitle(LocaleController.getString(R.string.DisappearingPhoto));
                                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject5.photoThumbs, AndroidUtilities.getPhotoSize());
                                    imageReceiver2.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject5.photoThumbsObject), (String) null, f14.i0 != null ? new BitmapDrawable(f14.i0.bitmap) : null, -1L, (String) null, messageObject5, 2);
                                    messageObject3 = messageObject5;
                                    if (closestPhotoSizeWithSize != null) {
                                        f14.O = closestPhotoSizeWithSize.w;
                                        f14.P = closestPhotoSizeWithSize.h;
                                    }
                                }
                                f14.j(messageObject3, "", false);
                                f14.j(messageObject3, messageObject3.caption, true);
                                f14.m(true, false);
                                f14.k(false, false);
                                f14.W.a(true, true);
                                if (f14.q1) {
                                    v41 v41Var2 = f14.n;
                                    v41Var2.e = true;
                                    TextPaint textPaint = v41Var2.r;
                                    textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                                    textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
                                    textPaint.setColor(-1);
                                    StaticLayout staticLayout = new StaticLayout("1", textPaint, 999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                                    v41Var2.s = staticLayout;
                                    v41Var2.v = staticLayout.getLineCount() > 0 ? v41Var2.s.getLineWidth(0) : 0.0f;
                                    v41Var2.w = v41Var2.s.getHeight();
                                    v41Var2.invalidate();
                                    f14.n.setOnClickListener(new y31(f14, 3));
                                } else {
                                    f14.n.setOnClickListener(null);
                                }
                                try {
                                    if (f14.d.getParent() != null) {
                                        ((WindowManager) f14.b.getSystemService("window")).removeView(f14.d);
                                    }
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                }
                                ((WindowManager) f14.b.getSystemService("window")).addView(f14.d, f14.c);
                                f14.n.invalidate();
                                f14.s = true;
                                Window window = f14.b.getWindow();
                                f14.o1 = AndroidUtilities.getLightNavigationBar(window);
                                AndroidUtilities.setLightNavigationBar(f14.b, false);
                                AndroidUtilities.setLightNavigationBar((View) f14.d, false);
                                Activity activity = f14.b;
                                if (activity instanceof LaunchActivity) {
                                    f14.n1 = Build.VERSION.SDK_INT >= 26 ? ((LaunchActivity) activity).getWindow().getNavigationBarColor() : 0;
                                    ((LaunchActivity) f14.b).y(-16777216);
                                } else {
                                    f14.n1 = window.getNavigationBarColor();
                                    AndroidUtilities.setNavigationBarColor(f14.b, -16777216);
                                }
                                AnimatorSet animatorSet = new AnimatorSet();
                                f14.K0 = animatorSet;
                                org.telegram.ui.Components.y7 y7Var2 = f14.F;
                                Property property = View.ALPHA;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y7Var2, (Property<org.telegram.ui.Components.y7, Float>) property, 0.0f, 1.0f);
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(f14.a0, (Property<wt0, Float>) property, 0.0f, 1.0f);
                                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(f14.r, (Property<ci.e4, Float>) property, 0.0f, 1.0f);
                                ObjectAnimator ofInt = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.s6.d, 0, 255);
                                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(f14, f14.v1, 0.0f, 1.0f);
                                w41 w41Var = f14.U;
                                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(w41Var, w41Var.n, f12);
                                w41 w41Var2 = f14.U;
                                if (f14.J) {
                                    f11 = 1.0f;
                                }
                                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(w41Var2, (Property<w41, Float>) property, f11);
                                Animator[] animatorArr = new Animator[7];
                                animatorArr[0] = ofFloat;
                                animatorArr[1] = ofFloat2;
                                animatorArr[2] = ofFloat3;
                                animatorArr[3] = ofInt;
                                animatorArr[4] = ofFloat4;
                                animatorArr[5] = ofFloat5;
                                animatorArr[c10] = ofFloat6;
                                animatorSet.playTogether(animatorArr);
                                f14.m0 = 3;
                                f14.o0 = new nf0(f14, eb2, messageObject3, 26);
                                f14.K0.setDuration(250L);
                                f14.K0.addListener(new t41(f14, 0));
                                f14.n0 = System.currentTimeMillis();
                                if (SharedConfig.getDevicePerformanceClass() == 0) {
                                    f14.e.setLayerType(2, null);
                                }
                                f14.K0.setInterpolator(new DecelerateInterpolator());
                                photoBackgroundDrawable.b = 0;
                                photoBackgroundDrawable.a = new wx0(24, f14, yu0Var);
                                f14.K0.start();
                                return;
                            }
                        }
                    } else {
                        if (MessageObject.isAnimatedEmoji(messageObject5.getDocument()) && MessageObject.getInputStickerSet(messageObject5.getDocument()) != null) {
                            ArrayList arrayList = new ArrayList(1);
                            arrayList.add(MessageObject.getInputStickerSet(messageObject5.getDocument()));
                            org.telegram.ui.Components.wv wvVar = new org.telegram.ui.Components.wv(ynVar2, ynVar2.getParentActivity(), ynVar2.ca, arrayList);
                            wvVar.setCalcMandatoryInsets(ynVar2.w9());
                            ynVar2.showDialog(wvVar);
                            return;
                        }
                        if (messageObject5.getInputStickerSet() != null) {
                            org.telegram.ui.Components.ry0 ry0Var = new org.telegram.ui.Components.ry0(ynVar2.getParentActivity(), ynVar2, messageObject5.getInputStickerSet(), null, (ynVar2.M0.getVisibility() == 0 || !((chat = ynVar2.e) == null || ChatObject.canSendStickers(chat))) ? null : ynVar2.W, ynVar2.ca);
                            ry0Var.setCalcMandatoryInsets(ynVar2.w9());
                            ynVar2.showDialog(ry0Var);
                            return;
                        }
                        if (messageObject5.isVideo() || (i10 = messageObject5.type) == 1 || ((i10 == 0 && !messageObject5.isWebpageDocument()) || messageObject5.isGif())) {
                            if (messageObject5.isSponsored()) {
                                if (messageObject5.isGif() || messageObject5.isPhoto()) {
                                    int i20 = 1;
                                    ynVar2.I9(messageObject5, true, false);
                                    if (messageObject5.sponsoredUrl != null) {
                                        nf.e eVar = ynVar2.xb;
                                        if (eVar != null) {
                                            eVar.a(true);
                                        }
                                        ynVar2.xb = u1Var.getMessageObject() == null ? null : new cn(this, u1Var, i20);
                                        nf.f.r(ynVar2.getParentActivity(), Uri.parse(messageObject5.sponsoredUrl), true, false, false, ynVar2.xb, null, false, ynVar2.getMessagesController().sponsoredLinksInappAllow, false);
                                        return;
                                    }
                                } else if (messageObject5.isVideo()) {
                                    ynVar2.I9(messageObject5, true, false);
                                }
                            }
                            if (messageObject5.getDuration() > 0.0d && messageObject5.getVideoStartsTimestamp() > 0 && !messageObject5.openedInViewer) {
                                messageObject5.forceSeekTo = (float) (messageObject5.getVideoStartsTimestamp() / messageObject5.getDuration());
                            }
                            ynVar2.ga(u1Var, messageObject5);
                            return;
                        }
                        int i21 = messageObject5.type;
                        if (i21 == 3) {
                            ynVar2.eb(messageObject5, true);
                            try {
                                String str2 = messageObject5.messageOwner.attachPath;
                                File file4 = (str2 == null || str2.length() == 0) ? null : new File(messageObject5.messageOwner.attachPath);
                                if (file4 == null || !file4.exists()) {
                                    file4 = ynVar2.getFileLoader().getPathToMessage(messageObject5.messageOwner);
                                }
                                Intent intent = new Intent("android.intent.action.VIEW");
                                if (Build.VERSION.SDK_INT >= 24) {
                                    intent.setFlags(1);
                                    intent.setDataAndType(FileProvider.d(ynVar2.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", file4), "video/mp4");
                                } else {
                                    intent.setDataAndType(Uri.fromFile(file4), "video/mp4");
                                }
                                ynVar2.getParentActivity().startActivityForResult(intent, 500);
                                return;
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                ynVar2.z6(messageObject5);
                            }
                        } else if (i21 == 4) {
                            if (AndroidUtilities.isMapsInstalled(ynVar2)) {
                                if (!messageObject5.isLiveLocation()) {
                                    gd0 gd0Var = new gd0(ynVar2.h == null ? 3 : 0);
                                    gd0Var.F0 = ynVar2;
                                    gd0Var.u0(messageObject5);
                                    ynVar2.presentFragment(gd0Var);
                                    return;
                                }
                                TLRPC.Chat chat2 = ynVar2.e;
                                gd0 gd0Var2 = new gd0((chat2 == null || ChatObject.canSendMessages(chat2) || ynVar2.e.megagroup) ? 2 : 6);
                                gd0Var2.F0 = ynVar2;
                                gd0Var2.u0(messageObject5);
                                ynVar2.presentFragment(gd0Var2);
                                return;
                            }
                        } else if (i21 == 9 || i21 == 0) {
                            if (messageObject5.getDocumentName().toLowerCase().endsWith("attheme")) {
                                String str3 = messageObject5.messageOwner.attachPath;
                                if (str3 != null && str3.length() != 0) {
                                    file = new File(messageObject5.messageOwner.attachPath);
                                }
                                file = null;
                                if (file == null) {
                                    File pathToMessage2 = ynVar2.getFileLoader().getPathToMessage(messageObject5.messageOwner);
                                    if (pathToMessage2.exists()) {
                                        file = pathToMessage2;
                                    }
                                }
                                org.telegram.ui.ActionBar.h6 u10 = org.telegram.ui.ActionBar.i6.u(file, messageObject5.getDocumentName(), null, true);
                                if (u10 != null) {
                                    ynVar2.presentFragment(new pd1(u10));
                                    return;
                                }
                                ynVar2.v4 = -1;
                            }
                            if (messageObject5.canPreviewDocument()) {
                                PhotoViewer.t1().K2(null, ynVar2, ynVar2.ca);
                                PhotoViewer t12 = PhotoViewer.t1();
                                int i22 = messageObject5.type;
                                long j11 = i22 != 0 ? ynVar2.R5 : 0L;
                                if (i22 != 0) {
                                    j10 = 0;
                                    j3 = ynVar2.J6;
                                } else {
                                    j3 = 0;
                                    j10 = 0;
                                }
                                if (i22 != 0) {
                                    j10 = ynVar2.d();
                                }
                                messageObject = messageObject5;
                                t12.d2(messageObject, ynVar2, j11, j3, j10, ynVar2.Da);
                                z11 = true;
                            } else {
                                messageObject = messageObject5;
                                z11 = false;
                            }
                            Pattern pattern = org.telegram.ui.Components.ea0.a;
                            String extension = messageObject.getExtension();
                            if (!"md".equalsIgnoreCase(extension) && !"mkd".equalsIgnoreCase(extension) && !"mdwn".equalsIgnoreCase(extension) && !"mkdn".equalsIgnoreCase(extension) && !"mdown".equalsIgnoreCase(extension) && !"markdown".equalsIgnoreCase(extension)) {
                                String mimeType = messageObject.getMimeType();
                                if (mimeType != null) {
                                    String lowerCase = mimeType.toLowerCase();
                                    if (!lowerCase.startsWith("text/markdown")) {
                                        if (!lowerCase.startsWith("text/x-markdown")) {
                                        }
                                    }
                                }
                                z12 = z11;
                                ynVar = ynVar2;
                                messageObject2 = messageObject;
                                if (!z12) {
                                    try {
                                        AndroidUtilities.openForView(messageObject2, ynVar.getParentActivity(), ynVar.ca, false);
                                        return;
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                        ynVar.z6(messageObject2);
                                    }
                                }
                            }
                            if (ynVar2.getParentActivity() == null) {
                                ynVar = ynVar2;
                                messageObject2 = messageObject;
                            } else {
                                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ynVar2.getParentActivity(), 3, ynVar2.ca);
                                b2Var.setCanceledOnTouchOutside(false);
                                boolean[] zArr = {false};
                                b2Var.setOnCancelListener(new eh(0, zArr));
                                b2Var.q(150L);
                                MessageObject messageObject6 = messageObject;
                                org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(ynVar2, messageObject6, b2Var, zArr, 8);
                                messageObject2 = messageObject6;
                                ynVar = ynVar2;
                                new Thread(m5Var).start();
                            }
                            z12 = true;
                            if (!z12) {
                            }
                        }
                    }
                    return;
                }
                String str4 = messageObject5.messageOwner.media.webpage.url;
                AndroidUtilities.getHostAuthority(str4);
                if (!ynVar2.da(str4, u1Var, null, messageObject5.getId(), 2)) {
                    nf.e eVar2 = ynVar2.xb;
                    if (eVar2 != null) {
                        eVar2.a(true);
                    }
                    ynVar2.xb = u1Var.getMessageObject() != null ? new cn(this, u1Var, i14) : null;
                    nf.f.r(ynVar2.getParentActivity(), Uri.parse(str4), true, false, false, ynVar2.xb, null, false, true, false);
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean v2(int i10) {
        boolean z10;
        org.telegram.ui.ActionBar.c5 c5Var;
        org.telegram.ui.ActionBar.c5 c5Var2;
        if (i10 != 16 && i10 != R.id.acc_action_small_button && i10 != R.id.acc_action_msg_options) {
            return false;
        }
        yn ynVar = this.a;
        z10 = ((org.telegram.ui.ActionBar.n2) ynVar).inPreviewMode;
        if (!z10 || !ynVar.H9) {
            return !e();
        }
        c5Var = ((org.telegram.ui.ActionBar.n2) ynVar).parentLayout;
        if (c5Var != null) {
            c5Var2 = ((org.telegram.ui.ActionBar.n2) ynVar).parentLayout;
            ((ActionBarLayout) c5Var2).r();
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final String w(long j3) {
        TLRPC.Peer peer;
        String adminRank;
        yn ynVar = this.a;
        if (UserObject.isBotForum(ynVar.f)) {
            return null;
        }
        TLRPC.Chat chat = ynVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat) && (adminRank = ynVar.getMessagesController().getAdminRank(ynVar.e.id, j3)) != null) {
            return adminRank;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ynVar.a4;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || !(peer.user_id == j3 || peer.channel_id == j3 || peer.chat_id == j3)) {
            return null;
        }
        return LocaleController.getString(R.string.TopicCreator);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean w0(MessageObject messageObject) {
        return !this.a.s.containsKey(messageObject);
    }

    public final void x(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            bundle.putBoolean("expandPhoto", false);
            this.a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void x2() {
        yn ynVar = this.a;
        if (!ynVar.getUserConfig().isPremium()) {
            org.telegram.ui.Components.yc.a0(ynVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("UnlockSimilarChannelsPremium", ynVar.getMessagesController().recommendedChannelsLimitPremium), new um(this, 4))).j();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ynVar.R5);
        bundle.putInt("start_from", 10);
        ynVar.presentFragment(new org.telegram.ui.Components.pa0(bundle, ynVar.Y0.getSharedMediaPreloader()));
    }

    public final void y(TLRPC.User user, boolean z10) {
        int i10;
        if (user == null || user.id == UserObject.VERIFY) {
            return;
        }
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        int i11 = 0;
        if (userProfilePhoto == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
            z10 = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putBoolean("expandPhoto", z10);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        yn ynVar = this.a;
        TLRPC.User user2 = ynVar.f;
        if (user2 != null && user2.id == user.id) {
            i11 = 1;
        }
        profileActivity.N4(i11);
        Activity parentActivity = ynVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) ynVar).classGuid;
        AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
        ynVar.presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void y0(org.telegram.ui.Cells.u1 u1Var) {
        qh.c cVar = this.a.zc;
        if (cVar == null || cVar.n != u1Var) {
            return;
        }
        cVar.w.getClass();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void y2(org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
        MessageObject messageObject;
        TLRPC.TL_factCheck factCheck;
        String str;
        yn ynVar = this.a;
        ci.e4 e4Var = ynVar.y1;
        if (e4Var != null) {
            e4Var.e(true);
        }
        if (ynVar.getParentActivity() == null || (messageObject = u1Var.getMessageObject()) == null || (factCheck = messageObject.getFactCheck()) == null || factCheck.country == null) {
            return;
        }
        try {
            str = new Locale("", factCheck.country).getDisplayCountry(LocaleController.getInstance().getCurrentLocale());
        } catch (Exception e7) {
            FileLog.e(e7);
            str = factCheck.country;
        }
        ci.e4 e4Var2 = new ci.e4(ynVar.getParentActivity(), 3);
        e4Var2.p(true);
        e4Var2.K = Layout.Alignment.ALIGN_NORMAL;
        e4Var2.d = -1L;
        e4Var2.T = true;
        e4Var2.e = true;
        e4Var2.q(12.0f);
        ynVar.y1 = e4Var2;
        e4Var2.l0 = new oh(10, this, e4Var2);
        e4Var2.s(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FactCheckToast, str)));
        ynVar.V0.addView(ynVar.y1, w7.z5.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
        ynVar.V0.post(new i2.a0(this, u1Var, i11, i10, 4));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void z(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject == null || messageObject.type != 27) {
            return;
        }
        messageObject.toggleChannelRecommendations();
        messageObject.forceUpdate = true;
        u1Var.t2();
        u1Var.requestLayout();
        this.a.y0.R(messageObject, false, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void z0() {
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        org.telegram.ui.Components.d6 animation;
        yn ynVar = this.a;
        if (ynVar.j3 || SharedConfig.noSoundHintShowed || ynVar.v0 == null || ynVar.getParentActivity() == null || ynVar.fragmentView == null) {
            return;
        }
        org.telegram.ui.Components.m40 m40Var = ynVar.r2;
        if (m40Var == null || m40Var.getTag() == null) {
            if (ynVar.r2 == null) {
                qm qmVar = ynVar.V0;
                int indexOfChild = qmVar.indexOfChild(ynVar.Q);
                if (indexOfChild == -1) {
                    return;
                }
                org.telegram.ui.Components.m40 m40Var2 = new org.telegram.ui.Components.m40(0, ynVar.getParentActivity(), ynVar.ca, false);
                ynVar.r2 = m40Var2;
                m40Var2.setShowingDuration(10000L);
                qmVar.addView(ynVar.r2, indexOfChild + 1, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                ynVar.r2.setAlpha(0.0f);
                ynVar.r2.setVisibility(4);
            }
            int childCount = ynVar.v0.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = ynVar.v0.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject.isVideo() && (animation = u1Var.getPhotoImage().getAnimation()) != null && animation.o() >= 3000 && ynVar.r2.e(u1Var, null, 0, 0, true)) {
                    SharedConfig.setNoSoundHintShowed(true);
                    return;
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final org.telegram.ui.Cells.r9 z2() {
        return this.a.a9;
    }
}
