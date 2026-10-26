package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class o9 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate, og0 {
    public boolean E;
    public ArrayList F;
    public final ArrayList G;
    public org.telegram.ui.Components.ws H;
    public FrameLayout I;
    public c9 J;
    public TLRPC.User K;
    public TLRPC.Chat L;
    public Long M;
    public NotificationCenter.ObserversGroup N;
    public int O;
    public int P;
    public float Q;
    public int R;
    public l9 a;
    public s4.c0 b;
    public org.telegram.ui.Components.r71 c;
    public View d;
    public org.telegram.ui.Components.pl0 e;
    public org.telegram.ui.Components.j20 f;
    public org.telegram.ui.Components.c10 h;
    public a9 n;
    public boolean r;
    public boolean s;
    public org.telegram.ui.ActionBar.y5 v;
    public final ArrayList w;
    public boolean x;
    public boolean y;

    public o9() {
        this(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01e5, code lost:
    
        if (r5.d != r15) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void V(o9 o9Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z10;
        TLRPC.messages_Messages messages_messages;
        int i10;
        TLRPC.User user;
        k9 k9Var;
        TLRPC.User user2;
        ArrayList arrayList = o9Var.w;
        int i11 = 0;
        int i12 = 1;
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(o9Var.currentAccount).putUsers(messages_messages2.users, false);
            MessagesController.getInstance(o9Var.currentAccount).putChats(messages_messages2.chats, false);
            o9Var.E = messages_messages2.messages.isEmpty();
            k9 k9Var2 = !arrayList.isEmpty() ? (k9) ic.a.g(1, arrayList) : null;
            int i13 = 0;
            while (i13 < messages_messages2.messages.size()) {
                TLRPC.Message message = messages_messages2.messages.get(i13);
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction == null || (messageAction instanceof TLRPC.TL_messageActionHistoryClear)) {
                    messages_messages = messages_messages2;
                    i10 = i13;
                } else {
                    long fromChatId = MessageObject.getFromChatId(message);
                    if (fromChatId == o9Var.getUserConfig().getClientUserId()) {
                        fromChatId = message.peer_id.user_id;
                    }
                    HashSet hashSet = new HashSet();
                    int i14 = MessageObject.getFromChatId(message) == o9Var.getUserConfig().getClientUserId() ? i11 : i12;
                    TLRPC.MessageAction messageAction2 = message.action;
                    if (messageAction2 instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction2;
                        hashSet.add(Long.valueOf(fromChatId));
                        hashSet.addAll((Collection) Collection.-EL.stream(tL_messageActionConferenceCall.other_participants).map(new k2.g(1)).collect(Collectors.toSet()));
                        if (i14 == i12 && tL_messageActionConferenceCall.missed) {
                            i14 = 2;
                        }
                        int i15 = (i14 == 0 && tL_messageActionConferenceCall.missed) ? 3 : i14;
                        messages_messages = messages_messages2;
                        if (k9Var2 != null) {
                            i10 = i13;
                            if (k9Var2.a == tL_messageActionConferenceCall.call_id) {
                                k9Var = k9Var2;
                                if (k9Var == null) {
                                    ArrayList arrayList2 = k9Var.b;
                                    k9Var.c.add(0, message);
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        Long l4 = (Long) it.next();
                                        long longValue = l4.longValue();
                                        int size = arrayList2.size();
                                        int i16 = 0;
                                        while (true) {
                                            if (i16 >= size) {
                                                TLRPC.User user3 = o9Var.getMessagesController().getUser(l4);
                                                if (user3 != null) {
                                                    arrayList2.add(user3);
                                                }
                                            } else {
                                                Object obj = arrayList2.get(i16);
                                                i16++;
                                                if (longValue == ((TLRPC.User) obj).id) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (k9Var2 != null && !arrayList.contains(k9Var2)) {
                                        arrayList.add(k9Var2);
                                    }
                                    k9Var2 = new k9();
                                    k9Var2.a = tL_messageActionConferenceCall.call_id;
                                    ArrayList arrayList3 = k9Var2.c;
                                    arrayList3.clear();
                                    arrayList3.add(message);
                                    Iterator it2 = hashSet.iterator();
                                    while (it2.hasNext()) {
                                        Long l10 = (Long) it2.next();
                                        l10.getClass();
                                        ArrayList arrayList4 = k9Var2.b;
                                        if (Collection.-EL.stream(arrayList4).noneMatch(new u8(fromChatId, 0)) && (user2 = o9Var.getMessagesController().getUser(l10)) != null) {
                                            arrayList4.add(user2);
                                        }
                                    }
                                    k9Var2.d = i15;
                                    TLRPC.MessageAction messageAction3 = message.action;
                                    k9Var2.e = messageAction3 != null && messageAction3.video;
                                }
                            }
                        } else {
                            i10 = i13;
                        }
                        int i17 = i11;
                        while (true) {
                            if (i17 >= arrayList.size()) {
                                k9Var = null;
                                break;
                            }
                            k9Var = (k9) arrayList.get(i17);
                            int i18 = i17;
                            if (k9Var.a == tL_messageActionConferenceCall.call_id) {
                                break;
                            } else {
                                i17 = i18 + 1;
                            }
                        }
                        if (k9Var == null) {
                        }
                    } else {
                        messages_messages = messages_messages2;
                        i10 = i13;
                        hashSet.add(Long.valueOf(fromChatId));
                        TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = message.action.reason;
                        if (i14 == 1 && ((phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) || (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) {
                            i14 = 2;
                        }
                        int i19 = (i14 == 0 && ((phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) || (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) ? 3 : i14;
                        if (k9Var2 != null) {
                            ArrayList arrayList5 = k9Var2.b;
                            if (hashSet.size() == arrayList5.size()) {
                                int size2 = arrayList5.size();
                                int i20 = 0;
                                while (true) {
                                    if (i20 < size2) {
                                        Object obj2 = arrayList5.get(i20);
                                        i20++;
                                        if (!hashSet.contains(Long.valueOf(((TLRPC.User) obj2).id))) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        if (k9Var2 != null && !arrayList.contains(k9Var2)) {
                            arrayList.add(k9Var2);
                        }
                        k9Var2 = new k9();
                        k9Var2.c.clear();
                        Iterator it3 = hashSet.iterator();
                        while (it3.hasNext()) {
                            Long l11 = (Long) it3.next();
                            l11.getClass();
                            ArrayList arrayList6 = k9Var2.b;
                            if (Collection.-EL.stream(arrayList6).noneMatch(new u8(fromChatId, 1)) && (user = o9Var.getMessagesController().getUser(l11)) != null) {
                                arrayList6.add(user);
                            }
                        }
                        k9Var2.d = i19;
                        TLRPC.MessageAction messageAction4 = message.action;
                        k9Var2.e = messageAction4 != null && messageAction4.video;
                        k9Var2.c.add(message);
                    }
                }
                i13 = i10 + 1;
                messages_messages2 = messages_messages;
                i11 = 0;
                i12 = 1;
            }
            if (k9Var2 != null && !k9Var2.c.isEmpty() && !arrayList.contains(k9Var2)) {
                arrayList.add(k9Var2);
            }
            z10 = true;
        } else {
            z10 = true;
            o9Var.E = true;
        }
        o9Var.x = false;
        if (!o9Var.y) {
            o9Var.resumeDelayedFragmentAnimation();
        }
        o9Var.y = z10;
        o9Var.v.setVisibility(arrayList.isEmpty() ? 8 : 0);
        l9 l9Var = o9Var.a;
        if (l9Var != null) {
            l9Var.b();
        }
        org.telegram.ui.Components.r71 r71Var = o9Var.c;
        if (r71Var != null) {
            r71Var.g3.O(true);
        }
    }

    public static void W(o9 o9Var, org.telegram.ui.Components.t61 t61Var, View view) {
        int i10 = t61Var.d;
        if (i10 == 2) {
            o9Var.h0(true);
            org.telegram.ui.Components.qc I = org.telegram.ui.Components.wc.b0(o9Var).I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasShownTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new r8(o9Var, 0));
            I.j = 5000;
            I.j();
            return;
        }
        if (i10 == 1) {
            o9Var.presentFragment(new h9(a1.g.i("isCall", true), o9Var.getCurrentAccount(), o9Var));
            return;
        }
        Object obj = t61Var.G;
        if (!(obj instanceof k9)) {
            if (view instanceof n9) {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", ((n9) view).c.id);
                o9Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                o9Var.presentFragment(new un(bundle), o9Var.r);
                return;
            }
            return;
        }
        k9 k9Var = (k9) obj;
        ArrayList arrayList = k9Var.c;
        if (o9Var.simpleActionBar.o()) {
            o9Var.b0(arrayList, (j9) view);
            return;
        }
        if (k9Var.a == 0 || arrayList.isEmpty()) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", MessageObject.getDialogId((TLRPC.Message) arrayList.get(0)));
            bundle2.putInt("message_id", ((TLRPC.Message) arrayList.get(0)).id);
            o9Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            o9Var.presentFragment(new un(bundle2), o9Var.r);
            return;
        }
        boolean z10 = k9Var.e;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = k9Var.b;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            hashSet.add(Long.valueOf(((TLRPC.User) obj2).id));
        }
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) arrayList.get(0)).id;
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(o9Var.getParentActivity(), 3, null);
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = o9Var.getMessagesController().conferenceCallSizeLimit;
        e2Var.setOnCancelListener(new t8(o9Var, o9Var.getConnectionsManager().sendRequest(getgroupcall, new s8(o9Var, e2Var, hashSet, tL_inputGroupCallInviteMessage, z10, 0)), 0));
        e2Var.r(600L);
    }

    public static void X(o9 o9Var, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        e2Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            o9Var.getMessagesController().putUsers(groupcall.users, false);
            o9Var.getMessagesController().putChats(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                o9Var.showDialog(new rt(o9Var.getParentActivity(), hashSet));
                return;
            } else {
                org.telegram.ui.Components.voip.g2.g(o9Var.getParentActivity(), o9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
                return;
            }
        }
        if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            o9Var.showDialog(new rt(o9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.wc.b0(o9Var).g0(tL_error, false);
        }
    }

    public static void Y(o9 o9Var, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        e2Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            o9Var.getMessagesController().putUsers(groupcall.users, false);
            o9Var.getMessagesController().putChats(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                o9Var.showDialog(new rt(o9Var.getParentActivity(), hashSet));
                return;
            } else {
                org.telegram.ui.Components.voip.g2.g(o9Var.getParentActivity(), o9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
                return;
            }
        }
        if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            o9Var.showDialog(new rt(o9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.wc.b0(o9Var).g0(tL_error, false);
        }
    }

    public static void a0(o9 o9Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o9Var.getParentActivity());
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        if (z10) {
            e2Var.R = LocaleController.getString(R.string.DeleteAllCalls);
            e2Var.T = LocaleController.getString(R.string.DeleteAllCallsText);
        } else {
            e2Var.R = LocaleController.getString(R.string.DeleteCalls);
            e2Var.T = LocaleController.getString(R.string.DeleteSelectedCallsText);
        }
        boolean[] zArr = {false};
        FrameLayout frameLayout = new FrameLayout(o9Var.getParentActivity());
        org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(o9Var.getParentActivity(), 1);
        y1Var.setBackground(org.telegram.ui.ActionBar.y6.M0(false));
        y1Var.e(LocaleController.getString(R.string.DeleteCallsForEveryone), "", false, false, false);
        y1Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(8.0f), 0);
        frameLayout.addView(y1Var, org.telegram.ui.Components.gb1.h(-1, 48.0f, 51, 8.0f, 0.0f, 8.0f, 0.0f));
        y1Var.setOnClickListener(new p8(0, zArr));
        alertDialog$Builder.o(frameLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new bi.z3(o9Var, z10, zArr, 3));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        o9Var.showDialog(e2Var);
        TextView textView = (TextView) e2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
        }
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [java.io.Serializable, java.lang.Object, java.lang.String[]] */
    public static void i0(final Context context, int i10, TLRPC.InputGroupCall inputGroupCall, String str, final org.telegram.ui.ActionBar.u6 u6Var, boolean z10, final boolean z11) {
        int i11;
        int i12 = org.telegram.ui.ActionBar.y6.h5;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i12, u6Var);
        final org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, context, u6Var, false);
        k3Var.setBackgroundColor(w02);
        k3Var.fixNavigationBar(w02);
        k3Var.setBackgroundColorKey(i12);
        k3Var.fixNavigationBarKey(i12);
        final ?? r12 = {str};
        LinearLayout d = org.telegram.messenger.vh.d(context, 1);
        d.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        d.addView(frameLayout, org.telegram.ui.Components.gb1.x(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, org.telegram.ui.Components.gb1.i(-1, -1, 17));
        int dp = AndroidUtilities.dp(80.0f);
        int i13 = org.telegram.ui.ActionBar.y6.Oh;
        ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(dp, org.telegram.ui.ActionBar.y6.w0(i13, u6Var));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i13);
        frameLayout2.setBackground(K);
        org.telegram.ui.ActionBar.f7.k(frameLayout2, K, N, null, u6Var);
        frameLayout.addView(frameLayout2, org.telegram.ui.Components.gb1.h(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_ab_other);
        int i14 = org.telegram.ui.ActionBar.y6.y6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.f7.t(imageView2, i14, u6Var, mode);
        int i15 = org.telegram.ui.ActionBar.y6.i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i15, u6Var), 1, -1);
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i15);
        imageView2.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(imageView2, g02, null, N2, u6Var);
        if (z11) {
            frameLayout.addView(imageView2, org.telegram.ui.Components.gb1.h(56, 56.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i16 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.Components.z90 K2 = org.telegram.ui.Components.gb1.K(context, 20.0f, i16, true, u6Var);
        K2.setText(LocaleController.getString(R.string.GroupCallCreatedLinkTitle));
        K2.setGravity(17);
        d.addView(K2, org.telegram.ui.Components.gb1.x(-1, -2, 17, 32, 16, 32, 8));
        org.telegram.ui.Components.z90 K3 = org.telegram.ui.Components.gb1.K(context, 14.0f, i16, false, u6Var);
        K3.setText(LocaleController.getString(R.string.GroupCallCreatedLinkText));
        K3.setGravity(17);
        K3.setMaxWidth(fi.v3.a(K3.getText(), K3.getPaint()));
        d.addView(K3, org.telegram.ui.Components.gb1.x(-1, -2, 17, 32, 0, 32, 18));
        String substring = str.startsWith("https://") ? str.substring(8) : str;
        final FrameLayout frameLayout3 = new FrameLayout(context);
        org.telegram.ui.Components.gb1.c(frameLayout3, 0.01f, 1.2f);
        int i17 = org.telegram.ui.ActionBar.y6.a7;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.y6.a0(org.telegram.ui.ActionBar.y6.w0(i17, u6Var), org.telegram.ui.ActionBar.y6.v(org.telegram.ui.ActionBar.y6.w0(i17, u6Var), org.telegram.ui.ActionBar.y6.w0(i15, u6Var)), 12, 12);
        org.telegram.ui.ActionBar.b7 N3 = org.telegram.ui.ActionBar.f7.N(i17);
        org.telegram.ui.ActionBar.b7 q5 = org.telegram.ui.ActionBar.f7.q(i17, i15);
        frameLayout3.setBackground(a02);
        org.telegram.ui.ActionBar.f7.k(frameLayout3, a02, N3, q5, u6Var);
        d.addView(frameLayout3, org.telegram.ui.Components.gb1.x(-1, -2, 7, 16, 0, 16, 0));
        org.telegram.ui.Components.z90 K4 = org.telegram.ui.Components.gb1.K(context, 13.0f, i16, false, u6Var);
        K4.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
        K4.setText(substring);
        frameLayout3.addView(K4, org.telegram.ui.Components.gb1.h(-1, -1.0f, 119, 0.0f, 0.0f, 30.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        imageView3.setScaleType(scaleType);
        org.telegram.ui.ActionBar.f7.t(imageView3, org.telegram.ui.ActionBar.y6.r5, u6Var, mode);
        frameLayout3.addView(imageView3, org.telegram.ui.Components.gb1.i(40, 48, 21));
        LinearLayout d10 = org.telegram.messenger.vh.d(context, 0);
        d.addView(d10, org.telegram.ui.Components.gb1.o(16.0f, 12.0f, 16.0f, 0.0f, -1, -2));
        fi.d dVar = new fi.d(context, u6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c ");
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkCopy));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.zq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
        dVar.i(spannableStringBuilder, false, true);
        d10.addView(dVar, org.telegram.ui.Components.gb1.t(-1, 48, 1.0f, 51, 0, 0, 6, 0));
        fi.d dVar2 = new fi.d(context, u6Var, true);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c ");
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkShare));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.zq(R.drawable.msg_share_filled, 0), 0, 1, 33);
        dVar2.i(spannableStringBuilder2, false, true);
        d10.addView(dVar2, org.telegram.ui.Components.gb1.t(-1, 48, 1.0f, 51, 6, 0, 0, 0));
        org.telegram.ui.ActionBar.k3[] k3VarArr = new org.telegram.ui.ActionBar.k3[1];
        if (z10) {
            e9 e9Var = new e9(context, u6Var);
            e9Var.setGravity(17);
            org.telegram.ui.ActionBar.f7.V(e9Var, org.telegram.ui.ActionBar.y6.z6, u6Var);
            e9Var.setText(" " + LocaleController.getString(R.string.GroupCallCreatedLinkJoinOr) + " ");
            e9Var.setTextSize(14.0f);
            d.addView(e9Var, org.telegram.ui.Components.gb1.x(190, -2, 1, 28, 12, 28, 8));
            i11 = i10;
            g4 g4Var = new g4(str, i11, k3VarArr, 1);
            org.telegram.ui.Components.z90 K5 = org.telegram.ui.Components.gb1.K(context, 14.0f, i16, false, u6Var);
            K5.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GroupCallCreatedLinkJoinText), g4Var), true));
            K5.setGravity(17);
            K5.setMaxWidth(fi.v3.a(K5.getText(), K5.getPaint()));
            d.addView(K5, org.telegram.ui.Components.gb1.x(-1, -2, 17, 32, 8, 32, 12));
            org.telegram.ui.Components.gb1.c(K5, 0.05f, 1.2f);
            K5.setOnClickListener(new a(g4Var, 8));
        } else {
            i11 = i10;
        }
        k3Var.customView = d;
        k3Var.show();
        k3VarArr[0] = k3Var;
        final int i18 = 0;
        frameLayout3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.w8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.Components.wc wcVar;
                int i19;
                switch (i18) {
                    case 0:
                        AndroidUtilities.addToClipboard(r12[0]);
                        wcVar = new org.telegram.ui.Components.wc(k3Var.topBulletinContainer, u6Var);
                        i19 = R.string.LinkCopied;
                        break;
                    default:
                        AndroidUtilities.addToClipboard(r12[0]);
                        wcVar = new org.telegram.ui.Components.wc(k3Var.topBulletinContainer, u6Var);
                        i19 = R.string.LinkCopied;
                        break;
                }
                org.telegram.messenger.vh.m(i19, wcVar);
            }
        });
        final int i19 = 1;
        dVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.w8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.Components.wc wcVar;
                int i192;
                switch (i19) {
                    case 0:
                        AndroidUtilities.addToClipboard(r12[0]);
                        wcVar = new org.telegram.ui.Components.wc(k3Var.topBulletinContainer, u6Var);
                        i192 = R.string.LinkCopied;
                        break;
                    default:
                        AndroidUtilities.addToClipboard(r12[0]);
                        wcVar = new org.telegram.ui.Components.wc(k3Var.topBulletinContainer, u6Var);
                        i192 = R.string.LinkCopied;
                        break;
                }
                org.telegram.messenger.vh.m(i192, wcVar);
            }
        });
        final ig.d1 d1Var = new ig.d1(inputGroupCall, i11, r12, frameLayout3, K4, k3Var, u6Var, 4);
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.x8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.k3 k3Var2 = org.telegram.ui.ActionBar.k3.this;
                org.telegram.ui.ActionBar.h3 h3Var = k3Var2.container;
                org.telegram.ui.ActionBar.u6 u6Var2 = u6Var;
                org.telegram.ui.Components.k80 F = org.telegram.ui.Components.k80.F(h3Var, u6Var2, frameLayout3);
                int i20 = R.drawable.msg_copy;
                String string = LocaleController.getString(R.string.Copy);
                String[] strArr = r12;
                F.c(i20, string, new q1(strArr, k3Var2, u6Var2, 7), false);
                F.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new org.telegram.messenger.voip.m0(17, context, strArr), false);
                F.m(R.drawable.msg_delete, d1Var, LocaleController.getString(R.string.RevokeLink), z11, true);
                F.Z();
            }
        });
        dVar2.setOnClickListener(new di.e0(context, str, r12, u6Var, k3Var, 6));
        if (z11) {
            imageView2.setOnClickListener(new di.c4(k3Var, u6Var, imageView2, d1Var, 5));
        }
    }

    @Override // org.telegram.ui.ActionBar.r2, org.telegram.ui.og0
    public final boolean T(MotionEvent motionEvent, boolean z10) {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.r7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.il));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.c7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
    }

    public final void b0(ArrayList arrayList, j9 j9Var) {
        if (arrayList.isEmpty()) {
            return;
        }
        boolean g02 = g0(arrayList);
        ArrayList arrayList2 = this.G;
        if (g02) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList2.remove(Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).id));
            }
            org.telegram.ui.Components.zp zpVar = j9Var.e;
            if (zpVar != null) {
                zpVar.a(false, true);
            }
            j0();
            return;
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Integer valueOf = Integer.valueOf(((TLRPC.Message) arrayList.get(i11)).id);
            if (!arrayList2.contains(valueOf)) {
                arrayList2.add(valueOf);
            }
        }
        org.telegram.ui.Components.zp zpVar2 = j9Var.e;
        if (zpVar2 != null) {
            zpVar2.a(true, true);
        }
        j0();
    }

    public final void c0() {
        this.f.setTranslationY(((-this.R) - this.P) - this.Q);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        int i11 = 0;
        if (!this.s) {
            this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
        }
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.Calls));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bh.m(this, 27));
        org.telegram.ui.ActionBar.y5 a2 = this.simpleActionBar.j().a(10, R.drawable.ic_ab_other);
        this.v = a2;
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.ActionBar.g1 e = this.v.e(3, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAllCalls));
        int i12 = org.telegram.ui.ActionBar.y6.p7;
        e.d(getThemedColor(i12), getThemedColor(i12));
        org.telegram.ui.Components.r71 r71Var = new org.telegram.ui.Components.r71(this, new e5(this, i10), new z8(this), new z8(this));
        this.c = r71Var;
        r71Var.setCaptureSectionsDecoratorAllowed(true);
        this.c.u1();
        this.c.setSectionsDrawBackground(true);
        this.c.g3.r = false;
        a9 a9Var = new a9(this, context, i11);
        this.n = a9Var;
        this.fragmentView = a9Var;
        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, null);
        this.h = c10Var;
        c10Var.setViewType(8);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.a7, this.h, null);
        this.h.w = false;
        this.a = new l9(this, context, this.h);
        this.c.setClipToPadding(false);
        this.c.setEmptyView(this.a);
        org.telegram.ui.Components.r71 r71Var2 = this.c;
        s4.c0 c0Var = new s4.c0(1, false);
        this.b = c0Var;
        r71Var2.setLayoutManager(c0Var);
        this.c.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        org.telegram.ui.Components.pl0 pl0Var = new org.telegram.ui.Components.pl0(this.c, this.b);
        this.e = pl0Var;
        oi.q qVar = this.glassEngine;
        Objects.requireNonNull(qVar);
        pl0Var.h = new y0(qVar, 12);
        this.n.addView(this.c, org.telegram.ui.Components.gb1.i(-1, -1, 3));
        this.n.addView(this.a, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        View view = new View(context);
        this.d = view;
        view.setBackground(getBaseSimpleGlass().a(this.d));
        this.n.addView(this.d, org.telegram.ui.Components.gb1.i(-1, 0, 48));
        this.c.setOnScrollListener(new b9(this));
        if (this.x) {
            this.a.a();
        } else {
            this.a.b();
        }
        org.telegram.ui.Components.j20 j20Var = new org.telegram.ui.Components.j20(context, this.resourceProvider, false);
        this.f = j20Var;
        j20Var.c.setImageResource(R.drawable.filled_calls_plus);
        this.f.setContentDescription(LocaleController.getString(R.string.Call));
        this.f.setOnClickListener(new q8(this, i10));
        this.n.addView(this.f, org.telegram.ui.Components.j20.b());
        org.telegram.ui.Components.ws wsVar = new org.telegram.ui.Components.ws(context);
        this.H = wsVar;
        wsVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        this.H.setOnAnimatedHeightChangedListener(new r8(this, 1));
        org.telegram.ui.Components.ws wsVar2 = this.H;
        eh.d c10 = getBaseSimpleGlass().c.c(this.H, null, false);
        c10.v(gh.c.o(this.resourceProvider));
        c10.x(AndroidUtilities.dp(24.0f));
        c10.w(AndroidUtilities.dp(7.0f));
        wsVar2.setBlurredBackground(c10);
        FrameLayout frameLayout = new FrameLayout(context);
        this.I = frameLayout;
        this.H.addView(frameLayout);
        this.H.i(this.I, true, false);
        c9 c9Var = new c9(this, context, this, this.n, this.resourceProvider);
        this.J = c9Var;
        this.I.addView(c9Var);
        this.H.setCallFragmentContextView(this.J);
        this.n.addView(this.H, org.telegram.ui.Components.gb1.h(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        this.n.addView(this.simpleActionBar);
        setBulletinDelegate(new d9(this, i11));
        if (this.s) {
            View view2 = this.fragmentView;
            z8 z8Var = new z8(this);
            WeakHashMap weakHashMap = r0.i0.a;
            r0.a0.i(view2, z8Var);
        }
        return this.fragmentView;
    }

    public final void d0() {
        org.telegram.ui.Components.r71 r71Var = this.c;
        i0.b bVar = this.mSystemInsets;
        oi.a.d(r71Var, bVar.b, bVar.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((int) this.H.c(AndroidUtilities.dp(7.0f))), this.O);
        this.d.getLayoutParams().height = this.simpleActionBar.getExtraHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.b + ((int) this.H.c(AndroidUtilities.dp(7.0f)));
        ((ViewGroup.MarginLayoutParams) this.H.getLayoutParams()).topMargin = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.b) - AndroidUtilities.dp(19.0f);
        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.b;
        this.a.setPadding(0, 0, 0, this.R + this.O);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x00d4  */
    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Long l4;
        org.telegram.ui.Components.r71 r71Var;
        int i12;
        TLRPC.User user;
        int i13;
        ArrayList arrayList;
        k9 k9Var;
        int i14 = NotificationCenter.didReceiveNewMessages;
        int i15 = 2;
        ArrayList arrayList2 = this.w;
        if (i10 != i14) {
            if (i10 == NotificationCenter.messagesDeleted) {
                if (this.y && !((Boolean) objArr[2]).booleanValue()) {
                    ArrayList arrayList3 = (ArrayList) objArr[0];
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        k9 k9Var2 = (k9) it.next();
                        Iterator it2 = k9Var2.c.iterator();
                        while (it2.hasNext()) {
                            if (arrayList3.contains(Integer.valueOf(((TLRPC.Message) it2.next()).id))) {
                                it2.remove();
                                r4 = 1;
                            }
                        }
                        if (k9Var2.c.isEmpty()) {
                            it.remove();
                        }
                    }
                    if (r4 == 0 || (r71Var = this.c) == null) {
                        return;
                    }
                    r71Var.g3.O(true);
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.activeGroupCallsUpdated) {
                this.F = getMessagesController().getActiveGroupCalls();
                org.telegram.ui.Components.r71 r71Var2 = this.c;
                if (r71Var2 != null) {
                    r71Var2.g3.O(true);
                    return;
                }
                return;
            }
            if (i10 != NotificationCenter.chatInfoDidLoad) {
                if (i10 == NotificationCenter.groupCallUpdated && (l4 = this.M) != null && l4.equals((Long) objArr[0])) {
                    org.telegram.ui.Components.voip.g2.l(this.L, null, false, null, getParentActivity(), this, getAccountInstance());
                    this.M = null;
                    return;
                }
                return;
            }
            Long l10 = this.M;
            if (l10 == null || ((TLRPC.ChatFull) objArr[0]).id != l10.longValue() || getMessagesController().getGroupCall(this.M.longValue(), true) == null) {
                return;
            }
            org.telegram.ui.Components.voip.g2.l(this.L, null, false, null, getParentActivity(), this, getAccountInstance());
            this.M = null;
            return;
        }
        if (this.y && !((Boolean) objArr[2]).booleanValue()) {
            ArrayList arrayList4 = (ArrayList) objArr[1];
            int size = arrayList4.size();
            int i16 = 0;
            while (i16 < size) {
                Object obj = arrayList4.get(i16);
                int i17 = i16 + 1;
                MessageObject messageObject = (MessageObject) obj;
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (messageAction instanceof TLRPC.TL_messageActionPhoneCall) {
                    long fromChatId = messageObject.getFromChatId();
                    long j10 = fromChatId == getUserConfig().getClientUserId() ? messageObject.messageOwner.peer_id.user_id : fromChatId;
                    int i18 = fromChatId == getUserConfig().getClientUserId() ? 0 : 1;
                    TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = messageObject.messageOwner.action.reason;
                    if (i18 == 1 && ((phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) || (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) {
                        i18 = i15;
                    }
                    if (i18 != 0 || (!(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) && !(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) {
                        r12 = i18;
                    }
                    if (!arrayList2.isEmpty()) {
                        k9 k9Var3 = (k9) arrayList2.get(0);
                        ArrayList arrayList5 = k9Var3.b;
                        if (arrayList5.size() == 1) {
                            i12 = i17;
                            if (((TLRPC.User) arrayList5.get(0)).id == j10 && k9Var3.d == r12) {
                                k9Var3.c.add(0, messageObject.messageOwner);
                                i16 = i12;
                            }
                            k9 k9Var4 = new k9();
                            ArrayList arrayList6 = k9Var4.c;
                            arrayList6.clear();
                            arrayList6.add(messageObject.messageOwner);
                            ArrayList arrayList7 = k9Var4.b;
                            arrayList7.clear();
                            user = getMessagesController().getUser(Long.valueOf(j10));
                            if (user != null) {
                                arrayList7.add(user);
                            }
                            k9Var4.d = r12;
                            k9Var4.e = messageObject.isVideoCall();
                            arrayList2.add(0, k9Var4);
                            this.c.g3.O(true);
                            i13 = i15;
                        }
                    }
                    i12 = i17;
                    k9 k9Var42 = new k9();
                    ArrayList arrayList62 = k9Var42.c;
                    arrayList62.clear();
                    arrayList62.add(messageObject.messageOwner);
                    ArrayList arrayList72 = k9Var42.b;
                    arrayList72.clear();
                    user = getMessagesController().getUser(Long.valueOf(j10));
                    if (user != null) {
                    }
                    k9Var42.d = r12;
                    k9Var42.e = messageObject.isVideoCall();
                    arrayList2.add(0, k9Var42);
                    this.c.g3.O(true);
                    i13 = i15;
                } else {
                    i12 = i17;
                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                        long fromChatId2 = messageObject.getFromChatId();
                        Set<Long> set = (Set) Collection.-EL.stream(tL_messageActionConferenceCall.other_participants).map(new k2.g(1)).collect(Collectors.toSet());
                        set.add(Long.valueOf(fromChatId2 == getUserConfig().getClientUserId() ? messageObject.messageOwner.peer_id.user_id : fromChatId2));
                        int i19 = fromChatId2 == getUserConfig().getClientUserId() ? 0 : 1;
                        if (i19 == 1 && tL_messageActionConferenceCall.missed) {
                            i19 = i15;
                        }
                        r12 = (i19 == 0 && tL_messageActionConferenceCall.missed) ? 3 : i19;
                        if (arrayList2.isEmpty()) {
                            i13 = i15;
                            arrayList = arrayList2;
                        } else {
                            int i20 = 0;
                            while (true) {
                                if (i20 >= arrayList2.size()) {
                                    i13 = i15;
                                    arrayList = arrayList2;
                                    k9Var = null;
                                    break;
                                }
                                k9Var = (k9) arrayList2.get(i20);
                                i13 = i15;
                                arrayList = arrayList2;
                                if (k9Var.a == tL_messageActionConferenceCall.call_id) {
                                    break;
                                }
                                i20++;
                                i15 = i13;
                                arrayList2 = arrayList;
                            }
                            if (k9Var != null) {
                                ArrayList arrayList8 = k9Var.b;
                                k9Var.c.add(0, messageObject.messageOwner);
                                for (Long l11 : set) {
                                    long longValue = l11.longValue();
                                    int size2 = arrayList8.size();
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 < size2) {
                                            Object obj2 = arrayList8.get(i21);
                                            i21++;
                                            if (longValue == ((TLRPC.User) obj2).id) {
                                                break;
                                            }
                                        } else {
                                            TLRPC.User user2 = getMessagesController().getUser(l11);
                                            if (user2 != null) {
                                                arrayList8.add(user2);
                                            }
                                        }
                                    }
                                }
                                this.c.g3.O(true);
                                i16 = i12;
                                i15 = i13;
                                arrayList2 = arrayList;
                            }
                        }
                        k9 k9Var5 = new k9();
                        k9Var5.a = tL_messageActionConferenceCall.call_id;
                        ArrayList arrayList9 = k9Var5.c;
                        arrayList9.clear();
                        arrayList9.add(messageObject.messageOwner);
                        ArrayList arrayList10 = k9Var5.b;
                        arrayList10.clear();
                        for (Long l12 : set) {
                            l12.getClass();
                            TLRPC.User user3 = getMessagesController().getUser(l12);
                            if (user3 != null) {
                                arrayList10.add(user3);
                            }
                        }
                        k9Var5.d = r12;
                        k9Var5.e = messageObject.isVideoCall();
                        arrayList2 = arrayList;
                        arrayList2.add(0, k9Var5);
                        this.c.g3.O(true);
                    } else {
                        i13 = i15;
                    }
                }
                i16 = i12;
                i15 = i13;
            }
            org.telegram.ui.ActionBar.y5 y5Var = this.v;
            if (y5Var != null) {
                y5Var.setVisibility(arrayList2.isEmpty() ? 8 : 0);
            }
        }
    }

    public final void e0(int i10, int i11) {
        if (this.x) {
            return;
        }
        this.x = true;
        l9 l9Var = this.a;
        if (l9Var != null && !this.y) {
            l9Var.a();
        }
        org.telegram.ui.Components.r71 r71Var = this.c;
        if (r71Var != null) {
            r71Var.g3.O(true);
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i11;
        tL_messages_search.peer = new TLRPC.TL_inputPeerEmpty();
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhoneCalls();
        tL_messages_search.q = "";
        tL_messages_search.offset_id = i10;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new l(this, 1), 2), this.classGuid);
    }

    public final void f0(boolean z10) {
        org.telegram.ui.Components.zp zpVar;
        this.simpleActionBar.n();
        this.G.clear();
        int childCount = this.c.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.c.getChildAt(i10);
            if ((childAt instanceof j9) && (zpVar = ((j9) childAt).e) != null) {
                zpVar.a(false, z10);
            }
        }
        this.c.g3.O(true);
    }

    public final boolean g0(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.G.contains(Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).id))) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.c, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.h6));
        org.telegram.ui.Components.j20 j20Var = this.f;
        if (j20Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h7(j20Var.c, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.f.c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.f.c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Q9));
        }
        return arrayList;
    }

    public final void h0(boolean z10) {
        if (z10 == getUserConfig().showCallsTab) {
            return;
        }
        getUserConfig().setShowCallsTab(z10);
        this.c.g3.O(true);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        boolean z10;
        boolean o10 = this.simpleActionBar.o();
        ArrayList arrayList = this.G;
        if (o10) {
            z10 = true;
            if (arrayList.isEmpty()) {
                f0(true);
                return;
            }
        } else {
            org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
            if (r5Var.e == null) {
                r5Var.h().c(2, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
            }
            this.simpleActionBar.x();
            z10 = false;
        }
        this.simpleActionBar.t(arrayList.size(), z10);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        if (!this.simpleActionBar.o()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        f0(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        e0(0, 50);
        this.F = getMessagesController().getActiveGroupCalls();
        NotificationCenter.ObserversGroup observersGroup = this.N;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.N = null;
        }
        this.N = getNotificationCenter().createObserversGroup(this).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messagesDeleted).add(NotificationCenter.activeGroupCallsUpdated).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.groupCallUpdated);
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.r = bundle.getBoolean("needFinishFragment", true);
            this.s = this.arguments.getBoolean("hasMainTabs", false);
        }
        this.O = this.s ? AndroidUtilities.dp(72.0f) : 0;
        this.P = this.s ? AndroidUtilities.dp(64.0f) : 0;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        NotificationCenter.ObserversGroup observersGroup = this.N;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.N = null;
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.R = i13;
        d0();
        c0();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        boolean z10;
        if (i10 == 101 || i10 == 102 || i10 == 103) {
            int length = iArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z10 = true;
                    break;
                } else {
                    if (iArr[i11] != 0) {
                        z10 = false;
                        break;
                    }
                    i11++;
                }
            }
            if (iArr.length <= 0 || !z10) {
                org.telegram.ui.Components.voip.g2.h(getParentActivity(), null, i10);
            } else if (i10 == 103) {
                org.telegram.ui.Components.voip.g2.l(this.L, null, false, null, getParentActivity(), this, getAccountInstance());
            } else {
                TLRPC.UserFull userFull = this.K != null ? getMessagesController().getUserFull(this.K.id) : null;
                org.telegram.ui.Components.voip.g2.m(this.K, i10 == 102, i10 == 102 || (userFull != null && userFull.video_calls_available), getParentActivity(), null, getAccountInstance());
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.r71 r71Var = this.c;
        if (r71Var != null) {
            r71Var.g3.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.r71 r71Var = this.c;
            if (r71Var != null) {
                int childCount = r71Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = this.c.getChildAt(i10);
                    if (childAt instanceof j9) {
                        ((j9) childAt).d.t(0);
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.og0
    public final void s() {
        if (this.b.L0() < 15) {
            this.c.y0(0);
            return;
        }
        org.telegram.ui.Components.pl0 pl0Var = this.e;
        pl0Var.b = 1;
        pl0Var.c(0, 0, false, false);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useFadeDrawableForActionBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // org.telegram.ui.og0
    public final hh.d y() {
        return null;
    }

    public o9(Bundle bundle) {
        super(bundle);
        this.r = true;
        this.w = new ArrayList();
        this.G = new ArrayList();
    }

    @Override // org.telegram.ui.og0
    public final /* synthetic */ void D() {
    }
}
