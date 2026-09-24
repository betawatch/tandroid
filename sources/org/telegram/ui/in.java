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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.SecretMediaViewer;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class in implements org.telegram.ui.Cells.l1 {
    public final /* synthetic */ wn a;

    public in(wn wnVar) {
        this.a = wnVar;
    }

    public static void a(in inVar, org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
        int i10;
        wn wnVar = inVar.a;
        if (wnVar.getParentActivity() == null || document == null) {
            return;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23 && ((i11 <= 28 || BuildVars.NO_SCOPED_STORAGE) && wnVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
            wnVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
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
        i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
        arrayList.add(new MessageObject(i10, tL_message, false, true));
        MediaController.saveFilesFromMessages(wnVar.getParentActivity(), wnVar.getAccountInstance(), arrayList, new ua(inVar, 1));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void A(org.telegram.ui.Cells.u1 u1Var) {
        wn wnVar = this.a;
        if (!wnVar.getMessagesController().showSensitiveContent()) {
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(wnVar.getParentActivity(), 3, null);
            a2Var.q(200L);
            wnVar.getMessagesController().getContentSettings(new z(this, a2Var, u1Var, 6));
        } else {
            if (u1Var.getMessageObject() != null) {
                u1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
            }
            u1Var.h4();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void A0(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject, boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        wn wnVar = this.a;
        if (wnVar.getParentActivity() == null || tLObject == null) {
            return;
        }
        b5Var = ((org.telegram.ui.ActionBar.m2) wnVar).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.m2) wnVar).parentLayout;
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
            wnVar.presentFragment(new wn(bundle));
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, wnVar.getParentActivity(), wnVar.getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(wnVar.getThemedColor(org.telegram.ui.ActionBar.h6.G8));
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(wnVar.getParentActivity(), false, false);
        e1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
        e1Var.setMinimumWidth(160);
        e1Var.setOnClickListener(new a(this, 14));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
        org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(wnVar.getParentActivity(), false, false);
        e1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
        e1Var2.setMinimumWidth(160);
        e1Var2.setOnClickListener(new a0(this, (TLRPC.Chat) tLObject, u1Var, 7));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var2);
        wn wnVar2 = new wn(bundle);
        wnVar2.J9 = true;
        wnVar.presentFragmentAsPreviewWithMenu(wnVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
        wnVar.d7();
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean A1() {
        wn wnVar = this.a;
        return wnVar.X0.getMeasuredWidth() > wnVar.X0.getMeasuredHeight();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void B0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        MessageObject messageObject = u1Var.getMessageObject();
        int i10 = messageObject.type;
        wn wnVar = this.a;
        if (i10 != 16) {
            wnVar.I7(u1Var, true, false, f7, f10, messageObject.isMusic(), false, false);
            return;
        }
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        int i11 = 0;
        if (!(messageAction instanceof TLRPC.TL_messageActionConferenceCall)) {
            TLRPC.User user = wnVar.f;
            if (user != null) {
                boolean isVideoCall = messageObject.isVideoCall();
                TLRPC.UserFull userFull = wnVar.a8;
                org.telegram.ui.Components.voip.g2.m(user, isVideoCall, userFull != null && userFull.video_calls_available, wnVar.getParentActivity(), wnVar.getMessagesController().getUserFull(wnVar.f.id), wnVar.getAccountInstance());
                return;
            }
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(Long.valueOf(wnVar.a()));
        ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
        int size = arrayList.size();
        while (i11 < size) {
            TLRPC.Peer peer = arrayList.get(i11);
            i11++;
            hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(peer)));
        }
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = messageObject.getId();
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(wnVar.getParentActivity(), 3, null);
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = wnVar.getMessagesController().conferenceCallSizeLimit;
        a2Var.setOnCancelListener(new ba(this, wnVar.getConnectionsManager().sendRequest(getgroupcall, new ci.hd(this, a2Var, hashSet, tL_inputGroupCallInviteMessage, messageObject, 4)), 1));
        a2Var.q(600L);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void C1(org.telegram.ui.Cells.u1 u1Var) {
        wn.U4(this.a, u1Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void D0(org.telegram.ui.Cells.u1 u1Var) {
        l(u1Var, true, false, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void D1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        l(u1Var, z10, false, false);
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
        wn wnVar = this.a;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    wnVar.I7(u1Var, true, false, u1Var.getLastTouchX(), u1Var.getLastTouchY(), true, false, true);
                    return;
                } else {
                    if (i12 == 4) {
                        wnVar.R1.m(messageObject.getTopicId(), true);
                        return;
                    }
                    return;
                }
            }
            if (message.suggested_post != null) {
                i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, wnVar.e);
                if (canManageMonoForum) {
                    i11 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                    ChatObject.canUserDoChannelDirectAdminAction(i11, wnVar.e, 5);
                }
                ai.s4 s4Var = new ai.s4(this, message, canManageMonoForum, messageObject, 12);
                TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                wnVar.g7(s4Var, zf.a.l(suggestedPost != null ? suggestedPost.price : null), !canManageMonoForum);
                return;
            }
            return;
        }
        long peerDialogId = DialogObject.getPeerDialogId(message.from_id);
        oc ocVar = new oc(13, this, message);
        Pattern pattern = org.telegram.ui.Components.e5.a;
        Activity parentActivity = wnVar.getParentActivity();
        int i13 = 0;
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(parentActivity, 0, null);
        String string = LocaleController.getString(R.string.SuggestedMessageDecline);
        org.telegram.ui.ActionBar.a2 a2Var = d2Var.a;
        a2Var.R = string;
        a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageDeclineInfo, MessagesController.getInstance(UserConfig.selectedAccount).getPeerName(peerDialogId)));
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        frameLayout.setClipChildren(false);
        EditText editText = new EditText(parentActivity);
        editText.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false));
        editText.setHint(LocaleController.getString(R.string.SuggestedMessageDeclineReasonHint));
        editText.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.H6, false));
        editText.setTextSize(1, 16.0f);
        editText.setBackground(org.telegram.ui.ActionBar.h6.S(parentActivity));
        editText.setMaxLines(4);
        editText.setRawInputType(147457);
        editText.setImeOptions(6);
        editText.setFilters(new InputFilter[]{new org.telegram.ui.Components.t4(parentActivity)});
        editText.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0, AndroidUtilities.dp(8.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f));
        editText.setSelection(editText.getText().toString().length());
        d2Var.n(frameLayout);
        d2Var.k(LocaleController.getString(R.string.Decline), new o(24, ocVar, editText));
        d2Var.h(LocaleController.getString(R.string.Cancel), null);
        a2Var.N = new org.telegram.ui.Components.p1(editText, i13);
        frameLayout.addView(editText, w7.y5.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
        editText.requestFocus();
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.pg(editText, 3), 100L);
        wnVar.showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q7, false));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void F(org.telegram.ui.Cells.u1 u1Var) {
        wn wnVar = this.a;
        wnVar.xa.l(u1Var, wnVar, true);
        wnVar.x0.I0(false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void F0(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject;
        if (u1Var == null || (messageObject = u1Var.getMessageObject()) == null || messageObject.messageOwner == null) {
            return;
        }
        int id2 = messageObject.getId();
        wn wnVar = this.a;
        if (wnVar.vb == id2 && wnVar.wb == 7) {
            return;
        }
        TLRPC.InputPeer inputPeer = wnVar.getMessagesController().getInputPeer(messageObject.getDialogId());
        if (inputPeer == null) {
            return;
        }
        TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
        getrichmessage.peer = inputPeer;
        getrichmessage.id = id2;
        nf.e eVar = wnVar.zb;
        if (eVar != null) {
            eVar.a(true);
            wnVar.zb = null;
        }
        int[] iArr = new int[1];
        xi xiVar = new xi(wnVar, id2, u1Var, 2);
        xiVar.b = new dh(0, wnVar, iArr);
        wnVar.zb = xiVar;
        xiVar.d();
        iArr[0] = wnVar.getConnectionsManager().sendRequestTyped(getrichmessage, new org.telegram.messenger.a(), new hg(wnVar, xiVar, iArr, u1Var, messageObject));
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
        ok okVar;
        nk nkVar;
        if (!m()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(ChatObject.getPublicUsername(chat));
        wn wnVar = this.a;
        int i14 = (isEmpty || wnVar.e == null || ((okVar = wnVar.O0) != null && okVar.getVisibility() == 0) || ((nkVar = wnVar.R) != null && nkVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat2 = wnVar.e;
        int i15 = (chat2 == null || !(wnVar.d4 == 0 || wnVar.h4) || (ChatObject.isChannel(chat2) && !wnVar.e.megagroup)) ? 0 : 1;
        TLRPC.Chat chat3 = wnVar.e;
        int i16 = (chat3 == null || chat3.id != chat.id || wnVar.F9()) ? 1 : 0;
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
        TLRPC.ChatFull chatFull = wnVar.getMessagesController().getChatFull(chat.id);
        if (chatFull != null) {
            x4Var = x4.a(chat, chatFull, d5VarArr);
            z11 = i14;
            i13 = i15;
            i12 = i16;
            z10 = true;
        } else {
            i11 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
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
            com.google.firebase.messaging.m.k().v((ViewGroup) wnVar.fragmentView, wnVar.ea, x4Var, new b7(this, chat, u1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.y70 H = org.telegram.ui.Components.y70.H(wnVar, u1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new wm(this, chat, 0), false);
        boolean z12 = chat.broadcast;
        H.l(z12 ? R.drawable.msg_channel : R.drawable.msg_discussion, LocaleController.getString(z12 ? R.string.OpenChannel2 : R.string.OpenGroup2), new r1(this, u1Var, chat, 26), i12);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new wm(this, chat, 1), z11);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new wm(this, chat, 2), i13);
        H.t = false;
        H.i = 3;
        H.W = true;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void H1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        wn wnVar = this.a;
        if (wnVar.z9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
        if (wnVar.getParentActivity() != null) {
            if (wnVar.O0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                if (tL_inlineButtonTypeCopy == null) {
                    if (tL_inlineButtonTypeUrl != null) {
                        wnVar.Z9(null, tL_inlineButtonTypeUrl.url, true, u1Var, u1Var.getMessageObject());
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
                org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) wnVar.getParentActivity(), (org.telegram.ui.ActionBar.d6) wnVar.ea, false);
                e3Var.fixNavigationBar();
                e3Var.title = str;
                e3Var.bigTitle = false;
                e3Var.multipleLinesTitle = true;
                CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Copy)};
                lg.j jVar = new lg.j(3, wnVar, str);
                e3Var.items = charSequenceArr;
                e3Var.onClickListener = jVar;
                wnVar.showDialog(e3Var);
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
        org.telegram.messenger.ok.o(R.string.CodeCopied, org.telegram.ui.Components.yc.a0(this.a));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void I0(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        messageObject.messageOwner.summarizedOpen = !r1.summarizedOpen;
        messageObject.updateTranslation(true);
        wn wnVar = this.a;
        wnVar.getMessagesStorage().updateMessageCustomParams(messageObject.getDialogId(), messageObject.messageOwner);
        wnVar.getMessagesController().getTranslateController().checkTranslation(messageObject, true);
        l(u1Var, true, false, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean I1() {
        wn wnVar = this.a;
        return wnVar.X0.getKeyboardHeight() + wnVar.oa >= AndroidUtilities.dp(20.0f);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void K1(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        wn wnVar = this.a;
        wnVar.d5 = messageObject;
        wnVar.d9();
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
        wn wnVar = this.a;
        if (z10) {
            long j3 = -((TLRPC.TL_messageMediaGiveaway) u1Var.getMessageObject().messageOwner.media).channels.get(i10).longValue();
            if (wnVar.T5 != j3) {
                wnVar.presentFragment(wn.R9(j3));
            } else {
                wnVar.a1.e(false, false);
            }
        }
        if (u1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            wnVar.presentFragment(ProfileActivity.m4(((TLRPC.TL_messageMediaGiveawayResults) u1Var.getMessageObject().messageOwner.media).winners.get(i10).longValue()));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean M0(long j3) {
        wn wnVar = this.a;
        TLRPC.Chat chat = wnVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return false;
        }
        return wnVar.getMessagesController().isOwner(wnVar.e.id, j3);
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
    public final void N0(org.telegram.ui.Cells.u1 u1Var) {
        int i10;
        a3.h0 h0Var;
        MessageObject.GroupedMessages groupedMessages;
        int i11;
        wn wnVar = this.a;
        uh.i iVar = wnVar.X9;
        if (iVar == null) {
            return;
        }
        HashMap hashMap = iVar.a;
        uh.h hVar = (uh.h) hashMap.get(uh.i.b(u1Var));
        org.telegram.ui.Components.qc qcVar = null;
        MessageObject messageObject = hVar != null ? hVar.E : null;
        uh.h hVar2 = (uh.h) wnVar.X9.a.get(uh.i.b(u1Var));
        long j3 = (hVar2 == null || (i11 = hVar2.R) == -1) ? 0L : hVar2.w[i11].d;
        if (messageObject != null && j3 != 0) {
            Activity parentActivity = wnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
            if (!org.telegram.ui.Components.e5.h(parentActivity, i10, j3, false)) {
                ArrayList<MessageObject> arrayList = (messageObject.getGroupId() == 0 || (groupedMessages = (MessageObject.GroupedMessages) wnVar.x6.f(messageObject.getGroupId())) == null) ? null : groupedMessages.messages;
                if (arrayList == null) {
                    arrayList = org.telegram.messenger.f0.k(messageObject);
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
                qcVar = org.telegram.ui.Components.yc.v(wnVar.getParentActivity(), wnVar, null, 1, j10, 1, wnVar.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), wnVar.getThemedColor(org.telegram.ui.ActionBar.h6.Hi), 5000, false, h0Var);
                qcVar.k = true;
                qcVar.k(qcVar.e instanceof org.telegram.ui.Components.bc);
            }
        }
        uh.h hVar3 = (uh.h) hashMap.get(uh.i.b(u1Var));
        if (hVar3 != null) {
            if (qcVar == null) {
                hVar3.R = -1;
                hVar3.c();
                return;
            }
            org.telegram.ui.Components.ub ubVar = qcVar.e;
            if (!(ubVar instanceof org.telegram.ui.Components.yb)) {
                hVar3.c();
                return;
            }
            org.telegram.ui.Components.yb ybVar = (org.telegram.ui.Components.yb) ubVar;
            hVar3.W = ybVar;
            ybVar.a.setVisibility(4);
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
        wn wnVar = this.a;
        nf.e eVar = wnVar.zb;
        if (eVar != null) {
            eVar.a(true);
        }
        wnVar.zb = u1Var.getMessageObject() == null ? null : new en(this, u1Var);
        if (z11 || nf.f.f(parse, false, null)) {
            nf.f.r(wnVar.getParentActivity(), parse, true, true, false, wnVar.zb, null, false, true, false);
        } else {
            org.telegram.ui.Components.e5.r0(wnVar, str, true, true, true, !z11, wnVar.zb, webPage, wnVar.ea);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean O(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        int i10;
        int i11;
        boolean isForwarded = u1Var.getMessageObject().isForwarded();
        wn wnVar = this.a;
        if (isForwarded) {
            long peerDialogId = DialogObject.getPeerDialogId(u1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(wnVar);
            int i12 = R.raw.passcode_lock_close;
            int i13 = R.string.TodoCompleteForbiddenForward;
            i11 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
            a02.Q(i12, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i13, DialogObject.getName(i11, peerDialogId)))).k(true);
            return false;
        }
        if (u1Var.getMessageObject().canCompleteTodo()) {
            if (wnVar.getUserConfig().isPremium()) {
                wnVar.getSendMessagesHelper().toggleTodo(ChatObject.getSendAsPeerId(wnVar.e, wnVar.Z7, true), u1Var.getMessageObject(), todoItem, z10, null);
                return true;
            }
            org.telegram.ui.Components.yc.a0(wnVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.TodoPremiumRequired), new tm(this, 9))).k(true);
            return false;
        }
        long peerDialogId2 = DialogObject.getPeerDialogId(u1Var.getMessageObject().getFromPeer());
        org.telegram.ui.Components.yc a03 = org.telegram.ui.Components.yc.a0(wnVar);
        int i14 = R.raw.passcode_lock_close;
        int i15 = R.string.TodoCompleteForbidden;
        i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
        a03.Q(i14, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i15, DialogObject.getName(i10, peerDialogId2)))).k(true);
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final CharacterStyle O1(org.telegram.ui.Cells.u1 u1Var) {
        wn wnVar;
        int i10;
        if (u1Var.getMessageObject() == null || (i10 = (wnVar = this.a).vb) == 0 || i10 != u1Var.getMessageObject().getId() || wnVar.wb != 1) {
            return null;
        }
        return wnVar.xb;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean P() {
        wn wnVar = this.a;
        return wnVar.W5[1].size() + wnVar.W5[0].size() > 0;
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
        wn wnVar = this.a;
        if (i10 == 19) {
            nf.e eVar = wnVar.zb;
            if (eVar != null) {
                eVar.a(true);
            }
            final bn bnVar = u1Var.getMessageObject() != null ? new bn(this, u1Var, 2) : null;
            wnVar.zb = bnVar;
            final Activity parentActivity = wnVar.getParentActivity();
            final org.telegram.ui.ActionBar.d6 resourceProvider = wnVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            bnVar.d();
            bnVar.b = new tg.d(atomicBoolean, 0);
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
            tg.s.d(messageObject, new Utilities.Callback(atomicBoolean, bnVar, z10, b11, j3, tL_messageMediaGiveaway2, parentActivity, resourceProvider) { // from class: tg.e
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
            }, new tg.f(atomicBoolean, bnVar, 0));
            return;
        }
        if (i10 == 21) {
            g();
            return;
        }
        if (i10 == 84) {
            wnVar.ua(u1Var);
            return;
        }
        if (i10 == 80) {
            org.telegram.ui.Cells.t8 t8Var = org.telegram.ui.Components.ah0.O;
            if (wnVar.getParentActivity() == null) {
                return;
            }
            wnVar.showDialog(new org.telegram.ui.Components.ah0(wnVar.getContext(), wnVar.getCurrentAccount(), messageObject, wnVar.getResourceProvider()));
            return;
        }
        if (i10 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
            if (messageMedia4 == null || (webPage = messageMedia4.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                wnVar.createArticleViewer(false).N(messageObject, null, null, null);
                return;
            }
            return;
        }
        int i15 = 5;
        if (i10 == 5) {
            long j10 = messageObject.messageOwner.media.user_id;
            if (j10 != 0) {
                i14 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
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
                wnVar.presentFragment(new ProfileActivity(bundle, null));
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
                wnVar.showDialog(new org.telegram.ui.Components.ze0(wnVar, null, user, null, file, gf.b.d(str, false), str3, str4, wnVar.ea));
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (i10 == 30) {
            wnVar.presentFragment(new wn(v7.j.e(messageObject.messageOwner.media.user_id, "user_id")));
            return;
        }
        if (i10 == 31) {
            long j11 = messageObject.messageOwner.media.user_id;
            if (j11 != 0) {
                i13 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(j11));
            }
            if (user2 != null) {
                if (!TextUtils.isEmpty(messageObject.vCardData)) {
                    b10 = messageObject.vCardData.toString();
                } else if (TextUtils.isEmpty(user2.phone)) {
                    String str5 = MessageObject.getMedia(messageObject.messageOwner).phone_number;
                    b10 = !TextUtils.isEmpty(str5) ? gf.b.c().b(str5) : LocaleController.getString(R.string.NumberUnknown);
                } else {
                    b10 = org.telegram.messenger.ok.h(new StringBuilder("+"), user2.phone, gf.b.c());
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user2.id);
                bundle2.putString("phone", b10);
                bundle2.putBoolean("addContact", true);
                wnVar.presentFragment(new ms(bundle2));
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
            nf.e eVar2 = wnVar.zb;
            if (eVar2 != null) {
                eVar2.a(true);
            }
            wnVar.zb = u1Var.getMessageObject() != null ? new bn(this, u1Var, 3) : null;
            if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                String group = matcher.group(1);
                i11 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                if (MediaDataController.getInstance(i11).getStickerSetByName(group) == null) {
                    wnVar.zb.d();
                    TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_inputStickerSetShortName.short_name = group;
                    tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                    i12 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                    wnVar.zb.b = new ai.o8(this, ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickerSet, new ci.t3(i16, this, z11)), 26);
                    return;
                }
            }
            nf.f.r(wnVar.getParentActivity(), Uri.parse(webPage2.url), true, true, false, wnVar.zb, null, false, true, false);
            return;
        }
        if (messageObject.isSponsored()) {
            wnVar.J9(messageObject, false, false);
            if (messageObject.sponsoredUrl != null) {
                nf.e eVar3 = wnVar.zb;
                if (eVar3 != null) {
                    eVar3.a(true);
                }
                wnVar.zb = u1Var.getMessageObject() != null ? new bn(this, u1Var, i16) : null;
                nf.f.r(wnVar.getParentActivity(), Uri.parse(messageObject.sponsoredUrl), true, false, false, wnVar.zb, null, false, wnVar.getMessagesController().sponsoredLinksInappAllow, false);
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
                    wnVar.getOrCreateStoryViewer().F(wnVar.getParentActivity(), tL_webPageAttributeStory.storyItem, ai.u9.a(wnVar.x0));
                    return;
                }
            }
        }
        if (wnVar.ea(storyMentionWebpage.url, u1Var, null, messageObject.getId(), 2)) {
            return;
        }
        nf.e eVar4 = wnVar.zb;
        if (eVar4 != null) {
            eVar4.a(true);
        }
        wnVar.zb = u1Var.getMessageObject() != null ? new bn(this, u1Var, i15) : null;
        nf.f.r(wnVar.getParentActivity(), Uri.parse(storyMentionWebpage.url), true, true, false, wnVar.zb, null, false, true, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        try {
            wn wnVar = this.a;
            org.telegram.ui.Components.wu.J(wnVar, messageObject, wnVar.Fa, str2, str3, str4, str, i10, i11, -1, wnVar.x9());
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
        wn wnVar = this.a;
        if (wnVar.getParentActivity() == null) {
            return false;
        }
        i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
        if (!MessagesController.getInstance(i10).richEditorAllowed() || (messageObject = u1Var.getMessageObject()) == null || (message = messageObject.messageOwner) == null || message.rich_message == null) {
            return false;
        }
        if (!messageObject.translated || message.translatedRichMessage == null) {
            return messageObject.canEditMessage(wnVar.e);
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean Q1(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        ViewGroup viewGroup;
        int i10;
        z41 z41Var;
        if (messageObject.isVoiceOnce() || messageObject.isRoundOnce()) {
            int i11 = 1;
            b51 b51Var = this.a.Z9;
            if (b51Var == null || b51Var.b0) {
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
                this.a.Z9 = new b51(this.a.getParentActivity());
                b51 b51Var2 = this.a.Z9;
                te fb2 = !messageObject.isOutOwner() ? this.a.fb(messageObject, true) : null;
                a3.h0 O4 = !messageObject.isOutOwner() ? wn.O4(this.a, messageObject) : null;
                Context context = b51Var2.a;
                ci.m6 m6Var = b51Var2.c;
                b51Var2.X = fb2;
                b51Var2.Y = O4;
                z41 z41Var2 = b51Var2.N;
                if (z41Var2 != null) {
                    m6Var.removeView(z41Var2);
                    b51Var2.N = null;
                }
                b51Var2.O = u1Var;
                MessageObject messageObject2 = u1Var.getMessageObject();
                b51Var2.M = messageObject2;
                b51Var2.S = messageObject2 != null && messageObject2.isRoundVideo();
                org.telegram.ui.Cells.u1 u1Var2 = b51Var2.O;
                b51Var2.L = u1Var2 != null ? u1Var2.getResourcesProvider() : null;
                if (b51Var2.O != null) {
                    b51Var2.T = 0.0f;
                    b51Var2.U = u1Var.n;
                    if (u1Var.getParent() instanceof View) {
                        View view = (View) u1Var.getParent();
                        b51Var2.T = view.getY() + b51Var2.T;
                        b51Var2.U = view.getY() + b51Var2.U;
                    }
                    int width = b51Var2.O.getWidth();
                    int height = b51Var2.O.getHeight();
                    if (b51Var2.S) {
                        height = Math.min(AndroidUtilities.dp(360.0f), Math.min(width, AndroidUtilities.displaySize.y));
                    }
                    int i12 = height;
                    b51Var2.K = i12 - b51Var2.O.getHeight();
                    i10 = (int) Math.ceil((Math.min(width, i12) * 0.92f) / AndroidUtilities.density);
                    viewGroup = m6Var;
                    z41 z41Var3 = new z41(b51Var2, b51Var2.getContext(), UserConfig.selectedAccount, b51Var2.O.getResourcesProvider(), width, i12);
                    b51Var2.N = z41Var3;
                    b51Var2.O.j1(z41Var3);
                    b51Var2.N.i1(b51Var2.O);
                    b51Var2.N.setDelegate(new t7.u());
                    z41 z41Var4 = b51Var2.N;
                    MessageObject messageObject3 = b51Var2.M;
                    MessageObject.GroupedMessages currentMessagesGroup = b51Var2.O.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.u1 u1Var3 = b51Var2.O;
                    z41Var4.X3(messageObject3, currentMessagesGroup, u1Var3.F, u1Var3.E, false, false);
                    if (!b51Var2.S) {
                        org.telegram.ui.Components.k8 k8Var = new org.telegram.ui.Components.k8();
                        b51Var2.V = k8Var;
                        z41 z41Var5 = b51Var2.N;
                        k8Var.i = z41Var5;
                        z41Var5.ee = k8Var;
                        if (z41Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.vo0 seekBarWaveform = b51Var2.N.getSeekBarWaveform();
                            seekBarWaveform.L = b51Var2.s;
                            org.telegram.ui.Cells.u1 u1Var4 = seekBarWaveform.n;
                            if (u1Var4 != null) {
                                u1Var4.invalidate();
                            }
                        }
                    }
                    b51Var2.H = false;
                    viewGroup.addView(b51Var2.N, new FrameLayout.LayoutParams(b51Var2.O.getWidth(), i12, 17));
                } else {
                    viewGroup = m6Var;
                    i10 = 360;
                }
                TextureView textureView = b51Var2.P;
                if (textureView != null) {
                    viewGroup.removeView(textureView);
                    b51Var2.P = null;
                }
                if (b51Var2.S) {
                    b51Var2.Q = false;
                    TextureView textureView2 = new TextureView(context);
                    b51Var2.P = textureView2;
                    viewGroup.addView(textureView2, 0, w7.y5.c(i10, i10));
                }
                MediaController.getInstance().pauseByRewind();
                org.telegram.ui.Components.s71 s71Var = b51Var2.w;
                if (s71Var != null) {
                    s71Var.B();
                    b51Var2.w.H();
                    b51Var2.w = null;
                }
                org.telegram.ui.Cells.u1 u1Var5 = b51Var2.O;
                if (u1Var5 != null && u1Var5.getMessageObject() != null) {
                    File pathToAttach = FileLoader.getInstance(b51Var2.O.getMessageObject().currentAccount).getPathToAttach(b51Var2.O.getMessageObject().getDocument());
                    if (pathToAttach != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && (pathToAttach = FileLoader.getInstance(b51Var2.O.getMessageObject().currentAccount).getPathToMessage(b51Var2.O.getMessageObject().messageOwner)) != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && b51Var2.O.getMessageObject().messageOwner.attachPath != null) {
                        pathToAttach = new File(b51Var2.O.getMessageObject().messageOwner.attachPath);
                    }
                    if (pathToAttach != null && pathToAttach.exists()) {
                        org.telegram.ui.Components.s71 s71Var2 = new org.telegram.ui.Components.s71();
                        b51Var2.w = s71Var2;
                        s71Var2.J = new a51(b51Var2);
                        if (b51Var2.V != null) {
                            s71Var2.K = new a51(b51Var2);
                        }
                        if (b51Var2.S) {
                            s71Var2.V(b51Var2.P);
                        }
                        b51Var2.w.D(Uri.fromFile(pathToAttach), "other");
                        b51Var2.w.C();
                        org.telegram.ui.Components.kt ktVar = b51Var2.E;
                        if (ktVar != null) {
                            ktVar.s = b51Var2.w;
                            ktVar.a();
                        }
                    }
                    wn wnVar = this.a;
                    wnVar.showDialog(wnVar.Z9);
                    return false;
                }
                ci.e4 e4Var = b51Var2.x;
                if (e4Var != null) {
                    viewGroup.removeView(e4Var);
                    b51Var2.x = null;
                }
                MessageObject messageObject4 = b51Var2.M;
                boolean z10 = messageObject4 != null && messageObject4.isOutOwner();
                MessageObject messageObject5 = b51Var2.M;
                if (messageObject5 != null && messageObject5.getDialogId() != UserConfig.getInstance(b51Var2.M.currentAccount).getClientUserId()) {
                    ci.e4 e4Var2 = new ci.e4(context, 3);
                    b51Var2.x = e4Var2;
                    e4Var2.p(true);
                    if (z10) {
                        long dialogId = b51Var2.M.getDialogId();
                        String str = "";
                        if (dialogId > 0) {
                            TLRPC.User user = MessagesController.getInstance(b51Var2.M.currentAccount).getUser(Long.valueOf(dialogId));
                            if (user != null) {
                                str = UserObject.getFirstName(user);
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(b51Var2.M.currentAccount).getChat(Long.valueOf(-dialogId));
                            if (chat != null) {
                                str = chat.title;
                            }
                        }
                        b51Var2.x.s(AndroidUtilities.replaceTags(LocaleController.formatString(b51Var2.S ? R.string.VideoOnceOutHint : R.string.VoiceOnceOutHint, str)));
                    } else {
                        b51Var2.x.s(AndroidUtilities.replaceTags(LocaleController.getString(b51Var2.S ? R.string.VideoOnceHint : R.string.VoiceOnceHint)));
                    }
                    b51Var2.x.q(12.0f);
                    b51Var2.x.setPadding(AndroidUtilities.dp((z10 || b51Var2.O.F) ? 0.0f : 6.0f), 0, 0, 0);
                    if (b51Var2.S) {
                        b51Var2.x.m(0.5f, 0.0f);
                        b51Var2.x.K = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        b51Var2.x.m(0.0f, AndroidUtilities.dp(34.0f));
                        b51Var2.x.K = Layout.Alignment.ALIGN_NORMAL;
                    }
                    b51Var2.x.t(14.0f);
                    ci.e4 e4Var3 = b51Var2.x;
                    e4Var3.h = ci.e4.a(e4Var3.getText(), b51Var2.x.getTextPaint());
                    if (b51Var2.S) {
                        viewGroup.addView(b51Var2.x, w7.y5.d((int) ((b51Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((b51Var2.O.getHeight() + b51Var2.K) / AndroidUtilities.density) / 2.0f), 0.0f, 0.0f));
                    } else {
                        viewGroup.addView(b51Var2.x, w7.y5.d((int) ((b51Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, ((((b51Var2.O.getWidth() * (-0.39999998f)) / 2.0f) + b51Var2.O.getBoundsLeft()) / AndroidUtilities.density) + 1.0f, ((-75.0f) - ((b51Var2.O.getHeight() / AndroidUtilities.density) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    b51Var2.x.u();
                }
                TextView textView = b51Var2.y;
                if (textView != null) {
                    viewGroup.removeView(textView);
                    b51Var2.y = null;
                }
                TextView textView2 = new TextView(context);
                b51Var2.y = textView2;
                textView2.setTextColor(-1);
                b51Var2.y.setTypeface(AndroidUtilities.bold());
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    b51Var2.y.setBackground(org.telegram.ui.ActionBar.h6.i0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    b51Var2.y.setBackground(org.telegram.ui.ActionBar.h6.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                b51Var2.y.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
                w7.a6.a(b51Var2.y);
                b51Var2.y.setText(LocaleController.getString(z10 ? R.string.VoiceOnceClose : R.string.VoiceOnceDeleteClose));
                b51Var2.y.setOnClickListener(new x41(b51Var2, i11));
                viewGroup.addView(b51Var2.y, w7.y5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z10 && (z41Var = b51Var2.N) != null && z41Var.getMessageObject() != null && b51Var2.N.getMessageObject().messageOwner != null) {
                    b51Var2.N.getMessageObject().messageOwner.media_unread = false;
                    b51Var2.N.invalidate();
                }
                wn wnVar2 = this.a;
                wnVar2.showDialog(wnVar2.Z9);
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
                wn wnVar3 = this.a;
                return mediaController.setPlaylist(L, messageObject, wnVar3.L6, true ^ wnVar3.A0.N, null);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean R() {
        wn wnVar = this.a;
        return UserObject.isReplyUser(wnVar.f) || UserObject.isUserSelf(wnVar.f);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void R0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        wn wnVar = this.a;
        wnVar.getSendMessagesHelper().sendCallback(true, u1Var.getMessageObject(), keyboardInlineButton, wnVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void R1() {
        org.telegram.ui.ActionBar.d6 d6Var;
        wn wnVar = this.a;
        if (wnVar.X0 == null || wnVar.getParentActivity() == null) {
            return;
        }
        Context context = wnVar.X0.getContext();
        d6Var = ((org.telegram.ui.ActionBar.m2) wnVar).resourceProvider;
        z31.T(context, wnVar, false, d6Var, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void S(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        MessageObject messageObject;
        if (chat == null) {
            return;
        }
        wn wnVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
        if (kVar.s() || wnVar.A9()) {
            wn.b2(wnVar, u1Var, true, f7, f10);
            return;
        }
        if (z10 || !chat.signature_profiles || (messageObject = u1Var.getMessageObject()) == null || messageObject.getDialogId() == UserObject.REPLY_BOT) {
            q(u1Var, chat, i10, z10);
        } else {
            wnVar.na(DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void T(org.telegram.ui.Cells.u1 u1Var) {
        l(u1Var, true, true, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void T1(org.telegram.ui.Cells.u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        xi xiVar;
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
                        TLRPC.TL_message C7 = wn.C7(message);
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
                wn wnVar = this.a;
                t12.J2(null, wnVar, wnVar.ea);
                PhotoViewer.t1().a2(arrayList, i11, this.a.a(), 0L, 0L, this.a.Ga);
                return;
            }
            return;
        }
        wn wnVar2 = this.a;
        nf.e eVar = wnVar2.zb;
        if (eVar != null) {
            eVar.a(true);
            wnVar2.zb = null;
        }
        if (u1Var.getMessageObject() == null) {
            wnVar2.zb = null;
            xiVar = null;
        } else {
            xiVar = new xi(wnVar2, u1Var.getMessageObject().getId(), u1Var, 1);
            wnVar2.zb = xiVar;
        }
        i10 = ((org.telegram.ui.ActionBar.m2) this.a).currentAccount;
        yh.t5 y3 = yh.t5.y(i10, false);
        Objects.requireNonNull(xiVar);
        aj ajVar = new aj(xiVar, 7);
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        org.telegram.ui.ActionBar.d6 I = yh.t5.I();
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
            vVar = new qg.v(y3, ConnectionsManager.getInstance(y3.a).sendRequest(tL_payments_getPaymentForm, new ai.p3(y3, messageObject, tL_inputInvoiceMessage, ajVar, 19)), 5);
        }
        if (vVar != null) {
            xiVar.b = vVar;
            xiVar.d();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void U1(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10;
        int i11;
        ImageLocation forDocument;
        String str2;
        boolean isEmpty = TextUtils.isEmpty(str);
        wn wnVar = this.a;
        if (!isEmpty) {
            nf.f.s(wnVar.getParentActivity(), "https://" + wnVar.getMessagesController().linkPrefix + "/nft/" + str);
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
        rg.k1 k1Var = new rg.k1(wnVar, i10, user, null, null, wnVar.ea);
        u1Var.getLocationOnScreen(new int[2]);
        k1Var.v0 = u1Var.getNameStatusX();
        k1Var.w0 = u1Var.getNameStatusY();
        k1Var.z0 = u1Var.getScaleX();
        k1Var.x0 = u1Var.getLeft();
        k1Var.y0 = u1Var.getTop();
        k1Var.A0 = u1Var;
        int colorId = UserObject.getColorId(user);
        if (colorId < 7) {
            k1Var.u0 = Integer.valueOf(wnVar.getThemedColor(org.telegram.ui.ActionBar.h6.r8[colorId]));
        } else {
            i11 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
            MessagesController.PeerColors peerColors = MessagesController.getInstance(i11).peerColors;
            MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(colorId) : null;
            k1Var.u0 = color != null ? Integer.valueOf(color.getColor1()) : null;
        }
        org.telegram.ui.Components.o5 o5Var = u1Var.fc;
        if (o5Var != null && (o5Var.f[0] instanceof org.telegram.ui.Components.q5)) {
            k1Var.z0 *= 0.95f;
            if (document != null) {
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(wnVar.getParentActivity());
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.h6.m6, 0.2f);
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
                    Integer num = k1Var.u0;
                    w9Var.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : wnVar.getThemedColor(org.telegram.ui.ActionBar.h6.v6), PorterDuff.Mode.SRC_IN));
                    k1Var.C0 = MessageObject.getInputStickerSet(document);
                } else {
                    k1Var.C0 = MessageObject.getInputStickerSet(document);
                }
                k1Var.B0 = w9Var;
                k1Var.E0 = true;
            }
        }
        wnVar.showDialog(k1Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final int V() {
        return this.a.R3;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void V0(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        this.a.U7(characterStyle, z10, u1Var.getMessageObject(), u1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:244:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x09a3 A[LOOP:3: B:254:0x09a1->B:255:0x09a3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0a0a  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0a22  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0aa7  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0941  */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean V1(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        dw0 dw0Var;
        TLRPC.PollAnswer pollAnswer2;
        dw0 dw0Var2;
        yv0 yv0Var;
        ah.c cVar;
        MessageObject messageObject;
        TLRPC.ChatFull chatFull;
        boolean z10;
        boolean z11;
        dw0 dw0Var3;
        MessageObject messageObject2;
        org.telegram.ui.Components.y70 y70Var;
        wn wnVar;
        boolean z12;
        af afVar;
        MessageObject messageObject3;
        int size;
        int i10;
        ViewGroup viewGroup;
        dw0 dw0Var4;
        boolean z13;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        boolean z14;
        byte[] bArr;
        yv0 yv0Var2;
        TLRPC.PollAnswerVoters pollAnswerVoters;
        boolean z15;
        dw0 dw0Var5;
        ArrayList arrayList;
        byte[] bArr2;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll2;
        TLRPC.PollAnswer pollAnswer3;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll3;
        boolean z16;
        qh.q qVar;
        boolean z17;
        ArrayList<TLRPC.PollAnswerVoters> arrayList2;
        wn wnVar2 = this.a;
        if (wnVar2.getParentActivity() != null && wnVar2.getParentActivity() != null) {
            ci.e4 e4Var = wnVar2.x1;
            if (e4Var != null && e4Var.V) {
                e4Var.e(true);
            }
            ul ulVar = wnVar2.B1;
            if (ulVar != null && ulVar.V) {
                ulVar.e(true);
            }
            MessageObject primaryMessageObject = u1Var.getPrimaryMessageObject();
            TLRPC.MessageMedia media = MessageObject.getMedia(primaryMessageObject);
            if (primaryMessageObject != null && (media instanceof TLRPC.TL_messageMediaPoll)) {
                wnVar2.d5 = primaryMessageObject;
                wnVar2.e5 = null;
                dw0 dw0Var6 = new dw0(wnVar2.getParentActivity(), wnVar2.getResourceProvider());
                byte[] bArr3 = pollAnswer.option;
                dw0Var6.L = u1Var;
                dw0Var6.P = bArr3;
                MessageObject messageObject4 = u1Var.getMessageObject();
                dw0Var6.H = messageObject4;
                dw0Var6.I = messageObject4 != null && messageObject4.isOutOwner();
                org.telegram.ui.Cells.u1 u1Var2 = dw0Var6.L;
                yv0 yv0Var3 = dw0Var6.d;
                if (u1Var2 != null) {
                    dw0Var6.M = wnVar2.s9 - AndroidUtilities.dp(4.0f);
                    dw0Var6.N = u1Var.n;
                    if (u1Var.getParent() instanceof View) {
                        View view = (View) u1Var.getParent();
                        dw0Var6.M = view.getY() + dw0Var6.M;
                        dw0Var6.N = view.getY() + dw0Var6.N;
                    }
                    int width = dw0Var6.L.getWidth();
                    int height = dw0Var6.L.getHeight();
                    dw0Var6.L.getHeight();
                    bw0 bw0Var = new bw0(dw0Var6, dw0Var6.getContext(), UserConfig.selectedAccount, dw0Var6.L.getResourcesProvider(), bArr3, width, height);
                    dw0Var = dw0Var6;
                    dw0Var.J = bw0Var;
                    dw0Var.L.h1(bw0Var);
                    dw0Var.J.i1(dw0Var.L);
                    dw0Var.J.setDelegate(new qb.b(17));
                    bw0 bw0Var2 = dw0Var.J;
                    MessageObject messageObject5 = dw0Var.H;
                    MessageObject.GroupedMessages currentMessagesGroup = dw0Var.L.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.u1 u1Var3 = dw0Var.L;
                    bw0Var2.X3(messageObject5, currentMessagesGroup, u1Var3.F, u1Var3.E, u1Var3.G, false);
                    bw0 bw0Var3 = dw0Var.J;
                    bw0Var3.M7 = bArr3;
                    yv0Var3.addView(bw0Var3, new FrameLayout.LayoutParams(dw0Var.L.getWidth(), height, 51));
                    cw0 cw0Var = new cw0(dw0Var.getContext(), UserConfig.selectedAccount, dw0Var.L.getResourcesProvider(), width, height, 0);
                    dw0Var.K = cw0Var;
                    dw0Var.L.j1(cw0Var);
                    dw0Var.L.h1(dw0Var.K);
                    dw0Var.K.i1(dw0Var.L);
                    dw0Var.K.setDelegate(new ob.a(17));
                    cw0 cw0Var2 = dw0Var.K;
                    MessageObject messageObject6 = dw0Var.H;
                    MessageObject.GroupedMessages currentMessagesGroup2 = dw0Var.L.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.u1 u1Var4 = dw0Var.L;
                    cw0Var2.X3(messageObject6, currentMessagesGroup2, u1Var4.F, u1Var4.E, u1Var4.G, false);
                    yv0Var3.addView(dw0Var.K, new FrameLayout.LayoutParams(dw0Var.L.getWidth(), height, 51));
                } else {
                    dw0Var = dw0Var6;
                }
                ci.i1 i1Var = dw0Var.f;
                i1Var.bringToFront();
                yv0 yv0Var4 = dw0Var.e;
                yv0Var4.bringToFront();
                dw0Var.n.bringToFront();
                i1Var.w(false);
                Context context = dw0Var.a;
                View view2 = new View(context);
                org.telegram.ui.ActionBar.d6 d6Var = dw0Var.b;
                org.telegram.ui.Components.y70 G = org.telegram.ui.Components.y70.G(yv0Var3, d6Var, view2, true);
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll4 = (TLRPC.TL_messageMediaPoll) MessageObject.getMedia(dw0Var.H);
                dw0Var.V = MessageObject.isVoted(tL_messageMediaPoll4);
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
                ah.c cVar2 = dw0Var.G;
                if (pollAnswer2 != null) {
                    TLRPC.Poll poll = tL_messageMediaPoll4.poll;
                    boolean z18 = (poll.closed || poll.revoting_disabled) ? false : true;
                    boolean z19 = poll.multiple_choice;
                    ArrayList arrayList3 = new ArrayList();
                    TLRPC.PollResults pollResults = tL_messageMediaPoll4.results;
                    if (pollResults == null || (arrayList2 = pollResults.results) == null) {
                        tL_messageMediaPoll = tL_messageMediaPoll4;
                        z14 = z19;
                        bArr = bArr3;
                        yv0Var2 = yv0Var3;
                        pollAnswerVoters = null;
                        z15 = false;
                    } else {
                        int size2 = arrayList2.size();
                        z14 = z19;
                        int i12 = 0;
                        z15 = false;
                        TLRPC.PollAnswerVoters pollAnswerVoters2 = null;
                        while (i12 < size2) {
                            TLRPC.PollAnswerVoters pollAnswerVoters3 = arrayList2.get(i12);
                            int i13 = i12 + 1;
                            TLRPC.PollAnswerVoters pollAnswerVoters4 = pollAnswerVoters3;
                            yv0 yv0Var5 = yv0Var3;
                            boolean equals = Arrays.equals(pollAnswerVoters4.option, bArr3);
                            if (equals) {
                                pollAnswerVoters2 = pollAnswerVoters4;
                            }
                            byte[] bArr4 = bArr3;
                            if (pollAnswerVoters4.chosen) {
                                if (equals) {
                                    z15 = true;
                                }
                                ArrayList<TLRPC.PollAnswer> arrayList4 = tL_messageMediaPoll4.poll.answers;
                                int size3 = arrayList4.size();
                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll5 = tL_messageMediaPoll4;
                                int i14 = 0;
                                while (i14 < size3) {
                                    TLRPC.PollAnswer pollAnswer4 = arrayList4.get(i14);
                                    int i15 = i14 + 1;
                                    TLRPC.PollAnswer pollAnswer5 = pollAnswer4;
                                    ArrayList<TLRPC.PollAnswer> arrayList5 = arrayList4;
                                    int i16 = size3;
                                    if (Arrays.equals(pollAnswer5.option, pollAnswerVoters4.option)) {
                                        arrayList3.add(pollAnswer5);
                                    }
                                    arrayList4 = arrayList5;
                                    i14 = i15;
                                    size3 = i16;
                                }
                                yv0Var3 = yv0Var5;
                                i12 = i13;
                                bArr3 = bArr4;
                                tL_messageMediaPoll4 = tL_messageMediaPoll5;
                            } else {
                                yv0Var3 = yv0Var5;
                                i12 = i13;
                                bArr3 = bArr4;
                            }
                        }
                        tL_messageMediaPoll = tL_messageMediaPoll4;
                        bArr = bArr3;
                        yv0Var2 = yv0Var3;
                        pollAnswerVoters = pollAnswerVoters2;
                    }
                    if (pollAnswerVoters == null || pollAnswerVoters.voters <= 0 || !MessageObject.canShowVotersList(tL_messageMediaPoll)) {
                        dw0Var5 = dw0Var;
                        arrayList = arrayList3;
                        messageObject = primaryMessageObject;
                        yv0Var = yv0Var2;
                        bArr2 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                    } else {
                        qh.q qVar2 = new qh.q(context, wnVar2.getCurrentAccount(), d6Var);
                        org.telegram.ui.Components.y70 J = G.J();
                        J.T(org.telegram.ui.ActionBar.h6.l1(0.06f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, d6Var)));
                        dh.a k10 = eh.b.k(d6Var);
                        View view3 = J.B;
                        if (view3 != null) {
                            qVar = qVar2;
                            z17 = false;
                            ch.d c10 = cVar2.c(view3, null, false);
                            c10.o(k10);
                            view3.setBackground(c10);
                        } else {
                            qVar = qVar2;
                            z17 = false;
                        }
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new eu0(G, 25), z17);
                        J.k();
                        long dialogId = dw0Var.H.getDialogId();
                        int id2 = dw0Var.H.getId();
                        int i17 = pollAnswerVoters.voters;
                        bt btVar = new bt(11, dw0Var, wnVar2);
                        dw0Var5 = dw0Var;
                        messageObject = primaryMessageObject;
                        arrayList = arrayList3;
                        yv0Var = yv0Var2;
                        qh.q qVar3 = qVar;
                        byte[] bArr5 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                        View a2 = qVar3.a(wnVar2, dialogId, id2, bArr5, i17, btVar);
                        wnVar2 = wnVar2;
                        bArr2 = bArr5;
                        J.q(a2);
                        qVar3.setMinimumHeight(AndroidUtilities.dp(48.0f));
                        qVar3.setText(LocaleController.formatPluralString("PollVotesCount", pollAnswerVoters.voters, new Object[0]));
                        qVar3.a.d(pollAnswerVoters.recent_voters, false);
                        qVar3.setLayoutParams(w7.y5.n(-1, 48));
                        qVar3.setBackground(org.telegram.ui.ActionBar.h6.Y(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.I5, false), 12, 0));
                        qVar3.setOnClickListener(new ov(G, J));
                        G.q(qVar3);
                        G.k();
                    }
                    if (!z18) {
                        dw0Var2 = dw0Var5;
                        pollAnswer3 = pollAnswer2;
                    } else if (z15) {
                        int i18 = R.drawable.msg_unvote;
                        CharSequence string = LocaleController.getString(R.string.Unvote);
                        dw0Var2 = dw0Var5;
                        wn wnVar3 = wnVar2;
                        TLRPC.PollAnswer pollAnswer6 = pollAnswer2;
                        Runnable uv0Var = new uv0(dw0Var2, z14, wnVar3, arrayList, pollAnswer6);
                        wnVar2 = wnVar3;
                        pollAnswer3 = pollAnswer6;
                        G.c(i18, string, uv0Var, false);
                    } else {
                        dw0Var2 = dw0Var5;
                        pollAnswer3 = pollAnswer2;
                        boolean z20 = z14;
                        if (qh.i.a(dw0Var2.H) == 0) {
                            G.c(R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), new uv0(dw0Var2, z20, pollAnswer3, wnVar2, arrayList), false);
                        }
                    }
                    if (wnVar2.E6()) {
                        G.c(R.drawable.menu_reply, LocaleController.getString(R.string.PollItemQuote), new jf0(dw0Var2, wnVar2, pollAnswer3, 21), false);
                    }
                    if (dw0Var2.H.getDialogId() >= 0 || pollAnswer3.option == null) {
                        tL_messageMediaPoll3 = tL_messageMediaPoll2;
                        z16 = false;
                    } else {
                        MessagesController messagesController = MessagesController.getInstance(dw0Var2.H.currentAccount);
                        tL_messageMediaPoll3 = tL_messageMediaPoll2;
                        String publicUsername = DialogObject.getPublicUsername(messagesController.getUserOrChat(dw0Var2.H.getDialogId()));
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(messagesController.linkPrefix);
                        sb2.append("/");
                        if (TextUtils.isEmpty(publicUsername)) {
                            publicUsername = "c/" + (-dw0Var2.H.getDialogId());
                        }
                        sb2.append(publicUsername);
                        sb2.append("/");
                        sb2.append(dw0Var2.H.getId());
                        sb2.append("?option=");
                        sb2.append(new String(Base64.encode(pollAnswer3.option, 9)));
                        z16 = false;
                        G.c(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new xi0(27, dw0Var2, sb2.toString()), false);
                    }
                    G.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new xi0(28, dw0Var2, pollAnswer3), z16);
                    TLRPC.Peer peer = pollAnswer3.added_by;
                    if (peer != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        long clientUserId = UserConfig.getInstance(dw0Var2.H.currentAccount).getClientUserId();
                        cVar = cVar2;
                        long currentTime = ConnectionsManager.getInstance(dw0Var2.H.currentAccount).getCurrentTime();
                        wn wnVar4 = wnVar2;
                        long j3 = MessagesController.getInstance(dw0Var2.H.currentAccount).config.pollAnswerDeletePeriod.get(TimeUnit.SECONDS) + pollAnswer3.date;
                        if (!dw0Var2.H.isForwarded()) {
                            TLRPC.Poll poll2 = tL_messageMediaPoll3.poll;
                            if (!poll2.closed && (poll2.creator || (peerDialogId == clientUserId && currentTime < j3))) {
                                G.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new xi0(29, dw0Var2, bArr2), true);
                            }
                        }
                        G.k();
                        TLObject userOrChat = MessagesController.getInstance(dw0Var2.H.currentAccount).getUserOrChat(peerDialogId);
                        CharSequence replaceTags = AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.PollAddedByAtTime, DialogObject.getShortName(userOrChat), LocaleController.formatDateTime(pollAnswer3.date, true)));
                        wnVar2 = wnVar4;
                        a3.h0 h0Var = new a3.h0(dw0Var2, peerDialogId, wnVar2, 29);
                        Context context2 = G.e;
                        FrameLayout frameLayout = new FrameLayout(context2);
                        int i19 = org.telegram.ui.ActionBar.h6.i6;
                        org.telegram.ui.ActionBar.d6 d6Var2 = G.d;
                        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.Y(org.telegram.ui.ActionBar.h6.v0(i19, d6Var2), 0, 12));
                        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context2);
                        w9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
                        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
                        h9Var.p(userOrChat);
                        w9Var.e(userOrChat, h9Var);
                        frameLayout.addView(w9Var, w7.y5.d(34, 34.0f, 51, 13.0f, 11.0f, 0.0f, 11.0f));
                        TextView textView = new TextView(context2);
                        org.telegram.messenger.ok.n(org.telegram.ui.ActionBar.h6.j5, d6Var2, textView, 1, 14.0f);
                        textView.setText(replaceTags);
                        textView.setMaxWidth(AndroidUtilities.dp(150.0f));
                        textView.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                        frameLayout.addView(textView, w7.y5.d(-2, -2.0f, 55, 59.0f, 8.0f, 16.0f, 0.0f));
                        frameLayout.setOnClickListener(new org.telegram.ui.Components.et(7, G, h0Var));
                        G.r(frameLayout, w7.y5.n(-1, -2));
                    } else {
                        cVar = cVar2;
                    }
                } else {
                    dw0Var2 = dw0Var;
                    yv0Var = yv0Var3;
                    cVar = cVar2;
                    messageObject = primaryMessageObject;
                }
                G.T(org.telegram.ui.ActionBar.h6.l1(0.06f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, d6Var)));
                G.Q(cVar, eh.b.k(d6Var), false);
                G.Y();
                ViewGroup viewGroup2 = G.A;
                dw0Var2.R = viewGroup2;
                viewGroup2.setPivotX(0.0f);
                dw0Var2.R.setPivotY(0.0f);
                yv0Var4.addView(dw0Var2.R, w7.y5.e(-2, -2, 51));
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                wnVar2.n8(messageObject, arrayList6, arrayList7, arrayList8);
                af afVar2 = new af(wnVar2, 9);
                MessageObject messageObject7 = dw0Var2.H;
                List<TLRPC.TL_availableReaction> enabledReactionsList = wnVar2.getMediaDataController().getEnabledReactionsList();
                boolean z21 = (wnVar2.v() || wnVar2.c() || wnVar2.f != null || !messageObject7.hasReactions() || (ChatObject.isChannel(wnVar2.e) && !wnVar2.e.megagroup) || ChatObject.isMonoForum(wnVar2.e) || enabledReactionsList.isEmpty() || !messageObject7.messageOwner.reactions.can_see_list || messageObject7.isSecretMedia()) ? false : true;
                boolean z22 = !messageObject7.isForwardedChannelPost() ? messageObject7.isSecretMedia() || wnVar2.R3 == 5 || wnVar2.v() || wnVar2.c() || !messageObject7.isReactionsAvailable() || ((((chatFull = wnVar2.Z7) == null || ((chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull.paid_reactions_available)) && ((chatFull != null || ChatObject.isChannel(wnVar2.e)) && wnVar2.f == null && !ChatObject.isMonoForum(wnVar2.e))) || enabledReactionsList.isEmpty()) : (chatFull3 = wnVar2.getMessagesController().getChatFull(-messageObject7.getFromChatId())) != null && (wnVar2.v() || wnVar2.R3 == 5 || wnVar2.c() || !messageObject7.isReactionsAvailable() || (((chatFull3.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull3.paid_reactions_available) || enabledReactionsList.isEmpty()));
                boolean z23 = (z21 || wnVar2.c() || wnVar2.e == null || !messageObject7.isOutOwner() || !messageObject7.isSent() || messageObject7.isEditing() || messageObject7.isSending() || messageObject7.isSendError() || messageObject7.isContentUnread() || messageObject7.isUnread() || ConnectionsManager.getInstance(wnVar2.getCurrentAccount()).getCurrentTime() - messageObject7.messageOwner.date >= wnVar2.getMessagesController().chatReadMarkExpirePeriod || (!ChatObject.isMegagroup(wnVar2.e) && ChatObject.isChannel(wnVar2.e)) || (chatFull2 = wnVar2.Z7) == null || chatFull2.participants_count > wnVar2.getMessagesController().chatReadMarkSizeThreshold || (messageObject7.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || wnVar2.R3 == 3 || !messageObject7.canSetReaction() || ChatObject.isMonoForum(wnVar2.e)) ? false : true;
                if (wnVar2.e != null && !messageObject7.isOut() && ChatObject.isMonoForum(wnVar2.e) && ChatObject.canManageMonoForum(wnVar2.getCurrentAccount(), wnVar2.e)) {
                    int i20 = ((-wnVar2.e.linked_monoforum_id) > messageObject7.getFromChatId() ? 1 : ((-wnVar2.e.linked_monoforum_id) == messageObject7.getFromChatId() ? 0 : -1));
                }
                if (!z21 && wnVar2.e == null && wnVar2.h == null && (user = wnVar2.f) != null && !UserObject.isUserSelf(user) && !UserObject.isReplyUser(wnVar2.f) && !UserObject.isAnonymous(wnVar2.f)) {
                    TLRPC.User user2 = wnVar2.f;
                    if (!user2.bot && !UserObject.isService(user2.id) && (((userFull = wnVar2.a8) == null || !userFull.read_dates_private) && !wnVar2.c() && messageObject7.isOutOwner() && messageObject7.isSent() && !messageObject7.isEditing() && !messageObject7.isSending() && !messageObject7.isSendError() && !messageObject7.isContentUnread() && !messageObject7.isUnread() && wnVar2.getConnectionsManager().getCurrentTime() - messageObject7.messageOwner.date < wnVar2.getMessagesController().pmReadDateExpirePeriod && !(messageObject7.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                        z10 = true;
                        TLRPC.User user3 = wnVar2.f;
                        boolean z24 = ((user3 == null && (UserObject.isReplyUser(user3) || UserObject.isAnonymous(wnVar2.f))) || wnVar2.c() || !messageObject7.isEdited() || (messageObject7.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                        z11 = z23;
                        org.telegram.ui.Components.y70 G2 = org.telegram.ui.Components.y70.G(yv0Var, wnVar2.getResourceProvider(), null, !z21 || z23);
                        if (z11) {
                            dw0Var3 = dw0Var2;
                            messageObject2 = messageObject7;
                            y70Var = G2;
                            wnVar = wnVar2;
                            z12 = z22;
                            afVar = afVar2;
                            if (z10) {
                                y70Var.r(new org.telegram.ui.Components.kc0(dw0Var3.getContext(), 0, messageObject2, new sv0(dw0Var3, 1), dw0Var3.b), w7.y5.n(-1, 36));
                                y70Var.k();
                            } else if (z24) {
                                messageObject3 = messageObject2;
                                y70Var.r(new org.telegram.ui.Components.kc0(dw0Var3.getContext(), 1, messageObject2, new sv0(dw0Var3, 2), dw0Var3.b), w7.y5.n(-1, 36));
                                y70Var.k();
                                size = arrayList6.size();
                                i10 = 0;
                                while (i10 < size) {
                                    y70Var.c(((Integer) arrayList6.get(i10)).intValue(), (CharSequence) arrayList7.get(i10), new wl0(dw0Var3, afVar, ((Integer) arrayList8.get(i10)).intValue(), 4), false);
                                    i10++;
                                    arrayList6 = arrayList6;
                                }
                                y70Var.T(org.telegram.ui.ActionBar.h6.l1(0.06f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, d6Var)));
                                y70Var.Q(cVar, eh.b.k(d6Var), false);
                                y70Var.Y();
                                ViewGroup viewGroup3 = y70Var.A;
                                dw0Var3.T = viewGroup3;
                                viewGroup3.setPivotX(0.0f);
                                dw0Var3.T.setPivotY(0.0f);
                                yv0Var4.addView(dw0Var3.T, w7.y5.e(-2, -2, 51));
                                viewGroup = dw0Var3.T;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new ml0(dw0Var3, 6));
                                    dw0Var3.T.setOnTouchListener(new e0(dw0Var3, 5));
                                }
                                if (z12) {
                                    dw0Var4 = dw0Var3;
                                    wn wnVar5 = wnVar;
                                    org.telegram.ui.Components.qk0 qk0Var = new org.telegram.ui.Components.qk0((wnVar.getUserConfig().getClientUserId() > wnVar.a() ? 1 : (wnVar.getUserConfig().getClientUserId() == wnVar.a() ? 0 : -1)) == 0 ? 3 : 0, wnVar.getCurrentAccount(), dw0Var3.getContext(), wnVar5, dw0Var3.b);
                                    qk0Var.a = true;
                                    float f7 = 22;
                                    qk0Var.setPadding(AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : 24), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 24 : 0), AndroidUtilities.dp(f7));
                                    qk0Var.setDelegate(new xv0(dw0Var4, wnVar5, messageObject3, qk0Var));
                                    dw0Var4.Q = qk0Var;
                                    yv0Var4.addView(qk0Var, w7.y5.e(-2, (int) ((qk0Var.getTopOffset() / AndroidUtilities.density) + 52.0f + f7), 51));
                                    z13 = true;
                                    qk0Var.p(messageObject3, wnVar5.Z7, true);
                                    dw0Var4.Q.setTransitionProgress(1.0f);
                                } else {
                                    dw0Var4 = dw0Var3;
                                    z13 = true;
                                }
                                dw0Var4.e();
                                dw0Var4.e0 = new tm(this, 0);
                                dw0Var4.show();
                                return z13;
                            }
                        } else {
                            zh0 zh0Var = new zh0(dw0Var2.getContext(), wnVar2.getCurrentAccount(), messageObject7, wnVar2.e);
                            FrameLayout frameLayout2 = new FrameLayout(dw0Var2.getContext());
                            frameLayout2.addView(zh0Var, w7.y5.c(36.0f, -1));
                            org.telegram.ui.Components.y70 J2 = G2.J();
                            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, dw0Var2.getContext(), dw0Var2.b, true, false);
                            e1Var.setItemHeight(44);
                            dw0 dw0Var7 = dw0Var2;
                            e1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                            messageObject2 = messageObject7;
                            e1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                            FrameLayout frameLayout3 = new FrameLayout(dw0Var7.getContext());
                            LinearLayout linearLayout = new LinearLayout(dw0Var7.getContext());
                            linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G8, d6Var));
                            linearLayout.setOrientation(1);
                            wn wnVar6 = wnVar2;
                            org.telegram.ui.Components.wl0 a10 = zh0Var.a();
                            frameLayout3.addView(e1Var);
                            linearLayout.addView(frameLayout3);
                            z12 = z22;
                            linearLayout.addView(new org.telegram.ui.ActionBar.j1(dw0Var7.getContext(), d6Var), w7.y5.n(-1, 8));
                            frameLayout3.setOnClickListener(new vv0(G2));
                            afVar = afVar2;
                            wv0 wv0Var = new wv0(dw0Var7, zh0Var, wnVar6, a10, linearLayout, G2, J2);
                            wnVar = wnVar6;
                            dw0Var3 = dw0Var7;
                            y70Var = G2;
                            zh0Var.setOnClickListener(wv0Var);
                            linearLayout.addView(a10, w7.y5.n(-1, -2));
                            J2.q(linearLayout);
                            y70Var.q(frameLayout2);
                            y70Var.k();
                        }
                        messageObject3 = messageObject2;
                        size = arrayList6.size();
                        i10 = 0;
                        while (i10 < size) {
                        }
                        y70Var.T(org.telegram.ui.ActionBar.h6.l1(0.06f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, d6Var)));
                        y70Var.Q(cVar, eh.b.k(d6Var), false);
                        y70Var.Y();
                        ViewGroup viewGroup32 = y70Var.A;
                        dw0Var3.T = viewGroup32;
                        viewGroup32.setPivotX(0.0f);
                        dw0Var3.T.setPivotY(0.0f);
                        yv0Var4.addView(dw0Var3.T, w7.y5.e(-2, -2, 51));
                        viewGroup = dw0Var3.T;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z12) {
                        }
                        dw0Var4.e();
                        dw0Var4.e0 = new tm(this, 0);
                        dw0Var4.show();
                        return z13;
                    }
                }
                z10 = false;
                TLRPC.User user32 = wnVar2.f;
                if (user32 == null) {
                }
                z11 = z23;
                org.telegram.ui.Components.y70 G22 = org.telegram.ui.Components.y70.G(yv0Var, wnVar2.getResourceProvider(), null, !z21 || z23);
                if (z11) {
                }
                messageObject3 = messageObject2;
                size = arrayList6.size();
                i10 = 0;
                while (i10 < size) {
                }
                y70Var.T(org.telegram.ui.ActionBar.h6.l1(0.06f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, d6Var)));
                y70Var.Q(cVar, eh.b.k(d6Var), false);
                y70Var.Y();
                ViewGroup viewGroup322 = y70Var.A;
                dw0Var3.T = viewGroup322;
                viewGroup322.setPivotX(0.0f);
                dw0Var3.T.setPivotY(0.0f);
                yv0Var4.addView(dw0Var3.T, w7.y5.e(-2, -2, 51));
                viewGroup = dw0Var3.T;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z12) {
                }
                dw0Var4.e();
                dw0Var4.e0 = new tm(this, 0);
                dw0Var4.show();
                return z13;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean W0(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
        MessageObject messageObject = (currentMessagesGroup == null || currentMessagesGroup.messages.isEmpty()) ? u1Var.getMessageObject() : currentMessagesGroup.messages.get(0);
        if (messageObject != null) {
            wn wnVar = this.a;
            boolean z11 = !wnVar.ic && messageObject.getId() == wnVar.hc;
            if (!z10) {
                return z11;
            }
            if (z11 && System.currentTimeMillis() - wnVar.jc > 1000) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void X0(org.telegram.ui.Cells.u1 u1Var) {
        wn wnVar = this.a;
        wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(wnVar.T5), u1Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final hh.a Y() {
        return this.a.Pb;
    }

    @Override // org.telegram.ui.Cells.l1
    public final hv0 Y1() {
        return this.a.wa;
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
        wn wnVar = this.a;
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
                        int childCount = wnVar.x0.getChildCount();
                        for (int i11 = 0; i11 < childCount; i11++) {
                            View childAt = wnVar.x0.getChildAt(i11);
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
        wnVar.Jb(messageObject, spannableStringBuilder, 1);
        u1Var.g4(1, false, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean a0(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var == null ? null : u1Var.getMessageObject();
        if (messageObject == null || messageObject.messageOwner == null) {
            return false;
        }
        wn wnVar = this.a;
        return (wnVar.R3 == 1 || wnVar.y9() || messageObject.messageOwner.noforwards || messageObject.type == 29) ? false : true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean a2(long j3) {
        wn wnVar = this.a;
        TLRPC.Chat chat = wnVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return false;
        }
        return wnVar.getMessagesController().isAdmin(wnVar.e.id, j3);
    }

    public final void b(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        wn wnVar = this.a;
        jk jkVar = wnVar.Y;
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
                wnVar.Y.setFieldText(spannableStringBuilder);
                AndroidUtilities.runOnUIThread(new tm(this, 6), 200L);
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
        ok okVar;
        nk nkVar;
        if (!m()) {
            return false;
        }
        wn wnVar = this.a;
        ?? r22 = (wnVar.e == null || ((okVar = wnVar.O0) != null && okVar.getVisibility() == 0) || ((nkVar = wnVar.R) != null && nkVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat = wnVar.e;
        ?? r42 = (chat == null || !(wnVar.d4 == 0 || wnVar.h4) || (ChatObject.isChannel(chat) && !wnVar.e.megagroup)) ? 0 : 1;
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
        TLRPC.UserFull userFull = wnVar.getMessagesController().getUserFull(user.id);
        if (userFull != null) {
            b10 = x4.c(user, userFull, d5VarArr);
            if (!com.google.firebase.messaging.m.e(b10)) {
                i11 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
                b10 = x4.b(user, i11, d5VarArr);
            }
        } else {
            i10 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
            b10 = x4.b(user, i10, d5VarArr);
        }
        if (com.google.firebase.messaging.m.e(b10)) {
            com.google.firebase.messaging.m.k().v((ViewGroup) wnVar.fragmentView, wnVar.ea, b10, new b7(this, u1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.y70 H = org.telegram.ui.Components.y70.H(wnVar, u1Var);
        final int i12 = 0;
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(this) { // from class: org.telegram.ui.vm
            public final /* synthetic */ in b;

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
        H.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new r1(this, u1Var, user, 25), false);
        final int i13 = 1;
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new Runnable(this) { // from class: org.telegram.ui.vm
            public final /* synthetic */ in b;

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
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new Runnable(this) { // from class: org.telegram.ui.vm
            public final /* synthetic */ in b;

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
        org.telegram.ui.ActionBar.m2 m2Var;
        TLRPC.Chat chat2;
        TLRPC.MessageReplyHeader messageReplyHeader5;
        MessageObject messageObject;
        TLRPC.MessageReplyHeader messageReplyHeader6;
        TLRPC.MessageReplyHeader messageReplyHeader7;
        TLRPC.Message message3;
        TL_stories.StoryItem storyItem;
        org.telegram.ui.ActionBar.k kVar;
        boolean e = e();
        wn wnVar = this.a;
        if (!e && !z10) {
            kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
            if ((kVar.s() || wnVar.A9()) && !wnVar.c9.A(u1Var.getMessageObject())) {
                wn.b2(wnVar, u1Var, !u1Var.i3(f7), f7, f10);
                return;
            }
            return;
        }
        if (UserObject.isReplyUser(wnVar.f)) {
            r(u1Var);
            return;
        }
        MessageObject messageObject2 = u1Var.getMessageObject();
        if (messageObject2 == null) {
            return;
        }
        if (messageObject2.isReplyToStory() && (storyItem = (message3 = messageObject2.messageOwner).replyStory) != null) {
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                org.telegram.messenger.f0.p(R.string.StoryNotFound, org.telegram.ui.Components.yc.a0(wnVar), R.raw.story_bomb1, 36);
                return;
            }
            storyItem.dialogId = DialogObject.getPeerDialogId(message3.reply_to.peer);
            storyItem.messageId = messageObject2.getId();
            storyItem.messageType = 3;
            ai.ia.b(storyItem, wnVar.f);
            wnVar.getOrCreateStoryViewer().F(wnVar.getParentActivity(), storyItem, ai.u9.a(wnVar.x0));
            return;
        }
        TLRPC.Message message4 = messageObject2.messageOwner;
        if (message4 != null && (messageReplyHeader7 = message4.reply_to) != null && (messageReplyHeader7.flags & 2048) != 0) {
            num = Integer.valueOf(messageReplyHeader7.todo_item_id);
        } else {
            if (message4 != null && (messageReplyHeader2 = message4.reply_to) != null && (bArr = messageReplyHeader2.poll_option) != null) {
                num = null;
                str = null;
                long j10 = wnVar.T5;
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
                org.telegram.ui.Components.yc.a0(wnVar).Q(R.raw.error, 36, LocaleController.getString((message5 == null && (messageReplyHeader3 = message5.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
            }
            if (message4 != null && (messageReplyHeader = message4.reply_to) != null && messageReplyHeader.quote) {
                String str3 = messageReplyHeader.quote_text;
                r9 = (messageReplyHeader.flags & 1024) != 0 ? messageReplyHeader.quote_offset : -1;
                str = str3;
                num = null;
                bArr = null;
                long j102 = wnVar.T5;
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
                            chat = j3 < 0 ? wnVar.getMessagesController().getChat(Long.valueOf(-j3)) : null;
                            if (j3 != Long.MAX_VALUE) {
                                boolean z12 = z11;
                                if (j3 == wnVar.T5 || chat == null || ChatObject.isPublic(chat) || (!chat.left && !chat.kicked)) {
                                    if (((j3 == wnVar.T5 && (!ChatObject.isForum(wnVar.e) || !z12)) || j3 == Long.MAX_VALUE) && (wnVar.R3 != 3 || ((messageObject = messageObject2.replyMessageObject) != null && messageObject.getSavedDialogId() == wnVar.d()))) {
                                        int i11 = wnVar.R3;
                                        if (i11 == 2 || i11 == 1) {
                                            wnVar.V8.S0(i10);
                                            wnVar.finishFragment();
                                            return;
                                        }
                                        if (bArr != null) {
                                            wnVar.R7 = bArr;
                                        } else if (num != null) {
                                            wnVar.Q7 = num;
                                        } else {
                                            TLRPC.Message message6 = messageObject2.messageOwner;
                                            if (message6 != null && (messageReplyHeader5 = message6.reply_to) != null && messageReplyHeader5.quote) {
                                                wnVar.N7 = true;
                                                wnVar.P7 = messageReplyHeader5.quote_text;
                                                wnVar.S7 = r9;
                                                wnVar.M7 = true;
                                            }
                                        }
                                        ei.l3 l3Var = new ei.l3(this, i10, messageObject2, num, bArr, 18);
                                        if (!wnVar.A0.N) {
                                            l3Var.run();
                                            return;
                                        }
                                        wnVar.r3 = false;
                                        wnVar.lb(false, true, false);
                                        wnVar.Fc(wnVar.getMediaDataController().getMask(), wnVar.getMediaDataController().getSearchPosition(), wnVar.getMediaDataController().getSearchCount());
                                        AndroidUtilities.runOnUIThread(l3Var, 80L);
                                        return;
                                    }
                                    Integer num2 = num;
                                    byte[] bArr2 = bArr;
                                    if (LaunchActivity.G1 != null) {
                                        nf.e eVar = wnVar.zb;
                                        if (eVar != null) {
                                            eVar.a(false);
                                            m2Var = null;
                                            wnVar.zb = null;
                                        } else {
                                            m2Var = null;
                                        }
                                        LaunchActivity launchActivity = LaunchActivity.G1;
                                        final j0 j0Var = new j0(this, messageObject2, u1Var);
                                        wnVar.zb = j0Var;
                                        int id2 = messageObject2.getId();
                                        ArrayList arrayList = launchActivity.d0;
                                        if (j3 < 0 && (chat2 = MessagesController.getInstance(launchActivity.O).getChat(Long.valueOf(-j3))) != null && ChatObject.isForum(chat2)) {
                                            j0Var.d();
                                            final int i12 = 0;
                                            launchActivity.k0(j3, Integer.valueOf(i10), str2, num2, bArr2, new Runnable() { // from class: org.telegram.ui.h90
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
                                                launchActivity.k0(j3, Integer.valueOf(i10), str4, num2, bArr2, new Runnable() { // from class: org.telegram.ui.h90
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
                                        org.telegram.ui.ActionBar.m2 m2Var2 = !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.m2) hg.c.g(1, arrayList) : m2Var;
                                        if (m2Var2 == null || MessagesController.getInstance(launchActivity.O).checkCanOpenChat(bundle, m2Var2)) {
                                            AndroidUtilities.runOnUIThread(new g90(launchActivity, bundle, bArr2, i10, num2, str4, i13, j3, j0Var, m2Var2));
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
                                org.telegram.ui.Components.yc.a0(wnVar).Q(R.raw.error, 36, LocaleController.getString((message52 == null && (messageReplyHeader3 = message52.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
                            } else {
                                messageObject2.replyTextRevealed = true;
                                wnVar.qc(messageObject2, true);
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
                    org.telegram.ui.Components.yc.a0(wnVar).Q(R.raw.error, 36, LocaleController.getString((message522 == null && (messageReplyHeader3 = message522.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
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
                org.telegram.ui.Components.yc.a0(wnVar).Q(R.raw.error, 36, LocaleController.getString((message5222 == null && (messageReplyHeader3 = message5222.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
            }
            num = null;
        }
        bArr = null;
        str = null;
        long j1022 = wnVar.T5;
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
        org.telegram.ui.Components.yc.a0(wnVar).Q(R.raw.error, 36, LocaleController.getString((message52222 == null && (messageReplyHeader3 = message52222.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
    }

    public final void c(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        wn wnVar = this.a;
        jk jkVar = wnVar.Y;
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
                SpannableString spannableString = new SpannableString(v7.j.t(UserObject.getFirstName(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.c61("" + user.id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            wnVar.Y.setFieldText(spannableStringBuilder);
            AndroidUtilities.runOnUIThread(new tm(this, 7), 200L);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean c1(int i10, org.telegram.ui.Cells.u1 u1Var) {
        wn wnVar = this.a;
        return wnVar.vb != 0 && u1Var.getMessageObject() != null && wnVar.vb == u1Var.getMessageObject().getId() && wnVar.wb == i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:259:0x03f6, code lost:
    
        if (r9.paid_reactions_available != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x03fc, code lost:
    
        if (r8.isEmpty() == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x042c, code lost:
    
        if (r9.paid_reactions_available != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0448, code lost:
    
        if (r8.isEmpty() != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0436, code lost:
    
        if (org.telegram.messenger.ChatObject.isChannel(r5.e) == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0442, code lost:
    
        if (org.telegram.messenger.ChatObject.isMonoForum(r5.e) != false) goto L142;
     */
    /* JADX WARN: Removed duplicated region for block: B:182:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x05b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x071a A[LOOP:2: B:204:0x0718->B:205:0x071a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03c5  */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c2(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem) {
        ae1 ae1Var;
        TLRPC.TodoItem todoItem2;
        TLRPC.TodoCompletion todoCompletion;
        ae1 ae1Var2;
        MessageObject messageObject;
        ae1 ae1Var3;
        int i10;
        MessageObject messageObject2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        af afVar;
        MessageObject messageObject3;
        boolean z14;
        ArrayList arrayList;
        ArrayList arrayList2;
        de1 de1Var;
        ArrayList arrayList3;
        wn wnVar;
        MessageObject messageObject4;
        int size;
        int i11;
        ViewGroup viewGroup;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        final wn wnVar2 = this.a;
        if (wnVar2.getParentActivity() == null || wnVar2.getParentActivity() == null) {
            return false;
        }
        ci.e4 e4Var = wnVar2.x1;
        if (e4Var != null && e4Var.V) {
            e4Var.e(true);
        }
        ul ulVar = wnVar2.B1;
        if (ulVar != null && ulVar.V) {
            ulVar.e(true);
        }
        MessageObject primaryMessageObject = u1Var.getPrimaryMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(primaryMessageObject);
        if (primaryMessageObject == null || !(media instanceof TLRPC.TL_messageMediaToDo)) {
            return false;
        }
        wnVar2.d5 = primaryMessageObject;
        wnVar2.e5 = null;
        final de1 de1Var2 = new de1(wnVar2.getParentActivity(), wnVar2.getResourceProvider());
        final int i12 = todoItem.id;
        de1Var2.K = u1Var;
        de1Var2.O = i12;
        MessageObject messageObject5 = u1Var.getMessageObject();
        de1Var2.G = messageObject5;
        de1Var2.H = messageObject5 != null && messageObject5.isOutOwner();
        org.telegram.ui.Cells.u1 u1Var2 = de1Var2.K;
        ae1 ae1Var4 = de1Var2.c;
        if (u1Var2 != null) {
            de1Var2.L = wnVar2.s9 - AndroidUtilities.dp(4.0f);
            de1Var2.M = u1Var.n;
            if (u1Var.getParent() instanceof View) {
                View view = (View) u1Var.getParent();
                de1Var2.L = view.getY() + de1Var2.L;
                de1Var2.M = view.getY() + de1Var2.M;
            }
            int width = de1Var2.K.getWidth();
            int height = de1Var2.K.getHeight();
            de1Var2.K.getHeight();
            ae1Var = ae1Var4;
            be1 be1Var = new be1(de1Var2, de1Var2.getContext(), UserConfig.selectedAccount, de1Var2.K.getResourcesProvider(), i12, width, height);
            de1Var2.I = be1Var;
            de1Var2.K.h1(be1Var);
            de1Var2.I.i1(de1Var2.K);
            de1Var2.I.setDelegate(new ce1(de1Var2));
            be1 be1Var2 = de1Var2.I;
            MessageObject messageObject6 = de1Var2.G;
            MessageObject.GroupedMessages currentMessagesGroup = de1Var2.K.getCurrentMessagesGroup();
            org.telegram.ui.Cells.u1 u1Var3 = de1Var2.K;
            be1Var2.X3(messageObject6, currentMessagesGroup, u1Var3.F, u1Var3.E, u1Var3.G, false);
            ae1Var.addView(de1Var2.I, new FrameLayout.LayoutParams(de1Var2.K.getWidth(), height, 51));
            cw0 cw0Var = new cw0(de1Var2.getContext(), UserConfig.selectedAccount, de1Var2.K.getResourcesProvider(), width, height, 1);
            de1Var2.J = cw0Var;
            de1Var2.K.j1(cw0Var);
            de1Var2.K.h1(de1Var2.J);
            de1Var2.J.i1(de1Var2.K);
            de1Var2.J.setDelegate(new qb.b(18));
            cw0 cw0Var2 = de1Var2.J;
            MessageObject messageObject7 = de1Var2.G;
            MessageObject.GroupedMessages currentMessagesGroup2 = de1Var2.K.getCurrentMessagesGroup();
            org.telegram.ui.Cells.u1 u1Var4 = de1Var2.K;
            cw0Var2.X3(messageObject7, currentMessagesGroup2, u1Var4.F, u1Var4.E, u1Var4.G, false);
            ae1Var.addView(de1Var2.J, new FrameLayout.LayoutParams(de1Var2.K.getWidth(), height, 51));
        } else {
            ae1Var = ae1Var4;
        }
        ci.i1 i1Var = de1Var2.e;
        i1Var.bringToFront();
        ae1 ae1Var5 = de1Var2.d;
        ae1Var5.bringToFront();
        de1Var2.h.bringToFront();
        i1Var.w(false);
        org.telegram.ui.ActionBar.d6 d6Var = de1Var2.a;
        org.telegram.ui.Components.y70 F = org.telegram.ui.Components.y70.F(ae1Var, d6Var, null);
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) MessageObject.getMedia(de1Var2.G);
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
        if (!de1Var2.G.canCompleteTodo()) {
            ae1Var2 = ae1Var5;
        } else if (todoCompletion != null) {
            ae1Var2 = ae1Var5;
            F.p(14, -1, LocaleController.formatTodoCompletedDate(todoCompletion.date));
            F.k();
            final int i15 = 1;
            F.c(R.drawable.msg_cancel, LocaleController.getString(R.string.TodoUncheck), new Runnable() { // from class: org.telegram.ui.vd1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            wn wnVar3 = wnVar2;
                            rv0 rv0Var = new rv0(wnVar3);
                            de1 de1Var3 = de1Var2;
                            rv0Var.p0(MessageObject.getMedia(de1Var3.G), false, i12);
                            rv0Var.e0 = new ds0(16, de1Var3, wnVar3);
                            wnVar3.presentFragment(rv0Var);
                            de1Var3.c(false);
                            break;
                        case 1:
                            boolean c10 = wnVar2.c();
                            de1 de1Var4 = de1Var2;
                            if (c10) {
                                Toast.makeText(de1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                be1 be1Var3 = de1Var4.I;
                                be1Var3.k4(be1Var3.O2(i12), false);
                            }
                            de1Var4.c(true);
                            break;
                        default:
                            boolean c11 = wnVar2.c();
                            de1 de1Var5 = de1Var2;
                            if (c11) {
                                Toast.makeText(de1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                be1 be1Var4 = de1Var5.I;
                                be1Var4.k4(be1Var4.O2(i12), false);
                            }
                            de1Var5.c(true);
                            break;
                    }
                }
            }, false);
        } else {
            ae1Var2 = ae1Var5;
            final int i16 = 2;
            F.c(R.drawable.msg_select, LocaleController.getString(R.string.TodoCheck), new Runnable() { // from class: org.telegram.ui.vd1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i16) {
                        case 0:
                            wn wnVar3 = wnVar2;
                            rv0 rv0Var = new rv0(wnVar3);
                            de1 de1Var3 = de1Var2;
                            rv0Var.p0(MessageObject.getMedia(de1Var3.G), false, i12);
                            rv0Var.e0 = new ds0(16, de1Var3, wnVar3);
                            wnVar3.presentFragment(rv0Var);
                            de1Var3.c(false);
                            break;
                        case 1:
                            boolean c10 = wnVar2.c();
                            de1 de1Var4 = de1Var2;
                            if (c10) {
                                Toast.makeText(de1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                be1 be1Var3 = de1Var4.I;
                                be1Var3.k4(be1Var3.O2(i12), false);
                            }
                            de1Var4.c(true);
                            break;
                        default:
                            boolean c11 = wnVar2.c();
                            de1 de1Var5 = de1Var2;
                            if (c11) {
                                Toast.makeText(de1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                be1 be1Var4 = de1Var5.I;
                                be1Var4.k4(be1Var4.O2(i12), false);
                            }
                            de1Var5.c(true);
                            break;
                    }
                }
            }, false);
        }
        if (todoItem2 != null) {
            F.c(R.drawable.menu_reply, LocaleController.getString(R.string.TodoItemQuote), new qd1(de1Var2, wnVar2, todoItem2, 2), false);
            if (de1Var2.G.getDialogId() < 0) {
                MessagesController messagesController = MessagesController.getInstance(de1Var2.G.currentAccount);
                String publicUsername = DialogObject.getPublicUsername(messagesController.getUserOrChat(de1Var2.G.getDialogId()));
                StringBuilder sb2 = new StringBuilder("https://");
                sb2.append(messagesController.linkPrefix);
                sb2.append("/");
                if (TextUtils.isEmpty(publicUsername)) {
                    StringBuilder sb3 = new StringBuilder("c/");
                    messageObject = primaryMessageObject;
                    ae1Var3 = ae1Var2;
                    sb3.append(-de1Var2.G.getDialogId());
                    publicUsername = sb3.toString();
                } else {
                    messageObject = primaryMessageObject;
                    ae1Var3 = ae1Var2;
                }
                sb2.append(publicUsername);
                sb2.append("/");
                sb2.append(de1Var2.G.getId());
                sb2.append("?task=");
                sb2.append(todoItem2.id);
                F.c(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new n81(10, de1Var2, sb2.toString()), false);
            } else {
                messageObject = primaryMessageObject;
                ae1Var3 = ae1Var2;
            }
            F.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new n81(11, de1Var2, todoItem2), false);
        } else {
            messageObject = primaryMessageObject;
            ae1Var3 = ae1Var2;
        }
        if (de1Var2.G.canEditMessage(wnVar2.e)) {
            final int i17 = 0;
            F.c(R.drawable.msg_edit, LocaleController.getString(R.string.TodoEditItem), new Runnable() { // from class: org.telegram.ui.vd1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i17) {
                        case 0:
                            wn wnVar3 = wnVar2;
                            rv0 rv0Var = new rv0(wnVar3);
                            de1 de1Var3 = de1Var2;
                            rv0Var.p0(MessageObject.getMedia(de1Var3.G), false, i13);
                            rv0Var.e0 = new ds0(16, de1Var3, wnVar3);
                            wnVar3.presentFragment(rv0Var);
                            de1Var3.c(false);
                            break;
                        case 1:
                            boolean c10 = wnVar2.c();
                            de1 de1Var4 = de1Var2;
                            if (c10) {
                                Toast.makeText(de1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                be1 be1Var3 = de1Var4.I;
                                be1Var3.k4(be1Var3.O2(i13), false);
                            }
                            de1Var4.c(true);
                            break;
                        default:
                            boolean c11 = wnVar2.c();
                            de1 de1Var5 = de1Var2;
                            if (c11) {
                                Toast.makeText(de1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                be1 be1Var4 = de1Var5.I;
                                be1Var4.k4(be1Var4.O2(i13), false);
                            }
                            de1Var5.c(true);
                            break;
                    }
                }
            }, false);
            if (tL_messageMediaToDo.todo.list.size() > 1) {
                i10 = 51;
                F.c(R.drawable.msg_delete, LocaleController.getString(R.string.TodoDeleteItem), new org.telegram.ui.Components.f21(de1Var2, tL_messageMediaToDo, i12, wnVar2, 11), false);
                F.T(org.telegram.ui.ActionBar.h6.l1(0.06f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, d6Var)));
                dh.e k10 = eh.b.k(d6Var);
                ah.c cVar = de1Var2.F;
                F.Q(cVar, k10, false);
                F.Y();
                ViewGroup viewGroup2 = F.A;
                de1Var2.Q = viewGroup2;
                viewGroup2.setPivotX(0.0f);
                de1Var2.Q.setPivotY(0.0f);
                ae1Var3.addView(de1Var2.Q, w7.y5.e(-2, -2, i10));
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                wnVar2.n8(messageObject, arrayList4, arrayList5, arrayList6);
                af afVar2 = new af(wnVar2, 10);
                messageObject2 = de1Var2.G;
                List<TLRPC.TL_availableReaction> enabledReactionsList = wnVar2.getMediaDataController().getEnabledReactionsList();
                boolean z15 = wnVar2.v() && !wnVar2.c() && wnVar2.f == null && messageObject2.hasReactions() && !((ChatObject.isChannel(wnVar2.e) && !wnVar2.e.megagroup) || ChatObject.isMonoForum(wnVar2.e) || enabledReactionsList.isEmpty() || !messageObject2.messageOwner.reactions.can_see_list || messageObject2.isSecretMedia());
                if (messageObject2.isForwardedChannelPost()) {
                    z10 = z15;
                    if (!messageObject2.isSecretMedia()) {
                        if (wnVar2.R3 != 5) {
                            if (!wnVar2.v()) {
                                if (!wnVar2.c()) {
                                    if (messageObject2.isReactionsAvailable()) {
                                        TLRPC.ChatFull chatFull2 = wnVar2.Z7;
                                        if (chatFull2 != null) {
                                            if (chatFull2.available_reactions instanceof TLRPC.TL_chatReactionsNone) {
                                            }
                                        }
                                        if (chatFull2 == null) {
                                        }
                                        if (wnVar2.f == null) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z11 = false;
                } else {
                    z10 = z15;
                    TLRPC.ChatFull chatFull3 = wnVar2.getMessagesController().getChatFull(-messageObject2.getFromChatId());
                    if (chatFull3 != null) {
                        if (!wnVar2.v()) {
                            if (wnVar2.R3 != 5) {
                                if (!wnVar2.c()) {
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
                z12 = (!z10 || wnVar2.c() || wnVar2.e == null || !messageObject2.isOutOwner() || !messageObject2.isSent() || messageObject2.isEditing() || messageObject2.isSending() || messageObject2.isSendError() || messageObject2.isContentUnread() || messageObject2.isUnread() || ConnectionsManager.getInstance(wnVar2.getCurrentAccount()).getCurrentTime() - messageObject2.messageOwner.date >= wnVar2.getMessagesController().chatReadMarkExpirePeriod || (!ChatObject.isMegagroup(wnVar2.e) && ChatObject.isChannel(wnVar2.e)) || (chatFull = wnVar2.Z7) == null || chatFull.participants_count > wnVar2.getMessagesController().chatReadMarkSizeThreshold || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || wnVar2.R3 == 3 || !messageObject2.canSetReaction() || ChatObject.isMonoForum(wnVar2.e)) ? false : true;
                if (wnVar2.e != null && !messageObject2.isOut() && ChatObject.isMonoForum(wnVar2.e) && ChatObject.canManageMonoForum(wnVar2.getCurrentAccount(), wnVar2.e)) {
                    int i18 = ((-wnVar2.e.linked_monoforum_id) > messageObject2.getFromChatId() ? 1 : ((-wnVar2.e.linked_monoforum_id) == messageObject2.getFromChatId() ? 0 : -1));
                }
                if (!z10 && wnVar2.e == null && wnVar2.h == null && (user = wnVar2.f) != null && !UserObject.isUserSelf(user) && !UserObject.isReplyUser(wnVar2.f) && !UserObject.isAnonymous(wnVar2.f)) {
                    user2 = wnVar2.f;
                    if (!user2.bot && !UserObject.isService(user2.id) && (((userFull = wnVar2.a8) == null || !userFull.read_dates_private) && !wnVar2.c() && messageObject2.isOutOwner() && messageObject2.isSent() && !messageObject2.isEditing() && !messageObject2.isSending() && !messageObject2.isSendError() && !messageObject2.isContentUnread() && !messageObject2.isUnread() && wnVar2.getConnectionsManager().getCurrentTime() - messageObject2.messageOwner.date < wnVar2.getMessagesController().pmReadDateExpirePeriod && !(messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                        z13 = true;
                        TLRPC.User user3 = wnVar2.f;
                        boolean z17 = ((user3 == null && (UserObject.isReplyUser(user3) || UserObject.isAnonymous(wnVar2.f))) || wnVar2.c() || !messageObject2.isEdited() || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                        org.telegram.ui.Components.y70 G = org.telegram.ui.Components.y70.G(de1Var2.c, wnVar2.getResourceProvider(), null, !z10 || z12);
                        if (z12) {
                            afVar = afVar2;
                            messageObject3 = messageObject2;
                            z14 = z16;
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            de1Var = de1Var2;
                            arrayList3 = arrayList6;
                            wnVar = wnVar2;
                            if (z13) {
                                G.r(new org.telegram.ui.Components.kc0(de1Var.getContext(), 0, messageObject3, new ud1(de1Var, 0), de1Var.a), w7.y5.n(-1, 36));
                                G.k();
                            } else if (z17) {
                                messageObject4 = messageObject3;
                                G.r(new org.telegram.ui.Components.kc0(de1Var.getContext(), 1, messageObject3, new ud1(de1Var, 2), de1Var.a), w7.y5.n(-1, 36));
                                G.k();
                                i11 = 0;
                                for (size = arrayList.size(); i11 < size; size = size) {
                                    G.c(((Integer) arrayList.get(i11)).intValue(), (CharSequence) arrayList2.get(i11), new wl0(de1Var, afVar, ((Integer) arrayList3.get(i11)).intValue(), 9), false);
                                    i11++;
                                    arrayList3 = arrayList3;
                                }
                                G.T(org.telegram.ui.ActionBar.h6.l1(0.06f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, d6Var)));
                                G.Q(cVar, eh.b.k(d6Var), false);
                                G.Y();
                                ViewGroup viewGroup3 = G.A;
                                de1Var.S = viewGroup3;
                                viewGroup3.setPivotX(0.0f);
                                de1Var.S.setPivotY(0.0f);
                                ViewGroup viewGroup4 = de1Var.S;
                                FrameLayout.LayoutParams e = w7.y5.e(-2, -2, 51);
                                ae1 ae1Var6 = de1Var.d;
                                ae1Var6.addView(viewGroup4, e);
                                viewGroup = de1Var.S;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new ml0(de1Var, 22));
                                    de1Var.S.setOnTouchListener(new e0(de1Var, 7));
                                }
                                if (z14) {
                                    wn wnVar3 = wnVar;
                                    org.telegram.ui.Components.qk0 qk0Var = new org.telegram.ui.Components.qk0((wnVar.getUserConfig().getClientUserId() > wnVar.a() ? 1 : (wnVar.getUserConfig().getClientUserId() == wnVar.a() ? 0 : -1)) == 0 ? 3 : 0, wnVar3.getCurrentAccount(), de1Var.getContext(), wnVar3, de1Var.a);
                                    qk0Var.a = true;
                                    float f7 = 22;
                                    qk0Var.setPadding(AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : 24), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 24 : 0), AndroidUtilities.dp(f7));
                                    qk0Var.setDelegate(new zd1(de1Var, wnVar3, messageObject4, qk0Var));
                                    de1Var.P = qk0Var;
                                    ae1Var6.addView(qk0Var, w7.y5.e(-2, (int) ((qk0Var.getTopOffset() / AndroidUtilities.density) + 52.0f + f7), 51));
                                    qk0Var.p(messageObject4, wnVar3.Z7, true);
                                    de1Var.P.setTransitionProgress(1.0f);
                                }
                                de1Var.e();
                                de1Var.c0 = new tm(this, 5);
                                de1Var.show();
                                return true;
                            }
                        } else {
                            zh0 zh0Var = new zh0(de1Var2.getContext(), wnVar2.getCurrentAccount(), messageObject2, wnVar2.e);
                            FrameLayout frameLayout = new FrameLayout(de1Var2.getContext());
                            frameLayout.addView(zh0Var, w7.y5.c(36.0f, -1));
                            org.telegram.ui.Components.y70 J = G.J();
                            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, de1Var2.getContext(), de1Var2.a, true, false);
                            e1Var.setItemHeight(44);
                            e1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                            e1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                            FrameLayout frameLayout2 = new FrameLayout(de1Var2.getContext());
                            LinearLayout linearLayout = new LinearLayout(de1Var2.getContext());
                            linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G8, d6Var));
                            linearLayout.setOrientation(1);
                            wnVar = wnVar2;
                            org.telegram.ui.Components.wl0 a2 = zh0Var.a();
                            frameLayout2.addView(e1Var);
                            linearLayout.addView(frameLayout2);
                            z14 = z16;
                            linearLayout.addView(new org.telegram.ui.ActionBar.j1(de1Var2.getContext(), d6Var), w7.y5.n(-1, 8));
                            frameLayout2.setOnClickListener(new xd1(G));
                            messageObject3 = messageObject2;
                            afVar = afVar2;
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            yd1 yd1Var = new yd1(de1Var2, zh0Var, wnVar, a2, linearLayout, G, J);
                            G = G;
                            de1Var = de1Var2;
                            zh0Var.setOnClickListener(yd1Var);
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
                        G.T(org.telegram.ui.ActionBar.h6.l1(0.06f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, d6Var)));
                        G.Q(cVar, eh.b.k(d6Var), false);
                        G.Y();
                        ViewGroup viewGroup32 = G.A;
                        de1Var.S = viewGroup32;
                        viewGroup32.setPivotX(0.0f);
                        de1Var.S.setPivotY(0.0f);
                        ViewGroup viewGroup42 = de1Var.S;
                        FrameLayout.LayoutParams e7 = w7.y5.e(-2, -2, 51);
                        ae1 ae1Var62 = de1Var.d;
                        ae1Var62.addView(viewGroup42, e7);
                        viewGroup = de1Var.S;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z14) {
                        }
                        de1Var.e();
                        de1Var.c0 = new tm(this, 5);
                        de1Var.show();
                        return true;
                    }
                }
                z13 = false;
                TLRPC.User user32 = wnVar2.f;
                if (user32 == null) {
                }
                org.telegram.ui.Components.y70 G2 = org.telegram.ui.Components.y70.G(de1Var2.c, wnVar2.getResourceProvider(), null, !z10 || z12);
                if (z12) {
                }
                messageObject4 = messageObject3;
                i11 = 0;
                while (i11 < size) {
                }
                G2.T(org.telegram.ui.ActionBar.h6.l1(0.06f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, d6Var)));
                G2.Q(cVar, eh.b.k(d6Var), false);
                G2.Y();
                ViewGroup viewGroup322 = G2.A;
                de1Var.S = viewGroup322;
                viewGroup322.setPivotX(0.0f);
                de1Var.S.setPivotY(0.0f);
                ViewGroup viewGroup422 = de1Var.S;
                FrameLayout.LayoutParams e72 = w7.y5.e(-2, -2, 51);
                ae1 ae1Var622 = de1Var.d;
                ae1Var622.addView(viewGroup422, e72);
                viewGroup = de1Var.S;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z14) {
                }
                de1Var.e();
                de1Var.c0 = new tm(this, 5);
                de1Var.show();
                return true;
            }
        }
        i10 = 51;
        F.T(org.telegram.ui.ActionBar.h6.l1(0.06f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, d6Var)));
        dh.e k102 = eh.b.k(d6Var);
        ah.c cVar2 = de1Var2.F;
        F.Q(cVar2, k102, false);
        F.Y();
        ViewGroup viewGroup22 = F.A;
        de1Var2.Q = viewGroup22;
        viewGroup22.setPivotX(0.0f);
        de1Var2.Q.setPivotY(0.0f);
        ae1Var3.addView(de1Var2.Q, w7.y5.e(-2, -2, i10));
        ArrayList arrayList42 = new ArrayList();
        ArrayList arrayList52 = new ArrayList();
        ArrayList arrayList62 = new ArrayList();
        wnVar2.n8(messageObject, arrayList42, arrayList52, arrayList62);
        af afVar22 = new af(wnVar2, 10);
        messageObject2 = de1Var2.G;
        List<TLRPC.TL_availableReaction> enabledReactionsList2 = wnVar2.getMediaDataController().getEnabledReactionsList();
        if (wnVar2.v()) {
        }
        if (messageObject2.isForwardedChannelPost()) {
        }
        boolean z162 = z11;
        if (!z10) {
        }
        if (wnVar2.e != null) {
            int i182 = ((-wnVar2.e.linked_monoforum_id) > messageObject2.getFromChatId() ? 1 : ((-wnVar2.e.linked_monoforum_id) == messageObject2.getFromChatId() ? 0 : -1));
        }
        if (!z10) {
            user2 = wnVar2.f;
            if (!user2.bot) {
                z13 = true;
                TLRPC.User user322 = wnVar2.f;
                if (user322 == null) {
                }
                org.telegram.ui.Components.y70 G22 = org.telegram.ui.Components.y70.G(de1Var2.c, wnVar2.getResourceProvider(), null, !z10 || z12);
                if (z12) {
                }
                messageObject4 = messageObject3;
                i11 = 0;
                while (i11 < size) {
                }
                G22.T(org.telegram.ui.ActionBar.h6.l1(0.06f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, d6Var)));
                G22.Q(cVar2, eh.b.k(d6Var), false);
                G22.Y();
                ViewGroup viewGroup3222 = G22.A;
                de1Var.S = viewGroup3222;
                viewGroup3222.setPivotX(0.0f);
                de1Var.S.setPivotY(0.0f);
                ViewGroup viewGroup4222 = de1Var.S;
                FrameLayout.LayoutParams e722 = w7.y5.e(-2, -2, 51);
                ae1 ae1Var6222 = de1Var.d;
                ae1Var6222.addView(viewGroup4222, e722);
                viewGroup = de1Var.S;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z14) {
                }
                de1Var.e();
                de1Var.c0 = new tm(this, 5);
                de1Var.show();
                return true;
            }
        }
        z13 = false;
        TLRPC.User user3222 = wnVar2.f;
        if (user3222 == null) {
        }
        org.telegram.ui.Components.y70 G222 = org.telegram.ui.Components.y70.G(de1Var2.c, wnVar2.getResourceProvider(), null, !z10 || z12);
        if (z12) {
        }
        messageObject4 = messageObject3;
        i11 = 0;
        while (i11 < size) {
        }
        G222.T(org.telegram.ui.ActionBar.h6.l1(0.06f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, d6Var)));
        G222.Q(cVar2, eh.b.k(d6Var), false);
        G222.Y();
        ViewGroup viewGroup32222 = G222.A;
        de1Var.S = viewGroup32222;
        viewGroup32222.setPivotX(0.0f);
        de1Var.S.setPivotY(0.0f);
        ViewGroup viewGroup42222 = de1Var.S;
        FrameLayout.LayoutParams e7222 = w7.y5.e(-2, -2, 51);
        ae1 ae1Var62222 = de1Var.d;
        ae1Var62222.addView(viewGroup42222, e7222);
        viewGroup = de1Var.S;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
        }
        if (z14) {
        }
        de1Var.e();
        de1Var.c0 = new tm(this, 5);
        de1Var.show();
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
        wn wnVar = this.a;
        wnVar.getUserConfig().getCurrentUser();
        if (!AndroidUtilities.isContextSafe(wnVar.getParentActivity()) || (chat = wnVar.e) == null || currentUser == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
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
                z10 = channelParticipant.promoted_by == wnVar.getUserConfig().getClientUserId();
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
                    z11 = channelParticipant2.promoted_by == wnVar.getUserConfig().getClientUserId();
                } else {
                    z11 = false;
                    z13 = false;
                }
                str2 = channelParticipant2.rank;
                z12 = z11;
                boolean z15 = z13;
                boolean z16 = z14;
                Activity parentActivity = wnVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                long j3 = -wnVar.e.id;
                d6Var = ((org.telegram.ui.ActionBar.m2) wnVar).resourceProvider;
                org.telegram.ui.Components.l01.b(parentActivity, i10, j3, currentUser, str2, z15, z16, z12, d6Var);
            }
            if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                if (ChatObject.isChannel(wnVar.e)) {
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                    wnVar.getMessagesController();
                    tL_channels_getParticipant.channel = MessagesController.getInputChannel(wnVar.e);
                    tL_channels_getParticipant.participant = wnVar.getMessagesController().getInputPeer(currentUser.id);
                    wnVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new org.telegram.messenger.a(), new ai.m0(7, this, u1Var));
                    return;
                }
                return;
            }
            if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                z10 = false;
                z14 = true;
            } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                z10 = ((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == wnVar.getUserConfig().getClientUserId();
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
        Activity parentActivity2 = wnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
        long j32 = -wnVar.e.id;
        d6Var = ((org.telegram.ui.ActionBar.m2) wnVar).resourceProvider;
        org.telegram.ui.Components.l01.b(parentActivity2, i10, j32, currentUser, str2, z152, z162, z12, d6Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void d0(int i10) {
        int i11;
        SpannableStringBuilder replaceTags;
        int i12;
        int i13 = 3;
        int i14 = 2;
        int i15 = 1;
        wn wnVar = this.a;
        try {
            if (i10 == 0) {
                wnVar.h7();
                fl flVar = wnVar.z3;
                if (flVar == null) {
                    return;
                }
                flVar.l(0L, 84, null, new tm(this, i15));
                wnVar.z3.performHapticFeedback(3, 2);
                return;
            }
            if (i10 == 1) {
                String formatDateTime = LocaleController.formatDateTime(wnVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                if (wnVar.getMessagesController().transcribeAudioTrialCooldownUntil > 0) {
                    i12 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeftUntil", org.telegram.ui.Components.r31.h(i12), formatDateTime));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeft", org.telegram.ui.Components.r31.h(i11), new Object[0]));
                }
                org.telegram.ui.Components.yc.a0(wnVar).G(R.raw.transcribe, 6, replaceTags).k(true);
                wnVar.fragmentView.performHapticFeedback(3, 2);
                return;
            }
            if (i10 == 2 || i10 == 3) {
                String formatDateTime2 = LocaleController.formatDateTime(wnVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(wnVar);
                int i16 = R.raw.transcribe;
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialEnd", wnVar.getMessagesController().transcribeAudioTrialWeeklyNumber, new Object[0]))).append((CharSequence) " ").append(i10 == 2 ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TranscriptionTrialEndBuy), new tm(this, i14)) : wnVar.getMessagesController().transcribeAudioTrialCooldownUntil <= 0 ? "" : AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TranscriptionTrialEndWaitOrBuy, formatDateTime2), new tm(this, i13)));
                a02.getClass();
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(a02.W(), a02.c);
                ybVar.c(i16, 36, 36, new String[0]);
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
                ybVar.b.setText(append);
                ybVar.b.setSingleLine(false);
                ybVar.b.setMaxLines(6);
                a02.b(ybVar, 7000).k(true);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean e() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z10;
        wn wnVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
        if (kVar == null) {
            return false;
        }
        kVar2 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
        if (kVar2.s() || wnVar.A9()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.m2) wnVar).inPreviewMode;
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
        wn wnVar = this.a;
        if (!AndroidUtilities.isContextSafe(wnVar.getParentActivity()) || (chat = wnVar.e) == null || currentUser == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return;
        }
        d(u1Var, wnVar.getMessagesController().getParticipant(wnVar.e.id, currentUser.id));
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean f() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void f0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        this.a.I7(u1Var, true, false, f7, f10, false, false, false);
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
        wn wnVar = this.a;
        if (isHuaweiStoreApp) {
            nf.f.s(wnVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            nf.f.s(wnVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void g2(org.telegram.ui.Cells.u1 u1Var, long j3) {
        Bundle e = v7.j.e(j3, "user_id");
        org.telegram.ui.ActionBar.m2 m2Var = this.a;
        if (m2Var.getMessagesController().checkCanOpenChat(e, m2Var, u1Var.getMessageObject())) {
            m2Var.presentFragment(new wn(e));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final String h(org.telegram.ui.Cells.u1 u1Var) {
        wn wnVar;
        int i10;
        if (u1Var.getMessageObject() == null || (i10 = (wnVar = this.a).vb) == 0 || i10 != u1Var.getMessageObject().getId() || wnVar.wb != 3) {
            return null;
        }
        return wnVar.yb;
    }

    @Override // org.telegram.ui.Cells.l1
    public final int h0(org.telegram.ui.Cells.u1 u1Var) {
        qh.c cVar;
        wn wnVar = this.a;
        if (!wnVar.vc.f || (cVar = wnVar.Bc) == null || cVar.n != u1Var || cVar.a.getWidth() <= 0) {
            return 0;
        }
        return wnVar.Bc.a.getHeight();
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean h1(MessageObject messageObject) {
        jm jmVar;
        long dialogId = messageObject.getDialogId();
        wn wnVar = this.a;
        return (dialogId == UserObject.REPLY_BOT || ((jmVar = wnVar.A0) != null && jmVar.N)) && wnVar.R3 != 7;
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
            org.telegram.ui.ActionBar.m2 m2Var = this.a;
            m2Var.getSendMessagesHelper().editRichMessage(messageObject, messageObject.messageOwner.rich_message, null, m2Var, true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void i0(org.telegram.ui.Cells.u1 u1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        wn wnVar = this.a;
        if (wnVar.getParentActivity() == null) {
            return;
        }
        if (wnVar.X9 == null) {
            uh.i iVar = new uh.i(wnVar.getParentActivity());
            wnVar.X9 = iVar;
            wnVar.X0.addView(iVar, w7.y5.e(-1, -1, 48));
        }
        uh.i iVar2 = wnVar.X9;
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
        wn wnVar = this.a;
        if (a10) {
            org.telegram.ui.Components.yc.a0(wnVar).Q(R.raw.e_hand_2, 36, qh.i.b(messageObject, a2)).j();
            return;
        }
        if (i10 < 0 && !arrayList.isEmpty()) {
            wnVar.getSendMessagesHelper().sendVote(messageObject, arrayList, null);
            u1Var.S0(true);
            return;
        }
        if (wnVar.getParentActivity() == null) {
            return;
        }
        if (wnVar.n2 == null) {
            org.telegram.ui.Components.j40 j40Var = new org.telegram.ui.Components.j40(5, wnVar.getParentActivity(), wnVar.ea, false);
            wnVar.n2 = j40Var;
            j40Var.setAlpha(0.0f);
            wnVar.n2.setVisibility(4);
            int indexOfChild = wnVar.X0.indexOfChild(wnVar.S);
            if (indexOfChild == -1) {
                return;
            } else {
                wnVar.X0.addView(wnVar.n2, indexOfChild + 1, w7.y5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
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
                float y3 = ((u1Var.getY() + s1Var.b) - AndroidUtilities.dp(4.0f)) - wnVar.s9;
                wnVar.q2 = AndroidUtilities.dp(13.3f) + s1Var.a;
                int D = org.telegram.messenger.ok.D(6.0f, s1Var.b, i12);
                wnVar.r2 = D;
                if (y3 > 0.0f) {
                    i15 = wnVar.q2;
                    i13 = D;
                    f7 = 0.0f;
                    break;
                }
                i16++;
                f7 = y3;
            }
            if (f7 != 0.0f) {
                wnVar.x0.v0(0, (int) f7, null);
                wnVar.p2 = u1Var;
                return;
            }
            i14 = i15;
        }
        wnVar.n2.e(u1Var, Integer.valueOf(i10), i14, i13, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void k() {
        g();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void k1() {
        wn wnVar = this.a;
        wnVar.Q7();
        UndoView undoView = wnVar.y3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, wnVar.T5, null);
    }

    public final void l(org.telegram.ui.Cells.u1 u1Var, boolean z10, boolean z11, boolean z12) {
        MessageObject primaryMessageObject;
        int i10;
        int i11;
        uj ujVar;
        if (u1Var == null || (primaryMessageObject = u1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.forceUpdate = true;
        wn wnVar = this.a;
        rj rjVar = wnVar.x0;
        if (rjVar != null && (ujVar = wnVar.z0) != null && ujVar.y < 0) {
            for (int childCount = rjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = wnVar.x0.getChildAt(childCount);
                wnVar.x0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.u1)) {
                        if (childAt instanceof org.telegram.ui.Cells.w0) {
                            i11 = wnVar.L8(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = wnVar.L8(childAt);
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
                uj ujVar2 = wnVar.z0;
                wnVar.x0.getClass();
                ujVar2.i1(RecyclerView.R(u1Var), u1Var.getTop() - ((int) wnVar.s9), false);
            } else {
                wnVar.z0.h1(i10, i11);
            }
        }
        wnVar.N0 = z11;
        wnVar.rc(primaryMessageObject, false);
        wnVar.N0 = false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean l0() {
        boolean z10;
        wn wnVar = this.a;
        if (wnVar.A9()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.m2) wnVar).inPreviewMode;
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
        wn wnVar = this.a;
        if (wnVar.getParentActivity() == null || (messageObject = u1Var.getMessageObject()) == null || (message = messageObject.messageOwner) == null || messageObject.richLayout == null || (richMessage = message.rich_message) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        messageObject.richLayout.collectMediaBlocks(arrayList);
        int indexOf = arrayList.indexOf(pageBlock);
        if (indexOf < 0) {
            return false;
        }
        PhotoViewer t12 = PhotoViewer.t1();
        t12.J2(null, wnVar, null);
        return t12.e2(null, null, null, null, null, null, null, indexOf, new sm(wnVar, arrayList), null, 0L, 0L, 0L, true, new rm(richMessage, arrayList, messageObject), null);
    }

    public final boolean m() {
        wn wnVar = this.a;
        if (UserObject.isUserSelf(wnVar.f)) {
            return true;
        }
        TLRPC.Chat chat = wnVar.e;
        if (chat != null) {
            return !ChatObject.isChannel(chat) || wnVar.e.megagroup;
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void m1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        wn wnVar = this.a;
        if (wnVar.z9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        if (wnVar.getParentActivity() != null) {
            if (wnVar.O0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                jk jkVar = wnVar.Y;
                MessageObject messageObject = u1Var.getMessageObject();
                MessageObject messageObject2 = u1Var.getMessageObject();
                wi wiVar = null;
                String str = tL_inlineButtonTypeUrl != null ? tL_inlineButtonTypeUrl.url : null;
                nf.e eVar = wnVar.zb;
                if (eVar != null) {
                    eVar.a(true);
                    wnVar.zb = null;
                }
                if (str == null || u1Var.getMessageObject() == null) {
                    wnVar.zb = null;
                } else {
                    wi wiVar2 = new wi(wnVar, u1Var.getMessageObject().getId(), str, u1Var, 1);
                    wnVar.zb = wiVar2;
                    wiVar = wiVar2;
                }
                jkVar.c0(keyboardButtonProto, messageObject, messageObject2, wiVar);
            }
        }
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
        wn wnVar = this.a;
        if (geoPoint != null) {
            if (AndroidUtilities.isMapsInstalled(wnVar)) {
                fn fnVar = new fn(3);
                d6Var2 = ((org.telegram.ui.ActionBar.m2) wnVar).resourceProvider;
                fnVar.setResourceProvider(d6Var2);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = wnVar.getMessagesController().getPeer(wnVar.a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                tL_messageMediaGeo.geo = messageMedia.geo;
                String str = messageMedia.address;
                if (str == null) {
                    str = (pollAnswer == null || (tL_textWithEntities = pollAnswer.text) == null) ? "" : tL_textWithEntities.text;
                }
                tL_messageMediaGeo.address = str;
                tL_message.media = tL_messageMediaGeo;
                fnVar.O0 = false;
                fnVar.u0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                wnVar.presentFragment(fnVar);
                return;
            }
            return;
        }
        if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
            nt.q().w(wnVar.getParentActivity());
            nt.q().v(new gn(this, tL_messageMediaPoll, pollAnswer, u1Var));
            nt q6 = nt.q();
            TLRPC.Document document4 = messageMedia.document;
            int i18 = MessageObject.isAnimatedEmoji(document4) ? 2 : 0;
            MessageObject messageObject2 = u1Var.getMessageObject();
            d6Var = ((org.telegram.ui.ActionBar.m2) wnVar).resourceProvider;
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
            TLRPC.TL_message C7 = wn.C7(message);
            C7.media = messageMedia;
            C7.attachPath = qh.f.c(message, i10);
            ArrayList<MessageObject> arrayList = new ArrayList<>();
            i17 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
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
            i15 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
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
            TLRPC.TL_message C72 = wn.C7(message2);
            C72.media = messageMedia;
            C72.attachPath = qh.f.c(message2, i10);
            i16 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
            hn hnVar = new hn(i16, C72, false, true);
            if (MessageObject.canPreviewDocument(messageMedia.document)) {
                PhotoViewer.t1().J2(null, wnVar, wnVar.ea);
                PhotoViewer t12 = PhotoViewer.t1();
                int i19 = hnVar.type;
                t12.c2(hnVar, wnVar, i19 != 0 ? wnVar.T5 : 0L, i19 != 0 ? wnVar.L6 : 0L, i19 != 0 ? wnVar.d() : 0L, wnVar.Fa);
                return;
            }
            try {
                AndroidUtilities.openForView(hnVar, wnVar.getParentActivity(), wnVar.ea, false);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                wnVar.z6(hnVar);
                return;
            }
        }
        TLRPC.Message message3 = messageObject.messageOwner;
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
        if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || MessageObject.isVideoDocument(document3))) {
            i11 = messageMedia3 == messageMedia ? arrayList3.size() : -1;
            TLRPC.TL_message C73 = wn.C7(message3);
            C73.media = messageMedia3;
            C73.attachPath = qh.f.c(message3, -2);
            i14 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
            arrayList3.add(new ym(i14, C73, false, true));
            arrayList2.add(-2);
        } else {
            i11 = -1;
        }
        if (messageObject.expandedExplanation && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || MessageObject.isVideoDocument(document2))) {
            if (messageMedia2 == messageMedia) {
                i11 = arrayList3.size();
            }
            TLRPC.TL_message C74 = wn.C7(message3);
            C74.media = messageMedia2;
            C74.attachPath = qh.f.c(message3, -3);
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            C74.message = pollResults2.solution;
            C74.entities = pollResults2.solution_entities;
            i13 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
            arrayList3.add(new zm(i13, C74, false, true));
            arrayList2.add(-3);
        }
        zf.d.b(tL_messageMediaPoll.poll, wnVar.getUserConfig().getClientUserId());
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
                TLRPC.TL_message C75 = wn.C7(message3);
                C75.media = messageMedia4;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                C75.message = tL_textWithEntities2.text;
                C75.entities = tL_textWithEntities2.entities;
                C75.attachPath = qh.f.c(message3, pollAnswer2.unshuffled_index);
                i12 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                arrayList3.add(new an(i12, C75, false, true));
                arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
            }
        }
        if (i11 <= -1 || arrayList3.isEmpty()) {
            return;
        }
        messageObject.pollMediaMapping = arrayList2;
        PhotoViewer.t1().J2(null, wnVar, wnVar.ea);
        PhotoViewer.t1().a2(arrayList3, i11, wnVar.a(), 0L, 0L, wnVar.Ga);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void n0(String str) {
        wn wnVar = this.a;
        ok okVar = wnVar.O0;
        if (okVar == null || okVar.getVisibility() != 0) {
            nk nkVar = wnVar.R;
            if ((nkVar == null || nkVar.getVisibility() != 0) && wnVar.Y != null && str != null && str.length() > 0) {
                wnVar.Y.setFieldText("@" + str + " ");
                wnVar.Y.H0();
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void o(org.telegram.ui.Cells.u1 u1Var) {
        if (u1Var.getMessageObject().isImportedForward()) {
            k1();
            return;
        }
        wn wnVar = this.a;
        if (wnVar.l3 || wnVar.x0 == null || wnVar.getParentActivity() == null || wnVar.fragmentView == null) {
            return;
        }
        if (wnVar.u2 == null) {
            pm pmVar = wnVar.X0;
            int indexOfChild = pmVar.indexOfChild(wnVar.S);
            if (indexOfChild == -1) {
                return;
            }
            org.telegram.ui.Components.j40 j40Var = new org.telegram.ui.Components.j40(1, wnVar.getParentActivity(), wnVar.ea, false);
            wnVar.u2 = j40Var;
            pmVar.addView(j40Var, indexOfChild + 1, w7.y5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            wnVar.u2.setAlpha(0.0f);
            wnVar.u2.setVisibility(4);
        }
        wnVar.u2.e(u1Var, null, 0, 0, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean o0(org.telegram.ui.Components.z5 z5Var) {
        TLRPC.InputStickerSet inputStickerSet;
        int i10;
        wn wnVar = this.a;
        if (wnVar.getMessagesController().premiumFeaturesBlocked() || z5Var == null || z5Var.standard) {
            return false;
        }
        long documentId = z5Var.getDocumentId();
        TLRPC.Document document = z5Var.document;
        if (document == null) {
            i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
            document = org.telegram.ui.Components.q5.f(i10, documentId);
        }
        if (document == null || (inputStickerSet = MessageObject.getInputStickerSet(document)) == null) {
            return false;
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, true);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(inputStickerSet);
        org.telegram.ui.Components.uv uvVar = new org.telegram.ui.Components.uv(wnVar, wnVar.getParentActivity(), wnVar.ea, arrayList);
        org.telegram.ui.Components.kv kvVar = uvVar.f;
        kvVar.getClass();
        ImageReceiver imageReceiver = new ImageReceiver(kvVar);
        kvVar.v = imageReceiver;
        if (kvVar.d) {
            imageReceiver.onAttachedToWindow();
        }
        kvVar.w = true;
        kvVar.x.d(1.0f, true);
        kvVar.v.setImage(ImageLocation.getForDocument(document), "140_140", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "140_140", DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.h6.m6, 0.2f, true), 0L, null, null, 0);
        kvVar.v.setLayerNum(7);
        kvVar.v.setAllowStartLottieAnimation(true);
        kvVar.v.setAllowStartAnimation(true);
        kvVar.v.setAutoRepeat(1);
        kvVar.v.setAllowDecodeSingleFrame(true);
        kvVar.v.setParentView(kvVar);
        uvVar.setCalcMandatoryInsets(wnVar.x9());
        wnVar.showDialog(uvVar);
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void p() {
        this.a.X0.getClass();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void p1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
        if (u1Var == null || document == null) {
            return;
        }
        wn wnVar = this.a;
        if (wnVar.getParentLayout() == null || !a0(u1Var)) {
            return;
        }
        org.telegram.ui.Components.y70 H = org.telegram.ui.Components.y70.H(wnVar, u1Var);
        H.c(R.drawable.msg_download, LocaleController.getString(R.string.SaveToDownloads), new r1(this, u1Var, document, 24), false);
        H.t = false;
        H.Z();
    }

    public final void q(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, boolean z10) {
        wn wnVar = this.a;
        TLRPC.Chat chat2 = wnVar.e;
        if (chat2 != null && chat.id == chat2.id) {
            mj mjVar = wnVar.a1;
            if (mjVar != null && i10 == 0) {
                mjVar.e(false, false);
                return;
            } else {
                if (u1Var.getMessageObject() != null) {
                    wnVar.F(i10, u1Var.getMessageObject().getId(), 0, 0, true, false);
                    return;
                }
                return;
            }
        }
        if (chat2 == null || chat.id != chat2.id || wnVar.F9()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            xi xiVar = null;
            if (z10) {
                nf.e eVar = wnVar.zb;
                if (eVar != null) {
                    eVar.a(true);
                    wnVar.zb = null;
                }
                if (u1Var.getMessageObject() == null) {
                    wnVar.zb = null;
                } else {
                    xi xiVar2 = new xi(wnVar, u1Var.getMessageObject().getId(), u1Var, 0);
                    wnVar.zb = xiVar2;
                    xiVar = xiVar2;
                }
            }
            if (wnVar.getMessagesController().checkCanOpenChat(bundle, wnVar, u1Var.getMessageObject(), xiVar)) {
                wn wnVar2 = new wn(bundle);
                if (xiVar == null || i10 == 0) {
                    wnVar.presentFragment(wnVar2);
                } else {
                    AndroidUtilities.runOnUIThread(new ei.l3(this, xiVar, chat, i10, wnVar2, 17), 5000L);
                    xiVar.d();
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void q0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        wn wnVar = this.a;
        wnVar.I7(u1Var, false, false, f7, f10, true, false, false);
        wnVar.x0.getClass();
        wn.c2(wnVar, RecyclerView.R(u1Var));
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
        wn wnVar = this.a;
        if (wnVar.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.k31 k31Var = wnVar.R1;
        if (k31Var != null && wnVar.d4 == 0 && (u1Var.T7 || u1Var.U7)) {
            k31Var.m(u1Var.getMessageObject().getTopicId(), true);
            return;
        }
        if (wnVar.getMessagesController().isFrozen()) {
            i13 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
            b.b(i13);
            return;
        }
        jk jkVar = wnVar.Y;
        if (jkVar != null) {
            jkVar.P();
        }
        MessageObject messageObject = u1Var.getMessageObject();
        int i14 = wnVar.R3;
        if (i14 == 2) {
            wnVar.V8.S0(messageObject.getId());
            wnVar.finishFragment();
            return;
        }
        if (i14 == 3 || ((i14 == 7 && wnVar.O3 == 2) || !((!UserObject.isReplyUser(wnVar.f) && !UserObject.isUserSelf(wnVar.f)) || (messageFwdHeader = messageObject.messageOwner.fwd_from) == null || messageFwdHeader.saved_from_peer == null))) {
            if (UserObject.isReplyUser(wnVar.f) && (messageReplyHeader = (message = messageObject.messageOwner).reply_to) != null && (i10 = messageReplyHeader.reply_to_top_id) != 0) {
                wnVar.aa(messageReplyHeader.reply_to_peer_id.channel_id, null, i10, 0L, -1, message.fwd_from.saved_from_msg_id, messageObject);
                return;
            } else if (wnVar.R3 == 7 && wnVar.O3 == 2) {
                wnVar.fa(messageObject);
                return;
            } else {
                wnVar.ga(messageObject);
                return;
            }
        }
        ArrayList<MessageObject> arrayList = (messageObject.getGroupId() == 0 || (groupedMessages = (MessageObject.GroupedMessages) wnVar.x6.f(messageObject.getGroupId())) == null) ? null : groupedMessages.messages;
        if (arrayList == null) {
            arrayList = org.telegram.messenger.f0.k(messageObject);
        }
        if (wnVar.getMessagesController().storiesEnabled() && !messageObject.isSponsored() && (((message2 = messageObject.messageOwner) == null || !message2.noforwards) && (i12 = messageObject.type) != 17 && i12 != 12)) {
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
                wnVar.showDialog(new cn(this, wnVar.getParentActivity(), wnVar, arrayList, ChatObject.isChannel(wnVar.e), z10, wnVar.ea, z10, messageObject));
                Activity parentActivity = wnVar.getParentActivity();
                i11 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
                wnVar.fragmentView.requestLayout();
            }
        }
        z10 = false;
        wnVar.showDialog(new cn(this, wnVar.getParentActivity(), wnVar, arrayList, ChatObject.isChannel(wnVar.e), z10, wnVar.ea, z10, messageObject));
        Activity parentActivity2 = wnVar.getParentActivity();
        i11 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
        AndroidUtilities.setAdjustResizeToNothing(parentActivity2, i11);
        wnVar.fragmentView.requestLayout();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void s() {
        this.a.Yb();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void t(org.telegram.ui.Cells.u1 u1Var) {
        int i10;
        int i11;
        uj ujVar;
        MessageObject primaryMessageObject = u1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        primaryMessageObject.factCheckExpanded = !primaryMessageObject.factCheckExpanded;
        primaryMessageObject.forceUpdate = true;
        wn wnVar = this.a;
        rj rjVar = wnVar.x0;
        if (rjVar != null && (ujVar = wnVar.z0) != null && ujVar.y < 0) {
            for (int childCount = rjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = wnVar.x0.getChildAt(childCount);
                wnVar.x0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.u1)) {
                        if (childAt instanceof org.telegram.ui.Cells.w0) {
                            i11 = wnVar.L8(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = wnVar.L8(childAt);
                            break;
                        }
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        wnVar.rc(primaryMessageObject, false);
        ci.e4 e4Var = wnVar.A1;
        if (e4Var != null) {
            e4Var.e(true);
        }
        if (i10 < 0 || u1Var.getCurrentMessagesGroup() != null) {
            return;
        }
        wnVar.z0.h1(i10, i11);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void t0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
        org.telegram.ui.ActionBar.k kVar;
        wn wnVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
        boolean z10 = true;
        if (kVar.s() || wnVar.A9()) {
            wn.b2(wnVar, u1Var, true, f7, f10);
            return;
        }
        if (u1Var.getMessageObject() != null && u1Var.getMessageObject().isSponsored()) {
            P0(10, u1Var);
            return;
        }
        if (!ChatObject.isForum(wnVar.e) && !wnVar.F9()) {
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
        wn wnVar = this.a;
        wnVar.aa(wnVar.e.id, messageObject, messageObject.getId(), j10, i10, 0, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void u1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
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

    public final void v(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            org.telegram.ui.ActionBar.m2 m2Var = this.a;
            if (m2Var.getMessagesController().checkCanOpenChat(bundle, m2Var, u1Var.getMessageObject())) {
                m2Var.presentFragment(new wn(bundle));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:270:0x0b1a, code lost:
    
        if (r0.exists() != false) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0bdb, code lost:
    
        if (r4.startsWith("text/x-web-markdown") == false) goto L323;
     */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0c26 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10, boolean z10) {
        int i10;
        MessageObject messageObject;
        int i11;
        boolean z11;
        MessageObject messageObject2;
        wn wnVar;
        boolean z12;
        File file;
        TLRPC.Chat chat;
        vu0 E;
        char c10;
        vu0 vu0Var;
        float f11;
        float f12;
        char c11;
        MessageObject messageObject3;
        MessageObject messageObject4;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        int i12;
        MessageObject messageObject5 = u1Var.getMessageObject();
        int i13 = messageObject5.type;
        wn wnVar2 = this.a;
        if (i13 == 23) {
            TLRPC.MessageMedia messageMedia2 = messageObject5.messageOwner.media;
            TL_stories.StoryItem storyItem = messageMedia2.storyItem;
            if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia2.peer);
                storyItem.messageId = messageObject5.getId();
                storyItem.messageType = 2;
                ai.ia.b(storyItem, wnVar2.f);
                wnVar2.getOrCreateStoryViewer().F(wnVar2.getParentActivity(), messageObject5.messageOwner.media.storyItem, ai.u9.a(wnVar2.x0));
            }
        } else {
            int i14 = 1;
            if (messageObject5.isVideo()) {
                i12 = ((org.telegram.ui.ActionBar.m2) wnVar2).currentAccount;
                if (DownloadController.getInstance(i12).canDownloadMedia(messageObject5.messageOwner) == 1) {
                    messageObject5.putInDownloadsStore = true;
                }
            } else {
                messageObject5.putInDownloadsStore = true;
            }
            if (messageObject5.isSendError()) {
                wnVar2.I7(u1Var, false, false, f7, f10, true, false, false);
                return;
            }
            if (!messageObject5.isSending()) {
                int i15 = 0;
                if (!z10 || (message = messageObject5.messageOwner) == null || (messageMedia = message.media) == null || (webPage = messageMedia.webpage) == null || TextUtils.isEmpty(webPage.url)) {
                    int i16 = 5;
                    if (messageObject5.isDice()) {
                        um umVar = new um(this, messageObject5, i15);
                        if (messageObject5.isStakeableDice()) {
                            wnVar2.getMessagesController().loadStakeDiceInfo(new z(this, messageObject5, umVar, i16));
                            return;
                        } else {
                            umVar.run();
                            return;
                        }
                    }
                    if ((messageObject5.isAnimatedEmoji() && (!messageObject5.isAnimatedAnimatedEmoji() || (wnVar2.xa.e.containsKey(cz.q(MessageObject.findAnimatedEmojiEmoticon(messageObject5.getDocument()))) && wnVar2.f != null))) || messageObject5.isPremiumSticker()) {
                        wnVar2.Na(u1Var);
                        wnVar2.xa.l(u1Var, wnVar2, true);
                        wnVar2.x0.I0(false);
                        return;
                    }
                    int i17 = 6;
                    if (messageObject5.needDrawBluredPreview()) {
                        te fb2 = wnVar2.fb(messageObject5, false);
                        a3.h0 O4 = wn.O4(wnVar2, messageObject5);
                        u1Var.invalidate();
                        final SecretMediaViewer f13 = SecretMediaViewer.f();
                        final Activity parentActivity = wnVar2.getParentActivity();
                        int i18 = UserConfig.selectedAccount;
                        f13.a = i18;
                        ImageReceiver imageReceiver = f13.h;
                        imageReceiver.setCurrentAccount(i18);
                        if (f13.b != parentActivity) {
                            f13.b = parentActivity;
                            f13.g1 = new org.telegram.ui.Components.zm0(parentActivity, null);
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
                            f13.e.addView(f13.f, w7.y5.e(-1, -2, 80));
                            f13.e.setFocusable(false);
                            f13.d.addView(f13.e);
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f13.e.getLayoutParams();
                            layoutParams.width = -1;
                            layoutParams.height = -1;
                            layoutParams.gravity = 51;
                            f13.e.setLayoutParams(layoutParams);
                            f13.e.setFitsSystemWindows(true);
                            f13.e.setOnApplyWindowInsetsListener(new o41(f13, 0));
                            f13.e.setSystemUiVisibility(1792);
                            GestureDetector gestureDetector = new GestureDetector(f13.e.getContext(), f13);
                            f13.L0 = gestureDetector;
                            gestureDetector.setOnDoubleTapListener(f13);
                            org.telegram.ui.Components.y7 y7Var = new org.telegram.ui.Components.y7(f13, parentActivity, i17);
                            f13.F = y7Var;
                            y7Var.setTitleColor(-1);
                            f13.F.setSubtitleColor(-1);
                            f13.F.setBackgroundColor(2130706432);
                            f13.F.setOccupyStatusBar(true);
                            f13.F.A(1090519039, false);
                            f13.F.B(-1, false);
                            f13.F.setBackButtonImage(R.drawable.ic_ab_back);
                            f13.F.setTitleRightMargin(AndroidUtilities.dp(70.0f));
                            f13.e.addView(f13.F, w7.y5.c(-2.0f, -1));
                            f13.F.setActionBarMenuOnItemClick(new q70(f13, 29));
                            ci.e4 e4Var = new ci.e4(parentActivity, 1);
                            f13.r = e4Var;
                            e4Var.l(1.0f, -26.0f);
                            f13.r.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                            f13.e.addView(f13.r, w7.y5.d(-1, 80.0f, 53, 0.0f, 48.0f, 0.0f, 0.0f));
                            u41 u41Var = new u41(f13, parentActivity);
                            f13.n = u41Var;
                            f13.e.addView(u41Var, w7.y5.d(119, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
                            aw0 aw0Var = new aw0(f13, i14);
                            f13.U = new v41(f13, parentActivity);
                            View view2 = new View(parentActivity);
                            f13.T = view2;
                            view2.setBackgroundColor(2130706432);
                            f13.U.addView(f13.T, w7.y5.e(-1, -1, 119));
                            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(f13.e.getContext());
                            f13.S = h5Var;
                            h5Var.setTextColor(-1);
                            f13.S.setGravity(53);
                            f13.S.setTextSize(14);
                            f13.S.setImportantForAccessibility(2);
                            f13.U.addView(f13.S, w7.y5.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
                            n50 n50Var = new n50(f13, parentActivity, 8);
                            f13.R = n50Var;
                            org.telegram.ui.Components.u71 u71Var = new org.telegram.ui.Components.u71(n50Var);
                            f13.Q = u71Var;
                            u71Var.z = AndroidUtilities.dp(2.0f);
                            org.telegram.ui.Components.u71 u71Var2 = f13.Q;
                            u71Var2.k = 872415231;
                            u71Var2.l = 872415231;
                            u71Var2.m = -1;
                            u71Var2.n = -1;
                            u71Var2.A = 1509949439;
                            u71Var2.j = aw0Var;
                            f13.U.addView(f13.R);
                            f13.e.addView(f13.U, w7.y5.e(-1, 48, 80));
                            os0 os0Var = new os0(null, new ai.d());
                            f13.Y = os0Var;
                            os0Var.k0 = true;
                            os0Var.i0 = false;
                            ju0 ju0Var = new ju0(f13.e.getContext());
                            f13.Z = ju0Var;
                            ju0Var.setFactory(new ViewSwitcher.ViewFactory() { // from class: org.telegram.ui.p41
                                @Override // android.widget.ViewSwitcher.ViewFactory
                                public final View makeView() {
                                    SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
                                    return new iu0(parentActivity, secretMediaViewer.a0, secretMediaViewer.Y, new b5(secretMediaViewer, 22), new ig0(secretMediaViewer, 2));
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
                            imageView.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(64.0f), 1711276032));
                            org.telegram.ui.Components.pg0 pg0Var = new org.telegram.ui.Components.pg0(28);
                            f13.W = pg0Var;
                            pg0Var.setCallback(f13.V);
                            f13.V.setImageDrawable(f13.W);
                            f13.V.setScaleType(ImageView.ScaleType.CENTER);
                            f13.V.setScaleX(0.6f);
                            f13.V.setScaleY(0.6f);
                            f13.V.setAlpha(0.0f);
                            f13.V.setPivotX(AndroidUtilities.dp(32.0f));
                            f13.V.setPivotY(AndroidUtilities.dp(32.0f));
                            f13.e.addView(f13.V, w7.y5.e(64, 64, 17));
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
                        ml mlVar = wnVar2.Fa;
                        SecretMediaViewer.PhotoBackgroundDrawable photoBackgroundDrawable = f14.l0;
                        ImageReceiver imageReceiver2 = f14.h;
                        if (f14.b != null && messageObject5.needDrawBluredPreview()) {
                            if (mlVar != null && (E = mlVar.E(messageObject5, null, 0, true, false)) != null) {
                                f14.q1 = messageObject5.messageOwner.ttl == Integer.MAX_VALUE;
                                f14.p1 = O4;
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
                                    int i19 = 0;
                                    while (true) {
                                        int[] iArr2 = E.h;
                                        c10 = 1;
                                        if (i19 >= iArr2.length) {
                                            break;
                                        }
                                        f14.H0[i19] = iArr2[i19];
                                        i19++;
                                    }
                                } else {
                                    c10 = 1;
                                    f14.H0 = null;
                                }
                                float f15 = E.b;
                                float f16 = rectF.left;
                                f14.w0 = ((width / 2.0f) + (f15 + f16)) - (r9 / 2);
                                f14.x0 = ((height / 2.0f) + (E.c + rectF.top)) - (r7 / 2);
                                f14.v0 = Math.abs(f16 - E.a.getImageX());
                                int abs = (int) Math.abs(rectF.top - E.a.getImageY());
                                E.d.getLocationInWindow(new int[2]);
                                float f17 = (r2[c10] - (E.c + rectF.top)) + E.j;
                                f14.r0 = f17;
                                float f18 = abs;
                                f14.r0 = Math.max(0.0f, Math.max(f17, f18));
                                float height2 = (((E.c + rectF.top) + ((int) height)) - (E.d.getHeight() + r2[c10])) + E.i;
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
                                eb0 eb0Var = f14.l1;
                                if (eb0Var != null) {
                                    eb0Var.destroy();
                                    f14.l1 = null;
                                }
                                LaunchActivity launchActivity = LaunchActivity.G1;
                                f14.l1 = launchActivity != null ? new eb0(launchActivity, true) : null;
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
                                    int i20 = 0;
                                    while (true) {
                                        if (i20 >= document.attributes.size()) {
                                            break;
                                        }
                                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i20);
                                        if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) documentAttribute;
                                            f14.O = tL_documentAttributeVideo.w;
                                            f14.P = tL_documentAttributeVideo.h;
                                            break;
                                        }
                                        i20++;
                                    }
                                    if (MessageObject.isGifDocument(document)) {
                                        f14.F.setTitle(LocaleController.getString(R.string.DisappearingGif));
                                        String str = messageObject5.messageOwner.attachPath;
                                        ImageLocation forDocument = (str == null || !messageObject5.attachPathExists) ? ImageLocation.getForDocument(document) : ImageLocation.getForPath(str);
                                        f12 = 1.0f;
                                        f11 = 0.0f;
                                        vu0Var = E;
                                        c11 = 6;
                                        messageObject4 = messageObject5;
                                        imageReceiver2.setImage(forDocument, (String) null, f14.i0 != null ? new BitmapDrawable(f14.i0.bitmap) : null, -1L, (String) null, messageObject4, 1);
                                    } else {
                                        vu0Var = E;
                                        f11 = 0.0f;
                                        f12 = 1.0f;
                                        c11 = 6;
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
                                    vu0Var = E;
                                    f11 = 0.0f;
                                    f12 = 1.0f;
                                    c11 = 6;
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
                                    u41 u41Var2 = f14.n;
                                    u41Var2.e = true;
                                    TextPaint textPaint = u41Var2.r;
                                    textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                                    textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
                                    textPaint.setColor(-1);
                                    StaticLayout staticLayout = new StaticLayout("1", textPaint, 999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                                    u41Var2.s = staticLayout;
                                    u41Var2.v = staticLayout.getLineCount() > 0 ? u41Var2.s.getLineWidth(0) : 0.0f;
                                    u41Var2.w = u41Var2.s.getHeight();
                                    u41Var2.invalidate();
                                    f14.n.setOnClickListener(new y31(f14, 3));
                                } else {
                                    f14.n.setOnClickListener(null);
                                }
                                try {
                                    if (f14.d.getParent() != null) {
                                        ((WindowManager) f14.b.getSystemService("window")).removeView(f14.d);
                                    }
                                } catch (Exception e) {
                                    FileLog.e(e);
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
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(f14.a0, (Property<tt0, Float>) property, 0.0f, 1.0f);
                                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(f14.r, (Property<ci.e4, Float>) property, 0.0f, 1.0f);
                                ObjectAnimator ofInt = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.s6.d, 0, 255);
                                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(f14, f14.v1, 0.0f, 1.0f);
                                v41 v41Var = f14.U;
                                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(v41Var, v41Var.n, f12);
                                v41 v41Var2 = f14.U;
                                if (f14.J) {
                                    f11 = 1.0f;
                                }
                                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(v41Var2, (Property<v41, Float>) property, f11);
                                Animator[] animatorArr = new Animator[7];
                                animatorArr[0] = ofFloat;
                                animatorArr[1] = ofFloat2;
                                animatorArr[2] = ofFloat3;
                                animatorArr[3] = ofInt;
                                animatorArr[4] = ofFloat4;
                                animatorArr[5] = ofFloat5;
                                animatorArr[c11] = ofFloat6;
                                animatorSet.playTogether(animatorArr);
                                f14.m0 = 3;
                                f14.o0 = new jf0(f14, fb2, messageObject3, 26);
                                f14.K0.setDuration(250L);
                                f14.K0.addListener(new s41(f14, 0));
                                f14.n0 = System.currentTimeMillis();
                                if (SharedConfig.getDevicePerformanceClass() == 0) {
                                    f14.e.setLayerType(2, null);
                                }
                                f14.K0.setInterpolator(new DecelerateInterpolator());
                                photoBackgroundDrawable.b = 0;
                                photoBackgroundDrawable.a = new ix0(27, f14, vu0Var);
                                f14.K0.start();
                                return;
                            }
                        }
                    } else {
                        if (MessageObject.isAnimatedEmoji(messageObject5.getDocument()) && MessageObject.getInputStickerSet(messageObject5.getDocument()) != null) {
                            ArrayList arrayList = new ArrayList(1);
                            arrayList.add(MessageObject.getInputStickerSet(messageObject5.getDocument()));
                            org.telegram.ui.Components.uv uvVar = new org.telegram.ui.Components.uv(wnVar2, wnVar2.getParentActivity(), wnVar2.ea, arrayList);
                            uvVar.setCalcMandatoryInsets(wnVar2.x9());
                            wnVar2.showDialog(uvVar);
                            return;
                        }
                        if (messageObject5.getInputStickerSet() != null) {
                            org.telegram.ui.Components.fy0 fy0Var = new org.telegram.ui.Components.fy0(wnVar2.getParentActivity(), wnVar2, messageObject5.getInputStickerSet(), null, (wnVar2.O0.getVisibility() == 0 || !((chat = wnVar2.e) == null || ChatObject.canSendStickers(chat))) ? null : wnVar2.Y, wnVar2.ea);
                            fy0Var.setCalcMandatoryInsets(wnVar2.x9());
                            wnVar2.showDialog(fy0Var);
                            return;
                        }
                        if (messageObject5.isVideo() || (i10 = messageObject5.type) == 1 || ((i10 == 0 && !messageObject5.isWebpageDocument()) || messageObject5.isGif())) {
                            if (messageObject5.isSponsored()) {
                                if (messageObject5.isGif() || messageObject5.isPhoto()) {
                                    int i21 = 1;
                                    wnVar2.J9(messageObject5, true, false);
                                    if (messageObject5.sponsoredUrl != null) {
                                        nf.e eVar = wnVar2.zb;
                                        if (eVar != null) {
                                            eVar.a(true);
                                        }
                                        wnVar2.zb = u1Var.getMessageObject() == null ? null : new bn(this, u1Var, i21);
                                        nf.f.r(wnVar2.getParentActivity(), Uri.parse(messageObject5.sponsoredUrl), true, false, false, wnVar2.zb, null, false, wnVar2.getMessagesController().sponsoredLinksInappAllow, false);
                                        return;
                                    }
                                } else if (messageObject5.isVideo()) {
                                    wnVar2.J9(messageObject5, true, false);
                                }
                            }
                            if (messageObject5.getDuration() > 0.0d && messageObject5.getVideoStartsTimestamp() > 0 && !messageObject5.openedInViewer) {
                                messageObject5.forceSeekTo = (float) (messageObject5.getVideoStartsTimestamp() / messageObject5.getDuration());
                            }
                            wnVar2.ha(u1Var, messageObject5);
                            return;
                        }
                        int i22 = messageObject5.type;
                        if (i22 == 3) {
                            wnVar2.fb(messageObject5, true);
                            try {
                                String str2 = messageObject5.messageOwner.attachPath;
                                File file4 = (str2 == null || str2.length() == 0) ? null : new File(messageObject5.messageOwner.attachPath);
                                if (file4 == null || !file4.exists()) {
                                    file4 = wnVar2.getFileLoader().getPathToMessage(messageObject5.messageOwner);
                                }
                                Intent intent = new Intent("android.intent.action.VIEW");
                                if (Build.VERSION.SDK_INT >= 24) {
                                    intent.setFlags(1);
                                    intent.setDataAndType(FileProvider.d(wnVar2.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", file4), "video/mp4");
                                } else {
                                    intent.setDataAndType(Uri.fromFile(file4), "video/mp4");
                                }
                                wnVar2.getParentActivity().startActivityForResult(intent, 500);
                                return;
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                wnVar2.z6(messageObject5);
                            }
                        } else if (i22 == 4) {
                            if (AndroidUtilities.isMapsInstalled(wnVar2)) {
                                if (!messageObject5.isLiveLocation()) {
                                    cd0 cd0Var = new cd0(wnVar2.h == null ? 3 : 0);
                                    cd0Var.F0 = wnVar2;
                                    cd0Var.u0(messageObject5);
                                    wnVar2.presentFragment(cd0Var);
                                    return;
                                }
                                TLRPC.Chat chat2 = wnVar2.e;
                                cd0 cd0Var2 = new cd0((chat2 == null || ChatObject.canSendMessages(chat2) || wnVar2.e.megagroup) ? 2 : 6);
                                cd0Var2.F0 = wnVar2;
                                cd0Var2.u0(messageObject5);
                                wnVar2.presentFragment(cd0Var2);
                                return;
                            }
                        } else if (i22 == 9 || i22 == 0) {
                            if (messageObject5.getDocumentName().toLowerCase().endsWith("attheme")) {
                                String str3 = messageObject5.messageOwner.attachPath;
                                if (str3 != null && str3.length() != 0) {
                                    file = new File(messageObject5.messageOwner.attachPath);
                                }
                                file = null;
                                if (file == null) {
                                    File pathToMessage2 = wnVar2.getFileLoader().getPathToMessage(messageObject5.messageOwner);
                                    if (pathToMessage2.exists()) {
                                        file = pathToMessage2;
                                    }
                                }
                                org.telegram.ui.ActionBar.g6 u10 = org.telegram.ui.ActionBar.h6.u(file, messageObject5.getDocumentName(), null, true);
                                if (u10 != null) {
                                    wnVar2.presentFragment(new od1(u10));
                                    return;
                                }
                                wnVar2.x4 = -1;
                            }
                            if (messageObject5.canPreviewDocument()) {
                                PhotoViewer.t1().J2(null, wnVar2, wnVar2.ea);
                                PhotoViewer t12 = PhotoViewer.t1();
                                int i23 = messageObject5.type;
                                long j3 = i23 != 0 ? wnVar2.T5 : 0L;
                                long j10 = i23 != 0 ? wnVar2.L6 : 0L;
                                long d = i23 != 0 ? wnVar2.d() : 0L;
                                messageObject = messageObject5;
                                i11 = 3;
                                t12.c2(messageObject, wnVar2, j3, j10, d, wnVar2.Fa);
                                z11 = true;
                            } else {
                                messageObject = messageObject5;
                                i11 = 3;
                                z11 = false;
                            }
                            Pattern pattern = org.telegram.ui.Components.ba0.a;
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
                                wnVar = wnVar2;
                                messageObject2 = messageObject;
                                if (!z12) {
                                    try {
                                        AndroidUtilities.openForView(messageObject2, wnVar.getParentActivity(), wnVar.ea, false);
                                        return;
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                        wnVar.z6(messageObject2);
                                    }
                                }
                            }
                            if (wnVar2.getParentActivity() == null) {
                                wnVar = wnVar2;
                                messageObject2 = messageObject;
                            } else {
                                org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(wnVar2.getParentActivity(), i11, wnVar2.ea);
                                a2Var.setCanceledOnTouchOutside(false);
                                boolean[] zArr = {false};
                                a2Var.setOnCancelListener(new gh(0, zArr));
                                a2Var.q(150L);
                                MessageObject messageObject6 = messageObject;
                                org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(wnVar2, messageObject6, a2Var, zArr, 8);
                                messageObject2 = messageObject6;
                                wnVar = wnVar2;
                                new Thread(l5Var).start();
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
                if (!wnVar2.ea(str4, u1Var, null, messageObject5.getId(), 2)) {
                    nf.e eVar2 = wnVar2.zb;
                    if (eVar2 != null) {
                        eVar2.a(true);
                    }
                    wnVar2.zb = u1Var.getMessageObject() != null ? new bn(this, u1Var, i15) : null;
                    nf.f.r(wnVar2.getParentActivity(), Uri.parse(str4), true, false, false, wnVar2.zb, null, false, true, false);
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean v2(int i10) {
        boolean z10;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        if (i10 != 16 && i10 != R.id.acc_action_small_button && i10 != R.id.acc_action_msg_options) {
            return false;
        }
        wn wnVar = this.a;
        z10 = ((org.telegram.ui.ActionBar.m2) wnVar).inPreviewMode;
        if (!z10 || !wnVar.J9) {
            return !e();
        }
        b5Var = ((org.telegram.ui.ActionBar.m2) wnVar).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.m2) wnVar).parentLayout;
            ((ActionBarLayout) b5Var2).r();
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final String w(long j3) {
        TLRPC.Peer peer;
        String adminRank;
        wn wnVar = this.a;
        if (UserObject.isBotForum(wnVar.f)) {
            return null;
        }
        TLRPC.Chat chat = wnVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat) && (adminRank = wnVar.getMessagesController().getAdminRank(wnVar.e.id, j3)) != null) {
            return adminRank;
        }
        TLRPC.TL_forumTopic tL_forumTopic = wnVar.c4;
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
        wn wnVar = this.a;
        if (!wnVar.getUserConfig().isPremium()) {
            org.telegram.ui.Components.yc.a0(wnVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("UnlockSimilarChannelsPremium", wnVar.getMessagesController().recommendedChannelsLimitPremium), new tm(this, 4))).j();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", wnVar.T5);
        bundle.putInt("start_from", 10);
        wnVar.presentFragment(new org.telegram.ui.Components.na0(bundle, wnVar.a1.getSharedMediaPreloader()));
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
        wn wnVar = this.a;
        TLRPC.User user2 = wnVar.f;
        if (user2 != null && user2.id == user.id) {
            i11 = 1;
        }
        profileActivity.N4(i11);
        Activity parentActivity = wnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
        AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
        wnVar.presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void y0(org.telegram.ui.Cells.u1 u1Var) {
        qh.c cVar = this.a.Bc;
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
        wn wnVar = this.a;
        ci.e4 e4Var = wnVar.A1;
        if (e4Var != null) {
            e4Var.e(true);
        }
        if (wnVar.getParentActivity() == null || (messageObject = u1Var.getMessageObject()) == null || (factCheck = messageObject.getFactCheck()) == null || factCheck.country == null) {
            return;
        }
        try {
            str = new Locale("", factCheck.country).getDisplayCountry(LocaleController.getInstance().getCurrentLocale());
        } catch (Exception e) {
            FileLog.e(e);
            str = factCheck.country;
        }
        ci.e4 e4Var2 = new ci.e4(wnVar.getParentActivity(), 3);
        e4Var2.p(true);
        e4Var2.K = Layout.Alignment.ALIGN_NORMAL;
        e4Var2.d = -1L;
        e4Var2.T = true;
        e4Var2.e = true;
        e4Var2.q(12.0f);
        wnVar.A1 = e4Var2;
        e4Var2.l0 = new dh(12, this, e4Var2);
        e4Var2.s(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FactCheckToast, str)));
        wnVar.X0.addView(wnVar.A1, w7.y5.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
        wnVar.X0.post(new i2.a0(this, u1Var, i11, i10, 4));
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
    public final void z0() {
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        org.telegram.ui.Components.d6 animation;
        wn wnVar = this.a;
        if (wnVar.l3 || SharedConfig.noSoundHintShowed || wnVar.x0 == null || wnVar.getParentActivity() == null || wnVar.fragmentView == null) {
            return;
        }
        org.telegram.ui.Components.j40 j40Var = wnVar.t2;
        if (j40Var == null || j40Var.getTag() == null) {
            if (wnVar.t2 == null) {
                pm pmVar = wnVar.X0;
                int indexOfChild = pmVar.indexOfChild(wnVar.S);
                if (indexOfChild == -1) {
                    return;
                }
                org.telegram.ui.Components.j40 j40Var2 = new org.telegram.ui.Components.j40(0, wnVar.getParentActivity(), wnVar.ea, false);
                wnVar.t2 = j40Var2;
                j40Var2.setShowingDuration(10000L);
                pmVar.addView(wnVar.t2, indexOfChild + 1, w7.y5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                wnVar.t2.setAlpha(0.0f);
                wnVar.t2.setVisibility(4);
            }
            int childCount = wnVar.x0.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = wnVar.x0.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject.isVideo() && (animation = u1Var.getPhotoImage().getAnimation()) != null && animation.o() >= 3000 && wnVar.t2.e(u1Var, null, 0, 0, true)) {
                    SharedConfig.setNoSoundHintShowed(true);
                    return;
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final org.telegram.ui.Cells.r9 z2() {
        return this.a.c9;
    }
}
