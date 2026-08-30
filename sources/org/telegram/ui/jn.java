package org.telegram.ui;

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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class jn implements org.telegram.ui.Cells.k1 {
    public final /* synthetic */ xn a;

    public jn(xn xnVar) {
        this.a = xnVar;
    }

    public static void a(jn jnVar, org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
        int i10;
        xn xnVar = jnVar.a;
        if (xnVar.getParentActivity() == null || document == null) {
            return;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23 && ((i11 <= 28 || BuildVars.NO_SCOPED_STORAGE) && xnVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
            xnVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
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
        i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
        arrayList.add(new MessageObject(i10, tL_message, false, true));
        MediaController.saveFilesFromMessages(xnVar.getParentActivity(), xnVar.getAccountInstance(), arrayList, new ta(jnVar, 1));
    }

    @Override // org.telegram.ui.Cells.k1
    public final void A(org.telegram.ui.Cells.t1 t1Var) {
        xn xnVar = this.a;
        if (!xnVar.getMessagesController().showSensitiveContent()) {
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(xnVar.getParentActivity(), 3, null);
            d2Var.q(200L);
            xnVar.getMessagesController().getContentSettings(new a0(this, d2Var, t1Var, 5));
        } else {
            if (t1Var.getMessageObject() != null) {
                t1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
            }
            t1Var.h4();
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean A0(MessageObject messageObject) {
        return !this.a.s.containsKey(messageObject);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void A2() {
        xn xnVar = this.a;
        if (!xnVar.getUserConfig().isPremium()) {
            org.telegram.ui.Components.qc.a0(xnVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("UnlockSimilarChannelsPremium", xnVar.getMessagesController().recommendedChannelsLimitPremium), new um(this, 4))).j();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", xnVar.Q5);
        bundle.putInt("start_from", 10);
        xnVar.presentFragment(new org.telegram.ui.Components.da0(bundle, xnVar.X0.getSharedMediaPreloader()));
    }

    @Override // org.telegram.ui.Cells.k1
    public final void B0(org.telegram.ui.Cells.t1 t1Var) {
        dh.f fVar = this.a.zc;
        if (fVar == null || fVar.n != t1Var) {
            return;
        }
        fVar.w.getClass();
    }

    @Override // org.telegram.ui.Cells.k1
    public final void B2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
        MessageObject messageObject;
        TLRPC.TL_factCheck factCheck;
        String str;
        xn xnVar = this.a;
        ph.f3 f3Var = xnVar.x1;
        if (f3Var != null) {
            f3Var.e(true);
        }
        if (xnVar.getParentActivity() == null || (messageObject = t1Var.getMessageObject()) == null || (factCheck = messageObject.getFactCheck()) == null || factCheck.country == null) {
            return;
        }
        try {
            str = new Locale("", factCheck.country).getDisplayCountry(LocaleController.getInstance().getCurrentLocale());
        } catch (Exception e) {
            FileLog.e(e);
            str = factCheck.country;
        }
        ph.f3 f3Var2 = new ph.f3(xnVar.getParentActivity(), 3);
        f3Var2.q(true);
        f3Var2.H = Layout.Alignment.ALIGN_NORMAL;
        f3Var2.d = -1L;
        f3Var2.Q = true;
        f3Var2.e = true;
        f3Var2.r(12.0f);
        xnVar.x1 = f3Var2;
        f3Var2.i0 = new yb(24, this, f3Var2);
        f3Var2.t(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FactCheckToast, str)));
        xnVar.U0.addView(xnVar.x1, k7.b6.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
        xnVar.U0.post(new j3.b0(this, t1Var, i11, i10, 4));
    }

    @Override // org.telegram.ui.Cells.k1
    public final void C0() {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        org.telegram.ui.Components.y5 animation;
        xn xnVar = this.a;
        if (xnVar.i3 || SharedConfig.noSoundHintShowed || xnVar.u0 == null || xnVar.getParentActivity() == null || xnVar.fragmentView == null) {
            return;
        }
        org.telegram.ui.Components.k40 k40Var = xnVar.q2;
        if (k40Var == null || k40Var.getTag() == null) {
            if (xnVar.q2 == null) {
                pm pmVar = xnVar.U0;
                int indexOfChild = pmVar.indexOfChild(xnVar.P);
                if (indexOfChild == -1) {
                    return;
                }
                org.telegram.ui.Components.k40 k40Var2 = new org.telegram.ui.Components.k40(0, xnVar.getParentActivity(), xnVar.ba, false);
                xnVar.q2 = k40Var2;
                k40Var2.setShowingDuration(10000L);
                pmVar.addView(xnVar.q2, indexOfChild + 1, k7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                xnVar.q2.setAlpha(0.0f);
                xnVar.q2.setVisibility(4);
            }
            int childCount = xnVar.u0.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = xnVar.u0.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject.isVideo() && (animation = t1Var.getPhotoImage().getAnimation()) != null && animation.o() >= 3000 && xnVar.q2.e(t1Var, null, 0, 0, true)) {
                    SharedConfig.setNoSoundHintShowed(true);
                    return;
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final org.telegram.ui.Cells.n9 C2() {
        return this.a.Z8;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean D1() {
        xn xnVar = this.a;
        return xnVar.U0.getMeasuredWidth() > xnVar.U0.getMeasuredHeight();
    }

    @Override // org.telegram.ui.Cells.k1
    public final void E(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        TLRPC.Message message;
        int i10;
        int i11;
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        int i12 = buttonCustom.id;
        xn xnVar = this.a;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    xnVar.I7(t1Var, true, false, t1Var.getLastTouchX(), t1Var.getLastTouchY(), true, false, true);
                    return;
                } else {
                    if (i12 == 4) {
                        xnVar.O1.m(messageObject.getTopicId(), true);
                        return;
                    }
                    return;
                }
            }
            if (message.suggested_post != null) {
                i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, xnVar.e);
                if (canManageMonoForum) {
                    i11 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                    ChatObject.canUserDoChannelDirectAdminAction(i11, xnVar.e, 5);
                }
                cg.u0 u0Var = new cg.u0(this, message, canManageMonoForum, messageObject, 7);
                TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                xnVar.g7(u0Var, mf.a.l(suggestedPost != null ? suggestedPost.price : null), !canManageMonoForum);
                return;
            }
            return;
        }
        long peerDialogId = DialogObject.getPeerDialogId(message.from_id);
        kh.a1 a1Var = new kh.a1(25, this, message);
        Pattern pattern = org.telegram.ui.Components.z4.a;
        Activity parentActivity = xnVar.getParentActivity();
        int i13 = 0;
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(parentActivity, 0, null);
        String string = LocaleController.getString(R.string.SuggestedMessageDecline);
        org.telegram.ui.ActionBar.d2 d2Var = g2Var.a;
        d2Var.O = string;
        d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageDeclineInfo, MessagesController.getInstance(UserConfig.selectedAccount).getPeerName(peerDialogId)));
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
        editText.setFilters(new InputFilter[]{new org.telegram.ui.Components.o4(parentActivity)});
        editText.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0, AndroidUtilities.dp(8.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f));
        editText.setSelection(editText.getText().toString().length());
        g2Var.n(frameLayout);
        g2Var.k(LocaleController.getString(R.string.Decline), new org.telegram.ui.Components.o1(i13, a1Var, editText));
        g2Var.h(LocaleController.getString(R.string.Cancel), null);
        d2Var.K = new org.telegram.ui.Components.p1(editText, i13);
        frameLayout.addView(editText, k7.b6.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
        editText.requestFocus();
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.fg(editText, 3), 100L);
        xnVar.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void E0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z4) {
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        xn xnVar = this.a;
        if (xnVar.getParentActivity() == null || tLObject == null) {
            return;
        }
        e5Var = ((org.telegram.ui.ActionBar.p2) xnVar).parentLayout;
        if (e5Var != null) {
            e5Var2 = ((org.telegram.ui.ActionBar.p2) xnVar).parentLayout;
            if (((ActionBarLayout) e5Var2).y()) {
                return;
            }
        }
        Bundle bundle = new Bundle();
        boolean z10 = tLObject instanceof TLRPC.Chat;
        if (z10) {
            bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
        } else if (!(tLObject instanceof TLRPC.User)) {
            return;
        } else {
            bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
        }
        if (!z4 || !z10) {
            xnVar.presentFragment(new xn(bundle));
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, xnVar.getParentActivity(), xnVar.getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(xnVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(xnVar.getParentActivity(), false, false);
        g1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
        g1Var.setMinimumWidth(160);
        g1Var.setOnClickListener(new a(this, 14));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(xnVar.getParentActivity(), false, false);
        g1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
        g1Var2.setMinimumWidth(160);
        g1Var2.setOnClickListener(new b0(this, (TLRPC.Chat) tLObject, t1Var, 7));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
        xn xnVar2 = new xn(bundle);
        xnVar2.G9 = true;
        xnVar.presentFragmentAsPreviewWithMenu(xnVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
        xnVar.d7();
    }

    @Override // org.telegram.ui.Cells.k1
    public final void E1(org.telegram.ui.Cells.t1 t1Var) {
        xn.U4(this.a, t1Var);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void F(org.telegram.ui.Cells.t1 t1Var) {
        xn xnVar = this.a;
        xnVar.ua.l(t1Var, xnVar, true);
        xnVar.u0.I0(false);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void F0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
        MessageObject messageObject = t1Var.getMessageObject();
        int i10 = messageObject.type;
        xn xnVar = this.a;
        if (i10 != 16) {
            xnVar.I7(t1Var, true, false, f10, f11, messageObject.isMusic(), false, false);
            return;
        }
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        int i11 = 0;
        if (!(messageAction instanceof TLRPC.TL_messageActionConferenceCall)) {
            TLRPC.User user = xnVar.f;
            if (user != null) {
                boolean isVideoCall = messageObject.isVideoCall();
                TLRPC.UserFull userFull = xnVar.X7;
                org.telegram.ui.Components.voip.f2.n(user, isVideoCall, userFull != null && userFull.video_calls_available, xnVar.getParentActivity(), xnVar.getMessagesController().getUserFull(xnVar.f.id), xnVar.getAccountInstance());
                return;
            }
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(Long.valueOf(xnVar.a()));
        ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
        int size = arrayList.size();
        while (i11 < size) {
            TLRPC.Peer peer = arrayList.get(i11);
            i11++;
            hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(peer)));
        }
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = messageObject.getId();
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(xnVar.getParentActivity(), 3, null);
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = xnVar.getMessagesController().conferenceCallSizeLimit;
        d2Var.setOnCancelListener(new lh.w(this, xnVar.getConnectionsManager().sendRequest(getgroupcall, new gg.e0(this, d2Var, hashSet, tL_inputGroupCallInviteMessage, messageObject, 6)), 2));
        d2Var.q(600L);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void G1(org.telegram.ui.Cells.t1 t1Var, boolean z4) {
        k(t1Var, z4, false, false);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void H0(org.telegram.ui.Cells.t1 t1Var) {
        k(t1Var, true, false, true);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        StaticLayout staticLayout = textLayoutBlock.textLayout;
        if (staticLayout == null || staticLayout.getText() == null) {
            return;
        }
        String charSequence = textLayoutBlock.textLayout.getText().toString();
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new CodeHighlighting.Span(false, 0, null, textLayoutBlock.language, charSequence), 0, spannableString.length(), 33);
        AndroidUtilities.addToClipboard(spannableString);
        b.m(R.string.CodeCopied, org.telegram.ui.Components.qc.a0(this.a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.k1
    public final boolean I1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        int i10;
        int i11;
        boolean z4;
        int i12;
        boolean z10;
        int i13;
        z4 z4Var;
        ok okVar;
        nk nkVar;
        if (!l()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(ChatObject.getPublicUsername(chat));
        xn xnVar = this.a;
        int i14 = (isEmpty || xnVar.e == null || ((okVar = xnVar.L0) != null && okVar.getVisibility() == 0) || ((nkVar = xnVar.O) != null && nkVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat2 = xnVar.e;
        int i15 = (chat2 == null || !(xnVar.a4 == 0 || xnVar.e4) || (ChatObject.isChannel(chat2) && !xnVar.e.megagroup)) ? 0 : 1;
        TLRPC.Chat chat3 = xnVar.e;
        int i16 = (chat3 == null || chat3.id != chat.id || xnVar.F9()) ? 1 : 0;
        f5[] f5VarArr = new f5[i16 + 1 + i14 + i15];
        f5VarArr[0] = f5.d;
        if (i16 != 0) {
            f5VarArr[1] = chat.broadcast ? f5.e : f5.f;
            i10 = 2;
        } else {
            i10 = 1;
        }
        if (i14 != 0) {
            f5VarArr[i10] = f5.n;
            i10++;
        }
        if (i15 != 0) {
            f5VarArr[i10] = f5.r;
        }
        TLRPC.ChatFull chatFull = xnVar.getMessagesController().getChatFull(chat.id);
        if (chatFull != null) {
            z4Var = z4.a(chat, chatFull, f5VarArr);
            z10 = i14;
            i13 = i15;
            i12 = i16;
            z4 = true;
        } else {
            i11 = ((org.telegram.ui.ActionBar.p2) xnVar).classGuid;
            int i17 = i15;
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(chat, 0);
            int i18 = i16;
            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(chat, 1);
            String str = (forUserOrChat2 == null || !(forUserOrChat2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            z4 = true;
            i12 = i18;
            z10 = i14;
            i13 = i17;
            z4Var = new z4(forUserOrChat, forUserOrChat2, null, str, null, null, chatPhoto != null ? chatPhoto.strippedBitmap : null, chat, f5VarArr, new y4(i11, chat, NotificationCenter.chatInfoDidLoad));
        }
        if (cb.m.e(z4Var)) {
            cb.m.l().v((ViewGroup) xnVar.fragmentView, xnVar.ba, z4Var, new d7(this, chat, t1Var, 7));
            return z4;
        }
        org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(xnVar, t1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new xm(this, chat, 0), false);
        boolean z11 = chat.broadcast;
        H.l(z11 ? R.drawable.msg_channel : R.drawable.msg_discussion, LocaleController.getString(z11 ? R.string.OpenChannel2 : R.string.OpenGroup2), new s1(this, t1Var, chat, 26), i12);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new xm(this, chat, 1), z10);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new xm(this, chat, 2), i13);
        H.t = false;
        H.i = 3;
        H.W = true;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void J0(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject;
        if (t1Var == null || (messageObject = t1Var.getMessageObject()) == null || messageObject.messageOwner == null) {
            return;
        }
        int id2 = messageObject.getId();
        xn xnVar = this.a;
        if (xnVar.tb == id2 && xnVar.ub == 7) {
            return;
        }
        TLRPC.InputPeer inputPeer = xnVar.getMessagesController().getInputPeer(messageObject.getDialogId());
        if (inputPeer == null) {
            return;
        }
        TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
        getrichmessage.peer = inputPeer;
        getrichmessage.id = id2;
        af.f fVar = xnVar.xb;
        if (fVar != null) {
            fVar.a(true);
            xnVar.xb = null;
        }
        int[] iArr = new int[1];
        wi wiVar = new wi(xnVar, id2, t1Var, 2);
        wiVar.b = new yb(12, xnVar, iArr);
        xnVar.xb = wiVar;
        wiVar.d();
        iArr[0] = xnVar.getConnectionsManager().sendRequestTyped(getrichmessage, new org.telegram.messenger.a(), new fg(xnVar, wiVar, iArr, t1Var, messageObject));
    }

    @Override // org.telegram.ui.Cells.k1
    public final void J1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        xn xnVar = this.a;
        if (xnVar.z9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) mf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) mf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
        if (xnVar.getParentActivity() != null) {
            if (xnVar.L0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || mf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || mf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || mf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || mf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || mf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || mf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                if (tL_inlineButtonTypeCopy == null) {
                    if (tL_inlineButtonTypeUrl != null) {
                        xnVar.Z9(null, tL_inlineButtonTypeUrl.url, true, t1Var, t1Var.getMessageObject());
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
                org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(xnVar.getParentActivity(), xnVar.ba, false, false);
                g3Var.fixNavigationBar();
                g3Var.title = str;
                g3Var.bigTitle = false;
                g3Var.multipleLinesTitle = true;
                CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Copy)};
                cg.u1 u1Var = new cg.u1(3, xnVar, str);
                g3Var.items = charSequenceArr;
                g3Var.onClickListener = u1Var;
                xnVar.showDialog(g3Var);
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean K1() {
        xn xnVar = this.a;
        return xnVar.U0.getKeyboardHeight() + xnVar.la >= AndroidUtilities.dp(20.0f);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void L(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject.messageOwner.send_state != 0) {
            this.a.getSendMessagesHelper().cancelSendingMessage(messageObject);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void L0(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        messageObject.messageOwner.summarizedOpen = !r1.summarizedOpen;
        messageObject.updateTranslation(true);
        xn xnVar = this.a;
        xnVar.getMessagesStorage().updateMessageCustomParams(messageObject.getDialogId(), messageObject.messageOwner);
        xnVar.getMessagesController().getTranslateController().checkTranslation(messageObject, true);
        k(t1Var, true, false, true);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void M(org.telegram.ui.Cells.t1 t1Var, jh.f fVar) {
        TLRPC.Message message;
        if (t1Var == null) {
            fVar.run();
            return;
        }
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject == null || ((messageObject.isSending() && !messageObject.isEditing()) || (message = messageObject.messageOwner) == null || message.rich_message == null)) {
            fVar.run();
        } else {
            org.telegram.ui.ActionBar.p2 p2Var = this.a;
            p2Var.getSendMessagesHelper().editRichMessage(messageObject, messageObject.messageOwner.rich_message, null, p2Var, true);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void M1(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        xn xnVar = this.a;
        xnVar.a5 = messageObject;
        xnVar.d9();
    }

    @Override // org.telegram.ui.Cells.k1
    public final void N(int i10, org.telegram.ui.Cells.t1 t1Var) {
        boolean z4 = t1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveaway;
        xn xnVar = this.a;
        if (z4) {
            long j10 = -((TLRPC.TL_messageMediaGiveaway) t1Var.getMessageObject().messageOwner.media).channels.get(i10).longValue();
            if (xnVar.Q5 != j10) {
                xnVar.presentFragment(xn.R9(j10));
            } else {
                xnVar.X0.e(false, false);
            }
        }
        if (t1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            xnVar.presentFragment(ProfileActivity.m4(((TLRPC.TL_messageMediaGiveawayResults) t1Var.getMessageObject().messageOwner.media).winners.get(i10).longValue()));
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void O(MessageObject messageObject) {
        if (messageObject.isVideo()) {
            this.a.fb(messageObject, true);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean O0(long j10) {
        xn xnVar = this.a;
        TLRPC.Chat chat = xnVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return false;
        }
        return xnVar.getMessagesController().isOwner(xnVar.e.id, j10);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void O1(MessageObject messageObject) {
        this.a.s.put(messageObject, Boolean.TRUE);
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean P(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z4) {
        int i10;
        int i11;
        boolean isForwarded = t1Var.getMessageObject().isForwarded();
        xn xnVar = this.a;
        if (isForwarded) {
            long peerDialogId = DialogObject.getPeerDialogId(t1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(xnVar);
            int i12 = R.raw.passcode_lock_close;
            int i13 = R.string.TodoCompleteForbiddenForward;
            i11 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
            a02.Q(i12, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i13, DialogObject.getName(i11, peerDialogId)))).k(true);
            return false;
        }
        if (t1Var.getMessageObject().canCompleteTodo()) {
            if (xnVar.getUserConfig().isPremium()) {
                xnVar.getSendMessagesHelper().toggleTodo(ChatObject.getSendAsPeerId(xnVar.e, xnVar.W7, true), t1Var.getMessageObject(), todoItem, z4, null);
                return true;
            }
            org.telegram.ui.Components.qc.a0(xnVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.TodoPremiumRequired), new um(this, 9))).k(true);
            return false;
        }
        long peerDialogId2 = DialogObject.getPeerDialogId(t1Var.getMessageObject().getFromPeer());
        org.telegram.ui.Components.qc a03 = org.telegram.ui.Components.qc.a0(xnVar);
        int i14 = R.raw.passcode_lock_close;
        int i15 = R.string.TodoCompleteForbidden;
        i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
        a03.Q(i14, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i15, DialogObject.getName(i10, peerDialogId2)))).k(true);
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void P0(org.telegram.ui.Cells.t1 t1Var) {
        int i10;
        i5.v vVar;
        MessageObject.GroupedMessages groupedMessages;
        int i11;
        xn xnVar = this.a;
        hh.k kVar = xnVar.U9;
        if (kVar == null) {
            return;
        }
        HashMap hashMap = kVar.a;
        hh.j jVar = (hh.j) hashMap.get(hh.k.b(t1Var));
        org.telegram.ui.Components.ic icVar = null;
        MessageObject messageObject = jVar != null ? jVar.B : null;
        hh.j jVar2 = (hh.j) xnVar.U9.a.get(hh.k.b(t1Var));
        long j10 = (jVar2 == null || (i11 = jVar2.O) == -1) ? 0L : jVar2.w[i11].d;
        if (messageObject != null && j10 != 0) {
            Activity parentActivity = xnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
            if (!org.telegram.ui.Components.z4.h(parentActivity, i10, j10, false)) {
                ArrayList<MessageObject> arrayList = (messageObject.getGroupId() == 0 || (groupedMessages = (MessageObject.GroupedMessages) xnVar.u6.f(messageObject.getGroupId())) == null) ? null : groupedMessages.messages;
                if (arrayList == null) {
                    arrayList = org.telegram.messenger.y3.m(messageObject);
                }
                boolean z4 = j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                long j11 = j10;
                i5.v vVar2 = new i5.v(this, arrayList, j11, 16);
                if (z4) {
                    vVar2.run();
                    vVar = null;
                } else {
                    vVar = vVar2;
                }
                icVar = org.telegram.ui.Components.qc.v(xnVar.getParentActivity(), xnVar, null, 1, j11, 1, xnVar.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), xnVar.getThemedColor(org.telegram.ui.ActionBar.j6.Hi), 5000, false, vVar);
                icVar.k = true;
                icVar.k(icVar.e instanceof org.telegram.ui.Components.tb);
            }
        }
        hh.j jVar3 = (hh.j) hashMap.get(hh.k.b(t1Var));
        if (jVar3 != null) {
            if (icVar == null) {
                jVar3.O = -1;
                jVar3.c();
                return;
            }
            org.telegram.ui.Components.nb nbVar = icVar.e;
            if (!(nbVar instanceof org.telegram.ui.Components.qb)) {
                jVar3.c();
                return;
            }
            org.telegram.ui.Components.qb qbVar = (org.telegram.ui.Components.qb) nbVar;
            jVar3.T = qbVar;
            qbVar.a.setVisibility(4);
            ViewTreeObserver viewTreeObserver = jVar3.T.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new hh.f(0, jVar3, viewTreeObserver));
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void P1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        Uri parse;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        boolean z10 = (z4 || !af.g.h(str, false, false)) ? z4 : true;
        xn xnVar = this.a;
        af.f fVar = xnVar.xb;
        if (fVar != null) {
            fVar.a(true);
        }
        xnVar.xb = t1Var.getMessageObject() == null ? null : new fn(this, t1Var);
        if (z10 || af.g.f(parse, false, null)) {
            af.g.r(xnVar.getParentActivity(), parse, true, true, false, xnVar.xb, null, false, true, false);
        } else {
            org.telegram.ui.Components.z4.r0(xnVar, str, true, true, true, !z10, xnVar.xb, webPage, xnVar.ba);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean Q() {
        xn xnVar = this.a;
        return xnVar.T5[1].size() + xnVar.T5[0].size() > 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean R(org.telegram.ui.Cells.t1 t1Var) {
        int i10;
        MessageObject messageObject;
        TLRPC.Message message;
        if (t1Var == null) {
            return false;
        }
        xn xnVar = this.a;
        if (xnVar.getParentActivity() == null) {
            return false;
        }
        i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
        if (!MessagesController.getInstance(i10).richEditorAllowed() || (messageObject = t1Var.getMessageObject()) == null || (message = messageObject.messageOwner) == null || message.rich_message == null) {
            return false;
        }
        if (!messageObject.translated || message.translatedRichMessage == null) {
            return messageObject.canEditMessage(xnVar.e);
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void R0(int i10, org.telegram.ui.Cells.t1 t1Var) {
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
        xn xnVar = this.a;
        if (i10 == 19) {
            af.f fVar = xnVar.xb;
            if (fVar != null) {
                fVar.a(true);
            }
            final cn cnVar = t1Var.getMessageObject() != null ? new cn(this, t1Var, 2) : null;
            xnVar.xb = cnVar;
            final Activity parentActivity = xnVar.getParentActivity();
            final org.telegram.ui.ActionBar.f6 resourceProvider = xnVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            cnVar.d();
            cnVar.b = new gg.k(atomicBoolean, 0);
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
            final String b11 = gg.r.b(messageObject);
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
            final boolean z4 = chat != null && ChatObject.isChannelAndNotMegaGroup(chat);
            final long j10 = messageObject.messageOwner.date * 1000;
            gg.p0.d(messageObject, new Utilities.Callback(atomicBoolean, cnVar, z4, b11, j10, tL_messageMediaGiveaway2, parentActivity, resourceProvider) { // from class: gg.l
                public final /* synthetic */ AtomicBoolean a;
                public final /* synthetic */ af.f b;
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
                    boolean z10 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                    boolean z11 = this.c;
                    String str = this.d;
                    TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = this.e;
                    Context context = this.f;
                    f6 f6Var = this.g;
                    if (z10) {
                        r.d(z11, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, f6Var);
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        r.e(z11, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, f6Var);
                    }
                }
            }, new gg.m(atomicBoolean, cnVar, 0));
            return;
        }
        if (i10 == 21) {
            h();
            return;
        }
        if (i10 == 84) {
            xnVar.ua(t1Var);
            return;
        }
        if (i10 == 80) {
            hh.g gVar = org.telegram.ui.Components.vg0.L;
            if (xnVar.getParentActivity() == null) {
                return;
            }
            xnVar.showDialog(new org.telegram.ui.Components.vg0(xnVar.getContext(), xnVar.getCurrentAccount(), messageObject, xnVar.getResourceProvider()));
            return;
        }
        if (i10 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
            if (messageMedia4 == null || (webPage = messageMedia4.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.D1;
            if (launchActivity == null || launchActivity.P() == null || LaunchActivity.D1.P().k(messageObject) == null) {
                xnVar.createArticleViewer(false).N(messageObject, null, null, null);
                return;
            }
            return;
        }
        int i15 = 5;
        if (i10 == 5) {
            long j11 = messageObject.messageOwner.media.user_id;
            if (j11 != 0) {
                i14 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
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
                xnVar.presentFragment(new ProfileActivity(bundle, null));
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
                xnVar.showDialog(new org.telegram.ui.Components.se0(xnVar, null, user, null, file, se.b.d(str, false), str3, str4, xnVar.ba));
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (i10 == 30) {
            xnVar.presentFragment(new xn(kh.a2.g(messageObject.messageOwner.media.user_id, "user_id")));
            return;
        }
        if (i10 == 31) {
            long j12 = messageObject.messageOwner.media.user_id;
            if (j12 != 0) {
                i13 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(j12));
            }
            if (user2 != null) {
                if (!TextUtils.isEmpty(messageObject.vCardData)) {
                    b10 = messageObject.vCardData.toString();
                } else if (TextUtils.isEmpty(user2.phone)) {
                    String str5 = MessageObject.getMedia(messageObject.messageOwner).phone_number;
                    b10 = !TextUtils.isEmpty(str5) ? se.b.c().b(str5) : LocaleController.getString(R.string.NumberUnknown);
                } else {
                    b10 = org.telegram.messenger.y3.j(new StringBuilder("+"), user2.phone, se.b.c());
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user2.id);
                bundle2.putString("phone", b10);
                bundle2.putBoolean("addContact", true);
                xnVar.presentFragment(new ns(bundle2));
                return;
            }
            return;
        }
        if (i10 == 23 || i10 == 24) {
            boolean z10 = i10 == 24;
            TLRPC.Message message2 = messageObject.messageOwner;
            TLRPC.WebPage webPage2 = (message2 == null || (messageMedia = message2.media) == null) ? null : messageMedia.webpage;
            if (webPage2 == null || webPage2.url == null) {
                return;
            }
            Matcher matcher = Pattern.compile("^https?\\:\\/\\/t\\.me\\/add(?:emoji|stickers)\\/(.+)$").matcher(webPage2.url);
            af.f fVar2 = xnVar.xb;
            if (fVar2 != null) {
                fVar2.a(true);
            }
            int i16 = 3;
            xnVar.xb = t1Var.getMessageObject() != null ? new cn(this, t1Var, i16) : null;
            if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                String group = matcher.group(1);
                i11 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                if (MediaDataController.getInstance(i11).getStickerSetByName(group) == null) {
                    xnVar.xb.d();
                    TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_inputStickerSetShortName.short_name = group;
                    tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                    i12 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                    xnVar.xb.b = new af.b(this, ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickerSet, new org.telegram.messenger.zd(i16, this, z10)), 24);
                    return;
                }
            }
            af.g.r(xnVar.getParentActivity(), Uri.parse(webPage2.url), true, true, false, xnVar.xb, null, false, true, false);
            return;
        }
        if (messageObject.isSponsored()) {
            xnVar.J9(messageObject, false, false);
            if (messageObject.sponsoredUrl != null) {
                af.f fVar3 = xnVar.xb;
                if (fVar3 != null) {
                    fVar3.a(true);
                }
                xnVar.xb = t1Var.getMessageObject() != null ? new cn(this, t1Var, 4) : null;
                af.g.r(xnVar.getParentActivity(), Uri.parse(messageObject.sponsoredUrl), true, false, false, xnVar.xb, null, false, xnVar.getMessagesController().sponsoredLinksInappAllow, false);
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
                    xnVar.getOrCreateStoryViewer().G(xnVar.getParentActivity(), tL_webPageAttributeStory.storyItem, nh.c7.a(xnVar.u0));
                    return;
                }
            }
        }
        if (xnVar.ea(storyMentionWebpage.url, t1Var, null, messageObject.getId(), 2)) {
            return;
        }
        af.f fVar4 = xnVar.xb;
        if (fVar4 != null) {
            fVar4.a(true);
        }
        xnVar.xb = t1Var.getMessageObject() != null ? new cn(this, t1Var, i15) : null;
        af.g.r(xnVar.getParentActivity(), Uri.parse(storyMentionWebpage.url), true, true, false, xnVar.xb, null, false, true, false);
    }

    @Override // org.telegram.ui.Cells.k1
    public final CharacterStyle R1(org.telegram.ui.Cells.t1 t1Var) {
        xn xnVar;
        int i10;
        if (t1Var.getMessageObject() == null || (i10 = (xnVar = this.a).tb) == 0 || i10 != t1Var.getMessageObject().getId() || xnVar.ub != 1) {
            return null;
        }
        return xnVar.vb;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean S() {
        xn xnVar = this.a;
        return UserObject.isReplyUser(xnVar.f) || UserObject.isUserSelf(xnVar.f);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void S1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        try {
            xn xnVar = this.a;
            org.telegram.ui.Components.pu.I(xnVar, messageObject, xnVar.Ca, str2, str3, str4, str, i10, i11, -1, xnVar.x9());
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void T(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
        org.telegram.ui.ActionBar.k kVar;
        MessageObject messageObject;
        if (chat == null) {
            return;
        }
        xn xnVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
        if (kVar.s() || xnVar.A9()) {
            xn.b2(xnVar, t1Var, true, f10, f11);
            return;
        }
        if (z4 || !chat.signature_profiles || (messageObject = t1Var.getMessageObject()) == null || messageObject.getDialogId() == UserObject.REPLY_BOT) {
            p(t1Var, chat, i10, z4);
        } else {
            xnVar.na(DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void T0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        xn xnVar = this.a;
        xnVar.getSendMessagesHelper().sendCallback(true, t1Var.getMessageObject(), keyboardInlineButton, xnVar);
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean T1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        ViewGroup viewGroup;
        int i10;
        n41 n41Var;
        if (messageObject.isVoiceOnce() || messageObject.isRoundOnce()) {
            int i11 = 1;
            p41 p41Var = this.a.W9;
            if (p41Var == null || p41Var.Y) {
                try {
                    AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!messageObject.isOutOwner()) {
                            org.telegram.ui.Components.qc.a0(this.a).w(R.drawable.tooltip_sound, LocaleController.getString(R.string.VoiceOnceTurnOnSound)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.a.W9 = new p41(this.a.getParentActivity());
                p41 p41Var2 = this.a.W9;
                re fb2 = !messageObject.isOutOwner() ? this.a.fb(messageObject, true) : null;
                i5.v O4 = !messageObject.isOutOwner() ? xn.O4(this.a, messageObject) : null;
                Context context = p41Var2.a;
                ah.d dVar = p41Var2.c;
                p41Var2.U = fb2;
                p41Var2.V = O4;
                n41 n41Var2 = p41Var2.K;
                if (n41Var2 != null) {
                    dVar.removeView(n41Var2);
                    p41Var2.K = null;
                }
                p41Var2.L = t1Var;
                MessageObject messageObject2 = t1Var.getMessageObject();
                p41Var2.J = messageObject2;
                p41Var2.P = messageObject2 != null && messageObject2.isRoundVideo();
                org.telegram.ui.Cells.t1 t1Var2 = p41Var2.L;
                p41Var2.I = t1Var2 != null ? t1Var2.getResourcesProvider() : null;
                if (p41Var2.L != null) {
                    p41Var2.Q = 0.0f;
                    p41Var2.R = t1Var.n;
                    if (t1Var.getParent() instanceof View) {
                        View view = (View) t1Var.getParent();
                        p41Var2.Q = view.getY() + p41Var2.Q;
                        p41Var2.R = view.getY() + p41Var2.R;
                    }
                    int width = p41Var2.L.getWidth();
                    int height = p41Var2.L.getHeight();
                    if (p41Var2.P) {
                        height = Math.min(AndroidUtilities.dp(360.0f), Math.min(width, AndroidUtilities.displaySize.y));
                    }
                    int i12 = height;
                    p41Var2.H = i12 - p41Var2.L.getHeight();
                    i10 = (int) Math.ceil((Math.min(width, i12) * 0.92f) / AndroidUtilities.density);
                    viewGroup = dVar;
                    n41 n41Var3 = new n41(p41Var2, p41Var2.getContext(), UserConfig.selectedAccount, p41Var2.L.getResourcesProvider(), width, i12);
                    p41Var2.K = n41Var3;
                    p41Var2.L.j1(n41Var3);
                    p41Var2.K.i1(p41Var2.L);
                    p41Var2.K.setDelegate(new cb.b(17));
                    n41 n41Var4 = p41Var2.K;
                    MessageObject messageObject3 = p41Var2.J;
                    MessageObject.GroupedMessages currentMessagesGroup = p41Var2.L.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.t1 t1Var3 = p41Var2.L;
                    n41Var4.X3(messageObject3, currentMessagesGroup, t1Var3.C, t1Var3.B, false, false);
                    if (!p41Var2.P) {
                        org.telegram.ui.Components.d8 d8Var = new org.telegram.ui.Components.d8();
                        p41Var2.S = d8Var;
                        n41 n41Var5 = p41Var2.K;
                        d8Var.i = n41Var5;
                        n41Var5.be = d8Var;
                        if (n41Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.mo0 seekBarWaveform = p41Var2.K.getSeekBarWaveform();
                            seekBarWaveform.L = p41Var2.s;
                            org.telegram.ui.Cells.t1 t1Var4 = seekBarWaveform.n;
                            if (t1Var4 != null) {
                                t1Var4.invalidate();
                            }
                        }
                    }
                    p41Var2.E = false;
                    viewGroup.addView(p41Var2.K, new FrameLayout.LayoutParams(p41Var2.L.getWidth(), i12, 17));
                } else {
                    viewGroup = dVar;
                    i10 = 360;
                }
                TextureView textureView = p41Var2.M;
                if (textureView != null) {
                    viewGroup.removeView(textureView);
                    p41Var2.M = null;
                }
                if (p41Var2.P) {
                    p41Var2.N = false;
                    TextureView textureView2 = new TextureView(context);
                    p41Var2.M = textureView2;
                    viewGroup.addView(textureView2, 0, k7.b6.c(i10, i10));
                }
                MediaController.getInstance().pauseByRewind();
                org.telegram.ui.Components.i71 i71Var = p41Var2.w;
                if (i71Var != null) {
                    i71Var.B();
                    p41Var2.w.H();
                    p41Var2.w = null;
                }
                org.telegram.ui.Cells.t1 t1Var5 = p41Var2.L;
                if (t1Var5 != null && t1Var5.getMessageObject() != null) {
                    File pathToAttach = FileLoader.getInstance(p41Var2.L.getMessageObject().currentAccount).getPathToAttach(p41Var2.L.getMessageObject().getDocument());
                    if (pathToAttach != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && (pathToAttach = FileLoader.getInstance(p41Var2.L.getMessageObject().currentAccount).getPathToMessage(p41Var2.L.getMessageObject().messageOwner)) != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && p41Var2.L.getMessageObject().messageOwner.attachPath != null) {
                        pathToAttach = new File(p41Var2.L.getMessageObject().messageOwner.attachPath);
                    }
                    if (pathToAttach != null && pathToAttach.exists()) {
                        org.telegram.ui.Components.i71 i71Var2 = new org.telegram.ui.Components.i71();
                        p41Var2.w = i71Var2;
                        i71Var2.G = new o41(p41Var2);
                        if (p41Var2.S != null) {
                            i71Var2.H = new o41(p41Var2);
                        }
                        if (p41Var2.P) {
                            i71Var2.V(p41Var2.M);
                        }
                        p41Var2.w.D(Uri.fromFile(pathToAttach), "other");
                        p41Var2.w.C();
                        org.telegram.ui.Components.ft ftVar = p41Var2.B;
                        if (ftVar != null) {
                            ftVar.s = p41Var2.w;
                            ftVar.a();
                        }
                    }
                    xn xnVar = this.a;
                    xnVar.showDialog(xnVar.W9);
                    return false;
                }
                ph.f3 f3Var = p41Var2.x;
                if (f3Var != null) {
                    viewGroup.removeView(f3Var);
                    p41Var2.x = null;
                }
                MessageObject messageObject4 = p41Var2.J;
                boolean z4 = messageObject4 != null && messageObject4.isOutOwner();
                MessageObject messageObject5 = p41Var2.J;
                if (messageObject5 != null && messageObject5.getDialogId() != UserConfig.getInstance(p41Var2.J.currentAccount).getClientUserId()) {
                    ph.f3 f3Var2 = new ph.f3(context, 3);
                    p41Var2.x = f3Var2;
                    f3Var2.q(true);
                    if (z4) {
                        long dialogId = p41Var2.J.getDialogId();
                        String str = "";
                        if (dialogId > 0) {
                            TLRPC.User user = MessagesController.getInstance(p41Var2.J.currentAccount).getUser(Long.valueOf(dialogId));
                            if (user != null) {
                                str = UserObject.getFirstName(user);
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(p41Var2.J.currentAccount).getChat(Long.valueOf(-dialogId));
                            if (chat != null) {
                                str = chat.title;
                            }
                        }
                        p41Var2.x.t(AndroidUtilities.replaceTags(LocaleController.formatString(p41Var2.P ? R.string.VideoOnceOutHint : R.string.VoiceOnceOutHint, str)));
                    } else {
                        p41Var2.x.t(AndroidUtilities.replaceTags(LocaleController.getString(p41Var2.P ? R.string.VideoOnceHint : R.string.VoiceOnceHint)));
                    }
                    p41Var2.x.r(12.0f);
                    p41Var2.x.setPadding(AndroidUtilities.dp((z4 || p41Var2.L.C) ? 0.0f : 6.0f), 0, 0, 0);
                    if (p41Var2.P) {
                        p41Var2.x.n(0.5f, 0.0f);
                        p41Var2.x.H = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        p41Var2.x.n(0.0f, AndroidUtilities.dp(34.0f));
                        p41Var2.x.H = Layout.Alignment.ALIGN_NORMAL;
                    }
                    p41Var2.x.u(14.0f);
                    ph.f3 f3Var3 = p41Var2.x;
                    f3Var3.h = ph.f3.a(f3Var3.getText(), p41Var2.x.getTextPaint());
                    if (p41Var2.P) {
                        viewGroup.addView(p41Var2.x, k7.b6.d((int) ((p41Var2.L.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((p41Var2.L.getHeight() + p41Var2.H) / AndroidUtilities.density) / 2.0f), 0.0f, 0.0f));
                    } else {
                        viewGroup.addView(p41Var2.x, k7.b6.d((int) ((p41Var2.L.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, ((((p41Var2.L.getWidth() * (-0.39999998f)) / 2.0f) + p41Var2.L.getBoundsLeft()) / AndroidUtilities.density) + 1.0f, ((-75.0f) - ((p41Var2.L.getHeight() / AndroidUtilities.density) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    p41Var2.x.v();
                }
                TextView textView = p41Var2.y;
                if (textView != null) {
                    viewGroup.removeView(textView);
                    p41Var2.y = null;
                }
                TextView textView2 = new TextView(context);
                p41Var2.y = textView2;
                textView2.setTextColor(-1);
                p41Var2.y.setTypeface(AndroidUtilities.bold());
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    p41Var2.y.setBackground(org.telegram.ui.ActionBar.j6.i0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    p41Var2.y.setBackground(org.telegram.ui.ActionBar.j6.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                p41Var2.y.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
                k7.d6.a(p41Var2.y);
                p41Var2.y.setText(LocaleController.getString(z4 ? R.string.VoiceOnceClose : R.string.VoiceOnceDeleteClose));
                p41Var2.y.setOnClickListener(new l41(p41Var2, i11));
                viewGroup.addView(p41Var2.y, k7.b6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z4 && (n41Var = p41Var2.K) != null && n41Var.getMessageObject() != null && p41Var2.K.getMessageObject().messageOwner != null) {
                    p41Var2.K.getMessageObject().messageOwner.media_unread = false;
                    p41Var2.K.invalidate();
                }
                xn xnVar2 = this.a;
                xnVar2.showDialog(xnVar2.W9);
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
                ArrayList L = this.a.x0.L();
                xn xnVar3 = this.a;
                return mediaController.setPlaylist(L, messageObject, xnVar3.I6, true ^ xnVar3.x0.K, null);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void U(org.telegram.ui.Cells.t1 t1Var) {
        k(t1Var, true, true, false);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void V1() {
        org.telegram.ui.ActionBar.f6 f6Var;
        xn xnVar = this.a;
        if (xnVar.U0 == null || xnVar.getParentActivity() == null) {
            return;
        }
        Context context = xnVar.U0.getContext();
        f6Var = ((org.telegram.ui.ActionBar.p2) xnVar).resourceProvider;
        p31.T(context, xnVar, false, f6Var, null);
    }

    @Override // org.telegram.ui.Cells.k1
    public final int W() {
        return this.a.O3;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void W0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z4) {
        this.a.U7(characterStyle, z4, t1Var.getMessageObject(), t1Var);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void X1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        wi wiVar;
        int i10;
        MessageObject messageObject = t1Var.getMessageObject();
        af.b bVar = null;
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
                        TLRPC.TL_message C7 = xn.C7(message);
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
                xn xnVar = this.a;
                t12.K2(null, xnVar, xnVar.ba);
                PhotoViewer.t1().a2(arrayList, i11, this.a.a(), 0L, 0L, this.a.Da);
                return;
            }
            return;
        }
        xn xnVar2 = this.a;
        af.f fVar = xnVar2.xb;
        if (fVar != null) {
            fVar.a(true);
            xnVar2.xb = null;
        }
        if (t1Var.getMessageObject() == null) {
            xnVar2.xb = null;
            wiVar = null;
        } else {
            wiVar = new wi(xnVar2, t1Var.getMessageObject().getId(), t1Var, 1);
            xnVar2.xb = wiVar;
        }
        i10 = ((org.telegram.ui.ActionBar.p2) this.a).currentAccount;
        lh.t7 y10 = lh.t7.y(i10, false);
        Objects.requireNonNull(wiVar);
        zi ziVar = new zi(wiVar, 7);
        Context context = LaunchActivity.D1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        org.telegram.ui.ActionBar.f6 I = lh.t7.I();
        if (messageObject != null && context != null) {
            long dialogId = messageObject.getDialogId();
            int id2 = messageObject.getId();
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = MessagesController.getInstance(y10.a).getInputPeer(dialogId);
            tL_inputInvoiceMessage.msg_id = id2;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject p10 = rh.q2.p(I, false);
            if (p10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
            bVar = new af.b(y10, ConnectionsManager.getInstance(y10.a).sendRequest(tL_payments_getPaymentForm, new kh.b1(y10, messageObject, tL_inputInvoiceMessage, ziVar, 4)), 9);
        }
        if (bVar != null) {
            wiVar.b = bVar;
            wiVar.d();
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean Y0(org.telegram.ui.Cells.t1 t1Var, boolean z4) {
        MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
        MessageObject messageObject = (currentMessagesGroup == null || currentMessagesGroup.messages.isEmpty()) ? t1Var.getMessageObject() : currentMessagesGroup.messages.get(0);
        if (messageObject != null) {
            xn xnVar = this.a;
            boolean z10 = !xnVar.gc && messageObject.getId() == xnVar.fc;
            if (!z4) {
                return z10;
            }
            if (z10 && System.currentTimeMillis() - xnVar.hc > 1000) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void Y1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10;
        int i11;
        ImageLocation forDocument;
        String str2;
        boolean isEmpty = TextUtils.isEmpty(str);
        xn xnVar = this.a;
        if (!isEmpty) {
            af.g.s(xnVar.getParentActivity(), "https://" + xnVar.getMessagesController().linkPrefix + "/nft/" + str);
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
        eg.e2 e2Var = new eg.e2(xnVar, i10, user, null, null, xnVar.ba);
        t1Var.getLocationOnScreen(new int[2]);
        e2Var.s0 = t1Var.getNameStatusX();
        e2Var.t0 = t1Var.getNameStatusY();
        e2Var.w0 = t1Var.getScaleX();
        e2Var.u0 = t1Var.getLeft();
        e2Var.v0 = t1Var.getTop();
        e2Var.x0 = t1Var;
        int colorId = UserObject.getColorId(user);
        if (colorId < 7) {
            e2Var.r0 = Integer.valueOf(xnVar.getThemedColor(org.telegram.ui.ActionBar.j6.r8[colorId]));
        } else {
            i11 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
            MessagesController.PeerColors peerColors = MessagesController.getInstance(i11).peerColors;
            MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(colorId) : null;
            e2Var.r0 = color != null ? Integer.valueOf(color.getColor1()) : null;
        }
        org.telegram.ui.Components.j5 j5Var = t1Var.cc;
        if (j5Var != null && (j5Var.f[0] instanceof org.telegram.ui.Components.l5)) {
            e2Var.w0 *= 0.95f;
            if (document != null) {
                org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(xnVar.getParentActivity());
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
                p9Var.setLayerNum(7);
                p9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                p9Var.l(imageLocation, str3, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "140_140", svgThumb, document);
                if (MessageObject.isTextColorEmoji(document)) {
                    Integer num = e2Var.r0;
                    p9Var.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : xnVar.getThemedColor(org.telegram.ui.ActionBar.j6.v6), PorterDuff.Mode.SRC_IN));
                    e2Var.z0 = MessageObject.getInputStickerSet(document);
                } else {
                    e2Var.z0 = MessageObject.getInputStickerSet(document);
                }
                e2Var.y0 = p9Var;
                e2Var.B0 = true;
            }
        }
        xnVar.showDialog(e2Var);
    }

    @Override // org.telegram.ui.Cells.k1
    public final ug.a Z() {
        return this.a.Nb;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void Z0(org.telegram.ui.Cells.t1 t1Var) {
        xn xnVar = this.a;
        xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(xnVar.Q5), t1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:310:0x0683, code lost:
    
        if (r11.paid_reactions_available != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0689, code lost:
    
        if (r8.isEmpty() == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x06b9, code lost:
    
        if (r11.paid_reactions_available != false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x06d5, code lost:
    
        if (r8.isEmpty() != false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x06c3, code lost:
    
        if (org.telegram.messenger.ChatObject.isChannel(r5.e) == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x06cf, code lost:
    
        if (org.telegram.messenger.ChatObject.isMonoForum(r5.e) != false) goto L188;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0845 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x099f A[LOOP:3: B:254:0x099d->B:255:0x099f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0a06  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0a1e  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0aa0  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x093e  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x068f  */
    @Override // org.telegram.ui.Cells.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Z1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        rv0 rv0Var;
        TLRPC.PollAnswer pollAnswer2;
        rv0 rv0Var2;
        nv0 nv0Var;
        MessageObject messageObject;
        MessageObject messageObject2;
        boolean z4;
        nv0 nv0Var2;
        boolean z10;
        boolean z11;
        boolean z12;
        MessageObject messageObject3;
        boolean z13;
        ArrayList arrayList;
        rv0 rv0Var3;
        xe xeVar;
        xn xnVar;
        MessageObject messageObject4;
        int size;
        int i10;
        ViewGroup viewGroup;
        boolean z14;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        boolean z15;
        byte[] bArr;
        nv0 nv0Var3;
        TLRPC.PollAnswerVoters pollAnswerVoters;
        boolean z16;
        rv0 rv0Var4;
        ArrayList arrayList2;
        byte[] bArr2;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll2;
        TLRPC.PollAnswer pollAnswer3;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll3;
        boolean z17;
        dh.u uVar;
        boolean z18;
        ArrayList<TLRPC.PollAnswerVoters> arrayList3;
        xn xnVar2 = this.a;
        if (xnVar2.getParentActivity() != null && xnVar2.getParentActivity() != null) {
            ph.f3 f3Var = xnVar2.u1;
            if (f3Var != null && f3Var.S) {
                f3Var.e(true);
            }
            vl vlVar = xnVar2.y1;
            if (vlVar != null && vlVar.S) {
                vlVar.e(true);
            }
            MessageObject primaryMessageObject = t1Var.getPrimaryMessageObject();
            TLRPC.MessageMedia media = MessageObject.getMedia(primaryMessageObject);
            if (primaryMessageObject != null && (media instanceof TLRPC.TL_messageMediaPoll)) {
                xnVar2.a5 = primaryMessageObject;
                xnVar2.b5 = null;
                rv0 rv0Var5 = new rv0(xnVar2.getParentActivity(), xnVar2.getResourceProvider());
                byte[] bArr3 = pollAnswer.option;
                rv0Var5.I = t1Var;
                rv0Var5.M = bArr3;
                MessageObject messageObject5 = t1Var.getMessageObject();
                rv0Var5.E = messageObject5;
                rv0Var5.F = messageObject5 != null && messageObject5.isOutOwner();
                org.telegram.ui.Cells.t1 t1Var2 = rv0Var5.I;
                nv0 nv0Var4 = rv0Var5.d;
                if (t1Var2 != null) {
                    rv0Var5.J = xnVar2.p9 - AndroidUtilities.dp(4.0f);
                    rv0Var5.K = t1Var.n;
                    if (t1Var.getParent() instanceof View) {
                        View view = (View) t1Var.getParent();
                        rv0Var5.J = view.getY() + rv0Var5.J;
                        rv0Var5.K = view.getY() + rv0Var5.K;
                    }
                    int width = rv0Var5.I.getWidth();
                    int height = rv0Var5.I.getHeight();
                    rv0Var5.I.getHeight();
                    pv0 pv0Var = new pv0(rv0Var5, rv0Var5.getContext(), UserConfig.selectedAccount, rv0Var5.I.getResourcesProvider(), bArr3, width, height);
                    rv0Var = rv0Var5;
                    rv0Var.G = pv0Var;
                    rv0Var.I.h1(pv0Var);
                    rv0Var.G.i1(rv0Var.I);
                    rv0Var.G.setDelegate(new z9.d(16));
                    pv0 pv0Var2 = rv0Var.G;
                    MessageObject messageObject6 = rv0Var.E;
                    MessageObject.GroupedMessages currentMessagesGroup = rv0Var.I.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.t1 t1Var3 = rv0Var.I;
                    pv0Var2.X3(messageObject6, currentMessagesGroup, t1Var3.C, t1Var3.B, t1Var3.D, false);
                    pv0 pv0Var3 = rv0Var.G;
                    pv0Var3.J7 = bArr3;
                    nv0Var4.addView(pv0Var3, new FrameLayout.LayoutParams(rv0Var.I.getWidth(), height, 51));
                    qv0 qv0Var = new qv0(rv0Var.getContext(), UserConfig.selectedAccount, rv0Var.I.getResourcesProvider(), width, height, 0);
                    rv0Var.H = qv0Var;
                    rv0Var.I.j1(qv0Var);
                    rv0Var.I.h1(rv0Var.H);
                    rv0Var.H.i1(rv0Var.I);
                    rv0Var.H.setDelegate(new h7.u(16));
                    qv0 qv0Var2 = rv0Var.H;
                    MessageObject messageObject7 = rv0Var.E;
                    MessageObject.GroupedMessages currentMessagesGroup2 = rv0Var.I.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.t1 t1Var4 = rv0Var.I;
                    qv0Var2.X3(messageObject7, currentMessagesGroup2, t1Var4.C, t1Var4.B, t1Var4.D, false);
                    nv0Var4.addView(rv0Var.H, new FrameLayout.LayoutParams(rv0Var.I.getWidth(), height, 51));
                } else {
                    rv0Var = rv0Var5;
                }
                ek ekVar = rv0Var.f;
                ekVar.bringToFront();
                nv0 nv0Var5 = rv0Var.e;
                nv0Var5.bringToFront();
                rv0Var.n.bringToFront();
                ekVar.w(false);
                Context context = rv0Var.a;
                View view2 = new View(context);
                org.telegram.ui.ActionBar.f6 f6Var = rv0Var.b;
                org.telegram.ui.Components.o70 G = org.telegram.ui.Components.o70.G(nv0Var4, f6Var, view2, true);
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll4 = (TLRPC.TL_messageMediaPoll) MessageObject.getMedia(rv0Var.E);
                rv0Var.S = MessageObject.isVoted(tL_messageMediaPoll4);
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
                ng.a aVar = rv0Var.D;
                if (pollAnswer2 != null) {
                    TLRPC.Poll poll = tL_messageMediaPoll4.poll;
                    boolean z19 = (poll.closed || poll.revoting_disabled) ? false : true;
                    boolean z20 = poll.multiple_choice;
                    ArrayList arrayList4 = new ArrayList();
                    TLRPC.PollResults pollResults = tL_messageMediaPoll4.results;
                    if (pollResults == null || (arrayList3 = pollResults.results) == null) {
                        tL_messageMediaPoll = tL_messageMediaPoll4;
                        z15 = z20;
                        bArr = bArr3;
                        nv0Var3 = nv0Var4;
                        pollAnswerVoters = null;
                        z16 = false;
                    } else {
                        int size2 = arrayList3.size();
                        z15 = z20;
                        int i12 = 0;
                        z16 = false;
                        TLRPC.PollAnswerVoters pollAnswerVoters2 = null;
                        while (i12 < size2) {
                            TLRPC.PollAnswerVoters pollAnswerVoters3 = arrayList3.get(i12);
                            int i13 = i12 + 1;
                            TLRPC.PollAnswerVoters pollAnswerVoters4 = pollAnswerVoters3;
                            nv0 nv0Var6 = nv0Var4;
                            boolean equals = Arrays.equals(pollAnswerVoters4.option, bArr3);
                            if (equals) {
                                pollAnswerVoters2 = pollAnswerVoters4;
                            }
                            byte[] bArr4 = bArr3;
                            if (pollAnswerVoters4.chosen) {
                                if (equals) {
                                    z16 = true;
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
                                nv0Var4 = nv0Var6;
                                i12 = i13;
                                bArr3 = bArr4;
                                tL_messageMediaPoll4 = tL_messageMediaPoll5;
                            } else {
                                nv0Var4 = nv0Var6;
                                i12 = i13;
                                bArr3 = bArr4;
                            }
                        }
                        tL_messageMediaPoll = tL_messageMediaPoll4;
                        bArr = bArr3;
                        nv0Var3 = nv0Var4;
                        pollAnswerVoters = pollAnswerVoters2;
                    }
                    if (pollAnswerVoters == null || pollAnswerVoters.voters <= 0 || !MessageObject.canShowVotersList(tL_messageMediaPoll)) {
                        rv0Var4 = rv0Var;
                        arrayList2 = arrayList4;
                        messageObject = primaryMessageObject;
                        nv0Var = nv0Var3;
                        bArr2 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                    } else {
                        dh.u uVar2 = new dh.u(context, xnVar2.getCurrentAccount(), f6Var);
                        org.telegram.ui.Components.o70 J = G.J();
                        J.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                        qg.a j10 = rg.b.j(f6Var);
                        View view3 = J.B;
                        if (view3 != null) {
                            uVar = uVar2;
                            z18 = false;
                            pg.b c3 = aVar.c(view3, null, false);
                            c3.n(j10);
                            view3.setBackground(c3);
                        } else {
                            uVar = uVar2;
                            z18 = false;
                        }
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new rt0(G, 25), z18);
                        J.k();
                        long dialogId = rv0Var.E.getDialogId();
                        int id2 = rv0Var.E.getId();
                        int i17 = pollAnswerVoters.voters;
                        org.telegram.ui.Components.vk vkVar = new org.telegram.ui.Components.vk(22, rv0Var, xnVar2);
                        rv0Var4 = rv0Var;
                        messageObject = primaryMessageObject;
                        arrayList2 = arrayList4;
                        nv0Var = nv0Var3;
                        dh.u uVar3 = uVar;
                        byte[] bArr5 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                        View a2 = uVar3.a(xnVar2, dialogId, id2, bArr5, i17, vkVar);
                        xnVar2 = xnVar2;
                        bArr2 = bArr5;
                        J.q(a2);
                        uVar3.setMinimumHeight(AndroidUtilities.dp(48.0f));
                        uVar3.setText(LocaleController.formatPluralString("PollVotesCount", pollAnswerVoters.voters, new Object[0]));
                        uVar3.a.d(pollAnswerVoters.recent_voters, false);
                        uVar3.setLayoutParams(k7.b6.n(-1, 48));
                        uVar3.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I5, false), 12, 0));
                        uVar3.setOnClickListener(new gb0(12, G, J));
                        G.q(uVar3);
                        G.k();
                    }
                    if (!z19) {
                        rv0Var2 = rv0Var4;
                        pollAnswer3 = pollAnswer2;
                    } else if (z16) {
                        int i18 = R.drawable.msg_unvote;
                        CharSequence string = LocaleController.getString(R.string.Unvote);
                        rv0Var2 = rv0Var4;
                        xn xnVar3 = xnVar2;
                        TLRPC.PollAnswer pollAnswer6 = pollAnswer2;
                        Runnable jv0Var = new jv0(rv0Var2, z15, xnVar3, arrayList2, pollAnswer6);
                        xnVar2 = xnVar3;
                        pollAnswer3 = pollAnswer6;
                        G.c(i18, string, jv0Var, false);
                    } else {
                        rv0Var2 = rv0Var4;
                        pollAnswer3 = pollAnswer2;
                        boolean z21 = z15;
                        if (dh.l.a(rv0Var2.E) == 0) {
                            G.c(R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), new jv0(rv0Var2, z21, pollAnswer3, xnVar2, arrayList2), false);
                        }
                    }
                    if (xnVar2.E6()) {
                        G.c(R.drawable.menu_reply, LocaleController.getString(R.string.PollItemQuote), new hf0(rv0Var2, xnVar2, pollAnswer3, 21), false);
                    }
                    if (rv0Var2.E.getDialogId() >= 0 || pollAnswer3.option == null) {
                        tL_messageMediaPoll3 = tL_messageMediaPoll2;
                        z17 = false;
                    } else {
                        MessagesController messagesController = MessagesController.getInstance(rv0Var2.E.currentAccount);
                        tL_messageMediaPoll3 = tL_messageMediaPoll2;
                        String publicUsername = DialogObject.getPublicUsername(messagesController.getUserOrChat(rv0Var2.E.getDialogId()));
                        StringBuilder sb = new StringBuilder("https://");
                        sb.append(messagesController.linkPrefix);
                        sb.append("/");
                        if (TextUtils.isEmpty(publicUsername)) {
                            publicUsername = "c/" + (-rv0Var2.E.getDialogId());
                        }
                        sb.append(publicUsername);
                        sb.append("/");
                        sb.append(rv0Var2.E.getId());
                        sb.append("?option=");
                        sb.append(new String(Base64.encode(pollAnswer3.option, 9)));
                        z17 = false;
                        G.c(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new zq0(9, rv0Var2, sb.toString()), false);
                    }
                    G.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new zq0(10, rv0Var2, pollAnswer3), z17);
                    TLRPC.Peer peer = pollAnswer3.added_by;
                    if (peer != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        long clientUserId = UserConfig.getInstance(rv0Var2.E.currentAccount).getClientUserId();
                        long currentTime = ConnectionsManager.getInstance(rv0Var2.E.currentAccount).getCurrentTime();
                        xn xnVar4 = xnVar2;
                        long j11 = MessagesController.getInstance(rv0Var2.E.currentAccount).config.pollAnswerDeletePeriod.get(TimeUnit.SECONDS) + pollAnswer3.date;
                        if (!rv0Var2.E.isForwarded()) {
                            TLRPC.Poll poll2 = tL_messageMediaPoll3.poll;
                            if (!poll2.closed && (poll2.creator || (peerDialogId == clientUserId && currentTime < j11))) {
                                G.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new zq0(11, rv0Var2, bArr2), true);
                            }
                        }
                        G.k();
                        TLObject userOrChat = MessagesController.getInstance(rv0Var2.E.currentAccount).getUserOrChat(peerDialogId);
                        CharSequence replaceTags = AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.PollAddedByAtTime, DialogObject.getShortName(userOrChat), LocaleController.formatDateTime(pollAnswer3.date, true)));
                        xnVar2 = xnVar4;
                        hv0 hv0Var = new hv0(rv0Var2, peerDialogId, xnVar2, 0);
                        Context context2 = G.e;
                        FrameLayout frameLayout = new FrameLayout(context2);
                        int i19 = org.telegram.ui.ActionBar.j6.i6;
                        org.telegram.ui.ActionBar.f6 f6Var2 = G.d;
                        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(i19, f6Var2), 0, 12));
                        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context2);
                        p9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
                        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
                        z8Var.p(userOrChat);
                        p9Var.e(userOrChat, z8Var);
                        frameLayout.addView(p9Var, k7.b6.d(34, 34.0f, 51, 13.0f, 11.0f, 0.0f, 11.0f));
                        TextView textView = new TextView(context2);
                        b.l(org.telegram.ui.ActionBar.j6.j5, f6Var2, textView, 1, 14.0f);
                        textView.setText(replaceTags);
                        textView.setMaxWidth(AndroidUtilities.dp(150.0f));
                        textView.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                        frameLayout.addView(textView, k7.b6.d(-2, -2.0f, 55, 59.0f, 8.0f, 16.0f, 0.0f));
                        frameLayout.setOnClickListener(new org.telegram.ui.Components.w2(22, G, hv0Var));
                        G.r(frameLayout, k7.b6.n(-1, -2));
                        G.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                        G.Q(aVar, rg.b.j(f6Var), false);
                        G.Y();
                        ViewGroup viewGroup2 = G.A;
                        rv0Var2.O = viewGroup2;
                        viewGroup2.setPivotX(0.0f);
                        rv0Var2.O.setPivotY(0.0f);
                        nv0Var5.addView(rv0Var2.O, k7.b6.e(-2, -2, 51));
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        xnVar2.n8(messageObject, arrayList7, arrayList8, arrayList9);
                        xe xeVar2 = new xe(xnVar2, 6);
                        messageObject2 = rv0Var2.E;
                        List<TLRPC.TL_availableReaction> enabledReactionsList = xnVar2.getMediaDataController().getEnabledReactionsList();
                        z4 = xnVar2.v() && !xnVar2.c() && xnVar2.f == null && messageObject2.hasReactions() && !((ChatObject.isChannel(xnVar2.e) && !xnVar2.e.megagroup) || ChatObject.isMonoForum(xnVar2.e) || enabledReactionsList.isEmpty() || !messageObject2.messageOwner.reactions.can_see_list || messageObject2.isSecretMedia());
                        if (messageObject2.isForwardedChannelPost()) {
                            nv0Var2 = nv0Var5;
                            if (!messageObject2.isSecretMedia()) {
                                if (xnVar2.O3 != 5) {
                                    if (!xnVar2.v()) {
                                        if (!xnVar2.c()) {
                                            if (messageObject2.isReactionsAvailable()) {
                                                TLRPC.ChatFull chatFull2 = xnVar2.W7;
                                                if (chatFull2 != null) {
                                                    if (chatFull2.available_reactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    }
                                                }
                                                if (chatFull2 == null) {
                                                }
                                                if (xnVar2.f == null) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            z10 = false;
                        } else {
                            nv0Var2 = nv0Var5;
                            TLRPC.ChatFull chatFull3 = xnVar2.getMessagesController().getChatFull(-messageObject2.getFromChatId());
                            if (chatFull3 != null) {
                                if (!xnVar2.v()) {
                                    if (xnVar2.O3 != 5) {
                                        if (!xnVar2.c()) {
                                            if (messageObject2.isReactionsAvailable()) {
                                                if (chatFull3.available_reactions instanceof TLRPC.TL_chatReactionsNone) {
                                                }
                                            }
                                        }
                                    }
                                }
                                z10 = false;
                            }
                            z10 = true;
                        }
                        boolean z22 = z10;
                        z11 = (!z4 || xnVar2.c() || xnVar2.e == null || !messageObject2.isOutOwner() || !messageObject2.isSent() || messageObject2.isEditing() || messageObject2.isSending() || messageObject2.isSendError() || messageObject2.isContentUnread() || messageObject2.isUnread() || ConnectionsManager.getInstance(xnVar2.getCurrentAccount()).getCurrentTime() - messageObject2.messageOwner.date >= xnVar2.getMessagesController().chatReadMarkExpirePeriod || (!ChatObject.isMegagroup(xnVar2.e) && ChatObject.isChannel(xnVar2.e)) || (chatFull = xnVar2.W7) == null || chatFull.participants_count > xnVar2.getMessagesController().chatReadMarkSizeThreshold || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || xnVar2.O3 == 3 || !messageObject2.canSetReaction() || ChatObject.isMonoForum(xnVar2.e)) ? false : true;
                        if (xnVar2.e != null && !messageObject2.isOut() && ChatObject.isMonoForum(xnVar2.e) && ChatObject.canManageMonoForum(xnVar2.getCurrentAccount(), xnVar2.e)) {
                            int i20 = ((-xnVar2.e.linked_monoforum_id) > messageObject2.getFromChatId() ? 1 : ((-xnVar2.e.linked_monoforum_id) == messageObject2.getFromChatId() ? 0 : -1));
                        }
                        if (!z4 && xnVar2.e == null && xnVar2.h == null && (user = xnVar2.f) != null && !UserObject.isUserSelf(user) && !UserObject.isReplyUser(xnVar2.f) && !UserObject.isAnonymous(xnVar2.f)) {
                            user2 = xnVar2.f;
                            if (!user2.bot && !UserObject.isService(user2.id) && (((userFull = xnVar2.X7) == null || !userFull.read_dates_private) && !xnVar2.c() && messageObject2.isOutOwner() && messageObject2.isSent() && !messageObject2.isEditing() && !messageObject2.isSending() && !messageObject2.isSendError() && !messageObject2.isContentUnread() && !messageObject2.isUnread() && xnVar2.getConnectionsManager().getCurrentTime() - messageObject2.messageOwner.date < xnVar2.getMessagesController().pmReadDateExpirePeriod && !(messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                                z12 = true;
                                TLRPC.User user3 = xnVar2.f;
                                boolean z23 = ((user3 == null && (UserObject.isReplyUser(user3) || UserObject.isAnonymous(xnVar2.f))) || xnVar2.c() || !messageObject2.isEdited() || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                                org.telegram.ui.Components.o70 G2 = org.telegram.ui.Components.o70.G(nv0Var, xnVar2.getResourceProvider(), null, !z4 || z11);
                                if (z11) {
                                    messageObject3 = messageObject2;
                                    z13 = z22;
                                    arrayList = arrayList8;
                                    rv0Var3 = rv0Var2;
                                    xeVar = xeVar2;
                                    xnVar = xnVar2;
                                    if (z12) {
                                        G2.r(new org.telegram.ui.Components.ac0(rv0Var3.getContext(), 0, messageObject3, new gv0(rv0Var3, 1), rv0Var3.b), k7.b6.n(-1, 36));
                                        G2.k();
                                    } else if (z23) {
                                        messageObject4 = messageObject3;
                                        G2.r(new org.telegram.ui.Components.ac0(rv0Var3.getContext(), 1, messageObject3, new gv0(rv0Var3, 2), rv0Var3.b), k7.b6.n(-1, 36));
                                        G2.k();
                                        size = arrayList7.size();
                                        i10 = 0;
                                        while (i10 < size) {
                                            G2.c(((Integer) arrayList7.get(i10)).intValue(), (CharSequence) arrayList.get(i10), new zt0(rv0Var3, xeVar, ((Integer) arrayList9.get(i10)).intValue(), 2), false);
                                            i10++;
                                            arrayList7 = arrayList7;
                                        }
                                        G2.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                                        G2.Q(aVar, rg.b.j(f6Var), false);
                                        G2.Y();
                                        ViewGroup viewGroup3 = G2.A;
                                        rv0Var3.Q = viewGroup3;
                                        viewGroup3.setPivotX(0.0f);
                                        rv0Var3.Q.setPivotY(0.0f);
                                        ViewGroup viewGroup4 = nv0Var2;
                                        viewGroup4.addView(rv0Var3.Q, k7.b6.e(-2, -2, 51));
                                        viewGroup = rv0Var3.Q;
                                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new il0(rv0Var3, 6));
                                            rv0Var3.Q.setOnTouchListener(new f0(rv0Var3, 5));
                                        }
                                        if (z13) {
                                            xn xnVar5 = xnVar;
                                            org.telegram.ui.Components.pk0 pk0Var = new org.telegram.ui.Components.pk0((xnVar.getUserConfig().getClientUserId() > xnVar.a() ? 1 : (xnVar.getUserConfig().getClientUserId() == xnVar.a() ? 0 : -1)) == 0 ? 3 : 0, xnVar5.getCurrentAccount(), rv0Var3.getContext(), xnVar5, rv0Var3.b);
                                            pk0Var.a = true;
                                            float f10 = 22;
                                            pk0Var.setPadding(AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : 24), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 24 : 0), AndroidUtilities.dp(f10));
                                            pk0Var.setDelegate(new mv0(rv0Var3, xnVar5, messageObject4, pk0Var));
                                            rv0Var3.N = pk0Var;
                                            viewGroup4.addView(pk0Var, k7.b6.e(-2, (int) ((pk0Var.getTopOffset() / AndroidUtilities.density) + 52.0f + f10), 51));
                                            z14 = true;
                                            pk0Var.p(messageObject4, xnVar5.W7, true);
                                            rv0Var3.N.setTransitionProgress(1.0f);
                                        } else {
                                            z14 = true;
                                        }
                                        rv0Var3.e();
                                        rv0Var3.b0 = new um(this, 0);
                                        rv0Var3.show();
                                        return z14;
                                    }
                                } else {
                                    wh0 wh0Var = new wh0(rv0Var2.getContext(), xnVar2.getCurrentAccount(), messageObject2, xnVar2.e);
                                    FrameLayout frameLayout2 = new FrameLayout(rv0Var2.getContext());
                                    frameLayout2.addView(wh0Var, k7.b6.c(36.0f, -1));
                                    org.telegram.ui.Components.o70 J2 = G2.J();
                                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, rv0Var2.getContext(), rv0Var2.b, true, false);
                                    g1Var.setItemHeight(44);
                                    rv0 rv0Var6 = rv0Var2;
                                    g1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                                    g1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                                    FrameLayout frameLayout3 = new FrameLayout(rv0Var6.getContext());
                                    LinearLayout linearLayout = new LinearLayout(rv0Var6.getContext());
                                    linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var));
                                    linearLayout.setOrientation(1);
                                    xnVar = xnVar2;
                                    org.telegram.ui.Components.sl0 a10 = wh0Var.a();
                                    frameLayout3.addView(g1Var);
                                    linearLayout.addView(frameLayout3);
                                    z13 = z22;
                                    linearLayout.addView(new org.telegram.ui.ActionBar.m1(rv0Var6.getContext(), f6Var), k7.b6.n(-1, 8));
                                    frameLayout3.setOnClickListener(new kv0(G2));
                                    messageObject3 = messageObject2;
                                    arrayList = arrayList8;
                                    lv0 lv0Var = new lv0(rv0Var6, wh0Var, xnVar, a10, linearLayout, G2, J2);
                                    G2 = G2;
                                    rv0Var3 = rv0Var6;
                                    wh0Var.setOnClickListener(lv0Var);
                                    linearLayout.addView(a10, k7.b6.n(-1, -2));
                                    J2.q(linearLayout);
                                    G2.q(frameLayout2);
                                    G2.k();
                                    arrayList9 = arrayList9;
                                    xeVar = xeVar2;
                                }
                                messageObject4 = messageObject3;
                                size = arrayList7.size();
                                i10 = 0;
                                while (i10 < size) {
                                }
                                G2.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                                G2.Q(aVar, rg.b.j(f6Var), false);
                                G2.Y();
                                ViewGroup viewGroup32 = G2.A;
                                rv0Var3.Q = viewGroup32;
                                viewGroup32.setPivotX(0.0f);
                                rv0Var3.Q.setPivotY(0.0f);
                                ViewGroup viewGroup42 = nv0Var2;
                                viewGroup42.addView(rv0Var3.Q, k7.b6.e(-2, -2, 51));
                                viewGroup = rv0Var3.Q;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                }
                                if (z13) {
                                }
                                rv0Var3.e();
                                rv0Var3.b0 = new um(this, 0);
                                rv0Var3.show();
                                return z14;
                            }
                        }
                        z12 = false;
                        TLRPC.User user32 = xnVar2.f;
                        if (user32 == null) {
                        }
                        org.telegram.ui.Components.o70 G22 = org.telegram.ui.Components.o70.G(nv0Var, xnVar2.getResourceProvider(), null, !z4 || z11);
                        if (z11) {
                        }
                        messageObject4 = messageObject3;
                        size = arrayList7.size();
                        i10 = 0;
                        while (i10 < size) {
                        }
                        G22.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                        G22.Q(aVar, rg.b.j(f6Var), false);
                        G22.Y();
                        ViewGroup viewGroup322 = G22.A;
                        rv0Var3.Q = viewGroup322;
                        viewGroup322.setPivotX(0.0f);
                        rv0Var3.Q.setPivotY(0.0f);
                        ViewGroup viewGroup422 = nv0Var2;
                        viewGroup422.addView(rv0Var3.Q, k7.b6.e(-2, -2, 51));
                        viewGroup = rv0Var3.Q;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z13) {
                        }
                        rv0Var3.e();
                        rv0Var3.b0 = new um(this, 0);
                        rv0Var3.show();
                        return z14;
                    }
                } else {
                    rv0Var2 = rv0Var;
                    nv0Var = nv0Var4;
                    messageObject = primaryMessageObject;
                }
                G.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                G.Q(aVar, rg.b.j(f6Var), false);
                G.Y();
                ViewGroup viewGroup22 = G.A;
                rv0Var2.O = viewGroup22;
                viewGroup22.setPivotX(0.0f);
                rv0Var2.O.setPivotY(0.0f);
                nv0Var5.addView(rv0Var2.O, k7.b6.e(-2, -2, 51));
                ArrayList arrayList72 = new ArrayList();
                ArrayList arrayList82 = new ArrayList();
                ArrayList arrayList92 = new ArrayList();
                xnVar2.n8(messageObject, arrayList72, arrayList82, arrayList92);
                xe xeVar22 = new xe(xnVar2, 6);
                messageObject2 = rv0Var2.E;
                List<TLRPC.TL_availableReaction> enabledReactionsList2 = xnVar2.getMediaDataController().getEnabledReactionsList();
                if (xnVar2.v()) {
                }
                if (messageObject2.isForwardedChannelPost()) {
                }
                boolean z222 = z10;
                if (!z4) {
                }
                if (xnVar2.e != null) {
                    int i202 = ((-xnVar2.e.linked_monoforum_id) > messageObject2.getFromChatId() ? 1 : ((-xnVar2.e.linked_monoforum_id) == messageObject2.getFromChatId() ? 0 : -1));
                }
                if (!z4) {
                    user2 = xnVar2.f;
                    if (!user2.bot) {
                        z12 = true;
                        TLRPC.User user322 = xnVar2.f;
                        if (user322 == null) {
                        }
                        org.telegram.ui.Components.o70 G222 = org.telegram.ui.Components.o70.G(nv0Var, xnVar2.getResourceProvider(), null, !z4 || z11);
                        if (z11) {
                        }
                        messageObject4 = messageObject3;
                        size = arrayList72.size();
                        i10 = 0;
                        while (i10 < size) {
                        }
                        G222.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                        G222.Q(aVar, rg.b.j(f6Var), false);
                        G222.Y();
                        ViewGroup viewGroup3222 = G222.A;
                        rv0Var3.Q = viewGroup3222;
                        viewGroup3222.setPivotX(0.0f);
                        rv0Var3.Q.setPivotY(0.0f);
                        ViewGroup viewGroup4222 = nv0Var2;
                        viewGroup4222.addView(rv0Var3.Q, k7.b6.e(-2, -2, 51));
                        viewGroup = rv0Var3.Q;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z13) {
                        }
                        rv0Var3.e();
                        rv0Var3.b0 = new um(this, 0);
                        rv0Var3.show();
                        return z14;
                    }
                }
                z12 = false;
                TLRPC.User user3222 = xnVar2.f;
                if (user3222 == null) {
                }
                org.telegram.ui.Components.o70 G2222 = org.telegram.ui.Components.o70.G(nv0Var, xnVar2.getResourceProvider(), null, !z4 || z11);
                if (z11) {
                }
                messageObject4 = messageObject3;
                size = arrayList72.size();
                i10 = 0;
                while (i10 < size) {
                }
                G2222.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                G2222.Q(aVar, rg.b.j(f6Var), false);
                G2222.Y();
                ViewGroup viewGroup32222 = G2222.A;
                rv0Var3.Q = viewGroup32222;
                viewGroup32222.setPivotX(0.0f);
                rv0Var3.Q.setPivotY(0.0f);
                ViewGroup viewGroup42222 = nv0Var2;
                viewGroup42222.addView(rv0Var3.Q, k7.b6.e(-2, -2, 51));
                viewGroup = rv0Var3.Q;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z13) {
                }
                rv0Var3.e();
                rv0Var3.b0 = new um(this, 0);
                rv0Var3.show();
                return z14;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean a0(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var == null ? null : t1Var.getMessageObject();
        if (messageObject == null || messageObject.messageOwner == null) {
            return false;
        }
        xn xnVar = this.a;
        return (xnVar.O3 == 1 || xnVar.y9() || messageObject.messageOwner.noforwards || messageObject.type == 29) ? false : true;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void a1(org.telegram.ui.Cells.t1 t1Var) {
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
        xn xnVar = this.a;
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
                        int childCount = xnVar.u0.getChildCount();
                        for (int i11 = 0; i11 < childCount; i11++) {
                            View childAt = xnVar.u0.getChildAt(i11);
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
        xnVar.Jb(messageObject, spannableStringBuilder, 1);
        t1Var.g4(1, false, true);
    }

    @Override // org.telegram.ui.Cells.k1
    public final vu0 a2() {
        return this.a.ta;
    }

    public final void b(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        xn xnVar = this.a;
        jk jkVar = xnVar.V;
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
                xnVar.V.setFieldText(spannableStringBuilder);
                AndroidUtilities.runOnUIThread(new um(this, 6), 200L);
            }
        }
    }

    public final void c(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        xn xnVar = this.a;
        jk jkVar = xnVar.V;
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
                SpannableString spannableString = new SpannableString(vh.v2.k(UserObject.getFirstName(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.p51("" + user.id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            xnVar.V.setFieldText(spannableStringBuilder);
            AndroidUtilities.runOnUIThread(new um(this, 7), 200L);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean d() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z4;
        xn xnVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
        if (kVar == null) {
            return false;
        }
        kVar2 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
        if (kVar2.s() || xnVar.A9()) {
            return false;
        }
        z4 = ((org.telegram.ui.ActionBar.p2) xnVar).inPreviewMode;
        return !z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // org.telegram.ui.Cells.k1
    public final boolean d0(org.telegram.ui.Cells.t1 t1Var, final TLRPC.User user) {
        int i10;
        z4 b10;
        int i11;
        ok okVar;
        nk nkVar;
        if (!l()) {
            return false;
        }
        xn xnVar = this.a;
        ?? r22 = (xnVar.e == null || ((okVar = xnVar.L0) != null && okVar.getVisibility() == 0) || ((nkVar = xnVar.O) != null && nkVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat = xnVar.e;
        ?? r42 = (chat == null || !(xnVar.a4 == 0 || xnVar.e4) || (ChatObject.isChannel(chat) && !xnVar.e.megagroup)) ? 0 : 1;
        f5[] f5VarArr = new f5[r22 + 2 + r42];
        f5VarArr[0] = f5.d;
        f5VarArr[1] = f5.h;
        char c3 = 2;
        if (r22 != 0) {
            f5VarArr[2] = f5.n;
            c3 = 3;
        }
        if (r42 != 0) {
            f5VarArr[c3] = f5.r;
        }
        TLRPC.UserFull userFull = xnVar.getMessagesController().getUserFull(user.id);
        if (userFull != null) {
            b10 = z4.c(user, userFull, f5VarArr);
            if (!cb.m.e(b10)) {
                i11 = ((org.telegram.ui.ActionBar.p2) xnVar).classGuid;
                b10 = z4.b(user, i11, f5VarArr);
            }
        } else {
            i10 = ((org.telegram.ui.ActionBar.p2) xnVar).classGuid;
            b10 = z4.b(user, i10, f5VarArr);
        }
        if (cb.m.e(b10)) {
            cb.m.l().v((ViewGroup) xnVar.fragmentView, xnVar.ba, b10, new d7(this, t1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(xnVar, t1Var);
        final int i12 = 0;
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(this) { // from class: org.telegram.ui.wm
            public final /* synthetic */ jn b;

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
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new Runnable(this) { // from class: org.telegram.ui.wm
            public final /* synthetic */ jn b;

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
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new Runnable(this) { // from class: org.telegram.ui.wm
            public final /* synthetic */ jn b;

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

    @Override // org.telegram.ui.Cells.k1
    public final boolean d1(int i10, org.telegram.ui.Cells.t1 t1Var) {
        xn xnVar = this.a;
        return xnVar.tb != 0 && t1Var.getMessageObject() != null && xnVar.tb == t1Var.getMessageObject().getId() && xnVar.ub == i10;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean d2(long j10) {
        xn xnVar = this.a;
        TLRPC.Chat chat = xnVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return false;
        }
        return xnVar.getMessagesController().isAdmin(xnVar.e.id, j10);
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean e() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x00fe, code lost:
    
        if (org.telegram.messenger.DialogObject.getPeerDialogId(r5) != r8.Q5) goto L67;
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
    public final void e2(org.telegram.ui.Cells.t1 t1Var, int i10, float f10, float f11, boolean z4) {
        Integer num;
        TLRPC.MessageReplyHeader messageReplyHeader;
        String str;
        byte[] bArr;
        TLRPC.MessageReplyHeader messageReplyHeader2;
        TLRPC.Message message;
        String str2;
        long j10;
        boolean z10;
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
        org.telegram.ui.ActionBar.k kVar;
        boolean d = d();
        xn xnVar = this.a;
        if (!d && !z4) {
            kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
            if ((kVar.s() || xnVar.A9()) && !xnVar.Z8.A(t1Var.getMessageObject())) {
                xn.b2(xnVar, t1Var, !t1Var.i3(f10), f10, f11);
                return;
            }
            return;
        }
        if (UserObject.isReplyUser(xnVar.f)) {
            q(t1Var);
            return;
        }
        MessageObject messageObject2 = t1Var.getMessageObject();
        if (messageObject2 == null) {
            return;
        }
        if (messageObject2.isReplyToStory() && (storyItem = (message3 = messageObject2.messageOwner).replyStory) != null) {
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                kh.a2.v(R.string.StoryNotFound, org.telegram.ui.Components.qc.a0(xnVar), R.raw.story_bomb1, 36);
                return;
            }
            storyItem.dialogId = DialogObject.getPeerDialogId(message3.reply_to.peer);
            storyItem.messageId = messageObject2.getId();
            storyItem.messageType = 3;
            nh.m7.b(storyItem, xnVar.f);
            xnVar.getOrCreateStoryViewer().G(xnVar.getParentActivity(), storyItem, nh.c7.a(xnVar.u0));
            return;
        }
        TLRPC.Message message4 = messageObject2.messageOwner;
        if (message4 != null && (messageReplyHeader7 = message4.reply_to) != null && (messageReplyHeader7.flags & 2048) != 0) {
            num = Integer.valueOf(messageReplyHeader7.todo_item_id);
        } else {
            if (message4 != null && (messageReplyHeader2 = message4.reply_to) != null && (bArr = messageReplyHeader2.poll_option) != null) {
                num = null;
                str = null;
                long j11 = xnVar.Q5;
                message = messageObject2.messageOwner;
                if (message == null) {
                }
                str2 = str;
                j10 = j11;
                z10 = false;
                if (j10 < 0) {
                }
                if (j10 != Long.MAX_VALUE) {
                }
                message2 = messageObject2.messageOwner;
                if (message2 != null) {
                }
                TLRPC.Message message5 = messageObject2.messageOwner;
                org.telegram.ui.Components.qc.a0(xnVar).Q(R.raw.error, 36, LocaleController.getString((message5 == null && (messageReplyHeader3 = message5.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
            }
            if (message4 != null && (messageReplyHeader = message4.reply_to) != null && messageReplyHeader.quote) {
                String str3 = messageReplyHeader.quote_text;
                r9 = (messageReplyHeader.flags & 1024) != 0 ? messageReplyHeader.quote_offset : -1;
                str = str3;
                num = null;
                bArr = null;
                long j112 = xnVar.Q5;
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
                            z10 = true;
                            chat = j10 < 0 ? xnVar.getMessagesController().getChat(Long.valueOf(-j10)) : null;
                            if (j10 != Long.MAX_VALUE) {
                                boolean z11 = z10;
                                if (j10 == xnVar.Q5 || chat == null || ChatObject.isPublic(chat) || (!chat.left && !chat.kicked)) {
                                    if (((j10 == xnVar.Q5 && (!ChatObject.isForum(xnVar.e) || !z11)) || j10 == Long.MAX_VALUE) && (xnVar.O3 != 3 || ((messageObject = messageObject2.replyMessageObject) != null && messageObject.getSavedDialogId() == xnVar.b()))) {
                                        int i11 = xnVar.O3;
                                        if (i11 == 2 || i11 == 1) {
                                            xnVar.S8.Q0(i10);
                                            xnVar.finishFragment();
                                            return;
                                        }
                                        if (bArr != null) {
                                            xnVar.O7 = bArr;
                                        } else if (num != null) {
                                            xnVar.N7 = num;
                                        } else {
                                            TLRPC.Message message6 = messageObject2.messageOwner;
                                            if (message6 != null && (messageReplyHeader5 = message6.reply_to) != null && messageReplyHeader5.quote) {
                                                xnVar.K7 = true;
                                                xnVar.M7 = messageReplyHeader5.quote_text;
                                                xnVar.P7 = r9;
                                                xnVar.J7 = true;
                                            }
                                        }
                                        dg.f3 f3Var = new dg.f3(this, i10, messageObject2, num, bArr, 14);
                                        if (!xnVar.x0.K) {
                                            f3Var.run();
                                            return;
                                        }
                                        xnVar.o3 = false;
                                        xnVar.lb(false, true, false);
                                        xnVar.Fc(xnVar.getMediaDataController().getMask(), xnVar.getMediaDataController().getSearchPosition(), xnVar.getMediaDataController().getSearchCount());
                                        AndroidUtilities.runOnUIThread(f3Var, 80L);
                                        return;
                                    }
                                    Integer num2 = num;
                                    byte[] bArr2 = bArr;
                                    if (LaunchActivity.D1 != null) {
                                        af.f fVar = xnVar.xb;
                                        if (fVar != null) {
                                            fVar.a(false);
                                            p2Var = null;
                                            xnVar.xb = null;
                                        } else {
                                            p2Var = null;
                                        }
                                        LaunchActivity launchActivity = LaunchActivity.D1;
                                        final k0 k0Var = new k0(this, messageObject2, t1Var);
                                        xnVar.xb = k0Var;
                                        int id2 = messageObject2.getId();
                                        ArrayList arrayList = launchActivity.a0;
                                        if (j10 < 0 && (chat2 = MessagesController.getInstance(launchActivity.L).getChat(Long.valueOf(-j10))) != null && ChatObject.isForum(chat2)) {
                                            k0Var.d();
                                            final int i12 = 0;
                                            launchActivity.k0(j10, Integer.valueOf(i10), str2, num2, bArr2, new Runnable() { // from class: org.telegram.ui.c90
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i13 = i12;
                                                    k0 k0Var2 = k0Var;
                                                    switch (i13) {
                                                        case 0:
                                                            Pattern pattern = LaunchActivity.y1;
                                                            k0Var2.c(false);
                                                            break;
                                                        default:
                                                            Pattern pattern2 = LaunchActivity.y1;
                                                            k0Var2.c(false);
                                                            break;
                                                    }
                                                }
                                            }, id2, r9);
                                            return;
                                        }
                                        String str4 = str2;
                                        int i13 = r9;
                                        k0Var.d();
                                        Bundle bundle = new Bundle();
                                        if (j10 >= 0) {
                                            bundle.putLong("user_id", j10);
                                        } else {
                                            long j12 = -j10;
                                            TLRPC.Chat chat3 = MessagesController.getInstance(launchActivity.L).getChat(Long.valueOf(j12));
                                            if (chat3 != null && chat3.forum) {
                                                final int i14 = 1;
                                                launchActivity.k0(j10, Integer.valueOf(i10), str4, num2, bArr2, new Runnable() { // from class: org.telegram.ui.c90
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i132 = i14;
                                                        k0 k0Var2 = k0Var;
                                                        switch (i132) {
                                                            case 0:
                                                                Pattern pattern = LaunchActivity.y1;
                                                                k0Var2.c(false);
                                                                break;
                                                            default:
                                                                Pattern pattern2 = LaunchActivity.y1;
                                                                k0Var2.c(false);
                                                                break;
                                                        }
                                                    }
                                                }, id2, i13);
                                                return;
                                            }
                                            bundle.putLong("chat_id", j12);
                                        }
                                        bundle.putInt("message_id", i10);
                                        org.telegram.ui.ActionBar.p2 p2Var2 = !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.p2) kh.a2.i(1, arrayList) : p2Var;
                                        if (p2Var2 == null || MessagesController.getInstance(launchActivity.L).checkCanOpenChat(bundle, p2Var2)) {
                                            AndroidUtilities.runOnUIThread(new b90(launchActivity, bundle, bArr2, i10, num2, str4, i13, j10, k0Var, p2Var2));
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
                                org.telegram.ui.Components.qc.a0(xnVar).Q(R.raw.error, 36, LocaleController.getString((message52 == null && (messageReplyHeader3 = message52.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
                            } else {
                                messageObject2.replyTextRevealed = true;
                                xnVar.qc(messageObject2, true);
                                return;
                            }
                        }
                        str2 = str;
                    }
                    z10 = false;
                    if (j10 < 0) {
                    }
                    if (j10 != Long.MAX_VALUE) {
                    }
                    message2 = messageObject2.messageOwner;
                    if (message2 != null) {
                    }
                    TLRPC.Message message522 = messageObject2.messageOwner;
                    org.telegram.ui.Components.qc.a0(xnVar).Q(R.raw.error, 36, LocaleController.getString((message522 == null && (messageReplyHeader3 = message522.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
                }
                str2 = str;
                j10 = j112;
                z10 = false;
                if (j10 < 0) {
                }
                if (j10 != Long.MAX_VALUE) {
                }
                message2 = messageObject2.messageOwner;
                if (message2 != null) {
                }
                TLRPC.Message message5222 = messageObject2.messageOwner;
                org.telegram.ui.Components.qc.a0(xnVar).Q(R.raw.error, 36, LocaleController.getString((message5222 == null && (messageReplyHeader3 = message5222.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
            }
            num = null;
        }
        bArr = null;
        str = null;
        long j1122 = xnVar.Q5;
        message = messageObject2.messageOwner;
        if (message == null) {
        }
        str2 = str;
        j10 = j1122;
        z10 = false;
        if (j10 < 0) {
        }
        if (j10 != Long.MAX_VALUE) {
        }
        message2 = messageObject2.messageOwner;
        if (message2 != null) {
        }
        TLRPC.Message message52222 = messageObject2.messageOwner;
        org.telegram.ui.Components.qc.a0(xnVar).Q(R.raw.error, 36, LocaleController.getString((message52222 == null && (messageReplyHeader3 = message52222.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
    }

    public final void f(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z4;
        String str;
        boolean z10;
        String str2;
        boolean z11;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var;
        TLRPC.User currentUser = t1Var.getCurrentUser();
        xn xnVar = this.a;
        xnVar.getUserConfig().getCurrentUser();
        if (!AndroidUtilities.isContextSafe(xnVar.getParentActivity()) || (chat = xnVar.e) == null || currentUser == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return;
        }
        boolean z12 = true;
        boolean z13 = false;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                z4 = false;
                z13 = true;
            } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                z4 = channelParticipant.promoted_by == xnVar.getUserConfig().getClientUserId();
            } else {
                z4 = false;
                z12 = false;
            }
            str = channelParticipant.rank;
        } else {
            if (tLObject instanceof TLRPC.TL_chatChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = ((TLRPC.TL_chatChannelParticipant) tLObject).channelParticipant;
                if (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator) {
                    z10 = false;
                    z13 = true;
                } else if (channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) {
                    z10 = channelParticipant2.promoted_by == xnVar.getUserConfig().getClientUserId();
                } else {
                    z10 = false;
                    z12 = false;
                }
                str2 = channelParticipant2.rank;
                z11 = z10;
                boolean z14 = z12;
                boolean z15 = z13;
                Activity parentActivity = xnVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                long j10 = -xnVar.e.id;
                f6Var = ((org.telegram.ui.ActionBar.p2) xnVar).resourceProvider;
                org.telegram.ui.Components.f01.b(parentActivity, i10, j10, currentUser, str2, z14, z15, z11, f6Var);
            }
            if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                if (ChatObject.isChannel(xnVar.e)) {
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                    xnVar.getMessagesController();
                    tL_channels_getParticipant.channel = MessagesController.getInputChannel(xnVar.e);
                    tL_channels_getParticipant.participant = xnVar.getMessagesController().getInputPeer(currentUser.id);
                    xnVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new org.telegram.messenger.a(), new dh.v(12, this, t1Var));
                    return;
                }
                return;
            }
            if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                z4 = false;
                z13 = true;
            } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                z4 = ((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == xnVar.getUserConfig().getClientUserId();
            } else {
                z4 = false;
                z12 = false;
            }
            str = ((TLRPC.ChatParticipant) tLObject).rank;
        }
        z11 = z4;
        str2 = str;
        boolean z142 = z12;
        boolean z152 = z13;
        Activity parentActivity2 = xnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
        long j102 = -xnVar.e.id;
        f6Var = ((org.telegram.ui.ActionBar.p2) xnVar).resourceProvider;
        org.telegram.ui.Components.f01.b(parentActivity2, i10, j102, currentUser, str2, z142, z152, z11, f6Var);
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
    /* JADX WARN: Removed duplicated region for block: B:209:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03c4  */
    @Override // org.telegram.ui.Cells.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f2(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        od1 od1Var;
        TLRPC.TodoItem todoItem2;
        TLRPC.TodoCompletion todoCompletion;
        od1 od1Var2;
        MessageObject messageObject;
        od1 od1Var3;
        int i10;
        MessageObject messageObject2;
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        xe xeVar;
        MessageObject messageObject3;
        boolean z13;
        ArrayList arrayList;
        ArrayList arrayList2;
        rd1 rd1Var;
        ArrayList arrayList3;
        xn xnVar;
        MessageObject messageObject4;
        int size;
        int i11;
        ViewGroup viewGroup;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        final xn xnVar2 = this.a;
        if (xnVar2.getParentActivity() == null || xnVar2.getParentActivity() == null) {
            return false;
        }
        ph.f3 f3Var = xnVar2.u1;
        if (f3Var != null && f3Var.S) {
            f3Var.e(true);
        }
        vl vlVar = xnVar2.y1;
        if (vlVar != null && vlVar.S) {
            vlVar.e(true);
        }
        MessageObject primaryMessageObject = t1Var.getPrimaryMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(primaryMessageObject);
        if (primaryMessageObject == null || !(media instanceof TLRPC.TL_messageMediaToDo)) {
            return false;
        }
        xnVar2.a5 = primaryMessageObject;
        xnVar2.b5 = null;
        final rd1 rd1Var2 = new rd1(xnVar2.getParentActivity(), xnVar2.getResourceProvider());
        final int i12 = todoItem.id;
        rd1Var2.H = t1Var;
        rd1Var2.L = i12;
        MessageObject messageObject5 = t1Var.getMessageObject();
        rd1Var2.D = messageObject5;
        rd1Var2.E = messageObject5 != null && messageObject5.isOutOwner();
        org.telegram.ui.Cells.t1 t1Var2 = rd1Var2.H;
        od1 od1Var4 = rd1Var2.c;
        if (t1Var2 != null) {
            rd1Var2.I = xnVar2.p9 - AndroidUtilities.dp(4.0f);
            rd1Var2.J = t1Var.n;
            if (t1Var.getParent() instanceof View) {
                View view = (View) t1Var.getParent();
                rd1Var2.I = view.getY() + rd1Var2.I;
                rd1Var2.J = view.getY() + rd1Var2.J;
            }
            int width = rd1Var2.H.getWidth();
            int height = rd1Var2.H.getHeight();
            rd1Var2.H.getHeight();
            od1Var = od1Var4;
            pd1 pd1Var = new pd1(rd1Var2, rd1Var2.getContext(), UserConfig.selectedAccount, rd1Var2.H.getResourcesProvider(), i12, width, height);
            rd1Var2.F = pd1Var;
            rd1Var2.H.h1(pd1Var);
            rd1Var2.F.i1(rd1Var2.H);
            rd1Var2.F.setDelegate(new qd1(rd1Var2));
            pd1 pd1Var2 = rd1Var2.F;
            MessageObject messageObject6 = rd1Var2.D;
            MessageObject.GroupedMessages currentMessagesGroup = rd1Var2.H.getCurrentMessagesGroup();
            org.telegram.ui.Cells.t1 t1Var3 = rd1Var2.H;
            pd1Var2.X3(messageObject6, currentMessagesGroup, t1Var3.C, t1Var3.B, t1Var3.D, false);
            od1Var.addView(rd1Var2.F, new FrameLayout.LayoutParams(rd1Var2.H.getWidth(), height, 51));
            qv0 qv0Var = new qv0(rd1Var2.getContext(), UserConfig.selectedAccount, rd1Var2.H.getResourcesProvider(), width, height, 1);
            rd1Var2.G = qv0Var;
            rd1Var2.H.j1(qv0Var);
            rd1Var2.H.h1(rd1Var2.G);
            rd1Var2.G.i1(rd1Var2.H);
            rd1Var2.G.setDelegate(new z9.d(17));
            qv0 qv0Var2 = rd1Var2.G;
            MessageObject messageObject7 = rd1Var2.D;
            MessageObject.GroupedMessages currentMessagesGroup2 = rd1Var2.H.getCurrentMessagesGroup();
            org.telegram.ui.Cells.t1 t1Var4 = rd1Var2.H;
            qv0Var2.X3(messageObject7, currentMessagesGroup2, t1Var4.C, t1Var4.B, t1Var4.D, false);
            od1Var.addView(rd1Var2.G, new FrameLayout.LayoutParams(rd1Var2.H.getWidth(), height, 51));
        } else {
            od1Var = od1Var4;
        }
        ek ekVar = rd1Var2.e;
        ekVar.bringToFront();
        od1 od1Var5 = rd1Var2.d;
        od1Var5.bringToFront();
        rd1Var2.h.bringToFront();
        ekVar.w(false);
        org.telegram.ui.ActionBar.f6 f6Var = rd1Var2.a;
        org.telegram.ui.Components.o70 F = org.telegram.ui.Components.o70.F(od1Var, f6Var, null);
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) MessageObject.getMedia(rd1Var2.D);
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
        if (!rd1Var2.D.canCompleteTodo()) {
            od1Var2 = od1Var5;
        } else if (todoCompletion != null) {
            od1Var2 = od1Var5;
            F.p(14, -1, LocaleController.formatTodoCompletedDate(todoCompletion.date));
            F.k();
            final int i15 = 1;
            F.c(R.drawable.msg_cancel, LocaleController.getString(R.string.TodoUncheck), new Runnable() { // from class: org.telegram.ui.jd1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            xn xnVar3 = xnVar2;
                            fv0 fv0Var = new fv0(xnVar3);
                            rd1 rd1Var3 = rd1Var2;
                            fv0Var.p0(MessageObject.getMedia(rd1Var3.D), false, i12);
                            fv0Var.b0 = new tl0(23, rd1Var3, xnVar3);
                            xnVar3.presentFragment(fv0Var);
                            rd1Var3.c(false);
                            break;
                        case 1:
                            boolean c3 = xnVar2.c();
                            rd1 rd1Var4 = rd1Var2;
                            if (c3) {
                                Toast.makeText(rd1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                pd1 pd1Var3 = rd1Var4.F;
                                pd1Var3.k4(pd1Var3.O2(i12), false);
                            }
                            rd1Var4.c(true);
                            break;
                        default:
                            boolean c10 = xnVar2.c();
                            rd1 rd1Var5 = rd1Var2;
                            if (c10) {
                                Toast.makeText(rd1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                pd1 pd1Var4 = rd1Var5.F;
                                pd1Var4.k4(pd1Var4.O2(i12), false);
                            }
                            rd1Var5.c(true);
                            break;
                    }
                }
            }, false);
        } else {
            od1Var2 = od1Var5;
            final int i16 = 2;
            F.c(R.drawable.msg_select, LocaleController.getString(R.string.TodoCheck), new Runnable() { // from class: org.telegram.ui.jd1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i16) {
                        case 0:
                            xn xnVar3 = xnVar2;
                            fv0 fv0Var = new fv0(xnVar3);
                            rd1 rd1Var3 = rd1Var2;
                            fv0Var.p0(MessageObject.getMedia(rd1Var3.D), false, i12);
                            fv0Var.b0 = new tl0(23, rd1Var3, xnVar3);
                            xnVar3.presentFragment(fv0Var);
                            rd1Var3.c(false);
                            break;
                        case 1:
                            boolean c3 = xnVar2.c();
                            rd1 rd1Var4 = rd1Var2;
                            if (c3) {
                                Toast.makeText(rd1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                pd1 pd1Var3 = rd1Var4.F;
                                pd1Var3.k4(pd1Var3.O2(i12), false);
                            }
                            rd1Var4.c(true);
                            break;
                        default:
                            boolean c10 = xnVar2.c();
                            rd1 rd1Var5 = rd1Var2;
                            if (c10) {
                                Toast.makeText(rd1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                pd1 pd1Var4 = rd1Var5.F;
                                pd1Var4.k4(pd1Var4.O2(i12), false);
                            }
                            rd1Var5.c(true);
                            break;
                    }
                }
            }, false);
        }
        if (todoItem2 != null) {
            F.c(R.drawable.menu_reply, LocaleController.getString(R.string.TodoItemQuote), new ed1(rd1Var2, xnVar2, todoItem2, 2), false);
            if (rd1Var2.D.getDialogId() < 0) {
                MessagesController messagesController = MessagesController.getInstance(rd1Var2.D.currentAccount);
                String publicUsername = DialogObject.getPublicUsername(messagesController.getUserOrChat(rd1Var2.D.getDialogId()));
                StringBuilder sb = new StringBuilder("https://");
                sb.append(messagesController.linkPrefix);
                sb.append("/");
                if (TextUtils.isEmpty(publicUsername)) {
                    StringBuilder sb2 = new StringBuilder("c/");
                    messageObject = primaryMessageObject;
                    od1Var3 = od1Var2;
                    sb2.append(-rd1Var2.D.getDialogId());
                    publicUsername = sb2.toString();
                } else {
                    messageObject = primaryMessageObject;
                    od1Var3 = od1Var2;
                }
                sb.append(publicUsername);
                sb.append("/");
                sb.append(rd1Var2.D.getId());
                sb.append("?task=");
                sb.append(todoItem2.id);
                F.c(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new l01(22, rd1Var2, sb.toString()), false);
            } else {
                messageObject = primaryMessageObject;
                od1Var3 = od1Var2;
            }
            F.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new l01(23, rd1Var2, todoItem2), false);
        } else {
            messageObject = primaryMessageObject;
            od1Var3 = od1Var2;
        }
        if (rd1Var2.D.canEditMessage(xnVar2.e)) {
            final int i17 = 0;
            F.c(R.drawable.msg_edit, LocaleController.getString(R.string.TodoEditItem), new Runnable() { // from class: org.telegram.ui.jd1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i17) {
                        case 0:
                            xn xnVar3 = xnVar2;
                            fv0 fv0Var = new fv0(xnVar3);
                            rd1 rd1Var3 = rd1Var2;
                            fv0Var.p0(MessageObject.getMedia(rd1Var3.D), false, i13);
                            fv0Var.b0 = new tl0(23, rd1Var3, xnVar3);
                            xnVar3.presentFragment(fv0Var);
                            rd1Var3.c(false);
                            break;
                        case 1:
                            boolean c3 = xnVar2.c();
                            rd1 rd1Var4 = rd1Var2;
                            if (c3) {
                                Toast.makeText(rd1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                pd1 pd1Var3 = rd1Var4.F;
                                pd1Var3.k4(pd1Var3.O2(i13), false);
                            }
                            rd1Var4.c(true);
                            break;
                        default:
                            boolean c10 = xnVar2.c();
                            rd1 rd1Var5 = rd1Var2;
                            if (c10) {
                                Toast.makeText(rd1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                pd1 pd1Var4 = rd1Var5.F;
                                pd1Var4.k4(pd1Var4.O2(i13), false);
                            }
                            rd1Var5.c(true);
                            break;
                    }
                }
            }, false);
            if (tL_messageMediaToDo.todo.list.size() > 1) {
                i10 = 51;
                F.c(R.drawable.msg_delete, LocaleController.getString(R.string.TodoDeleteItem), new ct(rd1Var2, tL_messageMediaToDo, i12, xnVar2, 10), false);
                F.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                qg.d j10 = rg.b.j(f6Var);
                ng.a aVar = rd1Var2.C;
                F.Q(aVar, j10, false);
                F.Y();
                ViewGroup viewGroup2 = F.A;
                rd1Var2.N = viewGroup2;
                viewGroup2.setPivotX(0.0f);
                rd1Var2.N.setPivotY(0.0f);
                od1Var3.addView(rd1Var2.N, k7.b6.e(-2, -2, i10));
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                xnVar2.n8(messageObject, arrayList4, arrayList5, arrayList6);
                xe xeVar2 = new xe(xnVar2, 7);
                messageObject2 = rd1Var2.D;
                List<TLRPC.TL_availableReaction> enabledReactionsList = xnVar2.getMediaDataController().getEnabledReactionsList();
                boolean z14 = xnVar2.v() && !xnVar2.c() && xnVar2.f == null && messageObject2.hasReactions() && !((ChatObject.isChannel(xnVar2.e) && !xnVar2.e.megagroup) || ChatObject.isMonoForum(xnVar2.e) || enabledReactionsList.isEmpty() || !messageObject2.messageOwner.reactions.can_see_list || messageObject2.isSecretMedia());
                if (messageObject2.isForwardedChannelPost()) {
                    z4 = z14;
                    if (!messageObject2.isSecretMedia()) {
                        if (xnVar2.O3 != 5) {
                            if (!xnVar2.v()) {
                                if (!xnVar2.c()) {
                                    if (messageObject2.isReactionsAvailable()) {
                                        TLRPC.ChatFull chatFull2 = xnVar2.W7;
                                        if (chatFull2 != null) {
                                            if (chatFull2.available_reactions instanceof TLRPC.TL_chatReactionsNone) {
                                            }
                                        }
                                        if (chatFull2 == null) {
                                        }
                                        if (xnVar2.f == null) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z10 = false;
                } else {
                    z4 = z14;
                    TLRPC.ChatFull chatFull3 = xnVar2.getMessagesController().getChatFull(-messageObject2.getFromChatId());
                    if (chatFull3 != null) {
                        if (!xnVar2.v()) {
                            if (xnVar2.O3 != 5) {
                                if (!xnVar2.c()) {
                                    if (messageObject2.isReactionsAvailable()) {
                                        if (chatFull3.available_reactions instanceof TLRPC.TL_chatReactionsNone) {
                                        }
                                    }
                                }
                            }
                        }
                        z10 = false;
                    }
                    z10 = true;
                }
                boolean z15 = z10;
                z11 = (!z4 || xnVar2.c() || xnVar2.e == null || !messageObject2.isOutOwner() || !messageObject2.isSent() || messageObject2.isEditing() || messageObject2.isSending() || messageObject2.isSendError() || messageObject2.isContentUnread() || messageObject2.isUnread() || ConnectionsManager.getInstance(xnVar2.getCurrentAccount()).getCurrentTime() - messageObject2.messageOwner.date >= xnVar2.getMessagesController().chatReadMarkExpirePeriod || (!ChatObject.isMegagroup(xnVar2.e) && ChatObject.isChannel(xnVar2.e)) || (chatFull = xnVar2.W7) == null || chatFull.participants_count > xnVar2.getMessagesController().chatReadMarkSizeThreshold || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || xnVar2.O3 == 3 || !messageObject2.canSetReaction() || ChatObject.isMonoForum(xnVar2.e)) ? false : true;
                if (xnVar2.e != null && !messageObject2.isOut() && ChatObject.isMonoForum(xnVar2.e) && ChatObject.canManageMonoForum(xnVar2.getCurrentAccount(), xnVar2.e)) {
                    int i18 = ((-xnVar2.e.linked_monoforum_id) > messageObject2.getFromChatId() ? 1 : ((-xnVar2.e.linked_monoforum_id) == messageObject2.getFromChatId() ? 0 : -1));
                }
                if (!z4 && xnVar2.e == null && xnVar2.h == null && (user = xnVar2.f) != null && !UserObject.isUserSelf(user) && !UserObject.isReplyUser(xnVar2.f) && !UserObject.isAnonymous(xnVar2.f)) {
                    user2 = xnVar2.f;
                    if (!user2.bot && !UserObject.isService(user2.id) && (((userFull = xnVar2.X7) == null || !userFull.read_dates_private) && !xnVar2.c() && messageObject2.isOutOwner() && messageObject2.isSent() && !messageObject2.isEditing() && !messageObject2.isSending() && !messageObject2.isSendError() && !messageObject2.isContentUnread() && !messageObject2.isUnread() && xnVar2.getConnectionsManager().getCurrentTime() - messageObject2.messageOwner.date < xnVar2.getMessagesController().pmReadDateExpirePeriod && !(messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                        z12 = true;
                        TLRPC.User user3 = xnVar2.f;
                        boolean z16 = ((user3 == null && (UserObject.isReplyUser(user3) || UserObject.isAnonymous(xnVar2.f))) || xnVar2.c() || !messageObject2.isEdited() || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                        org.telegram.ui.Components.o70 G = org.telegram.ui.Components.o70.G(rd1Var2.c, xnVar2.getResourceProvider(), null, !z4 || z11);
                        if (z11) {
                            xeVar = xeVar2;
                            messageObject3 = messageObject2;
                            z13 = z15;
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            rd1Var = rd1Var2;
                            arrayList3 = arrayList6;
                            xnVar = xnVar2;
                            if (z12) {
                                G.r(new org.telegram.ui.Components.ac0(rd1Var.getContext(), 0, messageObject3, new id1(rd1Var, 0), rd1Var.a), k7.b6.n(-1, 36));
                                G.k();
                            } else if (z16) {
                                messageObject4 = messageObject3;
                                G.r(new org.telegram.ui.Components.ac0(rd1Var.getContext(), 1, messageObject3, new id1(rd1Var, 2), rd1Var.a), k7.b6.n(-1, 36));
                                G.k();
                                i11 = 0;
                                for (size = arrayList.size(); i11 < size; size = size) {
                                    G.c(((Integer) arrayList.get(i11)).intValue(), (CharSequence) arrayList2.get(i11), new zt0(rd1Var, xeVar, ((Integer) arrayList3.get(i11)).intValue(), 7), false);
                                    i11++;
                                    arrayList3 = arrayList3;
                                }
                                G.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                                G.Q(aVar, rg.b.j(f6Var), false);
                                G.Y();
                                ViewGroup viewGroup3 = G.A;
                                rd1Var.P = viewGroup3;
                                viewGroup3.setPivotX(0.0f);
                                rd1Var.P.setPivotY(0.0f);
                                ViewGroup viewGroup4 = rd1Var.P;
                                FrameLayout.LayoutParams e = k7.b6.e(-2, -2, 51);
                                od1 od1Var6 = rd1Var.d;
                                od1Var6.addView(viewGroup4, e);
                                viewGroup = rd1Var.P;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new il0(rd1Var, 22));
                                    rd1Var.P.setOnTouchListener(new f0(rd1Var, 7));
                                }
                                if (z13) {
                                    xn xnVar3 = xnVar;
                                    org.telegram.ui.Components.pk0 pk0Var = new org.telegram.ui.Components.pk0((xnVar.getUserConfig().getClientUserId() > xnVar.a() ? 1 : (xnVar.getUserConfig().getClientUserId() == xnVar.a() ? 0 : -1)) == 0 ? 3 : 0, xnVar3.getCurrentAccount(), rd1Var.getContext(), xnVar3, rd1Var.a);
                                    pk0Var.a = true;
                                    float f10 = 22;
                                    pk0Var.setPadding(AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : 24), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 24 : 0), AndroidUtilities.dp(f10));
                                    pk0Var.setDelegate(new nd1(rd1Var, xnVar3, messageObject4, pk0Var));
                                    rd1Var.M = pk0Var;
                                    od1Var6.addView(pk0Var, k7.b6.e(-2, (int) ((pk0Var.getTopOffset() / AndroidUtilities.density) + 52.0f + f10), 51));
                                    pk0Var.p(messageObject4, xnVar3.W7, true);
                                    rd1Var.M.setTransitionProgress(1.0f);
                                }
                                rd1Var.e();
                                rd1Var.Z = new um(this, 5);
                                rd1Var.show();
                                return true;
                            }
                        } else {
                            wh0 wh0Var = new wh0(rd1Var2.getContext(), xnVar2.getCurrentAccount(), messageObject2, xnVar2.e);
                            FrameLayout frameLayout = new FrameLayout(rd1Var2.getContext());
                            frameLayout.addView(wh0Var, k7.b6.c(36.0f, -1));
                            org.telegram.ui.Components.o70 J = G.J();
                            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, rd1Var2.getContext(), rd1Var2.a, true, false);
                            g1Var.setItemHeight(44);
                            g1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                            g1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                            FrameLayout frameLayout2 = new FrameLayout(rd1Var2.getContext());
                            LinearLayout linearLayout = new LinearLayout(rd1Var2.getContext());
                            linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var));
                            linearLayout.setOrientation(1);
                            xnVar = xnVar2;
                            org.telegram.ui.Components.sl0 a2 = wh0Var.a();
                            frameLayout2.addView(g1Var);
                            linearLayout.addView(frameLayout2);
                            z13 = z15;
                            linearLayout.addView(new org.telegram.ui.ActionBar.m1(rd1Var2.getContext(), f6Var), k7.b6.n(-1, 8));
                            frameLayout2.setOnClickListener(new ld1(G));
                            messageObject3 = messageObject2;
                            xeVar = xeVar2;
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            md1 md1Var = new md1(rd1Var2, wh0Var, xnVar, a2, linearLayout, G, J);
                            G = G;
                            rd1Var = rd1Var2;
                            wh0Var.setOnClickListener(md1Var);
                            linearLayout.addView(a2, k7.b6.n(-1, -2));
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
                        G.Q(aVar, rg.b.j(f6Var), false);
                        G.Y();
                        ViewGroup viewGroup32 = G.A;
                        rd1Var.P = viewGroup32;
                        viewGroup32.setPivotX(0.0f);
                        rd1Var.P.setPivotY(0.0f);
                        ViewGroup viewGroup42 = rd1Var.P;
                        FrameLayout.LayoutParams e6 = k7.b6.e(-2, -2, 51);
                        od1 od1Var62 = rd1Var.d;
                        od1Var62.addView(viewGroup42, e6);
                        viewGroup = rd1Var.P;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z13) {
                        }
                        rd1Var.e();
                        rd1Var.Z = new um(this, 5);
                        rd1Var.show();
                        return true;
                    }
                }
                z12 = false;
                TLRPC.User user32 = xnVar2.f;
                if (user32 == null) {
                }
                org.telegram.ui.Components.o70 G2 = org.telegram.ui.Components.o70.G(rd1Var2.c, xnVar2.getResourceProvider(), null, !z4 || z11);
                if (z11) {
                }
                messageObject4 = messageObject3;
                i11 = 0;
                while (i11 < size) {
                }
                G2.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                G2.Q(aVar, rg.b.j(f6Var), false);
                G2.Y();
                ViewGroup viewGroup322 = G2.A;
                rd1Var.P = viewGroup322;
                viewGroup322.setPivotX(0.0f);
                rd1Var.P.setPivotY(0.0f);
                ViewGroup viewGroup422 = rd1Var.P;
                FrameLayout.LayoutParams e62 = k7.b6.e(-2, -2, 51);
                od1 od1Var622 = rd1Var.d;
                od1Var622.addView(viewGroup422, e62);
                viewGroup = rd1Var.P;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z13) {
                }
                rd1Var.e();
                rd1Var.Z = new um(this, 5);
                rd1Var.show();
                return true;
            }
        }
        i10 = 51;
        F.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
        qg.d j102 = rg.b.j(f6Var);
        ng.a aVar2 = rd1Var2.C;
        F.Q(aVar2, j102, false);
        F.Y();
        ViewGroup viewGroup22 = F.A;
        rd1Var2.N = viewGroup22;
        viewGroup22.setPivotX(0.0f);
        rd1Var2.N.setPivotY(0.0f);
        od1Var3.addView(rd1Var2.N, k7.b6.e(-2, -2, i10));
        ArrayList arrayList42 = new ArrayList();
        ArrayList arrayList52 = new ArrayList();
        ArrayList arrayList62 = new ArrayList();
        xnVar2.n8(messageObject, arrayList42, arrayList52, arrayList62);
        xe xeVar22 = new xe(xnVar2, 7);
        messageObject2 = rd1Var2.D;
        List<TLRPC.TL_availableReaction> enabledReactionsList2 = xnVar2.getMediaDataController().getEnabledReactionsList();
        if (xnVar2.v()) {
        }
        if (messageObject2.isForwardedChannelPost()) {
        }
        boolean z152 = z10;
        if (!z4) {
        }
        if (xnVar2.e != null) {
            int i182 = ((-xnVar2.e.linked_monoforum_id) > messageObject2.getFromChatId() ? 1 : ((-xnVar2.e.linked_monoforum_id) == messageObject2.getFromChatId() ? 0 : -1));
        }
        if (!z4) {
            user2 = xnVar2.f;
            if (!user2.bot) {
                z12 = true;
                TLRPC.User user322 = xnVar2.f;
                if (user322 == null) {
                }
                org.telegram.ui.Components.o70 G22 = org.telegram.ui.Components.o70.G(rd1Var2.c, xnVar2.getResourceProvider(), null, !z4 || z11);
                if (z11) {
                }
                messageObject4 = messageObject3;
                i11 = 0;
                while (i11 < size) {
                }
                G22.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                G22.Q(aVar2, rg.b.j(f6Var), false);
                G22.Y();
                ViewGroup viewGroup3222 = G22.A;
                rd1Var.P = viewGroup3222;
                viewGroup3222.setPivotX(0.0f);
                rd1Var.P.setPivotY(0.0f);
                ViewGroup viewGroup4222 = rd1Var.P;
                FrameLayout.LayoutParams e622 = k7.b6.e(-2, -2, 51);
                od1 od1Var6222 = rd1Var.d;
                od1Var6222.addView(viewGroup4222, e622);
                viewGroup = rd1Var.P;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z13) {
                }
                rd1Var.e();
                rd1Var.Z = new um(this, 5);
                rd1Var.show();
                return true;
            }
        }
        z12 = false;
        TLRPC.User user3222 = xnVar2.f;
        if (user3222 == null) {
        }
        org.telegram.ui.Components.o70 G222 = org.telegram.ui.Components.o70.G(rd1Var2.c, xnVar2.getResourceProvider(), null, !z4 || z11);
        if (z11) {
        }
        messageObject4 = messageObject3;
        i11 = 0;
        while (i11 < size) {
        }
        G222.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
        G222.Q(aVar2, rg.b.j(f6Var), false);
        G222.Y();
        ViewGroup viewGroup32222 = G222.A;
        rd1Var.P = viewGroup32222;
        viewGroup32222.setPivotX(0.0f);
        rd1Var.P.setPivotY(0.0f);
        ViewGroup viewGroup42222 = rd1Var.P;
        FrameLayout.LayoutParams e6222 = k7.b6.e(-2, -2, 51);
        od1 od1Var62222 = rd1Var.d;
        od1Var62222.addView(viewGroup42222, e6222);
        viewGroup = rd1Var.P;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
        }
        if (z13) {
        }
        rd1Var.e();
        rd1Var.Z = new um(this, 5);
        rd1Var.show();
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public final String g(org.telegram.ui.Cells.t1 t1Var) {
        xn xnVar;
        int i10;
        if (t1Var.getMessageObject() == null || (i10 = (xnVar = this.a).tb) == 0 || i10 != t1Var.getMessageObject().getId() || xnVar.ub != 3) {
            return null;
        }
        return xnVar.wb;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void g0(int i10) {
        int i11;
        SpannableStringBuilder replaceTags;
        int i12;
        int i13 = 3;
        int i14 = 2;
        int i15 = 1;
        xn xnVar = this.a;
        try {
            if (i10 == 0) {
                xnVar.h7();
                gl glVar = xnVar.w3;
                if (glVar == null) {
                    return;
                }
                glVar.l(0L, 84, null, new um(this, i15));
                xnVar.w3.performHapticFeedback(3, 2);
                return;
            }
            if (i10 == 1) {
                String formatDateTime = LocaleController.formatDateTime(xnVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                if (xnVar.getMessagesController().transcribeAudioTrialCooldownUntil > 0) {
                    i12 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeftUntil", org.telegram.ui.Components.d31.h(i12), formatDateTime));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeft", org.telegram.ui.Components.d31.h(i11), new Object[0]));
                }
                org.telegram.ui.Components.qc.a0(xnVar).G(R.raw.transcribe, 6, replaceTags).k(true);
                xnVar.fragmentView.performHapticFeedback(3, 2);
                return;
            }
            if (i10 == 2 || i10 == 3) {
                String formatDateTime2 = LocaleController.formatDateTime(xnVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(xnVar);
                int i16 = R.raw.transcribe;
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialEnd", xnVar.getMessagesController().transcribeAudioTrialWeeklyNumber, new Object[0]))).append((CharSequence) " ").append(i10 == 2 ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TranscriptionTrialEndBuy), new um(this, i14)) : xnVar.getMessagesController().transcribeAudioTrialCooldownUntil <= 0 ? "" : AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TranscriptionTrialEndWaitOrBuy, formatDateTime2), new um(this, i13)));
                a02.getClass();
                org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(a02.W(), a02.c);
                qbVar.c(i16, 36, 36, new String[0]);
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
                qbVar.b.setText(append);
                qbVar.b.setSingleLine(false);
                qbVar.b.setMaxLines(6);
                a02.b(qbVar, 7000).k(true);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
        } catch (Exception unused) {
        }
    }

    public final void h() {
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.D1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        boolean isHuaweiStoreApp = BuildVars.isHuaweiStoreApp();
        xn xnVar = this.a;
        if (isHuaweiStoreApp) {
            af.g.s(xnVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            af.g.s(xnVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean h0() {
        return this.a.O3 == 0;
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
        int a2 = dh.l.a(messageObject);
        boolean a10 = k7.w8.a(a2, 7);
        xn xnVar = this.a;
        if (a10) {
            org.telegram.ui.Components.qc.a0(xnVar).Q(R.raw.e_hand_2, 36, dh.l.b(messageObject, a2)).j();
            return;
        }
        if (i10 < 0 && !arrayList.isEmpty()) {
            xnVar.getSendMessagesHelper().sendVote(messageObject, arrayList, null);
            t1Var.S0(true);
            return;
        }
        if (xnVar.getParentActivity() == null) {
            return;
        }
        if (xnVar.k2 == null) {
            org.telegram.ui.Components.k40 k40Var = new org.telegram.ui.Components.k40(5, xnVar.getParentActivity(), xnVar.ba, false);
            xnVar.k2 = k40Var;
            k40Var.setAlpha(0.0f);
            xnVar.k2.setVisibility(4);
            int indexOfChild = xnVar.U0.indexOfChild(xnVar.P);
            if (indexOfChild == -1) {
                return;
            } else {
                xnVar.U0.addView(xnVar.k2, indexOfChild + 1, k7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            }
        }
        if (!arrayList.isEmpty() || i10 >= 0) {
            i13 = i12;
            i14 = i11;
        } else {
            ArrayList<org.telegram.ui.Cells.r1> pollButtons = t1Var.getPollButtons();
            int size = pollButtons.size();
            int i16 = 0;
            float f10 = 0.0f;
            while (true) {
                if (i16 >= size) {
                    i13 = i12;
                    i15 = i11;
                    break;
                }
                org.telegram.ui.Cells.r1 r1Var = pollButtons.get(i16);
                float y10 = ((t1Var.getY() + r1Var.b) - AndroidUtilities.dp(4.0f)) - xnVar.p9;
                xnVar.n2 = AndroidUtilities.dp(13.3f) + r1Var.a;
                int C = b.C(6.0f, r1Var.b, i12);
                xnVar.o2 = C;
                if (y10 > 0.0f) {
                    i15 = xnVar.n2;
                    i13 = C;
                    f10 = 0.0f;
                    break;
                }
                i16++;
                f10 = y10;
            }
            if (f10 != 0.0f) {
                xnVar.u0.v0(0, (int) f10, null);
                xnVar.m2 = t1Var;
                return;
            }
            i14 = i15;
        }
        xnVar.k2.e(t1Var, Integer.valueOf(i10), i14, i13, true);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void i0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
        this.a.I7(t1Var, true, false, f10, f11, false, false, false);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void i2(org.telegram.ui.Cells.t1 t1Var) {
        TLRPC.Chat chat;
        TLRPC.User currentUser = t1Var.getCurrentUser();
        xn xnVar = this.a;
        if (!AndroidUtilities.isContextSafe(xnVar.getParentActivity()) || (chat = xnVar.e) == null || currentUser == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return;
        }
        f(t1Var, xnVar.getMessagesController().getParticipant(xnVar.e.id, currentUser.id));
    }

    @Override // org.telegram.ui.Cells.k1
    public final void j() {
        h();
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean j1(MessageObject messageObject) {
        jm jmVar;
        long dialogId = messageObject.getDialogId();
        xn xnVar = this.a;
        return (dialogId == UserObject.REPLY_BOT || ((jmVar = xnVar.x0) != null && jmVar.K)) && xnVar.O3 != 7;
    }

    public final void k(org.telegram.ui.Cells.t1 t1Var, boolean z4, boolean z10, boolean z11) {
        MessageObject primaryMessageObject;
        int i10;
        int i11;
        tj tjVar;
        if (t1Var == null || (primaryMessageObject = t1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.forceUpdate = true;
        xn xnVar = this.a;
        qj qjVar = xnVar.u0;
        if (qjVar != null && (tjVar = xnVar.w0) != null && tjVar.y < 0) {
            for (int childCount = qjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = xnVar.u0.getChildAt(childCount);
                xnVar.u0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.t1)) {
                        if (childAt instanceof org.telegram.ui.Cells.v0) {
                            i11 = xnVar.L8(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = xnVar.L8(childAt);
                            break;
                        }
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        if (z4 && i10 >= 0 && t1Var.getCurrentMessagesGroup() == null) {
            if (z11) {
                tj tjVar2 = xnVar.w0;
                xnVar.u0.getClass();
                tjVar2.i1(RecyclerView.R(t1Var), t1Var.getTop() - ((int) xnVar.p9), false);
            } else {
                xnVar.w0.h1(i10, i11);
            }
        }
        xnVar.K0 = z10;
        xnVar.rc(primaryMessageObject, false);
        xnVar.K0 = false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final int k0(org.telegram.ui.Cells.t1 t1Var) {
        dh.f fVar;
        xn xnVar = this.a;
        if (!xnVar.tc.f || (fVar = xnVar.zc) == null || fVar.n != t1Var || fVar.a.getWidth() <= 0) {
            return 0;
        }
        return xnVar.zc.a.getHeight();
    }

    @Override // org.telegram.ui.Cells.k1
    public final void k2(org.telegram.ui.Cells.t1 t1Var, long j10) {
        Bundle g10 = kh.a2.g(j10, "user_id");
        org.telegram.ui.ActionBar.p2 p2Var = this.a;
        if (p2Var.getMessagesController().checkCanOpenChat(g10, p2Var, t1Var.getMessageObject())) {
            p2Var.presentFragment(new xn(g10));
        }
    }

    public final boolean l() {
        xn xnVar = this.a;
        if (UserObject.isUserSelf(xnVar.f)) {
            return true;
        }
        TLRPC.Chat chat = xnVar.e;
        if (chat != null) {
            return !ChatObject.isChannel(chat) || xnVar.e.megagroup;
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void l0(org.telegram.ui.Cells.t1 t1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        xn xnVar = this.a;
        if (xnVar.getParentActivity() == null) {
            return;
        }
        if (xnVar.U9 == null) {
            hh.k kVar = new hh.k(xnVar.getParentActivity());
            xnVar.U9 = kVar;
            xnVar.U0.addView(kVar, k7.b6.e(-1, -1, 48));
        }
        hh.k kVar2 = xnVar.U9;
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
        String b10 = hh.k.b(t1Var);
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
        hh.j jVar = new hh.j(kVar2, t1Var, arrayList4, new gf.c(12, kVar2, b10));
        jVar.setBounds(0, 0, kVar2.getMeasuredWidth(), kVar2.getMeasuredHeight());
        jVar.setCallback(kVar2);
        if (hashMap.containsKey(b10)) {
            return;
        }
        hashMap.put(b10, jVar);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void l1() {
        xn xnVar = this.a;
        xnVar.Q7();
        UndoView undoView = xnVar.v3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, xnVar.Q5, null);
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
            P1(t1Var, webPage, webPage.url, messageMedia.safe);
            return;
        }
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        xn xnVar = this.a;
        if (geoPoint != null) {
            if (AndroidUtilities.isMapsInstalled(xnVar)) {
                gn gnVar = new gn(3);
                f6Var2 = ((org.telegram.ui.ActionBar.p2) xnVar).resourceProvider;
                gnVar.setResourceProvider(f6Var2);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = xnVar.getMessagesController().getPeer(xnVar.a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                tL_messageMediaGeo.geo = messageMedia.geo;
                String str = messageMedia.address;
                if (str == null) {
                    str = (pollAnswer == null || (tL_textWithEntities = pollAnswer.text) == null) ? "" : tL_textWithEntities.text;
                }
                tL_messageMediaGeo.address = str;
                tL_message.media = tL_messageMediaGeo;
                gnVar.L0 = false;
                gnVar.u0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                xnVar.presentFragment(gnVar);
                return;
            }
            return;
        }
        if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
            pt.q().w(xnVar.getParentActivity());
            pt.q().v(new hn(this, tL_messageMediaPoll, pollAnswer, t1Var));
            pt q10 = pt.q();
            TLRPC.Document document4 = messageMedia.document;
            int i18 = MessageObject.isAnimatedEmoji(document4) ? 2 : 0;
            MessageObject messageObject2 = t1Var.getMessageObject();
            f6Var = ((org.telegram.ui.ActionBar.p2) xnVar).resourceProvider;
            q10.t(document4, null, "", null, null, i18, false, messageObject2, f6Var, 200);
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
            TLRPC.TL_message C7 = xn.C7(message);
            C7.media = messageMedia;
            C7.attachPath = dh.i.c(message, i10);
            ArrayList<MessageObject> arrayList = new ArrayList<>();
            i17 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
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
            i15 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
            TLRPC.Document document6 = messageMedia.document;
            dh.a aVar = new dh.a(i15, messageObject, document6, dh.i.c(messageObject.messageOwner, i10));
            if (aVar.g) {
                FileLoader.getInstance(i15).cancelLoadFile(document6);
                aVar.a();
                MessageObject messageObject4 = t1Var.v7;
                if (messageObject4 == null || !messageObject4.isPoll()) {
                    return;
                }
                dh.j jVar = t1Var.Z5;
                if (jVar != null) {
                    jVar.e();
                }
                dh.j jVar2 = t1Var.Y5;
                if (jVar2 != null) {
                    jVar2.e();
                    return;
                }
                return;
            }
            if (!aVar.f) {
                FileLoader.getInstance(i15).loadFile(document6, messageObject, 2, 0);
                aVar.a();
                MessageObject messageObject5 = t1Var.v7;
                if (messageObject5 == null || !messageObject5.isPoll()) {
                    return;
                }
                dh.j jVar3 = t1Var.Z5;
                if (jVar3 != null) {
                    jVar3.e();
                }
                dh.j jVar4 = t1Var.Y5;
                if (jVar4 != null) {
                    jVar4.e();
                    return;
                }
                return;
            }
            TLRPC.Message message2 = messageObject.messageOwner;
            TLRPC.TL_message C72 = xn.C7(message2);
            C72.media = messageMedia;
            C72.attachPath = dh.i.c(message2, i10);
            i16 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
            in inVar = new in(i16, C72, false, true);
            if (MessageObject.canPreviewDocument(messageMedia.document)) {
                PhotoViewer.t1().K2(null, xnVar, xnVar.ba);
                PhotoViewer t12 = PhotoViewer.t1();
                int i19 = inVar.type;
                t12.c2(inVar, xnVar, i19 != 0 ? xnVar.Q5 : 0L, i19 != 0 ? xnVar.I6 : 0L, i19 != 0 ? xnVar.b() : 0L, xnVar.Ca);
                return;
            }
            try {
                AndroidUtilities.openForView(inVar, xnVar.getParentActivity(), xnVar.ba, false);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                xnVar.z6(inVar);
                return;
            }
        }
        TLRPC.Message message3 = messageObject.messageOwner;
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
        if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || MessageObject.isVideoDocument(document3))) {
            i11 = messageMedia3 == messageMedia ? arrayList3.size() : -1;
            TLRPC.TL_message C73 = xn.C7(message3);
            C73.media = messageMedia3;
            C73.attachPath = dh.i.c(message3, -2);
            i14 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
            arrayList3.add(new zm(i14, C73, false, true));
            arrayList2.add(-2);
        } else {
            i11 = -1;
        }
        if (messageObject.expandedExplanation && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || MessageObject.isVideoDocument(document2))) {
            if (messageMedia2 == messageMedia) {
                i11 = arrayList3.size();
            }
            TLRPC.TL_message C74 = xn.C7(message3);
            C74.media = messageMedia2;
            C74.attachPath = dh.i.c(message3, -3);
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            C74.message = pollResults2.solution;
            C74.entities = pollResults2.solution_entities;
            i13 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
            arrayList3.add(new an(i13, C74, false, true));
            arrayList2.add(-3);
        }
        mf.d.b(tL_messageMediaPoll.poll, xnVar.getUserConfig().getClientUserId());
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
                TLRPC.TL_message C75 = xn.C7(message3);
                C75.media = messageMedia4;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                C75.message = tL_textWithEntities2.text;
                C75.entities = tL_textWithEntities2.entities;
                C75.attachPath = dh.i.c(message3, pollAnswer2.unshuffled_index);
                i12 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                arrayList3.add(new bn(i12, C75, false, true));
                arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
            }
        }
        if (i11 <= -1 || arrayList3.isEmpty()) {
            return;
        }
        messageObject.pollMediaMapping = arrayList2;
        PhotoViewer.t1().K2(null, xnVar, xnVar.ba);
        PhotoViewer.t1().a2(arrayList3, i11, xnVar.a(), 0L, 0L, xnVar.Da);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void n(org.telegram.ui.Cells.t1 t1Var) {
        if (t1Var.getMessageObject().isImportedForward()) {
            l1();
            return;
        }
        xn xnVar = this.a;
        if (xnVar.i3 || xnVar.u0 == null || xnVar.getParentActivity() == null || xnVar.fragmentView == null) {
            return;
        }
        if (xnVar.r2 == null) {
            pm pmVar = xnVar.U0;
            int indexOfChild = pmVar.indexOfChild(xnVar.P);
            if (indexOfChild == -1) {
                return;
            }
            org.telegram.ui.Components.k40 k40Var = new org.telegram.ui.Components.k40(1, xnVar.getParentActivity(), xnVar.ba, false);
            xnVar.r2 = k40Var;
            pmVar.addView(k40Var, indexOfChild + 1, k7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            xnVar.r2.setAlpha(0.0f);
            xnVar.r2.setVisibility(4);
        }
        xnVar.r2.e(t1Var, null, 0, 0, true);
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean n0() {
        boolean z4;
        xn xnVar = this.a;
        if (xnVar.A9()) {
            return false;
        }
        z4 = ((org.telegram.ui.ActionBar.p2) xnVar).inPreviewMode;
        return !z4;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void o() {
        this.a.U0.getClass();
    }

    @Override // org.telegram.ui.Cells.k1
    public final void o1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        xn xnVar = this.a;
        if (xnVar.z9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) mf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        if (xnVar.getParentActivity() != null) {
            if (xnVar.L0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || mf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || mf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || mf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || mf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || mf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || mf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || mf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || mf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                jk jkVar = xnVar.V;
                MessageObject messageObject = t1Var.getMessageObject();
                MessageObject messageObject2 = t1Var.getMessageObject();
                vi viVar = null;
                String str = tL_inlineButtonTypeUrl != null ? tL_inlineButtonTypeUrl.url : null;
                af.f fVar = xnVar.xb;
                if (fVar != null) {
                    fVar.a(true);
                    xnVar.xb = null;
                }
                if (str == null || t1Var.getMessageObject() == null) {
                    xnVar.xb = null;
                } else {
                    vi viVar2 = new vi(xnVar, t1Var.getMessageObject().getId(), str, t1Var, 1);
                    xnVar.xb = viVar2;
                    viVar = viVar2;
                }
                jkVar.c0(keyboardButtonProto, messageObject, messageObject2, viVar);
            }
        }
    }

    public final void p(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, boolean z4) {
        xn xnVar = this.a;
        TLRPC.Chat chat2 = xnVar.e;
        if (chat2 != null && chat.id == chat2.id) {
            lj ljVar = xnVar.X0;
            if (ljVar != null && i10 == 0) {
                ljVar.e(false, false);
                return;
            } else {
                if (t1Var.getMessageObject() != null) {
                    xnVar.j(i10, t1Var.getMessageObject().getId(), true, 0, false, 0);
                    return;
                }
                return;
            }
        }
        if (chat2 == null || chat.id != chat2.id || xnVar.F9()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            wi wiVar = null;
            if (z4) {
                af.f fVar = xnVar.xb;
                if (fVar != null) {
                    fVar.a(true);
                    xnVar.xb = null;
                }
                if (t1Var.getMessageObject() == null) {
                    xnVar.xb = null;
                } else {
                    wi wiVar2 = new wi(xnVar, t1Var.getMessageObject().getId(), t1Var, 0);
                    xnVar.xb = wiVar2;
                    wiVar = wiVar2;
                }
            }
            if (xnVar.getMessagesController().checkCanOpenChat(bundle, xnVar, t1Var.getMessageObject(), wiVar)) {
                xn xnVar2 = new xn(bundle);
                if (wiVar == null || i10 == 0) {
                    xnVar.presentFragment(xnVar2);
                } else {
                    AndroidUtilities.runOnUIThread(new dg.f3(this, wiVar, chat, i10, xnVar2, 13), 5000L);
                    wiVar.d();
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void p0(String str) {
        xn xnVar = this.a;
        ok okVar = xnVar.L0;
        if (okVar == null || okVar.getVisibility() != 0) {
            nk nkVar = xnVar.O;
            if ((nkVar == null || nkVar.getVisibility() != 0) && xnVar.V != null && str != null && str.length() > 0) {
                xnVar.V.setFieldText("@" + str + " ");
                xnVar.V.H0();
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean p2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        MessageObject messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (t1Var == null || pageBlock == null) {
            return false;
        }
        xn xnVar = this.a;
        if (xnVar.getParentActivity() == null || (messageObject = t1Var.getMessageObject()) == null || (message = messageObject.messageOwner) == null || messageObject.richLayout == null || (richMessage = message.rich_message) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        messageObject.richLayout.collectMediaBlocks(arrayList);
        int indexOf = arrayList.indexOf(pageBlock);
        if (indexOf < 0) {
            return false;
        }
        PhotoViewer t12 = PhotoViewer.t1();
        t12.K2(null, xnVar, null);
        return t12.e2(null, null, null, null, null, null, null, indexOf, new sm(xnVar, arrayList), null, 0L, 0L, 0L, true, new rm(richMessage, arrayList, messageObject), null);
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
        boolean z4;
        int i11;
        TLRPC.Message message2;
        int i12;
        TLRPC.Peer peer;
        MessageObject.GroupedMessages groupedMessages;
        int i13;
        xn xnVar = this.a;
        if (xnVar.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.w21 w21Var = xnVar.O1;
        if (w21Var != null && xnVar.a4 == 0 && (t1Var.Q7 || t1Var.R7)) {
            w21Var.m(t1Var.getMessageObject().getTopicId(), true);
            return;
        }
        if (xnVar.getMessagesController().isFrozen()) {
            i13 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
            c.b(i13);
            return;
        }
        jk jkVar = xnVar.V;
        if (jkVar != null) {
            jkVar.P();
        }
        MessageObject messageObject = t1Var.getMessageObject();
        int i14 = xnVar.O3;
        if (i14 == 2) {
            xnVar.S8.Q0(messageObject.getId());
            xnVar.finishFragment();
            return;
        }
        if (i14 == 3 || ((i14 == 7 && xnVar.L3 == 2) || !((!UserObject.isReplyUser(xnVar.f) && !UserObject.isUserSelf(xnVar.f)) || (messageFwdHeader = messageObject.messageOwner.fwd_from) == null || messageFwdHeader.saved_from_peer == null))) {
            if (UserObject.isReplyUser(xnVar.f) && (messageReplyHeader = (message = messageObject.messageOwner).reply_to) != null && (i10 = messageReplyHeader.reply_to_top_id) != 0) {
                xnVar.aa(messageReplyHeader.reply_to_peer_id.channel_id, null, i10, 0L, -1, message.fwd_from.saved_from_msg_id, messageObject);
                return;
            } else if (xnVar.O3 == 7 && xnVar.L3 == 2) {
                xnVar.fa(messageObject);
                return;
            } else {
                xnVar.ga(messageObject);
                return;
            }
        }
        ArrayList<MessageObject> arrayList = (messageObject.getGroupId() == 0 || (groupedMessages = (MessageObject.GroupedMessages) xnVar.u6.f(messageObject.getGroupId())) == null) ? null : groupedMessages.messages;
        if (arrayList == null) {
            arrayList = org.telegram.messenger.y3.m(messageObject);
        }
        if (xnVar.getMessagesController().storiesEnabled() && !messageObject.isSponsored() && (((message2 = messageObject.messageOwner) == null || !message2.noforwards) && (i12 = messageObject.type) != 17 && i12 != 12)) {
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
                z4 = true;
                xnVar.showDialog(new dn(this, xnVar.getParentActivity(), xnVar, arrayList, ChatObject.isChannel(xnVar.e), z4, xnVar.ba, z4, messageObject));
                Activity parentActivity = xnVar.getParentActivity();
                i11 = ((org.telegram.ui.ActionBar.p2) xnVar).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
                xnVar.fragmentView.requestLayout();
            }
        }
        z4 = false;
        xnVar.showDialog(new dn(this, xnVar.getParentActivity(), xnVar, arrayList, ChatObject.isChannel(xnVar.e), z4, xnVar.ba, z4, messageObject));
        Activity parentActivity2 = xnVar.getParentActivity();
        i11 = ((org.telegram.ui.ActionBar.p2) xnVar).classGuid;
        AndroidUtilities.setAdjustResizeToNothing(parentActivity2, i11);
        xnVar.fragmentView.requestLayout();
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean q0(org.telegram.ui.Components.u5 u5Var) {
        TLRPC.InputStickerSet inputStickerSet;
        int i10;
        xn xnVar = this.a;
        if (xnVar.getMessagesController().premiumFeaturesBlocked() || u5Var == null || u5Var.standard) {
            return false;
        }
        long documentId = u5Var.getDocumentId();
        TLRPC.Document document = u5Var.document;
        if (document == null) {
            i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
            document = org.telegram.ui.Components.l5.f(i10, documentId);
        }
        if (document == null || (inputStickerSet = MessageObject.getInputStickerSet(document)) == null) {
            return false;
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, true);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(inputStickerSet);
        org.telegram.ui.Components.mv mvVar = new org.telegram.ui.Components.mv(xnVar, xnVar.getParentActivity(), xnVar.ba, arrayList);
        org.telegram.ui.Components.cv cvVar = mvVar.f;
        cvVar.getClass();
        ImageReceiver imageReceiver = new ImageReceiver(cvVar);
        cvVar.v = imageReceiver;
        if (cvVar.d) {
            imageReceiver.onAttachedToWindow();
        }
        cvVar.w = true;
        cvVar.x.d(1.0f, true);
        cvVar.v.setImage(ImageLocation.getForDocument(document), "140_140", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "140_140", DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.m6, 0.2f, true), 0L, null, null, 0);
        cvVar.v.setLayerNum(7);
        cvVar.v.setAllowStartLottieAnimation(true);
        cvVar.v.setAllowStartAnimation(true);
        cvVar.v.setAutoRepeat(1);
        cvVar.v.setAllowDecodeSingleFrame(true);
        cvVar.v.setParentView(cvVar);
        mvVar.setCalcMandatoryInsets(xnVar.x9());
        xnVar.showDialog(mvVar);
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void q2(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject primaryMessageObject = t1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.a.rc(primaryMessageObject, false);
    }

    public final void r(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            org.telegram.ui.ActionBar.p2 p2Var = this.a;
            if (p2Var.getMessagesController().checkCanOpenChat(bundle, p2Var, t1Var.getMessageObject())) {
                p2Var.presentFragment(new xn(bundle));
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void r1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
        if (t1Var == null || document == null) {
            return;
        }
        xn xnVar = this.a;
        if (xnVar.getParentLayout() == null || !a0(t1Var)) {
            return;
        }
        org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(xnVar, t1Var);
        H.c(R.drawable.msg_download, LocaleController.getString(R.string.SaveToDownloads), new s1(this, t1Var, document, 24), false);
        H.t = false;
        H.Z();
    }

    @Override // org.telegram.ui.Cells.k1
    public final void s() {
        this.a.Yb();
    }

    @Override // org.telegram.ui.Cells.k1
    public final void s0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
        xn xnVar = this.a;
        xnVar.I7(t1Var, false, false, f10, f11, true, false, false);
        xnVar.u0.getClass();
        xn.c2(xnVar, RecyclerView.R(t1Var));
    }

    @Override // org.telegram.ui.Cells.k1
    public final void t(org.telegram.ui.Cells.t1 t1Var) {
        int i10;
        int i11;
        tj tjVar;
        MessageObject primaryMessageObject = t1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        primaryMessageObject.factCheckExpanded = !primaryMessageObject.factCheckExpanded;
        primaryMessageObject.forceUpdate = true;
        xn xnVar = this.a;
        qj qjVar = xnVar.u0;
        if (qjVar != null && (tjVar = xnVar.w0) != null && tjVar.y < 0) {
            for (int childCount = qjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = xnVar.u0.getChildAt(childCount);
                xnVar.u0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.t1)) {
                        if (childAt instanceof org.telegram.ui.Cells.v0) {
                            i11 = xnVar.L8(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = xnVar.L8(childAt);
                            break;
                        }
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        xnVar.rc(primaryMessageObject, false);
        ph.f3 f3Var = xnVar.x1;
        if (f3Var != null) {
            f3Var.e(true);
        }
        if (i10 < 0 || t1Var.getCurrentMessagesGroup() != null) {
            return;
        }
        xnVar.w0.h1(i10, i11);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void t2() {
        this.a.r9();
    }

    @Override // org.telegram.ui.Cells.k1
    public final void u(org.telegram.ui.Cells.t1 t1Var) {
        long j10;
        int i10;
        MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
        MessageObject messageObject = (currentMessagesGroup == null || currentMessagesGroup.messages.isEmpty()) ? t1Var.getMessageObject() : currentMessagesGroup.messages.get(0);
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
        xn xnVar = this.a;
        xnVar.aa(xnVar.e.id, messageObject, messageObject.getId(), j11, i10, 0, null);
    }

    public final void v(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            bundle.putBoolean("expandPhoto", false);
            this.a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void v2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
        this.a.W7(t1Var, reactionCount, z4, f10, f11);
    }

    @Override // org.telegram.ui.Cells.k1
    public final String w(long j10) {
        TLRPC.Peer peer;
        String adminRank;
        xn xnVar = this.a;
        if (UserObject.isBotForum(xnVar.f)) {
            return null;
        }
        TLRPC.Chat chat = xnVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat) && (adminRank = xnVar.getMessagesController().getAdminRank(xnVar.e.id, j10)) != null) {
            return adminRank;
        }
        TLRPC.TL_forumTopic tL_forumTopic = xnVar.Z3;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || !(peer.user_id == j10 || peer.channel_id == j10 || peer.chat_id == j10)) {
            return null;
        }
        return LocaleController.getString(R.string.TopicCreator);
    }

    public final void x(TLRPC.User user, boolean z4) {
        int i10;
        if (user == null || user.id == UserObject.VERIFY) {
            return;
        }
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        int i11 = 0;
        if (userProfilePhoto == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
            z4 = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putBoolean("expandPhoto", z4);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        xn xnVar = this.a;
        TLRPC.User user2 = xnVar.f;
        if (user2 != null && user2.id == user.id) {
            i11 = 1;
        }
        profileActivity.N4(i11);
        Activity parentActivity = xnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.p2) xnVar).classGuid;
        AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
        xnVar.presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void x1(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
        hh.j jVar;
        hh.k kVar = this.a.U9;
        if (kVar == null || (jVar = (hh.j) kVar.a.get(hh.k.b(t1Var))) == null) {
            return;
        }
        hh.d[] dVarArr = jVar.w;
        RectF rectF = jVar.r;
        if (jVar.J) {
            float f12 = (f10 - rectF.left) + jVar.R;
            float f13 = (f11 - rectF.top) + jVar.S;
            int i10 = hh.i.a;
            int b10 = (((float) (-AndroidUtilities.dp((float) 37))) >= f13 || f13 >= rectF.height()) ? -1 : k7.n.b((int) Math.floor((f12 - (AndroidUtilities.dp(9) - (AndroidUtilities.dp(11) / 2.0f))) / AndroidUtilities.dp(hh.i.a + 11)), 0, dVarArr.length - 1);
            if (jVar.O == b10) {
                return;
            }
            jVar.a.performHapticFeedback(3, 1);
            jVar.O = b10;
            int i11 = 0;
            while (i11 < dVarArr.length) {
                hh.d dVar = dVarArr[i11];
                boolean z4 = b10 == i11;
                if (dVar.p != z4) {
                    ValueAnimator valueAnimator = dVar.n;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    dVar.p = z4;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(dVar.o, z4 ? 1.0f : 0.0f);
                    dVar.n = ofFloat;
                    ofFloat.setDuration(180L);
                    dVar.n.addUpdateListener(dVar);
                    dVar.n.setInterpolator(hh.h.a);
                    dVar.n.start();
                }
                hh.d dVar2 = dVarArr[i11];
                boolean z10 = b10 == i11 || b10 == -1;
                if (dVar2.m != z10) {
                    ValueAnimator valueAnimator2 = dVar2.k;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    dVar2.m = z10;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(dVar2.l, z10 ? 1.0f : 0.0f);
                    dVar2.k = ofFloat2;
                    ofFloat2.setDuration(180L);
                    dVar2.k.addUpdateListener(dVar2);
                    dVar2.k.setInterpolator(hh.h.a);
                    dVar2.k.start();
                }
                i11++;
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void y(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject == null || messageObject.type != 27) {
            return;
        }
        messageObject.toggleChannelRecommendations();
        messageObject.forceUpdate = true;
        t1Var.t2();
        t1Var.requestLayout();
        this.a.x0.R(messageObject, false, false);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void y0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f10, float f11) {
        org.telegram.ui.ActionBar.k kVar;
        xn xnVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
        boolean z4 = true;
        if (kVar.s() || xnVar.A9()) {
            xn.b2(xnVar, t1Var, true, f10, f11);
            return;
        }
        if (t1Var.getMessageObject() != null && t1Var.getMessageObject().isSponsored()) {
            R0(10, t1Var);
            return;
        }
        if (!ChatObject.isForum(xnVar.e) && !xnVar.F9()) {
            z4 = false;
        }
        x(user, z4);
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean y2(int i10) {
        boolean z4;
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        if (i10 != 16 && i10 != R.id.acc_action_small_button && i10 != R.id.acc_action_msg_options) {
            return false;
        }
        xn xnVar = this.a;
        z4 = ((org.telegram.ui.ActionBar.p2) xnVar).inPreviewMode;
        if (!z4 || !xnVar.G9) {
            return !d();
        }
        e5Var = ((org.telegram.ui.ActionBar.p2) xnVar).parentLayout;
        if (e5Var != null) {
            e5Var2 = ((org.telegram.ui.ActionBar.p2) xnVar).parentLayout;
            ((ActionBarLayout) e5Var2).r();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:286:0x0b1b, code lost:
    
        if (r3.exists() != false) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0bde, code lost:
    
        if (r3.startsWith("text/x-web-markdown") == false) goto L328;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x088f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0910  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0962  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0c24 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:337:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Cells.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11, boolean z4) {
        int i10;
        int i11;
        boolean z10;
        xn xnVar;
        boolean z11;
        File file;
        TLRPC.Chat chat;
        ju0 E;
        ju0 ju0Var;
        re reVar;
        int i12;
        String str;
        Activity activity;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        int i13;
        MessageObject messageObject = t1Var.getMessageObject();
        int i14 = messageObject.type;
        xn xnVar2 = this.a;
        if (i14 == 23) {
            TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
            TL_stories.StoryItem storyItem = messageMedia2.storyItem;
            if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                return;
            }
            storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia2.peer);
            storyItem.messageId = messageObject.getId();
            storyItem.messageType = 2;
            nh.m7.b(storyItem, xnVar2.f);
            xnVar2.getOrCreateStoryViewer().G(xnVar2.getParentActivity(), messageObject.messageOwner.media.storyItem, nh.c7.a(xnVar2.u0));
            return;
        }
        int i15 = 1;
        if (messageObject.isVideo()) {
            i13 = ((org.telegram.ui.ActionBar.p2) xnVar2).currentAccount;
            if (DownloadController.getInstance(i13).canDownloadMedia(messageObject.messageOwner) == 1) {
                messageObject.putInDownloadsStore = true;
            }
        } else {
            messageObject.putInDownloadsStore = true;
        }
        if (messageObject.isSendError()) {
            xnVar2.I7(t1Var, false, false, f10, f11, true, false, false);
            return;
        }
        if (messageObject.isSending()) {
            return;
        }
        int i16 = 0;
        if (z4 && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && !TextUtils.isEmpty(webPage.url)) {
            String str2 = messageObject.messageOwner.media.webpage.url;
            AndroidUtilities.getHostAuthority(str2);
            if (xnVar2.ea(str2, t1Var, null, messageObject.getId(), 2)) {
                return;
            }
            af.f fVar = xnVar2.xb;
            if (fVar != null) {
                fVar.a(true);
            }
            xnVar2.xb = t1Var.getMessageObject() != null ? new cn(this, t1Var, i16) : null;
            af.g.r(xnVar2.getParentActivity(), Uri.parse(str2), true, false, false, xnVar2.xb, null, false, true, false);
            return;
        }
        int i17 = 4;
        if (messageObject.isDice()) {
            vm vmVar = new vm(this, messageObject, i16);
            if (messageObject.isStakeableDice()) {
                xnVar2.getMessagesController().loadStakeDiceInfo(new a0(this, messageObject, vmVar, i17));
                return;
            } else {
                vmVar.run();
                return;
            }
        }
        if ((messageObject.isAnimatedEmoji() && (!messageObject.isAnimatedAnimatedEmoji() || (xnVar2.ua.e.containsKey(bz.q(MessageObject.findAnimatedEmojiEmoticon(messageObject.getDocument()))) && xnVar2.f != null))) || messageObject.isPremiumSticker()) {
            xnVar2.Na(t1Var);
            xnVar2.ua.l(t1Var, xnVar2, true);
            xnVar2.u0.I0(false);
            return;
        }
        if (messageObject.needDrawBluredPreview()) {
            re fb2 = xnVar2.fb(messageObject, false);
            i5.v O4 = xn.O4(xnVar2, messageObject);
            t1Var.invalidate();
            final SecretMediaViewer f12 = SecretMediaViewer.f();
            final Activity parentActivity = xnVar2.getParentActivity();
            int i18 = UserConfig.selectedAccount;
            f12.a = i18;
            ImageReceiver imageReceiver = f12.h;
            imageReceiver.setCurrentAccount(i18);
            int i19 = 7;
            if (f12.b != parentActivity) {
                f12.b = parentActivity;
                f12.d1 = new org.telegram.ui.Components.vm0(parentActivity, null);
                l0 l0Var = new l0(f12, parentActivity, 21);
                f12.d = l0Var;
                l0Var.setBackgroundDrawable(f12.i0);
                f12.d.setFocusable(true);
                f12.d.setFocusableInTouchMode(true);
                f12.d.setClipChildren(false);
                f12.d.setClipToPadding(false);
                f12.e = new ah.d(f12, parentActivity);
                View view = new View(parentActivity);
                f12.f = view;
                view.setBackgroundColor(2130706432);
                f12.e.addView(f12.f, k7.b6.e(-1, -2, 80));
                f12.e.setFocusable(false);
                f12.d.addView(f12.e);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f12.e.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                layoutParams.gravity = 51;
                f12.e.setLayoutParams(layoutParams);
                f12.e.setFitsSystemWindows(true);
                f12.e.setOnApplyWindowInsetsListener(new c41(f12, 0));
                f12.e.setSystemUiVisibility(1792);
                GestureDetector gestureDetector = new GestureDetector(f12.e.getContext(), f12);
                f12.I0 = gestureDetector;
                gestureDetector.setOnDoubleTapListener(f12);
                eg.l1 l1Var = new eg.l1(f12, parentActivity, i19);
                f12.C = l1Var;
                l1Var.setTitleColor(-1);
                f12.C.setSubtitleColor(-1);
                f12.C.setBackgroundColor(2130706432);
                f12.C.setOccupyStatusBar(true);
                f12.C.B(1090519039, false);
                f12.C.C(-1, false);
                f12.C.setBackButtonImage(R.drawable.ic_ab_back);
                f12.C.setTitleRightMargin(AndroidUtilities.dp(70.0f));
                f12.e.addView(f12.C, k7.b6.c(-2.0f, -1));
                f12.C.setActionBarMenuOnItemClick(new jl0(f12, 15));
                ph.f3 f3Var = new ph.f3(parentActivity, 1);
                f12.r = f3Var;
                f3Var.m(1.0f, -26.0f);
                f12.r.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                f12.e.addView(f12.r, k7.b6.d(-1, 80.0f, 53, 0.0f, 48.0f, 0.0f, 0.0f));
                i41 i41Var = new i41(f12, parentActivity);
                f12.n = i41Var;
                f12.e.addView(i41Var, k7.b6.d(119, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
                ov0 ov0Var = new ov0(f12, i15);
                f12.R = new j41(f12, parentActivity);
                View view2 = new View(parentActivity);
                f12.Q = view2;
                view2.setBackgroundColor(2130706432);
                f12.R.addView(f12.Q, k7.b6.e(-1, -1, 119));
                org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(f12.e.getContext());
                f12.P = k5Var;
                k5Var.setTextColor(-1);
                f12.P.setGravity(53);
                f12.P.setTextSize(14);
                f12.P.setImportantForAccessibility(2);
                f12.R.addView(f12.P, k7.b6.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
                gw0 gw0Var = new gw0(f12, parentActivity, 3);
                f12.O = gw0Var;
                org.telegram.ui.Components.k71 k71Var = new org.telegram.ui.Components.k71(gw0Var);
                f12.N = k71Var;
                k71Var.z = AndroidUtilities.dp(2.0f);
                org.telegram.ui.Components.k71 k71Var2 = f12.N;
                k71Var2.k = 872415231;
                k71Var2.l = 872415231;
                k71Var2.m = -1;
                k71Var2.n = -1;
                k71Var2.A = 1509949439;
                k71Var2.j = ov0Var;
                f12.R.addView(f12.O);
                f12.e.addView(f12.R, k7.b6.e(-1, 48, 80));
                as0 as0Var = new as0(null, new nh.b());
                f12.V = as0Var;
                as0Var.k0 = true;
                as0Var.i0 = false;
                wt0 wt0Var = new wt0(f12.e.getContext());
                f12.W = wt0Var;
                wt0Var.setFactory(new ViewSwitcher.ViewFactory() { // from class: org.telegram.ui.d41
                    @Override // android.widget.ViewSwitcher.ViewFactory
                    public final View makeView() {
                        SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
                        return new vt0(parentActivity, secretMediaViewer.X, secretMediaViewer.V, new d5(secretMediaViewer, 22), new fg0(secretMediaViewer, 2));
                    }
                });
                f12.W.setVisibility(4);
                if (!f12.t1) {
                    f12.t1 = true;
                    f12.W.setLayerType(2, null);
                    f12.W.getCurrentView().setLayerType(2, null);
                    f12.W.getNextView().setLayerType(2, null);
                }
                ImageView imageView = new ImageView(parentActivity);
                f12.S = imageView;
                imageView.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(64.0f), 1711276032));
                org.telegram.ui.Components.mg0 mg0Var = new org.telegram.ui.Components.mg0(28);
                f12.T = mg0Var;
                mg0Var.setCallback(f12.S);
                f12.S.setImageDrawable(f12.T);
                f12.S.setScaleType(ImageView.ScaleType.CENTER);
                f12.S.setScaleX(0.6f);
                f12.S.setScaleY(0.6f);
                f12.S.setAlpha(0.0f);
                f12.S.setPivotX(AndroidUtilities.dp(32.0f));
                f12.S.setPivotY(AndroidUtilities.dp(32.0f));
                f12.e.addView(f12.S, k7.b6.e(64, 64, 17));
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
                org.telegram.ui.Cells.y9 o10 = f12.V.o(f12.d.getContext());
                if (o10 != null) {
                    AndroidUtilities.removeFromParent(o10);
                    f12.e.addView(o10);
                }
                f12.V.T(f12.e);
                f12.V.j0 = true;
            }
            SecretMediaViewer f13 = SecretMediaViewer.f();
            nl nlVar = xnVar2.Ca;
            SecretMediaViewer.PhotoBackgroundDrawable photoBackgroundDrawable = f13.i0;
            ImageReceiver imageReceiver2 = f13.h;
            if (f13.b == null || !messageObject.needDrawBluredPreview() || nlVar == null || (E = nlVar.E(messageObject, null, 0, true, false)) == null) {
                return;
            }
            f13.n1 = messageObject.messageOwner.ttl == Integer.MAX_VALUE;
            f13.m1 = O4;
            f13.K = nlVar;
            f13.H = System.currentTimeMillis();
            f13.I = 0L;
            f13.h0 = true;
            f13.g0 = true;
            f13.m0 = false;
            o4 o4Var = f13.w;
            if (o4Var != null) {
                o4Var.setVisibility(4);
            }
            f13.i();
            f13.K0 = 0.0f;
            f13.L0 = 1.0f;
            f13.M0 = 0.0f;
            f13.N0 = 0.0f;
            f13.O0 = 0.0f;
            f13.P0 = 0.0f;
            f13.Q0 = 0.0f;
            f13.R0 = 0.0f;
            f13.W0 = false;
            f13.X0 = false;
            f13.Y0 = false;
            f13.Z0 = false;
            f13.a1 = true;
            f13.n(f13.v0);
            photoBackgroundDrawable.setAlpha(0);
            f13.e.setAlpha(1.0f);
            f13.e.setVisibility(0);
            f13.n.setAlpha(1.0f);
            f13.G = false;
            f13.E = false;
            f13.F = false;
            f13.J = true;
            imageReceiver2.setManualAlphaAnimator(false);
            f13.L = 0;
            f13.M = 0;
            RectF rectF = new RectF(E.a.getDrawRegion());
            rectF.left = Math.max(rectF.left, E.a.getImageX());
            rectF.top = Math.max(rectF.top, E.a.getImageY());
            rectF.right = Math.min(rectF.right, E.a.getImageX2());
            rectF.bottom = Math.min(rectF.bottom, E.a.getImageY2());
            float width = rectF.width();
            float height = rectF.height();
            Point point = AndroidUtilities.displaySize;
            f13.v0 = Math.max(width / point.x, height / (point.y + AndroidUtilities.statusBarHeight));
            int[] iArr = E.h;
            if (iArr != null) {
                f13.E0 = new int[iArr.length];
                int i20 = 0;
                while (true) {
                    int[] iArr2 = E.h;
                    if (i20 >= iArr2.length) {
                        break;
                    }
                    f13.E0[i20] = iArr2[i20];
                    i20++;
                }
            } else {
                f13.E0 = null;
            }
            float f14 = E.b;
            float f15 = rectF.left;
            f13.t0 = ((width / 2.0f) + (f14 + f15)) - (r6 / 2);
            f13.u0 = ((height / 2.0f) + (E.c + rectF.top)) - (r5 / 2);
            f13.s0 = Math.abs(f15 - E.a.getImageX());
            int abs = (int) Math.abs(rectF.top - E.a.getImageY());
            E.d.getLocationInWindow(new int[2]);
            float f16 = (r5[1] - (E.c + rectF.top)) + E.j;
            f13.o0 = f16;
            float f17 = abs;
            f13.o0 = Math.max(0.0f, Math.max(f16, f17));
            float height2 = (((E.c + rectF.top) + ((int) height)) - (E.d.getHeight() + r5[1])) + E.i;
            f13.p0 = height2;
            f13.p0 = Math.max(0.0f, Math.max(height2, f17));
            f13.q0 = 0.0f;
            f13.q0 = Math.max(0.0f, Math.max(0.0f, f17));
            f13.r0 = 0.0f;
            f13.r0 = Math.max(0.0f, Math.max(0.0f, f17));
            f13.G0 = System.currentTimeMillis();
            f13.w0 = 0.0f;
            f13.x0 = 0.0f;
            f13.A0 = 0.0f;
            f13.C0 = 0.0f;
            f13.D0 = 0.0f;
            f13.z0 = 0.0f;
            f13.B0 = 0.0f;
            f13.y0 = 1.0f;
            f13.F0 = true;
            f13.b1 = true;
            lf.s0 s0Var = f13.i1;
            if (s0Var != null) {
                s0Var.destroy();
                f13.i1 = null;
            }
            LaunchActivity launchActivity = LaunchActivity.D1;
            f13.i1 = launchActivity != null ? new lf.s0(launchActivity, true) : null;
            NotificationCenter.getInstance(f13.a).addObserver(f13, NotificationCenter.messagesDeleted);
            NotificationCenter.getInstance(f13.a).addObserver(f13, NotificationCenter.updateMessageMedia);
            NotificationCenter.getInstance(f13.a).addObserver(f13, NotificationCenter.didCreatedNewDeleteTask);
            f13.v = MessageObject.getPeerId(messageObject.messageOwner.peer_id);
            f13.e0 = messageObject;
            TLRPC.Document document = messageObject.getDocument();
            ImageReceiver.BitmapHolder bitmapHolder = f13.f0;
            if (bitmapHolder != null) {
                bitmapHolder.release();
                f13.f0 = null;
            }
            f13.f0 = E.a.getThumbBitmapSafe();
            f13.R.setVisibility(8);
            if (document != null) {
                int i21 = 0;
                while (true) {
                    if (i21 >= document.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i21);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) documentAttribute;
                        f13.L = tL_documentAttributeVideo.w;
                        f13.M = tL_documentAttributeVideo.h;
                        break;
                    }
                    i21++;
                }
                if (MessageObject.isGifDocument(document)) {
                    f13.C.setTitle(LocaleController.getString(R.string.DisappearingGif));
                    String str3 = messageObject.messageOwner.attachPath;
                    ImageLocation forDocument = (str3 == null || !messageObject.attachPathExists) ? ImageLocation.getForDocument(document) : ImageLocation.getForPath(str3);
                    i12 = -1;
                    ju0Var = E;
                    reVar = fb2;
                    imageReceiver2.setImage(forDocument, (String) null, f13.f0 != null ? new BitmapDrawable(f13.f0.bitmap) : null, -1L, (String) null, messageObject, 1);
                } else {
                    ju0Var = E;
                    reVar = fb2;
                    i12 = -1;
                    f13.Y = 1;
                    f13.C.setTitle(LocaleController.getString(R.string.DisappearingVideo));
                    File file2 = new File(messageObject.messageOwner.attachPath);
                    if (file2.exists()) {
                        f13.h(file2);
                    } else {
                        File pathToMessage = FileLoader.getInstance(f13.a).getPathToMessage(messageObject.messageOwner);
                        File file3 = new File(pathToMessage.getAbsolutePath() + ".enc");
                        if (file3.exists()) {
                            pathToMessage = file3;
                        }
                        f13.h(pathToMessage);
                    }
                    f13.G = true;
                    f13.R.setVisibility(0);
                    imageReceiver2.setImage((ImageLocation) null, (String) null, f13.f0 != null ? new BitmapDrawable(f13.f0.bitmap) : null, -1L, (String) null, messageObject, 2);
                }
            } else {
                ju0Var = E;
                reVar = fb2;
                i12 = -1;
                f13.C.setTitle(LocaleController.getString(R.string.DisappearingPhoto));
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
                imageReceiver2.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), (String) null, f13.f0 != null ? new BitmapDrawable(f13.f0.bitmap) : null, -1L, (String) null, messageObject, 2);
                if (closestPhotoSizeWithSize != null) {
                    f13.L = closestPhotoSizeWithSize.w;
                    f13.M = closestPhotoSizeWithSize.h;
                }
            }
            f13.j(messageObject, "", false);
            f13.j(messageObject, messageObject.caption, true);
            f13.m(true, false);
            f13.k(false, false);
            f13.T.a(true, true);
            if (f13.n1) {
                i41 i41Var2 = f13.n;
                i41Var2.e = true;
                TextPaint textPaint = i41Var2.r;
                textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
                textPaint.setColor(i12);
                StaticLayout staticLayout = new StaticLayout("1", textPaint, 999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                i41Var2.s = staticLayout;
                i41Var2.v = staticLayout.getLineCount() > 0 ? i41Var2.s.getLineWidth(0) : 0.0f;
                i41Var2.w = i41Var2.s.getHeight();
                i41Var2.invalidate();
                f13.n.setOnClickListener(new i31(f13, 4));
            } else {
                f13.n.setOnClickListener(null);
            }
            try {
                if (f13.d.getParent() != null) {
                    str = "window";
                    try {
                        ((WindowManager) f13.b.getSystemService(str)).removeView(f13.d);
                    } catch (Exception e) {
                        e = e;
                        FileLog.e(e);
                        ((WindowManager) f13.b.getSystemService(str)).addView(f13.d, f13.c);
                        f13.n.invalidate();
                        f13.s = true;
                        Window window = f13.b.getWindow();
                        f13.l1 = AndroidUtilities.getLightNavigationBar(window);
                        AndroidUtilities.setLightNavigationBar(f13.b, false);
                        AndroidUtilities.setLightNavigationBar((View) f13.d, false);
                        activity = f13.b;
                        if (activity instanceof LaunchActivity) {
                        }
                        AnimatorSet animatorSet = new AnimatorSet();
                        f13.H0 = animatorSet;
                        eg.l1 l1Var2 = f13.C;
                        Property property = View.ALPHA;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(l1Var2, (Property<eg.l1, Float>) property, 0.0f, 1.0f);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(f13.X, (Property<gt0, Float>) property, 0.0f, 1.0f);
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(f13.r, (Property<ph.f3, Float>) property, 0.0f, 1.0f);
                        ObjectAnimator ofInt = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.n6.d, 0, 255);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(f13, f13.s1, 0.0f, 1.0f);
                        j41 j41Var = f13.R;
                        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofInt, ofFloat4, ObjectAnimator.ofFloat(j41Var, j41Var.n, 1.0f), ObjectAnimator.ofFloat(f13.R, (Property<j41, Float>) property, !f13.G ? 1.0f : 0.0f));
                        f13.j0 = 3;
                        f13.l0 = new hf0(f13, reVar, messageObject, 26);
                        f13.H0.setDuration(250L);
                        f13.H0.addListener(new g41(f13, 0));
                        f13.k0 = System.currentTimeMillis();
                        if (SharedConfig.getDevicePerformanceClass() == 0) {
                        }
                        f13.H0.setInterpolator(new DecelerateInterpolator());
                        photoBackgroundDrawable.b = 0;
                        photoBackgroundDrawable.a = new l01(9, f13, ju0Var);
                        f13.H0.start();
                        return;
                    }
                } else {
                    str = "window";
                }
            } catch (Exception e6) {
                e = e6;
                str = "window";
            }
            ((WindowManager) f13.b.getSystemService(str)).addView(f13.d, f13.c);
            f13.n.invalidate();
            f13.s = true;
            Window window2 = f13.b.getWindow();
            f13.l1 = AndroidUtilities.getLightNavigationBar(window2);
            AndroidUtilities.setLightNavigationBar(f13.b, false);
            AndroidUtilities.setLightNavigationBar((View) f13.d, false);
            activity = f13.b;
            if (activity instanceof LaunchActivity) {
                f13.k1 = window2.getNavigationBarColor();
                AndroidUtilities.setNavigationBarColor(f13.b, -16777216);
            } else {
                f13.k1 = Build.VERSION.SDK_INT >= 26 ? ((LaunchActivity) activity).getWindow().getNavigationBarColor() : 0;
                ((LaunchActivity) f13.b).y(-16777216);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            f13.H0 = animatorSet2;
            eg.l1 l1Var22 = f13.C;
            Property property2 = View.ALPHA;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(l1Var22, (Property<eg.l1, Float>) property2, 0.0f, 1.0f);
            ObjectAnimator ofFloat22 = ObjectAnimator.ofFloat(f13.X, (Property<gt0, Float>) property2, 0.0f, 1.0f);
            ObjectAnimator ofFloat32 = ObjectAnimator.ofFloat(f13.r, (Property<ph.f3, Float>) property2, 0.0f, 1.0f);
            ObjectAnimator ofInt2 = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.n6.d, 0, 255);
            ObjectAnimator ofFloat42 = ObjectAnimator.ofFloat(f13, f13.s1, 0.0f, 1.0f);
            j41 j41Var2 = f13.R;
            animatorSet2.playTogether(ofFloat5, ofFloat22, ofFloat32, ofInt2, ofFloat42, ObjectAnimator.ofFloat(j41Var2, j41Var2.n, 1.0f), ObjectAnimator.ofFloat(f13.R, (Property<j41, Float>) property2, !f13.G ? 1.0f : 0.0f));
            f13.j0 = 3;
            f13.l0 = new hf0(f13, reVar, messageObject, 26);
            f13.H0.setDuration(250L);
            f13.H0.addListener(new g41(f13, 0));
            f13.k0 = System.currentTimeMillis();
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                f13.e.setLayerType(2, null);
            }
            f13.H0.setInterpolator(new DecelerateInterpolator());
            photoBackgroundDrawable.b = 0;
            photoBackgroundDrawable.a = new l01(9, f13, ju0Var);
            f13.H0.start();
            return;
        }
        if (MessageObject.isAnimatedEmoji(messageObject.getDocument()) && MessageObject.getInputStickerSet(messageObject.getDocument()) != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(MessageObject.getInputStickerSet(messageObject.getDocument()));
            org.telegram.ui.Components.mv mvVar = new org.telegram.ui.Components.mv(xnVar2, xnVar2.getParentActivity(), xnVar2.ba, arrayList);
            mvVar.setCalcMandatoryInsets(xnVar2.x9());
            xnVar2.showDialog(mvVar);
            return;
        }
        if (messageObject.getInputStickerSet() != null) {
            org.telegram.ui.Components.xx0 xx0Var = new org.telegram.ui.Components.xx0(xnVar2.getParentActivity(), xnVar2, messageObject.getInputStickerSet(), null, (xnVar2.L0.getVisibility() == 0 || !((chat = xnVar2.e) == null || ChatObject.canSendStickers(chat))) ? null : xnVar2.V, xnVar2.ba);
            xx0Var.setCalcMandatoryInsets(xnVar2.x9());
            xnVar2.showDialog(xx0Var);
            return;
        }
        xn xnVar3 = xnVar2;
        if (messageObject.isVideo() || (i10 = messageObject.type) == 1 || ((i10 == 0 && !messageObject.isWebpageDocument()) || messageObject.isGif())) {
            if (messageObject.isSponsored()) {
                if (messageObject.isGif() || messageObject.isPhoto()) {
                    int i22 = 1;
                    xnVar3.J9(messageObject, true, false);
                    if (messageObject.sponsoredUrl != null) {
                        af.f fVar2 = xnVar3.xb;
                        if (fVar2 != null) {
                            fVar2.a(true);
                        }
                        xnVar3.xb = t1Var.getMessageObject() == null ? null : new cn(this, t1Var, i22);
                        af.g.r(xnVar3.getParentActivity(), Uri.parse(messageObject.sponsoredUrl), true, false, false, xnVar3.xb, null, false, xnVar3.getMessagesController().sponsoredLinksInappAllow, false);
                        return;
                    }
                    return;
                }
                if (messageObject.isVideo()) {
                    xnVar3.J9(messageObject, true, false);
                }
            }
            if (messageObject.getDuration() > 0.0d && messageObject.getVideoStartsTimestamp() > 0 && !messageObject.openedInViewer) {
                messageObject.forceSeekTo = (float) (messageObject.getVideoStartsTimestamp() / messageObject.getDuration());
            }
            xnVar3.ha(t1Var, messageObject);
            return;
        }
        int i23 = messageObject.type;
        if (i23 == 3) {
            xnVar3.fb(messageObject, true);
            try {
                String str4 = messageObject.messageOwner.attachPath;
                File file4 = (str4 == null || str4.length() == 0) ? null : new File(messageObject.messageOwner.attachPath);
                if (file4 == null || !file4.exists()) {
                    file4 = xnVar3.getFileLoader().getPathToMessage(messageObject.messageOwner);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setFlags(1);
                    intent.setDataAndType(FileProvider.d(xnVar3.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", file4), "video/mp4");
                } else {
                    intent.setDataAndType(Uri.fromFile(file4), "video/mp4");
                }
                xnVar3.getParentActivity().startActivityForResult(intent, 500);
                return;
            } catch (Exception e10) {
                FileLog.e(e10);
                xnVar3.z6(messageObject);
                return;
            }
        }
        if (i23 == 4) {
            if (AndroidUtilities.isMapsInstalled(xnVar3)) {
                if (!messageObject.isLiveLocation()) {
                    ad0 ad0Var = new ad0(xnVar3.h == null ? 3 : 0);
                    ad0Var.C0 = xnVar3;
                    ad0Var.u0(messageObject);
                    xnVar3.presentFragment(ad0Var);
                    return;
                }
                TLRPC.Chat chat2 = xnVar3.e;
                ad0 ad0Var2 = new ad0((chat2 == null || ChatObject.canSendMessages(chat2) || xnVar3.e.megagroup) ? 2 : 6);
                ad0Var2.C0 = xnVar3;
                ad0Var2.u0(messageObject);
                xnVar3.presentFragment(ad0Var2);
                return;
            }
            return;
        }
        if (i23 != 9 && i23 != 0) {
            return;
        }
        if (messageObject.getDocumentName().toLowerCase().endsWith("attheme")) {
            String str5 = messageObject.messageOwner.attachPath;
            if (str5 != null && str5.length() != 0) {
                file = new File(messageObject.messageOwner.attachPath);
            }
            file = null;
            if (file == null) {
                File pathToMessage2 = xnVar3.getFileLoader().getPathToMessage(messageObject.messageOwner);
                if (pathToMessage2.exists()) {
                    file = pathToMessage2;
                }
            }
            org.telegram.ui.ActionBar.i6 u10 = org.telegram.ui.ActionBar.j6.u(file, messageObject.getDocumentName(), null, true);
            if (u10 != null) {
                xnVar3.presentFragment(new cd1(u10));
                return;
            }
            xnVar3.u4 = -1;
        }
        if (messageObject.canPreviewDocument()) {
            PhotoViewer.t1().K2(null, xnVar3, xnVar3.ba);
            PhotoViewer t12 = PhotoViewer.t1();
            int i24 = messageObject.type;
            i11 = 3;
            t12.c2(messageObject, xnVar3, i24 != 0 ? xnVar3.Q5 : 0L, i24 != 0 ? xnVar3.I6 : 0L, i24 != 0 ? xnVar3.b() : 0L, xnVar3.Ca);
            messageObject = messageObject;
            xnVar3 = xnVar3;
            z10 = true;
        } else {
            i11 = 3;
            z10 = false;
        }
        Pattern pattern = org.telegram.ui.Components.s90.a;
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
            z11 = z10;
            xnVar = xnVar3;
            if (z11) {
                try {
                    AndroidUtilities.openForView(messageObject, xnVar.getParentActivity(), xnVar.ba, false);
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    xnVar.z6(messageObject);
                    return;
                }
            }
            return;
        }
        if (xnVar3.getParentActivity() == null) {
            xnVar = xnVar3;
        } else {
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(xnVar3.getParentActivity(), i11, xnVar3.ba);
            d2Var.setCanceledOnTouchOutside(false);
            boolean[] zArr = {false};
            d2Var.setOnCancelListener(new zg(0, zArr));
            d2Var.q(150L);
            xn xnVar4 = xnVar3;
            androidx.car.app.utils.c cVar = new androidx.car.app.utils.c(xnVar4, messageObject, d2Var, zArr, 29);
            xnVar = xnVar4;
            new Thread(cVar).start();
        }
        z11 = true;
        if (z11) {
        }
    }
}
