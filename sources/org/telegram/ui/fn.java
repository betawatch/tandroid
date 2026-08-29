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
import android.util.Base64;
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
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.SecretMediaViewer;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class fn implements org.telegram.ui.Cells.j1 {
    public final /* synthetic */ tn a;

    public fn(tn tnVar) {
        this.a = tnVar;
    }

    public static void a(fn fnVar, org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
        int i10;
        tn tnVar = fnVar.a;
        if (tnVar.getParentActivity() == null || document == null) {
            return;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23 && ((i11 <= 28 || BuildVars.NO_SCOPED_STORAGE) && tnVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
            tnVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
            return;
        }
        MessageObject messageObject = s1Var == null ? null : s1Var.getMessageObject();
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
        i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
        arrayList.add(new MessageObject(i10, tL_message, false, true));
        MediaController.saveFilesFromMessages(tnVar.getParentActivity(), tnVar.getAccountInstance(), arrayList, new pa(fnVar, 1));
    }

    @Override // org.telegram.ui.Cells.j1
    public final void A(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject == null || messageObject.type != 27) {
            return;
        }
        messageObject.toggleChannelRecommendations();
        messageObject.forceUpdate = true;
        s1Var.t2();
        s1Var.requestLayout();
        this.a.w0.R(messageObject, false, false);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void A0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        tn tnVar = this.a;
        if (tnVar.getParentActivity() == null || tLObject == null) {
            return;
        }
        b5Var = ((org.telegram.ui.ActionBar.o2) tnVar).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.o2) tnVar).parentLayout;
            if (((ActionBarLayout) b5Var2).y()) {
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
            tnVar.presentFragment(new tn(bundle));
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, tnVar.getParentActivity(), tnVar.getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(tnVar.getThemedColor(org.telegram.ui.ActionBar.g6.G8));
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(tnVar.getParentActivity(), false, false);
        g1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
        g1Var.setMinimumWidth(160);
        g1Var.setOnClickListener(new a(this, 14));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(tnVar.getParentActivity(), false, false);
        g1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
        g1Var2.setMinimumWidth(160);
        g1Var2.setOnClickListener(new c0(this, (TLRPC.Chat) tLObject, s1Var, 7));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
        tn tnVar2 = new tn(bundle);
        tnVar2.F9 = true;
        tnVar.presentFragmentAsPreviewWithMenu(tnVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
        tnVar.d7();
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean A1() {
        tn tnVar = this.a;
        return tnVar.T0.getMeasuredWidth() > tnVar.T0.getMeasuredHeight();
    }

    @Override // org.telegram.ui.Cells.j1
    public final void B0(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
        MessageObject messageObject = s1Var.getMessageObject();
        int i10 = messageObject.type;
        tn tnVar = this.a;
        if (i10 != 16) {
            tnVar.I7(s1Var, true, false, f9, f10, messageObject.isMusic(), false, false);
            return;
        }
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        int i11 = 0;
        if (!(messageAction instanceof TLRPC.TL_messageActionConferenceCall)) {
            TLRPC.User user = tnVar.f;
            if (user != null) {
                boolean isVideoCall = messageObject.isVideoCall();
                TLRPC.UserFull userFull = tnVar.W7;
                org.telegram.ui.Components.voip.h2.n(user, isVideoCall, userFull != null && userFull.video_calls_available, tnVar.getParentActivity(), tnVar.getMessagesController().getUserFull(tnVar.f.id), tnVar.getAccountInstance());
                return;
            }
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(Long.valueOf(tnVar.a()));
        ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
        int size = arrayList.size();
        while (i11 < size) {
            TLRPC.Peer peer = arrayList.get(i11);
            i11++;
            hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(peer)));
        }
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = messageObject.getId();
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(tnVar.getParentActivity(), 3, null);
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = tnVar.getMessagesController().conferenceCallSizeLimit;
        c2Var.setOnCancelListener(new jh.w(this, tnVar.getConnectionsManager().sendRequest(getgroupcall, new eg.f0(this, c2Var, hashSet, tL_inputGroupCallInviteMessage, messageObject, 7)), 2));
        c2Var.q(600L);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void C(org.telegram.ui.Cells.s1 s1Var) {
        tn tnVar = this.a;
        if (!tnVar.getMessagesController().showSensitiveContent()) {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(tnVar.getParentActivity(), 3, null);
            c2Var.q(200L);
            tnVar.getMessagesController().getContentSettings(new b0(this, c2Var, s1Var, 5));
        } else {
            if (s1Var.getMessageObject() != null) {
                s1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
            }
            s1Var.h4();
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void C1(org.telegram.ui.Cells.s1 s1Var) {
        tn.U4(this.a, s1Var);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void D0(org.telegram.ui.Cells.s1 s1Var) {
        i(s1Var, true, false, true);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void E(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        TLRPC.Message message;
        int i10;
        int i11;
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        int i12 = buttonCustom.id;
        int i13 = 3;
        int i14 = 1;
        tn tnVar = this.a;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    tnVar.I7(s1Var, true, false, s1Var.getLastTouchX(), s1Var.getLastTouchY(), true, false, true);
                    return;
                } else {
                    if (i12 == 4) {
                        tnVar.N1.m(messageObject.getTopicId(), true);
                        return;
                    }
                    return;
                }
            }
            if (message.suggested_post != null) {
                i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, tnVar.e);
                if (canManageMonoForum) {
                    i11 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                    ChatObject.canUserDoChannelDirectAdminAction(i11, tnVar.e, 5);
                }
                ag.w0 w0Var = new ag.w0(this, message, canManageMonoForum, messageObject, 9);
                TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                tnVar.g7(w0Var, kf.a.l(suggestedPost != null ? suggestedPost.price : null), !canManageMonoForum);
                return;
            }
            return;
        }
        long peerDialogId = DialogObject.getPeerDialogId(message.from_id);
        tm tmVar = new tm(i13, this, message);
        Pattern pattern = org.telegram.ui.Components.c5.a;
        Activity parentActivity = tnVar.getParentActivity();
        int i15 = 0;
        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(parentActivity, 0, null);
        String string = LocaleController.getString(R.string.SuggestedMessageDecline);
        org.telegram.ui.ActionBar.c2 c2Var = f2Var.a;
        c2Var.N = string;
        c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageDeclineInfo, MessagesController.getInstance(UserConfig.selectedAccount).getPeerName(peerDialogId)));
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        frameLayout.setClipChildren(false);
        EditText editText = new EditText(parentActivity);
        editText.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        editText.setHint(LocaleController.getString(R.string.SuggestedMessageDeclineReasonHint));
        editText.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
        editText.setTextSize(1, 16.0f);
        editText.setBackground(org.telegram.ui.ActionBar.g6.S(parentActivity));
        editText.setMaxLines(4);
        editText.setRawInputType(147457);
        editText.setImeOptions(6);
        editText.setFilters(new InputFilter[]{new org.telegram.ui.Components.r4(parentActivity)});
        editText.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0, AndroidUtilities.dp(8.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f));
        editText.setSelection(editText.getText().toString().length());
        f2Var.n(frameLayout);
        f2Var.k(LocaleController.getString(R.string.Decline), new org.telegram.ui.Components.j1(i14, tmVar, editText));
        f2Var.h(LocaleController.getString(R.string.Cancel), null);
        c2Var.J = new org.telegram.ui.Components.r1(editText, i15);
        frameLayout.addView(editText, i7.f6.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
        editText.requestFocus();
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ig(editText, 3), 100L);
        tnVar.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void F(org.telegram.ui.Cells.s1 s1Var) {
        tn tnVar = this.a;
        tnVar.ta.l(s1Var, tnVar, true);
        tnVar.t0.I0(false);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void F0(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject;
        if (s1Var == null || (messageObject = s1Var.getMessageObject()) == null || messageObject.messageOwner == null) {
            return;
        }
        int id2 = messageObject.getId();
        tn tnVar = this.a;
        if (tnVar.sb == id2 && tnVar.tb == 7) {
            return;
        }
        TLRPC.InputPeer inputPeer = tnVar.getMessagesController().getInputPeer(messageObject.getDialogId());
        if (inputPeer == null) {
            return;
        }
        TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
        getrichmessage.peer = inputPeer;
        getrichmessage.id = id2;
        ye.c cVar = tnVar.wb;
        if (cVar != null) {
            cVar.a(true);
            tnVar.wb = null;
        }
        int[] iArr = new int[1];
        ri riVar = new ri(tnVar, id2, s1Var, 2);
        riVar.b = new vf(3, tnVar, iArr);
        tnVar.wb = riVar;
        riVar.d();
        iArr[0] = tnVar.getConnectionsManager().sendRequestTyped(getrichmessage, new org.telegram.messenger.a(), new zf(tnVar, riVar, iArr, s1Var, messageObject));
    }

    @Override // org.telegram.ui.Cells.j1
    public final void F1(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        i(s1Var, z10, false, false);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void H(MessageObject.TextLayoutBlock textLayoutBlock) {
        StaticLayout staticLayout = textLayoutBlock.textLayout;
        if (staticLayout == null || staticLayout.getText() == null) {
            return;
        }
        String charSequence = textLayoutBlock.textLayout.getText().toString();
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new CodeHighlighting.Span(false, 0, null, textLayoutBlock.language, charSequence), 0, spannableString.length(), 33);
        AndroidUtilities.addToClipboard(spannableString);
        b.n(R.string.CodeCopied, org.telegram.ui.Components.tc.a0(this.a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.j1
    public final boolean H1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        x4 x4Var;
        ik ikVar;
        hk hkVar;
        if (!l()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(ChatObject.getPublicUsername(chat));
        tn tnVar = this.a;
        int i14 = (isEmpty || tnVar.e == null || ((ikVar = tnVar.K0) != null && ikVar.getVisibility() == 0) || ((hkVar = tnVar.N) != null && hkVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat2 = tnVar.e;
        int i15 = (chat2 == null || !(tnVar.Z3 == 0 || tnVar.d4) || (ChatObject.isChannel(chat2) && !tnVar.e.megagroup)) ? 0 : 1;
        TLRPC.Chat chat3 = tnVar.e;
        int i16 = (chat3 == null || chat3.id != chat.id || tnVar.F9()) ? 1 : 0;
        d5[] d5VarArr = new d5[i16 + 1 + i14 + i15];
        d5VarArr[0] = d5.d;
        if (i16 != 0) {
            d5VarArr[1] = chat.broadcast ? d5.e : d5.f;
            i10 = 2;
        } else {
            i10 = 1;
        }
        if (i14 != 0) {
            d5VarArr[i10] = d5.n;
            i10++;
        }
        if (i15 != 0) {
            d5VarArr[i10] = d5.r;
        }
        TLRPC.ChatFull chatFull = tnVar.getMessagesController().getChatFull(chat.id);
        if (chatFull != null) {
            x4Var = x4.a(chat, chatFull, d5VarArr);
            z11 = i14;
            i13 = i15;
            i12 = i16;
            z10 = true;
        } else {
            i11 = ((org.telegram.ui.ActionBar.o2) tnVar).classGuid;
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
            x4Var = new x4(forUserOrChat, forUserOrChat2, null, str, null, null, chatPhoto != null ? chatPhoto.strippedBitmap : null, chat, d5VarArr, new w4(i11, chat, NotificationCenter.chatInfoDidLoad));
        }
        if (ab.m.e(x4Var)) {
            ab.m.i().s((ViewGroup) tnVar.fragmentView, tnVar.aa, x4Var, new z6(this, chat, s1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.j70 H = org.telegram.ui.Components.j70.H(tnVar, s1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new sm(this, chat, 0), false);
        boolean z12 = chat.broadcast;
        H.l(z12 ? R.drawable.msg_channel : R.drawable.msg_discussion, LocaleController.getString(z12 ? R.string.OpenChannel2 : R.string.OpenGroup2), new u1(this, s1Var, chat, 26), i12);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new sm(this, chat, 1), z11);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new sm(this, chat, 2), i13);
        H.t = false;
        H.i = 3;
        H.W = true;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void I1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        tn tnVar = this.a;
        if (tnVar.z9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) kf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) kf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
        if (tnVar.getParentActivity() != null) {
            if (tnVar.K0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                if (tL_inlineButtonTypeCopy == null) {
                    if (tL_inlineButtonTypeUrl != null) {
                        tnVar.Z9(null, tL_inlineButtonTypeUrl.url, true, s1Var, s1Var.getMessageObject());
                        try {
                            s1Var.performHapticFeedback(0, 1);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                String str = tL_inlineButtonTypeCopy.copy_text;
                org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(tnVar.getParentActivity(), tnVar.aa, false, false);
                f3Var.fixNavigationBar();
                f3Var.title = str;
                f3Var.bigTitle = false;
                f3Var.multipleLinesTitle = true;
                CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Copy)};
                ag.y1 y1Var = new ag.y1(3, tnVar, str);
                f3Var.items = charSequenceArr;
                f3Var.onClickListener = y1Var;
                tnVar.showDialog(f3Var);
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void J0(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        messageObject.messageOwner.summarizedOpen = !r1.summarizedOpen;
        messageObject.updateTranslation(true);
        tn tnVar = this.a;
        tnVar.getMessagesStorage().updateMessageCustomParams(messageObject.getDialogId(), messageObject.messageOwner);
        tnVar.getMessagesController().getTranslateController().checkTranslation(messageObject, true);
        i(s1Var, true, false, true);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean J1() {
        tn tnVar = this.a;
        return tnVar.T0.getKeyboardHeight() + tnVar.ka >= AndroidUtilities.dp(20.0f);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void K(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject.messageOwner.send_state != 0) {
            this.a.getSendMessagesHelper().cancelSendingMessage(messageObject);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void L(int i10, org.telegram.ui.Cells.s1 s1Var) {
        boolean z10 = s1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveaway;
        tn tnVar = this.a;
        if (z10) {
            long j10 = -((TLRPC.TL_messageMediaGiveaway) s1Var.getMessageObject().messageOwner.media).channels.get(i10).longValue();
            if (tnVar.P5 != j10) {
                tnVar.presentFragment(tn.R9(j10));
            } else {
                tnVar.W0.e(false, false);
            }
        }
        if (s1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            tnVar.presentFragment(ProfileActivity.m4(((TLRPC.TL_messageMediaGiveawayResults) s1Var.getMessageObject().messageOwner.media).winners.get(i10).longValue()));
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void L1(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        tn tnVar = this.a;
        tnVar.Z4 = messageObject;
        tnVar.d9();
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean M0(long j10) {
        tn tnVar = this.a;
        TLRPC.Chat chat = tnVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return false;
        }
        return tnVar.getMessagesController().isOwner(tnVar.e.id, j10);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void N(MessageObject messageObject) {
        if (messageObject.isVideo()) {
            this.a.fb(messageObject, true);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void N0(org.telegram.ui.Cells.s1 s1Var) {
        int i10;
        g5.v vVar;
        MessageObject.GroupedMessages groupedMessages;
        int i11;
        tn tnVar = this.a;
        fh.k kVar = tnVar.T9;
        if (kVar == null) {
            return;
        }
        HashMap hashMap = kVar.a;
        fh.j jVar = (fh.j) hashMap.get(fh.k.b(s1Var));
        org.telegram.ui.Components.mc mcVar = null;
        MessageObject messageObject = jVar != null ? jVar.A : null;
        fh.j jVar2 = (fh.j) tnVar.T9.a.get(fh.k.b(s1Var));
        long j10 = (jVar2 == null || (i11 = jVar2.N) == -1) ? 0L : jVar2.w[i11].d;
        if (messageObject != null && j10 != 0) {
            Activity parentActivity = tnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
            if (!org.telegram.ui.Components.c5.h(parentActivity, i10, j10, false)) {
                ArrayList<MessageObject> arrayList = (messageObject.getGroupId() == 0 || (groupedMessages = (MessageObject.GroupedMessages) tnVar.t6.f(messageObject.getGroupId())) == null) ? null : groupedMessages.messages;
                if (arrayList == null) {
                    arrayList = org.telegram.messenger.x3.n(messageObject);
                }
                boolean z10 = j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                long j11 = j10;
                g5.v vVar2 = new g5.v(this, arrayList, j11, 17);
                if (z10) {
                    vVar2.run();
                    vVar = null;
                } else {
                    vVar = vVar2;
                }
                mcVar = org.telegram.ui.Components.tc.v(tnVar.getParentActivity(), tnVar, null, 1, j11, 1, tnVar.getThemedColor(org.telegram.ui.ActionBar.g6.Fi), tnVar.getThemedColor(org.telegram.ui.ActionBar.g6.Hi), 5000, false, vVar);
                mcVar.k = true;
                mcVar.k(mcVar.e instanceof org.telegram.ui.Components.xb);
            }
        }
        fh.j jVar3 = (fh.j) hashMap.get(fh.k.b(s1Var));
        if (jVar3 != null) {
            if (mcVar == null) {
                jVar3.N = -1;
                jVar3.c();
                return;
            }
            org.telegram.ui.Components.rb rbVar = mcVar.e;
            if (!(rbVar instanceof org.telegram.ui.Components.ub)) {
                jVar3.c();
                return;
            }
            org.telegram.ui.Components.ub ubVar = (org.telegram.ui.Components.ub) rbVar;
            jVar3.S = ubVar;
            ubVar.a.setVisibility(4);
            ViewTreeObserver viewTreeObserver = jVar3.S.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new fh.f(0, jVar3, viewTreeObserver));
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void N1(MessageObject messageObject) {
        this.a.s.put(messageObject, Boolean.TRUE);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean O(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        int i10;
        int i11;
        boolean isForwarded = s1Var.getMessageObject().isForwarded();
        tn tnVar = this.a;
        if (isForwarded) {
            long peerDialogId = DialogObject.getPeerDialogId(s1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.tc a02 = org.telegram.ui.Components.tc.a0(tnVar);
            int i12 = R.raw.passcode_lock_close;
            int i13 = R.string.TodoCompleteForbiddenForward;
            i11 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
            a02.Q(i12, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i13, DialogObject.getName(i11, peerDialogId)))).k(true);
            return false;
        }
        if (s1Var.getMessageObject().canCompleteTodo()) {
            if (tnVar.getUserConfig().isPremium()) {
                tnVar.getSendMessagesHelper().toggleTodo(ChatObject.getSendAsPeerId(tnVar.e, tnVar.V7, true), s1Var.getMessageObject(), todoItem, z10, null);
                return true;
            }
            org.telegram.ui.Components.tc.a0(tnVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.TodoPremiumRequired), new pm(this, 9))).k(true);
            return false;
        }
        long peerDialogId2 = DialogObject.getPeerDialogId(s1Var.getMessageObject().getFromPeer());
        org.telegram.ui.Components.tc a03 = org.telegram.ui.Components.tc.a0(tnVar);
        int i14 = R.raw.passcode_lock_close;
        int i15 = R.string.TodoCompleteForbidden;
        i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
        a03.Q(i14, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i15, DialogObject.getName(i10, peerDialogId2)))).k(true);
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void O1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        Uri parse;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        boolean z11 = (z10 || !ye.d.h(str, false, false)) ? z10 : true;
        tn tnVar = this.a;
        ye.c cVar = tnVar.wb;
        if (cVar != null) {
            cVar.a(true);
        }
        tnVar.wb = s1Var.getMessageObject() == null ? null : new bn(this, s1Var);
        if (z11 || ye.d.f(parse, false, null)) {
            ye.d.r(tnVar.getParentActivity(), parse, true, true, false, tnVar.wb, null, false, true, false);
        } else {
            org.telegram.ui.Components.c5.r0(tnVar, str, true, true, true, !z11, tnVar.wb, webPage, tnVar.aa);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean P() {
        tn tnVar = this.a;
        return tnVar.S5[1].size() + tnVar.S5[0].size() > 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void P0(int i10, org.telegram.ui.Cells.s1 s1Var) {
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
        MessageObject messageObject = s1Var.getMessageObject();
        File file = null;
        TLRPC.User user2 = null;
        tn tnVar = this.a;
        if (i10 == 19) {
            ye.c cVar = tnVar.wb;
            if (cVar != null) {
                cVar.a(true);
            }
            final ym ymVar = s1Var.getMessageObject() != null ? new ym(this, s1Var, 2) : null;
            tnVar.wb = ymVar;
            final Activity parentActivity = tnVar.getParentActivity();
            final org.telegram.ui.ActionBar.c6 resourceProvider = tnVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ymVar.d();
            ymVar.b = new eg.k(atomicBoolean, 0);
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
            final String b11 = eg.s.b(messageObject);
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
            final boolean z10 = chat != null && ChatObject.isChannelAndNotMegaGroup(chat);
            final long j10 = messageObject.messageOwner.date * 1000;
            eg.q0.d(messageObject, new Utilities.Callback(atomicBoolean, ymVar, z10, b11, j10, tL_messageMediaGiveaway2, parentActivity, resourceProvider) { // from class: eg.l
                public final /* synthetic */ AtomicBoolean a;
                public final /* synthetic */ ye.c b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ String d;
                public final /* synthetic */ TLRPC.TL_messageMediaGiveaway e;
                public final /* synthetic */ Context f;
                public final /* synthetic */ c6 g;

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
                    c6 c6Var = this.g;
                    if (z11) {
                        s.d(z12, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, c6Var);
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        s.e(z12, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, c6Var);
                    }
                }
            }, new eg.m(atomicBoolean, ymVar, 0));
            return;
        }
        if (i10 == 21) {
            h();
            return;
        }
        if (i10 == 84) {
            tnVar.ua(s1Var);
            return;
        }
        if (i10 == 80) {
            fh.g gVar = org.telegram.ui.Components.lg0.K;
            if (tnVar.getParentActivity() == null) {
                return;
            }
            tnVar.showDialog(new org.telegram.ui.Components.lg0(tnVar.getContext(), tnVar.getCurrentAccount(), messageObject, tnVar.getResourceProvider()));
            return;
        }
        if (i10 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
            if (messageMedia4 == null || (webPage = messageMedia4.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity == null || launchActivity.P() == null || LaunchActivity.C1.P().k(messageObject) == null) {
                tnVar.createArticleViewer(false).N(messageObject, null, null, null);
                return;
            }
            return;
        }
        int i15 = 5;
        if (i10 == 5) {
            long j11 = messageObject.messageOwner.media.user_id;
            if (j11 != 0) {
                i14 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                user = MessagesController.getInstance(i14).getUser(Long.valueOf(j11));
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
                tnVar.presentFragment(new ProfileActivity(bundle, null));
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
                tnVar.showDialog(new org.telegram.ui.Components.ke0(tnVar, null, user, null, file, qe.b.d(str, false), str3, str4, tnVar.aa));
                return;
            } catch (Exception e10) {
                FileLog.e(e10);
                return;
            }
        }
        if (i10 == 30) {
            tnVar.presentFragment(new tn(j7.l1.g(messageObject.messageOwner.media.user_id, "user_id")));
            return;
        }
        if (i10 == 31) {
            long j12 = messageObject.messageOwner.media.user_id;
            if (j12 != 0) {
                i13 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(j12));
            }
            if (user2 != null) {
                if (!TextUtils.isEmpty(messageObject.vCardData)) {
                    b10 = messageObject.vCardData.toString();
                } else if (TextUtils.isEmpty(user2.phone)) {
                    String str5 = MessageObject.getMedia(messageObject.messageOwner).phone_number;
                    b10 = !TextUtils.isEmpty(str5) ? qe.b.c().b(str5) : LocaleController.getString(R.string.NumberUnknown);
                } else {
                    b10 = org.telegram.messenger.x3.k(new StringBuilder("+"), user2.phone, qe.b.c());
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user2.id);
                bundle2.putString("phone", b10);
                bundle2.putBoolean("addContact", true);
                tnVar.presentFragment(new hs(bundle2));
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
            ye.c cVar2 = tnVar.wb;
            if (cVar2 != null) {
                cVar2.a(true);
            }
            tnVar.wb = s1Var.getMessageObject() != null ? new ym(this, s1Var, 3) : null;
            if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                String group = matcher.group(1);
                i11 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                if (MediaDataController.getInstance(i11).getStickerSetByName(group) == null) {
                    tnVar.wb.d();
                    TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_inputStickerSetShortName.short_name = group;
                    tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                    i12 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                    tnVar.wb.b = new bg.f(this, ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickerSet, new nh.l3(i16, this, z11)), 27);
                    return;
                }
            }
            ye.d.r(tnVar.getParentActivity(), Uri.parse(webPage2.url), true, true, false, tnVar.wb, null, false, true, false);
            return;
        }
        if (messageObject.isSponsored()) {
            tnVar.J9(messageObject, false, false);
            if (messageObject.sponsoredUrl != null) {
                ye.c cVar3 = tnVar.wb;
                if (cVar3 != null) {
                    cVar3.a(true);
                }
                tnVar.wb = s1Var.getMessageObject() != null ? new ym(this, s1Var, i16) : null;
                ye.d.r(tnVar.getParentActivity(), Uri.parse(messageObject.sponsoredUrl), true, false, false, tnVar.wb, null, false, tnVar.getMessagesController().sponsoredLinksInappAllow, false);
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
                    tnVar.getOrCreateStoryViewer().G(tnVar.getParentActivity(), tL_webPageAttributeStory.storyItem, lh.b7.a(tnVar.t0));
                    return;
                }
            }
        }
        if (tnVar.ea(storyMentionWebpage.url, s1Var, null, messageObject.getId(), 2)) {
            return;
        }
        ye.c cVar4 = tnVar.wb;
        if (cVar4 != null) {
            cVar4.a(true);
        }
        tnVar.wb = s1Var.getMessageObject() != null ? new ym(this, s1Var, i15) : null;
        ye.d.r(tnVar.getParentActivity(), Uri.parse(storyMentionWebpage.url), true, true, false, tnVar.wb, null, false, true, false);
    }

    @Override // org.telegram.ui.Cells.j1
    public final CharacterStyle P1(org.telegram.ui.Cells.s1 s1Var) {
        tn tnVar;
        int i10;
        if (s1Var.getMessageObject() == null || (i10 = (tnVar = this.a).sb) == 0 || i10 != s1Var.getMessageObject().getId() || tnVar.tb != 1) {
            return null;
        }
        return tnVar.ub;
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean Q(org.telegram.ui.Cells.s1 s1Var) {
        int i10;
        MessageObject messageObject;
        TLRPC.Message message;
        if (s1Var == null) {
            return false;
        }
        tn tnVar = this.a;
        if (tnVar.getParentActivity() == null) {
            return false;
        }
        i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
        if (!MessagesController.getInstance(i10).richEditorAllowed() || (messageObject = s1Var.getMessageObject()) == null || (message = messageObject.messageOwner) == null || message.rich_message == null) {
            return false;
        }
        if (!messageObject.translated || message.translatedRichMessage == null) {
            return messageObject.canEditMessage(tnVar.e);
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void Q1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        try {
            tn tnVar = this.a;
            org.telegram.ui.Components.mu.I(tnVar, messageObject, tnVar.Ba, str2, str3, str4, str, i10, i11, -1, tnVar.x9());
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean R() {
        tn tnVar = this.a;
        return UserObject.isReplyUser(tnVar.f) || UserObject.isUserSelf(tnVar.f);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void R0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        tn tnVar = this.a;
        tnVar.getSendMessagesHelper().sendCallback(true, s1Var.getMessageObject(), keyboardInlineButton, tnVar);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean R1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        ViewGroup viewGroup;
        int i10;
        d41 d41Var;
        if (messageObject.isVoiceOnce() || messageObject.isRoundOnce()) {
            f41 f41Var = this.a.V9;
            if (f41Var == null || f41Var.X) {
                try {
                    AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!messageObject.isOutOwner()) {
                            org.telegram.ui.Components.tc.a0(this.a).w(R.drawable.tooltip_sound, LocaleController.getString(R.string.VoiceOnceTurnOnSound)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.a.V9 = new f41(this.a.getParentActivity());
                f41 f41Var2 = this.a.V9;
                ke fb2 = !messageObject.isOutOwner() ? this.a.fb(messageObject, true) : null;
                g5.v O4 = !messageObject.isOutOwner() ? tn.O4(this.a, messageObject) : null;
                Context context = f41Var2.a;
                bg.d1 d1Var = f41Var2.c;
                f41Var2.T = fb2;
                f41Var2.U = O4;
                d41 d41Var2 = f41Var2.J;
                if (d41Var2 != null) {
                    d1Var.removeView(d41Var2);
                    f41Var2.J = null;
                }
                f41Var2.K = s1Var;
                MessageObject messageObject2 = s1Var.getMessageObject();
                f41Var2.I = messageObject2;
                f41Var2.O = messageObject2 != null && messageObject2.isRoundVideo();
                org.telegram.ui.Cells.s1 s1Var2 = f41Var2.K;
                f41Var2.H = s1Var2 != null ? s1Var2.getResourcesProvider() : null;
                if (f41Var2.K != null) {
                    f41Var2.P = 0.0f;
                    f41Var2.Q = s1Var.n;
                    if (s1Var.getParent() instanceof View) {
                        View view = (View) s1Var.getParent();
                        f41Var2.P = view.getY() + f41Var2.P;
                        f41Var2.Q = view.getY() + f41Var2.Q;
                    }
                    int width = f41Var2.K.getWidth();
                    int height = f41Var2.K.getHeight();
                    if (f41Var2.O) {
                        height = Math.min(AndroidUtilities.dp(360.0f), Math.min(width, AndroidUtilities.displaySize.y));
                    }
                    int i11 = height;
                    f41Var2.G = i11 - f41Var2.K.getHeight();
                    i10 = (int) Math.ceil((Math.min(width, i11) * 0.92f) / AndroidUtilities.density);
                    viewGroup = d1Var;
                    d41 d41Var3 = new d41(f41Var2, f41Var2.getContext(), UserConfig.selectedAccount, f41Var2.K.getResourcesProvider(), width, i11);
                    f41Var2.J = d41Var3;
                    f41Var2.K.j1(d41Var3);
                    f41Var2.J.i1(f41Var2.K);
                    f41Var2.J.setDelegate(new f7.v(18));
                    d41 d41Var4 = f41Var2.J;
                    MessageObject messageObject3 = f41Var2.I;
                    MessageObject.GroupedMessages currentMessagesGroup = f41Var2.K.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.s1 s1Var3 = f41Var2.K;
                    d41Var4.X3(messageObject3, currentMessagesGroup, s1Var3.B, s1Var3.A, false, false);
                    if (!f41Var2.O) {
                        org.telegram.ui.Components.h8 h8Var = new org.telegram.ui.Components.h8();
                        f41Var2.R = h8Var;
                        d41 d41Var5 = f41Var2.J;
                        h8Var.i = d41Var5;
                        d41Var5.ae = h8Var;
                        if (d41Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.co0 seekBarWaveform = f41Var2.J.getSeekBarWaveform();
                            seekBarWaveform.L = f41Var2.s;
                            org.telegram.ui.Cells.s1 s1Var4 = seekBarWaveform.n;
                            if (s1Var4 != null) {
                                s1Var4.invalidate();
                            }
                        }
                    }
                    f41Var2.D = false;
                    viewGroup.addView(f41Var2.J, new FrameLayout.LayoutParams(f41Var2.K.getWidth(), i11, 17));
                } else {
                    viewGroup = d1Var;
                    i10 = 360;
                }
                TextureView textureView = f41Var2.L;
                if (textureView != null) {
                    viewGroup.removeView(textureView);
                    f41Var2.L = null;
                }
                if (f41Var2.O) {
                    f41Var2.M = false;
                    TextureView textureView2 = new TextureView(context);
                    f41Var2.L = textureView2;
                    viewGroup.addView(textureView2, 0, i7.f6.c(i10, i10));
                }
                MediaController.getInstance().pauseByRewind();
                org.telegram.ui.Components.x61 x61Var = f41Var2.w;
                if (x61Var != null) {
                    x61Var.C();
                    f41Var2.w.I();
                    f41Var2.w = null;
                }
                org.telegram.ui.Cells.s1 s1Var5 = f41Var2.K;
                if (s1Var5 != null && s1Var5.getMessageObject() != null) {
                    File pathToAttach = FileLoader.getInstance(f41Var2.K.getMessageObject().currentAccount).getPathToAttach(f41Var2.K.getMessageObject().getDocument());
                    if (pathToAttach != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && (pathToAttach = FileLoader.getInstance(f41Var2.K.getMessageObject().currentAccount).getPathToMessage(f41Var2.K.getMessageObject().messageOwner)) != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && f41Var2.K.getMessageObject().messageOwner.attachPath != null) {
                        pathToAttach = new File(f41Var2.K.getMessageObject().messageOwner.attachPath);
                    }
                    if (pathToAttach != null && pathToAttach.exists()) {
                        org.telegram.ui.Components.x61 x61Var2 = new org.telegram.ui.Components.x61();
                        f41Var2.w = x61Var2;
                        x61Var2.F = new e41(f41Var2);
                        if (f41Var2.R != null) {
                            x61Var2.G = new e41(f41Var2);
                        }
                        if (f41Var2.O) {
                            x61Var2.W(f41Var2.L);
                        }
                        f41Var2.w.E(Uri.fromFile(pathToAttach), "other");
                        f41Var2.w.D();
                        org.telegram.ui.Components.bt btVar = f41Var2.A;
                        if (btVar != null) {
                            btVar.s = f41Var2.w;
                            btVar.a();
                        }
                    }
                    tn tnVar = this.a;
                    tnVar.showDialog(tnVar.V9);
                    return false;
                }
                nh.t3 t3Var = f41Var2.x;
                if (t3Var != null) {
                    viewGroup.removeView(t3Var);
                    f41Var2.x = null;
                }
                MessageObject messageObject4 = f41Var2.I;
                boolean z10 = messageObject4 != null && messageObject4.isOutOwner();
                MessageObject messageObject5 = f41Var2.I;
                if (messageObject5 != null && messageObject5.getDialogId() != UserConfig.getInstance(f41Var2.I.currentAccount).getClientUserId()) {
                    nh.t3 t3Var2 = new nh.t3(context, 3);
                    f41Var2.x = t3Var2;
                    t3Var2.q(true);
                    if (z10) {
                        long dialogId = f41Var2.I.getDialogId();
                        String str = "";
                        if (dialogId > 0) {
                            TLRPC.User user = MessagesController.getInstance(f41Var2.I.currentAccount).getUser(Long.valueOf(dialogId));
                            if (user != null) {
                                str = UserObject.getFirstName(user);
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(f41Var2.I.currentAccount).getChat(Long.valueOf(-dialogId));
                            if (chat != null) {
                                str = chat.title;
                            }
                        }
                        f41Var2.x.t(AndroidUtilities.replaceTags(LocaleController.formatString(f41Var2.O ? R.string.VideoOnceOutHint : R.string.VoiceOnceOutHint, str)));
                    } else {
                        f41Var2.x.t(AndroidUtilities.replaceTags(LocaleController.getString(f41Var2.O ? R.string.VideoOnceHint : R.string.VoiceOnceHint)));
                    }
                    f41Var2.x.r(12.0f);
                    f41Var2.x.setPadding(AndroidUtilities.dp((z10 || f41Var2.K.B) ? 0.0f : 6.0f), 0, 0, 0);
                    if (f41Var2.O) {
                        f41Var2.x.n(0.5f, 0.0f);
                        f41Var2.x.G = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        f41Var2.x.n(0.0f, AndroidUtilities.dp(34.0f));
                        f41Var2.x.G = Layout.Alignment.ALIGN_NORMAL;
                    }
                    f41Var2.x.u(14.0f);
                    nh.t3 t3Var3 = f41Var2.x;
                    t3Var3.h = nh.t3.a(t3Var3.getText(), f41Var2.x.getTextPaint());
                    if (f41Var2.O) {
                        viewGroup.addView(f41Var2.x, i7.f6.d((int) ((f41Var2.K.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((f41Var2.K.getHeight() + f41Var2.G) / AndroidUtilities.density) / 2.0f), 0.0f, 0.0f));
                    } else {
                        viewGroup.addView(f41Var2.x, i7.f6.d((int) ((f41Var2.K.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, ((((f41Var2.K.getWidth() * (-0.39999998f)) / 2.0f) + f41Var2.K.getBoundsLeft()) / AndroidUtilities.density) + 1.0f, ((-75.0f) - ((f41Var2.K.getHeight() / AndroidUtilities.density) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    f41Var2.x.v();
                }
                TextView textView = f41Var2.y;
                if (textView != null) {
                    viewGroup.removeView(textView);
                    f41Var2.y = null;
                }
                TextView textView2 = new TextView(context);
                f41Var2.y = textView2;
                textView2.setTextColor(-1);
                f41Var2.y.setTypeface(AndroidUtilities.bold());
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f41Var2.y.setBackground(org.telegram.ui.ActionBar.g6.i0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    f41Var2.y.setBackground(org.telegram.ui.ActionBar.g6.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                f41Var2.y.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
                i7.h6.a(f41Var2.y);
                f41Var2.y.setText(LocaleController.getString(z10 ? R.string.VoiceOnceClose : R.string.VoiceOnceDeleteClose));
                f41Var2.y.setOnClickListener(new b41(f41Var2, 1));
                viewGroup.addView(f41Var2.y, i7.f6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z10 && (d41Var = f41Var2.J) != null && d41Var.getMessageObject() != null && f41Var2.J.getMessageObject().messageOwner != null) {
                    f41Var2.J.getMessageObject().messageOwner.media_unread = false;
                    f41Var2.J.invalidate();
                }
                tn tnVar2 = this.a;
                tnVar2.showDialog(tnVar2.V9);
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
                ArrayList L = this.a.w0.L();
                tn tnVar3 = this.a;
                return mediaController.setPlaylist(L, messageObject, tnVar3.H6, true ^ tnVar3.w0.J, null);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void S(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        MessageObject messageObject;
        if (chat == null) {
            return;
        }
        tn tnVar = this.a;
        lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
        if (lVar.s() || tnVar.A9()) {
            tn.b2(tnVar, s1Var, true, f9, f10);
            return;
        }
        if (z10 || !chat.signature_profiles || (messageObject = s1Var.getMessageObject()) == null || messageObject.getDialogId() == UserObject.REPLY_BOT) {
            m(s1Var, chat, i10, z10);
        } else {
            tnVar.na(DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void S1() {
        org.telegram.ui.ActionBar.c6 c6Var;
        tn tnVar = this.a;
        if (tnVar.T0 == null || tnVar.getParentActivity() == null) {
            return;
        }
        Context context = tnVar.T0.getContext();
        c6Var = ((org.telegram.ui.ActionBar.o2) tnVar).resourceProvider;
        d31.T(context, tnVar, false, c6Var, null);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void T(org.telegram.ui.Cells.s1 s1Var) {
        i(s1Var, true, true, false);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void U1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        ri riVar;
        int i10;
        MessageObject messageObject = s1Var.getMessageObject();
        bg.f fVar = null;
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
                        TLRPC.TL_message C7 = tn.C7(message);
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
                tn tnVar = this.a;
                t12.K2(null, tnVar, tnVar.aa);
                PhotoViewer.t1().a2(arrayList, i11, this.a.a(), 0L, 0L, this.a.Ca);
                return;
            }
            return;
        }
        tn tnVar2 = this.a;
        ye.c cVar = tnVar2.wb;
        if (cVar != null) {
            cVar.a(true);
            tnVar2.wb = null;
        }
        if (s1Var.getMessageObject() == null) {
            tnVar2.wb = null;
            riVar = null;
        } else {
            riVar = new ri(tnVar2, s1Var.getMessageObject().getId(), s1Var, 1);
            tnVar2.wb = riVar;
        }
        i10 = ((org.telegram.ui.ActionBar.o2) this.a).currentAccount;
        jh.s7 y8 = jh.s7.y(i10, false);
        Objects.requireNonNull(riVar);
        ui uiVar = new ui(riVar, 7);
        Context context = LaunchActivity.C1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        org.telegram.ui.ActionBar.c6 I = jh.s7.I();
        if (messageObject != null && context != null) {
            long dialogId = messageObject.getDialogId();
            int id2 = messageObject.getId();
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = MessagesController.getInstance(y8.a).getInputPeer(dialogId);
            tL_inputInvoiceMessage.msg_id = id2;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject p10 = ph.p2.p(I, false);
            if (p10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
            fVar = new bg.f(y8, ConnectionsManager.getInstance(y8.a).sendRequest(tL_payments_getPaymentForm, new ih.c1(y8, messageObject, tL_inputInvoiceMessage, uiVar, 4)), 7);
        }
        if (fVar != null) {
            riVar.b = fVar;
            riVar.d();
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final int V() {
        return this.a.N3;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void V0(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z10) {
        this.a.U7(characterStyle, z10, s1Var.getMessageObject(), s1Var);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void V1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10;
        int i11;
        ImageLocation forDocument;
        String str2;
        boolean isEmpty = TextUtils.isEmpty(str);
        tn tnVar = this.a;
        if (!isEmpty) {
            ye.d.s(tnVar.getParentActivity(), "https://" + tnVar.getMessagesController().linkPrefix + "/nft/" + str);
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
        cg.f2 f2Var = new cg.f2(tnVar, i10, user, null, null, tnVar.aa);
        s1Var.getLocationOnScreen(new int[2]);
        f2Var.r0 = s1Var.getNameStatusX();
        f2Var.s0 = s1Var.getNameStatusY();
        f2Var.v0 = s1Var.getScaleX();
        f2Var.t0 = s1Var.getLeft();
        f2Var.u0 = s1Var.getTop();
        f2Var.w0 = s1Var;
        int colorId = UserObject.getColorId(user);
        if (colorId < 7) {
            f2Var.q0 = Integer.valueOf(tnVar.getThemedColor(org.telegram.ui.ActionBar.g6.r8[colorId]));
        } else {
            i11 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
            MessagesController.PeerColors peerColors = MessagesController.getInstance(i11).peerColors;
            MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(colorId) : null;
            f2Var.q0 = color != null ? Integer.valueOf(color.getColor1()) : null;
        }
        org.telegram.ui.Components.n5 n5Var = s1Var.bc;
        if (n5Var != null && (n5Var.f[0] instanceof org.telegram.ui.Components.p5)) {
            f2Var.v0 *= 0.95f;
            if (document != null) {
                org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(tnVar.getParentActivity());
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.g6.m6, 0.2f);
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
                t9Var.setLayerNum(7);
                t9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                t9Var.l(imageLocation, str3, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "140_140", svgThumb, document);
                if (MessageObject.isTextColorEmoji(document)) {
                    Integer num = f2Var.q0;
                    t9Var.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : tnVar.getThemedColor(org.telegram.ui.ActionBar.g6.v6), PorterDuff.Mode.SRC_IN));
                    f2Var.y0 = MessageObject.getInputStickerSet(document);
                } else {
                    f2Var.y0 = MessageObject.getInputStickerSet(document);
                }
                f2Var.x0 = t9Var;
                f2Var.A0 = true;
            }
        }
        tnVar.showDialog(f2Var);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean W0(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
        MessageObject messageObject = (currentMessagesGroup == null || currentMessagesGroup.messages.isEmpty()) ? s1Var.getMessageObject() : currentMessagesGroup.messages.get(0);
        if (messageObject != null) {
            tn tnVar = this.a;
            boolean z11 = !tnVar.fc && messageObject.getId() == tnVar.ec;
            if (!z10) {
                return z11;
            }
            if (z11 && System.currentTimeMillis() - tnVar.gc > 1000) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:310:0x067f, code lost:
    
        if (r4.paid_reactions_available != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0685, code lost:
    
        if (r7.isEmpty() == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x06b5, code lost:
    
        if (r4.paid_reactions_available != false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x06d1, code lost:
    
        if (r7.isEmpty() != false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x06bf, code lost:
    
        if (org.telegram.messenger.ChatObject.isChannel(r5.e) == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x06cb, code lost:
    
        if (org.telegram.messenger.ChatObject.isMonoForum(r5.e) != false) goto L190;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0819  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0844 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0856  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x099d A[LOOP:3: B:254:0x099b->B:255:0x099d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0a06  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0a1e  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0aa0  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x093c  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x068b  */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v30, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, org.telegram.ui.Components.j70] */
    /* JADX WARN: Type inference failed for: r1v50, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r29v7 */
    /* JADX WARN: Type inference failed for: r3v53, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r3v73, types: [java.lang.Object, org.telegram.ui.Components.j70] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.view.ViewGroup, org.telegram.ui.ev0] */
    /* JADX WARN: Type inference failed for: r7v71 */
    /* JADX WARN: Type inference failed for: r7v76 */
    /* JADX WARN: Type inference failed for: r7v79 */
    /* JADX WARN: Type inference failed for: r7v80 */
    /* JADX WARN: Type inference failed for: r9v2, types: [android.view.ViewGroup] */
    @Override // org.telegram.ui.Cells.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean W1(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        iv0 iv0Var;
        TLRPC.PollAnswer pollAnswer2;
        iv0 iv0Var2;
        ViewGroup viewGroup;
        qe qeVar;
        MessageObject messageObject;
        boolean z10;
        ev0 ev0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        qe qeVar2;
        boolean z14;
        iv0 iv0Var3;
        ArrayList arrayList;
        tn tnVar;
        MessageObject messageObject2;
        ArrayList arrayList2;
        MessageObject messageObject3;
        int size;
        int i10;
        ViewGroup viewGroup2;
        boolean z15;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        boolean z16;
        byte[] bArr;
        ViewGroup viewGroup3;
        TLRPC.PollAnswerVoters pollAnswerVoters;
        boolean z17;
        iv0 iv0Var4;
        ArrayList arrayList3;
        byte[] bArr2;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll2;
        TLRPC.PollAnswer pollAnswer3;
        tn tnVar2;
        boolean z18;
        String str;
        bh.u uVar;
        ?? r12;
        ArrayList<TLRPC.PollAnswerVoters> arrayList4;
        tn tnVar3 = this.a;
        if (tnVar3.getParentActivity() != null && tnVar3.getParentActivity() != null) {
            nh.t3 t3Var = tnVar3.t1;
            if (t3Var != null && t3Var.R) {
                t3Var.e(true);
            }
            pl plVar = tnVar3.x1;
            if (plVar != null && plVar.R) {
                plVar.e(true);
            }
            MessageObject primaryMessageObject = s1Var.getPrimaryMessageObject();
            TLRPC.MessageMedia media = MessageObject.getMedia(primaryMessageObject);
            if (primaryMessageObject != null && (media instanceof TLRPC.TL_messageMediaPoll)) {
                tnVar3.Z4 = primaryMessageObject;
                tnVar3.a5 = null;
                iv0 iv0Var5 = new iv0(tnVar3.getParentActivity(), tnVar3.getResourceProvider());
                byte[] bArr3 = pollAnswer.option;
                iv0Var5.H = s1Var;
                iv0Var5.L = bArr3;
                MessageObject messageObject4 = s1Var.getMessageObject();
                iv0Var5.D = messageObject4;
                iv0Var5.E = messageObject4 != null && messageObject4.isOutOwner();
                org.telegram.ui.Cells.s1 s1Var2 = iv0Var5.H;
                ?? r72 = iv0Var5.d;
                if (s1Var2 != null) {
                    iv0Var5.I = tnVar3.o9 - AndroidUtilities.dp(4.0f);
                    iv0Var5.J = s1Var.n;
                    if (s1Var.getParent() instanceof View) {
                        View view = (View) s1Var.getParent();
                        iv0Var5.I = view.getY() + iv0Var5.I;
                        iv0Var5.J = view.getY() + iv0Var5.J;
                    }
                    int width = iv0Var5.H.getWidth();
                    int height = iv0Var5.H.getHeight();
                    iv0Var5.H.getHeight();
                    gv0 gv0Var = new gv0(iv0Var5, iv0Var5.getContext(), UserConfig.selectedAccount, iv0Var5.H.getResourcesProvider(), bArr3, width, height);
                    iv0Var = iv0Var5;
                    iv0Var.F = gv0Var;
                    iv0Var.H.h1(gv0Var);
                    iv0Var.F.i1(iv0Var.H);
                    iv0Var.F.setDelegate(new ab.b(18));
                    gv0 gv0Var2 = iv0Var.F;
                    MessageObject messageObject5 = iv0Var.D;
                    MessageObject.GroupedMessages currentMessagesGroup = iv0Var.H.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.s1 s1Var3 = iv0Var.H;
                    gv0Var2.X3(messageObject5, currentMessagesGroup, s1Var3.B, s1Var3.A, s1Var3.C, false);
                    gv0 gv0Var3 = iv0Var.F;
                    gv0Var3.I7 = bArr3;
                    r72.addView(gv0Var3, new FrameLayout.LayoutParams(iv0Var.H.getWidth(), height, 51));
                    hv0 hv0Var = new hv0(iv0Var.getContext(), UserConfig.selectedAccount, iv0Var.H.getResourcesProvider(), width, height, 0);
                    iv0Var.G = hv0Var;
                    iv0Var.H.j1(hv0Var);
                    iv0Var.H.h1(iv0Var.G);
                    iv0Var.G.i1(iv0Var.H);
                    iv0Var.G.setDelegate(new ya.a(17));
                    hv0 hv0Var2 = iv0Var.G;
                    MessageObject messageObject6 = iv0Var.D;
                    MessageObject.GroupedMessages currentMessagesGroup2 = iv0Var.H.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.s1 s1Var4 = iv0Var.H;
                    hv0Var2.X3(messageObject6, currentMessagesGroup2, s1Var4.B, s1Var4.A, s1Var4.C, false);
                    r72.addView(iv0Var.G, new FrameLayout.LayoutParams(iv0Var.H.getWidth(), height, 51));
                } else {
                    iv0Var = iv0Var5;
                }
                nh.g1 g1Var = iv0Var.f;
                g1Var.bringToFront();
                ev0 ev0Var2 = iv0Var.e;
                ev0Var2.bringToFront();
                iv0Var.n.bringToFront();
                g1Var.w(false);
                Context context = iv0Var.a;
                View view2 = new View(context);
                org.telegram.ui.ActionBar.c6 c6Var = iv0Var.b;
                ?? G = org.telegram.ui.Components.j70.G(r72, c6Var, view2, true);
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll3 = (TLRPC.TL_messageMediaPoll) MessageObject.getMedia(iv0Var.D);
                iv0Var.R = MessageObject.isVoted(tL_messageMediaPoll3);
                int i11 = 0;
                while (true) {
                    if (i11 >= tL_messageMediaPoll3.poll.answers.size()) {
                        pollAnswer2 = null;
                        break;
                    }
                    if (Arrays.equals(tL_messageMediaPoll3.poll.answers.get(i11).option, bArr3)) {
                        pollAnswer2 = tL_messageMediaPoll3.poll.answers.get(i11);
                        break;
                    }
                    i11++;
                }
                lg.a aVar = iv0Var.C;
                if (pollAnswer2 != null) {
                    TLRPC.Poll poll = tL_messageMediaPoll3.poll;
                    boolean z19 = (poll.closed || poll.revoting_disabled) ? false : true;
                    boolean z20 = poll.multiple_choice;
                    ArrayList arrayList5 = new ArrayList();
                    TLRPC.PollResults pollResults = tL_messageMediaPoll3.results;
                    if (pollResults == null || (arrayList4 = pollResults.results) == null) {
                        tL_messageMediaPoll = tL_messageMediaPoll3;
                        z16 = z20;
                        bArr = bArr3;
                        viewGroup3 = r72;
                        pollAnswerVoters = null;
                        z17 = false;
                    } else {
                        int size2 = arrayList4.size();
                        z16 = z20;
                        int i12 = 0;
                        z17 = false;
                        TLRPC.PollAnswerVoters pollAnswerVoters2 = null;
                        while (i12 < size2) {
                            TLRPC.PollAnswerVoters pollAnswerVoters3 = arrayList4.get(i12);
                            int i13 = i12 + 1;
                            TLRPC.PollAnswerVoters pollAnswerVoters4 = pollAnswerVoters3;
                            ?? r29 = r72;
                            boolean equals = Arrays.equals(pollAnswerVoters4.option, bArr3);
                            if (equals) {
                                pollAnswerVoters2 = pollAnswerVoters4;
                            }
                            byte[] bArr4 = bArr3;
                            if (pollAnswerVoters4.chosen) {
                                if (equals) {
                                    z17 = true;
                                }
                                ArrayList<TLRPC.PollAnswer> arrayList6 = tL_messageMediaPoll3.poll.answers;
                                int size3 = arrayList6.size();
                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll4 = tL_messageMediaPoll3;
                                int i14 = 0;
                                while (i14 < size3) {
                                    TLRPC.PollAnswer pollAnswer4 = arrayList6.get(i14);
                                    int i15 = i14 + 1;
                                    TLRPC.PollAnswer pollAnswer5 = pollAnswer4;
                                    ArrayList<TLRPC.PollAnswer> arrayList7 = arrayList6;
                                    int i16 = size3;
                                    if (Arrays.equals(pollAnswer5.option, pollAnswerVoters4.option)) {
                                        arrayList5.add(pollAnswer5);
                                    }
                                    arrayList6 = arrayList7;
                                    i14 = i15;
                                    size3 = i16;
                                }
                                r72 = r29;
                                i12 = i13;
                                bArr3 = bArr4;
                                tL_messageMediaPoll3 = tL_messageMediaPoll4;
                            } else {
                                r72 = r29;
                                i12 = i13;
                                bArr3 = bArr4;
                            }
                        }
                        tL_messageMediaPoll = tL_messageMediaPoll3;
                        bArr = bArr3;
                        viewGroup3 = r72;
                        pollAnswerVoters = pollAnswerVoters2;
                    }
                    if (pollAnswerVoters == null || pollAnswerVoters.voters <= 0 || !MessageObject.canShowVotersList(tL_messageMediaPoll)) {
                        iv0Var4 = iv0Var;
                        arrayList3 = arrayList5;
                        viewGroup = viewGroup3;
                        bArr2 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                    } else {
                        bh.u uVar2 = new bh.u(context, tnVar3.getCurrentAccount(), c6Var);
                        ?? J = G.J();
                        J.T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
                        og.d j10 = pg.a.j(c6Var);
                        LinearLayout linearLayout = J.B;
                        if (linearLayout != null) {
                            uVar = uVar2;
                            r12 = 0;
                            ng.d c3 = aVar.c(linearLayout, null, false);
                            c3.n(j10);
                            linearLayout.setBackground(c3);
                        } else {
                            uVar = uVar2;
                            r12 = 0;
                        }
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new it0(G, 25), r12);
                        J.k();
                        long dialogId = iv0Var.D.getDialogId();
                        int id2 = iv0Var.D.getId();
                        int i17 = pollAnswerVoters.voters;
                        arrayList3 = arrayList5;
                        yu0 yu0Var = new yu0(r12, iv0Var, tnVar3);
                        iv0Var4 = iv0Var;
                        bh.u uVar3 = uVar;
                        viewGroup = viewGroup3;
                        byte[] bArr5 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                        org.telegram.ui.Components.u51 a2 = uVar3.a(tnVar3, dialogId, id2, bArr5, i17, yu0Var);
                        tnVar3 = tnVar3;
                        bArr2 = bArr5;
                        J.q(a2);
                        uVar3.setMinimumHeight(AndroidUtilities.dp(48.0f));
                        uVar3.setText(LocaleController.formatPluralString("PollVotesCount", pollAnswerVoters.voters, new Object[0]));
                        uVar3.a.d(pollAnswerVoters.recent_voters, false);
                        uVar3.setLayoutParams(i7.f6.n(-1, 48));
                        uVar3.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I5, false), 12, 0));
                        uVar3.setOnClickListener(new t70(15, G, J));
                        G.q(uVar3);
                        G.k();
                    }
                    if (!z19) {
                        pollAnswer3 = pollAnswer2;
                        iv0Var2 = iv0Var4;
                    } else if (z17) {
                        int i18 = R.drawable.msg_unvote;
                        String string = LocaleController.getString(R.string.Unvote);
                        tn tnVar4 = tnVar3;
                        TLRPC.PollAnswer pollAnswer6 = pollAnswer2;
                        iv0Var2 = iv0Var4;
                        zu0 zu0Var = new zu0(iv0Var2, z16, tnVar4, arrayList3, pollAnswer6);
                        tnVar3 = tnVar4;
                        pollAnswer3 = pollAnswer6;
                        G.c(i18, string, zu0Var, false);
                    } else {
                        pollAnswer3 = pollAnswer2;
                        iv0Var2 = iv0Var4;
                        boolean z21 = z16;
                        if (bh.l.a(iv0Var2.D) == 0) {
                            G.c(R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), new zu0(iv0Var2, z21, pollAnswer3, tnVar3, arrayList3), false);
                        }
                    }
                    if (tnVar3.E6()) {
                        G.c(R.drawable.menu_reply, LocaleController.getString(R.string.PollItemQuote), new xe0(iv0Var2, tnVar3, pollAnswer3, 21), false);
                    }
                    if (iv0Var2.D.getDialogId() >= 0 || pollAnswer3.option == null) {
                        tnVar2 = tnVar3;
                        z18 = false;
                    } else {
                        MessagesController messagesController = MessagesController.getInstance(iv0Var2.D.currentAccount);
                        tnVar2 = tnVar3;
                        String publicUsername = DialogObject.getPublicUsername(messagesController.getUserOrChat(iv0Var2.D.getDialogId()));
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(messagesController.linkPrefix);
                        sb2.append("/");
                        if (TextUtils.isEmpty(publicUsername)) {
                            StringBuilder sb3 = new StringBuilder("c/");
                            str = "/";
                            sb3.append(-iv0Var2.D.getDialogId());
                            publicUsername = sb3.toString();
                        } else {
                            str = "/";
                        }
                        sb2.append(publicUsername);
                        sb2.append(str);
                        sb2.append(iv0Var2.D.getId());
                        sb2.append("?option=");
                        sb2.append(new String(Base64.encode(pollAnswer3.option, 9)));
                        z18 = false;
                        G.c(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new av0(0 == true ? 1 : 0, iv0Var2, sb2.toString()), false);
                    }
                    G.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new av0(1, iv0Var2, pollAnswer3), z18);
                    TLRPC.Peer peer = pollAnswer3.added_by;
                    if (peer != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        long clientUserId = UserConfig.getInstance(iv0Var2.D.currentAccount).getClientUserId();
                        long currentTime = ConnectionsManager.getInstance(iv0Var2.D.currentAccount).getCurrentTime();
                        long j11 = MessagesController.getInstance(iv0Var2.D.currentAccount).config.pollAnswerDeletePeriod.get(TimeUnit.SECONDS) + pollAnswer3.date;
                        if (!iv0Var2.D.isForwarded()) {
                            TLRPC.Poll poll2 = tL_messageMediaPoll2.poll;
                            if (!poll2.closed && (poll2.creator || (peerDialogId == clientUserId && currentTime < j11))) {
                                G.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new av0(2, iv0Var2, bArr2), true);
                            }
                        }
                        G.k();
                        TLObject userOrChat = MessagesController.getInstance(iv0Var2.D.currentAccount).getUserOrChat(peerDialogId);
                        CharSequence replaceTags = AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.PollAddedByAtTime, DialogObject.getShortName(userOrChat), LocaleController.formatDateTime(pollAnswer3.date, true)));
                        tnVar3 = tnVar2;
                        dc0 dc0Var = new dc0(iv0Var2, peerDialogId, tnVar3, 1);
                        Context context2 = G.e;
                        ?? frameLayout = new FrameLayout(context2);
                        int i19 = org.telegram.ui.ActionBar.g6.i6;
                        org.telegram.ui.ActionBar.c6 c6Var2 = G.d;
                        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(i19, c6Var2), 0, 12));
                        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context2);
                        t9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
                        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
                        e9Var.p(userOrChat);
                        t9Var.e(userOrChat, e9Var);
                        frameLayout.addView(t9Var, i7.f6.d(34, 34.0f, 51, 13.0f, 11.0f, 0.0f, 11.0f));
                        TextView textView = new TextView(context2);
                        b.m(org.telegram.ui.ActionBar.g6.j5, c6Var2, textView, 1, 14.0f);
                        textView.setText(replaceTags);
                        textView.setMaxWidth(AndroidUtilities.dp(150.0f));
                        textView.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                        frameLayout.addView(textView, i7.f6.d(-2, -2.0f, 55, 59.0f, 8.0f, 16.0f, 0.0f));
                        frameLayout.setOnClickListener(new org.telegram.ui.Components.t2(25, G, dc0Var));
                        G.r(frameLayout, i7.f6.n(-1, -2));
                        G.T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
                        G.Q(aVar, pg.a.j(c6Var), false);
                        G.Y();
                        ViewGroup viewGroup4 = G.A;
                        iv0Var2.N = viewGroup4;
                        viewGroup4.setPivotX(0.0f);
                        iv0Var2.N.setPivotY(0.0f);
                        ev0Var2.addView(iv0Var2.N, i7.f6.e(-2, -2, 51));
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        tnVar3.n8(primaryMessageObject, arrayList8, arrayList9, arrayList10);
                        qeVar = new qe(tnVar3, 6);
                        messageObject = iv0Var2.D;
                        List<TLRPC.TL_availableReaction> enabledReactionsList = tnVar3.getMediaDataController().getEnabledReactionsList();
                        z10 = tnVar3.w() && !tnVar3.c() && tnVar3.f == null && messageObject.hasReactions() && !((ChatObject.isChannel(tnVar3.e) && !tnVar3.e.megagroup) || ChatObject.isMonoForum(tnVar3.e) || enabledReactionsList.isEmpty() || !messageObject.messageOwner.reactions.can_see_list || messageObject.isSecretMedia());
                        if (messageObject.isForwardedChannelPost()) {
                            ev0Var = ev0Var2;
                            if (!messageObject.isSecretMedia()) {
                                if (tnVar3.N3 != 5) {
                                    if (!tnVar3.w()) {
                                        if (!tnVar3.c()) {
                                            if (messageObject.isReactionsAvailable()) {
                                                TLRPC.ChatFull chatFull2 = tnVar3.V7;
                                                if (chatFull2 != null) {
                                                    if (chatFull2.available_reactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    }
                                                }
                                                if (chatFull2 == null) {
                                                }
                                                if (tnVar3.f == null) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            z11 = false;
                        } else {
                            ev0Var = ev0Var2;
                            TLRPC.ChatFull chatFull3 = tnVar3.getMessagesController().getChatFull(-messageObject.getFromChatId());
                            if (chatFull3 != null) {
                                if (!tnVar3.w()) {
                                    if (tnVar3.N3 != 5) {
                                        if (!tnVar3.c()) {
                                            if (messageObject.isReactionsAvailable()) {
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
                        z12 = z11;
                        z13 = (!z10 || tnVar3.c() || tnVar3.e == null || !messageObject.isOutOwner() || !messageObject.isSent() || messageObject.isEditing() || messageObject.isSending() || messageObject.isSendError() || messageObject.isContentUnread() || messageObject.isUnread() || ConnectionsManager.getInstance(tnVar3.getCurrentAccount()).getCurrentTime() - messageObject.messageOwner.date >= tnVar3.getMessagesController().chatReadMarkExpirePeriod || (!ChatObject.isMegagroup(tnVar3.e) && ChatObject.isChannel(tnVar3.e)) || (chatFull = tnVar3.V7) == null || chatFull.participants_count > tnVar3.getMessagesController().chatReadMarkSizeThreshold || (messageObject.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || tnVar3.N3 == 3 || !messageObject.canSetReaction() || ChatObject.isMonoForum(tnVar3.e)) ? false : true;
                        if (tnVar3.e == null && !messageObject.isOut() && ChatObject.isMonoForum(tnVar3.e) && ChatObject.canManageMonoForum(tnVar3.getCurrentAccount(), tnVar3.e)) {
                            qeVar2 = qeVar;
                            int i20 = ((-tnVar3.e.linked_monoforum_id) > messageObject.getFromChatId() ? 1 : ((-tnVar3.e.linked_monoforum_id) == messageObject.getFromChatId() ? 0 : -1));
                        } else {
                            qeVar2 = qeVar;
                        }
                        if (!z10 && tnVar3.e == null && tnVar3.h == null && (user = tnVar3.f) != null && !UserObject.isUserSelf(user) && !UserObject.isReplyUser(tnVar3.f) && !UserObject.isAnonymous(tnVar3.f)) {
                            user2 = tnVar3.f;
                            if (!user2.bot && !UserObject.isService(user2.id) && (((userFull = tnVar3.W7) == null || !userFull.read_dates_private) && !tnVar3.c() && messageObject.isOutOwner() && messageObject.isSent() && !messageObject.isEditing() && !messageObject.isSending() && !messageObject.isSendError() && !messageObject.isContentUnread() && !messageObject.isUnread() && tnVar3.getConnectionsManager().getCurrentTime() - messageObject.messageOwner.date < tnVar3.getMessagesController().pmReadDateExpirePeriod && !(messageObject.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                                z14 = true;
                                TLRPC.User user3 = tnVar3.f;
                                boolean z22 = ((user3 == null && (UserObject.isReplyUser(user3) || UserObject.isAnonymous(tnVar3.f))) || tnVar3.c() || !messageObject.isEdited() || (messageObject.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                                org.telegram.ui.Components.j70 G2 = org.telegram.ui.Components.j70.G(viewGroup, tnVar3.getResourceProvider(), null, !z10 || z13);
                                if (z13) {
                                    iv0Var3 = iv0Var2;
                                    arrayList = arrayList10;
                                    tnVar = tnVar3;
                                    messageObject2 = messageObject;
                                    arrayList2 = arrayList9;
                                    if (z14) {
                                        G2.r(new org.telegram.ui.Components.vb0(iv0Var3.getContext(), 0, messageObject2, new wu0(iv0Var3, 1), iv0Var3.b), i7.f6.n(-1, 36));
                                        G2.k();
                                    } else if (z22) {
                                        messageObject3 = messageObject2;
                                        G2.r(new org.telegram.ui.Components.vb0(iv0Var3.getContext(), 1, messageObject2, new wu0(iv0Var3, 2), iv0Var3.b), i7.f6.n(-1, 36));
                                        G2.k();
                                        size = arrayList8.size();
                                        i10 = 0;
                                        while (i10 < size) {
                                            G2.c(((Integer) arrayList8.get(i10)).intValue(), (CharSequence) arrayList2.get(i10), new ll0(iv0Var3, qeVar2, ((Integer) arrayList.get(i10)).intValue(), 4), false);
                                            i10++;
                                            arrayList8 = arrayList8;
                                        }
                                        G2.T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
                                        G2.Q(aVar, pg.a.j(c6Var), false);
                                        G2.Y();
                                        ViewGroup viewGroup5 = G2.A;
                                        iv0Var3.P = viewGroup5;
                                        viewGroup5.setPivotX(0.0f);
                                        iv0Var3.P.setPivotY(0.0f);
                                        ?? r9 = ev0Var;
                                        r9.addView(iv0Var3.P, i7.f6.e(-2, -2, 51));
                                        viewGroup2 = iv0Var3.P;
                                        if (viewGroup2 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup2).setOnSizeChangedListener(new zk0(iv0Var3, 6));
                                            iv0Var3.P.setOnTouchListener(new g0(iv0Var3, 5));
                                        }
                                        if (z12) {
                                            tn tnVar5 = tnVar;
                                            org.telegram.ui.Components.fk0 fk0Var = new org.telegram.ui.Components.fk0((tnVar.getUserConfig().getClientUserId() > tnVar.a() ? 1 : (tnVar.getUserConfig().getClientUserId() == tnVar.a() ? 0 : -1)) == 0 ? 3 : 0, tnVar.getCurrentAccount(), iv0Var3.getContext(), tnVar5, iv0Var3.b);
                                            fk0Var.a = true;
                                            float f9 = 22;
                                            fk0Var.setPadding(AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : 24), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 24 : 0), AndroidUtilities.dp(f9));
                                            fk0Var.setDelegate(new dv0(iv0Var3, tnVar5, messageObject3, fk0Var));
                                            iv0Var3.M = fk0Var;
                                            r9.addView(fk0Var, i7.f6.e(-2, (int) ((fk0Var.getTopOffset() / AndroidUtilities.density) + 52.0f + f9), 51));
                                            z15 = true;
                                            fk0Var.p(messageObject3, tnVar5.V7, true);
                                            iv0Var3.M.setTransitionProgress(1.0f);
                                        } else {
                                            z15 = true;
                                        }
                                        iv0Var3.e();
                                        iv0Var3.a0 = new pm(this, 0);
                                        iv0Var3.show();
                                        return z15;
                                    }
                                } else {
                                    oh0 oh0Var = new oh0(iv0Var2.getContext(), tnVar3.getCurrentAccount(), messageObject, tnVar3.e);
                                    FrameLayout frameLayout2 = new FrameLayout(iv0Var2.getContext());
                                    frameLayout2.addView(oh0Var, i7.f6.c(36.0f, -1));
                                    org.telegram.ui.Components.j70 J2 = G2.J();
                                    org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(0, iv0Var2.getContext(), iv0Var2.b, true, false);
                                    g1Var2.setItemHeight(44);
                                    iv0 iv0Var6 = iv0Var2;
                                    g1Var2.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                                    g1Var2.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                                    FrameLayout frameLayout3 = new FrameLayout(iv0Var6.getContext());
                                    messageObject2 = messageObject;
                                    LinearLayout linearLayout2 = new LinearLayout(iv0Var6.getContext());
                                    linearLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, c6Var));
                                    linearLayout2.setOrientation(1);
                                    tn tnVar6 = tnVar3;
                                    org.telegram.ui.Components.jl0 a10 = oh0Var.a();
                                    frameLayout3.addView(g1Var2);
                                    linearLayout2.addView(frameLayout3);
                                    linearLayout2.addView(new org.telegram.ui.ActionBar.l1(iv0Var6.getContext(), c6Var), i7.f6.n(-1, 8));
                                    frameLayout3.setOnClickListener(new bv0(G2));
                                    arrayList = arrayList10;
                                    arrayList2 = arrayList9;
                                    cv0 cv0Var = new cv0(iv0Var6, oh0Var, tnVar6, a10, linearLayout2, G2, J2);
                                    iv0Var3 = iv0Var6;
                                    tnVar = tnVar6;
                                    G2 = G2;
                                    oh0Var.setOnClickListener(cv0Var);
                                    linearLayout2.addView(a10, i7.f6.n(-1, -2));
                                    J2.q(linearLayout2);
                                    G2.q(frameLayout2);
                                    G2.k();
                                }
                                messageObject3 = messageObject2;
                                size = arrayList8.size();
                                i10 = 0;
                                while (i10 < size) {
                                }
                                G2.T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
                                G2.Q(aVar, pg.a.j(c6Var), false);
                                G2.Y();
                                ViewGroup viewGroup52 = G2.A;
                                iv0Var3.P = viewGroup52;
                                viewGroup52.setPivotX(0.0f);
                                iv0Var3.P.setPivotY(0.0f);
                                ?? r92 = ev0Var;
                                r92.addView(iv0Var3.P, i7.f6.e(-2, -2, 51));
                                viewGroup2 = iv0Var3.P;
                                if (viewGroup2 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                }
                                if (z12) {
                                }
                                iv0Var3.e();
                                iv0Var3.a0 = new pm(this, 0);
                                iv0Var3.show();
                                return z15;
                            }
                        }
                        z14 = false;
                        TLRPC.User user32 = tnVar3.f;
                        if (user32 == null) {
                        }
                        org.telegram.ui.Components.j70 G22 = org.telegram.ui.Components.j70.G(viewGroup, tnVar3.getResourceProvider(), null, !z10 || z13);
                        if (z13) {
                        }
                        messageObject3 = messageObject2;
                        size = arrayList8.size();
                        i10 = 0;
                        while (i10 < size) {
                        }
                        G22.T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
                        G22.Q(aVar, pg.a.j(c6Var), false);
                        G22.Y();
                        ViewGroup viewGroup522 = G22.A;
                        iv0Var3.P = viewGroup522;
                        viewGroup522.setPivotX(0.0f);
                        iv0Var3.P.setPivotY(0.0f);
                        ?? r922 = ev0Var;
                        r922.addView(iv0Var3.P, i7.f6.e(-2, -2, 51));
                        viewGroup2 = iv0Var3.P;
                        if (viewGroup2 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z12) {
                        }
                        iv0Var3.e();
                        iv0Var3.a0 = new pm(this, 0);
                        iv0Var3.show();
                        return z15;
                    }
                    tnVar3 = tnVar2;
                } else {
                    iv0Var2 = iv0Var;
                    viewGroup = r72;
                }
                G.T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
                G.Q(aVar, pg.a.j(c6Var), false);
                G.Y();
                ViewGroup viewGroup42 = G.A;
                iv0Var2.N = viewGroup42;
                viewGroup42.setPivotX(0.0f);
                iv0Var2.N.setPivotY(0.0f);
                ev0Var2.addView(iv0Var2.N, i7.f6.e(-2, -2, 51));
                ArrayList arrayList82 = new ArrayList();
                ArrayList arrayList92 = new ArrayList();
                ArrayList arrayList102 = new ArrayList();
                tnVar3.n8(primaryMessageObject, arrayList82, arrayList92, arrayList102);
                qeVar = new qe(tnVar3, 6);
                messageObject = iv0Var2.D;
                List<TLRPC.TL_availableReaction> enabledReactionsList2 = tnVar3.getMediaDataController().getEnabledReactionsList();
                if (tnVar3.w()) {
                }
                if (messageObject.isForwardedChannelPost()) {
                }
                z12 = z11;
                if (!z10) {
                }
                if (tnVar3.e == null) {
                }
                qeVar2 = qeVar;
                if (!z10) {
                    user2 = tnVar3.f;
                    if (!user2.bot) {
                        z14 = true;
                        TLRPC.User user322 = tnVar3.f;
                        if (user322 == null) {
                        }
                        org.telegram.ui.Components.j70 G222 = org.telegram.ui.Components.j70.G(viewGroup, tnVar3.getResourceProvider(), null, !z10 || z13);
                        if (z13) {
                        }
                        messageObject3 = messageObject2;
                        size = arrayList82.size();
                        i10 = 0;
                        while (i10 < size) {
                        }
                        G222.T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
                        G222.Q(aVar, pg.a.j(c6Var), false);
                        G222.Y();
                        ViewGroup viewGroup5222 = G222.A;
                        iv0Var3.P = viewGroup5222;
                        viewGroup5222.setPivotX(0.0f);
                        iv0Var3.P.setPivotY(0.0f);
                        ?? r9222 = ev0Var;
                        r9222.addView(iv0Var3.P, i7.f6.e(-2, -2, 51));
                        viewGroup2 = iv0Var3.P;
                        if (viewGroup2 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z12) {
                        }
                        iv0Var3.e();
                        iv0Var3.a0 = new pm(this, 0);
                        iv0Var3.show();
                        return z15;
                    }
                }
                z14 = false;
                TLRPC.User user3222 = tnVar3.f;
                if (user3222 == null) {
                }
                org.telegram.ui.Components.j70 G2222 = org.telegram.ui.Components.j70.G(viewGroup, tnVar3.getResourceProvider(), null, !z10 || z13);
                if (z13) {
                }
                messageObject3 = messageObject2;
                size = arrayList82.size();
                i10 = 0;
                while (i10 < size) {
                }
                G2222.T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
                G2222.Q(aVar, pg.a.j(c6Var), false);
                G2222.Y();
                ViewGroup viewGroup52222 = G2222.A;
                iv0Var3.P = viewGroup52222;
                viewGroup52222.setPivotX(0.0f);
                iv0Var3.P.setPivotY(0.0f);
                ?? r92222 = ev0Var;
                r92222.addView(iv0Var3.P, i7.f6.e(-2, -2, 51));
                viewGroup2 = iv0Var3.P;
                if (viewGroup2 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z12) {
                }
                iv0Var3.e();
                iv0Var3.a0 = new pm(this, 0);
                iv0Var3.show();
                return z15;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final sg.a X() {
        return this.a.Mb;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void X0(org.telegram.ui.Cells.s1 s1Var) {
        tn tnVar = this.a;
        tnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(tnVar.P5), s1Var);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean Y(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var == null ? null : s1Var.getMessageObject();
        if (messageObject == null || messageObject.messageOwner == null) {
            return false;
        }
        tn tnVar = this.a;
        return (tnVar.N3 == 1 || tnVar.y9() || messageObject.messageOwner.noforwards || messageObject.type == 29) ? false : true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void Y0(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
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
        MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
        tn tnVar = this.a;
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
                        int childCount = tnVar.t0.getChildCount();
                        for (int i11 = 0; i11 < childCount; i11++) {
                            View childAt = tnVar.t0.getChildAt(i11);
                            if (childAt instanceof org.telegram.ui.Cells.s1) {
                                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                                if (messageObject2.equals(s1Var2.getMessageObject())) {
                                    s1Var = s1Var2;
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
        tnVar.Jb(messageObject, spannableStringBuilder, 1);
        s1Var.g4(1, false, true);
    }

    @Override // org.telegram.ui.Cells.j1
    public final lu0 Y1() {
        return this.a.sa;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // org.telegram.ui.Cells.j1
    public final boolean Z(org.telegram.ui.Cells.s1 s1Var, final TLRPC.User user) {
        int i10;
        x4 b10;
        int i11;
        ik ikVar;
        hk hkVar;
        if (!l()) {
            return false;
        }
        tn tnVar = this.a;
        ?? r22 = (tnVar.e == null || ((ikVar = tnVar.K0) != null && ikVar.getVisibility() == 0) || ((hkVar = tnVar.N) != null && hkVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat = tnVar.e;
        ?? r42 = (chat == null || !(tnVar.Z3 == 0 || tnVar.d4) || (ChatObject.isChannel(chat) && !tnVar.e.megagroup)) ? 0 : 1;
        d5[] d5VarArr = new d5[r22 + 2 + r42];
        d5VarArr[0] = d5.d;
        d5VarArr[1] = d5.h;
        char c3 = 2;
        if (r22 != 0) {
            d5VarArr[2] = d5.n;
            c3 = 3;
        }
        if (r42 != 0) {
            d5VarArr[c3] = d5.r;
        }
        TLRPC.UserFull userFull = tnVar.getMessagesController().getUserFull(user.id);
        if (userFull != null) {
            b10 = x4.c(user, userFull, d5VarArr);
            if (!ab.m.e(b10)) {
                i11 = ((org.telegram.ui.ActionBar.o2) tnVar).classGuid;
                b10 = x4.b(user, i11, d5VarArr);
            }
        } else {
            i10 = ((org.telegram.ui.ActionBar.o2) tnVar).classGuid;
            b10 = x4.b(user, i10, d5VarArr);
        }
        if (ab.m.e(b10)) {
            ab.m.i().s((ViewGroup) tnVar.fragmentView, tnVar.aa, b10, new z6(this, s1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.j70 H = org.telegram.ui.Components.j70.H(tnVar, s1Var);
        final int i12 = 0;
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(this) { // from class: org.telegram.ui.rm
            public final /* synthetic */ fn b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.v(user, false);
                        break;
                    case 1:
                        this.b.d(user);
                        break;
                    default:
                        this.b.a.ma(user);
                        break;
                }
            }
        }, false);
        H.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new u1(this, s1Var, user, 25), false);
        final int i13 = 1;
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new Runnable(this) { // from class: org.telegram.ui.rm
            public final /* synthetic */ fn b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.b.v(user, false);
                        break;
                    case 1:
                        this.b.d(user);
                        break;
                    default:
                        this.b.a.ma(user);
                        break;
                }
            }
        }, r22);
        final int i14 = 2;
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new Runnable(this) { // from class: org.telegram.ui.rm
            public final /* synthetic */ fn b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        this.b.v(user, false);
                        break;
                    case 1:
                        this.b.d(user);
                        break;
                    default:
                        this.b.a.ma(user);
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

    @Override // org.telegram.ui.Cells.j1
    public final boolean a2(long j10) {
        tn tnVar = this.a;
        TLRPC.Chat chat = tnVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return false;
        }
        return tnVar.getMessagesController().isAdmin(tnVar.e.id, j10);
    }

    public final void b(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        tn tnVar = this.a;
        dk dkVar = tnVar.U;
        if (dkVar != null) {
            CharSequence fieldText = dkVar.getFieldText();
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
                tnVar.U.setFieldText(spannableStringBuilder);
                AndroidUtilities.runOnUIThread(new pm(this, 6), 200L);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x00fe, code lost:
    
        if (org.telegram.messenger.DialogObject.getPeerDialogId(r5) != r8.P5) goto L67;
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
    @Override // org.telegram.ui.Cells.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b2(org.telegram.ui.Cells.s1 s1Var, int i10, float f9, float f10, boolean z10) {
        Integer num;
        TLRPC.MessageReplyHeader messageReplyHeader;
        String str;
        byte[] bArr;
        TLRPC.MessageReplyHeader messageReplyHeader2;
        TLRPC.Message message;
        String str2;
        long j10;
        boolean z11;
        TLRPC.Chat chat;
        TLRPC.Message message2;
        TLRPC.MessageReplyHeader messageReplyHeader3;
        TLRPC.MessageReplyHeader messageReplyHeader4;
        org.telegram.ui.ActionBar.o2 o2Var;
        TLRPC.Chat chat2;
        TLRPC.MessageReplyHeader messageReplyHeader5;
        MessageObject messageObject;
        TLRPC.MessageReplyHeader messageReplyHeader6;
        TLRPC.MessageReplyHeader messageReplyHeader7;
        TLRPC.Message message3;
        TL_stories.StoryItem storyItem;
        org.telegram.ui.ActionBar.l lVar;
        boolean c3 = c();
        tn tnVar = this.a;
        if (!c3 && !z10) {
            lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
            if ((lVar.s() || tnVar.A9()) && !tnVar.Y8.A(s1Var.getMessageObject())) {
                tn.b2(tnVar, s1Var, !s1Var.i3(f9), f9, f10);
                return;
            }
            return;
        }
        if (UserObject.isReplyUser(tnVar.f)) {
            s(s1Var);
            return;
        }
        MessageObject messageObject2 = s1Var.getMessageObject();
        if (messageObject2 == null) {
            return;
        }
        if (messageObject2.isReplyToStory() && (storyItem = (message3 = messageObject2.messageOwner).replyStory) != null) {
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                j7.l1.v(R.string.StoryNotFound, org.telegram.ui.Components.tc.a0(tnVar), R.raw.story_bomb1, 36);
                return;
            }
            storyItem.dialogId = DialogObject.getPeerDialogId(message3.reply_to.peer);
            storyItem.messageId = messageObject2.getId();
            storyItem.messageType = 3;
            lh.l7.b(storyItem, tnVar.f);
            tnVar.getOrCreateStoryViewer().G(tnVar.getParentActivity(), storyItem, lh.b7.a(tnVar.t0));
            return;
        }
        TLRPC.Message message4 = messageObject2.messageOwner;
        if (message4 != null && (messageReplyHeader7 = message4.reply_to) != null && (messageReplyHeader7.flags & 2048) != 0) {
            num = Integer.valueOf(messageReplyHeader7.todo_item_id);
        } else {
            if (message4 != null && (messageReplyHeader2 = message4.reply_to) != null && (bArr = messageReplyHeader2.poll_option) != null) {
                num = null;
                str = null;
                long j11 = tnVar.P5;
                message = messageObject2.messageOwner;
                if (message == null) {
                }
                str2 = str;
                j10 = j11;
                z11 = false;
                if (j10 < 0) {
                }
                if (j10 != Long.MAX_VALUE) {
                }
                message2 = messageObject2.messageOwner;
                if (message2 != null) {
                }
                TLRPC.Message message5 = messageObject2.messageOwner;
                org.telegram.ui.Components.tc.a0(tnVar).Q(R.raw.error, 36, LocaleController.getString((message5 == null && (messageReplyHeader3 = message5.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
            }
            if (message4 != null && (messageReplyHeader = message4.reply_to) != null && messageReplyHeader.quote) {
                String str3 = messageReplyHeader.quote_text;
                r9 = (messageReplyHeader.flags & 1024) != 0 ? messageReplyHeader.quote_offset : -1;
                str = str3;
                num = null;
                bArr = null;
                long j112 = tnVar.P5;
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
                                    j112 = DialogObject.getPeerDialogId(peer2);
                                }
                                j10 = Long.MAX_VALUE;
                            } else {
                                TLRPC.Peer peer3 = messageFwdHeader.saved_from_peer;
                                if (peer3 != null) {
                                    j112 = DialogObject.getPeerDialogId(peer3);
                                }
                                j10 = Long.MAX_VALUE;
                            }
                        }
                    } else {
                        if (!(peer instanceof TLRPC.TL_peerUser)) {
                            j10 = DialogObject.getPeerDialogId(peer);
                            str2 = str;
                            z11 = true;
                            chat = j10 < 0 ? tnVar.getMessagesController().getChat(Long.valueOf(-j10)) : null;
                            if (j10 != Long.MAX_VALUE) {
                                boolean z12 = z11;
                                if (j10 == tnVar.P5 || chat == null || ChatObject.isPublic(chat) || (!chat.left && !chat.kicked)) {
                                    if (((j10 == tnVar.P5 && (!ChatObject.isForum(tnVar.e) || !z12)) || j10 == Long.MAX_VALUE) && (tnVar.N3 != 3 || ((messageObject = messageObject2.replyMessageObject) != null && messageObject.getSavedDialogId() == tnVar.b()))) {
                                        int i11 = tnVar.N3;
                                        if (i11 == 2 || i11 == 1) {
                                            tnVar.R8.Q0(i10);
                                            tnVar.finishFragment();
                                            return;
                                        }
                                        if (bArr != null) {
                                            tnVar.N7 = bArr;
                                        } else if (num != null) {
                                            tnVar.M7 = num;
                                        } else {
                                            TLRPC.Message message6 = messageObject2.messageOwner;
                                            if (message6 != null && (messageReplyHeader5 = message6.reply_to) != null && messageReplyHeader5.quote) {
                                                tnVar.J7 = true;
                                                tnVar.L7 = messageReplyHeader5.quote_text;
                                                tnVar.O7 = r9;
                                                tnVar.I7 = true;
                                            }
                                        }
                                        bg.j3 j3Var = new bg.j3(this, i10, messageObject2, num, bArr, 14);
                                        if (!tnVar.w0.J) {
                                            j3Var.run();
                                            return;
                                        }
                                        tnVar.n3 = false;
                                        tnVar.lb(false, true, false);
                                        tnVar.Fc(tnVar.getMediaDataController().getMask(), tnVar.getMediaDataController().getSearchPosition(), tnVar.getMediaDataController().getSearchCount());
                                        AndroidUtilities.runOnUIThread(j3Var, 80L);
                                        return;
                                    }
                                    Integer num2 = num;
                                    byte[] bArr2 = bArr;
                                    if (LaunchActivity.C1 != null) {
                                        ye.c cVar = tnVar.wb;
                                        if (cVar != null) {
                                            cVar.a(false);
                                            o2Var = null;
                                            tnVar.wb = null;
                                        } else {
                                            o2Var = null;
                                        }
                                        LaunchActivity launchActivity = LaunchActivity.C1;
                                        final m0 m0Var = new m0(this, messageObject2, s1Var);
                                        tnVar.wb = m0Var;
                                        int id2 = messageObject2.getId();
                                        ArrayList arrayList = launchActivity.Z;
                                        if (j10 < 0 && (chat2 = MessagesController.getInstance(launchActivity.K).getChat(Long.valueOf(-j10))) != null && ChatObject.isForum(chat2)) {
                                            m0Var.d();
                                            final int i12 = 0;
                                            launchActivity.k0(j10, Integer.valueOf(i10), str2, num2, bArr2, new Runnable() { // from class: org.telegram.ui.t80
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i13 = i12;
                                                    m0 m0Var2 = m0Var;
                                                    switch (i13) {
                                                        case 0:
                                                            Pattern pattern = LaunchActivity.x1;
                                                            m0Var2.c(false);
                                                            break;
                                                        default:
                                                            Pattern pattern2 = LaunchActivity.x1;
                                                            m0Var2.c(false);
                                                            break;
                                                    }
                                                }
                                            }, id2, r9);
                                            return;
                                        }
                                        String str4 = str2;
                                        int i13 = r9;
                                        m0Var.d();
                                        Bundle bundle = new Bundle();
                                        if (j10 >= 0) {
                                            bundle.putLong("user_id", j10);
                                        } else {
                                            long j12 = -j10;
                                            TLRPC.Chat chat3 = MessagesController.getInstance(launchActivity.K).getChat(Long.valueOf(j12));
                                            if (chat3 != null && chat3.forum) {
                                                final int i14 = 1;
                                                launchActivity.k0(j10, Integer.valueOf(i10), str4, num2, bArr2, new Runnable() { // from class: org.telegram.ui.t80
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i132 = i14;
                                                        m0 m0Var2 = m0Var;
                                                        switch (i132) {
                                                            case 0:
                                                                Pattern pattern = LaunchActivity.x1;
                                                                m0Var2.c(false);
                                                                break;
                                                            default:
                                                                Pattern pattern2 = LaunchActivity.x1;
                                                                m0Var2.c(false);
                                                                break;
                                                        }
                                                    }
                                                }, id2, i13);
                                                return;
                                            }
                                            bundle.putLong("chat_id", j12);
                                        }
                                        bundle.putInt("message_id", i10);
                                        org.telegram.ui.ActionBar.o2 o2Var2 = !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.o2) j7.l1.i(1, arrayList) : o2Var;
                                        if (o2Var2 == null || MessagesController.getInstance(launchActivity.K).checkCanOpenChat(bundle, o2Var2)) {
                                            AndroidUtilities.runOnUIThread(new s80(launchActivity, bundle, bArr2, i10, num2, str4, i13, j10, m0Var, o2Var2));
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
                                org.telegram.ui.Components.tc.a0(tnVar).Q(R.raw.error, 36, LocaleController.getString((message52 == null && (messageReplyHeader3 = message52.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
                            } else {
                                messageObject2.replyTextRevealed = true;
                                tnVar.qc(messageObject2, true);
                                return;
                            }
                        }
                        str2 = str;
                    }
                    z11 = false;
                    if (j10 < 0) {
                    }
                    if (j10 != Long.MAX_VALUE) {
                    }
                    message2 = messageObject2.messageOwner;
                    if (message2 != null) {
                    }
                    TLRPC.Message message522 = messageObject2.messageOwner;
                    org.telegram.ui.Components.tc.a0(tnVar).Q(R.raw.error, 36, LocaleController.getString((message522 == null && (messageReplyHeader3 = message522.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
                }
                str2 = str;
                j10 = j112;
                z11 = false;
                if (j10 < 0) {
                }
                if (j10 != Long.MAX_VALUE) {
                }
                message2 = messageObject2.messageOwner;
                if (message2 != null) {
                }
                TLRPC.Message message5222 = messageObject2.messageOwner;
                org.telegram.ui.Components.tc.a0(tnVar).Q(R.raw.error, 36, LocaleController.getString((message5222 == null && (messageReplyHeader3 = message5222.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
            }
            num = null;
        }
        bArr = null;
        str = null;
        long j1122 = tnVar.P5;
        message = messageObject2.messageOwner;
        if (message == null) {
        }
        str2 = str;
        j10 = j1122;
        z11 = false;
        if (j10 < 0) {
        }
        if (j10 != Long.MAX_VALUE) {
        }
        message2 = messageObject2.messageOwner;
        if (message2 != null) {
        }
        TLRPC.Message message52222 = messageObject2.messageOwner;
        org.telegram.ui.Components.tc.a0(tnVar).Q(R.raw.error, 36, LocaleController.getString((message52222 == null && (messageReplyHeader3 = message52222.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean c() {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        boolean z10;
        tn tnVar = this.a;
        lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
        if (lVar == null) {
            return false;
        }
        lVar2 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
        if (lVar2.s() || tnVar.A9()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.o2) tnVar).inPreviewMode;
        return !z10;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void c0(int i10) {
        int i11;
        SpannableStringBuilder replaceTags;
        int i12;
        int i13 = 3;
        int i14 = 2;
        int i15 = 1;
        tn tnVar = this.a;
        try {
            if (i10 == 0) {
                tnVar.h7();
                al alVar = tnVar.v3;
                if (alVar == null) {
                    return;
                }
                alVar.l(0L, 84, null, new pm(this, i15));
                tnVar.v3.performHapticFeedback(3, 2);
                return;
            }
            if (i10 == 1) {
                String formatDateTime = LocaleController.formatDateTime(tnVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                if (tnVar.getMessagesController().transcribeAudioTrialCooldownUntil > 0) {
                    i12 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeftUntil", org.telegram.ui.Components.t21.h(i12), formatDateTime));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeft", org.telegram.ui.Components.t21.h(i11), new Object[0]));
                }
                org.telegram.ui.Components.tc.a0(tnVar).G(R.raw.transcribe, 6, replaceTags).k(true);
                tnVar.fragmentView.performHapticFeedback(3, 2);
                return;
            }
            if (i10 == 2 || i10 == 3) {
                String formatDateTime2 = LocaleController.formatDateTime(tnVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                org.telegram.ui.Components.tc a02 = org.telegram.ui.Components.tc.a0(tnVar);
                int i16 = R.raw.transcribe;
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialEnd", tnVar.getMessagesController().transcribeAudioTrialWeeklyNumber, new Object[0]))).append((CharSequence) " ").append(i10 == 2 ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TranscriptionTrialEndBuy), new pm(this, i14)) : tnVar.getMessagesController().transcribeAudioTrialCooldownUntil <= 0 ? "" : AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TranscriptionTrialEndWaitOrBuy, formatDateTime2), new pm(this, i13)));
                a02.getClass();
                org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(a02.W(), a02.c);
                ubVar.c(i16, 36, 36, new String[0]);
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
                ubVar.b.setText(append);
                ubVar.b.setSingleLine(false);
                ubVar.b.setMaxLines(6);
                a02.b(ubVar, 7000).k(true);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean c1(int i10, org.telegram.ui.Cells.s1 s1Var) {
        tn tnVar = this.a;
        return tnVar.sb != 0 && s1Var.getMessageObject() != null && tnVar.sb == s1Var.getMessageObject().getId() && tnVar.tb == i10;
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
    @Override // org.telegram.ui.Cells.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c2(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        cd1 cd1Var;
        TLRPC.TodoItem todoItem2;
        TLRPC.TodoCompletion todoCompletion;
        cd1 cd1Var2;
        MessageObject messageObject;
        cd1 cd1Var3;
        int i10;
        MessageObject messageObject2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        qe qeVar;
        MessageObject messageObject3;
        boolean z14;
        ArrayList arrayList;
        ArrayList arrayList2;
        fd1 fd1Var;
        ArrayList arrayList3;
        tn tnVar;
        MessageObject messageObject4;
        int size;
        int i11;
        ViewGroup viewGroup;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        final tn tnVar2 = this.a;
        if (tnVar2.getParentActivity() == null || tnVar2.getParentActivity() == null) {
            return false;
        }
        nh.t3 t3Var = tnVar2.t1;
        if (t3Var != null && t3Var.R) {
            t3Var.e(true);
        }
        pl plVar = tnVar2.x1;
        if (plVar != null && plVar.R) {
            plVar.e(true);
        }
        MessageObject primaryMessageObject = s1Var.getPrimaryMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(primaryMessageObject);
        if (primaryMessageObject == null || !(media instanceof TLRPC.TL_messageMediaToDo)) {
            return false;
        }
        tnVar2.Z4 = primaryMessageObject;
        tnVar2.a5 = null;
        final fd1 fd1Var2 = new fd1(tnVar2.getParentActivity(), tnVar2.getResourceProvider());
        final int i12 = todoItem.id;
        fd1Var2.G = s1Var;
        fd1Var2.K = i12;
        MessageObject messageObject5 = s1Var.getMessageObject();
        fd1Var2.C = messageObject5;
        fd1Var2.D = messageObject5 != null && messageObject5.isOutOwner();
        org.telegram.ui.Cells.s1 s1Var2 = fd1Var2.G;
        cd1 cd1Var4 = fd1Var2.c;
        if (s1Var2 != null) {
            fd1Var2.H = tnVar2.o9 - AndroidUtilities.dp(4.0f);
            fd1Var2.I = s1Var.n;
            if (s1Var.getParent() instanceof View) {
                View view = (View) s1Var.getParent();
                fd1Var2.H = view.getY() + fd1Var2.H;
                fd1Var2.I = view.getY() + fd1Var2.I;
            }
            int width = fd1Var2.G.getWidth();
            int height = fd1Var2.G.getHeight();
            fd1Var2.G.getHeight();
            cd1Var = cd1Var4;
            dd1 dd1Var = new dd1(fd1Var2, fd1Var2.getContext(), UserConfig.selectedAccount, fd1Var2.G.getResourcesProvider(), i12, width, height);
            fd1Var2.E = dd1Var;
            fd1Var2.G.h1(dd1Var);
            fd1Var2.E.i1(fd1Var2.G);
            fd1Var2.E.setDelegate(new ed1(fd1Var2));
            dd1 dd1Var2 = fd1Var2.E;
            MessageObject messageObject6 = fd1Var2.C;
            MessageObject.GroupedMessages currentMessagesGroup = fd1Var2.G.getCurrentMessagesGroup();
            org.telegram.ui.Cells.s1 s1Var3 = fd1Var2.G;
            dd1Var2.X3(messageObject6, currentMessagesGroup, s1Var3.B, s1Var3.A, s1Var3.C, false);
            cd1Var.addView(fd1Var2.E, new FrameLayout.LayoutParams(fd1Var2.G.getWidth(), height, 51));
            hv0 hv0Var = new hv0(fd1Var2.getContext(), UserConfig.selectedAccount, fd1Var2.G.getResourcesProvider(), width, height, 1);
            fd1Var2.F = hv0Var;
            fd1Var2.G.j1(hv0Var);
            fd1Var2.G.h1(fd1Var2.F);
            fd1Var2.F.i1(fd1Var2.G);
            fd1Var2.F.setDelegate(new ab.b(19));
            hv0 hv0Var2 = fd1Var2.F;
            MessageObject messageObject7 = fd1Var2.C;
            MessageObject.GroupedMessages currentMessagesGroup2 = fd1Var2.G.getCurrentMessagesGroup();
            org.telegram.ui.Cells.s1 s1Var4 = fd1Var2.G;
            hv0Var2.X3(messageObject7, currentMessagesGroup2, s1Var4.B, s1Var4.A, s1Var4.C, false);
            cd1Var.addView(fd1Var2.F, new FrameLayout.LayoutParams(fd1Var2.G.getWidth(), height, 51));
        } else {
            cd1Var = cd1Var4;
        }
        nh.g1 g1Var = fd1Var2.e;
        g1Var.bringToFront();
        cd1 cd1Var5 = fd1Var2.d;
        cd1Var5.bringToFront();
        fd1Var2.h.bringToFront();
        g1Var.w(false);
        org.telegram.ui.ActionBar.c6 c6Var = fd1Var2.a;
        org.telegram.ui.Components.j70 F = org.telegram.ui.Components.j70.F(cd1Var, c6Var, null);
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) MessageObject.getMedia(fd1Var2.C);
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
        if (!fd1Var2.C.canCompleteTodo()) {
            cd1Var2 = cd1Var5;
        } else if (todoCompletion != null) {
            cd1Var2 = cd1Var5;
            F.p(14, -1, LocaleController.formatTodoCompletedDate(todoCompletion.date));
            F.k();
            final int i15 = 1;
            F.c(R.drawable.msg_cancel, LocaleController.getString(R.string.TodoUncheck), new Runnable() { // from class: org.telegram.ui.xc1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            tn tnVar3 = tnVar2;
                            vu0 vu0Var = new vu0(tnVar3);
                            fd1 fd1Var3 = fd1Var2;
                            vu0Var.p0(MessageObject.getMedia(fd1Var3.C), false, i12);
                            vu0Var.a0 = new kl0(24, fd1Var3, tnVar3);
                            tnVar3.presentFragment(vu0Var);
                            fd1Var3.c(false);
                            break;
                        case 1:
                            boolean c3 = tnVar2.c();
                            fd1 fd1Var4 = fd1Var2;
                            if (c3) {
                                Toast.makeText(fd1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                dd1 dd1Var3 = fd1Var4.E;
                                dd1Var3.k4(dd1Var3.O2(i12), false);
                            }
                            fd1Var4.c(true);
                            break;
                        default:
                            boolean c6 = tnVar2.c();
                            fd1 fd1Var5 = fd1Var2;
                            if (c6) {
                                Toast.makeText(fd1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                dd1 dd1Var4 = fd1Var5.E;
                                dd1Var4.k4(dd1Var4.O2(i12), false);
                            }
                            fd1Var5.c(true);
                            break;
                    }
                }
            }, false);
        } else {
            cd1Var2 = cd1Var5;
            final int i16 = 2;
            F.c(R.drawable.msg_select, LocaleController.getString(R.string.TodoCheck), new Runnable() { // from class: org.telegram.ui.xc1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i16) {
                        case 0:
                            tn tnVar3 = tnVar2;
                            vu0 vu0Var = new vu0(tnVar3);
                            fd1 fd1Var3 = fd1Var2;
                            vu0Var.p0(MessageObject.getMedia(fd1Var3.C), false, i12);
                            vu0Var.a0 = new kl0(24, fd1Var3, tnVar3);
                            tnVar3.presentFragment(vu0Var);
                            fd1Var3.c(false);
                            break;
                        case 1:
                            boolean c3 = tnVar2.c();
                            fd1 fd1Var4 = fd1Var2;
                            if (c3) {
                                Toast.makeText(fd1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                dd1 dd1Var3 = fd1Var4.E;
                                dd1Var3.k4(dd1Var3.O2(i12), false);
                            }
                            fd1Var4.c(true);
                            break;
                        default:
                            boolean c6 = tnVar2.c();
                            fd1 fd1Var5 = fd1Var2;
                            if (c6) {
                                Toast.makeText(fd1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                dd1 dd1Var4 = fd1Var5.E;
                                dd1Var4.k4(dd1Var4.O2(i12), false);
                            }
                            fd1Var5.c(true);
                            break;
                    }
                }
            }, false);
        }
        if (todoItem2 != null) {
            F.c(R.drawable.menu_reply, LocaleController.getString(R.string.TodoItemQuote), new sc1(fd1Var2, tnVar2, todoItem2, 2), false);
            if (fd1Var2.C.getDialogId() < 0) {
                MessagesController messagesController = MessagesController.getInstance(fd1Var2.C.currentAccount);
                String publicUsername = DialogObject.getPublicUsername(messagesController.getUserOrChat(fd1Var2.C.getDialogId()));
                StringBuilder sb2 = new StringBuilder("https://");
                sb2.append(messagesController.linkPrefix);
                sb2.append("/");
                if (TextUtils.isEmpty(publicUsername)) {
                    StringBuilder sb3 = new StringBuilder("c/");
                    messageObject = primaryMessageObject;
                    cd1Var3 = cd1Var2;
                    sb3.append(-fd1Var2.C.getDialogId());
                    publicUsername = sb3.toString();
                } else {
                    messageObject = primaryMessageObject;
                    cd1Var3 = cd1Var2;
                }
                sb2.append(publicUsername);
                sb2.append("/");
                sb2.append(fd1Var2.C.getId());
                sb2.append("?task=");
                sb2.append(todoItem2.id);
                F.c(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new t31(13, fd1Var2, sb2.toString()), false);
            } else {
                messageObject = primaryMessageObject;
                cd1Var3 = cd1Var2;
            }
            F.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new t31(14, fd1Var2, todoItem2), false);
        } else {
            messageObject = primaryMessageObject;
            cd1Var3 = cd1Var2;
        }
        if (fd1Var2.C.canEditMessage(tnVar2.e)) {
            final int i17 = 0;
            F.c(R.drawable.msg_edit, LocaleController.getString(R.string.TodoEditItem), new Runnable() { // from class: org.telegram.ui.xc1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i17) {
                        case 0:
                            tn tnVar3 = tnVar2;
                            vu0 vu0Var = new vu0(tnVar3);
                            fd1 fd1Var3 = fd1Var2;
                            vu0Var.p0(MessageObject.getMedia(fd1Var3.C), false, i13);
                            vu0Var.a0 = new kl0(24, fd1Var3, tnVar3);
                            tnVar3.presentFragment(vu0Var);
                            fd1Var3.c(false);
                            break;
                        case 1:
                            boolean c3 = tnVar2.c();
                            fd1 fd1Var4 = fd1Var2;
                            if (c3) {
                                Toast.makeText(fd1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                dd1 dd1Var3 = fd1Var4.E;
                                dd1Var3.k4(dd1Var3.O2(i13), false);
                            }
                            fd1Var4.c(true);
                            break;
                        default:
                            boolean c6 = tnVar2.c();
                            fd1 fd1Var5 = fd1Var2;
                            if (c6) {
                                Toast.makeText(fd1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                dd1 dd1Var4 = fd1Var5.E;
                                dd1Var4.k4(dd1Var4.O2(i13), false);
                            }
                            fd1Var5.c(true);
                            break;
                    }
                }
            }, false);
            if (tL_messageMediaToDo.todo.list.size() > 1) {
                i10 = 51;
                F.c(R.drawable.msg_delete, LocaleController.getString(R.string.TodoDeleteItem), new vs(fd1Var2, tL_messageMediaToDo, i12, tnVar2, 10), false);
                F.T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
                og.d j10 = pg.a.j(c6Var);
                lg.a aVar = fd1Var2.B;
                F.Q(aVar, j10, false);
                F.Y();
                ViewGroup viewGroup2 = F.A;
                fd1Var2.M = viewGroup2;
                viewGroup2.setPivotX(0.0f);
                fd1Var2.M.setPivotY(0.0f);
                cd1Var3.addView(fd1Var2.M, i7.f6.e(-2, -2, i10));
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                tnVar2.n8(messageObject, arrayList4, arrayList5, arrayList6);
                qe qeVar2 = new qe(tnVar2, 7);
                messageObject2 = fd1Var2.C;
                List<TLRPC.TL_availableReaction> enabledReactionsList = tnVar2.getMediaDataController().getEnabledReactionsList();
                boolean z15 = tnVar2.w() && !tnVar2.c() && tnVar2.f == null && messageObject2.hasReactions() && !((ChatObject.isChannel(tnVar2.e) && !tnVar2.e.megagroup) || ChatObject.isMonoForum(tnVar2.e) || enabledReactionsList.isEmpty() || !messageObject2.messageOwner.reactions.can_see_list || messageObject2.isSecretMedia());
                if (messageObject2.isForwardedChannelPost()) {
                    z10 = z15;
                    if (!messageObject2.isSecretMedia()) {
                        if (tnVar2.N3 != 5) {
                            if (!tnVar2.w()) {
                                if (!tnVar2.c()) {
                                    if (messageObject2.isReactionsAvailable()) {
                                        TLRPC.ChatFull chatFull2 = tnVar2.V7;
                                        if (chatFull2 != null) {
                                            if (chatFull2.available_reactions instanceof TLRPC.TL_chatReactionsNone) {
                                            }
                                        }
                                        if (chatFull2 == null) {
                                        }
                                        if (tnVar2.f == null) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z11 = false;
                } else {
                    z10 = z15;
                    TLRPC.ChatFull chatFull3 = tnVar2.getMessagesController().getChatFull(-messageObject2.getFromChatId());
                    if (chatFull3 != null) {
                        if (!tnVar2.w()) {
                            if (tnVar2.N3 != 5) {
                                if (!tnVar2.c()) {
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
                z12 = (!z10 || tnVar2.c() || tnVar2.e == null || !messageObject2.isOutOwner() || !messageObject2.isSent() || messageObject2.isEditing() || messageObject2.isSending() || messageObject2.isSendError() || messageObject2.isContentUnread() || messageObject2.isUnread() || ConnectionsManager.getInstance(tnVar2.getCurrentAccount()).getCurrentTime() - messageObject2.messageOwner.date >= tnVar2.getMessagesController().chatReadMarkExpirePeriod || (!ChatObject.isMegagroup(tnVar2.e) && ChatObject.isChannel(tnVar2.e)) || (chatFull = tnVar2.V7) == null || chatFull.participants_count > tnVar2.getMessagesController().chatReadMarkSizeThreshold || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || tnVar2.N3 == 3 || !messageObject2.canSetReaction() || ChatObject.isMonoForum(tnVar2.e)) ? false : true;
                if (tnVar2.e != null && !messageObject2.isOut() && ChatObject.isMonoForum(tnVar2.e) && ChatObject.canManageMonoForum(tnVar2.getCurrentAccount(), tnVar2.e)) {
                    int i18 = ((-tnVar2.e.linked_monoforum_id) > messageObject2.getFromChatId() ? 1 : ((-tnVar2.e.linked_monoforum_id) == messageObject2.getFromChatId() ? 0 : -1));
                }
                if (!z10 && tnVar2.e == null && tnVar2.h == null && (user = tnVar2.f) != null && !UserObject.isUserSelf(user) && !UserObject.isReplyUser(tnVar2.f) && !UserObject.isAnonymous(tnVar2.f)) {
                    user2 = tnVar2.f;
                    if (!user2.bot && !UserObject.isService(user2.id) && (((userFull = tnVar2.W7) == null || !userFull.read_dates_private) && !tnVar2.c() && messageObject2.isOutOwner() && messageObject2.isSent() && !messageObject2.isEditing() && !messageObject2.isSending() && !messageObject2.isSendError() && !messageObject2.isContentUnread() && !messageObject2.isUnread() && tnVar2.getConnectionsManager().getCurrentTime() - messageObject2.messageOwner.date < tnVar2.getMessagesController().pmReadDateExpirePeriod && !(messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                        z13 = true;
                        TLRPC.User user3 = tnVar2.f;
                        boolean z17 = ((user3 == null && (UserObject.isReplyUser(user3) || UserObject.isAnonymous(tnVar2.f))) || tnVar2.c() || !messageObject2.isEdited() || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                        org.telegram.ui.Components.j70 G = org.telegram.ui.Components.j70.G(fd1Var2.c, tnVar2.getResourceProvider(), null, !z10 || z12);
                        if (z12) {
                            qeVar = qeVar2;
                            messageObject3 = messageObject2;
                            z14 = z16;
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            fd1Var = fd1Var2;
                            arrayList3 = arrayList6;
                            tnVar = tnVar2;
                            if (z13) {
                                G.r(new org.telegram.ui.Components.vb0(fd1Var.getContext(), 0, messageObject3, new wc1(fd1Var, 0), fd1Var.a), i7.f6.n(-1, 36));
                                G.k();
                            } else if (z17) {
                                messageObject4 = messageObject3;
                                G.r(new org.telegram.ui.Components.vb0(fd1Var.getContext(), 1, messageObject3, new wc1(fd1Var, 2), fd1Var.a), i7.f6.n(-1, 36));
                                G.k();
                                i11 = 0;
                                for (size = arrayList.size(); i11 < size; size = size) {
                                    G.c(((Integer) arrayList.get(i11)).intValue(), (CharSequence) arrayList2.get(i11), new ll0(fd1Var, qeVar, ((Integer) arrayList3.get(i11)).intValue(), 9), false);
                                    i11++;
                                    arrayList3 = arrayList3;
                                }
                                G.T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
                                G.Q(aVar, pg.a.j(c6Var), false);
                                G.Y();
                                ViewGroup viewGroup3 = G.A;
                                fd1Var.O = viewGroup3;
                                viewGroup3.setPivotX(0.0f);
                                fd1Var.O.setPivotY(0.0f);
                                ViewGroup viewGroup4 = fd1Var.O;
                                FrameLayout.LayoutParams e10 = i7.f6.e(-2, -2, 51);
                                cd1 cd1Var6 = fd1Var.d;
                                cd1Var6.addView(viewGroup4, e10);
                                viewGroup = fd1Var.O;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new zk0(fd1Var, 22));
                                    fd1Var.O.setOnTouchListener(new g0(fd1Var, 7));
                                }
                                if (z14) {
                                    tn tnVar3 = tnVar;
                                    org.telegram.ui.Components.fk0 fk0Var = new org.telegram.ui.Components.fk0((tnVar.getUserConfig().getClientUserId() > tnVar.a() ? 1 : (tnVar.getUserConfig().getClientUserId() == tnVar.a() ? 0 : -1)) == 0 ? 3 : 0, tnVar3.getCurrentAccount(), fd1Var.getContext(), tnVar3, fd1Var.a);
                                    fk0Var.a = true;
                                    float f9 = 22;
                                    fk0Var.setPadding(AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : 24), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 24 : 0), AndroidUtilities.dp(f9));
                                    fk0Var.setDelegate(new bd1(fd1Var, tnVar3, messageObject4, fk0Var));
                                    fd1Var.L = fk0Var;
                                    cd1Var6.addView(fk0Var, i7.f6.e(-2, (int) ((fk0Var.getTopOffset() / AndroidUtilities.density) + 52.0f + f9), 51));
                                    fk0Var.p(messageObject4, tnVar3.V7, true);
                                    fd1Var.L.setTransitionProgress(1.0f);
                                }
                                fd1Var.e();
                                fd1Var.Y = new pm(this, 5);
                                fd1Var.show();
                                return true;
                            }
                        } else {
                            oh0 oh0Var = new oh0(fd1Var2.getContext(), tnVar2.getCurrentAccount(), messageObject2, tnVar2.e);
                            FrameLayout frameLayout = new FrameLayout(fd1Var2.getContext());
                            frameLayout.addView(oh0Var, i7.f6.c(36.0f, -1));
                            org.telegram.ui.Components.j70 J = G.J();
                            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(0, fd1Var2.getContext(), fd1Var2.a, true, false);
                            g1Var2.setItemHeight(44);
                            g1Var2.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                            g1Var2.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                            FrameLayout frameLayout2 = new FrameLayout(fd1Var2.getContext());
                            LinearLayout linearLayout = new LinearLayout(fd1Var2.getContext());
                            linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, c6Var));
                            linearLayout.setOrientation(1);
                            tnVar = tnVar2;
                            org.telegram.ui.Components.jl0 a2 = oh0Var.a();
                            frameLayout2.addView(g1Var2);
                            linearLayout.addView(frameLayout2);
                            z14 = z16;
                            linearLayout.addView(new org.telegram.ui.ActionBar.l1(fd1Var2.getContext(), c6Var), i7.f6.n(-1, 8));
                            frameLayout2.setOnClickListener(new zc1(G));
                            messageObject3 = messageObject2;
                            qeVar = qeVar2;
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            ad1 ad1Var = new ad1(fd1Var2, oh0Var, tnVar, a2, linearLayout, G, J);
                            G = G;
                            fd1Var = fd1Var2;
                            oh0Var.setOnClickListener(ad1Var);
                            linearLayout.addView(a2, i7.f6.n(-1, -2));
                            J.q(linearLayout);
                            G.q(frameLayout);
                            G.k();
                            arrayList3 = arrayList6;
                        }
                        messageObject4 = messageObject3;
                        i11 = 0;
                        while (i11 < size) {
                        }
                        G.T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
                        G.Q(aVar, pg.a.j(c6Var), false);
                        G.Y();
                        ViewGroup viewGroup32 = G.A;
                        fd1Var.O = viewGroup32;
                        viewGroup32.setPivotX(0.0f);
                        fd1Var.O.setPivotY(0.0f);
                        ViewGroup viewGroup42 = fd1Var.O;
                        FrameLayout.LayoutParams e102 = i7.f6.e(-2, -2, 51);
                        cd1 cd1Var62 = fd1Var.d;
                        cd1Var62.addView(viewGroup42, e102);
                        viewGroup = fd1Var.O;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z14) {
                        }
                        fd1Var.e();
                        fd1Var.Y = new pm(this, 5);
                        fd1Var.show();
                        return true;
                    }
                }
                z13 = false;
                TLRPC.User user32 = tnVar2.f;
                if (user32 == null) {
                }
                org.telegram.ui.Components.j70 G2 = org.telegram.ui.Components.j70.G(fd1Var2.c, tnVar2.getResourceProvider(), null, !z10 || z12);
                if (z12) {
                }
                messageObject4 = messageObject3;
                i11 = 0;
                while (i11 < size) {
                }
                G2.T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
                G2.Q(aVar, pg.a.j(c6Var), false);
                G2.Y();
                ViewGroup viewGroup322 = G2.A;
                fd1Var.O = viewGroup322;
                viewGroup322.setPivotX(0.0f);
                fd1Var.O.setPivotY(0.0f);
                ViewGroup viewGroup422 = fd1Var.O;
                FrameLayout.LayoutParams e1022 = i7.f6.e(-2, -2, 51);
                cd1 cd1Var622 = fd1Var.d;
                cd1Var622.addView(viewGroup422, e1022);
                viewGroup = fd1Var.O;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z14) {
                }
                fd1Var.e();
                fd1Var.Y = new pm(this, 5);
                fd1Var.show();
                return true;
            }
        }
        i10 = 51;
        F.T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
        og.d j102 = pg.a.j(c6Var);
        lg.a aVar2 = fd1Var2.B;
        F.Q(aVar2, j102, false);
        F.Y();
        ViewGroup viewGroup22 = F.A;
        fd1Var2.M = viewGroup22;
        viewGroup22.setPivotX(0.0f);
        fd1Var2.M.setPivotY(0.0f);
        cd1Var3.addView(fd1Var2.M, i7.f6.e(-2, -2, i10));
        ArrayList arrayList42 = new ArrayList();
        ArrayList arrayList52 = new ArrayList();
        ArrayList arrayList62 = new ArrayList();
        tnVar2.n8(messageObject, arrayList42, arrayList52, arrayList62);
        qe qeVar22 = new qe(tnVar2, 7);
        messageObject2 = fd1Var2.C;
        List<TLRPC.TL_availableReaction> enabledReactionsList2 = tnVar2.getMediaDataController().getEnabledReactionsList();
        if (tnVar2.w()) {
        }
        if (messageObject2.isForwardedChannelPost()) {
        }
        boolean z162 = z11;
        if (!z10) {
        }
        if (tnVar2.e != null) {
            int i182 = ((-tnVar2.e.linked_monoforum_id) > messageObject2.getFromChatId() ? 1 : ((-tnVar2.e.linked_monoforum_id) == messageObject2.getFromChatId() ? 0 : -1));
        }
        if (!z10) {
            user2 = tnVar2.f;
            if (!user2.bot) {
                z13 = true;
                TLRPC.User user322 = tnVar2.f;
                if (user322 == null) {
                }
                org.telegram.ui.Components.j70 G22 = org.telegram.ui.Components.j70.G(fd1Var2.c, tnVar2.getResourceProvider(), null, !z10 || z12);
                if (z12) {
                }
                messageObject4 = messageObject3;
                i11 = 0;
                while (i11 < size) {
                }
                G22.T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
                G22.Q(aVar2, pg.a.j(c6Var), false);
                G22.Y();
                ViewGroup viewGroup3222 = G22.A;
                fd1Var.O = viewGroup3222;
                viewGroup3222.setPivotX(0.0f);
                fd1Var.O.setPivotY(0.0f);
                ViewGroup viewGroup4222 = fd1Var.O;
                FrameLayout.LayoutParams e10222 = i7.f6.e(-2, -2, 51);
                cd1 cd1Var6222 = fd1Var.d;
                cd1Var6222.addView(viewGroup4222, e10222);
                viewGroup = fd1Var.O;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z14) {
                }
                fd1Var.e();
                fd1Var.Y = new pm(this, 5);
                fd1Var.show();
                return true;
            }
        }
        z13 = false;
        TLRPC.User user3222 = tnVar2.f;
        if (user3222 == null) {
        }
        org.telegram.ui.Components.j70 G222 = org.telegram.ui.Components.j70.G(fd1Var2.c, tnVar2.getResourceProvider(), null, !z10 || z12);
        if (z12) {
        }
        messageObject4 = messageObject3;
        i11 = 0;
        while (i11 < size) {
        }
        G222.T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
        G222.Q(aVar2, pg.a.j(c6Var), false);
        G222.Y();
        ViewGroup viewGroup32222 = G222.A;
        fd1Var.O = viewGroup32222;
        viewGroup32222.setPivotX(0.0f);
        fd1Var.O.setPivotY(0.0f);
        ViewGroup viewGroup42222 = fd1Var.O;
        FrameLayout.LayoutParams e102222 = i7.f6.e(-2, -2, 51);
        cd1 cd1Var62222 = fd1Var.d;
        cd1Var62222.addView(viewGroup42222, e102222);
        viewGroup = fd1Var.O;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
        }
        if (z14) {
        }
        fd1Var.e();
        fd1Var.Y = new pm(this, 5);
        fd1Var.show();
        return true;
    }

    public final void d(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        tn tnVar = this.a;
        dk dkVar = tnVar.U;
        if (dkVar != null) {
            CharSequence fieldText = dkVar.getFieldText();
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
                SpannableString spannableString = new SpannableString(u3.c.k(UserObject.getFirstName(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.d51("" + user.id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            tnVar.U.setFieldText(spannableStringBuilder);
            AndroidUtilities.runOnUIThread(new pm(this, 7), 200L);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean d0() {
        return this.a.N3 == 0;
    }

    public final void e(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var;
        TLRPC.User currentUser = s1Var.getCurrentUser();
        tn tnVar = this.a;
        tnVar.getUserConfig().getCurrentUser();
        if (!AndroidUtilities.isContextSafe(tnVar.getParentActivity()) || (chat = tnVar.e) == null || currentUser == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
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
                z10 = channelParticipant.promoted_by == tnVar.getUserConfig().getClientUserId();
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
                    z11 = channelParticipant2.promoted_by == tnVar.getUserConfig().getClientUserId();
                } else {
                    z11 = false;
                    z13 = false;
                }
                str2 = channelParticipant2.rank;
                z12 = z11;
                boolean z15 = z13;
                boolean z16 = z14;
                Activity parentActivity = tnVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                long j10 = -tnVar.e.id;
                c6Var = ((org.telegram.ui.ActionBar.o2) tnVar).resourceProvider;
                org.telegram.ui.Components.uz0.b(parentActivity, i10, j10, currentUser, str2, z15, z16, z12, c6Var);
            }
            if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                if (ChatObject.isChannel(tnVar.e)) {
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                    tnVar.getMessagesController();
                    tL_channels_getParticipant.channel = MessagesController.getInputChannel(tnVar.e);
                    tL_channels_getParticipant.participant = tnVar.getMessagesController().getInputPeer(currentUser.id);
                    tnVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new org.telegram.messenger.a(), new bh.v(13, this, s1Var));
                    return;
                }
                return;
            }
            if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                z10 = false;
                z14 = true;
            } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                z10 = ((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == tnVar.getUserConfig().getClientUserId();
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
        Activity parentActivity2 = tnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
        long j102 = -tnVar.e.id;
        c6Var = ((org.telegram.ui.ActionBar.o2) tnVar).resourceProvider;
        org.telegram.ui.Components.uz0.b(parentActivity2, i10, j102, currentUser, str2, z152, z162, z12, c6Var);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void e0(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
        this.a.I7(s1Var, true, false, f9, f10, false, false, false);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void e2(org.telegram.ui.Cells.s1 s1Var) {
        TLRPC.Chat chat;
        TLRPC.User currentUser = s1Var.getCurrentUser();
        tn tnVar = this.a;
        if (!AndroidUtilities.isContextSafe(tnVar.getParentActivity()) || (chat = tnVar.e) == null || currentUser == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return;
        }
        e(s1Var, tnVar.getMessagesController().getParticipant(tnVar.e.id, currentUser.id));
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean f() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final int f0(org.telegram.ui.Cells.s1 s1Var) {
        bh.f fVar;
        tn tnVar = this.a;
        if (!tnVar.sc.f || (fVar = tnVar.yc) == null || fVar.n != s1Var || fVar.a.getWidth() <= 0) {
            return 0;
        }
        return tnVar.yc.a.getHeight();
    }

    @Override // org.telegram.ui.Cells.j1
    public final String g(org.telegram.ui.Cells.s1 s1Var) {
        tn tnVar;
        int i10;
        if (s1Var.getMessageObject() == null || (i10 = (tnVar = this.a).sb) == 0 || i10 != s1Var.getMessageObject().getId() || tnVar.tb != 3) {
            return null;
        }
        return tnVar.vb;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void g0(org.telegram.ui.Cells.s1 s1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        tn tnVar = this.a;
        if (tnVar.getParentActivity() == null) {
            return;
        }
        if (tnVar.T9 == null) {
            fh.k kVar = new fh.k(tnVar.getParentActivity());
            tnVar.T9 = kVar;
            tnVar.T0.addView(kVar, i7.f6.e(-1, -1, 48));
        }
        fh.k kVar2 = tnVar.T9;
        HashMap hashMap = kVar2.a;
        ArrayList arrayList = kVar2.c;
        arrayList.clear();
        int i10 = kVar2.d;
        UserConfig userConfig = UserConfig.getInstance(i10);
        long j10 = userConfig.clientUserId;
        arrayList.add(Long.valueOf(j10));
        if (userConfig.suggestContacts) {
            ArrayList<TLRPC.TL_topPeer> arrayList2 = MediaDataController.getInstance(i10).hints;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                TLRPC.TL_topPeer tL_topPeer = arrayList2.get(i11);
                i11++;
                TLRPC.TL_topPeer tL_topPeer2 = tL_topPeer;
                long j11 = tL_topPeer2.peer.user_id;
                if (j11 != 0) {
                    int i12 = size;
                    if (MessagesController.getInstance(i10).getUser(Long.valueOf(tL_topPeer2.peer.user_id)) != null) {
                        arrayList.add(Long.valueOf(j11));
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
                long j12 = dialog.id;
                if (j12 != j10 && !DialogObject.isEncryptedDialog(j12)) {
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
        String b10 = fh.k.b(s1Var);
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
            Long l10 = (Long) obj;
            if (hashSet.add(l10) && DialogObject.isUserDialog(l10.longValue())) {
                arrayList4.add(l10);
            }
        }
        fh.j jVar = new fh.j(kVar2, s1Var, arrayList4, new ef.c(11, kVar2, b10));
        jVar.setBounds(0, 0, kVar2.getMeasuredWidth(), kVar2.getMeasuredHeight());
        jVar.setCallback(kVar2);
        if (hashMap.containsKey(b10)) {
            return;
        }
        hashMap.put(b10, jVar);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void g2(org.telegram.ui.Cells.s1 s1Var, long j10) {
        Bundle g10 = j7.l1.g(j10, "user_id");
        org.telegram.ui.ActionBar.o2 o2Var = this.a;
        if (o2Var.getMessagesController().checkCanOpenChat(g10, o2Var, s1Var.getMessageObject())) {
            o2Var.presentFragment(new tn(g10));
        }
    }

    public final void h() {
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        boolean isHuaweiStoreApp = BuildVars.isHuaweiStoreApp();
        tn tnVar = this.a;
        if (isHuaweiStoreApp) {
            ye.d.s(tnVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            ye.d.s(tnVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean h1(MessageObject messageObject) {
        em emVar;
        long dialogId = messageObject.getDialogId();
        tn tnVar = this.a;
        return (dialogId == UserObject.REPLY_BOT || ((emVar = tnVar.w0) != null && emVar.J)) && tnVar.N3 != 7;
    }

    public final void i(org.telegram.ui.Cells.s1 s1Var, boolean z10, boolean z11, boolean z12) {
        MessageObject primaryMessageObject;
        int i10;
        int i11;
        oj ojVar;
        if (s1Var == null || (primaryMessageObject = s1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.forceUpdate = true;
        tn tnVar = this.a;
        lj ljVar = tnVar.t0;
        if (ljVar != null && (ojVar = tnVar.v0) != null && ojVar.y < 0) {
            for (int childCount = ljVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = tnVar.t0.getChildAt(childCount);
                tnVar.t0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.s1)) {
                        if (childAt instanceof org.telegram.ui.Cells.v0) {
                            i11 = tnVar.L8(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.s1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = tnVar.L8(childAt);
                            break;
                        }
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        if (z10 && i10 >= 0 && s1Var.getCurrentMessagesGroup() == null) {
            if (z12) {
                oj ojVar2 = tnVar.v0;
                tnVar.t0.getClass();
                ojVar2.i1(RecyclerView.R(s1Var), s1Var.getTop() - ((int) tnVar.o9), false);
            } else {
                tnVar.v0.h1(i10, i11);
            }
        }
        tnVar.J0 = z11;
        tnVar.rc(primaryMessageObject, false);
        tnVar.J0 = false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void j(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        int a2 = bh.l.a(messageObject);
        boolean a10 = i7.n8.a(a2, 7);
        tn tnVar = this.a;
        if (a10) {
            org.telegram.ui.Components.tc.a0(tnVar).Q(R.raw.e_hand_2, 36, bh.l.b(messageObject, a2)).j();
            return;
        }
        if (i10 < 0 && !arrayList.isEmpty()) {
            tnVar.getSendMessagesHelper().sendVote(messageObject, arrayList, null);
            s1Var.S0(true);
            return;
        }
        if (tnVar.getParentActivity() == null) {
            return;
        }
        if (tnVar.j2 == null) {
            org.telegram.ui.Components.g40 g40Var = new org.telegram.ui.Components.g40(5, tnVar.getParentActivity(), tnVar.aa, false);
            tnVar.j2 = g40Var;
            g40Var.setAlpha(0.0f);
            tnVar.j2.setVisibility(4);
            int indexOfChild = tnVar.T0.indexOfChild(tnVar.O);
            if (indexOfChild == -1) {
                return;
            } else {
                tnVar.T0.addView(tnVar.j2, indexOfChild + 1, i7.f6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            }
        }
        if (!arrayList.isEmpty() || i10 >= 0) {
            i13 = i12;
            i14 = i11;
        } else {
            ArrayList<org.telegram.ui.Cells.q1> pollButtons = s1Var.getPollButtons();
            int size = pollButtons.size();
            int i16 = 0;
            float f9 = 0.0f;
            while (true) {
                if (i16 >= size) {
                    i13 = i12;
                    i15 = i11;
                    break;
                }
                org.telegram.ui.Cells.q1 q1Var = pollButtons.get(i16);
                float y8 = ((s1Var.getY() + q1Var.b) - AndroidUtilities.dp(4.0f)) - tnVar.o9;
                tnVar.m2 = AndroidUtilities.dp(13.3f) + q1Var.a;
                int C = b.C(6.0f, q1Var.b, i12);
                tnVar.n2 = C;
                if (y8 > 0.0f) {
                    i15 = tnVar.m2;
                    i13 = C;
                    f9 = 0.0f;
                    break;
                }
                i16++;
                f9 = y8;
            }
            if (f9 != 0.0f) {
                tnVar.t0.v0(0, (int) f9, null);
                tnVar.l2 = s1Var;
                return;
            }
            i14 = i15;
        }
        tnVar.j2.e(s1Var, Integer.valueOf(i10), i14, i13, true);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean j0() {
        boolean z10;
        tn tnVar = this.a;
        if (tnVar.A9()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.o2) tnVar).inPreviewMode;
        return !z10;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void j2(org.telegram.ui.Cells.s1 s1Var, hh.f fVar) {
        TLRPC.Message message;
        if (s1Var == null) {
            fVar.run();
            return;
        }
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject == null || ((messageObject.isSending() && !messageObject.isEditing()) || (message = messageObject.messageOwner) == null || message.rich_message == null)) {
            fVar.run();
        } else {
            org.telegram.ui.ActionBar.o2 o2Var = this.a;
            o2Var.getSendMessagesHelper().editRichMessage(messageObject, messageObject.messageOwner.rich_message, null, o2Var, true);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void k() {
        h();
    }

    @Override // org.telegram.ui.Cells.j1
    public final void k1() {
        tn tnVar = this.a;
        tnVar.Q7();
        UndoView undoView = tnVar.u3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, tnVar.P5, null);
    }

    public final boolean l() {
        tn tnVar = this.a;
        if (UserObject.isUserSelf(tnVar.f)) {
            return true;
        }
        TLRPC.Chat chat = tnVar.e;
        if (chat != null) {
            return !ChatObject.isChannel(chat) || tnVar.e.megagroup;
        }
        return false;
    }

    public final void m(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, boolean z10) {
        tn tnVar = this.a;
        TLRPC.Chat chat2 = tnVar.e;
        if (chat2 != null && chat.id == chat2.id) {
            gj gjVar = tnVar.W0;
            if (gjVar != null && i10 == 0) {
                gjVar.e(false, false);
                return;
            } else {
                if (s1Var.getMessageObject() != null) {
                    tnVar.j(i10, s1Var.getMessageObject().getId(), true, 0, false, 0);
                    return;
                }
                return;
            }
        }
        if (chat2 == null || chat.id != chat2.id || tnVar.F9()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            ri riVar = null;
            if (z10) {
                ye.c cVar = tnVar.wb;
                if (cVar != null) {
                    cVar.a(true);
                    tnVar.wb = null;
                }
                if (s1Var.getMessageObject() == null) {
                    tnVar.wb = null;
                } else {
                    ri riVar2 = new ri(tnVar, s1Var.getMessageObject().getId(), s1Var, 0);
                    tnVar.wb = riVar2;
                    riVar = riVar2;
                }
            }
            if (tnVar.getMessagesController().checkCanOpenChat(bundle, tnVar, s1Var.getMessageObject(), riVar)) {
                tn tnVar2 = new tn(bundle);
                if (riVar == null || i10 == 0) {
                    tnVar.presentFragment(tnVar2);
                } else {
                    AndroidUtilities.runOnUIThread(new bg.j3(this, riVar, chat, i10, tnVar2, 13), 5000L);
                    riVar.d();
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void m0(String str) {
        tn tnVar = this.a;
        ik ikVar = tnVar.K0;
        if (ikVar == null || ikVar.getVisibility() != 0) {
            hk hkVar = tnVar.N;
            if ((hkVar == null || hkVar.getVisibility() != 0) && tnVar.U != null && str != null && str.length() > 0) {
                tnVar.U.setFieldText("@" + str + " ");
                tnVar.U.H0();
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void m1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        tn tnVar = this.a;
        if (tnVar.z9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) kf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        if (tnVar.getParentActivity() != null) {
            if (tnVar.K0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || kf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                dk dkVar = tnVar.U;
                MessageObject messageObject = s1Var.getMessageObject();
                MessageObject messageObject2 = s1Var.getMessageObject();
                qi qiVar = null;
                String str = tL_inlineButtonTypeUrl != null ? tL_inlineButtonTypeUrl.url : null;
                ye.c cVar = tnVar.wb;
                if (cVar != null) {
                    cVar.a(true);
                    tnVar.wb = null;
                }
                if (str == null || s1Var.getMessageObject() == null) {
                    tnVar.wb = null;
                } else {
                    qi qiVar2 = new qi(tnVar, s1Var.getMessageObject().getId(), str, s1Var, 1);
                    tnVar.wb = qiVar2;
                    qiVar = qiVar2;
                }
                dkVar.c0(keyboardButtonProto, messageObject, messageObject2, qiVar);
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean m2(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        MessageObject messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (s1Var == null || pageBlock == null) {
            return false;
        }
        tn tnVar = this.a;
        if (tnVar.getParentActivity() == null || (messageObject = s1Var.getMessageObject()) == null || (message = messageObject.messageOwner) == null || messageObject.richLayout == null || (richMessage = message.rich_message) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        messageObject.richLayout.collectMediaBlocks(arrayList);
        int indexOf = arrayList.indexOf(pageBlock);
        if (indexOf < 0) {
            return false;
        }
        PhotoViewer t12 = PhotoViewer.t1();
        t12.K2(null, tnVar, null);
        return t12.e2(null, null, null, null, null, null, null, indexOf, new nm(tnVar, arrayList), null, 0L, 0L, 0L, true, new mm(richMessage, arrayList, messageObject), null);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void n(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
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
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        MessageObject messageObject = s1Var.getMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if (messageMedia == null || messageObject == null || !(media instanceof TLRPC.TL_messageMediaPoll)) {
            return;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media;
        TLRPC.WebPage webPage = messageMedia.webpage;
        if (webPage != null) {
            O1(s1Var, webPage, webPage.url, messageMedia.safe);
            return;
        }
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        tn tnVar = this.a;
        if (geoPoint != null) {
            if (AndroidUtilities.isMapsInstalled(tnVar)) {
                cn cnVar = new cn(3);
                c6Var2 = ((org.telegram.ui.ActionBar.o2) tnVar).resourceProvider;
                cnVar.setResourceProvider(c6Var2);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = tnVar.getMessagesController().getPeer(tnVar.a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                tL_messageMediaGeo.geo = messageMedia.geo;
                String str = messageMedia.address;
                if (str == null) {
                    str = (pollAnswer == null || (tL_textWithEntities = pollAnswer.text) == null) ? "" : tL_textWithEntities.text;
                }
                tL_messageMediaGeo.address = str;
                tL_message.media = tL_messageMediaGeo;
                cnVar.K0 = false;
                cnVar.u0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                tnVar.presentFragment(cnVar);
                return;
            }
            return;
        }
        if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
            ht.q().w(tnVar.getParentActivity());
            ht.q().v(new dn(this, tL_messageMediaPoll, pollAnswer, s1Var));
            ht q6 = ht.q();
            TLRPC.Document document4 = messageMedia.document;
            int i18 = MessageObject.isAnimatedEmoji(document4) ? 2 : 0;
            MessageObject messageObject2 = s1Var.getMessageObject();
            c6Var = ((org.telegram.ui.ActionBar.o2) tnVar).resourceProvider;
            q6.t(document4, null, "", null, null, i18, false, messageObject2, c6Var, 200);
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
            TLRPC.TL_message C7 = tn.C7(message);
            C7.media = messageMedia;
            C7.attachPath = bh.i.c(message, i10);
            ArrayList<MessageObject> arrayList = new ArrayList<>();
            i17 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
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
            i15 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
            TLRPC.Document document6 = messageMedia.document;
            bh.a aVar = new bh.a(i15, messageObject, document6, bh.i.c(messageObject.messageOwner, i10));
            if (aVar.g) {
                FileLoader.getInstance(i15).cancelLoadFile(document6);
                aVar.a();
                MessageObject messageObject4 = s1Var.u7;
                if (messageObject4 == null || !messageObject4.isPoll()) {
                    return;
                }
                bh.j jVar = s1Var.Y5;
                if (jVar != null) {
                    jVar.e();
                }
                bh.j jVar2 = s1Var.X5;
                if (jVar2 != null) {
                    jVar2.e();
                    return;
                }
                return;
            }
            if (!aVar.f) {
                FileLoader.getInstance(i15).loadFile(document6, messageObject, 2, 0);
                aVar.a();
                MessageObject messageObject5 = s1Var.u7;
                if (messageObject5 == null || !messageObject5.isPoll()) {
                    return;
                }
                bh.j jVar3 = s1Var.Y5;
                if (jVar3 != null) {
                    jVar3.e();
                }
                bh.j jVar4 = s1Var.X5;
                if (jVar4 != null) {
                    jVar4.e();
                    return;
                }
                return;
            }
            TLRPC.Message message2 = messageObject.messageOwner;
            TLRPC.TL_message C72 = tn.C7(message2);
            C72.media = messageMedia;
            C72.attachPath = bh.i.c(message2, i10);
            i16 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
            en enVar = new en(i16, C72, false, true);
            if (MessageObject.canPreviewDocument(messageMedia.document)) {
                PhotoViewer.t1().K2(null, tnVar, tnVar.aa);
                PhotoViewer t12 = PhotoViewer.t1();
                int i19 = enVar.type;
                t12.c2(enVar, tnVar, i19 != 0 ? tnVar.P5 : 0L, i19 != 0 ? tnVar.H6 : 0L, i19 != 0 ? tnVar.b() : 0L, tnVar.Ba);
                return;
            }
            try {
                AndroidUtilities.openForView(enVar, tnVar.getParentActivity(), tnVar.aa, false);
                return;
            } catch (Exception e10) {
                FileLog.e(e10);
                tnVar.z6(enVar);
                return;
            }
        }
        TLRPC.Message message3 = messageObject.messageOwner;
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
        if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || MessageObject.isVideoDocument(document3))) {
            i11 = messageMedia3 == messageMedia ? arrayList3.size() : -1;
            TLRPC.TL_message C73 = tn.C7(message3);
            C73.media = messageMedia3;
            C73.attachPath = bh.i.c(message3, -2);
            i14 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
            arrayList3.add(new vm(i14, C73, false, true));
            arrayList2.add(-2);
        } else {
            i11 = -1;
        }
        if (messageObject.expandedExplanation && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || MessageObject.isVideoDocument(document2))) {
            if (messageMedia2 == messageMedia) {
                i11 = arrayList3.size();
            }
            TLRPC.TL_message C74 = tn.C7(message3);
            C74.media = messageMedia2;
            C74.attachPath = bh.i.c(message3, -3);
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            C74.message = pollResults2.solution;
            C74.entities = pollResults2.solution_entities;
            i13 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
            arrayList3.add(new wm(i13, C74, false, true));
            arrayList2.add(-3);
        }
        kf.d.b(tL_messageMediaPoll.poll, tnVar.getUserConfig().getClientUserId());
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
                TLRPC.TL_message C75 = tn.C7(message3);
                C75.media = messageMedia4;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                C75.message = tL_textWithEntities2.text;
                C75.entities = tL_textWithEntities2.entities;
                C75.attachPath = bh.i.c(message3, pollAnswer2.unshuffled_index);
                i12 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                arrayList3.add(new xm(i12, C75, false, true));
                arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
            }
        }
        if (i11 <= -1 || arrayList3.isEmpty()) {
            return;
        }
        messageObject.pollMediaMapping = arrayList2;
        PhotoViewer.t1().K2(null, tnVar, tnVar.aa);
        PhotoViewer.t1().a2(arrayList3, i11, tnVar.a(), 0L, 0L, tnVar.Ca);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean n0(org.telegram.ui.Components.y5 y5Var) {
        TLRPC.InputStickerSet inputStickerSet;
        int i10;
        tn tnVar = this.a;
        if (tnVar.getMessagesController().premiumFeaturesBlocked() || y5Var == null || y5Var.standard) {
            return false;
        }
        long documentId = y5Var.getDocumentId();
        TLRPC.Document document = y5Var.document;
        if (document == null) {
            i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
            document = org.telegram.ui.Components.p5.f(i10, documentId);
        }
        if (document == null || (inputStickerSet = MessageObject.getInputStickerSet(document)) == null) {
            return false;
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, true);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(inputStickerSet);
        org.telegram.ui.Components.jv jvVar = new org.telegram.ui.Components.jv(tnVar, tnVar.getParentActivity(), tnVar.aa, arrayList);
        org.telegram.ui.Components.zu zuVar = jvVar.f;
        zuVar.getClass();
        ImageReceiver imageReceiver = new ImageReceiver(zuVar);
        zuVar.v = imageReceiver;
        if (zuVar.d) {
            imageReceiver.onAttachedToWindow();
        }
        zuVar.w = true;
        zuVar.x.d(1.0f, true);
        zuVar.v.setImage(ImageLocation.getForDocument(document), "140_140", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "140_140", DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.g6.m6, 0.2f, true), 0L, null, null, 0);
        zuVar.v.setLayerNum(7);
        zuVar.v.setAllowStartLottieAnimation(true);
        zuVar.v.setAllowStartAnimation(true);
        zuVar.v.setAutoRepeat(1);
        zuVar.v.setAllowDecodeSingleFrame(true);
        zuVar.v.setParentView(zuVar);
        jvVar.setCalcMandatoryInsets(tnVar.x9());
        tnVar.showDialog(jvVar);
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void n2(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject primaryMessageObject = s1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.a.rc(primaryMessageObject, false);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void o(org.telegram.ui.Cells.s1 s1Var) {
        if (s1Var.getMessageObject().isImportedForward()) {
            k1();
            return;
        }
        tn tnVar = this.a;
        if (tnVar.h3 || tnVar.t0 == null || tnVar.getParentActivity() == null || tnVar.fragmentView == null) {
            return;
        }
        if (tnVar.q2 == null) {
            km kmVar = tnVar.T0;
            int indexOfChild = kmVar.indexOfChild(tnVar.O);
            if (indexOfChild == -1) {
                return;
            }
            org.telegram.ui.Components.g40 g40Var = new org.telegram.ui.Components.g40(1, tnVar.getParentActivity(), tnVar.aa, false);
            tnVar.q2 = g40Var;
            kmVar.addView(g40Var, indexOfChild + 1, i7.f6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            tnVar.q2.setAlpha(0.0f);
            tnVar.q2.setVisibility(4);
        }
        tnVar.q2.e(s1Var, null, 0, 0, true);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void p() {
        this.a.T0.getClass();
    }

    @Override // org.telegram.ui.Cells.j1
    public final void p0(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
        tn tnVar = this.a;
        tnVar.I7(s1Var, false, false, f9, f10, true, false, false);
        tnVar.t0.getClass();
        tn.c2(tnVar, RecyclerView.R(s1Var));
    }

    @Override // org.telegram.ui.Cells.j1
    public final void p1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
        if (s1Var == null || document == null) {
            return;
        }
        tn tnVar = this.a;
        if (tnVar.getParentLayout() == null || !Y(s1Var)) {
            return;
        }
        org.telegram.ui.Components.j70 H = org.telegram.ui.Components.j70.H(tnVar, s1Var);
        H.c(R.drawable.msg_download, LocaleController.getString(R.string.SaveToDownloads), new u1(this, s1Var, document, 24), false);
        H.t = false;
        H.Z();
    }

    public final void q(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            org.telegram.ui.ActionBar.o2 o2Var = this.a;
            if (o2Var.getMessagesController().checkCanOpenChat(bundle, o2Var, s1Var.getMessageObject())) {
                o2Var.presentFragment(new tn(bundle));
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void q2() {
        this.a.r9();
    }

    public final void r(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            bundle.putBoolean("expandPhoto", false);
            this.a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0118, code lost:
    
        if (r1.noforwards == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0124, code lost:
    
        if (org.telegram.messenger.ChatObject.isPublic(r1) != false) goto L90;
     */
    @Override // org.telegram.ui.Cells.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(org.telegram.ui.Cells.s1 s1Var) {
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
        tn tnVar = this.a;
        if (tnVar.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.m21 m21Var = tnVar.N1;
        if (m21Var != null && tnVar.Z3 == 0 && (s1Var.P7 || s1Var.Q7)) {
            m21Var.m(s1Var.getMessageObject().getTopicId(), true);
            return;
        }
        if (tnVar.getMessagesController().isFrozen()) {
            i13 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
            c.b(i13);
            return;
        }
        dk dkVar = tnVar.U;
        if (dkVar != null) {
            dkVar.P();
        }
        MessageObject messageObject = s1Var.getMessageObject();
        int i14 = tnVar.N3;
        if (i14 == 2) {
            tnVar.R8.Q0(messageObject.getId());
            tnVar.finishFragment();
            return;
        }
        if (i14 == 3 || ((i14 == 7 && tnVar.K3 == 2) || !((!UserObject.isReplyUser(tnVar.f) && !UserObject.isUserSelf(tnVar.f)) || (messageFwdHeader = messageObject.messageOwner.fwd_from) == null || messageFwdHeader.saved_from_peer == null))) {
            if (UserObject.isReplyUser(tnVar.f) && (messageReplyHeader = (message = messageObject.messageOwner).reply_to) != null && (i10 = messageReplyHeader.reply_to_top_id) != 0) {
                tnVar.aa(messageReplyHeader.reply_to_peer_id.channel_id, null, i10, 0L, -1, message.fwd_from.saved_from_msg_id, messageObject);
                return;
            } else if (tnVar.N3 == 7 && tnVar.K3 == 2) {
                tnVar.fa(messageObject);
                return;
            } else {
                tnVar.ga(messageObject);
                return;
            }
        }
        ArrayList<MessageObject> arrayList = (messageObject.getGroupId() == 0 || (groupedMessages = (MessageObject.GroupedMessages) tnVar.t6.f(messageObject.getGroupId())) == null) ? null : groupedMessages.messages;
        if (arrayList == null) {
            arrayList = org.telegram.messenger.x3.n(messageObject);
        }
        if (tnVar.getMessagesController().storiesEnabled() && !messageObject.isSponsored() && (((message2 = messageObject.messageOwner) == null || !message2.noforwards) && (i12 = messageObject.type) != 17 && i12 != 12)) {
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
                tnVar.showDialog(new zm(this, tnVar.getParentActivity(), tnVar, arrayList, ChatObject.isChannel(tnVar.e), z10, tnVar.aa, z10, messageObject));
                Activity parentActivity = tnVar.getParentActivity();
                i11 = ((org.telegram.ui.ActionBar.o2) tnVar).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
                tnVar.fragmentView.requestLayout();
            }
        }
        z10 = false;
        tnVar.showDialog(new zm(this, tnVar.getParentActivity(), tnVar, arrayList, ChatObject.isChannel(tnVar.e), z10, tnVar.aa, z10, messageObject));
        Activity parentActivity2 = tnVar.getParentActivity();
        i11 = ((org.telegram.ui.ActionBar.o2) tnVar).classGuid;
        AndroidUtilities.setAdjustResizeToNothing(parentActivity2, i11);
        tnVar.fragmentView.requestLayout();
    }

    @Override // org.telegram.ui.Cells.j1
    public final void s2(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
        this.a.W7(s1Var, reactionCount, z10, f9, f10);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void t() {
        this.a.Yb();
    }

    @Override // org.telegram.ui.Cells.j1
    public final void t0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f9, float f10) {
        org.telegram.ui.ActionBar.l lVar;
        tn tnVar = this.a;
        lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
        boolean z10 = true;
        if (lVar.s() || tnVar.A9()) {
            tn.b2(tnVar, s1Var, true, f9, f10);
            return;
        }
        if (s1Var.getMessageObject() != null && s1Var.getMessageObject().isSponsored()) {
            P0(10, s1Var);
            return;
        }
        if (!ChatObject.isForum(tnVar.e) && !tnVar.F9()) {
            z10 = false;
        }
        v(user, z10);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void u(org.telegram.ui.Cells.s1 s1Var) {
        int i10;
        int i11;
        oj ojVar;
        MessageObject primaryMessageObject = s1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        primaryMessageObject.factCheckExpanded = !primaryMessageObject.factCheckExpanded;
        primaryMessageObject.forceUpdate = true;
        tn tnVar = this.a;
        lj ljVar = tnVar.t0;
        if (ljVar != null && (ojVar = tnVar.v0) != null && ojVar.y < 0) {
            for (int childCount = ljVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = tnVar.t0.getChildAt(childCount);
                tnVar.t0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.s1)) {
                        if (childAt instanceof org.telegram.ui.Cells.v0) {
                            i11 = tnVar.L8(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.s1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = tnVar.L8(childAt);
                            break;
                        }
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        tnVar.rc(primaryMessageObject, false);
        nh.t3 t3Var = tnVar.w1;
        if (t3Var != null) {
            t3Var.e(true);
        }
        if (i10 < 0 || s1Var.getCurrentMessagesGroup() != null) {
            return;
        }
        tnVar.v0.h1(i10, i11);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void u1(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
        fh.j jVar;
        fh.k kVar = this.a.T9;
        if (kVar == null || (jVar = (fh.j) kVar.a.get(fh.k.b(s1Var))) == null) {
            return;
        }
        fh.d[] dVarArr = jVar.w;
        RectF rectF = jVar.r;
        if (jVar.I) {
            float f11 = (f9 - rectF.left) + jVar.Q;
            float f12 = (f10 - rectF.top) + jVar.R;
            int i10 = fh.i.a;
            int b10 = (((float) (-AndroidUtilities.dp((float) 37))) >= f12 || f12 >= rectF.height()) ? -1 : i7.w.b((int) Math.floor((f11 - (AndroidUtilities.dp(9) - (AndroidUtilities.dp(11) / 2.0f))) / AndroidUtilities.dp(fh.i.a + 11)), 0, dVarArr.length - 1);
            if (jVar.N == b10) {
                return;
            }
            jVar.a.performHapticFeedback(3, 1);
            jVar.N = b10;
            int i11 = 0;
            while (i11 < dVarArr.length) {
                fh.d dVar = dVarArr[i11];
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
                    dVar.n.setInterpolator(fh.h.a);
                    dVar.n.start();
                }
                fh.d dVar2 = dVarArr[i11];
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
                    dVar2.k.setInterpolator(fh.h.a);
                    dVar2.k.start();
                }
                i11++;
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean u2(int i10) {
        boolean z10;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        if (i10 != 16 && i10 != R.id.acc_action_small_button && i10 != R.id.acc_action_msg_options) {
            return false;
        }
        tn tnVar = this.a;
        z10 = ((org.telegram.ui.ActionBar.o2) tnVar).inPreviewMode;
        if (!z10 || !tnVar.F9) {
            return !c();
        }
        b5Var = ((org.telegram.ui.ActionBar.o2) tnVar).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.o2) tnVar).parentLayout;
            ((ActionBarLayout) b5Var2).r();
        }
        return true;
    }

    public final void v(TLRPC.User user, boolean z10) {
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
        tn tnVar = this.a;
        TLRPC.User user2 = tnVar.f;
        if (user2 != null && user2.id == user.id) {
            i11 = 1;
        }
        profileActivity.N4(i11);
        Activity parentActivity = tnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.o2) tnVar).classGuid;
        AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
        tnVar.presentFragment(profileActivity);
    }

    /* JADX WARN: Code restructure failed: missing block: B:273:0x0b1e, code lost:
    
        if (r1.exists() != false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0be3, code lost:
    
        if (r1.startsWith("text/x-web-markdown") == false) goto L320;
     */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0c21 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.telegram.ui.Cells.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v0(org.telegram.ui.Cells.s1 s1Var, float f9, float f10, boolean z10) {
        int i10;
        MessageObject messageObject;
        boolean z11;
        boolean z12;
        long j10;
        long j11;
        File file;
        TLRPC.Chat chat;
        zt0 E;
        char c3;
        zt0 zt0Var;
        int i11;
        char c6;
        float f11;
        float f12;
        MessageObject messageObject2;
        ImageLocation imageLocation;
        BitmapDrawable bitmapDrawable;
        char c10;
        MessageObject messageObject3;
        MessageObject messageObject4;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        int i12;
        MessageObject messageObject5 = s1Var.getMessageObject();
        int i13 = messageObject5.type;
        tn tnVar = this.a;
        if (i13 == 23) {
            TLRPC.MessageMedia messageMedia2 = messageObject5.messageOwner.media;
            TL_stories.StoryItem storyItem = messageMedia2.storyItem;
            if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                return;
            }
            storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia2.peer);
            storyItem.messageId = messageObject5.getId();
            storyItem.messageType = 2;
            lh.l7.b(storyItem, tnVar.f);
            tnVar.getOrCreateStoryViewer().G(tnVar.getParentActivity(), messageObject5.messageOwner.media.storyItem, lh.b7.a(tnVar.t0));
            return;
        }
        int i14 = 1;
        if (messageObject5.isVideo()) {
            i12 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
            if (DownloadController.getInstance(i12).canDownloadMedia(messageObject5.messageOwner) == 1) {
                messageObject5.putInDownloadsStore = true;
            }
        } else {
            messageObject5.putInDownloadsStore = true;
        }
        if (messageObject5.isSendError()) {
            tnVar.I7(s1Var, false, false, f9, f10, true, false, false);
            return;
        }
        if (messageObject5.isSending()) {
            return;
        }
        int i15 = 0;
        if (z10 && (message = messageObject5.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && !TextUtils.isEmpty(webPage.url)) {
            String str = messageObject5.messageOwner.media.webpage.url;
            AndroidUtilities.getHostAuthority(str);
            if (tnVar.ea(str, s1Var, null, messageObject5.getId(), 2)) {
                return;
            }
            ye.c cVar = tnVar.wb;
            if (cVar != null) {
                cVar.a(true);
            }
            tnVar.wb = s1Var.getMessageObject() != null ? new ym(this, s1Var, i15) : null;
            ye.d.r(tnVar.getParentActivity(), Uri.parse(str), true, false, false, tnVar.wb, null, false, true, false);
            return;
        }
        int i16 = 4;
        if (messageObject5.isDice()) {
            qm qmVar = new qm(this, messageObject5, i15);
            if (messageObject5.isStakeableDice()) {
                tnVar.getMessagesController().loadStakeDiceInfo(new b0(this, messageObject5, qmVar, i16));
                return;
            } else {
                qmVar.run();
                return;
            }
        }
        if ((messageObject5.isAnimatedEmoji() && (!messageObject5.isAnimatedAnimatedEmoji() || (tnVar.ta.e.containsKey(ry.q(MessageObject.findAnimatedEmojiEmoticon(messageObject5.getDocument()))) && tnVar.f != null))) || messageObject5.isPremiumSticker()) {
            tnVar.Na(s1Var);
            tnVar.ta.l(s1Var, tnVar, true);
            tnVar.t0.I0(false);
            return;
        }
        if (messageObject5.needDrawBluredPreview()) {
            ke fb2 = tnVar.fb(messageObject5, false);
            g5.v O4 = tn.O4(tnVar, messageObject5);
            s1Var.invalidate();
            final SecretMediaViewer f13 = SecretMediaViewer.f();
            final Activity parentActivity = tnVar.getParentActivity();
            int i17 = UserConfig.selectedAccount;
            f13.a = i17;
            ImageReceiver imageReceiver = f13.h;
            imageReceiver.setCurrentAccount(i17);
            int i18 = 7;
            if (f13.b != parentActivity) {
                f13.b = parentActivity;
                f13.c1 = new org.telegram.ui.Components.lm0(parentActivity, null);
                n0 n0Var = new n0(f13, parentActivity, 21);
                f13.d = n0Var;
                n0Var.setBackgroundDrawable(f13.h0);
                f13.d.setFocusable(true);
                f13.d.setFocusableInTouchMode(true);
                f13.d.setClipChildren(false);
                f13.d.setClipToPadding(false);
                f13.e = new bg.d1(f13, parentActivity);
                View view = new View(parentActivity);
                f13.f = view;
                view.setBackgroundColor(2130706432);
                f13.e.addView(f13.f, i7.f6.e(-1, -2, 80));
                f13.e.setFocusable(false);
                f13.d.addView(f13.e);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f13.e.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                layoutParams.gravity = 51;
                f13.e.setLayoutParams(layoutParams);
                f13.e.setFitsSystemWindows(true);
                f13.e.setOnApplyWindowInsetsListener(new r31(f13, 0));
                f13.e.setSystemUiVisibility(1792);
                GestureDetector gestureDetector = new GestureDetector(f13.e.getContext(), f13);
                f13.H0 = gestureDetector;
                gestureDetector.setOnDoubleTapListener(f13);
                cg.m1 m1Var = new cg.m1(f13, parentActivity, i18);
                f13.B = m1Var;
                m1Var.setTitleColor(-1);
                f13.B.setSubtitleColor(-1);
                f13.B.setBackgroundColor(2130706432);
                f13.B.setOccupyStatusBar(true);
                f13.B.B(1090519039, false);
                f13.B.C(-1, false);
                f13.B.setBackButtonImage(R.drawable.ic_ab_back);
                f13.B.setTitleRightMargin(AndroidUtilities.dp(70.0f));
                f13.e.addView(f13.B, i7.f6.c(-2.0f, -1));
                f13.B.setActionBarMenuOnItemClick(new al0(f13, 15));
                nh.t3 t3Var = new nh.t3(parentActivity, 1);
                f13.r = t3Var;
                t3Var.m(1.0f, -26.0f);
                f13.r.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                f13.e.addView(f13.r, i7.f6.d(-1, 80.0f, 53, 0.0f, 48.0f, 0.0f, 0.0f));
                y31 y31Var = new y31(f13, parentActivity);
                f13.n = y31Var;
                f13.e.addView(y31Var, i7.f6.d(119, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
                fv0 fv0Var = new fv0(f13, i14);
                f13.Q = new z31(f13, parentActivity);
                View view2 = new View(parentActivity);
                f13.P = view2;
                view2.setBackgroundColor(2130706432);
                f13.Q.addView(f13.P, i7.f6.e(-1, -1, 119));
                org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(f13.e.getContext());
                f13.O = h5Var;
                h5Var.setTextColor(-1);
                f13.O.setGravity(53);
                f13.O.setTextSize(14);
                f13.O.setImportantForAccessibility(2);
                f13.Q.addView(f13.O, i7.f6.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
                op0 op0Var = new op0(f13, parentActivity, 5);
                f13.N = op0Var;
                org.telegram.ui.Components.z61 z61Var = new org.telegram.ui.Components.z61(op0Var);
                f13.M = z61Var;
                z61Var.z = AndroidUtilities.dp(2.0f);
                org.telegram.ui.Components.z61 z61Var2 = f13.M;
                z61Var2.k = 872415231;
                z61Var2.l = 872415231;
                z61Var2.m = -1;
                z61Var2.n = -1;
                z61Var2.A = 1509949439;
                z61Var2.j = fv0Var;
                f13.Q.addView(f13.N);
                f13.e.addView(f13.Q, i7.f6.e(-1, 48, 80));
                sr0 sr0Var = new sr0(null, new lh.b());
                f13.U = sr0Var;
                sr0Var.k0 = true;
                sr0Var.i0 = false;
                nt0 nt0Var = new nt0(f13.e.getContext());
                f13.V = nt0Var;
                nt0Var.setFactory(new ViewSwitcher.ViewFactory() { // from class: org.telegram.ui.s31
                    @Override // android.widget.ViewSwitcher.ViewFactory
                    public final View makeView() {
                        SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
                        return new mt0(parentActivity, secretMediaViewer.W, secretMediaViewer.U, new b5(secretMediaViewer, 22), new xf0(secretMediaViewer, 2));
                    }
                });
                f13.V.setVisibility(4);
                if (!f13.s1) {
                    f13.s1 = true;
                    f13.V.setLayerType(2, null);
                    f13.V.getCurrentView().setLayerType(2, null);
                    f13.V.getNextView().setLayerType(2, null);
                }
                ImageView imageView = new ImageView(parentActivity);
                f13.R = imageView;
                imageView.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(64.0f), 1711276032));
                org.telegram.ui.Components.cg0 cg0Var = new org.telegram.ui.Components.cg0(28);
                f13.S = cg0Var;
                cg0Var.setCallback(f13.R);
                f13.R.setImageDrawable(f13.S);
                f13.R.setScaleType(ImageView.ScaleType.CENTER);
                f13.R.setScaleX(0.6f);
                f13.R.setScaleY(0.6f);
                f13.R.setAlpha(0.0f);
                f13.R.setPivotX(AndroidUtilities.dp(32.0f));
                f13.R.setPivotY(AndroidUtilities.dp(32.0f));
                f13.e.addView(f13.R, i7.f6.e(64, 64, 17));
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
                org.telegram.ui.Cells.w9 o10 = f13.U.o(f13.d.getContext());
                if (o10 != null) {
                    AndroidUtilities.removeFromParent(o10);
                    f13.e.addView(o10);
                }
                f13.U.T(f13.e);
                f13.U.j0 = true;
            }
            SecretMediaViewer f14 = SecretMediaViewer.f();
            hl hlVar = tnVar.Ba;
            SecretMediaViewer.PhotoBackgroundDrawable photoBackgroundDrawable = f14.h0;
            ImageReceiver imageReceiver2 = f14.h;
            if (f14.b != null && messageObject5.needDrawBluredPreview()) {
                if (hlVar == null || (E = hlVar.E(messageObject5, null, 0, true, false)) == null) {
                    return;
                }
                f14.m1 = messageObject5.messageOwner.ttl == Integer.MAX_VALUE;
                f14.l1 = O4;
                f14.J = hlVar;
                f14.G = System.currentTimeMillis();
                f14.H = 0L;
                f14.g0 = true;
                f14.f0 = true;
                f14.l0 = false;
                e5.c cVar2 = f14.w;
                if (cVar2 != null) {
                    cVar2.setVisibility(4);
                }
                f14.i();
                f14.J0 = 0.0f;
                f14.K0 = 1.0f;
                f14.L0 = 0.0f;
                f14.M0 = 0.0f;
                f14.N0 = 0.0f;
                f14.O0 = 0.0f;
                f14.P0 = 0.0f;
                f14.Q0 = 0.0f;
                f14.V0 = false;
                f14.W0 = false;
                f14.X0 = false;
                f14.Y0 = false;
                f14.Z0 = true;
                f14.n(f14.u0);
                photoBackgroundDrawable.setAlpha(0);
                f14.e.setAlpha(1.0f);
                f14.e.setVisibility(0);
                f14.n.setAlpha(1.0f);
                f14.F = false;
                f14.D = false;
                f14.E = false;
                f14.I = true;
                imageReceiver2.setManualAlphaAnimator(false);
                f14.K = 0;
                f14.L = 0;
                RectF rectF = new RectF(E.a.getDrawRegion());
                rectF.left = Math.max(rectF.left, E.a.getImageX());
                rectF.top = Math.max(rectF.top, E.a.getImageY());
                rectF.right = Math.min(rectF.right, E.a.getImageX2());
                rectF.bottom = Math.min(rectF.bottom, E.a.getImageY2());
                float width = rectF.width();
                float height = rectF.height();
                Point point = AndroidUtilities.displaySize;
                f14.u0 = Math.max(width / point.x, height / (point.y + AndroidUtilities.statusBarHeight));
                int[] iArr = E.h;
                if (iArr != null) {
                    f14.D0 = new int[iArr.length];
                    int i19 = 0;
                    while (true) {
                        int[] iArr2 = E.h;
                        c3 = 1;
                        if (i19 >= iArr2.length) {
                            break;
                        }
                        f14.D0[i19] = iArr2[i19];
                        i19++;
                    }
                } else {
                    c3 = 1;
                    f14.D0 = null;
                }
                float f15 = E.b;
                float f16 = rectF.left;
                f14.s0 = ((width / 2.0f) + (f15 + f16)) - (r7 / 2);
                f14.t0 = ((height / 2.0f) + (E.c + rectF.top)) - (r6 / 2);
                f14.r0 = Math.abs(f16 - E.a.getImageX());
                int abs = (int) Math.abs(rectF.top - E.a.getImageY());
                E.d.getLocationInWindow(new int[2]);
                float f17 = (r7[c3] - (E.c + rectF.top)) + E.j;
                f14.n0 = f17;
                float f18 = abs;
                f14.n0 = Math.max(0.0f, Math.max(f17, f18));
                float height2 = (((E.c + rectF.top) + ((int) height)) - (E.d.getHeight() + r7[c3])) + E.i;
                f14.o0 = height2;
                f14.o0 = Math.max(0.0f, Math.max(height2, f18));
                f14.p0 = 0.0f;
                f14.p0 = Math.max(0.0f, Math.max(0.0f, f18));
                f14.q0 = 0.0f;
                f14.q0 = Math.max(0.0f, Math.max(0.0f, f18));
                f14.F0 = System.currentTimeMillis();
                f14.v0 = 0.0f;
                f14.w0 = 0.0f;
                f14.z0 = 0.0f;
                f14.B0 = 0.0f;
                f14.C0 = 0.0f;
                f14.y0 = 0.0f;
                f14.A0 = 0.0f;
                f14.x0 = 1.0f;
                f14.E0 = true;
                f14.a1 = true;
                jf.s0 s0Var = f14.h1;
                if (s0Var != null) {
                    s0Var.destroy();
                    f14.h1 = null;
                }
                LaunchActivity launchActivity = LaunchActivity.C1;
                f14.h1 = launchActivity != null ? new jf.s0(launchActivity, true) : null;
                NotificationCenter.getInstance(f14.a).addObserver(f14, NotificationCenter.messagesDeleted);
                NotificationCenter.getInstance(f14.a).addObserver(f14, NotificationCenter.updateMessageMedia);
                NotificationCenter.getInstance(f14.a).addObserver(f14, NotificationCenter.didCreatedNewDeleteTask);
                f14.v = MessageObject.getPeerId(messageObject5.messageOwner.peer_id);
                f14.d0 = messageObject5;
                TLRPC.Document document = messageObject5.getDocument();
                ImageReceiver.BitmapHolder bitmapHolder = f14.e0;
                if (bitmapHolder != null) {
                    bitmapHolder.release();
                    f14.e0 = null;
                }
                f14.e0 = E.a.getThumbBitmapSafe();
                f14.Q.setVisibility(8);
                if (document != null) {
                    int i20 = 0;
                    while (true) {
                        if (i20 >= document.attributes.size()) {
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i20);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) documentAttribute;
                            f14.K = tL_documentAttributeVideo.w;
                            f14.L = tL_documentAttributeVideo.h;
                            break;
                        }
                        i20++;
                    }
                    if (MessageObject.isGifDocument(document)) {
                        f14.B.setTitle(LocaleController.getString(R.string.DisappearingGif));
                        String str2 = messageObject5.messageOwner.attachPath;
                        ImageLocation forDocument = (str2 == null || !messageObject5.attachPathExists) ? ImageLocation.getForDocument(document) : ImageLocation.getForPath(str2);
                        f12 = 1.0f;
                        f11 = 0.0f;
                        zt0Var = E;
                        c6 = 5;
                        messageObject4 = messageObject5;
                        ImageLocation imageLocation2 = forDocument;
                        i11 = -1;
                        imageReceiver2.setImage(imageLocation2, (String) null, f14.e0 != null ? new BitmapDrawable(f14.e0.bitmap) : null, -1L, (String) null, messageObject4, 1);
                    } else {
                        zt0Var = E;
                        i11 = -1;
                        c6 = 5;
                        f11 = 0.0f;
                        f12 = 1.0f;
                        f14.X = 1;
                        f14.B.setTitle(LocaleController.getString(R.string.DisappearingVideo));
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
                        f14.F = true;
                        f14.Q.setVisibility(0);
                        messageObject4 = messageObject5;
                        imageReceiver2.setImage((ImageLocation) null, (String) null, f14.e0 != null ? new BitmapDrawable(f14.e0.bitmap) : null, -1L, (String) null, messageObject4, 2);
                    }
                    messageObject3 = messageObject4;
                    c10 = 3;
                } else {
                    zt0Var = E;
                    i11 = -1;
                    c6 = 5;
                    f11 = 0.0f;
                    f12 = 1.0f;
                    f14.B.setTitle(LocaleController.getString(R.string.DisappearingPhoto));
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject5.photoThumbs, AndroidUtilities.getPhotoSize());
                    ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject5.photoThumbsObject);
                    if (f14.e0 != null) {
                        messageObject2 = messageObject5;
                        imageLocation = forObject;
                        bitmapDrawable = new BitmapDrawable(f14.e0.bitmap);
                    } else {
                        messageObject2 = messageObject5;
                        imageLocation = forObject;
                        bitmapDrawable = null;
                    }
                    c10 = 3;
                    imageReceiver2.setImage(imageLocation, (String) null, bitmapDrawable, -1L, (String) null, messageObject2, 2);
                    messageObject3 = messageObject2;
                    if (closestPhotoSizeWithSize != null) {
                        f14.K = closestPhotoSizeWithSize.w;
                        f14.L = closestPhotoSizeWithSize.h;
                    }
                }
                f14.j(messageObject3, "", false);
                f14.j(messageObject3, messageObject3.caption, true);
                f14.m(true, false);
                f14.k(false, false);
                f14.S.a(true, true);
                if (f14.m1) {
                    y31 y31Var2 = f14.n;
                    y31Var2.e = true;
                    TextPaint textPaint = y31Var2.r;
                    textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                    textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
                    textPaint.setColor(i11);
                    StaticLayout staticLayout = new StaticLayout("1", textPaint, 999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    y31Var2.s = staticLayout;
                    y31Var2.v = staticLayout.getLineCount() > 0 ? y31Var2.s.getLineWidth(0) : 0.0f;
                    y31Var2.w = y31Var2.s.getHeight();
                    y31Var2.invalidate();
                    f14.n.setOnClickListener(new w21(f14, 4));
                } else {
                    f14.n.setOnClickListener(null);
                }
                try {
                    if (f14.d.getParent() != null) {
                        ((WindowManager) f14.b.getSystemService("window")).removeView(f14.d);
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                ((WindowManager) f14.b.getSystemService("window")).addView(f14.d, f14.c);
                f14.n.invalidate();
                f14.s = true;
                Window window = f14.b.getWindow();
                f14.k1 = AndroidUtilities.getLightNavigationBar(window);
                AndroidUtilities.setLightNavigationBar(f14.b, false);
                AndroidUtilities.setLightNavigationBar((View) f14.d, false);
                Activity activity = f14.b;
                if (activity instanceof LaunchActivity) {
                    f14.j1 = Build.VERSION.SDK_INT >= 26 ? ((LaunchActivity) activity).getWindow().getNavigationBarColor() : 0;
                    ((LaunchActivity) f14.b).y(-16777216);
                } else {
                    f14.j1 = window.getNavigationBarColor();
                    AndroidUtilities.setNavigationBarColor(f14.b, -16777216);
                }
                AnimatorSet animatorSet = new AnimatorSet();
                f14.G0 = animatorSet;
                cg.m1 m1Var2 = f14.B;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m1Var2, (Property<cg.m1, Float>) property, 0.0f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(f14.W, (Property<xs0, Float>) property, 0.0f, 1.0f);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(f14.r, (Property<nh.t3, Float>) property, 0.0f, 1.0f);
                ObjectAnimator ofInt = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.r6.d, 0, 255);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(f14, f14.r1, 0.0f, 1.0f);
                z31 z31Var = f14.Q;
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(z31Var, z31Var.n, f12);
                z31 z31Var2 = f14.Q;
                if (f14.F) {
                    f11 = 1.0f;
                }
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(z31Var2, (Property<z31, Float>) property, f11);
                Animator[] animatorArr = new Animator[7];
                animatorArr[0] = ofFloat;
                animatorArr[1] = ofFloat2;
                animatorArr[2] = ofFloat3;
                animatorArr[c10] = ofInt;
                animatorArr[4] = ofFloat4;
                animatorArr[c6] = ofFloat5;
                animatorArr[6] = ofFloat6;
                animatorSet.playTogether(animatorArr);
                f14.i0 = 3;
                f14.k0 = new xe0(f14, fb2, messageObject3, 26);
                f14.G0.setDuration(250L);
                f14.G0.addListener(new w31(f14, 0));
                f14.j0 = System.currentTimeMillis();
                if (SharedConfig.getDevicePerformanceClass() == 0) {
                    f14.e.setLayerType(2, null);
                }
                f14.G0.setInterpolator(new DecelerateInterpolator());
                photoBackgroundDrawable.b = 0;
                photoBackgroundDrawable.a = new t31(0, f14, zt0Var);
                f14.G0.start();
            }
        } else {
            if (MessageObject.isAnimatedEmoji(messageObject5.getDocument()) && MessageObject.getInputStickerSet(messageObject5.getDocument()) != null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(MessageObject.getInputStickerSet(messageObject5.getDocument()));
                org.telegram.ui.Components.jv jvVar = new org.telegram.ui.Components.jv(tnVar, tnVar.getParentActivity(), tnVar.aa, arrayList);
                jvVar.setCalcMandatoryInsets(tnVar.x9());
                tnVar.showDialog(jvVar);
                return;
            }
            if (messageObject5.getInputStickerSet() != null) {
                org.telegram.ui.Components.nx0 nx0Var = new org.telegram.ui.Components.nx0(tnVar.getParentActivity(), tnVar, messageObject5.getInputStickerSet(), null, (tnVar.K0.getVisibility() == 0 || !((chat = tnVar.e) == null || ChatObject.canSendStickers(chat))) ? null : tnVar.U, tnVar.aa);
                nx0Var.setCalcMandatoryInsets(tnVar.x9());
                tnVar.showDialog(nx0Var);
                return;
            }
            if (messageObject5.isVideo() || (i10 = messageObject5.type) == 1 || ((i10 == 0 && !messageObject5.isWebpageDocument()) || messageObject5.isGif())) {
                ym ymVar = null;
                if (messageObject5.isSponsored()) {
                    if (messageObject5.isGif() || messageObject5.isPhoto()) {
                        int i21 = 1;
                        tnVar.J9(messageObject5, true, false);
                        if (messageObject5.sponsoredUrl != null) {
                            ye.c cVar3 = tnVar.wb;
                            if (cVar3 != null) {
                                cVar3.a(true);
                            }
                            if (s1Var.getMessageObject() != null) {
                                ymVar = new ym(this, s1Var, i21);
                            }
                            tnVar.wb = ymVar;
                            ye.d.r(tnVar.getParentActivity(), Uri.parse(messageObject5.sponsoredUrl), true, false, false, tnVar.wb, null, false, tnVar.getMessagesController().sponsoredLinksInappAllow, false);
                            return;
                        }
                    } else if (messageObject5.isVideo()) {
                        tnVar.J9(messageObject5, true, false);
                    }
                }
                if (messageObject5.getDuration() > 0.0d && messageObject5.getVideoStartsTimestamp() > 0 && !messageObject5.openedInViewer) {
                    messageObject5.forceSeekTo = (float) (messageObject5.getVideoStartsTimestamp() / messageObject5.getDuration());
                }
                tnVar.ha(s1Var, messageObject5);
                return;
            }
            int i22 = messageObject5.type;
            if (i22 == 3) {
                tnVar.fb(messageObject5, true);
                try {
                    String str3 = messageObject5.messageOwner.attachPath;
                    File file4 = (str3 == null || str3.length() == 0) ? null : new File(messageObject5.messageOwner.attachPath);
                    if (file4 == null || !file4.exists()) {
                        file4 = tnVar.getFileLoader().getPathToMessage(messageObject5.messageOwner);
                    }
                    Intent intent = new Intent("android.intent.action.VIEW");
                    if (Build.VERSION.SDK_INT >= 24) {
                        intent.setFlags(1);
                        intent.setDataAndType(FileProvider.d(tnVar.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", file4), "video/mp4");
                    } else {
                        intent.setDataAndType(Uri.fromFile(file4), "video/mp4");
                    }
                    tnVar.getParentActivity().startActivityForResult(intent, 500);
                } catch (Exception e11) {
                    FileLog.e(e11);
                    tnVar.z6(messageObject5);
                }
            } else if (i22 == 4) {
                if (AndroidUtilities.isMapsInstalled(tnVar)) {
                    if (!messageObject5.isLiveLocation()) {
                        rc0 rc0Var = new rc0(tnVar.h == null ? 3 : 0);
                        rc0Var.B0 = tnVar;
                        rc0Var.u0(messageObject5);
                        tnVar.presentFragment(rc0Var);
                        return;
                    }
                    TLRPC.Chat chat2 = tnVar.e;
                    rc0 rc0Var2 = new rc0((chat2 == null || ChatObject.canSendMessages(chat2) || tnVar.e.megagroup) ? 2 : 6);
                    rc0Var2.B0 = tnVar;
                    rc0Var2.u0(messageObject5);
                    tnVar.presentFragment(rc0Var2);
                }
            } else if (i22 == 9 || i22 == 0) {
                if (messageObject5.getDocumentName().toLowerCase().endsWith("attheme")) {
                    String str4 = messageObject5.messageOwner.attachPath;
                    if (str4 != null && str4.length() != 0) {
                        file = new File(messageObject5.messageOwner.attachPath);
                    }
                    file = null;
                    if (file == null) {
                        File pathToMessage2 = tnVar.getFileLoader().getPathToMessage(messageObject5.messageOwner);
                        if (pathToMessage2.exists()) {
                            file = pathToMessage2;
                        }
                    }
                    org.telegram.ui.ActionBar.f6 u10 = org.telegram.ui.ActionBar.g6.u(file, messageObject5.getDocumentName(), null, true);
                    if (u10 != null) {
                        tnVar.presentFragment(new qc1(u10));
                        return;
                    }
                    tnVar.t4 = -1;
                }
                if (messageObject5.canPreviewDocument()) {
                    PhotoViewer.t1().K2(null, tnVar, tnVar.aa);
                    PhotoViewer t12 = PhotoViewer.t1();
                    int i23 = messageObject5.type;
                    long j12 = i23 != 0 ? tnVar.P5 : 0L;
                    if (i23 != 0) {
                        j11 = 0;
                        j10 = tnVar.H6;
                    } else {
                        j10 = 0;
                        j11 = 0;
                    }
                    if (i23 != 0) {
                        j11 = tnVar.b();
                    }
                    t12.c2(messageObject5, tnVar, j12, j10, j11, tnVar.Ba);
                    messageObject = messageObject5;
                    z11 = true;
                } else {
                    messageObject = messageObject5;
                    z11 = false;
                }
                Pattern pattern = org.telegram.ui.Components.m90.a;
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
                    if (!z12) {
                        try {
                            AndroidUtilities.openForView(messageObject, tnVar.getParentActivity(), tnVar.aa, false);
                            return;
                        } catch (Exception e12) {
                            FileLog.e(e12);
                            tnVar.z6(messageObject);
                        }
                    }
                }
                if (tnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(tnVar.getParentActivity(), 3, tnVar.aa);
                    c2Var.setCanceledOnTouchOutside(false);
                    boolean[] zArr = {false};
                    c2Var.setOnCancelListener(new ug(0, zArr));
                    c2Var.q(150L);
                    new Thread(new gg(tnVar, messageObject, c2Var, zArr)).start();
                }
                z12 = true;
                if (!z12) {
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void w(org.telegram.ui.Cells.s1 s1Var) {
        long j10;
        int i10;
        MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
        MessageObject messageObject = (currentMessagesGroup == null || currentMessagesGroup.messages.isEmpty()) ? s1Var.getMessageObject() : currentMessagesGroup.messages.get(0);
        TLRPC.MessageReplies messageReplies = messageObject.messageOwner.replies;
        if (messageReplies != null) {
            int i11 = messageReplies.read_max_id;
            j10 = messageReplies.channel_id;
            i10 = i11;
        } else {
            j10 = 0;
            i10 = -1;
        }
        long j11 = j10;
        tn tnVar = this.a;
        tnVar.aa(tnVar.e.id, messageObject, messageObject.getId(), j11, i10, 0, null);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean w0(MessageObject messageObject) {
        return !this.a.s.containsKey(messageObject);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void w2() {
        tn tnVar = this.a;
        if (!tnVar.getUserConfig().isPremium()) {
            org.telegram.ui.Components.tc.a0(tnVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("UnlockSimilarChannelsPremium", tnVar.getMessagesController().recommendedChannelsLimitPremium), new pm(this, 4))).j();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", tnVar.P5);
        bundle.putInt("start_from", 10);
        tnVar.presentFragment(new org.telegram.ui.Components.y90(bundle, tnVar.W0.getSharedMediaPreloader()));
    }

    @Override // org.telegram.ui.Cells.j1
    public final void x2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
        MessageObject messageObject;
        TLRPC.TL_factCheck factCheck;
        String str;
        tn tnVar = this.a;
        nh.t3 t3Var = tnVar.w1;
        if (t3Var != null) {
            t3Var.e(true);
        }
        if (tnVar.getParentActivity() == null || (messageObject = s1Var.getMessageObject()) == null || (factCheck = messageObject.getFactCheck()) == null || factCheck.country == null) {
            return;
        }
        try {
            str = new Locale("", factCheck.country).getDisplayCountry(LocaleController.getInstance().getCurrentLocale());
        } catch (Exception e10) {
            FileLog.e(e10);
            str = factCheck.country;
        }
        nh.t3 t3Var2 = new nh.t3(tnVar.getParentActivity(), 3);
        t3Var2.q(true);
        t3Var2.G = Layout.Alignment.ALIGN_NORMAL;
        t3Var2.d = -1L;
        t3Var2.P = true;
        t3Var2.e = true;
        t3Var2.r(12.0f);
        tnVar.w1 = t3Var2;
        t3Var2.h0 = new vf(15, this, t3Var2);
        t3Var2.t(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FactCheckToast, str)));
        tnVar.T0.addView(tnVar.w1, i7.f6.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
        tnVar.T0.post(new j3.f0(this, s1Var, i11, i10, 4));
    }

    @Override // org.telegram.ui.Cells.j1
    public final String y(long j10) {
        TLRPC.Peer peer;
        String adminRank;
        tn tnVar = this.a;
        if (UserObject.isBotForum(tnVar.f)) {
            return null;
        }
        TLRPC.Chat chat = tnVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat) && (adminRank = tnVar.getMessagesController().getAdminRank(tnVar.e.id, j10)) != null) {
            return adminRank;
        }
        TLRPC.TL_forumTopic tL_forumTopic = tnVar.Y3;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || !(peer.user_id == j10 || peer.channel_id == j10 || peer.chat_id == j10)) {
            return null;
        }
        return LocaleController.getString(R.string.TopicCreator);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void y0(org.telegram.ui.Cells.s1 s1Var) {
        bh.f fVar = this.a.yc;
        if (fVar == null || fVar.n != s1Var) {
            return;
        }
        fVar.w.getClass();
    }

    @Override // org.telegram.ui.Cells.j1
    public final org.telegram.ui.Cells.l9 y2() {
        return this.a.Y8;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void z0() {
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        org.telegram.ui.Components.c6 animation;
        tn tnVar = this.a;
        if (tnVar.h3 || SharedConfig.noSoundHintShowed || tnVar.t0 == null || tnVar.getParentActivity() == null || tnVar.fragmentView == null) {
            return;
        }
        org.telegram.ui.Components.g40 g40Var = tnVar.p2;
        if (g40Var == null || g40Var.getTag() == null) {
            if (tnVar.p2 == null) {
                km kmVar = tnVar.T0;
                int indexOfChild = kmVar.indexOfChild(tnVar.O);
                if (indexOfChild == -1) {
                    return;
                }
                org.telegram.ui.Components.g40 g40Var2 = new org.telegram.ui.Components.g40(0, tnVar.getParentActivity(), tnVar.aa, false);
                tnVar.p2 = g40Var2;
                g40Var2.setShowingDuration(10000L);
                kmVar.addView(tnVar.p2, indexOfChild + 1, i7.f6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                tnVar.p2.setAlpha(0.0f);
                tnVar.p2.setVisibility(4);
            }
            int childCount = tnVar.t0.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = tnVar.t0.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) != null && messageObject.isVideo() && (animation = s1Var.getPhotoImage().getAnimation()) != null && animation.o() >= 3000 && tnVar.p2.e(s1Var, null, 0, 0, true)) {
                    SharedConfig.setNoSoundHintShowed(true);
                    return;
                }
            }
        }
    }
}
