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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pb extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public static int T0 = 10;
    public static final int[] U0 = {NotificationCenter.chatInfoDidLoad, NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.messagesDidLoad, NotificationCenter.botKeyboardDidLoad};
    public eb A;
    public boolean A0;
    public UndoView B;
    public final ab B0;
    public of.y C;
    public fb C0;
    public c2.y D;
    public final ArrayList D0;
    public lb E;
    public final a0.h E0;
    public TextView F;
    public ya F0;
    public rg.e G;
    public int G0;
    public FrameLayout H;
    public int H0;
    public org.telegram.ui.Components.tn I;
    public sa I0;
    public LinearLayout J;
    public org.telegram.ui.Cells.t1 J0;
    public ImageView K;
    public int K0;
    public bg.t L;
    public final ob L0;
    public org.telegram.ui.Cells.w0 M;
    public long M0;
    public org.telegram.ui.ActionBar.w0 N;
    public int N0;
    public long O;
    public int O0;
    public boolean P;
    public ff.f0 P0;
    public boolean Q;
    public final ArrayList Q0;
    public AnimatorSet R;
    public final ArrayList R0;
    public boolean S;
    public final RectF S0;
    public final int[] T;
    public boolean U;
    public boolean V;
    public rg.f W;
    public mb X;
    public MessageObject Y;
    public TLRPC.ChannelParticipant Z;
    public final ng.e a;
    public FrameLayout a0;
    public final ig.a b;
    public ImageView b0;
    public final ng.d c;
    public org.telegram.ui.ActionBar.h5 c0;
    public final ng.d d;
    public m0 d0;
    public final ig.a e;
    public c5.c e0;
    public final ig.a f;
    public TextureView f0;
    public int g0;
    public final xd.b h;
    public int h0;
    public boolean i0;
    public boolean j0;
    public final a0.h k0;
    public final a0.h l0;
    public final HashMap m0;
    public final ig.e n;
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

    public pb(TLRPC.Chat chat) {
        super(null);
        xd.b bVar = new xd.b(true);
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
        this.B0 = new ab(this);
        this.D0 = new ArrayList();
        this.E0 = new a0.h();
        this.G0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.H0 = -1;
        this.L0 = new ob(this);
        this.N0 = -1;
        this.Q0 = new ArrayList();
        this.R0 = new ArrayList();
        this.S0 = new RectF();
        ng.e eVar = new ng.e();
        this.a = eVar;
        ig.a aVar = new ig.a(eVar);
        this.b = aVar;
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.chatBlurEnabled()) {
            this.n = null;
            this.r = 0;
            this.c = null;
            this.d = null;
            this.e = new ig.a(eVar);
            this.f = new ig.a(eVar);
        } else {
            ig.e eVar2 = new ig.e(false);
            this.n = eVar2;
            ng.d dVar = new ng.d(eVar);
            this.d = dVar;
            dVar.v = new sa(this, 3);
            dVar.d = eVar2;
            dVar.e = -3;
            dVar.f = eVar;
            ig.a aVar2 = new ig.a(dVar);
            this.f = aVar2;
            aVar2.f = LiteMode.isEnabled(262144);
            if (LiteMode.isEnabled(262144)) {
                ng.d dVar2 = new ng.d(eVar);
                this.c = dVar2;
                dVar2.v = new sa(this, 3);
                dVar2.d = eVar2;
                dVar2.e = -2;
                dVar2.f = eVar;
                ig.a aVar3 = new ig.a(dVar2);
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

    public static void K0(pb pbVar) {
        if (pbVar.A == null || pbVar.n0.isEmpty()) {
            return;
        }
        pbVar.C.h1(pbVar.o0.size() - 1, (-100000) - pbVar.A.getPaddingTop());
    }

    public static g01 S0(CharSequence charSequence) {
        if (!(charSequence instanceof Spannable)) {
            return null;
        }
        for (org.telegram.ui.Components.eq eqVar : (org.telegram.ui.Components.eq[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.eq.class)) {
            if (eqVar != null) {
                Drawable drawable = eqVar.drawable;
                if (drawable instanceof g01) {
                    return (g01) drawable;
                }
            }
        }
        return null;
    }

    public static void T(pb pbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        MessageObject messageObject;
        a0.h hVar = pbVar.k0;
        int i9 = 0;
        pbVar.C0.N = false;
        pbVar.X0(false);
        MessagesController.getInstance(pbVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(pbVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = pbVar.n0;
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_channels_adminLogResults.events.size(); i10++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = tL_channels_adminLogResults.events.get(i10);
            if (hVar.h(tL_channelAdminLogEvent.id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                pbVar.O = Math.min(pbVar.O, tL_channelAdminLogEvent.id);
                MessageObject messageObject2 = new MessageObject(pbVar.currentAccount, tL_channelAdminLogEvent, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) pbVar.m0, pbVar.s, pbVar.T, false);
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
                pbVar.l0.k(messageObject3, messageObject3.getRealId());
            }
            if (messageObject3 != null && (message = messageObject3.messageOwner) != null && (messageReplyHeader = message.reply_to) != null) {
                if (messageReplyHeader.reply_to_peer_id == null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            messageObject = null;
                            break;
                        }
                        if (size != i11) {
                            messageObject = (MessageObject) arrayList.get(i11);
                            if (messageObject.contentType != 1 && messageObject.getRealId() == messageReplyHeader.reply_to_msg_id) {
                                break;
                            }
                        }
                        i11++;
                    }
                    if (messageObject != null) {
                        messageObject3.replyMessageObject = messageObject;
                    }
                }
                arrayList2.add(messageObject3);
            }
        }
        if (!arrayList2.isEmpty()) {
            MediaDataController.getInstance(pbVar.currentAccount).loadReplyMessagesForMessages(arrayList2, -pbVar.s.id, 0, 0L, new sa(pbVar, 1), pbVar.getClassGuid(), null);
        }
        pbVar.R0();
        pbVar.r0 = false;
        if (!z10) {
            pbVar.q0 = true;
        }
        AndroidUtilities.updateViewVisibilityAnimated(pbVar.w, false, 0.3f, true);
        pbVar.A.setEmptyView(pbVar.H);
        lb lbVar = pbVar.E;
        if (lbVar != null) {
            lbVar.l();
        }
        org.telegram.ui.ActionBar.w0 w0Var = pbVar.N;
        if (w0Var != null) {
            if (pbVar.o0.isEmpty() && TextUtils.isEmpty(pbVar.v0)) {
                i9 = 8;
            }
            w0Var.setVisibility(i9);
        }
    }

    public static void U(pb pbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        ArrayList arrayList4 = arrayList;
        if (arrayList4.isEmpty() || pbVar.getParentActivity() == null) {
            return;
        }
        int i9 = 0;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, pbVar.getParentActivity(), pbVar.getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
        Rect rect = new Rect();
        pbVar.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate().getPadding(rect);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(pbVar.getThemedColor(org.telegram.ui.ActionBar.f6.G8));
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            if (arrayList4.get(i10) == null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.l1(pbVar.getParentActivity(), pbVar.getResourceProvider()), g7.e6.n(-1, 8));
            } else {
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, pbVar.getParentActivity(), pbVar.getResourceProvider(), i10 == 0, i10 == size + (-1));
                g1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                g1Var.g((CharSequence) arrayList2.get(i10), ((Integer) arrayList3.get(i10)).intValue(), null);
                if (((Integer) arrayList4.get(i10)).intValue() == 35) {
                    g1Var.c(pbVar.getThemedColor(org.telegram.ui.ActionBar.f6.q7), pbVar.getThemedColor(org.telegram.ui.ActionBar.f6.p7));
                }
                Integer num = (Integer) arrayList4.get(i10);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                g1Var.setOnClickListener(new ih.p5(pbVar, i10, arrayList4, num, 1));
            }
            i10++;
            arrayList4 = arrayList;
        }
        xa xaVar = new xa(0, pbVar.X.getContext(), pbVar);
        xaVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, g7.e6.u(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
        xaVar.setPopupWindowLayout(actionBarPopupWindow$ActionBarPopupWindowLayout);
        ya yaVar = new ya(pbVar, xaVar);
        pbVar.F0 = yaVar;
        yaVar.e = true;
        yaVar.c = 220;
        yaVar.setOutsideTouchable(true);
        pbVar.F0.setClippingEnabled(true);
        pbVar.F0.setAnimationStyle(R.style.PopupContextAnimation);
        pbVar.F0.setFocusable(true);
        xaVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        pbVar.F0.setInputMethodMode(2);
        pbVar.F0.setSoftInputMode(48);
        pbVar.F0.getContentView().setFocusableInTouchMode(true);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        int left = (((view.getLeft() + ((int) f10)) - xaVar.getMeasuredWidth()) + rect.left) - AndroidUtilities.dp(28.0f);
        if (left < AndroidUtilities.dp(6.0f)) {
            left = AndroidUtilities.dp(6.0f);
        } else if (left > (pbVar.A.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - xaVar.getMeasuredWidth()) {
            left = (pbVar.A.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - xaVar.getMeasuredWidth();
        }
        if (AndroidUtilities.isTablet()) {
            int[] iArr = new int[2];
            pbVar.fragmentView.getLocationInWindow(iArr);
            left += iArr[0];
        }
        int height = pbVar.X.getHeight();
        int dp = AndroidUtilities.dp(48.0f) + xaVar.getMeasuredHeight();
        int R = pbVar.X.R();
        if (R > AndroidUtilities.dp(20.0f)) {
            height += R;
        }
        if (dp < height) {
            int y10 = (int) (pbVar.A.getY() + view.getTop() + f11);
            i9 = (dp - rect.top) - rect.bottom > AndroidUtilities.dp(240.0f) ? (AndroidUtilities.dp(240.0f) - dp) + y10 : y10;
            if (i9 < pbVar.A.getY() + AndroidUtilities.dp(24.0f)) {
                i9 = (int) (pbVar.A.getY() + AndroidUtilities.dp(24.0f));
            } else {
                int i11 = height - dp;
                if (i9 > i11 - AndroidUtilities.dp(8.0f)) {
                    i9 = i11 - AndroidUtilities.dp(8.0f);
                }
            }
        } else if (!pbVar.inBubbleMode) {
            i9 = AndroidUtilities.statusBarHeight;
        }
        xaVar.setMaxHeight(height - i9);
        pbVar.F0.showAtLocation(pbVar.A, 51, left, i9);
        pbVar.F0.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x036a, code lost:
    
        if (r0.exists() != false) goto L129;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void V(pb pbVar, int i9, ArrayList arrayList, Integer num) {
        TLRPC.Chat chat;
        File file;
        TLRPC.User user;
        if (pbVar.Y == null || i9 >= arrayList.size()) {
            return;
        }
        int intValue = num.intValue();
        TLRPC.Chat chat2 = pbVar.s;
        ya yaVar = pbVar.F0;
        if (yaVar != null) {
            yaVar.dismiss();
        }
        MessageObject messageObject = pbVar.Y;
        if (messageObject == null) {
            return;
        }
        if (intValue == 3) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            long fromChatId = messageObject.getFromChatId();
            if (0 != fromChatId) {
                if (fromChatId > 0) {
                    TLRPC.User user2 = MessagesController.getInstance(pbVar.currentAccount).getUser(Long.valueOf(fromChatId));
                    if (user2 != null) {
                        spannableStringBuilder.append((CharSequence) ContactsController.formatName(user2.first_name, user2.last_name)).append((CharSequence) ":\n");
                    }
                } else if (fromChatId < 0 && (chat = MessagesController.getInstance(pbVar.currentAccount).getChat(Long.valueOf(-fromChatId))) != null) {
                    spannableStringBuilder.append((CharSequence) chat.title).append((CharSequence) ":\n");
                }
            }
            if (TextUtils.isEmpty(messageObject.messageText)) {
                spannableStringBuilder.append((CharSequence) messageObject.messageOwner.message);
            } else {
                spannableStringBuilder.append(messageObject.messageText);
            }
            AndroidUtilities.addToClipboard(spannableStringBuilder);
            org.telegram.messenger.ll.o(R.string.MessageCopied, org.telegram.ui.Components.oc.a0(pbVar));
        } else if (intValue == 4) {
            String str = messageObject.messageOwner.attachPath;
            if (str != null && str.length() > 0 && !e2.c.w(str)) {
                str = null;
            }
            if (str == null || str.length() == 0) {
                str = pbVar.getFileLoader().getPathToMessage(pbVar.Y.messageOwner).toString();
            }
            int i10 = pbVar.Y.type;
            if (i10 == 3 || i10 == 1) {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 23 && ((i11 <= 28 || BuildVars.NO_SCOPED_STORAGE) && pbVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                    pbVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                    pbVar.Y = null;
                    pbVar.Z = null;
                    return;
                }
                MediaController.saveFile(str, pbVar.getParentActivity(), pbVar.Y.type == 3 ? 1 : 0, null, null);
            }
        } else if (intValue == 5) {
            String str2 = messageObject.messageOwner.attachPath;
            if (str2 != null && str2.length() != 0) {
                file = new File(pbVar.Y.messageOwner.attachPath);
            }
            file = null;
            if (file == null) {
                File pathToMessage = pbVar.getFileLoader().getPathToMessage(pbVar.Y.messageOwner);
                if (pathToMessage.exists()) {
                    file = pathToMessage;
                }
            }
            if (file != null) {
                if (file.getName().toLowerCase().endsWith("attheme")) {
                    of.y yVar = pbVar.C;
                    if (yVar != null) {
                        if (yVar.N0() < pbVar.C.B() - 1) {
                            int L0 = pbVar.C.L0();
                            pbVar.g0 = L0;
                            org.telegram.ui.Components.ik0 ik0Var = (org.telegram.ui.Components.ik0) pbVar.A.K(L0);
                            if (ik0Var != null) {
                                pbVar.h0 = ik0Var.a.getTop();
                            } else {
                                pbVar.g0 = -1;
                            }
                        } else {
                            pbVar.g0 = -1;
                        }
                    }
                    org.telegram.ui.ActionBar.e6 u10 = org.telegram.ui.ActionBar.f6.u(file, pbVar.Y.getDocumentName(), null, true);
                    if (u10 != null) {
                        pbVar.presentFragment(new oc1(u10));
                    } else {
                        pbVar.g0 = -1;
                        if (pbVar.getParentActivity() == null) {
                            pbVar.Y = null;
                            pbVar.Z = null;
                            return;
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pbVar.getParentActivity());
                            alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
                            alertDialog$Builder.a.P = LocaleController.getString(R.string.IncorrectTheme);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                            pbVar.showDialog(alertDialog$Builder.a);
                        }
                    }
                } else if (LocaleController.getInstance().applyLanguageFile(file, pbVar.currentAccount)) {
                    pbVar.presentFragment(new LanguageSelectActivity());
                } else if (pbVar.getParentActivity() == null) {
                    pbVar.Y = null;
                    pbVar.Z = null;
                    return;
                } else {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(pbVar.getParentActivity());
                    alertDialog$Builder2.a.N = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder2.a.P = LocaleController.getString(R.string.IncorrectLocalization);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                    pbVar.showDialog(alertDialog$Builder2.a);
                }
            }
        } else if (intValue == 6) {
            String str3 = messageObject.messageOwner.attachPath;
            if (str3 != null && str3.length() > 0 && !e2.c.w(str3)) {
                str3 = null;
            }
            if (str3 == null || str3.length() == 0) {
                str3 = pbVar.getFileLoader().getPathToMessage(pbVar.Y.messageOwner).toString();
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(pbVar.Y.getDocument().mime_type);
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    intent.putExtra("android.intent.extra.STREAM", FileProvider.d(pbVar.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", new File(str3)));
                    intent.setFlags(1);
                } catch (Exception unused) {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(str3)));
                }
            } else {
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(str3)));
            }
            try {
                pbVar.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.ShareFile)), 500);
            } catch (Exception unused2) {
            }
        } else if (intValue != 7) {
            switch (intValue) {
                case 9:
                    pbVar.showDialog(new org.telegram.ui.Components.cx0(pbVar.getParentActivity(), pbVar, pbVar.Y.getInputStickerSet(), null, null, null));
                    break;
                case 10:
                    int i12 = Build.VERSION.SDK_INT;
                    if (i12 >= 23 && ((i12 <= 28 || BuildVars.NO_SCOPED_STORAGE) && pbVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                        pbVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                        pbVar.Y = null;
                        pbVar.Z = null;
                        return;
                    }
                    String documentFileName = FileLoader.getDocumentFileName(pbVar.Y.getDocument());
                    if (TextUtils.isEmpty(documentFileName)) {
                        documentFileName = pbVar.Y.getFileName();
                    }
                    String str4 = pbVar.Y.messageOwner.attachPath;
                    if (str4 != null && str4.length() > 0 && !e2.c.w(str4)) {
                        str4 = null;
                    }
                    if (str4 == null || str4.length() == 0) {
                        str4 = pbVar.getFileLoader().getPathToMessage(pbVar.Y.messageOwner).toString();
                    }
                    MediaController.saveFile(str4, pbVar.getParentActivity(), pbVar.Y.isMusic() ? 3 : 2, documentFileName, pbVar.Y.getDocument() != null ? pbVar.Y.getDocument().mime_type : "");
                    break;
                case 11:
                    MessagesController.getInstance(pbVar.currentAccount).saveGif(pbVar.Y, messageObject.getDocument());
                    break;
                default:
                    switch (intValue) {
                        case 15:
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", pbVar.Y.messageOwner.media.user_id);
                            bundle.putString("phone", pbVar.Y.messageOwner.media.phone_number);
                            bundle.putBoolean("addContact", true);
                            pbVar.presentFragment(new is(bundle));
                            break;
                        case 16:
                            AndroidUtilities.addToClipboard(messageObject.messageOwner.media.phone_number);
                            org.telegram.messenger.ll.o(R.string.PhoneCopied, org.telegram.ui.Components.oc.a0(pbVar));
                            break;
                        case 17:
                            try {
                                Intent intent2 = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + pbVar.Y.messageOwner.media.phone_number));
                                intent2.addFlags(TLObject.FLAG_28);
                                pbVar.getParentActivity().startActivityForResult(intent2, 500);
                                break;
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                break;
                            }
                        default:
                            switch (intValue) {
                                case 33:
                                    if (pbVar.Z != null) {
                                        TLRPC.User user3 = pbVar.getMessagesController().getUser(Long.valueOf(DialogObject.getPeerDialogId(pbVar.Z.peer)));
                                        TLRPC.ChannelParticipant channelParticipant = pbVar.Z;
                                        if (channelParticipant.banned_rights == null) {
                                            channelParticipant.banned_rights = new TLRPC.TL_chatBannedRights();
                                        }
                                        TLRPC.TL_chatBannedRights tL_chatBannedRights = pbVar.Z.banned_rights;
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
                                        pbVar.getMessagesController().setParticipantBannedRole(chat2.id, user3, null, pbVar.Z.banned_rights, true, pbVar.getFragmentForAlert(1), new org.telegram.messenger.voip.l0(22, pbVar, user3));
                                        break;
                                    }
                                    break;
                                case 34:
                                    TLRPC.TL_channels_reportAntiSpamFalsePositive tL_channels_reportAntiSpamFalsePositive = new TLRPC.TL_channels_reportAntiSpamFalsePositive();
                                    tL_channels_reportAntiSpamFalsePositive.channel = pbVar.getMessagesController().getInputChannel(chat2.id);
                                    tL_channels_reportAntiSpamFalsePositive.msg_id = pbVar.Y.getRealId();
                                    pbVar.getConnectionsManager().sendRequest(tL_channels_reportAntiSpamFalsePositive, new na(pbVar, 3));
                                    break;
                                case 35:
                                    pbVar.getMessagesController().deleteParticipantFromChat(chat2.id, pbVar.getMessagesController().getInputPeer(pbVar.Y.messageOwner.from_id), false, false, (Runnable) new sa(pbVar, 2));
                                    if ((pbVar.Y.messageOwner.from_id instanceof TLRPC.TL_peerUser) && org.telegram.ui.Components.oc.a(pbVar) && (user = pbVar.getMessagesController().getUser(Long.valueOf(pbVar.Y.messageOwner.from_id.user_id))) != null) {
                                        org.telegram.ui.Components.oc.D(pbVar, user, chat2.title).j();
                                        break;
                                    }
                                    break;
                            }
                    }
            }
        } else {
            String str5 = messageObject.messageOwner.attachPath;
            if (str5 != null && str5.length() > 0 && !e2.c.w(str5)) {
                str5 = null;
            }
            if (str5 == null || str5.length() == 0) {
                str5 = pbVar.getFileLoader().getPathToMessage(pbVar.Y.messageOwner).toString();
            }
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 23 && ((i13 <= 28 || BuildVars.NO_SCOPED_STORAGE) && pbVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                pbVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                pbVar.Y = null;
                pbVar.Z = null;
                return;
            }
            MediaController.saveFile(str5, pbVar.getParentActivity(), 0, null, null);
        }
        pbVar.Y = null;
        pbVar.Z = null;
    }

    public static void W(pb pbVar, int i9) {
        int i10;
        RectF rectF;
        ng.d dVar = pbVar.c;
        ng.d dVar2 = pbVar.d;
        ArrayList arrayList = pbVar.R0;
        ig.e eVar = pbVar.n;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 31 || eVar == null) {
            return;
        }
        if (g7.z7.a(i9, 2)) {
            ArrayList arrayList2 = pbVar.Q0;
            if (i11 >= 29) {
                if (dVar2 != null) {
                    if (arrayList2.isEmpty()) {
                        rectF = new RectF();
                        arrayList2.add(rectF);
                    } else {
                        rectF = (RectF) arrayList2.get(0);
                    }
                    rectF.set(0.0f, 0.0f, pbVar.X.getMeasuredWidth(), pbVar.A.getY() + pbVar.A.getPaddingTop());
                    rectF.inset(0.0f, -AndroidUtilities.dp(45.0f));
                    i10 = dVar2.c(arrayList2, 1, AndroidUtilities.dp(48.0f)) + 1;
                } else {
                    i10 = 0;
                }
                if (dVar != null) {
                    i10 += dVar.c(arrayList2, i10, AndroidUtilities.dp(8.0f));
                }
            } else {
                i10 = 0;
            }
            int a2 = ff.m0.a(arrayList2, i10, arrayList);
            int measuredWidth = pbVar.X.getMeasuredWidth();
            for (int i12 = 0; i12 < a2; i12++) {
                RectF rectF2 = (RectF) arrayList.get(i12);
                float f10 = measuredWidth;
                rectF2.left = g7.n.a(rectF2.left, 0.0f, f10);
                rectF2.top = Math.max(pbVar.A.getY(), rectF2.top);
                rectF2.right = g7.n.a(rectF2.right, 0.0f, f10);
                rectF2.bottom = Math.min(pbVar.A.getY() + pbVar.A.getMeasuredHeight(), rectF2.bottom);
            }
            eVar.g(a2, arrayList);
        }
        mb mbVar = pbVar.X;
        Objects.requireNonNull(mbVar);
        if (eVar.e(new ra(mbVar, 0), pbVar.X.getWidth(), pbVar.X.getHeight())) {
            if (dVar != null) {
                dVar.d();
            }
            if (dVar2 != null) {
                dVar2.d();
            }
            org.telegram.ui.ActionBar.k kVar = pbVar.actionBar;
            if (kVar != null) {
                kVar.invalidate();
            }
            pbVar.X.invalidate();
            Iterator it = pbVar.h.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public static void X(pb pbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        a0.h hVar = pbVar.k0;
        pbVar.s0 = false;
        pbVar.C0.N = false;
        pbVar.X0(false);
        MessagesController.getInstance(pbVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(pbVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        boolean z10 = false;
        for (int i9 = 0; i9 < tL_channels_adminLogResults.events.size(); i9++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i9);
            if (hVar.h(tL_channelAdminLogEvent2.id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                pbVar.O = Math.min(pbVar.O, tL_channelAdminLogEvent2.id);
                MessageObject messageObject = new MessageObject(pbVar.currentAccount, tL_channelAdminLogEvent2, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) hashMap, pbVar.s, pbVar.T, false);
                if (messageObject.contentType >= 0 && (((tL_channelAdminLogEvent = messageObject.currentEvent) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !hVar.d(tL_channelAdminLogEvent2.id))) {
                    pbVar.n0.add(0, messageObject);
                    hVar.k(messageObject, tL_channelAdminLogEvent2.id);
                    z10 = true;
                }
            }
        }
        if (pbVar.E == null || !z10) {
            return;
        }
        pbVar.R0();
        pbVar.E.l();
    }

    public static void Y(pb pbVar, TLRPC.TL_error tL_error, TLObject tLObject) {
        TLRPC.ChatFull chatFull;
        TLRPC.Chat chat = pbVar.s;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            pbVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
            pbVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
            pbVar.t0 = tL_channels_channelParticipants.participants;
            if (chat != null && (chatFull = pbVar.getMessagesController().getChatFull(chat.id)) != null && chatFull.antispam) {
                za zaVar = new za();
                zaVar.user_id = pbVar.getMessagesController().telegramAntispamUserId;
                zaVar.peer = pbVar.getMessagesController().getPeer(zaVar.user_id);
                long j10 = pbVar.getMessagesController().telegramAntispamUserId;
                if (pbVar.getMessagesController().getUser(Long.valueOf(j10)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j10;
                    tL_users_getUsers.id.add(tL_inputUser);
                    ConnectionsManager.getInstance(pbVar.currentAccount).sendRequest(tL_users_getUsers, new na(pbVar, 2));
                }
                pbVar.t0.add(0, zaVar);
            }
            Dialog dialog = pbVar.visibleDialog;
            if (dialog instanceof org.telegram.ui.Components.g0) {
                ((org.telegram.ui.Components.g0) dialog).R(pbVar.t0);
            }
        }
    }

    public static void a1(MessageObject messageObject, int i9) {
        if (messageObject == null) {
            return;
        }
        if (i9 <= 0) {
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
            tL_keyboardInlineButton.text = LocaleController.formatPluralString("EventLogExpandMore", i9, new Object[0]);
            tL_keyboardInlineButtonRow.buttons.add(tL_keyboardInlineButton);
        }
        messageObject.measureInlineBotButtons();
    }

    public static CharSequence b1(SpannableStringBuilder spannableStringBuilder) {
        int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(spannableStringBuilder, "\n\n");
        if (charSequenceIndexOf >= 0 && Build.VERSION.SDK_INT >= 29) {
            if (!e2.c.v(spannableStringBuilder)) {
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
    public static void o0(pb pbVar, Bundle bundle, long j10) {
        TLRPC.Chat chat = pbVar.s;
        if (!chat.megagroup || pbVar.t0 == null || !ChatObject.canBlockUsers(chat)) {
            return;
        }
        int i9 = 0;
        while (true) {
            if (i9 >= pbVar.t0.size()) {
                break;
            }
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) pbVar.t0.get(i9);
            if (MessageObject.getPeerId(channelParticipant.peer) != j10) {
                i9++;
            } else if (!channelParticipant.can_edit) {
                return;
            }
        }
    }

    public static void u0(pb pbVar, MessageObject messageObject) {
        if (pbVar.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pbVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = string;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (messageObject.type == 3) {
            c2Var.P = LocaleController.getString(R.string.NoPlayerInstalled);
        } else {
            c2Var.P = LocaleController.formatString(R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type);
        }
        pbVar.showDialog(c2Var);
    }

    public static void z0(pb pbVar, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, HashMap hashMap) {
        MessagesController messagesController = pbVar.getMessagesController();
        TLRPC.Chat chat = pbVar.s;
        TLRPC.ChatFull chatFull = messagesController.getChatFull(chat.id);
        org.telegram.ui.Components.a60 a60Var = new org.telegram.ui.Components.a60(pbVar.X.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, chatFull, hashMap, pbVar, chatFull.id, false, ChatObject.isChannel(chat));
        a60Var.f0 = new bb(pbVar);
        a60Var.show();
    }

    public final MessageObject N0(long j10, long j11, ArrayList arrayList, boolean z10, boolean z11) {
        int i9;
        MessageObject messageObject;
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.o0;
            i9 = 1;
            if (i10 >= arrayList2.size()) {
                messageObject = null;
                break;
            }
            messageObject = (MessageObject) arrayList2.get(i10);
            if (messageObject != null && messageObject.contentType == 1 && messageObject.actionDeleteGroupEventId == j10) {
                break;
            }
            i10++;
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
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MessageObject.replaceWithLink(LocaleController.formatPluralString(z11 ? "EventLogDeletedMultipleMessagesToExpand" : "EventLogDeletedMultipleMessages", arrayList.size(), TextUtils.join(", ", Collection.-EL.stream(arrayList).map(new k8(i9)).distinct().map(new Function() { // from class: org.telegram.ui.ua
            public /* synthetic */ Function andThen(Function function) {
                return Function$-CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Long l10 = (Long) obj;
                pb pbVar = pb.this;
                pbVar.getClass();
                if (l10.longValue() >= 0) {
                    return UserObject.getForcedFirstName(pbVar.getMessagesController().getUser(l10));
                }
                TLRPC.Chat chat = pbVar.getMessagesController().getChat(Long.valueOf(-l10.longValue()));
                if (chat == null) {
                    return null;
                }
                return chat.title;
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$-CC.$default$compose(this, function);
            }
        }).filter(new fh.i1(i9)).limit(4L).toArray())), "un1", user));
        if (z11 && arrayList.size() > 1) {
            g01 S0 = S0(messageObject.messageText);
            if (S0 == null) {
                S0 = new g01(LocaleController.getString(z10 ? R.string.EventLogDeletedMultipleMessagesHide : R.string.EventLogDeletedMultipleMessagesShow));
                Typeface bold = AndroidUtilities.bold();
                org.telegram.ui.Components.i6 i6Var = S0.a;
                i6Var.u(bold);
                i6Var.t(AndroidUtilities.dp(10.0f));
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
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.eq(0, S0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        messageObject.messageText = spannableStringBuilder;
        MessageObject messageObject2 = arrayList.size() > 0 ? (MessageObject) j3.r0.j(1, arrayList) : null;
        if (messageObject2 != null) {
            long j12 = messageObject2.eventId;
            a0.h hVar = this.E0;
            if (!hVar.d(j12)) {
                long j13 = messageObject2.eventId;
                int i11 = T0;
                T0 = i11 + 1;
                hVar.k(Integer.valueOf(i11), j13);
            }
            messageObject.stableId = ((Integer) hVar.f(messageObject2.eventId)).intValue();
        }
        return messageObject;
    }

    public final void O0(boolean z10) {
        of.y yVar = this.C;
        if (yVar == null || this.i0) {
            return;
        }
        int L0 = yVar.L0();
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
    
        if ((r23 instanceof org.telegram.ui.Cells.w0) == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01e7, code lost:
    
        r0 = new android.text.SpannableString(">");
        r2 = getParentActivity().getResources().getDrawable(org.telegram.messenger.R.drawable.attach_arrow_right).mutate();
        r2.setColorFilter(new android.graphics.PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.Gi), android.graphics.PorterDuff.Mode.MULTIPLY));
        r2.setBounds(0, 0, org.telegram.messenger.AndroidUtilities.dp(10.0f), org.telegram.messenger.AndroidUtilities.dp(10.0f));
        r0.setSpan(new android.text.style.ImageSpan(r2, 2), 0, r0.length(), 33);
        r2 = new android.text.SpannableStringBuilder();
        r2.append((java.lang.CharSequence) org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.EventLogFilterGroupInfo)).append((java.lang.CharSequence) "\u2009").append((java.lang.CharSequence) r0).append((java.lang.CharSequence) "\u2009").append((java.lang.CharSequence) org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.ChannelAdministrators));
        r2.setSpan(new kh.lb(r22, 2), 0, r2.length(), 33);
        r0 = org.telegram.ui.Components.oc.a0(r22).M(org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.ChannelAntiSpamUser), org.telegram.messenger.AndroidUtilities.replaceCharSequence("%s", org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.ChannelAntiSpamInfo2), r2), org.telegram.messenger.R.raw.msg_antispam);
        r0.j = 5000;
        r0.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0284, code lost:
    
        return r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0285, code lost:
    
        r0.add(org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.ReportFalsePositive));
        org.telegram.ui.Cells.j2.j(org.telegram.messenger.R.drawable.msg_notspam, 34, r9, r6);
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
    public final boolean P0(View view, float f10, float f11) {
        Integer num;
        String str;
        boolean z10;
        Integer num2;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        boolean z11;
        ArrayList arrayList;
        oa oaVar;
        ArrayList arrayList2;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction;
        TLRPC.Message message;
        TLRPC.User user;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2;
        char c10 = '\n';
        MessageObject messageObject = view instanceof org.telegram.ui.Cells.t1 ? ((org.telegram.ui.Cells.t1) view).getMessageObject() : view instanceof org.telegram.ui.Cells.w0 ? ((org.telegram.ui.Cells.w0) view).getMessageObject() : null;
        if (messageObject != null) {
            int i9 = messageObject.type;
            if (i9 == 6) {
                num = 10;
            } else {
                if (i9 == 10 || i9 == 11 || i9 == 16) {
                    num = 10;
                    if (messageObject.getId() != 0) {
                        c10 = 1;
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
                                c10 = 2;
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
                                        c10 = 5;
                                    } else if (str.endsWith("/png") || str.endsWith("/jpg") || str.endsWith("/jpeg")) {
                                        num = 10;
                                        c10 = 6;
                                    }
                                }
                                num = 10;
                                c10 = 4;
                            }
                        } else if (messageObject.type == 12) {
                            num = 10;
                            c10 = '\b';
                        } else if (messageObject.isMediaEmpty()) {
                            num = 10;
                            c10 = 3;
                        }
                    }
                    num = 10;
                    c10 = 2;
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
                                org.telegram.ui.Components.a60 a60Var = new org.telegram.ui.Components.a60(getParentActivity(), tL_channelAdminLogEventActionParticipantJoinByInvite.invite, getMessagesController().getChatFull(chat3.id), null, this, chat3.id, false, ChatObject.isChannelAndNotMegaGroup(chat3));
                                a60Var.g0 = false;
                                a60Var.show();
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
                        org.telegram.ui.Cells.j2.j(R.drawable.msg_copy, 3, arrayList5, arrayList4);
                    }
                    if (c10 == 1) {
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
                                    showDialog(new org.telegram.ui.Components.cx0(getParentActivity(), this, inputStickerSet3, null, null, null));
                                    return true;
                                }
                                arrayList = arrayList3;
                                chat2 = chat;
                                z11 = false;
                                arrayList2 = arrayList;
                                oaVar = new oa(this, arrayList4, arrayList2, arrayList5, view, f10, f11);
                                if (ChatObject.canBlockUsers(chat2) && (tL_channelAdminLogEvent = messageObject.currentEvent) != null) {
                                    channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                                    if ((!(channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionEditMessage) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoin) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByRequest)) && (message = messageObject.messageOwner) != null && message.from_id != null && (user = getMessagesController().getUser(Long.valueOf(this.Y.messageOwner.from_id.user_id))) != null && !UserObject.isUserSelf(user)) {
                                        MessagesController messagesController = getMessagesController();
                                        Utilities.Callback<TLRPC.ChannelParticipant> i2Var = new gh.i2(this, arrayList2, arrayList5, arrayList4, oaVar, 1);
                                        oaVar = oaVar;
                                        messagesController.getChannelParticipant(chat2, user, i2Var);
                                        z11 = true;
                                    }
                                }
                                if (!z11) {
                                    return true;
                                }
                                oaVar.run();
                                return true;
                            }
                        }
                        if (tL_channelAdminLogEvent4 == null || !(tL_channelAdminLogEvent4.action instanceof TLRPC.TL_channelAdminLogEventActionChangeEmojiStickerSet)) {
                            chat2 = chat;
                            z11 = false;
                            if (tL_channelAdminLogEvent4 != null && (tL_channelAdminLogEvent4.action instanceof TLRPC.TL_channelAdminLogEventActionChangeHistoryTTL) && ChatObject.canUserDoAdminAction(chat2, 13)) {
                                org.telegram.ui.Components.sp spVar = new org.telegram.ui.Components.sp(getParentActivity(), chat2);
                                spVar.v = new wa(this);
                                showDialog(spVar);
                            }
                        } else {
                            chat2 = chat;
                            z11 = false;
                            z60 z60Var = new z60(chat2.id, 0);
                            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(chat2.id);
                            if (chatFull != null) {
                                z60Var.d0(chatFull);
                                presentFragment(z60Var);
                            }
                        }
                    } else {
                        chat2 = chat;
                        z11 = false;
                        if (c10 == 3) {
                            TLRPC.MessageMedia messageMedia = this.Y.messageOwner.media;
                            if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.isNewGifDocument(messageMedia.webpage.document)) {
                                arrayList3.add(LocaleController.getString(R.string.SaveToGIFs));
                                org.telegram.ui.Cells.j2.m(R.drawable.msg_gif, arrayList5, arrayList4, 11);
                            }
                        } else if (c10 != 4) {
                            Integer num3 = num;
                            if (c10 == 5) {
                                arrayList3.add(LocaleController.getString(R.string.ApplyLocalizationFile));
                                org.telegram.ui.Cells.j2.m(R.drawable.msg_language, arrayList5, arrayList4, 5);
                                arrayList3.add(LocaleController.getString(R.string.SaveToDownloads));
                                org.telegram.ui.Cells.j2.m(R.drawable.msg_download, arrayList5, arrayList4, num3);
                                arrayList3.add(LocaleController.getString(R.string.ShareFile));
                                org.telegram.ui.Cells.j2.m(R.drawable.msg_share, arrayList5, arrayList4, 6);
                            } else if (c10 == '\n') {
                                arrayList3.add(LocaleController.getString(R.string.ApplyThemeFile));
                                org.telegram.ui.Cells.j2.m(R.drawable.msg_theme, arrayList5, arrayList4, 5);
                                arrayList3.add(LocaleController.getString(R.string.SaveToDownloads));
                                org.telegram.ui.Cells.j2.m(R.drawable.msg_download, arrayList5, arrayList4, num3);
                                arrayList3.add(LocaleController.getString(R.string.ShareFile));
                                org.telegram.ui.Cells.j2.m(R.drawable.msg_share, arrayList5, arrayList4, 6);
                            } else if (c10 == 6) {
                                arrayList3.add(LocaleController.getString(R.string.SaveToGallery));
                                org.telegram.ui.Cells.j2.j(R.drawable.msg_gallery, 7, arrayList5, arrayList4);
                                arrayList3.add(LocaleController.getString(R.string.SaveToDownloads));
                                org.telegram.ui.Cells.j2.m(R.drawable.msg_download, arrayList5, arrayList4, num3);
                                arrayList3.add(LocaleController.getString(R.string.ShareFile));
                                org.telegram.ui.Cells.j2.m(R.drawable.msg_share, arrayList5, arrayList4, 6);
                            } else if (c10 == 7) {
                                if (this.Y.isMask()) {
                                    arrayList3.add(LocaleController.getString(R.string.AddToMasks));
                                } else {
                                    arrayList3.add(LocaleController.getString(R.string.AddToStickers));
                                }
                                org.telegram.ui.Cells.j2.j(R.drawable.msg_sticker, 9, arrayList5, arrayList4);
                            } else if (c10 == '\b') {
                                long j10 = this.Y.messageOwner.media.user_id;
                                TLRPC.User user3 = j10 != 0 ? MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)) : user2;
                                if (user3 != null && user3.id != UserConfig.getInstance(this.currentAccount).getClientUserId() && ContactsController.getInstance(this.currentAccount).contactsDict.get(Long.valueOf(user3.id)) == null) {
                                    arrayList3.add(LocaleController.getString(R.string.AddContactTitle));
                                    org.telegram.ui.Cells.j2.j(R.drawable.msg_addcontact, 15, arrayList5, arrayList4);
                                }
                                if (!TextUtils.isEmpty(this.Y.messageOwner.media.phone_number)) {
                                    arrayList3.add(LocaleController.getString(R.string.Copy));
                                    org.telegram.ui.Cells.j2.j(R.drawable.msg_copy, 16, arrayList5, arrayList4);
                                    arrayList3.add(LocaleController.getString(R.string.Call));
                                    org.telegram.ui.Cells.j2.j(R.drawable.msg_calls, 17, arrayList5, arrayList4);
                                }
                            }
                        } else if (this.Y.isVideo()) {
                            arrayList3.add(LocaleController.getString(R.string.SaveToGallery));
                            org.telegram.ui.Cells.j2.m(R.drawable.msg_gallery, arrayList5, arrayList4, num2);
                            arrayList3.add(LocaleController.getString(R.string.ShareFile));
                            org.telegram.ui.Cells.j2.m(R.drawable.msg_share, arrayList5, arrayList4, 6);
                        } else if (this.Y.isMusic()) {
                            arrayList3.add(LocaleController.getString(R.string.SaveToMusic));
                            org.telegram.ui.Cells.j2.m(R.drawable.msg_download, arrayList5, arrayList4, num);
                            arrayList3.add(LocaleController.getString(R.string.ShareFile));
                            org.telegram.ui.Cells.j2.m(R.drawable.msg_share, arrayList5, arrayList4, 6);
                        } else {
                            Integer num4 = num;
                            if (this.Y.getDocument() != null) {
                                if (MessageObject.isNewGifDocument(this.Y.getDocument())) {
                                    arrayList3.add(LocaleController.getString(R.string.SaveToGIFs));
                                    org.telegram.ui.Cells.j2.m(R.drawable.msg_gif, arrayList5, arrayList4, 11);
                                }
                                arrayList3.add(LocaleController.getString(R.string.SaveToDownloads));
                                org.telegram.ui.Cells.j2.m(R.drawable.msg_download, arrayList5, arrayList4, num4);
                                arrayList3.add(LocaleController.getString(R.string.ShareFile));
                                org.telegram.ui.Cells.j2.m(R.drawable.msg_share, arrayList5, arrayList4, 6);
                            } else {
                                arrayList3.add(LocaleController.getString(R.string.SaveToGallery));
                                org.telegram.ui.Cells.j2.m(R.drawable.msg_gallery, arrayList5, arrayList4, num2);
                            }
                        }
                    }
                    arrayList = arrayList3;
                    arrayList2 = arrayList;
                    oaVar = new oa(this, arrayList4, arrayList2, arrayList5, view, f10, f11);
                    if (ChatObject.canBlockUsers(chat2)) {
                        channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                        if (!(channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) {
                        }
                        MessagesController messagesController2 = getMessagesController();
                        Utilities.Callback<TLRPC.ChannelParticipant> i2Var2 = new gh.i2(this, arrayList2, arrayList5, arrayList4, oaVar, 1);
                        oaVar = oaVar;
                        messagesController2.getChannelParticipant(chat2, user, i2Var2);
                        z11 = true;
                    }
                    if (!z11) {
                    }
                }
            }
            c10 = 65535;
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
            m0 m0Var = new m0(this, getParentActivity(), 4);
            this.d0 = m0Var;
            m0Var.setOutlineProvider(new bg.q1(8));
            this.d0.setClipToOutline(true);
            this.d0.setWillNotDraw(false);
            this.d0.setVisibility(4);
            c5.c cVar = new c5.c(getParentActivity());
            this.e0 = cVar;
            cVar.setBackgroundColor(0);
            if (z10) {
                this.d0.addView(this.e0, g7.e6.c(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.f0 = textureView;
            textureView.setOpaque(false);
            this.e0.addView(this.f0, g7.e6.c(-1.0f, -1));
        }
        if (this.d0.getParent() == null) {
            mb mbVar = this.X;
            m0 m0Var2 = this.d0;
            int i9 = AndroidUtilities.roundMessageSize;
            mbVar.addView(m0Var2, 1, new FrameLayout.LayoutParams(i9, i9));
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
        int i9 = 0;
        while (true) {
            ArrayList arrayList4 = this.n0;
            if (i9 >= arrayList4.size()) {
                ArrayList arrayList5 = this.o0;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                return;
            }
            MessageObject messageObject = (MessageObject) arrayList4.get(i9);
            long j10 = (messageObject == null || (tL_channelAdminLogEvent2 = messageObject.currentEvent) == null || !(tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) ? 0L : tL_channelAdminLogEvent2.user_id;
            if (messageObject.stableId <= 0) {
                int i10 = T0;
                T0 = i10 + 1;
                messageObject.stableId = i10;
            }
            int i11 = i9 + 1;
            MessageObject messageObject2 = i11 < arrayList4.size() ? (MessageObject) arrayList4.get(i11) : null;
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
                    MessageObject messageObject3 = (MessageObject) j3.r0.j(1, arrayList3);
                    boolean z11 = TextUtils.isEmpty(this.v0) && arrayList3.size() > 3;
                    Long valueOf = Long.valueOf(messageObject3.eventId);
                    HashSet hashSet = this.p0;
                    if (hashSet.contains(valueOf) || !z11) {
                        for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                            a1((MessageObject) arrayList3.get(i12), 0);
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
                    MessageObject messageObject4 = (MessageObject) j3.r0.j(1, arrayList6);
                    arrayList2.addAll(arrayList6);
                    arrayList2.add(N0(messageObject4.eventId, messageObject4.currentEvent.user_id, arrayList6, true, false));
                }
                arrayList.clear();
            }
            i9 = i11;
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
            this.R.addListener(new mh.x(this, 21));
            this.R.setStartDelay(500L);
            this.R.start();
        }
    }

    public final void U0(int i9) {
        if (Build.VERSION.SDK_INT < 31 || this.n == null) {
            return;
        }
        ff.f0 f0Var = this.P0;
        if (f0Var.c == 0) {
            f0Var.invalidate();
        }
        f0Var.c = i9 | f0Var.c;
    }

    public final void V0(boolean z10) {
        lb lbVar;
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
            for (int i9 = 0; i9 < this.w0.m(); i9++) {
                tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.w0.n(i9)));
            }
        }
        c1();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new na(this, 4));
        if (!z10 || (lbVar = this.E) == null) {
            return;
        }
        lbVar.l();
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
            for (int i9 = 0; i9 < this.w0.m(); i9++) {
                tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.w0.n(i9)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new na(this, 1));
    }

    public final void X0(boolean z10) {
        eb ebVar = this.A;
        if (ebVar == null || this.C == null || ebVar.getChildCount() <= 0) {
            return;
        }
        int i9 = z10 ? ConnectionsManager.DEFAULT_DATACENTER_ID : TLObject.FLAG_31;
        View view = null;
        int i10 = -1;
        for (int i11 = 0; i11 < this.A.getChildCount(); i11++) {
            View childAt = this.A.getChildAt(i11);
            this.A.getClass();
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                int top = childAt.getTop();
                if (z10) {
                    if (top >= i9) {
                    }
                    i9 = childAt.getTop();
                    view = childAt;
                    i10 = R;
                } else {
                    if (top <= i9) {
                    }
                    i9 = childAt.getTop();
                    view = childAt;
                    i10 = R;
                }
            }
        }
        if (view != null) {
            this.M0 = view instanceof org.telegram.ui.Cells.t1 ? ((org.telegram.ui.Cells.t1) view).getMessageObject().eventId : view instanceof org.telegram.ui.Cells.w0 ? ((org.telegram.ui.Cells.w0) view).getMessageObject().eventId : 0L;
            this.N0 = i10;
            this.O0 = (this.A.getMeasuredHeight() - view.getBottom()) - this.A.getPaddingBottom();
        }
    }

    public final int Y0(MessageObject messageObject) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        int i9;
        int findQuoteStart;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        if (TextUtils.isEmpty(null)) {
            org.telegram.ui.Cells.t1 t1Var2 = this.J0;
            if (t1Var2 != null) {
                t1Var2.se = 0;
                t1Var2.te = null;
            }
        } else {
            if (TextUtils.isEmpty(messageObject.caption) || (t1Var = this.J0) == null || (textLayoutBlocks = t1Var.Y3) == null) {
                CharSequence charSequence2 = messageObject.messageText;
                arrayList = messageObject.textLayoutBlocks;
                org.telegram.ui.Cells.t1 t1Var3 = this.J0;
                if (t1Var3 == null || !t1Var3.p1) {
                    charSequence = charSequence2;
                    i9 = 0;
                } else {
                    i9 = t1Var3.i2 + AndroidUtilities.dp(10.0f);
                    charSequence = charSequence2;
                }
            } else {
                i9 = (int) t1Var.m4;
                charSequence = messageObject.caption;
                arrayList = textLayoutBlocks.textLayoutBlocks;
            }
            org.telegram.ui.Cells.t1 t1Var4 = this.J0;
            if (t1Var4 != null) {
                t1Var4.se = 0;
                t1Var4.te = null;
            }
            if (arrayList != null && charSequence != null && (findQuoteStart = MessageObject.findQuoteStart(charSequence.toString(), null, this.H0)) >= 0) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i10);
                    String charSequence3 = textLayoutBlock.textLayout.getText().toString();
                    int i11 = textLayoutBlock.charactersOffset;
                    if (findQuoteStart > i11) {
                        float textYOffset = findQuoteStart - i11 > charSequence3.length() + (-1) ? i9 + ((int) (textLayoutBlock.textYOffset(arrayList) + textLayoutBlock.padTop + textLayoutBlock.height)) : r5.getLineTop(r5.getLineForOffset(findQuoteStart - textLayoutBlock.charactersOffset)) + textLayoutBlock.textYOffset(arrayList) + i9 + textLayoutBlock.padTop;
                        if (textYOffset > AndroidUtilities.displaySize.y * (this.X.getKeyboardHeight() > AndroidUtilities.dp(20.0f) ? 0.7f : 0.5f)) {
                            return (int) (textYOffset - (AndroidUtilities.displaySize.y * (this.X.getKeyboardHeight() > AndroidUtilities.dp(20.0f) ? 0.7f : 0.5f)));
                        }
                    } else {
                        i10++;
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
        int i9;
        int i10;
        int indexOf;
        float f10;
        int g12;
        MessageObject messageObject2;
        ArrayList arrayList = this.o0;
        if (arrayList.size() > 0) {
            int N0 = this.C.N0();
            for (int L0 = this.C.L0(); L0 <= N0; L0++) {
                lb lbVar = this.E;
                int i11 = lbVar.f;
                if (L0 >= i11 && L0 < lbVar.h) {
                    MessageObject messageObject3 = (MessageObject) arrayList.get(L0 - i11);
                    if (messageObject3.contentType != 1 && messageObject3.getRealId() != 0 && !messageObject3.isSponsored()) {
                        i10 = L0 - this.E.f;
                        i9 = (messageObject3.getRealId() < messageObject.getRealId() ? 1 : 0) ^ 1;
                        this.D.b = i9;
                        indexOf = arrayList.indexOf(messageObject);
                        if (indexOf == -1) {
                            if (i10 > 0) {
                                i9 = i10 > indexOf ? 0 : 1;
                                this.D.b = i9;
                            }
                            sa saVar = this.I0;
                            if (saVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(saVar);
                                this.I0 = null;
                            }
                            this.G0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            this.G0 = messageObject.getRealId();
                            int indexOf2 = arrayList.indexOf(messageObject) + this.E.f;
                            e1();
                            int childCount = this.A.getChildCount();
                            int i12 = 0;
                            boolean z10 = false;
                            int i13 = 0;
                            while (true) {
                                if (i12 >= childCount) {
                                    f10 = 2.0f;
                                    break;
                                }
                                View childAt = this.A.getChildAt(i12);
                                if (childAt instanceof org.telegram.ui.Cells.t1) {
                                    MessageObject messageObject4 = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                                    if (messageObject4 != null) {
                                        f10 = 2.0f;
                                        if (messageObject4.getRealId() == messageObject.getRealId()) {
                                            childAt.sendAccessibilityEvent(8);
                                            i13 = Y0(messageObject4);
                                            z10 = true;
                                        }
                                    } else {
                                        f10 = 2.0f;
                                    }
                                    if (z10) {
                                        i12++;
                                    } else {
                                        int top = childAt.getTop() - (Math.max(-AndroidUtilities.dp(f10), (this.A.getMeasuredHeight() - childAt.getHeight()) / 2) - i13);
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
                                    f10 = 2.0f;
                                    if ((childAt instanceof org.telegram.ui.Cells.w0) && (messageObject2 = ((org.telegram.ui.Cells.w0) childAt).getMessageObject()) != null && messageObject2.getRealId() == messageObject.getRealId()) {
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
                                    this.J0 = new org.telegram.ui.Cells.t1(getParentActivity(), this.currentAccount);
                                }
                                org.telegram.ui.Cells.t1 t1Var = this.J0;
                                TLRPC.Chat chat = this.s;
                                t1Var.J7 = chat != null;
                                t1Var.O7 = ChatObject.isChannel(chat) && chat.megagroup;
                                g12 = this.J0.g1(messageObject, null, z11);
                            }
                            int max = Math.max(-AndroidUtilities.dp(f10), (this.A.getMeasuredHeight() - g12) / 2) - Y0(messageObject);
                            ob obVar = this.L0;
                            obVar.a = messageObject;
                            obVar.e = max;
                            c2.y yVar = this.D;
                            yVar.b = i9;
                            obVar.b = indexOf2;
                            obVar.d = max;
                            obVar.c = false;
                            yVar.c(indexOf2, max, false, false);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        i9 = -1;
        i10 = 0;
        this.D.b = i9;
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
            for (int i9 = 0; i9 < 8; i9++) {
                arrayList.add(new org.telegram.ui.Cells.t1(context, this.currentAccount));
            }
        }
        this.U = false;
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.f6.J(context, false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        org.telegram.ui.Cells.j2.v(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new fh.w4(this, 23));
        org.telegram.ui.Components.tn tnVar = new org.telegram.ui.Components.tn(context, null, false, null);
        this.I = tnVar;
        zk zkVar = tnVar.h;
        if (zkVar != null) {
            zkVar.setTextSizePx(AndroidUtilities.dp(17.5f));
        }
        zk zkVar2 = tnVar.r;
        if (zkVar2 != null) {
            zkVar2.setTextSizePx(AndroidUtilities.dp(13.5f));
        }
        tnVar.g0 = true;
        this.I.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.I, 0, g7.e6.d(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new cb(this, 0);
        this.N = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.N.setSearchPaddingStart(7);
        this.I.setEnabled(false);
        org.telegram.ui.Components.tn tnVar2 = this.I;
        TLRPC.Chat chat = this.s;
        tnVar2.setTitle(chat.title);
        this.I.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
        this.I.setChatAvatar(chat);
        db dbVar = new db(this, context);
        this.fragmentView = dbVar;
        this.X = dbVar;
        ff.f0 f0Var = new ff.f0(context, new ta(this));
        this.P0 = f0Var;
        this.X.addView(f0Var);
        pg.i iVar = new pg.i(this.X);
        mb mbVar = this.X;
        ig.a aVar = this.e;
        aVar.d = iVar;
        aVar.e = mbVar;
        ig.a aVar2 = this.f;
        aVar2.d = iVar;
        aVar2.e = mbVar;
        ig.a aVar3 = this.b;
        aVar3.d = iVar;
        aVar3.e = mbVar;
        mbVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.X.V(org.telegram.ui.ActionBar.f6.r0());
        this.actionBar.L(aVar, mg.c.n(this.resourceProvider), false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.H = frameLayout;
        frameLayout.setVisibility(4);
        this.X.addView(this.H, g7.e6.e(-1, -2, 17));
        this.H.setOnTouchListener(new jh.d(7));
        LinearLayout linearLayout = new LinearLayout(context);
        this.J = linearLayout;
        linearLayout.setBackground(new org.telegram.ui.ActionBar.s5(this.L, this.X, AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.f6.f2));
        this.J.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.K.setImageResource(R.drawable.large_log_actions);
        this.K.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.K.setVisibility(8);
        this.J.addView(this.K, g7.e6.t(54, 54, 17, 16, 20, 16, -4));
        bg.t tVar = new bg.t(context, 10);
        this.L = tVar;
        tVar.setTextSize(1, 14.0f);
        this.L.setGravity(17);
        bg.t tVar2 = this.L;
        int i10 = org.telegram.ui.ActionBar.f6.ic;
        tVar2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        this.J.addView(this.L, g7.e6.t(-2, -2, 17, 0, 0, 0, 0));
        this.H.addView(this.J, g7.e6.d(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        eb ebVar = new eb(this, context);
        this.A = ebVar;
        ebVar.setOnItemClickListener(new g(this, 9));
        this.A.setTag(1);
        this.A.setVerticalScrollBarEnabled(true);
        eb ebVar2 = this.A;
        lb lbVar = new lb(this, context);
        this.E = lbVar;
        ebVar2.setAdapter(lbVar);
        this.A.setClipToPadding(false);
        eb ebVar3 = this.A;
        int i11 = AndroidUtilities.statusBarHeight;
        int i12 = this.r;
        ebVar3.setPadding(0, AndroidUtilities.dp(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11 + i12, 0, AndroidUtilities.dp(60.0f) + i12 + AndroidUtilities.navigationBarHeight);
        eb ebVar4 = this.A;
        fb fbVar = new fb(this, this.A, this.resourceProvider);
        this.C0 = fbVar;
        ebVar4.setItemAnimator(fbVar);
        this.C0.Q = true;
        this.A.setLayoutAnimation(null);
        of.y yVar = new of.y(this);
        this.C = yVar;
        yVar.j1(1);
        this.C.l1(true);
        this.A.setLayoutManager(this.C);
        c2.y yVar2 = new c2.y(this.A, this.C);
        this.D = yVar2;
        yVar2.h = new ta(this);
        yVar2.i = this.L0;
        this.X.addView(this.A, g7.e6.c(-1.0f, -1));
        this.A.setOnScrollListener(new l3(this));
        int i13 = this.g0;
        if (i13 != -1) {
            this.C.h1(i13, this.h0);
            this.g0 = -1;
        }
        rg.f fVar = new rg.f(context);
        this.W = fVar;
        fVar.setup(aVar3);
        this.W.setFadeZoneTop(AndroidUtilities.dp(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.W.setFadeHeightTop(AndroidUtilities.dp(60.0f));
        this.W.setFadeZoneBottom(AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(9.0f) + AndroidUtilities.navigationBarHeight);
        this.W.setFadeHeightBottom(AndroidUtilities.dp(60.0f));
        this.X.addView(this.W, g7.e6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.w = frameLayout2;
        frameLayout2.setVisibility(4);
        this.X.addView(this.w, g7.e6.e(-1, -1, 51));
        View view = new View(context);
        this.x = view;
        view.setBackground(new org.telegram.ui.ActionBar.s5(this.x, this.X, AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.f6.f2));
        this.w.addView(this.x, g7.e6.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.y = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        this.y.setProgressColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        this.w.addView(this.y, g7.e6.e(32, 32, 17));
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context);
        this.M = w0Var;
        w0Var.setAlpha(0.0f);
        this.M.setImportantForAccessibility(2);
        this.X.addView(this.M, g7.e6.d(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.X.addView(this.actionBar);
        org.telegram.ui.ActionBar.b6 b6Var = this.resourceProvider;
        rg.e eVar = new rg.e(context, aVar, mg.c.b(b6Var), b6Var);
        this.G = eVar;
        eVar.setTotalVisibilityFactor(1.0f);
        this.G.setTranslationY(-AndroidUtilities.navigationBarHeight);
        this.G.c(4, true, false);
        rg.e eVar2 = this.G;
        kg.d c10 = eVar2.n.c(eVar2, null, false);
        c10.n(eVar2.r);
        c10.p(AndroidUtilities.dp(22.0f));
        c10.o(AndroidUtilities.dp(6.0f));
        eVar2.s = c10;
        this.X.addView(this.G, g7.e6.d(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
        TextView textView = new TextView(context);
        this.F = textView;
        final int i14 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.va
            public final /* synthetic */ pb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        pb pbVar = this.b;
                        if (pbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(pbVar, pbVar.u0, pbVar.w0, pbVar.s.megagroup);
                            g0Var.R(pbVar.t0);
                            g0Var.c0 = new ta(pbVar);
                            pbVar.showDialog(g0Var);
                            break;
                        }
                        break;
                    case 1:
                        pb pbVar2 = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pbVar2.getParentActivity());
                        if (pbVar2.s.megagroup) {
                            alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.N = string;
                        pbVar2.showDialog(c2Var);
                        break;
                    default:
                        pb pbVar3 = this.b;
                        if (pbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(pbVar3.N.getSearchField());
                            pbVar3.showDialog(org.telegram.ui.Components.y4.p(pbVar3.getParentActivity(), new qa(pbVar3, 0), null).a);
                            break;
                        }
                        break;
                }
            }
        });
        this.F.setTextSize(1, 15.0f);
        this.F.setTypeface(AndroidUtilities.bold());
        this.F.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Ae, false));
        this.F.setText(LocaleController.getString(R.string.SETTINGS));
        this.F.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        this.G.getContainer().addView(this.F, g7.e6.e(-2, -2, 17));
        this.G.f.add(this.F);
        this.G.d(false);
        final int i15 = 1;
        this.G.b[4] = new View.OnClickListener(this) { // from class: org.telegram.ui.va
            public final /* synthetic */ pb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        pb pbVar = this.b;
                        if (pbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(pbVar, pbVar.u0, pbVar.w0, pbVar.s.megagroup);
                            g0Var.R(pbVar.t0);
                            g0Var.c0 = new ta(pbVar);
                            pbVar.showDialog(g0Var);
                            break;
                        }
                        break;
                    case 1:
                        pb pbVar2 = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pbVar2.getParentActivity());
                        if (pbVar2.s.megagroup) {
                            alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.N = string;
                        pbVar2.showDialog(c2Var);
                        break;
                    default:
                        pb pbVar3 = this.b;
                        if (pbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(pbVar3.N.getSearchField());
                            pbVar3.showDialog(org.telegram.ui.Components.y4.p(pbVar3.getParentActivity(), new qa(pbVar3, 0), null).a);
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
        this.X.addView(this.a0, g7.e6.e(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.b0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.b0.setImageResource(R.drawable.msg_calendar);
        this.b0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.xe, false), PorterDuff.Mode.MULTIPLY));
        this.a0.addView(this.b0, g7.e6.e(48, 48, 53));
        final int i16 = 2;
        this.b0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.va
            public final /* synthetic */ pb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        pb pbVar = this.b;
                        if (pbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(pbVar, pbVar.u0, pbVar.w0, pbVar.s.megagroup);
                            g0Var.R(pbVar.t0);
                            g0Var.c0 = new ta(pbVar);
                            pbVar.showDialog(g0Var);
                            break;
                        }
                        break;
                    case 1:
                        pb pbVar2 = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pbVar2.getParentActivity());
                        if (pbVar2.s.megagroup) {
                            alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.N = string;
                        pbVar2.showDialog(c2Var);
                        break;
                    default:
                        pb pbVar3 = this.b;
                        if (pbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(pbVar3.N.getSearchField());
                            pbVar3.showDialog(org.telegram.ui.Components.y4.p(pbVar3.getParentActivity(), new qa(pbVar3, 0), null).a);
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.c0 = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ye, false));
        this.c0.setTextSize(15);
        this.c0.setTypeface(AndroidUtilities.bold());
        this.a0.addView(this.c0, g7.e6.d(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.E.D(true);
        if (this.r0 && this.n0.isEmpty()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.w, true, 0.3f, true);
            this.A.setEmptyView(null);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(this.w, false, 0.3f, true);
            this.A.setEmptyView(this.H);
        }
        eb ebVar5 = this.A;
        ebVar5.U1 = true;
        ebVar5.V1 = 1;
        UndoView undoView = new UndoView(context);
        this.B = undoView;
        undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
        this.X.addView(this.B, g7.e6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        c1();
        return this.fragmentView;
    }

    public final void d1() {
        eb ebVar = this.A;
        if (ebVar == null) {
            return;
        }
        int childCount = ebVar.getChildCount();
        int measuredHeight = this.A.getMeasuredHeight();
        int i9 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        boolean z10 = false;
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        boolean z11 = false;
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = this.A.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                float y10 = (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY();
                int backgroundSizeY = this.X.getBackgroundSizeY();
                u1Var.f = y10;
                u1Var.h = backgroundSizeY;
            } else if (childAt instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                int top = t1Var.getTop();
                t1Var.getBottom();
                int i12 = top >= 0 ? 0 : -top;
                int measuredHeight2 = t1Var.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i12 + measuredHeight;
                }
                t1Var.b4(i12, measuredHeight2 - i12, (this.X.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - this.A.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY(), this.X.getMeasuredWidth(), this.X.getBackgroundSizeY(), 0, 0, 0);
                MessageObject messageObject = t1Var.getMessageObject();
                if (this.d0 != null && messageObject.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                    ImageReceiver photoImage = t1Var.getPhotoImage();
                    this.d0.setTranslationX(photoImage.getImageX());
                    this.d0.setTranslationY(photoImage.getImageY() + this.fragmentView.getPaddingTop() + top);
                    this.fragmentView.invalidate();
                    this.d0.invalidate();
                    z11 = true;
                }
            } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                w0Var.V((childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY(), this.X.getBackgroundSizeY());
                if (w0Var.I()) {
                    w0Var.invalidate();
                }
            }
            if (childAt.getBottom() > this.A.getPaddingTop()) {
                int bottom = childAt.getBottom();
                if (bottom < i9) {
                    if ((childAt instanceof org.telegram.ui.Cells.t1) || (childAt instanceof org.telegram.ui.Cells.w0)) {
                        view = childAt;
                    }
                    i9 = bottom;
                    view3 = childAt;
                }
                fb fbVar = this.C0;
                if ((fbVar == null || (!fbVar.a0(childAt) && !this.C0.Z(childAt))) && (childAt instanceof org.telegram.ui.Cells.w0) && ((org.telegram.ui.Cells.w0) childAt).getMessageObject().isDateObject) {
                    if (childAt.getAlpha() != 1.0f) {
                        childAt.setAlpha(1.0f);
                    }
                    if (bottom < i10) {
                        i10 = bottom;
                        view2 = childAt;
                    }
                }
            }
        }
        m0 m0Var = this.d0;
        if (m0Var != null) {
            if (z11) {
                MediaController.getInstance().setCurrentVideoVisible(true);
            } else {
                m0Var.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                this.fragmentView.invalidate();
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null && playingMessageObject.isRoundVideo() && this.V) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
            }
        }
        if (view != null) {
            this.M.S((view instanceof org.telegram.ui.Cells.t1 ? ((org.telegram.ui.Cells.t1) view).getMessageObject() : ((org.telegram.ui.Cells.w0) view).getMessageObject()).messageOwner.date, false, true);
        }
        this.P = false;
        if (!(view3 instanceof org.telegram.ui.Cells.t1) && !(view3 instanceof org.telegram.ui.Cells.w0)) {
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
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        org.telegram.ui.Cells.t1 t1Var2;
        MessageObject messageObject2;
        org.telegram.ui.Cells.t1 t1Var3;
        MessageObject messageObject3;
        boolean z10;
        if (i9 == NotificationCenter.emojiLoaded) {
            eb ebVar = this.A;
            if (ebVar != null) {
                ebVar.f1();
                return;
            }
            return;
        }
        if (i9 != NotificationCenter.messagePlayingDidStart) {
            if (i9 == NotificationCenter.messagePlayingDidReset || i9 == NotificationCenter.messagePlayingPlayStateChanged) {
                eb ebVar2 = this.A;
                if (ebVar2 != null) {
                    int childCount = ebVar2.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = this.A.getChildAt(i11);
                        if ((childAt instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null) {
                            if (messageObject.isVoice() || messageObject.isMusic()) {
                                t1Var.m4(false, true, false);
                            } else if (messageObject.isRoundVideo() && !MediaController.getInstance().isPlayingMessage(messageObject)) {
                                t1Var.e1(null, true);
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (i9 != NotificationCenter.messagePlayingProgressDidChanged) {
                if (i9 != NotificationCenter.didSetNewWallpapper || this.fragmentView == null) {
                    return;
                }
                this.X.V(org.telegram.ui.ActionBar.f6.r0());
                this.x.invalidate();
                bg.t tVar = this.L;
                if (tVar != null) {
                    tVar.invalidate();
                }
                this.A.f1();
                return;
            }
            Integer num = (Integer) objArr[0];
            eb ebVar3 = this.A;
            if (ebVar3 != null) {
                int childCount2 = ebVar3.getChildCount();
                for (int i12 = 0; i12 < childCount2; i12++) {
                    View childAt2 = this.A.getChildAt(i12);
                    if ((childAt2 instanceof org.telegram.ui.Cells.t1) && (messageObject2 = (t1Var2 = (org.telegram.ui.Cells.t1) childAt2).getMessageObject()) != null && messageObject2.getId() == num.intValue()) {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject != null) {
                            messageObject2.audioProgress = playingMessageObject.audioProgress;
                            messageObject2.audioProgressSec = playingMessageObject.audioProgressSec;
                            messageObject2.audioPlayerDuration = playingMessageObject.audioPlayerDuration;
                            t1Var2.q4();
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
            int i13 = 0;
            while (true) {
                if (i13 >= childCount3) {
                    z10 = false;
                    break;
                }
                View childAt3 = this.A.getChildAt(i13);
                if (childAt3 instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) childAt3;
                    MessageObject messageObject4 = t1Var4.getMessageObject();
                    if (this.d0 != null && messageObject4.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject4)) {
                        ImageReceiver photoImage = t1Var4.getPhotoImage();
                        this.d0.setTranslationX(photoImage.getImageX());
                        this.d0.setTranslationY(photoImage.getImageY() + t1Var4.getTop() + this.fragmentView.getPaddingTop());
                        this.fragmentView.invalidate();
                        this.d0.invalidate();
                        z10 = true;
                        break;
                    }
                }
                i13++;
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
        eb ebVar4 = this.A;
        if (ebVar4 != null) {
            int childCount4 = ebVar4.getChildCount();
            for (int i14 = 0; i14 < childCount4; i14++) {
                View childAt4 = this.A.getChildAt(i14);
                if ((childAt4 instanceof org.telegram.ui.Cells.t1) && (messageObject3 = (t1Var3 = (org.telegram.ui.Cells.t1) childAt4).getMessageObject()) != null) {
                    if (messageObject3.isVoice() || messageObject3.isMusic()) {
                        t1Var3.m4(false, true, false);
                    } else if (messageObject3.isRoundVideo()) {
                        t1Var3.e1(null, false);
                        if (!MediaController.getInstance().isPlayingMessage(messageObject3) && messageObject3.audioProgress != 0.0f) {
                            messageObject3.resetPlayingProgress();
                            t1Var3.invalidate();
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
        eb ebVar = this.A;
        if (ebVar == null) {
            return;
        }
        int childCount = ebVar.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = this.A.getChildAt(i9);
            if (childAt instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                MessageObject messageObject = t1Var.getMessageObject();
                if (messageObject != null) {
                    if (!this.actionBar.s()) {
                        t1Var.setDrawSelectionBackground(false);
                        t1Var.J3(false, true);
                        t1Var.L3(false, false, true);
                    }
                    t1Var.setHighlighted(this.G0 != Integer.MAX_VALUE && messageObject.getRealId() == this.G0);
                    if (this.G0 != Integer.MAX_VALUE) {
                        sa saVar = this.I0;
                        if (saVar != null) {
                            AndroidUtilities.cancelRunOnUIThread(saVar);
                        }
                        sa saVar2 = new sa(this, 0);
                        this.I0 = saVar2;
                        AndroidUtilities.runOnUIThread(saVar2, 1000L);
                    }
                    if (TextUtils.isEmpty(this.v0)) {
                        t1Var.S3(null);
                    } else {
                        t1Var.S3(this.v0);
                    }
                    t1Var.setSpoilersSuppressed(this.A.getScrollState() != 0);
                }
            } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                w0Var.setMessageObject(w0Var.getMessageObject());
                w0Var.setSpoilersSuppressed(this.A.getScrollState() != 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Nd));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 32768, null, null, null, null, i9));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.f6.v8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar2, 64, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.f6.t8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar3, 256, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, TLObject.FLAG_31, null, null, null, null, org.telegram.ui.ActionBar.f6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, TLObject.FLAG_30, null, null, null, null, org.telegram.ui.ActionBar.f6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.f6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 32768, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.I.getTitleTextView(), 4, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.I.getSubtitleTextView(), 4, (Class[]) null, new Paint[]{org.telegram.ui.ActionBar.f6.c2, org.telegram.ui.ActionBar.f6.d2}, org.telegram.ui.ActionBar.f6.B8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.f6.r0, null, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.i8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.j8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.k8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.l8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.m8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.n8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.o8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.m3, org.telegram.ui.ActionBar.f6.q3}, null, org.telegram.ui.ActionBar.f6.ra));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.n3, org.telegram.ui.ActionBar.f6.r3}, null, org.telegram.ui.ActionBar.f6.dc));
        Drawable[] k10 = org.telegram.ui.ActionBar.f6.m3.k();
        int i12 = org.telegram.ui.ActionBar.f6.ta;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, k10, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.f6.q3.k(), null, i12));
        Drawable[] k11 = org.telegram.ui.ActionBar.f6.o3.k();
        int i13 = org.telegram.ui.ActionBar.f6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, k11, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.f6.s3.k(), null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.o3, org.telegram.ui.ActionBar.f6.s3}, null, org.telegram.ui.ActionBar.f6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.o3, org.telegram.ui.ActionBar.f6.s3}, null, org.telegram.ui.ActionBar.f6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.o3, org.telegram.ui.ActionBar.f6.s3}, null, org.telegram.ui.ActionBar.f6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.o3, org.telegram.ui.ActionBar.f6.s3}, null, org.telegram.ui.ActionBar.f6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.p3, org.telegram.ui.ActionBar.f6.t3}, null, org.telegram.ui.ActionBar.f6.Ba));
        TextPaint textPaint = org.telegram.ui.ActionBar.f6.s2;
        int i14 = org.telegram.ui.ActionBar.f6.ic;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 4, new Class[]{org.telegram.ui.Cells.w0.class}, textPaint, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 2, new Class[]{org.telegram.ui.Cells.w0.class}, org.telegram.ui.ActionBar.f6.s2, null, null, org.telegram.ui.ActionBar.f6.jc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.w4, org.telegram.ui.ActionBar.f6.q4, org.telegram.ui.ActionBar.f6.x4, org.telegram.ui.ActionBar.f6.v4, org.telegram.ui.ActionBar.f6.u4, org.telegram.ui.ActionBar.f6.C4}, null, org.telegram.ui.ActionBar.f6.kc));
        int i15 = org.telegram.ui.ActionBar.f6.lc;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.w0.class}, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.w0.class}, null, null, null, org.telegram.ui.ActionBar.f6.mc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.fc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 2, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint[]) null, org.telegram.ui.ActionBar.f6.gc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 2, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint[]) null, org.telegram.ui.ActionBar.f6.hc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.y3}, null, org.telegram.ui.ActionBar.f6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.z3}, null, org.telegram.ui.ActionBar.f6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.A3, org.telegram.ui.ActionBar.f6.C3}, null, org.telegram.ui.ActionBar.f6.La));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.B3, org.telegram.ui.ActionBar.f6.D3}, null, org.telegram.ui.ActionBar.f6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.F3, org.telegram.ui.ActionBar.f6.G3}, null, org.telegram.ui.ActionBar.f6.sc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.O3, org.telegram.ui.ActionBar.f6.S3, org.telegram.ui.ActionBar.f6.W3}, null, org.telegram.ui.ActionBar.f6.Ra));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.P3, org.telegram.ui.ActionBar.f6.T3, org.telegram.ui.ActionBar.f6.X3}, null, org.telegram.ui.ActionBar.f6.Sa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.M3, org.telegram.ui.ActionBar.f6.Q3, org.telegram.ui.ActionBar.f6.U3}, null, org.telegram.ui.ActionBar.f6.xc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.N3, org.telegram.ui.ActionBar.f6.R3, org.telegram.ui.ActionBar.f6.V3}, null, org.telegram.ui.ActionBar.f6.yc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.a4, org.telegram.ui.ActionBar.f6.b4, org.telegram.ui.ActionBar.f6.Z3}, null, org.telegram.ui.ActionBar.f6.zc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.e4}, null, org.telegram.ui.ActionBar.f6.Ta));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f4}, null, org.telegram.ui.ActionBar.f6.Ua));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.c4}, null, org.telegram.ui.ActionBar.f6.Ac));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.d4}, null, org.telegram.ui.ActionBar.f6.Bc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.g4}, null, org.telegram.ui.ActionBar.f6.Cc));
        Drawable[] drawableArr = {org.telegram.ui.ActionBar.f6.i4};
        int i16 = org.telegram.ui.ActionBar.f6.Va;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr, null, i16));
        Drawable[] drawableArr2 = {org.telegram.ui.ActionBar.f6.h4, org.telegram.ui.ActionBar.f6.B4, org.telegram.ui.ActionBar.f6.D4};
        int i17 = org.telegram.ui.ActionBar.f6.Dc;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr2, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.f6.I4, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.f6.J4, null, org.telegram.ui.ActionBar.f6.Wa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.f6.G4, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.f6.H4, null, org.telegram.ui.ActionBar.f6.Ec));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.O4}, null, org.telegram.ui.ActionBar.f6.Ia));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.P4}, null, org.telegram.ui.ActionBar.f6.r7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.Q4}, null, org.telegram.ui.ActionBar.f6.qa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.f6.b2, null, null, org.telegram.ui.ActionBar.f6.Fc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.j4}, null, org.telegram.ui.ActionBar.f6.Gc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.f6.J2, null, null, org.telegram.ui.ActionBar.f6.Ic));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.f6.K2, null, null, org.telegram.ui.ActionBar.f6.Jc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Xa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.f6.T1, null, null, org.telegram.ui.ActionBar.f6.Lc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Mc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.f6.Q2, null, null, org.telegram.ui.ActionBar.f6.Nc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Oc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Ya));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Qc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Za));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Rc));
        int i18 = org.telegram.ui.ActionBar.f6.Uc;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, i18));
        int i19 = org.telegram.ui.ActionBar.f6.ab;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.bb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Xc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.db));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Zc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.eb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.ad));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.fb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.bd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.cd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.gb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.dd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.hb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.ed));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.ib));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.fd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.jb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.hd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.id));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.qb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.jd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.rb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.kd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.nd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.sb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.od));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.nb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.pd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.lb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.rd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.tb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.sd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.ub));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.td));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.vb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.ud));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.wb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.wd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.yb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.xd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.vd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.zb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.xb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.yd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Ab));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.zd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Bb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Ad));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Cb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Bd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Db));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Cd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Eb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Dd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Fb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Ed));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Gb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Fd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Hb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Gd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Ib));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Hd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Jb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Kb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Jd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Lb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.f6.U1, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.f6.W1, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Pa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Qa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.ie));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.uc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.je));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.vc));
        Drawable[] drawableArr3 = org.telegram.ui.ActionBar.f6.T4;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 32, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr3[0]}, null, org.telegram.ui.ActionBar.f6.re));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr3[0]}, null, org.telegram.ui.ActionBar.f6.se));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 32, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr3[1]}, null, org.telegram.ui.ActionBar.f6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr3[1]}, null, org.telegram.ui.ActionBar.f6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.pe));
        Drawable[] drawableArr4 = org.telegram.ui.ActionBar.f6.S4;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr4[0]}, null, org.telegram.ui.ActionBar.f6.qe));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr4[1]}, null, org.telegram.ui.ActionBar.f6.Pb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.F, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.Ae));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.L, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.y, 2048, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 131072, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"backgroundLayout"}, null, null, null, org.telegram.ui.ActionBar.f6.Fe));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 8, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"imageView"}, null, null, null, org.telegram.ui.ActionBar.f6.De));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 4, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.f6.Ee));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.x, TLObject.FLAG_29, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.L, TLObject.FLAG_29, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.B, 32, null, null, null, null, org.telegram.ui.ActionBar.f6.Fi));
        int i20 = org.telegram.ui.ActionBar.f6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.B, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.B, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, null, i20));
        int i21 = org.telegram.ui.ActionBar.f6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.B, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.B, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.B, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.B, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, null, i21));
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
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new na(this, 0)), this.classGuid);
        setBulletinDelegate(new bg.z(10));
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
        mb mbVar = this.X;
        if (mbVar != null) {
            org.telegram.ui.Components.q71 q71Var = mbVar.v;
            if (q71Var != null) {
                q71Var.c(false);
            }
            mbVar.B = true;
        }
        UndoView undoView = this.B;
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.i0 = true;
        this.j0 = true;
        com.google.firebase.messaging.l lVar = com.google.firebase.messaging.l.e;
        if (lVar == null || !lVar.a) {
            return;
        }
        com.google.firebase.messaging.l i9 = com.google.firebase.messaging.l.i();
        if (i9.a) {
            r4 r4Var = (r4) i9.d;
            int i10 = b5.B;
            r4Var.b(false);
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
        mb mbVar = this.X;
        if (mbVar != null) {
            org.telegram.ui.Components.q71 q71Var = mbVar.v;
            if (q71Var != null) {
                q71Var.c(true);
            }
            mbVar.B = false;
        }
        this.i0 = false;
        O0(false);
        if (this.j0) {
            this.j0 = false;
            lb lbVar = this.E;
            if (lbVar != null) {
                lbVar.l();
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
