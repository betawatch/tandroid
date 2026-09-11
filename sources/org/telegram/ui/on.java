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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class on implements org.telegram.ui.Cells.k1 {
    public final /* synthetic */ co a;

    public on(co coVar) {
        this.a = coVar;
    }

    public static void a(on onVar, org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
        int i10;
        co coVar = onVar.a;
        if (coVar.getParentActivity() == null || document == null) {
            return;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23 && ((i11 <= 28 || BuildVars.NO_SCOPED_STORAGE) && coVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
            coVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
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
        i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
        arrayList.add(new MessageObject(i10, tL_message, false, true));
        MediaController.saveFilesFromMessages(coVar.getParentActivity(), coVar.getAccountInstance(), arrayList, new va(onVar, 1));
    }

    @Override // org.telegram.ui.Cells.k1
    public final void A(org.telegram.ui.Cells.t1 t1Var) {
        co coVar = this.a;
        if (!coVar.getMessagesController().showSensitiveContent()) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(coVar.getParentActivity(), 3, null);
            b2Var.q(200L);
            coVar.getMessagesController().getContentSettings(new y(this, b2Var, t1Var, 5));
        } else {
            if (t1Var.getMessageObject() != null) {
                t1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
            }
            t1Var.h4();
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void A0(org.telegram.ui.Cells.t1 t1Var) {
        k(t1Var, true, false, true);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void A1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        co coVar = this.a;
        if (coVar.z9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
        if (coVar.getParentActivity() != null) {
            if (coVar.O0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                if (tL_inlineButtonTypeCopy == null) {
                    if (tL_inlineButtonTypeUrl != null) {
                        coVar.Z9(null, tL_inlineButtonTypeUrl.url, true, t1Var, t1Var.getMessageObject());
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
                org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) coVar.getParentActivity(), (org.telegram.ui.ActionBar.f6) coVar.ea, false);
                f3Var.fixNavigationBar();
                f3Var.title = str;
                f3Var.bigTitle = false;
                f3Var.multipleLinesTitle = true;
                CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Copy)};
                mg.j jVar = new mg.j(3, coVar, str);
                f3Var.items = charSequenceArr;
                f3Var.onClickListener = jVar;
                coVar.showDialog(f3Var);
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean B1() {
        co coVar = this.a;
        return coVar.X0.getKeyboardHeight() + coVar.oa >= AndroidUtilities.dp(20.0f);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void C0(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject;
        if (t1Var == null || (messageObject = t1Var.getMessageObject()) == null || messageObject.messageOwner == null) {
            return;
        }
        int id2 = messageObject.getId();
        co coVar = this.a;
        if (coVar.wb == id2 && coVar.xb == 7) {
            return;
        }
        TLRPC.InputPeer inputPeer = coVar.getMessagesController().getInputPeer(messageObject.getDialogId());
        if (inputPeer == null) {
            return;
        }
        TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
        getrichmessage.peer = inputPeer;
        getrichmessage.id = id2;
        of.e eVar = coVar.Ab;
        if (eVar != null) {
            eVar.a(true);
            coVar.Ab = null;
        }
        int[] iArr = new int[1];
        aj ajVar = new aj(coVar, id2, t1Var, 2);
        ajVar.b = new fh(0, coVar, iArr);
        coVar.Ab = ajVar;
        ajVar.d();
        iArr[0] = coVar.getConnectionsManager().sendRequestTyped(getrichmessage, new org.telegram.messenger.a(), new mg(coVar, ajVar, iArr, t1Var, messageObject));
    }

    @Override // org.telegram.ui.Cells.k1
    public final void D1(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        co coVar = this.a;
        coVar.d5 = messageObject;
        coVar.d9();
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
        co coVar = this.a;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    coVar.I7(t1Var, true, false, t1Var.getLastTouchX(), t1Var.getLastTouchY(), true, false, true);
                    return;
                } else {
                    if (i12 == 4) {
                        coVar.R1.m(messageObject.getTopicId(), true);
                        return;
                    }
                    return;
                }
            }
            if (message.suggested_post != null) {
                i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, coVar.e);
                if (canManageMonoForum) {
                    i11 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                    ChatObject.canUserDoChannelDirectAdminAction(i11, coVar.e, 5);
                }
                bi.e4 e4Var = new bi.e4(this, message, canManageMonoForum, messageObject, 11);
                TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                coVar.g7(e4Var, zf.a.l(suggestedPost != null ? suggestedPost.price : null), !canManageMonoForum);
                return;
            }
            return;
        }
        long peerDialogId = DialogObject.getPeerDialogId(message.from_id);
        nf nfVar = new nf(8, this, message);
        Pattern pattern = org.telegram.ui.Components.e5.a;
        Activity parentActivity = coVar.getParentActivity();
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
        editText.setFilters(new InputFilter[]{new org.telegram.ui.Components.t4(parentActivity)});
        editText.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0, AndroidUtilities.dp(8.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f));
        editText.setSelection(editText.getText().toString().length());
        e2Var.n(frameLayout);
        e2Var.k(LocaleController.getString(R.string.Decline), new m4(22, nfVar, editText));
        e2Var.h(LocaleController.getString(R.string.Cancel), null);
        b2Var.N = new org.telegram.ui.Components.q1(editText, i13);
        frameLayout.addView(editText, w7.x5.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
        editText.requestFocus();
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.pg(editText, 3), 100L);
        coVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void F(org.telegram.ui.Cells.t1 t1Var) {
        co coVar = this.a;
        coVar.xa.l(t1Var, coVar, true);
        coVar.x0.I0(false);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void F0(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        messageObject.messageOwner.summarizedOpen = !r1.summarizedOpen;
        messageObject.updateTranslation(true);
        co coVar = this.a;
        coVar.getMessagesStorage().updateMessageCustomParams(messageObject.getDialogId(), messageObject.messageOwner);
        coVar.getMessagesController().getTranslateController().checkTranslation(messageObject, true);
        k(t1Var, true, false, true);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void F1(MessageObject messageObject) {
        this.a.s.put(messageObject, Boolean.TRUE);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void G1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        Uri parse;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        boolean z11 = (z10 || !of.f.h(str, false, false)) ? z10 : true;
        co coVar = this.a;
        of.e eVar = coVar.Ab;
        if (eVar != null) {
            eVar.a(true);
        }
        coVar.Ab = t1Var.getMessageObject() == null ? null : new kn(this, t1Var);
        if (z11 || of.f.f(parse, false, null)) {
            of.f.r(coVar.getParentActivity(), parse, true, true, false, coVar.Ab, null, false, true, false);
        } else {
            org.telegram.ui.Components.e5.r0(coVar, str, true, true, true, !z11, coVar.Ab, webPage, coVar.ea);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final CharacterStyle H1(org.telegram.ui.Cells.t1 t1Var) {
        co coVar;
        int i10;
        if (t1Var.getMessageObject() == null || (i10 = (coVar = this.a).wb) == 0 || i10 != t1Var.getMessageObject().getId() || coVar.xb != 1) {
            return null;
        }
        return coVar.yb;
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
        org.telegram.messenger.vl.o(R.string.CodeCopied, org.telegram.ui.Components.yc.a0(this.a));
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean I0(long j3) {
        co coVar = this.a;
        TLRPC.Chat chat = coVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return false;
        }
        return coVar.getMessagesController().isOwner(coVar.e.id, j3);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        try {
            co coVar = this.a;
            org.telegram.ui.Components.tu.J(coVar, messageObject, coVar.Fa, str2, str3, str4, str, i10, i11, -1, coVar.x9());
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void J0(org.telegram.ui.Cells.t1 t1Var) {
        int i10;
        a3.g0 g0Var;
        MessageObject.GroupedMessages groupedMessages;
        int i11;
        co coVar = this.a;
        vh.i iVar = coVar.X9;
        if (iVar == null) {
            return;
        }
        HashMap hashMap = iVar.a;
        vh.h hVar = (vh.h) hashMap.get(vh.i.b(t1Var));
        org.telegram.ui.Components.qc qcVar = null;
        MessageObject messageObject = hVar != null ? hVar.E : null;
        vh.h hVar2 = (vh.h) coVar.X9.a.get(vh.i.b(t1Var));
        long j3 = (hVar2 == null || (i11 = hVar2.R) == -1) ? 0L : hVar2.w[i11].d;
        if (messageObject != null && j3 != 0) {
            Activity parentActivity = coVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
            if (!org.telegram.ui.Components.e5.h(parentActivity, i10, j3, false)) {
                ArrayList<MessageObject> arrayList = (messageObject.getGroupId() == 0 || (groupedMessages = (MessageObject.GroupedMessages) coVar.x6.f(messageObject.getGroupId())) == null) ? null : groupedMessages.messages;
                if (arrayList == null) {
                    arrayList = org.telegram.messenger.w1.l(messageObject);
                }
                boolean z10 = j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                long j10 = j3;
                a3.g0 g0Var2 = new a3.g0(this, arrayList, j10, 15);
                if (z10) {
                    g0Var2.run();
                    g0Var = null;
                } else {
                    g0Var = g0Var2;
                }
                qcVar = org.telegram.ui.Components.yc.v(coVar.getParentActivity(), coVar, null, 1, j10, 1, coVar.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), coVar.getThemedColor(org.telegram.ui.ActionBar.j6.Hi), 5000, false, g0Var);
                qcVar.k = true;
                qcVar.k(qcVar.e instanceof org.telegram.ui.Components.bc);
            }
        }
        vh.h hVar3 = (vh.h) hashMap.get(vh.i.b(t1Var));
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
            viewTreeObserver.addOnPreDrawListener(new im(2, hVar3, viewTreeObserver));
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean J1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        ViewGroup viewGroup;
        int i10;
        i51 i51Var;
        if (messageObject.isVoiceOnce() || messageObject.isRoundOnce()) {
            int i11 = 1;
            k51 k51Var = this.a.Z9;
            if (k51Var == null || k51Var.b0) {
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
                this.a.Z9 = new k51(this.a.getParentActivity());
                k51 k51Var2 = this.a.Z9;
                te fb2 = !messageObject.isOutOwner() ? this.a.fb(messageObject, true) : null;
                a3.g0 O4 = !messageObject.isOutOwner() ? co.O4(this.a, messageObject) : null;
                Context context = k51Var2.a;
                ah.w wVar = k51Var2.c;
                k51Var2.X = fb2;
                k51Var2.Y = O4;
                i51 i51Var2 = k51Var2.N;
                if (i51Var2 != null) {
                    wVar.removeView(i51Var2);
                    k51Var2.N = null;
                }
                k51Var2.O = t1Var;
                MessageObject messageObject2 = t1Var.getMessageObject();
                k51Var2.M = messageObject2;
                k51Var2.S = messageObject2 != null && messageObject2.isRoundVideo();
                org.telegram.ui.Cells.t1 t1Var2 = k51Var2.O;
                k51Var2.L = t1Var2 != null ? t1Var2.getResourcesProvider() : null;
                if (k51Var2.O != null) {
                    k51Var2.T = 0.0f;
                    k51Var2.U = t1Var.n;
                    if (t1Var.getParent() instanceof View) {
                        View view = (View) t1Var.getParent();
                        k51Var2.T = view.getY() + k51Var2.T;
                        k51Var2.U = view.getY() + k51Var2.U;
                    }
                    int width = k51Var2.O.getWidth();
                    int height = k51Var2.O.getHeight();
                    if (k51Var2.S) {
                        height = Math.min(AndroidUtilities.dp(360.0f), Math.min(width, AndroidUtilities.displaySize.y));
                    }
                    int i12 = height;
                    k51Var2.K = i12 - k51Var2.O.getHeight();
                    i10 = (int) Math.ceil((Math.min(width, i12) * 0.92f) / AndroidUtilities.density);
                    viewGroup = wVar;
                    i51 i51Var3 = new i51(k51Var2, k51Var2.getContext(), UserConfig.selectedAccount, k51Var2.O.getResourcesProvider(), width, i12);
                    k51Var2.N = i51Var3;
                    k51Var2.O.j1(i51Var3);
                    k51Var2.N.i1(k51Var2.O);
                    k51Var2.N.setDelegate(new na.d());
                    i51 i51Var4 = k51Var2.N;
                    MessageObject messageObject3 = k51Var2.M;
                    MessageObject.GroupedMessages currentMessagesGroup = k51Var2.O.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.t1 t1Var3 = k51Var2.O;
                    i51Var4.X3(messageObject3, currentMessagesGroup, t1Var3.F, t1Var3.E, false, false);
                    if (!k51Var2.S) {
                        org.telegram.ui.Components.l8 l8Var = new org.telegram.ui.Components.l8();
                        k51Var2.V = l8Var;
                        i51 i51Var5 = k51Var2.N;
                        l8Var.i = i51Var5;
                        i51Var5.ee = l8Var;
                        if (i51Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.io0 seekBarWaveform = k51Var2.N.getSeekBarWaveform();
                            seekBarWaveform.L = k51Var2.s;
                            org.telegram.ui.Cells.t1 t1Var4 = seekBarWaveform.n;
                            if (t1Var4 != null) {
                                t1Var4.invalidate();
                            }
                        }
                    }
                    k51Var2.H = false;
                    viewGroup.addView(k51Var2.N, new FrameLayout.LayoutParams(k51Var2.O.getWidth(), i12, 17));
                } else {
                    viewGroup = wVar;
                    i10 = 360;
                }
                TextureView textureView = k51Var2.P;
                if (textureView != null) {
                    viewGroup.removeView(textureView);
                    k51Var2.P = null;
                }
                if (k51Var2.S) {
                    k51Var2.Q = false;
                    TextureView textureView2 = new TextureView(context);
                    k51Var2.P = textureView2;
                    viewGroup.addView(textureView2, 0, w7.x5.c(i10, i10));
                }
                MediaController.getInstance().pauseByRewind();
                org.telegram.ui.Components.g71 g71Var = k51Var2.w;
                if (g71Var != null) {
                    g71Var.B();
                    k51Var2.w.H();
                    k51Var2.w = null;
                }
                org.telegram.ui.Cells.t1 t1Var5 = k51Var2.O;
                if (t1Var5 != null && t1Var5.getMessageObject() != null) {
                    File pathToAttach = FileLoader.getInstance(k51Var2.O.getMessageObject().currentAccount).getPathToAttach(k51Var2.O.getMessageObject().getDocument());
                    if (pathToAttach != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && (pathToAttach = FileLoader.getInstance(k51Var2.O.getMessageObject().currentAccount).getPathToMessage(k51Var2.O.getMessageObject().messageOwner)) != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && k51Var2.O.getMessageObject().messageOwner.attachPath != null) {
                        pathToAttach = new File(k51Var2.O.getMessageObject().messageOwner.attachPath);
                    }
                    if (pathToAttach != null && pathToAttach.exists()) {
                        org.telegram.ui.Components.g71 g71Var2 = new org.telegram.ui.Components.g71();
                        k51Var2.w = g71Var2;
                        g71Var2.J = new j51(k51Var2);
                        if (k51Var2.V != null) {
                            g71Var2.K = new j51(k51Var2);
                        }
                        if (k51Var2.S) {
                            g71Var2.V(k51Var2.P);
                        }
                        k51Var2.w.D(Uri.fromFile(pathToAttach), "other");
                        k51Var2.w.C();
                        org.telegram.ui.Components.ht htVar = k51Var2.E;
                        if (htVar != null) {
                            htVar.s = k51Var2.w;
                            htVar.a();
                        }
                    }
                    co coVar = this.a;
                    coVar.showDialog(coVar.Z9);
                    return false;
                }
                di.f4 f4Var = k51Var2.x;
                if (f4Var != null) {
                    viewGroup.removeView(f4Var);
                    k51Var2.x = null;
                }
                MessageObject messageObject4 = k51Var2.M;
                boolean z10 = messageObject4 != null && messageObject4.isOutOwner();
                MessageObject messageObject5 = k51Var2.M;
                if (messageObject5 != null && messageObject5.getDialogId() != UserConfig.getInstance(k51Var2.M.currentAccount).getClientUserId()) {
                    di.f4 f4Var2 = new di.f4(context, 3);
                    k51Var2.x = f4Var2;
                    f4Var2.p(true);
                    if (z10) {
                        long dialogId = k51Var2.M.getDialogId();
                        String str = "";
                        if (dialogId > 0) {
                            TLRPC.User user = MessagesController.getInstance(k51Var2.M.currentAccount).getUser(Long.valueOf(dialogId));
                            if (user != null) {
                                str = UserObject.getFirstName(user);
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(k51Var2.M.currentAccount).getChat(Long.valueOf(-dialogId));
                            if (chat != null) {
                                str = chat.title;
                            }
                        }
                        k51Var2.x.s(AndroidUtilities.replaceTags(LocaleController.formatString(k51Var2.S ? R.string.VideoOnceOutHint : R.string.VoiceOnceOutHint, str)));
                    } else {
                        k51Var2.x.s(AndroidUtilities.replaceTags(LocaleController.getString(k51Var2.S ? R.string.VideoOnceHint : R.string.VoiceOnceHint)));
                    }
                    k51Var2.x.q(12.0f);
                    k51Var2.x.setPadding(AndroidUtilities.dp((z10 || k51Var2.O.F) ? 0.0f : 6.0f), 0, 0, 0);
                    if (k51Var2.S) {
                        k51Var2.x.m(0.5f, 0.0f);
                        k51Var2.x.K = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        k51Var2.x.m(0.0f, AndroidUtilities.dp(34.0f));
                        k51Var2.x.K = Layout.Alignment.ALIGN_NORMAL;
                    }
                    k51Var2.x.t(14.0f);
                    di.f4 f4Var3 = k51Var2.x;
                    f4Var3.h = di.f4.a(f4Var3.getText(), k51Var2.x.getTextPaint());
                    if (k51Var2.S) {
                        viewGroup.addView(k51Var2.x, w7.x5.d((int) ((k51Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((k51Var2.O.getHeight() + k51Var2.K) / AndroidUtilities.density) / 2.0f), 0.0f, 0.0f));
                    } else {
                        viewGroup.addView(k51Var2.x, w7.x5.d((int) ((k51Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, ((((k51Var2.O.getWidth() * (-0.39999998f)) / 2.0f) + k51Var2.O.getBoundsLeft()) / AndroidUtilities.density) + 1.0f, ((-75.0f) - ((k51Var2.O.getHeight() / AndroidUtilities.density) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    k51Var2.x.u();
                }
                TextView textView = k51Var2.y;
                if (textView != null) {
                    viewGroup.removeView(textView);
                    k51Var2.y = null;
                }
                TextView textView2 = new TextView(context);
                k51Var2.y = textView2;
                textView2.setTextColor(-1);
                k51Var2.y.setTypeface(AndroidUtilities.bold());
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    k51Var2.y.setBackground(org.telegram.ui.ActionBar.j6.i0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    k51Var2.y.setBackground(org.telegram.ui.ActionBar.j6.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                k51Var2.y.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
                w7.z5.a(k51Var2.y);
                k51Var2.y.setText(LocaleController.getString(z10 ? R.string.VoiceOnceClose : R.string.VoiceOnceDeleteClose));
                k51Var2.y.setOnClickListener(new g51(k51Var2, i11));
                viewGroup.addView(k51Var2.y, w7.x5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z10 && (i51Var = k51Var2.N) != null && i51Var.getMessageObject() != null && k51Var2.N.getMessageObject().messageOwner != null) {
                    k51Var2.N.getMessageObject().messageOwner.media_unread = false;
                    k51Var2.N.invalidate();
                }
                co coVar2 = this.a;
                coVar2.showDialog(coVar2.Z9);
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
                co coVar3 = this.a;
                return mediaController.setPlaylist(L, messageObject, coVar3.L6, true ^ coVar3.A0.N, null);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void K1(org.telegram.ui.Cells.t1 t1Var, ah.u uVar) {
        TLRPC.Message message;
        if (t1Var == null) {
            uVar.run();
            return;
        }
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject == null || ((messageObject.isSending() && !messageObject.isEditing()) || (message = messageObject.messageOwner) == null || message.rich_message == null)) {
            uVar.run();
        } else {
            org.telegram.ui.ActionBar.n2 n2Var = this.a;
            n2Var.getSendMessagesHelper().editRichMessage(messageObject, messageObject.messageOwner.rich_message, null, n2Var, true);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void L(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject.messageOwner.send_state != 0) {
            this.a.getSendMessagesHelper().cancelSendingMessage(messageObject);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void L0(int i10, org.telegram.ui.Cells.t1 t1Var) {
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
        co coVar = this.a;
        if (i10 == 19) {
            of.e eVar = coVar.Ab;
            if (eVar != null) {
                eVar.a(true);
            }
            final hn hnVar = t1Var.getMessageObject() != null ? new hn(this, t1Var, 2) : null;
            coVar.Ab = hnVar;
            final Activity parentActivity = coVar.getParentActivity();
            final org.telegram.ui.ActionBar.f6 resourceProvider = coVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            hnVar.d();
            hnVar.b = new ug.e(atomicBoolean, 0);
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
            final String b11 = ug.j.b(messageObject);
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
            final boolean z10 = chat != null && ChatObject.isChannelAndNotMegaGroup(chat);
            final long j3 = messageObject.messageOwner.date * 1000;
            ug.t.d(messageObject, new Utilities.Callback(atomicBoolean, hnVar, z10, b11, j3, tL_messageMediaGiveaway2, parentActivity, resourceProvider) { // from class: ug.f
                public final /* synthetic */ AtomicBoolean a;
                public final /* synthetic */ of.e b;
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
                        j.d(z12, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, f6Var);
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        j.e(z12, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, f6Var);
                    }
                }
            }, new ug.g(atomicBoolean, hnVar, 0));
            return;
        }
        if (i10 == 21) {
            h();
            return;
        }
        if (i10 == 84) {
            coVar.ua(t1Var);
            return;
        }
        if (i10 == 80) {
            org.telegram.ui.Cells.t8 t8Var = org.telegram.ui.Components.pg0.O;
            if (coVar.getParentActivity() == null) {
                return;
            }
            coVar.showDialog(new org.telegram.ui.Components.pg0(coVar.getContext(), coVar.getCurrentAccount(), messageObject, coVar.getResourceProvider()));
            return;
        }
        if (i10 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
            if (messageMedia4 == null || (webPage = messageMedia4.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                coVar.createArticleViewer(false).N(messageObject, null, null, null);
                return;
            }
            return;
        }
        int i15 = 5;
        if (i10 == 5) {
            long j10 = messageObject.messageOwner.media.user_id;
            if (j10 != 0) {
                i14 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
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
                coVar.presentFragment(new ProfileActivity(bundle, null));
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
                coVar.showDialog(new org.telegram.ui.Components.pe0(coVar, null, user, null, file, gf.b.d(str, false), str3, str4, coVar.ea));
                return;
            } catch (Exception e7) {
                FileLog.e(e7);
                return;
            }
        }
        if (i10 == 30) {
            coVar.presentFragment(new co(w.f.e(messageObject.messageOwner.media.user_id, "user_id")));
            return;
        }
        if (i10 == 31) {
            long j11 = messageObject.messageOwner.media.user_id;
            if (j11 != 0) {
                i13 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(j11));
            }
            if (user2 != null) {
                if (!TextUtils.isEmpty(messageObject.vCardData)) {
                    b10 = messageObject.vCardData.toString();
                } else if (TextUtils.isEmpty(user2.phone)) {
                    String str5 = MessageObject.getMedia(messageObject.messageOwner).phone_number;
                    b10 = !TextUtils.isEmpty(str5) ? gf.b.c().b(str5) : LocaleController.getString(R.string.NumberUnknown);
                } else {
                    b10 = org.telegram.messenger.w1.j(new StringBuilder("+"), user2.phone, gf.b.c());
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user2.id);
                bundle2.putString("phone", b10);
                bundle2.putBoolean("addContact", true);
                coVar.presentFragment(new ss(bundle2));
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
            of.e eVar2 = coVar.Ab;
            if (eVar2 != null) {
                eVar2.a(true);
            }
            coVar.Ab = t1Var.getMessageObject() != null ? new hn(this, t1Var, 3) : null;
            if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                String group = matcher.group(1);
                i11 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                if (MediaDataController.getInstance(i11).getStickerSetByName(group) == null) {
                    coVar.Ab.d();
                    TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_inputStickerSetShortName.short_name = group;
                    tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                    i12 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                    coVar.Ab.b = new ah.g(this, ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickerSet, new di.u3(i16, this, z11)), 27);
                    return;
                }
            }
            of.f.r(coVar.getParentActivity(), Uri.parse(webPage2.url), true, true, false, coVar.Ab, null, false, true, false);
            return;
        }
        if (messageObject.isSponsored()) {
            coVar.J9(messageObject, false, false);
            if (messageObject.sponsoredUrl != null) {
                of.e eVar3 = coVar.Ab;
                if (eVar3 != null) {
                    eVar3.a(true);
                }
                coVar.Ab = t1Var.getMessageObject() != null ? new hn(this, t1Var, i16) : null;
                of.f.r(coVar.getParentActivity(), Uri.parse(messageObject.sponsoredUrl), true, false, false, coVar.Ab, null, false, coVar.getMessagesController().sponsoredLinksInappAllow, false);
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
                    coVar.getOrCreateStoryViewer().F(coVar.getParentActivity(), tL_webPageAttributeStory.storyItem, bi.d9.a(coVar.x0));
                    return;
                }
            }
        }
        if (coVar.ea(storyMentionWebpage.url, t1Var, null, messageObject.getId(), 2)) {
            return;
        }
        of.e eVar4 = coVar.Ab;
        if (eVar4 != null) {
            eVar4.a(true);
        }
        coVar.Ab = t1Var.getMessageObject() != null ? new hn(this, t1Var, i15) : null;
        of.f.r(coVar.getParentActivity(), Uri.parse(storyMentionWebpage.url), true, true, false, coVar.Ab, null, false, true, false);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void L1() {
        org.telegram.ui.ActionBar.f6 f6Var;
        co coVar = this.a;
        if (coVar.X0 == null || coVar.getParentActivity() == null) {
            return;
        }
        Context context = coVar.X0.getContext();
        f6Var = ((org.telegram.ui.ActionBar.n2) coVar).resourceProvider;
        k41.T(context, coVar, false, f6Var, null);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void M(int i10, org.telegram.ui.Cells.t1 t1Var) {
        boolean z10 = t1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveaway;
        co coVar = this.a;
        if (z10) {
            long j3 = -((TLRPC.TL_messageMediaGiveaway) t1Var.getMessageObject().messageOwner.media).channels.get(i10).longValue();
            if (coVar.T5 != j3) {
                coVar.presentFragment(co.R9(j3));
            } else {
                coVar.a1.e(false, false);
            }
        }
        if (t1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            coVar.presentFragment(ProfileActivity.m4(((TLRPC.TL_messageMediaGiveawayResults) t1Var.getMessageObject().messageOwner.media).winners.get(i10).longValue()));
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void M1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        aj ajVar;
        int i10;
        MessageObject messageObject = t1Var.getMessageObject();
        rg.f fVar = null;
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
                        TLRPC.TL_message C7 = co.C7(message);
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
                co coVar = this.a;
                t12.K2(null, coVar, coVar.ea);
                PhotoViewer.t1().a2(arrayList, i11, this.a.a(), 0L, 0L, this.a.Ga);
                return;
            }
            return;
        }
        co coVar2 = this.a;
        of.e eVar = coVar2.Ab;
        if (eVar != null) {
            eVar.a(true);
            coVar2.Ab = null;
        }
        if (t1Var.getMessageObject() == null) {
            coVar2.Ab = null;
            ajVar = null;
        } else {
            ajVar = new aj(coVar2, t1Var.getMessageObject().getId(), t1Var, 1);
            coVar2.Ab = ajVar;
        }
        i10 = ((org.telegram.ui.ActionBar.n2) this.a).currentAccount;
        zh.s5 y3 = zh.s5.y(i10, false);
        Objects.requireNonNull(ajVar);
        dj djVar = new dj(ajVar, 7);
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        org.telegram.ui.ActionBar.f6 I = zh.s5.I();
        if (messageObject != null && context != null) {
            long dialogId = messageObject.getDialogId();
            int id2 = messageObject.getId();
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = MessagesController.getInstance(y3.a).getInputPeer(dialogId);
            tL_inputInvoiceMessage.msg_id = id2;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject p5 = fi.k3.p(I, false);
            if (p5 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p5.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
            fVar = new rg.f(y3, ConnectionsManager.getInstance(y3.a).sendRequest(tL_payments_getPaymentForm, new bi.c3(y3, messageObject, tL_inputInvoiceMessage, djVar, 19)), 6);
        }
        if (fVar != null) {
            ajVar.b = fVar;
            ajVar.d();
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void N(MessageObject messageObject) {
        if (messageObject.isVideo()) {
            this.a.fb(messageObject, true);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void N0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        co coVar = this.a;
        coVar.getSendMessagesHelper().sendCallback(true, t1Var.getMessageObject(), keyboardInlineButton, coVar);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void N1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10;
        int i11;
        ImageLocation forDocument;
        String str2;
        boolean isEmpty = TextUtils.isEmpty(str);
        co coVar = this.a;
        if (!isEmpty) {
            of.f.s(coVar.getParentActivity(), "https://" + coVar.getMessagesController().linkPrefix + "/nft/" + str);
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
        sg.o1 o1Var = new sg.o1(coVar, i10, user, null, null, coVar.ea);
        t1Var.getLocationOnScreen(new int[2]);
        o1Var.v0 = t1Var.getNameStatusX();
        o1Var.w0 = t1Var.getNameStatusY();
        o1Var.z0 = t1Var.getScaleX();
        o1Var.x0 = t1Var.getLeft();
        o1Var.y0 = t1Var.getTop();
        o1Var.A0 = t1Var;
        int colorId = UserObject.getColorId(user);
        if (colorId < 7) {
            o1Var.u0 = Integer.valueOf(coVar.getThemedColor(org.telegram.ui.ActionBar.j6.r8[colorId]));
        } else {
            i11 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
            MessagesController.PeerColors peerColors = MessagesController.getInstance(i11).peerColors;
            MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(colorId) : null;
            o1Var.u0 = color != null ? Integer.valueOf(color.getColor1()) : null;
        }
        org.telegram.ui.Components.o5 o5Var = t1Var.fc;
        if (o5Var != null && (o5Var.f[0] instanceof org.telegram.ui.Components.q5)) {
            o1Var.z0 *= 0.95f;
            if (document != null) {
                org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(coVar.getParentActivity());
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
                x9Var.setLayerNum(7);
                x9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                x9Var.l(imageLocation, str3, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "140_140", svgThumb, document);
                if (MessageObject.isTextColorEmoji(document)) {
                    Integer num = o1Var.u0;
                    x9Var.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : coVar.getThemedColor(org.telegram.ui.ActionBar.j6.v6), PorterDuff.Mode.SRC_IN));
                    o1Var.C0 = MessageObject.getInputStickerSet(document);
                } else {
                    o1Var.C0 = MessageObject.getInputStickerSet(document);
                }
                o1Var.B0 = x9Var;
                o1Var.E0 = true;
            }
        }
        coVar.showDialog(o1Var);
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean O(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        int i10;
        int i11;
        boolean isForwarded = t1Var.getMessageObject().isForwarded();
        co coVar = this.a;
        if (isForwarded) {
            long peerDialogId = DialogObject.getPeerDialogId(t1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(coVar);
            int i12 = R.raw.passcode_lock_close;
            int i13 = R.string.TodoCompleteForbiddenForward;
            i11 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
            a02.Q(i12, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i13, DialogObject.getName(i11, peerDialogId)))).k(true);
            return false;
        }
        if (t1Var.getMessageObject().canCompleteTodo()) {
            if (coVar.getUserConfig().isPremium()) {
                coVar.getSendMessagesHelper().toggleTodo(ChatObject.getSendAsPeerId(coVar.e, coVar.Z7, true), t1Var.getMessageObject(), todoItem, z10, null);
                return true;
            }
            org.telegram.ui.Components.yc.a0(coVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.TodoPremiumRequired), new zm(this, 9))).k(true);
            return false;
        }
        long peerDialogId2 = DialogObject.getPeerDialogId(t1Var.getMessageObject().getFromPeer());
        org.telegram.ui.Components.yc a03 = org.telegram.ui.Components.yc.a0(coVar);
        int i14 = R.raw.passcode_lock_close;
        int i15 = R.string.TodoCompleteForbidden;
        i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
        a03.Q(i14, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i15, DialogObject.getName(i10, peerDialogId2)))).k(true);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:310:0x0687, code lost:
    
        if (r4.paid_reactions_available != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x068d, code lost:
    
        if (r7.isEmpty() == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x06bd, code lost:
    
        if (r4.paid_reactions_available != false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x06d9, code lost:
    
        if (r7.isEmpty() != false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x06c7, code lost:
    
        if (org.telegram.messenger.ChatObject.isChannel(r5.e) == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x06d3, code lost:
    
        if (org.telegram.messenger.ChatObject.isMonoForum(r5.e) != false) goto L188;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x084e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x09a4 A[LOOP:3: B:254:0x09a2->B:255:0x09a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0a07  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0a1f  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0aa1  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0944  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0693  */
    @Override // org.telegram.ui.Cells.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean O1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        lw0 lw0Var;
        TLRPC.PollAnswer pollAnswer2;
        lw0 lw0Var2;
        gw0 gw0Var;
        MessageObject messageObject;
        MessageObject messageObject2;
        boolean z10;
        gw0 gw0Var2;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        ArrayList arrayList;
        bf bfVar;
        co coVar;
        MessageObject messageObject3;
        org.telegram.ui.Components.n70 n70Var;
        lw0 lw0Var3;
        MessageObject messageObject4;
        int size;
        int i10;
        ViewGroup viewGroup;
        boolean z16;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        boolean z17;
        byte[] bArr;
        gw0 gw0Var3;
        TLRPC.PollAnswerVoters pollAnswerVoters;
        boolean z18;
        lw0 lw0Var4;
        ArrayList arrayList2;
        byte[] bArr2;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll2;
        TLRPC.PollAnswer pollAnswer3;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll3;
        boolean z19;
        rh.q qVar;
        boolean z20;
        ArrayList<TLRPC.PollAnswerVoters> arrayList3;
        co coVar2 = this.a;
        if (coVar2.getParentActivity() != null && coVar2.getParentActivity() != null) {
            di.f4 f4Var = coVar2.x1;
            if (f4Var != null && f4Var.V) {
                f4Var.e(true);
            }
            yl ylVar = coVar2.B1;
            if (ylVar != null && ylVar.V) {
                ylVar.e(true);
            }
            MessageObject primaryMessageObject = t1Var.getPrimaryMessageObject();
            TLRPC.MessageMedia media = MessageObject.getMedia(primaryMessageObject);
            if (primaryMessageObject != null && (media instanceof TLRPC.TL_messageMediaPoll)) {
                coVar2.d5 = primaryMessageObject;
                coVar2.e5 = null;
                lw0 lw0Var5 = new lw0(coVar2.getParentActivity(), coVar2.getResourceProvider());
                byte[] bArr3 = pollAnswer.option;
                lw0Var5.L = t1Var;
                lw0Var5.P = bArr3;
                MessageObject messageObject5 = t1Var.getMessageObject();
                lw0Var5.H = messageObject5;
                lw0Var5.I = messageObject5 != null && messageObject5.isOutOwner();
                org.telegram.ui.Cells.t1 t1Var2 = lw0Var5.L;
                gw0 gw0Var4 = lw0Var5.d;
                if (t1Var2 != null) {
                    lw0Var5.M = coVar2.s9 - AndroidUtilities.dp(4.0f);
                    lw0Var5.N = t1Var.n;
                    if (t1Var.getParent() instanceof View) {
                        View view = (View) t1Var.getParent();
                        lw0Var5.M = view.getY() + lw0Var5.M;
                        lw0Var5.N = view.getY() + lw0Var5.N;
                    }
                    int width = lw0Var5.L.getWidth();
                    int height = lw0Var5.L.getHeight();
                    lw0Var5.L.getHeight();
                    jw0 jw0Var = new jw0(lw0Var5, lw0Var5.getContext(), UserConfig.selectedAccount, lw0Var5.L.getResourcesProvider(), bArr3, width, height);
                    lw0Var = lw0Var5;
                    lw0Var.J = jw0Var;
                    lw0Var.L.h1(jw0Var);
                    lw0Var.J.i1(lw0Var.L);
                    lw0Var.J.setDelegate(new rb.a(17));
                    jw0 jw0Var2 = lw0Var.J;
                    MessageObject messageObject6 = lw0Var.H;
                    MessageObject.GroupedMessages currentMessagesGroup = lw0Var.L.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.t1 t1Var3 = lw0Var.L;
                    jw0Var2.X3(messageObject6, currentMessagesGroup, t1Var3.F, t1Var3.E, t1Var3.G, false);
                    jw0 jw0Var3 = lw0Var.J;
                    jw0Var3.M7 = bArr3;
                    gw0Var4.addView(jw0Var3, new FrameLayout.LayoutParams(lw0Var.L.getWidth(), height, 51));
                    kw0 kw0Var = new kw0(lw0Var.getContext(), UserConfig.selectedAccount, lw0Var.L.getResourcesProvider(), width, height, 0);
                    lw0Var.K = kw0Var;
                    lw0Var.L.j1(kw0Var);
                    lw0Var.L.h1(lw0Var.K);
                    lw0Var.K.i1(lw0Var.L);
                    lw0Var.K.setDelegate(new qb.b(17));
                    kw0 kw0Var2 = lw0Var.K;
                    MessageObject messageObject7 = lw0Var.H;
                    MessageObject.GroupedMessages currentMessagesGroup2 = lw0Var.L.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.t1 t1Var4 = lw0Var.L;
                    kw0Var2.X3(messageObject7, currentMessagesGroup2, t1Var4.F, t1Var4.E, t1Var4.G, false);
                    gw0Var4.addView(lw0Var.K, new FrameLayout.LayoutParams(lw0Var.L.getWidth(), height, 51));
                } else {
                    lw0Var = lw0Var5;
                }
                di.i1 i1Var = lw0Var.f;
                i1Var.bringToFront();
                gw0 gw0Var5 = lw0Var.e;
                gw0Var5.bringToFront();
                lw0Var.n.bringToFront();
                i1Var.w(false);
                Context context = lw0Var.a;
                View view2 = new View(context);
                org.telegram.ui.ActionBar.f6 f6Var = lw0Var.b;
                org.telegram.ui.Components.n70 G = org.telegram.ui.Components.n70.G(gw0Var4, f6Var, view2, true);
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll4 = (TLRPC.TL_messageMediaPoll) MessageObject.getMedia(lw0Var.H);
                lw0Var.V = MessageObject.isVoted(tL_messageMediaPoll4);
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
                bh.b bVar = lw0Var.G;
                if (pollAnswer2 != null) {
                    TLRPC.Poll poll = tL_messageMediaPoll4.poll;
                    boolean z21 = (poll.closed || poll.revoting_disabled) ? false : true;
                    boolean z22 = poll.multiple_choice;
                    ArrayList arrayList4 = new ArrayList();
                    TLRPC.PollResults pollResults = tL_messageMediaPoll4.results;
                    if (pollResults == null || (arrayList3 = pollResults.results) == null) {
                        tL_messageMediaPoll = tL_messageMediaPoll4;
                        z17 = z22;
                        bArr = bArr3;
                        gw0Var3 = gw0Var4;
                        pollAnswerVoters = null;
                        z18 = false;
                    } else {
                        int size2 = arrayList3.size();
                        z17 = z22;
                        int i12 = 0;
                        z18 = false;
                        TLRPC.PollAnswerVoters pollAnswerVoters2 = null;
                        while (i12 < size2) {
                            TLRPC.PollAnswerVoters pollAnswerVoters3 = arrayList3.get(i12);
                            int i13 = i12 + 1;
                            TLRPC.PollAnswerVoters pollAnswerVoters4 = pollAnswerVoters3;
                            gw0 gw0Var6 = gw0Var4;
                            boolean equals = Arrays.equals(pollAnswerVoters4.option, bArr3);
                            if (equals) {
                                pollAnswerVoters2 = pollAnswerVoters4;
                            }
                            byte[] bArr4 = bArr3;
                            if (pollAnswerVoters4.chosen) {
                                if (equals) {
                                    z18 = true;
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
                                gw0Var4 = gw0Var6;
                                i12 = i13;
                                bArr3 = bArr4;
                                tL_messageMediaPoll4 = tL_messageMediaPoll5;
                            } else {
                                gw0Var4 = gw0Var6;
                                i12 = i13;
                                bArr3 = bArr4;
                            }
                        }
                        tL_messageMediaPoll = tL_messageMediaPoll4;
                        bArr = bArr3;
                        gw0Var3 = gw0Var4;
                        pollAnswerVoters = pollAnswerVoters2;
                    }
                    if (pollAnswerVoters == null || pollAnswerVoters.voters <= 0 || !MessageObject.canShowVotersList(tL_messageMediaPoll)) {
                        lw0Var4 = lw0Var;
                        arrayList2 = arrayList4;
                        messageObject = primaryMessageObject;
                        gw0Var = gw0Var3;
                        bArr2 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                    } else {
                        rh.q qVar2 = new rh.q(context, coVar2.getCurrentAccount(), f6Var);
                        org.telegram.ui.Components.n70 J = G.J();
                        J.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                        eh.a k10 = fh.b.k(f6Var);
                        View view3 = J.B;
                        if (view3 != null) {
                            qVar = qVar2;
                            z20 = false;
                            dh.d c10 = bVar.c(view3, null, false);
                            c10.n(k10);
                            view3.setBackground(c10);
                        } else {
                            qVar = qVar2;
                            z20 = false;
                        }
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new lu0(G, 25), z20);
                        J.k();
                        long dialogId = lw0Var.H.getDialogId();
                        int id2 = lw0Var.H.getId();
                        int i17 = pollAnswerVoters.voters;
                        oj0 oj0Var = new oj0(4, lw0Var, coVar2);
                        lw0Var4 = lw0Var;
                        messageObject = primaryMessageObject;
                        arrayList2 = arrayList4;
                        gw0Var = gw0Var3;
                        rh.q qVar3 = qVar;
                        byte[] bArr5 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                        View a2 = qVar3.a(coVar2, dialogId, id2, bArr5, i17, oj0Var);
                        coVar2 = coVar2;
                        bArr2 = bArr5;
                        J.q(a2);
                        qVar3.setMinimumHeight(AndroidUtilities.dp(48.0f));
                        qVar3.setText(LocaleController.formatPluralString("PollVotesCount", pollAnswerVoters.voters, new Object[0]));
                        qVar3.a.d(pollAnswerVoters.recent_voters, false);
                        qVar3.setLayoutParams(w7.x5.n(-1, 48));
                        qVar3.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I5, false), 12, 0));
                        qVar3.setOnClickListener(new tv(G, J));
                        G.q(qVar3);
                        G.k();
                    }
                    if (!z21) {
                        lw0Var2 = lw0Var4;
                        pollAnswer3 = pollAnswer2;
                    } else if (z18) {
                        int i18 = R.drawable.msg_unvote;
                        CharSequence string = LocaleController.getString(R.string.Unvote);
                        lw0Var2 = lw0Var4;
                        co coVar3 = coVar2;
                        TLRPC.PollAnswer pollAnswer6 = pollAnswer2;
                        Runnable cw0Var = new cw0(lw0Var2, z17, coVar3, arrayList2, pollAnswer6);
                        coVar2 = coVar3;
                        pollAnswer3 = pollAnswer6;
                        G.c(i18, string, cw0Var, false);
                    } else {
                        lw0Var2 = lw0Var4;
                        pollAnswer3 = pollAnswer2;
                        boolean z23 = z17;
                        if (rh.i.a(lw0Var2.H) == 0) {
                            G.c(R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), new cw0(lw0Var2, z23, pollAnswer3, coVar2, arrayList2), false);
                        }
                    }
                    if (coVar2.E6()) {
                        G.c(R.drawable.menu_reply, LocaleController.getString(R.string.PollItemQuote), new pf0(lw0Var2, coVar2, pollAnswer3, 21), false);
                    }
                    if (lw0Var2.H.getDialogId() >= 0 || pollAnswer3.option == null) {
                        tL_messageMediaPoll3 = tL_messageMediaPoll2;
                        z19 = false;
                    } else {
                        MessagesController messagesController = MessagesController.getInstance(lw0Var2.H.currentAccount);
                        tL_messageMediaPoll3 = tL_messageMediaPoll2;
                        String publicUsername = DialogObject.getPublicUsername(messagesController.getUserOrChat(lw0Var2.H.getDialogId()));
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(messagesController.linkPrefix);
                        sb2.append("/");
                        if (TextUtils.isEmpty(publicUsername)) {
                            publicUsername = "c/" + (-lw0Var2.H.getDialogId());
                        }
                        sb2.append(publicUsername);
                        sb2.append("/");
                        sb2.append(lw0Var2.H.getId());
                        sb2.append("?option=");
                        sb2.append(new String(Base64.encode(pollAnswer3.option, 9)));
                        z19 = false;
                        G.c(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new ej0(27, lw0Var2, sb2.toString()), false);
                    }
                    G.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new ej0(28, lw0Var2, pollAnswer3), z19);
                    TLRPC.Peer peer = pollAnswer3.added_by;
                    if (peer != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        long clientUserId = UserConfig.getInstance(lw0Var2.H.currentAccount).getClientUserId();
                        co coVar4 = coVar2;
                        long currentTime = ConnectionsManager.getInstance(lw0Var2.H.currentAccount).getCurrentTime();
                        long j3 = MessagesController.getInstance(lw0Var2.H.currentAccount).config.pollAnswerDeletePeriod.get(TimeUnit.SECONDS) + pollAnswer3.date;
                        if (!lw0Var2.H.isForwarded()) {
                            TLRPC.Poll poll2 = tL_messageMediaPoll3.poll;
                            if (!poll2.closed && (poll2.creator || (peerDialogId == clientUserId && currentTime < j3))) {
                                G.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new ej0(29, lw0Var2, bArr2), true);
                            }
                        }
                        G.k();
                        TLObject userOrChat = MessagesController.getInstance(lw0Var2.H.currentAccount).getUserOrChat(peerDialogId);
                        CharSequence replaceTags = AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.PollAddedByAtTime, DialogObject.getShortName(userOrChat), LocaleController.formatDateTime(pollAnswer3.date, true)));
                        coVar2 = coVar4;
                        a3.g0 g0Var = new a3.g0(lw0Var2, peerDialogId, coVar2, 29);
                        Context context2 = G.e;
                        FrameLayout frameLayout = new FrameLayout(context2);
                        int i19 = org.telegram.ui.ActionBar.j6.i6;
                        org.telegram.ui.ActionBar.f6 f6Var2 = G.d;
                        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(i19, f6Var2), 0, 12));
                        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context2);
                        x9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
                        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
                        i9Var.p(userOrChat);
                        x9Var.e(userOrChat, i9Var);
                        frameLayout.addView(x9Var, w7.x5.d(34, 34.0f, 51, 13.0f, 11.0f, 0.0f, 11.0f));
                        TextView textView = new TextView(context2);
                        org.telegram.messenger.vl.n(org.telegram.ui.ActionBar.j6.j5, f6Var2, textView, 1, 14.0f);
                        textView.setText(replaceTags);
                        textView.setMaxWidth(AndroidUtilities.dp(150.0f));
                        textView.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                        frameLayout.addView(textView, w7.x5.d(-2, -2.0f, 55, 59.0f, 8.0f, 16.0f, 0.0f));
                        frameLayout.setOnClickListener(new org.telegram.ui.Components.ct(7, G, g0Var));
                        G.r(frameLayout, w7.x5.n(-1, -2));
                        G.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                        G.Q(bVar, fh.b.k(f6Var), false);
                        G.Y();
                        ViewGroup viewGroup2 = G.A;
                        lw0Var2.R = viewGroup2;
                        viewGroup2.setPivotX(0.0f);
                        lw0Var2.R.setPivotY(0.0f);
                        gw0Var5.addView(lw0Var2.R, w7.x5.e(-2, -2, 51));
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        coVar2.n8(messageObject, arrayList7, arrayList8, arrayList9);
                        bf bfVar2 = new bf(coVar2, 6);
                        messageObject2 = lw0Var2.H;
                        List<TLRPC.TL_availableReaction> enabledReactionsList = coVar2.getMediaDataController().getEnabledReactionsList();
                        z10 = coVar2.v() && !coVar2.c() && coVar2.f == null && messageObject2.hasReactions() && !((ChatObject.isChannel(coVar2.e) && !coVar2.e.megagroup) || ChatObject.isMonoForum(coVar2.e) || enabledReactionsList.isEmpty() || !messageObject2.messageOwner.reactions.can_see_list || messageObject2.isSecretMedia());
                        if (messageObject2.isForwardedChannelPost()) {
                            gw0Var2 = gw0Var5;
                            if (!messageObject2.isSecretMedia()) {
                                if (coVar2.R3 != 5) {
                                    if (!coVar2.v()) {
                                        if (!coVar2.c()) {
                                            if (messageObject2.isReactionsAvailable()) {
                                                TLRPC.ChatFull chatFull2 = coVar2.Z7;
                                                if (chatFull2 != null) {
                                                    if (chatFull2.available_reactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    }
                                                }
                                                if (chatFull2 == null) {
                                                }
                                                if (coVar2.f == null) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            z11 = false;
                        } else {
                            gw0Var2 = gw0Var5;
                            TLRPC.ChatFull chatFull3 = coVar2.getMessagesController().getChatFull(-messageObject2.getFromChatId());
                            if (chatFull3 != null) {
                                if (!coVar2.v()) {
                                    if (coVar2.R3 != 5) {
                                        if (!coVar2.c()) {
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
                        z12 = z11;
                        z13 = (!z10 || coVar2.c() || coVar2.e == null || !messageObject2.isOutOwner() || !messageObject2.isSent() || messageObject2.isEditing() || messageObject2.isSending() || messageObject2.isSendError() || messageObject2.isContentUnread() || messageObject2.isUnread() || ConnectionsManager.getInstance(coVar2.getCurrentAccount()).getCurrentTime() - messageObject2.messageOwner.date >= coVar2.getMessagesController().chatReadMarkExpirePeriod || (!ChatObject.isMegagroup(coVar2.e) && ChatObject.isChannel(coVar2.e)) || (chatFull = coVar2.Z7) == null || chatFull.participants_count > coVar2.getMessagesController().chatReadMarkSizeThreshold || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || coVar2.R3 == 3 || !messageObject2.canSetReaction() || ChatObject.isMonoForum(coVar2.e)) ? false : true;
                        if (coVar2.e == null && !messageObject2.isOut() && ChatObject.isMonoForum(coVar2.e) && ChatObject.canManageMonoForum(coVar2.getCurrentAccount(), coVar2.e)) {
                            z14 = z12;
                            int i20 = ((-coVar2.e.linked_monoforum_id) > messageObject2.getFromChatId() ? 1 : ((-coVar2.e.linked_monoforum_id) == messageObject2.getFromChatId() ? 0 : -1));
                        } else {
                            z14 = z12;
                        }
                        if (!z10 && coVar2.e == null && coVar2.h == null && (user = coVar2.f) != null && !UserObject.isUserSelf(user) && !UserObject.isReplyUser(coVar2.f) && !UserObject.isAnonymous(coVar2.f)) {
                            user2 = coVar2.f;
                            if (!user2.bot && !UserObject.isService(user2.id) && (((userFull = coVar2.a8) == null || !userFull.read_dates_private) && !coVar2.c() && messageObject2.isOutOwner() && messageObject2.isSent() && !messageObject2.isEditing() && !messageObject2.isSending() && !messageObject2.isSendError() && !messageObject2.isContentUnread() && !messageObject2.isUnread() && coVar2.getConnectionsManager().getCurrentTime() - messageObject2.messageOwner.date < coVar2.getMessagesController().pmReadDateExpirePeriod && !(messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                                z15 = true;
                                TLRPC.User user3 = coVar2.f;
                                boolean z24 = ((user3 == null && (UserObject.isReplyUser(user3) || UserObject.isAnonymous(coVar2.f))) || coVar2.c() || !messageObject2.isEdited() || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                                org.telegram.ui.Components.n70 G2 = org.telegram.ui.Components.n70.G(gw0Var, coVar2.getResourceProvider(), null, !z10 || z13);
                                if (z13) {
                                    arrayList = arrayList9;
                                    bfVar = bfVar2;
                                    coVar = coVar2;
                                    messageObject3 = messageObject2;
                                    n70Var = G2;
                                    lw0Var3 = lw0Var2;
                                    if (z15) {
                                        n70Var.r(new org.telegram.ui.Components.ac0(lw0Var3.getContext(), 0, messageObject3, new aw0(lw0Var3, 1), lw0Var3.b), w7.x5.n(-1, 36));
                                        n70Var.k();
                                    } else if (z24) {
                                        messageObject4 = messageObject3;
                                        n70Var.r(new org.telegram.ui.Components.ac0(lw0Var3.getContext(), 1, messageObject3, new aw0(lw0Var3, 2), lw0Var3.b), w7.x5.n(-1, 36));
                                        n70Var.k();
                                        size = arrayList7.size();
                                        for (i10 = 0; i10 < size; i10++) {
                                            n70Var.c(((Integer) arrayList7.get(i10)).intValue(), (CharSequence) arrayList8.get(i10), new ai0(lw0Var3, bfVar, ((Integer) arrayList.get(i10)).intValue(), 5), false);
                                        }
                                        n70Var.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                                        n70Var.Q(bVar, fh.b.k(f6Var), false);
                                        n70Var.Y();
                                        ViewGroup viewGroup3 = n70Var.A;
                                        lw0Var3.T = viewGroup3;
                                        viewGroup3.setPivotX(0.0f);
                                        lw0Var3.T.setPivotY(0.0f);
                                        ViewGroup viewGroup4 = gw0Var2;
                                        viewGroup4.addView(lw0Var3.T, w7.x5.e(-2, -2, 51));
                                        viewGroup = lw0Var3.T;
                                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new vl0(lw0Var3, 6));
                                            lw0Var3.T.setOnTouchListener(new d0(lw0Var3, 5));
                                        }
                                        if (z14) {
                                            co coVar5 = coVar;
                                            org.telegram.ui.Components.fk0 fk0Var = new org.telegram.ui.Components.fk0((coVar.getUserConfig().getClientUserId() > coVar.a() ? 1 : (coVar.getUserConfig().getClientUserId() == coVar.a() ? 0 : -1)) == 0 ? 3 : 0, coVar.getCurrentAccount(), lw0Var3.getContext(), coVar5, lw0Var3.b);
                                            fk0Var.a = true;
                                            float f7 = 22;
                                            fk0Var.setPadding(AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : 24), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 24 : 0), AndroidUtilities.dp(f7));
                                            fk0Var.setDelegate(new fw0(lw0Var3, coVar5, messageObject4, fk0Var));
                                            lw0Var3.Q = fk0Var;
                                            viewGroup4.addView(fk0Var, w7.x5.e(-2, (int) ((fk0Var.getTopOffset() / AndroidUtilities.density) + 52.0f + f7), 51));
                                            z16 = true;
                                            fk0Var.p(messageObject4, coVar5.Z7, true);
                                            lw0Var3.Q.setTransitionProgress(1.0f);
                                        } else {
                                            z16 = true;
                                        }
                                        lw0Var3.e();
                                        lw0Var3.e0 = new zm(this, 0);
                                        lw0Var3.show();
                                        return z16;
                                    }
                                } else {
                                    gi0 gi0Var = new gi0(lw0Var2.getContext(), coVar2.getCurrentAccount(), messageObject2, coVar2.e);
                                    FrameLayout frameLayout2 = new FrameLayout(lw0Var2.getContext());
                                    frameLayout2.addView(gi0Var, w7.x5.c(36.0f, -1));
                                    org.telegram.ui.Components.n70 J2 = G2.J();
                                    org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, lw0Var2.getContext(), lw0Var2.b, true, false);
                                    f1Var.setItemHeight(44);
                                    f1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                                    lw0 lw0Var6 = lw0Var2;
                                    f1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                                    FrameLayout frameLayout3 = new FrameLayout(lw0Var6.getContext());
                                    messageObject3 = messageObject2;
                                    LinearLayout linearLayout = new LinearLayout(lw0Var6.getContext());
                                    linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var));
                                    linearLayout.setOrientation(1);
                                    co coVar6 = coVar2;
                                    org.telegram.ui.Components.ll0 a10 = gi0Var.a();
                                    frameLayout3.addView(f1Var);
                                    linearLayout.addView(frameLayout3);
                                    linearLayout.addView(new org.telegram.ui.ActionBar.k1(lw0Var6.getContext(), f6Var), w7.x5.n(-1, 8));
                                    frameLayout3.setOnClickListener(new dw0(G2));
                                    arrayList = arrayList9;
                                    ew0 ew0Var = new ew0(lw0Var6, gi0Var, coVar6, a10, linearLayout, G2, J2);
                                    lw0Var3 = lw0Var6;
                                    coVar = coVar6;
                                    n70Var = G2;
                                    gi0Var.setOnClickListener(ew0Var);
                                    linearLayout.addView(a10, w7.x5.n(-1, -2));
                                    J2.q(linearLayout);
                                    n70Var.q(frameLayout2);
                                    n70Var.k();
                                    bfVar = bfVar2;
                                }
                                messageObject4 = messageObject3;
                                size = arrayList7.size();
                                while (i10 < size) {
                                }
                                n70Var.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                                n70Var.Q(bVar, fh.b.k(f6Var), false);
                                n70Var.Y();
                                ViewGroup viewGroup32 = n70Var.A;
                                lw0Var3.T = viewGroup32;
                                viewGroup32.setPivotX(0.0f);
                                lw0Var3.T.setPivotY(0.0f);
                                ViewGroup viewGroup42 = gw0Var2;
                                viewGroup42.addView(lw0Var3.T, w7.x5.e(-2, -2, 51));
                                viewGroup = lw0Var3.T;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                }
                                if (z14) {
                                }
                                lw0Var3.e();
                                lw0Var3.e0 = new zm(this, 0);
                                lw0Var3.show();
                                return z16;
                            }
                        }
                        z15 = false;
                        TLRPC.User user32 = coVar2.f;
                        if (user32 == null) {
                        }
                        org.telegram.ui.Components.n70 G22 = org.telegram.ui.Components.n70.G(gw0Var, coVar2.getResourceProvider(), null, !z10 || z13);
                        if (z13) {
                        }
                        messageObject4 = messageObject3;
                        size = arrayList7.size();
                        while (i10 < size) {
                        }
                        n70Var.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                        n70Var.Q(bVar, fh.b.k(f6Var), false);
                        n70Var.Y();
                        ViewGroup viewGroup322 = n70Var.A;
                        lw0Var3.T = viewGroup322;
                        viewGroup322.setPivotX(0.0f);
                        lw0Var3.T.setPivotY(0.0f);
                        ViewGroup viewGroup422 = gw0Var2;
                        viewGroup422.addView(lw0Var3.T, w7.x5.e(-2, -2, 51));
                        viewGroup = lw0Var3.T;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z14) {
                        }
                        lw0Var3.e();
                        lw0Var3.e0 = new zm(this, 0);
                        lw0Var3.show();
                        return z16;
                    }
                } else {
                    lw0Var2 = lw0Var;
                    gw0Var = gw0Var4;
                    messageObject = primaryMessageObject;
                }
                G.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                G.Q(bVar, fh.b.k(f6Var), false);
                G.Y();
                ViewGroup viewGroup22 = G.A;
                lw0Var2.R = viewGroup22;
                viewGroup22.setPivotX(0.0f);
                lw0Var2.R.setPivotY(0.0f);
                gw0Var5.addView(lw0Var2.R, w7.x5.e(-2, -2, 51));
                ArrayList arrayList72 = new ArrayList();
                ArrayList arrayList82 = new ArrayList();
                ArrayList arrayList92 = new ArrayList();
                coVar2.n8(messageObject, arrayList72, arrayList82, arrayList92);
                bf bfVar22 = new bf(coVar2, 6);
                messageObject2 = lw0Var2.H;
                List<TLRPC.TL_availableReaction> enabledReactionsList2 = coVar2.getMediaDataController().getEnabledReactionsList();
                if (coVar2.v()) {
                }
                if (messageObject2.isForwardedChannelPost()) {
                }
                z12 = z11;
                if (!z10) {
                }
                if (coVar2.e == null) {
                }
                z14 = z12;
                if (!z10) {
                    user2 = coVar2.f;
                    if (!user2.bot) {
                        z15 = true;
                        TLRPC.User user322 = coVar2.f;
                        if (user322 == null) {
                        }
                        org.telegram.ui.Components.n70 G222 = org.telegram.ui.Components.n70.G(gw0Var, coVar2.getResourceProvider(), null, !z10 || z13);
                        if (z13) {
                        }
                        messageObject4 = messageObject3;
                        size = arrayList72.size();
                        while (i10 < size) {
                        }
                        n70Var.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                        n70Var.Q(bVar, fh.b.k(f6Var), false);
                        n70Var.Y();
                        ViewGroup viewGroup3222 = n70Var.A;
                        lw0Var3.T = viewGroup3222;
                        viewGroup3222.setPivotX(0.0f);
                        lw0Var3.T.setPivotY(0.0f);
                        ViewGroup viewGroup4222 = gw0Var2;
                        viewGroup4222.addView(lw0Var3.T, w7.x5.e(-2, -2, 51));
                        viewGroup = lw0Var3.T;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z14) {
                        }
                        lw0Var3.e();
                        lw0Var3.e0 = new zm(this, 0);
                        lw0Var3.show();
                        return z16;
                    }
                }
                z15 = false;
                TLRPC.User user3222 = coVar2.f;
                if (user3222 == null) {
                }
                org.telegram.ui.Components.n70 G2222 = org.telegram.ui.Components.n70.G(gw0Var, coVar2.getResourceProvider(), null, !z10 || z13);
                if (z13) {
                }
                messageObject4 = messageObject3;
                size = arrayList72.size();
                while (i10 < size) {
                }
                n70Var.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                n70Var.Q(bVar, fh.b.k(f6Var), false);
                n70Var.Y();
                ViewGroup viewGroup32222 = n70Var.A;
                lw0Var3.T = viewGroup32222;
                viewGroup32222.setPivotX(0.0f);
                lw0Var3.T.setPivotY(0.0f);
                ViewGroup viewGroup42222 = gw0Var2;
                viewGroup42222.addView(lw0Var3.T, w7.x5.e(-2, -2, 51));
                viewGroup = lw0Var3.T;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z14) {
                }
                lw0Var3.e();
                lw0Var3.e0 = new zm(this, 0);
                lw0Var3.show();
                return z16;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean P() {
        co coVar = this.a;
        return coVar.W5[1].size() + coVar.W5[0].size() > 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean Q(org.telegram.ui.Cells.t1 t1Var) {
        int i10;
        MessageObject messageObject;
        TLRPC.Message message;
        if (t1Var == null) {
            return false;
        }
        co coVar = this.a;
        if (coVar.getParentActivity() == null) {
            return false;
        }
        i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
        if (!MessagesController.getInstance(i10).richEditorAllowed() || (messageObject = t1Var.getMessageObject()) == null || (message = messageObject.messageOwner) == null || message.rich_message == null) {
            return false;
        }
        if (!messageObject.translated || message.translatedRichMessage == null) {
            return messageObject.canEditMessage(coVar.e);
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void Q0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        this.a.U7(characterStyle, z10, t1Var.getMessageObject(), t1Var);
    }

    @Override // org.telegram.ui.Cells.k1
    public final ov0 Q1() {
        return this.a.wa;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean R() {
        co coVar = this.a;
        return UserObject.isReplyUser(coVar.f) || UserObject.isUserSelf(coVar.f);
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean R0(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
        MessageObject messageObject = (currentMessagesGroup == null || currentMessagesGroup.messages.isEmpty()) ? t1Var.getMessageObject() : currentMessagesGroup.messages.get(0);
        if (messageObject != null) {
            co coVar = this.a;
            boolean z11 = !coVar.jc && messageObject.getId() == coVar.ic;
            if (!z10) {
                return z11;
            }
            if (z11 && System.currentTimeMillis() - coVar.kc > 1000) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void S(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        MessageObject messageObject;
        if (chat == null) {
            return;
        }
        co coVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
        if (kVar.s() || coVar.A9()) {
            co.b2(coVar, t1Var, true, f7, f10);
            return;
        }
        if (z10 || !chat.signature_profiles || (messageObject = t1Var.getMessageObject()) == null || messageObject.getDialogId() == UserObject.REPLY_BOT) {
            p(t1Var, chat, i10, z10);
        } else {
            coVar.na(DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void S0(org.telegram.ui.Cells.t1 t1Var) {
        co coVar = this.a;
        coVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(coVar.T5), t1Var);
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean S1(long j3) {
        co coVar = this.a;
        TLRPC.Chat chat = coVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return false;
        }
        return coVar.getMessagesController().isAdmin(coVar.e.id, j3);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void T(org.telegram.ui.Cells.t1 t1Var) {
        k(t1Var, true, true, false);
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
    public final void T1(org.telegram.ui.Cells.t1 t1Var, int i10, float f7, float f10, boolean z10) {
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
        boolean c10 = c();
        co coVar = this.a;
        if (!c10 && !z10) {
            kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
            if ((kVar.s() || coVar.A9()) && !coVar.c9.A(t1Var.getMessageObject())) {
                co.b2(coVar, t1Var, !t1Var.i3(f7), f7, f10);
                return;
            }
            return;
        }
        if (UserObject.isReplyUser(coVar.f)) {
            r(t1Var);
            return;
        }
        MessageObject messageObject2 = t1Var.getMessageObject();
        if (messageObject2 == null) {
            return;
        }
        if (messageObject2.isReplyToStory() && (storyItem = (message3 = messageObject2.messageOwner).replyStory) != null) {
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                org.telegram.messenger.w1.o(R.string.StoryNotFound, org.telegram.ui.Components.yc.a0(coVar), R.raw.story_bomb1, 36);
                return;
            }
            storyItem.dialogId = DialogObject.getPeerDialogId(message3.reply_to.peer);
            storyItem.messageId = messageObject2.getId();
            storyItem.messageType = 3;
            bi.p9.b(storyItem, coVar.f);
            coVar.getOrCreateStoryViewer().F(coVar.getParentActivity(), storyItem, bi.d9.a(coVar.x0));
            return;
        }
        TLRPC.Message message4 = messageObject2.messageOwner;
        if (message4 != null && (messageReplyHeader7 = message4.reply_to) != null && (messageReplyHeader7.flags & 2048) != 0) {
            num = Integer.valueOf(messageReplyHeader7.todo_item_id);
        } else {
            if (message4 != null && (messageReplyHeader2 = message4.reply_to) != null && (bArr = messageReplyHeader2.poll_option) != null) {
                num = null;
                str = null;
                long j10 = coVar.T5;
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
                org.telegram.ui.Components.yc.a0(coVar).Q(R.raw.error, 36, LocaleController.getString((message5 == null && (messageReplyHeader3 = message5.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
            }
            if (message4 != null && (messageReplyHeader = message4.reply_to) != null && messageReplyHeader.quote) {
                String str3 = messageReplyHeader.quote_text;
                r9 = (messageReplyHeader.flags & 1024) != 0 ? messageReplyHeader.quote_offset : -1;
                str = str3;
                num = null;
                bArr = null;
                long j102 = coVar.T5;
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
                            chat = j3 < 0 ? coVar.getMessagesController().getChat(Long.valueOf(-j3)) : null;
                            if (j3 != Long.MAX_VALUE) {
                                boolean z12 = z11;
                                if (j3 == coVar.T5 || chat == null || ChatObject.isPublic(chat) || (!chat.left && !chat.kicked)) {
                                    if (((j3 == coVar.T5 && (!ChatObject.isForum(coVar.e) || !z12)) || j3 == Long.MAX_VALUE) && (coVar.R3 != 3 || ((messageObject = messageObject2.replyMessageObject) != null && messageObject.getSavedDialogId() == coVar.d()))) {
                                        int i11 = coVar.R3;
                                        if (i11 == 2 || i11 == 1) {
                                            coVar.V8.V0(i10);
                                            coVar.finishFragment();
                                            return;
                                        }
                                        if (bArr != null) {
                                            coVar.R7 = bArr;
                                        } else if (num != null) {
                                            coVar.Q7 = num;
                                        } else {
                                            TLRPC.Message message6 = messageObject2.messageOwner;
                                            if (message6 != null && (messageReplyHeader5 = message6.reply_to) != null && messageReplyHeader5.quote) {
                                                coVar.N7 = true;
                                                coVar.P7 = messageReplyHeader5.quote_text;
                                                coVar.S7 = r9;
                                                coVar.M7 = true;
                                            }
                                        }
                                        fi.l3 l3Var = new fi.l3(this, i10, messageObject2, num, bArr, 17);
                                        if (!coVar.A0.N) {
                                            l3Var.run();
                                            return;
                                        }
                                        coVar.r3 = false;
                                        coVar.lb(false, true, false);
                                        coVar.Fc(coVar.getMediaDataController().getMask(), coVar.getMediaDataController().getSearchPosition(), coVar.getMediaDataController().getSearchCount());
                                        AndroidUtilities.runOnUIThread(l3Var, 80L);
                                        return;
                                    }
                                    Integer num2 = num;
                                    byte[] bArr2 = bArr;
                                    if (LaunchActivity.G1 != null) {
                                        of.e eVar = coVar.Ab;
                                        if (eVar != null) {
                                            eVar.a(false);
                                            n2Var = null;
                                            coVar.Ab = null;
                                        } else {
                                            n2Var = null;
                                        }
                                        LaunchActivity launchActivity = LaunchActivity.G1;
                                        final i0 i0Var = new i0(this, messageObject2, t1Var);
                                        coVar.Ab = i0Var;
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
                                        org.telegram.ui.ActionBar.n2 n2Var2 = !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.n2) i2.g.h(1, arrayList) : n2Var;
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
                                org.telegram.ui.Components.yc.a0(coVar).Q(R.raw.error, 36, LocaleController.getString((message52 == null && (messageReplyHeader3 = message52.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
                            } else {
                                messageObject2.replyTextRevealed = true;
                                coVar.qc(messageObject2, true);
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
                    org.telegram.ui.Components.yc.a0(coVar).Q(R.raw.error, 36, LocaleController.getString((message522 == null && (messageReplyHeader3 = message522.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
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
                org.telegram.ui.Components.yc.a0(coVar).Q(R.raw.error, 36, LocaleController.getString((message5222 == null && (messageReplyHeader3 = message5222.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
            }
            num = null;
        }
        bArr = null;
        str = null;
        long j1022 = coVar.T5;
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
        org.telegram.ui.Components.yc.a0(coVar).Q(R.raw.error, 36, LocaleController.getString((message52222 == null && (messageReplyHeader3 = message52222.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void U0(org.telegram.ui.Cells.t1 t1Var) {
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
        co coVar = this.a;
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
                        int childCount = coVar.x0.getChildCount();
                        for (int i11 = 0; i11 < childCount; i11++) {
                            View childAt = coVar.x0.getChildAt(i11);
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
        coVar.Jb(messageObject, spannableStringBuilder, 1);
        t1Var.g4(1, false, true);
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
    @Override // org.telegram.ui.Cells.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean U1(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        ie1 ie1Var;
        TLRPC.TodoItem todoItem2;
        TLRPC.TodoCompletion todoCompletion;
        ie1 ie1Var2;
        MessageObject messageObject;
        ie1 ie1Var3;
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
        le1 le1Var;
        ArrayList arrayList3;
        co coVar;
        MessageObject messageObject4;
        int size;
        int i11;
        ViewGroup viewGroup;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        final co coVar2 = this.a;
        if (coVar2.getParentActivity() == null || coVar2.getParentActivity() == null) {
            return false;
        }
        di.f4 f4Var = coVar2.x1;
        if (f4Var != null && f4Var.V) {
            f4Var.e(true);
        }
        yl ylVar = coVar2.B1;
        if (ylVar != null && ylVar.V) {
            ylVar.e(true);
        }
        MessageObject primaryMessageObject = t1Var.getPrimaryMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(primaryMessageObject);
        if (primaryMessageObject == null || !(media instanceof TLRPC.TL_messageMediaToDo)) {
            return false;
        }
        coVar2.d5 = primaryMessageObject;
        coVar2.e5 = null;
        final le1 le1Var2 = new le1(coVar2.getParentActivity(), coVar2.getResourceProvider());
        final int i12 = todoItem.id;
        le1Var2.K = t1Var;
        le1Var2.O = i12;
        MessageObject messageObject5 = t1Var.getMessageObject();
        le1Var2.G = messageObject5;
        le1Var2.H = messageObject5 != null && messageObject5.isOutOwner();
        org.telegram.ui.Cells.t1 t1Var2 = le1Var2.K;
        ie1 ie1Var4 = le1Var2.c;
        if (t1Var2 != null) {
            le1Var2.L = coVar2.s9 - AndroidUtilities.dp(4.0f);
            le1Var2.M = t1Var.n;
            if (t1Var.getParent() instanceof View) {
                View view = (View) t1Var.getParent();
                le1Var2.L = view.getY() + le1Var2.L;
                le1Var2.M = view.getY() + le1Var2.M;
            }
            int width = le1Var2.K.getWidth();
            int height = le1Var2.K.getHeight();
            le1Var2.K.getHeight();
            ie1Var = ie1Var4;
            je1 je1Var = new je1(le1Var2, le1Var2.getContext(), UserConfig.selectedAccount, le1Var2.K.getResourcesProvider(), i12, width, height);
            le1Var2.I = je1Var;
            le1Var2.K.h1(je1Var);
            le1Var2.I.i1(le1Var2.K);
            le1Var2.I.setDelegate(new ke1(le1Var2));
            je1 je1Var2 = le1Var2.I;
            MessageObject messageObject6 = le1Var2.G;
            MessageObject.GroupedMessages currentMessagesGroup = le1Var2.K.getCurrentMessagesGroup();
            org.telegram.ui.Cells.t1 t1Var3 = le1Var2.K;
            je1Var2.X3(messageObject6, currentMessagesGroup, t1Var3.F, t1Var3.E, t1Var3.G, false);
            ie1Var.addView(le1Var2.I, new FrameLayout.LayoutParams(le1Var2.K.getWidth(), height, 51));
            kw0 kw0Var = new kw0(le1Var2.getContext(), UserConfig.selectedAccount, le1Var2.K.getResourcesProvider(), width, height, 1);
            le1Var2.J = kw0Var;
            le1Var2.K.j1(kw0Var);
            le1Var2.K.h1(le1Var2.J);
            le1Var2.J.i1(le1Var2.K);
            le1Var2.J.setDelegate(new rb.a(18));
            kw0 kw0Var2 = le1Var2.J;
            MessageObject messageObject7 = le1Var2.G;
            MessageObject.GroupedMessages currentMessagesGroup2 = le1Var2.K.getCurrentMessagesGroup();
            org.telegram.ui.Cells.t1 t1Var4 = le1Var2.K;
            kw0Var2.X3(messageObject7, currentMessagesGroup2, t1Var4.F, t1Var4.E, t1Var4.G, false);
            ie1Var.addView(le1Var2.J, new FrameLayout.LayoutParams(le1Var2.K.getWidth(), height, 51));
        } else {
            ie1Var = ie1Var4;
        }
        di.i1 i1Var = le1Var2.e;
        i1Var.bringToFront();
        ie1 ie1Var5 = le1Var2.d;
        ie1Var5.bringToFront();
        le1Var2.h.bringToFront();
        i1Var.w(false);
        org.telegram.ui.ActionBar.f6 f6Var = le1Var2.a;
        org.telegram.ui.Components.n70 F = org.telegram.ui.Components.n70.F(ie1Var, f6Var, null);
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) MessageObject.getMedia(le1Var2.G);
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
        if (!le1Var2.G.canCompleteTodo()) {
            ie1Var2 = ie1Var5;
        } else if (todoCompletion != null) {
            ie1Var2 = ie1Var5;
            F.p(14, -1, LocaleController.formatTodoCompletedDate(todoCompletion.date));
            F.k();
            final int i15 = 1;
            F.c(R.drawable.msg_cancel, LocaleController.getString(R.string.TodoUncheck), new Runnable() { // from class: org.telegram.ui.de1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            co coVar3 = coVar2;
                            zv0 zv0Var = new zv0(coVar3);
                            le1 le1Var3 = le1Var2;
                            zv0Var.p0(MessageObject.getMedia(le1Var3.G), false, i12);
                            zv0Var.e0 = new qv0(15, le1Var3, coVar3);
                            coVar3.presentFragment(zv0Var);
                            le1Var3.c(false);
                            break;
                        case 1:
                            boolean c10 = coVar2.c();
                            le1 le1Var4 = le1Var2;
                            if (c10) {
                                Toast.makeText(le1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                je1 je1Var3 = le1Var4.I;
                                je1Var3.k4(je1Var3.O2(i12), false);
                            }
                            le1Var4.c(true);
                            break;
                        default:
                            boolean c11 = coVar2.c();
                            le1 le1Var5 = le1Var2;
                            if (c11) {
                                Toast.makeText(le1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                je1 je1Var4 = le1Var5.I;
                                je1Var4.k4(je1Var4.O2(i12), false);
                            }
                            le1Var5.c(true);
                            break;
                    }
                }
            }, false);
        } else {
            ie1Var2 = ie1Var5;
            final int i16 = 2;
            F.c(R.drawable.msg_select, LocaleController.getString(R.string.TodoCheck), new Runnable() { // from class: org.telegram.ui.de1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i16) {
                        case 0:
                            co coVar3 = coVar2;
                            zv0 zv0Var = new zv0(coVar3);
                            le1 le1Var3 = le1Var2;
                            zv0Var.p0(MessageObject.getMedia(le1Var3.G), false, i12);
                            zv0Var.e0 = new qv0(15, le1Var3, coVar3);
                            coVar3.presentFragment(zv0Var);
                            le1Var3.c(false);
                            break;
                        case 1:
                            boolean c10 = coVar2.c();
                            le1 le1Var4 = le1Var2;
                            if (c10) {
                                Toast.makeText(le1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                je1 je1Var3 = le1Var4.I;
                                je1Var3.k4(je1Var3.O2(i12), false);
                            }
                            le1Var4.c(true);
                            break;
                        default:
                            boolean c11 = coVar2.c();
                            le1 le1Var5 = le1Var2;
                            if (c11) {
                                Toast.makeText(le1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                je1 je1Var4 = le1Var5.I;
                                je1Var4.k4(je1Var4.O2(i12), false);
                            }
                            le1Var5.c(true);
                            break;
                    }
                }
            }, false);
        }
        if (todoItem2 != null) {
            F.c(R.drawable.menu_reply, LocaleController.getString(R.string.TodoItemQuote), new yd1(le1Var2, coVar2, todoItem2, 2), false);
            if (le1Var2.G.getDialogId() < 0) {
                MessagesController messagesController = MessagesController.getInstance(le1Var2.G.currentAccount);
                String publicUsername = DialogObject.getPublicUsername(messagesController.getUserOrChat(le1Var2.G.getDialogId()));
                StringBuilder sb2 = new StringBuilder("https://");
                sb2.append(messagesController.linkPrefix);
                sb2.append("/");
                if (TextUtils.isEmpty(publicUsername)) {
                    StringBuilder sb3 = new StringBuilder("c/");
                    messageObject = primaryMessageObject;
                    ie1Var3 = ie1Var2;
                    sb3.append(-le1Var2.G.getDialogId());
                    publicUsername = sb3.toString();
                } else {
                    messageObject = primaryMessageObject;
                    ie1Var3 = ie1Var2;
                }
                sb2.append(publicUsername);
                sb2.append("/");
                sb2.append(le1Var2.G.getId());
                sb2.append("?task=");
                sb2.append(todoItem2.id);
                F.c(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new w81(10, le1Var2, sb2.toString()), false);
            } else {
                messageObject = primaryMessageObject;
                ie1Var3 = ie1Var2;
            }
            F.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new w81(11, le1Var2, todoItem2), false);
        } else {
            messageObject = primaryMessageObject;
            ie1Var3 = ie1Var2;
        }
        if (le1Var2.G.canEditMessage(coVar2.e)) {
            final int i17 = 0;
            F.c(R.drawable.msg_edit, LocaleController.getString(R.string.TodoEditItem), new Runnable() { // from class: org.telegram.ui.de1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i17) {
                        case 0:
                            co coVar3 = coVar2;
                            zv0 zv0Var = new zv0(coVar3);
                            le1 le1Var3 = le1Var2;
                            zv0Var.p0(MessageObject.getMedia(le1Var3.G), false, i13);
                            zv0Var.e0 = new qv0(15, le1Var3, coVar3);
                            coVar3.presentFragment(zv0Var);
                            le1Var3.c(false);
                            break;
                        case 1:
                            boolean c10 = coVar2.c();
                            le1 le1Var4 = le1Var2;
                            if (c10) {
                                Toast.makeText(le1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                je1 je1Var3 = le1Var4.I;
                                je1Var3.k4(je1Var3.O2(i13), false);
                            }
                            le1Var4.c(true);
                            break;
                        default:
                            boolean c11 = coVar2.c();
                            le1 le1Var5 = le1Var2;
                            if (c11) {
                                Toast.makeText(le1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                je1 je1Var4 = le1Var5.I;
                                je1Var4.k4(je1Var4.O2(i13), false);
                            }
                            le1Var5.c(true);
                            break;
                    }
                }
            }, false);
            if (tL_messageMediaToDo.todo.list.size() > 1) {
                i10 = 51;
                F.c(R.drawable.msg_delete, LocaleController.getString(R.string.TodoDeleteItem), new org.telegram.ui.Components.r11(le1Var2, tL_messageMediaToDo, i12, coVar2, 11), false);
                F.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                eh.e k10 = fh.b.k(f6Var);
                bh.b bVar = le1Var2.F;
                F.Q(bVar, k10, false);
                F.Y();
                ViewGroup viewGroup2 = F.A;
                le1Var2.Q = viewGroup2;
                viewGroup2.setPivotX(0.0f);
                le1Var2.Q.setPivotY(0.0f);
                ie1Var3.addView(le1Var2.Q, w7.x5.e(-2, -2, i10));
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                coVar2.n8(messageObject, arrayList4, arrayList5, arrayList6);
                bf bfVar2 = new bf(coVar2, 7);
                messageObject2 = le1Var2.G;
                List<TLRPC.TL_availableReaction> enabledReactionsList = coVar2.getMediaDataController().getEnabledReactionsList();
                boolean z15 = coVar2.v() && !coVar2.c() && coVar2.f == null && messageObject2.hasReactions() && !((ChatObject.isChannel(coVar2.e) && !coVar2.e.megagroup) || ChatObject.isMonoForum(coVar2.e) || enabledReactionsList.isEmpty() || !messageObject2.messageOwner.reactions.can_see_list || messageObject2.isSecretMedia());
                if (messageObject2.isForwardedChannelPost()) {
                    z10 = z15;
                    if (!messageObject2.isSecretMedia()) {
                        if (coVar2.R3 != 5) {
                            if (!coVar2.v()) {
                                if (!coVar2.c()) {
                                    if (messageObject2.isReactionsAvailable()) {
                                        TLRPC.ChatFull chatFull2 = coVar2.Z7;
                                        if (chatFull2 != null) {
                                            if (chatFull2.available_reactions instanceof TLRPC.TL_chatReactionsNone) {
                                            }
                                        }
                                        if (chatFull2 == null) {
                                        }
                                        if (coVar2.f == null) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z11 = false;
                } else {
                    z10 = z15;
                    TLRPC.ChatFull chatFull3 = coVar2.getMessagesController().getChatFull(-messageObject2.getFromChatId());
                    if (chatFull3 != null) {
                        if (!coVar2.v()) {
                            if (coVar2.R3 != 5) {
                                if (!coVar2.c()) {
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
                z12 = (!z10 || coVar2.c() || coVar2.e == null || !messageObject2.isOutOwner() || !messageObject2.isSent() || messageObject2.isEditing() || messageObject2.isSending() || messageObject2.isSendError() || messageObject2.isContentUnread() || messageObject2.isUnread() || ConnectionsManager.getInstance(coVar2.getCurrentAccount()).getCurrentTime() - messageObject2.messageOwner.date >= coVar2.getMessagesController().chatReadMarkExpirePeriod || (!ChatObject.isMegagroup(coVar2.e) && ChatObject.isChannel(coVar2.e)) || (chatFull = coVar2.Z7) == null || chatFull.participants_count > coVar2.getMessagesController().chatReadMarkSizeThreshold || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || coVar2.R3 == 3 || !messageObject2.canSetReaction() || ChatObject.isMonoForum(coVar2.e)) ? false : true;
                if (coVar2.e != null && !messageObject2.isOut() && ChatObject.isMonoForum(coVar2.e) && ChatObject.canManageMonoForum(coVar2.getCurrentAccount(), coVar2.e)) {
                    int i18 = ((-coVar2.e.linked_monoforum_id) > messageObject2.getFromChatId() ? 1 : ((-coVar2.e.linked_monoforum_id) == messageObject2.getFromChatId() ? 0 : -1));
                }
                if (!z10 && coVar2.e == null && coVar2.h == null && (user = coVar2.f) != null && !UserObject.isUserSelf(user) && !UserObject.isReplyUser(coVar2.f) && !UserObject.isAnonymous(coVar2.f)) {
                    user2 = coVar2.f;
                    if (!user2.bot && !UserObject.isService(user2.id) && (((userFull = coVar2.a8) == null || !userFull.read_dates_private) && !coVar2.c() && messageObject2.isOutOwner() && messageObject2.isSent() && !messageObject2.isEditing() && !messageObject2.isSending() && !messageObject2.isSendError() && !messageObject2.isContentUnread() && !messageObject2.isUnread() && coVar2.getConnectionsManager().getCurrentTime() - messageObject2.messageOwner.date < coVar2.getMessagesController().pmReadDateExpirePeriod && !(messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                        z13 = true;
                        TLRPC.User user3 = coVar2.f;
                        boolean z17 = ((user3 == null && (UserObject.isReplyUser(user3) || UserObject.isAnonymous(coVar2.f))) || coVar2.c() || !messageObject2.isEdited() || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                        org.telegram.ui.Components.n70 G = org.telegram.ui.Components.n70.G(le1Var2.c, coVar2.getResourceProvider(), null, !z10 || z12);
                        if (z12) {
                            bfVar = bfVar2;
                            messageObject3 = messageObject2;
                            z14 = z16;
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            le1Var = le1Var2;
                            arrayList3 = arrayList6;
                            coVar = coVar2;
                            if (z13) {
                                G.r(new org.telegram.ui.Components.ac0(le1Var.getContext(), 0, messageObject3, new ce1(le1Var, 0), le1Var.a), w7.x5.n(-1, 36));
                                G.k();
                            } else if (z17) {
                                messageObject4 = messageObject3;
                                G.r(new org.telegram.ui.Components.ac0(le1Var.getContext(), 1, messageObject3, new ce1(le1Var, 2), le1Var.a), w7.x5.n(-1, 36));
                                G.k();
                                i11 = 0;
                                for (size = arrayList.size(); i11 < size; size = size) {
                                    G.c(((Integer) arrayList.get(i11)).intValue(), (CharSequence) arrayList2.get(i11), new ai0(le1Var, bfVar, ((Integer) arrayList3.get(i11)).intValue(), 10), false);
                                    i11++;
                                    arrayList3 = arrayList3;
                                }
                                G.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                                G.Q(bVar, fh.b.k(f6Var), false);
                                G.Y();
                                ViewGroup viewGroup3 = G.A;
                                le1Var.S = viewGroup3;
                                viewGroup3.setPivotX(0.0f);
                                le1Var.S.setPivotY(0.0f);
                                ViewGroup viewGroup4 = le1Var.S;
                                FrameLayout.LayoutParams e7 = w7.x5.e(-2, -2, 51);
                                ie1 ie1Var6 = le1Var.d;
                                ie1Var6.addView(viewGroup4, e7);
                                viewGroup = le1Var.S;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new vl0(le1Var, 22));
                                    le1Var.S.setOnTouchListener(new d0(le1Var, 7));
                                }
                                if (z14) {
                                    co coVar3 = coVar;
                                    org.telegram.ui.Components.fk0 fk0Var = new org.telegram.ui.Components.fk0((coVar.getUserConfig().getClientUserId() > coVar.a() ? 1 : (coVar.getUserConfig().getClientUserId() == coVar.a() ? 0 : -1)) == 0 ? 3 : 0, coVar3.getCurrentAccount(), le1Var.getContext(), coVar3, le1Var.a);
                                    fk0Var.a = true;
                                    float f7 = 22;
                                    fk0Var.setPadding(AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : 24), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 24 : 0), AndroidUtilities.dp(f7));
                                    fk0Var.setDelegate(new he1(le1Var, coVar3, messageObject4, fk0Var));
                                    le1Var.P = fk0Var;
                                    ie1Var6.addView(fk0Var, w7.x5.e(-2, (int) ((fk0Var.getTopOffset() / AndroidUtilities.density) + 52.0f + f7), 51));
                                    fk0Var.p(messageObject4, coVar3.Z7, true);
                                    le1Var.P.setTransitionProgress(1.0f);
                                }
                                le1Var.e();
                                le1Var.c0 = new zm(this, 5);
                                le1Var.show();
                                return true;
                            }
                        } else {
                            gi0 gi0Var = new gi0(le1Var2.getContext(), coVar2.getCurrentAccount(), messageObject2, coVar2.e);
                            FrameLayout frameLayout = new FrameLayout(le1Var2.getContext());
                            frameLayout.addView(gi0Var, w7.x5.c(36.0f, -1));
                            org.telegram.ui.Components.n70 J = G.J();
                            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, le1Var2.getContext(), le1Var2.a, true, false);
                            f1Var.setItemHeight(44);
                            f1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                            f1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                            FrameLayout frameLayout2 = new FrameLayout(le1Var2.getContext());
                            LinearLayout linearLayout = new LinearLayout(le1Var2.getContext());
                            linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var));
                            linearLayout.setOrientation(1);
                            coVar = coVar2;
                            org.telegram.ui.Components.ll0 a2 = gi0Var.a();
                            frameLayout2.addView(f1Var);
                            linearLayout.addView(frameLayout2);
                            z14 = z16;
                            linearLayout.addView(new org.telegram.ui.ActionBar.k1(le1Var2.getContext(), f6Var), w7.x5.n(-1, 8));
                            frameLayout2.setOnClickListener(new fe1(G));
                            messageObject3 = messageObject2;
                            bfVar = bfVar2;
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            ge1 ge1Var = new ge1(le1Var2, gi0Var, coVar, a2, linearLayout, G, J);
                            G = G;
                            le1Var = le1Var2;
                            gi0Var.setOnClickListener(ge1Var);
                            linearLayout.addView(a2, w7.x5.n(-1, -2));
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
                        G.Q(bVar, fh.b.k(f6Var), false);
                        G.Y();
                        ViewGroup viewGroup32 = G.A;
                        le1Var.S = viewGroup32;
                        viewGroup32.setPivotX(0.0f);
                        le1Var.S.setPivotY(0.0f);
                        ViewGroup viewGroup42 = le1Var.S;
                        FrameLayout.LayoutParams e72 = w7.x5.e(-2, -2, 51);
                        ie1 ie1Var62 = le1Var.d;
                        ie1Var62.addView(viewGroup42, e72);
                        viewGroup = le1Var.S;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z14) {
                        }
                        le1Var.e();
                        le1Var.c0 = new zm(this, 5);
                        le1Var.show();
                        return true;
                    }
                }
                z13 = false;
                TLRPC.User user32 = coVar2.f;
                if (user32 == null) {
                }
                org.telegram.ui.Components.n70 G2 = org.telegram.ui.Components.n70.G(le1Var2.c, coVar2.getResourceProvider(), null, !z10 || z12);
                if (z12) {
                }
                messageObject4 = messageObject3;
                i11 = 0;
                while (i11 < size) {
                }
                G2.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                G2.Q(bVar, fh.b.k(f6Var), false);
                G2.Y();
                ViewGroup viewGroup322 = G2.A;
                le1Var.S = viewGroup322;
                viewGroup322.setPivotX(0.0f);
                le1Var.S.setPivotY(0.0f);
                ViewGroup viewGroup422 = le1Var.S;
                FrameLayout.LayoutParams e722 = w7.x5.e(-2, -2, 51);
                ie1 ie1Var622 = le1Var.d;
                ie1Var622.addView(viewGroup422, e722);
                viewGroup = le1Var.S;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z14) {
                }
                le1Var.e();
                le1Var.c0 = new zm(this, 5);
                le1Var.show();
                return true;
            }
        }
        i10 = 51;
        F.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
        eh.e k102 = fh.b.k(f6Var);
        bh.b bVar2 = le1Var2.F;
        F.Q(bVar2, k102, false);
        F.Y();
        ViewGroup viewGroup22 = F.A;
        le1Var2.Q = viewGroup22;
        viewGroup22.setPivotX(0.0f);
        le1Var2.Q.setPivotY(0.0f);
        ie1Var3.addView(le1Var2.Q, w7.x5.e(-2, -2, i10));
        ArrayList arrayList42 = new ArrayList();
        ArrayList arrayList52 = new ArrayList();
        ArrayList arrayList62 = new ArrayList();
        coVar2.n8(messageObject, arrayList42, arrayList52, arrayList62);
        bf bfVar22 = new bf(coVar2, 7);
        messageObject2 = le1Var2.G;
        List<TLRPC.TL_availableReaction> enabledReactionsList2 = coVar2.getMediaDataController().getEnabledReactionsList();
        if (coVar2.v()) {
        }
        if (messageObject2.isForwardedChannelPost()) {
        }
        boolean z162 = z11;
        if (!z10) {
        }
        if (coVar2.e != null) {
            int i182 = ((-coVar2.e.linked_monoforum_id) > messageObject2.getFromChatId() ? 1 : ((-coVar2.e.linked_monoforum_id) == messageObject2.getFromChatId() ? 0 : -1));
        }
        if (!z10) {
            user2 = coVar2.f;
            if (!user2.bot) {
                z13 = true;
                TLRPC.User user322 = coVar2.f;
                if (user322 == null) {
                }
                org.telegram.ui.Components.n70 G22 = org.telegram.ui.Components.n70.G(le1Var2.c, coVar2.getResourceProvider(), null, !z10 || z12);
                if (z12) {
                }
                messageObject4 = messageObject3;
                i11 = 0;
                while (i11 < size) {
                }
                G22.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                G22.Q(bVar2, fh.b.k(f6Var), false);
                G22.Y();
                ViewGroup viewGroup3222 = G22.A;
                le1Var.S = viewGroup3222;
                viewGroup3222.setPivotX(0.0f);
                le1Var.S.setPivotY(0.0f);
                ViewGroup viewGroup4222 = le1Var.S;
                FrameLayout.LayoutParams e7222 = w7.x5.e(-2, -2, 51);
                ie1 ie1Var6222 = le1Var.d;
                ie1Var6222.addView(viewGroup4222, e7222);
                viewGroup = le1Var.S;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z14) {
                }
                le1Var.e();
                le1Var.c0 = new zm(this, 5);
                le1Var.show();
                return true;
            }
        }
        z13 = false;
        TLRPC.User user3222 = coVar2.f;
        if (user3222 == null) {
        }
        org.telegram.ui.Components.n70 G222 = org.telegram.ui.Components.n70.G(le1Var2.c, coVar2.getResourceProvider(), null, !z10 || z12);
        if (z12) {
        }
        messageObject4 = messageObject3;
        i11 = 0;
        while (i11 < size) {
        }
        G222.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
        G222.Q(bVar2, fh.b.k(f6Var), false);
        G222.Y();
        ViewGroup viewGroup32222 = G222.A;
        le1Var.S = viewGroup32222;
        viewGroup32222.setPivotX(0.0f);
        le1Var.S.setPivotY(0.0f);
        ViewGroup viewGroup42222 = le1Var.S;
        FrameLayout.LayoutParams e72222 = w7.x5.e(-2, -2, 51);
        ie1 ie1Var62222 = le1Var.d;
        ie1Var62222.addView(viewGroup42222, e72222);
        viewGroup = le1Var.S;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
        }
        if (z14) {
        }
        le1Var.e();
        le1Var.c0 = new zm(this, 5);
        le1Var.show();
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public final int V() {
        return this.a.R3;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void W1(org.telegram.ui.Cells.t1 t1Var) {
        TLRPC.Chat chat;
        TLRPC.User currentUser = t1Var.getCurrentUser();
        co coVar = this.a;
        if (!AndroidUtilities.isContextSafe(coVar.getParentActivity()) || (chat = coVar.e) == null || currentUser == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return;
        }
        e(t1Var, coVar.getMessagesController().getParticipant(coVar.e.id, currentUser.id));
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean X0(int i10, org.telegram.ui.Cells.t1 t1Var) {
        co coVar = this.a;
        return coVar.wb != 0 && t1Var.getMessageObject() != null && coVar.wb == t1Var.getMessageObject().getId() && coVar.xb == i10;
    }

    @Override // org.telegram.ui.Cells.k1
    public final ih.a Y() {
        return this.a.Qb;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void Y1(org.telegram.ui.Cells.t1 t1Var, long j3) {
        Bundle e7 = w.f.e(j3, "user_id");
        org.telegram.ui.ActionBar.n2 n2Var = this.a;
        if (n2Var.getMessagesController().checkCanOpenChat(e7, n2Var, t1Var.getMessageObject())) {
            n2Var.presentFragment(new co(e7));
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean Z(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var == null ? null : t1Var.getMessageObject();
        if (messageObject == null || messageObject.messageOwner == null) {
            return false;
        }
        co coVar = this.a;
        return (coVar.R3 == 1 || coVar.y9() || messageObject.messageOwner.noforwards || messageObject.type == 29) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // org.telegram.ui.Cells.k1
    public final boolean a0(org.telegram.ui.Cells.t1 t1Var, final TLRPC.User user) {
        int i10;
        x4 b10;
        int i11;
        rk rkVar;
        qk qkVar;
        if (!l()) {
            return false;
        }
        co coVar = this.a;
        ?? r22 = (coVar.e == null || ((rkVar = coVar.O0) != null && rkVar.getVisibility() == 0) || ((qkVar = coVar.R) != null && qkVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat = coVar.e;
        ?? r42 = (chat == null || !(coVar.d4 == 0 || coVar.h4) || (ChatObject.isChannel(chat) && !coVar.e.megagroup)) ? 0 : 1;
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
        TLRPC.UserFull userFull = coVar.getMessagesController().getUserFull(user.id);
        if (userFull != null) {
            b10 = x4.c(user, userFull, d5VarArr);
            if (!com.google.firebase.messaging.m.e(b10)) {
                i11 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
                b10 = x4.b(user, i11, d5VarArr);
            }
        } else {
            i10 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
            b10 = x4.b(user, i10, d5VarArr);
        }
        if (com.google.firebase.messaging.m.e(b10)) {
            com.google.firebase.messaging.m.k().v((ViewGroup) coVar.fragmentView, coVar.ea, b10, new b7(this, t1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(coVar, t1Var);
        final int i12 = 0;
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(this) { // from class: org.telegram.ui.bn
            public final /* synthetic */ on b;

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
                        this.b.d(user);
                        break;
                    default:
                        this.b.a.ma(user);
                        break;
                }
            }
        }, false);
        H.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new r1(this, t1Var, user, 25), false);
        final int i13 = 1;
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new Runnable(this) { // from class: org.telegram.ui.bn
            public final /* synthetic */ on b;

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
                        this.b.d(user);
                        break;
                    default:
                        this.b.a.ma(user);
                        break;
                }
            }
        }, r22);
        final int i14 = 2;
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new Runnable(this) { // from class: org.telegram.ui.bn
            public final /* synthetic */ on b;

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

    public final void b(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        co coVar = this.a;
        mk mkVar = coVar.Y;
        if (mkVar != null) {
            CharSequence fieldText = mkVar.getFieldText();
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
                coVar.Y.setFieldText(spannableStringBuilder);
                AndroidUtilities.runOnUIThread(new zm(this, 6), 200L);
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z10;
        co coVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
        if (kVar == null) {
            return false;
        }
        kVar2 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
        if (kVar2.s() || coVar.A9()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.n2) coVar).inPreviewMode;
        return !z10;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void c0(int i10) {
        int i11;
        SpannableStringBuilder replaceTags;
        int i12;
        int i13 = 3;
        int i14 = 2;
        int i15 = 1;
        co coVar = this.a;
        try {
            if (i10 == 0) {
                coVar.h7();
                jl jlVar = coVar.z3;
                if (jlVar == null) {
                    return;
                }
                jlVar.l(0L, 84, null, new zm(this, i15));
                coVar.z3.performHapticFeedback(3, 2);
                return;
            }
            if (i10 == 1) {
                String formatDateTime = LocaleController.formatDateTime(coVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                if (coVar.getMessagesController().transcribeAudioTrialCooldownUntil > 0) {
                    i12 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeftUntil", org.telegram.ui.Components.d31.h(i12), formatDateTime));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeft", org.telegram.ui.Components.d31.h(i11), new Object[0]));
                }
                org.telegram.ui.Components.yc.a0(coVar).G(R.raw.transcribe, 6, replaceTags).k(true);
                coVar.fragmentView.performHapticFeedback(3, 2);
                return;
            }
            if (i10 == 2 || i10 == 3) {
                String formatDateTime2 = LocaleController.formatDateTime(coVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(coVar);
                int i16 = R.raw.transcribe;
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialEnd", coVar.getMessagesController().transcribeAudioTrialWeeklyNumber, new Object[0]))).append((CharSequence) " ").append(i10 == 2 ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TranscriptionTrialEndBuy), new zm(this, i14)) : coVar.getMessagesController().transcribeAudioTrialCooldownUntil <= 0 ? "" : AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TranscriptionTrialEndWaitOrBuy, formatDateTime2), new zm(this, i13)));
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

    @Override // org.telegram.ui.Cells.k1
    public final boolean c1(MessageObject messageObject) {
        om omVar;
        long dialogId = messageObject.getDialogId();
        co coVar = this.a;
        return (dialogId == UserObject.REPLY_BOT || ((omVar = coVar.A0) != null && omVar.N)) && coVar.R3 != 7;
    }

    public final void d(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        co coVar = this.a;
        mk mkVar = coVar.Y;
        if (mkVar != null) {
            CharSequence fieldText = mkVar.getFieldText();
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
                SpannableString spannableString = new SpannableString(org.telegram.ui.Cells.p6.t(UserObject.getFirstName(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.o51("" + user.id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            coVar.Y.setFieldText(spannableStringBuilder);
            AndroidUtilities.runOnUIThread(new zm(this, 7), 200L);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean d0() {
        return this.a.R3 == 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean d2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        MessageObject messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (t1Var == null || pageBlock == null) {
            return false;
        }
        co coVar = this.a;
        if (coVar.getParentActivity() == null || (messageObject = t1Var.getMessageObject()) == null || (message = messageObject.messageOwner) == null || messageObject.richLayout == null || (richMessage = message.rich_message) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        messageObject.richLayout.collectMediaBlocks(arrayList);
        int indexOf = arrayList.indexOf(pageBlock);
        if (indexOf < 0) {
            return false;
        }
        PhotoViewer t12 = PhotoViewer.t1();
        t12.K2(null, coVar, null);
        return t12.e2(null, null, null, null, null, null, null, indexOf, new xm(coVar, arrayList), null, 0L, 0L, 0L, true, new wm(richMessage, arrayList, messageObject), null);
    }

    public final void e(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var;
        TLRPC.User currentUser = t1Var.getCurrentUser();
        co coVar = this.a;
        coVar.getUserConfig().getCurrentUser();
        if (!AndroidUtilities.isContextSafe(coVar.getParentActivity()) || (chat = coVar.e) == null || currentUser == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
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
                z10 = channelParticipant.promoted_by == coVar.getUserConfig().getClientUserId();
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
                    z11 = channelParticipant2.promoted_by == coVar.getUserConfig().getClientUserId();
                } else {
                    z11 = false;
                    z13 = false;
                }
                str2 = channelParticipant2.rank;
                z12 = z11;
                boolean z15 = z13;
                boolean z16 = z14;
                Activity parentActivity = coVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                long j3 = -coVar.e.id;
                f6Var = ((org.telegram.ui.ActionBar.n2) coVar).resourceProvider;
                org.telegram.ui.Components.a01.b(parentActivity, i10, j3, currentUser, str2, z15, z16, z12, f6Var);
            }
            if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                if (ChatObject.isChannel(coVar.e)) {
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                    coVar.getMessagesController();
                    tL_channels_getParticipant.channel = MessagesController.getInputChannel(coVar.e);
                    tL_channels_getParticipant.participant = coVar.getMessagesController().getInputPeer(currentUser.id);
                    coVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new org.telegram.messenger.a(), new bi.f0(7, this, t1Var));
                    return;
                }
                return;
            }
            if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                z10 = false;
                z14 = true;
            } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                z10 = ((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == coVar.getUserConfig().getClientUserId();
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
        Activity parentActivity2 = coVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
        long j32 = -coVar.e.id;
        f6Var = ((org.telegram.ui.ActionBar.n2) coVar).resourceProvider;
        org.telegram.ui.Components.a01.b(parentActivity2, i10, j32, currentUser, str2, z152, z162, z12, f6Var);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void e0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
        this.a.I7(t1Var, true, false, f7, f10, false, false, false);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void e1() {
        co coVar = this.a;
        coVar.Q7();
        UndoView undoView = coVar.y3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, coVar.T5, null);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void e2(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject primaryMessageObject = t1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.a.rc(primaryMessageObject, false);
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean f() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final int f0(org.telegram.ui.Cells.t1 t1Var) {
        rh.c cVar;
        co coVar = this.a;
        if (!coVar.wc.f || (cVar = coVar.Cc) == null || cVar.n != t1Var || cVar.a.getWidth() <= 0) {
            return 0;
        }
        return coVar.Cc.a.getHeight();
    }

    @Override // org.telegram.ui.Cells.k1
    public final String g(org.telegram.ui.Cells.t1 t1Var) {
        co coVar;
        int i10;
        if (t1Var.getMessageObject() == null || (i10 = (coVar = this.a).wb) == 0 || i10 != t1Var.getMessageObject().getId() || coVar.xb != 3) {
            return null;
        }
        return coVar.zb;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void g0(org.telegram.ui.Cells.t1 t1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        co coVar = this.a;
        if (coVar.getParentActivity() == null) {
            return;
        }
        if (coVar.X9 == null) {
            vh.i iVar = new vh.i(coVar.getParentActivity());
            coVar.X9 = iVar;
            coVar.X0.addView(iVar, w7.x5.e(-1, -1, 48));
        }
        vh.i iVar2 = coVar.X9;
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
        String b10 = vh.i.b(t1Var);
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
        vh.h hVar = new vh.h(iVar2, t1Var, arrayList4, new ug.r(6, iVar2, b10));
        hVar.setBounds(0, 0, iVar2.getMeasuredWidth(), iVar2.getMeasuredHeight());
        hVar.setCallback(iVar2);
        if (hashMap.containsKey(b10)) {
            return;
        }
        hashMap.put(b10, hVar);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void g1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        co coVar = this.a;
        if (coVar.z9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        if (coVar.getParentActivity() != null) {
            if (coVar.O0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                mk mkVar = coVar.Y;
                MessageObject messageObject = t1Var.getMessageObject();
                MessageObject messageObject2 = t1Var.getMessageObject();
                zi ziVar = null;
                String str = tL_inlineButtonTypeUrl != null ? tL_inlineButtonTypeUrl.url : null;
                of.e eVar = coVar.Ab;
                if (eVar != null) {
                    eVar.a(true);
                    coVar.Ab = null;
                }
                if (str == null || t1Var.getMessageObject() == null) {
                    coVar.Ab = null;
                } else {
                    zi ziVar2 = new zi(coVar, t1Var.getMessageObject().getId(), str, t1Var, 1);
                    coVar.Ab = ziVar2;
                    ziVar = ziVar2;
                }
                mkVar.c0(keyboardButtonProto, messageObject, messageObject2, ziVar);
            }
        }
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
        co coVar = this.a;
        if (isHuaweiStoreApp) {
            of.f.s(coVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            of.f.s(coVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
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
        int a2 = rh.i.a(messageObject);
        boolean a10 = w7.b0.a(a2, 7);
        co coVar = this.a;
        if (a10) {
            org.telegram.ui.Components.yc.a0(coVar).Q(R.raw.e_hand_2, 36, rh.i.b(messageObject, a2)).j();
            return;
        }
        if (i10 < 0 && !arrayList.isEmpty()) {
            coVar.getSendMessagesHelper().sendVote(messageObject, arrayList, null);
            t1Var.S0(true);
            return;
        }
        if (coVar.getParentActivity() == null) {
            return;
        }
        if (coVar.n2 == null) {
            org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(5, coVar.getParentActivity(), coVar.ea, false);
            coVar.n2 = i40Var;
            i40Var.setAlpha(0.0f);
            coVar.n2.setVisibility(4);
            int indexOfChild = coVar.X0.indexOfChild(coVar.S);
            if (indexOfChild == -1) {
                return;
            } else {
                coVar.X0.addView(coVar.n2, indexOfChild + 1, w7.x5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
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
                float y3 = ((t1Var.getY() + r1Var.b) - AndroidUtilities.dp(4.0f)) - coVar.s9;
                coVar.q2 = AndroidUtilities.dp(13.3f) + r1Var.a;
                int D = org.telegram.messenger.vl.D(6.0f, r1Var.b, i12);
                coVar.r2 = D;
                if (y3 > 0.0f) {
                    i15 = coVar.q2;
                    i13 = D;
                    f7 = 0.0f;
                    break;
                }
                i16++;
                f7 = y3;
            }
            if (f7 != 0.0f) {
                coVar.x0.v0(0, (int) f7, null);
                coVar.p2 = t1Var;
                return;
            }
            i14 = i15;
        }
        coVar.n2.e(t1Var, Integer.valueOf(i10), i14, i13, true);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void i2() {
        this.a.r9();
    }

    @Override // org.telegram.ui.Cells.k1
    public final void j() {
        h();
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean j0() {
        boolean z10;
        co coVar = this.a;
        if (coVar.A9()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.n2) coVar).inPreviewMode;
        return !z10;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void j1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
        if (t1Var == null || document == null) {
            return;
        }
        co coVar = this.a;
        if (coVar.getParentLayout() == null || !Z(t1Var)) {
            return;
        }
        org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(coVar, t1Var);
        H.c(R.drawable.msg_download, LocaleController.getString(R.string.SaveToDownloads), new r1(this, t1Var, document, 24), false);
        H.t = false;
        H.Z();
    }

    public final void k(org.telegram.ui.Cells.t1 t1Var, boolean z10, boolean z11, boolean z12) {
        MessageObject primaryMessageObject;
        int i10;
        int i11;
        xj xjVar;
        if (t1Var == null || (primaryMessageObject = t1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.forceUpdate = true;
        co coVar = this.a;
        uj ujVar = coVar.x0;
        if (ujVar != null && (xjVar = coVar.z0) != null && xjVar.y < 0) {
            for (int childCount = ujVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = coVar.x0.getChildAt(childCount);
                coVar.x0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.t1)) {
                        if (childAt instanceof org.telegram.ui.Cells.w0) {
                            i11 = coVar.L8(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = coVar.L8(childAt);
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
                xj xjVar2 = coVar.z0;
                coVar.x0.getClass();
                xjVar2.i1(RecyclerView.R(t1Var), t1Var.getTop() - ((int) coVar.s9), false);
            } else {
                coVar.z0.h1(i10, i11);
            }
        }
        coVar.N0 = z11;
        coVar.rc(primaryMessageObject, false);
        coVar.N0 = false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void k2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.a.W7(t1Var, reactionCount, z10, f7, f10);
    }

    public final boolean l() {
        co coVar = this.a;
        if (UserObject.isUserSelf(coVar.f)) {
            return true;
        }
        TLRPC.Chat chat = coVar.e;
        if (chat != null) {
            return !ChatObject.isChannel(chat) || coVar.e.megagroup;
        }
        return false;
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
            G1(t1Var, webPage, webPage.url, messageMedia.safe);
            return;
        }
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        co coVar = this.a;
        if (geoPoint != null) {
            if (AndroidUtilities.isMapsInstalled(coVar)) {
                ln lnVar = new ln(3);
                f6Var2 = ((org.telegram.ui.ActionBar.n2) coVar).resourceProvider;
                lnVar.setResourceProvider(f6Var2);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = coVar.getMessagesController().getPeer(coVar.a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                tL_messageMediaGeo.geo = messageMedia.geo;
                String str = messageMedia.address;
                if (str == null) {
                    str = (pollAnswer == null || (tL_textWithEntities = pollAnswer.text) == null) ? "" : tL_textWithEntities.text;
                }
                tL_messageMediaGeo.address = str;
                tL_message.media = tL_messageMediaGeo;
                lnVar.O0 = false;
                lnVar.u0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                coVar.presentFragment(lnVar);
                return;
            }
            return;
        }
        if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
            st.q().w(coVar.getParentActivity());
            st.q().v(new mn(this, tL_messageMediaPoll, pollAnswer, t1Var));
            st q6 = st.q();
            TLRPC.Document document4 = messageMedia.document;
            int i18 = MessageObject.isAnimatedEmoji(document4) ? 2 : 0;
            MessageObject messageObject2 = t1Var.getMessageObject();
            f6Var = ((org.telegram.ui.ActionBar.n2) coVar).resourceProvider;
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
            TLRPC.TL_message C7 = co.C7(message);
            C7.media = messageMedia;
            C7.attachPath = rh.f.c(message, i10);
            ArrayList<MessageObject> arrayList = new ArrayList<>();
            i17 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
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
            i15 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
            TLRPC.Document document6 = messageMedia.document;
            rh.a aVar = new rh.a(i15, messageObject, document6, rh.f.c(messageObject.messageOwner, i10));
            if (aVar.g) {
                FileLoader.getInstance(i15).cancelLoadFile(document6);
                aVar.a();
                MessageObject messageObject4 = t1Var.y7;
                if (messageObject4 == null || !messageObject4.isPoll()) {
                    return;
                }
                rh.g gVar = t1Var.c6;
                if (gVar != null) {
                    gVar.e();
                }
                rh.g gVar2 = t1Var.b6;
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
                rh.g gVar3 = t1Var.c6;
                if (gVar3 != null) {
                    gVar3.e();
                }
                rh.g gVar4 = t1Var.b6;
                if (gVar4 != null) {
                    gVar4.e();
                    return;
                }
                return;
            }
            TLRPC.Message message2 = messageObject.messageOwner;
            TLRPC.TL_message C72 = co.C7(message2);
            C72.media = messageMedia;
            C72.attachPath = rh.f.c(message2, i10);
            i16 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
            nn nnVar = new nn(i16, C72, false, true);
            if (MessageObject.canPreviewDocument(messageMedia.document)) {
                PhotoViewer.t1().K2(null, coVar, coVar.ea);
                PhotoViewer t12 = PhotoViewer.t1();
                int i19 = nnVar.type;
                t12.c2(nnVar, coVar, i19 != 0 ? coVar.T5 : 0L, i19 != 0 ? coVar.L6 : 0L, i19 != 0 ? coVar.d() : 0L, coVar.Fa);
                return;
            }
            try {
                AndroidUtilities.openForView(nnVar, coVar.getParentActivity(), coVar.ea, false);
                return;
            } catch (Exception e7) {
                FileLog.e(e7);
                coVar.z6(nnVar);
                return;
            }
        }
        TLRPC.Message message3 = messageObject.messageOwner;
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
        if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || MessageObject.isVideoDocument(document3))) {
            i11 = messageMedia3 == messageMedia ? arrayList3.size() : -1;
            TLRPC.TL_message C73 = co.C7(message3);
            C73.media = messageMedia3;
            C73.attachPath = rh.f.c(message3, -2);
            i14 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
            arrayList3.add(new en(i14, C73, false, true));
            arrayList2.add(-2);
        } else {
            i11 = -1;
        }
        if (messageObject.expandedExplanation && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || MessageObject.isVideoDocument(document2))) {
            if (messageMedia2 == messageMedia) {
                i11 = arrayList3.size();
            }
            TLRPC.TL_message C74 = co.C7(message3);
            C74.media = messageMedia2;
            C74.attachPath = rh.f.c(message3, -3);
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            C74.message = pollResults2.solution;
            C74.entities = pollResults2.solution_entities;
            i13 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
            arrayList3.add(new fn(i13, C74, false, true));
            arrayList2.add(-3);
        }
        zf.d.b(tL_messageMediaPoll.poll, coVar.getUserConfig().getClientUserId());
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
                TLRPC.TL_message C75 = co.C7(message3);
                C75.media = messageMedia4;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                C75.message = tL_textWithEntities2.text;
                C75.entities = tL_textWithEntities2.entities;
                C75.attachPath = rh.f.c(message3, pollAnswer2.unshuffled_index);
                i12 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                arrayList3.add(new gn(i12, C75, false, true));
                arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
            }
        }
        if (i11 <= -1 || arrayList3.isEmpty()) {
            return;
        }
        messageObject.pollMediaMapping = arrayList2;
        PhotoViewer.t1().K2(null, coVar, coVar.ea);
        PhotoViewer.t1().a2(arrayList3, i11, coVar.a(), 0L, 0L, coVar.Ga);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void m0(String str) {
        co coVar = this.a;
        rk rkVar = coVar.O0;
        if (rkVar == null || rkVar.getVisibility() != 0) {
            qk qkVar = coVar.R;
            if ((qkVar == null || qkVar.getVisibility() != 0) && coVar.Y != null && str != null && str.length() > 0) {
                coVar.Y.setFieldText("@" + str + " ");
                coVar.Y.H0();
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean m2(int i10) {
        boolean z10;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        if (i10 != 16 && i10 != R.id.acc_action_small_button && i10 != R.id.acc_action_msg_options) {
            return false;
        }
        co coVar = this.a;
        z10 = ((org.telegram.ui.ActionBar.n2) coVar).inPreviewMode;
        if (!z10 || !coVar.J9) {
            return !c();
        }
        d5Var = ((org.telegram.ui.ActionBar.n2) coVar).parentLayout;
        if (d5Var != null) {
            d5Var2 = ((org.telegram.ui.ActionBar.n2) coVar).parentLayout;
            ((ActionBarLayout) d5Var2).r();
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void n(org.telegram.ui.Cells.t1 t1Var) {
        if (t1Var.getMessageObject().isImportedForward()) {
            e1();
            return;
        }
        co coVar = this.a;
        if (coVar.l3 || coVar.x0 == null || coVar.getParentActivity() == null || coVar.fragmentView == null) {
            return;
        }
        if (coVar.u2 == null) {
            um umVar = coVar.X0;
            int indexOfChild = umVar.indexOfChild(coVar.S);
            if (indexOfChild == -1) {
                return;
            }
            org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(1, coVar.getParentActivity(), coVar.ea, false);
            coVar.u2 = i40Var;
            umVar.addView(i40Var, indexOfChild + 1, w7.x5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            coVar.u2.setAlpha(0.0f);
            coVar.u2.setVisibility(4);
        }
        coVar.u2.e(t1Var, null, 0, 0, true);
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean n0(org.telegram.ui.Components.z5 z5Var) {
        TLRPC.InputStickerSet inputStickerSet;
        int i10;
        co coVar = this.a;
        if (coVar.getMessagesController().premiumFeaturesBlocked() || z5Var == null || z5Var.standard) {
            return false;
        }
        long documentId = z5Var.getDocumentId();
        TLRPC.Document document = z5Var.document;
        if (document == null) {
            i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
            document = org.telegram.ui.Components.q5.f(i10, documentId);
        }
        if (document == null || (inputStickerSet = MessageObject.getInputStickerSet(document)) == null) {
            return false;
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, true);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(inputStickerSet);
        org.telegram.ui.Components.rv rvVar = new org.telegram.ui.Components.rv(coVar, coVar.getParentActivity(), coVar.ea, arrayList);
        org.telegram.ui.Components.hv hvVar = rvVar.f;
        hvVar.getClass();
        ImageReceiver imageReceiver = new ImageReceiver(hvVar);
        hvVar.v = imageReceiver;
        if (hvVar.d) {
            imageReceiver.onAttachedToWindow();
        }
        hvVar.w = true;
        hvVar.x.d(1.0f, true);
        hvVar.v.setImage(ImageLocation.getForDocument(document), "140_140", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "140_140", DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.m6, 0.2f, true), 0L, null, null, 0);
        hvVar.v.setLayerNum(7);
        hvVar.v.setAllowStartLottieAnimation(true);
        hvVar.v.setAllowStartAnimation(true);
        hvVar.v.setAutoRepeat(1);
        hvVar.v.setAllowDecodeSingleFrame(true);
        hvVar.v.setParentView(hvVar);
        rvVar.setCalcMandatoryInsets(coVar.x9());
        coVar.showDialog(rvVar);
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void o() {
        this.a.X0.getClass();
    }

    @Override // org.telegram.ui.Cells.k1
    public final void o1(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
        vh.h hVar;
        vh.i iVar = this.a.X9;
        if (iVar == null || (hVar = (vh.h) iVar.a.get(vh.i.b(t1Var))) == null) {
            return;
        }
        vh.d[] dVarArr = hVar.w;
        RectF rectF = hVar.r;
        if (hVar.M) {
            float f11 = (f7 - rectF.left) + hVar.U;
            float f12 = (f10 - rectF.top) + hVar.V;
            int i10 = vh.g.a;
            int b10 = (((float) (-AndroidUtilities.dp((float) 37))) >= f12 || f12 >= rectF.height()) ? -1 : w7.p.b((int) Math.floor((f11 - (AndroidUtilities.dp(9) - (AndroidUtilities.dp(11) / 2.0f))) / AndroidUtilities.dp(vh.g.a + 11)), 0, dVarArr.length - 1);
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

    @Override // org.telegram.ui.Cells.k1
    public final void o2() {
        co coVar = this.a;
        if (!coVar.getUserConfig().isPremium()) {
            org.telegram.ui.Components.yc.a0(coVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("UnlockSimilarChannelsPremium", coVar.getMessagesController().recommendedChannelsLimitPremium), new zm(this, 4))).j();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", coVar.T5);
        bundle.putInt("start_from", 10);
        coVar.presentFragment(new org.telegram.ui.Components.ca0(bundle, coVar.a1.getSharedMediaPreloader()));
    }

    public final void p(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, boolean z10) {
        co coVar = this.a;
        TLRPC.Chat chat2 = coVar.e;
        if (chat2 != null && chat.id == chat2.id) {
            pj pjVar = coVar.a1;
            if (pjVar != null && i10 == 0) {
                pjVar.e(false, false);
                return;
            } else {
                if (t1Var.getMessageObject() != null) {
                    coVar.F(i10, t1Var.getMessageObject().getId(), 0, 0, true, false);
                    return;
                }
                return;
            }
        }
        if (chat2 == null || chat.id != chat2.id || coVar.F9()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            aj ajVar = null;
            if (z10) {
                of.e eVar = coVar.Ab;
                if (eVar != null) {
                    eVar.a(true);
                    coVar.Ab = null;
                }
                if (t1Var.getMessageObject() == null) {
                    coVar.Ab = null;
                } else {
                    aj ajVar2 = new aj(coVar, t1Var.getMessageObject().getId(), t1Var, 0);
                    coVar.Ab = ajVar2;
                    ajVar = ajVar2;
                }
            }
            if (coVar.getMessagesController().checkCanOpenChat(bundle, coVar, t1Var.getMessageObject(), ajVar)) {
                co coVar2 = new co(bundle);
                if (ajVar == null || i10 == 0) {
                    coVar.presentFragment(coVar2);
                } else {
                    AndroidUtilities.runOnUIThread(new fi.l3(this, ajVar, chat, i10, coVar2, 16), 5000L);
                    ajVar.d();
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void p0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
        co coVar = this.a;
        coVar.I7(t1Var, false, false, f7, f10, true, false, false);
        coVar.x0.getClass();
        co.c2(coVar, RecyclerView.R(t1Var));
    }

    @Override // org.telegram.ui.Cells.k1
    public final void p2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
        MessageObject messageObject;
        TLRPC.TL_factCheck factCheck;
        String str;
        co coVar = this.a;
        di.f4 f4Var = coVar.A1;
        if (f4Var != null) {
            f4Var.e(true);
        }
        if (coVar.getParentActivity() == null || (messageObject = t1Var.getMessageObject()) == null || (factCheck = messageObject.getFactCheck()) == null || factCheck.country == null) {
            return;
        }
        try {
            str = new Locale("", factCheck.country).getDisplayCountry(LocaleController.getInstance().getCurrentLocale());
        } catch (Exception e7) {
            FileLog.e(e7);
            str = factCheck.country;
        }
        di.f4 f4Var2 = new di.f4(coVar.getParentActivity(), 3);
        f4Var2.p(true);
        f4Var2.K = Layout.Alignment.ALIGN_NORMAL;
        f4Var2.d = -1L;
        f4Var2.T = true;
        f4Var2.e = true;
        f4Var2.q(12.0f);
        coVar.A1 = f4Var2;
        f4Var2.l0 = new fh(12, this, f4Var2);
        f4Var2.s(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FactCheckToast, str)));
        coVar.X0.addView(coVar.A1, w7.x5.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
        coVar.X0.post(new i2.a0(this, t1Var, i11, i10, 4));
    }

    public final void q(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            org.telegram.ui.ActionBar.n2 n2Var = this.a;
            if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var, t1Var.getMessageObject())) {
                n2Var.presentFragment(new co(bundle));
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final org.telegram.ui.Cells.r9 q2() {
        return this.a.c9;
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
    public final void r(org.telegram.ui.Cells.t1 t1Var) {
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
        co coVar = this.a;
        if (coVar.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.w21 w21Var = coVar.R1;
        if (w21Var != null && coVar.d4 == 0 && (t1Var.T7 || t1Var.U7)) {
            w21Var.m(t1Var.getMessageObject().getTopicId(), true);
            return;
        }
        if (coVar.getMessagesController().isFrozen()) {
            i13 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
            b.b(i13);
            return;
        }
        mk mkVar = coVar.Y;
        if (mkVar != null) {
            mkVar.P();
        }
        MessageObject messageObject = t1Var.getMessageObject();
        int i14 = coVar.R3;
        if (i14 == 2) {
            coVar.V8.V0(messageObject.getId());
            coVar.finishFragment();
            return;
        }
        if (i14 == 3 || ((i14 == 7 && coVar.O3 == 2) || !((!UserObject.isReplyUser(coVar.f) && !UserObject.isUserSelf(coVar.f)) || (messageFwdHeader = messageObject.messageOwner.fwd_from) == null || messageFwdHeader.saved_from_peer == null))) {
            if (UserObject.isReplyUser(coVar.f) && (messageReplyHeader = (message = messageObject.messageOwner).reply_to) != null && (i10 = messageReplyHeader.reply_to_top_id) != 0) {
                coVar.aa(messageReplyHeader.reply_to_peer_id.channel_id, null, i10, 0L, -1, message.fwd_from.saved_from_msg_id, messageObject);
                return;
            } else if (coVar.R3 == 7 && coVar.O3 == 2) {
                coVar.fa(messageObject);
                return;
            } else {
                coVar.ga(messageObject);
                return;
            }
        }
        ArrayList<MessageObject> arrayList = (messageObject.getGroupId() == 0 || (groupedMessages = (MessageObject.GroupedMessages) coVar.x6.f(messageObject.getGroupId())) == null) ? null : groupedMessages.messages;
        if (arrayList == null) {
            arrayList = org.telegram.messenger.w1.l(messageObject);
        }
        if (coVar.getMessagesController().storiesEnabled() && !messageObject.isSponsored() && (((message2 = messageObject.messageOwner) == null || !message2.noforwards) && (i12 = messageObject.type) != 17 && i12 != 12)) {
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
                coVar.showDialog(new in(this, coVar.getParentActivity(), coVar, arrayList, ChatObject.isChannel(coVar.e), z10, coVar.ea, z10, messageObject));
                Activity parentActivity = coVar.getParentActivity();
                i11 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
                coVar.fragmentView.requestLayout();
            }
        }
        z10 = false;
        coVar.showDialog(new in(this, coVar.getParentActivity(), coVar, arrayList, ChatObject.isChannel(coVar.e), z10, coVar.ea, z10, messageObject));
        Activity parentActivity2 = coVar.getParentActivity();
        i11 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
        AndroidUtilities.setAdjustResizeToNothing(parentActivity2, i11);
        coVar.fragmentView.requestLayout();
    }

    @Override // org.telegram.ui.Cells.k1
    public final void s() {
        this.a.Yb();
    }

    @Override // org.telegram.ui.Cells.k1
    public final void s0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f7, float f10) {
        org.telegram.ui.ActionBar.k kVar;
        co coVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
        boolean z10 = true;
        if (kVar.s() || coVar.A9()) {
            co.b2(coVar, t1Var, true, f7, f10);
            return;
        }
        if (t1Var.getMessageObject() != null && t1Var.getMessageObject().isSponsored()) {
            L0(10, t1Var);
            return;
        }
        if (!ChatObject.isForum(coVar.e) && !coVar.F9()) {
            z10 = false;
        }
        x(user, z10);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void t(org.telegram.ui.Cells.t1 t1Var) {
        int i10;
        int i11;
        xj xjVar;
        MessageObject primaryMessageObject = t1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        primaryMessageObject.factCheckExpanded = !primaryMessageObject.factCheckExpanded;
        primaryMessageObject.forceUpdate = true;
        co coVar = this.a;
        uj ujVar = coVar.x0;
        if (ujVar != null && (xjVar = coVar.z0) != null && xjVar.y < 0) {
            for (int childCount = ujVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = coVar.x0.getChildAt(childCount);
                coVar.x0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.t1)) {
                        if (childAt instanceof org.telegram.ui.Cells.w0) {
                            i11 = coVar.L8(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = coVar.L8(childAt);
                            break;
                        }
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        coVar.rc(primaryMessageObject, false);
        di.f4 f4Var = coVar.A1;
        if (f4Var != null) {
            f4Var.e(true);
        }
        if (i10 < 0 || t1Var.getCurrentMessagesGroup() != null) {
            return;
        }
        coVar.z0.h1(i10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:275:0x0b06, code lost:
    
        if (r0.exists() != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0bd0, code lost:
    
        if (r4.startsWith("text/x-web-markdown") == false) goto L319;
     */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0c17 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:328:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Cells.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10, boolean z10) {
        int i10;
        MessageObject messageObject;
        int i11;
        int i12;
        MessageObject messageObject2;
        co coVar;
        long j3;
        long j10;
        File file;
        TLRPC.Chat chat;
        cv0 E;
        float f11;
        char c10;
        cv0 cv0Var;
        MessageObject messageObject3;
        ImageLocation imageLocation;
        BitmapDrawable bitmapDrawable;
        MessageObject messageObject4;
        MessageObject messageObject5;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        int i13;
        MessageObject messageObject6 = t1Var.getMessageObject();
        int i14 = messageObject6.type;
        co coVar2 = this.a;
        if (i14 == 23) {
            TLRPC.MessageMedia messageMedia2 = messageObject6.messageOwner.media;
            TL_stories.StoryItem storyItem = messageMedia2.storyItem;
            if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                return;
            }
            storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia2.peer);
            storyItem.messageId = messageObject6.getId();
            storyItem.messageType = 2;
            bi.p9.b(storyItem, coVar2.f);
            coVar2.getOrCreateStoryViewer().F(coVar2.getParentActivity(), messageObject6.messageOwner.media.storyItem, bi.d9.a(coVar2.x0));
            return;
        }
        int i15 = 1;
        if (messageObject6.isVideo()) {
            i13 = ((org.telegram.ui.ActionBar.n2) coVar2).currentAccount;
            if (DownloadController.getInstance(i13).canDownloadMedia(messageObject6.messageOwner) == 1) {
                messageObject6.putInDownloadsStore = true;
            }
        } else {
            messageObject6.putInDownloadsStore = true;
        }
        if (messageObject6.isSendError()) {
            coVar2.I7(t1Var, false, false, f7, f10, true, false, false);
            return;
        }
        if (messageObject6.isSending()) {
            return;
        }
        int i16 = 0;
        if (z10 && (message = messageObject6.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && !TextUtils.isEmpty(webPage.url)) {
            String str = messageObject6.messageOwner.media.webpage.url;
            AndroidUtilities.getHostAuthority(str);
            if (coVar2.ea(str, t1Var, null, messageObject6.getId(), 2)) {
                return;
            }
            of.e eVar = coVar2.Ab;
            if (eVar != null) {
                eVar.a(true);
            }
            coVar2.Ab = t1Var.getMessageObject() != null ? new hn(this, t1Var, i16) : null;
            of.f.r(coVar2.getParentActivity(), Uri.parse(str), true, false, false, coVar2.Ab, null, false, true, false);
            return;
        }
        int i17 = 4;
        if (messageObject6.isDice()) {
            an anVar = new an(this, messageObject6, i16);
            if (messageObject6.isStakeableDice()) {
                coVar2.getMessagesController().loadStakeDiceInfo(new y(this, messageObject6, anVar, i17));
                return;
            } else {
                anVar.run();
                return;
            }
        }
        if ((messageObject6.isAnimatedEmoji() && (!messageObject6.isAnimatedAnimatedEmoji() || (coVar2.xa.e.containsKey(gz.q(MessageObject.findAnimatedEmojiEmoticon(messageObject6.getDocument()))) && coVar2.f != null))) || messageObject6.isPremiumSticker()) {
            coVar2.Na(t1Var);
            coVar2.xa.l(t1Var, coVar2, true);
            coVar2.x0.I0(false);
            return;
        }
        int i18 = 6;
        if (messageObject6.needDrawBluredPreview()) {
            te fb2 = coVar2.fb(messageObject6, false);
            a3.g0 O4 = co.O4(coVar2, messageObject6);
            t1Var.invalidate();
            final SecretMediaViewer f12 = SecretMediaViewer.f();
            final Activity parentActivity = coVar2.getParentActivity();
            int i19 = UserConfig.selectedAccount;
            f12.a = i19;
            ImageReceiver imageReceiver = f12.h;
            imageReceiver.setCurrentAccount(i19);
            if (f12.b != parentActivity) {
                f12.b = parentActivity;
                f12.g1 = new org.telegram.ui.Components.nm0(parentActivity, null);
                j0 j0Var = new j0(f12, parentActivity, 21);
                f12.d = j0Var;
                j0Var.setBackgroundDrawable(f12.l0);
                f12.d.setFocusable(true);
                f12.d.setFocusableInTouchMode(true);
                f12.d.setClipChildren(false);
                f12.d.setClipToPadding(false);
                f12.e = new ah.w(f12, parentActivity);
                View view = new View(parentActivity);
                f12.f = view;
                view.setBackgroundColor(2130706432);
                f12.e.addView(f12.f, w7.x5.e(-1, -2, 80));
                f12.e.setFocusable(false);
                f12.d.addView(f12.e);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f12.e.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                layoutParams.gravity = 51;
                f12.e.setLayoutParams(layoutParams);
                f12.e.setFitsSystemWindows(true);
                f12.e.setOnApplyWindowInsetsListener(new x41(f12, 0));
                f12.e.setSystemUiVisibility(1792);
                GestureDetector gestureDetector = new GestureDetector(f12.e.getContext(), f12);
                f12.L0 = gestureDetector;
                gestureDetector.setOnDoubleTapListener(f12);
                org.telegram.ui.Components.z7 z7Var = new org.telegram.ui.Components.z7(f12, parentActivity, i18);
                f12.F = z7Var;
                z7Var.setTitleColor(-1);
                f12.F.setSubtitleColor(-1);
                f12.F.setBackgroundColor(2130706432);
                f12.F.setOccupyStatusBar(true);
                f12.F.B(1090519039, false);
                f12.F.C(-1, false);
                f12.F.setBackButtonImage(R.drawable.ic_ab_back);
                f12.F.setTitleRightMargin(AndroidUtilities.dp(70.0f));
                f12.e.addView(f12.F, w7.x5.c(-2.0f, -1));
                f12.F.setActionBarMenuOnItemClick(new o70(f12, 29));
                di.f4 f4Var = new di.f4(parentActivity, 1);
                f12.r = f4Var;
                f4Var.l(1.0f, -26.0f);
                f12.r.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                f12.e.addView(f12.r, w7.x5.d(-1, 80.0f, 53, 0.0f, 48.0f, 0.0f, 0.0f));
                d51 d51Var = new d51(f12, parentActivity);
                f12.n = d51Var;
                f12.e.addView(d51Var, w7.x5.d(119, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
                iw0 iw0Var = new iw0(f12, i15);
                f12.U = new e51(f12, parentActivity);
                View view2 = new View(parentActivity);
                f12.T = view2;
                view2.setBackgroundColor(2130706432);
                f12.U.addView(f12.T, w7.x5.e(-1, -1, 119));
                org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(f12.e.getContext());
                f12.S = j5Var;
                j5Var.setTextColor(-1);
                f12.S.setGravity(53);
                f12.S.setTextSize(14);
                f12.S.setImportantForAccessibility(2);
                f12.U.addView(f12.S, w7.x5.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
                t50 t50Var = new t50(f12, parentActivity, 8);
                f12.R = t50Var;
                org.telegram.ui.Components.i71 i71Var = new org.telegram.ui.Components.i71(t50Var);
                f12.Q = i71Var;
                i71Var.z = AndroidUtilities.dp(2.0f);
                org.telegram.ui.Components.i71 i71Var2 = f12.Q;
                i71Var2.k = 872415231;
                i71Var2.l = 872415231;
                i71Var2.m = -1;
                i71Var2.n = -1;
                i71Var2.A = 1509949439;
                i71Var2.j = iw0Var;
                f12.U.addView(f12.R);
                f12.e.addView(f12.U, w7.x5.e(-1, 48, 80));
                vs0 vs0Var = new vs0(null, new bi.b());
                f12.Y = vs0Var;
                vs0Var.k0 = true;
                vs0Var.i0 = false;
                qu0 qu0Var = new qu0(f12.e.getContext());
                f12.Z = qu0Var;
                qu0Var.setFactory(new ViewSwitcher.ViewFactory() { // from class: org.telegram.ui.y41
                    @Override // android.widget.ViewSwitcher.ViewFactory
                    public final View makeView() {
                        SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
                        return new pu0(parentActivity, secretMediaViewer.a0, secretMediaViewer.Y, new b5(secretMediaViewer, 22), new og0(secretMediaViewer, 2));
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
                org.telegram.ui.Components.fg0 fg0Var = new org.telegram.ui.Components.fg0(28);
                f12.W = fg0Var;
                fg0Var.setCallback(f12.V);
                f12.V.setImageDrawable(f12.W);
                f12.V.setScaleType(ImageView.ScaleType.CENTER);
                f12.V.setScaleX(0.6f);
                f12.V.setScaleY(0.6f);
                f12.V.setAlpha(0.0f);
                f12.V.setPivotX(AndroidUtilities.dp(32.0f));
                f12.V.setPivotY(AndroidUtilities.dp(32.0f));
                f12.e.addView(f12.V, w7.x5.e(64, 64, 17));
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
                org.telegram.ui.Cells.ca o9 = f12.Y.o(f12.d.getContext());
                if (o9 != null) {
                    AndroidUtilities.removeFromParent(o9);
                    f12.e.addView(o9);
                }
                f12.Y.T(f12.e);
                f12.Y.j0 = true;
            }
            SecretMediaViewer f13 = SecretMediaViewer.f();
            ql qlVar = coVar2.Fa;
            SecretMediaViewer.PhotoBackgroundDrawable photoBackgroundDrawable = f13.l0;
            ImageReceiver imageReceiver2 = f13.h;
            if (f13.b == null || !messageObject6.needDrawBluredPreview() || qlVar == null || (E = qlVar.E(messageObject6, null, 0, true, false)) == null) {
                return;
            }
            f13.q1 = messageObject6.messageOwner.ttl == Integer.MAX_VALUE;
            f13.p1 = O4;
            f13.N = qlVar;
            f13.K = System.currentTimeMillis();
            f13.L = 0L;
            f13.k0 = true;
            f13.j0 = true;
            f13.p0 = false;
            l4 l4Var = f13.w;
            if (l4Var != null) {
                l4Var.setVisibility(4);
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
                    cv0Var = E;
                    messageObject5 = messageObject6;
                    imageReceiver2.setImage(forDocument, (String) null, f13.i0 != null ? new BitmapDrawable(f13.i0.bitmap) : null, -1L, (String) null, messageObject5, 1);
                } else {
                    f11 = 0.0f;
                    c10 = 6;
                    cv0Var = E;
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
                cv0Var = E;
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
                d51 d51Var2 = f13.n;
                d51Var2.e = true;
                TextPaint textPaint = d51Var2.r;
                textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
                textPaint.setColor(-1);
                StaticLayout staticLayout = new StaticLayout("1", textPaint, 999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                d51Var2.s = staticLayout;
                d51Var2.v = staticLayout.getLineCount() > 0 ? d51Var2.s.getLineWidth(0) : 0.0f;
                d51Var2.w = d51Var2.s.getHeight();
                d51Var2.invalidate();
                f13.n.setOnClickListener(new j41(f13, 3));
            } else {
                f13.n.setOnClickListener(null);
            }
            try {
                if (f13.d.getParent() != null) {
                    ((WindowManager) f13.b.getSystemService("window")).removeView(f13.d);
                }
            } catch (Exception e7) {
                FileLog.e(e7);
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
            org.telegram.ui.Components.z7 z7Var2 = f13.F;
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z7Var2, (Property<org.telegram.ui.Components.z7, Float>) property, 0.0f, 1.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(f13.a0, (Property<au0, Float>) property, 0.0f, 1.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(f13.r, (Property<di.f4, Float>) property, 0.0f, 1.0f);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.t6.d, 0, 255);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(f13, f13.v1, 0.0f, 1.0f);
            e51 e51Var = f13.U;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(e51Var, e51Var.n, 1.0f);
            e51 e51Var2 = f13.U;
            if (f13.J) {
                f11 = 1.0f;
            }
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(e51Var2, (Property<e51, Float>) property, f11);
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
            f13.o0 = new pf0(f13, fb2, messageObject4, 26);
            f13.K0.setDuration(250L);
            f13.K0.addListener(new b51(f13, 0));
            f13.n0 = System.currentTimeMillis();
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                f13.e.setLayerType(2, null);
            }
            f13.K0.setInterpolator(new DecelerateInterpolator());
            photoBackgroundDrawable.b = 0;
            photoBackgroundDrawable.a = new rx0(27, f13, cv0Var);
            f13.K0.start();
            return;
        }
        if (MessageObject.isAnimatedEmoji(messageObject6.getDocument()) && MessageObject.getInputStickerSet(messageObject6.getDocument()) != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(MessageObject.getInputStickerSet(messageObject6.getDocument()));
            org.telegram.ui.Components.rv rvVar = new org.telegram.ui.Components.rv(coVar2, coVar2.getParentActivity(), coVar2.ea, arrayList);
            rvVar.setCalcMandatoryInsets(coVar2.x9());
            coVar2.showDialog(rvVar);
            return;
        }
        if (messageObject6.getInputStickerSet() != null) {
            org.telegram.ui.Components.ux0 ux0Var = new org.telegram.ui.Components.ux0(coVar2.getParentActivity(), coVar2, messageObject6.getInputStickerSet(), null, (coVar2.O0.getVisibility() == 0 || !((chat = coVar2.e) == null || ChatObject.canSendStickers(chat))) ? null : coVar2.Y, coVar2.ea);
            ux0Var.setCalcMandatoryInsets(coVar2.x9());
            coVar2.showDialog(ux0Var);
            return;
        }
        if (messageObject6.isVideo() || (i10 = messageObject6.type) == 1 || ((i10 == 0 && !messageObject6.isWebpageDocument()) || messageObject6.isGif())) {
            if (messageObject6.isSponsored()) {
                if (messageObject6.isGif() || messageObject6.isPhoto()) {
                    coVar2.J9(messageObject6, true, false);
                    if (messageObject6.sponsoredUrl != null) {
                        of.e eVar2 = coVar2.Ab;
                        if (eVar2 != null) {
                            eVar2.a(true);
                        }
                        coVar2.Ab = t1Var.getMessageObject() != null ? new hn(this, t1Var, i15) : null;
                        of.f.r(coVar2.getParentActivity(), Uri.parse(messageObject6.sponsoredUrl), true, false, false, coVar2.Ab, null, false, coVar2.getMessagesController().sponsoredLinksInappAllow, false);
                        return;
                    }
                    return;
                }
                if (messageObject6.isVideo()) {
                    coVar2.J9(messageObject6, true, false);
                }
            }
            if (messageObject6.getDuration() > 0.0d && messageObject6.getVideoStartsTimestamp() > 0 && !messageObject6.openedInViewer) {
                messageObject6.forceSeekTo = (float) (messageObject6.getVideoStartsTimestamp() / messageObject6.getDuration());
            }
            coVar2.ha(t1Var, messageObject6);
            return;
        }
        int i22 = messageObject6.type;
        if (i22 == 3) {
            coVar2.fb(messageObject6, true);
            try {
                String str3 = messageObject6.messageOwner.attachPath;
                File file4 = (str3 == null || str3.length() == 0) ? null : new File(messageObject6.messageOwner.attachPath);
                if (file4 == null || !file4.exists()) {
                    file4 = coVar2.getFileLoader().getPathToMessage(messageObject6.messageOwner);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setFlags(1);
                    intent.setDataAndType(FileProvider.d(coVar2.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", file4), "video/mp4");
                } else {
                    intent.setDataAndType(Uri.fromFile(file4), "video/mp4");
                }
                coVar2.getParentActivity().startActivityForResult(intent, 500);
                return;
            } catch (Exception e10) {
                FileLog.e(e10);
                coVar2.z6(messageObject6);
                return;
            }
        }
        if (i22 == 4) {
            if (AndroidUtilities.isMapsInstalled(coVar2)) {
                if (!messageObject6.isLiveLocation()) {
                    id0 id0Var = new id0(coVar2.h == null ? 3 : 0);
                    id0Var.F0 = coVar2;
                    id0Var.u0(messageObject6);
                    coVar2.presentFragment(id0Var);
                    return;
                }
                TLRPC.Chat chat2 = coVar2.e;
                id0 id0Var2 = new id0((chat2 == null || ChatObject.canSendMessages(chat2) || coVar2.e.megagroup) ? 2 : 6);
                id0Var2.F0 = coVar2;
                id0Var2.u0(messageObject6);
                coVar2.presentFragment(id0Var2);
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
                File pathToMessage2 = coVar2.getFileLoader().getPathToMessage(messageObject6.messageOwner);
                if (pathToMessage2.exists()) {
                    file = pathToMessage2;
                }
            }
            org.telegram.ui.ActionBar.i6 u10 = org.telegram.ui.ActionBar.j6.u(file, messageObject6.getDocumentName(), null, true);
            if (u10 != null) {
                coVar2.presentFragment(new wd1(u10));
                return;
            }
            coVar2.x4 = -1;
        }
        if (messageObject6.canPreviewDocument()) {
            PhotoViewer.t1().K2(null, coVar2, coVar2.ea);
            PhotoViewer t12 = PhotoViewer.t1();
            int i23 = messageObject6.type;
            long j11 = i23 != 0 ? coVar2.T5 : 0L;
            if (i23 != 0) {
                j10 = 0;
                j3 = coVar2.L6;
            } else {
                j3 = 0;
                j10 = 0;
            }
            if (i23 != 0) {
                j10 = coVar2.d();
            }
            messageObject = messageObject6;
            i11 = 3;
            t12.c2(messageObject, coVar2, j11, j3, j10, coVar2.Fa);
            i12 = 1;
        } else {
            messageObject = messageObject6;
            i11 = 3;
            i12 = 0;
        }
        Pattern pattern = org.telegram.ui.Components.r90.a;
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
            coVar = coVar2;
            messageObject2 = messageObject;
            if (i15 == 0) {
                try {
                    AndroidUtilities.openForView(messageObject2, coVar.getParentActivity(), coVar.ea, false);
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    coVar.z6(messageObject2);
                    return;
                }
            }
            return;
        }
        if (coVar2.getParentActivity() != null) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(coVar2.getParentActivity(), i11, coVar2.ea);
            b2Var.setCanceledOnTouchOutside(false);
            boolean[] zArr = {false};
            b2Var.setOnCancelListener(new hh(0, zArr));
            b2Var.q(150L);
            MessageObject messageObject7 = messageObject;
            org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(coVar2, messageObject7, b2Var, zArr, 8);
            messageObject2 = messageObject7;
            coVar = coVar2;
            new Thread(n5Var).start();
            if (i15 == 0) {
            }
        }
        coVar = coVar2;
        messageObject2 = messageObject;
        if (i15 == 0) {
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void u(org.telegram.ui.Cells.t1 t1Var) {
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
        co coVar = this.a;
        coVar.aa(coVar.e.id, messageObject, messageObject.getId(), j10, i10, 0, null);
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean u0(MessageObject messageObject) {
        return !this.a.s.containsKey(messageObject);
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean u1() {
        co coVar = this.a;
        return coVar.X0.getMeasuredWidth() > coVar.X0.getMeasuredHeight();
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
    public final void v0(org.telegram.ui.Cells.t1 t1Var) {
        rh.c cVar = this.a.Cc;
        if (cVar == null || cVar.n != t1Var) {
            return;
        }
        cVar.w.getClass();
    }

    @Override // org.telegram.ui.Cells.k1
    public final void v1(org.telegram.ui.Cells.t1 t1Var) {
        co.U4(this.a, t1Var);
    }

    @Override // org.telegram.ui.Cells.k1
    public final String w(long j3) {
        TLRPC.Peer peer;
        String adminRank;
        co coVar = this.a;
        if (UserObject.isBotForum(coVar.f)) {
            return null;
        }
        TLRPC.Chat chat = coVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat) && (adminRank = coVar.getMessagesController().getAdminRank(coVar.e.id, j3)) != null) {
            return adminRank;
        }
        TLRPC.TL_forumTopic tL_forumTopic = coVar.c4;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || !(peer.user_id == j3 || peer.channel_id == j3 || peer.chat_id == j3)) {
            return null;
        }
        return LocaleController.getString(R.string.TopicCreator);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void w0() {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        org.telegram.ui.Components.d6 animation;
        co coVar = this.a;
        if (coVar.l3 || SharedConfig.noSoundHintShowed || coVar.x0 == null || coVar.getParentActivity() == null || coVar.fragmentView == null) {
            return;
        }
        org.telegram.ui.Components.i40 i40Var = coVar.t2;
        if (i40Var == null || i40Var.getTag() == null) {
            if (coVar.t2 == null) {
                um umVar = coVar.X0;
                int indexOfChild = umVar.indexOfChild(coVar.S);
                if (indexOfChild == -1) {
                    return;
                }
                org.telegram.ui.Components.i40 i40Var2 = new org.telegram.ui.Components.i40(0, coVar.getParentActivity(), coVar.ea, false);
                coVar.t2 = i40Var2;
                i40Var2.setShowingDuration(10000L);
                umVar.addView(coVar.t2, indexOfChild + 1, w7.x5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                coVar.t2.setAlpha(0.0f);
                coVar.t2.setVisibility(4);
            }
            int childCount = coVar.x0.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coVar.x0.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject.isVideo() && (animation = t1Var.getPhotoImage().getAnimation()) != null && animation.o() >= 3000 && coVar.t2.e(t1Var, null, 0, 0, true)) {
                    SharedConfig.setNoSoundHintShowed(true);
                    return;
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void w1(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        k(t1Var, z10, false, false);
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
        co coVar = this.a;
        TLRPC.User user2 = coVar.f;
        if (user2 != null && user2.id == user.id) {
            i11 = 1;
        }
        profileActivity.N4(i11);
        Activity parentActivity = coVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
        AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
        coVar.presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void x0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        co coVar = this.a;
        if (coVar.getParentActivity() == null || tLObject == null) {
            return;
        }
        d5Var = ((org.telegram.ui.ActionBar.n2) coVar).parentLayout;
        if (d5Var != null) {
            d5Var2 = ((org.telegram.ui.ActionBar.n2) coVar).parentLayout;
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
            coVar.presentFragment(new co(bundle));
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, coVar.getParentActivity(), coVar.getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(coVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(coVar.getParentActivity(), false, false);
        f1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
        f1Var.setMinimumWidth(160);
        f1Var.setOnClickListener(new a(this, 14));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
        org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(coVar.getParentActivity(), false, false);
        f1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
        f1Var2.setMinimumWidth(160);
        f1Var2.setOnClickListener(new z(this, (TLRPC.Chat) tLObject, t1Var, 7));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var2);
        co coVar2 = new co(bundle);
        coVar2.J9 = true;
        coVar.presentFragmentAsPreviewWithMenu(coVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
        coVar.d7();
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
        this.a.A0.R(messageObject, false, false);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void y0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
        MessageObject messageObject = t1Var.getMessageObject();
        int i10 = messageObject.type;
        co coVar = this.a;
        if (i10 != 16) {
            coVar.I7(t1Var, true, false, f7, f10, messageObject.isMusic(), false, false);
            return;
        }
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        int i11 = 0;
        if (!(messageAction instanceof TLRPC.TL_messageActionConferenceCall)) {
            TLRPC.User user = coVar.f;
            if (user != null) {
                boolean isVideoCall = messageObject.isVideoCall();
                TLRPC.UserFull userFull = coVar.a8;
                org.telegram.ui.Components.voip.d2.m(user, isVideoCall, userFull != null && userFull.video_calls_available, coVar.getParentActivity(), coVar.getMessagesController().getUserFull(coVar.f.id), coVar.getAccountInstance());
                return;
            }
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(Long.valueOf(coVar.a()));
        ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
        int size = arrayList.size();
        while (i11 < size) {
            TLRPC.Peer peer = arrayList.get(i11);
            i11++;
            hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(peer)));
        }
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = messageObject.getId();
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(coVar.getParentActivity(), 3, null);
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = coVar.getMessagesController().conferenceCallSizeLimit;
        b2Var.setOnCancelListener(new ba(this, coVar.getConnectionsManager().sendRequest(getgroupcall, new di.kd(this, b2Var, hashSet, tL_inputGroupCallInviteMessage, messageObject, 4)), 1));
        b2Var.q(600L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.k1
    public final boolean z1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        x4 x4Var;
        rk rkVar;
        qk qkVar;
        if (!l()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(ChatObject.getPublicUsername(chat));
        co coVar = this.a;
        int i14 = (isEmpty || coVar.e == null || ((rkVar = coVar.O0) != null && rkVar.getVisibility() == 0) || ((qkVar = coVar.R) != null && qkVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat2 = coVar.e;
        int i15 = (chat2 == null || !(coVar.d4 == 0 || coVar.h4) || (ChatObject.isChannel(chat2) && !coVar.e.megagroup)) ? 0 : 1;
        TLRPC.Chat chat3 = coVar.e;
        int i16 = (chat3 == null || chat3.id != chat.id || coVar.F9()) ? 1 : 0;
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
        TLRPC.ChatFull chatFull = coVar.getMessagesController().getChatFull(chat.id);
        if (chatFull != null) {
            x4Var = x4.a(chat, chatFull, d5VarArr);
            z11 = i14;
            i13 = i15;
            i12 = i16;
            z10 = true;
        } else {
            i11 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
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
            com.google.firebase.messaging.m.k().v((ViewGroup) coVar.fragmentView, coVar.ea, x4Var, new b7(this, chat, t1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(coVar, t1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new cn(this, chat, 0), false);
        boolean z12 = chat.broadcast;
        H.l(z12 ? R.drawable.msg_channel : R.drawable.msg_discussion, LocaleController.getString(z12 ? R.string.OpenChannel2 : R.string.OpenGroup2), new r1(this, t1Var, chat, 26), i12);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new cn(this, chat, 1), z11);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new cn(this, chat, 2), i13);
        H.t = false;
        H.i = 3;
        H.W = true;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return true;
    }
}
