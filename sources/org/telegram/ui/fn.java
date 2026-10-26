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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class fn implements org.telegram.ui.Cells.j1 {
    public final /* synthetic */ un a;

    public fn(un unVar) {
        this.a = unVar;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void A0(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        messageObject.messageOwner.summarizedOpen = !r1.summarizedOpen;
        messageObject.updateTranslation(true);
        un unVar = this.a;
        unVar.getMessagesStorage().updateMessageCustomParams(messageObject.getDialogId(), messageObject.messageOwner);
        unVar.getMessagesController().getTranslateController().checkTranslation(messageObject, true);
        g(s1Var, true, false, true);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void A1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        si siVar;
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
                        TLRPC.TL_message J7 = un.J7(message);
                        if (!TextUtils.isEmpty(tL_messageExtendedMedia.attachPath)) {
                            J7.attachPath = tL_messageExtendedMedia.attachPath;
                        } else if (tL_messageMediaPaidMedia.extended_media.size() == 1) {
                            J7.attachPath = message.attachPath;
                        }
                        J7.media = tL_messageExtendedMedia.media;
                        J7.noforwards = true;
                        arrayList.add(new MessageObject(messageObject.currentAccount, J7, false, true));
                    }
                }
                if (i11 <= -1 || arrayList.isEmpty()) {
                    return;
                }
                PhotoViewer u12 = PhotoViewer.u1();
                un unVar = this.a;
                u12.M2(null, unVar, unVar.qa);
                PhotoViewer.u1().d2(arrayList, i11, this.a.a(), 0L, 0L, this.a.Ta);
                return;
            }
            return;
        }
        un unVar2 = this.a;
        qf.c cVar = unVar2.Wb;
        if (cVar != null) {
            cVar.a(true);
            unVar2.Wb = null;
        }
        if (s1Var.getMessageObject() == null) {
            unVar2.Wb = null;
            siVar = null;
        } else {
            siVar = new si(unVar2, s1Var.getMessageObject().getId(), s1Var, 1);
            unVar2.Wb = siVar;
        }
        i10 = ((org.telegram.ui.ActionBar.r2) this.a).currentAccount;
        bi.ca y3 = bi.ca.y(i10, false);
        Objects.requireNonNull(siVar);
        ui uiVar = new ui(siVar, 8);
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
            r0Var = new ag.r0(y3, ConnectionsManager.getInstance(y3.a).sendRequest(tL_payments_getPaymentForm, new bi.i2(y3, messageObject, tL_inputInvoiceMessage, uiVar, 3)), 3);
        }
        if (r0Var != null) {
            siVar.b = r0Var;
            siVar.d();
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void B1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10;
        int i11;
        ImageLocation forDocument;
        String str2;
        boolean isEmpty = TextUtils.isEmpty(str);
        un unVar = this.a;
        if (!isEmpty) {
            qf.d.r(unVar.getParentActivity(), "https://" + unVar.getMessagesController().linkPrefix + "/nft/" + str);
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
        tg.m1 m1Var = new tg.m1(unVar, i10, user, null, null, unVar.qa);
        s1Var.getLocationOnScreen(new int[2]);
        m1Var.v0 = s1Var.getNameStatusX();
        m1Var.w0 = s1Var.getNameStatusY();
        m1Var.z0 = s1Var.getScaleX();
        m1Var.x0 = s1Var.getLeft();
        m1Var.y0 = s1Var.getTop();
        m1Var.A0 = s1Var;
        int colorId = UserObject.getColorId(user);
        if (colorId < 7) {
            m1Var.u0 = Integer.valueOf(unVar.getThemedColor(org.telegram.ui.ActionBar.y6.r8[colorId]));
        } else {
            i11 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
            MessagesController.PeerColors peerColors = MessagesController.getInstance(i11).peerColors;
            MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(colorId) : null;
            m1Var.u0 = color != null ? Integer.valueOf(color.getColor1()) : null;
        }
        org.telegram.ui.Components.r5 r5Var = s1Var.fc;
        if (r5Var != null && (r5Var.f[0] instanceof org.telegram.ui.Components.t5)) {
            m1Var.z0 *= 0.95f;
            if (document != null) {
                org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(unVar.getParentActivity());
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
                    y9Var.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : unVar.getThemedColor(org.telegram.ui.ActionBar.y6.v6), PorterDuff.Mode.SRC_IN));
                    m1Var.C0 = MessageObject.getInputStickerSet(document);
                } else {
                    m1Var.C0 = MessageObject.getInputStickerSet(document);
                }
                m1Var.B0 = y9Var;
                m1Var.E0 = true;
            }
        }
        unVar.showDialog(m1Var);
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
        un unVar = this.a;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    unVar.P7(s1Var, true, false, s1Var.getLastTouchX(), s1Var.getLastTouchY(), true, false, true);
                    return;
                } else {
                    if (i12 == 4) {
                        unVar.d2.n(messageObject.getTopicId(), true);
                        return;
                    }
                    return;
                }
            }
            if (message.suggested_post != null) {
                i10 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, unVar.e);
                if (canManageMonoForum) {
                    i11 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                    ChatObject.canUserDoChannelDirectAdminAction(i11, unVar.e, 5);
                }
                bi.s9 s9Var = new bi.s9(this, message, canManageMonoForum, messageObject, 12);
                TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                unVar.n7(s9Var, bg.a.l(suggestedPost != null ? suggestedPost.price : null), !canManageMonoForum);
                return;
            }
            return;
        }
        long peerDialogId = DialogObject.getPeerDialogId(message.from_id);
        li.s2 s2Var = new li.s2(21, this, message);
        Pattern pattern = org.telegram.ui.Components.g5.a;
        Activity parentActivity = unVar.getParentActivity();
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
        frameLayout.addView(editText, org.telegram.ui.Components.gb1.h(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
        editText.requestFocus();
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.pg(editText, 4), 100L);
        unVar.showDialog(e2Var);
        TextView textView = (TextView) e2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean C0(long j10) {
        un unVar = this.a;
        TLRPC.Chat chat = unVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return false;
        }
        return unVar.getMessagesController().isOwner(unVar.e.id, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:310:0x069e, code lost:
    
        if (r7.paid_reactions_available != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x06a4, code lost:
    
        if (r4.isEmpty() == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x06d4, code lost:
    
        if (r7.paid_reactions_available != false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x06f0, code lost:
    
        if (r4.isEmpty() != false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x06de, code lost:
    
        if (org.telegram.messenger.ChatObject.isChannel(r5.e) == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x06ea, code lost:
    
        if (org.telegram.messenger.ChatObject.isMonoForum(r5.e) != false) goto L188;
     */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x09b8 A[LOOP:3: B:254:0x09b6->B:255:0x09b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0a1c  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0a34  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0ab9  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0953  */
    @Override // org.telegram.ui.Cells.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C1(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        xv0 xv0Var;
        TLRPC.PollAnswer pollAnswer2;
        xv0 xv0Var2;
        tv0 tv0Var;
        ch.b bVar;
        MessageObject messageObject;
        ch.b bVar2;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.k80 k80Var;
        xv0 xv0Var3;
        MessageObject messageObject2;
        boolean z12;
        ye yeVar;
        int i10;
        un unVar;
        MessageObject messageObject3;
        int size;
        int i11;
        ViewGroup viewGroup;
        xv0 xv0Var4;
        boolean z13;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        boolean z14;
        byte[] bArr;
        tv0 tv0Var2;
        TLRPC.PollAnswerVoters pollAnswerVoters;
        boolean z15;
        xv0 xv0Var5;
        ArrayList arrayList;
        byte[] bArr2;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll2;
        TLRPC.PollAnswer pollAnswer3;
        boolean z16;
        boolean z17;
        sh.q qVar;
        boolean z18;
        ArrayList<TLRPC.PollAnswerVoters> arrayList2;
        un unVar2 = this.a;
        if (unVar2.getParentActivity() != null && unVar2.getParentActivity() != null) {
            fi.v3 v3Var = unVar2.J1;
            if (v3Var != null && v3Var.V) {
                v3Var.e(true);
            }
            rl rlVar = unVar2.N1;
            if (rlVar != null && rlVar.V) {
                rlVar.e(true);
            }
            MessageObject primaryMessageObject = s1Var.getPrimaryMessageObject();
            TLRPC.MessageMedia media = MessageObject.getMedia(primaryMessageObject);
            if (primaryMessageObject != null && (media instanceof TLRPC.TL_messageMediaPoll)) {
                unVar2.p5 = primaryMessageObject;
                unVar2.q5 = null;
                xv0 xv0Var6 = new xv0(unVar2.getParentActivity(), unVar2.getResourceProvider());
                byte[] bArr3 = pollAnswer.option;
                xv0Var6.L = s1Var;
                xv0Var6.P = bArr3;
                MessageObject messageObject4 = s1Var.getMessageObject();
                xv0Var6.H = messageObject4;
                xv0Var6.I = messageObject4 != null && messageObject4.isOutOwner();
                org.telegram.ui.Cells.s1 s1Var2 = xv0Var6.L;
                tv0 tv0Var3 = xv0Var6.d;
                if (s1Var2 != null) {
                    xv0Var6.M = unVar2.E9 - AndroidUtilities.dp(4.0f);
                    xv0Var6.N = s1Var.n;
                    if (s1Var.getParent() instanceof View) {
                        View view = (View) s1Var.getParent();
                        xv0Var6.M = view.getY() + xv0Var6.M;
                        xv0Var6.N = view.getY() + xv0Var6.N;
                    }
                    int width = xv0Var6.L.getWidth();
                    int height = xv0Var6.L.getHeight();
                    xv0Var6.L.getHeight();
                    vv0 vv0Var = new vv0(xv0Var6, xv0Var6.getContext(), UserConfig.selectedAccount, xv0Var6.L.getResourcesProvider(), bArr3, width, height);
                    xv0Var = xv0Var6;
                    xv0Var.J = vv0Var;
                    xv0Var.L.h1(vv0Var);
                    xv0Var.J.i1(xv0Var.L);
                    xv0Var.J.setDelegate(new tb.a(16));
                    vv0 vv0Var2 = xv0Var.J;
                    MessageObject messageObject5 = xv0Var.H;
                    MessageObject.GroupedMessages currentMessagesGroup = xv0Var.L.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.s1 s1Var3 = xv0Var.L;
                    vv0Var2.Z3(messageObject5, currentMessagesGroup, s1Var3.F, s1Var3.E, s1Var3.G, false);
                    vv0 vv0Var3 = xv0Var.J;
                    vv0Var3.M7 = bArr3;
                    tv0Var3.addView(vv0Var3, new FrameLayout.LayoutParams(xv0Var.L.getWidth(), height, 51));
                    wv0 wv0Var = new wv0(xv0Var.getContext(), UserConfig.selectedAccount, xv0Var.L.getResourcesProvider(), width, height, 0);
                    xv0Var.K = wv0Var;
                    xv0Var.L.j1(wv0Var);
                    xv0Var.L.h1(xv0Var.K);
                    xv0Var.K.i1(xv0Var.L);
                    xv0Var.K.setDelegate(new sb.b(16));
                    wv0 wv0Var2 = xv0Var.K;
                    MessageObject messageObject6 = xv0Var.H;
                    MessageObject.GroupedMessages currentMessagesGroup2 = xv0Var.L.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.s1 s1Var4 = xv0Var.L;
                    wv0Var2.Z3(messageObject6, currentMessagesGroup2, s1Var4.F, s1Var4.E, s1Var4.G, false);
                    tv0Var3.addView(xv0Var.K, new FrameLayout.LayoutParams(xv0Var.L.getWidth(), height, 51));
                } else {
                    xv0Var = xv0Var6;
                }
                fi.h1 h1Var = xv0Var.f;
                h1Var.bringToFront();
                tv0 tv0Var4 = xv0Var.e;
                tv0Var4.bringToFront();
                xv0Var.n.bringToFront();
                h1Var.w(false);
                Context context = xv0Var.a;
                View view2 = new View(context);
                org.telegram.ui.ActionBar.u6 u6Var = xv0Var.b;
                org.telegram.ui.Components.k80 G = org.telegram.ui.Components.k80.G(tv0Var3, u6Var, view2, true);
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll3 = (TLRPC.TL_messageMediaPoll) MessageObject.getMedia(xv0Var.H);
                xv0Var.V = MessageObject.isVoted(tL_messageMediaPoll3);
                int i12 = 0;
                while (true) {
                    if (i12 >= tL_messageMediaPoll3.poll.answers.size()) {
                        pollAnswer2 = null;
                        break;
                    }
                    if (Arrays.equals(tL_messageMediaPoll3.poll.answers.get(i12).option, bArr3)) {
                        pollAnswer2 = tL_messageMediaPoll3.poll.answers.get(i12);
                        break;
                    }
                    i12++;
                }
                ch.b bVar3 = xv0Var.G;
                if (pollAnswer2 != null) {
                    TLRPC.Poll poll = tL_messageMediaPoll3.poll;
                    boolean z19 = (poll.closed || poll.revoting_disabled) ? false : true;
                    boolean z20 = poll.multiple_choice;
                    ArrayList arrayList3 = new ArrayList();
                    TLRPC.PollResults pollResults = tL_messageMediaPoll3.results;
                    if (pollResults == null || (arrayList2 = pollResults.results) == null) {
                        tL_messageMediaPoll = tL_messageMediaPoll3;
                        z14 = z20;
                        bArr = bArr3;
                        tv0Var2 = tv0Var3;
                        pollAnswerVoters = null;
                        z15 = false;
                    } else {
                        int size2 = arrayList2.size();
                        z14 = z20;
                        int i13 = 0;
                        z15 = false;
                        TLRPC.PollAnswerVoters pollAnswerVoters2 = null;
                        while (i13 < size2) {
                            TLRPC.PollAnswerVoters pollAnswerVoters3 = arrayList2.get(i13);
                            int i14 = i13 + 1;
                            TLRPC.PollAnswerVoters pollAnswerVoters4 = pollAnswerVoters3;
                            tv0 tv0Var5 = tv0Var3;
                            boolean equals = Arrays.equals(pollAnswerVoters4.option, bArr3);
                            if (equals) {
                                pollAnswerVoters2 = pollAnswerVoters4;
                            }
                            byte[] bArr4 = bArr3;
                            if (pollAnswerVoters4.chosen) {
                                if (equals) {
                                    z15 = true;
                                }
                                ArrayList<TLRPC.PollAnswer> arrayList4 = tL_messageMediaPoll3.poll.answers;
                                int size3 = arrayList4.size();
                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll4 = tL_messageMediaPoll3;
                                int i15 = 0;
                                while (i15 < size3) {
                                    TLRPC.PollAnswer pollAnswer4 = arrayList4.get(i15);
                                    int i16 = i15 + 1;
                                    TLRPC.PollAnswer pollAnswer5 = pollAnswer4;
                                    ArrayList<TLRPC.PollAnswer> arrayList5 = arrayList4;
                                    int i17 = size3;
                                    if (Arrays.equals(pollAnswer5.option, pollAnswerVoters4.option)) {
                                        arrayList3.add(pollAnswer5);
                                    }
                                    arrayList4 = arrayList5;
                                    i15 = i16;
                                    size3 = i17;
                                }
                                tv0Var3 = tv0Var5;
                                i13 = i14;
                                bArr3 = bArr4;
                                tL_messageMediaPoll3 = tL_messageMediaPoll4;
                            } else {
                                tv0Var3 = tv0Var5;
                                i13 = i14;
                                bArr3 = bArr4;
                            }
                        }
                        tL_messageMediaPoll = tL_messageMediaPoll3;
                        bArr = bArr3;
                        tv0Var2 = tv0Var3;
                        pollAnswerVoters = pollAnswerVoters2;
                    }
                    if (pollAnswerVoters == null || pollAnswerVoters.voters <= 0 || !MessageObject.canShowVotersList(tL_messageMediaPoll)) {
                        xv0Var5 = xv0Var;
                        arrayList = arrayList3;
                        messageObject = primaryMessageObject;
                        tv0Var = tv0Var2;
                        bArr2 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                    } else {
                        sh.q qVar2 = new sh.q(context, unVar2.getCurrentAccount(), u6Var);
                        org.telegram.ui.Components.k80 J = G.J();
                        J.T(org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, u6Var)));
                        fh.a k10 = gh.c.k(u6Var);
                        View view3 = J.B;
                        if (view3 != null) {
                            qVar = qVar2;
                            z18 = false;
                            eh.d c10 = bVar3.c(view3, null, false);
                            c10.v(k10);
                            view3.setBackground(c10);
                        } else {
                            qVar = qVar2;
                            z18 = false;
                        }
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new zt0(G, 26), z18);
                        J.k();
                        long dialogId = xv0Var.H.getDialogId();
                        int id2 = xv0Var.H.getId();
                        int i18 = pollAnswerVoters.voters;
                        org.telegram.ui.Components.oy oyVar = new org.telegram.ui.Components.oy(19, xv0Var, unVar2);
                        xv0Var5 = xv0Var;
                        messageObject = primaryMessageObject;
                        arrayList = arrayList3;
                        tv0Var = tv0Var2;
                        byte[] bArr5 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                        sh.q qVar3 = qVar;
                        View a2 = qVar3.a(unVar2, dialogId, id2, bArr5, i18, oyVar);
                        unVar2 = unVar2;
                        bArr2 = bArr5;
                        J.q(a2);
                        qVar3.setMinimumHeight(AndroidUtilities.dp(48.0f));
                        qVar3.setText(LocaleController.formatPluralString("PollVotesCount", pollAnswerVoters.voters, new Object[0]));
                        qVar3.a.d(pollAnswerVoters.recent_voters, false);
                        qVar3.setLayoutParams(org.telegram.ui.Components.gb1.r(-1, 48));
                        int i19 = org.telegram.ui.ActionBar.y6.I5;
                        org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.x0(null, i19, false), 12, 0);
                        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i19);
                        qVar3.setBackground(Z);
                        org.telegram.ui.ActionBar.f7.k(qVar3, Z, null, N, null);
                        qVar3.setOnClickListener(new xd0(8, G, J));
                        G.q(qVar3);
                        G.k();
                    }
                    if (!z19) {
                        xv0Var2 = xv0Var5;
                        pollAnswer3 = pollAnswer2;
                        z16 = false;
                    } else if (z15) {
                        int i20 = R.drawable.msg_unvote;
                        CharSequence string = LocaleController.getString(R.string.Unvote);
                        xv0Var2 = xv0Var5;
                        un unVar3 = unVar2;
                        TLRPC.PollAnswer pollAnswer6 = pollAnswer2;
                        Runnable pv0Var = new pv0(xv0Var2, z14, unVar3, arrayList, pollAnswer6);
                        unVar2 = unVar3;
                        pollAnswer3 = pollAnswer6;
                        z16 = false;
                        G.c(i20, string, pv0Var, false);
                    } else {
                        xv0Var2 = xv0Var5;
                        pollAnswer3 = pollAnswer2;
                        ArrayList arrayList6 = arrayList;
                        z16 = false;
                        if (sh.i.a(xv0Var2.H) == 0) {
                            G.c(R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), new pv0(xv0Var2, z14, pollAnswer3, unVar2, arrayList6), false);
                        }
                    }
                    if (unVar2.J6()) {
                        G.c(R.drawable.menu_reply, LocaleController.getString(R.string.PollItemQuote), new oe0(xv0Var2, unVar2, pollAnswer3, 24), z16);
                    }
                    if (xv0Var2.H.getDialogId() >= 0 || pollAnswer3.option == null) {
                        bVar = bVar3;
                        z17 = false;
                    } else {
                        MessagesController messagesController = MessagesController.getInstance(xv0Var2.H.currentAccount);
                        bVar = bVar3;
                        String publicUsername = DialogObject.getPublicUsername(messagesController.getUserOrChat(xv0Var2.H.getDialogId()));
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(messagesController.linkPrefix);
                        sb2.append("/");
                        if (TextUtils.isEmpty(publicUsername)) {
                            publicUsername = "c/" + (-xv0Var2.H.getDialogId());
                        }
                        sb2.append(publicUsername);
                        sb2.append("/");
                        sb2.append(xv0Var2.H.getId());
                        sb2.append("?option=");
                        sb2.append(new String(Base64.encode(pollAnswer3.option, 9)));
                        String sb3 = sb2.toString();
                        int i21 = R.drawable.msg_link;
                        CharSequence string2 = LocaleController.getString(R.string.CopyLink);
                        Runnable yl0Var = new yl0(18, xv0Var2, sb3);
                        z17 = false;
                        G.c(i21, string2, yl0Var, false);
                    }
                    G.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new yl0(19, xv0Var2, pollAnswer3), z17);
                    TLRPC.Peer peer = pollAnswer3.added_by;
                    if (peer != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        long clientUserId = UserConfig.getInstance(xv0Var2.H.currentAccount).getClientUserId();
                        TLRPC.TL_messageMediaPoll tL_messageMediaPoll5 = tL_messageMediaPoll2;
                        long currentTime = ConnectionsManager.getInstance(xv0Var2.H.currentAccount).getCurrentTime();
                        un unVar4 = unVar2;
                        long j10 = MessagesController.getInstance(xv0Var2.H.currentAccount).config.pollAnswerDeletePeriod.get(TimeUnit.SECONDS) + pollAnswer3.date;
                        if (!xv0Var2.H.isForwarded()) {
                            TLRPC.Poll poll2 = tL_messageMediaPoll5.poll;
                            if (!poll2.closed && (poll2.creator || (peerDialogId == clientUserId && currentTime < j10))) {
                                G.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new yl0(20, xv0Var2, bArr2), true);
                            }
                        }
                        G.k();
                        TLObject userOrChat = MessagesController.getInstance(xv0Var2.H.currentAccount).getUserOrChat(peerDialogId);
                        CharSequence replaceTags = AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.PollAddedByAtTime, DialogObject.getShortName(userOrChat), LocaleController.formatDateTime(pollAnswer3.date, true)));
                        unVar2 = unVar4;
                        bc0 bc0Var = new bc0(xv0Var2, peerDialogId, unVar2, 1);
                        Context context2 = G.e;
                        FrameLayout frameLayout = new FrameLayout(context2);
                        int i22 = org.telegram.ui.ActionBar.y6.i6;
                        org.telegram.ui.ActionBar.u6 u6Var2 = G.d;
                        org.telegram.ui.Cells.y Z2 = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.w0(i22, u6Var2), 0, 12);
                        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i22);
                        frameLayout.setBackground(Z2);
                        org.telegram.ui.ActionBar.f7.k(frameLayout, Z2, null, N2, u6Var2);
                        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context2);
                        y9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
                        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
                        j9Var.p(userOrChat);
                        y9Var.f(userOrChat, j9Var);
                        frameLayout.addView(y9Var, org.telegram.ui.Components.gb1.h(34, 34.0f, 51, 13.0f, 11.0f, 0.0f, 11.0f));
                        TextView textView = new TextView(context2);
                        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.j5, u6Var2);
                        textView.setTextSize(1, 14.0f);
                        textView.setText(replaceTags);
                        textView.setMaxWidth(AndroidUtilities.dp(150.0f));
                        textView.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                        frameLayout.addView(textView, org.telegram.ui.Components.gb1.h(-2, -2.0f, 55, 59.0f, 8.0f, 16.0f, 0.0f));
                        frameLayout.setOnClickListener(new org.telegram.ui.Components.ga(19, G, bc0Var));
                        G.r(frameLayout, org.telegram.ui.Components.gb1.r(-1, -2));
                    }
                } else {
                    xv0Var2 = xv0Var;
                    tv0Var = tv0Var3;
                    bVar = bVar3;
                    messageObject = primaryMessageObject;
                }
                G.T(org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, u6Var)));
                G.Q(bVar, gh.c.k(u6Var), false);
                G.Y();
                ViewGroup viewGroup2 = G.A;
                xv0Var2.R = viewGroup2;
                viewGroup2.setPivotX(0.0f);
                xv0Var2.R.setPivotY(0.0f);
                tv0Var4.addView(xv0Var2.R, org.telegram.ui.Components.gb1.i(-2, -2, 51));
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                unVar2.u8(messageObject, arrayList7, arrayList8, arrayList9);
                ye yeVar2 = new ye(unVar2, 9);
                MessageObject messageObject7 = xv0Var2.H;
                List<TLRPC.TL_availableReaction> enabledReactionsList = unVar2.getMediaDataController().getEnabledReactionsList();
                boolean z21 = (unVar2.w() || unVar2.c() || unVar2.f != null || !messageObject7.hasReactions() || (ChatObject.isChannel(unVar2.e) && !unVar2.e.megagroup) || ChatObject.isMonoForum(unVar2.e) || enabledReactionsList.isEmpty() || !messageObject7.messageOwner.reactions.can_see_list || messageObject7.isSecretMedia()) ? false : true;
                if (messageObject7.isForwardedChannelPost()) {
                    bVar2 = bVar;
                    TLRPC.ChatFull chatFull2 = unVar2.getMessagesController().getChatFull(-messageObject7.getFromChatId());
                    if (chatFull2 != null) {
                        if (!unVar2.w()) {
                            if (unVar2.d4 != 5) {
                                if (!unVar2.c()) {
                                    if (messageObject7.isReactionsAvailable()) {
                                        if (chatFull2.available_reactions instanceof TLRPC.TL_chatReactionsNone) {
                                        }
                                    }
                                }
                            }
                        }
                        z10 = false;
                    }
                    z10 = true;
                } else {
                    bVar2 = bVar;
                    if (!messageObject7.isSecretMedia()) {
                        if (unVar2.d4 != 5) {
                            if (!unVar2.w()) {
                                if (!unVar2.c()) {
                                    if (messageObject7.isReactionsAvailable()) {
                                        TLRPC.ChatFull chatFull3 = unVar2.l8;
                                        if (chatFull3 != null) {
                                            if (chatFull3.available_reactions instanceof TLRPC.TL_chatReactionsNone) {
                                            }
                                        }
                                        if (chatFull3 == null) {
                                        }
                                        if (unVar2.f == null) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z10 = false;
                }
                boolean z22 = z10;
                boolean z23 = (z21 || unVar2.c() || unVar2.e == null || !messageObject7.isOutOwner() || !messageObject7.isSent() || messageObject7.isEditing() || messageObject7.isSending() || messageObject7.isSendError() || messageObject7.isContentUnread() || messageObject7.isUnread() || ConnectionsManager.getInstance(unVar2.getCurrentAccount()).getCurrentTime() - messageObject7.messageOwner.date >= unVar2.getMessagesController().chatReadMarkExpirePeriod || (!ChatObject.isMegagroup(unVar2.e) && ChatObject.isChannel(unVar2.e)) || (chatFull = unVar2.l8) == null || chatFull.participants_count > unVar2.getMessagesController().chatReadMarkSizeThreshold || (messageObject7.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || unVar2.d4 == 3 || !messageObject7.canSetReaction() || ChatObject.isMonoForum(unVar2.e)) ? false : true;
                if (unVar2.e != null && !messageObject7.isOut() && ChatObject.isMonoForum(unVar2.e) && ChatObject.canManageMonoForum(unVar2.getCurrentAccount(), unVar2.e)) {
                    int i23 = ((-unVar2.e.linked_monoforum_id) > messageObject7.getFromChatId() ? 1 : ((-unVar2.e.linked_monoforum_id) == messageObject7.getFromChatId() ? 0 : -1));
                }
                if (!z21 && unVar2.e == null && unVar2.h == null && (user = unVar2.f) != null && !UserObject.isUserSelf(user) && !UserObject.isReplyUser(unVar2.f) && !UserObject.isAnonymous(unVar2.f)) {
                    TLRPC.User user2 = unVar2.f;
                    if (!user2.bot && !UserObject.isService(user2.id) && (((userFull = unVar2.m8) == null || !userFull.read_dates_private) && !unVar2.c() && messageObject7.isOutOwner() && messageObject7.isSent() && !messageObject7.isEditing() && !messageObject7.isSending() && !messageObject7.isSendError() && !messageObject7.isContentUnread() && !messageObject7.isUnread() && unVar2.getConnectionsManager().getCurrentTime() - messageObject7.messageOwner.date < unVar2.getMessagesController().pmReadDateExpirePeriod && !(messageObject7.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                        z11 = true;
                        TLRPC.User user3 = unVar2.f;
                        boolean z24 = ((user3 == null && (UserObject.isReplyUser(user3) || UserObject.isAnonymous(unVar2.f))) || unVar2.c() || !messageObject7.isEdited() || (messageObject7.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                        org.telegram.ui.Components.k80 G2 = org.telegram.ui.Components.k80.G(tv0Var, unVar2.getResourceProvider(), null, !z21 || z23);
                        if (z23) {
                            xv0 xv0Var7 = xv0Var2;
                            k80Var = G2;
                            xv0Var3 = xv0Var7;
                            messageObject2 = messageObject7;
                            z12 = z22;
                            yeVar = yeVar2;
                            i10 = 24;
                            unVar = unVar2;
                            if (z11) {
                                k80Var.r(new org.telegram.ui.Components.rc0(xv0Var3.getContext(), 0, messageObject2, new nv0(xv0Var3, 1), xv0Var3.b), org.telegram.ui.Components.gb1.r(-1, 36));
                                k80Var.k();
                            } else if (z24) {
                                messageObject3 = messageObject2;
                                k80Var.r(new org.telegram.ui.Components.rc0(xv0Var3.getContext(), 1, messageObject2, new nv0(xv0Var3, 2), xv0Var3.b), org.telegram.ui.Components.gb1.r(-1, 36));
                                k80Var.k();
                                size = arrayList7.size();
                                for (i11 = 0; i11 < size; i11++) {
                                    k80Var.c(((Integer) arrayList7.get(i11)).intValue(), (CharSequence) arrayList8.get(i11), new yx(xv0Var3, yeVar, ((Integer) arrayList9.get(i11)).intValue(), 8), false);
                                }
                                k80Var.T(org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, u6Var)));
                                k80Var.Q(bVar2, gh.c.k(u6Var), false);
                                k80Var.Y();
                                ViewGroup viewGroup3 = k80Var.A;
                                xv0Var3.T = viewGroup3;
                                viewGroup3.setPivotX(0.0f);
                                xv0Var3.T.setPivotY(0.0f);
                                tv0Var4.addView(xv0Var3.T, org.telegram.ui.Components.gb1.i(-2, -2, 51));
                                viewGroup = xv0Var3.T;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new hl0(xv0Var3, 7));
                                    xv0Var3.T.setOnTouchListener(new d0(xv0Var3, 5));
                                }
                                if (z12) {
                                    xv0Var4 = xv0Var3;
                                    un unVar5 = unVar;
                                    org.telegram.ui.Components.fl0 fl0Var = new org.telegram.ui.Components.fl0((unVar.getUserConfig().getClientUserId() > unVar.a() ? 1 : (unVar.getUserConfig().getClientUserId() == unVar.a() ? 0 : -1)) == 0 ? 3 : 0, unVar.getCurrentAccount(), xv0Var3.getContext(), unVar5, xv0Var3.b);
                                    fl0Var.a = true;
                                    float f7 = 22;
                                    fl0Var.setPadding(AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : i10), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? i10 : 0), AndroidUtilities.dp(f7));
                                    fl0Var.setDelegate(new sv0(xv0Var4, unVar5, messageObject3, fl0Var));
                                    xv0Var4.Q = fl0Var;
                                    tv0Var4.addView(fl0Var, org.telegram.ui.Components.gb1.i(-2, (int) ((fl0Var.getTopOffset() / AndroidUtilities.density) + 52.0f + f7), 51));
                                    z13 = true;
                                    fl0Var.p(messageObject3, unVar5.l8, true);
                                    xv0Var4.Q.setTransitionProgress(1.0f);
                                } else {
                                    xv0Var4 = xv0Var3;
                                    z13 = true;
                                }
                                xv0Var4.e();
                                xv0Var4.e0 = new qm(this, 0);
                                xv0Var4.show();
                                return z13;
                            }
                        } else {
                            rh0 rh0Var = new rh0(xv0Var2.getContext(), unVar2.getCurrentAccount(), messageObject7, unVar2.e);
                            FrameLayout frameLayout2 = new FrameLayout(xv0Var2.getContext());
                            frameLayout2.addView(rh0Var, org.telegram.ui.Components.gb1.g(36.0f, -1));
                            org.telegram.ui.Components.k80 J2 = G2.J();
                            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, xv0Var2.getContext(), xv0Var2.b, true, false);
                            g1Var.setItemHeight(44);
                            xv0 xv0Var8 = xv0Var2;
                            g1Var.j(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                            messageObject2 = messageObject7;
                            g1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                            FrameLayout frameLayout3 = new FrameLayout(xv0Var8.getContext());
                            LinearLayout linearLayout = new LinearLayout(xv0Var8.getContext());
                            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.G8, linearLayout, u6Var);
                            linearLayout.setOrientation(1);
                            un unVar6 = unVar2;
                            org.telegram.ui.Components.mm0 a10 = rh0Var.a();
                            frameLayout3.addView(g1Var);
                            linearLayout.addView(frameLayout3);
                            z12 = z22;
                            linearLayout.addView(new org.telegram.ui.ActionBar.l1(xv0Var8.getContext(), u6Var), org.telegram.ui.Components.gb1.r(-1, 8));
                            frameLayout3.setOnClickListener(new qv0(G2));
                            yeVar = yeVar2;
                            i10 = 24;
                            rv0 rv0Var = new rv0(xv0Var8, rh0Var, unVar6, a10, linearLayout, G2, J2);
                            unVar = unVar6;
                            xv0Var3 = xv0Var8;
                            k80Var = G2;
                            rh0Var.setOnClickListener(rv0Var);
                            linearLayout.addView(a10, org.telegram.ui.Components.gb1.r(-1, -2));
                            J2.q(linearLayout);
                            k80Var.q(frameLayout2);
                            k80Var.k();
                        }
                        messageObject3 = messageObject2;
                        size = arrayList7.size();
                        while (i11 < size) {
                        }
                        k80Var.T(org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, u6Var)));
                        k80Var.Q(bVar2, gh.c.k(u6Var), false);
                        k80Var.Y();
                        ViewGroup viewGroup32 = k80Var.A;
                        xv0Var3.T = viewGroup32;
                        viewGroup32.setPivotX(0.0f);
                        xv0Var3.T.setPivotY(0.0f);
                        tv0Var4.addView(xv0Var3.T, org.telegram.ui.Components.gb1.i(-2, -2, 51));
                        viewGroup = xv0Var3.T;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z12) {
                        }
                        xv0Var4.e();
                        xv0Var4.e0 = new qm(this, 0);
                        xv0Var4.show();
                        return z13;
                    }
                }
                z11 = false;
                TLRPC.User user32 = unVar2.f;
                if (user32 == null) {
                }
                org.telegram.ui.Components.k80 G22 = org.telegram.ui.Components.k80.G(tv0Var, unVar2.getResourceProvider(), null, !z21 || z23);
                if (z23) {
                }
                messageObject3 = messageObject2;
                size = arrayList7.size();
                while (i11 < size) {
                }
                k80Var.T(org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, u6Var)));
                k80Var.Q(bVar2, gh.c.k(u6Var), false);
                k80Var.Y();
                ViewGroup viewGroup322 = k80Var.A;
                xv0Var3.T = viewGroup322;
                viewGroup322.setPivotX(0.0f);
                xv0Var3.T.setPivotY(0.0f);
                tv0Var4.addView(xv0Var3.T, org.telegram.ui.Components.gb1.i(-2, -2, 51));
                viewGroup = xv0Var3.T;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z12) {
                }
                xv0Var4.e();
                xv0Var4.e0 = new qm(this, 0);
                xv0Var4.show();
                return z13;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void D(org.telegram.ui.Cells.s1 s1Var) {
        un unVar = this.a;
        unVar.Ja.k(s1Var, unVar, true);
        unVar.x0.I0(false);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void D0(org.telegram.ui.Cells.s1 s1Var) {
        int i10;
        a3.i0 i0Var;
        MessageObject.GroupedMessages groupedMessages;
        int i11;
        un unVar = this.a;
        wh.i iVar = unVar.ja;
        if (iVar == null) {
            return;
        }
        HashMap hashMap = iVar.a;
        wh.h hVar = (wh.h) hashMap.get(wh.i.b(s1Var));
        org.telegram.ui.Components.qc qcVar = null;
        MessageObject messageObject = hVar != null ? hVar.E : null;
        wh.h hVar2 = (wh.h) unVar.ja.a.get(wh.i.b(s1Var));
        long j10 = (hVar2 == null || (i11 = hVar2.R) == -1) ? 0L : hVar2.w[i11].d;
        if (messageObject != null && j10 != 0) {
            Activity parentActivity = unVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
            if (!org.telegram.ui.Components.g5.h(parentActivity, i10, j10, false)) {
                ArrayList<MessageObject> arrayList = (messageObject.getGroupId() == 0 || (groupedMessages = (MessageObject.GroupedMessages) unVar.J6.f(messageObject.getGroupId())) == null) ? null : groupedMessages.messages;
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
                qcVar = org.telegram.ui.Components.wc.v(unVar.getParentActivity(), unVar, null, 1, j11, 1, unVar.getThemedColor(org.telegram.ui.ActionBar.y6.Fi), unVar.getThemedColor(org.telegram.ui.ActionBar.y6.Hi), 5000, false, i0Var);
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
            viewTreeObserver.addOnPreDrawListener(new zl(2, hVar3, viewTreeObserver));
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
        un unVar = this.a;
        if (i10 == 19) {
            qf.c cVar = unVar.Wb;
            if (cVar != null) {
                cVar.a(true);
            }
            final ym ymVar = s1Var.getMessageObject() != null ? new ym(this, s1Var, 2) : null;
            unVar.Wb = ymVar;
            final Activity parentActivity = unVar.getParentActivity();
            final org.telegram.ui.ActionBar.u6 resourceProvider = unVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ymVar.d();
            ymVar.b = new vg.e(atomicBoolean, 0);
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
            vg.s.d(messageObject, new Utilities.Callback(atomicBoolean, ymVar, z10, b11, j10, tL_messageMediaGiveaway2, parentActivity, resourceProvider) { // from class: vg.f
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
            }, new vg.g(atomicBoolean, ymVar, 0));
            return;
        }
        if (i10 == 21) {
            f();
            return;
        }
        if (i10 == 84) {
            unVar.Da(s1Var);
            return;
        }
        if (i10 == 80) {
            org.telegram.ui.Cells.x8 x8Var = org.telegram.ui.Components.nh0.R;
            if (unVar.getParentActivity() == null) {
                return;
            }
            unVar.showDialog(new org.telegram.ui.Components.nh0(unVar.getContext(), unVar.getCurrentAccount(), messageObject, unVar.getResourceProvider()));
            return;
        }
        if (i10 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
            if (messageMedia4 == null || (webPage = messageMedia4.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.I1;
            if (launchActivity == null || launchActivity.P() == null || LaunchActivity.I1.P().l(messageObject) == null) {
                unVar.createArticleViewer(false).N(messageObject, null, null, null);
                return;
            }
            return;
        }
        int i15 = 5;
        if (i10 == 5) {
            long j11 = messageObject.messageOwner.media.user_id;
            if (j11 != 0) {
                i14 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
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
                unVar.presentFragment(new ProfileActivity(bundle, null));
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
                unVar.showDialog(new org.telegram.ui.Components.jf0(unVar, null, user, null, file, kf.b.d(str, false), str3, str4, unVar.qa));
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (i10 == 30) {
            unVar.presentFragment(new un(a1.g.h(messageObject.messageOwner.media.user_id, "user_id")));
            return;
        }
        if (i10 == 31) {
            long j12 = messageObject.messageOwner.media.user_id;
            if (j12 != 0) {
                i13 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(j12));
            }
            if (user2 != null) {
                if (!TextUtils.isEmpty(messageObject.vCardData)) {
                    b10 = messageObject.vCardData.toString();
                } else if (TextUtils.isEmpty(user2.phone)) {
                    String str5 = MessageObject.getMedia(messageObject.messageOwner).phone_number;
                    b10 = !TextUtils.isEmpty(str5) ? kf.b.c().b(str5) : LocaleController.getString(R.string.NumberUnknown);
                } else {
                    b10 = org.telegram.messenger.vh.g(new StringBuilder("+"), user2.phone, kf.b.c());
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user2.id);
                bundle2.putString("phone", b10);
                bundle2.putBoolean("addContact", true);
                unVar.presentFragment(new js(bundle2));
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
            qf.c cVar2 = unVar.Wb;
            if (cVar2 != null) {
                cVar2.a(true);
            }
            unVar.Wb = s1Var.getMessageObject() != null ? new ym(this, s1Var, 3) : null;
            if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                String group = matcher.group(1);
                i11 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                if (MediaDataController.getInstance(i11).getStickerSetByName(group) == null) {
                    unVar.Wb.d();
                    TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_inputStickerSetShortName.short_name = group;
                    tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                    i12 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                    unVar.Wb.b = new ag.r0(this, ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickerSet, new fi.m3(i16, this, z11)), 29);
                    return;
                }
            }
            qf.d.q(unVar.getParentActivity(), Uri.parse(webPage2.url), true, true, false, unVar.Wb, null, false, true, false);
            return;
        }
        if (messageObject.isSponsored()) {
            unVar.T9(messageObject, false, false);
            if (messageObject.sponsoredUrl != null) {
                qf.c cVar3 = unVar.Wb;
                if (cVar3 != null) {
                    cVar3.a(true);
                }
                unVar.Wb = s1Var.getMessageObject() != null ? new ym(this, s1Var, i16) : null;
                qf.d.q(unVar.getParentActivity(), Uri.parse(messageObject.sponsoredUrl), true, false, false, unVar.Wb, null, false, unVar.getMessagesController().sponsoredLinksInappAllow, false);
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
                    unVar.getOrCreateStoryViewer().F(unVar.getParentActivity(), tL_webPageAttributeStory.storyItem, di.q7.a(unVar.x0));
                    return;
                }
            }
        }
        if (unVar.oa(storyMentionWebpage.url, s1Var, null, messageObject.getId(), 2)) {
            return;
        }
        qf.c cVar4 = unVar.Wb;
        if (cVar4 != null) {
            cVar4.a(true);
        }
        unVar.Wb = s1Var.getMessageObject() != null ? new ym(this, s1Var, i15) : null;
        qf.d.q(unVar.getParentActivity(), Uri.parse(storyMentionWebpage.url), true, true, false, unVar.Wb, null, false, true, false);
    }

    @Override // org.telegram.ui.Cells.j1
    public final cv0 E1() {
        return this.a.Ia;
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
        org.telegram.messenger.vh.m(R.string.CodeCopied, org.telegram.ui.Components.wc.b0(this.a));
    }

    @Override // org.telegram.ui.Cells.j1
    public final void F0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        un unVar = this.a;
        unVar.getSendMessagesHelper().sendCallback(true, s1Var.getMessageObject(), keyboardInlineButton, unVar);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean G1(long j10) {
        un unVar = this.a;
        TLRPC.Chat chat = unVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return false;
        }
        return unVar.getMessagesController().isAdmin(unVar.e.id, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x00fe, code lost:
    
        if (org.telegram.messenger.DialogObject.getPeerDialogId(r5) != r8.f6) goto L67;
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
        un unVar = this.a;
        if (!c10 && !z10) {
            kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
            if ((kVar.q() || unVar.J9()) && !unVar.o9.z(s1Var.getMessageObject())) {
                un.e2(unVar, s1Var, !s1Var.i3(f7), f7, f10);
                return;
            }
            return;
        }
        if (UserObject.isReplyUser(unVar.f)) {
            p(s1Var);
            return;
        }
        MessageObject messageObject2 = s1Var.getMessageObject();
        if (messageObject2 == null) {
            return;
        }
        if (messageObject2.isReplyToStory() && (storyItem = (message3 = messageObject2.messageOwner).replyStory) != null) {
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                org.telegram.messenger.t.q(R.string.StoryNotFound, org.telegram.ui.Components.wc.b0(unVar), R.raw.story_bomb1, 36);
                return;
            }
            storyItem.dialogId = DialogObject.getPeerDialogId(message3.reply_to.peer);
            storyItem.messageId = messageObject2.getId();
            storyItem.messageType = 3;
            di.a8.b(storyItem, unVar.f);
            unVar.getOrCreateStoryViewer().F(unVar.getParentActivity(), storyItem, di.q7.a(unVar.x0));
            return;
        }
        TLRPC.Message message4 = messageObject2.messageOwner;
        if (message4 != null && (messageReplyHeader7 = message4.reply_to) != null && (messageReplyHeader7.flags & 2048) != 0) {
            num = Integer.valueOf(messageReplyHeader7.todo_item_id);
        } else {
            if (message4 != null && (messageReplyHeader2 = message4.reply_to) != null && (bArr = messageReplyHeader2.poll_option) != null) {
                num = null;
                str = null;
                long j11 = unVar.f6;
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
                org.telegram.ui.Components.wc.b0(unVar).R(R.raw.error, 36, LocaleController.getString((message5 == null && (messageReplyHeader3 = message5.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
            }
            if (message4 != null && (messageReplyHeader = message4.reply_to) != null && messageReplyHeader.quote) {
                String str3 = messageReplyHeader.quote_text;
                r9 = (messageReplyHeader.flags & 1024) != 0 ? messageReplyHeader.quote_offset : -1;
                str = str3;
                num = null;
                bArr = null;
                long j112 = unVar.f6;
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
                            chat = j10 < 0 ? unVar.getMessagesController().getChat(Long.valueOf(-j10)) : null;
                            if (j10 != Long.MAX_VALUE) {
                                boolean z12 = z11;
                                if (j10 == unVar.f6 || chat == null || ChatObject.isPublic(chat) || (!chat.left && !chat.kicked)) {
                                    if (((j10 == unVar.f6 && (!ChatObject.isForum(unVar.e) || !z12)) || j10 == Long.MAX_VALUE) && (unVar.d4 != 3 || ((messageObject = messageObject2.replyMessageObject) != null && messageObject.getSavedDialogId() == unVar.b()))) {
                                        int i11 = unVar.d4;
                                        if (i11 == 2 || i11 == 1) {
                                            unVar.h9.Q0(i10);
                                            unVar.finishFragment();
                                            return;
                                        }
                                        if (bArr != null) {
                                            unVar.d8 = bArr;
                                        } else if (num != null) {
                                            unVar.c8 = num;
                                        } else {
                                            TLRPC.Message message6 = messageObject2.messageOwner;
                                            if (message6 != null && (messageReplyHeader5 = message6.reply_to) != null && messageReplyHeader5.quote) {
                                                unVar.Z7 = true;
                                                unVar.b8 = messageReplyHeader5.quote_text;
                                                unVar.e8 = r9;
                                                unVar.Y7 = true;
                                            }
                                        }
                                        bi.sb sbVar = new bi.sb(this, i10, messageObject2, num, bArr, 19);
                                        if (!unVar.A0.N) {
                                            sbVar.run();
                                            return;
                                        }
                                        unVar.D3 = false;
                                        unVar.wb(false, true, false);
                                        unVar.Sc(unVar.getMediaDataController().getMask(), unVar.getMediaDataController().getSearchPosition(), unVar.getMediaDataController().getSearchCount());
                                        AndroidUtilities.runOnUIThread(sbVar, 80L);
                                        return;
                                    }
                                    Integer num2 = num;
                                    byte[] bArr2 = bArr;
                                    if (LaunchActivity.I1 != null) {
                                        qf.c cVar = unVar.Wb;
                                        if (cVar != null) {
                                            cVar.a(false);
                                            r2Var = null;
                                            unVar.Wb = null;
                                        } else {
                                            r2Var = null;
                                        }
                                        LaunchActivity launchActivity = LaunchActivity.I1;
                                        final j0 j0Var = new j0(this, messageObject2, s1Var);
                                        unVar.Wb = j0Var;
                                        int id2 = messageObject2.getId();
                                        ArrayList arrayList = launchActivity.d0;
                                        if (j10 < 0 && (chat2 = MessagesController.getInstance(launchActivity.O).getChat(Long.valueOf(-j10))) != null && ChatObject.isForum(chat2)) {
                                            j0Var.d();
                                            final int i12 = 0;
                                            launchActivity.m0(j10, Integer.valueOf(i10), str2, num2, bArr2, new Runnable() { // from class: org.telegram.ui.y80
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
                                                launchActivity.m0(j10, Integer.valueOf(i10), str4, num2, bArr2, new Runnable() { // from class: org.telegram.ui.y80
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
                                            AndroidUtilities.runOnUIThread(new x80(launchActivity, bundle, bArr2, i10, num2, str4, i13, j10, j0Var, r2Var2));
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
                                org.telegram.ui.Components.wc.b0(unVar).R(R.raw.error, 36, LocaleController.getString((message52 == null && (messageReplyHeader3 = message52.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
                            } else {
                                messageObject2.replyTextRevealed = true;
                                unVar.Dc(messageObject2, true);
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
                    org.telegram.ui.Components.wc.b0(unVar).R(R.raw.error, 36, LocaleController.getString((message522 == null && (messageReplyHeader3 = message522.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
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
                org.telegram.ui.Components.wc.b0(unVar).R(R.raw.error, 36, LocaleController.getString((message5222 == null && (messageReplyHeader3 = message5222.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
            }
            num = null;
        }
        bArr = null;
        str = null;
        long j1122 = unVar.f6;
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
        org.telegram.ui.Components.wc.b0(unVar).R(R.raw.error, 36, LocaleController.getString((message52222 == null && (messageReplyHeader3 = message52222.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
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
        this.a.b8(characterStyle, z10, s1Var.getMessageObject(), s1Var);
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
        fd1 fd1Var;
        TLRPC.TodoItem todoItem2;
        TLRPC.TodoCompletion todoCompletion;
        fd1 fd1Var2;
        MessageObject messageObject;
        fd1 fd1Var3;
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
        id1 id1Var;
        ArrayList arrayList3;
        un unVar;
        MessageObject messageObject4;
        int size;
        int i11;
        ViewGroup viewGroup;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        final un unVar2 = this.a;
        if (unVar2.getParentActivity() != null && unVar2.getParentActivity() != null) {
            fi.v3 v3Var = unVar2.J1;
            if (v3Var != null && v3Var.V) {
                v3Var.e(true);
            }
            rl rlVar = unVar2.N1;
            if (rlVar != null && rlVar.V) {
                rlVar.e(true);
            }
            MessageObject primaryMessageObject = s1Var.getPrimaryMessageObject();
            TLRPC.MessageMedia media = MessageObject.getMedia(primaryMessageObject);
            if (primaryMessageObject != null && (media instanceof TLRPC.TL_messageMediaToDo)) {
                unVar2.p5 = primaryMessageObject;
                unVar2.q5 = null;
                final id1 id1Var2 = new id1(unVar2.getParentActivity(), unVar2.getResourceProvider());
                final int i12 = todoItem.id;
                id1Var2.K = s1Var;
                id1Var2.O = i12;
                MessageObject messageObject5 = s1Var.getMessageObject();
                id1Var2.G = messageObject5;
                id1Var2.H = messageObject5 != null && messageObject5.isOutOwner();
                org.telegram.ui.Cells.s1 s1Var2 = id1Var2.K;
                fd1 fd1Var4 = id1Var2.c;
                if (s1Var2 != null) {
                    id1Var2.L = unVar2.E9 - AndroidUtilities.dp(4.0f);
                    id1Var2.M = s1Var.n;
                    if (s1Var.getParent() instanceof View) {
                        View view = (View) s1Var.getParent();
                        id1Var2.L = view.getY() + id1Var2.L;
                        id1Var2.M = view.getY() + id1Var2.M;
                    }
                    int width = id1Var2.K.getWidth();
                    int height = id1Var2.K.getHeight();
                    id1Var2.K.getHeight();
                    fd1Var = fd1Var4;
                    gd1 gd1Var = new gd1(id1Var2, id1Var2.getContext(), UserConfig.selectedAccount, id1Var2.K.getResourcesProvider(), i12, width, height);
                    id1Var2.I = gd1Var;
                    id1Var2.K.h1(gd1Var);
                    id1Var2.I.i1(id1Var2.K);
                    id1Var2.I.setDelegate(new hd1(id1Var2));
                    gd1 gd1Var2 = id1Var2.I;
                    MessageObject messageObject6 = id1Var2.G;
                    MessageObject.GroupedMessages currentMessagesGroup = id1Var2.K.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.s1 s1Var3 = id1Var2.K;
                    gd1Var2.Z3(messageObject6, currentMessagesGroup, s1Var3.F, s1Var3.E, s1Var3.G, false);
                    fd1Var.addView(id1Var2.I, new FrameLayout.LayoutParams(id1Var2.K.getWidth(), height, 51));
                    wv0 wv0Var = new wv0(id1Var2.getContext(), UserConfig.selectedAccount, id1Var2.K.getResourcesProvider(), width, height, 1);
                    id1Var2.J = wv0Var;
                    id1Var2.K.j1(wv0Var);
                    id1Var2.K.h1(id1Var2.J);
                    id1Var2.J.i1(id1Var2.K);
                    id1Var2.J.setDelegate(new tb.a(17));
                    wv0 wv0Var2 = id1Var2.J;
                    MessageObject messageObject7 = id1Var2.G;
                    MessageObject.GroupedMessages currentMessagesGroup2 = id1Var2.K.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.s1 s1Var4 = id1Var2.K;
                    wv0Var2.Z3(messageObject7, currentMessagesGroup2, s1Var4.F, s1Var4.E, s1Var4.G, false);
                    fd1Var.addView(id1Var2.J, new FrameLayout.LayoutParams(id1Var2.K.getWidth(), height, 51));
                } else {
                    fd1Var = fd1Var4;
                }
                fi.h1 h1Var = id1Var2.e;
                h1Var.bringToFront();
                fd1 fd1Var5 = id1Var2.d;
                fd1Var5.bringToFront();
                id1Var2.h.bringToFront();
                h1Var.w(false);
                org.telegram.ui.ActionBar.u6 u6Var = id1Var2.a;
                org.telegram.ui.Components.k80 F = org.telegram.ui.Components.k80.F(fd1Var, u6Var, null);
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) MessageObject.getMedia(id1Var2.G);
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
                if (!id1Var2.G.canCompleteTodo()) {
                    fd1Var2 = fd1Var5;
                } else if (todoCompletion != null) {
                    fd1Var2 = fd1Var5;
                    F.p(14, -1, LocaleController.formatTodoCompletedDate(todoCompletion.date));
                    F.k();
                    final int i15 = 1;
                    F.c(R.drawable.msg_cancel, LocaleController.getString(R.string.TodoUncheck), new Runnable() { // from class: org.telegram.ui.ad1
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    un unVar3 = unVar2;
                                    mv0 mv0Var = new mv0(unVar3);
                                    id1 id1Var3 = id1Var2;
                                    mv0Var.q0(MessageObject.getMedia(id1Var3.G), false, i12);
                                    mv0Var.e0 = new af0(26, id1Var3, unVar3);
                                    unVar3.presentFragment(mv0Var);
                                    id1Var3.c(false);
                                    break;
                                case 1:
                                    boolean c10 = unVar2.c();
                                    id1 id1Var4 = id1Var2;
                                    if (c10) {
                                        Toast.makeText(id1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                                    } else {
                                        gd1 gd1Var3 = id1Var4.I;
                                        gd1Var3.m4(gd1Var3.O2(i12), false);
                                    }
                                    id1Var4.c(true);
                                    break;
                                default:
                                    boolean c11 = unVar2.c();
                                    id1 id1Var5 = id1Var2;
                                    if (c11) {
                                        Toast.makeText(id1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                                    } else {
                                        gd1 gd1Var4 = id1Var5.I;
                                        gd1Var4.m4(gd1Var4.O2(i12), false);
                                    }
                                    id1Var5.c(true);
                                    break;
                            }
                        }
                    }, false);
                } else {
                    fd1Var2 = fd1Var5;
                    final int i16 = 2;
                    F.c(R.drawable.msg_select, LocaleController.getString(R.string.TodoCheck), new Runnable() { // from class: org.telegram.ui.ad1
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i16) {
                                case 0:
                                    un unVar3 = unVar2;
                                    mv0 mv0Var = new mv0(unVar3);
                                    id1 id1Var3 = id1Var2;
                                    mv0Var.q0(MessageObject.getMedia(id1Var3.G), false, i12);
                                    mv0Var.e0 = new af0(26, id1Var3, unVar3);
                                    unVar3.presentFragment(mv0Var);
                                    id1Var3.c(false);
                                    break;
                                case 1:
                                    boolean c10 = unVar2.c();
                                    id1 id1Var4 = id1Var2;
                                    if (c10) {
                                        Toast.makeText(id1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                                    } else {
                                        gd1 gd1Var3 = id1Var4.I;
                                        gd1Var3.m4(gd1Var3.O2(i12), false);
                                    }
                                    id1Var4.c(true);
                                    break;
                                default:
                                    boolean c11 = unVar2.c();
                                    id1 id1Var5 = id1Var2;
                                    if (c11) {
                                        Toast.makeText(id1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                                    } else {
                                        gd1 gd1Var4 = id1Var5.I;
                                        gd1Var4.m4(gd1Var4.O2(i12), false);
                                    }
                                    id1Var5.c(true);
                                    break;
                            }
                        }
                    }, false);
                }
                if (todoItem2 != null) {
                    F.c(R.drawable.menu_reply, LocaleController.getString(R.string.TodoItemQuote), new h71(id1Var2, unVar2, todoItem2, 5), false);
                    if (id1Var2.G.getDialogId() < 0) {
                        MessagesController messagesController = MessagesController.getInstance(id1Var2.G.currentAccount);
                        String publicUsername = DialogObject.getPublicUsername(messagesController.getUserOrChat(id1Var2.G.getDialogId()));
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(messagesController.linkPrefix);
                        sb2.append("/");
                        if (TextUtils.isEmpty(publicUsername)) {
                            StringBuilder sb3 = new StringBuilder("c/");
                            messageObject = primaryMessageObject;
                            fd1Var3 = fd1Var2;
                            sb3.append(-id1Var2.G.getDialogId());
                            publicUsername = sb3.toString();
                        } else {
                            messageObject = primaryMessageObject;
                            fd1Var3 = fd1Var2;
                        }
                        sb2.append(publicUsername);
                        sb2.append("/");
                        sb2.append(id1Var2.G.getId());
                        sb2.append("?task=");
                        sb2.append(todoItem2.id);
                        F.c(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new zc1(0, id1Var2, sb2.toString()), false);
                    } else {
                        messageObject = primaryMessageObject;
                        fd1Var3 = fd1Var2;
                    }
                    F.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new zc1(1, id1Var2, todoItem2), false);
                } else {
                    messageObject = primaryMessageObject;
                    fd1Var3 = fd1Var2;
                }
                if (id1Var2.G.canEditMessage(unVar2.e)) {
                    final int i17 = 0;
                    F.c(R.drawable.msg_edit, LocaleController.getString(R.string.TodoEditItem), new Runnable() { // from class: org.telegram.ui.ad1
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i17) {
                                case 0:
                                    un unVar3 = unVar2;
                                    mv0 mv0Var = new mv0(unVar3);
                                    id1 id1Var3 = id1Var2;
                                    mv0Var.q0(MessageObject.getMedia(id1Var3.G), false, i13);
                                    mv0Var.e0 = new af0(26, id1Var3, unVar3);
                                    unVar3.presentFragment(mv0Var);
                                    id1Var3.c(false);
                                    break;
                                case 1:
                                    boolean c10 = unVar2.c();
                                    id1 id1Var4 = id1Var2;
                                    if (c10) {
                                        Toast.makeText(id1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                                    } else {
                                        gd1 gd1Var3 = id1Var4.I;
                                        gd1Var3.m4(gd1Var3.O2(i13), false);
                                    }
                                    id1Var4.c(true);
                                    break;
                                default:
                                    boolean c11 = unVar2.c();
                                    id1 id1Var5 = id1Var2;
                                    if (c11) {
                                        Toast.makeText(id1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                                    } else {
                                        gd1 gd1Var4 = id1Var5.I;
                                        gd1Var4.m4(gd1Var4.O2(i13), false);
                                    }
                                    id1Var5.c(true);
                                    break;
                            }
                        }
                    }, false);
                    if (tL_messageMediaToDo.todo.list.size() > 1) {
                        i10 = 51;
                        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.TodoDeleteItem), new org.telegram.ui.Components.zr0(id1Var2, tL_messageMediaToDo, i12, unVar2, 16), false);
                        F.T(org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, u6Var)));
                        fh.e k10 = gh.c.k(u6Var);
                        ch.b bVar = id1Var2.F;
                        F.Q(bVar, k10, false);
                        F.Y();
                        ViewGroup viewGroup2 = F.A;
                        id1Var2.Q = viewGroup2;
                        viewGroup2.setPivotX(0.0f);
                        id1Var2.Q.setPivotY(0.0f);
                        fd1Var3.addView(id1Var2.Q, org.telegram.ui.Components.gb1.i(-2, -2, i10));
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        unVar2.u8(messageObject, arrayList4, arrayList5, arrayList6);
                        ye yeVar2 = new ye(unVar2, 10);
                        messageObject2 = id1Var2.G;
                        List<TLRPC.TL_availableReaction> enabledReactionsList = unVar2.getMediaDataController().getEnabledReactionsList();
                        boolean z15 = unVar2.w() && !unVar2.c() && unVar2.f == null && messageObject2.hasReactions() && !((ChatObject.isChannel(unVar2.e) && !unVar2.e.megagroup) || ChatObject.isMonoForum(unVar2.e) || enabledReactionsList.isEmpty() || !messageObject2.messageOwner.reactions.can_see_list || messageObject2.isSecretMedia());
                        if (messageObject2.isForwardedChannelPost()) {
                            z10 = z15;
                            if (!messageObject2.isSecretMedia()) {
                                if (unVar2.d4 != 5) {
                                    if (!unVar2.w()) {
                                        if (!unVar2.c()) {
                                            if (messageObject2.isReactionsAvailable()) {
                                                TLRPC.ChatFull chatFull2 = unVar2.l8;
                                                if (chatFull2 != null) {
                                                    if (chatFull2.available_reactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    }
                                                }
                                                if (chatFull2 == null) {
                                                }
                                                if (unVar2.f == null) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            z11 = false;
                        } else {
                            z10 = z15;
                            TLRPC.ChatFull chatFull3 = unVar2.getMessagesController().getChatFull(-messageObject2.getFromChatId());
                            if (chatFull3 != null) {
                                if (!unVar2.w()) {
                                    if (unVar2.d4 != 5) {
                                        if (!unVar2.c()) {
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
                        z12 = (!z10 || unVar2.c() || unVar2.e == null || !messageObject2.isOutOwner() || !messageObject2.isSent() || messageObject2.isEditing() || messageObject2.isSending() || messageObject2.isSendError() || messageObject2.isContentUnread() || messageObject2.isUnread() || ConnectionsManager.getInstance(unVar2.getCurrentAccount()).getCurrentTime() - messageObject2.messageOwner.date >= unVar2.getMessagesController().chatReadMarkExpirePeriod || (!ChatObject.isMegagroup(unVar2.e) && ChatObject.isChannel(unVar2.e)) || (chatFull = unVar2.l8) == null || chatFull.participants_count > unVar2.getMessagesController().chatReadMarkSizeThreshold || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || unVar2.d4 == 3 || !messageObject2.canSetReaction() || ChatObject.isMonoForum(unVar2.e)) ? false : true;
                        if (unVar2.e != null && !messageObject2.isOut() && ChatObject.isMonoForum(unVar2.e) && ChatObject.canManageMonoForum(unVar2.getCurrentAccount(), unVar2.e)) {
                            int i18 = ((-unVar2.e.linked_monoforum_id) > messageObject2.getFromChatId() ? 1 : ((-unVar2.e.linked_monoforum_id) == messageObject2.getFromChatId() ? 0 : -1));
                        }
                        if (!z10 && unVar2.e == null && unVar2.h == null && (user = unVar2.f) != null && !UserObject.isUserSelf(user) && !UserObject.isReplyUser(unVar2.f) && !UserObject.isAnonymous(unVar2.f)) {
                            user2 = unVar2.f;
                            if (!user2.bot && !UserObject.isService(user2.id) && (((userFull = unVar2.m8) == null || !userFull.read_dates_private) && !unVar2.c() && messageObject2.isOutOwner() && messageObject2.isSent() && !messageObject2.isEditing() && !messageObject2.isSending() && !messageObject2.isSendError() && !messageObject2.isContentUnread() && !messageObject2.isUnread() && unVar2.getConnectionsManager().getCurrentTime() - messageObject2.messageOwner.date < unVar2.getMessagesController().pmReadDateExpirePeriod && !(messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                                z13 = true;
                                TLRPC.User user3 = unVar2.f;
                                boolean z17 = ((user3 == null && (UserObject.isReplyUser(user3) || UserObject.isAnonymous(unVar2.f))) || unVar2.c() || !messageObject2.isEdited() || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                                org.telegram.ui.Components.k80 G = org.telegram.ui.Components.k80.G(id1Var2.c, unVar2.getResourceProvider(), null, !z10 || z12);
                                if (z12) {
                                    yeVar = yeVar2;
                                    messageObject3 = messageObject2;
                                    z14 = z16;
                                    arrayList = arrayList4;
                                    arrayList2 = arrayList5;
                                    id1Var = id1Var2;
                                    arrayList3 = arrayList6;
                                    unVar = unVar2;
                                    if (z13) {
                                        G.r(new org.telegram.ui.Components.rc0(id1Var.getContext(), 0, messageObject3, new yc1(id1Var, 0), id1Var.a), org.telegram.ui.Components.gb1.r(-1, 36));
                                        G.k();
                                    } else if (z17) {
                                        messageObject4 = messageObject3;
                                        G.r(new org.telegram.ui.Components.rc0(id1Var.getContext(), 1, messageObject3, new yc1(id1Var, 2), id1Var.a), org.telegram.ui.Components.gb1.r(-1, 36));
                                        G.k();
                                        i11 = 0;
                                        for (size = arrayList.size(); i11 < size; size = size) {
                                            G.c(((Integer) arrayList.get(i11)).intValue(), (CharSequence) arrayList2.get(i11), new yx(id1Var, yeVar, ((Integer) arrayList3.get(i11)).intValue(), 13), false);
                                            i11++;
                                            arrayList3 = arrayList3;
                                        }
                                        G.T(org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, u6Var)));
                                        G.Q(bVar, gh.c.k(u6Var), false);
                                        G.Y();
                                        ViewGroup viewGroup3 = G.A;
                                        id1Var.S = viewGroup3;
                                        viewGroup3.setPivotX(0.0f);
                                        id1Var.S.setPivotY(0.0f);
                                        ViewGroup viewGroup4 = id1Var.S;
                                        FrameLayout.LayoutParams i19 = org.telegram.ui.Components.gb1.i(-2, -2, 51);
                                        fd1 fd1Var6 = id1Var.d;
                                        fd1Var6.addView(viewGroup4, i19);
                                        viewGroup = id1Var.S;
                                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new hl0(id1Var, 22));
                                            id1Var.S.setOnTouchListener(new d0(id1Var, 7));
                                        }
                                        if (z14) {
                                            un unVar3 = unVar;
                                            org.telegram.ui.Components.fl0 fl0Var = new org.telegram.ui.Components.fl0((unVar.getUserConfig().getClientUserId() > unVar.a() ? 1 : (unVar.getUserConfig().getClientUserId() == unVar.a() ? 0 : -1)) == 0 ? 3 : 0, unVar3.getCurrentAccount(), id1Var.getContext(), unVar3, id1Var.a);
                                            fl0Var.a = true;
                                            float f7 = 22;
                                            fl0Var.setPadding(AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : 24), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 24 : 0), AndroidUtilities.dp(f7));
                                            fl0Var.setDelegate(new ed1(id1Var, unVar3, messageObject4, fl0Var));
                                            id1Var.P = fl0Var;
                                            fd1Var6.addView(fl0Var, org.telegram.ui.Components.gb1.i(-2, (int) ((fl0Var.getTopOffset() / AndroidUtilities.density) + 52.0f + f7), 51));
                                            fl0Var.p(messageObject4, unVar3.l8, true);
                                            id1Var.P.setTransitionProgress(1.0f);
                                        }
                                        id1Var.e();
                                        id1Var.c0 = new qm(this, 5);
                                        id1Var.show();
                                        return true;
                                    }
                                } else {
                                    rh0 rh0Var = new rh0(id1Var2.getContext(), unVar2.getCurrentAccount(), messageObject2, unVar2.e);
                                    FrameLayout frameLayout = new FrameLayout(id1Var2.getContext());
                                    frameLayout.addView(rh0Var, org.telegram.ui.Components.gb1.g(36.0f, -1));
                                    org.telegram.ui.Components.k80 J = G.J();
                                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, id1Var2.getContext(), id1Var2.a, true, false);
                                    g1Var.setItemHeight(44);
                                    g1Var.j(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                                    g1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                                    FrameLayout frameLayout2 = new FrameLayout(id1Var2.getContext());
                                    LinearLayout linearLayout = new LinearLayout(id1Var2.getContext());
                                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.G8, linearLayout, u6Var);
                                    linearLayout.setOrientation(1);
                                    unVar = unVar2;
                                    org.telegram.ui.Components.mm0 a2 = rh0Var.a();
                                    frameLayout2.addView(g1Var);
                                    linearLayout.addView(frameLayout2);
                                    z14 = z16;
                                    linearLayout.addView(new org.telegram.ui.ActionBar.l1(id1Var2.getContext(), u6Var), org.telegram.ui.Components.gb1.r(-1, 8));
                                    frameLayout2.setOnClickListener(new cd1(G));
                                    messageObject3 = messageObject2;
                                    yeVar = yeVar2;
                                    arrayList = arrayList4;
                                    arrayList2 = arrayList5;
                                    dd1 dd1Var = new dd1(id1Var2, rh0Var, unVar, a2, linearLayout, G, J);
                                    G = G;
                                    id1Var = id1Var2;
                                    rh0Var.setOnClickListener(dd1Var);
                                    linearLayout.addView(a2, org.telegram.ui.Components.gb1.r(-1, -2));
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
                                id1Var.S = viewGroup32;
                                viewGroup32.setPivotX(0.0f);
                                id1Var.S.setPivotY(0.0f);
                                ViewGroup viewGroup42 = id1Var.S;
                                FrameLayout.LayoutParams i192 = org.telegram.ui.Components.gb1.i(-2, -2, 51);
                                fd1 fd1Var62 = id1Var.d;
                                fd1Var62.addView(viewGroup42, i192);
                                viewGroup = id1Var.S;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                }
                                if (z14) {
                                }
                                id1Var.e();
                                id1Var.c0 = new qm(this, 5);
                                id1Var.show();
                                return true;
                            }
                        }
                        z13 = false;
                        TLRPC.User user32 = unVar2.f;
                        if (user32 == null) {
                        }
                        org.telegram.ui.Components.k80 G2 = org.telegram.ui.Components.k80.G(id1Var2.c, unVar2.getResourceProvider(), null, !z10 || z12);
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
                        id1Var.S = viewGroup322;
                        viewGroup322.setPivotX(0.0f);
                        id1Var.S.setPivotY(0.0f);
                        ViewGroup viewGroup422 = id1Var.S;
                        FrameLayout.LayoutParams i1922 = org.telegram.ui.Components.gb1.i(-2, -2, 51);
                        fd1 fd1Var622 = id1Var.d;
                        fd1Var622.addView(viewGroup422, i1922);
                        viewGroup = id1Var.S;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z14) {
                        }
                        id1Var.e();
                        id1Var.c0 = new qm(this, 5);
                        id1Var.show();
                        return true;
                    }
                }
                i10 = 51;
                F.T(org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, u6Var)));
                fh.e k102 = gh.c.k(u6Var);
                ch.b bVar2 = id1Var2.F;
                F.Q(bVar2, k102, false);
                F.Y();
                ViewGroup viewGroup22 = F.A;
                id1Var2.Q = viewGroup22;
                viewGroup22.setPivotX(0.0f);
                id1Var2.Q.setPivotY(0.0f);
                fd1Var3.addView(id1Var2.Q, org.telegram.ui.Components.gb1.i(-2, -2, i10));
                ArrayList arrayList42 = new ArrayList();
                ArrayList arrayList52 = new ArrayList();
                ArrayList arrayList62 = new ArrayList();
                unVar2.u8(messageObject, arrayList42, arrayList52, arrayList62);
                ye yeVar22 = new ye(unVar2, 10);
                messageObject2 = id1Var2.G;
                List<TLRPC.TL_availableReaction> enabledReactionsList2 = unVar2.getMediaDataController().getEnabledReactionsList();
                if (unVar2.w()) {
                }
                if (messageObject2.isForwardedChannelPost()) {
                }
                boolean z162 = z11;
                if (!z10) {
                }
                if (unVar2.e != null) {
                    int i182 = ((-unVar2.e.linked_monoforum_id) > messageObject2.getFromChatId() ? 1 : ((-unVar2.e.linked_monoforum_id) == messageObject2.getFromChatId() ? 0 : -1));
                }
                if (!z10) {
                    user2 = unVar2.f;
                    if (!user2.bot) {
                        z13 = true;
                        TLRPC.User user322 = unVar2.f;
                        if (user322 == null) {
                        }
                        org.telegram.ui.Components.k80 G22 = org.telegram.ui.Components.k80.G(id1Var2.c, unVar2.getResourceProvider(), null, !z10 || z12);
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
                        id1Var.S = viewGroup3222;
                        viewGroup3222.setPivotX(0.0f);
                        id1Var.S.setPivotY(0.0f);
                        ViewGroup viewGroup4222 = id1Var.S;
                        FrameLayout.LayoutParams i19222 = org.telegram.ui.Components.gb1.i(-2, -2, 51);
                        fd1 fd1Var6222 = id1Var.d;
                        fd1Var6222.addView(viewGroup4222, i19222);
                        viewGroup = id1Var.S;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z14) {
                        }
                        id1Var.e();
                        id1Var.c0 = new qm(this, 5);
                        id1Var.show();
                        return true;
                    }
                }
                z13 = false;
                TLRPC.User user3222 = unVar2.f;
                if (user3222 == null) {
                }
                org.telegram.ui.Components.k80 G222 = org.telegram.ui.Components.k80.G(id1Var2.c, unVar2.getResourceProvider(), null, !z10 || z12);
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
                id1Var.S = viewGroup32222;
                viewGroup32222.setPivotX(0.0f);
                id1Var.S.setPivotY(0.0f);
                ViewGroup viewGroup42222 = id1Var.S;
                FrameLayout.LayoutParams i192222 = org.telegram.ui.Components.gb1.i(-2, -2, 51);
                fd1 fd1Var62222 = id1Var.d;
                fd1Var62222.addView(viewGroup42222, i192222);
                viewGroup = id1Var.S;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z14) {
                }
                id1Var.e();
                id1Var.c0 = new qm(this, 5);
                id1Var.show();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void J(int i10, org.telegram.ui.Cells.s1 s1Var) {
        boolean z10 = s1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveaway;
        un unVar = this.a;
        if (z10) {
            long j10 = -((TLRPC.TL_messageMediaGiveaway) s1Var.getMessageObject().messageOwner.media).channels.get(i10).longValue();
            if (unVar.f6 != j10) {
                unVar.presentFragment(un.ba(j10));
            } else {
                unVar.m1.e(false, false);
            }
        }
        if (s1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            unVar.presentFragment(ProfileActivity.t4(((TLRPC.TL_messageMediaGiveawayResults) s1Var.getMessageObject().messageOwner.media).winners.get(i10).longValue()));
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean J0(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
        MessageObject messageObject = (currentMessagesGroup == null || currentMessagesGroup.messages.isEmpty()) ? s1Var.getMessageObject() : currentMessagesGroup.messages.get(0);
        if (messageObject != null) {
            un unVar = this.a;
            boolean z11 = !unVar.Fc && messageObject.getId() == unVar.Ec;
            if (!z10) {
                return z11;
            }
            if (z11 && System.currentTimeMillis() - unVar.Gc > 1000) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void K(MessageObject messageObject) {
        if (messageObject.isVideo()) {
            this.a.qb(messageObject, true);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void K0(org.telegram.ui.Cells.s1 s1Var) {
        un unVar = this.a;
        unVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(unVar.f6), s1Var);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void K1(org.telegram.ui.Cells.s1 s1Var) {
        TLRPC.Chat chat;
        TLRPC.User currentUser = s1Var.getCurrentUser();
        un unVar = this.a;
        if (!AndroidUtilities.isContextSafe(unVar.getParentActivity()) || (chat = unVar.e) == null || currentUser == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return;
        }
        e(s1Var, unVar.getMessagesController().getParticipant(unVar.e.id, currentUser.id));
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean L(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        int i10;
        int i11;
        boolean isForwarded = s1Var.getMessageObject().isForwarded();
        un unVar = this.a;
        if (isForwarded) {
            long peerDialogId = DialogObject.getPeerDialogId(s1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(unVar);
            int i12 = R.raw.passcode_lock_close;
            int i13 = R.string.TodoCompleteForbiddenForward;
            i11 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
            b02.R(i12, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i13, DialogObject.getName(i11, peerDialogId)))).k(true);
            return false;
        }
        if (s1Var.getMessageObject().canCompleteTodo()) {
            if (unVar.getUserConfig().isPremium()) {
                unVar.getSendMessagesHelper().toggleTodo(ChatObject.getSendAsPeerId(unVar.e, unVar.l8, true), s1Var.getMessageObject(), todoItem, z10, null);
                return true;
            }
            org.telegram.ui.Components.wc.b0(unVar).R(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.TodoPremiumRequired), new qm(this, 9))).k(true);
            return false;
        }
        long peerDialogId2 = DialogObject.getPeerDialogId(s1Var.getMessageObject().getFromPeer());
        org.telegram.ui.Components.wc b03 = org.telegram.ui.Components.wc.b0(unVar);
        int i14 = R.raw.passcode_lock_close;
        int i15 = R.string.TodoCompleteForbidden;
        i10 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
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
        un unVar = this.a;
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
                        int childCount = unVar.x0.getChildCount();
                        for (int i11 = 0; i11 < childCount; i11++) {
                            View childAt = unVar.x0.getChildAt(i11);
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
        unVar.Vb(messageObject, spannableStringBuilder, 1);
        s1Var.i4(1, false, true);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean M() {
        un unVar = this.a;
        return unVar.i6[1].size() + unVar.i6[0].size() > 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void M1(org.telegram.ui.Cells.s1 s1Var, long j10) {
        Bundle h = a1.g.h(j10, "user_id");
        org.telegram.ui.ActionBar.r2 r2Var = this.a;
        if (r2Var.getMessagesController().checkCanOpenChat(h, r2Var, s1Var.getMessageObject())) {
            r2Var.presentFragment(new un(h));
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
        un unVar = this.a;
        if (unVar.getParentActivity() == null) {
            return false;
        }
        i10 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
        if (!MessagesController.getInstance(i10).richEditorAllowed() || (messageObject = s1Var.getMessageObject()) == null || (message = messageObject.messageOwner) == null || message.rich_message == null) {
            return false;
        }
        if (!messageObject.translated || message.translatedRichMessage == null) {
            return messageObject.canEditMessage(unVar.e);
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean O() {
        un unVar = this.a;
        return UserObject.isReplyUser(unVar.f) || UserObject.isUserSelf(unVar.f);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean O0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        un unVar = this.a;
        return unVar.Sb != 0 && s1Var.getMessageObject() != null && unVar.Sb == s1Var.getMessageObject().getId() && unVar.Tb == i10;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void P(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        MessageObject messageObject;
        if (chat == null) {
            return;
        }
        un unVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
        if (kVar.q() || unVar.J9()) {
            un.e2(unVar, s1Var, true, f7, f10);
            return;
        }
        if (z10 || !chat.signature_profiles || (messageObject = s1Var.getMessageObject()) == null || messageObject.getDialogId() == UserObject.REPLY_BOT) {
            o(s1Var, chat, i10, z10);
        } else {
            unVar.xa(DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
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
        un unVar = this.a;
        if (unVar.getParentActivity() == null || (messageObject = s1Var.getMessageObject()) == null || (message = messageObject.messageOwner) == null || messageObject.richLayout == null || (richMessage = message.rich_message) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        messageObject.richLayout.collectMediaBlocks(arrayList);
        int indexOf = arrayList.indexOf(pageBlock);
        if (indexOf < 0) {
            return false;
        }
        PhotoViewer u12 = PhotoViewer.u1();
        u12.M2(null, unVar, null);
        return u12.g2(null, null, null, null, null, null, null, indexOf, new pm(unVar, arrayList), null, 0L, 0L, 0L, true, new om(richMessage, arrayList, messageObject), null);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void R1(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject primaryMessageObject = s1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.a.Ec(primaryMessageObject, false);
    }

    @Override // org.telegram.ui.Cells.j1
    public final int S() {
        return this.a.d4;
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean S0(MessageObject messageObject) {
        fm fmVar;
        long dialogId = messageObject.getDialogId();
        un unVar = this.a;
        return (dialogId == UserObject.REPLY_BOT || ((fmVar = unVar.A0) != null && fmVar.N)) && unVar.d4 != 7;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void U0() {
        un unVar = this.a;
        unVar.X7();
        UndoView undoView = unVar.K3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, unVar.f6, null);
    }

    @Override // org.telegram.ui.Cells.j1
    public final jh.a V() {
        return this.a.mc;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void V1() {
        this.a.z9();
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean W(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var == null ? null : s1Var.getMessageObject();
        if (messageObject == null || messageObject.messageOwner == null) {
            return false;
        }
        un unVar = this.a;
        return (unVar.d4 == 1 || unVar.H9() || messageObject.messageOwner.noforwards || messageObject.type == 29) ? false : true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void W0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        un unVar = this.a;
        if (unVar.I9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) bg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        if (unVar.getParentActivity() != null) {
            if (unVar.a1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                hk hkVar = unVar.Y;
                MessageObject messageObject = s1Var.getMessageObject();
                MessageObject messageObject2 = s1Var.getMessageObject();
                ri riVar = null;
                String str = tL_inlineButtonTypeUrl != null ? tL_inlineButtonTypeUrl.url : null;
                qf.c cVar = unVar.Wb;
                if (cVar != null) {
                    cVar.a(true);
                    unVar.Wb = null;
                }
                if (str == null || s1Var.getMessageObject() == null) {
                    unVar.Wb = null;
                } else {
                    ri riVar2 = new ri(unVar, s1Var.getMessageObject().getId(), str, s1Var, 1);
                    unVar.Wb = riVar2;
                    riVar = riVar2;
                }
                hkVar.Z(keyboardButtonProto, messageObject, messageObject2, riVar);
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void W1(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.a.d8(s1Var, reactionCount, z10, f7, f10);
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
        lk lkVar;
        kk kkVar;
        if (!k()) {
            return false;
        }
        un unVar = this.a;
        ?? r22 = (unVar.e == null || ((lkVar = unVar.a1) != null && lkVar.getVisibility() == 0) || ((kkVar = unVar.R) != null && kkVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat = unVar.e;
        ?? r42 = (chat == null || !(unVar.p4 == 0 || unVar.t4) || (ChatObject.isChannel(chat) && !unVar.e.megagroup)) ? 0 : 1;
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
        TLRPC.UserFull userFull = unVar.getMessagesController().getUserFull(user.id);
        if (userFull != null) {
            b10 = a5.c(user, userFull, g5VarArr);
            if (!c2.b.g(b10)) {
                i11 = ((org.telegram.ui.ActionBar.r2) unVar).classGuid;
                b10 = a5.b(user, i11, g5VarArr);
            }
        } else {
            i10 = ((org.telegram.ui.ActionBar.r2) unVar).classGuid;
            b10 = a5.b(user, i10, g5VarArr);
        }
        if (c2.b.g(b10)) {
            c2.b.m().y((ViewGroup) unVar.fragmentView, unVar.qa, b10, new e7(this, s1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(unVar, s1Var);
        final int i12 = 0;
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(this) { // from class: org.telegram.ui.sm
            public final /* synthetic */ fn b;

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
                        this.b.a.wa(user);
                        break;
                }
            }
        }, false);
        H.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new q1(this, s1Var, user, 25), false);
        final int i13 = 1;
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new Runnable(this) { // from class: org.telegram.ui.sm
            public final /* synthetic */ fn b;

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
                        this.b.a.wa(user);
                        break;
                }
            }
        }, r22);
        final int i14 = 2;
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new Runnable(this) { // from class: org.telegram.ui.sm
            public final /* synthetic */ fn b;

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
                        this.b.a.wa(user);
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
        un unVar = this.a;
        z10 = ((org.telegram.ui.ActionBar.r2) unVar).inPreviewMode;
        if (!z10 || !unVar.V9) {
            return !c();
        }
        j5Var = ((org.telegram.ui.ActionBar.r2) unVar).parentLayout;
        if (j5Var != null) {
            j5Var2 = ((org.telegram.ui.ActionBar.r2) unVar).parentLayout;
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
        un unVar = this.a;
        try {
            if (i10 == 0) {
                unVar.o7();
                dl dlVar = unVar.L3;
                if (dlVar == null) {
                    return;
                }
                dlVar.l(0L, 84, null, new qm(this, i15));
                unVar.L3.performHapticFeedback(3, 2);
                return;
            }
            if (i10 == 1) {
                String formatDateTime = LocaleController.formatDateTime(unVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                if (unVar.getMessagesController().transcribeAudioTrialCooldownUntil > 0) {
                    i12 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeftUntil", org.telegram.ui.Components.l41.h(i12), formatDateTime));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeft", org.telegram.ui.Components.l41.h(i11), new Object[0]));
                }
                org.telegram.ui.Components.wc.b0(unVar).G(R.raw.transcribe, 6, replaceTags).k(true);
                unVar.fragmentView.performHapticFeedback(3, 2);
                return;
            }
            if (i10 == 2 || i10 == 3) {
                String formatDateTime2 = LocaleController.formatDateTime(unVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(unVar);
                int i16 = R.raw.transcribe;
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialEnd", unVar.getMessagesController().transcribeAudioTrialWeeklyNumber, new Object[0]))).append((CharSequence) " ").append(i10 == 2 ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TranscriptionTrialEndBuy), new qm(this, i14)) : unVar.getMessagesController().transcribeAudioTrialCooldownUntil <= 0 ? "" : AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TranscriptionTrialEndWaitOrBuy, formatDateTime2), new qm(this, i13)));
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
        un unVar = this.a;
        if (unVar.getParentLayout() == null || !W(s1Var)) {
            return;
        }
        org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(unVar, s1Var);
        H.c(R.drawable.msg_download, LocaleController.getString(R.string.SaveToDownloads), new q1(this, s1Var, document, 24), false);
        H.t = false;
        H.Z();
    }

    @Override // org.telegram.ui.Cells.j1
    public final void Z1() {
        un unVar = this.a;
        if (!unVar.getUserConfig().isPremium()) {
            org.telegram.ui.Components.wc.b0(unVar).R(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("UnlockSimilarChannelsPremium", unVar.getMessagesController().recommendedChannelsLimitPremium), new qm(this, 4))).j();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", unVar.f6);
        bundle.putInt("start_from", 10);
        unVar.presentFragment(new org.telegram.ui.Components.ta0(bundle, unVar.m1.getSharedMediaPreloader()));
    }

    public final void a(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        un unVar = this.a;
        hk hkVar = unVar.Y;
        if (hkVar != null) {
            CharSequence fieldText = hkVar.getFieldText();
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
                unVar.Y.setFieldText(spannableStringBuilder);
                AndroidUtilities.runOnUIThread(new qm(this, 6), 200L);
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
        un unVar = this.a;
        fi.v3 v3Var = unVar.M1;
        if (v3Var != null) {
            v3Var.e(true);
        }
        if (unVar.getParentActivity() == null || (messageObject = s1Var.getMessageObject()) == null || (factCheck = messageObject.getFactCheck()) == null || factCheck.country == null) {
            return;
        }
        try {
            str = new Locale("", factCheck.country).getDisplayCountry(LocaleController.getInstance().getCurrentLocale());
        } catch (Exception e) {
            FileLog.e(e);
            str = factCheck.country;
        }
        fi.v3 v3Var2 = new fi.v3(unVar.getParentActivity(), 3);
        v3Var2.p(true);
        v3Var2.K = Layout.Alignment.ALIGN_NORMAL;
        v3Var2.d = -1L;
        v3Var2.T = true;
        v3Var2.e = true;
        v3Var2.q(12.0f);
        unVar.M1 = v3Var2;
        v3Var2.l0 = new ed(20, this, v3Var2);
        v3Var2.s(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FactCheckToast, str)));
        unVar.j1.addView(unVar.M1, org.telegram.ui.Components.gb1.h(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
        unVar.j1.post(new i2.b0(this, s1Var, i11, i10, 4));
    }

    public final void b(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        un unVar = this.a;
        hk hkVar = unVar.Y;
        if (hkVar != null) {
            CharSequence fieldText = hkVar.getFieldText();
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
                spannableString.setSpan(new org.telegram.ui.Components.a71("" + user.id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            unVar.Y.setFieldText(spannableStringBuilder);
            AndroidUtilities.runOnUIThread(new qm(this, 7), 200L);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void b0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
        this.a.P7(s1Var, true, false, f7, f10, false, false, false);
    }

    @Override // org.telegram.ui.Cells.j1
    public final org.telegram.ui.Cells.t9 b2() {
        return this.a.o9;
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z10;
        un unVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
        if (kVar == null) {
            return false;
        }
        kVar2 = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
        if (kVar2.q() || unVar.J9()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.r2) unVar).inPreviewMode;
        return !z10;
    }

    @Override // org.telegram.ui.Cells.j1
    public final int c0(org.telegram.ui.Cells.s1 s1Var) {
        sh.c cVar;
        un unVar = this.a;
        if (!unVar.Tc.f || (cVar = unVar.Zc) == null || cVar.n != s1Var || cVar.a.getWidth() <= 0) {
            return 0;
        }
        return unVar.Zc.a.getHeight();
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean d() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void d0(org.telegram.ui.Cells.s1 s1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        un unVar = this.a;
        if (unVar.getParentActivity() == null) {
            return;
        }
        if (unVar.ja == null) {
            wh.i iVar = new wh.i(unVar.getParentActivity());
            unVar.ja = iVar;
            unVar.j1.addView(iVar, org.telegram.ui.Components.gb1.i(-1, -1, 48));
        }
        wh.i iVar2 = unVar.ja;
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
        wh.h hVar = new wh.h(iVar2, s1Var, arrayList4, new vi.i0(1, iVar2, b10));
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
        un unVar = this.a;
        unVar.getUserConfig().getCurrentUser();
        if (!AndroidUtilities.isContextSafe(unVar.getParentActivity()) || (chat = unVar.e) == null || currentUser == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
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
                z10 = channelParticipant.promoted_by == unVar.getUserConfig().getClientUserId();
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
                    z11 = channelParticipant2.promoted_by == unVar.getUserConfig().getClientUserId();
                } else {
                    z11 = false;
                    z13 = false;
                }
                str2 = channelParticipant2.rank;
                z12 = z11;
                boolean z15 = z13;
                boolean z16 = z14;
                Activity parentActivity = unVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                long j10 = -unVar.e.id;
                u6Var = ((org.telegram.ui.ActionBar.r2) unVar).resourceProvider;
                org.telegram.ui.Components.i11.b(parentActivity, i10, j10, currentUser, str2, z15, z16, z12, u6Var);
            }
            if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                if (ChatObject.isChannel(unVar.e)) {
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                    unVar.getMessagesController();
                    tL_channels_getParticipant.channel = MessagesController.getInputChannel(unVar.e);
                    tL_channels_getParticipant.participant = unVar.getMessagesController().getInputPeer(currentUser.id);
                    unVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new org.telegram.messenger.a(), new bi.m5(11, this, s1Var));
                    return;
                }
                return;
            }
            if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                z10 = false;
                z14 = true;
            } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                z10 = ((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == unVar.getUserConfig().getClientUserId();
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
        Activity parentActivity2 = unVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
        long j102 = -unVar.e.id;
        u6Var = ((org.telegram.ui.ActionBar.r2) unVar).resourceProvider;
        org.telegram.ui.Components.i11.b(parentActivity2, i10, j102, currentUser, str2, z152, z162, z12, u6Var);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean e0() {
        boolean z10;
        un unVar = this.a;
        if (unVar.J9()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.r2) unVar).inPreviewMode;
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
        un unVar = this.a;
        if (isHuaweiStoreApp) {
            qf.d.r(unVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            qf.d.r(unVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void f1(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
        wh.h hVar;
        wh.i iVar = this.a.ja;
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
        rj rjVar;
        if (s1Var == null || (primaryMessageObject = s1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.forceUpdate = true;
        un unVar = this.a;
        oj ojVar = unVar.x0;
        if (ojVar != null && (rjVar = unVar.z0) != null && rjVar.y < 0) {
            for (int childCount = ojVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = unVar.x0.getChildAt(childCount);
                unVar.x0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.s1)) {
                        if (childAt instanceof org.telegram.ui.Cells.v0) {
                            i11 = unVar.V8(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.s1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = unVar.V8(childAt);
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
                rj rjVar2 = unVar.z0;
                unVar.x0.getClass();
                rjVar2.i1(RecyclerView.R(s1Var), s1Var.getTop() - ((int) unVar.E9), false);
            } else {
                unVar.z0.h1(i10, i11);
            }
        }
        unVar.Z0 = z11;
        unVar.Ec(primaryMessageObject, false);
        unVar.Z0 = false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void g0(String str) {
        un unVar = this.a;
        lk lkVar = unVar.a1;
        if (lkVar == null || lkVar.getVisibility() != 0) {
            kk kkVar = unVar.R;
            if ((kkVar == null || kkVar.getVisibility() != 0) && unVar.Y != null && str != null && str.length() > 0) {
                unVar.Y.setFieldText("@" + str + " ");
                unVar.Y.F0();
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final String h(org.telegram.ui.Cells.s1 s1Var) {
        un unVar;
        int i10;
        if (s1Var.getMessageObject() == null || (i10 = (unVar = this.a).Sb) == 0 || i10 != s1Var.getMessageObject().getId() || unVar.Tb != 3) {
            return null;
        }
        return unVar.Vb;
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean h0(org.telegram.ui.Components.c6 c6Var) {
        TLRPC.InputStickerSet inputStickerSet;
        int i10;
        un unVar = this.a;
        if (unVar.getMessagesController().premiumFeaturesBlocked() || c6Var == null || c6Var.standard) {
            return false;
        }
        long documentId = c6Var.getDocumentId();
        TLRPC.Document document = c6Var.document;
        if (document == null) {
            i10 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
            document = org.telegram.ui.Components.t5.f(i10, documentId);
        }
        if (document == null || (inputStickerSet = MessageObject.getInputStickerSet(document)) == null) {
            return false;
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, true);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(inputStickerSet);
        org.telegram.ui.Components.aw awVar = new org.telegram.ui.Components.aw(unVar, unVar.getParentActivity(), unVar.qa, arrayList);
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
        awVar.setCalcMandatoryInsets(unVar.F9());
        unVar.showDialog(awVar);
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
        un unVar = this.a;
        if (a10) {
            org.telegram.ui.Components.wc.b0(unVar).R(R.raw.e_hand_2, 36, sh.i.b(messageObject, a2)).j();
            return;
        }
        if (i10 < 0 && !arrayList.isEmpty()) {
            unVar.getSendMessagesHelper().sendVote(messageObject, arrayList, null);
            s1Var.R0(true);
            return;
        }
        if (unVar.getParentActivity() == null) {
            return;
        }
        if (unVar.z2 == null) {
            org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(5, unVar.getParentActivity(), unVar.qa, false);
            unVar.z2 = t40Var;
            t40Var.setAlpha(0.0f);
            unVar.z2.setVisibility(4);
            int indexOfChild = unVar.j1.indexOfChild(unVar.S);
            if (indexOfChild == -1) {
                return;
            } else {
                unVar.j1.addView(unVar.z2, indexOfChild + 1, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
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
                float y3 = ((s1Var.getY() + q1Var.b) - AndroidUtilities.dp(4.0f)) - unVar.E9;
                unVar.C2 = AndroidUtilities.dp(13.3f) + q1Var.a;
                int w10 = d3.w(6.0f, q1Var.b, i12);
                unVar.D2 = w10;
                if (y3 > 0.0f) {
                    i15 = unVar.C2;
                    i13 = w10;
                    f7 = 0.0f;
                    break;
                }
                i16++;
                f7 = y3;
            }
            if (f7 != 0.0f) {
                unVar.x0.w0(0, (int) f7, null);
                unVar.B2 = s1Var;
                return;
            }
            i14 = i15;
        }
        unVar.z2.e(s1Var, Integer.valueOf(i10), i14, i13, true);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void j() {
        f();
    }

    @Override // org.telegram.ui.Cells.j1
    public final void j0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
        un unVar = this.a;
        unVar.P7(s1Var, false, false, f7, f10, true, false, false);
        unVar.x0.getClass();
        un.f2(unVar, RecyclerView.R(s1Var));
    }

    public final boolean k() {
        un unVar = this.a;
        if (UserObject.isUserSelf(unVar.f)) {
            return true;
        }
        TLRPC.Chat chat = unVar.e;
        if (chat != null) {
            return !ChatObject.isChannel(chat) || unVar.e.megagroup;
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean k1() {
        un unVar = this.a;
        return unVar.j1.getMeasuredWidth() > unVar.j1.getMeasuredHeight();
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
        un unVar = this.a;
        if (geoPoint != null) {
            if (AndroidUtilities.isMapsInstalled(unVar)) {
                cn cnVar = new cn(3);
                u6Var2 = ((org.telegram.ui.ActionBar.r2) unVar).resourceProvider;
                cnVar.setResourceProvider(u6Var2);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = unVar.getMessagesController().getPeer(unVar.a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                tL_messageMediaGeo.geo = messageMedia.geo;
                String str = messageMedia.address;
                if (str == null) {
                    str = (pollAnswer == null || (tL_textWithEntities = pollAnswer.text) == null) ? "" : tL_textWithEntities.text;
                }
                tL_messageMediaGeo.address = str;
                tL_message.media = tL_messageMediaGeo;
                cnVar.N0 = false;
                cnVar.v0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                unVar.presentFragment(cnVar);
                return;
            }
            return;
        }
        if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
            ft.o().u(unVar.getParentActivity());
            ft.o().t(new dn(this, tL_messageMediaPoll, pollAnswer, s1Var));
            ft o10 = ft.o();
            TLRPC.Document document4 = messageMedia.document;
            int i18 = MessageObject.isAnimatedEmoji(document4) ? 2 : 0;
            MessageObject messageObject2 = s1Var.getMessageObject();
            u6Var = ((org.telegram.ui.ActionBar.r2) unVar).resourceProvider;
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
            TLRPC.TL_message J7 = un.J7(message);
            J7.media = messageMedia;
            J7.attachPath = sh.f.c(message, i10);
            ArrayList<MessageObject> arrayList = new ArrayList<>();
            i17 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
            MessageObject messageObject3 = new MessageObject(i17, J7, false, true);
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
            i15 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
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
            TLRPC.TL_message J72 = un.J7(message2);
            J72.media = messageMedia;
            J72.attachPath = sh.f.c(message2, i10);
            i16 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
            en enVar = new en(i16, J72, false, true);
            if (MessageObject.canPreviewDocument(messageMedia.document)) {
                PhotoViewer.u1().M2(null, unVar, unVar.qa);
                PhotoViewer u12 = PhotoViewer.u1();
                int i19 = enVar.type;
                u12.h2(enVar, unVar, i19 != 0 ? unVar.f6 : 0L, i19 != 0 ? unVar.X6 : 0L, i19 != 0 ? unVar.b() : 0L, unVar.Sa);
                return;
            }
            try {
                AndroidUtilities.openForView(enVar, unVar.getParentActivity(), unVar.qa, false);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                unVar.E6(enVar);
                return;
            }
        }
        TLRPC.Message message3 = messageObject.messageOwner;
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
        if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || MessageObject.isVideoDocument(document3))) {
            i11 = messageMedia3 == messageMedia ? arrayList3.size() : -1;
            TLRPC.TL_message J73 = un.J7(message3);
            J73.media = messageMedia3;
            J73.attachPath = sh.f.c(message3, -2);
            i14 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
            arrayList3.add(new vm(i14, J73, false, true));
            arrayList2.add(-2);
        } else {
            i11 = -1;
        }
        if (messageObject.expandedExplanation && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || MessageObject.isVideoDocument(document2))) {
            if (messageMedia2 == messageMedia) {
                i11 = arrayList3.size();
            }
            TLRPC.TL_message J74 = un.J7(message3);
            J74.media = messageMedia2;
            J74.attachPath = sh.f.c(message3, -3);
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            J74.message = pollResults2.solution;
            J74.entities = pollResults2.solution_entities;
            i13 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
            arrayList3.add(new wm(i13, J74, false, true));
            arrayList2.add(-3);
        }
        bg.d.b(tL_messageMediaPoll.poll, unVar.getUserConfig().getClientUserId());
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
                TLRPC.TL_message J75 = un.J7(message3);
                J75.media = messageMedia4;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                J75.message = tL_textWithEntities2.text;
                J75.entities = tL_textWithEntities2.entities;
                J75.attachPath = sh.f.c(message3, pollAnswer2.unshuffled_index);
                i12 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                arrayList3.add(new xm(i12, J75, false, true));
                arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
            }
        }
        if (i11 <= -1 || arrayList3.isEmpty()) {
            return;
        }
        messageObject.pollMediaMapping = arrayList2;
        PhotoViewer.u1().M2(null, unVar, unVar.qa);
        PhotoViewer.u1().d2(arrayList3, i11, unVar.a(), 0L, 0L, unVar.Ta);
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
        un unVar = this.a;
        if (unVar.x3 || unVar.x0 == null || unVar.getParentActivity() == null || unVar.fragmentView == null) {
            return;
        }
        if (unVar.G2 == null) {
            mm mmVar = unVar.j1;
            int indexOfChild = mmVar.indexOfChild(unVar.S);
            if (indexOfChild == -1) {
                return;
            }
            org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(1, unVar.getParentActivity(), unVar.qa, false);
            unVar.G2 = t40Var;
            mmVar.addView(t40Var, indexOfChild + 1, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            unVar.G2.setAlpha(0.0f);
            unVar.G2.setVisibility(4);
        }
        unVar.G2.e(s1Var, null, 0, 0, true);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void m0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f7, float f10) {
        org.telegram.ui.ActionBar.k kVar;
        un unVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
        boolean z10 = true;
        if (kVar.q() || unVar.J9()) {
            un.e2(unVar, s1Var, true, f7, f10);
            return;
        }
        if (s1Var.getMessageObject() != null && s1Var.getMessageObject().isSponsored()) {
            E0(10, s1Var);
            return;
        }
        if (!ChatObject.isForum(unVar.e) && !unVar.O9()) {
            z10 = false;
        }
        y(user, z10);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void m1(org.telegram.ui.Cells.s1 s1Var) {
        un.W4(this.a, s1Var);
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
        un unVar = this.a;
        TLRPC.Chat chat2 = unVar.e;
        if (chat2 != null && chat.id == chat2.id) {
            ij ijVar = unVar.m1;
            if (ijVar != null && i10 == 0) {
                ijVar.e(false, false);
                return;
            } else {
                if (s1Var.getMessageObject() != null) {
                    unVar.j(i10, s1Var.getMessageObject().getId(), true, 0, false, 0);
                    return;
                }
                return;
            }
        }
        if (chat2 == null || chat.id != chat2.id || unVar.O9()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            si siVar = null;
            if (z10) {
                qf.c cVar = unVar.Wb;
                if (cVar != null) {
                    cVar.a(true);
                    unVar.Wb = null;
                }
                if (s1Var.getMessageObject() == null) {
                    unVar.Wb = null;
                } else {
                    si siVar2 = new si(unVar, s1Var.getMessageObject().getId(), s1Var, 0);
                    unVar.Wb = siVar2;
                    siVar = siVar2;
                }
            }
            if (unVar.getMessagesController().checkCanOpenChat(bundle, unVar, s1Var.getMessageObject(), siVar)) {
                un unVar2 = new un(bundle);
                if (siVar == null || i10 == 0) {
                    unVar.presentFragment(unVar2);
                } else {
                    AndroidUtilities.runOnUIThread(new bi.sb(this, siVar, chat, i10, unVar2, 18), 5000L);
                    siVar.d();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:276:0x0b0f, code lost:
    
        if (r0.exists() != false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0bd3, code lost:
    
        if (r4.startsWith("text/x-web-markdown") == false) goto L320;
     */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0c1e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:327:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Cells.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10, boolean z10) {
        int i10;
        MessageObject messageObject;
        boolean z11;
        MessageObject messageObject2;
        un unVar;
        boolean z12;
        long j10;
        long j11;
        File file;
        TLRPC.Chat chat;
        float f11;
        float f12;
        qu0 qu0Var;
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
        un unVar2 = this.a;
        if (i13 == 23) {
            TLRPC.MessageMedia messageMedia2 = messageObject5.messageOwner.media;
            TL_stories.StoryItem storyItem = messageMedia2.storyItem;
            if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                return;
            }
            storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia2.peer);
            storyItem.messageId = messageObject5.getId();
            storyItem.messageType = 2;
            di.a8.b(storyItem, unVar2.f);
            unVar2.getOrCreateStoryViewer().F(unVar2.getParentActivity(), messageObject5.messageOwner.media.storyItem, di.q7.a(unVar2.x0));
            return;
        }
        int i14 = 1;
        if (messageObject5.isVideo()) {
            i12 = ((org.telegram.ui.ActionBar.r2) unVar2).currentAccount;
            if (DownloadController.getInstance(i12).canDownloadMedia(messageObject5.messageOwner) == 1) {
                messageObject5.putInDownloadsStore = true;
            }
        } else {
            messageObject5.putInDownloadsStore = true;
        }
        if (messageObject5.isSendError()) {
            unVar2.P7(s1Var, false, false, f7, f10, true, false, false);
            return;
        }
        if (messageObject5.isSending()) {
            return;
        }
        int i15 = 0;
        if (z10 && (message = messageObject5.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && !TextUtils.isEmpty(webPage.url)) {
            String str = messageObject5.messageOwner.media.webpage.url;
            AndroidUtilities.getHostAuthority(str);
            if (unVar2.oa(str, s1Var, null, messageObject5.getId(), 2)) {
                return;
            }
            qf.c cVar = unVar2.Wb;
            if (cVar != null) {
                cVar.a(true);
            }
            unVar2.Wb = s1Var.getMessageObject() != null ? new ym(this, s1Var, i15) : null;
            qf.d.q(unVar2.getParentActivity(), Uri.parse(str), true, false, false, unVar2.Wb, null, false, true, false);
            return;
        }
        int i16 = 5;
        if (messageObject5.isDice()) {
            rm rmVar = new rm(this, messageObject5, i15);
            if (messageObject5.isStakeableDice()) {
                unVar2.getMessagesController().loadStakeDiceInfo(new y(this, messageObject5, rmVar, i16));
                return;
            } else {
                rmVar.run();
                return;
            }
        }
        if ((messageObject5.isAnimatedEmoji() && (!messageObject5.isAnimatedAnimatedEmoji() || (unVar2.Ja.e.containsKey(oy.p(MessageObject.findAnimatedEmojiEmoticon(messageObject5.getDocument()))) && unVar2.f != null))) || messageObject5.isPremiumSticker()) {
            unVar2.Wa(s1Var);
            unVar2.Ja.k(s1Var, unVar2, true);
            unVar2.x0.I0(false);
            return;
        }
        int i17 = 6;
        if (messageObject5.needDrawBluredPreview()) {
            te qb2 = unVar2.qb(messageObject5, false);
            a3.i0 R4 = un.R4(unVar2, messageObject5);
            s1Var.invalidate();
            final SecretMediaViewer f13 = SecretMediaViewer.f();
            final Activity parentActivity = unVar2.getParentActivity();
            int i18 = UserConfig.selectedAccount;
            f13.a = i18;
            ImageReceiver imageReceiver = f13.h;
            imageReceiver.setCurrentAccount(i18);
            if (f13.b == parentActivity) {
                f11 = 0.0f;
            } else {
                f13.b = parentActivity;
                f13.g1 = new org.telegram.ui.Components.un0(parentActivity, null);
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
                f13.e.addView(f13.f, org.telegram.ui.Components.gb1.i(-1, -2, 80));
                f13.e.setFocusable(false);
                f13.d.addView(f13.e);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f13.e.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                layoutParams.gravity = 51;
                f13.e.setLayoutParams(layoutParams);
                f13.e.setFitsSystemWindows(true);
                f13.e.setOnApplyWindowInsetsListener(new p31(f13, 0));
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
                f13.e.addView(f13.F, org.telegram.ui.Components.gb1.g(-2.0f, -1));
                f13.F.setActionBarMenuOnItemClick(new p11(f13, 5));
                fi.v3 v3Var = new fi.v3(parentActivity, 1);
                f13.r = v3Var;
                v3Var.l(1.0f, -26.0f);
                f13.r.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                f13.e.addView(f13.r, org.telegram.ui.Components.gb1.h(-1, 80.0f, 53, 0.0f, 48.0f, 0.0f, 0.0f));
                v31 v31Var = new v31(f13, parentActivity);
                f13.n = v31Var;
                f13.e.addView(v31Var, org.telegram.ui.Components.gb1.h(119, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
                uv0 uv0Var = new uv0(f13, i14);
                f13.U = new w31(f13, parentActivity);
                View view2 = new View(parentActivity);
                f13.T = view2;
                view2.setBackgroundColor(2130706432);
                f13.U.addView(f13.T, org.telegram.ui.Components.gb1.i(-1, -1, 119));
                org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(f13.e.getContext());
                f13.S = b6Var;
                b6Var.setTextColor(-1);
                f13.S.setGravity(53);
                f13.S.setTextSize(14);
                f13.S.setImportantForAccessibility(2);
                f13.U.addView(f13.S, org.telegram.ui.Components.gb1.h(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
                z10 z10Var = new z10(f13, parentActivity, 8);
                f13.R = z10Var;
                org.telegram.ui.Components.u81 u81Var = new org.telegram.ui.Components.u81(z10Var);
                f13.Q = u81Var;
                u81Var.z = AndroidUtilities.dp(2.0f);
                org.telegram.ui.Components.u81 u81Var2 = f13.Q;
                u81Var2.k = 872415231;
                u81Var2.l = 872415231;
                u81Var2.m = -1;
                u81Var2.n = -1;
                u81Var2.A = 1509949439;
                u81Var2.j = uv0Var;
                f13.U.addView(f13.R);
                f13.e.addView(f13.U, org.telegram.ui.Components.gb1.i(-1, 48, 80));
                js0 js0Var = new js0(null, new di.b());
                f13.Y = js0Var;
                js0Var.j0 = true;
                js0Var.h0 = false;
                eu0 eu0Var = new eu0(f13.e.getContext());
                f13.Z = eu0Var;
                eu0Var.setFactory(new ViewSwitcher.ViewFactory() { // from class: org.telegram.ui.q31
                    @Override // android.widget.ViewSwitcher.ViewFactory
                    public final View makeView() {
                        SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
                        return new du0(parentActivity, secretMediaViewer.a0, secretMediaViewer.Y, new e5(secretMediaViewer, 22), new xf0(secretMediaViewer, 2));
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
                org.telegram.ui.Components.dh0 dh0Var = new org.telegram.ui.Components.dh0(28);
                f13.W = dh0Var;
                dh0Var.setCallback(f13.V);
                f13.V.setImageDrawable(f13.W);
                f13.V.setScaleType(ImageView.ScaleType.CENTER);
                f13.V.setScaleX(0.6f);
                f13.V.setScaleY(0.6f);
                f11 = 0.0f;
                f13.V.setAlpha(0.0f);
                f13.V.setPivotX(AndroidUtilities.dp(32.0f));
                f13.V.setPivotY(AndroidUtilities.dp(32.0f));
                f13.e.addView(f13.V, org.telegram.ui.Components.gb1.i(64, 64, 17));
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
            ml mlVar = unVar2.Sa;
            SecretMediaViewer.PhotoBackgroundDrawable photoBackgroundDrawable = f14.l0;
            ImageReceiver imageReceiver2 = f14.h;
            if (f14.b == null || !messageObject5.needDrawBluredPreview() || mlVar == null) {
                return;
            }
            float f15 = f11;
            qu0 E = mlVar.E(messageObject5, null, 0, true, false);
            if (E == null) {
                return;
            }
            f14.q1 = messageObject5.messageOwner.ttl == Integer.MAX_VALUE;
            f14.p1 = R4;
            f14.N = mlVar;
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
                    qu0Var = E;
                    i11 = 4;
                    c10 = 6;
                    messageObject4 = messageObject5;
                    imageReceiver2.setImage(forDocument, (String) null, f14.i0 != null ? new BitmapDrawable(f14.i0.bitmap) : null, -1L, (String) null, messageObject4, 1);
                } else {
                    f12 = 1.0f;
                    qu0Var = E;
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
                qu0Var = E;
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
                v31 v31Var2 = f14.n;
                v31Var2.e = true;
                TextPaint textPaint = v31Var2.r;
                textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
                textPaint.setColor(-1);
                StaticLayout staticLayout = new StaticLayout("1", textPaint, 999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                v31Var2.s = staticLayout;
                v31Var2.v = staticLayout.getLineCount() > 0 ? v31Var2.s.getLineWidth(0) : 0.0f;
                v31Var2.w = v31Var2.s.getHeight();
                v31Var2.invalidate();
                f14.n.setOnClickListener(new t21(f14, i11));
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
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(f14.a0, (Property<ot0, Float>) property, 0.0f, 1.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(f14.r, (Property<fi.v3, Float>) property, 0.0f, 1.0f);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.v6.d, 0, 255);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(f14, f14.v1, 0.0f, 1.0f);
            w31 w31Var = f14.U;
            int i21 = i11;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(w31Var, w31Var.n, f12);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(f14.U, (Property<w31, Float>) property, f14.J ? f12 : 0.0f);
            Animator[] animatorArr = new Animator[7];
            animatorArr[0] = ofFloat;
            animatorArr[1] = ofFloat2;
            animatorArr[2] = ofFloat3;
            animatorArr[3] = ofInt;
            animatorArr[i21] = ofFloat4;
            animatorArr[5] = ofFloat5;
            animatorArr[c10] = ofFloat6;
            animatorSet.playTogether(animatorArr);
            f14.m0 = 3;
            f14.o0 = new oe0(f14, qb2, messageObject3, 29);
            f14.K0.setDuration(250L);
            f14.K0.addListener(new t31(f14, 0));
            f14.n0 = System.currentTimeMillis();
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                f14.e.setLayerType(2, null);
            }
            f14.K0.setInterpolator(new DecelerateInterpolator());
            photoBackgroundDrawable.b = 0;
            photoBackgroundDrawable.a = new fy0(17, f14, qu0Var);
            f14.K0.start();
            return;
        }
        if (MessageObject.isAnimatedEmoji(messageObject5.getDocument()) && MessageObject.getInputStickerSet(messageObject5.getDocument()) != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(MessageObject.getInputStickerSet(messageObject5.getDocument()));
            org.telegram.ui.Components.aw awVar = new org.telegram.ui.Components.aw(unVar2, unVar2.getParentActivity(), unVar2.qa, arrayList);
            awVar.setCalcMandatoryInsets(unVar2.F9());
            unVar2.showDialog(awVar);
            return;
        }
        if (messageObject5.getInputStickerSet() != null) {
            org.telegram.ui.Components.cz0 cz0Var = new org.telegram.ui.Components.cz0(unVar2.getParentActivity(), unVar2, messageObject5.getInputStickerSet(), null, (unVar2.a1.getVisibility() == 0 || !((chat = unVar2.e) == null || ChatObject.canSendStickers(chat))) ? null : unVar2.Y, unVar2.qa);
            cz0Var.setCalcMandatoryInsets(unVar2.F9());
            unVar2.showDialog(cz0Var);
            return;
        }
        if (messageObject5.isVideo() || (i10 = messageObject5.type) == 1 || ((i10 == 0 && !messageObject5.isWebpageDocument()) || messageObject5.isGif())) {
            if (messageObject5.isSponsored()) {
                if (messageObject5.isGif() || messageObject5.isPhoto()) {
                    int i22 = 1;
                    unVar2.T9(messageObject5, true, false);
                    if (messageObject5.sponsoredUrl != null) {
                        qf.c cVar2 = unVar2.Wb;
                        if (cVar2 != null) {
                            cVar2.a(true);
                        }
                        unVar2.Wb = s1Var.getMessageObject() == null ? null : new ym(this, s1Var, i22);
                        qf.d.q(unVar2.getParentActivity(), Uri.parse(messageObject5.sponsoredUrl), true, false, false, unVar2.Wb, null, false, unVar2.getMessagesController().sponsoredLinksInappAllow, false);
                        return;
                    }
                    return;
                }
                if (messageObject5.isVideo()) {
                    unVar2.T9(messageObject5, true, false);
                }
            }
            if (messageObject5.getDuration() > 0.0d && messageObject5.getVideoStartsTimestamp() > 0 && !messageObject5.openedInViewer) {
                messageObject5.forceSeekTo = (float) (messageObject5.getVideoStartsTimestamp() / messageObject5.getDuration());
            }
            unVar2.ra(s1Var, messageObject5);
            return;
        }
        int i23 = messageObject5.type;
        if (i23 == 3) {
            unVar2.qb(messageObject5, true);
            try {
                String str3 = messageObject5.messageOwner.attachPath;
                File file4 = (str3 == null || str3.length() == 0) ? null : new File(messageObject5.messageOwner.attachPath);
                if (file4 == null || !file4.exists()) {
                    file4 = unVar2.getFileLoader().getPathToMessage(messageObject5.messageOwner);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setFlags(1);
                    intent.setDataAndType(FileProvider.d(unVar2.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", file4), "video/mp4");
                } else {
                    intent.setDataAndType(Uri.fromFile(file4), "video/mp4");
                }
                unVar2.getParentActivity().startActivityForResult(intent, 500);
                return;
            } catch (Exception e10) {
                FileLog.e(e10);
                unVar2.E6(messageObject5);
                return;
            }
        }
        if (i23 == 4) {
            if (AndroidUtilities.isMapsInstalled(unVar2)) {
                if (!messageObject5.isLiveLocation()) {
                    pc0 pc0Var = new pc0(unVar2.h != null ? 0 : 3);
                    pc0Var.E0 = unVar2;
                    pc0Var.v0(messageObject5);
                    unVar2.presentFragment(pc0Var);
                    return;
                }
                TLRPC.Chat chat2 = unVar2.e;
                pc0 pc0Var2 = new pc0((chat2 == null || ChatObject.canSendMessages(chat2) || unVar2.e.megagroup) ? 2 : 6);
                pc0Var2.E0 = unVar2;
                pc0Var2.v0(messageObject5);
                unVar2.presentFragment(pc0Var2);
                return;
            }
            return;
        }
        if (i23 != 9 && i23 != 0) {
            return;
        }
        if (messageObject5.getDocumentName().toLowerCase().endsWith("attheme")) {
            String str4 = messageObject5.messageOwner.attachPath;
            if (str4 != null && str4.length() != 0) {
                file = new File(messageObject5.messageOwner.attachPath);
            }
            file = null;
            if (file == null) {
                File pathToMessage2 = unVar2.getFileLoader().getPathToMessage(messageObject5.messageOwner);
                if (pathToMessage2.exists()) {
                    file = pathToMessage2;
                }
            }
            org.telegram.ui.ActionBar.x6 u10 = org.telegram.ui.ActionBar.y6.u(file, messageObject5.getDocumentName(), null, true);
            if (u10 != null) {
                unVar2.presentFragment(new tc1(u10));
                return;
            }
            unVar2.J4 = -1;
        }
        if (messageObject5.canPreviewDocument()) {
            PhotoViewer.u1().M2(null, unVar2, unVar2.qa);
            PhotoViewer u12 = PhotoViewer.u1();
            int i24 = messageObject5.type;
            long j12 = i24 != 0 ? unVar2.f6 : 0L;
            if (i24 != 0) {
                j11 = 0;
                j10 = unVar2.X6;
            } else {
                j10 = 0;
                j11 = 0;
            }
            if (i24 != 0) {
                j11 = unVar2.b();
            }
            messageObject = messageObject5;
            u12.h2(messageObject, unVar2, j12, j10, j11, unVar2.Sa);
            z11 = true;
        } else {
            messageObject = messageObject5;
            z11 = false;
        }
        Pattern pattern = org.telegram.ui.Components.na0.a;
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
            unVar = unVar2;
            messageObject2 = messageObject;
            if (z12) {
                try {
                    AndroidUtilities.openForView(messageObject2, unVar.getParentActivity(), unVar.qa, false);
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    unVar.E6(messageObject2);
                    return;
                }
            }
            return;
        }
        if (unVar2.getParentActivity() == null) {
            unVar = unVar2;
            messageObject2 = messageObject;
        } else {
            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(unVar2.getParentActivity(), 3, unVar2.qa);
            e2Var.setCanceledOnTouchOutside(false);
            boolean[] zArr = {false};
            e2Var.setOnCancelListener(new yg(0, zArr));
            e2Var.r(150L);
            MessageObject messageObject6 = messageObject;
            m4.v0 v0Var = new m4.v0(unVar2, messageObject6, e2Var, zArr, 15);
            messageObject2 = messageObject6;
            unVar = unVar2;
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
        un unVar = this.a;
        if (unVar.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.e41 e41Var = unVar.d2;
        boolean z10 = true;
        if (e41Var != null && unVar.p4 == 0 && (s1Var.T7 || s1Var.U7)) {
            e41Var.n(s1Var.getMessageObject().getTopicId(), true);
            return;
        }
        if (unVar.getMessagesController().isFrozen()) {
            i13 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
            b.b(i13);
            return;
        }
        hk hkVar = unVar.Y;
        if (hkVar != null) {
            hkVar.M();
        }
        MessageObject messageObject = s1Var.getMessageObject();
        int i14 = unVar.d4;
        if (i14 == 2) {
            unVar.h9.Q0(messageObject.getId());
            unVar.finishFragment();
            return;
        }
        if (i14 == 3 || ((i14 == 7 && unVar.a4 == 2) || !((!UserObject.isReplyUser(unVar.f) && !UserObject.isUserSelf(unVar.f)) || (messageFwdHeader = messageObject.messageOwner.fwd_from) == null || messageFwdHeader.saved_from_peer == null))) {
            if (UserObject.isReplyUser(unVar.f) && (messageReplyHeader = (message = messageObject.messageOwner).reply_to) != null && (i10 = messageReplyHeader.reply_to_top_id) != 0) {
                unVar.ka(messageReplyHeader.reply_to_peer_id.channel_id, null, i10, 0L, -1, message.fwd_from.saved_from_msg_id, messageObject);
                return;
            } else if (unVar.d4 == 7 && unVar.a4 == 2) {
                unVar.pa(messageObject);
                return;
            } else {
                unVar.qa(messageObject);
                return;
            }
        }
        ArrayList<MessageObject> arrayList = (messageObject.getGroupId() == 0 || (groupedMessages = (MessageObject.GroupedMessages) unVar.J6.f(messageObject.getGroupId())) == null) ? null : groupedMessages.messages;
        if (arrayList == null) {
            arrayList = org.telegram.messenger.t.l(messageObject);
        }
        if (unVar.getMessagesController().storiesEnabled() && !messageObject.isSponsored() && (((message2 = messageObject.messageOwner) == null || !message2.noforwards) && (i12 = messageObject.type) != 17 && i12 != 12)) {
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
                unVar.showDialog(new zm(this, unVar.getParentActivity(), unVar, arrayList, ChatObject.isChannel(unVar.e), z11, unVar.qa, z11, messageObject));
                Activity parentActivity = unVar.getParentActivity();
                i11 = ((org.telegram.ui.ActionBar.r2) unVar).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
                unVar.fragmentView.requestLayout();
            }
        }
        z10 = false;
        boolean z112 = z10;
        unVar.showDialog(new zm(this, unVar.getParentActivity(), unVar, arrayList, ChatObject.isChannel(unVar.e), z112, unVar.qa, z112, messageObject));
        Activity parentActivity2 = unVar.getParentActivity();
        i11 = ((org.telegram.ui.ActionBar.r2) unVar).classGuid;
        AndroidUtilities.setAdjustResizeToNothing(parentActivity2, i11);
        unVar.fragmentView.requestLayout();
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
        lk lkVar;
        kk kkVar;
        if (!k()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(ChatObject.getPublicUsername(chat));
        un unVar = this.a;
        int i14 = (isEmpty || unVar.e == null || ((lkVar = unVar.a1) != null && lkVar.getVisibility() == 0) || ((kkVar = unVar.R) != null && kkVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat2 = unVar.e;
        int i15 = (chat2 == null || !(unVar.p4 == 0 || unVar.t4) || (ChatObject.isChannel(chat2) && !unVar.e.megagroup)) ? 0 : 1;
        TLRPC.Chat chat3 = unVar.e;
        int i16 = (chat3 == null || chat3.id != chat.id || unVar.O9()) ? 1 : 0;
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
        TLRPC.ChatFull chatFull = unVar.getMessagesController().getChatFull(chat.id);
        if (chatFull != null) {
            a5Var = a5.a(chat, chatFull, g5VarArr);
            i13 = i15;
            i12 = i16;
            z10 = true;
            z11 = i14;
        } else {
            i11 = ((org.telegram.ui.ActionBar.r2) unVar).classGuid;
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
            c2.b.m().y((ViewGroup) unVar.fragmentView, unVar.qa, a5Var, new e7(this, chat, s1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(unVar, s1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new tm(this, chat, 0), false);
        boolean z12 = chat.broadcast;
        H.l(z12 ? R.drawable.msg_channel : R.drawable.msg_discussion, LocaleController.getString(z12 ? R.string.OpenChannel2 : R.string.OpenGroup2), new q1(this, s1Var, chat, 26), i12);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new tm(this, chat, 1), z11);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new tm(this, chat, 2), i13);
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
        this.a.kc();
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean q0(MessageObject messageObject) {
        return !this.a.s.containsKey(messageObject);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void q1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        un unVar = this.a;
        if (unVar.I9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) bg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) bg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
        if (unVar.getParentActivity() != null) {
            if (unVar.a1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                if (tL_inlineButtonTypeCopy == null) {
                    if (tL_inlineButtonTypeUrl != null) {
                        unVar.ja(null, tL_inlineButtonTypeUrl.url, true, s1Var, s1Var.getMessageObject());
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
                org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) unVar.getParentActivity(), (org.telegram.ui.ActionBar.u6) unVar.qa, false);
                k3Var.fixNavigationBar();
                k3Var.title = str;
                k3Var.bigTitle = false;
                k3Var.multipleLinesTitle = true;
                CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Copy)};
                ng.j jVar = new ng.j(3, unVar, str);
                k3Var.items = charSequenceArr;
                k3Var.onClickListener = jVar;
                unVar.showDialog(k3Var);
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void r(org.telegram.ui.Cells.s1 s1Var) {
        int i10;
        int i11;
        rj rjVar;
        MessageObject primaryMessageObject = s1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        primaryMessageObject.factCheckExpanded = !primaryMessageObject.factCheckExpanded;
        primaryMessageObject.forceUpdate = true;
        un unVar = this.a;
        oj ojVar = unVar.x0;
        if (ojVar != null && (rjVar = unVar.z0) != null && rjVar.y < 0) {
            for (int childCount = ojVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = unVar.x0.getChildAt(childCount);
                unVar.x0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.s1)) {
                        if (childAt instanceof org.telegram.ui.Cells.v0) {
                            i11 = unVar.V8(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.s1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = unVar.V8(childAt);
                            break;
                        }
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        unVar.Ec(primaryMessageObject, false);
        fi.v3 v3Var = unVar.M1;
        if (v3Var != null) {
            v3Var.e(true);
        }
        if (i10 < 0 || s1Var.getCurrentMessagesGroup() != null) {
            return;
        }
        unVar.z0.h1(i10, i11);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void r0(org.telegram.ui.Cells.s1 s1Var) {
        sh.c cVar = this.a.Zc;
        if (cVar == null || cVar.n != s1Var) {
            return;
        }
        cVar.w.getClass();
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean r1() {
        un unVar = this.a;
        return unVar.j1.getKeyboardHeight() + unVar.Aa >= AndroidUtilities.dp(20.0f);
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
        un unVar = this.a;
        unVar.ka(unVar.e.id, messageObject, messageObject.getId(), j11, i11, 0, null);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void s0() {
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        org.telegram.ui.Components.g6 animation;
        un unVar = this.a;
        if (unVar.x3 || SharedConfig.noSoundHintShowed || unVar.x0 == null || unVar.getParentActivity() == null || unVar.fragmentView == null) {
            return;
        }
        org.telegram.ui.Components.t40 t40Var = unVar.F2;
        if (t40Var == null || t40Var.getTag() == null) {
            if (unVar.F2 == null) {
                mm mmVar = unVar.j1;
                int indexOfChild = mmVar.indexOfChild(unVar.S);
                if (indexOfChild == -1) {
                    return;
                }
                org.telegram.ui.Components.t40 t40Var2 = new org.telegram.ui.Components.t40(0, unVar.getParentActivity(), unVar.qa, false);
                unVar.F2 = t40Var2;
                t40Var2.setShowingDuration(10000L);
                mmVar.addView(unVar.F2, indexOfChild + 1, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                unVar.F2.setAlpha(0.0f);
                unVar.F2.setVisibility(4);
            }
            int childCount = unVar.x0.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = unVar.x0.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) != null && messageObject.isVideo() && (animation = s1Var.getPhotoImage().getAnimation()) != null && animation.o() >= 3000 && unVar.F2.e(s1Var, null, 0, 0, true)) {
                    SharedConfig.setNoSoundHintShowed(true);
                    return;
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void s1(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        un unVar = this.a;
        unVar.p5 = messageObject;
        unVar.n9();
    }

    public final void t(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            org.telegram.ui.ActionBar.r2 r2Var = this.a;
            if (r2Var.getMessagesController().checkCanOpenChat(bundle, r2Var, s1Var.getMessageObject())) {
                r2Var.presentFragment(new un(bundle));
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void t0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z10) {
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.j5 j5Var2;
        un unVar = this.a;
        if (unVar.getParentActivity() == null || tLObject == null) {
            return;
        }
        j5Var = ((org.telegram.ui.ActionBar.r2) unVar).parentLayout;
        if (j5Var != null) {
            j5Var2 = ((org.telegram.ui.ActionBar.r2) unVar).parentLayout;
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
            unVar.presentFragment(new un(bundle));
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, unVar.getParentActivity(), unVar.getResourceProvider());
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, unVar.getResourceProvider());
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(unVar.getParentActivity(), false, false);
        g1Var.j(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
        g1Var.setMinimumWidth(160);
        g1Var.setOnClickListener(new a(this, 13));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(unVar.getParentActivity(), false, false);
        g1Var2.j(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
        g1Var2.setMinimumWidth(160);
        g1Var2.setOnClickListener(new z(this, (TLRPC.Chat) tLObject, s1Var, 7));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
        un unVar2 = new un(bundle);
        unVar2.V9 = true;
        unVar.presentFragmentAsPreviewWithMenu(unVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
        unVar.k7();
    }

    @Override // org.telegram.ui.Cells.j1
    public final String u(long j10) {
        TLRPC.Peer peer;
        String adminRank;
        un unVar = this.a;
        if (UserObject.isBotForum(unVar.f)) {
            return null;
        }
        TLRPC.Chat chat = unVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat) && (adminRank = unVar.getMessagesController().getAdminRank(unVar.e.id, j10)) != null) {
            return adminRank;
        }
        TLRPC.TL_forumTopic tL_forumTopic = unVar.o4;
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
        un unVar = this.a;
        if (i10 != 16) {
            unVar.P7(s1Var, true, false, f7, f10, messageObject.isMusic(), false, false);
            return;
        }
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        int i11 = 0;
        if (!(messageAction instanceof TLRPC.TL_messageActionConferenceCall)) {
            TLRPC.User user = unVar.f;
            if (user != null) {
                boolean isVideoCall = messageObject.isVideoCall();
                TLRPC.UserFull userFull = unVar.m8;
                if (userFull != null && userFull.video_calls_available) {
                    i11 = 1;
                }
                org.telegram.ui.Components.voip.g2.m(user, isVideoCall, i11, unVar.getParentActivity(), unVar.getMessagesController().getUserFull(unVar.f.id), unVar.getAccountInstance());
                return;
            }
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(Long.valueOf(unVar.a()));
        ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
        int size = arrayList.size();
        while (i11 < size) {
            TLRPC.Peer peer = arrayList.get(i11);
            i11++;
            hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(peer)));
        }
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = messageObject.getId();
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(unVar.getParentActivity(), 3, null);
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = unVar.getMessagesController().conferenceCallSizeLimit;
        e2Var.setOnCancelListener(new bi.f0(this, unVar.getConnectionsManager().sendRequest(getgroupcall, new bi.n9(this, e2Var, hashSet, tL_inputGroupCallInviteMessage, messageObject)), 2));
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
        un unVar = this.a;
        qf.c cVar = unVar.Wb;
        if (cVar != null) {
            cVar.a(true);
        }
        unVar.Wb = s1Var.getMessageObject() == null ? null : new bn(this, s1Var);
        if (z11 || qf.d.e(parse, false, null)) {
            qf.d.q(unVar.getParentActivity(), parse, true, true, false, unVar.Wb, null, false, true, false);
        } else {
            org.telegram.ui.Components.g5.q0(unVar, str, true, true, true, !z11, unVar.Wb, webPage, unVar.qa);
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
        un unVar = this.a;
        if (unVar.Sb == id2 && unVar.Tb == 7) {
            return;
        }
        TLRPC.InputPeer inputPeer = unVar.getMessagesController().getInputPeer(messageObject.getDialogId());
        if (inputPeer == null) {
            return;
        }
        TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
        getrichmessage.peer = inputPeer;
        getrichmessage.id = id2;
        qf.c cVar = unVar.Wb;
        if (cVar != null) {
            cVar.a(true);
            unVar.Wb = null;
        }
        int[] iArr = new int[1];
        si siVar = new si(unVar, id2, s1Var, 2);
        siVar.b = new ed(8, unVar, iArr);
        unVar.Wb = siVar;
        siVar.d();
        iArr[0] = unVar.getConnectionsManager().sendRequestTyped(getrichmessage, new org.telegram.messenger.a(), new bi.t3(unVar, siVar, iArr, s1Var, messageObject, 3));
    }

    @Override // org.telegram.ui.Cells.j1
    public final CharacterStyle w1(org.telegram.ui.Cells.s1 s1Var) {
        un unVar;
        int i10;
        if (s1Var.getMessageObject() == null || (i10 = (unVar = this.a).Sb) == 0 || i10 != s1Var.getMessageObject().getId() || unVar.Tb != 1) {
            return null;
        }
        return unVar.Ub;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void x(org.telegram.ui.Cells.s1 s1Var) {
        un unVar = this.a;
        if (!unVar.getMessagesController().showSensitiveContent()) {
            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(unVar.getParentActivity(), 3, null);
            e2Var.r(200L);
            unVar.getMessagesController().getContentSettings(new y(this, e2Var, s1Var, 6));
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
            un unVar = this.a;
            org.telegram.ui.Components.dv.I(unVar, messageObject, unVar.Sa, str2, str3, str4, str, i10, i11, -1, unVar.F9());
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
        un unVar = this.a;
        TLRPC.User user2 = unVar.f;
        if (user2 != null && user2.id == user.id) {
            i11 = 1;
        }
        profileActivity.X4(i11);
        Activity parentActivity = unVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.r2) unVar).classGuid;
        AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
        unVar.presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void y0(org.telegram.ui.Cells.s1 s1Var, boolean z10, boolean z11) {
        g(s1Var, z10, true, z11);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean y1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        ViewGroup viewGroup;
        int i10;
        a41 a41Var;
        if (messageObject.isVoiceOnce() || messageObject.isRoundOnce()) {
            c41 c41Var = this.a.la;
            if (c41Var == null || c41Var.b0) {
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
                this.a.la = new c41(this.a.getParentActivity());
                c41 c41Var2 = this.a.la;
                te qb2 = !messageObject.isOutOwner() ? this.a.qb(messageObject, true) : null;
                a3.i0 R4 = !messageObject.isOutOwner() ? un.R4(this.a, messageObject) : null;
                Context context = c41Var2.a;
                bh.p pVar = c41Var2.c;
                c41Var2.X = qb2;
                c41Var2.Y = R4;
                a41 a41Var2 = c41Var2.N;
                if (a41Var2 != null) {
                    pVar.removeView(a41Var2);
                    c41Var2.N = null;
                }
                c41Var2.O = s1Var;
                MessageObject messageObject2 = s1Var.getMessageObject();
                c41Var2.M = messageObject2;
                c41Var2.S = messageObject2 != null && messageObject2.isRoundVideo();
                org.telegram.ui.Cells.s1 s1Var2 = c41Var2.O;
                c41Var2.L = s1Var2 != null ? s1Var2.getResourcesProvider() : null;
                if (c41Var2.O != null) {
                    c41Var2.T = 0.0f;
                    c41Var2.U = s1Var.n;
                    if (s1Var.getParent() instanceof View) {
                        View view = (View) s1Var.getParent();
                        c41Var2.T = view.getY() + c41Var2.T;
                        c41Var2.U = view.getY() + c41Var2.U;
                    }
                    int width = c41Var2.O.getWidth();
                    int height = c41Var2.O.getHeight();
                    if (c41Var2.S) {
                        height = Math.min(AndroidUtilities.dp(360.0f), Math.min(width, AndroidUtilities.displaySize.y));
                    }
                    int i11 = height;
                    c41Var2.K = i11 - c41Var2.O.getHeight();
                    i10 = (int) Math.ceil((Math.min(width, i11) * 0.92f) / AndroidUtilities.density);
                    viewGroup = pVar;
                    a41 a41Var3 = new a41(c41Var2, c41Var2.getContext(), UserConfig.selectedAccount, c41Var2.O.getResourcesProvider(), width, i11);
                    c41Var2.N = a41Var3;
                    c41Var2.O.j1(a41Var3);
                    c41Var2.N.i1(c41Var2.O);
                    c41Var2.N.setDelegate(new pa.d());
                    a41 a41Var4 = c41Var2.N;
                    MessageObject messageObject3 = c41Var2.M;
                    MessageObject.GroupedMessages currentMessagesGroup = c41Var2.O.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.s1 s1Var3 = c41Var2.O;
                    a41Var4.Z3(messageObject3, currentMessagesGroup, s1Var3.F, s1Var3.E, false, false);
                    if (!c41Var2.S) {
                        org.telegram.ui.Components.n8 n8Var = new org.telegram.ui.Components.n8();
                        c41Var2.V = n8Var;
                        a41 a41Var5 = c41Var2.N;
                        n8Var.i = a41Var5;
                        a41Var5.fe = n8Var;
                        if (a41Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.pp0 seekBarWaveform = c41Var2.N.getSeekBarWaveform();
                            seekBarWaveform.L = c41Var2.s;
                            org.telegram.ui.Cells.s1 s1Var4 = seekBarWaveform.n;
                            if (s1Var4 != null) {
                                s1Var4.invalidate();
                            }
                        }
                    }
                    c41Var2.H = false;
                    viewGroup.addView(c41Var2.N, new FrameLayout.LayoutParams(c41Var2.O.getWidth(), i11, 17));
                } else {
                    viewGroup = pVar;
                    i10 = 360;
                }
                TextureView textureView = c41Var2.P;
                if (textureView != null) {
                    viewGroup.removeView(textureView);
                    c41Var2.P = null;
                }
                if (c41Var2.S) {
                    c41Var2.Q = false;
                    TextureView textureView2 = new TextureView(context);
                    c41Var2.P = textureView2;
                    viewGroup.addView(textureView2, 0, org.telegram.ui.Components.gb1.g(i10, i10));
                }
                MediaController.getInstance().pauseByRewind();
                org.telegram.ui.Components.s81 s81Var = c41Var2.w;
                if (s81Var != null) {
                    s81Var.B();
                    c41Var2.w.H();
                    c41Var2.w = null;
                }
                org.telegram.ui.Cells.s1 s1Var5 = c41Var2.O;
                if (s1Var5 != null && s1Var5.getMessageObject() != null) {
                    File pathToAttach = FileLoader.getInstance(c41Var2.O.getMessageObject().currentAccount).getPathToAttach(c41Var2.O.getMessageObject().getDocument());
                    if (pathToAttach != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && (pathToAttach = FileLoader.getInstance(c41Var2.O.getMessageObject().currentAccount).getPathToMessage(c41Var2.O.getMessageObject().messageOwner)) != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && c41Var2.O.getMessageObject().messageOwner.attachPath != null) {
                        pathToAttach = new File(c41Var2.O.getMessageObject().messageOwner.attachPath);
                    }
                    if (pathToAttach != null && pathToAttach.exists()) {
                        org.telegram.ui.Components.s81 s81Var2 = new org.telegram.ui.Components.s81();
                        c41Var2.w = s81Var2;
                        s81Var2.J = new b41(c41Var2);
                        if (c41Var2.V != null) {
                            s81Var2.K = new b41(c41Var2);
                        }
                        if (c41Var2.S) {
                            s81Var2.V(c41Var2.P);
                        }
                        c41Var2.w.D(Uri.fromFile(pathToAttach), "other");
                        c41Var2.w.C();
                        org.telegram.ui.Components.tt ttVar = c41Var2.E;
                        if (ttVar != null) {
                            ttVar.s = c41Var2.w;
                            ttVar.a();
                        }
                    }
                    un unVar = this.a;
                    unVar.showDialog(unVar.la);
                    return false;
                }
                fi.v3 v3Var = c41Var2.x;
                if (v3Var != null) {
                    viewGroup.removeView(v3Var);
                    c41Var2.x = null;
                }
                MessageObject messageObject4 = c41Var2.M;
                boolean z10 = messageObject4 != null && messageObject4.isOutOwner();
                MessageObject messageObject5 = c41Var2.M;
                if (messageObject5 != null && messageObject5.getDialogId() != UserConfig.getInstance(c41Var2.M.currentAccount).getClientUserId()) {
                    fi.v3 v3Var2 = new fi.v3(context, 3);
                    c41Var2.x = v3Var2;
                    v3Var2.p(true);
                    if (z10) {
                        long dialogId = c41Var2.M.getDialogId();
                        String str = "";
                        if (dialogId > 0) {
                            TLRPC.User user = MessagesController.getInstance(c41Var2.M.currentAccount).getUser(Long.valueOf(dialogId));
                            if (user != null) {
                                str = UserObject.getFirstName(user);
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(c41Var2.M.currentAccount).getChat(Long.valueOf(-dialogId));
                            if (chat != null) {
                                str = chat.title;
                            }
                        }
                        c41Var2.x.s(AndroidUtilities.replaceTags(LocaleController.formatString(c41Var2.S ? R.string.VideoOnceOutHint : R.string.VoiceOnceOutHint, str)));
                    } else {
                        c41Var2.x.s(AndroidUtilities.replaceTags(LocaleController.getString(c41Var2.S ? R.string.VideoOnceHint : R.string.VoiceOnceHint)));
                    }
                    c41Var2.x.q(12.0f);
                    c41Var2.x.setPadding(AndroidUtilities.dp((z10 || c41Var2.O.F) ? 0.0f : 6.0f), 0, 0, 0);
                    if (c41Var2.S) {
                        c41Var2.x.m(0.5f, 0.0f);
                        c41Var2.x.K = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        c41Var2.x.m(0.0f, AndroidUtilities.dp(34.0f));
                        c41Var2.x.K = Layout.Alignment.ALIGN_NORMAL;
                    }
                    c41Var2.x.t(14.0f);
                    fi.v3 v3Var3 = c41Var2.x;
                    v3Var3.h = fi.v3.a(v3Var3.getText(), c41Var2.x.getTextPaint());
                    if (c41Var2.S) {
                        viewGroup.addView(c41Var2.x, org.telegram.ui.Components.gb1.h((int) ((c41Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((c41Var2.O.getHeight() + c41Var2.K) / AndroidUtilities.density) / 2.0f), 0.0f, 0.0f));
                    } else {
                        viewGroup.addView(c41Var2.x, org.telegram.ui.Components.gb1.h((int) ((c41Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, ((((c41Var2.O.getWidth() * (-0.39999998f)) / 2.0f) + c41Var2.O.getBoundsLeft()) / AndroidUtilities.density) + 1.0f, ((-75.0f) - ((c41Var2.O.getHeight() / AndroidUtilities.density) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    c41Var2.x.u();
                }
                TextView textView = c41Var2.y;
                if (textView != null) {
                    viewGroup.removeView(textView);
                    c41Var2.y = null;
                }
                TextView textView2 = new TextView(context);
                c41Var2.y = textView2;
                textView2.setTextColor(-1);
                c41Var2.y.setTypeface(AndroidUtilities.bold());
                if (org.telegram.ui.ActionBar.y6.I.q()) {
                    c41Var2.y.setBackground(org.telegram.ui.ActionBar.y6.j0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    c41Var2.y.setBackground(org.telegram.ui.ActionBar.y6.j0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                c41Var2.y.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
                org.telegram.ui.Components.gb1.b(c41Var2.y);
                c41Var2.y.setText(LocaleController.getString(z10 ? R.string.VoiceOnceClose : R.string.VoiceOnceDeleteClose));
                c41Var2.y.setOnClickListener(new y31(c41Var2, 1));
                viewGroup.addView(c41Var2.y, org.telegram.ui.Components.gb1.h(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z10 && (a41Var = c41Var2.N) != null && a41Var.getMessageObject() != null && c41Var2.N.getMessageObject().messageOwner != null) {
                    c41Var2.N.getMessageObject().messageOwner.media_unread = false;
                    c41Var2.N.invalidate();
                }
                un unVar2 = this.a;
                unVar2.showDialog(unVar2.la);
                return false;
            }
        } else {
            if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                boolean playMessage = MediaController.getInstance().playMessage(messageObject, false);
                MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? this.a.Y7(messageObject, false) : null, false);
                return playMessage;
            }
            if (messageObject.isMusic()) {
                MediaController mediaController = MediaController.getInstance();
                ArrayList L = this.a.A0.L();
                un unVar3 = this.a;
                return mediaController.setPlaylist(L, messageObject, unVar3.X6, true ^ unVar3.A0.N, null);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void z1() {
        org.telegram.ui.ActionBar.u6 u6Var;
        un unVar = this.a;
        if (unVar.j1 == null || unVar.getParentActivity() == null) {
            return;
        }
        Context context = unVar.j1.getContext();
        u6Var = ((org.telegram.ui.ActionBar.r2) unVar).resourceProvider;
        a31.T(context, unVar, false, u6Var, null);
    }
}
