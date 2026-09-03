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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ln implements org.telegram.ui.Cells.j1 {
    public final /* synthetic */ zn a;

    public ln(zn znVar) {
        this.a = znVar;
    }

    public static void a(ln lnVar, org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
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
        i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
        arrayList.add(new MessageObject(i10, tL_message, false, true));
        MediaController.saveFilesFromMessages(znVar.getParentActivity(), znVar.getAccountInstance(), arrayList, new va(lnVar, 1));
    }

    @Override // org.telegram.ui.Cells.j1
    public final void A(org.telegram.ui.Cells.s1 s1Var) {
        zn znVar = this.a;
        if (!znVar.getMessagesController().showSensitiveContent()) {
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(znVar.getParentActivity(), 3, null);
            d2Var.q(200L);
            znVar.getMessagesController().getContentSettings(new b0(this, d2Var, s1Var, 5));
        } else {
            if (s1Var.getMessageObject() != null) {
                s1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
            }
            s1Var.h4();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:273:0x0b15, code lost:
    
        if (r1.exists() != false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0bd9, code lost:
    
        if (r1.startsWith("text/x-web-markdown") == false) goto L320;
     */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0c25 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.telegram.ui.Cells.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11, boolean z4) {
        int i10;
        MessageObject messageObject;
        boolean z10;
        MessageObject messageObject2;
        zn znVar;
        boolean z11;
        long j10;
        long j11;
        File file;
        TLRPC.Chat chat;
        qu0 E;
        char c3;
        qu0 qu0Var;
        int i11;
        float f12;
        float f13;
        MessageObject messageObject3;
        ImageLocation imageLocation;
        BitmapDrawable bitmapDrawable;
        MessageObject messageObject4;
        MessageObject messageObject5;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        int i12;
        MessageObject messageObject6 = s1Var.getMessageObject();
        int i13 = messageObject6.type;
        zn znVar2 = this.a;
        if (i13 == 23) {
            TLRPC.MessageMedia messageMedia2 = messageObject6.messageOwner.media;
            TL_stories.StoryItem storyItem = messageMedia2.storyItem;
            if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                return;
            }
            storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia2.peer);
            storyItem.messageId = messageObject6.getId();
            storyItem.messageType = 2;
            nh.m7.b(storyItem, znVar2.f);
            znVar2.getOrCreateStoryViewer().G(znVar2.getParentActivity(), messageObject6.messageOwner.media.storyItem, nh.c7.a(znVar2.u0));
            return;
        }
        int i14 = 1;
        if (messageObject6.isVideo()) {
            i12 = ((org.telegram.ui.ActionBar.p2) znVar2).currentAccount;
            if (DownloadController.getInstance(i12).canDownloadMedia(messageObject6.messageOwner) == 1) {
                messageObject6.putInDownloadsStore = true;
            }
        } else {
            messageObject6.putInDownloadsStore = true;
        }
        if (messageObject6.isSendError()) {
            znVar2.I7(s1Var, false, false, f10, f11, true, false, false);
            return;
        }
        if (messageObject6.isSending()) {
            return;
        }
        int i15 = 0;
        if (z4 && (message = messageObject6.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && !TextUtils.isEmpty(webPage.url)) {
            String str = messageObject6.messageOwner.media.webpage.url;
            AndroidUtilities.getHostAuthority(str);
            if (znVar2.ea(str, s1Var, null, messageObject6.getId(), 2)) {
                return;
            }
            ze.c cVar = znVar2.xb;
            if (cVar != null) {
                cVar.a(true);
            }
            znVar2.xb = s1Var.getMessageObject() != null ? new en(this, s1Var, i15) : null;
            ze.d.r(znVar2.getParentActivity(), Uri.parse(str), true, false, false, znVar2.xb, null, false, true, false);
            return;
        }
        int i16 = 4;
        if (messageObject6.isDice()) {
            xm xmVar = new xm(this, messageObject6, i15);
            if (messageObject6.isStakeableDice()) {
                znVar2.getMessagesController().loadStakeDiceInfo(new b0(this, messageObject6, xmVar, i16));
                return;
            } else {
                xmVar.run();
                return;
            }
        }
        if ((messageObject6.isAnimatedEmoji() && (!messageObject6.isAnimatedAnimatedEmoji() || (znVar2.ua.e.containsKey(dz.q(MessageObject.findAnimatedEmojiEmoticon(messageObject6.getDocument()))) && znVar2.f != null))) || messageObject6.isPremiumSticker()) {
            znVar2.Na(s1Var);
            znVar2.ua.l(s1Var, znVar2, true);
            znVar2.u0.I0(false);
            return;
        }
        if (messageObject6.needDrawBluredPreview()) {
            te fb2 = znVar2.fb(messageObject6, false);
            i5.v O4 = zn.O4(znVar2, messageObject6);
            s1Var.invalidate();
            final SecretMediaViewer f14 = SecretMediaViewer.f();
            final Activity parentActivity = znVar2.getParentActivity();
            int i17 = UserConfig.selectedAccount;
            f14.a = i17;
            ImageReceiver imageReceiver = f14.h;
            imageReceiver.setCurrentAccount(i17);
            int i18 = 7;
            if (f14.b != parentActivity) {
                f14.b = parentActivity;
                f14.d1 = new org.telegram.ui.Components.um0(parentActivity, null);
                n0 n0Var = new n0(f14, parentActivity, 21);
                f14.d = n0Var;
                n0Var.setBackgroundDrawable(f14.i0);
                f14.d.setFocusable(true);
                f14.d.setFocusableInTouchMode(true);
                f14.d.setClipChildren(false);
                f14.d.setClipToPadding(false);
                f14.e = new ah.e(f14, parentActivity);
                View view = new View(parentActivity);
                f14.f = view;
                view.setBackgroundColor(2130706432);
                f14.e.addView(f14.f, k7.b6.e(-1, -2, 80));
                f14.e.setFocusable(false);
                f14.d.addView(f14.e);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f14.e.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                layoutParams.gravity = 51;
                f14.e.setLayoutParams(layoutParams);
                f14.e.setFitsSystemWindows(true);
                f14.e.setOnApplyWindowInsetsListener(new j41(f14, 0));
                f14.e.setSystemUiVisibility(1792);
                GestureDetector gestureDetector = new GestureDetector(f14.e.getContext(), f14);
                f14.I0 = gestureDetector;
                gestureDetector.setOnDoubleTapListener(f14);
                eg.l1 l1Var = new eg.l1(f14, parentActivity, i18);
                f14.C = l1Var;
                l1Var.setTitleColor(-1);
                f14.C.setSubtitleColor(-1);
                f14.C.setBackgroundColor(2130706432);
                f14.C.setOccupyStatusBar(true);
                f14.C.B(1090519039, false);
                f14.C.C(-1, false);
                f14.C.setBackButtonImage(R.drawable.ic_ab_back);
                f14.C.setTitleRightMargin(AndroidUtilities.dp(70.0f));
                f14.e.addView(f14.C, k7.b6.c(-2.0f, -1));
                f14.C.setActionBarMenuOnItemClick(new ll0(f14, 15));
                ph.f3 f3Var = new ph.f3(parentActivity, 1);
                f14.r = f3Var;
                f3Var.l(1.0f, -26.0f);
                f14.r.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                f14.e.addView(f14.r, k7.b6.d(-1, 80.0f, 53, 0.0f, 48.0f, 0.0f, 0.0f));
                p41 p41Var = new p41(f14, parentActivity);
                f14.n = p41Var;
                f14.e.addView(p41Var, k7.b6.d(119, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
                vv0 vv0Var = new vv0(f14, i14);
                f14.R = new q41(f14, parentActivity);
                View view2 = new View(parentActivity);
                f14.Q = view2;
                view2.setBackgroundColor(2130706432);
                f14.R.addView(f14.Q, k7.b6.e(-1, -1, 119));
                org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(f14.e.getContext());
                f14.P = k5Var;
                k5Var.setTextColor(-1);
                f14.P.setGravity(53);
                f14.P.setTextSize(14);
                f14.P.setImportantForAccessibility(2);
                f14.R.addView(f14.P, k7.b6.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
                nw0 nw0Var = new nw0(f14, parentActivity, 3);
                f14.O = nw0Var;
                org.telegram.ui.Components.k71 k71Var = new org.telegram.ui.Components.k71(nw0Var);
                f14.N = k71Var;
                k71Var.z = AndroidUtilities.dp(2.0f);
                org.telegram.ui.Components.k71 k71Var2 = f14.N;
                k71Var2.k = 872415231;
                k71Var2.l = 872415231;
                k71Var2.m = -1;
                k71Var2.n = -1;
                k71Var2.A = 1509949439;
                k71Var2.j = vv0Var;
                f14.R.addView(f14.O);
                f14.e.addView(f14.R, k7.b6.e(-1, 48, 80));
                hs0 hs0Var = new hs0(null, new nh.b());
                f14.V = hs0Var;
                hs0Var.k0 = true;
                hs0Var.i0 = false;
                du0 du0Var = new du0(f14.e.getContext());
                f14.W = du0Var;
                du0Var.setFactory(new ViewSwitcher.ViewFactory() { // from class: org.telegram.ui.k41
                    @Override // android.widget.ViewSwitcher.ViewFactory
                    public final View makeView() {
                        SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
                        return new cu0(parentActivity, secretMediaViewer.X, secretMediaViewer.V, new f5(secretMediaViewer, 22), new hg0(secretMediaViewer, 2));
                    }
                });
                f14.W.setVisibility(4);
                if (!f14.t1) {
                    f14.t1 = true;
                    f14.W.setLayerType(2, null);
                    f14.W.getCurrentView().setLayerType(2, null);
                    f14.W.getNextView().setLayerType(2, null);
                }
                ImageView imageView = new ImageView(parentActivity);
                f14.S = imageView;
                imageView.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(64.0f), 1711276032));
                org.telegram.ui.Components.ng0 ng0Var = new org.telegram.ui.Components.ng0(28);
                f14.T = ng0Var;
                ng0Var.setCallback(f14.S);
                f14.S.setImageDrawable(f14.T);
                f14.S.setScaleType(ImageView.ScaleType.CENTER);
                f14.S.setScaleX(0.6f);
                f14.S.setScaleY(0.6f);
                f14.S.setAlpha(0.0f);
                f14.S.setPivotX(AndroidUtilities.dp(32.0f));
                f14.S.setPivotY(AndroidUtilities.dp(32.0f));
                f14.e.addView(f14.S, k7.b6.e(64, 64, 17));
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
                f14.c = layoutParams2;
                layoutParams2.height = -1;
                layoutParams2.format = -3;
                layoutParams2.width = -1;
                layoutParams2.gravity = 48;
                layoutParams2.type = 99;
                layoutParams2.flags = -2147409656;
                AndroidUtilities.logFlagSecure();
                imageReceiver.setParentView(f14.e);
                imageReceiver.setForceCrossfade(true);
                org.telegram.ui.Cells.x9 o10 = f14.V.o(f14.d.getContext());
                if (o10 != null) {
                    AndroidUtilities.removeFromParent(o10);
                    f14.e.addView(o10);
                }
                f14.V.T(f14.e);
                f14.V.j0 = true;
            }
            SecretMediaViewer f15 = SecretMediaViewer.f();
            pl plVar = znVar2.Ca;
            SecretMediaViewer.PhotoBackgroundDrawable photoBackgroundDrawable = f15.i0;
            ImageReceiver imageReceiver2 = f15.h;
            if (f15.b != null && messageObject6.needDrawBluredPreview()) {
                if (plVar == null || (E = plVar.E(messageObject6, null, 0, true, false)) == null) {
                    return;
                }
                f15.n1 = messageObject6.messageOwner.ttl == Integer.MAX_VALUE;
                f15.m1 = O4;
                f15.K = plVar;
                f15.H = System.currentTimeMillis();
                f15.I = 0L;
                f15.h0 = true;
                f15.g0 = true;
                f15.m0 = false;
                q4 q4Var = f15.w;
                if (q4Var != null) {
                    q4Var.setVisibility(4);
                }
                f15.i();
                f15.K0 = 0.0f;
                f15.L0 = 1.0f;
                f15.M0 = 0.0f;
                f15.N0 = 0.0f;
                f15.O0 = 0.0f;
                f15.P0 = 0.0f;
                f15.Q0 = 0.0f;
                f15.R0 = 0.0f;
                f15.W0 = false;
                f15.X0 = false;
                f15.Y0 = false;
                f15.Z0 = false;
                f15.a1 = true;
                f15.n(f15.v0);
                photoBackgroundDrawable.setAlpha(0);
                f15.e.setAlpha(1.0f);
                f15.e.setVisibility(0);
                f15.n.setAlpha(1.0f);
                f15.G = false;
                f15.E = false;
                f15.F = false;
                f15.J = true;
                imageReceiver2.setManualAlphaAnimator(false);
                f15.L = 0;
                f15.M = 0;
                RectF rectF = new RectF(E.a.getDrawRegion());
                rectF.left = Math.max(rectF.left, E.a.getImageX());
                rectF.top = Math.max(rectF.top, E.a.getImageY());
                rectF.right = Math.min(rectF.right, E.a.getImageX2());
                rectF.bottom = Math.min(rectF.bottom, E.a.getImageY2());
                float width = rectF.width();
                float height = rectF.height();
                Point point = AndroidUtilities.displaySize;
                f15.v0 = Math.max(width / point.x, height / (point.y + AndroidUtilities.statusBarHeight));
                int[] iArr = E.h;
                if (iArr != null) {
                    f15.E0 = new int[iArr.length];
                    int i19 = 0;
                    while (true) {
                        int[] iArr2 = E.h;
                        c3 = 1;
                        if (i19 >= iArr2.length) {
                            break;
                        }
                        f15.E0[i19] = iArr2[i19];
                        i19++;
                    }
                } else {
                    c3 = 1;
                    f15.E0 = null;
                }
                float f16 = E.b;
                float f17 = rectF.left;
                f15.t0 = ((width / 2.0f) + (f16 + f17)) - (r7 / 2);
                f15.u0 = ((height / 2.0f) + (E.c + rectF.top)) - (r6 / 2);
                f15.s0 = Math.abs(f17 - E.a.getImageX());
                int abs = (int) Math.abs(rectF.top - E.a.getImageY());
                E.d.getLocationInWindow(new int[2]);
                float f18 = (r7[c3] - (E.c + rectF.top)) + E.j;
                f15.o0 = f18;
                float f19 = abs;
                f15.o0 = Math.max(0.0f, Math.max(f18, f19));
                float height2 = (((E.c + rectF.top) + ((int) height)) - (E.d.getHeight() + r7[c3])) + E.i;
                f15.p0 = height2;
                f15.p0 = Math.max(0.0f, Math.max(height2, f19));
                f15.q0 = 0.0f;
                f15.q0 = Math.max(0.0f, Math.max(0.0f, f19));
                f15.r0 = 0.0f;
                f15.r0 = Math.max(0.0f, Math.max(0.0f, f19));
                f15.G0 = System.currentTimeMillis();
                f15.w0 = 0.0f;
                f15.x0 = 0.0f;
                f15.A0 = 0.0f;
                f15.C0 = 0.0f;
                f15.D0 = 0.0f;
                f15.z0 = 0.0f;
                f15.B0 = 0.0f;
                f15.y0 = 1.0f;
                f15.F0 = true;
                f15.b1 = true;
                kf.t0 t0Var = f15.i1;
                if (t0Var != null) {
                    t0Var.destroy();
                    f15.i1 = null;
                }
                LaunchActivity launchActivity = LaunchActivity.D1;
                f15.i1 = launchActivity != null ? new kf.t0(launchActivity, true) : null;
                NotificationCenter.getInstance(f15.a).addObserver(f15, NotificationCenter.messagesDeleted);
                NotificationCenter.getInstance(f15.a).addObserver(f15, NotificationCenter.updateMessageMedia);
                NotificationCenter.getInstance(f15.a).addObserver(f15, NotificationCenter.didCreatedNewDeleteTask);
                f15.v = MessageObject.getPeerId(messageObject6.messageOwner.peer_id);
                f15.e0 = messageObject6;
                TLRPC.Document document = messageObject6.getDocument();
                ImageReceiver.BitmapHolder bitmapHolder = f15.f0;
                if (bitmapHolder != null) {
                    bitmapHolder.release();
                    f15.f0 = null;
                }
                f15.f0 = E.a.getThumbBitmapSafe();
                f15.R.setVisibility(8);
                if (document != null) {
                    int i20 = 0;
                    while (true) {
                        if (i20 >= document.attributes.size()) {
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i20);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) documentAttribute;
                            f15.L = tL_documentAttributeVideo.w;
                            f15.M = tL_documentAttributeVideo.h;
                            break;
                        }
                        i20++;
                    }
                    if (MessageObject.isGifDocument(document)) {
                        f15.C.setTitle(LocaleController.getString(R.string.DisappearingGif));
                        String str2 = messageObject6.messageOwner.attachPath;
                        ImageLocation forDocument = (str2 == null || !messageObject6.attachPathExists) ? ImageLocation.getForDocument(document) : ImageLocation.getForPath(str2);
                        f13 = 1.0f;
                        f12 = 0.0f;
                        qu0Var = E;
                        messageObject5 = messageObject6;
                        ImageLocation imageLocation2 = forDocument;
                        i11 = -1;
                        imageReceiver2.setImage(imageLocation2, (String) null, f15.f0 != null ? new BitmapDrawable(f15.f0.bitmap) : null, -1L, (String) null, messageObject5, 1);
                    } else {
                        qu0Var = E;
                        i11 = -1;
                        f12 = 0.0f;
                        f13 = 1.0f;
                        f15.Y = 1;
                        f15.C.setTitle(LocaleController.getString(R.string.DisappearingVideo));
                        File file2 = new File(messageObject6.messageOwner.attachPath);
                        if (file2.exists()) {
                            f15.h(file2);
                        } else {
                            File pathToMessage = FileLoader.getInstance(f15.a).getPathToMessage(messageObject6.messageOwner);
                            File file3 = new File(pathToMessage.getAbsolutePath() + ".enc");
                            if (file3.exists()) {
                                pathToMessage = file3;
                            }
                            f15.h(pathToMessage);
                        }
                        f15.G = true;
                        f15.R.setVisibility(0);
                        messageObject5 = messageObject6;
                        imageReceiver2.setImage((ImageLocation) null, (String) null, f15.f0 != null ? new BitmapDrawable(f15.f0.bitmap) : null, -1L, (String) null, messageObject5, 2);
                    }
                    messageObject4 = messageObject5;
                } else {
                    qu0Var = E;
                    i11 = -1;
                    f12 = 0.0f;
                    f13 = 1.0f;
                    f15.C.setTitle(LocaleController.getString(R.string.DisappearingPhoto));
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject6.photoThumbs, AndroidUtilities.getPhotoSize());
                    ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject6.photoThumbsObject);
                    if (f15.f0 != null) {
                        messageObject3 = messageObject6;
                        imageLocation = forObject;
                        bitmapDrawable = new BitmapDrawable(f15.f0.bitmap);
                    } else {
                        messageObject3 = messageObject6;
                        imageLocation = forObject;
                        bitmapDrawable = null;
                    }
                    imageReceiver2.setImage(imageLocation, (String) null, bitmapDrawable, -1L, (String) null, messageObject3, 2);
                    messageObject4 = messageObject3;
                    if (closestPhotoSizeWithSize != null) {
                        f15.L = closestPhotoSizeWithSize.w;
                        f15.M = closestPhotoSizeWithSize.h;
                    }
                }
                f15.j(messageObject4, "", false);
                f15.j(messageObject4, messageObject4.caption, true);
                f15.m(true, false);
                f15.k(false, false);
                f15.T.a(true, true);
                if (f15.n1) {
                    p41 p41Var2 = f15.n;
                    p41Var2.e = true;
                    TextPaint textPaint = p41Var2.r;
                    textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                    textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
                    textPaint.setColor(i11);
                    StaticLayout staticLayout = new StaticLayout("1", textPaint, 999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    p41Var2.s = staticLayout;
                    p41Var2.v = staticLayout.getLineCount() > 0 ? p41Var2.s.getLineWidth(0) : 0.0f;
                    p41Var2.w = p41Var2.s.getHeight();
                    p41Var2.invalidate();
                    f15.n.setOnClickListener(new v31(f15, 3));
                } else {
                    f15.n.setOnClickListener(null);
                }
                try {
                    if (f15.d.getParent() != null) {
                        ((WindowManager) f15.b.getSystemService("window")).removeView(f15.d);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                ((WindowManager) f15.b.getSystemService("window")).addView(f15.d, f15.c);
                f15.n.invalidate();
                f15.s = true;
                Window window = f15.b.getWindow();
                f15.l1 = AndroidUtilities.getLightNavigationBar(window);
                AndroidUtilities.setLightNavigationBar(f15.b, false);
                AndroidUtilities.setLightNavigationBar((View) f15.d, false);
                Activity activity = f15.b;
                if (activity instanceof LaunchActivity) {
                    f15.k1 = Build.VERSION.SDK_INT >= 26 ? ((LaunchActivity) activity).getWindow().getNavigationBarColor() : 0;
                    ((LaunchActivity) f15.b).y(-16777216);
                } else {
                    f15.k1 = window.getNavigationBarColor();
                    AndroidUtilities.setNavigationBarColor(f15.b, -16777216);
                }
                AnimatorSet animatorSet = new AnimatorSet();
                f15.H0 = animatorSet;
                eg.l1 l1Var2 = f15.C;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(l1Var2, (Property<eg.l1, Float>) property, 0.0f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(f15.X, (Property<nt0, Float>) property, 0.0f, 1.0f);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(f15.r, (Property<ph.f3, Float>) property, 0.0f, 1.0f);
                ObjectAnimator ofInt = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.n6.d, 0, 255);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(f15, f15.s1, 0.0f, 1.0f);
                q41 q41Var = f15.R;
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(q41Var, q41Var.n, f13);
                q41 q41Var2 = f15.R;
                if (f15.G) {
                    f12 = 1.0f;
                }
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofInt, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(q41Var2, (Property<q41, Float>) property, f12));
                f15.j0 = 3;
                f15.l0 = new jf0(f15, fb2, messageObject4, 26);
                f15.H0.setDuration(250L);
                f15.H0.addListener(new n41(f15, 0));
                f15.k0 = System.currentTimeMillis();
                if (SharedConfig.getDevicePerformanceClass() == 0) {
                    f15.e.setLayerType(2, null);
                }
                f15.H0.setInterpolator(new DecelerateInterpolator());
                photoBackgroundDrawable.b = 0;
                photoBackgroundDrawable.a = new b11(8, f15, qu0Var);
                f15.H0.start();
            }
        } else {
            if (MessageObject.isAnimatedEmoji(messageObject6.getDocument()) && MessageObject.getInputStickerSet(messageObject6.getDocument()) != null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(MessageObject.getInputStickerSet(messageObject6.getDocument()));
                org.telegram.ui.Components.lv lvVar = new org.telegram.ui.Components.lv(znVar2, znVar2.getParentActivity(), znVar2.ba, arrayList);
                lvVar.setCalcMandatoryInsets(znVar2.x9());
                znVar2.showDialog(lvVar);
                return;
            }
            if (messageObject6.getInputStickerSet() != null) {
                org.telegram.ui.Components.xx0 xx0Var = new org.telegram.ui.Components.xx0(znVar2.getParentActivity(), znVar2, messageObject6.getInputStickerSet(), null, (znVar2.L0.getVisibility() == 0 || !((chat = znVar2.e) == null || ChatObject.canSendStickers(chat))) ? null : znVar2.V, znVar2.ba);
                xx0Var.setCalcMandatoryInsets(znVar2.x9());
                znVar2.showDialog(xx0Var);
                return;
            }
            if (messageObject6.isVideo() || (i10 = messageObject6.type) == 1 || ((i10 == 0 && !messageObject6.isWebpageDocument()) || messageObject6.isGif())) {
                en enVar = null;
                if (messageObject6.isSponsored()) {
                    if (messageObject6.isGif() || messageObject6.isPhoto()) {
                        int i21 = 1;
                        znVar2.J9(messageObject6, true, false);
                        if (messageObject6.sponsoredUrl != null) {
                            ze.c cVar2 = znVar2.xb;
                            if (cVar2 != null) {
                                cVar2.a(true);
                            }
                            if (s1Var.getMessageObject() != null) {
                                enVar = new en(this, s1Var, i21);
                            }
                            znVar2.xb = enVar;
                            ze.d.r(znVar2.getParentActivity(), Uri.parse(messageObject6.sponsoredUrl), true, false, false, znVar2.xb, null, false, znVar2.getMessagesController().sponsoredLinksInappAllow, false);
                            return;
                        }
                    } else if (messageObject6.isVideo()) {
                        znVar2.J9(messageObject6, true, false);
                    }
                }
                if (messageObject6.getDuration() > 0.0d && messageObject6.getVideoStartsTimestamp() > 0 && !messageObject6.openedInViewer) {
                    messageObject6.forceSeekTo = (float) (messageObject6.getVideoStartsTimestamp() / messageObject6.getDuration());
                }
                znVar2.ha(s1Var, messageObject6);
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
                } catch (Exception e6) {
                    FileLog.e(e6);
                    znVar2.z6(messageObject6);
                }
            } else if (i22 == 4) {
                if (AndroidUtilities.isMapsInstalled(znVar2)) {
                    if (!messageObject6.isLiveLocation()) {
                        cd0 cd0Var = new cd0(znVar2.h == null ? 3 : 0);
                        cd0Var.C0 = znVar2;
                        cd0Var.u0(messageObject6);
                        znVar2.presentFragment(cd0Var);
                        return;
                    }
                    TLRPC.Chat chat2 = znVar2.e;
                    cd0 cd0Var2 = new cd0((chat2 == null || ChatObject.canSendMessages(chat2) || znVar2.e.megagroup) ? 2 : 6);
                    cd0Var2.C0 = znVar2;
                    cd0Var2.u0(messageObject6);
                    znVar2.presentFragment(cd0Var2);
                }
            } else if (i22 == 9 || i22 == 0) {
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
                        znVar2.presentFragment(new jd1(u10));
                        return;
                    }
                    znVar2.u4 = -1;
                }
                if (messageObject6.canPreviewDocument()) {
                    PhotoViewer.t1().K2(null, znVar2, znVar2.ba);
                    PhotoViewer t12 = PhotoViewer.t1();
                    int i23 = messageObject6.type;
                    long j12 = i23 != 0 ? znVar2.Q5 : 0L;
                    if (i23 != 0) {
                        j11 = 0;
                        j10 = znVar2.I6;
                    } else {
                        j10 = 0;
                        j11 = 0;
                    }
                    if (i23 != 0) {
                        j11 = znVar2.d();
                    }
                    messageObject = messageObject6;
                    t12.c2(messageObject, znVar2, j12, j10, j11, znVar2.Ca);
                    z10 = true;
                } else {
                    messageObject = messageObject6;
                    z10 = false;
                }
                Pattern pattern = org.telegram.ui.Components.t90.a;
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
                    znVar = znVar2;
                    messageObject2 = messageObject;
                    if (!z11) {
                        try {
                            AndroidUtilities.openForView(messageObject2, znVar.getParentActivity(), znVar.ba, false);
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            znVar.z6(messageObject2);
                        }
                    }
                }
                if (znVar2.getParentActivity() == null) {
                    znVar = znVar2;
                    messageObject2 = messageObject;
                } else {
                    org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(znVar2.getParentActivity(), 3, znVar2.ba);
                    d2Var.setCanceledOnTouchOutside(false);
                    boolean[] zArr = {false};
                    d2Var.setOnCancelListener(new bh(0, zArr));
                    d2Var.q(150L);
                    MessageObject messageObject7 = messageObject;
                    androidx.car.app.utils.c cVar3 = new androidx.car.app.utils.c(znVar2, messageObject7, d2Var, zArr, 29);
                    messageObject2 = messageObject7;
                    znVar = znVar2;
                    new Thread(cVar3).start();
                }
                z11 = true;
                if (!z11) {
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean B0(MessageObject messageObject) {
        return !this.a.s.containsKey(messageObject);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void B2() {
        zn znVar = this.a;
        if (!znVar.getUserConfig().isPremium()) {
            org.telegram.ui.Components.qc.a0(znVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("UnlockSimilarChannelsPremium", znVar.getMessagesController().recommendedChannelsLimitPremium), new wm(this, 4))).j();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", znVar.Q5);
        bundle.putInt("start_from", 10);
        znVar.presentFragment(new org.telegram.ui.Components.ea0(bundle, znVar.X0.getSharedMediaPreloader()));
    }

    @Override // org.telegram.ui.Cells.j1
    public final void C2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
        MessageObject messageObject;
        TLRPC.TL_factCheck factCheck;
        String str;
        zn znVar = this.a;
        ph.f3 f3Var = znVar.x1;
        if (f3Var != null) {
            f3Var.e(true);
        }
        if (znVar.getParentActivity() == null || (messageObject = s1Var.getMessageObject()) == null || (factCheck = messageObject.getFactCheck()) == null || factCheck.country == null) {
            return;
        }
        try {
            str = new Locale("", factCheck.country).getDisplayCountry(LocaleController.getInstance().getCurrentLocale());
        } catch (Exception e) {
            FileLog.e(e);
            str = factCheck.country;
        }
        ph.f3 f3Var2 = new ph.f3(znVar.getParentActivity(), 3);
        f3Var2.p(true);
        f3Var2.H = Layout.Alignment.ALIGN_NORMAL;
        f3Var2.d = -1L;
        f3Var2.Q = true;
        f3Var2.e = true;
        f3Var2.q(12.0f);
        znVar.x1 = f3Var2;
        f3Var2.i0 = new hc(23, this, f3Var2);
        f3Var2.s(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FactCheckToast, str)));
        znVar.U0.addView(znVar.x1, k7.b6.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
        znVar.U0.post(new j3.b0(this, s1Var, i11, i10, 4));
    }

    @Override // org.telegram.ui.Cells.j1
    public final void D0(org.telegram.ui.Cells.s1 s1Var) {
        dh.f fVar = this.a.zc;
        if (fVar == null || fVar.n != s1Var) {
            return;
        }
        fVar.w.getClass();
    }

    @Override // org.telegram.ui.Cells.j1
    public final org.telegram.ui.Cells.m9 D2() {
        return this.a.Z8;
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
        zn znVar = this.a;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    znVar.I7(s1Var, true, false, s1Var.getLastTouchX(), s1Var.getLastTouchY(), true, false, true);
                    return;
                } else {
                    if (i12 == 4) {
                        znVar.O1.m(messageObject.getTopicId(), true);
                        return;
                    }
                    return;
                }
            }
            if (message.suggested_post != null) {
                i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, znVar.e);
                if (canManageMonoForum) {
                    i11 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                    ChatObject.canUserDoChannelDirectAdminAction(i11, znVar.e, 5);
                }
                cg.u0 u0Var = new cg.u0(this, message, canManageMonoForum, messageObject, 7);
                TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                znVar.g7(u0Var, lf.a.l(suggestedPost != null ? suggestedPost.price : null), !canManageMonoForum);
                return;
            }
            return;
        }
        long peerDialogId = DialogObject.getPeerDialogId(message.from_id);
        kh.a1 a1Var = new kh.a1(25, this, message);
        Pattern pattern = org.telegram.ui.Components.z4.a;
        Activity parentActivity = znVar.getParentActivity();
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
        znVar.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void E0() {
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        org.telegram.ui.Components.y5 animation;
        zn znVar = this.a;
        if (znVar.i3 || SharedConfig.noSoundHintShowed || znVar.u0 == null || znVar.getParentActivity() == null || znVar.fragmentView == null) {
            return;
        }
        org.telegram.ui.Components.l40 l40Var = znVar.q2;
        if (l40Var == null || l40Var.getTag() == null) {
            if (znVar.q2 == null) {
                rm rmVar = znVar.U0;
                int indexOfChild = rmVar.indexOfChild(znVar.P);
                if (indexOfChild == -1) {
                    return;
                }
                org.telegram.ui.Components.l40 l40Var2 = new org.telegram.ui.Components.l40(0, znVar.getParentActivity(), znVar.ba, false);
                znVar.q2 = l40Var2;
                l40Var2.setShowingDuration(10000L);
                rmVar.addView(znVar.q2, indexOfChild + 1, k7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                znVar.q2.setAlpha(0.0f);
                znVar.q2.setVisibility(4);
            }
            int childCount = znVar.u0.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = znVar.u0.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) != null && messageObject.isVideo() && (animation = s1Var.getPhotoImage().getAnimation()) != null && animation.o() >= 3000 && znVar.q2.e(s1Var, null, 0, 0, true)) {
                    SharedConfig.setNoSoundHintShowed(true);
                    return;
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void F(org.telegram.ui.Cells.s1 s1Var) {
        zn znVar = this.a;
        znVar.ua.l(s1Var, znVar, true);
        znVar.u0.I0(false);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void F0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z4) {
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        zn znVar = this.a;
        if (znVar.getParentActivity() == null || tLObject == null) {
            return;
        }
        e5Var = ((org.telegram.ui.ActionBar.p2) znVar).parentLayout;
        if (e5Var != null) {
            e5Var2 = ((org.telegram.ui.ActionBar.p2) znVar).parentLayout;
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
            znVar.presentFragment(new zn(bundle));
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, znVar.getParentActivity(), znVar.getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(znVar.getParentActivity(), false, false);
        g1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
        g1Var.setMinimumWidth(160);
        g1Var.setOnClickListener(new a(this, 14));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(znVar.getParentActivity(), false, false);
        g1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
        g1Var2.setMinimumWidth(160);
        g1Var2.setOnClickListener(new c0(this, (TLRPC.Chat) tLObject, s1Var, 7));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
        zn znVar2 = new zn(bundle);
        znVar2.G9 = true;
        znVar.presentFragmentAsPreviewWithMenu(znVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
        znVar.d7();
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean F1() {
        zn znVar = this.a;
        return znVar.U0.getMeasuredWidth() > znVar.U0.getMeasuredHeight();
    }

    @Override // org.telegram.ui.Cells.j1
    public final void G0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
        MessageObject messageObject = s1Var.getMessageObject();
        int i10 = messageObject.type;
        zn znVar = this.a;
        if (i10 != 16) {
            znVar.I7(s1Var, true, false, f10, f11, messageObject.isMusic(), false, false);
            return;
        }
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        int i11 = 0;
        if (!(messageAction instanceof TLRPC.TL_messageActionConferenceCall)) {
            TLRPC.User user = znVar.f;
            if (user != null) {
                boolean isVideoCall = messageObject.isVideoCall();
                TLRPC.UserFull userFull = znVar.X7;
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
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(znVar.getParentActivity(), 3, null);
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = znVar.getMessagesController().conferenceCallSizeLimit;
        d2Var.setOnCancelListener(new lh.w(this, znVar.getConnectionsManager().sendRequest(getgroupcall, new gg.e0(this, d2Var, hashSet, tL_inputGroupCallInviteMessage, messageObject, 6)), 2));
        d2Var.q(600L);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void H1(org.telegram.ui.Cells.s1 s1Var) {
        zn.U4(this.a, s1Var);
    }

    @Override // org.telegram.ui.Cells.j1
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

    @Override // org.telegram.ui.Cells.j1
    public final void I0(org.telegram.ui.Cells.s1 s1Var) {
        k(s1Var, true, false, true);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void I1(org.telegram.ui.Cells.s1 s1Var, boolean z4) {
        k(s1Var, z4, false, false);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void K0(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject;
        if (s1Var == null || (messageObject = s1Var.getMessageObject()) == null || messageObject.messageOwner == null) {
            return;
        }
        int id2 = messageObject.getId();
        zn znVar = this.a;
        if (znVar.tb == id2 && znVar.ub == 7) {
            return;
        }
        TLRPC.InputPeer inputPeer = znVar.getMessagesController().getInputPeer(messageObject.getDialogId());
        if (inputPeer == null) {
            return;
        }
        TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
        getrichmessage.peer = inputPeer;
        getrichmessage.id = id2;
        ze.c cVar = znVar.xb;
        if (cVar != null) {
            cVar.a(true);
            znVar.xb = null;
        }
        int[] iArr = new int[1];
        yi yiVar = new yi(znVar, id2, s1Var, 2);
        yiVar.b = new hc(11, znVar, iArr);
        znVar.xb = yiVar;
        yiVar.d();
        iArr[0] = znVar.getConnectionsManager().sendRequestTyped(getrichmessage, new org.telegram.messenger.a(), new hg(znVar, yiVar, iArr, s1Var, messageObject));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.j1
    public final boolean K1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        int i10;
        int i11;
        boolean z4;
        int i12;
        boolean z10;
        int i13;
        b5 b5Var;
        qk qkVar;
        pk pkVar;
        if (!l()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(ChatObject.getPublicUsername(chat));
        zn znVar = this.a;
        int i14 = (isEmpty || znVar.e == null || ((qkVar = znVar.L0) != null && qkVar.getVisibility() == 0) || ((pkVar = znVar.O) != null && pkVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat2 = znVar.e;
        int i15 = (chat2 == null || !(znVar.a4 == 0 || znVar.e4) || (ChatObject.isChannel(chat2) && !znVar.e.megagroup)) ? 0 : 1;
        TLRPC.Chat chat3 = znVar.e;
        int i16 = (chat3 == null || chat3.id != chat.id || znVar.F9()) ? 1 : 0;
        h5[] h5VarArr = new h5[i16 + 1 + i14 + i15];
        h5VarArr[0] = h5.d;
        if (i16 != 0) {
            h5VarArr[1] = chat.broadcast ? h5.e : h5.f;
            i10 = 2;
        } else {
            i10 = 1;
        }
        if (i14 != 0) {
            h5VarArr[i10] = h5.n;
            i10++;
        }
        if (i15 != 0) {
            h5VarArr[i10] = h5.r;
        }
        TLRPC.ChatFull chatFull = znVar.getMessagesController().getChatFull(chat.id);
        if (chatFull != null) {
            b5Var = b5.a(chat, chatFull, h5VarArr);
            z10 = i14;
            i13 = i15;
            i12 = i16;
            z4 = true;
        } else {
            i11 = ((org.telegram.ui.ActionBar.p2) znVar).classGuid;
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
            b5Var = new b5(forUserOrChat, forUserOrChat2, null, str, null, null, chatPhoto != null ? chatPhoto.strippedBitmap : null, chat, h5VarArr, new a5(i11, chat, NotificationCenter.chatInfoDidLoad));
        }
        if (cb.m.e(b5Var)) {
            cb.m.l().v((ViewGroup) znVar.fragmentView, znVar.ba, b5Var, new f7(this, chat, s1Var, 7));
            return z4;
        }
        org.telegram.ui.Components.p70 H = org.telegram.ui.Components.p70.H(znVar, s1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new zm(this, chat, 0), false);
        boolean z11 = chat.broadcast;
        H.l(z11 ? R.drawable.msg_channel : R.drawable.msg_discussion, LocaleController.getString(z11 ? R.string.OpenChannel2 : R.string.OpenGroup2), new u1(this, s1Var, chat, 26), i12);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new zm(this, chat, 1), z10);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new zm(this, chat, 2), i13);
        H.t = false;
        H.i = 3;
        H.W = true;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void L(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject.messageOwner.send_state != 0) {
            this.a.getSendMessagesHelper().cancelSendingMessage(messageObject);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void L1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        zn znVar = this.a;
        if (znVar.z9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) lf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) lf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
        if (znVar.getParentActivity() != null) {
            if (znVar.L0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || lf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || lf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || lf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || lf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || lf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || lf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                if (tL_inlineButtonTypeCopy == null) {
                    if (tL_inlineButtonTypeUrl != null) {
                        znVar.Z9(null, tL_inlineButtonTypeUrl.url, true, s1Var, s1Var.getMessageObject());
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
                org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(znVar.getParentActivity(), znVar.ba, false, false);
                g3Var.fixNavigationBar();
                g3Var.title = str;
                g3Var.bigTitle = false;
                g3Var.multipleLinesTitle = true;
                CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Copy)};
                cg.u1 u1Var = new cg.u1(3, znVar, str);
                g3Var.items = charSequenceArr;
                g3Var.onClickListener = u1Var;
                znVar.showDialog(g3Var);
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void M(org.telegram.ui.Cells.s1 s1Var, jh.f fVar) {
        TLRPC.Message message;
        if (s1Var == null) {
            fVar.run();
            return;
        }
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject == null || ((messageObject.isSending() && !messageObject.isEditing()) || (message = messageObject.messageOwner) == null || message.rich_message == null)) {
            fVar.run();
        } else {
            org.telegram.ui.ActionBar.p2 p2Var = this.a;
            p2Var.getSendMessagesHelper().editRichMessage(messageObject, messageObject.messageOwner.rich_message, null, p2Var, true);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean M1() {
        zn znVar = this.a;
        return znVar.U0.getKeyboardHeight() + znVar.la >= AndroidUtilities.dp(20.0f);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void N(int i10, org.telegram.ui.Cells.s1 s1Var) {
        boolean z4 = s1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveaway;
        zn znVar = this.a;
        if (z4) {
            long j10 = -((TLRPC.TL_messageMediaGiveaway) s1Var.getMessageObject().messageOwner.media).channels.get(i10).longValue();
            if (znVar.Q5 != j10) {
                znVar.presentFragment(zn.R9(j10));
            } else {
                znVar.X0.e(false, false);
            }
        }
        if (s1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            znVar.presentFragment(ProfileActivity.m4(((TLRPC.TL_messageMediaGiveawayResults) s1Var.getMessageObject().messageOwner.media).winners.get(i10).longValue()));
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void N0(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        messageObject.messageOwner.summarizedOpen = !r1.summarizedOpen;
        messageObject.updateTranslation(true);
        zn znVar = this.a;
        znVar.getMessagesStorage().updateMessageCustomParams(messageObject.getDialogId(), messageObject.messageOwner);
        znVar.getMessagesController().getTranslateController().checkTranslation(messageObject, true);
        k(s1Var, true, false, true);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void O(MessageObject messageObject) {
        if (messageObject.isVideo()) {
            this.a.fb(messageObject, true);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void O1(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        zn znVar = this.a;
        znVar.a5 = messageObject;
        znVar.d9();
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean P(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z4) {
        int i10;
        int i11;
        boolean isForwarded = s1Var.getMessageObject().isForwarded();
        zn znVar = this.a;
        if (isForwarded) {
            long peerDialogId = DialogObject.getPeerDialogId(s1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(znVar);
            int i12 = R.raw.passcode_lock_close;
            int i13 = R.string.TodoCompleteForbiddenForward;
            i11 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
            a02.Q(i12, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i13, DialogObject.getName(i11, peerDialogId)))).k(true);
            return false;
        }
        if (s1Var.getMessageObject().canCompleteTodo()) {
            if (znVar.getUserConfig().isPremium()) {
                znVar.getSendMessagesHelper().toggleTodo(ChatObject.getSendAsPeerId(znVar.e, znVar.W7, true), s1Var.getMessageObject(), todoItem, z4, null);
                return true;
            }
            org.telegram.ui.Components.qc.a0(znVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.TodoPremiumRequired), new wm(this, 9))).k(true);
            return false;
        }
        long peerDialogId2 = DialogObject.getPeerDialogId(s1Var.getMessageObject().getFromPeer());
        org.telegram.ui.Components.qc a03 = org.telegram.ui.Components.qc.a0(znVar);
        int i14 = R.raw.passcode_lock_close;
        int i15 = R.string.TodoCompleteForbidden;
        i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
        a03.Q(i14, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i15, DialogObject.getName(i10, peerDialogId2)))).k(true);
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean Q() {
        zn znVar = this.a;
        return znVar.T5[1].size() + znVar.T5[0].size() > 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void Q1(MessageObject messageObject) {
        this.a.s.put(messageObject, Boolean.TRUE);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean R(org.telegram.ui.Cells.s1 s1Var) {
        int i10;
        MessageObject messageObject;
        TLRPC.Message message;
        if (s1Var == null) {
            return false;
        }
        zn znVar = this.a;
        if (znVar.getParentActivity() == null) {
            return false;
        }
        i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
        if (!MessagesController.getInstance(i10).richEditorAllowed() || (messageObject = s1Var.getMessageObject()) == null || (message = messageObject.messageOwner) == null || message.rich_message == null) {
            return false;
        }
        if (!messageObject.translated || message.translatedRichMessage == null) {
            return messageObject.canEditMessage(znVar.e);
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean R0(long j10) {
        zn znVar = this.a;
        TLRPC.Chat chat = znVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return false;
        }
        return znVar.getMessagesController().isOwner(znVar.e.id, j10);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void R1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        Uri parse;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        boolean z10 = (z4 || !ze.d.h(str, false, false)) ? z4 : true;
        zn znVar = this.a;
        ze.c cVar = znVar.xb;
        if (cVar != null) {
            cVar.a(true);
        }
        znVar.xb = s1Var.getMessageObject() == null ? null : new hn(this, s1Var);
        if (z10 || ze.d.f(parse, false, null)) {
            ze.d.r(znVar.getParentActivity(), parse, true, true, false, znVar.xb, null, false, true, false);
        } else {
            org.telegram.ui.Components.z4.r0(znVar, str, true, true, true, !z10, znVar.xb, webPage, znVar.ba);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean S() {
        zn znVar = this.a;
        return UserObject.isReplyUser(znVar.f) || UserObject.isUserSelf(znVar.f);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void S0(org.telegram.ui.Cells.s1 s1Var) {
        int i10;
        i5.v vVar;
        MessageObject.GroupedMessages groupedMessages;
        int i11;
        zn znVar = this.a;
        hh.k kVar = znVar.U9;
        if (kVar == null) {
            return;
        }
        HashMap hashMap = kVar.a;
        hh.j jVar = (hh.j) hashMap.get(hh.k.b(s1Var));
        org.telegram.ui.Components.ic icVar = null;
        MessageObject messageObject = jVar != null ? jVar.B : null;
        hh.j jVar2 = (hh.j) znVar.U9.a.get(hh.k.b(s1Var));
        long j10 = (jVar2 == null || (i11 = jVar2.O) == -1) ? 0L : jVar2.w[i11].d;
        if (messageObject != null && j10 != 0) {
            Activity parentActivity = znVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
            if (!org.telegram.ui.Components.z4.h(parentActivity, i10, j10, false)) {
                ArrayList<MessageObject> arrayList = (messageObject.getGroupId() == 0 || (groupedMessages = (MessageObject.GroupedMessages) znVar.u6.f(messageObject.getGroupId())) == null) ? null : groupedMessages.messages;
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
                icVar = org.telegram.ui.Components.qc.v(znVar.getParentActivity(), znVar, null, 1, j11, 1, znVar.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), znVar.getThemedColor(org.telegram.ui.ActionBar.j6.Hi), 5000, false, vVar);
                icVar.k = true;
                icVar.k(icVar.e instanceof org.telegram.ui.Components.tb);
            }
        }
        hh.j jVar3 = (hh.j) hashMap.get(hh.k.b(s1Var));
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

    @Override // org.telegram.ui.Cells.j1
    public final CharacterStyle S1(org.telegram.ui.Cells.s1 s1Var) {
        zn znVar;
        int i10;
        if (s1Var.getMessageObject() == null || (i10 = (znVar = this.a).tb) == 0 || i10 != s1Var.getMessageObject().getId() || znVar.ub != 1) {
            return null;
        }
        return znVar.vb;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void T(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
        org.telegram.ui.ActionBar.k kVar;
        MessageObject messageObject;
        if (chat == null) {
            return;
        }
        zn znVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
        if (kVar.s() || znVar.A9()) {
            zn.b2(znVar, s1Var, true, f10, f11);
            return;
        }
        if (z4 || !chat.signature_profiles || (messageObject = s1Var.getMessageObject()) == null || messageObject.getDialogId() == UserObject.REPLY_BOT) {
            p(s1Var, chat, i10, z4);
        } else {
            znVar.na(DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void T1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        try {
            zn znVar = this.a;
            org.telegram.ui.Components.ou.I(znVar, messageObject, znVar.Ca, str2, str3, str4, str, i10, i11, -1, znVar.x9());
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void U(org.telegram.ui.Cells.s1 s1Var) {
        k(s1Var, true, true, false);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void U0(int i10, org.telegram.ui.Cells.s1 s1Var) {
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
        zn znVar = this.a;
        if (i10 == 19) {
            ze.c cVar = znVar.xb;
            if (cVar != null) {
                cVar.a(true);
            }
            final en enVar = s1Var.getMessageObject() != null ? new en(this, s1Var, 2) : null;
            znVar.xb = enVar;
            final Activity parentActivity = znVar.getParentActivity();
            final org.telegram.ui.ActionBar.f6 resourceProvider = znVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            enVar.d();
            enVar.b = new gg.k(atomicBoolean, 0);
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
            gg.p0.d(messageObject, new Utilities.Callback(atomicBoolean, enVar, z4, b11, j10, tL_messageMediaGiveaway2, parentActivity, resourceProvider) { // from class: gg.l
                public final /* synthetic */ AtomicBoolean a;
                public final /* synthetic */ ze.c b;
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
            }, new gg.m(atomicBoolean, enVar, 0));
            return;
        }
        if (i10 == 21) {
            h();
            return;
        }
        if (i10 == 84) {
            znVar.ua(s1Var);
            return;
        }
        if (i10 == 80) {
            hh.g gVar = org.telegram.ui.Components.wg0.L;
            if (znVar.getParentActivity() == null) {
                return;
            }
            znVar.showDialog(new org.telegram.ui.Components.wg0(znVar.getContext(), znVar.getCurrentAccount(), messageObject, znVar.getResourceProvider()));
            return;
        }
        if (i10 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
            if (messageMedia4 == null || (webPage = messageMedia4.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.D1;
            if (launchActivity == null || launchActivity.P() == null || LaunchActivity.D1.P().k(messageObject) == null) {
                znVar.createArticleViewer(false).N(messageObject, null, null, null);
                return;
            }
            return;
        }
        int i15 = 5;
        if (i10 == 5) {
            long j11 = messageObject.messageOwner.media.user_id;
            if (j11 != 0) {
                i14 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
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
                znVar.showDialog(new org.telegram.ui.Components.te0(znVar, null, user, null, file, se.b.d(str, false), str3, str4, znVar.ba));
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (i10 == 30) {
            znVar.presentFragment(new zn(kf.k0.g(messageObject.messageOwner.media.user_id, "user_id")));
            return;
        }
        if (i10 == 31) {
            long j12 = messageObject.messageOwner.media.user_id;
            if (j12 != 0) {
                i13 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
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
                znVar.presentFragment(new ps(bundle2));
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
            ze.c cVar2 = znVar.xb;
            if (cVar2 != null) {
                cVar2.a(true);
            }
            int i16 = 3;
            znVar.xb = s1Var.getMessageObject() != null ? new en(this, s1Var, i16) : null;
            if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                String group = matcher.group(1);
                i11 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                if (MediaDataController.getInstance(i11).getStickerSetByName(group) == null) {
                    znVar.xb.d();
                    TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_inputStickerSetShortName.short_name = group;
                    tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                    i12 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                    znVar.xb.b = new ah.b(this, ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickerSet, new org.telegram.messenger.zd(i16, this, z10)), 23);
                    return;
                }
            }
            ze.d.r(znVar.getParentActivity(), Uri.parse(webPage2.url), true, true, false, znVar.xb, null, false, true, false);
            return;
        }
        if (messageObject.isSponsored()) {
            znVar.J9(messageObject, false, false);
            if (messageObject.sponsoredUrl != null) {
                ze.c cVar3 = znVar.xb;
                if (cVar3 != null) {
                    cVar3.a(true);
                }
                znVar.xb = s1Var.getMessageObject() != null ? new en(this, s1Var, 4) : null;
                ze.d.r(znVar.getParentActivity(), Uri.parse(messageObject.sponsoredUrl), true, false, false, znVar.xb, null, false, znVar.getMessagesController().sponsoredLinksInappAllow, false);
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
                    znVar.getOrCreateStoryViewer().G(znVar.getParentActivity(), tL_webPageAttributeStory.storyItem, nh.c7.a(znVar.u0));
                    return;
                }
            }
        }
        if (znVar.ea(storyMentionWebpage.url, s1Var, null, messageObject.getId(), 2)) {
            return;
        }
        ze.c cVar4 = znVar.xb;
        if (cVar4 != null) {
            cVar4.a(true);
        }
        znVar.xb = s1Var.getMessageObject() != null ? new en(this, s1Var, i15) : null;
        ze.d.r(znVar.getParentActivity(), Uri.parse(storyMentionWebpage.url), true, true, false, znVar.xb, null, false, true, false);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean U1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        ViewGroup viewGroup;
        int i10;
        u41 u41Var;
        if (messageObject.isVoiceOnce() || messageObject.isRoundOnce()) {
            int i11 = 1;
            w41 w41Var = this.a.W9;
            if (w41Var == null || w41Var.Y) {
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
                this.a.W9 = new w41(this.a.getParentActivity());
                w41 w41Var2 = this.a.W9;
                te fb2 = !messageObject.isOutOwner() ? this.a.fb(messageObject, true) : null;
                i5.v O4 = !messageObject.isOutOwner() ? zn.O4(this.a, messageObject) : null;
                Context context = w41Var2.a;
                ah.e eVar = w41Var2.c;
                w41Var2.U = fb2;
                w41Var2.V = O4;
                u41 u41Var2 = w41Var2.K;
                if (u41Var2 != null) {
                    eVar.removeView(u41Var2);
                    w41Var2.K = null;
                }
                w41Var2.L = s1Var;
                MessageObject messageObject2 = s1Var.getMessageObject();
                w41Var2.J = messageObject2;
                w41Var2.P = messageObject2 != null && messageObject2.isRoundVideo();
                org.telegram.ui.Cells.s1 s1Var2 = w41Var2.L;
                w41Var2.I = s1Var2 != null ? s1Var2.getResourcesProvider() : null;
                if (w41Var2.L != null) {
                    w41Var2.Q = 0.0f;
                    w41Var2.R = s1Var.n;
                    if (s1Var.getParent() instanceof View) {
                        View view = (View) s1Var.getParent();
                        w41Var2.Q = view.getY() + w41Var2.Q;
                        w41Var2.R = view.getY() + w41Var2.R;
                    }
                    int width = w41Var2.L.getWidth();
                    int height = w41Var2.L.getHeight();
                    if (w41Var2.P) {
                        height = Math.min(AndroidUtilities.dp(360.0f), Math.min(width, AndroidUtilities.displaySize.y));
                    }
                    int i12 = height;
                    w41Var2.H = i12 - w41Var2.L.getHeight();
                    i10 = (int) Math.ceil((Math.min(width, i12) * 0.92f) / AndroidUtilities.density);
                    viewGroup = eVar;
                    u41 u41Var3 = new u41(w41Var2, w41Var2.getContext(), UserConfig.selectedAccount, w41Var2.L.getResourcesProvider(), width, i12);
                    w41Var2.K = u41Var3;
                    w41Var2.L.j1(u41Var3);
                    w41Var2.K.i1(w41Var2.L);
                    w41Var2.K.setDelegate(new z9.d(17));
                    u41 u41Var4 = w41Var2.K;
                    MessageObject messageObject3 = w41Var2.J;
                    MessageObject.GroupedMessages currentMessagesGroup = w41Var2.L.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.s1 s1Var3 = w41Var2.L;
                    u41Var4.X3(messageObject3, currentMessagesGroup, s1Var3.C, s1Var3.B, false, false);
                    if (!w41Var2.P) {
                        org.telegram.ui.Components.d8 d8Var = new org.telegram.ui.Components.d8();
                        w41Var2.S = d8Var;
                        u41 u41Var5 = w41Var2.K;
                        d8Var.i = u41Var5;
                        u41Var5.be = d8Var;
                        if (u41Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.lo0 seekBarWaveform = w41Var2.K.getSeekBarWaveform();
                            seekBarWaveform.L = w41Var2.s;
                            org.telegram.ui.Cells.s1 s1Var4 = seekBarWaveform.n;
                            if (s1Var4 != null) {
                                s1Var4.invalidate();
                            }
                        }
                    }
                    w41Var2.E = false;
                    viewGroup.addView(w41Var2.K, new FrameLayout.LayoutParams(w41Var2.L.getWidth(), i12, 17));
                } else {
                    viewGroup = eVar;
                    i10 = 360;
                }
                TextureView textureView = w41Var2.M;
                if (textureView != null) {
                    viewGroup.removeView(textureView);
                    w41Var2.M = null;
                }
                if (w41Var2.P) {
                    w41Var2.N = false;
                    TextureView textureView2 = new TextureView(context);
                    w41Var2.M = textureView2;
                    viewGroup.addView(textureView2, 0, k7.b6.c(i10, i10));
                }
                MediaController.getInstance().pauseByRewind();
                org.telegram.ui.Components.i71 i71Var = w41Var2.w;
                if (i71Var != null) {
                    i71Var.B();
                    w41Var2.w.H();
                    w41Var2.w = null;
                }
                org.telegram.ui.Cells.s1 s1Var5 = w41Var2.L;
                if (s1Var5 != null && s1Var5.getMessageObject() != null) {
                    File pathToAttach = FileLoader.getInstance(w41Var2.L.getMessageObject().currentAccount).getPathToAttach(w41Var2.L.getMessageObject().getDocument());
                    if (pathToAttach != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && (pathToAttach = FileLoader.getInstance(w41Var2.L.getMessageObject().currentAccount).getPathToMessage(w41Var2.L.getMessageObject().messageOwner)) != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && w41Var2.L.getMessageObject().messageOwner.attachPath != null) {
                        pathToAttach = new File(w41Var2.L.getMessageObject().messageOwner.attachPath);
                    }
                    if (pathToAttach != null && pathToAttach.exists()) {
                        org.telegram.ui.Components.i71 i71Var2 = new org.telegram.ui.Components.i71();
                        w41Var2.w = i71Var2;
                        i71Var2.G = new v41(w41Var2);
                        if (w41Var2.S != null) {
                            i71Var2.H = new v41(w41Var2);
                        }
                        if (w41Var2.P) {
                            i71Var2.V(w41Var2.M);
                        }
                        w41Var2.w.D(Uri.fromFile(pathToAttach), "other");
                        w41Var2.w.C();
                        org.telegram.ui.Components.et etVar = w41Var2.B;
                        if (etVar != null) {
                            etVar.s = w41Var2.w;
                            etVar.a();
                        }
                    }
                    zn znVar = this.a;
                    znVar.showDialog(znVar.W9);
                    return false;
                }
                ph.f3 f3Var = w41Var2.x;
                if (f3Var != null) {
                    viewGroup.removeView(f3Var);
                    w41Var2.x = null;
                }
                MessageObject messageObject4 = w41Var2.J;
                boolean z4 = messageObject4 != null && messageObject4.isOutOwner();
                MessageObject messageObject5 = w41Var2.J;
                if (messageObject5 != null && messageObject5.getDialogId() != UserConfig.getInstance(w41Var2.J.currentAccount).getClientUserId()) {
                    ph.f3 f3Var2 = new ph.f3(context, 3);
                    w41Var2.x = f3Var2;
                    f3Var2.p(true);
                    if (z4) {
                        long dialogId = w41Var2.J.getDialogId();
                        String str = "";
                        if (dialogId > 0) {
                            TLRPC.User user = MessagesController.getInstance(w41Var2.J.currentAccount).getUser(Long.valueOf(dialogId));
                            if (user != null) {
                                str = UserObject.getFirstName(user);
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(w41Var2.J.currentAccount).getChat(Long.valueOf(-dialogId));
                            if (chat != null) {
                                str = chat.title;
                            }
                        }
                        w41Var2.x.s(AndroidUtilities.replaceTags(LocaleController.formatString(w41Var2.P ? R.string.VideoOnceOutHint : R.string.VoiceOnceOutHint, str)));
                    } else {
                        w41Var2.x.s(AndroidUtilities.replaceTags(LocaleController.getString(w41Var2.P ? R.string.VideoOnceHint : R.string.VoiceOnceHint)));
                    }
                    w41Var2.x.q(12.0f);
                    w41Var2.x.setPadding(AndroidUtilities.dp((z4 || w41Var2.L.C) ? 0.0f : 6.0f), 0, 0, 0);
                    if (w41Var2.P) {
                        w41Var2.x.m(0.5f, 0.0f);
                        w41Var2.x.H = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        w41Var2.x.m(0.0f, AndroidUtilities.dp(34.0f));
                        w41Var2.x.H = Layout.Alignment.ALIGN_NORMAL;
                    }
                    w41Var2.x.t(14.0f);
                    ph.f3 f3Var3 = w41Var2.x;
                    f3Var3.h = ph.f3.a(f3Var3.getText(), w41Var2.x.getTextPaint());
                    if (w41Var2.P) {
                        viewGroup.addView(w41Var2.x, k7.b6.d((int) ((w41Var2.L.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((w41Var2.L.getHeight() + w41Var2.H) / AndroidUtilities.density) / 2.0f), 0.0f, 0.0f));
                    } else {
                        viewGroup.addView(w41Var2.x, k7.b6.d((int) ((w41Var2.L.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, ((((w41Var2.L.getWidth() * (-0.39999998f)) / 2.0f) + w41Var2.L.getBoundsLeft()) / AndroidUtilities.density) + 1.0f, ((-75.0f) - ((w41Var2.L.getHeight() / AndroidUtilities.density) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    w41Var2.x.u();
                }
                TextView textView = w41Var2.y;
                if (textView != null) {
                    viewGroup.removeView(textView);
                    w41Var2.y = null;
                }
                TextView textView2 = new TextView(context);
                w41Var2.y = textView2;
                textView2.setTextColor(-1);
                w41Var2.y.setTypeface(AndroidUtilities.bold());
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    w41Var2.y.setBackground(org.telegram.ui.ActionBar.j6.i0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    w41Var2.y.setBackground(org.telegram.ui.ActionBar.j6.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                w41Var2.y.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
                k7.d6.a(w41Var2.y);
                w41Var2.y.setText(LocaleController.getString(z4 ? R.string.VoiceOnceClose : R.string.VoiceOnceDeleteClose));
                w41Var2.y.setOnClickListener(new s41(w41Var2, i11));
                viewGroup.addView(w41Var2.y, k7.b6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z4 && (u41Var = w41Var2.K) != null && u41Var.getMessageObject() != null && w41Var2.K.getMessageObject().messageOwner != null) {
                    w41Var2.K.getMessageObject().messageOwner.media_unread = false;
                    w41Var2.K.invalidate();
                }
                zn znVar2 = this.a;
                znVar2.showDialog(znVar2.W9);
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
                zn znVar3 = this.a;
                return mediaController.setPlaylist(L, messageObject, znVar3.I6, true ^ znVar3.x0.K, null);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void V1() {
        org.telegram.ui.ActionBar.f6 f6Var;
        zn znVar = this.a;
        if (znVar.U0 == null || znVar.getParentActivity() == null) {
            return;
        }
        Context context = znVar.U0.getContext();
        f6Var = ((org.telegram.ui.ActionBar.p2) znVar).resourceProvider;
        w31.T(context, znVar, false, f6Var, null);
    }

    @Override // org.telegram.ui.Cells.j1
    public final int W() {
        return this.a.O3;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void W0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        zn znVar = this.a;
        znVar.getSendMessagesHelper().sendCallback(true, s1Var.getMessageObject(), keyboardInlineButton, znVar);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void Y1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        yi yiVar;
        int i10;
        MessageObject messageObject = s1Var.getMessageObject();
        ah.b bVar = null;
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
                t12.K2(null, znVar, znVar.ba);
                PhotoViewer.t1().a2(arrayList, i11, this.a.a(), 0L, 0L, this.a.Da);
                return;
            }
            return;
        }
        zn znVar2 = this.a;
        ze.c cVar = znVar2.xb;
        if (cVar != null) {
            cVar.a(true);
            znVar2.xb = null;
        }
        if (s1Var.getMessageObject() == null) {
            znVar2.xb = null;
            yiVar = null;
        } else {
            yiVar = new yi(znVar2, s1Var.getMessageObject().getId(), s1Var, 1);
            znVar2.xb = yiVar;
        }
        i10 = ((org.telegram.ui.ActionBar.p2) this.a).currentAccount;
        lh.t7 y10 = lh.t7.y(i10, false);
        Objects.requireNonNull(yiVar);
        bj bjVar = new bj(yiVar, 7);
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
            JSONObject p10 = rh.p2.p(I, false);
            if (p10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
            bVar = new ah.b(y10, ConnectionsManager.getInstance(y10.a).sendRequest(tL_payments_getPaymentForm, new kh.b1(y10, messageObject, tL_inputInvoiceMessage, bjVar, 4)), 8);
        }
        if (bVar != null) {
            yiVar.b = bVar;
            yiVar.d();
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final ug.a Z() {
        return this.a.Nb;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void Z1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10;
        int i11;
        ImageLocation forDocument;
        String str2;
        boolean isEmpty = TextUtils.isEmpty(str);
        zn znVar = this.a;
        if (!isEmpty) {
            ze.d.s(znVar.getParentActivity(), "https://" + znVar.getMessagesController().linkPrefix + "/nft/" + str);
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
        eg.e2 e2Var = new eg.e2(znVar, i10, user, null, null, znVar.ba);
        s1Var.getLocationOnScreen(new int[2]);
        e2Var.s0 = s1Var.getNameStatusX();
        e2Var.t0 = s1Var.getNameStatusY();
        e2Var.w0 = s1Var.getScaleX();
        e2Var.u0 = s1Var.getLeft();
        e2Var.v0 = s1Var.getTop();
        e2Var.x0 = s1Var;
        int colorId = UserObject.getColorId(user);
        if (colorId < 7) {
            e2Var.r0 = Integer.valueOf(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.r8[colorId]));
        } else {
            i11 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
            MessagesController.PeerColors peerColors = MessagesController.getInstance(i11).peerColors;
            MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(colorId) : null;
            e2Var.r0 = color != null ? Integer.valueOf(color.getColor1()) : null;
        }
        org.telegram.ui.Components.j5 j5Var = s1Var.cc;
        if (j5Var != null && (j5Var.f[0] instanceof org.telegram.ui.Components.l5)) {
            e2Var.w0 *= 0.95f;
            if (document != null) {
                org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(znVar.getParentActivity());
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
                    p9Var.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : znVar.getThemedColor(org.telegram.ui.ActionBar.j6.v6), PorterDuff.Mode.SRC_IN));
                    e2Var.z0 = MessageObject.getInputStickerSet(document);
                } else {
                    e2Var.z0 = MessageObject.getInputStickerSet(document);
                }
                e2Var.y0 = p9Var;
                e2Var.B0 = true;
            }
        }
        znVar.showDialog(e2Var);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean a0(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var == null ? null : s1Var.getMessageObject();
        if (messageObject == null || messageObject.messageOwner == null) {
            return false;
        }
        zn znVar = this.a;
        return (znVar.O3 == 1 || znVar.y9() || messageObject.messageOwner.noforwards || messageObject.type == 29) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:311:0x0688, code lost:
    
        if (r3.paid_reactions_available != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x068e, code lost:
    
        if (r6.isEmpty() == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x06bf, code lost:
    
        if (r3.paid_reactions_available != false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x06db, code lost:
    
        if (r6.isEmpty() != false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x06c9, code lost:
    
        if (org.telegram.messenger.ChatObject.isChannel(r5.e) == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x06d5, code lost:
    
        if (org.telegram.messenger.ChatObject.isMonoForum(r5.e) != false) goto L188;
     */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0824  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x084f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x09a2 A[LOOP:3: B:254:0x09a0->B:255:0x09a2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0a0d  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0a25  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0aa7  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0941  */
    @Override // org.telegram.ui.Cells.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a2(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        yv0 yv0Var;
        TLRPC.PollAnswer pollAnswer2;
        yv0 yv0Var2;
        uv0 uv0Var;
        ng.a aVar;
        MessageObject messageObject;
        MessageObject messageObject2;
        boolean z4;
        MessageObject messageObject3;
        boolean z10;
        boolean z11;
        zn znVar;
        MessageObject messageObject4;
        org.telegram.ui.Components.p70 p70Var;
        ze zeVar;
        yv0 yv0Var3;
        MessageObject messageObject5;
        int size;
        int i10;
        ViewGroup viewGroup;
        boolean z12;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        boolean z13;
        byte[] bArr;
        uv0 uv0Var2;
        TLRPC.PollAnswerVoters pollAnswerVoters;
        boolean z14;
        yv0 yv0Var4;
        ArrayList arrayList;
        byte[] bArr2;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll2;
        TLRPC.PollAnswer pollAnswer3;
        boolean z15;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll3;
        boolean z16;
        dh.u uVar;
        boolean z17;
        ArrayList<TLRPC.PollAnswerVoters> arrayList2;
        zn znVar2 = this.a;
        if (znVar2.getParentActivity() != null && znVar2.getParentActivity() != null) {
            ph.f3 f3Var = znVar2.u1;
            if (f3Var != null && f3Var.S) {
                f3Var.e(true);
            }
            xl xlVar = znVar2.y1;
            if (xlVar != null && xlVar.S) {
                xlVar.e(true);
            }
            MessageObject primaryMessageObject = s1Var.getPrimaryMessageObject();
            TLRPC.MessageMedia media = MessageObject.getMedia(primaryMessageObject);
            if (primaryMessageObject != null && (media instanceof TLRPC.TL_messageMediaPoll)) {
                znVar2.a5 = primaryMessageObject;
                znVar2.b5 = null;
                yv0 yv0Var5 = new yv0(znVar2.getParentActivity(), znVar2.getResourceProvider());
                byte[] bArr3 = pollAnswer.option;
                yv0Var5.I = s1Var;
                yv0Var5.M = bArr3;
                MessageObject messageObject6 = s1Var.getMessageObject();
                yv0Var5.E = messageObject6;
                yv0Var5.F = messageObject6 != null && messageObject6.isOutOwner();
                org.telegram.ui.Cells.s1 s1Var2 = yv0Var5.I;
                uv0 uv0Var3 = yv0Var5.d;
                if (s1Var2 != null) {
                    yv0Var5.J = znVar2.p9 - AndroidUtilities.dp(4.0f);
                    yv0Var5.K = s1Var.n;
                    if (s1Var.getParent() instanceof View) {
                        View view = (View) s1Var.getParent();
                        yv0Var5.J = view.getY() + yv0Var5.J;
                        yv0Var5.K = view.getY() + yv0Var5.K;
                    }
                    int width = yv0Var5.I.getWidth();
                    int height = yv0Var5.I.getHeight();
                    yv0Var5.I.getHeight();
                    wv0 wv0Var = new wv0(yv0Var5, yv0Var5.getContext(), UserConfig.selectedAccount, yv0Var5.I.getResourcesProvider(), bArr3, width, height);
                    yv0Var = yv0Var5;
                    yv0Var.G = wv0Var;
                    yv0Var.I.h1(wv0Var);
                    yv0Var.G.i1(yv0Var.I);
                    yv0Var.G.setDelegate(new db.a(17));
                    wv0 wv0Var2 = yv0Var.G;
                    MessageObject messageObject7 = yv0Var.E;
                    MessageObject.GroupedMessages currentMessagesGroup = yv0Var.I.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.s1 s1Var3 = yv0Var.I;
                    wv0Var2.X3(messageObject7, currentMessagesGroup, s1Var3.C, s1Var3.B, s1Var3.D, false);
                    wv0 wv0Var3 = yv0Var.G;
                    wv0Var3.J7 = bArr3;
                    uv0Var3.addView(wv0Var3, new FrameLayout.LayoutParams(yv0Var.I.getWidth(), height, 51));
                    xv0 xv0Var = new xv0(yv0Var.getContext(), UserConfig.selectedAccount, yv0Var.I.getResourcesProvider(), width, height, 0);
                    yv0Var.H = xv0Var;
                    yv0Var.I.j1(xv0Var);
                    yv0Var.I.h1(yv0Var.H);
                    yv0Var.H.i1(yv0Var.I);
                    yv0Var.H.setDelegate(new cb.b(17));
                    xv0 xv0Var2 = yv0Var.H;
                    MessageObject messageObject8 = yv0Var.E;
                    MessageObject.GroupedMessages currentMessagesGroup2 = yv0Var.I.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.s1 s1Var4 = yv0Var.I;
                    xv0Var2.X3(messageObject8, currentMessagesGroup2, s1Var4.C, s1Var4.B, s1Var4.D, false);
                    uv0Var3.addView(yv0Var.H, new FrameLayout.LayoutParams(yv0Var.I.getWidth(), height, 51));
                } else {
                    yv0Var = yv0Var5;
                }
                gk gkVar = yv0Var.f;
                gkVar.bringToFront();
                uv0 uv0Var4 = yv0Var.e;
                uv0Var4.bringToFront();
                yv0Var.n.bringToFront();
                gkVar.w(false);
                Context context = yv0Var.a;
                View view2 = new View(context);
                org.telegram.ui.ActionBar.f6 f6Var = yv0Var.b;
                org.telegram.ui.Components.p70 G = org.telegram.ui.Components.p70.G(uv0Var3, f6Var, view2, true);
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll4 = (TLRPC.TL_messageMediaPoll) MessageObject.getMedia(yv0Var.E);
                yv0Var.S = MessageObject.isVoted(tL_messageMediaPoll4);
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
                ng.a aVar2 = yv0Var.D;
                if (pollAnswer2 != null) {
                    TLRPC.Poll poll = tL_messageMediaPoll4.poll;
                    boolean z18 = (poll.closed || poll.revoting_disabled) ? false : true;
                    boolean z19 = poll.multiple_choice;
                    ArrayList arrayList3 = new ArrayList();
                    TLRPC.PollResults pollResults = tL_messageMediaPoll4.results;
                    if (pollResults == null || (arrayList2 = pollResults.results) == null) {
                        tL_messageMediaPoll = tL_messageMediaPoll4;
                        z13 = z19;
                        bArr = bArr3;
                        uv0Var2 = uv0Var3;
                        pollAnswerVoters = null;
                        z14 = false;
                    } else {
                        int size2 = arrayList2.size();
                        z13 = z19;
                        int i12 = 0;
                        z14 = false;
                        TLRPC.PollAnswerVoters pollAnswerVoters2 = null;
                        while (i12 < size2) {
                            TLRPC.PollAnswerVoters pollAnswerVoters3 = arrayList2.get(i12);
                            int i13 = i12 + 1;
                            TLRPC.PollAnswerVoters pollAnswerVoters4 = pollAnswerVoters3;
                            uv0 uv0Var5 = uv0Var3;
                            boolean equals = Arrays.equals(pollAnswerVoters4.option, bArr3);
                            if (equals) {
                                pollAnswerVoters2 = pollAnswerVoters4;
                            }
                            byte[] bArr4 = bArr3;
                            if (pollAnswerVoters4.chosen) {
                                if (equals) {
                                    z14 = true;
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
                                uv0Var3 = uv0Var5;
                                i12 = i13;
                                bArr3 = bArr4;
                                tL_messageMediaPoll4 = tL_messageMediaPoll5;
                            } else {
                                uv0Var3 = uv0Var5;
                                i12 = i13;
                                bArr3 = bArr4;
                            }
                        }
                        tL_messageMediaPoll = tL_messageMediaPoll4;
                        bArr = bArr3;
                        uv0Var2 = uv0Var3;
                        pollAnswerVoters = pollAnswerVoters2;
                    }
                    if (pollAnswerVoters == null || pollAnswerVoters.voters <= 0 || !MessageObject.canShowVotersList(tL_messageMediaPoll)) {
                        yv0Var4 = yv0Var;
                        arrayList = arrayList3;
                        messageObject = primaryMessageObject;
                        uv0Var = uv0Var2;
                        bArr2 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                    } else {
                        dh.u uVar2 = new dh.u(context, znVar2.getCurrentAccount(), f6Var);
                        org.telegram.ui.Components.p70 J = G.J();
                        J.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                        qg.a k10 = rg.b.k(f6Var);
                        View view3 = J.B;
                        if (view3 != null) {
                            uVar = uVar2;
                            z17 = false;
                            pg.b c3 = aVar2.c(view3, null, false);
                            c3.n(k10);
                            view3.setBackground(c3);
                        } else {
                            uVar = uVar2;
                            z17 = false;
                        }
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new yt0(G, 25), z17);
                        J.k();
                        long dialogId = yv0Var.E.getDialogId();
                        int id2 = yv0Var.E.getId();
                        int i17 = pollAnswerVoters.voters;
                        org.telegram.ui.Components.vk vkVar = new org.telegram.ui.Components.vk(21, yv0Var, znVar2);
                        yv0Var4 = yv0Var;
                        messageObject = primaryMessageObject;
                        arrayList = arrayList3;
                        uv0Var = uv0Var2;
                        byte[] bArr5 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                        dh.u uVar3 = uVar;
                        View a2 = uVar3.a(znVar2, dialogId, id2, bArr5, i17, vkVar);
                        znVar2 = znVar2;
                        bArr2 = bArr5;
                        J.q(a2);
                        uVar3.setMinimumHeight(AndroidUtilities.dp(48.0f));
                        uVar3.setText(LocaleController.formatPluralString("PollVotesCount", pollAnswerVoters.voters, new Object[0]));
                        uVar3.a.d(pollAnswerVoters.recent_voters, false);
                        uVar3.setLayoutParams(k7.b6.n(-1, 48));
                        uVar3.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I5, false), 12, 0));
                        uVar3.setOnClickListener(new ib0(12, G, J));
                        G.q(uVar3);
                        G.k();
                    }
                    if (!z18) {
                        yv0Var2 = yv0Var4;
                        pollAnswer3 = pollAnswer2;
                        z15 = false;
                    } else if (z14) {
                        int i18 = R.drawable.msg_unvote;
                        CharSequence string = LocaleController.getString(R.string.Unvote);
                        yv0Var2 = yv0Var4;
                        zn znVar3 = znVar2;
                        TLRPC.PollAnswer pollAnswer6 = pollAnswer2;
                        Runnable qv0Var = new qv0(yv0Var2, z13, znVar3, arrayList, pollAnswer6);
                        znVar2 = znVar3;
                        pollAnswer3 = pollAnswer6;
                        z15 = false;
                        G.c(i18, string, qv0Var, false);
                    } else {
                        yv0Var2 = yv0Var4;
                        pollAnswer3 = pollAnswer2;
                        ArrayList arrayList6 = arrayList;
                        z15 = false;
                        if (dh.l.a(yv0Var2.E) == 0) {
                            G.c(R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), new qv0(yv0Var2, z13, pollAnswer3, znVar2, arrayList6), false);
                        }
                    }
                    if (znVar2.E6()) {
                        G.c(R.drawable.menu_reply, LocaleController.getString(R.string.PollItemQuote), new jf0(yv0Var2, znVar2, pollAnswer3, 21), z15);
                    }
                    int i19 = 9;
                    if (yv0Var2.E.getDialogId() >= 0 || pollAnswer3.option == null) {
                        tL_messageMediaPoll3 = tL_messageMediaPoll2;
                        z16 = false;
                    } else {
                        MessagesController messagesController = MessagesController.getInstance(yv0Var2.E.currentAccount);
                        tL_messageMediaPoll3 = tL_messageMediaPoll2;
                        String publicUsername = DialogObject.getPublicUsername(messagesController.getUserOrChat(yv0Var2.E.getDialogId()));
                        StringBuilder sb = new StringBuilder("https://");
                        sb.append(messagesController.linkPrefix);
                        sb.append("/");
                        if (TextUtils.isEmpty(publicUsername)) {
                            publicUsername = "c/" + (-yv0Var2.E.getDialogId());
                        }
                        sb.append(publicUsername);
                        sb.append("/");
                        sb.append(yv0Var2.E.getId());
                        sb.append("?option=");
                        sb.append(new String(Base64.encode(pollAnswer3.option, 9)));
                        z16 = false;
                        G.c(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new gr0(8, yv0Var2, sb.toString()), false);
                    }
                    G.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new gr0(i19, yv0Var2, pollAnswer3), z16);
                    TLRPC.Peer peer = pollAnswer3.added_by;
                    if (peer != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        long clientUserId = UserConfig.getInstance(yv0Var2.E.currentAccount).getClientUserId();
                        aVar = aVar2;
                        long currentTime = ConnectionsManager.getInstance(yv0Var2.E.currentAccount).getCurrentTime();
                        zn znVar4 = znVar2;
                        long j10 = MessagesController.getInstance(yv0Var2.E.currentAccount).config.pollAnswerDeletePeriod.get(TimeUnit.SECONDS) + pollAnswer3.date;
                        if (!yv0Var2.E.isForwarded()) {
                            TLRPC.Poll poll2 = tL_messageMediaPoll3.poll;
                            if (!poll2.closed && (poll2.creator || (peerDialogId == clientUserId && currentTime < j10))) {
                                G.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new gr0(10, yv0Var2, bArr2), true);
                            }
                        }
                        G.k();
                        TLObject userOrChat = MessagesController.getInstance(yv0Var2.E.currentAccount).getUserOrChat(peerDialogId);
                        CharSequence replaceTags = AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.PollAddedByAtTime, DialogObject.getShortName(userOrChat), LocaleController.formatDateTime(pollAnswer3.date, true)));
                        znVar2 = znVar4;
                        ov0 ov0Var = new ov0(yv0Var2, peerDialogId, znVar2, 0);
                        Context context2 = G.e;
                        FrameLayout frameLayout = new FrameLayout(context2);
                        int i20 = org.telegram.ui.ActionBar.j6.i6;
                        org.telegram.ui.ActionBar.f6 f6Var2 = G.d;
                        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(i20, f6Var2), 0, 12));
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
                        frameLayout.setOnClickListener(new org.telegram.ui.Components.w2(22, G, ov0Var));
                        G.r(frameLayout, k7.b6.n(-1, -2));
                    } else {
                        aVar = aVar2;
                    }
                } else {
                    yv0Var2 = yv0Var;
                    uv0Var = uv0Var3;
                    aVar = aVar2;
                    messageObject = primaryMessageObject;
                }
                G.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                G.Q(aVar, rg.b.k(f6Var), false);
                G.Y();
                ViewGroup viewGroup2 = G.A;
                yv0Var2.O = viewGroup2;
                viewGroup2.setPivotX(0.0f);
                yv0Var2.O.setPivotY(0.0f);
                uv0Var4.addView(yv0Var2.O, k7.b6.e(-2, -2, 51));
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                znVar2.n8(messageObject, arrayList7, arrayList8, arrayList9);
                ze zeVar2 = new ze(znVar2, 6);
                MessageObject messageObject9 = yv0Var2.E;
                List<TLRPC.TL_availableReaction> enabledReactionsList = znVar2.getMediaDataController().getEnabledReactionsList();
                boolean z20 = (znVar2.v() || znVar2.c() || znVar2.f != null || !messageObject9.hasReactions() || (ChatObject.isChannel(znVar2.e) && !znVar2.e.megagroup) || ChatObject.isMonoForum(znVar2.e) || enabledReactionsList.isEmpty() || !messageObject9.messageOwner.reactions.can_see_list || messageObject9.isSecretMedia()) ? false : true;
                if (messageObject9.isForwardedChannelPost()) {
                    messageObject2 = messageObject9;
                    TLRPC.ChatFull chatFull2 = znVar2.getMessagesController().getChatFull(-messageObject2.getFromChatId());
                    if (chatFull2 != null) {
                        if (!znVar2.v()) {
                            if (znVar2.O3 != 5) {
                                if (!znVar2.c()) {
                                    if (messageObject2.isReactionsAvailable()) {
                                        if (chatFull2.available_reactions instanceof TLRPC.TL_chatReactionsNone) {
                                        }
                                    }
                                }
                            }
                        }
                        z4 = false;
                    }
                    z4 = true;
                } else {
                    messageObject2 = messageObject9;
                    if (!messageObject2.isSecretMedia()) {
                        if (znVar2.O3 != 5) {
                            if (!znVar2.v()) {
                                if (!znVar2.c()) {
                                    if (messageObject2.isReactionsAvailable()) {
                                        TLRPC.ChatFull chatFull3 = znVar2.W7;
                                        if (chatFull3 != null) {
                                            if (chatFull3.available_reactions instanceof TLRPC.TL_chatReactionsNone) {
                                            }
                                        }
                                        if (chatFull3 == null) {
                                        }
                                        if (znVar2.f == null) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z4 = false;
                }
                boolean z21 = z4;
                if (z20 || znVar2.c() || znVar2.e == null || !messageObject2.isOutOwner() || !messageObject2.isSent() || messageObject2.isEditing() || messageObject2.isSending() || messageObject2.isSendError() || messageObject2.isContentUnread() || messageObject2.isUnread()) {
                    messageObject3 = messageObject2;
                } else {
                    messageObject3 = messageObject2;
                    if (ConnectionsManager.getInstance(znVar2.getCurrentAccount()).getCurrentTime() - messageObject3.messageOwner.date < znVar2.getMessagesController().chatReadMarkExpirePeriod && ((ChatObject.isMegagroup(znVar2.e) || !ChatObject.isChannel(znVar2.e)) && (chatFull = znVar2.W7) != null && chatFull.participants_count <= znVar2.getMessagesController().chatReadMarkSizeThreshold && !(messageObject3.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) && znVar2.O3 != 3 && messageObject3.canSetReaction() && !ChatObject.isMonoForum(znVar2.e))) {
                        z10 = true;
                        if (znVar2.e != null && !messageObject3.isOut() && ChatObject.isMonoForum(znVar2.e) && ChatObject.canManageMonoForum(znVar2.getCurrentAccount(), znVar2.e)) {
                            int i21 = ((-znVar2.e.linked_monoforum_id) > messageObject3.getFromChatId() ? 1 : ((-znVar2.e.linked_monoforum_id) == messageObject3.getFromChatId() ? 0 : -1));
                        }
                        if (!z20 && znVar2.e == null && znVar2.h == null && (user = znVar2.f) != null && !UserObject.isUserSelf(user) && !UserObject.isReplyUser(znVar2.f) && !UserObject.isAnonymous(znVar2.f)) {
                            user2 = znVar2.f;
                            if (!user2.bot && !UserObject.isService(user2.id) && (((userFull = znVar2.X7) == null || !userFull.read_dates_private) && !znVar2.c() && messageObject3.isOutOwner() && messageObject3.isSent() && !messageObject3.isEditing() && !messageObject3.isSending() && !messageObject3.isSendError() && !messageObject3.isContentUnread() && !messageObject3.isUnread() && znVar2.getConnectionsManager().getCurrentTime() - messageObject3.messageOwner.date < znVar2.getMessagesController().pmReadDateExpirePeriod && !(messageObject3.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                                z11 = true;
                                TLRPC.User user3 = znVar2.f;
                                boolean z22 = ((user3 == null && (UserObject.isReplyUser(user3) || UserObject.isAnonymous(znVar2.f))) || znVar2.c() || !messageObject3.isEdited() || (messageObject3.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                                org.telegram.ui.Components.p70 G2 = org.telegram.ui.Components.p70.G(uv0Var, znVar2.getResourceProvider(), null, !z20 || z10);
                                if (z10) {
                                    znVar = znVar2;
                                    messageObject4 = messageObject3;
                                    p70Var = G2;
                                    zeVar = zeVar2;
                                    yv0Var3 = yv0Var2;
                                    if (z11) {
                                        p70Var.r(new org.telegram.ui.Components.bc0(yv0Var3.getContext(), 0, messageObject4, new nv0(yv0Var3, 1), yv0Var3.b), k7.b6.n(-1, 36));
                                        p70Var.k();
                                    } else if (z22) {
                                        messageObject5 = messageObject4;
                                        p70Var.r(new org.telegram.ui.Components.bc0(yv0Var3.getContext(), 1, messageObject4, new nv0(yv0Var3, 2), yv0Var3.b), k7.b6.n(-1, 36));
                                        p70Var.k();
                                        size = arrayList7.size();
                                        i10 = 0;
                                        while (i10 < size) {
                                            p70Var.c(((Integer) arrayList7.get(i10)).intValue(), (CharSequence) arrayList8.get(i10), new gu0(yv0Var3, zeVar, ((Integer) arrayList9.get(i10)).intValue(), 2), false);
                                            i10++;
                                            size = size;
                                            arrayList7 = arrayList7;
                                        }
                                        p70Var.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                                        p70Var.Q(aVar, rg.b.k(f6Var), false);
                                        p70Var.Y();
                                        ViewGroup viewGroup3 = p70Var.A;
                                        yv0Var3.Q = viewGroup3;
                                        viewGroup3.setPivotX(0.0f);
                                        yv0Var3.Q.setPivotY(0.0f);
                                        uv0Var4.addView(yv0Var3.Q, k7.b6.e(-2, -2, 51));
                                        viewGroup = yv0Var3.Q;
                                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new kl0(yv0Var3, 6));
                                            yv0Var3.Q.setOnTouchListener(new g0(yv0Var3, 5));
                                        }
                                        if (z21) {
                                            zn znVar5 = znVar;
                                            org.telegram.ui.Components.pk0 pk0Var = new org.telegram.ui.Components.pk0((znVar.getUserConfig().getClientUserId() > znVar.a() ? 1 : (znVar.getUserConfig().getClientUserId() == znVar.a() ? 0 : -1)) == 0 ? 3 : 0, znVar5.getCurrentAccount(), yv0Var3.getContext(), znVar5, yv0Var3.b);
                                            pk0Var.a = true;
                                            float f10 = 22;
                                            pk0Var.setPadding(AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : 24), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 24 : 0), AndroidUtilities.dp(f10));
                                            pk0Var.setDelegate(new tv0(yv0Var3, znVar5, messageObject5, pk0Var));
                                            yv0Var3.N = pk0Var;
                                            uv0Var4.addView(pk0Var, k7.b6.e(-2, (int) ((pk0Var.getTopOffset() / AndroidUtilities.density) + 52.0f + f10), 51));
                                            z12 = true;
                                            pk0Var.p(messageObject5, znVar5.W7, true);
                                            yv0Var3.N.setTransitionProgress(1.0f);
                                        } else {
                                            z12 = true;
                                        }
                                        yv0Var3.e();
                                        yv0Var3.b0 = new wm(this, 0);
                                        yv0Var3.show();
                                        return z12;
                                    }
                                } else {
                                    yh0 yh0Var = new yh0(yv0Var2.getContext(), znVar2.getCurrentAccount(), messageObject3, znVar2.e);
                                    FrameLayout frameLayout2 = new FrameLayout(yv0Var2.getContext());
                                    frameLayout2.addView(yh0Var, k7.b6.c(36.0f, -1));
                                    org.telegram.ui.Components.p70 J2 = G2.J();
                                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, yv0Var2.getContext(), yv0Var2.b, true, false);
                                    g1Var.setItemHeight(44);
                                    yv0 yv0Var6 = yv0Var2;
                                    g1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                                    g1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                                    FrameLayout frameLayout3 = new FrameLayout(yv0Var6.getContext());
                                    messageObject4 = messageObject3;
                                    LinearLayout linearLayout = new LinearLayout(yv0Var6.getContext());
                                    linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var));
                                    linearLayout.setOrientation(1);
                                    znVar = znVar2;
                                    org.telegram.ui.Components.rl0 a10 = yh0Var.a();
                                    frameLayout3.addView(g1Var);
                                    linearLayout.addView(frameLayout3);
                                    linearLayout.addView(new org.telegram.ui.ActionBar.m1(yv0Var6.getContext(), f6Var), k7.b6.n(-1, 8));
                                    frameLayout3.setOnClickListener(new rv0(G2));
                                    zeVar = zeVar2;
                                    sv0 sv0Var = new sv0(yv0Var6, yh0Var, znVar, a10, linearLayout, G2, J2);
                                    p70Var = G2;
                                    yv0Var3 = yv0Var6;
                                    yh0Var.setOnClickListener(sv0Var);
                                    linearLayout.addView(a10, k7.b6.n(-1, -2));
                                    J2.q(linearLayout);
                                    p70Var.q(frameLayout2);
                                    p70Var.k();
                                }
                                messageObject5 = messageObject4;
                                size = arrayList7.size();
                                i10 = 0;
                                while (i10 < size) {
                                }
                                p70Var.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                                p70Var.Q(aVar, rg.b.k(f6Var), false);
                                p70Var.Y();
                                ViewGroup viewGroup32 = p70Var.A;
                                yv0Var3.Q = viewGroup32;
                                viewGroup32.setPivotX(0.0f);
                                yv0Var3.Q.setPivotY(0.0f);
                                uv0Var4.addView(yv0Var3.Q, k7.b6.e(-2, -2, 51));
                                viewGroup = yv0Var3.Q;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                }
                                if (z21) {
                                }
                                yv0Var3.e();
                                yv0Var3.b0 = new wm(this, 0);
                                yv0Var3.show();
                                return z12;
                            }
                        }
                        z11 = false;
                        TLRPC.User user32 = znVar2.f;
                        if (user32 == null) {
                        }
                        org.telegram.ui.Components.p70 G22 = org.telegram.ui.Components.p70.G(uv0Var, znVar2.getResourceProvider(), null, !z20 || z10);
                        if (z10) {
                        }
                        messageObject5 = messageObject4;
                        size = arrayList7.size();
                        i10 = 0;
                        while (i10 < size) {
                        }
                        p70Var.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                        p70Var.Q(aVar, rg.b.k(f6Var), false);
                        p70Var.Y();
                        ViewGroup viewGroup322 = p70Var.A;
                        yv0Var3.Q = viewGroup322;
                        viewGroup322.setPivotX(0.0f);
                        yv0Var3.Q.setPivotY(0.0f);
                        uv0Var4.addView(yv0Var3.Q, k7.b6.e(-2, -2, 51));
                        viewGroup = yv0Var3.Q;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z21) {
                        }
                        yv0Var3.e();
                        yv0Var3.b0 = new wm(this, 0);
                        yv0Var3.show();
                        return z12;
                    }
                }
                z10 = false;
                if (znVar2.e != null) {
                    int i212 = ((-znVar2.e.linked_monoforum_id) > messageObject3.getFromChatId() ? 1 : ((-znVar2.e.linked_monoforum_id) == messageObject3.getFromChatId() ? 0 : -1));
                }
                if (!z20) {
                    user2 = znVar2.f;
                    if (!user2.bot) {
                        z11 = true;
                        TLRPC.User user322 = znVar2.f;
                        if (user322 == null) {
                        }
                        org.telegram.ui.Components.p70 G222 = org.telegram.ui.Components.p70.G(uv0Var, znVar2.getResourceProvider(), null, !z20 || z10);
                        if (z10) {
                        }
                        messageObject5 = messageObject4;
                        size = arrayList7.size();
                        i10 = 0;
                        while (i10 < size) {
                        }
                        p70Var.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                        p70Var.Q(aVar, rg.b.k(f6Var), false);
                        p70Var.Y();
                        ViewGroup viewGroup3222 = p70Var.A;
                        yv0Var3.Q = viewGroup3222;
                        viewGroup3222.setPivotX(0.0f);
                        yv0Var3.Q.setPivotY(0.0f);
                        uv0Var4.addView(yv0Var3.Q, k7.b6.e(-2, -2, 51));
                        viewGroup = yv0Var3.Q;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z21) {
                        }
                        yv0Var3.e();
                        yv0Var3.b0 = new wm(this, 0);
                        yv0Var3.show();
                        return z12;
                    }
                }
                z11 = false;
                TLRPC.User user3222 = znVar2.f;
                if (user3222 == null) {
                }
                org.telegram.ui.Components.p70 G2222 = org.telegram.ui.Components.p70.G(uv0Var, znVar2.getResourceProvider(), null, !z20 || z10);
                if (z10) {
                }
                messageObject5 = messageObject4;
                size = arrayList7.size();
                i10 = 0;
                while (i10 < size) {
                }
                p70Var.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                p70Var.Q(aVar, rg.b.k(f6Var), false);
                p70Var.Y();
                ViewGroup viewGroup32222 = p70Var.A;
                yv0Var3.Q = viewGroup32222;
                viewGroup32222.setPivotX(0.0f);
                yv0Var3.Q.setPivotY(0.0f);
                uv0Var4.addView(yv0Var3.Q, k7.b6.e(-2, -2, 51));
                viewGroup = yv0Var3.Q;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z21) {
                }
                yv0Var3.e();
                yv0Var3.b0 = new wm(this, 0);
                yv0Var3.show();
                return z12;
            }
        }
        return false;
    }

    public final void b(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        zn znVar = this.a;
        lk lkVar = znVar.V;
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
                znVar.V.setFieldText(spannableStringBuilder);
                AndroidUtilities.runOnUIThread(new wm(this, 6), 200L);
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void b1(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z4) {
        this.a.U7(characterStyle, z4, s1Var.getMessageObject(), s1Var);
    }

    public final void c(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        zn znVar = this.a;
        lk lkVar = znVar.V;
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
                SpannableString spannableString = new SpannableString(vh.w2.k(UserObject.getFirstName(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.p51("" + user.id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            znVar.V.setFieldText(spannableStringBuilder);
            AndroidUtilities.runOnUIThread(new wm(this, 7), 200L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // org.telegram.ui.Cells.j1
    public final boolean c0(org.telegram.ui.Cells.s1 s1Var, final TLRPC.User user) {
        int i10;
        b5 b10;
        int i11;
        qk qkVar;
        pk pkVar;
        if (!l()) {
            return false;
        }
        zn znVar = this.a;
        ?? r22 = (znVar.e == null || ((qkVar = znVar.L0) != null && qkVar.getVisibility() == 0) || ((pkVar = znVar.O) != null && pkVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat = znVar.e;
        ?? r42 = (chat == null || !(znVar.a4 == 0 || znVar.e4) || (ChatObject.isChannel(chat) && !znVar.e.megagroup)) ? 0 : 1;
        h5[] h5VarArr = new h5[r22 + 2 + r42];
        h5VarArr[0] = h5.d;
        h5VarArr[1] = h5.h;
        char c3 = 2;
        if (r22 != 0) {
            h5VarArr[2] = h5.n;
            c3 = 3;
        }
        if (r42 != 0) {
            h5VarArr[c3] = h5.r;
        }
        TLRPC.UserFull userFull = znVar.getMessagesController().getUserFull(user.id);
        if (userFull != null) {
            b10 = b5.c(user, userFull, h5VarArr);
            if (!cb.m.e(b10)) {
                i11 = ((org.telegram.ui.ActionBar.p2) znVar).classGuid;
                b10 = b5.b(user, i11, h5VarArr);
            }
        } else {
            i10 = ((org.telegram.ui.ActionBar.p2) znVar).classGuid;
            b10 = b5.b(user, i10, h5VarArr);
        }
        if (cb.m.e(b10)) {
            cb.m.l().v((ViewGroup) znVar.fragmentView, znVar.ba, b10, new f7(this, s1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.p70 H = org.telegram.ui.Components.p70.H(znVar, s1Var);
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
        H.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new u1(this, s1Var, user, 25), false);
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
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new Runnable(this) { // from class: org.telegram.ui.ym
            public final /* synthetic */ ln b;

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

    @Override // org.telegram.ui.Cells.j1
    public final boolean c1(org.telegram.ui.Cells.s1 s1Var, boolean z4) {
        MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
        MessageObject messageObject = (currentMessagesGroup == null || currentMessagesGroup.messages.isEmpty()) ? s1Var.getMessageObject() : currentMessagesGroup.messages.get(0);
        if (messageObject != null) {
            zn znVar = this.a;
            boolean z10 = !znVar.gc && messageObject.getId() == znVar.fc;
            if (!z4) {
                return z10;
            }
            if (z10 && System.currentTimeMillis() - znVar.hc > 1000) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final cv0 c2() {
        return this.a.ta;
    }

    public final void d(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z4;
        String str;
        boolean z10;
        String str2;
        boolean z11;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var;
        TLRPC.User currentUser = s1Var.getCurrentUser();
        zn znVar = this.a;
        znVar.getUserConfig().getCurrentUser();
        if (!AndroidUtilities.isContextSafe(znVar.getParentActivity()) || (chat = znVar.e) == null || currentUser == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
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
                z4 = channelParticipant.promoted_by == znVar.getUserConfig().getClientUserId();
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
                    z10 = channelParticipant2.promoted_by == znVar.getUserConfig().getClientUserId();
                } else {
                    z10 = false;
                    z12 = false;
                }
                str2 = channelParticipant2.rank;
                z11 = z10;
                boolean z14 = z12;
                boolean z15 = z13;
                Activity parentActivity = znVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                long j10 = -znVar.e.id;
                f6Var = ((org.telegram.ui.ActionBar.p2) znVar).resourceProvider;
                org.telegram.ui.Components.f01.b(parentActivity, i10, j10, currentUser, str2, z14, z15, z11, f6Var);
            }
            if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                if (ChatObject.isChannel(znVar.e)) {
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                    znVar.getMessagesController();
                    tL_channels_getParticipant.channel = MessagesController.getInputChannel(znVar.e);
                    tL_channels_getParticipant.participant = znVar.getMessagesController().getInputPeer(currentUser.id);
                    znVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new org.telegram.messenger.a(), new dh.v(12, this, s1Var));
                    return;
                }
                return;
            }
            if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                z4 = false;
                z13 = true;
            } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                z4 = ((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == znVar.getUserConfig().getClientUserId();
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
        Activity parentActivity2 = znVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
        long j102 = -znVar.e.id;
        f6Var = ((org.telegram.ui.ActionBar.p2) znVar).resourceProvider;
        org.telegram.ui.Components.f01.b(parentActivity2, i10, j102, currentUser, str2, z142, z152, z11, f6Var);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void d1(org.telegram.ui.Cells.s1 s1Var) {
        zn znVar = this.a;
        znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(znVar.Q5), s1Var);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean e() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z4;
        zn znVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
        if (kVar == null) {
            return false;
        }
        kVar2 = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
        if (kVar2.s() || znVar.A9()) {
            return false;
        }
        z4 = ((org.telegram.ui.ActionBar.p2) znVar).inPreviewMode;
        return !z4;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void e1(org.telegram.ui.Cells.s1 s1Var) {
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
                        int childCount = znVar.u0.getChildCount();
                        for (int i11 = 0; i11 < childCount; i11++) {
                            View childAt = znVar.u0.getChildAt(i11);
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
        znVar.Jb(messageObject, spannableStringBuilder, 1);
        s1Var.g4(1, false, true);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean e2(long j10) {
        zn znVar = this.a;
        TLRPC.Chat chat = znVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return false;
        }
        return znVar.getMessagesController().isAdmin(znVar.e.id, j10);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean f() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void f0(int i10) {
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
                il ilVar = znVar.w3;
                if (ilVar == null) {
                    return;
                }
                ilVar.l(0L, 84, null, new wm(this, i15));
                znVar.w3.performHapticFeedback(3, 2);
                return;
            }
            if (i10 == 1) {
                String formatDateTime = LocaleController.formatDateTime(znVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                if (znVar.getMessagesController().transcribeAudioTrialCooldownUntil > 0) {
                    i12 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeftUntil", org.telegram.ui.Components.d31.h(i12), formatDateTime));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeft", org.telegram.ui.Components.d31.h(i11), new Object[0]));
                }
                org.telegram.ui.Components.qc.a0(znVar).G(R.raw.transcribe, 6, replaceTags).k(true);
                znVar.fragmentView.performHapticFeedback(3, 2);
                return;
            }
            if (i10 == 2 || i10 == 3) {
                String formatDateTime2 = LocaleController.formatDateTime(znVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(znVar);
                int i16 = R.raw.transcribe;
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialEnd", znVar.getMessagesController().transcribeAudioTrialWeeklyNumber, new Object[0]))).append((CharSequence) " ").append(i10 == 2 ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TranscriptionTrialEndBuy), new wm(this, i14)) : znVar.getMessagesController().transcribeAudioTrialCooldownUntil <= 0 ? "" : AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TranscriptionTrialEndWaitOrBuy, formatDateTime2), new wm(this, i13)));
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
    @Override // org.telegram.ui.Cells.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f2(org.telegram.ui.Cells.s1 s1Var, int i10, float f10, float f11, boolean z4) {
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
        boolean e = e();
        zn znVar = this.a;
        if (!e && !z4) {
            kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
            if ((kVar.s() || znVar.A9()) && !znVar.Z8.A(s1Var.getMessageObject())) {
                zn.b2(znVar, s1Var, !s1Var.i3(f10), f10, f11);
                return;
            }
            return;
        }
        if (UserObject.isReplyUser(znVar.f)) {
            q(s1Var);
            return;
        }
        MessageObject messageObject2 = s1Var.getMessageObject();
        if (messageObject2 == null) {
            return;
        }
        if (messageObject2.isReplyToStory() && (storyItem = (message3 = messageObject2.messageOwner).replyStory) != null) {
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                kf.k0.v(R.string.StoryNotFound, org.telegram.ui.Components.qc.a0(znVar), R.raw.story_bomb1, 36);
                return;
            }
            storyItem.dialogId = DialogObject.getPeerDialogId(message3.reply_to.peer);
            storyItem.messageId = messageObject2.getId();
            storyItem.messageType = 3;
            nh.m7.b(storyItem, znVar.f);
            znVar.getOrCreateStoryViewer().G(znVar.getParentActivity(), storyItem, nh.c7.a(znVar.u0));
            return;
        }
        TLRPC.Message message4 = messageObject2.messageOwner;
        if (message4 != null && (messageReplyHeader7 = message4.reply_to) != null && (messageReplyHeader7.flags & 2048) != 0) {
            num = Integer.valueOf(messageReplyHeader7.todo_item_id);
        } else {
            if (message4 != null && (messageReplyHeader2 = message4.reply_to) != null && (bArr = messageReplyHeader2.poll_option) != null) {
                num = null;
                str = null;
                long j11 = znVar.Q5;
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
                org.telegram.ui.Components.qc.a0(znVar).Q(R.raw.error, 36, LocaleController.getString((message5 == null && (messageReplyHeader3 = message5.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
            }
            if (message4 != null && (messageReplyHeader = message4.reply_to) != null && messageReplyHeader.quote) {
                String str3 = messageReplyHeader.quote_text;
                r9 = (messageReplyHeader.flags & 1024) != 0 ? messageReplyHeader.quote_offset : -1;
                str = str3;
                num = null;
                bArr = null;
                long j112 = znVar.Q5;
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
                            chat = j10 < 0 ? znVar.getMessagesController().getChat(Long.valueOf(-j10)) : null;
                            if (j10 != Long.MAX_VALUE) {
                                boolean z11 = z10;
                                if (j10 == znVar.Q5 || chat == null || ChatObject.isPublic(chat) || (!chat.left && !chat.kicked)) {
                                    if (((j10 == znVar.Q5 && (!ChatObject.isForum(znVar.e) || !z11)) || j10 == Long.MAX_VALUE) && (znVar.O3 != 3 || ((messageObject = messageObject2.replyMessageObject) != null && messageObject.getSavedDialogId() == znVar.d()))) {
                                        int i11 = znVar.O3;
                                        if (i11 == 2 || i11 == 1) {
                                            znVar.S8.O0(i10);
                                            znVar.finishFragment();
                                            return;
                                        }
                                        if (bArr != null) {
                                            znVar.O7 = bArr;
                                        } else if (num != null) {
                                            znVar.N7 = num;
                                        } else {
                                            TLRPC.Message message6 = messageObject2.messageOwner;
                                            if (message6 != null && (messageReplyHeader5 = message6.reply_to) != null && messageReplyHeader5.quote) {
                                                znVar.K7 = true;
                                                znVar.M7 = messageReplyHeader5.quote_text;
                                                znVar.P7 = r9;
                                                znVar.J7 = true;
                                            }
                                        }
                                        dg.f3 f3Var = new dg.f3(this, i10, messageObject2, num, bArr, 14);
                                        if (!znVar.x0.K) {
                                            f3Var.run();
                                            return;
                                        }
                                        znVar.o3 = false;
                                        znVar.lb(false, true, false);
                                        znVar.Fc(znVar.getMediaDataController().getMask(), znVar.getMediaDataController().getSearchPosition(), znVar.getMediaDataController().getSearchCount());
                                        AndroidUtilities.runOnUIThread(f3Var, 80L);
                                        return;
                                    }
                                    Integer num2 = num;
                                    byte[] bArr2 = bArr;
                                    if (LaunchActivity.D1 != null) {
                                        ze.c cVar = znVar.xb;
                                        if (cVar != null) {
                                            cVar.a(false);
                                            p2Var = null;
                                            znVar.xb = null;
                                        } else {
                                            p2Var = null;
                                        }
                                        LaunchActivity launchActivity = LaunchActivity.D1;
                                        final m0 m0Var = new m0(this, messageObject2, s1Var);
                                        znVar.xb = m0Var;
                                        int id2 = messageObject2.getId();
                                        ArrayList arrayList = launchActivity.a0;
                                        if (j10 < 0 && (chat2 = MessagesController.getInstance(launchActivity.L).getChat(Long.valueOf(-j10))) != null && ChatObject.isForum(chat2)) {
                                            m0Var.d();
                                            final int i12 = 0;
                                            launchActivity.k0(j10, Integer.valueOf(i10), str2, num2, bArr2, new Runnable() { // from class: org.telegram.ui.e90
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i13 = i12;
                                                    m0 m0Var2 = m0Var;
                                                    switch (i13) {
                                                        case 0:
                                                            Pattern pattern = LaunchActivity.y1;
                                                            m0Var2.c(false);
                                                            break;
                                                        default:
                                                            Pattern pattern2 = LaunchActivity.y1;
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
                                            TLRPC.Chat chat3 = MessagesController.getInstance(launchActivity.L).getChat(Long.valueOf(j12));
                                            if (chat3 != null && chat3.forum) {
                                                final int i14 = 1;
                                                launchActivity.k0(j10, Integer.valueOf(i10), str4, num2, bArr2, new Runnable() { // from class: org.telegram.ui.e90
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i132 = i14;
                                                        m0 m0Var2 = m0Var;
                                                        switch (i132) {
                                                            case 0:
                                                                Pattern pattern = LaunchActivity.y1;
                                                                m0Var2.c(false);
                                                                break;
                                                            default:
                                                                Pattern pattern2 = LaunchActivity.y1;
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
                                        org.telegram.ui.ActionBar.p2 p2Var2 = !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.p2) kf.k0.i(1, arrayList) : p2Var;
                                        if (p2Var2 == null || MessagesController.getInstance(launchActivity.L).checkCanOpenChat(bundle, p2Var2)) {
                                            AndroidUtilities.runOnUIThread(new d90(launchActivity, bundle, bArr2, i10, num2, str4, i13, j10, m0Var, p2Var2));
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
                                org.telegram.ui.Components.qc.a0(znVar).Q(R.raw.error, 36, LocaleController.getString((message52 == null && (messageReplyHeader3 = message52.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
                            } else {
                                messageObject2.replyTextRevealed = true;
                                znVar.qc(messageObject2, true);
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
                    org.telegram.ui.Components.qc.a0(znVar).Q(R.raw.error, 36, LocaleController.getString((message522 == null && (messageReplyHeader3 = message522.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
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
                org.telegram.ui.Components.qc.a0(znVar).Q(R.raw.error, 36, LocaleController.getString((message5222 == null && (messageReplyHeader3 = message5222.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
            }
            num = null;
        }
        bArr = null;
        str = null;
        long j1122 = znVar.Q5;
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
        org.telegram.ui.Components.qc.a0(znVar).Q(R.raw.error, 36, LocaleController.getString((message52222 == null && (messageReplyHeader3 = message52222.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
    }

    @Override // org.telegram.ui.Cells.j1
    public final String g(org.telegram.ui.Cells.s1 s1Var) {
        zn znVar;
        int i10;
        if (s1Var.getMessageObject() == null || (i10 = (znVar = this.a).tb) == 0 || i10 != s1Var.getMessageObject().getId() || znVar.ub != 3) {
            return null;
        }
        return znVar.wb;
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean g0() {
        return this.a.O3 == 0;
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
    @Override // org.telegram.ui.Cells.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g2(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        vd1 vd1Var;
        TLRPC.TodoItem todoItem2;
        TLRPC.TodoCompletion todoCompletion;
        vd1 vd1Var2;
        MessageObject messageObject;
        vd1 vd1Var3;
        int i10;
        MessageObject messageObject2;
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        ze zeVar;
        MessageObject messageObject3;
        boolean z13;
        ArrayList arrayList;
        ArrayList arrayList2;
        yd1 yd1Var;
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
        ph.f3 f3Var = znVar2.u1;
        if (f3Var != null && f3Var.S) {
            f3Var.e(true);
        }
        xl xlVar = znVar2.y1;
        if (xlVar != null && xlVar.S) {
            xlVar.e(true);
        }
        MessageObject primaryMessageObject = s1Var.getPrimaryMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(primaryMessageObject);
        if (primaryMessageObject == null || !(media instanceof TLRPC.TL_messageMediaToDo)) {
            return false;
        }
        znVar2.a5 = primaryMessageObject;
        znVar2.b5 = null;
        final yd1 yd1Var2 = new yd1(znVar2.getParentActivity(), znVar2.getResourceProvider());
        final int i12 = todoItem.id;
        yd1Var2.H = s1Var;
        yd1Var2.L = i12;
        MessageObject messageObject5 = s1Var.getMessageObject();
        yd1Var2.D = messageObject5;
        yd1Var2.E = messageObject5 != null && messageObject5.isOutOwner();
        org.telegram.ui.Cells.s1 s1Var2 = yd1Var2.H;
        vd1 vd1Var4 = yd1Var2.c;
        if (s1Var2 != null) {
            yd1Var2.I = znVar2.p9 - AndroidUtilities.dp(4.0f);
            yd1Var2.J = s1Var.n;
            if (s1Var.getParent() instanceof View) {
                View view = (View) s1Var.getParent();
                yd1Var2.I = view.getY() + yd1Var2.I;
                yd1Var2.J = view.getY() + yd1Var2.J;
            }
            int width = yd1Var2.H.getWidth();
            int height = yd1Var2.H.getHeight();
            yd1Var2.H.getHeight();
            vd1Var = vd1Var4;
            wd1 wd1Var = new wd1(yd1Var2, yd1Var2.getContext(), UserConfig.selectedAccount, yd1Var2.H.getResourcesProvider(), i12, width, height);
            yd1Var2.F = wd1Var;
            yd1Var2.H.h1(wd1Var);
            yd1Var2.F.i1(yd1Var2.H);
            yd1Var2.F.setDelegate(new xd1(yd1Var2));
            wd1 wd1Var2 = yd1Var2.F;
            MessageObject messageObject6 = yd1Var2.D;
            MessageObject.GroupedMessages currentMessagesGroup = yd1Var2.H.getCurrentMessagesGroup();
            org.telegram.ui.Cells.s1 s1Var3 = yd1Var2.H;
            wd1Var2.X3(messageObject6, currentMessagesGroup, s1Var3.C, s1Var3.B, s1Var3.D, false);
            vd1Var.addView(yd1Var2.F, new FrameLayout.LayoutParams(yd1Var2.H.getWidth(), height, 51));
            xv0 xv0Var = new xv0(yd1Var2.getContext(), UserConfig.selectedAccount, yd1Var2.H.getResourcesProvider(), width, height, 1);
            yd1Var2.G = xv0Var;
            yd1Var2.H.j1(xv0Var);
            yd1Var2.H.h1(yd1Var2.G);
            yd1Var2.G.i1(yd1Var2.H);
            yd1Var2.G.setDelegate(new db.a(18));
            xv0 xv0Var2 = yd1Var2.G;
            MessageObject messageObject7 = yd1Var2.D;
            MessageObject.GroupedMessages currentMessagesGroup2 = yd1Var2.H.getCurrentMessagesGroup();
            org.telegram.ui.Cells.s1 s1Var4 = yd1Var2.H;
            xv0Var2.X3(messageObject7, currentMessagesGroup2, s1Var4.C, s1Var4.B, s1Var4.D, false);
            vd1Var.addView(yd1Var2.G, new FrameLayout.LayoutParams(yd1Var2.H.getWidth(), height, 51));
        } else {
            vd1Var = vd1Var4;
        }
        gk gkVar = yd1Var2.e;
        gkVar.bringToFront();
        vd1 vd1Var5 = yd1Var2.d;
        vd1Var5.bringToFront();
        yd1Var2.h.bringToFront();
        gkVar.w(false);
        org.telegram.ui.ActionBar.f6 f6Var = yd1Var2.a;
        org.telegram.ui.Components.p70 F = org.telegram.ui.Components.p70.F(vd1Var, f6Var, null);
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) MessageObject.getMedia(yd1Var2.D);
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
        if (!yd1Var2.D.canCompleteTodo()) {
            vd1Var2 = vd1Var5;
        } else if (todoCompletion != null) {
            vd1Var2 = vd1Var5;
            F.p(14, -1, LocaleController.formatTodoCompletedDate(todoCompletion.date));
            F.k();
            final int i15 = 1;
            F.c(R.drawable.msg_cancel, LocaleController.getString(R.string.TodoUncheck), new Runnable() { // from class: org.telegram.ui.qd1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            zn znVar3 = znVar2;
                            mv0 mv0Var = new mv0(znVar3);
                            yd1 yd1Var3 = yd1Var2;
                            mv0Var.p0(MessageObject.getMedia(yd1Var3.D), false, i12);
                            mv0Var.b0 = new vl0(23, yd1Var3, znVar3);
                            znVar3.presentFragment(mv0Var);
                            yd1Var3.c(false);
                            break;
                        case 1:
                            boolean c3 = znVar2.c();
                            yd1 yd1Var4 = yd1Var2;
                            if (c3) {
                                Toast.makeText(yd1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                wd1 wd1Var3 = yd1Var4.F;
                                wd1Var3.k4(wd1Var3.O2(i12), false);
                            }
                            yd1Var4.c(true);
                            break;
                        default:
                            boolean c10 = znVar2.c();
                            yd1 yd1Var5 = yd1Var2;
                            if (c10) {
                                Toast.makeText(yd1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                wd1 wd1Var4 = yd1Var5.F;
                                wd1Var4.k4(wd1Var4.O2(i12), false);
                            }
                            yd1Var5.c(true);
                            break;
                    }
                }
            }, false);
        } else {
            vd1Var2 = vd1Var5;
            final int i16 = 2;
            F.c(R.drawable.msg_select, LocaleController.getString(R.string.TodoCheck), new Runnable() { // from class: org.telegram.ui.qd1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i16) {
                        case 0:
                            zn znVar3 = znVar2;
                            mv0 mv0Var = new mv0(znVar3);
                            yd1 yd1Var3 = yd1Var2;
                            mv0Var.p0(MessageObject.getMedia(yd1Var3.D), false, i12);
                            mv0Var.b0 = new vl0(23, yd1Var3, znVar3);
                            znVar3.presentFragment(mv0Var);
                            yd1Var3.c(false);
                            break;
                        case 1:
                            boolean c3 = znVar2.c();
                            yd1 yd1Var4 = yd1Var2;
                            if (c3) {
                                Toast.makeText(yd1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                wd1 wd1Var3 = yd1Var4.F;
                                wd1Var3.k4(wd1Var3.O2(i12), false);
                            }
                            yd1Var4.c(true);
                            break;
                        default:
                            boolean c10 = znVar2.c();
                            yd1 yd1Var5 = yd1Var2;
                            if (c10) {
                                Toast.makeText(yd1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                wd1 wd1Var4 = yd1Var5.F;
                                wd1Var4.k4(wd1Var4.O2(i12), false);
                            }
                            yd1Var5.c(true);
                            break;
                    }
                }
            }, false);
        }
        if (todoItem2 != null) {
            F.c(R.drawable.menu_reply, LocaleController.getString(R.string.TodoItemQuote), new ld1(yd1Var2, znVar2, todoItem2, 2), false);
            if (yd1Var2.D.getDialogId() < 0) {
                MessagesController messagesController = MessagesController.getInstance(yd1Var2.D.currentAccount);
                String publicUsername = DialogObject.getPublicUsername(messagesController.getUserOrChat(yd1Var2.D.getDialogId()));
                StringBuilder sb = new StringBuilder("https://");
                sb.append(messagesController.linkPrefix);
                sb.append("/");
                if (TextUtils.isEmpty(publicUsername)) {
                    StringBuilder sb2 = new StringBuilder("c/");
                    messageObject = primaryMessageObject;
                    vd1Var3 = vd1Var2;
                    sb2.append(-yd1Var2.D.getDialogId());
                    publicUsername = sb2.toString();
                } else {
                    messageObject = primaryMessageObject;
                    vd1Var3 = vd1Var2;
                }
                sb.append(publicUsername);
                sb.append("/");
                sb.append(yd1Var2.D.getId());
                sb.append("?task=");
                sb.append(todoItem2.id);
                F.c(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new b11(21, yd1Var2, sb.toString()), false);
            } else {
                messageObject = primaryMessageObject;
                vd1Var3 = vd1Var2;
            }
            F.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new b11(22, yd1Var2, todoItem2), false);
        } else {
            messageObject = primaryMessageObject;
            vd1Var3 = vd1Var2;
        }
        if (yd1Var2.D.canEditMessage(znVar2.e)) {
            final int i17 = 0;
            F.c(R.drawable.msg_edit, LocaleController.getString(R.string.TodoEditItem), new Runnable() { // from class: org.telegram.ui.qd1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i17) {
                        case 0:
                            zn znVar3 = znVar2;
                            mv0 mv0Var = new mv0(znVar3);
                            yd1 yd1Var3 = yd1Var2;
                            mv0Var.p0(MessageObject.getMedia(yd1Var3.D), false, i13);
                            mv0Var.b0 = new vl0(23, yd1Var3, znVar3);
                            znVar3.presentFragment(mv0Var);
                            yd1Var3.c(false);
                            break;
                        case 1:
                            boolean c3 = znVar2.c();
                            yd1 yd1Var4 = yd1Var2;
                            if (c3) {
                                Toast.makeText(yd1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                wd1 wd1Var3 = yd1Var4.F;
                                wd1Var3.k4(wd1Var3.O2(i13), false);
                            }
                            yd1Var4.c(true);
                            break;
                        default:
                            boolean c10 = znVar2.c();
                            yd1 yd1Var5 = yd1Var2;
                            if (c10) {
                                Toast.makeText(yd1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                wd1 wd1Var4 = yd1Var5.F;
                                wd1Var4.k4(wd1Var4.O2(i13), false);
                            }
                            yd1Var5.c(true);
                            break;
                    }
                }
            }, false);
            if (tL_messageMediaToDo.todo.list.size() > 1) {
                i10 = 51;
                F.c(R.drawable.msg_delete, LocaleController.getString(R.string.TodoDeleteItem), new et(yd1Var2, tL_messageMediaToDo, i12, znVar2, 10), false);
                F.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                qg.d k10 = rg.b.k(f6Var);
                ng.a aVar = yd1Var2.C;
                F.Q(aVar, k10, false);
                F.Y();
                ViewGroup viewGroup2 = F.A;
                yd1Var2.N = viewGroup2;
                viewGroup2.setPivotX(0.0f);
                yd1Var2.N.setPivotY(0.0f);
                vd1Var3.addView(yd1Var2.N, k7.b6.e(-2, -2, i10));
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                znVar2.n8(messageObject, arrayList4, arrayList5, arrayList6);
                ze zeVar2 = new ze(znVar2, 7);
                messageObject2 = yd1Var2.D;
                List<TLRPC.TL_availableReaction> enabledReactionsList = znVar2.getMediaDataController().getEnabledReactionsList();
                boolean z14 = znVar2.v() && !znVar2.c() && znVar2.f == null && messageObject2.hasReactions() && !((ChatObject.isChannel(znVar2.e) && !znVar2.e.megagroup) || ChatObject.isMonoForum(znVar2.e) || enabledReactionsList.isEmpty() || !messageObject2.messageOwner.reactions.can_see_list || messageObject2.isSecretMedia());
                if (messageObject2.isForwardedChannelPost()) {
                    z4 = z14;
                    if (!messageObject2.isSecretMedia()) {
                        if (znVar2.O3 != 5) {
                            if (!znVar2.v()) {
                                if (!znVar2.c()) {
                                    if (messageObject2.isReactionsAvailable()) {
                                        TLRPC.ChatFull chatFull2 = znVar2.W7;
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
                    z10 = false;
                } else {
                    z4 = z14;
                    TLRPC.ChatFull chatFull3 = znVar2.getMessagesController().getChatFull(-messageObject2.getFromChatId());
                    if (chatFull3 != null) {
                        if (!znVar2.v()) {
                            if (znVar2.O3 != 5) {
                                if (!znVar2.c()) {
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
                z11 = (!z4 || znVar2.c() || znVar2.e == null || !messageObject2.isOutOwner() || !messageObject2.isSent() || messageObject2.isEditing() || messageObject2.isSending() || messageObject2.isSendError() || messageObject2.isContentUnread() || messageObject2.isUnread() || ConnectionsManager.getInstance(znVar2.getCurrentAccount()).getCurrentTime() - messageObject2.messageOwner.date >= znVar2.getMessagesController().chatReadMarkExpirePeriod || (!ChatObject.isMegagroup(znVar2.e) && ChatObject.isChannel(znVar2.e)) || (chatFull = znVar2.W7) == null || chatFull.participants_count > znVar2.getMessagesController().chatReadMarkSizeThreshold || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || znVar2.O3 == 3 || !messageObject2.canSetReaction() || ChatObject.isMonoForum(znVar2.e)) ? false : true;
                if (znVar2.e != null && !messageObject2.isOut() && ChatObject.isMonoForum(znVar2.e) && ChatObject.canManageMonoForum(znVar2.getCurrentAccount(), znVar2.e)) {
                    int i18 = ((-znVar2.e.linked_monoforum_id) > messageObject2.getFromChatId() ? 1 : ((-znVar2.e.linked_monoforum_id) == messageObject2.getFromChatId() ? 0 : -1));
                }
                if (!z4 && znVar2.e == null && znVar2.h == null && (user = znVar2.f) != null && !UserObject.isUserSelf(user) && !UserObject.isReplyUser(znVar2.f) && !UserObject.isAnonymous(znVar2.f)) {
                    user2 = znVar2.f;
                    if (!user2.bot && !UserObject.isService(user2.id) && (((userFull = znVar2.X7) == null || !userFull.read_dates_private) && !znVar2.c() && messageObject2.isOutOwner() && messageObject2.isSent() && !messageObject2.isEditing() && !messageObject2.isSending() && !messageObject2.isSendError() && !messageObject2.isContentUnread() && !messageObject2.isUnread() && znVar2.getConnectionsManager().getCurrentTime() - messageObject2.messageOwner.date < znVar2.getMessagesController().pmReadDateExpirePeriod && !(messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                        z12 = true;
                        TLRPC.User user3 = znVar2.f;
                        boolean z16 = ((user3 == null && (UserObject.isReplyUser(user3) || UserObject.isAnonymous(znVar2.f))) || znVar2.c() || !messageObject2.isEdited() || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                        org.telegram.ui.Components.p70 G = org.telegram.ui.Components.p70.G(yd1Var2.c, znVar2.getResourceProvider(), null, !z4 || z11);
                        if (z11) {
                            zeVar = zeVar2;
                            messageObject3 = messageObject2;
                            z13 = z15;
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            yd1Var = yd1Var2;
                            arrayList3 = arrayList6;
                            znVar = znVar2;
                            if (z12) {
                                G.r(new org.telegram.ui.Components.bc0(yd1Var.getContext(), 0, messageObject3, new pd1(yd1Var, 0), yd1Var.a), k7.b6.n(-1, 36));
                                G.k();
                            } else if (z16) {
                                messageObject4 = messageObject3;
                                G.r(new org.telegram.ui.Components.bc0(yd1Var.getContext(), 1, messageObject3, new pd1(yd1Var, 2), yd1Var.a), k7.b6.n(-1, 36));
                                G.k();
                                i11 = 0;
                                for (size = arrayList.size(); i11 < size; size = size) {
                                    G.c(((Integer) arrayList.get(i11)).intValue(), (CharSequence) arrayList2.get(i11), new gu0(yd1Var, zeVar, ((Integer) arrayList3.get(i11)).intValue(), 7), false);
                                    i11++;
                                    arrayList3 = arrayList3;
                                }
                                G.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                                G.Q(aVar, rg.b.k(f6Var), false);
                                G.Y();
                                ViewGroup viewGroup3 = G.A;
                                yd1Var.P = viewGroup3;
                                viewGroup3.setPivotX(0.0f);
                                yd1Var.P.setPivotY(0.0f);
                                ViewGroup viewGroup4 = yd1Var.P;
                                FrameLayout.LayoutParams e = k7.b6.e(-2, -2, 51);
                                vd1 vd1Var6 = yd1Var.d;
                                vd1Var6.addView(viewGroup4, e);
                                viewGroup = yd1Var.P;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new kl0(yd1Var, 22));
                                    yd1Var.P.setOnTouchListener(new g0(yd1Var, 7));
                                }
                                if (z13) {
                                    zn znVar3 = znVar;
                                    org.telegram.ui.Components.pk0 pk0Var = new org.telegram.ui.Components.pk0((znVar.getUserConfig().getClientUserId() > znVar.a() ? 1 : (znVar.getUserConfig().getClientUserId() == znVar.a() ? 0 : -1)) == 0 ? 3 : 0, znVar3.getCurrentAccount(), yd1Var.getContext(), znVar3, yd1Var.a);
                                    pk0Var.a = true;
                                    float f10 = 22;
                                    pk0Var.setPadding(AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : 24), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 24 : 0), AndroidUtilities.dp(f10));
                                    pk0Var.setDelegate(new ud1(yd1Var, znVar3, messageObject4, pk0Var));
                                    yd1Var.M = pk0Var;
                                    vd1Var6.addView(pk0Var, k7.b6.e(-2, (int) ((pk0Var.getTopOffset() / AndroidUtilities.density) + 52.0f + f10), 51));
                                    pk0Var.p(messageObject4, znVar3.W7, true);
                                    yd1Var.M.setTransitionProgress(1.0f);
                                }
                                yd1Var.e();
                                yd1Var.Z = new wm(this, 5);
                                yd1Var.show();
                                return true;
                            }
                        } else {
                            yh0 yh0Var = new yh0(yd1Var2.getContext(), znVar2.getCurrentAccount(), messageObject2, znVar2.e);
                            FrameLayout frameLayout = new FrameLayout(yd1Var2.getContext());
                            frameLayout.addView(yh0Var, k7.b6.c(36.0f, -1));
                            org.telegram.ui.Components.p70 J = G.J();
                            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, yd1Var2.getContext(), yd1Var2.a, true, false);
                            g1Var.setItemHeight(44);
                            g1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                            g1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                            FrameLayout frameLayout2 = new FrameLayout(yd1Var2.getContext());
                            LinearLayout linearLayout = new LinearLayout(yd1Var2.getContext());
                            linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var));
                            linearLayout.setOrientation(1);
                            znVar = znVar2;
                            org.telegram.ui.Components.rl0 a2 = yh0Var.a();
                            frameLayout2.addView(g1Var);
                            linearLayout.addView(frameLayout2);
                            z13 = z15;
                            linearLayout.addView(new org.telegram.ui.ActionBar.m1(yd1Var2.getContext(), f6Var), k7.b6.n(-1, 8));
                            frameLayout2.setOnClickListener(new sd1(G));
                            messageObject3 = messageObject2;
                            zeVar = zeVar2;
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            td1 td1Var = new td1(yd1Var2, yh0Var, znVar, a2, linearLayout, G, J);
                            G = G;
                            yd1Var = yd1Var2;
                            yh0Var.setOnClickListener(td1Var);
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
                        G.Q(aVar, rg.b.k(f6Var), false);
                        G.Y();
                        ViewGroup viewGroup32 = G.A;
                        yd1Var.P = viewGroup32;
                        viewGroup32.setPivotX(0.0f);
                        yd1Var.P.setPivotY(0.0f);
                        ViewGroup viewGroup42 = yd1Var.P;
                        FrameLayout.LayoutParams e6 = k7.b6.e(-2, -2, 51);
                        vd1 vd1Var62 = yd1Var.d;
                        vd1Var62.addView(viewGroup42, e6);
                        viewGroup = yd1Var.P;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z13) {
                        }
                        yd1Var.e();
                        yd1Var.Z = new wm(this, 5);
                        yd1Var.show();
                        return true;
                    }
                }
                z12 = false;
                TLRPC.User user32 = znVar2.f;
                if (user32 == null) {
                }
                org.telegram.ui.Components.p70 G2 = org.telegram.ui.Components.p70.G(yd1Var2.c, znVar2.getResourceProvider(), null, !z4 || z11);
                if (z11) {
                }
                messageObject4 = messageObject3;
                i11 = 0;
                while (i11 < size) {
                }
                G2.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                G2.Q(aVar, rg.b.k(f6Var), false);
                G2.Y();
                ViewGroup viewGroup322 = G2.A;
                yd1Var.P = viewGroup322;
                viewGroup322.setPivotX(0.0f);
                yd1Var.P.setPivotY(0.0f);
                ViewGroup viewGroup422 = yd1Var.P;
                FrameLayout.LayoutParams e62 = k7.b6.e(-2, -2, 51);
                vd1 vd1Var622 = yd1Var.d;
                vd1Var622.addView(viewGroup422, e62);
                viewGroup = yd1Var.P;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z13) {
                }
                yd1Var.e();
                yd1Var.Z = new wm(this, 5);
                yd1Var.show();
                return true;
            }
        }
        i10 = 51;
        F.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
        qg.d k102 = rg.b.k(f6Var);
        ng.a aVar2 = yd1Var2.C;
        F.Q(aVar2, k102, false);
        F.Y();
        ViewGroup viewGroup22 = F.A;
        yd1Var2.N = viewGroup22;
        viewGroup22.setPivotX(0.0f);
        yd1Var2.N.setPivotY(0.0f);
        vd1Var3.addView(yd1Var2.N, k7.b6.e(-2, -2, i10));
        ArrayList arrayList42 = new ArrayList();
        ArrayList arrayList52 = new ArrayList();
        ArrayList arrayList62 = new ArrayList();
        znVar2.n8(messageObject, arrayList42, arrayList52, arrayList62);
        ze zeVar22 = new ze(znVar2, 7);
        messageObject2 = yd1Var2.D;
        List<TLRPC.TL_availableReaction> enabledReactionsList2 = znVar2.getMediaDataController().getEnabledReactionsList();
        if (znVar2.v()) {
        }
        if (messageObject2.isForwardedChannelPost()) {
        }
        boolean z152 = z10;
        if (!z4) {
        }
        if (znVar2.e != null) {
            int i182 = ((-znVar2.e.linked_monoforum_id) > messageObject2.getFromChatId() ? 1 : ((-znVar2.e.linked_monoforum_id) == messageObject2.getFromChatId() ? 0 : -1));
        }
        if (!z4) {
            user2 = znVar2.f;
            if (!user2.bot) {
                z12 = true;
                TLRPC.User user322 = znVar2.f;
                if (user322 == null) {
                }
                org.telegram.ui.Components.p70 G22 = org.telegram.ui.Components.p70.G(yd1Var2.c, znVar2.getResourceProvider(), null, !z4 || z11);
                if (z11) {
                }
                messageObject4 = messageObject3;
                i11 = 0;
                while (i11 < size) {
                }
                G22.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
                G22.Q(aVar2, rg.b.k(f6Var), false);
                G22.Y();
                ViewGroup viewGroup3222 = G22.A;
                yd1Var.P = viewGroup3222;
                viewGroup3222.setPivotX(0.0f);
                yd1Var.P.setPivotY(0.0f);
                ViewGroup viewGroup4222 = yd1Var.P;
                FrameLayout.LayoutParams e622 = k7.b6.e(-2, -2, 51);
                vd1 vd1Var6222 = yd1Var.d;
                vd1Var6222.addView(viewGroup4222, e622);
                viewGroup = yd1Var.P;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z13) {
                }
                yd1Var.e();
                yd1Var.Z = new wm(this, 5);
                yd1Var.show();
                return true;
            }
        }
        z12 = false;
        TLRPC.User user3222 = znVar2.f;
        if (user3222 == null) {
        }
        org.telegram.ui.Components.p70 G222 = org.telegram.ui.Components.p70.G(yd1Var2.c, znVar2.getResourceProvider(), null, !z4 || z11);
        if (z11) {
        }
        messageObject4 = messageObject3;
        i11 = 0;
        while (i11 < size) {
        }
        G222.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var)));
        G222.Q(aVar2, rg.b.k(f6Var), false);
        G222.Y();
        ViewGroup viewGroup32222 = G222.A;
        yd1Var.P = viewGroup32222;
        viewGroup32222.setPivotX(0.0f);
        yd1Var.P.setPivotY(0.0f);
        ViewGroup viewGroup42222 = yd1Var.P;
        FrameLayout.LayoutParams e6222 = k7.b6.e(-2, -2, 51);
        vd1 vd1Var62222 = yd1Var.d;
        vd1Var62222.addView(viewGroup42222, e6222);
        viewGroup = yd1Var.P;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
        }
        if (z13) {
        }
        yd1Var.e();
        yd1Var.Z = new wm(this, 5);
        yd1Var.show();
        return true;
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
        zn znVar = this.a;
        if (isHuaweiStoreApp) {
            ze.d.s(znVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            ze.d.s(znVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean h1(int i10, org.telegram.ui.Cells.s1 s1Var) {
        zn znVar = this.a;
        return znVar.tb != 0 && s1Var.getMessageObject() != null && znVar.tb == s1Var.getMessageObject().getId() && znVar.ub == i10;
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
        int a2 = dh.l.a(messageObject);
        boolean a10 = k7.w8.a(a2, 7);
        zn znVar = this.a;
        if (a10) {
            org.telegram.ui.Components.qc.a0(znVar).Q(R.raw.e_hand_2, 36, dh.l.b(messageObject, a2)).j();
            return;
        }
        if (i10 < 0 && !arrayList.isEmpty()) {
            znVar.getSendMessagesHelper().sendVote(messageObject, arrayList, null);
            s1Var.S0(true);
            return;
        }
        if (znVar.getParentActivity() == null) {
            return;
        }
        if (znVar.k2 == null) {
            org.telegram.ui.Components.l40 l40Var = new org.telegram.ui.Components.l40(5, znVar.getParentActivity(), znVar.ba, false);
            znVar.k2 = l40Var;
            l40Var.setAlpha(0.0f);
            znVar.k2.setVisibility(4);
            int indexOfChild = znVar.U0.indexOfChild(znVar.P);
            if (indexOfChild == -1) {
                return;
            } else {
                znVar.U0.addView(znVar.k2, indexOfChild + 1, k7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            }
        }
        if (!arrayList.isEmpty() || i10 >= 0) {
            i13 = i12;
            i14 = i11;
        } else {
            ArrayList<org.telegram.ui.Cells.q1> pollButtons = s1Var.getPollButtons();
            int size = pollButtons.size();
            int i16 = 0;
            float f10 = 0.0f;
            while (true) {
                if (i16 >= size) {
                    i13 = i12;
                    i15 = i11;
                    break;
                }
                org.telegram.ui.Cells.q1 q1Var = pollButtons.get(i16);
                float y10 = ((s1Var.getY() + q1Var.b) - AndroidUtilities.dp(4.0f)) - znVar.p9;
                znVar.n2 = AndroidUtilities.dp(13.3f) + q1Var.a;
                int C = b.C(6.0f, q1Var.b, i12);
                znVar.o2 = C;
                if (y10 > 0.0f) {
                    i15 = znVar.n2;
                    i13 = C;
                    f10 = 0.0f;
                    break;
                }
                i16++;
                f10 = y10;
            }
            if (f10 != 0.0f) {
                znVar.u0.v0(0, (int) f10, null);
                znVar.m2 = s1Var;
                return;
            }
            i14 = i15;
        }
        znVar.k2.e(s1Var, Integer.valueOf(i10), i14, i13, true);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void i0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
        this.a.I7(s1Var, true, false, f10, f11, false, false, false);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void j() {
        h();
    }

    @Override // org.telegram.ui.Cells.j1
    public final void j2(org.telegram.ui.Cells.s1 s1Var) {
        TLRPC.Chat chat;
        TLRPC.User currentUser = s1Var.getCurrentUser();
        zn znVar = this.a;
        if (!AndroidUtilities.isContextSafe(znVar.getParentActivity()) || (chat = znVar.e) == null || currentUser == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return;
        }
        d(s1Var, znVar.getMessagesController().getParticipant(znVar.e.id, currentUser.id));
    }

    public final void k(org.telegram.ui.Cells.s1 s1Var, boolean z4, boolean z10, boolean z11) {
        MessageObject primaryMessageObject;
        int i10;
        int i11;
        vj vjVar;
        if (s1Var == null || (primaryMessageObject = s1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.forceUpdate = true;
        zn znVar = this.a;
        sj sjVar = znVar.u0;
        if (sjVar != null && (vjVar = znVar.w0) != null && vjVar.y < 0) {
            for (int childCount = sjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = znVar.u0.getChildAt(childCount);
                znVar.u0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.s1)) {
                        if (childAt instanceof org.telegram.ui.Cells.v0) {
                            i11 = znVar.L8(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.s1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = znVar.L8(childAt);
                            break;
                        }
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        if (z4 && i10 >= 0 && s1Var.getCurrentMessagesGroup() == null) {
            if (z11) {
                vj vjVar2 = znVar.w0;
                znVar.u0.getClass();
                vjVar2.i1(RecyclerView.R(s1Var), s1Var.getTop() - ((int) znVar.p9), false);
            } else {
                znVar.w0.h1(i10, i11);
            }
        }
        znVar.K0 = z10;
        znVar.rc(primaryMessageObject, false);
        znVar.K0 = false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final int k0(org.telegram.ui.Cells.s1 s1Var) {
        dh.f fVar;
        zn znVar = this.a;
        if (!znVar.tc.f || (fVar = znVar.zc) == null || fVar.n != s1Var || fVar.a.getWidth() <= 0) {
            return 0;
        }
        return znVar.zc.a.getHeight();
    }

    public final boolean l() {
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

    @Override // org.telegram.ui.Cells.j1
    public final void l0(org.telegram.ui.Cells.s1 s1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        zn znVar = this.a;
        if (znVar.getParentActivity() == null) {
            return;
        }
        if (znVar.U9 == null) {
            hh.k kVar = new hh.k(znVar.getParentActivity());
            znVar.U9 = kVar;
            znVar.U0.addView(kVar, k7.b6.e(-1, -1, 48));
        }
        hh.k kVar2 = znVar.U9;
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
        String b10 = hh.k.b(s1Var);
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
        hh.j jVar = new hh.j(kVar2, s1Var, arrayList4, new ff.c(12, kVar2, b10));
        jVar.setBounds(0, 0, kVar2.getMeasuredWidth(), kVar2.getMeasuredHeight());
        jVar.setCallback(kVar2);
        if (hashMap.containsKey(b10)) {
            return;
        }
        hashMap.put(b10, jVar);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void l2(org.telegram.ui.Cells.s1 s1Var, long j10) {
        Bundle g10 = kf.k0.g(j10, "user_id");
        org.telegram.ui.ActionBar.p2 p2Var = this.a;
        if (p2Var.getMessagesController().checkCanOpenChat(g10, p2Var, s1Var.getMessageObject())) {
            p2Var.presentFragment(new zn(g10));
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void m(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
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
        MessageObject messageObject = s1Var.getMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if (messageMedia == null || messageObject == null || !(media instanceof TLRPC.TL_messageMediaPoll)) {
            return;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media;
        TLRPC.WebPage webPage = messageMedia.webpage;
        if (webPage != null) {
            R1(s1Var, webPage, webPage.url, messageMedia.safe);
            return;
        }
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        zn znVar = this.a;
        if (geoPoint != null) {
            if (AndroidUtilities.isMapsInstalled(znVar)) {
                in inVar = new in(3);
                f6Var2 = ((org.telegram.ui.ActionBar.p2) znVar).resourceProvider;
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
                inVar.L0 = false;
                inVar.u0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                znVar.presentFragment(inVar);
                return;
            }
            return;
        }
        if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
            rt.q().w(znVar.getParentActivity());
            rt.q().v(new jn(this, tL_messageMediaPoll, pollAnswer, s1Var));
            rt q10 = rt.q();
            TLRPC.Document document4 = messageMedia.document;
            int i18 = MessageObject.isAnimatedEmoji(document4) ? 2 : 0;
            MessageObject messageObject2 = s1Var.getMessageObject();
            f6Var = ((org.telegram.ui.ActionBar.p2) znVar).resourceProvider;
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
            TLRPC.TL_message C7 = zn.C7(message);
            C7.media = messageMedia;
            C7.attachPath = dh.i.c(message, i10);
            ArrayList<MessageObject> arrayList = new ArrayList<>();
            i17 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
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
            i15 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
            TLRPC.Document document6 = messageMedia.document;
            dh.a aVar = new dh.a(i15, messageObject, document6, dh.i.c(messageObject.messageOwner, i10));
            if (aVar.g) {
                FileLoader.getInstance(i15).cancelLoadFile(document6);
                aVar.a();
                MessageObject messageObject4 = s1Var.v7;
                if (messageObject4 == null || !messageObject4.isPoll()) {
                    return;
                }
                dh.j jVar = s1Var.Z5;
                if (jVar != null) {
                    jVar.e();
                }
                dh.j jVar2 = s1Var.Y5;
                if (jVar2 != null) {
                    jVar2.e();
                    return;
                }
                return;
            }
            if (!aVar.f) {
                FileLoader.getInstance(i15).loadFile(document6, messageObject, 2, 0);
                aVar.a();
                MessageObject messageObject5 = s1Var.v7;
                if (messageObject5 == null || !messageObject5.isPoll()) {
                    return;
                }
                dh.j jVar3 = s1Var.Z5;
                if (jVar3 != null) {
                    jVar3.e();
                }
                dh.j jVar4 = s1Var.Y5;
                if (jVar4 != null) {
                    jVar4.e();
                    return;
                }
                return;
            }
            TLRPC.Message message2 = messageObject.messageOwner;
            TLRPC.TL_message C72 = zn.C7(message2);
            C72.media = messageMedia;
            C72.attachPath = dh.i.c(message2, i10);
            i16 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
            kn knVar = new kn(i16, C72, false, true);
            if (MessageObject.canPreviewDocument(messageMedia.document)) {
                PhotoViewer.t1().K2(null, znVar, znVar.ba);
                PhotoViewer t12 = PhotoViewer.t1();
                int i19 = knVar.type;
                t12.c2(knVar, znVar, i19 != 0 ? znVar.Q5 : 0L, i19 != 0 ? znVar.I6 : 0L, i19 != 0 ? znVar.d() : 0L, znVar.Ca);
                return;
            }
            try {
                AndroidUtilities.openForView(knVar, znVar.getParentActivity(), znVar.ba, false);
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
            C73.attachPath = dh.i.c(message3, -2);
            i14 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
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
            C74.attachPath = dh.i.c(message3, -3);
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            C74.message = pollResults2.solution;
            C74.entities = pollResults2.solution_entities;
            i13 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
            arrayList3.add(new cn(i13, C74, false, true));
            arrayList2.add(-3);
        }
        lf.d.b(tL_messageMediaPoll.poll, znVar.getUserConfig().getClientUserId());
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
                C75.attachPath = dh.i.c(message3, pollAnswer2.unshuffled_index);
                i12 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                arrayList3.add(new dn(i12, C75, false, true));
                arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
            }
        }
        if (i11 <= -1 || arrayList3.isEmpty()) {
            return;
        }
        messageObject.pollMediaMapping = arrayList2;
        PhotoViewer.t1().K2(null, znVar, znVar.ba);
        PhotoViewer.t1().a2(arrayList3, i11, znVar.a(), 0L, 0L, znVar.Da);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean m1(MessageObject messageObject) {
        lm lmVar;
        long dialogId = messageObject.getDialogId();
        zn znVar = this.a;
        return (dialogId == UserObject.REPLY_BOT || ((lmVar = znVar.x0) != null && lmVar.K)) && znVar.O3 != 7;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void n(org.telegram.ui.Cells.s1 s1Var) {
        if (s1Var.getMessageObject().isImportedForward()) {
            p1();
            return;
        }
        zn znVar = this.a;
        if (znVar.i3 || znVar.u0 == null || znVar.getParentActivity() == null || znVar.fragmentView == null) {
            return;
        }
        if (znVar.r2 == null) {
            rm rmVar = znVar.U0;
            int indexOfChild = rmVar.indexOfChild(znVar.P);
            if (indexOfChild == -1) {
                return;
            }
            org.telegram.ui.Components.l40 l40Var = new org.telegram.ui.Components.l40(1, znVar.getParentActivity(), znVar.ba, false);
            znVar.r2 = l40Var;
            rmVar.addView(l40Var, indexOfChild + 1, k7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            znVar.r2.setAlpha(0.0f);
            znVar.r2.setVisibility(4);
        }
        znVar.r2.e(s1Var, null, 0, 0, true);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void o() {
        this.a.U0.getClass();
    }

    public final void p(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, boolean z4) {
        zn znVar = this.a;
        TLRPC.Chat chat2 = znVar.e;
        if (chat2 != null && chat.id == chat2.id) {
            nj njVar = znVar.X0;
            if (njVar != null && i10 == 0) {
                njVar.e(false, false);
                return;
            } else {
                if (s1Var.getMessageObject() != null) {
                    znVar.j(i10, s1Var.getMessageObject().getId(), true, 0, false, 0);
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
            yi yiVar = null;
            if (z4) {
                ze.c cVar = znVar.xb;
                if (cVar != null) {
                    cVar.a(true);
                    znVar.xb = null;
                }
                if (s1Var.getMessageObject() == null) {
                    znVar.xb = null;
                } else {
                    yi yiVar2 = new yi(znVar, s1Var.getMessageObject().getId(), s1Var, 0);
                    znVar.xb = yiVar2;
                    yiVar = yiVar2;
                }
            }
            if (znVar.getMessagesController().checkCanOpenChat(bundle, znVar, s1Var.getMessageObject(), yiVar)) {
                zn znVar2 = new zn(bundle);
                if (yiVar == null || i10 == 0) {
                    znVar.presentFragment(znVar2);
                } else {
                    AndroidUtilities.runOnUIThread(new dg.f3(this, yiVar, chat, i10, znVar2, 13), 5000L);
                    yiVar.d();
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean p0() {
        boolean z4;
        zn znVar = this.a;
        if (znVar.A9()) {
            return false;
        }
        z4 = ((org.telegram.ui.ActionBar.p2) znVar).inPreviewMode;
        return !z4;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void p1() {
        zn znVar = this.a;
        znVar.Q7();
        UndoView undoView = znVar.v3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, znVar.Q5, null);
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
    public final void q(org.telegram.ui.Cells.s1 s1Var) {
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
        zn znVar = this.a;
        if (znVar.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.w21 w21Var = znVar.O1;
        if (w21Var != null && znVar.a4 == 0 && (s1Var.Q7 || s1Var.R7)) {
            w21Var.m(s1Var.getMessageObject().getTopicId(), true);
            return;
        }
        if (znVar.getMessagesController().isFrozen()) {
            i13 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
            c.b(i13);
            return;
        }
        lk lkVar = znVar.V;
        if (lkVar != null) {
            lkVar.P();
        }
        MessageObject messageObject = s1Var.getMessageObject();
        int i14 = znVar.O3;
        if (i14 == 2) {
            znVar.S8.O0(messageObject.getId());
            znVar.finishFragment();
            return;
        }
        if (i14 == 3 || ((i14 == 7 && znVar.L3 == 2) || !((!UserObject.isReplyUser(znVar.f) && !UserObject.isUserSelf(znVar.f)) || (messageFwdHeader = messageObject.messageOwner.fwd_from) == null || messageFwdHeader.saved_from_peer == null))) {
            if (UserObject.isReplyUser(znVar.f) && (messageReplyHeader = (message = messageObject.messageOwner).reply_to) != null && (i10 = messageReplyHeader.reply_to_top_id) != 0) {
                znVar.aa(messageReplyHeader.reply_to_peer_id.channel_id, null, i10, 0L, -1, message.fwd_from.saved_from_msg_id, messageObject);
                return;
            } else if (znVar.O3 == 7 && znVar.L3 == 2) {
                znVar.fa(messageObject);
                return;
            } else {
                znVar.ga(messageObject);
                return;
            }
        }
        ArrayList<MessageObject> arrayList = (messageObject.getGroupId() == 0 || (groupedMessages = (MessageObject.GroupedMessages) znVar.u6.f(messageObject.getGroupId())) == null) ? null : groupedMessages.messages;
        if (arrayList == null) {
            arrayList = org.telegram.messenger.y3.m(messageObject);
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
                z4 = true;
                znVar.showDialog(new fn(this, znVar.getParentActivity(), znVar, arrayList, ChatObject.isChannel(znVar.e), z4, znVar.ba, z4, messageObject));
                Activity parentActivity = znVar.getParentActivity();
                i11 = ((org.telegram.ui.ActionBar.p2) znVar).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
                znVar.fragmentView.requestLayout();
            }
        }
        z4 = false;
        znVar.showDialog(new fn(this, znVar.getParentActivity(), znVar, arrayList, ChatObject.isChannel(znVar.e), z4, znVar.ba, z4, messageObject));
        Activity parentActivity2 = znVar.getParentActivity();
        i11 = ((org.telegram.ui.ActionBar.p2) znVar).classGuid;
        AndroidUtilities.setAdjustResizeToNothing(parentActivity2, i11);
        znVar.fragmentView.requestLayout();
    }

    public final void r(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            org.telegram.ui.ActionBar.p2 p2Var = this.a;
            if (p2Var.getMessagesController().checkCanOpenChat(bundle, p2Var, s1Var.getMessageObject())) {
                p2Var.presentFragment(new zn(bundle));
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void r1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        zn znVar = this.a;
        if (znVar.z9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) lf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        if (znVar.getParentActivity() != null) {
            if (znVar.L0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || lf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || lf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || lf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || lf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || lf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || lf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || lf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || lf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                lk lkVar = znVar.V;
                MessageObject messageObject = s1Var.getMessageObject();
                MessageObject messageObject2 = s1Var.getMessageObject();
                xi xiVar = null;
                String str = tL_inlineButtonTypeUrl != null ? tL_inlineButtonTypeUrl.url : null;
                ze.c cVar = znVar.xb;
                if (cVar != null) {
                    cVar.a(true);
                    znVar.xb = null;
                }
                if (str == null || s1Var.getMessageObject() == null) {
                    znVar.xb = null;
                } else {
                    xi xiVar2 = new xi(znVar, s1Var.getMessageObject().getId(), str, s1Var, 1);
                    znVar.xb = xiVar2;
                    xiVar = xiVar2;
                }
                lkVar.c0(keyboardButtonProto, messageObject, messageObject2, xiVar);
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean r2(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        MessageObject messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (s1Var == null || pageBlock == null) {
            return false;
        }
        zn znVar = this.a;
        if (znVar.getParentActivity() == null || (messageObject = s1Var.getMessageObject()) == null || (message = messageObject.messageOwner) == null || messageObject.richLayout == null || (richMessage = message.rich_message) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        messageObject.richLayout.collectMediaBlocks(arrayList);
        int indexOf = arrayList.indexOf(pageBlock);
        if (indexOf < 0) {
            return false;
        }
        PhotoViewer t12 = PhotoViewer.t1();
        t12.K2(null, znVar, null);
        return t12.e2(null, null, null, null, null, null, null, indexOf, new um(znVar, arrayList), null, 0L, 0L, 0L, true, new tm(richMessage, arrayList, messageObject), null);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void s() {
        this.a.Yb();
    }

    @Override // org.telegram.ui.Cells.j1
    public final void s0(String str) {
        zn znVar = this.a;
        qk qkVar = znVar.L0;
        if (qkVar == null || qkVar.getVisibility() != 0) {
            pk pkVar = znVar.O;
            if ((pkVar == null || pkVar.getVisibility() != 0) && znVar.V != null && str != null && str.length() > 0) {
                znVar.V.setFieldText("@" + str + " ");
                znVar.V.H0();
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void s2(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject primaryMessageObject = s1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.a.rc(primaryMessageObject, false);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void t(org.telegram.ui.Cells.s1 s1Var) {
        int i10;
        int i11;
        vj vjVar;
        MessageObject primaryMessageObject = s1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        primaryMessageObject.factCheckExpanded = !primaryMessageObject.factCheckExpanded;
        primaryMessageObject.forceUpdate = true;
        zn znVar = this.a;
        sj sjVar = znVar.u0;
        if (sjVar != null && (vjVar = znVar.w0) != null && vjVar.y < 0) {
            for (int childCount = sjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = znVar.u0.getChildAt(childCount);
                znVar.u0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.s1)) {
                        if (childAt instanceof org.telegram.ui.Cells.v0) {
                            i11 = znVar.L8(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.s1) childAt).getCurrentMessagesGroup() == null) {
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
        ph.f3 f3Var = znVar.x1;
        if (f3Var != null) {
            f3Var.e(true);
        }
        if (i10 < 0 || s1Var.getCurrentMessagesGroup() != null) {
            return;
        }
        znVar.w0.h1(i10, i11);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean t0(org.telegram.ui.Components.u5 u5Var) {
        TLRPC.InputStickerSet inputStickerSet;
        int i10;
        zn znVar = this.a;
        if (znVar.getMessagesController().premiumFeaturesBlocked() || u5Var == null || u5Var.standard) {
            return false;
        }
        long documentId = u5Var.getDocumentId();
        TLRPC.Document document = u5Var.document;
        if (document == null) {
            i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
            document = org.telegram.ui.Components.l5.f(i10, documentId);
        }
        if (document == null || (inputStickerSet = MessageObject.getInputStickerSet(document)) == null) {
            return false;
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, true);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(inputStickerSet);
        org.telegram.ui.Components.lv lvVar = new org.telegram.ui.Components.lv(znVar, znVar.getParentActivity(), znVar.ba, arrayList);
        org.telegram.ui.Components.bv bvVar = lvVar.f;
        bvVar.getClass();
        ImageReceiver imageReceiver = new ImageReceiver(bvVar);
        bvVar.v = imageReceiver;
        if (bvVar.d) {
            imageReceiver.onAttachedToWindow();
        }
        bvVar.w = true;
        bvVar.x.d(1.0f, true);
        bvVar.v.setImage(ImageLocation.getForDocument(document), "140_140", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "140_140", DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.m6, 0.2f, true), 0L, null, null, 0);
        bvVar.v.setLayerNum(7);
        bvVar.v.setAllowStartLottieAnimation(true);
        bvVar.v.setAllowStartAnimation(true);
        bvVar.v.setAutoRepeat(1);
        bvVar.v.setAllowDecodeSingleFrame(true);
        bvVar.v.setParentView(bvVar);
        lvVar.setCalcMandatoryInsets(znVar.x9());
        znVar.showDialog(lvVar);
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void u(org.telegram.ui.Cells.s1 s1Var) {
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
        zn znVar = this.a;
        znVar.aa(znVar.e.id, messageObject, messageObject.getId(), j11, i10, 0, null);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void u1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
        if (s1Var == null || document == null) {
            return;
        }
        zn znVar = this.a;
        if (znVar.getParentLayout() == null || !a0(s1Var)) {
            return;
        }
        org.telegram.ui.Components.p70 H = org.telegram.ui.Components.p70.H(znVar, s1Var);
        H.c(R.drawable.msg_download, LocaleController.getString(R.string.SaveToDownloads), new u1(this, s1Var, document, 24), false);
        H.t = false;
        H.Z();
    }

    public final void v(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            bundle.putBoolean("expandPhoto", false);
            this.a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void v0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
        zn znVar = this.a;
        znVar.I7(s1Var, false, false, f10, f11, true, false, false);
        znVar.u0.getClass();
        zn.c2(znVar, RecyclerView.R(s1Var));
    }

    @Override // org.telegram.ui.Cells.j1
    public final void v2() {
        this.a.r9();
    }

    @Override // org.telegram.ui.Cells.j1
    public final String w(long j10) {
        TLRPC.Peer peer;
        String adminRank;
        zn znVar = this.a;
        if (UserObject.isBotForum(znVar.f)) {
            return null;
        }
        TLRPC.Chat chat = znVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat) && (adminRank = znVar.getMessagesController().getAdminRank(znVar.e.id, j10)) != null) {
            return adminRank;
        }
        TLRPC.TL_forumTopic tL_forumTopic = znVar.Z3;
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
        zn znVar = this.a;
        TLRPC.User user2 = znVar.f;
        if (user2 != null && user2.id == user.id) {
            i11 = 1;
        }
        profileActivity.N4(i11);
        Activity parentActivity = znVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.p2) znVar).classGuid;
        AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
        znVar.presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void x2(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
        this.a.W7(s1Var, reactionCount, z4, f10, f11);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void y(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject == null || messageObject.type != 27) {
            return;
        }
        messageObject.toggleChannelRecommendations();
        messageObject.forceUpdate = true;
        s1Var.t2();
        s1Var.requestLayout();
        this.a.x0.R(messageObject, false, false);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void y0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f10, float f11) {
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
        boolean z4 = true;
        if (kVar.s() || znVar.A9()) {
            zn.b2(znVar, s1Var, true, f10, f11);
            return;
        }
        if (s1Var.getMessageObject() != null && s1Var.getMessageObject().isSponsored()) {
            U0(10, s1Var);
            return;
        }
        if (!ChatObject.isForum(znVar.e) && !znVar.F9()) {
            z4 = false;
        }
        x(user, z4);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void z1(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
        hh.j jVar;
        hh.k kVar = this.a.U9;
        if (kVar == null || (jVar = (hh.j) kVar.a.get(hh.k.b(s1Var))) == null) {
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

    @Override // org.telegram.ui.Cells.j1
    public final boolean z2(int i10) {
        boolean z4;
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        if (i10 != 16 && i10 != R.id.acc_action_small_button && i10 != R.id.acc_action_msg_options) {
            return false;
        }
        zn znVar = this.a;
        z4 = ((org.telegram.ui.ActionBar.p2) znVar).inPreviewMode;
        if (!z4 || !znVar.G9) {
            return !e();
        }
        e5Var = ((org.telegram.ui.ActionBar.p2) znVar).parentLayout;
        if (e5Var != null) {
            e5Var2 = ((org.telegram.ui.ActionBar.p2) znVar).parentLayout;
            ((ActionBarLayout) e5Var2).r();
        }
        return true;
    }
}
