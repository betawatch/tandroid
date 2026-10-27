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
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.SecretMediaViewer;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class hn implements org.telegram.ui.Cells.j1 {
    public final /* synthetic */ wn a;

    public hn(wn wnVar) {
        this.a = wnVar;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void A0(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        messageObject.messageOwner.summarizedOpen = !r1.summarizedOpen;
        messageObject.updateTranslation(true);
        wn wnVar = this.a;
        wnVar.getMessagesStorage().updateMessageCustomParams(messageObject.getDialogId(), messageObject.messageOwner);
        wnVar.getMessagesController().getTranslateController().checkTranslation(messageObject, true);
        g(s1Var, true, false, true);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void A1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        vi viVar;
        int i10;
        MessageObject messageObject = s1Var.getMessageObject();
        ag.r0 r0Var = null;
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
                        TLRPC.TL_message L7 = wn.L7(message);
                        if (!TextUtils.isEmpty(tL_messageExtendedMedia.attachPath)) {
                            L7.attachPath = tL_messageExtendedMedia.attachPath;
                        } else if (tL_messageMediaPaidMedia.extended_media.size() == 1) {
                            L7.attachPath = message.attachPath;
                        }
                        L7.media = tL_messageExtendedMedia.media;
                        L7.noforwards = true;
                        arrayList.add(new MessageObject(messageObject.currentAccount, L7, false, true));
                    }
                }
                if (i11 <= -1 || arrayList.isEmpty()) {
                    return;
                }
                PhotoViewer v12 = PhotoViewer.v1();
                wn wnVar = this.a;
                v12.N2(null, wnVar, wnVar.ua);
                PhotoViewer.v1().e2(arrayList, i11, this.a.a(), 0L, 0L, this.a.Xa);
                return;
            }
            return;
        }
        wn wnVar2 = this.a;
        qf.c cVar = wnVar2.ac;
        if (cVar != null) {
            cVar.a(true);
            wnVar2.ac = null;
        }
        if (s1Var.getMessageObject() == null) {
            wnVar2.ac = null;
            viVar = null;
        } else {
            viVar = new vi(wnVar2, s1Var.getMessageObject().getId(), s1Var, 1);
            wnVar2.ac = viVar;
        }
        i10 = ((org.telegram.ui.ActionBar.r2) this.a).currentAccount;
        bi.ca y3 = bi.ca.y(i10, false);
        Objects.requireNonNull(viVar);
        xi xiVar = new xi(viVar, 8);
        Context context = LaunchActivity.I1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        org.telegram.ui.ActionBar.u6 I = bi.ca.I();
        if (messageObject != null && context != null) {
            long dialogId = messageObject.getDialogId();
            int id2 = messageObject.getId();
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = MessagesController.getInstance(y3.a).getInputPeer(dialogId);
            tL_inputInvoiceMessage.msg_id = id2;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject q5 = hi.m3.q(I, false);
            if (q5 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = q5.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
            r0Var = new ag.r0(y3, ConnectionsManager.getInstance(y3.a).sendRequest(tL_payments_getPaymentForm, new bi.i2(y3, messageObject, tL_inputInvoiceMessage, xiVar, 3)), 3);
        }
        if (r0Var != null) {
            viVar.b = r0Var;
            viVar.d();
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void B1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10;
        int i11;
        ImageLocation forDocument;
        String str2;
        boolean isEmpty = TextUtils.isEmpty(str);
        wn wnVar = this.a;
        if (!isEmpty) {
            qf.d.r(wnVar.getParentActivity(), "https://" + wnVar.getMessagesController().linkPrefix + "/nft/" + str);
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
        tg.m1 m1Var = new tg.m1(wnVar, i10, user, null, null, wnVar.ua);
        s1Var.getLocationOnScreen(new int[2]);
        m1Var.v0 = s1Var.getNameStatusX();
        m1Var.w0 = s1Var.getNameStatusY();
        m1Var.z0 = s1Var.getScaleX();
        m1Var.x0 = s1Var.getLeft();
        m1Var.y0 = s1Var.getTop();
        m1Var.A0 = s1Var;
        int colorId = UserObject.getColorId(user);
        if (colorId < 7) {
            m1Var.u0 = Integer.valueOf(wnVar.getThemedColor(org.telegram.ui.ActionBar.y6.r8[colorId]));
        } else {
            i11 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
            MessagesController.PeerColors peerColors = MessagesController.getInstance(i11).peerColors;
            MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(colorId) : null;
            m1Var.u0 = color != null ? Integer.valueOf(color.getColor1()) : null;
        }
        org.telegram.ui.Components.r5 r5Var = s1Var.fc;
        if (r5Var != null && (r5Var.f[0] instanceof org.telegram.ui.Components.t5)) {
            m1Var.z0 *= 0.95f;
            if (document != null) {
                org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(wnVar.getParentActivity());
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.y6.m6, 0.2f);
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
                y9Var.setLayerNum(7);
                y9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                y9Var.l(imageLocation, str3, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "140_140", svgThumb, document);
                if (MessageObject.isTextColorEmoji(document)) {
                    Integer num = m1Var.u0;
                    y9Var.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : wnVar.getThemedColor(org.telegram.ui.ActionBar.y6.v6), PorterDuff.Mode.SRC_IN));
                    m1Var.C0 = MessageObject.getInputStickerSet(document);
                } else {
                    m1Var.C0 = MessageObject.getInputStickerSet(document);
                }
                m1Var.B0 = y9Var;
                m1Var.E0 = true;
            }
        }
        wnVar.showDialog(m1Var);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void C(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        TLRPC.Message message;
        int i10;
        int i11;
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        int i12 = buttonCustom.id;
        wn wnVar = this.a;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    wnVar.R7(s1Var, true, false, s1Var.getLastTouchX(), s1Var.getLastTouchY(), true, false, true);
                    return;
                } else {
                    if (i12 == 4) {
                        wnVar.d2.n(messageObject.getTopicId(), true);
                        return;
                    }
                    return;
                }
            }
            if (message.suggested_post != null) {
                i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, wnVar.e);
                if (canManageMonoForum) {
                    i11 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                    ChatObject.canUserDoChannelDirectAdminAction(i11, wnVar.e, 5);
                }
                bi.s9 s9Var = new bi.s9(this, message, canManageMonoForum, messageObject, 12);
                TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                wnVar.p7(s9Var, bg.a.l(suggestedPost != null ? suggestedPost.price : null), !canManageMonoForum);
                return;
            }
            return;
        }
        long peerDialogId = DialogObject.getPeerDialogId(message.from_id);
        li.s2 s2Var = new li.s2(21, this, message);
        Pattern pattern = org.telegram.ui.Components.g5.a;
        Activity parentActivity = wnVar.getParentActivity();
        int i13 = 0;
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(parentActivity, 0, null);
        String string = LocaleController.getString(R.string.SuggestedMessageDecline);
        org.telegram.ui.ActionBar.e2 e2Var = h2Var.a;
        e2Var.R = string;
        e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageDeclineInfo, MessagesController.getInstance(UserConfig.selectedAccount).getPeerName(peerDialogId)));
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        frameLayout.setClipChildren(false);
        EditText editText = new EditText(parentActivity);
        org.telegram.ui.ActionBar.f7.V(editText, org.telegram.ui.ActionBar.y6.G6, null);
        editText.setHint(LocaleController.getString(R.string.SuggestedMessageDeclineReasonHint));
        org.telegram.ui.ActionBar.f7.E(editText, org.telegram.ui.ActionBar.y6.H6, null);
        editText.setTextSize(1, 16.0f);
        editText.setBackground(org.telegram.ui.ActionBar.y6.T(parentActivity));
        editText.setMaxLines(4);
        editText.setRawInputType(147457);
        editText.setImeOptions(6);
        editText.setFilters(new InputFilter[]{new org.telegram.ui.Components.u4(parentActivity)});
        editText.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0, AndroidUtilities.dp(8.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f));
        editText.setSelection(editText.getText().toString().length());
        h2Var.o(frameLayout);
        h2Var.k(LocaleController.getString(R.string.Decline), new org.telegram.ui.Components.p1(i13, s2Var, editText));
        h2Var.h(LocaleController.getString(R.string.Cancel), null);
        e2Var.N = new org.telegram.ui.Components.q1(editText, i13);
        frameLayout.addView(editText, org.telegram.ui.Components.kb1.h(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
        editText.requestFocus();
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.pg(editText, 4), 100L);
        wnVar.showDialog(e2Var);
        TextView textView = (TextView) e2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean C0(long j10) {
        wn wnVar = this.a;
        TLRPC.Chat chat = wnVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return false;
        }
        return wnVar.getMessagesController().isOwner(wnVar.e.id, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:244:0x0870  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x09b0 A[LOOP:3: B:254:0x09ae->B:255:0x09b0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0a18  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0a30  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0ab4  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x094e  */
    @Override // org.telegram.ui.Cells.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C1(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        zv0 zv0Var;
        TLRPC.PollAnswer pollAnswer2;
        zv0 zv0Var2;
        vv0 vv0Var;
        ch.b bVar;
        MessageObject messageObject;
        TLRPC.ChatFull chatFull;
        boolean z10;
        boolean z11;
        zv0 zv0Var3;
        MessageObject messageObject2;
        org.telegram.ui.Components.l80 l80Var;
        wn wnVar;
        boolean z12;
        ye yeVar;
        MessageObject messageObject3;
        int size;
        int i10;
        ViewGroup viewGroup;
        zv0 zv0Var4;
        boolean z13;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        boolean z14;
        byte[] bArr;
        vv0 vv0Var2;
        TLRPC.PollAnswerVoters pollAnswerVoters;
        boolean z15;
        zv0 zv0Var5;
        ArrayList arrayList;
        byte[] bArr2;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll2;
        TLRPC.PollAnswer pollAnswer3;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll3;
        boolean z16;
        sh.q qVar;
        boolean z17;
        ArrayList<TLRPC.PollAnswerVoters> arrayList2;
        wn wnVar2 = this.a;
        if (wnVar2.getParentActivity() != null && wnVar2.getParentActivity() != null) {
            fi.v3 v3Var = wnVar2.J1;
            if (v3Var != null && v3Var.V) {
                v3Var.e(true);
            }
            tl tlVar = wnVar2.N1;
            if (tlVar != null && tlVar.V) {
                tlVar.e(true);
            }
            MessageObject primaryMessageObject = s1Var.getPrimaryMessageObject();
            TLRPC.MessageMedia media = MessageObject.getMedia(primaryMessageObject);
            if (primaryMessageObject != null && (media instanceof TLRPC.TL_messageMediaPoll)) {
                wnVar2.t5 = primaryMessageObject;
                wnVar2.u5 = null;
                zv0 zv0Var6 = new zv0(wnVar2.getParentActivity(), wnVar2.getResourceProvider());
                byte[] bArr3 = pollAnswer.option;
                zv0Var6.L = s1Var;
                zv0Var6.P = bArr3;
                MessageObject messageObject4 = s1Var.getMessageObject();
                zv0Var6.H = messageObject4;
                zv0Var6.I = messageObject4 != null && messageObject4.isOutOwner();
                org.telegram.ui.Cells.s1 s1Var2 = zv0Var6.L;
                vv0 vv0Var3 = zv0Var6.d;
                if (s1Var2 != null) {
                    zv0Var6.M = wnVar2.I9 - AndroidUtilities.dp(4.0f);
                    zv0Var6.N = s1Var.n;
                    if (s1Var.getParent() instanceof View) {
                        View view = (View) s1Var.getParent();
                        zv0Var6.M = view.getY() + zv0Var6.M;
                        zv0Var6.N = view.getY() + zv0Var6.N;
                    }
                    int width = zv0Var6.L.getWidth();
                    int height = zv0Var6.L.getHeight();
                    zv0Var6.L.getHeight();
                    xv0 xv0Var = new xv0(zv0Var6, zv0Var6.getContext(), UserConfig.selectedAccount, zv0Var6.L.getResourcesProvider(), bArr3, width, height);
                    zv0Var = zv0Var6;
                    zv0Var.J = xv0Var;
                    zv0Var.L.h1(xv0Var);
                    zv0Var.J.i1(zv0Var.L);
                    zv0Var.J.setDelegate(new tb.a(16));
                    xv0 xv0Var2 = zv0Var.J;
                    MessageObject messageObject5 = zv0Var.H;
                    MessageObject.GroupedMessages currentMessagesGroup = zv0Var.L.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.s1 s1Var3 = zv0Var.L;
                    xv0Var2.Z3(messageObject5, currentMessagesGroup, s1Var3.F, s1Var3.E, s1Var3.G, false);
                    xv0 xv0Var3 = zv0Var.J;
                    xv0Var3.M7 = bArr3;
                    vv0Var3.addView(xv0Var3, new FrameLayout.LayoutParams(zv0Var.L.getWidth(), height, 51));
                    yv0 yv0Var = new yv0(zv0Var.getContext(), UserConfig.selectedAccount, zv0Var.L.getResourcesProvider(), width, height, 0);
                    zv0Var.K = yv0Var;
                    zv0Var.L.j1(yv0Var);
                    zv0Var.L.h1(zv0Var.K);
                    zv0Var.K.i1(zv0Var.L);
                    zv0Var.K.setDelegate(new sb.b(16));
                    yv0 yv0Var2 = zv0Var.K;
                    MessageObject messageObject6 = zv0Var.H;
                    MessageObject.GroupedMessages currentMessagesGroup2 = zv0Var.L.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.s1 s1Var4 = zv0Var.L;
                    yv0Var2.Z3(messageObject6, currentMessagesGroup2, s1Var4.F, s1Var4.E, s1Var4.G, false);
                    vv0Var3.addView(zv0Var.K, new FrameLayout.LayoutParams(zv0Var.L.getWidth(), height, 51));
                } else {
                    zv0Var = zv0Var6;
                }
                fi.h1 h1Var = zv0Var.f;
                h1Var.bringToFront();
                vv0 vv0Var4 = zv0Var.e;
                vv0Var4.bringToFront();
                zv0Var.n.bringToFront();
                h1Var.w(false);
                Context context = zv0Var.a;
                View view2 = new View(context);
                org.telegram.ui.ActionBar.u6 u6Var = zv0Var.b;
                org.telegram.ui.Components.l80 G = org.telegram.ui.Components.l80.G(vv0Var3, u6Var, view2, true);
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll4 = (TLRPC.TL_messageMediaPoll) MessageObject.getMedia(zv0Var.H);
                zv0Var.V = MessageObject.isVoted(tL_messageMediaPoll4);
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
                ch.b bVar2 = zv0Var.G;
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
                        vv0Var2 = vv0Var3;
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
                            vv0 vv0Var5 = vv0Var3;
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
                                vv0Var3 = vv0Var5;
                                i12 = i13;
                                bArr3 = bArr4;
                                tL_messageMediaPoll4 = tL_messageMediaPoll5;
                            } else {
                                vv0Var3 = vv0Var5;
                                i12 = i13;
                                bArr3 = bArr4;
                            }
                        }
                        tL_messageMediaPoll = tL_messageMediaPoll4;
                        bArr = bArr3;
                        vv0Var2 = vv0Var3;
                        pollAnswerVoters = pollAnswerVoters2;
                    }
                    if (pollAnswerVoters == null || pollAnswerVoters.voters <= 0 || !MessageObject.canShowVotersList(tL_messageMediaPoll)) {
                        zv0Var5 = zv0Var;
                        arrayList = arrayList3;
                        messageObject = primaryMessageObject;
                        vv0Var = vv0Var2;
                        bArr2 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                    } else {
                        sh.q qVar2 = new sh.q(context, wnVar2.getCurrentAccount(), u6Var);
                        org.telegram.ui.Components.l80 J = G.J();
                        J.T(org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, u6Var)));
                        fh.a k10 = gh.c.k(u6Var);
                        View view3 = J.B;
                        if (view3 != null) {
                            qVar = qVar2;
                            z17 = false;
                            eh.d c10 = bVar2.c(view3, null, false);
                            c10.v(k10);
                            view3.setBackground(c10);
                        } else {
                            qVar = qVar2;
                            z17 = false;
                        }
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new bu0(G, 26), z17);
                        J.k();
                        long dialogId = zv0Var.H.getDialogId();
                        int id2 = zv0Var.H.getId();
                        int i17 = pollAnswerVoters.voters;
                        org.telegram.ui.Components.oy oyVar = new org.telegram.ui.Components.oy(19, zv0Var, wnVar2);
                        zv0Var5 = zv0Var;
                        messageObject = primaryMessageObject;
                        arrayList = arrayList3;
                        vv0Var = vv0Var2;
                        byte[] bArr5 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                        sh.q qVar3 = qVar;
                        View a2 = qVar3.a(wnVar2, dialogId, id2, bArr5, i17, oyVar);
                        wnVar2 = wnVar2;
                        bArr2 = bArr5;
                        J.q(a2);
                        qVar3.setMinimumHeight(AndroidUtilities.dp(48.0f));
                        qVar3.setText(LocaleController.formatPluralString("PollVotesCount", pollAnswerVoters.voters, new Object[0]));
                        qVar3.a.d(pollAnswerVoters.recent_voters, false);
                        qVar3.setLayoutParams(org.telegram.ui.Components.kb1.r(-1, 48));
                        int i18 = org.telegram.ui.ActionBar.y6.I5;
                        org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.x0(null, i18, false), 12, 0);
                        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i18);
                        qVar3.setBackground(Z);
                        org.telegram.ui.ActionBar.f7.k(qVar3, Z, null, N, null);
                        qVar3.setOnClickListener(new zd0(8, G, J));
                        G.q(qVar3);
                        G.k();
                    }
                    if (!z18) {
                        zv0Var2 = zv0Var5;
                        pollAnswer3 = pollAnswer2;
                    } else if (z15) {
                        int i19 = R.drawable.msg_unvote;
                        CharSequence string = LocaleController.getString(R.string.Unvote);
                        zv0Var2 = zv0Var5;
                        wn wnVar3 = wnVar2;
                        TLRPC.PollAnswer pollAnswer6 = pollAnswer2;
                        Runnable rv0Var = new rv0(zv0Var2, z14, wnVar3, arrayList, pollAnswer6);
                        wnVar2 = wnVar3;
                        pollAnswer3 = pollAnswer6;
                        G.c(i19, string, rv0Var, false);
                    } else {
                        zv0Var2 = zv0Var5;
                        pollAnswer3 = pollAnswer2;
                        ArrayList arrayList6 = arrayList;
                        if (sh.i.a(zv0Var2.H) == 0) {
                            G.c(R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), new rv0(zv0Var2, z14, pollAnswer3, wnVar2, arrayList6), false);
                        }
                    }
                    if (wnVar2.L6()) {
                        G.c(R.drawable.menu_reply, LocaleController.getString(R.string.PollItemQuote), new ne0(zv0Var2, wnVar2, pollAnswer3, 25), false);
                    }
                    if (zv0Var2.H.getDialogId() >= 0 || pollAnswer3.option == null) {
                        tL_messageMediaPoll3 = tL_messageMediaPoll2;
                        z16 = false;
                    } else {
                        MessagesController messagesController = MessagesController.getInstance(zv0Var2.H.currentAccount);
                        tL_messageMediaPoll3 = tL_messageMediaPoll2;
                        String publicUsername = DialogObject.getPublicUsername(messagesController.getUserOrChat(zv0Var2.H.getDialogId()));
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(messagesController.linkPrefix);
                        sb2.append("/");
                        if (TextUtils.isEmpty(publicUsername)) {
                            publicUsername = "c/" + (-zv0Var2.H.getDialogId());
                        }
                        sb2.append(publicUsername);
                        sb2.append("/");
                        sb2.append(zv0Var2.H.getId());
                        sb2.append("?option=");
                        sb2.append(new String(Base64.encode(pollAnswer3.option, 9)));
                        z16 = false;
                        G.c(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new am0(19, zv0Var2, sb2.toString()), false);
                    }
                    G.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new am0(20, zv0Var2, pollAnswer3), z16);
                    TLRPC.Peer peer = pollAnswer3.added_by;
                    if (peer != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        long clientUserId = UserConfig.getInstance(zv0Var2.H.currentAccount).getClientUserId();
                        bVar = bVar2;
                        long currentTime = ConnectionsManager.getInstance(zv0Var2.H.currentAccount).getCurrentTime();
                        wn wnVar4 = wnVar2;
                        long j10 = MessagesController.getInstance(zv0Var2.H.currentAccount).config.pollAnswerDeletePeriod.get(TimeUnit.SECONDS) + pollAnswer3.date;
                        if (!zv0Var2.H.isForwarded()) {
                            TLRPC.Poll poll2 = tL_messageMediaPoll3.poll;
                            if (!poll2.closed && (poll2.creator || (peerDialogId == clientUserId && currentTime < j10))) {
                                G.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new am0(21, zv0Var2, bArr2), true);
                            }
                        }
                        G.k();
                        TLObject userOrChat = MessagesController.getInstance(zv0Var2.H.currentAccount).getUserOrChat(peerDialogId);
                        CharSequence replaceTags = AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.PollAddedByAtTime, DialogObject.getShortName(userOrChat), LocaleController.formatDateTime(pollAnswer3.date, true)));
                        wnVar2 = wnVar4;
                        dc0 dc0Var = new dc0(zv0Var2, peerDialogId, wnVar2, 1);
                        Context context2 = G.e;
                        FrameLayout frameLayout = new FrameLayout(context2);
                        int i20 = org.telegram.ui.ActionBar.y6.i6;
                        org.telegram.ui.ActionBar.u6 u6Var2 = G.d;
                        org.telegram.ui.Cells.y Z2 = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.w0(i20, u6Var2), 0, 12);
                        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i20);
                        frameLayout.setBackground(Z2);
                        org.telegram.ui.ActionBar.f7.k(frameLayout, Z2, null, N2, u6Var2);
                        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context2);
                        y9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
                        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
                        j9Var.p(userOrChat);
                        y9Var.f(userOrChat, j9Var);
                        frameLayout.addView(y9Var, org.telegram.ui.Components.kb1.h(34, 34.0f, 51, 13.0f, 11.0f, 0.0f, 11.0f));
                        TextView textView = new TextView(context2);
                        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.j5, u6Var2);
                        textView.setTextSize(1, 14.0f);
                        textView.setText(replaceTags);
                        textView.setMaxWidth(AndroidUtilities.dp(150.0f));
                        textView.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                        frameLayout.addView(textView, org.telegram.ui.Components.kb1.h(-2, -2.0f, 55, 59.0f, 8.0f, 16.0f, 0.0f));
                        frameLayout.setOnClickListener(new org.telegram.ui.Components.ga(19, G, dc0Var));
                        G.r(frameLayout, org.telegram.ui.Components.kb1.r(-1, -2));
                    } else {
                        bVar = bVar2;
                    }
                } else {
                    zv0Var2 = zv0Var;
                    vv0Var = vv0Var3;
                    bVar = bVar2;
                    messageObject = primaryMessageObject;
                }
                G.T(org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, u6Var)));
                G.Q(bVar, gh.c.k(u6Var), false);
                G.Y();
                ViewGroup viewGroup2 = G.A;
                zv0Var2.R = viewGroup2;
                viewGroup2.setPivotX(0.0f);
                zv0Var2.R.setPivotY(0.0f);
                vv0Var4.addView(zv0Var2.R, org.telegram.ui.Components.kb1.i(-2, -2, 51));
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                wnVar2.x8(messageObject, arrayList7, arrayList8, arrayList9);
                ye yeVar2 = new ye(wnVar2, 9);
                MessageObject messageObject7 = zv0Var2.H;
                List<TLRPC.TL_availableReaction> enabledReactionsList = wnVar2.getMediaDataController().getEnabledReactionsList();
                boolean z20 = (wnVar2.w() || wnVar2.c() || wnVar2.f != null || !messageObject7.hasReactions() || (ChatObject.isChannel(wnVar2.e) && !wnVar2.e.megagroup) || ChatObject.isMonoForum(wnVar2.e) || enabledReactionsList.isEmpty() || !messageObject7.messageOwner.reactions.can_see_list || messageObject7.isSecretMedia()) ? false : true;
                boolean z21 = !messageObject7.isForwardedChannelPost() ? messageObject7.isSecretMedia() || wnVar2.d4 == 5 || wnVar2.w() || wnVar2.c() || !messageObject7.isReactionsAvailable() || ((((chatFull = wnVar2.p8) == null || ((chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull.paid_reactions_available)) && ((chatFull != null || ChatObject.isChannel(wnVar2.e)) && wnVar2.f == null && !ChatObject.isMonoForum(wnVar2.e))) || enabledReactionsList.isEmpty()) : (chatFull3 = wnVar2.getMessagesController().getChatFull(-messageObject7.getFromChatId())) != null && (wnVar2.w() || wnVar2.d4 == 5 || wnVar2.c() || !messageObject7.isReactionsAvailable() || (((chatFull3.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull3.paid_reactions_available) || enabledReactionsList.isEmpty()));
                boolean z22 = (z20 || wnVar2.c() || wnVar2.e == null || !messageObject7.isOutOwner() || !messageObject7.isSent() || messageObject7.isEditing() || messageObject7.isSending() || messageObject7.isSendError() || messageObject7.isContentUnread() || messageObject7.isUnread() || ConnectionsManager.getInstance(wnVar2.getCurrentAccount()).getCurrentTime() - messageObject7.messageOwner.date >= wnVar2.getMessagesController().chatReadMarkExpirePeriod || (!ChatObject.isMegagroup(wnVar2.e) && ChatObject.isChannel(wnVar2.e)) || (chatFull2 = wnVar2.p8) == null || chatFull2.participants_count > wnVar2.getMessagesController().chatReadMarkSizeThreshold || (messageObject7.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || wnVar2.d4 == 3 || !messageObject7.canSetReaction() || ChatObject.isMonoForum(wnVar2.e)) ? false : true;
                if (wnVar2.e != null && !messageObject7.isOut() && ChatObject.isMonoForum(wnVar2.e) && ChatObject.canManageMonoForum(wnVar2.getCurrentAccount(), wnVar2.e)) {
                    int i21 = ((-wnVar2.e.linked_monoforum_id) > messageObject7.getFromChatId() ? 1 : ((-wnVar2.e.linked_monoforum_id) == messageObject7.getFromChatId() ? 0 : -1));
                }
                if (!z20 && wnVar2.e == null && wnVar2.h == null && (user = wnVar2.f) != null && !UserObject.isUserSelf(user) && !UserObject.isReplyUser(wnVar2.f) && !UserObject.isAnonymous(wnVar2.f)) {
                    TLRPC.User user2 = wnVar2.f;
                    if (!user2.bot && !UserObject.isService(user2.id) && (((userFull = wnVar2.q8) == null || !userFull.read_dates_private) && !wnVar2.c() && messageObject7.isOutOwner() && messageObject7.isSent() && !messageObject7.isEditing() && !messageObject7.isSending() && !messageObject7.isSendError() && !messageObject7.isContentUnread() && !messageObject7.isUnread() && wnVar2.getConnectionsManager().getCurrentTime() - messageObject7.messageOwner.date < wnVar2.getMessagesController().pmReadDateExpirePeriod && !(messageObject7.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                        z10 = true;
                        TLRPC.User user3 = wnVar2.f;
                        boolean z23 = ((user3 == null && (UserObject.isReplyUser(user3) || UserObject.isAnonymous(wnVar2.f))) || wnVar2.c() || !messageObject7.isEdited() || (messageObject7.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                        z11 = z22;
                        org.telegram.ui.Components.l80 G2 = org.telegram.ui.Components.l80.G(vv0Var, wnVar2.getResourceProvider(), null, !z20 || z22);
                        if (z11) {
                            zv0Var3 = zv0Var2;
                            messageObject2 = messageObject7;
                            l80Var = G2;
                            wnVar = wnVar2;
                            z12 = z21;
                            yeVar = yeVar2;
                            if (z10) {
                                l80Var.r(new org.telegram.ui.Components.sc0(zv0Var3.getContext(), 0, messageObject2, new pv0(zv0Var3, 1), zv0Var3.b), org.telegram.ui.Components.kb1.r(-1, 36));
                                l80Var.k();
                            } else if (z23) {
                                messageObject3 = messageObject2;
                                l80Var.r(new org.telegram.ui.Components.sc0(zv0Var3.getContext(), 1, messageObject2, new pv0(zv0Var3, 2), zv0Var3.b), org.telegram.ui.Components.kb1.r(-1, 36));
                                l80Var.k();
                                size = arrayList7.size();
                                i10 = 0;
                                while (i10 < size) {
                                    l80Var.c(((Integer) arrayList7.get(i10)).intValue(), (CharSequence) arrayList8.get(i10), new fx(zv0Var3, yeVar, ((Integer) arrayList9.get(i10)).intValue(), 9), false);
                                    i10++;
                                    arrayList7 = arrayList7;
                                }
                                l80Var.T(org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, u6Var)));
                                l80Var.Q(bVar, gh.c.k(u6Var), false);
                                l80Var.Y();
                                ViewGroup viewGroup3 = l80Var.A;
                                zv0Var3.T = viewGroup3;
                                viewGroup3.setPivotX(0.0f);
                                zv0Var3.T.setPivotY(0.0f);
                                vv0Var4.addView(zv0Var3.T, org.telegram.ui.Components.kb1.i(-2, -2, 51));
                                viewGroup = zv0Var3.T;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new jl0(zv0Var3, 7));
                                    zv0Var3.T.setOnTouchListener(new d0(zv0Var3, 5));
                                }
                                if (z12) {
                                    zv0Var4 = zv0Var3;
                                    wn wnVar5 = wnVar;
                                    org.telegram.ui.Components.gl0 gl0Var = new org.telegram.ui.Components.gl0((wnVar.getUserConfig().getClientUserId() > wnVar.a() ? 1 : (wnVar.getUserConfig().getClientUserId() == wnVar.a() ? 0 : -1)) == 0 ? 3 : 0, wnVar.getCurrentAccount(), zv0Var3.getContext(), wnVar5, zv0Var3.b);
                                    gl0Var.a = true;
                                    float f7 = 22;
                                    gl0Var.setPadding(AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : 24), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 24 : 0), AndroidUtilities.dp(f7));
                                    gl0Var.setDelegate(new uv0(zv0Var4, wnVar5, messageObject3, gl0Var));
                                    zv0Var4.Q = gl0Var;
                                    vv0Var4.addView(gl0Var, org.telegram.ui.Components.kb1.i(-2, (int) ((gl0Var.getTopOffset() / AndroidUtilities.density) + 52.0f + f7), 51));
                                    z13 = true;
                                    gl0Var.p(messageObject3, wnVar5.p8, true);
                                    zv0Var4.Q.setTransitionProgress(1.0f);
                                } else {
                                    zv0Var4 = zv0Var3;
                                    z13 = true;
                                }
                                zv0Var4.e();
                                zv0Var4.e0 = new sm(this, 0);
                                zv0Var4.show();
                                return z13;
                            }
                        } else {
                            th0 th0Var = new th0(zv0Var2.getContext(), wnVar2.getCurrentAccount(), messageObject7, wnVar2.e);
                            FrameLayout frameLayout2 = new FrameLayout(zv0Var2.getContext());
                            frameLayout2.addView(th0Var, org.telegram.ui.Components.kb1.g(36.0f, -1));
                            org.telegram.ui.Components.l80 J2 = G2.J();
                            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, zv0Var2.getContext(), zv0Var2.b, true, false);
                            g1Var.setItemHeight(44);
                            zv0 zv0Var7 = zv0Var2;
                            g1Var.j(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                            messageObject2 = messageObject7;
                            g1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                            FrameLayout frameLayout3 = new FrameLayout(zv0Var7.getContext());
                            LinearLayout linearLayout = new LinearLayout(zv0Var7.getContext());
                            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.G8, linearLayout, u6Var);
                            linearLayout.setOrientation(1);
                            wn wnVar6 = wnVar2;
                            org.telegram.ui.Components.nm0 a10 = th0Var.a();
                            frameLayout3.addView(g1Var);
                            linearLayout.addView(frameLayout3);
                            z12 = z21;
                            linearLayout.addView(new org.telegram.ui.ActionBar.l1(zv0Var7.getContext(), u6Var), org.telegram.ui.Components.kb1.r(-1, 8));
                            frameLayout3.setOnClickListener(new sv0(G2));
                            yeVar = yeVar2;
                            tv0 tv0Var = new tv0(zv0Var7, th0Var, wnVar6, a10, linearLayout, G2, J2);
                            wnVar = wnVar6;
                            zv0Var3 = zv0Var7;
                            l80Var = G2;
                            th0Var.setOnClickListener(tv0Var);
                            linearLayout.addView(a10, org.telegram.ui.Components.kb1.r(-1, -2));
                            J2.q(linearLayout);
                            l80Var.q(frameLayout2);
                            l80Var.k();
                        }
                        messageObject3 = messageObject2;
                        size = arrayList7.size();
                        i10 = 0;
                        while (i10 < size) {
                        }
                        l80Var.T(org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, u6Var)));
                        l80Var.Q(bVar, gh.c.k(u6Var), false);
                        l80Var.Y();
                        ViewGroup viewGroup32 = l80Var.A;
                        zv0Var3.T = viewGroup32;
                        viewGroup32.setPivotX(0.0f);
                        zv0Var3.T.setPivotY(0.0f);
                        vv0Var4.addView(zv0Var3.T, org.telegram.ui.Components.kb1.i(-2, -2, 51));
                        viewGroup = zv0Var3.T;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z12) {
                        }
                        zv0Var4.e();
                        zv0Var4.e0 = new sm(this, 0);
                        zv0Var4.show();
                        return z13;
                    }
                }
                z10 = false;
                TLRPC.User user32 = wnVar2.f;
                if (user32 == null) {
                }
                z11 = z22;
                org.telegram.ui.Components.l80 G22 = org.telegram.ui.Components.l80.G(vv0Var, wnVar2.getResourceProvider(), null, !z20 || z22);
                if (z11) {
                }
                messageObject3 = messageObject2;
                size = arrayList7.size();
                i10 = 0;
                while (i10 < size) {
                }
                l80Var.T(org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, u6Var)));
                l80Var.Q(bVar, gh.c.k(u6Var), false);
                l80Var.Y();
                ViewGroup viewGroup322 = l80Var.A;
                zv0Var3.T = viewGroup322;
                viewGroup322.setPivotX(0.0f);
                zv0Var3.T.setPivotY(0.0f);
                vv0Var4.addView(zv0Var3.T, org.telegram.ui.Components.kb1.i(-2, -2, 51));
                viewGroup = zv0Var3.T;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z12) {
                }
                zv0Var4.e();
                zv0Var4.e0 = new sm(this, 0);
                zv0Var4.show();
                return z13;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void D(org.telegram.ui.Cells.s1 s1Var) {
        wn wnVar = this.a;
        wnVar.Na.k(s1Var, wnVar, true);
        wnVar.x0.I0(false);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void D0(org.telegram.ui.Cells.s1 s1Var) {
        int i10;
        a3.i0 i0Var;
        MessageObject.GroupedMessages groupedMessages;
        int i11;
        wn wnVar = this.a;
        wh.i iVar = wnVar.na;
        if (iVar == null) {
            return;
        }
        HashMap hashMap = iVar.a;
        wh.h hVar = (wh.h) hashMap.get(wh.i.b(s1Var));
        org.telegram.ui.Components.qc qcVar = null;
        MessageObject messageObject = hVar != null ? hVar.E : null;
        wh.h hVar2 = (wh.h) wnVar.na.a.get(wh.i.b(s1Var));
        long j10 = (hVar2 == null || (i11 = hVar2.R) == -1) ? 0L : hVar2.w[i11].d;
        if (messageObject != null && j10 != 0) {
            Activity parentActivity = wnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
            if (!org.telegram.ui.Components.g5.h(parentActivity, i10, j10, false)) {
                ArrayList<MessageObject> arrayList = (messageObject.getGroupId() == 0 || (groupedMessages = (MessageObject.GroupedMessages) wnVar.N6.f(messageObject.getGroupId())) == null) ? null : groupedMessages.messages;
                if (arrayList == null) {
                    arrayList = org.telegram.messenger.t.l(messageObject);
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
                qcVar = org.telegram.ui.Components.wc.v(wnVar.getParentActivity(), wnVar, null, 1, j11, 1, wnVar.getThemedColor(org.telegram.ui.ActionBar.y6.Fi), wnVar.getThemedColor(org.telegram.ui.ActionBar.y6.Hi), 5000, false, i0Var);
                qcVar.k = true;
                qcVar.k(qcVar.e instanceof org.telegram.ui.Components.bc);
            }
        }
        wh.h hVar3 = (wh.h) hashMap.get(wh.i.b(s1Var));
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
            viewTreeObserver.addOnPreDrawListener(new bm(2, hVar3, viewTreeObserver));
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void E0(int i10, org.telegram.ui.Cells.s1 s1Var) {
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
        wn wnVar = this.a;
        if (i10 == 19) {
            qf.c cVar = wnVar.ac;
            if (cVar != null) {
                cVar.a(true);
            }
            final an anVar = s1Var.getMessageObject() != null ? new an(this, s1Var, 2) : null;
            wnVar.ac = anVar;
            final Activity parentActivity = wnVar.getParentActivity();
            final org.telegram.ui.ActionBar.u6 resourceProvider = wnVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            anVar.d();
            anVar.b = new vg.e(atomicBoolean, 0);
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
            final String b11 = vg.j.b(messageObject);
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
            final boolean z10 = chat != null && ChatObject.isChannelAndNotMegaGroup(chat);
            final long j10 = messageObject.messageOwner.date * 1000;
            vg.s.d(messageObject, new Utilities.Callback(atomicBoolean, anVar, z10, b11, j10, tL_messageMediaGiveaway2, parentActivity, resourceProvider) { // from class: vg.f
                public final /* synthetic */ AtomicBoolean a;
                public final /* synthetic */ qf.c b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ String d;
                public final /* synthetic */ TLRPC.TL_messageMediaGiveaway e;
                public final /* synthetic */ Context f;
                public final /* synthetic */ u6 g;

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
                    u6 u6Var = this.g;
                    if (z11) {
                        j.d(z12, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, u6Var);
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        j.e(z12, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, u6Var);
                    }
                }
            }, new vg.g(atomicBoolean, anVar, 0));
            return;
        }
        if (i10 == 21) {
            f();
            return;
        }
        if (i10 == 84) {
            wnVar.Ga(s1Var);
            return;
        }
        if (i10 == 80) {
            org.telegram.ui.Cells.x8 x8Var = org.telegram.ui.Components.oh0.R;
            if (wnVar.getParentActivity() == null) {
                return;
            }
            wnVar.showDialog(new org.telegram.ui.Components.oh0(wnVar.getContext(), wnVar.getCurrentAccount(), messageObject, wnVar.getResourceProvider()));
            return;
        }
        if (i10 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
            if (messageMedia4 == null || (webPage = messageMedia4.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.I1;
            if (launchActivity == null || launchActivity.P() == null || LaunchActivity.I1.P().l(messageObject) == null) {
                wnVar.createArticleViewer(false).N(messageObject, null, null, null);
                return;
            }
            return;
        }
        int i15 = 5;
        if (i10 == 5) {
            long j11 = messageObject.messageOwner.media.user_id;
            if (j11 != 0) {
                i14 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
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
                wnVar.showDialog(new org.telegram.ui.Components.kf0(wnVar, null, user, null, file, kf.b.d(str, false), str3, str4, wnVar.ua));
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (i10 == 30) {
            wnVar.presentFragment(new wn(a1.g.h(messageObject.messageOwner.media.user_id, "user_id")));
            return;
        }
        if (i10 == 31) {
            long j12 = messageObject.messageOwner.media.user_id;
            if (j12 != 0) {
                i13 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(j12));
            }
            if (user2 != null) {
                if (!TextUtils.isEmpty(messageObject.vCardData)) {
                    b10 = messageObject.vCardData.toString();
                } else if (TextUtils.isEmpty(user2.phone)) {
                    String str5 = MessageObject.getMedia(messageObject.messageOwner).phone_number;
                    b10 = !TextUtils.isEmpty(str5) ? kf.b.c().b(str5) : LocaleController.getString(R.string.NumberUnknown);
                } else {
                    b10 = org.telegram.messenger.wh.g(new StringBuilder("+"), user2.phone, kf.b.c());
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user2.id);
                bundle2.putString("phone", b10);
                bundle2.putBoolean("addContact", true);
                wnVar.presentFragment(new ls(bundle2));
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
            qf.c cVar2 = wnVar.ac;
            if (cVar2 != null) {
                cVar2.a(true);
            }
            wnVar.ac = s1Var.getMessageObject() != null ? new an(this, s1Var, 3) : null;
            if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                String group = matcher.group(1);
                i11 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                if (MediaDataController.getInstance(i11).getStickerSetByName(group) == null) {
                    wnVar.ac.d();
                    TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_inputStickerSetShortName.short_name = group;
                    tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                    i12 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                    wnVar.ac.b = new ag.r0(this, ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickerSet, new fi.m3(i16, this, z11)), 29);
                    return;
                }
            }
            qf.d.q(wnVar.getParentActivity(), Uri.parse(webPage2.url), true, true, false, wnVar.ac, null, false, true, false);
            return;
        }
        if (messageObject.isSponsored()) {
            wnVar.W9(messageObject, false, false);
            if (messageObject.sponsoredUrl != null) {
                qf.c cVar3 = wnVar.ac;
                if (cVar3 != null) {
                    cVar3.a(true);
                }
                wnVar.ac = s1Var.getMessageObject() != null ? new an(this, s1Var, i16) : null;
                qf.d.q(wnVar.getParentActivity(), Uri.parse(messageObject.sponsoredUrl), true, false, false, wnVar.ac, null, false, wnVar.getMessagesController().sponsoredLinksInappAllow, false);
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
                    wnVar.getOrCreateStoryViewer().G(wnVar.getParentActivity(), tL_webPageAttributeStory.storyItem, di.q7.a(wnVar.x0));
                    return;
                }
            }
        }
        if (wnVar.ra(storyMentionWebpage.url, s1Var, null, messageObject.getId(), 2)) {
            return;
        }
        qf.c cVar4 = wnVar.ac;
        if (cVar4 != null) {
            cVar4.a(true);
        }
        wnVar.ac = s1Var.getMessageObject() != null ? new an(this, s1Var, i15) : null;
        qf.d.q(wnVar.getParentActivity(), Uri.parse(storyMentionWebpage.url), true, true, false, wnVar.ac, null, false, true, false);
    }

    @Override // org.telegram.ui.Cells.j1
    public final ev0 E1() {
        return this.a.Ma;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void F(MessageObject.TextLayoutBlock textLayoutBlock) {
        StaticLayout staticLayout = textLayoutBlock.textLayout;
        if (staticLayout == null || staticLayout.getText() == null) {
            return;
        }
        String charSequence = textLayoutBlock.textLayout.getText().toString();
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new ni.h(false, textLayoutBlock.language, charSequence), 0, spannableString.length(), 33);
        AndroidUtilities.addToClipboard(spannableString);
        org.telegram.messenger.wh.m(R.string.CodeCopied, org.telegram.ui.Components.wc.b0(this.a));
    }

    @Override // org.telegram.ui.Cells.j1
    public final void F0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        wn wnVar = this.a;
        wnVar.getSendMessagesHelper().sendCallback(true, s1Var.getMessageObject(), keyboardInlineButton, wnVar);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean G1(long j10) {
        wn wnVar = this.a;
        TLRPC.Chat chat = wnVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return false;
        }
        return wnVar.getMessagesController().isAdmin(wnVar.e.id, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x00fe, code lost:
    
        if (org.telegram.messenger.DialogObject.getPeerDialogId(r5) != r8.j6) goto L67;
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
    public final void H1(org.telegram.ui.Cells.s1 s1Var, int i10, float f7, float f10, boolean z10) {
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
        org.telegram.ui.ActionBar.r2 r2Var;
        TLRPC.Chat chat2;
        TLRPC.MessageReplyHeader messageReplyHeader5;
        MessageObject messageObject;
        TLRPC.MessageReplyHeader messageReplyHeader6;
        TLRPC.MessageReplyHeader messageReplyHeader7;
        TLRPC.Message message3;
        TL_stories.StoryItem storyItem;
        org.telegram.ui.ActionBar.k kVar;
        boolean c10 = c();
        wn wnVar = this.a;
        if (!c10 && !z10) {
            kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
            if ((kVar.q() || wnVar.M9()) && !wnVar.s9.z(s1Var.getMessageObject())) {
                wn.f2(wnVar, s1Var, !s1Var.i3(f7), f7, f10);
                return;
            }
            return;
        }
        if (UserObject.isReplyUser(wnVar.f)) {
            p(s1Var);
            return;
        }
        MessageObject messageObject2 = s1Var.getMessageObject();
        if (messageObject2 == null) {
            return;
        }
        if (messageObject2.isReplyToStory() && (storyItem = (message3 = messageObject2.messageOwner).replyStory) != null) {
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                org.telegram.messenger.t.q(R.string.StoryNotFound, org.telegram.ui.Components.wc.b0(wnVar), R.raw.story_bomb1, 36);
                return;
            }
            storyItem.dialogId = DialogObject.getPeerDialogId(message3.reply_to.peer);
            storyItem.messageId = messageObject2.getId();
            storyItem.messageType = 3;
            di.a8.b(storyItem, wnVar.f);
            wnVar.getOrCreateStoryViewer().G(wnVar.getParentActivity(), storyItem, di.q7.a(wnVar.x0));
            return;
        }
        TLRPC.Message message4 = messageObject2.messageOwner;
        if (message4 != null && (messageReplyHeader7 = message4.reply_to) != null && (messageReplyHeader7.flags & 2048) != 0) {
            num = Integer.valueOf(messageReplyHeader7.todo_item_id);
        } else {
            if (message4 != null && (messageReplyHeader2 = message4.reply_to) != null && (bArr = messageReplyHeader2.poll_option) != null) {
                num = null;
                str = null;
                long j11 = wnVar.j6;
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
                org.telegram.ui.Components.wc.b0(wnVar).R(R.raw.error, 36, LocaleController.getString((message5 == null && (messageReplyHeader3 = message5.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
            }
            if (message4 != null && (messageReplyHeader = message4.reply_to) != null && messageReplyHeader.quote) {
                String str3 = messageReplyHeader.quote_text;
                r9 = (messageReplyHeader.flags & 1024) != 0 ? messageReplyHeader.quote_offset : -1;
                str = str3;
                num = null;
                bArr = null;
                long j112 = wnVar.j6;
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
                            chat = j10 < 0 ? wnVar.getMessagesController().getChat(Long.valueOf(-j10)) : null;
                            if (j10 != Long.MAX_VALUE) {
                                boolean z12 = z11;
                                if (j10 == wnVar.j6 || chat == null || ChatObject.isPublic(chat) || (!chat.left && !chat.kicked)) {
                                    if (((j10 == wnVar.j6 && (!ChatObject.isForum(wnVar.e) || !z12)) || j10 == Long.MAX_VALUE) && (wnVar.d4 != 3 || ((messageObject = messageObject2.replyMessageObject) != null && messageObject.getSavedDialogId() == wnVar.b()))) {
                                        int i11 = wnVar.d4;
                                        if (i11 == 2 || i11 == 1) {
                                            wnVar.l9.Q0(i10);
                                            wnVar.finishFragment();
                                            return;
                                        }
                                        if (bArr != null) {
                                            wnVar.h8 = bArr;
                                        } else if (num != null) {
                                            wnVar.g8 = num;
                                        } else {
                                            TLRPC.Message message6 = messageObject2.messageOwner;
                                            if (message6 != null && (messageReplyHeader5 = message6.reply_to) != null && messageReplyHeader5.quote) {
                                                wnVar.d8 = true;
                                                wnVar.f8 = messageReplyHeader5.quote_text;
                                                wnVar.i8 = r9;
                                                wnVar.c8 = true;
                                            }
                                        }
                                        bi.sb sbVar = new bi.sb(this, i10, messageObject2, num, bArr, 19);
                                        if (!wnVar.A0.N) {
                                            sbVar.run();
                                            return;
                                        }
                                        wnVar.D3 = false;
                                        wnVar.Ab(false, true, false);
                                        wnVar.Wc(wnVar.getMediaDataController().getMask(), wnVar.getMediaDataController().getSearchPosition(), wnVar.getMediaDataController().getSearchCount());
                                        AndroidUtilities.runOnUIThread(sbVar, 80L);
                                        return;
                                    }
                                    Integer num2 = num;
                                    byte[] bArr2 = bArr;
                                    if (LaunchActivity.I1 != null) {
                                        qf.c cVar = wnVar.ac;
                                        if (cVar != null) {
                                            cVar.a(false);
                                            r2Var = null;
                                            wnVar.ac = null;
                                        } else {
                                            r2Var = null;
                                        }
                                        LaunchActivity launchActivity = LaunchActivity.I1;
                                        final j0 j0Var = new j0(this, messageObject2, s1Var);
                                        wnVar.ac = j0Var;
                                        int id2 = messageObject2.getId();
                                        ArrayList arrayList = launchActivity.d0;
                                        if (j10 < 0 && (chat2 = MessagesController.getInstance(launchActivity.O).getChat(Long.valueOf(-j10))) != null && ChatObject.isForum(chat2)) {
                                            j0Var.d();
                                            final int i12 = 0;
                                            launchActivity.m0(j10, Integer.valueOf(i10), str2, num2, bArr2, new Runnable() { // from class: org.telegram.ui.a90
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i13 = i12;
                                                    j0 j0Var2 = j0Var;
                                                    switch (i13) {
                                                        case 0:
                                                            Pattern pattern = LaunchActivity.D1;
                                                            j0Var2.c(false);
                                                            break;
                                                        default:
                                                            Pattern pattern2 = LaunchActivity.D1;
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
                                        if (j10 >= 0) {
                                            bundle.putLong("user_id", j10);
                                        } else {
                                            long j12 = -j10;
                                            TLRPC.Chat chat3 = MessagesController.getInstance(launchActivity.O).getChat(Long.valueOf(j12));
                                            if (chat3 != null && chat3.forum) {
                                                final int i14 = 1;
                                                launchActivity.m0(j10, Integer.valueOf(i10), str4, num2, bArr2, new Runnable() { // from class: org.telegram.ui.a90
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i132 = i14;
                                                        j0 j0Var2 = j0Var;
                                                        switch (i132) {
                                                            case 0:
                                                                Pattern pattern = LaunchActivity.D1;
                                                                j0Var2.c(false);
                                                                break;
                                                            default:
                                                                Pattern pattern2 = LaunchActivity.D1;
                                                                j0Var2.c(false);
                                                                break;
                                                        }
                                                    }
                                                }, id2, i13);
                                                return;
                                            }
                                            bundle.putLong("chat_id", j12);
                                        }
                                        bundle.putInt("message_id", i10);
                                        org.telegram.ui.ActionBar.r2 r2Var2 = !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.r2) ic.a.g(1, arrayList) : r2Var;
                                        if (r2Var2 == null || MessagesController.getInstance(launchActivity.O).checkCanOpenChat(bundle, r2Var2)) {
                                            AndroidUtilities.runOnUIThread(new z80(launchActivity, bundle, bArr2, i10, num2, str4, i13, j10, j0Var, r2Var2));
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
                                org.telegram.ui.Components.wc.b0(wnVar).R(R.raw.error, 36, LocaleController.getString((message52 == null && (messageReplyHeader3 = message52.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
                            } else {
                                messageObject2.replyTextRevealed = true;
                                wnVar.Hc(messageObject2, true);
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
                    org.telegram.ui.Components.wc.b0(wnVar).R(R.raw.error, 36, LocaleController.getString((message522 == null && (messageReplyHeader3 = message522.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
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
                org.telegram.ui.Components.wc.b0(wnVar).R(R.raw.error, 36, LocaleController.getString((message5222 == null && (messageReplyHeader3 = message5222.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
            }
            num = null;
        }
        bArr = null;
        str = null;
        long j1122 = wnVar.j6;
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
        org.telegram.ui.Components.wc.b0(wnVar).R(R.raw.error, 36, LocaleController.getString((message52222 == null && (messageReplyHeader3 = message52222.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void I(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject.messageOwner.send_state != 0) {
            this.a.getSendMessagesHelper().cancelSendingMessage(messageObject);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void I0(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z10) {
        this.a.d8(characterStyle, z10, s1Var.getMessageObject(), s1Var);
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
    /* JADX WARN: Removed duplicated region for block: B:205:0x0714 A[LOOP:2: B:204:0x0712->B:205:0x0714, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03c3  */
    @Override // org.telegram.ui.Cells.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I1(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        hd1 hd1Var;
        TLRPC.TodoItem todoItem2;
        TLRPC.TodoCompletion todoCompletion;
        hd1 hd1Var2;
        MessageObject messageObject;
        hd1 hd1Var3;
        int i10;
        MessageObject messageObject2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        ye yeVar;
        MessageObject messageObject3;
        boolean z14;
        ArrayList arrayList;
        ArrayList arrayList2;
        kd1 kd1Var;
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
        if (wnVar2.getParentActivity() != null && wnVar2.getParentActivity() != null) {
            fi.v3 v3Var = wnVar2.J1;
            if (v3Var != null && v3Var.V) {
                v3Var.e(true);
            }
            tl tlVar = wnVar2.N1;
            if (tlVar != null && tlVar.V) {
                tlVar.e(true);
            }
            MessageObject primaryMessageObject = s1Var.getPrimaryMessageObject();
            TLRPC.MessageMedia media = MessageObject.getMedia(primaryMessageObject);
            if (primaryMessageObject != null && (media instanceof TLRPC.TL_messageMediaToDo)) {
                wnVar2.t5 = primaryMessageObject;
                wnVar2.u5 = null;
                final kd1 kd1Var2 = new kd1(wnVar2.getParentActivity(), wnVar2.getResourceProvider());
                final int i12 = todoItem.id;
                kd1Var2.K = s1Var;
                kd1Var2.O = i12;
                MessageObject messageObject5 = s1Var.getMessageObject();
                kd1Var2.G = messageObject5;
                kd1Var2.H = messageObject5 != null && messageObject5.isOutOwner();
                org.telegram.ui.Cells.s1 s1Var2 = kd1Var2.K;
                hd1 hd1Var4 = kd1Var2.c;
                if (s1Var2 != null) {
                    kd1Var2.L = wnVar2.I9 - AndroidUtilities.dp(4.0f);
                    kd1Var2.M = s1Var.n;
                    if (s1Var.getParent() instanceof View) {
                        View view = (View) s1Var.getParent();
                        kd1Var2.L = view.getY() + kd1Var2.L;
                        kd1Var2.M = view.getY() + kd1Var2.M;
                    }
                    int width = kd1Var2.K.getWidth();
                    int height = kd1Var2.K.getHeight();
                    kd1Var2.K.getHeight();
                    hd1Var = hd1Var4;
                    id1 id1Var = new id1(kd1Var2, kd1Var2.getContext(), UserConfig.selectedAccount, kd1Var2.K.getResourcesProvider(), i12, width, height);
                    kd1Var2.I = id1Var;
                    kd1Var2.K.h1(id1Var);
                    kd1Var2.I.i1(kd1Var2.K);
                    kd1Var2.I.setDelegate(new jd1(kd1Var2));
                    id1 id1Var2 = kd1Var2.I;
                    MessageObject messageObject6 = kd1Var2.G;
                    MessageObject.GroupedMessages currentMessagesGroup = kd1Var2.K.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.s1 s1Var3 = kd1Var2.K;
                    id1Var2.Z3(messageObject6, currentMessagesGroup, s1Var3.F, s1Var3.E, s1Var3.G, false);
                    hd1Var.addView(kd1Var2.I, new FrameLayout.LayoutParams(kd1Var2.K.getWidth(), height, 51));
                    yv0 yv0Var = new yv0(kd1Var2.getContext(), UserConfig.selectedAccount, kd1Var2.K.getResourcesProvider(), width, height, 1);
                    kd1Var2.J = yv0Var;
                    kd1Var2.K.j1(yv0Var);
                    kd1Var2.K.h1(kd1Var2.J);
                    kd1Var2.J.i1(kd1Var2.K);
                    kd1Var2.J.setDelegate(new tb.a(17));
                    yv0 yv0Var2 = kd1Var2.J;
                    MessageObject messageObject7 = kd1Var2.G;
                    MessageObject.GroupedMessages currentMessagesGroup2 = kd1Var2.K.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.s1 s1Var4 = kd1Var2.K;
                    yv0Var2.Z3(messageObject7, currentMessagesGroup2, s1Var4.F, s1Var4.E, s1Var4.G, false);
                    hd1Var.addView(kd1Var2.J, new FrameLayout.LayoutParams(kd1Var2.K.getWidth(), height, 51));
                } else {
                    hd1Var = hd1Var4;
                }
                fi.h1 h1Var = kd1Var2.e;
                h1Var.bringToFront();
                hd1 hd1Var5 = kd1Var2.d;
                hd1Var5.bringToFront();
                kd1Var2.h.bringToFront();
                h1Var.w(false);
                org.telegram.ui.ActionBar.u6 u6Var = kd1Var2.a;
                org.telegram.ui.Components.l80 F = org.telegram.ui.Components.l80.F(hd1Var, u6Var, null);
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) MessageObject.getMedia(kd1Var2.G);
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
                if (!kd1Var2.G.canCompleteTodo()) {
                    hd1Var2 = hd1Var5;
                } else if (todoCompletion != null) {
                    hd1Var2 = hd1Var5;
                    F.p(14, -1, LocaleController.formatTodoCompletedDate(todoCompletion.date));
                    F.k();
                    final int i15 = 1;
                    F.c(R.drawable.msg_cancel, LocaleController.getString(R.string.TodoUncheck), new Runnable() { // from class: org.telegram.ui.cd1
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    wn wnVar3 = wnVar2;
                                    ov0 ov0Var = new ov0(wnVar3);
                                    kd1 kd1Var3 = kd1Var2;
                                    ov0Var.q0(MessageObject.getMedia(kd1Var3.G), false, i12);
                                    ov0Var.e0 = new cf0(26, kd1Var3, wnVar3);
                                    wnVar3.presentFragment(ov0Var);
                                    kd1Var3.c(false);
                                    break;
                                case 1:
                                    boolean c10 = wnVar2.c();
                                    kd1 kd1Var4 = kd1Var2;
                                    if (c10) {
                                        Toast.makeText(kd1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                                    } else {
                                        id1 id1Var3 = kd1Var4.I;
                                        id1Var3.m4(id1Var3.O2(i12), false);
                                    }
                                    kd1Var4.c(true);
                                    break;
                                default:
                                    boolean c11 = wnVar2.c();
                                    kd1 kd1Var5 = kd1Var2;
                                    if (c11) {
                                        Toast.makeText(kd1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                                    } else {
                                        id1 id1Var4 = kd1Var5.I;
                                        id1Var4.m4(id1Var4.O2(i12), false);
                                    }
                                    kd1Var5.c(true);
                                    break;
                            }
                        }
                    }, false);
                } else {
                    hd1Var2 = hd1Var5;
                    final int i16 = 2;
                    F.c(R.drawable.msg_select, LocaleController.getString(R.string.TodoCheck), new Runnable() { // from class: org.telegram.ui.cd1
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i16) {
                                case 0:
                                    wn wnVar3 = wnVar2;
                                    ov0 ov0Var = new ov0(wnVar3);
                                    kd1 kd1Var3 = kd1Var2;
                                    ov0Var.q0(MessageObject.getMedia(kd1Var3.G), false, i12);
                                    ov0Var.e0 = new cf0(26, kd1Var3, wnVar3);
                                    wnVar3.presentFragment(ov0Var);
                                    kd1Var3.c(false);
                                    break;
                                case 1:
                                    boolean c10 = wnVar2.c();
                                    kd1 kd1Var4 = kd1Var2;
                                    if (c10) {
                                        Toast.makeText(kd1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                                    } else {
                                        id1 id1Var3 = kd1Var4.I;
                                        id1Var3.m4(id1Var3.O2(i12), false);
                                    }
                                    kd1Var4.c(true);
                                    break;
                                default:
                                    boolean c11 = wnVar2.c();
                                    kd1 kd1Var5 = kd1Var2;
                                    if (c11) {
                                        Toast.makeText(kd1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                                    } else {
                                        id1 id1Var4 = kd1Var5.I;
                                        id1Var4.m4(id1Var4.O2(i12), false);
                                    }
                                    kd1Var5.c(true);
                                    break;
                            }
                        }
                    }, false);
                }
                if (todoItem2 != null) {
                    F.c(R.drawable.menu_reply, LocaleController.getString(R.string.TodoItemQuote), new t31(kd1Var2, wnVar2, todoItem2, 6), false);
                    if (kd1Var2.G.getDialogId() < 0) {
                        MessagesController messagesController = MessagesController.getInstance(kd1Var2.G.currentAccount);
                        String publicUsername = DialogObject.getPublicUsername(messagesController.getUserOrChat(kd1Var2.G.getDialogId()));
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(messagesController.linkPrefix);
                        sb2.append("/");
                        if (TextUtils.isEmpty(publicUsername)) {
                            StringBuilder sb3 = new StringBuilder("c/");
                            messageObject = primaryMessageObject;
                            hd1Var3 = hd1Var2;
                            sb3.append(-kd1Var2.G.getDialogId());
                            publicUsername = sb3.toString();
                        } else {
                            messageObject = primaryMessageObject;
                            hd1Var3 = hd1Var2;
                        }
                        sb2.append(publicUsername);
                        sb2.append("/");
                        sb2.append(kd1Var2.G.getId());
                        sb2.append("?task=");
                        sb2.append(todoItem2.id);
                        F.c(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new yc1(1, kd1Var2, sb2.toString()), false);
                    } else {
                        messageObject = primaryMessageObject;
                        hd1Var3 = hd1Var2;
                    }
                    F.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new yc1(2, kd1Var2, todoItem2), false);
                } else {
                    messageObject = primaryMessageObject;
                    hd1Var3 = hd1Var2;
                }
                if (kd1Var2.G.canEditMessage(wnVar2.e)) {
                    final int i17 = 0;
                    F.c(R.drawable.msg_edit, LocaleController.getString(R.string.TodoEditItem), new Runnable() { // from class: org.telegram.ui.cd1
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i17) {
                                case 0:
                                    wn wnVar3 = wnVar2;
                                    ov0 ov0Var = new ov0(wnVar3);
                                    kd1 kd1Var3 = kd1Var2;
                                    ov0Var.q0(MessageObject.getMedia(kd1Var3.G), false, i13);
                                    ov0Var.e0 = new cf0(26, kd1Var3, wnVar3);
                                    wnVar3.presentFragment(ov0Var);
                                    kd1Var3.c(false);
                                    break;
                                case 1:
                                    boolean c10 = wnVar2.c();
                                    kd1 kd1Var4 = kd1Var2;
                                    if (c10) {
                                        Toast.makeText(kd1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                                    } else {
                                        id1 id1Var3 = kd1Var4.I;
                                        id1Var3.m4(id1Var3.O2(i13), false);
                                    }
                                    kd1Var4.c(true);
                                    break;
                                default:
                                    boolean c11 = wnVar2.c();
                                    kd1 kd1Var5 = kd1Var2;
                                    if (c11) {
                                        Toast.makeText(kd1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                                    } else {
                                        id1 id1Var4 = kd1Var5.I;
                                        id1Var4.m4(id1Var4.O2(i13), false);
                                    }
                                    kd1Var5.c(true);
                                    break;
                            }
                        }
                    }, false);
                    if (tL_messageMediaToDo.todo.list.size() > 1) {
                        i10 = 51;
                        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.TodoDeleteItem), new org.telegram.ui.Components.as0(kd1Var2, tL_messageMediaToDo, i12, wnVar2, 16), false);
                        F.T(org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, u6Var)));
                        fh.e k10 = gh.c.k(u6Var);
                        ch.b bVar = kd1Var2.F;
                        F.Q(bVar, k10, false);
                        F.Y();
                        ViewGroup viewGroup2 = F.A;
                        kd1Var2.Q = viewGroup2;
                        viewGroup2.setPivotX(0.0f);
                        kd1Var2.Q.setPivotY(0.0f);
                        hd1Var3.addView(kd1Var2.Q, org.telegram.ui.Components.kb1.i(-2, -2, i10));
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        wnVar2.x8(messageObject, arrayList4, arrayList5, arrayList6);
                        ye yeVar2 = new ye(wnVar2, 10);
                        messageObject2 = kd1Var2.G;
                        List<TLRPC.TL_availableReaction> enabledReactionsList = wnVar2.getMediaDataController().getEnabledReactionsList();
                        boolean z15 = wnVar2.w() && !wnVar2.c() && wnVar2.f == null && messageObject2.hasReactions() && !((ChatObject.isChannel(wnVar2.e) && !wnVar2.e.megagroup) || ChatObject.isMonoForum(wnVar2.e) || enabledReactionsList.isEmpty() || !messageObject2.messageOwner.reactions.can_see_list || messageObject2.isSecretMedia());
                        if (messageObject2.isForwardedChannelPost()) {
                            z10 = z15;
                            if (!messageObject2.isSecretMedia()) {
                                if (wnVar2.d4 != 5) {
                                    if (!wnVar2.w()) {
                                        if (!wnVar2.c()) {
                                            if (messageObject2.isReactionsAvailable()) {
                                                TLRPC.ChatFull chatFull2 = wnVar2.p8;
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
                                if (!wnVar2.w()) {
                                    if (wnVar2.d4 != 5) {
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
                        z12 = (!z10 || wnVar2.c() || wnVar2.e == null || !messageObject2.isOutOwner() || !messageObject2.isSent() || messageObject2.isEditing() || messageObject2.isSending() || messageObject2.isSendError() || messageObject2.isContentUnread() || messageObject2.isUnread() || ConnectionsManager.getInstance(wnVar2.getCurrentAccount()).getCurrentTime() - messageObject2.messageOwner.date >= wnVar2.getMessagesController().chatReadMarkExpirePeriod || (!ChatObject.isMegagroup(wnVar2.e) && ChatObject.isChannel(wnVar2.e)) || (chatFull = wnVar2.p8) == null || chatFull.participants_count > wnVar2.getMessagesController().chatReadMarkSizeThreshold || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || wnVar2.d4 == 3 || !messageObject2.canSetReaction() || ChatObject.isMonoForum(wnVar2.e)) ? false : true;
                        if (wnVar2.e != null && !messageObject2.isOut() && ChatObject.isMonoForum(wnVar2.e) && ChatObject.canManageMonoForum(wnVar2.getCurrentAccount(), wnVar2.e)) {
                            int i18 = ((-wnVar2.e.linked_monoforum_id) > messageObject2.getFromChatId() ? 1 : ((-wnVar2.e.linked_monoforum_id) == messageObject2.getFromChatId() ? 0 : -1));
                        }
                        if (!z10 && wnVar2.e == null && wnVar2.h == null && (user = wnVar2.f) != null && !UserObject.isUserSelf(user) && !UserObject.isReplyUser(wnVar2.f) && !UserObject.isAnonymous(wnVar2.f)) {
                            user2 = wnVar2.f;
                            if (!user2.bot && !UserObject.isService(user2.id) && (((userFull = wnVar2.q8) == null || !userFull.read_dates_private) && !wnVar2.c() && messageObject2.isOutOwner() && messageObject2.isSent() && !messageObject2.isEditing() && !messageObject2.isSending() && !messageObject2.isSendError() && !messageObject2.isContentUnread() && !messageObject2.isUnread() && wnVar2.getConnectionsManager().getCurrentTime() - messageObject2.messageOwner.date < wnVar2.getMessagesController().pmReadDateExpirePeriod && !(messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                                z13 = true;
                                TLRPC.User user3 = wnVar2.f;
                                boolean z17 = ((user3 == null && (UserObject.isReplyUser(user3) || UserObject.isAnonymous(wnVar2.f))) || wnVar2.c() || !messageObject2.isEdited() || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                                org.telegram.ui.Components.l80 G = org.telegram.ui.Components.l80.G(kd1Var2.c, wnVar2.getResourceProvider(), null, !z10 || z12);
                                if (z12) {
                                    yeVar = yeVar2;
                                    messageObject3 = messageObject2;
                                    z14 = z16;
                                    arrayList = arrayList4;
                                    arrayList2 = arrayList5;
                                    kd1Var = kd1Var2;
                                    arrayList3 = arrayList6;
                                    wnVar = wnVar2;
                                    if (z13) {
                                        G.r(new org.telegram.ui.Components.sc0(kd1Var.getContext(), 0, messageObject3, new bd1(kd1Var, 0), kd1Var.a), org.telegram.ui.Components.kb1.r(-1, 36));
                                        G.k();
                                    } else if (z17) {
                                        messageObject4 = messageObject3;
                                        G.r(new org.telegram.ui.Components.sc0(kd1Var.getContext(), 1, messageObject3, new bd1(kd1Var, 2), kd1Var.a), org.telegram.ui.Components.kb1.r(-1, 36));
                                        G.k();
                                        i11 = 0;
                                        for (size = arrayList.size(); i11 < size; size = size) {
                                            G.c(((Integer) arrayList.get(i11)).intValue(), (CharSequence) arrayList2.get(i11), new fx(kd1Var, yeVar, ((Integer) arrayList3.get(i11)).intValue(), 14), false);
                                            i11++;
                                            arrayList3 = arrayList3;
                                        }
                                        G.T(org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, u6Var)));
                                        G.Q(bVar, gh.c.k(u6Var), false);
                                        G.Y();
                                        ViewGroup viewGroup3 = G.A;
                                        kd1Var.S = viewGroup3;
                                        viewGroup3.setPivotX(0.0f);
                                        kd1Var.S.setPivotY(0.0f);
                                        ViewGroup viewGroup4 = kd1Var.S;
                                        FrameLayout.LayoutParams i19 = org.telegram.ui.Components.kb1.i(-2, -2, 51);
                                        hd1 hd1Var6 = kd1Var.d;
                                        hd1Var6.addView(viewGroup4, i19);
                                        viewGroup = kd1Var.S;
                                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new jl0(kd1Var, 22));
                                            kd1Var.S.setOnTouchListener(new d0(kd1Var, 7));
                                        }
                                        if (z14) {
                                            wn wnVar3 = wnVar;
                                            org.telegram.ui.Components.gl0 gl0Var = new org.telegram.ui.Components.gl0((wnVar.getUserConfig().getClientUserId() > wnVar.a() ? 1 : (wnVar.getUserConfig().getClientUserId() == wnVar.a() ? 0 : -1)) == 0 ? 3 : 0, wnVar3.getCurrentAccount(), kd1Var.getContext(), wnVar3, kd1Var.a);
                                            gl0Var.a = true;
                                            float f7 = 22;
                                            gl0Var.setPadding(AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : 24), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 24 : 0), AndroidUtilities.dp(f7));
                                            gl0Var.setDelegate(new gd1(kd1Var, wnVar3, messageObject4, gl0Var));
                                            kd1Var.P = gl0Var;
                                            hd1Var6.addView(gl0Var, org.telegram.ui.Components.kb1.i(-2, (int) ((gl0Var.getTopOffset() / AndroidUtilities.density) + 52.0f + f7), 51));
                                            gl0Var.p(messageObject4, wnVar3.p8, true);
                                            kd1Var.P.setTransitionProgress(1.0f);
                                        }
                                        kd1Var.e();
                                        kd1Var.c0 = new sm(this, 5);
                                        kd1Var.show();
                                        return true;
                                    }
                                } else {
                                    th0 th0Var = new th0(kd1Var2.getContext(), wnVar2.getCurrentAccount(), messageObject2, wnVar2.e);
                                    FrameLayout frameLayout = new FrameLayout(kd1Var2.getContext());
                                    frameLayout.addView(th0Var, org.telegram.ui.Components.kb1.g(36.0f, -1));
                                    org.telegram.ui.Components.l80 J = G.J();
                                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, kd1Var2.getContext(), kd1Var2.a, true, false);
                                    g1Var.setItemHeight(44);
                                    g1Var.j(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                                    g1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                                    FrameLayout frameLayout2 = new FrameLayout(kd1Var2.getContext());
                                    LinearLayout linearLayout = new LinearLayout(kd1Var2.getContext());
                                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.G8, linearLayout, u6Var);
                                    linearLayout.setOrientation(1);
                                    wnVar = wnVar2;
                                    org.telegram.ui.Components.nm0 a2 = th0Var.a();
                                    frameLayout2.addView(g1Var);
                                    linearLayout.addView(frameLayout2);
                                    z14 = z16;
                                    linearLayout.addView(new org.telegram.ui.ActionBar.l1(kd1Var2.getContext(), u6Var), org.telegram.ui.Components.kb1.r(-1, 8));
                                    frameLayout2.setOnClickListener(new ed1(G));
                                    messageObject3 = messageObject2;
                                    yeVar = yeVar2;
                                    arrayList = arrayList4;
                                    arrayList2 = arrayList5;
                                    fd1 fd1Var = new fd1(kd1Var2, th0Var, wnVar, a2, linearLayout, G, J);
                                    G = G;
                                    kd1Var = kd1Var2;
                                    th0Var.setOnClickListener(fd1Var);
                                    linearLayout.addView(a2, org.telegram.ui.Components.kb1.r(-1, -2));
                                    J.q(linearLayout);
                                    G.q(frameLayout);
                                    G.k();
                                    arrayList3 = arrayList6;
                                }
                                messageObject4 = messageObject3;
                                i11 = 0;
                                while (i11 < size) {
                                }
                                G.T(org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, u6Var)));
                                G.Q(bVar, gh.c.k(u6Var), false);
                                G.Y();
                                ViewGroup viewGroup32 = G.A;
                                kd1Var.S = viewGroup32;
                                viewGroup32.setPivotX(0.0f);
                                kd1Var.S.setPivotY(0.0f);
                                ViewGroup viewGroup42 = kd1Var.S;
                                FrameLayout.LayoutParams i192 = org.telegram.ui.Components.kb1.i(-2, -2, 51);
                                hd1 hd1Var62 = kd1Var.d;
                                hd1Var62.addView(viewGroup42, i192);
                                viewGroup = kd1Var.S;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                }
                                if (z14) {
                                }
                                kd1Var.e();
                                kd1Var.c0 = new sm(this, 5);
                                kd1Var.show();
                                return true;
                            }
                        }
                        z13 = false;
                        TLRPC.User user32 = wnVar2.f;
                        if (user32 == null) {
                        }
                        org.telegram.ui.Components.l80 G2 = org.telegram.ui.Components.l80.G(kd1Var2.c, wnVar2.getResourceProvider(), null, !z10 || z12);
                        if (z12) {
                        }
                        messageObject4 = messageObject3;
                        i11 = 0;
                        while (i11 < size) {
                        }
                        G2.T(org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, u6Var)));
                        G2.Q(bVar, gh.c.k(u6Var), false);
                        G2.Y();
                        ViewGroup viewGroup322 = G2.A;
                        kd1Var.S = viewGroup322;
                        viewGroup322.setPivotX(0.0f);
                        kd1Var.S.setPivotY(0.0f);
                        ViewGroup viewGroup422 = kd1Var.S;
                        FrameLayout.LayoutParams i1922 = org.telegram.ui.Components.kb1.i(-2, -2, 51);
                        hd1 hd1Var622 = kd1Var.d;
                        hd1Var622.addView(viewGroup422, i1922);
                        viewGroup = kd1Var.S;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z14) {
                        }
                        kd1Var.e();
                        kd1Var.c0 = new sm(this, 5);
                        kd1Var.show();
                        return true;
                    }
                }
                i10 = 51;
                F.T(org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, u6Var)));
                fh.e k102 = gh.c.k(u6Var);
                ch.b bVar2 = kd1Var2.F;
                F.Q(bVar2, k102, false);
                F.Y();
                ViewGroup viewGroup22 = F.A;
                kd1Var2.Q = viewGroup22;
                viewGroup22.setPivotX(0.0f);
                kd1Var2.Q.setPivotY(0.0f);
                hd1Var3.addView(kd1Var2.Q, org.telegram.ui.Components.kb1.i(-2, -2, i10));
                ArrayList arrayList42 = new ArrayList();
                ArrayList arrayList52 = new ArrayList();
                ArrayList arrayList62 = new ArrayList();
                wnVar2.x8(messageObject, arrayList42, arrayList52, arrayList62);
                ye yeVar22 = new ye(wnVar2, 10);
                messageObject2 = kd1Var2.G;
                List<TLRPC.TL_availableReaction> enabledReactionsList2 = wnVar2.getMediaDataController().getEnabledReactionsList();
                if (wnVar2.w()) {
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
                        org.telegram.ui.Components.l80 G22 = org.telegram.ui.Components.l80.G(kd1Var2.c, wnVar2.getResourceProvider(), null, !z10 || z12);
                        if (z12) {
                        }
                        messageObject4 = messageObject3;
                        i11 = 0;
                        while (i11 < size) {
                        }
                        G22.T(org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, u6Var)));
                        G22.Q(bVar2, gh.c.k(u6Var), false);
                        G22.Y();
                        ViewGroup viewGroup3222 = G22.A;
                        kd1Var.S = viewGroup3222;
                        viewGroup3222.setPivotX(0.0f);
                        kd1Var.S.setPivotY(0.0f);
                        ViewGroup viewGroup4222 = kd1Var.S;
                        FrameLayout.LayoutParams i19222 = org.telegram.ui.Components.kb1.i(-2, -2, 51);
                        hd1 hd1Var6222 = kd1Var.d;
                        hd1Var6222.addView(viewGroup4222, i19222);
                        viewGroup = kd1Var.S;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z14) {
                        }
                        kd1Var.e();
                        kd1Var.c0 = new sm(this, 5);
                        kd1Var.show();
                        return true;
                    }
                }
                z13 = false;
                TLRPC.User user3222 = wnVar2.f;
                if (user3222 == null) {
                }
                org.telegram.ui.Components.l80 G222 = org.telegram.ui.Components.l80.G(kd1Var2.c, wnVar2.getResourceProvider(), null, !z10 || z12);
                if (z12) {
                }
                messageObject4 = messageObject3;
                i11 = 0;
                while (i11 < size) {
                }
                G222.T(org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, u6Var)));
                G222.Q(bVar2, gh.c.k(u6Var), false);
                G222.Y();
                ViewGroup viewGroup32222 = G222.A;
                kd1Var.S = viewGroup32222;
                viewGroup32222.setPivotX(0.0f);
                kd1Var.S.setPivotY(0.0f);
                ViewGroup viewGroup42222 = kd1Var.S;
                FrameLayout.LayoutParams i192222 = org.telegram.ui.Components.kb1.i(-2, -2, 51);
                hd1 hd1Var62222 = kd1Var.d;
                hd1Var62222.addView(viewGroup42222, i192222);
                viewGroup = kd1Var.S;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z14) {
                }
                kd1Var.e();
                kd1Var.c0 = new sm(this, 5);
                kd1Var.show();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void J(int i10, org.telegram.ui.Cells.s1 s1Var) {
        boolean z10 = s1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveaway;
        wn wnVar = this.a;
        if (z10) {
            long j10 = -((TLRPC.TL_messageMediaGiveaway) s1Var.getMessageObject().messageOwner.media).channels.get(i10).longValue();
            if (wnVar.j6 != j10) {
                wnVar.presentFragment(wn.ea(j10));
            } else {
                wnVar.m1.e(false, false);
            }
        }
        if (s1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            wnVar.presentFragment(ProfileActivity.t4(((TLRPC.TL_messageMediaGiveawayResults) s1Var.getMessageObject().messageOwner.media).winners.get(i10).longValue()));
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean J0(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
        MessageObject messageObject = (currentMessagesGroup == null || currentMessagesGroup.messages.isEmpty()) ? s1Var.getMessageObject() : currentMessagesGroup.messages.get(0);
        if (messageObject != null) {
            wn wnVar = this.a;
            boolean z11 = !wnVar.Jc && messageObject.getId() == wnVar.Ic;
            if (!z10) {
                return z11;
            }
            if (z11 && System.currentTimeMillis() - wnVar.Kc > 1000) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void K(MessageObject messageObject) {
        if (messageObject.isVideo()) {
            this.a.ub(messageObject, true);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void K0(org.telegram.ui.Cells.s1 s1Var) {
        wn wnVar = this.a;
        wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(wnVar.j6), s1Var);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void K1(org.telegram.ui.Cells.s1 s1Var) {
        TLRPC.Chat chat;
        TLRPC.User currentUser = s1Var.getCurrentUser();
        wn wnVar = this.a;
        if (!AndroidUtilities.isContextSafe(wnVar.getParentActivity()) || (chat = wnVar.e) == null || currentUser == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return;
        }
        e(s1Var, wnVar.getMessagesController().getParticipant(wnVar.e.id, currentUser.id));
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean L(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        int i10;
        int i11;
        boolean isForwarded = s1Var.getMessageObject().isForwarded();
        wn wnVar = this.a;
        if (isForwarded) {
            long peerDialogId = DialogObject.getPeerDialogId(s1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(wnVar);
            int i12 = R.raw.passcode_lock_close;
            int i13 = R.string.TodoCompleteForbiddenForward;
            i11 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
            b02.R(i12, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i13, DialogObject.getName(i11, peerDialogId)))).k(true);
            return false;
        }
        if (s1Var.getMessageObject().canCompleteTodo()) {
            if (wnVar.getUserConfig().isPremium()) {
                wnVar.getSendMessagesHelper().toggleTodo(ChatObject.getSendAsPeerId(wnVar.e, wnVar.p8, true), s1Var.getMessageObject(), todoItem, z10, null);
                return true;
            }
            org.telegram.ui.Components.wc.b0(wnVar).R(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.TodoPremiumRequired), new sm(this, 9))).k(true);
            return false;
        }
        long peerDialogId2 = DialogObject.getPeerDialogId(s1Var.getMessageObject().getFromPeer());
        org.telegram.ui.Components.wc b03 = org.telegram.ui.Components.wc.b0(wnVar);
        int i14 = R.raw.passcode_lock_close;
        int i15 = R.string.TodoCompleteForbidden;
        i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
        b03.R(i14, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i15, DialogObject.getName(i10, peerDialogId2)))).k(true);
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void L0(org.telegram.ui.Cells.s1 s1Var) {
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
        wnVar.Zb(messageObject, spannableStringBuilder, 1);
        s1Var.i4(1, false, true);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean M() {
        wn wnVar = this.a;
        return wnVar.m6[1].size() + wnVar.m6[0].size() > 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void M1(org.telegram.ui.Cells.s1 s1Var, long j10) {
        Bundle h = a1.g.h(j10, "user_id");
        org.telegram.ui.ActionBar.r2 r2Var = this.a;
        if (r2Var.getMessagesController().checkCanOpenChat(h, r2Var, s1Var.getMessageObject())) {
            r2Var.presentFragment(new wn(h));
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean N(org.telegram.ui.Cells.s1 s1Var) {
        int i10;
        MessageObject messageObject;
        TLRPC.Message message;
        if (s1Var == null) {
            return false;
        }
        wn wnVar = this.a;
        if (wnVar.getParentActivity() == null) {
            return false;
        }
        i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
        if (!MessagesController.getInstance(i10).richEditorAllowed() || (messageObject = s1Var.getMessageObject()) == null || (message = messageObject.messageOwner) == null || message.rich_message == null) {
            return false;
        }
        if (!messageObject.translated || message.translatedRichMessage == null) {
            return messageObject.canEditMessage(wnVar.e);
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean O() {
        wn wnVar = this.a;
        return UserObject.isReplyUser(wnVar.f) || UserObject.isUserSelf(wnVar.f);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean O0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        wn wnVar = this.a;
        return wnVar.Wb != 0 && s1Var.getMessageObject() != null && wnVar.Wb == s1Var.getMessageObject().getId() && wnVar.Xb == i10;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void P(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        MessageObject messageObject;
        if (chat == null) {
            return;
        }
        wn wnVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
        if (kVar.q() || wnVar.M9()) {
            wn.f2(wnVar, s1Var, true, f7, f10);
            return;
        }
        if (z10 || !chat.signature_profiles || (messageObject = s1Var.getMessageObject()) == null || messageObject.getDialogId() == UserObject.REPLY_BOT) {
            o(s1Var, chat, i10, z10);
        } else {
            wnVar.Aa(DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void Q(org.telegram.ui.Cells.s1 s1Var) {
        g(s1Var, true, true, false);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean Q1(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        MessageObject messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (s1Var == null || pageBlock == null) {
            return false;
        }
        wn wnVar = this.a;
        if (wnVar.getParentActivity() == null || (messageObject = s1Var.getMessageObject()) == null || (message = messageObject.messageOwner) == null || messageObject.richLayout == null || (richMessage = message.rich_message) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        messageObject.richLayout.collectMediaBlocks(arrayList);
        int indexOf = arrayList.indexOf(pageBlock);
        if (indexOf < 0) {
            return false;
        }
        PhotoViewer v12 = PhotoViewer.v1();
        v12.N2(null, wnVar, null);
        return v12.h2(null, null, null, null, null, null, null, indexOf, new rm(wnVar, arrayList), null, 0L, 0L, 0L, true, new qm(richMessage, arrayList, messageObject), null);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void R1(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject primaryMessageObject = s1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.a.Ic(primaryMessageObject, false);
    }

    @Override // org.telegram.ui.Cells.j1
    public final int S() {
        return this.a.d4;
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean S0(MessageObject messageObject) {
        hm hmVar;
        long dialogId = messageObject.getDialogId();
        wn wnVar = this.a;
        return (dialogId == UserObject.REPLY_BOT || ((hmVar = wnVar.A0) != null && hmVar.N)) && wnVar.d4 != 7;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void U0() {
        wn wnVar = this.a;
        wnVar.Z7();
        UndoView undoView = wnVar.K3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, wnVar.j6, null);
    }

    @Override // org.telegram.ui.Cells.j1
    public final jh.a V() {
        return this.a.qc;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void V1() {
        this.a.C9();
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean W(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var == null ? null : s1Var.getMessageObject();
        if (messageObject == null || messageObject.messageOwner == null) {
            return false;
        }
        wn wnVar = this.a;
        return (wnVar.d4 == 1 || wnVar.K9() || messageObject.messageOwner.noforwards || messageObject.type == 29) ? false : true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void W0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        wn wnVar = this.a;
        if (wnVar.L9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) bg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        if (wnVar.getParentActivity() != null) {
            if (wnVar.a1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                jk jkVar = wnVar.Y;
                MessageObject messageObject = s1Var.getMessageObject();
                MessageObject messageObject2 = s1Var.getMessageObject();
                ui uiVar = null;
                String str = tL_inlineButtonTypeUrl != null ? tL_inlineButtonTypeUrl.url : null;
                qf.c cVar = wnVar.ac;
                if (cVar != null) {
                    cVar.a(true);
                    wnVar.ac = null;
                }
                if (str == null || s1Var.getMessageObject() == null) {
                    wnVar.ac = null;
                } else {
                    ui uiVar2 = new ui(wnVar, s1Var.getMessageObject().getId(), str, s1Var, 1);
                    wnVar.ac = uiVar2;
                    uiVar = uiVar2;
                }
                jkVar.Y(keyboardButtonProto, messageObject, messageObject2, uiVar);
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void W1(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.a.f8(s1Var, reactionCount, z10, f7, f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // org.telegram.ui.Cells.j1
    public final boolean X(org.telegram.ui.Cells.s1 s1Var, final TLRPC.User user) {
        int i10;
        a5 b10;
        int i11;
        nk nkVar;
        mk mkVar;
        if (!k()) {
            return false;
        }
        wn wnVar = this.a;
        ?? r22 = (wnVar.e == null || ((nkVar = wnVar.a1) != null && nkVar.getVisibility() == 0) || ((mkVar = wnVar.R) != null && mkVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat = wnVar.e;
        ?? r42 = (chat == null || !(wnVar.p4 == 0 || wnVar.t4) || (ChatObject.isChannel(chat) && !wnVar.e.megagroup)) ? 0 : 1;
        g5[] g5VarArr = new g5[r22 + 2 + r42];
        g5VarArr[0] = g5.d;
        g5VarArr[1] = g5.h;
        char c10 = 2;
        if (r22 != 0) {
            g5VarArr[2] = g5.n;
            c10 = 3;
        }
        if (r42 != 0) {
            g5VarArr[c10] = g5.r;
        }
        TLRPC.UserFull userFull = wnVar.getMessagesController().getUserFull(user.id);
        if (userFull != null) {
            b10 = a5.c(user, userFull, g5VarArr);
            if (!c2.b.g(b10)) {
                i11 = ((org.telegram.ui.ActionBar.r2) wnVar).classGuid;
                b10 = a5.b(user, i11, g5VarArr);
            }
        } else {
            i10 = ((org.telegram.ui.ActionBar.r2) wnVar).classGuid;
            b10 = a5.b(user, i10, g5VarArr);
        }
        if (c2.b.g(b10)) {
            c2.b.m().y((ViewGroup) wnVar.fragmentView, wnVar.ua, b10, new e7(this, s1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(wnVar, s1Var);
        final int i12 = 0;
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(this) { // from class: org.telegram.ui.um
            public final /* synthetic */ hn b;

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
                        this.b.b(user);
                        break;
                    default:
                        this.b.a.za(user);
                        break;
                }
            }
        }, false);
        H.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new q1(this, s1Var, user, 25), false);
        final int i13 = 1;
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new Runnable(this) { // from class: org.telegram.ui.um
            public final /* synthetic */ hn b;

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
                        this.b.b(user);
                        break;
                    default:
                        this.b.a.za(user);
                        break;
                }
            }
        }, r22);
        final int i14 = 2;
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new Runnable(this) { // from class: org.telegram.ui.um
            public final /* synthetic */ hn b;

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
                        this.b.b(user);
                        break;
                    default:
                        this.b.a.za(user);
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
    public final boolean X1(int i10) {
        boolean z10;
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.j5 j5Var2;
        if (i10 != 16 && i10 != R.id.acc_action_small_button && i10 != R.id.acc_action_msg_options) {
            return false;
        }
        wn wnVar = this.a;
        z10 = ((org.telegram.ui.ActionBar.r2) wnVar).inPreviewMode;
        if (!z10 || !wnVar.Z9) {
            return !c();
        }
        j5Var = ((org.telegram.ui.ActionBar.r2) wnVar).parentLayout;
        if (j5Var != null) {
            j5Var2 = ((org.telegram.ui.ActionBar.r2) wnVar).parentLayout;
            ((ActionBarLayout) j5Var2).r();
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void Z(int i10) {
        int i11;
        SpannableStringBuilder replaceTags;
        int i12;
        int i13 = 3;
        int i14 = 2;
        int i15 = 1;
        wn wnVar = this.a;
        try {
            if (i10 == 0) {
                wnVar.q7();
                fl flVar = wnVar.L3;
                if (flVar == null) {
                    return;
                }
                flVar.l(0L, 84, null, new sm(this, i15));
                wnVar.L3.performHapticFeedback(3, 2);
                return;
            }
            if (i10 == 1) {
                String formatDateTime = LocaleController.formatDateTime(wnVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                if (wnVar.getMessagesController().transcribeAudioTrialCooldownUntil > 0) {
                    i12 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeftUntil", org.telegram.ui.Components.m41.h(i12), formatDateTime));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeft", org.telegram.ui.Components.m41.h(i11), new Object[0]));
                }
                org.telegram.ui.Components.wc.b0(wnVar).G(R.raw.transcribe, 6, replaceTags).k(true);
                wnVar.fragmentView.performHapticFeedback(3, 2);
                return;
            }
            if (i10 == 2 || i10 == 3) {
                String formatDateTime2 = LocaleController.formatDateTime(wnVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(wnVar);
                int i16 = R.raw.transcribe;
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialEnd", wnVar.getMessagesController().transcribeAudioTrialWeeklyNumber, new Object[0]))).append((CharSequence) " ").append(i10 == 2 ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TranscriptionTrialEndBuy), new sm(this, i14)) : wnVar.getMessagesController().transcribeAudioTrialCooldownUntil <= 0 ? "" : AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TranscriptionTrialEndWaitOrBuy, formatDateTime2), new sm(this, i13)));
                b02.getClass();
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(b02.X(), b02.c);
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
                b02.b(ybVar, 7000).k(true);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void Z0(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
        if (s1Var == null || document == null) {
            return;
        }
        wn wnVar = this.a;
        if (wnVar.getParentLayout() == null || !W(s1Var)) {
            return;
        }
        org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(wnVar, s1Var);
        H.c(R.drawable.msg_download, LocaleController.getString(R.string.SaveToDownloads), new q1(this, s1Var, document, 24), false);
        H.t = false;
        H.Z();
    }

    @Override // org.telegram.ui.Cells.j1
    public final void Z1() {
        wn wnVar = this.a;
        if (!wnVar.getUserConfig().isPremium()) {
            org.telegram.ui.Components.wc.b0(wnVar).R(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("UnlockSimilarChannelsPremium", wnVar.getMessagesController().recommendedChannelsLimitPremium), new sm(this, 4))).j();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", wnVar.j6);
        bundle.putInt("start_from", 10);
        wnVar.presentFragment(new org.telegram.ui.Components.ua0(bundle, wnVar.m1.getSharedMediaPreloader()));
    }

    public final void a(TLRPC.Chat chat) {
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
                AndroidUtilities.runOnUIThread(new sm(this, 6), 200L);
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean a0() {
        return this.a.d4 == 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void a2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
        MessageObject messageObject;
        TLRPC.TL_factCheck factCheck;
        String str;
        wn wnVar = this.a;
        fi.v3 v3Var = wnVar.M1;
        if (v3Var != null) {
            v3Var.e(true);
        }
        if (wnVar.getParentActivity() == null || (messageObject = s1Var.getMessageObject()) == null || (factCheck = messageObject.getFactCheck()) == null || factCheck.country == null) {
            return;
        }
        try {
            str = new Locale("", factCheck.country).getDisplayCountry(LocaleController.getInstance().getCurrentLocale());
        } catch (Exception e) {
            FileLog.e(e);
            str = factCheck.country;
        }
        fi.v3 v3Var2 = new fi.v3(wnVar.getParentActivity(), 3);
        v3Var2.p(true);
        v3Var2.K = Layout.Alignment.ALIGN_NORMAL;
        v3Var2.d = -1L;
        v3Var2.T = true;
        v3Var2.e = true;
        v3Var2.q(12.0f);
        wnVar.M1 = v3Var2;
        v3Var2.l0 = new ed(20, this, v3Var2);
        v3Var2.s(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FactCheckToast, str)));
        wnVar.j1.addView(wnVar.M1, org.telegram.ui.Components.kb1.h(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
        wnVar.j1.post(new i2.b0(this, s1Var, i11, i10, 4));
    }

    public final void b(TLRPC.User user) {
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
                SpannableString spannableString = new SpannableString(org.telegram.ui.Components.b10.u(UserObject.getFirstName(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.b71("" + user.id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            wnVar.Y.setFieldText(spannableStringBuilder);
            AndroidUtilities.runOnUIThread(new sm(this, 7), 200L);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void b0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
        this.a.R7(s1Var, true, false, f7, f10, false, false, false);
    }

    @Override // org.telegram.ui.Cells.j1
    public final org.telegram.ui.Cells.t9 b2() {
        return this.a.s9;
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z10;
        wn wnVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
        if (kVar == null) {
            return false;
        }
        kVar2 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
        if (kVar2.q() || wnVar.M9()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.r2) wnVar).inPreviewMode;
        return !z10;
    }

    @Override // org.telegram.ui.Cells.j1
    public final int c0(org.telegram.ui.Cells.s1 s1Var) {
        sh.c cVar;
        wn wnVar = this.a;
        if (!wnVar.Xc.f || (cVar = wnVar.dd) == null || cVar.n != s1Var || cVar.a.getWidth() <= 0) {
            return 0;
        }
        return wnVar.dd.a.getHeight();
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean d() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void d0(org.telegram.ui.Cells.s1 s1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        wn wnVar = this.a;
        if (wnVar.getParentActivity() == null) {
            return;
        }
        if (wnVar.na == null) {
            wh.i iVar = new wh.i(wnVar.getParentActivity());
            wnVar.na = iVar;
            wnVar.j1.addView(iVar, org.telegram.ui.Components.kb1.i(-1, -1, 48));
        }
        wh.i iVar2 = wnVar.na;
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
        String b10 = wh.i.b(s1Var);
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
        wh.h hVar = new wh.h(iVar2, s1Var, arrayList4, new vi.k0(1, iVar2, b10));
        hVar.setBounds(0, 0, iVar2.getMeasuredWidth(), iVar2.getMeasuredHeight());
        hVar.setCallback(iVar2);
        if (hashMap.containsKey(b10)) {
            return;
        }
        hashMap.put(b10, hVar);
    }

    public final void e(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        int i10;
        org.telegram.ui.ActionBar.u6 u6Var;
        TLRPC.User currentUser = s1Var.getCurrentUser();
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
                i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                long j10 = -wnVar.e.id;
                u6Var = ((org.telegram.ui.ActionBar.r2) wnVar).resourceProvider;
                org.telegram.ui.Components.j11.b(parentActivity, i10, j10, currentUser, str2, z15, z16, z12, u6Var);
            }
            if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                if (ChatObject.isChannel(wnVar.e)) {
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                    wnVar.getMessagesController();
                    tL_channels_getParticipant.channel = MessagesController.getInputChannel(wnVar.e);
                    tL_channels_getParticipant.participant = wnVar.getMessagesController().getInputPeer(currentUser.id);
                    wnVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new org.telegram.messenger.a(), new bi.m5(11, this, s1Var));
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
        i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
        long j102 = -wnVar.e.id;
        u6Var = ((org.telegram.ui.ActionBar.r2) wnVar).resourceProvider;
        org.telegram.ui.Components.j11.b(parentActivity2, i10, j102, currentUser, str2, z152, z162, z12, u6Var);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean e0() {
        boolean z10;
        wn wnVar = this.a;
        if (wnVar.M9()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.r2) wnVar).inPreviewMode;
        return !z10;
    }

    public final void f() {
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.I1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        boolean isHuaweiStoreApp = BuildVars.isHuaweiStoreApp();
        wn wnVar = this.a;
        if (isHuaweiStoreApp) {
            qf.d.r(wnVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            qf.d.r(wnVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void f1(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
        wh.h hVar;
        wh.i iVar = this.a.na;
        if (iVar == null || (hVar = (wh.h) iVar.a.get(wh.i.b(s1Var))) == null) {
            return;
        }
        wh.d[] dVarArr = hVar.w;
        RectF rectF = hVar.r;
        if (hVar.M) {
            float f11 = (f7 - rectF.left) + hVar.U;
            float f12 = (f10 - rectF.top) + hVar.V;
            int i10 = wh.g.a;
            int b10 = (((float) (-AndroidUtilities.dp((float) 37))) >= f12 || f12 >= rectF.height()) ? -1 : a8.ee.b((int) Math.floor((f11 - (AndroidUtilities.dp(9) - (AndroidUtilities.dp(11) / 2.0f))) / AndroidUtilities.dp(wh.g.a + 11)), 0, dVarArr.length - 1);
            if (hVar.R == b10) {
                return;
            }
            hVar.a.performHapticFeedback(3, 1);
            hVar.R = b10;
            int i11 = 0;
            while (i11 < dVarArr.length) {
                wh.d dVar = dVarArr[i11];
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
                    dVar.n.setInterpolator(wh.f.a);
                    dVar.n.start();
                }
                wh.d dVar2 = dVarArr[i11];
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
                    dVar2.k.setInterpolator(wh.f.a);
                    dVar2.k.start();
                }
                i11++;
            }
        }
    }

    public final void g(org.telegram.ui.Cells.s1 s1Var, boolean z10, boolean z11, boolean z12) {
        MessageObject primaryMessageObject;
        int i10;
        int i11;
        uj ujVar;
        if (s1Var == null || (primaryMessageObject = s1Var.getPrimaryMessageObject()) == null) {
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
                    if (!(childAt instanceof org.telegram.ui.Cells.s1)) {
                        if (childAt instanceof org.telegram.ui.Cells.v0) {
                            i11 = wnVar.Y8(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.s1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = wnVar.Y8(childAt);
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
                uj ujVar2 = wnVar.z0;
                wnVar.x0.getClass();
                ujVar2.i1(RecyclerView.R(s1Var), s1Var.getTop() - ((int) wnVar.I9), false);
            } else {
                wnVar.z0.h1(i10, i11);
            }
        }
        wnVar.Z0 = z11;
        wnVar.Ic(primaryMessageObject, false);
        wnVar.Z0 = false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void g0(String str) {
        wn wnVar = this.a;
        nk nkVar = wnVar.a1;
        if (nkVar == null || nkVar.getVisibility() != 0) {
            mk mkVar = wnVar.R;
            if ((mkVar == null || mkVar.getVisibility() != 0) && wnVar.Y != null && str != null && str.length() > 0) {
                wnVar.Y.setFieldText("@" + str + " ");
                wnVar.Y.E0();
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final String h(org.telegram.ui.Cells.s1 s1Var) {
        wn wnVar;
        int i10;
        if (s1Var.getMessageObject() == null || (i10 = (wnVar = this.a).Wb) == 0 || i10 != s1Var.getMessageObject().getId() || wnVar.Xb != 3) {
            return null;
        }
        return wnVar.Zb;
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean h0(org.telegram.ui.Components.c6 c6Var) {
        TLRPC.InputStickerSet inputStickerSet;
        int i10;
        wn wnVar = this.a;
        if (wnVar.getMessagesController().premiumFeaturesBlocked() || c6Var == null || c6Var.standard) {
            return false;
        }
        long documentId = c6Var.getDocumentId();
        TLRPC.Document document = c6Var.document;
        if (document == null) {
            i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
            document = org.telegram.ui.Components.t5.f(i10, documentId);
        }
        if (document == null || (inputStickerSet = MessageObject.getInputStickerSet(document)) == null) {
            return false;
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, true);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(inputStickerSet);
        org.telegram.ui.Components.aw awVar = new org.telegram.ui.Components.aw(wnVar, wnVar.getParentActivity(), wnVar.ua, arrayList);
        org.telegram.ui.Components.qv qvVar = awVar.f;
        qvVar.getClass();
        ImageReceiver imageReceiver = new ImageReceiver(qvVar);
        qvVar.v = imageReceiver;
        if (qvVar.d) {
            imageReceiver.onAttachedToWindow();
        }
        qvVar.w = true;
        qvVar.x.d(1.0f, true);
        qvVar.v.setImage(ImageLocation.getForDocument(document), "140_140", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "140_140", DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.y6.m6, 0.2f, true), 0L, null, null, 0);
        qvVar.v.setLayerNum(7);
        qvVar.v.setAllowStartLottieAnimation(true);
        qvVar.v.setAllowStartAnimation(true);
        qvVar.v.setAutoRepeat(1);
        qvVar.v.setAllowDecodeSingleFrame(true);
        qvVar.v.setParentView(qvVar);
        awVar.setCalcMandatoryInsets(wnVar.I9());
        wnVar.showDialog(awVar);
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void i(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        int a2 = sh.i.a(messageObject);
        boolean a10 = a8.pf.a(a2, 7);
        wn wnVar = this.a;
        if (a10) {
            org.telegram.ui.Components.wc.b0(wnVar).R(R.raw.e_hand_2, 36, sh.i.b(messageObject, a2)).j();
            return;
        }
        if (i10 < 0 && !arrayList.isEmpty()) {
            wnVar.getSendMessagesHelper().sendVote(messageObject, arrayList, null);
            s1Var.R0(true);
            return;
        }
        if (wnVar.getParentActivity() == null) {
            return;
        }
        if (wnVar.z2 == null) {
            org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(5, wnVar.getParentActivity(), wnVar.ua, false);
            wnVar.z2 = t40Var;
            t40Var.setAlpha(0.0f);
            wnVar.z2.setVisibility(4);
            int indexOfChild = wnVar.j1.indexOfChild(wnVar.S);
            if (indexOfChild == -1) {
                return;
            } else {
                wnVar.j1.addView(wnVar.z2, indexOfChild + 1, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            }
        }
        if (!arrayList.isEmpty() || i10 >= 0) {
            i13 = i12;
            i14 = i11;
        } else {
            ArrayList<org.telegram.ui.Cells.q1> pollButtons = s1Var.getPollButtons();
            int size = pollButtons.size();
            int i16 = 0;
            float f7 = 0.0f;
            while (true) {
                if (i16 >= size) {
                    i13 = i12;
                    i15 = i11;
                    break;
                }
                org.telegram.ui.Cells.q1 q1Var = pollButtons.get(i16);
                float y3 = ((s1Var.getY() + q1Var.b) - AndroidUtilities.dp(4.0f)) - wnVar.I9;
                wnVar.C2 = AndroidUtilities.dp(13.3f) + q1Var.a;
                int w10 = d3.w(6.0f, q1Var.b, i12);
                wnVar.D2 = w10;
                if (y3 > 0.0f) {
                    i15 = wnVar.C2;
                    i13 = w10;
                    f7 = 0.0f;
                    break;
                }
                i16++;
                f7 = y3;
            }
            if (f7 != 0.0f) {
                wnVar.x0.w0(0, (int) f7, null);
                wnVar.B2 = s1Var;
                return;
            }
            i14 = i15;
        }
        wnVar.z2.e(s1Var, Integer.valueOf(i10), i14, i13, true);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void j() {
        f();
    }

    @Override // org.telegram.ui.Cells.j1
    public final void j0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
        wn wnVar = this.a;
        wnVar.R7(s1Var, false, false, f7, f10, true, false, false);
        wnVar.x0.getClass();
        wn.g2(wnVar, RecyclerView.R(s1Var));
    }

    public final boolean k() {
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

    @Override // org.telegram.ui.Cells.j1
    public final boolean k1() {
        wn wnVar = this.a;
        return wnVar.j1.getMeasuredWidth() > wnVar.j1.getMeasuredHeight();
    }

    @Override // org.telegram.ui.Cells.j1
    public final void l(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
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
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        MessageObject messageObject = s1Var.getMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if (messageMedia == null || messageObject == null || !(media instanceof TLRPC.TL_messageMediaPoll)) {
            return;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media;
        TLRPC.WebPage webPage = messageMedia.webpage;
        if (webPage != null) {
            v1(s1Var, webPage, webPage.url, messageMedia.safe);
            return;
        }
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        wn wnVar = this.a;
        if (geoPoint != null) {
            if (AndroidUtilities.isMapsInstalled(wnVar)) {
                en enVar = new en(3);
                u6Var2 = ((org.telegram.ui.ActionBar.r2) wnVar).resourceProvider;
                enVar.setResourceProvider(u6Var2);
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
                enVar.N0 = false;
                enVar.v0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                wnVar.presentFragment(enVar);
                return;
            }
            return;
        }
        if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
            ht.o().u(wnVar.getParentActivity());
            ht.o().t(new fn(this, tL_messageMediaPoll, pollAnswer, s1Var));
            ht o10 = ht.o();
            TLRPC.Document document4 = messageMedia.document;
            int i18 = MessageObject.isAnimatedEmoji(document4) ? 2 : 0;
            MessageObject messageObject2 = s1Var.getMessageObject();
            u6Var = ((org.telegram.ui.ActionBar.r2) wnVar).resourceProvider;
            o10.r(document4, null, "", null, null, i18, false, messageObject2, u6Var, 200);
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
            TLRPC.TL_message L7 = wn.L7(message);
            L7.media = messageMedia;
            L7.attachPath = sh.f.c(message, i10);
            ArrayList<MessageObject> arrayList = new ArrayList<>();
            i17 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
            MessageObject messageObject3 = new MessageObject(i17, L7, false, true);
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
            i15 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
            TLRPC.Document document6 = messageMedia.document;
            sh.a aVar = new sh.a(i15, messageObject, document6, sh.f.c(messageObject.messageOwner, i10));
            if (aVar.g) {
                FileLoader.getInstance(i15).cancelLoadFile(document6);
                aVar.a();
                MessageObject messageObject4 = s1Var.y7;
                if (messageObject4 == null || !messageObject4.isPoll()) {
                    return;
                }
                sh.g gVar = s1Var.c6;
                if (gVar != null) {
                    gVar.d();
                }
                sh.g gVar2 = s1Var.b6;
                if (gVar2 != null) {
                    gVar2.d();
                    return;
                }
                return;
            }
            if (!aVar.f) {
                FileLoader.getInstance(i15).loadFile(document6, messageObject, 2, 0);
                aVar.a();
                MessageObject messageObject5 = s1Var.y7;
                if (messageObject5 == null || !messageObject5.isPoll()) {
                    return;
                }
                sh.g gVar3 = s1Var.c6;
                if (gVar3 != null) {
                    gVar3.d();
                }
                sh.g gVar4 = s1Var.b6;
                if (gVar4 != null) {
                    gVar4.d();
                    return;
                }
                return;
            }
            TLRPC.Message message2 = messageObject.messageOwner;
            TLRPC.TL_message L72 = wn.L7(message2);
            L72.media = messageMedia;
            L72.attachPath = sh.f.c(message2, i10);
            i16 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
            gn gnVar = new gn(i16, L72, false, true);
            if (MessageObject.canPreviewDocument(messageMedia.document)) {
                PhotoViewer.v1().N2(null, wnVar, wnVar.ua);
                PhotoViewer v12 = PhotoViewer.v1();
                int i19 = gnVar.type;
                v12.i2(gnVar, wnVar, i19 != 0 ? wnVar.j6 : 0L, i19 != 0 ? wnVar.b7 : 0L, i19 != 0 ? wnVar.b() : 0L, wnVar.Wa);
                return;
            }
            try {
                AndroidUtilities.openForView(gnVar, wnVar.getParentActivity(), wnVar.ua, false);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                wnVar.F6(gnVar);
                return;
            }
        }
        TLRPC.Message message3 = messageObject.messageOwner;
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
        if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || MessageObject.isVideoDocument(document3))) {
            i11 = messageMedia3 == messageMedia ? arrayList3.size() : -1;
            TLRPC.TL_message L73 = wn.L7(message3);
            L73.media = messageMedia3;
            L73.attachPath = sh.f.c(message3, -2);
            i14 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
            arrayList3.add(new xm(i14, L73, false, true));
            arrayList2.add(-2);
        } else {
            i11 = -1;
        }
        if (messageObject.expandedExplanation && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || MessageObject.isVideoDocument(document2))) {
            if (messageMedia2 == messageMedia) {
                i11 = arrayList3.size();
            }
            TLRPC.TL_message L74 = wn.L7(message3);
            L74.media = messageMedia2;
            L74.attachPath = sh.f.c(message3, -3);
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            L74.message = pollResults2.solution;
            L74.entities = pollResults2.solution_entities;
            i13 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
            arrayList3.add(new ym(i13, L74, false, true));
            arrayList2.add(-3);
        }
        bg.d.b(tL_messageMediaPoll.poll, wnVar.getUserConfig().getClientUserId());
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
                TLRPC.TL_message L75 = wn.L7(message3);
                L75.media = messageMedia4;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                L75.message = tL_textWithEntities2.text;
                L75.entities = tL_textWithEntities2.entities;
                L75.attachPath = sh.f.c(message3, pollAnswer2.unshuffled_index);
                i12 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                arrayList3.add(new zm(i12, L75, false, true));
                arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
            }
        }
        if (i11 <= -1 || arrayList3.isEmpty()) {
            return;
        }
        messageObject.pollMediaMapping = arrayList2;
        PhotoViewer.v1().N2(null, wnVar, wnVar.ua);
        PhotoViewer.v1().e2(arrayList3, i11, wnVar.a(), 0L, 0L, wnVar.Xa);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void l1(org.telegram.ui.Cells.s1 s1Var, boolean z10, boolean z11) {
        g(s1Var, z10, false, z11);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void m(org.telegram.ui.Cells.s1 s1Var) {
        if (s1Var.getMessageObject().isImportedForward()) {
            U0();
            return;
        }
        wn wnVar = this.a;
        if (wnVar.x3 || wnVar.x0 == null || wnVar.getParentActivity() == null || wnVar.fragmentView == null) {
            return;
        }
        if (wnVar.G2 == null) {
            om omVar = wnVar.j1;
            int indexOfChild = omVar.indexOfChild(wnVar.S);
            if (indexOfChild == -1) {
                return;
            }
            org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(1, wnVar.getParentActivity(), wnVar.ua, false);
            wnVar.G2 = t40Var;
            omVar.addView(t40Var, indexOfChild + 1, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            wnVar.G2.setAlpha(0.0f);
            wnVar.G2.setVisibility(4);
        }
        wnVar.G2.e(s1Var, null, 0, 0, true);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void m0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f7, float f10) {
        org.telegram.ui.ActionBar.k kVar;
        wn wnVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
        boolean z10 = true;
        if (kVar.q() || wnVar.M9()) {
            wn.f2(wnVar, s1Var, true, f7, f10);
            return;
        }
        if (s1Var.getMessageObject() != null && s1Var.getMessageObject().isSponsored()) {
            E0(10, s1Var);
            return;
        }
        if (!ChatObject.isForum(wnVar.e) && !wnVar.R9()) {
            z10 = false;
        }
        y(user, z10);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void m1(org.telegram.ui.Cells.s1 s1Var) {
        wn.X4(this.a, s1Var);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void n() {
        this.a.j1.getClass();
    }

    @Override // org.telegram.ui.Cells.j1
    public final void n0(org.telegram.ui.Cells.s1 s1Var, bh.n nVar) {
        TLRPC.Message message;
        if (s1Var == null) {
            nVar.run();
            return;
        }
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject == null || ((messageObject.isSending() && !messageObject.isEditing()) || (message = messageObject.messageOwner) == null || message.rich_message == null)) {
            nVar.run();
        } else {
            org.telegram.ui.ActionBar.r2 r2Var = this.a;
            r2Var.getSendMessagesHelper().editRichMessage(messageObject, messageObject.messageOwner.rich_message, null, r2Var, true);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void n1(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        g(s1Var, z10, false, false);
    }

    public final void o(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, boolean z10) {
        wn wnVar = this.a;
        TLRPC.Chat chat2 = wnVar.e;
        if (chat2 != null && chat.id == chat2.id) {
            lj ljVar = wnVar.m1;
            if (ljVar != null && i10 == 0) {
                ljVar.e(false, false);
                return;
            } else {
                if (s1Var.getMessageObject() != null) {
                    wnVar.j(i10, s1Var.getMessageObject().getId(), true, 0, false, 0);
                    return;
                }
                return;
            }
        }
        if (chat2 == null || chat.id != chat2.id || wnVar.R9()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            vi viVar = null;
            if (z10) {
                qf.c cVar = wnVar.ac;
                if (cVar != null) {
                    cVar.a(true);
                    wnVar.ac = null;
                }
                if (s1Var.getMessageObject() == null) {
                    wnVar.ac = null;
                } else {
                    vi viVar2 = new vi(wnVar, s1Var.getMessageObject().getId(), s1Var, 0);
                    wnVar.ac = viVar2;
                    viVar = viVar2;
                }
            }
            if (wnVar.getMessagesController().checkCanOpenChat(bundle, wnVar, s1Var.getMessageObject(), viVar)) {
                wn wnVar2 = new wn(bundle);
                if (viVar == null || i10 == 0) {
                    wnVar.presentFragment(wnVar2);
                } else {
                    AndroidUtilities.runOnUIThread(new bi.sb(this, viVar, chat, i10, wnVar2, 18), 5000L);
                    viVar.d();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:277:0x0b0d, code lost:
    
        if (r0.exists() != false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0bd1, code lost:
    
        if (r4.startsWith("text/x-web-markdown") == false) goto L320;
     */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0c1c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:328:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Cells.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10, boolean z10) {
        int i10;
        MessageObject messageObject;
        boolean z11;
        MessageObject messageObject2;
        wn wnVar;
        boolean z12;
        long j10;
        long j11;
        File file;
        TLRPC.Chat chat;
        float f11;
        float f12;
        su0 su0Var;
        int i11;
        char c10;
        MessageObject messageObject3;
        MessageObject messageObject4;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        int i12;
        MessageObject messageObject5 = s1Var.getMessageObject();
        int i13 = messageObject5.type;
        wn wnVar2 = this.a;
        if (i13 == 23) {
            TLRPC.MessageMedia messageMedia2 = messageObject5.messageOwner.media;
            TL_stories.StoryItem storyItem = messageMedia2.storyItem;
            if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                return;
            }
            storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia2.peer);
            storyItem.messageId = messageObject5.getId();
            storyItem.messageType = 2;
            di.a8.b(storyItem, wnVar2.f);
            wnVar2.getOrCreateStoryViewer().G(wnVar2.getParentActivity(), messageObject5.messageOwner.media.storyItem, di.q7.a(wnVar2.x0));
            return;
        }
        int i14 = 1;
        if (messageObject5.isVideo()) {
            i12 = ((org.telegram.ui.ActionBar.r2) wnVar2).currentAccount;
            if (DownloadController.getInstance(i12).canDownloadMedia(messageObject5.messageOwner) == 1) {
                messageObject5.putInDownloadsStore = true;
            }
        } else {
            messageObject5.putInDownloadsStore = true;
        }
        if (messageObject5.isSendError()) {
            wnVar2.R7(s1Var, false, false, f7, f10, true, false, false);
            return;
        }
        if (messageObject5.isSending()) {
            return;
        }
        int i15 = 0;
        if (z10 && (message = messageObject5.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && !TextUtils.isEmpty(webPage.url)) {
            String str = messageObject5.messageOwner.media.webpage.url;
            AndroidUtilities.getHostAuthority(str);
            if (wnVar2.ra(str, s1Var, null, messageObject5.getId(), 2)) {
                return;
            }
            qf.c cVar = wnVar2.ac;
            if (cVar != null) {
                cVar.a(true);
            }
            wnVar2.ac = s1Var.getMessageObject() != null ? new an(this, s1Var, i15) : null;
            qf.d.q(wnVar2.getParentActivity(), Uri.parse(str), true, false, false, wnVar2.ac, null, false, true, false);
            return;
        }
        int i16 = 5;
        if (messageObject5.isDice()) {
            tm tmVar = new tm(this, messageObject5, i15);
            if (messageObject5.isStakeableDice()) {
                wnVar2.getMessagesController().loadStakeDiceInfo(new y(this, messageObject5, tmVar, i16));
                return;
            } else {
                tmVar.run();
                return;
            }
        }
        if ((messageObject5.isAnimatedEmoji() && (!messageObject5.isAnimatedAnimatedEmoji() || (wnVar2.Na.e.containsKey(qy.p(MessageObject.findAnimatedEmojiEmoticon(messageObject5.getDocument()))) && wnVar2.f != null))) || messageObject5.isPremiumSticker()) {
            wnVar2.Za(s1Var);
            wnVar2.Na.k(s1Var, wnVar2, true);
            wnVar2.x0.I0(false);
            return;
        }
        int i17 = 6;
        if (messageObject5.needDrawBluredPreview()) {
            te ub2 = wnVar2.ub(messageObject5, false);
            a3.i0 S4 = wn.S4(wnVar2, messageObject5);
            s1Var.invalidate();
            final SecretMediaViewer f13 = SecretMediaViewer.f();
            final Activity parentActivity = wnVar2.getParentActivity();
            int i18 = UserConfig.selectedAccount;
            f13.a = i18;
            ImageReceiver imageReceiver = f13.h;
            imageReceiver.setCurrentAccount(i18);
            if (f13.b == parentActivity) {
                f11 = 0.0f;
            } else {
                f13.b = parentActivity;
                f13.g1 = new org.telegram.ui.Components.vn0(parentActivity, null);
                k0 k0Var = new k0(f13, parentActivity, 22);
                f13.d = k0Var;
                k0Var.setBackgroundDrawable(f13.l0);
                f13.d.setFocusable(true);
                f13.d.setFocusableInTouchMode(true);
                f13.d.setClipChildren(false);
                f13.d.setClipToPadding(false);
                f13.e = new bh.p(f13, parentActivity);
                View view = new View(parentActivity);
                f13.f = view;
                view.setBackgroundColor(2130706432);
                f13.e.addView(f13.f, org.telegram.ui.Components.kb1.i(-1, -2, 80));
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
                f13.L0 = gestureDetector;
                gestureDetector.setOnDoubleTapListener(f13);
                org.telegram.ui.Components.b8 b8Var = new org.telegram.ui.Components.b8(f13, parentActivity, i17);
                f13.F = b8Var;
                b8Var.setTitleColor(-1);
                f13.F.setSubtitleColor(-1);
                f13.F.setBackgroundColor(2130706432);
                f13.F.setOccupyStatusBar(true);
                f13.F.x(1090519039, false);
                f13.F.y(-1, false);
                f13.F.setBackButtonImage(R.drawable.ic_ab_back);
                f13.F.setTitleRightMargin(AndroidUtilities.dp(70.0f));
                f13.e.addView(f13.F, org.telegram.ui.Components.kb1.g(-2.0f, -1));
                f13.F.setActionBarMenuOnItemClick(new r11(f13, 5));
                fi.v3 v3Var = new fi.v3(parentActivity, 1);
                f13.r = v3Var;
                v3Var.l(1.0f, -26.0f);
                f13.r.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                f13.e.addView(f13.r, org.telegram.ui.Components.kb1.h(-1, 80.0f, 53, 0.0f, 48.0f, 0.0f, 0.0f));
                y31 y31Var = new y31(f13, parentActivity);
                f13.n = y31Var;
                f13.e.addView(y31Var, org.telegram.ui.Components.kb1.h(119, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
                wv0 wv0Var = new wv0(f13, i14);
                f13.U = new z31(f13, parentActivity);
                View view2 = new View(parentActivity);
                f13.T = view2;
                view2.setBackgroundColor(2130706432);
                f13.U.addView(f13.T, org.telegram.ui.Components.kb1.i(-1, -1, 119));
                org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(f13.e.getContext());
                f13.S = b6Var;
                b6Var.setTextColor(-1);
                f13.S.setGravity(53);
                f13.S.setTextSize(14);
                f13.S.setImportantForAccessibility(2);
                f13.U.addView(f13.S, org.telegram.ui.Components.kb1.h(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
                b20 b20Var = new b20(f13, parentActivity, 8);
                f13.R = b20Var;
                org.telegram.ui.Components.v81 v81Var = new org.telegram.ui.Components.v81(b20Var);
                f13.Q = v81Var;
                v81Var.z = AndroidUtilities.dp(2.0f);
                org.telegram.ui.Components.v81 v81Var2 = f13.Q;
                v81Var2.k = 872415231;
                v81Var2.l = 872415231;
                v81Var2.m = -1;
                v81Var2.n = -1;
                v81Var2.A = 1509949439;
                v81Var2.j = wv0Var;
                f13.U.addView(f13.R);
                f13.e.addView(f13.U, org.telegram.ui.Components.kb1.i(-1, 48, 80));
                ls0 ls0Var = new ls0(null, new di.b());
                f13.Y = ls0Var;
                ls0Var.j0 = true;
                ls0Var.h0 = false;
                gu0 gu0Var = new gu0(f13.e.getContext());
                f13.Z = gu0Var;
                gu0Var.setFactory(new ViewSwitcher.ViewFactory() { // from class: org.telegram.ui.s31
                    @Override // android.widget.ViewSwitcher.ViewFactory
                    public final View makeView() {
                        SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
                        return new fu0(parentActivity, secretMediaViewer.a0, secretMediaViewer.Y, new e5(secretMediaViewer, 22), new zf0(secretMediaViewer, 2));
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
                imageView.setBackground(org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(64.0f), 1711276032));
                org.telegram.ui.Components.eh0 eh0Var = new org.telegram.ui.Components.eh0(28);
                f13.W = eh0Var;
                eh0Var.setCallback(f13.V);
                f13.V.setImageDrawable(f13.W);
                f13.V.setScaleType(ImageView.ScaleType.CENTER);
                f13.V.setScaleX(0.6f);
                f13.V.setScaleY(0.6f);
                f11 = 0.0f;
                f13.V.setAlpha(0.0f);
                f13.V.setPivotX(AndroidUtilities.dp(32.0f));
                f13.V.setPivotY(AndroidUtilities.dp(32.0f));
                f13.e.addView(f13.V, org.telegram.ui.Components.kb1.i(64, 64, 17));
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
                org.telegram.ui.Cells.ea n10 = f13.Y.n(f13.d.getContext());
                if (n10 != null) {
                    AndroidUtilities.removeFromParent(n10);
                    f13.e.addView(n10);
                }
                f13.Y.S(f13.e);
                f13.Y.i0 = true;
            }
            SecretMediaViewer f14 = SecretMediaViewer.f();
            ol olVar = wnVar2.Wa;
            SecretMediaViewer.PhotoBackgroundDrawable photoBackgroundDrawable = f14.l0;
            ImageReceiver imageReceiver2 = f14.h;
            if (f14.b == null || !messageObject5.needDrawBluredPreview() || olVar == null) {
                return;
            }
            float f15 = f11;
            su0 E = olVar.E(messageObject5, null, 0, true, false);
            if (E == null) {
                return;
            }
            f14.q1 = messageObject5.messageOwner.ttl == Integer.MAX_VALUE;
            f14.p1 = S4;
            f14.N = olVar;
            f14.K = System.currentTimeMillis();
            f14.L = 0L;
            f14.k0 = true;
            f14.j0 = true;
            f14.p0 = false;
            m4 m4Var = f14.w;
            if (m4Var != null) {
                m4Var.setVisibility(4);
            }
            f14.i();
            f14.N0 = f15;
            f14.O0 = 1.0f;
            f14.P0 = f15;
            f14.Q0 = f15;
            f14.R0 = f15;
            f14.S0 = f15;
            f14.T0 = f15;
            f14.U0 = f15;
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
                    if (i19 >= iArr2.length) {
                        break;
                    }
                    f14.H0[i19] = iArr2[i19];
                    i19++;
                }
            } else {
                f14.H0 = null;
            }
            float f16 = E.b;
            float f17 = rectF.left;
            f14.w0 = ((width / 2.0f) + (f16 + f17)) - (r9 / 2);
            f14.x0 = ((height / 2.0f) + (E.c + rectF.top)) - (r8 / 2);
            f14.v0 = Math.abs(f17 - E.a.getImageX());
            int abs = (int) Math.abs(rectF.top - E.a.getImageY());
            E.d.getLocationInWindow(new int[2]);
            float f18 = (r2[1] - (E.c + rectF.top)) + E.j;
            f14.r0 = f18;
            float f19 = abs;
            f14.r0 = Math.max(f15, Math.max(f18, f19));
            float height2 = (((E.c + rectF.top) + ((int) height)) - (E.d.getHeight() + r2[1])) + E.i;
            f14.s0 = height2;
            f14.s0 = Math.max(f15, Math.max(height2, f19));
            f14.t0 = f15;
            f14.t0 = Math.max(f15, Math.max(f15, f19));
            f14.u0 = f15;
            f14.u0 = Math.max(f15, Math.max(f15, f19));
            f14.J0 = System.currentTimeMillis();
            f14.z0 = f15;
            f14.A0 = f15;
            f14.D0 = f15;
            f14.F0 = f15;
            f14.G0 = f15;
            f14.C0 = f15;
            f14.E0 = f15;
            f14.B0 = 1.0f;
            f14.I0 = true;
            f14.e1 = true;
            ag.b1 b1Var = f14.l1;
            if (b1Var != null) {
                b1Var.destroy();
                f14.l1 = null;
            }
            LaunchActivity launchActivity = LaunchActivity.I1;
            f14.l1 = launchActivity != null ? new ag.b1(launchActivity, true) : null;
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
                    String str2 = messageObject5.messageOwner.attachPath;
                    ImageLocation forDocument = (str2 == null || !messageObject5.attachPathExists) ? ImageLocation.getForDocument(document) : ImageLocation.getForPath(str2);
                    f12 = 1.0f;
                    su0Var = E;
                    i11 = 4;
                    c10 = 6;
                    messageObject4 = messageObject5;
                    imageReceiver2.setImage(forDocument, (String) null, f14.i0 != null ? new BitmapDrawable(f14.i0.bitmap) : null, -1L, (String) null, messageObject4, 1);
                } else {
                    f12 = 1.0f;
                    su0Var = E;
                    i11 = 4;
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
                f12 = 1.0f;
                su0Var = E;
                i11 = 4;
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
                y31 y31Var2 = f14.n;
                y31Var2.e = true;
                TextPaint textPaint = y31Var2.r;
                textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
                textPaint.setColor(-1);
                StaticLayout staticLayout = new StaticLayout("1", textPaint, 999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                y31Var2.s = staticLayout;
                y31Var2.v = staticLayout.getLineCount() > 0 ? y31Var2.s.getLineWidth(0) : 0.0f;
                y31Var2.w = y31Var2.s.getHeight();
                y31Var2.invalidate();
                f14.n.setOnClickListener(new v21(f14, i11));
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
            org.telegram.ui.Components.b8 b8Var2 = f14.F;
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b8Var2, (Property<org.telegram.ui.Components.b8, Float>) property, 0.0f, 1.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(f14.a0, (Property<qt0, Float>) property, 0.0f, 1.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(f14.r, (Property<fi.v3, Float>) property, 0.0f, 1.0f);
            int i21 = 0;
            ObjectAnimator ofInt = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.v6.d, 0, 255);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(f14, f14.v1, 0.0f, 1.0f);
            z31 z31Var = f14.U;
            int i22 = i11;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(z31Var, z31Var.n, f12);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(f14.U, (Property<z31, Float>) property, f14.J ? f12 : 0.0f);
            Animator[] animatorArr = new Animator[7];
            animatorArr[0] = ofFloat;
            animatorArr[1] = ofFloat2;
            animatorArr[2] = ofFloat3;
            animatorArr[3] = ofInt;
            animatorArr[i22] = ofFloat4;
            animatorArr[5] = ofFloat5;
            animatorArr[c10] = ofFloat6;
            animatorSet.playTogether(animatorArr);
            f14.m0 = 3;
            f14.o0 = new t31(f14, ub2, messageObject3, i21);
            f14.K0.setDuration(250L);
            f14.K0.addListener(new w31(f14, i21));
            f14.n0 = System.currentTimeMillis();
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                f14.e.setLayerType(2, null);
            }
            f14.K0.setInterpolator(new DecelerateInterpolator());
            photoBackgroundDrawable.b = 0;
            photoBackgroundDrawable.a = new by0(18, f14, su0Var);
            f14.K0.start();
            return;
        }
        if (MessageObject.isAnimatedEmoji(messageObject5.getDocument()) && MessageObject.getInputStickerSet(messageObject5.getDocument()) != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(MessageObject.getInputStickerSet(messageObject5.getDocument()));
            org.telegram.ui.Components.aw awVar = new org.telegram.ui.Components.aw(wnVar2, wnVar2.getParentActivity(), wnVar2.ua, arrayList);
            awVar.setCalcMandatoryInsets(wnVar2.I9());
            wnVar2.showDialog(awVar);
            return;
        }
        if (messageObject5.getInputStickerSet() != null) {
            org.telegram.ui.Components.dz0 dz0Var = new org.telegram.ui.Components.dz0(wnVar2.getParentActivity(), wnVar2, messageObject5.getInputStickerSet(), null, (wnVar2.a1.getVisibility() == 0 || !((chat = wnVar2.e) == null || ChatObject.canSendStickers(chat))) ? null : wnVar2.Y, wnVar2.ua);
            dz0Var.setCalcMandatoryInsets(wnVar2.I9());
            wnVar2.showDialog(dz0Var);
            return;
        }
        if (messageObject5.isVideo() || (i10 = messageObject5.type) == 1 || ((i10 == 0 && !messageObject5.isWebpageDocument()) || messageObject5.isGif())) {
            if (messageObject5.isSponsored()) {
                if (messageObject5.isGif() || messageObject5.isPhoto()) {
                    int i23 = 1;
                    wnVar2.W9(messageObject5, true, false);
                    if (messageObject5.sponsoredUrl != null) {
                        qf.c cVar2 = wnVar2.ac;
                        if (cVar2 != null) {
                            cVar2.a(true);
                        }
                        wnVar2.ac = s1Var.getMessageObject() == null ? null : new an(this, s1Var, i23);
                        qf.d.q(wnVar2.getParentActivity(), Uri.parse(messageObject5.sponsoredUrl), true, false, false, wnVar2.ac, null, false, wnVar2.getMessagesController().sponsoredLinksInappAllow, false);
                        return;
                    }
                    return;
                }
                if (messageObject5.isVideo()) {
                    wnVar2.W9(messageObject5, true, false);
                }
            }
            if (messageObject5.getDuration() > 0.0d && messageObject5.getVideoStartsTimestamp() > 0 && !messageObject5.openedInViewer) {
                messageObject5.forceSeekTo = (float) (messageObject5.getVideoStartsTimestamp() / messageObject5.getDuration());
            }
            wnVar2.ua(s1Var, messageObject5);
            return;
        }
        int i24 = messageObject5.type;
        if (i24 == 3) {
            wnVar2.ub(messageObject5, true);
            try {
                String str3 = messageObject5.messageOwner.attachPath;
                File file4 = (str3 == null || str3.length() == 0) ? null : new File(messageObject5.messageOwner.attachPath);
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
            } catch (Exception e10) {
                FileLog.e(e10);
                wnVar2.F6(messageObject5);
                return;
            }
        }
        if (i24 == 4) {
            if (AndroidUtilities.isMapsInstalled(wnVar2)) {
                if (!messageObject5.isLiveLocation()) {
                    rc0 rc0Var = new rc0(wnVar2.h == null ? 3 : 0);
                    rc0Var.E0 = wnVar2;
                    rc0Var.v0(messageObject5);
                    wnVar2.presentFragment(rc0Var);
                    return;
                }
                TLRPC.Chat chat2 = wnVar2.e;
                rc0 rc0Var2 = new rc0((chat2 == null || ChatObject.canSendMessages(chat2) || wnVar2.e.megagroup) ? 2 : 6);
                rc0Var2.E0 = wnVar2;
                rc0Var2.v0(messageObject5);
                wnVar2.presentFragment(rc0Var2);
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
                File pathToMessage2 = wnVar2.getFileLoader().getPathToMessage(messageObject5.messageOwner);
                if (pathToMessage2.exists()) {
                    file = pathToMessage2;
                }
            }
            org.telegram.ui.ActionBar.x6 u10 = org.telegram.ui.ActionBar.y6.u(file, messageObject5.getDocumentName(), null, true);
            if (u10 != null) {
                wnVar2.presentFragment(new vc1(u10));
                return;
            }
            wnVar2.J4 = -1;
        }
        if (messageObject5.canPreviewDocument()) {
            PhotoViewer.v1().N2(null, wnVar2, wnVar2.ua);
            PhotoViewer v12 = PhotoViewer.v1();
            int i25 = messageObject5.type;
            long j12 = i25 != 0 ? wnVar2.j6 : 0L;
            if (i25 != 0) {
                j11 = 0;
                j10 = wnVar2.b7;
            } else {
                j10 = 0;
                j11 = 0;
            }
            if (i25 != 0) {
                j11 = wnVar2.b();
            }
            messageObject = messageObject5;
            v12.i2(messageObject, wnVar2, j12, j10, j11, wnVar2.Wa);
            z11 = true;
        } else {
            messageObject = messageObject5;
            z11 = false;
        }
        Pattern pattern = org.telegram.ui.Components.oa0.a;
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
            if (z12) {
                try {
                    AndroidUtilities.openForView(messageObject2, wnVar.getParentActivity(), wnVar.ua, false);
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    wnVar.F6(messageObject2);
                    return;
                }
            }
            return;
        }
        if (wnVar2.getParentActivity() == null) {
            wnVar = wnVar2;
            messageObject2 = messageObject;
        } else {
            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(wnVar2.getParentActivity(), 3, wnVar2.ua);
            e2Var.setCanceledOnTouchOutside(false);
            boolean[] zArr = {false};
            e2Var.setOnCancelListener(new xg(0, zArr));
            e2Var.r(150L);
            MessageObject messageObject6 = messageObject;
            m4.v0 v0Var = new m4.v0(wnVar2, messageObject6, e2Var, zArr, 15);
            messageObject2 = messageObject6;
            wnVar = wnVar2;
            new Thread(v0Var).start();
        }
        z12 = true;
        if (z12) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0118, code lost:
    
        if (r1.noforwards == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0124, code lost:
    
        if (org.telegram.messenger.ChatObject.isPublic(r1) != false) goto L90;
     */
    @Override // org.telegram.ui.Cells.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(org.telegram.ui.Cells.s1 s1Var) {
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
        wn wnVar = this.a;
        if (wnVar.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.f41 f41Var = wnVar.d2;
        boolean z10 = true;
        if (f41Var != null && wnVar.p4 == 0 && (s1Var.T7 || s1Var.U7)) {
            f41Var.n(s1Var.getMessageObject().getTopicId(), true);
            return;
        }
        if (wnVar.getMessagesController().isFrozen()) {
            i13 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
            b.b(i13);
            return;
        }
        jk jkVar = wnVar.Y;
        if (jkVar != null) {
            jkVar.L();
        }
        MessageObject messageObject = s1Var.getMessageObject();
        int i14 = wnVar.d4;
        if (i14 == 2) {
            wnVar.l9.Q0(messageObject.getId());
            wnVar.finishFragment();
            return;
        }
        if (i14 == 3 || ((i14 == 7 && wnVar.a4 == 2) || !((!UserObject.isReplyUser(wnVar.f) && !UserObject.isUserSelf(wnVar.f)) || (messageFwdHeader = messageObject.messageOwner.fwd_from) == null || messageFwdHeader.saved_from_peer == null))) {
            if (UserObject.isReplyUser(wnVar.f) && (messageReplyHeader = (message = messageObject.messageOwner).reply_to) != null && (i10 = messageReplyHeader.reply_to_top_id) != 0) {
                wnVar.na(messageReplyHeader.reply_to_peer_id.channel_id, null, i10, 0L, -1, message.fwd_from.saved_from_msg_id, messageObject);
                return;
            } else if (wnVar.d4 == 7 && wnVar.a4 == 2) {
                wnVar.sa(messageObject);
                return;
            } else {
                wnVar.ta(messageObject);
                return;
            }
        }
        ArrayList<MessageObject> arrayList = (messageObject.getGroupId() == 0 || (groupedMessages = (MessageObject.GroupedMessages) wnVar.N6.f(messageObject.getGroupId())) == null) ? null : groupedMessages.messages;
        if (arrayList == null) {
            arrayList = org.telegram.messenger.t.l(messageObject);
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
                boolean z11 = z10;
                wnVar.showDialog(new bn(this, wnVar.getParentActivity(), wnVar, arrayList, ChatObject.isChannel(wnVar.e), z11, wnVar.ua, z11, messageObject));
                Activity parentActivity = wnVar.getParentActivity();
                i11 = ((org.telegram.ui.ActionBar.r2) wnVar).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
                wnVar.fragmentView.requestLayout();
            }
        }
        z10 = false;
        boolean z112 = z10;
        wnVar.showDialog(new bn(this, wnVar.getParentActivity(), wnVar, arrayList, ChatObject.isChannel(wnVar.e), z112, wnVar.ua, z112, messageObject));
        Activity parentActivity2 = wnVar.getParentActivity();
        i11 = ((org.telegram.ui.ActionBar.r2) wnVar).classGuid;
        AndroidUtilities.setAdjustResizeToNothing(parentActivity2, i11);
        wnVar.fragmentView.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.j1
    public final boolean p1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        a5 a5Var;
        nk nkVar;
        mk mkVar;
        if (!k()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(ChatObject.getPublicUsername(chat));
        wn wnVar = this.a;
        int i14 = (isEmpty || wnVar.e == null || ((nkVar = wnVar.a1) != null && nkVar.getVisibility() == 0) || ((mkVar = wnVar.R) != null && mkVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat2 = wnVar.e;
        int i15 = (chat2 == null || !(wnVar.p4 == 0 || wnVar.t4) || (ChatObject.isChannel(chat2) && !wnVar.e.megagroup)) ? 0 : 1;
        TLRPC.Chat chat3 = wnVar.e;
        int i16 = (chat3 == null || chat3.id != chat.id || wnVar.R9()) ? 1 : 0;
        g5[] g5VarArr = new g5[i16 + 1 + i14 + i15];
        g5VarArr[0] = g5.d;
        if (i16 != 0) {
            g5VarArr[1] = chat.broadcast ? g5.e : g5.f;
            i10 = 2;
        } else {
            i10 = 1;
        }
        if (i14 != 0) {
            g5VarArr[i10] = g5.n;
            i10++;
        }
        if (i15 != 0) {
            g5VarArr[i10] = g5.r;
        }
        TLRPC.ChatFull chatFull = wnVar.getMessagesController().getChatFull(chat.id);
        if (chatFull != null) {
            a5Var = a5.a(chat, chatFull, g5VarArr);
            i13 = i15;
            i12 = i16;
            z10 = true;
            z11 = i14;
        } else {
            i11 = ((org.telegram.ui.ActionBar.r2) wnVar).classGuid;
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
            a5Var = new a5(forUserOrChat, forUserOrChat2, null, str, null, null, chatPhoto != null ? chatPhoto.strippedBitmap : null, chat, g5VarArr, new z4(i11, chat, NotificationCenter.chatInfoDidLoad));
        }
        if (c2.b.g(a5Var)) {
            c2.b.m().y((ViewGroup) wnVar.fragmentView, wnVar.ua, a5Var, new e7(this, chat, s1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(wnVar, s1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new vm(this, chat, 0), false);
        boolean z12 = chat.broadcast;
        H.l(z12 ? R.drawable.msg_channel : R.drawable.msg_discussion, LocaleController.getString(z12 ? R.string.OpenChannel2 : R.string.OpenGroup2), new q1(this, s1Var, chat, 26), i12);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new vm(this, chat, 1), z11);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new vm(this, chat, 2), i13);
        H.t = false;
        H.i = 3;
        boolean z13 = z10;
        H.W = z13;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return z13;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void q() {
        this.a.oc();
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean q0(MessageObject messageObject) {
        return !this.a.s.containsKey(messageObject);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void q1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        wn wnVar = this.a;
        if (wnVar.L9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) bg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) bg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
        if (wnVar.getParentActivity() != null) {
            if (wnVar.a1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                if (tL_inlineButtonTypeCopy == null) {
                    if (tL_inlineButtonTypeUrl != null) {
                        wnVar.ma(null, tL_inlineButtonTypeUrl.url, true, s1Var, s1Var.getMessageObject());
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
                org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) wnVar.getParentActivity(), (org.telegram.ui.ActionBar.u6) wnVar.ua, false);
                k3Var.fixNavigationBar();
                k3Var.title = str;
                k3Var.bigTitle = false;
                k3Var.multipleLinesTitle = true;
                CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Copy)};
                ng.j jVar = new ng.j(3, wnVar, str);
                k3Var.items = charSequenceArr;
                k3Var.onClickListener = jVar;
                wnVar.showDialog(k3Var);
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void r(org.telegram.ui.Cells.s1 s1Var) {
        int i10;
        int i11;
        uj ujVar;
        MessageObject primaryMessageObject = s1Var.getPrimaryMessageObject();
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
                    if (!(childAt instanceof org.telegram.ui.Cells.s1)) {
                        if (childAt instanceof org.telegram.ui.Cells.v0) {
                            i11 = wnVar.Y8(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.s1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = wnVar.Y8(childAt);
                            break;
                        }
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        wnVar.Ic(primaryMessageObject, false);
        fi.v3 v3Var = wnVar.M1;
        if (v3Var != null) {
            v3Var.e(true);
        }
        if (i10 < 0 || s1Var.getCurrentMessagesGroup() != null) {
            return;
        }
        wnVar.z0.h1(i10, i11);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void r0(org.telegram.ui.Cells.s1 s1Var) {
        sh.c cVar = this.a.dd;
        if (cVar == null || cVar.n != s1Var) {
            return;
        }
        cVar.w.getClass();
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean r1() {
        wn wnVar = this.a;
        return wnVar.j1.getKeyboardHeight() + wnVar.Ea >= AndroidUtilities.dp(20.0f);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void s(org.telegram.ui.Cells.s1 s1Var) {
        int i10;
        long j10;
        MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
        MessageObject messageObject = (currentMessagesGroup == null || currentMessagesGroup.messages.isEmpty()) ? s1Var.getMessageObject() : currentMessagesGroup.messages.get(0);
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
        wn wnVar = this.a;
        wnVar.na(wnVar.e.id, messageObject, messageObject.getId(), j11, i11, 0, null);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void s0() {
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        org.telegram.ui.Components.g6 animation;
        wn wnVar = this.a;
        if (wnVar.x3 || SharedConfig.noSoundHintShowed || wnVar.x0 == null || wnVar.getParentActivity() == null || wnVar.fragmentView == null) {
            return;
        }
        org.telegram.ui.Components.t40 t40Var = wnVar.F2;
        if (t40Var == null || t40Var.getTag() == null) {
            if (wnVar.F2 == null) {
                om omVar = wnVar.j1;
                int indexOfChild = omVar.indexOfChild(wnVar.S);
                if (indexOfChild == -1) {
                    return;
                }
                org.telegram.ui.Components.t40 t40Var2 = new org.telegram.ui.Components.t40(0, wnVar.getParentActivity(), wnVar.ua, false);
                wnVar.F2 = t40Var2;
                t40Var2.setShowingDuration(10000L);
                omVar.addView(wnVar.F2, indexOfChild + 1, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                wnVar.F2.setAlpha(0.0f);
                wnVar.F2.setVisibility(4);
            }
            int childCount = wnVar.x0.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = wnVar.x0.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) != null && messageObject.isVideo() && (animation = s1Var.getPhotoImage().getAnimation()) != null && animation.o() >= 3000 && wnVar.F2.e(s1Var, null, 0, 0, true)) {
                    SharedConfig.setNoSoundHintShowed(true);
                    return;
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void s1(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        wn wnVar = this.a;
        wnVar.t5 = messageObject;
        wnVar.q9();
    }

    public final void t(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            org.telegram.ui.ActionBar.r2 r2Var = this.a;
            if (r2Var.getMessagesController().checkCanOpenChat(bundle, r2Var, s1Var.getMessageObject())) {
                r2Var.presentFragment(new wn(bundle));
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void t0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z10) {
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.j5 j5Var2;
        wn wnVar = this.a;
        if (wnVar.getParentActivity() == null || tLObject == null) {
            return;
        }
        j5Var = ((org.telegram.ui.ActionBar.r2) wnVar).parentLayout;
        if (j5Var != null) {
            j5Var2 = ((org.telegram.ui.ActionBar.r2) wnVar).parentLayout;
            if (((ActionBarLayout) j5Var2).x()) {
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
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, wnVar.getResourceProvider());
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(wnVar.getParentActivity(), false, false);
        g1Var.j(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
        g1Var.setMinimumWidth(160);
        g1Var.setOnClickListener(new a(this, 13));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(wnVar.getParentActivity(), false, false);
        g1Var2.j(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
        g1Var2.setMinimumWidth(160);
        g1Var2.setOnClickListener(new z(this, (TLRPC.Chat) tLObject, s1Var, 7));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
        wn wnVar2 = new wn(bundle);
        wnVar2.Z9 = true;
        wnVar.presentFragmentAsPreviewWithMenu(wnVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
        wnVar.m7();
    }

    @Override // org.telegram.ui.Cells.j1
    public final String u(long j10) {
        TLRPC.Peer peer;
        String adminRank;
        wn wnVar = this.a;
        if (UserObject.isBotForum(wnVar.f)) {
            return null;
        }
        TLRPC.Chat chat = wnVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat) && (adminRank = wnVar.getMessagesController().getAdminRank(wnVar.e.id, j10)) != null) {
            return adminRank;
        }
        TLRPC.TL_forumTopic tL_forumTopic = wnVar.o4;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || !(peer.user_id == j10 || peer.channel_id == j10 || peer.chat_id == j10)) {
            return null;
        }
        return LocaleController.getString(R.string.TopicCreator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.j1
    public final void u0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
        MessageObject messageObject = s1Var.getMessageObject();
        int i10 = messageObject.type;
        wn wnVar = this.a;
        if (i10 != 16) {
            wnVar.R7(s1Var, true, false, f7, f10, messageObject.isMusic(), false, false);
            return;
        }
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        int i11 = 0;
        if (!(messageAction instanceof TLRPC.TL_messageActionConferenceCall)) {
            TLRPC.User user = wnVar.f;
            if (user != null) {
                boolean isVideoCall = messageObject.isVideoCall();
                TLRPC.UserFull userFull = wnVar.q8;
                if (userFull != null && userFull.video_calls_available) {
                    i11 = 1;
                }
                org.telegram.ui.Components.voip.g2.m(user, isVideoCall, i11, wnVar.getParentActivity(), wnVar.getMessagesController().getUserFull(wnVar.f.id), wnVar.getAccountInstance());
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
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(wnVar.getParentActivity(), 3, null);
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = wnVar.getMessagesController().conferenceCallSizeLimit;
        e2Var.setOnCancelListener(new bi.f0(this, wnVar.getConnectionsManager().sendRequest(getgroupcall, new bi.n9(this, e2Var, hashSet, tL_inputGroupCallInviteMessage, messageObject)), 2));
        e2Var.r(600L);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void u1(MessageObject messageObject) {
        this.a.s.put(messageObject, Boolean.TRUE);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void v(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject == null || messageObject.type != 27) {
            return;
        }
        messageObject.toggleChannelRecommendations();
        messageObject.forceUpdate = true;
        s1Var.t2();
        s1Var.requestLayout();
        this.a.A0.R(messageObject, false, false);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void v1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        Uri parse;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        boolean z11 = (z10 || !qf.d.g(str, false, false)) ? z10 : true;
        wn wnVar = this.a;
        qf.c cVar = wnVar.ac;
        if (cVar != null) {
            cVar.a(true);
        }
        wnVar.ac = s1Var.getMessageObject() == null ? null : new dn(this, s1Var);
        if (z11 || qf.d.e(parse, false, null)) {
            qf.d.q(wnVar.getParentActivity(), parse, true, true, false, wnVar.ac, null, false, true, false);
        } else {
            org.telegram.ui.Components.g5.q0(wnVar, str, true, true, true, !z11, wnVar.ac, webPage, wnVar.ua);
        }
    }

    public final void w(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            bundle.putBoolean("expandPhoto", false);
            this.a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void w0(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject;
        if (s1Var == null || (messageObject = s1Var.getMessageObject()) == null || messageObject.messageOwner == null) {
            return;
        }
        int id2 = messageObject.getId();
        wn wnVar = this.a;
        if (wnVar.Wb == id2 && wnVar.Xb == 7) {
            return;
        }
        TLRPC.InputPeer inputPeer = wnVar.getMessagesController().getInputPeer(messageObject.getDialogId());
        if (inputPeer == null) {
            return;
        }
        TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
        getrichmessage.peer = inputPeer;
        getrichmessage.id = id2;
        qf.c cVar = wnVar.ac;
        if (cVar != null) {
            cVar.a(true);
            wnVar.ac = null;
        }
        int[] iArr = new int[1];
        vi viVar = new vi(wnVar, id2, s1Var, 2);
        viVar.b = new ed(8, wnVar, iArr);
        wnVar.ac = viVar;
        viVar.d();
        iArr[0] = wnVar.getConnectionsManager().sendRequestTyped(getrichmessage, new org.telegram.messenger.a(), new bi.t3(wnVar, viVar, iArr, s1Var, messageObject, 3));
    }

    @Override // org.telegram.ui.Cells.j1
    public final CharacterStyle w1(org.telegram.ui.Cells.s1 s1Var) {
        wn wnVar;
        int i10;
        if (s1Var.getMessageObject() == null || (i10 = (wnVar = this.a).Wb) == 0 || i10 != s1Var.getMessageObject().getId() || wnVar.Xb != 1) {
            return null;
        }
        return wnVar.Yb;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void x(org.telegram.ui.Cells.s1 s1Var) {
        wn wnVar = this.a;
        if (!wnVar.getMessagesController().showSensitiveContent()) {
            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(wnVar.getParentActivity(), 3, null);
            e2Var.r(200L);
            wnVar.getMessagesController().getContentSettings(new y(this, e2Var, s1Var, 6));
        } else {
            if (s1Var.getMessageObject() != null) {
                s1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
            }
            s1Var.j4();
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void x1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        try {
            wn wnVar = this.a;
            org.telegram.ui.Components.dv.I(wnVar, messageObject, wnVar.Wa, str2, str3, str4, str, i10, i11, -1, wnVar.I9());
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
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
        profileActivity.X4(i11);
        Activity parentActivity = wnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.r2) wnVar).classGuid;
        AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
        wnVar.presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void y0(org.telegram.ui.Cells.s1 s1Var, boolean z10, boolean z11) {
        g(s1Var, z10, true, z11);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean y1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        ViewGroup viewGroup;
        int i10;
        d41 d41Var;
        if (messageObject.isVoiceOnce() || messageObject.isRoundOnce()) {
            f41 f41Var = this.a.pa;
            if (f41Var == null || f41Var.b0) {
                try {
                    AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!messageObject.isOutOwner()) {
                            org.telegram.ui.Components.wc.b0(this.a).w(R.drawable.tooltip_sound, LocaleController.getString(R.string.VoiceOnceTurnOnSound)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.a.pa = new f41(this.a.getParentActivity());
                f41 f41Var2 = this.a.pa;
                te ub2 = !messageObject.isOutOwner() ? this.a.ub(messageObject, true) : null;
                a3.i0 S4 = !messageObject.isOutOwner() ? wn.S4(this.a, messageObject) : null;
                Context context = f41Var2.a;
                bh.p pVar = f41Var2.c;
                f41Var2.X = ub2;
                f41Var2.Y = S4;
                d41 d41Var2 = f41Var2.N;
                if (d41Var2 != null) {
                    pVar.removeView(d41Var2);
                    f41Var2.N = null;
                }
                f41Var2.O = s1Var;
                MessageObject messageObject2 = s1Var.getMessageObject();
                f41Var2.M = messageObject2;
                f41Var2.S = messageObject2 != null && messageObject2.isRoundVideo();
                org.telegram.ui.Cells.s1 s1Var2 = f41Var2.O;
                f41Var2.L = s1Var2 != null ? s1Var2.getResourcesProvider() : null;
                if (f41Var2.O != null) {
                    f41Var2.T = 0.0f;
                    f41Var2.U = s1Var.n;
                    if (s1Var.getParent() instanceof View) {
                        View view = (View) s1Var.getParent();
                        f41Var2.T = view.getY() + f41Var2.T;
                        f41Var2.U = view.getY() + f41Var2.U;
                    }
                    int width = f41Var2.O.getWidth();
                    int height = f41Var2.O.getHeight();
                    if (f41Var2.S) {
                        height = Math.min(AndroidUtilities.dp(360.0f), Math.min(width, AndroidUtilities.displaySize.y));
                    }
                    int i11 = height;
                    f41Var2.K = i11 - f41Var2.O.getHeight();
                    i10 = (int) Math.ceil((Math.min(width, i11) * 0.92f) / AndroidUtilities.density);
                    viewGroup = pVar;
                    d41 d41Var3 = new d41(f41Var2, f41Var2.getContext(), UserConfig.selectedAccount, f41Var2.O.getResourcesProvider(), width, i11);
                    f41Var2.N = d41Var3;
                    f41Var2.O.j1(d41Var3);
                    f41Var2.N.i1(f41Var2.O);
                    f41Var2.N.setDelegate(new pa.d());
                    d41 d41Var4 = f41Var2.N;
                    MessageObject messageObject3 = f41Var2.M;
                    MessageObject.GroupedMessages currentMessagesGroup = f41Var2.O.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.s1 s1Var3 = f41Var2.O;
                    d41Var4.Z3(messageObject3, currentMessagesGroup, s1Var3.F, s1Var3.E, false, false);
                    if (!f41Var2.S) {
                        org.telegram.ui.Components.n8 n8Var = new org.telegram.ui.Components.n8();
                        f41Var2.V = n8Var;
                        d41 d41Var5 = f41Var2.N;
                        n8Var.i = d41Var5;
                        d41Var5.fe = n8Var;
                        if (d41Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.qp0 seekBarWaveform = f41Var2.N.getSeekBarWaveform();
                            seekBarWaveform.L = f41Var2.s;
                            org.telegram.ui.Cells.s1 s1Var4 = seekBarWaveform.n;
                            if (s1Var4 != null) {
                                s1Var4.invalidate();
                            }
                        }
                    }
                    f41Var2.H = false;
                    viewGroup.addView(f41Var2.N, new FrameLayout.LayoutParams(f41Var2.O.getWidth(), i11, 17));
                } else {
                    viewGroup = pVar;
                    i10 = 360;
                }
                TextureView textureView = f41Var2.P;
                if (textureView != null) {
                    viewGroup.removeView(textureView);
                    f41Var2.P = null;
                }
                if (f41Var2.S) {
                    f41Var2.Q = false;
                    TextureView textureView2 = new TextureView(context);
                    f41Var2.P = textureView2;
                    viewGroup.addView(textureView2, 0, org.telegram.ui.Components.kb1.g(i10, i10));
                }
                MediaController.getInstance().pauseByRewind();
                org.telegram.ui.Components.t81 t81Var = f41Var2.w;
                if (t81Var != null) {
                    t81Var.B();
                    f41Var2.w.H();
                    f41Var2.w = null;
                }
                org.telegram.ui.Cells.s1 s1Var5 = f41Var2.O;
                if (s1Var5 != null && s1Var5.getMessageObject() != null) {
                    File pathToAttach = FileLoader.getInstance(f41Var2.O.getMessageObject().currentAccount).getPathToAttach(f41Var2.O.getMessageObject().getDocument());
                    if (pathToAttach != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && (pathToAttach = FileLoader.getInstance(f41Var2.O.getMessageObject().currentAccount).getPathToMessage(f41Var2.O.getMessageObject().messageOwner)) != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && f41Var2.O.getMessageObject().messageOwner.attachPath != null) {
                        pathToAttach = new File(f41Var2.O.getMessageObject().messageOwner.attachPath);
                    }
                    if (pathToAttach != null && pathToAttach.exists()) {
                        org.telegram.ui.Components.t81 t81Var2 = new org.telegram.ui.Components.t81();
                        f41Var2.w = t81Var2;
                        t81Var2.J = new e41(f41Var2);
                        if (f41Var2.V != null) {
                            t81Var2.K = new e41(f41Var2);
                        }
                        if (f41Var2.S) {
                            t81Var2.V(f41Var2.P);
                        }
                        f41Var2.w.D(Uri.fromFile(pathToAttach), "other");
                        f41Var2.w.C();
                        org.telegram.ui.Components.tt ttVar = f41Var2.E;
                        if (ttVar != null) {
                            ttVar.s = f41Var2.w;
                            ttVar.a();
                        }
                    }
                    wn wnVar = this.a;
                    wnVar.showDialog(wnVar.pa);
                    return false;
                }
                fi.v3 v3Var = f41Var2.x;
                if (v3Var != null) {
                    viewGroup.removeView(v3Var);
                    f41Var2.x = null;
                }
                MessageObject messageObject4 = f41Var2.M;
                boolean z10 = messageObject4 != null && messageObject4.isOutOwner();
                MessageObject messageObject5 = f41Var2.M;
                if (messageObject5 != null && messageObject5.getDialogId() != UserConfig.getInstance(f41Var2.M.currentAccount).getClientUserId()) {
                    fi.v3 v3Var2 = new fi.v3(context, 3);
                    f41Var2.x = v3Var2;
                    v3Var2.p(true);
                    if (z10) {
                        long dialogId = f41Var2.M.getDialogId();
                        String str = "";
                        if (dialogId > 0) {
                            TLRPC.User user = MessagesController.getInstance(f41Var2.M.currentAccount).getUser(Long.valueOf(dialogId));
                            if (user != null) {
                                str = UserObject.getFirstName(user);
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(f41Var2.M.currentAccount).getChat(Long.valueOf(-dialogId));
                            if (chat != null) {
                                str = chat.title;
                            }
                        }
                        f41Var2.x.s(AndroidUtilities.replaceTags(LocaleController.formatString(f41Var2.S ? R.string.VideoOnceOutHint : R.string.VoiceOnceOutHint, str)));
                    } else {
                        f41Var2.x.s(AndroidUtilities.replaceTags(LocaleController.getString(f41Var2.S ? R.string.VideoOnceHint : R.string.VoiceOnceHint)));
                    }
                    f41Var2.x.q(12.0f);
                    f41Var2.x.setPadding(AndroidUtilities.dp((z10 || f41Var2.O.F) ? 0.0f : 6.0f), 0, 0, 0);
                    if (f41Var2.S) {
                        f41Var2.x.m(0.5f, 0.0f);
                        f41Var2.x.K = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        f41Var2.x.m(0.0f, AndroidUtilities.dp(34.0f));
                        f41Var2.x.K = Layout.Alignment.ALIGN_NORMAL;
                    }
                    f41Var2.x.t(14.0f);
                    fi.v3 v3Var3 = f41Var2.x;
                    v3Var3.h = fi.v3.a(v3Var3.getText(), f41Var2.x.getTextPaint());
                    if (f41Var2.S) {
                        viewGroup.addView(f41Var2.x, org.telegram.ui.Components.kb1.h((int) ((f41Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((f41Var2.O.getHeight() + f41Var2.K) / AndroidUtilities.density) / 2.0f), 0.0f, 0.0f));
                    } else {
                        viewGroup.addView(f41Var2.x, org.telegram.ui.Components.kb1.h((int) ((f41Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, ((((f41Var2.O.getWidth() * (-0.39999998f)) / 2.0f) + f41Var2.O.getBoundsLeft()) / AndroidUtilities.density) + 1.0f, ((-75.0f) - ((f41Var2.O.getHeight() / AndroidUtilities.density) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    f41Var2.x.u();
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
                if (org.telegram.ui.ActionBar.y6.I.q()) {
                    f41Var2.y.setBackground(org.telegram.ui.ActionBar.y6.j0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    f41Var2.y.setBackground(org.telegram.ui.ActionBar.y6.j0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                f41Var2.y.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
                org.telegram.ui.Components.kb1.b(f41Var2.y);
                f41Var2.y.setText(LocaleController.getString(z10 ? R.string.VoiceOnceClose : R.string.VoiceOnceDeleteClose));
                f41Var2.y.setOnClickListener(new b41(f41Var2, 1));
                viewGroup.addView(f41Var2.y, org.telegram.ui.Components.kb1.h(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z10 && (d41Var = f41Var2.N) != null && d41Var.getMessageObject() != null && f41Var2.N.getMessageObject().messageOwner != null) {
                    f41Var2.N.getMessageObject().messageOwner.media_unread = false;
                    f41Var2.N.invalidate();
                }
                wn wnVar2 = this.a;
                wnVar2.showDialog(wnVar2.pa);
                return false;
            }
        } else {
            if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                boolean playMessage = MediaController.getInstance().playMessage(messageObject, false);
                MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? this.a.a8(messageObject, false) : null, false);
                return playMessage;
            }
            if (messageObject.isMusic()) {
                MediaController mediaController = MediaController.getInstance();
                ArrayList L = this.a.A0.L();
                wn wnVar3 = this.a;
                return mediaController.setPlaylist(L, messageObject, wnVar3.b7, true ^ wnVar3.A0.N, null);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void z1() {
        org.telegram.ui.ActionBar.u6 u6Var;
        wn wnVar = this.a;
        if (wnVar.j1 == null || wnVar.getParentActivity() == null) {
            return;
        }
        Context context = wnVar.j1.getContext();
        u6Var = ((org.telegram.ui.ActionBar.r2) wnVar).resourceProvider;
        c31.T(context, wnVar, false, u6Var, null);
    }
}
