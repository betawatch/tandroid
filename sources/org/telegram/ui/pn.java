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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class pn implements org.telegram.ui.Cells.k1 {
    public final /* synthetic */ eo a;

    public pn(eo eoVar) {
        this.a = eoVar;
    }

    public static void a(pn pnVar, org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
        int i10;
        eo eoVar = pnVar.a;
        if (eoVar.getParentActivity() == null || document == null) {
            return;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23 && ((i11 <= 28 || BuildVars.NO_SCOPED_STORAGE) && eoVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
            eoVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
            return;
        }
        MessageObject messageObject = t1Var == null ? null : t1Var.getMessageObject();
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
        i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
        arrayList.add(new MessageObject(i10, tL_message, false, true));
        MediaController.saveFilesFromMessages(eoVar.getParentActivity(), eoVar.getAccountInstance(), arrayList, new wa(pnVar, 1));
    }

    @Override // org.telegram.ui.Cells.k1
    public final void A(org.telegram.ui.Cells.t1 t1Var) {
        eo eoVar = this.a;
        if (!eoVar.getMessagesController().showSensitiveContent()) {
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(eoVar.getParentActivity(), 3, null);
            d2Var.q(200L);
            eoVar.getMessagesController().getContentSettings(new z(this, d2Var, t1Var, 5));
        } else {
            if (t1Var.getMessageObject() != null) {
                t1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
            }
            t1Var.h4();
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void A0() {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        org.telegram.ui.Components.c6 animation;
        eo eoVar = this.a;
        if (eoVar.l3 || SharedConfig.noSoundHintShowed || eoVar.x0 == null || eoVar.getParentActivity() == null || eoVar.fragmentView == null) {
            return;
        }
        org.telegram.ui.Components.s40 s40Var = eoVar.t2;
        if (s40Var == null || s40Var.getTag() == null) {
            if (eoVar.t2 == null) {
                vm vmVar = eoVar.X0;
                int indexOfChild = vmVar.indexOfChild(eoVar.S);
                if (indexOfChild == -1) {
                    return;
                }
                org.telegram.ui.Components.s40 s40Var2 = new org.telegram.ui.Components.s40(0, eoVar.getParentActivity(), eoVar.ea, false);
                eoVar.t2 = s40Var2;
                s40Var2.setShowingDuration(10000L);
                vmVar.addView(eoVar.t2, indexOfChild + 1, w7.a6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                eoVar.t2.setAlpha(0.0f);
                eoVar.t2.setVisibility(4);
            }
            int childCount = eoVar.x0.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = eoVar.x0.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject.isVideo() && (animation = t1Var.getPhotoImage().getAnimation()) != null && animation.o() >= 3000 && eoVar.t2.e(t1Var, null, 0, 0, true)) {
                    SharedConfig.setNoSoundHintShowed(true);
                    return;
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void B0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.f5 f5Var2;
        eo eoVar = this.a;
        if (eoVar.getParentActivity() == null || tLObject == null) {
            return;
        }
        f5Var = ((org.telegram.ui.ActionBar.p2) eoVar).parentLayout;
        if (f5Var != null) {
            f5Var2 = ((org.telegram.ui.ActionBar.p2) eoVar).parentLayout;
            if (((ActionBarLayout) f5Var2).y()) {
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
            eoVar.presentFragment(new eo(bundle));
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, eoVar.getParentActivity(), eoVar.getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(eoVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(eoVar.getParentActivity(), false, false);
        g1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
        g1Var.setMinimumWidth(160);
        g1Var.setOnClickListener(new a(this, 14));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(eoVar.getParentActivity(), false, false);
        g1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
        g1Var2.setMinimumWidth(160);
        g1Var2.setOnClickListener(new a0(this, (TLRPC.Chat) tLObject, t1Var, 7));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
        eo eoVar2 = new eo(bundle);
        eoVar2.J9 = true;
        eoVar.presentFragmentAsPreviewWithMenu(eoVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
        eoVar.d7();
    }

    @Override // org.telegram.ui.Cells.k1
    public final void B1(org.telegram.ui.Cells.t1 t1Var) {
        eo.U4(this.a, t1Var);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void C0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
        MessageObject messageObject = t1Var.getMessageObject();
        int i10 = messageObject.type;
        eo eoVar = this.a;
        if (i10 != 16) {
            eoVar.I7(t1Var, true, false, f7, f10, messageObject.isMusic(), false, false);
            return;
        }
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        int i11 = 0;
        if (!(messageAction instanceof TLRPC.TL_messageActionConferenceCall)) {
            TLRPC.User user = eoVar.f;
            if (user != null) {
                boolean isVideoCall = messageObject.isVideoCall();
                TLRPC.UserFull userFull = eoVar.a8;
                org.telegram.ui.Components.voip.e2.m(user, isVideoCall, userFull != null && userFull.video_calls_available, eoVar.getParentActivity(), eoVar.getMessagesController().getUserFull(eoVar.f.id), eoVar.getAccountInstance());
                return;
            }
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(Long.valueOf(eoVar.a()));
        ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
        int size = arrayList.size();
        while (i11 < size) {
            TLRPC.Peer peer = arrayList.get(i11);
            i11++;
            hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(peer)));
        }
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = messageObject.getId();
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(eoVar.getParentActivity(), 3, null);
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = eoVar.getMessagesController().conferenceCallSizeLimit;
        d2Var.setOnCancelListener(new ba(this, eoVar.getConnectionsManager().sendRequest(getgroupcall, new bi.ze(this, d2Var, hashSet, tL_inputGroupCallInviteMessage, messageObject, 4)), 1));
        d2Var.q(600L);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void C1(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        k(t1Var, z10, false, false);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void D(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        TLRPC.Message message;
        int i10;
        int i11;
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        int i12 = buttonCustom.id;
        eo eoVar = this.a;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    eoVar.I7(t1Var, true, false, t1Var.getLastTouchX(), t1Var.getLastTouchY(), true, false, true);
                    return;
                } else {
                    if (i12 == 4) {
                        eoVar.R1.m(messageObject.getTopicId(), true);
                        return;
                    }
                    return;
                }
            }
            if (message.suggested_post != null) {
                i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, eoVar.e);
                if (canManageMonoForum) {
                    i11 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                    ChatObject.canUserDoChannelDirectAdminAction(i11, eoVar.e, 5);
                }
                bi.g2 g2Var = new bi.g2(this, message, canManageMonoForum, messageObject, 11);
                TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                eoVar.g7(g2Var, yf.a.l(suggestedPost != null ? suggestedPost.price : null), !canManageMonoForum);
                return;
            }
            return;
        }
        long peerDialogId = DialogObject.getPeerDialogId(message.from_id);
        pf pfVar = new pf(8, this, message);
        Pattern pattern = org.telegram.ui.Components.d5.a;
        Activity parentActivity = eoVar.getParentActivity();
        int i13 = 0;
        org.telegram.ui.ActionBar.g2 g2Var2 = new org.telegram.ui.ActionBar.g2(parentActivity, 0, null);
        String string = LocaleController.getString(R.string.SuggestedMessageDecline);
        org.telegram.ui.ActionBar.d2 d2Var = g2Var2.a;
        d2Var.R = string;
        d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageDeclineInfo, MessagesController.getInstance(UserConfig.selectedAccount).getPeerName(peerDialogId)));
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
        g2Var2.n(frameLayout);
        g2Var2.k(LocaleController.getString(R.string.Decline), new oe(17, pfVar, editText));
        g2Var2.h(LocaleController.getString(R.string.Cancel), null);
        d2Var.N = new org.telegram.ui.Components.r1(editText, i13);
        frameLayout.addView(editText, w7.a6.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
        editText.requestFocus();
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.rg(editText, 3), 100L);
        eoVar.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void E(org.telegram.ui.Cells.t1 t1Var) {
        eo eoVar = this.a;
        eoVar.xa.l(t1Var, eoVar, true);
        eoVar.x0.I0(false);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void E0(org.telegram.ui.Cells.t1 t1Var) {
        k(t1Var, true, false, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.k1
    public final boolean E1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        x4 x4Var;
        tk tkVar;
        sk skVar;
        if (!l()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(ChatObject.getPublicUsername(chat));
        eo eoVar = this.a;
        int i14 = (isEmpty || eoVar.e == null || ((tkVar = eoVar.O0) != null && tkVar.getVisibility() == 0) || ((skVar = eoVar.R) != null && skVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat2 = eoVar.e;
        int i15 = (chat2 == null || !(eoVar.d4 == 0 || eoVar.h4) || (ChatObject.isChannel(chat2) && !eoVar.e.megagroup)) ? 0 : 1;
        TLRPC.Chat chat3 = eoVar.e;
        int i16 = (chat3 == null || chat3.id != chat.id || eoVar.F9()) ? 1 : 0;
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
        TLRPC.ChatFull chatFull = eoVar.getMessagesController().getChatFull(chat.id);
        if (chatFull != null) {
            x4Var = x4.a(chat, chatFull, d5VarArr);
            z11 = i14;
            i13 = i15;
            i12 = i16;
            z10 = true;
        } else {
            i11 = ((org.telegram.ui.ActionBar.p2) eoVar).classGuid;
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
            com.google.firebase.messaging.m.k().v((ViewGroup) eoVar.fragmentView, eoVar.ea, x4Var, new a7(this, chat, t1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(eoVar, t1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new dn(this, chat, 0), false);
        boolean z12 = chat.broadcast;
        H.l(z12 ? R.drawable.msg_channel : R.drawable.msg_discussion, LocaleController.getString(z12 ? R.string.OpenChannel2 : R.string.OpenGroup2), new s1(this, t1Var, chat, 26), i12);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new dn(this, chat, 1), z11);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new dn(this, chat, 2), i13);
        H.t = false;
        H.i = 3;
        H.W = true;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void F1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        eo eoVar = this.a;
        if (eoVar.z9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) yf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) yf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
        if (eoVar.getParentActivity() != null) {
            if (eoVar.O0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || yf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || yf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || yf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || yf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || yf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || yf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                if (tL_inlineButtonTypeCopy == null) {
                    if (tL_inlineButtonTypeUrl != null) {
                        eoVar.Z9(null, tL_inlineButtonTypeUrl.url, true, t1Var, t1Var.getMessageObject());
                        try {
                            t1Var.performHapticFeedback(0, 1);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                String str = tL_inlineButtonTypeCopy.copy_text;
                org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) eoVar.getParentActivity(), (org.telegram.ui.ActionBar.f6) eoVar.ea, false);
                h3Var.fixNavigationBar();
                h3Var.title = str;
                h3Var.bigTitle = false;
                h3Var.multipleLinesTitle = true;
                CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Copy)};
                kg.j jVar = new kg.j(4, eoVar, str);
                h3Var.items = charSequenceArr;
                h3Var.onClickListener = jVar;
                eoVar.showDialog(h3Var);
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void G0(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject;
        if (t1Var == null || (messageObject = t1Var.getMessageObject()) == null || messageObject.messageOwner == null) {
            return;
        }
        int id2 = messageObject.getId();
        eo eoVar = this.a;
        if (eoVar.wb == id2 && eoVar.xb == 7) {
            return;
        }
        TLRPC.InputPeer inputPeer = eoVar.getMessagesController().getInputPeer(messageObject.getDialogId());
        if (inputPeer == null) {
            return;
        }
        TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
        getrichmessage.peer = inputPeer;
        getrichmessage.id = id2;
        nf.e eVar = eoVar.Ab;
        if (eVar != null) {
            eVar.a(true);
            eoVar.Ab = null;
        }
        int[] iArr = new int[1];
        cj cjVar = new cj(eoVar, id2, t1Var, 2);
        cjVar.b = new n(27, eoVar, iArr);
        eoVar.Ab = cjVar;
        cjVar.d();
        iArr[0] = eoVar.getConnectionsManager().sendRequestTyped(getrichmessage, new org.telegram.messenger.a(), new ng(eoVar, cjVar, iArr, t1Var, messageObject));
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean G1() {
        eo eoVar = this.a;
        return eoVar.X0.getKeyboardHeight() + eoVar.oa >= AndroidUtilities.dp(20.0f);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void H(MessageObject.TextLayoutBlock textLayoutBlock) {
        StaticLayout staticLayout = textLayoutBlock.textLayout;
        if (staticLayout == null || staticLayout.getText() == null) {
            return;
        }
        String charSequence = textLayoutBlock.textLayout.getText().toString();
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new CodeHighlighting.Span(false, 0, null, textLayoutBlock.language, charSequence), 0, spannableString.length(), 33);
        AndroidUtilities.addToClipboard(spannableString);
        org.telegram.messenger.em.o(R.string.CodeCopied, org.telegram.ui.Components.wc.a0(this.a));
    }

    @Override // org.telegram.ui.Cells.k1
    public final void I0(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        messageObject.messageOwner.summarizedOpen = !r1.summarizedOpen;
        messageObject.updateTranslation(true);
        eo eoVar = this.a;
        eoVar.getMessagesStorage().updateMessageCustomParams(messageObject.getDialogId(), messageObject.messageOwner);
        eoVar.getMessagesController().getTranslateController().checkTranslation(messageObject, true);
        k(t1Var, true, false, true);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void I1(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        eo eoVar = this.a;
        eoVar.d5 = messageObject;
        eoVar.d9();
    }

    @Override // org.telegram.ui.Cells.k1
    public final void K(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject.messageOwner.send_state != 0) {
            this.a.getSendMessagesHelper().cancelSendingMessage(messageObject);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void K1(MessageObject messageObject) {
        this.a.s.put(messageObject, Boolean.TRUE);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void L(int i10, org.telegram.ui.Cells.t1 t1Var) {
        boolean z10 = t1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveaway;
        eo eoVar = this.a;
        if (z10) {
            long j3 = -((TLRPC.TL_messageMediaGiveaway) t1Var.getMessageObject().messageOwner.media).channels.get(i10).longValue();
            if (eoVar.T5 != j3) {
                eoVar.presentFragment(eo.R9(j3));
            } else {
                eoVar.a1.e(false, false);
            }
        }
        if (t1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            eoVar.presentFragment(ProfileActivity.m4(((TLRPC.TL_messageMediaGiveawayResults) t1Var.getMessageObject().messageOwner.media).winners.get(i10).longValue()));
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void L1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        Uri parse;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        boolean z11 = (z10 || !nf.f.h(str, false, false)) ? z10 : true;
        eo eoVar = this.a;
        nf.e eVar = eoVar.Ab;
        if (eVar != null) {
            eVar.a(true);
        }
        eoVar.Ab = t1Var.getMessageObject() == null ? null : new ln(this, t1Var);
        if (z11 || nf.f.f(parse, false, null)) {
            nf.f.r(eoVar.getParentActivity(), parse, true, true, false, eoVar.Ab, null, false, true, false);
        } else {
            org.telegram.ui.Components.d5.r0(eoVar, str, true, true, true, !z11, eoVar.Ab, webPage, eoVar.ea);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void M(MessageObject messageObject) {
        if (messageObject.isVideo()) {
            this.a.fb(messageObject, true);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean M0(long j3) {
        eo eoVar = this.a;
        TLRPC.Chat chat = eoVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return false;
        }
        return eoVar.getMessagesController().isOwner(eoVar.e.id, j3);
    }

    @Override // org.telegram.ui.Cells.k1
    public final CharacterStyle M1(org.telegram.ui.Cells.t1 t1Var) {
        eo eoVar;
        int i10;
        if (t1Var.getMessageObject() == null || (i10 = (eoVar = this.a).wb) == 0 || i10 != t1Var.getMessageObject().getId() || eoVar.xb != 1) {
            return null;
        }
        return eoVar.yb;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean N(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        int i10;
        int i11;
        boolean isForwarded = t1Var.getMessageObject().isForwarded();
        eo eoVar = this.a;
        if (isForwarded) {
            long peerDialogId = DialogObject.getPeerDialogId(t1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.wc a02 = org.telegram.ui.Components.wc.a0(eoVar);
            int i12 = R.raw.passcode_lock_close;
            int i13 = R.string.TodoCompleteForbiddenForward;
            i11 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
            a02.Q(i12, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i13, DialogObject.getName(i11, peerDialogId)))).k(true);
            return false;
        }
        if (t1Var.getMessageObject().canCompleteTodo()) {
            if (eoVar.getUserConfig().isPremium()) {
                eoVar.getSendMessagesHelper().toggleTodo(ChatObject.getSendAsPeerId(eoVar.e, eoVar.Z7, true), t1Var.getMessageObject(), todoItem, z10, null);
                return true;
            }
            org.telegram.ui.Components.wc.a0(eoVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.TodoPremiumRequired), new an(this, 9))).k(true);
            return false;
        }
        long peerDialogId2 = DialogObject.getPeerDialogId(t1Var.getMessageObject().getFromPeer());
        org.telegram.ui.Components.wc a03 = org.telegram.ui.Components.wc.a0(eoVar);
        int i14 = R.raw.passcode_lock_close;
        int i15 = R.string.TodoCompleteForbidden;
        i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
        a03.Q(i14, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i15, DialogObject.getName(i10, peerDialogId2)))).k(true);
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void N0(org.telegram.ui.Cells.t1 t1Var) {
        int i10;
        a3.h0 h0Var;
        MessageObject.GroupedMessages groupedMessages;
        int i11;
        eo eoVar = this.a;
        th.j jVar = eoVar.X9;
        if (jVar == null) {
            return;
        }
        HashMap hashMap = jVar.a;
        th.i iVar = (th.i) hashMap.get(th.j.b(t1Var));
        org.telegram.ui.Components.pc pcVar = null;
        MessageObject messageObject = iVar != null ? iVar.E : null;
        th.i iVar2 = (th.i) eoVar.X9.a.get(th.j.b(t1Var));
        long j3 = (iVar2 == null || (i11 = iVar2.R) == -1) ? 0L : iVar2.w[i11].d;
        if (messageObject != null && j3 != 0) {
            Activity parentActivity = eoVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
            if (!org.telegram.ui.Components.d5.h(parentActivity, i10, j3, false)) {
                ArrayList<MessageObject> arrayList = (messageObject.getGroupId() == 0 || (groupedMessages = (MessageObject.GroupedMessages) eoVar.x6.f(messageObject.getGroupId())) == null) ? null : groupedMessages.messages;
                if (arrayList == null) {
                    arrayList = org.telegram.messenger.a2.l(messageObject);
                }
                boolean z10 = j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                long j10 = j3;
                a3.h0 h0Var2 = new a3.h0(this, arrayList, j10, 9);
                if (z10) {
                    h0Var2.run();
                    h0Var = null;
                } else {
                    h0Var = h0Var2;
                }
                pcVar = org.telegram.ui.Components.wc.v(eoVar.getParentActivity(), eoVar, null, 1, j10, 1, eoVar.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), eoVar.getThemedColor(org.telegram.ui.ActionBar.j6.Hi), 5000, false, h0Var);
                pcVar.k = true;
                pcVar.k(pcVar.e instanceof org.telegram.ui.Components.ac);
            }
        }
        th.i iVar3 = (th.i) hashMap.get(th.j.b(t1Var));
        if (iVar3 != null) {
            if (pcVar == null) {
                iVar3.R = -1;
                iVar3.c();
                return;
            }
            org.telegram.ui.Components.tb tbVar = pcVar.e;
            if (!(tbVar instanceof org.telegram.ui.Components.xb)) {
                iVar3.c();
                return;
            }
            org.telegram.ui.Components.xb xbVar = (org.telegram.ui.Components.xb) tbVar;
            iVar3.W = xbVar;
            xbVar.a.setVisibility(4);
            ViewTreeObserver viewTreeObserver = iVar3.W.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new jm(2, iVar3, viewTreeObserver));
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void N1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        try {
            eo eoVar = this.a;
            org.telegram.ui.Components.zu.J(eoVar, messageObject, eoVar.Fa, str2, str3, str4, str, i10, i11, -1, eoVar.x9());
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean O() {
        eo eoVar = this.a;
        return eoVar.W5[1].size() + eoVar.W5[0].size() > 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean O1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        ViewGroup viewGroup;
        int i10;
        l51 l51Var;
        if (messageObject.isVoiceOnce() || messageObject.isRoundOnce()) {
            int i11 = 1;
            n51 n51Var = this.a.Z9;
            if (n51Var == null || n51Var.b0) {
                try {
                    AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!messageObject.isOutOwner()) {
                            org.telegram.ui.Components.wc.a0(this.a).w(R.drawable.tooltip_sound, LocaleController.getString(R.string.VoiceOnceTurnOnSound)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.a.Z9 = new n51(this.a.getParentActivity());
                n51 n51Var2 = this.a.Z9;
                ve fb2 = !messageObject.isOutOwner() ? this.a.fb(messageObject, true) : null;
                a3.h0 O4 = !messageObject.isOutOwner() ? eo.O4(this.a, messageObject) : null;
                Context context = n51Var2.a;
                bi.n7 n7Var = n51Var2.c;
                n51Var2.X = fb2;
                n51Var2.Y = O4;
                l51 l51Var2 = n51Var2.N;
                if (l51Var2 != null) {
                    n7Var.removeView(l51Var2);
                    n51Var2.N = null;
                }
                n51Var2.O = t1Var;
                MessageObject messageObject2 = t1Var.getMessageObject();
                n51Var2.M = messageObject2;
                n51Var2.S = messageObject2 != null && messageObject2.isRoundVideo();
                org.telegram.ui.Cells.t1 t1Var2 = n51Var2.O;
                n51Var2.L = t1Var2 != null ? t1Var2.getResourcesProvider() : null;
                if (n51Var2.O != null) {
                    n51Var2.T = 0.0f;
                    n51Var2.U = t1Var.n;
                    if (t1Var.getParent() instanceof View) {
                        View view = (View) t1Var.getParent();
                        n51Var2.T = view.getY() + n51Var2.T;
                        n51Var2.U = view.getY() + n51Var2.U;
                    }
                    int width = n51Var2.O.getWidth();
                    int height = n51Var2.O.getHeight();
                    if (n51Var2.S) {
                        height = Math.min(AndroidUtilities.dp(360.0f), Math.min(width, AndroidUtilities.displaySize.y));
                    }
                    int i12 = height;
                    n51Var2.K = i12 - n51Var2.O.getHeight();
                    i10 = (int) Math.ceil((Math.min(width, i12) * 0.92f) / AndroidUtilities.density);
                    viewGroup = n7Var;
                    l51 l51Var3 = new l51(n51Var2, n51Var2.getContext(), UserConfig.selectedAccount, n51Var2.O.getResourcesProvider(), width, i12);
                    n51Var2.N = l51Var3;
                    n51Var2.O.j1(l51Var3);
                    n51Var2.N.i1(n51Var2.O);
                    n51Var2.N.setDelegate(new t7.u());
                    l51 l51Var4 = n51Var2.N;
                    MessageObject messageObject3 = n51Var2.M;
                    MessageObject.GroupedMessages currentMessagesGroup = n51Var2.O.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.t1 t1Var3 = n51Var2.O;
                    l51Var4.X3(messageObject3, currentMessagesGroup, t1Var3.F, t1Var3.E, false, false);
                    if (!n51Var2.S) {
                        org.telegram.ui.Components.k8 k8Var = new org.telegram.ui.Components.k8();
                        n51Var2.V = k8Var;
                        l51 l51Var5 = n51Var2.N;
                        k8Var.i = l51Var5;
                        l51Var5.ee = k8Var;
                        if (l51Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.ro0 seekBarWaveform = n51Var2.N.getSeekBarWaveform();
                            seekBarWaveform.L = n51Var2.s;
                            org.telegram.ui.Cells.t1 t1Var4 = seekBarWaveform.n;
                            if (t1Var4 != null) {
                                t1Var4.invalidate();
                            }
                        }
                    }
                    n51Var2.H = false;
                    viewGroup.addView(n51Var2.N, new FrameLayout.LayoutParams(n51Var2.O.getWidth(), i12, 17));
                } else {
                    viewGroup = n7Var;
                    i10 = 360;
                }
                TextureView textureView = n51Var2.P;
                if (textureView != null) {
                    viewGroup.removeView(textureView);
                    n51Var2.P = null;
                }
                if (n51Var2.S) {
                    n51Var2.Q = false;
                    TextureView textureView2 = new TextureView(context);
                    n51Var2.P = textureView2;
                    viewGroup.addView(textureView2, 0, w7.a6.c(i10, i10));
                }
                MediaController.getInstance().pauseByRewind();
                org.telegram.ui.Components.t71 t71Var = n51Var2.w;
                if (t71Var != null) {
                    t71Var.B();
                    n51Var2.w.H();
                    n51Var2.w = null;
                }
                org.telegram.ui.Cells.t1 t1Var5 = n51Var2.O;
                if (t1Var5 != null && t1Var5.getMessageObject() != null) {
                    File pathToAttach = FileLoader.getInstance(n51Var2.O.getMessageObject().currentAccount).getPathToAttach(n51Var2.O.getMessageObject().getDocument());
                    if (pathToAttach != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && (pathToAttach = FileLoader.getInstance(n51Var2.O.getMessageObject().currentAccount).getPathToMessage(n51Var2.O.getMessageObject().messageOwner)) != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && n51Var2.O.getMessageObject().messageOwner.attachPath != null) {
                        pathToAttach = new File(n51Var2.O.getMessageObject().messageOwner.attachPath);
                    }
                    if (pathToAttach != null && pathToAttach.exists()) {
                        org.telegram.ui.Components.t71 t71Var2 = new org.telegram.ui.Components.t71();
                        n51Var2.w = t71Var2;
                        t71Var2.J = new m51(n51Var2);
                        if (n51Var2.V != null) {
                            t71Var2.K = new m51(n51Var2);
                        }
                        if (n51Var2.S) {
                            t71Var2.V(n51Var2.P);
                        }
                        n51Var2.w.D(Uri.fromFile(pathToAttach), "other");
                        n51Var2.w.C();
                        org.telegram.ui.Components.ot otVar = n51Var2.E;
                        if (otVar != null) {
                            otVar.s = n51Var2.w;
                            otVar.a();
                        }
                    }
                    eo eoVar = this.a;
                    eoVar.showDialog(eoVar.Z9);
                    return false;
                }
                bi.x4 x4Var = n51Var2.x;
                if (x4Var != null) {
                    viewGroup.removeView(x4Var);
                    n51Var2.x = null;
                }
                MessageObject messageObject4 = n51Var2.M;
                boolean z10 = messageObject4 != null && messageObject4.isOutOwner();
                MessageObject messageObject5 = n51Var2.M;
                if (messageObject5 != null && messageObject5.getDialogId() != UserConfig.getInstance(n51Var2.M.currentAccount).getClientUserId()) {
                    bi.x4 x4Var2 = new bi.x4(context, 3);
                    n51Var2.x = x4Var2;
                    x4Var2.p(true);
                    if (z10) {
                        long dialogId = n51Var2.M.getDialogId();
                        String str = "";
                        if (dialogId > 0) {
                            TLRPC.User user = MessagesController.getInstance(n51Var2.M.currentAccount).getUser(Long.valueOf(dialogId));
                            if (user != null) {
                                str = UserObject.getFirstName(user);
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(n51Var2.M.currentAccount).getChat(Long.valueOf(-dialogId));
                            if (chat != null) {
                                str = chat.title;
                            }
                        }
                        n51Var2.x.s(AndroidUtilities.replaceTags(LocaleController.formatString(n51Var2.S ? R.string.VideoOnceOutHint : R.string.VoiceOnceOutHint, str)));
                    } else {
                        n51Var2.x.s(AndroidUtilities.replaceTags(LocaleController.getString(n51Var2.S ? R.string.VideoOnceHint : R.string.VoiceOnceHint)));
                    }
                    n51Var2.x.q(12.0f);
                    n51Var2.x.setPadding(AndroidUtilities.dp((z10 || n51Var2.O.F) ? 0.0f : 6.0f), 0, 0, 0);
                    if (n51Var2.S) {
                        n51Var2.x.m(0.5f, 0.0f);
                        n51Var2.x.K = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        n51Var2.x.m(0.0f, AndroidUtilities.dp(34.0f));
                        n51Var2.x.K = Layout.Alignment.ALIGN_NORMAL;
                    }
                    n51Var2.x.t(14.0f);
                    bi.x4 x4Var3 = n51Var2.x;
                    x4Var3.h = bi.x4.a(x4Var3.getText(), n51Var2.x.getTextPaint());
                    if (n51Var2.S) {
                        viewGroup.addView(n51Var2.x, w7.a6.d((int) ((n51Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((n51Var2.O.getHeight() + n51Var2.K) / AndroidUtilities.density) / 2.0f), 0.0f, 0.0f));
                    } else {
                        viewGroup.addView(n51Var2.x, w7.a6.d((int) ((n51Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, ((((n51Var2.O.getWidth() * (-0.39999998f)) / 2.0f) + n51Var2.O.getBoundsLeft()) / AndroidUtilities.density) + 1.0f, ((-75.0f) - ((n51Var2.O.getHeight() / AndroidUtilities.density) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    n51Var2.x.u();
                }
                TextView textView = n51Var2.y;
                if (textView != null) {
                    viewGroup.removeView(textView);
                    n51Var2.y = null;
                }
                TextView textView2 = new TextView(context);
                n51Var2.y = textView2;
                textView2.setTextColor(-1);
                n51Var2.y.setTypeface(AndroidUtilities.bold());
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    n51Var2.y.setBackground(org.telegram.ui.ActionBar.j6.i0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    n51Var2.y.setBackground(org.telegram.ui.ActionBar.j6.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                n51Var2.y.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
                w7.c6.a(n51Var2.y);
                n51Var2.y.setText(LocaleController.getString(z10 ? R.string.VoiceOnceClose : R.string.VoiceOnceDeleteClose));
                n51Var2.y.setOnClickListener(new j51(n51Var2, i11));
                viewGroup.addView(n51Var2.y, w7.a6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z10 && (l51Var = n51Var2.N) != null && l51Var.getMessageObject() != null && n51Var2.N.getMessageObject().messageOwner != null) {
                    n51Var2.N.getMessageObject().messageOwner.media_unread = false;
                    n51Var2.N.invalidate();
                }
                eo eoVar2 = this.a;
                eoVar2.showDialog(eoVar2.Z9);
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
                eo eoVar3 = this.a;
                return mediaController.setPlaylist(L, messageObject, eoVar3.L6, true ^ eoVar3.A0.N, null);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean P(org.telegram.ui.Cells.t1 t1Var) {
        int i10;
        MessageObject messageObject;
        TLRPC.Message message;
        if (t1Var == null) {
            return false;
        }
        eo eoVar = this.a;
        if (eoVar.getParentActivity() == null) {
            return false;
        }
        i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
        if (!MessagesController.getInstance(i10).richEditorAllowed() || (messageObject = t1Var.getMessageObject()) == null || (message = messageObject.messageOwner) == null || message.rich_message == null) {
            return false;
        }
        if (!messageObject.translated || message.translatedRichMessage == null) {
            return messageObject.canEditMessage(eoVar.e);
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void P0(int i10, org.telegram.ui.Cells.t1 t1Var) {
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
        MessageObject messageObject = t1Var.getMessageObject();
        File file = null;
        TLRPC.User user2 = null;
        eo eoVar = this.a;
        if (i10 == 19) {
            nf.e eVar = eoVar.Ab;
            if (eVar != null) {
                eVar.a(true);
            }
            final in inVar = t1Var.getMessageObject() != null ? new in(this, t1Var, 2) : null;
            eoVar.Ab = inVar;
            final Activity parentActivity = eoVar.getParentActivity();
            final org.telegram.ui.ActionBar.f6 resourceProvider = eoVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            inVar.d();
            inVar.b = new sg.d(atomicBoolean, 0);
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
            final String b11 = sg.i.b(messageObject);
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
            final boolean z10 = chat != null && ChatObject.isChannelAndNotMegaGroup(chat);
            final long j3 = messageObject.messageOwner.date * 1000;
            sg.s.d(messageObject, new Utilities.Callback(atomicBoolean, inVar, z10, b11, j3, tL_messageMediaGiveaway2, parentActivity, resourceProvider) { // from class: sg.e
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
            }, new sg.f(atomicBoolean, inVar, 0));
            return;
        }
        if (i10 == 21) {
            h();
            return;
        }
        if (i10 == 84) {
            eoVar.ua(t1Var);
            return;
        }
        if (i10 == 80) {
            org.telegram.ui.Cells.u8 u8Var = org.telegram.ui.Components.zg0.O;
            if (eoVar.getParentActivity() == null) {
                return;
            }
            eoVar.showDialog(new org.telegram.ui.Components.zg0(eoVar.getContext(), eoVar.getCurrentAccount(), messageObject, eoVar.getResourceProvider()));
            return;
        }
        if (i10 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
            if (messageMedia4 == null || (webPage = messageMedia4.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                eoVar.createArticleViewer(false).N(messageObject, null, null, null);
                return;
            }
            return;
        }
        int i15 = 5;
        if (i10 == 5) {
            long j10 = messageObject.messageOwner.media.user_id;
            if (j10 != 0) {
                i14 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
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
                eoVar.presentFragment(new ProfileActivity(bundle, null));
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
                eoVar.showDialog(new org.telegram.ui.Components.ye0(eoVar, null, user, null, file, gf.b.d(str, false), str3, str4, eoVar.ea));
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (i10 == 30) {
            eoVar.presentFragment(new eo(w.f.e(messageObject.messageOwner.media.user_id, "user_id")));
            return;
        }
        if (i10 == 31) {
            long j11 = messageObject.messageOwner.media.user_id;
            if (j11 != 0) {
                i13 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(j11));
            }
            if (user2 != null) {
                if (!TextUtils.isEmpty(messageObject.vCardData)) {
                    b10 = messageObject.vCardData.toString();
                } else if (TextUtils.isEmpty(user2.phone)) {
                    String str5 = MessageObject.getMedia(messageObject.messageOwner).phone_number;
                    b10 = !TextUtils.isEmpty(str5) ? gf.b.c().b(str5) : LocaleController.getString(R.string.NumberUnknown);
                } else {
                    b10 = org.telegram.messenger.a2.j(new StringBuilder("+"), user2.phone, gf.b.c());
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user2.id);
                bundle2.putString("phone", b10);
                bundle2.putBoolean("addContact", true);
                eoVar.presentFragment(new ts(bundle2));
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
            nf.e eVar2 = eoVar.Ab;
            if (eVar2 != null) {
                eVar2.a(true);
            }
            eoVar.Ab = t1Var.getMessageObject() != null ? new in(this, t1Var, 3) : null;
            if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                String group = matcher.group(1);
                i11 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                if (MediaDataController.getInstance(i11).getStickerSetByName(group) == null) {
                    eoVar.Ab.d();
                    TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_inputStickerSetShortName.short_name = group;
                    tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                    i12 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                    eoVar.Ab.b = new bi.s(this, ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickerSet, new bi.m4(i16, this, z11)), 25);
                    return;
                }
            }
            nf.f.r(eoVar.getParentActivity(), Uri.parse(webPage2.url), true, true, false, eoVar.Ab, null, false, true, false);
            return;
        }
        if (messageObject.isSponsored()) {
            eoVar.J9(messageObject, false, false);
            if (messageObject.sponsoredUrl != null) {
                nf.e eVar3 = eoVar.Ab;
                if (eVar3 != null) {
                    eVar3.a(true);
                }
                eoVar.Ab = t1Var.getMessageObject() != null ? new in(this, t1Var, i16) : null;
                nf.f.r(eoVar.getParentActivity(), Uri.parse(messageObject.sponsoredUrl), true, false, false, eoVar.Ab, null, false, eoVar.getMessagesController().sponsoredLinksInappAllow, false);
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
                    eoVar.getOrCreateStoryViewer().G(eoVar.getParentActivity(), tL_webPageAttributeStory.storyItem, zh.s5.a(eoVar.x0));
                    return;
                }
            }
        }
        if (eoVar.ea(storyMentionWebpage.url, t1Var, null, messageObject.getId(), 2)) {
            return;
        }
        nf.e eVar4 = eoVar.Ab;
        if (eVar4 != null) {
            eVar4.a(true);
        }
        eoVar.Ab = t1Var.getMessageObject() != null ? new in(this, t1Var, i15) : null;
        nf.f.r(eoVar.getParentActivity(), Uri.parse(storyMentionWebpage.url), true, true, false, eoVar.Ab, null, false, true, false);
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean Q() {
        eo eoVar = this.a;
        return UserObject.isReplyUser(eoVar.f) || UserObject.isUserSelf(eoVar.f);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void Q1() {
        org.telegram.ui.ActionBar.f6 f6Var;
        eo eoVar = this.a;
        if (eoVar.X0 == null || eoVar.getParentActivity() == null) {
            return;
        }
        Context context = eoVar.X0.getContext();
        f6Var = ((org.telegram.ui.ActionBar.p2) eoVar).resourceProvider;
        n41.T(context, eoVar, false, f6Var, null);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void R(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        MessageObject messageObject;
        if (chat == null) {
            return;
        }
        eo eoVar = this.a;
        lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
        if (lVar.s() || eoVar.A9()) {
            eo.b2(eoVar, t1Var, true, f7, f10);
            return;
        }
        if (z10 || !chat.signature_profiles || (messageObject = t1Var.getMessageObject()) == null || messageObject.getDialogId() == UserObject.REPLY_BOT) {
            p(t1Var, chat, i10, z10);
        } else {
            eoVar.na(DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void R0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        eo eoVar = this.a;
        eoVar.getSendMessagesHelper().sendCallback(true, t1Var.getMessageObject(), keyboardInlineButton, eoVar);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void S(org.telegram.ui.Cells.t1 t1Var) {
        k(t1Var, true, true, false);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void S1(org.telegram.ui.Cells.t1 t1Var, ai.j jVar) {
        TLRPC.Message message;
        if (t1Var == null) {
            jVar.run();
            return;
        }
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject == null || ((messageObject.isSending() && !messageObject.isEditing()) || (message = messageObject.messageOwner) == null || message.rich_message == null)) {
            jVar.run();
        } else {
            org.telegram.ui.ActionBar.p2 p2Var = this.a;
            p2Var.getSendMessagesHelper().editRichMessage(messageObject, messageObject.messageOwner.rich_message, null, p2Var, true);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void T1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        cj cjVar;
        int i10;
        MessageObject messageObject = t1Var.getMessageObject();
        pg.f2 f2Var = null;
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
                        TLRPC.TL_message C7 = eo.C7(message);
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
                eo eoVar = this.a;
                t12.K2(null, eoVar, eoVar.ea);
                PhotoViewer.t1().a2(arrayList, i11, this.a.a(), 0L, 0L, this.a.Ga);
                return;
            }
            return;
        }
        eo eoVar2 = this.a;
        nf.e eVar = eoVar2.Ab;
        if (eVar != null) {
            eVar.a(true);
            eoVar2.Ab = null;
        }
        if (t1Var.getMessageObject() == null) {
            eoVar2.Ab = null;
            cjVar = null;
        } else {
            cjVar = new cj(eoVar2, t1Var.getMessageObject().getId(), t1Var, 1);
            eoVar2.Ab = cjVar;
        }
        i10 = ((org.telegram.ui.ActionBar.p2) this.a).currentAccount;
        xh.v5 y3 = xh.v5.y(i10, false);
        Objects.requireNonNull(cjVar);
        fj fjVar = new fj(cjVar, 7);
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        org.telegram.ui.ActionBar.f6 I = xh.v5.I();
        if (messageObject != null && context != null) {
            long dialogId = messageObject.getDialogId();
            int id2 = messageObject.getId();
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = MessagesController.getInstance(y3.a).getInputPeer(dialogId);
            tL_inputInvoiceMessage.msg_id = id2;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject p5 = di.n3.p(I, false);
            if (p5 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p5.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
            f2Var = new pg.f2(y3, ConnectionsManager.getInstance(y3.a).sendRequest(tL_payments_getPaymentForm, new bi.l9(y3, messageObject, tL_inputInvoiceMessage, fjVar, 18)), 4);
        }
        if (f2Var != null) {
            cjVar.b = f2Var;
            cjVar.d();
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final int U() {
        return this.a.R3;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void U1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10;
        int i11;
        ImageLocation forDocument;
        String str2;
        boolean isEmpty = TextUtils.isEmpty(str);
        eo eoVar = this.a;
        if (!isEmpty) {
            nf.f.s(eoVar.getParentActivity(), "https://" + eoVar.getMessagesController().linkPrefix + "/nft/" + str);
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
        qg.m1 m1Var = new qg.m1(eoVar, i10, user, null, null, eoVar.ea);
        t1Var.getLocationOnScreen(new int[2]);
        m1Var.v0 = t1Var.getNameStatusX();
        m1Var.w0 = t1Var.getNameStatusY();
        m1Var.z0 = t1Var.getScaleX();
        m1Var.x0 = t1Var.getLeft();
        m1Var.y0 = t1Var.getTop();
        m1Var.A0 = t1Var;
        int colorId = UserObject.getColorId(user);
        if (colorId < 7) {
            m1Var.u0 = Integer.valueOf(eoVar.getThemedColor(org.telegram.ui.ActionBar.j6.r8[colorId]));
        } else {
            i11 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
            MessagesController.PeerColors peerColors = MessagesController.getInstance(i11).peerColors;
            MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(colorId) : null;
            m1Var.u0 = color != null ? Integer.valueOf(color.getColor1()) : null;
        }
        org.telegram.ui.Components.n5 n5Var = t1Var.fc;
        if (n5Var != null && (n5Var.f[0] instanceof org.telegram.ui.Components.p5)) {
            m1Var.z0 *= 0.95f;
            if (document != null) {
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(eoVar.getParentActivity());
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
                w9Var.setLayerNum(7);
                w9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                w9Var.l(imageLocation, str3, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "140_140", svgThumb, document);
                if (MessageObject.isTextColorEmoji(document)) {
                    Integer num = m1Var.u0;
                    w9Var.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : eoVar.getThemedColor(org.telegram.ui.ActionBar.j6.v6), PorterDuff.Mode.SRC_IN));
                    m1Var.C0 = MessageObject.getInputStickerSet(document);
                } else {
                    m1Var.C0 = MessageObject.getInputStickerSet(document);
                }
                m1Var.B0 = w9Var;
                m1Var.E0 = true;
            }
        }
        eoVar.showDialog(m1Var);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void V0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        this.a.U7(characterStyle, z10, t1Var.getMessageObject(), t1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:312:0x0683, code lost:
    
        if (r3.paid_reactions_available != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0689, code lost:
    
        if (r6.isEmpty() == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x06ba, code lost:
    
        if (r3.paid_reactions_available != false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x06d6, code lost:
    
        if (r6.isEmpty() != false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x06c4, code lost:
    
        if (org.telegram.messenger.ChatObject.isChannel(r5.e) == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x06d0, code lost:
    
        if (org.telegram.messenger.ChatObject.isMonoForum(r5.e) != false) goto L190;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x084a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x085c  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x099d A[LOOP:3: B:254:0x099b->B:255:0x099d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0a08  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0a20  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0aa4  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x093c  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0690  */
    @Override // org.telegram.ui.Cells.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean V1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        ow0 ow0Var;
        TLRPC.PollAnswer pollAnswer2;
        ow0 ow0Var2;
        jw0 jw0Var;
        MessageObject messageObject;
        MessageObject messageObject2;
        boolean z10;
        MessageObject messageObject3;
        boolean z11;
        boolean z12;
        MessageObject messageObject4;
        boolean z13;
        boolean z14;
        eo eoVar;
        MessageObject messageObject5;
        org.telegram.ui.Components.w70 w70Var;
        df dfVar;
        ow0 ow0Var3;
        MessageObject messageObject6;
        int size;
        int i10;
        ViewGroup viewGroup;
        boolean z15;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        boolean z16;
        byte[] bArr;
        jw0 jw0Var2;
        TLRPC.PollAnswerVoters pollAnswerVoters;
        boolean z17;
        ow0 ow0Var4;
        ArrayList arrayList;
        byte[] bArr2;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll2;
        TLRPC.PollAnswer pollAnswer3;
        eo eoVar2;
        boolean z18;
        String str;
        ph.q qVar;
        boolean z19;
        ArrayList<TLRPC.PollAnswerVoters> arrayList2;
        eo eoVar3 = this.a;
        if (eoVar3.getParentActivity() != null && eoVar3.getParentActivity() != null) {
            bi.x4 x4Var = eoVar3.x1;
            if (x4Var != null && x4Var.V) {
                x4Var.e(true);
            }
            am amVar = eoVar3.B1;
            if (amVar != null && amVar.V) {
                amVar.e(true);
            }
            MessageObject primaryMessageObject = t1Var.getPrimaryMessageObject();
            TLRPC.MessageMedia media = MessageObject.getMedia(primaryMessageObject);
            if (primaryMessageObject != null && (media instanceof TLRPC.TL_messageMediaPoll)) {
                eoVar3.d5 = primaryMessageObject;
                eoVar3.e5 = null;
                ow0 ow0Var5 = new ow0(eoVar3.getParentActivity(), eoVar3.getResourceProvider());
                byte[] bArr3 = pollAnswer.option;
                ow0Var5.L = t1Var;
                ow0Var5.P = bArr3;
                MessageObject messageObject7 = t1Var.getMessageObject();
                ow0Var5.H = messageObject7;
                ow0Var5.I = messageObject7 != null && messageObject7.isOutOwner();
                org.telegram.ui.Cells.t1 t1Var2 = ow0Var5.L;
                jw0 jw0Var3 = ow0Var5.d;
                if (t1Var2 != null) {
                    ow0Var5.M = eoVar3.s9 - AndroidUtilities.dp(4.0f);
                    ow0Var5.N = t1Var.n;
                    if (t1Var.getParent() instanceof View) {
                        View view = (View) t1Var.getParent();
                        ow0Var5.M = view.getY() + ow0Var5.M;
                        ow0Var5.N = view.getY() + ow0Var5.N;
                    }
                    int width = ow0Var5.L.getWidth();
                    int height = ow0Var5.L.getHeight();
                    ow0Var5.L.getHeight();
                    mw0 mw0Var = new mw0(ow0Var5, ow0Var5.getContext(), UserConfig.selectedAccount, ow0Var5.L.getResourcesProvider(), bArr3, width, height);
                    ow0Var = ow0Var5;
                    ow0Var.J = mw0Var;
                    ow0Var.L.h1(mw0Var);
                    ow0Var.J.i1(ow0Var.L);
                    ow0Var.J.setDelegate(new qb.b(17));
                    mw0 mw0Var2 = ow0Var.J;
                    MessageObject messageObject8 = ow0Var.H;
                    MessageObject.GroupedMessages currentMessagesGroup = ow0Var.L.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.t1 t1Var3 = ow0Var.L;
                    mw0Var2.X3(messageObject8, currentMessagesGroup, t1Var3.F, t1Var3.E, t1Var3.G, false);
                    mw0 mw0Var3 = ow0Var.J;
                    mw0Var3.M7 = bArr3;
                    jw0Var3.addView(mw0Var3, new FrameLayout.LayoutParams(ow0Var.L.getWidth(), height, 51));
                    nw0 nw0Var = new nw0(ow0Var.getContext(), UserConfig.selectedAccount, ow0Var.L.getResourcesProvider(), width, height, 0);
                    ow0Var.K = nw0Var;
                    ow0Var.L.j1(nw0Var);
                    ow0Var.L.h1(ow0Var.K);
                    ow0Var.K.i1(ow0Var.L);
                    ow0Var.K.setDelegate(new ob.a(17));
                    nw0 nw0Var2 = ow0Var.K;
                    MessageObject messageObject9 = ow0Var.H;
                    MessageObject.GroupedMessages currentMessagesGroup2 = ow0Var.L.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.t1 t1Var4 = ow0Var.L;
                    nw0Var2.X3(messageObject9, currentMessagesGroup2, t1Var4.F, t1Var4.E, t1Var4.G, false);
                    jw0Var3.addView(ow0Var.K, new FrameLayout.LayoutParams(ow0Var.L.getWidth(), height, 51));
                } else {
                    ow0Var = ow0Var5;
                }
                bi.p1 p1Var = ow0Var.f;
                p1Var.bringToFront();
                jw0 jw0Var4 = ow0Var.e;
                jw0Var4.bringToFront();
                ow0Var.n.bringToFront();
                p1Var.w(false);
                Context context = ow0Var.a;
                View view2 = new View(context);
                org.telegram.ui.ActionBar.f6 f6Var = ow0Var.b;
                org.telegram.ui.Components.w70 G = org.telegram.ui.Components.w70.G(jw0Var3, f6Var, view2, true);
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll3 = (TLRPC.TL_messageMediaPoll) MessageObject.getMedia(ow0Var.H);
                ow0Var.V = MessageObject.isVoted(tL_messageMediaPoll3);
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
                zg.a aVar = ow0Var.G;
                if (pollAnswer2 != null) {
                    TLRPC.Poll poll = tL_messageMediaPoll3.poll;
                    boolean z20 = (poll.closed || poll.revoting_disabled) ? false : true;
                    boolean z21 = poll.multiple_choice;
                    ArrayList arrayList3 = new ArrayList();
                    TLRPC.PollResults pollResults = tL_messageMediaPoll3.results;
                    if (pollResults == null || (arrayList2 = pollResults.results) == null) {
                        tL_messageMediaPoll = tL_messageMediaPoll3;
                        z16 = z21;
                        bArr = bArr3;
                        jw0Var2 = jw0Var3;
                        pollAnswerVoters = null;
                        z17 = false;
                    } else {
                        int size2 = arrayList2.size();
                        z16 = z21;
                        int i12 = 0;
                        z17 = false;
                        TLRPC.PollAnswerVoters pollAnswerVoters2 = null;
                        while (i12 < size2) {
                            TLRPC.PollAnswerVoters pollAnswerVoters3 = arrayList2.get(i12);
                            int i13 = i12 + 1;
                            TLRPC.PollAnswerVoters pollAnswerVoters4 = pollAnswerVoters3;
                            jw0 jw0Var5 = jw0Var3;
                            boolean equals = Arrays.equals(pollAnswerVoters4.option, bArr3);
                            if (equals) {
                                pollAnswerVoters2 = pollAnswerVoters4;
                            }
                            byte[] bArr4 = bArr3;
                            if (pollAnswerVoters4.chosen) {
                                if (equals) {
                                    z17 = true;
                                }
                                ArrayList<TLRPC.PollAnswer> arrayList4 = tL_messageMediaPoll3.poll.answers;
                                int size3 = arrayList4.size();
                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll4 = tL_messageMediaPoll3;
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
                                jw0Var3 = jw0Var5;
                                i12 = i13;
                                bArr3 = bArr4;
                                tL_messageMediaPoll3 = tL_messageMediaPoll4;
                            } else {
                                jw0Var3 = jw0Var5;
                                i12 = i13;
                                bArr3 = bArr4;
                            }
                        }
                        tL_messageMediaPoll = tL_messageMediaPoll3;
                        bArr = bArr3;
                        jw0Var2 = jw0Var3;
                        pollAnswerVoters = pollAnswerVoters2;
                    }
                    if (pollAnswerVoters == null || pollAnswerVoters.voters <= 0 || !MessageObject.canShowVotersList(tL_messageMediaPoll)) {
                        ow0Var4 = ow0Var;
                        arrayList = arrayList3;
                        jw0Var = jw0Var2;
                        bArr2 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                    } else {
                        ph.q qVar2 = new ph.q(context, eoVar3.getCurrentAccount(), f6Var);
                        org.telegram.ui.Components.w70 J = G.J();
                        J.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                        ch.a k10 = dh.c.k(f6Var);
                        View view3 = J.B;
                        if (view3 != null) {
                            qVar = qVar2;
                            z19 = false;
                            bh.d c10 = aVar.c(view3, null, false);
                            c10.n(k10);
                            view3.setBackground(c10);
                        } else {
                            qVar = qVar2;
                            z19 = false;
                        }
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new mu0(G, 25), z19);
                        J.k();
                        long dialogId = ow0Var.H.getDialogId();
                        int id2 = ow0Var.H.getId();
                        int i17 = pollAnswerVoters.voters;
                        arrayList = arrayList3;
                        nj0 nj0Var = new nj0(4, ow0Var, eoVar3);
                        ow0Var4 = ow0Var;
                        jw0Var = jw0Var2;
                        byte[] bArr5 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                        ph.q qVar3 = qVar;
                        View a2 = qVar3.a(eoVar3, dialogId, id2, bArr5, i17, nj0Var);
                        eoVar3 = eoVar3;
                        bArr2 = bArr5;
                        J.q(a2);
                        qVar3.setMinimumHeight(AndroidUtilities.dp(48.0f));
                        qVar3.setText(LocaleController.formatPluralString("PollVotesCount", pollAnswerVoters.voters, new Object[0]));
                        qVar3.a.d(pollAnswerVoters.recent_voters, false);
                        qVar3.setLayoutParams(w7.a6.n(-1, 48));
                        qVar3.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I5, false), 12, 0));
                        qVar3.setOnClickListener(new ow(24, G, J));
                        G.q(qVar3);
                        G.k();
                    }
                    if (!z20) {
                        pollAnswer3 = pollAnswer2;
                        ow0Var2 = ow0Var4;
                    } else if (z17) {
                        int i18 = R.drawable.msg_unvote;
                        CharSequence string = LocaleController.getString(R.string.Unvote);
                        eo eoVar4 = eoVar3;
                        TLRPC.PollAnswer pollAnswer6 = pollAnswer2;
                        ow0Var2 = ow0Var4;
                        Runnable ew0Var = new ew0(ow0Var2, z16, eoVar4, arrayList, pollAnswer6);
                        eoVar3 = eoVar4;
                        pollAnswer3 = pollAnswer6;
                        G.c(i18, string, ew0Var, false);
                    } else {
                        pollAnswer3 = pollAnswer2;
                        ow0Var2 = ow0Var4;
                        boolean z22 = z16;
                        if (ph.i.a(ow0Var2.H) == 0) {
                            G.c(R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), new ew0(ow0Var2, z22, pollAnswer3, eoVar3, arrayList), false);
                        }
                    }
                    if (eoVar3.E6()) {
                        G.c(R.drawable.menu_reply, LocaleController.getString(R.string.PollItemQuote), new pf0(ow0Var2, eoVar3, pollAnswer3, 21), false);
                    }
                    if (ow0Var2.H.getDialogId() >= 0 || pollAnswer3.option == null) {
                        eoVar2 = eoVar3;
                        z18 = false;
                    } else {
                        MessagesController messagesController = MessagesController.getInstance(ow0Var2.H.currentAccount);
                        eoVar2 = eoVar3;
                        String publicUsername = DialogObject.getPublicUsername(messagesController.getUserOrChat(ow0Var2.H.getDialogId()));
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(messagesController.linkPrefix);
                        sb2.append("/");
                        if (TextUtils.isEmpty(publicUsername)) {
                            StringBuilder sb3 = new StringBuilder("c/");
                            str = "/";
                            sb3.append(-ow0Var2.H.getDialogId());
                            publicUsername = sb3.toString();
                        } else {
                            str = "/";
                        }
                        sb2.append(publicUsername);
                        sb2.append(str);
                        sb2.append(ow0Var2.H.getId());
                        sb2.append("?option=");
                        sb2.append(new String(Base64.encode(pollAnswer3.option, 9)));
                        z18 = false;
                        G.c(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new ak0(24, ow0Var2, sb2.toString()), false);
                    }
                    G.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new ak0(25, ow0Var2, pollAnswer3), z18);
                    TLRPC.Peer peer = pollAnswer3.added_by;
                    if (peer != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        long clientUserId = UserConfig.getInstance(ow0Var2.H.currentAccount).getClientUserId();
                        messageObject = primaryMessageObject;
                        long currentTime = ConnectionsManager.getInstance(ow0Var2.H.currentAccount).getCurrentTime();
                        long j3 = MessagesController.getInstance(ow0Var2.H.currentAccount).config.pollAnswerDeletePeriod.get(TimeUnit.SECONDS) + pollAnswer3.date;
                        if (!ow0Var2.H.isForwarded()) {
                            TLRPC.Poll poll2 = tL_messageMediaPoll2.poll;
                            if (!poll2.closed && (poll2.creator || (peerDialogId == clientUserId && currentTime < j3))) {
                                G.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new ak0(26, ow0Var2, bArr2), true);
                            }
                        }
                        G.k();
                        TLObject userOrChat = MessagesController.getInstance(ow0Var2.H.currentAccount).getUserOrChat(peerDialogId);
                        CharSequence replaceTags = AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.PollAddedByAtTime, DialogObject.getShortName(userOrChat), LocaleController.formatDateTime(pollAnswer3.date, true)));
                        eoVar3 = eoVar2;
                        a3.h0 h0Var = new a3.h0(ow0Var2, peerDialogId, eoVar3, 23);
                        Context context2 = G.e;
                        FrameLayout frameLayout = new FrameLayout(context2);
                        int i19 = org.telegram.ui.ActionBar.j6.i6;
                        org.telegram.ui.ActionBar.f6 f6Var2 = G.d;
                        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(i19, f6Var2), 0, 12));
                        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context2);
                        w9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
                        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
                        g9Var.p(userOrChat);
                        w9Var.e(userOrChat, g9Var);
                        frameLayout.addView(w9Var, w7.a6.d(34, 34.0f, 51, 13.0f, 11.0f, 0.0f, 11.0f));
                        TextView textView = new TextView(context2);
                        org.telegram.messenger.em.n(org.telegram.ui.ActionBar.j6.j5, f6Var2, textView, 1, 14.0f);
                        textView.setText(replaceTags);
                        textView.setMaxWidth(AndroidUtilities.dp(150.0f));
                        textView.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                        frameLayout.addView(textView, w7.a6.d(-2, -2.0f, 55, 59.0f, 8.0f, 16.0f, 0.0f));
                        frameLayout.setOnClickListener(new org.telegram.ui.Components.u10(4, G, h0Var));
                        G.r(frameLayout, w7.a6.n(-1, -2));
                        G.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                        G.R(aVar, dh.c.k(f6Var), false);
                        G.Y();
                        ViewGroup viewGroup2 = G.A;
                        ow0Var2.R = viewGroup2;
                        viewGroup2.setPivotX(0.0f);
                        ow0Var2.R.setPivotY(0.0f);
                        jw0Var4.addView(ow0Var2.R, w7.a6.e(-2, -2, 51));
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        eoVar3.n8(messageObject, arrayList6, arrayList7, arrayList8);
                        df dfVar2 = new df(eoVar3, 6);
                        messageObject2 = ow0Var2.H;
                        List<TLRPC.TL_availableReaction> enabledReactionsList = eoVar3.getMediaDataController().getEnabledReactionsList();
                        z10 = eoVar3.u() && !eoVar3.c() && eoVar3.f == null && messageObject2.hasReactions() && !((ChatObject.isChannel(eoVar3.e) && !eoVar3.e.megagroup) || ChatObject.isMonoForum(eoVar3.e) || enabledReactionsList.isEmpty() || !messageObject2.messageOwner.reactions.can_see_list || messageObject2.isSecretMedia());
                        if (messageObject2.isForwardedChannelPost()) {
                            messageObject3 = messageObject2;
                            if (!messageObject3.isSecretMedia()) {
                                if (eoVar3.R3 != 5) {
                                    if (!eoVar3.u()) {
                                        if (!eoVar3.c()) {
                                            if (messageObject3.isReactionsAvailable()) {
                                                TLRPC.ChatFull chatFull2 = eoVar3.Z7;
                                                if (chatFull2 != null) {
                                                    if (chatFull2.available_reactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    }
                                                }
                                                if (chatFull2 == null) {
                                                }
                                                if (eoVar3.f == null) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            z11 = false;
                        } else {
                            messageObject3 = messageObject2;
                            TLRPC.ChatFull chatFull3 = eoVar3.getMessagesController().getChatFull(-messageObject3.getFromChatId());
                            if (chatFull3 != null) {
                                if (!eoVar3.u()) {
                                    if (eoVar3.R3 != 5) {
                                        if (!eoVar3.c()) {
                                            if (messageObject3.isReactionsAvailable()) {
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
                        if (!z10 || eoVar3.c() || eoVar3.e == null || !messageObject3.isOutOwner() || !messageObject3.isSent() || messageObject3.isEditing() || messageObject3.isSending() || messageObject3.isSendError() || messageObject3.isContentUnread() || messageObject3.isUnread()) {
                            messageObject4 = messageObject3;
                        } else {
                            messageObject4 = messageObject3;
                            if (ConnectionsManager.getInstance(eoVar3.getCurrentAccount()).getCurrentTime() - messageObject4.messageOwner.date < eoVar3.getMessagesController().chatReadMarkExpirePeriod && ((ChatObject.isMegagroup(eoVar3.e) || !ChatObject.isChannel(eoVar3.e)) && (chatFull = eoVar3.Z7) != null && chatFull.participants_count <= eoVar3.getMessagesController().chatReadMarkSizeThreshold && !(messageObject4.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) && eoVar3.R3 != 3 && messageObject4.canSetReaction() && !ChatObject.isMonoForum(eoVar3.e))) {
                                z13 = true;
                                if (eoVar3.e != null && !messageObject4.isOut() && ChatObject.isMonoForum(eoVar3.e) && ChatObject.canManageMonoForum(eoVar3.getCurrentAccount(), eoVar3.e)) {
                                    int i20 = ((-eoVar3.e.linked_monoforum_id) > messageObject4.getFromChatId() ? 1 : ((-eoVar3.e.linked_monoforum_id) == messageObject4.getFromChatId() ? 0 : -1));
                                }
                                if (!z10 && eoVar3.e == null && eoVar3.h == null && (user = eoVar3.f) != null && !UserObject.isUserSelf(user) && !UserObject.isReplyUser(eoVar3.f) && !UserObject.isAnonymous(eoVar3.f)) {
                                    user2 = eoVar3.f;
                                    if (!user2.bot && !UserObject.isService(user2.id) && (((userFull = eoVar3.a8) == null || !userFull.read_dates_private) && !eoVar3.c() && messageObject4.isOutOwner() && messageObject4.isSent() && !messageObject4.isEditing() && !messageObject4.isSending() && !messageObject4.isSendError() && !messageObject4.isContentUnread() && !messageObject4.isUnread() && eoVar3.getConnectionsManager().getCurrentTime() - messageObject4.messageOwner.date < eoVar3.getMessagesController().pmReadDateExpirePeriod && !(messageObject4.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                                        z14 = true;
                                        TLRPC.User user3 = eoVar3.f;
                                        boolean z23 = ((user3 == null && (UserObject.isReplyUser(user3) || UserObject.isAnonymous(eoVar3.f))) || eoVar3.c() || !messageObject4.isEdited() || (messageObject4.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                                        org.telegram.ui.Components.w70 G2 = org.telegram.ui.Components.w70.G(jw0Var, eoVar3.getResourceProvider(), null, !z10 || z13);
                                        if (z13) {
                                            gi0 gi0Var = new gi0(ow0Var2.getContext(), eoVar3.getCurrentAccount(), messageObject4, eoVar3.e);
                                            FrameLayout frameLayout2 = new FrameLayout(ow0Var2.getContext());
                                            frameLayout2.addView(gi0Var, w7.a6.c(36.0f, -1));
                                            org.telegram.ui.Components.w70 J2 = G2.J();
                                            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, ow0Var2.getContext(), ow0Var2.b, true, false);
                                            g1Var.setItemHeight(44);
                                            ow0 ow0Var6 = ow0Var2;
                                            g1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                                            g1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                                            FrameLayout frameLayout3 = new FrameLayout(ow0Var6.getContext());
                                            messageObject5 = messageObject4;
                                            LinearLayout linearLayout = new LinearLayout(ow0Var6.getContext());
                                            linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var));
                                            linearLayout.setOrientation(1);
                                            eoVar = eoVar3;
                                            org.telegram.ui.Components.vl0 a10 = gi0Var.a();
                                            frameLayout3.addView(g1Var);
                                            linearLayout.addView(frameLayout3);
                                            linearLayout.addView(new org.telegram.ui.ActionBar.m1(ow0Var6.getContext(), f6Var), w7.a6.n(-1, 8));
                                            frameLayout3.setOnClickListener(new fw0(G2));
                                            dfVar = dfVar2;
                                            gw0 gw0Var = new gw0(ow0Var6, gi0Var, eoVar, a10, linearLayout, G2, J2);
                                            w70Var = G2;
                                            ow0Var3 = ow0Var6;
                                            gi0Var.setOnClickListener(gw0Var);
                                            linearLayout.addView(a10, w7.a6.n(-1, -2));
                                            J2.q(linearLayout);
                                            w70Var.q(frameLayout2);
                                            w70Var.k();
                                        } else {
                                            eoVar = eoVar3;
                                            messageObject5 = messageObject4;
                                            w70Var = G2;
                                            dfVar = dfVar2;
                                            ow0Var3 = ow0Var2;
                                            if (z14) {
                                                w70Var.r(new org.telegram.ui.Components.ic0(ow0Var3.getContext(), 0, messageObject5, new cw0(ow0Var3, 1), ow0Var3.b), w7.a6.n(-1, 36));
                                                w70Var.k();
                                            } else if (z23) {
                                                messageObject6 = messageObject5;
                                                w70Var.r(new org.telegram.ui.Components.ic0(ow0Var3.getContext(), 1, messageObject5, new cw0(ow0Var3, 2), ow0Var3.b), w7.a6.n(-1, 36));
                                                w70Var.k();
                                                i10 = 0;
                                                for (size = arrayList6.size(); i10 < size; size = size) {
                                                    w70Var.c(((Integer) arrayList6.get(i10)).intValue(), (CharSequence) arrayList7.get(i10), new uu0(ow0Var3, dfVar, ((Integer) arrayList8.get(i10)).intValue(), 2), false);
                                                    i10++;
                                                    arrayList6 = arrayList6;
                                                }
                                                w70Var.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                                                w70Var.R(aVar, dh.c.k(f6Var), false);
                                                w70Var.Y();
                                                ViewGroup viewGroup3 = w70Var.A;
                                                ow0Var3.T = viewGroup3;
                                                viewGroup3.setPivotX(0.0f);
                                                ow0Var3.T.setPivotY(0.0f);
                                                jw0Var4.addView(ow0Var3.T, w7.a6.e(-2, -2, 51));
                                                viewGroup = ow0Var3.T;
                                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                                    ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new ul0(ow0Var3, 6));
                                                    ow0Var3.T.setOnTouchListener(new e0(ow0Var3, 5));
                                                }
                                                if (z12) {
                                                    z15 = true;
                                                } else {
                                                    eo eoVar5 = eoVar;
                                                    org.telegram.ui.Components.pk0 pk0Var = new org.telegram.ui.Components.pk0((eoVar.getUserConfig().getClientUserId() > eoVar.a() ? 1 : (eoVar.getUserConfig().getClientUserId() == eoVar.a() ? 0 : -1)) == 0 ? 3 : 0, eoVar5.getCurrentAccount(), ow0Var3.getContext(), eoVar5, ow0Var3.b);
                                                    pk0Var.a = true;
                                                    float f7 = 22;
                                                    pk0Var.setPadding(AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : 24), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 24 : 0), AndroidUtilities.dp(f7));
                                                    pk0Var.setDelegate(new hw0(ow0Var3, eoVar5, messageObject6, pk0Var));
                                                    ow0Var3.Q = pk0Var;
                                                    jw0Var4.addView(pk0Var, w7.a6.e(-2, (int) ((pk0Var.getTopOffset() / AndroidUtilities.density) + 52.0f + f7), 51));
                                                    z15 = true;
                                                    pk0Var.p(messageObject6, eoVar5.Z7, true);
                                                    ow0Var3.Q.setTransitionProgress(1.0f);
                                                }
                                                ow0Var3.e();
                                                ow0Var3.e0 = new an(this, 0);
                                                ow0Var3.show();
                                                return z15;
                                            }
                                        }
                                        messageObject6 = messageObject5;
                                        i10 = 0;
                                        while (i10 < size) {
                                        }
                                        w70Var.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                                        w70Var.R(aVar, dh.c.k(f6Var), false);
                                        w70Var.Y();
                                        ViewGroup viewGroup32 = w70Var.A;
                                        ow0Var3.T = viewGroup32;
                                        viewGroup32.setPivotX(0.0f);
                                        ow0Var3.T.setPivotY(0.0f);
                                        jw0Var4.addView(ow0Var3.T, w7.a6.e(-2, -2, 51));
                                        viewGroup = ow0Var3.T;
                                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                        }
                                        if (z12) {
                                        }
                                        ow0Var3.e();
                                        ow0Var3.e0 = new an(this, 0);
                                        ow0Var3.show();
                                        return z15;
                                    }
                                }
                                z14 = false;
                                TLRPC.User user32 = eoVar3.f;
                                if (user32 == null) {
                                }
                                org.telegram.ui.Components.w70 G22 = org.telegram.ui.Components.w70.G(jw0Var, eoVar3.getResourceProvider(), null, !z10 || z13);
                                if (z13) {
                                }
                                messageObject6 = messageObject5;
                                i10 = 0;
                                while (i10 < size) {
                                }
                                w70Var.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                                w70Var.R(aVar, dh.c.k(f6Var), false);
                                w70Var.Y();
                                ViewGroup viewGroup322 = w70Var.A;
                                ow0Var3.T = viewGroup322;
                                viewGroup322.setPivotX(0.0f);
                                ow0Var3.T.setPivotY(0.0f);
                                jw0Var4.addView(ow0Var3.T, w7.a6.e(-2, -2, 51));
                                viewGroup = ow0Var3.T;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                }
                                if (z12) {
                                }
                                ow0Var3.e();
                                ow0Var3.e0 = new an(this, 0);
                                ow0Var3.show();
                                return z15;
                            }
                        }
                        z13 = false;
                        if (eoVar3.e != null) {
                            int i202 = ((-eoVar3.e.linked_monoforum_id) > messageObject4.getFromChatId() ? 1 : ((-eoVar3.e.linked_monoforum_id) == messageObject4.getFromChatId() ? 0 : -1));
                        }
                        if (!z10) {
                            user2 = eoVar3.f;
                            if (!user2.bot) {
                                z14 = true;
                                TLRPC.User user322 = eoVar3.f;
                                if (user322 == null) {
                                }
                                org.telegram.ui.Components.w70 G222 = org.telegram.ui.Components.w70.G(jw0Var, eoVar3.getResourceProvider(), null, !z10 || z13);
                                if (z13) {
                                }
                                messageObject6 = messageObject5;
                                i10 = 0;
                                while (i10 < size) {
                                }
                                w70Var.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                                w70Var.R(aVar, dh.c.k(f6Var), false);
                                w70Var.Y();
                                ViewGroup viewGroup3222 = w70Var.A;
                                ow0Var3.T = viewGroup3222;
                                viewGroup3222.setPivotX(0.0f);
                                ow0Var3.T.setPivotY(0.0f);
                                jw0Var4.addView(ow0Var3.T, w7.a6.e(-2, -2, 51));
                                viewGroup = ow0Var3.T;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                }
                                if (z12) {
                                }
                                ow0Var3.e();
                                ow0Var3.e0 = new an(this, 0);
                                ow0Var3.show();
                                return z15;
                            }
                        }
                        z14 = false;
                        TLRPC.User user3222 = eoVar3.f;
                        if (user3222 == null) {
                        }
                        org.telegram.ui.Components.w70 G2222 = org.telegram.ui.Components.w70.G(jw0Var, eoVar3.getResourceProvider(), null, !z10 || z13);
                        if (z13) {
                        }
                        messageObject6 = messageObject5;
                        i10 = 0;
                        while (i10 < size) {
                        }
                        w70Var.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                        w70Var.R(aVar, dh.c.k(f6Var), false);
                        w70Var.Y();
                        ViewGroup viewGroup32222 = w70Var.A;
                        ow0Var3.T = viewGroup32222;
                        viewGroup32222.setPivotX(0.0f);
                        ow0Var3.T.setPivotY(0.0f);
                        jw0Var4.addView(ow0Var3.T, w7.a6.e(-2, -2, 51));
                        viewGroup = ow0Var3.T;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z12) {
                        }
                        ow0Var3.e();
                        ow0Var3.e0 = new an(this, 0);
                        ow0Var3.show();
                        return z15;
                    }
                    eoVar3 = eoVar2;
                } else {
                    ow0Var2 = ow0Var;
                    jw0Var = jw0Var3;
                }
                messageObject = primaryMessageObject;
                G.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                G.R(aVar, dh.c.k(f6Var), false);
                G.Y();
                ViewGroup viewGroup22 = G.A;
                ow0Var2.R = viewGroup22;
                viewGroup22.setPivotX(0.0f);
                ow0Var2.R.setPivotY(0.0f);
                jw0Var4.addView(ow0Var2.R, w7.a6.e(-2, -2, 51));
                ArrayList arrayList62 = new ArrayList();
                ArrayList arrayList72 = new ArrayList();
                ArrayList arrayList82 = new ArrayList();
                eoVar3.n8(messageObject, arrayList62, arrayList72, arrayList82);
                df dfVar22 = new df(eoVar3, 6);
                messageObject2 = ow0Var2.H;
                List<TLRPC.TL_availableReaction> enabledReactionsList2 = eoVar3.getMediaDataController().getEnabledReactionsList();
                if (eoVar3.u()) {
                }
                if (messageObject2.isForwardedChannelPost()) {
                }
                z12 = z11;
                if (z10) {
                }
                messageObject4 = messageObject3;
                z13 = false;
                if (eoVar3.e != null) {
                }
                if (!z10) {
                }
                z14 = false;
                TLRPC.User user32222 = eoVar3.f;
                if (user32222 == null) {
                }
                org.telegram.ui.Components.w70 G22222 = org.telegram.ui.Components.w70.G(jw0Var, eoVar3.getResourceProvider(), null, !z10 || z13);
                if (z13) {
                }
                messageObject6 = messageObject5;
                i10 = 0;
                while (i10 < size) {
                }
                w70Var.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                w70Var.R(aVar, dh.c.k(f6Var), false);
                w70Var.Y();
                ViewGroup viewGroup322222 = w70Var.A;
                ow0Var3.T = viewGroup322222;
                viewGroup322222.setPivotX(0.0f);
                ow0Var3.T.setPivotY(0.0f);
                jw0Var4.addView(ow0Var3.T, w7.a6.e(-2, -2, 51));
                viewGroup = ow0Var3.T;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z12) {
                }
                ow0Var3.e();
                ow0Var3.e0 = new an(this, 0);
                ow0Var3.show();
                return z15;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean W0(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
        MessageObject messageObject = (currentMessagesGroup == null || currentMessagesGroup.messages.isEmpty()) ? t1Var.getMessageObject() : currentMessagesGroup.messages.get(0);
        if (messageObject != null) {
            eo eoVar = this.a;
            boolean z11 = !eoVar.jc && messageObject.getId() == eoVar.ic;
            if (!z10) {
                return z11;
            }
            if (z11 && System.currentTimeMillis() - eoVar.kc > 1000) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final gh.a X() {
        return this.a.Qb;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void X0(org.telegram.ui.Cells.t1 t1Var) {
        eo eoVar = this.a;
        eoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(eoVar.T5), t1Var);
    }

    @Override // org.telegram.ui.Cells.k1
    public final rv0 X1() {
        return this.a.wa;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean Y(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var == null ? null : t1Var.getMessageObject();
        if (messageObject == null || messageObject.messageOwner == null) {
            return false;
        }
        eo eoVar = this.a;
        return (eoVar.R3 == 1 || eoVar.y9() || messageObject.messageOwner.noforwards || messageObject.type == 29) ? false : true;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean Y1(long j3) {
        eo eoVar = this.a;
        TLRPC.Chat chat = eoVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return false;
        }
        return eoVar.getMessagesController().isAdmin(eoVar.e.id, j3);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void Z0(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
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
        MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
        eo eoVar = this.a;
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
                        int childCount = eoVar.x0.getChildCount();
                        for (int i11 = 0; i11 < childCount; i11++) {
                            View childAt = eoVar.x0.getChildAt(i11);
                            if (childAt instanceof org.telegram.ui.Cells.t1) {
                                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                                if (messageObject2.equals(t1Var2.getMessageObject())) {
                                    t1Var = t1Var2;
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
        eoVar.Jb(messageObject, spannableStringBuilder, 1);
        t1Var.g4(1, false, true);
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
    @Override // org.telegram.ui.Cells.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z1(org.telegram.ui.Cells.t1 t1Var, int i10, float f7, float f10, boolean z10) {
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
        org.telegram.ui.ActionBar.p2 p2Var;
        TLRPC.Chat chat2;
        TLRPC.MessageReplyHeader messageReplyHeader5;
        MessageObject messageObject;
        TLRPC.MessageReplyHeader messageReplyHeader6;
        TLRPC.MessageReplyHeader messageReplyHeader7;
        TLRPC.Message message3;
        TL_stories.StoryItem storyItem;
        org.telegram.ui.ActionBar.l lVar;
        boolean e = e();
        eo eoVar = this.a;
        if (!e && !z10) {
            lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
            if ((lVar.s() || eoVar.A9()) && !eoVar.c9.A(t1Var.getMessageObject())) {
                eo.b2(eoVar, t1Var, !t1Var.i3(f7), f7, f10);
                return;
            }
            return;
        }
        if (UserObject.isReplyUser(eoVar.f)) {
            q(t1Var);
            return;
        }
        MessageObject messageObject2 = t1Var.getMessageObject();
        if (messageObject2 == null) {
            return;
        }
        if (messageObject2.isReplyToStory() && (storyItem = (message3 = messageObject2.messageOwner).replyStory) != null) {
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                org.telegram.messenger.a2.o(R.string.StoryNotFound, org.telegram.ui.Components.wc.a0(eoVar), R.raw.story_bomb1, 36);
                return;
            }
            storyItem.dialogId = DialogObject.getPeerDialogId(message3.reply_to.peer);
            storyItem.messageId = messageObject2.getId();
            storyItem.messageType = 3;
            zh.a6.b(storyItem, eoVar.f);
            eoVar.getOrCreateStoryViewer().G(eoVar.getParentActivity(), storyItem, zh.s5.a(eoVar.x0));
            return;
        }
        TLRPC.Message message4 = messageObject2.messageOwner;
        if (message4 != null && (messageReplyHeader7 = message4.reply_to) != null && (messageReplyHeader7.flags & 2048) != 0) {
            num = Integer.valueOf(messageReplyHeader7.todo_item_id);
        } else {
            if (message4 != null && (messageReplyHeader2 = message4.reply_to) != null && (bArr = messageReplyHeader2.poll_option) != null) {
                num = null;
                str = null;
                long j10 = eoVar.T5;
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
                org.telegram.ui.Components.wc.a0(eoVar).Q(R.raw.error, 36, LocaleController.getString((message5 == null && (messageReplyHeader3 = message5.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
            }
            if (message4 != null && (messageReplyHeader = message4.reply_to) != null && messageReplyHeader.quote) {
                String str3 = messageReplyHeader.quote_text;
                r9 = (messageReplyHeader.flags & 1024) != 0 ? messageReplyHeader.quote_offset : -1;
                str = str3;
                num = null;
                bArr = null;
                long j102 = eoVar.T5;
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
                            chat = j3 < 0 ? eoVar.getMessagesController().getChat(Long.valueOf(-j3)) : null;
                            if (j3 != Long.MAX_VALUE) {
                                boolean z12 = z11;
                                if (j3 == eoVar.T5 || chat == null || ChatObject.isPublic(chat) || (!chat.left && !chat.kicked)) {
                                    if (((j3 == eoVar.T5 && (!ChatObject.isForum(eoVar.e) || !z12)) || j3 == Long.MAX_VALUE) && (eoVar.R3 != 3 || ((messageObject = messageObject2.replyMessageObject) != null && messageObject.getSavedDialogId() == eoVar.d()))) {
                                        int i11 = eoVar.R3;
                                        if (i11 == 2 || i11 == 1) {
                                            eoVar.V8.S0(i10);
                                            eoVar.finishFragment();
                                            return;
                                        }
                                        if (bArr != null) {
                                            eoVar.R7 = bArr;
                                        } else if (num != null) {
                                            eoVar.Q7 = num;
                                        } else {
                                            TLRPC.Message message6 = messageObject2.messageOwner;
                                            if (message6 != null && (messageReplyHeader5 = message6.reply_to) != null && messageReplyHeader5.quote) {
                                                eoVar.N7 = true;
                                                eoVar.P7 = messageReplyHeader5.quote_text;
                                                eoVar.S7 = r9;
                                                eoVar.M7 = true;
                                            }
                                        }
                                        di.o3 o3Var = new di.o3(this, i10, messageObject2, num, bArr, 17);
                                        if (!eoVar.A0.N) {
                                            o3Var.run();
                                            return;
                                        }
                                        eoVar.r3 = false;
                                        eoVar.lb(false, true, false);
                                        eoVar.Fc(eoVar.getMediaDataController().getMask(), eoVar.getMediaDataController().getSearchPosition(), eoVar.getMediaDataController().getSearchCount());
                                        AndroidUtilities.runOnUIThread(o3Var, 80L);
                                        return;
                                    }
                                    Integer num2 = num;
                                    byte[] bArr2 = bArr;
                                    if (LaunchActivity.G1 != null) {
                                        nf.e eVar = eoVar.Ab;
                                        if (eVar != null) {
                                            eVar.a(false);
                                            p2Var = null;
                                            eoVar.Ab = null;
                                        } else {
                                            p2Var = null;
                                        }
                                        LaunchActivity launchActivity = LaunchActivity.G1;
                                        final j0 j0Var = new j0(this, messageObject2, t1Var);
                                        eoVar.Ab = j0Var;
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
                                        org.telegram.ui.ActionBar.p2 p2Var2 = !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.p2) hc.b.i(1, arrayList) : p2Var;
                                        if (p2Var2 == null || MessagesController.getInstance(launchActivity.O).checkCanOpenChat(bundle, p2Var2)) {
                                            AndroidUtilities.runOnUIThread(new k90(launchActivity, bundle, bArr2, i10, num2, str4, i13, j3, j0Var, p2Var2));
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
                                org.telegram.ui.Components.wc.a0(eoVar).Q(R.raw.error, 36, LocaleController.getString((message52 == null && (messageReplyHeader3 = message52.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
                            } else {
                                messageObject2.replyTextRevealed = true;
                                eoVar.qc(messageObject2, true);
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
                    org.telegram.ui.Components.wc.a0(eoVar).Q(R.raw.error, 36, LocaleController.getString((message522 == null && (messageReplyHeader3 = message522.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
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
                org.telegram.ui.Components.wc.a0(eoVar).Q(R.raw.error, 36, LocaleController.getString((message5222 == null && (messageReplyHeader3 = message5222.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
            }
            num = null;
        }
        bArr = null;
        str = null;
        long j1022 = eoVar.T5;
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
        org.telegram.ui.Components.wc.a0(eoVar).Q(R.raw.error, 36, LocaleController.getString((message52222 == null && (messageReplyHeader3 = message52222.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:259:0x03f4, code lost:
    
        if (r9.paid_reactions_available != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x03fa, code lost:
    
        if (r8.isEmpty() == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x042a, code lost:
    
        if (r9.paid_reactions_available != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0446, code lost:
    
        if (r8.isEmpty() != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0434, code lost:
    
        if (org.telegram.messenger.ChatObject.isChannel(r5.e) == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0440, code lost:
    
        if (org.telegram.messenger.ChatObject.isMonoForum(r5.e) != false) goto L142;
     */
    /* JADX WARN: Removed duplicated region for block: B:182:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x05b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0718 A[LOOP:2: B:204:0x0716->B:205:0x0718, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03c3  */
    @Override // org.telegram.ui.Cells.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a2(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        me1 me1Var;
        TLRPC.TodoItem todoItem2;
        TLRPC.TodoCompletion todoCompletion;
        me1 me1Var2;
        MessageObject messageObject;
        me1 me1Var3;
        int i10;
        MessageObject messageObject2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        df dfVar;
        MessageObject messageObject3;
        boolean z14;
        ArrayList arrayList;
        ArrayList arrayList2;
        pe1 pe1Var;
        ArrayList arrayList3;
        eo eoVar;
        MessageObject messageObject4;
        int size;
        int i11;
        ViewGroup viewGroup;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        final eo eoVar2 = this.a;
        if (eoVar2.getParentActivity() == null || eoVar2.getParentActivity() == null) {
            return false;
        }
        bi.x4 x4Var = eoVar2.x1;
        if (x4Var != null && x4Var.V) {
            x4Var.e(true);
        }
        am amVar = eoVar2.B1;
        if (amVar != null && amVar.V) {
            amVar.e(true);
        }
        MessageObject primaryMessageObject = t1Var.getPrimaryMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(primaryMessageObject);
        if (primaryMessageObject == null || !(media instanceof TLRPC.TL_messageMediaToDo)) {
            return false;
        }
        eoVar2.d5 = primaryMessageObject;
        eoVar2.e5 = null;
        final pe1 pe1Var2 = new pe1(eoVar2.getParentActivity(), eoVar2.getResourceProvider());
        final int i12 = todoItem.id;
        pe1Var2.K = t1Var;
        pe1Var2.O = i12;
        MessageObject messageObject5 = t1Var.getMessageObject();
        pe1Var2.G = messageObject5;
        pe1Var2.H = messageObject5 != null && messageObject5.isOutOwner();
        org.telegram.ui.Cells.t1 t1Var2 = pe1Var2.K;
        me1 me1Var4 = pe1Var2.c;
        if (t1Var2 != null) {
            pe1Var2.L = eoVar2.s9 - AndroidUtilities.dp(4.0f);
            pe1Var2.M = t1Var.n;
            if (t1Var.getParent() instanceof View) {
                View view = (View) t1Var.getParent();
                pe1Var2.L = view.getY() + pe1Var2.L;
                pe1Var2.M = view.getY() + pe1Var2.M;
            }
            int width = pe1Var2.K.getWidth();
            int height = pe1Var2.K.getHeight();
            pe1Var2.K.getHeight();
            me1Var = me1Var4;
            ne1 ne1Var = new ne1(pe1Var2, pe1Var2.getContext(), UserConfig.selectedAccount, pe1Var2.K.getResourcesProvider(), i12, width, height);
            pe1Var2.I = ne1Var;
            pe1Var2.K.h1(ne1Var);
            pe1Var2.I.i1(pe1Var2.K);
            pe1Var2.I.setDelegate(new oe1(pe1Var2));
            ne1 ne1Var2 = pe1Var2.I;
            MessageObject messageObject6 = pe1Var2.G;
            MessageObject.GroupedMessages currentMessagesGroup = pe1Var2.K.getCurrentMessagesGroup();
            org.telegram.ui.Cells.t1 t1Var3 = pe1Var2.K;
            ne1Var2.X3(messageObject6, currentMessagesGroup, t1Var3.F, t1Var3.E, t1Var3.G, false);
            me1Var.addView(pe1Var2.I, new FrameLayout.LayoutParams(pe1Var2.K.getWidth(), height, 51));
            nw0 nw0Var = new nw0(pe1Var2.getContext(), UserConfig.selectedAccount, pe1Var2.K.getResourcesProvider(), width, height, 1);
            pe1Var2.J = nw0Var;
            pe1Var2.K.j1(nw0Var);
            pe1Var2.K.h1(pe1Var2.J);
            pe1Var2.J.i1(pe1Var2.K);
            pe1Var2.J.setDelegate(new qb.b(18));
            nw0 nw0Var2 = pe1Var2.J;
            MessageObject messageObject7 = pe1Var2.G;
            MessageObject.GroupedMessages currentMessagesGroup2 = pe1Var2.K.getCurrentMessagesGroup();
            org.telegram.ui.Cells.t1 t1Var4 = pe1Var2.K;
            nw0Var2.X3(messageObject7, currentMessagesGroup2, t1Var4.F, t1Var4.E, t1Var4.G, false);
            me1Var.addView(pe1Var2.J, new FrameLayout.LayoutParams(pe1Var2.K.getWidth(), height, 51));
        } else {
            me1Var = me1Var4;
        }
        bi.p1 p1Var = pe1Var2.e;
        p1Var.bringToFront();
        me1 me1Var5 = pe1Var2.d;
        me1Var5.bringToFront();
        pe1Var2.h.bringToFront();
        p1Var.w(false);
        org.telegram.ui.ActionBar.f6 f6Var = pe1Var2.a;
        org.telegram.ui.Components.w70 F = org.telegram.ui.Components.w70.F(me1Var, f6Var, null);
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) MessageObject.getMedia(pe1Var2.G);
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
        if (!pe1Var2.G.canCompleteTodo()) {
            me1Var2 = me1Var5;
        } else if (todoCompletion != null) {
            me1Var2 = me1Var5;
            F.p(14, -1, LocaleController.formatTodoCompletedDate(todoCompletion.date));
            F.k();
            final int i15 = 1;
            F.c(R.drawable.msg_cancel, LocaleController.getString(R.string.TodoUncheck), new Runnable() { // from class: org.telegram.ui.he1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            eo eoVar3 = eoVar2;
                            bw0 bw0Var = new bw0(eoVar3);
                            pe1 pe1Var3 = pe1Var2;
                            bw0Var.p0(MessageObject.getMedia(pe1Var3.G), false, i12);
                            bw0Var.e0 = new fz0(10, pe1Var3, eoVar3);
                            eoVar3.presentFragment(bw0Var);
                            pe1Var3.c(false);
                            break;
                        case 1:
                            boolean c10 = eoVar2.c();
                            pe1 pe1Var4 = pe1Var2;
                            if (c10) {
                                Toast.makeText(pe1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                ne1 ne1Var3 = pe1Var4.I;
                                ne1Var3.k4(ne1Var3.O2(i12), false);
                            }
                            pe1Var4.c(true);
                            break;
                        default:
                            boolean c11 = eoVar2.c();
                            pe1 pe1Var5 = pe1Var2;
                            if (c11) {
                                Toast.makeText(pe1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                ne1 ne1Var4 = pe1Var5.I;
                                ne1Var4.k4(ne1Var4.O2(i12), false);
                            }
                            pe1Var5.c(true);
                            break;
                    }
                }
            }, false);
        } else {
            me1Var2 = me1Var5;
            final int i16 = 2;
            F.c(R.drawable.msg_select, LocaleController.getString(R.string.TodoCheck), new Runnable() { // from class: org.telegram.ui.he1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i16) {
                        case 0:
                            eo eoVar3 = eoVar2;
                            bw0 bw0Var = new bw0(eoVar3);
                            pe1 pe1Var3 = pe1Var2;
                            bw0Var.p0(MessageObject.getMedia(pe1Var3.G), false, i12);
                            bw0Var.e0 = new fz0(10, pe1Var3, eoVar3);
                            eoVar3.presentFragment(bw0Var);
                            pe1Var3.c(false);
                            break;
                        case 1:
                            boolean c10 = eoVar2.c();
                            pe1 pe1Var4 = pe1Var2;
                            if (c10) {
                                Toast.makeText(pe1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                ne1 ne1Var3 = pe1Var4.I;
                                ne1Var3.k4(ne1Var3.O2(i12), false);
                            }
                            pe1Var4.c(true);
                            break;
                        default:
                            boolean c11 = eoVar2.c();
                            pe1 pe1Var5 = pe1Var2;
                            if (c11) {
                                Toast.makeText(pe1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                ne1 ne1Var4 = pe1Var5.I;
                                ne1Var4.k4(ne1Var4.O2(i12), false);
                            }
                            pe1Var5.c(true);
                            break;
                    }
                }
            }, false);
        }
        if (todoItem2 != null) {
            F.c(R.drawable.menu_reply, LocaleController.getString(R.string.TodoItemQuote), new ce1(pe1Var2, eoVar2, todoItem2, 2), false);
            if (pe1Var2.G.getDialogId() < 0) {
                MessagesController messagesController = MessagesController.getInstance(pe1Var2.G.currentAccount);
                String publicUsername = DialogObject.getPublicUsername(messagesController.getUserOrChat(pe1Var2.G.getDialogId()));
                StringBuilder sb2 = new StringBuilder("https://");
                sb2.append(messagesController.linkPrefix);
                sb2.append("/");
                if (TextUtils.isEmpty(publicUsername)) {
                    StringBuilder sb3 = new StringBuilder("c/");
                    messageObject = primaryMessageObject;
                    me1Var3 = me1Var2;
                    sb3.append(-pe1Var2.G.getDialogId());
                    publicUsername = sb3.toString();
                } else {
                    messageObject = primaryMessageObject;
                    me1Var3 = me1Var2;
                }
                sb2.append(publicUsername);
                sb2.append("/");
                sb2.append(pe1Var2.G.getId());
                sb2.append("?task=");
                sb2.append(todoItem2.id);
                F.c(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new r91(7, pe1Var2, sb2.toString()), false);
            } else {
                messageObject = primaryMessageObject;
                me1Var3 = me1Var2;
            }
            F.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new r91(8, pe1Var2, todoItem2), false);
        } else {
            messageObject = primaryMessageObject;
            me1Var3 = me1Var2;
        }
        if (pe1Var2.G.canEditMessage(eoVar2.e)) {
            final int i17 = 0;
            F.c(R.drawable.msg_edit, LocaleController.getString(R.string.TodoEditItem), new Runnable() { // from class: org.telegram.ui.he1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i17) {
                        case 0:
                            eo eoVar3 = eoVar2;
                            bw0 bw0Var = new bw0(eoVar3);
                            pe1 pe1Var3 = pe1Var2;
                            bw0Var.p0(MessageObject.getMedia(pe1Var3.G), false, i13);
                            bw0Var.e0 = new fz0(10, pe1Var3, eoVar3);
                            eoVar3.presentFragment(bw0Var);
                            pe1Var3.c(false);
                            break;
                        case 1:
                            boolean c10 = eoVar2.c();
                            pe1 pe1Var4 = pe1Var2;
                            if (c10) {
                                Toast.makeText(pe1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                ne1 ne1Var3 = pe1Var4.I;
                                ne1Var3.k4(ne1Var3.O2(i13), false);
                            }
                            pe1Var4.c(true);
                            break;
                        default:
                            boolean c11 = eoVar2.c();
                            pe1 pe1Var5 = pe1Var2;
                            if (c11) {
                                Toast.makeText(pe1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                ne1 ne1Var4 = pe1Var5.I;
                                ne1Var4.k4(ne1Var4.O2(i13), false);
                            }
                            pe1Var5.c(true);
                            break;
                    }
                }
            }, false);
            if (tL_messageMediaToDo.todo.list.size() > 1) {
                i10 = 51;
                F.c(R.drawable.msg_delete, LocaleController.getString(R.string.TodoDeleteItem), new org.telegram.ui.Components.g21(pe1Var2, tL_messageMediaToDo, i12, eoVar2, 11), false);
                F.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                ch.e k10 = dh.c.k(f6Var);
                zg.a aVar = pe1Var2.F;
                F.R(aVar, k10, false);
                F.Y();
                ViewGroup viewGroup2 = F.A;
                pe1Var2.Q = viewGroup2;
                viewGroup2.setPivotX(0.0f);
                pe1Var2.Q.setPivotY(0.0f);
                me1Var3.addView(pe1Var2.Q, w7.a6.e(-2, -2, i10));
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                eoVar2.n8(messageObject, arrayList4, arrayList5, arrayList6);
                df dfVar2 = new df(eoVar2, 7);
                messageObject2 = pe1Var2.G;
                List<TLRPC.TL_availableReaction> enabledReactionsList = eoVar2.getMediaDataController().getEnabledReactionsList();
                boolean z15 = eoVar2.u() && !eoVar2.c() && eoVar2.f == null && messageObject2.hasReactions() && !((ChatObject.isChannel(eoVar2.e) && !eoVar2.e.megagroup) || ChatObject.isMonoForum(eoVar2.e) || enabledReactionsList.isEmpty() || !messageObject2.messageOwner.reactions.can_see_list || messageObject2.isSecretMedia());
                if (messageObject2.isForwardedChannelPost()) {
                    z10 = z15;
                    if (!messageObject2.isSecretMedia()) {
                        if (eoVar2.R3 != 5) {
                            if (!eoVar2.u()) {
                                if (!eoVar2.c()) {
                                    if (messageObject2.isReactionsAvailable()) {
                                        TLRPC.ChatFull chatFull2 = eoVar2.Z7;
                                        if (chatFull2 != null) {
                                            if (chatFull2.available_reactions instanceof TLRPC.TL_chatReactionsNone) {
                                            }
                                        }
                                        if (chatFull2 == null) {
                                        }
                                        if (eoVar2.f == null) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z11 = false;
                } else {
                    z10 = z15;
                    TLRPC.ChatFull chatFull3 = eoVar2.getMessagesController().getChatFull(-messageObject2.getFromChatId());
                    if (chatFull3 != null) {
                        if (!eoVar2.u()) {
                            if (eoVar2.R3 != 5) {
                                if (!eoVar2.c()) {
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
                z12 = (!z10 || eoVar2.c() || eoVar2.e == null || !messageObject2.isOutOwner() || !messageObject2.isSent() || messageObject2.isEditing() || messageObject2.isSending() || messageObject2.isSendError() || messageObject2.isContentUnread() || messageObject2.isUnread() || ConnectionsManager.getInstance(eoVar2.getCurrentAccount()).getCurrentTime() - messageObject2.messageOwner.date >= eoVar2.getMessagesController().chatReadMarkExpirePeriod || (!ChatObject.isMegagroup(eoVar2.e) && ChatObject.isChannel(eoVar2.e)) || (chatFull = eoVar2.Z7) == null || chatFull.participants_count > eoVar2.getMessagesController().chatReadMarkSizeThreshold || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || eoVar2.R3 == 3 || !messageObject2.canSetReaction() || ChatObject.isMonoForum(eoVar2.e)) ? false : true;
                if (eoVar2.e != null && !messageObject2.isOut() && ChatObject.isMonoForum(eoVar2.e) && ChatObject.canManageMonoForum(eoVar2.getCurrentAccount(), eoVar2.e)) {
                    int i18 = ((-eoVar2.e.linked_monoforum_id) > messageObject2.getFromChatId() ? 1 : ((-eoVar2.e.linked_monoforum_id) == messageObject2.getFromChatId() ? 0 : -1));
                }
                if (!z10 && eoVar2.e == null && eoVar2.h == null && (user = eoVar2.f) != null && !UserObject.isUserSelf(user) && !UserObject.isReplyUser(eoVar2.f) && !UserObject.isAnonymous(eoVar2.f)) {
                    user2 = eoVar2.f;
                    if (!user2.bot && !UserObject.isService(user2.id) && (((userFull = eoVar2.a8) == null || !userFull.read_dates_private) && !eoVar2.c() && messageObject2.isOutOwner() && messageObject2.isSent() && !messageObject2.isEditing() && !messageObject2.isSending() && !messageObject2.isSendError() && !messageObject2.isContentUnread() && !messageObject2.isUnread() && eoVar2.getConnectionsManager().getCurrentTime() - messageObject2.messageOwner.date < eoVar2.getMessagesController().pmReadDateExpirePeriod && !(messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                        z13 = true;
                        TLRPC.User user3 = eoVar2.f;
                        boolean z17 = ((user3 == null && (UserObject.isReplyUser(user3) || UserObject.isAnonymous(eoVar2.f))) || eoVar2.c() || !messageObject2.isEdited() || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                        org.telegram.ui.Components.w70 G = org.telegram.ui.Components.w70.G(pe1Var2.c, eoVar2.getResourceProvider(), null, !z10 || z12);
                        if (z12) {
                            dfVar = dfVar2;
                            messageObject3 = messageObject2;
                            z14 = z16;
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            pe1Var = pe1Var2;
                            arrayList3 = arrayList6;
                            eoVar = eoVar2;
                            if (z13) {
                                G.r(new org.telegram.ui.Components.ic0(pe1Var.getContext(), 0, messageObject3, new ge1(pe1Var, 0), pe1Var.a), w7.a6.n(-1, 36));
                                G.k();
                            } else if (z17) {
                                messageObject4 = messageObject3;
                                G.r(new org.telegram.ui.Components.ic0(pe1Var.getContext(), 1, messageObject3, new ge1(pe1Var, 2), pe1Var.a), w7.a6.n(-1, 36));
                                G.k();
                                i11 = 0;
                                for (size = arrayList.size(); i11 < size; size = size) {
                                    G.c(((Integer) arrayList.get(i11)).intValue(), (CharSequence) arrayList2.get(i11), new uu0(pe1Var, dfVar, ((Integer) arrayList3.get(i11)).intValue(), 7), false);
                                    i11++;
                                    arrayList3 = arrayList3;
                                }
                                G.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                                G.R(aVar, dh.c.k(f6Var), false);
                                G.Y();
                                ViewGroup viewGroup3 = G.A;
                                pe1Var.S = viewGroup3;
                                viewGroup3.setPivotX(0.0f);
                                pe1Var.S.setPivotY(0.0f);
                                ViewGroup viewGroup4 = pe1Var.S;
                                FrameLayout.LayoutParams e = w7.a6.e(-2, -2, 51);
                                me1 me1Var6 = pe1Var.d;
                                me1Var6.addView(viewGroup4, e);
                                viewGroup = pe1Var.S;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new ul0(pe1Var, 22));
                                    pe1Var.S.setOnTouchListener(new e0(pe1Var, 7));
                                }
                                if (z14) {
                                    eo eoVar3 = eoVar;
                                    org.telegram.ui.Components.pk0 pk0Var = new org.telegram.ui.Components.pk0((eoVar.getUserConfig().getClientUserId() > eoVar.a() ? 1 : (eoVar.getUserConfig().getClientUserId() == eoVar.a() ? 0 : -1)) == 0 ? 3 : 0, eoVar3.getCurrentAccount(), pe1Var.getContext(), eoVar3, pe1Var.a);
                                    pk0Var.a = true;
                                    float f7 = 22;
                                    pk0Var.setPadding(AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : 24), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 24 : 0), AndroidUtilities.dp(f7));
                                    pk0Var.setDelegate(new le1(pe1Var, eoVar3, messageObject4, pk0Var));
                                    pe1Var.P = pk0Var;
                                    me1Var6.addView(pk0Var, w7.a6.e(-2, (int) ((pk0Var.getTopOffset() / AndroidUtilities.density) + 52.0f + f7), 51));
                                    pk0Var.p(messageObject4, eoVar3.Z7, true);
                                    pe1Var.P.setTransitionProgress(1.0f);
                                }
                                pe1Var.e();
                                pe1Var.c0 = new an(this, 5);
                                pe1Var.show();
                                return true;
                            }
                        } else {
                            gi0 gi0Var = new gi0(pe1Var2.getContext(), eoVar2.getCurrentAccount(), messageObject2, eoVar2.e);
                            FrameLayout frameLayout = new FrameLayout(pe1Var2.getContext());
                            frameLayout.addView(gi0Var, w7.a6.c(36.0f, -1));
                            org.telegram.ui.Components.w70 J = G.J();
                            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, pe1Var2.getContext(), pe1Var2.a, true, false);
                            g1Var.setItemHeight(44);
                            g1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                            g1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                            FrameLayout frameLayout2 = new FrameLayout(pe1Var2.getContext());
                            LinearLayout linearLayout = new LinearLayout(pe1Var2.getContext());
                            linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var));
                            linearLayout.setOrientation(1);
                            eoVar = eoVar2;
                            org.telegram.ui.Components.vl0 a2 = gi0Var.a();
                            frameLayout2.addView(g1Var);
                            linearLayout.addView(frameLayout2);
                            z14 = z16;
                            linearLayout.addView(new org.telegram.ui.ActionBar.m1(pe1Var2.getContext(), f6Var), w7.a6.n(-1, 8));
                            frameLayout2.setOnClickListener(new je1(G));
                            messageObject3 = messageObject2;
                            dfVar = dfVar2;
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            ke1 ke1Var = new ke1(pe1Var2, gi0Var, eoVar, a2, linearLayout, G, J);
                            G = G;
                            pe1Var = pe1Var2;
                            gi0Var.setOnClickListener(ke1Var);
                            linearLayout.addView(a2, w7.a6.n(-1, -2));
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
                        G.R(aVar, dh.c.k(f6Var), false);
                        G.Y();
                        ViewGroup viewGroup32 = G.A;
                        pe1Var.S = viewGroup32;
                        viewGroup32.setPivotX(0.0f);
                        pe1Var.S.setPivotY(0.0f);
                        ViewGroup viewGroup42 = pe1Var.S;
                        FrameLayout.LayoutParams e7 = w7.a6.e(-2, -2, 51);
                        me1 me1Var62 = pe1Var.d;
                        me1Var62.addView(viewGroup42, e7);
                        viewGroup = pe1Var.S;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z14) {
                        }
                        pe1Var.e();
                        pe1Var.c0 = new an(this, 5);
                        pe1Var.show();
                        return true;
                    }
                }
                z13 = false;
                TLRPC.User user32 = eoVar2.f;
                if (user32 == null) {
                }
                org.telegram.ui.Components.w70 G2 = org.telegram.ui.Components.w70.G(pe1Var2.c, eoVar2.getResourceProvider(), null, !z10 || z12);
                if (z12) {
                }
                messageObject4 = messageObject3;
                i11 = 0;
                while (i11 < size) {
                }
                G2.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                G2.R(aVar, dh.c.k(f6Var), false);
                G2.Y();
                ViewGroup viewGroup322 = G2.A;
                pe1Var.S = viewGroup322;
                viewGroup322.setPivotX(0.0f);
                pe1Var.S.setPivotY(0.0f);
                ViewGroup viewGroup422 = pe1Var.S;
                FrameLayout.LayoutParams e72 = w7.a6.e(-2, -2, 51);
                me1 me1Var622 = pe1Var.d;
                me1Var622.addView(viewGroup422, e72);
                viewGroup = pe1Var.S;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z14) {
                }
                pe1Var.e();
                pe1Var.c0 = new an(this, 5);
                pe1Var.show();
                return true;
            }
        }
        i10 = 51;
        F.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
        ch.e k102 = dh.c.k(f6Var);
        zg.a aVar2 = pe1Var2.F;
        F.R(aVar2, k102, false);
        F.Y();
        ViewGroup viewGroup22 = F.A;
        pe1Var2.Q = viewGroup22;
        viewGroup22.setPivotX(0.0f);
        pe1Var2.Q.setPivotY(0.0f);
        me1Var3.addView(pe1Var2.Q, w7.a6.e(-2, -2, i10));
        ArrayList arrayList42 = new ArrayList();
        ArrayList arrayList52 = new ArrayList();
        ArrayList arrayList62 = new ArrayList();
        eoVar2.n8(messageObject, arrayList42, arrayList52, arrayList62);
        df dfVar22 = new df(eoVar2, 7);
        messageObject2 = pe1Var2.G;
        List<TLRPC.TL_availableReaction> enabledReactionsList2 = eoVar2.getMediaDataController().getEnabledReactionsList();
        if (eoVar2.u()) {
        }
        if (messageObject2.isForwardedChannelPost()) {
        }
        boolean z162 = z11;
        if (!z10) {
        }
        if (eoVar2.e != null) {
            int i182 = ((-eoVar2.e.linked_monoforum_id) > messageObject2.getFromChatId() ? 1 : ((-eoVar2.e.linked_monoforum_id) == messageObject2.getFromChatId() ? 0 : -1));
        }
        if (!z10) {
            user2 = eoVar2.f;
            if (!user2.bot) {
                z13 = true;
                TLRPC.User user322 = eoVar2.f;
                if (user322 == null) {
                }
                org.telegram.ui.Components.w70 G22 = org.telegram.ui.Components.w70.G(pe1Var2.c, eoVar2.getResourceProvider(), null, !z10 || z12);
                if (z12) {
                }
                messageObject4 = messageObject3;
                i11 = 0;
                while (i11 < size) {
                }
                G22.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                G22.R(aVar2, dh.c.k(f6Var), false);
                G22.Y();
                ViewGroup viewGroup3222 = G22.A;
                pe1Var.S = viewGroup3222;
                viewGroup3222.setPivotX(0.0f);
                pe1Var.S.setPivotY(0.0f);
                ViewGroup viewGroup4222 = pe1Var.S;
                FrameLayout.LayoutParams e722 = w7.a6.e(-2, -2, 51);
                me1 me1Var6222 = pe1Var.d;
                me1Var6222.addView(viewGroup4222, e722);
                viewGroup = pe1Var.S;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z14) {
                }
                pe1Var.e();
                pe1Var.c0 = new an(this, 5);
                pe1Var.show();
                return true;
            }
        }
        z13 = false;
        TLRPC.User user3222 = eoVar2.f;
        if (user3222 == null) {
        }
        org.telegram.ui.Components.w70 G222 = org.telegram.ui.Components.w70.G(pe1Var2.c, eoVar2.getResourceProvider(), null, !z10 || z12);
        if (z12) {
        }
        messageObject4 = messageObject3;
        i11 = 0;
        while (i11 < size) {
        }
        G222.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
        G222.R(aVar2, dh.c.k(f6Var), false);
        G222.Y();
        ViewGroup viewGroup32222 = G222.A;
        pe1Var.S = viewGroup32222;
        viewGroup32222.setPivotX(0.0f);
        pe1Var.S.setPivotY(0.0f);
        ViewGroup viewGroup42222 = pe1Var.S;
        FrameLayout.LayoutParams e7222 = w7.a6.e(-2, -2, 51);
        me1 me1Var62222 = pe1Var.d;
        me1Var62222.addView(viewGroup42222, e7222);
        viewGroup = pe1Var.S;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
        }
        if (z14) {
        }
        pe1Var.e();
        pe1Var.c0 = new an(this, 5);
        pe1Var.show();
        return true;
    }

    public final void b(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        eo eoVar = this.a;
        ok okVar = eoVar.Y;
        if (okVar != null) {
            CharSequence fieldText = okVar.getFieldText();
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
                eoVar.Y.setFieldText(spannableStringBuilder);
                AndroidUtilities.runOnUIThread(new an(this, 6), 200L);
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
    @Override // org.telegram.ui.Cells.k1
    public final boolean b0(org.telegram.ui.Cells.t1 t1Var, final TLRPC.User user) {
        int i10;
        x4 b10;
        int i11;
        tk tkVar;
        sk skVar;
        if (!l()) {
            return false;
        }
        eo eoVar = this.a;
        ?? r22 = (eoVar.e == null || ((tkVar = eoVar.O0) != null && tkVar.getVisibility() == 0) || ((skVar = eoVar.R) != null && skVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat = eoVar.e;
        ?? r42 = (chat == null || !(eoVar.d4 == 0 || eoVar.h4) || (ChatObject.isChannel(chat) && !eoVar.e.megagroup)) ? 0 : 1;
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
        TLRPC.UserFull userFull = eoVar.getMessagesController().getUserFull(user.id);
        if (userFull != null) {
            b10 = x4.c(user, userFull, d5VarArr);
            if (!com.google.firebase.messaging.m.e(b10)) {
                i11 = ((org.telegram.ui.ActionBar.p2) eoVar).classGuid;
                b10 = x4.b(user, i11, d5VarArr);
            }
        } else {
            i10 = ((org.telegram.ui.ActionBar.p2) eoVar).classGuid;
            b10 = x4.b(user, i10, d5VarArr);
        }
        if (com.google.firebase.messaging.m.e(b10)) {
            com.google.firebase.messaging.m.k().v((ViewGroup) eoVar.fragmentView, eoVar.ea, b10, new a7(this, t1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(eoVar, t1Var);
        final int i12 = 0;
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(this) { // from class: org.telegram.ui.cn
            public final /* synthetic */ pn b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.x(user, false);
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
        H.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new s1(this, t1Var, user, 25), false);
        final int i13 = 1;
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new Runnable(this) { // from class: org.telegram.ui.cn
            public final /* synthetic */ pn b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.b.x(user, false);
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
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new Runnable(this) { // from class: org.telegram.ui.cn
            public final /* synthetic */ pn b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        this.b.x(user, false);
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

    public final void c(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        eo eoVar = this.a;
        ok okVar = eoVar.Y;
        if (okVar != null) {
            CharSequence fieldText = okVar.getFieldText();
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
                SpannableString spannableString = new SpannableString(org.telegram.ui.Cells.r6.t(UserObject.getFirstName(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.c61("" + user.id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            eoVar.Y.setFieldText(spannableStringBuilder);
            AndroidUtilities.runOnUIThread(new an(this, 7), 200L);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void c0(int i10) {
        int i11;
        SpannableStringBuilder replaceTags;
        int i12;
        int i13 = 3;
        int i14 = 2;
        int i15 = 1;
        eo eoVar = this.a;
        try {
            if (i10 == 0) {
                eoVar.h7();
                ll llVar = eoVar.z3;
                if (llVar == null) {
                    return;
                }
                llVar.l(0L, 84, null, new an(this, i15));
                eoVar.z3.performHapticFeedback(3, 2);
                return;
            }
            if (i10 == 1) {
                String formatDateTime = LocaleController.formatDateTime(eoVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                if (eoVar.getMessagesController().transcribeAudioTrialCooldownUntil > 0) {
                    i12 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeftUntil", org.telegram.ui.Components.r31.h(i12), formatDateTime));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeft", org.telegram.ui.Components.r31.h(i11), new Object[0]));
                }
                org.telegram.ui.Components.wc.a0(eoVar).G(R.raw.transcribe, 6, replaceTags).k(true);
                eoVar.fragmentView.performHapticFeedback(3, 2);
                return;
            }
            if (i10 == 2 || i10 == 3) {
                String formatDateTime2 = LocaleController.formatDateTime(eoVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                org.telegram.ui.Components.wc a02 = org.telegram.ui.Components.wc.a0(eoVar);
                int i16 = R.raw.transcribe;
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialEnd", eoVar.getMessagesController().transcribeAudioTrialWeeklyNumber, new Object[0]))).append((CharSequence) " ").append(i10 == 2 ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TranscriptionTrialEndBuy), new an(this, i14)) : eoVar.getMessagesController().transcribeAudioTrialCooldownUntil <= 0 ? "" : AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TranscriptionTrialEndWaitOrBuy, formatDateTime2), new an(this, i13)));
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

    @Override // org.telegram.ui.Cells.k1
    public final boolean c1(int i10, org.telegram.ui.Cells.t1 t1Var) {
        eo eoVar = this.a;
        return eoVar.wb != 0 && t1Var.getMessageObject() != null && eoVar.wb == t1Var.getMessageObject().getId() && eoVar.xb == i10;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void c2(org.telegram.ui.Cells.t1 t1Var) {
        TLRPC.Chat chat;
        TLRPC.User currentUser = t1Var.getCurrentUser();
        eo eoVar = this.a;
        if (!AndroidUtilities.isContextSafe(eoVar.getParentActivity()) || (chat = eoVar.e) == null || currentUser == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return;
        }
        d(t1Var, eoVar.getMessagesController().getParticipant(eoVar.e.id, currentUser.id));
    }

    public final void d(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var;
        TLRPC.User currentUser = t1Var.getCurrentUser();
        eo eoVar = this.a;
        eoVar.getUserConfig().getCurrentUser();
        if (!AndroidUtilities.isContextSafe(eoVar.getParentActivity()) || (chat = eoVar.e) == null || currentUser == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
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
                z10 = channelParticipant.promoted_by == eoVar.getUserConfig().getClientUserId();
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
                    z11 = channelParticipant2.promoted_by == eoVar.getUserConfig().getClientUserId();
                } else {
                    z11 = false;
                    z13 = false;
                }
                str2 = channelParticipant2.rank;
                z12 = z11;
                boolean z15 = z13;
                boolean z16 = z14;
                Activity parentActivity = eoVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                long j3 = -eoVar.e.id;
                f6Var = ((org.telegram.ui.ActionBar.p2) eoVar).resourceProvider;
                org.telegram.ui.Components.n01.b(parentActivity, i10, j3, currentUser, str2, z15, z16, z12, f6Var);
            }
            if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                if (ChatObject.isChannel(eoVar.e)) {
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                    eoVar.getMessagesController();
                    tL_channels_getParticipant.channel = MessagesController.getInputChannel(eoVar.e);
                    tL_channels_getParticipant.participant = eoVar.getMessagesController().getInputPeer(currentUser.id);
                    eoVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new org.telegram.messenger.a(), new bi.k6(5, this, t1Var));
                    return;
                }
                return;
            }
            if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                z10 = false;
                z14 = true;
            } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                z10 = ((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == eoVar.getUserConfig().getClientUserId();
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
        Activity parentActivity2 = eoVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
        long j32 = -eoVar.e.id;
        f6Var = ((org.telegram.ui.ActionBar.p2) eoVar).resourceProvider;
        org.telegram.ui.Components.n01.b(parentActivity2, i10, j32, currentUser, str2, z152, z162, z12, f6Var);
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean d0() {
        return this.a.R3 == 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean e() {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        boolean z10;
        eo eoVar = this.a;
        lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
        if (lVar == null) {
            return false;
        }
        lVar2 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
        if (lVar2.s() || eoVar.A9()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.p2) eoVar).inPreviewMode;
        return !z10;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void e2(org.telegram.ui.Cells.t1 t1Var, long j3) {
        Bundle e = w.f.e(j3, "user_id");
        org.telegram.ui.ActionBar.p2 p2Var = this.a;
        if (p2Var.getMessagesController().checkCanOpenChat(e, p2Var, t1Var.getMessageObject())) {
            p2Var.presentFragment(new eo(e));
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean f() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void f0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
        this.a.I7(t1Var, true, false, f7, f10, false, false, false);
    }

    @Override // org.telegram.ui.Cells.k1
    public final String g(org.telegram.ui.Cells.t1 t1Var) {
        eo eoVar;
        int i10;
        if (t1Var.getMessageObject() == null || (i10 = (eoVar = this.a).wb) == 0 || i10 != t1Var.getMessageObject().getId() || eoVar.xb != 3) {
            return null;
        }
        return eoVar.zb;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean g1(MessageObject messageObject) {
        pm pmVar;
        long dialogId = messageObject.getDialogId();
        eo eoVar = this.a;
        return (dialogId == UserObject.REPLY_BOT || ((pmVar = eoVar.A0) != null && pmVar.N)) && eoVar.R3 != 7;
    }

    public final void h() {
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        boolean isHuaweiStoreApp = BuildVars.isHuaweiStoreApp();
        eo eoVar = this.a;
        if (isHuaweiStoreApp) {
            nf.f.s(eoVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            nf.f.s(eoVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final int h0(org.telegram.ui.Cells.t1 t1Var) {
        ph.c cVar;
        eo eoVar = this.a;
        if (!eoVar.wc.f || (cVar = eoVar.Cc) == null || cVar.n != t1Var || cVar.a.getWidth() <= 0) {
            return 0;
        }
        return eoVar.Cc.a.getHeight();
    }

    @Override // org.telegram.ui.Cells.k1
    public final void i(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        int a2 = ph.i.a(messageObject);
        boolean a10 = w7.c0.a(a2, 7);
        eo eoVar = this.a;
        if (a10) {
            org.telegram.ui.Components.wc.a0(eoVar).Q(R.raw.e_hand_2, 36, ph.i.b(messageObject, a2)).j();
            return;
        }
        if (i10 < 0 && !arrayList.isEmpty()) {
            eoVar.getSendMessagesHelper().sendVote(messageObject, arrayList, null);
            t1Var.S0(true);
            return;
        }
        if (eoVar.getParentActivity() == null) {
            return;
        }
        if (eoVar.n2 == null) {
            org.telegram.ui.Components.s40 s40Var = new org.telegram.ui.Components.s40(5, eoVar.getParentActivity(), eoVar.ea, false);
            eoVar.n2 = s40Var;
            s40Var.setAlpha(0.0f);
            eoVar.n2.setVisibility(4);
            int indexOfChild = eoVar.X0.indexOfChild(eoVar.S);
            if (indexOfChild == -1) {
                return;
            } else {
                eoVar.X0.addView(eoVar.n2, indexOfChild + 1, w7.a6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            }
        }
        if (!arrayList.isEmpty() || i10 >= 0) {
            i13 = i12;
            i14 = i11;
        } else {
            ArrayList<org.telegram.ui.Cells.r1> pollButtons = t1Var.getPollButtons();
            int size = pollButtons.size();
            int i16 = 0;
            float f7 = 0.0f;
            while (true) {
                if (i16 >= size) {
                    i13 = i12;
                    i15 = i11;
                    break;
                }
                org.telegram.ui.Cells.r1 r1Var = pollButtons.get(i16);
                float y3 = ((t1Var.getY() + r1Var.b) - AndroidUtilities.dp(4.0f)) - eoVar.s9;
                eoVar.q2 = AndroidUtilities.dp(13.3f) + r1Var.a;
                int D = org.telegram.messenger.em.D(6.0f, r1Var.b, i12);
                eoVar.r2 = D;
                if (y3 > 0.0f) {
                    i15 = eoVar.q2;
                    i13 = D;
                    f7 = 0.0f;
                    break;
                }
                i16++;
                f7 = y3;
            }
            if (f7 != 0.0f) {
                eoVar.x0.v0(0, (int) f7, null);
                eoVar.p2 = t1Var;
                return;
            }
            i14 = i15;
        }
        eoVar.n2.e(t1Var, Integer.valueOf(i10), i14, i13, true);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void i0(org.telegram.ui.Cells.t1 t1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        eo eoVar = this.a;
        if (eoVar.getParentActivity() == null) {
            return;
        }
        if (eoVar.X9 == null) {
            th.j jVar = new th.j(eoVar.getParentActivity());
            eoVar.X9 = jVar;
            eoVar.X0.addView(jVar, w7.a6.e(-1, -1, 48));
        }
        th.j jVar2 = eoVar.X9;
        HashMap hashMap = jVar2.a;
        ArrayList arrayList = jVar2.c;
        arrayList.clear();
        int i10 = jVar2.d;
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
        String b10 = th.j.b(t1Var);
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
        th.i iVar = new th.i(jVar2, t1Var, arrayList4, new org.telegram.ui.web.x1(29, jVar2, b10));
        iVar.setBounds(0, 0, jVar2.getMeasuredWidth(), jVar2.getMeasuredHeight());
        iVar.setCallback(jVar2);
        if (hashMap.containsKey(b10)) {
            return;
        }
        hashMap.put(b10, iVar);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void j() {
        h();
    }

    @Override // org.telegram.ui.Cells.k1
    public final void j1() {
        eo eoVar = this.a;
        eoVar.Q7();
        UndoView undoView = eoVar.y3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, eoVar.T5, null);
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean j2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        MessageObject messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (t1Var == null || pageBlock == null) {
            return false;
        }
        eo eoVar = this.a;
        if (eoVar.getParentActivity() == null || (messageObject = t1Var.getMessageObject()) == null || (message = messageObject.messageOwner) == null || messageObject.richLayout == null || (richMessage = message.rich_message) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        messageObject.richLayout.collectMediaBlocks(arrayList);
        int indexOf = arrayList.indexOf(pageBlock);
        if (indexOf < 0) {
            return false;
        }
        PhotoViewer t12 = PhotoViewer.t1();
        t12.K2(null, eoVar, null);
        return t12.e2(null, null, null, null, null, null, null, indexOf, new ym(eoVar, arrayList), null, 0L, 0L, 0L, true, new xm(richMessage, arrayList, messageObject), null);
    }

    public final void k(org.telegram.ui.Cells.t1 t1Var, boolean z10, boolean z11, boolean z12) {
        MessageObject primaryMessageObject;
        int i10;
        int i11;
        zj zjVar;
        if (t1Var == null || (primaryMessageObject = t1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.forceUpdate = true;
        eo eoVar = this.a;
        wj wjVar = eoVar.x0;
        if (wjVar != null && (zjVar = eoVar.z0) != null && zjVar.y < 0) {
            for (int childCount = wjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = eoVar.x0.getChildAt(childCount);
                eoVar.x0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.t1)) {
                        if (childAt instanceof org.telegram.ui.Cells.w0) {
                            i11 = eoVar.L8(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = eoVar.L8(childAt);
                            break;
                        }
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        if (z10 && i10 >= 0 && t1Var.getCurrentMessagesGroup() == null) {
            if (z12) {
                zj zjVar2 = eoVar.z0;
                eoVar.x0.getClass();
                zjVar2.i1(RecyclerView.R(t1Var), t1Var.getTop() - ((int) eoVar.s9), false);
            } else {
                eoVar.z0.h1(i10, i11);
            }
        }
        eoVar.N0 = z11;
        eoVar.rc(primaryMessageObject, false);
        eoVar.N0 = false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void k2(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject primaryMessageObject = t1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.a.rc(primaryMessageObject, false);
    }

    public final boolean l() {
        eo eoVar = this.a;
        if (UserObject.isUserSelf(eoVar.f)) {
            return true;
        }
        TLRPC.Chat chat = eoVar.e;
        if (chat != null) {
            return !ChatObject.isChannel(chat) || eoVar.e.megagroup;
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean l0() {
        boolean z10;
        eo eoVar = this.a;
        if (eoVar.A9()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.p2) eoVar).inPreviewMode;
        return !z10;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void l1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        eo eoVar = this.a;
        if (eoVar.z9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) yf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        if (eoVar.getParentActivity() != null) {
            if (eoVar.O0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || yf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || yf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || yf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || yf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || yf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || yf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || yf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || yf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                ok okVar = eoVar.Y;
                MessageObject messageObject = t1Var.getMessageObject();
                MessageObject messageObject2 = t1Var.getMessageObject();
                bj bjVar = null;
                String str = tL_inlineButtonTypeUrl != null ? tL_inlineButtonTypeUrl.url : null;
                nf.e eVar = eoVar.Ab;
                if (eVar != null) {
                    eVar.a(true);
                    eoVar.Ab = null;
                }
                if (str == null || t1Var.getMessageObject() == null) {
                    eoVar.Ab = null;
                } else {
                    bj bjVar2 = new bj(eoVar, t1Var.getMessageObject().getId(), str, t1Var, 1);
                    eoVar.Ab = bjVar2;
                    bjVar = bjVar2;
                }
                okVar.c0(keyboardButtonProto, messageObject, messageObject2, bjVar);
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void m(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
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
        MessageObject messageObject = t1Var.getMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if (messageMedia == null || messageObject == null || !(media instanceof TLRPC.TL_messageMediaPoll)) {
            return;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media;
        TLRPC.WebPage webPage = messageMedia.webpage;
        if (webPage != null) {
            L1(t1Var, webPage, webPage.url, messageMedia.safe);
            return;
        }
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        eo eoVar = this.a;
        if (geoPoint != null) {
            if (AndroidUtilities.isMapsInstalled(eoVar)) {
                mn mnVar = new mn(3);
                f6Var2 = ((org.telegram.ui.ActionBar.p2) eoVar).resourceProvider;
                mnVar.setResourceProvider(f6Var2);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = eoVar.getMessagesController().getPeer(eoVar.a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                tL_messageMediaGeo.geo = messageMedia.geo;
                String str = messageMedia.address;
                if (str == null) {
                    str = (pollAnswer == null || (tL_textWithEntities = pollAnswer.text) == null) ? "" : tL_textWithEntities.text;
                }
                tL_messageMediaGeo.address = str;
                tL_message.media = tL_messageMediaGeo;
                mnVar.O0 = false;
                mnVar.u0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                eoVar.presentFragment(mnVar);
                return;
            }
            return;
        }
        if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
            tt.q().w(eoVar.getParentActivity());
            tt.q().v(new nn(this, tL_messageMediaPoll, pollAnswer, t1Var));
            tt q6 = tt.q();
            TLRPC.Document document4 = messageMedia.document;
            int i18 = MessageObject.isAnimatedEmoji(document4) ? 2 : 0;
            MessageObject messageObject2 = t1Var.getMessageObject();
            f6Var = ((org.telegram.ui.ActionBar.p2) eoVar).resourceProvider;
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
            TLRPC.TL_message C7 = eo.C7(message);
            C7.media = messageMedia;
            C7.attachPath = ph.f.c(message, i10);
            ArrayList<MessageObject> arrayList = new ArrayList<>();
            i17 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
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
            i15 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
            TLRPC.Document document6 = messageMedia.document;
            ph.a aVar = new ph.a(i15, messageObject, document6, ph.f.c(messageObject.messageOwner, i10));
            if (aVar.g) {
                FileLoader.getInstance(i15).cancelLoadFile(document6);
                aVar.a();
                MessageObject messageObject4 = t1Var.y7;
                if (messageObject4 == null || !messageObject4.isPoll()) {
                    return;
                }
                ph.g gVar = t1Var.c6;
                if (gVar != null) {
                    gVar.e();
                }
                ph.g gVar2 = t1Var.b6;
                if (gVar2 != null) {
                    gVar2.e();
                    return;
                }
                return;
            }
            if (!aVar.f) {
                FileLoader.getInstance(i15).loadFile(document6, messageObject, 2, 0);
                aVar.a();
                MessageObject messageObject5 = t1Var.y7;
                if (messageObject5 == null || !messageObject5.isPoll()) {
                    return;
                }
                ph.g gVar3 = t1Var.c6;
                if (gVar3 != null) {
                    gVar3.e();
                }
                ph.g gVar4 = t1Var.b6;
                if (gVar4 != null) {
                    gVar4.e();
                    return;
                }
                return;
            }
            TLRPC.Message message2 = messageObject.messageOwner;
            TLRPC.TL_message C72 = eo.C7(message2);
            C72.media = messageMedia;
            C72.attachPath = ph.f.c(message2, i10);
            i16 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
            on onVar = new on(i16, C72, false, true);
            if (MessageObject.canPreviewDocument(messageMedia.document)) {
                PhotoViewer.t1().K2(null, eoVar, eoVar.ea);
                PhotoViewer t12 = PhotoViewer.t1();
                int i19 = onVar.type;
                t12.c2(onVar, eoVar, i19 != 0 ? eoVar.T5 : 0L, i19 != 0 ? eoVar.L6 : 0L, i19 != 0 ? eoVar.d() : 0L, eoVar.Fa);
                return;
            }
            try {
                AndroidUtilities.openForView(onVar, eoVar.getParentActivity(), eoVar.ea, false);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                eoVar.z6(onVar);
                return;
            }
        }
        TLRPC.Message message3 = messageObject.messageOwner;
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
        if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || MessageObject.isVideoDocument(document3))) {
            i11 = messageMedia3 == messageMedia ? arrayList3.size() : -1;
            TLRPC.TL_message C73 = eo.C7(message3);
            C73.media = messageMedia3;
            C73.attachPath = ph.f.c(message3, -2);
            i14 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
            arrayList3.add(new fn(i14, C73, false, true));
            arrayList2.add(-2);
        } else {
            i11 = -1;
        }
        if (messageObject.expandedExplanation && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || MessageObject.isVideoDocument(document2))) {
            if (messageMedia2 == messageMedia) {
                i11 = arrayList3.size();
            }
            TLRPC.TL_message C74 = eo.C7(message3);
            C74.media = messageMedia2;
            C74.attachPath = ph.f.c(message3, -3);
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            C74.message = pollResults2.solution;
            C74.entities = pollResults2.solution_entities;
            i13 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
            arrayList3.add(new gn(i13, C74, false, true));
            arrayList2.add(-3);
        }
        yf.d.b(tL_messageMediaPoll.poll, eoVar.getUserConfig().getClientUserId());
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
                TLRPC.TL_message C75 = eo.C7(message3);
                C75.media = messageMedia4;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                C75.message = tL_textWithEntities2.text;
                C75.entities = tL_textWithEntities2.entities;
                C75.attachPath = ph.f.c(message3, pollAnswer2.unshuffled_index);
                i12 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                arrayList3.add(new hn(i12, C75, false, true));
                arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
            }
        }
        if (i11 <= -1 || arrayList3.isEmpty()) {
            return;
        }
        messageObject.pollMediaMapping = arrayList2;
        PhotoViewer.t1().K2(null, eoVar, eoVar.ea);
        PhotoViewer.t1().a2(arrayList3, i11, eoVar.a(), 0L, 0L, eoVar.Ga);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void n(org.telegram.ui.Cells.t1 t1Var) {
        if (t1Var.getMessageObject().isImportedForward()) {
            j1();
            return;
        }
        eo eoVar = this.a;
        if (eoVar.l3 || eoVar.x0 == null || eoVar.getParentActivity() == null || eoVar.fragmentView == null) {
            return;
        }
        if (eoVar.u2 == null) {
            vm vmVar = eoVar.X0;
            int indexOfChild = vmVar.indexOfChild(eoVar.S);
            if (indexOfChild == -1) {
                return;
            }
            org.telegram.ui.Components.s40 s40Var = new org.telegram.ui.Components.s40(1, eoVar.getParentActivity(), eoVar.ea, false);
            eoVar.u2 = s40Var;
            vmVar.addView(s40Var, indexOfChild + 1, w7.a6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            eoVar.u2.setAlpha(0.0f);
            eoVar.u2.setVisibility(4);
        }
        eoVar.u2.e(t1Var, null, 0, 0, true);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void n0(String str) {
        eo eoVar = this.a;
        tk tkVar = eoVar.O0;
        if (tkVar == null || tkVar.getVisibility() != 0) {
            sk skVar = eoVar.R;
            if ((skVar == null || skVar.getVisibility() != 0) && eoVar.Y != null && str != null && str.length() > 0) {
                eoVar.Y.setFieldText("@" + str + " ");
                eoVar.Y.H0();
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void o() {
        this.a.X0.getClass();
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean o0(org.telegram.ui.Components.y5 y5Var) {
        TLRPC.InputStickerSet inputStickerSet;
        int i10;
        eo eoVar = this.a;
        if (eoVar.getMessagesController().premiumFeaturesBlocked() || y5Var == null || y5Var.standard) {
            return false;
        }
        long documentId = y5Var.getDocumentId();
        TLRPC.Document document = y5Var.document;
        if (document == null) {
            i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
            document = org.telegram.ui.Components.p5.f(i10, documentId);
        }
        if (document == null || (inputStickerSet = MessageObject.getInputStickerSet(document)) == null) {
            return false;
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, true);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(inputStickerSet);
        org.telegram.ui.Components.wv wvVar = new org.telegram.ui.Components.wv(eoVar, eoVar.getParentActivity(), eoVar.ea, arrayList);
        org.telegram.ui.Components.mv mvVar = wvVar.f;
        mvVar.getClass();
        ImageReceiver imageReceiver = new ImageReceiver(mvVar);
        mvVar.v = imageReceiver;
        if (mvVar.d) {
            imageReceiver.onAttachedToWindow();
        }
        mvVar.w = true;
        mvVar.x.d(1.0f, true);
        mvVar.v.setImage(ImageLocation.getForDocument(document), "140_140", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "140_140", DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.m6, 0.2f, true), 0L, null, null, 0);
        mvVar.v.setLayerNum(7);
        mvVar.v.setAllowStartLottieAnimation(true);
        mvVar.v.setAllowStartAnimation(true);
        mvVar.v.setAutoRepeat(1);
        mvVar.v.setAllowDecodeSingleFrame(true);
        mvVar.v.setParentView(mvVar);
        wvVar.setCalcMandatoryInsets(eoVar.x9());
        eoVar.showDialog(wvVar);
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void o1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
        if (t1Var == null || document == null) {
            return;
        }
        eo eoVar = this.a;
        if (eoVar.getParentLayout() == null || !Y(t1Var)) {
            return;
        }
        org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(eoVar, t1Var);
        H.c(R.drawable.msg_download, LocaleController.getString(R.string.SaveToDownloads), new s1(this, t1Var, document, 24), false);
        H.t = false;
        H.Z();
    }

    @Override // org.telegram.ui.Cells.k1
    public final void o2() {
        this.a.r9();
    }

    public final void p(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, boolean z10) {
        eo eoVar = this.a;
        TLRPC.Chat chat2 = eoVar.e;
        if (chat2 != null && chat.id == chat2.id) {
            rj rjVar = eoVar.a1;
            if (rjVar != null && i10 == 0) {
                rjVar.e(false, false);
                return;
            } else {
                if (t1Var.getMessageObject() != null) {
                    eoVar.E(i10, t1Var.getMessageObject().getId(), 0, 0, true, false);
                    return;
                }
                return;
            }
        }
        if (chat2 == null || chat.id != chat2.id || eoVar.F9()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            cj cjVar = null;
            if (z10) {
                nf.e eVar = eoVar.Ab;
                if (eVar != null) {
                    eVar.a(true);
                    eoVar.Ab = null;
                }
                if (t1Var.getMessageObject() == null) {
                    eoVar.Ab = null;
                } else {
                    cj cjVar2 = new cj(eoVar, t1Var.getMessageObject().getId(), t1Var, 0);
                    eoVar.Ab = cjVar2;
                    cjVar = cjVar2;
                }
            }
            if (eoVar.getMessagesController().checkCanOpenChat(bundle, eoVar, t1Var.getMessageObject(), cjVar)) {
                eo eoVar2 = new eo(bundle);
                if (cjVar == null || i10 == 0) {
                    eoVar.presentFragment(eoVar2);
                } else {
                    AndroidUtilities.runOnUIThread(new di.o3(this, cjVar, chat, i10, eoVar2, 16), 5000L);
                    cjVar.d();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0118, code lost:
    
        if (r1.noforwards == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0124, code lost:
    
        if (org.telegram.messenger.ChatObject.isPublic(r1) != false) goto L90;
     */
    @Override // org.telegram.ui.Cells.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(org.telegram.ui.Cells.t1 t1Var) {
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
        eo eoVar = this.a;
        if (eoVar.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.k31 k31Var = eoVar.R1;
        if (k31Var != null && eoVar.d4 == 0 && (t1Var.T7 || t1Var.U7)) {
            k31Var.m(t1Var.getMessageObject().getTopicId(), true);
            return;
        }
        if (eoVar.getMessagesController().isFrozen()) {
            i13 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
            b.b(i13);
            return;
        }
        ok okVar = eoVar.Y;
        if (okVar != null) {
            okVar.P();
        }
        MessageObject messageObject = t1Var.getMessageObject();
        int i14 = eoVar.R3;
        if (i14 == 2) {
            eoVar.V8.S0(messageObject.getId());
            eoVar.finishFragment();
            return;
        }
        if (i14 == 3 || ((i14 == 7 && eoVar.O3 == 2) || !((!UserObject.isReplyUser(eoVar.f) && !UserObject.isUserSelf(eoVar.f)) || (messageFwdHeader = messageObject.messageOwner.fwd_from) == null || messageFwdHeader.saved_from_peer == null))) {
            if (UserObject.isReplyUser(eoVar.f) && (messageReplyHeader = (message = messageObject.messageOwner).reply_to) != null && (i10 = messageReplyHeader.reply_to_top_id) != 0) {
                eoVar.aa(messageReplyHeader.reply_to_peer_id.channel_id, null, i10, 0L, -1, message.fwd_from.saved_from_msg_id, messageObject);
                return;
            } else if (eoVar.R3 == 7 && eoVar.O3 == 2) {
                eoVar.fa(messageObject);
                return;
            } else {
                eoVar.ga(messageObject);
                return;
            }
        }
        ArrayList<MessageObject> arrayList = (messageObject.getGroupId() == 0 || (groupedMessages = (MessageObject.GroupedMessages) eoVar.x6.f(messageObject.getGroupId())) == null) ? null : groupedMessages.messages;
        if (arrayList == null) {
            arrayList = org.telegram.messenger.a2.l(messageObject);
        }
        if (eoVar.getMessagesController().storiesEnabled() && !messageObject.isSponsored() && (((message2 = messageObject.messageOwner) == null || !message2.noforwards) && (i12 = messageObject.type) != 17 && i12 != 12)) {
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
                eoVar.showDialog(new jn(this, eoVar.getParentActivity(), eoVar, arrayList, ChatObject.isChannel(eoVar.e), z10, eoVar.ea, z10, messageObject));
                Activity parentActivity = eoVar.getParentActivity();
                i11 = ((org.telegram.ui.ActionBar.p2) eoVar).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
                eoVar.fragmentView.requestLayout();
            }
        }
        z10 = false;
        eoVar.showDialog(new jn(this, eoVar.getParentActivity(), eoVar, arrayList, ChatObject.isChannel(eoVar.e), z10, eoVar.ea, z10, messageObject));
        Activity parentActivity2 = eoVar.getParentActivity();
        i11 = ((org.telegram.ui.ActionBar.p2) eoVar).classGuid;
        AndroidUtilities.setAdjustResizeToNothing(parentActivity2, i11);
        eoVar.fragmentView.requestLayout();
    }

    @Override // org.telegram.ui.Cells.k1
    public final void q0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
        eo eoVar = this.a;
        eoVar.I7(t1Var, false, false, f7, f10, true, false, false);
        eoVar.x0.getClass();
        eo.c2(eoVar, RecyclerView.R(t1Var));
    }

    @Override // org.telegram.ui.Cells.k1
    public final void r() {
        this.a.Yb();
    }

    @Override // org.telegram.ui.Cells.k1
    public final void r2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.a.W7(t1Var, reactionCount, z10, f7, f10);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void s(org.telegram.ui.Cells.t1 t1Var) {
        int i10;
        int i11;
        zj zjVar;
        MessageObject primaryMessageObject = t1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        primaryMessageObject.factCheckExpanded = !primaryMessageObject.factCheckExpanded;
        primaryMessageObject.forceUpdate = true;
        eo eoVar = this.a;
        wj wjVar = eoVar.x0;
        if (wjVar != null && (zjVar = eoVar.z0) != null && zjVar.y < 0) {
            for (int childCount = wjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = eoVar.x0.getChildAt(childCount);
                eoVar.x0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.t1)) {
                        if (childAt instanceof org.telegram.ui.Cells.w0) {
                            i11 = eoVar.L8(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = eoVar.L8(childAt);
                            break;
                        }
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        eoVar.rc(primaryMessageObject, false);
        bi.x4 x4Var = eoVar.A1;
        if (x4Var != null) {
            x4Var.e(true);
        }
        if (i10 < 0 || t1Var.getCurrentMessagesGroup() != null) {
            return;
        }
        eoVar.z0.h1(i10, i11);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void t(org.telegram.ui.Cells.t1 t1Var) {
        long j3;
        int i10;
        MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
        MessageObject messageObject = (currentMessagesGroup == null || currentMessagesGroup.messages.isEmpty()) ? t1Var.getMessageObject() : currentMessagesGroup.messages.get(0);
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
        eo eoVar = this.a;
        eoVar.aa(eoVar.e.id, messageObject, messageObject.getId(), j10, i10, 0, null);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void t1(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
        th.i iVar;
        th.j jVar = this.a.X9;
        if (jVar == null || (iVar = (th.i) jVar.a.get(th.j.b(t1Var))) == null) {
            return;
        }
        th.d[] dVarArr = iVar.w;
        RectF rectF = iVar.r;
        if (iVar.M) {
            float f11 = (f7 - rectF.left) + iVar.U;
            float f12 = (f10 - rectF.top) + iVar.V;
            int i10 = th.h.a;
            int b10 = (((float) (-AndroidUtilities.dp((float) 37))) >= f12 || f12 >= rectF.height()) ? -1 : w7.q.b((int) Math.floor((f11 - (AndroidUtilities.dp(9) - (AndroidUtilities.dp(11) / 2.0f))) / AndroidUtilities.dp(th.h.a + 11)), 0, dVarArr.length - 1);
            if (iVar.R == b10) {
                return;
            }
            iVar.a.performHapticFeedback(3, 1);
            iVar.R = b10;
            int i11 = 0;
            while (i11 < dVarArr.length) {
                th.d dVar = dVarArr[i11];
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
                    dVar.n.setInterpolator(th.g.a);
                    dVar.n.start();
                }
                th.d dVar2 = dVarArr[i11];
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
                    dVar2.k.setInterpolator(th.g.a);
                    dVar2.k.start();
                }
                i11++;
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean t2(int i10) {
        boolean z10;
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.f5 f5Var2;
        if (i10 != 16 && i10 != R.id.acc_action_small_button && i10 != R.id.acc_action_msg_options) {
            return false;
        }
        eo eoVar = this.a;
        z10 = ((org.telegram.ui.ActionBar.p2) eoVar).inPreviewMode;
        if (!z10 || !eoVar.J9) {
            return !e();
        }
        f5Var = ((org.telegram.ui.ActionBar.p2) eoVar).parentLayout;
        if (f5Var != null) {
            f5Var2 = ((org.telegram.ui.ActionBar.p2) eoVar).parentLayout;
            ((ActionBarLayout) f5Var2).r();
        }
        return true;
    }

    public final void u(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            org.telegram.ui.ActionBar.p2 p2Var = this.a;
            if (p2Var.getMessagesController().checkCanOpenChat(bundle, p2Var, t1Var.getMessageObject())) {
                p2Var.presentFragment(new eo(bundle));
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void u0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f7, float f10) {
        org.telegram.ui.ActionBar.l lVar;
        eo eoVar = this.a;
        lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
        boolean z10 = true;
        if (lVar.s() || eoVar.A9()) {
            eo.b2(eoVar, t1Var, true, f7, f10);
            return;
        }
        if (t1Var.getMessageObject() != null && t1Var.getMessageObject().isSponsored()) {
            P0(10, t1Var);
            return;
        }
        if (!ChatObject.isForum(eoVar.e) && !eoVar.F9()) {
            z10 = false;
        }
        x(user, z10);
    }

    @Override // org.telegram.ui.Cells.k1
    public final String v(long j3) {
        TLRPC.Peer peer;
        String adminRank;
        eo eoVar = this.a;
        if (UserObject.isBotForum(eoVar.f)) {
            return null;
        }
        TLRPC.Chat chat = eoVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat) && (adminRank = eoVar.getMessagesController().getAdminRank(eoVar.e.id, j3)) != null) {
            return adminRank;
        }
        TLRPC.TL_forumTopic tL_forumTopic = eoVar.c4;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || !(peer.user_id == j3 || peer.channel_id == j3 || peer.chat_id == j3)) {
            return null;
        }
        return LocaleController.getString(R.string.TopicCreator);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void v2() {
        eo eoVar = this.a;
        if (!eoVar.getUserConfig().isPremium()) {
            org.telegram.ui.Components.wc.a0(eoVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("UnlockSimilarChannelsPremium", eoVar.getMessagesController().recommendedChannelsLimitPremium), new an(this, 4))).j();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", eoVar.T5);
        bundle.putInt("start_from", 10);
        eoVar.presentFragment(new org.telegram.ui.Components.la0(bundle, eoVar.a1.getSharedMediaPreloader()));
    }

    public final void w(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            bundle.putBoolean("expandPhoto", false);
            this.a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:274:0x0afd, code lost:
    
        if (r0.exists() != false) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0bc3, code lost:
    
        if (r4.startsWith("text/x-web-markdown") == false) goto L319;
     */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0c0a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:326:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Cells.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10, boolean z10) {
        int i10;
        MessageObject messageObject;
        int i11;
        int i12;
        MessageObject messageObject2;
        eo eoVar;
        int i13;
        long j3;
        int i14;
        long j10;
        File file;
        TLRPC.Chat chat;
        ev0 E;
        ev0 ev0Var;
        ve veVar;
        float f11;
        char c10;
        MessageObject messageObject3;
        MessageObject messageObject4;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        int i15;
        MessageObject messageObject5 = t1Var.getMessageObject();
        int i16 = messageObject5.type;
        eo eoVar2 = this.a;
        if (i16 == 23) {
            TLRPC.MessageMedia messageMedia2 = messageObject5.messageOwner.media;
            TL_stories.StoryItem storyItem = messageMedia2.storyItem;
            if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                return;
            }
            storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia2.peer);
            storyItem.messageId = messageObject5.getId();
            storyItem.messageType = 2;
            zh.a6.b(storyItem, eoVar2.f);
            eoVar2.getOrCreateStoryViewer().G(eoVar2.getParentActivity(), messageObject5.messageOwner.media.storyItem, zh.s5.a(eoVar2.x0));
            return;
        }
        int i17 = 1;
        if (messageObject5.isVideo()) {
            i15 = ((org.telegram.ui.ActionBar.p2) eoVar2).currentAccount;
            if (DownloadController.getInstance(i15).canDownloadMedia(messageObject5.messageOwner) == 1) {
                messageObject5.putInDownloadsStore = true;
            }
        } else {
            messageObject5.putInDownloadsStore = true;
        }
        if (messageObject5.isSendError()) {
            eoVar2.I7(t1Var, false, false, f7, f10, true, false, false);
            return;
        }
        if (messageObject5.isSending()) {
            return;
        }
        int i18 = 0;
        if (z10 && (message = messageObject5.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && !TextUtils.isEmpty(webPage.url)) {
            String str = messageObject5.messageOwner.media.webpage.url;
            AndroidUtilities.getHostAuthority(str);
            if (eoVar2.ea(str, t1Var, null, messageObject5.getId(), 2)) {
                return;
            }
            nf.e eVar = eoVar2.Ab;
            if (eVar != null) {
                eVar.a(true);
            }
            eoVar2.Ab = t1Var.getMessageObject() != null ? new in(this, t1Var, i18) : null;
            nf.f.r(eoVar2.getParentActivity(), Uri.parse(str), true, false, false, eoVar2.Ab, null, false, true, false);
            return;
        }
        int i19 = 4;
        if (messageObject5.isDice()) {
            bn bnVar = new bn(this, messageObject5, i18);
            if (messageObject5.isStakeableDice()) {
                eoVar2.getMessagesController().loadStakeDiceInfo(new z(this, messageObject5, bnVar, i19));
                return;
            } else {
                bnVar.run();
                return;
            }
        }
        if ((messageObject5.isAnimatedEmoji() && (!messageObject5.isAnimatedAnimatedEmoji() || (eoVar2.xa.e.containsKey(iz.q(MessageObject.findAnimatedEmojiEmoticon(messageObject5.getDocument()))) && eoVar2.f != null))) || messageObject5.isPremiumSticker()) {
            eoVar2.Na(t1Var);
            eoVar2.xa.l(t1Var, eoVar2, true);
            eoVar2.x0.I0(false);
            return;
        }
        int i20 = 6;
        if (messageObject5.needDrawBluredPreview()) {
            ve fb2 = eoVar2.fb(messageObject5, false);
            a3.h0 O4 = eo.O4(eoVar2, messageObject5);
            t1Var.invalidate();
            final SecretMediaViewer f12 = SecretMediaViewer.f();
            final Activity parentActivity = eoVar2.getParentActivity();
            int i21 = UserConfig.selectedAccount;
            f12.a = i21;
            ImageReceiver imageReceiver = f12.h;
            imageReceiver.setCurrentAccount(i21);
            if (f12.b != parentActivity) {
                f12.b = parentActivity;
                f12.g1 = new org.telegram.ui.Components.xm0(parentActivity, null);
                k0 k0Var = new k0(f12, parentActivity, 21);
                f12.d = k0Var;
                k0Var.setBackgroundDrawable(f12.l0);
                f12.d.setFocusable(true);
                f12.d.setFocusableInTouchMode(true);
                f12.d.setClipChildren(false);
                f12.d.setClipToPadding(false);
                f12.e = new bi.n7(f12, parentActivity);
                View view = new View(parentActivity);
                f12.f = view;
                view.setBackgroundColor(2130706432);
                f12.e.addView(f12.f, w7.a6.e(-1, -2, 80));
                f12.e.setFocusable(false);
                f12.d.addView(f12.e);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f12.e.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                layoutParams.gravity = 51;
                f12.e.setLayoutParams(layoutParams);
                f12.e.setFitsSystemWindows(true);
                f12.e.setOnApplyWindowInsetsListener(new a51(f12, 0));
                f12.e.setSystemUiVisibility(1792);
                GestureDetector gestureDetector = new GestureDetector(f12.e.getContext(), f12);
                f12.L0 = gestureDetector;
                gestureDetector.setOnDoubleTapListener(f12);
                org.telegram.ui.Components.y7 y7Var = new org.telegram.ui.Components.y7(f12, parentActivity, i20);
                f12.F = y7Var;
                y7Var.setTitleColor(-1);
                f12.F.setSubtitleColor(-1);
                f12.F.setBackgroundColor(2130706432);
                f12.F.setOccupyStatusBar(true);
                f12.F.A(1090519039, false);
                f12.F.C(-1, false);
                f12.F.setBackButtonImage(R.drawable.ic_ab_back);
                f12.F.setTitleRightMargin(AndroidUtilities.dp(70.0f));
                f12.e.addView(f12.F, w7.a6.c(-2.0f, -1));
                f12.F.setActionBarMenuOnItemClick(new u70(f12, 28));
                bi.x4 x4Var = new bi.x4(parentActivity, 1);
                f12.r = x4Var;
                x4Var.l(1.0f, -26.0f);
                f12.r.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                f12.e.addView(f12.r, w7.a6.d(-1, 80.0f, 53, 0.0f, 48.0f, 0.0f, 0.0f));
                g51 g51Var = new g51(f12, parentActivity);
                f12.n = g51Var;
                f12.e.addView(g51Var, w7.a6.d(119, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
                lw0 lw0Var = new lw0(f12, i17);
                f12.U = new h51(f12, parentActivity);
                View view2 = new View(parentActivity);
                f12.T = view2;
                view2.setBackgroundColor(2130706432);
                f12.U.addView(f12.T, w7.a6.e(-1, -1, 119));
                org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(f12.e.getContext());
                f12.S = l5Var;
                l5Var.setTextColor(-1);
                f12.S.setGravity(53);
                f12.S.setTextSize(14);
                f12.S.setImportantForAccessibility(2);
                f12.U.addView(f12.S, w7.a6.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
                t50 t50Var = new t50(f12, parentActivity, 8);
                f12.R = t50Var;
                org.telegram.ui.Components.v71 v71Var = new org.telegram.ui.Components.v71(t50Var);
                f12.Q = v71Var;
                v71Var.z = AndroidUtilities.dp(2.0f);
                org.telegram.ui.Components.v71 v71Var2 = f12.Q;
                v71Var2.k = 872415231;
                v71Var2.l = 872415231;
                v71Var2.m = -1;
                v71Var2.n = -1;
                v71Var2.A = 1509949439;
                v71Var2.j = lw0Var;
                f12.U.addView(f12.R);
                f12.e.addView(f12.U, w7.a6.e(-1, 48, 80));
                vs0 vs0Var = new vs0(null, new zh.b());
                f12.Y = vs0Var;
                vs0Var.k0 = true;
                vs0Var.i0 = false;
                ru0 ru0Var = new ru0(f12.e.getContext());
                f12.Z = ru0Var;
                ru0Var.setFactory(new ViewSwitcher.ViewFactory() { // from class: org.telegram.ui.b51
                    @Override // android.widget.ViewSwitcher.ViewFactory
                    public final View makeView() {
                        SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
                        return new qu0(parentActivity, secretMediaViewer.a0, secretMediaViewer.Y, new b5(secretMediaViewer, 22), new og0(secretMediaViewer, 2));
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
                f12.e.addView(f12.V, w7.a6.e(64, 64, 17));
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
                org.telegram.ui.Cells.ea o9 = f12.Y.o(f12.d.getContext());
                if (o9 != null) {
                    AndroidUtilities.removeFromParent(o9);
                    f12.e.addView(o9);
                }
                f12.Y.T(f12.e);
                f12.Y.j0 = true;
            }
            SecretMediaViewer f13 = SecretMediaViewer.f();
            sl slVar = eoVar2.Fa;
            SecretMediaViewer.PhotoBackgroundDrawable photoBackgroundDrawable = f13.l0;
            ImageReceiver imageReceiver2 = f13.h;
            if (f13.b == null || !messageObject5.needDrawBluredPreview() || slVar == null || (E = slVar.E(messageObject5, null, 0, true, false)) == null) {
                return;
            }
            f13.q1 = messageObject5.messageOwner.ttl == Integer.MAX_VALUE;
            f13.p1 = O4;
            f13.N = slVar;
            f13.K = System.currentTimeMillis();
            f13.L = 0L;
            f13.k0 = true;
            f13.j0 = true;
            f13.p0 = false;
            m4 m4Var = f13.w;
            if (m4Var != null) {
                m4Var.setVisibility(4);
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
                int i22 = 0;
                while (true) {
                    int[] iArr2 = E.h;
                    if (i22 >= iArr2.length) {
                        break;
                    }
                    f13.H0[i22] = iArr2[i22];
                    i22++;
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
            float f16 = (r7[1] - (E.c + rectF.top)) + E.j;
            f13.r0 = f16;
            float f17 = abs;
            f13.r0 = Math.max(0.0f, Math.max(f16, f17));
            float height2 = (((E.c + rectF.top) + ((int) height)) - (E.d.getHeight() + r7[1])) + E.i;
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
            kb0 kb0Var = f13.l1;
            if (kb0Var != null) {
                kb0Var.destroy();
                f13.l1 = null;
            }
            LaunchActivity launchActivity = LaunchActivity.G1;
            f13.l1 = launchActivity != null ? new kb0(launchActivity, true) : null;
            NotificationCenter.getInstance(f13.a).addObserver(f13, NotificationCenter.messagesDeleted);
            NotificationCenter.getInstance(f13.a).addObserver(f13, NotificationCenter.updateMessageMedia);
            NotificationCenter.getInstance(f13.a).addObserver(f13, NotificationCenter.didCreatedNewDeleteTask);
            f13.v = MessageObject.getPeerId(messageObject5.messageOwner.peer_id);
            f13.h0 = messageObject5;
            TLRPC.Document document = messageObject5.getDocument();
            ImageReceiver.BitmapHolder bitmapHolder = f13.i0;
            if (bitmapHolder != null) {
                bitmapHolder.release();
                f13.i0 = null;
            }
            f13.i0 = E.a.getThumbBitmapSafe();
            f13.U.setVisibility(8);
            if (document != null) {
                int i23 = 0;
                while (true) {
                    if (i23 >= document.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i23);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) documentAttribute;
                        f13.O = tL_documentAttributeVideo.w;
                        f13.P = tL_documentAttributeVideo.h;
                        break;
                    }
                    i23++;
                }
                if (MessageObject.isGifDocument(document)) {
                    f13.F.setTitle(LocaleController.getString(R.string.DisappearingGif));
                    String str2 = messageObject5.messageOwner.attachPath;
                    ImageLocation forDocument = (str2 == null || !messageObject5.attachPathExists) ? ImageLocation.getForDocument(document) : ImageLocation.getForPath(str2);
                    f11 = 1.0f;
                    ev0Var = E;
                    veVar = fb2;
                    c10 = 6;
                    messageObject4 = messageObject5;
                    imageReceiver2.setImage(forDocument, (String) null, f13.i0 != null ? new BitmapDrawable(f13.i0.bitmap) : null, -1L, (String) null, messageObject4, 1);
                } else {
                    ev0Var = E;
                    veVar = fb2;
                    f11 = 1.0f;
                    c10 = 6;
                    f13.b0 = 1;
                    f13.F.setTitle(LocaleController.getString(R.string.DisappearingVideo));
                    File file2 = new File(messageObject5.messageOwner.attachPath);
                    if (file2.exists()) {
                        f13.h(file2);
                    } else {
                        File pathToMessage = FileLoader.getInstance(f13.a).getPathToMessage(messageObject5.messageOwner);
                        File file3 = new File(pathToMessage.getAbsolutePath() + ".enc");
                        if (file3.exists()) {
                            pathToMessage = file3;
                        }
                        f13.h(pathToMessage);
                    }
                    f13.J = true;
                    f13.U.setVisibility(0);
                    messageObject4 = messageObject5;
                    imageReceiver2.setImage((ImageLocation) null, (String) null, f13.i0 != null ? new BitmapDrawable(f13.i0.bitmap) : null, -1L, (String) null, messageObject4, 2);
                }
                messageObject3 = messageObject4;
            } else {
                ev0Var = E;
                veVar = fb2;
                f11 = 1.0f;
                c10 = 6;
                f13.F.setTitle(LocaleController.getString(R.string.DisappearingPhoto));
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject5.photoThumbs, AndroidUtilities.getPhotoSize());
                imageReceiver2.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject5.photoThumbsObject), (String) null, f13.i0 != null ? new BitmapDrawable(f13.i0.bitmap) : null, -1L, (String) null, messageObject5, 2);
                messageObject3 = messageObject5;
                if (closestPhotoSizeWithSize != null) {
                    f13.O = closestPhotoSizeWithSize.w;
                    f13.P = closestPhotoSizeWithSize.h;
                }
            }
            f13.j(messageObject3, "", false);
            f13.j(messageObject3, messageObject3.caption, true);
            f13.m(true, false);
            f13.k(false, false);
            f13.W.a(true, true);
            if (f13.q1) {
                g51 g51Var2 = f13.n;
                g51Var2.e = true;
                TextPaint textPaint = g51Var2.r;
                textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
                textPaint.setColor(-1);
                StaticLayout staticLayout = new StaticLayout("1", textPaint, 999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                g51Var2.s = staticLayout;
                g51Var2.v = staticLayout.getLineCount() > 0 ? g51Var2.s.getLineWidth(0) : 0.0f;
                g51Var2.w = g51Var2.s.getHeight();
                g51Var2.invalidate();
                f13.n.setOnClickListener(new m41(f13, 3));
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
            org.telegram.ui.Components.y7 y7Var2 = f13.F;
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y7Var2, (Property<org.telegram.ui.Components.y7, Float>) property, 0.0f, 1.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(f13.a0, (Property<au0, Float>) property, 0.0f, 1.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(f13.r, (Property<bi.x4, Float>) property, 0.0f, 1.0f);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.r6.d, 0, 255);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(f13, f13.v1, 0.0f, 1.0f);
            h51 h51Var = f13.U;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(h51Var, h51Var.n, f11);
            h51 h51Var2 = f13.U;
            if (!f13.J) {
                f11 = 0.0f;
            }
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(h51Var2, (Property<h51, Float>) property, f11);
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
            f13.o0 = new pf0(f13, veVar, messageObject3, 26);
            f13.K0.setDuration(250L);
            f13.K0.addListener(new e51(f13, 0));
            f13.n0 = System.currentTimeMillis();
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                f13.e.setLayerType(2, null);
            }
            f13.K0.setInterpolator(new DecelerateInterpolator());
            photoBackgroundDrawable.b = 0;
            photoBackgroundDrawable.a = new ey0(24, f13, ev0Var);
            f13.K0.start();
            return;
        }
        if (MessageObject.isAnimatedEmoji(messageObject5.getDocument()) && MessageObject.getInputStickerSet(messageObject5.getDocument()) != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(MessageObject.getInputStickerSet(messageObject5.getDocument()));
            org.telegram.ui.Components.wv wvVar = new org.telegram.ui.Components.wv(eoVar2, eoVar2.getParentActivity(), eoVar2.ea, arrayList);
            wvVar.setCalcMandatoryInsets(eoVar2.x9());
            eoVar2.showDialog(wvVar);
            return;
        }
        if (messageObject5.getInputStickerSet() != null) {
            org.telegram.ui.Components.hy0 hy0Var = new org.telegram.ui.Components.hy0(eoVar2.getParentActivity(), eoVar2, messageObject5.getInputStickerSet(), null, (eoVar2.O0.getVisibility() == 0 || !((chat = eoVar2.e) == null || ChatObject.canSendStickers(chat))) ? null : eoVar2.Y, eoVar2.ea);
            hy0Var.setCalcMandatoryInsets(eoVar2.x9());
            eoVar2.showDialog(hy0Var);
            return;
        }
        if (messageObject5.isVideo() || (i10 = messageObject5.type) == 1 || ((i10 == 0 && !messageObject5.isWebpageDocument()) || messageObject5.isGif())) {
            if (messageObject5.isSponsored()) {
                if (messageObject5.isGif() || messageObject5.isPhoto()) {
                    eoVar2.J9(messageObject5, true, false);
                    if (messageObject5.sponsoredUrl != null) {
                        nf.e eVar2 = eoVar2.Ab;
                        if (eVar2 != null) {
                            eVar2.a(true);
                        }
                        eoVar2.Ab = t1Var.getMessageObject() == null ? null : new in(this, t1Var, i17);
                        nf.f.r(eoVar2.getParentActivity(), Uri.parse(messageObject5.sponsoredUrl), true, false, false, eoVar2.Ab, null, false, eoVar2.getMessagesController().sponsoredLinksInappAllow, false);
                        return;
                    }
                    return;
                }
                if (messageObject5.isVideo()) {
                    eoVar2.J9(messageObject5, true, false);
                }
            }
            if (messageObject5.getDuration() > 0.0d && messageObject5.getVideoStartsTimestamp() > 0 && !messageObject5.openedInViewer) {
                messageObject5.forceSeekTo = (float) (messageObject5.getVideoStartsTimestamp() / messageObject5.getDuration());
            }
            eoVar2.ha(t1Var, messageObject5);
            return;
        }
        int i24 = messageObject5.type;
        if (i24 == 3) {
            eoVar2.fb(messageObject5, true);
            try {
                String str3 = messageObject5.messageOwner.attachPath;
                File file4 = (str3 == null || str3.length() == 0) ? null : new File(messageObject5.messageOwner.attachPath);
                if (file4 == null || !file4.exists()) {
                    file4 = eoVar2.getFileLoader().getPathToMessage(messageObject5.messageOwner);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setFlags(1);
                    intent.setDataAndType(FileProvider.d(eoVar2.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", file4), "video/mp4");
                } else {
                    intent.setDataAndType(Uri.fromFile(file4), "video/mp4");
                }
                eoVar2.getParentActivity().startActivityForResult(intent, 500);
                return;
            } catch (Exception e7) {
                FileLog.e(e7);
                eoVar2.z6(messageObject5);
                return;
            }
        }
        if (i24 == 4) {
            if (AndroidUtilities.isMapsInstalled(eoVar2)) {
                if (!messageObject5.isLiveLocation()) {
                    id0 id0Var = new id0(eoVar2.h == null ? 3 : 0);
                    id0Var.F0 = eoVar2;
                    id0Var.u0(messageObject5);
                    eoVar2.presentFragment(id0Var);
                    return;
                }
                TLRPC.Chat chat2 = eoVar2.e;
                id0 id0Var2 = new id0((chat2 == null || ChatObject.canSendMessages(chat2) || eoVar2.e.megagroup) ? 2 : 6);
                id0Var2.F0 = eoVar2;
                id0Var2.u0(messageObject5);
                eoVar2.presentFragment(id0Var2);
                return;
            }
            return;
        }
        if (i24 != 9 && i24 != 0) {
            return;
        }
        if (messageObject5.getDocumentName().toLowerCase().endsWith("attheme")) {
            String str4 = messageObject5.messageOwner.attachPath;
            if (str4 != null && str4.length() != 0) {
                file = new File(messageObject5.messageOwner.attachPath);
            }
            file = null;
            if (file == null) {
                File pathToMessage2 = eoVar2.getFileLoader().getPathToMessage(messageObject5.messageOwner);
                if (pathToMessage2.exists()) {
                    file = pathToMessage2;
                }
            }
            org.telegram.ui.ActionBar.i6 u10 = org.telegram.ui.ActionBar.j6.u(file, messageObject5.getDocumentName(), null, true);
            if (u10 != null) {
                eoVar2.presentFragment(new ae1(u10));
                return;
            }
            eoVar2.x4 = -1;
        }
        if (messageObject5.canPreviewDocument()) {
            PhotoViewer.t1().K2(null, eoVar2, eoVar2.ea);
            PhotoViewer t12 = PhotoViewer.t1();
            int i25 = messageObject5.type;
            if (i25 != 0) {
                i13 = i25;
                j3 = eoVar2.T5;
            } else {
                i13 = i25;
                j3 = 0;
            }
            if (i13 != 0) {
                i14 = i13;
                j10 = eoVar2.L6;
            } else {
                i14 = i13;
                j10 = 0;
            }
            messageObject = messageObject5;
            i11 = 3;
            t12.c2(messageObject, eoVar2, j3, j10, i14 != 0 ? eoVar2.d() : 0L, eoVar2.Fa);
            i12 = 1;
        } else {
            messageObject = messageObject5;
            i11 = 3;
            i12 = 0;
        }
        Pattern pattern = org.telegram.ui.Components.aa0.a;
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
            i17 = i12;
            eoVar = eoVar2;
            messageObject2 = messageObject;
            if (i17 == 0) {
                try {
                    AndroidUtilities.openForView(messageObject2, eoVar.getParentActivity(), eoVar.ea, false);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    eoVar.z6(messageObject2);
                    return;
                }
            }
            return;
        }
        if (eoVar2.getParentActivity() != null) {
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(eoVar2.getParentActivity(), i11, eoVar2.ea);
            d2Var.setCanceledOnTouchOutside(false);
            boolean[] zArr = {false};
            d2Var.setOnCancelListener(new hh(0, zArr));
            d2Var.q(150L);
            MessageObject messageObject6 = messageObject;
            da daVar = new da(eoVar2, messageObject6, d2Var, zArr, false, 4);
            messageObject2 = messageObject6;
            eoVar = eoVar2;
            new Thread(daVar).start();
            if (i17 == 0) {
            }
        }
        eoVar = eoVar2;
        messageObject2 = messageObject;
        if (i17 == 0) {
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void w2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
        MessageObject messageObject;
        TLRPC.TL_factCheck factCheck;
        String str;
        eo eoVar = this.a;
        bi.x4 x4Var = eoVar.A1;
        if (x4Var != null) {
            x4Var.e(true);
        }
        if (eoVar.getParentActivity() == null || (messageObject = t1Var.getMessageObject()) == null || (factCheck = messageObject.getFactCheck()) == null || factCheck.country == null) {
            return;
        }
        try {
            str = new Locale("", factCheck.country).getDisplayCountry(LocaleController.getInstance().getCurrentLocale());
        } catch (Exception e) {
            FileLog.e(e);
            str = factCheck.country;
        }
        bi.x4 x4Var2 = new bi.x4(eoVar.getParentActivity(), 3);
        x4Var2.p(true);
        x4Var2.K = Layout.Alignment.ALIGN_NORMAL;
        x4Var2.d = -1L;
        x4Var2.T = true;
        x4Var2.e = true;
        x4Var2.q(12.0f);
        eoVar.A1 = x4Var2;
        x4Var2.l0 = new qh(9, this, x4Var2);
        x4Var2.s(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FactCheckToast, str)));
        eoVar.X0.addView(eoVar.A1, w7.a6.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
        eoVar.X0.post(new i2.z(this, t1Var, i11, i10, 4));
    }

    public final void x(TLRPC.User user, boolean z10) {
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
        eo eoVar = this.a;
        TLRPC.User user2 = eoVar.f;
        if (user2 != null && user2.id == user.id) {
            i11 = 1;
        }
        profileActivity.N4(i11);
        Activity parentActivity = eoVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.p2) eoVar).classGuid;
        AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
        eoVar.presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean x0(MessageObject messageObject) {
        return !this.a.s.containsKey(messageObject);
    }

    @Override // org.telegram.ui.Cells.k1
    public final org.telegram.ui.Cells.t9 x2() {
        return this.a.c9;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void z(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject == null || messageObject.type != 27) {
            return;
        }
        messageObject.toggleChannelRecommendations();
        messageObject.forceUpdate = true;
        t1Var.t2();
        t1Var.requestLayout();
        this.a.A0.R(messageObject, false, false);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void z0(org.telegram.ui.Cells.t1 t1Var) {
        ph.c cVar = this.a.Cc;
        if (cVar == null || cVar.n != t1Var) {
            return;
        }
        cVar.w.getClass();
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean z1() {
        eo eoVar = this.a;
        return eoVar.X0.getMeasuredWidth() > eoVar.X0.getMeasuredHeight();
    }
}
