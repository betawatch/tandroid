package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Function$-CC;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Function;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ob extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public static int T0 = 10;
    public static final int[] U0 = {NotificationCenter.chatInfoDidLoad, NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.messagesDidLoad, NotificationCenter.botKeyboardDidLoad};
    public db A;
    public boolean A0;
    public UndoView B;
    public final za B0;
    public k C;
    public eb C0;
    public c2.z D;
    public final ArrayList D0;
    public kb E;
    public final a0.h E0;
    public TextView F;
    public xa F0;
    public ug.e G;
    public int G0;
    public FrameLayout H;
    public int H0;
    public org.telegram.ui.Components.xn I;
    public ra I0;
    public LinearLayout J;
    public org.telegram.ui.Cells.s1 J0;
    public ImageView K;
    public int K0;
    public eg.r L;
    public final nb L0;
    public org.telegram.ui.Cells.v0 M;
    public long M0;
    public org.telegram.ui.ActionBar.w0 N;
    public int N0;
    public long O;
    public int O0;
    public boolean P;
    public jf.e0 P0;
    public boolean Q;
    public final ArrayList Q0;
    public AnimatorSet R;
    public final ArrayList R0;
    public boolean S;
    public final RectF S0;
    public final int[] T;
    public boolean U;
    public boolean V;
    public ug.f W;
    public lb X;
    public MessageObject Y;
    public TLRPC.ChannelParticipant Z;
    public final qg.e a;
    public FrameLayout a0;
    public final lg.a b;
    public ImageView b0;
    public final qg.d c;
    public org.telegram.ui.ActionBar.h5 c0;
    public final qg.d d;
    public n0 d0;
    public final lg.a e;
    public e5.c e0;
    public final lg.a f;
    public TextureView f0;
    public int g0;
    public final zd.b h;
    public int h0;
    public boolean i0;
    public boolean j0;
    public final a0.h k0;
    public final a0.h l0;
    public final HashMap m0;
    public final lg.e n;
    public final ArrayList n0;
    public final ArrayList o0;
    public final HashSet p0;
    public boolean q0;
    public final int r;
    public boolean r0;
    public final TLRPC.Chat s;
    public boolean s0;
    public ArrayList t0;
    public TLRPC.TL_channelAdminLogEventsFilter u0;
    public final ArrayList v;
    public String v0;
    public FrameLayout w;
    public a0.h w0;
    public View x;
    public final AnimationNotificationsLocker x0;
    public RadialProgressView y;
    public final HashMap y0;
    public HashMap z0;

    public ob(TLRPC.Chat chat) {
        super(null);
        zd.b bVar = new zd.b(true);
        this.h = bVar;
        this.v = new ArrayList();
        this.T = new int[]{2};
        this.g0 = -1;
        this.h0 = 0;
        this.i0 = true;
        this.j0 = false;
        this.k0 = new a0.h();
        this.l0 = new a0.h();
        this.m0 = new HashMap();
        this.n0 = new ArrayList();
        this.o0 = new ArrayList();
        this.p0 = new HashSet();
        this.u0 = null;
        this.v0 = "";
        this.x0 = new AnimationNotificationsLocker(U0);
        this.y0 = new HashMap();
        this.B0 = new za(this);
        this.D0 = new ArrayList();
        this.E0 = new a0.h();
        this.G0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.H0 = -1;
        this.L0 = new nb(this);
        this.N0 = -1;
        this.Q0 = new ArrayList();
        this.R0 = new ArrayList();
        this.S0 = new RectF();
        qg.e eVar = new qg.e();
        this.a = eVar;
        lg.a aVar = new lg.a(eVar);
        this.b = aVar;
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.chatBlurEnabled()) {
            this.n = null;
            this.r = 0;
            this.c = null;
            this.d = null;
            this.e = new lg.a(eVar);
            this.f = new lg.a(eVar);
        } else {
            lg.e eVar2 = new lg.e(false);
            this.n = eVar2;
            qg.d dVar = new qg.d(eVar);
            this.d = dVar;
            dVar.v = new ra(this, 3);
            dVar.d = eVar2;
            dVar.e = -3;
            dVar.f = eVar;
            lg.a aVar2 = new lg.a(dVar);
            this.f = aVar2;
            aVar2.f = LiteMode.isEnabled(262144);
            if (LiteMode.isEnabled(262144)) {
                qg.d dVar2 = new qg.d(eVar);
                this.c = dVar2;
                dVar2.v = new ra(this, 3);
                dVar2.d = eVar2;
                dVar2.e = -2;
                dVar2.f = eVar;
                lg.a aVar3 = new lg.a(dVar2);
                this.e = aVar3;
                aVar3.f = LiteMode.isEnabled(262144);
                this.r = 0;
            } else {
                this.c = null;
                this.e = aVar2;
                this.r = AndroidUtilities.dp(48.0f);
            }
        }
        aVar.c = bVar;
        this.e.c = bVar;
        this.f.c = bVar;
        this.s = chat;
    }

    public static void A0(ob obVar, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, HashMap hashMap) {
        MessagesController messagesController = obVar.getMessagesController();
        TLRPC.Chat chat = obVar.s;
        TLRPC.ChatFull chatFull = messagesController.getChatFull(chat.id);
        org.telegram.ui.Components.n60 n60Var = new org.telegram.ui.Components.n60(obVar.X.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, chatFull, hashMap, obVar, chatFull.id, false, ChatObject.isChannel(chat));
        n60Var.f0 = new ab(obVar);
        n60Var.show();
    }

    public static void K0(ob obVar) {
        if (obVar.A == null || obVar.n0.isEmpty()) {
            return;
        }
        obVar.C.h1(obVar.o0.size() - 1, (-100000) - obVar.A.getPaddingTop());
    }

    public static h01 S0(CharSequence charSequence) {
        if (!(charSequence instanceof Spannable)) {
            return null;
        }
        for (org.telegram.ui.Components.iq iqVar : (org.telegram.ui.Components.iq[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.iq.class)) {
            if (iqVar != null) {
                Drawable drawable = iqVar.drawable;
                if (drawable instanceof h01) {
                    return (h01) drawable;
                }
            }
        }
        return null;
    }

    public static void U(ob obVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        MessageObject messageObject;
        a0.h hVar = obVar.k0;
        int i10 = 0;
        obVar.C0.N = false;
        obVar.X0(false);
        MessagesController.getInstance(obVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(obVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = obVar.n0;
        boolean z10 = false;
        for (int i11 = 0; i11 < tL_channels_adminLogResults.events.size(); i11++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = tL_channels_adminLogResults.events.get(i11);
            if (hVar.h(tL_channelAdminLogEvent.id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                obVar.O = Math.min(obVar.O, tL_channelAdminLogEvent.id);
                MessageObject messageObject2 = new MessageObject(obVar.currentAccount, tL_channelAdminLogEvent, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) obVar.m0, obVar.s, obVar.T, false);
                if (messageObject2.contentType >= 0) {
                    hVar.k(messageObject2, tL_channelAdminLogEvent.id);
                }
                z10 = true;
            }
        }
        arrayList.size();
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(size);
            if (messageObject3 != null && messageObject3.contentType != 0 && messageObject3.getRealId() >= 0) {
                obVar.l0.k(messageObject3, messageObject3.getRealId());
            }
            if (messageObject3 != null && (message = messageObject3.messageOwner) != null && (messageReplyHeader = message.reply_to) != null) {
                if (messageReplyHeader.reply_to_peer_id == null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList.size()) {
                            messageObject = null;
                            break;
                        }
                        if (size != i12) {
                            messageObject = (MessageObject) arrayList.get(i12);
                            if (messageObject.contentType != 1 && messageObject.getRealId() == messageReplyHeader.reply_to_msg_id) {
                                break;
                            }
                        }
                        i12++;
                    }
                    if (messageObject != null) {
                        messageObject3.replyMessageObject = messageObject;
                    }
                }
                arrayList2.add(messageObject3);
            }
        }
        if (!arrayList2.isEmpty()) {
            MediaDataController.getInstance(obVar.currentAccount).loadReplyMessagesForMessages(arrayList2, -obVar.s.id, 0, 0L, new ra(obVar, 1), obVar.getClassGuid(), null);
        }
        obVar.R0();
        obVar.r0 = false;
        if (!z10) {
            obVar.q0 = true;
        }
        AndroidUtilities.updateViewVisibilityAnimated(obVar.w, false, 0.3f, true);
        obVar.A.setEmptyView(obVar.H);
        kb kbVar = obVar.E;
        if (kbVar != null) {
            kbVar.l();
        }
        org.telegram.ui.ActionBar.w0 w0Var = obVar.N;
        if (w0Var != null) {
            if (obVar.o0.isEmpty() && TextUtils.isEmpty(obVar.v0)) {
                i10 = 8;
            }
            w0Var.setVisibility(i10);
        }
    }

    public static void V(ob obVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f9, float f10) {
        ArrayList arrayList4 = arrayList;
        if (arrayList4.isEmpty() || obVar.getParentActivity() == null) {
            return;
        }
        int i10 = 0;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, obVar.getParentActivity(), obVar.getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
        Rect rect = new Rect();
        obVar.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate().getPadding(rect);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(obVar.getThemedColor(org.telegram.ui.ActionBar.g6.G8));
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            if (arrayList4.get(i11) == null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.l1(obVar.getParentActivity(), obVar.getResourceProvider()), i7.f6.n(-1, 8));
            } else {
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, obVar.getParentActivity(), obVar.getResourceProvider(), i11 == 0, i11 == size + (-1));
                g1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                g1Var.g((CharSequence) arrayList2.get(i11), ((Integer) arrayList3.get(i11)).intValue(), null);
                if (((Integer) arrayList4.get(i11)).intValue() == 35) {
                    g1Var.c(obVar.getThemedColor(org.telegram.ui.ActionBar.g6.q7), obVar.getThemedColor(org.telegram.ui.ActionBar.g6.p7));
                }
                Integer num = (Integer) arrayList4.get(i11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                g1Var.setOnClickListener(new lh.n5(obVar, i11, arrayList4, num, 1));
            }
            i11++;
            arrayList4 = arrayList;
        }
        wa waVar = new wa(0, obVar.X.getContext(), obVar);
        waVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, i7.f6.u(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
        waVar.setPopupWindowLayout(actionBarPopupWindow$ActionBarPopupWindowLayout);
        xa xaVar = new xa(obVar, waVar);
        obVar.F0 = xaVar;
        xaVar.e = true;
        xaVar.c = 220;
        xaVar.setOutsideTouchable(true);
        obVar.F0.setClippingEnabled(true);
        obVar.F0.setAnimationStyle(R.style.PopupContextAnimation);
        obVar.F0.setFocusable(true);
        waVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        obVar.F0.setInputMethodMode(2);
        obVar.F0.setSoftInputMode(48);
        obVar.F0.getContentView().setFocusableInTouchMode(true);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        int left = (((view.getLeft() + ((int) f9)) - waVar.getMeasuredWidth()) + rect.left) - AndroidUtilities.dp(28.0f);
        if (left < AndroidUtilities.dp(6.0f)) {
            left = AndroidUtilities.dp(6.0f);
        } else if (left > (obVar.A.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - waVar.getMeasuredWidth()) {
            left = (obVar.A.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - waVar.getMeasuredWidth();
        }
        if (AndroidUtilities.isTablet()) {
            int[] iArr = new int[2];
            obVar.fragmentView.getLocationInWindow(iArr);
            left += iArr[0];
        }
        int height = obVar.X.getHeight();
        int dp = AndroidUtilities.dp(48.0f) + waVar.getMeasuredHeight();
        int R = obVar.X.R();
        if (R > AndroidUtilities.dp(20.0f)) {
            height += R;
        }
        if (dp < height) {
            int y8 = (int) (obVar.A.getY() + view.getTop() + f10);
            i10 = (dp - rect.top) - rect.bottom > AndroidUtilities.dp(240.0f) ? (AndroidUtilities.dp(240.0f) - dp) + y8 : y8;
            if (i10 < obVar.A.getY() + AndroidUtilities.dp(24.0f)) {
                i10 = (int) (obVar.A.getY() + AndroidUtilities.dp(24.0f));
            } else {
                int i12 = height - dp;
                if (i10 > i12 - AndroidUtilities.dp(8.0f)) {
                    i10 = i12 - AndroidUtilities.dp(8.0f);
                }
            }
        } else if (!obVar.inBubbleMode) {
            i10 = AndroidUtilities.statusBarHeight;
        }
        waVar.setMaxHeight(height - i10);
        obVar.F0.showAtLocation(obVar.A, 51, left, i10);
        obVar.F0.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x036a, code lost:
    
        if (r0.exists() != false) goto L129;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void W(ob obVar, int i10, ArrayList arrayList, Integer num) {
        TLRPC.Chat chat;
        File file;
        TLRPC.User user;
        if (obVar.Y == null || i10 >= arrayList.size()) {
            return;
        }
        int intValue = num.intValue();
        TLRPC.Chat chat2 = obVar.s;
        xa xaVar = obVar.F0;
        if (xaVar != null) {
            xaVar.dismiss();
        }
        MessageObject messageObject = obVar.Y;
        if (messageObject == null) {
            return;
        }
        if (intValue == 3) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            long fromChatId = messageObject.getFromChatId();
            if (0 != fromChatId) {
                if (fromChatId > 0) {
                    TLRPC.User user2 = MessagesController.getInstance(obVar.currentAccount).getUser(Long.valueOf(fromChatId));
                    if (user2 != null) {
                        spannableStringBuilder.append((CharSequence) ContactsController.formatName(user2.first_name, user2.last_name)).append((CharSequence) ":\n");
                    }
                } else if (fromChatId < 0 && (chat = MessagesController.getInstance(obVar.currentAccount).getChat(Long.valueOf(-fromChatId))) != null) {
                    spannableStringBuilder.append((CharSequence) chat.title).append((CharSequence) ":\n");
                }
            }
            if (TextUtils.isEmpty(messageObject.messageText)) {
                spannableStringBuilder.append((CharSequence) messageObject.messageOwner.message);
            } else {
                spannableStringBuilder.append(messageObject.messageText);
            }
            AndroidUtilities.addToClipboard(spannableStringBuilder);
            b.n(R.string.MessageCopied, org.telegram.ui.Components.tc.a0(obVar));
        } else if (intValue == 4) {
            String str = messageObject.messageOwner.attachPath;
            if (str != null && str.length() > 0 && !com.google.android.recaptcha.internal.a.v(str)) {
                str = null;
            }
            if (str == null || str.length() == 0) {
                str = obVar.getFileLoader().getPathToMessage(obVar.Y.messageOwner).toString();
            }
            int i11 = obVar.Y.type;
            if (i11 == 3 || i11 == 1) {
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 23 && ((i12 <= 28 || BuildVars.NO_SCOPED_STORAGE) && obVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                    obVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                    obVar.Y = null;
                    obVar.Z = null;
                    return;
                }
                MediaController.saveFile(str, obVar.getParentActivity(), obVar.Y.type == 3 ? 1 : 0, null, null);
            }
        } else if (intValue == 5) {
            String str2 = messageObject.messageOwner.attachPath;
            if (str2 != null && str2.length() != 0) {
                file = new File(obVar.Y.messageOwner.attachPath);
            }
            file = null;
            if (file == null) {
                File pathToMessage = obVar.getFileLoader().getPathToMessage(obVar.Y.messageOwner);
                if (pathToMessage.exists()) {
                    file = pathToMessage;
                }
            }
            if (file != null) {
                if (file.getName().toLowerCase().endsWith("attheme")) {
                    k kVar = obVar.C;
                    if (kVar != null) {
                        if (kVar.N0() < obVar.C.B() - 1) {
                            int L0 = obVar.C.L0();
                            obVar.g0 = L0;
                            org.telegram.ui.Components.vk0 vk0Var = (org.telegram.ui.Components.vk0) obVar.A.K(L0);
                            if (vk0Var != null) {
                                obVar.h0 = vk0Var.a.getTop();
                            } else {
                                obVar.g0 = -1;
                            }
                        } else {
                            obVar.g0 = -1;
                        }
                    }
                    org.telegram.ui.ActionBar.f6 u10 = org.telegram.ui.ActionBar.g6.u(file, obVar.Y.getDocumentName(), null, true);
                    if (u10 != null) {
                        obVar.presentFragment(new qc1(u10));
                    } else {
                        obVar.g0 = -1;
                        if (obVar.getParentActivity() == null) {
                            obVar.Y = null;
                            obVar.Z = null;
                            return;
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(obVar.getParentActivity());
                            alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
                            alertDialog$Builder.a.P = LocaleController.getString(R.string.IncorrectTheme);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                            obVar.showDialog(alertDialog$Builder.a);
                        }
                    }
                } else if (LocaleController.getInstance().applyLanguageFile(file, obVar.currentAccount)) {
                    obVar.presentFragment(new LanguageSelectActivity());
                } else if (obVar.getParentActivity() == null) {
                    obVar.Y = null;
                    obVar.Z = null;
                    return;
                } else {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(obVar.getParentActivity());
                    alertDialog$Builder2.a.N = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder2.a.P = LocaleController.getString(R.string.IncorrectLocalization);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                    obVar.showDialog(alertDialog$Builder2.a);
                }
            }
        } else if (intValue == 6) {
            String str3 = messageObject.messageOwner.attachPath;
            if (str3 != null && str3.length() > 0 && !com.google.android.recaptcha.internal.a.v(str3)) {
                str3 = null;
            }
            if (str3 == null || str3.length() == 0) {
                str3 = obVar.getFileLoader().getPathToMessage(obVar.Y.messageOwner).toString();
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(obVar.Y.getDocument().mime_type);
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    intent.putExtra("android.intent.extra.STREAM", FileProvider.d(obVar.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", new File(str3)));
                    intent.setFlags(1);
                } catch (Exception unused) {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(str3)));
                }
            } else {
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(str3)));
            }
            try {
                obVar.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.ShareFile)), 500);
            } catch (Exception unused2) {
            }
        } else if (intValue != 7) {
            switch (intValue) {
                case 9:
                    obVar.showDialog(new org.telegram.ui.Components.nx0(obVar.getParentActivity(), obVar, obVar.Y.getInputStickerSet(), null, null, null));
                    break;
                case 10:
                    int i13 = Build.VERSION.SDK_INT;
                    if (i13 >= 23 && ((i13 <= 28 || BuildVars.NO_SCOPED_STORAGE) && obVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                        obVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                        obVar.Y = null;
                        obVar.Z = null;
                        return;
                    }
                    String documentFileName = FileLoader.getDocumentFileName(obVar.Y.getDocument());
                    if (TextUtils.isEmpty(documentFileName)) {
                        documentFileName = obVar.Y.getFileName();
                    }
                    String str4 = obVar.Y.messageOwner.attachPath;
                    if (str4 != null && str4.length() > 0 && !com.google.android.recaptcha.internal.a.v(str4)) {
                        str4 = null;
                    }
                    if (str4 == null || str4.length() == 0) {
                        str4 = obVar.getFileLoader().getPathToMessage(obVar.Y.messageOwner).toString();
                    }
                    MediaController.saveFile(str4, obVar.getParentActivity(), obVar.Y.isMusic() ? 3 : 2, documentFileName, obVar.Y.getDocument() != null ? obVar.Y.getDocument().mime_type : "");
                    break;
                case 11:
                    MessagesController.getInstance(obVar.currentAccount).saveGif(obVar.Y, messageObject.getDocument());
                    break;
                default:
                    switch (intValue) {
                        case 15:
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", obVar.Y.messageOwner.media.user_id);
                            bundle.putString("phone", obVar.Y.messageOwner.media.phone_number);
                            bundle.putBoolean("addContact", true);
                            obVar.presentFragment(new hs(bundle));
                            break;
                        case 16:
                            AndroidUtilities.addToClipboard(messageObject.messageOwner.media.phone_number);
                            b.n(R.string.PhoneCopied, org.telegram.ui.Components.tc.a0(obVar));
                            break;
                        case 17:
                            try {
                                Intent intent2 = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + obVar.Y.messageOwner.media.phone_number));
                                intent2.addFlags(TLObject.FLAG_28);
                                obVar.getParentActivity().startActivityForResult(intent2, 500);
                                break;
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                break;
                            }
                        default:
                            switch (intValue) {
                                case 33:
                                    if (obVar.Z != null) {
                                        TLRPC.User user3 = obVar.getMessagesController().getUser(Long.valueOf(DialogObject.getPeerDialogId(obVar.Z.peer)));
                                        TLRPC.ChannelParticipant channelParticipant = obVar.Z;
                                        if (channelParticipant.banned_rights == null) {
                                            channelParticipant.banned_rights = new TLRPC.TL_chatBannedRights();
                                        }
                                        TLRPC.TL_chatBannedRights tL_chatBannedRights = obVar.Z.banned_rights;
                                        tL_chatBannedRights.send_plain = true;
                                        tL_chatBannedRights.send_messages = true;
                                        tL_chatBannedRights.send_media = true;
                                        tL_chatBannedRights.send_stickers = true;
                                        tL_chatBannedRights.send_gifs = true;
                                        tL_chatBannedRights.send_games = true;
                                        tL_chatBannedRights.send_inline = true;
                                        tL_chatBannedRights.send_polls = true;
                                        tL_chatBannedRights.send_photos = true;
                                        tL_chatBannedRights.send_videos = true;
                                        tL_chatBannedRights.send_roundvideos = true;
                                        tL_chatBannedRights.send_audios = true;
                                        tL_chatBannedRights.send_voices = true;
                                        tL_chatBannedRights.send_docs = true;
                                        tL_chatBannedRights.send_reactions = true;
                                        obVar.getMessagesController().setParticipantBannedRole(chat2.id, user3, null, obVar.Z.banned_rights, true, obVar.getFragmentForAlert(1), new org.telegram.ui.ActionBar.c(19, obVar, user3));
                                        break;
                                    }
                                    break;
                                case 34:
                                    TLRPC.TL_channels_reportAntiSpamFalsePositive tL_channels_reportAntiSpamFalsePositive = new TLRPC.TL_channels_reportAntiSpamFalsePositive();
                                    tL_channels_reportAntiSpamFalsePositive.channel = obVar.getMessagesController().getInputChannel(chat2.id);
                                    tL_channels_reportAntiSpamFalsePositive.msg_id = obVar.Y.getRealId();
                                    obVar.getConnectionsManager().sendRequest(tL_channels_reportAntiSpamFalsePositive, new ma(obVar, 3));
                                    break;
                                case 35:
                                    obVar.getMessagesController().deleteParticipantFromChat(chat2.id, obVar.getMessagesController().getInputPeer(obVar.Y.messageOwner.from_id), false, false, (Runnable) new ra(obVar, 2));
                                    if ((obVar.Y.messageOwner.from_id instanceof TLRPC.TL_peerUser) && org.telegram.ui.Components.tc.a(obVar) && (user = obVar.getMessagesController().getUser(Long.valueOf(obVar.Y.messageOwner.from_id.user_id))) != null) {
                                        org.telegram.ui.Components.tc.D(obVar, user, chat2.title).j();
                                        break;
                                    }
                                    break;
                            }
                    }
            }
        } else {
            String str5 = messageObject.messageOwner.attachPath;
            if (str5 != null && str5.length() > 0 && !com.google.android.recaptcha.internal.a.v(str5)) {
                str5 = null;
            }
            if (str5 == null || str5.length() == 0) {
                str5 = obVar.getFileLoader().getPathToMessage(obVar.Y.messageOwner).toString();
            }
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 23 && ((i14 <= 28 || BuildVars.NO_SCOPED_STORAGE) && obVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                obVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                obVar.Y = null;
                obVar.Z = null;
                return;
            }
            MediaController.saveFile(str5, obVar.getParentActivity(), 0, null, null);
        }
        obVar.Y = null;
        obVar.Z = null;
    }

    public static void X(ob obVar, int i10) {
        int i11;
        RectF rectF;
        qg.d dVar = obVar.c;
        qg.d dVar2 = obVar.d;
        ArrayList arrayList = obVar.R0;
        lg.e eVar = obVar.n;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 31 || eVar == null) {
            return;
        }
        if (i7.n8.a(i10, 2)) {
            ArrayList arrayList2 = obVar.Q0;
            if (i12 >= 29) {
                if (dVar2 != null) {
                    if (arrayList2.isEmpty()) {
                        rectF = new RectF();
                        arrayList2.add(rectF);
                    } else {
                        rectF = (RectF) arrayList2.get(0);
                    }
                    rectF.set(0.0f, 0.0f, obVar.X.getMeasuredWidth(), obVar.A.getY() + obVar.A.getPaddingTop());
                    rectF.inset(0.0f, -AndroidUtilities.dp(45.0f));
                    i11 = dVar2.c(arrayList2, 1, AndroidUtilities.dp(48.0f)) + 1;
                } else {
                    i11 = 0;
                }
                if (dVar != null) {
                    i11 += dVar.c(arrayList2, i11, AndroidUtilities.dp(8.0f));
                }
            } else {
                i11 = 0;
            }
            int a2 = jf.l0.a(arrayList2, i11, arrayList);
            int measuredWidth = obVar.X.getMeasuredWidth();
            for (int i13 = 0; i13 < a2; i13++) {
                RectF rectF2 = (RectF) arrayList.get(i13);
                float f9 = measuredWidth;
                rectF2.left = i7.w.a(rectF2.left, 0.0f, f9);
                rectF2.top = Math.max(obVar.A.getY(), rectF2.top);
                rectF2.right = i7.w.a(rectF2.right, 0.0f, f9);
                rectF2.bottom = Math.min(obVar.A.getY() + obVar.A.getMeasuredHeight(), rectF2.bottom);
            }
            eVar.g(a2, arrayList);
        }
        lb lbVar = obVar.X;
        Objects.requireNonNull(lbVar);
        if (eVar.e(new qa(lbVar, 0), obVar.X.getWidth(), obVar.X.getHeight())) {
            if (dVar != null) {
                dVar.d();
            }
            if (dVar2 != null) {
                dVar2.d();
            }
            org.telegram.ui.ActionBar.l lVar = obVar.actionBar;
            if (lVar != null) {
                lVar.invalidate();
            }
            obVar.X.invalidate();
            Iterator it = obVar.h.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public static void Y(ob obVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        a0.h hVar = obVar.k0;
        obVar.s0 = false;
        obVar.C0.N = false;
        obVar.X0(false);
        MessagesController.getInstance(obVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(obVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_channels_adminLogResults.events.size(); i10++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i10);
            if (hVar.h(tL_channelAdminLogEvent2.id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                obVar.O = Math.min(obVar.O, tL_channelAdminLogEvent2.id);
                MessageObject messageObject = new MessageObject(obVar.currentAccount, tL_channelAdminLogEvent2, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) hashMap, obVar.s, obVar.T, false);
                if (messageObject.contentType >= 0 && (((tL_channelAdminLogEvent = messageObject.currentEvent) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !hVar.d(tL_channelAdminLogEvent2.id))) {
                    obVar.n0.add(0, messageObject);
                    hVar.k(messageObject, tL_channelAdminLogEvent2.id);
                    z10 = true;
                }
            }
        }
        if (obVar.E == null || !z10) {
            return;
        }
        obVar.R0();
        obVar.E.l();
    }

    public static void Z(ob obVar, TLRPC.TL_error tL_error, TLObject tLObject) {
        TLRPC.ChatFull chatFull;
        TLRPC.Chat chat = obVar.s;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            obVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
            obVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
            obVar.t0 = tL_channels_channelParticipants.participants;
            if (chat != null && (chatFull = obVar.getMessagesController().getChatFull(chat.id)) != null && chatFull.antispam) {
                ya yaVar = new ya();
                yaVar.user_id = obVar.getMessagesController().telegramAntispamUserId;
                yaVar.peer = obVar.getMessagesController().getPeer(yaVar.user_id);
                long j10 = obVar.getMessagesController().telegramAntispamUserId;
                if (obVar.getMessagesController().getUser(Long.valueOf(j10)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j10;
                    tL_users_getUsers.id.add(tL_inputUser);
                    ConnectionsManager.getInstance(obVar.currentAccount).sendRequest(tL_users_getUsers, new ma(obVar, 2));
                }
                obVar.t0.add(0, yaVar);
            }
            Dialog dialog = obVar.visibleDialog;
            if (dialog instanceof org.telegram.ui.Components.i0) {
                ((org.telegram.ui.Components.i0) dialog).S(obVar.t0);
            }
        }
    }

    public static void a1(MessageObject messageObject, int i10) {
        if (messageObject == null) {
            return;
        }
        if (i10 <= 0) {
            TLRPC.ReplyMarkup replyMarkup = messageObject.messageOwner.reply_markup;
            if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.clear();
            }
            TLRPC.ReplyMarkup replyMarkup2 = messageObject.messageOwner.reply_markup;
            if (replyMarkup2 instanceof TLRPC.TL_replyKeyboardMarkup) {
                ((TLRPC.TL_replyKeyboardMarkup) replyMarkup2).rows.clear();
            }
        } else {
            TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = new TLRPC.TL_replyInlineMarkup();
            messageObject.messageOwner.reply_markup = tL_replyInlineMarkup;
            TL_keyboard.TL_keyboardInlineButtonRow tL_keyboardInlineButtonRow = new TL_keyboard.TL_keyboardInlineButtonRow();
            tL_replyInlineMarkup.rows.add(tL_keyboardInlineButtonRow);
            TL_keyboard.TL_keyboardInlineButton tL_keyboardInlineButton = new TL_keyboard.TL_keyboardInlineButton();
            tL_keyboardInlineButton.text = LocaleController.formatPluralString("EventLogExpandMore", i10, new Object[0]);
            tL_keyboardInlineButtonRow.buttons.add(tL_keyboardInlineButton);
        }
        messageObject.measureInlineBotButtons();
    }

    public static CharSequence b1(SpannableStringBuilder spannableStringBuilder) {
        int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(spannableStringBuilder, "\n\n");
        if (charSequenceIndexOf >= 0 && Build.VERSION.SDK_INT >= 29) {
            if (!com.google.android.recaptcha.internal.a.u(spannableStringBuilder)) {
                spannableStringBuilder = new SpannableStringBuilder(spannableStringBuilder);
            }
            android.support.v4.media.session.z.k();
            spannableStringBuilder.setSpan(android.support.v4.media.session.z.f(AndroidUtilities.dp(8.0f)), charSequenceIndexOf + 1, charSequenceIndexOf + 2, 33);
        }
        return spannableStringBuilder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        r7.putLong("ban_chat_id", r0.id);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void p0(ob obVar, Bundle bundle, long j10) {
        TLRPC.Chat chat = obVar.s;
        if (!chat.megagroup || obVar.t0 == null || !ChatObject.canBlockUsers(chat)) {
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= obVar.t0.size()) {
                break;
            }
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) obVar.t0.get(i10);
            if (MessageObject.getPeerId(channelParticipant.peer) != j10) {
                i10++;
            } else if (!channelParticipant.can_edit) {
                return;
            }
        }
    }

    public static void v0(ob obVar, MessageObject messageObject) {
        if (obVar.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(obVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = string;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (messageObject.type == 3) {
            c2Var.P = LocaleController.getString(R.string.NoPlayerInstalled);
        } else {
            c2Var.P = LocaleController.formatString(R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type);
        }
        obVar.showDialog(c2Var);
    }

    public final MessageObject N0(long j10, long j11, ArrayList arrayList, boolean z10, boolean z11) {
        int i10;
        MessageObject messageObject;
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.o0;
            i10 = 1;
            if (i11 >= arrayList2.size()) {
                messageObject = null;
                break;
            }
            messageObject = (MessageObject) arrayList2.get(i11);
            if (messageObject != null && messageObject.contentType == 1 && messageObject.actionDeleteGroupEventId == j10) {
                break;
            }
            i11++;
        }
        if (messageObject == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.dialog_id = -this.s.id;
            tL_message.id = -1;
            try {
                tL_message.date = ((MessageObject) arrayList.get(0)).messageOwner.date;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            messageObject = new MessageObject(this.currentAccount, tL_message, false, false);
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j11));
        messageObject.contentType = 1;
        if (!z11 || arrayList.size() <= 1) {
            messageObject.actionDeleteGroupEventId = -1L;
        } else {
            messageObject.actionDeleteGroupEventId = j10;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MessageObject.replaceWithLink(LocaleController.formatPluralString(z11 ? "EventLogDeletedMultipleMessagesToExpand" : "EventLogDeletedMultipleMessages", arrayList.size(), TextUtils.join(", ", Collection.-EL.stream(arrayList).map(new j8(i10)).distinct().map(new Function() { // from class: org.telegram.ui.ta
            public /* synthetic */ Function andThen(Function function) {
                return Function$-CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Long l10 = (Long) obj;
                ob obVar = ob.this;
                obVar.getClass();
                if (l10.longValue() >= 0) {
                    return UserObject.getForcedFirstName(obVar.getMessagesController().getUser(l10));
                }
                TLRPC.Chat chat = obVar.getMessagesController().getChat(Long.valueOf(-l10.longValue()));
                if (chat == null) {
                    return null;
                }
                return chat.title;
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$-CC.$default$compose(this, function);
            }
        }).filter(new ih.d1(i10)).limit(4L).toArray())), "un1", user));
        if (z11 && arrayList.size() > 1) {
            h01 S0 = S0(messageObject.messageText);
            if (S0 == null) {
                S0 = new h01(LocaleController.getString(z10 ? R.string.EventLogDeletedMultipleMessagesHide : R.string.EventLogDeletedMultipleMessagesShow));
                Typeface bold = AndroidUtilities.bold();
                org.telegram.ui.Components.n6 n6Var = S0.a;
                n6Var.u(bold);
                n6Var.t(AndroidUtilities.dp(10.0f));
                if (S0.c != -1) {
                    S0.c = -1;
                    S0.invalidateSelf();
                }
                S0.a(503316480);
            } else {
                S0.a.q(LocaleController.getString(z10 ? R.string.EventLogDeletedMultipleMessagesHide : R.string.EventLogDeletedMultipleMessagesShow), false, true);
            }
            S0.setBounds(0, 0, S0.getIntrinsicWidth(), AndroidUtilities.dp(17.33f));
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.iq(0, S0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        messageObject.messageText = spannableStringBuilder;
        MessageObject messageObject2 = arrayList.size() > 0 ? (MessageObject) j7.l1.i(1, arrayList) : null;
        if (messageObject2 != null) {
            long j12 = messageObject2.eventId;
            a0.h hVar = this.E0;
            if (!hVar.d(j12)) {
                long j13 = messageObject2.eventId;
                int i12 = T0;
                T0 = i12 + 1;
                hVar.k(Integer.valueOf(i12), j13);
            }
            messageObject.stableId = ((Integer) hVar.f(messageObject2.eventId)).intValue();
        }
        return messageObject;
    }

    public final void O0(boolean z10) {
        k kVar = this.C;
        if (kVar == null || this.i0) {
            return;
        }
        int L0 = kVar.L0();
        if ((L0 == -1 ? 0 : Math.abs(this.C.N0() - L0) + 1) > 0) {
            this.E.getClass();
            if (L0 > (z10 ? 4 : 1) || this.r0 || this.q0) {
                return;
            }
            V0(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x01e1, code lost:
    
        if ((r12.currentEvent.action instanceof org.telegram.tgnet.TLRPC.TL_channelAdminLogEventActionToggleAntiSpam) != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0146, code lost:
    
        if (org.telegram.messenger.MediaDataController.getInstance(r22.currentAccount).isStickerPackInstalled(r0.id) == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0148, code lost:
    
        r8 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x015c, code lost:
    
        if (org.telegram.messenger.MediaDataController.getInstance(r22.currentAccount).isStickerPackInstalled(r0.short_name) == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01d5, code lost:
    
        if (r10.user_id != getMessagesController().telegramAntispamUserId) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01e5, code lost:
    
        if ((r23 instanceof org.telegram.ui.Cells.v0) == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01e7, code lost:
    
        r0 = new android.text.SpannableString(">");
        r2 = getParentActivity().getResources().getDrawable(org.telegram.messenger.R.drawable.attach_arrow_right).mutate();
        r2.setColorFilter(new android.graphics.PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.Gi), android.graphics.PorterDuff.Mode.MULTIPLY));
        r2.setBounds(0, 0, org.telegram.messenger.AndroidUtilities.dp(10.0f), org.telegram.messenger.AndroidUtilities.dp(10.0f));
        r0.setSpan(new android.text.style.ImageSpan(r2, 2), 0, r0.length(), 33);
        r2 = new android.text.SpannableStringBuilder();
        r2.append((java.lang.CharSequence) org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.EventLogFilterGroupInfo)).append((java.lang.CharSequence) "\u2009").append((java.lang.CharSequence) r0).append((java.lang.CharSequence) "\u2009").append((java.lang.CharSequence) org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.ChannelAdministrators));
        r2.setSpan(new cg.l0(r22, 4), 0, r2.length(), 33);
        r0 = org.telegram.ui.Components.tc.a0(r22).M(org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.ChannelAntiSpamUser), org.telegram.messenger.AndroidUtilities.replaceCharSequence("%s", org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.ChannelAntiSpamInfo2), r2), org.telegram.messenger.R.raw.msg_antispam);
        r0.j = 5000;
        r0.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0284, code lost:
    
        return r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0285, code lost:
    
        r0.add(org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.ReportFalsePositive));
        org.telegram.ui.b.h(org.telegram.messenger.R.drawable.msg_notspam, 34, r9, r6);
        r3 = null;
        r0.add(null);
        r9.add(null);
        r6.add(null);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x05c6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean P0(View view, float f9, float f10) {
        Integer num;
        String str;
        boolean z10;
        Integer num2;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        boolean z11;
        ArrayList arrayList;
        na naVar;
        ArrayList arrayList2;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction;
        TLRPC.Message message;
        TLRPC.User user;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2;
        char c3 = '\n';
        MessageObject messageObject = view instanceof org.telegram.ui.Cells.s1 ? ((org.telegram.ui.Cells.s1) view).getMessageObject() : view instanceof org.telegram.ui.Cells.v0 ? ((org.telegram.ui.Cells.v0) view).getMessageObject() : null;
        if (messageObject != null) {
            int i10 = messageObject.type;
            if (i10 == 6) {
                num = 10;
            } else {
                if (i10 == 10 || i10 == 11 || i10 == 16) {
                    num = 10;
                    if (messageObject.getId() != 0) {
                        c3 = 1;
                    }
                } else {
                    if (!messageObject.isVoice()) {
                        if (messageObject.isSticker() || messageObject.isAnimatedSticker()) {
                            TLRPC.InputStickerSet inputStickerSet = messageObject.getInputStickerSet();
                            if (inputStickerSet instanceof TLRPC.TL_inputStickerSetID) {
                                num = 10;
                            } else {
                                num = 10;
                                if (inputStickerSet instanceof TLRPC.TL_inputStickerSetShortName) {
                                }
                                c3 = 2;
                            }
                        } else if ((!messageObject.isRoundVideo() || (messageObject.isRoundVideo() && BuildVars.DEBUG_VERSION)) && ((messageObject.messageOwner.media instanceof TLRPC.TL_messageMediaPhoto) || messageObject.getDocument() != null || messageObject.isMusic() || messageObject.isVideo())) {
                            String str2 = messageObject.messageOwner.attachPath;
                            boolean z12 = (str2 == null || str2.length() == 0 || !new File(messageObject.messageOwner.attachPath).exists()) ? false : true;
                            if (!z12 && getFileLoader().getPathToMessage(messageObject.messageOwner).exists()) {
                                z12 = true;
                            }
                            if (z12) {
                                if (messageObject.getDocument() != null && (str = messageObject.getDocument().mime_type) != null) {
                                    if (messageObject.getDocumentName().toLowerCase().endsWith("attheme")) {
                                        num = 10;
                                    } else if (str.endsWith("/xml")) {
                                        num = 10;
                                        c3 = 5;
                                    } else if (str.endsWith("/png") || str.endsWith("/jpg") || str.endsWith("/jpeg")) {
                                        num = 10;
                                        c3 = 6;
                                    }
                                }
                                num = 10;
                                c3 = 4;
                            }
                        } else if (messageObject.type == 12) {
                            num = 10;
                            c3 = '\b';
                        } else if (messageObject.isMediaEmpty()) {
                            num = 10;
                            c3 = 3;
                        }
                    }
                    num = 10;
                    c3 = 2;
                }
                this.Y = messageObject;
                if (getParentActivity() != null) {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    TLRPC.Chat chat3 = this.s;
                    if (chat3 == null || (tL_channelAdminLogEvent2 = messageObject.currentEvent) == null) {
                        z10 = true;
                    } else {
                        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction2 = tL_channelAdminLogEvent2.action;
                        z10 = true;
                        if (channelAdminLogEventAction2 instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) {
                            TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite tL_channelAdminLogEventActionParticipantJoinByInvite = (TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) channelAdminLogEventAction2;
                            if (tL_channelAdminLogEventActionParticipantJoinByInvite.invite != null) {
                                org.telegram.ui.Components.n60 n60Var = new org.telegram.ui.Components.n60(getParentActivity(), tL_channelAdminLogEventActionParticipantJoinByInvite.invite, getMessagesController().getChatFull(chat3.id), null, this, chat3.id, false, ChatObject.isChannelAndNotMegaGroup(chat3));
                                n60Var.g0 = false;
                                n60Var.show();
                                return true;
                            }
                        }
                    }
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent3 = messageObject.currentEvent;
                    if (tL_channelAdminLogEvent3 == null) {
                        num2 = 4;
                        chat = chat3;
                    } else if (tL_channelAdminLogEvent3.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                        num2 = 4;
                        chat = chat3;
                    } else {
                        num2 = 4;
                        chat = chat3;
                    }
                    TLRPC.User user2 = null;
                    MessageObject messageObject2 = this.Y;
                    if (messageObject2.type == 0 || messageObject2.caption != null) {
                        arrayList3.add(LocaleController.getString(R.string.Copy));
                        b.h(R.drawable.msg_copy, 3, arrayList5, arrayList4);
                    }
                    if (c3 == 1) {
                        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent4 = this.Y.currentEvent;
                        if (tL_channelAdminLogEvent4 != null) {
                            TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction3 = tL_channelAdminLogEvent4.action;
                            if (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionChangeStickerSet) {
                                TLRPC.TL_channelAdminLogEventActionChangeStickerSet tL_channelAdminLogEventActionChangeStickerSet = (TLRPC.TL_channelAdminLogEventActionChangeStickerSet) channelAdminLogEventAction3;
                                TLRPC.InputStickerSet inputStickerSet2 = tL_channelAdminLogEventActionChangeStickerSet.new_stickerset;
                                if (inputStickerSet2 == null || (inputStickerSet2 instanceof TLRPC.TL_inputStickerSetEmpty)) {
                                    inputStickerSet2 = tL_channelAdminLogEventActionChangeStickerSet.prev_stickerset;
                                }
                                TLRPC.InputStickerSet inputStickerSet3 = inputStickerSet2;
                                if (inputStickerSet3 != null) {
                                    showDialog(new org.telegram.ui.Components.nx0(getParentActivity(), this, inputStickerSet3, null, null, null));
                                    return true;
                                }
                                arrayList = arrayList3;
                                chat2 = chat;
                                z11 = false;
                                arrayList2 = arrayList;
                                naVar = new na(this, arrayList4, arrayList2, arrayList5, view, f9, f10);
                                if (ChatObject.canBlockUsers(chat2) && (tL_channelAdminLogEvent = messageObject.currentEvent) != null) {
                                    channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                                    if ((!(channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionEditMessage) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoin) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByRequest)) && (message = messageObject.messageOwner) != null && message.from_id != null && (user = getMessagesController().getUser(Long.valueOf(this.Y.messageOwner.from_id.user_id))) != null && !UserObject.isUserSelf(user)) {
                                        MessagesController messagesController = getMessagesController();
                                        Utilities.Callback<TLRPC.ChannelParticipant> g2Var = new jh.g2(this, arrayList2, arrayList5, arrayList4, naVar, 1);
                                        naVar = naVar;
                                        messagesController.getChannelParticipant(chat2, user, g2Var);
                                        z11 = true;
                                    }
                                }
                                if (!z11) {
                                    return true;
                                }
                                naVar.run();
                                return true;
                            }
                        }
                        if (tL_channelAdminLogEvent4 == null || !(tL_channelAdminLogEvent4.action instanceof TLRPC.TL_channelAdminLogEventActionChangeEmojiStickerSet)) {
                            chat2 = chat;
                            z11 = false;
                            if (tL_channelAdminLogEvent4 != null && (tL_channelAdminLogEvent4.action instanceof TLRPC.TL_channelAdminLogEventActionChangeHistoryTTL) && ChatObject.canUserDoAdminAction(chat2, 13)) {
                                org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(getParentActivity(), chat2);
                                wpVar.v = new va(this);
                                showDialog(wpVar);
                            }
                        } else {
                            chat2 = chat;
                            z11 = false;
                            c70 c70Var = new c70(chat2.id, 0);
                            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(chat2.id);
                            if (chatFull != null) {
                                c70Var.e0(chatFull);
                                presentFragment(c70Var);
                            }
                        }
                    } else {
                        chat2 = chat;
                        z11 = false;
                        if (c3 == 3) {
                            TLRPC.MessageMedia messageMedia = this.Y.messageOwner.media;
                            if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.isNewGifDocument(messageMedia.webpage.document)) {
                                arrayList3.add(LocaleController.getString(R.string.SaveToGIFs));
                                b.k(R.drawable.msg_gif, arrayList5, arrayList4, 11);
                            }
                        } else if (c3 != 4) {
                            Integer num3 = num;
                            if (c3 == 5) {
                                arrayList3.add(LocaleController.getString(R.string.ApplyLocalizationFile));
                                b.k(R.drawable.msg_language, arrayList5, arrayList4, 5);
                                arrayList3.add(LocaleController.getString(R.string.SaveToDownloads));
                                b.k(R.drawable.msg_download, arrayList5, arrayList4, num3);
                                arrayList3.add(LocaleController.getString(R.string.ShareFile));
                                b.k(R.drawable.msg_share, arrayList5, arrayList4, 6);
                            } else if (c3 == '\n') {
                                arrayList3.add(LocaleController.getString(R.string.ApplyThemeFile));
                                b.k(R.drawable.msg_theme, arrayList5, arrayList4, 5);
                                arrayList3.add(LocaleController.getString(R.string.SaveToDownloads));
                                b.k(R.drawable.msg_download, arrayList5, arrayList4, num3);
                                arrayList3.add(LocaleController.getString(R.string.ShareFile));
                                b.k(R.drawable.msg_share, arrayList5, arrayList4, 6);
                            } else if (c3 == 6) {
                                arrayList3.add(LocaleController.getString(R.string.SaveToGallery));
                                b.h(R.drawable.msg_gallery, 7, arrayList5, arrayList4);
                                arrayList3.add(LocaleController.getString(R.string.SaveToDownloads));
                                b.k(R.drawable.msg_download, arrayList5, arrayList4, num3);
                                arrayList3.add(LocaleController.getString(R.string.ShareFile));
                                b.k(R.drawable.msg_share, arrayList5, arrayList4, 6);
                            } else if (c3 == 7) {
                                if (this.Y.isMask()) {
                                    arrayList3.add(LocaleController.getString(R.string.AddToMasks));
                                } else {
                                    arrayList3.add(LocaleController.getString(R.string.AddToStickers));
                                }
                                b.h(R.drawable.msg_sticker, 9, arrayList5, arrayList4);
                            } else if (c3 == '\b') {
                                long j10 = this.Y.messageOwner.media.user_id;
                                TLRPC.User user3 = j10 != 0 ? MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)) : user2;
                                if (user3 != null && user3.id != UserConfig.getInstance(this.currentAccount).getClientUserId() && ContactsController.getInstance(this.currentAccount).contactsDict.get(Long.valueOf(user3.id)) == null) {
                                    arrayList3.add(LocaleController.getString(R.string.AddContactTitle));
                                    b.h(R.drawable.msg_addcontact, 15, arrayList5, arrayList4);
                                }
                                if (!TextUtils.isEmpty(this.Y.messageOwner.media.phone_number)) {
                                    arrayList3.add(LocaleController.getString(R.string.Copy));
                                    b.h(R.drawable.msg_copy, 16, arrayList5, arrayList4);
                                    arrayList3.add(LocaleController.getString(R.string.Call));
                                    b.h(R.drawable.msg_calls, 17, arrayList5, arrayList4);
                                }
                            }
                        } else if (this.Y.isVideo()) {
                            arrayList3.add(LocaleController.getString(R.string.SaveToGallery));
                            b.k(R.drawable.msg_gallery, arrayList5, arrayList4, num2);
                            arrayList3.add(LocaleController.getString(R.string.ShareFile));
                            b.k(R.drawable.msg_share, arrayList5, arrayList4, 6);
                        } else if (this.Y.isMusic()) {
                            arrayList3.add(LocaleController.getString(R.string.SaveToMusic));
                            b.k(R.drawable.msg_download, arrayList5, arrayList4, num);
                            arrayList3.add(LocaleController.getString(R.string.ShareFile));
                            b.k(R.drawable.msg_share, arrayList5, arrayList4, 6);
                        } else {
                            Integer num4 = num;
                            if (this.Y.getDocument() != null) {
                                if (MessageObject.isNewGifDocument(this.Y.getDocument())) {
                                    arrayList3.add(LocaleController.getString(R.string.SaveToGIFs));
                                    b.k(R.drawable.msg_gif, arrayList5, arrayList4, 11);
                                }
                                arrayList3.add(LocaleController.getString(R.string.SaveToDownloads));
                                b.k(R.drawable.msg_download, arrayList5, arrayList4, num4);
                                arrayList3.add(LocaleController.getString(R.string.ShareFile));
                                b.k(R.drawable.msg_share, arrayList5, arrayList4, 6);
                            } else {
                                arrayList3.add(LocaleController.getString(R.string.SaveToGallery));
                                b.k(R.drawable.msg_gallery, arrayList5, arrayList4, num2);
                            }
                        }
                    }
                    arrayList = arrayList3;
                    arrayList2 = arrayList;
                    naVar = new na(this, arrayList4, arrayList2, arrayList5, view, f9, f10);
                    if (ChatObject.canBlockUsers(chat2)) {
                        channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                        if (!(channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) {
                        }
                        MessagesController messagesController2 = getMessagesController();
                        Utilities.Callback<TLRPC.ChannelParticipant> g2Var2 = new jh.g2(this, arrayList2, arrayList5, arrayList4, naVar, 1);
                        naVar = naVar;
                        messagesController2.getChannelParticipant(chat2, user, g2Var2);
                        z11 = true;
                    }
                    if (!z11) {
                    }
                }
            }
            c3 = 65535;
            this.Y = messageObject;
            if (getParentActivity() != null) {
            }
        }
        return false;
    }

    public final TextureView Q0(boolean z10) {
        if (this.parentLayout == null) {
            return null;
        }
        if (this.d0 == null) {
            n0 n0Var = new n0(this, getParentActivity(), 4);
            this.d0 = n0Var;
            n0Var.setOutlineProvider(new eg.k1(8));
            this.d0.setClipToOutline(true);
            this.d0.setWillNotDraw(false);
            this.d0.setVisibility(4);
            e5.c cVar = new e5.c(getParentActivity());
            this.e0 = cVar;
            cVar.setBackgroundColor(0);
            if (z10) {
                this.d0.addView(this.e0, i7.f6.c(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.f0 = textureView;
            textureView.setOpaque(false);
            this.e0.addView(this.f0, i7.f6.c(-1.0f, -1));
        }
        if (this.d0.getParent() == null) {
            lb lbVar = this.X;
            n0 n0Var2 = this.d0;
            int i10 = AndroidUtilities.roundMessageSize;
            lbVar.addView(n0Var2, 1, new FrameLayout.LayoutParams(i10, i10));
        }
        this.d0.setVisibility(4);
        this.e0.setDrawingReady(false);
        return this.f0;
    }

    public final void R0() {
        ArrayList arrayList;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.D0.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList4 = this.n0;
            if (i10 >= arrayList4.size()) {
                ArrayList arrayList5 = this.o0;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                return;
            }
            MessageObject messageObject = (MessageObject) arrayList4.get(i10);
            long j10 = (messageObject == null || (tL_channelAdminLogEvent2 = messageObject.currentEvent) == null || !(tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) ? 0L : tL_channelAdminLogEvent2.user_id;
            if (messageObject.stableId <= 0) {
                int i11 = T0;
                T0 = i11 + 1;
                messageObject.stableId = i11;
            }
            int i12 = i10 + 1;
            MessageObject messageObject2 = i12 < arrayList4.size() ? (MessageObject) arrayList4.get(i12) : null;
            long j11 = (messageObject2 == null || (tL_channelAdminLogEvent = messageObject2.currentEvent) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) ? 0L : tL_channelAdminLogEvent.user_id;
            if (j10 != 0) {
                arrayList3.add(messageObject);
            } else {
                arrayList2.add(messageObject);
            }
            if (j10 == j11 || arrayList3.isEmpty()) {
                arrayList = arrayList3;
            } else {
                TLRPC.ReplyMarkup replyMarkup = messageObject.messageOwner.reply_markup;
                boolean z10 = (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.isEmpty();
                int size = arrayList2.size();
                ArrayList arrayList6 = new ArrayList();
                for (int size2 = arrayList3.size() - 1; size2 >= 0 && ((MessageObject) arrayList3.get(size2)).contentType == 1; size2--) {
                    arrayList6.add((MessageObject) arrayList3.remove(size2));
                }
                if (arrayList3.isEmpty()) {
                    arrayList = arrayList3;
                } else {
                    MessageObject messageObject3 = (MessageObject) j7.l1.i(1, arrayList3);
                    boolean z11 = TextUtils.isEmpty(this.v0) && arrayList3.size() > 3;
                    Long valueOf = Long.valueOf(messageObject3.eventId);
                    HashSet hashSet = this.p0;
                    if (hashSet.contains(valueOf) || !z11) {
                        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                            a1((MessageObject) arrayList3.get(i13), 0);
                        }
                        arrayList2.addAll(arrayList3);
                    } else {
                        a1(messageObject3, arrayList3.size() - 1);
                        arrayList2.add(messageObject3);
                    }
                    TLRPC.ReplyMarkup replyMarkup2 = messageObject3.messageOwner.reply_markup;
                    if (z10 != ((replyMarkup2 instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup2).rows.isEmpty())) {
                        messageObject3.forceUpdate = true;
                        this.E.m((z10 ? arrayList3.size() - 1 : 0) + size);
                        this.E.m(size + (z10 ? arrayList3.size() - 1 : 0) + 1);
                    }
                    long j12 = messageObject.eventId;
                    MessageObject N0 = N0(j12, messageObject.currentEvent.user_id, arrayList3, hashSet.contains(Long.valueOf(j12)), z11);
                    arrayList = arrayList3;
                    arrayList2.add(N0);
                }
                if (!arrayList6.isEmpty()) {
                    MessageObject messageObject4 = (MessageObject) j7.l1.i(1, arrayList6);
                    arrayList2.addAll(arrayList6);
                    arrayList2.add(N0(messageObject4.eventId, messageObject4.currentEvent.user_id, arrayList6, true, false));
                }
                arrayList.clear();
            }
            i10 = i12;
            arrayList3 = arrayList;
        }
    }

    public final void T0(boolean z10) {
        if (this.M.getTag() == null || this.P) {
            return;
        }
        if (!this.S || this.Q) {
            this.M.setTag(null);
            if (!z10) {
                AnimatorSet animatorSet = this.R;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.R = null;
                }
                this.M.setAlpha(0.0f);
                return;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.R = animatorSet2;
            animatorSet2.setDuration(150L);
            this.R.playTogether(ObjectAnimator.ofFloat(this.M, "alpha", 0.0f));
            this.R.addListener(new nh.q5(this, 23));
            this.R.setStartDelay(500L);
            this.R.start();
        }
    }

    public final void U0(int i10) {
        if (Build.VERSION.SDK_INT < 31 || this.n == null) {
            return;
        }
        jf.e0 e0Var = this.P0;
        if (e0Var.c == 0) {
            e0Var.invalidate();
        }
        e0Var.c = i10 | e0Var.c;
    }

    public final void V0(boolean z10) {
        kb kbVar;
        if (this.r0) {
            return;
        }
        ArrayList arrayList = this.n0;
        if (z10) {
            this.O = Long.MAX_VALUE;
            FrameLayout frameLayout = this.w;
            if (frameLayout != null) {
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 0.3f, true);
                this.H.setVisibility(4);
                this.A.setEmptyView(null);
            }
            this.k0.b();
            arrayList.clear();
            this.m0.clear();
            R0();
        }
        this.r0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.s);
        tL_channels_getAdminLog.q = this.v0;
        tL_channels_getAdminLog.limit = 50;
        if (z10 || arrayList.isEmpty()) {
            tL_channels_getAdminLog.max_id = 0L;
        } else {
            tL_channels_getAdminLog.max_id = this.O;
        }
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.u0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.w0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i10 = 0; i10 < this.w0.m(); i10++) {
                tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.w0.n(i10)));
            }
        }
        c1();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new ma(this, 4));
        if (!z10 || (kbVar = this.E) == null) {
            return;
        }
        kbVar.l();
    }

    public final void W0() {
        if (this.s0) {
            return;
        }
        this.s0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.s);
        tL_channels_getAdminLog.q = this.v0;
        tL_channels_getAdminLog.limit = 10;
        tL_channels_getAdminLog.max_id = 0L;
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.u0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.w0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i10 = 0; i10 < this.w0.m(); i10++) {
                tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.w0.n(i10)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new ma(this, 1));
    }

    public final void X0(boolean z10) {
        db dbVar = this.A;
        if (dbVar == null || this.C == null || dbVar.getChildCount() <= 0) {
            return;
        }
        int i10 = z10 ? ConnectionsManager.DEFAULT_DATACENTER_ID : TLObject.FLAG_31;
        View view = null;
        int i11 = -1;
        for (int i12 = 0; i12 < this.A.getChildCount(); i12++) {
            View childAt = this.A.getChildAt(i12);
            this.A.getClass();
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                int top = childAt.getTop();
                if (z10) {
                    if (top >= i10) {
                    }
                    i10 = childAt.getTop();
                    view = childAt;
                    i11 = R;
                } else {
                    if (top <= i10) {
                    }
                    i10 = childAt.getTop();
                    view = childAt;
                    i11 = R;
                }
            }
        }
        if (view != null) {
            this.M0 = view instanceof org.telegram.ui.Cells.s1 ? ((org.telegram.ui.Cells.s1) view).getMessageObject().eventId : view instanceof org.telegram.ui.Cells.v0 ? ((org.telegram.ui.Cells.v0) view).getMessageObject().eventId : 0L;
            this.N0 = i11;
            this.O0 = (this.A.getMeasuredHeight() - view.getBottom()) - this.A.getPaddingBottom();
        }
    }

    public final int Y0(MessageObject messageObject) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        int i10;
        int findQuoteStart;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        if (TextUtils.isEmpty(null)) {
            org.telegram.ui.Cells.s1 s1Var2 = this.J0;
            if (s1Var2 != null) {
                s1Var2.se = 0;
                s1Var2.te = null;
            }
        } else {
            if (TextUtils.isEmpty(messageObject.caption) || (s1Var = this.J0) == null || (textLayoutBlocks = s1Var.Y3) == null) {
                CharSequence charSequence2 = messageObject.messageText;
                arrayList = messageObject.textLayoutBlocks;
                org.telegram.ui.Cells.s1 s1Var3 = this.J0;
                if (s1Var3 == null || !s1Var3.p1) {
                    charSequence = charSequence2;
                    i10 = 0;
                } else {
                    i10 = s1Var3.i2 + AndroidUtilities.dp(10.0f);
                    charSequence = charSequence2;
                }
            } else {
                i10 = (int) s1Var.m4;
                charSequence = messageObject.caption;
                arrayList = textLayoutBlocks.textLayoutBlocks;
            }
            org.telegram.ui.Cells.s1 s1Var4 = this.J0;
            if (s1Var4 != null) {
                s1Var4.se = 0;
                s1Var4.te = null;
            }
            if (arrayList != null && charSequence != null && (findQuoteStart = MessageObject.findQuoteStart(charSequence.toString(), null, this.H0)) >= 0) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i11);
                    String charSequence3 = textLayoutBlock.textLayout.getText().toString();
                    int i12 = textLayoutBlock.charactersOffset;
                    if (findQuoteStart > i12) {
                        float textYOffset = findQuoteStart - i12 > charSequence3.length() + (-1) ? i10 + ((int) (textLayoutBlock.textYOffset(arrayList) + textLayoutBlock.padTop + textLayoutBlock.height)) : r5.getLineTop(r5.getLineForOffset(findQuoteStart - textLayoutBlock.charactersOffset)) + textLayoutBlock.textYOffset(arrayList) + i10 + textLayoutBlock.padTop;
                        if (textYOffset > AndroidUtilities.displaySize.y * (this.X.getKeyboardHeight() > AndroidUtilities.dp(20.0f) ? 0.7f : 0.5f)) {
                            return (int) (textYOffset - (AndroidUtilities.displaySize.y * (this.X.getKeyboardHeight() > AndroidUtilities.dp(20.0f) ? 0.7f : 0.5f)));
                        }
                    } else {
                        i11++;
                    }
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012d A[LOOP:1: B:31:0x0098->B:42:0x012d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z0(MessageObject messageObject) {
        int i10;
        int i11;
        int indexOf;
        float f9;
        int g12;
        MessageObject messageObject2;
        ArrayList arrayList = this.o0;
        if (arrayList.size() > 0) {
            int N0 = this.C.N0();
            for (int L0 = this.C.L0(); L0 <= N0; L0++) {
                kb kbVar = this.E;
                int i12 = kbVar.f;
                if (L0 >= i12 && L0 < kbVar.h) {
                    MessageObject messageObject3 = (MessageObject) arrayList.get(L0 - i12);
                    if (messageObject3.contentType != 1 && messageObject3.getRealId() != 0 && !messageObject3.isSponsored()) {
                        i11 = L0 - this.E.f;
                        i10 = (messageObject3.getRealId() < messageObject.getRealId() ? 1 : 0) ^ 1;
                        this.D.b = i10;
                        indexOf = arrayList.indexOf(messageObject);
                        if (indexOf == -1) {
                            if (i11 > 0) {
                                i10 = i11 > indexOf ? 0 : 1;
                                this.D.b = i10;
                            }
                            ra raVar = this.I0;
                            if (raVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(raVar);
                                this.I0 = null;
                            }
                            this.G0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            this.G0 = messageObject.getRealId();
                            int indexOf2 = arrayList.indexOf(messageObject) + this.E.f;
                            e1();
                            int childCount = this.A.getChildCount();
                            int i13 = 0;
                            boolean z10 = false;
                            int i14 = 0;
                            while (true) {
                                if (i13 >= childCount) {
                                    f9 = 2.0f;
                                    break;
                                }
                                View childAt = this.A.getChildAt(i13);
                                if (childAt instanceof org.telegram.ui.Cells.s1) {
                                    MessageObject messageObject4 = ((org.telegram.ui.Cells.s1) childAt).getMessageObject();
                                    if (messageObject4 != null) {
                                        f9 = 2.0f;
                                        if (messageObject4.getRealId() == messageObject.getRealId()) {
                                            childAt.sendAccessibilityEvent(8);
                                            i14 = Y0(messageObject4);
                                            z10 = true;
                                        }
                                    } else {
                                        f9 = 2.0f;
                                    }
                                    if (z10) {
                                        i13++;
                                    } else {
                                        int top = childAt.getTop() - (Math.max(-AndroidUtilities.dp(f9), (this.A.getMeasuredHeight() - childAt.getHeight()) / 2) - i14);
                                        int computeVerticalScrollRange = (this.A.computeVerticalScrollRange() - this.A.computeVerticalScrollOffset()) - this.A.computeVerticalScrollExtent();
                                        if (computeVerticalScrollRange < 0) {
                                            computeVerticalScrollRange = 0;
                                        }
                                        if (top > computeVerticalScrollRange) {
                                            top = computeVerticalScrollRange;
                                        }
                                        if (top != 0) {
                                            this.A.v0(0, top, null);
                                            this.A.setOverScrollMode(2);
                                        }
                                    }
                                } else {
                                    f9 = 2.0f;
                                    if ((childAt instanceof org.telegram.ui.Cells.v0) && (messageObject2 = ((org.telegram.ui.Cells.v0) childAt).getMessageObject()) != null && messageObject2.getRealId() == messageObject.getRealId()) {
                                        childAt.sendAccessibilityEvent(8);
                                        z10 = true;
                                    }
                                    if (z10) {
                                    }
                                }
                            }
                            if (z10) {
                                return;
                            }
                            boolean z11 = !TextUtils.isEmpty(null);
                            if (getParentActivity() == null) {
                                g12 = 0;
                            } else {
                                if (this.J0 == null) {
                                    this.J0 = new org.telegram.ui.Cells.s1(getParentActivity(), this.currentAccount);
                                }
                                org.telegram.ui.Cells.s1 s1Var = this.J0;
                                TLRPC.Chat chat = this.s;
                                s1Var.J7 = chat != null;
                                s1Var.O7 = ChatObject.isChannel(chat) && chat.megagroup;
                                g12 = this.J0.g1(messageObject, null, z11);
                            }
                            int max = Math.max(-AndroidUtilities.dp(f9), (this.A.getMeasuredHeight() - g12) / 2) - Y0(messageObject);
                            nb nbVar = this.L0;
                            nbVar.a = messageObject;
                            nbVar.e = max;
                            c2.z zVar = this.D;
                            zVar.b = i10;
                            nbVar.b = indexOf2;
                            nbVar.d = max;
                            nbVar.c = false;
                            zVar.c(indexOf2, max, false, false);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        this.D.b = i10;
        indexOf = arrayList.indexOf(messageObject);
        if (indexOf == -1) {
        }
    }

    public final void c1() {
        if (this.L == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.v0)) {
            this.K.setVisibility(8);
            this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f));
            this.L.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoLogFound)));
        } else if (this.w0 != null || this.u0 != null) {
            this.K.setVisibility(8);
            this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f));
            this.L.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoLogFoundFiltered)));
        } else {
            this.K.setVisibility(0);
            this.L.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            if (this.s.megagroup) {
                this.L.setText(b1(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogEmpty2))));
            } else {
                this.L.setText(b1(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogEmptyChannel2))));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        ArrayList arrayList = this.v;
        if (arrayList.isEmpty()) {
            for (int i10 = 0; i10 < 8; i10++) {
                arrayList.add(new org.telegram.ui.Cells.s1(context, this.currentAccount));
            }
        }
        this.U = false;
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.g6.J(context, false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        th.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new cg.n1(this, 15));
        org.telegram.ui.Components.xn xnVar = new org.telegram.ui.Components.xn(context, null, false, null);
        this.I = xnVar;
        cl clVar = xnVar.h;
        if (clVar != null) {
            clVar.setTextSizePx(AndroidUtilities.dp(17.5f));
        }
        cl clVar2 = xnVar.r;
        if (clVar2 != null) {
            clVar2.setTextSizePx(AndroidUtilities.dp(13.5f));
        }
        xnVar.g0 = true;
        this.I.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.I, 0, i7.f6.d(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new bb(this, 0);
        this.N = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.N.setSearchPaddingStart(7);
        this.I.setEnabled(false);
        org.telegram.ui.Components.xn xnVar2 = this.I;
        TLRPC.Chat chat = this.s;
        xnVar2.setTitle(chat.title);
        this.I.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
        this.I.setChatAvatar(chat);
        cb cbVar = new cb(this, context);
        this.fragmentView = cbVar;
        this.X = cbVar;
        jf.e0 e0Var = new jf.e0(context, new sa(this));
        this.P0 = e0Var;
        this.X.addView(e0Var);
        sg.i iVar = new sg.i(this.X);
        lb lbVar = this.X;
        lg.a aVar = this.e;
        aVar.d = iVar;
        aVar.e = lbVar;
        lg.a aVar2 = this.f;
        aVar2.d = iVar;
        aVar2.e = lbVar;
        lg.a aVar3 = this.b;
        aVar3.d = iVar;
        aVar3.e = lbVar;
        lbVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.X.V(org.telegram.ui.ActionBar.g6.r0());
        this.actionBar.L(aVar, pg.a.n(this.resourceProvider), false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.H = frameLayout;
        frameLayout.setVisibility(4);
        this.X.addView(this.H, i7.f6.e(-1, -2, 17));
        this.H.setOnTouchListener(new mh.d(7));
        LinearLayout linearLayout = new LinearLayout(context);
        this.J = linearLayout;
        linearLayout.setBackground(new org.telegram.ui.ActionBar.t5(this.L, this.X, AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.g6.f2));
        this.J.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.K.setImageResource(R.drawable.large_log_actions);
        this.K.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.K.setVisibility(8);
        this.J.addView(this.K, i7.f6.t(54, 54, 17, 16, 20, 16, -4));
        eg.r rVar = new eg.r(context, 8);
        this.L = rVar;
        rVar.setTextSize(1, 14.0f);
        this.L.setGravity(17);
        eg.r rVar2 = this.L;
        int i11 = org.telegram.ui.ActionBar.g6.ic;
        rVar2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        this.J.addView(this.L, i7.f6.t(-2, -2, 17, 0, 0, 0, 0));
        this.H.addView(this.J, i7.f6.d(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        db dbVar = new db(this, context);
        this.A = dbVar;
        dbVar.setOnItemClickListener(new h(this, 9));
        this.A.setTag(1);
        this.A.setVerticalScrollBarEnabled(true);
        db dbVar2 = this.A;
        kb kbVar = new kb(this, context);
        this.E = kbVar;
        dbVar2.setAdapter(kbVar);
        this.A.setClipToPadding(false);
        db dbVar3 = this.A;
        int i12 = AndroidUtilities.statusBarHeight;
        int i13 = this.r;
        dbVar3.setPadding(0, AndroidUtilities.dp(4.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i12 + i13, 0, AndroidUtilities.dp(60.0f) + i13 + AndroidUtilities.navigationBarHeight);
        db dbVar4 = this.A;
        eb ebVar = new eb(this, this.A, this.resourceProvider);
        this.C0 = ebVar;
        dbVar4.setItemAnimator(ebVar);
        this.C0.Q = true;
        this.A.setLayoutAnimation(null);
        k kVar = new k(this);
        this.C = kVar;
        kVar.j1(1);
        this.C.l1(true);
        this.A.setLayoutManager(this.C);
        c2.z zVar = new c2.z(this.A, this.C);
        this.D = zVar;
        zVar.h = new sa(this);
        zVar.i = this.L0;
        this.X.addView(this.A, i7.f6.c(-1.0f, -1));
        this.A.setOnScrollListener(new m3(this));
        int i14 = this.g0;
        if (i14 != -1) {
            this.C.h1(i14, this.h0);
            this.g0 = -1;
        }
        ug.f fVar = new ug.f(context);
        this.W = fVar;
        fVar.setup(aVar3);
        this.W.setFadeZoneTop(AndroidUtilities.dp(2.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.W.setFadeHeightTop(AndroidUtilities.dp(60.0f));
        this.W.setFadeZoneBottom(AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(9.0f) + AndroidUtilities.navigationBarHeight);
        this.W.setFadeHeightBottom(AndroidUtilities.dp(60.0f));
        this.X.addView(this.W, i7.f6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.w = frameLayout2;
        frameLayout2.setVisibility(4);
        this.X.addView(this.w, i7.f6.e(-1, -1, 51));
        View view = new View(context);
        this.x = view;
        view.setBackground(new org.telegram.ui.ActionBar.t5(this.x, this.X, AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.g6.f2));
        this.w.addView(this.x, i7.f6.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.y = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        this.y.setProgressColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.w.addView(this.y, i7.f6.e(32, 32, 17));
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context);
        this.M = v0Var;
        v0Var.setAlpha(0.0f);
        this.M.setImportantForAccessibility(2);
        this.X.addView(this.M, i7.f6.d(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.X.addView(this.actionBar);
        org.telegram.ui.ActionBar.c6 c6Var = this.resourceProvider;
        ug.e eVar = new ug.e(context, aVar, pg.a.b(c6Var), c6Var);
        this.G = eVar;
        eVar.setTotalVisibilityFactor(1.0f);
        this.G.setTranslationY(-AndroidUtilities.navigationBarHeight);
        this.G.c(4, true, false);
        ug.e eVar2 = this.G;
        ng.d c3 = eVar2.n.c(eVar2, null, false);
        c3.n(eVar2.r);
        c3.p(AndroidUtilities.dp(22.0f));
        c3.o(AndroidUtilities.dp(6.0f));
        eVar2.s = c3;
        this.X.addView(this.G, i7.f6.d(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
        TextView textView = new TextView(context);
        this.F = textView;
        final int i15 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ua
            public final /* synthetic */ ob b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        ob obVar = this.b;
                        if (obVar.getParentActivity() != null) {
                            org.telegram.ui.Components.i0 i0Var = new org.telegram.ui.Components.i0(obVar, obVar.u0, obVar.w0, obVar.s.megagroup);
                            i0Var.S(obVar.t0);
                            i0Var.c0 = new sa(obVar);
                            obVar.showDialog(i0Var);
                            break;
                        }
                        break;
                    case 1:
                        ob obVar2 = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(obVar2.getParentActivity());
                        if (obVar2.s.megagroup) {
                            alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.N = string;
                        obVar2.showDialog(c2Var);
                        break;
                    default:
                        ob obVar3 = this.b;
                        if (obVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(obVar3.N.getSearchField());
                            obVar3.showDialog(org.telegram.ui.Components.c5.p(obVar3.getParentActivity(), new pa(obVar3, 0), null).a);
                            break;
                        }
                        break;
                }
            }
        });
        this.F.setTextSize(1, 15.0f);
        this.F.setTypeface(AndroidUtilities.bold());
        this.F.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ae, false));
        this.F.setText(LocaleController.getString(R.string.SETTINGS));
        this.F.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        this.G.getContainer().addView(this.F, i7.f6.e(-2, -2, 17));
        this.G.f.add(this.F);
        this.G.d(false);
        final int i16 = 1;
        this.G.b[4] = new View.OnClickListener(this) { // from class: org.telegram.ui.ua
            public final /* synthetic */ ob b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        ob obVar = this.b;
                        if (obVar.getParentActivity() != null) {
                            org.telegram.ui.Components.i0 i0Var = new org.telegram.ui.Components.i0(obVar, obVar.u0, obVar.w0, obVar.s.megagroup);
                            i0Var.S(obVar.t0);
                            i0Var.c0 = new sa(obVar);
                            obVar.showDialog(i0Var);
                            break;
                        }
                        break;
                    case 1:
                        ob obVar2 = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(obVar2.getParentActivity());
                        if (obVar2.s.megagroup) {
                            alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.N = string;
                        obVar2.showDialog(c2Var);
                        break;
                    default:
                        ob obVar3 = this.b;
                        if (obVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(obVar3.N.getSearchField());
                            obVar3.showDialog(org.telegram.ui.Components.c5.p(obVar3.getParentActivity(), new pa(obVar3, 0), null).a);
                            break;
                        }
                        break;
                }
            }
        };
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.a0 = frameLayout3;
        frameLayout3.setWillNotDraw(false);
        this.a0.setVisibility(4);
        this.a0.setFocusable(true);
        this.a0.setFocusableInTouchMode(true);
        this.a0.setClickable(true);
        this.a0.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
        this.X.addView(this.a0, i7.f6.e(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.b0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.b0.setImageResource(R.drawable.msg_calendar);
        this.b0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.xe, false), PorterDuff.Mode.MULTIPLY));
        this.a0.addView(this.b0, i7.f6.e(48, 48, 53));
        final int i17 = 2;
        this.b0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ua
            public final /* synthetic */ ob b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        ob obVar = this.b;
                        if (obVar.getParentActivity() != null) {
                            org.telegram.ui.Components.i0 i0Var = new org.telegram.ui.Components.i0(obVar, obVar.u0, obVar.w0, obVar.s.megagroup);
                            i0Var.S(obVar.t0);
                            i0Var.c0 = new sa(obVar);
                            obVar.showDialog(i0Var);
                            break;
                        }
                        break;
                    case 1:
                        ob obVar2 = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(obVar2.getParentActivity());
                        if (obVar2.s.megagroup) {
                            alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.N = string;
                        obVar2.showDialog(c2Var);
                        break;
                    default:
                        ob obVar3 = this.b;
                        if (obVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(obVar3.N.getSearchField());
                            obVar3.showDialog(org.telegram.ui.Components.c5.p(obVar3.getParentActivity(), new pa(obVar3, 0), null).a);
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.c0 = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ye, false));
        this.c0.setTextSize(15);
        this.c0.setTypeface(AndroidUtilities.bold());
        this.a0.addView(this.c0, i7.f6.d(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.E.D(true);
        if (this.r0 && this.n0.isEmpty()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.w, true, 0.3f, true);
            this.A.setEmptyView(null);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(this.w, false, 0.3f, true);
            this.A.setEmptyView(this.H);
        }
        db dbVar5 = this.A;
        dbVar5.U1 = true;
        dbVar5.V1 = 1;
        UndoView undoView = new UndoView(context);
        this.B = undoView;
        undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
        this.X.addView(this.B, i7.f6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        c1();
        return this.fragmentView;
    }

    public final void d1() {
        db dbVar = this.A;
        if (dbVar == null) {
            return;
        }
        int childCount = dbVar.getChildCount();
        int measuredHeight = this.A.getMeasuredHeight();
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        boolean z10 = false;
        int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        boolean z11 = false;
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = this.A.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                float y8 = (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY();
                int backgroundSizeY = this.X.getBackgroundSizeY();
                t1Var.f = y8;
                t1Var.h = backgroundSizeY;
            } else if (childAt instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                int top = s1Var.getTop();
                s1Var.getBottom();
                int i13 = top >= 0 ? 0 : -top;
                int measuredHeight2 = s1Var.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i13 + measuredHeight;
                }
                s1Var.b4(i13, measuredHeight2 - i13, (this.X.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - this.A.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY(), this.X.getMeasuredWidth(), this.X.getBackgroundSizeY(), 0, 0, 0);
                MessageObject messageObject = s1Var.getMessageObject();
                if (this.d0 != null && messageObject.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                    ImageReceiver photoImage = s1Var.getPhotoImage();
                    this.d0.setTranslationX(photoImage.getImageX());
                    this.d0.setTranslationY(photoImage.getImageY() + this.fragmentView.getPaddingTop() + top);
                    this.fragmentView.invalidate();
                    this.d0.invalidate();
                    z11 = true;
                }
            } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                v0Var.W((childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY(), this.X.getBackgroundSizeY());
                if (v0Var.I()) {
                    v0Var.invalidate();
                }
            }
            if (childAt.getBottom() > this.A.getPaddingTop()) {
                int bottom = childAt.getBottom();
                if (bottom < i10) {
                    if ((childAt instanceof org.telegram.ui.Cells.s1) || (childAt instanceof org.telegram.ui.Cells.v0)) {
                        view = childAt;
                    }
                    i10 = bottom;
                    view3 = childAt;
                }
                eb ebVar = this.C0;
                if ((ebVar == null || (!ebVar.a0(childAt) && !this.C0.Z(childAt))) && (childAt instanceof org.telegram.ui.Cells.v0) && ((org.telegram.ui.Cells.v0) childAt).getMessageObject().isDateObject) {
                    if (childAt.getAlpha() != 1.0f) {
                        childAt.setAlpha(1.0f);
                    }
                    if (bottom < i11) {
                        i11 = bottom;
                        view2 = childAt;
                    }
                }
            }
        }
        n0 n0Var = this.d0;
        if (n0Var != null) {
            if (z11) {
                MediaController.getInstance().setCurrentVideoVisible(true);
            } else {
                n0Var.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                this.fragmentView.invalidate();
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null && playingMessageObject.isRoundVideo() && this.V) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
            }
        }
        if (view != null) {
            this.M.T((view instanceof org.telegram.ui.Cells.s1 ? ((org.telegram.ui.Cells.s1) view).getMessageObject() : ((org.telegram.ui.Cells.v0) view).getMessageObject()).messageOwner.date, false, true);
        }
        this.P = false;
        if (!(view3 instanceof org.telegram.ui.Cells.s1) && !(view3 instanceof org.telegram.ui.Cells.v0)) {
            z10 = true;
        }
        this.Q = z10;
        if (view2 == null) {
            T0(true);
            this.M.setTranslationY(0.0f);
            return;
        }
        if (view2.getTop() > this.A.getPaddingTop() || this.Q) {
            if (view2.getAlpha() != 1.0f) {
                view2.setAlpha(1.0f);
            }
            T0(true ^ this.Q);
        } else {
            if (view2.getAlpha() != 0.0f) {
                view2.setAlpha(0.0f);
            }
            AnimatorSet animatorSet = this.R;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.R = null;
            }
            if (this.M.getTag() == null) {
                this.M.setTag(1);
            }
            if (this.M.getAlpha() != 1.0f) {
                this.M.setAlpha(1.0f);
            }
            this.P = true;
        }
        int bottom2 = view2.getBottom() - this.A.getPaddingTop();
        if (bottom2 <= this.M.getMeasuredHeight() || bottom2 >= this.M.getMeasuredHeight() * 2) {
            this.M.setTranslationY(0.0f);
        } else {
            this.M.setTranslationY(((-r1.getMeasuredHeight()) * 2) + bottom2);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        org.telegram.ui.Cells.s1 s1Var2;
        MessageObject messageObject2;
        org.telegram.ui.Cells.s1 s1Var3;
        MessageObject messageObject3;
        boolean z10;
        if (i10 == NotificationCenter.emojiLoaded) {
            db dbVar = this.A;
            if (dbVar != null) {
                dbVar.f1();
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.messagePlayingDidStart) {
            if (i10 == NotificationCenter.messagePlayingDidReset || i10 == NotificationCenter.messagePlayingPlayStateChanged) {
                db dbVar2 = this.A;
                if (dbVar2 != null) {
                    int childCount = dbVar2.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.A.getChildAt(i12);
                        if ((childAt instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) != null) {
                            if (messageObject.isVoice() || messageObject.isMusic()) {
                                s1Var.m4(false, true, false);
                            } else if (messageObject.isRoundVideo() && !MediaController.getInstance().isPlayingMessage(messageObject)) {
                                s1Var.e1(null, true);
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (i10 != NotificationCenter.messagePlayingProgressDidChanged) {
                if (i10 != NotificationCenter.didSetNewWallpapper || this.fragmentView == null) {
                    return;
                }
                this.X.V(org.telegram.ui.ActionBar.g6.r0());
                this.x.invalidate();
                eg.r rVar = this.L;
                if (rVar != null) {
                    rVar.invalidate();
                }
                this.A.f1();
                return;
            }
            Integer num = (Integer) objArr[0];
            db dbVar3 = this.A;
            if (dbVar3 != null) {
                int childCount2 = dbVar3.getChildCount();
                for (int i13 = 0; i13 < childCount2; i13++) {
                    View childAt2 = this.A.getChildAt(i13);
                    if ((childAt2 instanceof org.telegram.ui.Cells.s1) && (messageObject2 = (s1Var2 = (org.telegram.ui.Cells.s1) childAt2).getMessageObject()) != null && messageObject2.getId() == num.intValue()) {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject != null) {
                            messageObject2.audioProgress = playingMessageObject.audioProgress;
                            messageObject2.audioProgressSec = playingMessageObject.audioProgressSec;
                            messageObject2.audioPlayerDuration = playingMessageObject.audioPlayerDuration;
                            s1Var2.q4();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (((MessageObject) objArr[0]).isRoundVideo()) {
            MediaController.getInstance().setTextureView(Q0(true), this.e0, this.d0, true);
            int childCount3 = this.A.getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 >= childCount3) {
                    z10 = false;
                    break;
                }
                View childAt3 = this.A.getChildAt(i14);
                if (childAt3 instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) childAt3;
                    MessageObject messageObject4 = s1Var4.getMessageObject();
                    if (this.d0 != null && messageObject4.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject4)) {
                        ImageReceiver photoImage = s1Var4.getPhotoImage();
                        this.d0.setTranslationX(photoImage.getImageX());
                        this.d0.setTranslationY(photoImage.getImageY() + s1Var4.getTop() + this.fragmentView.getPaddingTop());
                        this.fragmentView.invalidate();
                        this.d0.invalidate();
                        z10 = true;
                        break;
                    }
                }
                i14++;
            }
            if (this.d0 != null) {
                MessageObject playingMessageObject2 = MediaController.getInstance().getPlayingMessageObject();
                if (z10) {
                    MediaController.getInstance().setCurrentVideoVisible(true);
                } else {
                    this.d0.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                    this.fragmentView.invalidate();
                    if (playingMessageObject2 != null && playingMessageObject2.isRoundVideo() && (this.V || PipRoundVideoView.B != null)) {
                        MediaController.getInstance().setCurrentVideoVisible(false);
                    }
                }
            }
        }
        db dbVar4 = this.A;
        if (dbVar4 != null) {
            int childCount4 = dbVar4.getChildCount();
            for (int i15 = 0; i15 < childCount4; i15++) {
                View childAt4 = this.A.getChildAt(i15);
                if ((childAt4 instanceof org.telegram.ui.Cells.s1) && (messageObject3 = (s1Var3 = (org.telegram.ui.Cells.s1) childAt4).getMessageObject()) != null) {
                    if (messageObject3.isVoice() || messageObject3.isMusic()) {
                        s1Var3.m4(false, true, false);
                    } else if (messageObject3.isRoundVideo()) {
                        s1Var3.e1(null, false);
                        if (!MediaController.getInstance().isPlayingMessage(messageObject3) && messageObject3.audioProgress != 0.0f) {
                            messageObject3.resetPlayingProgress();
                            s1Var3.invalidate();
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e1() {
        db dbVar = this.A;
        if (dbVar == null) {
            return;
        }
        int childCount = dbVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.A.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                MessageObject messageObject = s1Var.getMessageObject();
                if (messageObject != null) {
                    if (!this.actionBar.s()) {
                        s1Var.setDrawSelectionBackground(false);
                        s1Var.J3(false, true);
                        s1Var.L3(false, false, true);
                    }
                    s1Var.setHighlighted(this.G0 != Integer.MAX_VALUE && messageObject.getRealId() == this.G0);
                    if (this.G0 != Integer.MAX_VALUE) {
                        ra raVar = this.I0;
                        if (raVar != null) {
                            AndroidUtilities.cancelRunOnUIThread(raVar);
                        }
                        ra raVar2 = new ra(this, 0);
                        this.I0 = raVar2;
                        AndroidUtilities.runOnUIThread(raVar2, 1000L);
                    }
                    if (TextUtils.isEmpty(this.v0)) {
                        s1Var.S3(null);
                    } else {
                        s1Var.S3(this.v0);
                    }
                    s1Var.setSpoilersSuppressed(this.A.getScrollState() != 0);
                }
            } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                v0Var.setMessageObject(v0Var.getMessageObject());
                v0Var.setSpoilersSuppressed(this.A.getScrollState() != 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Nd));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 32768, null, null, null, null, i10));
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.v8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar2, 64, null, null, null, null, i11));
        org.telegram.ui.ActionBar.l lVar3 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.g6.t8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar3, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, TLObject.FLAG_31, null, null, null, null, org.telegram.ui.ActionBar.g6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, TLObject.FLAG_30, null, null, null, null, org.telegram.ui.ActionBar.g6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.g6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.I.getTitleTextView(), 4, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.I.getSubtitleTextView(), 4, (Class[]) null, new Paint[]{org.telegram.ui.ActionBar.g6.c2, org.telegram.ui.ActionBar.g6.d2}, org.telegram.ui.ActionBar.g6.B8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.g6.r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.i8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.j8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.k8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.l8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.m8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.n8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.o8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.m3, org.telegram.ui.ActionBar.g6.q3}, null, org.telegram.ui.ActionBar.g6.ra));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.n3, org.telegram.ui.ActionBar.g6.r3}, null, org.telegram.ui.ActionBar.g6.dc));
        Drawable[] k9 = org.telegram.ui.ActionBar.g6.m3.k();
        int i13 = org.telegram.ui.ActionBar.g6.ta;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, k9, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.g6.q3.k(), null, i13));
        Drawable[] k10 = org.telegram.ui.ActionBar.g6.o3.k();
        int i14 = org.telegram.ui.ActionBar.g6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, k10, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.g6.s3.k(), null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.o3, org.telegram.ui.ActionBar.g6.s3}, null, org.telegram.ui.ActionBar.g6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.o3, org.telegram.ui.ActionBar.g6.s3}, null, org.telegram.ui.ActionBar.g6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.o3, org.telegram.ui.ActionBar.g6.s3}, null, org.telegram.ui.ActionBar.g6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.o3, org.telegram.ui.ActionBar.g6.s3}, null, org.telegram.ui.ActionBar.g6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.p3, org.telegram.ui.ActionBar.g6.t3}, null, org.telegram.ui.ActionBar.g6.Ba));
        TextPaint textPaint = org.telegram.ui.ActionBar.g6.s2;
        int i15 = org.telegram.ui.ActionBar.g6.ic;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 4, new Class[]{org.telegram.ui.Cells.v0.class}, textPaint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 2, new Class[]{org.telegram.ui.Cells.v0.class}, org.telegram.ui.ActionBar.g6.s2, null, null, org.telegram.ui.ActionBar.g6.jc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.w4, org.telegram.ui.ActionBar.g6.q4, org.telegram.ui.ActionBar.g6.x4, org.telegram.ui.ActionBar.g6.v4, org.telegram.ui.ActionBar.g6.u4, org.telegram.ui.ActionBar.g6.C4}, null, org.telegram.ui.ActionBar.g6.kc));
        int i16 = org.telegram.ui.ActionBar.g6.lc;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class, org.telegram.ui.Cells.v0.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class, org.telegram.ui.Cells.v0.class}, null, null, null, org.telegram.ui.ActionBar.g6.mc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.fc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 2, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint[]) null, org.telegram.ui.ActionBar.g6.gc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 2, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint[]) null, org.telegram.ui.ActionBar.g6.hc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.y3}, null, org.telegram.ui.ActionBar.g6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.z3}, null, org.telegram.ui.ActionBar.g6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.A3, org.telegram.ui.ActionBar.g6.C3}, null, org.telegram.ui.ActionBar.g6.La));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.B3, org.telegram.ui.ActionBar.g6.D3}, null, org.telegram.ui.ActionBar.g6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.F3, org.telegram.ui.ActionBar.g6.G3}, null, org.telegram.ui.ActionBar.g6.sc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.O3, org.telegram.ui.ActionBar.g6.S3, org.telegram.ui.ActionBar.g6.W3}, null, org.telegram.ui.ActionBar.g6.Ra));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.P3, org.telegram.ui.ActionBar.g6.T3, org.telegram.ui.ActionBar.g6.X3}, null, org.telegram.ui.ActionBar.g6.Sa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.M3, org.telegram.ui.ActionBar.g6.Q3, org.telegram.ui.ActionBar.g6.U3}, null, org.telegram.ui.ActionBar.g6.xc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.N3, org.telegram.ui.ActionBar.g6.R3, org.telegram.ui.ActionBar.g6.V3}, null, org.telegram.ui.ActionBar.g6.yc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.a4, org.telegram.ui.ActionBar.g6.b4, org.telegram.ui.ActionBar.g6.Z3}, null, org.telegram.ui.ActionBar.g6.zc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.e4}, null, org.telegram.ui.ActionBar.g6.Ta));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f4}, null, org.telegram.ui.ActionBar.g6.Ua));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.c4}, null, org.telegram.ui.ActionBar.g6.Ac));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.d4}, null, org.telegram.ui.ActionBar.g6.Bc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.g4}, null, org.telegram.ui.ActionBar.g6.Cc));
        Drawable[] drawableArr = {org.telegram.ui.ActionBar.g6.i4};
        int i17 = org.telegram.ui.ActionBar.g6.Va;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, drawableArr, null, i17));
        Drawable[] drawableArr2 = {org.telegram.ui.ActionBar.g6.h4, org.telegram.ui.ActionBar.g6.B4, org.telegram.ui.ActionBar.g6.D4};
        int i18 = org.telegram.ui.ActionBar.g6.Dc;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, drawableArr2, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.g6.I4, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.g6.J4, null, org.telegram.ui.ActionBar.g6.Wa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.g6.G4, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.g6.H4, null, org.telegram.ui.ActionBar.g6.Ec));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.O4}, null, org.telegram.ui.ActionBar.g6.Ia));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.P4}, null, org.telegram.ui.ActionBar.g6.r7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.Q4}, null, org.telegram.ui.ActionBar.g6.qa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.g6.b2, null, null, org.telegram.ui.ActionBar.g6.Fc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.j4}, null, org.telegram.ui.ActionBar.g6.Gc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.g6.J2, null, null, org.telegram.ui.ActionBar.g6.Ic));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.g6.K2, null, null, org.telegram.ui.ActionBar.g6.Jc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Xa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.g6.T1, null, null, org.telegram.ui.ActionBar.g6.Lc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Mc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.g6.Q2, null, null, org.telegram.ui.ActionBar.g6.Nc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Oc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Ya));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Qc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Za));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Rc));
        int i19 = org.telegram.ui.ActionBar.g6.Uc;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.g6.ab;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.bb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Xc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.db));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Zc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.eb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.ad));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.fb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.bd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.cd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.gb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.dd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.hb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.ed));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.ib));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.fd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.jb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.hd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.id));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.qb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.jd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.rb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.kd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.nd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.sb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.od));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.nb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.pd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.lb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.rd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.tb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.sd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.ub));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.td));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.vb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.ud));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.wb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.wd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.yb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.xd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.vd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.zb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.xb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.yd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Ab));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.zd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Bb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Ad));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Cb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Bd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Db));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Cd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Eb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Dd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Fb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Ed));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Gb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Fd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Hb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Gd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Ib));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Hd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Jb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Kb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Jd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Lb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.g6.U1, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.g6.W1, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Pa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Qa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.ie));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.uc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.je));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.vc));
        Drawable[] drawableArr3 = org.telegram.ui.ActionBar.g6.T4;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 32, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr3[0]}, null, org.telegram.ui.ActionBar.g6.re));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr3[0]}, null, org.telegram.ui.ActionBar.g6.se));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 32, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr3[1]}, null, org.telegram.ui.ActionBar.g6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr3[1]}, null, org.telegram.ui.ActionBar.g6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.pe));
        Drawable[] drawableArr4 = org.telegram.ui.ActionBar.g6.S4;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr4[0]}, null, org.telegram.ui.ActionBar.g6.qe));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr4[1]}, null, org.telegram.ui.ActionBar.g6.Pb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.F, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.Ae));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.L, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.y, 2048, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 131072, new Class[]{org.telegram.ui.Cells.u1.class}, new String[]{"backgroundLayout"}, null, null, null, org.telegram.ui.ActionBar.g6.Fe));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 8, new Class[]{org.telegram.ui.Cells.u1.class}, new String[]{"imageView"}, null, null, null, org.telegram.ui.ActionBar.g6.De));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 4, new Class[]{org.telegram.ui.Cells.u1.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.g6.Ee));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.x, TLObject.FLAG_29, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.L, TLObject.FLAG_29, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.B, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.Fi));
        int i21 = org.telegram.ui.ActionBar.g6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.B, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.B, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, null, i21));
        int i22 = org.telegram.ui.ActionBar.g6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.B, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.B, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.B, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.B, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, null, i22));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.B;
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onConfigurationChanged(Configuration configuration) {
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        V0(true);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.s);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new ma(this, 0)), this.classGuid);
        setBulletinDelegate(new eg.x(8));
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        this.x0.unlock();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        lb lbVar = this.X;
        if (lbVar != null) {
            org.telegram.ui.Components.c81 c81Var = lbVar.v;
            if (c81Var != null) {
                c81Var.c(false);
            }
            lbVar.B = true;
        }
        UndoView undoView = this.B;
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.i0 = true;
        this.j0 = true;
        ab.m mVar = ab.m.e;
        if (mVar == null || !mVar.a) {
            return;
        }
        ab.m i10 = ab.m.i();
        if (i10.a) {
            s4 s4Var = (s4) i10.d;
            int i11 = c5.B;
            s4Var.b(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onRemoveFromParent() {
        MediaController.getInstance().setTextureView(this.f0, null, null, false);
        super.onRemoveFromParent();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        System.currentTimeMillis();
        lb lbVar = this.X;
        if (lbVar != null) {
            org.telegram.ui.Components.c81 c81Var = lbVar.v;
            if (c81Var != null) {
                c81Var.c(true);
            }
            lbVar.B = false;
        }
        this.i0 = false;
        O0(false);
        if (this.j0) {
            this.j0 = false;
            kb kbVar = this.E;
            if (kbVar != null) {
                kbVar.l();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.x0.unlock();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        if (z10) {
            this.x0.lock();
        }
    }
}
