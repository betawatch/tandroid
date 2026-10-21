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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class cn implements org.telegram.ui.Cells.l1 {
    public final /* synthetic */ qn a;

    public cn(qn qnVar) {
        this.a = qnVar;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void A(org.telegram.ui.Cells.u1 u1Var) {
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.l1
    public final void A0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        MessageObject messageObject = u1Var.getMessageObject();
        int i10 = messageObject.type;
        qn qnVar = this.a;
        if (i10 != 16) {
            qnVar.L7(u1Var, true, false, f7, f10, messageObject.isMusic(), false, false);
            return;
        }
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        int i11 = 0;
        if (!(messageAction instanceof TLRPC.TL_messageActionConferenceCall)) {
            TLRPC.User user = qnVar.f;
            if (user != null) {
                boolean isVideoCall = messageObject.isVideoCall();
                TLRPC.UserFull userFull = qnVar.a8;
                if (userFull != null && userFull.video_calls_available) {
                    i11 = 1;
                }
                org.telegram.ui.Components.voip.d2.m(user, isVideoCall, i11, qnVar.getParentActivity(), qnVar.getMessagesController().getUserFull(qnVar.f.id), qnVar.getAccountInstance());
                return;
            }
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(Long.valueOf(qnVar.a()));
        ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
        int size = arrayList.size();
        while (i11 < size) {
            TLRPC.Peer peer = arrayList.get(i11);
            i11++;
            hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(peer)));
        }
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = messageObject.getId();
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(qnVar.getParentActivity(), 3, null);
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = qnVar.getMessagesController().conferenceCallSizeLimit;
        b2Var.setOnCancelListener(new ai.e0(this, qnVar.getConnectionsManager().sendRequest(getgroupcall, new ai.s9(this, b2Var, hashSet, tL_inputGroupCallInviteMessage, messageObject)), 2));
        b2Var.r(600L);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void A1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        qn qnVar = this.a;
        if (qnVar.E9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) ag.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) ag.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
        if (qnVar.getParentActivity() != null) {
            if (qnVar.O0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                if (tL_inlineButtonTypeCopy == null) {
                    if (tL_inlineButtonTypeUrl != null) {
                        qnVar.ea(null, tL_inlineButtonTypeUrl.url, true, u1Var, u1Var.getMessageObject());
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
                org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) qnVar.getParentActivity(), (org.telegram.ui.ActionBar.d6) qnVar.ea, false);
                f3Var.fixNavigationBar();
                f3Var.title = str;
                f3Var.bigTitle = false;
                f3Var.multipleLinesTitle = true;
                CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Copy)};
                mg.j jVar = new mg.j(3, qnVar, str);
                f3Var.items = charSequenceArr;
                f3Var.onClickListener = jVar;
                qnVar.showDialog(f3Var);
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void B(org.telegram.ui.Cells.u1 u1Var) {
        qn qnVar = this.a;
        if (!qnVar.getMessagesController().showSensitiveContent()) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(qnVar.getParentActivity(), 3, null);
            b2Var.r(200L);
            qnVar.getMessagesController().getContentSettings(new z(this, b2Var, u1Var, 6));
        } else {
            if (u1Var.getMessageObject() != null) {
                u1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
            }
            u1Var.h4();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean B1() {
        qn qnVar = this.a;
        return qnVar.X0.getKeyboardHeight() + qnVar.oa >= AndroidUtilities.dp(20.0f);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void C0(org.telegram.ui.Cells.u1 u1Var) {
        h(u1Var, true, false, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void D(org.telegram.ui.Cells.u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        TLRPC.Message message;
        int i10;
        int i11;
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        int i12 = buttonCustom.id;
        qn qnVar = this.a;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    qnVar.L7(u1Var, true, false, u1Var.getLastTouchX(), u1Var.getLastTouchY(), true, false, true);
                    return;
                } else {
                    if (i12 == 4) {
                        qnVar.R1.m(messageObject.getTopicId(), true);
                        return;
                    }
                    return;
                }
            }
            if (message.suggested_post != null) {
                i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, qnVar.e);
                if (canManageMonoForum) {
                    i11 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                    ChatObject.canUserDoChannelDirectAdminAction(i11, qnVar.e, 5);
                }
                ai.x9 x9Var = new ai.x9(this, message, canManageMonoForum, messageObject, 11);
                TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                qnVar.j7(x9Var, ag.a.l(suggestedPost != null ? suggestedPost.price : null), !canManageMonoForum);
                return;
            }
            return;
        }
        long peerDialogId = DialogObject.getPeerDialogId(message.from_id);
        org.telegram.ui.ActionBar.j3 j3Var = new org.telegram.ui.ActionBar.j3(19, this, message);
        Pattern pattern = org.telegram.ui.Components.f5.a;
        Activity parentActivity = qnVar.getParentActivity();
        int i13 = 0;
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(parentActivity, 0, null);
        String string = LocaleController.getString(R.string.SuggestedMessageDecline);
        org.telegram.ui.ActionBar.b2 b2Var = e2Var.a;
        b2Var.R = string;
        b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageDeclineInfo, MessagesController.getInstance(UserConfig.selectedAccount).getPeerName(peerDialogId)));
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        frameLayout.setClipChildren(false);
        EditText editText = new EditText(parentActivity);
        editText.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
        editText.setHint(LocaleController.getString(R.string.SuggestedMessageDeclineReasonHint));
        editText.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.H6, false));
        editText.setTextSize(1, 16.0f);
        editText.setBackground(org.telegram.ui.ActionBar.h6.T(parentActivity));
        editText.setMaxLines(4);
        editText.setRawInputType(147457);
        editText.setImeOptions(6);
        editText.setFilters(new InputFilter[]{new org.telegram.ui.Components.u4(parentActivity)});
        editText.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0, AndroidUtilities.dp(8.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f));
        editText.setSelection(editText.getText().toString().length());
        e2Var.n(frameLayout);
        e2Var.k(LocaleController.getString(R.string.Decline), new m4.w0(28, j3Var, editText));
        e2Var.h(LocaleController.getString(R.string.Cancel), null);
        b2Var.N = new org.telegram.ui.Components.q1(editText, i13);
        frameLayout.addView(editText, w7.z5.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
        editText.requestFocus();
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.pg(editText, 3), 100L);
        qnVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void D1(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        qn qnVar = this.a;
        qnVar.d5 = messageObject;
        qnVar.i9();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void E0(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject;
        if (u1Var == null || (messageObject = u1Var.getMessageObject()) == null || messageObject.messageOwner == null) {
            return;
        }
        int id2 = messageObject.getId();
        qn qnVar = this.a;
        if (qnVar.wb == id2 && qnVar.xb == 7) {
            return;
        }
        TLRPC.InputPeer inputPeer = qnVar.getMessagesController().getInputPeer(messageObject.getDialogId());
        if (inputPeer == null) {
            return;
        }
        TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
        getrichmessage.peer = inputPeer;
        getrichmessage.id = id2;
        pf.c cVar = qnVar.Ab;
        if (cVar != null) {
            cVar.a(true);
            qnVar.Ab = null;
        }
        int[] iArr = new int[1];
        ri riVar = new ri(qnVar, id2, u1Var, 2);
        riVar.b = new i0(27, qnVar, iArr);
        qnVar.Ab = riVar;
        riVar.d();
        iArr[0] = qnVar.getConnectionsManager().sendRequestTyped(getrichmessage, new org.telegram.messenger.a(), new ai.x3(qnVar, riVar, iArr, u1Var, messageObject, 3));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void F(org.telegram.ui.Cells.u1 u1Var) {
        qn qnVar = this.a;
        qnVar.xa.k(u1Var, qnVar, true);
        qnVar.x0.I0(false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void F1(MessageObject messageObject) {
        this.a.s.put(messageObject, Boolean.TRUE);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void G(MessageObject.TextLayoutBlock textLayoutBlock) {
        StaticLayout staticLayout = textLayoutBlock.textLayout;
        if (staticLayout == null || staticLayout.getText() == null) {
            return;
        }
        String charSequence = textLayoutBlock.textLayout.getText().toString();
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new mi.h(false, textLayoutBlock.language, charSequence), 0, spannableString.length(), 33);
        AndroidUtilities.addToClipboard(spannableString);
        org.telegram.messenger.mk.p(R.string.CodeCopied, org.telegram.ui.Components.xc.a0(this.a));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void G0(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        messageObject.messageOwner.summarizedOpen = !r1.summarizedOpen;
        messageObject.updateTranslation(true);
        qn qnVar = this.a;
        qnVar.getMessagesStorage().updateMessageCustomParams(messageObject.getDialogId(), messageObject.messageOwner);
        qnVar.getMessagesController().getTranslateController().checkTranslation(messageObject, true);
        h(u1Var, true, false, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void G1(org.telegram.ui.Cells.u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        Uri parse;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        boolean z11 = (z10 || !pf.d.g(str, false, false)) ? z10 : true;
        qn qnVar = this.a;
        pf.c cVar = qnVar.Ab;
        if (cVar != null) {
            cVar.a(true);
        }
        qnVar.Ab = u1Var.getMessageObject() == null ? null : new ym(this, u1Var);
        if (z11 || pf.d.e(parse, false, null)) {
            pf.d.q(qnVar.getParentActivity(), parse, true, true, false, qnVar.Ab, null, false, true, false);
        } else {
            org.telegram.ui.Components.f5.q0(qnVar, str, true, true, true, !z11, qnVar.Ab, webPage, qnVar.ea);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final CharacterStyle H1(org.telegram.ui.Cells.u1 u1Var) {
        qn qnVar;
        int i10;
        if (u1Var.getMessageObject() == null || (i10 = (qnVar = this.a).wb) == 0 || i10 != u1Var.getMessageObject().getId() || qnVar.xb != 1) {
            return null;
        }
        return qnVar.yb;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void I(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject.messageOwner.send_state != 0) {
            this.a.getSendMessagesHelper().cancelSendingMessage(messageObject);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        try {
            qn qnVar = this.a;
            org.telegram.ui.Components.cv.J(qnVar, messageObject, qnVar.Ga, str2, str3, str4, str, i10, i11, -1, qnVar.C9());
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean J0(long j10) {
        qn qnVar = this.a;
        TLRPC.Chat chat = qnVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return false;
        }
        return qnVar.getMessagesController().isOwner(qnVar.e.id, j10);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean J1(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        ViewGroup viewGroup;
        int i10;
        v31 v31Var;
        if (messageObject.isVoiceOnce() || messageObject.isRoundOnce()) {
            x31 x31Var = this.a.Z9;
            if (x31Var == null || x31Var.b0) {
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
                this.a.Z9 = new x31(this.a.getParentActivity());
                x31 x31Var2 = this.a.Z9;
                se kb2 = !messageObject.isOutOwner() ? this.a.kb(messageObject, true) : null;
                a3.i0 P4 = !messageObject.isOutOwner() ? qn.P4(this.a, messageObject) : null;
                Context context = x31Var2.a;
                ah.v vVar = x31Var2.c;
                x31Var2.X = kb2;
                x31Var2.Y = P4;
                v31 v31Var2 = x31Var2.N;
                if (v31Var2 != null) {
                    vVar.removeView(v31Var2);
                    x31Var2.N = null;
                }
                x31Var2.O = u1Var;
                MessageObject messageObject2 = u1Var.getMessageObject();
                x31Var2.M = messageObject2;
                x31Var2.S = messageObject2 != null && messageObject2.isRoundVideo();
                org.telegram.ui.Cells.u1 u1Var2 = x31Var2.O;
                x31Var2.L = u1Var2 != null ? u1Var2.getResourcesProvider() : null;
                if (x31Var2.O != null) {
                    x31Var2.T = 0.0f;
                    x31Var2.U = u1Var.n;
                    if (u1Var.getParent() instanceof View) {
                        View view = (View) u1Var.getParent();
                        x31Var2.T = view.getY() + x31Var2.T;
                        x31Var2.U = view.getY() + x31Var2.U;
                    }
                    int width = x31Var2.O.getWidth();
                    int height = x31Var2.O.getHeight();
                    if (x31Var2.S) {
                        height = Math.min(AndroidUtilities.dp(360.0f), Math.min(width, AndroidUtilities.displaySize.y));
                    }
                    int i11 = height;
                    x31Var2.K = i11 - x31Var2.O.getHeight();
                    i10 = (int) Math.ceil((Math.min(width, i11) * 0.92f) / AndroidUtilities.density);
                    viewGroup = vVar;
                    v31 v31Var3 = new v31(x31Var2, x31Var2.getContext(), UserConfig.selectedAccount, x31Var2.O.getResourcesProvider(), width, i11);
                    x31Var2.N = v31Var3;
                    x31Var2.O.j1(v31Var3);
                    x31Var2.N.i1(x31Var2.O);
                    x31Var2.N.setDelegate(new pb.a(18));
                    v31 v31Var4 = x31Var2.N;
                    MessageObject messageObject3 = x31Var2.M;
                    MessageObject.GroupedMessages currentMessagesGroup = x31Var2.O.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.u1 u1Var3 = x31Var2.O;
                    v31Var4.X3(messageObject3, currentMessagesGroup, u1Var3.F, u1Var3.E, false, false);
                    if (!x31Var2.S) {
                        org.telegram.ui.Components.l8 l8Var = new org.telegram.ui.Components.l8();
                        x31Var2.V = l8Var;
                        v31 v31Var5 = x31Var2.N;
                        l8Var.i = v31Var5;
                        v31Var5.ee = l8Var;
                        if (v31Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.gp0 seekBarWaveform = x31Var2.N.getSeekBarWaveform();
                            seekBarWaveform.L = x31Var2.s;
                            org.telegram.ui.Cells.u1 u1Var4 = seekBarWaveform.n;
                            if (u1Var4 != null) {
                                u1Var4.invalidate();
                            }
                        }
                    }
                    x31Var2.H = false;
                    viewGroup.addView(x31Var2.N, new FrameLayout.LayoutParams(x31Var2.O.getWidth(), i11, 17));
                } else {
                    viewGroup = vVar;
                    i10 = 360;
                }
                TextureView textureView = x31Var2.P;
                if (textureView != null) {
                    viewGroup.removeView(textureView);
                    x31Var2.P = null;
                }
                if (x31Var2.S) {
                    x31Var2.Q = false;
                    TextureView textureView2 = new TextureView(context);
                    x31Var2.P = textureView2;
                    viewGroup.addView(textureView2, 0, w7.z5.c(i10, i10));
                }
                MediaController.getInstance().pauseByRewind();
                org.telegram.ui.Components.c81 c81Var = x31Var2.w;
                if (c81Var != null) {
                    c81Var.B();
                    x31Var2.w.H();
                    x31Var2.w = null;
                }
                org.telegram.ui.Cells.u1 u1Var5 = x31Var2.O;
                if (u1Var5 != null && u1Var5.getMessageObject() != null) {
                    File pathToAttach = FileLoader.getInstance(x31Var2.O.getMessageObject().currentAccount).getPathToAttach(x31Var2.O.getMessageObject().getDocument());
                    if (pathToAttach != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && (pathToAttach = FileLoader.getInstance(x31Var2.O.getMessageObject().currentAccount).getPathToMessage(x31Var2.O.getMessageObject().messageOwner)) != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && x31Var2.O.getMessageObject().messageOwner.attachPath != null) {
                        pathToAttach = new File(x31Var2.O.getMessageObject().messageOwner.attachPath);
                    }
                    if (pathToAttach != null && pathToAttach.exists()) {
                        org.telegram.ui.Components.c81 c81Var2 = new org.telegram.ui.Components.c81();
                        x31Var2.w = c81Var2;
                        c81Var2.J = new w31(x31Var2);
                        if (x31Var2.V != null) {
                            c81Var2.K = new w31(x31Var2);
                        }
                        if (x31Var2.S) {
                            c81Var2.V(x31Var2.P);
                        }
                        x31Var2.w.D(Uri.fromFile(pathToAttach), "other");
                        x31Var2.w.C();
                        org.telegram.ui.Components.rt rtVar = x31Var2.E;
                        if (rtVar != null) {
                            rtVar.s = x31Var2.w;
                            rtVar.a();
                        }
                    }
                    qn qnVar = this.a;
                    qnVar.showDialog(qnVar.Z9);
                    return false;
                }
                ei.x3 x3Var = x31Var2.x;
                if (x3Var != null) {
                    viewGroup.removeView(x3Var);
                    x31Var2.x = null;
                }
                MessageObject messageObject4 = x31Var2.M;
                boolean z10 = messageObject4 != null && messageObject4.isOutOwner();
                MessageObject messageObject5 = x31Var2.M;
                if (messageObject5 != null && messageObject5.getDialogId() != UserConfig.getInstance(x31Var2.M.currentAccount).getClientUserId()) {
                    ei.x3 x3Var2 = new ei.x3(context, 3);
                    x31Var2.x = x3Var2;
                    x3Var2.p(true);
                    if (z10) {
                        long dialogId = x31Var2.M.getDialogId();
                        String str = "";
                        if (dialogId > 0) {
                            TLRPC.User user = MessagesController.getInstance(x31Var2.M.currentAccount).getUser(Long.valueOf(dialogId));
                            if (user != null) {
                                str = UserObject.getFirstName(user);
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(x31Var2.M.currentAccount).getChat(Long.valueOf(-dialogId));
                            if (chat != null) {
                                str = chat.title;
                            }
                        }
                        x31Var2.x.s(AndroidUtilities.replaceTags(LocaleController.formatString(x31Var2.S ? R.string.VideoOnceOutHint : R.string.VoiceOnceOutHint, str)));
                    } else {
                        x31Var2.x.s(AndroidUtilities.replaceTags(LocaleController.getString(x31Var2.S ? R.string.VideoOnceHint : R.string.VoiceOnceHint)));
                    }
                    x31Var2.x.q(12.0f);
                    x31Var2.x.setPadding(AndroidUtilities.dp((z10 || x31Var2.O.F) ? 0.0f : 6.0f), 0, 0, 0);
                    if (x31Var2.S) {
                        x31Var2.x.m(0.5f, 0.0f);
                        x31Var2.x.K = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        x31Var2.x.m(0.0f, AndroidUtilities.dp(34.0f));
                        x31Var2.x.K = Layout.Alignment.ALIGN_NORMAL;
                    }
                    x31Var2.x.t(14.0f);
                    ei.x3 x3Var3 = x31Var2.x;
                    x3Var3.h = ei.x3.a(x3Var3.getText(), x31Var2.x.getTextPaint());
                    if (x31Var2.S) {
                        viewGroup.addView(x31Var2.x, w7.z5.d((int) ((x31Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((x31Var2.O.getHeight() + x31Var2.K) / AndroidUtilities.density) / 2.0f), 0.0f, 0.0f));
                    } else {
                        viewGroup.addView(x31Var2.x, w7.z5.d((int) ((x31Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, ((((x31Var2.O.getWidth() * (-0.39999998f)) / 2.0f) + x31Var2.O.getBoundsLeft()) / AndroidUtilities.density) + 1.0f, ((-75.0f) - ((x31Var2.O.getHeight() / AndroidUtilities.density) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    x31Var2.x.u();
                }
                TextView textView = x31Var2.y;
                if (textView != null) {
                    viewGroup.removeView(textView);
                    x31Var2.y = null;
                }
                TextView textView2 = new TextView(context);
                x31Var2.y = textView2;
                textView2.setTextColor(-1);
                x31Var2.y.setTypeface(AndroidUtilities.bold());
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    x31Var2.y.setBackground(org.telegram.ui.ActionBar.h6.j0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    x31Var2.y.setBackground(org.telegram.ui.ActionBar.h6.j0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                x31Var2.y.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
                w7.b6.a(x31Var2.y);
                x31Var2.y.setText(LocaleController.getString(z10 ? R.string.VoiceOnceClose : R.string.VoiceOnceDeleteClose));
                x31Var2.y.setOnClickListener(new t31(x31Var2, 1));
                viewGroup.addView(x31Var2.y, w7.z5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z10 && (v31Var = x31Var2.N) != null && v31Var.getMessageObject() != null && x31Var2.N.getMessageObject().messageOwner != null) {
                    x31Var2.N.getMessageObject().messageOwner.media_unread = false;
                    x31Var2.N.invalidate();
                }
                qn qnVar2 = this.a;
                qnVar2.showDialog(qnVar2.Z9);
                return false;
            }
        } else {
            if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                boolean playMessage = MediaController.getInstance().playMessage(messageObject, false);
                MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? this.a.U7(messageObject, false) : null, false);
                return playMessage;
            }
            if (messageObject.isMusic()) {
                MediaController mediaController = MediaController.getInstance();
                ArrayList L = this.a.A0.L();
                qn qnVar3 = this.a;
                return mediaController.setPlaylist(L, messageObject, qnVar3.L6, true ^ qnVar3.A0.N, null);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void K(int i10, org.telegram.ui.Cells.u1 u1Var) {
        boolean z10 = u1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveaway;
        qn qnVar = this.a;
        if (z10) {
            long j10 = -((TLRPC.TL_messageMediaGiveaway) u1Var.getMessageObject().messageOwner.media).channels.get(i10).longValue();
            if (qnVar.T5 != j10) {
                qnVar.presentFragment(qn.W9(j10));
            } else {
                qnVar.a1.e(false, false);
            }
        }
        if (u1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            qnVar.presentFragment(ProfileActivity.m4(((TLRPC.TL_messageMediaGiveawayResults) u1Var.getMessageObject().messageOwner.media).winners.get(i10).longValue()));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void K0(org.telegram.ui.Cells.u1 u1Var) {
        int i10;
        a3.i0 i0Var;
        MessageObject.GroupedMessages groupedMessages;
        int i11;
        qn qnVar = this.a;
        vh.i iVar = qnVar.X9;
        if (iVar == null) {
            return;
        }
        HashMap hashMap = iVar.a;
        vh.h hVar = (vh.h) hashMap.get(vh.i.b(u1Var));
        org.telegram.ui.Components.qc qcVar = null;
        MessageObject messageObject = hVar != null ? hVar.E : null;
        vh.h hVar2 = (vh.h) qnVar.X9.a.get(vh.i.b(u1Var));
        long j10 = (hVar2 == null || (i11 = hVar2.R) == -1) ? 0L : hVar2.w[i11].d;
        if (messageObject != null && j10 != 0) {
            Activity parentActivity = qnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
            if (!org.telegram.ui.Components.f5.g(parentActivity, i10, j10, false)) {
                ArrayList<MessageObject> arrayList = (messageObject.getGroupId() == 0 || (groupedMessages = (MessageObject.GroupedMessages) qnVar.x6.f(messageObject.getGroupId())) == null) ? null : groupedMessages.messages;
                if (arrayList == null) {
                    arrayList = org.telegram.messenger.g0.k(messageObject);
                }
                boolean z10 = j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                long j11 = j10;
                a3.i0 i0Var2 = new a3.i0(this, arrayList, j11, 17);
                if (z10) {
                    i0Var2.run();
                    i0Var = null;
                } else {
                    i0Var = i0Var2;
                }
                qcVar = org.telegram.ui.Components.xc.v(qnVar.getParentActivity(), qnVar, null, 1, j11, 1, qnVar.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), qnVar.getThemedColor(org.telegram.ui.ActionBar.h6.Hi), 5000, false, i0Var);
                qcVar.k = true;
                qcVar.k(qcVar.e instanceof org.telegram.ui.Components.bc);
            }
        }
        vh.h hVar3 = (vh.h) hashMap.get(vh.i.b(u1Var));
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
            viewTreeObserver.addOnPreDrawListener(new xl(2, hVar3, viewTreeObserver));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void K1(org.telegram.ui.Cells.u1 u1Var, ah.t tVar) {
        TLRPC.Message message;
        if (u1Var == null) {
            tVar.run();
            return;
        }
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject == null || ((messageObject.isSending() && !messageObject.isEditing()) || (message = messageObject.messageOwner) == null || message.rich_message == null)) {
            tVar.run();
        } else {
            org.telegram.ui.ActionBar.n2 n2Var = this.a;
            n2Var.getSendMessagesHelper().editRichMessage(messageObject, messageObject.messageOwner.rich_message, null, n2Var, true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void L1() {
        org.telegram.ui.ActionBar.d6 d6Var;
        qn qnVar = this.a;
        if (qnVar.X0 == null || qnVar.getParentActivity() == null) {
            return;
        }
        Context context = qnVar.X0.getContext();
        d6Var = ((org.telegram.ui.ActionBar.n2) qnVar).resourceProvider;
        t21.U(context, qnVar, false, d6Var, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void M(MessageObject messageObject) {
        if (messageObject.isVideo()) {
            this.a.kb(messageObject, true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void M0(int i10, org.telegram.ui.Cells.u1 u1Var) {
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
        qn qnVar = this.a;
        if (i10 == 19) {
            pf.c cVar = qnVar.Ab;
            if (cVar != null) {
                cVar.a(true);
            }
            final vm vmVar = u1Var.getMessageObject() != null ? new vm(this, u1Var, 2) : null;
            qnVar.Ab = vmVar;
            final Activity parentActivity = qnVar.getParentActivity();
            final org.telegram.ui.ActionBar.d6 resourceProvider = qnVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            vmVar.d();
            vmVar.b = new ug.d(atomicBoolean, 0);
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
            final String b11 = ug.i.b(messageObject);
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
            final boolean z10 = chat != null && ChatObject.isChannelAndNotMegaGroup(chat);
            final long j10 = messageObject.messageOwner.date * 1000;
            ug.r.d(messageObject, new Utilities.Callback(atomicBoolean, vmVar, z10, b11, j10, tL_messageMediaGiveaway2, parentActivity, resourceProvider) { // from class: ug.e
                public final /* synthetic */ AtomicBoolean a;
                public final /* synthetic */ pf.c b;
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
            }, new ug.f(atomicBoolean, vmVar, 0));
            return;
        }
        if (i10 == 21) {
            f();
            return;
        }
        if (i10 == 84) {
            qnVar.ya(u1Var);
            return;
        }
        if (i10 == 80) {
            org.telegram.ui.Cells.s8 s8Var = org.telegram.ui.Components.lh0.O;
            if (qnVar.getParentActivity() == null) {
                return;
            }
            qnVar.showDialog(new org.telegram.ui.Components.lh0(qnVar.getContext(), qnVar.getCurrentAccount(), messageObject, qnVar.getResourceProvider()));
            return;
        }
        if (i10 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
            if (messageMedia4 == null || (webPage = messageMedia4.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity == null || launchActivity.P() == null || LaunchActivity.H1.P().l(messageObject) == null) {
                qnVar.createArticleViewer(false).N(messageObject, null, null, null);
                return;
            }
            return;
        }
        int i15 = 5;
        if (i10 == 5) {
            long j11 = messageObject.messageOwner.media.user_id;
            if (j11 != 0) {
                i14 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
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
                qnVar.presentFragment(new ProfileActivity(bundle, null));
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
                qnVar.showDialog(new org.telegram.ui.Components.jf0(qnVar, null, user, null, file, jf.b.d(str, false), str3, str4, qnVar.ea));
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (i10 == 30) {
            qnVar.presentFragment(new qn(zf.d0.b(messageObject.messageOwner.media.user_id, "user_id")));
            return;
        }
        if (i10 == 31) {
            long j12 = messageObject.messageOwner.media.user_id;
            if (j12 != 0) {
                i13 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(j12));
            }
            if (user2 != null) {
                if (!TextUtils.isEmpty(messageObject.vCardData)) {
                    b10 = messageObject.vCardData.toString();
                } else if (TextUtils.isEmpty(user2.phone)) {
                    String str5 = MessageObject.getMedia(messageObject.messageOwner).phone_number;
                    b10 = !TextUtils.isEmpty(str5) ? jf.b.c().b(str5) : LocaleController.getString(R.string.NumberUnknown);
                } else {
                    b10 = org.telegram.messenger.mk.g(new StringBuilder("+"), user2.phone, jf.b.c());
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user2.id);
                bundle2.putString("phone", b10);
                bundle2.putBoolean("addContact", true);
                qnVar.presentFragment(new fs(bundle2));
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
            pf.c cVar2 = qnVar.Ab;
            if (cVar2 != null) {
                cVar2.a(true);
            }
            qnVar.Ab = u1Var.getMessageObject() != null ? new vm(this, u1Var, 3) : null;
            if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                String group = matcher.group(1);
                i11 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                if (MediaDataController.getInstance(i11).getStickerSetByName(group) == null) {
                    qnVar.Ab.d();
                    TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_inputStickerSetShortName.short_name = group;
                    tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                    i12 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                    qnVar.Ab.b = new ah.g(this, ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickerSet, new ei.o3(i16, this, z11)), 29);
                    return;
                }
            }
            pf.d.q(qnVar.getParentActivity(), Uri.parse(webPage2.url), true, true, false, qnVar.Ab, null, false, true, false);
            return;
        }
        if (messageObject.isSponsored()) {
            qnVar.O9(messageObject, false, false);
            if (messageObject.sponsoredUrl != null) {
                pf.c cVar3 = qnVar.Ab;
                if (cVar3 != null) {
                    cVar3.a(true);
                }
                qnVar.Ab = u1Var.getMessageObject() != null ? new vm(this, u1Var, i16) : null;
                pf.d.q(qnVar.getParentActivity(), Uri.parse(messageObject.sponsoredUrl), true, false, false, qnVar.Ab, null, false, qnVar.getMessagesController().sponsoredLinksInappAllow, false);
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
                    qnVar.getOrCreateStoryViewer().F(qnVar.getParentActivity(), tL_webPageAttributeStory.storyItem, ci.r7.a(qnVar.x0));
                    return;
                }
            }
        }
        if (qnVar.ja(storyMentionWebpage.url, u1Var, null, messageObject.getId(), 2)) {
            return;
        }
        pf.c cVar4 = qnVar.Ab;
        if (cVar4 != null) {
            cVar4.a(true);
        }
        qnVar.Ab = u1Var.getMessageObject() != null ? new vm(this, u1Var, i15) : null;
        pf.d.q(qnVar.getParentActivity(), Uri.parse(storyMentionWebpage.url), true, true, false, qnVar.Ab, null, false, true, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void M1(org.telegram.ui.Cells.u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        ri riVar;
        int i10;
        MessageObject messageObject = u1Var.getMessageObject();
        ah.g gVar = null;
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
                        TLRPC.TL_message F7 = qn.F7(message);
                        if (!TextUtils.isEmpty(tL_messageExtendedMedia.attachPath)) {
                            F7.attachPath = tL_messageExtendedMedia.attachPath;
                        } else if (tL_messageMediaPaidMedia.extended_media.size() == 1) {
                            F7.attachPath = message.attachPath;
                        }
                        F7.media = tL_messageExtendedMedia.media;
                        F7.noforwards = true;
                        arrayList.add(new MessageObject(messageObject.currentAccount, F7, false, true));
                    }
                }
                if (i11 <= -1 || arrayList.isEmpty()) {
                    return;
                }
                PhotoViewer u12 = PhotoViewer.u1();
                qn qnVar = this.a;
                u12.M2(null, qnVar, qnVar.ea);
                PhotoViewer.u1().d2(arrayList, i11, this.a.a(), 0L, 0L, this.a.Ha);
                return;
            }
            return;
        }
        qn qnVar2 = this.a;
        pf.c cVar = qnVar2.Ab;
        if (cVar != null) {
            cVar.a(true);
            qnVar2.Ab = null;
        }
        if (u1Var.getMessageObject() == null) {
            qnVar2.Ab = null;
            riVar = null;
        } else {
            riVar = new ri(qnVar2, u1Var.getMessageObject().getId(), u1Var, 1);
            qnVar2.Ab = riVar;
        }
        i10 = ((org.telegram.ui.ActionBar.n2) this.a).currentAccount;
        ai.ga y3 = ai.ga.y(i10, false);
        Objects.requireNonNull(riVar);
        ti tiVar = new ti(riVar, 8);
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        org.telegram.ui.ActionBar.d6 I = ai.ga.I();
        if (messageObject != null && context != null) {
            long dialogId = messageObject.getDialogId();
            int id2 = messageObject.getId();
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = MessagesController.getInstance(y3.a).getInputPeer(dialogId);
            tL_inputInvoiceMessage.msg_id = id2;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject q6 = gi.d3.q(I, false);
            if (q6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = q6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
            gVar = new ah.g(y3, ConnectionsManager.getInstance(y3.a).sendRequest(tL_payments_getPaymentForm, new ai.k2(y3, messageObject, tL_inputInvoiceMessage, tiVar, 3)), 2);
        }
        if (gVar != null) {
            riVar.b = gVar;
            riVar.d();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean N(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        int i10;
        int i11;
        boolean isForwarded = u1Var.getMessageObject().isForwarded();
        qn qnVar = this.a;
        if (isForwarded) {
            long peerDialogId = DialogObject.getPeerDialogId(u1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(qnVar);
            int i12 = R.raw.passcode_lock_close;
            int i13 = R.string.TodoCompleteForbiddenForward;
            i11 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
            a02.Q(i12, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i13, DialogObject.getName(i11, peerDialogId)))).k(true);
            return false;
        }
        if (u1Var.getMessageObject().canCompleteTodo()) {
            if (qnVar.getUserConfig().isPremium()) {
                qnVar.getSendMessagesHelper().toggleTodo(ChatObject.getSendAsPeerId(qnVar.e, qnVar.Z7, true), u1Var.getMessageObject(), todoItem, z10, null);
                return true;
            }
            org.telegram.ui.Components.xc.a0(qnVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.TodoPremiumRequired), new nm(this, 9))).k(true);
            return false;
        }
        long peerDialogId2 = DialogObject.getPeerDialogId(u1Var.getMessageObject().getFromPeer());
        org.telegram.ui.Components.xc a03 = org.telegram.ui.Components.xc.a0(qnVar);
        int i14 = R.raw.passcode_lock_close;
        int i15 = R.string.TodoCompleteForbidden;
        i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
        a03.Q(i14, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i15, DialogObject.getName(i10, peerDialogId2)))).k(true);
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void N1(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10;
        int i11;
        ImageLocation forDocument;
        String str2;
        boolean isEmpty = TextUtils.isEmpty(str);
        qn qnVar = this.a;
        if (!isEmpty) {
            pf.d.r(qnVar.getParentActivity(), "https://" + qnVar.getMessagesController().linkPrefix + "/nft/" + str);
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
        sg.m1 m1Var = new sg.m1(qnVar, i10, user, null, null, qnVar.ea);
        u1Var.getLocationOnScreen(new int[2]);
        m1Var.v0 = u1Var.getNameStatusX();
        m1Var.w0 = u1Var.getNameStatusY();
        m1Var.z0 = u1Var.getScaleX();
        m1Var.x0 = u1Var.getLeft();
        m1Var.y0 = u1Var.getTop();
        m1Var.A0 = u1Var;
        int colorId = UserObject.getColorId(user);
        if (colorId < 7) {
            m1Var.u0 = Integer.valueOf(qnVar.getThemedColor(org.telegram.ui.ActionBar.h6.r8[colorId]));
        } else {
            i11 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
            MessagesController.PeerColors peerColors = MessagesController.getInstance(i11).peerColors;
            MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(colorId) : null;
            m1Var.u0 = color != null ? Integer.valueOf(color.getColor1()) : null;
        }
        org.telegram.ui.Components.p5 p5Var = u1Var.fc;
        if (p5Var != null && (p5Var.f[0] instanceof org.telegram.ui.Components.r5)) {
            m1Var.z0 *= 0.95f;
            if (document != null) {
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(qnVar.getParentActivity());
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
                    Integer num = m1Var.u0;
                    w9Var.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : qnVar.getThemedColor(org.telegram.ui.ActionBar.h6.v6), PorterDuff.Mode.SRC_IN));
                    m1Var.C0 = MessageObject.getInputStickerSet(document);
                } else {
                    m1Var.C0 = MessageObject.getInputStickerSet(document);
                }
                m1Var.B0 = w9Var;
                m1Var.E0 = true;
            }
        }
        qnVar.showDialog(m1Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void O0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        qn qnVar = this.a;
        qnVar.getSendMessagesHelper().sendCallback(true, u1Var.getMessageObject(), keyboardInlineButton, qnVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:244:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0992 A[LOOP:3: B:254:0x0990->B:255:0x0992, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x09fa  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0a11  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0a96  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0930  */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v60 */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean O1(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        qv0 qv0Var;
        TLRPC.PollAnswer pollAnswer2;
        qv0 qv0Var2;
        nv0 nv0Var;
        bh.b bVar;
        MessageObject messageObject;
        ViewGroup viewGroup;
        TLRPC.ChatFull chatFull;
        boolean z10;
        boolean z11;
        qv0 qv0Var3;
        MessageObject messageObject2;
        org.telegram.ui.Components.i80 i80Var;
        qn qnVar;
        boolean z12;
        xe xeVar;
        MessageObject messageObject3;
        int size;
        int i10;
        ViewGroup viewGroup2;
        qv0 qv0Var4;
        boolean z13;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        boolean z14;
        byte[] bArr;
        nv0 nv0Var2;
        TLRPC.PollAnswerVoters pollAnswerVoters;
        boolean z15;
        qv0 qv0Var5;
        ArrayList arrayList;
        byte[] bArr2;
        TLRPC.PollAnswer pollAnswer3;
        boolean z16;
        ?? r02;
        rh.q qVar;
        boolean z17;
        ArrayList<TLRPC.PollAnswerVoters> arrayList2;
        qn qnVar2 = this.a;
        if (qnVar2.getParentActivity() != null && qnVar2.getParentActivity() != null) {
            ei.x3 x3Var = qnVar2.x1;
            if (x3Var != null && x3Var.V) {
                x3Var.e(true);
            }
            pl plVar = qnVar2.B1;
            if (plVar != null && plVar.V) {
                plVar.e(true);
            }
            MessageObject primaryMessageObject = u1Var.getPrimaryMessageObject();
            TLRPC.MessageMedia media = MessageObject.getMedia(primaryMessageObject);
            if (primaryMessageObject != null && (media instanceof TLRPC.TL_messageMediaPoll)) {
                qnVar2.d5 = primaryMessageObject;
                qnVar2.e5 = null;
                qv0 qv0Var6 = new qv0(qnVar2.getParentActivity(), qnVar2.getResourceProvider());
                byte[] bArr3 = pollAnswer.option;
                qv0Var6.L = u1Var;
                qv0Var6.P = bArr3;
                MessageObject messageObject4 = u1Var.getMessageObject();
                qv0Var6.H = messageObject4;
                qv0Var6.I = messageObject4 != null && messageObject4.isOutOwner();
                org.telegram.ui.Cells.u1 u1Var2 = qv0Var6.L;
                nv0 nv0Var3 = qv0Var6.d;
                if (u1Var2 != null) {
                    qv0Var6.M = qnVar2.s9 - AndroidUtilities.dp(4.0f);
                    qv0Var6.N = u1Var.n;
                    if (u1Var.getParent() instanceof View) {
                        View view = (View) u1Var.getParent();
                        qv0Var6.M = view.getY() + qv0Var6.M;
                        qv0Var6.N = view.getY() + qv0Var6.N;
                    }
                    int width = qv0Var6.L.getWidth();
                    int height = qv0Var6.L.getHeight();
                    qv0Var6.L.getHeight();
                    ov0 ov0Var = new ov0(qv0Var6, qv0Var6.getContext(), UserConfig.selectedAccount, qv0Var6.L.getResourcesProvider(), bArr3, width, height);
                    qv0Var = qv0Var6;
                    qv0Var.J = ov0Var;
                    qv0Var.L.h1(ov0Var);
                    qv0Var.J.i1(qv0Var.L);
                    qv0Var.J.setDelegate(new t7.u(17));
                    ov0 ov0Var2 = qv0Var.J;
                    MessageObject messageObject5 = qv0Var.H;
                    MessageObject.GroupedMessages currentMessagesGroup = qv0Var.L.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.u1 u1Var3 = qv0Var.L;
                    ov0Var2.X3(messageObject5, currentMessagesGroup, u1Var3.F, u1Var3.E, u1Var3.G, false);
                    ov0 ov0Var3 = qv0Var.J;
                    ov0Var3.M7 = bArr3;
                    nv0Var3.addView(ov0Var3, new FrameLayout.LayoutParams(qv0Var.L.getWidth(), height, 51));
                    pv0 pv0Var = new pv0(qv0Var.getContext(), UserConfig.selectedAccount, qv0Var.L.getResourcesProvider(), width, height, 0);
                    qv0Var.K = pv0Var;
                    qv0Var.L.j1(pv0Var);
                    qv0Var.L.h1(qv0Var.K);
                    qv0Var.K.i1(qv0Var.L);
                    qv0Var.K.setDelegate(new sb.a(17));
                    pv0 pv0Var2 = qv0Var.K;
                    MessageObject messageObject6 = qv0Var.H;
                    MessageObject.GroupedMessages currentMessagesGroup2 = qv0Var.L.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.u1 u1Var4 = qv0Var.L;
                    pv0Var2.X3(messageObject6, currentMessagesGroup2, u1Var4.F, u1Var4.E, u1Var4.G, false);
                    nv0Var3.addView(qv0Var.K, new FrameLayout.LayoutParams(qv0Var.L.getWidth(), height, 51));
                } else {
                    qv0Var = qv0Var6;
                }
                ei.h1 h1Var = qv0Var.f;
                h1Var.bringToFront();
                nv0 nv0Var4 = qv0Var.e;
                nv0Var4.bringToFront();
                qv0Var.n.bringToFront();
                h1Var.w(false);
                Context context = qv0Var.a;
                View view2 = new View(context);
                org.telegram.ui.ActionBar.d6 d6Var = qv0Var.b;
                org.telegram.ui.Components.i80 G = org.telegram.ui.Components.i80.G(nv0Var3, d6Var, view2, true);
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) MessageObject.getMedia(qv0Var.H);
                qv0Var.V = MessageObject.isVoted(tL_messageMediaPoll);
                int i11 = 0;
                while (true) {
                    if (i11 >= tL_messageMediaPoll.poll.answers.size()) {
                        pollAnswer2 = null;
                        break;
                    }
                    if (Arrays.equals(tL_messageMediaPoll.poll.answers.get(i11).option, bArr3)) {
                        pollAnswer2 = tL_messageMediaPoll.poll.answers.get(i11);
                        break;
                    }
                    i11++;
                }
                bh.b bVar2 = qv0Var.G;
                if (pollAnswer2 != null) {
                    TLRPC.Poll poll = tL_messageMediaPoll.poll;
                    boolean z18 = (poll.closed || poll.revoting_disabled) ? false : true;
                    boolean z19 = poll.multiple_choice;
                    ArrayList arrayList3 = new ArrayList();
                    TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
                    if (pollResults == null || (arrayList2 = pollResults.results) == null) {
                        z14 = z19;
                        bArr = bArr3;
                        nv0Var2 = nv0Var3;
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
                            ArrayList<TLRPC.PollAnswerVoters> arrayList4 = arrayList2;
                            boolean equals = Arrays.equals(pollAnswerVoters4.option, bArr3);
                            if (equals) {
                                pollAnswerVoters2 = pollAnswerVoters4;
                            }
                            byte[] bArr4 = bArr3;
                            if (pollAnswerVoters4.chosen) {
                                if (equals) {
                                    z15 = true;
                                }
                                ArrayList<TLRPC.PollAnswer> arrayList5 = tL_messageMediaPoll.poll.answers;
                                int size3 = arrayList5.size();
                                nv0 nv0Var5 = nv0Var3;
                                int i14 = 0;
                                while (i14 < size3) {
                                    TLRPC.PollAnswer pollAnswer4 = arrayList5.get(i14);
                                    int i15 = i14 + 1;
                                    ArrayList<TLRPC.PollAnswer> arrayList6 = arrayList5;
                                    TLRPC.PollAnswer pollAnswer5 = pollAnswer4;
                                    int i16 = size3;
                                    if (Arrays.equals(pollAnswer5.option, pollAnswerVoters4.option)) {
                                        arrayList3.add(pollAnswer5);
                                    }
                                    size3 = i16;
                                    arrayList5 = arrayList6;
                                    i14 = i15;
                                }
                                arrayList2 = arrayList4;
                                i12 = i13;
                                bArr3 = bArr4;
                                nv0Var3 = nv0Var5;
                            } else {
                                arrayList2 = arrayList4;
                                i12 = i13;
                                bArr3 = bArr4;
                            }
                        }
                        bArr = bArr3;
                        nv0Var2 = nv0Var3;
                        pollAnswerVoters = pollAnswerVoters2;
                    }
                    if (pollAnswerVoters == null || pollAnswerVoters.voters <= 0 || !MessageObject.canShowVotersList(tL_messageMediaPoll)) {
                        qv0Var5 = qv0Var;
                        arrayList = arrayList3;
                        messageObject = primaryMessageObject;
                        bArr2 = bArr;
                        nv0Var = nv0Var2;
                    } else {
                        rh.q qVar2 = new rh.q(context, qnVar2.getCurrentAccount(), d6Var);
                        org.telegram.ui.Components.i80 J = G.J();
                        J.T(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, d6Var)));
                        eh.e k10 = fh.c.k(d6Var);
                        LinearLayout linearLayout = J.B;
                        if (linearLayout != null) {
                            arrayList = arrayList3;
                            qVar = qVar2;
                            z17 = false;
                            dh.d c10 = bVar2.c(linearLayout, null, false);
                            c10.o(k10);
                            linearLayout.setBackground(c10);
                        } else {
                            arrayList = arrayList3;
                            qVar = qVar2;
                            z17 = false;
                        }
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new st0(G, 26), z17);
                        J.k();
                        long dialogId = qv0Var.H.getDialogId();
                        int id2 = qv0Var.H.getId();
                        int i17 = pollAnswerVoters.voters;
                        org.telegram.ui.Components.qy qyVar = new org.telegram.ui.Components.qy(17, qv0Var, qnVar2);
                        qv0Var5 = qv0Var;
                        messageObject = primaryMessageObject;
                        rh.q qVar3 = qVar;
                        byte[] bArr5 = bArr;
                        nv0Var = nv0Var2;
                        org.telegram.ui.Components.c71 a2 = qVar3.a(qnVar2, dialogId, id2, bArr5, i17, qyVar);
                        qnVar2 = qnVar2;
                        bArr2 = bArr5;
                        J.q(a2);
                        qVar3.setMinimumHeight(AndroidUtilities.dp(48.0f));
                        qVar3.setText(LocaleController.formatPluralString("PollVotesCount", pollAnswerVoters.voters, new Object[0]));
                        qVar3.a.d(pollAnswerVoters.recent_voters, false);
                        qVar3.setLayoutParams(w7.z5.n(-1, 48));
                        qVar3.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.I5, false), 12, 0));
                        qVar3.setOnClickListener(new cf0(7, G, J));
                        G.q(qVar3);
                        G.k();
                    }
                    if (!z18) {
                        pollAnswer3 = pollAnswer2;
                        qv0Var2 = qv0Var5;
                        z16 = false;
                    } else if (z15) {
                        int i18 = R.drawable.msg_unvote;
                        String string = LocaleController.getString(R.string.Unvote);
                        qn qnVar3 = qnVar2;
                        TLRPC.PollAnswer pollAnswer6 = pollAnswer2;
                        qv0Var2 = qv0Var5;
                        iv0 iv0Var = new iv0(qv0Var2, z14, qnVar3, arrayList, pollAnswer6);
                        qnVar2 = qnVar3;
                        pollAnswer3 = pollAnswer6;
                        z16 = false;
                        G.c(i18, string, iv0Var, false);
                    } else {
                        pollAnswer3 = pollAnswer2;
                        qv0Var2 = qv0Var5;
                        z16 = false;
                        if (rh.i.a(qv0Var2.H) == 0) {
                            G.c(R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), new iv0(qv0Var2, z14, pollAnswer3, qnVar2, arrayList), false);
                        }
                    }
                    if (qnVar2.H6()) {
                        G.c(R.drawable.menu_reply, LocaleController.getString(R.string.PollItemQuote), new ve0(qv0Var2, qnVar2, pollAnswer3, 22), z16);
                    }
                    if (qv0Var2.H.getDialogId() >= 0 || pollAnswer3.option == null) {
                        viewGroup = nv0Var4;
                        r02 = 0;
                    } else {
                        MessagesController messagesController = MessagesController.getInstance(qv0Var2.H.currentAccount);
                        viewGroup = nv0Var4;
                        String publicUsername = DialogObject.getPublicUsername(messagesController.getUserOrChat(qv0Var2.H.getDialogId()));
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(messagesController.linkPrefix);
                        sb2.append("/");
                        if (TextUtils.isEmpty(publicUsername)) {
                            publicUsername = "c/" + (-qv0Var2.H.getDialogId());
                        }
                        sb2.append(publicUsername);
                        sb2.append("/");
                        sb2.append(qv0Var2.H.getId());
                        sb2.append("?option=");
                        sb2.append(new String(Base64.encode(pollAnswer3.option, 9)));
                        String sb3 = sb2.toString();
                        int i19 = R.drawable.msg_link;
                        String string2 = LocaleController.getString(R.string.CopyLink);
                        xg0 xg0Var = new xg0(29, qv0Var2, sb3);
                        r02 = 0;
                        G.c(i19, string2, xg0Var, false);
                    }
                    G.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new jv0(r02, qv0Var2, pollAnswer3), r02);
                    TLRPC.Peer peer = pollAnswer3.added_by;
                    if (peer != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        long clientUserId = UserConfig.getInstance(qv0Var2.H.currentAccount).getClientUserId();
                        bVar = bVar2;
                        long currentTime = ConnectionsManager.getInstance(qv0Var2.H.currentAccount).getCurrentTime();
                        qn qnVar4 = qnVar2;
                        long j10 = MessagesController.getInstance(qv0Var2.H.currentAccount).config.pollAnswerDeletePeriod.get(TimeUnit.SECONDS) + pollAnswer3.date;
                        if (!qv0Var2.H.isForwarded()) {
                            TLRPC.Poll poll2 = tL_messageMediaPoll.poll;
                            if (!poll2.closed && (poll2.creator || (peerDialogId == clientUserId && currentTime < j10))) {
                                G.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new jv0(1, qv0Var2, bArr2), true);
                            }
                        }
                        G.k();
                        TLObject userOrChat = MessagesController.getInstance(qv0Var2.H.currentAccount).getUserOrChat(peerDialogId);
                        CharSequence replaceTags = AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.PollAddedByAtTime, DialogObject.getShortName(userOrChat), LocaleController.formatDateTime(pollAnswer3.date, true)));
                        qnVar2 = qnVar4;
                        yb0 yb0Var = new yb0(qv0Var2, peerDialogId, qnVar2, 1);
                        Context context2 = G.e;
                        FrameLayout frameLayout = new FrameLayout(context2);
                        int i20 = org.telegram.ui.ActionBar.h6.i6;
                        org.telegram.ui.ActionBar.d6 d6Var2 = G.d;
                        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.w0(i20, d6Var2), 0, 12));
                        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context2);
                        w9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
                        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
                        h9Var.p(userOrChat);
                        w9Var.e(userOrChat, h9Var);
                        frameLayout.addView(w9Var, w7.z5.d(34, 34.0f, 51, 13.0f, 11.0f, 0.0f, 11.0f));
                        TextView textView = new TextView(context2);
                        org.telegram.messenger.mk.o(org.telegram.ui.ActionBar.h6.j5, d6Var2, textView, 1, 14.0f);
                        textView.setText(replaceTags);
                        textView.setMaxWidth(AndroidUtilities.dp(150.0f));
                        textView.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                        frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 55, 59.0f, 8.0f, 16.0f, 0.0f));
                        frameLayout.setOnClickListener(new org.telegram.ui.Components.ca(17, G, yb0Var));
                        G.r(frameLayout, w7.z5.n(-1, -2));
                    } else {
                        bVar = bVar2;
                    }
                } else {
                    qv0Var2 = qv0Var;
                    nv0Var = nv0Var3;
                    bVar = bVar2;
                    messageObject = primaryMessageObject;
                    viewGroup = nv0Var4;
                }
                G.T(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, d6Var)));
                bh.b bVar3 = bVar;
                G.Q(bVar3, fh.c.k(d6Var), false);
                G.Y();
                ViewGroup viewGroup3 = G.A;
                qv0Var2.R = viewGroup3;
                viewGroup3.setPivotX(0.0f);
                qv0Var2.R.setPivotY(0.0f);
                viewGroup.addView(qv0Var2.R, w7.z5.e(-2, -2, 51));
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                qnVar2.q8(messageObject, arrayList7, arrayList8, arrayList9);
                xe xeVar2 = new xe(qnVar2, 9);
                MessageObject messageObject7 = qv0Var2.H;
                List<TLRPC.TL_availableReaction> enabledReactionsList = qnVar2.getMediaDataController().getEnabledReactionsList();
                boolean z20 = (qnVar2.x() || qnVar2.c() || qnVar2.f != null || !messageObject7.hasReactions() || (ChatObject.isChannel(qnVar2.e) && !qnVar2.e.megagroup) || ChatObject.isMonoForum(qnVar2.e) || enabledReactionsList.isEmpty() || !messageObject7.messageOwner.reactions.can_see_list || messageObject7.isSecretMedia()) ? false : true;
                boolean z21 = !messageObject7.isForwardedChannelPost() ? messageObject7.isSecretMedia() || qnVar2.R3 == 5 || qnVar2.x() || qnVar2.c() || !messageObject7.isReactionsAvailable() || ((((chatFull = qnVar2.Z7) == null || ((chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull.paid_reactions_available)) && ((chatFull != null || ChatObject.isChannel(qnVar2.e)) && qnVar2.f == null && !ChatObject.isMonoForum(qnVar2.e))) || enabledReactionsList.isEmpty()) : (chatFull3 = qnVar2.getMessagesController().getChatFull(-messageObject7.getFromChatId())) != null && (qnVar2.x() || qnVar2.R3 == 5 || qnVar2.c() || !messageObject7.isReactionsAvailable() || (((chatFull3.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull3.paid_reactions_available) || enabledReactionsList.isEmpty()));
                boolean z22 = (z20 || qnVar2.c() || qnVar2.e == null || !messageObject7.isOutOwner() || !messageObject7.isSent() || messageObject7.isEditing() || messageObject7.isSending() || messageObject7.isSendError() || messageObject7.isContentUnread() || messageObject7.isUnread() || ConnectionsManager.getInstance(qnVar2.getCurrentAccount()).getCurrentTime() - messageObject7.messageOwner.date >= qnVar2.getMessagesController().chatReadMarkExpirePeriod || (!ChatObject.isMegagroup(qnVar2.e) && ChatObject.isChannel(qnVar2.e)) || (chatFull2 = qnVar2.Z7) == null || chatFull2.participants_count > qnVar2.getMessagesController().chatReadMarkSizeThreshold || (messageObject7.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || qnVar2.R3 == 3 || !messageObject7.canSetReaction() || ChatObject.isMonoForum(qnVar2.e)) ? false : true;
                if (qnVar2.e != null && !messageObject7.isOut() && ChatObject.isMonoForum(qnVar2.e) && ChatObject.canManageMonoForum(qnVar2.getCurrentAccount(), qnVar2.e)) {
                    int i21 = ((-qnVar2.e.linked_monoforum_id) > messageObject7.getFromChatId() ? 1 : ((-qnVar2.e.linked_monoforum_id) == messageObject7.getFromChatId() ? 0 : -1));
                }
                if (!z20 && qnVar2.e == null && qnVar2.h == null && (user = qnVar2.f) != null && !UserObject.isUserSelf(user) && !UserObject.isReplyUser(qnVar2.f) && !UserObject.isAnonymous(qnVar2.f)) {
                    TLRPC.User user2 = qnVar2.f;
                    if (!user2.bot && !UserObject.isService(user2.id) && (((userFull = qnVar2.a8) == null || !userFull.read_dates_private) && !qnVar2.c() && messageObject7.isOutOwner() && messageObject7.isSent() && !messageObject7.isEditing() && !messageObject7.isSending() && !messageObject7.isSendError() && !messageObject7.isContentUnread() && !messageObject7.isUnread() && qnVar2.getConnectionsManager().getCurrentTime() - messageObject7.messageOwner.date < qnVar2.getMessagesController().pmReadDateExpirePeriod && !(messageObject7.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                        z10 = true;
                        TLRPC.User user3 = qnVar2.f;
                        boolean z23 = ((user3 == null && (UserObject.isReplyUser(user3) || UserObject.isAnonymous(qnVar2.f))) || qnVar2.c() || !messageObject7.isEdited() || (messageObject7.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                        z11 = z22;
                        org.telegram.ui.Components.i80 G2 = org.telegram.ui.Components.i80.G(nv0Var, qnVar2.getResourceProvider(), null, !z20 || z22);
                        if (z11) {
                            qv0Var3 = qv0Var2;
                            messageObject2 = messageObject7;
                            i80Var = G2;
                            qnVar = qnVar2;
                            z12 = z21;
                            xeVar = xeVar2;
                            if (z10) {
                                i80Var.r(new org.telegram.ui.Components.tc0(qv0Var3.getContext(), 0, messageObject2, new gv0(qv0Var3, 1), qv0Var3.b), w7.z5.n(-1, 36));
                                i80Var.k();
                            } else if (z23) {
                                messageObject3 = messageObject2;
                                i80Var.r(new org.telegram.ui.Components.tc0(qv0Var3.getContext(), 1, messageObject2, new gv0(qv0Var3, 2), qv0Var3.b), w7.z5.n(-1, 36));
                                i80Var.k();
                                size = arrayList7.size();
                                i10 = 0;
                                while (i10 < size) {
                                    i80Var.c(((Integer) arrayList7.get(i10)).intValue(), (CharSequence) arrayList8.get(i10), new org.telegram.ui.Components.y31(qv0Var3, xeVar, ((Integer) arrayList9.get(i10)).intValue(), 10), false);
                                    i10++;
                                    arrayList7 = arrayList7;
                                }
                                i80Var.T(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, d6Var)));
                                i80Var.Q(bVar3, fh.c.k(d6Var), false);
                                i80Var.Y();
                                ViewGroup viewGroup4 = i80Var.A;
                                qv0Var3.T = viewGroup4;
                                viewGroup4.setPivotX(0.0f);
                                qv0Var3.T.setPivotY(0.0f);
                                viewGroup.addView(qv0Var3.T, w7.z5.e(-2, -2, 51));
                                viewGroup2 = qv0Var3.T;
                                if (viewGroup2 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    int i22 = 5;
                                    ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup2).setOnSizeChangedListener(new pp0(qv0Var3, i22));
                                    qv0Var3.T.setOnTouchListener(new e0(qv0Var3, i22));
                                }
                                if (z12) {
                                    qv0Var4 = qv0Var3;
                                    qn qnVar5 = qnVar;
                                    org.telegram.ui.Components.dl0 dl0Var = new org.telegram.ui.Components.dl0((qnVar.getUserConfig().getClientUserId() > qnVar.a() ? 1 : (qnVar.getUserConfig().getClientUserId() == qnVar.a() ? 0 : -1)) == 0 ? 3 : 0, qnVar.getCurrentAccount(), qv0Var3.getContext(), qnVar5, qv0Var3.b);
                                    dl0Var.a = true;
                                    float f7 = 22;
                                    dl0Var.setPadding(AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : 24), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 24 : 0), AndroidUtilities.dp(f7));
                                    dl0Var.setDelegate(new mv0(qv0Var4, qnVar5, messageObject3, dl0Var));
                                    qv0Var4.Q = dl0Var;
                                    viewGroup.addView(dl0Var, w7.z5.e(-2, (int) ((dl0Var.getTopOffset() / AndroidUtilities.density) + 52.0f + f7), 51));
                                    z13 = true;
                                    dl0Var.p(messageObject3, qnVar5.Z7, true);
                                    qv0Var4.Q.setTransitionProgress(1.0f);
                                } else {
                                    qv0Var4 = qv0Var3;
                                    z13 = true;
                                }
                                qv0Var4.e();
                                qv0Var4.e0 = new nm(this, 0);
                                qv0Var4.show();
                                return z13;
                            }
                        } else {
                            qh0 qh0Var = new qh0(qv0Var2.getContext(), qnVar2.getCurrentAccount(), messageObject7, qnVar2.e);
                            FrameLayout frameLayout2 = new FrameLayout(qv0Var2.getContext());
                            frameLayout2.addView(qh0Var, w7.z5.c(36.0f, -1));
                            org.telegram.ui.Components.i80 J2 = G2.J();
                            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, qv0Var2.getContext(), qv0Var2.b, true, false);
                            e1Var.setItemHeight(44);
                            qv0 qv0Var7 = qv0Var2;
                            e1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                            messageObject2 = messageObject7;
                            e1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                            FrameLayout frameLayout3 = new FrameLayout(qv0Var7.getContext());
                            LinearLayout linearLayout2 = new LinearLayout(qv0Var7.getContext());
                            linearLayout2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, d6Var));
                            linearLayout2.setOrientation(1);
                            qn qnVar6 = qnVar2;
                            org.telegram.ui.Components.jm0 a10 = qh0Var.a();
                            frameLayout3.addView(e1Var);
                            linearLayout2.addView(frameLayout3);
                            z12 = z21;
                            linearLayout2.addView(new org.telegram.ui.ActionBar.j1(qv0Var7.getContext(), d6Var), w7.z5.n(-1, 8));
                            frameLayout3.setOnClickListener(new kv0(G2));
                            xeVar = xeVar2;
                            lv0 lv0Var = new lv0(qv0Var7, qh0Var, qnVar6, a10, linearLayout2, G2, J2);
                            qnVar = qnVar6;
                            qv0Var3 = qv0Var7;
                            i80Var = G2;
                            qh0Var.setOnClickListener(lv0Var);
                            linearLayout2.addView(a10, w7.z5.n(-1, -2));
                            J2.q(linearLayout2);
                            i80Var.q(frameLayout2);
                            i80Var.k();
                        }
                        messageObject3 = messageObject2;
                        size = arrayList7.size();
                        i10 = 0;
                        while (i10 < size) {
                        }
                        i80Var.T(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, d6Var)));
                        i80Var.Q(bVar3, fh.c.k(d6Var), false);
                        i80Var.Y();
                        ViewGroup viewGroup42 = i80Var.A;
                        qv0Var3.T = viewGroup42;
                        viewGroup42.setPivotX(0.0f);
                        qv0Var3.T.setPivotY(0.0f);
                        viewGroup.addView(qv0Var3.T, w7.z5.e(-2, -2, 51));
                        viewGroup2 = qv0Var3.T;
                        if (viewGroup2 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z12) {
                        }
                        qv0Var4.e();
                        qv0Var4.e0 = new nm(this, 0);
                        qv0Var4.show();
                        return z13;
                    }
                }
                z10 = false;
                TLRPC.User user32 = qnVar2.f;
                if (user32 == null) {
                }
                z11 = z22;
                org.telegram.ui.Components.i80 G22 = org.telegram.ui.Components.i80.G(nv0Var, qnVar2.getResourceProvider(), null, !z20 || z22);
                if (z11) {
                }
                messageObject3 = messageObject2;
                size = arrayList7.size();
                i10 = 0;
                while (i10 < size) {
                }
                i80Var.T(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, d6Var)));
                i80Var.Q(bVar3, fh.c.k(d6Var), false);
                i80Var.Y();
                ViewGroup viewGroup422 = i80Var.A;
                qv0Var3.T = viewGroup422;
                viewGroup422.setPivotX(0.0f);
                qv0Var3.T.setPivotY(0.0f);
                viewGroup.addView(qv0Var3.T, w7.z5.e(-2, -2, 51));
                viewGroup2 = qv0Var3.T;
                if (viewGroup2 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z12) {
                }
                qv0Var4.e();
                qv0Var4.e0 = new nm(this, 0);
                qv0Var4.show();
                return z13;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean P() {
        qn qnVar = this.a;
        return qnVar.W5[1].size() + qnVar.W5[0].size() > 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final vu0 P1() {
        return this.a.wa;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean Q(org.telegram.ui.Cells.u1 u1Var) {
        int i10;
        MessageObject messageObject;
        TLRPC.Message message;
        if (u1Var == null) {
            return false;
        }
        qn qnVar = this.a;
        if (qnVar.getParentActivity() == null) {
            return false;
        }
        i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
        if (!MessagesController.getInstance(i10).richEditorAllowed() || (messageObject = u1Var.getMessageObject()) == null || (message = messageObject.messageOwner) == null || message.rich_message == null) {
            return false;
        }
        if (!messageObject.translated || message.translatedRichMessage == null) {
            return messageObject.canEditMessage(qnVar.e);
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean Q1(long j10) {
        qn qnVar = this.a;
        TLRPC.Chat chat = qnVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return false;
        }
        return qnVar.getMessagesController().isAdmin(qnVar.e.id, j10);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean R() {
        qn qnVar = this.a;
        return UserObject.isReplyUser(qnVar.f) || UserObject.isUserSelf(qnVar.f);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void R0(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        this.a.X7(characterStyle, z10, u1Var.getMessageObject(), u1Var);
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
    public final void R1(org.telegram.ui.Cells.u1 u1Var, int i10, float f7, float f10, boolean z10) {
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
        org.telegram.ui.ActionBar.n2 n2Var;
        TLRPC.Chat chat2;
        TLRPC.MessageReplyHeader messageReplyHeader5;
        MessageObject messageObject;
        TLRPC.MessageReplyHeader messageReplyHeader6;
        TLRPC.MessageReplyHeader messageReplyHeader7;
        TLRPC.Message message3;
        TL_stories.StoryItem storyItem;
        org.telegram.ui.ActionBar.k kVar;
        boolean c10 = c();
        qn qnVar = this.a;
        if (!c10 && !z10) {
            kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
            if ((kVar.t() || qnVar.F9()) && !qnVar.c9.z(u1Var.getMessageObject())) {
                qn.c2(qnVar, u1Var, !u1Var.i3(f7), f7, f10);
                return;
            }
            return;
        }
        if (UserObject.isReplyUser(qnVar.f)) {
            p(u1Var);
            return;
        }
        MessageObject messageObject2 = u1Var.getMessageObject();
        if (messageObject2 == null) {
            return;
        }
        if (messageObject2.isReplyToStory() && (storyItem = (message3 = messageObject2.messageOwner).replyStory) != null) {
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                org.telegram.messenger.g0.q(R.string.StoryNotFound, org.telegram.ui.Components.xc.a0(qnVar), R.raw.story_bomb1, 36);
                return;
            }
            storyItem.dialogId = DialogObject.getPeerDialogId(message3.reply_to.peer);
            storyItem.messageId = messageObject2.getId();
            storyItem.messageType = 3;
            ci.d8.b(storyItem, qnVar.f);
            qnVar.getOrCreateStoryViewer().F(qnVar.getParentActivity(), storyItem, ci.r7.a(qnVar.x0));
            return;
        }
        TLRPC.Message message4 = messageObject2.messageOwner;
        if (message4 != null && (messageReplyHeader7 = message4.reply_to) != null && (messageReplyHeader7.flags & 2048) != 0) {
            num = Integer.valueOf(messageReplyHeader7.todo_item_id);
        } else {
            if (message4 != null && (messageReplyHeader2 = message4.reply_to) != null && (bArr = messageReplyHeader2.poll_option) != null) {
                num = null;
                str = null;
                long j11 = qnVar.T5;
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
                org.telegram.ui.Components.xc.a0(qnVar).Q(R.raw.error, 36, LocaleController.getString((message5 == null && (messageReplyHeader3 = message5.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
            }
            if (message4 != null && (messageReplyHeader = message4.reply_to) != null && messageReplyHeader.quote) {
                String str3 = messageReplyHeader.quote_text;
                r9 = (messageReplyHeader.flags & 1024) != 0 ? messageReplyHeader.quote_offset : -1;
                str = str3;
                num = null;
                bArr = null;
                long j112 = qnVar.T5;
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
                            long peerDialogId = DialogObject.getPeerDialogId(peer);
                            z11 = true;
                            j10 = peerDialogId;
                            str2 = str;
                            chat = j10 < 0 ? qnVar.getMessagesController().getChat(Long.valueOf(-j10)) : null;
                            if (j10 != Long.MAX_VALUE) {
                                boolean z12 = z11;
                                if (j10 == qnVar.T5 || chat == null || ChatObject.isPublic(chat) || (!chat.left && !chat.kicked)) {
                                    if (((j10 == qnVar.T5 && (!ChatObject.isForum(qnVar.e) || !z12)) || j10 == Long.MAX_VALUE) && (qnVar.R3 != 3 || ((messageObject = messageObject2.replyMessageObject) != null && messageObject.getSavedDialogId() == qnVar.d()))) {
                                        int i11 = qnVar.R3;
                                        if (i11 == 2 || i11 == 1) {
                                            qnVar.V8.D0(i10);
                                            qnVar.finishFragment();
                                            return;
                                        }
                                        if (bArr != null) {
                                            qnVar.R7 = bArr;
                                        } else if (num != null) {
                                            qnVar.Q7 = num;
                                        } else {
                                            TLRPC.Message message6 = messageObject2.messageOwner;
                                            if (message6 != null && (messageReplyHeader5 = message6.reply_to) != null && messageReplyHeader5.quote) {
                                                qnVar.N7 = true;
                                                qnVar.P7 = messageReplyHeader5.quote_text;
                                                qnVar.S7 = r9;
                                                qnVar.M7 = true;
                                            }
                                        }
                                        ai.ub ubVar = new ai.ub(this, i10, messageObject2, num, bArr, 19);
                                        if (!qnVar.A0.N) {
                                            ubVar.run();
                                            return;
                                        }
                                        qnVar.r3 = false;
                                        qnVar.qb(false, true, false);
                                        qnVar.Kc(qnVar.getMediaDataController().getMask(), qnVar.getMediaDataController().getSearchPosition(), qnVar.getMediaDataController().getSearchCount());
                                        AndroidUtilities.runOnUIThread(ubVar, 80L);
                                        return;
                                    }
                                    Integer num2 = num;
                                    byte[] bArr2 = bArr;
                                    if (LaunchActivity.H1 != null) {
                                        pf.c cVar = qnVar.Ab;
                                        if (cVar != null) {
                                            cVar.a(false);
                                            n2Var = null;
                                            qnVar.Ab = null;
                                        } else {
                                            n2Var = null;
                                        }
                                        LaunchActivity launchActivity = LaunchActivity.H1;
                                        final l0 l0Var = new l0(this, messageObject2, u1Var);
                                        qnVar.Ab = l0Var;
                                        int id2 = messageObject2.getId();
                                        ArrayList arrayList = launchActivity.d0;
                                        if (j10 < 0 && (chat2 = MessagesController.getInstance(launchActivity.O).getChat(Long.valueOf(-j10))) != null && ChatObject.isForum(chat2)) {
                                            l0Var.d();
                                            final int i12 = 0;
                                            launchActivity.l0(j10, Integer.valueOf(i10), str2, num2, bArr2, new Runnable() { // from class: org.telegram.ui.t80
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i13 = i12;
                                                    l0 l0Var2 = l0Var;
                                                    switch (i13) {
                                                        case 0:
                                                            Pattern pattern = LaunchActivity.C1;
                                                            l0Var2.c(false);
                                                            break;
                                                        default:
                                                            Pattern pattern2 = LaunchActivity.C1;
                                                            l0Var2.c(false);
                                                            break;
                                                    }
                                                }
                                            }, id2, r9);
                                            return;
                                        }
                                        String str4 = str2;
                                        int i13 = r9;
                                        l0Var.d();
                                        Bundle bundle = new Bundle();
                                        if (j10 >= 0) {
                                            bundle.putLong("user_id", j10);
                                        } else {
                                            long j12 = -j10;
                                            TLRPC.Chat chat3 = MessagesController.getInstance(launchActivity.O).getChat(Long.valueOf(j12));
                                            if (chat3 != null && chat3.forum) {
                                                final int i14 = 1;
                                                launchActivity.l0(j10, Integer.valueOf(i10), str4, num2, bArr2, new Runnable() { // from class: org.telegram.ui.t80
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i132 = i14;
                                                        l0 l0Var2 = l0Var;
                                                        switch (i132) {
                                                            case 0:
                                                                Pattern pattern = LaunchActivity.C1;
                                                                l0Var2.c(false);
                                                                break;
                                                            default:
                                                                Pattern pattern2 = LaunchActivity.C1;
                                                                l0Var2.c(false);
                                                                break;
                                                        }
                                                    }
                                                }, id2, i13);
                                                return;
                                            }
                                            bundle.putLong("chat_id", j12);
                                        }
                                        bundle.putInt("message_id", i10);
                                        org.telegram.ui.ActionBar.n2 n2Var2 = !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.n2) i2.e.h(1, arrayList) : n2Var;
                                        if (n2Var2 == null || MessagesController.getInstance(launchActivity.O).checkCanOpenChat(bundle, n2Var2)) {
                                            AndroidUtilities.runOnUIThread(new s80(launchActivity, bundle, bArr2, i10, num2, str4, i13, j10, l0Var, n2Var2));
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
                                org.telegram.ui.Components.xc.a0(qnVar).Q(R.raw.error, 36, LocaleController.getString((message52 == null && (messageReplyHeader3 = message52.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
                            } else {
                                messageObject2.replyTextRevealed = true;
                                qnVar.vc(messageObject2, true);
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
                    org.telegram.ui.Components.xc.a0(qnVar).Q(R.raw.error, 36, LocaleController.getString((message522 == null && (messageReplyHeader3 = message522.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
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
                org.telegram.ui.Components.xc.a0(qnVar).Q(R.raw.error, 36, LocaleController.getString((message5222 == null && (messageReplyHeader3 = message5222.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
            }
            num = null;
        }
        bArr = null;
        str = null;
        long j1122 = qnVar.T5;
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
        org.telegram.ui.Components.xc.a0(qnVar).Q(R.raw.error, 36, LocaleController.getString((message52222 == null && (messageReplyHeader3 = message52222.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void S(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        MessageObject messageObject;
        if (chat == null) {
            return;
        }
        qn qnVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
        if (kVar.t() || qnVar.F9()) {
            qn.c2(qnVar, u1Var, true, f7, f10);
            return;
        }
        if (z10 || !chat.signature_profiles || (messageObject = u1Var.getMessageObject()) == null || messageObject.getDialogId() == UserObject.REPLY_BOT) {
            o(u1Var, chat, i10, z10);
        } else {
            qnVar.sa(DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean S0(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
        MessageObject messageObject = (currentMessagesGroup == null || currentMessagesGroup.messages.isEmpty()) ? u1Var.getMessageObject() : currentMessagesGroup.messages.get(0);
        if (messageObject != null) {
            qn qnVar = this.a;
            boolean z11 = !qnVar.jc && messageObject.getId() == qnVar.ic;
            if (!z10) {
                return z11;
            }
            if (z11 && System.currentTimeMillis() - qnVar.kc > 1000) {
                return true;
            }
        }
        return false;
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
    public final boolean S1(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem) {
        vc1 vc1Var;
        TLRPC.TodoItem todoItem2;
        TLRPC.TodoCompletion todoCompletion;
        vc1 vc1Var2;
        MessageObject messageObject;
        vc1 vc1Var3;
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
        yc1 yc1Var;
        ArrayList arrayList3;
        qn qnVar;
        MessageObject messageObject4;
        int size;
        int i11;
        ViewGroup viewGroup;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        final qn qnVar2 = this.a;
        if (qnVar2.getParentActivity() != null && qnVar2.getParentActivity() != null) {
            ei.x3 x3Var = qnVar2.x1;
            if (x3Var != null && x3Var.V) {
                x3Var.e(true);
            }
            pl plVar = qnVar2.B1;
            if (plVar != null && plVar.V) {
                plVar.e(true);
            }
            MessageObject primaryMessageObject = u1Var.getPrimaryMessageObject();
            TLRPC.MessageMedia media = MessageObject.getMedia(primaryMessageObject);
            if (primaryMessageObject != null && (media instanceof TLRPC.TL_messageMediaToDo)) {
                qnVar2.d5 = primaryMessageObject;
                qnVar2.e5 = null;
                final yc1 yc1Var2 = new yc1(qnVar2.getParentActivity(), qnVar2.getResourceProvider());
                final int i12 = todoItem.id;
                yc1Var2.K = u1Var;
                yc1Var2.O = i12;
                MessageObject messageObject5 = u1Var.getMessageObject();
                yc1Var2.G = messageObject5;
                yc1Var2.H = messageObject5 != null && messageObject5.isOutOwner();
                org.telegram.ui.Cells.u1 u1Var2 = yc1Var2.K;
                vc1 vc1Var4 = yc1Var2.c;
                if (u1Var2 != null) {
                    yc1Var2.L = qnVar2.s9 - AndroidUtilities.dp(4.0f);
                    yc1Var2.M = u1Var.n;
                    if (u1Var.getParent() instanceof View) {
                        View view = (View) u1Var.getParent();
                        yc1Var2.L = view.getY() + yc1Var2.L;
                        yc1Var2.M = view.getY() + yc1Var2.M;
                    }
                    int width = yc1Var2.K.getWidth();
                    int height = yc1Var2.K.getHeight();
                    yc1Var2.K.getHeight();
                    vc1Var = vc1Var4;
                    wc1 wc1Var = new wc1(yc1Var2, yc1Var2.getContext(), UserConfig.selectedAccount, yc1Var2.K.getResourcesProvider(), i12, width, height);
                    yc1Var2.I = wc1Var;
                    yc1Var2.K.h1(wc1Var);
                    yc1Var2.I.i1(yc1Var2.K);
                    yc1Var2.I.setDelegate(new xc1(yc1Var2));
                    wc1 wc1Var2 = yc1Var2.I;
                    MessageObject messageObject6 = yc1Var2.G;
                    MessageObject.GroupedMessages currentMessagesGroup = yc1Var2.K.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.u1 u1Var3 = yc1Var2.K;
                    wc1Var2.X3(messageObject6, currentMessagesGroup, u1Var3.F, u1Var3.E, u1Var3.G, false);
                    vc1Var.addView(yc1Var2.I, new FrameLayout.LayoutParams(yc1Var2.K.getWidth(), height, 51));
                    pv0 pv0Var = new pv0(yc1Var2.getContext(), UserConfig.selectedAccount, yc1Var2.K.getResourcesProvider(), width, height, 1);
                    yc1Var2.J = pv0Var;
                    yc1Var2.K.j1(pv0Var);
                    yc1Var2.K.h1(yc1Var2.J);
                    yc1Var2.J.i1(yc1Var2.K);
                    yc1Var2.J.setDelegate(new t7.u(18));
                    pv0 pv0Var2 = yc1Var2.J;
                    MessageObject messageObject7 = yc1Var2.G;
                    MessageObject.GroupedMessages currentMessagesGroup2 = yc1Var2.K.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.u1 u1Var4 = yc1Var2.K;
                    pv0Var2.X3(messageObject7, currentMessagesGroup2, u1Var4.F, u1Var4.E, u1Var4.G, false);
                    vc1Var.addView(yc1Var2.J, new FrameLayout.LayoutParams(yc1Var2.K.getWidth(), height, 51));
                } else {
                    vc1Var = vc1Var4;
                }
                ei.h1 h1Var = yc1Var2.e;
                h1Var.bringToFront();
                vc1 vc1Var5 = yc1Var2.d;
                vc1Var5.bringToFront();
                yc1Var2.h.bringToFront();
                h1Var.w(false);
                org.telegram.ui.ActionBar.d6 d6Var = yc1Var2.a;
                org.telegram.ui.Components.i80 F = org.telegram.ui.Components.i80.F(vc1Var, d6Var, null);
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) MessageObject.getMedia(yc1Var2.G);
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
                if (!yc1Var2.G.canCompleteTodo()) {
                    vc1Var2 = vc1Var5;
                } else if (todoCompletion != null) {
                    vc1Var2 = vc1Var5;
                    F.p(14, -1, LocaleController.formatTodoCompletedDate(todoCompletion.date));
                    F.k();
                    final int i15 = 1;
                    F.c(R.drawable.msg_cancel, LocaleController.getString(R.string.TodoUncheck), new Runnable() { // from class: org.telegram.ui.qc1
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    qn qnVar3 = qnVar2;
                                    fv0 fv0Var = new fv0(qnVar3);
                                    yc1 yc1Var3 = yc1Var2;
                                    fv0Var.p0(MessageObject.getMedia(yc1Var3.G), false, i12);
                                    fv0Var.e0 = new en0(20, yc1Var3, qnVar3);
                                    qnVar3.presentFragment(fv0Var);
                                    yc1Var3.c(false);
                                    break;
                                case 1:
                                    boolean c10 = qnVar2.c();
                                    yc1 yc1Var4 = yc1Var2;
                                    if (c10) {
                                        Toast.makeText(yc1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                                    } else {
                                        wc1 wc1Var3 = yc1Var4.I;
                                        wc1Var3.k4(wc1Var3.O2(i12), false);
                                    }
                                    yc1Var4.c(true);
                                    break;
                                default:
                                    boolean c11 = qnVar2.c();
                                    yc1 yc1Var5 = yc1Var2;
                                    if (c11) {
                                        Toast.makeText(yc1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                                    } else {
                                        wc1 wc1Var4 = yc1Var5.I;
                                        wc1Var4.k4(wc1Var4.O2(i12), false);
                                    }
                                    yc1Var5.c(true);
                                    break;
                            }
                        }
                    }, false);
                } else {
                    vc1Var2 = vc1Var5;
                    final int i16 = 2;
                    F.c(R.drawable.msg_select, LocaleController.getString(R.string.TodoCheck), new Runnable() { // from class: org.telegram.ui.qc1
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i16) {
                                case 0:
                                    qn qnVar3 = qnVar2;
                                    fv0 fv0Var = new fv0(qnVar3);
                                    yc1 yc1Var3 = yc1Var2;
                                    fv0Var.p0(MessageObject.getMedia(yc1Var3.G), false, i12);
                                    fv0Var.e0 = new en0(20, yc1Var3, qnVar3);
                                    qnVar3.presentFragment(fv0Var);
                                    yc1Var3.c(false);
                                    break;
                                case 1:
                                    boolean c10 = qnVar2.c();
                                    yc1 yc1Var4 = yc1Var2;
                                    if (c10) {
                                        Toast.makeText(yc1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                                    } else {
                                        wc1 wc1Var3 = yc1Var4.I;
                                        wc1Var3.k4(wc1Var3.O2(i12), false);
                                    }
                                    yc1Var4.c(true);
                                    break;
                                default:
                                    boolean c11 = qnVar2.c();
                                    yc1 yc1Var5 = yc1Var2;
                                    if (c11) {
                                        Toast.makeText(yc1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                                    } else {
                                        wc1 wc1Var4 = yc1Var5.I;
                                        wc1Var4.k4(wc1Var4.O2(i12), false);
                                    }
                                    yc1Var5.c(true);
                                    break;
                            }
                        }
                    }, false);
                }
                if (todoItem2 != null) {
                    F.c(R.drawable.menu_reply, LocaleController.getString(R.string.TodoItemQuote), new f71(yc1Var2, qnVar2, todoItem2, 3), false);
                    if (yc1Var2.G.getDialogId() < 0) {
                        MessagesController messagesController = MessagesController.getInstance(yc1Var2.G.currentAccount);
                        String publicUsername = DialogObject.getPublicUsername(messagesController.getUserOrChat(yc1Var2.G.getDialogId()));
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(messagesController.linkPrefix);
                        sb2.append("/");
                        if (TextUtils.isEmpty(publicUsername)) {
                            StringBuilder sb3 = new StringBuilder("c/");
                            messageObject = primaryMessageObject;
                            vc1Var3 = vc1Var2;
                            sb3.append(-yc1Var2.G.getDialogId());
                            publicUsername = sb3.toString();
                        } else {
                            messageObject = primaryMessageObject;
                            vc1Var3 = vc1Var2;
                        }
                        sb2.append(publicUsername);
                        sb2.append("/");
                        sb2.append(yc1Var2.G.getId());
                        sb2.append("?task=");
                        sb2.append(todoItem2.id);
                        F.c(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new k71(10, yc1Var2, sb2.toString()), false);
                    } else {
                        messageObject = primaryMessageObject;
                        vc1Var3 = vc1Var2;
                    }
                    F.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new k71(11, yc1Var2, todoItem2), false);
                } else {
                    messageObject = primaryMessageObject;
                    vc1Var3 = vc1Var2;
                }
                if (yc1Var2.G.canEditMessage(qnVar2.e)) {
                    final int i17 = 0;
                    F.c(R.drawable.msg_edit, LocaleController.getString(R.string.TodoEditItem), new Runnable() { // from class: org.telegram.ui.qc1
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i17) {
                                case 0:
                                    qn qnVar3 = qnVar2;
                                    fv0 fv0Var = new fv0(qnVar3);
                                    yc1 yc1Var3 = yc1Var2;
                                    fv0Var.p0(MessageObject.getMedia(yc1Var3.G), false, i13);
                                    fv0Var.e0 = new en0(20, yc1Var3, qnVar3);
                                    qnVar3.presentFragment(fv0Var);
                                    yc1Var3.c(false);
                                    break;
                                case 1:
                                    boolean c10 = qnVar2.c();
                                    yc1 yc1Var4 = yc1Var2;
                                    if (c10) {
                                        Toast.makeText(yc1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                                    } else {
                                        wc1 wc1Var3 = yc1Var4.I;
                                        wc1Var3.k4(wc1Var3.O2(i13), false);
                                    }
                                    yc1Var4.c(true);
                                    break;
                                default:
                                    boolean c11 = qnVar2.c();
                                    yc1 yc1Var5 = yc1Var2;
                                    if (c11) {
                                        Toast.makeText(yc1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                                    } else {
                                        wc1 wc1Var4 = yc1Var5.I;
                                        wc1Var4.k4(wc1Var4.O2(i13), false);
                                    }
                                    yc1Var5.c(true);
                                    break;
                            }
                        }
                    }, false);
                    if (tL_messageMediaToDo.todo.list.size() > 1) {
                        i10 = 51;
                        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.TodoDeleteItem), new org.telegram.ui.Components.cz0(yc1Var2, tL_messageMediaToDo, i12, qnVar2, 13), false);
                        F.T(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, d6Var)));
                        eh.e k10 = fh.c.k(d6Var);
                        bh.b bVar = yc1Var2.F;
                        F.Q(bVar, k10, false);
                        F.Y();
                        ViewGroup viewGroup2 = F.A;
                        yc1Var2.Q = viewGroup2;
                        viewGroup2.setPivotX(0.0f);
                        yc1Var2.Q.setPivotY(0.0f);
                        vc1Var3.addView(yc1Var2.Q, w7.z5.e(-2, -2, i10));
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        qnVar2.q8(messageObject, arrayList4, arrayList5, arrayList6);
                        xe xeVar2 = new xe(qnVar2, 10);
                        messageObject2 = yc1Var2.G;
                        List<TLRPC.TL_availableReaction> enabledReactionsList = qnVar2.getMediaDataController().getEnabledReactionsList();
                        boolean z15 = qnVar2.x() && !qnVar2.c() && qnVar2.f == null && messageObject2.hasReactions() && !((ChatObject.isChannel(qnVar2.e) && !qnVar2.e.megagroup) || ChatObject.isMonoForum(qnVar2.e) || enabledReactionsList.isEmpty() || !messageObject2.messageOwner.reactions.can_see_list || messageObject2.isSecretMedia());
                        if (messageObject2.isForwardedChannelPost()) {
                            z10 = z15;
                            if (!messageObject2.isSecretMedia()) {
                                if (qnVar2.R3 != 5) {
                                    if (!qnVar2.x()) {
                                        if (!qnVar2.c()) {
                                            if (messageObject2.isReactionsAvailable()) {
                                                TLRPC.ChatFull chatFull2 = qnVar2.Z7;
                                                if (chatFull2 != null) {
                                                    if (chatFull2.available_reactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    }
                                                }
                                                if (chatFull2 == null) {
                                                }
                                                if (qnVar2.f == null) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            z11 = false;
                        } else {
                            z10 = z15;
                            TLRPC.ChatFull chatFull3 = qnVar2.getMessagesController().getChatFull(-messageObject2.getFromChatId());
                            if (chatFull3 != null) {
                                if (!qnVar2.x()) {
                                    if (qnVar2.R3 != 5) {
                                        if (!qnVar2.c()) {
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
                        z12 = (!z10 || qnVar2.c() || qnVar2.e == null || !messageObject2.isOutOwner() || !messageObject2.isSent() || messageObject2.isEditing() || messageObject2.isSending() || messageObject2.isSendError() || messageObject2.isContentUnread() || messageObject2.isUnread() || ConnectionsManager.getInstance(qnVar2.getCurrentAccount()).getCurrentTime() - messageObject2.messageOwner.date >= qnVar2.getMessagesController().chatReadMarkExpirePeriod || (!ChatObject.isMegagroup(qnVar2.e) && ChatObject.isChannel(qnVar2.e)) || (chatFull = qnVar2.Z7) == null || chatFull.participants_count > qnVar2.getMessagesController().chatReadMarkSizeThreshold || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || qnVar2.R3 == 3 || !messageObject2.canSetReaction() || ChatObject.isMonoForum(qnVar2.e)) ? false : true;
                        if (qnVar2.e != null && !messageObject2.isOut() && ChatObject.isMonoForum(qnVar2.e) && ChatObject.canManageMonoForum(qnVar2.getCurrentAccount(), qnVar2.e)) {
                            int i18 = ((-qnVar2.e.linked_monoforum_id) > messageObject2.getFromChatId() ? 1 : ((-qnVar2.e.linked_monoforum_id) == messageObject2.getFromChatId() ? 0 : -1));
                        }
                        if (!z10 && qnVar2.e == null && qnVar2.h == null && (user = qnVar2.f) != null && !UserObject.isUserSelf(user) && !UserObject.isReplyUser(qnVar2.f) && !UserObject.isAnonymous(qnVar2.f)) {
                            user2 = qnVar2.f;
                            if (!user2.bot && !UserObject.isService(user2.id) && (((userFull = qnVar2.a8) == null || !userFull.read_dates_private) && !qnVar2.c() && messageObject2.isOutOwner() && messageObject2.isSent() && !messageObject2.isEditing() && !messageObject2.isSending() && !messageObject2.isSendError() && !messageObject2.isContentUnread() && !messageObject2.isUnread() && qnVar2.getConnectionsManager().getCurrentTime() - messageObject2.messageOwner.date < qnVar2.getMessagesController().pmReadDateExpirePeriod && !(messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                                z13 = true;
                                TLRPC.User user3 = qnVar2.f;
                                boolean z17 = ((user3 == null && (UserObject.isReplyUser(user3) || UserObject.isAnonymous(qnVar2.f))) || qnVar2.c() || !messageObject2.isEdited() || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                                org.telegram.ui.Components.i80 G = org.telegram.ui.Components.i80.G(yc1Var2.c, qnVar2.getResourceProvider(), null, !z10 || z12);
                                if (z12) {
                                    xeVar = xeVar2;
                                    messageObject3 = messageObject2;
                                    z14 = z16;
                                    arrayList = arrayList4;
                                    arrayList2 = arrayList5;
                                    yc1Var = yc1Var2;
                                    arrayList3 = arrayList6;
                                    qnVar = qnVar2;
                                    if (z13) {
                                        G.r(new org.telegram.ui.Components.tc0(yc1Var.getContext(), 0, messageObject3, new pc1(yc1Var, 0), yc1Var.a), w7.z5.n(-1, 36));
                                        G.k();
                                    } else if (z17) {
                                        messageObject4 = messageObject3;
                                        G.r(new org.telegram.ui.Components.tc0(yc1Var.getContext(), 1, messageObject3, new pc1(yc1Var, 2), yc1Var.a), w7.z5.n(-1, 36));
                                        G.k();
                                        i11 = 0;
                                        for (size = arrayList.size(); i11 < size; size = size) {
                                            G.c(((Integer) arrayList.get(i11)).intValue(), (CharSequence) arrayList2.get(i11), new org.telegram.ui.Components.y31(yc1Var, xeVar, ((Integer) arrayList3.get(i11)).intValue(), 15), false);
                                            i11++;
                                            arrayList3 = arrayList3;
                                        }
                                        G.T(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, d6Var)));
                                        G.Q(bVar, fh.c.k(d6Var), false);
                                        G.Y();
                                        ViewGroup viewGroup3 = G.A;
                                        yc1Var.S = viewGroup3;
                                        viewGroup3.setPivotX(0.0f);
                                        yc1Var.S.setPivotY(0.0f);
                                        ViewGroup viewGroup4 = yc1Var.S;
                                        FrameLayout.LayoutParams e = w7.z5.e(-2, -2, 51);
                                        vc1 vc1Var6 = yc1Var.d;
                                        vc1Var6.addView(viewGroup4, e);
                                        viewGroup = yc1Var.S;
                                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new pp0(yc1Var, 21));
                                            yc1Var.S.setOnTouchListener(new e0(yc1Var, 7));
                                        }
                                        if (z14) {
                                            qn qnVar3 = qnVar;
                                            org.telegram.ui.Components.dl0 dl0Var = new org.telegram.ui.Components.dl0((qnVar.getUserConfig().getClientUserId() > qnVar.a() ? 1 : (qnVar.getUserConfig().getClientUserId() == qnVar.a() ? 0 : -1)) == 0 ? 3 : 0, qnVar3.getCurrentAccount(), yc1Var.getContext(), qnVar3, yc1Var.a);
                                            dl0Var.a = true;
                                            float f7 = 22;
                                            dl0Var.setPadding(AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : 24), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 24 : 0), AndroidUtilities.dp(f7));
                                            dl0Var.setDelegate(new uc1(yc1Var, qnVar3, messageObject4, dl0Var));
                                            yc1Var.P = dl0Var;
                                            vc1Var6.addView(dl0Var, w7.z5.e(-2, (int) ((dl0Var.getTopOffset() / AndroidUtilities.density) + 52.0f + f7), 51));
                                            dl0Var.p(messageObject4, qnVar3.Z7, true);
                                            yc1Var.P.setTransitionProgress(1.0f);
                                        }
                                        yc1Var.e();
                                        yc1Var.c0 = new nm(this, 5);
                                        yc1Var.show();
                                        return true;
                                    }
                                } else {
                                    qh0 qh0Var = new qh0(yc1Var2.getContext(), qnVar2.getCurrentAccount(), messageObject2, qnVar2.e);
                                    FrameLayout frameLayout = new FrameLayout(yc1Var2.getContext());
                                    frameLayout.addView(qh0Var, w7.z5.c(36.0f, -1));
                                    org.telegram.ui.Components.i80 J = G.J();
                                    org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, yc1Var2.getContext(), yc1Var2.a, true, false);
                                    e1Var.setItemHeight(44);
                                    e1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                                    e1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                                    FrameLayout frameLayout2 = new FrameLayout(yc1Var2.getContext());
                                    LinearLayout linearLayout = new LinearLayout(yc1Var2.getContext());
                                    linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, d6Var));
                                    linearLayout.setOrientation(1);
                                    qnVar = qnVar2;
                                    org.telegram.ui.Components.jm0 a2 = qh0Var.a();
                                    frameLayout2.addView(e1Var);
                                    linearLayout.addView(frameLayout2);
                                    z14 = z16;
                                    linearLayout.addView(new org.telegram.ui.ActionBar.j1(yc1Var2.getContext(), d6Var), w7.z5.n(-1, 8));
                                    frameLayout2.setOnClickListener(new sc1(G));
                                    messageObject3 = messageObject2;
                                    xeVar = xeVar2;
                                    arrayList = arrayList4;
                                    arrayList2 = arrayList5;
                                    tc1 tc1Var = new tc1(yc1Var2, qh0Var, qnVar, a2, linearLayout, G, J);
                                    G = G;
                                    yc1Var = yc1Var2;
                                    qh0Var.setOnClickListener(tc1Var);
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
                                G.T(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, d6Var)));
                                G.Q(bVar, fh.c.k(d6Var), false);
                                G.Y();
                                ViewGroup viewGroup32 = G.A;
                                yc1Var.S = viewGroup32;
                                viewGroup32.setPivotX(0.0f);
                                yc1Var.S.setPivotY(0.0f);
                                ViewGroup viewGroup42 = yc1Var.S;
                                FrameLayout.LayoutParams e7 = w7.z5.e(-2, -2, 51);
                                vc1 vc1Var62 = yc1Var.d;
                                vc1Var62.addView(viewGroup42, e7);
                                viewGroup = yc1Var.S;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                }
                                if (z14) {
                                }
                                yc1Var.e();
                                yc1Var.c0 = new nm(this, 5);
                                yc1Var.show();
                                return true;
                            }
                        }
                        z13 = false;
                        TLRPC.User user32 = qnVar2.f;
                        if (user32 == null) {
                        }
                        org.telegram.ui.Components.i80 G2 = org.telegram.ui.Components.i80.G(yc1Var2.c, qnVar2.getResourceProvider(), null, !z10 || z12);
                        if (z12) {
                        }
                        messageObject4 = messageObject3;
                        i11 = 0;
                        while (i11 < size) {
                        }
                        G2.T(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, d6Var)));
                        G2.Q(bVar, fh.c.k(d6Var), false);
                        G2.Y();
                        ViewGroup viewGroup322 = G2.A;
                        yc1Var.S = viewGroup322;
                        viewGroup322.setPivotX(0.0f);
                        yc1Var.S.setPivotY(0.0f);
                        ViewGroup viewGroup422 = yc1Var.S;
                        FrameLayout.LayoutParams e72 = w7.z5.e(-2, -2, 51);
                        vc1 vc1Var622 = yc1Var.d;
                        vc1Var622.addView(viewGroup422, e72);
                        viewGroup = yc1Var.S;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z14) {
                        }
                        yc1Var.e();
                        yc1Var.c0 = new nm(this, 5);
                        yc1Var.show();
                        return true;
                    }
                }
                i10 = 51;
                F.T(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, d6Var)));
                eh.e k102 = fh.c.k(d6Var);
                bh.b bVar2 = yc1Var2.F;
                F.Q(bVar2, k102, false);
                F.Y();
                ViewGroup viewGroup22 = F.A;
                yc1Var2.Q = viewGroup22;
                viewGroup22.setPivotX(0.0f);
                yc1Var2.Q.setPivotY(0.0f);
                vc1Var3.addView(yc1Var2.Q, w7.z5.e(-2, -2, i10));
                ArrayList arrayList42 = new ArrayList();
                ArrayList arrayList52 = new ArrayList();
                ArrayList arrayList62 = new ArrayList();
                qnVar2.q8(messageObject, arrayList42, arrayList52, arrayList62);
                xe xeVar22 = new xe(qnVar2, 10);
                messageObject2 = yc1Var2.G;
                List<TLRPC.TL_availableReaction> enabledReactionsList2 = qnVar2.getMediaDataController().getEnabledReactionsList();
                if (qnVar2.x()) {
                }
                if (messageObject2.isForwardedChannelPost()) {
                }
                boolean z162 = z11;
                if (!z10) {
                }
                if (qnVar2.e != null) {
                    int i182 = ((-qnVar2.e.linked_monoforum_id) > messageObject2.getFromChatId() ? 1 : ((-qnVar2.e.linked_monoforum_id) == messageObject2.getFromChatId() ? 0 : -1));
                }
                if (!z10) {
                    user2 = qnVar2.f;
                    if (!user2.bot) {
                        z13 = true;
                        TLRPC.User user322 = qnVar2.f;
                        if (user322 == null) {
                        }
                        org.telegram.ui.Components.i80 G22 = org.telegram.ui.Components.i80.G(yc1Var2.c, qnVar2.getResourceProvider(), null, !z10 || z12);
                        if (z12) {
                        }
                        messageObject4 = messageObject3;
                        i11 = 0;
                        while (i11 < size) {
                        }
                        G22.T(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, d6Var)));
                        G22.Q(bVar2, fh.c.k(d6Var), false);
                        G22.Y();
                        ViewGroup viewGroup3222 = G22.A;
                        yc1Var.S = viewGroup3222;
                        viewGroup3222.setPivotX(0.0f);
                        yc1Var.S.setPivotY(0.0f);
                        ViewGroup viewGroup4222 = yc1Var.S;
                        FrameLayout.LayoutParams e722 = w7.z5.e(-2, -2, 51);
                        vc1 vc1Var6222 = yc1Var.d;
                        vc1Var6222.addView(viewGroup4222, e722);
                        viewGroup = yc1Var.S;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z14) {
                        }
                        yc1Var.e();
                        yc1Var.c0 = new nm(this, 5);
                        yc1Var.show();
                        return true;
                    }
                }
                z13 = false;
                TLRPC.User user3222 = qnVar2.f;
                if (user3222 == null) {
                }
                org.telegram.ui.Components.i80 G222 = org.telegram.ui.Components.i80.G(yc1Var2.c, qnVar2.getResourceProvider(), null, !z10 || z12);
                if (z12) {
                }
                messageObject4 = messageObject3;
                i11 = 0;
                while (i11 < size) {
                }
                G222.T(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, d6Var)));
                G222.Q(bVar2, fh.c.k(d6Var), false);
                G222.Y();
                ViewGroup viewGroup32222 = G222.A;
                yc1Var.S = viewGroup32222;
                viewGroup32222.setPivotX(0.0f);
                yc1Var.S.setPivotY(0.0f);
                ViewGroup viewGroup42222 = yc1Var.S;
                FrameLayout.LayoutParams e7222 = w7.z5.e(-2, -2, 51);
                vc1 vc1Var62222 = yc1Var.d;
                vc1Var62222.addView(viewGroup42222, e7222);
                viewGroup = yc1Var.S;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z14) {
                }
                yc1Var.e();
                yc1Var.c0 = new nm(this, 5);
                yc1Var.show();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void T(org.telegram.ui.Cells.u1 u1Var) {
        h(u1Var, true, true, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void T0(org.telegram.ui.Cells.u1 u1Var) {
        qn qnVar = this.a;
        qnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(qnVar.T5), u1Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void U1(org.telegram.ui.Cells.u1 u1Var) {
        TLRPC.Chat chat;
        TLRPC.User currentUser = u1Var.getCurrentUser();
        qn qnVar = this.a;
        if (!AndroidUtilities.isContextSafe(qnVar.getParentActivity()) || (chat = qnVar.e) == null || currentUser == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return;
        }
        d(u1Var, qnVar.getMessagesController().getParticipant(qnVar.e.id, currentUser.id));
    }

    @Override // org.telegram.ui.Cells.l1
    public final int V() {
        return this.a.R3;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void V0(org.telegram.ui.Cells.u1 u1Var) {
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
        qn qnVar = this.a;
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
                        int childCount = qnVar.x0.getChildCount();
                        for (int i11 = 0; i11 < childCount; i11++) {
                            View childAt = qnVar.x0.getChildAt(i11);
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
        qnVar.Ob(messageObject, spannableStringBuilder, 1);
        u1Var.g4(1, false, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final ih.a W() {
        return this.a.Qb;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void W1(org.telegram.ui.Cells.u1 u1Var, long j10) {
        Bundle b10 = zf.d0.b(j10, "user_id");
        org.telegram.ui.ActionBar.n2 n2Var = this.a;
        if (n2Var.getMessagesController().checkCanOpenChat(b10, n2Var, u1Var.getMessageObject())) {
            n2Var.presentFragment(new qn(b10));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean Z(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var == null ? null : u1Var.getMessageObject();
        if (messageObject == null || messageObject.messageOwner == null) {
            return false;
        }
        qn qnVar = this.a;
        return (qnVar.R3 == 1 || qnVar.D9() || messageObject.messageOwner.noforwards || messageObject.type == 29) ? false : true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean Z0(int i10, org.telegram.ui.Cells.u1 u1Var) {
        qn qnVar = this.a;
        return qnVar.wb != 0 && u1Var.getMessageObject() != null && qnVar.wb == u1Var.getMessageObject().getId() && qnVar.xb == i10;
    }

    public final void a(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        qn qnVar = this.a;
        fk fkVar = qnVar.Y;
        if (fkVar != null) {
            CharSequence fieldText = fkVar.getFieldText();
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
                qnVar.Y.setFieldText(spannableStringBuilder);
                AndroidUtilities.runOnUIThread(new nm(this, 6), 200L);
            }
        }
    }

    public final void b(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        qn qnVar = this.a;
        fk fkVar = qnVar.Y;
        if (fkVar != null) {
            CharSequence fieldText = fkVar.getFieldText();
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
                SpannableString spannableString = new SpannableString(r4.c.u(UserObject.getFirstName(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.o61("" + user.id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            qnVar.Y.setFieldText(spannableStringBuilder);
            AndroidUtilities.runOnUIThread(new nm(this, 7), 200L);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean b2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
        MessageObject messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (u1Var == null || pageBlock == null) {
            return false;
        }
        qn qnVar = this.a;
        if (qnVar.getParentActivity() == null || (messageObject = u1Var.getMessageObject()) == null || (message = messageObject.messageOwner) == null || messageObject.richLayout == null || (richMessage = message.rich_message) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        messageObject.richLayout.collectMediaBlocks(arrayList);
        int indexOf = arrayList.indexOf(pageBlock);
        if (indexOf < 0) {
            return false;
        }
        PhotoViewer u12 = PhotoViewer.u1();
        u12.M2(null, qnVar, null);
        return u12.g2(null, null, null, null, null, null, null, indexOf, new mm(qnVar, arrayList), null, 0L, 0L, 0L, true, new lm(richMessage, arrayList, messageObject), null);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z10;
        qn qnVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
        if (kVar == null) {
            return false;
        }
        kVar2 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
        if (kVar2.t() || qnVar.F9()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.n2) qnVar).inPreviewMode;
        return !z10;
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
        c5 b10;
        int i11;
        jk jkVar;
        ik ikVar;
        if (!k()) {
            return false;
        }
        qn qnVar = this.a;
        ?? r22 = (qnVar.e == null || ((jkVar = qnVar.O0) != null && jkVar.getVisibility() == 0) || ((ikVar = qnVar.R) != null && ikVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat = qnVar.e;
        ?? r42 = (chat == null || !(qnVar.d4 == 0 || qnVar.h4) || (ChatObject.isChannel(chat) && !qnVar.e.megagroup)) ? 0 : 1;
        i5[] i5VarArr = new i5[r22 + 2 + r42];
        i5VarArr[0] = i5.d;
        i5VarArr[1] = i5.h;
        char c10 = 2;
        if (r22 != 0) {
            i5VarArr[2] = i5.n;
            c10 = 3;
        }
        if (r42 != 0) {
            i5VarArr[c10] = i5.r;
        }
        TLRPC.UserFull userFull = qnVar.getMessagesController().getUserFull(user.id);
        if (userFull != null) {
            b10 = c5.c(user, userFull, i5VarArr);
            if (!c2.b.g(b10)) {
                i11 = ((org.telegram.ui.ActionBar.n2) qnVar).classGuid;
                b10 = c5.b(user, i11, i5VarArr);
            }
        } else {
            i10 = ((org.telegram.ui.ActionBar.n2) qnVar).classGuid;
            b10 = c5.b(user, i10, i5VarArr);
        }
        if (c2.b.g(b10)) {
            c2.b.m().y((ViewGroup) qnVar.fragmentView, qnVar.ea, b10, new e7(this, u1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(qnVar, u1Var);
        final int i12 = 0;
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(this) { // from class: org.telegram.ui.pm
            public final /* synthetic */ cn b;

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
                        this.b.b(user);
                        break;
                    default:
                        this.b.a.ra(user);
                        break;
                }
            }
        }, false);
        H.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new t1(this, u1Var, user, 25), false);
        final int i13 = 1;
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new Runnable(this) { // from class: org.telegram.ui.pm
            public final /* synthetic */ cn b;

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
                        this.b.b(user);
                        break;
                    default:
                        this.b.a.ra(user);
                        break;
                }
            }
        }, r22);
        final int i14 = 2;
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new Runnable(this) { // from class: org.telegram.ui.pm
            public final /* synthetic */ cn b;

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
                        this.b.b(user);
                        break;
                    default:
                        this.b.a.ra(user);
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
    public final void c2(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject primaryMessageObject = u1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.a.wc(primaryMessageObject, false);
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
        qn qnVar = this.a;
        qnVar.getUserConfig().getCurrentUser();
        if (!AndroidUtilities.isContextSafe(qnVar.getParentActivity()) || (chat = qnVar.e) == null || currentUser == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
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
                z10 = channelParticipant.promoted_by == qnVar.getUserConfig().getClientUserId();
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
                    z11 = channelParticipant2.promoted_by == qnVar.getUserConfig().getClientUserId();
                } else {
                    z11 = false;
                    z13 = false;
                }
                str2 = channelParticipant2.rank;
                z12 = z11;
                boolean z15 = z13;
                boolean z16 = z14;
                Activity parentActivity = qnVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                long j10 = -qnVar.e.id;
                d6Var = ((org.telegram.ui.ActionBar.n2) qnVar).resourceProvider;
                org.telegram.ui.Components.x01.b(parentActivity, i10, j10, currentUser, str2, z15, z16, z12, d6Var);
            }
            if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                if (ChatObject.isChannel(qnVar.e)) {
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                    qnVar.getMessagesController();
                    tL_channels_getParticipant.channel = MessagesController.getInputChannel(qnVar.e);
                    tL_channels_getParticipant.participant = qnVar.getMessagesController().getInputPeer(currentUser.id);
                    qnVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new org.telegram.messenger.a(), new ai.r5(11, this, u1Var));
                    return;
                }
                return;
            }
            if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                z10 = false;
                z14 = true;
            } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                z10 = ((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == qnVar.getUserConfig().getClientUserId();
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
        Activity parentActivity2 = qnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
        long j102 = -qnVar.e.id;
        d6Var = ((org.telegram.ui.ActionBar.n2) qnVar).resourceProvider;
        org.telegram.ui.Components.x01.b(parentActivity2, i10, j102, currentUser, str2, z152, z162, z12, d6Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void d0(int i10) {
        int i11;
        SpannableStringBuilder replaceTags;
        int i12;
        int i13 = 3;
        int i14 = 2;
        int i15 = 1;
        qn qnVar = this.a;
        try {
            if (i10 == 0) {
                qnVar.k7();
                bl blVar = qnVar.z3;
                if (blVar == null) {
                    return;
                }
                blVar.l(0L, 84, null, new nm(this, i15));
                qnVar.z3.performHapticFeedback(3, 2);
                return;
            }
            if (i10 == 1) {
                String formatDateTime = LocaleController.formatDateTime(qnVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                if (qnVar.getMessagesController().transcribeAudioTrialCooldownUntil > 0) {
                    i12 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeftUntil", org.telegram.ui.Components.a41.h(i12), formatDateTime));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeft", org.telegram.ui.Components.a41.h(i11), new Object[0]));
                }
                org.telegram.ui.Components.xc.a0(qnVar).G(R.raw.transcribe, 6, replaceTags).k(true);
                qnVar.fragmentView.performHapticFeedback(3, 2);
                return;
            }
            if (i10 == 2 || i10 == 3) {
                String formatDateTime2 = LocaleController.formatDateTime(qnVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(qnVar);
                int i16 = R.raw.transcribe;
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialEnd", qnVar.getMessagesController().transcribeAudioTrialWeeklyNumber, new Object[0]))).append((CharSequence) " ").append(i10 == 2 ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TranscriptionTrialEndBuy), new nm(this, i14)) : qnVar.getMessagesController().transcribeAudioTrialCooldownUntil <= 0 ? "" : AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TranscriptionTrialEndWaitOrBuy, formatDateTime2), new nm(this, i13)));
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
    public final boolean d1(MessageObject messageObject) {
        dm dmVar;
        long dialogId = messageObject.getDialogId();
        qn qnVar = this.a;
        return (dialogId == UserObject.REPLY_BOT || ((dmVar = qnVar.A0) != null && dmVar.N)) && qnVar.R3 != 7;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean e() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean e0() {
        return this.a.R3 == 0;
    }

    public final void f() {
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        boolean isHuaweiStoreApp = BuildVars.isHuaweiStoreApp();
        qn qnVar = this.a;
        if (isHuaweiStoreApp) {
            pf.d.r(qnVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            pf.d.r(qnVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void f0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        this.a.L7(u1Var, true, false, f7, f10, false, false, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void f1() {
        qn qnVar = this.a;
        qnVar.T7();
        UndoView undoView = qnVar.y3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, qnVar.T5, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public final String g(org.telegram.ui.Cells.u1 u1Var) {
        qn qnVar;
        int i10;
        if (u1Var.getMessageObject() == null || (i10 = (qnVar = this.a).wb) == 0 || i10 != u1Var.getMessageObject().getId() || qnVar.xb != 3) {
            return null;
        }
        return qnVar.zb;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void g2() {
        this.a.w9();
    }

    public final void h(org.telegram.ui.Cells.u1 u1Var, boolean z10, boolean z11, boolean z12) {
        MessageObject primaryMessageObject;
        int i10;
        int i11;
        qj qjVar;
        if (u1Var == null || (primaryMessageObject = u1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.forceUpdate = true;
        qn qnVar = this.a;
        nj njVar = qnVar.x0;
        if (njVar != null && (qjVar = qnVar.z0) != null && qjVar.y < 0) {
            for (int childCount = njVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = qnVar.x0.getChildAt(childCount);
                qnVar.x0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.u1)) {
                        if (childAt instanceof org.telegram.ui.Cells.w0) {
                            i11 = qnVar.Q8(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = qnVar.Q8(childAt);
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
                qj qjVar2 = qnVar.z0;
                qnVar.x0.getClass();
                qjVar2.i1(RecyclerView.R(u1Var), u1Var.getTop() - ((int) qnVar.s9), false);
            } else {
                qnVar.z0.h1(i10, i11);
            }
        }
        qnVar.N0 = z11;
        qnVar.wc(primaryMessageObject, false);
        qnVar.N0 = false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final int h0(org.telegram.ui.Cells.u1 u1Var) {
        rh.c cVar;
        qn qnVar = this.a;
        if (!qnVar.xc.f || (cVar = qnVar.Dc) == null || cVar.n != u1Var || cVar.a.getWidth() <= 0) {
            return 0;
        }
        return qnVar.Dc.a.getHeight();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void h1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        qn qnVar = this.a;
        if (qnVar.E9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) ag.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        if (qnVar.getParentActivity() != null) {
            if (qnVar.O0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                fk fkVar = qnVar.Y;
                MessageObject messageObject = u1Var.getMessageObject();
                MessageObject messageObject2 = u1Var.getMessageObject();
                qi qiVar = null;
                String str = tL_inlineButtonTypeUrl != null ? tL_inlineButtonTypeUrl.url : null;
                pf.c cVar = qnVar.Ab;
                if (cVar != null) {
                    cVar.a(true);
                    qnVar.Ab = null;
                }
                if (str == null || u1Var.getMessageObject() == null) {
                    qnVar.Ab = null;
                } else {
                    qi qiVar2 = new qi(qnVar, u1Var.getMessageObject().getId(), str, u1Var, 1);
                    qnVar.Ab = qiVar2;
                    qiVar = qiVar2;
                }
                fkVar.a0(keyboardButtonProto, messageObject, messageObject2, qiVar);
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void i(org.telegram.ui.Cells.u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        int a2 = rh.i.a(messageObject);
        boolean a10 = w7.j6.a(a2, 7);
        qn qnVar = this.a;
        if (a10) {
            org.telegram.ui.Components.xc.a0(qnVar).Q(R.raw.e_hand_2, 36, rh.i.b(messageObject, a2)).j();
            return;
        }
        if (i10 < 0 && !arrayList.isEmpty()) {
            qnVar.getSendMessagesHelper().sendVote(messageObject, arrayList, null);
            u1Var.S0(true);
            return;
        }
        if (qnVar.getParentActivity() == null) {
            return;
        }
        if (qnVar.n2 == null) {
            org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(5, qnVar.getParentActivity(), qnVar.ea, false);
            qnVar.n2 = r40Var;
            r40Var.setAlpha(0.0f);
            qnVar.n2.setVisibility(4);
            int indexOfChild = qnVar.X0.indexOfChild(qnVar.S);
            if (indexOfChild == -1) {
                return;
            } else {
                qnVar.X0.addView(qnVar.n2, indexOfChild + 1, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
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
                float y3 = ((u1Var.getY() + s1Var.b) - AndroidUtilities.dp(4.0f)) - qnVar.s9;
                qnVar.q2 = AndroidUtilities.dp(13.3f) + s1Var.a;
                int D = org.telegram.messenger.mk.D(6.0f, s1Var.b, i12);
                qnVar.r2 = D;
                if (y3 > 0.0f) {
                    i15 = qnVar.q2;
                    i13 = D;
                    f7 = 0.0f;
                    break;
                }
                i16++;
                f7 = y3;
            }
            if (f7 != 0.0f) {
                qnVar.x0.v0(0, (int) f7, null);
                qnVar.p2 = u1Var;
                return;
            }
            i14 = i15;
        }
        qnVar.n2.e(u1Var, Integer.valueOf(i10), i14, i13, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void i0(org.telegram.ui.Cells.u1 u1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        qn qnVar = this.a;
        if (qnVar.getParentActivity() == null) {
            return;
        }
        if (qnVar.X9 == null) {
            vh.i iVar = new vh.i(qnVar.getParentActivity());
            qnVar.X9 = iVar;
            qnVar.X0.addView(iVar, w7.z5.e(-1, -1, 48));
        }
        vh.i iVar2 = qnVar.X9;
        HashMap hashMap = iVar2.a;
        ArrayList arrayList = iVar2.c;
        arrayList.clear();
        int i10 = iVar2.d;
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
        String b10 = vh.i.b(u1Var);
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
        vh.h hVar = new vh.h(iVar2, u1Var, arrayList4, new u2.j0(10, iVar2, b10));
        hVar.setBounds(0, 0, iVar2.getMeasuredWidth(), iVar2.getMeasuredHeight());
        hVar.setCallback(iVar2);
        if (hashMap.containsKey(b10)) {
            return;
        }
        hashMap.put(b10, hVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void i2(org.telegram.ui.Cells.u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.a.Z7(u1Var, reactionCount, z10, f7, f10);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void j() {
        f();
    }

    public final boolean k() {
        qn qnVar = this.a;
        if (UserObject.isUserSelf(qnVar.f)) {
            return true;
        }
        TLRPC.Chat chat = qnVar.e;
        if (chat != null) {
            return !ChatObject.isChannel(chat) || qnVar.e.megagroup;
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void k1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
        if (u1Var == null || document == null) {
            return;
        }
        qn qnVar = this.a;
        if (qnVar.getParentLayout() == null || !Z(u1Var)) {
            return;
        }
        org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(qnVar, u1Var);
        H.c(R.drawable.msg_download, LocaleController.getString(R.string.SaveToDownloads), new t1(this, u1Var, document, 24), false);
        H.t = false;
        H.Z();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void l(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
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
            G1(u1Var, webPage, webPage.url, messageMedia.safe);
            return;
        }
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        qn qnVar = this.a;
        if (geoPoint != null) {
            if (AndroidUtilities.isMapsInstalled(qnVar)) {
                zm zmVar = new zm(3);
                d6Var2 = ((org.telegram.ui.ActionBar.n2) qnVar).resourceProvider;
                zmVar.setResourceProvider(d6Var2);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = qnVar.getMessagesController().getPeer(qnVar.a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                tL_messageMediaGeo.geo = messageMedia.geo;
                String str = messageMedia.address;
                if (str == null) {
                    str = (pollAnswer == null || (tL_textWithEntities = pollAnswer.text) == null) ? "" : tL_textWithEntities.text;
                }
                tL_messageMediaGeo.address = str;
                tL_message.media = tL_messageMediaGeo;
                zmVar.O0 = false;
                zmVar.t0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                qnVar.presentFragment(zmVar);
                return;
            }
            return;
        }
        if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
            et.q().w(qnVar.getParentActivity());
            et.q().v(new an(this, tL_messageMediaPoll, pollAnswer, u1Var));
            et q6 = et.q();
            TLRPC.Document document4 = messageMedia.document;
            int i18 = MessageObject.isAnimatedEmoji(document4) ? 2 : 0;
            MessageObject messageObject2 = u1Var.getMessageObject();
            d6Var = ((org.telegram.ui.ActionBar.n2) qnVar).resourceProvider;
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
            TLRPC.TL_message F7 = qn.F7(message);
            F7.media = messageMedia;
            F7.attachPath = rh.f.c(message, i10);
            ArrayList<MessageObject> arrayList = new ArrayList<>();
            i17 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
            MessageObject messageObject3 = new MessageObject(i17, F7, false, true);
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
            i15 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
            TLRPC.Document document6 = messageMedia.document;
            rh.a aVar = new rh.a(i15, messageObject, document6, rh.f.c(messageObject.messageOwner, i10));
            if (aVar.g) {
                FileLoader.getInstance(i15).cancelLoadFile(document6);
                aVar.a();
                MessageObject messageObject4 = u1Var.y7;
                if (messageObject4 == null || !messageObject4.isPoll()) {
                    return;
                }
                rh.g gVar = u1Var.c6;
                if (gVar != null) {
                    gVar.e();
                }
                rh.g gVar2 = u1Var.b6;
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
                rh.g gVar3 = u1Var.c6;
                if (gVar3 != null) {
                    gVar3.e();
                }
                rh.g gVar4 = u1Var.b6;
                if (gVar4 != null) {
                    gVar4.e();
                    return;
                }
                return;
            }
            TLRPC.Message message2 = messageObject.messageOwner;
            TLRPC.TL_message F72 = qn.F7(message2);
            F72.media = messageMedia;
            F72.attachPath = rh.f.c(message2, i10);
            i16 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
            bn bnVar = new bn(i16, F72, false, true);
            if (MessageObject.canPreviewDocument(messageMedia.document)) {
                PhotoViewer.u1().M2(null, qnVar, qnVar.ea);
                PhotoViewer u12 = PhotoViewer.u1();
                int i19 = bnVar.type;
                u12.h2(bnVar, qnVar, i19 != 0 ? qnVar.T5 : 0L, i19 != 0 ? qnVar.L6 : 0L, i19 != 0 ? qnVar.d() : 0L, qnVar.Ga);
                return;
            }
            try {
                AndroidUtilities.openForView(bnVar, qnVar.getParentActivity(), qnVar.ea, false);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                qnVar.C6(bnVar);
                return;
            }
        }
        TLRPC.Message message3 = messageObject.messageOwner;
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
        if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || MessageObject.isVideoDocument(document3))) {
            i11 = messageMedia3 == messageMedia ? arrayList3.size() : -1;
            TLRPC.TL_message F73 = qn.F7(message3);
            F73.media = messageMedia3;
            F73.attachPath = rh.f.c(message3, -2);
            i14 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
            arrayList3.add(new sm(i14, F73, false, true));
            arrayList2.add(-2);
        } else {
            i11 = -1;
        }
        if (messageObject.expandedExplanation && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || MessageObject.isVideoDocument(document2))) {
            if (messageMedia2 == messageMedia) {
                i11 = arrayList3.size();
            }
            TLRPC.TL_message F74 = qn.F7(message3);
            F74.media = messageMedia2;
            F74.attachPath = rh.f.c(message3, -3);
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            F74.message = pollResults2.solution;
            F74.entities = pollResults2.solution_entities;
            i13 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
            arrayList3.add(new tm(i13, F74, false, true));
            arrayList2.add(-3);
        }
        ag.d.b(tL_messageMediaPoll.poll, qnVar.getUserConfig().getClientUserId());
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
                TLRPC.TL_message F75 = qn.F7(message3);
                F75.media = messageMedia4;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                F75.message = tL_textWithEntities2.text;
                F75.entities = tL_textWithEntities2.entities;
                F75.attachPath = rh.f.c(message3, pollAnswer2.unshuffled_index);
                i12 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                arrayList3.add(new um(i12, F75, false, true));
                arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
            }
        }
        if (i11 <= -1 || arrayList3.isEmpty()) {
            return;
        }
        messageObject.pollMediaMapping = arrayList2;
        PhotoViewer.u1().M2(null, qnVar, qnVar.ea);
        PhotoViewer.u1().d2(arrayList3, i11, qnVar.a(), 0L, 0L, qnVar.Ha);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean l0() {
        boolean z10;
        qn qnVar = this.a;
        if (qnVar.F9()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.n2) qnVar).inPreviewMode;
        return !z10;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean l2(int i10) {
        boolean z10;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        if (i10 != 16 && i10 != R.id.acc_action_small_button && i10 != R.id.acc_action_msg_options) {
            return false;
        }
        qn qnVar = this.a;
        z10 = ((org.telegram.ui.ActionBar.n2) qnVar).inPreviewMode;
        if (!z10 || !qnVar.J9) {
            return !c();
        }
        d5Var = ((org.telegram.ui.ActionBar.n2) qnVar).parentLayout;
        if (d5Var != null) {
            d5Var2 = ((org.telegram.ui.ActionBar.n2) qnVar).parentLayout;
            ((ActionBarLayout) d5Var2).r();
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void m(org.telegram.ui.Cells.u1 u1Var) {
        if (u1Var.getMessageObject().isImportedForward()) {
            f1();
            return;
        }
        qn qnVar = this.a;
        if (qnVar.l3 || qnVar.x0 == null || qnVar.getParentActivity() == null || qnVar.fragmentView == null) {
            return;
        }
        if (qnVar.u2 == null) {
            jm jmVar = qnVar.X0;
            int indexOfChild = jmVar.indexOfChild(qnVar.S);
            if (indexOfChild == -1) {
                return;
            }
            org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(1, qnVar.getParentActivity(), qnVar.ea, false);
            qnVar.u2 = r40Var;
            jmVar.addView(r40Var, indexOfChild + 1, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            qnVar.u2.setAlpha(0.0f);
            qnVar.u2.setVisibility(4);
        }
        qnVar.u2.e(u1Var, null, 0, 0, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void n() {
        this.a.X0.getClass();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void n0(String str) {
        qn qnVar = this.a;
        jk jkVar = qnVar.O0;
        if (jkVar == null || jkVar.getVisibility() != 0) {
            ik ikVar = qnVar.R;
            if ((ikVar == null || ikVar.getVisibility() != 0) && qnVar.Y != null && str != null && str.length() > 0) {
                qnVar.Y.setFieldText("@" + str + " ");
                qnVar.Y.F0();
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void n2() {
        qn qnVar = this.a;
        if (!qnVar.getUserConfig().isPremium()) {
            org.telegram.ui.Components.xc.a0(qnVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("UnlockSimilarChannelsPremium", qnVar.getMessagesController().recommendedChannelsLimitPremium), new nm(this, 4))).j();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", qnVar.T5);
        bundle.putInt("start_from", 10);
        qnVar.presentFragment(new org.telegram.ui.Components.wa0(bundle, qnVar.a1.getSharedMediaPreloader()));
    }

    public final void o(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, boolean z10) {
        qn qnVar = this.a;
        TLRPC.Chat chat2 = qnVar.e;
        if (chat2 != null && chat.id == chat2.id) {
            hj hjVar = qnVar.a1;
            if (hjVar != null && i10 == 0) {
                hjVar.e(false, false);
                return;
            } else {
                if (u1Var.getMessageObject() != null) {
                    qnVar.j(i10, u1Var.getMessageObject().getId(), true, 0, false, 0);
                    return;
                }
                return;
            }
        }
        if (chat2 == null || chat.id != chat2.id || qnVar.K9()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            ri riVar = null;
            if (z10) {
                pf.c cVar = qnVar.Ab;
                if (cVar != null) {
                    cVar.a(true);
                    qnVar.Ab = null;
                }
                if (u1Var.getMessageObject() == null) {
                    qnVar.Ab = null;
                } else {
                    ri riVar2 = new ri(qnVar, u1Var.getMessageObject().getId(), u1Var, 0);
                    qnVar.Ab = riVar2;
                    riVar = riVar2;
                }
            }
            if (qnVar.getMessagesController().checkCanOpenChat(bundle, qnVar, u1Var.getMessageObject(), riVar)) {
                qn qnVar2 = new qn(bundle);
                if (riVar == null || i10 == 0) {
                    qnVar.presentFragment(qnVar2);
                } else {
                    AndroidUtilities.runOnUIThread(new ai.ub(this, riVar, chat, i10, qnVar2, 18), 5000L);
                    riVar.d();
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean o0(org.telegram.ui.Components.a6 a6Var) {
        TLRPC.InputStickerSet inputStickerSet;
        int i10;
        qn qnVar = this.a;
        if (qnVar.getMessagesController().premiumFeaturesBlocked() || a6Var == null || a6Var.standard) {
            return false;
        }
        long documentId = a6Var.getDocumentId();
        TLRPC.Document document = a6Var.document;
        if (document == null) {
            i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
            document = org.telegram.ui.Components.r5.f(i10, documentId);
        }
        if (document == null || (inputStickerSet = MessageObject.getInputStickerSet(document)) == null) {
            return false;
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, true);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(inputStickerSet);
        org.telegram.ui.Components.aw awVar = new org.telegram.ui.Components.aw(qnVar, qnVar.getParentActivity(), qnVar.ea, arrayList);
        org.telegram.ui.Components.qv qvVar = awVar.f;
        qvVar.getClass();
        ImageReceiver imageReceiver = new ImageReceiver(qvVar);
        qvVar.v = imageReceiver;
        if (qvVar.d) {
            imageReceiver.onAttachedToWindow();
        }
        qvVar.w = true;
        qvVar.x.d(1.0f, true);
        qvVar.v.setImage(ImageLocation.getForDocument(document), "140_140", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "140_140", DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.h6.m6, 0.2f, true), 0L, null, null, 0);
        qvVar.v.setLayerNum(7);
        qvVar.v.setAllowStartLottieAnimation(true);
        qvVar.v.setAllowStartAnimation(true);
        qvVar.v.setAutoRepeat(1);
        qvVar.v.setAllowDecodeSingleFrame(true);
        qvVar.v.setParentView(qvVar);
        awVar.setCalcMandatoryInsets(qnVar.C9());
        qnVar.showDialog(awVar);
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void o2(org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
        MessageObject messageObject;
        TLRPC.TL_factCheck factCheck;
        String str;
        qn qnVar = this.a;
        ei.x3 x3Var = qnVar.A1;
        if (x3Var != null) {
            x3Var.e(true);
        }
        if (qnVar.getParentActivity() == null || (messageObject = u1Var.getMessageObject()) == null || (factCheck = messageObject.getFactCheck()) == null || factCheck.country == null) {
            return;
        }
        try {
            str = new Locale("", factCheck.country).getDisplayCountry(LocaleController.getInstance().getCurrentLocale());
        } catch (Exception e) {
            FileLog.e(e);
            str = factCheck.country;
        }
        ei.x3 x3Var2 = new ei.x3(qnVar.getParentActivity(), 3);
        x3Var2.p(true);
        x3Var2.K = Layout.Alignment.ALIGN_NORMAL;
        x3Var2.d = -1L;
        x3Var2.T = true;
        x3Var2.e = true;
        x3Var2.q(12.0f);
        qnVar.A1 = x3Var2;
        x3Var2.l0 = new eh(9, this, x3Var2);
        x3Var2.s(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FactCheckToast, str)));
        qnVar.X0.addView(qnVar.A1, w7.z5.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
        qnVar.X0.post(new i2.a0(this, u1Var, i11, i10, 4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0118, code lost:
    
        if (r1.noforwards == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0124, code lost:
    
        if (org.telegram.messenger.ChatObject.isPublic(r1) != false) goto L90;
     */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(org.telegram.ui.Cells.u1 u1Var) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        int i10;
        TLRPC.MessageFwdHeader messageFwdHeader;
        int i11;
        TLRPC.Message message2;
        int i12;
        TLRPC.Peer peer;
        MessageObject.GroupedMessages groupedMessages;
        int i13;
        qn qnVar = this.a;
        if (qnVar.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.s31 s31Var = qnVar.R1;
        boolean z10 = true;
        if (s31Var != null && qnVar.d4 == 0 && (u1Var.T7 || u1Var.U7)) {
            s31Var.m(u1Var.getMessageObject().getTopicId(), true);
            return;
        }
        if (qnVar.getMessagesController().isFrozen()) {
            i13 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
            b.b(i13);
            return;
        }
        fk fkVar = qnVar.Y;
        if (fkVar != null) {
            fkVar.N();
        }
        MessageObject messageObject = u1Var.getMessageObject();
        int i14 = qnVar.R3;
        if (i14 == 2) {
            qnVar.V8.D0(messageObject.getId());
            qnVar.finishFragment();
            return;
        }
        if (i14 == 3 || ((i14 == 7 && qnVar.O3 == 2) || !((!UserObject.isReplyUser(qnVar.f) && !UserObject.isUserSelf(qnVar.f)) || (messageFwdHeader = messageObject.messageOwner.fwd_from) == null || messageFwdHeader.saved_from_peer == null))) {
            if (UserObject.isReplyUser(qnVar.f) && (messageReplyHeader = (message = messageObject.messageOwner).reply_to) != null && (i10 = messageReplyHeader.reply_to_top_id) != 0) {
                qnVar.fa(messageReplyHeader.reply_to_peer_id.channel_id, null, i10, 0L, -1, message.fwd_from.saved_from_msg_id, messageObject);
                return;
            } else if (qnVar.R3 == 7 && qnVar.O3 == 2) {
                qnVar.ka(messageObject);
                return;
            } else {
                qnVar.la(messageObject);
                return;
            }
        }
        ArrayList<MessageObject> arrayList = (messageObject.getGroupId() == 0 || (groupedMessages = (MessageObject.GroupedMessages) qnVar.x6.f(messageObject.getGroupId())) == null) ? null : groupedMessages.messages;
        if (arrayList == null) {
            arrayList = org.telegram.messenger.g0.k(messageObject);
        }
        if (qnVar.getMessagesController().storiesEnabled() && !messageObject.isSponsored() && (((message2 = messageObject.messageOwner) == null || !message2.noforwards) && (i12 = messageObject.type) != 17 && i12 != 12)) {
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
                boolean z11 = z10;
                qnVar.showDialog(new wm(this, qnVar.getParentActivity(), qnVar, arrayList, ChatObject.isChannel(qnVar.e), z11, qnVar.ea, z11, messageObject));
                Activity parentActivity = qnVar.getParentActivity();
                i11 = ((org.telegram.ui.ActionBar.n2) qnVar).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
                qnVar.fragmentView.requestLayout();
            }
        }
        z10 = false;
        boolean z112 = z10;
        qnVar.showDialog(new wm(this, qnVar.getParentActivity(), qnVar, arrayList, ChatObject.isChannel(qnVar.e), z112, qnVar.ea, z112, messageObject));
        Activity parentActivity2 = qnVar.getParentActivity();
        i11 = ((org.telegram.ui.ActionBar.n2) qnVar).classGuid;
        AndroidUtilities.setAdjustResizeToNothing(parentActivity2, i11);
        qnVar.fragmentView.requestLayout();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void p1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        vh.h hVar;
        vh.i iVar = this.a.X9;
        if (iVar == null || (hVar = (vh.h) iVar.a.get(vh.i.b(u1Var))) == null) {
            return;
        }
        vh.d[] dVarArr = hVar.w;
        RectF rectF = hVar.r;
        if (hVar.M) {
            float f11 = (f7 - rectF.left) + hVar.U;
            float f12 = (f10 - rectF.top) + hVar.V;
            int i10 = vh.g.a;
            int b10 = (((float) (-AndroidUtilities.dp((float) 37))) >= f12 || f12 >= rectF.height()) ? -1 : w7.r.b((int) Math.floor((f11 - (AndroidUtilities.dp(9) - (AndroidUtilities.dp(11) / 2.0f))) / AndroidUtilities.dp(vh.g.a + 11)), 0, dVarArr.length - 1);
            if (hVar.R == b10) {
                return;
            }
            hVar.a.performHapticFeedback(3, 1);
            hVar.R = b10;
            int i11 = 0;
            while (i11 < dVarArr.length) {
                vh.d dVar = dVarArr[i11];
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
                    dVar.n.setInterpolator(vh.f.a);
                    dVar.n.start();
                }
                vh.d dVar2 = dVarArr[i11];
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
                    dVar2.k.setInterpolator(vh.f.a);
                    dVar2.k.start();
                }
                i11++;
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final org.telegram.ui.Cells.o9 p2() {
        return this.a.c9;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void q() {
        this.a.dc();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void q0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        qn qnVar = this.a;
        qnVar.L7(u1Var, false, false, f7, f10, true, false, false);
        qnVar.x0.getClass();
        qn.d2(qnVar, RecyclerView.R(u1Var));
    }

    public final void r(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            org.telegram.ui.ActionBar.n2 n2Var = this.a;
            if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var, u1Var.getMessageObject())) {
                n2Var.presentFragment(new qn(bundle));
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void s(org.telegram.ui.Cells.u1 u1Var) {
        int i10;
        int i11;
        qj qjVar;
        MessageObject primaryMessageObject = u1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        primaryMessageObject.factCheckExpanded = !primaryMessageObject.factCheckExpanded;
        primaryMessageObject.forceUpdate = true;
        qn qnVar = this.a;
        nj njVar = qnVar.x0;
        if (njVar != null && (qjVar = qnVar.z0) != null && qjVar.y < 0) {
            for (int childCount = njVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = qnVar.x0.getChildAt(childCount);
                qnVar.x0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.u1)) {
                        if (childAt instanceof org.telegram.ui.Cells.w0) {
                            i11 = qnVar.Q8(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = qnVar.Q8(childAt);
                            break;
                        }
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        qnVar.wc(primaryMessageObject, false);
        ei.x3 x3Var = qnVar.A1;
        if (x3Var != null) {
            x3Var.e(true);
        }
        if (i10 < 0 || u1Var.getCurrentMessagesGroup() != null) {
            return;
        }
        qnVar.z0.h1(i10, i11);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void t(org.telegram.ui.Cells.u1 u1Var) {
        int i10;
        long j10;
        MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
        MessageObject messageObject = (currentMessagesGroup == null || currentMessagesGroup.messages.isEmpty()) ? u1Var.getMessageObject() : currentMessagesGroup.messages.get(0);
        TLRPC.MessageReplies messageReplies = messageObject.messageOwner.replies;
        if (messageReplies != null) {
            i10 = messageReplies.read_max_id;
            j10 = messageReplies.channel_id;
        } else {
            i10 = -1;
            j10 = 0;
        }
        int i11 = i10;
        long j11 = j10;
        qn qnVar = this.a;
        qnVar.fa(qnVar.e.id, messageObject, messageObject.getId(), j11, i11, 0, null);
    }

    public final void u(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            bundle.putBoolean("expandPhoto", false);
            this.a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void u0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
        org.telegram.ui.ActionBar.k kVar;
        qn qnVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
        boolean z10 = true;
        if (kVar.t() || qnVar.F9()) {
            qn.c2(qnVar, u1Var, true, f7, f10);
            return;
        }
        if (u1Var.getMessageObject() != null && u1Var.getMessageObject().isSponsored()) {
            M0(10, u1Var);
            return;
        }
        if (!ChatObject.isForum(qnVar.e) && !qnVar.K9()) {
            z10 = false;
        }
        v(user, z10);
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
        qn qnVar = this.a;
        TLRPC.User user2 = qnVar.f;
        if (user2 != null && user2.id == user.id) {
            i11 = 1;
        }
        profileActivity.N4(i11);
        Activity parentActivity = qnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) qnVar).classGuid;
        AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
        qnVar.presentFragment(profileActivity);
    }

    /* JADX WARN: Code restructure failed: missing block: B:270:0x0b1c, code lost:
    
        if (r0.exists() != false) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0bd7, code lost:
    
        if (r1.startsWith("text/x-web-markdown") == false) goto L322;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0c22 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v45, types: [org.telegram.ui.PhotoViewer] */
    /* JADX WARN: Type inference failed for: r0v46, types: [org.telegram.ui.PhotoViewer] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r8v2, types: [org.telegram.messenger.ImageReceiver] */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10, boolean z10) {
        int i10;
        MessageObject messageObject;
        boolean z11;
        MessageObject messageObject2;
        qn qnVar;
        boolean z12;
        File file;
        TLRPC.Chat chat;
        ju0 E;
        ?? r16;
        ju0 ju0Var;
        float f11;
        float f12;
        char c10;
        char c11;
        MessageObject messageObject3;
        MessageObject messageObject4;
        BitmapDrawable bitmapDrawable;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        int i11;
        MessageObject messageObject5 = u1Var.getMessageObject();
        int i12 = messageObject5.type;
        qn qnVar2 = this.a;
        if (i12 == 23) {
            TLRPC.MessageMedia messageMedia2 = messageObject5.messageOwner.media;
            TL_stories.StoryItem storyItem = messageMedia2.storyItem;
            if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia2.peer);
                storyItem.messageId = messageObject5.getId();
                storyItem.messageType = 2;
                ci.d8.b(storyItem, qnVar2.f);
                qnVar2.getOrCreateStoryViewer().F(qnVar2.getParentActivity(), messageObject5.messageOwner.media.storyItem, ci.r7.a(qnVar2.x0));
            }
        } else {
            boolean z13 = true;
            if (messageObject5.isVideo()) {
                i11 = ((org.telegram.ui.ActionBar.n2) qnVar2).currentAccount;
                if (DownloadController.getInstance(i11).canDownloadMedia(messageObject5.messageOwner) == 1) {
                    messageObject5.putInDownloadsStore = true;
                }
            } else {
                messageObject5.putInDownloadsStore = true;
            }
            if (messageObject5.isSendError()) {
                qnVar2.L7(u1Var, false, false, f7, f10, true, false, false);
                return;
            }
            if (!messageObject5.isSending()) {
                int i13 = 0;
                if (!z10 || (message = messageObject5.messageOwner) == null || (messageMedia = message.media) == null || (webPage = messageMedia.webpage) == null || TextUtils.isEmpty(webPage.url)) {
                    int i14 = 5;
                    if (messageObject5.isDice()) {
                        om omVar = new om(this, messageObject5, i13);
                        if (messageObject5.isStakeableDice()) {
                            qnVar2.getMessagesController().loadStakeDiceInfo(new z(this, messageObject5, omVar, i14));
                            return;
                        } else {
                            omVar.run();
                            return;
                        }
                    }
                    if ((messageObject5.isAnimatedEmoji() && (!messageObject5.isAnimatedAnimatedEmoji() || (qnVar2.xa.e.containsKey(oy.p(MessageObject.findAnimatedEmojiEmoticon(messageObject5.getDocument()))) && qnVar2.f != null))) || messageObject5.isPremiumSticker()) {
                        qnVar2.Ra(u1Var);
                        qnVar2.xa.k(u1Var, qnVar2, true);
                        qnVar2.x0.I0(false);
                        return;
                    }
                    int i15 = 6;
                    if (messageObject5.needDrawBluredPreview()) {
                        se kb2 = qnVar2.kb(messageObject5, false);
                        a3.i0 P4 = qn.P4(qnVar2, messageObject5);
                        u1Var.invalidate();
                        final SecretMediaViewer f13 = SecretMediaViewer.f();
                        final Activity parentActivity = qnVar2.getParentActivity();
                        int i16 = UserConfig.selectedAccount;
                        f13.a = i16;
                        ImageReceiver imageReceiver = f13.h;
                        imageReceiver.setCurrentAccount(i16);
                        if (f13.b != parentActivity) {
                            f13.b = parentActivity;
                            f13.g1 = new org.telegram.ui.Components.mn0(parentActivity, null);
                            m0 m0Var = new m0(f13, parentActivity, 21);
                            f13.d = m0Var;
                            m0Var.setBackgroundDrawable(f13.l0);
                            f13.d.setFocusable(true);
                            f13.d.setFocusableInTouchMode(true);
                            f13.d.setClipChildren(false);
                            f13.d.setClipToPadding(false);
                            f13.e = new ah.v(f13, parentActivity);
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
                            f13.e.setOnApplyWindowInsetsListener(new k31(f13, 0));
                            f13.e.setSystemUiVisibility(1792);
                            GestureDetector gestureDetector = new GestureDetector(f13.e.getContext(), f13);
                            f13.L0 = gestureDetector;
                            gestureDetector.setOnDoubleTapListener(f13);
                            org.telegram.ui.Components.z7 z7Var = new org.telegram.ui.Components.z7(f13, parentActivity, i15);
                            f13.F = z7Var;
                            z7Var.setTitleColor(-1);
                            f13.F.setSubtitleColor(-1);
                            f13.F.setBackgroundColor(2130706432);
                            f13.F.setOccupyStatusBar(true);
                            f13.F.B(1090519039, false);
                            f13.F.C(-1, false);
                            f13.F.setBackButtonImage(R.drawable.ic_ab_back);
                            f13.F.setTitleRightMargin(AndroidUtilities.dp(70.0f));
                            f13.e.addView(f13.F, w7.z5.c(-2.0f, -1));
                            f13.F.setActionBarMenuOnItemClick(new y21(f13, 2));
                            ei.x3 x3Var = new ei.x3(parentActivity, 1);
                            f13.r = x3Var;
                            x3Var.l(1.0f, -26.0f);
                            f13.r.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                            f13.e.addView(f13.r, w7.z5.d(-1, 80.0f, 53, 0.0f, 48.0f, 0.0f, 0.0f));
                            q31 q31Var = new q31(f13, parentActivity);
                            f13.n = q31Var;
                            f13.e.addView(q31Var, w7.z5.d(119, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
                            ko0 ko0Var = new ko0(f13, 2);
                            f13.U = new r31(f13, parentActivity);
                            View view2 = new View(parentActivity);
                            f13.T = view2;
                            view2.setBackgroundColor(2130706432);
                            f13.U.addView(f13.T, w7.z5.e(-1, -1, 119));
                            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(f13.e.getContext());
                            f13.S = j5Var;
                            j5Var.setTextColor(-1);
                            f13.S.setGravity(53);
                            f13.S.setTextSize(14);
                            f13.S.setImportantForAccessibility(2);
                            f13.U.addView(f13.S, w7.z5.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
                            v10 v10Var = new v10(f13, parentActivity, 8);
                            f13.R = v10Var;
                            org.telegram.ui.Components.e81 e81Var = new org.telegram.ui.Components.e81(v10Var);
                            f13.Q = e81Var;
                            e81Var.z = AndroidUtilities.dp(2.0f);
                            org.telegram.ui.Components.e81 e81Var2 = f13.Q;
                            e81Var2.k = 872415231;
                            e81Var2.l = 872415231;
                            e81Var2.m = -1;
                            e81Var2.n = -1;
                            e81Var2.A = 1509949439;
                            e81Var2.j = ko0Var;
                            f13.U.addView(f13.R);
                            f13.e.addView(f13.U, w7.z5.e(-1, 48, 80));
                            cs0 cs0Var = new cs0(null, new ci.b());
                            f13.Y = cs0Var;
                            cs0Var.j0 = true;
                            cs0Var.h0 = false;
                            xt0 xt0Var = new xt0(f13.e.getContext());
                            f13.Z = xt0Var;
                            xt0Var.setFactory(new ViewSwitcher.ViewFactory() { // from class: org.telegram.ui.l31
                                @Override // android.widget.ViewSwitcher.ViewFactory
                                public final View makeView() {
                                    SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
                                    return new wt0(parentActivity, secretMediaViewer.a0, secretMediaViewer.Y, new g5(secretMediaViewer, 22), new vf0(secretMediaViewer, 2));
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
                            org.telegram.ui.Components.bh0 bh0Var = new org.telegram.ui.Components.bh0(28);
                            f13.W = bh0Var;
                            bh0Var.setCallback(f13.V);
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
                            org.telegram.ui.Cells.z9 n10 = f13.Y.n(f13.d.getContext());
                            if (n10 != null) {
                                AndroidUtilities.removeFromParent(n10);
                                f13.e.addView(n10);
                            }
                            f13.Y.S(f13.e);
                            f13.Y.i0 = true;
                        }
                        SecretMediaViewer f14 = SecretMediaViewer.f();
                        kl klVar = qnVar2.Ga;
                        SecretMediaViewer.PhotoBackgroundDrawable photoBackgroundDrawable = f14.l0;
                        ?? r82 = f14.h;
                        if (f14.b != null && messageObject5.needDrawBluredPreview()) {
                            if (klVar != null && (E = klVar.E(messageObject5, null, 0, true, false)) != null) {
                                f14.q1 = messageObject5.messageOwner.ttl == Integer.MAX_VALUE;
                                f14.p1 = P4;
                                f14.N = klVar;
                                f14.K = System.currentTimeMillis();
                                f14.L = 0L;
                                f14.k0 = true;
                                f14.j0 = true;
                                f14.p0 = false;
                                o4 o4Var = f14.w;
                                if (o4Var != null) {
                                    o4Var.setVisibility(4);
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
                                r82.setManualAlphaAnimator(false);
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
                                    int i17 = 0;
                                    while (true) {
                                        int[] iArr2 = E.h;
                                        r16 = z13;
                                        if (i17 >= iArr2.length) {
                                            break;
                                        }
                                        f14.H0[i17] = iArr2[i17];
                                        i17++;
                                        z13 = r16 == true ? 1 : 0;
                                    }
                                } else {
                                    r16 = 1;
                                    f14.H0 = null;
                                }
                                float f15 = E.b;
                                float f16 = rectF.left;
                                f14.w0 = ((width / 2.0f) + (f15 + f16)) - (r9 / 2);
                                f14.x0 = ((height / 2.0f) + (E.c + rectF.top)) - (r7 / 2);
                                f14.v0 = Math.abs(f16 - E.a.getImageX());
                                int abs = (int) Math.abs(rectF.top - E.a.getImageY());
                                E.d.getLocationInWindow(new int[2]);
                                float f17 = (r7[r16] - (E.c + rectF.top)) + E.j;
                                f14.r0 = f17;
                                float f18 = abs;
                                f14.r0 = Math.max(0.0f, Math.max(f17, f18));
                                float height2 = (((E.c + rectF.top) + ((int) height)) - (E.d.getHeight() + r7[r16])) + E.i;
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
                                boolean z14 = r16;
                                f14.I0 = z14;
                                f14.e1 = z14;
                                na0 na0Var = f14.l1;
                                if (na0Var != null) {
                                    na0Var.destroy();
                                    f14.l1 = null;
                                }
                                LaunchActivity launchActivity = LaunchActivity.H1;
                                f14.l1 = launchActivity != null ? new na0(launchActivity, z14) : null;
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
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 >= document.attributes.size()) {
                                            break;
                                        }
                                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i18);
                                        if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) documentAttribute;
                                            f14.O = tL_documentAttributeVideo.w;
                                            f14.P = tL_documentAttributeVideo.h;
                                            break;
                                        }
                                        i18++;
                                    }
                                    if (MessageObject.isGifDocument(document)) {
                                        f14.F.setTitle(LocaleController.getString(R.string.DisappearingGif));
                                        String str = messageObject5.messageOwner.attachPath;
                                        ImageLocation forDocument = (str == null || !messageObject5.attachPathExists) ? ImageLocation.getForDocument(document) : ImageLocation.getForPath(str);
                                        if (f14.i0 != null) {
                                            f11 = 1.0f;
                                            bitmapDrawable = new BitmapDrawable(f14.i0.bitmap);
                                        } else {
                                            f11 = 1.0f;
                                            bitmapDrawable = null;
                                        }
                                        f12 = 0.0f;
                                        ju0Var = E;
                                        c10 = 4;
                                        c11 = 6;
                                        messageObject4 = messageObject5;
                                        r82.setImage(forDocument, null, bitmapDrawable, -1L, null, messageObject4, 1);
                                    } else {
                                        ju0Var = E;
                                        f11 = 1.0f;
                                        f12 = 0.0f;
                                        c10 = 4;
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
                                        r82.setImage(null, null, f14.i0 != null ? new BitmapDrawable(f14.i0.bitmap) : null, -1L, null, messageObject4, 2);
                                    }
                                    messageObject3 = messageObject4;
                                } else {
                                    ju0Var = E;
                                    f11 = 1.0f;
                                    f12 = 0.0f;
                                    c10 = 4;
                                    c11 = 6;
                                    f14.F.setTitle(LocaleController.getString(R.string.DisappearingPhoto));
                                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject5.photoThumbs, AndroidUtilities.getPhotoSize());
                                    r82.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject5.photoThumbsObject), null, f14.i0 != null ? new BitmapDrawable(f14.i0.bitmap) : null, -1L, null, messageObject5, 2);
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
                                    q31 q31Var2 = f14.n;
                                    q31Var2.e = true;
                                    TextPaint textPaint = q31Var2.r;
                                    textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                                    textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
                                    textPaint.setColor(-1);
                                    StaticLayout staticLayout = new StaticLayout("1", textPaint, 999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                                    q31Var2.s = staticLayout;
                                    q31Var2.v = staticLayout.getLineCount() > 0 ? q31Var2.s.getLineWidth(0) : f12;
                                    q31Var2.w = q31Var2.s.getHeight();
                                    q31Var2.invalidate();
                                    f14.n.setOnClickListener(new c31(f14, 2));
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
                                org.telegram.ui.Components.z7 z7Var2 = f14.F;
                                Property property = View.ALPHA;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z7Var2, (Property<org.telegram.ui.Components.z7, Float>) property, 0.0f, 1.0f);
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(f14.a0, (Property<ht0, Float>) property, 0.0f, 1.0f);
                                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(f14.r, (Property<ei.x3, Float>) property, 0.0f, 1.0f);
                                ObjectAnimator ofInt = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.t6.d, 0, 255);
                                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(f14, f14.v1, 0.0f, 1.0f);
                                r31 r31Var = f14.U;
                                char c12 = c10;
                                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(r31Var, r31Var.n, f11);
                                r31 r31Var2 = f14.U;
                                if (f14.J) {
                                    f12 = f11;
                                }
                                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(r31Var2, (Property<r31, Float>) property, f12);
                                Animator[] animatorArr = new Animator[7];
                                animatorArr[0] = ofFloat;
                                animatorArr[1] = ofFloat2;
                                animatorArr[2] = ofFloat3;
                                animatorArr[3] = ofInt;
                                animatorArr[c12] = ofFloat4;
                                animatorArr[5] = ofFloat5;
                                animatorArr[c11] = ofFloat6;
                                animatorSet.playTogether(animatorArr);
                                f14.m0 = 3;
                                int i19 = 27;
                                f14.o0 = new ve0(f14, kb2, messageObject3, i19);
                                f14.K0.setDuration(250L);
                                f14.K0.addListener(new o31(f14, 0));
                                f14.n0 = System.currentTimeMillis();
                                if (SharedConfig.getDevicePerformanceClass() == 0) {
                                    f14.e.setLayerType(2, null);
                                }
                                f14.K0.setInterpolator(new DecelerateInterpolator());
                                photoBackgroundDrawable.b = 0;
                                photoBackgroundDrawable.a = new jv0(i19, f14, ju0Var);
                                f14.K0.start();
                                return;
                            }
                        }
                    } else {
                        if (MessageObject.isAnimatedEmoji(messageObject5.getDocument()) && MessageObject.getInputStickerSet(messageObject5.getDocument()) != null) {
                            ArrayList arrayList = new ArrayList(1);
                            arrayList.add(MessageObject.getInputStickerSet(messageObject5.getDocument()));
                            org.telegram.ui.Components.aw awVar = new org.telegram.ui.Components.aw(qnVar2, qnVar2.getParentActivity(), qnVar2.ea, arrayList);
                            awVar.setCalcMandatoryInsets(qnVar2.C9());
                            qnVar2.showDialog(awVar);
                            return;
                        }
                        if (messageObject5.getInputStickerSet() != null) {
                            org.telegram.ui.Components.qy0 qy0Var = new org.telegram.ui.Components.qy0(qnVar2.getParentActivity(), qnVar2, messageObject5.getInputStickerSet(), null, (qnVar2.O0.getVisibility() == 0 || !((chat = qnVar2.e) == null || ChatObject.canSendStickers(chat))) ? null : qnVar2.Y, qnVar2.ea);
                            qy0Var.setCalcMandatoryInsets(qnVar2.C9());
                            qnVar2.showDialog(qy0Var);
                            return;
                        }
                        if (messageObject5.isVideo() || (i10 = messageObject5.type) == 1 || ((i10 == 0 && !messageObject5.isWebpageDocument()) || messageObject5.isGif())) {
                            if (messageObject5.isSponsored()) {
                                if (messageObject5.isGif() || messageObject5.isPhoto()) {
                                    int i20 = 1;
                                    qnVar2.O9(messageObject5, true, false);
                                    if (messageObject5.sponsoredUrl != null) {
                                        pf.c cVar = qnVar2.Ab;
                                        if (cVar != null) {
                                            cVar.a(true);
                                        }
                                        qnVar2.Ab = u1Var.getMessageObject() == null ? null : new vm(this, u1Var, i20);
                                        pf.d.q(qnVar2.getParentActivity(), Uri.parse(messageObject5.sponsoredUrl), true, false, false, qnVar2.Ab, null, false, qnVar2.getMessagesController().sponsoredLinksInappAllow, false);
                                        return;
                                    }
                                } else if (messageObject5.isVideo()) {
                                    qnVar2.O9(messageObject5, true, false);
                                }
                            }
                            if (messageObject5.getDuration() > 0.0d && messageObject5.getVideoStartsTimestamp() > 0 && !messageObject5.openedInViewer) {
                                messageObject5.forceSeekTo = (float) (messageObject5.getVideoStartsTimestamp() / messageObject5.getDuration());
                            }
                            qnVar2.ma(u1Var, messageObject5);
                            return;
                        }
                        int i21 = messageObject5.type;
                        if (i21 == 3) {
                            qnVar2.kb(messageObject5, true);
                            try {
                                String str2 = messageObject5.messageOwner.attachPath;
                                File file4 = (str2 == null || str2.length() == 0) ? null : new File(messageObject5.messageOwner.attachPath);
                                if (file4 == null || !file4.exists()) {
                                    file4 = qnVar2.getFileLoader().getPathToMessage(messageObject5.messageOwner);
                                }
                                Intent intent = new Intent("android.intent.action.VIEW");
                                if (Build.VERSION.SDK_INT >= 24) {
                                    intent.setFlags(1);
                                    intent.setDataAndType(FileProvider.d(qnVar2.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", file4), "video/mp4");
                                } else {
                                    intent.setDataAndType(Uri.fromFile(file4), "video/mp4");
                                }
                                qnVar2.getParentActivity().startActivityForResult(intent, 500);
                                return;
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                qnVar2.C6(messageObject5);
                            }
                        } else if (i21 == 4) {
                            if (AndroidUtilities.isMapsInstalled(qnVar2)) {
                                if (!messageObject5.isLiveLocation()) {
                                    nc0 nc0Var = new nc0(qnVar2.h == null ? 3 : 0);
                                    nc0Var.F0 = qnVar2;
                                    nc0Var.t0(messageObject5);
                                    qnVar2.presentFragment(nc0Var);
                                    return;
                                }
                                TLRPC.Chat chat2 = qnVar2.e;
                                nc0 nc0Var2 = new nc0((chat2 == null || ChatObject.canSendMessages(chat2) || qnVar2.e.megagroup) ? 2 : 6);
                                nc0Var2.F0 = qnVar2;
                                nc0Var2.t0(messageObject5);
                                qnVar2.presentFragment(nc0Var2);
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
                                    File pathToMessage2 = qnVar2.getFileLoader().getPathToMessage(messageObject5.messageOwner);
                                    if (pathToMessage2.exists()) {
                                        file = pathToMessage2;
                                    }
                                }
                                org.telegram.ui.ActionBar.g6 u10 = org.telegram.ui.ActionBar.h6.u(file, messageObject5.getDocumentName(), null, true);
                                if (u10 != null) {
                                    qnVar2.presentFragment(new kc1(u10));
                                    return;
                                }
                                qnVar2.x4 = -1;
                            }
                            if (messageObject5.canPreviewDocument()) {
                                PhotoViewer.u1().M2(null, qnVar2, qnVar2.ea);
                                ?? u12 = PhotoViewer.u1();
                                int i22 = messageObject5.type;
                                messageObject = messageObject5;
                                u12.h2(messageObject, qnVar2, i22 != 0 ? qnVar2.T5 : 0L, i22 != 0 ? qnVar2.L6 : 0L, i22 != 0 ? qnVar2.d() : 0L, qnVar2.Ga);
                                z11 = true;
                            } else {
                                messageObject = messageObject5;
                                z11 = false;
                            }
                            Pattern pattern = org.telegram.ui.Components.la0.a;
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
                                qnVar = qnVar2;
                                messageObject2 = messageObject;
                                if (!z12) {
                                    try {
                                        AndroidUtilities.openForView(messageObject2, qnVar.getParentActivity(), qnVar.ea, false);
                                        return;
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                        qnVar.C6(messageObject2);
                                    }
                                }
                            }
                            if (qnVar2.getParentActivity() == null) {
                                qnVar = qnVar2;
                                messageObject2 = messageObject;
                            } else {
                                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(qnVar2.getParentActivity(), 3, qnVar2.ea);
                                b2Var.setCanceledOnTouchOutside(false);
                                boolean[] zArr = {false};
                                b2Var.setOnCancelListener(new vg(0, zArr));
                                b2Var.r(150L);
                                MessageObject messageObject6 = messageObject;
                                org.telegram.messenger.camera.i iVar = new org.telegram.messenger.camera.i(qnVar2, messageObject6, b2Var, zArr, 12);
                                messageObject2 = messageObject6;
                                qnVar = qnVar2;
                                new Thread(iVar).start();
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
                if (!qnVar2.ja(str4, u1Var, null, messageObject5.getId(), 2)) {
                    pf.c cVar2 = qnVar2.Ab;
                    if (cVar2 != null) {
                        cVar2.a(true);
                    }
                    qnVar2.Ab = u1Var.getMessageObject() != null ? new vm(this, u1Var, i13) : null;
                    pf.d.q(qnVar2.getParentActivity(), Uri.parse(str4), true, false, false, qnVar2.Ab, null, false, true, false);
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean v1() {
        qn qnVar = this.a;
        return qnVar.X0.getMeasuredWidth() > qnVar.X0.getMeasuredHeight();
    }

    @Override // org.telegram.ui.Cells.l1
    public final String w(long j10) {
        TLRPC.Peer peer;
        String adminRank;
        qn qnVar = this.a;
        if (UserObject.isBotForum(qnVar.f)) {
            return null;
        }
        TLRPC.Chat chat = qnVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat) && (adminRank = qnVar.getMessagesController().getAdminRank(qnVar.e.id, j10)) != null) {
            return adminRank;
        }
        TLRPC.TL_forumTopic tL_forumTopic = qnVar.c4;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || !(peer.user_id == j10 || peer.channel_id == j10 || peer.chat_id == j10)) {
            return null;
        }
        return LocaleController.getString(R.string.TopicCreator);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean w0(MessageObject messageObject) {
        return !this.a.s.containsKey(messageObject);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void w1(org.telegram.ui.Cells.u1 u1Var) {
        qn.U4(this.a, u1Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void x0(org.telegram.ui.Cells.u1 u1Var) {
        rh.c cVar = this.a.Dc;
        if (cVar == null || cVar.n != u1Var) {
            return;
        }
        cVar.w.getClass();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void x1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        h(u1Var, z10, false, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void y0() {
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        org.telegram.ui.Components.e6 animation;
        qn qnVar = this.a;
        if (qnVar.l3 || SharedConfig.noSoundHintShowed || qnVar.x0 == null || qnVar.getParentActivity() == null || qnVar.fragmentView == null) {
            return;
        }
        org.telegram.ui.Components.r40 r40Var = qnVar.t2;
        if (r40Var == null || r40Var.getTag() == null) {
            if (qnVar.t2 == null) {
                jm jmVar = qnVar.X0;
                int indexOfChild = jmVar.indexOfChild(qnVar.S);
                if (indexOfChild == -1) {
                    return;
                }
                org.telegram.ui.Components.r40 r40Var2 = new org.telegram.ui.Components.r40(0, qnVar.getParentActivity(), qnVar.ea, false);
                qnVar.t2 = r40Var2;
                r40Var2.setShowingDuration(10000L);
                jmVar.addView(qnVar.t2, indexOfChild + 1, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                qnVar.t2.setAlpha(0.0f);
                qnVar.t2.setVisibility(4);
            }
            int childCount = qnVar.x0.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = qnVar.x0.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject.isVideo() && (animation = u1Var.getPhotoImage().getAnimation()) != null && animation.o() >= 3000 && qnVar.t2.e(u1Var, null, 0, 0, true)) {
                    SharedConfig.setNoSoundHintShowed(true);
                    return;
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void z0(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject, boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        qn qnVar = this.a;
        if (qnVar.getParentActivity() == null || tLObject == null) {
            return;
        }
        d5Var = ((org.telegram.ui.ActionBar.n2) qnVar).parentLayout;
        if (d5Var != null) {
            d5Var2 = ((org.telegram.ui.ActionBar.n2) qnVar).parentLayout;
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
            qnVar.presentFragment(new qn(bundle));
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, qnVar.getParentActivity(), qnVar.getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(qnVar.getThemedColor(org.telegram.ui.ActionBar.h6.G8));
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(qnVar.getParentActivity(), false, false);
        e1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
        e1Var.setMinimumWidth(160);
        e1Var.setOnClickListener(new a(this, 14));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
        org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(qnVar.getParentActivity(), false, false);
        e1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
        e1Var2.setMinimumWidth(160);
        e1Var2.setOnClickListener(new a0(this, (TLRPC.Chat) tLObject, u1Var, 7));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var2);
        qn qnVar2 = new qn(bundle);
        qnVar2.J9 = true;
        qnVar.presentFragmentAsPreviewWithMenu(qnVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
        qnVar.g7();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.l1
    public final boolean z1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        c5 c5Var;
        jk jkVar;
        ik ikVar;
        if (!k()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(ChatObject.getPublicUsername(chat));
        qn qnVar = this.a;
        int i14 = (isEmpty || qnVar.e == null || ((jkVar = qnVar.O0) != null && jkVar.getVisibility() == 0) || ((ikVar = qnVar.R) != null && ikVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat2 = qnVar.e;
        int i15 = (chat2 == null || !(qnVar.d4 == 0 || qnVar.h4) || (ChatObject.isChannel(chat2) && !qnVar.e.megagroup)) ? 0 : 1;
        TLRPC.Chat chat3 = qnVar.e;
        int i16 = (chat3 == null || chat3.id != chat.id || qnVar.K9()) ? 1 : 0;
        i5[] i5VarArr = new i5[i16 + 1 + i14 + i15];
        i5VarArr[0] = i5.d;
        if (i16 != 0) {
            i5VarArr[1] = chat.broadcast ? i5.e : i5.f;
            i10 = 2;
        } else {
            i10 = 1;
        }
        if (i14 != 0) {
            i5VarArr[i10] = i5.n;
            i10++;
        }
        if (i15 != 0) {
            i5VarArr[i10] = i5.r;
        }
        TLRPC.ChatFull chatFull = qnVar.getMessagesController().getChatFull(chat.id);
        if (chatFull != null) {
            c5Var = c5.a(chat, chatFull, i5VarArr);
            i13 = i15;
            i12 = i16;
            z10 = true;
            z11 = i14;
        } else {
            i11 = ((org.telegram.ui.ActionBar.n2) qnVar).classGuid;
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
            c5Var = new c5(forUserOrChat, forUserOrChat2, null, str, null, null, chatPhoto != null ? chatPhoto.strippedBitmap : null, chat, i5VarArr, new b5(i11, chat, NotificationCenter.chatInfoDidLoad));
        }
        if (c2.b.g(c5Var)) {
            c2.b.m().y((ViewGroup) qnVar.fragmentView, qnVar.ea, c5Var, new e7(this, chat, u1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(qnVar, u1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new qm(this, chat, 0), false);
        boolean z12 = chat.broadcast;
        H.l(z12 ? R.drawable.msg_channel : R.drawable.msg_discussion, LocaleController.getString(z12 ? R.string.OpenChannel2 : R.string.OpenGroup2), new t1(this, u1Var, chat, 26), i12);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new qm(this, chat, 1), z11);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new qm(this, chat, 2), i13);
        H.t = false;
        H.i = 3;
        boolean z13 = z10;
        H.W = z13;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return z13;
    }
}
