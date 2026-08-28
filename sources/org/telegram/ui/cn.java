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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.SecretMediaViewer;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class cn implements org.telegram.ui.Cells.k1 {
    public final /* synthetic */ qn a;

    public cn(qn qnVar) {
        this.a = qnVar;
    }

    public static void a(cn cnVar, org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
        int i9;
        qn qnVar = cnVar.a;
        if (qnVar.getParentActivity() == null || document == null) {
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23 && ((i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && qnVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
            qnVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
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
        int i11 = tL_message.flags;
        tL_message.flags = i11 | 512;
        if (tL_message.from_id != null) {
            tL_message.flags = i11 | 768;
        }
        ArrayList arrayList = new ArrayList();
        i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
        arrayList.add(new MessageObject(i9, tL_message, false, true));
        MediaController.saveFilesFromMessages(qnVar.getParentActivity(), qnVar.getAccountInstance(), arrayList, new qa(cnVar, 1));
    }

    @Override // org.telegram.ui.Cells.k1
    public final void A0(org.telegram.ui.Cells.t1 t1Var) {
        yg.c cVar = this.a.yc;
        if (cVar == null || cVar.n != t1Var) {
            return;
        }
        cVar.w.getClass();
    }

    @Override // org.telegram.ui.Cells.k1
    public final void A1(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        qn qnVar = this.a;
        qnVar.Z4 = messageObject;
        qnVar.d9();
    }

    @Override // org.telegram.ui.Cells.k1
    public final void B0() {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        org.telegram.ui.Components.x5 animation;
        qn qnVar = this.a;
        if (qnVar.h3 || SharedConfig.noSoundHintShowed || qnVar.t0 == null || qnVar.getParentActivity() == null || qnVar.fragmentView == null) {
            return;
        }
        org.telegram.ui.Components.s30 s30Var = qnVar.p2;
        if (s30Var == null || s30Var.getTag() == null) {
            if (qnVar.p2 == null) {
                im imVar = qnVar.T0;
                int indexOfChild = imVar.indexOfChild(qnVar.O);
                if (indexOfChild == -1) {
                    return;
                }
                org.telegram.ui.Components.s30 s30Var2 = new org.telegram.ui.Components.s30(0, qnVar.getParentActivity(), qnVar.aa, false);
                qnVar.p2 = s30Var2;
                s30Var2.setShowingDuration(10000L);
                imVar.addView(qnVar.p2, indexOfChild + 1, g7.e6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                qnVar.p2.setAlpha(0.0f);
                qnVar.p2.setVisibility(4);
            }
            int childCount = qnVar.t0.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = qnVar.t0.getChildAt(i9);
                if ((childAt instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject.isVideo() && (animation = t1Var.getPhotoImage().getAnimation()) != null && animation.o() >= 3000 && qnVar.p2.e(t1Var, null, 0, 0, true)) {
                    SharedConfig.setNoSoundHintShowed(true);
                    return;
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final String C(long j10) {
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
        TLRPC.TL_forumTopic tL_forumTopic = qnVar.Y3;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || !(peer.user_id == j10 || peer.channel_id == j10 || peer.chat_id == j10)) {
            return null;
        }
        return LocaleController.getString(R.string.TopicCreator);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void C1(MessageObject messageObject) {
        this.a.s.put(messageObject, Boolean.TRUE);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void D0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        qn qnVar = this.a;
        if (qnVar.getParentActivity() == null || tLObject == null) {
            return;
        }
        b5Var = ((org.telegram.ui.ActionBar.o2) qnVar).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.o2) qnVar).parentLayout;
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
            qnVar.presentFragment(new qn(bundle));
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, qnVar.getParentActivity(), qnVar.getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(qnVar.getThemedColor(org.telegram.ui.ActionBar.f6.G8));
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(qnVar.getParentActivity(), false, false);
        g1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
        g1Var.setMinimumWidth(160);
        g1Var.setOnClickListener(new a(this, 14));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(qnVar.getParentActivity(), false, false);
        g1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
        g1Var2.setMinimumWidth(160);
        g1Var2.setOnClickListener(new b0(this, (TLRPC.Chat) tLObject, t1Var, 7));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
        qn qnVar2 = new qn(bundle);
        qnVar2.F9 = true;
        qnVar.presentFragmentAsPreviewWithMenu(qnVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
        qnVar.d7();
    }

    @Override // org.telegram.ui.Cells.k1
    public final void D1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        Uri parse;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        boolean z11 = (z10 || !ve.e.h(str, false, false)) ? z10 : true;
        qn qnVar = this.a;
        ve.d dVar = qnVar.wb;
        if (dVar != null) {
            dVar.a(true);
        }
        qnVar.wb = t1Var.getMessageObject() == null ? null : new ym(this, t1Var);
        if (z11 || ve.e.f(parse, false, null)) {
            ve.e.r(qnVar.getParentActivity(), parse, true, true, false, qnVar.wb, null, false, true, false);
        } else {
            org.telegram.ui.Components.y4.r0(qnVar, str, true, true, true, !z11, qnVar.wb, webPage, qnVar.aa);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void E0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
        MessageObject messageObject = t1Var.getMessageObject();
        int i9 = messageObject.type;
        qn qnVar = this.a;
        if (i9 != 16) {
            qnVar.I7(t1Var, true, false, f10, f11, messageObject.isMusic(), false, false);
            return;
        }
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        int i10 = 0;
        if (!(messageAction instanceof TLRPC.TL_messageActionConferenceCall)) {
            TLRPC.User user = qnVar.f;
            if (user != null) {
                boolean isVideoCall = messageObject.isVideoCall();
                TLRPC.UserFull userFull = qnVar.W7;
                org.telegram.ui.Components.voip.e2.n(user, isVideoCall, userFull != null && userFull.video_calls_available, qnVar.getParentActivity(), qnVar.getMessagesController().getUserFull(qnVar.f.id), qnVar.getAccountInstance());
                return;
            }
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(Long.valueOf(qnVar.a()));
        ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
        int size = arrayList.size();
        while (i10 < size) {
            TLRPC.Peer peer = arrayList.get(i10);
            i10++;
            hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(peer)));
        }
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = messageObject.getId();
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(qnVar.getParentActivity(), 3, null);
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = qnVar.getMessagesController().conferenceCallSizeLimit;
        c2Var.setOnCancelListener(new gh.x(this, qnVar.getConnectionsManager().sendRequest(getgroupcall, new bg.h0(this, c2Var, hashSet, tL_inputGroupCallInviteMessage, messageObject, 7)), 2));
        c2Var.q(600L);
    }

    @Override // org.telegram.ui.Cells.k1
    public final CharacterStyle E1(org.telegram.ui.Cells.t1 t1Var) {
        qn qnVar;
        int i9;
        if (t1Var.getMessageObject() == null || (i9 = (qnVar = this.a).sb) == 0 || i9 != t1Var.getMessageObject().getId() || qnVar.tb != 1) {
            return null;
        }
        return qnVar.ub;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void F(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject == null || messageObject.type != 27) {
            return;
        }
        messageObject.toggleChannelRecommendations();
        messageObject.forceUpdate = true;
        t1Var.t2();
        t1Var.requestLayout();
        this.a.w0.R(messageObject, false, false);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void F0(org.telegram.ui.Cells.t1 t1Var) {
        g(t1Var, true, false, true);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void F1(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10) {
        try {
            qn qnVar = this.a;
            org.telegram.ui.Components.gu.I(qnVar, messageObject, qnVar.Ba, str2, str3, str4, str, i9, i10, -1, qnVar.x9());
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void G0(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject;
        if (t1Var == null || (messageObject = t1Var.getMessageObject()) == null || messageObject.messageOwner == null) {
            return;
        }
        int id2 = messageObject.getId();
        qn qnVar = this.a;
        if (qnVar.sb == id2 && qnVar.tb == 7) {
            return;
        }
        TLRPC.InputPeer inputPeer = qnVar.getMessagesController().getInputPeer(messageObject.getDialogId());
        if (inputPeer == null) {
            return;
        }
        TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
        getrichmessage.peer = inputPeer;
        getrichmessage.id = id2;
        ve.d dVar = qnVar.wb;
        if (dVar != null) {
            dVar.a(true);
            qnVar.wb = null;
        }
        int[] iArr = new int[1];
        oi oiVar = new oi(qnVar, id2, t1Var, 2);
        oiVar.b = new rd(6, qnVar, iArr);
        qnVar.wb = oiVar;
        oiVar.d();
        iArr[0] = qnVar.getConnectionsManager().sendRequestTyped(getrichmessage, new org.telegram.messenger.a(), new bg(qnVar, oiVar, iArr, t1Var, messageObject));
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean G1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        ViewGroup viewGroup;
        int i9;
        b41 b41Var;
        if (messageObject.isVoiceOnce() || messageObject.isRoundOnce()) {
            d41 d41Var = this.a.V9;
            if (d41Var == null || d41Var.X) {
                try {
                    AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!messageObject.isOutOwner()) {
                            org.telegram.ui.Components.oc.a0(this.a).w(R.drawable.tooltip_sound, LocaleController.getString(R.string.VoiceOnceTurnOnSound)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.a.V9 = new d41(this.a.getParentActivity());
                d41 d41Var2 = this.a.V9;
                me fb2 = !messageObject.isOutOwner() ? this.a.fb(messageObject, true) : null;
                e5.w O4 = !messageObject.isOutOwner() ? qn.O4(this.a, messageObject) : null;
                Context context = d41Var2.a;
                fh.v vVar = d41Var2.c;
                d41Var2.T = fb2;
                d41Var2.U = O4;
                b41 b41Var2 = d41Var2.J;
                if (b41Var2 != null) {
                    vVar.removeView(b41Var2);
                    d41Var2.J = null;
                }
                d41Var2.K = t1Var;
                MessageObject messageObject2 = t1Var.getMessageObject();
                d41Var2.I = messageObject2;
                d41Var2.O = messageObject2 != null && messageObject2.isRoundVideo();
                org.telegram.ui.Cells.t1 t1Var2 = d41Var2.K;
                d41Var2.H = t1Var2 != null ? t1Var2.getResourcesProvider() : null;
                if (d41Var2.K != null) {
                    d41Var2.P = 0.0f;
                    d41Var2.Q = t1Var.n;
                    if (t1Var.getParent() instanceof View) {
                        View view = (View) t1Var.getParent();
                        d41Var2.P = view.getY() + d41Var2.P;
                        d41Var2.Q = view.getY() + d41Var2.Q;
                    }
                    int width = d41Var2.K.getWidth();
                    int height = d41Var2.K.getHeight();
                    if (d41Var2.O) {
                        height = Math.min(AndroidUtilities.dp(360.0f), Math.min(width, AndroidUtilities.displaySize.y));
                    }
                    int i10 = height;
                    d41Var2.G = i10 - d41Var2.K.getHeight();
                    i9 = (int) Math.ceil((Math.min(width, i10) * 0.92f) / AndroidUtilities.density);
                    viewGroup = vVar;
                    b41 b41Var3 = new b41(d41Var2, d41Var2.getContext(), UserConfig.selectedAccount, d41Var2.K.getResourcesProvider(), width, i10);
                    d41Var2.J = b41Var3;
                    d41Var2.K.j1(b41Var3);
                    d41Var2.J.i1(d41Var2.K);
                    d41Var2.J.setDelegate(new ya.b(19));
                    b41 b41Var4 = d41Var2.J;
                    MessageObject messageObject3 = d41Var2.I;
                    MessageObject.GroupedMessages currentMessagesGroup = d41Var2.K.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.t1 t1Var3 = d41Var2.K;
                    b41Var4.X3(messageObject3, currentMessagesGroup, t1Var3.B, t1Var3.A, false, false);
                    if (!d41Var2.O) {
                        org.telegram.ui.Components.d8 d8Var = new org.telegram.ui.Components.d8();
                        d41Var2.R = d8Var;
                        b41 b41Var5 = d41Var2.J;
                        d8Var.i = b41Var5;
                        b41Var5.ae = d8Var;
                        if (b41Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.rn0 seekBarWaveform = d41Var2.J.getSeekBarWaveform();
                            seekBarWaveform.L = d41Var2.s;
                            org.telegram.ui.Cells.t1 t1Var4 = seekBarWaveform.n;
                            if (t1Var4 != null) {
                                t1Var4.invalidate();
                            }
                        }
                    }
                    d41Var2.D = false;
                    viewGroup.addView(d41Var2.J, new FrameLayout.LayoutParams(d41Var2.K.getWidth(), i10, 17));
                } else {
                    viewGroup = vVar;
                    i9 = 360;
                }
                TextureView textureView = d41Var2.L;
                if (textureView != null) {
                    viewGroup.removeView(textureView);
                    d41Var2.L = null;
                }
                if (d41Var2.O) {
                    d41Var2.M = false;
                    TextureView textureView2 = new TextureView(context);
                    d41Var2.L = textureView2;
                    viewGroup.addView(textureView2, 0, g7.e6.c(i9, i9));
                }
                MediaController.getInstance().pauseByRewind();
                org.telegram.ui.Components.k61 k61Var = d41Var2.w;
                if (k61Var != null) {
                    k61Var.C();
                    d41Var2.w.I();
                    d41Var2.w = null;
                }
                org.telegram.ui.Cells.t1 t1Var5 = d41Var2.K;
                if (t1Var5 != null && t1Var5.getMessageObject() != null) {
                    File pathToAttach = FileLoader.getInstance(d41Var2.K.getMessageObject().currentAccount).getPathToAttach(d41Var2.K.getMessageObject().getDocument());
                    if (pathToAttach != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && (pathToAttach = FileLoader.getInstance(d41Var2.K.getMessageObject().currentAccount).getPathToMessage(d41Var2.K.getMessageObject().messageOwner)) != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && d41Var2.K.getMessageObject().messageOwner.attachPath != null) {
                        pathToAttach = new File(d41Var2.K.getMessageObject().messageOwner.attachPath);
                    }
                    if (pathToAttach != null && pathToAttach.exists()) {
                        org.telegram.ui.Components.k61 k61Var2 = new org.telegram.ui.Components.k61();
                        d41Var2.w = k61Var2;
                        k61Var2.F = new c41(d41Var2);
                        if (d41Var2.R != null) {
                            k61Var2.G = new c41(d41Var2);
                        }
                        if (d41Var2.O) {
                            k61Var2.W(d41Var2.L);
                        }
                        d41Var2.w.E(Uri.fromFile(pathToAttach), "other");
                        d41Var2.w.D();
                        org.telegram.ui.Components.ws wsVar = d41Var2.A;
                        if (wsVar != null) {
                            wsVar.s = d41Var2.w;
                            wsVar.a();
                        }
                    }
                    qn qnVar = this.a;
                    qnVar.showDialog(qnVar.V9);
                    return false;
                }
                kh.x3 x3Var = d41Var2.x;
                if (x3Var != null) {
                    viewGroup.removeView(x3Var);
                    d41Var2.x = null;
                }
                MessageObject messageObject4 = d41Var2.I;
                boolean z10 = messageObject4 != null && messageObject4.isOutOwner();
                MessageObject messageObject5 = d41Var2.I;
                if (messageObject5 != null && messageObject5.getDialogId() != UserConfig.getInstance(d41Var2.I.currentAccount).getClientUserId()) {
                    kh.x3 x3Var2 = new kh.x3(context, 3);
                    d41Var2.x = x3Var2;
                    x3Var2.q(true);
                    if (z10) {
                        long dialogId = d41Var2.I.getDialogId();
                        String str = "";
                        if (dialogId > 0) {
                            TLRPC.User user = MessagesController.getInstance(d41Var2.I.currentAccount).getUser(Long.valueOf(dialogId));
                            if (user != null) {
                                str = UserObject.getFirstName(user);
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(d41Var2.I.currentAccount).getChat(Long.valueOf(-dialogId));
                            if (chat != null) {
                                str = chat.title;
                            }
                        }
                        d41Var2.x.t(AndroidUtilities.replaceTags(LocaleController.formatString(d41Var2.O ? R.string.VideoOnceOutHint : R.string.VoiceOnceOutHint, str)));
                    } else {
                        d41Var2.x.t(AndroidUtilities.replaceTags(LocaleController.getString(d41Var2.O ? R.string.VideoOnceHint : R.string.VoiceOnceHint)));
                    }
                    d41Var2.x.r(12.0f);
                    d41Var2.x.setPadding(AndroidUtilities.dp((z10 || d41Var2.K.B) ? 0.0f : 6.0f), 0, 0, 0);
                    if (d41Var2.O) {
                        d41Var2.x.n(0.5f, 0.0f);
                        d41Var2.x.G = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        d41Var2.x.n(0.0f, AndroidUtilities.dp(34.0f));
                        d41Var2.x.G = Layout.Alignment.ALIGN_NORMAL;
                    }
                    d41Var2.x.u(14.0f);
                    kh.x3 x3Var3 = d41Var2.x;
                    x3Var3.h = kh.x3.a(x3Var3.getText(), d41Var2.x.getTextPaint());
                    if (d41Var2.O) {
                        viewGroup.addView(d41Var2.x, g7.e6.d((int) ((d41Var2.K.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((d41Var2.K.getHeight() + d41Var2.G) / AndroidUtilities.density) / 2.0f), 0.0f, 0.0f));
                    } else {
                        viewGroup.addView(d41Var2.x, g7.e6.d((int) ((d41Var2.K.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, ((((d41Var2.K.getWidth() * (-0.39999998f)) / 2.0f) + d41Var2.K.getBoundsLeft()) / AndroidUtilities.density) + 1.0f, ((-75.0f) - ((d41Var2.K.getHeight() / AndroidUtilities.density) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    d41Var2.x.v();
                }
                TextView textView = d41Var2.y;
                if (textView != null) {
                    viewGroup.removeView(textView);
                    d41Var2.y = null;
                }
                TextView textView2 = new TextView(context);
                d41Var2.y = textView2;
                textView2.setTextColor(-1);
                d41Var2.y.setTypeface(AndroidUtilities.bold());
                if (org.telegram.ui.ActionBar.f6.I.q()) {
                    d41Var2.y.setBackground(org.telegram.ui.ActionBar.f6.i0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    d41Var2.y.setBackground(org.telegram.ui.ActionBar.f6.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                d41Var2.y.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
                g7.g6.a(d41Var2.y);
                d41Var2.y.setText(LocaleController.getString(z10 ? R.string.VoiceOnceClose : R.string.VoiceOnceDeleteClose));
                d41Var2.y.setOnClickListener(new z31(d41Var2, 1));
                viewGroup.addView(d41Var2.y, g7.e6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z10 && (b41Var = d41Var2.J) != null && b41Var.getMessageObject() != null && d41Var2.J.getMessageObject().messageOwner != null) {
                    d41Var2.J.getMessageObject().messageOwner.media_unread = false;
                    d41Var2.J.invalidate();
                }
                qn qnVar2 = this.a;
                qnVar2.showDialog(qnVar2.V9);
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
                qn qnVar3 = this.a;
                return mediaController.setPlaylist(L, messageObject, qnVar3.H6, true ^ qnVar3.w0.J, null);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void I0(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        messageObject.messageOwner.summarizedOpen = !r1.summarizedOpen;
        messageObject.updateTranslation(true);
        qn qnVar = this.a;
        qnVar.getMessagesStorage().updateMessageCustomParams(messageObject.getDialogId(), messageObject.messageOwner);
        qnVar.getMessagesController().getTranslateController().checkTranslation(messageObject, true);
        g(t1Var, true, false, true);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void I1() {
        org.telegram.ui.ActionBar.b6 b6Var;
        qn qnVar = this.a;
        if (qnVar.T0 == null || qnVar.getParentActivity() == null) {
            return;
        }
        Context context = qnVar.T0.getContext();
        b6Var = ((org.telegram.ui.ActionBar.o2) qnVar).resourceProvider;
        d31.S(context, qnVar, false, b6Var, null);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void J(org.telegram.ui.Cells.t1 t1Var) {
        qn qnVar = this.a;
        if (!qnVar.getMessagesController().showSensitiveContent()) {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(qnVar.getParentActivity(), 3, null);
            c2Var.q(200L);
            qnVar.getMessagesController().getContentSettings(new a0(this, c2Var, t1Var, 5));
        } else {
            if (t1Var.getMessageObject() != null) {
                t1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
            }
            t1Var.h4();
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean K0(long j10) {
        qn qnVar = this.a;
        TLRPC.Chat chat = qnVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return false;
        }
        return qnVar.getMessagesController().isOwner(qnVar.e.id, j10);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void L1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        oi oiVar;
        int i9;
        MessageObject messageObject = t1Var.getMessageObject();
        bg.c2 c2Var = null;
        if (!(messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview)) {
            TLRPC.Message message = messageObject.messageOwner;
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
                ArrayList arrayList = new ArrayList();
                int i10 = -1;
                for (int i11 = 0; i11 < tL_messageMediaPaidMedia.extended_media.size(); i11++) {
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia.extended_media.get(i11);
                    if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia = (TLRPC.TL_messageExtendedMedia) messageExtendedMedia2;
                        if (tL_messageExtendedMedia == messageExtendedMedia) {
                            i10 = arrayList.size();
                        }
                        TLRPC.TL_message C7 = qn.C7(message);
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
                if (i10 <= -1 || arrayList.isEmpty()) {
                    return;
                }
                PhotoViewer t12 = PhotoViewer.t1();
                qn qnVar = this.a;
                t12.K2(null, qnVar, qnVar.aa);
                PhotoViewer.t1().a2(arrayList, i10, this.a.a(), 0L, 0L, this.a.Ca);
                return;
            }
            return;
        }
        qn qnVar2 = this.a;
        ve.d dVar = qnVar2.wb;
        if (dVar != null) {
            dVar.a(true);
            qnVar2.wb = null;
        }
        if (t1Var.getMessageObject() == null) {
            qnVar2.wb = null;
            oiVar = null;
        } else {
            oiVar = new oi(qnVar2, t1Var.getMessageObject().getId(), t1Var, 1);
            qnVar2.wb = oiVar;
        }
        i9 = ((org.telegram.ui.ActionBar.o2) this.a).currentAccount;
        gh.v7 y10 = gh.v7.y(i9, false);
        Objects.requireNonNull(oiVar);
        ri riVar = new ri(oiVar, 7);
        Context context = LaunchActivity.C1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        org.telegram.ui.ActionBar.b6 I = gh.v7.I();
        if (messageObject != null && context != null) {
            long dialogId = messageObject.getDialogId();
            int id2 = messageObject.getId();
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = MessagesController.getInstance(y10.a).getInputPeer(dialogId);
            tL_inputInvoiceMessage.msg_id = id2;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject p6 = mh.c3.p(I, false);
            if (p6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
            c2Var = new bg.c2(y10, ConnectionsManager.getInstance(y10.a).sendRequest(tL_payments_getPaymentForm, new fh.h1(y10, messageObject, tL_inputInvoiceMessage, riVar, 4)), 3);
        }
        if (c2Var != null) {
            oiVar.b = c2Var;
            oiVar.d();
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void M(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        TLRPC.Message message;
        int i9;
        int i10;
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        int i11 = buttonCustom.id;
        int i12 = 1;
        qn qnVar = this.a;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    qnVar.I7(t1Var, true, false, t1Var.getLastTouchX(), t1Var.getLastTouchY(), true, false, true);
                    return;
                } else {
                    if (i11 == 4) {
                        qnVar.N1.m(messageObject.getTopicId(), true);
                        return;
                    }
                    return;
                }
            }
            if (message.suggested_post != null) {
                i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                boolean canManageMonoForum = ChatObject.canManageMonoForum(i9, qnVar.e);
                if (canManageMonoForum) {
                    i10 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                    ChatObject.canUserDoChannelDirectAdminAction(i10, qnVar.e, 5);
                }
                bg.d dVar = new bg.d(this, message, canManageMonoForum, messageObject, 9);
                TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                qnVar.g7(dVar, gf.a.l(suggestedPost != null ? suggestedPost.price : null), !canManageMonoForum);
                return;
            }
            return;
        }
        long peerDialogId = DialogObject.getPeerDialogId(message.from_id);
        df dfVar = new df(10, this, message);
        Pattern pattern = org.telegram.ui.Components.y4.a;
        Activity parentActivity = qnVar.getParentActivity();
        int i13 = 0;
        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(parentActivity, 0, null);
        String string = LocaleController.getString(R.string.SuggestedMessageDecline);
        org.telegram.ui.ActionBar.c2 c2Var = f2Var.a;
        c2Var.N = string;
        c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageDeclineInfo, MessagesController.getInstance(UserConfig.selectedAccount).getPeerName(peerDialogId)));
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        frameLayout.setClipChildren(false);
        EditText editText = new EditText(parentActivity);
        editText.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        editText.setHint(LocaleController.getString(R.string.SuggestedMessageDeclineReasonHint));
        editText.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.H6, false));
        editText.setTextSize(1, 16.0f);
        editText.setBackground(org.telegram.ui.ActionBar.f6.S(parentActivity));
        editText.setMaxLines(4);
        editText.setRawInputType(147457);
        editText.setImeOptions(6);
        editText.setFilters(new InputFilter[]{new org.telegram.ui.Components.n4(parentActivity)});
        editText.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0, AndroidUtilities.dp(8.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f));
        editText.setSelection(editText.getText().toString().length());
        f2Var.n(frameLayout);
        f2Var.k(LocaleController.getString(R.string.Decline), new org.telegram.ui.Components.g1(i12, dfVar, editText));
        f2Var.h(LocaleController.getString(R.string.Cancel), null);
        c2Var.J = new org.telegram.ui.Components.o1(editText, i13);
        frameLayout.addView(editText, g7.e6.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
        editText.requestFocus();
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.fg(editText, 3), 100L);
        qnVar.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void M0(org.telegram.ui.Cells.t1 t1Var) {
        int i9;
        e5.w wVar;
        MessageObject.GroupedMessages groupedMessages;
        int i10;
        qn qnVar = this.a;
        ch.k kVar = qnVar.T9;
        if (kVar == null) {
            return;
        }
        HashMap hashMap = kVar.a;
        ch.j jVar = (ch.j) hashMap.get(ch.k.b(t1Var));
        org.telegram.ui.Components.gc gcVar = null;
        MessageObject messageObject = jVar != null ? jVar.A : null;
        ch.j jVar2 = (ch.j) qnVar.T9.a.get(ch.k.b(t1Var));
        long j10 = (jVar2 == null || (i10 = jVar2.N) == -1) ? 0L : jVar2.w[i10].d;
        if (messageObject != null && j10 != 0) {
            Activity parentActivity = qnVar.getParentActivity();
            i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
            if (!org.telegram.ui.Components.y4.h(parentActivity, i9, j10, false)) {
                ArrayList<MessageObject> arrayList = (messageObject.getGroupId() == 0 || (groupedMessages = (MessageObject.GroupedMessages) qnVar.t6.f(messageObject.getGroupId())) == null) ? null : groupedMessages.messages;
                if (arrayList == null) {
                    arrayList = org.telegram.messenger.l0.k(messageObject);
                }
                boolean z10 = j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                long j11 = j10;
                e5.w wVar2 = new e5.w(this, arrayList, j11, 18);
                if (z10) {
                    wVar2.run();
                    wVar = null;
                } else {
                    wVar = wVar2;
                }
                gcVar = org.telegram.ui.Components.oc.v(qnVar.getParentActivity(), qnVar, null, 1, j11, 1, qnVar.getThemedColor(org.telegram.ui.ActionBar.f6.Fi), qnVar.getThemedColor(org.telegram.ui.ActionBar.f6.Hi), 5000, false, wVar);
                gcVar.k = true;
                gcVar.k(gcVar.e instanceof org.telegram.ui.Components.rb);
            }
        }
        ch.j jVar3 = (ch.j) hashMap.get(ch.k.b(t1Var));
        if (jVar3 != null) {
            if (gcVar == null) {
                jVar3.N = -1;
                jVar3.c();
                return;
            }
            org.telegram.ui.Components.lb lbVar = gcVar.e;
            if (!(lbVar instanceof org.telegram.ui.Components.ob)) {
                jVar3.c();
                return;
            }
            org.telegram.ui.Components.ob obVar = (org.telegram.ui.Components.ob) lbVar;
            jVar3.S = obVar;
            obVar.a.setVisibility(4);
            ViewTreeObserver viewTreeObserver = jVar3.S.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new ch.f(0, jVar3, viewTreeObserver));
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void M1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i9;
        int i10;
        ImageLocation forDocument;
        String str2;
        boolean isEmpty = TextUtils.isEmpty(str);
        qn qnVar = this.a;
        if (!isEmpty) {
            ve.e.s(qnVar.getParentActivity(), "https://" + qnVar.getMessagesController().linkPrefix + "/nft/" + str);
            return;
        }
        i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
        zf.k1 k1Var = new zf.k1(qnVar, i9, user, null, null, qnVar.aa);
        t1Var.getLocationOnScreen(new int[2]);
        k1Var.r0 = t1Var.getNameStatusX();
        k1Var.s0 = t1Var.getNameStatusY();
        k1Var.v0 = t1Var.getScaleX();
        k1Var.t0 = t1Var.getLeft();
        k1Var.u0 = t1Var.getTop();
        k1Var.w0 = t1Var;
        int colorId = UserObject.getColorId(user);
        if (colorId < 7) {
            k1Var.q0 = Integer.valueOf(qnVar.getThemedColor(org.telegram.ui.ActionBar.f6.r8[colorId]));
        } else {
            i10 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
            MessagesController.PeerColors peerColors = MessagesController.getInstance(i10).peerColors;
            MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(colorId) : null;
            k1Var.q0 = color != null ? Integer.valueOf(color.getColor1()) : null;
        }
        org.telegram.ui.Components.i5 i5Var = t1Var.bc;
        if (i5Var != null && (i5Var.f[0] instanceof org.telegram.ui.Components.k5)) {
            k1Var.v0 *= 0.95f;
            if (document != null) {
                org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(qnVar.getParentActivity());
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.f6.m6, 0.2f);
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
                o9Var.setLayerNum(7);
                o9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                o9Var.l(imageLocation, str3, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "140_140", svgThumb, document);
                if (MessageObject.isTextColorEmoji(document)) {
                    Integer num = k1Var.q0;
                    o9Var.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : qnVar.getThemedColor(org.telegram.ui.ActionBar.f6.v6), PorterDuff.Mode.SRC_IN));
                    k1Var.y0 = MessageObject.getInputStickerSet(document);
                } else {
                    k1Var.y0 = MessageObject.getInputStickerSet(document);
                }
                k1Var.x0 = o9Var;
                k1Var.A0 = true;
            }
        }
        qnVar.showDialog(k1Var);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void N(org.telegram.ui.Cells.t1 t1Var) {
        qn qnVar = this.a;
        qnVar.ta.l(t1Var, qnVar, true);
        qnVar.t0.I0(false);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void O0(int i9, org.telegram.ui.Cells.t1 t1Var) {
        int i10;
        int i11;
        TLRPC.MessageMedia messageMedia;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        TL_stories.StoryItem storyItem;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia2;
        String b10;
        int i12;
        TLRPC.User user;
        int i13;
        TLRPC.WebPage webPage;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        MessageObject messageObject = t1Var.getMessageObject();
        File file = null;
        TLRPC.User user2 = null;
        qn qnVar = this.a;
        if (i9 == 19) {
            ve.d dVar = qnVar.wb;
            if (dVar != null) {
                dVar.a(true);
            }
            final vm vmVar = t1Var.getMessageObject() != null ? new vm(this, t1Var, 2) : null;
            qnVar.wb = vmVar;
            final Activity parentActivity = qnVar.getParentActivity();
            final org.telegram.ui.ActionBar.b6 resourceProvider = qnVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            vmVar.d();
            vmVar.b = new bg.n(atomicBoolean, 0);
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
            final String b11 = bg.u.b(messageObject);
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
            final boolean z10 = chat != null && ChatObject.isChannelAndNotMegaGroup(chat);
            final long j10 = messageObject.messageOwner.date * 1000;
            bg.u0.d(messageObject, new Utilities.Callback(atomicBoolean, vmVar, z10, b11, j10, tL_messageMediaGiveaway2, parentActivity, resourceProvider) { // from class: bg.o
                public final /* synthetic */ AtomicBoolean a;
                public final /* synthetic */ ve.d b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ String d;
                public final /* synthetic */ TLRPC.TL_messageMediaGiveaway e;
                public final /* synthetic */ Context f;
                public final /* synthetic */ b6 g;

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
                    b6 b6Var = this.g;
                    if (z11) {
                        u.d(z12, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, b6Var);
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        u.e(z12, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, b6Var);
                    }
                }
            }, new bg.p(atomicBoolean, vmVar, 0));
            return;
        }
        if (i9 == 21) {
            e();
            return;
        }
        if (i9 == 84) {
            qnVar.ua(t1Var);
            return;
        }
        if (i9 == 80) {
            ch.g gVar = org.telegram.ui.Components.ag0.K;
            if (qnVar.getParentActivity() == null) {
                return;
            }
            qnVar.showDialog(new org.telegram.ui.Components.ag0(qnVar.getContext(), qnVar.getCurrentAccount(), messageObject, qnVar.getResourceProvider()));
            return;
        }
        if (i9 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
            if (messageMedia4 == null || (webPage = messageMedia4.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity == null || launchActivity.P() == null || LaunchActivity.C1.P().l(messageObject) == null) {
                qnVar.createArticleViewer(false).N(messageObject, null, null, null);
                return;
            }
            return;
        }
        int i14 = 5;
        if (i9 == 5) {
            long j11 = messageObject.messageOwner.media.user_id;
            if (j11 != 0) {
                i13 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                user = MessagesController.getInstance(i13).getUser(Long.valueOf(j11));
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
                qnVar.showDialog(new org.telegram.ui.Components.wd0(qnVar, null, user, null, file, ne.b.d(str, false), str3, str4, qnVar.aa));
                return;
            } catch (Exception e10) {
                FileLog.e(e10);
                return;
            }
        }
        if (i9 == 30) {
            qnVar.presentFragment(new qn(e2.c.g(messageObject.messageOwner.media.user_id, "user_id")));
            return;
        }
        if (i9 == 31) {
            long j12 = messageObject.messageOwner.media.user_id;
            if (j12 != 0) {
                i12 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                user2 = MessagesController.getInstance(i12).getUser(Long.valueOf(j12));
            }
            if (user2 != null) {
                if (!TextUtils.isEmpty(messageObject.vCardData)) {
                    b10 = messageObject.vCardData.toString();
                } else if (TextUtils.isEmpty(user2.phone)) {
                    String str5 = MessageObject.getMedia(messageObject.messageOwner).phone_number;
                    b10 = !TextUtils.isEmpty(str5) ? ne.b.c().b(str5) : LocaleController.getString(R.string.NumberUnknown);
                } else {
                    b10 = org.telegram.messenger.ll.g(new StringBuilder("+"), user2.phone, ne.b.c());
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user2.id);
                bundle2.putString("phone", b10);
                bundle2.putBoolean("addContact", true);
                qnVar.presentFragment(new is(bundle2));
                return;
            }
            return;
        }
        int i15 = 4;
        if (i9 == 23 || i9 == 24) {
            boolean z11 = i9 == 24;
            TLRPC.Message message2 = messageObject.messageOwner;
            TLRPC.WebPage webPage2 = (message2 == null || (messageMedia = message2.media) == null) ? null : messageMedia.webpage;
            if (webPage2 == null || webPage2.url == null) {
                return;
            }
            Matcher matcher = Pattern.compile("^https?\\:\\/\\/t\\.me\\/add(?:emoji|stickers)\\/(.+)$").matcher(webPage2.url);
            ve.d dVar2 = qnVar.wb;
            if (dVar2 != null) {
                dVar2.a(true);
            }
            qnVar.wb = t1Var.getMessageObject() != null ? new vm(this, t1Var, 3) : null;
            if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                String group = matcher.group(1);
                i10 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                if (MediaDataController.getInstance(i10).getStickerSetByName(group) == null) {
                    qnVar.wb.d();
                    TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_inputStickerSetShortName.short_name = group;
                    tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                    i11 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                    qnVar.wb.b = new bg.c2(this, ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getStickerSet, new kh.o3(i15, this, z11)), 25);
                    return;
                }
            }
            ve.e.r(qnVar.getParentActivity(), Uri.parse(webPage2.url), true, true, false, qnVar.wb, null, false, true, false);
            return;
        }
        if (messageObject.isSponsored()) {
            qnVar.J9(messageObject, false, false);
            if (messageObject.sponsoredUrl != null) {
                ve.d dVar3 = qnVar.wb;
                if (dVar3 != null) {
                    dVar3.a(true);
                }
                qnVar.wb = t1Var.getMessageObject() != null ? new vm(this, t1Var, i15) : null;
                ve.e.r(qnVar.getParentActivity(), Uri.parse(messageObject.sponsoredUrl), true, false, false, qnVar.wb, null, false, qnVar.getMessagesController().sponsoredLinksInappAllow, false);
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
            for (int i16 = 0; i16 < storyMentionWebpage.attributes.size(); i16++) {
                if ((storyMentionWebpage.attributes.get(i16) instanceof TLRPC.TL_webPageAttributeStory) && (storyItem = (tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) storyMentionWebpage.attributes.get(i16)).storyItem) != null) {
                    storyItem.dialogId = DialogObject.getPeerDialogId(tL_webPageAttributeStory.peer);
                    tL_webPageAttributeStory.storyItem.messageId = messageObject.getId();
                    tL_webPageAttributeStory.storyItem.messageType = 1;
                    qnVar.getOrCreateStoryViewer().F(qnVar.getParentActivity(), tL_webPageAttributeStory.storyItem, ih.e7.a(qnVar.t0));
                    return;
                }
            }
        }
        if (qnVar.ea(storyMentionWebpage.url, t1Var, null, messageObject.getId(), 2)) {
            return;
        }
        ve.d dVar4 = qnVar.wb;
        if (dVar4 != null) {
            dVar4.a(true);
        }
        qnVar.wb = t1Var.getMessageObject() != null ? new vm(this, t1Var, i14) : null;
        ve.e.r(qnVar.getParentActivity(), Uri.parse(storyMentionWebpage.url), true, true, false, qnVar.wb, null, false, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0850 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0864  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x09a7 A[LOOP:3: B:253:0x09a5->B:254:0x09a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0a18  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0a30  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0ab2  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0946  */
    @Override // org.telegram.ui.Cells.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean O1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        iv0 iv0Var;
        TLRPC.PollAnswer pollAnswer2;
        iv0 iv0Var2;
        ev0 ev0Var;
        ig.a aVar;
        MessageObject messageObject;
        MessageObject messageObject2;
        boolean z10;
        TLRPC.ChatFull chatFull;
        boolean z11;
        boolean z12;
        ig.a aVar2;
        boolean z13;
        iv0 iv0Var3;
        org.telegram.ui.Components.x60 x60Var;
        qn qnVar;
        MessageObject messageObject3;
        ArrayList arrayList;
        se seVar;
        MessageObject messageObject4;
        int size;
        int i9;
        ViewGroup viewGroup;
        boolean z14;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        boolean z15;
        byte[] bArr;
        ev0 ev0Var2;
        TLRPC.PollAnswerVoters pollAnswerVoters;
        boolean z16;
        iv0 iv0Var4;
        byte[] bArr2;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll2;
        ArrayList arrayList2;
        TLRPC.PollAnswer pollAnswer3;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll3;
        boolean z17;
        yg.q qVar;
        boolean z18;
        ArrayList<TLRPC.PollAnswerVoters> arrayList3;
        qn qnVar2 = this.a;
        if (qnVar2.getParentActivity() != null && qnVar2.getParentActivity() != null) {
            kh.x3 x3Var = qnVar2.t1;
            if (x3Var != null && x3Var.R) {
                x3Var.e(true);
            }
            ml mlVar = qnVar2.x1;
            if (mlVar != null && mlVar.R) {
                mlVar.e(true);
            }
            MessageObject primaryMessageObject = t1Var.getPrimaryMessageObject();
            TLRPC.MessageMedia media = MessageObject.getMedia(primaryMessageObject);
            if (primaryMessageObject != null && (media instanceof TLRPC.TL_messageMediaPoll)) {
                qnVar2.Z4 = primaryMessageObject;
                qnVar2.a5 = null;
                iv0 iv0Var5 = new iv0(qnVar2.getParentActivity(), qnVar2.getResourceProvider());
                byte[] bArr3 = pollAnswer.option;
                iv0Var5.H = t1Var;
                iv0Var5.L = bArr3;
                MessageObject messageObject5 = t1Var.getMessageObject();
                iv0Var5.D = messageObject5;
                iv0Var5.E = messageObject5 != null && messageObject5.isOutOwner();
                org.telegram.ui.Cells.t1 t1Var2 = iv0Var5.H;
                ev0 ev0Var3 = iv0Var5.d;
                if (t1Var2 != null) {
                    iv0Var5.I = qnVar2.o9 - AndroidUtilities.dp(4.0f);
                    iv0Var5.J = t1Var.n;
                    if (t1Var.getParent() instanceof View) {
                        View view = (View) t1Var.getParent();
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
                    iv0Var.F.setDelegate(new v9.d(19));
                    gv0 gv0Var2 = iv0Var.F;
                    MessageObject messageObject6 = iv0Var.D;
                    MessageObject.GroupedMessages currentMessagesGroup = iv0Var.H.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.t1 t1Var3 = iv0Var.H;
                    gv0Var2.X3(messageObject6, currentMessagesGroup, t1Var3.B, t1Var3.A, t1Var3.C, false);
                    gv0 gv0Var3 = iv0Var.F;
                    gv0Var3.I7 = bArr3;
                    ev0Var3.addView(gv0Var3, new FrameLayout.LayoutParams(iv0Var.H.getWidth(), height, 51));
                    hv0 hv0Var = new hv0(iv0Var.getContext(), UserConfig.selectedAccount, iv0Var.H.getResourcesProvider(), width, height, 0);
                    iv0Var.G = hv0Var;
                    iv0Var.H.j1(hv0Var);
                    iv0Var.H.h1(iv0Var.G);
                    iv0Var.G.i1(iv0Var.H);
                    iv0Var.G.setDelegate(new d7.u(19));
                    hv0 hv0Var2 = iv0Var.G;
                    MessageObject messageObject7 = iv0Var.D;
                    MessageObject.GroupedMessages currentMessagesGroup2 = iv0Var.H.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.t1 t1Var4 = iv0Var.H;
                    hv0Var2.X3(messageObject7, currentMessagesGroup2, t1Var4.B, t1Var4.A, t1Var4.C, false);
                    ev0Var3.addView(iv0Var.G, new FrameLayout.LayoutParams(iv0Var.H.getWidth(), height, 51));
                } else {
                    iv0Var = iv0Var5;
                }
                kh.j1 j1Var = iv0Var.f;
                j1Var.bringToFront();
                ev0 ev0Var4 = iv0Var.e;
                ev0Var4.bringToFront();
                iv0Var.n.bringToFront();
                j1Var.w(false);
                Context context = iv0Var.a;
                View view2 = new View(context);
                org.telegram.ui.ActionBar.b6 b6Var = iv0Var.b;
                org.telegram.ui.Components.x60 G = org.telegram.ui.Components.x60.G(ev0Var3, b6Var, view2, true);
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll4 = (TLRPC.TL_messageMediaPoll) MessageObject.getMedia(iv0Var.D);
                iv0Var.R = MessageObject.isVoted(tL_messageMediaPoll4);
                int i10 = 0;
                while (true) {
                    if (i10 >= tL_messageMediaPoll4.poll.answers.size()) {
                        pollAnswer2 = null;
                        break;
                    }
                    if (Arrays.equals(tL_messageMediaPoll4.poll.answers.get(i10).option, bArr3)) {
                        pollAnswer2 = tL_messageMediaPoll4.poll.answers.get(i10);
                        break;
                    }
                    i10++;
                }
                ig.a aVar3 = iv0Var.C;
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
                        ev0Var2 = ev0Var3;
                        pollAnswerVoters = null;
                        z16 = false;
                    } else {
                        int size2 = arrayList3.size();
                        z15 = z20;
                        int i11 = 0;
                        z16 = false;
                        TLRPC.PollAnswerVoters pollAnswerVoters2 = null;
                        while (i11 < size2) {
                            TLRPC.PollAnswerVoters pollAnswerVoters3 = arrayList3.get(i11);
                            int i12 = i11 + 1;
                            TLRPC.PollAnswerVoters pollAnswerVoters4 = pollAnswerVoters3;
                            ev0 ev0Var5 = ev0Var3;
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
                                int i13 = 0;
                                while (i13 < size3) {
                                    TLRPC.PollAnswer pollAnswer4 = arrayList5.get(i13);
                                    int i14 = i13 + 1;
                                    TLRPC.PollAnswer pollAnswer5 = pollAnswer4;
                                    ArrayList<TLRPC.PollAnswer> arrayList6 = arrayList5;
                                    int i15 = size3;
                                    if (Arrays.equals(pollAnswer5.option, pollAnswerVoters4.option)) {
                                        arrayList4.add(pollAnswer5);
                                    }
                                    arrayList5 = arrayList6;
                                    i13 = i14;
                                    size3 = i15;
                                }
                                ev0Var3 = ev0Var5;
                                i11 = i12;
                                bArr3 = bArr4;
                                tL_messageMediaPoll4 = tL_messageMediaPoll5;
                            } else {
                                ev0Var3 = ev0Var5;
                                i11 = i12;
                                bArr3 = bArr4;
                            }
                        }
                        tL_messageMediaPoll = tL_messageMediaPoll4;
                        bArr = bArr3;
                        ev0Var2 = ev0Var3;
                        pollAnswerVoters = pollAnswerVoters2;
                    }
                    if (pollAnswerVoters == null || pollAnswerVoters.voters <= 0 || !MessageObject.canShowVotersList(tL_messageMediaPoll)) {
                        iv0Var4 = iv0Var;
                        messageObject = primaryMessageObject;
                        ev0Var = ev0Var2;
                        bArr2 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                        arrayList2 = arrayList4;
                    } else {
                        yg.q qVar2 = new yg.q(context, qnVar2.getCurrentAccount(), b6Var);
                        org.telegram.ui.Components.x60 J = G.J();
                        J.T(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, b6Var)));
                        lg.a j10 = mg.c.j(b6Var);
                        View view3 = J.B;
                        if (view3 != null) {
                            qVar = qVar2;
                            z18 = false;
                            kg.d c10 = aVar3.c(view3, null, false);
                            c10.n(j10);
                            view3.setBackground(c10);
                        } else {
                            qVar = qVar2;
                            z18 = false;
                        }
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new kt0(G, 25), z18);
                        J.k();
                        long dialogId = iv0Var.D.getDialogId();
                        int id2 = iv0Var.D.getId();
                        int i16 = pollAnswerVoters.voters;
                        eb0 eb0Var = new eb0(7, iv0Var, qnVar2);
                        iv0Var4 = iv0Var;
                        ev0Var = ev0Var2;
                        yg.q qVar3 = qVar;
                        byte[] bArr5 = bArr;
                        messageObject = primaryMessageObject;
                        arrayList2 = arrayList4;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                        View a2 = qVar3.a(qnVar2, dialogId, id2, bArr5, i16, eb0Var);
                        qnVar2 = qnVar2;
                        bArr2 = bArr5;
                        J.q(a2);
                        qVar3.setMinimumHeight(AndroidUtilities.dp(48.0f));
                        qVar3.setText(LocaleController.formatPluralString("PollVotesCount", pollAnswerVoters.voters, new Object[0]));
                        qVar3.a.d(pollAnswerVoters.recent_voters, false);
                        qVar3.setLayoutParams(g7.e6.n(-1, 48));
                        qVar3.setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I5, false), 12, 0));
                        qVar3.setOnClickListener(new v80(14, G, J));
                        G.q(qVar3);
                        G.k();
                    }
                    if (!z19) {
                        pollAnswer3 = pollAnswer2;
                        iv0Var2 = iv0Var4;
                    } else if (z16) {
                        int i17 = R.drawable.msg_unvote;
                        CharSequence string = LocaleController.getString(R.string.Unvote);
                        qn qnVar3 = qnVar2;
                        TLRPC.PollAnswer pollAnswer6 = pollAnswer2;
                        iv0Var2 = iv0Var4;
                        Runnable av0Var = new av0(iv0Var2, z15, qnVar3, arrayList2, pollAnswer6);
                        qnVar2 = qnVar3;
                        pollAnswer3 = pollAnswer6;
                        G.c(i17, string, av0Var, false);
                    } else {
                        pollAnswer3 = pollAnswer2;
                        iv0Var2 = iv0Var4;
                        if (yg.i.a(iv0Var2.D) == 0) {
                            G.c(R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), new av0(iv0Var2, z15, pollAnswer3, qnVar2, arrayList2), false);
                        }
                    }
                    if (qnVar2.E6()) {
                        G.c(R.drawable.menu_reply, LocaleController.getString(R.string.PollItemQuote), new ye0(iv0Var2, qnVar2, pollAnswer3, 21), false);
                    }
                    if (iv0Var2.D.getDialogId() >= 0 || pollAnswer3.option == null) {
                        tL_messageMediaPoll3 = tL_messageMediaPoll2;
                        z17 = false;
                    } else {
                        MessagesController messagesController = MessagesController.getInstance(iv0Var2.D.currentAccount);
                        tL_messageMediaPoll3 = tL_messageMediaPoll2;
                        String publicUsername = DialogObject.getPublicUsername(messagesController.getUserOrChat(iv0Var2.D.getDialogId()));
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(messagesController.linkPrefix);
                        sb2.append("/");
                        if (TextUtils.isEmpty(publicUsername)) {
                            publicUsername = "c/" + (-iv0Var2.D.getDialogId());
                        }
                        sb2.append(publicUsername);
                        sb2.append("/");
                        sb2.append(iv0Var2.D.getId());
                        sb2.append("?option=");
                        sb2.append(new String(Base64.encode(pollAnswer3.option, 9)));
                        z17 = false;
                        G.c(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new ys0(3, iv0Var2, sb2.toString()), false);
                    }
                    G.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new ys0(4, iv0Var2, pollAnswer3), z17);
                    TLRPC.Peer peer = pollAnswer3.added_by;
                    if (peer != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        long clientUserId = UserConfig.getInstance(iv0Var2.D.currentAccount).getClientUserId();
                        aVar = aVar3;
                        long currentTime = ConnectionsManager.getInstance(iv0Var2.D.currentAccount).getCurrentTime();
                        qn qnVar4 = qnVar2;
                        long j11 = MessagesController.getInstance(iv0Var2.D.currentAccount).config.pollAnswerDeletePeriod.get(TimeUnit.SECONDS) + pollAnswer3.date;
                        if (!iv0Var2.D.isForwarded()) {
                            TLRPC.Poll poll2 = tL_messageMediaPoll3.poll;
                            if (!poll2.closed && (poll2.creator || (peerDialogId == clientUserId && currentTime < j11))) {
                                G.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new ys0(5, iv0Var2, bArr2), true);
                            }
                        }
                        G.k();
                        TLObject userOrChat = MessagesController.getInstance(iv0Var2.D.currentAccount).getUserOrChat(peerDialogId);
                        CharSequence replaceTags = AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.PollAddedByAtTime, DialogObject.getShortName(userOrChat), LocaleController.formatDateTime(pollAnswer3.date, true)));
                        qnVar2 = qnVar4;
                        r90 r90Var = new r90(iv0Var2, peerDialogId, qnVar2, 2);
                        Context context2 = G.e;
                        FrameLayout frameLayout = new FrameLayout(context2);
                        int i18 = org.telegram.ui.ActionBar.f6.i6;
                        org.telegram.ui.ActionBar.b6 b6Var2 = G.d;
                        frameLayout.setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.v0(i18, b6Var2), 0, 12));
                        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context2);
                        o9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
                        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
                        z8Var.p(userOrChat);
                        o9Var.e(userOrChat, z8Var);
                        frameLayout.addView(o9Var, g7.e6.d(34, 34.0f, 51, 13.0f, 11.0f, 0.0f, 11.0f));
                        TextView textView = new TextView(context2);
                        org.telegram.messenger.ll.n(org.telegram.ui.ActionBar.f6.j5, b6Var2, textView, 1, 14.0f);
                        textView.setText(replaceTags);
                        textView.setMaxWidth(AndroidUtilities.dp(150.0f));
                        textView.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                        frameLayout.addView(textView, g7.e6.d(-2, -2.0f, 55, 59.0f, 8.0f, 16.0f, 0.0f));
                        frameLayout.setOnClickListener(new org.telegram.ui.Components.s2(24, G, r90Var));
                        G.r(frameLayout, g7.e6.n(-1, -2));
                        G.T(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, b6Var)));
                        G.Q(aVar, mg.c.j(b6Var), false);
                        G.Y();
                        ViewGroup viewGroup2 = G.A;
                        iv0Var2.N = viewGroup2;
                        viewGroup2.setPivotX(0.0f);
                        iv0Var2.N.setPivotY(0.0f);
                        ev0Var4.addView(iv0Var2.N, g7.e6.e(-2, -2, 51));
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        qnVar2.n8(messageObject, arrayList7, arrayList8, arrayList9);
                        se seVar2 = new se(qnVar2, 6);
                        messageObject2 = iv0Var2.D;
                        List<TLRPC.TL_availableReaction> enabledReactionsList = qnVar2.getMediaDataController().getEnabledReactionsList();
                        z10 = qnVar2.w() && !qnVar2.c() && qnVar2.f == null && messageObject2.hasReactions() && !((ChatObject.isChannel(qnVar2.e) && !qnVar2.e.megagroup) || ChatObject.isMonoForum(qnVar2.e) || enabledReactionsList.isEmpty() || !messageObject2.messageOwner.reactions.can_see_list || messageObject2.isSecretMedia());
                        z11 = messageObject2.isForwardedChannelPost() ? !(messageObject2.isSecretMedia() || qnVar2.N3 == 5 || qnVar2.w() || qnVar2.c() || !messageObject2.isReactionsAvailable() || ((((chatFull = qnVar2.V7) == null || ((chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull.paid_reactions_available)) && ((chatFull != null || ChatObject.isChannel(qnVar2.e)) && qnVar2.f == null && !ChatObject.isMonoForum(qnVar2.e))) || enabledReactionsList.isEmpty())) : !((chatFull3 = qnVar2.getMessagesController().getChatFull(-messageObject2.getFromChatId())) != null && (qnVar2.w() || qnVar2.N3 == 5 || qnVar2.c() || !messageObject2.isReactionsAvailable() || (((chatFull3.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull3.paid_reactions_available) || enabledReactionsList.isEmpty())));
                        if (z10 && !qnVar2.c() && qnVar2.e != null && messageObject2.isOutOwner() && messageObject2.isSent() && !messageObject2.isEditing() && !messageObject2.isSending() && !messageObject2.isSendError() && !messageObject2.isContentUnread() && !messageObject2.isUnread() && ConnectionsManager.getInstance(qnVar2.getCurrentAccount()).getCurrentTime() - messageObject2.messageOwner.date < qnVar2.getMessagesController().chatReadMarkExpirePeriod && ((ChatObject.isMegagroup(qnVar2.e) || !ChatObject.isChannel(qnVar2.e)) && (chatFull2 = qnVar2.V7) != null && chatFull2.participants_count <= qnVar2.getMessagesController().chatReadMarkSizeThreshold && !(messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                            if (qnVar2.N3 != 3 && messageObject2.canSetReaction() && !ChatObject.isMonoForum(qnVar2.e)) {
                                z12 = true;
                                if (qnVar2.e == null && !messageObject2.isOut() && ChatObject.isMonoForum(qnVar2.e) && ChatObject.canManageMonoForum(qnVar2.getCurrentAccount(), qnVar2.e)) {
                                    aVar2 = aVar;
                                    int i19 = ((-qnVar2.e.linked_monoforum_id) > messageObject2.getFromChatId() ? 1 : ((-qnVar2.e.linked_monoforum_id) == messageObject2.getFromChatId() ? 0 : -1));
                                } else {
                                    aVar2 = aVar;
                                }
                                if (!z10 && qnVar2.e == null && qnVar2.h == null && (user = qnVar2.f) != null && !UserObject.isUserSelf(user) && !UserObject.isReplyUser(qnVar2.f) && !UserObject.isAnonymous(qnVar2.f)) {
                                    user2 = qnVar2.f;
                                    if (!user2.bot && !UserObject.isService(user2.id) && (((userFull = qnVar2.W7) == null || !userFull.read_dates_private) && !qnVar2.c() && messageObject2.isOutOwner() && messageObject2.isSent() && !messageObject2.isEditing() && !messageObject2.isSending() && !messageObject2.isSendError() && !messageObject2.isContentUnread() && !messageObject2.isUnread() && qnVar2.getConnectionsManager().getCurrentTime() - messageObject2.messageOwner.date < qnVar2.getMessagesController().pmReadDateExpirePeriod && !(messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                                        z13 = true;
                                        TLRPC.User user3 = qnVar2.f;
                                        boolean z21 = ((user3 == null && (UserObject.isReplyUser(user3) || UserObject.isAnonymous(qnVar2.f))) || qnVar2.c() || !messageObject2.isEdited() || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                                        org.telegram.ui.Components.x60 G2 = org.telegram.ui.Components.x60.G(ev0Var, qnVar2.getResourceProvider(), null, !z10 || z12);
                                        if (z12) {
                                            ph0 ph0Var = new ph0(iv0Var2.getContext(), qnVar2.getCurrentAccount(), messageObject2, qnVar2.e);
                                            FrameLayout frameLayout2 = new FrameLayout(iv0Var2.getContext());
                                            frameLayout2.addView(ph0Var, g7.e6.c(36.0f, -1));
                                            org.telegram.ui.Components.x60 J2 = G2.J();
                                            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, iv0Var2.getContext(), iv0Var2.b, true, false);
                                            g1Var.setItemHeight(44);
                                            g1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                                            iv0 iv0Var6 = iv0Var2;
                                            g1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                                            FrameLayout frameLayout3 = new FrameLayout(iv0Var6.getContext());
                                            messageObject3 = messageObject2;
                                            LinearLayout linearLayout = new LinearLayout(iv0Var6.getContext());
                                            linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G8, b6Var));
                                            linearLayout.setOrientation(1);
                                            qn qnVar5 = qnVar2;
                                            org.telegram.ui.Components.wk0 a3 = ph0Var.a();
                                            frameLayout3.addView(g1Var);
                                            linearLayout.addView(frameLayout3);
                                            linearLayout.addView(new org.telegram.ui.ActionBar.l1(iv0Var6.getContext(), b6Var), g7.e6.n(-1, 8));
                                            frameLayout3.setOnClickListener(new bv0(G2));
                                            qnVar = qnVar5;
                                            arrayList = arrayList9;
                                            seVar = seVar2;
                                            cv0 cv0Var = new cv0(iv0Var6, ph0Var, qnVar, a3, linearLayout, G2, J2);
                                            x60Var = G2;
                                            iv0Var3 = iv0Var6;
                                            ph0Var.setOnClickListener(cv0Var);
                                            linearLayout.addView(a3, g7.e6.n(-1, -2));
                                            J2.q(linearLayout);
                                            x60Var.q(frameLayout2);
                                            x60Var.k();
                                        } else {
                                            iv0Var3 = iv0Var2;
                                            x60Var = G2;
                                            qnVar = qnVar2;
                                            messageObject3 = messageObject2;
                                            arrayList = arrayList9;
                                            seVar = seVar2;
                                            if (z13) {
                                                x60Var.r(new org.telegram.ui.Components.gb0(iv0Var3.getContext(), 0, messageObject3, new yu0(iv0Var3, 1), iv0Var3.b), g7.e6.n(-1, 36));
                                                x60Var.k();
                                            } else if (z21) {
                                                messageObject4 = messageObject3;
                                                x60Var.r(new org.telegram.ui.Components.gb0(iv0Var3.getContext(), 1, messageObject3, new yu0(iv0Var3, 2), iv0Var3.b), g7.e6.n(-1, 36));
                                                x60Var.k();
                                                size = arrayList7.size();
                                                i9 = 0;
                                                while (i9 < size) {
                                                    x60Var.c(((Integer) arrayList7.get(i9)).intValue(), (CharSequence) arrayList8.get(i9), new jh0(iv0Var3, seVar, ((Integer) arrayList.get(i9)).intValue(), 5), false);
                                                    i9++;
                                                    size = size;
                                                    arrayList7 = arrayList7;
                                                }
                                                x60Var.T(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, b6Var)));
                                                x60Var.Q(aVar2, mg.c.j(b6Var), false);
                                                x60Var.Y();
                                                ViewGroup viewGroup3 = x60Var.A;
                                                iv0Var3.P = viewGroup3;
                                                viewGroup3.setPivotX(0.0f);
                                                iv0Var3.P.setPivotY(0.0f);
                                                ev0Var4.addView(iv0Var3.P, g7.e6.e(-2, -2, 51));
                                                viewGroup = iv0Var3.P;
                                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                                    ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new dl0(iv0Var3, 6));
                                                    iv0Var3.P.setOnTouchListener(new f0(iv0Var3, 5));
                                                }
                                                if (z11) {
                                                    z14 = true;
                                                } else {
                                                    qn qnVar6 = qnVar;
                                                    org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0((qnVar.getUserConfig().getClientUserId() > qnVar.a() ? 1 : (qnVar.getUserConfig().getClientUserId() == qnVar.a() ? 0 : -1)) == 0 ? 3 : 0, qnVar6.getCurrentAccount(), iv0Var3.getContext(), qnVar6, iv0Var3.b);
                                                    uj0Var.a = true;
                                                    float f10 = 22;
                                                    uj0Var.setPadding(AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : 24), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 24 : 0), AndroidUtilities.dp(f10));
                                                    uj0Var.setDelegate(new dv0(iv0Var3, qnVar6, messageObject4, uj0Var));
                                                    iv0Var3.M = uj0Var;
                                                    ev0Var4.addView(uj0Var, g7.e6.e(-2, (int) ((uj0Var.getTopOffset() / AndroidUtilities.density) + 52.0f + f10), 51));
                                                    z14 = true;
                                                    uj0Var.p(messageObject4, qnVar6.V7, true);
                                                    iv0Var3.M.setTransitionProgress(1.0f);
                                                }
                                                iv0Var3.e();
                                                iv0Var3.a0 = new nm(this, 0);
                                                iv0Var3.show();
                                                return z14;
                                            }
                                        }
                                        messageObject4 = messageObject3;
                                        size = arrayList7.size();
                                        i9 = 0;
                                        while (i9 < size) {
                                        }
                                        x60Var.T(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, b6Var)));
                                        x60Var.Q(aVar2, mg.c.j(b6Var), false);
                                        x60Var.Y();
                                        ViewGroup viewGroup32 = x60Var.A;
                                        iv0Var3.P = viewGroup32;
                                        viewGroup32.setPivotX(0.0f);
                                        iv0Var3.P.setPivotY(0.0f);
                                        ev0Var4.addView(iv0Var3.P, g7.e6.e(-2, -2, 51));
                                        viewGroup = iv0Var3.P;
                                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                        }
                                        if (z11) {
                                        }
                                        iv0Var3.e();
                                        iv0Var3.a0 = new nm(this, 0);
                                        iv0Var3.show();
                                        return z14;
                                    }
                                }
                                z13 = false;
                                TLRPC.User user32 = qnVar2.f;
                                if (user32 == null) {
                                }
                                org.telegram.ui.Components.x60 G22 = org.telegram.ui.Components.x60.G(ev0Var, qnVar2.getResourceProvider(), null, !z10 || z12);
                                if (z12) {
                                }
                                messageObject4 = messageObject3;
                                size = arrayList7.size();
                                i9 = 0;
                                while (i9 < size) {
                                }
                                x60Var.T(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, b6Var)));
                                x60Var.Q(aVar2, mg.c.j(b6Var), false);
                                x60Var.Y();
                                ViewGroup viewGroup322 = x60Var.A;
                                iv0Var3.P = viewGroup322;
                                viewGroup322.setPivotX(0.0f);
                                iv0Var3.P.setPivotY(0.0f);
                                ev0Var4.addView(iv0Var3.P, g7.e6.e(-2, -2, 51));
                                viewGroup = iv0Var3.P;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                }
                                if (z11) {
                                }
                                iv0Var3.e();
                                iv0Var3.a0 = new nm(this, 0);
                                iv0Var3.show();
                                return z14;
                            }
                        }
                        z12 = false;
                        if (qnVar2.e == null) {
                        }
                        aVar2 = aVar;
                        if (!z10) {
                            user2 = qnVar2.f;
                            if (!user2.bot) {
                                z13 = true;
                                TLRPC.User user322 = qnVar2.f;
                                if (user322 == null) {
                                }
                                org.telegram.ui.Components.x60 G222 = org.telegram.ui.Components.x60.G(ev0Var, qnVar2.getResourceProvider(), null, !z10 || z12);
                                if (z12) {
                                }
                                messageObject4 = messageObject3;
                                size = arrayList7.size();
                                i9 = 0;
                                while (i9 < size) {
                                }
                                x60Var.T(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, b6Var)));
                                x60Var.Q(aVar2, mg.c.j(b6Var), false);
                                x60Var.Y();
                                ViewGroup viewGroup3222 = x60Var.A;
                                iv0Var3.P = viewGroup3222;
                                viewGroup3222.setPivotX(0.0f);
                                iv0Var3.P.setPivotY(0.0f);
                                ev0Var4.addView(iv0Var3.P, g7.e6.e(-2, -2, 51));
                                viewGroup = iv0Var3.P;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                }
                                if (z11) {
                                }
                                iv0Var3.e();
                                iv0Var3.a0 = new nm(this, 0);
                                iv0Var3.show();
                                return z14;
                            }
                        }
                        z13 = false;
                        TLRPC.User user3222 = qnVar2.f;
                        if (user3222 == null) {
                        }
                        org.telegram.ui.Components.x60 G2222 = org.telegram.ui.Components.x60.G(ev0Var, qnVar2.getResourceProvider(), null, !z10 || z12);
                        if (z12) {
                        }
                        messageObject4 = messageObject3;
                        size = arrayList7.size();
                        i9 = 0;
                        while (i9 < size) {
                        }
                        x60Var.T(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, b6Var)));
                        x60Var.Q(aVar2, mg.c.j(b6Var), false);
                        x60Var.Y();
                        ViewGroup viewGroup32222 = x60Var.A;
                        iv0Var3.P = viewGroup32222;
                        viewGroup32222.setPivotX(0.0f);
                        iv0Var3.P.setPivotY(0.0f);
                        ev0Var4.addView(iv0Var3.P, g7.e6.e(-2, -2, 51));
                        viewGroup = iv0Var3.P;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z11) {
                        }
                        iv0Var3.e();
                        iv0Var3.a0 = new nm(this, 0);
                        iv0Var3.show();
                        return z14;
                    }
                    aVar = aVar3;
                } else {
                    iv0Var2 = iv0Var;
                    ev0Var = ev0Var3;
                    aVar = aVar3;
                    messageObject = primaryMessageObject;
                }
                G.T(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, b6Var)));
                G.Q(aVar, mg.c.j(b6Var), false);
                G.Y();
                ViewGroup viewGroup22 = G.A;
                iv0Var2.N = viewGroup22;
                viewGroup22.setPivotX(0.0f);
                iv0Var2.N.setPivotY(0.0f);
                ev0Var4.addView(iv0Var2.N, g7.e6.e(-2, -2, 51));
                ArrayList arrayList72 = new ArrayList();
                ArrayList arrayList82 = new ArrayList();
                ArrayList arrayList92 = new ArrayList();
                qnVar2.n8(messageObject, arrayList72, arrayList82, arrayList92);
                se seVar22 = new se(qnVar2, 6);
                messageObject2 = iv0Var2.D;
                List<TLRPC.TL_availableReaction> enabledReactionsList2 = qnVar2.getMediaDataController().getEnabledReactionsList();
                if (qnVar2.w()) {
                }
                z11 = messageObject2.isForwardedChannelPost() ? !(messageObject2.isSecretMedia() || qnVar2.N3 == 5 || qnVar2.w() || qnVar2.c() || !messageObject2.isReactionsAvailable() || ((((chatFull = qnVar2.V7) == null || ((chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull.paid_reactions_available)) && ((chatFull != null || ChatObject.isChannel(qnVar2.e)) && qnVar2.f == null && !ChatObject.isMonoForum(qnVar2.e))) || enabledReactionsList2.isEmpty())) : !((chatFull3 = qnVar2.getMessagesController().getChatFull(-messageObject2.getFromChatId())) != null && (qnVar2.w() || qnVar2.N3 == 5 || qnVar2.c() || !messageObject2.isReactionsAvailable() || (((chatFull3.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull3.paid_reactions_available) || enabledReactionsList2.isEmpty())));
                if (z10) {
                }
                z12 = false;
                if (qnVar2.e == null) {
                }
                aVar2 = aVar;
                if (!z10) {
                }
                z13 = false;
                TLRPC.User user32222 = qnVar2.f;
                if (user32222 == null) {
                }
                org.telegram.ui.Components.x60 G22222 = org.telegram.ui.Components.x60.G(ev0Var, qnVar2.getResourceProvider(), null, !z10 || z12);
                if (z12) {
                }
                messageObject4 = messageObject3;
                size = arrayList72.size();
                i9 = 0;
                while (i9 < size) {
                }
                x60Var.T(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, b6Var)));
                x60Var.Q(aVar2, mg.c.j(b6Var), false);
                x60Var.Y();
                ViewGroup viewGroup322222 = x60Var.A;
                iv0Var3.P = viewGroup322222;
                viewGroup322222.setPivotX(0.0f);
                iv0Var3.P.setPivotY(0.0f);
                ev0Var4.addView(iv0Var3.P, g7.e6.e(-2, -2, 51));
                viewGroup = iv0Var3.P;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z11) {
                }
                iv0Var3.e();
                iv0Var3.a0 = new nm(this, 0);
                iv0Var3.show();
                return z14;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void P(MessageObject.TextLayoutBlock textLayoutBlock) {
        StaticLayout staticLayout = textLayoutBlock.textLayout;
        if (staticLayout == null || staticLayout.getText() == null) {
            return;
        }
        String charSequence = textLayoutBlock.textLayout.getText().toString();
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new CodeHighlighting.Span(false, 0, null, textLayoutBlock.language, charSequence), 0, spannableString.length(), 33);
        AndroidUtilities.addToClipboard(spannableString);
        org.telegram.messenger.ll.o(R.string.CodeCopied, org.telegram.ui.Components.oc.a0(this.a));
    }

    @Override // org.telegram.ui.Cells.k1
    public final nu0 P1() {
        return this.a.sa;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void Q0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        qn qnVar = this.a;
        qnVar.getSendMessagesHelper().sendCallback(true, t1Var.getMessageObject(), keyboardInlineButton, qnVar);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void R(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject.messageOwner.send_state != 0) {
            this.a.getSendMessagesHelper().cancelSendingMessage(messageObject);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void R0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        this.a.U7(characterStyle, z10, t1Var.getMessageObject(), t1Var);
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean R1(long j10) {
        qn qnVar = this.a;
        TLRPC.Chat chat = qnVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return false;
        }
        return qnVar.getMessagesController().isAdmin(qnVar.e.id, j10);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void S(int i9, org.telegram.ui.Cells.t1 t1Var) {
        boolean z10 = t1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveaway;
        qn qnVar = this.a;
        if (z10) {
            long j10 = -((TLRPC.TL_messageMediaGiveaway) t1Var.getMessageObject().messageOwner.media).channels.get(i9).longValue();
            if (qnVar.P5 != j10) {
                qnVar.presentFragment(qn.R9(j10));
            } else {
                qnVar.W0.e(false, false);
            }
        }
        if (t1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            qnVar.presentFragment(ProfileActivity.m4(((TLRPC.TL_messageMediaGiveawayResults) t1Var.getMessageObject().messageOwner.media).winners.get(i9).longValue()));
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean S0(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
        MessageObject messageObject = (currentMessagesGroup == null || currentMessagesGroup.messages.isEmpty()) ? t1Var.getMessageObject() : currentMessagesGroup.messages.get(0);
        if (messageObject != null) {
            qn qnVar = this.a;
            boolean z11 = !qnVar.fc && messageObject.getId() == qnVar.ec;
            if (!z10) {
                return z11;
            }
            if (z11 && System.currentTimeMillis() - qnVar.gc > 1000) {
                return true;
            }
        }
        return false;
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
    @Override // org.telegram.ui.Cells.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S1(org.telegram.ui.Cells.t1 t1Var, int i9, float f10, float f11, boolean z10) {
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
        org.telegram.ui.ActionBar.k kVar;
        boolean f12 = f();
        qn qnVar = this.a;
        if (!f12 && !z10) {
            kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
            if ((kVar.s() || qnVar.A9()) && !qnVar.Y8.A(t1Var.getMessageObject())) {
                qn.b2(qnVar, t1Var, !t1Var.i3(f10), f10, f11);
                return;
            }
            return;
        }
        if (UserObject.isReplyUser(qnVar.f)) {
            v(t1Var);
            return;
        }
        MessageObject messageObject2 = t1Var.getMessageObject();
        if (messageObject2 == null) {
            return;
        }
        if (messageObject2.isReplyToStory() && (storyItem = (message3 = messageObject2.messageOwner).replyStory) != null) {
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                org.telegram.messenger.l0.p(R.string.StoryNotFound, org.telegram.ui.Components.oc.a0(qnVar), R.raw.story_bomb1, 36);
                return;
            }
            storyItem.dialogId = DialogObject.getPeerDialogId(message3.reply_to.peer);
            storyItem.messageId = messageObject2.getId();
            storyItem.messageType = 3;
            ih.p7.b(storyItem, qnVar.f);
            qnVar.getOrCreateStoryViewer().F(qnVar.getParentActivity(), storyItem, ih.e7.a(qnVar.t0));
            return;
        }
        TLRPC.Message message4 = messageObject2.messageOwner;
        if (message4 != null && (messageReplyHeader7 = message4.reply_to) != null && (messageReplyHeader7.flags & 2048) != 0) {
            num = Integer.valueOf(messageReplyHeader7.todo_item_id);
        } else {
            if (message4 != null && (messageReplyHeader2 = message4.reply_to) != null && (bArr = messageReplyHeader2.poll_option) != null) {
                num = null;
                str = null;
                long j11 = qnVar.P5;
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
                org.telegram.ui.Components.oc.a0(qnVar).Q(R.raw.error, 36, LocaleController.getString((message5 == null && (messageReplyHeader3 = message5.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
            }
            if (message4 != null && (messageReplyHeader = message4.reply_to) != null && messageReplyHeader.quote) {
                String str3 = messageReplyHeader.quote_text;
                r9 = (messageReplyHeader.flags & 1024) != 0 ? messageReplyHeader.quote_offset : -1;
                str = str3;
                num = null;
                bArr = null;
                long j112 = qnVar.P5;
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
                            chat = j10 < 0 ? qnVar.getMessagesController().getChat(Long.valueOf(-j10)) : null;
                            if (j10 != Long.MAX_VALUE) {
                                boolean z12 = z11;
                                if (j10 == qnVar.P5 || chat == null || ChatObject.isPublic(chat) || (!chat.left && !chat.kicked)) {
                                    if (((j10 == qnVar.P5 && (!ChatObject.isForum(qnVar.e) || !z12)) || j10 == Long.MAX_VALUE) && (qnVar.N3 != 3 || ((messageObject = messageObject2.replyMessageObject) != null && messageObject.getSavedDialogId() == qnVar.b()))) {
                                        int i10 = qnVar.N3;
                                        if (i10 == 2 || i10 == 1) {
                                            qnVar.R8.P0(i9);
                                            qnVar.finishFragment();
                                            return;
                                        }
                                        if (bArr != null) {
                                            qnVar.N7 = bArr;
                                        } else if (num != null) {
                                            qnVar.M7 = num;
                                        } else {
                                            TLRPC.Message message6 = messageObject2.messageOwner;
                                            if (message6 != null && (messageReplyHeader5 = message6.reply_to) != null && messageReplyHeader5.quote) {
                                                qnVar.J7 = true;
                                                qnVar.L7 = messageReplyHeader5.quote_text;
                                                qnVar.O7 = r9;
                                                qnVar.I7 = true;
                                            }
                                        }
                                        fh.g1 g1Var = new fh.g1(this, i9, messageObject2, num, bArr, 17);
                                        if (!qnVar.w0.J) {
                                            g1Var.run();
                                            return;
                                        }
                                        qnVar.n3 = false;
                                        qnVar.lb(false, true, false);
                                        qnVar.Fc(qnVar.getMediaDataController().getMask(), qnVar.getMediaDataController().getSearchPosition(), qnVar.getMediaDataController().getSearchCount());
                                        AndroidUtilities.runOnUIThread(g1Var, 80L);
                                        return;
                                    }
                                    Integer num2 = num;
                                    byte[] bArr2 = bArr;
                                    if (LaunchActivity.C1 != null) {
                                        ve.d dVar = qnVar.wb;
                                        if (dVar != null) {
                                            dVar.a(false);
                                            o2Var = null;
                                            qnVar.wb = null;
                                        } else {
                                            o2Var = null;
                                        }
                                        LaunchActivity launchActivity = LaunchActivity.C1;
                                        final l0 l0Var = new l0(this, messageObject2, t1Var);
                                        qnVar.wb = l0Var;
                                        int id2 = messageObject2.getId();
                                        ArrayList arrayList = launchActivity.Z;
                                        if (j10 < 0 && (chat2 = MessagesController.getInstance(launchActivity.K).getChat(Long.valueOf(-j10))) != null && ChatObject.isForum(chat2)) {
                                            l0Var.d();
                                            final int i11 = 0;
                                            launchActivity.k0(j10, Integer.valueOf(i9), str2, num2, bArr2, new Runnable() { // from class: org.telegram.ui.q80
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i12 = i11;
                                                    l0 l0Var2 = l0Var;
                                                    switch (i12) {
                                                        case 0:
                                                            Pattern pattern = LaunchActivity.x1;
                                                            l0Var2.c(false);
                                                            break;
                                                        default:
                                                            Pattern pattern2 = LaunchActivity.x1;
                                                            l0Var2.c(false);
                                                            break;
                                                    }
                                                }
                                            }, id2, r9);
                                            return;
                                        }
                                        String str4 = str2;
                                        int i12 = r9;
                                        l0Var.d();
                                        Bundle bundle = new Bundle();
                                        if (j10 >= 0) {
                                            bundle.putLong("user_id", j10);
                                        } else {
                                            long j12 = -j10;
                                            TLRPC.Chat chat3 = MessagesController.getInstance(launchActivity.K).getChat(Long.valueOf(j12));
                                            if (chat3 != null && chat3.forum) {
                                                final int i13 = 1;
                                                launchActivity.k0(j10, Integer.valueOf(i9), str4, num2, bArr2, new Runnable() { // from class: org.telegram.ui.q80
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i122 = i13;
                                                        l0 l0Var2 = l0Var;
                                                        switch (i122) {
                                                            case 0:
                                                                Pattern pattern = LaunchActivity.x1;
                                                                l0Var2.c(false);
                                                                break;
                                                            default:
                                                                Pattern pattern2 = LaunchActivity.x1;
                                                                l0Var2.c(false);
                                                                break;
                                                        }
                                                    }
                                                }, id2, i12);
                                                return;
                                            }
                                            bundle.putLong("chat_id", j12);
                                        }
                                        bundle.putInt("message_id", i9);
                                        org.telegram.ui.ActionBar.o2 o2Var2 = !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.o2) j3.r0.j(1, arrayList) : o2Var;
                                        if (o2Var2 == null || MessagesController.getInstance(launchActivity.K).checkCanOpenChat(bundle, o2Var2)) {
                                            AndroidUtilities.runOnUIThread(new p80(launchActivity, bundle, bArr2, i9, num2, str4, i12, j10, l0Var, o2Var2));
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
                                org.telegram.ui.Components.oc.a0(qnVar).Q(R.raw.error, 36, LocaleController.getString((message52 == null && (messageReplyHeader3 = message52.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
                            } else {
                                messageObject2.replyTextRevealed = true;
                                qnVar.qc(messageObject2, true);
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
                    org.telegram.ui.Components.oc.a0(qnVar).Q(R.raw.error, 36, LocaleController.getString((message522 == null && (messageReplyHeader3 = message522.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
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
                org.telegram.ui.Components.oc.a0(qnVar).Q(R.raw.error, 36, LocaleController.getString((message5222 == null && (messageReplyHeader3 = message5222.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
            }
            num = null;
        }
        bArr = null;
        str = null;
        long j1122 = qnVar.P5;
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
        org.telegram.ui.Components.oc.a0(qnVar).Q(R.raw.error, 36, LocaleController.getString((message52222 == null && (messageReplyHeader3 = message52222.reply_to) != null && messageReplyHeader3.quote) ? (chat == null || !chat.megagroup) ? ChatObject.isChannel(chat) ? R.string.QuotePrivateChannel : R.string.QuotePrivate : R.string.QuotePrivateGroup : (chat == null && chat.megagroup) ? R.string.ReplyPrivateGroup : ChatObject.isChannel(chat) ? R.string.ReplyPrivateChannel : R.string.ReplyPrivate)).k(true);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void U(MessageObject messageObject) {
        if (messageObject.isVideo()) {
            this.a.fb(messageObject, true);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void U0(org.telegram.ui.Cells.t1 t1Var) {
        qn qnVar = this.a;
        qnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(qnVar.P5), t1Var);
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean V(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        int i9;
        int i10;
        boolean isForwarded = t1Var.getMessageObject().isForwarded();
        qn qnVar = this.a;
        if (isForwarded) {
            long peerDialogId = DialogObject.getPeerDialogId(t1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.oc a02 = org.telegram.ui.Components.oc.a0(qnVar);
            int i11 = R.raw.passcode_lock_close;
            int i12 = R.string.TodoCompleteForbiddenForward;
            i10 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
            a02.Q(i11, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i12, DialogObject.getName(i10, peerDialogId)))).k(true);
            return false;
        }
        if (t1Var.getMessageObject().canCompleteTodo()) {
            if (qnVar.getUserConfig().isPremium()) {
                qnVar.getSendMessagesHelper().toggleTodo(ChatObject.getSendAsPeerId(qnVar.e, qnVar.V7, true), t1Var.getMessageObject(), todoItem, z10, null);
                return true;
            }
            org.telegram.ui.Components.oc.a0(qnVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.TodoPremiumRequired), new nm(this, 9))).k(true);
            return false;
        }
        long peerDialogId2 = DialogObject.getPeerDialogId(t1Var.getMessageObject().getFromPeer());
        org.telegram.ui.Components.oc a03 = org.telegram.ui.Components.oc.a0(qnVar);
        int i13 = R.raw.passcode_lock_close;
        int i14 = R.string.TodoCompleteForbidden;
        i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
        a03.Q(i13, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i14, DialogObject.getName(i9, peerDialogId2)))).k(true);
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean W() {
        qn qnVar = this.a;
        return qnVar.S5[1].size() + qnVar.S5[0].size() > 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void W0(org.telegram.ui.Cells.t1 t1Var) {
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
        qn qnVar = this.a;
        if (currentMessagesGroup != null) {
            int size = currentMessagesGroup.posArray.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    break;
                }
                if ((currentMessagesGroup.posArray.get(i9).flags & 1) != 0) {
                    MessageObject messageObject2 = currentMessagesGroup.messages.get(i9);
                    if (messageObject2 != messageObject) {
                        int childCount = qnVar.t0.getChildCount();
                        for (int i10 = 0; i10 < childCount; i10++) {
                            View childAt = qnVar.t0.getChildAt(i10);
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
                    i9++;
                }
            }
        }
        qnVar.Jb(messageObject, spannableStringBuilder, 1);
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
    public final boolean W1(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        ad1 ad1Var;
        TLRPC.TodoItem todoItem2;
        TLRPC.TodoCompletion todoCompletion;
        ad1 ad1Var2;
        MessageObject messageObject;
        ad1 ad1Var3;
        int i9;
        MessageObject messageObject2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        se seVar;
        MessageObject messageObject3;
        boolean z14;
        ArrayList arrayList;
        ArrayList arrayList2;
        dd1 dd1Var;
        ArrayList arrayList3;
        qn qnVar;
        MessageObject messageObject4;
        int size;
        int i10;
        ViewGroup viewGroup;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        final qn qnVar2 = this.a;
        if (qnVar2.getParentActivity() == null || qnVar2.getParentActivity() == null) {
            return false;
        }
        kh.x3 x3Var = qnVar2.t1;
        if (x3Var != null && x3Var.R) {
            x3Var.e(true);
        }
        ml mlVar = qnVar2.x1;
        if (mlVar != null && mlVar.R) {
            mlVar.e(true);
        }
        MessageObject primaryMessageObject = t1Var.getPrimaryMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(primaryMessageObject);
        if (primaryMessageObject == null || !(media instanceof TLRPC.TL_messageMediaToDo)) {
            return false;
        }
        qnVar2.Z4 = primaryMessageObject;
        qnVar2.a5 = null;
        final dd1 dd1Var2 = new dd1(qnVar2.getParentActivity(), qnVar2.getResourceProvider());
        final int i11 = todoItem.id;
        dd1Var2.G = t1Var;
        dd1Var2.K = i11;
        MessageObject messageObject5 = t1Var.getMessageObject();
        dd1Var2.C = messageObject5;
        dd1Var2.D = messageObject5 != null && messageObject5.isOutOwner();
        org.telegram.ui.Cells.t1 t1Var2 = dd1Var2.G;
        ad1 ad1Var4 = dd1Var2.c;
        if (t1Var2 != null) {
            dd1Var2.H = qnVar2.o9 - AndroidUtilities.dp(4.0f);
            dd1Var2.I = t1Var.n;
            if (t1Var.getParent() instanceof View) {
                View view = (View) t1Var.getParent();
                dd1Var2.H = view.getY() + dd1Var2.H;
                dd1Var2.I = view.getY() + dd1Var2.I;
            }
            int width = dd1Var2.G.getWidth();
            int height = dd1Var2.G.getHeight();
            dd1Var2.G.getHeight();
            ad1Var = ad1Var4;
            bd1 bd1Var = new bd1(dd1Var2, dd1Var2.getContext(), UserConfig.selectedAccount, dd1Var2.G.getResourcesProvider(), i11, width, height);
            dd1Var2.E = bd1Var;
            dd1Var2.G.h1(bd1Var);
            dd1Var2.E.i1(dd1Var2.G);
            dd1Var2.E.setDelegate(new cd1(dd1Var2));
            bd1 bd1Var2 = dd1Var2.E;
            MessageObject messageObject6 = dd1Var2.C;
            MessageObject.GroupedMessages currentMessagesGroup = dd1Var2.G.getCurrentMessagesGroup();
            org.telegram.ui.Cells.t1 t1Var3 = dd1Var2.G;
            bd1Var2.X3(messageObject6, currentMessagesGroup, t1Var3.B, t1Var3.A, t1Var3.C, false);
            ad1Var.addView(dd1Var2.E, new FrameLayout.LayoutParams(dd1Var2.G.getWidth(), height, 51));
            hv0 hv0Var = new hv0(dd1Var2.getContext(), UserConfig.selectedAccount, dd1Var2.G.getResourcesProvider(), width, height, 1);
            dd1Var2.F = hv0Var;
            dd1Var2.G.j1(hv0Var);
            dd1Var2.G.h1(dd1Var2.F);
            dd1Var2.F.i1(dd1Var2.G);
            dd1Var2.F.setDelegate(new v9.d(20));
            hv0 hv0Var2 = dd1Var2.F;
            MessageObject messageObject7 = dd1Var2.C;
            MessageObject.GroupedMessages currentMessagesGroup2 = dd1Var2.G.getCurrentMessagesGroup();
            org.telegram.ui.Cells.t1 t1Var4 = dd1Var2.G;
            hv0Var2.X3(messageObject7, currentMessagesGroup2, t1Var4.B, t1Var4.A, t1Var4.C, false);
            ad1Var.addView(dd1Var2.F, new FrameLayout.LayoutParams(dd1Var2.G.getWidth(), height, 51));
        } else {
            ad1Var = ad1Var4;
        }
        kh.j1 j1Var = dd1Var2.e;
        j1Var.bringToFront();
        ad1 ad1Var5 = dd1Var2.d;
        ad1Var5.bringToFront();
        dd1Var2.h.bringToFront();
        j1Var.w(false);
        org.telegram.ui.ActionBar.b6 b6Var = dd1Var2.a;
        org.telegram.ui.Components.x60 F = org.telegram.ui.Components.x60.F(ad1Var, b6Var, null);
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) MessageObject.getMedia(dd1Var2.C);
        final int i12 = 0;
        while (true) {
            if (i12 >= tL_messageMediaToDo.todo.list.size()) {
                todoItem2 = null;
                i12 = -1;
                break;
            }
            if (tL_messageMediaToDo.todo.list.get(i12).id == i11) {
                todoItem2 = tL_messageMediaToDo.todo.list.get(i12);
                break;
            }
            i12++;
        }
        int i13 = 0;
        while (true) {
            if (i13 >= tL_messageMediaToDo.completions.size()) {
                todoCompletion = null;
                break;
            }
            if (tL_messageMediaToDo.completions.get(i13).id == i11) {
                todoCompletion = tL_messageMediaToDo.completions.get(i13);
                break;
            }
            i13++;
        }
        if (!dd1Var2.C.canCompleteTodo()) {
            ad1Var2 = ad1Var5;
        } else if (todoCompletion != null) {
            ad1Var2 = ad1Var5;
            F.p(14, -1, LocaleController.formatTodoCompletedDate(todoCompletion.date));
            F.k();
            final int i14 = 1;
            F.c(R.drawable.msg_cancel, LocaleController.getString(R.string.TodoUncheck), new Runnable() { // from class: org.telegram.ui.vc1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i14) {
                        case 0:
                            qn qnVar3 = qnVar2;
                            xu0 xu0Var = new xu0(qnVar3);
                            dd1 dd1Var3 = dd1Var2;
                            xu0Var.o0(MessageObject.getMedia(dd1Var3.C), false, i11);
                            xu0Var.a0 = new nl0(24, dd1Var3, qnVar3);
                            qnVar3.presentFragment(xu0Var);
                            dd1Var3.c(false);
                            break;
                        case 1:
                            boolean c10 = qnVar2.c();
                            dd1 dd1Var4 = dd1Var2;
                            if (c10) {
                                Toast.makeText(dd1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                bd1 bd1Var3 = dd1Var4.E;
                                bd1Var3.k4(bd1Var3.O2(i11), false);
                            }
                            dd1Var4.c(true);
                            break;
                        default:
                            boolean c11 = qnVar2.c();
                            dd1 dd1Var5 = dd1Var2;
                            if (c11) {
                                Toast.makeText(dd1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                bd1 bd1Var4 = dd1Var5.E;
                                bd1Var4.k4(bd1Var4.O2(i11), false);
                            }
                            dd1Var5.c(true);
                            break;
                    }
                }
            }, false);
        } else {
            ad1Var2 = ad1Var5;
            final int i15 = 2;
            F.c(R.drawable.msg_select, LocaleController.getString(R.string.TodoCheck), new Runnable() { // from class: org.telegram.ui.vc1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            qn qnVar3 = qnVar2;
                            xu0 xu0Var = new xu0(qnVar3);
                            dd1 dd1Var3 = dd1Var2;
                            xu0Var.o0(MessageObject.getMedia(dd1Var3.C), false, i11);
                            xu0Var.a0 = new nl0(24, dd1Var3, qnVar3);
                            qnVar3.presentFragment(xu0Var);
                            dd1Var3.c(false);
                            break;
                        case 1:
                            boolean c10 = qnVar2.c();
                            dd1 dd1Var4 = dd1Var2;
                            if (c10) {
                                Toast.makeText(dd1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                bd1 bd1Var3 = dd1Var4.E;
                                bd1Var3.k4(bd1Var3.O2(i11), false);
                            }
                            dd1Var4.c(true);
                            break;
                        default:
                            boolean c11 = qnVar2.c();
                            dd1 dd1Var5 = dd1Var2;
                            if (c11) {
                                Toast.makeText(dd1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                bd1 bd1Var4 = dd1Var5.E;
                                bd1Var4.k4(bd1Var4.O2(i11), false);
                            }
                            dd1Var5.c(true);
                            break;
                    }
                }
            }, false);
        }
        if (todoItem2 != null) {
            F.c(R.drawable.menu_reply, LocaleController.getString(R.string.TodoItemQuote), new qc1(dd1Var2, qnVar2, todoItem2, 2), false);
            if (dd1Var2.C.getDialogId() < 0) {
                MessagesController messagesController = MessagesController.getInstance(dd1Var2.C.currentAccount);
                String publicUsername = DialogObject.getPublicUsername(messagesController.getUserOrChat(dd1Var2.C.getDialogId()));
                StringBuilder sb2 = new StringBuilder("https://");
                sb2.append(messagesController.linkPrefix);
                sb2.append("/");
                if (TextUtils.isEmpty(publicUsername)) {
                    StringBuilder sb3 = new StringBuilder("c/");
                    messageObject = primaryMessageObject;
                    ad1Var3 = ad1Var2;
                    sb3.append(-dd1Var2.C.getDialogId());
                    publicUsername = sb3.toString();
                } else {
                    messageObject = primaryMessageObject;
                    ad1Var3 = ad1Var2;
                }
                sb2.append(publicUsername);
                sb2.append("/");
                sb2.append(dd1Var2.C.getId());
                sb2.append("?task=");
                sb2.append(todoItem2.id);
                F.c(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new n21(16, dd1Var2, sb2.toString()), false);
            } else {
                messageObject = primaryMessageObject;
                ad1Var3 = ad1Var2;
            }
            F.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new n21(17, dd1Var2, todoItem2), false);
        } else {
            messageObject = primaryMessageObject;
            ad1Var3 = ad1Var2;
        }
        if (dd1Var2.C.canEditMessage(qnVar2.e)) {
            final int i16 = 0;
            F.c(R.drawable.msg_edit, LocaleController.getString(R.string.TodoEditItem), new Runnable() { // from class: org.telegram.ui.vc1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i16) {
                        case 0:
                            qn qnVar3 = qnVar2;
                            xu0 xu0Var = new xu0(qnVar3);
                            dd1 dd1Var3 = dd1Var2;
                            xu0Var.o0(MessageObject.getMedia(dd1Var3.C), false, i12);
                            xu0Var.a0 = new nl0(24, dd1Var3, qnVar3);
                            qnVar3.presentFragment(xu0Var);
                            dd1Var3.c(false);
                            break;
                        case 1:
                            boolean c10 = qnVar2.c();
                            dd1 dd1Var4 = dd1Var2;
                            if (c10) {
                                Toast.makeText(dd1Var4.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                bd1 bd1Var3 = dd1Var4.E;
                                bd1Var3.k4(bd1Var3.O2(i12), false);
                            }
                            dd1Var4.c(true);
                            break;
                        default:
                            boolean c11 = qnVar2.c();
                            dd1 dd1Var5 = dd1Var2;
                            if (c11) {
                                Toast.makeText(dd1Var5.getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
                            } else {
                                bd1 bd1Var4 = dd1Var5.E;
                                bd1Var4.k4(bd1Var4.O2(i12), false);
                            }
                            dd1Var5.c(true);
                            break;
                    }
                }
            }, false);
            if (tL_messageMediaToDo.todo.list.size() > 1) {
                i9 = 51;
                F.c(R.drawable.msg_delete, LocaleController.getString(R.string.TodoDeleteItem), new org.telegram.ui.Components.y01(dd1Var2, tL_messageMediaToDo, i11, qnVar2, 11), false);
                F.T(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, b6Var)));
                lg.d j10 = mg.c.j(b6Var);
                ig.a aVar = dd1Var2.B;
                F.Q(aVar, j10, false);
                F.Y();
                ViewGroup viewGroup2 = F.A;
                dd1Var2.M = viewGroup2;
                viewGroup2.setPivotX(0.0f);
                dd1Var2.M.setPivotY(0.0f);
                ad1Var3.addView(dd1Var2.M, g7.e6.e(-2, -2, i9));
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                qnVar2.n8(messageObject, arrayList4, arrayList5, arrayList6);
                se seVar2 = new se(qnVar2, 7);
                messageObject2 = dd1Var2.C;
                List<TLRPC.TL_availableReaction> enabledReactionsList = qnVar2.getMediaDataController().getEnabledReactionsList();
                boolean z15 = qnVar2.w() && !qnVar2.c() && qnVar2.f == null && messageObject2.hasReactions() && !((ChatObject.isChannel(qnVar2.e) && !qnVar2.e.megagroup) || ChatObject.isMonoForum(qnVar2.e) || enabledReactionsList.isEmpty() || !messageObject2.messageOwner.reactions.can_see_list || messageObject2.isSecretMedia());
                if (messageObject2.isForwardedChannelPost()) {
                    z10 = z15;
                    if (!messageObject2.isSecretMedia()) {
                        if (qnVar2.N3 != 5) {
                            if (!qnVar2.w()) {
                                if (!qnVar2.c()) {
                                    if (messageObject2.isReactionsAvailable()) {
                                        TLRPC.ChatFull chatFull2 = qnVar2.V7;
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
                        if (!qnVar2.w()) {
                            if (qnVar2.N3 != 5) {
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
                z12 = (!z10 || qnVar2.c() || qnVar2.e == null || !messageObject2.isOutOwner() || !messageObject2.isSent() || messageObject2.isEditing() || messageObject2.isSending() || messageObject2.isSendError() || messageObject2.isContentUnread() || messageObject2.isUnread() || ConnectionsManager.getInstance(qnVar2.getCurrentAccount()).getCurrentTime() - messageObject2.messageOwner.date >= qnVar2.getMessagesController().chatReadMarkExpirePeriod || (!ChatObject.isMegagroup(qnVar2.e) && ChatObject.isChannel(qnVar2.e)) || (chatFull = qnVar2.V7) == null || chatFull.participants_count > qnVar2.getMessagesController().chatReadMarkSizeThreshold || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || qnVar2.N3 == 3 || !messageObject2.canSetReaction() || ChatObject.isMonoForum(qnVar2.e)) ? false : true;
                if (qnVar2.e != null && !messageObject2.isOut() && ChatObject.isMonoForum(qnVar2.e) && ChatObject.canManageMonoForum(qnVar2.getCurrentAccount(), qnVar2.e)) {
                    int i17 = ((-qnVar2.e.linked_monoforum_id) > messageObject2.getFromChatId() ? 1 : ((-qnVar2.e.linked_monoforum_id) == messageObject2.getFromChatId() ? 0 : -1));
                }
                if (!z10 && qnVar2.e == null && qnVar2.h == null && (user = qnVar2.f) != null && !UserObject.isUserSelf(user) && !UserObject.isReplyUser(qnVar2.f) && !UserObject.isAnonymous(qnVar2.f)) {
                    user2 = qnVar2.f;
                    if (!user2.bot && !UserObject.isService(user2.id) && (((userFull = qnVar2.W7) == null || !userFull.read_dates_private) && !qnVar2.c() && messageObject2.isOutOwner() && messageObject2.isSent() && !messageObject2.isEditing() && !messageObject2.isSending() && !messageObject2.isSendError() && !messageObject2.isContentUnread() && !messageObject2.isUnread() && qnVar2.getConnectionsManager().getCurrentTime() - messageObject2.messageOwner.date < qnVar2.getMessagesController().pmReadDateExpirePeriod && !(messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                        z13 = true;
                        TLRPC.User user3 = qnVar2.f;
                        boolean z17 = ((user3 == null && (UserObject.isReplyUser(user3) || UserObject.isAnonymous(qnVar2.f))) || qnVar2.c() || !messageObject2.isEdited() || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                        org.telegram.ui.Components.x60 G = org.telegram.ui.Components.x60.G(dd1Var2.c, qnVar2.getResourceProvider(), null, !z10 || z12);
                        if (z12) {
                            seVar = seVar2;
                            messageObject3 = messageObject2;
                            z14 = z16;
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            dd1Var = dd1Var2;
                            arrayList3 = arrayList6;
                            qnVar = qnVar2;
                            if (z13) {
                                G.r(new org.telegram.ui.Components.gb0(dd1Var.getContext(), 0, messageObject3, new uc1(dd1Var, 0), dd1Var.a), g7.e6.n(-1, 36));
                                G.k();
                            } else if (z17) {
                                messageObject4 = messageObject3;
                                G.r(new org.telegram.ui.Components.gb0(dd1Var.getContext(), 1, messageObject3, new uc1(dd1Var, 2), dd1Var.a), g7.e6.n(-1, 36));
                                G.k();
                                i10 = 0;
                                for (size = arrayList.size(); i10 < size; size = size) {
                                    G.c(((Integer) arrayList.get(i10)).intValue(), (CharSequence) arrayList2.get(i10), new jh0(dd1Var, seVar, ((Integer) arrayList3.get(i10)).intValue(), 10), false);
                                    i10++;
                                    arrayList3 = arrayList3;
                                }
                                G.T(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, b6Var)));
                                G.Q(aVar, mg.c.j(b6Var), false);
                                G.Y();
                                ViewGroup viewGroup3 = G.A;
                                dd1Var.O = viewGroup3;
                                viewGroup3.setPivotX(0.0f);
                                dd1Var.O.setPivotY(0.0f);
                                ViewGroup viewGroup4 = dd1Var.O;
                                FrameLayout.LayoutParams e10 = g7.e6.e(-2, -2, 51);
                                ad1 ad1Var6 = dd1Var.d;
                                ad1Var6.addView(viewGroup4, e10);
                                viewGroup = dd1Var.O;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new dl0(dd1Var, 22));
                                    dd1Var.O.setOnTouchListener(new f0(dd1Var, 7));
                                }
                                if (z14) {
                                    qn qnVar3 = qnVar;
                                    org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0((qnVar.getUserConfig().getClientUserId() > qnVar.a() ? 1 : (qnVar.getUserConfig().getClientUserId() == qnVar.a() ? 0 : -1)) == 0 ? 3 : 0, qnVar3.getCurrentAccount(), dd1Var.getContext(), qnVar3, dd1Var.a);
                                    uj0Var.a = true;
                                    float f10 = 22;
                                    uj0Var.setPadding(AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : 24), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 24 : 0), AndroidUtilities.dp(f10));
                                    uj0Var.setDelegate(new zc1(dd1Var, qnVar3, messageObject4, uj0Var));
                                    dd1Var.L = uj0Var;
                                    ad1Var6.addView(uj0Var, g7.e6.e(-2, (int) ((uj0Var.getTopOffset() / AndroidUtilities.density) + 52.0f + f10), 51));
                                    uj0Var.p(messageObject4, qnVar3.V7, true);
                                    dd1Var.L.setTransitionProgress(1.0f);
                                }
                                dd1Var.e();
                                dd1Var.Y = new nm(this, 5);
                                dd1Var.show();
                                return true;
                            }
                        } else {
                            ph0 ph0Var = new ph0(dd1Var2.getContext(), qnVar2.getCurrentAccount(), messageObject2, qnVar2.e);
                            FrameLayout frameLayout = new FrameLayout(dd1Var2.getContext());
                            frameLayout.addView(ph0Var, g7.e6.c(36.0f, -1));
                            org.telegram.ui.Components.x60 J = G.J();
                            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, dd1Var2.getContext(), dd1Var2.a, true, false);
                            g1Var.setItemHeight(44);
                            g1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                            g1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                            FrameLayout frameLayout2 = new FrameLayout(dd1Var2.getContext());
                            LinearLayout linearLayout = new LinearLayout(dd1Var2.getContext());
                            linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G8, b6Var));
                            linearLayout.setOrientation(1);
                            qnVar = qnVar2;
                            org.telegram.ui.Components.wk0 a2 = ph0Var.a();
                            frameLayout2.addView(g1Var);
                            linearLayout.addView(frameLayout2);
                            z14 = z16;
                            linearLayout.addView(new org.telegram.ui.ActionBar.l1(dd1Var2.getContext(), b6Var), g7.e6.n(-1, 8));
                            frameLayout2.setOnClickListener(new xc1(G));
                            messageObject3 = messageObject2;
                            seVar = seVar2;
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            yc1 yc1Var = new yc1(dd1Var2, ph0Var, qnVar, a2, linearLayout, G, J);
                            G = G;
                            dd1Var = dd1Var2;
                            ph0Var.setOnClickListener(yc1Var);
                            linearLayout.addView(a2, g7.e6.n(-1, -2));
                            J.q(linearLayout);
                            G.q(frameLayout);
                            G.k();
                            arrayList3 = arrayList6;
                        }
                        messageObject4 = messageObject3;
                        i10 = 0;
                        while (i10 < size) {
                        }
                        G.T(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, b6Var)));
                        G.Q(aVar, mg.c.j(b6Var), false);
                        G.Y();
                        ViewGroup viewGroup32 = G.A;
                        dd1Var.O = viewGroup32;
                        viewGroup32.setPivotX(0.0f);
                        dd1Var.O.setPivotY(0.0f);
                        ViewGroup viewGroup42 = dd1Var.O;
                        FrameLayout.LayoutParams e102 = g7.e6.e(-2, -2, 51);
                        ad1 ad1Var62 = dd1Var.d;
                        ad1Var62.addView(viewGroup42, e102);
                        viewGroup = dd1Var.O;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z14) {
                        }
                        dd1Var.e();
                        dd1Var.Y = new nm(this, 5);
                        dd1Var.show();
                        return true;
                    }
                }
                z13 = false;
                TLRPC.User user32 = qnVar2.f;
                if (user32 == null) {
                }
                org.telegram.ui.Components.x60 G2 = org.telegram.ui.Components.x60.G(dd1Var2.c, qnVar2.getResourceProvider(), null, !z10 || z12);
                if (z12) {
                }
                messageObject4 = messageObject3;
                i10 = 0;
                while (i10 < size) {
                }
                G2.T(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, b6Var)));
                G2.Q(aVar, mg.c.j(b6Var), false);
                G2.Y();
                ViewGroup viewGroup322 = G2.A;
                dd1Var.O = viewGroup322;
                viewGroup322.setPivotX(0.0f);
                dd1Var.O.setPivotY(0.0f);
                ViewGroup viewGroup422 = dd1Var.O;
                FrameLayout.LayoutParams e1022 = g7.e6.e(-2, -2, 51);
                ad1 ad1Var622 = dd1Var.d;
                ad1Var622.addView(viewGroup422, e1022);
                viewGroup = dd1Var.O;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z14) {
                }
                dd1Var.e();
                dd1Var.Y = new nm(this, 5);
                dd1Var.show();
                return true;
            }
        }
        i9 = 51;
        F.T(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, b6Var)));
        lg.d j102 = mg.c.j(b6Var);
        ig.a aVar2 = dd1Var2.B;
        F.Q(aVar2, j102, false);
        F.Y();
        ViewGroup viewGroup22 = F.A;
        dd1Var2.M = viewGroup22;
        viewGroup22.setPivotX(0.0f);
        dd1Var2.M.setPivotY(0.0f);
        ad1Var3.addView(dd1Var2.M, g7.e6.e(-2, -2, i9));
        ArrayList arrayList42 = new ArrayList();
        ArrayList arrayList52 = new ArrayList();
        ArrayList arrayList62 = new ArrayList();
        qnVar2.n8(messageObject, arrayList42, arrayList52, arrayList62);
        se seVar22 = new se(qnVar2, 7);
        messageObject2 = dd1Var2.C;
        List<TLRPC.TL_availableReaction> enabledReactionsList2 = qnVar2.getMediaDataController().getEnabledReactionsList();
        if (qnVar2.w()) {
        }
        if (messageObject2.isForwardedChannelPost()) {
        }
        boolean z162 = z11;
        if (!z10) {
        }
        if (qnVar2.e != null) {
            int i172 = ((-qnVar2.e.linked_monoforum_id) > messageObject2.getFromChatId() ? 1 : ((-qnVar2.e.linked_monoforum_id) == messageObject2.getFromChatId() ? 0 : -1));
        }
        if (!z10) {
            user2 = qnVar2.f;
            if (!user2.bot) {
                z13 = true;
                TLRPC.User user322 = qnVar2.f;
                if (user322 == null) {
                }
                org.telegram.ui.Components.x60 G22 = org.telegram.ui.Components.x60.G(dd1Var2.c, qnVar2.getResourceProvider(), null, !z10 || z12);
                if (z12) {
                }
                messageObject4 = messageObject3;
                i10 = 0;
                while (i10 < size) {
                }
                G22.T(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, b6Var)));
                G22.Q(aVar2, mg.c.j(b6Var), false);
                G22.Y();
                ViewGroup viewGroup3222 = G22.A;
                dd1Var.O = viewGroup3222;
                viewGroup3222.setPivotX(0.0f);
                dd1Var.O.setPivotY(0.0f);
                ViewGroup viewGroup4222 = dd1Var.O;
                FrameLayout.LayoutParams e10222 = g7.e6.e(-2, -2, 51);
                ad1 ad1Var6222 = dd1Var.d;
                ad1Var6222.addView(viewGroup4222, e10222);
                viewGroup = dd1Var.O;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z14) {
                }
                dd1Var.e();
                dd1Var.Y = new nm(this, 5);
                dd1Var.show();
                return true;
            }
        }
        z13 = false;
        TLRPC.User user3222 = qnVar2.f;
        if (user3222 == null) {
        }
        org.telegram.ui.Components.x60 G222 = org.telegram.ui.Components.x60.G(dd1Var2.c, qnVar2.getResourceProvider(), null, !z10 || z12);
        if (z12) {
        }
        messageObject4 = messageObject3;
        i10 = 0;
        while (i10 < size) {
        }
        G222.T(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, b6Var)));
        G222.Q(aVar2, mg.c.j(b6Var), false);
        G222.Y();
        ViewGroup viewGroup32222 = G222.A;
        dd1Var.O = viewGroup32222;
        viewGroup32222.setPivotX(0.0f);
        dd1Var.O.setPivotY(0.0f);
        ViewGroup viewGroup42222 = dd1Var.O;
        FrameLayout.LayoutParams e102222 = g7.e6.e(-2, -2, 51);
        ad1 ad1Var62222 = dd1Var.d;
        ad1Var62222.addView(viewGroup42222, e102222);
        viewGroup = dd1Var.O;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
        }
        if (z14) {
        }
        dd1Var.e();
        dd1Var.Y = new nm(this, 5);
        dd1Var.show();
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean X(org.telegram.ui.Cells.t1 t1Var) {
        int i9;
        MessageObject messageObject;
        TLRPC.Message message;
        if (t1Var == null) {
            return false;
        }
        qn qnVar = this.a;
        if (qnVar.getParentActivity() == null) {
            return false;
        }
        i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
        if (!MessagesController.getInstance(i9).richEditorAllowed() || (messageObject = t1Var.getMessageObject()) == null || (message = messageObject.messageOwner) == null || message.rich_message == null) {
            return false;
        }
        if (!messageObject.translated || message.translatedRichMessage == null) {
            return messageObject.canEditMessage(qnVar.e);
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean Y() {
        qn qnVar = this.a;
        return UserObject.isReplyUser(qnVar.f) || UserObject.isUserSelf(qnVar.f);
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean Y0(int i9, org.telegram.ui.Cells.t1 t1Var) {
        qn qnVar = this.a;
        return qnVar.sb != 0 && t1Var.getMessageObject() != null && qnVar.sb == t1Var.getMessageObject().getId() && qnVar.tb == i9;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void Z(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        MessageObject messageObject;
        if (chat == null) {
            return;
        }
        qn qnVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
        if (kVar.s() || qnVar.A9()) {
            qn.b2(qnVar, t1Var, true, f10, f11);
            return;
        }
        if (z10 || !chat.signature_profiles || (messageObject = t1Var.getMessageObject()) == null || messageObject.getDialogId() == UserObject.REPLY_BOT) {
            k(t1Var, chat, i9, z10);
        } else {
            qnVar.na(DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean Z0(MessageObject messageObject) {
        bm bmVar;
        long dialogId = messageObject.getDialogId();
        qn qnVar = this.a;
        return (dialogId == UserObject.REPLY_BOT || ((bmVar = qnVar.w0) != null && bmVar.J)) && qnVar.N3 != 7;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void a0(org.telegram.ui.Cells.t1 t1Var) {
        g(t1Var, true, true, false);
    }

    public final void b(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        qn qnVar = this.a;
        ak akVar = qnVar.U;
        if (akVar != null) {
            CharSequence fieldText = akVar.getFieldText();
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
                qnVar.U.setFieldText(spannableStringBuilder);
                AndroidUtilities.runOnUIThread(new nm(this, 6), 200L);
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final int b0() {
        return this.a.N3;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void b2(org.telegram.ui.Cells.t1 t1Var) {
        TLRPC.Chat chat;
        TLRPC.User currentUser = t1Var.getCurrentUser();
        qn qnVar = this.a;
        if (!AndroidUtilities.isContextSafe(qnVar.getParentActivity()) || (chat = qnVar.e) == null || currentUser == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
            return;
        }
        d(t1Var, qnVar.getMessagesController().getParticipant(qnVar.e.id, currentUser.id));
    }

    public final void c(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        qn qnVar = this.a;
        ak akVar = qnVar.U;
        if (akVar != null) {
            CharSequence fieldText = akVar.getFieldText();
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
                SpannableString spannableString = new SpannableString(ta.b.j(UserObject.getFirstName(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.s41("" + user.id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            qnVar.U.setFieldText(spannableStringBuilder);
            AndroidUtilities.runOnUIThread(new nm(this, 7), 200L);
        }
    }

    public final void d(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        int i9;
        org.telegram.ui.ActionBar.b6 b6Var;
        TLRPC.User currentUser = t1Var.getCurrentUser();
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
                i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                long j10 = -qnVar.e.id;
                b6Var = ((org.telegram.ui.ActionBar.o2) qnVar).resourceProvider;
                org.telegram.ui.Components.iz0.b(parentActivity, i9, j10, currentUser, str2, z15, z16, z12, b6Var);
            }
            if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                if (ChatObject.isChannel(qnVar.e)) {
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                    qnVar.getMessagesController();
                    tL_channels_getParticipant.channel = MessagesController.getInputChannel(qnVar.e);
                    tL_channels_getParticipant.participant = qnVar.getMessagesController().getInputPeer(currentUser.id);
                    qnVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new org.telegram.messenger.a(), new bg.y0(13, this, t1Var));
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
        i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
        long j102 = -qnVar.e.id;
        b6Var = ((org.telegram.ui.ActionBar.o2) qnVar).resourceProvider;
        org.telegram.ui.Components.iz0.b(parentActivity2, i9, j102, currentUser, str2, z152, z162, z12, b6Var);
    }

    @Override // org.telegram.ui.Cells.k1
    public final pg.a d0() {
        return this.a.Mb;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void d1() {
        qn qnVar = this.a;
        qnVar.Q7();
        UndoView undoView = qnVar.u3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, qnVar.P5, null);
    }

    public final void e() {
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        boolean isHuaweiStoreApp = BuildVars.isHuaweiStoreApp();
        qn qnVar = this.a;
        if (isHuaweiStoreApp) {
            ve.e.s(qnVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            ve.e.s(qnVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean e0(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var == null ? null : t1Var.getMessageObject();
        if (messageObject == null || messageObject.messageOwner == null) {
            return false;
        }
        qn qnVar = this.a;
        return (qnVar.N3 == 1 || qnVar.y9() || messageObject.messageOwner.noforwards || messageObject.type == 29) ? false : true;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void e1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        qn qnVar = this.a;
        if (qnVar.z9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) gf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        if (qnVar.getParentActivity() != null) {
            if (qnVar.K0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || gf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                ak akVar = qnVar.U;
                MessageObject messageObject = t1Var.getMessageObject();
                MessageObject messageObject2 = t1Var.getMessageObject();
                ni niVar = null;
                String str = tL_inlineButtonTypeUrl != null ? tL_inlineButtonTypeUrl.url : null;
                ve.d dVar = qnVar.wb;
                if (dVar != null) {
                    dVar.a(true);
                    qnVar.wb = null;
                }
                if (str == null || t1Var.getMessageObject() == null) {
                    qnVar.wb = null;
                } else {
                    ni niVar2 = new ni(qnVar, t1Var.getMessageObject().getId(), str, t1Var, 1);
                    qnVar.wb = niVar2;
                    niVar = niVar2;
                }
                akVar.b0(keyboardButtonProto, messageObject, messageObject2, niVar);
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void e2(org.telegram.ui.Cells.t1 t1Var, long j10) {
        Bundle g10 = e2.c.g(j10, "user_id");
        org.telegram.ui.ActionBar.o2 o2Var = this.a;
        if (o2Var.getMessagesController().checkCanOpenChat(g10, o2Var, t1Var.getMessageObject())) {
            o2Var.presentFragment(new qn(g10));
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean f() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z10;
        qn qnVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
        if (kVar == null) {
            return false;
        }
        kVar2 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
        if (kVar2.s() || qnVar.A9()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.o2) qnVar).inPreviewMode;
        return !z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // org.telegram.ui.Cells.k1
    public final boolean f0(org.telegram.ui.Cells.t1 t1Var, final TLRPC.User user) {
        int i9;
        w4 b10;
        int i10;
        fk fkVar;
        ek ekVar;
        if (!j()) {
            return false;
        }
        qn qnVar = this.a;
        ?? r22 = (qnVar.e == null || ((fkVar = qnVar.K0) != null && fkVar.getVisibility() == 0) || ((ekVar = qnVar.N) != null && ekVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat = qnVar.e;
        ?? r42 = (chat == null || !(qnVar.Z3 == 0 || qnVar.d4) || (ChatObject.isChannel(chat) && !qnVar.e.megagroup)) ? 0 : 1;
        c5[] c5VarArr = new c5[r22 + 2 + r42];
        c5VarArr[0] = c5.d;
        c5VarArr[1] = c5.h;
        char c10 = 2;
        if (r22 != 0) {
            c5VarArr[2] = c5.n;
            c10 = 3;
        }
        if (r42 != 0) {
            c5VarArr[c10] = c5.r;
        }
        TLRPC.UserFull userFull = qnVar.getMessagesController().getUserFull(user.id);
        if (userFull != null) {
            b10 = w4.c(user, userFull, c5VarArr);
            if (!com.google.firebase.messaging.l.e(b10)) {
                i10 = ((org.telegram.ui.ActionBar.o2) qnVar).classGuid;
                b10 = w4.b(user, i10, c5VarArr);
            }
        } else {
            i9 = ((org.telegram.ui.ActionBar.o2) qnVar).classGuid;
            b10 = w4.b(user, i9, c5VarArr);
        }
        if (com.google.firebase.messaging.l.e(b10)) {
            com.google.firebase.messaging.l.i().s((ViewGroup) qnVar.fragmentView, qnVar.aa, b10, new a7(this, t1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(qnVar, t1Var);
        final int i11 = 0;
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(this) { // from class: org.telegram.ui.pm
            public final /* synthetic */ cn b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.p(user, false);
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
        H.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new t1(this, t1Var, user, 25), false);
        final int i12 = 1;
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new Runnable(this) { // from class: org.telegram.ui.pm
            public final /* synthetic */ cn b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.p(user, false);
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
        final int i13 = 2;
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new Runnable(this) { // from class: org.telegram.ui.pm
            public final /* synthetic */ cn b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.b.p(user, false);
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
    public final boolean f2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        MessageObject messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (t1Var == null || pageBlock == null) {
            return false;
        }
        qn qnVar = this.a;
        if (qnVar.getParentActivity() == null || (messageObject = t1Var.getMessageObject()) == null || (message = messageObject.messageOwner) == null || messageObject.richLayout == null || (richMessage = message.rich_message) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        messageObject.richLayout.collectMediaBlocks(arrayList);
        int indexOf = arrayList.indexOf(pageBlock);
        if (indexOf < 0) {
            return false;
        }
        PhotoViewer t12 = PhotoViewer.t1();
        t12.K2(null, qnVar, null);
        return t12.e2(null, null, null, null, null, null, null, indexOf, new lm(qnVar, arrayList), null, 0L, 0L, 0L, true, new km(richMessage, arrayList, messageObject), null);
    }

    public final void g(org.telegram.ui.Cells.t1 t1Var, boolean z10, boolean z11, boolean z12) {
        MessageObject primaryMessageObject;
        int i9;
        int i10;
        lj ljVar;
        if (t1Var == null || (primaryMessageObject = t1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.forceUpdate = true;
        qn qnVar = this.a;
        ij ijVar = qnVar.t0;
        if (ijVar != null && (ljVar = qnVar.v0) != null && ljVar.y < 0) {
            for (int childCount = ijVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = qnVar.t0.getChildAt(childCount);
                qnVar.t0.getClass();
                i9 = RecyclerView.R(childAt);
                if (i9 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.t1)) {
                        if (childAt instanceof org.telegram.ui.Cells.w0) {
                            i10 = qnVar.L8(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                            i10 = qnVar.L8(childAt);
                            break;
                        }
                    }
                }
            }
        }
        i9 = -1;
        i10 = 0;
        if (z10 && i9 >= 0 && t1Var.getCurrentMessagesGroup() == null) {
            if (z12) {
                lj ljVar2 = qnVar.v0;
                qnVar.t0.getClass();
                ljVar2.i1(RecyclerView.R(t1Var), t1Var.getTop() - ((int) qnVar.o9), false);
            } else {
                qnVar.v0.h1(i9, i10);
            }
        }
        qnVar.J0 = z11;
        qnVar.rc(primaryMessageObject, false);
        qnVar.J0 = false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void g1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
        if (t1Var == null || document == null) {
            return;
        }
        qn qnVar = this.a;
        if (qnVar.getParentLayout() == null || !e0(t1Var)) {
            return;
        }
        org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(qnVar, t1Var);
        H.c(R.drawable.msg_download, LocaleController.getString(R.string.SaveToDownloads), new t1(this, t1Var, document, 24), false);
        H.t = false;
        H.Z();
    }

    @Override // org.telegram.ui.Cells.k1
    public final void g2(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject primaryMessageObject = t1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.a.rc(primaryMessageObject, false);
    }

    @Override // org.telegram.ui.Cells.k1, org.telegram.ui.Cells.t0
    public final boolean h() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final String i(org.telegram.ui.Cells.t1 t1Var) {
        qn qnVar;
        int i9;
        if (t1Var.getMessageObject() == null || (i9 = (qnVar = this.a).sb) == 0 || i9 != t1Var.getMessageObject().getId() || qnVar.tb != 3) {
            return null;
        }
        return qnVar.vb;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void i0(int i9) {
        int i10;
        SpannableStringBuilder replaceTags;
        int i11;
        int i12 = 3;
        int i13 = 2;
        int i14 = 1;
        qn qnVar = this.a;
        try {
            if (i9 == 0) {
                qnVar.h7();
                xk xkVar = qnVar.v3;
                if (xkVar == null) {
                    return;
                }
                xkVar.l(0L, 84, null, new nm(this, i14));
                qnVar.v3.performHapticFeedback(3, 2);
                return;
            }
            if (i9 == 1) {
                String formatDateTime = LocaleController.formatDateTime(qnVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                if (qnVar.getMessagesController().transcribeAudioTrialCooldownUntil > 0) {
                    i11 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeftUntil", org.telegram.ui.Components.i21.h(i11), formatDateTime));
                } else {
                    i10 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeft", org.telegram.ui.Components.i21.h(i10), new Object[0]));
                }
                org.telegram.ui.Components.oc.a0(qnVar).G(R.raw.transcribe, 6, replaceTags).k(true);
                qnVar.fragmentView.performHapticFeedback(3, 2);
                return;
            }
            if (i9 == 2 || i9 == 3) {
                String formatDateTime2 = LocaleController.formatDateTime(qnVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                org.telegram.ui.Components.oc a02 = org.telegram.ui.Components.oc.a0(qnVar);
                int i15 = R.raw.transcribe;
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialEnd", qnVar.getMessagesController().transcribeAudioTrialWeeklyNumber, new Object[0]))).append((CharSequence) " ").append(i9 == 2 ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TranscriptionTrialEndBuy), new nm(this, i13)) : qnVar.getMessagesController().transcribeAudioTrialCooldownUntil <= 0 ? "" : AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TranscriptionTrialEndWaitOrBuy, formatDateTime2), new nm(this, i12)));
                a02.getClass();
                org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(a02.W(), a02.c);
                obVar.c(i15, 36, 36, new String[0]);
                if (append != null) {
                    String charSequence = append.toString();
                    int i16 = 0;
                    for (int indexOf = charSequence.indexOf(10); indexOf >= 0 && indexOf < append.length(); indexOf = charSequence.indexOf(10, indexOf + 1)) {
                        if (i16 >= 6) {
                            append.replace(indexOf, indexOf + 1, (CharSequence) " ");
                        }
                        i16++;
                    }
                }
                obVar.b.setText(append);
                obVar.b.setSingleLine(false);
                obVar.b.setMaxLines(6);
                a02.b(obVar, 7000).k(true);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
        } catch (Exception unused) {
        }
    }

    public final boolean j() {
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

    @Override // org.telegram.ui.Cells.k1
    public final boolean j0() {
        return this.a.N3 == 0;
    }

    public final void k(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i9, boolean z10) {
        qn qnVar = this.a;
        TLRPC.Chat chat2 = qnVar.e;
        if (chat2 != null && chat.id == chat2.id) {
            dj djVar = qnVar.W0;
            if (djVar != null && i9 == 0) {
                djVar.e(false, false);
                return;
            } else {
                if (t1Var.getMessageObject() != null) {
                    qnVar.j(i9, t1Var.getMessageObject().getId(), true, 0, false, 0);
                    return;
                }
                return;
            }
        }
        if (chat2 == null || chat.id != chat2.id || qnVar.F9()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (i9 != 0) {
                bundle.putInt("message_id", i9);
            }
            oi oiVar = null;
            if (z10) {
                ve.d dVar = qnVar.wb;
                if (dVar != null) {
                    dVar.a(true);
                    qnVar.wb = null;
                }
                if (t1Var.getMessageObject() == null) {
                    qnVar.wb = null;
                } else {
                    oi oiVar2 = new oi(qnVar, t1Var.getMessageObject().getId(), t1Var, 0);
                    qnVar.wb = oiVar2;
                    oiVar = oiVar2;
                }
            }
            if (qnVar.getMessagesController().checkCanOpenChat(bundle, qnVar, t1Var.getMessageObject(), oiVar)) {
                qn qnVar2 = new qn(bundle);
                if (oiVar == null || i9 == 0) {
                    qnVar.presentFragment(qnVar2);
                } else {
                    AndroidUtilities.runOnUIThread(new fh.g1(this, oiVar, chat, i9, qnVar2, 16), 5000L);
                    oiVar.d();
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void k0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
        this.a.I7(t1Var, true, false, f10, f11, false, false, false);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void k2() {
        this.a.r9();
    }

    @Override // org.telegram.ui.Cells.k1
    public final void l(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i9, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        int a2 = yg.i.a(messageObject);
        boolean a3 = g7.z7.a(a2, 7);
        qn qnVar = this.a;
        if (a3) {
            org.telegram.ui.Components.oc.a0(qnVar).Q(R.raw.e_hand_2, 36, yg.i.b(messageObject, a2)).j();
            return;
        }
        if (i9 < 0 && !arrayList.isEmpty()) {
            qnVar.getSendMessagesHelper().sendVote(messageObject, arrayList, null);
            t1Var.S0(true);
            return;
        }
        if (qnVar.getParentActivity() == null) {
            return;
        }
        if (qnVar.j2 == null) {
            org.telegram.ui.Components.s30 s30Var = new org.telegram.ui.Components.s30(5, qnVar.getParentActivity(), qnVar.aa, false);
            qnVar.j2 = s30Var;
            s30Var.setAlpha(0.0f);
            qnVar.j2.setVisibility(4);
            int indexOfChild = qnVar.T0.indexOfChild(qnVar.O);
            if (indexOfChild == -1) {
                return;
            } else {
                qnVar.T0.addView(qnVar.j2, indexOfChild + 1, g7.e6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            }
        }
        if (!arrayList.isEmpty() || i9 >= 0) {
            i12 = i11;
            i13 = i10;
        } else {
            ArrayList<org.telegram.ui.Cells.r1> pollButtons = t1Var.getPollButtons();
            int size = pollButtons.size();
            int i15 = 0;
            float f10 = 0.0f;
            while (true) {
                if (i15 >= size) {
                    i12 = i11;
                    i14 = i10;
                    break;
                }
                org.telegram.ui.Cells.r1 r1Var = pollButtons.get(i15);
                float y10 = ((t1Var.getY() + r1Var.b) - AndroidUtilities.dp(4.0f)) - qnVar.o9;
                qnVar.m2 = AndroidUtilities.dp(13.3f) + r1Var.a;
                int D = org.telegram.messenger.ll.D(6.0f, r1Var.b, i11);
                qnVar.n2 = D;
                if (y10 > 0.0f) {
                    i14 = qnVar.m2;
                    i12 = D;
                    f10 = 0.0f;
                    break;
                }
                i15++;
                f10 = y10;
            }
            if (f10 != 0.0f) {
                qnVar.t0.v0(0, (int) f10, null);
                qnVar.l2 = t1Var;
                return;
            }
            i13 = i14;
        }
        qnVar.j2.e(t1Var, Integer.valueOf(i9), i13, i12, true);
    }

    @Override // org.telegram.ui.Cells.k1
    public final int l0(org.telegram.ui.Cells.t1 t1Var) {
        yg.c cVar;
        qn qnVar = this.a;
        if (!qnVar.sc.f || (cVar = qnVar.yc) == null || cVar.n != t1Var || cVar.a.getWidth() <= 0) {
            return 0;
        }
        return qnVar.yc.a.getHeight();
    }

    @Override // org.telegram.ui.Cells.k1
    public final void l1(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
        ch.j jVar;
        ch.k kVar = this.a.T9;
        if (kVar == null || (jVar = (ch.j) kVar.a.get(ch.k.b(t1Var))) == null) {
            return;
        }
        ch.d[] dVarArr = jVar.w;
        RectF rectF = jVar.r;
        if (jVar.I) {
            float f12 = (f10 - rectF.left) + jVar.Q;
            float f13 = (f11 - rectF.top) + jVar.R;
            int i9 = ch.i.a;
            int b10 = (((float) (-AndroidUtilities.dp((float) 37))) >= f13 || f13 >= rectF.height()) ? -1 : g7.n.b((int) Math.floor((f12 - (AndroidUtilities.dp(9) - (AndroidUtilities.dp(11) / 2.0f))) / AndroidUtilities.dp(ch.i.a + 11)), 0, dVarArr.length - 1);
            if (jVar.N == b10) {
                return;
            }
            jVar.a.performHapticFeedback(3, 1);
            jVar.N = b10;
            int i10 = 0;
            while (i10 < dVarArr.length) {
                ch.d dVar = dVarArr[i10];
                boolean z10 = b10 == i10;
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
                    dVar.n.setInterpolator(ch.h.a);
                    dVar.n.start();
                }
                ch.d dVar2 = dVarArr[i10];
                boolean z11 = b10 == i10 || b10 == -1;
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
                    dVar2.k.setInterpolator(ch.h.a);
                    dVar2.k.start();
                }
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void l2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        this.a.W7(t1Var, reactionCount, z10, f10, f11);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void m() {
        e();
    }

    @Override // org.telegram.ui.Cells.k1
    public final void m0(org.telegram.ui.Cells.t1 t1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        qn qnVar = this.a;
        if (qnVar.getParentActivity() == null) {
            return;
        }
        if (qnVar.T9 == null) {
            ch.k kVar = new ch.k(qnVar.getParentActivity());
            qnVar.T9 = kVar;
            qnVar.T0.addView(kVar, g7.e6.e(-1, -1, 48));
        }
        ch.k kVar2 = qnVar.T9;
        HashMap hashMap = kVar2.a;
        ArrayList arrayList = kVar2.c;
        arrayList.clear();
        int i9 = kVar2.d;
        UserConfig userConfig = UserConfig.getInstance(i9);
        long j10 = userConfig.clientUserId;
        arrayList.add(Long.valueOf(j10));
        if (userConfig.suggestContacts) {
            ArrayList<TLRPC.TL_topPeer> arrayList2 = MediaDataController.getInstance(i9).hints;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.TL_topPeer tL_topPeer = arrayList2.get(i10);
                i10++;
                TLRPC.TL_topPeer tL_topPeer2 = tL_topPeer;
                long j11 = tL_topPeer2.peer.user_id;
                if (j11 != 0) {
                    int i11 = size;
                    if (MessagesController.getInstance(i9).getUser(Long.valueOf(tL_topPeer2.peer.user_id)) != null) {
                        arrayList.add(Long.valueOf(j11));
                    }
                    size = i11;
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(i9).getAllDialogs();
        for (int i12 = 0; i12 < allDialogs.size(); i12++) {
            TLRPC.Dialog dialog = allDialogs.get(i12);
            if (dialog instanceof TLRPC.TL_dialog) {
                long j12 = dialog.id;
                if (j12 != j10 && !DialogObject.isEncryptedDialog(j12)) {
                    if (DialogObject.isUserDialog(dialog.id)) {
                        TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(dialog.id));
                        if (user != null && !UserObject.isBot(user) && !UserObject.isDeleted(user) && !UserObject.isService(user.id)) {
                            if (dialog.folder_id == 1) {
                                arrayList3.add(Long.valueOf(dialog.id));
                            } else {
                                arrayList.add(Long.valueOf(dialog.id));
                            }
                        }
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-dialog.id));
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
        String b10 = ch.k.b(t1Var);
        if (b10 == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj = arrayList.get(i13);
            i13++;
            Long l10 = (Long) obj;
            if (hashSet.add(l10) && DialogObject.isUserDialog(l10.longValue())) {
                arrayList4.add(l10);
            }
        }
        ch.j jVar = new ch.j(kVar2, t1Var, arrayList4, new a1.e(21, kVar2, b10));
        jVar.setBounds(0, 0, kVar2.getMeasuredWidth(), kVar2.getMeasuredHeight());
        jVar.setCallback(kVar2);
        if (hashMap.containsKey(b10)) {
            return;
        }
        hashMap.put(b10, jVar);
    }

    public final void n(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            org.telegram.ui.ActionBar.o2 o2Var = this.a;
            if (o2Var.getMessagesController().checkCanOpenChat(bundle, o2Var, t1Var.getMessageObject())) {
                o2Var.presentFragment(new qn(bundle));
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean n2(int i9) {
        boolean z10;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        if (i9 != 16 && i9 != R.id.acc_action_small_button && i9 != R.id.acc_action_msg_options) {
            return false;
        }
        qn qnVar = this.a;
        z10 = ((org.telegram.ui.ActionBar.o2) qnVar).inPreviewMode;
        if (!z10 || !qnVar.F9) {
            return !f();
        }
        b5Var = ((org.telegram.ui.ActionBar.o2) qnVar).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.o2) qnVar).parentLayout;
            ((ActionBarLayout) b5Var2).r();
        }
        return true;
    }

    public final void o(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            bundle.putBoolean("expandPhoto", false);
            this.a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean o0() {
        boolean z10;
        qn qnVar = this.a;
        if (qnVar.A9()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.o2) qnVar).inPreviewMode;
        return !z10;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void o2() {
        qn qnVar = this.a;
        if (!qnVar.getUserConfig().isPremium()) {
            org.telegram.ui.Components.oc.a0(qnVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("UnlockSimilarChannelsPremium", qnVar.getMessagesController().recommendedChannelsLimitPremium), new nm(this, 4))).j();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", qnVar.P5);
        bundle.putInt("start_from", 10);
        qnVar.presentFragment(new org.telegram.ui.Components.k90(bundle, qnVar.W0.getSharedMediaPreloader()));
    }

    public final void p(TLRPC.User user, boolean z10) {
        int i9;
        if (user == null || user.id == UserObject.VERIFY) {
            return;
        }
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        int i10 = 0;
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
            i10 = 1;
        }
        profileActivity.N4(i10);
        Activity parentActivity = qnVar.getParentActivity();
        i9 = ((org.telegram.ui.ActionBar.o2) qnVar).classGuid;
        AndroidUtilities.setAdjustResizeToNothing(parentActivity, i9);
        qnVar.presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void p2(org.telegram.ui.Cells.t1 t1Var, int i9, int i10) {
        MessageObject messageObject;
        TLRPC.TL_factCheck factCheck;
        String str;
        qn qnVar = this.a;
        kh.x3 x3Var = qnVar.w1;
        if (x3Var != null) {
            x3Var.e(true);
        }
        if (qnVar.getParentActivity() == null || (messageObject = t1Var.getMessageObject()) == null || (factCheck = messageObject.getFactCheck()) == null || factCheck.country == null) {
            return;
        }
        try {
            str = new Locale("", factCheck.country).getDisplayCountry(LocaleController.getInstance().getCurrentLocale());
        } catch (Exception e10) {
            FileLog.e(e10);
            str = factCheck.country;
        }
        kh.x3 x3Var2 = new kh.x3(qnVar.getParentActivity(), 3);
        x3Var2.q(true);
        x3Var2.G = Layout.Alignment.ALIGN_NORMAL;
        x3Var2.d = -1L;
        x3Var2.P = true;
        x3Var2.e = true;
        x3Var2.r(12.0f);
        qnVar.w1 = x3Var2;
        x3Var2.h0 = new rd(18, this, x3Var2);
        x3Var2.t(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FactCheckToast, str)));
        qnVar.T0.addView(qnVar.w1, g7.e6.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
        qnVar.T0.post(new h3.e0(this, t1Var, i10, i9, 4));
    }

    @Override // org.telegram.ui.Cells.k1
    public final void q(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9) {
        int i10;
        TLRPC.Document document;
        int i11;
        TLRPC.PollResults pollResults;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document2;
        int i12;
        TLRPC.Document document3;
        int i13;
        int i14;
        int i15;
        int i16;
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        MessageObject messageObject = t1Var.getMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if (messageMedia == null || messageObject == null || !(media instanceof TLRPC.TL_messageMediaPoll)) {
            return;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media;
        TLRPC.WebPage webPage = messageMedia.webpage;
        if (webPage != null) {
            D1(t1Var, webPage, webPage.url, messageMedia.safe);
            return;
        }
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        qn qnVar = this.a;
        if (geoPoint != null) {
            if (AndroidUtilities.isMapsInstalled(qnVar)) {
                zm zmVar = new zm(3);
                b6Var2 = ((org.telegram.ui.ActionBar.o2) qnVar).resourceProvider;
                zmVar.setResourceProvider(b6Var2);
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
                zmVar.K0 = false;
                zmVar.t0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                qnVar.presentFragment(zmVar);
                return;
            }
            return;
        }
        if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
            ht.q().w(qnVar.getParentActivity());
            ht.q().v(new an(this, tL_messageMediaPoll, pollAnswer, t1Var));
            ht q10 = ht.q();
            TLRPC.Document document4 = messageMedia.document;
            int i17 = MessageObject.isAnimatedEmoji(document4) ? 2 : 0;
            MessageObject messageObject2 = t1Var.getMessageObject();
            b6Var = ((org.telegram.ui.ActionBar.o2) qnVar).resourceProvider;
            q10.t(document4, null, "", null, null, i17, false, messageObject2, b6Var, 200);
            return;
        }
        if (MessageObject.isMusicDocument(messageMedia.document)) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (MediaController.getInstance().isPlayingMessage(messageObject) && playingMessageObject != null) {
                if (playingMessageObject.isPlayingExplanationObject == (i9 == -3)) {
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
            TLRPC.TL_message C7 = qn.C7(message);
            C7.media = messageMedia;
            C7.attachPath = yg.f.c(message, i9);
            ArrayList<MessageObject> arrayList = new ArrayList<>();
            i16 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
            MessageObject messageObject3 = new MessageObject(i16, C7, false, true);
            messageObject3.isPlayingExplanationObject = i9 == -3;
            arrayList.add(messageObject3);
            if (MediaController.getInstance().isPlayingMessage(messageObject)) {
                MediaController.getInstance().cleanupPlayer(false, true);
            }
            MediaController.getInstance().setPlaylist(arrayList, messageObject3, 0L);
            return;
        }
        TLRPC.Document document5 = messageMedia.document;
        if (document5 != null && !MessageObject.isVideoDocument(document5)) {
            i14 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
            TLRPC.Document document6 = messageMedia.document;
            yg.a aVar = new yg.a(i14, messageObject, document6, yg.f.c(messageObject.messageOwner, i9));
            if (aVar.g) {
                FileLoader.getInstance(i14).cancelLoadFile(document6);
                aVar.a();
                MessageObject messageObject4 = t1Var.u7;
                if (messageObject4 == null || !messageObject4.isPoll()) {
                    return;
                }
                yg.g gVar = t1Var.Y5;
                if (gVar != null) {
                    gVar.d();
                }
                yg.g gVar2 = t1Var.X5;
                if (gVar2 != null) {
                    gVar2.d();
                    return;
                }
                return;
            }
            if (!aVar.f) {
                FileLoader.getInstance(i14).loadFile(document6, messageObject, 2, 0);
                aVar.a();
                MessageObject messageObject5 = t1Var.u7;
                if (messageObject5 == null || !messageObject5.isPoll()) {
                    return;
                }
                yg.g gVar3 = t1Var.Y5;
                if (gVar3 != null) {
                    gVar3.d();
                }
                yg.g gVar4 = t1Var.X5;
                if (gVar4 != null) {
                    gVar4.d();
                    return;
                }
                return;
            }
            TLRPC.Message message2 = messageObject.messageOwner;
            TLRPC.TL_message C72 = qn.C7(message2);
            C72.media = messageMedia;
            C72.attachPath = yg.f.c(message2, i9);
            i15 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
            bn bnVar = new bn(i15, C72, false, true);
            if (MessageObject.canPreviewDocument(messageMedia.document)) {
                PhotoViewer.t1().K2(null, qnVar, qnVar.aa);
                PhotoViewer t12 = PhotoViewer.t1();
                int i18 = bnVar.type;
                t12.c2(bnVar, qnVar, i18 != 0 ? qnVar.P5 : 0L, i18 != 0 ? qnVar.H6 : 0L, i18 != 0 ? qnVar.b() : 0L, qnVar.Ba);
                return;
            }
            try {
                AndroidUtilities.openForView(bnVar, qnVar.getParentActivity(), qnVar.aa, false);
                return;
            } catch (Exception e10) {
                FileLog.e(e10);
                qnVar.z6(bnVar);
                return;
            }
        }
        TLRPC.Message message3 = messageObject.messageOwner;
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
        if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || MessageObject.isVideoDocument(document3))) {
            i10 = messageMedia3 == messageMedia ? arrayList3.size() : -1;
            TLRPC.TL_message C73 = qn.C7(message3);
            C73.media = messageMedia3;
            C73.attachPath = yg.f.c(message3, -2);
            i13 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
            arrayList3.add(new sm(i13, C73, false, true));
            arrayList2.add(-2);
        } else {
            i10 = -1;
        }
        if (messageObject.expandedExplanation && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || MessageObject.isVideoDocument(document2))) {
            if (messageMedia2 == messageMedia) {
                i10 = arrayList3.size();
            }
            TLRPC.TL_message C74 = qn.C7(message3);
            C74.media = messageMedia2;
            C74.attachPath = yg.f.c(message3, -3);
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            C74.message = pollResults2.solution;
            C74.entities = pollResults2.solution_entities;
            i12 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
            arrayList3.add(new tm(i12, C74, false, true));
            arrayList2.add(-3);
        }
        gf.d.b(tL_messageMediaPoll.poll, qnVar.getUserConfig().getClientUserId());
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        ArrayList<TLRPC.PollAnswer> arrayList4 = poll.shuffled_answers;
        if (arrayList4 == null) {
            arrayList4 = poll.answers;
        }
        for (int i19 = 0; i19 < arrayList4.size(); i19++) {
            TLRPC.PollAnswer pollAnswer2 = arrayList4.get(i19);
            TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
            if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || MessageObject.isVideoDocument(document))) {
                if (pollAnswer2.unshuffled_index == i9) {
                    i10 = arrayList3.size();
                }
                TLRPC.TL_message C75 = qn.C7(message3);
                C75.media = messageMedia4;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                C75.message = tL_textWithEntities2.text;
                C75.entities = tL_textWithEntities2.entities;
                C75.attachPath = yg.f.c(message3, pollAnswer2.unshuffled_index);
                i11 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                arrayList3.add(new um(i11, C75, false, true));
                arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
            }
        }
        if (i10 <= -1 || arrayList3.isEmpty()) {
            return;
        }
        messageObject.pollMediaMapping = arrayList2;
        PhotoViewer.t1().K2(null, qnVar, qnVar.aa);
        PhotoViewer.t1().a2(arrayList3, i10, qnVar.a(), 0L, 0L, qnVar.Ca);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void q0(String str) {
        qn qnVar = this.a;
        fk fkVar = qnVar.K0;
        if (fkVar == null || fkVar.getVisibility() != 0) {
            ek ekVar = qnVar.N;
            if ((ekVar == null || ekVar.getVisibility() != 0) && qnVar.U != null && str != null && str.length() > 0) {
                qnVar.U.setFieldText("@" + str + " ");
                qnVar.U.G0();
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final org.telegram.ui.Cells.o9 q2() {
        return this.a.Y8;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void r(org.telegram.ui.Cells.t1 t1Var) {
        if (t1Var.getMessageObject().isImportedForward()) {
            d1();
            return;
        }
        qn qnVar = this.a;
        if (qnVar.h3 || qnVar.t0 == null || qnVar.getParentActivity() == null || qnVar.fragmentView == null) {
            return;
        }
        if (qnVar.q2 == null) {
            im imVar = qnVar.T0;
            int indexOfChild = imVar.indexOfChild(qnVar.O);
            if (indexOfChild == -1) {
                return;
            }
            org.telegram.ui.Components.s30 s30Var = new org.telegram.ui.Components.s30(1, qnVar.getParentActivity(), qnVar.aa, false);
            qnVar.q2 = s30Var;
            imVar.addView(s30Var, indexOfChild + 1, g7.e6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            qnVar.q2.setAlpha(0.0f);
            qnVar.q2.setVisibility(4);
        }
        qnVar.q2.e(t1Var, null, 0, 0, true);
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean r0(org.telegram.ui.Components.t5 t5Var) {
        TLRPC.InputStickerSet inputStickerSet;
        int i9;
        qn qnVar = this.a;
        if (qnVar.getMessagesController().premiumFeaturesBlocked() || t5Var == null || t5Var.standard) {
            return false;
        }
        long documentId = t5Var.getDocumentId();
        TLRPC.Document document = t5Var.document;
        if (document == null) {
            i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
            document = org.telegram.ui.Components.k5.f(i9, documentId);
        }
        if (document == null || (inputStickerSet = MessageObject.getInputStickerSet(document)) == null) {
            return false;
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, true);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(inputStickerSet);
        org.telegram.ui.Components.dv dvVar = new org.telegram.ui.Components.dv(qnVar, qnVar.getParentActivity(), qnVar.aa, arrayList);
        org.telegram.ui.Components.tu tuVar = dvVar.f;
        tuVar.getClass();
        ImageReceiver imageReceiver = new ImageReceiver(tuVar);
        tuVar.v = imageReceiver;
        if (tuVar.d) {
            imageReceiver.onAttachedToWindow();
        }
        tuVar.w = true;
        tuVar.x.d(1.0f, true);
        tuVar.v.setImage(ImageLocation.getForDocument(document), "140_140", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "140_140", DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.f6.m6, 0.2f, true), 0L, null, null, 0);
        tuVar.v.setLayerNum(7);
        tuVar.v.setAllowStartLottieAnimation(true);
        tuVar.v.setAllowStartAnimation(true);
        tuVar.v.setAutoRepeat(1);
        tuVar.v.setAllowDecodeSingleFrame(true);
        tuVar.v.setParentView(tuVar);
        dvVar.setCalcMandatoryInsets(qnVar.x9());
        qnVar.showDialog(dvVar);
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean r1() {
        qn qnVar = this.a;
        return qnVar.T0.getMeasuredWidth() > qnVar.T0.getMeasuredHeight();
    }

    @Override // org.telegram.ui.Cells.k1
    public final void s() {
        this.a.T0.getClass();
    }

    @Override // org.telegram.ui.Cells.k1
    public final void s0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
        qn qnVar = this.a;
        qnVar.I7(t1Var, false, false, f10, f11, true, false, false);
        qnVar.t0.getClass();
        qn.c2(qnVar, RecyclerView.R(t1Var));
    }

    @Override // org.telegram.ui.Cells.k1
    public final void s1(org.telegram.ui.Cells.t1 t1Var) {
        qn.U4(this.a, t1Var);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void t1(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        g(t1Var, z10, false, false);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void u0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f10, float f11) {
        org.telegram.ui.ActionBar.k kVar;
        qn qnVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
        boolean z10 = true;
        if (kVar.s() || qnVar.A9()) {
            qn.b2(qnVar, t1Var, true, f10, f11);
            return;
        }
        if (t1Var.getMessageObject() != null && t1Var.getMessageObject().isSponsored()) {
            O0(10, t1Var);
            return;
        }
        if (!ChatObject.isForum(qnVar.e) && !qnVar.F9()) {
            z10 = false;
        }
        p(user, z10);
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
    public final void v(org.telegram.ui.Cells.t1 t1Var) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        int i9;
        TLRPC.MessageFwdHeader messageFwdHeader;
        boolean z10;
        int i10;
        TLRPC.Message message2;
        int i11;
        TLRPC.Peer peer;
        MessageObject.GroupedMessages groupedMessages;
        int i12;
        qn qnVar = this.a;
        if (qnVar.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.b21 b21Var = qnVar.N1;
        if (b21Var != null && qnVar.Z3 == 0 && (t1Var.P7 || t1Var.Q7)) {
            b21Var.m(t1Var.getMessageObject().getTopicId(), true);
            return;
        }
        if (qnVar.getMessagesController().isFrozen()) {
            i12 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
            b.b(i12);
            return;
        }
        ak akVar = qnVar.U;
        if (akVar != null) {
            akVar.O();
        }
        MessageObject messageObject = t1Var.getMessageObject();
        int i13 = qnVar.N3;
        if (i13 == 2) {
            qnVar.R8.P0(messageObject.getId());
            qnVar.finishFragment();
            return;
        }
        if (i13 == 3 || ((i13 == 7 && qnVar.K3 == 2) || !((!UserObject.isReplyUser(qnVar.f) && !UserObject.isUserSelf(qnVar.f)) || (messageFwdHeader = messageObject.messageOwner.fwd_from) == null || messageFwdHeader.saved_from_peer == null))) {
            if (UserObject.isReplyUser(qnVar.f) && (messageReplyHeader = (message = messageObject.messageOwner).reply_to) != null && (i9 = messageReplyHeader.reply_to_top_id) != 0) {
                qnVar.aa(messageReplyHeader.reply_to_peer_id.channel_id, null, i9, 0L, -1, message.fwd_from.saved_from_msg_id, messageObject);
                return;
            } else if (qnVar.N3 == 7 && qnVar.K3 == 2) {
                qnVar.fa(messageObject);
                return;
            } else {
                qnVar.ga(messageObject);
                return;
            }
        }
        ArrayList<MessageObject> arrayList = (messageObject.getGroupId() == 0 || (groupedMessages = (MessageObject.GroupedMessages) qnVar.t6.f(messageObject.getGroupId())) == null) ? null : groupedMessages.messages;
        if (arrayList == null) {
            arrayList = org.telegram.messenger.l0.k(messageObject);
        }
        if (qnVar.getMessagesController().storiesEnabled() && !messageObject.isSponsored() && (((message2 = messageObject.messageOwner) == null || !message2.noforwards) && (i11 = messageObject.type) != 17 && i11 != 12)) {
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
                qnVar.showDialog(new wm(this, qnVar.getParentActivity(), qnVar, arrayList, ChatObject.isChannel(qnVar.e), z10, qnVar.aa, z10, messageObject));
                Activity parentActivity = qnVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.o2) qnVar).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                qnVar.fragmentView.requestLayout();
            }
        }
        z10 = false;
        qnVar.showDialog(new wm(this, qnVar.getParentActivity(), qnVar, arrayList, ChatObject.isChannel(qnVar.e), z10, qnVar.aa, z10, messageObject));
        Activity parentActivity2 = qnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.o2) qnVar).classGuid;
        AndroidUtilities.setAdjustResizeToNothing(parentActivity2, i10);
        qnVar.fragmentView.requestLayout();
    }

    @Override // org.telegram.ui.Cells.k1
    public final void w() {
        this.a.Yb();
    }

    /* JADX WARN: Code restructure failed: missing block: B:277:0x0b01, code lost:
    
        if (r2.exists() != false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0bcb, code lost:
    
        if (r4.startsWith("text/x-web-markdown") == false) goto L319;
     */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0c15 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:327:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Cells.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11, boolean z10) {
        int i9;
        qn qnVar;
        MessageObject messageObject;
        boolean z11;
        qn qnVar2;
        boolean z12;
        MessageObject messageObject2;
        long j10;
        long j11;
        long j12;
        File file;
        TLRPC.Chat chat;
        bu0 E;
        char c10;
        bu0 bu0Var;
        int i10;
        float f12;
        float f13;
        char c11;
        MessageObject messageObject3;
        MessageObject messageObject4;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        int i11;
        MessageObject messageObject5 = t1Var.getMessageObject();
        int i12 = messageObject5.type;
        qn qnVar3 = this.a;
        if (i12 == 23) {
            TLRPC.MessageMedia messageMedia2 = messageObject5.messageOwner.media;
            TL_stories.StoryItem storyItem = messageMedia2.storyItem;
            if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                return;
            }
            storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia2.peer);
            storyItem.messageId = messageObject5.getId();
            storyItem.messageType = 2;
            ih.p7.b(storyItem, qnVar3.f);
            qnVar3.getOrCreateStoryViewer().F(qnVar3.getParentActivity(), messageObject5.messageOwner.media.storyItem, ih.e7.a(qnVar3.t0));
            return;
        }
        int i13 = 1;
        if (messageObject5.isVideo()) {
            i11 = ((org.telegram.ui.ActionBar.o2) qnVar3).currentAccount;
            if (DownloadController.getInstance(i11).canDownloadMedia(messageObject5.messageOwner) == 1) {
                messageObject5.putInDownloadsStore = true;
            }
        } else {
            messageObject5.putInDownloadsStore = true;
        }
        if (messageObject5.isSendError()) {
            qnVar3.I7(t1Var, false, false, f10, f11, true, false, false);
            return;
        }
        if (messageObject5.isSending()) {
            return;
        }
        int i14 = 0;
        if (z10 && (message = messageObject5.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && !TextUtils.isEmpty(webPage.url)) {
            String str = messageObject5.messageOwner.media.webpage.url;
            AndroidUtilities.getHostAuthority(str);
            if (qnVar3.ea(str, t1Var, null, messageObject5.getId(), 2)) {
                return;
            }
            ve.d dVar = qnVar3.wb;
            if (dVar != null) {
                dVar.a(true);
            }
            qnVar3.wb = t1Var.getMessageObject() != null ? new vm(this, t1Var, i14) : null;
            ve.e.r(qnVar3.getParentActivity(), Uri.parse(str), true, false, false, qnVar3.wb, null, false, true, false);
            return;
        }
        int i15 = 4;
        if (messageObject5.isDice()) {
            om omVar = new om(this, messageObject5, i14);
            if (messageObject5.isStakeableDice()) {
                qnVar3.getMessagesController().loadStakeDiceInfo(new a0(this, messageObject5, omVar, i15));
                return;
            } else {
                omVar.run();
                return;
            }
        }
        if ((messageObject5.isAnimatedEmoji() && (!messageObject5.isAnimatedAnimatedEmoji() || (qnVar3.ta.e.containsKey(py.q(MessageObject.findAnimatedEmojiEmoticon(messageObject5.getDocument()))) && qnVar3.f != null))) || messageObject5.isPremiumSticker()) {
            qnVar3.Na(t1Var);
            qnVar3.ta.l(t1Var, qnVar3, true);
            qnVar3.t0.I0(false);
            return;
        }
        int i16 = 6;
        if (messageObject5.needDrawBluredPreview()) {
            me fb2 = qnVar3.fb(messageObject5, false);
            e5.w O4 = qn.O4(qnVar3, messageObject5);
            t1Var.invalidate();
            final SecretMediaViewer f14 = SecretMediaViewer.f();
            final Activity parentActivity = qnVar3.getParentActivity();
            int i17 = UserConfig.selectedAccount;
            f14.a = i17;
            ImageReceiver imageReceiver = f14.h;
            imageReceiver.setCurrentAccount(i17);
            if (f14.b != parentActivity) {
                f14.b = parentActivity;
                f14.c1 = new org.telegram.ui.Components.yl0(parentActivity, null);
                m0 m0Var = new m0(f14, parentActivity, 21);
                f14.d = m0Var;
                m0Var.setBackgroundDrawable(f14.h0);
                f14.d.setFocusable(true);
                f14.d.setFocusableInTouchMode(true);
                f14.d.setClipChildren(false);
                f14.d.setClipToPadding(false);
                f14.e = new fh.v(f14, parentActivity);
                View view = new View(parentActivity);
                f14.f = view;
                view.setBackgroundColor(2130706432);
                f14.e.addView(f14.f, g7.e6.e(-1, -2, 80));
                f14.e.setFocusable(false);
                f14.d.addView(f14.e);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f14.e.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                layoutParams.gravity = 51;
                f14.e.setLayoutParams(layoutParams);
                f14.e.setFitsSystemWindows(true);
                f14.e.setOnApplyWindowInsetsListener(new q31(f14, 0));
                f14.e.setSystemUiVisibility(1792);
                GestureDetector gestureDetector = new GestureDetector(f14.e.getContext(), f14);
                f14.H0 = gestureDetector;
                gestureDetector.setOnDoubleTapListener(f14);
                org.telegram.ui.Components.r7 r7Var = new org.telegram.ui.Components.r7(f14, parentActivity, i16);
                f14.B = r7Var;
                r7Var.setTitleColor(-1);
                f14.B.setSubtitleColor(-1);
                f14.B.setBackgroundColor(2130706432);
                f14.B.setOccupyStatusBar(true);
                f14.B.A(1090519039, false);
                f14.B.C(-1, false);
                f14.B.setBackButtonImage(R.drawable.ic_ab_back);
                f14.B.setTitleRightMargin(AndroidUtilities.dp(70.0f));
                f14.e.addView(f14.B, g7.e6.c(-2.0f, -1));
                f14.B.setActionBarMenuOnItemClick(new cd0(f14, 23));
                kh.x3 x3Var = new kh.x3(parentActivity, 1);
                f14.r = x3Var;
                x3Var.m(1.0f, -26.0f);
                f14.r.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                f14.e.addView(f14.r, g7.e6.d(-1, 80.0f, 53, 0.0f, 48.0f, 0.0f, 0.0f));
                w31 w31Var = new w31(f14, parentActivity);
                f14.n = w31Var;
                f14.e.addView(w31Var, g7.e6.d(119, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
                fv0 fv0Var = new fv0(f14, i13);
                f14.Q = new x31(f14, parentActivity);
                View view2 = new View(parentActivity);
                f14.P = view2;
                view2.setBackgroundColor(2130706432);
                f14.Q.addView(f14.P, g7.e6.e(-1, -1, 119));
                org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(f14.e.getContext());
                f14.O = h5Var;
                h5Var.setTextColor(-1);
                f14.O.setGravity(53);
                f14.O.setTextSize(14);
                f14.O.setImportantForAccessibility(2);
                f14.Q.addView(f14.O, g7.e6.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
                yi0 yi0Var = new yi0(f14, parentActivity, 7);
                f14.N = yi0Var;
                org.telegram.ui.Components.m61 m61Var = new org.telegram.ui.Components.m61(yi0Var);
                f14.M = m61Var;
                m61Var.z = AndroidUtilities.dp(2.0f);
                org.telegram.ui.Components.m61 m61Var2 = f14.M;
                m61Var2.k = 872415231;
                m61Var2.l = 872415231;
                m61Var2.m = -1;
                m61Var2.n = -1;
                m61Var2.A = 1509949439;
                m61Var2.j = fv0Var;
                f14.Q.addView(f14.N);
                f14.e.addView(f14.Q, g7.e6.e(-1, 48, 80));
                tr0 tr0Var = new tr0(null, new ih.b());
                f14.U = tr0Var;
                tr0Var.k0 = true;
                tr0Var.i0 = false;
                pt0 pt0Var = new pt0(f14.e.getContext());
                f14.V = pt0Var;
                pt0Var.setFactory(new ViewSwitcher.ViewFactory() { // from class: org.telegram.ui.r31
                    @Override // android.widget.ViewSwitcher.ViewFactory
                    public final View makeView() {
                        SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
                        return new ot0(parentActivity, secretMediaViewer.W, secretMediaViewer.U, new a5(secretMediaViewer, 22), new xf0(secretMediaViewer, 2));
                    }
                });
                f14.V.setVisibility(4);
                if (!f14.s1) {
                    f14.s1 = true;
                    f14.V.setLayerType(2, null);
                    f14.V.getCurrentView().setLayerType(2, null);
                    f14.V.getNextView().setLayerType(2, null);
                }
                ImageView imageView = new ImageView(parentActivity);
                f14.R = imageView;
                imageView.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(64.0f), 1711276032));
                org.telegram.ui.Components.qf0 qf0Var = new org.telegram.ui.Components.qf0(28);
                f14.S = qf0Var;
                qf0Var.setCallback(f14.R);
                f14.R.setImageDrawable(f14.S);
                f14.R.setScaleType(ImageView.ScaleType.CENTER);
                f14.R.setScaleX(0.6f);
                f14.R.setScaleY(0.6f);
                f14.R.setAlpha(0.0f);
                f14.R.setPivotX(AndroidUtilities.dp(32.0f));
                f14.R.setPivotY(AndroidUtilities.dp(32.0f));
                f14.e.addView(f14.R, g7.e6.e(64, 64, 17));
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
                org.telegram.ui.Cells.z9 o6 = f14.U.o(f14.d.getContext());
                if (o6 != null) {
                    AndroidUtilities.removeFromParent(o6);
                    f14.e.addView(o6);
                }
                f14.U.T(f14.e);
                f14.U.j0 = true;
            }
            SecretMediaViewer f15 = SecretMediaViewer.f();
            el elVar = qnVar3.Ba;
            SecretMediaViewer.PhotoBackgroundDrawable photoBackgroundDrawable = f15.h0;
            ImageReceiver imageReceiver2 = f15.h;
            if (f15.b == null || !messageObject5.needDrawBluredPreview() || elVar == null || (E = elVar.E(messageObject5, null, 0, true, false)) == null) {
                return;
            }
            f15.m1 = messageObject5.messageOwner.ttl == Integer.MAX_VALUE;
            f15.l1 = O4;
            f15.J = elVar;
            f15.G = System.currentTimeMillis();
            f15.H = 0L;
            f15.g0 = true;
            f15.f0 = true;
            f15.l0 = false;
            c5.c cVar = f15.w;
            if (cVar != null) {
                cVar.setVisibility(4);
            }
            f15.i();
            f15.J0 = 0.0f;
            f15.K0 = 1.0f;
            f15.L0 = 0.0f;
            f15.M0 = 0.0f;
            f15.N0 = 0.0f;
            f15.O0 = 0.0f;
            f15.P0 = 0.0f;
            f15.Q0 = 0.0f;
            f15.V0 = false;
            f15.W0 = false;
            f15.X0 = false;
            f15.Y0 = false;
            f15.Z0 = true;
            f15.n(f15.u0);
            photoBackgroundDrawable.setAlpha(0);
            f15.e.setAlpha(1.0f);
            f15.e.setVisibility(0);
            f15.n.setAlpha(1.0f);
            f15.F = false;
            f15.D = false;
            f15.E = false;
            f15.I = true;
            imageReceiver2.setManualAlphaAnimator(false);
            f15.K = 0;
            f15.L = 0;
            RectF rectF = new RectF(E.a.getDrawRegion());
            rectF.left = Math.max(rectF.left, E.a.getImageX());
            rectF.top = Math.max(rectF.top, E.a.getImageY());
            rectF.right = Math.min(rectF.right, E.a.getImageX2());
            rectF.bottom = Math.min(rectF.bottom, E.a.getImageY2());
            float width = rectF.width();
            float height = rectF.height();
            Point point = AndroidUtilities.displaySize;
            f15.u0 = Math.max(width / point.x, height / (point.y + AndroidUtilities.statusBarHeight));
            int[] iArr = E.h;
            if (iArr != null) {
                f15.D0 = new int[iArr.length];
                int i18 = 0;
                while (true) {
                    int[] iArr2 = E.h;
                    c10 = 1;
                    if (i18 >= iArr2.length) {
                        break;
                    }
                    f15.D0[i18] = iArr2[i18];
                    i18++;
                }
            } else {
                c10 = 1;
                f15.D0 = null;
            }
            float f16 = E.b;
            float f17 = rectF.left;
            f15.s0 = ((width / 2.0f) + (f16 + f17)) - (r7 / 2);
            f15.t0 = ((height / 2.0f) + (E.c + rectF.top)) - (r6 / 2);
            f15.r0 = Math.abs(f17 - E.a.getImageX());
            int abs = (int) Math.abs(rectF.top - E.a.getImageY());
            E.d.getLocationInWindow(new int[2]);
            float f18 = (r6[c10] - (E.c + rectF.top)) + E.j;
            f15.n0 = f18;
            float f19 = abs;
            f15.n0 = Math.max(0.0f, Math.max(f18, f19));
            float height2 = (((E.c + rectF.top) + ((int) height)) - (E.d.getHeight() + r6[c10])) + E.i;
            f15.o0 = height2;
            f15.o0 = Math.max(0.0f, Math.max(height2, f19));
            f15.p0 = 0.0f;
            f15.p0 = Math.max(0.0f, Math.max(0.0f, f19));
            f15.q0 = 0.0f;
            f15.q0 = Math.max(0.0f, Math.max(0.0f, f19));
            f15.F0 = System.currentTimeMillis();
            f15.v0 = 0.0f;
            f15.w0 = 0.0f;
            f15.z0 = 0.0f;
            f15.B0 = 0.0f;
            f15.C0 = 0.0f;
            f15.y0 = 0.0f;
            f15.A0 = 0.0f;
            f15.x0 = 1.0f;
            f15.E0 = true;
            f15.a1 = true;
            ff.t0 t0Var = f15.h1;
            if (t0Var != null) {
                t0Var.destroy();
                f15.h1 = null;
            }
            LaunchActivity launchActivity = LaunchActivity.C1;
            f15.h1 = launchActivity != null ? new ff.t0(launchActivity, true) : null;
            NotificationCenter.getInstance(f15.a).addObserver(f15, NotificationCenter.messagesDeleted);
            NotificationCenter.getInstance(f15.a).addObserver(f15, NotificationCenter.updateMessageMedia);
            NotificationCenter.getInstance(f15.a).addObserver(f15, NotificationCenter.didCreatedNewDeleteTask);
            f15.v = MessageObject.getPeerId(messageObject5.messageOwner.peer_id);
            f15.d0 = messageObject5;
            TLRPC.Document document = messageObject5.getDocument();
            ImageReceiver.BitmapHolder bitmapHolder = f15.e0;
            if (bitmapHolder != null) {
                bitmapHolder.release();
                f15.e0 = null;
            }
            f15.e0 = E.a.getThumbBitmapSafe();
            f15.Q.setVisibility(8);
            if (document != null) {
                int i19 = 0;
                while (true) {
                    if (i19 >= document.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i19);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) documentAttribute;
                        f15.K = tL_documentAttributeVideo.w;
                        f15.L = tL_documentAttributeVideo.h;
                        break;
                    }
                    i19++;
                }
                if (MessageObject.isGifDocument(document)) {
                    f15.B.setTitle(LocaleController.getString(R.string.DisappearingGif));
                    String str2 = messageObject5.messageOwner.attachPath;
                    ImageLocation forDocument = (str2 == null || !messageObject5.attachPathExists) ? ImageLocation.getForDocument(document) : ImageLocation.getForPath(str2);
                    f12 = 0.0f;
                    f13 = 1.0f;
                    bu0Var = E;
                    messageObject4 = messageObject5;
                    c11 = 6;
                    ImageLocation imageLocation = forDocument;
                    i10 = -1;
                    imageReceiver2.setImage(imageLocation, (String) null, f15.e0 != null ? new BitmapDrawable(f15.e0.bitmap) : null, -1L, (String) null, messageObject4, 1);
                } else {
                    bu0Var = E;
                    i10 = -1;
                    f12 = 0.0f;
                    f13 = 1.0f;
                    c11 = 6;
                    f15.X = 1;
                    f15.B.setTitle(LocaleController.getString(R.string.DisappearingVideo));
                    File file2 = new File(messageObject5.messageOwner.attachPath);
                    if (file2.exists()) {
                        f15.h(file2);
                    } else {
                        File pathToMessage = FileLoader.getInstance(f15.a).getPathToMessage(messageObject5.messageOwner);
                        File file3 = new File(pathToMessage.getAbsolutePath() + ".enc");
                        if (file3.exists()) {
                            pathToMessage = file3;
                        }
                        f15.h(pathToMessage);
                    }
                    f15.F = true;
                    f15.Q.setVisibility(0);
                    messageObject4 = messageObject5;
                    imageReceiver2.setImage((ImageLocation) null, (String) null, f15.e0 != null ? new BitmapDrawable(f15.e0.bitmap) : null, -1L, (String) null, messageObject4, 2);
                }
                messageObject3 = messageObject4;
            } else {
                bu0Var = E;
                i10 = -1;
                f12 = 0.0f;
                f13 = 1.0f;
                c11 = 6;
                f15.B.setTitle(LocaleController.getString(R.string.DisappearingPhoto));
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject5.photoThumbs, AndroidUtilities.getPhotoSize());
                imageReceiver2.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject5.photoThumbsObject), (String) null, f15.e0 != null ? new BitmapDrawable(f15.e0.bitmap) : null, -1L, (String) null, messageObject5, 2);
                messageObject3 = messageObject5;
                if (closestPhotoSizeWithSize != null) {
                    f15.K = closestPhotoSizeWithSize.w;
                    f15.L = closestPhotoSizeWithSize.h;
                }
            }
            f15.j(messageObject3, "", false);
            f15.j(messageObject3, messageObject3.caption, true);
            f15.m(true, false);
            f15.k(false, false);
            f15.S.a(true, true);
            if (f15.m1) {
                w31 w31Var2 = f15.n;
                w31Var2.e = true;
                TextPaint textPaint = w31Var2.r;
                textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
                textPaint.setColor(i10);
                StaticLayout staticLayout = new StaticLayout("1", textPaint, 999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                w31Var2.s = staticLayout;
                w31Var2.v = staticLayout.getLineCount() > 0 ? w31Var2.s.getLineWidth(0) : 0.0f;
                w31Var2.w = w31Var2.s.getHeight();
                w31Var2.invalidate();
                f15.n.setOnClickListener(new w21(f15, 4));
            } else {
                f15.n.setOnClickListener(null);
            }
            try {
                if (f15.d.getParent() != null) {
                    ((WindowManager) f15.b.getSystemService("window")).removeView(f15.d);
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            ((WindowManager) f15.b.getSystemService("window")).addView(f15.d, f15.c);
            f15.n.invalidate();
            f15.s = true;
            Window window = f15.b.getWindow();
            f15.k1 = AndroidUtilities.getLightNavigationBar(window);
            AndroidUtilities.setLightNavigationBar(f15.b, false);
            AndroidUtilities.setLightNavigationBar((View) f15.d, false);
            Activity activity = f15.b;
            if (activity instanceof LaunchActivity) {
                f15.j1 = Build.VERSION.SDK_INT >= 26 ? ((LaunchActivity) activity).getWindow().getNavigationBarColor() : 0;
                ((LaunchActivity) f15.b).y(-16777216);
            } else {
                f15.j1 = window.getNavigationBarColor();
                AndroidUtilities.setNavigationBarColor(f15.b, -16777216);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            f15.G0 = animatorSet;
            org.telegram.ui.Components.r7 r7Var2 = f15.B;
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r7Var2, (Property<org.telegram.ui.Components.r7, Float>) property, 0.0f, 1.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(f15.W, (Property<zs0, Float>) property, 0.0f, 1.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(f15.r, (Property<kh.x3, Float>) property, 0.0f, 1.0f);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.m6.d, 0, 255);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(f15, f15.r1, 0.0f, 1.0f);
            x31 x31Var = f15.Q;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(x31Var, x31Var.n, f13);
            x31 x31Var2 = f15.Q;
            if (f15.F) {
                f12 = 1.0f;
            }
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(x31Var2, (Property<x31, Float>) property, f12);
            Animator[] animatorArr = new Animator[7];
            animatorArr[0] = ofFloat;
            animatorArr[1] = ofFloat2;
            animatorArr[2] = ofFloat3;
            int i20 = 3;
            animatorArr[3] = ofInt;
            animatorArr[4] = ofFloat4;
            animatorArr[5] = ofFloat5;
            animatorArr[c11] = ofFloat6;
            animatorSet.playTogether(animatorArr);
            f15.i0 = 3;
            f15.k0 = new ye0(f15, fb2, messageObject3, 26);
            f15.G0.setDuration(250L);
            f15.G0.addListener(new u31(f15, 0));
            f15.j0 = System.currentTimeMillis();
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                f15.e.setLayerType(2, null);
            }
            f15.G0.setInterpolator(new DecelerateInterpolator());
            photoBackgroundDrawable.b = 0;
            photoBackgroundDrawable.a = new n21(i20, f15, bu0Var);
            f15.G0.start();
            return;
        }
        if (MessageObject.isAnimatedEmoji(messageObject5.getDocument()) && MessageObject.getInputStickerSet(messageObject5.getDocument()) != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(MessageObject.getInputStickerSet(messageObject5.getDocument()));
            org.telegram.ui.Components.dv dvVar = new org.telegram.ui.Components.dv(qnVar3, qnVar3.getParentActivity(), qnVar3.aa, arrayList);
            dvVar.setCalcMandatoryInsets(qnVar3.x9());
            qnVar3.showDialog(dvVar);
            return;
        }
        if (messageObject5.getInputStickerSet() != null) {
            org.telegram.ui.Components.cx0 cx0Var = new org.telegram.ui.Components.cx0(qnVar3.getParentActivity(), qnVar3, messageObject5.getInputStickerSet(), null, (qnVar3.K0.getVisibility() == 0 || !((chat = qnVar3.e) == null || ChatObject.canSendStickers(chat))) ? null : qnVar3.U, qnVar3.aa);
            cx0Var.setCalcMandatoryInsets(qnVar3.x9());
            qnVar3.showDialog(cx0Var);
            return;
        }
        if (messageObject5.isVideo() || (i9 = messageObject5.type) == 1 || ((i9 == 0 && !messageObject5.isWebpageDocument()) || messageObject5.isGif())) {
            if (messageObject5.isSponsored()) {
                if (messageObject5.isGif() || messageObject5.isPhoto()) {
                    int i21 = 1;
                    qnVar3.J9(messageObject5, true, false);
                    if (messageObject5.sponsoredUrl != null) {
                        ve.d dVar2 = qnVar3.wb;
                        if (dVar2 != null) {
                            dVar2.a(true);
                        }
                        qnVar3.wb = t1Var.getMessageObject() == null ? null : new vm(this, t1Var, i21);
                        ve.e.r(qnVar3.getParentActivity(), Uri.parse(messageObject5.sponsoredUrl), true, false, false, qnVar3.wb, null, false, qnVar3.getMessagesController().sponsoredLinksInappAllow, false);
                        return;
                    }
                    return;
                }
                if (messageObject5.isVideo()) {
                    qnVar3.J9(messageObject5, true, false);
                }
            }
            if (messageObject5.getDuration() > 0.0d && messageObject5.getVideoStartsTimestamp() > 0 && !messageObject5.openedInViewer) {
                messageObject5.forceSeekTo = (float) (messageObject5.getVideoStartsTimestamp() / messageObject5.getDuration());
            }
            qnVar3.ha(t1Var, messageObject5);
            return;
        }
        int i22 = messageObject5.type;
        if (i22 == 3) {
            qnVar3.fb(messageObject5, true);
            try {
                String str3 = messageObject5.messageOwner.attachPath;
                File file4 = (str3 == null || str3.length() == 0) ? null : new File(messageObject5.messageOwner.attachPath);
                if (file4 == null || !file4.exists()) {
                    file4 = qnVar3.getFileLoader().getPathToMessage(messageObject5.messageOwner);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setFlags(1);
                    intent.setDataAndType(FileProvider.d(qnVar3.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", file4), "video/mp4");
                } else {
                    intent.setDataAndType(Uri.fromFile(file4), "video/mp4");
                }
                qnVar3.getParentActivity().startActivityForResult(intent, 500);
                return;
            } catch (Exception e11) {
                FileLog.e(e11);
                qnVar3.z6(messageObject5);
                return;
            }
        }
        if (i22 == 4) {
            if (AndroidUtilities.isMapsInstalled(qnVar3)) {
                if (!messageObject5.isLiveLocation()) {
                    pc0 pc0Var = new pc0(qnVar3.h == null ? 3 : 0);
                    pc0Var.B0 = qnVar3;
                    pc0Var.t0(messageObject5);
                    qnVar3.presentFragment(pc0Var);
                    return;
                }
                TLRPC.Chat chat2 = qnVar3.e;
                pc0 pc0Var2 = new pc0((chat2 == null || ChatObject.canSendMessages(chat2) || qnVar3.e.megagroup) ? 2 : 6);
                pc0Var2.B0 = qnVar3;
                pc0Var2.t0(messageObject5);
                qnVar3.presentFragment(pc0Var2);
                return;
            }
            return;
        }
        if (i22 != 9 && i22 != 0) {
            return;
        }
        if (messageObject5.getDocumentName().toLowerCase().endsWith("attheme")) {
            String str4 = messageObject5.messageOwner.attachPath;
            if (str4 != null && str4.length() != 0) {
                file = new File(messageObject5.messageOwner.attachPath);
            }
            file = null;
            if (file == null) {
                File pathToMessage2 = qnVar3.getFileLoader().getPathToMessage(messageObject5.messageOwner);
                if (pathToMessage2.exists()) {
                    file = pathToMessage2;
                }
            }
            org.telegram.ui.ActionBar.e6 u10 = org.telegram.ui.ActionBar.f6.u(file, messageObject5.getDocumentName(), null, true);
            if (u10 != null) {
                qnVar3.presentFragment(new oc1(u10));
                return;
            }
            qnVar3.t4 = -1;
        }
        if (messageObject5.canPreviewDocument()) {
            PhotoViewer.t1().K2(null, qnVar3, qnVar3.aa);
            PhotoViewer t12 = PhotoViewer.t1();
            int i23 = messageObject5.type;
            if (i23 != 0) {
                messageObject2 = messageObject5;
                j10 = qnVar3.P5;
            } else {
                messageObject2 = messageObject5;
                j10 = 0;
            }
            if (i23 != 0) {
                j12 = 0;
                j11 = qnVar3.H6;
            } else {
                j11 = 0;
                j12 = 0;
            }
            if (i23 != 0) {
                j12 = qnVar3.b();
            }
            messageObject = messageObject2;
            t12.c2(messageObject, qnVar3, j10, j11, j12, qnVar3.Ba);
            qnVar = qnVar3;
            z11 = true;
        } else {
            qnVar = qnVar3;
            messageObject = messageObject5;
            z11 = false;
        }
        Pattern pattern = org.telegram.ui.Components.z80.a;
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
            qnVar2 = qnVar;
            if (z12) {
                try {
                    AndroidUtilities.openForView(messageObject, qnVar2.getParentActivity(), qnVar2.aa, false);
                    return;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    qnVar2.z6(messageObject);
                    return;
                }
            }
            return;
        }
        if (qnVar.getParentActivity() == null) {
            qnVar2 = qnVar;
        } else {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(qnVar.getParentActivity(), 3, qnVar.aa);
            c2Var.setCanceledOnTouchOutside(false);
            boolean[] zArr = {false};
            c2Var.setOnCancelListener(new vg(0, zArr));
            c2Var.q(150L);
            qn qnVar4 = qnVar;
            MessageObject messageObject6 = messageObject;
            k6 k6Var = new k6(qnVar4, messageObject6, c2Var, zArr, 7);
            qnVar2 = qnVar4;
            messageObject = messageObject6;
            new Thread(k6Var).start();
        }
        z12 = true;
        if (z12) {
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void w1(org.telegram.ui.Cells.t1 t1Var, eh.f fVar) {
        TLRPC.Message message;
        if (t1Var == null) {
            fVar.run();
            return;
        }
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject == null || ((messageObject.isSending() && !messageObject.isEditing()) || (message = messageObject.messageOwner) == null || message.rich_message == null)) {
            fVar.run();
        } else {
            org.telegram.ui.ActionBar.o2 o2Var = this.a;
            o2Var.getSendMessagesHelper().editRichMessage(messageObject, messageObject.messageOwner.rich_message, null, o2Var, true);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void x(org.telegram.ui.Cells.t1 t1Var) {
        int i9;
        int i10;
        lj ljVar;
        MessageObject primaryMessageObject = t1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        primaryMessageObject.factCheckExpanded = !primaryMessageObject.factCheckExpanded;
        primaryMessageObject.forceUpdate = true;
        qn qnVar = this.a;
        ij ijVar = qnVar.t0;
        if (ijVar != null && (ljVar = qnVar.v0) != null && ljVar.y < 0) {
            for (int childCount = ijVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = qnVar.t0.getChildAt(childCount);
                qnVar.t0.getClass();
                i9 = RecyclerView.R(childAt);
                if (i9 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.t1)) {
                        if (childAt instanceof org.telegram.ui.Cells.w0) {
                            i10 = qnVar.L8(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                            i10 = qnVar.L8(childAt);
                            break;
                        }
                    }
                }
            }
        }
        i9 = -1;
        i10 = 0;
        qnVar.rc(primaryMessageObject, false);
        kh.x3 x3Var = qnVar.w1;
        if (x3Var != null) {
            x3Var.e(true);
        }
        if (i9 < 0 || t1Var.getCurrentMessagesGroup() != null) {
            return;
        }
        qnVar.v0.h1(i9, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.k1
    public final boolean x1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        int i9;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        w4 w4Var;
        fk fkVar;
        ek ekVar;
        if (!j()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(ChatObject.getPublicUsername(chat));
        qn qnVar = this.a;
        int i13 = (isEmpty || qnVar.e == null || ((fkVar = qnVar.K0) != null && fkVar.getVisibility() == 0) || ((ekVar = qnVar.N) != null && ekVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat2 = qnVar.e;
        int i14 = (chat2 == null || !(qnVar.Z3 == 0 || qnVar.d4) || (ChatObject.isChannel(chat2) && !qnVar.e.megagroup)) ? 0 : 1;
        TLRPC.Chat chat3 = qnVar.e;
        int i15 = (chat3 == null || chat3.id != chat.id || qnVar.F9()) ? 1 : 0;
        c5[] c5VarArr = new c5[i15 + 1 + i13 + i14];
        c5VarArr[0] = c5.d;
        if (i15 != 0) {
            c5VarArr[1] = chat.broadcast ? c5.e : c5.f;
            i9 = 2;
        } else {
            i9 = 1;
        }
        if (i13 != 0) {
            c5VarArr[i9] = c5.n;
            i9++;
        }
        if (i14 != 0) {
            c5VarArr[i9] = c5.r;
        }
        TLRPC.ChatFull chatFull = qnVar.getMessagesController().getChatFull(chat.id);
        if (chatFull != null) {
            w4Var = w4.a(chat, chatFull, c5VarArr);
            z11 = i13;
            i12 = i14;
            i11 = i15;
            z10 = true;
        } else {
            i10 = ((org.telegram.ui.ActionBar.o2) qnVar).classGuid;
            int i16 = i14;
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(chat, 0);
            int i17 = i15;
            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(chat, 1);
            String str = (forUserOrChat2 == null || !(forUserOrChat2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            z10 = true;
            i11 = i17;
            z11 = i13;
            i12 = i16;
            w4Var = new w4(forUserOrChat, forUserOrChat2, null, str, null, null, chatPhoto != null ? chatPhoto.strippedBitmap : null, chat, c5VarArr, new v4(i10, chat, NotificationCenter.chatInfoDidLoad));
        }
        if (com.google.firebase.messaging.l.e(w4Var)) {
            com.google.firebase.messaging.l.i().s((ViewGroup) qnVar.fragmentView, qnVar.aa, w4Var, new a7(this, chat, t1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(qnVar, t1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new qm(this, chat, 0), false);
        boolean z12 = chat.broadcast;
        H.l(z12 ? R.drawable.msg_channel : R.drawable.msg_discussion, LocaleController.getString(z12 ? R.string.OpenChannel2 : R.string.OpenGroup2), new t1(this, t1Var, chat, 26), i11);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new qm(this, chat, 1), z11);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new qm(this, chat, 2), i12);
        H.t = false;
        H.i = 3;
        H.W = true;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void y1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        qn qnVar = this.a;
        if (qnVar.z9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) gf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) gf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
        if (qnVar.getParentActivity() != null) {
            if (qnVar.K0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                if (tL_inlineButtonTypeCopy == null) {
                    if (tL_inlineButtonTypeUrl != null) {
                        qnVar.Z9(null, tL_inlineButtonTypeUrl.url, true, t1Var, t1Var.getMessageObject());
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
                org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(qnVar.getParentActivity(), qnVar.aa, false, false);
                f3Var.fixNavigationBar();
                f3Var.title = str;
                f3Var.bigTitle = false;
                f3Var.multipleLinesTitle = true;
                CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Copy)};
                v vVar = new v(2, qnVar, str);
                f3Var.items = charSequenceArr;
                f3Var.onClickListener = vVar;
                qnVar.showDialog(f3Var);
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void z(org.telegram.ui.Cells.t1 t1Var) {
        long j10;
        int i9;
        MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
        MessageObject messageObject = (currentMessagesGroup == null || currentMessagesGroup.messages.isEmpty()) ? t1Var.getMessageObject() : currentMessagesGroup.messages.get(0);
        TLRPC.MessageReplies messageReplies = messageObject.messageOwner.replies;
        if (messageReplies != null) {
            int i10 = messageReplies.read_max_id;
            j10 = messageReplies.channel_id;
            i9 = i10;
        } else {
            j10 = 0;
            i9 = -1;
        }
        long j11 = j10;
        qn qnVar = this.a;
        qnVar.aa(qnVar.e.id, messageObject, messageObject.getId(), j11, i9, 0, null);
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean z0(MessageObject messageObject) {
        return !this.a.s.containsKey(messageObject);
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean z1() {
        qn qnVar = this.a;
        return qnVar.T0.getKeyboardHeight() + qnVar.ka >= AndroidUtilities.dp(20.0f);
    }
}
