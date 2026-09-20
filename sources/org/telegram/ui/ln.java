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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.SecretMediaViewer;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ln implements org.telegram.ui.Cells.l1 {
    public final /* synthetic */ zn a;

    public ln(zn znVar) {
        this.a = znVar;
    }

    public static void a(ln lnVar, org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
        int i10;
        zn znVar = lnVar.a;
        if (znVar.getParentActivity() == null || document == null) {
            return;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23 && ((i11 <= 28 || BuildVars.NO_SCOPED_STORAGE) && znVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
            znVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
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
        i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
        arrayList.add(new MessageObject(i10, tL_message, false, true));
        MediaController.saveFilesFromMessages(znVar.getParentActivity(), znVar.getAccountInstance(), arrayList, new va(lnVar, 1));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void A(org.telegram.ui.Cells.u1 u1Var) {
        zn znVar = this.a;
        if (!znVar.getMessagesController().showSensitiveContent()) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(znVar.getParentActivity(), 3, null);
            b2Var.q(200L);
            znVar.getMessagesController().getContentSettings(new y(this, b2Var, u1Var, 5));
        } else {
            if (u1Var.getMessageObject() != null) {
                u1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
            }
            u1Var.h4();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void A0() {
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        org.telegram.ui.Components.c6 animation;
        zn znVar = this.a;
        if (znVar.l3 || SharedConfig.noSoundHintShowed || znVar.x0 == null || znVar.getParentActivity() == null || znVar.fragmentView == null) {
            return;
        }
        org.telegram.ui.Components.i40 i40Var = znVar.t2;
        if (i40Var == null || i40Var.getTag() == null) {
            if (znVar.t2 == null) {
                rm rmVar = znVar.X0;
                int indexOfChild = rmVar.indexOfChild(znVar.S);
                if (indexOfChild == -1) {
                    return;
                }
                org.telegram.ui.Components.i40 i40Var2 = new org.telegram.ui.Components.i40(0, znVar.getParentActivity(), znVar.ea, false);
                znVar.t2 = i40Var2;
                i40Var2.setShowingDuration(10000L);
                rmVar.addView(znVar.t2, indexOfChild + 1, w7.y5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                znVar.t2.setAlpha(0.0f);
                znVar.t2.setVisibility(4);
            }
            int childCount = znVar.x0.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = znVar.x0.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject.isVideo() && (animation = u1Var.getPhotoImage().getAnimation()) != null && animation.o() >= 3000 && znVar.t2.e(u1Var, null, 0, 0, true)) {
                    SharedConfig.setNoSoundHintShowed(true);
                    return;
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void B0(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject, boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        zn znVar = this.a;
        if (znVar.getParentActivity() == null || tLObject == null) {
            return;
        }
        d5Var = ((org.telegram.ui.ActionBar.n2) znVar).parentLayout;
        if (d5Var != null) {
            d5Var2 = ((org.telegram.ui.ActionBar.n2) znVar).parentLayout;
            if (((ActionBarLayout) d5Var2).y()) {
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
            znVar.presentFragment(new zn(bundle));
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, znVar.getParentActivity(), znVar.getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(znVar.getParentActivity(), false, false);
        f1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
        f1Var.setMinimumWidth(160);
        f1Var.setOnClickListener(new a(this, 14));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
        org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(znVar.getParentActivity(), false, false);
        f1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
        f1Var2.setMinimumWidth(160);
        f1Var2.setOnClickListener(new z(this, (TLRPC.Chat) tLObject, u1Var, 7));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var2);
        zn znVar2 = new zn(bundle);
        znVar2.J9 = true;
        znVar.presentFragmentAsPreviewWithMenu(znVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
        znVar.d7();
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean B1() {
        zn znVar = this.a;
        return znVar.X0.getMeasuredWidth() > znVar.X0.getMeasuredHeight();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void C0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        MessageObject messageObject = u1Var.getMessageObject();
        int i10 = messageObject.type;
        zn znVar = this.a;
        if (i10 != 16) {
            znVar.I7(u1Var, true, false, f7, f10, messageObject.isMusic(), false, false);
            return;
        }
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        int i11 = 0;
        if (!(messageAction instanceof TLRPC.TL_messageActionConferenceCall)) {
            TLRPC.User user = znVar.f;
            if (user != null) {
                boolean isVideoCall = messageObject.isVideoCall();
                TLRPC.UserFull userFull = znVar.a8;
                org.telegram.ui.Components.voip.f2.m(user, isVideoCall, userFull != null && userFull.video_calls_available, znVar.getParentActivity(), znVar.getMessagesController().getUserFull(znVar.f.id), znVar.getAccountInstance());
                return;
            }
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(Long.valueOf(znVar.a()));
        ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
        int size = arrayList.size();
        while (i11 < size) {
            TLRPC.Peer peer = arrayList.get(i11);
            i11++;
            hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(peer)));
        }
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = messageObject.getId();
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(znVar.getParentActivity(), 3, null);
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = znVar.getMessagesController().conferenceCallSizeLimit;
        b2Var.setOnCancelListener(new ca(this, znVar.getConnectionsManager().sendRequest(getgroupcall, new ci.kd(this, b2Var, hashSet, tL_inputGroupCallInviteMessage, messageObject, 4)), 1));
        b2Var.q(600L);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void D1(org.telegram.ui.Cells.u1 u1Var) {
        zn.U4(this.a, u1Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void E(org.telegram.ui.Cells.u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        TLRPC.Message message;
        int i10;
        int i11;
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        int i12 = buttonCustom.id;
        zn znVar = this.a;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    znVar.I7(u1Var, true, false, u1Var.getLastTouchX(), u1Var.getLastTouchY(), true, false, true);
                    return;
                } else {
                    if (i12 == 4) {
                        znVar.R1.m(messageObject.getTopicId(), true);
                        return;
                    }
                    return;
                }
            }
            if (message.suggested_post != null) {
                i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, znVar.e);
                if (canManageMonoForum) {
                    i11 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                    ChatObject.canUserDoChannelDirectAdminAction(i11, znVar.e, 5);
                }
                ai.s4 s4Var = new ai.s4(this, message, canManageMonoForum, messageObject, 12);
                TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                znVar.g7(s4Var, zf.a.l(suggestedPost != null ? suggestedPost.price : null), !canManageMonoForum);
                return;
            }
            return;
        }
        long peerDialogId = DialogObject.getPeerDialogId(message.from_id);
        of ofVar = new of(8, this, message);
        Pattern pattern = org.telegram.ui.Components.d5.a;
        Activity parentActivity = znVar.getParentActivity();
        int i13 = 0;
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(parentActivity, 0, null);
        String string = LocaleController.getString(R.string.SuggestedMessageDecline);
        org.telegram.ui.ActionBar.b2 b2Var = e2Var.a;
        b2Var.R = string;
        b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageDeclineInfo, MessagesController.getInstance(UserConfig.selectedAccount).getPeerName(peerDialogId)));
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        frameLayout.setClipChildren(false);
        EditText editText = new EditText(parentActivity);
        editText.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        editText.setHint(LocaleController.getString(R.string.SuggestedMessageDeclineReasonHint));
        editText.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H6, false));
        editText.setTextSize(1, 16.0f);
        editText.setBackground(org.telegram.ui.ActionBar.j6.S(parentActivity));
        editText.setMaxLines(4);
        editText.setRawInputType(147457);
        editText.setImeOptions(6);
        editText.setFilters(new InputFilter[]{new org.telegram.ui.Components.s4(parentActivity)});
        editText.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0, AndroidUtilities.dp(8.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f));
        editText.setSelection(editText.getText().toString().length());
        e2Var.n(frameLayout);
        e2Var.k(LocaleController.getString(R.string.Decline), new l4(22, ofVar, editText));
        e2Var.h(LocaleController.getString(R.string.Cancel), null);
        b2Var.N = new org.telegram.ui.Components.p1(editText, i13);
        frameLayout.addView(editText, w7.y5.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
        editText.requestFocus();
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.og(editText, 3), 100L);
        znVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void E0(org.telegram.ui.Cells.u1 u1Var) {
        l(u1Var, true, false, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void E1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        l(u1Var, z10, false, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void F(org.telegram.ui.Cells.u1 u1Var) {
        zn znVar = this.a;
        znVar.xa.l(u1Var, znVar, true);
        znVar.x0.J0(false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void G0(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject;
        if (u1Var == null || (messageObject = u1Var.getMessageObject()) == null || messageObject.messageOwner == null) {
            return;
        }
        int id2 = messageObject.getId();
        zn znVar = this.a;
        if (znVar.vb == id2 && znVar.wb == 7) {
            return;
        }
        TLRPC.InputPeer inputPeer = znVar.getMessagesController().getInputPeer(messageObject.getDialogId());
        if (inputPeer == null) {
            return;
        }
        TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
        getrichmessage.peer = inputPeer;
        getrichmessage.id = id2;
        nf.e eVar = znVar.zb;
        if (eVar != null) {
            eVar.a(true);
            znVar.zb = null;
        }
        int[] iArr = new int[1];
        zi ziVar = new zi(znVar, id2, u1Var, 2);
        ziVar.b = new gh(0, znVar, iArr);
        znVar.zb = ziVar;
        ziVar.d();
        iArr[0] = znVar.getConnectionsManager().sendRequestTyped(getrichmessage, new org.telegram.messenger.a(), new kg(znVar, ziVar, iArr, u1Var, messageObject));
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
        x4 x4Var;
        qk qkVar;
        pk pkVar;
        if (!m()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(ChatObject.getPublicUsername(chat));
        zn znVar = this.a;
        int i14 = (isEmpty || znVar.e == null || ((qkVar = znVar.O0) != null && qkVar.getVisibility() == 0) || ((pkVar = znVar.R) != null && pkVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat2 = znVar.e;
        int i15 = (chat2 == null || !(znVar.d4 == 0 || znVar.h4) || (ChatObject.isChannel(chat2) && !znVar.e.megagroup)) ? 0 : 1;
        TLRPC.Chat chat3 = znVar.e;
        int i16 = (chat3 == null || chat3.id != chat.id || znVar.F9()) ? 1 : 0;
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
        TLRPC.ChatFull chatFull = znVar.getMessagesController().getChatFull(chat.id);
        if (chatFull != null) {
            x4Var = x4.a(chat, chatFull, d5VarArr);
            z11 = i14;
            i13 = i15;
            i12 = i16;
            z10 = true;
        } else {
            i11 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
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
        if (com.google.firebase.messaging.m.e(x4Var)) {
            com.google.firebase.messaging.m.k().v((ViewGroup) znVar.fragmentView, znVar.ea, x4Var, new b7(this, chat, u1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.v70 H = org.telegram.ui.Components.v70.H(znVar, u1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new zm(this, chat, 0), false);
        boolean z12 = chat.broadcast;
        H.l(z12 ? R.drawable.msg_channel : R.drawable.msg_discussion, LocaleController.getString(z12 ? R.string.OpenChannel2 : R.string.OpenGroup2), new q1(this, u1Var, chat, 26), i12);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new zm(this, chat, 1), z11);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new zm(this, chat, 2), i13);
        H.t = false;
        H.i = 3;
        H.W = true;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void H1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        zn znVar = this.a;
        if (znVar.z9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
        if (znVar.getParentActivity() != null) {
            if (znVar.O0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                if (tL_inlineButtonTypeCopy == null) {
                    if (tL_inlineButtonTypeUrl != null) {
                        znVar.Z9(null, tL_inlineButtonTypeUrl.url, true, u1Var, u1Var.getMessageObject());
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
                org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) znVar.getParentActivity(), (org.telegram.ui.ActionBar.f6) znVar.ea, false);
                f3Var.fixNavigationBar();
                f3Var.title = str;
                f3Var.bigTitle = false;
                f3Var.multipleLinesTitle = true;
                CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Copy)};
                lg.j jVar = new lg.j(3, znVar, str);
                f3Var.items = charSequenceArr;
                f3Var.onClickListener = jVar;
                znVar.showDialog(f3Var);
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        StaticLayout staticLayout = textLayoutBlock.textLayout;
        if (staticLayout == null || staticLayout.getText() == null) {
            return;
        }
        String charSequence = textLayoutBlock.textLayout.getText().toString();
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new CodeHighlighting.Span(false, 0, null, textLayoutBlock.language, charSequence), 0, spannableString.length(), 33);
        AndroidUtilities.addToClipboard(spannableString);
        org.telegram.messenger.rk.o(R.string.CodeCopied, org.telegram.ui.Components.xc.a0(this.a));
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean I1() {
        zn znVar = this.a;
        return znVar.X0.getKeyboardHeight() + znVar.oa >= AndroidUtilities.dp(20.0f);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void J0(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        messageObject.messageOwner.summarizedOpen = !r1.summarizedOpen;
        messageObject.updateTranslation(true);
        zn znVar = this.a;
        znVar.getMessagesStorage().updateMessageCustomParams(messageObject.getDialogId(), messageObject.messageOwner);
        znVar.getMessagesController().getTranslateController().checkTranslation(messageObject, true);
        l(u1Var, true, false, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void K1(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        zn znVar = this.a;
        znVar.d5 = messageObject;
        znVar.d9();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void L(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject.messageOwner.send_state != 0) {
            this.a.getSendMessagesHelper().cancelSendingMessage(messageObject);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void M(int i10, org.telegram.ui.Cells.u1 u1Var) {
        boolean z10 = u1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveaway;
        zn znVar = this.a;
        if (z10) {
            long j3 = -((TLRPC.TL_messageMediaGiveaway) u1Var.getMessageObject().messageOwner.media).channels.get(i10).longValue();
            if (znVar.T5 != j3) {
                znVar.presentFragment(zn.R9(j3));
            } else {
                znVar.a1.e(false, false);
            }
        }
        if (u1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            znVar.presentFragment(ProfileActivity.m4(((TLRPC.TL_messageMediaGiveawayResults) u1Var.getMessageObject().messageOwner.media).winners.get(i10).longValue()));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void M1(MessageObject messageObject) {
        this.a.s.put(messageObject, Boolean.TRUE);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void N(MessageObject messageObject) {
        if (messageObject.isVideo()) {
            this.a.fb(messageObject, true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean N0(long j3) {
        zn znVar = this.a;
        TLRPC.Chat chat = znVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return false;
        }
        return znVar.getMessagesController().isOwner(znVar.e.id, j3);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void N1(org.telegram.ui.Cells.u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        Uri parse;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        boolean z11 = (z10 || !nf.f.h(str, false, false)) ? z10 : true;
        zn znVar = this.a;
        nf.e eVar = znVar.zb;
        if (eVar != null) {
            eVar.a(true);
        }
        znVar.zb = u1Var.getMessageObject() == null ? null : new hn(this, u1Var);
        if (z11 || nf.f.f(parse, false, null)) {
            nf.f.r(znVar.getParentActivity(), parse, true, true, false, znVar.zb, null, false, true, false);
        } else {
            org.telegram.ui.Components.d5.r0(znVar, str, true, true, true, !z11, znVar.zb, webPage, znVar.ea);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean O(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        int i10;
        int i11;
        boolean isForwarded = u1Var.getMessageObject().isForwarded();
        zn znVar = this.a;
        if (isForwarded) {
            long peerDialogId = DialogObject.getPeerDialogId(u1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(znVar);
            int i12 = R.raw.passcode_lock_close;
            int i13 = R.string.TodoCompleteForbiddenForward;
            i11 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
            a02.Q(i12, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i13, DialogObject.getName(i11, peerDialogId)))).k(true);
            return false;
        }
        if (u1Var.getMessageObject().canCompleteTodo()) {
            if (znVar.getUserConfig().isPremium()) {
                znVar.getSendMessagesHelper().toggleTodo(ChatObject.getSendAsPeerId(znVar.e, znVar.Z7, true), u1Var.getMessageObject(), todoItem, z10, null);
                return true;
            }
            org.telegram.ui.Components.xc.a0(znVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.TodoPremiumRequired), new wm(this, 9))).k(true);
            return false;
        }
        long peerDialogId2 = DialogObject.getPeerDialogId(u1Var.getMessageObject().getFromPeer());
        org.telegram.ui.Components.xc a03 = org.telegram.ui.Components.xc.a0(znVar);
        int i14 = R.raw.passcode_lock_close;
        int i15 = R.string.TodoCompleteForbidden;
        i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
        a03.Q(i14, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i15, DialogObject.getName(i10, peerDialogId2)))).k(true);
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void O0(org.telegram.ui.Cells.u1 u1Var) {
        int i10;
        a3.h0 h0Var;
        MessageObject.GroupedMessages groupedMessages;
        int i11;
        zn znVar = this.a;
        uh.i iVar = znVar.X9;
        if (iVar == null) {
            return;
        }
        HashMap hashMap = iVar.a;
        uh.h hVar = (uh.h) hashMap.get(uh.i.b(u1Var));
        org.telegram.ui.Components.pc pcVar = null;
        MessageObject messageObject = hVar != null ? hVar.E : null;
        uh.h hVar2 = (uh.h) znVar.X9.a.get(uh.i.b(u1Var));
        long j3 = (hVar2 == null || (i11 = hVar2.R) == -1) ? 0L : hVar2.w[i11].d;
        if (messageObject != null && j3 != 0) {
            Activity parentActivity = znVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
            if (!org.telegram.ui.Components.d5.h(parentActivity, i10, j3, false)) {
                ArrayList<MessageObject> arrayList = (messageObject.getGroupId() == 0 || (groupedMessages = (MessageObject.GroupedMessages) znVar.x6.f(messageObject.getGroupId())) == null) ? null : groupedMessages.messages;
                if (arrayList == null) {
                    arrayList = org.telegram.messenger.l0.j(messageObject);
                }
                boolean z10 = j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                long j10 = j3;
                a3.h0 h0Var2 = new a3.h0(this, arrayList, j10, 15);
                if (z10) {
                    h0Var2.run();
                    h0Var = null;
                } else {
                    h0Var = h0Var2;
                }
                pcVar = org.telegram.ui.Components.xc.v(znVar.getParentActivity(), znVar, null, 1, j10, 1, znVar.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), znVar.getThemedColor(org.telegram.ui.ActionBar.j6.Hi), 5000, false, h0Var);
                pcVar.k = true;
                pcVar.k(pcVar.e instanceof org.telegram.ui.Components.ac);
            }
        }
        uh.h hVar3 = (uh.h) hashMap.get(uh.i.b(u1Var));
        if (hVar3 != null) {
            if (pcVar == null) {
                hVar3.R = -1;
                hVar3.c();
                return;
            }
            org.telegram.ui.Components.tb tbVar = pcVar.e;
            if (!(tbVar instanceof org.telegram.ui.Components.xb)) {
                hVar3.c();
                return;
            }
            org.telegram.ui.Components.xb xbVar = (org.telegram.ui.Components.xb) tbVar;
            hVar3.W = xbVar;
            xbVar.a.setVisibility(4);
            ViewTreeObserver viewTreeObserver = hVar3.W.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new fm(2, hVar3, viewTreeObserver));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final CharacterStyle O1(org.telegram.ui.Cells.u1 u1Var) {
        zn znVar;
        int i10;
        if (u1Var.getMessageObject() == null || (i10 = (znVar = this.a).vb) == 0 || i10 != u1Var.getMessageObject().getId() || znVar.wb != 1) {
            return null;
        }
        return znVar.xb;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean P() {
        zn znVar = this.a;
        return znVar.W5[1].size() + znVar.W5[0].size() > 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        try {
            zn znVar = this.a;
            org.telegram.ui.Components.vu.J(znVar, messageObject, znVar.Fa, str2, str3, str4, str, i10, i11, -1, znVar.x9());
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean Q(org.telegram.ui.Cells.u1 u1Var) {
        int i10;
        MessageObject messageObject;
        TLRPC.Message message;
        if (u1Var == null) {
            return false;
        }
        zn znVar = this.a;
        if (znVar.getParentActivity() == null) {
            return false;
        }
        i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
        if (!MessagesController.getInstance(i10).richEditorAllowed() || (messageObject = u1Var.getMessageObject()) == null || (message = messageObject.messageOwner) == null || message.rich_message == null) {
            return false;
        }
        if (!messageObject.translated || message.translatedRichMessage == null) {
            return messageObject.canEditMessage(znVar.e);
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void Q0(int i10, org.telegram.ui.Cells.u1 u1Var) {
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
        zn znVar = this.a;
        if (i10 == 19) {
            nf.e eVar = znVar.zb;
            if (eVar != null) {
                eVar.a(true);
            }
            final en enVar = u1Var.getMessageObject() != null ? new en(this, u1Var, 2) : null;
            znVar.zb = enVar;
            final Activity parentActivity = znVar.getParentActivity();
            final org.telegram.ui.ActionBar.f6 resourceProvider = znVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            enVar.d();
            enVar.b = new tg.d(atomicBoolean, 0);
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
            tg.s.d(messageObject, new Utilities.Callback(atomicBoolean, enVar, z10, b11, j3, tL_messageMediaGiveaway2, parentActivity, resourceProvider) { // from class: tg.e
                public final /* synthetic */ AtomicBoolean a;
                public final /* synthetic */ nf.e b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ String d;
                public final /* synthetic */ TLRPC.TL_messageMediaGiveaway e;
                public final /* synthetic */ Context f;
                public final /* synthetic */ f6 g;

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
                    f6 f6Var = this.g;
                    if (z11) {
                        i.d(z12, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, f6Var);
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        i.e(z12, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, f6Var);
                    }
                }
            }, new tg.f(atomicBoolean, enVar, 0));
            return;
        }
        if (i10 == 21) {
            g();
            return;
        }
        if (i10 == 84) {
            znVar.ua(u1Var);
            return;
        }
        if (i10 == 80) {
            org.telegram.ui.Cells.u8 u8Var = org.telegram.ui.Components.zg0.O;
            if (znVar.getParentActivity() == null) {
                return;
            }
            znVar.showDialog(new org.telegram.ui.Components.zg0(znVar.getContext(), znVar.getCurrentAccount(), messageObject, znVar.getResourceProvider()));
            return;
        }
        if (i10 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
            if (messageMedia4 == null || (webPage = messageMedia4.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                znVar.createArticleViewer(false).N(messageObject, null, null, null);
                return;
            }
            return;
        }
        int i15 = 5;
        if (i10 == 5) {
            long j10 = messageObject.messageOwner.media.user_id;
            if (j10 != 0) {
                i14 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
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
                znVar.presentFragment(new ProfileActivity(bundle, null));
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
                znVar.showDialog(new org.telegram.ui.Components.xe0(znVar, null, user, null, file, gf.b.d(str, false), str3, str4, znVar.ea));
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (i10 == 30) {
            znVar.presentFragment(new zn(v7.j0.e(messageObject.messageOwner.media.user_id, "user_id")));
            return;
        }
        if (i10 == 31) {
            long j11 = messageObject.messageOwner.media.user_id;
            if (j11 != 0) {
                i13 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(j11));
            }
            if (user2 != null) {
                if (!TextUtils.isEmpty(messageObject.vCardData)) {
                    b10 = messageObject.vCardData.toString();
                } else if (TextUtils.isEmpty(user2.phone)) {
                    String str5 = MessageObject.getMedia(messageObject.messageOwner).phone_number;
                    b10 = !TextUtils.isEmpty(str5) ? gf.b.c().b(str5) : LocaleController.getString(R.string.NumberUnknown);
                } else {
                    b10 = org.telegram.messenger.rk.h(new StringBuilder("+"), user2.phone, gf.b.c());
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user2.id);
                bundle2.putString("phone", b10);
                bundle2.putBoolean("addContact", true);
                znVar.presentFragment(new ss(bundle2));
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
            nf.e eVar2 = znVar.zb;
            if (eVar2 != null) {
                eVar2.a(true);
            }
            znVar.zb = u1Var.getMessageObject() != null ? new en(this, u1Var, 3) : null;
            if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                String group = matcher.group(1);
                i11 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                if (MediaDataController.getInstance(i11).getStickerSetByName(group) == null) {
                    znVar.zb.d();
                    TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_inputStickerSetShortName.short_name = group;
                    tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                    i12 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                    znVar.zb.b = new ai.n8(this, ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickerSet, new ci.u3(i16, this, z11)), 26);
                    return;
                }
            }
            nf.f.r(znVar.getParentActivity(), Uri.parse(webPage2.url), true, true, false, znVar.zb, null, false, true, false);
            return;
        }
        if (messageObject.isSponsored()) {
            znVar.J9(messageObject, false, false);
            if (messageObject.sponsoredUrl != null) {
                nf.e eVar3 = znVar.zb;
                if (eVar3 != null) {
                    eVar3.a(true);
                }
                znVar.zb = u1Var.getMessageObject() != null ? new en(this, u1Var, i16) : null;
                nf.f.r(znVar.getParentActivity(), Uri.parse(messageObject.sponsoredUrl), true, false, false, znVar.zb, null, false, znVar.getMessagesController().sponsoredLinksInappAllow, false);
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
                    znVar.getOrCreateStoryViewer().F(znVar.getParentActivity(), tL_webPageAttributeStory.storyItem, ai.u9.a(znVar.x0));
                    return;
                }
            }
        }
        if (znVar.ea(storyMentionWebpage.url, u1Var, null, messageObject.getId(), 2)) {
            return;
        }
        nf.e eVar4 = znVar.zb;
        if (eVar4 != null) {
            eVar4.a(true);
        }
        znVar.zb = u1Var.getMessageObject() != null ? new en(this, u1Var, i15) : null;
        nf.f.r(znVar.getParentActivity(), Uri.parse(storyMentionWebpage.url), true, true, false, znVar.zb, null, false, true, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean Q1(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        ViewGroup viewGroup;
        int i10;
        j51 j51Var;
        if (messageObject.isVoiceOnce() || messageObject.isRoundOnce()) {
            int i11 = 1;
            l51 l51Var = this.a.Z9;
            if (l51Var == null || l51Var.b0) {
                try {
                    AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!messageObject.isOutOwner()) {
                            org.telegram.ui.Components.xc.a0(this.a).w(R.drawable.tooltip_sound, LocaleController.getString(R.string.VoiceOnceTurnOnSound)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.a.Z9 = new l51(this.a.getParentActivity());
                l51 l51Var2 = this.a.Z9;
                ue fb2 = !messageObject.isOutOwner() ? this.a.fb(messageObject, true) : null;
                a3.h0 O4 = !messageObject.isOutOwner() ? zn.O4(this.a, messageObject) : null;
                Context context = l51Var2.a;
                ci.n6 n6Var = l51Var2.c;
                l51Var2.X = fb2;
                l51Var2.Y = O4;
                j51 j51Var2 = l51Var2.N;
                if (j51Var2 != null) {
                    n6Var.removeView(j51Var2);
                    l51Var2.N = null;
                }
                l51Var2.O = u1Var;
                MessageObject messageObject2 = u1Var.getMessageObject();
                l51Var2.M = messageObject2;
                l51Var2.S = messageObject2 != null && messageObject2.isRoundVideo();
                org.telegram.ui.Cells.u1 u1Var2 = l51Var2.O;
                l51Var2.L = u1Var2 != null ? u1Var2.getResourcesProvider() : null;
                if (l51Var2.O != null) {
                    l51Var2.T = 0.0f;
                    l51Var2.U = u1Var.n;
                    if (u1Var.getParent() instanceof View) {
                        View view = (View) u1Var.getParent();
                        l51Var2.T = view.getY() + l51Var2.T;
                        l51Var2.U = view.getY() + l51Var2.U;
                    }
                    int width = l51Var2.O.getWidth();
                    int height = l51Var2.O.getHeight();
                    if (l51Var2.S) {
                        height = Math.min(AndroidUtilities.dp(360.0f), Math.min(width, AndroidUtilities.displaySize.y));
                    }
                    int i12 = height;
                    l51Var2.K = i12 - l51Var2.O.getHeight();
                    i10 = (int) Math.ceil((Math.min(width, i12) * 0.92f) / AndroidUtilities.density);
                    viewGroup = n6Var;
                    j51 j51Var3 = new j51(l51Var2, l51Var2.getContext(), UserConfig.selectedAccount, l51Var2.O.getResourcesProvider(), width, i12);
                    l51Var2.N = j51Var3;
                    l51Var2.O.j1(j51Var3);
                    l51Var2.N.i1(l51Var2.O);
                    l51Var2.N.setDelegate(new t7.u());
                    j51 j51Var4 = l51Var2.N;
                    MessageObject messageObject3 = l51Var2.M;
                    MessageObject.GroupedMessages currentMessagesGroup = l51Var2.O.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.u1 u1Var3 = l51Var2.O;
                    j51Var4.X3(messageObject3, currentMessagesGroup, u1Var3.F, u1Var3.E, false, false);
                    if (!l51Var2.S) {
                        org.telegram.ui.Components.j8 j8Var = new org.telegram.ui.Components.j8();
                        l51Var2.V = j8Var;
                        j51 j51Var5 = l51Var2.N;
                        j8Var.i = j51Var5;
                        j51Var5.ee = j8Var;
                        if (j51Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.vo0 seekBarWaveform = l51Var2.N.getSeekBarWaveform();
                            seekBarWaveform.L = l51Var2.s;
                            org.telegram.ui.Cells.u1 u1Var4 = seekBarWaveform.n;
                            if (u1Var4 != null) {
                                u1Var4.invalidate();
                            }
                        }
                    }
                    l51Var2.H = false;
                    viewGroup.addView(l51Var2.N, new FrameLayout.LayoutParams(l51Var2.O.getWidth(), i12, 17));
                } else {
                    viewGroup = n6Var;
                    i10 = 360;
                }
                TextureView textureView = l51Var2.P;
                if (textureView != null) {
                    viewGroup.removeView(textureView);
                    l51Var2.P = null;
                }
                if (l51Var2.S) {
                    l51Var2.Q = false;
                    TextureView textureView2 = new TextureView(context);
                    l51Var2.P = textureView2;
                    viewGroup.addView(textureView2, 0, w7.y5.c(i10, i10));
                }
                MediaController.getInstance().pauseByRewind();
                org.telegram.ui.Components.t71 t71Var = l51Var2.w;
                if (t71Var != null) {
                    t71Var.B();
                    l51Var2.w.H();
                    l51Var2.w = null;
                }
                org.telegram.ui.Cells.u1 u1Var5 = l51Var2.O;
                if (u1Var5 != null && u1Var5.getMessageObject() != null) {
                    File pathToAttach = FileLoader.getInstance(l51Var2.O.getMessageObject().currentAccount).getPathToAttach(l51Var2.O.getMessageObject().getDocument());
                    if (pathToAttach != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && (pathToAttach = FileLoader.getInstance(l51Var2.O.getMessageObject().currentAccount).getPathToMessage(l51Var2.O.getMessageObject().messageOwner)) != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && l51Var2.O.getMessageObject().messageOwner.attachPath != null) {
                        pathToAttach = new File(l51Var2.O.getMessageObject().messageOwner.attachPath);
                    }
                    if (pathToAttach != null && pathToAttach.exists()) {
                        org.telegram.ui.Components.t71 t71Var2 = new org.telegram.ui.Components.t71();
                        l51Var2.w = t71Var2;
                        t71Var2.J = new k51(l51Var2);
                        if (l51Var2.V != null) {
                            t71Var2.K = new k51(l51Var2);
                        }
                        if (l51Var2.S) {
                            t71Var2.V(l51Var2.P);
                        }
                        l51Var2.w.D(Uri.fromFile(pathToAttach), "other");
                        l51Var2.w.C();
                        org.telegram.ui.Components.jt jtVar = l51Var2.E;
                        if (jtVar != null) {
                            jtVar.s = l51Var2.w;
                            jtVar.a();
                        }
                    }
                    zn znVar = this.a;
                    znVar.showDialog(znVar.Z9);
                    return false;
                }
                ci.f4 f4Var = l51Var2.x;
                if (f4Var != null) {
                    viewGroup.removeView(f4Var);
                    l51Var2.x = null;
                }
                MessageObject messageObject4 = l51Var2.M;
                boolean z10 = messageObject4 != null && messageObject4.isOutOwner();
                MessageObject messageObject5 = l51Var2.M;
                if (messageObject5 != null && messageObject5.getDialogId() != UserConfig.getInstance(l51Var2.M.currentAccount).getClientUserId()) {
                    ci.f4 f4Var2 = new ci.f4(context, 3);
                    l51Var2.x = f4Var2;
                    f4Var2.p(true);
                    if (z10) {
                        long dialogId = l51Var2.M.getDialogId();
                        String str = "";
                        if (dialogId > 0) {
                            TLRPC.User user = MessagesController.getInstance(l51Var2.M.currentAccount).getUser(Long.valueOf(dialogId));
                            if (user != null) {
                                str = UserObject.getFirstName(user);
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(l51Var2.M.currentAccount).getChat(Long.valueOf(-dialogId));
                            if (chat != null) {
                                str = chat.title;
                            }
                        }
                        l51Var2.x.s(AndroidUtilities.replaceTags(LocaleController.formatString(l51Var2.S ? R.string.VideoOnceOutHint : R.string.VoiceOnceOutHint, str)));
                    } else {
                        l51Var2.x.s(AndroidUtilities.replaceTags(LocaleController.getString(l51Var2.S ? R.string.VideoOnceHint : R.string.VoiceOnceHint)));
                    }
                    l51Var2.x.q(12.0f);
                    l51Var2.x.setPadding(AndroidUtilities.dp((z10 || l51Var2.O.F) ? 0.0f : 6.0f), 0, 0, 0);
                    if (l51Var2.S) {
                        l51Var2.x.m(0.5f, 0.0f);
                        l51Var2.x.K = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        l51Var2.x.m(0.0f, AndroidUtilities.dp(34.0f));
                        l51Var2.x.K = Layout.Alignment.ALIGN_NORMAL;
                    }
                    l51Var2.x.t(14.0f);
                    ci.f4 f4Var3 = l51Var2.x;
                    f4Var3.h = ci.f4.a(f4Var3.getText(), l51Var2.x.getTextPaint());
                    if (l51Var2.S) {
                        viewGroup.addView(l51Var2.x, w7.y5.d((int) ((l51Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((l51Var2.O.getHeight() + l51Var2.K) / AndroidUtilities.density) / 2.0f), 0.0f, 0.0f));
                    } else {
                        viewGroup.addView(l51Var2.x, w7.y5.d((int) ((l51Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, ((((l51Var2.O.getWidth() * (-0.39999998f)) / 2.0f) + l51Var2.O.getBoundsLeft()) / AndroidUtilities.density) + 1.0f, ((-75.0f) - ((l51Var2.O.getHeight() / AndroidUtilities.density) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    l51Var2.x.u();
                }
                TextView textView = l51Var2.y;
                if (textView != null) {
                    viewGroup.removeView(textView);
                    l51Var2.y = null;
                }
                TextView textView2 = new TextView(context);
                l51Var2.y = textView2;
                textView2.setTextColor(-1);
                l51Var2.y.setTypeface(AndroidUtilities.bold());
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    l51Var2.y.setBackground(org.telegram.ui.ActionBar.j6.i0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    l51Var2.y.setBackground(org.telegram.ui.ActionBar.j6.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                l51Var2.y.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
                w7.b6.a(l51Var2.y);
                l51Var2.y.setText(LocaleController.getString(z10 ? R.string.VoiceOnceClose : R.string.VoiceOnceDeleteClose));
                l51Var2.y.setOnClickListener(new h51(l51Var2, i11));
                viewGroup.addView(l51Var2.y, w7.y5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z10 && (j51Var = l51Var2.N) != null && j51Var.getMessageObject() != null && l51Var2.N.getMessageObject().messageOwner != null) {
                    l51Var2.N.getMessageObject().messageOwner.media_unread = false;
                    l51Var2.N.invalidate();
                }
                zn znVar2 = this.a;
                znVar2.showDialog(znVar2.Z9);
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
                ArrayList L = this.a.A0.L();
                zn znVar3 = this.a;
                return mediaController.setPlaylist(L, messageObject, znVar3.L6, true ^ znVar3.A0.N, null);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean R() {
        zn znVar = this.a;
        return UserObject.isReplyUser(znVar.f) || UserObject.isUserSelf(znVar.f);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void R1() {
        org.telegram.ui.ActionBar.f6 f6Var;
        zn znVar = this.a;
        if (znVar.X0 == null || znVar.getParentActivity() == null) {
            return;
        }
        Context context = znVar.X0.getContext();
        f6Var = ((org.telegram.ui.ActionBar.n2) znVar).resourceProvider;
        i41.T(context, znVar, false, f6Var, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void S(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        MessageObject messageObject;
        if (chat == null) {
            return;
        }
        zn znVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
        if (kVar.s() || znVar.A9()) {
            zn.b2(znVar, u1Var, true, f7, f10);
            return;
        }
        if (z10 || !chat.signature_profiles || (messageObject = u1Var.getMessageObject()) == null || messageObject.getDialogId() == UserObject.REPLY_BOT) {
            q(u1Var, chat, i10, z10);
        } else {
            znVar.na(DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void S0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        zn znVar = this.a;
        znVar.getSendMessagesHelper().sendCallback(true, u1Var.getMessageObject(), keyboardInlineButton, znVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void T(org.telegram.ui.Cells.u1 u1Var) {
        l(u1Var, true, true, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void T1(org.telegram.ui.Cells.u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        zi ziVar;
        int i10;
        MessageObject messageObject = u1Var.getMessageObject();
        qg.v vVar = null;
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
                        TLRPC.TL_message C7 = zn.C7(message);
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
                zn znVar = this.a;
                t12.J2(null, znVar, znVar.ea);
                PhotoViewer.t1().a2(arrayList, i11, this.a.a(), 0L, 0L, this.a.Ga);
                return;
            }
            return;
        }
        zn znVar2 = this.a;
        nf.e eVar = znVar2.zb;
        if (eVar != null) {
            eVar.a(true);
            znVar2.zb = null;
        }
        if (u1Var.getMessageObject() == null) {
            znVar2.zb = null;
            ziVar = null;
        } else {
            ziVar = new zi(znVar2, u1Var.getMessageObject().getId(), u1Var, 1);
            znVar2.zb = ziVar;
        }
        i10 = ((org.telegram.ui.ActionBar.n2) this.a).currentAccount;
        yh.u5 y3 = yh.u5.y(i10, false);
        Objects.requireNonNull(ziVar);
        cj cjVar = new cj(ziVar, 7);
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        org.telegram.ui.ActionBar.f6 I = yh.u5.I();
        if (messageObject != null && context != null) {
            long dialogId = messageObject.getDialogId();
            int id2 = messageObject.getId();
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = MessagesController.getInstance(y3.a).getInputPeer(dialogId);
            tL_inputInvoiceMessage.msg_id = id2;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject p5 = ei.k3.p(I, false);
            if (p5 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p5.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
            vVar = new qg.v(y3, ConnectionsManager.getInstance(y3.a).sendRequest(tL_payments_getPaymentForm, new ai.p3(y3, messageObject, tL_inputInvoiceMessage, cjVar, 19)), 5);
        }
        if (vVar != null) {
            ziVar.b = vVar;
            ziVar.d();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void U1(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10;
        int i11;
        ImageLocation forDocument;
        String str2;
        boolean isEmpty = TextUtils.isEmpty(str);
        zn znVar = this.a;
        if (!isEmpty) {
            nf.f.s(znVar.getParentActivity(), "https://" + znVar.getMessagesController().linkPrefix + "/nft/" + str);
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
        rg.k1 k1Var = new rg.k1(znVar, i10, user, null, null, znVar.ea);
        u1Var.getLocationOnScreen(new int[2]);
        k1Var.v0 = u1Var.getNameStatusX();
        k1Var.w0 = u1Var.getNameStatusY();
        k1Var.z0 = u1Var.getScaleX();
        k1Var.x0 = u1Var.getLeft();
        k1Var.y0 = u1Var.getTop();
        k1Var.A0 = u1Var;
        int colorId = UserObject.getColorId(user);
        if (colorId < 7) {
            k1Var.u0 = Integer.valueOf(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.r8[colorId]));
        } else {
            i11 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
            MessagesController.PeerColors peerColors = MessagesController.getInstance(i11).peerColors;
            MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(colorId) : null;
            k1Var.u0 = color != null ? Integer.valueOf(color.getColor1()) : null;
        }
        org.telegram.ui.Components.n5 n5Var = u1Var.fc;
        if (n5Var != null && (n5Var.f[0] instanceof org.telegram.ui.Components.p5)) {
            k1Var.z0 *= 0.95f;
            if (document != null) {
                org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(znVar.getParentActivity());
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.m6, 0.2f);
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
                v9Var.setLayerNum(7);
                v9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                v9Var.l(imageLocation, str3, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "140_140", svgThumb, document);
                if (MessageObject.isTextColorEmoji(document)) {
                    Integer num = k1Var.u0;
                    v9Var.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : znVar.getThemedColor(org.telegram.ui.ActionBar.j6.v6), PorterDuff.Mode.SRC_IN));
                    k1Var.C0 = MessageObject.getInputStickerSet(document);
                } else {
                    k1Var.C0 = MessageObject.getInputStickerSet(document);
                }
                k1Var.B0 = v9Var;
                k1Var.E0 = true;
            }
        }
        znVar.showDialog(k1Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final int V() {
        return this.a.R3;
    }

    /* JADX WARN: Removed duplicated region for block: B:244:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x09a5 A[LOOP:3: B:254:0x09a3->B:255:0x09a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0a0c  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0a24  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0aa6  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0942  */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean V1(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        mw0 mw0Var;
        TLRPC.PollAnswer pollAnswer2;
        mw0 mw0Var2;
        hw0 hw0Var;
        ah.c cVar;
        MessageObject messageObject;
        TLRPC.ChatFull chatFull;
        ArrayList arrayList;
        boolean z10;
        mw0 mw0Var3;
        MessageObject messageObject2;
        boolean z11;
        bf bfVar;
        zn znVar;
        MessageObject messageObject3;
        int size;
        int i10;
        ViewGroup viewGroup;
        boolean z12;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        boolean z13;
        byte[] bArr;
        hw0 hw0Var2;
        TLRPC.PollAnswerVoters pollAnswerVoters;
        boolean z14;
        mw0 mw0Var4;
        ArrayList arrayList2;
        byte[] bArr2;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll2;
        TLRPC.PollAnswer pollAnswer3;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll3;
        boolean z15;
        qh.q qVar;
        boolean z16;
        ArrayList<TLRPC.PollAnswerVoters> arrayList3;
        zn znVar2 = this.a;
        if (znVar2.getParentActivity() != null && znVar2.getParentActivity() != null) {
            ci.f4 f4Var = znVar2.x1;
            if (f4Var != null && f4Var.V) {
                f4Var.e(true);
            }
            vl vlVar = znVar2.B1;
            if (vlVar != null && vlVar.V) {
                vlVar.e(true);
            }
            MessageObject primaryMessageObject = u1Var.getPrimaryMessageObject();
            TLRPC.MessageMedia media = MessageObject.getMedia(primaryMessageObject);
            if (primaryMessageObject != null && (media instanceof TLRPC.TL_messageMediaPoll)) {
                znVar2.d5 = primaryMessageObject;
                znVar2.e5 = null;
                mw0 mw0Var5 = new mw0(znVar2.getParentActivity(), znVar2.getResourceProvider());
                byte[] bArr3 = pollAnswer.option;
                mw0Var5.L = u1Var;
                mw0Var5.P = bArr3;
                MessageObject messageObject4 = u1Var.getMessageObject();
                mw0Var5.H = messageObject4;
                mw0Var5.I = messageObject4 != null && messageObject4.isOutOwner();
                org.telegram.ui.Cells.u1 u1Var2 = mw0Var5.L;
                hw0 hw0Var3 = mw0Var5.d;
                if (u1Var2 != null) {
                    mw0Var5.M = znVar2.s9 - AndroidUtilities.dp(4.0f);
                    mw0Var5.N = u1Var.n;
                    if (u1Var.getParent() instanceof View) {
                        View view = (View) u1Var.getParent();
                        mw0Var5.M = view.getY() + mw0Var5.M;
                        mw0Var5.N = view.getY() + mw0Var5.N;
                    }
                    int width = mw0Var5.L.getWidth();
                    int height = mw0Var5.L.getHeight();
                    mw0Var5.L.getHeight();
                    kw0 kw0Var = new kw0(mw0Var5, mw0Var5.getContext(), UserConfig.selectedAccount, mw0Var5.L.getResourcesProvider(), bArr3, width, height);
                    mw0Var = mw0Var5;
                    mw0Var.J = kw0Var;
                    mw0Var.L.h1(kw0Var);
                    mw0Var.J.i1(mw0Var.L);
                    mw0Var.J.setDelegate(new qb.b(17));
                    kw0 kw0Var2 = mw0Var.J;
                    MessageObject messageObject5 = mw0Var.H;
                    MessageObject.GroupedMessages currentMessagesGroup = mw0Var.L.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.u1 u1Var3 = mw0Var.L;
                    kw0Var2.X3(messageObject5, currentMessagesGroup, u1Var3.F, u1Var3.E, u1Var3.G, false);
                    kw0 kw0Var3 = mw0Var.J;
                    kw0Var3.M7 = bArr3;
                    hw0Var3.addView(kw0Var3, new FrameLayout.LayoutParams(mw0Var.L.getWidth(), height, 51));
                    lw0 lw0Var = new lw0(mw0Var.getContext(), UserConfig.selectedAccount, mw0Var.L.getResourcesProvider(), width, height, 0);
                    mw0Var.K = lw0Var;
                    mw0Var.L.j1(lw0Var);
                    mw0Var.L.h1(mw0Var.K);
                    mw0Var.K.i1(mw0Var.L);
                    mw0Var.K.setDelegate(new ob.a(17));
                    lw0 lw0Var2 = mw0Var.K;
                    MessageObject messageObject6 = mw0Var.H;
                    MessageObject.GroupedMessages currentMessagesGroup2 = mw0Var.L.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.u1 u1Var4 = mw0Var.L;
                    lw0Var2.X3(messageObject6, currentMessagesGroup2, u1Var4.F, u1Var4.E, u1Var4.G, false);
                    hw0Var3.addView(mw0Var.K, new FrameLayout.LayoutParams(mw0Var.L.getWidth(), height, 51));
                } else {
                    mw0Var = mw0Var5;
                }
                ci.i1 i1Var = mw0Var.f;
                i1Var.bringToFront();
                hw0 hw0Var4 = mw0Var.e;
                hw0Var4.bringToFront();
                mw0Var.n.bringToFront();
                i1Var.w(false);
                Context context = mw0Var.a;
                View view2 = new View(context);
                org.telegram.ui.ActionBar.f6 f6Var = mw0Var.b;
                org.telegram.ui.Components.v70 G = org.telegram.ui.Components.v70.G(hw0Var3, f6Var, view2, true);
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll4 = (TLRPC.TL_messageMediaPoll) MessageObject.getMedia(mw0Var.H);
                mw0Var.V = MessageObject.isVoted(tL_messageMediaPoll4);
                int i11 = 0;
                while (true) {
                    if (i11 >= tL_messageMediaPoll4.poll.answers.size()) {
                        pollAnswer2 = null;
                        break;
                    }
                    if (Arrays.equals(tL_messageMediaPoll4.poll.answers.get(i11).option, bArr3)) {
                        pollAnswer2 = tL_messageMediaPoll4.poll.answers.get(i11);
                        break;
                    }
                    i11++;
                }
                ah.c cVar2 = mw0Var.G;
                if (pollAnswer2 != null) {
                    TLRPC.Poll poll = tL_messageMediaPoll4.poll;
                    boolean z17 = (poll.closed || poll.revoting_disabled) ? false : true;
                    boolean z18 = poll.multiple_choice;
                    ArrayList arrayList4 = new ArrayList();
                    TLRPC.PollResults pollResults = tL_messageMediaPoll4.results;
                    if (pollResults == null || (arrayList3 = pollResults.results) == null) {
                        tL_messageMediaPoll = tL_messageMediaPoll4;
                        z13 = z18;
                        bArr = bArr3;
                        hw0Var2 = hw0Var3;
                        pollAnswerVoters = null;
                        z14 = false;
                    } else {
                        int size2 = arrayList3.size();
                        z13 = z18;
                        int i12 = 0;
                        z14 = false;
                        TLRPC.PollAnswerVoters pollAnswerVoters2 = null;
                        while (i12 < size2) {
                            TLRPC.PollAnswerVoters pollAnswerVoters3 = arrayList3.get(i12);
                            int i13 = i12 + 1;
                            TLRPC.PollAnswerVoters pollAnswerVoters4 = pollAnswerVoters3;
                            hw0 hw0Var5 = hw0Var3;
                            boolean equals = Arrays.equals(pollAnswerVoters4.option, bArr3);
                            if (equals) {
                                pollAnswerVoters2 = pollAnswerVoters4;
                            }
                            byte[] bArr4 = bArr3;
                            if (pollAnswerVoters4.chosen) {
                                if (equals) {
                                    z14 = true;
                                }
                                ArrayList<TLRPC.PollAnswer> arrayList5 = tL_messageMediaPoll4.poll.answers;
                                int size3 = arrayList5.size();
                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll5 = tL_messageMediaPoll4;
                                int i14 = 0;
                                while (i14 < size3) {
                                    TLRPC.PollAnswer pollAnswer4 = arrayList5.get(i14);
                                    int i15 = i14 + 1;
                                    TLRPC.PollAnswer pollAnswer5 = pollAnswer4;
                                    ArrayList<TLRPC.PollAnswer> arrayList6 = arrayList5;
                                    int i16 = size3;
                                    if (Arrays.equals(pollAnswer5.option, pollAnswerVoters4.option)) {
                                        arrayList4.add(pollAnswer5);
                                    }
                                    arrayList5 = arrayList6;
                                    i14 = i15;
                                    size3 = i16;
                                }
                                hw0Var3 = hw0Var5;
                                i12 = i13;
                                bArr3 = bArr4;
                                tL_messageMediaPoll4 = tL_messageMediaPoll5;
                            } else {
                                hw0Var3 = hw0Var5;
                                i12 = i13;
                                bArr3 = bArr4;
                            }
                        }
                        tL_messageMediaPoll = tL_messageMediaPoll4;
                        bArr = bArr3;
                        hw0Var2 = hw0Var3;
                        pollAnswerVoters = pollAnswerVoters2;
                    }
                    if (pollAnswerVoters == null || pollAnswerVoters.voters <= 0 || !MessageObject.canShowVotersList(tL_messageMediaPoll)) {
                        mw0Var4 = mw0Var;
                        arrayList2 = arrayList4;
                        messageObject = primaryMessageObject;
                        hw0Var = hw0Var2;
                        bArr2 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                    } else {
                        qh.q qVar2 = new qh.q(context, znVar2.getCurrentAccount(), f6Var);
                        org.telegram.ui.Components.v70 J = G.J();
                        J.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                        dh.a k10 = eh.b.k(f6Var);
                        View view3 = J.B;
                        if (view3 != null) {
                            qVar = qVar2;
                            z16 = false;
                            ch.d c10 = cVar2.c(view3, null, false);
                            c10.o(k10);
                            view3.setBackground(c10);
                        } else {
                            qVar = qVar2;
                            z16 = false;
                        }
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new mu0(G, 25), z16);
                        J.k();
                        long dialogId = mw0Var.H.getDialogId();
                        int id2 = mw0Var.H.getId();
                        int i17 = pollAnswerVoters.voters;
                        pj0 pj0Var = new pj0(4, mw0Var, znVar2);
                        mw0Var4 = mw0Var;
                        messageObject = primaryMessageObject;
                        arrayList2 = arrayList4;
                        hw0Var = hw0Var2;
                        qh.q qVar3 = qVar;
                        byte[] bArr5 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                        View a2 = qVar3.a(znVar2, dialogId, id2, bArr5, i17, pj0Var);
                        znVar2 = znVar2;
                        bArr2 = bArr5;
                        J.q(a2);
                        qVar3.setMinimumHeight(AndroidUtilities.dp(48.0f));
                        qVar3.setText(LocaleController.formatPluralString("PollVotesCount", pollAnswerVoters.voters, new Object[0]));
                        qVar3.a.d(pollAnswerVoters.recent_voters, false);
                        qVar3.setLayoutParams(w7.y5.n(-1, 48));
                        qVar3.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I5, false), 12, 0));
                        qVar3.setOnClickListener(new tv(G, J));
                        G.q(qVar3);
                        G.k();
                    }
                    if (!z17) {
                        mw0Var2 = mw0Var4;
                        pollAnswer3 = pollAnswer2;
                    } else if (z14) {
                        int i18 = R.drawable.msg_unvote;
                        CharSequence string = LocaleController.getString(R.string.Unvote);
                        mw0Var2 = mw0Var4;
                        zn znVar3 = znVar2;
                        TLRPC.PollAnswer pollAnswer6 = pollAnswer2;
                        Runnable dw0Var = new dw0(mw0Var2, z13, znVar3, arrayList2, pollAnswer6);
                        znVar2 = znVar3;
                        pollAnswer3 = pollAnswer6;
                        G.c(i18, string, dw0Var, false);
                    } else {
                        mw0Var2 = mw0Var4;
                        pollAnswer3 = pollAnswer2;
                        ArrayList arrayList7 = arrayList2;
                        if (qh.i.a(mw0Var2.H) == 0) {
                            G.c(R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), new dw0(mw0Var2, z13, pollAnswer3, znVar2, arrayList7), false);
                        }
                    }
                    if (znVar2.E6()) {
                        G.c(R.drawable.menu_reply, LocaleController.getString(R.string.PollItemQuote), new rf0(mw0Var2, znVar2, pollAnswer3, 21), false);
                    }
                    if (mw0Var2.H.getDialogId() >= 0 || pollAnswer3.option == null) {
                        tL_messageMediaPoll3 = tL_messageMediaPoll2;
                        z15 = false;
                    } else {
                        MessagesController messagesController = MessagesController.getInstance(mw0Var2.H.currentAccount);
                        tL_messageMediaPoll3 = tL_messageMediaPoll2;
                        String publicUsername = DialogObject.getPublicUsername(messagesController.getUserOrChat(mw0Var2.H.getDialogId()));
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(messagesController.linkPrefix);
                        sb2.append("/");
                        if (TextUtils.isEmpty(publicUsername)) {
                            publicUsername = "c/" + (-mw0Var2.H.getDialogId());
                        }
                        sb2.append(publicUsername);
                        sb2.append("/");
                        sb2.append(mw0Var2.H.getId());
                        sb2.append("?option=");
                        sb2.append(new String(Base64.encode(pollAnswer3.option, 9)));
                        z15 = false;
                        G.c(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new fj0(27, mw0Var2, sb2.toString()), false);
                    }
                    G.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new fj0(28, mw0Var2, pollAnswer3), z15);
                    TLRPC.Peer peer = pollAnswer3.added_by;
                    if (peer != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        long clientUserId = UserConfig.getInstance(mw0Var2.H.currentAccount).getClientUserId();
                        cVar = cVar2;
                        long currentTime = ConnectionsManager.getInstance(mw0Var2.H.currentAccount).getCurrentTime();
                        zn znVar4 = znVar2;
                        long j3 = MessagesController.getInstance(mw0Var2.H.currentAccount).config.pollAnswerDeletePeriod.get(TimeUnit.SECONDS) + pollAnswer3.date;
                        if (!mw0Var2.H.isForwarded()) {
                            TLRPC.Poll poll2 = tL_messageMediaPoll3.poll;
                            if (!poll2.closed && (poll2.creator || (peerDialogId == clientUserId && currentTime < j3))) {
                                G.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new fj0(29, mw0Var2, bArr2), true);
                            }
                        }
                        G.k();
                        TLObject userOrChat = MessagesController.getInstance(mw0Var2.H.currentAccount).getUserOrChat(peerDialogId);
                        CharSequence replaceTags = AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.PollAddedByAtTime, DialogObject.getShortName(userOrChat), LocaleController.formatDateTime(pollAnswer3.date, true)));
                        znVar2 = znVar4;
                        a3.h0 h0Var = new a3.h0(mw0Var2, peerDialogId, znVar2, 29);
                        Context context2 = G.e;
                        FrameLayout frameLayout = new FrameLayout(context2);
                        int i19 = org.telegram.ui.ActionBar.j6.i6;
                        org.telegram.ui.ActionBar.f6 f6Var2 = G.d;
                        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(i19, f6Var2), 0, 12));
                        org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(context2);
                        v9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
                        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
                        g9Var.p(userOrChat);
                        v9Var.e(userOrChat, g9Var);
                        frameLayout.addView(v9Var, w7.y5.d(34, 34.0f, 51, 13.0f, 11.0f, 0.0f, 11.0f));
                        TextView textView = new TextView(context2);
                        org.telegram.messenger.rk.n(org.telegram.ui.ActionBar.j6.j5, f6Var2, textView, 1, 14.0f);
                        textView.setText(replaceTags);
                        textView.setMaxWidth(AndroidUtilities.dp(150.0f));
                        textView.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                        frameLayout.addView(textView, w7.y5.d(-2, -2.0f, 55, 59.0f, 8.0f, 16.0f, 0.0f));
                        frameLayout.setOnClickListener(new org.telegram.ui.Components.dt(7, G, h0Var));
                        G.r(frameLayout, w7.y5.n(-1, -2));
                    } else {
                        cVar = cVar2;
                    }
                } else {
                    mw0Var2 = mw0Var;
                    hw0Var = hw0Var3;
                    cVar = cVar2;
                    messageObject = primaryMessageObject;
                }
                G.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                G.Q(cVar, eh.b.k(f6Var), false);
                G.Y();
                ViewGroup viewGroup2 = G.A;
                mw0Var2.R = viewGroup2;
                viewGroup2.setPivotX(0.0f);
                mw0Var2.R.setPivotY(0.0f);
                hw0Var4.addView(mw0Var2.R, w7.y5.e(-2, -2, 51));
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                znVar2.n8(messageObject, arrayList8, arrayList9, arrayList10);
                bf bfVar2 = new bf(znVar2, 6);
                MessageObject messageObject7 = mw0Var2.H;
                List<TLRPC.TL_availableReaction> enabledReactionsList = znVar2.getMediaDataController().getEnabledReactionsList();
                boolean z19 = (znVar2.v() || znVar2.c() || znVar2.f != null || !messageObject7.hasReactions() || (ChatObject.isChannel(znVar2.e) && !znVar2.e.megagroup) || ChatObject.isMonoForum(znVar2.e) || enabledReactionsList.isEmpty() || !messageObject7.messageOwner.reactions.can_see_list || messageObject7.isSecretMedia()) ? false : true;
                boolean z20 = !messageObject7.isForwardedChannelPost() ? messageObject7.isSecretMedia() || znVar2.R3 == 5 || znVar2.v() || znVar2.c() || !messageObject7.isReactionsAvailable() || ((((chatFull = znVar2.Z7) == null || ((chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull.paid_reactions_available)) && ((chatFull != null || ChatObject.isChannel(znVar2.e)) && znVar2.f == null && !ChatObject.isMonoForum(znVar2.e))) || enabledReactionsList.isEmpty()) : (chatFull3 = znVar2.getMessagesController().getChatFull(-messageObject7.getFromChatId())) != null && (znVar2.v() || znVar2.R3 == 5 || znVar2.c() || !messageObject7.isReactionsAvailable() || (((chatFull3.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull3.paid_reactions_available) || enabledReactionsList.isEmpty()));
                boolean z21 = (z19 || znVar2.c() || znVar2.e == null || !messageObject7.isOutOwner() || !messageObject7.isSent() || messageObject7.isEditing() || messageObject7.isSending() || messageObject7.isSendError() || messageObject7.isContentUnread() || messageObject7.isUnread() || ConnectionsManager.getInstance(znVar2.getCurrentAccount()).getCurrentTime() - messageObject7.messageOwner.date >= znVar2.getMessagesController().chatReadMarkExpirePeriod || (!ChatObject.isMegagroup(znVar2.e) && ChatObject.isChannel(znVar2.e)) || (chatFull2 = znVar2.Z7) == null || chatFull2.participants_count > znVar2.getMessagesController().chatReadMarkSizeThreshold || (messageObject7.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || znVar2.R3 == 3 || !messageObject7.canSetReaction() || ChatObject.isMonoForum(znVar2.e)) ? false : true;
                if (znVar2.e == null || messageObject7.isOut() || !ChatObject.isMonoForum(znVar2.e) || !ChatObject.canManageMonoForum(znVar2.getCurrentAccount(), znVar2.e)) {
                    arrayList = arrayList9;
                } else {
                    arrayList = arrayList9;
                    int i20 = ((-znVar2.e.linked_monoforum_id) > messageObject7.getFromChatId() ? 1 : ((-znVar2.e.linked_monoforum_id) == messageObject7.getFromChatId() ? 0 : -1));
                }
                if (!z19 && znVar2.e == null && znVar2.h == null && (user = znVar2.f) != null && !UserObject.isUserSelf(user) && !UserObject.isReplyUser(znVar2.f) && !UserObject.isAnonymous(znVar2.f)) {
                    TLRPC.User user2 = znVar2.f;
                    if (!user2.bot && !UserObject.isService(user2.id) && (((userFull = znVar2.a8) == null || !userFull.read_dates_private) && !znVar2.c() && messageObject7.isOutOwner() && messageObject7.isSent() && !messageObject7.isEditing() && !messageObject7.isSending() && !messageObject7.isSendError() && !messageObject7.isContentUnread() && !messageObject7.isUnread() && znVar2.getConnectionsManager().getCurrentTime() - messageObject7.messageOwner.date < znVar2.getMessagesController().pmReadDateExpirePeriod && !(messageObject7.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                        z10 = true;
                        TLRPC.User user3 = znVar2.f;
                        boolean z22 = ((user3 == null && (UserObject.isReplyUser(user3) || UserObject.isAnonymous(znVar2.f))) || znVar2.c() || !messageObject7.isEdited() || (messageObject7.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                        org.telegram.ui.Components.v70 G2 = org.telegram.ui.Components.v70.G(hw0Var, znVar2.getResourceProvider(), null, !z19 || z21);
                        if (z21) {
                            mw0Var3 = mw0Var2;
                            messageObject2 = messageObject7;
                            z11 = z20;
                            bfVar = bfVar2;
                            znVar = znVar2;
                            if (z10) {
                                G2.r(new org.telegram.ui.Components.hc0(mw0Var3.getContext(), 0, messageObject2, new bw0(mw0Var3, 1), mw0Var3.b), w7.y5.n(-1, 36));
                                G2.k();
                            } else if (z22) {
                                messageObject3 = messageObject2;
                                G2.r(new org.telegram.ui.Components.hc0(mw0Var3.getContext(), 1, messageObject2, new bw0(mw0Var3, 2), mw0Var3.b), w7.y5.n(-1, 36));
                                G2.k();
                                size = arrayList8.size();
                                i10 = 0;
                                while (i10 < size) {
                                    G2.c(((Integer) arrayList8.get(i10)).intValue(), (CharSequence) arrayList.get(i10), new fm0(mw0Var3, bfVar, ((Integer) arrayList10.get(i10)).intValue(), 4), false);
                                    i10++;
                                    arrayList8 = arrayList8;
                                }
                                G2.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                                G2.Q(cVar, eh.b.k(f6Var), false);
                                G2.Y();
                                ViewGroup viewGroup3 = G2.A;
                                mw0Var3.T = viewGroup3;
                                viewGroup3.setPivotX(0.0f);
                                mw0Var3.T.setPivotY(0.0f);
                                hw0Var4.addView(mw0Var3.T, w7.y5.e(-2, -2, 51));
                                viewGroup = mw0Var3.T;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new ol0(mw0Var3, 7));
                                    mw0Var3.T.setOnTouchListener(new d0(mw0Var3, 5));
                                }
                                if (z11) {
                                    zn znVar5 = znVar;
                                    org.telegram.ui.Components.pk0 pk0Var = new org.telegram.ui.Components.pk0((znVar.getUserConfig().getClientUserId() > znVar.a() ? 1 : (znVar.getUserConfig().getClientUserId() == znVar.a() ? 0 : -1)) == 0 ? 3 : 0, znVar.getCurrentAccount(), mw0Var3.getContext(), znVar5, mw0Var3.b);
                                    pk0Var.a = true;
                                    float f7 = 22;
                                    pk0Var.setPadding(AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : 24), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 24 : 0), AndroidUtilities.dp(f7));
                                    pk0Var.setDelegate(new gw0(mw0Var3, znVar5, messageObject3, pk0Var));
                                    mw0Var3.Q = pk0Var;
                                    hw0Var4.addView(pk0Var, w7.y5.e(-2, (int) ((pk0Var.getTopOffset() / AndroidUtilities.density) + 52.0f + f7), 51));
                                    z12 = true;
                                    pk0Var.p(messageObject3, znVar5.Z7, true);
                                    mw0Var3.Q.setTransitionProgress(1.0f);
                                } else {
                                    z12 = true;
                                }
                                mw0Var3.e();
                                mw0Var3.e0 = new wm(this, 0);
                                mw0Var3.show();
                                return z12;
                            }
                        } else {
                            hi0 hi0Var = new hi0(mw0Var2.getContext(), znVar2.getCurrentAccount(), messageObject7, znVar2.e);
                            FrameLayout frameLayout2 = new FrameLayout(mw0Var2.getContext());
                            frameLayout2.addView(hi0Var, w7.y5.c(36.0f, -1));
                            org.telegram.ui.Components.v70 J2 = G2.J();
                            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, mw0Var2.getContext(), mw0Var2.b, true, false);
                            f1Var.setItemHeight(44);
                            mw0 mw0Var6 = mw0Var2;
                            f1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                            messageObject2 = messageObject7;
                            f1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                            FrameLayout frameLayout3 = new FrameLayout(mw0Var6.getContext());
                            LinearLayout linearLayout = new LinearLayout(mw0Var6.getContext());
                            linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var));
                            linearLayout.setOrientation(1);
                            zn znVar6 = znVar2;
                            org.telegram.ui.Components.vl0 a10 = hi0Var.a();
                            frameLayout3.addView(f1Var);
                            linearLayout.addView(frameLayout3);
                            z11 = z20;
                            linearLayout.addView(new org.telegram.ui.ActionBar.k1(mw0Var6.getContext(), f6Var), w7.y5.n(-1, 8));
                            frameLayout3.setOnClickListener(new ew0(G2));
                            bfVar = bfVar2;
                            fw0 fw0Var = new fw0(mw0Var6, hi0Var, znVar6, a10, linearLayout, G2, J2);
                            G2 = G2;
                            mw0Var3 = mw0Var6;
                            znVar = znVar6;
                            hi0Var.setOnClickListener(fw0Var);
                            linearLayout.addView(a10, w7.y5.n(-1, -2));
                            J2.q(linearLayout);
                            G2.q(frameLayout2);
                            G2.k();
                        }
                        messageObject3 = messageObject2;
                        size = arrayList8.size();
                        i10 = 0;
                        while (i10 < size) {
                        }
                        G2.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                        G2.Q(cVar, eh.b.k(f6Var), false);
                        G2.Y();
                        ViewGroup viewGroup32 = G2.A;
                        mw0Var3.T = viewGroup32;
                        viewGroup32.setPivotX(0.0f);
                        mw0Var3.T.setPivotY(0.0f);
                        hw0Var4.addView(mw0Var3.T, w7.y5.e(-2, -2, 51));
                        viewGroup = mw0Var3.T;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z11) {
                        }
                        mw0Var3.e();
                        mw0Var3.e0 = new wm(this, 0);
                        mw0Var3.show();
                        return z12;
                    }
                }
                z10 = false;
                TLRPC.User user32 = znVar2.f;
                if (user32 == null) {
                }
                org.telegram.ui.Components.v70 G22 = org.telegram.ui.Components.v70.G(hw0Var, znVar2.getResourceProvider(), null, !z19 || z21);
                if (z21) {
                }
                messageObject3 = messageObject2;
                size = arrayList8.size();
                i10 = 0;
                while (i10 < size) {
                }
                G22.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                G22.Q(cVar, eh.b.k(f6Var), false);
                G22.Y();
                ViewGroup viewGroup322 = G22.A;
                mw0Var3.T = viewGroup322;
                viewGroup322.setPivotX(0.0f);
                mw0Var3.T.setPivotY(0.0f);
                hw0Var4.addView(mw0Var3.T, w7.y5.e(-2, -2, 51));
                viewGroup = mw0Var3.T;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z11) {
                }
                mw0Var3.e();
                mw0Var3.e0 = new wm(this, 0);
                mw0Var3.show();
                return z12;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void W0(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        this.a.U7(characterStyle, z10, u1Var.getMessageObject(), u1Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean X0(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
        MessageObject messageObject = (currentMessagesGroup == null || currentMessagesGroup.messages.isEmpty()) ? u1Var.getMessageObject() : currentMessagesGroup.messages.get(0);
        if (messageObject != null) {
            zn znVar = this.a;
            boolean z11 = !znVar.ic && messageObject.getId() == znVar.hc;
            if (!z10) {
                return z11;
            }
            if (z11 && System.currentTimeMillis() - znVar.jc > 1000) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final hh.a Y() {
        return this.a.Pb;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void Y0(org.telegram.ui.Cells.u1 u1Var) {
        zn znVar = this.a;
        znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(znVar.T5), u1Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final pv0 Y1() {
        return this.a.wa;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean a0(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var == null ? null : u1Var.getMessageObject();
        if (messageObject == null || messageObject.messageOwner == null) {
            return false;
        }
        zn znVar = this.a;
        return (znVar.R3 == 1 || znVar.y9() || messageObject.messageOwner.noforwards || messageObject.type == 29) ? false : true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void a1(org.telegram.ui.Cells.u1 u1Var) {
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
        zn znVar = this.a;
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
                        int childCount = znVar.x0.getChildCount();
                        for (int i11 = 0; i11 < childCount; i11++) {
                            View childAt = znVar.x0.getChildAt(i11);
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
        znVar.Jb(messageObject, spannableStringBuilder, 1);
        u1Var.g4(1, false, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean a2(long j3) {
        zn znVar = this.a;
        TLRPC.Chat chat = znVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return false;
        }
        return znVar.getMessagesController().isAdmin(znVar.e.id, j3);
    }

    public final void b(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        zn znVar = this.a;
        lk lkVar = znVar.Y;
        if (lkVar != null) {
            CharSequence fieldText = lkVar.getFieldText();
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
                znVar.Y.setFieldText(spannableStringBuilder);
                AndroidUtilities.runOnUIThread(new wm(this, 6), 200L);
            }
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
    public final boolean b0(org.telegram.ui.Cells.u1 u1Var, final TLRPC.User user) {
        int i10;
        x4 b10;
        int i11;
        qk qkVar;
        pk pkVar;
        if (!m()) {
            return false;
        }
        zn znVar = this.a;
        ?? r22 = (znVar.e == null || ((qkVar = znVar.O0) != null && qkVar.getVisibility() == 0) || ((pkVar = znVar.R) != null && pkVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat = znVar.e;
        ?? r42 = (chat == null || !(znVar.d4 == 0 || znVar.h4) || (ChatObject.isChannel(chat) && !znVar.e.megagroup)) ? 0 : 1;
        d5[] d5VarArr = new d5[r22 + 2 + r42];
        d5VarArr[0] = d5.d;
        d5VarArr[1] = d5.h;
        char c10 = 2;
        if (r22 != 0) {
            d5VarArr[2] = d5.n;
            c10 = 3;
        }
        if (r42 != 0) {
            d5VarArr[c10] = d5.r;
        }
        TLRPC.UserFull userFull = znVar.getMessagesController().getUserFull(user.id);
        if (userFull != null) {
            b10 = x4.c(user, userFull, d5VarArr);
            if (!com.google.firebase.messaging.m.e(b10)) {
                i11 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
                b10 = x4.b(user, i11, d5VarArr);
            }
        } else {
            i10 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
            b10 = x4.b(user, i10, d5VarArr);
        }
        if (com.google.firebase.messaging.m.e(b10)) {
            com.google.firebase.messaging.m.k().v((ViewGroup) znVar.fragmentView, znVar.ea, b10, new b7(this, u1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.v70 H = org.telegram.ui.Components.v70.H(znVar, u1Var);
        final int i12 = 0;
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(this) { // from class: org.telegram.ui.ym
            public final /* synthetic */ ln b;

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
                        this.b.a.ma(user);
                        break;
                }
            }
        }, false);
        H.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new q1(this, u1Var, user, 25), false);
        final int i13 = 1;
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new Runnable(this) { // from class: org.telegram.ui.ym
            public final /* synthetic */ ln b;

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
                        this.b.a.ma(user);
                        break;
                }
            }
        }, r22);
        final int i14 = 2;
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new Runnable(this) { // from class: org.telegram.ui.ym
            public final /* synthetic */ ln b;

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

    /* JADX WARN: Code restructure failed: missing block: B:176:0x00fe, code lost:
    
        if (org.telegram.messenger.DialogObject.getPeerDialogId(r5) != r8.T5) goto L67;
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
        boolean e = e();
        zn znVar = this.a;
        if (!e && !z10) {
            kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
            if ((kVar.s() || znVar.A9()) && !znVar.c9.A(u1Var.getMessageObject())) {
                zn.b2(znVar, u1Var, !u1Var.i3(f7), f7, f10);
                return;
            }
            return;
        }
        if (UserObject.isReplyUser(znVar.f)) {
            r(u1Var);
            return;
        }
        MessageObject messageObject2 = u1Var.getMessageObject();
        if (messageObject2 == null) {
            return;
        }
        if (messageObject2.isReplyToStory() && (storyItem = (message3 = messageObject2.messageOwner).replyStory) != null) {
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                org.telegram.messenger.l0.o(R.string.StoryNotFound, org.telegram.ui.Components.xc.a0(znVar), R.raw.story_bomb1, 36);
                return;
            }
            storyItem.dialogId = DialogObject.getPeerDialogId(message3.reply_to.peer);
            storyItem.messageId = messageObject2.getId();
            storyItem.messageType = 3;
            ai.ia.b(storyItem, znVar.f);
            znVar.getOrCreateStoryViewer().F(znVar.getParentActivity(), storyItem, ai.u9.a(znVar.x0));
            return;
        }
        TLRPC.Message message4 = messageObject2.messageOwner;
        if (message4 != null && (messageReplyHeader7 = message4.reply_to) != null && (messageReplyHeader7.flags & 2048) != 0) {
            num = Integer.valueOf(messageReplyHeader7.todo_item_id);
        } else {
            if (message4 != null && (messageReplyHeader2 = message4.reply_to) != null && (bArr = messageReplyHeader2.poll_option) != null) {
                num = null;
                str = null;
                long j10 = znVar.T5;
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
                org.telegram.ui.Components.xc.a0(znVar).Q(R.raw.error, 36, LocaleController.getString((message5 == null && (messageReplyHeader3 = message5.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
            }
            if (message4 != null && (messageReplyHeader = message4.reply_to) != null && messageReplyHeader.quote) {
                String str3 = messageReplyHeader.quote_text;
                r9 = (messageReplyHeader.flags & 1024) != 0 ? messageReplyHeader.quote_offset : -1;
                str = str3;
                num = null;
                bArr = null;
                long j102 = znVar.T5;
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
                            chat = j3 < 0 ? znVar.getMessagesController().getChat(Long.valueOf(-j3)) : null;
                            if (j3 != Long.MAX_VALUE) {
                                boolean z12 = z11;
                                if (j3 == znVar.T5 || chat == null || ChatObject.isPublic(chat) || (!chat.left && !chat.kicked)) {
                                    if (((j3 == znVar.T5 && (!ChatObject.isForum(znVar.e) || !z12)) || j3 == Long.MAX_VALUE) && (znVar.R3 != 3 || ((messageObject = messageObject2.replyMessageObject) != null && messageObject.getSavedDialogId() == znVar.d()))) {
                                        int i11 = znVar.R3;
                                        if (i11 == 2 || i11 == 1) {
                                            znVar.V8.R0(i10);
                                            znVar.finishFragment();
                                            return;
                                        }
                                        if (bArr != null) {
                                            znVar.R7 = bArr;
                                        } else if (num != null) {
                                            znVar.Q7 = num;
                                        } else {
                                            TLRPC.Message message6 = messageObject2.messageOwner;
                                            if (message6 != null && (messageReplyHeader5 = message6.reply_to) != null && messageReplyHeader5.quote) {
                                                znVar.N7 = true;
                                                znVar.P7 = messageReplyHeader5.quote_text;
                                                znVar.S7 = r9;
                                                znVar.M7 = true;
                                            }
                                        }
                                        ei.l3 l3Var = new ei.l3(this, i10, messageObject2, num, bArr, 18);
                                        if (!znVar.A0.N) {
                                            l3Var.run();
                                            return;
                                        }
                                        znVar.r3 = false;
                                        znVar.lb(false, true, false);
                                        znVar.Fc(znVar.getMediaDataController().getMask(), znVar.getMediaDataController().getSearchPosition(), znVar.getMediaDataController().getSearchCount());
                                        AndroidUtilities.runOnUIThread(l3Var, 80L);
                                        return;
                                    }
                                    Integer num2 = num;
                                    byte[] bArr2 = bArr;
                                    if (LaunchActivity.G1 != null) {
                                        nf.e eVar = znVar.zb;
                                        if (eVar != null) {
                                            eVar.a(false);
                                            n2Var = null;
                                            znVar.zb = null;
                                        } else {
                                            n2Var = null;
                                        }
                                        LaunchActivity launchActivity = LaunchActivity.G1;
                                        final i0 i0Var = new i0(this, messageObject2, u1Var);
                                        znVar.zb = i0Var;
                                        int id2 = messageObject2.getId();
                                        ArrayList arrayList = launchActivity.d0;
                                        if (j3 < 0 && (chat2 = MessagesController.getInstance(launchActivity.O).getChat(Long.valueOf(-j3))) != null && ChatObject.isForum(chat2)) {
                                            i0Var.d();
                                            final int i12 = 0;
                                            launchActivity.k0(j3, Integer.valueOf(i10), str2, num2, bArr2, new Runnable() { // from class: org.telegram.ui.m90
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i13 = i12;
                                                    i0 i0Var2 = i0Var;
                                                    switch (i13) {
                                                        case 0:
                                                            Pattern pattern = LaunchActivity.B1;
                                                            i0Var2.c(false);
                                                            break;
                                                        default:
                                                            Pattern pattern2 = LaunchActivity.B1;
                                                            i0Var2.c(false);
                                                            break;
                                                    }
                                                }
                                            }, id2, r9);
                                            return;
                                        }
                                        String str4 = str2;
                                        int i13 = r9;
                                        i0Var.d();
                                        Bundle bundle = new Bundle();
                                        if (j3 >= 0) {
                                            bundle.putLong("user_id", j3);
                                        } else {
                                            long j11 = -j3;
                                            TLRPC.Chat chat3 = MessagesController.getInstance(launchActivity.O).getChat(Long.valueOf(j11));
                                            if (chat3 != null && chat3.forum) {
                                                final int i14 = 1;
                                                launchActivity.k0(j3, Integer.valueOf(i10), str4, num2, bArr2, new Runnable() { // from class: org.telegram.ui.m90
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i132 = i14;
                                                        i0 i0Var2 = i0Var;
                                                        switch (i132) {
                                                            case 0:
                                                                Pattern pattern = LaunchActivity.B1;
                                                                i0Var2.c(false);
                                                                break;
                                                            default:
                                                                Pattern pattern2 = LaunchActivity.B1;
                                                                i0Var2.c(false);
                                                                break;
                                                        }
                                                    }
                                                }, id2, i13);
                                                return;
                                            }
                                            bundle.putLong("chat_id", j11);
                                        }
                                        bundle.putInt("message_id", i10);
                                        org.telegram.ui.ActionBar.n2 n2Var2 = !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.n2) hg.k0.g(1, arrayList) : n2Var;
                                        if (n2Var2 == null || MessagesController.getInstance(launchActivity.O).checkCanOpenChat(bundle, n2Var2)) {
                                            AndroidUtilities.runOnUIThread(new l90(launchActivity, bundle, bArr2, i10, num2, str4, i13, j3, i0Var, n2Var2));
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
                                org.telegram.ui.Components.xc.a0(znVar).Q(R.raw.error, 36, LocaleController.getString((message52 == null && (messageReplyHeader3 = message52.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
                            } else {
                                messageObject2.replyTextRevealed = true;
                                znVar.qc(messageObject2, true);
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
                    org.telegram.ui.Components.xc.a0(znVar).Q(R.raw.error, 36, LocaleController.getString((message522 == null && (messageReplyHeader3 = message522.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
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
                org.telegram.ui.Components.xc.a0(znVar).Q(R.raw.error, 36, LocaleController.getString((message5222 == null && (messageReplyHeader3 = message5222.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
            }
            num = null;
        }
        bArr = null;
        str = null;
        long j1022 = znVar.T5;
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
        org.telegram.ui.Components.xc.a0(znVar).Q(R.raw.error, 36, LocaleController.getString((message52222 == null && (messageReplyHeader3 = message52222.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
    }

    public final void c(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        zn znVar = this.a;
        lk lkVar = znVar.Y;
        if (lkVar != null) {
            CharSequence fieldText = lkVar.getFieldText();
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
                SpannableString spannableString = new SpannableString(v7.j0.s(UserObject.getFirstName(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.d61("" + user.id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            znVar.Y.setFieldText(spannableStringBuilder);
            AndroidUtilities.runOnUIThread(new wm(this, 7), 200L);
        }
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
        je1 je1Var;
        TLRPC.TodoItem todoItem2;
        TLRPC.TodoCompletion todoCompletion;
        je1 je1Var2;
        MessageObject messageObject;
        je1 je1Var3;
        int i10;
        MessageObject messageObject2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        bf bfVar;
        MessageObject messageObject3;
        boolean z14;
        ArrayList arrayList;
        ArrayList arrayList2;
        me1 me1Var;
        ArrayList arrayList3;
        zn znVar;
        MessageObject messageObject4;
        int size;
        int i11;
        ViewGroup viewGroup;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        final zn znVar2 = this.a;
        if (znVar2.getParentActivity() == null || znVar2.getParentActivity() == null) {
            return false;
        }
        ci.f4 f4Var = znVar2.x1;
        if (f4Var != null && f4Var.V) {
            f4Var.e(true);
        }
        vl vlVar = znVar2.B1;
        if (vlVar != null && vlVar.V) {
            vlVar.e(true);
        }
        MessageObject primaryMessageObject = u1Var.getPrimaryMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(primaryMessageObject);
        if (primaryMessageObject == null || !(media instanceof TLRPC.TL_messageMediaToDo)) {
            return false;
        }
        znVar2.d5 = primaryMessageObject;
        znVar2.e5 = null;
        final me1 me1Var2 = new me1(znVar2.getParentActivity(), znVar2.getResourceProvider());
        final int i12 = todoItem.id;
        me1Var2.K = u1Var;
        me1Var2.O = i12;
        MessageObject messageObject5 = u1Var.getMessageObject();
        me1Var2.G = messageObject5;
        me1Var2.H = messageObject5 != null && messageObject5.isOutOwner();
        org.telegram.ui.Cells.u1 u1Var2 = me1Var2.K;
        je1 je1Var4 = me1Var2.c;
        if (u1Var2 != null) {
            me1Var2.L = znVar2.s9 - AndroidUtilities.dp(4.0f);
            me1Var2.M = u1Var.n;
            if (u1Var.getParent() instanceof View) {
                View view = (View) u1Var.getParent();
                me1Var2.L = view.getY() + me1Var2.L;
                me1Var2.M = view.getY() + me1Var2.M;
            }
            int width = me1Var2.K.getWidth();
            int height = me1Var2.K.getHeight();
            me1Var2.K.getHeight();
            je1Var = je1Var4;
            ke1 ke1Var = new ke1(me1Var2, me1Var2.getContext(), UserConfig.selectedAccount, me1Var2.K.getResourcesProvider(), i12, width, height);
            me1Var2.I = ke1Var;
            me1Var2.K.h1(ke1Var);
            me1Var2.I.i1(me1Var2.K);
            me1Var2.I.setDelegate(new le1(me1Var2));
            ke1 ke1Var2 = me1Var2.I;
            MessageObject messageObject6 = me1Var2.G;
            MessageObject.GroupedMessages currentMessagesGroup = me1Var2.K.getCurrentMessagesGroup();
            org.telegram.ui.Cells.u1 u1Var3 = me1Var2.K;
            ke1Var2.X3(messageObject6, currentMessagesGroup, u1Var3.F, u1Var3.E, u1Var3.G, false);
            je1Var.addView(me1Var2.I, new FrameLayout.LayoutParams(me1Var2.K.getWidth(), height, 51));
            lw0 lw0Var = new lw0(me1Var2.getContext(), UserConfig.selectedAccount, me1Var2.K.getResourcesProvider(), width, height, 1);
            me1Var2.J = lw0Var;
            me1Var2.K.j1(lw0Var);
            me1Var2.K.h1(me1Var2.J);
            me1Var2.J.i1(me1Var2.K);
            me1Var2.J.setDelegate(new qb.b(18));
            lw0 lw0Var2 = me1Var2.J;
            MessageObject messageObject7 = me1Var2.G;
            MessageObject.GroupedMessages currentMessagesGroup2 = me1Var2.K.getCurrentMessagesGroup();
            org.telegram.ui.Cells.u1 u1Var4 = me1Var2.K;
            lw0Var2.X3(messageObject7, currentMessagesGroup2, u1Var4.F, u1Var4.E, u1Var4.G, false);
            je1Var.addView(me1Var2.J, new FrameLayout.LayoutParams(me1Var2.K.getWidth(), height, 51));
        } else {
            je1Var = je1Var4;
        }
        ci.i1 i1Var = me1Var2.e;
        i1Var.bringToFront();
        je1 je1Var5 = me1Var2.d;
        je1Var5.bringToFront();
        me1Var2.h.bringToFront();
        i1Var.w(false);
        org.telegram.ui.ActionBar.f6 f6Var = me1Var2.a;
        org.telegram.ui.Components.v70 F = org.telegram.ui.Components.v70.F(je1Var, f6Var, null);
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) MessageObject.getMedia(me1Var2.G);
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
        if (!me1Var2.G.canCompleteTodo()) {
            je1Var2 = je1Var5;
        } else if (todoCompletion != null) {
            je1Var2 = je1Var5;
            F.p(14, -1, LocaleController.formatTodoCompletedDate(todoCompletion.date));
            F.k();
            final int i15 = 1;
            F.c(R.drawable.msg_cancel, LocaleController.getString(R.string.TodoUncheck), new Runnable() { // from class: org.telegram.ui.ee1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            zn znVar3 = znVar2;
                            aw0 aw0Var = new aw0(znVar3);
                            me1 me1Var3 = me1Var2;
                            aw0Var.p0(MessageObject.getMedia(me1Var3.G), false, i12);
                            aw0Var.e0 = new rv0(15, me1Var3, znVar3);
                            znVar3.presentFragment(aw0Var);
                            me1Var3.c(false);
                            break;
                        case 1:
                            boolean c10 = znVar2.c();
                            me1 me1Var4 = me1Var2;
                            if (c10) {
                                Toast.makeText(me1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                ke1 ke1Var3 = me1Var4.I;
                                ke1Var3.k4(ke1Var3.O2(i12), false);
                            }
                            me1Var4.c(true);
                            break;
                        default:
                            boolean c11 = znVar2.c();
                            me1 me1Var5 = me1Var2;
                            if (c11) {
                                Toast.makeText(me1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                ke1 ke1Var4 = me1Var5.I;
                                ke1Var4.k4(ke1Var4.O2(i12), false);
                            }
                            me1Var5.c(true);
                            break;
                    }
                }
            }, false);
        } else {
            je1Var2 = je1Var5;
            final int i16 = 2;
            F.c(R.drawable.msg_select, LocaleController.getString(R.string.TodoCheck), new Runnable() { // from class: org.telegram.ui.ee1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i16) {
                        case 0:
                            zn znVar3 = znVar2;
                            aw0 aw0Var = new aw0(znVar3);
                            me1 me1Var3 = me1Var2;
                            aw0Var.p0(MessageObject.getMedia(me1Var3.G), false, i12);
                            aw0Var.e0 = new rv0(15, me1Var3, znVar3);
                            znVar3.presentFragment(aw0Var);
                            me1Var3.c(false);
                            break;
                        case 1:
                            boolean c10 = znVar2.c();
                            me1 me1Var4 = me1Var2;
                            if (c10) {
                                Toast.makeText(me1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                ke1 ke1Var3 = me1Var4.I;
                                ke1Var3.k4(ke1Var3.O2(i12), false);
                            }
                            me1Var4.c(true);
                            break;
                        default:
                            boolean c11 = znVar2.c();
                            me1 me1Var5 = me1Var2;
                            if (c11) {
                                Toast.makeText(me1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                ke1 ke1Var4 = me1Var5.I;
                                ke1Var4.k4(ke1Var4.O2(i12), false);
                            }
                            me1Var5.c(true);
                            break;
                    }
                }
            }, false);
        }
        if (todoItem2 != null) {
            F.c(R.drawable.menu_reply, LocaleController.getString(R.string.TodoItemQuote), new zd1(me1Var2, znVar2, todoItem2, 2), false);
            if (me1Var2.G.getDialogId() < 0) {
                MessagesController messagesController = MessagesController.getInstance(me1Var2.G.currentAccount);
                String publicUsername = DialogObject.getPublicUsername(messagesController.getUserOrChat(me1Var2.G.getDialogId()));
                StringBuilder sb2 = new StringBuilder("https://");
                sb2.append(messagesController.linkPrefix);
                sb2.append("/");
                if (TextUtils.isEmpty(publicUsername)) {
                    StringBuilder sb3 = new StringBuilder("c/");
                    messageObject = primaryMessageObject;
                    je1Var3 = je1Var2;
                    sb3.append(-me1Var2.G.getDialogId());
                    publicUsername = sb3.toString();
                } else {
                    messageObject = primaryMessageObject;
                    je1Var3 = je1Var2;
                }
                sb2.append(publicUsername);
                sb2.append("/");
                sb2.append(me1Var2.G.getId());
                sb2.append("?task=");
                sb2.append(todoItem2.id);
                F.c(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new w81(10, me1Var2, sb2.toString()), false);
            } else {
                messageObject = primaryMessageObject;
                je1Var3 = je1Var2;
            }
            F.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new w81(11, me1Var2, todoItem2), false);
        } else {
            messageObject = primaryMessageObject;
            je1Var3 = je1Var2;
        }
        if (me1Var2.G.canEditMessage(znVar2.e)) {
            final int i17 = 0;
            F.c(R.drawable.msg_edit, LocaleController.getString(R.string.TodoEditItem), new Runnable() { // from class: org.telegram.ui.ee1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i17) {
                        case 0:
                            zn znVar3 = znVar2;
                            aw0 aw0Var = new aw0(znVar3);
                            me1 me1Var3 = me1Var2;
                            aw0Var.p0(MessageObject.getMedia(me1Var3.G), false, i13);
                            aw0Var.e0 = new rv0(15, me1Var3, znVar3);
                            znVar3.presentFragment(aw0Var);
                            me1Var3.c(false);
                            break;
                        case 1:
                            boolean c10 = znVar2.c();
                            me1 me1Var4 = me1Var2;
                            if (c10) {
                                Toast.makeText(me1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                ke1 ke1Var3 = me1Var4.I;
                                ke1Var3.k4(ke1Var3.O2(i13), false);
                            }
                            me1Var4.c(true);
                            break;
                        default:
                            boolean c11 = znVar2.c();
                            me1 me1Var5 = me1Var2;
                            if (c11) {
                                Toast.makeText(me1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                ke1 ke1Var4 = me1Var5.I;
                                ke1Var4.k4(ke1Var4.O2(i13), false);
                            }
                            me1Var5.c(true);
                            break;
                    }
                }
            }, false);
            if (tL_messageMediaToDo.todo.list.size() > 1) {
                i10 = 51;
                F.c(R.drawable.msg_delete, LocaleController.getString(R.string.TodoDeleteItem), new org.telegram.ui.Components.g21(me1Var2, tL_messageMediaToDo, i12, znVar2, 11), false);
                F.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                dh.e k10 = eh.b.k(f6Var);
                ah.c cVar = me1Var2.F;
                F.Q(cVar, k10, false);
                F.Y();
                ViewGroup viewGroup2 = F.A;
                me1Var2.Q = viewGroup2;
                viewGroup2.setPivotX(0.0f);
                me1Var2.Q.setPivotY(0.0f);
                je1Var3.addView(me1Var2.Q, w7.y5.e(-2, -2, i10));
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                znVar2.n8(messageObject, arrayList4, arrayList5, arrayList6);
                bf bfVar2 = new bf(znVar2, 7);
                messageObject2 = me1Var2.G;
                List<TLRPC.TL_availableReaction> enabledReactionsList = znVar2.getMediaDataController().getEnabledReactionsList();
                boolean z15 = znVar2.v() && !znVar2.c() && znVar2.f == null && messageObject2.hasReactions() && !((ChatObject.isChannel(znVar2.e) && !znVar2.e.megagroup) || ChatObject.isMonoForum(znVar2.e) || enabledReactionsList.isEmpty() || !messageObject2.messageOwner.reactions.can_see_list || messageObject2.isSecretMedia());
                if (messageObject2.isForwardedChannelPost()) {
                    z10 = z15;
                    if (!messageObject2.isSecretMedia()) {
                        if (znVar2.R3 != 5) {
                            if (!znVar2.v()) {
                                if (!znVar2.c()) {
                                    if (messageObject2.isReactionsAvailable()) {
                                        TLRPC.ChatFull chatFull2 = znVar2.Z7;
                                        if (chatFull2 != null) {
                                            if (chatFull2.available_reactions instanceof TLRPC.TL_chatReactionsNone) {
                                            }
                                        }
                                        if (chatFull2 == null) {
                                        }
                                        if (znVar2.f == null) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z11 = false;
                } else {
                    z10 = z15;
                    TLRPC.ChatFull chatFull3 = znVar2.getMessagesController().getChatFull(-messageObject2.getFromChatId());
                    if (chatFull3 != null) {
                        if (!znVar2.v()) {
                            if (znVar2.R3 != 5) {
                                if (!znVar2.c()) {
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
                z12 = (!z10 || znVar2.c() || znVar2.e == null || !messageObject2.isOutOwner() || !messageObject2.isSent() || messageObject2.isEditing() || messageObject2.isSending() || messageObject2.isSendError() || messageObject2.isContentUnread() || messageObject2.isUnread() || ConnectionsManager.getInstance(znVar2.getCurrentAccount()).getCurrentTime() - messageObject2.messageOwner.date >= znVar2.getMessagesController().chatReadMarkExpirePeriod || (!ChatObject.isMegagroup(znVar2.e) && ChatObject.isChannel(znVar2.e)) || (chatFull = znVar2.Z7) == null || chatFull.participants_count > znVar2.getMessagesController().chatReadMarkSizeThreshold || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || znVar2.R3 == 3 || !messageObject2.canSetReaction() || ChatObject.isMonoForum(znVar2.e)) ? false : true;
                if (znVar2.e != null && !messageObject2.isOut() && ChatObject.isMonoForum(znVar2.e) && ChatObject.canManageMonoForum(znVar2.getCurrentAccount(), znVar2.e)) {
                    int i18 = ((-znVar2.e.linked_monoforum_id) > messageObject2.getFromChatId() ? 1 : ((-znVar2.e.linked_monoforum_id) == messageObject2.getFromChatId() ? 0 : -1));
                }
                if (!z10 && znVar2.e == null && znVar2.h == null && (user = znVar2.f) != null && !UserObject.isUserSelf(user) && !UserObject.isReplyUser(znVar2.f) && !UserObject.isAnonymous(znVar2.f)) {
                    user2 = znVar2.f;
                    if (!user2.bot && !UserObject.isService(user2.id) && (((userFull = znVar2.a8) == null || !userFull.read_dates_private) && !znVar2.c() && messageObject2.isOutOwner() && messageObject2.isSent() && !messageObject2.isEditing() && !messageObject2.isSending() && !messageObject2.isSendError() && !messageObject2.isContentUnread() && !messageObject2.isUnread() && znVar2.getConnectionsManager().getCurrentTime() - messageObject2.messageOwner.date < znVar2.getMessagesController().pmReadDateExpirePeriod && !(messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                        z13 = true;
                        TLRPC.User user3 = znVar2.f;
                        boolean z17 = ((user3 == null && (UserObject.isReplyUser(user3) || UserObject.isAnonymous(znVar2.f))) || znVar2.c() || !messageObject2.isEdited() || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                        org.telegram.ui.Components.v70 G = org.telegram.ui.Components.v70.G(me1Var2.c, znVar2.getResourceProvider(), null, !z10 || z12);
                        if (z12) {
                            bfVar = bfVar2;
                            messageObject3 = messageObject2;
                            z14 = z16;
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            me1Var = me1Var2;
                            arrayList3 = arrayList6;
                            znVar = znVar2;
                            if (z13) {
                                G.r(new org.telegram.ui.Components.hc0(me1Var.getContext(), 0, messageObject3, new de1(me1Var, 0), me1Var.a), w7.y5.n(-1, 36));
                                G.k();
                            } else if (z17) {
                                messageObject4 = messageObject3;
                                G.r(new org.telegram.ui.Components.hc0(me1Var.getContext(), 1, messageObject3, new de1(me1Var, 2), me1Var.a), w7.y5.n(-1, 36));
                                G.k();
                                i11 = 0;
                                for (size = arrayList.size(); i11 < size; size = size) {
                                    G.c(((Integer) arrayList.get(i11)).intValue(), (CharSequence) arrayList2.get(i11), new fm0(me1Var, bfVar, ((Integer) arrayList3.get(i11)).intValue(), 9), false);
                                    i11++;
                                    arrayList3 = arrayList3;
                                }
                                G.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                                G.Q(cVar, eh.b.k(f6Var), false);
                                G.Y();
                                ViewGroup viewGroup3 = G.A;
                                me1Var.S = viewGroup3;
                                viewGroup3.setPivotX(0.0f);
                                me1Var.S.setPivotY(0.0f);
                                ViewGroup viewGroup4 = me1Var.S;
                                FrameLayout.LayoutParams e = w7.y5.e(-2, -2, 51);
                                je1 je1Var6 = me1Var.d;
                                je1Var6.addView(viewGroup4, e);
                                viewGroup = me1Var.S;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new ol0(me1Var, 23));
                                    me1Var.S.setOnTouchListener(new d0(me1Var, 7));
                                }
                                if (z14) {
                                    zn znVar3 = znVar;
                                    org.telegram.ui.Components.pk0 pk0Var = new org.telegram.ui.Components.pk0((znVar.getUserConfig().getClientUserId() > znVar.a() ? 1 : (znVar.getUserConfig().getClientUserId() == znVar.a() ? 0 : -1)) == 0 ? 3 : 0, znVar3.getCurrentAccount(), me1Var.getContext(), znVar3, me1Var.a);
                                    pk0Var.a = true;
                                    float f7 = 22;
                                    pk0Var.setPadding(AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : 24), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 24 : 0), AndroidUtilities.dp(f7));
                                    pk0Var.setDelegate(new ie1(me1Var, znVar3, messageObject4, pk0Var));
                                    me1Var.P = pk0Var;
                                    je1Var6.addView(pk0Var, w7.y5.e(-2, (int) ((pk0Var.getTopOffset() / AndroidUtilities.density) + 52.0f + f7), 51));
                                    pk0Var.p(messageObject4, znVar3.Z7, true);
                                    me1Var.P.setTransitionProgress(1.0f);
                                }
                                me1Var.e();
                                me1Var.c0 = new wm(this, 5);
                                me1Var.show();
                                return true;
                            }
                        } else {
                            hi0 hi0Var = new hi0(me1Var2.getContext(), znVar2.getCurrentAccount(), messageObject2, znVar2.e);
                            FrameLayout frameLayout = new FrameLayout(me1Var2.getContext());
                            frameLayout.addView(hi0Var, w7.y5.c(36.0f, -1));
                            org.telegram.ui.Components.v70 J = G.J();
                            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, me1Var2.getContext(), me1Var2.a, true, false);
                            f1Var.setItemHeight(44);
                            f1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                            f1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                            FrameLayout frameLayout2 = new FrameLayout(me1Var2.getContext());
                            LinearLayout linearLayout = new LinearLayout(me1Var2.getContext());
                            linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var));
                            linearLayout.setOrientation(1);
                            znVar = znVar2;
                            org.telegram.ui.Components.vl0 a2 = hi0Var.a();
                            frameLayout2.addView(f1Var);
                            linearLayout.addView(frameLayout2);
                            z14 = z16;
                            linearLayout.addView(new org.telegram.ui.ActionBar.k1(me1Var2.getContext(), f6Var), w7.y5.n(-1, 8));
                            frameLayout2.setOnClickListener(new ge1(G));
                            messageObject3 = messageObject2;
                            bfVar = bfVar2;
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            he1 he1Var = new he1(me1Var2, hi0Var, znVar, a2, linearLayout, G, J);
                            G = G;
                            me1Var = me1Var2;
                            hi0Var.setOnClickListener(he1Var);
                            linearLayout.addView(a2, w7.y5.n(-1, -2));
                            J.q(linearLayout);
                            G.q(frameLayout);
                            G.k();
                            arrayList3 = arrayList6;
                        }
                        messageObject4 = messageObject3;
                        i11 = 0;
                        while (i11 < size) {
                        }
                        G.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                        G.Q(cVar, eh.b.k(f6Var), false);
                        G.Y();
                        ViewGroup viewGroup32 = G.A;
                        me1Var.S = viewGroup32;
                        viewGroup32.setPivotX(0.0f);
                        me1Var.S.setPivotY(0.0f);
                        ViewGroup viewGroup42 = me1Var.S;
                        FrameLayout.LayoutParams e7 = w7.y5.e(-2, -2, 51);
                        je1 je1Var62 = me1Var.d;
                        je1Var62.addView(viewGroup42, e7);
                        viewGroup = me1Var.S;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z14) {
                        }
                        me1Var.e();
                        me1Var.c0 = new wm(this, 5);
                        me1Var.show();
                        return true;
                    }
                }
                z13 = false;
                TLRPC.User user32 = znVar2.f;
                if (user32 == null) {
                }
                org.telegram.ui.Components.v70 G2 = org.telegram.ui.Components.v70.G(me1Var2.c, znVar2.getResourceProvider(), null, !z10 || z12);
                if (z12) {
                }
                messageObject4 = messageObject3;
                i11 = 0;
                while (i11 < size) {
                }
                G2.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                G2.Q(cVar, eh.b.k(f6Var), false);
                G2.Y();
                ViewGroup viewGroup322 = G2.A;
                me1Var.S = viewGroup322;
                viewGroup322.setPivotX(0.0f);
                me1Var.S.setPivotY(0.0f);
                ViewGroup viewGroup422 = me1Var.S;
                FrameLayout.LayoutParams e72 = w7.y5.e(-2, -2, 51);
                je1 je1Var622 = me1Var.d;
                je1Var622.addView(viewGroup422, e72);
                viewGroup = me1Var.S;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z14) {
                }
                me1Var.e();
                me1Var.c0 = new wm(this, 5);
                me1Var.show();
                return true;
            }
        }
        i10 = 51;
        F.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
        dh.e k102 = eh.b.k(f6Var);
        ah.c cVar2 = me1Var2.F;
        F.Q(cVar2, k102, false);
        F.Y();
        ViewGroup viewGroup22 = F.A;
        me1Var2.Q = viewGroup22;
        viewGroup22.setPivotX(0.0f);
        me1Var2.Q.setPivotY(0.0f);
        je1Var3.addView(me1Var2.Q, w7.y5.e(-2, -2, i10));
        ArrayList arrayList42 = new ArrayList();
        ArrayList arrayList52 = new ArrayList();
        ArrayList arrayList62 = new ArrayList();
        znVar2.n8(messageObject, arrayList42, arrayList52, arrayList62);
        bf bfVar22 = new bf(znVar2, 7);
        messageObject2 = me1Var2.G;
        List<TLRPC.TL_availableReaction> enabledReactionsList2 = znVar2.getMediaDataController().getEnabledReactionsList();
        if (znVar2.v()) {
        }
        if (messageObject2.isForwardedChannelPost()) {
        }
        boolean z162 = z11;
        if (!z10) {
        }
        if (znVar2.e != null) {
            int i182 = ((-znVar2.e.linked_monoforum_id) > messageObject2.getFromChatId() ? 1 : ((-znVar2.e.linked_monoforum_id) == messageObject2.getFromChatId() ? 0 : -1));
        }
        if (!z10) {
            user2 = znVar2.f;
            if (!user2.bot) {
                z13 = true;
                TLRPC.User user322 = znVar2.f;
                if (user322 == null) {
                }
                org.telegram.ui.Components.v70 G22 = org.telegram.ui.Components.v70.G(me1Var2.c, znVar2.getResourceProvider(), null, !z10 || z12);
                if (z12) {
                }
                messageObject4 = messageObject3;
                i11 = 0;
                while (i11 < size) {
                }
                G22.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                G22.Q(cVar2, eh.b.k(f6Var), false);
                G22.Y();
                ViewGroup viewGroup3222 = G22.A;
                me1Var.S = viewGroup3222;
                viewGroup3222.setPivotX(0.0f);
                me1Var.S.setPivotY(0.0f);
                ViewGroup viewGroup4222 = me1Var.S;
                FrameLayout.LayoutParams e722 = w7.y5.e(-2, -2, 51);
                je1 je1Var6222 = me1Var.d;
                je1Var6222.addView(viewGroup4222, e722);
                viewGroup = me1Var.S;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z14) {
                }
                me1Var.e();
                me1Var.c0 = new wm(this, 5);
                me1Var.show();
                return true;
            }
        }
        z13 = false;
        TLRPC.User user3222 = znVar2.f;
        if (user3222 == null) {
        }
        org.telegram.ui.Components.v70 G222 = org.telegram.ui.Components.v70.G(me1Var2.c, znVar2.getResourceProvider(), null, !z10 || z12);
        if (z12) {
        }
        messageObject4 = messageObject3;
        i11 = 0;
        while (i11 < size) {
        }
        G222.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
        G222.Q(cVar2, eh.b.k(f6Var), false);
        G222.Y();
        ViewGroup viewGroup32222 = G222.A;
        me1Var.S = viewGroup32222;
        viewGroup32222.setPivotX(0.0f);
        me1Var.S.setPivotY(0.0f);
        ViewGroup viewGroup42222 = me1Var.S;
        FrameLayout.LayoutParams e7222 = w7.y5.e(-2, -2, 51);
        je1 je1Var62222 = me1Var.d;
        je1Var62222.addView(viewGroup42222, e7222);
        viewGroup = me1Var.S;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
        }
        if (z14) {
        }
        me1Var.e();
        me1Var.c0 = new wm(this, 5);
        me1Var.show();
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
        org.telegram.ui.ActionBar.f6 f6Var;
        TLRPC.User currentUser = u1Var.getCurrentUser();
        zn znVar = this.a;
        znVar.getUserConfig().getCurrentUser();
        if (!AndroidUtilities.isContextSafe(znVar.getParentActivity()) || (chat = znVar.e) == null || currentUser == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
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
                z10 = channelParticipant.promoted_by == znVar.getUserConfig().getClientUserId();
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
                    z11 = channelParticipant2.promoted_by == znVar.getUserConfig().getClientUserId();
                } else {
                    z11 = false;
                    z13 = false;
                }
                str2 = channelParticipant2.rank;
                z12 = z11;
                boolean z15 = z13;
                boolean z16 = z14;
                Activity parentActivity = znVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                long j3 = -znVar.e.id;
                f6Var = ((org.telegram.ui.ActionBar.n2) znVar).resourceProvider;
                org.telegram.ui.Components.m01.b(parentActivity, i10, j3, currentUser, str2, z15, z16, z12, f6Var);
            }
            if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                if (ChatObject.isChannel(znVar.e)) {
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                    znVar.getMessagesController();
                    tL_channels_getParticipant.channel = MessagesController.getInputChannel(znVar.e);
                    tL_channels_getParticipant.participant = znVar.getMessagesController().getInputPeer(currentUser.id);
                    znVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new org.telegram.messenger.a(), new ai.m0(7, this, u1Var));
                    return;
                }
                return;
            }
            if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                z10 = false;
                z14 = true;
            } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                z10 = ((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == znVar.getUserConfig().getClientUserId();
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
        Activity parentActivity2 = znVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
        long j32 = -znVar.e.id;
        f6Var = ((org.telegram.ui.ActionBar.n2) znVar).resourceProvider;
        org.telegram.ui.Components.m01.b(parentActivity2, i10, j32, currentUser, str2, z152, z162, z12, f6Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void d0(int i10) {
        int i11;
        SpannableStringBuilder replaceTags;
        int i12;
        int i13 = 3;
        int i14 = 2;
        int i15 = 1;
        zn znVar = this.a;
        try {
            if (i10 == 0) {
                znVar.h7();
                gl glVar = znVar.z3;
                if (glVar == null) {
                    return;
                }
                glVar.l(0L, 84, null, new wm(this, i15));
                znVar.z3.performHapticFeedback(3, 2);
                return;
            }
            if (i10 == 1) {
                String formatDateTime = LocaleController.formatDateTime(znVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                if (znVar.getMessagesController().transcribeAudioTrialCooldownUntil > 0) {
                    i12 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeftUntil", org.telegram.ui.Components.s31.h(i12), formatDateTime));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeft", org.telegram.ui.Components.s31.h(i11), new Object[0]));
                }
                org.telegram.ui.Components.xc.a0(znVar).G(R.raw.transcribe, 6, replaceTags).k(true);
                znVar.fragmentView.performHapticFeedback(3, 2);
                return;
            }
            if (i10 == 2 || i10 == 3) {
                String formatDateTime2 = LocaleController.formatDateTime(znVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(znVar);
                int i16 = R.raw.transcribe;
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialEnd", znVar.getMessagesController().transcribeAudioTrialWeeklyNumber, new Object[0]))).append((CharSequence) " ").append(i10 == 2 ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TranscriptionTrialEndBuy), new wm(this, i14)) : znVar.getMessagesController().transcribeAudioTrialCooldownUntil <= 0 ? "" : AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TranscriptionTrialEndWaitOrBuy, formatDateTime2), new wm(this, i13)));
                a02.getClass();
                org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(a02.W(), a02.c);
                xbVar.c(i16, 36, 36, new String[0]);
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
                xbVar.b.setText(append);
                xbVar.b.setSingleLine(false);
                xbVar.b.setMaxLines(6);
                a02.b(xbVar, 7000).k(true);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean d1(int i10, org.telegram.ui.Cells.u1 u1Var) {
        zn znVar = this.a;
        return znVar.vb != 0 && u1Var.getMessageObject() != null && znVar.vb == u1Var.getMessageObject().getId() && znVar.wb == i10;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean e() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z10;
        zn znVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
        if (kVar == null) {
            return false;
        }
        kVar2 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
        if (kVar2.s() || znVar.A9()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.n2) znVar).inPreviewMode;
        return !z10;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean e0() {
        return this.a.R3 == 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void e2(org.telegram.ui.Cells.u1 u1Var) {
        TLRPC.Chat chat;
        TLRPC.User currentUser = u1Var.getCurrentUser();
        zn znVar = this.a;
        if (!AndroidUtilities.isContextSafe(znVar.getParentActivity()) || (chat = znVar.e) == null || currentUser == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return;
        }
        d(u1Var, znVar.getMessagesController().getParticipant(znVar.e.id, currentUser.id));
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean f() {
        return false;
    }

    public final void g() {
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        boolean isHuaweiStoreApp = BuildVars.isHuaweiStoreApp();
        zn znVar = this.a;
        if (isHuaweiStoreApp) {
            nf.f.s(znVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            nf.f.s(znVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void g0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        this.a.I7(u1Var, true, false, f7, f10, false, false, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void g2(org.telegram.ui.Cells.u1 u1Var, long j3) {
        Bundle e = v7.j0.e(j3, "user_id");
        org.telegram.ui.ActionBar.n2 n2Var = this.a;
        if (n2Var.getMessagesController().checkCanOpenChat(e, n2Var, u1Var.getMessageObject())) {
            n2Var.presentFragment(new zn(e));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final String h(org.telegram.ui.Cells.u1 u1Var) {
        zn znVar;
        int i10;
        if (u1Var.getMessageObject() == null || (i10 = (znVar = this.a).vb) == 0 || i10 != u1Var.getMessageObject().getId() || znVar.wb != 3) {
            return null;
        }
        return znVar.yb;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void i(org.telegram.ui.Cells.u1 u1Var, bi.f fVar) {
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
    public final int i0(org.telegram.ui.Cells.u1 u1Var) {
        qh.c cVar;
        zn znVar = this.a;
        if (!znVar.vc.f || (cVar = znVar.Bc) == null || cVar.n != u1Var || cVar.a.getWidth() <= 0) {
            return 0;
        }
        return znVar.Bc.a.getHeight();
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean i1(MessageObject messageObject) {
        lm lmVar;
        long dialogId = messageObject.getDialogId();
        zn znVar = this.a;
        return (dialogId == UserObject.REPLY_BOT || ((lmVar = znVar.A0) != null && lmVar.N)) && znVar.R3 != 7;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void j(org.telegram.ui.Cells.u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        int a2 = qh.i.a(messageObject);
        boolean a10 = w7.d0.a(a2, 7);
        zn znVar = this.a;
        if (a10) {
            org.telegram.ui.Components.xc.a0(znVar).Q(R.raw.e_hand_2, 36, qh.i.b(messageObject, a2)).j();
            return;
        }
        if (i10 < 0 && !arrayList.isEmpty()) {
            znVar.getSendMessagesHelper().sendVote(messageObject, arrayList, null);
            u1Var.S0(true);
            return;
        }
        if (znVar.getParentActivity() == null) {
            return;
        }
        if (znVar.n2 == null) {
            org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(5, znVar.getParentActivity(), znVar.ea, false);
            znVar.n2 = i40Var;
            i40Var.setAlpha(0.0f);
            znVar.n2.setVisibility(4);
            int indexOfChild = znVar.X0.indexOfChild(znVar.S);
            if (indexOfChild == -1) {
                return;
            } else {
                znVar.X0.addView(znVar.n2, indexOfChild + 1, w7.y5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
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
                float y3 = ((u1Var.getY() + s1Var.b) - AndroidUtilities.dp(4.0f)) - znVar.s9;
                znVar.q2 = AndroidUtilities.dp(13.3f) + s1Var.a;
                int D = org.telegram.messenger.rk.D(6.0f, s1Var.b, i12);
                znVar.r2 = D;
                if (y3 > 0.0f) {
                    i15 = znVar.q2;
                    i13 = D;
                    f7 = 0.0f;
                    break;
                }
                i16++;
                f7 = y3;
            }
            if (f7 != 0.0f) {
                znVar.x0.w0(0, (int) f7, null);
                znVar.p2 = u1Var;
                return;
            }
            i14 = i15;
        }
        znVar.n2.e(u1Var, Integer.valueOf(i10), i14, i13, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void j0(org.telegram.ui.Cells.u1 u1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        zn znVar = this.a;
        if (znVar.getParentActivity() == null) {
            return;
        }
        if (znVar.X9 == null) {
            uh.i iVar = new uh.i(znVar.getParentActivity());
            znVar.X9 = iVar;
            znVar.X0.addView(iVar, w7.y5.e(-1, -1, 48));
        }
        uh.i iVar2 = znVar.X9;
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
        uh.h hVar = new uh.h(iVar2, u1Var, arrayList4, new u2.j0(6, iVar2, b10));
        hVar.setBounds(0, 0, iVar2.getMeasuredWidth(), iVar2.getMeasuredHeight());
        hVar.setCallback(iVar2);
        if (hashMap.containsKey(b10)) {
            return;
        }
        hashMap.put(b10, hVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void k() {
        g();
    }

    public final void l(org.telegram.ui.Cells.u1 u1Var, boolean z10, boolean z11, boolean z12) {
        MessageObject primaryMessageObject;
        int i10;
        int i11;
        wj wjVar;
        if (u1Var == null || (primaryMessageObject = u1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.forceUpdate = true;
        zn znVar = this.a;
        tj tjVar = znVar.x0;
        if (tjVar != null && (wjVar = znVar.z0) != null && wjVar.y < 0) {
            for (int childCount = tjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = znVar.x0.getChildAt(childCount);
                znVar.x0.getClass();
                i10 = RecyclerView.S(childAt);
                if (i10 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.u1)) {
                        if (childAt instanceof org.telegram.ui.Cells.w0) {
                            i11 = znVar.L8(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = znVar.L8(childAt);
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
                wj wjVar2 = znVar.z0;
                znVar.x0.getClass();
                wjVar2.i1(RecyclerView.S(u1Var), u1Var.getTop() - ((int) znVar.s9), false);
            } else {
                znVar.z0.h1(i10, i11);
            }
        }
        znVar.N0 = z11;
        znVar.rc(primaryMessageObject, false);
        znVar.N0 = false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void l1() {
        zn znVar = this.a;
        znVar.Q7();
        UndoView undoView = znVar.y3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, znVar.T5, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean l2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
        MessageObject messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (u1Var == null || pageBlock == null) {
            return false;
        }
        zn znVar = this.a;
        if (znVar.getParentActivity() == null || (messageObject = u1Var.getMessageObject()) == null || (message = messageObject.messageOwner) == null || messageObject.richLayout == null || (richMessage = message.rich_message) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        messageObject.richLayout.collectMediaBlocks(arrayList);
        int indexOf = arrayList.indexOf(pageBlock);
        if (indexOf < 0) {
            return false;
        }
        PhotoViewer t12 = PhotoViewer.t1();
        t12.J2(null, znVar, null);
        return t12.e2(null, null, null, null, null, null, null, indexOf, new um(znVar, arrayList), null, 0L, 0L, 0L, true, new tm(richMessage, arrayList, messageObject), null);
    }

    public final boolean m() {
        zn znVar = this.a;
        if (UserObject.isUserSelf(znVar.f)) {
            return true;
        }
        TLRPC.Chat chat = znVar.e;
        if (chat != null) {
            return !ChatObject.isChannel(chat) || znVar.e.megagroup;
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean m0() {
        boolean z10;
        zn znVar = this.a;
        if (znVar.A9()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.n2) znVar).inPreviewMode;
        return !z10;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void m2(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject primaryMessageObject = u1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.a.rc(primaryMessageObject, false);
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
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
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
        zn znVar = this.a;
        if (geoPoint != null) {
            if (AndroidUtilities.isMapsInstalled(znVar)) {
                in inVar = new in(3);
                f6Var2 = ((org.telegram.ui.ActionBar.n2) znVar).resourceProvider;
                inVar.setResourceProvider(f6Var2);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = znVar.getMessagesController().getPeer(znVar.a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                tL_messageMediaGeo.geo = messageMedia.geo;
                String str = messageMedia.address;
                if (str == null) {
                    str = (pollAnswer == null || (tL_textWithEntities = pollAnswer.text) == null) ? "" : tL_textWithEntities.text;
                }
                tL_messageMediaGeo.address = str;
                tL_message.media = tL_messageMediaGeo;
                inVar.O0 = false;
                inVar.u0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                znVar.presentFragment(inVar);
                return;
            }
            return;
        }
        if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
            st.q().w(znVar.getParentActivity());
            st.q().v(new jn(this, tL_messageMediaPoll, pollAnswer, u1Var));
            st q6 = st.q();
            TLRPC.Document document4 = messageMedia.document;
            int i18 = MessageObject.isAnimatedEmoji(document4) ? 2 : 0;
            MessageObject messageObject2 = u1Var.getMessageObject();
            f6Var = ((org.telegram.ui.ActionBar.n2) znVar).resourceProvider;
            q6.t(document4, null, "", null, null, i18, false, messageObject2, f6Var, 200);
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
            TLRPC.TL_message C7 = zn.C7(message);
            C7.media = messageMedia;
            C7.attachPath = qh.f.c(message, i10);
            ArrayList<MessageObject> arrayList = new ArrayList<>();
            i17 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
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
            i15 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
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
            TLRPC.TL_message C72 = zn.C7(message2);
            C72.media = messageMedia;
            C72.attachPath = qh.f.c(message2, i10);
            i16 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
            kn knVar = new kn(i16, C72, false, true);
            if (MessageObject.canPreviewDocument(messageMedia.document)) {
                PhotoViewer.t1().J2(null, znVar, znVar.ea);
                PhotoViewer t12 = PhotoViewer.t1();
                int i19 = knVar.type;
                t12.c2(knVar, znVar, i19 != 0 ? znVar.T5 : 0L, i19 != 0 ? znVar.L6 : 0L, i19 != 0 ? znVar.d() : 0L, znVar.Fa);
                return;
            }
            try {
                AndroidUtilities.openForView(knVar, znVar.getParentActivity(), znVar.ea, false);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                znVar.z6(knVar);
                return;
            }
        }
        TLRPC.Message message3 = messageObject.messageOwner;
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
        if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || MessageObject.isVideoDocument(document3))) {
            i11 = messageMedia3 == messageMedia ? arrayList3.size() : -1;
            TLRPC.TL_message C73 = zn.C7(message3);
            C73.media = messageMedia3;
            C73.attachPath = qh.f.c(message3, -2);
            i14 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
            arrayList3.add(new bn(i14, C73, false, true));
            arrayList2.add(-2);
        } else {
            i11 = -1;
        }
        if (messageObject.expandedExplanation && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || MessageObject.isVideoDocument(document2))) {
            if (messageMedia2 == messageMedia) {
                i11 = arrayList3.size();
            }
            TLRPC.TL_message C74 = zn.C7(message3);
            C74.media = messageMedia2;
            C74.attachPath = qh.f.c(message3, -3);
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            C74.message = pollResults2.solution;
            C74.entities = pollResults2.solution_entities;
            i13 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
            arrayList3.add(new cn(i13, C74, false, true));
            arrayList2.add(-3);
        }
        zf.d.b(tL_messageMediaPoll.poll, znVar.getUserConfig().getClientUserId());
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
                TLRPC.TL_message C75 = zn.C7(message3);
                C75.media = messageMedia4;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                C75.message = tL_textWithEntities2.text;
                C75.entities = tL_textWithEntities2.entities;
                C75.attachPath = qh.f.c(message3, pollAnswer2.unshuffled_index);
                i12 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                arrayList3.add(new dn(i12, C75, false, true));
                arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
            }
        }
        if (i11 <= -1 || arrayList3.isEmpty()) {
            return;
        }
        messageObject.pollMediaMapping = arrayList2;
        PhotoViewer.t1().J2(null, znVar, znVar.ea);
        PhotoViewer.t1().a2(arrayList3, i11, znVar.a(), 0L, 0L, znVar.Ga);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void n1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        zn znVar = this.a;
        if (znVar.z9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        if (znVar.getParentActivity() != null) {
            if (znVar.O0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                lk lkVar = znVar.Y;
                MessageObject messageObject = u1Var.getMessageObject();
                MessageObject messageObject2 = u1Var.getMessageObject();
                yi yiVar = null;
                String str = tL_inlineButtonTypeUrl != null ? tL_inlineButtonTypeUrl.url : null;
                nf.e eVar = znVar.zb;
                if (eVar != null) {
                    eVar.a(true);
                    znVar.zb = null;
                }
                if (str == null || u1Var.getMessageObject() == null) {
                    znVar.zb = null;
                } else {
                    yi yiVar2 = new yi(znVar, u1Var.getMessageObject().getId(), str, u1Var, 1);
                    znVar.zb = yiVar2;
                    yiVar = yiVar2;
                }
                lkVar.c0(keyboardButtonProto, messageObject, messageObject2, yiVar);
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void o(org.telegram.ui.Cells.u1 u1Var) {
        if (u1Var.getMessageObject().isImportedForward()) {
            l1();
            return;
        }
        zn znVar = this.a;
        if (znVar.l3 || znVar.x0 == null || znVar.getParentActivity() == null || znVar.fragmentView == null) {
            return;
        }
        if (znVar.u2 == null) {
            rm rmVar = znVar.X0;
            int indexOfChild = rmVar.indexOfChild(znVar.S);
            if (indexOfChild == -1) {
                return;
            }
            org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(1, znVar.getParentActivity(), znVar.ea, false);
            znVar.u2 = i40Var;
            rmVar.addView(i40Var, indexOfChild + 1, w7.y5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            znVar.u2.setAlpha(0.0f);
            znVar.u2.setVisibility(4);
        }
        znVar.u2.e(u1Var, null, 0, 0, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void o0(String str) {
        zn znVar = this.a;
        qk qkVar = znVar.O0;
        if (qkVar == null || qkVar.getVisibility() != 0) {
            pk pkVar = znVar.R;
            if ((pkVar == null || pkVar.getVisibility() != 0) && znVar.Y != null && str != null && str.length() > 0) {
                znVar.Y.setFieldText("@" + str + " ");
                znVar.Y.H0();
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void p() {
        this.a.X0.getClass();
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean p0(org.telegram.ui.Components.y5 y5Var) {
        TLRPC.InputStickerSet inputStickerSet;
        int i10;
        zn znVar = this.a;
        if (znVar.getMessagesController().premiumFeaturesBlocked() || y5Var == null || y5Var.standard) {
            return false;
        }
        long documentId = y5Var.getDocumentId();
        TLRPC.Document document = y5Var.document;
        if (document == null) {
            i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
            document = org.telegram.ui.Components.p5.f(i10, documentId);
        }
        if (document == null || (inputStickerSet = MessageObject.getInputStickerSet(document)) == null) {
            return false;
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, true);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(inputStickerSet);
        org.telegram.ui.Components.tv tvVar = new org.telegram.ui.Components.tv(znVar, znVar.getParentActivity(), znVar.ea, arrayList);
        org.telegram.ui.Components.jv jvVar = tvVar.f;
        jvVar.getClass();
        ImageReceiver imageReceiver = new ImageReceiver(jvVar);
        jvVar.v = imageReceiver;
        if (jvVar.d) {
            imageReceiver.onAttachedToWindow();
        }
        jvVar.w = true;
        jvVar.x.d(1.0f, true);
        jvVar.v.setImage(ImageLocation.getForDocument(document), "140_140", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "140_140", DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.m6, 0.2f, true), 0L, null, null, 0);
        jvVar.v.setLayerNum(7);
        jvVar.v.setAllowStartLottieAnimation(true);
        jvVar.v.setAllowStartAnimation(true);
        jvVar.v.setAutoRepeat(1);
        jvVar.v.setAllowDecodeSingleFrame(true);
        jvVar.v.setParentView(jvVar);
        tvVar.setCalcMandatoryInsets(znVar.x9());
        znVar.showDialog(tvVar);
        return true;
    }

    public final void q(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, boolean z10) {
        zn znVar = this.a;
        TLRPC.Chat chat2 = znVar.e;
        if (chat2 != null && chat.id == chat2.id) {
            oj ojVar = znVar.a1;
            if (ojVar != null && i10 == 0) {
                ojVar.e(false, false);
                return;
            } else {
                if (u1Var.getMessageObject() != null) {
                    znVar.F(i10, u1Var.getMessageObject().getId(), 0, 0, true, false);
                    return;
                }
                return;
            }
        }
        if (chat2 == null || chat.id != chat2.id || znVar.F9()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            zi ziVar = null;
            if (z10) {
                nf.e eVar = znVar.zb;
                if (eVar != null) {
                    eVar.a(true);
                    znVar.zb = null;
                }
                if (u1Var.getMessageObject() == null) {
                    znVar.zb = null;
                } else {
                    zi ziVar2 = new zi(znVar, u1Var.getMessageObject().getId(), u1Var, 0);
                    znVar.zb = ziVar2;
                    ziVar = ziVar2;
                }
            }
            if (znVar.getMessagesController().checkCanOpenChat(bundle, znVar, u1Var.getMessageObject(), ziVar)) {
                zn znVar2 = new zn(bundle);
                if (ziVar == null || i10 == 0) {
                    znVar.presentFragment(znVar2);
                } else {
                    AndroidUtilities.runOnUIThread(new ei.l3(this, ziVar, chat, i10, znVar2, 17), 5000L);
                    ziVar.d();
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void q1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
        if (u1Var == null || document == null) {
            return;
        }
        zn znVar = this.a;
        if (znVar.getParentLayout() == null || !a0(u1Var)) {
            return;
        }
        org.telegram.ui.Components.v70 H = org.telegram.ui.Components.v70.H(znVar, u1Var);
        H.c(R.drawable.msg_download, LocaleController.getString(R.string.SaveToDownloads), new q1(this, u1Var, document, 24), false);
        H.t = false;
        H.Z();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void q2() {
        this.a.r9();
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
        zn znVar = this.a;
        if (znVar.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.l31 l31Var = znVar.R1;
        if (l31Var != null && znVar.d4 == 0 && (u1Var.T7 || u1Var.U7)) {
            l31Var.m(u1Var.getMessageObject().getTopicId(), true);
            return;
        }
        if (znVar.getMessagesController().isFrozen()) {
            i13 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
            b.b(i13);
            return;
        }
        lk lkVar = znVar.Y;
        if (lkVar != null) {
            lkVar.P();
        }
        MessageObject messageObject = u1Var.getMessageObject();
        int i14 = znVar.R3;
        if (i14 == 2) {
            znVar.V8.R0(messageObject.getId());
            znVar.finishFragment();
            return;
        }
        if (i14 == 3 || ((i14 == 7 && znVar.O3 == 2) || !((!UserObject.isReplyUser(znVar.f) && !UserObject.isUserSelf(znVar.f)) || (messageFwdHeader = messageObject.messageOwner.fwd_from) == null || messageFwdHeader.saved_from_peer == null))) {
            if (UserObject.isReplyUser(znVar.f) && (messageReplyHeader = (message = messageObject.messageOwner).reply_to) != null && (i10 = messageReplyHeader.reply_to_top_id) != 0) {
                znVar.aa(messageReplyHeader.reply_to_peer_id.channel_id, null, i10, 0L, -1, message.fwd_from.saved_from_msg_id, messageObject);
                return;
            } else if (znVar.R3 == 7 && znVar.O3 == 2) {
                znVar.fa(messageObject);
                return;
            } else {
                znVar.ga(messageObject);
                return;
            }
        }
        ArrayList<MessageObject> arrayList = (messageObject.getGroupId() == 0 || (groupedMessages = (MessageObject.GroupedMessages) znVar.x6.f(messageObject.getGroupId())) == null) ? null : groupedMessages.messages;
        if (arrayList == null) {
            arrayList = org.telegram.messenger.l0.j(messageObject);
        }
        if (znVar.getMessagesController().storiesEnabled() && !messageObject.isSponsored() && (((message2 = messageObject.messageOwner) == null || !message2.noforwards) && (i12 = messageObject.type) != 17 && i12 != 12)) {
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
                znVar.showDialog(new fn(this, znVar.getParentActivity(), znVar, arrayList, ChatObject.isChannel(znVar.e), z10, znVar.ea, z10, messageObject));
                Activity parentActivity = znVar.getParentActivity();
                i11 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
                znVar.fragmentView.requestLayout();
            }
        }
        z10 = false;
        znVar.showDialog(new fn(this, znVar.getParentActivity(), znVar, arrayList, ChatObject.isChannel(znVar.e), z10, znVar.ea, z10, messageObject));
        Activity parentActivity2 = znVar.getParentActivity();
        i11 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
        AndroidUtilities.setAdjustResizeToNothing(parentActivity2, i11);
        znVar.fragmentView.requestLayout();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void r0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        zn znVar = this.a;
        znVar.I7(u1Var, false, false, f7, f10, true, false, false);
        znVar.x0.getClass();
        zn.c2(znVar, RecyclerView.S(u1Var));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void s() {
        this.a.Yb();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void t(org.telegram.ui.Cells.u1 u1Var) {
        int i10;
        int i11;
        wj wjVar;
        MessageObject primaryMessageObject = u1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        primaryMessageObject.factCheckExpanded = !primaryMessageObject.factCheckExpanded;
        primaryMessageObject.forceUpdate = true;
        zn znVar = this.a;
        tj tjVar = znVar.x0;
        if (tjVar != null && (wjVar = znVar.z0) != null && wjVar.y < 0) {
            for (int childCount = tjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = znVar.x0.getChildAt(childCount);
                znVar.x0.getClass();
                i10 = RecyclerView.S(childAt);
                if (i10 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.u1)) {
                        if (childAt instanceof org.telegram.ui.Cells.w0) {
                            i11 = znVar.L8(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = znVar.L8(childAt);
                            break;
                        }
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        znVar.rc(primaryMessageObject, false);
        ci.f4 f4Var = znVar.A1;
        if (f4Var != null) {
            f4Var.e(true);
        }
        if (i10 < 0 || u1Var.getCurrentMessagesGroup() != null) {
            return;
        }
        znVar.z0.h1(i10, i11);
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
        zn znVar = this.a;
        znVar.aa(znVar.e.id, messageObject, messageObject.getId(), j10, i10, 0, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void u0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
        boolean z10 = true;
        if (kVar.s() || znVar.A9()) {
            zn.b2(znVar, u1Var, true, f7, f10);
            return;
        }
        if (u1Var.getMessageObject() != null && u1Var.getMessageObject().isSponsored()) {
            Q0(10, u1Var);
            return;
        }
        if (!ChatObject.isForum(znVar.e) && !znVar.F9()) {
            z10 = false;
        }
        y(user, z10);
    }

    public final void v(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            org.telegram.ui.ActionBar.n2 n2Var = this.a;
            if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var, u1Var.getMessageObject())) {
                n2Var.presentFragment(new zn(bundle));
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void v1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        uh.h hVar;
        uh.i iVar = this.a.X9;
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

    @Override // org.telegram.ui.Cells.l1
    public final boolean v2(int i10) {
        boolean z10;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        if (i10 != 16 && i10 != R.id.acc_action_small_button && i10 != R.id.acc_action_msg_options) {
            return false;
        }
        zn znVar = this.a;
        z10 = ((org.telegram.ui.ActionBar.n2) znVar).inPreviewMode;
        if (!z10 || !znVar.J9) {
            return !e();
        }
        d5Var = ((org.telegram.ui.ActionBar.n2) znVar).parentLayout;
        if (d5Var != null) {
            d5Var2 = ((org.telegram.ui.ActionBar.n2) znVar).parentLayout;
            ((ActionBarLayout) d5Var2).r();
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final String w(long j3) {
        TLRPC.Peer peer;
        String adminRank;
        zn znVar = this.a;
        if (UserObject.isBotForum(znVar.f)) {
            return null;
        }
        TLRPC.Chat chat = znVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat) && (adminRank = znVar.getMessagesController().getAdminRank(znVar.e.id, j3)) != null) {
            return adminRank;
        }
        TLRPC.TL_forumTopic tL_forumTopic = znVar.c4;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || !(peer.user_id == j3 || peer.channel_id == j3 || peer.chat_id == j3)) {
            return null;
        }
        return LocaleController.getString(R.string.TopicCreator);
    }

    /* JADX WARN: Code restructure failed: missing block: B:275:0x0b06, code lost:
    
        if (r0.exists() != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0bd0, code lost:
    
        if (r4.startsWith("text/x-web-markdown") == false) goto L319;
     */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0c17 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:328:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10, boolean z10) {
        int i10;
        MessageObject messageObject;
        int i11;
        int i12;
        MessageObject messageObject2;
        zn znVar;
        long j3;
        long j10;
        File file;
        TLRPC.Chat chat;
        dv0 E;
        float f11;
        char c10;
        dv0 dv0Var;
        MessageObject messageObject3;
        ImageLocation imageLocation;
        BitmapDrawable bitmapDrawable;
        MessageObject messageObject4;
        MessageObject messageObject5;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        int i13;
        MessageObject messageObject6 = u1Var.getMessageObject();
        int i14 = messageObject6.type;
        zn znVar2 = this.a;
        if (i14 == 23) {
            TLRPC.MessageMedia messageMedia2 = messageObject6.messageOwner.media;
            TL_stories.StoryItem storyItem = messageMedia2.storyItem;
            if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                return;
            }
            storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia2.peer);
            storyItem.messageId = messageObject6.getId();
            storyItem.messageType = 2;
            ai.ia.b(storyItem, znVar2.f);
            znVar2.getOrCreateStoryViewer().F(znVar2.getParentActivity(), messageObject6.messageOwner.media.storyItem, ai.u9.a(znVar2.x0));
            return;
        }
        int i15 = 1;
        if (messageObject6.isVideo()) {
            i13 = ((org.telegram.ui.ActionBar.n2) znVar2).currentAccount;
            if (DownloadController.getInstance(i13).canDownloadMedia(messageObject6.messageOwner) == 1) {
                messageObject6.putInDownloadsStore = true;
            }
        } else {
            messageObject6.putInDownloadsStore = true;
        }
        if (messageObject6.isSendError()) {
            znVar2.I7(u1Var, false, false, f7, f10, true, false, false);
            return;
        }
        if (messageObject6.isSending()) {
            return;
        }
        int i16 = 0;
        if (z10 && (message = messageObject6.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && !TextUtils.isEmpty(webPage.url)) {
            String str = messageObject6.messageOwner.media.webpage.url;
            AndroidUtilities.getHostAuthority(str);
            if (znVar2.ea(str, u1Var, null, messageObject6.getId(), 2)) {
                return;
            }
            nf.e eVar = znVar2.zb;
            if (eVar != null) {
                eVar.a(true);
            }
            znVar2.zb = u1Var.getMessageObject() != null ? new en(this, u1Var, i16) : null;
            nf.f.r(znVar2.getParentActivity(), Uri.parse(str), true, false, false, znVar2.zb, null, false, true, false);
            return;
        }
        int i17 = 4;
        if (messageObject6.isDice()) {
            xm xmVar = new xm(this, messageObject6, i16);
            if (messageObject6.isStakeableDice()) {
                znVar2.getMessagesController().loadStakeDiceInfo(new y(this, messageObject6, xmVar, i17));
                return;
            } else {
                xmVar.run();
                return;
            }
        }
        if ((messageObject6.isAnimatedEmoji() && (!messageObject6.isAnimatedAnimatedEmoji() || (znVar2.xa.e.containsKey(gz.q(MessageObject.findAnimatedEmojiEmoticon(messageObject6.getDocument()))) && znVar2.f != null))) || messageObject6.isPremiumSticker()) {
            znVar2.Na(u1Var);
            znVar2.xa.l(u1Var, znVar2, true);
            znVar2.x0.J0(false);
            return;
        }
        int i18 = 6;
        if (messageObject6.needDrawBluredPreview()) {
            ue fb2 = znVar2.fb(messageObject6, false);
            a3.h0 O4 = zn.O4(znVar2, messageObject6);
            u1Var.invalidate();
            final SecretMediaViewer f12 = SecretMediaViewer.f();
            final Activity parentActivity = znVar2.getParentActivity();
            int i19 = UserConfig.selectedAccount;
            f12.a = i19;
            ImageReceiver imageReceiver = f12.h;
            imageReceiver.setCurrentAccount(i19);
            if (f12.b != parentActivity) {
                f12.b = parentActivity;
                f12.g1 = new org.telegram.ui.Components.zm0(parentActivity, null);
                j0 j0Var = new j0(f12, parentActivity, 20);
                f12.d = j0Var;
                j0Var.setBackgroundDrawable(f12.l0);
                f12.d.setFocusable(true);
                f12.d.setFocusableInTouchMode(true);
                f12.d.setClipChildren(false);
                f12.d.setClipToPadding(false);
                f12.e = new ci.n6(f12, parentActivity);
                View view = new View(parentActivity);
                f12.f = view;
                view.setBackgroundColor(2130706432);
                f12.e.addView(f12.f, w7.y5.e(-1, -2, 80));
                f12.e.setFocusable(false);
                f12.d.addView(f12.e);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f12.e.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                layoutParams.gravity = 51;
                f12.e.setLayoutParams(layoutParams);
                f12.e.setFitsSystemWindows(true);
                f12.e.setOnApplyWindowInsetsListener(new y41(f12, 0));
                f12.e.setSystemUiVisibility(1792);
                GestureDetector gestureDetector = new GestureDetector(f12.e.getContext(), f12);
                f12.L0 = gestureDetector;
                gestureDetector.setOnDoubleTapListener(f12);
                org.telegram.ui.Components.x7 x7Var = new org.telegram.ui.Components.x7(f12, parentActivity, i18);
                f12.F = x7Var;
                x7Var.setTitleColor(-1);
                f12.F.setSubtitleColor(-1);
                f12.F.setBackgroundColor(2130706432);
                f12.F.setOccupyStatusBar(true);
                f12.F.A(1090519039, false);
                f12.F.B(-1, false);
                f12.F.setBackButtonImage(R.drawable.ic_ab_back);
                f12.F.setTitleRightMargin(AndroidUtilities.dp(70.0f));
                f12.e.addView(f12.F, w7.y5.c(-2.0f, -1));
                f12.F.setActionBarMenuOnItemClick(new v70(f12, 29));
                ci.f4 f4Var = new ci.f4(parentActivity, 1);
                f12.r = f4Var;
                f4Var.l(1.0f, -26.0f);
                f12.r.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                f12.e.addView(f12.r, w7.y5.d(-1, 80.0f, 53, 0.0f, 48.0f, 0.0f, 0.0f));
                e51 e51Var = new e51(f12, parentActivity);
                f12.n = e51Var;
                f12.e.addView(e51Var, w7.y5.d(119, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
                jw0 jw0Var = new jw0(f12, i15);
                f12.U = new f51(f12, parentActivity);
                View view2 = new View(parentActivity);
                f12.T = view2;
                view2.setBackgroundColor(2130706432);
                f12.U.addView(f12.T, w7.y5.e(-1, -1, 119));
                org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(f12.e.getContext());
                f12.S = j5Var;
                j5Var.setTextColor(-1);
                f12.S.setGravity(53);
                f12.S.setTextSize(14);
                f12.S.setImportantForAccessibility(2);
                f12.U.addView(f12.S, w7.y5.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
                s50 s50Var = new s50(f12, parentActivity, 8);
                f12.R = s50Var;
                org.telegram.ui.Components.v71 v71Var = new org.telegram.ui.Components.v71(s50Var);
                f12.Q = v71Var;
                v71Var.z = AndroidUtilities.dp(2.0f);
                org.telegram.ui.Components.v71 v71Var2 = f12.Q;
                v71Var2.k = 872415231;
                v71Var2.l = 872415231;
                v71Var2.m = -1;
                v71Var2.n = -1;
                v71Var2.A = 1509949439;
                v71Var2.j = jw0Var;
                f12.U.addView(f12.R);
                f12.e.addView(f12.U, w7.y5.e(-1, 48, 80));
                ws0 ws0Var = new ws0(null, new ai.d());
                f12.Y = ws0Var;
                ws0Var.k0 = true;
                ws0Var.i0 = false;
                ru0 ru0Var = new ru0(f12.e.getContext());
                f12.Z = ru0Var;
                ru0Var.setFactory(new ViewSwitcher.ViewFactory() { // from class: org.telegram.ui.z41
                    @Override // android.widget.ViewSwitcher.ViewFactory
                    public final View makeView() {
                        SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
                        return new qu0(parentActivity, secretMediaViewer.a0, secretMediaViewer.Y, new b5(secretMediaViewer, 22), new qg0(secretMediaViewer, 2));
                    }
                });
                f12.Z.setVisibility(4);
                if (!f12.w1) {
                    f12.w1 = true;
                    f12.Z.setLayerType(2, null);
                    f12.Z.getCurrentView().setLayerType(2, null);
                    f12.Z.getNextView().setLayerType(2, null);
                }
                ImageView imageView = new ImageView(parentActivity);
                f12.V = imageView;
                imageView.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(64.0f), 1711276032));
                org.telegram.ui.Components.pg0 pg0Var = new org.telegram.ui.Components.pg0(28);
                f12.W = pg0Var;
                pg0Var.setCallback(f12.V);
                f12.V.setImageDrawable(f12.W);
                f12.V.setScaleType(ImageView.ScaleType.CENTER);
                f12.V.setScaleX(0.6f);
                f12.V.setScaleY(0.6f);
                f12.V.setAlpha(0.0f);
                f12.V.setPivotX(AndroidUtilities.dp(32.0f));
                f12.V.setPivotY(AndroidUtilities.dp(32.0f));
                f12.e.addView(f12.V, w7.y5.e(64, 64, 17));
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
                f12.c = layoutParams2;
                layoutParams2.height = -1;
                layoutParams2.format = -3;
                layoutParams2.width = -1;
                layoutParams2.gravity = 48;
                layoutParams2.type = 99;
                layoutParams2.flags = -2147409656;
                AndroidUtilities.logFlagSecure();
                imageReceiver.setParentView(f12.e);
                imageReceiver.setForceCrossfade(true);
                org.telegram.ui.Cells.da o9 = f12.Y.o(f12.d.getContext());
                if (o9 != null) {
                    AndroidUtilities.removeFromParent(o9);
                    f12.e.addView(o9);
                }
                f12.Y.T(f12.e);
                f12.Y.j0 = true;
            }
            SecretMediaViewer f13 = SecretMediaViewer.f();
            nl nlVar = znVar2.Fa;
            SecretMediaViewer.PhotoBackgroundDrawable photoBackgroundDrawable = f13.l0;
            ImageReceiver imageReceiver2 = f13.h;
            if (f13.b == null || !messageObject6.needDrawBluredPreview() || nlVar == null || (E = nlVar.E(messageObject6, null, 0, true, false)) == null) {
                return;
            }
            f13.q1 = messageObject6.messageOwner.ttl == Integer.MAX_VALUE;
            f13.p1 = O4;
            f13.N = nlVar;
            f13.K = System.currentTimeMillis();
            f13.L = 0L;
            f13.k0 = true;
            f13.j0 = true;
            f13.p0 = false;
            k4 k4Var = f13.w;
            if (k4Var != null) {
                k4Var.setVisibility(4);
            }
            f13.i();
            f13.N0 = 0.0f;
            f13.O0 = 1.0f;
            f13.P0 = 0.0f;
            f13.Q0 = 0.0f;
            f13.R0 = 0.0f;
            f13.S0 = 0.0f;
            f13.T0 = 0.0f;
            f13.U0 = 0.0f;
            f13.Z0 = false;
            f13.a1 = false;
            f13.b1 = false;
            f13.c1 = false;
            f13.d1 = true;
            f13.n(f13.y0);
            photoBackgroundDrawable.setAlpha(0);
            f13.e.setAlpha(1.0f);
            f13.e.setVisibility(0);
            f13.n.setAlpha(1.0f);
            f13.J = false;
            f13.H = false;
            f13.I = false;
            f13.M = true;
            imageReceiver2.setManualAlphaAnimator(false);
            f13.O = 0;
            f13.P = 0;
            RectF rectF = new RectF(E.a.getDrawRegion());
            rectF.left = Math.max(rectF.left, E.a.getImageX());
            rectF.top = Math.max(rectF.top, E.a.getImageY());
            rectF.right = Math.min(rectF.right, E.a.getImageX2());
            rectF.bottom = Math.min(rectF.bottom, E.a.getImageY2());
            float width = rectF.width();
            float height = rectF.height();
            Point point = AndroidUtilities.displaySize;
            f13.y0 = Math.max(width / point.x, height / (point.y + AndroidUtilities.statusBarHeight));
            int[] iArr = E.h;
            if (iArr != null) {
                f13.H0 = new int[iArr.length];
                int i20 = 0;
                while (true) {
                    int[] iArr2 = E.h;
                    if (i20 >= iArr2.length) {
                        break;
                    }
                    f13.H0[i20] = iArr2[i20];
                    i20++;
                }
            } else {
                f13.H0 = null;
            }
            float f14 = E.b;
            float f15 = rectF.left;
            f13.w0 = ((width / 2.0f) + (f14 + f15)) - (r7 / 2);
            f13.x0 = ((height / 2.0f) + (E.c + rectF.top)) - (r6 / 2);
            f13.v0 = Math.abs(f15 - E.a.getImageX());
            int abs = (int) Math.abs(rectF.top - E.a.getImageY());
            E.d.getLocationInWindow(new int[2]);
            float f16 = (r6[1] - (E.c + rectF.top)) + E.j;
            f13.r0 = f16;
            float f17 = abs;
            f13.r0 = Math.max(0.0f, Math.max(f16, f17));
            float height2 = (((E.c + rectF.top) + ((int) height)) - (E.d.getHeight() + r6[1])) + E.i;
            f13.s0 = height2;
            f13.s0 = Math.max(0.0f, Math.max(height2, f17));
            f13.t0 = 0.0f;
            f13.t0 = Math.max(0.0f, Math.max(0.0f, f17));
            f13.u0 = 0.0f;
            f13.u0 = Math.max(0.0f, Math.max(0.0f, f17));
            f13.J0 = System.currentTimeMillis();
            f13.z0 = 0.0f;
            f13.A0 = 0.0f;
            f13.D0 = 0.0f;
            f13.F0 = 0.0f;
            f13.G0 = 0.0f;
            f13.C0 = 0.0f;
            f13.E0 = 0.0f;
            f13.B0 = 1.0f;
            f13.I0 = true;
            f13.e1 = true;
            mb0 mb0Var = f13.l1;
            if (mb0Var != null) {
                mb0Var.destroy();
                f13.l1 = null;
            }
            LaunchActivity launchActivity = LaunchActivity.G1;
            f13.l1 = launchActivity != null ? new mb0(launchActivity, true) : null;
            NotificationCenter.getInstance(f13.a).addObserver(f13, NotificationCenter.messagesDeleted);
            NotificationCenter.getInstance(f13.a).addObserver(f13, NotificationCenter.updateMessageMedia);
            NotificationCenter.getInstance(f13.a).addObserver(f13, NotificationCenter.didCreatedNewDeleteTask);
            f13.v = MessageObject.getPeerId(messageObject6.messageOwner.peer_id);
            f13.h0 = messageObject6;
            TLRPC.Document document = messageObject6.getDocument();
            ImageReceiver.BitmapHolder bitmapHolder = f13.i0;
            if (bitmapHolder != null) {
                bitmapHolder.release();
                f13.i0 = null;
            }
            f13.i0 = E.a.getThumbBitmapSafe();
            f13.U.setVisibility(8);
            if (document != null) {
                int i21 = 0;
                while (true) {
                    if (i21 >= document.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i21);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) documentAttribute;
                        f13.O = tL_documentAttributeVideo.w;
                        f13.P = tL_documentAttributeVideo.h;
                        break;
                    }
                    i21++;
                }
                if (MessageObject.isGifDocument(document)) {
                    f13.F.setTitle(LocaleController.getString(R.string.DisappearingGif));
                    String str2 = messageObject6.messageOwner.attachPath;
                    ImageLocation forDocument = (str2 == null || !messageObject6.attachPathExists) ? ImageLocation.getForDocument(document) : ImageLocation.getForPath(str2);
                    f11 = 0.0f;
                    c10 = 6;
                    dv0Var = E;
                    messageObject5 = messageObject6;
                    imageReceiver2.setImage(forDocument, (String) null, f13.i0 != null ? new BitmapDrawable(f13.i0.bitmap) : null, -1L, (String) null, messageObject5, 1);
                } else {
                    f11 = 0.0f;
                    c10 = 6;
                    dv0Var = E;
                    f13.b0 = 1;
                    f13.F.setTitle(LocaleController.getString(R.string.DisappearingVideo));
                    File file2 = new File(messageObject6.messageOwner.attachPath);
                    if (file2.exists()) {
                        f13.h(file2);
                    } else {
                        File pathToMessage = FileLoader.getInstance(f13.a).getPathToMessage(messageObject6.messageOwner);
                        File file3 = new File(pathToMessage.getAbsolutePath() + ".enc");
                        if (file3.exists()) {
                            pathToMessage = file3;
                        }
                        f13.h(pathToMessage);
                    }
                    f13.J = true;
                    f13.U.setVisibility(0);
                    messageObject5 = messageObject6;
                    imageReceiver2.setImage((ImageLocation) null, (String) null, f13.i0 != null ? new BitmapDrawable(f13.i0.bitmap) : null, -1L, (String) null, messageObject5, 2);
                }
                messageObject4 = messageObject5;
            } else {
                f11 = 0.0f;
                c10 = 6;
                dv0Var = E;
                f13.F.setTitle(LocaleController.getString(R.string.DisappearingPhoto));
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject6.photoThumbs, AndroidUtilities.getPhotoSize());
                ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject6.photoThumbsObject);
                if (f13.i0 != null) {
                    messageObject3 = messageObject6;
                    imageLocation = forObject;
                    bitmapDrawable = new BitmapDrawable(f13.i0.bitmap);
                } else {
                    messageObject3 = messageObject6;
                    imageLocation = forObject;
                    bitmapDrawable = null;
                }
                imageReceiver2.setImage(imageLocation, (String) null, bitmapDrawable, -1L, (String) null, messageObject3, 2);
                messageObject4 = messageObject3;
                if (closestPhotoSizeWithSize != null) {
                    f13.O = closestPhotoSizeWithSize.w;
                    f13.P = closestPhotoSizeWithSize.h;
                }
            }
            f13.j(messageObject4, "", false);
            f13.j(messageObject4, messageObject4.caption, true);
            f13.m(true, false);
            f13.k(false, false);
            f13.W.a(true, true);
            if (f13.q1) {
                e51 e51Var2 = f13.n;
                e51Var2.e = true;
                TextPaint textPaint = e51Var2.r;
                textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
                textPaint.setColor(-1);
                StaticLayout staticLayout = new StaticLayout("1", textPaint, 999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                e51Var2.s = staticLayout;
                e51Var2.v = staticLayout.getLineCount() > 0 ? e51Var2.s.getLineWidth(0) : 0.0f;
                e51Var2.w = e51Var2.s.getHeight();
                e51Var2.invalidate();
                f13.n.setOnClickListener(new h41(f13, 3));
            } else {
                f13.n.setOnClickListener(null);
            }
            try {
                if (f13.d.getParent() != null) {
                    ((WindowManager) f13.b.getSystemService("window")).removeView(f13.d);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            ((WindowManager) f13.b.getSystemService("window")).addView(f13.d, f13.c);
            f13.n.invalidate();
            f13.s = true;
            Window window = f13.b.getWindow();
            f13.o1 = AndroidUtilities.getLightNavigationBar(window);
            AndroidUtilities.setLightNavigationBar(f13.b, false);
            AndroidUtilities.setLightNavigationBar((View) f13.d, false);
            Activity activity = f13.b;
            if (activity instanceof LaunchActivity) {
                f13.n1 = Build.VERSION.SDK_INT >= 26 ? ((LaunchActivity) activity).getWindow().getNavigationBarColor() : 0;
                ((LaunchActivity) f13.b).y(-16777216);
            } else {
                f13.n1 = window.getNavigationBarColor();
                AndroidUtilities.setNavigationBarColor(f13.b, -16777216);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            f13.K0 = animatorSet;
            org.telegram.ui.Components.x7 x7Var2 = f13.F;
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(x7Var2, (Property<org.telegram.ui.Components.x7, Float>) property, 0.0f, 1.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(f13.a0, (Property<bu0, Float>) property, 0.0f, 1.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(f13.r, (Property<ci.f4, Float>) property, 0.0f, 1.0f);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.r6.d, 0, 255);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(f13, f13.v1, 0.0f, 1.0f);
            f51 f51Var = f13.U;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(f51Var, f51Var.n, 1.0f);
            f51 f51Var2 = f13.U;
            if (f13.J) {
                f11 = 1.0f;
            }
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(f51Var2, (Property<f51, Float>) property, f11);
            Animator[] animatorArr = new Animator[7];
            animatorArr[0] = ofFloat;
            animatorArr[1] = ofFloat2;
            animatorArr[2] = ofFloat3;
            animatorArr[3] = ofInt;
            animatorArr[4] = ofFloat4;
            animatorArr[5] = ofFloat5;
            animatorArr[c10] = ofFloat6;
            animatorSet.playTogether(animatorArr);
            f13.m0 = 3;
            f13.o0 = new rf0(f13, fb2, messageObject4, 26);
            f13.K0.setDuration(250L);
            f13.K0.addListener(new c51(f13, 0));
            f13.n0 = System.currentTimeMillis();
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                f13.e.setLayerType(2, null);
            }
            f13.K0.setInterpolator(new DecelerateInterpolator());
            photoBackgroundDrawable.b = 0;
            photoBackgroundDrawable.a = new rx0(27, f13, dv0Var);
            f13.K0.start();
            return;
        }
        if (MessageObject.isAnimatedEmoji(messageObject6.getDocument()) && MessageObject.getInputStickerSet(messageObject6.getDocument()) != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(MessageObject.getInputStickerSet(messageObject6.getDocument()));
            org.telegram.ui.Components.tv tvVar = new org.telegram.ui.Components.tv(znVar2, znVar2.getParentActivity(), znVar2.ea, arrayList);
            tvVar.setCalcMandatoryInsets(znVar2.x9());
            znVar2.showDialog(tvVar);
            return;
        }
        if (messageObject6.getInputStickerSet() != null) {
            org.telegram.ui.Components.gy0 gy0Var = new org.telegram.ui.Components.gy0(znVar2.getParentActivity(), znVar2, messageObject6.getInputStickerSet(), null, (znVar2.O0.getVisibility() == 0 || !((chat = znVar2.e) == null || ChatObject.canSendStickers(chat))) ? null : znVar2.Y, znVar2.ea);
            gy0Var.setCalcMandatoryInsets(znVar2.x9());
            znVar2.showDialog(gy0Var);
            return;
        }
        if (messageObject6.isVideo() || (i10 = messageObject6.type) == 1 || ((i10 == 0 && !messageObject6.isWebpageDocument()) || messageObject6.isGif())) {
            if (messageObject6.isSponsored()) {
                if (messageObject6.isGif() || messageObject6.isPhoto()) {
                    znVar2.J9(messageObject6, true, false);
                    if (messageObject6.sponsoredUrl != null) {
                        nf.e eVar2 = znVar2.zb;
                        if (eVar2 != null) {
                            eVar2.a(true);
                        }
                        znVar2.zb = u1Var.getMessageObject() != null ? new en(this, u1Var, i15) : null;
                        nf.f.r(znVar2.getParentActivity(), Uri.parse(messageObject6.sponsoredUrl), true, false, false, znVar2.zb, null, false, znVar2.getMessagesController().sponsoredLinksInappAllow, false);
                        return;
                    }
                    return;
                }
                if (messageObject6.isVideo()) {
                    znVar2.J9(messageObject6, true, false);
                }
            }
            if (messageObject6.getDuration() > 0.0d && messageObject6.getVideoStartsTimestamp() > 0 && !messageObject6.openedInViewer) {
                messageObject6.forceSeekTo = (float) (messageObject6.getVideoStartsTimestamp() / messageObject6.getDuration());
            }
            znVar2.ha(u1Var, messageObject6);
            return;
        }
        int i22 = messageObject6.type;
        if (i22 == 3) {
            znVar2.fb(messageObject6, true);
            try {
                String str3 = messageObject6.messageOwner.attachPath;
                File file4 = (str3 == null || str3.length() == 0) ? null : new File(messageObject6.messageOwner.attachPath);
                if (file4 == null || !file4.exists()) {
                    file4 = znVar2.getFileLoader().getPathToMessage(messageObject6.messageOwner);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setFlags(1);
                    intent.setDataAndType(FileProvider.d(znVar2.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", file4), "video/mp4");
                } else {
                    intent.setDataAndType(Uri.fromFile(file4), "video/mp4");
                }
                znVar2.getParentActivity().startActivityForResult(intent, 500);
                return;
            } catch (Exception e7) {
                FileLog.e(e7);
                znVar2.z6(messageObject6);
                return;
            }
        }
        if (i22 == 4) {
            if (AndroidUtilities.isMapsInstalled(znVar2)) {
                if (!messageObject6.isLiveLocation()) {
                    kd0 kd0Var = new kd0(znVar2.h == null ? 3 : 0);
                    kd0Var.F0 = znVar2;
                    kd0Var.u0(messageObject6);
                    znVar2.presentFragment(kd0Var);
                    return;
                }
                TLRPC.Chat chat2 = znVar2.e;
                kd0 kd0Var2 = new kd0((chat2 == null || ChatObject.canSendMessages(chat2) || znVar2.e.megagroup) ? 2 : 6);
                kd0Var2.F0 = znVar2;
                kd0Var2.u0(messageObject6);
                znVar2.presentFragment(kd0Var2);
                return;
            }
            return;
        }
        if (i22 != 9 && i22 != 0) {
            return;
        }
        if (messageObject6.getDocumentName().toLowerCase().endsWith("attheme")) {
            String str4 = messageObject6.messageOwner.attachPath;
            if (str4 != null && str4.length() != 0) {
                file = new File(messageObject6.messageOwner.attachPath);
            }
            file = null;
            if (file == null) {
                File pathToMessage2 = znVar2.getFileLoader().getPathToMessage(messageObject6.messageOwner);
                if (pathToMessage2.exists()) {
                    file = pathToMessage2;
                }
            }
            org.telegram.ui.ActionBar.i6 u10 = org.telegram.ui.ActionBar.j6.u(file, messageObject6.getDocumentName(), null, true);
            if (u10 != null) {
                znVar2.presentFragment(new xd1(u10));
                return;
            }
            znVar2.x4 = -1;
        }
        if (messageObject6.canPreviewDocument()) {
            PhotoViewer.t1().J2(null, znVar2, znVar2.ea);
            PhotoViewer t12 = PhotoViewer.t1();
            int i23 = messageObject6.type;
            long j11 = i23 != 0 ? znVar2.T5 : 0L;
            if (i23 != 0) {
                j10 = 0;
                j3 = znVar2.L6;
            } else {
                j3 = 0;
                j10 = 0;
            }
            if (i23 != 0) {
                j10 = znVar2.d();
            }
            messageObject = messageObject6;
            i11 = 3;
            t12.c2(messageObject, znVar2, j11, j3, j10, znVar2.Fa);
            i12 = 1;
        } else {
            messageObject = messageObject6;
            i11 = 3;
            i12 = 0;
        }
        Pattern pattern = org.telegram.ui.Components.y90.a;
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
            i15 = i12;
            znVar = znVar2;
            messageObject2 = messageObject;
            if (i15 == 0) {
                try {
                    AndroidUtilities.openForView(messageObject2, znVar.getParentActivity(), znVar.ea, false);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    znVar.z6(messageObject2);
                    return;
                }
            }
            return;
        }
        if (znVar2.getParentActivity() != null) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(znVar2.getParentActivity(), i11, znVar2.ea);
            b2Var.setCanceledOnTouchOutside(false);
            boolean[] zArr = {false};
            b2Var.setOnCancelListener(new jh(0, zArr));
            b2Var.q(150L);
            MessageObject messageObject7 = messageObject;
            org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(znVar2, messageObject7, b2Var, zArr, 8);
            messageObject2 = messageObject7;
            znVar = znVar2;
            new Thread(n5Var).start();
            if (i15 == 0) {
            }
        }
        znVar = znVar2;
        messageObject2 = messageObject;
        if (i15 == 0) {
        }
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
    public final boolean x0(MessageObject messageObject) {
        return !this.a.s.containsKey(messageObject);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void x2() {
        zn znVar = this.a;
        if (!znVar.getUserConfig().isPremium()) {
            org.telegram.ui.Components.xc.a0(znVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("UnlockSimilarChannelsPremium", znVar.getMessagesController().recommendedChannelsLimitPremium), new wm(this, 4))).j();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", znVar.T5);
        bundle.putInt("start_from", 10);
        znVar.presentFragment(new org.telegram.ui.Components.ja0(bundle, znVar.a1.getSharedMediaPreloader()));
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
        zn znVar = this.a;
        TLRPC.User user2 = znVar.f;
        if (user2 != null && user2.id == user.id) {
            i11 = 1;
        }
        profileActivity.N4(i11);
        Activity parentActivity = znVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
        AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
        znVar.presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void y2(org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
        MessageObject messageObject;
        TLRPC.TL_factCheck factCheck;
        String str;
        zn znVar = this.a;
        ci.f4 f4Var = znVar.A1;
        if (f4Var != null) {
            f4Var.e(true);
        }
        if (znVar.getParentActivity() == null || (messageObject = u1Var.getMessageObject()) == null || (factCheck = messageObject.getFactCheck()) == null || factCheck.country == null) {
            return;
        }
        try {
            str = new Locale("", factCheck.country).getDisplayCountry(LocaleController.getInstance().getCurrentLocale());
        } catch (Exception e) {
            FileLog.e(e);
            str = factCheck.country;
        }
        ci.f4 f4Var2 = new ci.f4(znVar.getParentActivity(), 3);
        f4Var2.p(true);
        f4Var2.K = Layout.Alignment.ALIGN_NORMAL;
        f4Var2.d = -1L;
        f4Var2.T = true;
        f4Var2.e = true;
        f4Var2.q(12.0f);
        znVar.A1 = f4Var2;
        f4Var2.l0 = new gh(12, this, f4Var2);
        f4Var2.s(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FactCheckToast, str)));
        znVar.X0.addView(znVar.A1, w7.y5.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
        znVar.X0.post(new i2.z(this, u1Var, i11, i10, 4));
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
        this.a.A0.R(messageObject, false, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void z0(org.telegram.ui.Cells.u1 u1Var) {
        qh.c cVar = this.a.Bc;
        if (cVar == null || cVar.n != u1Var) {
            return;
        }
        cVar.w.getClass();
    }

    @Override // org.telegram.ui.Cells.l1
    public final org.telegram.ui.Cells.s9 z2() {
        return this.a.c9;
    }
}
